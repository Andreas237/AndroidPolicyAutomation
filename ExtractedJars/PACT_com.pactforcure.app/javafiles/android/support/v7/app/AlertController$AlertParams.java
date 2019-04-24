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
	//    1    1:getfield        #108 <Field LayoutInflater mInflater>
	//    2    4:aload_1         
	//    3    5:getfield        #114 <Field int AlertController.mListLayout>
	//    4    8:aconst_null     
	//    5    9:invokevirtual   #118 <Method View LayoutInflater.inflate(int, ViewGroup)>
	//    6   12:checkcast       #120 <Class AlertController$RecycleListView>
	//    7   15:astore          4
		Object obj;
		if(mIsMultiChoice)
	//*   8   17:aload_0         
	//*   9   18:getfield        #122 <Field boolean mIsMultiChoice>
	//*  10   21:ifeq            168
		{
			if(mCursor == null)
	//*  11   24:aload_0         
	//*  12   25:getfield        #124 <Field Cursor mCursor>
	//*  13   28:ifnonnull       144
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
	//   14   31:new             #9   <Class AlertController$AlertParams$1>
	//   15   34:dup             
	//   16   35:aload_0         
	//   17   36:aload_0         
	//   18   37:getfield        #94  <Field Context mContext>
	//   19   40:aload_1         
	//   20   41:getfield        #127 <Field int AlertController.mMultiChoiceItemLayout>
	//   21   44:ldc1            #128 <Int 0x1020014>
	//   22   46:aload_0         
	//   23   47:getfield        #130 <Field CharSequence[] mItems>
	//   24   50:aload           4
	//   25   52:invokespecial   #133 <Method void AlertController$AlertParams$1(AlertController$AlertParams, Context, int, int, CharSequence[], AlertController$RecycleListView)>
	//   26   55:astore_3        
			else
	//*  27   56:aload_0         
	//*  28   57:getfield        #135 <Field AlertController$AlertParams$OnPrepareListViewListener mOnPrepareListViewListener>
	//*  29   60:ifnull          74
	//*  30   63:aload_0         
	//*  31   64:getfield        #135 <Field AlertController$AlertParams$OnPrepareListViewListener mOnPrepareListViewListener>
	//*  32   67:aload           4
	//*  33   69:invokeinterface #139 <Method void AlertController$AlertParams$OnPrepareListViewListener.onPrepareListView(ListView)>
	//*  34   74:aload_1         
	//*  35   75:aload_3         
	//*  36   76:putfield        #141 <Field ListAdapter AlertController.mAdapter>
	//*  37   79:aload_1         
	//*  38   80:aload_0         
	//*  39   81:getfield        #90  <Field int mCheckedItem>
	//*  40   84:putfield        #142 <Field int AlertController.mCheckedItem>
	//*  41   87:aload_0         
	//*  42   88:getfield        #144 <Field android.content.DialogInterface$OnClickListener mOnClickListener>
	//*  43   91:ifnull          271
	//*  44   94:aload           4
	//*  45   96:new             #13  <Class AlertController$AlertParams$3>
	//*  46   99:dup             
	//*  47  100:aload_0         
	//*  48  101:aload_1         
	//*  49  102:invokespecial   #147 <Method void AlertController$AlertParams$3(AlertController$AlertParams, AlertController)>
	//*  50  105:invokevirtual   #151 <Method void AlertController$RecycleListView.setOnItemClickListener(android.widget.AdapterView$OnItemClickListener)>
	//*  51  108:aload_0         
	//*  52  109:getfield        #153 <Field android.widget.AdapterView$OnItemSelectedListener mOnItemSelectedListener>
	//*  53  112:ifnull          124
	//*  54  115:aload           4
	//*  55  117:aload_0         
	//*  56  118:getfield        #153 <Field android.widget.AdapterView$OnItemSelectedListener mOnItemSelectedListener>
	//*  57  121:invokevirtual   #157 <Method void AlertController$RecycleListView.setOnItemSelectedListener(android.widget.AdapterView$OnItemSelectedListener)>
	//*  58  124:aload_0         
	//*  59  125:getfield        #159 <Field boolean mIsSingleChoice>
	//*  60  128:ifeq            297
	//*  61  131:aload           4
	//*  62  133:iconst_1        
	//*  63  134:invokevirtual   #163 <Method void AlertController$RecycleListView.setChoiceMode(int)>
	//*  64  137:aload_1         
	//*  65  138:aload           4
	//*  66  140:putfield        #167 <Field ListView AlertController.mListView>
	//*  67  143:return          
				obj = ((Object) (new CursorAdapter(false, listView, dialog) {

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
						view = ((View) (listView));
					//   11   25:aload_0         
					//   12   26:getfield        #27  <Field AlertController$RecycleListView val$listView>
					//   13   29:astore_1        
						int j = cursor.getPosition();
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
						((AlertController.RecycleListView) (view)).setItemChecked(j, flag);
					//*  30   64:goto            52
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
	//   68  144:new             #11  <Class AlertController$AlertParams$2>
	//   69  147:dup             
	//   70  148:aload_0         
	//   71  149:aload_0         
	//   72  150:getfield        #94  <Field Context mContext>
	//   73  153:aload_0         
	//   74  154:getfield        #124 <Field Cursor mCursor>
	//   75  157:iconst_0        
	//   76  158:aload           4
	//   77  160:aload_1         
	//   78  161:invokespecial   #170 <Method void AlertController$AlertParams$2(AlertController$AlertParams, Context, Cursor, boolean, AlertController$RecycleListView, AlertController)>
	//   79  164:astore_3        
		} else
	//*  80  165:goto            56
		{
			int i;
			if(mIsSingleChoice)
	//*  81  168:aload_0         
	//*  82  169:getfield        #159 <Field boolean mIsSingleChoice>
	//*  83  172:ifeq            226
				i = dialog.mSingleChoiceItemLayout;
	//   84  175:aload_1         
	//   85  176:getfield        #173 <Field int AlertController.mSingleChoiceItemLayout>
	//   86  179:istore_2        
			else
	//*  87  180:aload_0         
	//*  88  181:getfield        #124 <Field Cursor mCursor>
	//*  89  184:ifnull          234
	//*  90  187:new             #175 <Class SimpleCursorAdapter>
	//*  91  190:dup             
	//*  92  191:aload_0         
	//*  93  192:getfield        #94  <Field Context mContext>
	//*  94  195:iload_2         
	//*  95  196:aload_0         
	//*  96  197:getfield        #124 <Field Cursor mCursor>
	//*  97  200:iconst_1        
	//*  98  201:anewarray       String[]
	//*  99  204:dup             
	//* 100  205:iconst_0        
	//* 101  206:aload_0         
	//* 102  207:getfield        #179 <Field String mLabelColumn>
	//* 103  210:aastore         
	//* 104  211:iconst_1        
	//* 105  212:newarray        int[]
	//* 106  214:dup             
	//* 107  215:iconst_0        
	//* 108  216:ldc1            #128 <Int 0x1020014>
	//* 109  218:iastore         
	//* 110  219:invokespecial   #182 <Method void SimpleCursorAdapter(Context, int, Cursor, String[], int[])>
	//* 111  222:astore_3        
	//* 112  223:goto            56
				i = dialog.mListItemLayout;
	//  113  226:aload_1         
	//  114  227:getfield        #185 <Field int AlertController.mListItemLayout>
	//  115  230:istore_2        
			if(mCursor != null)
				obj = ((Object) (new SimpleCursorAdapter(mContext, i, mCursor, new String[] {
					mLabelColumn
				}, new int[] {
					0x1020014
				})));
			else
	//* 116  231:goto            180
			if(mAdapter != null)
	//* 117  234:aload_0         
	//* 118  235:getfield        #186 <Field ListAdapter mAdapter>
	//* 119  238:ifnull          249
				obj = ((Object) (mAdapter));
	//  120  241:aload_0         
	//  121  242:getfield        #186 <Field ListAdapter mAdapter>
	//  122  245:astore_3        
			else
	//* 123  246:goto            56
				obj = ((Object) (new dapter(mContext, i, 0x1020014, mItems)));
	//  124  249:new             #188 <Class AlertController$CheckedItemAdapter>
	//  125  252:dup             
	//  126  253:aload_0         
	//  127  254:getfield        #94  <Field Context mContext>
	//  128  257:iload_2         
	//  129  258:ldc1            #128 <Int 0x1020014>
	//  130  260:aload_0         
	//  131  261:getfield        #130 <Field CharSequence[] mItems>
	//  132  264:invokespecial   #191 <Method void AlertController$CheckedItemAdapter(Context, int, int, CharSequence[])>
	//  133  267:astore_3        
		}
		if(mOnPrepareListViewListener != null)
			mOnPrepareListViewListener.onPrepareListView(((ListView) (listView)));
		dialog.mAdapter = ((ListAdapter) (obj));
		dialog.mCheckedItem = mCheckedItem;
		if(mOnClickListener != null)
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
		else
	//* 134  268:goto            56
		if(mOnCheckboxClickListener != null)
	//* 135  271:aload_0         
	//* 136  272:getfield        #193 <Field android.content.DialogInterface$OnMultiChoiceClickListener mOnCheckboxClickListener>
	//* 137  275:ifnull          108
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
	//  138  278:aload           4
	//  139  280:new             #15  <Class AlertController$AlertParams$4>
	//  140  283:dup             
	//  141  284:aload_0         
	//  142  285:aload           4
	//  143  287:aload_1         
	//  144  288:invokespecial   #196 <Method void AlertController$AlertParams$4(AlertController$AlertParams, AlertController$RecycleListView, AlertController)>
	//  145  291:invokevirtual   #151 <Method void AlertController$RecycleListView.setOnItemClickListener(android.widget.AdapterView$OnItemClickListener)>
		if(mOnItemSelectedListener != null)
			listView.setOnItemSelectedListener(mOnItemSelectedListener);
		if(mIsSingleChoice)
			listView.setChoiceMode(1);
		else
	//* 146  294:goto            108
		if(mIsMultiChoice)
	//* 147  297:aload_0         
	//* 148  298:getfield        #122 <Field boolean mIsMultiChoice>
	//* 149  301:ifeq            137
			listView.setChoiceMode(2);
	//  150  304:aload           4
	//  151  306:iconst_2        
	//  152  307:invokevirtual   #163 <Method void AlertController$RecycleListView.setChoiceMode(int)>
		dialog.mListView = ((ListView) (listView));
	//* 153  310:goto            137
	}

	public void apply(AlertController alertcontroller)
	{
		if(mCustomTitleView == null) goto _L2; else goto _L1
	//    0    0:aload_0         
	//    1    1:getfield        #199 <Field View mCustomTitleView>
	//    2    4:ifnull          160
_L1:
		alertcontroller.setCustomTitle(mCustomTitleView);
	//    3    7:aload_1         
	//    4    8:aload_0         
	//    5    9:getfield        #199 <Field View mCustomTitleView>
	//    6   12:invokevirtual   #203 <Method void AlertController.setCustomTitle(View)>
_L10:
		if(mMessage != null)
	//*   7   15:aload_0         
	//*   8   16:getfield        #205 <Field CharSequence mMessage>
	//*   9   19:ifnull          30
			alertcontroller.setMessage(mMessage);
	//   10   22:aload_1         
	//   11   23:aload_0         
	//   12   24:getfield        #205 <Field CharSequence mMessage>
	//   13   27:invokevirtual   #209 <Method void AlertController.setMessage(CharSequence)>
		if(mPositiveButtonText != null)
	//*  14   30:aload_0         
	//*  15   31:getfield        #211 <Field CharSequence mPositiveButtonText>
	//*  16   34:ifnull          51
			alertcontroller.setButton(-1, mPositiveButtonText, mPositiveButtonListener, ((android.os.Message) (null)));
	//   17   37:aload_1         
	//   18   38:iconst_m1       
	//   19   39:aload_0         
	//   20   40:getfield        #211 <Field CharSequence mPositiveButtonText>
	//   21   43:aload_0         
	//   22   44:getfield        #213 <Field android.content.DialogInterface$OnClickListener mPositiveButtonListener>
	//   23   47:aconst_null     
	//   24   48:invokevirtual   #217 <Method void AlertController.setButton(int, CharSequence, android.content.DialogInterface$OnClickListener, android.os.Message)>
		if(mNegativeButtonText != null)
	//*  25   51:aload_0         
	//*  26   52:getfield        #219 <Field CharSequence mNegativeButtonText>
	//*  27   55:ifnull          73
			alertcontroller.setButton(-2, mNegativeButtonText, mNegativeButtonListener, ((android.os.Message) (null)));
	//   28   58:aload_1         
	//   29   59:bipush          -2
	//   30   61:aload_0         
	//   31   62:getfield        #219 <Field CharSequence mNegativeButtonText>
	//   32   65:aload_0         
	//   33   66:getfield        #221 <Field android.content.DialogInterface$OnClickListener mNegativeButtonListener>
	//   34   69:aconst_null     
	//   35   70:invokevirtual   #217 <Method void AlertController.setButton(int, CharSequence, android.content.DialogInterface$OnClickListener, android.os.Message)>
		if(mNeutralButtonText != null)
	//*  36   73:aload_0         
	//*  37   74:getfield        #223 <Field CharSequence mNeutralButtonText>
	//*  38   77:ifnull          95
			alertcontroller.setButton(-3, mNeutralButtonText, mNeutralButtonListener, ((android.os.Message) (null)));
	//   39   80:aload_1         
	//   40   81:bipush          -3
	//   41   83:aload_0         
	//   42   84:getfield        #223 <Field CharSequence mNeutralButtonText>
	//   43   87:aload_0         
	//   44   88:getfield        #225 <Field android.content.DialogInterface$OnClickListener mNeutralButtonListener>
	//   45   91:aconst_null     
	//   46   92:invokevirtual   #217 <Method void AlertController.setButton(int, CharSequence, android.content.DialogInterface$OnClickListener, android.os.Message)>
		if(mItems != null || mCursor != null || mAdapter != null)
	//*  47   95:aload_0         
	//*  48   96:getfield        #130 <Field CharSequence[] mItems>
	//*  49   99:ifnonnull       116
	//*  50  102:aload_0         
	//*  51  103:getfield        #124 <Field Cursor mCursor>
	//*  52  106:ifnonnull       116
	//*  53  109:aload_0         
	//*  54  110:getfield        #186 <Field ListAdapter mAdapter>
	//*  55  113:ifnull          121
			createListView(alertcontroller);
	//   56  116:aload_0         
	//   57  117:aload_1         
	//   58  118:invokespecial   #227 <Method void createListView(AlertController)>
		if(mView == null) goto _L4; else goto _L3
	//   59  121:aload_0         
	//   60  122:getfield        #229 <Field View mView>
	//   61  125:ifnull          236
_L3:
		if(!mViewSpacingSpecified) goto _L6; else goto _L5
	//   62  128:aload_0         
	//   63  129:getfield        #88  <Field boolean mViewSpacingSpecified>
	//   64  132:ifeq            227
_L5:
		alertcontroller.setView(mView, mViewSpacingLeft, mViewSpacingTop, mViewSpacingRight, mViewSpacingBottom);
	//   65  135:aload_1         
	//   66  136:aload_0         
	//   67  137:getfield        #229 <Field View mView>
	//   68  140:aload_0         
	//   69  141:getfield        #231 <Field int mViewSpacingLeft>
	//   70  144:aload_0         
	//   71  145:getfield        #233 <Field int mViewSpacingTop>
	//   72  148:aload_0         
	//   73  149:getfield        #235 <Field int mViewSpacingRight>
	//   74  152:aload_0         
	//   75  153:getfield        #237 <Field int mViewSpacingBottom>
	//   76  156:invokevirtual   #241 <Method void AlertController.setView(View, int, int, int, int)>
_L8:
		return;
	//   77  159:return          
_L2:
		if(mTitle != null)
	//*  78  160:aload_0         
	//*  79  161:getfield        #243 <Field CharSequence mTitle>
	//*  80  164:ifnull          175
			alertcontroller.setTitle(mTitle);
	//   81  167:aload_1         
	//   82  168:aload_0         
	//   83  169:getfield        #243 <Field CharSequence mTitle>
	//   84  172:invokevirtual   #246 <Method void AlertController.setTitle(CharSequence)>
		if(mIcon != null)
	//*  85  175:aload_0         
	//*  86  176:getfield        #248 <Field Drawable mIcon>
	//*  87  179:ifnull          190
			alertcontroller.setIcon(mIcon);
	//   88  182:aload_1         
	//   89  183:aload_0         
	//   90  184:getfield        #248 <Field Drawable mIcon>
	//   91  187:invokevirtual   #252 <Method void AlertController.setIcon(Drawable)>
		if(mIconId != 0)
	//*  92  190:aload_0         
	//*  93  191:getfield        #84  <Field int mIconId>
	//*  94  194:ifeq            205
			alertcontroller.setIcon(mIconId);
	//   95  197:aload_1         
	//   96  198:aload_0         
	//   97  199:getfield        #84  <Field int mIconId>
	//   98  202:invokevirtual   #254 <Method void AlertController.setIcon(int)>
		if(mIconAttrId != 0)
	//*  99  205:aload_0         
	//* 100  206:getfield        #86  <Field int mIconAttrId>
	//* 101  209:ifeq            15
			alertcontroller.setIcon(alertcontroller.getIconAttributeResId(mIconAttrId));
	//  102  212:aload_1         
	//  103  213:aload_1         
	//  104  214:aload_0         
	//  105  215:getfield        #86  <Field int mIconAttrId>
	//  106  218:invokevirtual   #258 <Method int AlertController.getIconAttributeResId(int)>
	//  107  221:invokevirtual   #254 <Method void AlertController.setIcon(int)>
		continue; /* Loop/switch isn't completed */
	//  108  224:goto            15
_L6:
		alertcontroller.setView(mView);
	//  109  227:aload_1         
	//  110  228:aload_0         
	//  111  229:getfield        #229 <Field View mView>
	//  112  232:invokevirtual   #260 <Method void AlertController.setView(View)>
		return;
	//  113  235:return          
_L4:
		if(mViewLayoutResId == 0) goto _L8; else goto _L7
	//  114  236:aload_0         
	//  115  237:getfield        #262 <Field int mViewLayoutResId>
	//  116  240:ifeq            159
_L7:
		alertcontroller.setView(mViewLayoutResId);
	//  117  243:aload_1         
	//  118  244:aload_0         
	//  119  245:getfield        #262 <Field int mViewLayoutResId>
	//  120  248:invokevirtual   #264 <Method void AlertController.setView(int)>
		return;
	//  121  251:return          
		if(true) goto _L10; else goto _L9
_L9:
	}

	public ListAdapter mAdapter;
	public boolean mCancelable;
	public int mCheckedItem;
	public boolean mCheckedItems[];
	public final Context mContext;
	public Cursor mCursor;
	public View mCustomTitleView;
	public boolean mForceInverseBackground;
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
	public android.content.ner mNegativeButtonListener;
	public CharSequence mNegativeButtonText;
	public android.content.ner mNeutralButtonListener;
	public CharSequence mNeutralButtonText;
	public android.content.ener mOnCancelListener;
	public android.content.eClickListener mOnCheckboxClickListener;
	public android.content.ner mOnClickListener;
	public android.content.tener mOnDismissListener;
	public android.widget.stener mOnItemSelectedListener;
	public android.content.r mOnKeyListener;
	public OnPrepareListViewListener mOnPrepareListViewListener;
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
	//    1    1:invokespecial   #82  <Method void Object()>
		mIconId = 0;
	//    2    4:aload_0         
	//    3    5:iconst_0        
	//    4    6:putfield        #84  <Field int mIconId>
		mIconAttrId = 0;
	//    5    9:aload_0         
	//    6   10:iconst_0        
	//    7   11:putfield        #86  <Field int mIconAttrId>
		mViewSpacingSpecified = false;
	//    8   14:aload_0         
	//    9   15:iconst_0        
	//   10   16:putfield        #88  <Field boolean mViewSpacingSpecified>
		mCheckedItem = -1;
	//   11   19:aload_0         
	//   12   20:iconst_m1       
	//   13   21:putfield        #90  <Field int mCheckedItem>
		mRecycleOnMeasure = true;
	//   14   24:aload_0         
	//   15   25:iconst_1        
	//   16   26:putfield        #92  <Field boolean mRecycleOnMeasure>
		mContext = context;
	//   17   29:aload_0         
	//   18   30:aload_1         
	//   19   31:putfield        #94  <Field Context mContext>
		mCancelable = true;
	//   20   34:aload_0         
	//   21   35:iconst_1        
	//   22   36:putfield        #96  <Field boolean mCancelable>
		mInflater = (LayoutInflater)context.getSystemService("layout_inflater");
	//   23   39:aload_0         
	//   24   40:aload_1         
	//   25   41:ldc1            #98  <String "layout_inflater">
	//   26   43:invokevirtual   #104 <Method Object Context.getSystemService(String)>
	//   27   46:checkcast       #106 <Class LayoutInflater>
	//   28   49:putfield        #108 <Field LayoutInflater mInflater>
	//   29   52:return          
	}
}
