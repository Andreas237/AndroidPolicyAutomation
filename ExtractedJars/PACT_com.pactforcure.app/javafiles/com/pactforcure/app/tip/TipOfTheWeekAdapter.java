// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.pactforcure.app.tip;

import android.content.Context;
import android.content.res.Resources;
import android.view.*;
import android.widget.TextView;
import com.pactforcure.app.studies.Res;

public class TipOfTheWeekAdapter extends android.support.v7.widget.RecyclerView.Adapter
{
	static class TipViewHolder extends android.support.v7.widget.RecyclerView.ViewHolder
	{

		TextView tipContentView;
		TextView tipIndexView;

		TipViewHolder(View view)
		{
			super(view);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokespecial   #14  <Method void android.support.v7.widget.RecyclerView$ViewHolder(View)>
			tipIndexView = (TextView)view.findViewById(0x7f0e012c);
		//    3    5:aload_0         
		//    4    6:aload_1         
		//    5    7:ldc1            #15  <Int 0x7f0e012c>
		//    6    9:invokevirtual   #21  <Method View View.findViewById(int)>
		//    7   12:checkcast       #23  <Class TextView>
		//    8   15:putfield        #25  <Field TextView tipIndexView>
			tipContentView = (TextView)view.findViewById(0x7f0e012d);
		//    9   18:aload_0         
		//   10   19:aload_1         
		//   11   20:ldc1            #26  <Int 0x7f0e012d>
		//   12   22:invokevirtual   #21  <Method View View.findViewById(int)>
		//   13   25:checkcast       #23  <Class TextView>
		//   14   28:putfield        #28  <Field TextView tipContentView>
		//   15   31:return          
		}
	}


