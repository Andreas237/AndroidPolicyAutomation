// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.autonavi.ae.gmap.gloverlay;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.*;
import android.util.TypedValue;
import com.amap.api.mapcore.util.ac;
import com.amap.api.mapcore.util.s;
import com.amap.api.maps.model.BitmapDescriptor;
import com.amap.api.maps.model.BitmapDescriptorFactory;

// Referenced classes of package com.autonavi.ae.gmap.gloverlay:
//			BaseMapOverlay, GLCrossVector, GLTextureProperty

public class CrossVectorOverlay extends BaseMapOverlay
	implements com.amap.api.mapcore.util.ac.a
{

	public CrossVectorOverlay(int i, Context context, s s1)
	{
		super(i, context, s1);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:aload_2         
	//    3    3:aload_3         
	//    4    4:invokespecial   #21  <Method void BaseMapOverlay(int, Context, s)>
		isImageMode = false;
	//    5    7:aload_0         
	//    6    8:iconst_0        
	//    7    9:putfield        #23  <Field boolean isImageMode>
		attr = null;
	//    8   12:aload_0         
	//    9   13:aconst_null     
	//   10   14:putfield        #25  <Field GLCrossVector$AVectorCrossAttr attr>
	//   11   17:return          
	}

	private void drawVectorFailed(int i)
	{
		if(pluginTexture != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #30  <Field ac pluginTexture>
	//*   2    4:ifnull          14
			pluginTexture.b();
	//    3    7:aload_0         
	//    4    8:getfield        #30  <Field ac pluginTexture>
	//    5   11:invokevirtual   #38  <Method void ac.b()>
		if(imageListener != null)
	//*   6   14:aload_0         
	//*   7   15:getfield        #40  <Field com.amap.api.maps.model.CrossOverlay$GenerateCrossImageListener imageListener>
	//*   8   18:ifnull          32
			imageListener.onGenerateComplete(((Bitmap) (null)), i);
	//    9   21:aload_0         
	//   10   22:getfield        #40  <Field com.amap.api.maps.model.CrossOverlay$GenerateCrossImageListener imageListener>
	//   11   25:aconst_null     
	//   12   26:iload_1         
	//   13   27:invokeinterface #46  <Method void com.amap.api.maps.model.CrossOverlay$GenerateCrossImageListener.onGenerateComplete(Bitmap, int)>
	//   14   32:return          
	}

	private void initImageMode(int i, int j)
	{
		if(pluginTexture == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #30  <Field ac pluginTexture>
	//*   2    4:ifnonnull       74
		{
			pluginTexture = new ac(mMapView);
	//    3    7:aload_0         
	//    4    8:new             #34  <Class ac>
	//    5   11:dup             
	//    6   12:aload_0         
	//    7   13:getfield        #52  <Field s mMapView>
	//    8   16:invokespecial   #55  <Method void ac(s)>
	//    9   19:putfield        #30  <Field ac pluginTexture>
			pluginTexture.a(imageListener);
	//   10   22:aload_0         
	//   11   23:getfield        #30  <Field ac pluginTexture>
	//   12   26:aload_0         
	//   13   27:getfield        #40  <Field com.amap.api.maps.model.CrossOverlay$GenerateCrossImageListener imageListener>
	//   14   30:invokevirtual   #59  <Method void ac.a(com.amap.api.maps.model.CrossOverlay$GenerateCrossImageListener)>
			pluginTexture.a(((com.amap.api.mapcore.util.ac.a) (this)));
	//   15   33:aload_0         
	//   16   34:getfield        #30  <Field ac pluginTexture>
	//   17   37:aload_0         
	//   18   38:invokevirtual   #62  <Method void ac.a(com.amap.api.mapcore.util.ac$a)>
			int k = attr.stAreaRect.width();
	//   19   41:aload_0         
	//   20   42:getfield        #25  <Field GLCrossVector$AVectorCrossAttr attr>
	//   21   45:getfield        #68  <Field Rect GLCrossVector$AVectorCrossAttr.stAreaRect>
	//   22   48:invokevirtual   #74  <Method int Rect.width()>
	//   23   51:istore_3        
			int l = attr.stAreaRect.height();
	//   24   52:aload_0         
	//   25   53:getfield        #25  <Field GLCrossVector$AVectorCrossAttr attr>
	//   26   56:getfield        #68  <Field Rect GLCrossVector$AVectorCrossAttr.stAreaRect>
	//   27   59:invokevirtual   #77  <Method int Rect.height()>
	//   28   62:istore          4
			pluginTexture.b(k, l);
	//   29   64:aload_0         
	//   30   65:getfield        #30  <Field ac pluginTexture>
	//   31   68:iload_3         
	//   32   69:iload           4
	//   33   71:invokevirtual   #79  <Method void ac.b(int, int)>
		}
		if(mGLOverlay != null)
	//*  34   74:aload_0         
	//*  35   75:getfield        #83  <Field GLOverlay mGLOverlay>
	//*  36   78:ifnull          93
			((GLCrossVector)mGLOverlay).initFBOTexture(i, j);
	//   37   81:aload_0         
	//   38   82:getfield        #83  <Field GLOverlay mGLOverlay>
	//   39   85:checkcast       #85  <Class GLCrossVector>
	//   40   88:iload_1         
	//   41   89:iload_2         
	//   42   90:invokevirtual   #88  <Method void GLCrossVector.initFBOTexture(int, int)>
	//   43   93:return          
	}

	public void AddOverlayTexture(Bitmap bitmap, int i, int j)
	{
		GLTextureProperty gltextureproperty = new GLTextureProperty();
	//    0    0:new             #92  <Class GLTextureProperty>
	//    1    3:dup             
	//    2    4:invokespecial   #94  <Method void GLTextureProperty()>
	//    3    7:astore          4
		gltextureproperty.mId = i;
	//    4    9:aload           4
	//    5   11:iload_2         
	//    6   12:putfield        #98  <Field int GLTextureProperty.mId>
		gltextureproperty.mAnchor = j;
	//    7   15:aload           4
	//    8   17:iload_3         
	//    9   18:putfield        #101 <Field int GLTextureProperty.mAnchor>
		gltextureproperty.mBitmap = bitmap;
	//   10   21:aload           4
	//   11   23:aload_1         
	//   12   24:putfield        #105 <Field Bitmap GLTextureProperty.mBitmap>
		gltextureproperty.mXRatio = 0.0F;
	//   13   27:aload           4
	//   14   29:fconst_0        
	//   15   30:putfield        #109 <Field float GLTextureProperty.mXRatio>
		gltextureproperty.mYRatio = 0.0F;
	//   16   33:aload           4
	//   17   35:fconst_0        
	//   18   36:putfield        #112 <Field float GLTextureProperty.mYRatio>
		gltextureproperty.isGenMimps = true;
	//   19   39:aload           4
	//   20   41:iconst_1        
	//   21   42:putfield        #115 <Field boolean GLTextureProperty.isGenMimps>
		mMapView.addOverlayTexture(mEngineID, gltextureproperty);
	//   22   45:aload_0         
	//   23   46:getfield        #52  <Field s mMapView>
	//   24   49:aload_0         
	//   25   50:getfield        #118 <Field int mEngineID>
	//   26   53:aload           4
	//   27   55:invokeinterface #124 <Method void s.addOverlayTexture(int, GLTextureProperty)>
	//   28   60:return          
	}

	public void addItem(Object obj)
	{
	//    0    0:return          
	}

	public int dipToPixel(Context context, int i)
	{
		if(context == null)
	//*   0    0:aload_1         
	//*   1    1:ifnonnull       6
			return i;
	//    2    4:iload_2         
	//    3    5:ireturn         
		float f = i;
	//    4    6:iload_2         
	//    5    7:i2f             
	//    6    8:fstore_3        
		try
		{
			f = TypedValue.applyDimension(1, f, context.getResources().getDisplayMetrics());
	//    7    9:iconst_1        
	//    8   10:fload_3         
	//    9   11:aload_1         
	//   10   12:invokevirtual   #136 <Method Resources Context.getResources()>
	//   11   15:invokevirtual   #142 <Method android.util.DisplayMetrics Resources.getDisplayMetrics()>
	//   12   18:invokestatic    #148 <Method float TypedValue.applyDimension(int, float, android.util.DisplayMetrics)>
	//   13   21:fstore_3        
		}
	//*  14   22:fload_3         
	//*  15   23:f2i             
	//*  16   24:ireturn         
		// Misplaced declaration of an exception variable
		catch(Context context)
	//*  17   25:astore_1        
		{
			return i;
	//   18   26:iload_2         
	//   19   27:ireturn         
		}
		return (int)f;
	}

	public int getTextureID()
	{
		return ((GLCrossVector)mGLOverlay).getFBOTextureId();
	//    0    0:aload_0         
	//    1    1:getfield        #83  <Field GLOverlay mGLOverlay>
	//    2    4:checkcast       #85  <Class GLCrossVector>
	//    3    7:invokevirtual   #152 <Method int GLCrossVector.getFBOTextureId()>
	//    4   10:ireturn         
	}

	protected void iniGLOverlay()
	{
		mGLOverlay = ((GLOverlay) (new GLCrossVector(mEngineID, mMapView, ((Object)this).hashCode())));
	//    0    0:aload_0         
	//    1    1:new             #85  <Class GLCrossVector>
	//    2    4:dup             
	//    3    5:aload_0         
	//    4    6:getfield        #118 <Field int mEngineID>
	//    5    9:aload_0         
	//    6   10:getfield        #52  <Field s mMapView>
	//    7   13:aload_0         
	//    8   14:invokevirtual   #158 <Method int Object.hashCode()>
	//    9   17:invokespecial   #161 <Method void GLCrossVector(int, s, int)>
	//   10   20:putfield        #83  <Field GLOverlay mGLOverlay>
	//   11   23:return          
	}

	public void remove()
	{
		if(pluginTexture != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #30  <Field ac pluginTexture>
	//*   2    4:ifnull          19
		{
			pluginTexture.b();
	//    3    7:aload_0         
	//    4    8:getfield        #30  <Field ac pluginTexture>
	//    5   11:invokevirtual   #38  <Method void ac.b()>
			pluginTexture = null;
	//    6   14:aload_0         
	//    7   15:aconst_null     
	//    8   16:putfield        #30  <Field ac pluginTexture>
		}
		imageListener = null;
	//    9   19:aload_0         
	//   10   20:aconst_null     
	//   11   21:putfield        #40  <Field com.amap.api.maps.model.CrossOverlay$GenerateCrossImageListener imageListener>
		setVisible(false);
	//   12   24:aload_0         
	//   13   25:iconst_0        
	//   14   26:invokevirtual   #166 <Method void setVisible(boolean)>
		releaseInstance();
	//   15   29:aload_0         
	//   16   30:invokevirtual   #169 <Method void releaseInstance()>
	//   17   33:return          
	}

	public void resumeMarker(Bitmap bitmap)
	{
		AddOverlayTexture(bitmap, 12345, 4);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:sipush          12345
	//    3    5:iconst_4        
	//    4    6:invokevirtual   #173 <Method void AddOverlayTexture(Bitmap, int, int)>
		((GLCrossVector)mGLOverlay).setArrowResId(false, 12345);
	//    5    9:aload_0         
	//    6   10:getfield        #83  <Field GLOverlay mGLOverlay>
	//    7   13:checkcast       #85  <Class GLCrossVector>
	//    8   16:iconst_0        
	//    9   17:sipush          12345
	//   10   20:invokevirtual   #177 <Method void GLCrossVector.setArrowResId(boolean, int)>
		((GLCrossVector)mGLOverlay).setCarResId(12345);
	//   11   23:aload_0         
	//   12   24:getfield        #83  <Field GLOverlay mGLOverlay>
	//   13   27:checkcast       #85  <Class GLCrossVector>
	//   14   30:sipush          12345
	//   15   33:invokevirtual   #180 <Method void GLCrossVector.setCarResId(int)>
		BitmapDescriptor bitmapdescriptor = BitmapDescriptorFactory.fromAsset("cross/crossing_nigth_bk.data");
	//   16   36:ldc1            #182 <String "cross/crossing_nigth_bk.data">
	//   17   38:invokestatic    #188 <Method BitmapDescriptor BitmapDescriptorFactory.fromAsset(String)>
	//   18   41:astore_2        
		bitmap = null;
	//   19   42:aconst_null     
	//   20   43:astore_1        
		if(bitmapdescriptor != null)
	//*  21   44:aload_2         
	//*  22   45:ifnull          53
			bitmap = bitmapdescriptor.getBitmap();
	//   23   48:aload_2         
	//   24   49:invokevirtual   #194 <Method Bitmap BitmapDescriptor.getBitmap()>
	//   25   52:astore_1        
		AddOverlayTexture(bitmap, 54321, 0);
	//   26   53:aload_0         
	//   27   54:aload_1         
	//   28   55:ldc1            #195 <Int 54321>
	//   29   57:iconst_0        
	//   30   58:invokevirtual   #173 <Method void AddOverlayTexture(Bitmap, int, int)>
		((GLCrossVector)mGLOverlay).setBackgroundResId(54321);
	//   31   61:aload_0         
	//   32   62:getfield        #83  <Field GLOverlay mGLOverlay>
	//   33   65:checkcast       #85  <Class GLCrossVector>
	//   34   68:ldc1            #195 <Int 54321>
	//   35   70:invokevirtual   #198 <Method void GLCrossVector.setBackgroundResId(int)>
	//   36   73:return          
	}

	public void setAttribute(GLCrossVector.AVectorCrossAttr avectorcrossattr)
	{
		attr = avectorcrossattr;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #25  <Field GLCrossVector$AVectorCrossAttr attr>
	//    3    5:return          
	}

	public int setData(byte abyte0[])
	{
		byte byte0 = -1;
	//    0    0:iconst_m1       
	//    1    1:istore_3        
		if(attr == null)
	//*   2    2:aload_0         
	//*   3    3:getfield        #25  <Field GLCrossVector$AVectorCrossAttr attr>
	//*   4    6:ifnonnull       157
		{
			attr = new GLCrossVector.AVectorCrossAttr();
	//    5    9:aload_0         
	//    6   10:new             #64  <Class GLCrossVector$AVectorCrossAttr>
	//    7   13:dup             
	//    8   14:invokespecial   #203 <Method void GLCrossVector$AVectorCrossAttr()>
	//    9   17:putfield        #25  <Field GLCrossVector$AVectorCrossAttr attr>
			attr.stAreaRect = new Rect(0, 0, mMapView.getMapWidth(), (mMapView.getMapHeight() * 4) / 11);
	//   10   20:aload_0         
	//   11   21:getfield        #25  <Field GLCrossVector$AVectorCrossAttr attr>
	//   12   24:new             #70  <Class Rect>
	//   13   27:dup             
	//   14   28:iconst_0        
	//   15   29:iconst_0        
	//   16   30:aload_0         
	//   17   31:getfield        #52  <Field s mMapView>
	//   18   34:invokeinterface #206 <Method int s.getMapWidth()>
	//   19   39:aload_0         
	//   20   40:getfield        #52  <Field s mMapView>
	//   21   43:invokeinterface #209 <Method int s.getMapHeight()>
	//   22   48:iconst_4        
	//   23   49:imul            
	//   24   50:bipush          11
	//   25   52:idiv            
	//   26   53:invokespecial   #212 <Method void Rect(int, int, int, int)>
	//   27   56:putfield        #68  <Field Rect GLCrossVector$AVectorCrossAttr.stAreaRect>
			attr.stAreaColor = Color.argb(217, 95, 95, 95);
	//   28   59:aload_0         
	//   29   60:getfield        #25  <Field GLCrossVector$AVectorCrossAttr attr>
	//   30   63:sipush          217
	//   31   66:bipush          95
	//   32   68:bipush          95
	//   33   70:bipush          95
	//   34   72:invokestatic    #218 <Method int Color.argb(int, int, int, int)>
	//   35   75:putfield        #221 <Field int GLCrossVector$AVectorCrossAttr.stAreaColor>
			attr.fArrowBorderWidth = dipToPixel(mContext, 22);
	//   36   78:aload_0         
	//   37   79:getfield        #25  <Field GLCrossVector$AVectorCrossAttr attr>
	//   38   82:aload_0         
	//   39   83:aload_0         
	//   40   84:getfield        #225 <Field Context mContext>
	//   41   87:bipush          22
	//   42   89:invokevirtual   #227 <Method int dipToPixel(Context, int)>
	//   43   92:putfield        #230 <Field int GLCrossVector$AVectorCrossAttr.fArrowBorderWidth>
			attr.stArrowBorderColor = Color.argb(0, 0, 50, 20);
	//   44   95:aload_0         
	//   45   96:getfield        #25  <Field GLCrossVector$AVectorCrossAttr attr>
	//   46   99:iconst_0        
	//   47  100:iconst_0        
	//   48  101:bipush          50
	//   49  103:bipush          20
	//   50  105:invokestatic    #218 <Method int Color.argb(int, int, int, int)>
	//   51  108:putfield        #233 <Field int GLCrossVector$AVectorCrossAttr.stArrowBorderColor>
			attr.fArrowLineWidth = dipToPixel(mContext, 18);
	//   52  111:aload_0         
	//   53  112:getfield        #25  <Field GLCrossVector$AVectorCrossAttr attr>
	//   54  115:aload_0         
	//   55  116:aload_0         
	//   56  117:getfield        #225 <Field Context mContext>
	//   57  120:bipush          18
	//   58  122:invokevirtual   #227 <Method int dipToPixel(Context, int)>
	//   59  125:putfield        #236 <Field int GLCrossVector$AVectorCrossAttr.fArrowLineWidth>
			attr.stArrowLineColor = Color.argb(255, 255, 253, 65);
	//   60  128:aload_0         
	//   61  129:getfield        #25  <Field GLCrossVector$AVectorCrossAttr attr>
	//   62  132:sipush          255
	//   63  135:sipush          255
	//   64  138:sipush          253
	//   65  141:bipush          65
	//   66  143:invokestatic    #218 <Method int Color.argb(int, int, int, int)>
	//   67  146:putfield        #239 <Field int GLCrossVector$AVectorCrossAttr.stArrowLineColor>
			attr.dayMode = false;
	//   68  149:aload_0         
	//   69  150:getfield        #25  <Field GLCrossVector$AVectorCrossAttr attr>
	//   70  153:iconst_0        
	//   71  154:putfield        #242 <Field boolean GLCrossVector$AVectorCrossAttr.dayMode>
		}
		int i = ((int) (byte0));
	//   72  157:iload_3         
	//   73  158:istore_2        
		if(abyte0 != null)
	//*  74  159:aload_1         
	//*  75  160:ifnull          286
		{
			i = ((int) (byte0));
	//   76  163:iload_3         
	//   77  164:istore_2        
			if(attr != null)
	//*  78  165:aload_0         
	//*  79  166:getfield        #25  <Field GLCrossVector$AVectorCrossAttr attr>
	//*  80  169:ifnull          286
			{
				final int mapWidth = mMapView.getMapWidth();
	//   81  172:aload_0         
	//   82  173:getfield        #52  <Field s mMapView>
	//   83  176:invokeinterface #206 <Method int s.getMapWidth()>
	//   84  181:istore          4
				final int mapHeight = mMapView.getMapHeight();
	//   85  183:aload_0         
	//   86  184:getfield        #52  <Field s mMapView>
	//   87  187:invokeinterface #209 <Method int s.getMapHeight()>
	//   88  192:istore          5
				if(isImageMode && imageListener != null)
	//*  89  194:aload_0         
	//*  90  195:getfield        #23  <Field boolean isImageMode>
	//*  91  198:ifeq            216
	//*  92  201:aload_0         
	//*  93  202:getfield        #40  <Field com.amap.api.maps.model.CrossOverlay$GenerateCrossImageListener imageListener>
	//*  94  205:ifnull          216
					initImageMode(mapWidth, mapHeight);
	//   95  208:aload_0         
	//   96  209:iload           4
	//   97  211:iload           5
	//   98  213:invokespecial   #244 <Method void initImageMode(int, int)>
				int j = ((GLCrossVector)mGLOverlay).addVectorItem(attr, abyte0, abyte0.length);
	//   99  216:aload_0         
	//  100  217:getfield        #83  <Field GLOverlay mGLOverlay>
	//  101  220:checkcast       #85  <Class GLCrossVector>
	//  102  223:aload_0         
	//  103  224:getfield        #25  <Field GLCrossVector$AVectorCrossAttr attr>
	//  104  227:aload_1         
	//  105  228:aload_1         
	//  106  229:arraylength     
	//  107  230:invokevirtual   #248 <Method int GLCrossVector.addVectorItem(GLCrossVector$AVectorCrossAttr, byte[], int)>
	//  108  233:istore_3        
				((GLCrossVector)mGLOverlay).setVisible(true);
	//  109  234:aload_0         
	//  110  235:getfield        #83  <Field GLOverlay mGLOverlay>
	//  111  238:checkcast       #85  <Class GLCrossVector>
	//  112  241:iconst_1        
	//  113  242:invokevirtual   #249 <Method void GLCrossVector.setVisible(boolean)>
				i = j;
	//  114  245:iload_3         
	//  115  246:istore_2        
				if(isImageMode)
	//* 116  247:aload_0         
	//* 117  248:getfield        #23  <Field boolean isImageMode>
	//* 118  251:ifeq            286
				{
					i = j;
	//  119  254:iload_3         
	//  120  255:istore_2        
					if(imageListener != null)
	//* 121  256:aload_0         
	//* 122  257:getfield        #40  <Field com.amap.api.maps.model.CrossOverlay$GenerateCrossImageListener imageListener>
	//* 123  260:ifnull          286
					{
						mMapView.queueEvent(new Runnable() {

							public void run()
							{
								if(mGLOverlay != null && ((GLCrossVector)mGLOverlay).isVisible() && pluginTexture != null && !pluginTexture.c())
							//*   0    0:aload_0         
							//*   1    1:getfield        #20  <Field CrossVectorOverlay this$0>
							//*   2    4:getfield        #33  <Field GLOverlay CrossVectorOverlay.mGLOverlay>
							//*   3    7:ifnull          77
							//*   4   10:aload_0         
							//*   5   11:getfield        #20  <Field CrossVectorOverlay this$0>
							//*   6   14:getfield        #33  <Field GLOverlay CrossVectorOverlay.mGLOverlay>
							//*   7   17:checkcast       #35  <Class GLCrossVector>
							//*   8   20:invokevirtual   #39  <Method boolean GLCrossVector.isVisible()>
							//*   9   23:ifeq            77
							//*  10   26:aload_0         
							//*  11   27:getfield        #20  <Field CrossVectorOverlay this$0>
							//*  12   30:invokestatic    #43  <Method ac CrossVectorOverlay.access$000(CrossVectorOverlay)>
							//*  13   33:ifnull          77
							//*  14   36:aload_0         
							//*  15   37:getfield        #20  <Field CrossVectorOverlay this$0>
							//*  16   40:invokestatic    #43  <Method ac CrossVectorOverlay.access$000(CrossVectorOverlay)>
							//*  17   43:invokevirtual   #48  <Method boolean ac.c()>
							//*  18   46:ifne            77
								{
									pluginTexture.a(mapWidth, mapHeight);
							//   19   49:aload_0         
							//   20   50:getfield        #20  <Field CrossVectorOverlay this$0>
							//   21   53:invokestatic    #43  <Method ac CrossVectorOverlay.access$000(CrossVectorOverlay)>
							//   22   56:aload_0         
							//   23   57:getfield        #22  <Field int val$mapWidth>
							//   24   60:aload_0         
							//   25   61:getfield        #24  <Field int val$mapHeight>
							//   26   64:invokevirtual   #52  <Method void ac.a(int, int)>
									pluginTexture.a();
							//   27   67:aload_0         
							//   28   68:getfield        #20  <Field CrossVectorOverlay this$0>
							//   29   71:invokestatic    #43  <Method ac CrossVectorOverlay.access$000(CrossVectorOverlay)>
							//   30   74:invokevirtual   #54  <Method void ac.a()>
								}
							//   31   77:return          
							}

							final CrossVectorOverlay this$0;
							final int val$mapHeight;
							final int val$mapWidth;

			
			{
				this$0 = CrossVectorOverlay.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #20  <Field CrossVectorOverlay this$0>
				mapWidth = i;
			//    3    5:aload_0         
			//    4    6:iload_2         
			//    5    7:putfield        #22  <Field int val$mapWidth>
				mapHeight = j;
			//    6   10:aload_0         
			//    7   11:iload_3         
			//    8   12:putfield        #24  <Field int val$mapHeight>
				super();
			//    9   15:aload_0         
			//   10   16:invokespecial   #27  <Method void Object()>
			//   11   19:return          
			}
						}
);
	//  124  263:aload_0         
	//  125  264:getfield        #52  <Field s mMapView>
	//  126  267:new             #9   <Class CrossVectorOverlay$1>
	//  127  270:dup             
	//  128  271:aload_0         
	//  129  272:iload           4
	//  130  274:iload           5
	//  131  276:invokespecial   #252 <Method void CrossVectorOverlay$1(CrossVectorOverlay, int, int)>
	//  132  279:invokeinterface #256 <Method void s.queueEvent(Runnable)>
						i = j;
	//  133  284:iload_3         
	//  134  285:istore_2        
					}
				}
			}
		}
		if(i == -1)
	//* 135  286:iload_2         
	//* 136  287:iconst_m1       
	//* 137  288:icmpne          296
			drawVectorFailed(i);
	//  138  291:aload_0         
	//  139  292:iload_2         
	//  140  293:invokespecial   #258 <Method void drawVectorFailed(int)>
		return i;
	//  141  296:iload_2         
	//  142  297:ireturn         
	}

	public void setGenerateCrossImageListener(com.amap.api.maps.model.CrossOverlay.GenerateCrossImageListener generatecrossimagelistener)
	{
		imageListener = generatecrossimagelistener;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #40  <Field com.amap.api.maps.model.CrossOverlay$GenerateCrossImageListener imageListener>
		if(pluginTexture != null)
	//*   3    5:aload_0         
	//*   4    6:getfield        #30  <Field ac pluginTexture>
	//*   5    9:ifnull          23
			pluginTexture.a(imageListener);
	//    6   12:aload_0         
	//    7   13:getfield        #30  <Field ac pluginTexture>
	//    8   16:aload_0         
	//    9   17:getfield        #40  <Field com.amap.api.maps.model.CrossOverlay$GenerateCrossImageListener imageListener>
	//   10   20:invokevirtual   #59  <Method void ac.a(com.amap.api.maps.model.CrossOverlay$GenerateCrossImageListener)>
	//   11   23:return          
	}

	public void setImageMode(boolean flag)
	{
		isImageMode = flag;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #23  <Field boolean isImageMode>
	//    3    5:return          
	}

	GLCrossVector.AVectorCrossAttr attr;
	private com.amap.api.maps.model.CrossOverlay.GenerateCrossImageListener imageListener;
	private boolean isImageMode;
	private ac pluginTexture;


/*
	static ac access$000(CrossVectorOverlay crossvectoroverlay)
	{
		return crossvectoroverlay.pluginTexture;
	//    0    0:aload_0         
	//    1    1:getfield        #30  <Field ac pluginTexture>
	//    2    4:areturn         
	}

*/
}
