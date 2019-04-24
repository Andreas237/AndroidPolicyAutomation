// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.github.mikephil.charting.data;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Color;
import android.graphics.Typeface;
import com.github.mikephil.charting.formatter.DefaultValueFormatter;
import com.github.mikephil.charting.formatter.ValueFormatter;
import com.github.mikephil.charting.interfaces.datasets.IDataSet;
import com.github.mikephil.charting.utils.ColorTemplate;
import com.github.mikephil.charting.utils.Utils;
import java.util.ArrayList;
import java.util.List;

// Referenced classes of package com.github.mikephil.charting.data:
//			Entry

public abstract class BaseDataSet
	implements IDataSet
{

	public BaseDataSet()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #29  <Method void Object()>
		mColors = null;
	//    2    4:aload_0         
	//    3    5:aconst_null     
	//    4    6:putfield        #31  <Field List mColors>
		mValueColors = null;
	//    5    9:aload_0         
	//    6   10:aconst_null     
	//    7   11:putfield        #33  <Field List mValueColors>
		mLabel = "DataSet";
	//    8   14:aload_0         
	//    9   15:ldc1            #35  <String "DataSet">
	//   10   17:putfield        #37  <Field String mLabel>
		mAxisDependency = com.github.mikephil.charting.components.YAxis.AxisDependency.LEFT;
	//   11   20:aload_0         
	//   12   21:getstatic       #42  <Field com.github.mikephil.charting.components.YAxis$AxisDependency com.github.mikephil.charting.components.YAxis$AxisDependency.LEFT>
	//   13   24:putfield        #44  <Field com.github.mikephil.charting.components.YAxis$AxisDependency mAxisDependency>
		mHighlightEnabled = true;
	//   14   27:aload_0         
	//   15   28:iconst_1        
	//   16   29:putfield        #46  <Field boolean mHighlightEnabled>
		mDrawValues = true;
	//   17   32:aload_0         
	//   18   33:iconst_1        
	//   19   34:putfield        #48  <Field boolean mDrawValues>
		mValueTextSize = 17F;
	//   20   37:aload_0         
	//   21   38:ldc1            #49  <Float 17F>
	//   22   40:putfield        #51  <Field float mValueTextSize>
		mVisible = true;
	//   23   43:aload_0         
	//   24   44:iconst_1        
	//   25   45:putfield        #53  <Field boolean mVisible>
		mColors = ((List) (new ArrayList()));
	//   26   48:aload_0         
	//   27   49:new             #55  <Class ArrayList>
	//   28   52:dup             
	//   29   53:invokespecial   #56  <Method void ArrayList()>
	//   30   56:putfield        #31  <Field List mColors>
		mValueColors = ((List) (new ArrayList()));
	//   31   59:aload_0         
	//   32   60:new             #55  <Class ArrayList>
	//   33   63:dup             
	//   34   64:invokespecial   #56  <Method void ArrayList()>
	//   35   67:putfield        #33  <Field List mValueColors>
		mColors.add(((Object) (Integer.valueOf(Color.rgb(140, 234, 255)))));
	//   36   70:aload_0         
	//   37   71:getfield        #31  <Field List mColors>
	//   38   74:sipush          140
	//   39   77:sipush          234
	//   40   80:sipush          255
	//   41   83:invokestatic    #62  <Method int Color.rgb(int, int, int)>
	//   42   86:invokestatic    #68  <Method Integer Integer.valueOf(int)>
	//   43   89:invokeinterface #74  <Method boolean List.add(Object)>
	//   44   94:pop             
		mValueColors.add(((Object) (Integer.valueOf(0xff000000))));
	//   45   95:aload_0         
	//   46   96:getfield        #33  <Field List mValueColors>
	//   47   99:ldc1            #75  <Int 0xff000000>
	//   48  101:invokestatic    #68  <Method Integer Integer.valueOf(int)>
	//   49  104:invokeinterface #74  <Method boolean List.add(Object)>
	//   50  109:pop             
	//   51  110:return          
	}

	public BaseDataSet(String s)
	{
		this();
	//    0    0:aload_0         
	//    1    1:invokespecial   #78  <Method void BaseDataSet()>
		mLabel = s;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #37  <Field String mLabel>
	//    5    9:return          
	}

	public void addColor(int i)
	{
		if(mColors == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #31  <Field List mColors>
	//*   2    4:ifnonnull       18
			mColors = ((List) (new ArrayList()));
	//    3    7:aload_0         
	//    4    8:new             #55  <Class ArrayList>
	//    5   11:dup             
	//    6   12:invokespecial   #56  <Method void ArrayList()>
	//    7   15:putfield        #31  <Field List mColors>
		mColors.add(((Object) (Integer.valueOf(i))));
	//    8   18:aload_0         
	//    9   19:getfield        #31  <Field List mColors>
	//   10   22:iload_1         
	//   11   23:invokestatic    #68  <Method Integer Integer.valueOf(int)>
	//   12   26:invokeinterface #74  <Method boolean List.add(Object)>
	//   13   31:pop             
	//   14   32:return          
	}

	public boolean contains(Entry entry)
	{
		for(int i = 0; i < getEntryCount(); i++)
	//*   0    0:iconst_0        
	//*   1    1:istore_2        
	//*   2    2:iload_2         
	//*   3    3:aload_0         
	//*   4    4:invokevirtual   #86  <Method int getEntryCount()>
	//*   5    7:icmpge          31
			if(((Object) (getEntryForIndex(i))).equals(((Object) (entry))))
	//*   6   10:aload_0         
	//*   7   11:iload_2         
	//*   8   12:invokevirtual   #90  <Method Entry getEntryForIndex(int)>
	//*   9   15:aload_1         
	//*  10   16:invokevirtual   #93  <Method boolean Object.equals(Object)>
	//*  11   19:ifeq            24
				return true;
	//   12   22:iconst_1        
	//   13   23:ireturn         

	//   14   24:iload_2         
	//   15   25:iconst_1        
	//   16   26:iadd            
	//   17   27:istore_2        
	//*  18   28:goto            2
		return false;
	//   19   31:iconst_0        
	//   20   32:ireturn         
	}

	public com.github.mikephil.charting.components.YAxis.AxisDependency getAxisDependency()
	{
		return mAxisDependency;
	//    0    0:aload_0         
	//    1    1:getfield        #44  <Field com.github.mikephil.charting.components.YAxis$AxisDependency mAxisDependency>
	//    2    4:areturn         
	}

	public int getColor()
	{
		return ((Integer)mColors.get(0)).intValue();
	//    0    0:aload_0         
	//    1    1:getfield        #31  <Field List mColors>
	//    2    4:iconst_0        
	//    3    5:invokeinterface #102 <Method Object List.get(int)>
	//    4   10:checkcast       #64  <Class Integer>
	//    5   13:invokevirtual   #105 <Method int Integer.intValue()>
	//    6   16:ireturn         
	}

	public int getColor(int i)
	{
		return ((Integer)mColors.get(i % mColors.size())).intValue();
	//    0    0:aload_0         
	//    1    1:getfield        #31  <Field List mColors>
	//    2    4:iload_1         
	//    3    5:aload_0         
	//    4    6:getfield        #31  <Field List mColors>
	//    5    9:invokeinterface #109 <Method int List.size()>
	//    6   14:irem            
	//    7   15:invokeinterface #102 <Method Object List.get(int)>
	//    8   20:checkcast       #64  <Class Integer>
	//    9   23:invokevirtual   #105 <Method int Integer.intValue()>
	//   10   26:ireturn         
	}

	public List getColors()
	{
		return mColors;
	//    0    0:aload_0         
	//    1    1:getfield        #31  <Field List mColors>
	//    2    4:areturn         
	}

	public int getIndexInEntries(int i)
	{
		for(int j = 0; j < getEntryCount(); j++)
	//*   0    0:iconst_0        
	//*   1    1:istore_2        
	//*   2    2:iload_2         
	//*   3    3:aload_0         
	//*   4    4:invokevirtual   #86  <Method int getEntryCount()>
	//*   5    7:icmpge          31
			if(i == getEntryForIndex(j).getXIndex())
	//*   6   10:iload_1         
	//*   7   11:aload_0         
	//*   8   12:iload_2         
	//*   9   13:invokevirtual   #90  <Method Entry getEntryForIndex(int)>
	//*  10   16:invokevirtual   #118 <Method int Entry.getXIndex()>
	//*  11   19:icmpne          24
				return j;
	//   12   22:iload_2         
	//   13   23:ireturn         

	//   14   24:iload_2         
	//   15   25:iconst_1        
	//   16   26:iadd            
	//   17   27:istore_2        
	//*  18   28:goto            2
		return -1;
	//   19   31:iconst_m1       
	//   20   32:ireturn         
	}

	public String getLabel()
	{
		return mLabel;
	//    0    0:aload_0         
	//    1    1:getfield        #37  <Field String mLabel>
	//    2    4:areturn         
	}

	public List getValueColors()
	{
		return mValueColors;
	//    0    0:aload_0         
	//    1    1:getfield        #33  <Field List mValueColors>
	//    2    4:areturn         
	}

	public ValueFormatter getValueFormatter()
	{
		if(mValueFormatter == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #125 <Field ValueFormatter mValueFormatter>
	//*   2    4:ifnonnull       16
			return ((ValueFormatter) (new DefaultValueFormatter(1)));
	//    3    7:new             #127 <Class DefaultValueFormatter>
	//    4   10:dup             
	//    5   11:iconst_1        
	//    6   12:invokespecial   #129 <Method void DefaultValueFormatter(int)>
	//    7   15:areturn         
		else
			return mValueFormatter;
	//    8   16:aload_0         
	//    9   17:getfield        #125 <Field ValueFormatter mValueFormatter>
	//   10   20:areturn         
	}

	public int getValueTextColor()
	{
		return ((Integer)mValueColors.get(0)).intValue();
	//    0    0:aload_0         
	//    1    1:getfield        #33  <Field List mValueColors>
	//    2    4:iconst_0        
	//    3    5:invokeinterface #102 <Method Object List.get(int)>
	//    4   10:checkcast       #64  <Class Integer>
	//    5   13:invokevirtual   #105 <Method int Integer.intValue()>
	//    6   16:ireturn         
	}

	public int getValueTextColor(int i)
	{
		return ((Integer)mValueColors.get(i % mValueColors.size())).intValue();
	//    0    0:aload_0         
	//    1    1:getfield        #33  <Field List mValueColors>
	//    2    4:iload_1         
	//    3    5:aload_0         
	//    4    6:getfield        #33  <Field List mValueColors>
	//    5    9:invokeinterface #109 <Method int List.size()>
	//    6   14:irem            
	//    7   15:invokeinterface #102 <Method Object List.get(int)>
	//    8   20:checkcast       #64  <Class Integer>
	//    9   23:invokevirtual   #105 <Method int Integer.intValue()>
	//   10   26:ireturn         
	}

	public float getValueTextSize()
	{
		return mValueTextSize;
	//    0    0:aload_0         
	//    1    1:getfield        #51  <Field float mValueTextSize>
	//    2    4:freturn         
	}

	public Typeface getValueTypeface()
	{
		return mValueTypeface;
	//    0    0:aload_0         
	//    1    1:getfield        #136 <Field Typeface mValueTypeface>
	//    2    4:areturn         
	}

	public boolean isDrawValuesEnabled()
	{
		return mDrawValues;
	//    0    0:aload_0         
	//    1    1:getfield        #48  <Field boolean mDrawValues>
	//    2    4:ireturn         
	}

	public boolean isHighlightEnabled()
	{
		return mHighlightEnabled;
	//    0    0:aload_0         
	//    1    1:getfield        #46  <Field boolean mHighlightEnabled>
	//    2    4:ireturn         
	}

	public boolean isVisible()
	{
		return mVisible;
	//    0    0:aload_0         
	//    1    1:getfield        #53  <Field boolean mVisible>
	//    2    4:ireturn         
	}

	public void notifyDataSetChanged()
	{
		calcMinMax(0, getEntryCount() - 1);
	//    0    0:aload_0         
	//    1    1:iconst_0        
	//    2    2:aload_0         
	//    3    3:invokevirtual   #86  <Method int getEntryCount()>
	//    4    6:iconst_1        
	//    5    7:isub            
	//    6    8:invokevirtual   #145 <Method void calcMinMax(int, int)>
	//    7   11:return          
	}

	public boolean removeEntry(int i)
	{
		return removeEntry(getEntryForXIndex(i));
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:iload_1         
	//    3    3:invokevirtual   #150 <Method Entry getEntryForXIndex(int)>
	//    4    6:invokevirtual   #152 <Method boolean removeEntry(Entry)>
	//    5    9:ireturn         
	}

	public boolean removeFirst()
	{
		return removeEntry(getEntryForIndex(0));
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:iconst_0        
	//    3    3:invokevirtual   #90  <Method Entry getEntryForIndex(int)>
	//    4    6:invokevirtual   #152 <Method boolean removeEntry(Entry)>
	//    5    9:ireturn         
	}

	public boolean removeLast()
	{
		return removeEntry(getEntryForIndex(getEntryCount() - 1));
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:aload_0         
	//    3    3:invokevirtual   #86  <Method int getEntryCount()>
	//    4    6:iconst_1        
	//    5    7:isub            
	//    6    8:invokevirtual   #90  <Method Entry getEntryForIndex(int)>
	//    7   11:invokevirtual   #152 <Method boolean removeEntry(Entry)>
	//    8   14:ireturn         
	}

	public void resetColors()
	{
		mColors = ((List) (new ArrayList()));
	//    0    0:aload_0         
	//    1    1:new             #55  <Class ArrayList>
	//    2    4:dup             
	//    3    5:invokespecial   #56  <Method void ArrayList()>
	//    4    8:putfield        #31  <Field List mColors>
	//    5   11:return          
	}

	public void setAxisDependency(com.github.mikephil.charting.components.YAxis.AxisDependency axisdependency)
	{
		mAxisDependency = axisdependency;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #44  <Field com.github.mikephil.charting.components.YAxis$AxisDependency mAxisDependency>
	//    3    5:return          
	}

	public void setColor(int i)
	{
		resetColors();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #160 <Method void resetColors()>
		mColors.add(((Object) (Integer.valueOf(i))));
	//    2    4:aload_0         
	//    3    5:getfield        #31  <Field List mColors>
	//    4    8:iload_1         
	//    5    9:invokestatic    #68  <Method Integer Integer.valueOf(int)>
	//    6   12:invokeinterface #74  <Method boolean List.add(Object)>
	//    7   17:pop             
	//    8   18:return          
	}

	public void setColor(int i, int j)
	{
		setColor(Color.argb(j, Color.red(i), Color.green(i), Color.blue(i)));
	//    0    0:aload_0         
	//    1    1:iload_2         
	//    2    2:iload_1         
	//    3    3:invokestatic    #163 <Method int Color.red(int)>
	//    4    6:iload_1         
	//    5    7:invokestatic    #166 <Method int Color.green(int)>
	//    6   10:iload_1         
	//    7   11:invokestatic    #169 <Method int Color.blue(int)>
	//    8   14:invokestatic    #173 <Method int Color.argb(int, int, int, int)>
	//    9   17:invokevirtual   #175 <Method void setColor(int)>
	//   10   20:return          
	}

	public void setColors(List list)
	{
		mColors = list;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #31  <Field List mColors>
	//    3    5:return          
	}

	public void setColors(int ai[])
	{
		mColors = ColorTemplate.createColors(ai);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokestatic    #185 <Method List ColorTemplate.createColors(int[])>
	//    3    5:putfield        #31  <Field List mColors>
	//    4    8:return          
	}

	public void setColors(int ai[], int i)
	{
		resetColors();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #160 <Method void resetColors()>
		int k = ai.length;
	//    2    4:aload_1         
	//    3    5:arraylength     
	//    4    6:istore          4
		for(int j = 0; j < k; j++)
	//*   5    8:iconst_0        
	//*   6    9:istore_3        
	//*   7   10:iload_3         
	//*   8   11:iload           4
	//*   9   13:icmpge          51
		{
			int l = ai[j];
	//   10   16:aload_1         
	//   11   17:iload_3         
	//   12   18:iaload          
	//   13   19:istore          5
			addColor(Color.argb(i, Color.red(l), Color.green(l), Color.blue(l)));
	//   14   21:aload_0         
	//   15   22:iload_2         
	//   16   23:iload           5
	//   17   25:invokestatic    #163 <Method int Color.red(int)>
	//   18   28:iload           5
	//   19   30:invokestatic    #166 <Method int Color.green(int)>
	//   20   33:iload           5
	//   21   35:invokestatic    #169 <Method int Color.blue(int)>
	//   22   38:invokestatic    #173 <Method int Color.argb(int, int, int, int)>
	//   23   41:invokevirtual   #188 <Method void addColor(int)>
		}

	//   24   44:iload_3         
	//   25   45:iconst_1        
	//   26   46:iadd            
	//   27   47:istore_3        
	//*  28   48:goto            10
	//   29   51:return          
	}

	public void setColors(int ai[], Context context)
	{
		ArrayList arraylist = new ArrayList();
	//    0    0:new             #55  <Class ArrayList>
	//    1    3:dup             
	//    2    4:invokespecial   #56  <Method void ArrayList()>
	//    3    7:astore          6
		int j = ai.length;
	//    4    9:aload_1         
	//    5   10:arraylength     
	//    6   11:istore          4
		for(int i = 0; i < j; i++)
	//*   7   13:iconst_0        
	//*   8   14:istore_3        
	//*   9   15:iload_3         
	//*  10   16:iload           4
	//*  11   18:icmpge          53
		{
			int k = ai[i];
	//   12   21:aload_1         
	//   13   22:iload_3         
	//   14   23:iaload          
	//   15   24:istore          5
			((List) (arraylist)).add(((Object) (Integer.valueOf(context.getResources().getColor(k)))));
	//   16   26:aload           6
	//   17   28:aload_2         
	//   18   29:invokevirtual   #195 <Method Resources Context.getResources()>
	//   19   32:iload           5
	//   20   34:invokevirtual   #199 <Method int Resources.getColor(int)>
	//   21   37:invokestatic    #68  <Method Integer Integer.valueOf(int)>
	//   22   40:invokeinterface #74  <Method boolean List.add(Object)>
	//   23   45:pop             
		}

	//   24   46:iload_3         
	//   25   47:iconst_1        
	//   26   48:iadd            
	//   27   49:istore_3        
	//*  28   50:goto            15
		mColors = ((List) (arraylist));
	//   29   53:aload_0         
	//   30   54:aload           6
	//   31   56:putfield        #31  <Field List mColors>
	//   32   59:return          
	}

	public void setDrawValues(boolean flag)
	{
		mDrawValues = flag;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #48  <Field boolean mDrawValues>
	//    3    5:return          
	}

	public void setHighlightEnabled(boolean flag)
	{
		mHighlightEnabled = flag;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #46  <Field boolean mHighlightEnabled>
	//    3    5:return          
	}

	public void setLabel(String s)
	{
		mLabel = s;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #37  <Field String mLabel>
	//    3    5:return          
	}

	public void setValueFormatter(ValueFormatter valueformatter)
	{
		if(valueformatter == null)
	//*   0    0:aload_1         
	//*   1    1:ifnonnull       5
		{
			return;
	//    2    4:return          
		} else
		{
			mValueFormatter = valueformatter;
	//    3    5:aload_0         
	//    4    6:aload_1         
	//    5    7:putfield        #125 <Field ValueFormatter mValueFormatter>
			return;
	//    6   10:return          
		}
	}

	public void setValueTextColor(int i)
	{
		mValueColors.clear();
	//    0    0:aload_0         
	//    1    1:getfield        #33  <Field List mValueColors>
	//    2    4:invokeinterface #209 <Method void List.clear()>
		mValueColors.add(((Object) (Integer.valueOf(i))));
	//    3    9:aload_0         
	//    4   10:getfield        #33  <Field List mValueColors>
	//    5   13:iload_1         
	//    6   14:invokestatic    #68  <Method Integer Integer.valueOf(int)>
	//    7   17:invokeinterface #74  <Method boolean List.add(Object)>
	//    8   22:pop             
	//    9   23:return          
	}

	public void setValueTextColors(List list)
	{
		mValueColors = list;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #33  <Field List mValueColors>
	//    3    5:return          
	}

	public void setValueTextSize(float f)
	{
		mValueTextSize = Utils.convertDpToPixel(f);
	//    0    0:aload_0         
	//    1    1:fload_1         
	//    2    2:invokestatic    #218 <Method float Utils.convertDpToPixel(float)>
	//    3    5:putfield        #51  <Field float mValueTextSize>
	//    4    8:return          
	}

	public void setValueTypeface(Typeface typeface)
	{
		mValueTypeface = typeface;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #136 <Field Typeface mValueTypeface>
	//    3    5:return          
	}

	public void setVisible(boolean flag)
	{
		mVisible = flag;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #53  <Field boolean mVisible>
	//    3    5:return          
	}

	protected com.github.mikephil.charting.components.YAxis.AxisDependency mAxisDependency;
	protected List mColors;
	protected boolean mDrawValues;
	protected boolean mHighlightEnabled;
	private String mLabel;
	protected List mValueColors;
	protected transient ValueFormatter mValueFormatter;
	protected float mValueTextSize;
	protected Typeface mValueTypeface;
	protected boolean mVisible;
}
