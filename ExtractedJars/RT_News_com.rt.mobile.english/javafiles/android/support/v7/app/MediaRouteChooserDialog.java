// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v7.app;

import android.content.ContentResolver;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.*;
import android.support.v7.media.MediaRouteSelector;
import android.support.v7.media.MediaRouter;
import android.text.TextUtils;
import android.util.Log;
import android.view.*;
import android.widget.*;
import java.io.IOException;
import java.util.*;

// Referenced classes of package android.support.v7.app:
//			AppCompatDialog, MediaRouterThemeHelper, MediaRouteDialogHelper

public class MediaRouteChooserDialog extends AppCompatDialog
{
	private final class MediaRouterCallback extends android.support.v7.media.MediaRouter.Callback
	{

		public void onRouteAdded(MediaRouter mediarouter, android.support.v7.media.MediaRouter.RouteInfo routeinfo)
		{
			refreshRoutes();
		//    0    0:aload_0         
		//    1    1:getfield        #13  <Field MediaRouteChooserDialog this$0>
		//    2    4:invokevirtual   #22  <Method void MediaRouteChooserDialog.refreshRoutes()>
		//    3    7:return          
		}

		public void onRouteChanged(MediaRouter mediarouter, android.support.v7.media.MediaRouter.RouteInfo routeinfo)
		{
			refreshRoutes();
		//    0    0:aload_0         
		//    1    1:getfield        #13  <Field MediaRouteChooserDialog this$0>
		//    2    4:invokevirtual   #22  <Method void MediaRouteChooserDialog.refreshRoutes()>
		//    3    7:return          
		}

		public void onRouteRemoved(MediaRouter mediarouter, android.support.v7.media.MediaRouter.RouteInfo routeinfo)
		{
			refreshRoutes();
		//    0    0:aload_0         
		//    1    1:getfield        #13  <Field MediaRouteChooserDialog this$0>
		//    2    4:invokevirtual   #22  <Method void MediaRouteChooserDialog.refreshRoutes()>
		//    3    7:return          
		}

		public void onRouteSelected(MediaRouter mediarouter, android.support.v7.media.MediaRouter.RouteInfo routeinfo)
		{
			dismiss();
		//    0    0:aload_0         
		//    1    1:getfield        #13  <Field MediaRouteChooserDialog this$0>
		//    2    4:invokevirtual   #28  <Method void MediaRouteChooserDialog.dismiss()>
		//    3    7:return          
		}

		final MediaRouteChooserDialog this$0;

		MediaRouterCallback()
		{
			this$0 = MediaRouteChooserDialog.this;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #13  <Field MediaRouteChooserDialog this$0>
			super();
		//    3    5:aload_0         
		//    4    6:invokespecial   #16  <Method void android.support.v7.media.MediaRouter$Callback()>
		//    5    9:return          
		}
	}

