// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v7.app;

import android.content.Context;
import android.content.res.Resources;
import android.os.*;
import android.support.v7.media.MediaRouteSelector;
import android.support.v7.media.MediaRouter;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.Window;
import android.widget.ImageButton;
import java.util.*;

// Referenced classes of package android.support.v7.app:
//			AppCompatDialog, MediaRouterThemeHelper

public class MediaRouteDevicePickerDialog extends AppCompatDialog
{

	public MediaRouteDevicePickerDialog(Context context)
	{
		this(context, 0);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iconst_0        
	//    3    3:invokespecial   #44  <Method void MediaRouteDevicePickerDialog(Context, int)>
	//    4    6:return          
	}

	public MediaRouteDevicePickerDialog(Context context, int i)
	{
		context = MediaRouterThemeHelper.createThemedDialogContext(context, i, false);
	//    0    0:aload_1         
	//    1    1:iload_2         
	//    2    2:iconst_0        
	//    3    3:invokestatic    #51  <Method Context MediaRouterThemeHelper.createThemedDialogContext(Context, int, boolean)>
	//    4    6:astore_1        
		super(context, MediaRouterThemeHelper.createThemedDialogStyle(context));
	//    5    7:aload_0         
	//    6    8:aload_1         
	//    7    9:aload_1         
	//    8   10:invokestatic    #55  <Method int MediaRouterThemeHelper.createThemedDialogStyle(Context)>
	//    9   13:invokespecial   #56  <Method void AppCompatDialog(Context, int)>
		mSelector = MediaRouteSelector.EMPTY;
	//   10   16:aload_0         
	//   11   17:getstatic       #61  <Field MediaRouteSelector MediaRouteSelector.EMPTY>
	//   12   20:putfield        #63  <Field MediaRouteSelector mSelector>
		mHandler = ((Handler) (new _cls1()));
	//   13   23:aload_0         
	//   14   24:new             #65  <Class MediaRouteDevicePickerDialog$1>
	//   15   27:dup             
	//   16   28:aload_0         
	//   17   29:invokespecial   #68  <Method void MediaRouteDevicePickerDialog$1(MediaRouteDevicePickerDialog)>
	//   18   32:putfield        #70  <Field Handler mHandler>
		context = getContext();
	//   19   35:aload_0         
	//   20   36:invokevirtual   #74  <Method Context getContext()>
	//   21   39:astore_1        
		mRouter = MediaRouter.getInstance(context);
	//   22   40:aload_0         
	//   23   41:aload_1         
	//   24   42:invokestatic    #80  <Method MediaRouter MediaRouter.getInstance(Context)>
	//   25   45:putfield        #82  <Field MediaRouter mRouter>
		mCallback = new MediaRouterCallback();
	//   26   48:aload_0         
	//   27   49:new             #84  <Class MediaRouteDevicePickerDialog$MediaRouterCallback>
	//   28   52:dup             
	//   29   53:aload_0         
	//   30   54:invokespecial   #85  <Method void MediaRouteDevicePickerDialog$MediaRouterCallback(MediaRouteDevicePickerDialog)>
	//   31   57:putfield        #87  <Field MediaRouteDevicePickerDialog$MediaRouterCallback mCallback>
		mContext = context;
	//   32   60:aload_0         
	//   33   61:aload_1         
	//   34   62:putfield        #89  <Field Context mContext>
		mUpdateRoutesDelayMs = context.getResources().getInteger(android.support.v7.mediarouter.R.integer.mr_update_routes_delay_ms);
	//   35   65:aload_0         
	//   36   66:aload_1         
	//   37   67:invokevirtual   #95  <Method Resources Context.getResources()>
	//   38   70:getstatic       #100 <Field int android.support.v7.mediarouter.R$integer.mr_update_routes_delay_ms>
	//   39   73:invokevirtual   #106 <Method int Resources.getInteger(int)>
	//   40   76:i2l             
	//   41   77:putfield        #108 <Field long mUpdateRoutesDelayMs>
	//   42   80:return          
	}

	public MediaRouteSelector getRouteSelector()
	{
		return mSelector;
	//    0    0:aload_0         
	//    1    1:getfield        #63  <Field MediaRouteSelector mSelector>
	//    2    4:areturn         
	}

	public void onAttachedToWindow()
	{
		super.onAttachedToWindow();
	//    0    0:aload_0         
	//    1    1:invokespecial   #114 <Method void AppCompatDialog.onAttachedToWindow()>
		mAttachedToWindow = true;
	//    2    4:aload_0         
	//    3    5:iconst_1        
	//    4    6:putfield        #116 <Field boolean mAttachedToWindow>
		mRouter.addCallback(mSelector, ((android.support.v7.media.MediaRouter.Callback) (mCallback)), 1);
	//    5    9:aload_0         
	//    6   10:getfield        #82  <Field MediaRouter mRouter>
	//    7   13:aload_0         
	//    8   14:getfield        #63  <Field MediaRouteSelector mSelector>
	//    9   17:aload_0         
	//   10   18:getfield        #87  <Field MediaRouteDevicePickerDialog$MediaRouterCallback mCallback>
	//   11   21:iconst_1        
	//   12   22:invokevirtual   #120 <Method void MediaRouter.addCallback(MediaRouteSelector, android.support.v7.media.MediaRouter$Callback, int)>
		refreshRoutes();
	//   13   25:aload_0         
	//   14   26:invokevirtual   #123 <Method void refreshRoutes()>
	//   15   29:return          
	}

