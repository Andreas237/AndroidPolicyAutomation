// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.media;

import android.graphics.Bitmap;
import android.media.MediaDescription;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;

class MediaDescriptionCompatApi21
{
	static class Builder
	{

		public static Object build(Object obj)
		{
			return ((Object) (((android.media.MediaDescription.Builder)obj).build()));
		//    0    0:aload_0         
		//    1    1:checkcast       #16  <Class android.media.MediaDescription$Builder>
		//    2    4:invokevirtual   #19  <Method MediaDescription android.media.MediaDescription$Builder.build()>
		//    3    7:areturn         
		}

		public static Object newInstance()
		{
			return ((Object) (new android.media.MediaDescription.Builder()));
		//    0    0:new             #16  <Class android.media.MediaDescription$Builder>
		//    1    3:dup             
		//    2    4:invokespecial   #22  <Method void android.media.MediaDescription$Builder()>
		//    3    7:areturn         
		}

		public static void setDescription(Object obj, CharSequence charsequence)
		{
			((android.media.MediaDescription.Builder)obj).setDescription(charsequence);
		//    0    0:aload_0         
		//    1    1:checkcast       #16  <Class android.media.MediaDescription$Builder>
		//    2    4:aload_1         
		//    3    5:invokevirtual   #27  <Method android.media.MediaDescription$Builder android.media.MediaDescription$Builder.setDescription(CharSequence)>
		//    4    8:pop             
		//    5    9:return          
		}

		public static void setExtras(Object obj, Bundle bundle)
		{
			((android.media.MediaDescription.Builder)obj).setExtras(bundle);
		//    0    0:aload_0         
		//    1    1:checkcast       #16  <Class android.media.MediaDescription$Builder>
		//    2    4:aload_1         
		//    3    5:invokevirtual   #32  <Method android.media.MediaDescription$Builder android.media.MediaDescription$Builder.setExtras(Bundle)>
		//    4    8:pop             
		//    5    9:return          
		}

		public static void setIconBitmap(Object obj, Bitmap bitmap)
		{
			((android.media.MediaDescription.Builder)obj).setIconBitmap(bitmap);
		//    0    0:aload_0         
		//    1    1:checkcast       #16  <Class android.media.MediaDescription$Builder>
		//    2    4:aload_1         
		//    3    5:invokevirtual   #37  <Method android.media.MediaDescription$Builder android.media.MediaDescription$Builder.setIconBitmap(Bitmap)>
		//    4    8:pop             
		//    5    9:return          
		}

		public static void setIconUri(Object obj, Uri uri)
		{
			((android.media.MediaDescription.Builder)obj).setIconUri(uri);
		//    0    0:aload_0         
		//    1    1:checkcast       #16  <Class android.media.MediaDescription$Builder>
		//    2    4:aload_1         
		//    3    5:invokevirtual   #42  <Method android.media.MediaDescription$Builder android.media.MediaDescription$Builder.setIconUri(Uri)>
		//    4    8:pop             
		//    5    9:return          
		}

		public static void setMediaId(Object obj, String s)
		{
			((android.media.MediaDescription.Builder)obj).setMediaId(s);
		//    0    0:aload_0         
		//    1    1:checkcast       #16  <Class android.media.MediaDescription$Builder>
		//    2    4:aload_1         
		//    3    5:invokevirtual   #47  <Method android.media.MediaDescription$Builder android.media.MediaDescription$Builder.setMediaId(String)>
		//    4    8:pop             
		//    5    9:return          
		}

		public static void setSubtitle(Object obj, CharSequence charsequence)
		{
			((android.media.MediaDescription.Builder)obj).setSubtitle(charsequence);
		//    0    0:aload_0         
		//    1    1:checkcast       #16  <Class android.media.MediaDescription$Builder>
		//    2    4:aload_1         
		//    3    5:invokevirtual   #50  <Method android.media.MediaDescription$Builder android.media.MediaDescription$Builder.setSubtitle(CharSequence)>
		//    4    8:pop             
		//    5    9:return          
		}

