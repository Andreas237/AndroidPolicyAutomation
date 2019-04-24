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
	//    2    4:aload_0         
	//    3    5:ldc1            #20  <String "selector">
	//    4    7:putfield        #22  <Field String ARGUMENT_SELECTOR>
	//    5   10:return          
	}

	private void ensureRouteSelector()
	{
		if(mSelector == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #26  <Field MediaRouteSelector mSelector>
	//*   2    4:ifnonnull       43
		{
			Bundle bundle = getArguments();
	//    3    7:aload_0         
	//    4    8:invokevirtual   #30  <Method Bundle getArguments()>
	//    5   11:astore_1        
			if(bundle != null)
	//*   6   12:aload_1         
	//*   7   13:ifnull          29
				mSelector = MediaRouteSelector.fromBundle(bundle.getBundle("selector"));
	//    8   16:aload_0         
	//    9   17:aload_1         
	//   10   18:ldc1            #20  <String "selector">
	//   11   20:invokevirtual   #36  <Method Bundle Bundle.getBundle(String)>
	//   12   23:invokestatic    #42  <Method MediaRouteSelector MediaRouteSelector.fromBundle(Bundle)>
	//   13   26:putfield        #26  <Field MediaRouteSelector mSelector>
			if(mSelector == null)
	//*  14   29:aload_0         
	//*  15   30:getfield        #26  <Field MediaRouteSelector mSelector>
	//*  16   33:ifnonnull       43
				mSelector = MediaRouteSelector.EMPTY;
	//   17   36:aload_0         
	//   18   37:getstatic       #45  <Field MediaRouteSelector MediaRouteSelector.EMPTY>
	//   19   40:putfield        #26  <Field MediaRouteSelector mSelector>
		}
	//   20   43:return          
	}

	private void ensureRouter()
	{
		if(mRouter == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #48  <Field MediaRouter mRouter>
	//*   2    4:ifnonnull       18
			mRouter = MediaRouter.getInstance(getContext());
	//    3    7:aload_0         
	//    4    8:aload_0         
	//    5    9:invokevirtual   #52  <Method android.content.Context getContext()>
	//    6   12:invokestatic    #58  <Method MediaRouter MediaRouter.getInstance(android.content.Context)>
	//    7   15:putfield        #48  <Field MediaRouter mRouter>
	//    8   18:return          
	}

	public MediaRouter getMediaRouter()
	{
		ensureRouter();
	//    0    0:aload_0         
	//    1    1:invokespecial   #62  <Method void ensureRouter()>
		return mRouter;
	//    2    4:aload_0         
	//    3    5:getfield        #48  <Field MediaRouter mRouter>
	//    4    8:areturn         
	}

	public MediaRouteSelector getRouteSelector()
	{
		ensureRouteSelector();
	//    0    0:aload_0         
	//    1    1:invokespecial   #66  <Method void ensureRouteSelector()>
		return mSelector;
	//    2    4:aload_0         
	//    3    5:getfield        #26  <Field MediaRouteSelector mSelector>
	//    4    8:areturn         
	}

	public android.support.v7.media.MediaRouter.Callback onCreateCallback()
	{
		return ((android.support.v7.media.MediaRouter.Callback) (new android.support.v7.media.MediaRouter.Callback() {

			final MediaRouteDiscoveryFragment this$0;

			
			{
				this$0 = MediaRouteDiscoveryFragment.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #15  <Field MediaRouteDiscoveryFragment this$0>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #18  <Method void android.support.v7.media.MediaRouter$Callback()>
			//    5    9:return          
			}
		}
));
	//    0    0:new             #6   <Class MediaRouteDiscoveryFragment$1>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokespecial   #71  <Method void MediaRouteDiscoveryFragment$1(MediaRouteDiscoveryFragment)>
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
	//    1    1:invokespecial   #76  <Method void Fragment.onStart()>
		ensureRouteSelector();
	//    2    4:aload_0         
	//    3    5:invokespecial   #66  <Method void ensureRouteSelector()>
		ensureRouter();
	//    4    8:aload_0         
	//    5    9:invokespecial   #62  <Method void ensureRouter()>
		mCallback = onCreateCallback();
	//    6   12:aload_0         
	//    7   13:aload_0         
	//    8   14:invokevirtual   #78  <Method android.support.v7.media.MediaRouter$Callback onCreateCallback()>
	//    9   17:putfield        #80  <Field android.support.v7.media.MediaRouter$Callback mCallback>
		if(mCallback != null)
	//*  10   20:aload_0         
	//*  11   21:getfield        #80  <Field android.support.v7.media.MediaRouter$Callback mCallback>
	//*  12   24:ifnull          46
			mRouter.addCallback(mSelector, mCallback, onPrepareCallbackFlags());
	//   13   27:aload_0         
	//   14   28:getfield        #48  <Field MediaRouter mRouter>
	//   15   31:aload_0         
	//   16   32:getfield        #26  <Field MediaRouteSelector mSelector>
	//   17   35:aload_0         
	//   18   36:getfield        #80  <Field android.support.v7.media.MediaRouter$Callback mCallback>
	//   19   39:aload_0         
	//   20   40:invokevirtual   #82  <Method int onPrepareCallbackFlags()>
	//   21   43:invokevirtual   #86  <Method void MediaRouter.addCallback(MediaRouteSelector, android.support.v7.media.MediaRouter$Callback, int)>
	//   22   46:return          
	}

	public void onStop()
	{
		if(mCallback != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #80  <Field android.support.v7.media.MediaRouter$Callback mCallback>
	//*   2    4:ifnull          23
		{
			mRouter.removeCallback(mCallback);
	//    3    7:aload_0         
	//    4    8:getfield        #48  <Field MediaRouter mRouter>
	//    5   11:aload_0         
	//    6   12:getfield        #80  <Field android.support.v7.media.MediaRouter$Callback mCallback>
	//    7   15:invokevirtual   #91  <Method void MediaRouter.removeCallback(android.support.v7.media.MediaRouter$Callback)>
			mCallback = null;
	//    8   18:aload_0         
	//    9   19:aconst_null     
	//   10   20:putfield        #80  <Field android.support.v7.media.MediaRouter$Callback mCallback>
		}
		super.onStop();
	//   11   23:aload_0         
	//   12   24:invokespecial   #93  <Method void Fragment.onStop()>
	//   13   27:return          
	}

	public void setRouteSelector(MediaRouteSelector mediarouteselector)
	{
		if(mediarouteselector == null)
	//*   0    0:aload_1         
	//*   1    1:ifnonnull       14
			throw new IllegalArgumentException("selector must not be null");
	//    2    4:new             #97  <Class IllegalArgumentException>
	//    3    7:dup             
	//    4    8:ldc1            #99  <String "selector must not be null">
	//    5   10:invokespecial   #102 <Method void IllegalArgumentException(String)>
	//    6   13:athrow          
		ensureRouteSelector();
	//    7   14:aload_0         
	//    8   15:invokespecial   #66  <Method void ensureRouteSelector()>
		if(!mSelector.equals(((Object) (mediarouteselector))))
	//*   9   18:aload_0         
	//*  10   19:getfield        #26  <Field MediaRouteSelector mSelector>
	//*  11   22:aload_1         
	//*  12   23:invokevirtual   #106 <Method boolean MediaRouteSelector.equals(Object)>
	//*  13   26:ifne            105
		{
			mSelector = mediarouteselector;
	//   14   29:aload_0         
	//   15   30:aload_1         
	//   16   31:putfield        #26  <Field MediaRouteSelector mSelector>
			Bundle bundle1 = getArguments();
	//   17   34:aload_0         
	//   18   35:invokevirtual   #30  <Method Bundle getArguments()>
	//   19   38:astore_3        
			Bundle bundle = bundle1;
	//   20   39:aload_3         
	//   21   40:astore_2        
			if(bundle1 == null)
	//*  22   41:aload_3         
	//*  23   42:ifnonnull       53
				bundle = new Bundle();
	//   24   45:new             #32  <Class Bundle>
	//   25   48:dup             
	//   26   49:invokespecial   #107 <Method void Bundle()>
	//   27   52:astore_2        
			bundle.putBundle("selector", mediarouteselector.asBundle());
	//   28   53:aload_2         
	//   29   54:ldc1            #20  <String "selector">
	//   30   56:aload_1         
	//   31   57:invokevirtual   #110 <Method Bundle MediaRouteSelector.asBundle()>
	//   32   60:invokevirtual   #114 <Method void Bundle.putBundle(String, Bundle)>
			setArguments(bundle);
	//   33   63:aload_0         
	//   34   64:aload_2         
	//   35   65:invokevirtual   #118 <Method void setArguments(Bundle)>
			if(mCallback != null)
	//*  36   68:aload_0         
	//*  37   69:getfield        #80  <Field android.support.v7.media.MediaRouter$Callback mCallback>
	//*  38   72:ifnull          105
			{
				mRouter.removeCallback(mCallback);
	//   39   75:aload_0         
	//   40   76:getfield        #48  <Field MediaRouter mRouter>
	//   41   79:aload_0         
	//   42   80:getfield        #80  <Field android.support.v7.media.MediaRouter$Callback mCallback>
	//   43   83:invokevirtual   #91  <Method void MediaRouter.removeCallback(android.support.v7.media.MediaRouter$Callback)>
				mRouter.addCallback(mSelector, mCallback, onPrepareCallbackFlags());
	//   44   86:aload_0         
	//   45   87:getfield        #48  <Field MediaRouter mRouter>
	//   46   90:aload_0         
	//   47   91:getfield        #26  <Field MediaRouteSelector mSelector>
	//   48   94:aload_0         
	//   49   95:getfield        #80  <Field android.support.v7.media.MediaRouter$Callback mCallback>
	//   50   98:aload_0         
	//   51   99:invokevirtual   #82  <Method int onPrepareCallbackFlags()>
	//   52  102:invokevirtual   #86  <Method void MediaRouter.addCallback(MediaRouteSelector, android.support.v7.media.MediaRouter$Callback, int)>
			}
		}
	//   53  105:return          
	}

	private final String ARGUMENT_SELECTOR = "selector";
	private android.support.v7.media.MediaRouter.Callback mCallback;
	private MediaRouter mRouter;
	private MediaRouteSelector mSelector;
}