	protected void onCreate(Bundle bundle)
	{
		super.onCreate(bundle);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #127 <Method void AppCompatDialog.onCreate(Bundle)>
		setContentView(android.support.v7.mediarouter.R.layout.mr_picker_dialog);
	//    3    5:aload_0         
	//    4    6:getstatic       #132 <Field int android.support.v7.mediarouter.R$layout.mr_picker_dialog>
	//    5    9:invokevirtual   #136 <Method void setContentView(int)>
		mRoutes = ((List) (new ArrayList()));
	//    6   12:aload_0         
	//    7   13:new             #138 <Class ArrayList>
	//    8   16:dup             
	//    9   17:invokespecial   #140 <Method void ArrayList()>
	//   10   20:putfield        #142 <Field List mRoutes>
		mCloseButton = (ImageButton)findViewById(android.support.v7.mediarouter.R.id.mr_picker_close_button);
	//   11   23:aload_0         
	//   12   24:aload_0         
	//   13   25:getstatic       #147 <Field int android.support.v7.mediarouter.R$id.mr_picker_close_button>
	//   14   28:invokevirtual   #151 <Method View findViewById(int)>
	//   15   31:checkcast       #153 <Class ImageButton>
	//   16   34:putfield        #155 <Field ImageButton mCloseButton>
		mCloseButton.setOnClickListener(((android.view.View.OnClickListener) (new _cls2())));
	//   17   37:aload_0         
	//   18   38:getfield        #155 <Field ImageButton mCloseButton>
	//   19   41:new             #157 <Class MediaRouteDevicePickerDialog$2>
	//   20   44:dup             
	//   21   45:aload_0         
	//   22   46:invokespecial   #158 <Method void MediaRouteDevicePickerDialog$2(MediaRouteDevicePickerDialog)>
	//   23   49:invokevirtual   #162 <Method void ImageButton.setOnClickListener(android.view.View$OnClickListener)>
		mAdapter = new RecyclerAdapter();
	//   24   52:aload_0         
	//   25   53:new             #164 <Class MediaRouteDevicePickerDialog$RecyclerAdapter>
	//   26   56:dup             
	//   27   57:aload_0         
	//   28   58:invokespecial   #165 <Method void MediaRouteDevicePickerDialog$RecyclerAdapter(MediaRouteDevicePickerDialog)>
	//   29   61:putfield        #167 <Field MediaRouteDevicePickerDialog$RecyclerAdapter mAdapter>
		mRecyclerView = (RecyclerView)findViewById(android.support.v7.mediarouter.R.id.mr_picker_list);
	//   30   64:aload_0         
	//   31   65:aload_0         
	//   32   66:getstatic       #170 <Field int android.support.v7.mediarouter.R$id.mr_picker_list>
	//   33   69:invokevirtual   #151 <Method View findViewById(int)>
	//   34   72:checkcast       #172 <Class RecyclerView>
	//   35   75:putfield        #174 <Field RecyclerView mRecyclerView>
		mRecyclerView.setAdapter(((android.support.v7.widget.RecyclerView.Adapter) (mAdapter)));
	//   36   78:aload_0         
	//   37   79:getfield        #174 <Field RecyclerView mRecyclerView>
	//   38   82:aload_0         
	//   39   83:getfield        #167 <Field MediaRouteDevicePickerDialog$RecyclerAdapter mAdapter>
	//   40   86:invokevirtual   #178 <Method void RecyclerView.setAdapter(android.support.v7.widget.RecyclerView$Adapter)>
		mRecyclerView.setLayoutManager(((android.support.v7.widget.RecyclerView.LayoutManager) (new LinearLayoutManager(mContext))));
	//   41   89:aload_0         
	//   42   90:getfield        #174 <Field RecyclerView mRecyclerView>
	//   43   93:new             #180 <Class LinearLayoutManager>
	//   44   96:dup             
	//   45   97:aload_0         
	//   46   98:getfield        #89  <Field Context mContext>
	//   47  101:invokespecial   #182 <Method void LinearLayoutManager(Context)>
	//   48  104:invokevirtual   #186 <Method void RecyclerView.setLayoutManager(android.support.v7.widget.RecyclerView$LayoutManager)>
		updateLayout();
	//   49  107:aload_0         
	//   50  108:invokevirtual   #189 <Method void updateLayout()>
	//   51  111:return          
	}

	public void onDetachedFromWindow()
	{
		super.onDetachedFromWindow();
	//    0    0:aload_0         
	//    1    1:invokespecial   #192 <Method void AppCompatDialog.onDetachedFromWindow()>
		mAttachedToWindow = false;
	//    2    4:aload_0         
	//    3    5:iconst_0        
	//    4    6:putfield        #116 <Field boolean mAttachedToWindow>
		mRouter.removeCallback(((android.support.v7.media.MediaRouter.Callback) (mCallback)));
	//    5    9:aload_0         
	//    6   10:getfield        #82  <Field MediaRouter mRouter>
	//    7   13:aload_0         
	//    8   14:getfield        #87  <Field MediaRouteDevicePickerDialog$MediaRouterCallback mCallback>
	//    9   17:invokevirtual   #196 <Method void MediaRouter.removeCallback(android.support.v7.media.MediaRouter$Callback)>
		mHandler.removeMessages(1);
	//   10   20:aload_0         
	//   11   21:getfield        #70  <Field Handler mHandler>
	//   12   24:iconst_1        
	//   13   25:invokevirtual   #201 <Method void Handler.removeMessages(int)>
	//   14   28:return          
	}

	public boolean onFilterRoute(android.support.v7.media.MediaRouter.RouteInfo routeinfo)
	{
		return !routeinfo.isDefaultOrBluetooth() && routeinfo.isEnabled() && routeinfo.matchesSelector(mSelector);
	//    0    0:aload_1         
	//    1    1:invokevirtual   #209 <Method boolean android.support.v7.media.MediaRouter$RouteInfo.isDefaultOrBluetooth()>
	//    2    4:ifne            27
	//    3    7:aload_1         
	//    4    8:invokevirtual   #212 <Method boolean android.support.v7.media.MediaRouter$RouteInfo.isEnabled()>
	//    5   11:ifeq            27
	//    6   14:aload_1         
	//    7   15:aload_0         
	//    8   16:getfield        #63  <Field MediaRouteSelector mSelector>
	//    9   19:invokevirtual   #216 <Method boolean android.support.v7.media.MediaRouter$RouteInfo.matchesSelector(MediaRouteSelector)>
	//   10   22:ifeq            27
	//   11   25:iconst_1        
	//   12   26:ireturn         
	//   13   27:iconst_0        
	//   14   28:ireturn         
	}

	public void onFilterRoutes(List list)
	{
		int i = list.size();
	//    0    0:aload_1         
	//    1    1:invokeinterface #224 <Method int List.size()>
	//    2    6:istore_2        
		do
		{
			int j = i - 1;
	//    3    7:iload_2         
	//    4    8:iconst_1        
	//    5    9:isub            
	//    6   10:istore_3        
			if(i > 0)
	//*   7   11:iload_2         
	//*   8   12:ifle            45
			{
				if(!onFilterRoute((android.support.v7.media.MediaRouter.RouteInfo)list.get(j)))
	//*   9   15:aload_0         
	//*  10   16:aload_1         
	//*  11   17:iload_3         
	//*  12   18:invokeinterface #228 <Method Object List.get(int)>
	//*  13   23:checkcast       #205 <Class android.support.v7.media.MediaRouter$RouteInfo>
	//*  14   26:invokevirtual   #230 <Method boolean onFilterRoute(android.support.v7.media.MediaRouter$RouteInfo)>
	//*  15   29:ifne            40
					list.remove(j);
	//   16   32:aload_1         
	//   17   33:iload_3         
	//   18   34:invokeinterface #233 <Method Object List.remove(int)>
	//   19   39:pop             
				i = j;
	//   20   40:iload_3         
	//   21   41:istore_2        
			} else
	//*  22   42:goto            7
			{
				return;
	//   23   45:return          
			}
		} while(true);
	}

