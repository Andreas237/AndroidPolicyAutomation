// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.common.internal;


public final class ServiceSpecificExtraArgs
{
	public static interface CastExtraArgs
	{

		public static final String LISTENER = "listener";
	}

	public static interface GamesExtraArgs
	{

		public static final String DESIRED_LOCALE = "com.google.android.gms.games.key.desiredLocale";
		public static final String GAME_PACKAGE_NAME = "com.google.android.gms.games.key.gamePackageName";
		public static final String SIGNIN_OPTIONS = "com.google.android.gms.games.key.signInOptions";
		public static final String WINDOW_TOKEN = "com.google.android.gms.games.key.popupWindowToken";
	}

	public static interface PlusExtraArgs
	{

		public static final String PLUS_AUTH_PACKAGE = "auth_package";
	}


	private ServiceSpecificExtraArgs()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #17  <Method void Object()>
	//    2    4:return          
	}
}