		public static void setTitle(Object obj, CharSequence charsequence)
		{
			((android.media.MediaDescription.Builder)obj).setTitle(charsequence);
		//    0    0:aload_0         
		//    1    1:checkcast       #16  <Class android.media.MediaDescription$Builder>
		//    2    4:aload_1         
		//    3    5:invokevirtual   #53  <Method android.media.MediaDescription$Builder android.media.MediaDescription$Builder.setTitle(CharSequence)>
		//    4    8:pop             
		//    5    9:return          
		}

		Builder()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #11  <Method void Object()>
		//    2    4:return          
		}
	}


	MediaDescriptionCompatApi21()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #14  <Method void Object()>
	//    2    4:return          
	}

	public static Object fromParcel(Parcel parcel)
	{
		return MediaDescription.CREATOR.createFromParcel(parcel);
	//    0    0:getstatic       #23  <Field android.os.Parcelable$Creator MediaDescription.CREATOR>
	//    1    3:aload_0         
	//    2    4:invokeinterface #28  <Method Object android.os.Parcelable$Creator.createFromParcel(Parcel)>
	//    3    9:areturn         
	}

	public static CharSequence getDescription(Object obj)
	{
		return ((MediaDescription)obj).getDescription();
	//    0    0:aload_0         
	//    1    1:checkcast       #19  <Class MediaDescription>
	//    2    4:invokevirtual   #33  <Method CharSequence MediaDescription.getDescription()>
	//    3    7:areturn         
	}

	public static Bundle getExtras(Object obj)
	{
		return ((MediaDescription)obj).getExtras();
	//    0    0:aload_0         
	//    1    1:checkcast       #19  <Class MediaDescription>
	//    2    4:invokevirtual   #38  <Method Bundle MediaDescription.getExtras()>
	//    3    7:areturn         
	}

	public static Bitmap getIconBitmap(Object obj)
	{
		return ((MediaDescription)obj).getIconBitmap();
	//    0    0:aload_0         
	//    1    1:checkcast       #19  <Class MediaDescription>
	//    2    4:invokevirtual   #43  <Method Bitmap MediaDescription.getIconBitmap()>
	//    3    7:areturn         
	}

	public static Uri getIconUri(Object obj)
	{
		return ((MediaDescription)obj).getIconUri();
	//    0    0:aload_0         
	//    1    1:checkcast       #19  <Class MediaDescription>
	//    2    4:invokevirtual   #48  <Method Uri MediaDescription.getIconUri()>
	//    3    7:areturn         
	}

	public static String getMediaId(Object obj)
	{
		return ((MediaDescription)obj).getMediaId();
	//    0    0:aload_0         
	//    1    1:checkcast       #19  <Class MediaDescription>
	//    2    4:invokevirtual   #53  <Method String MediaDescription.getMediaId()>
	//    3    7:areturn         
	}

	public static CharSequence getSubtitle(Object obj)
	{
		return ((MediaDescription)obj).getSubtitle();
	//    0    0:aload_0         
	//    1    1:checkcast       #19  <Class MediaDescription>
	//    2    4:invokevirtual   #56  <Method CharSequence MediaDescription.getSubtitle()>
	//    3    7:areturn         
	}

	public static CharSequence getTitle(Object obj)
	{
		return ((MediaDescription)obj).getTitle();
	//    0    0:aload_0         
	//    1    1:checkcast       #19  <Class MediaDescription>
	//    2    4:invokevirtual   #59  <Method CharSequence MediaDescription.getTitle()>
	//    3    7:areturn         
	}

	public static void writeToParcel(Object obj, Parcel parcel, int i)
	{
		((MediaDescription)obj).writeToParcel(parcel, i);
	//    0    0:aload_0         
	//    1    1:checkcast       #19  <Class MediaDescription>
	//    2    4:aload_1         
	//    3    5:iload_2         
	//    4    6:invokevirtual   #64  <Method void MediaDescription.writeToParcel(Parcel, int)>
	//    5    9:return          
	}
}
