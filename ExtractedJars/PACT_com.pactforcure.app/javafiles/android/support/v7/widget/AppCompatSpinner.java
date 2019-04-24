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
		//    2    4:astore          8
			int i = 0;
		//    3    6:iconst_0        
		//    4    7:istore_1        
			int i1;
			int j1;
			int k1;
			if(drawable != null)
		//*   5    8:aload           8
		//*   6   10:ifnull          216
			{
				drawable.getPadding(mTempRect);
		//    7   13:aload           8
		//    8   15:aload_0         
		//    9   16:getfield        #25  <Field AppCompatSpinner this$0>
		//   10   19:invokestatic    #69  <Method Rect AppCompatSpinner.access$100(AppCompatSpinner)>
		//   11   22:invokevirtual   #75  <Method boolean Drawable.getPadding(Rect)>
		//   12   25:pop             
				int j;
				int k;
				int l;
				if(ViewUtils.isLayoutRtl(((View) (AppCompatSpinner.this))))
		//*  13   26:aload_0         
		//*  14   27:getfield        #25  <Field AppCompatSpinner this$0>
		//*  15   30:invokestatic    #81  <Method boolean ViewUtils.isLayoutRtl(View)>
		//*  16   33:ifeq            201
					i = mTempRect.right;
		//   17   36:aload_0         
		//   18   37:getfield        #25  <Field AppCompatSpinner this$0>
		//   19   40:invokestatic    #69  <Method Rect AppCompatSpinner.access$100(AppCompatSpinner)>
		//   20   43:getfield        #85  <Field int Rect.right>
		//   21   46:istore_1        
				else
		//*  22   47:aload_0         
		//*  23   48:getfield        #25  <Field AppCompatSpinner this$0>
		//*  24   51:invokevirtual   #89  <Method int AppCompatSpinner.getPaddingLeft()>
		//*  25   54:istore          5
		//*  26   56:aload_0         
		//*  27   57:getfield        #25  <Field AppCompatSpinner this$0>
		//*  28   60:invokevirtual   #92  <Method int AppCompatSpinner.getPaddingRight()>
		//*  29   63:istore          6
		//*  30   65:aload_0         
		//*  31   66:getfield        #25  <Field AppCompatSpinner this$0>
		//*  32   69:invokevirtual   #95  <Method int AppCompatSpinner.getWidth()>
		//*  33   72:istore          7
		//*  34   74:aload_0         
		//*  35   75:getfield        #25  <Field AppCompatSpinner this$0>
		//*  36   78:invokestatic    #99  <Method int AppCompatSpinner.access$200(AppCompatSpinner)>
		//*  37   81:bipush          -2
		//*  38   83:icmpne          245
		//*  39   86:aload_0         
		//*  40   87:getfield        #25  <Field AppCompatSpinner this$0>
		//*  41   90:aload_0         
		//*  42   91:getfield        #101 <Field ListAdapter mAdapter>
		//*  43   94:checkcast       #103 <Class SpinnerAdapter>
		//*  44   97:aload_0         
		//*  45   98:invokevirtual   #65  <Method Drawable getBackground()>
		//*  46  101:invokevirtual   #107 <Method int AppCompatSpinner.compatMeasureContentWidth(SpinnerAdapter, Drawable)>
		//*  47  104:istore_3        
		//*  48  105:aload_0         
		//*  49  106:getfield        #25  <Field AppCompatSpinner this$0>
		//*  50  109:invokevirtual   #111 <Method Context AppCompatSpinner.getContext()>
		//*  51  112:invokevirtual   #117 <Method Resources Context.getResources()>
		//*  52  115:invokevirtual   #123 <Method DisplayMetrics Resources.getDisplayMetrics()>
		//*  53  118:getfield        #128 <Field int DisplayMetrics.widthPixels>
		//*  54  121:aload_0         
		//*  55  122:getfield        #25  <Field AppCompatSpinner this$0>
		//*  56  125:invokestatic    #69  <Method Rect AppCompatSpinner.access$100(AppCompatSpinner)>
		//*  57  128:getfield        #131 <Field int Rect.left>
		//*  58  131:isub            
		//*  59  132:aload_0         
		//*  60  133:getfield        #25  <Field AppCompatSpinner this$0>
		//*  61  136:invokestatic    #69  <Method Rect AppCompatSpinner.access$100(AppCompatSpinner)>
		//*  62  139:getfield        #85  <Field int Rect.right>
		//*  63  142:isub            
		//*  64  143:istore          4
		//*  65  145:iload_3         
		//*  66  146:istore_2        
		//*  67  147:iload_3         
		//*  68  148:iload           4
		//*  69  150:icmple          156
		//*  70  153:iload           4
		//*  71  155:istore_2        
		//*  72  156:aload_0         
		//*  73  157:iload_2         
		//*  74  158:iload           7
		//*  75  160:iload           5
		//*  76  162:isub            
		//*  77  163:iload           6
		//*  78  165:isub            
		//*  79  166:invokestatic    #137 <Method int Math.max(int, int)>
		//*  80  169:invokevirtual   #140 <Method void setContentWidth(int)>
		//*  81  172:aload_0         
		//*  82  173:getfield        #25  <Field AppCompatSpinner this$0>
		//*  83  176:invokestatic    #81  <Method boolean ViewUtils.isLayoutRtl(View)>
		//*  84  179:ifeq            285
		//*  85  182:iload_1         
		//*  86  183:iload           7
		//*  87  185:iload           6
		//*  88  187:isub            
		//*  89  188:aload_0         
		//*  90  189:invokevirtual   #141 <Method int getWidth()>
		//*  91  192:isub            
		//*  92  193:iadd            
		//*  93  194:istore_1        
		//*  94  195:aload_0         
		//*  95  196:iload_1         
		//*  96  197:invokevirtual   #144 <Method void setHorizontalOffset(int)>
		//*  97  200:return          
					i = -mTempRect.left;
		//   98  201:aload_0         
		//   99  202:getfield        #25  <Field AppCompatSpinner this$0>
		//  100  205:invokestatic    #69  <Method Rect AppCompatSpinner.access$100(AppCompatSpinner)>
		//  101  208:getfield        #131 <Field int Rect.left>
		//  102  211:ineg            
		//  103  212:istore_1        
			} else
		//* 104  213:goto            47
			{
				Rect rect = mTempRect;
		//  105  216:aload_0         
		//  106  217:getfield        #25  <Field AppCompatSpinner this$0>
		//  107  220:invokestatic    #69  <Method Rect AppCompatSpinner.access$100(AppCompatSpinner)>
		//  108  223:astore          8
				mTempRect.right = 0;
		//  109  225:aload_0         
		//  110  226:getfield        #25  <Field AppCompatSpinner this$0>
		//  111  229:invokestatic    #69  <Method Rect AppCompatSpinner.access$100(AppCompatSpinner)>
		//  112  232:iconst_0        
		//  113  233:putfield        #85  <Field int Rect.right>
				rect.left = 0;
		//  114  236:aload           8
		//  115  238:iconst_0        
		//  116  239:putfield        #131 <Field int Rect.left>
			}
			i1 = getPaddingLeft();
			j1 = getPaddingRight();
			k1 = getWidth();
			if(mDropDownWidth == -2)
			{
				k = compatMeasureContentWidth((SpinnerAdapter)mAdapter, getBackground());
				l = getContext().getResources().getDisplayMetrics().widthPixels - mTempRect.left - mTempRect.right;
				j = k;
				if(k > l)
					j = l;
				setContentWidth(Math.max(j, k1 - i1 - j1));
			} else
		//* 117  242:goto            47
			if(mDropDownWidth == -1)
		//* 118  245:aload_0         
		//* 119  246:getfield        #25  <Field AppCompatSpinner this$0>
		//* 120  249:invokestatic    #99  <Method int AppCompatSpinner.access$200(AppCompatSpinner)>
		//* 121  252:iconst_m1       
		//* 122  253:icmpne          271
				setContentWidth(k1 - i1 - j1);
		//  123  256:aload_0         
		//  124  257:iload           7
		//  125  259:iload           5
		//  126  261:isub            
		//  127  262:iload           6
		//  128  264:isub            
		//  129  265:invokevirtual   #140 <Method void setContentWidth(int)>
			else
		//* 130  268:goto            172
				setContentWidth(mDropDownWidth);
		//  131  271:aload_0         
		//  132  272:aload_0         
		//  133  273:getfield        #25  <Field AppCompatSpinner this$0>
		//  134  276:invokestatic    #99  <Method int AppCompatSpinner.access$200(AppCompatSpinner)>
		//  135  279:invokevirtual   #140 <Method void setContentWidth(int)>
			if(ViewUtils.isLayoutRtl(((View) (AppCompatSpinner.this))))
				i += k1 - j1 - getWidth();
			else
		//* 136  282:goto            172
				i += i1;
		//  137  285:iload_1         
		//  138  286:iload           5
		//  139  288:iadd            
		//  140  289:istore_1        
			setHorizontalOffset(i);
		//* 141  290:goto            195
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
		TypedArray typedarray;
		if(theme != null)
	//*  23   42:aload           5
	//*  24   44:ifnull          343
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
	//*  34   65:ifnull          263
	//*  35   68:iload           4
	//*  36   70:istore          7
	//*  37   72:iload           4
	//*  38   74:iconst_m1       
	//*  39   75:icmpne          160
	//*  40   78:getstatic       #115 <Field int android.os.Build$VERSION.SDK_INT>
	//*  41   81:bipush          11
	//*  42   83:icmplt          452
	//*  43   86:aconst_null     
	//*  44   87:astore          8
	//*  45   89:aconst_null     
	//*  46   90:astore          5
	//*  47   92:aload_1         
	//*  48   93:aload_2         
	//*  49   94:getstatic       #55  <Field int[] ATTRS_ANDROID_SPINNERMODE>
	//*  50   97:iload_3         
	//*  51   98:iconst_0        
	//*  52   99:invokevirtual   #120 <Method TypedArray Context.obtainStyledAttributes(AttributeSet, int[], int, int)>
	//*  53  102:astore          9
	//*  54  104:iload           4
	//*  55  106:istore          6
	//*  56  108:aload           9
	//*  57  110:astore          5
	//*  58  112:aload           9
	//*  59  114:astore          8
	//*  60  116:aload           9
	//*  61  118:iconst_0        
	//*  62  119:invokevirtual   #126 <Method boolean TypedArray.hasValue(int)>
	//*  63  122:ifeq            142
	//*  64  125:aload           9
	//*  65  127:astore          5
	//*  66  129:aload           9
	//*  67  131:astore          8
	//*  68  133:aload           9
	//*  69  135:iconst_0        
	//*  70  136:iconst_0        
	//*  71  137:invokevirtual   #130 <Method int TypedArray.getInt(int, int)>
	//*  72  140:istore          6
	//*  73  142:iload           6
	//*  74  144:istore          7
	//*  75  146:aload           9
	//*  76  148:ifnull          160
	//*  77  151:aload           9
	//*  78  153:invokevirtual   #133 <Method void TypedArray.recycle()>
	//*  79  156:iload           6
	//*  80  158:istore          7
	//*  81  160:iload           7
	//*  82  162:iconst_1        
	//*  83  163:icmpne          263
	//*  84  166:new             #13  <Class AppCompatSpinner$DropdownPopup>
	//*  85  169:dup             
	//*  86  170:aload_0         
	//*  87  171:aload_0         
	//*  88  172:getfield        #110 <Field Context mPopupContext>
	//*  89  175:aload_2         
	//*  90  176:iload_3         
	//*  91  177:invokespecial   #136 <Method void AppCompatSpinner$DropdownPopup(AppCompatSpinner, Context, AttributeSet, int)>
	//*  92  180:astore          5
	//*  93  182:aload_0         
	//*  94  183:getfield        #110 <Field Context mPopupContext>
	//*  95  186:aload_2         
	//*  96  187:getstatic       #90  <Field int[] android.support.v7.appcompat.R$styleable.Spinner>
	//*  97  190:iload_3         
	//*  98  191:iconst_0        
	//*  99  192:invokestatic    #96  <Method TintTypedArray TintTypedArray.obtainStyledAttributes(Context, AttributeSet, int[], int, int)>
	//* 100  195:astore          8
	//* 101  197:aload_0         
	//* 102  198:aload           8
	//* 103  200:getstatic       #139 <Field int android.support.v7.appcompat.R$styleable.Spinner_android_dropDownWidth>
	//* 104  203:bipush          -2
	//* 105  205:invokevirtual   #142 <Method int TintTypedArray.getLayoutDimension(int, int)>
	//* 106  208:putfield        #144 <Field int mDropDownWidth>
	//* 107  211:aload           5
	//* 108  213:aload           8
	//* 109  215:getstatic       #147 <Field int android.support.v7.appcompat.R$styleable.Spinner_android_popupBackground>
	//* 110  218:invokevirtual   #151 <Method Drawable TintTypedArray.getDrawable(int)>
	//* 111  221:invokevirtual   #155 <Method void AppCompatSpinner$DropdownPopup.setBackgroundDrawable(Drawable)>
	//* 112  224:aload           5
	//* 113  226:aload           10
	//* 114  228:getstatic       #158 <Field int android.support.v7.appcompat.R$styleable.Spinner_android_prompt>
	//* 115  231:invokevirtual   #162 <Method String TintTypedArray.getString(int)>
	//* 116  234:invokevirtual   #166 <Method void AppCompatSpinner$DropdownPopup.setPromptText(CharSequence)>
	//* 117  237:aload           8
	//* 118  239:invokevirtual   #167 <Method void TintTypedArray.recycle()>
	//* 119  242:aload_0         
	//* 120  243:aload           5
	//* 121  245:putfield        #169 <Field AppCompatSpinner$DropdownPopup mPopup>
	//* 122  248:aload_0         
	//* 123  249:new             #8   <Class AppCompatSpinner$1>
	//* 124  252:dup             
	//* 125  253:aload_0         
	//* 126  254:aload_0         
	//* 127  255:aload           5
	//* 128  257:invokespecial   #172 <Method void AppCompatSpinner$1(AppCompatSpinner, View, AppCompatSpinner$DropdownPopup)>
	//* 129  260:putfield        #174 <Field ForwardingListener mForwardingListener>
	//* 130  263:aload           10
	//* 131  265:getstatic       #177 <Field int android.support.v7.appcompat.R$styleable.Spinner_android_entries>
	//* 132  268:invokevirtual   #181 <Method CharSequence[] TintTypedArray.getTextArray(int)>
	//* 133  271:astore          5
	//* 134  273:aload           5
	//* 135  275:ifnull          303
	//* 136  278:new             #183 <Class ArrayAdapter>
	//* 137  281:dup             
	//* 138  282:aload_1         
	//* 139  283:ldc1            #184 <Int 0x1090008>
	//* 140  285:aload           5
	//* 141  287:invokespecial   #187 <Method void ArrayAdapter(Context, int, Object[])>
	//* 142  290:astore_1        
	//* 143  291:aload_1         
	//* 144  292:getstatic       #192 <Field int android.support.v7.appcompat.R$layout.support_simple_spinner_dropdown_item>
	//* 145  295:invokevirtual   #196 <Method void ArrayAdapter.setDropDownViewResource(int)>
	//* 146  298:aload_0         
	//* 147  299:aload_1         
	//* 148  300:invokevirtual   #200 <Method void setAdapter(SpinnerAdapter)>
	//* 149  303:aload           10
	//* 150  305:invokevirtual   #167 <Method void TintTypedArray.recycle()>
	//* 151  308:aload_0         
	//* 152  309:iconst_1        
	//* 153  310:putfield        #202 <Field boolean mPopupSet>
	//* 154  313:aload_0         
	//* 155  314:getfield        #204 <Field SpinnerAdapter mTempAdapter>
	//* 156  317:ifnull          333
	//* 157  320:aload_0         
	//* 158  321:aload_0         
	//* 159  322:getfield        #204 <Field SpinnerAdapter mTempAdapter>
	//* 160  325:invokevirtual   #200 <Method void setAdapter(SpinnerAdapter)>
	//* 161  328:aload_0         
	//* 162  329:aconst_null     
	//* 163  330:putfield        #204 <Field SpinnerAdapter mTempAdapter>
	//* 164  333:aload_0         
	//* 165  334:getfield        #103 <Field AppCompatBackgroundHelper mBackgroundTintHelper>
	//* 166  337:aload_2         
	//* 167  338:iload_3         
	//* 168  339:invokevirtual   #208 <Method void AppCompatBackgroundHelper.loadFromAttributes(AttributeSet, int)>
	//* 169  342:return          
		{
			int l = tinttypedarray.getResourceId(android.support.v7.appcompat.R.styleable.Spinner_popupTheme, 0);
	//  170  343:aload           10
	//  171  345:getstatic       #211 <Field int android.support.v7.appcompat.R$styleable.Spinner_popupTheme>
	//  172  348:iconst_0        
	//  173  349:invokevirtual   #214 <Method int TintTypedArray.getResourceId(int, int)>
	//  174  352:istore          6
			if(l != 0)
	//* 175  354:iload           6
	//* 176  356:ifeq            376
			{
				mPopupContext = ((Context) (new ContextThemeWrapper(context, l)));
	//  177  359:aload_0         
	//  178  360:new             #105 <Class ContextThemeWrapper>
	//  179  363:dup             
	//  180  364:aload_1         
	//  181  365:iload           6
	//  182  367:invokespecial   #216 <Method void ContextThemeWrapper(Context, int)>
	//  183  370:putfield        #110 <Field Context mPopupContext>
			} else
	//* 184  373:goto            61
			{
				if(android.os.Build.VERSION.SDK_INT < 23)
	//* 185  376:getstatic       #115 <Field int android.os.Build$VERSION.SDK_INT>
	//* 186  379:bipush          23
	//* 187  381:icmpge          396
					theme = ((android.content.res.Resources.Theme) (context));
	//  188  384:aload_1         
	//  189  385:astore          5
				else
	//* 190  387:aload_0         
	//* 191  388:aload           5
	//* 192  390:putfield        #110 <Field Context mPopupContext>
	//* 193  393:goto            61
					theme = null;
	//  194  396:aconst_null     
	//  195  397:astore          5
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
		obj = null;
		theme = null;
		typedarray = context.obtainStyledAttributes(attributeset, ATTRS_ANDROID_SPINNERMODE, i, 0);
		k = j;
		theme = ((android.content.res.Resources.Theme) (typedarray));
		obj = ((Object) (typedarray));
		if(!typedarray.hasValue(0))
			break MISSING_BLOCK_LABEL_142;
		theme = ((android.content.res.Resources.Theme) (typedarray));
		obj = ((Object) (typedarray));
		k = typedarray.getInt(0, 0);
		i1 = k;
		if(typedarray != null)
		{
			typedarray.recycle();
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
	//* 196  399:goto            387
		Exception exception;
		exception;
	//  197  402:astore          9
		obj = ((Object) (theme));
	//  198  404:aload           5
	//  199  406:astore          8
		Log.i("AppCompatSpinner", "Could not read android:spinnerMode", ((Throwable) (exception)));
	//  200  408:ldc1            #35  <String "AppCompatSpinner">
	//  201  410:ldc1            #218 <String "Could not read android:spinnerMode">
	//  202  412:aload           9
	//  203  414:invokestatic    #224 <Method int Log.i(String, String, Throwable)>
	//  204  417:pop             
		i1 = j;
	//  205  418:iload           4
	//  206  420:istore          7
		if(theme != null)
	//* 207  422:aload           5
	//* 208  424:ifnull          160
		{
			((TypedArray) (theme)).recycle();
	//  209  427:aload           5
	//  210  429:invokevirtual   #133 <Method void TypedArray.recycle()>
			i1 = j;
	//  211  432:iload           4
	//  212  434:istore          7
		}
		continue; /* Loop/switch isn't completed */
	//  213  436:goto            160
		context;
	//  214  439:astore_1        
		if(obj != null)
	//* 215  440:aload           8
	//* 216  442:ifnull          450
			((TypedArray) (obj)).recycle();
	//  217  445:aload           8
	//  218  447:invokevirtual   #133 <Method void TypedArray.recycle()>
		throw context;
	//  219  450:aload_1         
	//  220  451:athrow          
_L6:
		i1 = 1;
	//  221  452:iconst_1        
	//  222  453:istore          7
		if(true) goto _L4; else goto _L7
	//  223  455:goto            160
_L7:
	}

	int compatMeasureContentWidth(SpinnerAdapter spinneradapter, Drawable drawable)
	{
		int j;
		if(spinneradapter == null)
	//*   0    0:aload_1         
	//*   1    1:ifnonnull       10
		{
			j = 0;
	//    2    4:iconst_0        
	//    3    5:istore          4
		} else
	//*   4    7:iload           4
	//*   5    9:ireturn         
		{
			int i = 0;
	//    6   10:iconst_0        
	//    7   11:istore_3        
			View view = null;
	//    8   12:aconst_null     
	//    9   13:astore          11
			int k = 0;
	//   10   15:iconst_0        
	//   11   16:istore          5
			int j1 = android.view.View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 0);
	//   12   18:aload_0         
	//   13   19:invokevirtual   #236 <Method int getMeasuredWidth()>
	//   14   22:iconst_0        
	//   15   23:invokestatic    #241 <Method int android.view.View$MeasureSpec.makeMeasureSpec(int, int)>
	//   16   26:istore          8
			int k1 = android.view.View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 0);
	//   17   28:aload_0         
	//   18   29:invokevirtual   #244 <Method int getMeasuredHeight()>
	//   19   32:iconst_0        
	//   20   33:invokestatic    #241 <Method int android.view.View$MeasureSpec.makeMeasureSpec(int, int)>
	//   21   36:istore          9
			j = Math.max(0, getSelectedItemPosition());
	//   22   38:iconst_0        
	//   23   39:aload_0         
	//   24   40:invokevirtual   #247 <Method int getSelectedItemPosition()>
	//   25   43:invokestatic    #252 <Method int Math.max(int, int)>
	//   26   46:istore          4
			int l1 = Math.min(spinneradapter.getCount(), j + 15);
	//   27   48:aload_1         
	//   28   49:invokeinterface #257 <Method int SpinnerAdapter.getCount()>
	//   29   54:iload           4
	//   30   56:bipush          15
	//   31   58:iadd            
	//   32   59:invokestatic    #260 <Method int Math.min(int, int)>
	//   33   62:istore          10
			for(j = Math.max(0, j - (15 - (l1 - j))); j < l1;)
	//*  34   64:iconst_0        
	//*  35   65:iload           4
	//*  36   67:bipush          15
	//*  37   69:iload           10
	//*  38   71:iload           4
	//*  39   73:isub            
	//*  40   74:isub            
	//*  41   75:isub            
	//*  42   76:invokestatic    #252 <Method int Math.max(int, int)>
	//*  43   79:istore          4
	//*  44   81:iload           4
	//*  45   83:iload           10
	//*  46   85:icmpge          185
			{
				int i1 = spinneradapter.getItemViewType(j);
	//   47   88:aload_1         
	//   48   89:iload           4
	//   49   91:invokeinterface #264 <Method int SpinnerAdapter.getItemViewType(int)>
	//   50   96:istore          7
				int l = k;
	//   51   98:iload           5
	//   52  100:istore          6
				if(i1 != k)
	//*  53  102:iload           7
	//*  54  104:iload           5
	//*  55  106:icmpeq          116
				{
					l = i1;
	//   56  109:iload           7
	//   57  111:istore          6
					view = null;
	//   58  113:aconst_null     
	//   59  114:astore          11
				}
				view = spinneradapter.getView(j, view, ((ViewGroup) (this)));
	//   60  116:aload_1         
	//   61  117:iload           4
	//   62  119:aload           11
	//   63  121:aload_0         
	//   64  122:invokeinterface #268 <Method View SpinnerAdapter.getView(int, View, ViewGroup)>
	//   65  127:astore          11
				if(view.getLayoutParams() == null)
	//*  66  129:aload           11
	//*  67  131:invokevirtual   #274 <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//*  68  134:ifnonnull       153
					view.setLayoutParams(new android.view.ViewGroup.LayoutParams(-2, -2));
	//   69  137:aload           11
	//   70  139:new             #276 <Class android.view.ViewGroup$LayoutParams>
	//   71  142:dup             
	//   72  143:bipush          -2
	//   73  145:bipush          -2
	//   74  147:invokespecial   #279 <Method void android.view.ViewGroup$LayoutParams(int, int)>
	//   75  150:invokevirtual   #283 <Method void View.setLayoutParams(android.view.ViewGroup$LayoutParams)>
				view.measure(j1, k1);
	//   76  153:aload           11
	//   77  155:iload           8
	//   78  157:iload           9
	//   79  159:invokevirtual   #286 <Method void View.measure(int, int)>
				i = Math.max(i, view.getMeasuredWidth());
	//   80  162:iload_3         
	//   81  163:aload           11
	//   82  165:invokevirtual   #287 <Method int View.getMeasuredWidth()>
	//   83  168:invokestatic    #252 <Method int Math.max(int, int)>
	//   84  171:istore_3        
				j++;
	//   85  172:iload           4
	//   86  174:iconst_1        
	//   87  175:iadd            
	//   88  176:istore          4
				k = l;
	//   89  178:iload           6
	//   90  180:istore          5
			}

	//*  91  182:goto            81
			j = i;
	//   92  185:iload_3         
	//   93  186:istore          4
			if(drawable != null)
	//*  94  188:aload_2         
	//*  95  189:ifnull          7
			{
				drawable.getPadding(mTempRect);
	//   96  192:aload_2         
	//   97  193:aload_0         
	//   98  194:getfield        #85  <Field Rect mTempRect>
	//   99  197:invokevirtual   #293 <Method boolean Drawable.getPadding(Rect)>
	//  100  200:pop             
				return i + (mTempRect.left + mTempRect.right);
	//  101  201:iload_3         
	//  102  202:aload_0         
	//  103  203:getfield        #85  <Field Rect mTempRect>
	//  104  206:getfield        #296 <Field int Rect.left>
	//  105  209:aload_0         
	//  106  210:getfield        #85  <Field Rect mTempRect>
	//  107  213:getfield        #299 <Field int Rect.right>
	//  108  216:iadd            
	//  109  217:iadd            
	//  110  218:ireturn         
			}
		}
		return j;
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
