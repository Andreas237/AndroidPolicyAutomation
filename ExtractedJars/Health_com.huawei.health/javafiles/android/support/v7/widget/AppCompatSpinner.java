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
	static class DropDownAdapter
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
		//*  13   25:ifnull          94
			{
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
					return;
		//   30   65:return          
				}
				if(spinneradapter instanceof android.support.v7.widget.ThemedSpinnerAdapter)
		//*  31   66:aload_1         
		//*  32   67:instanceof      #43  <Class android.support.v7.widget.ThemedSpinnerAdapter>
		//*  33   70:ifeq            94
				{
					spinneradapter = ((SpinnerAdapter) ((android.support.v7.widget.ThemedSpinnerAdapter)spinneradapter));
		//   34   73:aload_1         
		//   35   74:checkcast       #43  <Class android.support.v7.widget.ThemedSpinnerAdapter>
		//   36   77:astore_1        
					if(((android.support.v7.widget.ThemedSpinnerAdapter) (spinneradapter)).getDropDownViewTheme() == null)
		//*  37   78:aload_1         
		//*  38   79:invokeinterface #44  <Method android.content.res.Resources$Theme ThemedSpinnerAdapter.getDropDownViewTheme()>
		//*  39   84:ifnonnull       94
						((android.support.v7.widget.ThemedSpinnerAdapter) (spinneradapter)).setDropDownViewTheme(theme);
		//   40   87:aload_1         
		//   41   88:aload_2         
		//   42   89:invokeinterface #45  <Method void ThemedSpinnerAdapter.setDropDownViewTheme(android.content.res.Resources$Theme)>
				}
			}
		//   43   94:return          
		}
	}

	class DropdownPopup extends ListPopupWindow
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
			if(drawable != null)
		//*   5    8:aload           8
		//*   6   10:ifnull          65
			{
				drawable.getPadding(mTempRect);
		//    7   13:aload           8
		//    8   15:aload_0         
		//    9   16:getfield        #25  <Field AppCompatSpinner this$0>
		//   10   19:getfield        #68  <Field Rect AppCompatSpinner.mTempRect>
		//   11   22:invokevirtual   #74  <Method boolean Drawable.getPadding(Rect)>
		//   12   25:pop             
				if(ViewUtils.isLayoutRtl(((View) (AppCompatSpinner.this))))
		//*  13   26:aload_0         
		//*  14   27:getfield        #25  <Field AppCompatSpinner this$0>
		//*  15   30:invokestatic    #80  <Method boolean ViewUtils.isLayoutRtl(View)>
		//*  16   33:ifeq            50
					i = mTempRect.right;
		//   17   36:aload_0         
		//   18   37:getfield        #25  <Field AppCompatSpinner this$0>
		//   19   40:getfield        #68  <Field Rect AppCompatSpinner.mTempRect>
		//   20   43:getfield        #84  <Field int Rect.right>
		//   21   46:istore_1        
				else
		//*  22   47:goto            62
					i = -mTempRect.left;
		//   23   50:aload_0         
		//   24   51:getfield        #25  <Field AppCompatSpinner this$0>
		//   25   54:getfield        #68  <Field Rect AppCompatSpinner.mTempRect>
		//   26   57:getfield        #87  <Field int Rect.left>
		//   27   60:ineg            
		//   28   61:istore_1        
			} else
		//*  29   62:goto            91
			{
				Rect rect = mTempRect;
		//   30   65:aload_0         
		//   31   66:getfield        #25  <Field AppCompatSpinner this$0>
		//   32   69:getfield        #68  <Field Rect AppCompatSpinner.mTempRect>
		//   33   72:astore          8
				mTempRect.right = 0;
		//   34   74:aload_0         
		//   35   75:getfield        #25  <Field AppCompatSpinner this$0>
		//   36   78:getfield        #68  <Field Rect AppCompatSpinner.mTempRect>
		//   37   81:iconst_0        
		//   38   82:putfield        #84  <Field int Rect.right>
				rect.left = 0;
		//   39   85:aload           8
		//   40   87:iconst_0        
		//   41   88:putfield        #87  <Field int Rect.left>
			}
			int i1 = getPaddingLeft();
		//   42   91:aload_0         
		//   43   92:getfield        #25  <Field AppCompatSpinner this$0>
		//   44   95:invokevirtual   #91  <Method int AppCompatSpinner.getPaddingLeft()>
		//   45   98:istore          5
			int j1 = getPaddingRight();
		//   46  100:aload_0         
		//   47  101:getfield        #25  <Field AppCompatSpinner this$0>
		//   48  104:invokevirtual   #94  <Method int AppCompatSpinner.getPaddingRight()>
		//   49  107:istore          6
			int k1 = getWidth();
		//   50  109:aload_0         
		//   51  110:getfield        #25  <Field AppCompatSpinner this$0>
		//   52  113:invokevirtual   #97  <Method int AppCompatSpinner.getWidth()>
		//   53  116:istore          7
			if(mDropDownWidth == -2)
		//*  54  118:aload_0         
		//*  55  119:getfield        #25  <Field AppCompatSpinner this$0>
		//*  56  122:getfield        #100 <Field int AppCompatSpinner.mDropDownWidth>
		//*  57  125:bipush          -2
		//*  58  127:icmpne          219
			{
				int k = compatMeasureContentWidth((SpinnerAdapter)mAdapter, getBackground());
		//   59  130:aload_0         
		//   60  131:getfield        #25  <Field AppCompatSpinner this$0>
		//   61  134:aload_0         
		//   62  135:getfield        #102 <Field ListAdapter mAdapter>
		//   63  138:checkcast       #104 <Class SpinnerAdapter>
		//   64  141:aload_0         
		//   65  142:invokevirtual   #65  <Method Drawable getBackground()>
		//   66  145:invokevirtual   #108 <Method int AppCompatSpinner.compatMeasureContentWidth(SpinnerAdapter, Drawable)>
		//   67  148:istore_3        
				int l = getContext().getResources().getDisplayMetrics().widthPixels - mTempRect.left - mTempRect.right;
		//   68  149:aload_0         
		//   69  150:getfield        #25  <Field AppCompatSpinner this$0>
		//   70  153:invokevirtual   #112 <Method Context AppCompatSpinner.getContext()>
		//   71  156:invokevirtual   #118 <Method Resources Context.getResources()>
		//   72  159:invokevirtual   #124 <Method DisplayMetrics Resources.getDisplayMetrics()>
		//   73  162:getfield        #129 <Field int DisplayMetrics.widthPixels>
		//   74  165:aload_0         
		//   75  166:getfield        #25  <Field AppCompatSpinner this$0>
		//   76  169:getfield        #68  <Field Rect AppCompatSpinner.mTempRect>
		//   77  172:getfield        #87  <Field int Rect.left>
		//   78  175:isub            
		//   79  176:aload_0         
		//   80  177:getfield        #25  <Field AppCompatSpinner this$0>
		//   81  180:getfield        #68  <Field Rect AppCompatSpinner.mTempRect>
		//   82  183:getfield        #84  <Field int Rect.right>
		//   83  186:isub            
		//   84  187:istore          4
				int j = k;
		//   85  189:iload_3         
		//   86  190:istore_2        
				if(k > l)
		//*  87  191:iload_3         
		//*  88  192:iload           4
		//*  89  194:icmple          200
					j = l;
		//   90  197:iload           4
		//   91  199:istore_2        
				setContentWidth(Math.max(j, k1 - i1 - j1));
		//   92  200:aload_0         
		//   93  201:iload_2         
		//   94  202:iload           7
		//   95  204:iload           5
		//   96  206:isub            
		//   97  207:iload           6
		//   98  209:isub            
		//   99  210:invokestatic    #135 <Method int Math.max(int, int)>
		//  100  213:invokevirtual   #138 <Method void setContentWidth(int)>
			} else
		//* 101  216:goto            256
			if(mDropDownWidth == -1)
		//* 102  219:aload_0         
		//* 103  220:getfield        #25  <Field AppCompatSpinner this$0>
		//* 104  223:getfield        #100 <Field int AppCompatSpinner.mDropDownWidth>
		//* 105  226:iconst_m1       
		//* 106  227:icmpne          245
				setContentWidth(k1 - i1 - j1);
		//  107  230:aload_0         
		//  108  231:iload           7
		//  109  233:iload           5
		//  110  235:isub            
		//  111  236:iload           6
		//  112  238:isub            
		//  113  239:invokevirtual   #138 <Method void setContentWidth(int)>
			else
		//* 114  242:goto            256
				setContentWidth(mDropDownWidth);
		//  115  245:aload_0         
		//  116  246:aload_0         
		//  117  247:getfield        #25  <Field AppCompatSpinner this$0>
		//  118  250:getfield        #100 <Field int AppCompatSpinner.mDropDownWidth>
		//  119  253:invokevirtual   #138 <Method void setContentWidth(int)>
			if(ViewUtils.isLayoutRtl(((View) (AppCompatSpinner.this))))
		//* 120  256:aload_0         
		//* 121  257:getfield        #25  <Field AppCompatSpinner this$0>
		//* 122  260:invokestatic    #80  <Method boolean ViewUtils.isLayoutRtl(View)>
		//* 123  263:ifeq            282
				i += k1 - j1 - getWidth();
		//  124  266:iload_1         
		//  125  267:iload           7
		//  126  269:iload           6
		//  127  271:isub            
		//  128  272:aload_0         
		//  129  273:invokevirtual   #139 <Method int getWidth()>
		//  130  276:isub            
		//  131  277:iadd            
		//  132  278:istore_1        
			else
		//* 133  279:goto            287
				i += i1;
		//  134  282:iload_1         
		//  135  283:iload           5
		//  136  285:iadd            
		//  137  286:istore_1        
			setHorizontalOffset(i);
		//  138  287:aload_0         
		//  139  288:iload_1         
		//  140  289:invokevirtual   #142 <Method void setHorizontalOffset(int)>
		//  141  292:return          
		}

		public CharSequence getHintText()
		{
			return mHintText;
		//    0    0:aload_0         
		//    1    1:getfield        #146 <Field CharSequence mHintText>
		//    2    4:areturn         
		}

		boolean isVisibleToUser(View view)
		{
			return ViewCompat.isAttachedToWindow(view) && view.getGlobalVisibleRect(mVisibleRect);
		//    0    0:aload_1         
		//    1    1:invokestatic    #152 <Method boolean ViewCompat.isAttachedToWindow(View)>
		//    2    4:ifeq            20
		//    3    7:aload_1         
		//    4    8:aload_0         
		//    5    9:getfield        #35  <Field Rect mVisibleRect>
		//    6   12:invokevirtual   #157 <Method boolean View.getGlobalVisibleRect(Rect)>
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
		//    2    2:invokespecial   #161 <Method void ListPopupWindow.setAdapter(ListAdapter)>
			mAdapter = listadapter;
		//    3    5:aload_0         
		//    4    6:aload_1         
		//    5    7:putfield        #102 <Field ListAdapter mAdapter>
		//    6   10:return          
		}

		public void setPromptText(CharSequence charsequence)
		{
			mHintText = charsequence;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #146 <Field CharSequence mHintText>
		//    3    5:return          
		}

		public void show()
		{
			boolean flag = isShowing();
		//    0    0:aload_0         
		//    1    1:invokevirtual   #167 <Method boolean isShowing()>
		//    2    4:istore_1        
			computeContentWidth();
		//    3    5:aload_0         
		//    4    6:invokevirtual   #169 <Method void computeContentWidth()>
			setInputMethodMode(2);
		//    5    9:aload_0         
		//    6   10:iconst_2        
		//    7   11:invokevirtual   #172 <Method void setInputMethodMode(int)>
			super.show();
		//    8   14:aload_0         
		//    9   15:invokespecial   #60  <Method void ListPopupWindow.show()>
			getListView().setChoiceMode(1);
		//   10   18:aload_0         
		//   11   19:invokevirtual   #176 <Method ListView getListView()>
		//   12   22:iconst_1        
		//   13   23:invokevirtual   #181 <Method void ListView.setChoiceMode(int)>
			setSelection(getSelectedItemPosition());
		//   14   26:aload_0         
		//   15   27:aload_0         
		//   16   28:getfield        #25  <Field AppCompatSpinner this$0>
		//   17   31:invokevirtual   #184 <Method int AppCompatSpinner.getSelectedItemPosition()>
		//   18   34:invokevirtual   #187 <Method void setSelection(int)>
			if(flag)
		//*  19   37:iload_1         
		//*  20   38:ifeq            42
				return;
		//   21   41:return          
			ViewTreeObserver viewtreeobserver = getViewTreeObserver();
		//   22   42:aload_0         
		//   23   43:getfield        #25  <Field AppCompatSpinner this$0>
		//   24   46:invokevirtual   #191 <Method ViewTreeObserver AppCompatSpinner.getViewTreeObserver()>
		//   25   49:astore_2        
			if(viewtreeobserver != null)
		//*  26   50:aload_2         
		//*  27   51:ifnull          81
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
					//   16   36:invokestatic    #41  <Method void AppCompatSpinner$DropdownPopup.access$001(AppCompatSpinner$DropdownPopup)>
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
		//   31   59:invokespecial   #193 <Method void AppCompatSpinner$DropdownPopup$2(AppCompatSpinner$DropdownPopup)>
		//   32   62:astore_3        
				viewtreeobserver.addOnGlobalLayoutListener(ongloballayoutlistener);
		//   33   63:aload_2         
		//   34   64:aload_3         
		//   35   65:invokevirtual   #199 <Method void ViewTreeObserver.addOnGlobalLayoutListener(android.view.ViewTreeObserver$OnGlobalLayoutListener)>
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
		//   41   75:invokespecial   #202 <Method void AppCompatSpinner$DropdownPopup$3(AppCompatSpinner$DropdownPopup, android.view.ViewTreeObserver$OnGlobalLayoutListener)>
		//   42   78:invokevirtual   #206 <Method void setOnDismissListener(android.widget.PopupWindow$OnDismissListener)>
			}
		//   43   81:return          
		}

		ListAdapter mAdapter;
		private CharSequence mHintText;
		private final Rect mVisibleRect = new Rect();
		final AppCompatSpinner this$0;


