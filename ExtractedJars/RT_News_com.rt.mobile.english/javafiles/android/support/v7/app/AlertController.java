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
							int j = cursor.getInt(mIsCheckedIndex);
						//   15   35:aload_3         
						//   16   36:aload_0         
						//   17   37:getfield        #53  <Field int mIsCheckedIndex>
						//   18   40:invokeinterface #81  <Method int Cursor.getInt(int)>
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
							((RecycleListView) (view)).setItemChecked(i, flag);
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
					i = alertcontroller.mSingleChoiceItemLayout;
		//   44   90:aload_1         
		//   45   91:getfield        #144 <Field int AlertController.mSingleChoiceItemLayout>
		//   46   94:istore_2        
				else
		//*  47   95:goto            106
					i = alertcontroller.mListItemLayout;
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
					obj = ((Object) (new CheckedItemAdapter(mContext, i, 0x1020014, mItems)));
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
			alertcontroller.mAdapter = ((ListAdapter) (obj));
		//  102  204:aload_1         
		//  103  205:aload_3         
		//  104  206:putfield        #170 <Field ListAdapter AlertController.mAdapter>
			alertcontroller.mCheckedItem = mCheckedItem;
		//  105  209:aload_1         
		//  106  210:aload_0         
		//  107  211:getfield        #93  <Field int mCheckedItem>
		//  108  214:putfield        #171 <Field int AlertController.mCheckedItem>
			if(mOnClickListener != null)
		//* 109  217:aload_0         
		//* 110  218:getfield        #173 <Field android.content.DialogInterface$OnClickListener mOnClickListener>
		//* 111  221:ifnull          241
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
			alertcontroller.mListView = ((ListView) (listView));
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
				alertcontroller.setButton(-1, mPositiveButtonText, mPositiveButtonListener, ((Message) (null)), mPositiveButtonIcon);
		//   51  111:aload_1         
		//   52  112:iconst_m1       
		//   53  113:aload_0         
		//   54  114:getfield        #231 <Field CharSequence mPositiveButtonText>
		//   55  117:aload_0         
		//   56  118:getfield        #235 <Field android.content.DialogInterface$OnClickListener mPositiveButtonListener>
		//   57  121:aconst_null     
		//   58  122:aload_0         
		//   59  123:getfield        #233 <Field Drawable mPositiveButtonIcon>
		//   60  126:invokevirtual   #239 <Method void AlertController.setButton(int, CharSequence, android.content.DialogInterface$OnClickListener, Message, Drawable)>
			if(mNegativeButtonText != null || mNegativeButtonIcon != null)
		//*  61  129:aload_0         
		//*  62  130:getfield        #241 <Field CharSequence mNegativeButtonText>
		//*  63  133:ifnonnull       143
		//*  64  136:aload_0         
		//*  65  137:getfield        #243 <Field Drawable mNegativeButtonIcon>
		//*  66  140:ifnull          162
				alertcontroller.setButton(-2, mNegativeButtonText, mNegativeButtonListener, ((Message) (null)), mNegativeButtonIcon);
		//   67  143:aload_1         
		//   68  144:bipush          -2
		//   69  146:aload_0         
		//   70  147:getfield        #241 <Field CharSequence mNegativeButtonText>
		//   71  150:aload_0         
		//   72  151:getfield        #245 <Field android.content.DialogInterface$OnClickListener mNegativeButtonListener>
		//   73  154:aconst_null     
		//   74  155:aload_0         
		//   75  156:getfield        #243 <Field Drawable mNegativeButtonIcon>
		//   76  159:invokevirtual   #239 <Method void AlertController.setButton(int, CharSequence, android.content.DialogInterface$OnClickListener, Message, Drawable)>
			if(mNeutralButtonText != null || mNeutralButtonIcon != null)
		//*  77  162:aload_0         
		//*  78  163:getfield        #247 <Field CharSequence mNeutralButtonText>
		//*  79  166:ifnonnull       176
		//*  80  169:aload_0         
		//*  81  170:getfield        #249 <Field Drawable mNeutralButtonIcon>
		//*  82  173:ifnull          195
				alertcontroller.setButton(-3, mNeutralButtonText, mNeutralButtonListener, ((Message) (null)), mNeutralButtonIcon);
		//   83  176:aload_1         
		//   84  177:bipush          -3
		//   85  179:aload_0         
		//   86  180:getfield        #247 <Field CharSequence mNeutralButtonText>
		//   87  183:aload_0         
		//   88  184:getfield        #251 <Field android.content.DialogInterface$OnClickListener mNeutralButtonListener>
		//   89  187:aconst_null     
		//   90  188:aload_0         
		//   91  189:getfield        #249 <Field Drawable mNeutralButtonIcon>
		//   92  192:invokevirtual   #239 <Method void AlertController.setButton(int, CharSequence, android.content.DialogInterface$OnClickListener, Message, Drawable)>
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
		public android.content.DialogInterface.OnClickListener mNegativeButtonListener;
		public CharSequence mNegativeButtonText;
		public Drawable mNeutralButtonIcon;
		public android.content.DialogInterface.OnClickListener mNeutralButtonListener;
		public CharSequence mNeutralButtonText;
		public android.content.DialogInterface.OnCancelListener mOnCancelListener;
		public android.content.DialogInterface.OnMultiChoiceClickListener mOnCheckboxClickListener;
		public android.content.DialogInterface.OnClickListener mOnClickListener;
		public android.content.DialogInterface.OnDismissListener mOnDismissListener;
		public android.widget.AdapterView.OnItemSelectedListener mOnItemSelectedListener;
		public android.content.DialogInterface.OnKeyListener mOnKeyListener;
		public OnPrepareListViewListener mOnPrepareListViewListener;
		public Drawable mPositiveButtonIcon;
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

	public static interface AlertParams.OnPrepareListViewListener
	{

		public abstract void onPrepareListView(ListView listview);
	}

	private static final class ButtonHandler extends Handler
	{

		public void handleMessage(Message message)
		{
			int i = message.what;
		//    0    0:aload_1         
		//    1    1:getfield        #33  <Field int Message.what>
		//    2    4:istore_2        
			if(i != 1)
		//*   3    5:iload_2         
		//*   4    6:iconst_1        
		//*   5    7:icmpeq          64
			{
				switch(i)
		//*   6   10:iload_2         
				{
		//*   7   11:tableswitch     -3 -1: default 36
		//		               -3 37
		//		               -2 37
		//		               -1 37
				default:
					return;
		//    8   36:return          

				case -3: 
				case -2: 
				case -1: 
					((android.content.DialogInterface.OnClickListener)message.obj).onClick((DialogInterface)mDialog.get(), message.what);
		//    9   37:aload_1         
		//   10   38:getfield        #37  <Field Object Message.obj>
		//   11   41:checkcast       #39  <Class android.content.DialogInterface$OnClickListener>
		//   12   44:aload_0         
		//   13   45:getfield        #25  <Field WeakReference mDialog>
		//   14   48:invokevirtual   #43  <Method Object WeakReference.get()>
		//   15   51:checkcast       #45  <Class DialogInterface>
		//   16   54:aload_1         
		//   17   55:getfield        #33  <Field int Message.what>
		//   18   58:invokeinterface #49  <Method void android.content.DialogInterface$OnClickListener.onClick(DialogInterface, int)>
					break;
				}
				return;
		//   19   63:return          
			} else
			{
				((DialogInterface)message.obj).dismiss();
		//   20   64:aload_1         
		//   21   65:getfield        #37  <Field Object Message.obj>
		//   22   68:checkcast       #45  <Class DialogInterface>
		//   23   71:invokeinterface #52  <Method void DialogInterface.dismiss()>
				return;
		//   24   76:return          
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

	private static class CheckedItemAdapter extends ArrayAdapter
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
	//    1    1:invokespecial   #104 <Method void Object()>
		mViewSpacingSpecified = false;
	//    2    4:aload_0         
	//    3    5:iconst_0        
	//    4    6:putfield        #106 <Field boolean mViewSpacingSpecified>
		mIconId = 0;
	//    5    9:aload_0         
	//    6   10:iconst_0        
	//    7   11:putfield        #108 <Field int mIconId>
		mCheckedItem = -1;
	//    8   14:aload_0         
	//    9   15:iconst_m1       
	//   10   16:putfield        #110 <Field int mCheckedItem>
		mButtonPanelLayoutHint = 0;
	//   11   19:aload_0         
	//   12   20:iconst_0        
	//   13   21:putfield        #112 <Field int mButtonPanelLayoutHint>
	//   14   24:aload_0         
	//   15   25:new             #6   <Class AlertController$1>
	//   16   28:dup             
	//   17   29:aload_0         
	//   18   30:invokespecial   #115 <Method void AlertController$1(AlertController)>
	//   19   33:putfield        #117 <Field android.view.View$OnClickListener mButtonHandler>
		mContext = context;
	//   20   36:aload_0         
	//   21   37:aload_1         
	//   22   38:putfield        #119 <Field Context mContext>
		mDialog = appcompatdialog;
	//   23   41:aload_0         
	//   24   42:aload_2         
	//   25   43:putfield        #121 <Field AppCompatDialog mDialog>
		mWindow = window;
	//   26   46:aload_0         
	//   27   47:aload_3         
	//   28   48:putfield        #123 <Field Window mWindow>
		mHandler = ((Handler) (new ButtonHandler(((DialogInterface) (appcompatdialog)))));
	//   29   51:aload_0         
	//   30   52:new             #30  <Class AlertController$ButtonHandler>
	//   31   55:dup             
	//   32   56:aload_2         
	//   33   57:invokespecial   #126 <Method void AlertController$ButtonHandler(DialogInterface)>
	//   34   60:putfield        #128 <Field Handler mHandler>
		context = ((Context) (context.obtainStyledAttributes(((AttributeSet) (null)), android.support.v7.appcompat.R.styleable.AlertDialog, android.support.v7.appcompat.R.attr.alertDialogStyle, 0)));
	//   35   63:aload_1         
	//   36   64:aconst_null     
	//   37   65:getstatic       #134 <Field int[] android.support.v7.appcompat.R$styleable.AlertDialog>
	//   38   68:getstatic       #139 <Field int android.support.v7.appcompat.R$attr.alertDialogStyle>
	//   39   71:iconst_0        
	//   40   72:invokevirtual   #145 <Method TypedArray Context.obtainStyledAttributes(AttributeSet, int[], int, int)>
	//   41   75:astore_1        
		mAlertDialogLayout = ((TypedArray) (context)).getResourceId(android.support.v7.appcompat.R.styleable.AlertDialog_android_layout, 0);
	//   42   76:aload_0         
	//   43   77:aload_1         
	//   44   78:getstatic       #148 <Field int android.support.v7.appcompat.R$styleable.AlertDialog_android_layout>
	//   45   81:iconst_0        
	//   46   82:invokevirtual   #154 <Method int TypedArray.getResourceId(int, int)>
	//   47   85:putfield        #156 <Field int mAlertDialogLayout>
		mButtonPanelSideLayout = ((TypedArray) (context)).getResourceId(android.support.v7.appcompat.R.styleable.AlertDialog_buttonPanelSideLayout, 0);
	//   48   88:aload_0         
	//   49   89:aload_1         
	//   50   90:getstatic       #159 <Field int android.support.v7.appcompat.R$styleable.AlertDialog_buttonPanelSideLayout>
	//   51   93:iconst_0        
	//   52   94:invokevirtual   #154 <Method int TypedArray.getResourceId(int, int)>
	//   53   97:putfield        #161 <Field int mButtonPanelSideLayout>
		mListLayout = ((TypedArray) (context)).getResourceId(android.support.v7.appcompat.R.styleable.AlertDialog_listLayout, 0);
	//   54  100:aload_0         
	//   55  101:aload_1         
	//   56  102:getstatic       #164 <Field int android.support.v7.appcompat.R$styleable.AlertDialog_listLayout>
	//   57  105:iconst_0        
	//   58  106:invokevirtual   #154 <Method int TypedArray.getResourceId(int, int)>
	//   59  109:putfield        #166 <Field int mListLayout>
		mMultiChoiceItemLayout = ((TypedArray) (context)).getResourceId(android.support.v7.appcompat.R.styleable.AlertDialog_multiChoiceItemLayout, 0);
	//   60  112:aload_0         
	//   61  113:aload_1         
	//   62  114:getstatic       #169 <Field int android.support.v7.appcompat.R$styleable.AlertDialog_multiChoiceItemLayout>
	//   63  117:iconst_0        
	//   64  118:invokevirtual   #154 <Method int TypedArray.getResourceId(int, int)>
	//   65  121:putfield        #171 <Field int mMultiChoiceItemLayout>
		mSingleChoiceItemLayout = ((TypedArray) (context)).getResourceId(android.support.v7.appcompat.R.styleable.AlertDialog_singleChoiceItemLayout, 0);
	//   66  124:aload_0         
	//   67  125:aload_1         
	//   68  126:getstatic       #174 <Field int android.support.v7.appcompat.R$styleable.AlertDialog_singleChoiceItemLayout>
	//   69  129:iconst_0        
	//   70  130:invokevirtual   #154 <Method int TypedArray.getResourceId(int, int)>
	//   71  133:putfield        #176 <Field int mSingleChoiceItemLayout>
		mListItemLayout = ((TypedArray) (context)).getResourceId(android.support.v7.appcompat.R.styleable.AlertDialog_listItemLayout, 0);
	//   72  136:aload_0         
	//   73  137:aload_1         
	//   74  138:getstatic       #179 <Field int android.support.v7.appcompat.R$styleable.AlertDialog_listItemLayout>
	//   75  141:iconst_0        
	//   76  142:invokevirtual   #154 <Method int TypedArray.getResourceId(int, int)>
	//   77  145:putfield        #181 <Field int mListItemLayout>
		mShowTitle = ((TypedArray) (context)).getBoolean(android.support.v7.appcompat.R.styleable.AlertDialog_showTitle, true);
	//   78  148:aload_0         
	//   79  149:aload_1         
	//   80  150:getstatic       #184 <Field int android.support.v7.appcompat.R$styleable.AlertDialog_showTitle>
	//   81  153:iconst_1        
	//   82  154:invokevirtual   #188 <Method boolean TypedArray.getBoolean(int, boolean)>
	//   83  157:putfield        #190 <Field boolean mShowTitle>
		mButtonIconDimen = ((TypedArray) (context)).getDimensionPixelSize(android.support.v7.appcompat.R.styleable.AlertDialog_buttonIconDimen, 0);
	//   84  160:aload_0         
	//   85  161:aload_1         
	//   86  162:getstatic       #193 <Field int android.support.v7.appcompat.R$styleable.AlertDialog_buttonIconDimen>
	//   87  165:iconst_0        
	//   88  166:invokevirtual   #196 <Method int TypedArray.getDimensionPixelSize(int, int)>
	//   89  169:putfield        #198 <Field int mButtonIconDimen>
		((TypedArray) (context)).recycle();
	//   90  172:aload_1         
	//   91  173:invokevirtual   #201 <Method void TypedArray.recycle()>
		appcompatdialog.supportRequestWindowFeature(1);
	//   92  176:aload_2         
	//   93  177:iconst_1        
	//   94  178:invokevirtual   #207 <Method boolean AppCompatDialog.supportRequestWindowFeature(int)>
	//   95  181:pop             
	//   96  182:return          
	}

	static boolean canTextInput(View view)
	{
		if(view.onCheckIsTextEditor())
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #216 <Method boolean View.onCheckIsTextEditor()>
	//*   2    4:ifeq            9
			return true;
	//    3    7:iconst_1        
	//    4    8:ireturn         
		if(!(view instanceof ViewGroup))
	//*   5    9:aload_0         
	//*   6   10:instanceof      #218 <Class ViewGroup>
	//*   7   13:ifne            18
			return false;
	//    8   16:iconst_0        
	//    9   17:ireturn         
		view = ((View) ((ViewGroup)view));
	//   10   18:aload_0         
	//   11   19:checkcast       #218 <Class ViewGroup>
	//   12   22:astore_0        
		for(int i = ((ViewGroup) (view)).getChildCount(); i > 0;)
	//*  13   23:aload_0         
	//*  14   24:invokevirtual   #222 <Method int ViewGroup.getChildCount()>
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
	//*  26   40:invokevirtual   #226 <Method View ViewGroup.getChildAt(int)>
	//*  27   43:invokestatic    #228 <Method boolean canTextInput(View)>
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
	//    1    1:invokevirtual   #236 <Method android.view.ViewGroup$LayoutParams Button.getLayoutParams()>
	//    2    4:checkcast       #238 <Class android.widget.LinearLayout$LayoutParams>
	//    3    7:astore_2        
		layoutparams.gravity = 1;
	//    4    8:aload_2         
	//    5    9:iconst_1        
	//    6   10:putfield        #241 <Field int android.widget.LinearLayout$LayoutParams.gravity>
		layoutparams.weight = 0.5F;
	//    7   13:aload_2         
	//    8   14:ldc1            #242 <Float 0.5F>
	//    9   16:putfield        #246 <Field float android.widget.LinearLayout$LayoutParams.weight>
		button.setLayoutParams(((android.view.ViewGroup.LayoutParams) (layoutparams)));
	//   10   19:aload_1         
	//   11   20:aload_2         
	//   12   21:invokevirtual   #250 <Method void Button.setLayoutParams(android.view.ViewGroup$LayoutParams)>
	//   13   24:return          
	}

	static void manageScrollIndicators(View view, View view1, View view2)
	{
		byte byte2 = 4;
	//    0    0:iconst_4        
	//    1    1:istore          4
		if(view1 != null)
	//*   2    3:aload_1         
	//*   3    4:ifnull          27
		{
			byte byte0;
			if(view.canScrollVertically(-1))
	//*   4    7:aload_0         
	//*   5    8:iconst_m1       
	//*   6    9:invokevirtual   #255 <Method boolean View.canScrollVertically(int)>
	//*   7   12:ifeq            20
				byte0 = 0;
	//    8   15:iconst_0        
	//    9   16:istore_3        
			else
	//*  10   17:goto            22
				byte0 = 4;
	//   11   20:iconst_4        
	//   12   21:istore_3        
			view1.setVisibility(((int) (byte0)));
	//   13   22:aload_1         
	//   14   23:iload_3         
	//   15   24:invokevirtual   #259 <Method void View.setVisibility(int)>
		}
		if(view2 != null)
	//*  16   27:aload_2         
	//*  17   28:ifnull          49
		{
			byte byte1 = byte2;
	//   18   31:iload           4
	//   19   33:istore_3        
			if(view.canScrollVertically(1))
	//*  20   34:aload_0         
	//*  21   35:iconst_1        
	//*  22   36:invokevirtual   #255 <Method boolean View.canScrollVertically(int)>
	//*  23   39:ifeq            44
				byte1 = 0;
	//   24   42:iconst_0        
	//   25   43:istore_3        
			view2.setVisibility(((int) (byte1)));
	//   26   44:aload_2         
	//   27   45:iload_3         
	//   28   46:invokevirtual   #259 <Method void View.setVisibility(int)>
		}
	//   29   49:return          
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
	//*   5    7:instanceof      #264 <Class ViewStub>
	//*   6   10:ifeq            21
				view = ((ViewStub)view1).inflate();
	//    7   13:aload_2         
	//    8   14:checkcast       #264 <Class ViewStub>
	//    9   17:invokevirtual   #268 <Method View ViewStub.inflate()>
	//   10   20:astore_1        
			return (ViewGroup)view;
	//   11   21:aload_1         
	//   12   22:checkcast       #218 <Class ViewGroup>
	//   13   25:areturn         
		}
		if(view1 != null)
	//*  14   26:aload_2         
	//*  15   27:ifnull          50
		{
			android.view.ViewParent viewparent = view1.getParent();
	//   16   30:aload_2         
	//   17   31:invokevirtual   #272 <Method android.view.ViewParent View.getParent()>
	//   18   34:astore_3        
			if(viewparent instanceof ViewGroup)
	//*  19   35:aload_3         
	//*  20   36:instanceof      #218 <Class ViewGroup>
	//*  21   39:ifeq            50
				((ViewGroup)viewparent).removeView(view1);
	//   22   42:aload_3         
	//   23   43:checkcast       #218 <Class ViewGroup>
	//   24   46:aload_2         
	//   25   47:invokevirtual   #276 <Method void ViewGroup.removeView(View)>
		}
		view1 = view;
	//   26   50:aload_1         
	//   27   51:astore_2        
		if(view instanceof ViewStub)
	//*  28   52:aload_1         
	//*  29   53:instanceof      #264 <Class ViewStub>
	//*  30   56:ifeq            67
			view1 = ((ViewStub)view).inflate();
	//   31   59:aload_1         
	//   32   60:checkcast       #264 <Class ViewStub>
	//   33   63:invokevirtual   #268 <Method View ViewStub.inflate()>
	//   34   66:astore_2        
		return (ViewGroup)view1;
	//   35   67:aload_2         
	//   36   68:checkcast       #218 <Class ViewGroup>
	//   37   71:areturn         
	}

	private int selectContentView()
	{
		if(mButtonPanelSideLayout == 0)
	//*   0    0:aload_0         
	//*   1    1:getfield        #161 <Field int mButtonPanelSideLayout>
	//*   2    4:ifne            12
			return mAlertDialogLayout;
	//    3    7:aload_0         
	//    4    8:getfield        #156 <Field int mAlertDialogLayout>
	//    5   11:ireturn         
		if(mButtonPanelLayoutHint == 1)
	//*   6   12:aload_0         
	//*   7   13:getfield        #112 <Field int mButtonPanelLayoutHint>
	//*   8   16:iconst_1        
	//*   9   17:icmpne          25
			return mButtonPanelSideLayout;
	//   10   20:aload_0         
	//   11   21:getfield        #161 <Field int mButtonPanelSideLayout>
	//   12   24:ireturn         
		else
			return mAlertDialogLayout;
	//   13   25:aload_0         
	//   14   26:getfield        #156 <Field int mAlertDialogLayout>
	//   15   29:ireturn         
	}

	private void setScrollIndicators(ViewGroup viewgroup, final View top, int i, int j)
	{
		View view = mWindow.findViewById(android.support.v7.appcompat.R.id.scrollIndicatorUp);
	//    0    0:aload_0         
	//    1    1:getfield        #123 <Field Window mWindow>
	//    2    4:getstatic       #286 <Field int android.support.v7.appcompat.R$id.scrollIndicatorUp>
	//    3    7:invokevirtual   #291 <Method View Window.findViewById(int)>
	//    4   10:astore          6
		final View bottom = mWindow.findViewById(android.support.v7.appcompat.R.id.scrollIndicatorDown);
	//    5   12:aload_0         
	//    6   13:getfield        #123 <Field Window mWindow>
	//    7   16:getstatic       #294 <Field int android.support.v7.appcompat.R$id.scrollIndicatorDown>
	//    8   19:invokevirtual   #291 <Method View Window.findViewById(int)>
	//    9   22:astore          5
		if(android.os.Build.VERSION.SDK_INT >= 23)
	//*  10   24:getstatic       #299 <Field int android.os.Build$VERSION.SDK_INT>
	//*  11   27:bipush          23
	//*  12   29:icmplt          62
		{
			ViewCompat.setScrollIndicators(top, i, j);
	//   13   32:aload_2         
	//   14   33:iload_3         
	//   15   34:iload           4
	//   16   36:invokestatic    #304 <Method void ViewCompat.setScrollIndicators(View, int, int)>
			if(view != null)
	//*  17   39:aload           6
	//*  18   41:ifnull          50
				viewgroup.removeView(view);
	//   19   44:aload_1         
	//   20   45:aload           6
	//   21   47:invokevirtual   #276 <Method void ViewGroup.removeView(View)>
			if(bottom != null)
	//*  22   50:aload           5
	//*  23   52:ifnull          233
			{
				viewgroup.removeView(bottom);
	//   24   55:aload_1         
	//   25   56:aload           5
	//   26   58:invokevirtual   #276 <Method void ViewGroup.removeView(View)>
				return;
	//   27   61:return          
			}
		} else
		{
			Object obj = null;
	//   28   62:aconst_null     
	//   29   63:astore          7
			top = view;
	//   30   65:aload           6
	//   31   67:astore_2        
			if(view != null)
	//*  32   68:aload           6
	//*  33   70:ifnull          90
			{
				top = view;
	//   34   73:aload           6
	//   35   75:astore_2        
				if((i & 1) == 0)
	//*  36   76:iload_3         
	//*  37   77:iconst_1        
	//*  38   78:iand            
	//*  39   79:ifne            90
				{
					viewgroup.removeView(view);
	//   40   82:aload_1         
	//   41   83:aload           6
	//   42   85:invokevirtual   #276 <Method void ViewGroup.removeView(View)>
					top = null;
	//   43   88:aconst_null     
	//   44   89:astore_2        
				}
			}
			if(bottom != null && (i & 2) == 0)
	//*  45   90:aload           5
	//*  46   92:ifnull          114
	//*  47   95:iload_3         
	//*  48   96:iconst_2        
	//*  49   97:iand            
	//*  50   98:ifne            114
			{
				viewgroup.removeView(bottom);
	//   51  101:aload_1         
	//   52  102:aload           5
	//   53  104:invokevirtual   #276 <Method void ViewGroup.removeView(View)>
				bottom = ((View) (obj));
	//   54  107:aload           7
	//   55  109:astore          5
			}
	//*  56  111:goto            114
			if(top != null || bottom != null)
	//*  57  114:aload_2         
	//*  58  115:ifnonnull       123
	//*  59  118:aload           5
	//*  60  120:ifnull          233
			{
				if(mMessage != null)
	//*  61  123:aload_0         
	//*  62  124:getfield        #306 <Field CharSequence mMessage>
	//*  63  127:ifnull          168
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
	//   64  130:aload_0         
	//   65  131:getfield        #308 <Field NestedScrollView mScrollView>
	//   66  134:new             #8   <Class AlertController$2>
	//   67  137:dup             
	//   68  138:aload_0         
	//   69  139:aload_2         
	//   70  140:aload           5
	//   71  142:invokespecial   #311 <Method void AlertController$2(AlertController, View, View)>
	//   72  145:invokevirtual   #317 <Method void NestedScrollView.setOnScrollChangeListener(android.support.v4.widget.NestedScrollView$OnScrollChangeListener)>
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
	//   73  148:aload_0         
	//   74  149:getfield        #308 <Field NestedScrollView mScrollView>
	//   75  152:new             #10  <Class AlertController$3>
	//   76  155:dup             
	//   77  156:aload_0         
	//   78  157:aload_2         
	//   79  158:aload           5
	//   80  160:invokespecial   #318 <Method void AlertController$3(AlertController, View, View)>
	//   81  163:invokevirtual   #322 <Method boolean NestedScrollView.post(Runnable)>
	//   82  166:pop             
					return;
	//   83  167:return          
				}
				if(mListView != null)
	//*  84  168:aload_0         
	//*  85  169:getfield        #324 <Field ListView mListView>
	//*  86  172:ifnull          213
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
	//   87  175:aload_0         
	//   88  176:getfield        #324 <Field ListView mListView>
	//   89  179:new             #12  <Class AlertController$4>
	//   90  182:dup             
	//   91  183:aload_0         
	//   92  184:aload_2         
	//   93  185:aload           5
	//   94  187:invokespecial   #325 <Method void AlertController$4(AlertController, View, View)>
	//   95  190:invokevirtual   #331 <Method void ListView.setOnScrollListener(android.widget.AbsListView$OnScrollListener)>
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
	//   96  193:aload_0         
	//   97  194:getfield        #324 <Field ListView mListView>
	//   98  197:new             #14  <Class AlertController$5>
	//   99  200:dup             
	//  100  201:aload_0         
	//  101  202:aload_2         
	//  102  203:aload           5
	//  103  205:invokespecial   #332 <Method void AlertController$5(AlertController, View, View)>
	//  104  208:invokevirtual   #333 <Method boolean ListView.post(Runnable)>
	//  105  211:pop             
					return;
	//  106  212:return          
				}
				if(top != null)
	//* 107  213:aload_2         
	//* 108  214:ifnull          222
					viewgroup.removeView(top);
	//  109  217:aload_1         
	//  110  218:aload_2         
	//  111  219:invokevirtual   #276 <Method void ViewGroup.removeView(View)>
				if(bottom != null)
	//* 112  222:aload           5
	//* 113  224:ifnull          233
					viewgroup.removeView(bottom);
	//  114  227:aload_1         
	//  115  228:aload           5
	//  116  230:invokevirtual   #276 <Method void ViewGroup.removeView(View)>
			}
		}
	//  117  233:return          
	}

	private void setupButtons(ViewGroup viewgroup)
	{
		mButtonPositive = (Button)viewgroup.findViewById(0x1020019);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:ldc2            #336 <Int 0x1020019>
	//    3    5:invokevirtual   #337 <Method View ViewGroup.findViewById(int)>
	//    4    8:checkcast       #232 <Class Button>
	//    5   11:putfield        #339 <Field Button mButtonPositive>
		mButtonPositive.setOnClickListener(mButtonHandler);
	//    6   14:aload_0         
	//    7   15:getfield        #339 <Field Button mButtonPositive>
	//    8   18:aload_0         
	//    9   19:getfield        #117 <Field android.view.View$OnClickListener mButtonHandler>
	//   10   22:invokevirtual   #343 <Method void Button.setOnClickListener(android.view.View$OnClickListener)>
		boolean flag2 = TextUtils.isEmpty(mButtonPositiveText);
	//   11   25:aload_0         
	//   12   26:getfield        #345 <Field CharSequence mButtonPositiveText>
	//   13   29:invokestatic    #351 <Method boolean TextUtils.isEmpty(CharSequence)>
	//   14   32:istore          4
		boolean flag1 = true;
	//   15   34:iconst_1        
	//   16   35:istore_3        
		int i;
		if(flag2 && mButtonPositiveIcon == null)
	//*  17   36:iload           4
	//*  18   38:ifeq            62
	//*  19   41:aload_0         
	//*  20   42:getfield        #353 <Field Drawable mButtonPositiveIcon>
	//*  21   45:ifnonnull       62
		{
			mButtonPositive.setVisibility(8);
	//   22   48:aload_0         
	//   23   49:getfield        #339 <Field Button mButtonPositive>
	//   24   52:bipush          8
	//   25   54:invokevirtual   #354 <Method void Button.setVisibility(int)>
			i = 0;
	//   26   57:iconst_0        
	//   27   58:istore_2        
		} else
	//*  28   59:goto            121
		{
			mButtonPositive.setText(mButtonPositiveText);
	//   29   62:aload_0         
	//   30   63:getfield        #339 <Field Button mButtonPositive>
	//   31   66:aload_0         
	//   32   67:getfield        #345 <Field CharSequence mButtonPositiveText>
	//   33   70:invokevirtual   #358 <Method void Button.setText(CharSequence)>
			if(mButtonPositiveIcon != null)
	//*  34   73:aload_0         
	//*  35   74:getfield        #353 <Field Drawable mButtonPositiveIcon>
	//*  36   77:ifnull          111
			{
				mButtonPositiveIcon.setBounds(0, 0, mButtonIconDimen, mButtonIconDimen);
	//   37   80:aload_0         
	//   38   81:getfield        #353 <Field Drawable mButtonPositiveIcon>
	//   39   84:iconst_0        
	//   40   85:iconst_0        
	//   41   86:aload_0         
	//   42   87:getfield        #198 <Field int mButtonIconDimen>
	//   43   90:aload_0         
	//   44   91:getfield        #198 <Field int mButtonIconDimen>
	//   45   94:invokevirtual   #364 <Method void Drawable.setBounds(int, int, int, int)>
				mButtonPositive.setCompoundDrawables(mButtonPositiveIcon, ((Drawable) (null)), ((Drawable) (null)), ((Drawable) (null)));
	//   46   97:aload_0         
	//   47   98:getfield        #339 <Field Button mButtonPositive>
	//   48  101:aload_0         
	//   49  102:getfield        #353 <Field Drawable mButtonPositiveIcon>
	//   50  105:aconst_null     
	//   51  106:aconst_null     
	//   52  107:aconst_null     
	//   53  108:invokevirtual   #368 <Method void Button.setCompoundDrawables(Drawable, Drawable, Drawable, Drawable)>
			}
			mButtonPositive.setVisibility(0);
	//   54  111:aload_0         
	//   55  112:getfield        #339 <Field Button mButtonPositive>
	//   56  115:iconst_0        
	//   57  116:invokevirtual   #354 <Method void Button.setVisibility(int)>
			i = 1;
	//   58  119:iconst_1        
	//   59  120:istore_2        
		}
		mButtonNegative = (Button)viewgroup.findViewById(0x102001a);
	//   60  121:aload_0         
	//   61  122:aload_1         
	//   62  123:ldc2            #369 <Int 0x102001a>
	//   63  126:invokevirtual   #337 <Method View ViewGroup.findViewById(int)>
	//   64  129:checkcast       #232 <Class Button>
	//   65  132:putfield        #371 <Field Button mButtonNegative>
		mButtonNegative.setOnClickListener(mButtonHandler);
	//   66  135:aload_0         
	//   67  136:getfield        #371 <Field Button mButtonNegative>
	//   68  139:aload_0         
	//   69  140:getfield        #117 <Field android.view.View$OnClickListener mButtonHandler>
	//   70  143:invokevirtual   #343 <Method void Button.setOnClickListener(android.view.View$OnClickListener)>
		if(TextUtils.isEmpty(mButtonNegativeText) && mButtonNegativeIcon == null)
	//*  71  146:aload_0         
	//*  72  147:getfield        #373 <Field CharSequence mButtonNegativeText>
	//*  73  150:invokestatic    #351 <Method boolean TextUtils.isEmpty(CharSequence)>
	//*  74  153:ifeq            175
	//*  75  156:aload_0         
	//*  76  157:getfield        #375 <Field Drawable mButtonNegativeIcon>
	//*  77  160:ifnonnull       175
		{
			mButtonNegative.setVisibility(8);
	//   78  163:aload_0         
	//   79  164:getfield        #371 <Field Button mButtonNegative>
	//   80  167:bipush          8
	//   81  169:invokevirtual   #354 <Method void Button.setVisibility(int)>
		} else
	//*  82  172:goto            236
		{
			mButtonNegative.setText(mButtonNegativeText);
	//   83  175:aload_0         
	//   84  176:getfield        #371 <Field Button mButtonNegative>
	//   85  179:aload_0         
	//   86  180:getfield        #373 <Field CharSequence mButtonNegativeText>
	//   87  183:invokevirtual   #358 <Method void Button.setText(CharSequence)>
			if(mButtonNegativeIcon != null)
	//*  88  186:aload_0         
	//*  89  187:getfield        #375 <Field Drawable mButtonNegativeIcon>
	//*  90  190:ifnull          224
			{
				mButtonNegativeIcon.setBounds(0, 0, mButtonIconDimen, mButtonIconDimen);
	//   91  193:aload_0         
	//   92  194:getfield        #375 <Field Drawable mButtonNegativeIcon>
	//   93  197:iconst_0        
	//   94  198:iconst_0        
	//   95  199:aload_0         
	//   96  200:getfield        #198 <Field int mButtonIconDimen>
	//   97  203:aload_0         
	//   98  204:getfield        #198 <Field int mButtonIconDimen>
	//   99  207:invokevirtual   #364 <Method void Drawable.setBounds(int, int, int, int)>
				mButtonNegative.setCompoundDrawables(mButtonNegativeIcon, ((Drawable) (null)), ((Drawable) (null)), ((Drawable) (null)));
	//  100  210:aload_0         
	//  101  211:getfield        #371 <Field Button mButtonNegative>
	//  102  214:aload_0         
	//  103  215:getfield        #375 <Field Drawable mButtonNegativeIcon>
	//  104  218:aconst_null     
	//  105  219:aconst_null     
	//  106  220:aconst_null     
	//  107  221:invokevirtual   #368 <Method void Button.setCompoundDrawables(Drawable, Drawable, Drawable, Drawable)>
			}
			mButtonNegative.setVisibility(0);
	//  108  224:aload_0         
	//  109  225:getfield        #371 <Field Button mButtonNegative>
	//  110  228:iconst_0        
	//  111  229:invokevirtual   #354 <Method void Button.setVisibility(int)>
			i |= 2;
	//  112  232:iload_2         
	//  113  233:iconst_2        
	//  114  234:ior             
	//  115  235:istore_2        
		}
		mButtonNeutral = (Button)viewgroup.findViewById(0x102001b);
	//  116  236:aload_0         
	//  117  237:aload_1         
	//  118  238:ldc2            #376 <Int 0x102001b>
	//  119  241:invokevirtual   #337 <Method View ViewGroup.findViewById(int)>
	//  120  244:checkcast       #232 <Class Button>
	//  121  247:putfield        #378 <Field Button mButtonNeutral>
		mButtonNeutral.setOnClickListener(mButtonHandler);
	//  122  250:aload_0         
	//  123  251:getfield        #378 <Field Button mButtonNeutral>
	//  124  254:aload_0         
	//  125  255:getfield        #117 <Field android.view.View$OnClickListener mButtonHandler>
	//  126  258:invokevirtual   #343 <Method void Button.setOnClickListener(android.view.View$OnClickListener)>
		if(TextUtils.isEmpty(mButtonNeutralText) && mButtonNeutralIcon == null)
	//* 127  261:aload_0         
	//* 128  262:getfield        #380 <Field CharSequence mButtonNeutralText>
	//* 129  265:invokestatic    #351 <Method boolean TextUtils.isEmpty(CharSequence)>
	//* 130  268:ifeq            290
	//* 131  271:aload_0         
	//* 132  272:getfield        #382 <Field Drawable mButtonNeutralIcon>
	//* 133  275:ifnonnull       290
		{
			mButtonNeutral.setVisibility(8);
	//  134  278:aload_0         
	//  135  279:getfield        #378 <Field Button mButtonNeutral>
	//  136  282:bipush          8
	//  137  284:invokevirtual   #354 <Method void Button.setVisibility(int)>
		} else
	//* 138  287:goto            351
		{
			mButtonNeutral.setText(mButtonNeutralText);
	//  139  290:aload_0         
	//  140  291:getfield        #378 <Field Button mButtonNeutral>
	//  141  294:aload_0         
	//  142  295:getfield        #380 <Field CharSequence mButtonNeutralText>
	//  143  298:invokevirtual   #358 <Method void Button.setText(CharSequence)>
			if(mButtonPositiveIcon != null)
	//* 144  301:aload_0         
	//* 145  302:getfield        #353 <Field Drawable mButtonPositiveIcon>
	//* 146  305:ifnull          339
			{
				mButtonPositiveIcon.setBounds(0, 0, mButtonIconDimen, mButtonIconDimen);
	//  147  308:aload_0         
	//  148  309:getfield        #353 <Field Drawable mButtonPositiveIcon>
	//  149  312:iconst_0        
	//  150  313:iconst_0        
	//  151  314:aload_0         
	//  152  315:getfield        #198 <Field int mButtonIconDimen>
	//  153  318:aload_0         
	//  154  319:getfield        #198 <Field int mButtonIconDimen>
	//  155  322:invokevirtual   #364 <Method void Drawable.setBounds(int, int, int, int)>
				mButtonPositive.setCompoundDrawables(mButtonPositiveIcon, ((Drawable) (null)), ((Drawable) (null)), ((Drawable) (null)));
	//  156  325:aload_0         
	//  157  326:getfield        #339 <Field Button mButtonPositive>
	//  158  329:aload_0         
	//  159  330:getfield        #353 <Field Drawable mButtonPositiveIcon>
	//  160  333:aconst_null     
	//  161  334:aconst_null     
	//  162  335:aconst_null     
	//  163  336:invokevirtual   #368 <Method void Button.setCompoundDrawables(Drawable, Drawable, Drawable, Drawable)>
			}
			mButtonNeutral.setVisibility(0);
	//  164  339:aload_0         
	//  165  340:getfield        #378 <Field Button mButtonNeutral>
	//  166  343:iconst_0        
	//  167  344:invokevirtual   #354 <Method void Button.setVisibility(int)>
			i |= 4;
	//  168  347:iload_2         
	//  169  348:iconst_4        
	//  170  349:ior             
	//  171  350:istore_2        
		}
		if(shouldCenterSingleButton(mContext))
	//* 172  351:aload_0         
	//* 173  352:getfield        #119 <Field Context mContext>
	//* 174  355:invokestatic    #386 <Method boolean shouldCenterSingleButton(Context)>
	//* 175  358:ifeq            406
			if(i == 1)
	//* 176  361:iload_2         
	//* 177  362:iconst_1        
	//* 178  363:icmpne          377
				centerButton(mButtonPositive);
	//  179  366:aload_0         
	//  180  367:aload_0         
	//  181  368:getfield        #339 <Field Button mButtonPositive>
	//  182  371:invokespecial   #388 <Method void centerButton(Button)>
			else
	//* 183  374:goto            406
			if(i == 2)
	//* 184  377:iload_2         
	//* 185  378:iconst_2        
	//* 186  379:icmpne          393
				centerButton(mButtonNegative);
	//  187  382:aload_0         
	//  188  383:aload_0         
	//  189  384:getfield        #371 <Field Button mButtonNegative>
	//  190  387:invokespecial   #388 <Method void centerButton(Button)>
			else
	//* 191  390:goto            406
			if(i == 4)
	//* 192  393:iload_2         
	//* 193  394:iconst_4        
	//* 194  395:icmpne          406
				centerButton(mButtonNeutral);
	//  195  398:aload_0         
	//  196  399:aload_0         
	//  197  400:getfield        #378 <Field Button mButtonNeutral>
	//  198  403:invokespecial   #388 <Method void centerButton(Button)>
		boolean flag;
		if(i != 0)
	//* 199  406:iload_2         
	//* 200  407:ifeq            415
			flag = flag1;
	//  201  410:iload_3         
	//  202  411:istore_2        
		else
	//* 203  412:goto            417
			flag = false;
	//  204  415:iconst_0        
	//  205  416:istore_2        
		if(!flag)
	//* 206  417:iload_2         
	//* 207  418:ifne            427
			viewgroup.setVisibility(8);
	//  208  421:aload_1         
	//  209  422:bipush          8
	//  210  424:invokevirtual   #389 <Method void ViewGroup.setVisibility(int)>
	//  211  427:return          
	}

	private void setupContent(ViewGroup viewgroup)
	{
		mScrollView = (NestedScrollView)mWindow.findViewById(android.support.v7.appcompat.R.id.scrollView);
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #123 <Field Window mWindow>
	//    3    5:getstatic       #393 <Field int android.support.v7.appcompat.R$id.scrollView>
	//    4    8:invokevirtual   #291 <Method View Window.findViewById(int)>
	//    5   11:checkcast       #313 <Class NestedScrollView>
	//    6   14:putfield        #308 <Field NestedScrollView mScrollView>
		mScrollView.setFocusable(false);
	//    7   17:aload_0         
	//    8   18:getfield        #308 <Field NestedScrollView mScrollView>
	//    9   21:iconst_0        
	//   10   22:invokevirtual   #397 <Method void NestedScrollView.setFocusable(boolean)>
		mScrollView.setNestedScrollingEnabled(false);
	//   11   25:aload_0         
	//   12   26:getfield        #308 <Field NestedScrollView mScrollView>
	//   13   29:iconst_0        
	//   14   30:invokevirtual   #400 <Method void NestedScrollView.setNestedScrollingEnabled(boolean)>
		mMessageView = (TextView)viewgroup.findViewById(0x102000b);
	//   15   33:aload_0         
	//   16   34:aload_1         
	//   17   35:ldc2            #401 <Int 0x102000b>
	//   18   38:invokevirtual   #337 <Method View ViewGroup.findViewById(int)>
	//   19   41:checkcast       #403 <Class TextView>
	//   20   44:putfield        #405 <Field TextView mMessageView>
		if(mMessageView == null)
	//*  21   47:aload_0         
	//*  22   48:getfield        #405 <Field TextView mMessageView>
	//*  23   51:ifnonnull       55
			return;
	//   24   54:return          
		if(mMessage != null)
	//*  25   55:aload_0         
	//*  26   56:getfield        #306 <Field CharSequence mMessage>
	//*  27   59:ifnull          74
		{
			mMessageView.setText(mMessage);
	//   28   62:aload_0         
	//   29   63:getfield        #405 <Field TextView mMessageView>
	//   30   66:aload_0         
	//   31   67:getfield        #306 <Field CharSequence mMessage>
	//   32   70:invokevirtual   #406 <Method void TextView.setText(CharSequence)>
			return;
	//   33   73:return          
		}
		mMessageView.setVisibility(8);
	//   34   74:aload_0         
	//   35   75:getfield        #405 <Field TextView mMessageView>
	//   36   78:bipush          8
	//   37   80:invokevirtual   #407 <Method void TextView.setVisibility(int)>
		mScrollView.removeView(((View) (mMessageView)));
	//   38   83:aload_0         
	//   39   84:getfield        #308 <Field NestedScrollView mScrollView>
	//   40   87:aload_0         
	//   41   88:getfield        #405 <Field TextView mMessageView>
	//   42   91:invokevirtual   #408 <Method void NestedScrollView.removeView(View)>
		if(mListView != null)
	//*  43   94:aload_0         
	//*  44   95:getfield        #324 <Field ListView mListView>
	//*  45   98:ifnull          145
		{
			viewgroup = (ViewGroup)mScrollView.getParent();
	//   46  101:aload_0         
	//   47  102:getfield        #308 <Field NestedScrollView mScrollView>
	//   48  105:invokevirtual   #409 <Method android.view.ViewParent NestedScrollView.getParent()>
	//   49  108:checkcast       #218 <Class ViewGroup>
	//   50  111:astore_1        
			int i = viewgroup.indexOfChild(((View) (mScrollView)));
	//   51  112:aload_1         
	//   52  113:aload_0         
	//   53  114:getfield        #308 <Field NestedScrollView mScrollView>
	//   54  117:invokevirtual   #413 <Method int ViewGroup.indexOfChild(View)>
	//   55  120:istore_2        
			viewgroup.removeViewAt(i);
	//   56  121:aload_1         
	//   57  122:iload_2         
	//   58  123:invokevirtual   #416 <Method void ViewGroup.removeViewAt(int)>
			viewgroup.addView(((View) (mListView)), i, new android.view.ViewGroup.LayoutParams(-1, -1));
	//   59  126:aload_1         
	//   60  127:aload_0         
	//   61  128:getfield        #324 <Field ListView mListView>
	//   62  131:iload_2         
	//   63  132:new             #418 <Class android.view.ViewGroup$LayoutParams>
	//   64  135:dup             
	//   65  136:iconst_m1       
	//   66  137:iconst_m1       
	//   67  138:invokespecial   #421 <Method void android.view.ViewGroup$LayoutParams(int, int)>
	//   68  141:invokevirtual   #425 <Method void ViewGroup.addView(View, int, android.view.ViewGroup$LayoutParams)>
			return;
	//   69  144:return          
		} else
		{
			viewgroup.setVisibility(8);
	//   70  145:aload_1         
	//   71  146:bipush          8
	//   72  148:invokevirtual   #389 <Method void ViewGroup.setVisibility(int)>
			return;
	//   73  151:return          
		}
	}

	private void setupCustomContent(ViewGroup viewgroup)
	{
		View view = mView;
	//    0    0:aload_0         
	//    1    1:getfield        #428 <Field View mView>
	//    2    4:astore_3        
		boolean flag = false;
	//    3    5:iconst_0        
	//    4    6:istore_2        
		if(view != null)
	//*   5    7:aload_3         
	//*   6    8:ifnull          19
			view = mView;
	//    7   11:aload_0         
	//    8   12:getfield        #428 <Field View mView>
	//    9   15:astore_3        
		else
	//*  10   16:goto            48
		if(mViewLayoutResId != 0)
	//*  11   19:aload_0         
	//*  12   20:getfield        #430 <Field int mViewLayoutResId>
	//*  13   23:ifeq            46
			view = LayoutInflater.from(mContext).inflate(mViewLayoutResId, viewgroup, false);
	//   14   26:aload_0         
	//   15   27:getfield        #119 <Field Context mContext>
	//   16   30:invokestatic    #436 <Method LayoutInflater LayoutInflater.from(Context)>
	//   17   33:aload_0         
	//   18   34:getfield        #430 <Field int mViewLayoutResId>
	//   19   37:aload_1         
	//   20   38:iconst_0        
	//   21   39:invokevirtual   #439 <Method View LayoutInflater.inflate(int, ViewGroup, boolean)>
	//   22   42:astore_3        
		else
	//*  23   43:goto            48
			view = null;
	//   24   46:aconst_null     
	//   25   47:astore_3        
		if(view != null)
	//*  26   48:aload_3         
	//*  27   49:ifnull          54
			flag = true;
	//   28   52:iconst_1        
	//   29   53:istore_2        
		if(!flag || !canTextInput(view))
	//*  30   54:iload_2         
	//*  31   55:ifeq            65
	//*  32   58:aload_3         
	//*  33   59:invokestatic    #228 <Method boolean canTextInput(View)>
	//*  34   62:ifne            78
			mWindow.setFlags(0x20000, 0x20000);
	//   35   65:aload_0         
	//   36   66:getfield        #123 <Field Window mWindow>
	//   37   69:ldc2            #440 <Int 0x20000>
	//   38   72:ldc2            #440 <Int 0x20000>
	//   39   75:invokevirtual   #443 <Method void Window.setFlags(int, int)>
		if(flag)
	//*  40   78:iload_2         
	//*  41   79:ifeq            159
		{
			FrameLayout framelayout = (FrameLayout)mWindow.findViewById(android.support.v7.appcompat.R.id.custom);
	//   42   82:aload_0         
	//   43   83:getfield        #123 <Field Window mWindow>
	//   44   86:getstatic       #446 <Field int android.support.v7.appcompat.R$id.custom>
	//   45   89:invokevirtual   #291 <Method View Window.findViewById(int)>
	//   46   92:checkcast       #448 <Class FrameLayout>
	//   47   95:astore          4
			framelayout.addView(view, new android.view.ViewGroup.LayoutParams(-1, -1));
	//   48   97:aload           4
	//   49   99:aload_3         
	//   50  100:new             #418 <Class android.view.ViewGroup$LayoutParams>
	//   51  103:dup             
	//   52  104:iconst_m1       
	//   53  105:iconst_m1       
	//   54  106:invokespecial   #421 <Method void android.view.ViewGroup$LayoutParams(int, int)>
	//   55  109:invokevirtual   #451 <Method void FrameLayout.addView(View, android.view.ViewGroup$LayoutParams)>
			if(mViewSpacingSpecified)
	//*  56  112:aload_0         
	//*  57  113:getfield        #106 <Field boolean mViewSpacingSpecified>
	//*  58  116:ifeq            140
				framelayout.setPadding(mViewSpacingLeft, mViewSpacingTop, mViewSpacingRight, mViewSpacingBottom);
	//   59  119:aload           4
	//   60  121:aload_0         
	//   61  122:getfield        #453 <Field int mViewSpacingLeft>
	//   62  125:aload_0         
	//   63  126:getfield        #455 <Field int mViewSpacingTop>
	//   64  129:aload_0         
	//   65  130:getfield        #457 <Field int mViewSpacingRight>
	//   66  133:aload_0         
	//   67  134:getfield        #459 <Field int mViewSpacingBottom>
	//   68  137:invokevirtual   #462 <Method void FrameLayout.setPadding(int, int, int, int)>
			if(mListView != null)
	//*  69  140:aload_0         
	//*  70  141:getfield        #324 <Field ListView mListView>
	//*  71  144:ifnull          165
			{
				((android.support.v7.widget.LinearLayoutCompat.LayoutParams)viewgroup.getLayoutParams()).weight = 0.0F;
	//   72  147:aload_1         
	//   73  148:invokevirtual   #463 <Method android.view.ViewGroup$LayoutParams ViewGroup.getLayoutParams()>
	//   74  151:checkcast       #465 <Class android.support.v7.widget.LinearLayoutCompat$LayoutParams>
	//   75  154:fconst_0        
	//   76  155:putfield        #466 <Field float android.support.v7.widget.LinearLayoutCompat$LayoutParams.weight>
				return;
	//   77  158:return          
			}
		} else
		{
			viewgroup.setVisibility(8);
	//   78  159:aload_1         
	//   79  160:bipush          8
	//   80  162:invokevirtual   #389 <Method void ViewGroup.setVisibility(int)>
		}
	//   81  165:return          
	}

	private void setupTitle(ViewGroup viewgroup)
	{
		if(mCustomTitleView != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #469 <Field View mCustomTitleView>
	//*   2    4:ifnull          44
		{
			android.view.ViewGroup.LayoutParams layoutparams = new android.view.ViewGroup.LayoutParams(-1, -2);
	//    3    7:new             #418 <Class android.view.ViewGroup$LayoutParams>
	//    4   10:dup             
	//    5   11:iconst_m1       
	//    6   12:bipush          -2
	//    7   14:invokespecial   #421 <Method void android.view.ViewGroup$LayoutParams(int, int)>
	//    8   17:astore_2        
			viewgroup.addView(mCustomTitleView, 0, layoutparams);
	//    9   18:aload_1         
	//   10   19:aload_0         
	//   11   20:getfield        #469 <Field View mCustomTitleView>
	//   12   23:iconst_0        
	//   13   24:aload_2         
	//   14   25:invokevirtual   #425 <Method void ViewGroup.addView(View, int, android.view.ViewGroup$LayoutParams)>
			mWindow.findViewById(android.support.v7.appcompat.R.id.title_template).setVisibility(8);
	//   15   28:aload_0         
	//   16   29:getfield        #123 <Field Window mWindow>
	//   17   32:getstatic       #472 <Field int android.support.v7.appcompat.R$id.title_template>
	//   18   35:invokevirtual   #291 <Method View Window.findViewById(int)>
	//   19   38:bipush          8
	//   20   40:invokevirtual   #259 <Method void View.setVisibility(int)>
			return;
	//   21   43:return          
		}
		mIconView = (ImageView)mWindow.findViewById(0x1020006);
	//   22   44:aload_0         
	//   23   45:aload_0         
	//   24   46:getfield        #123 <Field Window mWindow>
	//   25   49:ldc2            #473 <Int 0x1020006>
	//   26   52:invokevirtual   #291 <Method View Window.findViewById(int)>
	//   27   55:checkcast       #475 <Class ImageView>
	//   28   58:putfield        #477 <Field ImageView mIconView>
		if(TextUtils.isEmpty(mTitle) ^ true && mShowTitle)
	//*  29   61:aload_0         
	//*  30   62:getfield        #479 <Field CharSequence mTitle>
	//*  31   65:invokestatic    #351 <Method boolean TextUtils.isEmpty(CharSequence)>
	//*  32   68:iconst_1        
	//*  33   69:ixor            
	//*  34   70:ifeq            191
	//*  35   73:aload_0         
	//*  36   74:getfield        #190 <Field boolean mShowTitle>
	//*  37   77:ifeq            191
		{
			mTitleView = (TextView)mWindow.findViewById(android.support.v7.appcompat.R.id.alertTitle);
	//   38   80:aload_0         
	//   39   81:aload_0         
	//   40   82:getfield        #123 <Field Window mWindow>
	//   41   85:getstatic       #482 <Field int android.support.v7.appcompat.R$id.alertTitle>
	//   42   88:invokevirtual   #291 <Method View Window.findViewById(int)>
	//   43   91:checkcast       #403 <Class TextView>
	//   44   94:putfield        #484 <Field TextView mTitleView>
			mTitleView.setText(mTitle);
	//   45   97:aload_0         
	//   46   98:getfield        #484 <Field TextView mTitleView>
	//   47  101:aload_0         
	//   48  102:getfield        #479 <Field CharSequence mTitle>
	//   49  105:invokevirtual   #406 <Method void TextView.setText(CharSequence)>
			if(mIconId != 0)
	//*  50  108:aload_0         
	//*  51  109:getfield        #108 <Field int mIconId>
	//*  52  112:ifeq            127
			{
				mIconView.setImageResource(mIconId);
	//   53  115:aload_0         
	//   54  116:getfield        #477 <Field ImageView mIconView>
	//   55  119:aload_0         
	//   56  120:getfield        #108 <Field int mIconId>
	//   57  123:invokevirtual   #487 <Method void ImageView.setImageResource(int)>
				return;
	//   58  126:return          
			}
			if(mIcon != null)
	//*  59  127:aload_0         
	//*  60  128:getfield        #489 <Field Drawable mIcon>
	//*  61  131:ifnull          146
			{
				mIconView.setImageDrawable(mIcon);
	//   62  134:aload_0         
	//   63  135:getfield        #477 <Field ImageView mIconView>
	//   64  138:aload_0         
	//   65  139:getfield        #489 <Field Drawable mIcon>
	//   66  142:invokevirtual   #493 <Method void ImageView.setImageDrawable(Drawable)>
				return;
	//   67  145:return          
			} else
			{
				mTitleView.setPadding(mIconView.getPaddingLeft(), mIconView.getPaddingTop(), mIconView.getPaddingRight(), mIconView.getPaddingBottom());
	//   68  146:aload_0         
	//   69  147:getfield        #484 <Field TextView mTitleView>
	//   70  150:aload_0         
	//   71  151:getfield        #477 <Field ImageView mIconView>
	//   72  154:invokevirtual   #496 <Method int ImageView.getPaddingLeft()>
	//   73  157:aload_0         
	//   74  158:getfield        #477 <Field ImageView mIconView>
	//   75  161:invokevirtual   #499 <Method int ImageView.getPaddingTop()>
	//   76  164:aload_0         
	//   77  165:getfield        #477 <Field ImageView mIconView>
	//   78  168:invokevirtual   #502 <Method int ImageView.getPaddingRight()>
	//   79  171:aload_0         
	//   80  172:getfield        #477 <Field ImageView mIconView>
	//   81  175:invokevirtual   #505 <Method int ImageView.getPaddingBottom()>
	//   82  178:invokevirtual   #506 <Method void TextView.setPadding(int, int, int, int)>
				mIconView.setVisibility(8);
	//   83  181:aload_0         
	//   84  182:getfield        #477 <Field ImageView mIconView>
	//   85  185:bipush          8
	//   86  187:invokevirtual   #507 <Method void ImageView.setVisibility(int)>
				return;
	//   87  190:return          
			}
		} else
		{
			mWindow.findViewById(android.support.v7.appcompat.R.id.title_template).setVisibility(8);
	//   88  191:aload_0         
	//   89  192:getfield        #123 <Field Window mWindow>
	//   90  195:getstatic       #472 <Field int android.support.v7.appcompat.R$id.title_template>
	//   91  198:invokevirtual   #291 <Method View Window.findViewById(int)>
	//   92  201:bipush          8
	//   93  203:invokevirtual   #259 <Method void View.setVisibility(int)>
			mIconView.setVisibility(8);
	//   94  206:aload_0         
	//   95  207:getfield        #477 <Field ImageView mIconView>
	//   96  210:bipush          8
	//   97  212:invokevirtual   #507 <Method void ImageView.setVisibility(int)>
			viewgroup.setVisibility(8);
	//   98  215:aload_1         
	//   99  216:bipush          8
	//  100  218:invokevirtual   #389 <Method void ViewGroup.setVisibility(int)>
			return;
	//  101  221:return          
		}
	}

	private void setupView()
	{
		Object obj3 = ((Object) (mWindow.findViewById(android.support.v7.appcompat.R.id.parentPanel)));
	//    0    0:aload_0         
	//    1    1:getfield        #123 <Field Window mWindow>
	//    2    4:getstatic       #511 <Field int android.support.v7.appcompat.R$id.parentPanel>
	//    3    7:invokevirtual   #291 <Method View Window.findViewById(int)>
	//    4   10:astore          8
		Object obj2 = ((Object) (((View) (obj3)).findViewById(android.support.v7.appcompat.R.id.topPanel)));
	//    5   12:aload           8
	//    6   14:getstatic       #514 <Field int android.support.v7.appcompat.R$id.topPanel>
	//    7   17:invokevirtual   #515 <Method View View.findViewById(int)>
	//    8   20:astore          7
		Object obj1 = ((Object) (((View) (obj3)).findViewById(android.support.v7.appcompat.R.id.contentPanel)));
	//    9   22:aload           8
	//   10   24:getstatic       #518 <Field int android.support.v7.appcompat.R$id.contentPanel>
	//   11   27:invokevirtual   #515 <Method View View.findViewById(int)>
	//   12   30:astore          6
		Object obj = ((Object) (((View) (obj3)).findViewById(android.support.v7.appcompat.R.id.buttonPanel)));
	//   13   32:aload           8
	//   14   34:getstatic       #521 <Field int android.support.v7.appcompat.R$id.buttonPanel>
	//   15   37:invokevirtual   #515 <Method View View.findViewById(int)>
	//   16   40:astore          5
		obj3 = ((Object) ((ViewGroup)((View) (obj3)).findViewById(android.support.v7.appcompat.R.id.customPanel)));
	//   17   42:aload           8
	//   18   44:getstatic       #524 <Field int android.support.v7.appcompat.R$id.customPanel>
	//   19   47:invokevirtual   #515 <Method View View.findViewById(int)>
	//   20   50:checkcast       #218 <Class ViewGroup>
	//   21   53:astore          8
		setupCustomContent(((ViewGroup) (obj3)));
	//   22   55:aload_0         
	//   23   56:aload           8
	//   24   58:invokespecial   #526 <Method void setupCustomContent(ViewGroup)>
		View view2 = ((ViewGroup) (obj3)).findViewById(android.support.v7.appcompat.R.id.topPanel);
	//   25   61:aload           8
	//   26   63:getstatic       #514 <Field int android.support.v7.appcompat.R$id.topPanel>
	//   27   66:invokevirtual   #337 <Method View ViewGroup.findViewById(int)>
	//   28   69:astore          11
		View view1 = ((ViewGroup) (obj3)).findViewById(android.support.v7.appcompat.R.id.contentPanel);
	//   29   71:aload           8
	//   30   73:getstatic       #518 <Field int android.support.v7.appcompat.R$id.contentPanel>
	//   31   76:invokevirtual   #337 <Method View ViewGroup.findViewById(int)>
	//   32   79:astore          10
		View view = ((ViewGroup) (obj3)).findViewById(android.support.v7.appcompat.R.id.buttonPanel);
	//   33   81:aload           8
	//   34   83:getstatic       #521 <Field int android.support.v7.appcompat.R$id.buttonPanel>
	//   35   86:invokevirtual   #337 <Method View ViewGroup.findViewById(int)>
	//   36   89:astore          9
		obj2 = ((Object) (resolvePanel(view2, ((View) (obj2)))));
	//   37   91:aload_0         
	//   38   92:aload           11
	//   39   94:aload           7
	//   40   96:invokespecial   #528 <Method ViewGroup resolvePanel(View, View)>
	//   41   99:astore          7
		obj1 = ((Object) (resolvePanel(view1, ((View) (obj1)))));
	//   42  101:aload_0         
	//   43  102:aload           10
	//   44  104:aload           6
	//   45  106:invokespecial   #528 <Method ViewGroup resolvePanel(View, View)>
	//   46  109:astore          6
		obj = ((Object) (resolvePanel(view, ((View) (obj)))));
	//   47  111:aload_0         
	//   48  112:aload           9
	//   49  114:aload           5
	//   50  116:invokespecial   #528 <Method ViewGroup resolvePanel(View, View)>
	//   51  119:astore          5
		setupContent(((ViewGroup) (obj1)));
	//   52  121:aload_0         
	//   53  122:aload           6
	//   54  124:invokespecial   #530 <Method void setupContent(ViewGroup)>
		setupButtons(((ViewGroup) (obj)));
	//   55  127:aload_0         
	//   56  128:aload           5
	//   57  130:invokespecial   #532 <Method void setupButtons(ViewGroup)>
		setupTitle(((ViewGroup) (obj2)));
	//   58  133:aload_0         
	//   59  134:aload           7
	//   60  136:invokespecial   #534 <Method void setupTitle(ViewGroup)>
		boolean flag1 = false;
	//   61  139:iconst_0        
	//   62  140:istore_2        
		boolean flag;
		if(obj3 != null && ((ViewGroup) (obj3)).getVisibility() != 8)
	//*  63  141:aload           8
	//*  64  143:ifnull          161
	//*  65  146:aload           8
	//*  66  148:invokevirtual   #537 <Method int ViewGroup.getVisibility()>
	//*  67  151:bipush          8
	//*  68  153:icmpeq          161
			flag = true;
	//   69  156:iconst_1        
	//   70  157:istore_1        
		else
	//*  71  158:goto            163
			flag = false;
	//   72  161:iconst_0        
	//   73  162:istore_1        
		boolean flag2;
		if(obj2 != null && ((ViewGroup) (obj2)).getVisibility() != 8)
	//*  74  163:aload           7
	//*  75  165:ifnull          183
	//*  76  168:aload           7
	//*  77  170:invokevirtual   #537 <Method int ViewGroup.getVisibility()>
	//*  78  173:bipush          8
	//*  79  175:icmpeq          183
			flag2 = true;
	//   80  178:iconst_1        
	//   81  179:istore_3        
		else
	//*  82  180:goto            185
			flag2 = false;
	//   83  183:iconst_0        
	//   84  184:istore_3        
		boolean flag3;
		if(obj != null && ((ViewGroup) (obj)).getVisibility() != 8)
	//*  85  185:aload           5
	//*  86  187:ifnull          206
	//*  87  190:aload           5
	//*  88  192:invokevirtual   #537 <Method int ViewGroup.getVisibility()>
	//*  89  195:bipush          8
	//*  90  197:icmpeq          206
			flag3 = true;
	//   91  200:iconst_1        
	//   92  201:istore          4
		else
	//*  93  203:goto            209
			flag3 = false;
	//   94  206:iconst_0        
	//   95  207:istore          4
		if(!flag3 && obj1 != null)
	//*  96  209:iload           4
	//*  97  211:ifne            240
	//*  98  214:aload           6
	//*  99  216:ifnull          240
		{
			obj = ((Object) (((ViewGroup) (obj1)).findViewById(android.support.v7.appcompat.R.id.textSpacerNoButtons)));
	//  100  219:aload           6
	//  101  221:getstatic       #540 <Field int android.support.v7.appcompat.R$id.textSpacerNoButtons>
	//  102  224:invokevirtual   #337 <Method View ViewGroup.findViewById(int)>
	//  103  227:astore          5
			if(obj != null)
	//* 104  229:aload           5
	//* 105  231:ifnull          240
				((View) (obj)).setVisibility(0);
	//  106  234:aload           5
	//  107  236:iconst_0        
	//  108  237:invokevirtual   #259 <Method void View.setVisibility(int)>
		}
		if(flag2)
	//* 109  240:iload_3         
	//* 110  241:ifeq            300
		{
			if(mScrollView != null)
	//* 111  244:aload_0         
	//* 112  245:getfield        #308 <Field NestedScrollView mScrollView>
	//* 113  248:ifnull          259
				mScrollView.setClipToPadding(true);
	//  114  251:aload_0         
	//  115  252:getfield        #308 <Field NestedScrollView mScrollView>
	//  116  255:iconst_1        
	//  117  256:invokevirtual   #543 <Method void NestedScrollView.setClipToPadding(boolean)>
			obj = null;
	//  118  259:aconst_null     
	//  119  260:astore          5
			if(mMessage != null || mListView != null)
	//* 120  262:aload_0         
	//* 121  263:getfield        #306 <Field CharSequence mMessage>
	//* 122  266:ifnonnull       276
	//* 123  269:aload_0         
	//* 124  270:getfield        #324 <Field ListView mListView>
	//* 125  273:ifnull          286
				obj = ((Object) (((ViewGroup) (obj2)).findViewById(android.support.v7.appcompat.R.id.titleDividerNoCustom)));
	//  126  276:aload           7
	//  127  278:getstatic       #546 <Field int android.support.v7.appcompat.R$id.titleDividerNoCustom>
	//  128  281:invokevirtual   #337 <Method View ViewGroup.findViewById(int)>
	//  129  284:astore          5
			if(obj != null)
	//* 130  286:aload           5
	//* 131  288:ifnull          326
				((View) (obj)).setVisibility(0);
	//  132  291:aload           5
	//  133  293:iconst_0        
	//  134  294:invokevirtual   #259 <Method void View.setVisibility(int)>
		} else
	//* 135  297:goto            326
		if(obj1 != null)
	//* 136  300:aload           6
	//* 137  302:ifnull          326
		{
			obj = ((Object) (((ViewGroup) (obj1)).findViewById(android.support.v7.appcompat.R.id.textSpacerNoTitle)));
	//  138  305:aload           6
	//  139  307:getstatic       #549 <Field int android.support.v7.appcompat.R$id.textSpacerNoTitle>
	//  140  310:invokevirtual   #337 <Method View ViewGroup.findViewById(int)>
	//  141  313:astore          5
			if(obj != null)
	//* 142  315:aload           5
	//* 143  317:ifnull          326
				((View) (obj)).setVisibility(0);
	//  144  320:aload           5
	//  145  322:iconst_0        
	//  146  323:invokevirtual   #259 <Method void View.setVisibility(int)>
		}
		if(mListView instanceof RecycleListView)
	//* 147  326:aload_0         
	//* 148  327:getfield        #324 <Field ListView mListView>
	//* 149  330:instanceof      #36  <Class AlertController$RecycleListView>
	//* 150  333:ifeq            349
			((RecycleListView)mListView).setHasDecor(flag2, flag3);
	//  151  336:aload_0         
	//  152  337:getfield        #324 <Field ListView mListView>
	//  153  340:checkcast       #36  <Class AlertController$RecycleListView>
	//  154  343:iload_3         
	//  155  344:iload           4
	//  156  346:invokevirtual   #553 <Method void AlertController$RecycleListView.setHasDecor(boolean, boolean)>
		if(!flag)
	//* 157  349:iload_1         
	//* 158  350:ifne            401
		{
			if(mListView != null)
	//* 159  353:aload_0         
	//* 160  354:getfield        #324 <Field ListView mListView>
	//* 161  357:ifnull          369
				obj = ((Object) (mListView));
	//  162  360:aload_0         
	//  163  361:getfield        #324 <Field ListView mListView>
	//  164  364:astore          5
			else
	//* 165  366:goto            375
				obj = ((Object) (mScrollView));
	//  166  369:aload_0         
	//  167  370:getfield        #308 <Field NestedScrollView mScrollView>
	//  168  373:astore          5
			if(obj != null)
	//* 169  375:aload           5
	//* 170  377:ifnull          401
			{
				byte byte0 = ((byte) (flag1));
	//  171  380:iload_2         
	//  172  381:istore_1        
				if(flag3)
	//* 173  382:iload           4
	//* 174  384:ifeq            389
					byte0 = 2;
	//  175  387:iconst_2        
	//  176  388:istore_1        
				setScrollIndicators(((ViewGroup) (obj1)), ((View) (obj)), flag2 | byte0, 3);
	//  177  389:aload_0         
	//  178  390:aload           6
	//  179  392:aload           5
	//  180  394:iload_3         
	//  181  395:iload_1         
	//  182  396:ior             
	//  183  397:iconst_3        
	//  184  398:invokespecial   #555 <Method void setScrollIndicators(ViewGroup, View, int, int)>
			}
		}
		obj = ((Object) (mListView));
	//  185  401:aload_0         
	//  186  402:getfield        #324 <Field ListView mListView>
	//  187  405:astore          5
		if(obj != null && mAdapter != null)
	//* 188  407:aload           5
	//* 189  409:ifnull          451
	//* 190  412:aload_0         
	//* 191  413:getfield        #557 <Field ListAdapter mAdapter>
	//* 192  416:ifnull          451
		{
			((ListView) (obj)).setAdapter(mAdapter);
	//  193  419:aload           5
	//  194  421:aload_0         
	//  195  422:getfield        #557 <Field ListAdapter mAdapter>
	//  196  425:invokevirtual   #561 <Method void ListView.setAdapter(ListAdapter)>
			int i = mCheckedItem;
	//  197  428:aload_0         
	//  198  429:getfield        #110 <Field int mCheckedItem>
	//  199  432:istore_1        
			if(i > -1)
	//* 200  433:iload_1         
	//* 201  434:iconst_m1       
	//* 202  435:icmple          451
			{
				((ListView) (obj)).setItemChecked(i, true);
	//  203  438:aload           5
	//  204  440:iload_1         
	//  205  441:iconst_1        
	//  206  442:invokevirtual   #565 <Method void ListView.setItemChecked(int, boolean)>
				((ListView) (obj)).setSelection(i);
	//  207  445:aload           5
	//  208  447:iload_1         
	//  209  448:invokevirtual   #568 <Method void ListView.setSelection(int)>
			}
		}
	//  210  451:return          
	}

	private static boolean shouldCenterSingleButton(Context context)
	{
		TypedValue typedvalue = new TypedValue();
	//    0    0:new             #570 <Class TypedValue>
	//    1    3:dup             
	//    2    4:invokespecial   #571 <Method void TypedValue()>
	//    3    7:astore_1        
		context.getTheme().resolveAttribute(android.support.v7.appcompat.R.attr.alertDialogCenterButtons, typedvalue, true);
	//    4    8:aload_0         
	//    5    9:invokevirtual   #575 <Method android.content.res.Resources$Theme Context.getTheme()>
	//    6   12:getstatic       #578 <Field int android.support.v7.appcompat.R$attr.alertDialogCenterButtons>
	//    7   15:aload_1         
	//    8   16:iconst_1        
	//    9   17:invokevirtual   #584 <Method boolean android.content.res.Resources$Theme.resolveAttribute(int, TypedValue, boolean)>
	//   10   20:pop             
		return typedvalue.data != 0;
	//   11   21:aload_1         
	//   12   22:getfield        #587 <Field int TypedValue.data>
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
	//	               -3 40
	//	               -2 35
	//	               -1 30
		default:
			return null;
	//    2   28:aconst_null     
	//    3   29:areturn         

		case -1: 
			return mButtonPositive;
	//    4   30:aload_0         
	//    5   31:getfield        #339 <Field Button mButtonPositive>
	//    6   34:areturn         

		case -2: 
			return mButtonNegative;
	//    7   35:aload_0         
	//    8   36:getfield        #371 <Field Button mButtonNegative>
	//    9   39:areturn         

		case -3: 
			return mButtonNeutral;
	//   10   40:aload_0         
	//   11   41:getfield        #378 <Field Button mButtonNeutral>
	//   12   44:areturn         
		}
	}

	public int getIconAttributeResId(int i)
	{
		TypedValue typedvalue = new TypedValue();
	//    0    0:new             #570 <Class TypedValue>
	//    1    3:dup             
	//    2    4:invokespecial   #571 <Method void TypedValue()>
	//    3    7:astore_2        
		mContext.getTheme().resolveAttribute(i, typedvalue, true);
	//    4    8:aload_0         
	//    5    9:getfield        #119 <Field Context mContext>
	//    6   12:invokevirtual   #575 <Method android.content.res.Resources$Theme Context.getTheme()>
	//    7   15:iload_1         
	//    8   16:aload_2         
	//    9   17:iconst_1        
	//   10   18:invokevirtual   #584 <Method boolean android.content.res.Resources$Theme.resolveAttribute(int, TypedValue, boolean)>
	//   11   21:pop             
		return typedvalue.resourceId;
	//   12   22:aload_2         
	//   13   23:getfield        #594 <Field int TypedValue.resourceId>
	//   14   26:ireturn         
	}

	public ListView getListView()
	{
		return mListView;
	//    0    0:aload_0         
	//    1    1:getfield        #324 <Field ListView mListView>
	//    2    4:areturn         
	}

	public void installContent()
	{
		int i = selectContentView();
	//    0    0:aload_0         
	//    1    1:invokespecial   #599 <Method int selectContentView()>
	//    2    4:istore_1        
		mDialog.setContentView(i);
	//    3    5:aload_0         
	//    4    6:getfield        #121 <Field AppCompatDialog mDialog>
	//    5    9:iload_1         
	//    6   10:invokevirtual   #602 <Method void AppCompatDialog.setContentView(int)>
		setupView();
	//    7   13:aload_0         
	//    8   14:invokespecial   #604 <Method void setupView()>
	//    9   17:return          
	}

	public boolean onKeyDown(int i, KeyEvent keyevent)
	{
		return mScrollView != null && mScrollView.executeKeyEvent(keyevent);
	//    0    0:aload_0         
	//    1    1:getfield        #308 <Field NestedScrollView mScrollView>
	//    2    4:ifnull          20
	//    3    7:aload_0         
	//    4    8:getfield        #308 <Field NestedScrollView mScrollView>
	//    5   11:aload_2         
	//    6   12:invokevirtual   #610 <Method boolean NestedScrollView.executeKeyEvent(KeyEvent)>
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
	//    1    1:getfield        #308 <Field NestedScrollView mScrollView>
	//    2    4:ifnull          20
	//    3    7:aload_0         
	//    4    8:getfield        #308 <Field NestedScrollView mScrollView>
	//    5   11:aload_2         
	//    6   12:invokevirtual   #610 <Method boolean NestedScrollView.executeKeyEvent(KeyEvent)>
	//    7   15:ifeq            20
	//    8   18:iconst_1        
	//    9   19:ireturn         
	//   10   20:iconst_0        
	//   11   21:ireturn         
	}

	public void setButton(int i, CharSequence charsequence, android.content.DialogInterface.OnClickListener onclicklistener, Message message, Drawable drawable)
	{
		Message message1 = message;
	//    0    0:aload           4
	//    1    2:astore          6
		if(message == null)
	//*   2    4:aload           4
	//*   3    6:ifnonnull       28
		{
			message1 = message;
	//    4    9:aload           4
	//    5   11:astore          6
			if(onclicklistener != null)
	//*   6   13:aload_3         
	//*   7   14:ifnull          28
				message1 = mHandler.obtainMessage(i, ((Object) (onclicklistener)));
	//    8   17:aload_0         
	//    9   18:getfield        #128 <Field Handler mHandler>
	//   10   21:iload_1         
	//   11   22:aload_3         
	//   12   23:invokevirtual   #619 <Method Message Handler.obtainMessage(int, Object)>
	//   13   26:astore          6
		}
		switch(i)
	//*  14   28:iload_1         
		{
	//*  15   29:tableswitch     -3 -1: default 56
	//	               -3 103
	//	               -2 85
	//	               -1 67
		default:
			throw new IllegalArgumentException("Button does not exist");
	//   16   56:new             #621 <Class IllegalArgumentException>
	//   17   59:dup             
	//   18   60:ldc2            #623 <String "Button does not exist">
	//   19   63:invokespecial   #626 <Method void IllegalArgumentException(String)>
	//   20   66:athrow          

		case -1: 
			mButtonPositiveText = charsequence;
	//   21   67:aload_0         
	//   22   68:aload_2         
	//   23   69:putfield        #345 <Field CharSequence mButtonPositiveText>
			mButtonPositiveMessage = message1;
	//   24   72:aload_0         
	//   25   73:aload           6
	//   26   75:putfield        #628 <Field Message mButtonPositiveMessage>
			mButtonPositiveIcon = drawable;
	//   27   78:aload_0         
	//   28   79:aload           5
	//   29   81:putfield        #353 <Field Drawable mButtonPositiveIcon>
			return;
	//   30   84:return          

		case -2: 
			mButtonNegativeText = charsequence;
	//   31   85:aload_0         
	//   32   86:aload_2         
	//   33   87:putfield        #373 <Field CharSequence mButtonNegativeText>
			mButtonNegativeMessage = message1;
	//   34   90:aload_0         
	//   35   91:aload           6
	//   36   93:putfield        #630 <Field Message mButtonNegativeMessage>
			mButtonNegativeIcon = drawable;
	//   37   96:aload_0         
	//   38   97:aload           5
	//   39   99:putfield        #375 <Field Drawable mButtonNegativeIcon>
			return;
	//   40  102:return          

		case -3: 
			mButtonNeutralText = charsequence;
	//   41  103:aload_0         
	//   42  104:aload_2         
	//   43  105:putfield        #380 <Field CharSequence mButtonNeutralText>
			mButtonNeutralMessage = message1;
	//   44  108:aload_0         
	//   45  109:aload           6
	//   46  111:putfield        #632 <Field Message mButtonNeutralMessage>
			mButtonNeutralIcon = drawable;
	//   47  114:aload_0         
	//   48  115:aload           5
	//   49  117:putfield        #382 <Field Drawable mButtonNeutralIcon>
			return;
	//   50  120:return          
		}
	}

	public void setButtonPanelLayoutHint(int i)
	{
		mButtonPanelLayoutHint = i;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #112 <Field int mButtonPanelLayoutHint>
	//    3    5:return          
	}

	public void setCustomTitle(View view)
	{
		mCustomTitleView = view;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #469 <Field View mCustomTitleView>
	//    3    5:return          
	}

	public void setIcon(int i)
	{
		mIcon = null;
	//    0    0:aload_0         
	//    1    1:aconst_null     
	//    2    2:putfield        #489 <Field Drawable mIcon>
		mIconId = i;
	//    3    5:aload_0         
	//    4    6:iload_1         
	//    5    7:putfield        #108 <Field int mIconId>
		if(mIconView != null)
	//*   6   10:aload_0         
	//*   7   11:getfield        #477 <Field ImageView mIconView>
	//*   8   14:ifnull          50
		{
			if(i != 0)
	//*   9   17:iload_1         
	//*  10   18:ifeq            41
			{
				mIconView.setVisibility(0);
	//   11   21:aload_0         
	//   12   22:getfield        #477 <Field ImageView mIconView>
	//   13   25:iconst_0        
	//   14   26:invokevirtual   #507 <Method void ImageView.setVisibility(int)>
				mIconView.setImageResource(mIconId);
	//   15   29:aload_0         
	//   16   30:getfield        #477 <Field ImageView mIconView>
	//   17   33:aload_0         
	//   18   34:getfield        #108 <Field int mIconId>
	//   19   37:invokevirtual   #487 <Method void ImageView.setImageResource(int)>
				return;
	//   20   40:return          
			}
			mIconView.setVisibility(8);
	//   21   41:aload_0         
	//   22   42:getfield        #477 <Field ImageView mIconView>
	//   23   45:bipush          8
	//   24   47:invokevirtual   #507 <Method void ImageView.setVisibility(int)>
		}
	//   25   50:return          
	}

	public void setIcon(Drawable drawable)
	{
		mIcon = drawable;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #489 <Field Drawable mIcon>
		mIconId = 0;
	//    3    5:aload_0         
	//    4    6:iconst_0        
	//    5    7:putfield        #108 <Field int mIconId>
		if(mIconView != null)
	//*   6   10:aload_0         
	//*   7   11:getfield        #477 <Field ImageView mIconView>
	//*   8   14:ifnull          47
		{
			if(drawable != null)
	//*   9   17:aload_1         
	//*  10   18:ifnull          38
			{
				mIconView.setVisibility(0);
	//   11   21:aload_0         
	//   12   22:getfield        #477 <Field ImageView mIconView>
	//   13   25:iconst_0        
	//   14   26:invokevirtual   #507 <Method void ImageView.setVisibility(int)>
				mIconView.setImageDrawable(drawable);
	//   15   29:aload_0         
	//   16   30:getfield        #477 <Field ImageView mIconView>
	//   17   33:aload_1         
	//   18   34:invokevirtual   #493 <Method void ImageView.setImageDrawable(Drawable)>
				return;
	//   19   37:return          
			}
			mIconView.setVisibility(8);
	//   20   38:aload_0         
	//   21   39:getfield        #477 <Field ImageView mIconView>
	//   22   42:bipush          8
	//   23   44:invokevirtual   #507 <Method void ImageView.setVisibility(int)>
		}
	//   24   47:return          
	}

	public void setMessage(CharSequence charsequence)
	{
		mMessage = charsequence;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #306 <Field CharSequence mMessage>
		if(mMessageView != null)
	//*   3    5:aload_0         
	//*   4    6:getfield        #405 <Field TextView mMessageView>
	//*   5    9:ifnull          20
			mMessageView.setText(charsequence);
	//    6   12:aload_0         
	//    7   13:getfield        #405 <Field TextView mMessageView>
	//    8   16:aload_1         
	//    9   17:invokevirtual   #406 <Method void TextView.setText(CharSequence)>
	//   10   20:return          
	}

	public void setTitle(CharSequence charsequence)
	{
		mTitle = charsequence;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #479 <Field CharSequence mTitle>
		if(mTitleView != null)
	//*   3    5:aload_0         
	//*   4    6:getfield        #484 <Field TextView mTitleView>
	//*   5    9:ifnull          20
			mTitleView.setText(charsequence);
	//    6   12:aload_0         
	//    7   13:getfield        #484 <Field TextView mTitleView>
	//    8   16:aload_1         
	//    9   17:invokevirtual   #406 <Method void TextView.setText(CharSequence)>
	//   10   20:return          
	}

	public void setView(int i)
	{
		mView = null;
	//    0    0:aload_0         
	//    1    1:aconst_null     
	//    2    2:putfield        #428 <Field View mView>
		mViewLayoutResId = i;
	//    3    5:aload_0         
	//    4    6:iload_1         
	//    5    7:putfield        #430 <Field int mViewLayoutResId>
		mViewSpacingSpecified = false;
	//    6   10:aload_0         
	//    7   11:iconst_0        
	//    8   12:putfield        #106 <Field boolean mViewSpacingSpecified>
	//    9   15:return          
	}

	public void setView(View view)
	{
		mView = view;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #428 <Field View mView>
		mViewLayoutResId = 0;
	//    3    5:aload_0         
	//    4    6:iconst_0        
	//    5    7:putfield        #430 <Field int mViewLayoutResId>
		mViewSpacingSpecified = false;
	//    6   10:aload_0         
	//    7   11:iconst_0        
	//    8   12:putfield        #106 <Field boolean mViewSpacingSpecified>
	//    9   15:return          
	}

	public void setView(View view, int i, int j, int k, int l)
	{
		mView = view;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #428 <Field View mView>
		mViewLayoutResId = 0;
	//    3    5:aload_0         
	//    4    6:iconst_0        
	//    5    7:putfield        #430 <Field int mViewLayoutResId>
		mViewSpacingSpecified = true;
	//    6   10:aload_0         
	//    7   11:iconst_1        
	//    8   12:putfield        #106 <Field boolean mViewSpacingSpecified>
		mViewSpacingLeft = i;
	//    9   15:aload_0         
	//   10   16:iload_2         
	//   11   17:putfield        #453 <Field int mViewSpacingLeft>
		mViewSpacingTop = j;
	//   12   20:aload_0         
	//   13   21:iload_3         
	//   14   22:putfield        #455 <Field int mViewSpacingTop>
		mViewSpacingRight = k;
	//   15   25:aload_0         
	//   16   26:iload           4
	//   17   28:putfield        #457 <Field int mViewSpacingRight>
		mViewSpacingBottom = l;
	//   18   31:aload_0         
	//   19   32:iload           5
	//   20   34:putfield        #459 <Field int mViewSpacingBottom>
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
	private final int mButtonIconDimen;
	Button mButtonNegative;
	private Drawable mButtonNegativeIcon;
	Message mButtonNegativeMessage;
	private CharSequence mButtonNegativeText;
	Button mButtonNeutral;
	private Drawable mButtonNeutralIcon;
	Message mButtonNeutralMessage;
	private CharSequence mButtonNeutralText;
	private int mButtonPanelLayoutHint;
	private int mButtonPanelSideLayout;
	Button mButtonPositive;
	private Drawable mButtonPositiveIcon;
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
