// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.firebase.client.snapshot;


// Referenced classes of package com.firebase.client.snapshot:
//			StringNode

static class StringNode$1
{

	static final int $SwitchMap$com$firebase$client$snapshot$Node$HashVersion[];

	static 
	{
		$SwitchMap$com$firebase$client$snapshot$Node$HashVersion = new int[ion.values().length];
	//    0    0:invokestatic    #18  <Method Node$HashVersion[] Node$HashVersion.values()>
	//    1    3:arraylength     
	//    2    4:newarray        int[]
	//    3    6:putstatic       #20  <Field int[] $SwitchMap$com$firebase$client$snapshot$Node$HashVersion>
		try
		{
			$SwitchMap$com$firebase$client$snapshot$Node$HashVersion[ion.V1.ordinal()] = 1;
	//    4    9:getstatic       #20  <Field int[] $SwitchMap$com$firebase$client$snapshot$Node$HashVersion>
	//    5   12:getstatic       #24  <Field Node$HashVersion Node$HashVersion.V1>
	//    6   15:invokevirtual   #28  <Method int Node$HashVersion.ordinal()>
	//    7   18:iconst_1        
	//    8   19:iastore         
		}
	//*   9   20:getstatic       #20  <Field int[] $SwitchMap$com$firebase$client$snapshot$Node$HashVersion>
	//*  10   23:getstatic       #31  <Field Node$HashVersion Node$HashVersion.V2>
	//*  11   26:invokevirtual   #28  <Method int Node$HashVersion.ordinal()>
	//*  12   29:iconst_2        
	//*  13   30:iastore         
	//*  14   31:return          
		catch(NoSuchFieldError nosuchfielderror) { }
	//   15   32:astore_0        
		try
		{
			$SwitchMap$com$firebase$client$snapshot$Node$HashVersion[ion.V2.ordinal()] = 2;
		}
	//*  16   33:goto            20
		catch(NoSuchFieldError nosuchfielderror1) { }
	//   17   36:astore_0        
	//*  18   37:return          
	}
}
