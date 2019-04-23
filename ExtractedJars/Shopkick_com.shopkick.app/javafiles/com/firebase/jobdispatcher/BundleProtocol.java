// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.firebase.jobdispatcher;


final class BundleProtocol
{

	BundleProtocol()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #70  <Method void Object()>
	//    2    4:return          
	}

	static final String PACKED_PARAM_BUNDLE_PREFIX = "com.firebase.jobdispatcher.";
	static final String PACKED_PARAM_CONSTRAINTS = "constraints";
	static final String PACKED_PARAM_CONTENT_URI_ARRAY = "content_uri_array";
	static final String PACKED_PARAM_CONTENT_URI_FLAGS_ARRAY = "content_uri_flags_array";
	static final String PACKED_PARAM_EXTRAS = "extras";
	static final String PACKED_PARAM_LIFETIME = "persistent";
	static final String PACKED_PARAM_OBSERVED_URI = "observed_uris";
	static final String PACKED_PARAM_RECURRING = "recurring";
	static final String PACKED_PARAM_REPLACE_CURRENT = "replace_current";
	static final String PACKED_PARAM_RETRY_STRATEGY_INITIAL_BACKOFF_SECONDS = "initial_backoff_seconds";
	static final String PACKED_PARAM_RETRY_STRATEGY_MAXIMUM_BACKOFF_SECONDS = "maximum_backoff_seconds";
	static final String PACKED_PARAM_RETRY_STRATEGY_POLICY = "retry_policy";
	static final String PACKED_PARAM_SERVICE = "service";
	static final String PACKED_PARAM_TAG = "tag";
	static final String PACKED_PARAM_TRIGGERED_URIS = "triggered_uris";
	static final String PACKED_PARAM_TRIGGER_TYPE = "trigger_type";
	static final String PACKED_PARAM_TRIGGER_WINDOW_END = "window_end";
	static final String PACKED_PARAM_TRIGGER_WINDOW_START = "window_start";
	static final int TRIGGER_TYPE_CONTENT_URI = 3;
	static final int TRIGGER_TYPE_EXECUTION_WINDOW = 1;
	static final int TRIGGER_TYPE_IMMEDIATE = 2;
}