	public void refreshRoutes()
	{
		if(mAttachedToWindow)
	//*   0    0:aload_0         
	//*   1    1:getfield        #116 <Field boolean mAttachedToWindow>
	//*   2    4:ifeq            89
		{
			ArrayList arraylist = new ArrayList(((java.util.Collection) (mRouter.getRoutes())));
	//    3    7:new             #138 <Class ArrayList>
	//    4   10:dup             
	//    5   11:aload_0         
	//    6   12:getfield        #82  <Field MediaRouter mRouter>
	//    7   15:invokevirtual   #237 <Method List MediaRouter.getRoutes()>
	//    8   18:invokespecial   #240 <Method void ArrayList(java.util.Collection)>
	//    9   21:astore_1        
			onFilterRoutes(((List) (arraylist)));
	//   10   22:aload_0         
	//   11   23:aload_1         
	//   12   24:invokevirtual   #242 <Method void onFilterRoutes(List)>
			Collections.sort(((List) (arraylist)), ((Comparator) (RouteComparator.sInstance)));
	//   13   27:aload_1         
	//   14   28:getstatic       #248 <Field MediaRouteDevicePickerDialog$RouteComparator MediaRouteDevicePickerDialog$RouteComparator.sInstance>
	//   15   31:invokestatic    #254 <Method void Collections.sort(List, Comparator)>
			if(SystemClock.uptimeMillis() - mLastUpdateTime >= mUpdateRoutesDelayMs)
	//*  16   34:invokestatic    #260 <Method long SystemClock.uptimeMillis()>
	//*  17   37:aload_0         
	//*  18   38:getfield        #262 <Field long mLastUpdateTime>
	//*  19   41:lsub            
	//*  20   42:aload_0         
	//*  21   43:getfield        #108 <Field long mUpdateRoutesDelayMs>
	//*  22   46:lcmp            
	//*  23   47:iflt            56
			{
				updateRoutes(((List) (arraylist)));
	//   24   50:aload_0         
	//   25   51:aload_1         
	//   26   52:invokevirtual   #265 <Method void updateRoutes(List)>
				return;
	//   27   55:return          
			}
			mHandler.removeMessages(1);
	//   28   56:aload_0         
	//   29   57:getfield        #70  <Field Handler mHandler>
	//   30   60:iconst_1        
	//   31   61:invokevirtual   #201 <Method void Handler.removeMessages(int)>
			Handler handler = mHandler;
	//   32   64:aload_0         
	//   33   65:getfield        #70  <Field Handler mHandler>
	//   34   68:astore_2        
			handler.sendMessageAtTime(handler.obtainMessage(1, ((Object) (arraylist))), mLastUpdateTime + mUpdateRoutesDelayMs);
	//   35   69:aload_2         
	//   36   70:aload_2         
	//   37   71:iconst_1        
	//   38   72:aload_1         
	//   39   73:invokevirtual   #269 <Method Message Handler.obtainMessage(int, Object)>
	//   40   76:aload_0         
	//   41   77:getfield        #262 <Field long mLastUpdateTime>
	//   42   80:aload_0         
	//   43   81:getfield        #108 <Field long mUpdateRoutesDelayMs>
	//   44   84:ladd            
	//   45   85:invokevirtual   #273 <Method boolean Handler.sendMessageAtTime(Message, long)>
	//   46   88:pop             
		}
	//   47   89:return          
	}

	public void setRouteSelector(MediaRouteSelector mediarouteselector)
	{
		if(mediarouteselector != null)
	//*   0    0:aload_1         
	//*   1    1:ifnull          56
		{
			if(!mSelector.equals(((Object) (mediarouteselector))))
	//*   2    4:aload_0         
	//*   3    5:getfield        #63  <Field MediaRouteSelector mSelector>
	//*   4    8:aload_1         
	//*   5    9:invokevirtual   #279 <Method boolean MediaRouteSelector.equals(Object)>
	//*   6   12:ifne            55
			{
				mSelector = mediarouteselector;
	//    7   15:aload_0         
	//    8   16:aload_1         
	//    9   17:putfield        #63  <Field MediaRouteSelector mSelector>
				if(mAttachedToWindow)
	//*  10   20:aload_0         
	//*  11   21:getfield        #116 <Field boolean mAttachedToWindow>
	//*  12   24:ifeq            51
				{
					mRouter.removeCallback(((android.support.v7.media.MediaRouter.Callback) (mCallback)));
	//   13   27:aload_0         
	//   14   28:getfield        #82  <Field MediaRouter mRouter>
	//   15   31:aload_0         
	//   16   32:getfield        #87  <Field MediaRouteDevicePickerDialog$MediaRouterCallback mCallback>
	//   17   35:invokevirtual   #196 <Method void MediaRouter.removeCallback(android.support.v7.media.MediaRouter$Callback)>
					mRouter.addCallback(mediarouteselector, ((android.support.v7.media.MediaRouter.Callback) (mCallback)), 1);
	//   18   38:aload_0         
	//   19   39:getfield        #82  <Field MediaRouter mRouter>
	//   20   42:aload_1         
	//   21   43:aload_0         
	//   22   44:getfield        #87  <Field MediaRouteDevicePickerDialog$MediaRouterCallback mCallback>
	//   23   47:iconst_1        
	//   24   48:invokevirtual   #120 <Method void MediaRouter.addCallback(MediaRouteSelector, android.support.v7.media.MediaRouter$Callback, int)>
				}
				refreshRoutes();
	//   25   51:aload_0         
	//   26   52:invokevirtual   #123 <Method void refreshRoutes()>
			}
			return;
	//   27   55:return          
		} else
		{
			throw new IllegalArgumentException("selector must not be null");
	//   28   56:new             #281 <Class IllegalArgumentException>
	//   29   59:dup             
	//   30   60:ldc2            #283 <String "selector must not be null">
	//   31   63:invokespecial   #286 <Method void IllegalArgumentException(String)>
	//   32   66:athrow          
		}
	}

	void updateLayout()
	{
		getWindow().setLayout(-1, -1);
	//    0    0:aload_0         
	//    1    1:invokevirtual   #290 <Method Window getWindow()>
	//    2    4:iconst_m1       
	//    3    5:iconst_m1       
	//    4    6:invokevirtual   #296 <Method void Window.setLayout(int, int)>
	//    5    9:return          
	}

	void updateRoutes(List list)
	{
		mLastUpdateTime = SystemClock.uptimeMillis();
	//    0    0:aload_0         
	//    1    1:invokestatic    #260 <Method long SystemClock.uptimeMillis()>
	//    2    4:putfield        #262 <Field long mLastUpdateTime>
		mRoutes.clear();
	//    3    7:aload_0         
	//    4    8:getfield        #142 <Field List mRoutes>
	//    5   11:invokeinterface #299 <Method void List.clear()>
		mRoutes.addAll(((java.util.Collection) (list)));
	//    6   16:aload_0         
	//    7   17:getfield        #142 <Field List mRoutes>
	//    8   20:aload_1         
	//    9   21:invokeinterface #303 <Method boolean List.addAll(java.util.Collection)>
	//   10   26:pop             
		mAdapter.setItems();
	//   11   27:aload_0         
	//   12   28:getfield        #167 <Field MediaRouteDevicePickerDialog$RecyclerAdapter mAdapter>
	//   13   31:invokevirtual   #306 <Method void MediaRouteDevicePickerDialog$RecyclerAdapter.setItems()>
	//   14   34:return          
	}

	private static final int ITEM_TYPE_HEADER = 1;
	private static final int ITEM_TYPE_NONE = 0;
	private static final int ITEM_TYPE_ROUTE = 2;
	static final int MSG_UPDATE_ROUTES = 1;
	private static final String TAG = "MediaRouteDevicePickerDialog";
	private RecyclerAdapter mAdapter;
	private boolean mAttachedToWindow;
	private final MediaRouterCallback mCallback;
	private ImageButton mCloseButton;
	Context mContext;
	private final Handler mHandler;
	private long mLastUpdateTime;
	private RecyclerView mRecyclerView;
	private final MediaRouter mRouter;
	List mRoutes;
	private MediaRouteSelector mSelector;
	private long mUpdateRoutesDelayMs;

	private class _cls1 extends Handler
	{

		public void handleMessage(Message message)
		{
			if(message.what != 1)
		//*   0    0:aload_1         
		//*   1    1:getfield        #22  <Field int Message.what>
		//*   2    4:iconst_1        
		//*   3    5:icmpeq          9
			{
				return;
		//    4    8:return          
			} else
			{
				updateRoutes((List)message.obj);
		//    5    9:aload_0         
		//    6   10:getfield        #10  <Field MediaRouteDevicePickerDialog this$0>
		//    7   13:aload_1         
		//    8   14:getfield        #26  <Field Object Message.obj>
		//    9   17:checkcast       #28  <Class List>
		//   10   20:invokevirtual   #34  <Method void MediaRouteDevicePickerDialog.updateRoutes(List)>
				return;
		//   11   23:return          
			}
		}

		final MediaRouteDevicePickerDialog this$0;

