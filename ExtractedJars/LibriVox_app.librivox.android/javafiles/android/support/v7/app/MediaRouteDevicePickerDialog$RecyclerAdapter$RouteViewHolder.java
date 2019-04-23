// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v7.app;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

class MediaRouteDevicePickerDialog$RecyclerAdapter$RouteViewHolder extends android.support.v7.widget.RecyclerView.ViewHolder
{

	public void bindRouteView(final MediaRouteDevicePickerDialog.RecyclerAdapter.Item route)
	{
		route = ((MediaRouteDevicePickerDialog.RecyclerAdapter.Item) ((android.support.v7.media.MediaRouter.RouteInfo)route.getData()));
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

			final MediaRouteDevicePickerDialog.RecyclerAdapter.RouteViewHolder this$2;
			final android.support.v7.media.MediaRouter.RouteInfo val$route;

			_cls1()
			{
				this$2 = MediaRouteDevicePickerDialog.RecyclerAdapter.RouteViewHolder.this;
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
	//   22   44:invokevirtual   #78  <Method android.graphics.drawable.Drawable MediaRouteDevicePickerDialog$RecyclerAdapter.getIconDrawable(android.support.v7.media.MediaRouter$RouteInfo)>
	//   23   47:invokevirtual   #82  <Method void ImageView.setImageDrawable(android.graphics.drawable.Drawable)>
	//   24   50:return          
	}

	ImageView mImageView;
	View mItemView;
	TextView mTextView;
	final MediaRouteDevicePickerDialog.RecyclerAdapter this$1;

	MediaRouteDevicePickerDialog$RecyclerAdapter$RouteViewHolder(View view)
	{
		this$1 = MediaRouteDevicePickerDialog.RecyclerAdapter.this;
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
