// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.arch.persistence.room.util;

import java.util.List;

// Referenced classes of package android.arch.persistence.room.util:
//			TableInfo

public static class TableInfo$Index
{

	public boolean equals(Object obj)
	{
		if(this == obj)
	//*   0    0:aload_0         
	//*   1    1:aload_1         
	//*   2    2:if_acmpne       7
			return true;
	//    3    5:iconst_1        
	//    4    6:ireturn         
		if(obj != null)
	//*   5    7:aload_1         
	//*   6    8:ifnull          94
		{
			if(((Object)this).getClass() != obj.getClass())
	//*   7   11:aload_0         
	//*   8   12:invokevirtual   #41  <Method Class Object.getClass()>
	//*   9   15:aload_1         
	//*  10   16:invokevirtual   #41  <Method Class Object.getClass()>
	//*  11   19:if_acmpeq       24
				return false;
	//   12   22:iconst_0        
	//   13   23:ireturn         
			obj = ((Object) ((TableInfo$Index)obj));
	//   14   24:aload_1         
	//   15   25:checkcast       #2   <Class TableInfo$Index>
	//   16   28:astore_1        
			if(unique != ((TableInfo$Index) (obj)).unique)
	//*  17   29:aload_0         
	//*  18   30:getfield        #30  <Field boolean unique>
	//*  19   33:aload_1         
	//*  20   34:getfield        #30  <Field boolean unique>
	//*  21   37:icmpeq          42
				return false;
	//   22   40:iconst_0        
	//   23   41:ireturn         
			if(!columns.equals(((Object) (((TableInfo$Index) (obj)).columns))))
	//*  24   42:aload_0         
	//*  25   43:getfield        #32  <Field List columns>
	//*  26   46:aload_1         
	//*  27   47:getfield        #32  <Field List columns>
	//*  28   50:invokeinterface #45  <Method boolean List.equals(Object)>
	//*  29   55:ifne            60
				return false;
	//   30   58:iconst_0        
	//   31   59:ireturn         
			if(name.startsWith("index_"))
	//*  32   60:aload_0         
	//*  33   61:getfield        #28  <Field String name>
	//*  34   64:ldc1            #15  <String "index_">
	//*  35   66:invokevirtual   #51  <Method boolean String.startsWith(String)>
	//*  36   69:ifeq            82
				return ((TableInfo$Index) (obj)).name.startsWith("index_");
	//   37   72:aload_1         
	//   38   73:getfield        #28  <Field String name>
	//   39   76:ldc1            #15  <String "index_">
	//   40   78:invokevirtual   #51  <Method boolean String.startsWith(String)>
	//   41   81:ireturn         
			else
				return name.equals(((Object) (((TableInfo$Index) (obj)).name)));
	//   42   82:aload_0         
	//   43   83:getfield        #28  <Field String name>
	//   44   86:aload_1         
	//   45   87:getfield        #28  <Field String name>
	//   46   90:invokevirtual   #52  <Method boolean String.equals(Object)>
	//   47   93:ireturn         
		} else
		{
			return false;
	//   48   94:iconst_0        
	//   49   95:ireturn         
		}
	}