		_cls1()
		{
			this$0 = MediaRouteDevicePickerDialog.this;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #10  <Field MediaRouteDevicePickerDialog this$0>
			super();
		//    3    5:aload_0         
		//    4    6:invokespecial   #13  <Method void Handler()>
		//    5    9:return          
		}
	}


	private class MediaRouterCallback extends android.support.v7.media.MediaRouter.Callback
	{

		public void onRouteAdded(MediaRouter mediarouter, android.support.v7.media.MediaRouter.RouteInfo routeinfo)
		{
			refreshRoutes();
		//    0    0:aload_0         
		//    1    1:getfield        #10  <Field MediaRouteDevicePickerDialog this$0>
		//    2    4:invokevirtual   #21  <Method void MediaRouteDevicePickerDialog.refreshRoutes()>
		//    3    7:return          
		}

		public void onRouteChanged(MediaRouter mediarouter, android.support.v7.media.MediaRouter.RouteInfo routeinfo)
		{
			refreshRoutes();
		//    0    0:aload_0         
		//    1    1:getfield        #10  <Field MediaRouteDevicePickerDialog this$0>
		//    2    4:invokevirtual   #21  <Method void MediaRouteDevicePickerDialog.refreshRoutes()>
		//    3    7:return          
		}

		public void onRouteRemoved(MediaRouter mediarouter, android.support.v7.media.MediaRouter.RouteInfo routeinfo)
		{
			refreshRoutes();
		//    0    0:aload_0         
		//    1    1:getfield        #10  <Field MediaRouteDevicePickerDialog this$0>
		//    2    4:invokevirtual   #21  <Method void MediaRouteDevicePickerDialog.refreshRoutes()>
		//    3    7:return          
		}

		public void onRouteSelected(MediaRouter mediarouter, android.support.v7.media.MediaRouter.RouteInfo routeinfo)
		{
			dismiss();
		//    0    0:aload_0         
		//    1    1:getfield        #10  <Field MediaRouteDevicePickerDialog this$0>
		//    2    4:invokevirtual   #27  <Method void MediaRouteDevicePickerDialog.dismiss()>
		//    3    7:return          
		}

		final MediaRouteDevicePickerDialog this$0;

		MediaRouterCallback()
		{
			this$0 = MediaRouteDevicePickerDialog.this;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #10  <Field MediaRouteDevicePickerDialog this$0>
			super();
		//    3    5:aload_0         
		//    4    6:invokespecial   #13  <Method void android.support.v7.media.MediaRouter$Callback()>
		//    5    9:return          
		}
	}


	private class _cls2
		implements android.view.View.OnClickListener
	{

		public void onClick(View view)
		{
			dismiss();
		//    0    0:aload_0         
		//    1    1:getfield        #12  <Field MediaRouteDevicePickerDialog this$0>
		//    2    4:invokevirtual   #23  <Method void MediaRouteDevicePickerDialog.dismiss()>
		//    3    7:return          
		}

		final MediaRouteDevicePickerDialog this$0;

		_cls2()
		{
			this$0 = MediaRouteDevicePickerDialog.this;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #12  <Field MediaRouteDevicePickerDialog this$0>
			super();
		//    3    5:aload_0         
		//    4    6:invokespecial   #15  <Method void Object()>
		//    5    9:return          
		}
	}


	private class RecyclerAdapter extends android.support.v7.widget.RecyclerView.Adapter
	{

		private Drawable getDefaultIconDrawable(android.support.v7.media.MediaRouter.RouteInfo routeinfo)
		{
			switch(routeinfo.getDeviceType())
		//*   0    0:aload_1         
		//*   1    1:invokevirtual   #75  <Method int android.support.v7.media.MediaRouter$RouteInfo.getDeviceType()>
			{
		//*   2    4:tableswitch     1 2: default 28
		//		               1 45
		//		               2 40
			default:
				if(routeinfo instanceof android.support.v7.media.MediaRouter.RouteGroup)
		//*   3   28:aload_1         
		//*   4   29:instanceof      #77  <Class android.support.v7.media.MediaRouter$RouteGroup>
		//*   5   32:ifeq            50
					return mSpeakerGroupIcon;
		//    6   35:aload_0         
		//    7   36:getfield        #63  <Field Drawable mSpeakerGroupIcon>
		//    8   39:areturn         
				else
		//*   9   40:aload_0         
		//*  10   41:getfield        #58  <Field Drawable mSpeakerIcon>
		//*  11   44:areturn         
		//*  12   45:aload_0         
		//*  13   46:getfield        #53  <Field Drawable mTvIcon>
		//*  14   49:areturn         
					return mDefaultIcon;
		//   15   50:aload_0         
		//   16   51:getfield        #48  <Field Drawable mDefaultIcon>
		//   17   54:areturn         

			case 2: // '\002'
				return mSpeakerIcon;

			case 1: // '\001'
				return mTvIcon;
			}
		}

		Drawable getIconDrawable(android.support.v7.media.MediaRouter.RouteInfo routeinfo)
		{
			android.net.Uri uri;
			uri = routeinfo.getIconUri();
		//    0    0:aload_1         
		//    1    1:invokevirtual   #84  <Method android.net.Uri android.support.v7.media.MediaRouter$RouteInfo.getIconUri()>
		//    2    4:astore_2        
			if(uri == null)
				break MISSING_BLOCK_LABEL_71;
		//    3    5:aload_2         
		//    4    6:ifnull          71
			Drawable drawable = Drawable.createFromStream(mContext.getContentResolver().openInputStream(uri), ((String) (null)));
		//    5    9:aload_0         
		//    6   10:getfield        #23  <Field MediaRouteDevicePickerDialog this$0>
		//    7   13:getfield        #32  <Field Context MediaRouteDevicePickerDialog.mContext>
		//    8   16:invokevirtual   #90  <Method ContentResolver Context.getContentResolver()>
		//    9   19:aload_2         
		//   10   20:invokevirtual   #96  <Method java.io.InputStream ContentResolver.openInputStream(android.net.Uri)>
		//   11   23:aconst_null     
		//   12   24:invokestatic    #102 <Method Drawable Drawable.createFromStream(java.io.InputStream, String)>
		//   13   27:astore_3        
			if(drawable != null)
		//*  14   28:aload_3         
		//*  15   29:ifnull          71
				return drawable;
		//   16   32:aload_3         
		//   17   33:areturn         
			break MISSING_BLOCK_LABEL_71;
			IOException ioexception;
			ioexception;
		//   18   34:astore_3        
			StringBuilder stringbuilder = new StringBuilder();
		//   19   35:new             #104 <Class StringBuilder>
		//   20   38:dup             
		//   21   39:invokespecial   #105 <Method void StringBuilder()>
		//   22   42:astore          4
			stringbuilder.append("Failed to load ");
		//   23   44:aload           4
		//   24   46:ldc1            #107 <String "Failed to load ">
		//   25   48:invokevirtual   #111 <Method StringBuilder StringBuilder.append(String)>
		//   26   51:pop             
			stringbuilder.append(((Object) (uri)));
		//   27   52:aload           4
		//   28   54:aload_2         
		//   29   55:invokevirtual   #114 <Method StringBuilder StringBuilder.append(Object)>
		//   30   58:pop             
			Log.w("RecyclerAdapter", stringbuilder.toString(), ((Throwable) (ioexception)));
		//   31   59:ldc1            #8   <String "RecyclerAdapter">
		//   32   61:aload           4
		//   33   63:invokevirtual   #118 <Method String StringBuilder.toString()>
		//   34   66:aload_3         
		//   35   67:invokestatic    #124 <Method int Log.w(String, String, Throwable)>
		//   36   70:pop             
			return getDefaultIconDrawable(routeinfo);
		//   37   71:aload_0         
		//   38   72:aload_1         
		//   39   73:invokespecial   #126 <Method Drawable getDefaultIconDrawable(android.support.v7.media.MediaRouter$RouteInfo)>
		//   40   76:areturn         
		}

