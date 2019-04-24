// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.autonavi.ae.gmap.gloverlay;

import android.util.SparseArray;
import com.amap.api.mapcore.util.s;
import com.autonavi.ae.gmap.GLMapEngine;
import java.util.ArrayList;
import java.util.List;

// Referenced classes of package com.autonavi.ae.gmap.gloverlay:
//			BaseMapOverlay, GLOverlay, GLOverlayTexture

public class GLOverlayBundle
{
	public static class GLAmapFocusHits
	{

		public long mHitedIndex;
		public long mHitedTimes;
		public long mOverlayHashCode;

		public GLAmapFocusHits()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #15  <Method void Object()>
			mOverlayHashCode = 0L;
		//    2    4:aload_0         
		//    3    5:lconst_0        
		//    4    6:putfield        #17  <Field long mOverlayHashCode>
			mHitedIndex = 0L;
		//    5    9:aload_0         
		//    6   10:lconst_0        
		//    7   11:putfield        #19  <Field long mHitedIndex>
			mHitedTimes = 1000L;
		//    8   14:aload_0         
		//    9   15:ldc2w           #20  <Long 1000L>
		//   10   18:putfield        #23  <Field long mHitedTimes>
		//   11   21:return          
		}
	}


	public GLOverlayBundle(int i, s s1)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #25  <Method void Object()>
	//    2    4:aload_0         
	//    3    5:new             #27  <Class ArrayList>
	//    4    8:dup             
	//    5    9:invokespecial   #28  <Method void ArrayList()>
	//    6   12:putfield        #30  <Field List mOverlayList>
		mGLMapView = null;
	//    7   15:aload_0         
	//    8   16:aconst_null     
	//    9   17:putfield        #32  <Field s mGLMapView>
		mNativeInstance = 0L;
	//   10   20:aload_0         
	//   11   21:lconst_0        
	//   12   22:putfield        #34  <Field long mNativeInstance>
		mTextureCaches = new SparseArray();
	//   13   25:aload_0         
	//   14   26:new             #36  <Class SparseArray>
	//   15   29:dup             
	//   16   30:invokespecial   #37  <Method void SparseArray()>
	//   17   33:putfield        #39  <Field SparseArray mTextureCaches>
		mEngineID = i;
	//   18   36:aload_0         
	//   19   37:iload_1         
	//   20   38:putfield        #41  <Field int mEngineID>
		mGLMapView = s1;
	//   21   41:aload_0         
	//   22   42:aload_2         
	//   23   43:putfield        #32  <Field s mGLMapView>
		mNativeInstance = s1.a().getGlOverlayMgrPtr(mEngineID);
	//   24   46:aload_0         
	//   25   47:aload_2         
	//   26   48:invokeinterface #47  <Method GLMapEngine s.a()>
	//   27   53:aload_0         
	//   28   54:getfield        #41  <Field int mEngineID>
	//   29   57:invokevirtual   #53  <Method long GLMapEngine.getGlOverlayMgrPtr(int)>
	//   30   60:putfield        #34  <Field long mNativeInstance>
	//   31   63:return          
	}

	private int getOverlyExType(BaseMapOverlay basemapoverlay)
	{
		return 0;
	//    0    0:iconst_0        
	//    1    1:ireturn         
	}

	public static void intClr2PVRClr(float af[], int i)
	{
		af[2] = (float)(i & 0xff) / 255F;
	//    0    0:aload_0         
	//    1    1:iconst_2        
	//    2    2:iload_1         
	//    3    3:sipush          255
	//    4    6:iand            
	//    5    7:i2f             
	//    6    8:ldc1            #61  <Float 255F>
	//    7   10:fdiv            
	//    8   11:fastore         
		af[1] = (float)(i >> 8 & 0xff) / 255F;
	//    9   12:aload_0         
	//   10   13:iconst_1        
	//   11   14:iload_1         
	//   12   15:bipush          8
	//   13   17:ishr            
	//   14   18:sipush          255
	//   15   21:iand            
	//   16   22:i2f             
	//   17   23:ldc1            #61  <Float 255F>
	//   18   25:fdiv            
	//   19   26:fastore         
		af[0] = (float)(i >> 16 & 0xff) / 255F;
	//   20   27:aload_0         
	//   21   28:iconst_0        
	//   22   29:iload_1         
	//   23   30:bipush          16
	//   24   32:ishr            
	//   25   33:sipush          255
	//   26   36:iand            
	//   27   37:i2f             
	//   28   38:ldc1            #61  <Float 255F>
	//   29   40:fdiv            
	//   30   41:fastore         
		af[3] = (float)(i >> 24 & 0xff) / 255F;
	//   31   42:aload_0         
	//   32   43:iconst_3        
	//   33   44:iload_1         
	//   34   45:bipush          24
	//   35   47:ishr            
	//   36   48:sipush          255
	//   37   51:iand            
	//   38   52:i2f             
	//   39   53:ldc1            #61  <Float 255F>
	//   40   55:fdiv            
	//   41   56:fastore         
	//   42   57:return          
	}

	private static native void nativeAddGLOverlay(long l, long l1, long l2);

	private static native void nativeAddGLOverlayEx(long l, long l1, long l2, int i);

	private static native void nativeClearAllGLOverlay(long l, boolean flag);

	private static native boolean nativeOnSingleTapLineOverlay(long l, int i, int j, long al[]);

	private static native boolean nativeOnSingleTapPointOverlay(long l, int i, int j, long al[]);

	private static native void nativeRemoveGLOverlay(long l, long l1);

	private static native void nativeRemoveGLOverlayEx(long l, long l1, int i);

	private static native void nativeSortAllGLOverlay(long l);

	public void addOverlay(BaseMapOverlay basemapoverlay)
	{
		if(basemapoverlay == null)
	//*   0    0:aload_1         
	//*   1    1:ifnonnull       5
			return;
	//    2    4:return          
		nativeAddGLOverlay(mNativeInstance, basemapoverlay.getGLOverlay().getNativeInstatnce(), basemapoverlay.getGLOverlay().getCode());
	//    3    5:aload_0         
	//    4    6:getfield        #34  <Field long mNativeInstance>
	//    5    9:aload_1         
	//    6   10:invokevirtual   #84  <Method GLOverlay BaseMapOverlay.getGLOverlay()>
	//    7   13:invokevirtual   #90  <Method long GLOverlay.getNativeInstatnce()>
	//    8   16:aload_1         
	//    9   17:invokevirtual   #84  <Method GLOverlay BaseMapOverlay.getGLOverlay()>
	//   10   20:invokevirtual   #94  <Method int GLOverlay.getCode()>
	//   11   23:i2l             
	//   12   24:invokestatic    #96  <Method void nativeAddGLOverlay(long, long, long)>
		basemapoverlay.getGLOverlay().mIsInBundle = true;
	//   13   27:aload_1         
	//   14   28:invokevirtual   #84  <Method GLOverlay BaseMapOverlay.getGLOverlay()>
	//   15   31:iconst_1        
	//   16   32:putfield        #100 <Field boolean GLOverlay.mIsInBundle>
		List list = mOverlayList;
	//   17   35:aload_0         
	//   18   36:getfield        #30  <Field List mOverlayList>
	//   19   39:astore_2        
		list;
	//   20   40:aload_2         
		JVM INSTR monitorenter ;
	//   21   41:monitorenter    
		mOverlayList.add(((Object) (basemapoverlay)));
	//   22   42:aload_0         
	//   23   43:getfield        #30  <Field List mOverlayList>
	//   24   46:aload_1         
	//   25   47:invokeinterface #106 <Method boolean List.add(Object)>
	//   26   52:pop             
		list;
	//   27   53:aload_2         
		JVM INSTR monitorexit ;
	//   28   54:monitorexit     
		return;
	//   29   55:return          
		basemapoverlay;
	//   30   56:astore_1        
	//*  31   57:aload_2         
		throw basemapoverlay;
	//   32   58:monitorexit     
	//   33   59:aload_1         
	//   34   60:athrow          
	}

	public boolean addOverlayTextureItem(int i, int j, float f, float f1, int k, int l)
	{
		GLOverlayTexture gloverlaytexture = new GLOverlayTexture(i, j, f, f1, k, l);
	//    0    0:new             #111 <Class GLOverlayTexture>
	//    1    3:dup             
	//    2    4:iload_1         
	//    3    5:iload_2         
	//    4    6:fload_3         
	//    5    7:fload           4
	//    6    9:iload           5
	//    7   11:iload           6
	//    8   13:invokespecial   #114 <Method void GLOverlayTexture(int, int, float, float, int, int)>
	//    9   16:astore          8
		SparseArray sparsearray = mTextureCaches;
	//   10   18:aload_0         
	//   11   19:getfield        #39  <Field SparseArray mTextureCaches>
	//   12   22:astore          7
		sparsearray;
	//   13   24:aload           7
		JVM INSTR monitorenter ;
	//   14   26:monitorenter    
		mTextureCaches.put(i, ((Object) (gloverlaytexture)));
	//   15   27:aload_0         
	//   16   28:getfield        #39  <Field SparseArray mTextureCaches>
	//   17   31:iload_1         
	//   18   32:aload           8
	//   19   34:invokevirtual   #118 <Method void SparseArray.put(int, Object)>
		sparsearray;
	//   20   37:aload           7
		JVM INSTR monitorexit ;
	//   21   39:monitorexit     
		  goto _L1
	//*  22   40:goto            51
		Exception exception;
		exception;
	//   23   43:astore          8
	//*  24   45:aload           7
		throw exception;
	//   25   47:monitorexit     
	//   26   48:aload           8
	//   27   50:athrow          
_L1:
		return true;
	//   28   51:iconst_1        
	//   29   52:ireturn         
	}

	public boolean addOverlayTextureItem(int i, int j, int k, int l)
	{
		GLOverlayTexture gloverlaytexture = new GLOverlayTexture(i, j, k, l);
	//    0    0:new             #111 <Class GLOverlayTexture>
	//    1    3:dup             
	//    2    4:iload_1         
	//    3    5:iload_2         
	//    4    6:iload_3         
	//    5    7:iload           4
	//    6    9:invokespecial   #122 <Method void GLOverlayTexture(int, int, int, int)>
	//    7   12:astore          6
		SparseArray sparsearray = mTextureCaches;
	//    8   14:aload_0         
	//    9   15:getfield        #39  <Field SparseArray mTextureCaches>
	//   10   18:astore          5
		sparsearray;
	//   11   20:aload           5
		JVM INSTR monitorenter ;
	//   12   22:monitorenter    
		mTextureCaches.put(i, ((Object) (gloverlaytexture)));
	//   13   23:aload_0         
	//   14   24:getfield        #39  <Field SparseArray mTextureCaches>
	//   15   27:iload_1         
	//   16   28:aload           6
	//   17   30:invokevirtual   #118 <Method void SparseArray.put(int, Object)>
		sparsearray;
	//   18   33:aload           5
		JVM INSTR monitorexit ;
	//   19   35:monitorexit     
		  goto _L1
	//*  20   36:goto            47
		Exception exception;
		exception;
	//   21   39:astore          6
	//*  22   41:aload           5
		throw exception;
	//   23   43:monitorexit     
	//   24   44:aload           6
	//   25   46:athrow          
_L1:
		return true;
	//   26   47:iconst_1        
	//   27   48:ireturn         
	}

	public long checkSingleTapOnLine(int i, int j)
	{
		long al[] = new long[3];
	//    0    0:iconst_3        
	//    1    1:newarray        long[]
	//    2    3:astore_3        
		if(nativeOnSingleTapLineOverlay(mNativeInstance, i, j, al))
	//*   3    4:aload_0         
	//*   4    5:getfield        #34  <Field long mNativeInstance>
	//*   5    8:iload_1         
	//*   6    9:iload_2         
	//*   7   10:aload_3         
	//*   8   11:invokestatic    #126 <Method boolean nativeOnSingleTapLineOverlay(long, int, int, long[])>
	//*   9   14:ifeq            21
			return al[0];
	//   10   17:aload_3         
	//   11   18:iconst_0        
	//   12   19:laload          
	//   13   20:lreturn         
		else
			return -1L;
	//   14   21:ldc2w           #127 <Long -1L>
	//   15   24:lreturn         
	}

	public long checkSingleTapOnPoint(int i, int j)
	{
		long al[] = new long[3];
	//    0    0:iconst_3        
	//    1    1:newarray        long[]
	//    2    3:astore_3        
		if(nativeOnSingleTapPointOverlay(mNativeInstance, i, j, al))
	//*   3    4:aload_0         
	//*   4    5:getfield        #34  <Field long mNativeInstance>
	//*   5    8:iload_1         
	//*   6    9:iload_2         
	//*   7   10:aload_3         
	//*   8   11:invokestatic    #131 <Method boolean nativeOnSingleTapPointOverlay(long, int, int, long[])>
	//*   9   14:ifeq            21
			return al[0];
	//   10   17:aload_3         
	//   11   18:iconst_0        
	//   12   19:laload          
	//   13   20:lreturn         
		else
			return -1L;
	//   14   21:ldc2w           #127 <Long -1L>
	//   15   24:lreturn         
	}

	public void clearFocus()
	{
		if(mOverlayList == null)
			break MISSING_BLOCK_LABEL_66;
	//    0    0:aload_0         
	//    1    1:getfield        #30  <Field List mOverlayList>
	//    2    4:ifnull          66
		List list = mOverlayList;
	//    3    7:aload_0         
	//    4    8:getfield        #30  <Field List mOverlayList>
	//    5   11:astore_2        
		list;
	//    6   12:aload_2         
		JVM INSTR monitorenter ;
	//    7   13:monitorenter    
		int i = 0;
	//    8   14:iconst_0        
	//    9   15:istore_1        
_L2:
		BaseMapOverlay basemapoverlay;
		if(i >= mOverlayList.size())
			break; /* Loop/switch isn't completed */
	//   10   16:iload_1         
	//   11   17:aload_0         
	//   12   18:getfield        #30  <Field List mOverlayList>
	//   13   21:invokeinterface #135 <Method int List.size()>
	//   14   26:icmpge          58
		basemapoverlay = (BaseMapOverlay)mOverlayList.get(i);
	//   15   29:aload_0         
	//   16   30:getfield        #30  <Field List mOverlayList>
	//   17   33:iload_1         
	//   18   34:invokeinterface #139 <Method Object List.get(int)>
	//   19   39:checkcast       #80  <Class BaseMapOverlay>
	//   20   42:astore_3        
		if(basemapoverlay == null)
			break MISSING_BLOCK_LABEL_51;
	//   21   43:aload_3         
	//   22   44:ifnull          51
		basemapoverlay.clearFocus();
	//   23   47:aload_3         
	//   24   48:invokevirtual   #141 <Method void BaseMapOverlay.clearFocus()>
		i++;
	//   25   51:iload_1         
	//   26   52:iconst_1        
	//   27   53:iadd            
	//   28   54:istore_1        
		if(true) goto _L2; else goto _L1
	//   29   55:goto            16
	//*  30   58:aload_2         
_L1:
		return;
	//   31   59:monitorexit     
	//   32   60:return          
		Exception exception;
		exception;
	//   33   61:astore_3        
	//*  34   62:aload_2         
		throw exception;
	//   35   63:monitorexit     
	//   36   64:aload_3         
	//   37   65:athrow          
	//   38   66:return          
	}

	public void clearOverlayTexture()
	{
		SparseArray sparsearray = mTextureCaches;
	//    0    0:aload_0         
	//    1    1:getfield        #39  <Field SparseArray mTextureCaches>
	//    2    4:astore_1        
		sparsearray;
	//    3    5:aload_1         
		JVM INSTR monitorenter ;
	//    4    6:monitorenter    
		mTextureCaches.clear();
	//    5    7:aload_0         
	//    6    8:getfield        #39  <Field SparseArray mTextureCaches>
	//    7   11:invokevirtual   #145 <Method void SparseArray.clear()>
		sparsearray;
	//    8   14:aload_1         
		JVM INSTR monitorexit ;
	//    9   15:monitorexit     
		return;
	//   10   16:return          
		Exception exception;
		exception;
	//   11   17:astore_2        
	//*  12   18:aload_1         
		throw exception;
	//   13   19:monitorexit     
	//   14   20:aload_2         
	//   15   21:athrow          
	}

	public boolean cotainsOverlay(BaseMapOverlay basemapoverlay)
	{
		if(basemapoverlay == null)
	//*   0    0:aload_1         
	//*   1    1:ifnonnull       6
			return false;
	//    2    4:iconst_0        
	//    3    5:ireturn         
		List list = mOverlayList;
	//    4    6:aload_0         
	//    5    7:getfield        #30  <Field List mOverlayList>
	//    6   10:astore_3        
		list;
	//    7   11:aload_3         
		JVM INSTR monitorenter ;
	//    8   12:monitorenter    
		boolean flag = mOverlayList.contains(((Object) (basemapoverlay)));
	//    9   13:aload_0         
	//   10   14:getfield        #30  <Field List mOverlayList>
	//   11   17:aload_1         
	//   12   18:invokeinterface #150 <Method boolean List.contains(Object)>
	//   13   23:istore_2        
		list;
	//   14   24:aload_3         
		JVM INSTR monitorexit ;
	//   15   25:monitorexit     
		return flag;
	//   16   26:iload_2         
	//   17   27:ireturn         
		basemapoverlay;
	//   18   28:astore_1        
	//*  19   29:aload_3         
		throw basemapoverlay;
	//   20   30:monitorexit     
	//   21   31:aload_1         
	//   22   32:athrow          
	}

	public BaseMapOverlay getOverlay(int i)
	{
		List list = mOverlayList;
	//    0    0:aload_0         
	//    1    1:getfield        #30  <Field List mOverlayList>
	//    2    4:astore_3        
		list;
	//    3    5:aload_3         
		JVM INSTR monitorenter ;
	//    4    6:monitorenter    
		if(i < 0)
			break MISSING_BLOCK_LABEL_28;
	//    5    7:iload_1         
	//    6    8:iflt            28
		int j = mOverlayList.size();
	//    7   11:aload_0         
	//    8   12:getfield        #30  <Field List mOverlayList>
	//    9   15:invokeinterface #135 <Method int List.size()>
	//   10   20:istore_2        
		if(i <= j - 1)
			break MISSING_BLOCK_LABEL_32;
	//   11   21:iload_1         
	//   12   22:iload_2         
	//   13   23:iconst_1        
	//   14   24:isub            
	//   15   25:icmple          32
		list;
	//   16   28:aload_3         
		JVM INSTR monitorexit ;
	//   17   29:monitorexit     
		return null;
	//   18   30:aconst_null     
	//   19   31:areturn         
		BaseMapOverlay basemapoverlay = (BaseMapOverlay)mOverlayList.get(i);
	//   20   32:aload_0         
	//   21   33:getfield        #30  <Field List mOverlayList>
	//   22   36:iload_1         
	//   23   37:invokeinterface #139 <Method Object List.get(int)>
	//   24   42:checkcast       #80  <Class BaseMapOverlay>
	//   25   45:astore          4
		list;
	//   26   47:aload_3         
		JVM INSTR monitorexit ;
	//   27   48:monitorexit     
		return basemapoverlay;
	//   28   49:aload           4
	//   29   51:areturn         
		Exception exception;
		exception;
	//   30   52:astore          4
	//*  31   54:aload_3         
		throw exception;
	//   32   55:monitorexit     
	//   33   56:aload           4
	//   34   58:athrow          
	}

	public int getOverlayCount()
	{
		List list = mOverlayList;
	//    0    0:aload_0         
	//    1    1:getfield        #30  <Field List mOverlayList>
	//    2    4:astore_2        
		list;
	//    3    5:aload_2         
		JVM INSTR monitorenter ;
	//    4    6:monitorenter    
		int i = mOverlayList.size();
	//    5    7:aload_0         
	//    6    8:getfield        #30  <Field List mOverlayList>
	//    7   11:invokeinterface #135 <Method int List.size()>
	//    8   16:istore_1        
		list;
	//    9   17:aload_2         
		JVM INSTR monitorexit ;
	//   10   18:monitorexit     
		return i;
	//   11   19:iload_1         
	//   12   20:ireturn         
		Exception exception;
		exception;
	//   13   21:astore_3        
	//*  14   22:aload_2         
		throw exception;
	//   15   23:monitorexit     
	//   16   24:aload_3         
	//   17   25:athrow          
	}

	public GLOverlayTexture getOverlayTextureItem(int i)
	{
		SparseArray sparsearray = mTextureCaches;
	//    0    0:aload_0         
	//    1    1:getfield        #39  <Field SparseArray mTextureCaches>
	//    2    4:astore_2        
		sparsearray;
	//    3    5:aload_2         
		JVM INSTR monitorenter ;
	//    4    6:monitorenter    
		GLOverlayTexture gloverlaytexture = (GLOverlayTexture)mTextureCaches.get(i);
	//    5    7:aload_0         
	//    6    8:getfield        #39  <Field SparseArray mTextureCaches>
	//    7   11:iload_1         
	//    8   12:invokevirtual   #158 <Method Object SparseArray.get(int)>
	//    9   15:checkcast       #111 <Class GLOverlayTexture>
	//   10   18:astore_3        
		sparsearray;
	//   11   19:aload_2         
		JVM INSTR monitorexit ;
	//   12   20:monitorexit     
		return gloverlaytexture;
	//   13   21:aload_3         
	//   14   22:areturn         
		Exception exception;
		exception;
	//   15   23:astore_3        
	//*  16   24:aload_2         
		throw exception;
	//   17   25:monitorexit     
	//   18   26:aload_3         
	//   19   27:athrow          
	}

	public boolean onSingleTap(int i, int j, int k, int l)
	{
		boolean flag = false;
	//    0    0:iconst_0        
	//    1    1:istore          5
		if((l & 1) == 1)
	//*   2    3:iload           4
	//*   3    5:iconst_1        
	//*   4    6:iand            
	//*   5    7:iconst_1        
	//*   6    8:icmpne          20
			flag = onSingleTapPoints(i, j, k);
	//    7   11:aload_0         
	//    8   12:iload_1         
	//    9   13:iload_2         
	//   10   14:iload_3         
	//   11   15:invokevirtual   #163 <Method boolean onSingleTapPoints(int, int, int)>
	//   12   18:istore          5
		if(flag)
	//*  13   20:iload           5
	//*  14   22:ifeq            27
			return true;
	//   15   25:iconst_1        
	//   16   26:ireturn         
		if((l & 2) == 2)
	//*  17   27:iload           4
	//*  18   29:iconst_2        
	//*  19   30:iand            
	//*  20   31:iconst_2        
	//*  21   32:icmpne          44
			flag = onSingleTapLines(i, j, k);
	//   22   35:aload_0         
	//   23   36:iload_1         
	//   24   37:iload_2         
	//   25   38:iload_3         
	//   26   39:invokevirtual   #166 <Method boolean onSingleTapLines(int, int, int)>
	//   27   42:istore          5
		return flag;
	//   28   44:iload           5
	//   29   46:ifeq            51
	//   30   49:iconst_1        
	//   31   50:ireturn         
	//   32   51:iconst_0        
	//   33   52:ireturn         
	}

	boolean onSingleTapLines(int i, int j, int k)
	{
		return false;
	//    0    0:iconst_0        
	//    1    1:ireturn         
	}

	boolean onSingleTapPoints(int i, int j, int k)
	{
		return false;
	//    0    0:iconst_0        
	//    1    1:ireturn         
	}

	public void reculateRouteBoard(s s1)
	{
	//    0    0:return          
	}

	public void removeAll(boolean flag)
	{
		nativeClearAllGLOverlay(mNativeInstance, flag);
	//    0    0:aload_0         
	//    1    1:getfield        #34  <Field long mNativeInstance>
	//    2    4:iload_1         
	//    3    5:invokestatic    #172 <Method void nativeClearAllGLOverlay(long, boolean)>
		List list = mOverlayList;
	//    4    8:aload_0         
	//    5    9:getfield        #30  <Field List mOverlayList>
	//    6   12:astore_3        
		list;
	//    7   13:aload_3         
		JVM INSTR monitorenter ;
	//    8   14:monitorenter    
		int i = 0;
	//    9   15:iconst_0        
	//   10   16:istore_2        
_L2:
		BaseMapOverlay basemapoverlay;
		if(i >= mOverlayList.size())
			break MISSING_BLOCK_LABEL_62;
	//   11   17:iload_2         
	//   12   18:aload_0         
	//   13   19:getfield        #30  <Field List mOverlayList>
	//   14   22:invokeinterface #135 <Method int List.size()>
	//   15   27:icmpge          62
		basemapoverlay = (BaseMapOverlay)mOverlayList.get(i);
	//   16   30:aload_0         
	//   17   31:getfield        #30  <Field List mOverlayList>
	//   18   34:iload_2         
	//   19   35:invokeinterface #139 <Method Object List.get(int)>
	//   20   40:checkcast       #80  <Class BaseMapOverlay>
	//   21   43:astore          4
		if(basemapoverlay == null)
			break MISSING_BLOCK_LABEL_81;
	//   22   45:aload           4
	//   23   47:ifnull          81
		basemapoverlay.getGLOverlay().mIsInBundle = false;
	//   24   50:aload           4
	//   25   52:invokevirtual   #84  <Method GLOverlay BaseMapOverlay.getGLOverlay()>
	//   26   55:iconst_0        
	//   27   56:putfield        #100 <Field boolean GLOverlay.mIsInBundle>
		break MISSING_BLOCK_LABEL_81;
	//   28   59:goto            81
		mOverlayList.clear();
	//   29   62:aload_0         
	//   30   63:getfield        #30  <Field List mOverlayList>
	//   31   66:invokeinterface #173 <Method void List.clear()>
		list;
	//   32   71:aload_3         
		JVM INSTR monitorexit ;
	//   33   72:monitorexit     
		return;
	//   34   73:return          
		Exception exception;
		exception;
	//   35   74:astore          4
	//*  36   76:aload_3         
		throw exception;
	//   37   77:monitorexit     
	//   38   78:aload           4
	//   39   80:athrow          
		i++;
	//   40   81:iload_2         
	//   41   82:iconst_1        
	//   42   83:iadd            
	//   43   84:istore_2        
		if(true) goto _L2; else goto _L1
	//   44   85:goto            17
_L1:
	}

	public void removeOverlay(BaseMapOverlay basemapoverlay)
	{
		if(basemapoverlay == null)
	//*   0    0:aload_1         
	//*   1    1:ifnonnull       5
			return;
	//    2    4:return          
		nativeRemoveGLOverlay(mNativeInstance, basemapoverlay.getGLOverlay().getNativeInstatnce());
	//    3    5:aload_0         
	//    4    6:getfield        #34  <Field long mNativeInstance>
	//    5    9:aload_1         
	//    6   10:invokevirtual   #84  <Method GLOverlay BaseMapOverlay.getGLOverlay()>
	//    7   13:invokevirtual   #90  <Method long GLOverlay.getNativeInstatnce()>
	//    8   16:invokestatic    #176 <Method void nativeRemoveGLOverlay(long, long)>
		basemapoverlay.getGLOverlay().mIsInBundle = false;
	//    9   19:aload_1         
	//   10   20:invokevirtual   #84  <Method GLOverlay BaseMapOverlay.getGLOverlay()>
	//   11   23:iconst_0        
	//   12   24:putfield        #100 <Field boolean GLOverlay.mIsInBundle>
		List list = mOverlayList;
	//   13   27:aload_0         
	//   14   28:getfield        #30  <Field List mOverlayList>
	//   15   31:astore_2        
		list;
	//   16   32:aload_2         
		JVM INSTR monitorenter ;
	//   17   33:monitorenter    
		mOverlayList.remove(((Object) (basemapoverlay)));
	//   18   34:aload_0         
	//   19   35:getfield        #30  <Field List mOverlayList>
	//   20   38:aload_1         
	//   21   39:invokeinterface #179 <Method boolean List.remove(Object)>
	//   22   44:pop             
		list;
	//   23   45:aload_2         
		JVM INSTR monitorexit ;
	//   24   46:monitorexit     
		return;
	//   25   47:return          
		basemapoverlay;
	//   26   48:astore_1        
	//*  27   49:aload_2         
		throw basemapoverlay;
	//   28   50:monitorexit     
	//   29   51:aload_1         
	//   30   52:athrow          
	}

	public void sortOverlay()
	{
		nativeSortAllGLOverlay(mNativeInstance);
	//    0    0:aload_0         
	//    1    1:getfield        #34  <Field long mNativeInstance>
	//    2    4:invokestatic    #182 <Method void nativeSortAllGLOverlay(long)>
	//    3    7:return          
	}

	private int mEngineID;
	s mGLMapView;
	private long mNativeInstance;
	private final List mOverlayList = new ArrayList();
	private SparseArray mTextureCaches;
}
