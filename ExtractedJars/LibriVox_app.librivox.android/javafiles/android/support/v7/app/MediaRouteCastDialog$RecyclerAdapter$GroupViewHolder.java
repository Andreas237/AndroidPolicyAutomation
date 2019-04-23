// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v7.app;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

class MediaRouteCastDialog$RecyclerAdapter$GroupViewHolder extends android.support.v7.widget.RecyclerView.ViewHolder
{

	public void bindGroupViewHolder(MediaRouteCastDialog.RecyclerAdapter.Item item)
	{
		item = ((MediaRouteCastDialog.RecyclerAdapter.Item) ((android.support.v7.media.MediaRouter.RouteInfo)item.getData()));
	//    0    0:aload_1         
	//    1    1:invokevirtual   #49  <Method Object MediaRouteCastDialog$RecyclerAdapter$Item.getData()>
	//    2    4:checkcast       #51  <Class android.support.v7.media.MediaRouter$RouteInfo>
	//    3    7:astore_1        
		mImageView.setImageDrawable(getIconDrawable(((android.support.v7.media.MediaRouter.RouteInfo) (item))));
	//    4    8:aload_0         
	//    5    9:getfield        #33  <Field ImageView mImageView>
	//    6   12:aload_0         
	//    7   13:getfield        #14  <Field MediaRouteCastDialog$RecyclerAdapter this$1>
	//    8   16:aload_1         
	//    9   17:invokevirtual   #57  <Method android.graphics.drawable.Drawable MediaRouteCastDialog$RecyclerAdapter.getIconDrawable(android.support.v7.media.MediaRouter$RouteInfo)>
	//   10   20:invokevirtual   #61  <Method void ImageView.setImageDrawable(android.graphics.drawable.Drawable)>
		mTextView.setText(((CharSequence) (((android.support.v7.media.MediaRouter.RouteInfo) (item)).getName())));
	//   11   23:aload_0         
	//   12   24:getfield        #40  <Field TextView mTextView>
	//   13   27:aload_1         
	//   14   28:invokevirtual   #65  <Method String android.support.v7.media.MediaRouter$RouteInfo.getName()>
	//   15   31:invokevirtual   #69  <Method void TextView.setText(CharSequence)>
	//   16   34:return          
	}

	ImageView mImageView;
	TextView mTextView;
	final MediaRouteCastDialog.RecyclerAdapter this$1;

	MediaRouteCastDialog$RecyclerAdapter$GroupViewHolder(View view)
	{
		this$1 = MediaRouteCastDialog.RecyclerAdapter.this;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #14  <Field MediaRouteCastDialog$RecyclerAdapter this$1>
		super(view);
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:invokespecial   #17  <Method void android.support.v7.widget.RecyclerView$ViewHolder(View)>
		mImageView = (ImageView)view.findViewById(android.support.v7.mediarouter.R.id.mr_cast_group_icon);
	//    6   10:aload_0         
	//    7   11:aload_2         
	//    8   12:getstatic       #23  <Field int android.support.v7.mediarouter.R$id.mr_cast_group_icon>
	//    9   15:invokevirtual   #29  <Method View View.findViewById(int)>
	//   10   18:checkcast       #31  <Class ImageView>
	//   11   21:putfield        #33  <Field ImageView mImageView>
		mTextView = (TextView)view.findViewById(android.support.v7.mediarouter.R.id.mr_cast_group_name);
	//   12   24:aload_0         
	//   13   25:aload_2         
	//   14   26:getstatic       #36  <Field int android.support.v7.mediarouter.R$id.mr_cast_group_name>
	//   15   29:invokevirtual   #29  <Method View View.findViewById(int)>
	//   16   32:checkcast       #38  <Class TextView>
	//   17   35:putfield        #40  <Field TextView mTextView>
	//   18   38:return          
	}
}