		public Item getItem(int i)
		{
			class Item
			{

				public Object getData()
				{
					return mData;
				//    0    0:aload_0         
				//    1    1:getfield        #19  <Field Object mData>
				//    2    4:areturn         
				}

				public int getType()
				{
					return mType;
				//    0    0:aload_0         
				//    1    1:getfield        #23  <Field int mType>
				//    2    4:ireturn         
				}

				private final Object mData;
				private final int mType;
				final RecyclerAdapter this$1;

				Item(Object obj)
				{
					this$1 = RecyclerAdapter.this;
				//    0    0:aload_0         
				//    1    1:aload_1         
				//    2    2:putfield        #14  <Field MediaRouteDevicePickerDialog$RecyclerAdapter this$1>
					super();
				//    3    5:aload_0         
				//    4    6:invokespecial   #17  <Method void Object()>
					mData = obj;
				//    5    9:aload_0         
				//    6   10:aload_2         
				//    7   11:putfield        #19  <Field Object mData>
					if(obj instanceof String)
				//*   8   14:aload_2         
				//*   9   15:instanceof      #21  <Class String>
				//*  10   18:ifeq            27
					{
						mType = 1;
				//   11   21:aload_0         
				//   12   22:iconst_1        
				//   13   23:putfield        #23  <Field int mType>
						return;
				//   14   26:return          
					}
					if(obj instanceof android.support.v7.media.MediaRouter.RouteInfo)
				//*  15   27:aload_2         
				//*  16   28:instanceof      #25  <Class android.support.v7.media.MediaRouter$RouteInfo>
				//*  17   31:ifeq            40
					{
						mType = 2;
				//   18   34:aload_0         
				//   19   35:iconst_2        
				//   20   36:putfield        #23  <Field int mType>
						return;
				//   21   39:return          
					} else
					{
						mType = 0;
				//   22   40:aload_0         
				//   23   41:iconst_0        
				//   24   42:putfield        #23  <Field int mType>
						Log.w("RecyclerAdapter", "Wrong type of data passed to Item constructor");
				//   25   45:ldc1            #27  <String "RecyclerAdapter">
				//   26   47:ldc1            #29  <String "Wrong type of data passed to Item constructor">
				//   27   49:invokestatic    #35  <Method int Log.w(String, String)>
				//   28   52:pop             
						return;
				//   29   53:return          
					}
				}
			}

			return (Item)mItems.get(i);
		//    0    0:aload_0         
		//    1    1:getfield        #130 <Field ArrayList mItems>
		//    2    4:iload_1         
		//    3    5:invokevirtual   #136 <Method Object ArrayList.get(int)>
		//    4    8:checkcast       #138 <Class MediaRouteDevicePickerDialog$RecyclerAdapter$Item>
		//    5   11:areturn         
		}

		public int getItemCount()
		{
			return mItems.size();
		//    0    0:aload_0         
		//    1    1:getfield        #130 <Field ArrayList mItems>
		//    2    4:invokevirtual   #142 <Method int ArrayList.size()>
		//    3    7:ireturn         
		}

		public int getItemViewType(int i)
		{
			return ((Item)mItems.get(i)).getType();
		//    0    0:aload_0         
		//    1    1:getfield        #130 <Field ArrayList mItems>
		//    2    4:iload_1         
		//    3    5:invokevirtual   #136 <Method Object ArrayList.get(int)>
		//    4    8:checkcast       #138 <Class MediaRouteDevicePickerDialog$RecyclerAdapter$Item>
		//    5   11:invokevirtual   #147 <Method int MediaRouteDevicePickerDialog$RecyclerAdapter$Item.getType()>
		//    6   14:ireturn         
		}

