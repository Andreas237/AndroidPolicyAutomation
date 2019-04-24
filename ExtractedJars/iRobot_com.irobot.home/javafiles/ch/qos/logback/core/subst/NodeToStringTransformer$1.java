// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package ch.qos.logback.core.subst;


// Referenced classes of package ch.qos.logback.core.subst:
//			NodeToStringTransformer

static class NodeToStringTransformer$1
{

	static final int $SwitchMap$ch$qos$logback$core$subst$Node$Type[];

	static 
	{
		$SwitchMap$ch$qos$logback$core$subst$Node$Type = new int[Node.Type.values().length];
	//    0    0:invokestatic    #18  <Method Node$Type[] Node$Type.values()>
	//    1    3:arraylength     
	//    2    4:newarray        int[]
	//    3    6:putstatic       #20  <Field int[] $SwitchMap$ch$qos$logback$core$subst$Node$Type>
		try
		{
			$SwitchMap$ch$qos$logback$core$subst$Node$Type[Node.Type.LITERAL.ordinal()] = 1;
	//    4    9:getstatic       #20  <Field int[] $SwitchMap$ch$qos$logback$core$subst$Node$Type>
	//    5   12:getstatic       #24  <Field Node$Type Node$Type.LITERAL>
	//    6   15:invokevirtual   #28  <Method int Node$Type.ordinal()>
	//    7   18:iconst_1        
	//    8   19:iastore         
		}
	//*   9   20:getstatic       #20  <Field int[] $SwitchMap$ch$qos$logback$core$subst$Node$Type>
	//*  10   23:getstatic       #31  <Field Node$Type Node$Type.VARIABLE>
	//*  11   26:invokevirtual   #28  <Method int Node$Type.ordinal()>
	//*  12   29:iconst_2        
	//*  13   30:iastore         
	//*  14   31:return          
		catch(NoSuchFieldError nosuchfielderror) { }
	//   15   32:astore_0        
		try
		{
			$SwitchMap$ch$qos$logback$core$subst$Node$Type[Node.Type.VARIABLE.ordinal()] = 2;
		}
	//*  16   33:goto            20
		catch(NoSuchFieldError nosuchfielderror1) { }
	//   17   36:astore_0        
	//*  18   37:return          
	}
}
