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
		//*  10   21:ifeq            82
			{
				obj = ((Object) (mCursor));
		//   11   24:aload_0         
		//   12   25:getfield        #127 <Field Cursor mCursor>
		//   13   28:astore_3        
				if(obj == null)
		//*  14   29:aload_3         
		//*  15   30:ifnonnull       61
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
		//   16   33:new             #9   <Class AlertController$AlertParams$1>
		//   17   36:dup             
		//   18   37:aload_0         
		//   19   38:aload_0         
		//   20   39:getfield        #97  <Field Context mContext>
		//   21   42:aload_1         
		//   22   43:getfield        #130 <Field int AlertController.mMultiChoiceItemLayout>
		//   23   46:ldc1            #131 <Int 0x1020014>
		//   24   48:aload_0         
		//   25   49:getfield        #133 <Field CharSequence[] mItems>
		//   26   52:aload           4
		//   27   54:invokespecial   #136 <Method void AlertController$AlertParams$1(AlertController$AlertParams, Context, int, int, CharSequence[], AlertController$RecycleListView)>
		//   28   57:astore_3        
				else
		//*  29   58:goto            178
					obj = ((Object) (((_cls2) (obj)). new CursorAdapter(false, listView, alertcontroller) {

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
		//   30   61:new             #11  <Class AlertController$AlertParams$2>
		//   31   64:dup             
		//   32   65:aload_0         
		//   33   66:aload_0         
		//   34   67:getfield        #97  <Field Context mContext>
		//   35   70:aload_3         
		//   36   71:iconst_0        
		//   37   72:aload           4
		//   38   74:aload_1         
		//   39   75:invokespecial   #139 <Method void AlertController$AlertParams$2(AlertController$AlertParams, Context, Cursor, boolean, AlertController$RecycleListView, AlertController)>
		//   40   78:astore_3        
			} else
		//*  41   79:goto            178
			{
				int i;
				if(mIsSingleChoice)
		//*  42   82:aload_0         
		//*  43   83:getfield        #141 <Field boolean mIsSingleChoice>
		//*  44   86:ifeq            97
					i = alertcontroller.mSingleChoiceItemLayout;
		//   45   89:aload_1         
		//   46   90:getfield        #144 <Field int AlertController.mSingleChoiceItemLayout>
		//   47   93:istore_2        
				else
		//*  48   94:goto            102
					i = alertcontroller.mListItemLayout;
		//   49   97:aload_1         
		//   50   98:getfield        #147 <Field int AlertController.mListItemLayout>
		//   51  101:istore_2        
				obj = ((Object) (mCursor));
		//   52  102:aload_0         
		//   53  103:getfield        #127 <Field Cursor mCursor>
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
		//   57  111:new             #149 <Class SimpleCursorAdapter>
		//   58  114:dup             
		//   59  115:aload_0         
		//   60  116:getfield        #97  <Field Context mContext>
		//   61  119:iload_2         
		//   62  120:aload_3         
		//   63  121:iconst_1        
		//   64  122:anewarray       String[]
		//   65  125:dup             
		//   66  126:iconst_0        
		//   67  127:aload_0         
		//   68  128:getfield        #153 <Field String mLabelColumn>
		//   69  131:aastore         
		//   70  132:iconst_1        
		//   71  133:newarray        int[]
		//   72  135:dup             
		//   73  136:iconst_0        
		//   74  137:ldc1            #131 <Int 0x1020014>
		//   75  139:iastore         
		//   76  140:invokespecial   #156 <Method void SimpleCursorAdapter(Context, int, Cursor, String[], int[])>
		//   77  143:astore_3        
				} else
		//*  78  144:goto            178
				{
					obj = ((Object) (mAdapter));
		//   79  147:aload_0         
		//   80  148:getfield        #158 <Field ListAdapter mAdapter>
		//   81  151:astore_3        
					if(obj == null)
		//*  82  152:aload_3         
		//*  83  153:ifnull          159
		//*  84  156:goto            178
						obj = ((Object) (new CheckedItemAdapter(mContext, i, 0x1020014, mItems)));
		//   85  159:new             #160 <Class AlertController$CheckedItemAdapter>
		//   86  162:dup             
		//   87  163:aload_0         
		//   88  164:getfield        #97  <Field Context mContext>
		//   89  167:iload_2         
		//   90  168:ldc1            #131 <Int 0x1020014>
		//   91  170:aload_0         
		//   92  171:getfield        #133 <Field CharSequence[] mItems>
		//   93  174:invokespecial   #163 <Method void AlertController$CheckedItemAdapter(Context, int, int, CharSequence[])>
		//   94  177:astore_3        
				}
			}
			OnPrepareListViewListener onpreparelistviewlistener = mOnPrepareListViewListener;
		//   95  178:aload_0         
		//   96  179:getfield        #165 <Field AlertController$AlertParams$OnPrepareListViewListener mOnPrepareListViewListener>
		//   97  182:astore          5
			if(onpreparelistviewlistener != null)
		//*  98  184:aload           5
		//*  99  186:ifnull          198
				onpreparelistviewlistener.onPrepareListView(((ListView) (listView)));
		//  100  189:aload           5
		//  101  191:aload           4
		//  102  193:invokeinterface #169 <Method void AlertController$AlertParams$OnPrepareListViewListener.onPrepareListView(ListView)>
			alertcontroller.mAdapter = ((ListAdapter) (obj));
		//  103  198:aload_1         
		//  104  199:aload_3         
		//  105  200:putfield        #170 <Field ListAdapter AlertController.mAdapter>
			alertcontroller.mCheckedItem = mCheckedItem;
		//  106  203:aload_1         
		//  107  204:aload_0         
		//  108  205:getfield        #93  <Field int mCheckedItem>
		//  109  208:putfield        #171 <Field int AlertController.mCheckedItem>
			if(mOnClickListener != null)
		//* 110  211:aload_0         
		//* 111  212:getfield        #173 <Field android.content.DialogInterface$OnClickListener mOnClickListener>
		//* 112  215:ifnull          235
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
		//  113  218:aload           4
		//  114  220:new             #13  <Class AlertController$AlertParams$3>
		//  115  223:dup             
		//  116  224:aload_0         
		//  117  225:aload_1         
		//  118  226:invokespecial   #176 <Method void AlertController$AlertParams$3(AlertController$AlertParams, AlertController)>
		//  119  229:invokevirtual   #180 <Method void AlertController$RecycleListView.setOnItemClickListener(android.widget.AdapterView$OnItemClickListener)>
			else
		//* 120  232:goto            258
			if(mOnCheckboxClickListener != null)
		//* 121  235:aload_0         
		//* 122  236:getfield        #182 <Field android.content.DialogInterface$OnMultiChoiceClickListener mOnCheckboxClickListener>
		//* 123  239:ifnull          258
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
		//  124  242:aload           4
		//  125  244:new             #15  <Class AlertController$AlertParams$4>
		//  126  247:dup             
		//  127  248:aload_0         
		//  128  249:aload           4
		//  129  251:aload_1         
		//  130  252:invokespecial   #185 <Method void AlertController$AlertParams$4(AlertController$AlertParams, AlertController$RecycleListView, AlertController)>
		//  131  255:invokevirtual   #180 <Method void AlertController$RecycleListView.setOnItemClickListener(android.widget.AdapterView$OnItemClickListener)>
			obj = ((Object) (mOnItemSelectedListener));
		//  132  258:aload_0         
		//  133  259:getfield        #187 <Field android.widget.AdapterView$OnItemSelectedListener mOnItemSelectedListener>
		//  134  262:astore_3        
			if(obj != null)
		//* 135  263:aload_3         
		//* 136  264:ifnull          273
				listView.setOnItemSelectedListener(((android.widget.AdapterView.OnItemSelectedListener) (obj)));
		//  137  267:aload           4
		//  138  269:aload_3         
		//  139  270:invokevirtual   #191 <Method void AlertController$RecycleListView.setOnItemSelectedListener(android.widget.AdapterView$OnItemSelectedListener)>
			if(mIsSingleChoice)
		//* 140  273:aload_0         
		//* 141  274:getfield        #141 <Field boolean mIsSingleChoice>
		//* 142  277:ifeq            289
				listView.setChoiceMode(1);
		//  143  280:aload           4
		//  144  282:iconst_1        
		//  145  283:invokevirtual   #195 <Method void AlertController$RecycleListView.setChoiceMode(int)>
			else
		//* 146  286:goto            302
			if(mIsMultiChoice)
		//* 147  289:aload_0         
		//* 148  290:getfield        #125 <Field boolean mIsMultiChoice>
		//* 149  293:ifeq            302
				listView.setChoiceMode(2);
		//  150  296:aload           4
		//  151  298:iconst_2        
		//  152  299:invokevirtual   #195 <Method void AlertController$RecycleListView.setChoiceMode(int)>
			alertcontroller.mListView = ((ListView) (listView));
		//  153  302:aload_1         
		//  154  303:aload           4
		//  155  305:putfield        #199 <Field ListView AlertController.mListView>
		//  156  308:return          
		}

		public void apply(AlertController alertcontroller)
		{
			Object obj = ((Object) (mCustomTitleView));
		//    0    0:aload_0         
		//    1    1:getfield        #202 <Field View mCustomTitleView>
		//    2    4:astore_3        
			if(obj != null)
		//*   3    5:aload_3         
		//*   4    6:ifnull          17
			{
				alertcontroller.setCustomTitle(((View) (obj)));
		//    5    9:aload_1         
		//    6   10:aload_3         
		//    7   11:invokevirtual   #206 <Method void AlertController.setCustomTitle(View)>
			} else
		//*   8   14:goto            77
			{
				obj = ((Object) (mTitle));
		//    9   17:aload_0         
		//   10   18:getfield        #208 <Field CharSequence mTitle>
		//   11   21:astore_3        
				if(obj != null)
		//*  12   22:aload_3         
		//*  13   23:ifnull          31
					alertcontroller.setTitle(((CharSequence) (obj)));
		//   14   26:aload_1         
		//   15   27:aload_3         
		//   16   28:invokevirtual   #212 <Method void AlertController.setTitle(CharSequence)>
				obj = ((Object) (mIcon));
		//   17   31:aload_0         
		//   18   32:getfield        #214 <Field Drawable mIcon>
		//   19   35:astore_3        
				if(obj != null)
		//*  20   36:aload_3         
		//*  21   37:ifnull          45
					alertcontroller.setIcon(((Drawable) (obj)));
		//   22   40:aload_1         
		//   23   41:aload_3         
		//   24   42:invokevirtual   #218 <Method void AlertController.setIcon(Drawable)>
				int i = mIconId;
		//   25   45:aload_0         
		//   26   46:getfield        #87  <Field int mIconId>
		//   27   49:istore_2        
				if(i != 0)
		//*  28   50:iload_2         
		//*  29   51:ifeq            59
					alertcontroller.setIcon(i);
		//   30   54:aload_1         
		//   31   55:iload_2         
		//   32   56:invokevirtual   #220 <Method void AlertController.setIcon(int)>
				i = mIconAttrId;
		//   33   59:aload_0         
		//   34   60:getfield        #89  <Field int mIconAttrId>
		//   35   63:istore_2        
				if(i != 0)
		//*  36   64:iload_2         
		//*  37   65:ifeq            77
					alertcontroller.setIcon(alertcontroller.getIconAttributeResId(i));
		//   38   68:aload_1         
		//   39   69:aload_1         
		//   40   70:iload_2         
		//   41   71:invokevirtual   #224 <Method int AlertController.getIconAttributeResId(int)>
		//   42   74:invokevirtual   #220 <Method void AlertController.setIcon(int)>
			}
			obj = ((Object) (mMessage));
		//   43   77:aload_0         
		//   44   78:getfield        #226 <Field CharSequence mMessage>
		//   45   81:astore_3        
			if(obj != null)
		//*  46   82:aload_3         
		//*  47   83:ifnull          91
				alertcontroller.setMessage(((CharSequence) (obj)));
		//   48   86:aload_1         
		//   49   87:aload_3         
		//   50   88:invokevirtual   #229 <Method void AlertController.setMessage(CharSequence)>
			if(mPositiveButtonText != null || mPositiveButtonIcon != null)
		//*  51   91:aload_0         
		//*  52   92:getfield        #231 <Field CharSequence mPositiveButtonText>
		//*  53   95:ifnonnull       105
		//*  54   98:aload_0         
		//*  55   99:getfield        #233 <Field Drawable mPositiveButtonIcon>
		//*  56  102:ifnull          123
				alertcontroller.setButton(-1, mPositiveButtonText, mPositiveButtonListener, ((Message) (null)), mPositiveButtonIcon);
		//   57  105:aload_1         
		//   58  106:iconst_m1       
		//   59  107:aload_0         
		//   60  108:getfield        #231 <Field CharSequence mPositiveButtonText>
		//   61  111:aload_0         
		//   62  112:getfield        #235 <Field android.content.DialogInterface$OnClickListener mPositiveButtonListener>
		//   63  115:aconst_null     
		//   64  116:aload_0         
		//   65  117:getfield        #233 <Field Drawable mPositiveButtonIcon>
		//   66  120:invokevirtual   #239 <Method void AlertController.setButton(int, CharSequence, android.content.DialogInterface$OnClickListener, Message, Drawable)>
			if(mNegativeButtonText != null || mNegativeButtonIcon != null)
		//*  67  123:aload_0         
		//*  68  124:getfield        #241 <Field CharSequence mNegativeButtonText>
		//*  69  127:ifnonnull       137
		//*  70  130:aload_0         
		//*  71  131:getfield        #243 <Field Drawable mNegativeButtonIcon>
		//*  72  134:ifnull          156
				alertcontroller.setButton(-2, mNegativeButtonText, mNegativeButtonListener, ((Message) (null)), mNegativeButtonIcon);
		//   73  137:aload_1         
		//   74  138:bipush          -2
		//   75  140:aload_0         
		//   76  141:getfield        #241 <Field CharSequence mNegativeButtonText>
		//   77  144:aload_0         
		//   78  145:getfield        #245 <Field android.content.DialogInterface$OnClickListener mNegativeButtonListener>
		//   79  148:aconst_null     
		//   80  149:aload_0         
		//   81  150:getfield        #243 <Field Drawable mNegativeButtonIcon>
		//   82  153:invokevirtual   #239 <Method void AlertController.setButton(int, CharSequence, android.content.DialogInterface$OnClickListener, Message, Drawable)>
			if(mNeutralButtonText != null || mNeutralButtonIcon != null)
		//*  83  156:aload_0         
		//*  84  157:getfield        #247 <Field CharSequence mNeutralButtonText>
		//*  85  160:ifnonnull       170
		//*  86  163:aload_0         
		//*  87  164:getfield        #249 <Field Drawable mNeutralButtonIcon>
		//*  88  167:ifnull          189
				alertcontroller.setButton(-3, mNeutralButtonText, mNeutralButtonListener, ((Message) (null)), mNeutralButtonIcon);
		//   89  170:aload_1         
		//   90  171:bipush          -3
		//   91  173:aload_0         
		//   92  174:getfield        #247 <Field CharSequence mNeutralButtonText>
		//   93  177:aload_0         
		//   94  178:getfield        #251 <Field android.content.DialogInterface$OnClickListener mNeutralButtonListener>
		//   95  181:aconst_null     
		//   96  182:aload_0         
		//   97  183:getfield        #249 <Field Drawable mNeutralButtonIcon>
		//   98  186:invokevirtual   #239 <Method void AlertController.setButton(int, CharSequence, android.content.DialogInterface$OnClickListener, Message, Drawable)>
			if(mItems != null || mCursor != null || mAdapter != null)
		//*  99  189:aload_0         
		//* 100  190:getfield        #133 <Field CharSequence[] mItems>
		//* 101  193:ifnonnull       210
		//* 102  196:aload_0         
		//* 103  197:getfield        #127 <Field Cursor mCursor>
		//* 104  200:ifnonnull       210
		//* 105  203:aload_0         
		//* 106  204:getfield        #158 <Field ListAdapter mAdapter>
		//* 107  207:ifnull          215
				createListView(alertcontroller);
		//  108  210:aload_0         
		//  109  211:aload_1         
		//  110  212:invokespecial   #253 <Method void createListView(AlertController)>
			obj = ((Object) (mView));
		//  111  215:aload_0         
		//  112  216:getfield        #255 <Field View mView>
		//  113  219:astore_3        
			if(obj != null)
		//* 114  220:aload_3         
		//* 115  221:ifnull          259
				if(mViewSpacingSpecified)
		//* 116  224:aload_0         
		//* 117  225:getfield        #91  <Field boolean mViewSpacingSpecified>
		//* 118  228:ifeq            253
				{
					alertcontroller.setView(((View) (obj)), mViewSpacingLeft, mViewSpacingTop, mViewSpacingRight, mViewSpacingBottom);
		//  119  231:aload_1         
		//  120  232:aload_3         
		//  121  233:aload_0         
		//  122  234:getfield        #257 <Field int mViewSpacingLeft>
		//  123  237:aload_0         
		//  124  238:getfield        #259 <Field int mViewSpacingTop>
		//  125  241:aload_0         
		//  126  242:getfield        #261 <Field int mViewSpacingRight>
		//  127  245:aload_0         
		//  128  246:getfield        #263 <Field int mViewSpacingBottom>
		//  129  249:invokevirtual   #267 <Method void AlertController.setView(View, int, int, int, int)>
					return;
		//  130  252:return          
				} else
				{
					alertcontroller.setView(((View) (obj)));
		//  131  253:aload_1         
		//  132  254:aload_3         
		//  133  255:invokevirtual   #269 <Method void AlertController.setView(View)>
					return;
		//  134  258:return          
				}
			int j = mViewLayoutResId;
		//  135  259:aload_0         
		//  136  260:getfield        #271 <Field int mViewLayoutResId>
		//  137  263:istore_2        
			if(j != 0)
		//* 138  264:iload_2         
		//* 139  265:ifeq            273
				alertcontroller.setView(j);
		//  140  268:aload_1         
		//  141  269:iload_2         
		//  142  270:invokevirtual   #273 <Method void AlertController.setView(int)>
		//  143  273:return          
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
		boolean flag = false;
	//    0    0:iconst_0        
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
	//*  17   28:ifnull          52
		{
			byte byte1;
			if(view.canScrollVertically(1))
	//*  18   31:aload_0         
	//*  19   32:iconst_1        
	//*  20   33:invokevirtual   #255 <Method boolean View.canScrollVertically(int)>
	//*  21   36:ifeq            45
				byte1 = ((byte) (flag));
	//   22   39:iload           4
	//   23   41:istore_3        
			else
	//*  24   42:goto            47
				byte1 = 4;
	//   25   45:iconst_4        
	//   26   46:istore_3        
			view2.setVisibility(((int) (byte1)));
	//   27   47:aload_2         
	//   28   48:iload_3         
	//   29   49:invokevirtual   #259 <Method void View.setVisibility(int)>
		}
	//   30   52:return          
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
		int i = mButtonPanelSideLayout;
	//    0    0:aload_0         
	//    1    1:getfield        #161 <Field int mButtonPanelSideLayout>
	//    2    4:istore_1        
		if(i == 0)
	//*   3    5:iload_1         
	//*   4    6:ifne            14
			return mAlertDialogLayout;
	//    5    9:aload_0         
	//    6   10:getfield        #156 <Field int mAlertDialogLayout>
	//    7   13:ireturn         
		if(mButtonPanelLayoutHint == 1)
	//*   8   14:aload_0         
	//*   9   15:getfield        #112 <Field int mButtonPanelLayoutHint>
	//*  10   18:iconst_1        
	//*  11   19:icmpne          24
			return i;
	//   12   22:iload_1         
	//   13   23:ireturn         
		else
			return mAlertDialogLayout;
	//   14   24:aload_0         
	//   15   25:getfield        #156 <Field int mAlertDialogLayout>
	//   16   28:ireturn         
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
	//*  23   52:ifnull          235
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
	//*  60  120:ifnull          235
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
				ListView listview = mListView;
	//   84  168:aload_0         
	//   85  169:getfield        #324 <Field ListView mListView>
	//   86  172:astore          6
				if(listview != null)
	//*  87  174:aload           6
	//*  88  176:ifnull          215
				{
					listview.setOnScrollListener(new android.widget.AbsListView.OnScrollListener() {

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
	//   89  179:aload           6
	//   90  181:new             #12  <Class AlertController$4>
	//   91  184:dup             
	//   92  185:aload_0         
	//   93  186:aload_2         
	//   94  187:aload           5
	//   95  189:invokespecial   #325 <Method void AlertController$4(AlertController, View, View)>
	//   96  192:invokevirtual   #331 <Method void ListView.setOnScrollListener(android.widget.AbsListView$OnScrollListener)>
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
	//   97  195:aload_0         
	//   98  196:getfield        #324 <Field ListView mListView>
	//   99  199:new             #14  <Class AlertController$5>
	//  100  202:dup             
	//  101  203:aload_0         
	//  102  204:aload_2         
	//  103  205:aload           5
	//  104  207:invokespecial   #332 <Method void AlertController$5(AlertController, View, View)>
	//  105  210:invokevirtual   #333 <Method boolean ListView.post(Runnable)>
	//  106  213:pop             
					return;
	//  107  214:return          
				}
				if(top != null)
	//* 108  215:aload_2         
	//* 109  216:ifnull          224
					viewgroup.removeView(top);
	//  110  219:aload_1         
	//  111  220:aload_2         
	//  112  221:invokevirtual   #276 <Method void ViewGroup.removeView(View)>
				if(bottom != null)
	//* 113  224:aload           5
	//* 114  226:ifnull          235
					viewgroup.removeView(bottom);
	//  115  229:aload_1         
	//  116  230:aload           5
	//  117  232:invokevirtual   #276 <Method void ViewGroup.removeView(View)>
			}
		}
	//  118  235:return          
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
	//   14   32:istore          5
		boolean flag1 = true;
	//   15   34:iconst_1        
	//   16   35:istore_3        
		int i;
		if(flag2 && mButtonPositiveIcon == null)
	//*  17   36:iload           5
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
	//*  28   59:goto            122
		{
			mButtonPositive.setText(mButtonPositiveText);
	//   29   62:aload_0         
	//   30   63:getfield        #339 <Field Button mButtonPositive>
	//   31   66:aload_0         
	//   32   67:getfield        #345 <Field CharSequence mButtonPositiveText>
	//   33   70:invokevirtual   #358 <Method void Button.setText(CharSequence)>
			Drawable drawable = mButtonPositiveIcon;
	//   34   73:aload_0         
	//   35   74:getfield        #353 <Field Drawable mButtonPositiveIcon>
	//   36   77:astore          6
			if(drawable != null)
	//*  37   79:aload           6
	//*  38   81:ifnull          112
			{
				i = mButtonIconDimen;
	//   39   84:aload_0         
	//   40   85:getfield        #198 <Field int mButtonIconDimen>
	//   41   88:istore_2        
				drawable.setBounds(0, 0, i, i);
	//   42   89:aload           6
	//   43   91:iconst_0        
	//   44   92:iconst_0        
	//   45   93:iload_2         
	//   46   94:iload_2         
	//   47   95:invokevirtual   #364 <Method void Drawable.setBounds(int, int, int, int)>
				mButtonPositive.setCompoundDrawables(mButtonPositiveIcon, ((Drawable) (null)), ((Drawable) (null)), ((Drawable) (null)));
	//   48   98:aload_0         
	//   49   99:getfield        #339 <Field Button mButtonPositive>
	//   50  102:aload_0         
	//   51  103:getfield        #353 <Field Drawable mButtonPositiveIcon>
	//   52  106:aconst_null     
	//   53  107:aconst_null     
	//   54  108:aconst_null     
	//   55  109:invokevirtual   #368 <Method void Button.setCompoundDrawables(Drawable, Drawable, Drawable, Drawable)>
			}
			mButtonPositive.setVisibility(0);
	//   56  112:aload_0         
	//   57  113:getfield        #339 <Field Button mButtonPositive>
	//   58  116:iconst_0        
	//   59  117:invokevirtual   #354 <Method void Button.setVisibility(int)>
			i = 1;
	//   60  120:iconst_1        
	//   61  121:istore_2        
		}
		mButtonNegative = (Button)viewgroup.findViewById(0x102001a);
	//   62  122:aload_0         
	//   63  123:aload_1         
	//   64  124:ldc2            #369 <Int 0x102001a>
	//   65  127:invokevirtual   #337 <Method View ViewGroup.findViewById(int)>
	//   66  130:checkcast       #232 <Class Button>
	//   67  133:putfield        #371 <Field Button mButtonNegative>
		mButtonNegative.setOnClickListener(mButtonHandler);
	//   68  136:aload_0         
	//   69  137:getfield        #371 <Field Button mButtonNegative>
	//   70  140:aload_0         
	//   71  141:getfield        #117 <Field android.view.View$OnClickListener mButtonHandler>
	//   72  144:invokevirtual   #343 <Method void Button.setOnClickListener(android.view.View$OnClickListener)>
		if(TextUtils.isEmpty(mButtonNegativeText) && mButtonNegativeIcon == null)
	//*  73  147:aload_0         
	//*  74  148:getfield        #373 <Field CharSequence mButtonNegativeText>
	//*  75  151:invokestatic    #351 <Method boolean TextUtils.isEmpty(CharSequence)>
	//*  76  154:ifeq            176
	//*  77  157:aload_0         
	//*  78  158:getfield        #375 <Field Drawable mButtonNegativeIcon>
	//*  79  161:ifnonnull       176
		{
			mButtonNegative.setVisibility(8);
	//   80  164:aload_0         
	//   81  165:getfield        #371 <Field Button mButtonNegative>
	//   82  168:bipush          8
	//   83  170:invokevirtual   #354 <Method void Button.setVisibility(int)>
		} else
	//*  84  173:goto            241
		{
			mButtonNegative.setText(mButtonNegativeText);
	//   85  176:aload_0         
	//   86  177:getfield        #371 <Field Button mButtonNegative>
	//   87  180:aload_0         
	//   88  181:getfield        #373 <Field CharSequence mButtonNegativeText>
	//   89  184:invokevirtual   #358 <Method void Button.setText(CharSequence)>
			Drawable drawable1 = mButtonNegativeIcon;
	//   90  187:aload_0         
	//   91  188:getfield        #375 <Field Drawable mButtonNegativeIcon>
	//   92  191:astore          6
			if(drawable1 != null)
	//*  93  193:aload           6
	//*  94  195:ifnull          229
			{
				int j = mButtonIconDimen;
	//   95  198:aload_0         
	//   96  199:getfield        #198 <Field int mButtonIconDimen>
	//   97  202:istore          4
				drawable1.setBounds(0, 0, j, j);
	//   98  204:aload           6
	//   99  206:iconst_0        
	//  100  207:iconst_0        
	//  101  208:iload           4
	//  102  210:iload           4
	//  103  212:invokevirtual   #364 <Method void Drawable.setBounds(int, int, int, int)>
				mButtonNegative.setCompoundDrawables(mButtonNegativeIcon, ((Drawable) (null)), ((Drawable) (null)), ((Drawable) (null)));
	//  104  215:aload_0         
	//  105  216:getfield        #371 <Field Button mButtonNegative>
	//  106  219:aload_0         
	//  107  220:getfield        #375 <Field Drawable mButtonNegativeIcon>
	//  108  223:aconst_null     
	//  109  224:aconst_null     
	//  110  225:aconst_null     
	//  111  226:invokevirtual   #368 <Method void Button.setCompoundDrawables(Drawable, Drawable, Drawable, Drawable)>
			}
			mButtonNegative.setVisibility(0);
	//  112  229:aload_0         
	//  113  230:getfield        #371 <Field Button mButtonNegative>
	//  114  233:iconst_0        
	//  115  234:invokevirtual   #354 <Method void Button.setVisibility(int)>
			i |= 2;
	//  116  237:iload_2         
	//  117  238:iconst_2        
	//  118  239:ior             
	//  119  240:istore_2        
		}
		mButtonNeutral = (Button)viewgroup.findViewById(0x102001b);
	//  120  241:aload_0         
	//  121  242:aload_1         
	//  122  243:ldc2            #376 <Int 0x102001b>
	//  123  246:invokevirtual   #337 <Method View ViewGroup.findViewById(int)>
	//  124  249:checkcast       #232 <Class Button>
	//  125  252:putfield        #378 <Field Button mButtonNeutral>
		mButtonNeutral.setOnClickListener(mButtonHandler);
	//  126  255:aload_0         
	//  127  256:getfield        #378 <Field Button mButtonNeutral>
	//  128  259:aload_0         
	//  129  260:getfield        #117 <Field android.view.View$OnClickListener mButtonHandler>
	//  130  263:invokevirtual   #343 <Method void Button.setOnClickListener(android.view.View$OnClickListener)>
		if(TextUtils.isEmpty(mButtonNeutralText) && mButtonNeutralIcon == null)
	//* 131  266:aload_0         
	//* 132  267:getfield        #380 <Field CharSequence mButtonNeutralText>
	//* 133  270:invokestatic    #351 <Method boolean TextUtils.isEmpty(CharSequence)>
	//* 134  273:ifeq            295
	//* 135  276:aload_0         
	//* 136  277:getfield        #382 <Field Drawable mButtonNeutralIcon>
	//* 137  280:ifnonnull       295
		{
			mButtonNeutral.setVisibility(8);
	//  138  283:aload_0         
	//  139  284:getfield        #378 <Field Button mButtonNeutral>
	//  140  287:bipush          8
	//  141  289:invokevirtual   #354 <Method void Button.setVisibility(int)>
		} else
	//* 142  292:goto            360
		{
			mButtonNeutral.setText(mButtonNeutralText);
	//  143  295:aload_0         
	//  144  296:getfield        #378 <Field Button mButtonNeutral>
	//  145  299:aload_0         
	//  146  300:getfield        #380 <Field CharSequence mButtonNeutralText>
	//  147  303:invokevirtual   #358 <Method void Button.setText(CharSequence)>
			Drawable drawable2 = mButtonPositiveIcon;
	//  148  306:aload_0         
	//  149  307:getfield        #353 <Field Drawable mButtonPositiveIcon>
	//  150  310:astore          6
			if(drawable2 != null)
	//* 151  312:aload           6
	//* 152  314:ifnull          348
			{
				int k = mButtonIconDimen;
	//  153  317:aload_0         
	//  154  318:getfield        #198 <Field int mButtonIconDimen>
	//  155  321:istore          4
				drawable2.setBounds(0, 0, k, k);
	//  156  323:aload           6
	//  157  325:iconst_0        
	//  158  326:iconst_0        
	//  159  327:iload           4
	//  160  329:iload           4
	//  161  331:invokevirtual   #364 <Method void Drawable.setBounds(int, int, int, int)>
				mButtonPositive.setCompoundDrawables(mButtonPositiveIcon, ((Drawable) (null)), ((Drawable) (null)), ((Drawable) (null)));
	//  162  334:aload_0         
	//  163  335:getfield        #339 <Field Button mButtonPositive>
	//  164  338:aload_0         
	//  165  339:getfield        #353 <Field Drawable mButtonPositiveIcon>
	//  166  342:aconst_null     
	//  167  343:aconst_null     
	//  168  344:aconst_null     
	//  169  345:invokevirtual   #368 <Method void Button.setCompoundDrawables(Drawable, Drawable, Drawable, Drawable)>
			}
			mButtonNeutral.setVisibility(0);
	//  170  348:aload_0         
	//  171  349:getfield        #378 <Field Button mButtonNeutral>
	//  172  352:iconst_0        
	//  173  353:invokevirtual   #354 <Method void Button.setVisibility(int)>
			i |= 4;
	//  174  356:iload_2         
	//  175  357:iconst_4        
	//  176  358:ior             
	//  177  359:istore_2        
		}
		if(shouldCenterSingleButton(mContext))
	//* 178  360:aload_0         
	//* 179  361:getfield        #119 <Field Context mContext>
	//* 180  364:invokestatic    #386 <Method boolean shouldCenterSingleButton(Context)>
	//* 181  367:ifeq            415
			if(i == 1)
	//* 182  370:iload_2         
	//* 183  371:iconst_1        
	//* 184  372:icmpne          386
				centerButton(mButtonPositive);
	//  185  375:aload_0         
	//  186  376:aload_0         
	//  187  377:getfield        #339 <Field Button mButtonPositive>
	//  188  380:invokespecial   #388 <Method void centerButton(Button)>
			else
	//* 189  383:goto            415
			if(i == 2)
	//* 190  386:iload_2         
	//* 191  387:iconst_2        
	//* 192  388:icmpne          402
				centerButton(mButtonNegative);
	//  193  391:aload_0         
	//  194  392:aload_0         
	//  195  393:getfield        #371 <Field Button mButtonNegative>
	//  196  396:invokespecial   #388 <Method void centerButton(Button)>
			else
	//* 197  399:goto            415
			if(i == 4)
	//* 198  402:iload_2         
	//* 199  403:iconst_4        
	//* 200  404:icmpne          415
				centerButton(mButtonNeutral);
	//  201  407:aload_0         
	//  202  408:aload_0         
	//  203  409:getfield        #378 <Field Button mButtonNeutral>
	//  204  412:invokespecial   #388 <Method void centerButton(Button)>
		boolean flag;
		if(i != 0)
	//* 205  415:iload_2         
	//* 206  416:ifeq            424
			flag = flag1;
	//  207  419:iload_3         
	//  208  420:istore_2        
		else
	//* 209  421:goto            426
			flag = false;
	//  210  424:iconst_0        
	//  211  425:istore_2        
		if(!flag)
	//* 212  426:iload_2         
	//* 213  427:ifne            436
			viewgroup.setVisibility(8);
	//  214  430:aload_1         
	//  215  431:bipush          8
	//  216  433:invokevirtual   #389 <Method void ViewGroup.setVisibility(int)>
	//  217  436:return          
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
		TextView textview = mMessageView;
	//   21   47:aload_0         
	//   22   48:getfield        #405 <Field TextView mMessageView>
	//   23   51:astore_3        
		if(textview == null)
	//*  24   52:aload_3         
	//*  25   53:ifnonnull       57
			return;
	//   26   56:return          
		CharSequence charsequence = mMessage;
	//   27   57:aload_0         
	//   28   58:getfield        #306 <Field CharSequence mMessage>
	//   29   61:astore          4
		if(charsequence != null)
	//*  30   63:aload           4
	//*  31   65:ifnull          75
		{
			textview.setText(charsequence);
	//   32   68:aload_3         
	//   33   69:aload           4
	//   34   71:invokevirtual   #406 <Method void TextView.setText(CharSequence)>
			return;
	//   35   74:return          
		}
		textview.setVisibility(8);
	//   36   75:aload_3         
	//   37   76:bipush          8
	//   38   78:invokevirtual   #407 <Method void TextView.setVisibility(int)>
		mScrollView.removeView(((View) (mMessageView)));
	//   39   81:aload_0         
	//   40   82:getfield        #308 <Field NestedScrollView mScrollView>
	//   41   85:aload_0         
	//   42   86:getfield        #405 <Field TextView mMessageView>
	//   43   89:invokevirtual   #408 <Method void NestedScrollView.removeView(View)>
		if(mListView != null)
	//*  44   92:aload_0         
	//*  45   93:getfield        #324 <Field ListView mListView>
	//*  46   96:ifnull          143
		{
			viewgroup = (ViewGroup)mScrollView.getParent();
	//   47   99:aload_0         
	//   48  100:getfield        #308 <Field NestedScrollView mScrollView>
	//   49  103:invokevirtual   #409 <Method android.view.ViewParent NestedScrollView.getParent()>
	//   50  106:checkcast       #218 <Class ViewGroup>
	//   51  109:astore_1        
			int i = viewgroup.indexOfChild(((View) (mScrollView)));
	//   52  110:aload_1         
	//   53  111:aload_0         
	//   54  112:getfield        #308 <Field NestedScrollView mScrollView>
	//   55  115:invokevirtual   #413 <Method int ViewGroup.indexOfChild(View)>
	//   56  118:istore_2        
			viewgroup.removeViewAt(i);
	//   57  119:aload_1         
	//   58  120:iload_2         
	//   59  121:invokevirtual   #416 <Method void ViewGroup.removeViewAt(int)>
			viewgroup.addView(((View) (mListView)), i, new android.view.ViewGroup.LayoutParams(-1, -1));
	//   60  124:aload_1         
	//   61  125:aload_0         
	//   62  126:getfield        #324 <Field ListView mListView>
	//   63  129:iload_2         
	//   64  130:new             #418 <Class android.view.ViewGroup$LayoutParams>
	//   65  133:dup             
	//   66  134:iconst_m1       
	//   67  135:iconst_m1       
	//   68  136:invokespecial   #421 <Method void android.view.ViewGroup$LayoutParams(int, int)>
	//   69  139:invokevirtual   #425 <Method void ViewGroup.addView(View, int, android.view.ViewGroup$LayoutParams)>
			return;
	//   70  142:return          
		} else
		{
			viewgroup.setVisibility(8);
	//   71  143:aload_1         
	//   72  144:bipush          8
	//   73  146:invokevirtual   #389 <Method void ViewGroup.setVisibility(int)>
			return;
	//   74  149:return          
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
		if(view == null)
	//*   5    7:aload_3         
	//*   6    8:ifnull          14
	//*   7   11:goto            43
			if(mViewLayoutResId != 0)
	//*   8   14:aload_0         
	//*   9   15:getfield        #430 <Field int mViewLayoutResId>
	//*  10   18:ifeq            41
				view = LayoutInflater.from(mContext).inflate(mViewLayoutResId, viewgroup, false);
	//   11   21:aload_0         
	//   12   22:getfield        #119 <Field Context mContext>
	//   13   25:invokestatic    #436 <Method LayoutInflater LayoutInflater.from(Context)>
	//   14   28:aload_0         
	//   15   29:getfield        #430 <Field int mViewLayoutResId>
	//   16   32:aload_1         
	//   17   33:iconst_0        
	//   18   34:invokevirtual   #439 <Method View LayoutInflater.inflate(int, ViewGroup, boolean)>
	//   19   37:astore_3        
			else
	//*  20   38:goto            43
				view = null;
	//   21   41:aconst_null     
	//   22   42:astore_3        
		if(view != null)
	//*  23   43:aload_3         
	//*  24   44:ifnull          49
			flag = true;
	//   25   47:iconst_1        
	//   26   48:istore_2        
		if(!flag || !canTextInput(view))
	//*  27   49:iload_2         
	//*  28   50:ifeq            60
	//*  29   53:aload_3         
	//*  30   54:invokestatic    #228 <Method boolean canTextInput(View)>
	//*  31   57:ifne            73
			mWindow.setFlags(0x20000, 0x20000);
	//   32   60:aload_0         
	//   33   61:getfield        #123 <Field Window mWindow>
	//   34   64:ldc2            #440 <Int 0x20000>
	//   35   67:ldc2            #440 <Int 0x20000>
	//   36   70:invokevirtual   #443 <Method void Window.setFlags(int, int)>
		if(flag)
	//*  37   73:iload_2         
	//*  38   74:ifeq            154
		{
			FrameLayout framelayout = (FrameLayout)mWindow.findViewById(android.support.v7.appcompat.R.id.custom);
	//   39   77:aload_0         
	//   40   78:getfield        #123 <Field Window mWindow>
	//   41   81:getstatic       #446 <Field int android.support.v7.appcompat.R$id.custom>
	//   42   84:invokevirtual   #291 <Method View Window.findViewById(int)>
	//   43   87:checkcast       #448 <Class FrameLayout>
	//   44   90:astore          4
			framelayout.addView(view, new android.view.ViewGroup.LayoutParams(-1, -1));
	//   45   92:aload           4
	//   46   94:aload_3         
	//   47   95:new             #418 <Class android.view.ViewGroup$LayoutParams>
	//   48   98:dup             
	//   49   99:iconst_m1       
	//   50  100:iconst_m1       
	//   51  101:invokespecial   #421 <Method void android.view.ViewGroup$LayoutParams(int, int)>
	//   52  104:invokevirtual   #451 <Method void FrameLayout.addView(View, android.view.ViewGroup$LayoutParams)>
			if(mViewSpacingSpecified)
	//*  53  107:aload_0         
	//*  54  108:getfield        #106 <Field boolean mViewSpacingSpecified>
	//*  55  111:ifeq            135
				framelayout.setPadding(mViewSpacingLeft, mViewSpacingTop, mViewSpacingRight, mViewSpacingBottom);
	//   56  114:aload           4
	//   57  116:aload_0         
	//   58  117:getfield        #453 <Field int mViewSpacingLeft>
	//   59  120:aload_0         
	//   60  121:getfield        #455 <Field int mViewSpacingTop>
	//   61  124:aload_0         
	//   62  125:getfield        #457 <Field int mViewSpacingRight>
	//   63  128:aload_0         
	//   64  129:getfield        #459 <Field int mViewSpacingBottom>
	//   65  132:invokevirtual   #462 <Method void FrameLayout.setPadding(int, int, int, int)>
			if(mListView != null)
	//*  66  135:aload_0         
	//*  67  136:getfield        #324 <Field ListView mListView>
	//*  68  139:ifnull          160
			{
				((android.support.v7.widget.LinearLayoutCompat.LayoutParams)viewgroup.getLayoutParams()).weight = 0.0F;
	//   69  142:aload_1         
	//   70  143:invokevirtual   #463 <Method android.view.ViewGroup$LayoutParams ViewGroup.getLayoutParams()>
	//   71  146:checkcast       #465 <Class android.support.v7.widget.LinearLayoutCompat$LayoutParams>
	//   72  149:fconst_0        
	//   73  150:putfield        #466 <Field float android.support.v7.widget.LinearLayoutCompat$LayoutParams.weight>
				return;
	//   74  153:return          
			}
		} else
		{
			viewgroup.setVisibility(8);
	//   75  154:aload_1         
	//   76  155:bipush          8
	//   77  157:invokevirtual   #389 <Method void ViewGroup.setVisibility(int)>
		}
	//   78  160:return          
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
	//    8   17:astore_3        
			viewgroup.addView(mCustomTitleView, 0, layoutparams);
	//    9   18:aload_1         
	//   10   19:aload_0         
	//   11   20:getfield        #469 <Field View mCustomTitleView>
	//   12   23:iconst_0        
	//   13   24:aload_3         
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
	//*  34   70:ifeq            189
	//*  35   73:aload_0         
	//*  36   74:getfield        #190 <Field boolean mShowTitle>
	//*  37   77:ifeq            189
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
			int i = mIconId;
	//   50  108:aload_0         
	//   51  109:getfield        #108 <Field int mIconId>
	//   52  112:istore_2        
			if(i != 0)
	//*  53  113:iload_2         
	//*  54  114:ifeq            126
			{
				mIconView.setImageResource(i);
	//   55  117:aload_0         
	//   56  118:getfield        #477 <Field ImageView mIconView>
	//   57  121:iload_2         
	//   58  122:invokevirtual   #487 <Method void ImageView.setImageResource(int)>
				return;
	//   59  125:return          
			}
			viewgroup = ((ViewGroup) (mIcon));
	//   60  126:aload_0         
	//   61  127:getfield        #489 <Field Drawable mIcon>
	//   62  130:astore_1        
			if(viewgroup != null)
	//*  63  131:aload_1         
	//*  64  132:ifnull          144
			{
				mIconView.setImageDrawable(((Drawable) (viewgroup)));
	//   65  135:aload_0         
	//   66  136:getfield        #477 <Field ImageView mIconView>
	//   67  139:aload_1         
	//   68  140:invokevirtual   #493 <Method void ImageView.setImageDrawable(Drawable)>
				return;
	//   69  143:return          
			} else
			{
				mTitleView.setPadding(mIconView.getPaddingLeft(), mIconView.getPaddingTop(), mIconView.getPaddingRight(), mIconView.getPaddingBottom());
	//   70  144:aload_0         
	//   71  145:getfield        #484 <Field TextView mTitleView>
	//   72  148:aload_0         
	//   73  149:getfield        #477 <Field ImageView mIconView>
	//   74  152:invokevirtual   #496 <Method int ImageView.getPaddingLeft()>
	//   75  155:aload_0         
	//   76  156:getfield        #477 <Field ImageView mIconView>
	//   77  159:invokevirtual   #499 <Method int ImageView.getPaddingTop()>
	//   78  162:aload_0         
	//   79  163:getfield        #477 <Field ImageView mIconView>
	//   80  166:invokevirtual   #502 <Method int ImageView.getPaddingRight()>
	//   81  169:aload_0         
	//   82  170:getfield        #477 <Field ImageView mIconView>
	//   83  173:invokevirtual   #505 <Method int ImageView.getPaddingBottom()>
	//   84  176:invokevirtual   #506 <Method void TextView.setPadding(int, int, int, int)>
				mIconView.setVisibility(8);
	//   85  179:aload_0         
	//   86  180:getfield        #477 <Field ImageView mIconView>
	//   87  183:bipush          8
	//   88  185:invokevirtual   #507 <Method void ImageView.setVisibility(int)>
				return;
	//   89  188:return          
			}
		} else
		{
			mWindow.findViewById(android.support.v7.appcompat.R.id.title_template).setVisibility(8);
	//   90  189:aload_0         
	//   91  190:getfield        #123 <Field Window mWindow>
	//   92  193:getstatic       #472 <Field int android.support.v7.appcompat.R$id.title_template>
	//   93  196:invokevirtual   #291 <Method View Window.findViewById(int)>
	//   94  199:bipush          8
	//   95  201:invokevirtual   #259 <Method void View.setVisibility(int)>
			mIconView.setVisibility(8);
	//   96  204:aload_0         
	//   97  205:getfield        #477 <Field ImageView mIconView>
	//   98  208:bipush          8
	//   99  210:invokevirtual   #507 <Method void ImageView.setVisibility(int)>
			viewgroup.setVisibility(8);
	//  100  213:aload_1         
	//  101  214:bipush          8
	//  102  216:invokevirtual   #389 <Method void ViewGroup.setVisibility(int)>
			return;
	//  103  219:return          
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
	//* 110  241:ifeq            302
		{
			obj = ((Object) (mScrollView));
	//  111  244:aload_0         
	//  112  245:getfield        #308 <Field NestedScrollView mScrollView>
	//  113  248:astore          5
			if(obj != null)
	//* 114  250:aload           5
	//* 115  252:ifnull          261
				((NestedScrollView) (obj)).setClipToPadding(true);
	//  116  255:aload           5
	//  117  257:iconst_1        
	//  118  258:invokevirtual   #543 <Method void NestedScrollView.setClipToPadding(boolean)>
			obj = null;
	//  119  261:aconst_null     
	//  120  262:astore          5
			if(mMessage != null || mListView != null)
	//* 121  264:aload_0         
	//* 122  265:getfield        #306 <Field CharSequence mMessage>
	//* 123  268:ifnonnull       278
	//* 124  271:aload_0         
	//* 125  272:getfield        #324 <Field ListView mListView>
	//* 126  275:ifnull          288
				obj = ((Object) (((ViewGroup) (obj2)).findViewById(android.support.v7.appcompat.R.id.titleDividerNoCustom)));
	//  127  278:aload           7
	//  128  280:getstatic       #546 <Field int android.support.v7.appcompat.R$id.titleDividerNoCustom>
	//  129  283:invokevirtual   #337 <Method View ViewGroup.findViewById(int)>
	//  130  286:astore          5
			if(obj != null)
	//* 131  288:aload           5
	//* 132  290:ifnull          328
				((View) (obj)).setVisibility(0);
	//  133  293:aload           5
	//  134  295:iconst_0        
	//  135  296:invokevirtual   #259 <Method void View.setVisibility(int)>
		} else
	//* 136  299:goto            328
		if(obj1 != null)
	//* 137  302:aload           6
	//* 138  304:ifnull          328
		{
			obj = ((Object) (((ViewGroup) (obj1)).findViewById(android.support.v7.appcompat.R.id.textSpacerNoTitle)));
	//  139  307:aload           6
	//  140  309:getstatic       #549 <Field int android.support.v7.appcompat.R$id.textSpacerNoTitle>
	//  141  312:invokevirtual   #337 <Method View ViewGroup.findViewById(int)>
	//  142  315:astore          5
			if(obj != null)
	//* 143  317:aload           5
	//* 144  319:ifnull          328
				((View) (obj)).setVisibility(0);
	//  145  322:aload           5
	//  146  324:iconst_0        
	//  147  325:invokevirtual   #259 <Method void View.setVisibility(int)>
		}
		obj = ((Object) (mListView));
	//  148  328:aload_0         
	//  149  329:getfield        #324 <Field ListView mListView>
	//  150  332:astore          5
		if(obj instanceof RecycleListView)
	//* 151  334:aload           5
	//* 152  336:instanceof      #36  <Class AlertController$RecycleListView>
	//* 153  339:ifeq            353
			((RecycleListView)obj).setHasDecor(flag2, flag3);
	//  154  342:aload           5
	//  155  344:checkcast       #36  <Class AlertController$RecycleListView>
	//  156  347:iload_3         
	//  157  348:iload           4
	//  158  350:invokevirtual   #553 <Method void AlertController$RecycleListView.setHasDecor(boolean, boolean)>
		if(!flag)
	//* 159  353:iload_1         
	//* 160  354:ifne            403
		{
			obj = ((Object) (mListView));
	//  161  357:aload_0         
	//  162  358:getfield        #324 <Field ListView mListView>
	//  163  361:astore          5
			if(obj == null)
	//* 164  363:aload           5
	//* 165  365:ifnull          371
	//* 166  368:goto            377
				obj = ((Object) (mScrollView));
	//  167  371:aload_0         
	//  168  372:getfield        #308 <Field NestedScrollView mScrollView>
	//  169  375:astore          5
			if(obj != null)
	//* 170  377:aload           5
	//* 171  379:ifnull          403
			{
				byte byte0 = ((byte) (flag1));
	//  172  382:iload_2         
	//  173  383:istore_1        
				if(flag3)
	//* 174  384:iload           4
	//* 175  386:ifeq            391
					byte0 = 2;
	//  176  389:iconst_2        
	//  177  390:istore_1        
				setScrollIndicators(((ViewGroup) (obj1)), ((View) (obj)), flag2 | byte0, 3);
	//  178  391:aload_0         
	//  179  392:aload           6
	//  180  394:aload           5
	//  181  396:iload_3         
	//  182  397:iload_1         
	//  183  398:ior             
	//  184  399:iconst_3        
	//  185  400:invokespecial   #555 <Method void setScrollIndicators(ViewGroup, View, int, int)>
			}
		}
		obj = ((Object) (mListView));
	//  186  403:aload_0         
	//  187  404:getfield        #324 <Field ListView mListView>
	//  188  407:astore          5
		if(obj != null)
	//* 189  409:aload           5
	//* 190  411:ifnull          455
		{
			ListAdapter listadapter = mAdapter;
	//  191  414:aload_0         
	//  192  415:getfield        #557 <Field ListAdapter mAdapter>
	//  193  418:astore          6
			if(listadapter != null)
	//* 194  420:aload           6
	//* 195  422:ifnull          455
			{
				((ListView) (obj)).setAdapter(listadapter);
	//  196  425:aload           5
	//  197  427:aload           6
	//  198  429:invokevirtual   #561 <Method void ListView.setAdapter(ListAdapter)>
				int i = mCheckedItem;
	//  199  432:aload_0         
	//  200  433:getfield        #110 <Field int mCheckedItem>
	//  201  436:istore_1        
				if(i > -1)
	//* 202  437:iload_1         
	//* 203  438:iconst_m1       
	//* 204  439:icmple          455
				{
					((ListView) (obj)).setItemChecked(i, true);
	//  205  442:aload           5
	//  206  444:iload_1         
	//  207  445:iconst_1        
	//  208  446:invokevirtual   #565 <Method void ListView.setItemChecked(int, boolean)>
					((ListView) (obj)).setSelection(i);
	//  209  449:aload           5
	//  210  451:iload_1         
	//  211  452:invokevirtual   #568 <Method void ListView.setSelection(int)>
				}
			}
		}
	//  212  455:return          
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
		NestedScrollView nestedscrollview = mScrollView;
	//    0    0:aload_0         
	//    1    1:getfield        #308 <Field NestedScrollView mScrollView>
	//    2    4:astore_3        
		return nestedscrollview != null && nestedscrollview.executeKeyEvent(keyevent);
	//    3    5:aload_3         
	//    4    6:ifnull          19
	//    5    9:aload_3         
	//    6   10:aload_2         
	//    7   11:invokevirtual   #610 <Method boolean NestedScrollView.executeKeyEvent(KeyEvent)>
	//    8   14:ifeq            19
	//    9   17:iconst_1        
	//   10   18:ireturn         
	//   11   19:iconst_0        
	//   12   20:ireturn         
	}

	public boolean onKeyUp(int i, KeyEvent keyevent)
	{
		NestedScrollView nestedscrollview = mScrollView;
	//    0    0:aload_0         
	//    1    1:getfield        #308 <Field NestedScrollView mScrollView>
	//    2    4:astore_3        
		return nestedscrollview != null && nestedscrollview.executeKeyEvent(keyevent);
	//    3    5:aload_3         
	//    4    6:ifnull          19
	//    5    9:aload_3         
	//    6   10:aload_2         
	//    7   11:invokevirtual   #610 <Method boolean NestedScrollView.executeKeyEvent(KeyEvent)>
	//    8   14:ifeq            19
	//    9   17:iconst_1        
	//   10   18:ireturn         
	//   11   19:iconst_0        
	//   12   20:ireturn         
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
		ImageView imageview = mIconView;
	//    6   10:aload_0         
	//    7   11:getfield        #477 <Field ImageView mIconView>
	//    8   14:astore_2        
		if(imageview != null)
	//*   9   15:aload_2         
	//*  10   16:ifnull          46
		{
			if(i != 0)
	//*  11   19:iload_1         
	//*  12   20:ifeq            40
			{
				imageview.setVisibility(0);
	//   13   23:aload_2         
	//   14   24:iconst_0        
	//   15   25:invokevirtual   #507 <Method void ImageView.setVisibility(int)>
				mIconView.setImageResource(mIconId);
	//   16   28:aload_0         
	//   17   29:getfield        #477 <Field ImageView mIconView>
	//   18   32:aload_0         
	//   19   33:getfield        #108 <Field int mIconId>
	//   20   36:invokevirtual   #487 <Method void ImageView.setImageResource(int)>
				return;
	//   21   39:return          
			}
			imageview.setVisibility(8);
	//   22   40:aload_2         
	//   23   41:bipush          8
	//   24   43:invokevirtual   #507 <Method void ImageView.setVisibility(int)>
		}
	//   25   46:return          
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
		ImageView imageview = mIconView;
	//    6   10:aload_0         
	//    7   11:getfield        #477 <Field ImageView mIconView>
	//    8   14:astore_2        
		if(imageview != null)
	//*   9   15:aload_2         
	//*  10   16:ifnull          43
		{
			if(drawable != null)
	//*  11   19:aload_1         
	//*  12   20:ifnull          37
			{
				imageview.setVisibility(0);
	//   13   23:aload_2         
	//   14   24:iconst_0        
	//   15   25:invokevirtual   #507 <Method void ImageView.setVisibility(int)>
				mIconView.setImageDrawable(drawable);
	//   16   28:aload_0         
	//   17   29:getfield        #477 <Field ImageView mIconView>
	//   18   32:aload_1         
	//   19   33:invokevirtual   #493 <Method void ImageView.setImageDrawable(Drawable)>
				return;
	//   20   36:return          
			}
			imageview.setVisibility(8);
	//   21   37:aload_2         
	//   22   38:bipush          8
	//   23   40:invokevirtual   #507 <Method void ImageView.setVisibility(int)>
		}
	//   24   43:return          
	}

	public void setMessage(CharSequence charsequence)
	{
		mMessage = charsequence;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #306 <Field CharSequence mMessage>
		TextView textview = mMessageView;
	//    3    5:aload_0         
	//    4    6:getfield        #405 <Field TextView mMessageView>
	//    5    9:astore_2        
		if(textview != null)
	//*   6   10:aload_2         
	//*   7   11:ifnull          19
			textview.setText(charsequence);
	//    8   14:aload_2         
	//    9   15:aload_1         
	//   10   16:invokevirtual   #406 <Method void TextView.setText(CharSequence)>
	//   11   19:return          
	}

	public void setTitle(CharSequence charsequence)
	{
		mTitle = charsequence;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #479 <Field CharSequence mTitle>
		TextView textview = mTitleView;
	//    3    5:aload_0         
	//    4    6:getfield        #484 <Field TextView mTitleView>
	//    5    9:astore_2        
		if(textview != null)
	//*   6   10:aload_2         
	//*   7   11:ifnull          19
			textview.setText(charsequence);
	//    8   14:aload_2         
	//    9   15:aload_1         
	//   10   16:invokevirtual   #406 <Method void TextView.setText(CharSequence)>
	//   11   19:return          
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
