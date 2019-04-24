// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v13.view.inputmethod;

import android.content.ClipDescription;
import android.net.Uri;

// Referenced classes of package android.support.v13.view.inputmethod:
//			InputContentInfoCompat

private static final class InputContentInfoCompat$InputContentInfoCompatBaseImpl
	implements InputContentInfoCompat.InputContentInfoCompatImpl
{

	public Uri getContentUri()
	{
		return mContentUri;
	//    0    0:aload_0         
	//    1    1:getfield        #23  <Field Uri mContentUri>
	//    2    4:areturn         
	}

	public ClipDescription getDescription()
	{
		return mDescription;
	//    0    0:aload_0         
	//    1    1:getfield        #25  <Field ClipDescription mDescription>
	//    2    4:areturn         
	}

	public Object getInputContentInfo()
	{
		return ((Object) (null));
	//    0    0:aconst_null     
	//    1    1:areturn         
	}

	public Uri getLinkUri()
	{
		return mLinkUri;
	//    0    0:aload_0         
	//    1    1:getfield        #27  <Field Uri mLinkUri>
	//    2    4:areturn         
	}

	public void releasePermission()
	{
	//    0    0:return          
	}

	public void requestPermission()
	{
	//    0    0:return          
	}

	private final Uri mContentUri;
	private final ClipDescription mDescription;
	private final Uri mLinkUri;

	InputContentInfoCompat$InputContentInfoCompatBaseImpl(Uri uri, ClipDescription clipdescription, Uri uri1)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #21  <Method void Object()>
		mContentUri = uri;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #23  <Field Uri mContentUri>
		mDescription = clipdescription;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #25  <Field ClipDescription mDescription>
		mLinkUri = uri1;
	//    8   14:aload_0         
	//    9   15:aload_3         
	//   10   16:putfield        #27  <Field Uri mLinkUri>
	//   11   19:return          
	}
}
