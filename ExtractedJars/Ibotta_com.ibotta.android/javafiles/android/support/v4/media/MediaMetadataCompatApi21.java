// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.media;

import android.media.MediaMetadata;
import android.os.Parcel;

class MediaMetadataCompatApi21
{

	public static void writeToParcel(Object obj, Parcel parcel, int i)
	{
		((MediaMetadata)obj).writeToParcel(parcel, i);
	//    0    0:aload_0         
	//    1    1:checkcast       #11  <Class MediaMetadata>
	//    2    4:aload_1         
	//    3    5:iload_2         
	//    4    6:invokevirtual   #14  <Method void MediaMetadata.writeToParcel(Parcel, int)>
	//    5    9:return          
	}
}
