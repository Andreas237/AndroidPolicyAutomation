// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.samsung.android.sdk.health.sensor;


public interface PrivilegeSensorConstants
{
	public static interface BloodGlucoseSampleType
	{

		public static final int NOT_DEFINED = -1;
		public static final int PLASMA = 0x15f92;
		public static final int SERUM = 0x15f93;
		public static final int WHOLE_BLOOD = 0x15f91;
	}

	public static interface BloodGlucosetUnit
	{

		public static final int MGDL = 0x222e1;
		public static final int MMOLL = 0x222e2;
		public static final int NOT_DEFINED = -1;
	}

	public static interface TemperatureType
	{

		public static final int BABY = 0x11173;
		public static final int BASAL_BODY_TEMPERATURE = 0x11172;
		public static final int BODY_TEMPERATURE = 0x11171;
		public static final int NOT_DEFINED = -1;
	}

	public static interface TemperatureUnit
	{

		public static final int CELCIUS = 0x27101;
		public static final int FARENHEIT = 0x27102;
		public static final int NOT_DEFINED = -1;
	}


	public static final int BLOOD_GLUCOSE = 10004;
	public static final int BODY_TEMPERATURE = 10006;
	public static final int CONNECTIVITY_TYPE_ALL = 0;
	public static final int CONNECTIVITY_TYPE_INTERNAL = 1;
	public static final int DATA_TYPE_ALL = 0;
	public static final int DATA_TYPE_BLOODGLUCOSE = 3;
	public static final int DATA_TYPE_BODYTEMPERATURE = 7;
	public static final int DATA_TYPE_ELECTROCARDIOGRAM = 4;
	public static final int DATA_TYPE_HEARTRATEMONITOR = 1;
	public static final int DATA_TYPE_PULSEOXIMETER = 2;
	public static final int DEVICE_TYPE_ALL = 0;
	public static final String ECG_ELECTROWAVE = "ecg_electrowave";
	public static final String ECG_HEARTRATE = "ecg_heartrate";
	public static final String ECG_TIME = "ecg_time";
	public static final int ELECTROCARDIOGRAM = 10025;
	public static final String GLUCOSE = "glucose";
	public static final String GLUCOSE_ERROR_DETAIL = "glucose_error_detail";
	public static final String GLUCOSE_SENSOR_STATE = "glucose_sensor_state";
	public static final String GLUCOSE_UNIT = "glucose_unit";
	public static final String HEART_RATE = "heart_rate";
	public static final String HEART_RATE_INTERVAL = "heart_rate_interval";
	public static final int HEART_RATE_MONITOR = 10008;
	public static final String HEART_RATE_SNR = "heart_rate_snr";
	public static final String HEART_RATE_UNIT = "heart_rate_unit";
	public static final int MAX_CONNECTIVITY = 2;
	public static final int MIN_CONNECTIVITY = 0;
	public static final int PULSEOXIMETER = 10026;
	public static final String PULSE_OXIMETRY = "pulse_oximetry";
	public static final String SAMPLE_TYPE = "sample_type";
	public static final String TEMPERATURE = "temperature";
	public static final String TEMPERATURE_TYPE = "temperature_type";
	public static final String TEMPERATURE_UNIT = "temperature_unit";
	public static final String TIME_STAMP = "time_stamp";
}