	public TipOfTheWeekAdapter(String as[])
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #22  <Method void android.support.v7.widget.RecyclerView$Adapter()>
		tips = as;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #24  <Field String[] tips>
	//    5    9:return          
	}

	public int getItemCount()
	{
		if(tips.length == 0)
	//*   0    0:aload_0         
	//*   1    1:getfield        #24  <Field String[] tips>
	//*   2    4:arraylength     
	//*   3    5:ifne            10
			return 1;
	//    4    8:iconst_1        
	//    5    9:ireturn         
		else
			return tips.length;
	//    6   10:aload_0         
	//    7   11:getfield        #24  <Field String[] tips>
	//    8   14:arraylength     
	//    9   15:ireturn         
	}

	public int getItemViewType(int i)
	{
		return tips.length != 0 ? 1 : 0;
	//    0    0:aload_0         
	//    1    1:getfield        #24  <Field String[] tips>
	//    2    4:arraylength     
	//    3    5:ifne            10
	//    4    8:iconst_0        
	//    5    9:ireturn         
	//    6   10:iconst_1        
	//    7   11:ireturn         
	}

	public volatile void onBindViewHolder(android.support.v7.widget.RecyclerView.ViewHolder viewholder, int i)
	{
		onBindViewHolder((TipViewHolder)viewholder, i);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:checkcast       #7   <Class TipOfTheWeekAdapter$TipViewHolder>
	//    3    5:iload_2         
	//    4    6:invokevirtual   #34  <Method void onBindViewHolder(TipOfTheWeekAdapter$TipViewHolder, int)>
	//    5    9:return          
	}

	public void onBindViewHolder(TipViewHolder tipviewholder, int i)
	{
		int j = getItemViewType(i);
	//    0    0:aload_0         
	//    1    1:iload_2         
	//    2    2:invokevirtual   #36  <Method int getItemViewType(int)>
	//    3    5:istore          4
		boolean flag;
		if(i == 0)
	//*   4    7:iload_2         
	//*   5    8:ifne            101
			flag = true;
	//    6   11:iconst_1        
	//    7   12:istore_3        
		else
	//*   8   13:aload_0         
	//*   9   14:getfield        #24  <Field String[] tips>
	//*  10   17:arraylength     
	//*  11   18:iload_2         
	//*  12   19:isub            
	//*  13   20:iconst_1        
	//*  14   21:isub            
	//*  15   22:istore_2        
	//*  16   23:iload           4
	//*  17   25:tableswitch     0 0: default 44
	//	               0 106
	//*  18   44:aload_1         
	//*  19   45:getfield        #40  <Field TextView TipOfTheWeekAdapter$TipViewHolder.tipIndexView>
	//*  20   48:iload_2         
	//*  21   49:iconst_1        
	//*  22   50:iadd            
	//*  23   51:invokestatic    #46  <Method String String.valueOf(int)>
	//*  24   54:invokevirtual   #52  <Method void TextView.setText(CharSequence)>
	//*  25   57:aload_0         
	//*  26   58:getfield        #24  <Field String[] tips>
	//*  27   61:iload_2         
	//*  28   62:aaload          
	//*  29   63:astore          5
	//*  30   65:aload_1         
	//*  31   66:getfield        #55  <Field TextView TipOfTheWeekAdapter$TipViewHolder.tipContentView>
	//*  32   69:aload           5
	//*  33   71:invokevirtual   #52  <Method void TextView.setText(CharSequence)>
	//*  34   74:iload_3         
	//*  35   75:ifeq            119
	//*  36   78:aload_1         
	//*  37   79:getfield        #40  <Field TextView TipOfTheWeekAdapter$TipViewHolder.tipIndexView>
	//*  38   82:aload_0         
	//*  39   83:getfield        #57  <Field int emphasizingTextColor>
	//*  40   86:invokevirtual   #61  <Method void TextView.setTextColor(int)>
	//*  41   89:aload_1         
	//*  42   90:getfield        #55  <Field TextView TipOfTheWeekAdapter$TipViewHolder.tipContentView>
	//*  43   93:aload_0         
	//*  44   94:getfield        #57  <Field int emphasizingTextColor>
	//*  45   97:invokevirtual   #61  <Method void TextView.setTextColor(int)>
	//*  46  100:return          
			flag = false;
	//   47  101:iconst_0        
	//   48  102:istore_3        
		i = tips.length - i - 1;
		switch(j)
		{
		default:
			tipviewholder.tipIndexView.setText(((CharSequence) (String.valueOf(i + 1))));
			String s = tips[i];
			tipviewholder.tipContentView.setText(((CharSequence) (s)));
			if(flag)
			{
				tipviewholder.tipIndexView.setTextColor(emphasizingTextColor);
				tipviewholder.tipContentView.setTextColor(emphasizingTextColor);
				return;
			} else
	//*  49  103:goto            13
	//*  50  106:aload_1         
	//*  51  107:getfield        #55  <Field TextView TipOfTheWeekAdapter$TipViewHolder.tipContentView>
	//*  52  110:ldc1            #62  <Int 0x7f0802b1>
	//*  53  112:invokestatic    #67  <Method String Res.getStudySpecificString(int)>
	//*  54  115:invokevirtual   #52  <Method void TextView.setText(CharSequence)>
	//*  55  118:return          
			{
				tipviewholder.tipIndexView.setTextColor(regularTextColor);
	//   56  119:aload_1         
	//   57  120:getfield        #40  <Field TextView TipOfTheWeekAdapter$TipViewHolder.tipIndexView>
	//   58  123:aload_0         
	//   59  124:getfield        #69  <Field int regularTextColor>
	//   60  127:invokevirtual   #61  <Method void TextView.setTextColor(int)>
				tipviewholder.tipContentView.setTextColor(regularTextColor);
	//   61  130:aload_1         
	//   62  131:getfield        #55  <Field TextView TipOfTheWeekAdapter$TipViewHolder.tipContentView>
	//   63  134:aload_0         
	//   64  135:getfield        #69  <Field int regularTextColor>
	//   65  138:invokevirtual   #61  <Method void TextView.setTextColor(int)>
				return;
	//   66  141:return          
			}

		case 0: // '\0'
			tipviewholder.tipContentView.setText(((CharSequence) (Res.getStudySpecificString(0x7f0802b1))));
			return;
		}
	}

	public volatile android.support.v7.widget.RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewgroup, int i)
	{
		return ((android.support.v7.widget.RecyclerView.ViewHolder) (onCreateViewHolder(viewgroup, i)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:invokevirtual   #74  <Method TipOfTheWeekAdapter$TipViewHolder onCreateViewHolder(ViewGroup, int)>
	//    4    6:areturn         
	}

	public TipViewHolder onCreateViewHolder(ViewGroup viewgroup, int i)
	{
		Context context = viewgroup.getContext();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #80  <Method Context ViewGroup.getContext()>
	//    2    4:astore_3        
		viewgroup = ((ViewGroup) (LayoutInflater.from(context).inflate(0x7f040043, viewgroup, false)));
	//    3    5:aload_3         
	//    4    6:invokestatic    #86  <Method LayoutInflater LayoutInflater.from(Context)>
	//    5    9:ldc1            #87  <Int 0x7f040043>
	//    6   11:aload_1         
	//    7   12:iconst_0        
	//    8   13:invokevirtual   #91  <Method View LayoutInflater.inflate(int, ViewGroup, boolean)>
	//    9   16:astore_1        
		regularTextColor = context.getResources().getColor(0x7f0d0051);
	//   10   17:aload_0         
	//   11   18:aload_3         
	//   12   19:invokevirtual   #97  <Method Resources Context.getResources()>
	//   13   22:ldc1            #98  <Int 0x7f0d0051>
	//   14   24:invokevirtual   #103 <Method int Resources.getColor(int)>
	//   15   27:putfield        #69  <Field int regularTextColor>
		emphasizingTextColor = context.getResources().getColor(0x7f0d0019);
	//   16   30:aload_0         
	//   17   31:aload_3         
	//   18   32:invokevirtual   #97  <Method Resources Context.getResources()>
	//   19   35:ldc1            #104 <Int 0x7f0d0019>
	//   20   37:invokevirtual   #103 <Method int Resources.getColor(int)>
	//   21   40:putfield        #57  <Field int emphasizingTextColor>
		return new TipViewHolder(((View) (viewgroup)));
	//   22   43:new             #7   <Class TipOfTheWeekAdapter$TipViewHolder>
	//   23   46:dup             
	//   24   47:aload_1         
	//   25   48:invokespecial   #107 <Method void TipOfTheWeekAdapter$TipViewHolder(View)>
	//   26   51:areturn         
	}

	private static final int VIEW_TYPE_EMPTY = 0;
	private static final int VIEW_TYPE_REGULAR = 1;
	private int emphasizingTextColor;
	private int regularTextColor;
	private String tips[];
}
