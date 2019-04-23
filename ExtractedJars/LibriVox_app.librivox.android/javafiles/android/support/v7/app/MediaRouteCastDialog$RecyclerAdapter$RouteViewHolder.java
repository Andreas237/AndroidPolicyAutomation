// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v7.app;

import android.view.View;
import android.widget.*;

// Referenced classes of package android.support.v7.app:
//			MediaRouteVolumeSlider, MediaRouteCastDialog

class MediaRouteCastDialog$RecyclerAdapter$RouteViewHolder extends android.support.v7.widget.RecyclerView.ViewHolder
{

	public void bindRouteViewHolder(MediaRouteCastDialog.RecyclerAdapter.Item item)
	{
		item = ((MediaRouteCastDialog.RecyclerAdapter.Item) ((android.support.v7.media.MediaRouter.RouteInfo)item.getData()));
	//    0    0:aload_1         
	//    1    1:invokevirtual   #67  <Method Object MediaRouteCastDialog$RecyclerAdapter$Item.getData()>
	//    2    4:checkcast       #69  <Class android.support.v7.media.MediaRouter$RouteInfo>
	//    3    7:astore_1        
		mImageView.setImageDrawable(getIconDrawable(((android.support.v7.media.MediaRouter.RouteInfo) (item))));
	//    4    8:aload_0         
	//    5    9:getfield        #37  <Field ImageView mImageView>
	//    6   12:aload_0         
	//    7   13:getfield        #18  <Field MediaRouteCastDialog$RecyclerAdapter this$1>
	//    8   16:aload_1         
	//    9   17:invokevirtual   #75  <Method android.graphics.drawable.Drawable MediaRouteCastDialog$RecyclerAdapter.getIconDrawable(android.support.v7.media.MediaRouter$RouteInfo)>
	//   10   20:invokevirtual   #79  <Method void ImageView.setImageDrawable(android.graphics.drawable.Drawable)>
		mTextView.setText(((CharSequence) (((android.support.v7.media.MediaRouter.RouteInfo) (item)).getName())));
	//   11   23:aload_0         
	//   12   24:getfield        #44  <Field TextView mTextView>
	//   13   27:aload_1         
	//   14   28:invokevirtual   #83  <Method String android.support.v7.media.MediaRouter$RouteInfo.getName()>
	//   15   31:invokevirtual   #87  <Method void TextView.setText(CharSequence)>
		mCheckBox.setChecked(isSelectedRoute(((android.support.v7.media.MediaRouter.RouteInfo) (item))));
	//   16   34:aload_0         
	//   17   35:getfield        #51  <Field CheckBox mCheckBox>
	//   18   38:aload_0         
	//   19   39:getfield        #18  <Field MediaRouteCastDialog$RecyclerAdapter this$1>
	//   20   42:aload_1         
	//   21   43:invokevirtual   #91  <Method boolean MediaRouteCastDialog$RecyclerAdapter.isSelectedRoute(android.support.v7.media.MediaRouter$RouteInfo)>
	//   22   46:invokevirtual   #95  <Method void CheckBox.setChecked(boolean)>
		mVolumeSlider.setColor(mVolumeSliderColor);
	//   23   49:aload_0         
	//   24   50:getfield        #58  <Field MediaRouteVolumeSlider mVolumeSlider>
	//   25   53:aload_0         
	//   26   54:getfield        #18  <Field MediaRouteCastDialog$RecyclerAdapter this$1>
	//   27   57:getfield        #99  <Field MediaRouteCastDialog MediaRouteCastDialog$RecyclerAdapter.this$0>
	//   28   60:getfield        #104 <Field int MediaRouteCastDialog.mVolumeSliderColor>
	//   29   63:invokevirtual   #108 <Method void MediaRouteVolumeSlider.setColor(int)>
		mVolumeSlider.setTag(((Object) (item)));
	//   30   66:aload_0         
	//   31   67:getfield        #58  <Field MediaRouteVolumeSlider mVolumeSlider>
	//   32   70:aload_1         
	//   33   71:invokevirtual   #112 <Method void MediaRouteVolumeSlider.setTag(Object)>
		mVolumeSlider.setProgress(((android.support.v7.media.MediaRouter.RouteInfo) (item)).getVolume());
	//   34   74:aload_0         
	//   35   75:getfield        #58  <Field MediaRouteVolumeSlider mVolumeSlider>
	//   36   78:aload_1         
	//   37   79:invokevirtual   #116 <Method int android.support.v7.media.MediaRouter$RouteInfo.getVolume()>
	//   38   82:invokevirtual   #119 <Method void MediaRouteVolumeSlider.setProgress(int)>
		mVolumeSlider.setOnSeekBarChangeListener(((android.widget.SeekBar.OnSeekBarChangeListener) (mVolumeChangeListener)));
	//   39   85:aload_0         
	//   40   86:getfield        #58  <Field MediaRouteVolumeSlider mVolumeSlider>
	//   41   89:aload_0         
	//   42   90:getfield        #18  <Field MediaRouteCastDialog$RecyclerAdapter this$1>
	//   43   93:getfield        #99  <Field MediaRouteCastDialog MediaRouteCastDialog$RecyclerAdapter.this$0>
	//   44   96:getfield        #123 <Field MediaRouteCastDialog$VolumeChangeListener MediaRouteCastDialog.mVolumeChangeListener>
	//   45   99:invokevirtual   #127 <Method void MediaRouteVolumeSlider.setOnSeekBarChangeListener(android.widget.SeekBar$OnSeekBarChangeListener)>
	//   46  102:return          
	}

