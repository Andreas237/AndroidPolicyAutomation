// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v13.view.inputmethod;

import android.content.ClipDescription;
import android.net.Uri;
import android.view.inputmethod.InputContentInfo;

public final class InputContentInfoCompat
{
	private static final class InputContentInfoCompatApi25Impl
		implements InputContentInfoCompatImpl
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

		InputContentInfoCompatApi25Impl(Uri uri, ClipDescription clipdescription, Uri uri1)
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

		InputContentInfoCompatApi25Impl(Object obj)
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

	private static final class InputContentInfoCompatBaseImpl
		implements InputContentInfoCompatImpl
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

		InputContentInfoCompatBaseImpl(Uri uri, ClipDescription clipdescription, Uri uri1)
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

	private static interface InputContentInfoCompatImpl
	{

		public abstract Uri getContentUri();

		public abstract ClipDescription getDescription();

		public abstract Object getInputContentInfo();

		public abstract Uri getLinkUri();

		public abstract void releasePermission();

		public abstract void requestPermission();
	}


	public InputContentInfoCompat(Uri uri, ClipDescription clipdescription, Uri uri1)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #22  <Method void Object()>
		if(android.os.Build.VERSION.SDK_INT >= 25)
	//*   2    4:getstatic       #28  <Field int android.os.Build$VERSION.SDK_INT>
	//*   3    7:bipush          25
	//*   4    9:icmplt          27
		{
			mImpl = ((InputContentInfoCompatImpl) (new InputContentInfoCompatApi25Impl(uri, clipdescription, uri1)));
	//    5   12:aload_0         
	//    6   13:new             #6   <Class InputContentInfoCompat$InputContentInfoCompatApi25Impl>
	//    7   16:dup             
	//    8   17:aload_1         
	//    9   18:aload_2         
	//   10   19:aload_3         
	//   11   20:invokespecial   #30  <Method void InputContentInfoCompat$InputContentInfoCompatApi25Impl(Uri, ClipDescription, Uri)>
	//   12   23:putfield        #32  <Field InputContentInfoCompat$InputContentInfoCompatImpl mImpl>
			return;
	//   13   26:return          
		} else
		{
			mImpl = ((InputContentInfoCompatImpl) (new InputContentInfoCompatBaseImpl(uri, clipdescription, uri1)));
	//   14   27:aload_0         
	//   15   28:new             #9   <Class InputContentInfoCompat$InputContentInfoCompatBaseImpl>
	//   16   31:dup             
	//   17   32:aload_1         
	//   18   33:aload_2         
	//   19   34:aload_3         
	//   20   35:invokespecial   #33  <Method void InputContentInfoCompat$InputContentInfoCompatBaseImpl(Uri, ClipDescription, Uri)>
	//   21   38:putfield        #32  <Field InputContentInfoCompat$InputContentInfoCompatImpl mImpl>
			return;
	//   22   41:return          
		}
	}

	private InputContentInfoCompat(InputContentInfoCompatImpl inputcontentinfocompatimpl)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #22  <Method void Object()>
		mImpl = inputcontentinfocompatimpl;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #32  <Field InputContentInfoCompat$InputContentInfoCompatImpl mImpl>
	//    5    9:return          
	}

	public static InputContentInfoCompat wrap(Object obj)
	{
		if(obj == null)
	//*   0    0:aload_0         
	//*   1    1:ifnonnull       6
			return null;
	//    2    4:aconst_null     
	//    3    5:areturn         
		if(android.os.Build.VERSION.SDK_INT < 25)
	//*   4    6:getstatic       #28  <Field int android.os.Build$VERSION.SDK_INT>
	//*   5    9:bipush          25
	//*   6   11:icmpge          16
			return null;
	//    7   14:aconst_null     
	//    8   15:areturn         
		else
			return new InputContentInfoCompat(((InputContentInfoCompatImpl) (new InputContentInfoCompatApi25Impl(obj))));
	//    9   16:new             #2   <Class InputContentInfoCompat>
	//   10   19:dup             
	//   11   20:new             #6   <Class InputContentInfoCompat$InputContentInfoCompatApi25Impl>
	//   12   23:dup             
	//   13   24:aload_0         
	//   14   25:invokespecial   #41  <Method void InputContentInfoCompat$InputContentInfoCompatApi25Impl(Object)>
	//   15   28:invokespecial   #43  <Method void InputContentInfoCompat(InputContentInfoCompat$InputContentInfoCompatImpl)>
	//   16   31:areturn         
	}

	public Uri getContentUri()
	{
		return mImpl.getContentUri();
	//    0    0:aload_0         
	//    1    1:getfield        #32  <Field InputContentInfoCompat$InputContentInfoCompatImpl mImpl>
	//    2    4:invokeinterface #48  <Method Uri InputContentInfoCompat$InputContentInfoCompatImpl.getContentUri()>
	//    3    9:areturn         
	}

	public ClipDescription getDescription()
	{
		return mImpl.getDescription();
	//    0    0:aload_0         
	//    1    1:getfield        #32  <Field InputContentInfoCompat$InputContentInfoCompatImpl mImpl>
	//    2    4:invokeinterface #52  <Method ClipDescription InputContentInfoCompat$InputContentInfoCompatImpl.getDescription()>
	//    3    9:areturn         
	}

	public Uri getLinkUri()
	{
		return mImpl.getLinkUri();
	//    0    0:aload_0         
	//    1    1:getfield        #32  <Field InputContentInfoCompat$InputContentInfoCompatImpl mImpl>
	//    2    4:invokeinterface #55  <Method Uri InputContentInfoCompat$InputContentInfoCompatImpl.getLinkUri()>
	//    3    9:areturn         
	}

	public void releasePermission()
	{
		mImpl.releasePermission();
	//    0    0:aload_0         
	//    1    1:getfield        #32  <Field InputContentInfoCompat$InputContentInfoCompatImpl mImpl>
	//    2    4:invokeinterface #58  <Method void InputContentInfoCompat$InputContentInfoCompatImpl.releasePermission()>
	//    3    9:return          
	}

	public void requestPermission()
	{
		mImpl.requestPermission();
	//    0    0:aload_0         
	//    1    1:getfield        #32  <Field InputContentInfoCompat$InputContentInfoCompatImpl mImpl>
	//    2    4:invokeinterface #61  <Method void InputContentInfoCompat$InputContentInfoCompatImpl.requestPermission()>
	//    3    9:return          
	}

	public Object unwrap()
	{
		return mImpl.getInputContentInfo();
	//    0    0:aload_0         
	//    1    1:getfield        #32  <Field InputContentInfoCompat$InputContentInfoCompatImpl mImpl>
	//    2    4:invokeinterface #66  <Method Object InputContentInfoCompat$InputContentInfoCompatImpl.getInputContentInfo()>
	//    3    9:areturn         
	}

	private final InputContentInfoCompatImpl mImpl;
}
