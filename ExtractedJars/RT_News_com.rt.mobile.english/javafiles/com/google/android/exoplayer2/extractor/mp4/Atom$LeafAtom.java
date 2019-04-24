// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.exoplayer2.extractor.mp4;

import com.google.android.exoplayer2.util.ParsableByteArray;

// Referenced classes of package com.google.android.exoplayer2.extractor.mp4:
//			Atom

static final class Atom$LeafAtom extends Atom
{

	public final ParsableByteArray data;

	public Atom$LeafAtom(int i, ParsableByteArray parsablebytearray)
	{
		super(i);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokespecial   #12  <Method void Atom(int)>
		data = parsablebytearray;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #14  <Field ParsableByteArray data>
	//    6   10:return          
	}
}