		public void onBindViewHolder(android.support.v7.widget.RecyclerView.ViewHolder viewholder, int i)
		{
			int j = getItemViewType(i);
		//    0    0:aload_0         
		//    1    1:iload_2         
		//    2    2:invokevirtual   #151 <Method int getItemViewType(int)>
		//    3    5:istore_3        
			Item item = getItem(i);
		//    4    6:aload_0         
		//    5    7:iload_2         
		//    6    8:invokevirtual   #153 <Method MediaRouteDevicePickerDialog$RecyclerAdapter$Item getItem(int)>
		//    7   11:astore          4
			switch(j)
		//*   8   13:iload_3         
			{
		//*   9   14:tableswitch     1 2: default 36
		//		               1 55
		//		               2 45
			default:
				Log.w("RecyclerAdapter", "Cannot bind item to ViewHolder because of wrong view type");
		//   10   36:ldc1            #8   <String "RecyclerAdapter">
		//   11   38:ldc1            #155 <String "Cannot bind item to ViewHolder because of wrong view type">
		//   12   40:invokestatic    #158 <Method int Log.w(String, String)>
		//   13   43:pop             
				return;
		//   14   44:return          

			case 2: // '\002'
				class RouteViewHolder extends android.support.v7.widget.RecyclerView.ViewHolder
				{

					public void bindRouteView(final Item route)
					{
						route = ((Item) ((android.support.v7.media.MediaRouter.RouteInfo)route.getData()));
					//    0    0:aload_1         
					//    1    1:invokevirtual   #53  <Method Object MediaRouteDevicePickerDialog$RecyclerAdapter$Item.getData()>
					//    2    4:checkcast       #55  <Class android.support.v7.media.MediaRouter$RouteInfo>
					//    3    7:astore_1        
						class _cls1
							implements android.view.View.OnClickListener
						{

							public void onClick(View view)
							{
								route.select();
							//    0    0:aload_0         
							//    1    1:getfield        #16  <Field android.support.v7.media.MediaRouter$RouteInfo val$route>
							//    2    4:invokevirtual   #27  <Method void android.support.v7.media.MediaRouter$RouteInfo.select()>
							//    3    7:return          
							}

							final RouteViewHolder this$2;
							final android.support.v7.media.MediaRouter.RouteInfo val$route;

								_cls1()
								{
									this$2 = RouteViewHolder.this;
								//    0    0:aload_0         
								//    1    1:aload_1         
								//    2    2:putfield        #14  <Field MediaRouteDevicePickerDialog$RecyclerAdapter$RouteViewHolder this$2>
									route = routeinfo;
								//    3    5:aload_0         
								//    4    6:aload_2         
								//    5    7:putfield        #16  <Field android.support.v7.media.MediaRouter$RouteInfo val$route>
									super();
								//    6   10:aload_0         
								//    7   11:invokespecial   #19  <Method void Object()>
								//    8   14:return          
								}
						}

						mItemView.setOnClickListener(((android.view.View.OnClickListener) (new _cls1())));
					//    4    8:aload_0         
					//    5    9:getfield        #21  <Field View mItemView>
					//    6   12:new             #57  <Class MediaRouteDevicePickerDialog$RecyclerAdapter$RouteViewHolder$1>
					//    7   15:dup             
					//    8   16:aload_0         
					//    9   17:aload_1         
					//   10   18:invokespecial   #60  <Method void MediaRouteDevicePickerDialog$RecyclerAdapter$RouteViewHolder$1(MediaRouteDevicePickerDialog$RecyclerAdapter$RouteViewHolder, android.support.v7.media.MediaRouter$RouteInfo)>
					//   11   21:invokevirtual   #64  <Method void View.setOnClickListener(android.view.View$OnClickListener)>
						mTextView.setText(((CharSequence) (((android.support.v7.media.MediaRouter.RouteInfo) (route)).getName())));
					//   12   24:aload_0         
					//   13   25:getfield        #37  <Field TextView mTextView>
					//   14   28:aload_1         
					//   15   29:invokevirtual   #68  <Method String android.support.v7.media.MediaRouter$RouteInfo.getName()>
					//   16   32:invokevirtual   #72  <Method void TextView.setText(CharSequence)>
						mImageView.setImageDrawable(getIconDrawable(((android.support.v7.media.MediaRouter.RouteInfo) (route))));
					//   17   35:aload_0         
					//   18   36:getfield        #44  <Field ImageView mImageView>
					//   19   39:aload_0         
					//   20   40:getfield        #16  <Field MediaRouteDevicePickerDialog$RecyclerAdapter this$1>
					//   21   43:aload_1         
					//   22   44:invokevirtual   #78  <Method Drawable MediaRouteDevicePickerDialog$RecyclerAdapter.getIconDrawable(android.support.v7.media.MediaRouter$RouteInfo)>
					//   23   47:invokevirtual   #82  <Method void ImageView.setImageDrawable(Drawable)>
					//   24   50:return          
					}

					ImageView mImageView;
					View mItemView;
					TextView mTextView;
					final RecyclerAdapter this$1;

				RouteViewHolder(View view)
				{
					this$1 = RecyclerAdapter.this;
				//    0    0:aload_0         
				//    1    1:aload_1         
				//    2    2:putfield        #16  <Field MediaRouteDevicePickerDialog$RecyclerAdapter this$1>
					super(view);
				//    3    5:aload_0         
				//    4    6:aload_2         
				//    5    7:invokespecial   #19  <Method void android.support.v7.widget.RecyclerView$ViewHolder(View)>
					mItemView = view;
				//    6   10:aload_0         
				//    7   11:aload_2         
				//    8   12:putfield        #21  <Field View mItemView>
					mTextView = (TextView)view.findViewById(android.support.v7.mediarouter.R.id.mr_picker_route_name);
				//    9   15:aload_0         
				//   10   16:aload_2         
				//   11   17:getstatic       #27  <Field int android.support.v7.mediarouter.R$id.mr_picker_route_name>
				//   12   20:invokevirtual   #33  <Method View View.findViewById(int)>
				//   13   23:checkcast       #35  <Class TextView>
				//   14   26:putfield        #37  <Field TextView mTextView>
					mImageView = (ImageView)view.findViewById(android.support.v7.mediarouter.R.id.mr_picker_route_icon);
				//   15   29:aload_0         
				//   16   30:aload_2         
				//   17   31:getstatic       #40  <Field int android.support.v7.mediarouter.R$id.mr_picker_route_icon>
				//   18   34:invokevirtual   #33  <Method View View.findViewById(int)>
				//   19   37:checkcast       #42  <Class ImageView>
				//   20   40:putfield        #44  <Field ImageView mImageView>
				//   21   43:return          
				}
				}

				((RouteViewHolder)viewholder).bindRouteView(item);
		//   15   45:aload_1         
		//   16   46:checkcast       #160 <Class MediaRouteDevicePickerDialog$RecyclerAdapter$RouteViewHolder>
		//   17   49:aload           4
		//   18   51:invokevirtual   #164 <Method void MediaRouteDevicePickerDialog$RecyclerAdapter$RouteViewHolder.bindRouteView(MediaRouteDevicePickerDialog$RecyclerAdapter$Item)>
				return;
		//   19   54:return          

			case 1: // '\001'
				class HeaderViewHolder extends android.support.v7.widget.RecyclerView.ViewHolder
				{

					public void binHeaderView(Item item1)
					{
						item1 = ((Item) (item1.getData().toString()));
					//    0    0:aload_1         
					//    1    1:invokevirtual   #40  <Method Object MediaRouteDevicePickerDialog$RecyclerAdapter$Item.getData()>
					//    2    4:invokevirtual   #46  <Method String Object.toString()>
					//    3    7:astore_1        
						mTextView.setText(((CharSequence) (item1)));
					//    4    8:aload_0         
					//    5    9:getfield        #31  <Field TextView mTextView>
					//    6   12:aload_1         
					//    7   13:invokevirtual   #50  <Method void TextView.setText(CharSequence)>
					//    8   16:return          
					}

					TextView mTextView;
					final RecyclerAdapter this$1;

				HeaderViewHolder(View view)
				{
					this$1 = RecyclerAdapter.this;
				//    0    0:aload_0         
				//    1    1:aload_1         
				//    2    2:putfield        #12  <Field MediaRouteDevicePickerDialog$RecyclerAdapter this$1>
					super(view);
				//    3    5:aload_0         
				//    4    6:aload_2         
				//    5    7:invokespecial   #15  <Method void android.support.v7.widget.RecyclerView$ViewHolder(View)>
					mTextView = (TextView)view.findViewById(android.support.v7.mediarouter.R.id.mr_dialog_header_name);
				//    6   10:aload_0         
				//    7   11:aload_2         
				//    8   12:getstatic       #21  <Field int android.support.v7.mediarouter.R$id.mr_dialog_header_name>
				//    9   15:invokevirtual   #27  <Method View View.findViewById(int)>
				//   10   18:checkcast       #29  <Class TextView>
				//   11   21:putfield        #31  <Field TextView mTextView>
				//   12   24:return          
				}
				}

				((HeaderViewHolder)viewholder).binHeaderView(item);
		//   20   55:aload_1         
		//   21   56:checkcast       #166 <Class MediaRouteDevicePickerDialog$RecyclerAdapter$HeaderViewHolder>
		//   22   59:aload           4
		//   23   61:invokevirtual   #169 <Method void MediaRouteDevicePickerDialog$RecyclerAdapter$HeaderViewHolder.binHeaderView(MediaRouteDevicePickerDialog$RecyclerAdapter$Item)>
				return;
		//   24   64:return          
			}
		}

		public android.support.v7.widget.RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewgroup, int i)
		{
			switch(i)
		//*   0    0:iload_2         
			{
		//*   1    1:tableswitch     1 2: default 24
		//		               1 55
		//		               2 34
			default:
				Log.w("RecyclerAdapter", "Cannot create ViewHolder because of wrong view type");
		//    2   24:ldc1            #8   <String "RecyclerAdapter">
		//    3   26:ldc1            #173 <String "Cannot create ViewHolder because of wrong view type">
		//    4   28:invokestatic    #158 <Method int Log.w(String, String)>
		//    5   31:pop             
				return null;
		//    6   32:aconst_null     
		//    7   33:areturn         

			case 2: // '\002'
				return ((android.support.v7.widget.RecyclerView.ViewHolder) (new RouteViewHolder(mInflater.inflate(android.support.v7.mediarouter.R.layout.mr_picker_route_item, viewgroup, false))));
		//    8   34:new             #160 <Class MediaRouteDevicePickerDialog$RecyclerAdapter$RouteViewHolder>
		//    9   37:dup             
		//   10   38:aload_0         
		//   11   39:aload_0         
		//   12   40:getfield        #40  <Field LayoutInflater mInflater>
		//   13   43:getstatic       #179 <Field int android.support.v7.mediarouter.R$layout.mr_picker_route_item>
		//   14   46:aload_1         
		//   15   47:iconst_0        
		//   16   48:invokevirtual   #183 <Method View LayoutInflater.inflate(int, ViewGroup, boolean)>
		//   17   51:invokespecial   #186 <Method void MediaRouteDevicePickerDialog$RecyclerAdapter$RouteViewHolder(MediaRouteDevicePickerDialog$RecyclerAdapter, View)>
		//   18   54:areturn         

			case 1: // '\001'
				return ((android.support.v7.widget.RecyclerView.ViewHolder) (new HeaderViewHolder(mInflater.inflate(android.support.v7.mediarouter.R.layout.mr_dialog_header_item, viewgroup, false))));
		//   19   55:new             #166 <Class MediaRouteDevicePickerDialog$RecyclerAdapter$HeaderViewHolder>
		//   20   58:dup             
		//   21   59:aload_0         
		//   22   60:aload_0         
		//   23   61:getfield        #40  <Field LayoutInflater mInflater>
		//   24   64:getstatic       #189 <Field int android.support.v7.mediarouter.R$layout.mr_dialog_header_item>
		//   25   67:aload_1         
		//   26   68:iconst_0        
		//   27   69:invokevirtual   #183 <Method View LayoutInflater.inflate(int, ViewGroup, boolean)>
		//   28   72:invokespecial   #190 <Method void MediaRouteDevicePickerDialog$RecyclerAdapter$HeaderViewHolder(MediaRouteDevicePickerDialog$RecyclerAdapter, View)>
		//   29   75:areturn         
			}
		}

