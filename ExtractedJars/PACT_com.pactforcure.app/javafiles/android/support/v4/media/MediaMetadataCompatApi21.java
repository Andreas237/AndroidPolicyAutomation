// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.media;

import android.graphics.Bitmap;
import android.media.MediaMetadata;
import android.media.Rating;
import android.os.Parcel;
import java.util.Set;

class MediaMetadataCompatApi21
{
	public static class Builder
	{

		public static Object build(Object obj)
		{
			return ((Object) (((android.media.MediaMetadata.Builder)obj).build()));
		//    0    0:aload_0         
		//    1    1:checkcast       #16  <Class android.media.MediaMetadata$Builder>
		//    2    4:invokevirtual   #19  <Method MediaMetadata android.media.MediaMetadata$Builder.build()>
		//    3    7:areturn         
		}

		public static Object newInstance()
		{
			return ((Object) (new android.media.MediaMetadata.Builder()));
		//    0    0:new             #16  <Class android.media.MediaMetadata$Builder>
		//    1    3:dup             
		//    2    4:invokespecial   #22  <Method void android.media.MediaMetadata$Builder()>
		//    3    7:areturn         
		}

		public static void putBitmap(Object obj, String s, Bitmap bitmap)
		{
			((android.media.MediaMetadata.Builder)obj).putBitmap(s, bitmap);
		//    0    0:aload_0         
		//    1    1:checkcast       #16  <Class android.media.MediaMetadata$Builder>
		//    2    4:aload_1         
		//    3    5:aload_2         
		//    4    6:invokevirtual   #27  <Method android.media.MediaMetadata$Builder android.media.MediaMetadata$Builder.putBitmap(String, Bitmap)>
		//    5    9:pop             
		//    6   10:return          
		}

		public static void putLong(Object obj, String s, long l)
		{
			((android.media.MediaMetadata.Builder)obj).putLong(s, l);
		//    0    0:aload_0         
		//    1    1:checkcast       #16  <Class android.media.MediaMetadata$Builder>
		//    2    4:aload_1         
		//    3    5:lload_2         
		//    4    6:invokevirtual   #32  <Method android.media.MediaMetadata$Builder android.media.MediaMetadata$Builder.putLong(String, long)>
		//    5    9:pop             
		//    6   10:return          
		}

		public static void putRating(Object obj, String s, Object obj1)
		{
			((android.media.MediaMetadata.Builder)obj).putRating(s, (Rating)obj1);
		//    0    0:aload_0         
		//    1    1:checkcast       #16  <Class android.media.MediaMetadata$Builder>
		//    2    4:aload_1         
		//    3    5:aload_2         
		//    4    6:checkcast       #36  <Class Rating>
		//    5    9:invokevirtual   #39  <Method android.media.MediaMetadata$Builder android.media.MediaMetadata$Builder.putRating(String, Rating)>
		//    6   12:pop             
		//    7   13:return          
		}

		public static void putString(Object obj, String s, String s1)
		{
			((android.media.MediaMetadata.Builder)obj).putString(s, s1);
		//    0    0:aload_0         
		//    1    1:checkcast       #16  <Class android.media.MediaMetadata$Builder>
		//    2    4:aload_1         
		//    3    5:aload_2         
		//    4    6:invokevirtual   #44  <Method android.media.MediaMetadata$Builder android.media.MediaMetadata$Builder.putString(String, String)>
		//    5    9:pop             
		//    6   10:return          
		}

		public static void putText(Object obj, String s, CharSequence charsequence)
		{
			((android.media.MediaMetadata.Builder)obj).putText(s, charsequence);
		//    0    0:aload_0         
		//    1    1:checkcast       #16  <Class android.media.MediaMetadata$Builder>
		//    2    4:aload_1         
		//    3    5:aload_2         
		//    4    6:invokevirtual   #49  <Method android.media.MediaMetadata$Builder android.media.MediaMetadata$Builder.putText(String, CharSequence)>
		//    5    9:pop             
		//    6   10:return          
		}

		public Builder()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #11  <Method void Object()>
		//    2    4:return          
		}
	}


	MediaMetadataCompatApi21()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #14  <Method void Object()>
	//    2    4:return          
	}

	public static Object createFromParcel(Parcel parcel)
	{
		return MediaMetadata.CREATOR.createFromParcel(parcel);
	//    0    0:getstatic       #23  <Field android.os.Parcelable$Creator MediaMetadata.CREATOR>
	//    1    3:aload_0         
	//    2    4:invokeinterface #27  <Method Object android.os.Parcelable$Creator.createFromParcel(Parcel)>
	//    3    9:areturn         
	}

	public static Bitmap getBitmap(Object obj, String s)
	{
		return ((MediaMetadata)obj).getBitmap(s);
	//    0    0:aload_0         
	//    1    1:checkcast       #19  <Class MediaMetadata>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #32  <Method Bitmap MediaMetadata.getBitmap(String)>
	//    4    8:areturn         
	}

	public static long getLong(Object obj, String s)
	{
		return ((MediaMetadata)obj).getLong(s);
	//    0    0:aload_0         
	//    1    1:checkcast       #19  <Class MediaMetadata>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #37  <Method long MediaMetadata.getLong(String)>
	//    4    8:lreturn         
	}

	public static Object getRating(Object obj, String s)
	{
		return ((Object) (((MediaMetadata)obj).getRating(s)));
	//    0    0:aload_0         
	//    1    1:checkcast       #19  <Class MediaMetadata>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #42  <Method Rating MediaMetadata.getRating(String)>
	//    4    8:areturn         
	}

	public static CharSequence getText(Object obj, String s)
	{
		return ((MediaMetadata)obj).getText(s);
	//    0    0:aload_0         
	//    1    1:checkcast       #19  <Class MediaMetadata>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #47  <Method CharSequence MediaMetadata.getText(String)>
	//    4    8:areturn         
	}

	public static Set keySet(Object obj)
	{
		return ((MediaMetadata)obj).keySet();
	//    0    0:aload_0         
	//    1    1:checkcast       #19  <Class MediaMetadata>
	//    2    4:invokevirtual   #52  <Method Set MediaMetadata.keySet()>
	//    3    7:areturn         
	}

	public static void writeToParcel(Object obj, Parcel parcel, int i)
	{
		((MediaMetadata)obj).writeToParcel(parcel, i);
	//    0    0:aload_0         
	//    1    1:checkcast       #19  <Class MediaMetadata>
	//    2    4:aload_1         
	//    3    5:iload_2         
	//    4    6:invokevirtual   #59  <Method void MediaMetadata.writeToParcel(Parcel, int)>
	//    5    9:return          
	}
}