	private final class RouteAdapter extends ArrayAdapter
		implements android.widget.AdapterView.OnItemClickListener
	{

		private Drawable getDefaultIconDrawable(android.support.v7.media.MediaRouter.RouteInfo routeinfo)
		{
			switch(routeinfo.getDeviceType())
		//*   0    0:aload_1         
		//*   1    1:invokevirtual   #88  <Method int android.support.v7.media.MediaRouter$RouteInfo.getDeviceType()>
			{
		//*   2    4:tableswitch     1 2: default 28
		//		               1 45
		//		               2 40
			default:
				if(routeinfo instanceof android.support.v7.media.MediaRouter.RouteGroup)
		//*   3   28:aload_1         
		//*   4   29:instanceof      #90  <Class android.support.v7.media.MediaRouter$RouteGroup>
		//*   5   32:ifeq            50
					return mSpeakerGroupIcon;
		//    6   35:aload_0         
		//    7   36:getfield        #73  <Field Drawable mSpeakerGroupIcon>
		//    8   39:areturn         
				else
		//*   9   40:aload_0         
		//*  10   41:getfield        #71  <Field Drawable mSpeakerIcon>
		//*  11   44:areturn         
		//*  12   45:aload_0         
		//*  13   46:getfield        #69  <Field Drawable mTvIcon>
		//*  14   49:areturn         
					return mDefaultIcon;
		//   15   50:aload_0         
		//   16   51:getfield        #67  <Field Drawable mDefaultIcon>
		//   17   54:areturn         

			case 2: // '\002'
				return mSpeakerIcon;

			case 1: // '\001'
				return mTvIcon;
			}
		}

		private Drawable getIconDrawable(android.support.v7.media.MediaRouter.RouteInfo routeinfo)
		{
			android.net.Uri uri;
			uri = routeinfo.getIconUri();
		//    0    0:aload_1         
		//    1    1:invokevirtual   #97  <Method android.net.Uri android.support.v7.media.MediaRouter$RouteInfo.getIconUri()>
		//    2    4:astore_2        
			if(uri == null)
				break MISSING_BLOCK_LABEL_68;
		//    3    5:aload_2         
		//    4    6:ifnull          68
			Drawable drawable = Drawable.createFromStream(getContext().getContentResolver().openInputStream(uri), ((String) (null)));
		//    5    9:aload_0         
		//    6   10:invokevirtual   #38  <Method Context getContext()>
		//    7   13:invokevirtual   #101 <Method ContentResolver Context.getContentResolver()>
		//    8   16:aload_2         
		//    9   17:invokevirtual   #107 <Method java.io.InputStream ContentResolver.openInputStream(android.net.Uri)>
		//   10   20:aconst_null     
		//   11   21:invokestatic    #113 <Method Drawable Drawable.createFromStream(java.io.InputStream, String)>
		//   12   24:astore_3        
			if(drawable != null)
		//*  13   25:aload_3         
		//*  14   26:ifnull          68
				return drawable;
		//   15   29:aload_3         
		//   16   30:areturn         
			break MISSING_BLOCK_LABEL_68;
			IOException ioexception;
			ioexception;
		//   17   31:astore_3        
			StringBuilder stringbuilder = new StringBuilder();
		//   18   32:new             #115 <Class StringBuilder>
		//   19   35:dup             
		//   20   36:invokespecial   #117 <Method void StringBuilder()>
		//   21   39:astore          4
			stringbuilder.append("Failed to load ");
		//   22   41:aload           4
		//   23   43:ldc1            #119 <String "Failed to load ">
		//   24   45:invokevirtual   #123 <Method StringBuilder StringBuilder.append(String)>
		//   25   48:pop             
			stringbuilder.append(((Object) (uri)));
		//   26   49:aload           4
		//   27   51:aload_2         
		//   28   52:invokevirtual   #126 <Method StringBuilder StringBuilder.append(Object)>
		//   29   55:pop             
			Log.w("MediaRouteChooserDialog", stringbuilder.toString(), ((Throwable) (ioexception)));
		//   30   56:ldc1            #128 <String "MediaRouteChooserDialog">
		//   31   58:aload           4
		//   32   60:invokevirtual   #132 <Method String StringBuilder.toString()>
		//   33   63:aload_3         
		//   34   64:invokestatic    #138 <Method int Log.w(String, String, Throwable)>
		//   35   67:pop             
			return getDefaultIconDrawable(routeinfo);
		//   36   68:aload_0         
		//   37   69:aload_1         
		//   38   70:invokespecial   #140 <Method Drawable getDefaultIconDrawable(android.support.v7.media.MediaRouter$RouteInfo)>
		//   39   73:areturn         
		}

		public boolean areAllItemsEnabled()
		{
			return false;
		//    0    0:iconst_0        
		//    1    1:ireturn         
		}

		public View getView(int i, View view, ViewGroup viewgroup)
		{
			View view1 = view;
		//    0    0:aload_2         
		//    1    1:astore          6
			if(view == null)
		//*   2    3:aload_2         
		//*   3    4:ifnonnull       21
				view1 = mInflater.inflate(android.support.v7.mediarouter.R.layout.mr_chooser_list_item, viewgroup, false);
		//    4    7:aload_0         
		//    5    8:getfield        #34  <Field LayoutInflater mInflater>
		//    6   11:getstatic       #149 <Field int android.support.v7.mediarouter.R$layout.mr_chooser_list_item>
		//    7   14:aload_3         
		//    8   15:iconst_0        
		//    9   16:invokevirtual   #153 <Method View LayoutInflater.inflate(int, ViewGroup, boolean)>
		//   10   19:astore          6
			view = ((View) ((android.support.v7.media.MediaRouter.RouteInfo)getItem(i)));
		//   11   21:aload_0         
		//   12   22:iload_1         
		//   13   23:invokevirtual   #157 <Method Object getItem(int)>
		//   14   26:checkcast       #84  <Class android.support.v7.media.MediaRouter$RouteInfo>
		//   15   29:astore_2        
			viewgroup = ((ViewGroup) ((TextView)view1.findViewById(android.support.v7.mediarouter.R.id.mr_chooser_route_name)));
		//   16   30:aload           6
		//   17   32:getstatic       #162 <Field int android.support.v7.mediarouter.R$id.mr_chooser_route_name>
		//   18   35:invokevirtual   #168 <Method View View.findViewById(int)>
		//   19   38:checkcast       #170 <Class TextView>
		//   20   41:astore_3        
			TextView textview = (TextView)view1.findViewById(android.support.v7.mediarouter.R.id.mr_chooser_route_desc);
		//   21   42:aload           6
		//   22   44:getstatic       #173 <Field int android.support.v7.mediarouter.R$id.mr_chooser_route_desc>
		//   23   47:invokevirtual   #168 <Method View View.findViewById(int)>
		//   24   50:checkcast       #170 <Class TextView>
		//   25   53:astore          7
			((TextView) (viewgroup)).setText(((CharSequence) (((android.support.v7.media.MediaRouter.RouteInfo) (view)).getName())));
		//   26   55:aload_3         
		//   27   56:aload_2         
		//   28   57:invokevirtual   #176 <Method String android.support.v7.media.MediaRouter$RouteInfo.getName()>
		//   29   60:invokevirtual   #180 <Method void TextView.setText(CharSequence)>
			String s = ((android.support.v7.media.MediaRouter.RouteInfo) (view)).getDescription();
		//   30   63:aload_2         
		//   31   64:invokevirtual   #183 <Method String android.support.v7.media.MediaRouter$RouteInfo.getDescription()>
		//   32   67:astore          8
			int j = ((android.support.v7.media.MediaRouter.RouteInfo) (view)).getConnectionState();
		//   33   69:aload_2         
		//   34   70:invokevirtual   #186 <Method int android.support.v7.media.MediaRouter$RouteInfo.getConnectionState()>
		//   35   73:istore          5
			boolean flag = true;
		//   36   75:iconst_1        
		//   37   76:istore          4
			i = ((int) (flag));
		//   38   78:iload           4
		//   39   80:istore_1        
			if(j != 2)
		//*  40   81:iload           5
		//*  41   83:iconst_2        
		//*  42   84:icmpeq          103
				if(((android.support.v7.media.MediaRouter.RouteInfo) (view)).getConnectionState() == 1)
		//*  43   87:aload_2         
		//*  44   88:invokevirtual   #186 <Method int android.support.v7.media.MediaRouter$RouteInfo.getConnectionState()>
		//*  45   91:iconst_1        
		//*  46   92:icmpne          101
					i = ((int) (flag));
		//   47   95:iload           4
		//   48   97:istore_1        
				else
		//*  49   98:goto            103
					i = 0;
		//   50  101:iconst_0        
		//   51  102:istore_1        
			if(i != 0 && !TextUtils.isEmpty(((CharSequence) (s))))
		//*  52  103:iload_1         
		//*  53  104:ifeq            137
		//*  54  107:aload           8
		//*  55  109:invokestatic    #192 <Method boolean TextUtils.isEmpty(CharSequence)>
		//*  56  112:ifne            137
			{
				((TextView) (viewgroup)).setGravity(80);
		//   57  115:aload_3         
		//   58  116:bipush          80
		//   59  118:invokevirtual   #196 <Method void TextView.setGravity(int)>
				textview.setVisibility(0);
		//   60  121:aload           7
		//   61  123:iconst_0        
		//   62  124:invokevirtual   #199 <Method void TextView.setVisibility(int)>
				textview.setText(((CharSequence) (s)));
		//   63  127:aload           7
		//   64  129:aload           8
		//   65  131:invokevirtual   #180 <Method void TextView.setText(CharSequence)>
			} else
		//*  66  134:goto            157
			{
				((TextView) (viewgroup)).setGravity(16);
		//   67  137:aload_3         
		//   68  138:bipush          16
		//   69  140:invokevirtual   #196 <Method void TextView.setGravity(int)>
				textview.setVisibility(8);
		//   70  143:aload           7
		//   71  145:bipush          8
		//   72  147:invokevirtual   #199 <Method void TextView.setVisibility(int)>
				textview.setText("");
		//   73  150:aload           7
		//   74  152:ldc1            #201 <String "">
		//   75  154:invokevirtual   #180 <Method void TextView.setText(CharSequence)>
			}
			view1.setEnabled(((android.support.v7.media.MediaRouter.RouteInfo) (view)).isEnabled());
		//   76  157:aload           6
		//   77  159:aload_2         
		//   78  160:invokevirtual   #204 <Method boolean android.support.v7.media.MediaRouter$RouteInfo.isEnabled()>
		//   79  163:invokevirtual   #208 <Method void View.setEnabled(boolean)>
			viewgroup = ((ViewGroup) ((ImageView)view1.findViewById(android.support.v7.mediarouter.R.id.mr_chooser_route_icon)));
		//   80  166:aload           6
		//   81  168:getstatic       #211 <Field int android.support.v7.mediarouter.R$id.mr_chooser_route_icon>
		//   82  171:invokevirtual   #168 <Method View View.findViewById(int)>
		//   83  174:checkcast       #213 <Class ImageView>
		//   84  177:astore_3        
			if(viewgroup != null)
		//*  85  178:aload_3         
		//*  86  179:ifnull          191
				((ImageView) (viewgroup)).setImageDrawable(getIconDrawable(((android.support.v7.media.MediaRouter.RouteInfo) (view))));
		//   87  182:aload_3         
		//   88  183:aload_0         
		//   89  184:aload_2         
		//   90  185:invokespecial   #215 <Method Drawable getIconDrawable(android.support.v7.media.MediaRouter$RouteInfo)>
		//   91  188:invokevirtual   #219 <Method void ImageView.setImageDrawable(Drawable)>
			return view1;
		//   92  191:aload           6
		//   93  193:areturn         
		}

		public boolean isEnabled(int i)
		{
			return ((android.support.v7.media.MediaRouter.RouteInfo)getItem(i)).isEnabled();
		//    0    0:aload_0         
		//    1    1:iload_1         
		//    2    2:invokevirtual   #157 <Method Object getItem(int)>
		//    3    5:checkcast       #84  <Class android.support.v7.media.MediaRouter$RouteInfo>
		//    4    8:invokevirtual   #204 <Method boolean android.support.v7.media.MediaRouter$RouteInfo.isEnabled()>
		//    5   11:ireturn         
		}

		public void onItemClick(AdapterView adapterview, View view, int i, long l)
		{
			adapterview = ((AdapterView) ((android.support.v7.media.MediaRouter.RouteInfo)getItem(i)));
		//    0    0:aload_0         
		//    1    1:iload_3         
		//    2    2:invokevirtual   #157 <Method Object getItem(int)>
		//    3    5:checkcast       #84  <Class android.support.v7.media.MediaRouter$RouteInfo>
		//    4    8:astore_1        
			if(((android.support.v7.media.MediaRouter.RouteInfo) (adapterview)).isEnabled())
		//*   5    9:aload_1         
		//*   6   10:invokevirtual   #204 <Method boolean android.support.v7.media.MediaRouter$RouteInfo.isEnabled()>
		//*   7   13:ifeq            27
			{
				((android.support.v7.media.MediaRouter.RouteInfo) (adapterview)).select();
		//    8   16:aload_1         
		//    9   17:invokevirtual   #225 <Method void android.support.v7.media.MediaRouter$RouteInfo.select()>
				dismiss();
		//   10   20:aload_0         
		//   11   21:getfield        #23  <Field MediaRouteChooserDialog this$0>
		//   12   24:invokevirtual   #228 <Method void MediaRouteChooserDialog.dismiss()>
			}
		//   13   27:return          
		}

		private final Drawable mDefaultIcon;
		private final LayoutInflater mInflater;
		private final Drawable mSpeakerGroupIcon;
		private final Drawable mSpeakerIcon;
		private final Drawable mTvIcon;
		final MediaRouteChooserDialog this$0;

		public RouteAdapter(Context context, List list)
		{
			this$0 = MediaRouteChooserDialog.this;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #23  <Field MediaRouteChooserDialog this$0>
			super(context, 0, list);
		//    3    5:aload_0         
		//    4    6:aload_2         
		//    5    7:iconst_0        
		//    6    8:aload_3         
		//    7    9:invokespecial   #26  <Method void ArrayAdapter(Context, int, List)>
			mInflater = LayoutInflater.from(context);
		//    8   12:aload_0         
		//    9   13:aload_2         
		//   10   14:invokestatic    #32  <Method LayoutInflater LayoutInflater.from(Context)>
		//   11   17:putfield        #34  <Field LayoutInflater mInflater>
			mediaroutechooserdialog = ((MediaRouteChooserDialog) (getContext().obtainStyledAttributes(new int[] {
				android.support.v7.mediarouter.R.attr.mediaRouteDefaultIconDrawable, android.support.v7.mediarouter.R.attr.mediaRouteTvIconDrawable, android.support.v7.mediarouter.R.attr.mediaRouteSpeakerIconDrawable, android.support.v7.mediarouter.R.attr.mediaRouteSpeakerGroupIconDrawable
			})));
		//   12   20:aload_0         
		//   13   21:invokevirtual   #38  <Method Context getContext()>
		//   14   24:iconst_4        
		//   15   25:newarray        int[]
		//   16   27:dup             
		//   17   28:iconst_0        
		//   18   29:getstatic       #44  <Field int android.support.v7.mediarouter.R$attr.mediaRouteDefaultIconDrawable>
		//   19   32:iastore         
		//   20   33:dup             
		//   21   34:iconst_1        
		//   22   35:getstatic       #47  <Field int android.support.v7.mediarouter.R$attr.mediaRouteTvIconDrawable>
		//   23   38:iastore         
		//   24   39:dup             
		//   25   40:iconst_2        
		//   26   41:getstatic       #50  <Field int android.support.v7.mediarouter.R$attr.mediaRouteSpeakerIconDrawable>
		//   27   44:iastore         
		//   28   45:dup             
		//   29   46:iconst_3        
		//   30   47:getstatic       #53  <Field int android.support.v7.mediarouter.R$attr.mediaRouteSpeakerGroupIconDrawable>
		//   31   50:iastore         
		//   32   51:invokevirtual   #59  <Method TypedArray Context.obtainStyledAttributes(int[])>
		//   33   54:astore_1        
			mDefaultIcon = getDrawable(0);
		//   34   55:aload_0         
		//   35   56:aload_1         
		//   36   57:iconst_0        
		//   37   58:invokevirtual   #65  <Method Drawable TypedArray.getDrawable(int)>
		//   38   61:putfield        #67  <Field Drawable mDefaultIcon>
			mTvIcon = getDrawable(1);
		//   39   64:aload_0         
		//   40   65:aload_1         
		//   41   66:iconst_1        
		//   42   67:invokevirtual   #65  <Method Drawable TypedArray.getDrawable(int)>
		//   43   70:putfield        #69  <Field Drawable mTvIcon>
			mSpeakerIcon = getDrawable(2);
		//   44   73:aload_0         
		//   45   74:aload_1         
		//   46   75:iconst_2        
		//   47   76:invokevirtual   #65  <Method Drawable TypedArray.getDrawable(int)>
		//   48   79:putfield        #71  <Field Drawable mSpeakerIcon>
			mSpeakerGroupIcon = getDrawable(3);
		//   49   82:aload_0         
		//   50   83:aload_1         
		//   51   84:iconst_3        
		//   52   85:invokevirtual   #65  <Method Drawable TypedArray.getDrawable(int)>
		//   53   88:putfield        #73  <Field Drawable mSpeakerGroupIcon>
			recycle();
		//   54   91:aload_1         
		//   55   92:invokevirtual   #77  <Method void TypedArray.recycle()>
		//   56   95:return          
		}
	}