	public int hashCode()
	{
		throw new Runtime("d2j fail translate: java.lang.RuntimeException: can not merge I and Z\n\tat com.googlecode.dex2jar.ir.TypeClass.merge(TypeClass.java:100)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeRef.updateTypeClass(TypeTransformer.java:174)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.provideAs(TypeTransformer.java:780)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.e1expr(TypeTransformer.java:496)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:713)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:703)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.e2expr(TypeTransformer.java:632)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:716)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:703)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.e2expr(TypeTransformer.java:629)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:716)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:703)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.e2expr(TypeTransformer.java:629)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:716)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:703)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.s1stmt(TypeTransformer.java:810)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.sxStmt(TypeTransformer.java:840)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.analyze(TypeTransformer.java:206)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer.transform(TypeTransformer.java:44)\n\tat com.googlecode.d2j.dex.Dex2jar$2.optimize(Dex2jar.java:162)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertCode(Dex2Asm.java:414)\n\tat com.googlecode.d2j.dex.ExDex2Asm.convertCode(ExDex2Asm.java:42)\n\tat com.googlecode.d2j.dex.Dex2jar$2.convertCode(Dex2jar.java:128)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertMethod(Dex2Asm.java:509)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertClass(Dex2Asm.java:406)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertDex(Dex2Asm.java:422)\n\tat com.googlecode.d2j.dex.Dex2jar.doTranslate(Dex2jar.java:172)\n\tat com.googlecode.d2j.dex.Dex2jar.to(Dex2jar.java:272)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.doCommandLine(Dex2jarCmd.java:108)\n\tat com.googlecode.dex2jar.tools.BaseCmd.doMain(BaseCmd.java:288)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.main(Dex2jarCmd.java:32)\n");
	//    0    0:new             #56  <Class RuntimeException>
	//    1    3:dup             
	//    2    4:ldc1            #58  <String "d2j fail translate: java.lang.RuntimeException: can not merge I and Z\n\tat com.googlecode.dex2jar.ir.TypeClass.merge(TypeClass.java:100)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeRef.updateTypeClass(TypeTransformer.java:174)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.provideAs(TypeTransformer.java:780)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.e1expr(TypeTransformer.java:496)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:713)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:703)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.e2expr(TypeTransformer.java:632)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:716)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:703)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.e2expr(TypeTransformer.java:629)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:716)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:703)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.e2expr(TypeTransformer.java:629)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:716)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:703)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.s1stmt(TypeTransformer.java:810)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.sxStmt(TypeTransformer.java:840)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.analyze(TypeTransformer.java:206)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer.transform(TypeTransformer.java:44)\n\tat com.googlecode.d2j.dex.Dex2jar$2.optimize(Dex2jar.java:162)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertCode(Dex2Asm.java:414)\n\tat com.googlecode.d2j.dex.ExDex2Asm.convertCode(ExDex2Asm.java:42)\n\tat com.googlecode.d2j.dex.Dex2jar$2.convertCode(Dex2jar.java:128)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertMethod(Dex2Asm.java:509)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertClass(Dex2Asm.java:406)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertDex(Dex2Asm.java:422)\n\tat com.googlecode.d2j.dex.Dex2jar.doTranslate(Dex2jar.java:172)\n\tat com.googlecode.d2j.dex.Dex2jar.to(Dex2jar.java:272)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.doCommandLine(Dex2jarCmd.java:108)\n\tat com.googlecode.dex2jar.tools.BaseCmd.doMain(BaseCmd.java:288)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.main(Dex2jarCmd.java:32)\n">
	//    3    6:invokespecial   #63  <Method void Runtime(String)>
	//    4    9:athrow          
	}

	public String toString()
	{
		StringBuilder stringbuilder = new StringBuilder();
	//    0    0:new             #67  <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #68  <Method void StringBuilder()>
	//    3    7:astore_1        
		stringbuilder.append("Index{name='");
	//    4    8:aload_1         
	//    5    9:ldc1            #70  <String "Index{name='">
	//    6   11:invokevirtual   #74  <Method StringBuilder StringBuilder.append(String)>
	//    7   14:pop             
		stringbuilder.append(name);
	//    8   15:aload_1         
	//    9   16:aload_0         
	//   10   17:getfield        #28  <Field String name>
	//   11   20:invokevirtual   #74  <Method StringBuilder StringBuilder.append(String)>
	//   12   23:pop             
		stringbuilder.append('\'');
	//   13   24:aload_1         
	//   14   25:bipush          39
	//   15   27:invokevirtual   #77  <Method StringBuilder StringBuilder.append(char)>
	//   16   30:pop             
		stringbuilder.append(", unique=");
	//   17   31:aload_1         
	//   18   32:ldc1            #79  <String ", unique=">
	//   19   34:invokevirtual   #74  <Method StringBuilder StringBuilder.append(String)>
	//   20   37:pop             
		stringbuilder.append(unique);
	//   21   38:aload_1         
	//   22   39:aload_0         
	//   23   40:getfield        #30  <Field boolean unique>
	//   24   43:invokevirtual   #82  <Method StringBuilder StringBuilder.append(boolean)>
	//   25   46:pop             
		stringbuilder.append(", columns=");
	//   26   47:aload_1         
	//   27   48:ldc1            #84  <String ", columns=">
	//   28   50:invokevirtual   #74  <Method StringBuilder StringBuilder.append(String)>
	//   29   53:pop             
		stringbuilder.append(((Object) (columns)));
	//   30   54:aload_1         
	//   31   55:aload_0         
	//   32   56:getfield        #32  <Field List columns>
	//   33   59:invokevirtual   #87  <Method StringBuilder StringBuilder.append(Object)>
	//   34   62:pop             
		stringbuilder.append('}');
	//   35   63:aload_1         
	//   36   64:bipush          125
	//   37   66:invokevirtual   #77  <Method StringBuilder StringBuilder.append(char)>
	//   38   69:pop             
		return stringbuilder.toString();
	//   39   70:aload_1         
	//   40   71:invokevirtual   #89  <Method String StringBuilder.toString()>
	//   41   74:areturn         
	}

	public static final String DEFAULT_PREFIX = "index_";
	public final List columns;
	public final String name;
	public final boolean unique;

	public TableInfo$Index(String s, boolean flag, List list)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #26  <Method void Object()>
		name = s;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #28  <Field String name>
		unique = flag;
	//    5    9:aload_0         
	//    6   10:iload_2         
	//    7   11:putfield        #30  <Field boolean unique>
		columns = list;
	//    8   14:aload_0         
	//    9   15:aload_3         
	//   10   16:putfield        #32  <Field List columns>
	//   11   19:return          
	}
}
