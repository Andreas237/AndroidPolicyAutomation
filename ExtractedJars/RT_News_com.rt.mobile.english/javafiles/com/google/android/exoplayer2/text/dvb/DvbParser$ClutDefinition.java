// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.exoplayer2.text.dvb;


// Referenced classes of package com.google.android.exoplayer2.text.dvb:
//			DvbParser

private static final class DvbParser$ClutDefinition
{

	public final int clutEntries2Bit[];
	public final int clutEntries4Bit[];
	public final int clutEntries8Bit[];
	public final int id;

	public DvbParser$ClutDefinition(int i, int ai[], int ai1[], int ai2[])
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #18  <Method void Object()>
		id = i;
	//    2    4:aload_0         
	//    3    5:iload_1         
	//    4    6:putfield        #20  <Field int id>
		clutEntries2Bit = ai;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #22  <Field int[] clutEntries2Bit>
		clutEntries4Bit = ai1;
	//    8   14:aload_0         
	//    9   15:aload_3         
	//   10   16:putfield        #24  <Field int[] clutEntries4Bit>
		clutEntries8Bit = ai2;
	//   11   19:aload_0         
	//   12   20:aload           4
	//   13   22:putfield        #26  <Field int[] clutEntries8Bit>
	//   14   25:return          
	}
}
