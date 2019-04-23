// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.media;

import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;

// Referenced classes of package android.support.v4.media:
//			MediaDescriptionCompat

public static final class MediaDescriptionCompat$Builder
{

	public MediaDescriptionCompat build()
	{
		return new MediaDescriptionCompat(mMediaId, mTitle, mSubtitle, mDescription, mIcon, mIconUri, mExtras, mMediaUri);
	//    0    0:new             #6   <Class MediaDescriptionCompat>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:getfield        #29  <Field String mMediaId>
	//    4    8:aload_0         
	//    5    9:getfield        #31  <Field CharSequence mTitle>
	//    6   12:aload_0         
	//    7   13:getfield        #33  <Field CharSequence mSubtitle>
	//    8   16:aload_0         
	//    9   17:getfield        #35  <Field CharSequence mDescription>
	//   10   20:aload_0         
	//   11   21:getfield        #37  <Field Bitmap mIcon>
	//   12   24:aload_0         
	//   13   25:getfield        #39  <Field Uri mIconUri>
	//   14   28:aload_0         
	//   15   29:getfield        #41  <Field Bundle mExtras>
	//   16   32:aload_0         
	//   17   33:getfield        #43  <Field Uri mMediaUri>
	//   18   36:invokespecial   #46  <Method void MediaDescriptionCompat(String, CharSequence, CharSequence, CharSequence, Bitmap, Uri, Bundle, Uri)>
	//   19   39:areturn         
	}

	public MediaDescriptionCompat$Builder setDescription(CharSequence charsequence)
	{
		mDescription = charsequence;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #35  <Field CharSequence mDescription>
		return this;
	//    3    5:aload_0         
	//    4    6:areturn         
	}

	public MediaDescriptionCompat$Builder setExtras(Bundle bundle)
	{
		mExtras = bundle;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #41  <Field Bundle mExtras>
		return this;
	//    3    5:aload_0         
	//    4    6:areturn         
	}

	public MediaDescriptionCompat$Builder setIconBitmap(Bitmap bitmap)
	{
		mIcon = bitmap;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #37  <Field Bitmap mIcon>
		return this;
	//    3    5:aload_0         
	//    4    6:areturn         
	}

	public MediaDescriptionCompat$Builder setIconUri(Uri uri)
	{
		mIconUri = uri;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #39  <Field Uri mIconUri>
		return this;
	//    3    5:aload_0         
	//    4    6:areturn         
	}

	public MediaDescriptionCompat$Builder setMediaId(String s)
	{
		mMediaId = s;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #29  <Field String mMediaId>
		return this;
	//    3    5:aload_0         
	//    4    6:areturn         
	}

	public MediaDescriptionCompat$Builder setMediaUri(Uri uri)
	{
		mMediaUri = uri;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #43  <Field Uri mMediaUri>
		return this;
	//    3    5:aload_0         
	//    4    6:areturn         
	}

	public MediaDescriptionCompat$Builder setSubtitle(CharSequence charsequence)
	{
		mSubtitle = charsequence;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #33  <Field CharSequence mSubtitle>
		return this;
	//    3    5:aload_0         
	//    4    6:areturn         
	}

	public MediaDescriptionCompat$Builder setTitle(CharSequence charsequence)
	{
		mTitle = charsequence;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #31  <Field CharSequence mTitle>
		return this;
	//    3    5:aload_0         
	//    4    6:areturn         
	}

	private CharSequence mDescription;
	private Bundle mExtras;
	private Bitmap mIcon;
	private Uri mIconUri;
	private String mMediaId;
	private Uri mMediaUri;
	private CharSequence mSubtitle;
	private CharSequence mTitle;

	public MediaDescriptionCompat$Builder()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #24  <Method void Object()>
	//    2    4:return          
	}
}
