// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.fasterxml.jackson.core.sym;


// Referenced classes of package com.fasterxml.jackson.core.sym:
//			ByteQuadsCanonicalizer

private static final class ByteQuadsCanonicalizer$TableInfo
{

	public static ByteQuadsCanonicalizer$TableInfo createInitial(int i)
	{
		int j = i << 3;
	//    0    0:iload_0         
	//    1    1:iconst_3        
	//    2    2:ishl            
	//    3    3:istore_1        
		return new ByteQuadsCanonicalizer$TableInfo(i, 0, ByteQuadsCanonicalizer._calcTertiaryShift(i), new int[j], new String[i << 1], j - i, j);
	//    4    4:new             #2   <Class ByteQuadsCanonicalizer$TableInfo>
	//    5    7:dup             
	//    6    8:iload_0         
	//    7    9:iconst_0        
	//    8   10:iload_0         
	//    9   11:invokestatic    #68  <Method int ByteQuadsCanonicalizer._calcTertiaryShift(int)>
	//   10   14:iload_1         
	//   11   15:newarray        int[]
	//   12   17:iload_0         
	//   13   18:iconst_1        
	//   14   19:ishl            
	//   15   20:anewarray       String[]
	//   16   23:iload_1         
	//   17   24:iload_0         
	//   18   25:isub            
	//   19   26:iload_1         
	//   20   27:invokespecial   #72  <Method void ByteQuadsCanonicalizer$TableInfo(int, int, int, int[], String[], int, int)>
	//   21   30:areturn         
	}

	public final int count;
	public final int longNameOffset;
	public final int mainHash[];
	public final String names[];
	public final int size;
	public final int spilloverEnd;
	public final int tertiaryShift;

	public ByteQuadsCanonicalizer$TableInfo(int i, int j, int k, int ai[], String as[], int l, int i1)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #22  <Method void Object()>
		size = i;
	//    2    4:aload_0         
	//    3    5:iload_1         
	//    4    6:putfield        #24  <Field int size>
		count = j;
	//    5    9:aload_0         
	//    6   10:iload_2         
	//    7   11:putfield        #26  <Field int count>
		tertiaryShift = k;
	//    8   14:aload_0         
	//    9   15:iload_3         
	//   10   16:putfield        #28  <Field int tertiaryShift>
		mainHash = ai;
	//   11   19:aload_0         
	//   12   20:aload           4
	//   13   22:putfield        #30  <Field int[] mainHash>
		names = as;
	//   14   25:aload_0         
	//   15   26:aload           5
	//   16   28:putfield        #32  <Field String[] names>
		spilloverEnd = l;
	//   17   31:aload_0         
	//   18   32:iload           6
	//   19   34:putfield        #34  <Field int spilloverEnd>
		longNameOffset = i1;
	//   20   37:aload_0         
	//   21   38:iload           7
	//   22   40:putfield        #36  <Field int longNameOffset>
	//   23   43:return          
	}

	public ByteQuadsCanonicalizer$TableInfo(ByteQuadsCanonicalizer bytequadscanonicalizer)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #22  <Method void Object()>
		size = ByteQuadsCanonicalizer.access$000(bytequadscanonicalizer);
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:invokestatic    #42  <Method int ByteQuadsCanonicalizer.access$000(ByteQuadsCanonicalizer)>
	//    5    9:putfield        #24  <Field int size>
		count = ByteQuadsCanonicalizer.access$100(bytequadscanonicalizer);
	//    6   12:aload_0         
	//    7   13:aload_1         
	//    8   14:invokestatic    #45  <Method int ByteQuadsCanonicalizer.access$100(ByteQuadsCanonicalizer)>
	//    9   17:putfield        #26  <Field int count>
		tertiaryShift = ByteQuadsCanonicalizer.access$200(bytequadscanonicalizer);
	//   10   20:aload_0         
	//   11   21:aload_1         
	//   12   22:invokestatic    #48  <Method int ByteQuadsCanonicalizer.access$200(ByteQuadsCanonicalizer)>
	//   13   25:putfield        #28  <Field int tertiaryShift>
		mainHash = ByteQuadsCanonicalizer.access$300(bytequadscanonicalizer);
	//   14   28:aload_0         
	//   15   29:aload_1         
	//   16   30:invokestatic    #52  <Method int[] ByteQuadsCanonicalizer.access$300(ByteQuadsCanonicalizer)>
	//   17   33:putfield        #30  <Field int[] mainHash>
		names = ByteQuadsCanonicalizer.access$400(bytequadscanonicalizer);
	//   18   36:aload_0         
	//   19   37:aload_1         
	//   20   38:invokestatic    #56  <Method String[] ByteQuadsCanonicalizer.access$400(ByteQuadsCanonicalizer)>
	//   21   41:putfield        #32  <Field String[] names>
		spilloverEnd = ByteQuadsCanonicalizer.access$500(bytequadscanonicalizer);
	//   22   44:aload_0         
	//   23   45:aload_1         
	//   24   46:invokestatic    #59  <Method int ByteQuadsCanonicalizer.access$500(ByteQuadsCanonicalizer)>
	//   25   49:putfield        #34  <Field int spilloverEnd>
		longNameOffset = ByteQuadsCanonicalizer.access$600(bytequadscanonicalizer);
	//   26   52:aload_0         
	//   27   53:aload_1         
	//   28   54:invokestatic    #62  <Method int ByteQuadsCanonicalizer.access$600(ByteQuadsCanonicalizer)>
	//   29   57:putfield        #36  <Field int longNameOffset>
	//   30   60:return          
	}
}
