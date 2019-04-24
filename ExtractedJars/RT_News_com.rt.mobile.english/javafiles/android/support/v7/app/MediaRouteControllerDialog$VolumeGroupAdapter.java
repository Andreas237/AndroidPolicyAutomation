// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v7.app;

import android.content.Context;
import android.view.*;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.widget.*;
import java.util.*;

// Referenced classes of package android.support.v7.app:
//			MediaRouteControllerDialog, MediaRouterThemeHelper, MediaRouteVolumeSlider

private class MediaRouteControllerDialog$VolumeGroupAdapter extends ArrayAdapter
{

	public View getView(int i, View view, ViewGroup viewgroup)
	{
		boolean flag = false;
	//    0    0:iconst_0        
	//    1    1:istore          4
		if(view == null)
	//*   2    3:aload_2         
	//*   3    4:ifnonnull       26
			view = LayoutInflater.from(viewgroup.getContext()).inflate(android.support.v7.mediarouter.R.layout.mr_controller_volume_item, viewgroup, false);
	//    4    7:aload_3         
	//    5    8:invokevirtual   #38  <Method Context ViewGroup.getContext()>
	//    6   11:invokestatic    #44  <Method LayoutInflater LayoutInflater.from(Context)>
	//    7   14:getstatic       #50  <Field int android.support.v7.mediarouter.R$layout.mr_controller_volume_item>
	//    8   17:aload_3         
	//    9   18:iconst_0        
	//   10   19:invokevirtual   #54  <Method View LayoutInflater.inflate(int, ViewGroup, boolean)>
	//   11   22:astore_2        
		else
	//*  12   23:goto            34
			updateVolumeGroupItemHeight(view);
	//   13   26:aload_0         
	//   14   27:getfield        #16  <Field MediaRouteControllerDialog this$0>
	//   15   30:aload_2         
	//   16   31:invokevirtual   #58  <Method void MediaRouteControllerDialog.updateVolumeGroupItemHeight(View)>
		android.support.v7.media.MediaRouter.RouteInfo routeinfo = (android.support.v7.media.MediaRouter.RouteInfo)getItem(i);
	//   17   34:aload_0         
	//   18   35:iload_1         
	//   19   36:invokevirtual   #62  <Method Object getItem(int)>
	//   20   39:checkcast       #64  <Class android.support.v7.media.MediaRouter$RouteInfo>
	//   21   42:astore          6
		if(routeinfo != null)
	//*  22   44:aload           6
	//*  23   46:ifnull          361
		{
			boolean flag1 = routeinfo.isEnabled();
	//   24   49:aload           6
	//   25   51:invokevirtual   #68  <Method boolean android.support.v7.media.MediaRouter$RouteInfo.isEnabled()>
	//   26   54:istore          5
			Object obj = ((Object) ((TextView)view.findViewById(android.support.v7.mediarouter.R.id.mr_name)));
	//   27   56:aload_2         
	//   28   57:getstatic       #73  <Field int android.support.v7.mediarouter.R$id.mr_name>
	//   29   60:invokevirtual   #79  <Method View View.findViewById(int)>
	//   30   63:checkcast       #81  <Class TextView>
	//   31   66:astore          7
			((TextView) (obj)).setEnabled(flag1);
	//   32   68:aload           7
	//   33   70:iload           5
	//   34   72:invokevirtual   #85  <Method void TextView.setEnabled(boolean)>
			((TextView) (obj)).setText(((CharSequence) (routeinfo.getName())));
	//   35   75:aload           7
	//   36   77:aload           6
	//   37   79:invokevirtual   #89  <Method String android.support.v7.media.MediaRouter$RouteInfo.getName()>
	//   38   82:invokevirtual   #93  <Method void TextView.setText(CharSequence)>
			obj = ((Object) ((MediaRouteVolumeSlider)view.findViewById(android.support.v7.mediarouter.R.id.mr_volume_slider)));
	//   39   85:aload_2         
	//   40   86:getstatic       #96  <Field int android.support.v7.mediarouter.R$id.mr_volume_slider>
	//   41   89:invokevirtual   #79  <Method View View.findViewById(int)>
	//   42   92:checkcast       #98  <Class MediaRouteVolumeSlider>
	//   43   95:astore          7
			MediaRouterThemeHelper.setVolumeSliderColor(viewgroup.getContext(), ((MediaRouteVolumeSlider) (obj)), ((View) (mVolumeGroupList)));
	//   44   97:aload_3         
	//   45   98:invokevirtual   #38  <Method Context ViewGroup.getContext()>
	//   46  101:aload           7
	//   47  103:aload_0         
	//   48  104:getfield        #16  <Field MediaRouteControllerDialog this$0>
	//   49  107:getfield        #102 <Field OverlayListView MediaRouteControllerDialog.mVolumeGroupList>
	//   50  110:invokestatic    #106 <Method void MediaRouterThemeHelper.setVolumeSliderColor(Context, MediaRouteVolumeSlider, View)>
			((MediaRouteVolumeSlider) (obj)).setTag(((Object) (routeinfo)));
	//   51  113:aload           7
	//   52  115:aload           6
	//   53  117:invokevirtual   #110 <Method void MediaRouteVolumeSlider.setTag(Object)>
			mVolumeSliderMap.put(((Object) (routeinfo)), obj);
	//   54  120:aload_0         
	//   55  121:getfield        #16  <Field MediaRouteControllerDialog this$0>
	//   56  124:getfield        #114 <Field Map MediaRouteControllerDialog.mVolumeSliderMap>
	//   57  127:aload           6
	//   58  129:aload           7
	//   59  131:invokeinterface #120 <Method Object Map.put(Object, Object)>
	//   60  136:pop             
			((MediaRouteVolumeSlider) (obj)).setHideThumb(flag1 ^ true);
	//   61  137:aload           7
	//   62  139:iload           5
	//   63  141:iconst_1        
	//   64  142:ixor            
	//   65  143:invokevirtual   #123 <Method void MediaRouteVolumeSlider.setHideThumb(boolean)>
			((MediaRouteVolumeSlider) (obj)).setEnabled(flag1);
	//   66  146:aload           7
	//   67  148:iload           5
	//   68  150:invokevirtual   #124 <Method void MediaRouteVolumeSlider.setEnabled(boolean)>
			if(flag1)
	//*  69  153:iload           5
	//*  70  155:ifeq            225
				if(isVolumeControlAvailable(routeinfo))
	//*  71  158:aload_0         
	//*  72  159:getfield        #16  <Field MediaRouteControllerDialog this$0>
	//*  73  162:aload           6
	//*  74  164:invokevirtual   #128 <Method boolean MediaRouteControllerDialog.isVolumeControlAvailable(android.support.v7.media.MediaRouter$RouteInfo)>
	//*  75  167:ifeq            205
				{
					((MediaRouteVolumeSlider) (obj)).setMax(routeinfo.getVolumeMax());
	//   76  170:aload           7
	//   77  172:aload           6
	//   78  174:invokevirtual   #132 <Method int android.support.v7.media.MediaRouter$RouteInfo.getVolumeMax()>
	//   79  177:invokevirtual   #136 <Method void MediaRouteVolumeSlider.setMax(int)>
					((MediaRouteVolumeSlider) (obj)).setProgress(routeinfo.getVolume());
	//   80  180:aload           7
	//   81  182:aload           6
	//   82  184:invokevirtual   #139 <Method int android.support.v7.media.MediaRouter$RouteInfo.getVolume()>
	//   83  187:invokevirtual   #142 <Method void MediaRouteVolumeSlider.setProgress(int)>
					((MediaRouteVolumeSlider) (obj)).setOnSeekBarChangeListener(((android.widget.SeekBar.OnSeekBarChangeListener) (mVolumeChangeListener)));
	//   84  190:aload           7
	//   85  192:aload_0         
	//   86  193:getfield        #16  <Field MediaRouteControllerDialog this$0>
	//   87  196:getfield        #146 <Field MediaRouteControllerDialog$VolumeChangeListener MediaRouteControllerDialog.mVolumeChangeListener>
	//   88  199:invokevirtual   #150 <Method void MediaRouteVolumeSlider.setOnSeekBarChangeListener(android.widget.SeekBar$OnSeekBarChangeListener)>
				} else
	//*  89  202:goto            225
				{
					((MediaRouteVolumeSlider) (obj)).setMax(100);
	//   90  205:aload           7
	//   91  207:bipush          100
	//   92  209:invokevirtual   #136 <Method void MediaRouteVolumeSlider.setMax(int)>
					((MediaRouteVolumeSlider) (obj)).setProgress(100);
	//   93  212:aload           7
	//   94  214:bipush          100
	//   95  216:invokevirtual   #142 <Method void MediaRouteVolumeSlider.setProgress(int)>
					((MediaRouteVolumeSlider) (obj)).setEnabled(false);
	//   96  219:aload           7
	//   97  221:iconst_0        
	//   98  222:invokevirtual   #124 <Method void MediaRouteVolumeSlider.setEnabled(boolean)>
				}
			viewgroup = ((ViewGroup) ((ImageView)view.findViewById(android.support.v7.mediarouter.R.id.mr_volume_item_icon)));
	//   99  225:aload_2         
	//  100  226:getstatic       #153 <Field int android.support.v7.mediarouter.R$id.mr_volume_item_icon>
	//  101  229:invokevirtual   #79  <Method View View.findViewById(int)>
	//  102  232:checkcast       #155 <Class ImageView>
	//  103  235:astore_3        
			if(flag1)
	//* 104  236:iload           5
	//* 105  238:ifeq            248
				i = 255;
	//  106  241:sipush          255
	//  107  244:istore_1        
			else
	//* 108  245:goto            257
				i = (int)(255F * mDisabledAlpha);
	//  109  248:ldc1            #156 <Float 255F>
	//  110  250:aload_0         
	//  111  251:getfield        #27  <Field float mDisabledAlpha>
	//  112  254:fmul            
	//  113  255:f2i             
	//  114  256:istore_1        
			((ImageView) (viewgroup)).setAlpha(i);
	//  115  257:aload_3         
	//  116  258:iload_1         
	//  117  259:invokevirtual   #159 <Method void ImageView.setAlpha(int)>
			viewgroup = ((ViewGroup) ((LinearLayout)view.findViewById(android.support.v7.mediarouter.R.id.volume_item_container)));
	//  118  262:aload_2         
	//  119  263:getstatic       #162 <Field int android.support.v7.mediarouter.R$id.volume_item_container>
	//  120  266:invokevirtual   #79  <Method View View.findViewById(int)>
	//  121  269:checkcast       #164 <Class LinearLayout>
	//  122  272:astore_3        
			i = ((int) (flag));
	//  123  273:iload           4
	//  124  275:istore_1        
			if(mGroupMemberRoutesAnimatingWithBitmap.contains(((Object) (routeinfo))))
	//* 125  276:aload_0         
	//* 126  277:getfield        #16  <Field MediaRouteControllerDialog this$0>
	//* 127  280:getfield        #168 <Field Set MediaRouteControllerDialog.mGroupMemberRoutesAnimatingWithBitmap>
	//* 128  283:aload           6
	//* 129  285:invokeinterface #174 <Method boolean Set.contains(Object)>
	//* 130  290:ifeq            295
				i = 4;
	//  131  293:iconst_4        
	//  132  294:istore_1        
			((LinearLayout) (viewgroup)).setVisibility(i);
	//  133  295:aload_3         
	//  134  296:iload_1         
	//  135  297:invokevirtual   #177 <Method void LinearLayout.setVisibility(int)>
			if(mGroupMemberRoutesAdded != null && mGroupMemberRoutesAdded.contains(((Object) (routeinfo))))
	//* 136  300:aload_0         
	//* 137  301:getfield        #16  <Field MediaRouteControllerDialog this$0>
	//* 138  304:getfield        #180 <Field Set MediaRouteControllerDialog.mGroupMemberRoutesAdded>
	//* 139  307:ifnull          361
	//* 140  310:aload_0         
	//* 141  311:getfield        #16  <Field MediaRouteControllerDialog this$0>
	//* 142  314:getfield        #180 <Field Set MediaRouteControllerDialog.mGroupMemberRoutesAdded>
	//* 143  317:aload           6
	//* 144  319:invokeinterface #174 <Method boolean Set.contains(Object)>
	//* 145  324:ifeq            361
			{
				viewgroup = ((ViewGroup) (new AlphaAnimation(0.0F, 0.0F)));
	//  146  327:new             #182 <Class AlphaAnimation>
	//  147  330:dup             
	//  148  331:fconst_0        
	//  149  332:fconst_0        
	//  150  333:invokespecial   #185 <Method void AlphaAnimation(float, float)>
	//  151  336:astore_3        
				((Animation) (viewgroup)).setDuration(0L);
	//  152  337:aload_3         
	//  153  338:lconst_0        
	//  154  339:invokevirtual   #191 <Method void Animation.setDuration(long)>
				((Animation) (viewgroup)).setFillEnabled(true);
	//  155  342:aload_3         
	//  156  343:iconst_1        
	//  157  344:invokevirtual   #194 <Method void Animation.setFillEnabled(boolean)>
				((Animation) (viewgroup)).setFillAfter(true);
	//  158  347:aload_3         
	//  159  348:iconst_1        
	//  160  349:invokevirtual   #197 <Method void Animation.setFillAfter(boolean)>
				view.clearAnimation();
	//  161  352:aload_2         
	//  162  353:invokevirtual   #201 <Method void View.clearAnimation()>
				view.startAnimation(((Animation) (viewgroup)));
	//  163  356:aload_2         
	//  164  357:aload_3         
	//  165  358:invokevirtual   #205 <Method void View.startAnimation(Animation)>
			}
		}
		return view;
	//  166  361:aload_2         
	//  167  362:areturn         
	}

	public boolean isEnabled(int i)
	{
		return false;
	//    0    0:iconst_0        
	//    1    1:ireturn         
	}

	final float mDisabledAlpha;
	final MediaRouteControllerDialog this$0;

	public MediaRouteControllerDialog$VolumeGroupAdapter(Context context, List list)
	{
		this$0 = MediaRouteControllerDialog.this;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #16  <Field MediaRouteControllerDialog this$0>
		super(context, 0, list);
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:iconst_0        
	//    6    8:aload_3         
	//    7    9:invokespecial   #19  <Method void ArrayAdapter(Context, int, List)>
		mDisabledAlpha = MediaRouterThemeHelper.getDisabledAlpha(context);
	//    8   12:aload_0         
	//    9   13:aload_2         
	//   10   14:invokestatic    #25  <Method float MediaRouterThemeHelper.getDisabledAlpha(Context)>
	//   11   17:putfield        #27  <Field float mDisabledAlpha>
	//   12   20:return          
	}
}
