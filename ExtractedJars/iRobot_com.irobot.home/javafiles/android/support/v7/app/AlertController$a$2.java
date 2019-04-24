// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v7.app;

import android.content.Context;
import android.database.Cursor;
import android.view.*;
import android.widget.CheckedTextView;
import android.widget.CursorAdapter;

// Referenced classes of package android.support.v7.app:
//			AlertController

class AlertController$a$2 extends CursorAdapter
{

	public void bindView(View view, Context context, Cursor cursor)
	{
		((CheckedTextView)view.findViewById(0x1020014)).setText(((CharSequence) (cursor.getString(d))));
	//    0    0:aload_1         
	//    1    1:ldc1            #54  <Int 0x1020014>
	//    2    3:invokevirtual   #60  <Method View View.findViewById(int)>
	//    3    6:checkcast       #62  <Class CheckedTextView>
	//    4    9:aload_3         
	//    5   10:aload_0         
	//    6   11:getfield        #45  <Field int d>
	//    7   14:invokeinterface #66  <Method String Cursor.getString(int)>
	//    8   19:invokevirtual   #70  <Method void CheckedTextView.setText(CharSequence)>
		view = ((View) (a));
	//    9   22:aload_0         
	//   10   23:getfield        #25  <Field AlertController$RecycleListView a>
	//   11   26:astore_1        
		int i = cursor.getPosition();
	//   12   27:aload_3         
	//   13   28:invokeinterface #74  <Method int Cursor.getPosition()>
	//   14   33:istore          4
		int j = cursor.getInt(e);
	//   15   35:aload_3         
	//   16   36:aload_0         
	//   17   37:getfield        #50  <Field int e>
	//   18   40:invokeinterface #78  <Method int Cursor.getInt(int)>
	//   19   45:istore          5
		boolean flag = true;
	//   20   47:iconst_1        
	//   21   48:istore          6
		if(j != 1)
	//*  22   50:iload           5
	//*  23   52:iconst_1        
	//*  24   53:icmpne          59
	//*  25   56:goto            62
			flag = false;
	//   26   59:iconst_0        
	//   27   60:istore          6
		((cleListView) (view)).setItemChecked(i, flag);
	//   28   62:aload_1         
	//   29   63:iload           4
	//   30   65:iload           6
	//   31   67:invokevirtual   #84  <Method void AlertController$RecycleListView.setItemChecked(int, boolean)>
	//   32   70:return          
	}

	public View newView(Context context, Cursor cursor, ViewGroup viewgroup)
	{
		return c.b.inflate(b.m, viewgroup, false);
	//    0    0:aload_0         
	//    1    1:getfield        #23  <Field AlertController$a c>
	//    2    4:getfield        #89  <Field LayoutInflater AlertController$a.b>
	//    3    7:aload_0         
	//    4    8:getfield        #27  <Field AlertController b>
	//    5   11:getfield        #92  <Field int AlertController.m>
	//    6   14:aload_3         
	//    7   15:iconst_0        
	//    8   16:invokevirtual   #98  <Method View LayoutInflater.inflate(int, ViewGroup, boolean)>
	//    9   19:areturn         
	}

	final cleListView a;
	final AlertController b;
	final AlertController.a c;
	private final int d;
	private final int e;

	AlertController$a$2(AlertController.a a1, Context context, Cursor cursor, boolean flag, cleListView clelistview, AlertController alertcontroller)
	{
		c = a1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #23  <Field AlertController$a c>
		a = clelistview;
	//    3    5:aload_0         
	//    4    6:aload           5
	//    5    8:putfield        #25  <Field AlertController$RecycleListView a>
		b = alertcontroller;
	//    6   11:aload_0         
	//    7   12:aload           6
	//    8   14:putfield        #27  <Field AlertController b>
		super(context, cursor, flag);
	//    9   17:aload_0         
	//   10   18:aload_2         
	//   11   19:aload_3         
	//   12   20:iload           4
	//   13   22:invokespecial   #30  <Method void CursorAdapter(Context, Cursor, boolean)>
		a1 = ((AlertController.a) (getCursor()));
	//   14   25:aload_0         
	//   15   26:invokevirtual   #34  <Method Cursor getCursor()>
	//   16   29:astore_1        
		d = ((Cursor) (a1)).getColumnIndexOrThrow(c.I);
	//   17   30:aload_0         
	//   18   31:aload_1         
	//   19   32:aload_0         
	//   20   33:getfield        #23  <Field AlertController$a c>
	//   21   36:getfield        #37  <Field String AlertController$a.I>
	//   22   39:invokeinterface #43  <Method int Cursor.getColumnIndexOrThrow(String)>
	//   23   44:putfield        #45  <Field int d>
		e = ((Cursor) (a1)).getColumnIndexOrThrow(c.J);
	//   24   47:aload_0         
	//   25   48:aload_1         
	//   26   49:aload_0         
	//   27   50:getfield        #23  <Field AlertController$a c>
	//   28   53:getfield        #48  <Field String AlertController$a.J>
	//   29   56:invokeinterface #43  <Method int Cursor.getColumnIndexOrThrow(String)>
	//   30   61:putfield        #50  <Field int e>
	//   31   64:return          
	}
}
