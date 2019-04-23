// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package biz.bookdesign.catalogbase.support;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcelable;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.AttributeSet;

public class HorizontalRecyclerView extends RecyclerView
{

	public HorizontalRecyclerView(Context context, AttributeSet attributeset)
	{
		super(context, attributeset);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #10  <Method void RecyclerView(Context, AttributeSet)>
		a(context);
	//    4    6:aload_0         
	//    5    7:aload_1         
	//    6    8:invokespecial   #13  <Method void a(Context)>
	//    7   11:return          
	}

	private void a(Context context)
	{
		a = new LinearLayoutManager(context, 0, false);
	//    0    0:aload_0         
	//    1    1:new             #16  <Class LinearLayoutManager>
	//    2    4:dup             
	//    3    5:aload_1         
	//    4    6:iconst_0        
	//    5    7:iconst_0        
	//    6    8:invokespecial   #19  <Method void LinearLayoutManager(Context, int, boolean)>
	//    7   11:putfield        #21  <Field LinearLayoutManager a>
		setLayoutManager(((android.support.v7.widget.RecyclerView.LayoutManager) (a)));
	//    8   14:aload_0         
	//    9   15:aload_0         
	//   10   16:getfield        #21  <Field LinearLayoutManager a>
	//   11   19:invokevirtual   #25  <Method void setLayoutManager(android.support.v7.widget.RecyclerView$LayoutManager)>
	//   12   22:return          
	}

	public void onRestoreInstanceState(Parcelable parcelable)
	{
		parcelable = ((Parcelable) ((Bundle)parcelable));
	//    0    0:aload_1         
	//    1    1:checkcast       #29  <Class Bundle>
	//    2    4:astore_1        
		super.onRestoreInstanceState(((Bundle) (parcelable)).getParcelable("super"));
	//    3    5:aload_0         
	//    4    6:aload_1         
	//    5    7:ldc1            #31  <String "super">
	//    6    9:invokevirtual   #35  <Method Parcelable Bundle.getParcelable(String)>
	//    7   12:invokespecial   #37  <Method void RecyclerView.onRestoreInstanceState(Parcelable)>
		a.onRestoreInstanceState(((Bundle) (parcelable)).getParcelable("layout"));
	//    8   15:aload_0         
	//    9   16:getfield        #21  <Field LinearLayoutManager a>
	//   10   19:aload_1         
	//   11   20:ldc1            #39  <String "layout">
	//   12   22:invokevirtual   #35  <Method Parcelable Bundle.getParcelable(String)>
	//   13   25:invokevirtual   #40  <Method void LinearLayoutManager.onRestoreInstanceState(Parcelable)>
	//   14   28:return          
	}

	public Parcelable onSaveInstanceState()
	{
		Bundle bundle = new Bundle();
	//    0    0:new             #29  <Class Bundle>
	//    1    3:dup             
	//    2    4:invokespecial   #45  <Method void Bundle()>
	//    3    7:astore_1        
		bundle.putParcelable("super", super.onSaveInstanceState());
	//    4    8:aload_1         
	//    5    9:ldc1            #31  <String "super">
	//    6   11:aload_0         
	//    7   12:invokespecial   #47  <Method Parcelable RecyclerView.onSaveInstanceState()>
	//    8   15:invokevirtual   #51  <Method void Bundle.putParcelable(String, Parcelable)>
		bundle.putParcelable("layout", a.onSaveInstanceState());
	//    9   18:aload_1         
	//   10   19:ldc1            #39  <String "layout">
	//   11   21:aload_0         
	//   12   22:getfield        #21  <Field LinearLayoutManager a>
	//   13   25:invokevirtual   #52  <Method Parcelable LinearLayoutManager.onSaveInstanceState()>
	//   14   28:invokevirtual   #51  <Method void Bundle.putParcelable(String, Parcelable)>
		return ((Parcelable) (bundle));
	//   15   31:aload_1         
	//   16   32:areturn         
	}

	private LinearLayoutManager a;
}
