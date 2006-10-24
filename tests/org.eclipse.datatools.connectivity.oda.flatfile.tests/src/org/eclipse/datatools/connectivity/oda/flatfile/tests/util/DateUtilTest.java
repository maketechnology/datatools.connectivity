/*******************************************************************************
 * Copyright (c) 2004 Actuate Corporation.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *  Actuate Corporation  - initial API and implementation
 *******************************************************************************/

package org.eclipse.datatools.connectivity.oda.flatfile.tests.util;

import java.math.BigDecimal;
import java.util.Date;
import java.util.GregorianCalendar;

import org.eclipse.datatools.connectivity.oda.OdaException;
import org.eclipse.datatools.connectivity.oda.flatfile.util.DateUtil;

import junit.framework.TestCase;

import com.ibm.icu.util.Calendar;
import com.ibm.icu.util.TimeZone;

/**
 * 
 * Test case for DateUtil
 */
public class DateUtilTest extends TestCase
{

	public Object[] testObject;
	public Object[] resultDate;

	/*
	 * @see TestCase#setUp()
	 */
	protected void setUp( ) throws Exception
	{
		super.setUp( );
		// input Data
		testObject = new Object[]{
				new Integer( 1 ),
				new Integer( 0 ),
				BigDecimal.valueOf( Integer.MAX_VALUE ),
				BigDecimal.valueOf( Integer.MAX_VALUE + 1 ),
				BigDecimal.valueOf( Integer.MIN_VALUE ),
				BigDecimal.valueOf( Integer.MIN_VALUE - 1 ),
				BigDecimal.valueOf( 0l ),
				Boolean.valueOf( true ),
				Boolean.valueOf( false ),
				( new GregorianCalendar( 2004 + 1900, 1, 1 ) ).getTime( ),
				Double.valueOf( "1.1" ),
				Double.valueOf( "0" ),
				null,
				"testString",
				"12345",
				"10/11/2005",
				"10/11/2005 2:30 am",
				"10/11/2005 2:25:46 pm"
		};

		resultDate = new Object[]{
				new Exception( "" ),
				new Exception( "" ),
				new Exception( "" ),
				new Exception( "" ),
				new Exception( "" ),
				new Exception( "" ),
				new Exception( "" ),
				new Exception( "" ),
				new Exception( "" ),
				( new GregorianCalendar( 2004 + 1900, 1, 1 ) ).getTime( ),
				new Exception( "" ),
				new Exception( "" ),
				null,
				new Exception( "" ),
				new Exception( "" ),
				( new GregorianCalendar( 2005, 10 - 1, 11 ) ).getTime( ),
				( new GregorianCalendar( 2005, 10 - 1, 11, 2, 30 ) ).getTime( ),
				( new GregorianCalendar( 2005, 10 - 1, 11, 14, 25, 46 ) ).getTime( )
		};

	}

	/*
	 * @see TestCase#tearDown()
	 */
	protected void tearDown( ) throws Exception
	{
		testObject = null;
		super.tearDown( );
	}

	public void testToDate( )
	{
		Date result;
		for ( int i = 0; i < testObject.length; i++ )
		{
			try
			{
				result = DateUtil.toDate( testObject[i] );
				if ( resultDate[i] instanceof Exception )
					fail( "Should throw Exception." );

				assertEquals( result, resultDate[i] );

			}
			catch ( OdaException e )
			{
				if ( !( resultDate[i] instanceof Exception ) )
					fail( "Should not throw Exception." );
			}

		}
	}

	public void testToDate1( )
	{
		String[] testStrings = {
				"1997",
				"1997-07",
				"1997-07-16",
				"1997-07-16T19:20+02:00",
				"1997-07-16T19:20:30+01:00",
				"1997-07-16T19:20:30.45+01:00",
				"1997-07-16 19:20+01:00",
				"1997-07-16 19:20:30+01:00",
				"1997-07-16 19:20:30.45+01:00"
		};
		Calendar calendar = Calendar.getInstance( TimeZone.getTimeZone( "GMT + 0" ) );

		Date[] resultDates = {
				new Date( 97, 0, 1 ),
				new Date( 97, 6, 1 ),
				new Date( 97, 6, 16 ),
				null,
				null,
				null,
				null,
				null,
				null
		};
		calendar.clear( );
		calendar.set( 1997, 6, 16, 17, 20, 0 );
		resultDates[3] = calendar.getTime( );
		calendar.set( 1997, 6, 16, 18, 20, 30 );
		resultDates[4] = calendar.getTime( );
		calendar.set( 1997, 6, 16, 18, 20, 30 );
		calendar.set( Calendar.MILLISECOND, 450 );
		resultDates[5] = calendar.getTime( );
		calendar.set( 1997, 6, 16, 18, 20, 0 );
		calendar.set( Calendar.MILLISECOND, 0 );
		resultDates[6] = calendar.getTime( );
		calendar.set( 1997, 6, 16, 18, 20, 30 );
		resultDates[7] = calendar.getTime( );
		calendar.set( 1997, 6, 16, 18, 20, 30 );
		calendar.set( Calendar.MILLISECOND, 450 );
		resultDates[8] = calendar.getTime( );

		for ( int i = 0; i < testStrings.length; i++ )
		{
			try
			{
				Date dateResult = DateUtil.toDate( testStrings[i] );

				assertEquals( dateResult, resultDates[i] );
			}
			catch ( OdaException e )
			{
				fail( "Should not throw Exception." );
			}

		}
	}

}