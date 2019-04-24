// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.github.mikephil.charting.formatter;

import com.github.mikephil.charting.components.YAxis;
import com.github.mikephil.charting.data.Entry;
import com.github.mikephil.charting.utils.ViewPortHandler;
import java.text.DecimalFormat;

// Referenced classes of package com.github.mikephil.charting.formatter:
//			ValueFormatter, YAxisValueFormatter

public class LargeValueFormatter
	implements ValueFormatter, YAxisValueFormatter
{

	public LargeValueFormatter()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #37  <Method void Object()>
		mText = "";
	//    2    4:aload_0         
	//    3    5:ldc1            #23  <String "">
	//    4    7:putfield        #39  <Field String mText>
		mFormat = new DecimalFormat("###E0");
	//    5   10:aload_0         
	//    6   11:new             #41  <Class DecimalFormat>
	//    7   14:dup             
	//    8   15:ldc1            #43  <String "###E0">
	//    9   17:invokespecial   #46  <Method void DecimalFormat(String)>
	//   10   20:putfield        #48  <Field DecimalFormat mFormat>
	//   11   23:return          
	}

	public LargeValueFormatter(String s)
	{
		this();
	//    0    0:aload_0         
	//    1    1:invokespecial   #49  <Method void LargeValueFormatter()>
		mText = s;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #39  <Field String mText>
	//    5    9:return          
	}

	private String makePretty(double d)
	{
		String s = mFormat.format(d);
	//    0    0:aload_0         
	//    1    1:getfield        #48  <Field DecimalFormat mFormat>
	//    2    4:dload_1         
	//    3    5:invokevirtual   #54  <Method String DecimalFormat.format(double)>
	//    4    8:astore_3        
		for(s = s.replaceAll("E[0-9]", SUFFIX[Character.getNumericValue(s.charAt(s.length() - 1)) / 3]); s.length() > 4 || s.matches("[0-9]+\\.[a-z]"); s = (new StringBuilder()).append(s.substring(0, s.length() - 2)).append(s.substring(s.length() - 1)).toString());
	//    5    9:aload_3         
	//    6   10:ldc1            #56  <String "E[0-9]">
	//    7   12:getstatic       #33  <Field String[] SUFFIX>
	//    8   15:aload_3         
	//    9   16:aload_3         
	//   10   17:invokevirtual   #60  <Method int String.length()>
	//   11   20:iconst_1        
	//   12   21:isub            
	//   13   22:invokevirtual   #64  <Method char String.charAt(int)>
	//   14   25:invokestatic    #70  <Method int Character.getNumericValue(char)>
	//   15   28:iconst_3        
	//   16   29:idiv            
	//   17   30:aaload          
	//   18   31:invokevirtual   #74  <Method String String.replaceAll(String, String)>
	//   19   34:astore_3        
	//   20   35:aload_3         
	//   21   36:invokevirtual   #60  <Method int String.length()>
	//   22   39:iconst_4        
	//   23   40:icmpgt          52
	//   24   43:aload_3         
	//   25   44:ldc1            #76  <String "[0-9]+\\.[a-z]">
	//   26   46:invokevirtual   #80  <Method boolean String.matches(String)>
	//   27   49:ifeq            93
	//   28   52:new             #82  <Class StringBuilder>
	//   29   55:dup             
	//   30   56:invokespecial   #83  <Method void StringBuilder()>
	//   31   59:aload_3         
	//   32   60:iconst_0        
	//   33   61:aload_3         
	//   34   62:invokevirtual   #60  <Method int String.length()>
	//   35   65:iconst_2        
	//   36   66:isub            
	//   37   67:invokevirtual   #87  <Method String String.substring(int, int)>
	//   38   70:invokevirtual   #91  <Method StringBuilder StringBuilder.append(String)>
	//   39   73:aload_3         
	//   40   74:aload_3         
	//   41   75:invokevirtual   #60  <Method int String.length()>
	//   42   78:iconst_1        
	//   43   79:isub            
	//   44   80:invokevirtual   #94  <Method String String.substring(int)>
	//   45   83:invokevirtual   #91  <Method StringBuilder StringBuilder.append(String)>
	//   46   86:invokevirtual   #98  <Method String StringBuilder.toString()>
	//   47   89:astore_3        
	//*  48   90:goto            35
		return s;
	//   49   93:aload_3         
	//   50   94:areturn         
	}

	public String getFormattedValue(float f, YAxis yaxis)
	{
		return (new StringBuilder()).append(makePretty(f)).append(mText).toString();
	//    0    0:new             #82  <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #83  <Method void StringBuilder()>
	//    3    7:aload_0         
	//    4    8:fload_1         
	//    5    9:f2d             
	//    6   10:invokespecial   #102 <Method String makePretty(double)>
	//    7   13:invokevirtual   #91  <Method StringBuilder StringBuilder.append(String)>
	//    8   16:aload_0         
	//    9   17:getfield        #39  <Field String mText>
	//   10   20:invokevirtual   #91  <Method StringBuilder StringBuilder.append(String)>
	//   11   23:invokevirtual   #98  <Method String StringBuilder.toString()>
	//   12   26:areturn         
	}

	public String getFormattedValue(float f, Entry entry, int i, ViewPortHandler viewporthandler)
	{
		return (new StringBuilder()).append(makePretty(f)).append(mText).toString();
	//    0    0:new             #82  <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #83  <Method void StringBuilder()>
	//    3    7:aload_0         
	//    4    8:fload_1         
	//    5    9:f2d             
	//    6   10:invokespecial   #102 <Method String makePretty(double)>
	//    7   13:invokevirtual   #91  <Method StringBuilder StringBuilder.append(String)>
	//    8   16:aload_0         
	//    9   17:getfield        #39  <Field String mText>
	//   10   20:invokevirtual   #91  <Method StringBuilder StringBuilder.append(String)>
	//   11   23:invokevirtual   #98  <Method String StringBuilder.toString()>
	//   12   26:areturn         
	}

	public void setAppendix(String s)
	{
		mText = s;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #39  <Field String mText>
	//    3    5:return          
	}

	public void setSuffix(String as[])
	{
		if(as.length == 5)
	//*   0    0:aload_1         
	//*   1    1:arraylength     
	//*   2    2:iconst_5        
	//*   3    3:icmpne          10
			SUFFIX = as;
	//    4    6:aload_1         
	//    5    7:putstatic       #33  <Field String[] SUFFIX>
	//    6   10:return          
	}

	private static final int MAX_LENGTH = 4;
	private static String SUFFIX[] = {
		"", "k", "m", "b", "t"
	};
	private DecimalFormat mFormat;
	private String mText;

	static 
	{
	//    0    0:iconst_5        
	//    1    1:anewarray       String[]
	//    2    4:dup             
	//    3    5:iconst_0        
	//    4    6:ldc1            #23  <String "">
	//    5    8:aastore         
	//    6    9:dup             
	//    7   10:iconst_1        
	//    8   11:ldc1            #25  <String "k">
	//    9   13:aastore         
	//   10   14:dup             
	//   11   15:iconst_2        
	//   12   16:ldc1            #27  <String "m">
	//   13   18:aastore         
	//   14   19:dup             
	//   15   20:iconst_3        
	//   16   21:ldc1            #29  <String "b">
	//   17   23:aastore         
	//   18   24:dup             
	//   19   25:iconst_4        
	//   20   26:ldc1            #31  <String "t">
	//   21   28:aastore         
	//   22   29:putstatic       #33  <Field String[] SUFFIX>
	//*  23   32:return          
	}
}
