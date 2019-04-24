// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package butterknife.internal;


// Referenced classes of package butterknife.internal:
//			ViewInjector

static class ViewInjector$1
{

	static final int $SwitchMap$butterknife$internal$CollectionBinding$Kind[];

	static 
	{
		$SwitchMap$butterknife$internal$CollectionBinding$Kind = new int[ng.Kind.values().length];
	//    0    0:invokestatic    #18  <Method CollectionBinding$Kind[] CollectionBinding$Kind.values()>
	//    1    3:arraylength     
	//    2    4:newarray        int[]
	//    3    6:putstatic       #20  <Field int[] $SwitchMap$butterknife$internal$CollectionBinding$Kind>
		try
		{
			$SwitchMap$butterknife$internal$CollectionBinding$Kind[ng.Kind.ARRAY.ordinal()] = 1;
	//    4    9:getstatic       #20  <Field int[] $SwitchMap$butterknife$internal$CollectionBinding$Kind>
	//    5   12:getstatic       #24  <Field CollectionBinding$Kind CollectionBinding$Kind.ARRAY>
	//    6   15:invokevirtual   #28  <Method int CollectionBinding$Kind.ordinal()>
	//    7   18:iconst_1        
	//    8   19:iastore         
		}
	//*   9   20:getstatic       #20  <Field int[] $SwitchMap$butterknife$internal$CollectionBinding$Kind>
	//*  10   23:getstatic       #31  <Field CollectionBinding$Kind CollectionBinding$Kind.LIST>
	//*  11   26:invokevirtual   #28  <Method int CollectionBinding$Kind.ordinal()>
	//*  12   29:iconst_2        
	//*  13   30:iastore         
	//*  14   31:return          
		catch(NoSuchFieldError nosuchfielderror) { }
	//   15   32:astore_0        
		try
		{
			$SwitchMap$butterknife$internal$CollectionBinding$Kind[ng.Kind.LIST.ordinal()] = 2;
		}
	//*  16   33:goto            20
		catch(NoSuchFieldError nosuchfielderror1) { }
	//   17   36:astore_0        
	//*  18   37:return          
	}
}
