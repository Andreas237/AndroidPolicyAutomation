// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.exoplayer2.text.dvb;

import android.graphics.*;
import android.util.Log;
import android.util.SparseArray;
import com.google.android.exoplayer2.text.Cue;
import com.google.android.exoplayer2.util.ParsableBitArray;
import com.google.android.exoplayer2.util.Util;
import java.util.*;

final class DvbParser
{
	private static final class ClutDefinition
	{

		public final int clutEntries2Bit[];
		public final int clutEntries4Bit[];
		public final int clutEntries8Bit[];
		public final int id;

		public ClutDefinition(int i, int ai[], int ai1[], int ai2[])
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

	private static final class DisplayDefinition
	{

		public final int height;
		public final int horizontalPositionMaximum;
		public final int horizontalPositionMinimum;
		public final int verticalPositionMaximum;
		public final int verticalPositionMinimum;
		public final int width;

		public DisplayDefinition(int i, int j, int k, int l, int i1, int j1)
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #19  <Method void Object()>
			width = i;
		//    2    4:aload_0         
		//    3    5:iload_1         
		//    4    6:putfield        #21  <Field int width>
			height = j;
		//    5    9:aload_0         
		//    6   10:iload_2         
		//    7   11:putfield        #23  <Field int height>
			horizontalPositionMinimum = k;
		//    8   14:aload_0         
		//    9   15:iload_3         
		//   10   16:putfield        #25  <Field int horizontalPositionMinimum>
			horizontalPositionMaximum = l;
		//   11   19:aload_0         
		//   12   20:iload           4
		//   13   22:putfield        #27  <Field int horizontalPositionMaximum>
			verticalPositionMinimum = i1;
		//   14   25:aload_0         
		//   15   26:iload           5
		//   16   28:putfield        #29  <Field int verticalPositionMinimum>
			verticalPositionMaximum = j1;
		//   17   31:aload_0         
		//   18   32:iload           6
		//   19   34:putfield        #31  <Field int verticalPositionMaximum>
		//   20   37:return          
		}
	}

	private static final class ObjectData
	{

		public final byte bottomFieldData[];
		public final int id;
		public final boolean nonModifyingColorFlag;
		public final byte topFieldData[];