	static final class RouteComparator
		implements Comparator
	{

		public int compare(android.support.v7.media.MediaRouter.RouteInfo routeinfo, android.support.v7.media.MediaRouter.RouteInfo routeinfo1)
		{
			return routeinfo.getName().compareToIgnoreCase(routeinfo1.getName());
		//    0    0:aload_1         
		//    1    1:invokevirtual   #29  <Method String android.support.v7.media.MediaRouter$RouteInfo.getName()>
		//    2    4:aload_2         
		//    3    5:invokevirtual   #29  <Method String android.support.v7.media.MediaRouter$RouteInfo.getName()>
		//    4    8:invokevirtual   #35  <Method int String.compareToIgnoreCase(String)>
		//    5   11:ireturn         
		}

		public volatile int compare(Object obj, Object obj1)
		{
			return compare((android.support.v7.media.MediaRouter.RouteInfo)obj, (android.support.v7.media.MediaRouter.RouteInfo)obj1);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:checkcast       #25  <Class android.support.v7.media.MediaRouter$RouteInfo>
		//    3    5:aload_2         
		//    4    6:checkcast       #25  <Class android.support.v7.media.MediaRouter$RouteInfo>
		//    5    9:invokevirtual   #38  <Method int compare(android.support.v7.media.MediaRouter$RouteInfo, android.support.v7.media.MediaRouter$RouteInfo)>
		//    6   12:ireturn         
		}

		public static final RouteComparator sInstance = new RouteComparator();

		static 
		{
		//    0    0:new             #2   <Class MediaRouteChooserDialog$RouteComparator>
		//    1    3:dup             
		//    2    4:invokespecial   #17  <Method void MediaRouteChooserDialog$RouteComparator()>
		//    3    7:putstatic       #19  <Field MediaRouteChooserDialog$RouteComparator sInstance>
		//*   4   10:return          
		}

		RouteComparator()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #21  <Method void Object()>
		//    2    4:return          
		}
	}


	public MediaRouteChooserDialog(Context context)
	{
		this(context, 0);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iconst_0        
	//    3    3:invokespecial   #51  <Method void MediaRouteChooserDialog(Context, int)>
	//    4    6:return          
	}

	public MediaRouteChooserDialog(Context context, int i)
	{
		context = MediaRouterThemeHelper.createThemedDialogContext(context, i, false);
	//    0    0:aload_1         
	//    1    1:iload_2         
	//    2    2:iconst_0        
	//    3    3:invokestatic    #58  <Method Context MediaRouterThemeHelper.createThemedDialogContext(Context, int, boolean)>
	//    4    6:astore_1        
		super(context, MediaRouterThemeHelper.createThemedDialogStyle(context));
	//    5    7:aload_0         
	//    6    8:aload_1         
	//    7    9:aload_1         
	//    8   10:invokestatic    #62  <Method int MediaRouterThemeHelper.createThemedDialogStyle(Context)>
	//    9   13:invokespecial   #63  <Method void AppCompatDialog(Context, int)>
		mSelector = MediaRouteSelector.EMPTY;
	//   10   16:aload_0         
	//   11   17:getstatic       #68  <Field MediaRouteSelector MediaRouteSelector.EMPTY>
	//   12   20:putfield        #70  <Field MediaRouteSelector mSelector>
		mHandler = ((Handler) (new Handler() {

			public void handleMessage(Message message)
			{
				if(message.what != 1)
			//*   0    0:aload_1         
			//*   1    1:getfield        #24  <Field int Message.what>
			//*   2    4:iconst_1        
			//*   3    5:icmpeq          9
				{
					return;
			//    4    8:return          
				} else
				{
					updateRoutes((List)message.obj);
			//    5    9:aload_0         
			//    6   10:getfield        #12  <Field MediaRouteChooserDialog this$0>
			//    7   13:aload_1         
			//    8   14:getfield        #28  <Field Object Message.obj>
			//    9   17:checkcast       #30  <Class List>
			//   10   20:invokevirtual   #34  <Method void MediaRouteChooserDialog.updateRoutes(List)>
					return;
			//   11   23:return          
				}
			}

			final MediaRouteChooserDialog this$0;

			
			{
				this$0 = MediaRouteChooserDialog.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #12  <Field MediaRouteChooserDialog this$0>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #15  <Method void Handler()>
			//    5    9:return          
			}
		}
));
	//   13   23:aload_0         
	//   14   24:new             #6   <Class MediaRouteChooserDialog$1>
	//   15   27:dup             
	//   16   28:aload_0         
	//   17   29:invokespecial   #73  <Method void MediaRouteChooserDialog$1(MediaRouteChooserDialog)>
	//   18   32:putfield        #75  <Field Handler mHandler>
		mRouter = MediaRouter.getInstance(getContext());
	//   19   35:aload_0         
	//   20   36:aload_0         
	//   21   37:invokevirtual   #79  <Method Context getContext()>
	//   22   40:invokestatic    #85  <Method MediaRouter MediaRouter.getInstance(Context)>
	//   23   43:putfield        #87  <Field MediaRouter mRouter>
		mCallback = new MediaRouterCallback();
	//   24   46:aload_0         
	//   25   47:new             #8   <Class MediaRouteChooserDialog$MediaRouterCallback>
	//   26   50:dup             
	//   27   51:aload_0         
	//   28   52:invokespecial   #88  <Method void MediaRouteChooserDialog$MediaRouterCallback(MediaRouteChooserDialog)>
	//   29   55:putfield        #90  <Field MediaRouteChooserDialog$MediaRouterCallback mCallback>
	//   30   58:return          
	}

	public MediaRouteSelector getRouteSelector()
	{
		return mSelector;
	//    0    0:aload_0         
	//    1    1:getfield        #70  <Field MediaRouteSelector mSelector>
	//    2    4:areturn         
	}

	public void onAttachedToWindow()
	{
		super.onAttachedToWindow();
	//    0    0:aload_0         
	//    1    1:invokespecial   #98  <Method void AppCompatDialog.onAttachedToWindow()>
		mAttachedToWindow = true;
	//    2    4:aload_0         
	//    3    5:iconst_1        
	//    4    6:putfield        #100 <Field boolean mAttachedToWindow>
		mRouter.addCallback(mSelector, ((android.support.v7.media.MediaRouter.Callback) (mCallback)), 1);
	//    5    9:aload_0         
	//    6   10:getfield        #87  <Field MediaRouter mRouter>
	//    7   13:aload_0         
	//    8   14:getfield        #70  <Field MediaRouteSelector mSelector>
	//    9   17:aload_0         
	//   10   18:getfield        #90  <Field MediaRouteChooserDialog$MediaRouterCallback mCallback>
	//   11   21:iconst_1        
	//   12   22:invokevirtual   #104 <Method void MediaRouter.addCallback(MediaRouteSelector, android.support.v7.media.MediaRouter$Callback, int)>
		refreshRoutes();
	//   13   25:aload_0         
	//   14   26:invokevirtual   #107 <Method void refreshRoutes()>
	//   15   29:return          
	}

	protected void onCreate(Bundle bundle)
	{
		super.onCreate(bundle);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #111 <Method void AppCompatDialog.onCreate(Bundle)>
		setContentView(android.support.v7.mediarouter.R.layout.mr_chooser_dialog);
	//    3    5:aload_0         
	//    4    6:getstatic       #116 <Field int android.support.v7.mediarouter.R$layout.mr_chooser_dialog>
	//    5    9:invokevirtual   #120 <Method void setContentView(int)>
		mRoutes = new ArrayList();
	//    6   12:aload_0         
	//    7   13:new             #122 <Class ArrayList>
	//    8   16:dup             
	//    9   17:invokespecial   #124 <Method void ArrayList()>
	//   10   20:putfield        #126 <Field ArrayList mRoutes>
		mAdapter = new RouteAdapter(getContext(), ((List) (mRoutes)));
	//   11   23:aload_0         
	//   12   24:new             #11  <Class MediaRouteChooserDialog$RouteAdapter>
	//   13   27:dup             
	//   14   28:aload_0         
	//   15   29:aload_0         
	//   16   30:invokevirtual   #79  <Method Context getContext()>
	//   17   33:aload_0         
	//   18   34:getfield        #126 <Field ArrayList mRoutes>
	//   19   37:invokespecial   #129 <Method void MediaRouteChooserDialog$RouteAdapter(MediaRouteChooserDialog, Context, List)>
	//   20   40:putfield        #131 <Field MediaRouteChooserDialog$RouteAdapter mAdapter>
		mListView = (ListView)findViewById(android.support.v7.mediarouter.R.id.mr_chooser_list);
	//   21   43:aload_0         
	//   22   44:aload_0         
	//   23   45:getstatic       #136 <Field int android.support.v7.mediarouter.R$id.mr_chooser_list>
	//   24   48:invokevirtual   #140 <Method View findViewById(int)>
	//   25   51:checkcast       #142 <Class ListView>
	//   26   54:putfield        #144 <Field ListView mListView>
		mListView.setAdapter(((android.widget.ListAdapter) (mAdapter)));
	//   27   57:aload_0         
	//   28   58:getfield        #144 <Field ListView mListView>
	//   29   61:aload_0         
	//   30   62:getfield        #131 <Field MediaRouteChooserDialog$RouteAdapter mAdapter>
	//   31   65:invokevirtual   #148 <Method void ListView.setAdapter(android.widget.ListAdapter)>
		mListView.setOnItemClickListener(((android.widget.AdapterView.OnItemClickListener) (mAdapter)));
	//   32   68:aload_0         
	//   33   69:getfield        #144 <Field ListView mListView>
	//   34   72:aload_0         
	//   35   73:getfield        #131 <Field MediaRouteChooserDialog$RouteAdapter mAdapter>
	//   36   76:invokevirtual   #152 <Method void ListView.setOnItemClickListener(android.widget.AdapterView$OnItemClickListener)>
		mListView.setEmptyView(findViewById(0x1020004));
	//   37   79:aload_0         
	//   38   80:getfield        #144 <Field ListView mListView>
	//   39   83:aload_0         
	//   40   84:ldc1            #153 <Int 0x1020004>
	//   41   86:invokevirtual   #140 <Method View findViewById(int)>
	//   42   89:invokevirtual   #157 <Method void ListView.setEmptyView(View)>
		mTitleView = (TextView)findViewById(android.support.v7.mediarouter.R.id.mr_chooser_title);
	//   43   92:aload_0         
	//   44   93:aload_0         
	//   45   94:getstatic       #160 <Field int android.support.v7.mediarouter.R$id.mr_chooser_title>
	//   46   97:invokevirtual   #140 <Method View findViewById(int)>
	//   47  100:checkcast       #162 <Class TextView>
	//   48  103:putfield        #164 <Field TextView mTitleView>
		updateLayout();
	//   49  106:aload_0         
	//   50  107:invokevirtual   #167 <Method void updateLayout()>
	//   51  110:return          
	}

	public void onDetachedFromWindow()
	{
		mAttachedToWindow = false;
	//    0    0:aload_0         
	//    1    1:iconst_0        
	//    2    2:putfield        #100 <Field boolean mAttachedToWindow>
		mRouter.removeCallback(((android.support.v7.media.MediaRouter.Callback) (mCallback)));
	//    3    5:aload_0         
	//    4    6:getfield        #87  <Field MediaRouter mRouter>
	//    5    9:aload_0         
	//    6   10:getfield        #90  <Field MediaRouteChooserDialog$MediaRouterCallback mCallback>
	//    7   13:invokevirtual   #172 <Method void MediaRouter.removeCallback(android.support.v7.media.MediaRouter$Callback)>
		mHandler.removeMessages(1);
	//    8   16:aload_0         
	//    9   17:getfield        #75  <Field Handler mHandler>
	//   10   20:iconst_1        
	//   11   21:invokevirtual   #177 <Method void Handler.removeMessages(int)>
		super.onDetachedFromWindow();
	//   12   24:aload_0         
	//   13   25:invokespecial   #179 <Method void AppCompatDialog.onDetachedFromWindow()>
	//   14   28:return          
	}

	public boolean onFilterRoute(android.support.v7.media.MediaRouter.RouteInfo routeinfo)
	{
		return !routeinfo.isDefaultOrBluetooth() && routeinfo.isEnabled() && routeinfo.matchesSelector(mSelector);
	//    0    0:aload_1         
	//    1    1:invokevirtual   #187 <Method boolean android.support.v7.media.MediaRouter$RouteInfo.isDefaultOrBluetooth()>
	//    2    4:ifne            27
	//    3    7:aload_1         
	//    4    8:invokevirtual   #190 <Method boolean android.support.v7.media.MediaRouter$RouteInfo.isEnabled()>
	//    5   11:ifeq            27
	//    6   14:aload_1         
	//    7   15:aload_0         
	//    8   16:getfield        #70  <Field MediaRouteSelector mSelector>
	//    9   19:invokevirtual   #194 <Method boolean android.support.v7.media.MediaRouter$RouteInfo.matchesSelector(MediaRouteSelector)>
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
	//    1    1:invokeinterface #203 <Method int List.size()>
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
	//*  12   18:invokeinterface #207 <Method Object List.get(int)>
	//*  13   23:checkcast       #183 <Class android.support.v7.media.MediaRouter$RouteInfo>
	//*  14   26:invokevirtual   #209 <Method boolean onFilterRoute(android.support.v7.media.MediaRouter$RouteInfo)>
	//*  15   29:ifne            40
					list.remove(j);
	//   16   32:aload_1         
	//   17   33:iload_3         
	//   18   34:invokeinterface #212 <Method Object List.remove(int)>
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
	//*   1    1:getfield        #100 <Field boolean mAttachedToWindow>
	//*   2    4:ifeq            88
		{
			ArrayList arraylist = new ArrayList(((java.util.Collection) (mRouter.getRoutes())));
	//    3    7:new             #122 <Class ArrayList>
	//    4   10:dup             
	//    5   11:aload_0         
	//    6   12:getfield        #87  <Field MediaRouter mRouter>
	//    7   15:invokevirtual   #218 <Method List MediaRouter.getRoutes()>
	//    8   18:invokespecial   #221 <Method void ArrayList(java.util.Collection)>
	//    9   21:astore_1        
			onFilterRoutes(((List) (arraylist)));
	//   10   22:aload_0         
	//   11   23:aload_1         
	//   12   24:invokevirtual   #223 <Method void onFilterRoutes(List)>
			Collections.sort(((List) (arraylist)), ((Comparator) (RouteComparator.sInstance)));
	//   13   27:aload_1         
	//   14   28:getstatic       #227 <Field MediaRouteChooserDialog$RouteComparator MediaRouteChooserDialog$RouteComparator.sInstance>
	//   15   31:invokestatic    #233 <Method void Collections.sort(List, Comparator)>
			if(SystemClock.uptimeMillis() - mLastUpdateTime >= 300L)
	//*  16   34:invokestatic    #239 <Method long SystemClock.uptimeMillis()>
	//*  17   37:aload_0         
	//*  18   38:getfield        #241 <Field long mLastUpdateTime>
	//*  19   41:lsub            
	//*  20   42:ldc2w           #25  <Long 300L>
	//*  21   45:lcmp            
	//*  22   46:iflt            55
			{
				updateRoutes(((List) (arraylist)));
	//   23   49:aload_0         
	//   24   50:aload_1         
	//   25   51:invokevirtual   #244 <Method void updateRoutes(List)>
				return;
	//   26   54:return          
			}
			mHandler.removeMessages(1);
	//   27   55:aload_0         
	//   28   56:getfield        #75  <Field Handler mHandler>
	//   29   59:iconst_1        
	//   30   60:invokevirtual   #177 <Method void Handler.removeMessages(int)>
			mHandler.sendMessageAtTime(mHandler.obtainMessage(1, ((Object) (arraylist))), mLastUpdateTime + 300L);
	//   31   63:aload_0         
	//   32   64:getfield        #75  <Field Handler mHandler>
	//   33   67:aload_0         
	//   34   68:getfield        #75  <Field Handler mHandler>
	//   35   71:iconst_1        
	//   36   72:aload_1         
	//   37   73:invokevirtual   #248 <Method Message Handler.obtainMessage(int, Object)>
	//   38   76:aload_0         
	//   39   77:getfield        #241 <Field long mLastUpdateTime>
	//   40   80:ldc2w           #25  <Long 300L>
	//   41   83:ladd            
	//   42   84:invokevirtual   #252 <Method boolean Handler.sendMessageAtTime(Message, long)>
	//   43   87:pop             
		}
	//   44   88:return          
	}

	public void setRouteSelector(MediaRouteSelector mediarouteselector)
	{
		if(mediarouteselector == null)
	//*   0    0:aload_1         
	//*   1    1:ifnonnull       15
			throw new IllegalArgumentException("selector must not be null");
	//    2    4:new             #256 <Class IllegalArgumentException>
	//    3    7:dup             
	//    4    8:ldc2            #258 <String "selector must not be null">
	//    5   11:invokespecial   #261 <Method void IllegalArgumentException(String)>
	//    6   14:athrow          
		if(!mSelector.equals(((Object) (mediarouteselector))))
	//*   7   15:aload_0         
	//*   8   16:getfield        #70  <Field MediaRouteSelector mSelector>
	//*   9   19:aload_1         
	//*  10   20:invokevirtual   #265 <Method boolean MediaRouteSelector.equals(Object)>
	//*  11   23:ifne            66
		{
			mSelector = mediarouteselector;
	//   12   26:aload_0         
	//   13   27:aload_1         
	//   14   28:putfield        #70  <Field MediaRouteSelector mSelector>
			if(mAttachedToWindow)
	//*  15   31:aload_0         
	//*  16   32:getfield        #100 <Field boolean mAttachedToWindow>
	//*  17   35:ifeq            62
			{
				mRouter.removeCallback(((android.support.v7.media.MediaRouter.Callback) (mCallback)));
	//   18   38:aload_0         
	//   19   39:getfield        #87  <Field MediaRouter mRouter>
	//   20   42:aload_0         
	//   21   43:getfield        #90  <Field MediaRouteChooserDialog$MediaRouterCallback mCallback>
	//   22   46:invokevirtual   #172 <Method void MediaRouter.removeCallback(android.support.v7.media.MediaRouter$Callback)>
				mRouter.addCallback(mediarouteselector, ((android.support.v7.media.MediaRouter.Callback) (mCallback)), 1);
	//   23   49:aload_0         
	//   24   50:getfield        #87  <Field MediaRouter mRouter>
	//   25   53:aload_1         
	//   26   54:aload_0         
	//   27   55:getfield        #90  <Field MediaRouteChooserDialog$MediaRouterCallback mCallback>
	//   28   58:iconst_1        
	//   29   59:invokevirtual   #104 <Method void MediaRouter.addCallback(MediaRouteSelector, android.support.v7.media.MediaRouter$Callback, int)>
			}
			refreshRoutes();
	//   30   62:aload_0         
	//   31   63:invokevirtual   #107 <Method void refreshRoutes()>
		}
	//   32   66:return          
	}

	public void setTitle(int i)
	{
		mTitleView.setText(i);
	//    0    0:aload_0         
	//    1    1:getfield        #164 <Field TextView mTitleView>
	//    2    4:iload_1         
	//    3    5:invokevirtual   #269 <Method void TextView.setText(int)>
	//    4    8:return          
	}

	public void setTitle(CharSequence charsequence)
	{
		mTitleView.setText(charsequence);
	//    0    0:aload_0         
	//    1    1:getfield        #164 <Field TextView mTitleView>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #272 <Method void TextView.setText(CharSequence)>
	//    4    8:return          
	}

	void updateLayout()
	{
		getWindow().setLayout(MediaRouteDialogHelper.getDialogWidth(getContext()), -2);
	//    0    0:aload_0         
	//    1    1:invokevirtual   #276 <Method Window getWindow()>
	//    2    4:aload_0         
	//    3    5:invokevirtual   #79  <Method Context getContext()>
	//    4    8:invokestatic    #281 <Method int MediaRouteDialogHelper.getDialogWidth(Context)>
	//    5   11:bipush          -2
	//    6   13:invokevirtual   #287 <Method void Window.setLayout(int, int)>
	//    7   16:return          
	}

	void updateRoutes(List list)
	{
		mLastUpdateTime = SystemClock.uptimeMillis();
	//    0    0:aload_0         
	//    1    1:invokestatic    #239 <Method long SystemClock.uptimeMillis()>
	//    2    4:putfield        #241 <Field long mLastUpdateTime>
		mRoutes.clear();
	//    3    7:aload_0         
	//    4    8:getfield        #126 <Field ArrayList mRoutes>
	//    5   11:invokevirtual   #290 <Method void ArrayList.clear()>
		mRoutes.addAll(((java.util.Collection) (list)));
	//    6   14:aload_0         
	//    7   15:getfield        #126 <Field ArrayList mRoutes>
	//    8   18:aload_1         
	//    9   19:invokevirtual   #294 <Method boolean ArrayList.addAll(java.util.Collection)>
	//   10   22:pop             
		mAdapter.notifyDataSetChanged();
	//   11   23:aload_0         
	//   12   24:getfield        #131 <Field MediaRouteChooserDialog$RouteAdapter mAdapter>
	//   13   27:invokevirtual   #297 <Method void MediaRouteChooserDialog$RouteAdapter.notifyDataSetChanged()>
	//   14   30:return          
	}

	static final int MSG_UPDATE_ROUTES = 1;
	static final String TAG = "MediaRouteChooserDialog";
	private static final long UPDATE_ROUTES_DELAY_MS = 300L;
	private RouteAdapter mAdapter;
	private boolean mAttachedToWindow;
	private final MediaRouterCallback mCallback;
	private final Handler mHandler;
	private long mLastUpdateTime;
	private ListView mListView;
	private final MediaRouter mRouter;
	private ArrayList mRoutes;
	private MediaRouteSelector mSelector;
	private TextView mTitleView;
}