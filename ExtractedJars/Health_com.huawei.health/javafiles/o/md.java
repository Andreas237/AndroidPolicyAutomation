// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package o;

import java.text.DecimalFormat;

// Referenced classes of package o:
//			mf, lh

public class md
	implements mf
{

	public md(int i)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #15  <Method void Object()>
		c = 0;
	//    2    4:aload_0         
	//    3    5:iconst_0        
	//    4    6:putfield        #17  <Field int c>
		c = i;
	//    5    9:aload_0         
	//    6   10:iload_1         
	//    7   11:putfield        #17  <Field int c>
		StringBuffer stringbuffer = new StringBuffer();
	//    8   14:new             #19  <Class StringBuffer>
	//    9   17:dup             
	//   10   18:invokespecial   #20  <Method void StringBuffer()>
	//   11   21:astore_3        
		for(int j = 0; j < i; j++)
	//*  12   22:iconst_0        
	//*  13   23:istore_2        
	//*  14   24:iload_2         
	//*  15   25:iload_1         
	//*  16   26:icmpge          54
		{
			if(j == 0)
	//*  17   29:iload_2         
	//*  18   30:ifne            40
				stringbuffer.append(".");
	//   19   33:aload_3         
	//   20   34:ldc1            #22  <String ".">
	//   21   36:invokevirtual   #26  <Method StringBuffer StringBuffer.append(String)>
	//   22   39:pop             
			stringbuffer.append("0");
	//   23   40:aload_3         
	//   24   41:ldc1            #28  <String "0">
	//   25   43:invokevirtual   #26  <Method StringBuffer StringBuffer.append(String)>
	//   26   46:pop             
		}

	//   27   47:iload_2         
	//   28   48:iconst_1        
	//   29   49:iadd            
	//   30   50:istore_2        
	//*  31   51:goto            24
		e = new DecimalFormat((new StringBuilder()).append("###,###,###,##0").append(stringbuffer.toString()).toString());
	//   32   54:aload_0         
	//   33   55:new             #30  <Class DecimalFormat>
	//   34   58:dup             
	//   35   59:new             #32  <Class StringBuilder>
	//   36   62:dup             
	//   37   63:invokespecial   #33  <Method void StringBuilder()>
	//   38   66:ldc1            #35  <String "###,###,###,##0">
	//   39   68:invokevirtual   #38  <Method StringBuilder StringBuilder.append(String)>
	//   40   71:aload_3         
	//   41   72:invokevirtual   #42  <Method String StringBuffer.toString()>
	//   42   75:invokevirtual   #38  <Method StringBuilder StringBuilder.append(String)>
	//   43   78:invokevirtual   #43  <Method String StringBuilder.toString()>
	//   44   81:invokespecial   #46  <Method void DecimalFormat(String)>
	//   45   84:putfield        #48  <Field DecimalFormat e>
	//   46   87:return          
	}

	public int a()
	{
		return c;
	//    0    0:aload_0         
	//    1    1:getfield        #17  <Field int c>
	//    2    4:ireturn         
	}

	public String b(float f, lh lh)
	{
		return e.format(f);
	//    0    0:aload_0         
	//    1    1:getfield        #48  <Field DecimalFormat e>
	//    2    4:fload_1         
	//    3    5:f2d             
	//    4    6:invokevirtual   #57  <Method String DecimalFormat.format(double)>
	//    5    9:areturn         
	}

	protected int c;
	protected DecimalFormat e;
}
