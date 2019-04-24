// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.exoplayer2.extractor;


// Referenced classes of package com.google.android.exoplayer2.extractor:
//			GaplessInfoHolder

static final class GaplessInfoHolder$1
	implements com.google.android.exoplayer2.metadata.id3.icate
{

	public boolean evaluate(int i, int j, int k, int l, int i1)
	{
		return j == 67 && k == 79 && l == 77 && (i1 == 77 || i == 2);
	//    0    0:iload_2         
	//    1    1:bipush          67
	//    2    3:icmpne          33
	//    3    6:iload_3         
	//    4    7:bipush          79
	//    5    9:icmpne          33
	//    6   12:iload           4
	//    7   14:bipush          77
	//    8   16:icmpne          33
	//    9   19:iload           5
	//   10   21:bipush          77
	//   11   23:icmpeq          31
	//   12   26:iload_1         
	//   13   27:iconst_2        
	//   14   28:icmpne          33
	//   15   31:iconst_1        
	//   16   32:ireturn         
	//   17   33:iconst_0        
	//   18   34:ireturn         
	}

	GaplessInfoHolder$1()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #12  <Method void Object()>
	//    2    4:return          
	}
}
