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
	//    1    1:getfield        #111 <Field LayoutInflater mInflater>
	//    2    4:aload_1         
	//    3    5:getfield        #117 <Field int AlertController.mListLayout>
	//    4    8:aconst_null     
	//    5    9:invokevirtual   #121 <Method View LayoutInflater.inflate(int, ViewGroup)>
	//    6   12:checkcast       #123 <Class AlertController$RecycleListView>
	//    7   15:astore          4
		Object obj;
		if(mIsMultiChoice)
	//*   8   17:aload_0         
	//*   9   18:getfield        #125 <Field boolean mIsMultiChoice>
	//*  10   21:ifeq            83
		{
			if(mCursor == null)
	//*  11   24:aload_0         
	//*  12   25:getfield        #127 <Field Cursor mCursor>
	//*  13   28:ifnonnull       59
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
	//   18   37:getfield        #97  <Field Context mContext>
	//   19   40:aload_1         
	//   20   41:getfield        #130 <Field int AlertController.mMultiChoiceItemLayout>
	//   21   44:ldc1            #131 <Int 0x1020014>
	//   22   46:aload_0         
	//   23   47:getfield        #133 <Field CharSequence[] mItems>
	//   24   50:aload           4
	//   25   52:invokespecial   #136 <Method void AlertController$AlertParams$1(AlertController$AlertParams, Context, int, int, CharSequence[], AlertController$RecycleListView)>
	//   26   55:astore_3        
			else
	//*  27   56:goto            186
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
	//   28   59:new             #11  <Class AlertController$AlertParams$2>
	//   29   62:dup             
	//   30   63:aload_0         
	//   31   64:aload_0         
	//   32   65:getfield        #97  <Field Context mContext>
	//   33   68:aload_0         
	//   34   69:getfield        #127 <Field Cursor mCursor>
	//   35   72:iconst_0        
	//   36   73:aload           4
	//   37   75:aload_1         
	//   38   76:invokespecial   #139 <Method void AlertController$AlertParams$2(AlertController$AlertParams, Context, Cursor, boolean, AlertController$RecycleListView, AlertController)>
	//   39   79:astore_3        
		} else
	//*  40   80:goto            186
		{
			int i;
			if(mIsSingleChoice)
	//*  41   83:aload_0         
	//*  42   84:getfield        #141 <Field boolean mIsSingleChoice>
	//*  43   87:ifeq            98
				i = dialog.mSingleChoiceItemLayout;
	//   44   90:aload_1         
	//   45   91:getfield        #144 <Field int AlertController.mSingleChoiceItemLayout>
	//   46   94:istore_2        
			else
	//*  47   95:goto            106
				i = dialog.mListItemLayout;
	//   48   98:aload_1         
	//   49   99:getfield        #147 <Field int AlertController.mListItemLayout>
	//   50  102:istore_2        
	//*  51  103:goto            95
			if(mCursor != null)
	//*  52  106:aload_0         
	//*  53  107:getfield        #127 <Field Cursor mCursor>
	//*  54  110:ifnull          152
				obj = ((Object) (new SimpleCursorAdapter(mContext, i, mCursor, new String[] {
					mLabelColumn
				}, new int[] {
					0x1020014
				})));
	//   55  113:new             #149 <Class SimpleCursorAdapter>
	//   56  116:dup             
	//   57  117:aload_0         
	//   58  118:getfield        #97  <Field Context mContext>
	//   59  121:iload_2         
	//   60  122:aload_0         
	//   61  123:getfield        #127 <Field Cursor mCursor>
	//   62  126:iconst_1        
	//   63  127:anewarray       String[]
	//   64  130:dup             
	//   65  131:iconst_0        
	//   66  132:aload_0         
	//   67  133:getfield        #153 <Field String mLabelColumn>
	//   68  136:aastore         
	//   69  137:iconst_1        
	//   70  138:newarray        int[]
	//   71  140:dup             
	//   72  141:iconst_0        
	//   73  142:ldc1            #131 <Int 0x1020014>
	//   74  144:iastore         
	//   75  145:invokespecial   #156 <Method void SimpleCursorAdapter(Context, int, Cursor, String[], int[])>
	//   76  148:astore_3        
			else
	//*  77  149:goto            186
			if(mAdapter != null)
	//*  78  152:aload_0         
	//*  79  153:getfield        #158 <Field ListAdapter mAdapter>
	//*  80  156:ifnull          167
				obj = ((Object) (mAdapter));
	//   81  159:aload_0         
	//   82  160:getfield        #158 <Field ListAdapter mAdapter>
	//   83  163:astore_3        
			else
	//*  84  164:goto            186
				obj = ((Object) (new dapter(mContext, i, 0x1020014, mItems)));
	//   85  167:new             #160 <Class AlertController$CheckedItemAdapter>
	//   86  170:dup             
	//   87  171:aload_0         
	//   88  172:getfield        #97  <Field Context mContext>
	//   89  175:iload_2         
	//   90  176:ldc1            #131 <Int 0x1020014>
	//   91  178:aload_0         
	//   92  179:getfield        #133 <Field CharSequence[] mItems>
	//   93  182:invokespecial   #163 <Method void AlertController$CheckedItemAdapter(Context, int, int, CharSequence[])>
	//   94  185:astore_3        
		}
		if(mOnPrepareListViewListener != null)
	//*  95  186:aload_0         
	//*  96  187:getfield        #165 <Field AlertController$AlertParams$OnPrepareListViewListener mOnPrepareListViewListener>
	//*  97  190:ifnull          204
			mOnPrepareListViewListener.onPrepareListView(((ListView) (listView)));
	//   98  193:aload_0         
	//   99  194:getfield        #165 <Field AlertController$AlertParams$OnPrepareListViewListener mOnPrepareListViewListener>
	//  100  197:aload           4
	//  101  199:invokeinterface #169 <Method void AlertController$AlertParams$OnPrepareListViewListener.onPrepareListView(ListView)>
		dialog.mAdapter = ((ListAdapter) (obj));
	//  102  204:aload_1         
	//  103  205:aload_3         
	//  104  206:putfield        #170 <Field ListAdapter AlertController.mAdapter>
		dialog.mCheckedItem = mCheckedItem;
	//  105  209:aload_1         
	//  106  210:aload_0         
	//  107  211:getfield        #93  <Field int mCheckedItem>
	//  108  214:putfield        #171 <Field int AlertController.mCheckedItem>
		if(mOnClickListener != null)
	//* 109  217:aload_0         
	//* 110  218:getfield        #173 <Field android.content.DialogInterface$OnClickListener mOnClickListener>
	//* 111  221:ifnull          241
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
	//  112  224:aload           4
	//  113  226:new             #13  <Class AlertController$AlertParams$3>
	//  114  229:dup             
	//  115  230:aload_0         
	//  116  231:aload_1         
	//  117  232:invokespecial   #176 <Method void AlertController$AlertParams$3(AlertController$AlertParams, AlertController)>
	//  118  235:invokevirtual   #180 <Method void AlertController$RecycleListView.setOnItemClickListener(android.widget.AdapterView$OnItemClickListener)>
		else
	//* 119  238:goto            264
		if(mOnCheckboxClickListener != null)
	//* 120  241:aload_0         
	//* 121  242:getfield        #182 <Field android.content.DialogInterface$OnMultiChoiceClickListener mOnCheckboxClickListener>
	//* 122  245:ifnull          264
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
	//  123  248:aload           4
	//  124  250:new             #15  <Class AlertController$AlertParams$4>
	//  125  253:dup             
	//  126  254:aload_0         
	//  127  255:aload           4
	//  128  257:aload_1         
	//  129  258:invokespecial   #185 <Method void AlertController$AlertParams$4(AlertController$AlertParams, AlertController$RecycleListView, AlertController)>
	//  130  261:invokevirtual   #180 <Method void AlertController$RecycleListView.setOnItemClickListener(android.widget.AdapterView$OnItemClickListener)>
		if(mOnItemSelectedListener != null)
	//* 131  264:aload_0         
	//* 132  265:getfield        #187 <Field android.widget.AdapterView$OnItemSelectedListener mOnItemSelectedListener>
	//* 133  268:ifnull          280
			listView.setOnItemSelectedListener(mOnItemSelectedListener);
	//  134  271:aload           4
	//  135  273:aload_0         
	//  136  274:getfield        #187 <Field android.widget.AdapterView$OnItemSelectedListener mOnItemSelectedListener>
	//  137  277:invokevirtual   #191 <Method void AlertController$RecycleListView.setOnItemSelectedListener(android.widget.AdapterView$OnItemSelectedListener)>
		if(mIsSingleChoice)
	//* 138  280:aload_0         
	//* 139  281:getfield        #141 <Field boolean mIsSingleChoice>
	//* 140  284:ifeq            296
			listView.setChoiceMode(1);
	//  141  287:aload           4
	//  142  289:iconst_1        
	//  143  290:invokevirtual   #195 <Method void AlertController$RecycleListView.setChoiceMode(int)>
		else
	//* 144  293:goto            309
		if(mIsMultiChoice)
	//* 145  296:aload_0         
	//* 146  297:getfield        #125 <Field boolean mIsMultiChoice>
	//* 147  300:ifeq            309
			listView.setChoiceMode(2);
	//  148  303:aload           4
	//  149  305:iconst_2        
	//  150  306:invokevirtual   #195 <Method void AlertController$RecycleListView.setChoiceMode(int)>
		dialog.mListView = ((ListView) (listView));
	//  151  309:aload_1         
	//  152  310:aload           4
	//  153  312:putfield        #199 <Field ListView AlertController.mListView>
	//  154  315:return          
	}

	public void apply(AlertController alertcontroller)
	{
		if(mCustomTitleView != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #202 <Field View mCustomTitleView>
	//*   2    4:ifnull          18
		{
			alertcontroller.setCustomTitle(mCustomTitleView);
	//    3    7:aload_1         
	//    4    8:aload_0         
	//    5    9:getfield        #202 <Field View mCustomTitleView>
	//    6   12:invokevirtual   #206 <Method void AlertController.setCustomTitle(View)>
		} else
	//*   7   15:goto            82
		{
			if(mTitle != null)
	//*   8   18:aload_0         
	//*   9   19:getfield        #208 <Field CharSequence mTitle>
	//*  10   22:ifnull          33
				alertcontroller.setTitle(mTitle);
	//   11   25:aload_1         
	//   12   26:aload_0         
	//   13   27:getfield        #208 <Field CharSequence mTitle>
	//   14   30:invokevirtual   #212 <Method void AlertController.setTitle(CharSequence)>
			if(mIcon != null)
	//*  15   33:aload_0         
	//*  16   34:getfield        #214 <Field Drawable mIcon>
	//*  17   37:ifnull          48
				alertcontroller.setIcon(mIcon);
	//   18   40:aload_1         
	//   19   41:aload_0         
	//   20   42:getfield        #214 <Field Drawable mIcon>
	//   21   45:invokevirtual   #218 <Method void AlertController.setIcon(Drawable)>
			if(mIconId != 0)
	//*  22   48:aload_0         
	//*  23   49:getfield        #87  <Field int mIconId>
	//*  24   52:ifeq            63
				alertcontroller.setIcon(mIconId);
	//   25   55:aload_1         
	//   26   56:aload_0         
	//   27   57:getfield        #87  <Field int mIconId>
	//   28   60:invokevirtual   #220 <Method void AlertController.setIcon(int)>
			if(mIconAttrId != 0)
	//*  29   63:aload_0         
	//*  30   64:getfield        #89  <Field int mIconAttrId>
	//*  31   67:ifeq            82
				alertcontroller.setIcon(alertcontroller.getIconAttributeResId(mIconAttrId));
	//   32   70:aload_1         
	//   33   71:aload_1         
	//   34   72:aload_0         
	//   35   73:getfield        #89  <Field int mIconAttrId>
	//   36   76:invokevirtual   #224 <Method int AlertController.getIconAttributeResId(int)>
	//   37   79:invokevirtual   #220 <Method void AlertController.setIcon(int)>
		}
		if(mMessage != null)
	//*  38   82:aload_0         
	//*  39   83:getfield        #226 <Field CharSequence mMessage>
	//*  40   86:ifnull          97
			alertcontroller.setMessage(mMessage);
	//   41   89:aload_1         
	//   42   90:aload_0         
	//   43   91:getfield        #226 <Field CharSequence mMessage>
	//   44   94:invokevirtual   #229 <Method void AlertController.setMessage(CharSequence)>
		if(mPositiveButtonText != null || mPositiveButtonIcon != null)
	//*  45   97:aload_0         
	//*  46   98:getfield        #231 <Field CharSequence mPositiveButtonText>
	//*  47  101:ifnonnull       111
	//*  48  104:aload_0         
	//*  49  105:getfield        #233 <Field Drawable mPositiveButtonIcon>
	//*  50  108:ifnull          129
			alertcontroller.setButton(-1, mPositiveButtonText, mPositiveButtonListener, ((android.os.Message) (null)), mPositiveButtonIcon);
	//   51  111:aload_1         
	//   52  112:iconst_m1       
	//   53  113:aload_0         
	//   54  114:getfield        #231 <Field CharSequence mPositiveButtonText>
	//   55  117:aload_0         
	//   56  118:getfield        #235 <Field android.content.DialogInterface$OnClickListener mPositiveButtonListener>
	//   57  121:aconst_null     
	//   58  122:aload_0         
	//   59  123:getfield        #233 <Field Drawable mPositiveButtonIcon>
	//   60  126:invokevirtual   #239 <Method void AlertController.setButton(int, CharSequence, android.content.DialogInterface$OnClickListener, android.os.Message, Drawable)>
		if(mNegativeButtonText != null || mNegativeButtonIcon != null)
	//*  61  129:aload_0         
	//*  62  130:getfield        #241 <Field CharSequence mNegativeButtonText>
	//*  63  133:ifnonnull       143
	//*  64  136:aload_0         
	//*  65  137:getfield        #243 <Field Drawable mNegativeButtonIcon>
	//*  66  140:ifnull          162
			alertcontroller.setButton(-2, mNegativeButtonText, mNegativeButtonListener, ((android.os.Message) (null)), mNegativeButtonIcon);
	//   67  143:aload_1         
	//   68  144:bipush          -2
	//   69  146:aload_0         
	//   70  147:getfield        #241 <Field CharSequence mNegativeButtonText>
	//   71  150:aload_0         
	//   72  151:getfield        #245 <Field android.content.DialogInterface$OnClickListener mNegativeButtonListener>
	//   73  154:aconst_null     
	//   74  155:aload_0         
	//   75  156:getfield        #243 <Field Drawable mNegativeButtonIcon>
	//   76  159:invokevirtual   #239 <Method void AlertController.setButton(int, CharSequence, android.content.DialogInterface$OnClickListener, android.os.Message, Drawable)>
		if(mNeutralButtonText != null || mNeutralButtonIcon != null)
	//*  77  162:aload_0         
	//*  78  163:getfield        #247 <Field CharSequence mNeutralButtonText>
	//*  79  166:ifnonnull       176
	//*  80  169:aload_0         
	//*  81  170:getfield        #249 <Field Drawable mNeutralButtonIcon>
	//*  82  173:ifnull          195
			alertcontroller.setButton(-3, mNeutralButtonText, mNeutralButtonListener, ((android.os.Message) (null)), mNeutralButtonIcon);
	//   83  176:aload_1         
	//   84  177:bipush          -3
	//   85  179:aload_0         
	//   86  180:getfield        #247 <Field CharSequence mNeutralButtonText>
	//   87  183:aload_0         
	//   88  184:getfield        #251 <Field android.content.DialogInterface$OnClickListener mNeutralButtonListener>
	//   89  187:aconst_null     
	//   90  188:aload_0         
	//   91  189:getfield        #249 <Field Drawable mNeutralButtonIcon>
	//   92  192:invokevirtual   #239 <Method void AlertController.setButton(int, CharSequence, android.content.DialogInterface$OnClickListener, android.os.Message, Drawable)>
		if(mItems != null || mCursor != null || mAdapter != null)
	//*  93  195:aload_0         
	//*  94  196:getfield        #133 <Field CharSequence[] mItems>
	//*  95  199:ifnonnull       216
	//*  96  202:aload_0         
	//*  97  203:getfield        #127 <Field Cursor mCursor>
	//*  98  206:ifnonnull       216
	//*  99  209:aload_0         
	//* 100  210:getfield        #158 <Field ListAdapter mAdapter>
	//* 101  213:ifnull          221
			createListView(alertcontroller);
	//  102  216:aload_0         
	//  103  217:aload_1         
	//  104  218:invokespecial   #253 <Method void createListView(AlertController)>
		if(mView != null)
	//* 105  221:aload_0         
	//* 106  222:getfield        #255 <Field View mView>
	//* 107  225:ifnull          269
			if(mViewSpacingSpecified)
	//* 108  228:aload_0         
	//* 109  229:getfield        #91  <Field boolean mViewSpacingSpecified>
	//* 110  232:ifeq            260
			{
				alertcontroller.setView(mView, mViewSpacingLeft, mViewSpacingTop, mViewSpacingRight, mViewSpacingBottom);
	//  111  235:aload_1         
	//  112  236:aload_0         
	//  113  237:getfield        #255 <Field View mView>
	//  114  240:aload_0         
	//  115  241:getfield        #257 <Field int mViewSpacingLeft>
	//  116  244:aload_0         
	//  117  245:getfield        #259 <Field int mViewSpacingTop>
	//  118  248:aload_0         
	//  119  249:getfield        #261 <Field int mViewSpacingRight>
	//  120  252:aload_0         
	//  121  253:getfield        #263 <Field int mViewSpacingBottom>
	//  122  256:invokevirtual   #267 <Method void AlertController.setView(View, int, int, int, int)>
				return;
	//  123  259:return          
			} else
			{
				alertcontroller.setView(mView);
	//  124  260:aload_1         
	//  125  261:aload_0         
	//  126  262:getfield        #255 <Field View mView>
	//  127  265:invokevirtual   #269 <Method void AlertController.setView(View)>
				return;
	//  128  268:return          
			}
		if(mViewLayoutResId != 0)
	//* 129  269:aload_0         
	//* 130  270:getfield        #271 <Field int mViewLayoutResId>
	//* 131  273:ifeq            284
			alertcontroller.setView(mViewLayoutResId);
	//  132  276:aload_1         
	//  133  277:aload_0         
	//  134  278:getfield        #271 <Field int mViewLayoutResId>
	//  135  281:invokevirtual   #273 <Method void AlertController.setView(int)>
	//  136  284:return          
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
	//    1    1:invokespecial   #85  <Method void Object()>
		mIconId = 0;
	//    2    4:aload_0         
	//    3    5:iconst_0        
	//    4    6:putfield        #87  <Field int mIconId>
		mIconAttrId = 0;
	//    5    9:aload_0         
	//    6   10:iconst_0        
	//    7   11:putfield        #89  <Field int mIconAttrId>
		mViewSpacingSpecified = false;
	//    8   14:aload_0         
	//    9   15:iconst_0        
	//   10   16:putfield        #91  <Field boolean mViewSpacingSpecified>
		mCheckedItem = -1;
	//   11   19:aload_0         
	//   12   20:iconst_m1       
	//   13   21:putfield        #93  <Field int mCheckedItem>
		mRecycleOnMeasure = true;
	//   14   24:aload_0         
	//   15   25:iconst_1        
	//   16   26:putfield        #95  <Field boolean mRecycleOnMeasure>
		mContext = context;
	//   17   29:aload_0         
	//   18   30:aload_1         
	//   19   31:putfield        #97  <Field Context mContext>
		mCancelable = true;
	//   20   34:aload_0         
	//   21   35:iconst_1        
	//   22   36:putfield        #99  <Field boolean mCancelable>
		mInflater = (LayoutInflater)context.getSystemService("layout_inflater");
	//   23   39:aload_0         
	//   24   40:aload_1         
	//   25   41:ldc1            #101 <String "layout_inflater">
	//   26   43:invokevirtual   #107 <Method Object Context.getSystemService(String)>
	//   27   46:checkcast       #109 <Class LayoutInflater>
	//   28   49:putfield        #111 <Field LayoutInflater mInflater>
	//   29   52:return          
	}
}
