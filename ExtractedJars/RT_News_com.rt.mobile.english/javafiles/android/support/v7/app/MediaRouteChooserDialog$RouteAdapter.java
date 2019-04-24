// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v7.app;

import android.content.ContentResolver;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.Log;
import android.view.*;
import android.widget.*;
import java.io.IOException;
import java.util.List;

// Referenced classes of package android.support.v7.app:
//			MediaRouteChooserDialog

private final class MediaRouteChooserDialog$RouteAdapter extends ArrayAdapter
	implements android.widget.AdapterView.OnItemClickListener
{

	private Drawable getDefaultIconDrawable(android.support.v7.media.MediaRouter.RouteInfo routeinfo)
	{
		switch(routeinfo.getDeviceType())
	//*   0    0:aload_1         
	//*   1    1:invokevirtual   #88  <Method int android.support.v7.media.MediaRouter$RouteInfo.getDeviceType()>
		{
	//*   2    4:tableswitch     1 2: default 28
	//	               1 45
	//	               2 40
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

	public MediaRouteChooserDialog$RouteAdapter(Context context, List list)
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
