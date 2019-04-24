// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v13.view.inputmethod;

import android.content.ClipDescription;
import android.net.Uri;
import android.view.inputmethod.InputContentInfo;

// Referenced classes of package android.support.v13.view.inputmethod:
//			InputContentInfoCompat

private static final class InputContentInfoCompat$InputContentInfoCompatApi25Impl
	implements InputContentInfoCompat.InputContentInfoCompatImpl
{

	public Uri getContentUri()
	{
		return mObject.getContentUri();
	//    0    0:aload_0         
	//    1    1:getfield        #27  <Field InputContentInfo mObject>
	//    2    4:invokevirtual   #34  <Method Uri InputContentInfo.getContentUri()>
	//    3    7:areturn         
	}

	public ClipDescription getDescription()
	{
		return mObject.getDescription();
	//    0    0:aload_0         
	//    1    1:getfield        #27  <Field InputContentInfo mObject>
	//    2    4:invokevirtual   #39  <Method ClipDescription InputContentInfo.getDescription()>
	//    3    7:areturn         
	}

	public Object getInputContentInfo()
	{
		return ((Object) (mObject));
	//    0    0:aload_0         
	//    1    1:getfield        #27  <Field InputContentInfo mObject>
	//    2    4:areturn         
	}

	public Uri getLinkUri()
	{
		return mObject.getLinkUri();
	//    0    0:aload_0         
	//    1    1:getfield        #27  <Field InputContentInfo mObject>
	//    2    4:invokevirtual   #44  <Method Uri InputContentInfo.getLinkUri()>
	//    3    7:areturn         
	}

	public void releasePermission()
	{
		mObject.releasePermission();
	//    0    0:aload_0         
	//    1    1:getfield        #27  <Field InputContentInfo mObject>
	//    2    4:invokevirtual   #47  <Method void InputContentInfo.releasePermission()>
	//    3    7:return          
	}

	public void requestPermission()
	{
		mObject.requestPermission();
	//    0    0:aload_0         
	//    1    1:getfield        #27  <Field InputContentInfo mObject>
	//    2    4:invokevirtual   #50  <Method void InputContentInfo.requestPermission()>
	//    3    7:return          
	}

	final InputContentInfo mObject;

	InputContentInfoCompat$InputContentInfoCompatApi25Impl(Uri uri, ClipDescription clipdescription, Uri uri1)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #21  <Method void Object()>
		mObject = new InputContentInfo(uri, clipdescription, uri1);
	//    2    4:aload_0         
	//    3    5:new             #23  <Class InputContentInfo>
	//    4    8:dup             
	//    5    9:aload_1         
	//    6   10:aload_2         
	//    7   11:aload_3         
	//    8   12:invokespecial   #25  <Method void InputContentInfo(Uri, ClipDescription, Uri)>
	//    9   15:putfield        #27  <Field InputContentInfo mObject>
	//   10   18:return          
	}

	InputContentInfoCompat$InputContentInfoCompatApi25Impl(Object obj)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #21  <Method void Object()>
		mObject = (InputContentInfo)obj;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:checkcast       #23  <Class InputContentInfo>
	//    5    9:putfield        #27  <Field InputContentInfo mObject>
	//    6   12:return          
	}
}
