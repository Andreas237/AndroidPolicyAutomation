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
	//*  10   21:ifeq            83
		{
			if(mCursor == null)
	//*  11   24:aload_0         
	//*  12   25:getfield        #124 <Field Cursor mCursor>
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
	//*  27   56:goto            183
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
						boolean flag;
						if(cursor.getInt(mIsCheckedIndex) == 1)
					//*  15   35:aload_3         
					//*  16   36:aload_0         
					//*  17   37:getfield        #53  <Field int mIsCheckedIndex>
					//*  18   40:invokeinterface #81  <Method int Cursor.getInt(int)>
					//*  19   45:iconst_1        
					//*  20   46:icmpne          55
							flag = true;
					//   21   49:iconst_1        
					//   22   50:istore          5
						else
					//*  23   52:goto            58
							flag = false;
					//   24   55:iconst_0        
					//   25   56:istore          5
						((AlertController.RecycleListView) (view)).setItemChecked(j, flag);
					//   26   58:aload_1         
					//   27   59:iload           4
					//   28   61:iload           5
					//   29   63:invokevirtual   #87  <Method void AlertController$RecycleListView.setItemChecked(int, boolean)>
					//   30   66:return          
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
	//   32   65:getfield        #94  <Field Context mContext>
	//   33   68:aload_0         
	//   34   69:getfield        #124 <Field Cursor mCursor>
	//   35   72:iconst_0        
	//   36   73:aload           4
	//   37   75:aload_1         
	//   38   76:invokespecial   #136 <Method void AlertController$AlertParams$2(AlertController$AlertParams, Context, Cursor, boolean, AlertController$RecycleListView, AlertController)>
	//   39   79:astore_3        
		} else
	//*  40   80:goto            183
		{
			int i;
			if(mIsSingleChoice)
	//*  41   83:aload_0         
	//*  42   84:getfield        #138 <Field boolean mIsSingleChoice>
	//*  43   87:ifeq            98
				i = dialog.mSingleChoiceItemLayout;
	//   44   90:aload_1         
	//   45   91:getfield        #141 <Field int AlertController.mSingleChoiceItemLayout>
	//   46   94:istore_2        
			else
	//*  47   95:goto            103
				i = dialog.mListItemLayout;
	//   48   98:aload_1         
	//   49   99:getfield        #144 <Field int AlertController.mListItemLayout>
	//   50  102:istore_2        
			if(mCursor != null)
	//*  51  103:aload_0         
	//*  52  104:getfield        #124 <Field Cursor mCursor>
	//*  53  107:ifnull          149
				obj = ((Object) (new SimpleCursorAdapter(mContext, i, mCursor, new String[] {
					mLabelColumn
				}, new int[] {
					0x1020014
				})));
	//   54  110:new             #146 <Class SimpleCursorAdapter>
	//   55  113:dup             
	//   56  114:aload_0         
	//   57  115:getfield        #94  <Field Context mContext>
	//   58  118:iload_2         
	//   59  119:aload_0         
	//   60  120:getfield        #124 <Field Cursor mCursor>
	//   61  123:iconst_1        
	//   62  124:anewarray       String[]
	//   63  127:dup             
	//   64  128:iconst_0        
	//   65  129:aload_0         
	//   66  130:getfield        #150 <Field String mLabelColumn>
	//   67  133:aastore         
	//   68  134:iconst_1        
	//   69  135:newarray        int[]
	//   70  137:dup             
	//   71  138:iconst_0        
	//   72  139:ldc1            #128 <Int 0x1020014>
	//   73  141:iastore         
	//   74  142:invokespecial   #153 <Method void SimpleCursorAdapter(Context, int, Cursor, String[], int[])>
	//   75  145:astore_3        
			else
	//*  76  146:goto            183
			if(mAdapter != null)
	//*  77  149:aload_0         
	//*  78  150:getfield        #155 <Field ListAdapter mAdapter>
	//*  79  153:ifnull          164
				obj = ((Object) (mAdapter));
	//   80  156:aload_0         
	//   81  157:getfield        #155 <Field ListAdapter mAdapter>
	//   82  160:astore_3        
			else
	//*  83  161:goto            183
				obj = ((Object) (new dapter(mContext, i, 0x1020014, mItems)));
	//   84  164:new             #157 <Class AlertController$CheckedItemAdapter>
	//   85  167:dup             
	//   86  168:aload_0         
	//   87  169:getfield        #94  <Field Context mContext>
	//   88  172:iload_2         
	//   89  173:ldc1            #128 <Int 0x1020014>
	//   90  175:aload_0         
	//   91  176:getfield        #130 <Field CharSequence[] mItems>
	//   92  179:invokespecial   #160 <Method void AlertController$CheckedItemAdapter(Context, int, int, CharSequence[])>
	//   93  182:astore_3        
		}
		if(mOnPrepareListViewListener != null)
	//*  94  183:aload_0         
	//*  95  184:getfield        #162 <Field AlertController$AlertParams$OnPrepareListViewListener mOnPrepareListViewListener>
	//*  96  187:ifnull          201
			mOnPrepareListViewListener.onPrepareListView(((ListView) (listView)));
	//   97  190:aload_0         
	//   98  191:getfield        #162 <Field AlertController$AlertParams$OnPrepareListViewListener mOnPrepareListViewListener>
	//   99  194:aload           4
	//  100  196:invokeinterface #166 <Method void AlertController$AlertParams$OnPrepareListViewListener.onPrepareListView(ListView)>
		dialog.mAdapter = ((ListAdapter) (obj));
	//  101  201:aload_1         
	//  102  202:aload_3         
	//  103  203:putfield        #167 <Field ListAdapter AlertController.mAdapter>
		dialog.mCheckedItem = mCheckedItem;
	//  104  206:aload_1         
	//  105  207:aload_0         
	//  106  208:getfield        #90  <Field int mCheckedItem>
	//  107  211:putfield        #168 <Field int AlertController.mCheckedItem>
		if(mOnClickListener != null)
	//* 108  214:aload_0         
	//* 109  215:getfield        #170 <Field android.content.DialogInterface$OnClickListener mOnClickListener>
	//* 110  218:ifnull          238
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
	//  111  221:aload           4
	//  112  223:new             #13  <Class AlertController$AlertParams$3>
	//  113  226:dup             
	//  114  227:aload_0         
	//  115  228:aload_1         
	//  116  229:invokespecial   #173 <Method void AlertController$AlertParams$3(AlertController$AlertParams, AlertController)>
	//  117  232:invokevirtual   #177 <Method void AlertController$RecycleListView.setOnItemClickListener(android.widget.AdapterView$OnItemClickListener)>
		else
	//* 118  235:goto            261
		if(mOnCheckboxClickListener != null)
	//* 119  238:aload_0         
	//* 120  239:getfield        #179 <Field android.content.DialogInterface$OnMultiChoiceClickListener mOnCheckboxClickListener>
	//* 121  242:ifnull          261
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
	//  122  245:aload           4
	//  123  247:new             #15  <Class AlertController$AlertParams$4>
	//  124  250:dup             
	//  125  251:aload_0         
	//  126  252:aload           4
	//  127  254:aload_1         
	//  128  255:invokespecial   #182 <Method void AlertController$AlertParams$4(AlertController$AlertParams, AlertController$RecycleListView, AlertController)>
	//  129  258:invokevirtual   #177 <Method void AlertController$RecycleListView.setOnItemClickListener(android.widget.AdapterView$OnItemClickListener)>
		if(mOnItemSelectedListener != null)
	//* 130  261:aload_0         
	//* 131  262:getfield        #184 <Field android.widget.AdapterView$OnItemSelectedListener mOnItemSelectedListener>
	//* 132  265:ifnull          277
			listView.setOnItemSelectedListener(mOnItemSelectedListener);
	//  133  268:aload           4
	//  134  270:aload_0         
	//  135  271:getfield        #184 <Field android.widget.AdapterView$OnItemSelectedListener mOnItemSelectedListener>
	//  136  274:invokevirtual   #188 <Method void AlertController$RecycleListView.setOnItemSelectedListener(android.widget.AdapterView$OnItemSelectedListener)>
		if(mIsSingleChoice)
	//* 137  277:aload_0         
	//* 138  278:getfield        #138 <Field boolean mIsSingleChoice>
	//* 139  281:ifeq            293
			listView.setChoiceMode(1);
	//  140  284:aload           4
	//  141  286:iconst_1        
	//  142  287:invokevirtual   #192 <Method void AlertController$RecycleListView.setChoiceMode(int)>
		else
	//* 143  290:goto            306
		if(mIsMultiChoice)
	//* 144  293:aload_0         
	//* 145  294:getfield        #122 <Field boolean mIsMultiChoice>
	//* 146  297:ifeq            306
			listView.setChoiceMode(2);
	//  147  300:aload           4
	//  148  302:iconst_2        
	//  149  303:invokevirtual   #192 <Method void AlertController$RecycleListView.setChoiceMode(int)>
		dialog.mListView = ((ListView) (listView));
	//  150  306:aload_1         
	//  151  307:aload           4
	//  152  309:putfield        #196 <Field ListView AlertController.mListView>
	//  153  312:return          
	}

	public void apply(AlertController alertcontroller)
	{
		if(mCustomTitleView != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #199 <Field View mCustomTitleView>
	//*   2    4:ifnull          18
		{
			alertcontroller.setCustomTitle(mCustomTitleView);
	//    3    7:aload_1         
	//    4    8:aload_0         
	//    5    9:getfield        #199 <Field View mCustomTitleView>
	//    6   12:invokevirtual   #203 <Method void AlertController.setCustomTitle(View)>
		} else
	//*   7   15:goto            82
		{
			if(mTitle != null)
	//*   8   18:aload_0         
	//*   9   19:getfield        #205 <Field CharSequence mTitle>
	//*  10   22:ifnull          33
				alertcontroller.setTitle(mTitle);
	//   11   25:aload_1         
	//   12   26:aload_0         
	//   13   27:getfield        #205 <Field CharSequence mTitle>
	//   14   30:invokevirtual   #209 <Method void AlertController.setTitle(CharSequence)>
			if(mIcon != null)
	//*  15   33:aload_0         
	//*  16   34:getfield        #211 <Field Drawable mIcon>
	//*  17   37:ifnull          48
				alertcontroller.setIcon(mIcon);
	//   18   40:aload_1         
	//   19   41:aload_0         
	//   20   42:getfield        #211 <Field Drawable mIcon>
	//   21   45:invokevirtual   #215 <Method void AlertController.setIcon(Drawable)>
			if(mIconId != 0)
	//*  22   48:aload_0         
	//*  23   49:getfield        #84  <Field int mIconId>
	//*  24   52:ifeq            63
				alertcontroller.setIcon(mIconId);
	//   25   55:aload_1         
	//   26   56:aload_0         
	//   27   57:getfield        #84  <Field int mIconId>
	//   28   60:invokevirtual   #217 <Method void AlertController.setIcon(int)>
			if(mIconAttrId != 0)
	//*  29   63:aload_0         
	//*  30   64:getfield        #86  <Field int mIconAttrId>
	//*  31   67:ifeq            82
				alertcontroller.setIcon(alertcontroller.getIconAttributeResId(mIconAttrId));
	//   32   70:aload_1         
	//   33   71:aload_1         
	//   34   72:aload_0         
	//   35   73:getfield        #86  <Field int mIconAttrId>
	//   36   76:invokevirtual   #221 <Method int AlertController.getIconAttributeResId(int)>
	//   37   79:invokevirtual   #217 <Method void AlertController.setIcon(int)>
		}
		if(mMessage != null)
	//*  38   82:aload_0         
	//*  39   83:getfield        #223 <Field CharSequence mMessage>
	//*  40   86:ifnull          97
			alertcontroller.setMessage(mMessage);
	//   41   89:aload_1         
	//   42   90:aload_0         
	//   43   91:getfield        #223 <Field CharSequence mMessage>
	//   44   94:invokevirtual   #226 <Method void AlertController.setMessage(CharSequence)>
		if(mPositiveButtonText != null)
	//*  45   97:aload_0         
	//*  46   98:getfield        #228 <Field CharSequence mPositiveButtonText>
	//*  47  101:ifnull          118
			alertcontroller.setButton(-1, mPositiveButtonText, mPositiveButtonListener, ((android.os.Message) (null)));
	//   48  104:aload_1         
	//   49  105:iconst_m1       
	//   50  106:aload_0         
	//   51  107:getfield        #228 <Field CharSequence mPositiveButtonText>
	//   52  110:aload_0         
	//   53  111:getfield        #230 <Field android.content.DialogInterface$OnClickListener mPositiveButtonListener>
	//   54  114:aconst_null     
	//   55  115:invokevirtual   #234 <Method void AlertController.setButton(int, CharSequence, android.content.DialogInterface$OnClickListener, android.os.Message)>
		if(mNegativeButtonText != null)
	//*  56  118:aload_0         
	//*  57  119:getfield        #236 <Field CharSequence mNegativeButtonText>
	//*  58  122:ifnull          140
			alertcontroller.setButton(-2, mNegativeButtonText, mNegativeButtonListener, ((android.os.Message) (null)));
	//   59  125:aload_1         
	//   60  126:bipush          -2
	//   61  128:aload_0         
	//   62  129:getfield        #236 <Field CharSequence mNegativeButtonText>
	//   63  132:aload_0         
	//   64  133:getfield        #238 <Field android.content.DialogInterface$OnClickListener mNegativeButtonListener>
	//   65  136:aconst_null     
	//   66  137:invokevirtual   #234 <Method void AlertController.setButton(int, CharSequence, android.content.DialogInterface$OnClickListener, android.os.Message)>
		if(mNeutralButtonText != null)
	//*  67  140:aload_0         
	//*  68  141:getfield        #240 <Field CharSequence mNeutralButtonText>
	//*  69  144:ifnull          162
			alertcontroller.setButton(-3, mNeutralButtonText, mNeutralButtonListener, ((android.os.Message) (null)));
	//   70  147:aload_1         
	//   71  148:bipush          -3
	//   72  150:aload_0         
	//   73  151:getfield        #240 <Field CharSequence mNeutralButtonText>
	//   74  154:aload_0         
	//   75  155:getfield        #242 <Field android.content.DialogInterface$OnClickListener mNeutralButtonListener>
	//   76  158:aconst_null     
	//   77  159:invokevirtual   #234 <Method void AlertController.setButton(int, CharSequence, android.content.DialogInterface$OnClickListener, android.os.Message)>
		if(mItems != null || mCursor != null || mAdapter != null)
	//*  78  162:aload_0         
	//*  79  163:getfield        #130 <Field CharSequence[] mItems>
	//*  80  166:ifnonnull       183
	//*  81  169:aload_0         
	//*  82  170:getfield        #124 <Field Cursor mCursor>
	//*  83  173:ifnonnull       183
	//*  84  176:aload_0         
	//*  85  177:getfield        #155 <Field ListAdapter mAdapter>
	//*  86  180:ifnull          188
			createListView(alertcontroller);
	//   87  183:aload_0         
	//   88  184:aload_1         
	//   89  185:invokespecial   #244 <Method void createListView(AlertController)>
		if(mView != null)
	//*  90  188:aload_0         
	//*  91  189:getfield        #246 <Field View mView>
	//*  92  192:ifnull          236
			if(mViewSpacingSpecified)
	//*  93  195:aload_0         
	//*  94  196:getfield        #88  <Field boolean mViewSpacingSpecified>
	//*  95  199:ifeq            227
			{
				alertcontroller.setView(mView, mViewSpacingLeft, mViewSpacingTop, mViewSpacingRight, mViewSpacingBottom);
	//   96  202:aload_1         
	//   97  203:aload_0         
	//   98  204:getfield        #246 <Field View mView>
	//   99  207:aload_0         
	//  100  208:getfield        #248 <Field int mViewSpacingLeft>
	//  101  211:aload_0         
	//  102  212:getfield        #250 <Field int mViewSpacingTop>
	//  103  215:aload_0         
	//  104  216:getfield        #252 <Field int mViewSpacingRight>
	//  105  219:aload_0         
	//  106  220:getfield        #254 <Field int mViewSpacingBottom>
	//  107  223:invokevirtual   #258 <Method void AlertController.setView(View, int, int, int, int)>
				return;
	//  108  226:return          
			} else
			{
				alertcontroller.setView(mView);
	//  109  227:aload_1         
	//  110  228:aload_0         
	//  111  229:getfield        #246 <Field View mView>
	//  112  232:invokevirtual   #260 <Method void AlertController.setView(View)>
				return;
	//  113  235:return          
			}
		if(mViewLayoutResId != 0)
	//* 114  236:aload_0         
	//* 115  237:getfield        #262 <Field int mViewLayoutResId>
	//* 116  240:ifeq            251
			alertcontroller.setView(mViewLayoutResId);
	//  117  243:aload_1         
	//  118  244:aload_0         
	//  119  245:getfield        #262 <Field int mViewLayoutResId>
	//  120  248:invokevirtual   #264 <Method void AlertController.setView(int)>
	//  121  251:return          
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
