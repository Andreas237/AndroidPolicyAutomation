// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v7.preference;

import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.support.v4.view.ViewCompat;
import android.support.v7.widget.RecyclerView;
import android.view.View;

// Referenced classes of package android.support.v7.preference:
//			PreferenceFragmentCompat, PreferenceViewHolder

private class PreferenceFragmentCompat$DividerDecoration extends android.support.v7.widget.RecyclerView.ItemDecoration
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
	//*  10   18:getfield        #17  <Field PreferenceFragmentCompat this$0>
	//*  11   21:invokestatic    #101 <Method RecyclerView PreferenceFragmentCompat.access$200(PreferenceFragmentCompat)>
	//*  12   24:invokevirtual   #104 <Method void RecyclerView.invalidateItemDecorations()>
	//*  13   27:return          
			mDividerHeight = 0;
	//   14   28:aload_0         
	//   15   29:iconst_0        
	//   16   30:putfield        #59  <Field int mDividerHeight>
		mDivider = drawable;
		PreferenceFragmentCompat.access$200(PreferenceFragmentCompat.this).invalidateItemDecorations();
	//*  17   33:goto            12
	}

	public void setDividerHeight(int i)
	{
		mDividerHeight = i;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #59  <Field int mDividerHeight>
		PreferenceFragmentCompat.access$200(PreferenceFragmentCompat.this).invalidateItemDecorations();
	//    3    5:aload_0         
	//    4    6:getfield        #17  <Field PreferenceFragmentCompat this$0>
	//    5    9:invokestatic    #101 <Method RecyclerView PreferenceFragmentCompat.access$200(PreferenceFragmentCompat)>
	//    6   12:invokevirtual   #104 <Method void RecyclerView.invalidateItemDecorations()>
	//    7   15:return          
	}

	private Drawable mDivider;
	private int mDividerHeight;
	final PreferenceFragmentCompat this$0;

	private PreferenceFragmentCompat$DividerDecoration()
	{
		this$0 = PreferenceFragmentCompat.this;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #17  <Field PreferenceFragmentCompat this$0>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #20  <Method void android.support.v7.widget.RecyclerView$ItemDecoration()>
	//    5    9:return          
	}

	PreferenceFragmentCompat$DividerDecoration(PreferenceFragmentCompat._cls1 _pcls1)
	{
		this();
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #24  <Method void PreferenceFragmentCompat$DividerDecoration(PreferenceFragmentCompat)>
	//    3    5:return          
	}
}
