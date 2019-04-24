// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package ch.qos.logback.classic.spi;

import java.io.Serializable;

public class ClassPackagingData
	implements Serializable
{

	public ClassPackagingData(String s, String s1)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #20  <Method void Object()>
		codeLocation = s;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #22  <Field String codeLocation>
		version = s1;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #24  <Field String version>
		exact = true;
	//    8   14:aload_0         
	//    9   15:iconst_1        
	//   10   16:putfield        #26  <Field boolean exact>
	//   11   19:return          
	}

	public ClassPackagingData(String s, String s1, boolean flag)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #20  <Method void Object()>
		codeLocation = s;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #22  <Field String codeLocation>
		version = s1;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #24  <Field String version>
		exact = flag;
	//    8   14:aload_0         
	//    9   15:iload_3         
	//   10   16:putfield        #26  <Field boolean exact>
	//   11   19:return          
	}

	public boolean equals(Object obj)
	{
		if(this == obj)
	//*   0    0:aload_0         
	//*   1    1:aload_1         
	//*   2    2:if_acmpne       7
			return true;
	//    3    5:iconst_1        
	//    4    6:ireturn         
		if(obj == null)
	//*   5    7:aload_1         
	//*   6    8:ifnonnull       13
			return false;
	//    7   11:iconst_0        
	//    8   12:ireturn         
		if(((Object)this).getClass() != obj.getClass())
	//*   9   13:aload_0         
	//*  10   14:invokevirtual   #34  <Method Class Object.getClass()>
	//*  11   17:aload_1         
	//*  12   18:invokevirtual   #34  <Method Class Object.getClass()>
	//*  13   21:if_acmpeq       26
			return false;
	//   14   24:iconst_0        
	//   15   25:ireturn         
		obj = ((Object) ((ClassPackagingData)obj));
	//   16   26:aload_1         
	//   17   27:checkcast       #2   <Class ClassPackagingData>
	//   18   30:astore_1        
		if(codeLocation == null)
	//*  19   31:aload_0         
	//*  20   32:getfield        #22  <Field String codeLocation>
	//*  21   35:ifnonnull       47
		{
			if(((ClassPackagingData) (obj)).codeLocation != null)
	//*  22   38:aload_1         
	//*  23   39:getfield        #22  <Field String codeLocation>
	//*  24   42:ifnull          63
				return false;
	//   25   45:iconst_0        
	//   26   46:ireturn         
		} else
		if(!codeLocation.equals(((Object) (((ClassPackagingData) (obj)).codeLocation))))
	//*  27   47:aload_0         
	//*  28   48:getfield        #22  <Field String codeLocation>
	//*  29   51:aload_1         
	//*  30   52:getfield        #22  <Field String codeLocation>
	//*  31   55:invokevirtual   #38  <Method boolean String.equals(Object)>
	//*  32   58:ifne            63
			return false;
	//   33   61:iconst_0        
	//   34   62:ireturn         
		if(exact != ((ClassPackagingData) (obj)).exact)
	//*  35   63:aload_0         
	//*  36   64:getfield        #26  <Field boolean exact>
	//*  37   67:aload_1         
	//*  38   68:getfield        #26  <Field boolean exact>
	//*  39   71:icmpeq          76
			return false;
	//   40   74:iconst_0        
	//   41   75:ireturn         
		if(version == null)
	//*  42   76:aload_0         
	//*  43   77:getfield        #24  <Field String version>
	//*  44   80:ifnonnull       92
		{
			if(((ClassPackagingData) (obj)).version != null)
	//*  45   83:aload_1         
	//*  46   84:getfield        #24  <Field String version>
	//*  47   87:ifnull          108
				return false;
	//   48   90:iconst_0        
	//   49   91:ireturn         
		} else
		if(!version.equals(((Object) (((ClassPackagingData) (obj)).version))))
	//*  50   92:aload_0         
	//*  51   93:getfield        #24  <Field String version>
	//*  52   96:aload_1         
	//*  53   97:getfield        #24  <Field String version>
	//*  54  100:invokevirtual   #38  <Method boolean String.equals(Object)>
	//*  55  103:ifne            108
			return false;
	//   56  106:iconst_0        
	//   57  107:ireturn         
		return true;
	//   58  108:iconst_1        
	//   59  109:ireturn         
	}

	public String getCodeLocation()
	{
		return codeLocation;
	//    0    0:aload_0         
	//    1    1:getfield        #22  <Field String codeLocation>
	//    2    4:areturn         
	}

	public String getVersion()
	{
		return version;
	//    0    0:aload_0         
	//    1    1:getfield        #24  <Field String version>
	//    2    4:areturn         
	}

	public int hashCode()
	{
		int i;
		if(codeLocation == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #22  <Field String codeLocation>
	//*   2    4:ifnonnull       12
			i = 0;
	//    3    7:iconst_0        
	//    4    8:istore_1        
		else
	//*   5    9:goto            20
			i = codeLocation.hashCode();
	//    6   12:aload_0         
	//    7   13:getfield        #22  <Field String codeLocation>
	//    8   16:invokevirtual   #45  <Method int String.hashCode()>
	//    9   19:istore_1        
		return 31 + i;
	//   10   20:bipush          31
	//   11   22:iload_1         
	//   12   23:iadd            
	//   13   24:ireturn         
	}

	public boolean isExact()
	{
		return exact;
	//    0    0:aload_0         
	//    1    1:getfield        #26  <Field boolean exact>
	//    2    4:ireturn         
	}

	private static final long serialVersionUID = 0xec138717L;
	final String codeLocation;
	private final boolean exact;
	final String version;
}
