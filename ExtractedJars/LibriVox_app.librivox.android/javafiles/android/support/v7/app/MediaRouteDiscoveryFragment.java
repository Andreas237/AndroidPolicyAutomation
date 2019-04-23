// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v7.app;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.media.MediaRouteSelector;
import android.support.v7.media.MediaRouter;

public class MediaRouteDiscoveryFragment extends Fragment
{

	public MediaRouteDiscoveryFragment()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #18  <Method void Fragment()>
	//    2    4:return          
	}

	private void ensureRouteSelector()
	{
		if(mSelector == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #22  <Field MediaRouteSelector mSelector>
	//*   2    4:ifnonnull       43
		{
			Bundle bundle = getArguments();
	//    3    7:aload_0         
	//    4    8:invokevirtual   #26  <Method Bundle getArguments()>
	//    5   11:astore_1        
			if(bundle != null)
	//*   6   12:aload_1         
	//*   7   13:ifnull          29
				mSelector = MediaRouteSelector.fromBundle(bundle.getBundle("selector"));
	//    8   16:aload_0         
	//    9   17:aload_1         
	//   10   18:ldc1            #8   <String "selector">
	//   11   20:invokevirtual   #32  <Method Bundle Bundle.getBundle(String)>
	//   12   23:invokestatic    #38  <Method MediaRouteSelector MediaRouteSelector.fromBundle(Bundle)>
	//   13   26:putfield        #22  <Field MediaRouteSelector mSelector>
			if(mSelector == null)
	//*  14   29:aload_0         
	//*  15   30:getfield        #22  <Field MediaRouteSelector mSelector>
	//*  16   33:ifnonnull       43
				mSelector = MediaRouteSelector.EMPTY;
	//   17   36:aload_0         
	//   18   37:getstatic       #41  <Field MediaRouteSelector MediaRouteSelector.EMPTY>
	//   19   40:putfield        #22  <Field MediaRouteSelector mSelector>
		}
	//   20   43:return          
	}

	private void ensureRouter()
	{
		if(mRouter == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #44  <Field MediaRouter mRouter>
	//*   2    4:ifnonnull       18
			mRouter = MediaRouter.getInstance(getContext());
	//    3    7:aload_0         
	//    4    8:aload_0         
	//    5    9:invokevirtual   #48  <Method android.content.Context getContext()>
	//    6   12:invokestatic    #54  <Method MediaRouter MediaRouter.getInstance(android.content.Context)>
	//    7   15:putfield        #44  <Field MediaRouter mRouter>
	//    8   18:return          
	}

	public MediaRouter getMediaRouter()
	{
		ensureRouter();
	//    0    0:aload_0         
	//    1    1:invokespecial   #58  <Method void ensureRouter()>
		return mRouter;
	//    2    4:aload_0         
	//    3    5:getfield        #44  <Field MediaRouter mRouter>
	//    4    8:areturn         
	}

	public MediaRouteSelector getRouteSelector()
	{
		ensureRouteSelector();
	//    0    0:aload_0         
	//    1    1:invokespecial   #62  <Method void ensureRouteSelector()>
		return mSelector;
	//    2    4:aload_0         
	//    3    5:getfield        #22  <Field MediaRouteSelector mSelector>
	//    4    8:areturn         
	}

	public android.support.v7.media.MediaRouter.Callback onCreateCallback()
	{
		return ((android.support.v7.media.MediaRouter.Callback) (new _cls1()));
	//    0    0:new             #66  <Class MediaRouteDiscoveryFragment$1>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokespecial   #69  <Method void MediaRouteDiscoveryFragment$1(MediaRouteDiscoveryFragment)>
	//    4    8:areturn         
	}

	public int onPrepareCallbackFlags()
	{
		return 4;
	//    0    0:iconst_4        
	//    1    1:ireturn         
	}

	public void onStart()
	{
		super.onStart();
	//    0    0:aload_0         
	//    1    1:invokespecial   #74  <Method void Fragment.onStart()>
		ensureRouteSelector();
	//    2    4:aload_0         
	//    3    5:invokespecial   #62  <Method void ensureRouteSelector()>
		ensureRouter();
	//    4    8:aload_0         
	//    5    9:invokespecial   #58  <Method void ensureRouter()>
		mCallback = onCreateCallback();
	//    6   12:aload_0         
	//    7   13:aload_0         
	//    8   14:invokevirtual   #76  <Method android.support.v7.media.MediaRouter$Callback onCreateCallback()>
	//    9   17:putfield        #78  <Field android.support.v7.media.MediaRouter$Callback mCallback>
		android.support.v7.media.MediaRouter.Callback callback = mCallback;
	//   10   20:aload_0         
	//   11   21:getfield        #78  <Field android.support.v7.media.MediaRouter$Callback mCallback>
	//   12   24:astore_1        
		if(callback != null)
	//*  13   25:aload_1         
	//*  14   26:ifnull          45
			mRouter.addCallback(mSelector, callback, onPrepareCallbackFlags());
	//   15   29:aload_0         
	//   16   30:getfield        #44  <Field MediaRouter mRouter>
	//   17   33:aload_0         
	//   18   34:getfield        #22  <Field MediaRouteSelector mSelector>
	//   19   37:aload_1         
	//   20   38:aload_0         
	//   21   39:invokevirtual   #80  <Method int onPrepareCallbackFlags()>
	//   22   42:invokevirtual   #84  <Method void MediaRouter.addCallback(MediaRouteSelector, android.support.v7.media.MediaRouter$Callback, int)>
	//   23   45:return          
	}

	public void onStop()
	{
		android.support.v7.media.MediaRouter.Callback callback = mCallback;
	//    0    0:aload_0         
	//    1    1:getfield        #78  <Field android.support.v7.media.MediaRouter$Callback mCallback>
	//    2    4:astore_1        
		if(callback != null)
	//*   3    5:aload_1         
	//*   4    6:ifnull          22
		{
			mRouter.removeCallback(callback);
	//    5    9:aload_0         
	//    6   10:getfield        #44  <Field MediaRouter mRouter>
	//    7   13:aload_1         
	//    8   14:invokevirtual   #89  <Method void MediaRouter.removeCallback(android.support.v7.media.MediaRouter$Callback)>
			mCallback = null;
	//    9   17:aload_0         
	//   10   18:aconst_null     
	//   11   19:putfield        #78  <Field android.support.v7.media.MediaRouter$Callback mCallback>
		}
		super.onStop();
	//   12   22:aload_0         
	//   13   23:invokespecial   #91  <Method void Fragment.onStop()>
	//   14   26:return          
	}

	public void setRouteSelector(MediaRouteSelector mediarouteselector)
	{
		if(mediarouteselector != null)
	//*   0    0:aload_1         
	//*   1    1:ifnull          95
		{
			ensureRouteSelector();
	//    2    4:aload_0         
	//    3    5:invokespecial   #62  <Method void ensureRouteSelector()>
			if(!mSelector.equals(((Object) (mediarouteselector))))
	//*   4    8:aload_0         
	//*   5    9:getfield        #22  <Field MediaRouteSelector mSelector>
	//*   6   12:aload_1         
	//*   7   13:invokevirtual   #97  <Method boolean MediaRouteSelector.equals(Object)>
	//*   8   16:ifne            94
			{
				mSelector = mediarouteselector;
	//    9   19:aload_0         
	//   10   20:aload_1         
	//   11   21:putfield        #22  <Field MediaRouteSelector mSelector>
				Bundle bundle1 = getArguments();
	//   12   24:aload_0         
	//   13   25:invokevirtual   #26  <Method Bundle getArguments()>
	//   14   28:astore_3        
				Bundle bundle = bundle1;
	//   15   29:aload_3         
	//   16   30:astore_2        
				if(bundle1 == null)
	//*  17   31:aload_3         
	//*  18   32:ifnonnull       43
					bundle = new Bundle();
	//   19   35:new             #28  <Class Bundle>
	//   20   38:dup             
	//   21   39:invokespecial   #98  <Method void Bundle()>
	//   22   42:astore_2        
				bundle.putBundle("selector", mediarouteselector.asBundle());
	//   23   43:aload_2         
	//   24   44:ldc1            #8   <String "selector">
	//   25   46:aload_1         
	//   26   47:invokevirtual   #101 <Method Bundle MediaRouteSelector.asBundle()>
	//   27   50:invokevirtual   #105 <Method void Bundle.putBundle(String, Bundle)>
				setArguments(bundle);
	//   28   53:aload_0         
	//   29   54:aload_2         
	//   30   55:invokevirtual   #109 <Method void setArguments(Bundle)>
				mediarouteselector = ((MediaRouteSelector) (mCallback));
	//   31   58:aload_0         
	//   32   59:getfield        #78  <Field android.support.v7.media.MediaRouter$Callback mCallback>
	//   33   62:astore_1        
				if(mediarouteselector != null)
	//*  34   63:aload_1         
	//*  35   64:ifnull          94
				{
					mRouter.removeCallback(((android.support.v7.media.MediaRouter.Callback) (mediarouteselector)));
	//   36   67:aload_0         
	//   37   68:getfield        #44  <Field MediaRouter mRouter>
	//   38   71:aload_1         
	//   39   72:invokevirtual   #89  <Method void MediaRouter.removeCallback(android.support.v7.media.MediaRouter$Callback)>
					mRouter.addCallback(mSelector, mCallback, onPrepareCallbackFlags());
	//   40   75:aload_0         
	//   41   76:getfield        #44  <Field MediaRouter mRouter>
	//   42   79:aload_0         
	//   43   80:getfield        #22  <Field MediaRouteSelector mSelector>
	//   44   83:aload_0         
	//   45   84:getfield        #78  <Field android.support.v7.media.MediaRouter$Callback mCallback>
	//   46   87:aload_0         
	//   47   88:invokevirtual   #80  <Method int onPrepareCallbackFlags()>
	//   48   91:invokevirtual   #84  <Method void MediaRouter.addCallback(MediaRouteSelector, android.support.v7.media.MediaRouter$Callback, int)>
				}
			}
			return;
	//   49   94:return          
		} else
		{
			throw new IllegalArgumentException("selector must not be null");
	//   50   95:new             #111 <Class IllegalArgumentException>
	//   51   98:dup             
	//   52   99:ldc1            #113 <String "selector must not be null">
	//   53  101:invokespecial   #116 <Method void IllegalArgumentException(String)>
	//   54  104:athrow          
		}
	}

	private static final String ARGUMENT_SELECTOR = "selector";
	private android.support.v7.media.MediaRouter.Callback mCallback;
	private MediaRouter mRouter;
	private MediaRouteSelector mSelector;

	private class _cls1 extends android.support.v7.media.MediaRouter.Callback
	{

		final MediaRouteDiscoveryFragment this$0;

		_cls1()
		{
			this$0 = MediaRouteDiscoveryFragment.this;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #10  <Field MediaRouteDiscoveryFragment this$0>
			super();
		//    3    5:aload_0         
		//    4    6:invokespecial   #13  <Method void android.support.v7.media.MediaRouter$Callback()>
		//    5    9:return          
		}
	}

}
