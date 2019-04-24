// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.fasterxml.jackson.core.sym;


// Referenced classes of package com.fasterxml.jackson.core.sym:
//			CharsToNameCanonicalizer

private static final class CharsToNameCanonicalizer$TableInfo
{

	public static CharsToNameCanonicalizer$TableInfo createInitial(int i)
	{
		return new CharsToNameCanonicalizer$TableInfo(0, 0, new String[i], new CharsToNameCanonicalizer.Bucket[i >> 1]);
	//    0    0:new             #2   <Class CharsToNameCanonicalizer$TableInfo>
	//    1    3:dup             
	//    2    4:iconst_0        
	//    3    5:iconst_0        
	//    4    6:iload_0         
	//    5    7:anewarray       String[]
	//    6   10:iload_0         
	//    7   11:iconst_1        
	//    8   12:ishr            
	//    9   13:anewarray       CharsToNameCanonicalizer.Bucket[]
	//   10   16:invokespecial   #52  <Method void CharsToNameCanonicalizer$TableInfo(int, int, String[], CharsToNameCanonicalizer$Bucket[])>
	//   11   19:areturn         
	}

	final CharsToNameCanonicalizer.Bucket buckets[];
	final int longestCollisionList;
	final int size;
	final String symbols[];

	public CharsToNameCanonicalizer$TableInfo(int i, int j, String as[], CharsToNameCanonicalizer.Bucket abucket[])
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #19  <Method void Object()>
		size = i;
	//    2    4:aload_0         
	//    3    5:iload_1         
	//    4    6:putfield        #21  <Field int size>
		longestCollisionList = j;
	//    5    9:aload_0         
	//    6   10:iload_2         
	//    7   11:putfield        #23  <Field int longestCollisionList>
		symbols = as;
	//    8   14:aload_0         
	//    9   15:aload_3         
	//   10   16:putfield        #25  <Field String[] symbols>
		buckets = abucket;
	//   11   19:aload_0         
	//   12   20:aload           4
	//   13   22:putfield        #27  <Field CharsToNameCanonicalizer$Bucket[] buckets>
	//   14   25:return          
	}

	public CharsToNameCanonicalizer$TableInfo(CharsToNameCanonicalizer charstonamecanonicalizer)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #19  <Method void Object()>
		size = CharsToNameCanonicalizer.access$000(charstonamecanonicalizer);
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:invokestatic    #33  <Method int CharsToNameCanonicalizer.access$000(CharsToNameCanonicalizer)>
	//    5    9:putfield        #21  <Field int size>
		longestCollisionList = CharsToNameCanonicalizer.access$100(charstonamecanonicalizer);
	//    6   12:aload_0         
	//    7   13:aload_1         
	//    8   14:invokestatic    #36  <Method int CharsToNameCanonicalizer.access$100(CharsToNameCanonicalizer)>
	//    9   17:putfield        #23  <Field int longestCollisionList>
		symbols = CharsToNameCanonicalizer.access$200(charstonamecanonicalizer);
	//   10   20:aload_0         
	//   11   21:aload_1         
	//   12   22:invokestatic    #40  <Method String[] CharsToNameCanonicalizer.access$200(CharsToNameCanonicalizer)>
	//   13   25:putfield        #25  <Field String[] symbols>
		buckets = CharsToNameCanonicalizer.access$300(charstonamecanonicalizer);
	//   14   28:aload_0         
	//   15   29:aload_1         
	//   16   30:invokestatic    #44  <Method CharsToNameCanonicalizer$Bucket[] CharsToNameCanonicalizer.access$300(CharsToNameCanonicalizer)>
	//   17   33:putfield        #27  <Field CharsToNameCanonicalizer$Bucket[] buckets>
	//   18   36:return          
	}
}
