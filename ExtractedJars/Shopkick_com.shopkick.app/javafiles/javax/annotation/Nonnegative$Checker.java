// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package javax.annotation;

import java.lang.annotation.Annotation;
import javax.annotation.meta.TypeQualifierValidator;
import javax.annotation.meta.When;

// Referenced classes of package javax.annotation:
//			Nonnegative

public static class Nonnegative$Checker
	implements TypeQualifierValidator
{

	public volatile When forConstantValue(Annotation annotation, Object obj)
	{
		return forConstantValue((Nonnegative)annotation, obj);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:checkcast       #9   <Class Nonnegative>
	//    3    5:aload_2         
	//    4    6:invokevirtual   #20  <Method When forConstantValue(Nonnegative, Object)>
	//    5    9:areturn         
	}

	public When forConstantValue(Nonnegative nonnegative, Object obj)
	{
		if(!(obj instanceof Number))
	//*   0    0:aload_2         
	//*   1    1:instanceof      #22  <Class Number>
	//*   2    4:ifne            11
			return When.NEVER;
	//    3    7:getstatic       #28  <Field When When.NEVER>
	//    4   10:areturn         
		nonnegative = ((Nonnegative) ((Number)obj));
	//    5   11:aload_2         
	//    6   12:checkcast       #22  <Class Number>
	//    7   15:astore_1        
		boolean flag1 = nonnegative instanceof Long;
	//    8   16:aload_1         
	//    9   17:instanceof      #30  <Class Long>
	//   10   20:istore          4
		boolean flag = true;
	//   11   22:iconst_1        
	//   12   23:istore_3        
		if(flag1)
	//*  13   24:iload           4
	//*  14   26:ifeq            46
		{
			if(((Number) (nonnegative)).longValue() >= 0L)
	//*  15   29:aload_1         
	//*  16   30:invokevirtual   #34  <Method long Number.longValue()>
	//*  17   33:lconst_0        
	//*  18   34:lcmp            
	//*  19   35:ifge            41
	//*  20   38:goto            106
				flag = false;
	//   21   41:iconst_0        
	//   22   42:istore_3        
		} else
	//*  23   43:goto            106
		if(nonnegative instanceof Double)
	//*  24   46:aload_1         
	//*  25   47:instanceof      #36  <Class Double>
	//*  26   50:ifeq            70
		{
			if(((Number) (nonnegative)).doubleValue() >= 0.0D)
	//*  27   53:aload_1         
	//*  28   54:invokevirtual   #40  <Method double Number.doubleValue()>
	//*  29   57:dconst_0        
	//*  30   58:dcmpg           
	//*  31   59:ifge            65
	//*  32   62:goto            106
				flag = false;
	//   33   65:iconst_0        
	//   34   66:istore_3        
		} else
	//*  35   67:goto            106
		if(nonnegative instanceof Float)
	//*  36   70:aload_1         
	//*  37   71:instanceof      #42  <Class Float>
	//*  38   74:ifeq            94
		{
			if(((Number) (nonnegative)).floatValue() >= 0.0F)
	//*  39   77:aload_1         
	//*  40   78:invokevirtual   #46  <Method float Number.floatValue()>
	//*  41   81:fconst_0        
	//*  42   82:fcmpg           
	//*  43   83:ifge            89
	//*  44   86:goto            106
				flag = false;
	//   45   89:iconst_0        
	//   46   90:istore_3        
		} else
	//*  47   91:goto            106
		if(((Number) (nonnegative)).intValue() >= 0)
	//*  48   94:aload_1         
	//*  49   95:invokevirtual   #50  <Method int Number.intValue()>
	//*  50   98:ifge            104
	//*  51  101:goto            106
			flag = false;
	//   52  104:iconst_0        
	//   53  105:istore_3        
		if(flag)
	//*  54  106:iload_3         
	//*  55  107:ifeq            114
			return When.NEVER;
	//   56  110:getstatic       #28  <Field When When.NEVER>
	//   57  113:areturn         
		else
			return When.ALWAYS;
	//   58  114:getstatic       #53  <Field When When.ALWAYS>
	//   59  117:areturn         
	}

	public Nonnegative$Checker()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #14  <Method void Object()>
	//    2    4:return          
	}
}
