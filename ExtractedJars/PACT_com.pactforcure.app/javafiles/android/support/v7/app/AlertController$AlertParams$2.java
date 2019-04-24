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

class AlertController$AlertParams$2 extends CursorAdapter
{

	public void bindView(View view, Context context, Cursor cursor)
	{
		boolean flag = true;
	//    0    0:iconst_1        
	//    1    1:istore          5
		((CheckedTextView)view.findViewById(0x1020014)).setText(((CharSequence) (cursor.getString(mLabelIndex))));
	//    2    3:aload_1         
	//    3    4:ldc1            #57  <Int 0x1020014>
	//    4    6:invokevirtual   #63  <Method View View.findViewById(int)>
	//    5    9:checkcast       #65  <Class CheckedTextView>
	//    6   12:aload_3         
	//    7   13:aload_0         
	//    8   14:getfield        #48  <Field int mLabelIndex>
	//    9   17:invokeinterface #69  <Method String Cursor.getString(int)>
	//   10   22:invokevirtual   #73  <Method void CheckedTextView.setText(CharSequence)>
		view = ((View) (val$listView));
	//   11   25:aload_0         
	//   12   26:getfield        #27  <Field AlertController$RecycleListView val$listView>
	//   13   29:astore_1        
		int i = cursor.getPosition();
	//   14   30:aload_3         
	//   15   31:invokeinterface #77  <Method int Cursor.getPosition()>
	//   16   36:istore          4
		if(cursor.getInt(mIsCheckedIndex) != 1)
	//*  17   38:aload_3         
	//*  18   39:aload_0         
	//*  19   40:getfield        #53  <Field int mIsCheckedIndex>
	//*  20   43:invokeinterface #81  <Method int Cursor.getInt(int)>
	//*  21   48:iconst_1        
	//*  22   49:icmpne          61
	//*  23   52:aload_1         
	//*  24   53:iload           4
	//*  25   55:iload           5
	//*  26   57:invokevirtual   #87  <Method void AlertController$RecycleListView.setItemChecked(int, boolean)>
	//*  27   60:return          
			flag = false;
	//   28   61:iconst_0        
	//   29   62:istore          5
		((w) (view)).setItemChecked(i, flag);
	//*  30   64:goto            52
	}

	public View newView(Context context, Cursor cursor, ViewGroup viewgroup)
	{
		return mInflater.inflate(val$dialog.mMultiChoiceItemLayout, viewgroup, false);
	//    0    0:aload_0         
	//    1    1:getfield        #25  <Field AlertController$AlertParams this$0>
	//    2    4:getfield        #93  <Field LayoutInflater AlertController$AlertParams.mInflater>
	//    3    7:aload_0         
	//    4    8:getfield        #29  <Field AlertController val$dialog>
	//    5   11:getfield        #96  <Field int AlertController.mMultiChoiceItemLayout>
	//    6   14:aload_3         
	//    7   15:iconst_0        
	//    8   16:invokevirtual   #102 <Method View LayoutInflater.inflate(int, ViewGroup, boolean)>
	//    9   19:areturn         
	}

	private final int mIsCheckedIndex;
	private final int mLabelIndex;
	final AlertController.AlertParams this$0;
	final AlertController val$dialog;
	final w val$listView;

	AlertController$AlertParams$2(boolean flag, w w, AlertController alertcontroller)
	{
		this$0 = final_alertparams;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #25  <Field AlertController$AlertParams this$0>
		val$listView = w;
	//    3    5:aload_0         
	//    4    6:aload           5
	//    5    8:putfield        #27  <Field AlertController$RecycleListView val$listView>
		val$dialog = alertcontroller;
	//    6   11:aload_0         
	//    7   12:aload           6
	//    8   14:putfield        #29  <Field AlertController val$dialog>
		super(final_context, Cursor.this, flag);
	//    9   17:aload_0         
	//   10   18:aload_2         
	//   11   19:aload_3         
	//   12   20:iload           4
	//   13   22:invokespecial   #32  <Method void CursorAdapter(Context, Cursor, boolean)>
		final_alertparams = ((AlertController.AlertParams) (getCursor()));
	//   14   25:aload_0         
	//   15   26:invokevirtual   #36  <Method Cursor getCursor()>
	//   16   29:astore_1        
		mLabelIndex = ((Cursor) (final_alertparams)).getColumnIndexOrThrow(mLabelColumn);
	//   17   30:aload_0         
	//   18   31:aload_1         
	//   19   32:aload_0         
	//   20   33:getfield        #25  <Field AlertController$AlertParams this$0>
	//   21   36:getfield        #40  <Field String AlertController$AlertParams.mLabelColumn>
	//   22   39:invokeinterface #46  <Method int Cursor.getColumnIndexOrThrow(String)>
	//   23   44:putfield        #48  <Field int mLabelIndex>
		mIsCheckedIndex = ((Cursor) (final_alertparams)).getColumnIndexOrThrow(mIsCheckedColumn);
	//   24   47:aload_0         
	//   25   48:aload_1         
	//   26   49:aload_0         
	//   27   50:getfield        #25  <Field AlertController$AlertParams this$0>
	//   28   53:getfield        #51  <Field String AlertController$AlertParams.mIsCheckedColumn>
	//   29   56:invokeinterface #46  <Method int Cursor.getColumnIndexOrThrow(String)>
	//   30   61:putfield        #53  <Field int mIsCheckedIndex>
	//   31   64:return          
	}
}
