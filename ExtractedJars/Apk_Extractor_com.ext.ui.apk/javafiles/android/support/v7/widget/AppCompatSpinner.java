// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v7.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.database.DataSetObserver;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.support.v4.view.TintableBackgroundView;
import android.support.v4.view.ViewCompat;
import android.support.v7.content.res.AppCompatResources;
import android.support.v7.view.ContextThemeWrapper;
import android.support.v7.view.menu.ShowableListMenu;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import android.widget.ThemedSpinnerAdapter;

// Referenced classes of package android.support.v7.widget:
//			TintTypedArray, AppCompatBackgroundHelper, ForwardingListener, ThemedSpinnerAdapter, 
//			ListPopupWindow, ViewUtils

public class AppCompatSpinner extends Spinner
	implements TintableBackgroundView
{
	private static class DropDownAdapter
		implements ListAdapter, SpinnerAdapter
	{

		public boolean areAllItemsEnabled()
		{
			ListAdapter listadapter = mListAdapter;
		//    0    0:aload_0         
		//    1    1:getfield        #25  <Field ListAdapter mListAdapter>
		//    2    4:astore_1        
			if(listadapter != null)
		//*   3    5:aload_1         
		//*   4    6:ifnull          16
				return listadapter.areAllItemsEnabled();
		//    5    9:aload_1         
		//    6   10:invokeinterface #51  <Method boolean ListAdapter.areAllItemsEnabled()>
		//    7   15:ireturn         
			else
				return true;
		//    8   16:iconst_1        
		//    9   17:ireturn         
		}

		public int getCount()
		{
			if(mAdapter == null)
		//*   0    0:aload_0         
		//*   1    1:getfield        #23  <Field SpinnerAdapter mAdapter>
		//*   2    4:ifnonnull       9
				return 0;
		//    3    7:iconst_0        
		//    4    8:ireturn         
			else
				return mAdapter.getCount();
		//    5    9:aload_0         
		//    6   10:getfield        #23  <Field SpinnerAdapter mAdapter>
		//    7   13:invokeinterface #55  <Method int SpinnerAdapter.getCount()>
		//    8   18:ireturn         
		}

		public View getDropDownView(int i, View view, ViewGroup viewgroup)
		{
			if(mAdapter == null)
		//*   0    0:aload_0         
		//*   1    1:getfield        #23  <Field SpinnerAdapter mAdapter>
		//*   2    4:ifnonnull       9
				return null;
		//    3    7:aconst_null     
		//    4    8:areturn         
			else
				return mAdapter.getDropDownView(i, view, viewgroup);
		//    5    9:aload_0         
		//    6   10:getfield        #23  <Field SpinnerAdapter mAdapter>
		//    7   13:iload_1         
		//    8   14:aload_2         
		//    9   15:aload_3         
		//   10   16:invokeinterface #59  <Method View SpinnerAdapter.getDropDownView(int, View, ViewGroup)>
		//   11   21:areturn         
		}

		public Object getItem(int i)
		{
			if(mAdapter == null)
		//*   0    0:aload_0         
		//*   1    1:getfield        #23  <Field SpinnerAdapter mAdapter>
		//*   2    4:ifnonnull       9
				return ((Object) (null));
		//    3    7:aconst_null     
		//    4    8:areturn         
			else
				return mAdapter.getItem(i);
		//    5    9:aload_0         
		//    6   10:getfield        #23  <Field SpinnerAdapter mAdapter>
		//    7   13:iload_1         
		//    8   14:invokeinterface #63  <Method Object SpinnerAdapter.getItem(int)>
		//    9   19:areturn         
		}

		public long getItemId(int i)
		{
			if(mAdapter == null)
		//*   0    0:aload_0         
		//*   1    1:getfield        #23  <Field SpinnerAdapter mAdapter>
		//*   2    4:ifnonnull       11
				return -1L;
		//    3    7:ldc2w           #66  <Long -1L>
		//    4   10:lreturn         
			else
				return mAdapter.getItemId(i);
		//    5   11:aload_0         
		//    6   12:getfield        #23  <Field SpinnerAdapter mAdapter>
		//    7   15:iload_1         
		//    8   16:invokeinterface #69  <Method long SpinnerAdapter.getItemId(int)>
		//    9   21:lreturn         
		}

		public int getItemViewType(int i)
		{
			return 0;
		//    0    0:iconst_0        
		//    1    1:ireturn         
		}

		public View getView(int i, View view, ViewGroup viewgroup)
		{
			return getDropDownView(i, view, viewgroup);
		//    0    0:aload_0         
		//    1    1:iload_1         
		//    2    2:aload_2         
		//    3    3:aload_3         
		//    4    4:invokevirtual   #73  <Method View getDropDownView(int, View, ViewGroup)>
		//    5    7:areturn         
		}

		public int getViewTypeCount()
		{
			return 1;
		//    0    0:iconst_1        
		//    1    1:ireturn         
		}

		public boolean hasStableIds()
		{
			return mAdapter != null && mAdapter.hasStableIds();
		//    0    0:aload_0         
		//    1    1:getfield        #23  <Field SpinnerAdapter mAdapter>
		//    2    4:ifnull          21
		//    3    7:aload_0         
		//    4    8:getfield        #23  <Field SpinnerAdapter mAdapter>
		//    5   11:invokeinterface #77  <Method boolean SpinnerAdapter.hasStableIds()>
		//    6   16:ifeq            21
		//    7   19:iconst_1        
		//    8   20:ireturn         
		//    9   21:iconst_0        
		//   10   22:ireturn         
		}

		public boolean isEmpty()
		{
			return getCount() == 0;
		//    0    0:aload_0         
		//    1    1:invokevirtual   #79  <Method int getCount()>
		//    2    4:ifne            9
		//    3    7:iconst_1        
		//    4    8:ireturn         
		//    5    9:iconst_0        
		//    6   10:ireturn         
		}

		public boolean isEnabled(int i)
		{
			ListAdapter listadapter = mListAdapter;
		//    0    0:aload_0         
		//    1    1:getfield        #25  <Field ListAdapter mListAdapter>
		//    2    4:astore_2        
			if(listadapter != null)
		//*   3    5:aload_2         
		//*   4    6:ifnull          17
				return listadapter.isEnabled(i);
		//    5    9:aload_2         
		//    6   10:iload_1         
		//    7   11:invokeinterface #83  <Method boolean ListAdapter.isEnabled(int)>
		//    8   16:ireturn         
			else
				return true;
		//    9   17:iconst_1        
		//   10   18:ireturn         
		}

		public void registerDataSetObserver(DataSetObserver datasetobserver)
		{
			if(mAdapter != null)
		//*   0    0:aload_0         
		//*   1    1:getfield        #23  <Field SpinnerAdapter mAdapter>
		//*   2    4:ifnull          17
				mAdapter.registerDataSetObserver(datasetobserver);
		//    3    7:aload_0         
		//    4    8:getfield        #23  <Field SpinnerAdapter mAdapter>
		//    5   11:aload_1         
		//    6   12:invokeinterface #87  <Method void SpinnerAdapter.registerDataSetObserver(DataSetObserver)>
		//    7   17:return          
		}

		public void unregisterDataSetObserver(DataSetObserver datasetobserver)
		{
			if(mAdapter != null)
		//*   0    0:aload_0         
		//*   1    1:getfield        #23  <Field SpinnerAdapter mAdapter>
		//*   2    4:ifnull          17
				mAdapter.unregisterDataSetObserver(datasetobserver);
		//    3    7:aload_0         
		//    4    8:getfield        #23  <Field SpinnerAdapter mAdapter>
		//    5   11:aload_1         
		//    6   12:invokeinterface #90  <Method void SpinnerAdapter.unregisterDataSetObserver(DataSetObserver)>
		//    7   17:return          
		}

		private SpinnerAdapter mAdapter;
		private ListAdapter mListAdapter;

		public DropDownAdapter(SpinnerAdapter spinneradapter, android.content.res.Resources.Theme theme)
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #21  <Method void Object()>
			mAdapter = spinneradapter;
		//    2    4:aload_0         
		//    3    5:aload_1         
		//    4    6:putfield        #23  <Field SpinnerAdapter mAdapter>
			if(spinneradapter instanceof ListAdapter)
		//*   5    9:aload_1         
		//*   6   10:instanceof      #6   <Class ListAdapter>
		//*   7   13:ifeq            24
				mListAdapter = (ListAdapter)spinneradapter;
		//    8   16:aload_0         
		//    9   17:aload_1         
		//   10   18:checkcast       #6   <Class ListAdapter>
		//   11   21:putfield        #25  <Field ListAdapter mListAdapter>
			if(theme != null)
		//*  12   24:aload_2         
		//*  13   25:ifnull          65
				if(android.os.Build.VERSION.SDK_INT >= 23 && (spinneradapter instanceof ThemedSpinnerAdapter))
		//*  14   28:getstatic       #31  <Field int android.os.Build$VERSION.SDK_INT>
		//*  15   31:bipush          23
		//*  16   33:icmplt          66
		//*  17   36:aload_1         
		//*  18   37:instanceof      #33  <Class ThemedSpinnerAdapter>
		//*  19   40:ifeq            66
				{
					spinneradapter = ((SpinnerAdapter) ((ThemedSpinnerAdapter)spinneradapter));
		//   20   43:aload_1         
		//   21   44:checkcast       #33  <Class ThemedSpinnerAdapter>
		//   22   47:astore_1        
					if(((ThemedSpinnerAdapter) (spinneradapter)).getDropDownViewTheme() != theme)
		//*  23   48:aload_1         
		//*  24   49:invokeinterface #37  <Method android.content.res.Resources$Theme ThemedSpinnerAdapter.getDropDownViewTheme()>
		//*  25   54:aload_2         
		//*  26   55:if_acmpeq       65
						((ThemedSpinnerAdapter) (spinneradapter)).setDropDownViewTheme(theme);
		//   27   58:aload_1         
		//   28   59:aload_2         
		//   29   60:invokeinterface #41  <Method void ThemedSpinnerAdapter.setDropDownViewTheme(android.content.res.Resources$Theme)>
				} else
		//*  30   65:return          
				if(spinneradapter instanceof android.support.v7.widget.ThemedSpinnerAdapter)
		//*  31   66:aload_1         
		//*  32   67:instanceof      #43  <Class android.support.v7.widget.ThemedSpinnerAdapter>
		//*  33   70:ifeq            65
				{
					spinneradapter = ((SpinnerAdapter) ((android.support.v7.widget.ThemedSpinnerAdapter)spinneradapter));
		//   34   73:aload_1         
		//   35   74:checkcast       #43  <Class android.support.v7.widget.ThemedSpinnerAdapter>
		//   36   77:astore_1        
					if(((android.support.v7.widget.ThemedSpinnerAdapter) (spinneradapter)).getDropDownViewTheme() == null)
		//*  37   78:aload_1         
		//*  38   79:invokeinterface #44  <Method android.content.res.Resources$Theme ThemedSpinnerAdapter.getDropDownViewTheme()>
		//*  39   84:ifnonnull       65
					{
						((android.support.v7.widget.ThemedSpinnerAdapter) (spinneradapter)).setDropDownViewTheme(theme);
		//   40   87:aload_1         
		//   41   88:aload_2         
		//   42   89:invokeinterface #45  <Method void ThemedSpinnerAdapter.setDropDownViewTheme(android.content.res.Resources$Theme)>
						return;
		//   43   94:return          
					}
				}
		}
	}

	private class DropdownPopup extends ListPopupWindow
	{

		void computeContentWidth()
		{
			Drawable drawable = getBackground();
		//    0    0:aload_0         
		//    1    1:invokevirtual   #65  <Method Drawable getBackground()>
		//    2    4:astore          7
			int i;
			int l;
			int i1;
			int j1;
			if(drawable != null)
		//*   3    6:aload           7
		//*   4    8:ifnull          209
			{
				drawable.getPadding(mTempRect);
		//    5   11:aload           7
		//    6   13:aload_0         
		//    7   14:getfield        #25  <Field AppCompatSpinner this$0>
		//    8   17:invokestatic    #69  <Method Rect AppCompatSpinner.access$100(AppCompatSpinner)>
		//    9   20:invokevirtual   #75  <Method boolean Drawable.getPadding(Rect)>
		//   10   23:pop             
				int j;
				int k;
				if(ViewUtils.isLayoutRtl(((View) (AppCompatSpinner.this))))
		//*  11   24:aload_0         
		//*  12   25:getfield        #25  <Field AppCompatSpinner this$0>
		//*  13   28:invokestatic    #81  <Method boolean ViewUtils.isLayoutRtl(View)>
		//*  14   31:ifeq            194
					i = mTempRect.right;
		//   15   34:aload_0         
		//   16   35:getfield        #25  <Field AppCompatSpinner this$0>
		//   17   38:invokestatic    #69  <Method Rect AppCompatSpinner.access$100(AppCompatSpinner)>
		//   18   41:getfield        #85  <Field int Rect.right>
		//   19   44:istore_1        
				else
		//*  20   45:aload_0         
		//*  21   46:getfield        #25  <Field AppCompatSpinner this$0>
		//*  22   49:invokevirtual   #89  <Method int AppCompatSpinner.getPaddingLeft()>
		//*  23   52:istore          4
		//*  24   54:aload_0         
		//*  25   55:getfield        #25  <Field AppCompatSpinner this$0>
		//*  26   58:invokevirtual   #92  <Method int AppCompatSpinner.getPaddingRight()>
		//*  27   61:istore          5
		//*  28   63:aload_0         
		//*  29   64:getfield        #25  <Field AppCompatSpinner this$0>
		//*  30   67:invokevirtual   #95  <Method int AppCompatSpinner.getWidth()>
		//*  31   70:istore          6
		//*  32   72:aload_0         
		//*  33   73:getfield        #25  <Field AppCompatSpinner this$0>
		//*  34   76:invokestatic    #99  <Method int AppCompatSpinner.access$200(AppCompatSpinner)>
		//*  35   79:bipush          -2
		//*  36   81:icmpne          240
		//*  37   84:aload_0         
		//*  38   85:getfield        #25  <Field AppCompatSpinner this$0>
		//*  39   88:aload_0         
		//*  40   89:getfield        #101 <Field ListAdapter mAdapter>
		//*  41   92:checkcast       #103 <Class SpinnerAdapter>
		//*  42   95:aload_0         
		//*  43   96:invokevirtual   #65  <Method Drawable getBackground()>
		//*  44   99:invokevirtual   #107 <Method int AppCompatSpinner.compatMeasureContentWidth(SpinnerAdapter, Drawable)>
		//*  45  102:istore_2        
		//*  46  103:aload_0         
		//*  47  104:getfield        #25  <Field AppCompatSpinner this$0>
		//*  48  107:invokevirtual   #111 <Method Context AppCompatSpinner.getContext()>
		//*  49  110:invokevirtual   #117 <Method Resources Context.getResources()>
		//*  50  113:invokevirtual   #123 <Method DisplayMetrics Resources.getDisplayMetrics()>
		//*  51  116:getfield        #128 <Field int DisplayMetrics.widthPixels>
		//*  52  119:aload_0         
		//*  53  120:getfield        #25  <Field AppCompatSpinner this$0>
		//*  54  123:invokestatic    #69  <Method Rect AppCompatSpinner.access$100(AppCompatSpinner)>
		//*  55  126:getfield        #131 <Field int Rect.left>
		//*  56  129:isub            
		//*  57  130:aload_0         
		//*  58  131:getfield        #25  <Field AppCompatSpinner this$0>
		//*  59  134:invokestatic    #69  <Method Rect AppCompatSpinner.access$100(AppCompatSpinner)>
		//*  60  137:getfield        #85  <Field int Rect.right>
		//*  61  140:isub            
		//*  62  141:istore_3        
		//*  63  142:iload_2         
		//*  64  143:iload_3         
		//*  65  144:icmple          288
		//*  66  147:iload_3         
		//*  67  148:istore_2        
		//*  68  149:aload_0         
		//*  69  150:iload_2         
		//*  70  151:iload           6
		//*  71  153:iload           4
		//*  72  155:isub            
		//*  73  156:iload           5
		//*  74  158:isub            
		//*  75  159:invokestatic    #137 <Method int Math.max(int, int)>
		//*  76  162:invokevirtual   #140 <Method void setContentWidth(int)>
		//*  77  165:aload_0         
		//*  78  166:getfield        #25  <Field AppCompatSpinner this$0>
		//*  79  169:invokestatic    #81  <Method boolean ViewUtils.isLayoutRtl(View)>
		//*  80  172:ifeq            280
		//*  81  175:iload           6
		//*  82  177:iload           5
		//*  83  179:isub            
		//*  84  180:aload_0         
		//*  85  181:invokevirtual   #141 <Method int getWidth()>
		//*  86  184:isub            
		//*  87  185:iload_1         
		//*  88  186:iadd            
		//*  89  187:istore_1        
		//*  90  188:aload_0         
		//*  91  189:iload_1         
		//*  92  190:invokevirtual   #144 <Method void setHorizontalOffset(int)>
		//*  93  193:return          
					i = -mTempRect.left;
		//   94  194:aload_0         
		//   95  195:getfield        #25  <Field AppCompatSpinner this$0>
		//   96  198:invokestatic    #69  <Method Rect AppCompatSpinner.access$100(AppCompatSpinner)>
		//   97  201:getfield        #131 <Field int Rect.left>
		//   98  204:ineg            
		//   99  205:istore_1        
			} else
		//* 100  206:goto            45
			{
				Rect rect = mTempRect;
		//  101  209:aload_0         
		//  102  210:getfield        #25  <Field AppCompatSpinner this$0>
		//  103  213:invokestatic    #69  <Method Rect AppCompatSpinner.access$100(AppCompatSpinner)>
		//  104  216:astore          7
				mTempRect.right = 0;
		//  105  218:aload_0         
		//  106  219:getfield        #25  <Field AppCompatSpinner this$0>
		//  107  222:invokestatic    #69  <Method Rect AppCompatSpinner.access$100(AppCompatSpinner)>
		//  108  225:iconst_0        
		//  109  226:putfield        #85  <Field int Rect.right>
				rect.left = 0;
		//  110  229:aload           7
		//  111  231:iconst_0        
		//  112  232:putfield        #131 <Field int Rect.left>
				i = 0;
		//  113  235:iconst_0        
		//  114  236:istore_1        
			}
			l = getPaddingLeft();
			i1 = getPaddingRight();
			j1 = getWidth();
			if(mDropDownWidth == -2)
			{
				j = compatMeasureContentWidth((SpinnerAdapter)mAdapter, getBackground());
				k = getContext().getResources().getDisplayMetrics().widthPixels - mTempRect.left - mTempRect.right;
				if(j > k)
					j = k;
				setContentWidth(Math.max(j, j1 - l - i1));
			} else
		//* 115  237:goto            45
			if(mDropDownWidth == -1)
		//* 116  240:aload_0         
		//* 117  241:getfield        #25  <Field AppCompatSpinner this$0>
		//* 118  244:invokestatic    #99  <Method int AppCompatSpinner.access$200(AppCompatSpinner)>
		//* 119  247:iconst_m1       
		//* 120  248:icmpne          266
				setContentWidth(j1 - l - i1);
		//  121  251:aload_0         
		//  122  252:iload           6
		//  123  254:iload           4
		//  124  256:isub            
		//  125  257:iload           5
		//  126  259:isub            
		//  127  260:invokevirtual   #140 <Method void setContentWidth(int)>
			else
		//* 128  263:goto            165
				setContentWidth(mDropDownWidth);
		//  129  266:aload_0         
		//  130  267:aload_0         
		//  131  268:getfield        #25  <Field AppCompatSpinner this$0>
		//  132  271:invokestatic    #99  <Method int AppCompatSpinner.access$200(AppCompatSpinner)>
		//  133  274:invokevirtual   #140 <Method void setContentWidth(int)>
			if(ViewUtils.isLayoutRtl(((View) (AppCompatSpinner.this))))
				i = (j1 - i1 - getWidth()) + i;
			else
		//* 134  277:goto            165
				i += l;
		//  135  280:iload_1         
		//  136  281:iload           4
		//  137  283:iadd            
		//  138  284:istore_1        
			setHorizontalOffset(i);
		//* 139  285:goto            188
		//* 140  288:goto            149
		}

		public CharSequence getHintText()
		{
			return mHintText;
		//    0    0:aload_0         
		//    1    1:getfield        #148 <Field CharSequence mHintText>
		//    2    4:areturn         
		}

		boolean isVisibleToUser(View view)
		{
			return ViewCompat.isAttachedToWindow(view) && view.getGlobalVisibleRect(mVisibleRect);
		//    0    0:aload_1         
		//    1    1:invokestatic    #154 <Method boolean ViewCompat.isAttachedToWindow(View)>
		//    2    4:ifeq            20
		//    3    7:aload_1         
		//    4    8:aload_0         
		//    5    9:getfield        #35  <Field Rect mVisibleRect>
		//    6   12:invokevirtual   #159 <Method boolean View.getGlobalVisibleRect(Rect)>
		//    7   15:ifeq            20
		//    8   18:iconst_1        
		//    9   19:ireturn         
		//   10   20:iconst_0        
		//   11   21:ireturn         
		}

		public void setAdapter(ListAdapter listadapter)
		{
			super.setAdapter(listadapter);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokespecial   #163 <Method void ListPopupWindow.setAdapter(ListAdapter)>
			mAdapter = listadapter;
		//    3    5:aload_0         
		//    4    6:aload_1         
		//    5    7:putfield        #101 <Field ListAdapter mAdapter>
		//    6   10:return          
		}

		public void setPromptText(CharSequence charsequence)
		{
			mHintText = charsequence;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #148 <Field CharSequence mHintText>
		//    3    5:return          
		}

		public void show()
		{
			boolean flag = isShowing();
		//    0    0:aload_0         
		//    1    1:invokevirtual   #169 <Method boolean isShowing()>
		//    2    4:istore_1        
			computeContentWidth();
		//    3    5:aload_0         
		//    4    6:invokevirtual   #171 <Method void computeContentWidth()>
			setInputMethodMode(2);
		//    5    9:aload_0         
		//    6   10:iconst_2        
		//    7   11:invokevirtual   #174 <Method void setInputMethodMode(int)>
			super.show();
		//    8   14:aload_0         
		//    9   15:invokespecial   #60  <Method void ListPopupWindow.show()>
			getListView().setChoiceMode(1);
		//   10   18:aload_0         
		//   11   19:invokevirtual   #178 <Method ListView getListView()>
		//   12   22:iconst_1        
		//   13   23:invokevirtual   #183 <Method void ListView.setChoiceMode(int)>
			setSelection(getSelectedItemPosition());
		//   14   26:aload_0         
		//   15   27:aload_0         
		//   16   28:getfield        #25  <Field AppCompatSpinner this$0>
		//   17   31:invokevirtual   #186 <Method int AppCompatSpinner.getSelectedItemPosition()>
		//   18   34:invokevirtual   #189 <Method void setSelection(int)>
			ViewTreeObserver viewtreeobserver;
			if(!flag)
		//*  19   37:iload_1         
		//*  20   38:ifeq            42
		//*  21   41:return          
		//*  22   42:aload_0         
		//*  23   43:getfield        #25  <Field AppCompatSpinner this$0>
		//*  24   46:invokevirtual   #193 <Method ViewTreeObserver AppCompatSpinner.getViewTreeObserver()>
		//*  25   49:astore_2        
				if((viewtreeobserver = getViewTreeObserver()) != null)
		//*  26   50:aload_2         
		//*  27   51:ifnull          41
				{
					android.view.ViewTreeObserver.OnGlobalLayoutListener ongloballayoutlistener = new android.view.ViewTreeObserver.OnGlobalLayoutListener() {

						public void onGlobalLayout()
						{
							if(!isVisibleToUser(((View) (_fld0))))
						//*   0    0:aload_0         
						//*   1    1:getfield        #20  <Field AppCompatSpinner$DropdownPopup this$1>
						//*   2    4:aload_0         
						//*   3    5:getfield        #20  <Field AppCompatSpinner$DropdownPopup this$1>
						//*   4    8:getfield        #28  <Field AppCompatSpinner AppCompatSpinner$DropdownPopup.this$0>
						//*   5   11:invokevirtual   #32  <Method boolean AppCompatSpinner$DropdownPopup.isVisibleToUser(View)>
						//*   6   14:ifne            25
							{
								dismiss();
						//    7   17:aload_0         
						//    8   18:getfield        #20  <Field AppCompatSpinner$DropdownPopup this$1>
						//    9   21:invokevirtual   #35  <Method void AppCompatSpinner$DropdownPopup.dismiss()>
								return;
						//   10   24:return          
							} else
							{
								computeContentWidth();
						//   11   25:aload_0         
						//   12   26:getfield        #20  <Field AppCompatSpinner$DropdownPopup this$1>
						//   13   29:invokevirtual   #38  <Method void AppCompatSpinner$DropdownPopup.computeContentWidth()>
								show();
						//   14   32:aload_0         
						//   15   33:getfield        #20  <Field AppCompatSpinner$DropdownPopup this$1>
						//   16   36:invokestatic    #41  <Method void AppCompatSpinner$DropdownPopup.access$301(AppCompatSpinner$DropdownPopup)>
								return;
						//   17   39:return          
							}
						}

						final DropdownPopup this$1;

			
			{
				this$1 = DropdownPopup.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #20  <Field AppCompatSpinner$DropdownPopup this$1>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #22  <Method void Object()>
			//    5    9:return          
			}
					}
;
		//   28   54:new             #11  <Class AppCompatSpinner$DropdownPopup$2>
		//   29   57:dup             
		//   30   58:aload_0         
		//   31   59:invokespecial   #195 <Method void AppCompatSpinner$DropdownPopup$2(AppCompatSpinner$DropdownPopup)>
		//   32   62:astore_3        
					viewtreeobserver.addOnGlobalLayoutListener(ongloballayoutlistener);
		//   33   63:aload_2         
		//   34   64:aload_3         
		//   35   65:invokevirtual   #201 <Method void ViewTreeObserver.addOnGlobalLayoutListener(android.view.ViewTreeObserver$OnGlobalLayoutListener)>
					setOnDismissListener(((_cls3) (ongloballayoutlistener)). new android.widget.PopupWindow.OnDismissListener() {

						public void onDismiss()
						{
							ViewTreeObserver viewtreeobserver = getViewTreeObserver();
						//    0    0:aload_0         
						//    1    1:getfield        #22  <Field AppCompatSpinner$DropdownPopup this$1>
						//    2    4:getfield        #32  <Field AppCompatSpinner AppCompatSpinner$DropdownPopup.this$0>
						//    3    7:invokevirtual   #36  <Method ViewTreeObserver AppCompatSpinner.getViewTreeObserver()>
						//    4   10:astore_1        
							if(viewtreeobserver != null)
						//*   5   11:aload_1         
						//*   6   12:ifnull          23
								viewtreeobserver.removeGlobalOnLayoutListener(layoutListener);
						//    7   15:aload_1         
						//    8   16:aload_0         
						//    9   17:getfield        #24  <Field android.view.ViewTreeObserver$OnGlobalLayoutListener val$layoutListener>
						//   10   20:invokevirtual   #42  <Method void ViewTreeObserver.removeGlobalOnLayoutListener(android.view.ViewTreeObserver$OnGlobalLayoutListener)>
						//   11   23:return          
						}

						final DropdownPopup this$1;
						final android.view.ViewTreeObserver.OnGlobalLayoutListener val$layoutListener;

			
			{
				this$1 = final_dropdownpopup;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #22  <Field AppCompatSpinner$DropdownPopup this$1>
				layoutListener = android.view.ViewTreeObserver.OnGlobalLayoutListener.this;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #24  <Field android.view.ViewTreeObserver$OnGlobalLayoutListener val$layoutListener>
				super();
			//    6   10:aload_0         
			//    7   11:invokespecial   #26  <Method void Object()>
			//    8   14:return          
			}
					}
);
		//   36   68:aload_0         
		//   37   69:new             #13  <Class AppCompatSpinner$DropdownPopup$3>
		//   38   72:dup             
		//   39   73:aload_0         
		//   40   74:aload_3         
		//   41   75:invokespecial   #204 <Method void AppCompatSpinner$DropdownPopup$3(AppCompatSpinner$DropdownPopup, android.view.ViewTreeObserver$OnGlobalLayoutListener)>
		//   42   78:invokevirtual   #208 <Method void setOnDismissListener(android.widget.PopupWindow$OnDismissListener)>
					return;
		//   43   81:return          
				}
		}

		ListAdapter mAdapter;
		private CharSequence mHintText;
		private final Rect mVisibleRect = new Rect();
		final AppCompatSpinner this$0;


/*
		static void access$301(DropdownPopup dropdownpopup)
		{
			((ListPopupWindow) (dropdownpopup)).super.show();
		//    0    0:aload_0         
		//    1    1:invokespecial   #60  <Method void ListPopupWindow.show()>
			return;
		//    2    4:return          
		}

*/

		public DropdownPopup(Context context, AttributeSet attributeset, int i)
		{
			this$0 = AppCompatSpinner.this;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #25  <Field AppCompatSpinner this$0>
			super(context, attributeset, i);
		//    3    5:aload_0         
		//    4    6:aload_2         
		//    5    7:aload_3         
		//    6    8:iload           4
		//    7   10:invokespecial   #28  <Method void ListPopupWindow(Context, AttributeSet, int)>
		//    8   13:aload_0         
		//    9   14:new             #30  <Class Rect>
		//   10   17:dup             
		//   11   18:invokespecial   #33  <Method void Rect()>
		//   12   21:putfield        #35  <Field Rect mVisibleRect>
			setAnchorView(((View) (AppCompatSpinner.this)));
		//   13   24:aload_0         
		//   14   25:aload_1         
		//   15   26:invokevirtual   #39  <Method void setAnchorView(View)>
			setModal(true);
		//   16   29:aload_0         
		//   17   30:iconst_1        
		//   18   31:invokevirtual   #43  <Method void setModal(boolean)>
			setPromptPosition(0);
		//   19   34:aload_0         
		//   20   35:iconst_0        
		//   21   36:invokevirtual   #47  <Method void setPromptPosition(int)>
			setOnItemClickListener(new _cls1());
		//   22   39:aload_0         
		//   23   40:new             #9   <Class AppCompatSpinner$DropdownPopup$1>
		//   24   43:dup             
		//   25   44:aload_0         
		//   26   45:aload_1         
		//   27   46:invokespecial   #50  <Method void AppCompatSpinner$DropdownPopup$1(AppCompatSpinner$DropdownPopup, AppCompatSpinner)>
		//   28   49:invokevirtual   #54  <Method void setOnItemClickListener(android.widget.AdapterView$OnItemClickListener)>
		//   29   52:return          
		}
	}


	public AppCompatSpinner(Context context)
	{
		this(context, ((AttributeSet) (null)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aconst_null     
	//    3    3:invokespecial   #61  <Method void AppCompatSpinner(Context, AttributeSet)>
	//    4    6:return          
	}

	public AppCompatSpinner(Context context, int i)
	{
		this(context, ((AttributeSet) (null)), android.support.v7.appcompat.R.attr.spinnerStyle, i);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aconst_null     
	//    3    3:getstatic       #67  <Field int android.support.v7.appcompat.R$attr.spinnerStyle>
	//    4    6:iload_2         
	//    5    7:invokespecial   #70  <Method void AppCompatSpinner(Context, AttributeSet, int, int)>
	//    6   10:return          
	}

	public AppCompatSpinner(Context context, AttributeSet attributeset)
	{
		this(context, attributeset, android.support.v7.appcompat.R.attr.spinnerStyle);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:getstatic       #67  <Field int android.support.v7.appcompat.R$attr.spinnerStyle>
	//    4    6:invokespecial   #73  <Method void AppCompatSpinner(Context, AttributeSet, int)>
	//    5    9:return          
	}

	public AppCompatSpinner(Context context, AttributeSet attributeset, int i)
	{
		this(context, attributeset, i, -1);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:iload_3         
	//    4    4:iconst_m1       
	//    5    5:invokespecial   #70  <Method void AppCompatSpinner(Context, AttributeSet, int, int)>
	//    6    8:return          
	}

	public AppCompatSpinner(Context context, AttributeSet attributeset, int i, int j)
	{
		this(context, attributeset, i, j, ((android.content.res.Resources.Theme) (null)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:iload_3         
	//    4    4:iload           4
	//    5    6:aconst_null     
	//    6    7:invokespecial   #76  <Method void AppCompatSpinner(Context, AttributeSet, int, int, android.content.res.Resources$Theme)>
	//    7   10:return          
	}

	public AppCompatSpinner(Context context, AttributeSet attributeset, int i, int j, android.content.res.Resources.Theme theme)
	{
		int i1;
		Object obj;
		super(context, attributeset, i);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:iload_3         
	//    4    4:invokespecial   #79  <Method void Spinner(Context, AttributeSet, int)>
		mTempRect = new Rect();
	//    5    7:aload_0         
	//    6    8:new             #81  <Class Rect>
	//    7   11:dup             
	//    8   12:invokespecial   #83  <Method void Rect()>
	//    9   15:putfield        #85  <Field Rect mTempRect>
		TintTypedArray tinttypedarray = TintTypedArray.obtainStyledAttributes(context, attributeset, android.support.v7.appcompat.R.styleable.Spinner, i, 0);
	//   10   18:aload_1         
	//   11   19:aload_2         
	//   12   20:getstatic       #90  <Field int[] android.support.v7.appcompat.R$styleable.Spinner>
	//   13   23:iload_3         
	//   14   24:iconst_0        
	//   15   25:invokestatic    #96  <Method TintTypedArray TintTypedArray.obtainStyledAttributes(Context, AttributeSet, int[], int, int)>
	//   16   28:astore          10
		mBackgroundTintHelper = new AppCompatBackgroundHelper(((View) (this)));
	//   17   30:aload_0         
	//   18   31:new             #98  <Class AppCompatBackgroundHelper>
	//   19   34:dup             
	//   20   35:aload_0         
	//   21   36:invokespecial   #101 <Method void AppCompatBackgroundHelper(View)>
	//   22   39:putfield        #103 <Field AppCompatBackgroundHelper mBackgroundTintHelper>
		int k;
		if(theme != null)
	//*  23   42:aload           5
	//*  24   44:ifnull          329
		{
			mPopupContext = ((Context) (new ContextThemeWrapper(context, theme)));
	//   25   47:aload_0         
	//   26   48:new             #105 <Class ContextThemeWrapper>
	//   27   51:dup             
	//   28   52:aload_1         
	//   29   53:aload           5
	//   30   55:invokespecial   #108 <Method void ContextThemeWrapper(Context, android.content.res.Resources$Theme)>
	//   31   58:putfield        #110 <Field Context mPopupContext>
		} else
	//*  32   61:aload_0         
	//*  33   62:getfield        #110 <Field Context mPopupContext>
	//*  34   65:ifnull          249
	//*  35   68:iload           4
	//*  36   70:istore          7
	//*  37   72:iload           4
	//*  38   74:iconst_m1       
	//*  39   75:icmpne          146
	//*  40   78:getstatic       #115 <Field int android.os.Build$VERSION.SDK_INT>
	//*  41   81:bipush          11
	//*  42   83:icmplt          444
	//*  43   86:aload_1         
	//*  44   87:aload_2         
	//*  45   88:getstatic       #55  <Field int[] ATTRS_ANDROID_SPINNERMODE>
	//*  46   91:iload_3         
	//*  47   92:iconst_0        
	//*  48   93:invokevirtual   #120 <Method TypedArray Context.obtainStyledAttributes(AttributeSet, int[], int, int)>
	//*  49   96:astore          8
	//*  50   98:iload           4
	//*  51  100:istore          6
	//*  52  102:aload           8
	//*  53  104:astore          5
	//*  54  106:aload           8
	//*  55  108:iconst_0        
	//*  56  109:invokevirtual   #126 <Method boolean TypedArray.hasValue(int)>
	//*  57  112:ifeq            128
	//*  58  115:aload           8
	//*  59  117:astore          5
	//*  60  119:aload           8
	//*  61  121:iconst_0        
	//*  62  122:iconst_0        
	//*  63  123:invokevirtual   #130 <Method int TypedArray.getInt(int, int)>
	//*  64  126:istore          6
	//*  65  128:iload           6
	//*  66  130:istore          7
	//*  67  132:aload           8
	//*  68  134:ifnull          146
	//*  69  137:aload           8
	//*  70  139:invokevirtual   #133 <Method void TypedArray.recycle()>
	//*  71  142:iload           6
	//*  72  144:istore          7
	//*  73  146:iload           7
	//*  74  148:iconst_1        
	//*  75  149:icmpne          249
	//*  76  152:new             #13  <Class AppCompatSpinner$DropdownPopup>
	//*  77  155:dup             
	//*  78  156:aload_0         
	//*  79  157:aload_0         
	//*  80  158:getfield        #110 <Field Context mPopupContext>
	//*  81  161:aload_2         
	//*  82  162:iload_3         
	//*  83  163:invokespecial   #136 <Method void AppCompatSpinner$DropdownPopup(AppCompatSpinner, Context, AttributeSet, int)>
	//*  84  166:astore          5
	//*  85  168:aload_0         
	//*  86  169:getfield        #110 <Field Context mPopupContext>
	//*  87  172:aload_2         
	//*  88  173:getstatic       #90  <Field int[] android.support.v7.appcompat.R$styleable.Spinner>
	//*  89  176:iload_3         
	//*  90  177:iconst_0        
	//*  91  178:invokestatic    #96  <Method TintTypedArray TintTypedArray.obtainStyledAttributes(Context, AttributeSet, int[], int, int)>
	//*  92  181:astore          8
	//*  93  183:aload_0         
	//*  94  184:aload           8
	//*  95  186:getstatic       #139 <Field int android.support.v7.appcompat.R$styleable.Spinner_android_dropDownWidth>
	//*  96  189:bipush          -2
	//*  97  191:invokevirtual   #142 <Method int TintTypedArray.getLayoutDimension(int, int)>
	//*  98  194:putfield        #144 <Field int mDropDownWidth>
	//*  99  197:aload           5
	//* 100  199:aload           8
	//* 101  201:getstatic       #147 <Field int android.support.v7.appcompat.R$styleable.Spinner_android_popupBackground>
	//* 102  204:invokevirtual   #151 <Method Drawable TintTypedArray.getDrawable(int)>
	//* 103  207:invokevirtual   #155 <Method void AppCompatSpinner$DropdownPopup.setBackgroundDrawable(Drawable)>
	//* 104  210:aload           5
	//* 105  212:aload           10
	//* 106  214:getstatic       #158 <Field int android.support.v7.appcompat.R$styleable.Spinner_android_prompt>
	//* 107  217:invokevirtual   #162 <Method String TintTypedArray.getString(int)>
	//* 108  220:invokevirtual   #166 <Method void AppCompatSpinner$DropdownPopup.setPromptText(CharSequence)>
	//* 109  223:aload           8
	//* 110  225:invokevirtual   #167 <Method void TintTypedArray.recycle()>
	//* 111  228:aload_0         
	//* 112  229:aload           5
	//* 113  231:putfield        #169 <Field AppCompatSpinner$DropdownPopup mPopup>
	//* 114  234:aload_0         
	//* 115  235:new             #8   <Class AppCompatSpinner$1>
	//* 116  238:dup             
	//* 117  239:aload_0         
	//* 118  240:aload_0         
	//* 119  241:aload           5
	//* 120  243:invokespecial   #172 <Method void AppCompatSpinner$1(AppCompatSpinner, View, AppCompatSpinner$DropdownPopup)>
	//* 121  246:putfield        #174 <Field ForwardingListener mForwardingListener>
	//* 122  249:aload           10
	//* 123  251:getstatic       #177 <Field int android.support.v7.appcompat.R$styleable.Spinner_android_entries>
	//* 124  254:invokevirtual   #181 <Method CharSequence[] TintTypedArray.getTextArray(int)>
	//* 125  257:astore          5
	//* 126  259:aload           5
	//* 127  261:ifnull          289
	//* 128  264:new             #183 <Class ArrayAdapter>
	//* 129  267:dup             
	//* 130  268:aload_1         
	//* 131  269:ldc1            #184 <Int 0x1090008>
	//* 132  271:aload           5
	//* 133  273:invokespecial   #187 <Method void ArrayAdapter(Context, int, Object[])>
	//* 134  276:astore_1        
	//* 135  277:aload_1         
	//* 136  278:getstatic       #192 <Field int android.support.v7.appcompat.R$layout.support_simple_spinner_dropdown_item>
	//* 137  281:invokevirtual   #196 <Method void ArrayAdapter.setDropDownViewResource(int)>
	//* 138  284:aload_0         
	//* 139  285:aload_1         
	//* 140  286:invokevirtual   #200 <Method void setAdapter(SpinnerAdapter)>
	//* 141  289:aload           10
	//* 142  291:invokevirtual   #167 <Method void TintTypedArray.recycle()>
	//* 143  294:aload_0         
	//* 144  295:iconst_1        
	//* 145  296:putfield        #202 <Field boolean mPopupSet>
	//* 146  299:aload_0         
	//* 147  300:getfield        #204 <Field SpinnerAdapter mTempAdapter>
	//* 148  303:ifnull          319
	//* 149  306:aload_0         
	//* 150  307:aload_0         
	//* 151  308:getfield        #204 <Field SpinnerAdapter mTempAdapter>
	//* 152  311:invokevirtual   #200 <Method void setAdapter(SpinnerAdapter)>
	//* 153  314:aload_0         
	//* 154  315:aconst_null     
	//* 155  316:putfield        #204 <Field SpinnerAdapter mTempAdapter>
	//* 156  319:aload_0         
	//* 157  320:getfield        #103 <Field AppCompatBackgroundHelper mBackgroundTintHelper>
	//* 158  323:aload_2         
	//* 159  324:iload_3         
	//* 160  325:invokevirtual   #208 <Method void AppCompatBackgroundHelper.loadFromAttributes(AttributeSet, int)>
	//* 161  328:return          
		{
			int l = tinttypedarray.getResourceId(android.support.v7.appcompat.R.styleable.Spinner_popupTheme, 0);
	//  162  329:aload           10
	//  163  331:getstatic       #211 <Field int android.support.v7.appcompat.R$styleable.Spinner_popupTheme>
	//  164  334:iconst_0        
	//  165  335:invokevirtual   #214 <Method int TintTypedArray.getResourceId(int, int)>
	//  166  338:istore          6
			if(l != 0)
	//* 167  340:iload           6
	//* 168  342:ifeq            362
			{
				mPopupContext = ((Context) (new ContextThemeWrapper(context, l)));
	//  169  345:aload_0         
	//  170  346:new             #105 <Class ContextThemeWrapper>
	//  171  349:dup             
	//  172  350:aload_1         
	//  173  351:iload           6
	//  174  353:invokespecial   #216 <Method void ContextThemeWrapper(Context, int)>
	//  175  356:putfield        #110 <Field Context mPopupContext>
			} else
	//* 176  359:goto            61
			{
				if(android.os.Build.VERSION.SDK_INT < 23)
	//* 177  362:getstatic       #115 <Field int android.os.Build$VERSION.SDK_INT>
	//* 178  365:bipush          23
	//* 179  367:icmpge          382
					theme = ((android.content.res.Resources.Theme) (context));
	//  180  370:aload_1         
	//  181  371:astore          5
				else
	//* 182  373:aload_0         
	//* 183  374:aload           5
	//* 184  376:putfield        #110 <Field Context mPopupContext>
	//* 185  379:goto            61
					theme = null;
	//  186  382:aconst_null     
	//  187  383:astore          5
				mPopupContext = ((Context) (theme));
			}
		}
		if(mPopupContext == null) goto _L2; else goto _L1
_L1:
		i1 = j;
		if(j != -1) goto _L4; else goto _L3
_L3:
		if(android.os.Build.VERSION.SDK_INT < 11) goto _L6; else goto _L5
_L5:
		obj = ((Object) (context.obtainStyledAttributes(attributeset, ATTRS_ANDROID_SPINNERMODE, i, 0)));
		k = j;
		theme = ((android.content.res.Resources.Theme) (obj));
		if(!((TypedArray) (obj)).hasValue(0))
			break MISSING_BLOCK_LABEL_128;
		theme = ((android.content.res.Resources.Theme) (obj));
		k = ((TypedArray) (obj)).getInt(0, 0);
		i1 = k;
		if(obj != null)
		{
			((TypedArray) (obj)).recycle();
			i1 = k;
		}
_L4:
		if(i1 == 1)
		{
			theme = ((android.content.res.Resources.Theme) (new DropdownPopup(mPopupContext, attributeset, i)));
			obj = ((Object) (TintTypedArray.obtainStyledAttributes(mPopupContext, attributeset, android.support.v7.appcompat.R.styleable.Spinner, i, 0)));
			mDropDownWidth = ((TintTypedArray) (obj)).getLayoutDimension(android.support.v7.appcompat.R.styleable.Spinner_android_dropDownWidth, -2);
			((DropdownPopup) (theme)).setBackgroundDrawable(((TintTypedArray) (obj)).getDrawable(android.support.v7.appcompat.R.styleable.Spinner_android_popupBackground));
			((DropdownPopup) (theme)).setPromptText(((CharSequence) (tinttypedarray.getString(android.support.v7.appcompat.R.styleable.Spinner_android_prompt))));
			((TintTypedArray) (obj)).recycle();
			mPopup = ((DropdownPopup) (theme));
			mForwardingListener = ((ForwardingListener) (new ForwardingListener(((DropdownPopup) (theme))) {

				public ShowableListMenu getPopup()
				{
					return ((ShowableListMenu) (popup));
				//    0    0:aload_0         
				//    1    1:getfield        #18  <Field AppCompatSpinner$DropdownPopup val$popup>
				//    2    4:areturn         
				}

				public boolean onForwardingStarted()
				{
					if(!mPopup.isShowing())
				//*   0    0:aload_0         
				//*   1    1:getfield        #16  <Field AppCompatSpinner this$0>
				//*   2    4:invokestatic    #30  <Method AppCompatSpinner$DropdownPopup AppCompatSpinner.access$000(AppCompatSpinner)>
				//*   3    7:invokevirtual   #35  <Method boolean AppCompatSpinner$DropdownPopup.isShowing()>
				//*   4   10:ifne            23
						mPopup.show();
				//    5   13:aload_0         
				//    6   14:getfield        #16  <Field AppCompatSpinner this$0>
				//    7   17:invokestatic    #30  <Method AppCompatSpinner$DropdownPopup AppCompatSpinner.access$000(AppCompatSpinner)>
				//    8   20:invokevirtual   #39  <Method void AppCompatSpinner$DropdownPopup.show()>
					return true;
				//    9   23:iconst_1        
				//   10   24:ireturn         
				}

				final AppCompatSpinner this$0;
				final DropdownPopup val$popup;

			
			{
				this$0 = AppCompatSpinner.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #16  <Field AppCompatSpinner this$0>
				popup = dropdownpopup;
			//    3    5:aload_0         
			//    4    6:aload_3         
			//    5    7:putfield        #18  <Field AppCompatSpinner$DropdownPopup val$popup>
				super(final_view);
			//    6   10:aload_0         
			//    7   11:aload_2         
			//    8   12:invokespecial   #21  <Method void ForwardingListener(View)>
			//    9   15:return          
			}
			}
));
		}
_L2:
		theme = ((android.content.res.Resources.Theme) (tinttypedarray.getTextArray(android.support.v7.appcompat.R.styleable.Spinner_android_entries)));
		if(theme != null)
		{
			context = ((Context) (new ArrayAdapter(context, 0x1090008, ((Object []) (theme)))));
			((ArrayAdapter) (context)).setDropDownViewResource(android.support.v7.appcompat.R.layout.support_simple_spinner_dropdown_item);
			setAdapter(((SpinnerAdapter) (context)));
		}
		tinttypedarray.recycle();
		mPopupSet = true;
		if(mTempAdapter != null)
		{
			setAdapter(mTempAdapter);
			mTempAdapter = null;
		}
		mBackgroundTintHelper.loadFromAttributes(attributeset, i);
		return;
	//* 188  385:goto            373
		Exception exception;
		exception;
	//  189  388:astore          9
		obj = null;
	//  190  390:aconst_null     
	//  191  391:astore          8
_L8:
		theme = ((android.content.res.Resources.Theme) (obj));
	//  192  393:aload           8
	//  193  395:astore          5
		Log.i("AppCompatSpinner", "Could not read android:spinnerMode", ((Throwable) (exception)));
	//  194  397:ldc1            #35  <String "AppCompatSpinner">
	//  195  399:ldc1            #218 <String "Could not read android:spinnerMode">
	//  196  401:aload           9
	//  197  403:invokestatic    #224 <Method int Log.i(String, String, Throwable)>
	//  198  406:pop             
		i1 = j;
	//  199  407:iload           4
	//  200  409:istore          7
		if(obj != null)
	//* 201  411:aload           8
	//* 202  413:ifnull          146
		{
			((TypedArray) (obj)).recycle();
	//  203  416:aload           8
	//  204  418:invokevirtual   #133 <Method void TypedArray.recycle()>
			i1 = j;
	//  205  421:iload           4
	//  206  423:istore          7
		}
		  goto _L4
	//* 207  425:goto            146
		context;
	//  208  428:astore_1        
		theme = null;
	//  209  429:aconst_null     
	//  210  430:astore          5
_L7:
		if(theme != null)
	//* 211  432:aload           5
	//* 212  434:ifnull          442
			((TypedArray) (theme)).recycle();
	//  213  437:aload           5
	//  214  439:invokevirtual   #133 <Method void TypedArray.recycle()>
		throw context;
	//  215  442:aload_1         
	//  216  443:athrow          
_L6:
		i1 = 1;
	//  217  444:iconst_1        
	//  218  445:istore          7
		  goto _L4
	//* 219  447:goto            146
		context;
	//  220  450:astore_1        
		  goto _L7
	//* 221  451:goto            432
		exception;
	//  222  454:astore          9
		  goto _L8
	//* 223  456:goto            393
	}

	int compatMeasureContentWidth(SpinnerAdapter spinneradapter, Drawable drawable)
	{
		if(spinneradapter == null)
	//*   0    0:aload_1         
	//*   1    1:ifnonnull       6
			return 0;
	//    2    4:iconst_0        
	//    3    5:ireturn         
		int i1 = android.view.View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 0);
	//    4    6:aload_0         
	//    5    7:invokevirtual   #236 <Method int getMeasuredWidth()>
	//    6   10:iconst_0        
	//    7   11:invokestatic    #241 <Method int android.view.View$MeasureSpec.makeMeasureSpec(int, int)>
	//    8   14:istore          7
		int j1 = android.view.View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 0);
	//    9   16:aload_0         
	//   10   17:invokevirtual   #244 <Method int getMeasuredHeight()>
	//   11   20:iconst_0        
	//   12   21:invokestatic    #241 <Method int android.view.View$MeasureSpec.makeMeasureSpec(int, int)>
	//   13   24:istore          8
		int i = Math.max(0, getSelectedItemPosition());
	//   14   26:iconst_0        
	//   15   27:aload_0         
	//   16   28:invokevirtual   #247 <Method int getSelectedItemPosition()>
	//   17   31:invokestatic    #252 <Method int Math.max(int, int)>
	//   18   34:istore_3        
		int k1 = Math.min(spinneradapter.getCount(), i + 15);
	//   19   35:aload_1         
	//   20   36:invokeinterface #257 <Method int SpinnerAdapter.getCount()>
	//   21   41:iload_3         
	//   22   42:bipush          15
	//   23   44:iadd            
	//   24   45:invokestatic    #260 <Method int Math.min(int, int)>
	//   25   48:istore          9
		int j = Math.max(0, i - (15 - (k1 - i)));
	//   26   50:iconst_0        
	//   27   51:iload_3         
	//   28   52:bipush          15
	//   29   54:iload           9
	//   30   56:iload_3         
	//   31   57:isub            
	//   32   58:isub            
	//   33   59:isub            
	//   34   60:invokestatic    #252 <Method int Math.max(int, int)>
	//   35   63:istore          4
		View view = null;
	//   36   65:aconst_null     
	//   37   66:astore          10
		int k = 0;
	//   38   68:iconst_0        
	//   39   69:istore          5
		i = 0;
	//   40   71:iconst_0        
	//   41   72:istore_3        
		for(; j < k1; j++)
	//*  42   73:iload           4
	//*  43   75:iload           9
	//*  44   77:icmpge          169
		{
			int l = spinneradapter.getItemViewType(j);
	//   45   80:aload_1         
	//   46   81:iload           4
	//   47   83:invokeinterface #264 <Method int SpinnerAdapter.getItemViewType(int)>
	//   48   88:istore          6
			if(l != i)
	//*  49   90:iload           6
	//*  50   92:iload_3         
	//*  51   93:icmpeq          204
			{
				view = null;
	//   52   96:aconst_null     
	//   53   97:astore          10
				i = l;
	//   54   99:iload           6
	//   55  101:istore_3        
			}
			view = spinneradapter.getView(j, view, ((ViewGroup) (this)));
	//   56  102:aload_1         
	//   57  103:iload           4
	//   58  105:aload           10
	//   59  107:aload_0         
	//   60  108:invokeinterface #268 <Method View SpinnerAdapter.getView(int, View, ViewGroup)>
	//   61  113:astore          10
			if(view.getLayoutParams() == null)
	//*  62  115:aload           10
	//*  63  117:invokevirtual   #274 <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//*  64  120:ifnonnull       139
				view.setLayoutParams(new android.view.ViewGroup.LayoutParams(-2, -2));
	//   65  123:aload           10
	//   66  125:new             #276 <Class android.view.ViewGroup$LayoutParams>
	//   67  128:dup             
	//   68  129:bipush          -2
	//   69  131:bipush          -2
	//   70  133:invokespecial   #279 <Method void android.view.ViewGroup$LayoutParams(int, int)>
	//   71  136:invokevirtual   #283 <Method void View.setLayoutParams(android.view.ViewGroup$LayoutParams)>
			view.measure(i1, j1);
	//   72  139:aload           10
	//   73  141:iload           7
	//   74  143:iload           8
	//   75  145:invokevirtual   #286 <Method void View.measure(int, int)>
			k = Math.max(k, view.getMeasuredWidth());
	//   76  148:iload           5
	//   77  150:aload           10
	//   78  152:invokevirtual   #287 <Method int View.getMeasuredWidth()>
	//   79  155:invokestatic    #252 <Method int Math.max(int, int)>
	//   80  158:istore          5
		}

	//   81  160:iload           4
	//   82  162:iconst_1        
	//   83  163:iadd            
	//   84  164:istore          4
	//*  85  166:goto            73
		if(drawable != null)
	//*  86  169:aload_2         
	//*  87  170:ifnull          201
		{
			drawable.getPadding(mTempRect);
	//   88  173:aload_2         
	//   89  174:aload_0         
	//   90  175:getfield        #85  <Field Rect mTempRect>
	//   91  178:invokevirtual   #293 <Method boolean Drawable.getPadding(Rect)>
	//   92  181:pop             
			return mTempRect.left + mTempRect.right + k;
	//   93  182:aload_0         
	//   94  183:getfield        #85  <Field Rect mTempRect>
	//   95  186:getfield        #296 <Field int Rect.left>
	//   96  189:aload_0         
	//   97  190:getfield        #85  <Field Rect mTempRect>
	//   98  193:getfield        #299 <Field int Rect.right>
	//   99  196:iadd            
	//  100  197:iload           5
	//  101  199:iadd            
	//  102  200:ireturn         
		} else
		{
			return k;
	//  103  201:iload           5
	//  104  203:ireturn         
		}
	//* 105  204:goto            102
	}

	protected void drawableStateChanged()
	{
		super.drawableStateChanged();
	//    0    0:aload_0         
	//    1    1:invokespecial   #302 <Method void Spinner.drawableStateChanged()>
		if(mBackgroundTintHelper != null)
	//*   2    4:aload_0         
	//*   3    5:getfield        #103 <Field AppCompatBackgroundHelper mBackgroundTintHelper>
	//*   4    8:ifnull          18
			mBackgroundTintHelper.applySupportBackgroundTint();
	//    5   11:aload_0         
	//    6   12:getfield        #103 <Field AppCompatBackgroundHelper mBackgroundTintHelper>
	//    7   15:invokevirtual   #305 <Method void AppCompatBackgroundHelper.applySupportBackgroundTint()>
	//    8   18:return          
	}

	public int getDropDownHorizontalOffset()
	{
		if(mPopup != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #169 <Field AppCompatSpinner$DropdownPopup mPopup>
	//*   2    4:ifnull          15
			return mPopup.getHorizontalOffset();
	//    3    7:aload_0         
	//    4    8:getfield        #169 <Field AppCompatSpinner$DropdownPopup mPopup>
	//    5   11:invokevirtual   #309 <Method int AppCompatSpinner$DropdownPopup.getHorizontalOffset()>
	//    6   14:ireturn         
		if(android.os.Build.VERSION.SDK_INT >= 16)
	//*   7   15:getstatic       #115 <Field int android.os.Build$VERSION.SDK_INT>
	//*   8   18:bipush          16
	//*   9   20:icmplt          28
			return super.getDropDownHorizontalOffset();
	//   10   23:aload_0         
	//   11   24:invokespecial   #311 <Method int Spinner.getDropDownHorizontalOffset()>
	//   12   27:ireturn         
		else
			return 0;
	//   13   28:iconst_0        
	//   14   29:ireturn         
	}

	public int getDropDownVerticalOffset()
	{
		if(mPopup != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #169 <Field AppCompatSpinner$DropdownPopup mPopup>
	//*   2    4:ifnull          15
			return mPopup.getVerticalOffset();
	//    3    7:aload_0         
	//    4    8:getfield        #169 <Field AppCompatSpinner$DropdownPopup mPopup>
	//    5   11:invokevirtual   #315 <Method int AppCompatSpinner$DropdownPopup.getVerticalOffset()>
	//    6   14:ireturn         
		if(android.os.Build.VERSION.SDK_INT >= 16)
	//*   7   15:getstatic       #115 <Field int android.os.Build$VERSION.SDK_INT>
	//*   8   18:bipush          16
	//*   9   20:icmplt          28
			return super.getDropDownVerticalOffset();
	//   10   23:aload_0         
	//   11   24:invokespecial   #317 <Method int Spinner.getDropDownVerticalOffset()>
	//   12   27:ireturn         
		else
			return 0;
	//   13   28:iconst_0        
	//   14   29:ireturn         
	}

	public int getDropDownWidth()
	{
		if(mPopup != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #169 <Field AppCompatSpinner$DropdownPopup mPopup>
	//*   2    4:ifnull          12
			return mDropDownWidth;
	//    3    7:aload_0         
	//    4    8:getfield        #144 <Field int mDropDownWidth>
	//    5   11:ireturn         
		if(android.os.Build.VERSION.SDK_INT >= 16)
	//*   6   12:getstatic       #115 <Field int android.os.Build$VERSION.SDK_INT>
	//*   7   15:bipush          16
	//*   8   17:icmplt          25
			return super.getDropDownWidth();
	//    9   20:aload_0         
	//   10   21:invokespecial   #320 <Method int Spinner.getDropDownWidth()>
	//   11   24:ireturn         
		else
			return 0;
	//   12   25:iconst_0        
	//   13   26:ireturn         
	}

	public Drawable getPopupBackground()
	{
		if(mPopup != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #169 <Field AppCompatSpinner$DropdownPopup mPopup>
	//*   2    4:ifnull          15
			return mPopup.getBackground();
	//    3    7:aload_0         
	//    4    8:getfield        #169 <Field AppCompatSpinner$DropdownPopup mPopup>
	//    5   11:invokevirtual   #325 <Method Drawable AppCompatSpinner$DropdownPopup.getBackground()>
	//    6   14:areturn         
		if(android.os.Build.VERSION.SDK_INT >= 16)
	//*   7   15:getstatic       #115 <Field int android.os.Build$VERSION.SDK_INT>
	//*   8   18:bipush          16
	//*   9   20:icmplt          28
			return super.getPopupBackground();
	//   10   23:aload_0         
	//   11   24:invokespecial   #327 <Method Drawable Spinner.getPopupBackground()>
	//   12   27:areturn         
		else
			return null;
	//   13   28:aconst_null     
	//   14   29:areturn         
	}

	public Context getPopupContext()
	{
		if(mPopup != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #169 <Field AppCompatSpinner$DropdownPopup mPopup>
	//*   2    4:ifnull          12
			return mPopupContext;
	//    3    7:aload_0         
	//    4    8:getfield        #110 <Field Context mPopupContext>
	//    5   11:areturn         
		if(android.os.Build.VERSION.SDK_INT >= 23)
	//*   6   12:getstatic       #115 <Field int android.os.Build$VERSION.SDK_INT>
	//*   7   15:bipush          23
	//*   8   17:icmplt          25
			return super.getPopupContext();
	//    9   20:aload_0         
	//   10   21:invokespecial   #331 <Method Context Spinner.getPopupContext()>
	//   11   24:areturn         
		else
			return null;
	//   12   25:aconst_null     
	//   13   26:areturn         
	}

	public CharSequence getPrompt()
	{
		if(mPopup != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #169 <Field AppCompatSpinner$DropdownPopup mPopup>
	//*   2    4:ifnull          15
			return mPopup.getHintText();
	//    3    7:aload_0         
	//    4    8:getfield        #169 <Field AppCompatSpinner$DropdownPopup mPopup>
	//    5   11:invokevirtual   #336 <Method CharSequence AppCompatSpinner$DropdownPopup.getHintText()>
	//    6   14:areturn         
		else
			return super.getPrompt();
	//    7   15:aload_0         
	//    8   16:invokespecial   #338 <Method CharSequence Spinner.getPrompt()>
	//    9   19:areturn         
	}

	public ColorStateList getSupportBackgroundTintList()
	{
		if(mBackgroundTintHelper != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #103 <Field AppCompatBackgroundHelper mBackgroundTintHelper>
	//*   2    4:ifnull          15
			return mBackgroundTintHelper.getSupportBackgroundTintList();
	//    3    7:aload_0         
	//    4    8:getfield        #103 <Field AppCompatBackgroundHelper mBackgroundTintHelper>
	//    5   11:invokevirtual   #347 <Method ColorStateList AppCompatBackgroundHelper.getSupportBackgroundTintList()>
	//    6   14:areturn         
		else
			return null;
	//    7   15:aconst_null     
	//    8   16:areturn         
	}

	public android.graphics.PorterDuff.Mode getSupportBackgroundTintMode()
	{
		if(mBackgroundTintHelper != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #103 <Field AppCompatBackgroundHelper mBackgroundTintHelper>
	//*   2    4:ifnull          15
			return mBackgroundTintHelper.getSupportBackgroundTintMode();
	//    3    7:aload_0         
	//    4    8:getfield        #103 <Field AppCompatBackgroundHelper mBackgroundTintHelper>
	//    5   11:invokevirtual   #352 <Method android.graphics.PorterDuff$Mode AppCompatBackgroundHelper.getSupportBackgroundTintMode()>
	//    6   14:areturn         
		else
			return null;
	//    7   15:aconst_null     
	//    8   16:areturn         
	}

	protected void onDetachedFromWindow()
	{
		super.onDetachedFromWindow();
	//    0    0:aload_0         
	//    1    1:invokespecial   #355 <Method void Spinner.onDetachedFromWindow()>
		if(mPopup != null && mPopup.isShowing())
	//*   2    4:aload_0         
	//*   3    5:getfield        #169 <Field AppCompatSpinner$DropdownPopup mPopup>
	//*   4    8:ifnull          28
	//*   5   11:aload_0         
	//*   6   12:getfield        #169 <Field AppCompatSpinner$DropdownPopup mPopup>
	//*   7   15:invokevirtual   #359 <Method boolean AppCompatSpinner$DropdownPopup.isShowing()>
	//*   8   18:ifeq            28
			mPopup.dismiss();
	//    9   21:aload_0         
	//   10   22:getfield        #169 <Field AppCompatSpinner$DropdownPopup mPopup>
	//   11   25:invokevirtual   #362 <Method void AppCompatSpinner$DropdownPopup.dismiss()>
	//   12   28:return          
	}

	protected void onMeasure(int i, int j)
	{
		super.onMeasure(i, j);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:iload_2         
	//    3    3:invokespecial   #365 <Method void Spinner.onMeasure(int, int)>
		if(mPopup != null && android.view.View.MeasureSpec.getMode(i) == 0x80000000)
	//*   4    6:aload_0         
	//*   5    7:getfield        #169 <Field AppCompatSpinner$DropdownPopup mPopup>
	//*   6   10:ifnull          57
	//*   7   13:iload_1         
	//*   8   14:invokestatic    #368 <Method int android.view.View$MeasureSpec.getMode(int)>
	//*   9   17:ldc2            #369 <Int 0x80000000>
	//*  10   20:icmpne          57
			setMeasuredDimension(Math.min(Math.max(getMeasuredWidth(), compatMeasureContentWidth(getAdapter(), getBackground())), android.view.View.MeasureSpec.getSize(i)), getMeasuredHeight());
	//   11   23:aload_0         
	//   12   24:aload_0         
	//   13   25:invokevirtual   #236 <Method int getMeasuredWidth()>
	//   14   28:aload_0         
	//   15   29:aload_0         
	//   16   30:invokevirtual   #373 <Method SpinnerAdapter getAdapter()>
	//   17   33:aload_0         
	//   18   34:invokevirtual   #374 <Method Drawable getBackground()>
	//   19   37:invokevirtual   #376 <Method int compatMeasureContentWidth(SpinnerAdapter, Drawable)>
	//   20   40:invokestatic    #252 <Method int Math.max(int, int)>
	//   21   43:iload_1         
	//   22   44:invokestatic    #379 <Method int android.view.View$MeasureSpec.getSize(int)>
	//   23   47:invokestatic    #260 <Method int Math.min(int, int)>
	//   24   50:aload_0         
	//   25   51:invokevirtual   #244 <Method int getMeasuredHeight()>
	//   26   54:invokevirtual   #382 <Method void setMeasuredDimension(int, int)>
	//   27   57:return          
	}

	public boolean onTouchEvent(MotionEvent motionevent)
	{
		if(mForwardingListener != null && mForwardingListener.onTouch(((View) (this)), motionevent))
	//*   0    0:aload_0         
	//*   1    1:getfield        #174 <Field ForwardingListener mForwardingListener>
	//*   2    4:ifnull          21
	//*   3    7:aload_0         
	//*   4    8:getfield        #174 <Field ForwardingListener mForwardingListener>
	//*   5   11:aload_0         
	//*   6   12:aload_1         
	//*   7   13:invokevirtual   #390 <Method boolean ForwardingListener.onTouch(View, MotionEvent)>
	//*   8   16:ifeq            21
			return true;
	//    9   19:iconst_1        
	//   10   20:ireturn         
		else
			return super.onTouchEvent(motionevent);
	//   11   21:aload_0         
	//   12   22:aload_1         
	//   13   23:invokespecial   #392 <Method boolean Spinner.onTouchEvent(MotionEvent)>
	//   14   26:ireturn         
	}

	public boolean performClick()
	{
		if(mPopup != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #169 <Field AppCompatSpinner$DropdownPopup mPopup>
	//*   2    4:ifnull          26
		{
			if(!mPopup.isShowing())
	//*   3    7:aload_0         
	//*   4    8:getfield        #169 <Field AppCompatSpinner$DropdownPopup mPopup>
	//*   5   11:invokevirtual   #359 <Method boolean AppCompatSpinner$DropdownPopup.isShowing()>
	//*   6   14:ifne            24
				mPopup.show();
	//    7   17:aload_0         
	//    8   18:getfield        #169 <Field AppCompatSpinner$DropdownPopup mPopup>
	//    9   21:invokevirtual   #396 <Method void AppCompatSpinner$DropdownPopup.show()>
			return true;
	//   10   24:iconst_1        
	//   11   25:ireturn         
		} else
		{
			return super.performClick();
	//   12   26:aload_0         
	//   13   27:invokespecial   #398 <Method boolean Spinner.performClick()>
	//   14   30:ireturn         
		}
	}

	public volatile void setAdapter(Adapter adapter)
	{
		setAdapter((SpinnerAdapter)adapter);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:checkcast       #254 <Class SpinnerAdapter>
	//    3    5:invokevirtual   #200 <Method void setAdapter(SpinnerAdapter)>
	//    4    8:return          
	}

	public void setAdapter(SpinnerAdapter spinneradapter)
	{
		if(!mPopupSet)
	//*   0    0:aload_0         
	//*   1    1:getfield        #202 <Field boolean mPopupSet>
	//*   2    4:ifne            13
		{
			mTempAdapter = spinneradapter;
	//    3    7:aload_0         
	//    4    8:aload_1         
	//    5    9:putfield        #204 <Field SpinnerAdapter mTempAdapter>
		} else
	//*   6   12:return          
		{
			super.setAdapter(spinneradapter);
	//    7   13:aload_0         
	//    8   14:aload_1         
	//    9   15:invokespecial   #400 <Method void Spinner.setAdapter(SpinnerAdapter)>
			if(mPopup != null)
	//*  10   18:aload_0         
	//*  11   19:getfield        #169 <Field AppCompatSpinner$DropdownPopup mPopup>
	//*  12   22:ifnull          12
			{
				Context context;
				if(mPopupContext == null)
	//*  13   25:aload_0         
	//*  14   26:getfield        #110 <Field Context mPopupContext>
	//*  15   29:ifnonnull       57
					context = getContext();
	//   16   32:aload_0         
	//   17   33:invokevirtual   #403 <Method Context getContext()>
	//   18   36:astore_2        
				else
	//*  19   37:aload_0         
	//*  20   38:getfield        #169 <Field AppCompatSpinner$DropdownPopup mPopup>
	//*  21   41:new             #10  <Class AppCompatSpinner$DropDownAdapter>
	//*  22   44:dup             
	//*  23   45:aload_1         
	//*  24   46:aload_2         
	//*  25   47:invokevirtual   #407 <Method android.content.res.Resources$Theme Context.getTheme()>
	//*  26   50:invokespecial   #410 <Method void AppCompatSpinner$DropDownAdapter(SpinnerAdapter, android.content.res.Resources$Theme)>
	//*  27   53:invokevirtual   #413 <Method void AppCompatSpinner$DropdownPopup.setAdapter(ListAdapter)>
	//*  28   56:return          
					context = mPopupContext;
	//   29   57:aload_0         
	//   30   58:getfield        #110 <Field Context mPopupContext>
	//   31   61:astore_2        
				mPopup.setAdapter(((ListAdapter) (new DropDownAdapter(spinneradapter, context.getTheme()))));
				return;
			}
		}
	//*  32   62:goto            37
	}

	public void setBackgroundDrawable(Drawable drawable)
	{
		super.setBackgroundDrawable(drawable);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #414 <Method void Spinner.setBackgroundDrawable(Drawable)>
		if(mBackgroundTintHelper != null)
	//*   3    5:aload_0         
	//*   4    6:getfield        #103 <Field AppCompatBackgroundHelper mBackgroundTintHelper>
	//*   5    9:ifnull          20
			mBackgroundTintHelper.onSetBackgroundDrawable(drawable);
	//    6   12:aload_0         
	//    7   13:getfield        #103 <Field AppCompatBackgroundHelper mBackgroundTintHelper>
	//    8   16:aload_1         
	//    9   17:invokevirtual   #417 <Method void AppCompatBackgroundHelper.onSetBackgroundDrawable(Drawable)>
	//   10   20:return          
	}

	public void setBackgroundResource(int i)
	{
		super.setBackgroundResource(i);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokespecial   #421 <Method void Spinner.setBackgroundResource(int)>
		if(mBackgroundTintHelper != null)
	//*   3    5:aload_0         
	//*   4    6:getfield        #103 <Field AppCompatBackgroundHelper mBackgroundTintHelper>
	//*   5    9:ifnull          20
			mBackgroundTintHelper.onSetBackgroundResource(i);
	//    6   12:aload_0         
	//    7   13:getfield        #103 <Field AppCompatBackgroundHelper mBackgroundTintHelper>
	//    8   16:iload_1         
	//    9   17:invokevirtual   #424 <Method void AppCompatBackgroundHelper.onSetBackgroundResource(int)>
	//   10   20:return          
	}

	public void setDropDownHorizontalOffset(int i)
	{
		if(mPopup != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #169 <Field AppCompatSpinner$DropdownPopup mPopup>
	//*   2    4:ifnull          16
			mPopup.setHorizontalOffset(i);
	//    3    7:aload_0         
	//    4    8:getfield        #169 <Field AppCompatSpinner$DropdownPopup mPopup>
	//    5   11:iload_1         
	//    6   12:invokevirtual   #429 <Method void AppCompatSpinner$DropdownPopup.setHorizontalOffset(int)>
		else
	//*   7   15:return          
		if(android.os.Build.VERSION.SDK_INT >= 16)
	//*   8   16:getstatic       #115 <Field int android.os.Build$VERSION.SDK_INT>
	//*   9   19:bipush          16
	//*  10   21:icmplt          15
		{
			super.setDropDownHorizontalOffset(i);
	//   11   24:aload_0         
	//   12   25:iload_1         
	//   13   26:invokespecial   #431 <Method void Spinner.setDropDownHorizontalOffset(int)>
			return;
	//   14   29:return          
		}
	}

	public void setDropDownVerticalOffset(int i)
	{
		if(mPopup != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #169 <Field AppCompatSpinner$DropdownPopup mPopup>
	//*   2    4:ifnull          16
			mPopup.setVerticalOffset(i);
	//    3    7:aload_0         
	//    4    8:getfield        #169 <Field AppCompatSpinner$DropdownPopup mPopup>
	//    5   11:iload_1         
	//    6   12:invokevirtual   #435 <Method void AppCompatSpinner$DropdownPopup.setVerticalOffset(int)>
		else
	//*   7   15:return          
		if(android.os.Build.VERSION.SDK_INT >= 16)
	//*   8   16:getstatic       #115 <Field int android.os.Build$VERSION.SDK_INT>
	//*   9   19:bipush          16
	//*  10   21:icmplt          15
		{
			super.setDropDownVerticalOffset(i);
	//   11   24:aload_0         
	//   12   25:iload_1         
	//   13   26:invokespecial   #437 <Method void Spinner.setDropDownVerticalOffset(int)>
			return;
	//   14   29:return          
		}
	}

	public void setDropDownWidth(int i)
	{
		if(mPopup != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #169 <Field AppCompatSpinner$DropdownPopup mPopup>
	//*   2    4:ifnull          13
			mDropDownWidth = i;
	//    3    7:aload_0         
	//    4    8:iload_1         
	//    5    9:putfield        #144 <Field int mDropDownWidth>
		else
	//*   6   12:return          
		if(android.os.Build.VERSION.SDK_INT >= 16)
	//*   7   13:getstatic       #115 <Field int android.os.Build$VERSION.SDK_INT>
	//*   8   16:bipush          16
	//*   9   18:icmplt          12
		{
			super.setDropDownWidth(i);
	//   10   21:aload_0         
	//   11   22:iload_1         
	//   12   23:invokespecial   #440 <Method void Spinner.setDropDownWidth(int)>
			return;
	//   13   26:return          
		}
	}

	public void setPopupBackgroundDrawable(Drawable drawable)
	{
		if(mPopup != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #169 <Field AppCompatSpinner$DropdownPopup mPopup>
	//*   2    4:ifnull          16
			mPopup.setBackgroundDrawable(drawable);
	//    3    7:aload_0         
	//    4    8:getfield        #169 <Field AppCompatSpinner$DropdownPopup mPopup>
	//    5   11:aload_1         
	//    6   12:invokevirtual   #155 <Method void AppCompatSpinner$DropdownPopup.setBackgroundDrawable(Drawable)>
		else
	//*   7   15:return          
		if(android.os.Build.VERSION.SDK_INT >= 16)
	//*   8   16:getstatic       #115 <Field int android.os.Build$VERSION.SDK_INT>
	//*   9   19:bipush          16
	//*  10   21:icmplt          15
		{
			super.setPopupBackgroundDrawable(drawable);
	//   11   24:aload_0         
	//   12   25:aload_1         
	//   13   26:invokespecial   #443 <Method void Spinner.setPopupBackgroundDrawable(Drawable)>
			return;
	//   14   29:return          
		}
	}

	public void setPopupBackgroundResource(int i)
	{
		setPopupBackgroundDrawable(AppCompatResources.getDrawable(getPopupContext(), i));
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:invokevirtual   #445 <Method Context getPopupContext()>
	//    3    5:iload_1         
	//    4    6:invokestatic    #450 <Method Drawable AppCompatResources.getDrawable(Context, int)>
	//    5    9:invokevirtual   #451 <Method void setPopupBackgroundDrawable(Drawable)>
	//    6   12:return          
	}

	public void setPrompt(CharSequence charsequence)
	{
		if(mPopup != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #169 <Field AppCompatSpinner$DropdownPopup mPopup>
	//*   2    4:ifnull          16
		{
			mPopup.setPromptText(charsequence);
	//    3    7:aload_0         
	//    4    8:getfield        #169 <Field AppCompatSpinner$DropdownPopup mPopup>
	//    5   11:aload_1         
	//    6   12:invokevirtual   #166 <Method void AppCompatSpinner$DropdownPopup.setPromptText(CharSequence)>
			return;
	//    7   15:return          
		} else
		{
			super.setPrompt(charsequence);
	//    8   16:aload_0         
	//    9   17:aload_1         
	//   10   18:invokespecial   #454 <Method void Spinner.setPrompt(CharSequence)>
			return;
	//   11   21:return          
		}
	}

	public void setSupportBackgroundTintList(ColorStateList colorstatelist)
	{
		if(mBackgroundTintHelper != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #103 <Field AppCompatBackgroundHelper mBackgroundTintHelper>
	//*   2    4:ifnull          15
			mBackgroundTintHelper.setSupportBackgroundTintList(colorstatelist);
	//    3    7:aload_0         
	//    4    8:getfield        #103 <Field AppCompatBackgroundHelper mBackgroundTintHelper>
	//    5   11:aload_1         
	//    6   12:invokevirtual   #458 <Method void AppCompatBackgroundHelper.setSupportBackgroundTintList(ColorStateList)>
	//    7   15:return          
	}

	public void setSupportBackgroundTintMode(android.graphics.PorterDuff.Mode mode)
	{
		if(mBackgroundTintHelper != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #103 <Field AppCompatBackgroundHelper mBackgroundTintHelper>
	//*   2    4:ifnull          15
			mBackgroundTintHelper.setSupportBackgroundTintMode(mode);
	//    3    7:aload_0         
	//    4    8:getfield        #103 <Field AppCompatBackgroundHelper mBackgroundTintHelper>
	//    5   11:aload_1         
	//    6   12:invokevirtual   #462 <Method void AppCompatBackgroundHelper.setSupportBackgroundTintMode(android.graphics.PorterDuff$Mode)>
	//    7   15:return          
	}

	private static final int ATTRS_ANDROID_SPINNERMODE[] = {
		0x10102f1
	};
	private static final int MAX_ITEMS_MEASURED = 15;
	private static final int MODE_DIALOG = 0;
	private static final int MODE_DROPDOWN = 1;
	private static final int MODE_THEME = -1;
	private static final String TAG = "AppCompatSpinner";
	private final AppCompatBackgroundHelper mBackgroundTintHelper;
	private int mDropDownWidth;
	private ForwardingListener mForwardingListener;
	private DropdownPopup mPopup;
	private final Context mPopupContext;
	private final boolean mPopupSet;
	private SpinnerAdapter mTempAdapter;
	private final Rect mTempRect;

	static 
	{
	//    0    0:iconst_1        
	//    1    1:newarray        int[]
	//    2    3:dup             
	//    3    4:iconst_0        
	//    4    5:ldc1            #53  <Int 0x10102f1>
	//    5    7:iastore         
	//    6    8:putstatic       #55  <Field int[] ATTRS_ANDROID_SPINNERMODE>
	//*   7   11:return          
	}


/*
	static DropdownPopup access$000(AppCompatSpinner appcompatspinner)
	{
		return appcompatspinner.mPopup;
	//    0    0:aload_0         
	//    1    1:getfield        #169 <Field AppCompatSpinner$DropdownPopup mPopup>
	//    2    4:areturn         
	}

*/


/*
	static Rect access$100(AppCompatSpinner appcompatspinner)
	{
		return appcompatspinner.mTempRect;
	//    0    0:aload_0         
	//    1    1:getfield        #85  <Field Rect mTempRect>
	//    2    4:areturn         
	}

*/


/*
	static int access$200(AppCompatSpinner appcompatspinner)
	{
		return appcompatspinner.mDropDownWidth;
	//    0    0:aload_0         
	//    1    1:getfield        #144 <Field int mDropDownWidth>
	//    2    4:ireturn         
	}

*/

	// Unreferenced inner class android/support/v7/widget/AppCompatSpinner$DropdownPopup$1

/* anonymous class */
	class DropdownPopup._cls1
		implements android.widget.AdapterView.OnItemClickListener
	{

		public void onItemClick(AdapterView adapterview, View view, int i, long l)
		{
			setSelection(i);
		//    0    0:aload_0         
		//    1    1:getfield        #21  <Field AppCompatSpinner$DropdownPopup this$1>
		//    2    4:getfield        #32  <Field AppCompatSpinner AppCompatSpinner$DropdownPopup.this$0>
		//    3    7:iload_3         
		//    4    8:invokevirtual   #36  <Method void AppCompatSpinner.setSelection(int)>
			if(getOnItemClickListener() != null)
		//*   5   11:aload_0         
		//*   6   12:getfield        #21  <Field AppCompatSpinner$DropdownPopup this$1>
		//*   7   15:getfield        #32  <Field AppCompatSpinner AppCompatSpinner$DropdownPopup.this$0>
		//*   8   18:invokevirtual   #40  <Method android.widget.AdapterView$OnItemClickListener AppCompatSpinner.getOnItemClickListener()>
		//*   9   21:ifnull          50
				performItemClick(view, i, mAdapter.getItemId(i));
		//   10   24:aload_0         
		//   11   25:getfield        #21  <Field AppCompatSpinner$DropdownPopup this$1>
		//   12   28:getfield        #32  <Field AppCompatSpinner AppCompatSpinner$DropdownPopup.this$0>
		//   13   31:aload_2         
		//   14   32:iload_3         
		//   15   33:aload_0         
		//   16   34:getfield        #21  <Field AppCompatSpinner$DropdownPopup this$1>
		//   17   37:getfield        #44  <Field ListAdapter AppCompatSpinner$DropdownPopup.mAdapter>
		//   18   40:iload_3         
		//   19   41:invokeinterface #50  <Method long ListAdapter.getItemId(int)>
		//   20   46:invokevirtual   #54  <Method boolean AppCompatSpinner.performItemClick(View, int, long)>
		//   21   49:pop             
			dismiss();
		//   22   50:aload_0         
		//   23   51:getfield        #21  <Field AppCompatSpinner$DropdownPopup this$1>
		//   24   54:invokevirtual   #57  <Method void AppCompatSpinner$DropdownPopup.dismiss()>
		//   25   57:return          
		}

		final DropdownPopup this$1;
		final AppCompatSpinner val$this$0;

			
			{
				this$1 = final_dropdownpopup;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #21  <Field AppCompatSpinner$DropdownPopup this$1>
				this$0 = AppCompatSpinner.this;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #23  <Field AppCompatSpinner val$this$0>
				super();
			//    6   10:aload_0         
			//    7   11:invokespecial   #26  <Method void Object()>
			//    8   14:return          
			}
	}

}
