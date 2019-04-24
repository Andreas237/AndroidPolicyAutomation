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
		//*  10   21:ifeq            168
			{
				if(mCursor == null)
		//*  11   24:aload_0         
		//*  12   25:getfield        #124 <Field Cursor mCursor>
		//*  13   28:ifnonnull       144
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
					obj = ((Object) (((_cls2) (mCursor)). new CursorAdapter(false, listView, alertcontroller) {

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
							((RecycleListView) (view)).setItemChecked(i, flag);
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
					i = alertcontroller.mSingleChoiceItemLayout;
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
					i = alertcontroller.mListItemLayout;
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
					obj = ((Object) (new CheckedItemAdapter(mContext, i, 0x1020014, mItems)));
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
			alertcontroller.mAdapter = ((ListAdapter) (obj));
			alertcontroller.mCheckedItem = mCheckedItem;
			if(mOnClickListener != null)
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
			else
		//* 134  268:goto            56
			if(mOnCheckboxClickListener != null)
		//* 135  271:aload_0         
		//* 136  272:getfield        #193 <Field android.content.DialogInterface$OnMultiChoiceClickListener mOnCheckboxClickListener>
		//* 137  275:ifnull          108
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
			alertcontroller.mListView = ((ListView) (listView));
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
				alertcontroller.setButton(-1, mPositiveButtonText, mPositiveButtonListener, ((Message) (null)));
		//   17   37:aload_1         
		//   18   38:iconst_m1       
		//   19   39:aload_0         
		//   20   40:getfield        #211 <Field CharSequence mPositiveButtonText>
		//   21   43:aload_0         
		//   22   44:getfield        #213 <Field android.content.DialogInterface$OnClickListener mPositiveButtonListener>
		//   23   47:aconst_null     
		//   24   48:invokevirtual   #217 <Method void AlertController.setButton(int, CharSequence, android.content.DialogInterface$OnClickListener, Message)>
			if(mNegativeButtonText != null)
		//*  25   51:aload_0         
		//*  26   52:getfield        #219 <Field CharSequence mNegativeButtonText>
		//*  27   55:ifnull          73
				alertcontroller.setButton(-2, mNegativeButtonText, mNegativeButtonListener, ((Message) (null)));
		//   28   58:aload_1         
		//   29   59:bipush          -2
		//   30   61:aload_0         
		//   31   62:getfield        #219 <Field CharSequence mNegativeButtonText>
		//   32   65:aload_0         
		//   33   66:getfield        #221 <Field android.content.DialogInterface$OnClickListener mNegativeButtonListener>
		//   34   69:aconst_null     
		//   35   70:invokevirtual   #217 <Method void AlertController.setButton(int, CharSequence, android.content.DialogInterface$OnClickListener, Message)>
			if(mNeutralButtonText != null)
		//*  36   73:aload_0         
		//*  37   74:getfield        #223 <Field CharSequence mNeutralButtonText>
		//*  38   77:ifnull          95
				alertcontroller.setButton(-3, mNeutralButtonText, mNeutralButtonListener, ((Message) (null)));
		//   39   80:aload_1         
		//   40   81:bipush          -3
		//   41   83:aload_0         
		//   42   84:getfield        #223 <Field CharSequence mNeutralButtonText>
		//   43   87:aload_0         
		//   44   88:getfield        #225 <Field android.content.DialogInterface$OnClickListener mNeutralButtonListener>
		//   45   91:aconst_null     
		//   46   92:invokevirtual   #217 <Method void AlertController.setButton(int, CharSequence, android.content.DialogInterface$OnClickListener, Message)>
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

	private static final class ButtonHandler extends Handler
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
		//		               0 40
		//		               1 68
			case 0: // '\0'
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
				break;
			}
		//   19   80:return          
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
		//*   3    5:ifne            50
			{
				int k = getPaddingLeft();
		//    4    8:aload_0         
		//    5    9:invokevirtual   #50  <Method int getPaddingLeft()>
		//    6   12:istore          5
				int i;
				int j;
				int l;
				if(flag)
		//*   7   14:iload_1         
		//*   8   15:ifeq            51
					i = getPaddingTop();
		//    9   18:aload_0         
		//   10   19:invokevirtual   #53  <Method int getPaddingTop()>
		//   11   22:istore_3        
				else
		//*  12   23:aload_0         
		//*  13   24:invokevirtual   #56  <Method int getPaddingRight()>
		//*  14   27:istore          6
		//*  15   29:iload_2         
		//*  16   30:ifeq            59
		//*  17   33:aload_0         
		//*  18   34:invokevirtual   #59  <Method int getPaddingBottom()>
		//*  19   37:istore          4
		//*  20   39:aload_0         
		//*  21   40:iload           5
		//*  22   42:iload_3         
		//*  23   43:iload           6
		//*  24   45:iload           4
		//*  25   47:invokevirtual   #63  <Method void setPadding(int, int, int, int)>
		//*  26   50:return          
					i = mPaddingTopNoTitle;
		//   27   51:aload_0         
		//   28   52:getfield        #44  <Field int mPaddingTopNoTitle>
		//   29   55:istore_3        
				l = getPaddingRight();
				if(flag1)
					j = getPaddingBottom();
				else
		//*  30   56:goto            23
					j = mPaddingBottomNoButtons;
		//   31   59:aload_0         
		//   32   60:getfield        #39  <Field int mPaddingBottomNoButtons>
		//   33   63:istore          4
				setPadding(k, i, l, j);
			}
		//*  34   65:goto            39
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
		boolean flag = false;
	//    0    0:iconst_0        
	//    1    1:istore          4
		int i;
		if(view1 != null)
	//*   2    3:aload_1         
	//*   3    4:ifnull          22
		{
			if(view.canScrollVertically(-1))
	//*   4    7:aload_0         
	//*   5    8:iconst_m1       
	//*   6    9:invokevirtual   #243 <Method boolean View.canScrollVertically(int)>
	//*   7   12:ifeq            43
				i = 0;
	//    8   15:iconst_0        
	//    9   16:istore_3        
			else
	//*  10   17:aload_1         
	//*  11   18:iload_3         
	//*  12   19:invokevirtual   #247 <Method void View.setVisibility(int)>
	//*  13   22:aload_2         
	//*  14   23:ifnull          42
	//*  15   26:aload_0         
	//*  16   27:iconst_1        
	//*  17   28:invokevirtual   #243 <Method boolean View.canScrollVertically(int)>
	//*  18   31:ifeq            48
	//*  19   34:iload           4
	//*  20   36:istore_3        
	//*  21   37:aload_2         
	//*  22   38:iload_3         
	//*  23   39:invokevirtual   #247 <Method void View.setVisibility(int)>
	//*  24   42:return          
				i = 4;
	//   25   43:iconst_4        
	//   26   44:istore_3        
			view1.setVisibility(i);
		}
		if(view2 != null)
		{
			if(view.canScrollVertically(1))
				i = ((int) (flag));
			else
	//*  27   45:goto            17
				i = 4;
	//   28   48:iconst_4        
	//   29   49:istore_3        
			view2.setVisibility(i);
		}
	//*  30   50:goto            37
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
	//*   5    7:instanceof      #252 <Class ViewStub>
	//*   6   10:ifeq            21
				view = ((ViewStub)view1).inflate();
	//    7   13:aload_2         
	//    8   14:checkcast       #252 <Class ViewStub>
	//    9   17:invokevirtual   #256 <Method View ViewStub.inflate()>
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
	//   17   31:invokevirtual   #260 <Method android.view.ViewParent View.getParent()>
	//   18   34:astore_3        
			if(viewparent instanceof ViewGroup)
	//*  19   35:aload_3         
	//*  20   36:instanceof      #206 <Class ViewGroup>
	//*  21   39:ifeq            50
				((ViewGroup)viewparent).removeView(view1);
	//   22   42:aload_3         
	//   23   43:checkcast       #206 <Class ViewGroup>
	//   24   46:aload_2         
	//   25   47:invokevirtual   #264 <Method void ViewGroup.removeView(View)>
		}
		view1 = view;
	//   26   50:aload_1         
	//   27   51:astore_2        
		if(view instanceof ViewStub)
	//*  28   52:aload_1         
	//*  29   53:instanceof      #252 <Class ViewStub>
	//*  30   56:ifeq            67
			view1 = ((ViewStub)view).inflate();
	//   31   59:aload_1         
	//   32   60:checkcast       #252 <Class ViewStub>
	//   33   63:invokevirtual   #256 <Method View ViewStub.inflate()>
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
	//    2    4:getstatic       #274 <Field int android.support.v7.appcompat.R$id.scrollIndicatorUp>
	//    3    7:invokevirtual   #279 <Method View Window.findViewById(int)>
	//    4   10:astore          5
		View view = mWindow.findViewById(android.support.v7.appcompat.R.id.scrollIndicatorDown);
	//    5   12:aload_0         
	//    6   13:getfield        #119 <Field Window mWindow>
	//    7   16:getstatic       #282 <Field int android.support.v7.appcompat.R$id.scrollIndicatorDown>
	//    8   19:invokevirtual   #279 <Method View Window.findViewById(int)>
	//    9   22:astore          6
		if(android.os.Build.VERSION.SDK_INT >= 23)
	//*  10   24:getstatic       #287 <Field int android.os.Build$VERSION.SDK_INT>
	//*  11   27:bipush          23
	//*  12   29:icmplt          62
		{
			ViewCompat.setScrollIndicators(top, i, j);
	//   13   32:aload_2         
	//   14   33:iload_3         
	//   15   34:iload           4
	//   16   36:invokestatic    #292 <Method void ViewCompat.setScrollIndicators(View, int, int)>
			if(bottom != null)
	//*  17   39:aload           5
	//*  18   41:ifnull          50
				viewgroup.removeView(bottom);
	//   19   44:aload_1         
	//   20   45:aload           5
	//   21   47:invokevirtual   #264 <Method void ViewGroup.removeView(View)>
			if(view != null)
	//*  22   50:aload           6
	//*  23   52:ifnull          61
				viewgroup.removeView(view);
	//   24   55:aload_1         
	//   25   56:aload           6
	//   26   58:invokevirtual   #264 <Method void ViewGroup.removeView(View)>
		} else
	//*  27   61:return          
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
	//   40   82:invokevirtual   #264 <Method void ViewGroup.removeView(View)>
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
	//   55  109:invokevirtual   #264 <Method void ViewGroup.removeView(View)>
					bottom = null;
	//   56  112:aconst_null     
	//   57  113:astore          5
				}
			}
			if(top != null || bottom != null)
	//*  58  115:aload_2         
	//*  59  116:ifnonnull       124
	//*  60  119:aload           5
	//*  61  121:ifnull          61
			{
				if(mMessage != null)
	//*  62  124:aload_0         
	//*  63  125:getfield        #294 <Field CharSequence mMessage>
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
	//   66  132:getfield        #296 <Field NestedScrollView mScrollView>
	//   67  135:new             #8   <Class AlertController$2>
	//   68  138:dup             
	//   69  139:aload_0         
	//   70  140:aload_2         
	//   71  141:aload           5
	//   72  143:invokespecial   #299 <Method void AlertController$2(AlertController, View, View)>
	//   73  146:invokevirtual   #305 <Method void NestedScrollView.setOnScrollChangeListener(android.support.v4.widget.NestedScrollView$OnScrollChangeListener)>
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
	//   75  150:getfield        #296 <Field NestedScrollView mScrollView>
	//   76  153:new             #10  <Class AlertController$3>
	//   77  156:dup             
	//   78  157:aload_0         
	//   79  158:aload_2         
	//   80  159:aload           5
	//   81  161:invokespecial   #306 <Method void AlertController$3(AlertController, View, View)>
	//   82  164:invokevirtual   #310 <Method boolean NestedScrollView.post(Runnable)>
	//   83  167:pop             
					return;
	//   84  168:return          
				}
				if(mListView != null)
	//*  85  169:aload_0         
	//*  86  170:getfield        #312 <Field ListView mListView>
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
	//   89  177:getfield        #312 <Field ListView mListView>
	//   90  180:new             #12  <Class AlertController$4>
	//   91  183:dup             
	//   92  184:aload_0         
	//   93  185:aload_2         
	//   94  186:aload           5
	//   95  188:invokespecial   #313 <Method void AlertController$4(AlertController, View, View)>
	//   96  191:invokevirtual   #319 <Method void ListView.setOnScrollListener(android.widget.AbsListView$OnScrollListener)>
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
	//   98  195:getfield        #312 <Field ListView mListView>
	//   99  198:new             #14  <Class AlertController$5>
	//  100  201:dup             
	//  101  202:aload_0         
	//  102  203:aload_2         
	//  103  204:aload           5
	//  104  206:invokespecial   #320 <Method void AlertController$5(AlertController, View, View)>
	//  105  209:invokevirtual   #321 <Method boolean ListView.post(Runnable)>
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
	//  112  220:invokevirtual   #264 <Method void ViewGroup.removeView(View)>
				if(bottom != null)
	//* 113  223:aload           5
	//* 114  225:ifnull          61
				{
					viewgroup.removeView(bottom);
	//  115  228:aload_1         
	//  116  229:aload           5
	//  117  231:invokevirtual   #264 <Method void ViewGroup.removeView(View)>
					return;
	//  118  234:return          
				}
			}
		}
	}

	private void setupButtons(ViewGroup viewgroup)
	{
		int i;
		boolean flag = false;
	//    0    0:iconst_0        
	//    1    1:istore_3        
		i = 0;
	//    2    2:iconst_0        
	//    3    3:istore_2        
		mButtonPositive = (Button)viewgroup.findViewById(0x1020019);
	//    4    4:aload_0         
	//    5    5:aload_1         
	//    6    6:ldc2            #324 <Int 0x1020019>
	//    7    9:invokevirtual   #325 <Method View ViewGroup.findViewById(int)>
	//    8   12:checkcast       #220 <Class Button>
	//    9   15:putfield        #327 <Field Button mButtonPositive>
		mButtonPositive.setOnClickListener(mButtonHandler);
	//   10   18:aload_0         
	//   11   19:getfield        #327 <Field Button mButtonPositive>
	//   12   22:aload_0         
	//   13   23:getfield        #113 <Field android.view.View$OnClickListener mButtonHandler>
	//   14   26:invokevirtual   #331 <Method void Button.setOnClickListener(android.view.View$OnClickListener)>
		if(TextUtils.isEmpty(mButtonPositiveText))
	//*  15   29:aload_0         
	//*  16   30:getfield        #333 <Field CharSequence mButtonPositiveText>
	//*  17   33:invokestatic    #339 <Method boolean TextUtils.isEmpty(CharSequence)>
	//*  18   36:ifeq            176
		{
			mButtonPositive.setVisibility(8);
	//   19   39:aload_0         
	//   20   40:getfield        #327 <Field Button mButtonPositive>
	//   21   43:bipush          8
	//   22   45:invokevirtual   #340 <Method void Button.setVisibility(int)>
		} else
	//*  23   48:aload_0         
	//*  24   49:aload_1         
	//*  25   50:ldc2            #341 <Int 0x102001a>
	//*  26   53:invokevirtual   #325 <Method View ViewGroup.findViewById(int)>
	//*  27   56:checkcast       #220 <Class Button>
	//*  28   59:putfield        #343 <Field Button mButtonNegative>
	//*  29   62:aload_0         
	//*  30   63:getfield        #343 <Field Button mButtonNegative>
	//*  31   66:aload_0         
	//*  32   67:getfield        #113 <Field android.view.View$OnClickListener mButtonHandler>
	//*  33   70:invokevirtual   #331 <Method void Button.setOnClickListener(android.view.View$OnClickListener)>
	//*  34   73:aload_0         
	//*  35   74:getfield        #345 <Field CharSequence mButtonNegativeText>
	//*  36   77:invokestatic    #339 <Method boolean TextUtils.isEmpty(CharSequence)>
	//*  37   80:ifeq            202
	//*  38   83:aload_0         
	//*  39   84:getfield        #343 <Field Button mButtonNegative>
	//*  40   87:bipush          8
	//*  41   89:invokevirtual   #340 <Method void Button.setVisibility(int)>
	//*  42   92:aload_0         
	//*  43   93:aload_1         
	//*  44   94:ldc2            #346 <Int 0x102001b>
	//*  45   97:invokevirtual   #325 <Method View ViewGroup.findViewById(int)>
	//*  46  100:checkcast       #220 <Class Button>
	//*  47  103:putfield        #348 <Field Button mButtonNeutral>
	//*  48  106:aload_0         
	//*  49  107:getfield        #348 <Field Button mButtonNeutral>
	//*  50  110:aload_0         
	//*  51  111:getfield        #113 <Field android.view.View$OnClickListener mButtonHandler>
	//*  52  114:invokevirtual   #331 <Method void Button.setOnClickListener(android.view.View$OnClickListener)>
	//*  53  117:aload_0         
	//*  54  118:getfield        #350 <Field CharSequence mButtonNeutralText>
	//*  55  121:invokestatic    #339 <Method boolean TextUtils.isEmpty(CharSequence)>
	//*  56  124:ifeq            228
	//*  57  127:aload_0         
	//*  58  128:getfield        #348 <Field Button mButtonNeutral>
	//*  59  131:bipush          8
	//*  60  133:invokevirtual   #340 <Method void Button.setVisibility(int)>
	//*  61  136:aload_0         
	//*  62  137:getfield        #115 <Field Context mContext>
	//*  63  140:invokestatic    #354 <Method boolean shouldCenterSingleButton(Context)>
	//*  64  143:ifeq            159
	//*  65  146:iload_2         
	//*  66  147:iconst_1        
	//*  67  148:icmpne          254
	//*  68  151:aload_0         
	//*  69  152:aload_0         
	//*  70  153:getfield        #327 <Field Button mButtonPositive>
	//*  71  156:invokespecial   #356 <Method void centerButton(Button)>
	//*  72  159:iload_2         
	//*  73  160:ifeq            165
	//*  74  163:iconst_1        
	//*  75  164:istore_3        
	//*  76  165:iload_3         
	//*  77  166:ifne            175
	//*  78  169:aload_1         
	//*  79  170:bipush          8
	//*  80  172:invokevirtual   #357 <Method void ViewGroup.setVisibility(int)>
	//*  81  175:return          
		{
			mButtonPositive.setText(mButtonPositiveText);
	//   82  176:aload_0         
	//   83  177:getfield        #327 <Field Button mButtonPositive>
	//   84  180:aload_0         
	//   85  181:getfield        #333 <Field CharSequence mButtonPositiveText>
	//   86  184:invokevirtual   #361 <Method void Button.setText(CharSequence)>
			mButtonPositive.setVisibility(0);
	//   87  187:aload_0         
	//   88  188:getfield        #327 <Field Button mButtonPositive>
	//   89  191:iconst_0        
	//   90  192:invokevirtual   #340 <Method void Button.setVisibility(int)>
			i = ((int) (false | true));
	//   91  195:iconst_0        
	//   92  196:iconst_1        
	//   93  197:ior             
	//   94  198:istore_2        
		}
		mButtonNegative = (Button)viewgroup.findViewById(0x102001a);
		mButtonNegative.setOnClickListener(mButtonHandler);
		if(TextUtils.isEmpty(mButtonNegativeText))
		{
			mButtonNegative.setVisibility(8);
		} else
	//*  95  199:goto            48
		{
			mButtonNegative.setText(mButtonNegativeText);
	//   96  202:aload_0         
	//   97  203:getfield        #343 <Field Button mButtonNegative>
	//   98  206:aload_0         
	//   99  207:getfield        #345 <Field CharSequence mButtonNegativeText>
	//  100  210:invokevirtual   #361 <Method void Button.setText(CharSequence)>
			mButtonNegative.setVisibility(0);
	//  101  213:aload_0         
	//  102  214:getfield        #343 <Field Button mButtonNegative>
	//  103  217:iconst_0        
	//  104  218:invokevirtual   #340 <Method void Button.setVisibility(int)>
			i |= 2;
	//  105  221:iload_2         
	//  106  222:iconst_2        
	//  107  223:ior             
	//  108  224:istore_2        
		}
		mButtonNeutral = (Button)viewgroup.findViewById(0x102001b);
		mButtonNeutral.setOnClickListener(mButtonHandler);
		if(TextUtils.isEmpty(mButtonNeutralText))
		{
			mButtonNeutral.setVisibility(8);
		} else
	//* 109  225:goto            92
		{
			mButtonNeutral.setText(mButtonNeutralText);
	//  110  228:aload_0         
	//  111  229:getfield        #348 <Field Button mButtonNeutral>
	//  112  232:aload_0         
	//  113  233:getfield        #350 <Field CharSequence mButtonNeutralText>
	//  114  236:invokevirtual   #361 <Method void Button.setText(CharSequence)>
			mButtonNeutral.setVisibility(0);
	//  115  239:aload_0         
	//  116  240:getfield        #348 <Field Button mButtonNeutral>
	//  117  243:iconst_0        
	//  118  244:invokevirtual   #340 <Method void Button.setVisibility(int)>
			i |= 4;
	//  119  247:iload_2         
	//  120  248:iconst_4        
	//  121  249:ior             
	//  122  250:istore_2        
		}
		if(!shouldCenterSingleButton(mContext)) goto _L2; else goto _L1
_L1:
		if(i != 1) goto _L4; else goto _L3
_L3:
		centerButton(mButtonPositive);
_L2:
		if(i != 0)
			flag = true;
		if(!flag)
			viewgroup.setVisibility(8);
		return;
	//* 123  251:goto            136
_L4:
		if(i == 2)
	//* 124  254:iload_2         
	//* 125  255:iconst_2        
	//* 126  256:icmpne          270
			centerButton(mButtonNegative);
	//  127  259:aload_0         
	//  128  260:aload_0         
	//  129  261:getfield        #343 <Field Button mButtonNegative>
	//  130  264:invokespecial   #356 <Method void centerButton(Button)>
		else
	//* 131  267:goto            159
		if(i == 4)
	//* 132  270:iload_2         
	//* 133  271:iconst_4        
	//* 134  272:icmpne          159
			centerButton(mButtonNeutral);
	//  135  275:aload_0         
	//  136  276:aload_0         
	//  137  277:getfield        #348 <Field Button mButtonNeutral>
	//  138  280:invokespecial   #356 <Method void centerButton(Button)>
		if(true) goto _L2; else goto _L5
	//  139  283:goto            159
_L5:
	}

	private void setupContent(ViewGroup viewgroup)
	{
		mScrollView = (NestedScrollView)mWindow.findViewById(android.support.v7.appcompat.R.id.scrollView);
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #119 <Field Window mWindow>
	//    3    5:getstatic       #365 <Field int android.support.v7.appcompat.R$id.scrollView>
	//    4    8:invokevirtual   #279 <Method View Window.findViewById(int)>
	//    5   11:checkcast       #301 <Class NestedScrollView>
	//    6   14:putfield        #296 <Field NestedScrollView mScrollView>
		mScrollView.setFocusable(false);
	//    7   17:aload_0         
	//    8   18:getfield        #296 <Field NestedScrollView mScrollView>
	//    9   21:iconst_0        
	//   10   22:invokevirtual   #369 <Method void NestedScrollView.setFocusable(boolean)>
		mScrollView.setNestedScrollingEnabled(false);
	//   11   25:aload_0         
	//   12   26:getfield        #296 <Field NestedScrollView mScrollView>
	//   13   29:iconst_0        
	//   14   30:invokevirtual   #372 <Method void NestedScrollView.setNestedScrollingEnabled(boolean)>
		mMessageView = (TextView)viewgroup.findViewById(0x102000b);
	//   15   33:aload_0         
	//   16   34:aload_1         
	//   17   35:ldc2            #373 <Int 0x102000b>
	//   18   38:invokevirtual   #325 <Method View ViewGroup.findViewById(int)>
	//   19   41:checkcast       #375 <Class TextView>
	//   20   44:putfield        #377 <Field TextView mMessageView>
		if(mMessageView == null)
	//*  21   47:aload_0         
	//*  22   48:getfield        #377 <Field TextView mMessageView>
	//*  23   51:ifnonnull       55
			return;
	//   24   54:return          
		if(mMessage != null)
	//*  25   55:aload_0         
	//*  26   56:getfield        #294 <Field CharSequence mMessage>
	//*  27   59:ifnull          74
		{
			mMessageView.setText(mMessage);
	//   28   62:aload_0         
	//   29   63:getfield        #377 <Field TextView mMessageView>
	//   30   66:aload_0         
	//   31   67:getfield        #294 <Field CharSequence mMessage>
	//   32   70:invokevirtual   #378 <Method void TextView.setText(CharSequence)>
			return;
	//   33   73:return          
		}
		mMessageView.setVisibility(8);
	//   34   74:aload_0         
	//   35   75:getfield        #377 <Field TextView mMessageView>
	//   36   78:bipush          8
	//   37   80:invokevirtual   #379 <Method void TextView.setVisibility(int)>
		mScrollView.removeView(((View) (mMessageView)));
	//   38   83:aload_0         
	//   39   84:getfield        #296 <Field NestedScrollView mScrollView>
	//   40   87:aload_0         
	//   41   88:getfield        #377 <Field TextView mMessageView>
	//   42   91:invokevirtual   #380 <Method void NestedScrollView.removeView(View)>
		if(mListView != null)
	//*  43   94:aload_0         
	//*  44   95:getfield        #312 <Field ListView mListView>
	//*  45   98:ifnull          145
		{
			viewgroup = (ViewGroup)mScrollView.getParent();
	//   46  101:aload_0         
	//   47  102:getfield        #296 <Field NestedScrollView mScrollView>
	//   48  105:invokevirtual   #381 <Method android.view.ViewParent NestedScrollView.getParent()>
	//   49  108:checkcast       #206 <Class ViewGroup>
	//   50  111:astore_1        
			int i = viewgroup.indexOfChild(((View) (mScrollView)));
	//   51  112:aload_1         
	//   52  113:aload_0         
	//   53  114:getfield        #296 <Field NestedScrollView mScrollView>
	//   54  117:invokevirtual   #385 <Method int ViewGroup.indexOfChild(View)>
	//   55  120:istore_2        
			viewgroup.removeViewAt(i);
	//   56  121:aload_1         
	//   57  122:iload_2         
	//   58  123:invokevirtual   #388 <Method void ViewGroup.removeViewAt(int)>
			viewgroup.addView(((View) (mListView)), i, new android.view.ViewGroup.LayoutParams(-1, -1));
	//   59  126:aload_1         
	//   60  127:aload_0         
	//   61  128:getfield        #312 <Field ListView mListView>
	//   62  131:iload_2         
	//   63  132:new             #390 <Class android.view.ViewGroup$LayoutParams>
	//   64  135:dup             
	//   65  136:iconst_m1       
	//   66  137:iconst_m1       
	//   67  138:invokespecial   #393 <Method void android.view.ViewGroup$LayoutParams(int, int)>
	//   68  141:invokevirtual   #397 <Method void ViewGroup.addView(View, int, android.view.ViewGroup$LayoutParams)>
			return;
	//   69  144:return          
		} else
		{
			viewgroup.setVisibility(8);
	//   70  145:aload_1         
	//   71  146:bipush          8
	//   72  148:invokevirtual   #357 <Method void ViewGroup.setVisibility(int)>
			return;
	//   73  151:return          
		}
	}

	private void setupCustomContent(ViewGroup viewgroup)
	{
		boolean flag = false;
	//    0    0:iconst_0        
	//    1    1:istore_2        
		View view;
		if(mView != null)
	//*   2    2:aload_0         
	//*   3    3:getfield        #400 <Field View mView>
	//*   4    6:ifnull          125
			view = mView;
	//    5    9:aload_0         
	//    6   10:getfield        #400 <Field View mView>
	//    7   13:astore_3        
		else
	//*   8   14:aload_3         
	//*   9   15:ifnull          20
	//*  10   18:iconst_1        
	//*  11   19:istore_2        
	//*  12   20:iload_2         
	//*  13   21:ifeq            31
	//*  14   24:aload_3         
	//*  15   25:invokestatic    #216 <Method boolean canTextInput(View)>
	//*  16   28:ifne            44
	//*  17   31:aload_0         
	//*  18   32:getfield        #119 <Field Window mWindow>
	//*  19   35:ldc2            #401 <Int 0x20000>
	//*  20   38:ldc2            #401 <Int 0x20000>
	//*  21   41:invokevirtual   #404 <Method void Window.setFlags(int, int)>
	//*  22   44:iload_2         
	//*  23   45:ifeq            157
	//*  24   48:aload_0         
	//*  25   49:getfield        #119 <Field Window mWindow>
	//*  26   52:getstatic       #407 <Field int android.support.v7.appcompat.R$id.custom>
	//*  27   55:invokevirtual   #279 <Method View Window.findViewById(int)>
	//*  28   58:checkcast       #409 <Class FrameLayout>
	//*  29   61:astore          4
	//*  30   63:aload           4
	//*  31   65:aload_3         
	//*  32   66:new             #390 <Class android.view.ViewGroup$LayoutParams>
	//*  33   69:dup             
	//*  34   70:iconst_m1       
	//*  35   71:iconst_m1       
	//*  36   72:invokespecial   #393 <Method void android.view.ViewGroup$LayoutParams(int, int)>
	//*  37   75:invokevirtual   #412 <Method void FrameLayout.addView(View, android.view.ViewGroup$LayoutParams)>
	//*  38   78:aload_0         
	//*  39   79:getfield        #102 <Field boolean mViewSpacingSpecified>
	//*  40   82:ifeq            106
	//*  41   85:aload           4
	//*  42   87:aload_0         
	//*  43   88:getfield        #414 <Field int mViewSpacingLeft>
	//*  44   91:aload_0         
	//*  45   92:getfield        #416 <Field int mViewSpacingTop>
	//*  46   95:aload_0         
	//*  47   96:getfield        #418 <Field int mViewSpacingRight>
	//*  48   99:aload_0         
	//*  49  100:getfield        #420 <Field int mViewSpacingBottom>
	//*  50  103:invokevirtual   #424 <Method void FrameLayout.setPadding(int, int, int, int)>
	//*  51  106:aload_0         
	//*  52  107:getfield        #312 <Field ListView mListView>
	//*  53  110:ifnull          124
	//*  54  113:aload_1         
	//*  55  114:invokevirtual   #425 <Method android.view.ViewGroup$LayoutParams ViewGroup.getLayoutParams()>
	//*  56  117:checkcast       #427 <Class android.support.v7.widget.LinearLayoutCompat$LayoutParams>
	//*  57  120:fconst_0        
	//*  58  121:putfield        #428 <Field float android.support.v7.widget.LinearLayoutCompat$LayoutParams.weight>
	//*  59  124:return          
		if(mViewLayoutResId != 0)
	//*  60  125:aload_0         
	//*  61  126:getfield        #430 <Field int mViewLayoutResId>
	//*  62  129:ifeq            152
			view = LayoutInflater.from(mContext).inflate(mViewLayoutResId, viewgroup, false);
	//   63  132:aload_0         
	//   64  133:getfield        #115 <Field Context mContext>
	//   65  136:invokestatic    #436 <Method LayoutInflater LayoutInflater.from(Context)>
	//   66  139:aload_0         
	//   67  140:getfield        #430 <Field int mViewLayoutResId>
	//   68  143:aload_1         
	//   69  144:iconst_0        
	//   70  145:invokevirtual   #439 <Method View LayoutInflater.inflate(int, ViewGroup, boolean)>
	//   71  148:astore_3        
		else
	//*  72  149:goto            14
			view = null;
	//   73  152:aconst_null     
	//   74  153:astore_3        
		if(view != null)
			flag = true;
		if(!flag || !canTextInput(view))
			mWindow.setFlags(0x20000, 0x20000);
		if(flag)
		{
			FrameLayout framelayout = (FrameLayout)mWindow.findViewById(android.support.v7.appcompat.R.id.custom);
			framelayout.addView(view, new android.view.ViewGroup.LayoutParams(-1, -1));
			if(mViewSpacingSpecified)
				framelayout.setPadding(mViewSpacingLeft, mViewSpacingTop, mViewSpacingRight, mViewSpacingBottom);
			if(mListView != null)
				((android.support.v7.widget.LinearLayoutCompat.LayoutParams)viewgroup.getLayoutParams()).weight = 0.0F;
			return;
		} else
	//*  75  154:goto            14
		{
			viewgroup.setVisibility(8);
	//   76  157:aload_1         
	//   77  158:bipush          8
	//   78  160:invokevirtual   #357 <Method void ViewGroup.setVisibility(int)>
			return;
	//   79  163:return          
		}
	}

	private void setupTitle(ViewGroup viewgroup)
	{
		boolean flag = false;
	//    0    0:iconst_0        
	//    1    1:istore_2        
		if(mCustomTitleView != null)
	//*   2    2:aload_0         
	//*   3    3:getfield        #442 <Field View mCustomTitleView>
	//*   4    6:ifnull          46
		{
			android.view.ViewGroup.LayoutParams layoutparams = new android.view.ViewGroup.LayoutParams(-1, -2);
	//    5    9:new             #390 <Class android.view.ViewGroup$LayoutParams>
	//    6   12:dup             
	//    7   13:iconst_m1       
	//    8   14:bipush          -2
	//    9   16:invokespecial   #393 <Method void android.view.ViewGroup$LayoutParams(int, int)>
	//   10   19:astore_3        
			viewgroup.addView(mCustomTitleView, 0, layoutparams);
	//   11   20:aload_1         
	//   12   21:aload_0         
	//   13   22:getfield        #442 <Field View mCustomTitleView>
	//   14   25:iconst_0        
	//   15   26:aload_3         
	//   16   27:invokevirtual   #397 <Method void ViewGroup.addView(View, int, android.view.ViewGroup$LayoutParams)>
			mWindow.findViewById(android.support.v7.appcompat.R.id.title_template).setVisibility(8);
	//   17   30:aload_0         
	//   18   31:getfield        #119 <Field Window mWindow>
	//   19   34:getstatic       #445 <Field int android.support.v7.appcompat.R$id.title_template>
	//   20   37:invokevirtual   #279 <Method View Window.findViewById(int)>
	//   21   40:bipush          8
	//   22   42:invokevirtual   #247 <Method void View.setVisibility(int)>
			return;
	//   23   45:return          
		}
		mIconView = (ImageView)mWindow.findViewById(0x1020006);
	//   24   46:aload_0         
	//   25   47:aload_0         
	//   26   48:getfield        #119 <Field Window mWindow>
	//   27   51:ldc2            #446 <Int 0x1020006>
	//   28   54:invokevirtual   #279 <Method View Window.findViewById(int)>
	//   29   57:checkcast       #448 <Class ImageView>
	//   30   60:putfield        #450 <Field ImageView mIconView>
		if(!TextUtils.isEmpty(mTitle))
	//*  31   63:aload_0         
	//*  32   64:getfield        #452 <Field CharSequence mTitle>
	//*  33   67:invokestatic    #339 <Method boolean TextUtils.isEmpty(CharSequence)>
	//*  34   70:ifne            75
			flag = true;
	//   35   73:iconst_1        
	//   36   74:istore_2        
		if(flag && mShowTitle)
	//*  37   75:iload_2         
	//*  38   76:ifeq            197
	//*  39   79:aload_0         
	//*  40   80:getfield        #186 <Field boolean mShowTitle>
	//*  41   83:ifeq            197
		{
			mTitleView = (TextView)mWindow.findViewById(android.support.v7.appcompat.R.id.alertTitle);
	//   42   86:aload_0         
	//   43   87:aload_0         
	//   44   88:getfield        #119 <Field Window mWindow>
	//   45   91:getstatic       #455 <Field int android.support.v7.appcompat.R$id.alertTitle>
	//   46   94:invokevirtual   #279 <Method View Window.findViewById(int)>
	//   47   97:checkcast       #375 <Class TextView>
	//   48  100:putfield        #457 <Field TextView mTitleView>
			mTitleView.setText(mTitle);
	//   49  103:aload_0         
	//   50  104:getfield        #457 <Field TextView mTitleView>
	//   51  107:aload_0         
	//   52  108:getfield        #452 <Field CharSequence mTitle>
	//   53  111:invokevirtual   #378 <Method void TextView.setText(CharSequence)>
			if(mIconId != 0)
	//*  54  114:aload_0         
	//*  55  115:getfield        #104 <Field int mIconId>
	//*  56  118:ifeq            133
			{
				mIconView.setImageResource(mIconId);
	//   57  121:aload_0         
	//   58  122:getfield        #450 <Field ImageView mIconView>
	//   59  125:aload_0         
	//   60  126:getfield        #104 <Field int mIconId>
	//   61  129:invokevirtual   #460 <Method void ImageView.setImageResource(int)>
				return;
	//   62  132:return          
			}
			if(mIcon != null)
	//*  63  133:aload_0         
	//*  64  134:getfield        #462 <Field Drawable mIcon>
	//*  65  137:ifnull          152
			{
				mIconView.setImageDrawable(mIcon);
	//   66  140:aload_0         
	//   67  141:getfield        #450 <Field ImageView mIconView>
	//   68  144:aload_0         
	//   69  145:getfield        #462 <Field Drawable mIcon>
	//   70  148:invokevirtual   #466 <Method void ImageView.setImageDrawable(Drawable)>
				return;
	//   71  151:return          
			} else
			{
				mTitleView.setPadding(mIconView.getPaddingLeft(), mIconView.getPaddingTop(), mIconView.getPaddingRight(), mIconView.getPaddingBottom());
	//   72  152:aload_0         
	//   73  153:getfield        #457 <Field TextView mTitleView>
	//   74  156:aload_0         
	//   75  157:getfield        #450 <Field ImageView mIconView>
	//   76  160:invokevirtual   #469 <Method int ImageView.getPaddingLeft()>
	//   77  163:aload_0         
	//   78  164:getfield        #450 <Field ImageView mIconView>
	//   79  167:invokevirtual   #472 <Method int ImageView.getPaddingTop()>
	//   80  170:aload_0         
	//   81  171:getfield        #450 <Field ImageView mIconView>
	//   82  174:invokevirtual   #475 <Method int ImageView.getPaddingRight()>
	//   83  177:aload_0         
	//   84  178:getfield        #450 <Field ImageView mIconView>
	//   85  181:invokevirtual   #478 <Method int ImageView.getPaddingBottom()>
	//   86  184:invokevirtual   #479 <Method void TextView.setPadding(int, int, int, int)>
				mIconView.setVisibility(8);
	//   87  187:aload_0         
	//   88  188:getfield        #450 <Field ImageView mIconView>
	//   89  191:bipush          8
	//   90  193:invokevirtual   #480 <Method void ImageView.setVisibility(int)>
				return;
	//   91  196:return          
			}
		} else
		{
			mWindow.findViewById(android.support.v7.appcompat.R.id.title_template).setVisibility(8);
	//   92  197:aload_0         
	//   93  198:getfield        #119 <Field Window mWindow>
	//   94  201:getstatic       #445 <Field int android.support.v7.appcompat.R$id.title_template>
	//   95  204:invokevirtual   #279 <Method View Window.findViewById(int)>
	//   96  207:bipush          8
	//   97  209:invokevirtual   #247 <Method void View.setVisibility(int)>
			mIconView.setVisibility(8);
	//   98  212:aload_0         
	//   99  213:getfield        #450 <Field ImageView mIconView>
	//  100  216:bipush          8
	//  101  218:invokevirtual   #480 <Method void ImageView.setVisibility(int)>
			viewgroup.setVisibility(8);
	//  102  221:aload_1         
	//  103  222:bipush          8
	//  104  224:invokevirtual   #357 <Method void ViewGroup.setVisibility(int)>
			return;
	//  105  227:return          
		}
	}

	private void setupView()
	{
		Object obj4 = ((Object) (mWindow.findViewById(android.support.v7.appcompat.R.id.parentPanel)));
	//    0    0:aload_0         
	//    1    1:getfield        #119 <Field Window mWindow>
	//    2    4:getstatic       #484 <Field int android.support.v7.appcompat.R$id.parentPanel>
	//    3    7:invokevirtual   #279 <Method View Window.findViewById(int)>
	//    4   10:astore          8
		Object obj3 = ((Object) (((View) (obj4)).findViewById(android.support.v7.appcompat.R.id.topPanel)));
	//    5   12:aload           8
	//    6   14:getstatic       #487 <Field int android.support.v7.appcompat.R$id.topPanel>
	//    7   17:invokevirtual   #488 <Method View View.findViewById(int)>
	//    8   20:astore          7
		Object obj2 = ((Object) (((View) (obj4)).findViewById(android.support.v7.appcompat.R.id.contentPanel)));
	//    9   22:aload           8
	//   10   24:getstatic       #491 <Field int android.support.v7.appcompat.R$id.contentPanel>
	//   11   27:invokevirtual   #488 <Method View View.findViewById(int)>
	//   12   30:astore          6
		Object obj = ((Object) (((View) (obj4)).findViewById(android.support.v7.appcompat.R.id.buttonPanel)));
	//   13   32:aload           8
	//   14   34:getstatic       #494 <Field int android.support.v7.appcompat.R$id.buttonPanel>
	//   15   37:invokevirtual   #488 <Method View View.findViewById(int)>
	//   16   40:astore          5
		obj4 = ((Object) ((ViewGroup)((View) (obj4)).findViewById(android.support.v7.appcompat.R.id.customPanel)));
	//   17   42:aload           8
	//   18   44:getstatic       #497 <Field int android.support.v7.appcompat.R$id.customPanel>
	//   19   47:invokevirtual   #488 <Method View View.findViewById(int)>
	//   20   50:checkcast       #206 <Class ViewGroup>
	//   21   53:astore          8
		setupCustomContent(((ViewGroup) (obj4)));
	//   22   55:aload_0         
	//   23   56:aload           8
	//   24   58:invokespecial   #499 <Method void setupCustomContent(ViewGroup)>
		View view4 = ((ViewGroup) (obj4)).findViewById(android.support.v7.appcompat.R.id.topPanel);
	//   25   61:aload           8
	//   26   63:getstatic       #487 <Field int android.support.v7.appcompat.R$id.topPanel>
	//   27   66:invokevirtual   #325 <Method View ViewGroup.findViewById(int)>
	//   28   69:astore          11
		View view3 = ((ViewGroup) (obj4)).findViewById(android.support.v7.appcompat.R.id.contentPanel);
	//   29   71:aload           8
	//   30   73:getstatic       #491 <Field int android.support.v7.appcompat.R$id.contentPanel>
	//   31   76:invokevirtual   #325 <Method View ViewGroup.findViewById(int)>
	//   32   79:astore          10
		View view2 = ((ViewGroup) (obj4)).findViewById(android.support.v7.appcompat.R.id.buttonPanel);
	//   33   81:aload           8
	//   34   83:getstatic       #494 <Field int android.support.v7.appcompat.R$id.buttonPanel>
	//   35   86:invokevirtual   #325 <Method View ViewGroup.findViewById(int)>
	//   36   89:astore          9
		obj3 = ((Object) (resolvePanel(view4, ((View) (obj3)))));
	//   37   91:aload_0         
	//   38   92:aload           11
	//   39   94:aload           7
	//   40   96:invokespecial   #501 <Method ViewGroup resolvePanel(View, View)>
	//   41   99:astore          7
		obj2 = ((Object) (resolvePanel(view3, ((View) (obj2)))));
	//   42  101:aload_0         
	//   43  102:aload           10
	//   44  104:aload           6
	//   45  106:invokespecial   #501 <Method ViewGroup resolvePanel(View, View)>
	//   46  109:astore          6
		obj = ((Object) (resolvePanel(view2, ((View) (obj)))));
	//   47  111:aload_0         
	//   48  112:aload           9
	//   49  114:aload           5
	//   50  116:invokespecial   #501 <Method ViewGroup resolvePanel(View, View)>
	//   51  119:astore          5
		setupContent(((ViewGroup) (obj2)));
	//   52  121:aload_0         
	//   53  122:aload           6
	//   54  124:invokespecial   #503 <Method void setupContent(ViewGroup)>
		setupButtons(((ViewGroup) (obj)));
	//   55  127:aload_0         
	//   56  128:aload           5
	//   57  130:invokespecial   #505 <Method void setupButtons(ViewGroup)>
		setupTitle(((ViewGroup) (obj3)));
	//   58  133:aload_0         
	//   59  134:aload           7
	//   60  136:invokespecial   #507 <Method void setupTitle(ViewGroup)>
		int i;
		boolean flag;
		boolean flag1;
		if(obj4 != null && ((ViewGroup) (obj4)).getVisibility() != 8)
	//*  61  139:aload           8
	//*  62  141:ifnull          400
	//*  63  144:aload           8
	//*  64  146:invokevirtual   #510 <Method int ViewGroup.getVisibility()>
	//*  65  149:bipush          8
	//*  66  151:icmpeq          400
			i = 1;
	//   67  154:iconst_1        
	//   68  155:istore_1        
		else
	//*  69  156:aload           7
	//*  70  158:ifnull          405
	//*  71  161:aload           7
	//*  72  163:invokevirtual   #510 <Method int ViewGroup.getVisibility()>
	//*  73  166:bipush          8
	//*  74  168:icmpeq          405
	//*  75  171:iconst_1        
	//*  76  172:istore_3        
	//*  77  173:aload           5
	//*  78  175:ifnull          410
	//*  79  178:aload           5
	//*  80  180:invokevirtual   #510 <Method int ViewGroup.getVisibility()>
	//*  81  183:bipush          8
	//*  82  185:icmpeq          410
	//*  83  188:iconst_1        
	//*  84  189:istore          4
	//*  85  191:iload           4
	//*  86  193:ifne            222
	//*  87  196:aload           6
	//*  88  198:ifnull          222
	//*  89  201:aload           6
	//*  90  203:getstatic       #513 <Field int android.support.v7.appcompat.R$id.textSpacerNoButtons>
	//*  91  206:invokevirtual   #325 <Method View ViewGroup.findViewById(int)>
	//*  92  209:astore          5
	//*  93  211:aload           5
	//*  94  213:ifnull          222
	//*  95  216:aload           5
	//*  96  218:iconst_0        
	//*  97  219:invokevirtual   #247 <Method void View.setVisibility(int)>
	//*  98  222:iload_3         
	//*  99  223:ifeq            416
	//* 100  226:aload_0         
	//* 101  227:getfield        #296 <Field NestedScrollView mScrollView>
	//* 102  230:ifnull          241
	//* 103  233:aload_0         
	//* 104  234:getfield        #296 <Field NestedScrollView mScrollView>
	//* 105  237:iconst_1        
	//* 106  238:invokevirtual   #516 <Method void NestedScrollView.setClipToPadding(boolean)>
	//* 107  241:aconst_null     
	//* 108  242:astore          5
	//* 109  244:aload_0         
	//* 110  245:getfield        #294 <Field CharSequence mMessage>
	//* 111  248:ifnonnull       258
	//* 112  251:aload_0         
	//* 113  252:getfield        #312 <Field ListView mListView>
	//* 114  255:ifnull          268
	//* 115  258:aload           7
	//* 116  260:getstatic       #519 <Field int android.support.v7.appcompat.R$id.titleDividerNoCustom>
	//* 117  263:invokevirtual   #325 <Method View ViewGroup.findViewById(int)>
	//* 118  266:astore          5
	//* 119  268:aload           5
	//* 120  270:ifnull          279
	//* 121  273:aload           5
	//* 122  275:iconst_0        
	//* 123  276:invokevirtual   #247 <Method void View.setVisibility(int)>
	//* 124  279:aload_0         
	//* 125  280:getfield        #312 <Field ListView mListView>
	//* 126  283:instanceof      #36  <Class AlertController$RecycleListView>
	//* 127  286:ifeq            302
	//* 128  289:aload_0         
	//* 129  290:getfield        #312 <Field ListView mListView>
	//* 130  293:checkcast       #36  <Class AlertController$RecycleListView>
	//* 131  296:iload_3         
	//* 132  297:iload           4
	//* 133  299:invokevirtual   #523 <Method void AlertController$RecycleListView.setHasDecor(boolean, boolean)>
	//* 134  302:iload_1         
	//* 135  303:ifne            349
	//* 136  306:aload_0         
	//* 137  307:getfield        #312 <Field ListView mListView>
	//* 138  310:ifnull          445
	//* 139  313:aload_0         
	//* 140  314:getfield        #312 <Field ListView mListView>
	//* 141  317:astore          5
	//* 142  319:aload           5
	//* 143  321:ifnull          349
	//* 144  324:iload_3         
	//* 145  325:ifeq            454
	//* 146  328:iconst_1        
	//* 147  329:istore_1        
	//* 148  330:iload           4
	//* 149  332:ifeq            459
	//* 150  335:iconst_2        
	//* 151  336:istore_2        
	//* 152  337:aload_0         
	//* 153  338:aload           6
	//* 154  340:aload           5
	//* 155  342:iload_1         
	//* 156  343:iload_2         
	//* 157  344:ior             
	//* 158  345:iconst_3        
	//* 159  346:invokespecial   #525 <Method void setScrollIndicators(ViewGroup, View, int, int)>
	//* 160  349:aload_0         
	//* 161  350:getfield        #312 <Field ListView mListView>
	//* 162  353:astore          5
	//* 163  355:aload           5
	//* 164  357:ifnull          399
	//* 165  360:aload_0         
	//* 166  361:getfield        #527 <Field ListAdapter mAdapter>
	//* 167  364:ifnull          399
	//* 168  367:aload           5
	//* 169  369:aload_0         
	//* 170  370:getfield        #527 <Field ListAdapter mAdapter>
	//* 171  373:invokevirtual   #531 <Method void ListView.setAdapter(ListAdapter)>
	//* 172  376:aload_0         
	//* 173  377:getfield        #106 <Field int mCheckedItem>
	//* 174  380:istore_1        
	//* 175  381:iload_1         
	//* 176  382:iconst_m1       
	//* 177  383:icmple          399
	//* 178  386:aload           5
	//* 179  388:iload_1         
	//* 180  389:iconst_1        
	//* 181  390:invokevirtual   #535 <Method void ListView.setItemChecked(int, boolean)>
	//* 182  393:aload           5
	//* 183  395:iload_1         
	//* 184  396:invokevirtual   #538 <Method void ListView.setSelection(int)>
	//* 185  399:return          
			i = 0;
	//  186  400:iconst_0        
	//  187  401:istore_1        
		if(obj3 != null && ((ViewGroup) (obj3)).getVisibility() != 8)
			flag = true;
		else
	//* 188  402:goto            156
			flag = false;
	//  189  405:iconst_0        
	//  190  406:istore_3        
		if(obj != null && ((ViewGroup) (obj)).getVisibility() != 8)
			flag1 = true;
		else
	//* 191  407:goto            173
			flag1 = false;
	//  192  410:iconst_0        
	//  193  411:istore          4
		if(!flag1 && obj2 != null)
		{
			View view = ((ViewGroup) (obj2)).findViewById(android.support.v7.appcompat.R.id.textSpacerNoButtons);
			if(view != null)
				view.setVisibility(0);
		}
		if(flag)
		{
			if(mScrollView != null)
				mScrollView.setClipToPadding(true);
			View view1 = null;
			if(mMessage != null || mListView != null)
				view1 = ((ViewGroup) (obj3)).findViewById(android.support.v7.appcompat.R.id.titleDividerNoCustom);
			if(view1 != null)
				view1.setVisibility(0);
		} else
	//* 194  413:goto            191
		if(obj2 != null)
	//* 195  416:aload           6
	//* 196  418:ifnull          279
		{
			obj1 = ((Object) (((ViewGroup) (obj2)).findViewById(android.support.v7.appcompat.R.id.textSpacerNoTitle)));
	//  197  421:aload           6
	//  198  423:getstatic       #541 <Field int android.support.v7.appcompat.R$id.textSpacerNoTitle>
	//  199  426:invokevirtual   #325 <Method View ViewGroup.findViewById(int)>
	//  200  429:astore          5
			if(obj1 != null)
	//* 201  431:aload           5
	//* 202  433:ifnull          279
				((View) (obj1)).setVisibility(0);
	//  203  436:aload           5
	//  204  438:iconst_0        
	//  205  439:invokevirtual   #247 <Method void View.setVisibility(int)>
		}
		if(mListView instanceof RecycleListView)
			((RecycleListView)mListView).setHasDecor(flag, flag1);
		if(i == 0)
		{
			Object obj1;
			if(mListView != null)
				obj1 = ((Object) (mListView));
			else
	//* 206  442:goto            279
				obj1 = ((Object) (mScrollView));
	//  207  445:aload_0         
	//  208  446:getfield        #296 <Field NestedScrollView mScrollView>
	//  209  449:astore          5
			if(obj1 != null)
			{
				byte byte0;
				if(flag)
					i = 1;
				else
	//* 210  451:goto            319
					i = 0;
	//  211  454:iconst_0        
	//  212  455:istore_1        
				if(flag1)
					byte0 = 2;
				else
	//* 213  456:goto            330
					byte0 = 0;
	//  214  459:iconst_0        
	//  215  460:istore_2        
				setScrollIndicators(((ViewGroup) (obj2)), ((View) (obj1)), i | byte0, 3);
			}
		}
		obj1 = ((Object) (mListView));
		if(obj1 != null && mAdapter != null)
		{
			((ListView) (obj1)).setAdapter(mAdapter);
			i = mCheckedItem;
			if(i > -1)
			{
				((ListView) (obj1)).setItemChecked(i, true);
				((ListView) (obj1)).setSelection(i);
			}
		}
	//* 216  461:goto            337
	}

	private static boolean shouldCenterSingleButton(Context context)
	{
		TypedValue typedvalue = new TypedValue();
	//    0    0:new             #543 <Class TypedValue>
	//    1    3:dup             
	//    2    4:invokespecial   #544 <Method void TypedValue()>
	//    3    7:astore_1        
		context.getTheme().resolveAttribute(android.support.v7.appcompat.R.attr.alertDialogCenterButtons, typedvalue, true);
	//    4    8:aload_0         
	//    5    9:invokevirtual   #548 <Method android.content.res.Resources$Theme Context.getTheme()>
	//    6   12:getstatic       #551 <Field int android.support.v7.appcompat.R$attr.alertDialogCenterButtons>
	//    7   15:aload_1         
	//    8   16:iconst_1        
	//    9   17:invokevirtual   #557 <Method boolean android.content.res.Resources$Theme.resolveAttribute(int, TypedValue, boolean)>
	//   10   20:pop             
		return typedvalue.data != 0;
	//   11   21:aload_1         
	//   12   22:getfield        #560 <Field int TypedValue.data>
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
	//    5   31:getfield        #327 <Field Button mButtonPositive>
	//    6   34:areturn         

		case -2: 
			return mButtonNegative;
	//    7   35:aload_0         
	//    8   36:getfield        #343 <Field Button mButtonNegative>
	//    9   39:areturn         

		case -3: 
			return mButtonNeutral;
	//   10   40:aload_0         
	//   11   41:getfield        #348 <Field Button mButtonNeutral>
	//   12   44:areturn         
		}
	}

	public int getIconAttributeResId(int i)
	{
		TypedValue typedvalue = new TypedValue();
	//    0    0:new             #543 <Class TypedValue>
	//    1    3:dup             
	//    2    4:invokespecial   #544 <Method void TypedValue()>
	//    3    7:astore_2        
		mContext.getTheme().resolveAttribute(i, typedvalue, true);
	//    4    8:aload_0         
	//    5    9:getfield        #115 <Field Context mContext>
	//    6   12:invokevirtual   #548 <Method android.content.res.Resources$Theme Context.getTheme()>
	//    7   15:iload_1         
	//    8   16:aload_2         
	//    9   17:iconst_1        
	//   10   18:invokevirtual   #557 <Method boolean android.content.res.Resources$Theme.resolveAttribute(int, TypedValue, boolean)>
	//   11   21:pop             
		return typedvalue.resourceId;
	//   12   22:aload_2         
	//   13   23:getfield        #567 <Field int TypedValue.resourceId>
	//   14   26:ireturn         
	}

	public ListView getListView()
	{
		return mListView;
	//    0    0:aload_0         
	//    1    1:getfield        #312 <Field ListView mListView>
	//    2    4:areturn         
	}

	public void installContent()
	{
		int i = selectContentView();
	//    0    0:aload_0         
	//    1    1:invokespecial   #572 <Method int selectContentView()>
	//    2    4:istore_1        
		mDialog.setContentView(i);
	//    3    5:aload_0         
	//    4    6:getfield        #117 <Field AppCompatDialog mDialog>
	//    5    9:iload_1         
	//    6   10:invokevirtual   #575 <Method void AppCompatDialog.setContentView(int)>
		setupView();
	//    7   13:aload_0         
	//    8   14:invokespecial   #577 <Method void setupView()>
	//    9   17:return          
	}

	public boolean onKeyDown(int i, KeyEvent keyevent)
	{
		return mScrollView != null && mScrollView.executeKeyEvent(keyevent);
	//    0    0:aload_0         
	//    1    1:getfield        #296 <Field NestedScrollView mScrollView>
	//    2    4:ifnull          20
	//    3    7:aload_0         
	//    4    8:getfield        #296 <Field NestedScrollView mScrollView>
	//    5   11:aload_2         
	//    6   12:invokevirtual   #583 <Method boolean NestedScrollView.executeKeyEvent(KeyEvent)>
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
	//    1    1:getfield        #296 <Field NestedScrollView mScrollView>
	//    2    4:ifnull          20
	//    3    7:aload_0         
	//    4    8:getfield        #296 <Field NestedScrollView mScrollView>
	//    5   11:aload_2         
	//    6   12:invokevirtual   #583 <Method boolean NestedScrollView.executeKeyEvent(KeyEvent)>
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
	//   12   23:invokevirtual   #592 <Method Message Handler.obtainMessage(int, Object)>
	//   13   26:astore          5
		}
		switch(i)
	//*  14   28:iload_1         
		{
	//*  15   29:tableswitch     -3 -1: default 56
	//	               -3 91
	//	               -2 79
	//	               -1 67
		default:
			throw new IllegalArgumentException("Button does not exist");
	//   16   56:new             #594 <Class IllegalArgumentException>
	//   17   59:dup             
	//   18   60:ldc2            #596 <String "Button does not exist">
	//   19   63:invokespecial   #599 <Method void IllegalArgumentException(String)>
	//   20   66:athrow          

		case -1: 
			mButtonPositiveText = charsequence;
	//   21   67:aload_0         
	//   22   68:aload_2         
	//   23   69:putfield        #333 <Field CharSequence mButtonPositiveText>
			mButtonPositiveMessage = message1;
	//   24   72:aload_0         
	//   25   73:aload           5
	//   26   75:putfield        #601 <Field Message mButtonPositiveMessage>
			return;
	//   27   78:return          

		case -2: 
			mButtonNegativeText = charsequence;
	//   28   79:aload_0         
	//   29   80:aload_2         
	//   30   81:putfield        #345 <Field CharSequence mButtonNegativeText>
			mButtonNegativeMessage = message1;
	//   31   84:aload_0         
	//   32   85:aload           5
	//   33   87:putfield        #603 <Field Message mButtonNegativeMessage>
			return;
	//   34   90:return          

		case -3: 
			mButtonNeutralText = charsequence;
	//   35   91:aload_0         
	//   36   92:aload_2         
	//   37   93:putfield        #350 <Field CharSequence mButtonNeutralText>
			mButtonNeutralMessage = message1;
	//   38   96:aload_0         
	//   39   97:aload           5
	//   40   99:putfield        #605 <Field Message mButtonNeutralMessage>
			return;
	//   41  102:return          
		}
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
	//    2    2:putfield        #442 <Field View mCustomTitleView>
	//    3    5:return          
	}

	public void setIcon(int i)
	{
label0:
		{
			mIcon = null;
	//    0    0:aload_0         
	//    1    1:aconst_null     
	//    2    2:putfield        #462 <Field Drawable mIcon>
			mIconId = i;
	//    3    5:aload_0         
	//    4    6:iload_1         
	//    5    7:putfield        #104 <Field int mIconId>
			if(mIconView != null)
	//*   6   10:aload_0         
	//*   7   11:getfield        #450 <Field ImageView mIconView>
	//*   8   14:ifnull          40
			{
				if(i == 0)
					break label0;
	//    9   17:iload_1         
	//   10   18:ifeq            41
				mIconView.setVisibility(0);
	//   11   21:aload_0         
	//   12   22:getfield        #450 <Field ImageView mIconView>
	//   13   25:iconst_0        
	//   14   26:invokevirtual   #480 <Method void ImageView.setVisibility(int)>
				mIconView.setImageResource(mIconId);
	//   15   29:aload_0         
	//   16   30:getfield        #450 <Field ImageView mIconView>
	//   17   33:aload_0         
	//   18   34:getfield        #104 <Field int mIconId>
	//   19   37:invokevirtual   #460 <Method void ImageView.setImageResource(int)>
			}
			return;
	//   20   40:return          
		}
		mIconView.setVisibility(8);
	//   21   41:aload_0         
	//   22   42:getfield        #450 <Field ImageView mIconView>
	//   23   45:bipush          8
	//   24   47:invokevirtual   #480 <Method void ImageView.setVisibility(int)>
	//   25   50:return          
	}

	public void setIcon(Drawable drawable)
	{
label0:
		{
			mIcon = drawable;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #462 <Field Drawable mIcon>
			mIconId = 0;
	//    3    5:aload_0         
	//    4    6:iconst_0        
	//    5    7:putfield        #104 <Field int mIconId>
			if(mIconView != null)
	//*   6   10:aload_0         
	//*   7   11:getfield        #450 <Field ImageView mIconView>
	//*   8   14:ifnull          37
			{
				if(drawable == null)
					break label0;
	//    9   17:aload_1         
	//   10   18:ifnull          38
				mIconView.setVisibility(0);
	//   11   21:aload_0         
	//   12   22:getfield        #450 <Field ImageView mIconView>
	//   13   25:iconst_0        
	//   14   26:invokevirtual   #480 <Method void ImageView.setVisibility(int)>
				mIconView.setImageDrawable(drawable);
	//   15   29:aload_0         
	//   16   30:getfield        #450 <Field ImageView mIconView>
	//   17   33:aload_1         
	//   18   34:invokevirtual   #466 <Method void ImageView.setImageDrawable(Drawable)>
			}
			return;
	//   19   37:return          
		}
		mIconView.setVisibility(8);
	//   20   38:aload_0         
	//   21   39:getfield        #450 <Field ImageView mIconView>
	//   22   42:bipush          8
	//   23   44:invokevirtual   #480 <Method void ImageView.setVisibility(int)>
	//   24   47:return          
	}

	public void setMessage(CharSequence charsequence)
	{
		mMessage = charsequence;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #294 <Field CharSequence mMessage>
		if(mMessageView != null)
	//*   3    5:aload_0         
	//*   4    6:getfield        #377 <Field TextView mMessageView>
	//*   5    9:ifnull          20
			mMessageView.setText(charsequence);
	//    6   12:aload_0         
	//    7   13:getfield        #377 <Field TextView mMessageView>
	//    8   16:aload_1         
	//    9   17:invokevirtual   #378 <Method void TextView.setText(CharSequence)>
	//   10   20:return          
	}

	public void setTitle(CharSequence charsequence)
	{
		mTitle = charsequence;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #452 <Field CharSequence mTitle>
		if(mTitleView != null)
	//*   3    5:aload_0         
	//*   4    6:getfield        #457 <Field TextView mTitleView>
	//*   5    9:ifnull          20
			mTitleView.setText(charsequence);
	//    6   12:aload_0         
	//    7   13:getfield        #457 <Field TextView mTitleView>
	//    8   16:aload_1         
	//    9   17:invokevirtual   #378 <Method void TextView.setText(CharSequence)>
	//   10   20:return          
	}

	public void setView(int i)
	{
		mView = null;
	//    0    0:aload_0         
	//    1    1:aconst_null     
	//    2    2:putfield        #400 <Field View mView>
		mViewLayoutResId = i;
	//    3    5:aload_0         
	//    4    6:iload_1         
	//    5    7:putfield        #430 <Field int mViewLayoutResId>
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
	//    2    2:putfield        #400 <Field View mView>
		mViewLayoutResId = 0;
	//    3    5:aload_0         
	//    4    6:iconst_0        
	//    5    7:putfield        #430 <Field int mViewLayoutResId>
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
	//    2    2:putfield        #400 <Field View mView>
		mViewLayoutResId = 0;
	//    3    5:aload_0         
	//    4    6:iconst_0        
	//    5    7:putfield        #430 <Field int mViewLayoutResId>
		mViewSpacingSpecified = true;
	//    6   10:aload_0         
	//    7   11:iconst_1        
	//    8   12:putfield        #102 <Field boolean mViewSpacingSpecified>
		mViewSpacingLeft = i;
	//    9   15:aload_0         
	//   10   16:iload_2         
	//   11   17:putfield        #414 <Field int mViewSpacingLeft>
		mViewSpacingTop = j;
	//   12   20:aload_0         
	//   13   21:iload_3         
	//   14   22:putfield        #416 <Field int mViewSpacingTop>
		mViewSpacingRight = k;
	//   15   25:aload_0         
	//   16   26:iload           4
	//   17   28:putfield        #418 <Field int mViewSpacingRight>
		mViewSpacingBottom = l;
	//   18   31:aload_0         
	//   19   32:iload           5
	//   20   34:putfield        #420 <Field int mViewSpacingBottom>
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
		//*   4    8:if_acmpne       62
		//*   5   11:aload_0         
		//*   6   12:getfield        #14  <Field AlertController this$0>
		//*   7   15:getfield        #28  <Field Message AlertController.mButtonPositiveMessage>
		//*   8   18:ifnull          62
				view = ((View) (Message.obtain(mButtonPositiveMessage)));
		//    9   21:aload_0         
		//   10   22:getfield        #14  <Field AlertController this$0>
		//   11   25:getfield        #28  <Field Message AlertController.mButtonPositiveMessage>
		//   12   28:invokestatic    #34  <Method Message Message.obtain(Message)>
		//   13   31:astore_1        
			else
		//*  14   32:aload_1         
		//*  15   33:ifnull          40
		//*  16   36:aload_1         
		//*  17   37:invokevirtual   #37  <Method void Message.sendToTarget()>
		//*  18   40:aload_0         
		//*  19   41:getfield        #14  <Field AlertController this$0>
		//*  20   44:getfield        #41  <Field Handler AlertController.mHandler>
		//*  21   47:iconst_1        
		//*  22   48:aload_0         
		//*  23   49:getfield        #14  <Field AlertController this$0>
		//*  24   52:getfield        #45  <Field AppCompatDialog AlertController.mDialog>
		//*  25   55:invokevirtual   #51  <Method Message Handler.obtainMessage(int, Object)>
		//*  26   58:invokevirtual   #37  <Method void Message.sendToTarget()>
		//*  27   61:return          
			if(view == mButtonNegative && mButtonNegativeMessage != null)
		//*  28   62:aload_1         
		//*  29   63:aload_0         
		//*  30   64:getfield        #14  <Field AlertController this$0>
		//*  31   67:getfield        #54  <Field Button AlertController.mButtonNegative>
		//*  32   70:if_acmpne       97
		//*  33   73:aload_0         
		//*  34   74:getfield        #14  <Field AlertController this$0>
		//*  35   77:getfield        #57  <Field Message AlertController.mButtonNegativeMessage>
		//*  36   80:ifnull          97
				view = ((View) (Message.obtain(mButtonNegativeMessage)));
		//   37   83:aload_0         
		//   38   84:getfield        #14  <Field AlertController this$0>
		//   39   87:getfield        #57  <Field Message AlertController.mButtonNegativeMessage>
		//   40   90:invokestatic    #34  <Method Message Message.obtain(Message)>
		//   41   93:astore_1        
			else
		//*  42   94:goto            32
			if(view == mButtonNeutral && mButtonNeutralMessage != null)
		//*  43   97:aload_1         
		//*  44   98:aload_0         
		//*  45   99:getfield        #14  <Field AlertController this$0>
		//*  46  102:getfield        #60  <Field Button AlertController.mButtonNeutral>
		//*  47  105:if_acmpne       132
		//*  48  108:aload_0         
		//*  49  109:getfield        #14  <Field AlertController this$0>
		//*  50  112:getfield        #63  <Field Message AlertController.mButtonNeutralMessage>
		//*  51  115:ifnull          132
				view = ((View) (Message.obtain(mButtonNeutralMessage)));
		//   52  118:aload_0         
		//   53  119:getfield        #14  <Field AlertController this$0>
		//   54  122:getfield        #63  <Field Message AlertController.mButtonNeutralMessage>
		//   55  125:invokestatic    #34  <Method Message Message.obtain(Message)>
		//   56  128:astore_1        
			else
		//*  57  129:goto            32
				view = null;
		//   58  132:aconst_null     
		//   59  133:astore_1        
			if(view != null)
				((Message) (view)).sendToTarget();
			mHandler.obtainMessage(1, ((Object) (mDialog))).sendToTarget();
		//*  60  134:goto            32
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
