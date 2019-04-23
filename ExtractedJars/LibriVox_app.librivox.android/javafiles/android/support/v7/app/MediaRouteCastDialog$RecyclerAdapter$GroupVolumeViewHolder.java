// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v7.app;

import android.view.View;
import android.widget.TextView;

// Referenced classes of package android.support.v7.app:
//			MediaRouteVolumeSlider, MediaRouteCastDialog

class MediaRouteCastDialog$RecyclerAdapter$GroupVolumeViewHolder extends android.support.v7.widget.RecyclerView.ViewHolder
{

	public void bindGroupVolumeView(MediaRouteCastDialog.RecyclerAdapter.Item item)
	{
		item = ((MediaRouteCastDialog.RecyclerAdapter.Item) ((android.support.v7.media.MediaRouter.RouteInfo)item.getData()));
	//    0    0:aload_1         
	//    1    1:invokevirtual   #49  <Method Object MediaRouteCastDialog$RecyclerAdapter$Item.getData()>
	//    2    4:checkcast       #51  <Class android.support.v7.media.MediaRouter$RouteInfo>
	//    3    7:astore_1        
		mTextView.setText(((CharSequence) (((android.support.v7.media.MediaRouter.RouteInfo) (item)).getName().toUpperCase())));
	//    4    8:aload_0         
	//    5    9:getfield        #33  <Field TextView mTextView>
	//    6   12:aload_1         
	//    7   13:invokevirtual   #55  <Method String android.support.v7.media.MediaRouter$RouteInfo.getName()>
	//    8   16:invokevirtual   #60  <Method String String.toUpperCase()>
	//    9   19:invokevirtual   #64  <Method void TextView.setText(CharSequence)>
		mGroupVolumeSlider.setColor(mVolumeSliderColor);
	//   10   22:aload_0         
	//   11   23:getfield        #40  <Field MediaRouteVolumeSlider mGroupVolumeSlider>
	//   12   26:aload_0         
	//   13   27:getfield        #14  <Field MediaRouteCastDialog$RecyclerAdapter this$1>
	//   14   30:getfield        #70  <Field MediaRouteCastDialog MediaRouteCastDialog$RecyclerAdapter.this$0>
	//   15   33:getfield        #75  <Field int MediaRouteCastDialog.mVolumeSliderColor>
	//   16   36:invokevirtual   #79  <Method void MediaRouteVolumeSlider.setColor(int)>
		mGroupVolumeSlider.setTag(((Object) (item)));
	//   17   39:aload_0         
	//   18   40:getfield        #40  <Field MediaRouteVolumeSlider mGroupVolumeSlider>
	//   19   43:aload_1         
	//   20   44:invokevirtual   #83  <Method void MediaRouteVolumeSlider.setTag(Object)>
		mGroupVolumeSlider.setProgress(mRoute.getVolume());
	//   21   47:aload_0         
	//   22   48:getfield        #40  <Field MediaRouteVolumeSlider mGroupVolumeSlider>
	//   23   51:aload_0         
	//   24   52:getfield        #14  <Field MediaRouteCastDialog$RecyclerAdapter this$1>
	//   25   55:getfield        #70  <Field MediaRouteCastDialog MediaRouteCastDialog$RecyclerAdapter.this$0>
	//   26   58:getfield        #87  <Field android.support.v7.media.MediaRouter$RouteInfo MediaRouteCastDialog.mRoute>
	//   27   61:invokevirtual   #91  <Method int android.support.v7.media.MediaRouter$RouteInfo.getVolume()>
	//   28   64:invokevirtual   #94  <Method void MediaRouteVolumeSlider.setProgress(int)>
		mGroupVolumeSlider.setOnSeekBarChangeListener(((android.widget.SeekBar.OnSeekBarChangeListener) (mVolumeChangeListener)));
	//   29   67:aload_0         
	//   30   68:getfield        #40  <Field MediaRouteVolumeSlider mGroupVolumeSlider>
	//   31   71:aload_0         
	//   32   72:getfield        #14  <Field MediaRouteCastDialog$RecyclerAdapter this$1>
	//   33   75:getfield        #70  <Field MediaRouteCastDialog MediaRouteCastDialog$RecyclerAdapter.this$0>
	//   34   78:getfield        #98  <Field MediaRouteCastDialog$VolumeChangeListener MediaRouteCastDialog.mVolumeChangeListener>
	//   35   81:invokevirtual   #102 <Method void MediaRouteVolumeSlider.setOnSeekBarChangeListener(android.widget.SeekBar$OnSeekBarChangeListener)>
	//   36   84:return          
	}

	MediaRouteVolumeSlider mGroupVolumeSlider;
	TextView mTextView;
	final MediaRouteCastDialog.RecyclerAdapter this$1;

	MediaRouteCastDialog$RecyclerAdapter$GroupVolumeViewHolder(View view)
	{
		this$1 = MediaRouteCastDialog.RecyclerAdapter.this;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #14  <Field MediaRouteCastDialog$RecyclerAdapter this$1>
		super(view);
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:invokespecial   #17  <Method void android.support.v7.widget.RecyclerView$ViewHolder(View)>
		mTextView = (TextView)view.findViewById(android.support.v7.mediarouter.R.id.mr_group_volume_route_name);
	//    6   10:aload_0         
	//    7   11:aload_2         
	//    8   12:getstatic       #23  <Field int android.support.v7.mediarouter.R$id.mr_group_volume_route_name>
	//    9   15:invokevirtual   #29  <Method View View.findViewById(int)>
	//   10   18:checkcast       #31  <Class TextView>
	//   11   21:putfield        #33  <Field TextView mTextView>
		mGroupVolumeSlider = (MediaRouteVolumeSlider)view.findViewById(android.support.v7.mediarouter.R.id.mr_group_volume_slider);
	//   12   24:aload_0         
	//   13   25:aload_2         
	//   14   26:getstatic       #36  <Field int android.support.v7.mediarouter.R$id.mr_group_volume_slider>
	//   15   29:invokevirtual   #29  <Method View View.findViewById(int)>
	//   16   32:checkcast       #38  <Class MediaRouteVolumeSlider>
	//   17   35:putfield        #40  <Field MediaRouteVolumeSlider mGroupVolumeSlider>
	//   18   38:return          
	}
}
