// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.exoplayer2.text.dvb;

import android.util.SparseArray;

// Referenced classes of package com.google.android.exoplayer2.text.dvb:
//			DvbParser

private static final class DvbParser$SubtitleService
{

	public void reset()
	{
		regions.clear();
	//    0    0:aload_0         
	//    1    1:getfield        #33  <Field SparseArray regions>
	//    2    4:invokevirtual   #50  <Method void SparseArray.clear()>
		cluts.clear();
	//    3    7:aload_0         
	//    4    8:getfield        #35  <Field SparseArray cluts>
	//    5   11:invokevirtual   #50  <Method void SparseArray.clear()>
		objects.clear();
	//    6   14:aload_0         
	//    7   15:getfield        #37  <Field SparseArray objects>
	//    8   18:invokevirtual   #50  <Method void SparseArray.clear()>
		ancillaryCluts.clear();
	//    9   21:aload_0         
	//   10   22:getfield        #39  <Field SparseArray ancillaryCluts>
	//   11   25:invokevirtual   #50  <Method void SparseArray.clear()>
		ancillaryObjects.clear();
	//   12   28:aload_0         
	//   13   29:getfield        #41  <Field SparseArray ancillaryObjects>
	//   14   32:invokevirtual   #50  <Method void SparseArray.clear()>
		displayDefinition = null;
	//   15   35:aload_0         
	//   16   36:aconst_null     
	//   17   37:putfield        #52  <Field DvbParser$DisplayDefinition displayDefinition>
		pageComposition = null;
	//   18   40:aload_0         
	//   19   41:aconst_null     
	//   20   42:putfield        #54  <Field DvbParser$PageComposition pageComposition>
	//   21   45:return          
	}

	public final SparseArray ancillaryCluts = new SparseArray();
	public final SparseArray ancillaryObjects = new SparseArray();
	public final int ancillaryPageId;
	public final SparseArray cluts = new SparseArray();
	public n displayDefinition;
	public final SparseArray objects = new SparseArray();
	public DvbParser$PageComposition pageComposition;
	public final SparseArray regions = new SparseArray();
	public final int subtitlePageId;

	public DvbParser$SubtitleService(int i, int j)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #28  <Method void Object()>
	//    2    4:aload_0         
	//    3    5:new             #30  <Class SparseArray>
	//    4    8:dup             
	//    5    9:invokespecial   #31  <Method void SparseArray()>
	//    6   12:putfield        #33  <Field SparseArray regions>
	//    7   15:aload_0         
	//    8   16:new             #30  <Class SparseArray>
	//    9   19:dup             
	//   10   20:invokespecial   #31  <Method void SparseArray()>
	//   11   23:putfield        #35  <Field SparseArray cluts>
	//   12   26:aload_0         
	//   13   27:new             #30  <Class SparseArray>
	//   14   30:dup             
	//   15   31:invokespecial   #31  <Method void SparseArray()>
	//   16   34:putfield        #37  <Field SparseArray objects>
	//   17   37:aload_0         
	//   18   38:new             #30  <Class SparseArray>
	//   19   41:dup             
	//   20   42:invokespecial   #31  <Method void SparseArray()>
	//   21   45:putfield        #39  <Field SparseArray ancillaryCluts>
	//   22   48:aload_0         
	//   23   49:new             #30  <Class SparseArray>
	//   24   52:dup             
	//   25   53:invokespecial   #31  <Method void SparseArray()>
	//   26   56:putfield        #41  <Field SparseArray ancillaryObjects>
		subtitlePageId = i;
	//   27   59:aload_0         
	//   28   60:iload_1         
	//   29   61:putfield        #43  <Field int subtitlePageId>
		ancillaryPageId = j;
	//   30   64:aload_0         
	//   31   65:iload_2         
	//   32   66:putfield        #45  <Field int ancillaryPageId>
	//   33   69:return          
	}
}
