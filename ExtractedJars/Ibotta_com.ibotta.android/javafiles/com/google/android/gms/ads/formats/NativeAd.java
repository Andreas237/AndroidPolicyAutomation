// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.ads.formats;

import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import java.util.List;

public abstract class NativeAd
{
	public static abstract class AdChoicesInfo
	{

		public abstract List getImages();

		public abstract CharSequence getText();

		public AdChoicesInfo()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #11  <Method void Object()>
		//    2    4:return          
		}
	}

	public static abstract class Image
	{

		public abstract Drawable getDrawable();

		public abstract double getScale();

		public abstract Uri getUri();

		public Image()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #11  <Method void Object()>
		//    2    4:return          
		}
	}


	public NativeAd()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #18  <Method void Object()>
	//    2    4:return          
	}

	public abstract void performClick(Bundle bundle);

	public abstract boolean recordImpression(Bundle bundle);

	public abstract void reportTouchEvent(Bundle bundle);

	protected abstract Object zzbe();

	public static final String ASSET_ADCHOICES_CONTAINER_VIEW = "1098";
}
