// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package androidx.exifinterface.media;


// Referenced classes of package androidx.exifinterface.media:
//			ExifInterface

private static class ExifInterface$Rational
{

	public double calculate()
	{
		return (double)numerator / (double)denominator;
	//    0    0:aload_0         
	//    1    1:getfield        #25  <Field long numerator>
	//    2    4:l2d             
	//    3    5:aload_0         
	//    4    6:getfield        #27  <Field long denominator>
	//    5    9:l2d             
	//    6   10:ddiv            
	//    7   11:dreturn         
	}

	public String toString()
	{
		StringBuilder stringbuilder = new StringBuilder();
	//    0    0:new             #33  <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #34  <Method void StringBuilder()>
	//    3    7:astore_1        
		stringbuilder.append(numerator);
	//    4    8:aload_1         
	//    5    9:aload_0         
	//    6   10:getfield        #25  <Field long numerator>
	//    7   13:invokevirtual   #38  <Method StringBuilder StringBuilder.append(long)>
	//    8   16:pop             
		stringbuilder.append("/");
	//    9   17:aload_1         
	//   10   18:ldc1            #40  <String "/">
	//   11   20:invokevirtual   #43  <Method StringBuilder StringBuilder.append(String)>
	//   12   23:pop             
		stringbuilder.append(denominator);
	//   13   24:aload_1         
	//   14   25:aload_0         
	//   15   26:getfield        #27  <Field long denominator>
	//   16   29:invokevirtual   #38  <Method StringBuilder StringBuilder.append(long)>
	//   17   32:pop             
		return stringbuilder.toString();
	//   18   33:aload_1         
	//   19   34:invokevirtual   #45  <Method String StringBuilder.toString()>
	//   20   37:areturn         
	}

	public final long denominator;
	public final long numerator;

	ExifInterface$Rational(double d)
	{
		this((long)(d * 10000D), 10000L);
	//    0    0:aload_0         
	//    1    1:dload_1         
	//    2    2:ldc2w           #13  <Double 10000D>
	//    3    5:dmul            
	//    4    6:d2l             
	//    5    7:ldc2w           #15  <Long 10000L>
	//    6   10:invokespecial   #19  <Method void ExifInterface$Rational(long, long)>
	//    7   13:return          
	}

	ExifInterface$Rational(long l, long l1)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #23  <Method void Object()>
		if(l1 == 0L)
	//*   2    4:lload_3         
	//*   3    5:lconst_0        
	//*   4    6:lcmp            
	//*   5    7:ifne            21
		{
			numerator = 0L;
	//    6   10:aload_0         
	//    7   11:lconst_0        
	//    8   12:putfield        #25  <Field long numerator>
			denominator = 1L;
	//    9   15:aload_0         
	//   10   16:lconst_1        
	//   11   17:putfield        #27  <Field long denominator>
			return;
	//   12   20:return          
		} else
		{
			numerator = l;
	//   13   21:aload_0         
	//   14   22:lload_1         
	//   15   23:putfield        #25  <Field long numerator>
			denominator = l1;
	//   16   26:aload_0         
	//   17   27:lload_3         
	//   18   28:putfield        #27  <Field long denominator>
			return;
	//   19   31:return          
		}
	}
}