		void setItems()
		{
			mItems = new ArrayList();
		//    0    0:aload_0         
		//    1    1:new             #132 <Class ArrayList>
		//    2    4:dup             
		//    3    5:invokespecial   #191 <Method void ArrayList()>
		//    4    8:putfield        #130 <Field ArrayList mItems>
			Object obj = ((Object) (new ArrayList()));
		//    5   11:new             #132 <Class ArrayList>
		//    6   14:dup             
		//    7   15:invokespecial   #191 <Method void ArrayList()>
		//    8   18:astore_2        
			for(int i = mRoutes.size() - 1; i >= 0; i--)
		//*   9   19:aload_0         
		//*  10   20:getfield        #23  <Field MediaRouteDevicePickerDialog this$0>
		//*  11   23:getfield        #195 <Field List MediaRouteDevicePickerDialog.mRoutes>
		//*  12   26:invokeinterface #198 <Method int List.size()>
		//*  13   31:iconst_1        
		//*  14   32:isub            
		//*  15   33:istore_1        
		//*  16   34:iload_1         
		//*  17   35:iflt            89
			{
				android.support.v7.media.MediaRouter.RouteInfo routeinfo = (android.support.v7.media.MediaRouter.RouteInfo)mRoutes.get(i);
		//   18   38:aload_0         
		//   19   39:getfield        #23  <Field MediaRouteDevicePickerDialog this$0>
		//   20   42:getfield        #195 <Field List MediaRouteDevicePickerDialog.mRoutes>
		//   21   45:iload_1         
		//   22   46:invokeinterface #199 <Method Object List.get(int)>
		//   23   51:checkcast       #71  <Class android.support.v7.media.MediaRouter$RouteInfo>
		//   24   54:astore_3        
				if(routeinfo instanceof android.support.v7.media.MediaRouter.RouteGroup)
		//*  25   55:aload_3         
		//*  26   56:instanceof      #77  <Class android.support.v7.media.MediaRouter$RouteGroup>
		//*  27   59:ifeq            82
				{
					((ArrayList) (obj)).add(((Object) (routeinfo)));
		//   28   62:aload_2         
		//   29   63:aload_3         
		//   30   64:invokevirtual   #203 <Method boolean ArrayList.add(Object)>
		//   31   67:pop             
					mRoutes.remove(i);
		//   32   68:aload_0         
		//   33   69:getfield        #23  <Field MediaRouteDevicePickerDialog this$0>
		//   34   72:getfield        #195 <Field List MediaRouteDevicePickerDialog.mRoutes>
		//   35   75:iload_1         
		//   36   76:invokeinterface #206 <Method Object List.remove(int)>
		//   37   81:pop             
				}
			}

		//   38   82:iload_1         
		//   39   83:iconst_1        
		//   40   84:isub            
		//   41   85:istore_1        
		//*  42   86:goto            34
			mItems.add(((Object) (new Item(((Object) (mContext.getString(android.support.v7.mediarouter.R.string.mr_dialog_device_header)))))));
		//   43   89:aload_0         
		//   44   90:getfield        #130 <Field ArrayList mItems>
		//   45   93:new             #138 <Class MediaRouteDevicePickerDialog$RecyclerAdapter$Item>
		//   46   96:dup             
		//   47   97:aload_0         
		//   48   98:aload_0         
		//   49   99:getfield        #23  <Field MediaRouteDevicePickerDialog this$0>
		//   50  102:getfield        #32  <Field Context MediaRouteDevicePickerDialog.mContext>
		//   51  105:getstatic       #211 <Field int android.support.v7.mediarouter.R$string.mr_dialog_device_header>
		//   52  108:invokevirtual   #215 <Method String Context.getString(int)>
		//   53  111:invokespecial   #218 <Method void MediaRouteDevicePickerDialog$RecyclerAdapter$Item(MediaRouteDevicePickerDialog$RecyclerAdapter, Object)>
		//   54  114:invokevirtual   #203 <Method boolean ArrayList.add(Object)>
		//   55  117:pop             
			android.support.v7.media.MediaRouter.RouteInfo routeinfo2;
			for(Iterator iterator = mRoutes.iterator(); iterator.hasNext(); mItems.add(((Object) (new Item(((Object) (routeinfo2)))))))
		//*  56  118:aload_0         
		//*  57  119:getfield        #23  <Field MediaRouteDevicePickerDialog this$0>
		//*  58  122:getfield        #195 <Field List MediaRouteDevicePickerDialog.mRoutes>
		//*  59  125:invokeinterface #222 <Method Iterator List.iterator()>
		//*  60  130:astore_3        
		//*  61  131:aload_3         
		//*  62  132:invokeinterface #228 <Method boolean Iterator.hasNext()>
		//*  63  137:ifeq            172
				routeinfo2 = (android.support.v7.media.MediaRouter.RouteInfo)iterator.next();
		//   64  140:aload_3         
		//   65  141:invokeinterface #232 <Method Object Iterator.next()>
		//   66  146:checkcast       #71  <Class android.support.v7.media.MediaRouter$RouteInfo>
		//   67  149:astore          4

		//   68  151:aload_0         
		//   69  152:getfield        #130 <Field ArrayList mItems>
		//   70  155:new             #138 <Class MediaRouteDevicePickerDialog$RecyclerAdapter$Item>
		//   71  158:dup             
		//   72  159:aload_0         
		//   73  160:aload           4
		//   74  162:invokespecial   #218 <Method void MediaRouteDevicePickerDialog$RecyclerAdapter$Item(MediaRouteDevicePickerDialog$RecyclerAdapter, Object)>
		//   75  165:invokevirtual   #203 <Method boolean ArrayList.add(Object)>
		//   76  168:pop             
		//*  77  169:goto            131
			mItems.add(((Object) (new Item(((Object) (mContext.getString(android.support.v7.mediarouter.R.string.mr_dialog_route_header)))))));
		//   78  172:aload_0         
		//   79  173:getfield        #130 <Field ArrayList mItems>
		//   80  176:new             #138 <Class MediaRouteDevicePickerDialog$RecyclerAdapter$Item>
		//   81  179:dup             
		//   82  180:aload_0         
		//   83  181:aload_0         
		//   84  182:getfield        #23  <Field MediaRouteDevicePickerDialog this$0>
		//   85  185:getfield        #32  <Field Context MediaRouteDevicePickerDialog.mContext>
		//   86  188:getstatic       #235 <Field int android.support.v7.mediarouter.R$string.mr_dialog_route_header>
		//   87  191:invokevirtual   #215 <Method String Context.getString(int)>
		//   88  194:invokespecial   #218 <Method void MediaRouteDevicePickerDialog$RecyclerAdapter$Item(MediaRouteDevicePickerDialog$RecyclerAdapter, Object)>
		//   89  197:invokevirtual   #203 <Method boolean ArrayList.add(Object)>
		//   90  200:pop             
			android.support.v7.media.MediaRouter.RouteInfo routeinfo1;
			for(obj = ((Object) (((ArrayList) (obj)).iterator())); ((Iterator) (obj)).hasNext(); mItems.add(((Object) (new Item(((Object) (routeinfo1)))))))
		//*  91  201:aload_2         
		//*  92  202:invokevirtual   #236 <Method Iterator ArrayList.iterator()>
		//*  93  205:astore_2        
		//*  94  206:aload_2         
		//*  95  207:invokeinterface #228 <Method boolean Iterator.hasNext()>
		//*  96  212:ifeq            245
				routeinfo1 = (android.support.v7.media.MediaRouter.RouteInfo)((Iterator) (obj)).next();
		//   97  215:aload_2         
		//   98  216:invokeinterface #232 <Method Object Iterator.next()>
		//   99  221:checkcast       #71  <Class android.support.v7.media.MediaRouter$RouteInfo>
		//  100  224:astore_3        

		//  101  225:aload_0         
		//  102  226:getfield        #130 <Field ArrayList mItems>
		//  103  229:new             #138 <Class MediaRouteDevicePickerDialog$RecyclerAdapter$Item>
		//  104  232:dup             
		//  105  233:aload_0         
		//  106  234:aload_3         
		//  107  235:invokespecial   #218 <Method void MediaRouteDevicePickerDialog$RecyclerAdapter$Item(MediaRouteDevicePickerDialog$RecyclerAdapter, Object)>
		//  108  238:invokevirtual   #203 <Method boolean ArrayList.add(Object)>
		//  109  241:pop             
		//* 110  242:goto            206
			notifyDataSetChanged();
		//  111  245:aload_0         
		//  112  246:invokevirtual   #239 <Method void notifyDataSetChanged()>
		//  113  249:return          
		}

