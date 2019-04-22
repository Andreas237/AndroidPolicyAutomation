// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v7.app;

import android.content.Context;
import android.database.Cursor;
import android.graphics.drawable.Drawable;
import android.view.*;
import android.widget.*;

// Referenced classes of package android.support.v7.app:
//			AlertController, AppCompatDialog

public static class AlertController$AlertParams
{
	public static interface OnPrepareListViewListener
	{

		public abstract void onPrepareListView(ListView listview);
	}


	private void createListView(final AlertController dialog)
	{
		final iew listView = (iew)mInflater.inflate(dialog.mListLayout, ((ViewGroup) (null)));
	//    0    0:aload_0         
	//    1    1:getfield        #110 <Field LayoutInflater mInflater>
	//    2    4:aload_1         
	//    3    5:getfield        #116 <Field int AlertController.mListLayout>
	//    4    8:aconst_null     
	//    5    9:invokevirtual   #120 <Method View LayoutInflater.inflate(int, ViewGroup)>
	//    6   12:checkcast       #122 <Class AlertController$RecycleListView>
	//    7   15:astore          4
		Object obj;
		if(mIsMultiChoice)
	//*   8   17:aload_0         
	//*   9   18:getfield        #124 <Field boolean mIsMultiChoice>
	//*  10   21:ifeq            82
		{
			obj = ((Object) (mCursor));
	//   11   24:aload_0         
	//   12   25:getfield        #126 <Field Cursor mCursor>
	//   13   28:astore_3        
			if(obj == null)
	//*  14   29:aload_3         
	//*  15   30:ifnonnull       61
				obj = ((Object) (new ArrayAdapter(dialog.mMultiChoiceItemLayout, 0x1020014, mItems, listView) {

					public View getView(int j, View view, ViewGroup viewgroup)
					{
						view = super.getView(j, view, viewgroup);
					//    0    0:aload_0         
					//    1    1:iload_1         
					//    2    2:aload_2         
					//    3    3:aload_3         
					//    4    4:invokespecial   #31  <Method View ArrayAdapter.getView(int, View, ViewGroup)>
					//    5    7:astore_2        
						if(mCheckedItems != null && mCheckedItems[j])
					//*   6    8:aload_0         
					//*   7    9:getfield        #21  <Field AlertController$AlertParams this$0>
					//*   8   12:getfield        #35  <Field boolean[] AlertController$AlertParams.mCheckedItems>
					//*   9   15:ifnull          39
					//*  10   18:aload_0         
					//*  11   19:getfield        #21  <Field AlertController$AlertParams this$0>
					//*  12   22:getfield        #35  <Field boolean[] AlertController$AlertParams.mCheckedItems>
					//*  13   25:iload_1         
					//*  14   26:baload          
					//*  15   27:ifeq            39
							listView.setItemChecked(j, true);
					//   16   30:aload_0         
					//   17   31:getfield        #23  <Field AlertController$RecycleListView val$listView>
					//   18   34:iload_1         
					//   19   35:iconst_1        
					//   20   36:invokevirtual   #41  <Method void AlertController$RecycleListView.setItemChecked(int, boolean)>
						return view;
					//   21   39:aload_2         
					//   22   40:areturn         
					}

					final AlertController.AlertParams this$0;
					final AlertController.RecycleListView val$listView;

			
			{
				this$0 = AlertController.AlertParams.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #21  <Field AlertController$AlertParams this$0>
				listView = recyclelistview;
			//    3    5:aload_0         
			//    4    6:aload           6
			//    5    8:putfield        #23  <Field AlertController$RecycleListView val$listView>
				super(final_context, i, j, ((Object []) (acharsequence)));
			//    6   11:aload_0         
			//    7   12:aload_2         
			//    8   13:iload_3         
			//    9   14:iload           4
			//   10   16:aload           5
			//   11   18:invokespecial   #26  <Method void ArrayAdapter(Context, int, int, Object[])>
			//   12   21:return          
			}
				}
));
	//   16   33:new             #9   <Class AlertController$AlertParams$1>
	//   17   36:dup             
	//   18   37:aload_0         
	//   19   38:aload_0         
	//   20   39:getfield        #96  <Field Context mContext>
	//   21   42:aload_1         
	//   22   43:getfield        #129 <Field int AlertController.mMultiChoiceItemLayout>
	//   23   46:ldc1            #130 <Int 0x1020014>
	//   24   48:aload_0         
	//   25   49:getfield        #132 <Field CharSequence[] mItems>
	//   26   52:aload           4
	//   27   54:invokespecial   #135 <Method void AlertController$AlertParams$1(AlertController$AlertParams, Context, int, int, CharSequence[], AlertController$RecycleListView)>
	//   28   57:astore_3        
			else
	//*  29   58:goto            178
				obj = ((Object) (new CursorAdapter(false, listView, dialog) {

					public void bindView(View view, Context context, Cursor cursor)
					{
						((CheckedTextView)view.findViewById(0x1020014)).setText(((CharSequence) (cursor.getString(mLabelIndex))));
					//    0    0:aload_1         
					//    1    1:ldc1            #57  <Int 0x1020014>
					//    2    3:invokevirtual   #63  <Method View View.findViewById(int)>
					//    3    6:checkcast       #65  <Class CheckedTextView>
					//    4    9:aload_3         
					//    5   10:aload_0         
					//    6   11:getfield        #48  <Field int mLabelIndex>
					//    7   14:invokeinterface #69  <Method String Cursor.getString(int)>
					//    8   19:invokevirtual   #73  <Method void CheckedTextView.setText(CharSequence)>
						view = ((View) (listView));
					//    9   22:aload_0         
					//   10   23:getfield        #27  <Field AlertController$RecycleListView val$listView>
					//   11   26:astore_1        
						int j = cursor.getPosition();
					//   12   27:aload_3         
					//   13   28:invokeinterface #77  <Method int Cursor.getPosition()>
					//   14   33:istore          4
						int k = cursor.getInt(mIsCheckedIndex);
					//   15   35:aload_3         
					//   16   36:aload_0         
					//   17   37:getfield        #53  <Field int mIsCheckedIndex>
					//   18   40:invokeinterface #81  <Method int Cursor.getInt(int)>
					//   19   45:istore          5
						boolean flag = true;
					//   20   47:iconst_1        
					//   21   48:istore          6
						if(k != 1)
					//*  22   50:iload           5
					//*  23   52:iconst_1        
					//*  24   53:icmpne          59
					//*  25   56:goto            62
							flag = false;
					//   26   59:iconst_0        
					//   27   60:istore          6
						((AlertController.RecycleListView) (view)).setItemChecked(j, flag);
					//   28   62:aload_1         
					//   29   63:iload           4
					//   30   65:iload           6
					//   31   67:invokevirtual   #87  <Method void AlertController$RecycleListView.setItemChecked(int, boolean)>
					//   32   70:return          
					}

					public View newView(Context context, Cursor cursor, ViewGroup viewgroup)
					{
						return mInflater.inflate(dialog.mMultiChoiceItemLayout, viewgroup, false);
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
					final AlertController.RecycleListView val$listView;

			
			{
				this$0 = AlertController.AlertParams.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #25  <Field AlertController$AlertParams this$0>
				listView = recyclelistview;
			//    3    5:aload_0         
			//    4    6:aload           5
			//    5    8:putfield        #27  <Field AlertController$RecycleListView val$listView>
				dialog = alertcontroller;
			//    6   11:aload_0         
			//    7   12:aload           6
			//    8   14:putfield        #29  <Field AlertController val$dialog>
				super(final_context, final_cursor, flag);
			//    9   17:aload_0         
			//   10   18:aload_2         
			//   11   19:aload_3         
			//   12   20:iload           4
			//   13   22:invokespecial   #32  <Method void CursorAdapter(Context, Cursor, boolean)>
				alertparams = ((AlertController.AlertParams) (getCursor()));
			//   14   25:aload_0         
			//   15   26:invokevirtual   #36  <Method Cursor getCursor()>
			//   16   29:astore_1        
				mLabelIndex = getColumnIndexOrThrow(mLabelColumn);
			//   17   30:aload_0         
			//   18   31:aload_1         
			//   19   32:aload_0         
			//   20   33:getfield        #25  <Field AlertController$AlertParams this$0>
			//   21   36:getfield        #40  <Field String AlertController$AlertParams.mLabelColumn>
			//   22   39:invokeinterface #46  <Method int Cursor.getColumnIndexOrThrow(String)>
			//   23   44:putfield        #48  <Field int mLabelIndex>
				mIsCheckedIndex = getColumnIndexOrThrow(mIsCheckedColumn);
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
));
	//   30   61:new             #11  <Class AlertController$AlertParams$2>
	//   31   64:dup             
	//   32   65:aload_0         
	//   33   66:aload_0         
	//   34   67:getfield        #96  <Field Context mContext>
	//   35   70:aload_3         
	//   36   71:iconst_0        
	//   37   72:aload           4
	//   38   74:aload_1         
	//   39   75:invokespecial   #138 <Method void AlertController$AlertParams$2(AlertController$AlertParams, Context, Cursor, boolean, AlertController$RecycleListView, AlertController)>
	//   40   78:astore_3        
		} else
	//*  41   79:goto            178
		{
			int i;
			if(mIsSingleChoice)
	//*  42   82:aload_0         
	//*  43   83:getfield        #140 <Field boolean mIsSingleChoice>
	//*  44   86:ifeq            97
				i = dialog.mSingleChoiceItemLayout;
	//   45   89:aload_1         
	//   46   90:getfield        #143 <Field int AlertController.mSingleChoiceItemLayout>
	//   47   93:istore_2        
			else
	//*  48   94:goto            102
				i = dialog.mListItemLayout;
	//   49   97:aload_1         
	//   50   98:getfield        #146 <Field int AlertController.mListItemLayout>
	//   51  101:istore_2        
			obj = ((Object) (mCursor));
	//   52  102:aload_0         
	//   53  103:getfield        #126 <Field Cursor mCursor>
	//   54  106:astore_3        
			if(obj != null)
	//*  55  107:aload_3         
	//*  56  108:ifnull          147
			{
				obj = ((Object) (new SimpleCursorAdapter(mContext, i, ((Cursor) (obj)), new String[] {
					mLabelColumn
				}, new int[] {
					0x1020014
				})));
	//   57  111:new             #148 <Class SimpleCursorAdapter>
	//   58  114:dup             
	//   59  115:aload_0         
	//   60  116:getfield        #96  <Field Context mContext>
	//   61  119:iload_2         
	//   62  120:aload_3         
	//   63  121:iconst_1        
	//   64  122:anewarray       String[]
	//   65  125:dup             
	//   66  126:iconst_0        
	//   67  127:aload_0         
	//   68  128:getfield        #152 <Field String mLabelColumn>
	//   69  131:aastore         
	//   70  132:iconst_1        
	//   71  133:newarray        int[]
	//   72  135:dup             
	//   73  136:iconst_0        
	//   74  137:ldc1            #130 <Int 0x1020014>
	//   75  139:iastore         
	//   76  140:invokespecial   #155 <Method void SimpleCursorAdapter(Context, int, Cursor, String[], int[])>
	//   77  143:astore_3        
			} else
	//*  78  144:goto            178
			{
				obj = ((Object) (mAdapter));
	//   79  147:aload_0         
	//   80  148:getfield        #157 <Field ListAdapter mAdapter>
	//   81  151:astore_3        
				if(obj == null)
	//*  82  152:aload_3         
	//*  83  153:ifnull          159
	//*  84  156:goto            178
					obj = ((Object) (new dapter(mContext, i, 0x1020014, mItems)));
	//   85  159:new             #159 <Class AlertController$CheckedItemAdapter>
	//   86  162:dup             
	//   87  163:aload_0         
	//   88  164:getfield        #96  <Field Context mContext>
	//   89  167:iload_2         
	//   90  168:ldc1            #130 <Int 0x1020014>
	//   91  170:aload_0         
	//   92  171:getfield        #132 <Field CharSequence[] mItems>
	//   93  174:invokespecial   #162 <Method void AlertController$CheckedItemAdapter(Context, int, int, CharSequence[])>
	//   94  177:astore_3        
			}
		}
		OnPrepareListViewListener onpreparelistviewlistener = mOnPrepareListViewListener;
	//   95  178:aload_0         
	//   96  179:getfield        #164 <Field AlertController$AlertParams$OnPrepareListViewListener mOnPrepareListViewListener>
	//   97  182:astore          5
		if(onpreparelistviewlistener != null)
	//*  98  184:aload           5
	//*  99  186:ifnull          198
			onpreparelistviewlistener.onPrepareListView(((ListView) (listView)));
	//  100  189:aload           5
	//  101  191:aload           4
	//  102  193:invokeinterface #168 <Method void AlertController$AlertParams$OnPrepareListViewListener.onPrepareListView(ListView)>
		dialog.mAdapter = ((ListAdapter) (obj));
	//  103  198:aload_1         
	//  104  199:aload_3         
	//  105  200:putfield        #169 <Field ListAdapter AlertController.mAdapter>
		dialog.mCheckedItem = mCheckedItem;
	//  106  203:aload_1         
	//  107  204:aload_0         
	//  108  205:getfield        #92  <Field int mCheckedItem>
	//  109  208:putfield        #170 <Field int AlertController.mCheckedItem>
		if(mOnClickListener != null)
	//* 110  211:aload_0         
	//* 111  212:getfield        #172 <Field android.content.DialogInterface$OnClickListener mOnClickListener>
	//* 112  215:ifnull          235
			listView.setOnItemClickListener(new android.widget.AdapterView.OnItemClickListener() {

				public void onItemClick(AdapterView adapterview, View view, int j, long l)
				{
					mOnClickListener.onClick(((android.content.DialogInterface) (dialog.mDialog)), j);
				//    0    0:aload_0         
				//    1    1:getfield        #22  <Field AlertController$AlertParams this$0>
				//    2    4:getfield        #34  <Field android.content.DialogInterface$OnClickListener AlertController$AlertParams.mOnClickListener>
				//    3    7:aload_0         
				//    4    8:getfield        #24  <Field AlertController val$dialog>
				//    5   11:getfield        #38  <Field AppCompatDialog AlertController.mDialog>
				//    6   14:iload_3         
				//    7   15:invokeinterface #44  <Method void android.content.DialogInterface$OnClickListener.onClick(android.content.DialogInterface, int)>
					if(!mIsSingleChoice)
				//*   8   20:aload_0         
				//*   9   21:getfield        #22  <Field AlertController$AlertParams this$0>
				//*  10   24:getfield        #48  <Field boolean AlertController$AlertParams.mIsSingleChoice>
				//*  11   27:ifne            40
						dialog.mDialog.dismiss();
				//   12   30:aload_0         
				//   13   31:getfield        #24  <Field AlertController val$dialog>
				//   14   34:getfield        #38  <Field AppCompatDialog AlertController.mDialog>
				//   15   37:invokevirtual   #53  <Method void AppCompatDialog.dismiss()>
				//   16   40:return          
				}

				final AlertController.AlertParams this$0;
				final AlertController val$dialog;

			
			{
				this$0 = AlertController.AlertParams.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #22  <Field AlertController$AlertParams this$0>
				dialog = alertcontroller;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #24  <Field AlertController val$dialog>
				super();
			//    6   10:aload_0         
			//    7   11:invokespecial   #27  <Method void Object()>
			//    8   14:return          
			}
			}
);
	//  113  218:aload           4
	//  114  220:new             #13  <Class AlertController$AlertParams$3>
	//  115  223:dup             
	//  116  224:aload_0         
	//  117  225:aload_1         
	//  118  226:invokespecial   #175 <Method void AlertController$AlertParams$3(AlertController$AlertParams, AlertController)>
	//  119  229:invokevirtual   #179 <Method void AlertController$RecycleListView.setOnItemClickListener(android.widget.AdapterView$OnItemClickListener)>
		else
	//* 120  232:goto            258
		if(mOnCheckboxClickListener != null)
	//* 121  235:aload_0         
	//* 122  236:getfield        #181 <Field android.content.DialogInterface$OnMultiChoiceClickListener mOnCheckboxClickListener>
	//* 123  239:ifnull          258
			listView.setOnItemClickListener(new android.widget.AdapterView.OnItemClickListener() {

				public void onItemClick(AdapterView adapterview, View view, int j, long l)
				{
					if(mCheckedItems != null)
				//*   0    0:aload_0         
				//*   1    1:getfield        #24  <Field AlertController$AlertParams this$0>
				//*   2    4:getfield        #38  <Field boolean[] AlertController$AlertParams.mCheckedItems>
				//*   3    7:ifnull          27
						mCheckedItems[j] = listView.isItemChecked(j);
				//    4   10:aload_0         
				//    5   11:getfield        #24  <Field AlertController$AlertParams this$0>
				//    6   14:getfield        #38  <Field boolean[] AlertController$AlertParams.mCheckedItems>
				//    7   17:iload_3         
				//    8   18:aload_0         
				//    9   19:getfield        #26  <Field AlertController$RecycleListView val$listView>
				//   10   22:iload_3         
				//   11   23:invokevirtual   #44  <Method boolean AlertController$RecycleListView.isItemChecked(int)>
				//   12   26:bastore         
					mOnCheckboxClickListener.onClick(((android.content.DialogInterface) (dialog.mDialog)), j, listView.isItemChecked(j));
				//   13   27:aload_0         
				//   14   28:getfield        #24  <Field AlertController$AlertParams this$0>
				//   15   31:getfield        #48  <Field android.content.DialogInterface$OnMultiChoiceClickListener AlertController$AlertParams.mOnCheckboxClickListener>
				//   16   34:aload_0         
				//   17   35:getfield        #28  <Field AlertController val$dialog>
				//   18   38:getfield        #52  <Field AppCompatDialog AlertController.mDialog>
				//   19   41:iload_3         
				//   20   42:aload_0         
				//   21   43:getfield        #26  <Field AlertController$RecycleListView val$listView>
				//   22   46:iload_3         
				//   23   47:invokevirtual   #44  <Method boolean AlertController$RecycleListView.isItemChecked(int)>
				//   24   50:invokeinterface #58  <Method void android.content.DialogInterface$OnMultiChoiceClickListener.onClick(android.content.DialogInterface, int, boolean)>
				//   25   55:return          
				}

				final AlertController.AlertParams this$0;
				final AlertController val$dialog;
				final AlertController.RecycleListView val$listView;

			
			{
				this$0 = AlertController.AlertParams.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #24  <Field AlertController$AlertParams this$0>
				listView = recyclelistview;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #26  <Field AlertController$RecycleListView val$listView>
				dialog = alertcontroller;
			//    6   10:aload_0         
			//    7   11:aload_3         
			//    8   12:putfield        #28  <Field AlertController val$dialog>
				super();
			//    9   15:aload_0         
			//   10   16:invokespecial   #31  <Method void Object()>
			//   11   19:return          
			}
			}
);
	//  124  242:aload           4
	//  125  244:new             #15  <Class AlertController$AlertParams$4>
	//  126  247:dup             
	//  127  248:aload_0         
	//  128  249:aload           4
	//  129  251:aload_1         
	//  130  252:invokespecial   #184 <Method void AlertController$AlertParams$4(AlertController$AlertParams, AlertController$RecycleListView, AlertController)>
	//  131  255:invokevirtual   #179 <Method void AlertController$RecycleListView.setOnItemClickListener(android.widget.AdapterView$OnItemClickListener)>
		obj = ((Object) (mOnItemSelectedListener));
	//  132  258:aload_0         
	//  133  259:getfield        #186 <Field android.widget.AdapterView$OnItemSelectedListener mOnItemSelectedListener>
	//  134  262:astore_3        
		if(obj != null)
	//* 135  263:aload_3         
	//* 136  264:ifnull          273
			listView.setOnItemSelectedListener(((android.widget.stener) (obj)));
	//  137  267:aload           4
	//  138  269:aload_3         
	//  139  270:invokevirtual   #190 <Method void AlertController$RecycleListView.setOnItemSelectedListener(android.widget.AdapterView$OnItemSelectedListener)>
		if(mIsSingleChoice)
	//* 140  273:aload_0         
	//* 141  274:getfield        #140 <Field boolean mIsSingleChoice>
	//* 142  277:ifeq            289
			listView.setChoiceMode(1);
	//  143  280:aload           4
	//  144  282:iconst_1        
	//  145  283:invokevirtual   #194 <Method void AlertController$RecycleListView.setChoiceMode(int)>
		else
	//* 146  286:goto            302
		if(mIsMultiChoice)
	//* 147  289:aload_0         
	//* 148  290:getfield        #124 <Field boolean mIsMultiChoice>
	//* 149  293:ifeq            302
			listView.setChoiceMode(2);
	//  150  296:aload           4
	//  151  298:iconst_2        
	//  152  299:invokevirtual   #194 <Method void AlertController$RecycleListView.setChoiceMode(int)>
		dialog.mListView = ((ListView) (listView));
	//  153  302:aload_1         
	//  154  303:aload           4
	//  155  305:putfield        #198 <Field ListView AlertController.mListView>
	//  156  308:return          
	}

	public void apply(AlertController alertcontroller)
	{
		Object obj = ((Object) (mCustomTitleView));
	//    0    0:aload_0         
	//    1    1:getfield        #201 <Field View mCustomTitleView>
	//    2    4:astore_3        
		if(obj != null)
	//*   3    5:aload_3         
	//*   4    6:ifnull          17
		{
			alertcontroller.setCustomTitle(((View) (obj)));
	//    5    9:aload_1         
	//    6   10:aload_3         
	//    7   11:invokevirtual   #205 <Method void AlertController.setCustomTitle(View)>
		} else
	//*   8   14:goto            77
		{
			obj = ((Object) (mTitle));
	//    9   17:aload_0         
	//   10   18:getfield        #207 <Field CharSequence mTitle>
	//   11   21:astore_3        
			if(obj != null)
	//*  12   22:aload_3         
	//*  13   23:ifnull          31
				alertcontroller.setTitle(((CharSequence) (obj)));
	//   14   26:aload_1         
	//   15   27:aload_3         
	//   16   28:invokevirtual   #211 <Method void AlertController.setTitle(CharSequence)>
			obj = ((Object) (mIcon));
	//   17   31:aload_0         
	//   18   32:getfield        #213 <Field Drawable mIcon>
	//   19   35:astore_3        
			if(obj != null)
	//*  20   36:aload_3         
	//*  21   37:ifnull          45
				alertcontroller.setIcon(((Drawable) (obj)));
	//   22   40:aload_1         
	//   23   41:aload_3         
	//   24   42:invokevirtual   #217 <Method void AlertController.setIcon(Drawable)>
			int i = mIconId;
	//   25   45:aload_0         
	//   26   46:getfield        #86  <Field int mIconId>
	//   27   49:istore_2        
			if(i != 0)
	//*  28   50:iload_2         
	//*  29   51:ifeq            59
				alertcontroller.setIcon(i);
	//   30   54:aload_1         
	//   31   55:iload_2         
	//   32   56:invokevirtual   #219 <Method void AlertController.setIcon(int)>
			i = mIconAttrId;
	//   33   59:aload_0         
	//   34   60:getfield        #88  <Field int mIconAttrId>
	//   35   63:istore_2        
			if(i != 0)
	//*  36   64:iload_2         
	//*  37   65:ifeq            77
				alertcontroller.setIcon(alertcontroller.getIconAttributeResId(i));
	//   38   68:aload_1         
	//   39   69:aload_1         
	//   40   70:iload_2         
	//   41   71:invokevirtual   #223 <Method int AlertController.getIconAttributeResId(int)>
	//   42   74:invokevirtual   #219 <Method void AlertController.setIcon(int)>
		}
		obj = ((Object) (mMessage));
	//   43   77:aload_0         
	//   44   78:getfield        #225 <Field CharSequence mMessage>
	//   45   81:astore_3        
		if(obj != null)
	//*  46   82:aload_3         
	//*  47   83:ifnull          91
			alertcontroller.setMessage(((CharSequence) (obj)));
	//   48   86:aload_1         
	//   49   87:aload_3         
	//   50   88:invokevirtual   #228 <Method void AlertController.setMessage(CharSequence)>
		if(mPositiveButtonText != null || mPositiveButtonIcon != null)
	//*  51   91:aload_0         
	//*  52   92:getfield        #230 <Field CharSequence mPositiveButtonText>
	//*  53   95:ifnonnull       105
	//*  54   98:aload_0         
	//*  55   99:getfield        #232 <Field Drawable mPositiveButtonIcon>
	//*  56  102:ifnull          123
			alertcontroller.setButton(-1, mPositiveButtonText, mPositiveButtonListener, ((android.os.Message) (null)), mPositiveButtonIcon);
	//   57  105:aload_1         
	//   58  106:iconst_m1       
	//   59  107:aload_0         
	//   60  108:getfield        #230 <Field CharSequence mPositiveButtonText>
	//   61  111:aload_0         
	//   62  112:getfield        #234 <Field android.content.DialogInterface$OnClickListener mPositiveButtonListener>
	//   63  115:aconst_null     
	//   64  116:aload_0         
	//   65  117:getfield        #232 <Field Drawable mPositiveButtonIcon>
	//   66  120:invokevirtual   #238 <Method void AlertController.setButton(int, CharSequence, android.content.DialogInterface$OnClickListener, android.os.Message, Drawable)>
		if(mNegativeButtonText != null || mNegativeButtonIcon != null)
	//*  67  123:aload_0         
	//*  68  124:getfield        #240 <Field CharSequence mNegativeButtonText>
	//*  69  127:ifnonnull       137
	//*  70  130:aload_0         
	//*  71  131:getfield        #242 <Field Drawable mNegativeButtonIcon>
	//*  72  134:ifnull          156
			alertcontroller.setButton(-2, mNegativeButtonText, mNegativeButtonListener, ((android.os.Message) (null)), mNegativeButtonIcon);
	//   73  137:aload_1         
	//   74  138:bipush          -2
	//   75  140:aload_0         
	//   76  141:getfield        #240 <Field CharSequence mNegativeButtonText>
	//   77  144:aload_0         
	//   78  145:getfield        #244 <Field android.content.DialogInterface$OnClickListener mNegativeButtonListener>
	//   79  148:aconst_null     
	//   80  149:aload_0         
	//   81  150:getfield        #242 <Field Drawable mNegativeButtonIcon>
	//   82  153:invokevirtual   #238 <Method void AlertController.setButton(int, CharSequence, android.content.DialogInterface$OnClickListener, android.os.Message, Drawable)>
		if(mNeutralButtonText != null || mNeutralButtonIcon != null)
	//*  83  156:aload_0         
	//*  84  157:getfield        #246 <Field CharSequence mNeutralButtonText>
	//*  85  160:ifnonnull       170
	//*  86  163:aload_0         
	//*  87  164:getfield        #248 <Field Drawable mNeutralButtonIcon>
	//*  88  167:ifnull          189
			alertcontroller.setButton(-3, mNeutralButtonText, mNeutralButtonListener, ((android.os.Message) (null)), mNeutralButtonIcon);
	//   89  170:aload_1         
	//   90  171:bipush          -3
	//   91  173:aload_0         
	//   92  174:getfield        #246 <Field CharSequence mNeutralButtonText>
	//   93  177:aload_0         
	//   94  178:getfield        #250 <Field android.content.DialogInterface$OnClickListener mNeutralButtonListener>
	//   95  181:aconst_null     
	//   96  182:aload_0         
	//   97  183:getfield        #248 <Field Drawable mNeutralButtonIcon>
	//   98  186:invokevirtual   #238 <Method void AlertController.setButton(int, CharSequence, android.content.DialogInterface$OnClickListener, android.os.Message, Drawable)>
		if(mItems != null || mCursor != null || mAdapter != null)
	//*  99  189:aload_0         
	//* 100  190:getfield        #132 <Field CharSequence[] mItems>
	//* 101  193:ifnonnull       210
	//* 102  196:aload_0         
	//* 103  197:getfield        #126 <Field Cursor mCursor>
	//* 104  200:ifnonnull       210
	//* 105  203:aload_0         
	//* 106  204:getfield        #157 <Field ListAdapter mAdapter>
	//* 107  207:ifnull          215
			createListView(alertcontroller);
	//  108  210:aload_0         
	//  109  211:aload_1         
	//  110  212:invokespecial   #252 <Method void createListView(AlertController)>
		obj = ((Object) (mView));
	//  111  215:aload_0         
	//  112  216:getfield        #254 <Field View mView>
	//  113  219:astore_3        
		if(obj != null)
	//* 114  220:aload_3         
	//* 115  221:ifnull          259
			if(mViewSpacingSpecified)
	//* 116  224:aload_0         
	//* 117  225:getfield        #90  <Field boolean mViewSpacingSpecified>
	//* 118  228:ifeq            253
			{
				alertcontroller.setView(((View) (obj)), mViewSpacingLeft, mViewSpacingTop, mViewSpacingRight, mViewSpacingBottom);
	//  119  231:aload_1         
	//  120  232:aload_3         
	//  121  233:aload_0         
	//  122  234:getfield        #256 <Field int mViewSpacingLeft>
	//  123  237:aload_0         
	//  124  238:getfield        #258 <Field int mViewSpacingTop>
	//  125  241:aload_0         
	//  126  242:getfield        #260 <Field int mViewSpacingRight>
	//  127  245:aload_0         
	//  128  246:getfield        #262 <Field int mViewSpacingBottom>
	//  129  249:invokevirtual   #266 <Method void AlertController.setView(View, int, int, int, int)>
				return;
	//  130  252:return          
			} else
			{
				alertcontroller.setView(((View) (obj)));
	//  131  253:aload_1         
	//  132  254:aload_3         
	//  133  255:invokevirtual   #268 <Method void AlertController.setView(View)>
				return;
	//  134  258:return          
			}
		int j = mViewLayoutResId;
	//  135  259:aload_0         
	//  136  260:getfield        #270 <Field int mViewLayoutResId>
	//  137  263:istore_2        
		if(j != 0)
	//* 138  264:iload_2         
	//* 139  265:ifeq            273
			alertcontroller.setView(j);
	//  140  268:aload_1         
	//  141  269:iload_2         
	//  142  270:invokevirtual   #272 <Method void AlertController.setView(int)>
	//  143  273:return          
	}

	public ListAdapter mAdapter;
	public boolean mCancelable;
	public int mCheckedItem;
	public boolean mCheckedItems[];
	public final Context mContext;
	public Cursor mCursor;
	public View mCustomTitleView;
	public Drawable mIcon;
	public int mIconAttrId;
	public int mIconId;
	public final LayoutInflater mInflater;
	public String mIsCheckedColumn;
	public boolean mIsMultiChoice;
	public boolean mIsSingleChoice;
	public CharSequence mItems[];
	public String mLabelColumn;
	public CharSequence mMessage;
	public Drawable mNegativeButtonIcon;
	public android.content.ner mNegativeButtonListener;
	public CharSequence mNegativeButtonText;
	public Drawable mNeutralButtonIcon;
	public android.content.ner mNeutralButtonListener;
	public CharSequence mNeutralButtonText;
	public android.content.ener mOnCancelListener;
	public android.content.eClickListener mOnCheckboxClickListener;
	public android.content.ner mOnClickListener;
	public android.content.tener mOnDismissListener;
	public android.widget.stener mOnItemSelectedListener;
	public android.content.r mOnKeyListener;
	public OnPrepareListViewListener mOnPrepareListViewListener;
	public Drawable mPositiveButtonIcon;
	public android.content.ner mPositiveButtonListener;
	public CharSequence mPositiveButtonText;
	public boolean mRecycleOnMeasure;
	public CharSequence mTitle;
	public View mView;
	public int mViewLayoutResId;
	public int mViewSpacingBottom;
	public int mViewSpacingLeft;
	public int mViewSpacingRight;
	public boolean mViewSpacingSpecified;
	public int mViewSpacingTop;

	public AlertController$AlertParams(Context context)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #84  <Method void Object()>
		mIconId = 0;
	//    2    4:aload_0         
	//    3    5:iconst_0        
	//    4    6:putfield        #86  <Field int mIconId>
		mIconAttrId = 0;
	//    5    9:aload_0         
	//    6   10:iconst_0        
	//    7   11:putfield        #88  <Field int mIconAttrId>
		mViewSpacingSpecified = false;
	//    8   14:aload_0         
	//    9   15:iconst_0        
	//   10   16:putfield        #90  <Field boolean mViewSpacingSpecified>
		mCheckedItem = -1;
	//   11   19:aload_0         
	//   12   20:iconst_m1       
	//   13   21:putfield        #92  <Field int mCheckedItem>
		mRecycleOnMeasure = true;
	//   14   24:aload_0         
	//   15   25:iconst_1        
	//   16   26:putfield        #94  <Field boolean mRecycleOnMeasure>
		mContext = context;
	//   17   29:aload_0         
	//   18   30:aload_1         
	//   19   31:putfield        #96  <Field Context mContext>
		mCancelable = true;
	//   20   34:aload_0         
	//   21   35:iconst_1        
	//   22   36:putfield        #98  <Field boolean mCancelable>
		mInflater = (LayoutInflater)context.getSystemService("layout_inflater");
	//   23   39:aload_0         
	//   24   40:aload_1         
	//   25   41:ldc1            #100 <String "layout_inflater">
	//   26   43:invokevirtual   #106 <Method Object Context.getSystemService(String)>
	//   27   46:checkcast       #108 <Class LayoutInflater>
	//   28   49:putfield        #110 <Field LayoutInflater mInflater>
	//   29   52:return          
	}
}