		public ObjectData(int i, boolean flag, byte abyte0[], byte abyte1[])
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #19  <Method void Object()>
			id = i;
		//    2    4:aload_0         
		//    3    5:iload_1         
		//    4    6:putfield        #21  <Field int id>
			nonModifyingColorFlag = flag;
		//    5    9:aload_0         
		//    6   10:iload_2         
		//    7   11:putfield        #23  <Field boolean nonModifyingColorFlag>
			topFieldData = abyte0;
		//    8   14:aload_0         
		//    9   15:aload_3         
		//   10   16:putfield        #25  <Field byte[] topFieldData>
			bottomFieldData = abyte1;
		//   11   19:aload_0         
		//   12   20:aload           4
		//   13   22:putfield        #27  <Field byte[] bottomFieldData>
		//   14   25:return          
		}
	}

	private static final class PageComposition
	{

		public final SparseArray regions;
		public final int state;
		public final int timeOutSecs;
		public final int version;

		public PageComposition(int i, int j, int k, SparseArray sparsearray)
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #19  <Method void Object()>
			timeOutSecs = i;
		//    2    4:aload_0         
		//    3    5:iload_1         
		//    4    6:putfield        #21  <Field int timeOutSecs>
			version = j;
		//    5    9:aload_0         
		//    6   10:iload_2         
		//    7   11:putfield        #23  <Field int version>
			state = k;
		//    8   14:aload_0         
		//    9   15:iload_3         
		//   10   16:putfield        #25  <Field int state>
			regions = sparsearray;
		//   11   19:aload_0         
		//   12   20:aload           4
		//   13   22:putfield        #27  <Field SparseArray regions>
		//   14   25:return          
		}
	}

	private static final class PageRegion
	{

		public final int horizontalAddress;
		public final int verticalAddress;

		public PageRegion(int i, int j)
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #15  <Method void Object()>
			horizontalAddress = i;
		//    2    4:aload_0         
		//    3    5:iload_1         
		//    4    6:putfield        #17  <Field int horizontalAddress>
			verticalAddress = j;
		//    5    9:aload_0         
		//    6   10:iload_2         
		//    7   11:putfield        #19  <Field int verticalAddress>
		//    8   14:return          
		}
	}

	private static final class RegionComposition
	{

		public void mergeFrom(RegionComposition regioncomposition)
		{
			if(regioncomposition == null)
		//*   0    0:aload_1         
		//*   1    1:ifnonnull       5
				return;
		//    2    4:return          
			regioncomposition = ((RegionComposition) (regioncomposition.regionObjects));
		//    3    5:aload_1         
		//    4    6:getfield        #49  <Field SparseArray regionObjects>
		//    5    9:astore_1        
			for(int i = 0; i < ((SparseArray) (regioncomposition)).size(); i++)
		//*   6   10:iconst_0        
		//*   7   11:istore_2        
		//*   8   12:iload_2         
		//*   9   13:aload_1         
		//*  10   14:invokevirtual   #60  <Method int SparseArray.size()>
		//*  11   17:icmpge          44
				regionObjects.put(((SparseArray) (regioncomposition)).keyAt(i), ((SparseArray) (regioncomposition)).valueAt(i));
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

		public RegionComposition(int i, boolean flag, int j, int k, int l, int i1, int j1, 
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

	private static final class RegionObject
	{

		public final int backgroundPixelCode;
		public final int foregroundPixelCode;
		public final int horizontalPosition;
		public final int provider;
		public final int type;
		public final int verticalPosition;

		public RegionObject(int i, int j, int k, int l, int i1, int j1)
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #19  <Method void Object()>
			type = i;
		//    2    4:aload_0         
		//    3    5:iload_1         
		//    4    6:putfield        #21  <Field int type>
			provider = j;
		//    5    9:aload_0         
		//    6   10:iload_2         
		//    7   11:putfield        #23  <Field int provider>
			horizontalPosition = k;
		//    8   14:aload_0         
		//    9   15:iload_3         
		//   10   16:putfield        #25  <Field int horizontalPosition>
			verticalPosition = l;
		//   11   19:aload_0         
		//   12   20:iload           4
		//   13   22:putfield        #27  <Field int verticalPosition>
			foregroundPixelCode = i1;
		//   14   25:aload_0         
		//   15   26:iload           5
		//   16   28:putfield        #29  <Field int foregroundPixelCode>
			backgroundPixelCode = j1;
		//   17   31:aload_0         
		//   18   32:iload           6
		//   19   34:putfield        #31  <Field int backgroundPixelCode>
		//   20   37:return          
		}
	}

	private static final class SubtitleService
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
		public DisplayDefinition displayDefinition;
		public final SparseArray objects = new SparseArray();
		public PageComposition pageComposition;
		public final SparseArray regions = new SparseArray();
		public final int subtitlePageId;

		public SubtitleService(int i, int j)
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


	public DvbParser(int i, int j)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #109 <Method void Object()>
	//    2    4:aload_0         
	//    3    5:new             #111 <Class Paint>
	//    4    8:dup             
	//    5    9:invokespecial   #112 <Method void Paint()>
	//    6   12:putfield        #114 <Field Paint defaultPaint>
		defaultPaint.setStyle(android.graphics.Paint.Style.FILL_AND_STROKE);
	//    7   15:aload_0         
	//    8   16:getfield        #114 <Field Paint defaultPaint>
	//    9   19:getstatic       #120 <Field android.graphics.Paint$Style android.graphics.Paint$Style.FILL_AND_STROKE>
	//   10   22:invokevirtual   #124 <Method void Paint.setStyle(android.graphics.Paint$Style)>
		defaultPaint.setXfermode(((android.graphics.Xfermode) (new PorterDuffXfermode(android.graphics.PorterDuff.Mode.SRC))));
	//   11   25:aload_0         
	//   12   26:getfield        #114 <Field Paint defaultPaint>
	//   13   29:new             #126 <Class PorterDuffXfermode>
	//   14   32:dup             
	//   15   33:getstatic       #132 <Field android.graphics.PorterDuff$Mode android.graphics.PorterDuff$Mode.SRC>
	//   16   36:invokespecial   #135 <Method void PorterDuffXfermode(android.graphics.PorterDuff$Mode)>
	//   17   39:invokevirtual   #139 <Method android.graphics.Xfermode Paint.setXfermode(android.graphics.Xfermode)>
	//   18   42:pop             
		defaultPaint.setPathEffect(((android.graphics.PathEffect) (null)));
	//   19   43:aload_0         
	//   20   44:getfield        #114 <Field Paint defaultPaint>
	//   21   47:aconst_null     
	//   22   48:invokevirtual   #143 <Method android.graphics.PathEffect Paint.setPathEffect(android.graphics.PathEffect)>
	//   23   51:pop             
	//   24   52:aload_0         
	//   25   53:new             #111 <Class Paint>
	//   26   56:dup             
	//   27   57:invokespecial   #112 <Method void Paint()>
	//   28   60:putfield        #145 <Field Paint fillRegionPaint>
		fillRegionPaint.setStyle(android.graphics.Paint.Style.FILL);
	//   29   63:aload_0         
	//   30   64:getfield        #145 <Field Paint fillRegionPaint>
	//   31   67:getstatic       #148 <Field android.graphics.Paint$Style android.graphics.Paint$Style.FILL>
	//   32   70:invokevirtual   #124 <Method void Paint.setStyle(android.graphics.Paint$Style)>
		fillRegionPaint.setXfermode(((android.graphics.Xfermode) (new PorterDuffXfermode(android.graphics.PorterDuff.Mode.DST_OVER))));
	//   33   73:aload_0         
	//   34   74:getfield        #145 <Field Paint fillRegionPaint>
	//   35   77:new             #126 <Class PorterDuffXfermode>
	//   36   80:dup             
	//   37   81:getstatic       #151 <Field android.graphics.PorterDuff$Mode android.graphics.PorterDuff$Mode.DST_OVER>
	//   38   84:invokespecial   #135 <Method void PorterDuffXfermode(android.graphics.PorterDuff$Mode)>
	//   39   87:invokevirtual   #139 <Method android.graphics.Xfermode Paint.setXfermode(android.graphics.Xfermode)>
	//   40   90:pop             
		fillRegionPaint.setPathEffect(((android.graphics.PathEffect) (null)));
	//   41   91:aload_0         
	//   42   92:getfield        #145 <Field Paint fillRegionPaint>
	//   43   95:aconst_null     
	//   44   96:invokevirtual   #143 <Method android.graphics.PathEffect Paint.setPathEffect(android.graphics.PathEffect)>
	//   45   99:pop             
	//   46  100:aload_0         
	//   47  101:new             #153 <Class Canvas>
	//   48  104:dup             
	//   49  105:invokespecial   #154 <Method void Canvas()>
	//   50  108:putfield        #156 <Field Canvas canvas>
	//   51  111:aload_0         
	//   52  112:new             #9   <Class DvbParser$DisplayDefinition>
	//   53  115:dup             
	//   54  116:sipush          719
	//   55  119:sipush          575
	//   56  122:iconst_0        
	//   57  123:sipush          719
	//   58  126:iconst_0        
	//   59  127:sipush          575
	//   60  130:invokespecial   #159 <Method void DvbParser$DisplayDefinition(int, int, int, int, int, int)>
	//   61  133:putfield        #161 <Field DvbParser$DisplayDefinition defaultDisplayDefinition>
	//   62  136:aload_0         
	//   63  137:new             #6   <Class DvbParser$ClutDefinition>
	//   64  140:dup             
	//   65  141:iconst_0        
	//   66  142:invokestatic    #165 <Method int[] generateDefault2BitClutEntries()>
	//   67  145:invokestatic    #168 <Method int[] generateDefault4BitClutEntries()>
	//   68  148:invokestatic    #171 <Method int[] generateDefault8BitClutEntries()>
	//   69  151:invokespecial   #174 <Method void DvbParser$ClutDefinition(int, int[], int[], int[])>
	//   70  154:putfield        #176 <Field DvbParser$ClutDefinition defaultClutDefinition>
		subtitleService = new SubtitleService(i, j);
	//   71  157:aload_0         
	//   72  158:new             #27  <Class DvbParser$SubtitleService>
	//   73  161:dup             
	//   74  162:iload_1         
	//   75  163:iload_2         
	//   76  164:invokespecial   #178 <Method void DvbParser$SubtitleService(int, int)>
	//   77  167:putfield        #180 <Field DvbParser$SubtitleService subtitleService>
	//   78  170:return          
	}

	private static byte[] buildClutMapTable(int i, int j, ParsableBitArray parsablebitarray)
	{
		byte abyte0[] = new byte[i];
	//    0    0:iload_0         
	//    1    1:newarray        byte[]
	//    2    3:astore          4
		for(int k = 0; k < i; k++)
	//*   3    5:iconst_0        
	//*   4    6:istore_3        
	//*   5    7:iload_3         
	//*   6    8:iload_0         
	//*   7    9:icmpge          29
			abyte0[k] = (byte)parsablebitarray.readBits(j);
	//    8   12:aload           4
	//    9   14:iload_3         
	//   10   15:aload_2         
	//   11   16:iload_1         
	//   12   17:invokevirtual   #188 <Method int ParsableBitArray.readBits(int)>
	//   13   20:int2byte        
	//   14   21:bastore         

	//   15   22:iload_3         
	//   16   23:iconst_1        
	//   17   24:iadd            
	//   18   25:istore_3        
	//*  19   26:goto            7
		return abyte0;
	//   20   29:aload           4
	//   21   31:areturn         
	}

	private static int[] generateDefault2BitClutEntries()
	{
		return (new int[] {
			0, -1, 0xff000000, 0xff7f7f7f
		});
	//    0    0:iconst_4        
	//    1    1:newarray        int[]
	//    2    3:dup             
	//    3    4:iconst_0        
	//    4    5:iconst_0        
	//    5    6:iastore         
	//    6    7:dup             
	//    7    8:iconst_1        
	//    8    9:iconst_m1       
	//    9   10:iastore         
	//   10   11:dup             
	//   11   12:iconst_2        
	//   12   13:ldc1            #189 <Int 0xff000000>
	//   13   15:iastore         
	//   14   16:dup             
	//   15   17:iconst_3        
	//   16   18:ldc1            #190 <Int 0xff7f7f7f>
	//   17   20:iastore         
	//   18   21:areturn         
	}

	private static int[] generateDefault4BitClutEntries()
	{
		int ai[] = new int[16];
	//    0    0:bipush          16
	//    1    2:newarray        int[]
	//    2    4:astore          4
		ai[0] = 0;
	//    3    6:aload           4
	//    4    8:iconst_0        
	//    5    9:iconst_0        
	//    6   10:iastore         
		for(int i = 1; i < ai.length; i++)
	//*   7   11:iconst_1        
	//*   8   12:istore_0        
	//*   9   13:iload_0         
	//*  10   14:aload           4
	//*  11   16:arraylength     
	//*  12   17:icmpge          149
		{
			if(i < 8)
	//*  13   20:iload_0         
	//*  14   21:bipush          8
	//*  15   23:icmpge          87
			{
				char c;
				if((i & 1) != 0)
	//*  16   26:iload_0         
	//*  17   27:iconst_1        
	//*  18   28:iand            
	//*  19   29:ifeq            39
					c = '\377';
	//   20   32:sipush          255
	//   21   35:istore_1        
				else
	//*  22   36:goto            41
					c = '\0';
	//   23   39:iconst_0        
	//   24   40:istore_1        
				char c1;
				if((i & 2) != 0)
	//*  25   41:iload_0         
	//*  26   42:iconst_2        
	//*  27   43:iand            
	//*  28   44:ifeq            54
					c1 = '\377';
	//   29   47:sipush          255
	//   30   50:istore_2        
				else
	//*  31   51:goto            56
					c1 = '\0';
	//   32   54:iconst_0        
	//   33   55:istore_2        
				char c2;
				if((i & 4) != 0)
	//*  34   56:iload_0         
	//*  35   57:iconst_4        
	//*  36   58:iand            
	//*  37   59:ifeq            69
					c2 = '\377';
	//   38   62:sipush          255
	//   39   65:istore_3        
				else
	//*  40   66:goto            71
					c2 = '\0';
	//   41   69:iconst_0        
	//   42   70:istore_3        
				ai[i] = getColor(255, ((int) (c)), ((int) (c1)), ((int) (c2)));
	//   43   71:aload           4
	//   44   73:iload_0         
	//   45   74:sipush          255
	//   46   77:iload_1         
	//   47   78:iload_2         
	//   48   79:iload_3         
	//   49   80:invokestatic    #194 <Method int getColor(int, int, int, int)>
	//   50   83:iastore         
				continue;
	//   51   84:goto            142
			}
			byte byte2 = 127;
	//   52   87:bipush          127
	//   53   89:istore_3        
			byte byte0;
			if((i & 1) != 0)
	//*  54   90:iload_0         
	//*  55   91:iconst_1        
	//*  56   92:iand            
	//*  57   93:ifeq            102
				byte0 = 127;
	//   58   96:bipush          127
	//   59   98:istore_1        
			else
	//*  60   99:goto            104
				byte0 = 0;
	//   61  102:iconst_0        
	//   62  103:istore_1        
			byte byte1;
			if((i & 2) != 0)
	//*  63  104:iload_0         
	//*  64  105:iconst_2        
	//*  65  106:iand            
	//*  66  107:ifeq            116
				byte1 = 127;
	//   67  110:bipush          127
	//   68  112:istore_2        
			else
	//*  69  113:goto            118
				byte1 = 0;
	//   70  116:iconst_0        
	//   71  117:istore_2        
			if((i & 4) == 0)
	//*  72  118:iload_0         
	//*  73  119:iconst_4        
	//*  74  120:iand            
	//*  75  121:ifeq            127
	//*  76  124:goto            129
				byte2 = 0;
	//   77  127:iconst_0        
	//   78  128:istore_3        
			ai[i] = getColor(255, ((int) (byte0)), ((int) (byte1)), ((int) (byte2)));
	//   79  129:aload           4
	//   80  131:iload_0         
	//   81  132:sipush          255
	//   82  135:iload_1         
	//   83  136:iload_2         
	//   84  137:iload_3         
	//   85  138:invokestatic    #194 <Method int getColor(int, int, int, int)>
	//   86  141:iastore         
		}

	//   87  142:iload_0         
	//   88  143:iconst_1        
	//   89  144:iadd            
	//   90  145:istore_0        
	//*  91  146:goto            13
		return ai;
	//   92  149:aload           4
	//   93  151:areturn         
	}

	private static int[] generateDefault8BitClutEntries()
	{
		int ai[] = new int[256];
	//    0    0:sipush          256
	//    1    3:newarray        int[]
	//    2    5:astore          7
		ai[0] = 0;
	//    3    7:aload           7
	//    4    9:iconst_0        
	//    5   10:iconst_0        
	//    6   11:iastore         
		for(int i = 0; i < ai.length; i++)
	//*   7   12:iconst_0        
	//*   8   13:istore_1        
	//*   9   14:iload_1         
	//*  10   15:aload           7
	//*  11   17:arraylength     
	//*  12   18:icmpge          594
		{
			int j = 255;
	//   13   21:sipush          255
	//   14   24:istore_3        
			if(i < 8)
	//*  15   25:iload_1         
	//*  16   26:bipush          8
	//*  17   28:icmpge          87
			{
				char c;
				if((i & 1) != 0)
	//*  18   31:iload_1         
	//*  19   32:iconst_1        
	//*  20   33:iand            
	//*  21   34:ifeq            44
					c = '\377';
	//   22   37:sipush          255
	//   23   40:istore_0        
				else
	//*  24   41:goto            46
					c = '\0';
	//   25   44:iconst_0        
	//   26   45:istore_0        
				char c1;
				if((i & 2) != 0)
	//*  27   46:iload_1         
	//*  28   47:iconst_2        
	//*  29   48:iand            
	//*  30   49:ifeq            59
					c1 = '\377';
	//   31   52:sipush          255
	//   32   55:istore_2        
				else
	//*  33   56:goto            61
					c1 = '\0';
	//   34   59:iconst_0        
	//   35   60:istore_2        
				if((i & 4) == 0)
	//*  36   61:iload_1         
	//*  37   62:iconst_4        
	//*  38   63:iand            
	//*  39   64:ifeq            70
	//*  40   67:goto            72
					j = 0;
	//   41   70:iconst_0        
	//   42   71:istore_3        
				ai[i] = getColor(63, ((int) (c)), ((int) (c1)), j);
	//   43   72:aload           7
	//   44   74:iload_1         
	//   45   75:bipush          63
	//   46   77:iload_0         
	//   47   78:iload_2         
	//   48   79:iload_3         
	//   49   80:invokestatic    #194 <Method int getColor(int, int, int, int)>
	//   50   83:iastore         
				continue;
	//   51   84:goto            587
			}
			j = i & 0x88;
	//   52   87:iload_1         
	//   53   88:sipush          136
	//   54   91:iand            
	//   55   92:istore_3        
			char c2 = '\252';
	//   56   93:sipush          170
	//   57   96:istore_2        
			byte byte0 = 85;
	//   58   97:bipush          85
	//   59   99:istore_0        
			if(j != 0)
	//*  60  100:iload_3         
	//*  61  101:ifeq            476
			{
				if(j != 8)
	//*  62  104:iload_3         
	//*  63  105:bipush          8
	//*  64  107:icmpeq          363
				{
					c2 = '+';
	//   65  110:bipush          43
	//   66  112:istore_2        
					if(j != 128)
	//*  67  113:iload_3         
	//*  68  114:sipush          128
	//*  69  117:icmpeq          242
					{
						if(j != 136)
	//*  70  120:iload_3         
	//*  71  121:sipush          136
	//*  72  124:icmpeq          130
							continue;
	//   73  127:goto            587
						if((i & 1) != 0)
	//*  74  130:iload_1         
	//*  75  131:iconst_1        
	//*  76  132:iand            
	//*  77  133:ifeq            142
							j = 43;
	//   78  136:bipush          43
	//   79  138:istore_3        
						else
	//*  80  139:goto            144
							j = 0;
	//   81  142:iconst_0        
	//   82  143:istore_3        
						byte byte1;
						if((i & 0x10) != 0)
	//*  83  144:iload_1         
	//*  84  145:bipush          16
	//*  85  147:iand            
	//*  86  148:ifeq            158
							byte1 = 85;
	//   87  151:bipush          85
	//   88  153:istore          4
						else
	//*  89  155:goto            161
							byte1 = 0;
	//   90  158:iconst_0        
	//   91  159:istore          4
						byte byte3;
						if((i & 2) != 0)
	//*  92  161:iload_1         
	//*  93  162:iconst_2        
	//*  94  163:iand            
	//*  95  164:ifeq            174
							byte3 = 43;
	//   96  167:bipush          43
	//   97  169:istore          5
						else
	//*  98  171:goto            177
							byte3 = 0;
	//   99  174:iconst_0        
	//  100  175:istore          5
						byte byte7;
						if((i & 0x20) != 0)
	//* 101  177:iload_1         
	//* 102  178:bipush          32
	//* 103  180:iand            
	//* 104  181:ifeq            191
							byte7 = 85;
	//  105  184:bipush          85
	//  106  186:istore          6
						else
	//* 107  188:goto            194
							byte7 = 0;
	//  108  191:iconst_0        
	//  109  192:istore          6
						if((i & 4) == 0)
	//* 110  194:iload_1         
	//* 111  195:iconst_4        
	//* 112  196:iand            
	//* 113  197:ifeq            203
	//* 114  200:goto            205
							c2 = '\0';
	//  115  203:iconst_0        
	//  116  204:istore_2        
						if((i & 0x40) == 0)
	//* 117  205:iload_1         
	//* 118  206:bipush          64
	//* 119  208:iand            
	//* 120  209:ifeq            215
	//* 121  212:goto            217
							byte0 = 0;
	//  122  215:iconst_0        
	//  123  216:istore_0        
						ai[i] = getColor(255, j + byte1, byte3 + byte7, c2 + byte0);
	//  124  217:aload           7
	//  125  219:iload_1         
	//  126  220:sipush          255
	//  127  223:iload_3         
	//  128  224:iload           4
	//  129  226:iadd            
	//  130  227:iload           5
	//  131  229:iload           6
	//  132  231:iadd            
	//  133  232:iload_2         
	//  134  233:iload_0         
	//  135  234:iadd            
	//  136  235:invokestatic    #194 <Method int getColor(int, int, int, int)>
	//  137  238:iastore         
						continue;
	//  138  239:goto            587
					}
					if((i & 1) != 0)
	//* 139  242:iload_1         
	//* 140  243:iconst_1        
	//* 141  244:iand            
	//* 142  245:ifeq            254
						j = 43;
	//  143  248:bipush          43
	//  144  250:istore_3        
					else
	//* 145  251:goto            256
						j = 0;
	//  146  254:iconst_0        
	//  147  255:istore_3        
					byte byte2;
					if((i & 0x10) != 0)
	//* 148  256:iload_1         
	//* 149  257:bipush          16
	//* 150  259:iand            
	//* 151  260:ifeq            270
						byte2 = 85;
	//  152  263:bipush          85
	//  153  265:istore          4
					else
	//* 154  267:goto            273
						byte2 = 0;
	//  155  270:iconst_0        
	//  156  271:istore          4
					byte byte4;
					if((i & 2) != 0)
	//* 157  273:iload_1         
	//* 158  274:iconst_2        
	//* 159  275:iand            
	//* 160  276:ifeq            286
						byte4 = 43;
	//  161  279:bipush          43
	//  162  281:istore          5
					else
	//* 163  283:goto            289
						byte4 = 0;
	//  164  286:iconst_0        
	//  165  287:istore          5
					byte byte8;
					if((i & 0x20) != 0)
	//* 166  289:iload_1         
	//* 167  290:bipush          32
	//* 168  292:iand            
	//* 169  293:ifeq            303
						byte8 = 85;
	//  170  296:bipush          85
	//  171  298:istore          6
					else
	//* 172  300:goto            306
						byte8 = 0;
	//  173  303:iconst_0        
	//  174  304:istore          6
					if((i & 4) == 0)
	//* 175  306:iload_1         
	//* 176  307:iconst_4        
	//* 177  308:iand            
	//* 178  309:ifeq            315
	//* 179  312:goto            317
						c2 = '\0';
	//  180  315:iconst_0        
	//  181  316:istore_2        
					if((i & 0x40) == 0)
	//* 182  317:iload_1         
	//* 183  318:bipush          64
	//* 184  320:iand            
	//* 185  321:ifeq            327
	//* 186  324:goto            329
						byte0 = 0;
	//  187  327:iconst_0        
	//  188  328:istore_0        
					ai[i] = getColor(255, j + 127 + byte2, byte4 + 127 + byte8, 127 + c2 + byte0);
	//  189  329:aload           7
	//  190  331:iload_1         
	//  191  332:sipush          255
	//  192  335:iload_3         
	//  193  336:bipush          127
	//  194  338:iadd            
	//  195  339:iload           4
	//  196  341:iadd            
	//  197  342:iload           5
	//  198  344:bipush          127
	//  199  346:iadd            
	//  200  347:iload           6
	//  201  349:iadd            
	//  202  350:bipush          127
	//  203  352:iload_2         
	//  204  353:iadd            
	//  205  354:iload_0         
	//  206  355:iadd            
	//  207  356:invokestatic    #194 <Method int getColor(int, int, int, int)>
	//  208  359:iastore         
					continue;
	//  209  360:goto            587
				}
				if((i & 1) != 0)
	//* 210  363:iload_1         
	//* 211  364:iconst_1        
	//* 212  365:iand            
	//* 213  366:ifeq            375
					j = 85;
	//  214  369:bipush          85
	//  215  371:istore_3        
				else
	//* 216  372:goto            377
					j = 0;
	//  217  375:iconst_0        
	//  218  376:istore_3        
				char c3;
				if((i & 0x10) != 0)
	//* 219  377:iload_1         
	//* 220  378:bipush          16
	//* 221  380:iand            
	//* 222  381:ifeq            392
					c3 = '\252';
	//  223  384:sipush          170
	//  224  387:istore          4
				else
	//* 225  389:goto            395
					c3 = '\0';
	//  226  392:iconst_0        
	//  227  393:istore          4
				byte byte5;
				if((i & 2) != 0)
	//* 228  395:iload_1         
	//* 229  396:iconst_2        
	//* 230  397:iand            
	//* 231  398:ifeq            408
					byte5 = 85;
	//  232  401:bipush          85
	//  233  403:istore          5
				else
	//* 234  405:goto            411
					byte5 = 0;
	//  235  408:iconst_0        
	//  236  409:istore          5
				char c5;
				if((i & 0x20) != 0)
	//* 237  411:iload_1         
	//* 238  412:bipush          32
	//* 239  414:iand            
	//* 240  415:ifeq            426
					c5 = '\252';
	//  241  418:sipush          170
	//  242  421:istore          6
				else
	//* 243  423:goto            429
					c5 = '\0';
	//  244  426:iconst_0        
	//  245  427:istore          6
				if((i & 4) == 0)
	//* 246  429:iload_1         
	//* 247  430:iconst_4        
	//* 248  431:iand            
	//* 249  432:ifeq            438
	//* 250  435:goto            440
					byte0 = 0;
	//  251  438:iconst_0        
	//  252  439:istore_0        
				if((i & 0x40) == 0)
	//* 253  440:iload_1         
	//* 254  441:bipush          64
	//* 255  443:iand            
	//* 256  444:ifeq            450
	//* 257  447:goto            452
					c2 = '\0';
	//  258  450:iconst_0        
	//  259  451:istore_2        
				ai[i] = getColor(127, j + c3, byte5 + c5, byte0 + c2);
	//  260  452:aload           7
	//  261  454:iload_1         
	//  262  455:bipush          127
	//  263  457:iload_3         
	//  264  458:iload           4
	//  265  460:iadd            
	//  266  461:iload           5
	//  267  463:iload           6
	//  268  465:iadd            
	//  269  466:iload_0         
	//  270  467:iload_2         
	//  271  468:iadd            
	//  272  469:invokestatic    #194 <Method int getColor(int, int, int, int)>
	//  273  472:iastore         
				continue;
	//  274  473:goto            587
			}
			if((i & 1) != 0)
	//* 275  476:iload_1         
	//* 276  477:iconst_1        
	//* 277  478:iand            
	//* 278  479:ifeq            488
				j = 85;
	//  279  482:bipush          85
	//  280  484:istore_3        
			else
	//* 281  485:goto            490
				j = 0;
	//  282  488:iconst_0        
	//  283  489:istore_3        
			char c4;
			if((i & 0x10) != 0)
	//* 284  490:iload_1         
	//* 285  491:bipush          16
	//* 286  493:iand            
	//* 287  494:ifeq            505
				c4 = '\252';
	//  288  497:sipush          170
	//  289  500:istore          4
			else
	//* 290  502:goto            508
				c4 = '\0';
	//  291  505:iconst_0        
	//  292  506:istore          4
			byte byte6;
			if((i & 2) != 0)
	//* 293  508:iload_1         
	//* 294  509:iconst_2        
	//* 295  510:iand            
	//* 296  511:ifeq            521
				byte6 = 85;
	//  297  514:bipush          85
	//  298  516:istore          5
			else
	//* 299  518:goto            524
				byte6 = 0;
	//  300  521:iconst_0        
	//  301  522:istore          5
			char c6;
			if((i & 0x20) != 0)
	//* 302  524:iload_1         
	//* 303  525:bipush          32
	//* 304  527:iand            
	//* 305  528:ifeq            539
				c6 = '\252';
	//  306  531:sipush          170
	//  307  534:istore          6
			else
	//* 308  536:goto            542
				c6 = '\0';
	//  309  539:iconst_0        
	//  310  540:istore          6
			if((i & 4) == 0)
	//* 311  542:iload_1         
	//* 312  543:iconst_4        
	//* 313  544:iand            
	//* 314  545:ifeq            551
	//* 315  548:goto            553
				byte0 = 0;
	//  316  551:iconst_0        
	//  317  552:istore_0        
			if((i & 0x40) == 0)
	//* 318  553:iload_1         
	//* 319  554:bipush          64
	//* 320  556:iand            
	//* 321  557:ifeq            563
	//* 322  560:goto            565
				c2 = '\0';
	//  323  563:iconst_0        
	//  324  564:istore_2        
			ai[i] = getColor(255, j + c4, byte6 + c6, byte0 + c2);
	//  325  565:aload           7
	//  326  567:iload_1         
	//  327  568:sipush          255
	//  328  571:iload_3         
	//  329  572:iload           4
	//  330  574:iadd            
	//  331  575:iload           5
	//  332  577:iload           6
	//  333  579:iadd            
	//  334  580:iload_0         
	//  335  581:iload_2         
	//  336  582:iadd            
	//  337  583:invokestatic    #194 <Method int getColor(int, int, int, int)>
	//  338  586:iastore         
		}

	//  339  587:iload_1         
	//  340  588:iconst_1        
	//  341  589:iadd            
	//  342  590:istore_1        
	//* 343  591:goto            14
		return ai;
	//  344  594:aload           7
	//  345  596:areturn         
	}

	private static int getColor(int i, int j, int k, int l)
	{
		return i << 24 | j << 16 | k << 8 | l;
	//    0    0:iload_0         
	//    1    1:bipush          24
	//    2    3:ishl            
	//    3    4:iload_1         
	//    4    5:bipush          16
	//    5    7:ishl            
	//    6    8:ior             
	//    7    9:iload_2         
	//    8   10:bipush          8
	//    9   12:ishl            
	//   10   13:ior             
	//   11   14:iload_3         
	//   12   15:ior             
	//   13   16:ireturn         
	}

	private static int paint2BitPixelCodeString(ParsableBitArray parsablebitarray, int ai[], byte abyte0[], int i, int j, Paint paint, Canvas canvas1)
	{
		int i1;
		boolean flag = false;
	//    0    0:iconst_0        
	//    1    1:istore          7
		i1 = i;
	//    2    3:iload_3         
	//    3    4:istore          9
		i = ((int) (flag));
	//    4    6:iload           7
	//    5    8:istore_3        
_L14:
		int k;
		int l;
		l = parsablebitarray.readBits(2);
	//    6    9:aload_0         
	//    7   10:iconst_2        
	//    8   11:invokevirtual   #188 <Method int ParsableBitArray.readBits(int)>
	//    9   14:istore          8
		if(l != 0)
	//*  10   16:iload           8
	//*  11   18:ifeq            33
		{
			k = i;
	//   12   21:iload_3         
	//   13   22:istore          7
			i = l;
	//   14   24:iload           8
	//   15   26:istore_3        
			l = 1;
	//   16   27:iconst_1        
	//   17   28:istore          8
			break MISSING_BLOCK_LABEL_188;
	//   18   30:goto            188
		}
		if(!parsablebitarray.readBit()) goto _L2; else goto _L1
	//   19   33:aload_0         
	//   20   34:invokevirtual   #200 <Method boolean ParsableBitArray.readBit()>
	//   21   37:ifeq            69
_L1:
		l = 3 + parsablebitarray.readBits(3);
	//   22   40:iconst_3        
	//   23   41:aload_0         
	//   24   42:iconst_3        
	//   25   43:invokevirtual   #188 <Method int ParsableBitArray.readBits(int)>
	//   26   46:iadd            
	//   27   47:istore          8
		k = parsablebitarray.readBits(2);
	//   28   49:aload_0         
	//   29   50:iconst_2        
	//   30   51:invokevirtual   #188 <Method int ParsableBitArray.readBits(int)>
	//   31   54:istore          7
_L10:
		int j1 = i;
	//   32   56:iload_3         
	//   33   57:istore          10
		i = k;
	//   34   59:iload           7
	//   35   61:istore_3        
		k = j1;
	//   36   62:iload           10
	//   37   64:istore          7
		break MISSING_BLOCK_LABEL_188;
	//   38   66:goto            188
_L2:
		if(!parsablebitarray.readBit()) goto _L4; else goto _L3
	//   39   69:aload_0         
	//   40   70:invokevirtual   #200 <Method boolean ParsableBitArray.readBit()>
	//   41   73:ifeq            87
_L3:
		l = 1;
	//   42   76:iconst_1        
	//   43   77:istore          8
_L11:
		k = i;
	//   44   79:iload_3         
	//   45   80:istore          7
		i = 0;
	//   46   82:iconst_0        
	//   47   83:istore_3        
		break MISSING_BLOCK_LABEL_188;
	//   48   84:goto            188
_L4:
		parsablebitarray.readBits(2);
	//   49   87:aload_0         
	//   50   88:iconst_2        
	//   51   89:invokevirtual   #188 <Method int ParsableBitArray.readBits(int)>
		JVM INSTR tableswitch 0 3: default 124
	//	               0 182
	//	               1 176
	//	               2 156
	//	               3 135;
	//   52   92:tableswitch     0 3: default 124
	//	               0 182
	//	               1 176
	//	               2 156
	//	               3 135
		   goto _L5 _L6 _L7 _L8 _L9
_L6:
		break MISSING_BLOCK_LABEL_182;
_L5:
		k = i;
	//   53  124:iload_3         
	//   54  125:istore          7
_L12:
		i = 0;
	//   55  127:iconst_0        
	//   56  128:istore_3        
		l = i;
	//   57  129:iload_3         
	//   58  130:istore          8
		break MISSING_BLOCK_LABEL_188;
	//   59  132:goto            188
_L9:
		l = 29 + parsablebitarray.readBits(8);
	//   60  135:bipush          29
	//   61  137:aload_0         
	//   62  138:bipush          8
	//   63  140:invokevirtual   #188 <Method int ParsableBitArray.readBits(int)>
	//   64  143:iadd            
	//   65  144:istore          8
		k = parsablebitarray.readBits(2);
	//   66  146:aload_0         
	//   67  147:iconst_2        
	//   68  148:invokevirtual   #188 <Method int ParsableBitArray.readBits(int)>
	//   69  151:istore          7
		  goto _L10
	//*  70  153:goto            56
_L8:
		l = 12 + parsablebitarray.readBits(4);
	//   71  156:bipush          12
	//   72  158:aload_0         
	//   73  159:iconst_4        
	//   74  160:invokevirtual   #188 <Method int ParsableBitArray.readBits(int)>
	//   75  163:iadd            
	//   76  164:istore          8
		k = parsablebitarray.readBits(2);
	//   77  166:aload_0         
	//   78  167:iconst_2        
	//   79  168:invokevirtual   #188 <Method int ParsableBitArray.readBits(int)>
	//   80  171:istore          7
		  goto _L10
	//*  81  173:goto            56
_L7:
		l = 2;
	//   82  176:iconst_2        
	//   83  177:istore          8
		  goto _L11
	//*  84  179:goto            79
		k = 1;
	//   85  182:iconst_1        
	//   86  183:istore          7
		  goto _L12
	//*  87  185:goto            127
		if(l != 0 && paint != null)
	//*  88  188:iload           8
	//*  89  190:ifeq            243
	//*  90  193:aload           5
	//*  91  195:ifnull          243
		{
			int k1 = i;
	//   92  198:iload_3         
	//   93  199:istore          10
			if(abyte0 != null)
	//*  94  201:aload_2         
	//*  95  202:ifnull          210
				k1 = ((int) (abyte0[i]));
	//   96  205:aload_2         
	//   97  206:iload_3         
	//   98  207:baload          
	//   99  208:istore          10
			paint.setColor(ai[k1]);
	//  100  210:aload           5
	//  101  212:aload_1         
	//  102  213:iload           10
	//  103  215:iaload          
	//  104  216:invokevirtual   #204 <Method void Paint.setColor(int)>
			canvas1.drawRect(i1, j, i1 + l, j + 1, paint);
	//  105  219:aload           6
	//  106  221:iload           9
	//  107  223:i2f             
	//  108  224:iload           4
	//  109  226:i2f             
	//  110  227:iload           9
	//  111  229:iload           8
	//  112  231:iadd            
	//  113  232:i2f             
	//  114  233:iload           4
	//  115  235:iconst_1        
	//  116  236:iadd            
	//  117  237:i2f             
	//  118  238:aload           5
	//  119  240:invokevirtual   #208 <Method void Canvas.drawRect(float, float, float, float, Paint)>
		}
		i1 += l;
	//  120  243:iload           9
	//  121  245:iload           8
	//  122  247:iadd            
	//  123  248:istore          9
		if(k != 0)
	//* 124  250:iload           7
	//* 125  252:ifeq            258
			return i1;
	//  126  255:iload           9
	//  127  257:ireturn         
		i = k;
	//  128  258:iload           7
	//  129  260:istore_3        
		if(true) goto _L14; else goto _L13
	//  130  261:goto            9
_L13:
	}

	private static int paint4BitPixelCodeString(ParsableBitArray parsablebitarray, int ai[], byte abyte0[], int i, int j, Paint paint, Canvas canvas1)
	{
		int i1;
		boolean flag = false;
	//    0    0:iconst_0        
	//    1    1:istore          7
		i1 = i;
	//    2    3:iload_3         
	//    3    4:istore          9
		i = ((int) (flag));
	//    4    6:iload           7
	//    5    8:istore_3        
_L19:
		int l = parsablebitarray.readBits(4);
	//    6    9:aload_0         
	//    7   10:iconst_4        
	//    8   11:invokevirtual   #188 <Method int ParsableBitArray.readBits(int)>
	//    9   14:istore          8
		if(l == 0) goto _L2; else goto _L1
	//   10   16:iload           8
	//   11   18:ifeq            33
_L1:
		int k;
		k = i;
	//   12   21:iload_3         
	//   13   22:istore          7
		i = l;
	//   14   24:iload           8
	//   15   26:istore_3        
		l = 1;
	//   16   27:iconst_1        
	//   17   28:istore          8
		  goto _L3
	//*  18   30:goto            207
_L2:
		if(parsablebitarray.readBit()) goto _L5; else goto _L4
	//   19   33:aload_0         
	//   20   34:invokevirtual   #200 <Method boolean ParsableBitArray.readBit()>
	//   21   37:ifne            77
_L4:
		k = parsablebitarray.readBits(3);
	//   22   40:aload_0         
	//   23   41:iconst_3        
	//   24   42:invokevirtual   #188 <Method int ParsableBitArray.readBits(int)>
	//   25   45:istore          7
		if(k == 0) goto _L7; else goto _L6
	//   26   47:iload           7
	//   27   49:ifeq            66
_L6:
		l = k + 2;
	//   28   52:iload           7
	//   29   54:iconst_2        
	//   30   55:iadd            
	//   31   56:istore          8
_L17:
		k = i;
	//   32   58:iload_3         
	//   33   59:istore          7
		i = 0;
	//   34   61:iconst_0        
	//   35   62:istore_3        
		break; /* Loop/switch isn't completed */
	//   36   63:goto            207
_L7:
		k = 1;
	//   37   66:iconst_1        
	//   38   67:istore          7
_L15:
		i = 0;
	//   39   69:iconst_0        
	//   40   70:istore_3        
		l = i;
	//   41   71:iload_3         
	//   42   72:istore          8
		break; /* Loop/switch isn't completed */
	//   43   74:goto            207
_L5:
		if(parsablebitarray.readBit()) goto _L9; else goto _L8
	//   44   77:aload_0         
	//   45   78:invokevirtual   #200 <Method boolean ParsableBitArray.readBit()>
	//   46   81:ifne            113
_L8:
		l = parsablebitarray.readBits(2) + 4;
	//   47   84:aload_0         
	//   48   85:iconst_2        
	//   49   86:invokevirtual   #188 <Method int ParsableBitArray.readBits(int)>
	//   50   89:iconst_4        
	//   51   90:iadd            
	//   52   91:istore          8
		k = parsablebitarray.readBits(4);
	//   53   93:aload_0         
	//   54   94:iconst_4        
	//   55   95:invokevirtual   #188 <Method int ParsableBitArray.readBits(int)>
	//   56   98:istore          7
_L16:
		int j1 = i;
	//   57  100:iload_3         
	//   58  101:istore          10
		i = k;
	//   59  103:iload           7
	//   60  105:istore_3        
		k = j1;
	//   61  106:iload           10
	//   62  108:istore          7
		break; /* Loop/switch isn't completed */
	//   63  110:goto            207
_L9:
		parsablebitarray.readBits(2);
	//   64  113:aload_0         
	//   65  114:iconst_2        
	//   66  115:invokevirtual   #188 <Method int ParsableBitArray.readBits(int)>
		JVM INSTR tableswitch 0 3: default 148
	//	               0 201
	//	               1 195
	//	               2 175
	//	               3 154;
	//   67  118:tableswitch     0 3: default 148
	//	               0 201
	//	               1 195
	//	               2 175
	//	               3 154
		   goto _L10 _L11 _L12 _L13 _L14
_L10:
		k = i;
	//   68  148:iload_3         
	//   69  149:istore          7
		  goto _L15
	//*  70  151:goto            69
_L14:
		l = 25 + parsablebitarray.readBits(8);
	//   71  154:bipush          25
	//   72  156:aload_0         
	//   73  157:bipush          8
	//   74  159:invokevirtual   #188 <Method int ParsableBitArray.readBits(int)>
	//   75  162:iadd            
	//   76  163:istore          8
		k = parsablebitarray.readBits(4);
	//   77  165:aload_0         
	//   78  166:iconst_4        
	//   79  167:invokevirtual   #188 <Method int ParsableBitArray.readBits(int)>
	//   80  170:istore          7
		  goto _L16
	//*  81  172:goto            100
_L13:
		l = 9 + parsablebitarray.readBits(4);
	//   82  175:bipush          9
	//   83  177:aload_0         
	//   84  178:iconst_4        
	//   85  179:invokevirtual   #188 <Method int ParsableBitArray.readBits(int)>
	//   86  182:iadd            
	//   87  183:istore          8
		k = parsablebitarray.readBits(4);
	//   88  185:aload_0         
	//   89  186:iconst_4        
	//   90  187:invokevirtual   #188 <Method int ParsableBitArray.readBits(int)>
	//   91  190:istore          7
		  goto _L16
	//*  92  192:goto            100
_L12:
		l = 2;
	//   93  195:iconst_2        
	//   94  196:istore          8
		continue; /* Loop/switch isn't completed */
	//   95  198:goto            58
_L11:
		l = 1;
	//   96  201:iconst_1        
	//   97  202:istore          8
		if(true) goto _L17; else goto _L3
	//   98  204:goto            58
_L3:
		if(l != 0 && paint != null)
	//*  99  207:iload           8
	//* 100  209:ifeq            262
	//* 101  212:aload           5
	//* 102  214:ifnull          262
		{
			int k1 = i;
	//  103  217:iload_3         
	//  104  218:istore          10
			if(abyte0 != null)
	//* 105  220:aload_2         
	//* 106  221:ifnull          229
				k1 = ((int) (abyte0[i]));
	//  107  224:aload_2         
	//  108  225:iload_3         
	//  109  226:baload          
	//  110  227:istore          10
			paint.setColor(ai[k1]);
	//  111  229:aload           5
	//  112  231:aload_1         
	//  113  232:iload           10
	//  114  234:iaload          
	//  115  235:invokevirtual   #204 <Method void Paint.setColor(int)>
			canvas1.drawRect(i1, j, i1 + l, j + 1, paint);
	//  116  238:aload           6
	//  117  240:iload           9
	//  118  242:i2f             
	//  119  243:iload           4
	//  120  245:i2f             
	//  121  246:iload           9
	//  122  248:iload           8
	//  123  250:iadd            
	//  124  251:i2f             
	//  125  252:iload           4
	//  126  254:iconst_1        
	//  127  255:iadd            
	//  128  256:i2f             
	//  129  257:aload           5
	//  130  259:invokevirtual   #208 <Method void Canvas.drawRect(float, float, float, float, Paint)>
		}
		i1 += l;
	//  131  262:iload           9
	//  132  264:iload           8
	//  133  266:iadd            
	//  134  267:istore          9
		if(k != 0)
	//* 135  269:iload           7
	//* 136  271:ifeq            277
			return i1;
	//  137  274:iload           9
	//  138  276:ireturn         
		i = k;
	//  139  277:iload           7
	//  140  279:istore_3        
		if(true) goto _L19; else goto _L18
	//  141  280:goto            9
_L18:
	}

	private static int paint8BitPixelCodeString(ParsableBitArray parsablebitarray, int ai[], byte abyte0[], int i, int j, Paint paint, Canvas canvas1)
	{
		boolean flag = false;
	//    0    0:iconst_0        
	//    1    1:istore          7
		int i1 = i;
	//    2    3:iload_3         
	//    3    4:istore          9
		i = ((int) (flag));
	//    4    6:iload           7
	//    5    8:istore_3        
		do
		{
			int l = parsablebitarray.readBits(8);
	//    6    9:aload_0         
	//    7   10:bipush          8
	//    8   12:invokevirtual   #188 <Method int ParsableBitArray.readBits(int)>
	//    9   15:istore          8
			int k;
			if(l != 0)
	//*  10   17:iload           8
	//*  11   19:ifeq            34
			{
				k = i;
	//   12   22:iload_3         
	//   13   23:istore          7
				i = l;
	//   14   25:iload           8
	//   15   27:istore_3        
				l = 1;
	//   16   28:iconst_1        
	//   17   29:istore          8
			} else
	//*  18   31:goto            95
			if(!parsablebitarray.readBit())
	//*  19   34:aload_0         
	//*  20   35:invokevirtual   #200 <Method boolean ParsableBitArray.readBit()>
	//*  21   38:ifne            73
			{
				l = parsablebitarray.readBits(7);
	//   22   41:aload_0         
	//   23   42:bipush          7
	//   24   44:invokevirtual   #188 <Method int ParsableBitArray.readBits(int)>
	//   25   47:istore          8
				if(l != 0)
	//*  26   49:iload           8
	//*  27   51:ifeq            62
				{
					k = i;
	//   28   54:iload_3         
	//   29   55:istore          7
					i = 0;
	//   30   57:iconst_0        
	//   31   58:istore_3        
				} else
	//*  32   59:goto            95
				{
					k = 1;
	//   33   62:iconst_1        
	//   34   63:istore          7
					i = 0;
	//   35   65:iconst_0        
	//   36   66:istore_3        
					l = i;
	//   37   67:iload_3         
	//   38   68:istore          8
				}
			} else
	//*  39   70:goto            95
			{
				l = parsablebitarray.readBits(7);
	//   40   73:aload_0         
	//   41   74:bipush          7
	//   42   76:invokevirtual   #188 <Method int ParsableBitArray.readBits(int)>
	//   43   79:istore          8
				int j1 = parsablebitarray.readBits(8);
	//   44   81:aload_0         
	//   45   82:bipush          8
	//   46   84:invokevirtual   #188 <Method int ParsableBitArray.readBits(int)>
	//   47   87:istore          10
				k = i;
	//   48   89:iload_3         
	//   49   90:istore          7
				i = j1;
	//   50   92:iload           10
	//   51   94:istore_3        
			}
			if(l != 0 && paint != null)
	//*  52   95:iload           8
	//*  53   97:ifeq            150
	//*  54  100:aload           5
	//*  55  102:ifnull          150
			{
				int k1 = i;
	//   56  105:iload_3         
	//   57  106:istore          10
				if(abyte0 != null)
	//*  58  108:aload_2         
	//*  59  109:ifnull          117
					k1 = ((int) (abyte0[i]));
	//   60  112:aload_2         
	//   61  113:iload_3         
	//   62  114:baload          
	//   63  115:istore          10
				paint.setColor(ai[k1]);
	//   64  117:aload           5
	//   65  119:aload_1         
	//   66  120:iload           10
	//   67  122:iaload          
	//   68  123:invokevirtual   #204 <Method void Paint.setColor(int)>
				canvas1.drawRect(i1, j, i1 + l, j + 1, paint);
	//   69  126:aload           6
	//   70  128:iload           9
	//   71  130:i2f             
	//   72  131:iload           4
	//   73  133:i2f             
	//   74  134:iload           9
	//   75  136:iload           8
	//   76  138:iadd            
	//   77  139:i2f             
	//   78  140:iload           4
	//   79  142:iconst_1        
	//   80  143:iadd            
	//   81  144:i2f             
	//   82  145:aload           5
	//   83  147:invokevirtual   #208 <Method void Canvas.drawRect(float, float, float, float, Paint)>
			}
			i1 += l;
	//   84  150:iload           9
	//   85  152:iload           8
	//   86  154:iadd            
	//   87  155:istore          9
			if(k != 0)
	//*  88  157:iload           7
	//*  89  159:ifeq            165
				return i1;
	//   90  162:iload           9
	//   91  164:ireturn         
			i = k;
	//   92  165:iload           7
	//   93  167:istore_3        
		} while(true);
	//   94  168:goto            9
	}

	private static void paintPixelDataSubBlock(byte abyte0[], int ai[], int i, int j, int k, Paint paint, Canvas canvas1)
	{
		int l;
		byte abyte1[];
		byte abyte2[];
		ParsableBitArray parsablebitarray;
		parsablebitarray = new ParsableBitArray(abyte0);
	//    0    0:new             #184 <Class ParsableBitArray>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokespecial   #215 <Method void ParsableBitArray(byte[])>
	//    4    8:astore          11
		int i1 = j;
	//    5   10:iload_3         
	//    6   11:istore          8
		abyte2 = null;
	//    7   13:aconst_null     
	//    8   14:astore          10
		abyte1 = abyte2;
	//    9   16:aload           10
	//   10   18:astore          9
		l = k;
	//   11   20:iload           4
	//   12   22:istore          7
		k = i1;
	//   13   24:iload           8
	//   14   26:istore          4
_L12:
		int j1;
		if(parsablebitarray.bitsLeft() == 0)
			break; /* Loop/switch isn't completed */
	//   15   28:aload           11
	//   16   30:invokevirtual   #219 <Method int ParsableBitArray.bitsLeft()>
	//   17   33:ifeq            295
		j1 = parsablebitarray.readBits(8);
	//   18   36:aload           11
	//   19   38:bipush          8
	//   20   40:invokevirtual   #188 <Method int ParsableBitArray.readBits(int)>
	//   21   43:istore          8
		if(j1 == 240) goto _L2; else goto _L1
	//   22   45:iload           8
	//   23   47:sipush          240
	//   24   50:icmpeq          283
_L1:
		j1;
	//   25   53:iload           8
		JVM INSTR tableswitch 16 18: default 80
	//	               16 210
	//	               17 171
	//	               18 151;
	//   26   55:tableswitch     16 18: default 80
	//	               16 210
	//	               17 171
	//	               18 151
		   goto _L3 _L4 _L5 _L6
_L3:
		j1;
	//   27   80:iload           8
		JVM INSTR tableswitch 32 34: default 108
	//	               32 139
	//	               33 124
	//	               34 111;
	//   28   82:tableswitch     32 34: default 108
	//	               32 139
	//	               33 124
	//	               34 111
		   goto _L7 _L8 _L9 _L10
_L7:
		continue; /* Loop/switch isn't completed */
	//   29  108:goto            28
_L10:
		abyte0 = buildClutMapTable(16, 8, parsablebitarray);
	//   30  111:bipush          16
	//   31  113:bipush          8
	//   32  115:aload           11
	//   33  117:invokestatic    #221 <Method byte[] buildClutMapTable(int, int, ParsableBitArray)>
	//   34  120:astore_0        
		break; /* Loop/switch isn't completed */
	//   35  121:goto            133
_L9:
		abyte0 = buildClutMapTable(4, 8, parsablebitarray);
	//   36  124:iconst_4        
	//   37  125:bipush          8
	//   38  127:aload           11
	//   39  129:invokestatic    #221 <Method byte[] buildClutMapTable(int, int, ParsableBitArray)>
	//   40  132:astore_0        
		abyte2 = abyte0;
	//   41  133:aload_0         
	//   42  134:astore          10
		continue; /* Loop/switch isn't completed */
	//   43  136:goto            28
_L8:
		abyte1 = buildClutMapTable(4, 4, parsablebitarray);
	//   44  139:iconst_4        
	//   45  140:iconst_4        
	//   46  141:aload           11
	//   47  143:invokestatic    #221 <Method byte[] buildClutMapTable(int, int, ParsableBitArray)>
	//   48  146:astore          9
		continue; /* Loop/switch isn't completed */
	//   49  148:goto            28
_L6:
		k = paint8BitPixelCodeString(parsablebitarray, ai, ((byte []) (null)), k, l, paint, canvas1);
	//   50  151:aload           11
	//   51  153:aload_1         
	//   52  154:aconst_null     
	//   53  155:iload           4
	//   54  157:iload           7
	//   55  159:aload           5
	//   56  161:aload           6
	//   57  163:invokestatic    #223 <Method int paint8BitPixelCodeString(ParsableBitArray, int[], byte[], int, int, Paint, Canvas)>
	//   58  166:istore          4
		continue; /* Loop/switch isn't completed */
	//   59  168:goto            28
_L5:
		if(i == 3)
	//*  60  171:iload_2         
	//*  61  172:iconst_3        
	//*  62  173:icmpne          183
			abyte0 = defaultMap4To8;
	//   63  176:getstatic       #104 <Field byte[] defaultMap4To8>
	//   64  179:astore_0        
		else
	//*  65  180:goto            185
			abyte0 = null;
	//   66  183:aconst_null     
	//   67  184:astore_0        
		k = paint4BitPixelCodeString(parsablebitarray, ai, abyte0, k, l, paint, canvas1);
	//   68  185:aload           11
	//   69  187:aload_1         
	//   70  188:aload_0         
	//   71  189:iload           4
	//   72  191:iload           7
	//   73  193:aload           5
	//   74  195:aload           6
	//   75  197:invokestatic    #225 <Method int paint4BitPixelCodeString(ParsableBitArray, int[], byte[], int, int, Paint, Canvas)>
	//   76  200:istore          4
		parsablebitarray.byteAlign();
	//   77  202:aload           11
	//   78  204:invokevirtual   #228 <Method void ParsableBitArray.byteAlign()>
		continue; /* Loop/switch isn't completed */
	//   79  207:goto            168
_L4:
		if(i == 3)
	//*  80  210:iload_2         
	//*  81  211:iconst_3        
	//*  82  212:icmpne          233
		{
			if(abyte2 == null)
	//*  83  215:aload           10
	//*  84  217:ifnonnull       227
				abyte0 = defaultMap2To8;
	//   85  220:getstatic       #92  <Field byte[] defaultMap2To8>
	//   86  223:astore_0        
			else
	//*  87  224:goto            230
				abyte0 = abyte2;
	//   88  227:aload           10
	//   89  229:astore_0        
		} else
	//*  90  230:goto            258
		if(i == 2)
	//*  91  233:iload_2         
	//*  92  234:iconst_2        
	//*  93  235:icmpne          256
		{
			if(abyte1 == null)
	//*  94  238:aload           9
	//*  95  240:ifnonnull       250
				abyte0 = defaultMap2To4;
	//   96  243:getstatic       #87  <Field byte[] defaultMap2To4>
	//   97  246:astore_0        
			else
	//*  98  247:goto            230
				abyte0 = abyte1;
	//   99  250:aload           9
	//  100  252:astore_0        
		} else
	//* 101  253:goto            230
		{
			abyte0 = null;
	//  102  256:aconst_null     
	//  103  257:astore_0        
		}
		k = paint2BitPixelCodeString(parsablebitarray, ai, abyte0, k, l, paint, canvas1);
	//  104  258:aload           11
	//  105  260:aload_1         
	//  106  261:aload_0         
	//  107  262:iload           4
	//  108  264:iload           7
	//  109  266:aload           5
	//  110  268:aload           6
	//  111  270:invokestatic    #230 <Method int paint2BitPixelCodeString(ParsableBitArray, int[], byte[], int, int, Paint, Canvas)>
	//  112  273:istore          4
		parsablebitarray.byteAlign();
	//  113  275:aload           11
	//  114  277:invokevirtual   #228 <Method void ParsableBitArray.byteAlign()>
		continue; /* Loop/switch isn't completed */
	//  115  280:goto            168
_L2:
		l += 2;
	//  116  283:iload           7
	//  117  285:iconst_2        
	//  118  286:iadd            
	//  119  287:istore          7
		k = j;
	//  120  289:iload_3         
	//  121  290:istore          4
		if(true) goto _L12; else goto _L11
	//  122  292:goto            28
_L11:
	//  123  295:return          
	}

	private static void paintPixelDataSubBlocks(ObjectData objectdata, ClutDefinition clutdefinition, int i, int j, int k, Paint paint, Canvas canvas1)
	{
		if(i == 3)
	//*   0    0:iload_2         
	//*   1    1:iconst_3        
	//*   2    2:icmpne          13
			clutdefinition = ((ClutDefinition) (clutdefinition.clutEntries8Bit));
	//    3    5:aload_1         
	//    4    6:getfield        #236 <Field int[] DvbParser$ClutDefinition.clutEntries8Bit>
	//    5    9:astore_1        
		else
	//*   6   10:goto            31
		if(i == 2)
	//*   7   13:iload_2         
	//*   8   14:iconst_2        
	//*   9   15:icmpne          26
			clutdefinition = ((ClutDefinition) (clutdefinition.clutEntries4Bit));
	//   10   18:aload_1         
	//   11   19:getfield        #239 <Field int[] DvbParser$ClutDefinition.clutEntries4Bit>
	//   12   22:astore_1        
		else
	//*  13   23:goto            31
			clutdefinition = ((ClutDefinition) (clutdefinition.clutEntries2Bit));
	//   14   26:aload_1         
	//   15   27:getfield        #242 <Field int[] DvbParser$ClutDefinition.clutEntries2Bit>
	//   16   30:astore_1        
		paintPixelDataSubBlock(objectdata.topFieldData, ((int []) (clutdefinition)), i, j, k, paint, canvas1);
	//   17   31:aload_0         
	//   18   32:getfield        #245 <Field byte[] DvbParser$ObjectData.topFieldData>
	//   19   35:aload_1         
	//   20   36:iload_2         
	//   21   37:iload_3         
	//   22   38:iload           4
	//   23   40:aload           5
	//   24   42:aload           6
	//   25   44:invokestatic    #247 <Method void paintPixelDataSubBlock(byte[], int[], int, int, int, Paint, Canvas)>
		paintPixelDataSubBlock(objectdata.bottomFieldData, ((int []) (clutdefinition)), i, j, k + 1, paint, canvas1);
	//   26   47:aload_0         
	//   27   48:getfield        #250 <Field byte[] DvbParser$ObjectData.bottomFieldData>
	//   28   51:aload_1         
	//   29   52:iload_2         
	//   30   53:iload_3         
	//   31   54:iload           4
	//   32   56:iconst_1        
	//   33   57:iadd            
	//   34   58:aload           5
	//   35   60:aload           6
	//   36   62:invokestatic    #247 <Method void paintPixelDataSubBlock(byte[], int[], int, int, int, Paint, Canvas)>
	//   37   65:return          
	}

	private static ClutDefinition parseClutDefinition(ParsableBitArray parsablebitarray, int i)
	{
		int i1 = parsablebitarray.readBits(8);
	//    0    0:aload_0         
	//    1    1:bipush          8
	//    2    3:invokevirtual   #188 <Method int ParsableBitArray.readBits(int)>
	//    3    6:istore          11
		parsablebitarray.skipBits(8);
	//    4    8:aload_0         
	//    5    9:bipush          8
	//    6   11:invokevirtual   #255 <Method void ParsableBitArray.skipBits(int)>
		i -= 2;
	//    7   14:iload_1         
	//    8   15:iconst_2        
	//    9   16:isub            
	//   10   17:istore_1        
		int ai1[] = generateDefault2BitClutEntries();
	//   11   18:invokestatic    #165 <Method int[] generateDefault2BitClutEntries()>
	//   12   21:astore          15
		int ai2[] = generateDefault4BitClutEntries();
	//   13   23:invokestatic    #168 <Method int[] generateDefault4BitClutEntries()>
	//   14   26:astore          16
		int ai3[] = generateDefault8BitClutEntries();
	//   15   28:invokestatic    #171 <Method int[] generateDefault8BitClutEntries()>
	//   16   31:astore          17
		while(i > 0) 
	//*  17   33:iload_1         
	//*  18   34:ifle            323
		{
			int k1 = parsablebitarray.readBits(8);
	//   19   37:aload_0         
	//   20   38:bipush          8
	//   21   40:invokevirtual   #188 <Method int ParsableBitArray.readBits(int)>
	//   22   43:istore          13
			int j = parsablebitarray.readBits(8);
	//   23   45:aload_0         
	//   24   46:bipush          8
	//   25   48:invokevirtual   #188 <Method int ParsableBitArray.readBits(int)>
	//   26   51:istore          8
			i -= 2;
	//   27   53:iload_1         
	//   28   54:iconst_2        
	//   29   55:isub            
	//   30   56:istore_1        
			int ai[];
			if((j & 0x80) != 0)
	//*  31   57:iload           8
	//*  32   59:sipush          128
	//*  33   62:iand            
	//*  34   63:ifeq            73
				ai = ai1;
	//   35   66:aload           15
	//   36   68:astore          14
			else
	//*  37   70:goto            92
			if((j & 0x40) != 0)
	//*  38   73:iload           8
	//*  39   75:bipush          64
	//*  40   77:iand            
	//*  41   78:ifeq            88
				ai = ai2;
	//   42   81:aload           16
	//   43   83:astore          14
			else
	//*  44   85:goto            92
				ai = ai3;
	//   45   88:aload           17
	//   46   90:astore          14
			int k;
			int l;
			int j1;
			if((j & 1) != 0)
	//*  47   92:iload           8
	//*  48   94:iconst_1        
	//*  49   95:iand            
	//*  50   96:ifeq            138
			{
				j1 = parsablebitarray.readBits(8);
	//   51   99:aload_0         
	//   52  100:bipush          8
	//   53  102:invokevirtual   #188 <Method int ParsableBitArray.readBits(int)>
	//   54  105:istore          12
				l = parsablebitarray.readBits(8);
	//   55  107:aload_0         
	//   56  108:bipush          8
	//   57  110:invokevirtual   #188 <Method int ParsableBitArray.readBits(int)>
	//   58  113:istore          10
				k = parsablebitarray.readBits(8);
	//   59  115:aload_0         
	//   60  116:bipush          8
	//   61  118:invokevirtual   #188 <Method int ParsableBitArray.readBits(int)>
	//   62  121:istore          9
				j = parsablebitarray.readBits(8);
	//   63  123:aload_0         
	//   64  124:bipush          8
	//   65  126:invokevirtual   #188 <Method int ParsableBitArray.readBits(int)>
	//   66  129:istore          8
				i -= 4;
	//   67  131:iload_1         
	//   68  132:iconst_4        
	//   69  133:isub            
	//   70  134:istore_1        
			} else
	//*  71  135:goto            192
			{
				j1 = parsablebitarray.readBits(6);
	//   72  138:aload_0         
	//   73  139:bipush          6
	//   74  141:invokevirtual   #188 <Method int ParsableBitArray.readBits(int)>
	//   75  144:istore          12
				l = parsablebitarray.readBits(4);
	//   76  146:aload_0         
	//   77  147:iconst_4        
	//   78  148:invokevirtual   #188 <Method int ParsableBitArray.readBits(int)>
	//   79  151:istore          10
				k = parsablebitarray.readBits(4) << 4;
	//   80  153:aload_0         
	//   81  154:iconst_4        
	//   82  155:invokevirtual   #188 <Method int ParsableBitArray.readBits(int)>
	//   83  158:iconst_4        
	//   84  159:ishl            
	//   85  160:istore          9
				j = parsablebitarray.readBits(2);
	//   86  162:aload_0         
	//   87  163:iconst_2        
	//   88  164:invokevirtual   #188 <Method int ParsableBitArray.readBits(int)>
	//   89  167:istore          8
				i -= 2;
	//   90  169:iload_1         
	//   91  170:iconst_2        
	//   92  171:isub            
	//   93  172:istore_1        
				j <<= 6;
	//   94  173:iload           8
	//   95  175:bipush          6
	//   96  177:ishl            
	//   97  178:istore          8
				j1 <<= 2;
	//   98  180:iload           12
	//   99  182:iconst_2        
	//  100  183:ishl            
	//  101  184:istore          12
				l <<= 4;
	//  102  186:iload           10
	//  103  188:iconst_4        
	//  104  189:ishl            
	//  105  190:istore          10
			}
			if(j1 == 0)
	//* 106  192:iload           12
	//* 107  194:ifne            208
			{
				j = 255;
	//  108  197:sipush          255
	//  109  200:istore          8
				l = 0;
	//  110  202:iconst_0        
	//  111  203:istore          10
				k = 0;
	//  112  205:iconst_0        
	//  113  206:istore          9
			}
			j = ((int) ((byte)(255 - (j & 0xff))));
	//  114  208:sipush          255
	//  115  211:iload           8
	//  116  213:sipush          255
	//  117  216:iand            
	//  118  217:isub            
	//  119  218:int2byte        
	//  120  219:istore          8
			double d = j1;
	//  121  221:iload           12
	//  122  223:i2d             
	//  123  224:dstore_2        
			double d1 = l - 128;
	//  124  225:iload           10
	//  125  227:sipush          128
	//  126  230:isub            
	//  127  231:i2d             
	//  128  232:dstore          4
			l = (int)(d + 1.4019999999999999D * d1);
	//  129  234:dload_2         
	//  130  235:ldc2w           #256 <Double 1.4019999999999999D>
	//  131  238:dload           4
	//  132  240:dmul            
	//  133  241:dadd            
	//  134  242:d2i             
	//  135  243:istore          10
			double d2 = k - 128;
	//  136  245:iload           9
	//  137  247:sipush          128
	//  138  250:isub            
	//  139  251:i2d             
	//  140  252:dstore          6
			k = (int)(d - 0.34414D * d2 - 0.71414D * d1);
	//  141  254:dload_2         
	//  142  255:ldc2w           #258 <Double 0.34414D>
	//  143  258:dload           6
	//  144  260:dmul            
	//  145  261:dsub            
	//  146  262:ldc2w           #260 <Double 0.71414D>
	//  147  265:dload           4
	//  148  267:dmul            
	//  149  268:dsub            
	//  150  269:d2i             
	//  151  270:istore          9
			j1 = (int)(d + 1.772D * d2);
	//  152  272:dload_2         
	//  153  273:ldc2w           #262 <Double 1.772D>
	//  154  276:dload           6
	//  155  278:dmul            
	//  156  279:dadd            
	//  157  280:d2i             
	//  158  281:istore          12
			ai[k1] = getColor(j, Util.constrainValue(l, 0, 255), Util.constrainValue(k, 0, 255), Util.constrainValue(j1, 0, 255));
	//  159  283:aload           14
	//  160  285:iload           13
	//  161  287:iload           8
	//  162  289:iload           10
	//  163  291:iconst_0        
	//  164  292:sipush          255
	//  165  295:invokestatic    #269 <Method int Util.constrainValue(int, int, int)>
	//  166  298:iload           9
	//  167  300:iconst_0        
	//  168  301:sipush          255
	//  169  304:invokestatic    #269 <Method int Util.constrainValue(int, int, int)>
	//  170  307:iload           12
	//  171  309:iconst_0        
	//  172  310:sipush          255
	//  173  313:invokestatic    #269 <Method int Util.constrainValue(int, int, int)>
	//  174  316:invokestatic    #194 <Method int getColor(int, int, int, int)>
	//  175  319:iastore         
		}
	//* 176  320:goto            33
		return new ClutDefinition(i1, ai1, ai2, ai3);
	//  177  323:new             #6   <Class DvbParser$ClutDefinition>
	//  178  326:dup             
	//  179  327:iload           11
	//  180  329:aload           15
	//  181  331:aload           16
	//  182  333:aload           17
	//  183  335:invokespecial   #174 <Method void DvbParser$ClutDefinition(int, int[], int[], int[])>
	//  184  338:areturn         
	}

	private static DisplayDefinition parseDisplayDefinition(ParsableBitArray parsablebitarray)
	{
		parsablebitarray.skipBits(4);
	//    0    0:aload_0         
	//    1    1:iconst_4        
	//    2    2:invokevirtual   #255 <Method void ParsableBitArray.skipBits(int)>
		boolean flag1 = parsablebitarray.readBit();
	//    3    5:aload_0         
	//    4    6:invokevirtual   #200 <Method boolean ParsableBitArray.readBit()>
	//    5    9:istore          8
		parsablebitarray.skipBits(3);
	//    6   11:aload_0         
	//    7   12:iconst_3        
	//    8   13:invokevirtual   #255 <Method void ParsableBitArray.skipBits(int)>
		int j1 = parsablebitarray.readBits(16);
	//    9   16:aload_0         
	//   10   17:bipush          16
	//   11   19:invokevirtual   #188 <Method int ParsableBitArray.readBits(int)>
	//   12   22:istore          6
		int k1 = parsablebitarray.readBits(16);
	//   13   24:aload_0         
	//   14   25:bipush          16
	//   15   27:invokevirtual   #188 <Method int ParsableBitArray.readBits(int)>
	//   16   30:istore          7
		int j;
		int k;
		int l;
		int i1;
		if(flag1)
	//*  17   32:iload           8
	//*  18   34:ifeq            72
		{
			k = parsablebitarray.readBits(16);
	//   19   37:aload_0         
	//   20   38:bipush          16
	//   21   40:invokevirtual   #188 <Method int ParsableBitArray.readBits(int)>
	//   22   43:istore_3        
			int i = parsablebitarray.readBits(16);
	//   23   44:aload_0         
	//   24   45:bipush          16
	//   25   47:invokevirtual   #188 <Method int ParsableBitArray.readBits(int)>
	//   26   50:istore_1        
			j = parsablebitarray.readBits(16);
	//   27   51:aload_0         
	//   28   52:bipush          16
	//   29   54:invokevirtual   #188 <Method int ParsableBitArray.readBits(int)>
	//   30   57:istore_2        
			i1 = parsablebitarray.readBits(16);
	//   31   58:aload_0         
	//   32   59:bipush          16
	//   33   61:invokevirtual   #188 <Method int ParsableBitArray.readBits(int)>
	//   34   64:istore          5
			l = i;
	//   35   66:iload_1         
	//   36   67:istore          4
		} else
	//*  37   69:goto            86
		{
			boolean flag = false;
	//   38   72:iconst_0        
	//   39   73:istore_1        
			j = ((int) (flag));
	//   40   74:iload_1         
	//   41   75:istore_2        
			l = j1;
	//   42   76:iload           6
	//   43   78:istore          4
			i1 = k1;
	//   44   80:iload           7
	//   45   82:istore          5
			k = ((int) (flag));
	//   46   84:iload_1         
	//   47   85:istore_3        
		}
		return new DisplayDefinition(j1, k1, k, l, j, i1);
	//   48   86:new             #9   <Class DvbParser$DisplayDefinition>
	//   49   89:dup             
	//   50   90:iload           6
	//   51   92:iload           7
	//   52   94:iload_3         
	//   53   95:iload           4
	//   54   97:iload_2         
	//   55   98:iload           5
	//   56  100:invokespecial   #159 <Method void DvbParser$DisplayDefinition(int, int, int, int, int, int)>
	//   57  103:areturn         
	}

	private static ObjectData parseObjectData(ParsableBitArray parsablebitarray)
	{
		int i;
		boolean flag;
		byte abyte0[];
label0:
		{
			i = parsablebitarray.readBits(16);
	//    0    0:aload_0         
	//    1    1:bipush          16
	//    2    3:invokevirtual   #188 <Method int ParsableBitArray.readBits(int)>
	//    3    6:istore_1        
			parsablebitarray.skipBits(4);
	//    4    7:aload_0         
	//    5    8:iconst_4        
	//    6    9:invokevirtual   #255 <Method void ParsableBitArray.skipBits(int)>
			int j = parsablebitarray.readBits(2);
	//    7   12:aload_0         
	//    8   13:iconst_2        
	//    9   14:invokevirtual   #188 <Method int ParsableBitArray.readBits(int)>
	//   10   17:istore_2        
			flag = parsablebitarray.readBit();
	//   11   18:aload_0         
	//   12   19:invokevirtual   #200 <Method boolean ParsableBitArray.readBit()>
	//   13   22:istore          4
			parsablebitarray.skipBits(1);
	//   14   24:aload_0         
	//   15   25:iconst_1        
	//   16   26:invokevirtual   #255 <Method void ParsableBitArray.skipBits(int)>
			byte abyte1[] = null;
	//   17   29:aconst_null     
	//   18   30:astore          6
			abyte0 = null;
	//   19   32:aconst_null     
	//   20   33:astore          5
			if(j == 1)
	//*  21   35:iload_2         
	//*  22   36:iconst_1        
	//*  23   37:icmpne          56
				parsablebitarray.skipBits(parsablebitarray.readBits(8) * 16);
	//   24   40:aload_0         
	//   25   41:aload_0         
	//   26   42:bipush          8
	//   27   44:invokevirtual   #188 <Method int ParsableBitArray.readBits(int)>
	//   28   47:bipush          16
	//   29   49:imul            
	//   30   50:invokevirtual   #255 <Method void ParsableBitArray.skipBits(int)>
			else
	//*  31   53:goto            118
			if(j == 0)
	//*  32   56:iload_2         
	//*  33   57:ifne            118
			{
				int k = parsablebitarray.readBits(16);
	//   34   60:aload_0         
	//   35   61:bipush          16
	//   36   63:invokevirtual   #188 <Method int ParsableBitArray.readBits(int)>
	//   37   66:istore_2        
				int l = parsablebitarray.readBits(16);
	//   38   67:aload_0         
	//   39   68:bipush          16
	//   40   70:invokevirtual   #188 <Method int ParsableBitArray.readBits(int)>
	//   41   73:istore_3        
				if(k > 0)
	//*  42   74:iload_2         
	//*  43   75:ifle            91
				{
					abyte0 = new byte[k];
	//   44   78:iload_2         
	//   45   79:newarray        byte[]
	//   46   81:astore          5
					parsablebitarray.readBytes(abyte0, 0, k);
	//   47   83:aload_0         
	//   48   84:aload           5
	//   49   86:iconst_0        
	//   50   87:iload_2         
	//   51   88:invokevirtual   #277 <Method void ParsableBitArray.readBytes(byte[], int, int)>
				}
				abyte1 = abyte0;
	//   52   91:aload           5
	//   53   93:astore          6
				if(l > 0)
	//*  54   95:iload_3         
	//*  55   96:ifle            118
				{
					abyte1 = new byte[l];
	//   56   99:iload_3         
	//   57  100:newarray        byte[]
	//   58  102:astore          6
					parsablebitarray.readBytes(abyte1, 0, l);
	//   59  104:aload_0         
	//   60  105:aload           6
	//   61  107:iconst_0        
	//   62  108:iload_3         
	//   63  109:invokevirtual   #277 <Method void ParsableBitArray.readBytes(byte[], int, int)>
					parsablebitarray = ((ParsableBitArray) (abyte1));
	//   64  112:aload           6
	//   65  114:astore_0        
					break label0;
	//   66  115:goto            125
				}
			}
			parsablebitarray = ((ParsableBitArray) (abyte1));
	//   67  118:aload           6
	//   68  120:astore_0        
			abyte0 = abyte1;
	//   69  121:aload           6
	//   70  123:astore          5
		}
		return new ObjectData(i, flag, abyte0, ((byte []) (parsablebitarray)));
	//   71  125:new             #12  <Class DvbParser$ObjectData>
	//   72  128:dup             
	//   73  129:iload_1         
	//   74  130:iload           4
	//   75  132:aload           5
	//   76  134:aload_0         
	//   77  135:invokespecial   #280 <Method void DvbParser$ObjectData(int, boolean, byte[], byte[])>
	//   78  138:areturn         
	}

	private static PageComposition parsePageComposition(ParsableBitArray parsablebitarray, int i)
	{
		int j = parsablebitarray.readBits(8);
	//    0    0:aload_0         
	//    1    1:bipush          8
	//    2    3:invokevirtual   #188 <Method int ParsableBitArray.readBits(int)>
	//    3    6:istore_2        
		int k = parsablebitarray.readBits(4);
	//    4    7:aload_0         
	//    5    8:iconst_4        
	//    6    9:invokevirtual   #188 <Method int ParsableBitArray.readBits(int)>
	//    7   12:istore_3        
		int l = parsablebitarray.readBits(2);
	//    8   13:aload_0         
	//    9   14:iconst_2        
	//   10   15:invokevirtual   #188 <Method int ParsableBitArray.readBits(int)>
	//   11   18:istore          4
		parsablebitarray.skipBits(2);
	//   12   20:aload_0         
	//   13   21:iconst_2        
	//   14   22:invokevirtual   #255 <Method void ParsableBitArray.skipBits(int)>
		i -= 2;
	//   15   25:iload_1         
	//   16   26:iconst_2        
	//   17   27:isub            
	//   18   28:istore_1        
		SparseArray sparsearray = new SparseArray();
	//   19   29:new             #284 <Class SparseArray>
	//   20   32:dup             
	//   21   33:invokespecial   #285 <Method void SparseArray()>
	//   22   36:astore          8
		while(i > 0) 
	//*  23   38:iload_1         
	//*  24   39:ifle            98
		{
			int i1 = parsablebitarray.readBits(8);
	//   25   42:aload_0         
	//   26   43:bipush          8
	//   27   45:invokevirtual   #188 <Method int ParsableBitArray.readBits(int)>
	//   28   48:istore          5
			parsablebitarray.skipBits(8);
	//   29   50:aload_0         
	//   30   51:bipush          8
	//   31   53:invokevirtual   #255 <Method void ParsableBitArray.skipBits(int)>
			int j1 = parsablebitarray.readBits(16);
	//   32   56:aload_0         
	//   33   57:bipush          16
	//   34   59:invokevirtual   #188 <Method int ParsableBitArray.readBits(int)>
	//   35   62:istore          6
			int k1 = parsablebitarray.readBits(16);
	//   36   64:aload_0         
	//   37   65:bipush          16
	//   38   67:invokevirtual   #188 <Method int ParsableBitArray.readBits(int)>
	//   39   70:istore          7
			i -= 6;
	//   40   72:iload_1         
	//   41   73:bipush          6
	//   42   75:isub            
	//   43   76:istore_1        
			sparsearray.put(i1, ((Object) (new PageRegion(j1, k1))));
	//   44   77:aload           8
	//   45   79:iload           5
	//   46   81:new             #18  <Class DvbParser$PageRegion>
	//   47   84:dup             
	//   48   85:iload           6
	//   49   87:iload           7
	//   50   89:invokespecial   #286 <Method void DvbParser$PageRegion(int, int)>
	//   51   92:invokevirtual   #290 <Method void SparseArray.put(int, Object)>
		}
	//*  52   95:goto            38
		return new PageComposition(j, k, l, sparsearray);
	//   53   98:new             #15  <Class DvbParser$PageComposition>
	//   54  101:dup             
	//   55  102:iload_2         
	//   56  103:iload_3         
	//   57  104:iload           4
	//   58  106:aload           8
	//   59  108:invokespecial   #293 <Method void DvbParser$PageComposition(int, int, int, SparseArray)>
	//   60  111:areturn         
	}

	private static RegionComposition parseRegionComposition(ParsableBitArray parsablebitarray, int i)
	{
		int j1 = parsablebitarray.readBits(8);
	//    0    0:aload_0         
	//    1    1:bipush          8
	//    2    3:invokevirtual   #188 <Method int ParsableBitArray.readBits(int)>
	//    3    6:istore          6
		parsablebitarray.skipBits(4);
	//    4    8:aload_0         
	//    5    9:iconst_4        
	//    6   10:invokevirtual   #255 <Method void ParsableBitArray.skipBits(int)>
		boolean flag = parsablebitarray.readBit();
	//    7   13:aload_0         
	//    8   14:invokevirtual   #200 <Method boolean ParsableBitArray.readBit()>
	//    9   17:istore          19
		parsablebitarray.skipBits(3);
	//   10   19:aload_0         
	//   11   20:iconst_3        
	//   12   21:invokevirtual   #255 <Method void ParsableBitArray.skipBits(int)>
		int k1 = parsablebitarray.readBits(16);
	//   13   24:aload_0         
	//   14   25:bipush          16
	//   15   27:invokevirtual   #188 <Method int ParsableBitArray.readBits(int)>
	//   16   30:istore          7
		int l1 = parsablebitarray.readBits(16);
	//   17   32:aload_0         
	//   18   33:bipush          16
	//   19   35:invokevirtual   #188 <Method int ParsableBitArray.readBits(int)>
	//   20   38:istore          8
		int i2 = parsablebitarray.readBits(3);
	//   21   40:aload_0         
	//   22   41:iconst_3        
	//   23   42:invokevirtual   #188 <Method int ParsableBitArray.readBits(int)>
	//   24   45:istore          9
		int j2 = parsablebitarray.readBits(3);
	//   25   47:aload_0         
	//   26   48:iconst_3        
	//   27   49:invokevirtual   #188 <Method int ParsableBitArray.readBits(int)>
	//   28   52:istore          10
		parsablebitarray.skipBits(2);
	//   29   54:aload_0         
	//   30   55:iconst_2        
	//   31   56:invokevirtual   #255 <Method void ParsableBitArray.skipBits(int)>
		int k2 = parsablebitarray.readBits(8);
	//   32   59:aload_0         
	//   33   60:bipush          8
	//   34   62:invokevirtual   #188 <Method int ParsableBitArray.readBits(int)>
	//   35   65:istore          11
		int l2 = parsablebitarray.readBits(8);
	//   36   67:aload_0         
	//   37   68:bipush          8
	//   38   70:invokevirtual   #188 <Method int ParsableBitArray.readBits(int)>
	//   39   73:istore          12
		int i3 = parsablebitarray.readBits(4);
	//   40   75:aload_0         
	//   41   76:iconst_4        
	//   42   77:invokevirtual   #188 <Method int ParsableBitArray.readBits(int)>
	//   43   80:istore          13
		int j = parsablebitarray.readBits(2);
	//   44   82:aload_0         
	//   45   83:iconst_2        
	//   46   84:invokevirtual   #188 <Method int ParsableBitArray.readBits(int)>
	//   47   87:istore_2        
		parsablebitarray.skipBits(2);
	//   48   88:aload_0         
	//   49   89:iconst_2        
	//   50   90:invokevirtual   #255 <Method void ParsableBitArray.skipBits(int)>
		i -= 10;
	//   51   93:iload_1         
	//   52   94:bipush          10
	//   53   96:isub            
	//   54   97:istore_1        
		SparseArray sparsearray = new SparseArray();
	//   55   98:new             #284 <Class SparseArray>
	//   56  101:dup             
	//   57  102:invokespecial   #285 <Method void SparseArray()>
	//   58  105:astore          20
		while(i > 0) 
	//*  59  107:iload_1         
	//*  60  108:ifle            240
		{
			int j3 = parsablebitarray.readBits(16);
	//   61  111:aload_0         
	//   62  112:bipush          16
	//   63  114:invokevirtual   #188 <Method int ParsableBitArray.readBits(int)>
	//   64  117:istore          14
			int k3 = parsablebitarray.readBits(2);
	//   65  119:aload_0         
	//   66  120:iconst_2        
	//   67  121:invokevirtual   #188 <Method int ParsableBitArray.readBits(int)>
	//   68  124:istore          15
			int l3 = parsablebitarray.readBits(2);
	//   69  126:aload_0         
	//   70  127:iconst_2        
	//   71  128:invokevirtual   #188 <Method int ParsableBitArray.readBits(int)>
	//   72  131:istore          16
			int i4 = parsablebitarray.readBits(12);
	//   73  133:aload_0         
	//   74  134:bipush          12
	//   75  136:invokevirtual   #188 <Method int ParsableBitArray.readBits(int)>
	//   76  139:istore          17
			parsablebitarray.skipBits(4);
	//   77  141:aload_0         
	//   78  142:iconst_4        
	//   79  143:invokevirtual   #255 <Method void ParsableBitArray.skipBits(int)>
			int j4 = parsablebitarray.readBits(12);
	//   80  146:aload_0         
	//   81  147:bipush          12
	//   82  149:invokevirtual   #188 <Method int ParsableBitArray.readBits(int)>
	//   83  152:istore          18
			i -= 6;
	//   84  154:iload_1         
	//   85  155:bipush          6
	//   86  157:isub            
	//   87  158:istore_1        
			int k;
			int l;
			if(k3 != 1 && k3 != 2)
	//*  88  159:iload           15
	//*  89  161:iconst_1        
	//*  90  162:icmpeq          183
	//*  91  165:iload           15
	//*  92  167:iconst_2        
	//*  93  168:icmpne          174
	//*  94  171:goto            183
			{
				l = 0;
	//   95  174:iconst_0        
	//   96  175:istore          4
				k = l;
	//   97  177:iload           4
	//   98  179:istore_3        
			} else
	//*  99  180:goto            212
			{
				l = parsablebitarray.readBits(8);
	//  100  183:aload_0         
	//  101  184:bipush          8
	//  102  186:invokevirtual   #188 <Method int ParsableBitArray.readBits(int)>
	//  103  189:istore          4
				k = parsablebitarray.readBits(8);
	//  104  191:aload_0         
	//  105  192:bipush          8
	//  106  194:invokevirtual   #188 <Method int ParsableBitArray.readBits(int)>
	//  107  197:istore_3        
				int i1 = i - 2;
	//  108  198:iload_1         
	//  109  199:iconst_2        
	//  110  200:isub            
	//  111  201:istore          5
				i = l;
	//  112  203:iload           4
	//  113  205:istore_1        
				l = i;
	//  114  206:iload_1         
	//  115  207:istore          4
				i = i1;
	//  116  209:iload           5
	//  117  211:istore_1        
			}
			sparsearray.put(j3, ((Object) (new RegionObject(k3, l3, i4, j4, l, k))));
	//  118  212:aload           20
	//  119  214:iload           14
	//  120  216:new             #24  <Class DvbParser$RegionObject>
	//  121  219:dup             
	//  122  220:iload           15
	//  123  222:iload           16
	//  124  224:iload           17
	//  125  226:iload           18
	//  126  228:iload           4
	//  127  230:iload_3         
	//  128  231:invokespecial   #296 <Method void DvbParser$RegionObject(int, int, int, int, int, int)>
	//  129  234:invokevirtual   #290 <Method void SparseArray.put(int, Object)>
		}
	//* 130  237:goto            107
		return new RegionComposition(j1, flag, k1, l1, i2, j2, k2, l2, i3, j, sparsearray);
	//  131  240:new             #21  <Class DvbParser$RegionComposition>
	//  132  243:dup             
	//  133  244:iload           6
	//  134  246:iload           19
	//  135  248:iload           7
	//  136  250:iload           8
	//  137  252:iload           9
	//  138  254:iload           10
	//  139  256:iload           11
	//  140  258:iload           12
	//  141  260:iload           13
	//  142  262:iload_2         
	//  143  263:aload           20
	//  144  265:invokespecial   #299 <Method void DvbParser$RegionComposition(int, boolean, int, int, int, int, int, int, int, int, SparseArray)>
	//  145  268:areturn         
	}

	private static void parseSubtitlingSegment(ParsableBitArray parsablebitarray, SubtitleService subtitleservice)
	{
		int i = parsablebitarray.readBits(8);
	//    0    0:aload_0         
	//    1    1:bipush          8
	//    2    3:invokevirtual   #188 <Method int ParsableBitArray.readBits(int)>
	//    3    6:istore_2        
		int j = parsablebitarray.readBits(16);
	//    4    7:aload_0         
	//    5    8:bipush          16
	//    6   10:invokevirtual   #188 <Method int ParsableBitArray.readBits(int)>
	//    7   13:istore_3        
		int k = parsablebitarray.readBits(16);
	//    8   14:aload_0         
	//    9   15:bipush          16
	//   10   17:invokevirtual   #188 <Method int ParsableBitArray.readBits(int)>
	//   11   20:istore          4
		int l = parsablebitarray.getBytePosition();
	//   12   22:aload_0         
	//   13   23:invokevirtual   #304 <Method int ParsableBitArray.getBytePosition()>
	//   14   26:istore          5
		if(k * 8 > parsablebitarray.bitsLeft())
	//*  15   28:iload           4
	//*  16   30:bipush          8
	//*  17   32:imul            
	//*  18   33:aload_0         
	//*  19   34:invokevirtual   #219 <Method int ParsableBitArray.bitsLeft()>
	//*  20   37:icmple          58
		{
			Log.w("DvbParser", "Data field length exceeds limit");
	//   21   40:ldc1            #63  <String "DvbParser">
	//   22   42:ldc2            #306 <String "Data field length exceeds limit">
	//   23   45:invokestatic    #312 <Method int Log.w(String, String)>
	//   24   48:pop             
			parsablebitarray.skipBits(parsablebitarray.bitsLeft());
	//   25   49:aload_0         
	//   26   50:aload_0         
	//   27   51:invokevirtual   #219 <Method int ParsableBitArray.bitsLeft()>
	//   28   54:invokevirtual   #255 <Method void ParsableBitArray.skipBits(int)>
			return;
	//   29   57:return          
		}
		switch(i)
	//*  30   58:iload_2         
		{
		default:
			break;

	//*  31   59:tableswitch     16 20: default 92
	//	               16 314
	//	               17 242
	//	               18 176
	//	               19 114
	//	               20 95
	//*  32   92:goto            398
		case 20: // '\024'
			if(j == subtitleservice.subtitlePageId)
	//*  33   95:iload_3         
	//*  34   96:aload_1         
	//*  35   97:getfield        #315 <Field int DvbParser$SubtitleService.subtitlePageId>
	//*  36  100:icmpne          398
				subtitleservice.displayDefinition = parseDisplayDefinition(parsablebitarray);
	//   37  103:aload_1         
	//   38  104:aload_0         
	//   39  105:invokestatic    #317 <Method DvbParser$DisplayDefinition parseDisplayDefinition(ParsableBitArray)>
	//   40  108:putfield        #320 <Field DvbParser$DisplayDefinition DvbParser$SubtitleService.displayDefinition>
			break;
	//   41  111:goto            398

		case 19: // '\023'
			if(j == subtitleservice.subtitlePageId)
	//*  42  114:iload_3         
	//*  43  115:aload_1         
	//*  44  116:getfield        #315 <Field int DvbParser$SubtitleService.subtitlePageId>
	//*  45  119:icmpne          145
			{
				ObjectData objectdata = parseObjectData(parsablebitarray);
	//   46  122:aload_0         
	//   47  123:invokestatic    #322 <Method DvbParser$ObjectData parseObjectData(ParsableBitArray)>
	//   48  126:astore          6
				subtitleservice.objects.put(objectdata.id, ((Object) (objectdata)));
	//   49  128:aload_1         
	//   50  129:getfield        #326 <Field SparseArray DvbParser$SubtitleService.objects>
	//   51  132:aload           6
	//   52  134:getfield        #329 <Field int DvbParser$ObjectData.id>
	//   53  137:aload           6
	//   54  139:invokevirtual   #290 <Method void SparseArray.put(int, Object)>
				break;
	//   55  142:goto            398
			}
			if(j == subtitleservice.ancillaryPageId)
	//*  56  145:iload_3         
	//*  57  146:aload_1         
	//*  58  147:getfield        #332 <Field int DvbParser$SubtitleService.ancillaryPageId>
	//*  59  150:icmpne          398
			{
				ObjectData objectdata1 = parseObjectData(parsablebitarray);
	//   60  153:aload_0         
	//   61  154:invokestatic    #322 <Method DvbParser$ObjectData parseObjectData(ParsableBitArray)>
	//   62  157:astore          6
				subtitleservice.ancillaryObjects.put(objectdata1.id, ((Object) (objectdata1)));
	//   63  159:aload_1         
	//   64  160:getfield        #335 <Field SparseArray DvbParser$SubtitleService.ancillaryObjects>
	//   65  163:aload           6
	//   66  165:getfield        #329 <Field int DvbParser$ObjectData.id>
	//   67  168:aload           6
	//   68  170:invokevirtual   #290 <Method void SparseArray.put(int, Object)>
			}
			break;
	//   69  173:goto            398

		case 18: // '\022'
			if(j == subtitleservice.subtitlePageId)
	//*  70  176:iload_3         
	//*  71  177:aload_1         
	//*  72  178:getfield        #315 <Field int DvbParser$SubtitleService.subtitlePageId>
	//*  73  181:icmpne          209
			{
				ClutDefinition clutdefinition = parseClutDefinition(parsablebitarray, k);
	//   74  184:aload_0         
	//   75  185:iload           4
	//   76  187:invokestatic    #337 <Method DvbParser$ClutDefinition parseClutDefinition(ParsableBitArray, int)>
	//   77  190:astore          6
				subtitleservice.cluts.put(clutdefinition.id, ((Object) (clutdefinition)));
	//   78  192:aload_1         
	//   79  193:getfield        #340 <Field SparseArray DvbParser$SubtitleService.cluts>
	//   80  196:aload           6
	//   81  198:getfield        #341 <Field int DvbParser$ClutDefinition.id>
	//   82  201:aload           6
	//   83  203:invokevirtual   #290 <Method void SparseArray.put(int, Object)>
				break;
	//   84  206:goto            398
			}
			if(j == subtitleservice.ancillaryPageId)
	//*  85  209:iload_3         
	//*  86  210:aload_1         
	//*  87  211:getfield        #332 <Field int DvbParser$SubtitleService.ancillaryPageId>
	//*  88  214:icmpne          398
			{
				ClutDefinition clutdefinition1 = parseClutDefinition(parsablebitarray, k);
	//   89  217:aload_0         
	//   90  218:iload           4
	//   91  220:invokestatic    #337 <Method DvbParser$ClutDefinition parseClutDefinition(ParsableBitArray, int)>
	//   92  223:astore          6
				subtitleservice.ancillaryCluts.put(clutdefinition1.id, ((Object) (clutdefinition1)));
	//   93  225:aload_1         
	//   94  226:getfield        #344 <Field SparseArray DvbParser$SubtitleService.ancillaryCluts>
	//   95  229:aload           6
	//   96  231:getfield        #341 <Field int DvbParser$ClutDefinition.id>
	//   97  234:aload           6
	//   98  236:invokevirtual   #290 <Method void SparseArray.put(int, Object)>
			}
			break;
	//   99  239:goto            398

		case 17: // '\021'
			PageComposition pagecomposition = subtitleservice.pageComposition;
	//  100  242:aload_1         
	//  101  243:getfield        #348 <Field DvbParser$PageComposition DvbParser$SubtitleService.pageComposition>
	//  102  246:astore          6
			if(j != subtitleservice.subtitlePageId || pagecomposition == null)
				break;
	//  103  248:iload_3         
	//  104  249:aload_1         
	//  105  250:getfield        #315 <Field int DvbParser$SubtitleService.subtitlePageId>
	//  106  253:icmpne          398
	//  107  256:aload           6
	//  108  258:ifnull          398
			RegionComposition regioncomposition = parseRegionComposition(parsablebitarray, k);
	//  109  261:aload_0         
	//  110  262:iload           4
	//  111  264:invokestatic    #350 <Method DvbParser$RegionComposition parseRegionComposition(ParsableBitArray, int)>
	//  112  267:astore          7
			if(pagecomposition.state == 0)
	//* 113  269:aload           6
	//* 114  271:getfield        #353 <Field int DvbParser$PageComposition.state>
	//* 115  274:ifne            297
				regioncomposition.mergeFrom((RegionComposition)subtitleservice.regions.get(regioncomposition.id));
	//  116  277:aload           7
	//  117  279:aload_1         
	//  118  280:getfield        #356 <Field SparseArray DvbParser$SubtitleService.regions>
	//  119  283:aload           7
	//  120  285:getfield        #357 <Field int DvbParser$RegionComposition.id>
	//  121  288:invokevirtual   #361 <Method Object SparseArray.get(int)>
	//  122  291:checkcast       #21  <Class DvbParser$RegionComposition>
	//  123  294:invokevirtual   #365 <Method void DvbParser$RegionComposition.mergeFrom(DvbParser$RegionComposition)>
			subtitleservice.regions.put(regioncomposition.id, ((Object) (regioncomposition)));
	//  124  297:aload_1         
	//  125  298:getfield        #356 <Field SparseArray DvbParser$SubtitleService.regions>
	//  126  301:aload           7
	//  127  303:getfield        #357 <Field int DvbParser$RegionComposition.id>
	//  128  306:aload           7
	//  129  308:invokevirtual   #290 <Method void SparseArray.put(int, Object)>
			break;
	//  130  311:goto            398

		case 16: // '\020'
			if(j != subtitleservice.subtitlePageId)
				break;
	//  131  314:iload_3         
	//  132  315:aload_1         
	//  133  316:getfield        #315 <Field int DvbParser$SubtitleService.subtitlePageId>
	//  134  319:icmpne          398
			PageComposition pagecomposition1 = subtitleservice.pageComposition;
	//  135  322:aload_1         
	//  136  323:getfield        #348 <Field DvbParser$PageComposition DvbParser$SubtitleService.pageComposition>
	//  137  326:astore          6
			PageComposition pagecomposition2 = parsePageComposition(parsablebitarray, k);
	//  138  328:aload_0         
	//  139  329:iload           4
	//  140  331:invokestatic    #367 <Method DvbParser$PageComposition parsePageComposition(ParsableBitArray, int)>
	//  141  334:astore          7
			if(pagecomposition2.state != 0)
	//* 142  336:aload           7
	//* 143  338:getfield        #353 <Field int DvbParser$PageComposition.state>
	//* 144  341:ifeq            374
			{
				subtitleservice.pageComposition = pagecomposition2;
	//  145  344:aload_1         
	//  146  345:aload           7
	//  147  347:putfield        #348 <Field DvbParser$PageComposition DvbParser$SubtitleService.pageComposition>
				subtitleservice.regions.clear();
	//  148  350:aload_1         
	//  149  351:getfield        #356 <Field SparseArray DvbParser$SubtitleService.regions>
	//  150  354:invokevirtual   #370 <Method void SparseArray.clear()>
				subtitleservice.cluts.clear();
	//  151  357:aload_1         
	//  152  358:getfield        #340 <Field SparseArray DvbParser$SubtitleService.cluts>
	//  153  361:invokevirtual   #370 <Method void SparseArray.clear()>
				subtitleservice.objects.clear();
	//  154  364:aload_1         
	//  155  365:getfield        #326 <Field SparseArray DvbParser$SubtitleService.objects>
	//  156  368:invokevirtual   #370 <Method void SparseArray.clear()>
				break;
	//  157  371:goto            398
			}
			if(pagecomposition1 != null && pagecomposition1.version != pagecomposition2.version)
	//* 158  374:aload           6
	//* 159  376:ifnull          398
	//* 160  379:aload           6
	//* 161  381:getfield        #373 <Field int DvbParser$PageComposition.version>
	//* 162  384:aload           7
	//* 163  386:getfield        #373 <Field int DvbParser$PageComposition.version>
	//* 164  389:icmpeq          398
				subtitleservice.pageComposition = pagecomposition2;
	//  165  392:aload_1         
	//  166  393:aload           7
	//  167  395:putfield        #348 <Field DvbParser$PageComposition DvbParser$SubtitleService.pageComposition>
			break;
		}
		parsablebitarray.skipBytes((l + k) - parsablebitarray.getBytePosition());
	//  168  398:aload_0         
	//  169  399:iload           5
	//  170  401:iload           4
	//  171  403:iadd            
	//  172  404:aload_0         
	//  173  405:invokevirtual   #304 <Method int ParsableBitArray.getBytePosition()>
	//  174  408:isub            
	//  175  409:invokevirtual   #376 <Method void ParsableBitArray.skipBytes(int)>
	//  176  412:return          
	}

	public List decode(byte abyte0[], int i)
	{
		for(abyte0 = ((byte []) (new ParsableBitArray(abyte0, i))); ((ParsableBitArray) (abyte0)).bitsLeft() >= 48 && ((ParsableBitArray) (abyte0)).readBits(8) == 15; parseSubtitlingSegment(((ParsableBitArray) (abyte0)), subtitleService));
	//    0    0:new             #184 <Class ParsableBitArray>
	//    1    3:dup             
	//    2    4:aload_1         
	//    3    5:iload_2         
	//    4    6:invokespecial   #381 <Method void ParsableBitArray(byte[], int)>
	//    5    9:astore_1        
	//    6   10:aload_1         
	//    7   11:invokevirtual   #219 <Method int ParsableBitArray.bitsLeft()>
	//    8   14:bipush          48
	//    9   16:icmplt          41
	//   10   19:aload_1         
	//   11   20:bipush          8
	//   12   22:invokevirtual   #188 <Method int ParsableBitArray.readBits(int)>
	//   13   25:bipush          15
	//   14   27:icmpne          41
	//   15   30:aload_1         
	//   16   31:aload_0         
	//   17   32:getfield        #180 <Field DvbParser$SubtitleService subtitleService>
	//   18   35:invokestatic    #383 <Method void parseSubtitlingSegment(ParsableBitArray, DvbParser$SubtitleService)>
	//*  19   38:goto            10
		if(subtitleService.pageComposition == null)
	//*  20   41:aload_0         
	//*  21   42:getfield        #180 <Field DvbParser$SubtitleService subtitleService>
	//*  22   45:getfield        #348 <Field DvbParser$PageComposition DvbParser$SubtitleService.pageComposition>
	//*  23   48:ifnonnull       55
			return Collections.emptyList();
	//   24   51:invokestatic    #389 <Method List Collections.emptyList()>
	//   25   54:areturn         
		DisplayDefinition displaydefinition;
		if(subtitleService.displayDefinition != null)
	//*  26   55:aload_0         
	//*  27   56:getfield        #180 <Field DvbParser$SubtitleService subtitleService>
	//*  28   59:getfield        #320 <Field DvbParser$DisplayDefinition DvbParser$SubtitleService.displayDefinition>
	//*  29   62:ifnull          77
			displaydefinition = subtitleService.displayDefinition;
	//   30   65:aload_0         
	//   31   66:getfield        #180 <Field DvbParser$SubtitleService subtitleService>
	//   32   69:getfield        #320 <Field DvbParser$DisplayDefinition DvbParser$SubtitleService.displayDefinition>
	//   33   72:astore          9
		else
	//*  34   74:goto            83
			displaydefinition = defaultDisplayDefinition;
	//   35   77:aload_0         
	//   36   78:getfield        #161 <Field DvbParser$DisplayDefinition defaultDisplayDefinition>
	//   37   81:astore          9
		if(bitmap == null || displaydefinition.width + 1 != bitmap.getWidth() || displaydefinition.height + 1 != bitmap.getHeight())
	//*  38   83:aload_0         
	//*  39   84:getfield        #391 <Field Bitmap bitmap>
	//*  40   87:ifnull          124
	//*  41   90:aload           9
	//*  42   92:getfield        #394 <Field int DvbParser$DisplayDefinition.width>
	//*  43   95:iconst_1        
	//*  44   96:iadd            
	//*  45   97:aload_0         
	//*  46   98:getfield        #391 <Field Bitmap bitmap>
	//*  47  101:invokevirtual   #399 <Method int Bitmap.getWidth()>
	//*  48  104:icmpne          124
	//*  49  107:aload           9
	//*  50  109:getfield        #402 <Field int DvbParser$DisplayDefinition.height>
	//*  51  112:iconst_1        
	//*  52  113:iadd            
	//*  53  114:aload_0         
	//*  54  115:getfield        #391 <Field Bitmap bitmap>
	//*  55  118:invokevirtual   #405 <Method int Bitmap.getHeight()>
	//*  56  121:icmpeq          159
		{
			bitmap = Bitmap.createBitmap(displaydefinition.width + 1, displaydefinition.height + 1, android.graphics.Bitmap.Config.ARGB_8888);
	//   57  124:aload_0         
	//   58  125:aload           9
	//   59  127:getfield        #394 <Field int DvbParser$DisplayDefinition.width>
	//   60  130:iconst_1        
	//   61  131:iadd            
	//   62  132:aload           9
	//   63  134:getfield        #402 <Field int DvbParser$DisplayDefinition.height>
	//   64  137:iconst_1        
	//   65  138:iadd            
	//   66  139:getstatic       #411 <Field android.graphics.Bitmap$Config android.graphics.Bitmap$Config.ARGB_8888>
	//   67  142:invokestatic    #415 <Method Bitmap Bitmap.createBitmap(int, int, android.graphics.Bitmap$Config)>
	//   68  145:putfield        #391 <Field Bitmap bitmap>
			canvas.setBitmap(bitmap);
	//   69  148:aload_0         
	//   70  149:getfield        #156 <Field Canvas canvas>
	//   71  152:aload_0         
	//   72  153:getfield        #391 <Field Bitmap bitmap>
	//   73  156:invokevirtual   #419 <Method void Canvas.setBitmap(Bitmap)>
		}
		ArrayList arraylist = new ArrayList();
	//   74  159:new             #421 <Class ArrayList>
	//   75  162:dup             
	//   76  163:invokespecial   #422 <Method void ArrayList()>
	//   77  166:astore          13
		SparseArray sparsearray = subtitleService.pageComposition.regions;
	//   78  168:aload_0         
	//   79  169:getfield        #180 <Field DvbParser$SubtitleService subtitleService>
	//   80  172:getfield        #348 <Field DvbParser$PageComposition DvbParser$SubtitleService.pageComposition>
	//   81  175:getfield        #423 <Field SparseArray DvbParser$PageComposition.regions>
	//   82  178:astore          14
		for(int j = 0; j < sparsearray.size(); j++)
	//*  83  180:iconst_0        
	//*  84  181:istore          5
	//*  85  183:iload           5
	//*  86  185:aload           14
	//*  87  187:invokevirtual   #426 <Method int SparseArray.size()>
	//*  88  190:icmpge          734
		{
			abyte0 = ((byte []) ((PageRegion)sparsearray.valueAt(j)));
	//   89  193:aload           14
	//   90  195:iload           5
	//   91  197:invokevirtual   #429 <Method Object SparseArray.valueAt(int)>
	//   92  200:checkcast       #18  <Class DvbParser$PageRegion>
	//   93  203:astore_1        
			i = sparsearray.keyAt(j);
	//   94  204:aload           14
	//   95  206:iload           5
	//   96  208:invokevirtual   #432 <Method int SparseArray.keyAt(int)>
	//   97  211:istore_2        
			RegionComposition regioncomposition = (RegionComposition)subtitleService.regions.get(i);
	//   98  212:aload_0         
	//   99  213:getfield        #180 <Field DvbParser$SubtitleService subtitleService>
	//  100  216:getfield        #356 <Field SparseArray DvbParser$SubtitleService.regions>
	//  101  219:iload_2         
	//  102  220:invokevirtual   #361 <Method Object SparseArray.get(int)>
	//  103  223:checkcast       #21  <Class DvbParser$RegionComposition>
	//  104  226:astore          15
			int k = ((PageRegion) (abyte0)).horizontalAddress + displaydefinition.horizontalPositionMinimum;
	//  105  228:aload_1         
	//  106  229:getfield        #435 <Field int DvbParser$PageRegion.horizontalAddress>
	//  107  232:aload           9
	//  108  234:getfield        #438 <Field int DvbParser$DisplayDefinition.horizontalPositionMinimum>
	//  109  237:iadd            
	//  110  238:istore          6
			int l = ((PageRegion) (abyte0)).verticalAddress + displaydefinition.verticalPositionMinimum;
	//  111  240:aload_1         
	//  112  241:getfield        #441 <Field int DvbParser$PageRegion.verticalAddress>
	//  113  244:aload           9
	//  114  246:getfield        #444 <Field int DvbParser$DisplayDefinition.verticalPositionMinimum>
	//  115  249:iadd            
	//  116  250:istore          7
			i = Math.min(regioncomposition.width + k, displaydefinition.horizontalPositionMaximum);
	//  117  252:aload           15
	//  118  254:getfield        #445 <Field int DvbParser$RegionComposition.width>
	//  119  257:iload           6
	//  120  259:iadd            
	//  121  260:aload           9
	//  122  262:getfield        #448 <Field int DvbParser$DisplayDefinition.horizontalPositionMaximum>
	//  123  265:invokestatic    #454 <Method int Math.min(int, int)>
	//  124  268:istore_2        
			int i1 = Math.min(regioncomposition.height + l, displaydefinition.verticalPositionMaximum);
	//  125  269:aload           15
	//  126  271:getfield        #455 <Field int DvbParser$RegionComposition.height>
	//  127  274:iload           7
	//  128  276:iadd            
	//  129  277:aload           9
	//  130  279:getfield        #458 <Field int DvbParser$DisplayDefinition.verticalPositionMaximum>
	//  131  282:invokestatic    #454 <Method int Math.min(int, int)>
	//  132  285:istore          8
			abyte0 = ((byte []) (canvas));
	//  133  287:aload_0         
	//  134  288:getfield        #156 <Field Canvas canvas>
	//  135  291:astore_1        
			float f = k;
	//  136  292:iload           6
	//  137  294:i2f             
	//  138  295:fstore_3        
			float f1 = l;
	//  139  296:iload           7
	//  140  298:i2f             
	//  141  299:fstore          4
			((Canvas) (abyte0)).clipRect(f, f1, i, i1, android.graphics.Region.Op.REPLACE);
	//  142  301:aload_1         
	//  143  302:fload_3         
	//  144  303:fload           4
	//  145  305:iload_2         
	//  146  306:i2f             
	//  147  307:iload           8
	//  148  309:i2f             
	//  149  310:getstatic       #464 <Field android.graphics.Region$Op android.graphics.Region$Op.REPLACE>
	//  150  313:invokevirtual   #468 <Method boolean Canvas.clipRect(float, float, float, float, android.graphics.Region$Op)>
	//  151  316:pop             
			Object obj = ((Object) ((ClutDefinition)subtitleService.cluts.get(regioncomposition.clutId)));
	//  152  317:aload_0         
	//  153  318:getfield        #180 <Field DvbParser$SubtitleService subtitleService>
	//  154  321:getfield        #340 <Field SparseArray DvbParser$SubtitleService.cluts>
	//  155  324:aload           15
	//  156  326:getfield        #471 <Field int DvbParser$RegionComposition.clutId>
	//  157  329:invokevirtual   #361 <Method Object SparseArray.get(int)>
	//  158  332:checkcast       #6   <Class DvbParser$ClutDefinition>
	//  159  335:astore          10
			abyte0 = ((byte []) (obj));
	//  160  337:aload           10
	//  161  339:astore_1        
			if(obj == null)
	//* 162  340:aload           10
	//* 163  342:ifnonnull       378
			{
				obj = ((Object) ((ClutDefinition)subtitleService.ancillaryCluts.get(regioncomposition.clutId)));
	//  164  345:aload_0         
	//  165  346:getfield        #180 <Field DvbParser$SubtitleService subtitleService>
	//  166  349:getfield        #344 <Field SparseArray DvbParser$SubtitleService.ancillaryCluts>
	//  167  352:aload           15
	//  168  354:getfield        #471 <Field int DvbParser$RegionComposition.clutId>
	//  169  357:invokevirtual   #361 <Method Object SparseArray.get(int)>
	//  170  360:checkcast       #6   <Class DvbParser$ClutDefinition>
	//  171  363:astore          10
				abyte0 = ((byte []) (obj));
	//  172  365:aload           10
	//  173  367:astore_1        
				if(obj == null)
	//* 174  368:aload           10
	//* 175  370:ifnonnull       378
					abyte0 = ((byte []) (defaultClutDefinition));
	//  176  373:aload_0         
	//  177  374:getfield        #176 <Field DvbParser$ClutDefinition defaultClutDefinition>
	//  178  377:astore_1        
			}
			obj = ((Object) (regioncomposition.regionObjects));
	//  179  378:aload           15
	//  180  380:getfield        #474 <Field SparseArray DvbParser$RegionComposition.regionObjects>
	//  181  383:astore          10
			for(i = 0; i < ((SparseArray) (obj)).size(); i++)
	//* 182  385:iconst_0        
	//* 183  386:istore_2        
	//* 184  387:iload_2         
	//* 185  388:aload           10
	//* 186  390:invokevirtual   #426 <Method int SparseArray.size()>
	//* 187  393:icmpge          528
			{
				int j1 = ((SparseArray) (obj)).keyAt(i);
	//  188  396:aload           10
	//  189  398:iload_2         
	//  190  399:invokevirtual   #432 <Method int SparseArray.keyAt(int)>
	//  191  402:istore          8
				RegionObject regionobject = (RegionObject)((SparseArray) (obj)).valueAt(i);
	//  192  404:aload           10
	//  193  406:iload_2         
	//  194  407:invokevirtual   #429 <Method Object SparseArray.valueAt(int)>
	//  195  410:checkcast       #24  <Class DvbParser$RegionObject>
	//  196  413:astore          16
				ObjectData objectdata = (ObjectData)subtitleService.objects.get(j1);
	//  197  415:aload_0         
	//  198  416:getfield        #180 <Field DvbParser$SubtitleService subtitleService>
	//  199  419:getfield        #326 <Field SparseArray DvbParser$SubtitleService.objects>
	//  200  422:iload           8
	//  201  424:invokevirtual   #361 <Method Object SparseArray.get(int)>
	//  202  427:checkcast       #12  <Class DvbParser$ObjectData>
	//  203  430:astore          11
				if(objectdata == null)
	//* 204  432:aload           11
	//* 205  434:ifnonnull       457
					objectdata = (ObjectData)subtitleService.ancillaryObjects.get(j1);
	//  206  437:aload_0         
	//  207  438:getfield        #180 <Field DvbParser$SubtitleService subtitleService>
	//  208  441:getfield        #335 <Field SparseArray DvbParser$SubtitleService.ancillaryObjects>
	//  209  444:iload           8
	//  210  446:invokevirtual   #361 <Method Object SparseArray.get(int)>
	//  211  449:checkcast       #12  <Class DvbParser$ObjectData>
	//  212  452:astore          11
	//* 213  454:goto            457
				if(objectdata == null)
					continue;
	//  214  457:aload           11
	//  215  459:ifnull          521
				Paint paint;
				if(objectdata.nonModifyingColorFlag)
	//* 216  462:aload           11
	//* 217  464:getfield        #478 <Field boolean DvbParser$ObjectData.nonModifyingColorFlag>
	//* 218  467:ifeq            476
					paint = null;
	//  219  470:aconst_null     
	//  220  471:astore          12
				else
	//* 221  473:goto            485
					paint = defaultPaint;
	//  222  476:aload_0         
	//  223  477:getfield        #114 <Field Paint defaultPaint>
	//  224  480:astore          12
	//* 225  482:goto            473
				paintPixelDataSubBlocks(objectdata, ((ClutDefinition) (abyte0)), regioncomposition.depth, regionobject.horizontalPosition + k, l + regionobject.verticalPosition, paint, canvas);
	//  226  485:aload           11
	//  227  487:aload_1         
	//  228  488:aload           15
	//  229  490:getfield        #481 <Field int DvbParser$RegionComposition.depth>
	//  230  493:aload           16
	//  231  495:getfield        #484 <Field int DvbParser$RegionObject.horizontalPosition>
	//  232  498:iload           6
	//  233  500:iadd            
	//  234  501:iload           7
	//  235  503:aload           16
	//  236  505:getfield        #487 <Field int DvbParser$RegionObject.verticalPosition>
	//  237  508:iadd            
	//  238  509:aload           12
	//  239  511:aload_0         
	//  240  512:getfield        #156 <Field Canvas canvas>
	//  241  515:invokestatic    #489 <Method void paintPixelDataSubBlocks(DvbParser$ObjectData, DvbParser$ClutDefinition, int, int, int, Paint, Canvas)>
			}

	//  242  518:goto            521
	//  243  521:iload_2         
	//  244  522:iconst_1        
	//  245  523:iadd            
	//  246  524:istore_2        
	//* 247  525:goto            387
			if(regioncomposition.fillFlag)
	//* 248  528:aload           15
	//* 249  530:getfield        #492 <Field boolean DvbParser$RegionComposition.fillFlag>
	//* 250  533:ifeq            633
			{
				if(regioncomposition.depth == 3)
	//* 251  536:aload           15
	//* 252  538:getfield        #481 <Field int DvbParser$RegionComposition.depth>
	//* 253  541:iconst_3        
	//* 254  542:icmpne          559
					i = ((ClutDefinition) (abyte0)).clutEntries8Bit[regioncomposition.pixelCode8Bit];
	//  255  545:aload_1         
	//  256  546:getfield        #236 <Field int[] DvbParser$ClutDefinition.clutEntries8Bit>
	//  257  549:aload           15
	//  258  551:getfield        #495 <Field int DvbParser$RegionComposition.pixelCode8Bit>
	//  259  554:iaload          
	//  260  555:istore_2        
				else
	//* 261  556:goto            593
				if(regioncomposition.depth == 2)
	//* 262  559:aload           15
	//* 263  561:getfield        #481 <Field int DvbParser$RegionComposition.depth>
	//* 264  564:iconst_2        
	//* 265  565:icmpne          582
					i = ((ClutDefinition) (abyte0)).clutEntries4Bit[regioncomposition.pixelCode4Bit];
	//  266  568:aload_1         
	//  267  569:getfield        #239 <Field int[] DvbParser$ClutDefinition.clutEntries4Bit>
	//  268  572:aload           15
	//  269  574:getfield        #498 <Field int DvbParser$RegionComposition.pixelCode4Bit>
	//  270  577:iaload          
	//  271  578:istore_2        
				else
	//* 272  579:goto            593
					i = ((ClutDefinition) (abyte0)).clutEntries2Bit[regioncomposition.pixelCode2Bit];
	//  273  582:aload_1         
	//  274  583:getfield        #242 <Field int[] DvbParser$ClutDefinition.clutEntries2Bit>
	//  275  586:aload           15
	//  276  588:getfield        #501 <Field int DvbParser$RegionComposition.pixelCode2Bit>
	//  277  591:iaload          
	//  278  592:istore_2        
				fillRegionPaint.setColor(i);
	//  279  593:aload_0         
	//  280  594:getfield        #145 <Field Paint fillRegionPaint>
	//  281  597:iload_2         
	//  282  598:invokevirtual   #204 <Method void Paint.setColor(int)>
				canvas.drawRect(f, f1, regioncomposition.width + k, regioncomposition.height + l, fillRegionPaint);
	//  283  601:aload_0         
	//  284  602:getfield        #156 <Field Canvas canvas>
	//  285  605:fload_3         
	//  286  606:fload           4
	//  287  608:aload           15
	//  288  610:getfield        #445 <Field int DvbParser$RegionComposition.width>
	//  289  613:iload           6
	//  290  615:iadd            
	//  291  616:i2f             
	//  292  617:aload           15
	//  293  619:getfield        #455 <Field int DvbParser$RegionComposition.height>
	//  294  622:iload           7
	//  295  624:iadd            
	//  296  625:i2f             
	//  297  626:aload_0         
	//  298  627:getfield        #145 <Field Paint fillRegionPaint>
	//  299  630:invokevirtual   #208 <Method void Canvas.drawRect(float, float, float, float, Paint)>
			}
			((List) (arraylist)).add(((Object) (new Cue(Bitmap.createBitmap(bitmap, k, l, regioncomposition.width, regioncomposition.height), f / (float)displaydefinition.width, 0, f1 / (float)displaydefinition.height, 0, (float)regioncomposition.width / (float)displaydefinition.width, (float)regioncomposition.height / (float)displaydefinition.height))));
	//  300  633:aload           13
	//  301  635:new             #503 <Class Cue>
	//  302  638:dup             
	//  303  639:aload_0         
	//  304  640:getfield        #391 <Field Bitmap bitmap>
	//  305  643:iload           6
	//  306  645:iload           7
	//  307  647:aload           15
	//  308  649:getfield        #445 <Field int DvbParser$RegionComposition.width>
	//  309  652:aload           15
	//  310  654:getfield        #455 <Field int DvbParser$RegionComposition.height>
	//  311  657:invokestatic    #506 <Method Bitmap Bitmap.createBitmap(Bitmap, int, int, int, int)>
	//  312  660:fload_3         
	//  313  661:aload           9
	//  314  663:getfield        #394 <Field int DvbParser$DisplayDefinition.width>
	//  315  666:i2f             
	//  316  667:fdiv            
	//  317  668:iconst_0        
	//  318  669:fload           4
	//  319  671:aload           9
	//  320  673:getfield        #402 <Field int DvbParser$DisplayDefinition.height>
	//  321  676:i2f             
	//  322  677:fdiv            
	//  323  678:iconst_0        
	//  324  679:aload           15
	//  325  681:getfield        #445 <Field int DvbParser$RegionComposition.width>
	//  326  684:i2f             
	//  327  685:aload           9
	//  328  687:getfield        #394 <Field int DvbParser$DisplayDefinition.width>
	//  329  690:i2f             
	//  330  691:fdiv            
	//  331  692:aload           15
	//  332  694:getfield        #455 <Field int DvbParser$RegionComposition.height>
	//  333  697:i2f             
	//  334  698:aload           9
	//  335  700:getfield        #402 <Field int DvbParser$DisplayDefinition.height>
	//  336  703:i2f             
	//  337  704:fdiv            
	//  338  705:invokespecial   #509 <Method void Cue(Bitmap, float, int, float, int, float, float)>
	//  339  708:invokeinterface #515 <Method boolean List.add(Object)>
	//  340  713:pop             
			canvas.drawColor(0, android.graphics.PorterDuff.Mode.CLEAR);
	//  341  714:aload_0         
	//  342  715:getfield        #156 <Field Canvas canvas>
	//  343  718:iconst_0        
	//  344  719:getstatic       #518 <Field android.graphics.PorterDuff$Mode android.graphics.PorterDuff$Mode.CLEAR>
	//  345  722:invokevirtual   #522 <Method void Canvas.drawColor(int, android.graphics.PorterDuff$Mode)>
		}

	//  346  725:iload           5
	//  347  727:iconst_1        
	//  348  728:iadd            
	//  349  729:istore          5
	//* 350  731:goto            183
		return ((List) (arraylist));
	//  351  734:aload           13
	//  352  736:areturn         
	}

	public void reset()
	{
		subtitleService.reset();
	//    0    0:aload_0         
	//    1    1:getfield        #180 <Field DvbParser$SubtitleService subtitleService>
	//    2    4:invokevirtual   #527 <Method void DvbParser$SubtitleService.reset()>
	//    3    7:return          
	}

	private static final int DATA_TYPE_24_TABLE_DATA = 32;
	private static final int DATA_TYPE_28_TABLE_DATA = 33;
	private static final int DATA_TYPE_2BP_CODE_STRING = 16;
	private static final int DATA_TYPE_48_TABLE_DATA = 34;
	private static final int DATA_TYPE_4BP_CODE_STRING = 17;
	private static final int DATA_TYPE_8BP_CODE_STRING = 18;
	private static final int DATA_TYPE_END_LINE = 240;
	private static final int OBJECT_CODING_PIXELS = 0;
	private static final int OBJECT_CODING_STRING = 1;
	private static final int PAGE_STATE_NORMAL = 0;
	private static final int REGION_DEPTH_4_BIT = 2;
	private static final int REGION_DEPTH_8_BIT = 3;
	private static final int SEGMENT_TYPE_CLUT_DEFINITION = 18;
	private static final int SEGMENT_TYPE_DISPLAY_DEFINITION = 20;
	private static final int SEGMENT_TYPE_OBJECT_DATA = 19;
	private static final int SEGMENT_TYPE_PAGE_COMPOSITION = 16;
	private static final int SEGMENT_TYPE_REGION_COMPOSITION = 17;
	private static final String TAG = "DvbParser";
	private static final byte defaultMap2To4[] = {
		0, 7, 8, 15
	};
	private static final byte defaultMap2To8[] = {
		0, 119, -120, -1
	};
	private static final byte defaultMap4To8[] = {
		0, 17, 34, 51, 68, 85, 102, 119, -120, -103, 
		-86, -69, -52, -35, -18, -1
	};
	private Bitmap bitmap;
	private final Canvas canvas = new Canvas();
	private final ClutDefinition defaultClutDefinition = new ClutDefinition(0, generateDefault2BitClutEntries(), generateDefault4BitClutEntries(), generateDefault8BitClutEntries());
	private final DisplayDefinition defaultDisplayDefinition = new DisplayDefinition(719, 575, 0, 719, 0, 575);
	private final Paint defaultPaint = new Paint();
	private final Paint fillRegionPaint = new Paint();
	private final SubtitleService subtitleService;

	static 
	{
	//    0    0:iconst_4        
	//    1    1:newarray        byte[]
	//    2    3:dup             
	//    3    4:iconst_0        
	//    4    5:ldc1            #45  <Int 0>
	//    5    7:bastore         
	//    6    8:dup             
	//    7    9:iconst_1        
	//    8   10:ldc1            #83  <Int 7>
	//    9   12:bastore         
	//   10   13:dup             
	//   11   14:iconst_2        
	//   12   15:ldc1            #84  <Int 8>
	//   13   17:bastore         
	//   14   18:dup             
	//   15   19:iconst_3        
	//   16   20:ldc1            #85  <Int 15>
	//   17   22:bastore         
	//   18   23:putstatic       #87  <Field byte[] defaultMap2To4>
	//   19   26:iconst_4        
	//   20   27:newarray        byte[]
	//   21   29:dup             
	//   22   30:iconst_0        
	//   23   31:ldc1            #45  <Int 0>
	//   24   33:bastore         
	//   25   34:dup             
	//   26   35:iconst_1        
	//   27   36:ldc1            #88  <Int 119>
	//   28   38:bastore         
	//   29   39:dup             
	//   30   40:iconst_2        
	//   31   41:ldc1            #89  <Int -120>
	//   32   43:bastore         
	//   33   44:dup             
	//   34   45:iconst_3        
	//   35   46:ldc1            #90  <Int -1>
	//   36   48:bastore         
	//   37   49:putstatic       #92  <Field byte[] defaultMap2To8>
	//   38   52:bipush          16
	//   39   54:newarray        byte[]
	//   40   56:dup             
	//   41   57:iconst_0        
	//   42   58:ldc1            #45  <Int 0>
	//   43   60:bastore         
	//   44   61:dup             
	//   45   62:iconst_1        
	//   46   63:ldc1            #39  <Int 17>
	//   47   65:bastore         
	//   48   66:dup             
	//   49   67:iconst_2        
	//   50   68:ldc1            #37  <Int 34>
	//   51   70:bastore         
	//   52   71:dup             
	//   53   72:iconst_3        
	//   54   73:ldc1            #93  <Int 51>
	//   55   75:bastore         
	//   56   76:dup             
	//   57   77:iconst_4        
	//   58   78:ldc1            #94  <Int 68>
	//   59   80:bastore         
	//   60   81:dup             
	//   61   82:iconst_5        
	//   62   83:ldc1            #95  <Int 85>
	//   63   85:bastore         
	//   64   86:dup             
	//   65   87:bipush          6
	//   66   89:ldc1            #96  <Int 102>
	//   67   91:bastore         
	//   68   92:dup             
	//   69   93:bipush          7
	//   70   95:ldc1            #88  <Int 119>
	//   71   97:bastore         
	//   72   98:dup             
	//   73   99:bipush          8
	//   74  101:ldc1            #89  <Int -120>
	//   75  103:bastore         
	//   76  104:dup             
	//   77  105:bipush          9
	//   78  107:ldc1            #97  <Int -103>
	//   79  109:bastore         
	//   80  110:dup             
	//   81  111:bipush          10
	//   82  113:ldc1            #98  <Int -86>
	//   83  115:bastore         
	//   84  116:dup             
	//   85  117:bipush          11
	//   86  119:ldc1            #99  <Int -69>
	//   87  121:bastore         
	//   88  122:dup             
	//   89  123:bipush          12
	//   90  125:ldc1            #100 <Int -52>
	//   91  127:bastore         
	//   92  128:dup             
	//   93  129:bipush          13
	//   94  131:ldc1            #101 <Int -35>
	//   95  133:bastore         
	//   96  134:dup             
	//   97  135:bipush          14
	//   98  137:ldc1            #102 <Int -18>
	//   99  139:bastore         
	//  100  140:dup             
	//  101  141:bipush          15
	//  102  143:ldc1            #90  <Int -1>
	//  103  145:bastore         
	//  104  146:putstatic       #104 <Field byte[] defaultMap4To8>
	//* 105  149:return          
	}
}
