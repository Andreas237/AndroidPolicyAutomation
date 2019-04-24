// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v14.preference;

import android.app.*;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.*;
import android.support.v4.content.res.TypedArrayUtils;
import android.support.v4.view.ViewCompat;
import android.support.v7.preference.*;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.TypedValue;
import android.view.*;

// Referenced classes of package android.support.v14.preference:
//			EditTextPreferenceDialogFragment, ListPreferenceDialogFragment, MultiSelectListPreference, MultiSelectListPreferenceDialogFragment

public abstract class PreferenceFragment extends Fragment
	implements android.support.v7.preference.PreferenceManager.OnPreferenceTreeClickListener, android.support.v7.preference.PreferenceManager.OnDisplayPreferenceDialogListener, android.support.v7.preference.PreferenceManager.OnNavigateToScreenListener, android.support.v7.preference.DialogPreference.TargetFragment
{
	private class DividerDecoration extends android.support.v7.widget.RecyclerView.ItemDecoration
	{

		private boolean shouldDrawDividerBelow(View view, RecyclerView recyclerview)
		{
			android.support.v7.widget.RecyclerView.ViewHolder viewholder = recyclerview.getChildViewHolder(view);
		//    0    0:aload_2         
		//    1    1:aload_1         
		//    2    2:invokevirtual   #32  <Method android.support.v7.widget.RecyclerView$ViewHolder RecyclerView.getChildViewHolder(View)>
		//    3    5:astore          5
			boolean flag;
			if((viewholder instanceof PreferenceViewHolder) && ((PreferenceViewHolder)viewholder).isDividerAllowedBelow())
		//*   4    7:aload           5
		//*   5    9:instanceof      #34  <Class PreferenceViewHolder>
		//*   6   12:ifeq            34
		//*   7   15:aload           5
		//*   8   17:checkcast       #34  <Class PreferenceViewHolder>
		//*   9   20:invokevirtual   #38  <Method boolean PreferenceViewHolder.isDividerAllowedBelow()>
		//*  10   23:ifeq            34
				flag = true;
		//   11   26:iconst_1        
		//   12   27:istore_3        
			else
		//*  13   28:iload_3         
		//*  14   29:ifne            39
		//*  15   32:iconst_0        
		//*  16   33:ireturn         
				flag = false;
		//   17   34:iconst_0        
		//   18   35:istore_3        
			if(!flag)
				return false;
		//*  19   36:goto            28
			boolean flag1 = true;
		//   20   39:iconst_1        
		//   21   40:istore          4
			int i = recyclerview.indexOfChild(view);
		//   22   42:aload_2         
		//   23   43:aload_1         
		//   24   44:invokevirtual   #42  <Method int RecyclerView.indexOfChild(View)>
		//   25   47:istore_3        
			if(i < recyclerview.getChildCount() - 1)
		//*  26   48:iload_3         
		//*  27   49:aload_2         
		//*  28   50:invokevirtual   #46  <Method int RecyclerView.getChildCount()>
		//*  29   53:iconst_1        
		//*  30   54:isub            
		//*  31   55:icmpge          90
			{
				view = ((View) (recyclerview.getChildViewHolder(recyclerview.getChildAt(i + 1))));
		//   32   58:aload_2         
		//   33   59:aload_2         
		//   34   60:iload_3         
		//   35   61:iconst_1        
		//   36   62:iadd            
		//   37   63:invokevirtual   #50  <Method View RecyclerView.getChildAt(int)>
		//   38   66:invokevirtual   #32  <Method android.support.v7.widget.RecyclerView$ViewHolder RecyclerView.getChildViewHolder(View)>
		//   39   69:astore_1        
				if((view instanceof PreferenceViewHolder) && ((PreferenceViewHolder)view).isDividerAllowedAbove())
		//*  40   70:aload_1         
		//*  41   71:instanceof      #34  <Class PreferenceViewHolder>
		//*  42   74:ifeq            93
		//*  43   77:aload_1         
		//*  44   78:checkcast       #34  <Class PreferenceViewHolder>
		//*  45   81:invokevirtual   #53  <Method boolean PreferenceViewHolder.isDividerAllowedAbove()>
		//*  46   84:ifeq            93
					flag1 = true;
		//   47   87:iconst_1        
		//   48   88:istore          4
				else
		//*  49   90:iload           4
		//*  50   92:ireturn         
					flag1 = false;
		//   51   93:iconst_0        
		//   52   94:istore          4
			}
			return flag1;
		//*  53   96:goto            90
		}

		public void getItemOffsets(Rect rect, View view, RecyclerView recyclerview, android.support.v7.widget.RecyclerView.State state)
		{
			if(shouldDrawDividerBelow(view, recyclerview))
		//*   0    0:aload_0         
		//*   1    1:aload_2         
		//*   2    2:aload_3         
		//*   3    3:invokespecial   #57  <Method boolean shouldDrawDividerBelow(View, RecyclerView)>
		//*   4    6:ifeq            17
				rect.bottom = mDividerHeight;
		//    5    9:aload_1         
		//    6   10:aload_0         
		//    7   11:getfield        #59  <Field int mDividerHeight>
		//    8   14:putfield        #64  <Field int Rect.bottom>
		//    9   17:return          
		}

		public void onDrawOver(Canvas canvas, RecyclerView recyclerview, android.support.v7.widget.RecyclerView.State state)
		{
			if(mDivider != null)
		//*   0    0:aload_0         
		//*   1    1:getfield        #68  <Field Drawable mDivider>
		//*   2    4:ifnonnull       8
		//*   3    7:return          
			{
				int j = recyclerview.getChildCount();
		//    4    8:aload_2         
		//    5    9:invokevirtual   #46  <Method int RecyclerView.getChildCount()>
		//    6   12:istore          5
				int k = recyclerview.getWidth();
		//    7   14:aload_2         
		//    8   15:invokevirtual   #71  <Method int RecyclerView.getWidth()>
		//    9   18:istore          6
				int i = 0;
		//   10   20:iconst_0        
		//   11   21:istore          4
				while(i < j) 
		//*  12   23:iload           4
		//*  13   25:iload           5
		//*  14   27:icmpge          7
				{
					state = ((android.support.v7.widget.RecyclerView.State) (recyclerview.getChildAt(i)));
		//   15   30:aload_2         
		//   16   31:iload           4
		//   17   33:invokevirtual   #50  <Method View RecyclerView.getChildAt(int)>
		//   18   36:astore_3        
					if(shouldDrawDividerBelow(((View) (state)), recyclerview))
		//*  19   37:aload_0         
		//*  20   38:aload_3         
		//*  21   39:aload_2         
		//*  22   40:invokespecial   #57  <Method boolean shouldDrawDividerBelow(View, RecyclerView)>
		//*  23   43:ifeq            85
					{
						int l = (int)ViewCompat.getY(((View) (state))) + ((View) (state)).getHeight();
		//   24   46:aload_3         
		//   25   47:invokestatic    #77  <Method float ViewCompat.getY(View)>
		//   26   50:f2i             
		//   27   51:aload_3         
		//   28   52:invokevirtual   #82  <Method int View.getHeight()>
		//   29   55:iadd            
		//   30   56:istore          7
						mDivider.setBounds(0, l, k, mDividerHeight + l);
		//   31   58:aload_0         
		//   32   59:getfield        #68  <Field Drawable mDivider>
		//   33   62:iconst_0        
		//   34   63:iload           7
		//   35   65:iload           6
		//   36   67:aload_0         
		//   37   68:getfield        #59  <Field int mDividerHeight>
		//   38   71:iload           7
		//   39   73:iadd            
		//   40   74:invokevirtual   #88  <Method void Drawable.setBounds(int, int, int, int)>
						mDivider.draw(canvas);
		//   41   77:aload_0         
		//   42   78:getfield        #68  <Field Drawable mDivider>
		//   43   81:aload_1         
		//   44   82:invokevirtual   #92  <Method void Drawable.draw(Canvas)>
					}
					i++;
		//   45   85:iload           4
		//   46   87:iconst_1        
		//   47   88:iadd            
		//   48   89:istore          4
				}
			}
		//*  49   91:goto            23
		}

		public void setDivider(Drawable drawable)
		{
			if(drawable != null)
		//*   0    0:aload_1         
		//*   1    1:ifnull          28
				mDividerHeight = drawable.getIntrinsicHeight();
		//    2    4:aload_0         
		//    3    5:aload_1         
		//    4    6:invokevirtual   #97  <Method int Drawable.getIntrinsicHeight()>
		//    5    9:putfield        #59  <Field int mDividerHeight>
			else
		//*   6   12:aload_0         
		//*   7   13:aload_1         
		//*   8   14:putfield        #68  <Field Drawable mDivider>
		//*   9   17:aload_0         
		//*  10   18:getfield        #17  <Field PreferenceFragment this$0>
		//*  11   21:invokestatic    #101 <Method RecyclerView PreferenceFragment.access$200(PreferenceFragment)>
		//*  12   24:invokevirtual   #104 <Method void RecyclerView.invalidateItemDecorations()>
		//*  13   27:return          
				mDividerHeight = 0;
		//   14   28:aload_0         
		//   15   29:iconst_0        
		//   16   30:putfield        #59  <Field int mDividerHeight>
			mDivider = drawable;
			mList.invalidateItemDecorations();
		//*  17   33:goto            12
		}

		public void setDividerHeight(int i)
		{
			mDividerHeight = i;
		//    0    0:aload_0         
		//    1    1:iload_1         
		//    2    2:putfield        #59  <Field int mDividerHeight>
			mList.invalidateItemDecorations();
		//    3    5:aload_0         
		//    4    6:getfield        #17  <Field PreferenceFragment this$0>
		//    5    9:invokestatic    #101 <Method RecyclerView PreferenceFragment.access$200(PreferenceFragment)>
		//    6   12:invokevirtual   #104 <Method void RecyclerView.invalidateItemDecorations()>
		//    7   15:return          
		}

		private Drawable mDivider;
		private int mDividerHeight;
		final PreferenceFragment this$0;

		private DividerDecoration()
		{
			this$0 = PreferenceFragment.this;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #17  <Field PreferenceFragment this$0>
			super();
		//    3    5:aload_0         
		//    4    6:invokespecial   #20  <Method void android.support.v7.widget.RecyclerView$ItemDecoration()>
		//    5    9:return          
		}

	}

	public static interface OnPreferenceDisplayDialogCallback
	{

		public abstract boolean onPreferenceDisplayDialog(PreferenceFragment preferencefragment, Preference preference);
	}

	public static interface OnPreferenceStartFragmentCallback
	{

		public abstract boolean onPreferenceStartFragment(PreferenceFragment preferencefragment, Preference preference);
	}

	public static interface OnPreferenceStartScreenCallback
	{

		public abstract boolean onPreferenceStartScreen(PreferenceFragment preferencefragment, PreferenceScreen preferencescreen);
	}

	private static class ScrollToPreferenceObserver extends android.support.v7.widget.RecyclerView.AdapterDataObserver
	{

		private void scrollToPreference()
		{
			mAdapter.unregisterAdapterDataObserver(((android.support.v7.widget.RecyclerView.AdapterDataObserver) (this)));
		//    0    0:aload_0         
		//    1    1:getfield        #22  <Field android.support.v7.widget.RecyclerView$Adapter mAdapter>
		//    2    4:aload_0         
		//    3    5:invokevirtual   #36  <Method void android.support.v7.widget.RecyclerView$Adapter.unregisterAdapterDataObserver(android.support.v7.widget.RecyclerView$AdapterDataObserver)>
			int i;
			if(mPreference != null)
		//*   4    8:aload_0         
		//*   5    9:getfield        #26  <Field Preference mPreference>
		//*   6   12:ifnull          46
				i = ((android.support.v7.preference.PreferenceGroup.PreferencePositionCallback)mAdapter).getPreferenceAdapterPosition(mPreference);
		//    7   15:aload_0         
		//    8   16:getfield        #22  <Field android.support.v7.widget.RecyclerView$Adapter mAdapter>
		//    9   19:checkcast       #38  <Class android.support.v7.preference.PreferenceGroup$PreferencePositionCallback>
		//   10   22:aload_0         
		//   11   23:getfield        #26  <Field Preference mPreference>
		//   12   26:invokeinterface #42  <Method int android.support.v7.preference.PreferenceGroup$PreferencePositionCallback.getPreferenceAdapterPosition(Preference)>
		//   13   31:istore_1        
			else
		//*  14   32:iload_1         
		//*  15   33:iconst_m1       
		//*  16   34:icmpeq          45
		//*  17   37:aload_0         
		//*  18   38:getfield        #24  <Field RecyclerView mList>
		//*  19   41:iload_1         
		//*  20   42:invokevirtual   #48  <Method void RecyclerView.scrollToPosition(int)>
		//*  21   45:return          
				i = ((android.support.v7.preference.PreferenceGroup.PreferencePositionCallback)mAdapter).getPreferenceAdapterPosition(mKey);
		//   22   46:aload_0         
		//   23   47:getfield        #22  <Field android.support.v7.widget.RecyclerView$Adapter mAdapter>
		//   24   50:checkcast       #38  <Class android.support.v7.preference.PreferenceGroup$PreferencePositionCallback>
		//   25   53:aload_0         
		//   26   54:getfield        #28  <Field String mKey>
		//   27   57:invokeinterface #51  <Method int android.support.v7.preference.PreferenceGroup$PreferencePositionCallback.getPreferenceAdapterPosition(String)>
		//   28   62:istore_1        
			if(i != -1)
				mList.scrollToPosition(i);
		//*  29   63:goto            32
		}

		public void onChanged()
		{
			scrollToPreference();
		//    0    0:aload_0         
		//    1    1:invokespecial   #54  <Method void scrollToPreference()>
		//    2    4:return          
		}

		public void onItemRangeChanged(int i, int j)
		{
			scrollToPreference();
		//    0    0:aload_0         
		//    1    1:invokespecial   #54  <Method void scrollToPreference()>
		//    2    4:return          
		}

		public void onItemRangeChanged(int i, int j, Object obj)
		{
			scrollToPreference();
		//    0    0:aload_0         
		//    1    1:invokespecial   #54  <Method void scrollToPreference()>
		//    2    4:return          
		}

		public void onItemRangeInserted(int i, int j)
		{
			scrollToPreference();
		//    0    0:aload_0         
		//    1    1:invokespecial   #54  <Method void scrollToPreference()>
		//    2    4:return          
		}

		public void onItemRangeMoved(int i, int j, int k)
		{
			scrollToPreference();
		//    0    0:aload_0         
		//    1    1:invokespecial   #54  <Method void scrollToPreference()>
		//    2    4:return          
		}

		public void onItemRangeRemoved(int i, int j)
		{
			scrollToPreference();
		//    0    0:aload_0         
		//    1    1:invokespecial   #54  <Method void scrollToPreference()>
		//    2    4:return          
		}

		private final android.support.v7.widget.RecyclerView.Adapter mAdapter;
		private final String mKey;
		private final RecyclerView mList;
		private final Preference mPreference;

		public ScrollToPreferenceObserver(android.support.v7.widget.RecyclerView.Adapter adapter, RecyclerView recyclerview, Preference preference, String s)
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #20  <Method void android.support.v7.widget.RecyclerView$AdapterDataObserver()>
			mAdapter = adapter;
		//    2    4:aload_0         
		//    3    5:aload_1         
		//    4    6:putfield        #22  <Field android.support.v7.widget.RecyclerView$Adapter mAdapter>
			mList = recyclerview;
		//    5    9:aload_0         
		//    6   10:aload_2         
		//    7   11:putfield        #24  <Field RecyclerView mList>
			mPreference = preference;
		//    8   14:aload_0         
		//    9   15:aload_3         
		//   10   16:putfield        #26  <Field Preference mPreference>
			mKey = s;
		//   11   19:aload_0         
		//   12   20:aload           4
		//   13   22:putfield        #28  <Field String mKey>
		//   14   25:return          
		}
	}


	public PreferenceFragment()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #67  <Method void Fragment()>
		mLayoutResId = android.support.v7.preference.R.layout.preference_list_fragment;
	//    2    4:aload_0         
	//    3    5:getstatic       #72  <Field int android.support.v7.preference.R$layout.preference_list_fragment>
	//    4    8:putfield        #74  <Field int mLayoutResId>
	//    5   11:aload_0         
	//    6   12:new             #20  <Class PreferenceFragment$DividerDecoration>
	//    7   15:dup             
	//    8   16:aload_0         
	//    9   17:aconst_null     
	//   10   18:invokespecial   #77  <Method void PreferenceFragment$DividerDecoration(PreferenceFragment, PreferenceFragment$1)>
	//   11   21:putfield        #79  <Field PreferenceFragment$DividerDecoration mDividerDecoration>
		mHandler = ((Handler) (new Handler() {

			public void handleMessage(Message message)
			{
				switch(message.what)
			//*   0    0:aload_1         
			//*   1    1:getfield        #24  <Field int Message.what>
				{
			//*   2    4:tableswitch     1 1: default 24
			//			               1 25
				default:
					return;
			//    3   24:return          

				case 1: // '\001'
					bindPreferences();
			//    4   25:aload_0         
			//    5   26:getfield        #12  <Field PreferenceFragment this$0>
			//    6   29:invokestatic    #27  <Method void PreferenceFragment.access$100(PreferenceFragment)>
					break;
				}
			//    7   32:return          
			}

			final PreferenceFragment this$0;

			
			{
				this$0 = PreferenceFragment.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #12  <Field PreferenceFragment this$0>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #15  <Method void Handler()>
			//    5    9:return          
			}
		}
));
	//   12   24:aload_0         
	//   13   25:new             #14  <Class PreferenceFragment$1>
	//   14   28:dup             
	//   15   29:aload_0         
	//   16   30:invokespecial   #82  <Method void PreferenceFragment$1(PreferenceFragment)>
	//   17   33:putfield        #84  <Field Handler mHandler>
	//   18   36:aload_0         
	//   19   37:new             #16  <Class PreferenceFragment$2>
	//   20   40:dup             
	//   21   41:aload_0         
	//   22   42:invokespecial   #85  <Method void PreferenceFragment$2(PreferenceFragment)>
	//   23   45:putfield        #87  <Field Runnable mRequestFocus>
	//   24   48:return          
	}

	private void bindPreferences()
	{
		PreferenceScreen preferencescreen = getPreferenceScreen();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #100 <Method PreferenceScreen getPreferenceScreen()>
	//    2    4:astore_1        
		if(preferencescreen != null)
	//*   3    5:aload_1         
	//*   4    6:ifnull          25
		{
			getListView().setAdapter(onCreateAdapter(preferencescreen));
	//    5    9:aload_0         
	//    6   10:invokevirtual   #104 <Method RecyclerView getListView()>
	//    7   13:aload_0         
	//    8   14:aload_1         
	//    9   15:invokevirtual   #108 <Method android.support.v7.widget.RecyclerView$Adapter onCreateAdapter(PreferenceScreen)>
	//   10   18:invokevirtual   #114 <Method void RecyclerView.setAdapter(android.support.v7.widget.RecyclerView$Adapter)>
			preferencescreen.onAttached();
	//   11   21:aload_1         
	//   12   22:invokevirtual   #119 <Method void PreferenceScreen.onAttached()>
		}
		onBindPreferences();
	//   13   25:aload_0         
	//   14   26:invokevirtual   #122 <Method void onBindPreferences()>
	//   15   29:return          
	}

	private void postBindPreferences()
	{
		if(mHandler.hasMessages(1))
	//*   0    0:aload_0         
	//*   1    1:getfield        #84  <Field Handler mHandler>
	//*   2    4:iconst_1        
	//*   3    5:invokevirtual   #129 <Method boolean Handler.hasMessages(int)>
	//*   4    8:ifeq            12
		{
			return;
	//    5   11:return          
		} else
		{
			mHandler.obtainMessage(1).sendToTarget();
	//    6   12:aload_0         
	//    7   13:getfield        #84  <Field Handler mHandler>
	//    8   16:iconst_1        
	//    9   17:invokevirtual   #133 <Method Message Handler.obtainMessage(int)>
	//   10   20:invokevirtual   #138 <Method void Message.sendToTarget()>
			return;
	//   11   23:return          
		}
	}

	private void requirePreferenceManager()
	{
		if(mPreferenceManager == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #141 <Field PreferenceManager mPreferenceManager>
	//*   2    4:ifnonnull       17
			throw new RuntimeException("This should be called after super.onCreate.");
	//    3    7:new             #143 <Class RuntimeException>
	//    4   10:dup             
	//    5   11:ldc1            #145 <String "This should be called after super.onCreate.">
	//    6   13:invokespecial   #148 <Method void RuntimeException(String)>
	//    7   16:athrow          
		else
			return;
	//    8   17:return          
	}

	private void scrollToPreferenceInternal(final Preference preference, final String key)
	{
		preference = ((Preference) (new Runnable() {

			public void run()
			{
				android.support.v7.widget.RecyclerView.Adapter adapter;
label0:
				{
					adapter = mList.getAdapter();
			//    0    0:aload_0         
			//    1    1:getfield        #21  <Field PreferenceFragment this$0>
			//    2    4:invokestatic    #34  <Method RecyclerView PreferenceFragment.access$200(PreferenceFragment)>
			//    3    7:invokevirtual   #40  <Method android.support.v7.widget.RecyclerView$Adapter RecyclerView.getAdapter()>
			//    4   10:astore_2        
					if(!(adapter instanceof android.support.v7.preference.PreferenceGroup.PreferencePositionCallback))
			//*   5   11:aload_2         
			//*   6   12:instanceof      #42  <Class android.support.v7.preference.PreferenceGroup$PreferencePositionCallback>
			//*   7   15:ifne            32
					{
						if(adapter != null)
			//*   8   18:aload_2         
			//*   9   19:ifnull          69
							throw new IllegalStateException("Adapter must implement PreferencePositionCallback");
			//   10   22:new             #44  <Class IllegalStateException>
			//   11   25:dup             
			//   12   26:ldc1            #46  <String "Adapter must implement PreferencePositionCallback">
			//   13   28:invokespecial   #49  <Method void IllegalStateException(String)>
			//   14   31:athrow          
					} else
					{
						int i;
						if(preference != null)
			//*  15   32:aload_0         
			//*  16   33:getfield        #23  <Field Preference val$preference>
			//*  17   36:ifnull          70
							i = ((android.support.v7.preference.PreferenceGroup.PreferencePositionCallback)adapter).getPreferenceAdapterPosition(preference);
			//   18   39:aload_2         
			//   19   40:checkcast       #42  <Class android.support.v7.preference.PreferenceGroup$PreferencePositionCallback>
			//   20   43:aload_0         
			//   21   44:getfield        #23  <Field Preference val$preference>
			//   22   47:invokeinterface #53  <Method int android.support.v7.preference.PreferenceGroup$PreferencePositionCallback.getPreferenceAdapterPosition(Preference)>
			//   23   52:istore_1        
						else
			//*  24   53:iload_1         
			//*  25   54:iconst_m1       
			//*  26   55:icmpeq          87
			//*  27   58:aload_0         
			//*  28   59:getfield        #21  <Field PreferenceFragment this$0>
			//*  29   62:invokestatic    #34  <Method RecyclerView PreferenceFragment.access$200(PreferenceFragment)>
			//*  30   65:iload_1         
			//*  31   66:invokevirtual   #57  <Method void RecyclerView.scrollToPosition(int)>
			//*  32   69:return          
							i = ((android.support.v7.preference.PreferenceGroup.PreferencePositionCallback)adapter).getPreferenceAdapterPosition(key);
			//   33   70:aload_2         
			//   34   71:checkcast       #42  <Class android.support.v7.preference.PreferenceGroup$PreferencePositionCallback>
			//   35   74:aload_0         
			//   36   75:getfield        #25  <Field String val$key>
			//   37   78:invokeinterface #60  <Method int android.support.v7.preference.PreferenceGroup$PreferencePositionCallback.getPreferenceAdapterPosition(String)>
			//   38   83:istore_1        
						if(i == -1)
							break label0;
						mList.scrollToPosition(i);
					}
					return;
				}
			//*  39   84:goto            53
				adapter.registerAdapterDataObserver(((android.support.v7.widget.RecyclerView.AdapterDataObserver) (new ScrollToPreferenceObserver(adapter, mList, preference, key))));
			//   40   87:aload_2         
			//   41   88:new             #62  <Class PreferenceFragment$ScrollToPreferenceObserver>
			//   42   91:dup             
			//   43   92:aload_2         
			//   44   93:aload_0         
			//   45   94:getfield        #21  <Field PreferenceFragment this$0>
			//   46   97:invokestatic    #34  <Method RecyclerView PreferenceFragment.access$200(PreferenceFragment)>
			//   47  100:aload_0         
			//   48  101:getfield        #23  <Field Preference val$preference>
			//   49  104:aload_0         
			//   50  105:getfield        #25  <Field String val$key>
			//   51  108:invokespecial   #65  <Method void PreferenceFragment$ScrollToPreferenceObserver(android.support.v7.widget.RecyclerView$Adapter, RecyclerView, Preference, String)>
			//   52  111:invokevirtual   #71  <Method void android.support.v7.widget.RecyclerView$Adapter.registerAdapterDataObserver(android.support.v7.widget.RecyclerView$AdapterDataObserver)>
			//   53  114:return          
			}

			final PreferenceFragment this$0;
			final String val$key;
			final Preference val$preference;

			
			{
				this$0 = PreferenceFragment.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #21  <Field PreferenceFragment this$0>
				preference = preference1;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #23  <Field Preference val$preference>
				key = s;
			//    6   10:aload_0         
			//    7   11:aload_3         
			//    8   12:putfield        #25  <Field String val$key>
				super();
			//    9   15:aload_0         
			//   10   16:invokespecial   #28  <Method void Object()>
			//   11   19:return          
			}
		}
));
	//    0    0:new             #18  <Class PreferenceFragment$3>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:aload_2         
	//    5    7:invokespecial   #153 <Method void PreferenceFragment$3(PreferenceFragment, Preference, String)>
	//    6   10:astore_1        
		if(mList == null)
	//*   7   11:aload_0         
	//*   8   12:getfield        #96  <Field RecyclerView mList>
	//*   9   15:ifnonnull       24
		{
			mSelectPreferenceRunnable = ((Runnable) (preference));
	//   10   18:aload_0         
	//   11   19:aload_1         
	//   12   20:putfield        #155 <Field Runnable mSelectPreferenceRunnable>
			return;
	//   13   23:return          
		} else
		{
			((Runnable) (preference)).run();
	//   14   24:aload_1         
	//   15   25:invokeinterface #160 <Method void Runnable.run()>
			return;
	//   16   30:return          
		}
	}

	private void unbindPreferences()
	{
		PreferenceScreen preferencescreen = getPreferenceScreen();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #100 <Method PreferenceScreen getPreferenceScreen()>
	//    2    4:astore_1        
		if(preferencescreen != null)
	//*   3    5:aload_1         
	//*   4    6:ifnull          13
			preferencescreen.onDetached();
	//    5    9:aload_1         
	//    6   10:invokevirtual   #164 <Method void PreferenceScreen.onDetached()>
		onUnbindPreferences();
	//    7   13:aload_0         
	//    8   14:invokevirtual   #167 <Method void onUnbindPreferences()>
	//    9   17:return          
	}

	public void addPreferencesFromResource(int i)
	{
		requirePreferenceManager();
	//    0    0:aload_0         
	//    1    1:invokespecial   #172 <Method void requirePreferenceManager()>
		setPreferenceScreen(mPreferenceManager.inflateFromResource(mStyledContext, i, getPreferenceScreen()));
	//    2    4:aload_0         
	//    3    5:aload_0         
	//    4    6:getfield        #141 <Field PreferenceManager mPreferenceManager>
	//    5    9:aload_0         
	//    6   10:getfield        #174 <Field Context mStyledContext>
	//    7   13:iload_1         
	//    8   14:aload_0         
	//    9   15:invokevirtual   #100 <Method PreferenceScreen getPreferenceScreen()>
	//   10   18:invokevirtual   #180 <Method PreferenceScreen PreferenceManager.inflateFromResource(Context, int, PreferenceScreen)>
	//   11   21:invokevirtual   #184 <Method void setPreferenceScreen(PreferenceScreen)>
	//   12   24:return          
	}

	public Preference findPreference(CharSequence charsequence)
	{
		if(mPreferenceManager == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #141 <Field PreferenceManager mPreferenceManager>
	//*   2    4:ifnonnull       9
			return null;
	//    3    7:aconst_null     
	//    4    8:areturn         
		else
			return mPreferenceManager.findPreference(charsequence);
	//    5    9:aload_0         
	//    6   10:getfield        #141 <Field PreferenceManager mPreferenceManager>
	//    7   13:aload_1         
	//    8   14:invokevirtual   #189 <Method Preference PreferenceManager.findPreference(CharSequence)>
	//    9   17:areturn         
	}

	public Fragment getCallbackFragment()
	{
		return null;
	//    0    0:aconst_null     
	//    1    1:areturn         
	}

	public final RecyclerView getListView()
	{
		return mList;
	//    0    0:aload_0         
	//    1    1:getfield        #96  <Field RecyclerView mList>
	//    2    4:areturn         
	}

	public PreferenceManager getPreferenceManager()
	{
		return mPreferenceManager;
	//    0    0:aload_0         
	//    1    1:getfield        #141 <Field PreferenceManager mPreferenceManager>
	//    2    4:areturn         
	}

	public PreferenceScreen getPreferenceScreen()
	{
		return mPreferenceManager.getPreferenceScreen();
	//    0    0:aload_0         
	//    1    1:getfield        #141 <Field PreferenceManager mPreferenceManager>
	//    2    4:invokevirtual   #199 <Method PreferenceScreen PreferenceManager.getPreferenceScreen()>
	//    3    7:areturn         
	}

	public void onActivityCreated(Bundle bundle)
	{
		super.onActivityCreated(bundle);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #203 <Method void Fragment.onActivityCreated(Bundle)>
		if(bundle != null)
	//*   3    5:aload_1         
	//*   4    6:ifnull          34
		{
			bundle = bundle.getBundle("android:preferences");
	//    5    9:aload_1         
	//    6   10:ldc1            #46  <String "android:preferences">
	//    7   12:invokevirtual   #209 <Method Bundle Bundle.getBundle(String)>
	//    8   15:astore_1        
			if(bundle != null)
	//*   9   16:aload_1         
	//*  10   17:ifnull          34
			{
				PreferenceScreen preferencescreen = getPreferenceScreen();
	//   11   20:aload_0         
	//   12   21:invokevirtual   #100 <Method PreferenceScreen getPreferenceScreen()>
	//   13   24:astore_2        
				if(preferencescreen != null)
	//*  14   25:aload_2         
	//*  15   26:ifnull          34
					preferencescreen.restoreHierarchyState(bundle);
	//   16   29:aload_2         
	//   17   30:aload_1         
	//   18   31:invokevirtual   #212 <Method void PreferenceScreen.restoreHierarchyState(Bundle)>
			}
		}
	//   19   34:return          
	}

	protected void onBindPreferences()
	{
	//    0    0:return          
	}

	public void onCreate(Bundle bundle)
	{
		super.onCreate(bundle);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #215 <Method void Fragment.onCreate(Bundle)>
		Object obj = ((Object) (new TypedValue()));
	//    3    5:new             #217 <Class TypedValue>
	//    4    8:dup             
	//    5    9:invokespecial   #218 <Method void TypedValue()>
	//    6   12:astore_3        
		getActivity().getTheme().resolveAttribute(android.support.v7.preference.R.attr.preferenceTheme, ((TypedValue) (obj)), true);
	//    7   13:aload_0         
	//    8   14:invokevirtual   #222 <Method Activity getActivity()>
	//    9   17:invokevirtual   #228 <Method android.content.res.Resources$Theme Activity.getTheme()>
	//   10   20:getstatic       #233 <Field int android.support.v7.preference.R$attr.preferenceTheme>
	//   11   23:aload_3         
	//   12   24:iconst_1        
	//   13   25:invokevirtual   #239 <Method boolean android.content.res.Resources$Theme.resolveAttribute(int, TypedValue, boolean)>
	//   14   28:pop             
		int i = ((TypedValue) (obj)).resourceId;
	//   15   29:aload_3         
	//   16   30:getfield        #242 <Field int TypedValue.resourceId>
	//   17   33:istore_2        
		if(i <= 0)
	//*  18   34:iload_2         
	//*  19   35:ifgt            48
			throw new IllegalStateException("Must specify preferenceTheme in theme");
	//   20   38:new             #244 <Class IllegalStateException>
	//   21   41:dup             
	//   22   42:ldc1            #246 <String "Must specify preferenceTheme in theme">
	//   23   44:invokespecial   #247 <Method void IllegalStateException(String)>
	//   24   47:athrow          
		mStyledContext = ((Context) (new ContextThemeWrapper(((Context) (getActivity())), i)));
	//   25   48:aload_0         
	//   26   49:new             #249 <Class ContextThemeWrapper>
	//   27   52:dup             
	//   28   53:aload_0         
	//   29   54:invokevirtual   #222 <Method Activity getActivity()>
	//   30   57:iload_2         
	//   31   58:invokespecial   #252 <Method void ContextThemeWrapper(Context, int)>
	//   32   61:putfield        #174 <Field Context mStyledContext>
		mPreferenceManager = new PreferenceManager(mStyledContext);
	//   33   64:aload_0         
	//   34   65:new             #176 <Class PreferenceManager>
	//   35   68:dup             
	//   36   69:aload_0         
	//   37   70:getfield        #174 <Field Context mStyledContext>
	//   38   73:invokespecial   #255 <Method void PreferenceManager(Context)>
	//   39   76:putfield        #141 <Field PreferenceManager mPreferenceManager>
		mPreferenceManager.setOnNavigateToScreenListener(((android.support.v7.preference.PreferenceManager.OnNavigateToScreenListener) (this)));
	//   40   79:aload_0         
	//   41   80:getfield        #141 <Field PreferenceManager mPreferenceManager>
	//   42   83:aload_0         
	//   43   84:invokevirtual   #259 <Method void PreferenceManager.setOnNavigateToScreenListener(android.support.v7.preference.PreferenceManager$OnNavigateToScreenListener)>
		if(getArguments() != null)
	//*  44   87:aload_0         
	//*  45   88:invokevirtual   #263 <Method Bundle getArguments()>
	//*  46   91:ifnull          111
			obj = ((Object) (getArguments().getString("android.support.v7.preference.PreferenceFragmentCompat.PREFERENCE_ROOT")));
	//   47   94:aload_0         
	//   48   95:invokevirtual   #263 <Method Bundle getArguments()>
	//   49   98:ldc1            #37  <String "android.support.v7.preference.PreferenceFragmentCompat.PREFERENCE_ROOT">
	//   50  100:invokevirtual   #267 <Method String Bundle.getString(String)>
	//   51  103:astore_3        
		else
	//*  52  104:aload_0         
	//*  53  105:aload_1         
	//*  54  106:aload_3         
	//*  55  107:invokevirtual   #271 <Method void onCreatePreferences(Bundle, String)>
	//*  56  110:return          
			obj = null;
	//   57  111:aconst_null     
	//   58  112:astore_3        
		onCreatePreferences(bundle, ((String) (obj)));
	//*  59  113:goto            104
	}

	protected android.support.v7.widget.RecyclerView.Adapter onCreateAdapter(PreferenceScreen preferencescreen)
	{
		return ((android.support.v7.widget.RecyclerView.Adapter) (new PreferenceGroupAdapter(((android.support.v7.preference.PreferenceGroup) (preferencescreen)))));
	//    0    0:new             #273 <Class PreferenceGroupAdapter>
	//    1    3:dup             
	//    2    4:aload_1         
	//    3    5:invokespecial   #276 <Method void PreferenceGroupAdapter(android.support.v7.preference.PreferenceGroup)>
	//    4    8:areturn         
	}

	public android.support.v7.widget.RecyclerView.LayoutManager onCreateLayoutManager()
	{
		return ((android.support.v7.widget.RecyclerView.LayoutManager) (new LinearLayoutManager(((Context) (getActivity())))));
	//    0    0:new             #280 <Class LinearLayoutManager>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokevirtual   #222 <Method Activity getActivity()>
	//    4    8:invokespecial   #281 <Method void LinearLayoutManager(Context)>
	//    5   11:areturn         
	}

	public abstract void onCreatePreferences(Bundle bundle, String s);

	public RecyclerView onCreateRecyclerView(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
	{
		layoutinflater = ((LayoutInflater) ((RecyclerView)layoutinflater.inflate(android.support.v7.preference.R.layout.preference_recyclerview, viewgroup, false)));
	//    0    0:aload_1         
	//    1    1:getstatic       #286 <Field int android.support.v7.preference.R$layout.preference_recyclerview>
	//    2    4:aload_2         
	//    3    5:iconst_0        
	//    4    6:invokevirtual   #292 <Method View LayoutInflater.inflate(int, ViewGroup, boolean)>
	//    5    9:checkcast       #110 <Class RecyclerView>
	//    6   12:astore_1        
		((RecyclerView) (layoutinflater)).setLayoutManager(onCreateLayoutManager());
	//    7   13:aload_1         
	//    8   14:aload_0         
	//    9   15:invokevirtual   #294 <Method android.support.v7.widget.RecyclerView$LayoutManager onCreateLayoutManager()>
	//   10   18:invokevirtual   #298 <Method void RecyclerView.setLayoutManager(android.support.v7.widget.RecyclerView$LayoutManager)>
		((RecyclerView) (layoutinflater)).setAccessibilityDelegateCompat(((android.support.v7.widget.RecyclerViewAccessibilityDelegate) (new PreferenceRecyclerViewAccessibilityDelegate(((RecyclerView) (layoutinflater))))));
	//   11   21:aload_1         
	//   12   22:new             #300 <Class PreferenceRecyclerViewAccessibilityDelegate>
	//   13   25:dup             
	//   14   26:aload_1         
	//   15   27:invokespecial   #303 <Method void PreferenceRecyclerViewAccessibilityDelegate(RecyclerView)>
	//   16   30:invokevirtual   #307 <Method void RecyclerView.setAccessibilityDelegateCompat(android.support.v7.widget.RecyclerViewAccessibilityDelegate)>
		return ((RecyclerView) (layoutinflater));
	//   17   33:aload_1         
	//   18   34:areturn         
	}

	public View onCreateView(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
	{
		Object obj = ((Object) (mStyledContext.obtainStyledAttributes(((android.util.AttributeSet) (null)), R.styleable.PreferenceFragment, TypedArrayUtils.getAttr(mStyledContext, android.support.v7.preference.R.attr.preferenceFragmentStyle, 0x1010506), 0)));
	//    0    0:aload_0         
	//    1    1:getfield        #174 <Field Context mStyledContext>
	//    2    4:aconst_null     
	//    3    5:getstatic       #315 <Field int[] R$styleable.PreferenceFragment>
	//    4    8:aload_0         
	//    5    9:getfield        #174 <Field Context mStyledContext>
	//    6   12:getstatic       #318 <Field int android.support.v7.preference.R$attr.preferenceFragmentStyle>
	//    7   15:ldc2            #319 <Int 0x1010506>
	//    8   18:invokestatic    #325 <Method int TypedArrayUtils.getAttr(Context, int, int)>
	//    9   21:iconst_0        
	//   10   22:invokevirtual   #331 <Method TypedArray Context.obtainStyledAttributes(android.util.AttributeSet, int[], int, int)>
	//   11   25:astore          7
		mLayoutResId = ((TypedArray) (obj)).getResourceId(R.styleable.PreferenceFragment_android_layout, mLayoutResId);
	//   12   27:aload_0         
	//   13   28:aload           7
	//   14   30:getstatic       #334 <Field int R$styleable.PreferenceFragment_android_layout>
	//   15   33:aload_0         
	//   16   34:getfield        #74  <Field int mLayoutResId>
	//   17   37:invokevirtual   #340 <Method int TypedArray.getResourceId(int, int)>
	//   18   40:putfield        #74  <Field int mLayoutResId>
		Drawable drawable = ((TypedArray) (obj)).getDrawable(R.styleable.PreferenceFragment_android_divider);
	//   19   43:aload           7
	//   20   45:getstatic       #343 <Field int R$styleable.PreferenceFragment_android_divider>
	//   21   48:invokevirtual   #347 <Method Drawable TypedArray.getDrawable(int)>
	//   22   51:astore          6
		int i = ((TypedArray) (obj)).getDimensionPixelSize(R.styleable.PreferenceFragment_android_dividerHeight, -1);
	//   23   53:aload           7
	//   24   55:getstatic       #350 <Field int R$styleable.PreferenceFragment_android_dividerHeight>
	//   25   58:iconst_m1       
	//   26   59:invokevirtual   #353 <Method int TypedArray.getDimensionPixelSize(int, int)>
	//   27   62:istore          4
		((TypedArray) (obj)).recycle();
	//   28   64:aload           7
	//   29   66:invokevirtual   #356 <Method void TypedArray.recycle()>
		obj = ((Object) (new TypedValue()));
	//   30   69:new             #217 <Class TypedValue>
	//   31   72:dup             
	//   32   73:invokespecial   #218 <Method void TypedValue()>
	//   33   76:astore          7
		getActivity().getTheme().resolveAttribute(android.support.v7.preference.R.attr.preferenceTheme, ((TypedValue) (obj)), true);
	//   34   78:aload_0         
	//   35   79:invokevirtual   #222 <Method Activity getActivity()>
	//   36   82:invokevirtual   #228 <Method android.content.res.Resources$Theme Activity.getTheme()>
	//   37   85:getstatic       #233 <Field int android.support.v7.preference.R$attr.preferenceTheme>
	//   38   88:aload           7
	//   39   90:iconst_1        
	//   40   91:invokevirtual   #239 <Method boolean android.content.res.Resources$Theme.resolveAttribute(int, TypedValue, boolean)>
	//   41   94:pop             
		int j = ((TypedValue) (obj)).resourceId;
	//   42   95:aload           7
	//   43   97:getfield        #242 <Field int TypedValue.resourceId>
	//   44  100:istore          5
		layoutinflater = layoutinflater.cloneInContext(((Context) (new ContextThemeWrapper(layoutinflater.getContext(), j))));
	//   45  102:aload_1         
	//   46  103:new             #249 <Class ContextThemeWrapper>
	//   47  106:dup             
	//   48  107:aload_1         
	//   49  108:invokevirtual   #360 <Method Context LayoutInflater.getContext()>
	//   50  111:iload           5
	//   51  113:invokespecial   #252 <Method void ContextThemeWrapper(Context, int)>
	//   52  116:invokevirtual   #364 <Method LayoutInflater LayoutInflater.cloneInContext(Context)>
	//   53  119:astore_1        
		viewgroup = ((ViewGroup) (layoutinflater.inflate(mLayoutResId, viewgroup, false)));
	//   54  120:aload_1         
	//   55  121:aload_0         
	//   56  122:getfield        #74  <Field int mLayoutResId>
	//   57  125:aload_2         
	//   58  126:iconst_0        
	//   59  127:invokevirtual   #292 <Method View LayoutInflater.inflate(int, ViewGroup, boolean)>
	//   60  130:astore_2        
		obj = ((Object) (((View) (viewgroup)).findViewById(0x102003f)));
	//   61  131:aload_2         
	//   62  132:ldc2            #365 <Int 0x102003f>
	//   63  135:invokevirtual   #371 <Method View View.findViewById(int)>
	//   64  138:astore          7
		if(!(obj instanceof ViewGroup))
	//*  65  140:aload           7
	//*  66  142:instanceof      #373 <Class ViewGroup>
	//*  67  145:ifne            159
			throw new RuntimeException("Content has view with id attribute 'android.R.id.list_container' that is not a ViewGroup class");
	//   68  148:new             #143 <Class RuntimeException>
	//   69  151:dup             
	//   70  152:ldc2            #375 <String "Content has view with id attribute 'android.R.id.list_container' that is not a ViewGroup class">
	//   71  155:invokespecial   #148 <Method void RuntimeException(String)>
	//   72  158:athrow          
		obj = ((Object) ((ViewGroup)obj));
	//   73  159:aload           7
	//   74  161:checkcast       #373 <Class ViewGroup>
	//   75  164:astore          7
		layoutinflater = ((LayoutInflater) (onCreateRecyclerView(layoutinflater, ((ViewGroup) (obj)), bundle)));
	//   76  166:aload_0         
	//   77  167:aload_1         
	//   78  168:aload           7
	//   79  170:aload_3         
	//   80  171:invokevirtual   #377 <Method RecyclerView onCreateRecyclerView(LayoutInflater, ViewGroup, Bundle)>
	//   81  174:astore_1        
		if(layoutinflater == null)
	//*  82  175:aload_1         
	//*  83  176:ifnonnull       190
			throw new RuntimeException("Could not create RecyclerView");
	//   84  179:new             #143 <Class RuntimeException>
	//   85  182:dup             
	//   86  183:ldc2            #379 <String "Could not create RecyclerView">
	//   87  186:invokespecial   #148 <Method void RuntimeException(String)>
	//   88  189:athrow          
		mList = ((RecyclerView) (layoutinflater));
	//   89  190:aload_0         
	//   90  191:aload_1         
	//   91  192:putfield        #96  <Field RecyclerView mList>
		((RecyclerView) (layoutinflater)).addItemDecoration(((android.support.v7.widget.RecyclerView.ItemDecoration) (mDividerDecoration)));
	//   92  195:aload_1         
	//   93  196:aload_0         
	//   94  197:getfield        #79  <Field PreferenceFragment$DividerDecoration mDividerDecoration>
	//   95  200:invokevirtual   #383 <Method void RecyclerView.addItemDecoration(android.support.v7.widget.RecyclerView$ItemDecoration)>
		setDivider(drawable);
	//   96  203:aload_0         
	//   97  204:aload           6
	//   98  206:invokevirtual   #387 <Method void setDivider(Drawable)>
		if(i != -1)
	//*  99  209:iload           4
	//* 100  211:iconst_m1       
	//* 101  212:icmpeq          221
			setDividerHeight(i);
	//  102  215:aload_0         
	//  103  216:iload           4
	//  104  218:invokevirtual   #390 <Method void setDividerHeight(int)>
		((ViewGroup) (obj)).addView(((View) (mList)));
	//  105  221:aload           7
	//  106  223:aload_0         
	//  107  224:getfield        #96  <Field RecyclerView mList>
	//  108  227:invokevirtual   #394 <Method void ViewGroup.addView(View)>
		mHandler.post(mRequestFocus);
	//  109  230:aload_0         
	//  110  231:getfield        #84  <Field Handler mHandler>
	//  111  234:aload_0         
	//  112  235:getfield        #87  <Field Runnable mRequestFocus>
	//  113  238:invokevirtual   #398 <Method boolean Handler.post(Runnable)>
	//  114  241:pop             
		return ((View) (viewgroup));
	//  115  242:aload_2         
	//  116  243:areturn         
	}

	public void onDestroyView()
	{
		mHandler.removeCallbacks(mRequestFocus);
	//    0    0:aload_0         
	//    1    1:getfield        #84  <Field Handler mHandler>
	//    2    4:aload_0         
	//    3    5:getfield        #87  <Field Runnable mRequestFocus>
	//    4    8:invokevirtual   #403 <Method void Handler.removeCallbacks(Runnable)>
		mHandler.removeMessages(1);
	//    5   11:aload_0         
	//    6   12:getfield        #84  <Field Handler mHandler>
	//    7   15:iconst_1        
	//    8   16:invokevirtual   #406 <Method void Handler.removeMessages(int)>
		if(mHavePrefs)
	//*   9   19:aload_0         
	//*  10   20:getfield        #408 <Field boolean mHavePrefs>
	//*  11   23:ifeq            30
			unbindPreferences();
	//   12   26:aload_0         
	//   13   27:invokespecial   #410 <Method void unbindPreferences()>
		mList = null;
	//   14   30:aload_0         
	//   15   31:aconst_null     
	//   16   32:putfield        #96  <Field RecyclerView mList>
		super.onDestroyView();
	//   17   35:aload_0         
	//   18   36:invokespecial   #412 <Method void Fragment.onDestroyView()>
	//   19   39:return          
	}

	public void onDisplayPreferenceDialog(Preference preference)
	{
		boolean flag = false;
	//    0    0:iconst_0        
	//    1    1:istore_2        
		if(getCallbackFragment() instanceof OnPreferenceDisplayDialogCallback)
	//*   2    2:aload_0         
	//*   3    3:invokevirtual   #416 <Method Fragment getCallbackFragment()>
	//*   4    6:instanceof      #23  <Class PreferenceFragment$OnPreferenceDisplayDialogCallback>
	//*   5    9:ifeq            27
			flag = ((OnPreferenceDisplayDialogCallback)getCallbackFragment()).onPreferenceDisplayDialog(this, preference);
	//    6   12:aload_0         
	//    7   13:invokevirtual   #416 <Method Fragment getCallbackFragment()>
	//    8   16:checkcast       #23  <Class PreferenceFragment$OnPreferenceDisplayDialogCallback>
	//    9   19:aload_0         
	//   10   20:aload_1         
	//   11   21:invokeinterface #420 <Method boolean PreferenceFragment$OnPreferenceDisplayDialogCallback.onPreferenceDisplayDialog(PreferenceFragment, Preference)>
	//   12   26:istore_2        
		boolean flag1 = flag;
	//   13   27:iload_2         
	//   14   28:istore_3        
		if(!flag)
	//*  15   29:iload_2         
	//*  16   30:ifne            60
		{
			flag1 = flag;
	//   17   33:iload_2         
	//   18   34:istore_3        
			if(getActivity() instanceof OnPreferenceDisplayDialogCallback)
	//*  19   35:aload_0         
	//*  20   36:invokevirtual   #222 <Method Activity getActivity()>
	//*  21   39:instanceof      #23  <Class PreferenceFragment$OnPreferenceDisplayDialogCallback>
	//*  22   42:ifeq            60
				flag1 = ((OnPreferenceDisplayDialogCallback)getActivity()).onPreferenceDisplayDialog(this, preference);
	//   23   45:aload_0         
	//   24   46:invokevirtual   #222 <Method Activity getActivity()>
	//   25   49:checkcast       #23  <Class PreferenceFragment$OnPreferenceDisplayDialogCallback>
	//   26   52:aload_0         
	//   27   53:aload_1         
	//   28   54:invokeinterface #420 <Method boolean PreferenceFragment$OnPreferenceDisplayDialogCallback.onPreferenceDisplayDialog(PreferenceFragment, Preference)>
	//   29   59:istore_3        
		}
		while(flag1 || getFragmentManager().findFragmentByTag("android.support.v14.preference.PreferenceFragment.DIALOG") != null) 
	//*  30   60:iload_3         
	//*  31   61:ifeq            65
			return;
	//   32   64:return          
	//   33   65:aload_0         
	//   34   66:invokevirtual   #424 <Method FragmentManager getFragmentManager()>
	//   35   69:ldc1            #40  <String "android.support.v14.preference.PreferenceFragment.DIALOG">
	//   36   71:invokevirtual   #430 <Method Fragment FragmentManager.findFragmentByTag(String)>
	//   37   74:ifnonnull       64
		if(preference instanceof EditTextPreference)
	//*  38   77:aload_1         
	//*  39   78:instanceof      #432 <Class EditTextPreference>
	//*  40   81:ifeq            109
			preference = ((Preference) (EditTextPreferenceDialogFragment.newInstance(preference.getKey())));
	//   41   84:aload_1         
	//   42   85:invokevirtual   #438 <Method String Preference.getKey()>
	//   43   88:invokestatic    #444 <Method EditTextPreferenceDialogFragment EditTextPreferenceDialogFragment.newInstance(String)>
	//   44   91:astore_1        
		else
	//*  45   92:aload_1         
	//*  46   93:aload_0         
	//*  47   94:iconst_0        
	//*  48   95:invokevirtual   #450 <Method void DialogFragment.setTargetFragment(Fragment, int)>
	//*  49   98:aload_1         
	//*  50   99:aload_0         
	//*  51  100:invokevirtual   #424 <Method FragmentManager getFragmentManager()>
	//*  52  103:ldc1            #40  <String "android.support.v14.preference.PreferenceFragment.DIALOG">
	//*  53  105:invokevirtual   #454 <Method void DialogFragment.show(FragmentManager, String)>
	//*  54  108:return          
		if(preference instanceof ListPreference)
	//*  55  109:aload_1         
	//*  56  110:instanceof      #456 <Class ListPreference>
	//*  57  113:ifeq            127
			preference = ((Preference) (ListPreferenceDialogFragment.newInstance(preference.getKey())));
	//   58  116:aload_1         
	//   59  117:invokevirtual   #438 <Method String Preference.getKey()>
	//   60  120:invokestatic    #461 <Method ListPreferenceDialogFragment ListPreferenceDialogFragment.newInstance(String)>
	//   61  123:astore_1        
		else
	//*  62  124:goto            92
		if(preference instanceof MultiSelectListPreference)
	//*  63  127:aload_1         
	//*  64  128:instanceof      #463 <Class MultiSelectListPreference>
	//*  65  131:ifeq            145
			preference = ((Preference) (MultiSelectListPreferenceDialogFragment.newInstance(preference.getKey())));
	//   66  134:aload_1         
	//   67  135:invokevirtual   #438 <Method String Preference.getKey()>
	//   68  138:invokestatic    #468 <Method MultiSelectListPreferenceDialogFragment MultiSelectListPreferenceDialogFragment.newInstance(String)>
	//   69  141:astore_1        
		else
	//*  70  142:goto            92
			throw new IllegalArgumentException("Tried to display dialog for unknown preference type. Did you forget to override onDisplayPreferenceDialog()?");
	//   71  145:new             #470 <Class IllegalArgumentException>
	//   72  148:dup             
	//   73  149:ldc2            #472 <String "Tried to display dialog for unknown preference type. Did you forget to override onDisplayPreferenceDialog()?">
	//   74  152:invokespecial   #473 <Method void IllegalArgumentException(String)>
	//   75  155:athrow          
		((DialogFragment) (preference)).setTargetFragment(((Fragment) (this)), 0);
		((DialogFragment) (preference)).show(getFragmentManager(), "android.support.v14.preference.PreferenceFragment.DIALOG");
	}

	public void onNavigateToScreen(PreferenceScreen preferencescreen)
	{
		boolean flag = false;
	//    0    0:iconst_0        
	//    1    1:istore_2        
		if(getCallbackFragment() instanceof OnPreferenceStartScreenCallback)
	//*   2    2:aload_0         
	//*   3    3:invokevirtual   #416 <Method Fragment getCallbackFragment()>
	//*   4    6:instanceof      #29  <Class PreferenceFragment$OnPreferenceStartScreenCallback>
	//*   5    9:ifeq            27
			flag = ((OnPreferenceStartScreenCallback)getCallbackFragment()).onPreferenceStartScreen(this, preferencescreen);
	//    6   12:aload_0         
	//    7   13:invokevirtual   #416 <Method Fragment getCallbackFragment()>
	//    8   16:checkcast       #29  <Class PreferenceFragment$OnPreferenceStartScreenCallback>
	//    9   19:aload_0         
	//   10   20:aload_1         
	//   11   21:invokeinterface #478 <Method boolean PreferenceFragment$OnPreferenceStartScreenCallback.onPreferenceStartScreen(PreferenceFragment, PreferenceScreen)>
	//   12   26:istore_2        
		if(!flag && (getActivity() instanceof OnPreferenceStartScreenCallback))
	//*  13   27:iload_2         
	//*  14   28:ifne            56
	//*  15   31:aload_0         
	//*  16   32:invokevirtual   #222 <Method Activity getActivity()>
	//*  17   35:instanceof      #29  <Class PreferenceFragment$OnPreferenceStartScreenCallback>
	//*  18   38:ifeq            56
			((OnPreferenceStartScreenCallback)getActivity()).onPreferenceStartScreen(this, preferencescreen);
	//   19   41:aload_0         
	//   20   42:invokevirtual   #222 <Method Activity getActivity()>
	//   21   45:checkcast       #29  <Class PreferenceFragment$OnPreferenceStartScreenCallback>
	//   22   48:aload_0         
	//   23   49:aload_1         
	//   24   50:invokeinterface #478 <Method boolean PreferenceFragment$OnPreferenceStartScreenCallback.onPreferenceStartScreen(PreferenceFragment, PreferenceScreen)>
	//   25   55:pop             
	//   26   56:return          
	}

	public boolean onPreferenceTreeClick(Preference preference)
	{
		if(preference.getFragment() != null)
	//*   0    0:aload_1         
	//*   1    1:invokevirtual   #483 <Method String Preference.getFragment()>
	//*   2    4:ifnull          69
		{
			boolean flag = false;
	//    3    7:iconst_0        
	//    4    8:istore_2        
			if(getCallbackFragment() instanceof OnPreferenceStartFragmentCallback)
	//*   5    9:aload_0         
	//*   6   10:invokevirtual   #416 <Method Fragment getCallbackFragment()>
	//*   7   13:instanceof      #26  <Class PreferenceFragment$OnPreferenceStartFragmentCallback>
	//*   8   16:ifeq            34
				flag = ((OnPreferenceStartFragmentCallback)getCallbackFragment()).onPreferenceStartFragment(this, preference);
	//    9   19:aload_0         
	//   10   20:invokevirtual   #416 <Method Fragment getCallbackFragment()>
	//   11   23:checkcast       #26  <Class PreferenceFragment$OnPreferenceStartFragmentCallback>
	//   12   26:aload_0         
	//   13   27:aload_1         
	//   14   28:invokeinterface #486 <Method boolean PreferenceFragment$OnPreferenceStartFragmentCallback.onPreferenceStartFragment(PreferenceFragment, Preference)>
	//   15   33:istore_2        
			boolean flag1 = flag;
	//   16   34:iload_2         
	//   17   35:istore_3        
			if(!flag)
	//*  18   36:iload_2         
	//*  19   37:ifne            67
			{
				flag1 = flag;
	//   20   40:iload_2         
	//   21   41:istore_3        
				if(getActivity() instanceof OnPreferenceStartFragmentCallback)
	//*  22   42:aload_0         
	//*  23   43:invokevirtual   #222 <Method Activity getActivity()>
	//*  24   46:instanceof      #26  <Class PreferenceFragment$OnPreferenceStartFragmentCallback>
	//*  25   49:ifeq            67
					flag1 = ((OnPreferenceStartFragmentCallback)getActivity()).onPreferenceStartFragment(this, preference);
	//   26   52:aload_0         
	//   27   53:invokevirtual   #222 <Method Activity getActivity()>
	//   28   56:checkcast       #26  <Class PreferenceFragment$OnPreferenceStartFragmentCallback>
	//   29   59:aload_0         
	//   30   60:aload_1         
	//   31   61:invokeinterface #486 <Method boolean PreferenceFragment$OnPreferenceStartFragmentCallback.onPreferenceStartFragment(PreferenceFragment, Preference)>
	//   32   66:istore_3        
			}
			return flag1;
	//   33   67:iload_3         
	//   34   68:ireturn         
		} else
		{
			return false;
	//   35   69:iconst_0        
	//   36   70:ireturn         
		}
	}

	public void onSaveInstanceState(Bundle bundle)
	{
		super.onSaveInstanceState(bundle);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #489 <Method void Fragment.onSaveInstanceState(Bundle)>
		PreferenceScreen preferencescreen = getPreferenceScreen();
	//    3    5:aload_0         
	//    4    6:invokevirtual   #100 <Method PreferenceScreen getPreferenceScreen()>
	//    5    9:astore_2        
		if(preferencescreen != null)
	//*   6   10:aload_2         
	//*   7   11:ifnull          34
		{
			Bundle bundle1 = new Bundle();
	//    8   14:new             #205 <Class Bundle>
	//    9   17:dup             
	//   10   18:invokespecial   #490 <Method void Bundle()>
	//   11   21:astore_3        
			preferencescreen.saveHierarchyState(bundle1);
	//   12   22:aload_2         
	//   13   23:aload_3         
	//   14   24:invokevirtual   #493 <Method void PreferenceScreen.saveHierarchyState(Bundle)>
			bundle.putBundle("android:preferences", bundle1);
	//   15   27:aload_1         
	//   16   28:ldc1            #46  <String "android:preferences">
	//   17   30:aload_3         
	//   18   31:invokevirtual   #497 <Method void Bundle.putBundle(String, Bundle)>
		}
	//   19   34:return          
	}

	public void onStart()
	{
		super.onStart();
	//    0    0:aload_0         
	//    1    1:invokespecial   #500 <Method void Fragment.onStart()>
		mPreferenceManager.setOnPreferenceTreeClickListener(((android.support.v7.preference.PreferenceManager.OnPreferenceTreeClickListener) (this)));
	//    2    4:aload_0         
	//    3    5:getfield        #141 <Field PreferenceManager mPreferenceManager>
	//    4    8:aload_0         
	//    5    9:invokevirtual   #504 <Method void PreferenceManager.setOnPreferenceTreeClickListener(android.support.v7.preference.PreferenceManager$OnPreferenceTreeClickListener)>
		mPreferenceManager.setOnDisplayPreferenceDialogListener(((android.support.v7.preference.PreferenceManager.OnDisplayPreferenceDialogListener) (this)));
	//    6   12:aload_0         
	//    7   13:getfield        #141 <Field PreferenceManager mPreferenceManager>
	//    8   16:aload_0         
	//    9   17:invokevirtual   #508 <Method void PreferenceManager.setOnDisplayPreferenceDialogListener(android.support.v7.preference.PreferenceManager$OnDisplayPreferenceDialogListener)>
	//   10   20:return          
	}

	public void onStop()
	{
		super.onStop();
	//    0    0:aload_0         
	//    1    1:invokespecial   #511 <Method void Fragment.onStop()>
		mPreferenceManager.setOnPreferenceTreeClickListener(((android.support.v7.preference.PreferenceManager.OnPreferenceTreeClickListener) (null)));
	//    2    4:aload_0         
	//    3    5:getfield        #141 <Field PreferenceManager mPreferenceManager>
	//    4    8:aconst_null     
	//    5    9:invokevirtual   #504 <Method void PreferenceManager.setOnPreferenceTreeClickListener(android.support.v7.preference.PreferenceManager$OnPreferenceTreeClickListener)>
		mPreferenceManager.setOnDisplayPreferenceDialogListener(((android.support.v7.preference.PreferenceManager.OnDisplayPreferenceDialogListener) (null)));
	//    6   12:aload_0         
	//    7   13:getfield        #141 <Field PreferenceManager mPreferenceManager>
	//    8   16:aconst_null     
	//    9   17:invokevirtual   #508 <Method void PreferenceManager.setOnDisplayPreferenceDialogListener(android.support.v7.preference.PreferenceManager$OnDisplayPreferenceDialogListener)>
	//   10   20:return          
	}

	protected void onUnbindPreferences()
	{
	//    0    0:return          
	}

	public void onViewCreated(View view, Bundle bundle)
	{
		super.onViewCreated(view, bundle);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #515 <Method void Fragment.onViewCreated(View, Bundle)>
		if(mHavePrefs)
	//*   4    6:aload_0         
	//*   5    7:getfield        #408 <Field boolean mHavePrefs>
	//*   6   10:ifeq            38
		{
			bindPreferences();
	//    7   13:aload_0         
	//    8   14:invokespecial   #92  <Method void bindPreferences()>
			if(mSelectPreferenceRunnable != null)
	//*   9   17:aload_0         
	//*  10   18:getfield        #155 <Field Runnable mSelectPreferenceRunnable>
	//*  11   21:ifnull          38
			{
				mSelectPreferenceRunnable.run();
	//   12   24:aload_0         
	//   13   25:getfield        #155 <Field Runnable mSelectPreferenceRunnable>
	//   14   28:invokeinterface #160 <Method void Runnable.run()>
				mSelectPreferenceRunnable = null;
	//   15   33:aload_0         
	//   16   34:aconst_null     
	//   17   35:putfield        #155 <Field Runnable mSelectPreferenceRunnable>
			}
		}
		mInitDone = true;
	//   18   38:aload_0         
	//   19   39:iconst_1        
	//   20   40:putfield        #517 <Field boolean mInitDone>
	//   21   43:return          
	}

	public void scrollToPreference(Preference preference)
	{
		scrollToPreferenceInternal(preference, ((String) (null)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aconst_null     
	//    3    3:invokespecial   #520 <Method void scrollToPreferenceInternal(Preference, String)>
	//    4    6:return          
	}

	public void scrollToPreference(String s)
	{
		scrollToPreferenceInternal(((Preference) (null)), s);
	//    0    0:aload_0         
	//    1    1:aconst_null     
	//    2    2:aload_1         
	//    3    3:invokespecial   #520 <Method void scrollToPreferenceInternal(Preference, String)>
	//    4    6:return          
	}

	public void setDivider(Drawable drawable)
	{
		mDividerDecoration.setDivider(drawable);
	//    0    0:aload_0         
	//    1    1:getfield        #79  <Field PreferenceFragment$DividerDecoration mDividerDecoration>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #521 <Method void PreferenceFragment$DividerDecoration.setDivider(Drawable)>
	//    4    8:return          
	}

	public void setDividerHeight(int i)
	{
		mDividerDecoration.setDividerHeight(i);
	//    0    0:aload_0         
	//    1    1:getfield        #79  <Field PreferenceFragment$DividerDecoration mDividerDecoration>
	//    2    4:iload_1         
	//    3    5:invokevirtual   #522 <Method void PreferenceFragment$DividerDecoration.setDividerHeight(int)>
	//    4    8:return          
	}

	public void setPreferenceScreen(PreferenceScreen preferencescreen)
	{
		if(mPreferenceManager.setPreferences(preferencescreen) && preferencescreen != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #141 <Field PreferenceManager mPreferenceManager>
	//*   2    4:aload_1         
	//*   3    5:invokevirtual   #526 <Method boolean PreferenceManager.setPreferences(PreferenceScreen)>
	//*   4    8:ifeq            35
	//*   5   11:aload_1         
	//*   6   12:ifnull          35
		{
			onUnbindPreferences();
	//    7   15:aload_0         
	//    8   16:invokevirtual   #167 <Method void onUnbindPreferences()>
			mHavePrefs = true;
	//    9   19:aload_0         
	//   10   20:iconst_1        
	//   11   21:putfield        #408 <Field boolean mHavePrefs>
			if(mInitDone)
	//*  12   24:aload_0         
	//*  13   25:getfield        #517 <Field boolean mInitDone>
	//*  14   28:ifeq            35
				postBindPreferences();
	//   15   31:aload_0         
	//   16   32:invokespecial   #528 <Method void postBindPreferences()>
		}
	//   17   35:return          
	}

	public void setPreferencesFromResource(int i, String s)
	{
		requirePreferenceManager();
	//    0    0:aload_0         
	//    1    1:invokespecial   #172 <Method void requirePreferenceManager()>
		Object obj = ((Object) (mPreferenceManager.inflateFromResource(mStyledContext, i, ((PreferenceScreen) (null)))));
	//    2    4:aload_0         
	//    3    5:getfield        #141 <Field PreferenceManager mPreferenceManager>
	//    4    8:aload_0         
	//    5    9:getfield        #174 <Field Context mStyledContext>
	//    6   12:iload_1         
	//    7   13:aconst_null     
	//    8   14:invokevirtual   #180 <Method PreferenceScreen PreferenceManager.inflateFromResource(Context, int, PreferenceScreen)>
	//    9   17:astore_3        
		if(s != null)
	//*  10   18:aload_2         
	//*  11   19:ifnull          74
		{
			Preference preference = ((PreferenceScreen) (obj)).findPreference(((CharSequence) (s)));
	//   12   22:aload_3         
	//   13   23:aload_2         
	//   14   24:invokevirtual   #532 <Method Preference PreferenceScreen.findPreference(CharSequence)>
	//   15   27:astore          4
			obj = ((Object) (preference));
	//   16   29:aload           4
	//   17   31:astore_3        
			if(!(preference instanceof PreferenceScreen))
	//*  18   32:aload           4
	//*  19   34:instanceof      #116 <Class PreferenceScreen>
	//*  20   37:ifne            74
				throw new IllegalArgumentException((new StringBuilder()).append("Preference object with key ").append(s).append(" is not a PreferenceScreen").toString());
	//   21   40:new             #470 <Class IllegalArgumentException>
	//   22   43:dup             
	//   23   44:new             #534 <Class StringBuilder>
	//   24   47:dup             
	//   25   48:invokespecial   #535 <Method void StringBuilder()>
	//   26   51:ldc2            #537 <String "Preference object with key ">
	//   27   54:invokevirtual   #541 <Method StringBuilder StringBuilder.append(String)>
	//   28   57:aload_2         
	//   29   58:invokevirtual   #541 <Method StringBuilder StringBuilder.append(String)>
	//   30   61:ldc2            #543 <String " is not a PreferenceScreen">
	//   31   64:invokevirtual   #541 <Method StringBuilder StringBuilder.append(String)>
	//   32   67:invokevirtual   #546 <Method String StringBuilder.toString()>
	//   33   70:invokespecial   #473 <Method void IllegalArgumentException(String)>
	//   34   73:athrow          
		}
		setPreferenceScreen((PreferenceScreen)obj);
	//   35   74:aload_0         
	//   36   75:aload_3         
	//   37   76:checkcast       #116 <Class PreferenceScreen>
	//   38   79:invokevirtual   #184 <Method void setPreferenceScreen(PreferenceScreen)>
	//   39   82:return          
	}

	public static final String ARG_PREFERENCE_ROOT = "android.support.v7.preference.PreferenceFragmentCompat.PREFERENCE_ROOT";
	private static final String DIALOG_FRAGMENT_TAG = "android.support.v14.preference.PreferenceFragment.DIALOG";
	private static final int MSG_BIND_PREFERENCES = 1;
	private static final String PREFERENCES_TAG = "android:preferences";
	private final DividerDecoration mDividerDecoration = new DividerDecoration();
	private Handler mHandler;
	private boolean mHavePrefs;
	private boolean mInitDone;
	private int mLayoutResId;
	private RecyclerView mList;
	private PreferenceManager mPreferenceManager;
	private final Runnable mRequestFocus = new Runnable() {

		public void run()
		{
			mList.focusableViewAvailable(((View) (mList)));
		//    0    0:aload_0         
		//    1    1:getfield        #14  <Field PreferenceFragment this$0>
		//    2    4:invokestatic    #23  <Method RecyclerView PreferenceFragment.access$200(PreferenceFragment)>
		//    3    7:aload_0         
		//    4    8:getfield        #14  <Field PreferenceFragment this$0>
		//    5   11:invokestatic    #23  <Method RecyclerView PreferenceFragment.access$200(PreferenceFragment)>
		//    6   14:invokevirtual   #29  <Method void RecyclerView.focusableViewAvailable(View)>
		//    7   17:return          
		}

		final PreferenceFragment this$0;

			
			{
				this$0 = PreferenceFragment.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #14  <Field PreferenceFragment this$0>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #17  <Method void Object()>
			//    5    9:return          
			}
	}
;
	private Runnable mSelectPreferenceRunnable;
	private Context mStyledContext;


/*
	static void access$100(PreferenceFragment preferencefragment)
	{
		preferencefragment.bindPreferences();
	//    0    0:aload_0         
	//    1    1:invokespecial   #92  <Method void bindPreferences()>
		return;
	//    2    4:return          
	}

*/


/*
	static RecyclerView access$200(PreferenceFragment preferencefragment)
	{
		return preferencefragment.mList;
	//    0    0:aload_0         
	//    1    1:getfield        #96  <Field RecyclerView mList>
	//    2    4:areturn         
	}

*/
}
