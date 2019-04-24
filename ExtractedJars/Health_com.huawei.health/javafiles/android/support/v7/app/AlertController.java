// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v7.app;

import android.content.Context;
import android.content.DialogInterface;
import android.content.res.TypedArray;
import android.database.Cursor;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Message;
import android.support.v4.view.ViewCompat;
import android.support.v4.widget.NestedScrollView;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.*;
import android.widget.*;
import java.lang.ref.WeakReference;

// Referenced classes of package android.support.v7.app:
//			AppCompatDialog

class AlertController
{
	public static class AlertParams
	{

		private void createListView(AlertController alertcontroller)
		{
			final RecycleListView listView = (RecycleListView)mInflater.inflate(alertcontroller.mListLayout, ((ViewGroup) (null)));
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
					obj = ((Object) (((_cls1) (mContext)). new ArrayAdapter(alertcontroller.mMultiChoiceItemLayout, 0x1020014, mItems, listView) {

						public View getView(int i, View view, ViewGroup viewgroup)
						{
							view = super.getView(i, view, viewgroup);
						//    0    0:aload_0         
						//    1    1:iload_1         
						//    2    2:aload_2         
						//    3    3:aload_3         
						//    4    4:invokespecial   #31  <Method View ArrayAdapter.getView(int, View, ViewGroup)>
						//    5    7:astore_2        
							if(mCheckedItems != null && mCheckedItems[i])
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
								listView.setItemChecked(i, true);
						//   16   30:aload_0         
						//   17   31:getfield        #23  <Field AlertController$RecycleListView val$listView>
						//   18   34:iload_1         
						//   19   35:iconst_1        
						//   20   36:invokevirtual   #41  <Method void AlertController$RecycleListView.setItemChecked(int, boolean)>
							return view;
						//   21   39:aload_2         
						//   22   40:areturn         
						}

						final AlertParams this$0;
						final RecycleListView val$listView;

			
			{
				this$0 = final_alertparams;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #21  <Field AlertController$AlertParams this$0>
				listView = recyclelistview;
			//    3    5:aload_0         
			//    4    6:aload           6
			//    5    8:putfield        #23  <Field AlertController$RecycleListView val$listView>
				super(Context.this, i, j, ((Object []) (acharsequence)));
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
					obj = ((Object) (((_cls2) (mCursor)). new CursorAdapter(false, listView, alertcontroller) {

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
							int i = cursor.getPosition();
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
							((RecycleListView) (view)).setItemChecked(i, flag);
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
						final AlertParams this$0;
						final AlertController val$dialog;
						final RecycleListView val$listView;

			
			{
				this$0 = final_alertparams;
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
				super(final_context, Cursor.this, flag);
			//    9   17:aload_0         
			//   10   18:aload_2         
			//   11   19:aload_3         
			//   12   20:iload           4
			//   13   22:invokespecial   #32  <Method void CursorAdapter(Context, Cursor, boolean)>
				final_alertparams = ((AlertParams) (getCursor()));
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
					i = alertcontroller.mSingleChoiceItemLayout;
		//   44   90:aload_1         
		//   45   91:getfield        #141 <Field int AlertController.mSingleChoiceItemLayout>
		//   46   94:istore_2        
				else
		//*  47   95:goto            103
					i = alertcontroller.mListItemLayout;
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
					obj = ((Object) (new CheckedItemAdapter(mContext, i, 0x1020014, mItems)));
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
			alertcontroller.mAdapter = ((ListAdapter) (obj));
		//  101  201:aload_1         
		//  102  202:aload_3         
		//  103  203:putfield        #167 <Field ListAdapter AlertController.mAdapter>
			alertcontroller.mCheckedItem = mCheckedItem;
		//  104  206:aload_1         
		//  105  207:aload_0         
		//  106  208:getfield        #90  <Field int mCheckedItem>
		//  107  211:putfield        #168 <Field int AlertController.mCheckedItem>
			if(mOnClickListener != null)
		//* 108  214:aload_0         
		//* 109  215:getfield        #170 <Field android.content.DialogInterface$OnClickListener mOnClickListener>
		//* 110  218:ifnull          238
				listView.setOnItemClickListener(((_cls3) (alertcontroller)). new android.widget.AdapterView.OnItemClickListener() {

					public void onItemClick(AdapterView adapterview, View view, int i, long l)
					{
						mOnClickListener.onClick(((DialogInterface) (dialog.mDialog)), i);
					//    0    0:aload_0         
					//    1    1:getfield        #22  <Field AlertController$AlertParams this$0>
					//    2    4:getfield        #34  <Field android.content.DialogInterface$OnClickListener AlertController$AlertParams.mOnClickListener>
					//    3    7:aload_0         
					//    4    8:getfield        #24  <Field AlertController val$dialog>
					//    5   11:getfield        #38  <Field AppCompatDialog AlertController.mDialog>
					//    6   14:iload_3         
					//    7   15:invokeinterface #44  <Method void android.content.DialogInterface$OnClickListener.onClick(DialogInterface, int)>
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

					final AlertParams this$0;
					final AlertController val$dialog;

			
			{
				this$0 = final_alertparams;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #22  <Field AlertController$AlertParams this$0>
				dialog = AlertController.this;
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
				listView.setOnItemClickListener(((_cls4) (alertcontroller)). new android.widget.AdapterView.OnItemClickListener() {

					public void onItemClick(AdapterView adapterview, View view, int i, long l)
					{
						if(mCheckedItems != null)
					//*   0    0:aload_0         
					//*   1    1:getfield        #24  <Field AlertController$AlertParams this$0>
					//*   2    4:getfield        #38  <Field boolean[] AlertController$AlertParams.mCheckedItems>
					//*   3    7:ifnull          27
							mCheckedItems[i] = listView.isItemChecked(i);
					//    4   10:aload_0         
					//    5   11:getfield        #24  <Field AlertController$AlertParams this$0>
					//    6   14:getfield        #38  <Field boolean[] AlertController$AlertParams.mCheckedItems>
					//    7   17:iload_3         
					//    8   18:aload_0         
					//    9   19:getfield        #26  <Field AlertController$RecycleListView val$listView>
					//   10   22:iload_3         
					//   11   23:invokevirtual   #44  <Method boolean AlertController$RecycleListView.isItemChecked(int)>
					//   12   26:bastore         
						mOnCheckboxClickListener.onClick(((DialogInterface) (dialog.mDialog)), i, listView.isItemChecked(i));
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
					//   24   50:invokeinterface #58  <Method void android.content.DialogInterface$OnMultiChoiceClickListener.onClick(DialogInterface, int, boolean)>
					//   25   55:return          
					}

					final AlertParams this$0;
					final AlertController val$dialog;
					final RecycleListView val$listView;

			
			{
				this$0 = final_alertparams;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #24  <Field AlertController$AlertParams this$0>
				listView = recyclelistview;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #26  <Field AlertController$RecycleListView val$listView>
				dialog = AlertController.this;
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
			alertcontroller.mListView = ((ListView) (listView));
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
				alertcontroller.setButton(-1, mPositiveButtonText, mPositiveButtonListener, ((Message) (null)));
		//   48  104:aload_1         
		//   49  105:iconst_m1       
		//   50  106:aload_0         
		//   51  107:getfield        #228 <Field CharSequence mPositiveButtonText>
		//   52  110:aload_0         
		//   53  111:getfield        #230 <Field android.content.DialogInterface$OnClickListener mPositiveButtonListener>
		//   54  114:aconst_null     
		//   55  115:invokevirtual   #234 <Method void AlertController.setButton(int, CharSequence, android.content.DialogInterface$OnClickListener, Message)>
			if(mNegativeButtonText != null)
		//*  56  118:aload_0         
		//*  57  119:getfield        #236 <Field CharSequence mNegativeButtonText>
		//*  58  122:ifnull          140
				alertcontroller.setButton(-2, mNegativeButtonText, mNegativeButtonListener, ((Message) (null)));
		//   59  125:aload_1         
		//   60  126:bipush          -2
		//   61  128:aload_0         
		//   62  129:getfield        #236 <Field CharSequence mNegativeButtonText>
		//   63  132:aload_0         
		//   64  133:getfield        #238 <Field android.content.DialogInterface$OnClickListener mNegativeButtonListener>
		//   65  136:aconst_null     
		//   66  137:invokevirtual   #234 <Method void AlertController.setButton(int, CharSequence, android.content.DialogInterface$OnClickListener, Message)>
			if(mNeutralButtonText != null)
		//*  67  140:aload_0         
		//*  68  141:getfield        #240 <Field CharSequence mNeutralButtonText>
		//*  69  144:ifnull          162
				alertcontroller.setButton(-3, mNeutralButtonText, mNeutralButtonListener, ((Message) (null)));
		//   70  147:aload_1         
		//   71  148:bipush          -3
		//   72  150:aload_0         
		//   73  151:getfield        #240 <Field CharSequence mNeutralButtonText>
		//   74  154:aload_0         
		//   75  155:getfield        #242 <Field android.content.DialogInterface$OnClickListener mNeutralButtonListener>
		//   76  158:aconst_null     
		//   77  159:invokevirtual   #234 <Method void AlertController.setButton(int, CharSequence, android.content.DialogInterface$OnClickListener, Message)>
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
		public android.content.DialogInterface.OnClickListener mNegativeButtonListener;
		public CharSequence mNegativeButtonText;
		public android.content.DialogInterface.OnClickListener mNeutralButtonListener;
		public CharSequence mNeutralButtonText;
		public android.content.DialogInterface.OnCancelListener mOnCancelListener;
		public android.content.DialogInterface.OnMultiChoiceClickListener mOnCheckboxClickListener;
		public android.content.DialogInterface.OnClickListener mOnClickListener;
		public android.content.DialogInterface.OnDismissListener mOnDismissListener;
		public android.widget.AdapterView.OnItemSelectedListener mOnItemSelectedListener;
		public android.content.DialogInterface.OnKeyListener mOnKeyListener;
		public OnPrepareListViewListener mOnPrepareListViewListener;
		public android.content.DialogInterface.OnClickListener mPositiveButtonListener;
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

		public AlertParams(Context context)
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

	public static interface AlertParams.OnPrepareListViewListener
	{

		public abstract void onPrepareListView(ListView listview);
	}

	static final class ButtonHandler extends Handler
	{

		public void handleMessage(Message message)
		{
			switch(message.what)
		//*   0    0:aload_1         
		//*   1    1:getfield        #33  <Field int Message.what>
			{
		//*   2    4:tableswitch     -3 1: default 40
		//		               -3 41
		//		               -2 41
		//		               -1 41
		//		               0 80
		//		               1 68
			default:
				return;
		//    3   40:return          

			case -3: 
			case -2: 
			case -1: 
				((android.content.DialogInterface.OnClickListener)message.obj).onClick((DialogInterface)mDialog.get(), message.what);
		//    4   41:aload_1         
		//    5   42:getfield        #37  <Field Object Message.obj>
		//    6   45:checkcast       #39  <Class android.content.DialogInterface$OnClickListener>
		//    7   48:aload_0         
		//    8   49:getfield        #25  <Field WeakReference mDialog>
		//    9   52:invokevirtual   #43  <Method Object WeakReference.get()>
		//   10   55:checkcast       #45  <Class DialogInterface>
		//   11   58:aload_1         
		//   12   59:getfield        #33  <Field int Message.what>
		//   13   62:invokeinterface #49  <Method void android.content.DialogInterface$OnClickListener.onClick(DialogInterface, int)>
				return;
		//   14   67:return          

			case 1: // '\001'
				((DialogInterface)message.obj).dismiss();
		//   15   68:aload_1         
		//   16   69:getfield        #37  <Field Object Message.obj>
		//   17   72:checkcast       #45  <Class DialogInterface>
		//   18   75:invokeinterface #52  <Method void DialogInterface.dismiss()>
				// fall through

			case 0: // '\0'
				return;
		//   19   80:return          
			}
		}

		private static final int MSG_DISMISS_DIALOG = 1;
		private WeakReference mDialog;

		public ButtonHandler(DialogInterface dialoginterface)
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #18  <Method void Handler()>
			mDialog = new WeakReference(((Object) (dialoginterface)));
		//    2    4:aload_0         
		//    3    5:new             #20  <Class WeakReference>
		//    4    8:dup             
		//    5    9:aload_1         
		//    6   10:invokespecial   #23  <Method void WeakReference(Object)>
		//    7   13:putfield        #25  <Field WeakReference mDialog>
		//    8   16:return          
		}
	}

	static class CheckedItemAdapter extends ArrayAdapter
	{

		public long getItemId(int i)
		{
			return (long)i;
		//    0    0:iload_1         
		//    1    1:i2l             
		//    2    2:lreturn         
		}

		public boolean hasStableIds()
		{
			return true;
		//    0    0:iconst_1        
		//    1    1:ireturn         
		}

		public CheckedItemAdapter(Context context, int i, int j, CharSequence acharsequence[])
		{
			super(context, i, j, ((Object []) (acharsequence)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:iload_2         
		//    3    3:iload_3         
		//    4    4:aload           4
		//    5    6:invokespecial   #13  <Method void ArrayAdapter(Context, int, int, Object[])>
		//    6    9:return          
		}
	}

	public static class RecycleListView extends ListView
	{

		public void setHasDecor(boolean flag, boolean flag1)
		{
			if(!flag1 || !flag)
		//*   0    0:iload_2         
		//*   1    1:ifeq            8
		//*   2    4:iload_1         
		//*   3    5:ifne            67
			{
				int k = getPaddingLeft();
		//    4    8:aload_0         
		//    5    9:invokevirtual   #50  <Method int getPaddingLeft()>
		//    6   12:istore          5
				int i;
				if(flag)
		//*   7   14:iload_1         
		//*   8   15:ifeq            26
					i = getPaddingTop();
		//    9   18:aload_0         
		//   10   19:invokevirtual   #53  <Method int getPaddingTop()>
		//   11   22:istore_3        
				else
		//*  12   23:goto            31
					i = mPaddingTopNoTitle;
		//   13   26:aload_0         
		//   14   27:getfield        #44  <Field int mPaddingTopNoTitle>
		//   15   30:istore_3        
				int l = getPaddingRight();
		//   16   31:aload_0         
		//   17   32:invokevirtual   #56  <Method int getPaddingRight()>
		//   18   35:istore          6
				int j;
				if(flag1)
		//*  19   37:iload_2         
		//*  20   38:ifeq            50
					j = getPaddingBottom();
		//   21   41:aload_0         
		//   22   42:invokevirtual   #59  <Method int getPaddingBottom()>
		//   23   45:istore          4
				else
		//*  24   47:goto            56
					j = mPaddingBottomNoButtons;
		//   25   50:aload_0         
		//   26   51:getfield        #39  <Field int mPaddingBottomNoButtons>
		//   27   54:istore          4
				setPadding(k, i, l, j);
		//   28   56:aload_0         
		//   29   57:iload           5
		//   30   59:iload_3         
		//   31   60:iload           6
		//   32   62:iload           4
		//   33   64:invokevirtual   #63  <Method void setPadding(int, int, int, int)>
			}
		//   34   67:return          
		}

		private final int mPaddingBottomNoButtons;
		private final int mPaddingTopNoTitle;

		public RecycleListView(Context context)
		{
			this(context, ((AttributeSet) (null)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:aconst_null     
		//    3    3:invokespecial   #15  <Method void AlertController$RecycleListView(Context, AttributeSet)>
		//    4    6:return          
		}

		public RecycleListView(Context context, AttributeSet attributeset)
		{
			super(context, attributeset);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:aload_2         
		//    3    3:invokespecial   #17  <Method void ListView(Context, AttributeSet)>
			context = ((Context) (context.obtainStyledAttributes(attributeset, android.support.v7.appcompat.R.styleable.RecycleListView)));
		//    4    6:aload_1         
		//    5    7:aload_2         
		//    6    8:getstatic       #22  <Field int[] android.support.v7.appcompat.R$styleable.RecycleListView>
		//    7   11:invokevirtual   #28  <Method TypedArray Context.obtainStyledAttributes(AttributeSet, int[])>
		//    8   14:astore_1        
			mPaddingBottomNoButtons = ((TypedArray) (context)).getDimensionPixelOffset(android.support.v7.appcompat.R.styleable.RecycleListView_paddingBottomNoButtons, -1);
		//    9   15:aload_0         
		//   10   16:aload_1         
		//   11   17:getstatic       #31  <Field int android.support.v7.appcompat.R$styleable.RecycleListView_paddingBottomNoButtons>
		//   12   20:iconst_m1       
		//   13   21:invokevirtual   #37  <Method int TypedArray.getDimensionPixelOffset(int, int)>
		//   14   24:putfield        #39  <Field int mPaddingBottomNoButtons>
			mPaddingTopNoTitle = ((TypedArray) (context)).getDimensionPixelOffset(android.support.v7.appcompat.R.styleable.RecycleListView_paddingTopNoTitle, -1);
		//   15   27:aload_0         
		//   16   28:aload_1         
		//   17   29:getstatic       #42  <Field int android.support.v7.appcompat.R$styleable.RecycleListView_paddingTopNoTitle>
		//   18   32:iconst_m1       
		//   19   33:invokevirtual   #37  <Method int TypedArray.getDimensionPixelOffset(int, int)>
		//   20   36:putfield        #44  <Field int mPaddingTopNoTitle>
		//   21   39:return          
		}
	}


	public AlertController(Context context, AppCompatDialog appcompatdialog, Window window)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #100 <Method void Object()>
		mViewSpacingSpecified = false;
	//    2    4:aload_0         
	//    3    5:iconst_0        
	//    4    6:putfield        #102 <Field boolean mViewSpacingSpecified>
		mIconId = 0;
	//    5    9:aload_0         
	//    6   10:iconst_0        
	//    7   11:putfield        #104 <Field int mIconId>
		mCheckedItem = -1;
	//    8   14:aload_0         
	//    9   15:iconst_m1       
	//   10   16:putfield        #106 <Field int mCheckedItem>
		mButtonPanelLayoutHint = 0;
	//   11   19:aload_0         
	//   12   20:iconst_0        
	//   13   21:putfield        #108 <Field int mButtonPanelLayoutHint>
	//   14   24:aload_0         
	//   15   25:new             #6   <Class AlertController$1>
	//   16   28:dup             
	//   17   29:aload_0         
	//   18   30:invokespecial   #111 <Method void AlertController$1(AlertController)>
	//   19   33:putfield        #113 <Field android.view.View$OnClickListener mButtonHandler>
		mContext = context;
	//   20   36:aload_0         
	//   21   37:aload_1         
	//   22   38:putfield        #115 <Field Context mContext>
		mDialog = appcompatdialog;
	//   23   41:aload_0         
	//   24   42:aload_2         
	//   25   43:putfield        #117 <Field AppCompatDialog mDialog>
		mWindow = window;
	//   26   46:aload_0         
	//   27   47:aload_3         
	//   28   48:putfield        #119 <Field Window mWindow>
		mHandler = ((Handler) (new ButtonHandler(((DialogInterface) (appcompatdialog)))));
	//   29   51:aload_0         
	//   30   52:new             #30  <Class AlertController$ButtonHandler>
	//   31   55:dup             
	//   32   56:aload_2         
	//   33   57:invokespecial   #122 <Method void AlertController$ButtonHandler(DialogInterface)>
	//   34   60:putfield        #124 <Field Handler mHandler>
		context = ((Context) (context.obtainStyledAttributes(((AttributeSet) (null)), android.support.v7.appcompat.R.styleable.AlertDialog, android.support.v7.appcompat.R.attr.alertDialogStyle, 0)));
	//   35   63:aload_1         
	//   36   64:aconst_null     
	//   37   65:getstatic       #130 <Field int[] android.support.v7.appcompat.R$styleable.AlertDialog>
	//   38   68:getstatic       #135 <Field int android.support.v7.appcompat.R$attr.alertDialogStyle>
	//   39   71:iconst_0        
	//   40   72:invokevirtual   #141 <Method TypedArray Context.obtainStyledAttributes(AttributeSet, int[], int, int)>
	//   41   75:astore_1        
		mAlertDialogLayout = ((TypedArray) (context)).getResourceId(android.support.v7.appcompat.R.styleable.AlertDialog_android_layout, 0);
	//   42   76:aload_0         
	//   43   77:aload_1         
	//   44   78:getstatic       #144 <Field int android.support.v7.appcompat.R$styleable.AlertDialog_android_layout>
	//   45   81:iconst_0        
	//   46   82:invokevirtual   #150 <Method int TypedArray.getResourceId(int, int)>
	//   47   85:putfield        #152 <Field int mAlertDialogLayout>
		mButtonPanelSideLayout = ((TypedArray) (context)).getResourceId(android.support.v7.appcompat.R.styleable.AlertDialog_buttonPanelSideLayout, 0);
	//   48   88:aload_0         
	//   49   89:aload_1         
	//   50   90:getstatic       #155 <Field int android.support.v7.appcompat.R$styleable.AlertDialog_buttonPanelSideLayout>
	//   51   93:iconst_0        
	//   52   94:invokevirtual   #150 <Method int TypedArray.getResourceId(int, int)>
	//   53   97:putfield        #157 <Field int mButtonPanelSideLayout>
		mListLayout = ((TypedArray) (context)).getResourceId(android.support.v7.appcompat.R.styleable.AlertDialog_listLayout, 0);
	//   54  100:aload_0         
	//   55  101:aload_1         
	//   56  102:getstatic       #160 <Field int android.support.v7.appcompat.R$styleable.AlertDialog_listLayout>
	//   57  105:iconst_0        
	//   58  106:invokevirtual   #150 <Method int TypedArray.getResourceId(int, int)>
	//   59  109:putfield        #162 <Field int mListLayout>
		mMultiChoiceItemLayout = ((TypedArray) (context)).getResourceId(android.support.v7.appcompat.R.styleable.AlertDialog_multiChoiceItemLayout, 0);
	//   60  112:aload_0         
	//   61  113:aload_1         
	//   62  114:getstatic       #165 <Field int android.support.v7.appcompat.R$styleable.AlertDialog_multiChoiceItemLayout>
	//   63  117:iconst_0        
	//   64  118:invokevirtual   #150 <Method int TypedArray.getResourceId(int, int)>
	//   65  121:putfield        #167 <Field int mMultiChoiceItemLayout>
		mSingleChoiceItemLayout = ((TypedArray) (context)).getResourceId(android.support.v7.appcompat.R.styleable.AlertDialog_singleChoiceItemLayout, 0);
	//   66  124:aload_0         
	//   67  125:aload_1         
	//   68  126:getstatic       #170 <Field int android.support.v7.appcompat.R$styleable.AlertDialog_singleChoiceItemLayout>
	//   69  129:iconst_0        
	//   70  130:invokevirtual   #150 <Method int TypedArray.getResourceId(int, int)>
	//   71  133:putfield        #172 <Field int mSingleChoiceItemLayout>
		mListItemLayout = ((TypedArray) (context)).getResourceId(android.support.v7.appcompat.R.styleable.AlertDialog_listItemLayout, 0);
	//   72  136:aload_0         
	//   73  137:aload_1         
	//   74  138:getstatic       #175 <Field int android.support.v7.appcompat.R$styleable.AlertDialog_listItemLayout>
	//   75  141:iconst_0        
	//   76  142:invokevirtual   #150 <Method int TypedArray.getResourceId(int, int)>
	//   77  145:putfield        #177 <Field int mListItemLayout>
		mShowTitle = ((TypedArray) (context)).getBoolean(android.support.v7.appcompat.R.styleable.AlertDialog_showTitle, true);
	//   78  148:aload_0         
	//   79  149:aload_1         
	//   80  150:getstatic       #180 <Field int android.support.v7.appcompat.R$styleable.AlertDialog_showTitle>
	//   81  153:iconst_1        
	//   82  154:invokevirtual   #184 <Method boolean TypedArray.getBoolean(int, boolean)>
	//   83  157:putfield        #186 <Field boolean mShowTitle>
		((TypedArray) (context)).recycle();
	//   84  160:aload_1         
	//   85  161:invokevirtual   #189 <Method void TypedArray.recycle()>
		appcompatdialog.supportRequestWindowFeature(1);
	//   86  164:aload_2         
	//   87  165:iconst_1        
	//   88  166:invokevirtual   #195 <Method boolean AppCompatDialog.supportRequestWindowFeature(int)>
	//   89  169:pop             
	//   90  170:return          
	}

	static boolean canTextInput(View view)
	{
		if(view.onCheckIsTextEditor())
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #204 <Method boolean View.onCheckIsTextEditor()>
	//*   2    4:ifeq            9
			return true;
	//    3    7:iconst_1        
	//    4    8:ireturn         
		if(!(view instanceof ViewGroup))
	//*   5    9:aload_0         
	//*   6   10:instanceof      #206 <Class ViewGroup>
	//*   7   13:ifne            18
			return false;
	//    8   16:iconst_0        
	//    9   17:ireturn         
		view = ((View) ((ViewGroup)view));
	//   10   18:aload_0         
	//   11   19:checkcast       #206 <Class ViewGroup>
	//   12   22:astore_0        
		for(int i = ((ViewGroup) (view)).getChildCount(); i > 0;)
	//*  13   23:aload_0         
	//*  14   24:invokevirtual   #210 <Method int ViewGroup.getChildCount()>
	//*  15   27:istore_1        
	//*  16   28:iload_1         
	//*  17   29:ifle            51
		{
			int j = i - 1;
	//   18   32:iload_1         
	//   19   33:iconst_1        
	//   20   34:isub            
	//   21   35:istore_2        
			i = j;
	//   22   36:iload_2         
	//   23   37:istore_1        
			if(canTextInput(((ViewGroup) (view)).getChildAt(j)))
	//*  24   38:aload_0         
	//*  25   39:iload_2         
	//*  26   40:invokevirtual   #214 <Method View ViewGroup.getChildAt(int)>
	//*  27   43:invokestatic    #216 <Method boolean canTextInput(View)>
	//*  28   46:ifeq            28
				return true;
	//   29   49:iconst_1        
	//   30   50:ireturn         
		}

		return false;
	//   31   51:iconst_0        
	//   32   52:ireturn         
	}

	private void centerButton(Button button)
	{
		android.widget.LinearLayout.LayoutParams layoutparams = (android.widget.LinearLayout.LayoutParams)button.getLayoutParams();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #224 <Method android.view.ViewGroup$LayoutParams Button.getLayoutParams()>
	//    2    4:checkcast       #226 <Class android.widget.LinearLayout$LayoutParams>
	//    3    7:astore_2        
		layoutparams.gravity = 1;
	//    4    8:aload_2         
	//    5    9:iconst_1        
	//    6   10:putfield        #229 <Field int android.widget.LinearLayout$LayoutParams.gravity>
		layoutparams.weight = 0.5F;
	//    7   13:aload_2         
	//    8   14:ldc1            #230 <Float 0.5F>
	//    9   16:putfield        #234 <Field float android.widget.LinearLayout$LayoutParams.weight>
		button.setLayoutParams(((android.view.ViewGroup.LayoutParams) (layoutparams)));
	//   10   19:aload_1         
	//   11   20:aload_2         
	//   12   21:invokevirtual   #238 <Method void Button.setLayoutParams(android.view.ViewGroup$LayoutParams)>
	//   13   24:return          
	}

	static void manageScrollIndicators(View view, View view1, View view2)
	{
		if(view1 != null)
	//*   0    0:aload_1         
	//*   1    1:ifnull          24
		{
			byte byte0;
			if(ViewCompat.canScrollVertically(view, -1))
	//*   2    4:aload_0         
	//*   3    5:iconst_m1       
	//*   4    6:invokestatic    #246 <Method boolean ViewCompat.canScrollVertically(View, int)>
	//*   5    9:ifeq            17
				byte0 = 0;
	//    6   12:iconst_0        
	//    7   13:istore_3        
			else
	//*   8   14:goto            19
				byte0 = 4;
	//    9   17:iconst_4        
	//   10   18:istore_3        
			view1.setVisibility(((int) (byte0)));
	//   11   19:aload_1         
	//   12   20:iload_3         
	//   13   21:invokevirtual   #250 <Method void View.setVisibility(int)>
		}
		if(view2 != null)
	//*  14   24:aload_2         
	//*  15   25:ifnull          48
		{
			byte byte1;
			if(ViewCompat.canScrollVertically(view, 1))
	//*  16   28:aload_0         
	//*  17   29:iconst_1        
	//*  18   30:invokestatic    #246 <Method boolean ViewCompat.canScrollVertically(View, int)>
	//*  19   33:ifeq            41
				byte1 = 0;
	//   20   36:iconst_0        
	//   21   37:istore_3        
			else
	//*  22   38:goto            43
				byte1 = 4;
	//   23   41:iconst_4        
	//   24   42:istore_3        
			view2.setVisibility(((int) (byte1)));
	//   25   43:aload_2         
	//   26   44:iload_3         
	//   27   45:invokevirtual   #250 <Method void View.setVisibility(int)>
		}
	//   28   48:return          
	}

	private ViewGroup resolvePanel(View view, View view1)
	{
		if(view == null)
	//*   0    0:aload_1         
	//*   1    1:ifnonnull       26
		{
			view = view1;
	//    2    4:aload_2         
	//    3    5:astore_1        
			if(view1 instanceof ViewStub)
	//*   4    6:aload_2         
	//*   5    7:instanceof      #255 <Class ViewStub>
	//*   6   10:ifeq            21
				view = ((ViewStub)view1).inflate();
	//    7   13:aload_2         
	//    8   14:checkcast       #255 <Class ViewStub>
	//    9   17:invokevirtual   #259 <Method View ViewStub.inflate()>
	//   10   20:astore_1        
			return (ViewGroup)view;
	//   11   21:aload_1         
	//   12   22:checkcast       #206 <Class ViewGroup>
	//   13   25:areturn         
		}
		if(view1 != null)
	//*  14   26:aload_2         
	//*  15   27:ifnull          50
		{
			android.view.ViewParent viewparent = view1.getParent();
	//   16   30:aload_2         
	//   17   31:invokevirtual   #263 <Method android.view.ViewParent View.getParent()>
	//   18   34:astore_3        
			if(viewparent instanceof ViewGroup)
	//*  19   35:aload_3         
	//*  20   36:instanceof      #206 <Class ViewGroup>
	//*  21   39:ifeq            50
				((ViewGroup)viewparent).removeView(view1);
	//   22   42:aload_3         
	//   23   43:checkcast       #206 <Class ViewGroup>
	//   24   46:aload_2         
	//   25   47:invokevirtual   #267 <Method void ViewGroup.removeView(View)>
		}
		view1 = view;
	//   26   50:aload_1         
	//   27   51:astore_2        
		if(view instanceof ViewStub)
	//*  28   52:aload_1         
	//*  29   53:instanceof      #255 <Class ViewStub>
	//*  30   56:ifeq            67
			view1 = ((ViewStub)view).inflate();
	//   31   59:aload_1         
	//   32   60:checkcast       #255 <Class ViewStub>
	//   33   63:invokevirtual   #259 <Method View ViewStub.inflate()>
	//   34   66:astore_2        
		return (ViewGroup)view1;
	//   35   67:aload_2         
	//   36   68:checkcast       #206 <Class ViewGroup>
	//   37   71:areturn         
	}

	private int selectContentView()
	{
		if(mButtonPanelSideLayout == 0)
	//*   0    0:aload_0         
	//*   1    1:getfield        #157 <Field int mButtonPanelSideLayout>
	//*   2    4:ifne            12
			return mAlertDialogLayout;
	//    3    7:aload_0         
	//    4    8:getfield        #152 <Field int mAlertDialogLayout>
	//    5   11:ireturn         
		if(mButtonPanelLayoutHint == 1)
	//*   6   12:aload_0         
	//*   7   13:getfield        #108 <Field int mButtonPanelLayoutHint>
	//*   8   16:iconst_1        
	//*   9   17:icmpne          25
			return mButtonPanelSideLayout;
	//   10   20:aload_0         
	//   11   21:getfield        #157 <Field int mButtonPanelSideLayout>
	//   12   24:ireturn         
		else
			return mAlertDialogLayout;
	//   13   25:aload_0         
	//   14   26:getfield        #152 <Field int mAlertDialogLayout>
	//   15   29:ireturn         
	}

	private void setScrollIndicators(ViewGroup viewgroup, final View top, int i, int j)
	{
		final View bottom = mWindow.findViewById(android.support.v7.appcompat.R.id.scrollIndicatorUp);
	//    0    0:aload_0         
	//    1    1:getfield        #119 <Field Window mWindow>
	//    2    4:getstatic       #277 <Field int android.support.v7.appcompat.R$id.scrollIndicatorUp>
	//    3    7:invokevirtual   #282 <Method View Window.findViewById(int)>
	//    4   10:astore          5
		View view = mWindow.findViewById(android.support.v7.appcompat.R.id.scrollIndicatorDown);
	//    5   12:aload_0         
	//    6   13:getfield        #119 <Field Window mWindow>
	//    7   16:getstatic       #285 <Field int android.support.v7.appcompat.R$id.scrollIndicatorDown>
	//    8   19:invokevirtual   #282 <Method View Window.findViewById(int)>
	//    9   22:astore          6
		if(android.os.Build.VERSION.SDK_INT >= 23)
	//*  10   24:getstatic       #290 <Field int android.os.Build$VERSION.SDK_INT>
	//*  11   27:bipush          23
	//*  12   29:icmplt          62
		{
			ViewCompat.setScrollIndicators(top, i, j);
	//   13   32:aload_2         
	//   14   33:iload_3         
	//   15   34:iload           4
	//   16   36:invokestatic    #293 <Method void ViewCompat.setScrollIndicators(View, int, int)>
			if(bottom != null)
	//*  17   39:aload           5
	//*  18   41:ifnull          50
				viewgroup.removeView(bottom);
	//   19   44:aload_1         
	//   20   45:aload           5
	//   21   47:invokevirtual   #267 <Method void ViewGroup.removeView(View)>
			if(view != null)
	//*  22   50:aload           6
	//*  23   52:ifnull          234
			{
				viewgroup.removeView(view);
	//   24   55:aload_1         
	//   25   56:aload           6
	//   26   58:invokevirtual   #267 <Method void ViewGroup.removeView(View)>
				return;
	//   27   61:return          
			}
		} else
		{
			top = bottom;
	//   28   62:aload           5
	//   29   64:astore_2        
			if(bottom != null)
	//*  30   65:aload           5
	//*  31   67:ifnull          87
			{
				top = bottom;
	//   32   70:aload           5
	//   33   72:astore_2        
				if((i & 1) == 0)
	//*  34   73:iload_3         
	//*  35   74:iconst_1        
	//*  36   75:iand            
	//*  37   76:ifne            87
				{
					viewgroup.removeView(bottom);
	//   38   79:aload_1         
	//   39   80:aload           5
	//   40   82:invokevirtual   #267 <Method void ViewGroup.removeView(View)>
					top = null;
	//   41   85:aconst_null     
	//   42   86:astore_2        
				}
			}
			bottom = view;
	//   43   87:aload           6
	//   44   89:astore          5
			if(view != null)
	//*  45   91:aload           6
	//*  46   93:ifnull          115
			{
				bottom = view;
	//   47   96:aload           6
	//   48   98:astore          5
				if((i & 2) == 0)
	//*  49  100:iload_3         
	//*  50  101:iconst_2        
	//*  51  102:iand            
	//*  52  103:ifne            115
				{
					viewgroup.removeView(view);
	//   53  106:aload_1         
	//   54  107:aload           6
	//   55  109:invokevirtual   #267 <Method void ViewGroup.removeView(View)>
					bottom = null;
	//   56  112:aconst_null     
	//   57  113:astore          5
				}
			}
			if(top != null || bottom != null)
	//*  58  115:aload_2         
	//*  59  116:ifnonnull       124
	//*  60  119:aload           5
	//*  61  121:ifnull          234
			{
				if(mMessage != null)
	//*  62  124:aload_0         
	//*  63  125:getfield        #295 <Field CharSequence mMessage>
	//*  64  128:ifnull          169
				{
					mScrollView.setOnScrollChangeListener(new android.support.v4.widget.NestedScrollView.OnScrollChangeListener() {

						public void onScrollChange(NestedScrollView nestedscrollview, int k, int l, int i1, int j1)
						{
							AlertController.manageScrollIndicators(((View) (nestedscrollview)), top, bottom);
						//    0    0:aload_1         
						//    1    1:aload_0         
						//    2    2:getfield        #22  <Field View val$top>
						//    3    5:aload_0         
						//    4    6:getfield        #24  <Field View val$bottom>
						//    5    9:invokestatic    #34  <Method void AlertController.manageScrollIndicators(View, View, View)>
						//    6   12:return          
						}

						final AlertController this$0;
						final View val$bottom;
						final View val$top;

			
			{
				this$0 = AlertController.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #20  <Field AlertController this$0>
				top = view;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #22  <Field View val$top>
				bottom = view1;
			//    6   10:aload_0         
			//    7   11:aload_3         
			//    8   12:putfield        #24  <Field View val$bottom>
				super();
			//    9   15:aload_0         
			//   10   16:invokespecial   #27  <Method void Object()>
			//   11   19:return          
			}
					}
);
	//   65  131:aload_0         
	//   66  132:getfield        #297 <Field NestedScrollView mScrollView>
	//   67  135:new             #8   <Class AlertController$2>
	//   68  138:dup             
	//   69  139:aload_0         
	//   70  140:aload_2         
	//   71  141:aload           5
	//   72  143:invokespecial   #300 <Method void AlertController$2(AlertController, View, View)>
	//   73  146:invokevirtual   #306 <Method void NestedScrollView.setOnScrollChangeListener(android.support.v4.widget.NestedScrollView$OnScrollChangeListener)>
					mScrollView.post(new Runnable() {

						public void run()
						{
							AlertController.manageScrollIndicators(((View) (mScrollView)), top, bottom);
						//    0    0:aload_0         
						//    1    1:getfield        #20  <Field AlertController this$0>
						//    2    4:getfield        #33  <Field NestedScrollView AlertController.mScrollView>
						//    3    7:aload_0         
						//    4    8:getfield        #22  <Field View val$top>
						//    5   11:aload_0         
						//    6   12:getfield        #24  <Field View val$bottom>
						//    7   15:invokestatic    #37  <Method void AlertController.manageScrollIndicators(View, View, View)>
						//    8   18:return          
						}

						final AlertController this$0;
						final View val$bottom;
						final View val$top;

			
			{
				this$0 = AlertController.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #20  <Field AlertController this$0>
				top = view;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #22  <Field View val$top>
				bottom = view1;
			//    6   10:aload_0         
			//    7   11:aload_3         
			//    8   12:putfield        #24  <Field View val$bottom>
				super();
			//    9   15:aload_0         
			//   10   16:invokespecial   #27  <Method void Object()>
			//   11   19:return          
			}
					}
);
	//   74  149:aload_0         
	//   75  150:getfield        #297 <Field NestedScrollView mScrollView>
	//   76  153:new             #10  <Class AlertController$3>
	//   77  156:dup             
	//   78  157:aload_0         
	//   79  158:aload_2         
	//   80  159:aload           5
	//   81  161:invokespecial   #307 <Method void AlertController$3(AlertController, View, View)>
	//   82  164:invokevirtual   #311 <Method boolean NestedScrollView.post(Runnable)>
	//   83  167:pop             
					return;
	//   84  168:return          
				}
				if(mListView != null)
	//*  85  169:aload_0         
	//*  86  170:getfield        #313 <Field ListView mListView>
	//*  87  173:ifnull          214
				{
					mListView.setOnScrollListener(new android.widget.AbsListView.OnScrollListener() {

						public void onScroll(AbsListView abslistview, int k, int l, int i1)
						{
							AlertController.manageScrollIndicators(((View) (abslistview)), top, bottom);
						//    0    0:aload_1         
						//    1    1:aload_0         
						//    2    2:getfield        #22  <Field View val$top>
						//    3    5:aload_0         
						//    4    6:getfield        #24  <Field View val$bottom>
						//    5    9:invokestatic    #34  <Method void AlertController.manageScrollIndicators(View, View, View)>
						//    6   12:return          
						}

						public void onScrollStateChanged(AbsListView abslistview, int k)
						{
						//    0    0:return          
						}

						final AlertController this$0;
						final View val$bottom;
						final View val$top;

			
			{
				this$0 = AlertController.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #20  <Field AlertController this$0>
				top = view;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #22  <Field View val$top>
				bottom = view1;
			//    6   10:aload_0         
			//    7   11:aload_3         
			//    8   12:putfield        #24  <Field View val$bottom>
				super();
			//    9   15:aload_0         
			//   10   16:invokespecial   #27  <Method void Object()>
			//   11   19:return          
			}
					}
);
	//   88  176:aload_0         
	//   89  177:getfield        #313 <Field ListView mListView>
	//   90  180:new             #12  <Class AlertController$4>
	//   91  183:dup             
	//   92  184:aload_0         
	//   93  185:aload_2         
	//   94  186:aload           5
	//   95  188:invokespecial   #314 <Method void AlertController$4(AlertController, View, View)>
	//   96  191:invokevirtual   #320 <Method void ListView.setOnScrollListener(android.widget.AbsListView$OnScrollListener)>
					mListView.post(new Runnable() {

						public void run()
						{
							AlertController.manageScrollIndicators(((View) (mListView)), top, bottom);
						//    0    0:aload_0         
						//    1    1:getfield        #20  <Field AlertController this$0>
						//    2    4:getfield        #33  <Field ListView AlertController.mListView>
						//    3    7:aload_0         
						//    4    8:getfield        #22  <Field View val$top>
						//    5   11:aload_0         
						//    6   12:getfield        #24  <Field View val$bottom>
						//    7   15:invokestatic    #37  <Method void AlertController.manageScrollIndicators(View, View, View)>
						//    8   18:return          
						}

						final AlertController this$0;
						final View val$bottom;
						final View val$top;

			
			{
				this$0 = AlertController.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #20  <Field AlertController this$0>
				top = view;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #22  <Field View val$top>
				bottom = view1;
			//    6   10:aload_0         
			//    7   11:aload_3         
			//    8   12:putfield        #24  <Field View val$bottom>
				super();
			//    9   15:aload_0         
			//   10   16:invokespecial   #27  <Method void Object()>
			//   11   19:return          
			}
					}
);
	//   97  194:aload_0         
	//   98  195:getfield        #313 <Field ListView mListView>
	//   99  198:new             #14  <Class AlertController$5>
	//  100  201:dup             
	//  101  202:aload_0         
	//  102  203:aload_2         
	//  103  204:aload           5
	//  104  206:invokespecial   #321 <Method void AlertController$5(AlertController, View, View)>
	//  105  209:invokevirtual   #322 <Method boolean ListView.post(Runnable)>
	//  106  212:pop             
					return;
	//  107  213:return          
				}
				if(top != null)
	//* 108  214:aload_2         
	//* 109  215:ifnull          223
					viewgroup.removeView(top);
	//  110  218:aload_1         
	//  111  219:aload_2         
	//  112  220:invokevirtual   #267 <Method void ViewGroup.removeView(View)>
				if(bottom != null)
	//* 113  223:aload           5
	//* 114  225:ifnull          234
					viewgroup.removeView(bottom);
	//  115  228:aload_1         
	//  116  229:aload           5
	//  117  231:invokevirtual   #267 <Method void ViewGroup.removeView(View)>
			}
		}
	//  118  234:return          
	}

	private void setupButtons(ViewGroup viewgroup)
	{
		int i = 0;
	//    0    0:iconst_0        
	//    1    1:istore_2        
		mButtonPositive = (Button)viewgroup.findViewById(0x1020019);
	//    2    2:aload_0         
	//    3    3:aload_1         
	//    4    4:ldc2            #325 <Int 0x1020019>
	//    5    7:invokevirtual   #326 <Method View ViewGroup.findViewById(int)>
	//    6   10:checkcast       #220 <Class Button>
	//    7   13:putfield        #328 <Field Button mButtonPositive>
		mButtonPositive.setOnClickListener(mButtonHandler);
	//    8   16:aload_0         
	//    9   17:getfield        #328 <Field Button mButtonPositive>
	//   10   20:aload_0         
	//   11   21:getfield        #113 <Field android.view.View$OnClickListener mButtonHandler>
	//   12   24:invokevirtual   #332 <Method void Button.setOnClickListener(android.view.View$OnClickListener)>
		if(TextUtils.isEmpty(mButtonPositiveText))
	//*  13   27:aload_0         
	//*  14   28:getfield        #334 <Field CharSequence mButtonPositiveText>
	//*  15   31:invokestatic    #340 <Method boolean TextUtils.isEmpty(CharSequence)>
	//*  16   34:ifeq            49
		{
			mButtonPositive.setVisibility(8);
	//   17   37:aload_0         
	//   18   38:getfield        #328 <Field Button mButtonPositive>
	//   19   41:bipush          8
	//   20   43:invokevirtual   #341 <Method void Button.setVisibility(int)>
		} else
	//*  21   46:goto            70
		{
			mButtonPositive.setText(mButtonPositiveText);
	//   22   49:aload_0         
	//   23   50:getfield        #328 <Field Button mButtonPositive>
	//   24   53:aload_0         
	//   25   54:getfield        #334 <Field CharSequence mButtonPositiveText>
	//   26   57:invokevirtual   #345 <Method void Button.setText(CharSequence)>
			mButtonPositive.setVisibility(0);
	//   27   60:aload_0         
	//   28   61:getfield        #328 <Field Button mButtonPositive>
	//   29   64:iconst_0        
	//   30   65:invokevirtual   #341 <Method void Button.setVisibility(int)>
			i = 1;
	//   31   68:iconst_1        
	//   32   69:istore_2        
		}
		mButtonNegative = (Button)viewgroup.findViewById(0x102001a);
	//   33   70:aload_0         
	//   34   71:aload_1         
	//   35   72:ldc2            #346 <Int 0x102001a>
	//   36   75:invokevirtual   #326 <Method View ViewGroup.findViewById(int)>
	//   37   78:checkcast       #220 <Class Button>
	//   38   81:putfield        #348 <Field Button mButtonNegative>
		mButtonNegative.setOnClickListener(mButtonHandler);
	//   39   84:aload_0         
	//   40   85:getfield        #348 <Field Button mButtonNegative>
	//   41   88:aload_0         
	//   42   89:getfield        #113 <Field android.view.View$OnClickListener mButtonHandler>
	//   43   92:invokevirtual   #332 <Method void Button.setOnClickListener(android.view.View$OnClickListener)>
		if(TextUtils.isEmpty(mButtonNegativeText))
	//*  44   95:aload_0         
	//*  45   96:getfield        #350 <Field CharSequence mButtonNegativeText>
	//*  46   99:invokestatic    #340 <Method boolean TextUtils.isEmpty(CharSequence)>
	//*  47  102:ifeq            117
		{
			mButtonNegative.setVisibility(8);
	//   48  105:aload_0         
	//   49  106:getfield        #348 <Field Button mButtonNegative>
	//   50  109:bipush          8
	//   51  111:invokevirtual   #341 <Method void Button.setVisibility(int)>
		} else
	//*  52  114:goto            140
		{
			mButtonNegative.setText(mButtonNegativeText);
	//   53  117:aload_0         
	//   54  118:getfield        #348 <Field Button mButtonNegative>
	//   55  121:aload_0         
	//   56  122:getfield        #350 <Field CharSequence mButtonNegativeText>
	//   57  125:invokevirtual   #345 <Method void Button.setText(CharSequence)>
			mButtonNegative.setVisibility(0);
	//   58  128:aload_0         
	//   59  129:getfield        #348 <Field Button mButtonNegative>
	//   60  132:iconst_0        
	//   61  133:invokevirtual   #341 <Method void Button.setVisibility(int)>
			i |= 2;
	//   62  136:iload_2         
	//   63  137:iconst_2        
	//   64  138:ior             
	//   65  139:istore_2        
		}
		mButtonNeutral = (Button)viewgroup.findViewById(0x102001b);
	//   66  140:aload_0         
	//   67  141:aload_1         
	//   68  142:ldc2            #351 <Int 0x102001b>
	//   69  145:invokevirtual   #326 <Method View ViewGroup.findViewById(int)>
	//   70  148:checkcast       #220 <Class Button>
	//   71  151:putfield        #353 <Field Button mButtonNeutral>
		mButtonNeutral.setOnClickListener(mButtonHandler);
	//   72  154:aload_0         
	//   73  155:getfield        #353 <Field Button mButtonNeutral>
	//   74  158:aload_0         
	//   75  159:getfield        #113 <Field android.view.View$OnClickListener mButtonHandler>
	//   76  162:invokevirtual   #332 <Method void Button.setOnClickListener(android.view.View$OnClickListener)>
		if(TextUtils.isEmpty(mButtonNeutralText))
	//*  77  165:aload_0         
	//*  78  166:getfield        #355 <Field CharSequence mButtonNeutralText>
	//*  79  169:invokestatic    #340 <Method boolean TextUtils.isEmpty(CharSequence)>
	//*  80  172:ifeq            187
		{
			mButtonNeutral.setVisibility(8);
	//   81  175:aload_0         
	//   82  176:getfield        #353 <Field Button mButtonNeutral>
	//   83  179:bipush          8
	//   84  181:invokevirtual   #341 <Method void Button.setVisibility(int)>
		} else
	//*  85  184:goto            210
		{
			mButtonNeutral.setText(mButtonNeutralText);
	//   86  187:aload_0         
	//   87  188:getfield        #353 <Field Button mButtonNeutral>
	//   88  191:aload_0         
	//   89  192:getfield        #355 <Field CharSequence mButtonNeutralText>
	//   90  195:invokevirtual   #345 <Method void Button.setText(CharSequence)>
			mButtonNeutral.setVisibility(0);
	//   91  198:aload_0         
	//   92  199:getfield        #353 <Field Button mButtonNeutral>
	//   93  202:iconst_0        
	//   94  203:invokevirtual   #341 <Method void Button.setVisibility(int)>
			i |= 4;
	//   95  206:iload_2         
	//   96  207:iconst_4        
	//   97  208:ior             
	//   98  209:istore_2        
		}
		if(shouldCenterSingleButton(mContext))
	//*  99  210:aload_0         
	//* 100  211:getfield        #115 <Field Context mContext>
	//* 101  214:invokestatic    #359 <Method boolean shouldCenterSingleButton(Context)>
	//* 102  217:ifeq            265
			if(i == 1)
	//* 103  220:iload_2         
	//* 104  221:iconst_1        
	//* 105  222:icmpne          236
				centerButton(mButtonPositive);
	//  106  225:aload_0         
	//  107  226:aload_0         
	//  108  227:getfield        #328 <Field Button mButtonPositive>
	//  109  230:invokespecial   #361 <Method void centerButton(Button)>
			else
	//* 110  233:goto            265
			if(i == 2)
	//* 111  236:iload_2         
	//* 112  237:iconst_2        
	//* 113  238:icmpne          252
				centerButton(mButtonNegative);
	//  114  241:aload_0         
	//  115  242:aload_0         
	//  116  243:getfield        #348 <Field Button mButtonNegative>
	//  117  246:invokespecial   #361 <Method void centerButton(Button)>
			else
	//* 118  249:goto            265
			if(i == 4)
	//* 119  252:iload_2         
	//* 120  253:iconst_4        
	//* 121  254:icmpne          265
				centerButton(mButtonNeutral);
	//  122  257:aload_0         
	//  123  258:aload_0         
	//  124  259:getfield        #353 <Field Button mButtonNeutral>
	//  125  262:invokespecial   #361 <Method void centerButton(Button)>
		boolean flag;
		if(i != 0)
	//* 126  265:iload_2         
	//* 127  266:ifeq            274
			flag = true;
	//  128  269:iconst_1        
	//  129  270:istore_2        
		else
	//* 130  271:goto            276
			flag = false;
	//  131  274:iconst_0        
	//  132  275:istore_2        
		if(!flag)
	//* 133  276:iload_2         
	//* 134  277:ifne            286
			viewgroup.setVisibility(8);
	//  135  280:aload_1         
	//  136  281:bipush          8
	//  137  283:invokevirtual   #362 <Method void ViewGroup.setVisibility(int)>
	//  138  286:return          
	}

	private void setupContent(ViewGroup viewgroup)
	{
		mScrollView = (NestedScrollView)mWindow.findViewById(android.support.v7.appcompat.R.id.scrollView);
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #119 <Field Window mWindow>
	//    3    5:getstatic       #366 <Field int android.support.v7.appcompat.R$id.scrollView>
	//    4    8:invokevirtual   #282 <Method View Window.findViewById(int)>
	//    5   11:checkcast       #302 <Class NestedScrollView>
	//    6   14:putfield        #297 <Field NestedScrollView mScrollView>
		mScrollView.setFocusable(false);
	//    7   17:aload_0         
	//    8   18:getfield        #297 <Field NestedScrollView mScrollView>
	//    9   21:iconst_0        
	//   10   22:invokevirtual   #370 <Method void NestedScrollView.setFocusable(boolean)>
		mScrollView.setNestedScrollingEnabled(false);
	//   11   25:aload_0         
	//   12   26:getfield        #297 <Field NestedScrollView mScrollView>
	//   13   29:iconst_0        
	//   14   30:invokevirtual   #373 <Method void NestedScrollView.setNestedScrollingEnabled(boolean)>
		mMessageView = (TextView)viewgroup.findViewById(0x102000b);
	//   15   33:aload_0         
	//   16   34:aload_1         
	//   17   35:ldc2            #374 <Int 0x102000b>
	//   18   38:invokevirtual   #326 <Method View ViewGroup.findViewById(int)>
	//   19   41:checkcast       #376 <Class TextView>
	//   20   44:putfield        #378 <Field TextView mMessageView>
		if(mMessageView == null)
	//*  21   47:aload_0         
	//*  22   48:getfield        #378 <Field TextView mMessageView>
	//*  23   51:ifnonnull       55
			return;
	//   24   54:return          
		if(mMessage != null)
	//*  25   55:aload_0         
	//*  26   56:getfield        #295 <Field CharSequence mMessage>
	//*  27   59:ifnull          74
		{
			mMessageView.setText(mMessage);
	//   28   62:aload_0         
	//   29   63:getfield        #378 <Field TextView mMessageView>
	//   30   66:aload_0         
	//   31   67:getfield        #295 <Field CharSequence mMessage>
	//   32   70:invokevirtual   #379 <Method void TextView.setText(CharSequence)>
			return;
	//   33   73:return          
		}
		mMessageView.setVisibility(8);
	//   34   74:aload_0         
	//   35   75:getfield        #378 <Field TextView mMessageView>
	//   36   78:bipush          8
	//   37   80:invokevirtual   #380 <Method void TextView.setVisibility(int)>
		mScrollView.removeView(((View) (mMessageView)));
	//   38   83:aload_0         
	//   39   84:getfield        #297 <Field NestedScrollView mScrollView>
	//   40   87:aload_0         
	//   41   88:getfield        #378 <Field TextView mMessageView>
	//   42   91:invokevirtual   #381 <Method void NestedScrollView.removeView(View)>
		if(mListView != null)
	//*  43   94:aload_0         
	//*  44   95:getfield        #313 <Field ListView mListView>
	//*  45   98:ifnull          145
		{
			viewgroup = (ViewGroup)mScrollView.getParent();
	//   46  101:aload_0         
	//   47  102:getfield        #297 <Field NestedScrollView mScrollView>
	//   48  105:invokevirtual   #382 <Method android.view.ViewParent NestedScrollView.getParent()>
	//   49  108:checkcast       #206 <Class ViewGroup>
	//   50  111:astore_1        
			int i = viewgroup.indexOfChild(((View) (mScrollView)));
	//   51  112:aload_1         
	//   52  113:aload_0         
	//   53  114:getfield        #297 <Field NestedScrollView mScrollView>
	//   54  117:invokevirtual   #386 <Method int ViewGroup.indexOfChild(View)>
	//   55  120:istore_2        
			viewgroup.removeViewAt(i);
	//   56  121:aload_1         
	//   57  122:iload_2         
	//   58  123:invokevirtual   #389 <Method void ViewGroup.removeViewAt(int)>
			viewgroup.addView(((View) (mListView)), i, new android.view.ViewGroup.LayoutParams(-1, -1));
	//   59  126:aload_1         
	//   60  127:aload_0         
	//   61  128:getfield        #313 <Field ListView mListView>
	//   62  131:iload_2         
	//   63  132:new             #391 <Class android.view.ViewGroup$LayoutParams>
	//   64  135:dup             
	//   65  136:iconst_m1       
	//   66  137:iconst_m1       
	//   67  138:invokespecial   #394 <Method void android.view.ViewGroup$LayoutParams(int, int)>
	//   68  141:invokevirtual   #398 <Method void ViewGroup.addView(View, int, android.view.ViewGroup$LayoutParams)>
			return;
	//   69  144:return          
		} else
		{
			viewgroup.setVisibility(8);
	//   70  145:aload_1         
	//   71  146:bipush          8
	//   72  148:invokevirtual   #362 <Method void ViewGroup.setVisibility(int)>
			return;
	//   73  151:return          
		}
	}

	private void setupCustomContent(ViewGroup viewgroup)
	{
		View view;
		if(mView != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #401 <Field View mView>
	//*   2    4:ifnull          15
			view = mView;
	//    3    7:aload_0         
	//    4    8:getfield        #401 <Field View mView>
	//    5   11:astore_3        
		else
	//*   6   12:goto            44
		if(mViewLayoutResId != 0)
	//*   7   15:aload_0         
	//*   8   16:getfield        #403 <Field int mViewLayoutResId>
	//*   9   19:ifeq            42
			view = LayoutInflater.from(mContext).inflate(mViewLayoutResId, viewgroup, false);
	//   10   22:aload_0         
	//   11   23:getfield        #115 <Field Context mContext>
	//   12   26:invokestatic    #409 <Method LayoutInflater LayoutInflater.from(Context)>
	//   13   29:aload_0         
	//   14   30:getfield        #403 <Field int mViewLayoutResId>
	//   15   33:aload_1         
	//   16   34:iconst_0        
	//   17   35:invokevirtual   #412 <Method View LayoutInflater.inflate(int, ViewGroup, boolean)>
	//   18   38:astore_3        
		else
	//*  19   39:goto            44
			view = null;
	//   20   42:aconst_null     
	//   21   43:astore_3        
		boolean flag;
		if(view != null)
	//*  22   44:aload_3         
	//*  23   45:ifnull          53
			flag = true;
	//   24   48:iconst_1        
	//   25   49:istore_2        
		else
	//*  26   50:goto            55
			flag = false;
	//   27   53:iconst_0        
	//   28   54:istore_2        
		if(!flag || !canTextInput(view))
	//*  29   55:iload_2         
	//*  30   56:ifeq            66
	//*  31   59:aload_3         
	//*  32   60:invokestatic    #216 <Method boolean canTextInput(View)>
	//*  33   63:ifne            79
			mWindow.setFlags(0x20000, 0x20000);
	//   34   66:aload_0         
	//   35   67:getfield        #119 <Field Window mWindow>
	//   36   70:ldc2            #413 <Int 0x20000>
	//   37   73:ldc2            #413 <Int 0x20000>
	//   38   76:invokevirtual   #416 <Method void Window.setFlags(int, int)>
		if(flag)
	//*  39   79:iload_2         
	//*  40   80:ifeq            160
		{
			FrameLayout framelayout = (FrameLayout)mWindow.findViewById(android.support.v7.appcompat.R.id.custom);
	//   41   83:aload_0         
	//   42   84:getfield        #119 <Field Window mWindow>
	//   43   87:getstatic       #419 <Field int android.support.v7.appcompat.R$id.custom>
	//   44   90:invokevirtual   #282 <Method View Window.findViewById(int)>
	//   45   93:checkcast       #421 <Class FrameLayout>
	//   46   96:astore          4
			framelayout.addView(view, new android.view.ViewGroup.LayoutParams(-1, -1));
	//   47   98:aload           4
	//   48  100:aload_3         
	//   49  101:new             #391 <Class android.view.ViewGroup$LayoutParams>
	//   50  104:dup             
	//   51  105:iconst_m1       
	//   52  106:iconst_m1       
	//   53  107:invokespecial   #394 <Method void android.view.ViewGroup$LayoutParams(int, int)>
	//   54  110:invokevirtual   #424 <Method void FrameLayout.addView(View, android.view.ViewGroup$LayoutParams)>
			if(mViewSpacingSpecified)
	//*  55  113:aload_0         
	//*  56  114:getfield        #102 <Field boolean mViewSpacingSpecified>
	//*  57  117:ifeq            141
				framelayout.setPadding(mViewSpacingLeft, mViewSpacingTop, mViewSpacingRight, mViewSpacingBottom);
	//   58  120:aload           4
	//   59  122:aload_0         
	//   60  123:getfield        #426 <Field int mViewSpacingLeft>
	//   61  126:aload_0         
	//   62  127:getfield        #428 <Field int mViewSpacingTop>
	//   63  130:aload_0         
	//   64  131:getfield        #430 <Field int mViewSpacingRight>
	//   65  134:aload_0         
	//   66  135:getfield        #432 <Field int mViewSpacingBottom>
	//   67  138:invokevirtual   #436 <Method void FrameLayout.setPadding(int, int, int, int)>
			if(mListView != null)
	//*  68  141:aload_0         
	//*  69  142:getfield        #313 <Field ListView mListView>
	//*  70  145:ifnull          159
				((android.widget.LinearLayout.LayoutParams)viewgroup.getLayoutParams()).weight = 0.0F;
	//   71  148:aload_1         
	//   72  149:invokevirtual   #437 <Method android.view.ViewGroup$LayoutParams ViewGroup.getLayoutParams()>
	//   73  152:checkcast       #226 <Class android.widget.LinearLayout$LayoutParams>
	//   74  155:fconst_0        
	//   75  156:putfield        #234 <Field float android.widget.LinearLayout$LayoutParams.weight>
			return;
	//   76  159:return          
		} else
		{
			viewgroup.setVisibility(8);
	//   77  160:aload_1         
	//   78  161:bipush          8
	//   79  163:invokevirtual   #362 <Method void ViewGroup.setVisibility(int)>
			return;
	//   80  166:return          
		}
	}

	private void setupTitle(ViewGroup viewgroup)
	{
		if(mCustomTitleView != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #440 <Field View mCustomTitleView>
	//*   2    4:ifnull          44
		{
			android.view.ViewGroup.LayoutParams layoutparams = new android.view.ViewGroup.LayoutParams(-1, -2);
	//    3    7:new             #391 <Class android.view.ViewGroup$LayoutParams>
	//    4   10:dup             
	//    5   11:iconst_m1       
	//    6   12:bipush          -2
	//    7   14:invokespecial   #394 <Method void android.view.ViewGroup$LayoutParams(int, int)>
	//    8   17:astore_3        
			viewgroup.addView(mCustomTitleView, 0, layoutparams);
	//    9   18:aload_1         
	//   10   19:aload_0         
	//   11   20:getfield        #440 <Field View mCustomTitleView>
	//   12   23:iconst_0        
	//   13   24:aload_3         
	//   14   25:invokevirtual   #398 <Method void ViewGroup.addView(View, int, android.view.ViewGroup$LayoutParams)>
			mWindow.findViewById(android.support.v7.appcompat.R.id.title_template).setVisibility(8);
	//   15   28:aload_0         
	//   16   29:getfield        #119 <Field Window mWindow>
	//   17   32:getstatic       #443 <Field int android.support.v7.appcompat.R$id.title_template>
	//   18   35:invokevirtual   #282 <Method View Window.findViewById(int)>
	//   19   38:bipush          8
	//   20   40:invokevirtual   #250 <Method void View.setVisibility(int)>
			return;
	//   21   43:return          
		}
		mIconView = (ImageView)mWindow.findViewById(0x1020006);
	//   22   44:aload_0         
	//   23   45:aload_0         
	//   24   46:getfield        #119 <Field Window mWindow>
	//   25   49:ldc2            #444 <Int 0x1020006>
	//   26   52:invokevirtual   #282 <Method View Window.findViewById(int)>
	//   27   55:checkcast       #446 <Class ImageView>
	//   28   58:putfield        #448 <Field ImageView mIconView>
		boolean flag;
		if(!TextUtils.isEmpty(mTitle))
	//*  29   61:aload_0         
	//*  30   62:getfield        #450 <Field CharSequence mTitle>
	//*  31   65:invokestatic    #340 <Method boolean TextUtils.isEmpty(CharSequence)>
	//*  32   68:ifne            76
			flag = true;
	//   33   71:iconst_1        
	//   34   72:istore_2        
		else
	//*  35   73:goto            78
			flag = false;
	//   36   76:iconst_0        
	//   37   77:istore_2        
		if(flag && mShowTitle)
	//*  38   78:iload_2         
	//*  39   79:ifeq            200
	//*  40   82:aload_0         
	//*  41   83:getfield        #186 <Field boolean mShowTitle>
	//*  42   86:ifeq            200
		{
			mTitleView = (TextView)mWindow.findViewById(android.support.v7.appcompat.R.id.alertTitle);
	//   43   89:aload_0         
	//   44   90:aload_0         
	//   45   91:getfield        #119 <Field Window mWindow>
	//   46   94:getstatic       #453 <Field int android.support.v7.appcompat.R$id.alertTitle>
	//   47   97:invokevirtual   #282 <Method View Window.findViewById(int)>
	//   48  100:checkcast       #376 <Class TextView>
	//   49  103:putfield        #455 <Field TextView mTitleView>
			mTitleView.setText(mTitle);
	//   50  106:aload_0         
	//   51  107:getfield        #455 <Field TextView mTitleView>
	//   52  110:aload_0         
	//   53  111:getfield        #450 <Field CharSequence mTitle>
	//   54  114:invokevirtual   #379 <Method void TextView.setText(CharSequence)>
			if(mIconId != 0)
	//*  55  117:aload_0         
	//*  56  118:getfield        #104 <Field int mIconId>
	//*  57  121:ifeq            136
			{
				mIconView.setImageResource(mIconId);
	//   58  124:aload_0         
	//   59  125:getfield        #448 <Field ImageView mIconView>
	//   60  128:aload_0         
	//   61  129:getfield        #104 <Field int mIconId>
	//   62  132:invokevirtual   #458 <Method void ImageView.setImageResource(int)>
				return;
	//   63  135:return          
			}
			if(mIcon != null)
	//*  64  136:aload_0         
	//*  65  137:getfield        #460 <Field Drawable mIcon>
	//*  66  140:ifnull          155
			{
				mIconView.setImageDrawable(mIcon);
	//   67  143:aload_0         
	//   68  144:getfield        #448 <Field ImageView mIconView>
	//   69  147:aload_0         
	//   70  148:getfield        #460 <Field Drawable mIcon>
	//   71  151:invokevirtual   #464 <Method void ImageView.setImageDrawable(Drawable)>
				return;
	//   72  154:return          
			} else
			{
				mTitleView.setPadding(mIconView.getPaddingLeft(), mIconView.getPaddingTop(), mIconView.getPaddingRight(), mIconView.getPaddingBottom());
	//   73  155:aload_0         
	//   74  156:getfield        #455 <Field TextView mTitleView>
	//   75  159:aload_0         
	//   76  160:getfield        #448 <Field ImageView mIconView>
	//   77  163:invokevirtual   #467 <Method int ImageView.getPaddingLeft()>
	//   78  166:aload_0         
	//   79  167:getfield        #448 <Field ImageView mIconView>
	//   80  170:invokevirtual   #470 <Method int ImageView.getPaddingTop()>
	//   81  173:aload_0         
	//   82  174:getfield        #448 <Field ImageView mIconView>
	//   83  177:invokevirtual   #473 <Method int ImageView.getPaddingRight()>
	//   84  180:aload_0         
	//   85  181:getfield        #448 <Field ImageView mIconView>
	//   86  184:invokevirtual   #476 <Method int ImageView.getPaddingBottom()>
	//   87  187:invokevirtual   #477 <Method void TextView.setPadding(int, int, int, int)>
				mIconView.setVisibility(8);
	//   88  190:aload_0         
	//   89  191:getfield        #448 <Field ImageView mIconView>
	//   90  194:bipush          8
	//   91  196:invokevirtual   #478 <Method void ImageView.setVisibility(int)>
				return;
	//   92  199:return          
			}
		} else
		{
			mWindow.findViewById(android.support.v7.appcompat.R.id.title_template).setVisibility(8);
	//   93  200:aload_0         
	//   94  201:getfield        #119 <Field Window mWindow>
	//   95  204:getstatic       #443 <Field int android.support.v7.appcompat.R$id.title_template>
	//   96  207:invokevirtual   #282 <Method View Window.findViewById(int)>
	//   97  210:bipush          8
	//   98  212:invokevirtual   #250 <Method void View.setVisibility(int)>
			mIconView.setVisibility(8);
	//   99  215:aload_0         
	//  100  216:getfield        #448 <Field ImageView mIconView>
	//  101  219:bipush          8
	//  102  221:invokevirtual   #478 <Method void ImageView.setVisibility(int)>
			viewgroup.setVisibility(8);
	//  103  224:aload_1         
	//  104  225:bipush          8
	//  105  227:invokevirtual   #362 <Method void ViewGroup.setVisibility(int)>
			return;
	//  106  230:return          
		}
	}

	private void setupView()
	{
		boolean flag;
		boolean flag2;
		boolean flag3;
		Object obj3;
label0:
		{
label1:
			{
				Object obj;
label2:
				{
					Object obj2 = ((Object) (mWindow.findViewById(android.support.v7.appcompat.R.id.parentPanel)));
	//    0    0:aload_0         
	//    1    1:getfield        #119 <Field Window mWindow>
	//    2    4:getstatic       #482 <Field int android.support.v7.appcompat.R$id.parentPanel>
	//    3    7:invokevirtual   #282 <Method View Window.findViewById(int)>
	//    4   10:astore          6
					Object obj4 = ((Object) (((View) (obj2)).findViewById(android.support.v7.appcompat.R.id.topPanel)));
	//    5   12:aload           6
	//    6   14:getstatic       #485 <Field int android.support.v7.appcompat.R$id.topPanel>
	//    7   17:invokevirtual   #486 <Method View View.findViewById(int)>
	//    8   20:astore          8
					obj3 = ((Object) (((View) (obj2)).findViewById(android.support.v7.appcompat.R.id.contentPanel)));
	//    9   22:aload           6
	//   10   24:getstatic       #489 <Field int android.support.v7.appcompat.R$id.contentPanel>
	//   11   27:invokevirtual   #486 <Method View View.findViewById(int)>
	//   12   30:astore          7
					obj = ((Object) (((View) (obj2)).findViewById(android.support.v7.appcompat.R.id.buttonPanel)));
	//   13   32:aload           6
	//   14   34:getstatic       #492 <Field int android.support.v7.appcompat.R$id.buttonPanel>
	//   15   37:invokevirtual   #486 <Method View View.findViewById(int)>
	//   16   40:astore          5
					obj2 = ((Object) ((ViewGroup)((View) (obj2)).findViewById(android.support.v7.appcompat.R.id.customPanel)));
	//   17   42:aload           6
	//   18   44:getstatic       #495 <Field int android.support.v7.appcompat.R$id.customPanel>
	//   19   47:invokevirtual   #486 <Method View View.findViewById(int)>
	//   20   50:checkcast       #206 <Class ViewGroup>
	//   21   53:astore          6
					setupCustomContent(((ViewGroup) (obj2)));
	//   22   55:aload_0         
	//   23   56:aload           6
	//   24   58:invokespecial   #497 <Method void setupCustomContent(ViewGroup)>
					View view3 = ((ViewGroup) (obj2)).findViewById(android.support.v7.appcompat.R.id.topPanel);
	//   25   61:aload           6
	//   26   63:getstatic       #485 <Field int android.support.v7.appcompat.R$id.topPanel>
	//   27   66:invokevirtual   #326 <Method View ViewGroup.findViewById(int)>
	//   28   69:astore          11
					View view2 = ((ViewGroup) (obj2)).findViewById(android.support.v7.appcompat.R.id.contentPanel);
	//   29   71:aload           6
	//   30   73:getstatic       #489 <Field int android.support.v7.appcompat.R$id.contentPanel>
	//   31   76:invokevirtual   #326 <Method View ViewGroup.findViewById(int)>
	//   32   79:astore          10
					View view1 = ((ViewGroup) (obj2)).findViewById(android.support.v7.appcompat.R.id.buttonPanel);
	//   33   81:aload           6
	//   34   83:getstatic       #492 <Field int android.support.v7.appcompat.R$id.buttonPanel>
	//   35   86:invokevirtual   #326 <Method View ViewGroup.findViewById(int)>
	//   36   89:astore          9
					obj4 = ((Object) (resolvePanel(view3, ((View) (obj4)))));
	//   37   91:aload_0         
	//   38   92:aload           11
	//   39   94:aload           8
	//   40   96:invokespecial   #499 <Method ViewGroup resolvePanel(View, View)>
	//   41   99:astore          8
					obj3 = ((Object) (resolvePanel(view2, ((View) (obj3)))));
	//   42  101:aload_0         
	//   43  102:aload           10
	//   44  104:aload           7
	//   45  106:invokespecial   #499 <Method ViewGroup resolvePanel(View, View)>
	//   46  109:astore          7
					obj = ((Object) (resolvePanel(view1, ((View) (obj)))));
	//   47  111:aload_0         
	//   48  112:aload           9
	//   49  114:aload           5
	//   50  116:invokespecial   #499 <Method ViewGroup resolvePanel(View, View)>
	//   51  119:astore          5
					setupContent(((ViewGroup) (obj3)));
	//   52  121:aload_0         
	//   53  122:aload           7
	//   54  124:invokespecial   #501 <Method void setupContent(ViewGroup)>
					setupButtons(((ViewGroup) (obj)));
	//   55  127:aload_0         
	//   56  128:aload           5
	//   57  130:invokespecial   #503 <Method void setupButtons(ViewGroup)>
					setupTitle(((ViewGroup) (obj4)));
	//   58  133:aload_0         
	//   59  134:aload           8
	//   60  136:invokespecial   #505 <Method void setupTitle(ViewGroup)>
					if(obj2 != null && ((ViewGroup) (obj2)).getVisibility() != 8)
	//*  61  139:aload           6
	//*  62  141:ifnull          159
	//*  63  144:aload           6
	//*  64  146:invokevirtual   #508 <Method int ViewGroup.getVisibility()>
	//*  65  149:bipush          8
	//*  66  151:icmpeq          159
						flag = true;
	//   67  154:iconst_1        
	//   68  155:istore_1        
					else
	//*  69  156:goto            161
						flag = false;
	//   70  159:iconst_0        
	//   71  160:istore_1        
					if(obj4 != null && ((ViewGroup) (obj4)).getVisibility() != 8)
	//*  72  161:aload           8
	//*  73  163:ifnull          181
	//*  74  166:aload           8
	//*  75  168:invokevirtual   #508 <Method int ViewGroup.getVisibility()>
	//*  76  171:bipush          8
	//*  77  173:icmpeq          181
						flag2 = true;
	//   78  176:iconst_1        
	//   79  177:istore_3        
					else
	//*  80  178:goto            183
						flag2 = false;
	//   81  181:iconst_0        
	//   82  182:istore_3        
					if(obj != null && ((ViewGroup) (obj)).getVisibility() != 8)
	//*  83  183:aload           5
	//*  84  185:ifnull          204
	//*  85  188:aload           5
	//*  86  190:invokevirtual   #508 <Method int ViewGroup.getVisibility()>
	//*  87  193:bipush          8
	//*  88  195:icmpeq          204
						flag3 = true;
	//   89  198:iconst_1        
	//   90  199:istore          4
					else
	//*  91  201:goto            207
						flag3 = false;
	//   92  204:iconst_0        
	//   93  205:istore          4
					if(!flag3 && obj3 != null)
	//*  94  207:iload           4
	//*  95  209:ifne            238
	//*  96  212:aload           7
	//*  97  214:ifnull          238
					{
						obj = ((Object) (((ViewGroup) (obj3)).findViewById(android.support.v7.appcompat.R.id.textSpacerNoButtons)));
	//   98  217:aload           7
	//   99  219:getstatic       #511 <Field int android.support.v7.appcompat.R$id.textSpacerNoButtons>
	//  100  222:invokevirtual   #326 <Method View ViewGroup.findViewById(int)>
	//  101  225:astore          5
						if(obj != null)
	//* 102  227:aload           5
	//* 103  229:ifnull          238
							((View) (obj)).setVisibility(0);
	//  104  232:aload           5
	//  105  234:iconst_0        
	//  106  235:invokevirtual   #250 <Method void View.setVisibility(int)>
					}
					if(!flag2)
						break label1;
	//  107  238:iload_3         
	//  108  239:ifeq            314
					if(mScrollView != null)
	//* 109  242:aload_0         
	//* 110  243:getfield        #297 <Field NestedScrollView mScrollView>
	//* 111  246:ifnull          257
						mScrollView.setClipToPadding(true);
	//  112  249:aload_0         
	//  113  250:getfield        #297 <Field NestedScrollView mScrollView>
	//  114  253:iconst_1        
	//  115  254:invokevirtual   #514 <Method void NestedScrollView.setClipToPadding(boolean)>
					obj2 = null;
	//  116  257:aconst_null     
	//  117  258:astore          6
					if(mMessage == null && mListView == null)
	//* 118  260:aload_0         
	//* 119  261:getfield        #295 <Field CharSequence mMessage>
	//* 120  264:ifnonnull       282
	//* 121  267:aload_0         
	//* 122  268:getfield        #313 <Field ListView mListView>
	//* 123  271:ifnonnull       282
					{
						obj = obj2;
	//  124  274:aload           6
	//  125  276:astore          5
						if(!flag)
							break label2;
	//  126  278:iload_1         
	//  127  279:ifeq            300
					}
					obj = obj2;
	//  128  282:aload           6
	//  129  284:astore          5
					if(!flag)
	//* 130  286:iload_1         
	//* 131  287:ifne            300
						obj = ((Object) (((ViewGroup) (obj4)).findViewById(android.support.v7.appcompat.R.id.titleDividerNoCustom)));
	//  132  290:aload           8
	//  133  292:getstatic       #517 <Field int android.support.v7.appcompat.R$id.titleDividerNoCustom>
	//  134  295:invokevirtual   #326 <Method View ViewGroup.findViewById(int)>
	//  135  298:astore          5
				}
				if(obj != null)
	//* 136  300:aload           5
	//* 137  302:ifnull          311
					((View) (obj)).setVisibility(0);
	//  138  305:aload           5
	//  139  307:iconst_0        
	//  140  308:invokevirtual   #250 <Method void View.setVisibility(int)>
				break label0;
	//  141  311:goto            340
			}
			if(obj3 != null)
	//* 142  314:aload           7
	//* 143  316:ifnull          340
			{
				View view = ((ViewGroup) (obj3)).findViewById(android.support.v7.appcompat.R.id.textSpacerNoTitle);
	//  144  319:aload           7
	//  145  321:getstatic       #520 <Field int android.support.v7.appcompat.R$id.textSpacerNoTitle>
	//  146  324:invokevirtual   #326 <Method View ViewGroup.findViewById(int)>
	//  147  327:astore          5
				if(view != null)
	//* 148  329:aload           5
	//* 149  331:ifnull          340
					view.setVisibility(0);
	//  150  334:aload           5
	//  151  336:iconst_0        
	//  152  337:invokevirtual   #250 <Method void View.setVisibility(int)>
			}
		}
		if(mListView instanceof RecycleListView)
	//* 153  340:aload_0         
	//* 154  341:getfield        #313 <Field ListView mListView>
	//* 155  344:instanceof      #36  <Class AlertController$RecycleListView>
	//* 156  347:ifeq            363
			((RecycleListView)mListView).setHasDecor(flag2, flag3);
	//  157  350:aload_0         
	//  158  351:getfield        #313 <Field ListView mListView>
	//  159  354:checkcast       #36  <Class AlertController$RecycleListView>
	//  160  357:iload_3         
	//  161  358:iload           4
	//  162  360:invokevirtual   #524 <Method void AlertController$RecycleListView.setHasDecor(boolean, boolean)>
		if(!flag)
	//* 163  363:iload_1         
	//* 164  364:ifne            429
		{
			Object obj1;
			if(mListView != null)
	//* 165  367:aload_0         
	//* 166  368:getfield        #313 <Field ListView mListView>
	//* 167  371:ifnull          383
				obj1 = ((Object) (mListView));
	//  168  374:aload_0         
	//  169  375:getfield        #313 <Field ListView mListView>
	//  170  378:astore          5
			else
	//* 171  380:goto            389
				obj1 = ((Object) (mScrollView));
	//  172  383:aload_0         
	//  173  384:getfield        #297 <Field NestedScrollView mScrollView>
	//  174  387:astore          5
			if(obj1 != null)
	//* 175  389:aload           5
	//* 176  391:ifnull          429
			{
				boolean flag1;
				if(flag2)
	//* 177  394:iload_3         
	//* 178  395:ifeq            403
					flag1 = true;
	//  179  398:iconst_1        
	//  180  399:istore_1        
				else
	//* 181  400:goto            405
					flag1 = false;
	//  182  403:iconst_0        
	//  183  404:istore_1        
				byte byte0;
				if(flag3)
	//* 184  405:iload           4
	//* 185  407:ifeq            415
					byte0 = 2;
	//  186  410:iconst_2        
	//  187  411:istore_2        
				else
	//* 188  412:goto            417
					byte0 = 0;
	//  189  415:iconst_0        
	//  190  416:istore_2        
				setScrollIndicators(((ViewGroup) (obj3)), ((View) (obj1)), flag1 | byte0, 3);
	//  191  417:aload_0         
	//  192  418:aload           7
	//  193  420:aload           5
	//  194  422:iload_1         
	//  195  423:iload_2         
	//  196  424:ior             
	//  197  425:iconst_3        
	//  198  426:invokespecial   #526 <Method void setScrollIndicators(ViewGroup, View, int, int)>
			}
		}
		ListView listview = mListView;
	//  199  429:aload_0         
	//  200  430:getfield        #313 <Field ListView mListView>
	//  201  433:astore          5
		if(listview != null && mAdapter != null)
	//* 202  435:aload           5
	//* 203  437:ifnull          479
	//* 204  440:aload_0         
	//* 205  441:getfield        #528 <Field ListAdapter mAdapter>
	//* 206  444:ifnull          479
		{
			listview.setAdapter(mAdapter);
	//  207  447:aload           5
	//  208  449:aload_0         
	//  209  450:getfield        #528 <Field ListAdapter mAdapter>
	//  210  453:invokevirtual   #532 <Method void ListView.setAdapter(ListAdapter)>
			int i = mCheckedItem;
	//  211  456:aload_0         
	//  212  457:getfield        #106 <Field int mCheckedItem>
	//  213  460:istore_1        
			if(i > -1)
	//* 214  461:iload_1         
	//* 215  462:iconst_m1       
	//* 216  463:icmple          479
			{
				listview.setItemChecked(i, true);
	//  217  466:aload           5
	//  218  468:iload_1         
	//  219  469:iconst_1        
	//  220  470:invokevirtual   #536 <Method void ListView.setItemChecked(int, boolean)>
				listview.setSelection(i);
	//  221  473:aload           5
	//  222  475:iload_1         
	//  223  476:invokevirtual   #539 <Method void ListView.setSelection(int)>
			}
		}
	//  224  479:return          
	}

	private static boolean shouldCenterSingleButton(Context context)
	{
		TypedValue typedvalue = new TypedValue();
	//    0    0:new             #541 <Class TypedValue>
	//    1    3:dup             
	//    2    4:invokespecial   #542 <Method void TypedValue()>
	//    3    7:astore_1        
		context.getTheme().resolveAttribute(android.support.v7.appcompat.R.attr.alertDialogCenterButtons, typedvalue, true);
	//    4    8:aload_0         
	//    5    9:invokevirtual   #546 <Method android.content.res.Resources$Theme Context.getTheme()>
	//    6   12:getstatic       #549 <Field int android.support.v7.appcompat.R$attr.alertDialogCenterButtons>
	//    7   15:aload_1         
	//    8   16:iconst_1        
	//    9   17:invokevirtual   #555 <Method boolean android.content.res.Resources$Theme.resolveAttribute(int, TypedValue, boolean)>
	//   10   20:pop             
		return typedvalue.data != 0;
	//   11   21:aload_1         
	//   12   22:getfield        #558 <Field int TypedValue.data>
	//   13   25:ifeq            30
	//   14   28:iconst_1        
	//   15   29:ireturn         
	//   16   30:iconst_0        
	//   17   31:ireturn         
	}

	public Button getButton(int i)
	{
		switch(i)
	//*   0    0:iload_1         
		{
	//*   1    1:tableswitch     -3 -1: default 28
	//	               -3 41
	//	               -2 36
	//	               -1 31
	//*   2   28:goto            46
		case -1: 
			return mButtonPositive;
	//    3   31:aload_0         
	//    4   32:getfield        #328 <Field Button mButtonPositive>
	//    5   35:areturn         

		case -2: 
			return mButtonNegative;
	//    6   36:aload_0         
	//    7   37:getfield        #348 <Field Button mButtonNegative>
	//    8   40:areturn         

		case -3: 
			return mButtonNeutral;
	//    9   41:aload_0         
	//   10   42:getfield        #353 <Field Button mButtonNeutral>
	//   11   45:areturn         
		}
		return null;
	//   12   46:aconst_null     
	//   13   47:areturn         
	}

	public int getIconAttributeResId(int i)
	{
		TypedValue typedvalue = new TypedValue();
	//    0    0:new             #541 <Class TypedValue>
	//    1    3:dup             
	//    2    4:invokespecial   #542 <Method void TypedValue()>
	//    3    7:astore_2        
		mContext.getTheme().resolveAttribute(i, typedvalue, true);
	//    4    8:aload_0         
	//    5    9:getfield        #115 <Field Context mContext>
	//    6   12:invokevirtual   #546 <Method android.content.res.Resources$Theme Context.getTheme()>
	//    7   15:iload_1         
	//    8   16:aload_2         
	//    9   17:iconst_1        
	//   10   18:invokevirtual   #555 <Method boolean android.content.res.Resources$Theme.resolveAttribute(int, TypedValue, boolean)>
	//   11   21:pop             
		return typedvalue.resourceId;
	//   12   22:aload_2         
	//   13   23:getfield        #565 <Field int TypedValue.resourceId>
	//   14   26:ireturn         
	}

	public ListView getListView()
	{
		return mListView;
	//    0    0:aload_0         
	//    1    1:getfield        #313 <Field ListView mListView>
	//    2    4:areturn         
	}

	public void installContent()
	{
		int i = selectContentView();
	//    0    0:aload_0         
	//    1    1:invokespecial   #570 <Method int selectContentView()>
	//    2    4:istore_1        
		mDialog.setContentView(i);
	//    3    5:aload_0         
	//    4    6:getfield        #117 <Field AppCompatDialog mDialog>
	//    5    9:iload_1         
	//    6   10:invokevirtual   #573 <Method void AppCompatDialog.setContentView(int)>
		setupView();
	//    7   13:aload_0         
	//    8   14:invokespecial   #575 <Method void setupView()>
	//    9   17:return          
	}

	public boolean onKeyDown(int i, KeyEvent keyevent)
	{
		return mScrollView != null && mScrollView.executeKeyEvent(keyevent);
	//    0    0:aload_0         
	//    1    1:getfield        #297 <Field NestedScrollView mScrollView>
	//    2    4:ifnull          20
	//    3    7:aload_0         
	//    4    8:getfield        #297 <Field NestedScrollView mScrollView>
	//    5   11:aload_2         
	//    6   12:invokevirtual   #581 <Method boolean NestedScrollView.executeKeyEvent(KeyEvent)>
	//    7   15:ifeq            20
	//    8   18:iconst_1        
	//    9   19:ireturn         
	//   10   20:iconst_0        
	//   11   21:ireturn         
	}

	public boolean onKeyUp(int i, KeyEvent keyevent)
	{
		return mScrollView != null && mScrollView.executeKeyEvent(keyevent);
	//    0    0:aload_0         
	//    1    1:getfield        #297 <Field NestedScrollView mScrollView>
	//    2    4:ifnull          20
	//    3    7:aload_0         
	//    4    8:getfield        #297 <Field NestedScrollView mScrollView>
	//    5   11:aload_2         
	//    6   12:invokevirtual   #581 <Method boolean NestedScrollView.executeKeyEvent(KeyEvent)>
	//    7   15:ifeq            20
	//    8   18:iconst_1        
	//    9   19:ireturn         
	//   10   20:iconst_0        
	//   11   21:ireturn         
	}

	public void setButton(int i, CharSequence charsequence, android.content.DialogInterface.OnClickListener onclicklistener, Message message)
	{
		Message message1 = message;
	//    0    0:aload           4
	//    1    2:astore          5
		if(message == null)
	//*   2    4:aload           4
	//*   3    6:ifnonnull       28
		{
			message1 = message;
	//    4    9:aload           4
	//    5   11:astore          5
			if(onclicklistener != null)
	//*   6   13:aload_3         
	//*   7   14:ifnull          28
				message1 = mHandler.obtainMessage(i, ((Object) (onclicklistener)));
	//    8   17:aload_0         
	//    9   18:getfield        #124 <Field Handler mHandler>
	//   10   21:iload_1         
	//   11   22:aload_3         
	//   12   23:invokevirtual   #590 <Method Message Handler.obtainMessage(int, Object)>
	//   13   26:astore          5
		}
		switch(i)
	//*  14   28:iload_1         
		{
	//*  15   29:tableswitch     -3 -1: default 56
	//	               -3 83
	//	               -2 71
	//	               -1 59
	//*  16   56:goto            95
		case -1: 
			mButtonPositiveText = charsequence;
	//   17   59:aload_0         
	//   18   60:aload_2         
	//   19   61:putfield        #334 <Field CharSequence mButtonPositiveText>
			mButtonPositiveMessage = message1;
	//   20   64:aload_0         
	//   21   65:aload           5
	//   22   67:putfield        #592 <Field Message mButtonPositiveMessage>
			return;
	//   23   70:return          

		case -2: 
			mButtonNegativeText = charsequence;
	//   24   71:aload_0         
	//   25   72:aload_2         
	//   26   73:putfield        #350 <Field CharSequence mButtonNegativeText>
			mButtonNegativeMessage = message1;
	//   27   76:aload_0         
	//   28   77:aload           5
	//   29   79:putfield        #594 <Field Message mButtonNegativeMessage>
			return;
	//   30   82:return          

		case -3: 
			mButtonNeutralText = charsequence;
	//   31   83:aload_0         
	//   32   84:aload_2         
	//   33   85:putfield        #355 <Field CharSequence mButtonNeutralText>
			mButtonNeutralMessage = message1;
	//   34   88:aload_0         
	//   35   89:aload           5
	//   36   91:putfield        #596 <Field Message mButtonNeutralMessage>
			return;
	//   37   94:return          
		}
		throw new IllegalArgumentException("Button does not exist");
	//   38   95:new             #598 <Class IllegalArgumentException>
	//   39   98:dup             
	//   40   99:ldc2            #600 <String "Button does not exist">
	//   41  102:invokespecial   #603 <Method void IllegalArgumentException(String)>
	//   42  105:athrow          
	}

	public void setButtonPanelLayoutHint(int i)
	{
		mButtonPanelLayoutHint = i;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #108 <Field int mButtonPanelLayoutHint>
	//    3    5:return          
	}

	public void setCustomTitle(View view)
	{
		mCustomTitleView = view;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #440 <Field View mCustomTitleView>
	//    3    5:return          
	}

	public void setIcon(int i)
	{
		mIcon = null;
	//    0    0:aload_0         
	//    1    1:aconst_null     
	//    2    2:putfield        #460 <Field Drawable mIcon>
		mIconId = i;
	//    3    5:aload_0         
	//    4    6:iload_1         
	//    5    7:putfield        #104 <Field int mIconId>
		if(mIconView != null)
	//*   6   10:aload_0         
	//*   7   11:getfield        #448 <Field ImageView mIconView>
	//*   8   14:ifnull          50
		{
			if(i != 0)
	//*   9   17:iload_1         
	//*  10   18:ifeq            41
			{
				mIconView.setVisibility(0);
	//   11   21:aload_0         
	//   12   22:getfield        #448 <Field ImageView mIconView>
	//   13   25:iconst_0        
	//   14   26:invokevirtual   #478 <Method void ImageView.setVisibility(int)>
				mIconView.setImageResource(mIconId);
	//   15   29:aload_0         
	//   16   30:getfield        #448 <Field ImageView mIconView>
	//   17   33:aload_0         
	//   18   34:getfield        #104 <Field int mIconId>
	//   19   37:invokevirtual   #458 <Method void ImageView.setImageResource(int)>
				return;
	//   20   40:return          
			}
			mIconView.setVisibility(8);
	//   21   41:aload_0         
	//   22   42:getfield        #448 <Field ImageView mIconView>
	//   23   45:bipush          8
	//   24   47:invokevirtual   #478 <Method void ImageView.setVisibility(int)>
		}
	//   25   50:return          
	}

	public void setIcon(Drawable drawable)
	{
		mIcon = drawable;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #460 <Field Drawable mIcon>
		mIconId = 0;
	//    3    5:aload_0         
	//    4    6:iconst_0        
	//    5    7:putfield        #104 <Field int mIconId>
		if(mIconView != null)
	//*   6   10:aload_0         
	//*   7   11:getfield        #448 <Field ImageView mIconView>
	//*   8   14:ifnull          47
		{
			if(drawable != null)
	//*   9   17:aload_1         
	//*  10   18:ifnull          38
			{
				mIconView.setVisibility(0);
	//   11   21:aload_0         
	//   12   22:getfield        #448 <Field ImageView mIconView>
	//   13   25:iconst_0        
	//   14   26:invokevirtual   #478 <Method void ImageView.setVisibility(int)>
				mIconView.setImageDrawable(drawable);
	//   15   29:aload_0         
	//   16   30:getfield        #448 <Field ImageView mIconView>
	//   17   33:aload_1         
	//   18   34:invokevirtual   #464 <Method void ImageView.setImageDrawable(Drawable)>
				return;
	//   19   37:return          
			}
			mIconView.setVisibility(8);
	//   20   38:aload_0         
	//   21   39:getfield        #448 <Field ImageView mIconView>
	//   22   42:bipush          8
	//   23   44:invokevirtual   #478 <Method void ImageView.setVisibility(int)>
		}
	//   24   47:return          
	}

	public void setMessage(CharSequence charsequence)
	{
		mMessage = charsequence;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #295 <Field CharSequence mMessage>
		if(mMessageView != null)
	//*   3    5:aload_0         
	//*   4    6:getfield        #378 <Field TextView mMessageView>
	//*   5    9:ifnull          20
			mMessageView.setText(charsequence);
	//    6   12:aload_0         
	//    7   13:getfield        #378 <Field TextView mMessageView>
	//    8   16:aload_1         
	//    9   17:invokevirtual   #379 <Method void TextView.setText(CharSequence)>
	//   10   20:return          
	}

	public void setTitle(CharSequence charsequence)
	{
		mTitle = charsequence;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #450 <Field CharSequence mTitle>
		if(mTitleView != null)
	//*   3    5:aload_0         
	//*   4    6:getfield        #455 <Field TextView mTitleView>
	//*   5    9:ifnull          20
			mTitleView.setText(charsequence);
	//    6   12:aload_0         
	//    7   13:getfield        #455 <Field TextView mTitleView>
	//    8   16:aload_1         
	//    9   17:invokevirtual   #379 <Method void TextView.setText(CharSequence)>
	//   10   20:return          
	}

	public void setView(int i)
	{
		mView = null;
	//    0    0:aload_0         
	//    1    1:aconst_null     
	//    2    2:putfield        #401 <Field View mView>
		mViewLayoutResId = i;
	//    3    5:aload_0         
	//    4    6:iload_1         
	//    5    7:putfield        #403 <Field int mViewLayoutResId>
		mViewSpacingSpecified = false;
	//    6   10:aload_0         
	//    7   11:iconst_0        
	//    8   12:putfield        #102 <Field boolean mViewSpacingSpecified>
	//    9   15:return          
	}

	public void setView(View view)
	{
		mView = view;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #401 <Field View mView>
		mViewLayoutResId = 0;
	//    3    5:aload_0         
	//    4    6:iconst_0        
	//    5    7:putfield        #403 <Field int mViewLayoutResId>
		mViewSpacingSpecified = false;
	//    6   10:aload_0         
	//    7   11:iconst_0        
	//    8   12:putfield        #102 <Field boolean mViewSpacingSpecified>
	//    9   15:return          
	}

	public void setView(View view, int i, int j, int k, int l)
	{
		mView = view;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #401 <Field View mView>
		mViewLayoutResId = 0;
	//    3    5:aload_0         
	//    4    6:iconst_0        
	//    5    7:putfield        #403 <Field int mViewLayoutResId>
		mViewSpacingSpecified = true;
	//    6   10:aload_0         
	//    7   11:iconst_1        
	//    8   12:putfield        #102 <Field boolean mViewSpacingSpecified>
		mViewSpacingLeft = i;
	//    9   15:aload_0         
	//   10   16:iload_2         
	//   11   17:putfield        #426 <Field int mViewSpacingLeft>
		mViewSpacingTop = j;
	//   12   20:aload_0         
	//   13   21:iload_3         
	//   14   22:putfield        #428 <Field int mViewSpacingTop>
		mViewSpacingRight = k;
	//   15   25:aload_0         
	//   16   26:iload           4
	//   17   28:putfield        #430 <Field int mViewSpacingRight>
		mViewSpacingBottom = l;
	//   18   31:aload_0         
	//   19   32:iload           5
	//   20   34:putfield        #432 <Field int mViewSpacingBottom>
	//   21   37:return          
	}

	ListAdapter mAdapter;
	private int mAlertDialogLayout;
	private final android.view.View.OnClickListener mButtonHandler = new android.view.View.OnClickListener() {

		public void onClick(View view)
		{
			if(view == mButtonPositive && mButtonPositiveMessage != null)
		//*   0    0:aload_1         
		//*   1    1:aload_0         
		//*   2    2:getfield        #14  <Field AlertController this$0>
		//*   3    5:getfield        #24  <Field Button AlertController.mButtonPositive>
		//*   4    8:if_acmpne       35
		//*   5   11:aload_0         
		//*   6   12:getfield        #14  <Field AlertController this$0>
		//*   7   15:getfield        #28  <Field Message AlertController.mButtonPositiveMessage>
		//*   8   18:ifnull          35
				view = ((View) (Message.obtain(mButtonPositiveMessage)));
		//    9   21:aload_0         
		//   10   22:getfield        #14  <Field AlertController this$0>
		//   11   25:getfield        #28  <Field Message AlertController.mButtonPositiveMessage>
		//   12   28:invokestatic    #34  <Method Message Message.obtain(Message)>
		//   13   31:astore_1        
			else
		//*  14   32:goto            107
			if(view == mButtonNegative && mButtonNegativeMessage != null)
		//*  15   35:aload_1         
		//*  16   36:aload_0         
		//*  17   37:getfield        #14  <Field AlertController this$0>
		//*  18   40:getfield        #37  <Field Button AlertController.mButtonNegative>
		//*  19   43:if_acmpne       70
		//*  20   46:aload_0         
		//*  21   47:getfield        #14  <Field AlertController this$0>
		//*  22   50:getfield        #40  <Field Message AlertController.mButtonNegativeMessage>
		//*  23   53:ifnull          70
				view = ((View) (Message.obtain(mButtonNegativeMessage)));
		//   24   56:aload_0         
		//   25   57:getfield        #14  <Field AlertController this$0>
		//   26   60:getfield        #40  <Field Message AlertController.mButtonNegativeMessage>
		//   27   63:invokestatic    #34  <Method Message Message.obtain(Message)>
		//   28   66:astore_1        
			else
		//*  29   67:goto            107
			if(view == mButtonNeutral && mButtonNeutralMessage != null)
		//*  30   70:aload_1         
		//*  31   71:aload_0         
		//*  32   72:getfield        #14  <Field AlertController this$0>
		//*  33   75:getfield        #43  <Field Button AlertController.mButtonNeutral>
		//*  34   78:if_acmpne       105
		//*  35   81:aload_0         
		//*  36   82:getfield        #14  <Field AlertController this$0>
		//*  37   85:getfield        #46  <Field Message AlertController.mButtonNeutralMessage>
		//*  38   88:ifnull          105
				view = ((View) (Message.obtain(mButtonNeutralMessage)));
		//   39   91:aload_0         
		//   40   92:getfield        #14  <Field AlertController this$0>
		//   41   95:getfield        #46  <Field Message AlertController.mButtonNeutralMessage>
		//   42   98:invokestatic    #34  <Method Message Message.obtain(Message)>
		//   43  101:astore_1        
			else
		//*  44  102:goto            107
				view = null;
		//   45  105:aconst_null     
		//   46  106:astore_1        
			if(view != null)
		//*  47  107:aload_1         
		//*  48  108:ifnull          115
				((Message) (view)).sendToTarget();
		//   49  111:aload_1         
		//   50  112:invokevirtual   #49  <Method void Message.sendToTarget()>
			mHandler.obtainMessage(1, ((Object) (mDialog))).sendToTarget();
		//   51  115:aload_0         
		//   52  116:getfield        #14  <Field AlertController this$0>
		//   53  119:getfield        #53  <Field Handler AlertController.mHandler>
		//   54  122:iconst_1        
		//   55  123:aload_0         
		//   56  124:getfield        #14  <Field AlertController this$0>
		//   57  127:getfield        #57  <Field AppCompatDialog AlertController.mDialog>
		//   58  130:invokevirtual   #63  <Method Message Handler.obtainMessage(int, Object)>
		//   59  133:invokevirtual   #49  <Method void Message.sendToTarget()>
		//   60  136:return          
		}

		final AlertController this$0;

			
			{
				this$0 = AlertController.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #14  <Field AlertController this$0>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #17  <Method void Object()>
			//    5    9:return          
			}
	}
;
	Button mButtonNegative;
	Message mButtonNegativeMessage;
	private CharSequence mButtonNegativeText;
	Button mButtonNeutral;
	Message mButtonNeutralMessage;
	private CharSequence mButtonNeutralText;
	private int mButtonPanelLayoutHint;
	private int mButtonPanelSideLayout;
	Button mButtonPositive;
	Message mButtonPositiveMessage;
	private CharSequence mButtonPositiveText;
	int mCheckedItem;
	private final Context mContext;
	private View mCustomTitleView;
	final AppCompatDialog mDialog;
	Handler mHandler;
	private Drawable mIcon;
	private int mIconId;
	private ImageView mIconView;
	int mListItemLayout;
	int mListLayout;
	ListView mListView;
	private CharSequence mMessage;
	private TextView mMessageView;
	int mMultiChoiceItemLayout;
	NestedScrollView mScrollView;
	private boolean mShowTitle;
	int mSingleChoiceItemLayout;
	private CharSequence mTitle;
	private TextView mTitleView;
	private View mView;
	private int mViewLayoutResId;
	private int mViewSpacingBottom;
	private int mViewSpacingLeft;
	private int mViewSpacingRight;
	private boolean mViewSpacingSpecified;
	private int mViewSpacingTop;
	private final Window mWindow;
}
