// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.widget;

import android.content.Context;
import android.database.Cursor;
import android.view.*;

// Referenced classes of package android.support.v4.widget:
//			CursorAdapter

public abstract class ResourceCursorAdapter extends CursorAdapter
{

	public ResourceCursorAdapter(Context context, int i, Cursor cursor, boolean flag)
	{
		super(context, cursor, flag);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_3         
	//    3    3:iload           4
	//    4    5:invokespecial   #15  <Method void CursorAdapter(Context, Cursor, boolean)>
		mDropDownLayout = i;
	//    5    8:aload_0         
	//    6    9:iload_2         
	//    7   10:putfield        #17  <Field int mDropDownLayout>
		mLayout = i;
	//    8   13:aload_0         
	//    9   14:iload_2         
	//   10   15:putfield        #19  <Field int mLayout>
		mInflater = (LayoutInflater)context.getSystemService("layout_inflater");
	//   11   18:aload_0         
	//   12   19:aload_1         
	//   13   20:ldc1            #21  <String "layout_inflater">
	//   14   22:invokevirtual   #27  <Method Object Context.getSystemService(String)>
	//   15   25:checkcast       #29  <Class LayoutInflater>
	//   16   28:putfield        #31  <Field LayoutInflater mInflater>
	//   17   31:return          
	}

	public View newDropDownView(Context context, Cursor cursor, ViewGroup viewgroup)
	{
		return mInflater.inflate(mDropDownLayout, viewgroup, false);
	//    0    0:aload_0         
	//    1    1:getfield        #31  <Field LayoutInflater mInflater>
	//    2    4:aload_0         
	//    3    5:getfield        #17  <Field int mDropDownLayout>
	//    4    8:aload_3         
	//    5    9:iconst_0        
	//    6   10:invokevirtual   #39  <Method View LayoutInflater.inflate(int, ViewGroup, boolean)>
	//    7   13:areturn         
	}

	public View newView(Context context, Cursor cursor, ViewGroup viewgroup)
	{
		return mInflater.inflate(mLayout, viewgroup, false);
	//    0    0:aload_0         
	//    1    1:getfield        #31  <Field LayoutInflater mInflater>
	//    2    4:aload_0         
	//    3    5:getfield        #19  <Field int mLayout>
	//    4    8:aload_3         
	//    5    9:iconst_0        
	//    6   10:invokevirtual   #39  <Method View LayoutInflater.inflate(int, ViewGroup, boolean)>
	//    7   13:areturn         
	}

	private int mDropDownLayout;
	private LayoutInflater mInflater;
	private int mLayout;
}
