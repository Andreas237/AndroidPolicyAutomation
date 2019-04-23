// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v7.app;

import android.view.View;
import android.widget.TextView;

class MediaRouteDevicePickerDialog$RecyclerAdapter$HeaderViewHolder extends android.support.v7.widget.RecyclerView.ViewHolder
{

	public void binHeaderView(MediaRouteDevicePickerDialog.RecyclerAdapter.Item item)
	{
		item = ((MediaRouteDevicePickerDialog.RecyclerAdapter.Item) (item.getData().toString()));
	//    0    0:aload_1         
	//    1    1:invokevirtual   #40  <Method Object MediaRouteDevicePickerDialog$RecyclerAdapter$Item.getData()>
	//    2    4:invokevirtual   #46  <Method String Object.toString()>
	//    3    7:astore_1        
		mTextView.setText(((CharSequence) (item)));
	//    4    8:aload_0         
	//    5    9:getfield        #31  <Field TextView mTextView>
	//    6   12:aload_1         
	//    7   13:invokevirtual   #50  <Method void TextView.setText(CharSequence)>
	//    8   16:return          
	}

	TextView mTextView;
	final MediaRouteDevicePickerDialog.RecyclerAdapter this$1;

	MediaRouteDevicePickerDialog$RecyclerAdapter$HeaderViewHolder(View view)
	{
		this$1 = MediaRouteDevicePickerDialog.RecyclerAdapter.this;
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