		private static final String TAG = "RecyclerAdapter";
		private final Drawable mDefaultIcon;
		private final LayoutInflater mInflater;
		ArrayList mItems;
		private final Drawable mSpeakerGroupIcon;
		private final Drawable mSpeakerIcon;
		private final Drawable mTvIcon;
		final MediaRouteDevicePickerDialog this$0;

		RecyclerAdapter()
		{
			this$0 = MediaRouteDevicePickerDialog.this;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #23  <Field MediaRouteDevicePickerDialog this$0>
			super();
		//    3    5:aload_0         
		//    4    6:invokespecial   #26  <Method void android.support.v7.widget.RecyclerView$Adapter()>
			mInflater = LayoutInflater.from(mContext);
		//    5    9:aload_0         
		//    6   10:aload_1         
		//    7   11:getfield        #32  <Field Context MediaRouteDevicePickerDialog.mContext>
		//    8   14:invokestatic    #38  <Method LayoutInflater LayoutInflater.from(Context)>
		//    9   17:putfield        #40  <Field LayoutInflater mInflater>
			mDefaultIcon = MediaRouterThemeHelper.getDefaultDrawableIcon(mContext);
		//   10   20:aload_0         
		//   11   21:aload_1         
		//   12   22:getfield        #32  <Field Context MediaRouteDevicePickerDialog.mContext>
		//   13   25:invokestatic    #46  <Method Drawable MediaRouterThemeHelper.getDefaultDrawableIcon(Context)>
		//   14   28:putfield        #48  <Field Drawable mDefaultIcon>
			mTvIcon = MediaRouterThemeHelper.getTvDrawableIcon(mContext);
		//   15   31:aload_0         
		//   16   32:aload_1         
		//   17   33:getfield        #32  <Field Context MediaRouteDevicePickerDialog.mContext>
		//   18   36:invokestatic    #51  <Method Drawable MediaRouterThemeHelper.getTvDrawableIcon(Context)>
		//   19   39:putfield        #53  <Field Drawable mTvIcon>
			mSpeakerIcon = MediaRouterThemeHelper.getSpeakerDrawableIcon(mContext);
		//   20   42:aload_0         
		//   21   43:aload_1         
		//   22   44:getfield        #32  <Field Context MediaRouteDevicePickerDialog.mContext>
		//   23   47:invokestatic    #56  <Method Drawable MediaRouterThemeHelper.getSpeakerDrawableIcon(Context)>
		//   24   50:putfield        #58  <Field Drawable mSpeakerIcon>
			mSpeakerGroupIcon = MediaRouterThemeHelper.getSpeakerGropuIcon(mContext);
		//   25   53:aload_0         
		//   26   54:aload_1         
		//   27   55:getfield        #32  <Field Context MediaRouteDevicePickerDialog.mContext>
		//   28   58:invokestatic    #61  <Method Drawable MediaRouterThemeHelper.getSpeakerGropuIcon(Context)>
		//   29   61:putfield        #63  <Field Drawable mSpeakerGroupIcon>
			setItems();
		//   30   64:aload_0         
		//   31   65:invokevirtual   #66  <Method void setItems()>
		//   32   68:return          
		}
	}


	private class RouteComparator
		implements Comparator
	{

		public int compare(android.support.v7.media.MediaRouter.RouteInfo routeinfo, android.support.v7.media.MediaRouter.RouteInfo routeinfo1)
		{
			return routeinfo.getName().compareToIgnoreCase(routeinfo1.getName());
		//    0    0:aload_1         
		//    1    1:invokevirtual   #25  <Method String android.support.v7.media.MediaRouter$RouteInfo.getName()>
		//    2    4:aload_2         
		//    3    5:invokevirtual   #25  <Method String android.support.v7.media.MediaRouter$RouteInfo.getName()>
		//    4    8:invokevirtual   #31  <Method int String.compareToIgnoreCase(String)>
		//    5   11:ireturn         
		}

		public volatile int compare(Object obj, Object obj1)
		{
			return compare((android.support.v7.media.MediaRouter.RouteInfo)obj, (android.support.v7.media.MediaRouter.RouteInfo)obj1);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:checkcast       #21  <Class android.support.v7.media.MediaRouter$RouteInfo>
		//    3    5:aload_2         
		//    4    6:checkcast       #21  <Class android.support.v7.media.MediaRouter$RouteInfo>
		//    5    9:invokevirtual   #34  <Method int compare(android.support.v7.media.MediaRouter$RouteInfo, android.support.v7.media.MediaRouter$RouteInfo)>
		//    6   12:ireturn         
		}

		public static final RouteComparator sInstance = new RouteComparator();

		static 
		{
		//    0    0:new             #2   <Class MediaRouteDevicePickerDialog$RouteComparator>
		//    1    3:dup             
		//    2    4:invokespecial   #13  <Method void MediaRouteDevicePickerDialog$RouteComparator()>
		//    3    7:putstatic       #15  <Field MediaRouteDevicePickerDialog$RouteComparator sInstance>
		//*   4   10:return          
		}

		RouteComparator()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #17  <Method void Object()>
		//    2    4:return          
		}
	}

}