	CheckBox mCheckBox;
	ImageView mImageView;
	TextView mTextView;
	MediaRouteVolumeSlider mVolumeSlider;
	final MediaRouteCastDialog.RecyclerAdapter this$1;

	MediaRouteCastDialog$RecyclerAdapter$RouteViewHolder(View view)
	{
		this$1 = MediaRouteCastDialog.RecyclerAdapter.this;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #18  <Field MediaRouteCastDialog$RecyclerAdapter this$1>
		super(view);
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:invokespecial   #21  <Method void android.support.v7.widget.RecyclerView$ViewHolder(View)>
		mImageView = (ImageView)view.findViewById(android.support.v7.mediarouter.R.id.mr_cast_route_icon);
	//    6   10:aload_0         
	//    7   11:aload_2         
	//    8   12:getstatic       #27  <Field int android.support.v7.mediarouter.R$id.mr_cast_route_icon>
	//    9   15:invokevirtual   #33  <Method View View.findViewById(int)>
	//   10   18:checkcast       #35  <Class ImageView>
	//   11   21:putfield        #37  <Field ImageView mImageView>
		mTextView = (TextView)view.findViewById(android.support.v7.mediarouter.R.id.mr_cast_route_name);
	//   12   24:aload_0         
	//   13   25:aload_2         
	//   14   26:getstatic       #40  <Field int android.support.v7.mediarouter.R$id.mr_cast_route_name>
	//   15   29:invokevirtual   #33  <Method View View.findViewById(int)>
	//   16   32:checkcast       #42  <Class TextView>
	//   17   35:putfield        #44  <Field TextView mTextView>
		mCheckBox = (CheckBox)view.findViewById(android.support.v7.mediarouter.R.id.mr_cast_checkbox);
	//   18   38:aload_0         
	//   19   39:aload_2         
	//   20   40:getstatic       #47  <Field int android.support.v7.mediarouter.R$id.mr_cast_checkbox>
	//   21   43:invokevirtual   #33  <Method View View.findViewById(int)>
	//   22   46:checkcast       #49  <Class CheckBox>
	//   23   49:putfield        #51  <Field CheckBox mCheckBox>
		mVolumeSlider = (MediaRouteVolumeSlider)view.findViewById(android.support.v7.mediarouter.R.id.mr_cast_volume_slider);
	//   24   52:aload_0         
	//   25   53:aload_2         
	//   26   54:getstatic       #54  <Field int android.support.v7.mediarouter.R$id.mr_cast_volume_slider>
	//   27   57:invokevirtual   #33  <Method View View.findViewById(int)>
	//   28   60:checkcast       #56  <Class MediaRouteVolumeSlider>
	//   29   63:putfield        #58  <Field MediaRouteVolumeSlider mVolumeSlider>
	//   30   66:return          
	}
}
