// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package o;

import com.github.mikephil.charting.data.Entry;
import java.text.DecimalFormat;

// Referenced classes of package o:
//			ml, oa

public class me
	implements ml
{

	public me(int i)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #15  <Method void Object()>
		b(i);
	//    2    4:aload_0         
	//    3    5:iload_1         
	//    4    6:invokevirtual   #18  <Method void b(int)>
	//    5    9:return          
	}

	public String b(float f, Entry entry, int i, oa oa)
	{
		return e.format(f);
	//    0    0:aload_0         
	//    1    1:getfield        #22  <Field DecimalFormat e>
	//    2    4:fload_1         
	//    3    5:f2d             
	//    4    6:invokevirtual   #28  <Method String DecimalFormat.format(double)>
	//    5    9:areturn         
	}

	public void b(int i)
	{
		a = i;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #30  <Field int a>
		StringBuffer stringbuffer = new StringBuffer();
	//    3    5:new             #32  <Class StringBuffer>
	//    4    8:dup             
	//    5    9:invokespecial   #33  <Method void StringBuffer()>
	//    6   12:astore_3        
		for(int j = 0; j < i; j++)
	//*   7   13:iconst_0        
	//*   8   14:istore_2        
	//*   9   15:iload_2         
	//*  10   16:iload_1         
	//*  11   17:icmpge          45
		{
			if(j == 0)
	//*  12   20:iload_2         
	//*  13   21:ifne            31
				stringbuffer.append(".");
	//   14   24:aload_3         
	//   15   25:ldc1            #35  <String ".">
	//   16   27:invokevirtual   #39  <Method StringBuffer StringBuffer.append(String)>
	//   17   30:pop             
			stringbuffer.append("0");
	//   18   31:aload_3         
	//   19   32:ldc1            #41  <String "0">
	//   20   34:invokevirtual   #39  <Method StringBuffer StringBuffer.append(String)>
	//   21   37:pop             
		}

	//   22   38:iload_2         
	//   23   39:iconst_1        
	//   24   40:iadd            
	//   25   41:istore_2        
	//*  26   42:goto            15
		e = new DecimalFormat((new StringBuilder()).append("###,###,###,##0").append(stringbuffer.toString()).toString());
	//   27   45:aload_0         
	//   28   46:new             #24  <Class DecimalFormat>
	//   29   49:dup             
	//   30   50:new             #43  <Class StringBuilder>
	//   31   53:dup             
	//   32   54:invokespecial   #44  <Method void StringBuilder()>
	//   33   57:ldc1            #46  <String "###,###,###,##0">
	//   34   59:invokevirtual   #49  <Method StringBuilder StringBuilder.append(String)>
	//   35   62:aload_3         
	//   36   63:invokevirtual   #53  <Method String StringBuffer.toString()>
	//   37   66:invokevirtual   #49  <Method StringBuilder StringBuilder.append(String)>
	//   38   69:invokevirtual   #54  <Method String StringBuilder.toString()>
	//   39   72:invokespecial   #57  <Method void DecimalFormat(String)>
	//   40   75:putfield        #22  <Field DecimalFormat e>
	//   41   78:return          
	}

	protected int a;
	protected DecimalFormat e;
}