/*
		static void access$001(DropdownPopup dropdownpopup)
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
		TintTypedArray tinttypedarray1;
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
		tinttypedarray1 = TintTypedArray.obtainStyledAttributes(context, attributeset, android.support.v7.appcompat.R.styleable.Spinner, i, 0);
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
		if(theme != null)
	//*  23   42:aload           5
	//*  24   44:ifnull          64
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
	//*  32   61:goto            120
		{
			int k = tinttypedarray1.getResourceId(android.support.v7.appcompat.R.styleable.Spinner_popupTheme, 0);
	//   33   64:aload           10
	//   34   66:getstatic       #113 <Field int android.support.v7.appcompat.R$styleable.Spinner_popupTheme>
	//   35   69:iconst_0        
	//   36   70:invokevirtual   #117 <Method int TintTypedArray.getResourceId(int, int)>
	//   37   73:istore          6
			if(k != 0)
	//*  38   75:iload           6
	//*  39   77:ifeq            97
			{
				mPopupContext = ((Context) (new ContextThemeWrapper(context, k)));
	//   40   80:aload_0         
	//   41   81:new             #105 <Class ContextThemeWrapper>
	//   42   84:dup             
	//   43   85:aload_1         
	//   44   86:iload           6
	//   45   88:invokespecial   #119 <Method void ContextThemeWrapper(Context, int)>
	//   46   91:putfield        #110 <Field Context mPopupContext>
			} else
	//*  47   94:goto            120
			{
				if(android.os.Build.VERSION.SDK_INT < 23)
	//*  48   97:getstatic       #124 <Field int android.os.Build$VERSION.SDK_INT>
	//*  49  100:bipush          23
	//*  50  102:icmpge          111
					theme = ((android.content.res.Resources.Theme) (context));
	//   51  105:aload_1         
	//   52  106:astore          5
				else
	//*  53  108:goto            114
					theme = null;
	//   54  111:aconst_null     
	//   55  112:astore          5
				mPopupContext = ((Context) (theme));
	//   56  114:aload_0         
	//   57  115:aload           5
	//   58  117:putfield        #110 <Field Context mPopupContext>
			}
		}
		if(mPopupContext == null)
			break MISSING_BLOCK_LABEL_381;
	//   59  120:aload_0         
	//   60  121:getfield        #110 <Field Context mPopupContext>
	//   61  124:ifnull          381
		i1 = j;
	//   62  127:iload           4
	//   63  129:istore          7
		if(j != -1)
			break MISSING_BLOCK_LABEL_278;
	//   64  131:iload           4
	//   65  133:iconst_m1       
	//   66  134:icmpne          278
		if(android.os.Build.VERSION.SDK_INT < 11)
			break MISSING_BLOCK_LABEL_275;
	//   67  137:getstatic       #124 <Field int android.os.Build$VERSION.SDK_INT>
	//   68  140:bipush          11
	//   69  142:icmplt          275
		obj = null;
	//   70  145:aconst_null     
	//   71  146:astore          8
		theme = null;
	//   72  148:aconst_null     
	//   73  149:astore          5
		TypedArray typedarray = context.obtainStyledAttributes(attributeset, ATTRS_ANDROID_SPINNERMODE, i, 0);
	//   74  151:aload_1         
	//   75  152:aload_2         
	//   76  153:getstatic       #55  <Field int[] ATTRS_ANDROID_SPINNERMODE>
	//   77  156:iload_3         
	//   78  157:iconst_0        
	//   79  158:invokevirtual   #129 <Method TypedArray Context.obtainStyledAttributes(AttributeSet, int[], int, int)>
	//   80  161:astore          9
		int l;
		l = j;
	//   81  163:iload           4
	//   82  165:istore          6
		theme = ((android.content.res.Resources.Theme) (typedarray));
	//   83  167:aload           9
	//   84  169:astore          5
		obj = ((Object) (typedarray));
	//   85  171:aload           9
	//   86  173:astore          8
		if(!typedarray.hasValue(0))
			break MISSING_BLOCK_LABEL_201;
	//   87  175:aload           9
	//   88  177:iconst_0        
	//   89  178:invokevirtual   #135 <Method boolean TypedArray.hasValue(int)>
	//   90  181:ifeq            201
		theme = ((android.content.res.Resources.Theme) (typedarray));
	//   91  184:aload           9
	//   92  186:astore          5
		obj = ((Object) (typedarray));
	//   93  188:aload           9
	//   94  190:astore          8
		l = typedarray.getInt(0, 0);
	//   95  192:aload           9
	//   96  194:iconst_0        
	//   97  195:iconst_0        
	//   98  196:invokevirtual   #138 <Method int TypedArray.getInt(int, int)>
	//   99  199:istore          6
		i1 = l;
	//  100  201:iload           6
	//  101  203:istore          7
		if(typedarray != null)
	//* 102  205:aload           9
	//* 103  207:ifnull          272
		{
			typedarray.recycle();
	//  104  210:aload           9
	//  105  212:invokevirtual   #141 <Method void TypedArray.recycle()>
			i1 = l;
	//  106  215:iload           6
	//  107  217:istore          7
		}
		break MISSING_BLOCK_LABEL_278;
	//  108  219:goto            272
		Exception exception;
		exception;
	//  109  222:astore          9
		obj = ((Object) (theme));
	//  110  224:aload           5
	//  111  226:astore          8
		Log.i("AppCompatSpinner", "Could not read android:spinnerMode", ((Throwable) (exception)));
	//  112  228:ldc1            #35  <String "AppCompatSpinner">
	//  113  230:ldc1            #143 <String "Could not read android:spinnerMode">
	//  114  232:aload           9
	//  115  234:invokestatic    #149 <Method int Log.i(String, String, Throwable)>
	//  116  237:pop             
		i1 = j;
	//  117  238:iload           4
	//  118  240:istore          7
		if(theme != null)
	//* 119  242:aload           5
	//* 120  244:ifnull          272
		{
			((TypedArray) (theme)).recycle();
	//  121  247:aload           5
	//  122  249:invokevirtual   #141 <Method void TypedArray.recycle()>
			i1 = j;
	//  123  252:iload           4
	//  124  254:istore          7
		}
		break MISSING_BLOCK_LABEL_278;
	//  125  256:goto            272
		context;
	//  126  259:astore_1        
		if(obj != null)
	//* 127  260:aload           8
	//* 128  262:ifnull          270
			((TypedArray) (obj)).recycle();
	//  129  265:aload           8
	//  130  267:invokevirtual   #141 <Method void TypedArray.recycle()>
		throw context;
	//  131  270:aload_1         
	//  132  271:athrow          
	//* 133  272:goto            278
		i1 = 1;
	//  134  275:iconst_1        
	//  135  276:istore          7
		if(i1 == 1)
	//* 136  278:iload           7
	//* 137  280:iconst_1        
	//* 138  281:icmpne          381
		{
			theme = ((android.content.res.Resources.Theme) (new DropdownPopup(mPopupContext, attributeset, i)));
	//  139  284:new             #13  <Class AppCompatSpinner$DropdownPopup>
	//  140  287:dup             
	//  141  288:aload_0         
	//  142  289:aload_0         
	//  143  290:getfield        #110 <Field Context mPopupContext>
	//  144  293:aload_2         
	//  145  294:iload_3         
	//  146  295:invokespecial   #152 <Method void AppCompatSpinner$DropdownPopup(AppCompatSpinner, Context, AttributeSet, int)>
	//  147  298:astore          5
			TintTypedArray tinttypedarray = TintTypedArray.obtainStyledAttributes(mPopupContext, attributeset, android.support.v7.appcompat.R.styleable.Spinner, i, 0);
	//  148  300:aload_0         
	//  149  301:getfield        #110 <Field Context mPopupContext>
	//  150  304:aload_2         
	//  151  305:getstatic       #90  <Field int[] android.support.v7.appcompat.R$styleable.Spinner>
	//  152  308:iload_3         
	//  153  309:iconst_0        
	//  154  310:invokestatic    #96  <Method TintTypedArray TintTypedArray.obtainStyledAttributes(Context, AttributeSet, int[], int, int)>
	//  155  313:astore          8
			mDropDownWidth = tinttypedarray.getLayoutDimension(android.support.v7.appcompat.R.styleable.Spinner_android_dropDownWidth, -2);
	//  156  315:aload_0         
	//  157  316:aload           8
	//  158  318:getstatic       #155 <Field int android.support.v7.appcompat.R$styleable.Spinner_android_dropDownWidth>
	//  159  321:bipush          -2
	//  160  323:invokevirtual   #158 <Method int TintTypedArray.getLayoutDimension(int, int)>
	//  161  326:putfield        #160 <Field int mDropDownWidth>
			((DropdownPopup) (theme)).setBackgroundDrawable(tinttypedarray.getDrawable(android.support.v7.appcompat.R.styleable.Spinner_android_popupBackground));
	//  162  329:aload           5
	//  163  331:aload           8
	//  164  333:getstatic       #163 <Field int android.support.v7.appcompat.R$styleable.Spinner_android_popupBackground>
	//  165  336:invokevirtual   #167 <Method Drawable TintTypedArray.getDrawable(int)>
	//  166  339:invokevirtual   #171 <Method void AppCompatSpinner$DropdownPopup.setBackgroundDrawable(Drawable)>
			((DropdownPopup) (theme)).setPromptText(((CharSequence) (tinttypedarray1.getString(android.support.v7.appcompat.R.styleable.Spinner_android_prompt))));
	//  167  342:aload           5
	//  168  344:aload           10
	//  169  346:getstatic       #174 <Field int android.support.v7.appcompat.R$styleable.Spinner_android_prompt>
	//  170  349:invokevirtual   #178 <Method String TintTypedArray.getString(int)>
	//  171  352:invokevirtual   #182 <Method void AppCompatSpinner$DropdownPopup.setPromptText(CharSequence)>
			tinttypedarray.recycle();
	//  172  355:aload           8
	//  173  357:invokevirtual   #183 <Method void TintTypedArray.recycle()>
			mPopup = ((DropdownPopup) (theme));
	//  174  360:aload_0         
	//  175  361:aload           5
	//  176  363:putfield        #185 <Field AppCompatSpinner$DropdownPopup mPopup>
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
				//*   2    4:getfield        #29  <Field AppCompatSpinner$DropdownPopup AppCompatSpinner.mPopup>
				//*   3    7:invokevirtual   #34  <Method boolean AppCompatSpinner$DropdownPopup.isShowing()>
				//*   4   10:ifne            23
						mPopup.show();
				//    5   13:aload_0         
				//    6   14:getfield        #16  <Field AppCompatSpinner this$0>
				//    7   17:getfield        #29  <Field AppCompatSpinner$DropdownPopup AppCompatSpinner.mPopup>
				//    8   20:invokevirtual   #38  <Method void AppCompatSpinner$DropdownPopup.show()>
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
	//  177  366:aload_0         
	//  178  367:new             #8   <Class AppCompatSpinner$1>
	//  179  370:dup             
	//  180  371:aload_0         
	//  181  372:aload_0         
	//  182  373:aload           5
	//  183  375:invokespecial   #188 <Method void AppCompatSpinner$1(AppCompatSpinner, View, AppCompatSpinner$DropdownPopup)>
	//  184  378:putfield        #190 <Field ForwardingListener mForwardingListener>
		}
		theme = ((android.content.res.Resources.Theme) (tinttypedarray1.getTextArray(android.support.v7.appcompat.R.styleable.Spinner_android_entries)));
	//  185  381:aload           10
	//  186  383:getstatic       #193 <Field int android.support.v7.appcompat.R$styleable.Spinner_android_entries>
	//  187  386:invokevirtual   #197 <Method CharSequence[] TintTypedArray.getTextArray(int)>
	//  188  389:astore          5
		if(theme != null)
	//* 189  391:aload           5
	//* 190  393:ifnull          421
		{
			context = ((Context) (new ArrayAdapter(context, 0x1090008, ((Object []) (theme)))));
	//  191  396:new             #199 <Class ArrayAdapter>
	//  192  399:dup             
	//  193  400:aload_1         
	//  194  401:ldc1            #200 <Int 0x1090008>
	//  195  403:aload           5
	//  196  405:invokespecial   #203 <Method void ArrayAdapter(Context, int, Object[])>
	//  197  408:astore_1        
			((ArrayAdapter) (context)).setDropDownViewResource(android.support.v7.appcompat.R.layout.support_simple_spinner_dropdown_item);
	//  198  409:aload_1         
	//  199  410:getstatic       #208 <Field int android.support.v7.appcompat.R$layout.support_simple_spinner_dropdown_item>
	//  200  413:invokevirtual   #212 <Method void ArrayAdapter.setDropDownViewResource(int)>
			setAdapter(((SpinnerAdapter) (context)));
	//  201  416:aload_0         
	//  202  417:aload_1         
	//  203  418:invokevirtual   #216 <Method void setAdapter(SpinnerAdapter)>
		}
		tinttypedarray1.recycle();
	//  204  421:aload           10
	//  205  423:invokevirtual   #183 <Method void TintTypedArray.recycle()>
		mPopupSet = true;
	//  206  426:aload_0         
	//  207  427:iconst_1        
	//  208  428:putfield        #218 <Field boolean mPopupSet>
		if(mTempAdapter != null)
	//* 209  431:aload_0         
	//* 210  432:getfield        #220 <Field SpinnerAdapter mTempAdapter>
	//* 211  435:ifnull          451
		{
			setAdapter(mTempAdapter);
	//  212  438:aload_0         
	//  213  439:aload_0         
	//  214  440:getfield        #220 <Field SpinnerAdapter mTempAdapter>
	//  215  443:invokevirtual   #216 <Method void setAdapter(SpinnerAdapter)>
			mTempAdapter = null;
	//  216  446:aload_0         
	//  217  447:aconst_null     
	//  218  448:putfield        #220 <Field SpinnerAdapter mTempAdapter>
		}
		mBackgroundTintHelper.loadFromAttributes(attributeset, i);
	//  219  451:aload_0         
	//  220  452:getfield        #103 <Field AppCompatBackgroundHelper mBackgroundTintHelper>
	//  221  455:aload_2         
	//  222  456:iload_3         
	//  223  457:invokevirtual   #224 <Method void AppCompatBackgroundHelper.loadFromAttributes(AttributeSet, int)>
		return;
	//  224  460:return          
	}

	int compatMeasureContentWidth(SpinnerAdapter spinneradapter, Drawable drawable)
	{
		if(spinneradapter == null)
	//*   0    0:aload_1         
	//*   1    1:ifnonnull       6
			return 0;
	//    2    4:iconst_0        
	//    3    5:ireturn         
		int i = 0;
	//    4    6:iconst_0        
	//    5    7:istore_3        
		View view = null;
	//    6    8:aconst_null     
	//    7    9:astore          11
		int k = 0;
	//    8   11:iconst_0        
	//    9   12:istore          5
		int j1 = android.view.View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 0);
	//   10   14:aload_0         
	//   11   15:invokevirtual   #230 <Method int getMeasuredWidth()>
	//   12   18:iconst_0        
	//   13   19:invokestatic    #235 <Method int android.view.View$MeasureSpec.makeMeasureSpec(int, int)>
	//   14   22:istore          8
		int k1 = android.view.View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 0);
	//   15   24:aload_0         
	//   16   25:invokevirtual   #238 <Method int getMeasuredHeight()>
	//   17   28:iconst_0        
	//   18   29:invokestatic    #235 <Method int android.view.View$MeasureSpec.makeMeasureSpec(int, int)>
	//   19   32:istore          9
		int j = Math.max(0, getSelectedItemPosition());
	//   20   34:iconst_0        
	//   21   35:aload_0         
	//   22   36:invokevirtual   #241 <Method int getSelectedItemPosition()>
	//   23   39:invokestatic    #246 <Method int Math.max(int, int)>
	//   24   42:istore          4
		int l1 = Math.min(spinneradapter.getCount(), j + 15);
	//   25   44:aload_1         
	//   26   45:invokeinterface #251 <Method int SpinnerAdapter.getCount()>
	//   27   50:iload           4
	//   28   52:bipush          15
	//   29   54:iadd            
	//   30   55:invokestatic    #254 <Method int Math.min(int, int)>
	//   31   58:istore          10
		for(j = Math.max(0, j - (15 - (l1 - j))); j < l1;)
	//*  32   60:iconst_0        
	//*  33   61:iload           4
	//*  34   63:bipush          15
	//*  35   65:iload           10
	//*  36   67:iload           4
	//*  37   69:isub            
	//*  38   70:isub            
	//*  39   71:isub            
	//*  40   72:invokestatic    #246 <Method int Math.max(int, int)>
	//*  41   75:istore          4
	//*  42   77:iload           4
	//*  43   79:iload           10
	//*  44   81:icmpge          181
		{
			int i1 = spinneradapter.getItemViewType(j);
	//   45   84:aload_1         
	//   46   85:iload           4
	//   47   87:invokeinterface #258 <Method int SpinnerAdapter.getItemViewType(int)>
	//   48   92:istore          7
			int l = k;
	//   49   94:iload           5
	//   50   96:istore          6
			if(i1 != k)
	//*  51   98:iload           7
	//*  52  100:iload           5
	//*  53  102:icmpeq          112
			{
				l = i1;
	//   54  105:iload           7
	//   55  107:istore          6
				view = null;
	//   56  109:aconst_null     
	//   57  110:astore          11
			}
			view = spinneradapter.getView(j, view, ((ViewGroup) (this)));
	//   58  112:aload_1         
	//   59  113:iload           4
	//   60  115:aload           11
	//   61  117:aload_0         
	//   62  118:invokeinterface #262 <Method View SpinnerAdapter.getView(int, View, ViewGroup)>
	//   63  123:astore          11
			if(view.getLayoutParams() == null)
	//*  64  125:aload           11
	//*  65  127:invokevirtual   #268 <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//*  66  130:ifnonnull       149
				view.setLayoutParams(new android.view.ViewGroup.LayoutParams(-2, -2));
	//   67  133:aload           11
	//   68  135:new             #270 <Class android.view.ViewGroup$LayoutParams>
	//   69  138:dup             
	//   70  139:bipush          -2
	//   71  141:bipush          -2
	//   72  143:invokespecial   #273 <Method void android.view.ViewGroup$LayoutParams(int, int)>
	//   73  146:invokevirtual   #277 <Method void View.setLayoutParams(android.view.ViewGroup$LayoutParams)>
			view.measure(j1, k1);
	//   74  149:aload           11
	//   75  151:iload           8
	//   76  153:iload           9
	//   77  155:invokevirtual   #280 <Method void View.measure(int, int)>
			i = Math.max(i, view.getMeasuredWidth());
	//   78  158:iload_3         
	//   79  159:aload           11
	//   80  161:invokevirtual   #281 <Method int View.getMeasuredWidth()>
	//   81  164:invokestatic    #246 <Method int Math.max(int, int)>
	//   82  167:istore_3        
			j++;
	//   83  168:iload           4
	//   84  170:iconst_1        
	//   85  171:iadd            
	//   86  172:istore          4
			k = l;
	//   87  174:iload           6
	//   88  176:istore          5
		}

	//*  89  178:goto            77
		j = i;
	//   90  181:iload_3         
	//   91  182:istore          4
		if(drawable != null)
	//*  92  184:aload_2         
	//*  93  185:ifnull          216
		{
			drawable.getPadding(mTempRect);
	//   94  188:aload_2         
	//   95  189:aload_0         
	//   96  190:getfield        #85  <Field Rect mTempRect>
	//   97  193:invokevirtual   #287 <Method boolean Drawable.getPadding(Rect)>
	//   98  196:pop             
			j = i + (mTempRect.left + mTempRect.right);
	//   99  197:iload_3         
	//  100  198:aload_0         
	//  101  199:getfield        #85  <Field Rect mTempRect>
	//  102  202:getfield        #290 <Field int Rect.left>
	//  103  205:aload_0         
	//  104  206:getfield        #85  <Field Rect mTempRect>
	//  105  209:getfield        #293 <Field int Rect.right>
	//  106  212:iadd            
	//  107  213:iadd            
	//  108  214:istore          4
		}
		return j;
	//  109  216:iload           4
	//  110  218:ireturn         
	}

	protected void drawableStateChanged()
	{
		super.drawableStateChanged();
	//    0    0:aload_0         
	//    1    1:invokespecial   #296 <Method void Spinner.drawableStateChanged()>
		if(mBackgroundTintHelper != null)
	//*   2    4:aload_0         
	//*   3    5:getfield        #103 <Field AppCompatBackgroundHelper mBackgroundTintHelper>
	//*   4    8:ifnull          18
			mBackgroundTintHelper.applySupportBackgroundTint();
	//    5   11:aload_0         
	//    6   12:getfield        #103 <Field AppCompatBackgroundHelper mBackgroundTintHelper>
	//    7   15:invokevirtual   #299 <Method void AppCompatBackgroundHelper.applySupportBackgroundTint()>
	//    8   18:return          
	}

	public int getDropDownHorizontalOffset()
	{
		if(mPopup != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #185 <Field AppCompatSpinner$DropdownPopup mPopup>
	//*   2    4:ifnull          15
			return mPopup.getHorizontalOffset();
	//    3    7:aload_0         
	//    4    8:getfield        #185 <Field AppCompatSpinner$DropdownPopup mPopup>
	//    5   11:invokevirtual   #303 <Method int AppCompatSpinner$DropdownPopup.getHorizontalOffset()>
	//    6   14:ireturn         
		if(android.os.Build.VERSION.SDK_INT >= 16)
	//*   7   15:getstatic       #124 <Field int android.os.Build$VERSION.SDK_INT>
	//*   8   18:bipush          16
	//*   9   20:icmplt          28
			return super.getDropDownHorizontalOffset();
	//   10   23:aload_0         
	//   11   24:invokespecial   #305 <Method int Spinner.getDropDownHorizontalOffset()>
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
	//*   1    1:getfield        #185 <Field AppCompatSpinner$DropdownPopup mPopup>
	//*   2    4:ifnull          15
			return mPopup.getVerticalOffset();
	//    3    7:aload_0         
	//    4    8:getfield        #185 <Field AppCompatSpinner$DropdownPopup mPopup>
	//    5   11:invokevirtual   #309 <Method int AppCompatSpinner$DropdownPopup.getVerticalOffset()>
	//    6   14:ireturn         
		if(android.os.Build.VERSION.SDK_INT >= 16)
	//*   7   15:getstatic       #124 <Field int android.os.Build$VERSION.SDK_INT>
	//*   8   18:bipush          16
	//*   9   20:icmplt          28
			return super.getDropDownVerticalOffset();
	//   10   23:aload_0         
	//   11   24:invokespecial   #311 <Method int Spinner.getDropDownVerticalOffset()>
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
	//*   1    1:getfield        #185 <Field AppCompatSpinner$DropdownPopup mPopup>
	//*   2    4:ifnull          12
			return mDropDownWidth;
	//    3    7:aload_0         
	//    4    8:getfield        #160 <Field int mDropDownWidth>
	//    5   11:ireturn         
		if(android.os.Build.VERSION.SDK_INT >= 16)
	//*   6   12:getstatic       #124 <Field int android.os.Build$VERSION.SDK_INT>
	//*   7   15:bipush          16
	//*   8   17:icmplt          25
			return super.getDropDownWidth();
	//    9   20:aload_0         
	//   10   21:invokespecial   #314 <Method int Spinner.getDropDownWidth()>
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
	//*   1    1:getfield        #185 <Field AppCompatSpinner$DropdownPopup mPopup>
	//*   2    4:ifnull          15
			return mPopup.getBackground();
	//    3    7:aload_0         
	//    4    8:getfield        #185 <Field AppCompatSpinner$DropdownPopup mPopup>
	//    5   11:invokevirtual   #319 <Method Drawable AppCompatSpinner$DropdownPopup.getBackground()>
	//    6   14:areturn         
		if(android.os.Build.VERSION.SDK_INT >= 16)
	//*   7   15:getstatic       #124 <Field int android.os.Build$VERSION.SDK_INT>
	//*   8   18:bipush          16
	//*   9   20:icmplt          28
			return super.getPopupBackground();
	//   10   23:aload_0         
	//   11   24:invokespecial   #321 <Method Drawable Spinner.getPopupBackground()>
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
	//*   1    1:getfield        #185 <Field AppCompatSpinner$DropdownPopup mPopup>
	//*   2    4:ifnull          12
			return mPopupContext;
	//    3    7:aload_0         
	//    4    8:getfield        #110 <Field Context mPopupContext>
	//    5   11:areturn         
		if(android.os.Build.VERSION.SDK_INT >= 23)
	//*   6   12:getstatic       #124 <Field int android.os.Build$VERSION.SDK_INT>
	//*   7   15:bipush          23
	//*   8   17:icmplt          25
			return super.getPopupContext();
	//    9   20:aload_0         
	//   10   21:invokespecial   #325 <Method Context Spinner.getPopupContext()>
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
	//*   1    1:getfield        #185 <Field AppCompatSpinner$DropdownPopup mPopup>
	//*   2    4:ifnull          15
			return mPopup.getHintText();
	//    3    7:aload_0         
	//    4    8:getfield        #185 <Field AppCompatSpinner$DropdownPopup mPopup>
	//    5   11:invokevirtual   #330 <Method CharSequence AppCompatSpinner$DropdownPopup.getHintText()>
	//    6   14:areturn         
		else
			return super.getPrompt();
	//    7   15:aload_0         
	//    8   16:invokespecial   #332 <Method CharSequence Spinner.getPrompt()>
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
	//    5   11:invokevirtual   #341 <Method ColorStateList AppCompatBackgroundHelper.getSupportBackgroundTintList()>
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
	//    5   11:invokevirtual   #346 <Method android.graphics.PorterDuff$Mode AppCompatBackgroundHelper.getSupportBackgroundTintMode()>
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
	//    1    1:invokespecial   #349 <Method void Spinner.onDetachedFromWindow()>
		if(mPopup != null && mPopup.isShowing())
	//*   2    4:aload_0         
	//*   3    5:getfield        #185 <Field AppCompatSpinner$DropdownPopup mPopup>
	//*   4    8:ifnull          28
	//*   5   11:aload_0         
	//*   6   12:getfield        #185 <Field AppCompatSpinner$DropdownPopup mPopup>
	//*   7   15:invokevirtual   #353 <Method boolean AppCompatSpinner$DropdownPopup.isShowing()>
	//*   8   18:ifeq            28
			mPopup.dismiss();
	//    9   21:aload_0         
	//   10   22:getfield        #185 <Field AppCompatSpinner$DropdownPopup mPopup>
	//   11   25:invokevirtual   #356 <Method void AppCompatSpinner$DropdownPopup.dismiss()>
	//   12   28:return          
	}

	protected void onMeasure(int i, int j)
	{
		super.onMeasure(i, j);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:iload_2         
	//    3    3:invokespecial   #359 <Method void Spinner.onMeasure(int, int)>
		if(mPopup != null && android.view.View.MeasureSpec.getMode(i) == 0x80000000)
	//*   4    6:aload_0         
	//*   5    7:getfield        #185 <Field AppCompatSpinner$DropdownPopup mPopup>
	//*   6   10:ifnull          57
	//*   7   13:iload_1         
	//*   8   14:invokestatic    #362 <Method int android.view.View$MeasureSpec.getMode(int)>
	//*   9   17:ldc2            #363 <Int 0x80000000>
	//*  10   20:icmpne          57
			setMeasuredDimension(Math.min(Math.max(getMeasuredWidth(), compatMeasureContentWidth(getAdapter(), getBackground())), android.view.View.MeasureSpec.getSize(i)), getMeasuredHeight());
	//   11   23:aload_0         
	//   12   24:aload_0         
	//   13   25:invokevirtual   #230 <Method int getMeasuredWidth()>
	//   14   28:aload_0         
	//   15   29:aload_0         
	//   16   30:invokevirtual   #367 <Method SpinnerAdapter getAdapter()>
	//   17   33:aload_0         
	//   18   34:invokevirtual   #368 <Method Drawable getBackground()>
	//   19   37:invokevirtual   #370 <Method int compatMeasureContentWidth(SpinnerAdapter, Drawable)>
	//   20   40:invokestatic    #246 <Method int Math.max(int, int)>
	//   21   43:iload_1         
	//   22   44:invokestatic    #373 <Method int android.view.View$MeasureSpec.getSize(int)>
	//   23   47:invokestatic    #254 <Method int Math.min(int, int)>
	//   24   50:aload_0         
	//   25   51:invokevirtual   #238 <Method int getMeasuredHeight()>
	//   26   54:invokevirtual   #376 <Method void setMeasuredDimension(int, int)>
	//   27   57:return          
	}

	public boolean onTouchEvent(MotionEvent motionevent)
	{
		if(mForwardingListener != null && mForwardingListener.onTouch(((View) (this)), motionevent))
	//*   0    0:aload_0         
	//*   1    1:getfield        #190 <Field ForwardingListener mForwardingListener>
	//*   2    4:ifnull          21
	//*   3    7:aload_0         
	//*   4    8:getfield        #190 <Field ForwardingListener mForwardingListener>
	//*   5   11:aload_0         
	//*   6   12:aload_1         
	//*   7   13:invokevirtual   #384 <Method boolean ForwardingListener.onTouch(View, MotionEvent)>
	//*   8   16:ifeq            21
			return true;
	//    9   19:iconst_1        
	//   10   20:ireturn         
		else
			return super.onTouchEvent(motionevent);
	//   11   21:aload_0         
	//   12   22:aload_1         
	//   13   23:invokespecial   #386 <Method boolean Spinner.onTouchEvent(MotionEvent)>
	//   14   26:ireturn         
	}

	public boolean performClick()
	{
		if(mPopup != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #185 <Field AppCompatSpinner$DropdownPopup mPopup>
	//*   2    4:ifnull          26
		{
			if(!mPopup.isShowing())
	//*   3    7:aload_0         
	//*   4    8:getfield        #185 <Field AppCompatSpinner$DropdownPopup mPopup>
	//*   5   11:invokevirtual   #353 <Method boolean AppCompatSpinner$DropdownPopup.isShowing()>
	//*   6   14:ifne            24
				mPopup.show();
	//    7   17:aload_0         
	//    8   18:getfield        #185 <Field AppCompatSpinner$DropdownPopup mPopup>
	//    9   21:invokevirtual   #390 <Method void AppCompatSpinner$DropdownPopup.show()>
			return true;
	//   10   24:iconst_1        
	//   11   25:ireturn         
		} else
		{
			return super.performClick();
	//   12   26:aload_0         
	//   13   27:invokespecial   #392 <Method boolean Spinner.performClick()>
	//   14   30:ireturn         
		}
	}

	public volatile void setAdapter(Adapter adapter)
	{
		setAdapter((SpinnerAdapter)adapter);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:checkcast       #248 <Class SpinnerAdapter>
	//    3    5:invokevirtual   #216 <Method void setAdapter(SpinnerAdapter)>
	//    4    8:return          
	}

	public void setAdapter(SpinnerAdapter spinneradapter)
	{
		if(!mPopupSet)
	//*   0    0:aload_0         
	//*   1    1:getfield        #218 <Field boolean mPopupSet>
	//*   2    4:ifne            13
		{
			mTempAdapter = spinneradapter;
	//    3    7:aload_0         
	//    4    8:aload_1         
	//    5    9:putfield        #220 <Field SpinnerAdapter mTempAdapter>
			return;
	//    6   12:return          
		}
		super.setAdapter(spinneradapter);
	//    7   13:aload_0         
	//    8   14:aload_1         
	//    9   15:invokespecial   #394 <Method void Spinner.setAdapter(SpinnerAdapter)>
		if(mPopup != null)
	//*  10   18:aload_0         
	//*  11   19:getfield        #185 <Field AppCompatSpinner$DropdownPopup mPopup>
	//*  12   22:ifnull          64
		{
			Context context;
			if(mPopupContext == null)
	//*  13   25:aload_0         
	//*  14   26:getfield        #110 <Field Context mPopupContext>
	//*  15   29:ifnonnull       40
				context = getContext();
	//   16   32:aload_0         
	//   17   33:invokevirtual   #397 <Method Context getContext()>
	//   18   36:astore_2        
			else
	//*  19   37:goto            45
				context = mPopupContext;
	//   20   40:aload_0         
	//   21   41:getfield        #110 <Field Context mPopupContext>
	//   22   44:astore_2        
			mPopup.setAdapter(((ListAdapter) (new DropDownAdapter(spinneradapter, context.getTheme()))));
	//   23   45:aload_0         
	//   24   46:getfield        #185 <Field AppCompatSpinner$DropdownPopup mPopup>
	//   25   49:new             #10  <Class AppCompatSpinner$DropDownAdapter>
	//   26   52:dup             
	//   27   53:aload_1         
	//   28   54:aload_2         
	//   29   55:invokevirtual   #401 <Method android.content.res.Resources$Theme Context.getTheme()>
	//   30   58:invokespecial   #404 <Method void AppCompatSpinner$DropDownAdapter(SpinnerAdapter, android.content.res.Resources$Theme)>
	//   31   61:invokevirtual   #407 <Method void AppCompatSpinner$DropdownPopup.setAdapter(ListAdapter)>
		}
	//   32   64:return          
	}

	public void setBackgroundDrawable(Drawable drawable)
	{
		super.setBackgroundDrawable(drawable);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #408 <Method void Spinner.setBackgroundDrawable(Drawable)>
		if(mBackgroundTintHelper != null)
	//*   3    5:aload_0         
	//*   4    6:getfield        #103 <Field AppCompatBackgroundHelper mBackgroundTintHelper>
	//*   5    9:ifnull          20
			mBackgroundTintHelper.onSetBackgroundDrawable(drawable);
	//    6   12:aload_0         
	//    7   13:getfield        #103 <Field AppCompatBackgroundHelper mBackgroundTintHelper>
	//    8   16:aload_1         
	//    9   17:invokevirtual   #411 <Method void AppCompatBackgroundHelper.onSetBackgroundDrawable(Drawable)>
	//   10   20:return          
	}

	public void setBackgroundResource(int i)
	{
		super.setBackgroundResource(i);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokespecial   #415 <Method void Spinner.setBackgroundResource(int)>
		if(mBackgroundTintHelper != null)
	//*   3    5:aload_0         
	//*   4    6:getfield        #103 <Field AppCompatBackgroundHelper mBackgroundTintHelper>
	//*   5    9:ifnull          20
			mBackgroundTintHelper.onSetBackgroundResource(i);
	//    6   12:aload_0         
	//    7   13:getfield        #103 <Field AppCompatBackgroundHelper mBackgroundTintHelper>
	//    8   16:iload_1         
	//    9   17:invokevirtual   #418 <Method void AppCompatBackgroundHelper.onSetBackgroundResource(int)>
	//   10   20:return          
	}

	public void setDropDownHorizontalOffset(int i)
	{
		if(mPopup != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #185 <Field AppCompatSpinner$DropdownPopup mPopup>
	//*   2    4:ifnull          16
		{
			mPopup.setHorizontalOffset(i);
	//    3    7:aload_0         
	//    4    8:getfield        #185 <Field AppCompatSpinner$DropdownPopup mPopup>
	//    5   11:iload_1         
	//    6   12:invokevirtual   #423 <Method void AppCompatSpinner$DropdownPopup.setHorizontalOffset(int)>
			return;
	//    7   15:return          
		}
		if(android.os.Build.VERSION.SDK_INT >= 16)
	//*   8   16:getstatic       #124 <Field int android.os.Build$VERSION.SDK_INT>
	//*   9   19:bipush          16
	//*  10   21:icmplt          29
			super.setDropDownHorizontalOffset(i);
	//   11   24:aload_0         
	//   12   25:iload_1         
	//   13   26:invokespecial   #425 <Method void Spinner.setDropDownHorizontalOffset(int)>
	//   14   29:return          
	}

	public void setDropDownVerticalOffset(int i)
	{
		if(mPopup != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #185 <Field AppCompatSpinner$DropdownPopup mPopup>
	//*   2    4:ifnull          16
		{
			mPopup.setVerticalOffset(i);
	//    3    7:aload_0         
	//    4    8:getfield        #185 <Field AppCompatSpinner$DropdownPopup mPopup>
	//    5   11:iload_1         
	//    6   12:invokevirtual   #429 <Method void AppCompatSpinner$DropdownPopup.setVerticalOffset(int)>
			return;
	//    7   15:return          
		}
		if(android.os.Build.VERSION.SDK_INT >= 16)
	//*   8   16:getstatic       #124 <Field int android.os.Build$VERSION.SDK_INT>
	//*   9   19:bipush          16
	//*  10   21:icmplt          29
			super.setDropDownVerticalOffset(i);
	//   11   24:aload_0         
	//   12   25:iload_1         
	//   13   26:invokespecial   #431 <Method void Spinner.setDropDownVerticalOffset(int)>
	//   14   29:return          
	}

	public void setDropDownWidth(int i)
	{
		if(mPopup != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #185 <Field AppCompatSpinner$DropdownPopup mPopup>
	//*   2    4:ifnull          13
		{
			mDropDownWidth = i;
	//    3    7:aload_0         
	//    4    8:iload_1         
	//    5    9:putfield        #160 <Field int mDropDownWidth>
			return;
	//    6   12:return          
		}
		if(android.os.Build.VERSION.SDK_INT >= 16)
	//*   7   13:getstatic       #124 <Field int android.os.Build$VERSION.SDK_INT>
	//*   8   16:bipush          16
	//*   9   18:icmplt          26
			super.setDropDownWidth(i);
	//   10   21:aload_0         
	//   11   22:iload_1         
	//   12   23:invokespecial   #434 <Method void Spinner.setDropDownWidth(int)>
	//   13   26:return          
	}

	public void setPopupBackgroundDrawable(Drawable drawable)
	{
		if(mPopup != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #185 <Field AppCompatSpinner$DropdownPopup mPopup>
	//*   2    4:ifnull          16
		{
			mPopup.setBackgroundDrawable(drawable);
	//    3    7:aload_0         
	//    4    8:getfield        #185 <Field AppCompatSpinner$DropdownPopup mPopup>
	//    5   11:aload_1         
	//    6   12:invokevirtual   #171 <Method void AppCompatSpinner$DropdownPopup.setBackgroundDrawable(Drawable)>
			return;
	//    7   15:return          
		}
		if(android.os.Build.VERSION.SDK_INT >= 16)
	//*   8   16:getstatic       #124 <Field int android.os.Build$VERSION.SDK_INT>
	//*   9   19:bipush          16
	//*  10   21:icmplt          29
			super.setPopupBackgroundDrawable(drawable);
	//   11   24:aload_0         
	//   12   25:aload_1         
	//   13   26:invokespecial   #437 <Method void Spinner.setPopupBackgroundDrawable(Drawable)>
	//   14   29:return          
	}

	public void setPopupBackgroundResource(int i)
	{
		setPopupBackgroundDrawable(AppCompatResources.getDrawable(getPopupContext(), i));
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:invokevirtual   #439 <Method Context getPopupContext()>
	//    3    5:iload_1         
	//    4    6:invokestatic    #444 <Method Drawable AppCompatResources.getDrawable(Context, int)>
	//    5    9:invokevirtual   #445 <Method void setPopupBackgroundDrawable(Drawable)>
	//    6   12:return          
	}

	public void setPrompt(CharSequence charsequence)
	{
		if(mPopup != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #185 <Field AppCompatSpinner$DropdownPopup mPopup>
	//*   2    4:ifnull          16
		{
			mPopup.setPromptText(charsequence);
	//    3    7:aload_0         
	//    4    8:getfield        #185 <Field AppCompatSpinner$DropdownPopup mPopup>
	//    5   11:aload_1         
	//    6   12:invokevirtual   #182 <Method void AppCompatSpinner$DropdownPopup.setPromptText(CharSequence)>
			return;
	//    7   15:return          
		} else
		{
			super.setPrompt(charsequence);
	//    8   16:aload_0         
	//    9   17:aload_1         
	//   10   18:invokespecial   #448 <Method void Spinner.setPrompt(CharSequence)>
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
	//    6   12:invokevirtual   #452 <Method void AppCompatBackgroundHelper.setSupportBackgroundTintList(ColorStateList)>
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
	//    6   12:invokevirtual   #456 <Method void AppCompatBackgroundHelper.setSupportBackgroundTintMode(android.graphics.PorterDuff$Mode)>
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
	private AppCompatBackgroundHelper mBackgroundTintHelper;
	int mDropDownWidth;
	private ForwardingListener mForwardingListener;
	DropdownPopup mPopup;
	private Context mPopupContext;
	private boolean mPopupSet;
	private SpinnerAdapter mTempAdapter;
	final Rect mTempRect;

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
