// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.github.mikephil.charting.formatter;

import com.github.mikephil.charting.data.BarEntry;
import com.github.mikephil.charting.data.Entry;
import com.github.mikephil.charting.utils.ViewPortHandler;
import java.text.DecimalFormat;

// Referenced classes of package com.github.mikephil.charting.formatter:
//			ValueFormatter

public class StackedValueFormatter
	implements ValueFormatter
{

	public StackedValueFormatter(boolean flag, String s, int i)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #17  <Method void Object()>
		mDrawWholeStack = flag;
	//    2    4:aload_0         
	//    3    5:iload_1         
	//    4    6:putfield        #19  <Field boolean mDrawWholeStack>
		mAppendix = s;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #21  <Field String mAppendix>
		s = ((String) (new StringBuffer()));
	//    8   14:new             #23  <Class StringBuffer>
	//    9   17:dup             
	//   10   18:invokespecial   #24  <Method void StringBuffer()>
	//   11   21:astore_2        
		for(int j = 0; j < i; j++)
	//*  12   22:iconst_0        
	//*  13   23:istore          4
	//*  14   25:iload           4
	//*  15   27:iload_3         
	//*  16   28:icmpge          59
		{
			if(j == 0)
	//*  17   31:iload           4
	//*  18   33:ifne            43
				((StringBuffer) (s)).append(".");
	//   19   36:aload_2         
	//   20   37:ldc1            #26  <String ".">
	//   21   39:invokevirtual   #30  <Method StringBuffer StringBuffer.append(String)>
	//   22   42:pop             
			((StringBuffer) (s)).append("0");
	//   23   43:aload_2         
	//   24   44:ldc1            #32  <String "0">
	//   25   46:invokevirtual   #30  <Method StringBuffer StringBuffer.append(String)>
	//   26   49:pop             
		}

	//   27   50:iload           4
	//   28   52:iconst_1        
	//   29   53:iadd            
	//   30   54:istore          4
	//*  31   56:goto            25
		mFormat = new DecimalFormat((new StringBuilder()).append("###,###,###,##0").append(((StringBuffer) (s)).toString()).toString());
	//   32   59:aload_0         
	//   33   60:new             #34  <Class DecimalFormat>
	//   34   63:dup             
	//   35   64:new             #36  <Class StringBuilder>
	//   36   67:dup             
	//   37   68:invokespecial   #37  <Method void StringBuilder()>
	//   38   71:ldc1            #39  <String "###,###,###,##0">
	//   39   73:invokevirtual   #42  <Method StringBuilder StringBuilder.append(String)>
	//   40   76:aload_2         
	//   41   77:invokevirtual   #46  <Method String StringBuffer.toString()>
	//   42   80:invokevirtual   #42  <Method StringBuilder StringBuilder.append(String)>
	//   43   83:invokevirtual   #47  <Method String StringBuilder.toString()>
	//   44   86:invokespecial   #50  <Method void DecimalFormat(String)>
	//   45   89:putfield        #52  <Field DecimalFormat mFormat>
	//   46   92:return          
	}

	public String getFormattedValue(float f, Entry entry, int i, ViewPortHandler viewporthandler)
	{
		if(!mDrawWholeStack && (entry instanceof BarEntry))
	//*   0    0:aload_0         
	//*   1    1:getfield        #19  <Field boolean mDrawWholeStack>
	//*   2    4:ifne            79
	//*   3    7:aload_2         
	//*   4    8:instanceof      #57  <Class BarEntry>
	//*   5   11:ifeq            79
		{
			entry = ((Entry) ((BarEntry)entry));
	//    6   14:aload_2         
	//    7   15:checkcast       #57  <Class BarEntry>
	//    8   18:astore_2        
			viewporthandler = ((ViewPortHandler) (((BarEntry) (entry)).getVals()));
	//    9   19:aload_2         
	//   10   20:invokevirtual   #61  <Method float[] BarEntry.getVals()>
	//   11   23:astore          4
			if(viewporthandler != null)
	//*  12   25:aload           4
	//*  13   27:ifnull          79
				if(viewporthandler[viewporthandler.length - 1] == f)
	//*  14   30:aload           4
	//*  15   32:aload           4
	//*  16   34:arraylength     
	//*  17   35:iconst_1        
	//*  18   36:isub            
	//*  19   37:faload          
	//*  20   38:fload_1         
	//*  21   39:fcmpl           
	//*  22   40:ifne            76
					return (new StringBuilder()).append(mFormat.format(((BarEntry) (entry)).getVal())).append(mAppendix).toString();
	//   23   43:new             #36  <Class StringBuilder>
	//   24   46:dup             
	//   25   47:invokespecial   #37  <Method void StringBuilder()>
	//   26   50:aload_0         
	//   27   51:getfield        #52  <Field DecimalFormat mFormat>
	//   28   54:aload_2         
	//   29   55:invokevirtual   #65  <Method float BarEntry.getVal()>
	//   30   58:f2d             
	//   31   59:invokevirtual   #69  <Method String DecimalFormat.format(double)>
	//   32   62:invokevirtual   #42  <Method StringBuilder StringBuilder.append(String)>
	//   33   65:aload_0         
	//   34   66:getfield        #21  <Field String mAppendix>
	//   35   69:invokevirtual   #42  <Method StringBuilder StringBuilder.append(String)>
	//   36   72:invokevirtual   #47  <Method String StringBuilder.toString()>
	//   37   75:areturn         
				else
					return "";
	//   38   76:ldc1            #71  <String "">
	//   39   78:areturn         
		}
		return (new StringBuilder()).append(mFormat.format(f)).append(mAppendix).toString();
	//   40   79:new             #36  <Class StringBuilder>
	//   41   82:dup             
	//   42   83:invokespecial   #37  <Method void StringBuilder()>
	//   43   86:aload_0         
	//   44   87:getfield        #52  <Field DecimalFormat mFormat>
	//   45   90:fload_1         
	//   46   91:f2d             
	//   47   92:invokevirtual   #69  <Method String DecimalFormat.format(double)>
	//   48   95:invokevirtual   #42  <Method StringBuilder StringBuilder.append(String)>
	//   49   98:aload_0         
	//   50   99:getfield        #21  <Field String mAppendix>
	//   51  102:invokevirtual   #42  <Method StringBuilder StringBuilder.append(String)>
	//   52  105:invokevirtual   #47  <Method String StringBuilder.toString()>
	//   53  108:areturn         
	}

	private String mAppendix;
	private boolean mDrawWholeStack;
	private DecimalFormat mFormat;
}
