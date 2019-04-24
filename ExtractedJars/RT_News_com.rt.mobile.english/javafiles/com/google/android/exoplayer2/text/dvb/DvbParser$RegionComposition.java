// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.exoplayer2.text.dvb;

import android.util.SparseArray;

// Referenced classes of package com.google.android.exoplayer2.text.dvb:
//			DvbParser

private static final class DvbParser$RegionComposition
{

	public void mergeFrom(DvbParser$RegionComposition dvbparser$regioncomposition)
	{
		if(dvbparser$regioncomposition == null)
	//*   0    0:aload_1         
	//*   1    1:ifnonnull       5
			return;
	//    2    4:return          
		dvbparser$regioncomposition = ((DvbParser$RegionComposition) (dvbparser$regioncomposition.regionObjects));
	//    3    5:aload_1         
	//    4    6:getfield        #49  <Field SparseArray regionObjects>
	//    5    9:astore_1        
		for(int i = 0; i < ((SparseArray) (dvbparser$regioncomposition)).size(); i++)
	//*   6   10:iconst_0        
	//*   7   11:istore_2        
	//*   8   12:iload_2         
	//*   9   13:aload_1         
	//*  10   14:invokevirtual   #60  <Method int SparseArray.size()>
	//*  11   17:icmpge          44
			regionObjects.put(((SparseArray) (dvbparser$regioncomposition)).keyAt(i), ((SparseArray) (dvbparser$regioncomposition)).valueAt(i));
	//   12   20:aload_0         
	//   13   21:getfield        #49  <Field SparseArray regionObjects>
	//   14   24:aload_1         
	//   15   25:iload_2         
	//   16   26:invokevirtual   #64  <Method int SparseArray.keyAt(int)>
	//   17   29:aload_1         
	//   18   30:iload_2         
	//   19   31:invokevirtual   #68  <Method Object SparseArray.valueAt(int)>
	//   20   34:invokevirtual   #72  <Method void SparseArray.put(int, Object)>

	//   21   37:iload_2         
	//   22   38:iconst_1        
	//   23   39:iadd            
	//   24   40:istore_2        
	//*  25   41:goto            12
	//   26   44:return          
	}

	public final int clutId;
	public final int depth;
	public final boolean fillFlag;
	public final int height;
	public final int id;
	public final int levelOfCompatibility;
	public final int pixelCode2Bit;
	public final int pixelCode4Bit;
	public final int pixelCode8Bit;
	public final SparseArray regionObjects;
	public final int width;

	public DvbParser$RegionComposition(int i, boolean flag, int j, int k, int l, int i1, int j1, 
			int k1, int l1, int i2, SparseArray sparsearray)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #27  <Method void Object()>
		id = i;
	//    2    4:aload_0         
	//    3    5:iload_1         
	//    4    6:putfield        #29  <Field int id>
		fillFlag = flag;
	//    5    9:aload_0         
	//    6   10:iload_2         
	//    7   11:putfield        #31  <Field boolean fillFlag>
		width = j;
	//    8   14:aload_0         
	//    9   15:iload_3         
	//   10   16:putfield        #33  <Field int width>
		height = k;
	//   11   19:aload_0         
	//   12   20:iload           4
	//   13   22:putfield        #35  <Field int height>
		levelOfCompatibility = l;
	//   14   25:aload_0         
	//   15   26:iload           5
	//   16   28:putfield        #37  <Field int levelOfCompatibility>
		depth = i1;
	//   17   31:aload_0         
	//   18   32:iload           6
	//   19   34:putfield        #39  <Field int depth>
		clutId = j1;
	//   20   37:aload_0         
	//   21   38:iload           7
	//   22   40:putfield        #41  <Field int clutId>
		pixelCode8Bit = k1;
	//   23   43:aload_0         
	//   24   44:iload           8
	//   25   46:putfield        #43  <Field int pixelCode8Bit>
		pixelCode4Bit = l1;
	//   26   49:aload_0         
	//   27   50:iload           9
	//   28   52:putfield        #45  <Field int pixelCode4Bit>
		pixelCode2Bit = i2;
	//   29   55:aload_0         
	//   30   56:iload           10
	//   31   58:putfield        #47  <Field int pixelCode2Bit>
		regionObjects = sparsearray;
	//   32   61:aload_0         
	//   33   62:aload           11
	//   34   64:putfield        #49  <Field SparseArray regionObjects>
	//   35   67:return          
	}
}
