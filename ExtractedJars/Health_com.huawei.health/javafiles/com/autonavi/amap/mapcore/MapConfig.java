// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.autonavi.amap.mapcore;

import android.opengl.Matrix;
import com.amap.api.maps.model.LatLngBounds;
import java.util.concurrent.atomic.AtomicInteger;

// Referenced classes of package com.autonavi.amap.mapcore:
//			Rectangle, IPoint, FPoint

public class MapConfig
	implements Cloneable
{

	public MapConfig(boolean flag)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #112 <Method void Object()>
		maxZoomLevel = 20F;
	//    2    4:aload_0         
	//    3    5:ldc1            #14  <Float 20F>
	//    4    7:putfield        #114 <Field float maxZoomLevel>
		minZoomLevel = 3F;
	//    5   10:aload_0         
	//    6   11:ldc1            #17  <Float 3F>
	//    7   13:putfield        #116 <Field float minZoomLevel>
		mapRect = null;
	//    8   16:aload_0         
	//    9   17:aconst_null     
	//   10   18:putfield        #118 <Field FPoint[] mapRect>
		geoRectangle = new Rectangle();
	//   11   21:aload_0         
	//   12   22:new             #120 <Class Rectangle>
	//   13   25:dup             
	//   14   26:invokespecial   #121 <Method void Rectangle()>
	//   15   29:putfield        #123 <Field Rectangle geoRectangle>
		isIndoorEnable = false;
	//   16   32:aload_0         
	//   17   33:iconst_0        
	//   18   34:putfield        #125 <Field boolean isIndoorEnable>
		isBuildingEnable = true;
	//   19   37:aload_0         
	//   20   38:iconst_1        
	//   21   39:putfield        #127 <Field boolean isBuildingEnable>
		isMapTextEnable = true;
	//   22   42:aload_0         
	//   23   43:iconst_1        
	//   24   44:putfield        #129 <Field boolean isMapTextEnable>
		isTrafficEnabled = false;
	//   25   47:aload_0         
	//   26   48:iconst_0        
	//   27   49:putfield        #131 <Field boolean isTrafficEnabled>
		isCustomStyleEnabled = false;
	//   28   52:aload_0         
	//   29   53:iconst_0        
	//   30   54:putfield        #133 <Field boolean isCustomStyleEnabled>
		sX = 0xd2c595b;
	//   31   57:aload_0         
	//   32   58:ldc1            #134 <Int 0xd2c595b>
	//   33   60:putfield        #136 <Field int sX>
		sY = 0x60fc907;
	//   34   63:aload_0         
	//   35   64:ldc1            #137 <Int 0x60fc907>
	//   36   66:putfield        #139 <Field int sY>
		mapGeoCenter = new IPoint(sX, sY);
	//   37   69:aload_0         
	//   38   70:new             #141 <Class IPoint>
	//   39   73:dup             
	//   40   74:aload_0         
	//   41   75:getfield        #136 <Field int sX>
	//   42   78:aload_0         
	//   43   79:getfield        #139 <Field int sY>
	//   44   82:invokespecial   #144 <Method void IPoint(int, int)>
	//   45   85:putfield        #146 <Field IPoint mapGeoCenter>
		sZ = 10F;
	//   46   88:aload_0         
	//   47   89:ldc1            #147 <Float 10F>
	//   48   91:putfield        #149 <Field float sZ>
		sC = 0.0F;
	//   49   94:aload_0         
	//   50   95:fconst_0        
	//   51   96:putfield        #151 <Field float sC>
		sR = 0.0F;
	//   52   99:aload_0         
	//   53  100:fconst_0        
	//   54  101:putfield        #153 <Field float sR>
		lastMapconfig = null;
	//   55  104:aload_0         
	//   56  105:aconst_null     
	//   57  106:putfield        #155 <Field MapConfig lastMapconfig>
		isCenterChanged = false;
	//   58  109:aload_0         
	//   59  110:iconst_0        
	//   60  111:putfield        #157 <Field boolean isCenterChanged>
		isZoomChanged = false;
	//   61  114:aload_0         
	//   62  115:iconst_0        
	//   63  116:putfield        #159 <Field boolean isZoomChanged>
		isTiltChanged = false;
	//   64  119:aload_0         
	//   65  120:iconst_0        
	//   66  121:putfield        #161 <Field boolean isTiltChanged>
		isBearingChanged = false;
	//   67  124:aload_0         
	//   68  125:iconst_0        
	//   69  126:putfield        #163 <Field boolean isBearingChanged>
		isNeedUpdateZoomControllerState = false;
	//   70  129:aload_0         
	//   71  130:iconst_0        
	//   72  131:putfield        #165 <Field boolean isNeedUpdateZoomControllerState>
		isNeedUpdateMapRectNextFrame = false;
	//   73  134:aload_0         
	//   74  135:iconst_0        
	//   75  136:putfield        #167 <Field boolean isNeedUpdateMapRectNextFrame>
		mMapStyleMode = 0;
	//   76  139:aload_0         
	//   77  140:iconst_0        
	//   78  141:putfield        #169 <Field int mMapStyleMode>
		mMapStyleTime = 0;
	//   79  144:aload_0         
	//   80  145:iconst_0        
	//   81  146:putfield        #171 <Field int mMapStyleTime>
		mMapStyleState = 0;
	//   82  149:aload_0         
	//   83  150:iconst_0        
	//   84  151:putfield        #173 <Field int mMapStyleState>
		anchorX = 0;
	//   85  154:aload_0         
	//   86  155:iconst_0        
	//   87  156:putfield        #175 <Field int anchorX>
		mMapLanguage = "zh_cn";
	//   88  159:aload_0         
	//   89  160:ldc1            #177 <String "zh_cn">
	//   90  162:putfield        #179 <Field String mMapLanguage>
		isHideLogoEnable = true;
	//   91  165:aload_0         
	//   92  166:iconst_1        
	//   93  167:putfield        #181 <Field boolean isHideLogoEnable>
		isWorldMapEnable = false;
	//   94  170:aload_0         
	//   95  171:iconst_0        
	//   96  172:putfield        #183 <Field boolean isWorldMapEnable>
		viewMatrix = new float[16];
	//   97  175:aload_0         
	//   98  176:bipush          16
	//   99  178:newarray        float[]
	//  100  180:putfield        #185 <Field float[] viewMatrix>
		projectionMatrix = new float[16];
	//  101  183:aload_0         
	//  102  184:bipush          16
	//  103  186:newarray        float[]
	//  104  188:putfield        #187 <Field float[] projectionMatrix>
		mvpMatrix = new float[16];
	//  105  191:aload_0         
	//  106  192:bipush          16
	//  107  194:newarray        float[]
	//  108  196:putfield        #189 <Field float[] mvpMatrix>
		tilsIDs = new int[100];
	//  109  199:aload_0         
	//  110  200:bipush          100
	//  111  202:newarray        int[]
	//  112  204:putfield        #191 <Field int[] tilsIDs>
		anchorY = 0;
	//  113  207:aload_0         
	//  114  208:iconst_0        
	//  115  209:putfield        #193 <Field int anchorY>
		isProFunctionAuthEnable = true;
	//  116  212:aload_0         
	//  117  213:iconst_1        
	//  118  214:putfield        #195 <Field boolean isProFunctionAuthEnable>
		isUseProFunction = false;
	//  119  217:aload_0         
	//  120  218:iconst_0        
	//  121  219:putfield        #197 <Field boolean isUseProFunction>
		customBackgroundColor = -1;
	//  122  222:aload_0         
	//  123  223:iconst_m1       
	//  124  224:putfield        #199 <Field int customBackgroundColor>
		mapZoomScale = 1.0F;
	//  125  227:aload_0         
	//  126  228:fconst_1        
	//  127  229:putfield        #201 <Field float mapZoomScale>
		changedCounter = new AtomicInteger(0);
	//  128  232:aload_0         
	//  129  233:new             #203 <Class AtomicInteger>
	//  130  236:dup             
	//  131  237:iconst_0        
	//  132  238:invokespecial   #206 <Method void AtomicInteger(int)>
	//  133  241:putfield        #208 <Field AtomicInteger changedCounter>
		changeRatio = 1.0D;
	//  134  244:aload_0         
	//  135  245:dconst_1        
	//  136  246:putfield        #210 <Field double changeRatio>
		changeGridRatio = 1.0D;
	//  137  249:aload_0         
	//  138  250:dconst_1        
	//  139  251:putfield        #212 <Field double changeGridRatio>
		gridX = 0;
	//  140  254:aload_0         
	//  141  255:iconst_0        
	//  142  256:putfield        #214 <Field int gridX>
		gridY = 0;
	//  143  259:aload_0         
	//  144  260:iconst_0        
	//  145  261:putfield        #216 <Field int gridY>
		if(flag)
	//* 146  264:iload_1         
	//* 147  265:ifeq            329
		{
			lastMapconfig = new MapConfig(false);
	//  148  268:aload_0         
	//  149  269:new             #2   <Class MapConfig>
	//  150  272:dup             
	//  151  273:iconst_0        
	//  152  274:invokespecial   #218 <Method void MapConfig(boolean)>
	//  153  277:putfield        #155 <Field MapConfig lastMapconfig>
			lastMapconfig.setGridXY(0, 0);
	//  154  280:aload_0         
	//  155  281:getfield        #155 <Field MapConfig lastMapconfig>
	//  156  284:iconst_0        
	//  157  285:iconst_0        
	//  158  286:invokevirtual   #221 <Method void setGridXY(int, int)>
			lastMapconfig.setSX(0);
	//  159  289:aload_0         
	//  160  290:getfield        #155 <Field MapConfig lastMapconfig>
	//  161  293:iconst_0        
	//  162  294:invokevirtual   #224 <Method void setSX(int)>
			lastMapconfig.setSY(0);
	//  163  297:aload_0         
	//  164  298:getfield        #155 <Field MapConfig lastMapconfig>
	//  165  301:iconst_0        
	//  166  302:invokevirtual   #227 <Method void setSY(int)>
			lastMapconfig.setSZ(0.0F);
	//  167  305:aload_0         
	//  168  306:getfield        #155 <Field MapConfig lastMapconfig>
	//  169  309:fconst_0        
	//  170  310:invokevirtual   #231 <Method void setSZ(float)>
			lastMapconfig.setSC(0.0F);
	//  171  313:aload_0         
	//  172  314:getfield        #155 <Field MapConfig lastMapconfig>
	//  173  317:fconst_0        
	//  174  318:invokevirtual   #234 <Method void setSC(float)>
			lastMapconfig.setSR(0.0F);
	//  175  321:aload_0         
	//  176  322:getfield        #155 <Field MapConfig lastMapconfig>
	//  177  325:fconst_0        
	//  178  326:invokevirtual   #237 <Method void setSR(float)>
		}
	//  179  329:return          
	}

	private void changeRatio()
	{
		int i = lastMapconfig.getSX();
	//    0    0:aload_0         
	//    1    1:getfield        #155 <Field MapConfig lastMapconfig>
	//    2    4:invokevirtual   #242 <Method int getSX()>
	//    3    7:istore          8
		int j = lastMapconfig.getSY();
	//    4    9:aload_0         
	//    5   10:getfield        #155 <Field MapConfig lastMapconfig>
	//    6   13:invokevirtual   #245 <Method int getSY()>
	//    7   16:istore          9
		float f = lastMapconfig.getSZ();
	//    8   18:aload_0         
	//    9   19:getfield        #155 <Field MapConfig lastMapconfig>
	//   10   22:invokevirtual   #249 <Method float getSZ()>
	//   11   25:fstore          5
		float f2 = lastMapconfig.getSC();
	//   12   27:aload_0         
	//   13   28:getfield        #155 <Field MapConfig lastMapconfig>
	//   14   31:invokevirtual   #252 <Method float getSC()>
	//   15   34:fstore          7
		float f1 = lastMapconfig.getSR();
	//   16   36:aload_0         
	//   17   37:getfield        #155 <Field MapConfig lastMapconfig>
	//   18   40:invokevirtual   #255 <Method float getSR()>
	//   19   43:fstore          6
		changeRatio = Math.abs(sX - i) + Math.abs(sY - j);
	//   20   45:aload_0         
	//   21   46:aload_0         
	//   22   47:getfield        #136 <Field int sX>
	//   23   50:iload           8
	//   24   52:isub            
	//   25   53:invokestatic    #261 <Method int Math.abs(int)>
	//   26   56:aload_0         
	//   27   57:getfield        #139 <Field int sY>
	//   28   60:iload           9
	//   29   62:isub            
	//   30   63:invokestatic    #261 <Method int Math.abs(int)>
	//   31   66:iadd            
	//   32   67:i2d             
	//   33   68:putfield        #210 <Field double changeRatio>
		double d;
		if(changeRatio == 0.0D)
	//*  34   71:aload_0         
	//*  35   72:getfield        #210 <Field double changeRatio>
	//*  36   75:dconst_0        
	//*  37   76:dcmpl           
	//*  38   77:ifne            85
			d = 1.0D;
	//   39   80:dconst_1        
	//   40   81:dstore_1        
		else
	//*  41   82:goto            94
			d = changeRatio * 2D;
	//   42   85:aload_0         
	//   43   86:getfield        #210 <Field double changeRatio>
	//   44   89:ldc2w           #262 <Double 2D>
	//   45   92:dmul            
	//   46   93:dstore_1        
		changeRatio = d;
	//   47   94:aload_0         
	//   48   95:dload_1         
	//   49   96:putfield        #210 <Field double changeRatio>
		double d1 = changeRatio;
	//   50   99:aload_0         
	//   51  100:getfield        #210 <Field double changeRatio>
	//   52  103:dstore_3        
		if(f == sZ)
	//*  53  104:fload           5
	//*  54  106:aload_0         
	//*  55  107:getfield        #149 <Field float sZ>
	//*  56  110:fcmpl           
	//*  57  111:ifne            119
			d = 1.0D;
	//   58  114:dconst_1        
	//   59  115:dstore_1        
		else
	//*  60  116:goto            131
			d = Math.abs(f - sZ);
	//   61  119:fload           5
	//   62  121:aload_0         
	//   63  122:getfield        #149 <Field float sZ>
	//   64  125:fsub            
	//   65  126:invokestatic    #266 <Method float Math.abs(float)>
	//   66  129:f2d             
	//   67  130:dstore_1        
		changeRatio = d1 * d;
	//   68  131:aload_0         
	//   69  132:dload_3         
	//   70  133:dload_1         
	//   71  134:dmul            
	//   72  135:putfield        #210 <Field double changeRatio>
		if(f2 == sC)
	//*  73  138:fload           7
	//*  74  140:aload_0         
	//*  75  141:getfield        #151 <Field float sC>
	//*  76  144:fcmpl           
	//*  77  145:ifne            154
			f = 1.0F;
	//   78  148:fconst_1        
	//   79  149:fstore          5
		else
	//*  80  151:goto            166
			f = Math.abs(f2 - sC);
	//   81  154:fload           7
	//   82  156:aload_0         
	//   83  157:getfield        #151 <Field float sC>
	//   84  160:fsub            
	//   85  161:invokestatic    #266 <Method float Math.abs(float)>
	//   86  164:fstore          5
		if(f1 == sR)
	//*  87  166:fload           6
	//*  88  168:aload_0         
	//*  89  169:getfield        #153 <Field float sR>
	//*  90  172:fcmpl           
	//*  91  173:ifne            182
			f1 = 1.0F;
	//   92  176:fconst_1        
	//   93  177:fstore          6
		else
	//*  94  179:goto            194
			f1 = Math.abs(f1 - sR);
	//   95  182:fload           6
	//   96  184:aload_0         
	//   97  185:getfield        #153 <Field float sR>
	//   98  188:fsub            
	//   99  189:invokestatic    #266 <Method float Math.abs(float)>
	//  100  192:fstore          6
		changeRatio = changeRatio * (double)f;
	//  101  194:aload_0         
	//  102  195:aload_0         
	//  103  196:getfield        #210 <Field double changeRatio>
	//  104  199:fload           5
	//  105  201:f2d             
	//  106  202:dmul            
	//  107  203:putfield        #210 <Field double changeRatio>
		changeRatio = changeRatio * (double)f1;
	//  108  206:aload_0         
	//  109  207:aload_0         
	//  110  208:getfield        #210 <Field double changeRatio>
	//  111  211:fload           6
	//  112  213:f2d             
	//  113  214:dmul            
	//  114  215:putfield        #210 <Field double changeRatio>
		changeGridRatio = Math.abs(lastMapconfig.getGridX() - gridX) + (lastMapconfig.getGridY() - gridY);
	//  115  218:aload_0         
	//  116  219:aload_0         
	//  117  220:getfield        #155 <Field MapConfig lastMapconfig>
	//  118  223:invokevirtual   #269 <Method int getGridX()>
	//  119  226:aload_0         
	//  120  227:getfield        #214 <Field int gridX>
	//  121  230:isub            
	//  122  231:invokestatic    #261 <Method int Math.abs(int)>
	//  123  234:aload_0         
	//  124  235:getfield        #155 <Field MapConfig lastMapconfig>
	//  125  238:invokevirtual   #272 <Method int getGridY()>
	//  126  241:aload_0         
	//  127  242:getfield        #216 <Field int gridY>
	//  128  245:isub            
	//  129  246:iadd            
	//  130  247:i2d             
	//  131  248:putfield        #212 <Field double changeGridRatio>
		if(changeGridRatio == 0.0D)
	//* 132  251:aload_0         
	//* 133  252:getfield        #212 <Field double changeGridRatio>
	//* 134  255:dconst_0        
	//* 135  256:dcmpl           
	//* 136  257:ifne            265
			d = 1.0D;
	//  137  260:dconst_1        
	//  138  261:dstore_1        
		else
	//* 139  262:goto            274
			d = changeGridRatio * 2D;
	//  140  265:aload_0         
	//  141  266:getfield        #212 <Field double changeGridRatio>
	//  142  269:ldc2w           #262 <Double 2D>
	//  143  272:dmul            
	//  144  273:dstore_1        
		changeGridRatio = d;
	//  145  274:aload_0         
	//  146  275:dload_1         
	//  147  276:putfield        #212 <Field double changeGridRatio>
		changeGridRatio = changeGridRatio * (double)f;
	//  148  279:aload_0         
	//  149  280:aload_0         
	//  150  281:getfield        #212 <Field double changeGridRatio>
	//  151  284:fload           5
	//  152  286:f2d             
	//  153  287:dmul            
	//  154  288:putfield        #212 <Field double changeGridRatio>
		changeGridRatio = changeGridRatio * (double)f1;
	//  155  291:aload_0         
	//  156  292:aload_0         
	//  157  293:getfield        #212 <Field double changeGridRatio>
	//  158  296:fload           6
	//  159  298:f2d             
	//  160  299:dmul            
	//  161  300:putfield        #212 <Field double changeGridRatio>
	//  162  303:return          
	}

	public int getAnchorX()
	{
		return anchorX;
	//    0    0:aload_0         
	//    1    1:getfield        #175 <Field int anchorX>
	//    2    4:ireturn         
	}

	public int getAnchorY()
	{
		return anchorY;
	//    0    0:aload_0         
	//    1    1:getfield        #193 <Field int anchorY>
	//    2    4:ireturn         
	}

	public double getChangeGridRatio()
	{
		return changeGridRatio;
	//    0    0:aload_0         
	//    1    1:getfield        #212 <Field double changeGridRatio>
	//    2    4:dreturn         
	}

	public double getChangeRatio()
	{
		return changeRatio;
	//    0    0:aload_0         
	//    1    1:getfield        #210 <Field double changeRatio>
	//    2    4:dreturn         
	}

	public int getChangedCounter()
	{
		return changedCounter.get();
	//    0    0:aload_0         
	//    1    1:getfield        #208 <Field AtomicInteger changedCounter>
	//    2    4:invokevirtual   #281 <Method int AtomicInteger.get()>
	//    3    7:ireturn         
	}

	public int[] getCurTileIds()
	{
		return tilsIDs;
	//    0    0:aload_0         
	//    1    1:getfield        #191 <Field int[] tilsIDs>
	//    2    4:areturn         
	}

	public int getCustomBackgroundColor()
	{
		return customBackgroundColor;
	//    0    0:aload_0         
	//    1    1:getfield        #199 <Field int customBackgroundColor>
	//    2    4:ireturn         
	}

	public String getCustomStyleID()
	{
		return mCustomStyleID;
	//    0    0:aload_0         
	//    1    1:getfield        #288 <Field String mCustomStyleID>
	//    2    4:areturn         
	}

	public String getCustomStylePath()
	{
		return mCustomStylePath;
	//    0    0:aload_0         
	//    1    1:getfield        #291 <Field String mCustomStylePath>
	//    2    4:areturn         
	}

	public String getCustomTextureResourcePath()
	{
		return customTextureResourcePath;
	//    0    0:aload_0         
	//    1    1:getfield        #294 <Field String customTextureResourcePath>
	//    2    4:areturn         
	}

	public Rectangle getGeoRectangle()
	{
		return geoRectangle;
	//    0    0:aload_0         
	//    1    1:getfield        #123 <Field Rectangle geoRectangle>
	//    2    4:areturn         
	}

	protected int getGridX()
	{
		return gridX;
	//    0    0:aload_0         
	//    1    1:getfield        #214 <Field int gridX>
	//    2    4:ireturn         
	}

	protected int getGridY()
	{
		return gridY;
	//    0    0:aload_0         
	//    1    1:getfield        #216 <Field int gridY>
	//    2    4:ireturn         
	}

	public IPoint[] getLimitIPoints()
	{
		return limitIPoints;
	//    0    0:aload_0         
	//    1    1:getfield        #300 <Field IPoint[] limitIPoints>
	//    2    4:areturn         
	}

	public LatLngBounds getLimitLatLngBounds()
	{
		return limitLatLngBounds;
	//    0    0:aload_0         
	//    1    1:getfield        #304 <Field LatLngBounds limitLatLngBounds>
	//    2    4:areturn         
	}

	public IPoint getMapGeoCenter()
	{
		return mapGeoCenter;
	//    0    0:aload_0         
	//    1    1:getfield        #146 <Field IPoint mapGeoCenter>
	//    2    4:areturn         
	}

	public int getMapHeight()
	{
		return mapHeight;
	//    0    0:aload_0         
	//    1    1:getfield        #309 <Field int mapHeight>
	//    2    4:ireturn         
	}

	public String getMapLanguage()
	{
		return mMapLanguage;
	//    0    0:aload_0         
	//    1    1:getfield        #179 <Field String mMapLanguage>
	//    2    4:areturn         
	}

	public float getMapPerPixelUnitLength()
	{
		return mapPerPixelUnitLength;
	//    0    0:aload_0         
	//    1    1:getfield        #313 <Field float mapPerPixelUnitLength>
	//    2    4:freturn         
	}

	public FPoint[] getMapRect()
	{
		return mapRect;
	//    0    0:aload_0         
	//    1    1:getfield        #118 <Field FPoint[] mapRect>
	//    2    4:areturn         
	}

	public int getMapStyleMode()
	{
		return mMapStyleMode;
	//    0    0:aload_0         
	//    1    1:getfield        #169 <Field int mMapStyleMode>
	//    2    4:ireturn         
	}

	public int getMapStyleState()
	{
		return mMapStyleState;
	//    0    0:aload_0         
	//    1    1:getfield        #173 <Field int mMapStyleState>
	//    2    4:ireturn         
	}

	public int getMapStyleTime()
	{
		return mMapStyleTime;
	//    0    0:aload_0         
	//    1    1:getfield        #171 <Field int mMapStyleTime>
	//    2    4:ireturn         
	}

	public int getMapWidth()
	{
		return mapWidth;
	//    0    0:aload_0         
	//    1    1:getfield        #321 <Field int mapWidth>
	//    2    4:ireturn         
	}

	public float getMapZoomScale()
	{
		return mapZoomScale;
	//    0    0:aload_0         
	//    1    1:getfield        #201 <Field float mapZoomScale>
	//    2    4:freturn         
	}

	public float getMaxZoomLevel()
	{
		return maxZoomLevel;
	//    0    0:aload_0         
	//    1    1:getfield        #114 <Field float maxZoomLevel>
	//    2    4:freturn         
	}

	public float getMinZoomLevel()
	{
		return minZoomLevel;
	//    0    0:aload_0         
	//    1    1:getfield        #116 <Field float minZoomLevel>
	//    2    4:freturn         
	}

	public float[] getMvpMatrix()
	{
		return mvpMatrix;
	//    0    0:aload_0         
	//    1    1:getfield        #189 <Field float[] mvpMatrix>
	//    2    4:areturn         
	}

	public float[] getProjectionMatrix()
	{
		return projectionMatrix;
	//    0    0:aload_0         
	//    1    1:getfield        #187 <Field float[] projectionMatrix>
	//    2    4:areturn         
	}

	public float getSC()
	{
		return sC;
	//    0    0:aload_0         
	//    1    1:getfield        #151 <Field float sC>
	//    2    4:freturn         
	}

	public float getSR()
	{
		return sR;
	//    0    0:aload_0         
	//    1    1:getfield        #153 <Field float sR>
	//    2    4:freturn         
	}

	public int getSX()
	{
		return sX;
	//    0    0:aload_0         
	//    1    1:getfield        #136 <Field int sX>
	//    2    4:ireturn         
	}

	public int getSY()
	{
		return sY;
	//    0    0:aload_0         
	//    1    1:getfield        #139 <Field int sY>
	//    2    4:ireturn         
	}

	public float getSZ()
	{
		return sZ;
	//    0    0:aload_0         
	//    1    1:getfield        #149 <Field float sZ>
	//    2    4:freturn         
	}

	public float getSkyHeight()
	{
		return skyHeight;
	//    0    0:aload_0         
	//    1    1:getfield        #330 <Field float skyHeight>
	//    2    4:freturn         
	}

	public float[] getViewMatrix()
	{
		return viewMatrix;
	//    0    0:aload_0         
	//    1    1:getfield        #185 <Field float[] viewMatrix>
	//    2    4:areturn         
	}

	public boolean isBearingChanged()
	{
		return isBearingChanged;
	//    0    0:aload_0         
	//    1    1:getfield        #163 <Field boolean isBearingChanged>
	//    2    4:ireturn         
	}

	public boolean isBuildingEnable()
	{
		return isBuildingEnable;
	//    0    0:aload_0         
	//    1    1:getfield        #127 <Field boolean isBuildingEnable>
	//    2    4:ireturn         
	}

	public boolean isCustomStyleEnable()
	{
		return isCustomStyleEnabled;
	//    0    0:aload_0         
	//    1    1:getfield        #133 <Field boolean isCustomStyleEnabled>
	//    2    4:ireturn         
	}

	public boolean isHideLogoEnable()
	{
		return isHideLogoEnable;
	//    0    0:aload_0         
	//    1    1:getfield        #181 <Field boolean isHideLogoEnable>
	//    2    4:ireturn         
	}

	public boolean isIndoorEnable()
	{
		return isIndoorEnable;
	//    0    0:aload_0         
	//    1    1:getfield        #125 <Field boolean isIndoorEnable>
	//    2    4:ireturn         
	}

	public boolean isMapStateChange()
	{
		boolean flag1 = false;
	//    0    0:iconst_0        
	//    1    1:istore          7
		if(lastMapconfig != null)
	//*   2    3:aload_0         
	//*   3    4:getfield        #155 <Field MapConfig lastMapconfig>
	//*   4    7:ifnull          348
		{
			int i = lastMapconfig.getSX();
	//    5   10:aload_0         
	//    6   11:getfield        #155 <Field MapConfig lastMapconfig>
	//    7   14:invokevirtual   #242 <Method int getSX()>
	//    8   17:istore          4
			int k = lastMapconfig.getSY();
	//    9   19:aload_0         
	//   10   20:getfield        #155 <Field MapConfig lastMapconfig>
	//   11   23:invokevirtual   #245 <Method int getSY()>
	//   12   26:istore          5
			float f = lastMapconfig.getSZ();
	//   13   28:aload_0         
	//   14   29:getfield        #155 <Field MapConfig lastMapconfig>
	//   15   32:invokevirtual   #249 <Method float getSZ()>
	//   16   35:fstore_1        
			float f1 = lastMapconfig.getSC();
	//   17   36:aload_0         
	//   18   37:getfield        #155 <Field MapConfig lastMapconfig>
	//   19   40:invokevirtual   #252 <Method float getSC()>
	//   20   43:fstore_2        
			float f2 = lastMapconfig.getSR();
	//   21   44:aload_0         
	//   22   45:getfield        #155 <Field MapConfig lastMapconfig>
	//   23   48:invokevirtual   #255 <Method float getSR()>
	//   24   51:fstore_3        
			boolean flag;
			if(i != sX)
	//*  25   52:iload           4
	//*  26   54:aload_0         
	//*  27   55:getfield        #136 <Field int sX>
	//*  28   58:icmpeq          67
				flag = true;
	//   29   61:iconst_1        
	//   30   62:istore          6
			else
	//*  31   64:goto            70
				flag = false;
	//   32   67:iconst_0        
	//   33   68:istore          6
			isCenterChanged = flag;
	//   34   70:aload_0         
	//   35   71:iload           6
	//   36   73:putfield        #157 <Field boolean isCenterChanged>
			if(k != sY)
	//*  37   76:iload           5
	//*  38   78:aload_0         
	//*  39   79:getfield        #139 <Field int sY>
	//*  40   82:icmpeq          91
				flag = true;
	//   41   85:iconst_1        
	//   42   86:istore          6
			else
	//*  43   88:goto            97
				flag = isCenterChanged;
	//   44   91:aload_0         
	//   45   92:getfield        #157 <Field boolean isCenterChanged>
	//   46   95:istore          6
			isCenterChanged = flag;
	//   47   97:aload_0         
	//   48   98:iload           6
	//   49  100:putfield        #157 <Field boolean isCenterChanged>
			if(f != sZ)
	//*  50  103:fload_1         
	//*  51  104:aload_0         
	//*  52  105:getfield        #149 <Field float sZ>
	//*  53  108:fcmpl           
	//*  54  109:ifeq            118
				flag = true;
	//   55  112:iconst_1        
	//   56  113:istore          6
			else
	//*  57  115:goto            121
				flag = false;
	//   58  118:iconst_0        
	//   59  119:istore          6
			isZoomChanged = flag;
	//   60  121:aload_0         
	//   61  122:iload           6
	//   62  124:putfield        #159 <Field boolean isZoomChanged>
			if(isZoomChanged)
	//*  63  127:aload_0         
	//*  64  128:getfield        #159 <Field boolean isZoomChanged>
	//*  65  131:ifeq            189
				if(f <= minZoomLevel || sZ <= minZoomLevel || f >= maxZoomLevel || sZ >= maxZoomLevel)
	//*  66  134:fload_1         
	//*  67  135:aload_0         
	//*  68  136:getfield        #116 <Field float minZoomLevel>
	//*  69  139:fcmpg           
	//*  70  140:ifle            176
	//*  71  143:aload_0         
	//*  72  144:getfield        #149 <Field float sZ>
	//*  73  147:aload_0         
	//*  74  148:getfield        #116 <Field float minZoomLevel>
	//*  75  151:fcmpg           
	//*  76  152:ifle            176
	//*  77  155:fload_1         
	//*  78  156:aload_0         
	//*  79  157:getfield        #114 <Field float maxZoomLevel>
	//*  80  160:fcmpl           
	//*  81  161:ifge            176
	//*  82  164:aload_0         
	//*  83  165:getfield        #149 <Field float sZ>
	//*  84  168:aload_0         
	//*  85  169:getfield        #114 <Field float maxZoomLevel>
	//*  86  172:fcmpl           
	//*  87  173:iflt            184
					isNeedUpdateZoomControllerState = true;
	//   88  176:aload_0         
	//   89  177:iconst_1        
	//   90  178:putfield        #165 <Field boolean isNeedUpdateZoomControllerState>
				else
	//*  91  181:goto            189
					isNeedUpdateZoomControllerState = false;
	//   92  184:aload_0         
	//   93  185:iconst_0        
	//   94  186:putfield        #165 <Field boolean isNeedUpdateZoomControllerState>
			if(f1 != sC)
	//*  95  189:fload_2         
	//*  96  190:aload_0         
	//*  97  191:getfield        #151 <Field float sC>
	//*  98  194:fcmpl           
	//*  99  195:ifeq            204
				flag = true;
	//  100  198:iconst_1        
	//  101  199:istore          6
			else
	//* 102  201:goto            207
				flag = false;
	//  103  204:iconst_0        
	//  104  205:istore          6
			isTiltChanged = flag;
	//  105  207:aload_0         
	//  106  208:iload           6
	//  107  210:putfield        #161 <Field boolean isTiltChanged>
			if(f2 != sR)
	//* 108  213:fload_3         
	//* 109  214:aload_0         
	//* 110  215:getfield        #153 <Field float sR>
	//* 111  218:fcmpl           
	//* 112  219:ifeq            228
				flag = true;
	//  113  222:iconst_1        
	//  114  223:istore          6
			else
	//* 115  225:goto            231
				flag = false;
	//  116  228:iconst_0        
	//  117  229:istore          6
			isBearingChanged = flag;
	//  118  231:aload_0         
	//  119  232:iload           6
	//  120  234:putfield        #163 <Field boolean isBearingChanged>
			if(isCenterChanged || isZoomChanged || isTiltChanged || isBearingChanged || isNeedUpdateMapRectNextFrame)
	//* 121  237:aload_0         
	//* 122  238:getfield        #157 <Field boolean isCenterChanged>
	//* 123  241:ifne            272
	//* 124  244:aload_0         
	//* 125  245:getfield        #159 <Field boolean isZoomChanged>
	//* 126  248:ifne            272
	//* 127  251:aload_0         
	//* 128  252:getfield        #161 <Field boolean isTiltChanged>
	//* 129  255:ifne            272
	//* 130  258:aload_0         
	//* 131  259:getfield        #163 <Field boolean isBearingChanged>
	//* 132  262:ifne            272
	//* 133  265:aload_0         
	//* 134  266:getfield        #167 <Field boolean isNeedUpdateMapRectNextFrame>
	//* 135  269:ifeq            278
				flag = true;
	//  136  272:iconst_1        
	//  137  273:istore          6
			else
	//* 138  275:goto            281
				flag = false;
	//  139  278:iconst_0        
	//  140  279:istore          6
			flag1 = flag;
	//  141  281:iload           6
	//  142  283:istore          7
			if(flag)
	//* 143  285:iload           6
	//* 144  287:ifeq            348
			{
				isNeedUpdateMapRectNextFrame = false;
	//  145  290:aload_0         
	//  146  291:iconst_0        
	//  147  292:putfield        #167 <Field boolean isNeedUpdateMapRectNextFrame>
				changedCounter.incrementAndGet();
	//  148  295:aload_0         
	//  149  296:getfield        #208 <Field AtomicInteger changedCounter>
	//  150  299:invokevirtual   #337 <Method int AtomicInteger.incrementAndGet()>
	//  151  302:pop             
				int j = (int)sZ;
	//  152  303:aload_0         
	//  153  304:getfield        #149 <Field float sZ>
	//  154  307:f2i             
	//  155  308:istore          4
				setGridXY(sX >> (20 - j) + 8, sY >> (20 - j) + 8);
	//  156  310:aload_0         
	//  157  311:aload_0         
	//  158  312:getfield        #136 <Field int sX>
	//  159  315:bipush          20
	//  160  317:iload           4
	//  161  319:isub            
	//  162  320:bipush          8
	//  163  322:iadd            
	//  164  323:ishr            
	//  165  324:aload_0         
	//  166  325:getfield        #139 <Field int sY>
	//  167  328:bipush          20
	//  168  330:iload           4
	//  169  332:isub            
	//  170  333:bipush          8
	//  171  335:iadd            
	//  172  336:ishr            
	//  173  337:invokevirtual   #221 <Method void setGridXY(int, int)>
				changeRatio();
	//  174  340:aload_0         
	//  175  341:invokespecial   #339 <Method void changeRatio()>
				flag1 = flag;
	//  176  344:iload           6
	//  177  346:istore          7
			}
		}
		if(sC >= 45F && skyHeight == 0.0F)
	//* 178  348:aload_0         
	//* 179  349:getfield        #151 <Field float sC>
	//* 180  352:ldc2            #340 <Float 45F>
	//* 181  355:fcmpl           
	//* 182  356:iflt            370
	//* 183  359:aload_0         
	//* 184  360:getfield        #330 <Field float skyHeight>
	//* 185  363:fconst_0        
	//* 186  364:fcmpl           
	//* 187  365:ifne            370
			return true;
	//  188  368:iconst_1        
	//  189  369:ireturn         
		else
			return flag1;
	//  190  370:iload           7
	//  191  372:ireturn         
	}

	public boolean isMapTextEnable()
	{
		return isMapTextEnable;
	//    0    0:aload_0         
	//    1    1:getfield        #129 <Field boolean isMapTextEnable>
	//    2    4:ireturn         
	}

	public boolean isNeedUpdateZoomControllerState()
	{
		return isNeedUpdateZoomControllerState;
	//    0    0:aload_0         
	//    1    1:getfield        #165 <Field boolean isNeedUpdateZoomControllerState>
	//    2    4:ireturn         
	}

	public boolean isProFunctionAuthEnable()
	{
		return isProFunctionAuthEnable;
	//    0    0:aload_0         
	//    1    1:getfield        #195 <Field boolean isProFunctionAuthEnable>
	//    2    4:ireturn         
	}

	public boolean isSetLimitZoomLevel()
	{
		return isSetLimitZoomLevel;
	//    0    0:aload_0         
	//    1    1:getfield        #342 <Field boolean isSetLimitZoomLevel>
	//    2    4:ireturn         
	}

	public boolean isTiltChanged()
	{
		return isTiltChanged;
	//    0    0:aload_0         
	//    1    1:getfield        #161 <Field boolean isTiltChanged>
	//    2    4:ireturn         
	}

	public boolean isTrafficEnabled()
	{
		return isTrafficEnabled;
	//    0    0:aload_0         
	//    1    1:getfield        #131 <Field boolean isTrafficEnabled>
	//    2    4:ireturn         
	}

	public boolean isUseProFunction()
	{
		return isUseProFunction;
	//    0    0:aload_0         
	//    1    1:getfield        #197 <Field boolean isUseProFunction>
	//    2    4:ireturn         
	}

	public boolean isWorldMapEnable()
	{
		return isWorldMapEnable;
	//    0    0:aload_0         
	//    1    1:getfield        #183 <Field boolean isWorldMapEnable>
	//    2    4:ireturn         
	}

	public boolean isZoomChanged()
	{
		return isZoomChanged;
	//    0    0:aload_0         
	//    1    1:getfield        #159 <Field boolean isZoomChanged>
	//    2    4:ireturn         
	}

	public void resetChangedCounter()
	{
		changedCounter.set(0);
	//    0    0:aload_0         
	//    1    1:getfield        #208 <Field AtomicInteger changedCounter>
	//    2    4:iconst_0        
	//    3    5:invokevirtual   #346 <Method void AtomicInteger.set(int)>
	//    4    8:return          
	}

	public void resetMinMaxZoomPreference()
	{
		minZoomLevel = 3F;
	//    0    0:aload_0         
	//    1    1:ldc1            #17  <Float 3F>
	//    2    3:putfield        #116 <Field float minZoomLevel>
		maxZoomLevel = 20F;
	//    3    6:aload_0         
	//    4    7:ldc1            #14  <Float 20F>
	//    5    9:putfield        #114 <Field float maxZoomLevel>
		isSetLimitZoomLevel = false;
	//    6   12:aload_0         
	//    7   13:iconst_0        
	//    8   14:putfield        #342 <Field boolean isSetLimitZoomLevel>
	//    9   17:return          
	}

	public void setAnchorX(int i)
	{
		anchorX = i;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #175 <Field int anchorX>
	//    3    5:return          
	}

	public void setAnchorY(int i)
	{
		anchorY = i;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #193 <Field int anchorY>
	//    3    5:return          
	}

	public void setBuildingEnable(boolean flag)
	{
		isBuildingEnable = flag;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #127 <Field boolean isBuildingEnable>
	//    3    5:return          
	}

	public void setCustomBackgroundColor(int i)
	{
		customBackgroundColor = i;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #199 <Field int customBackgroundColor>
	//    3    5:return          
	}

	public void setCustomStyleEnable(boolean flag)
	{
		isCustomStyleEnabled = flag;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #133 <Field boolean isCustomStyleEnabled>
	//    3    5:return          
	}

	public void setCustomStyleID(String s)
	{
		mCustomStyleID = s;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #288 <Field String mCustomStyleID>
	//    3    5:return          
	}

	public void setCustomStylePath(String s)
	{
		mCustomStylePath = s;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #291 <Field String mCustomStylePath>
	//    3    5:return          
	}

	public void setCustomTextureResourcePath(String s)
	{
		customTextureResourcePath = s;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #294 <Field String customTextureResourcePath>
	//    3    5:return          
	}

	protected void setGridXY(int i, int j)
	{
		if(lastMapconfig != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #155 <Field MapConfig lastMapconfig>
	//*   2    4:ifnull          22
			lastMapconfig.setGridXY(gridX, gridY);
	//    3    7:aload_0         
	//    4    8:getfield        #155 <Field MapConfig lastMapconfig>
	//    5   11:aload_0         
	//    6   12:getfield        #214 <Field int gridX>
	//    7   15:aload_0         
	//    8   16:getfield        #216 <Field int gridY>
	//    9   19:invokevirtual   #221 <Method void setGridXY(int, int)>
		gridX = i;
	//   10   22:aload_0         
	//   11   23:iload_1         
	//   12   24:putfield        #214 <Field int gridX>
		gridY = j;
	//   13   27:aload_0         
	//   14   28:iload_2         
	//   15   29:putfield        #216 <Field int gridY>
	//   16   32:return          
	}

	public void setHideLogoEnble(boolean flag)
	{
		isHideLogoEnable = flag;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #181 <Field boolean isHideLogoEnable>
	//    3    5:return          
	}

	public void setIndoorEnable(boolean flag)
	{
		isIndoorEnable = flag;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #125 <Field boolean isIndoorEnable>
	//    3    5:return          
	}

	public void setLimitIPoints(IPoint aipoint[])
	{
		limitIPoints = aipoint;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #300 <Field IPoint[] limitIPoints>
	//    3    5:return          
	}

	public void setLimitLatLngBounds(LatLngBounds latlngbounds)
	{
		limitLatLngBounds = latlngbounds;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #304 <Field LatLngBounds limitLatLngBounds>
		if(latlngbounds == null)
	//*   3    5:aload_1         
	//*   4    6:ifnonnull       13
			resetMinMaxZoomPreference();
	//    5    9:aload_0         
	//    6   10:invokevirtual   #364 <Method void resetMinMaxZoomPreference()>
	//    7   13:return          
	}

	public void setMapHeight(int i)
	{
		mapHeight = i;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #309 <Field int mapHeight>
	//    3    5:return          
	}

	public void setMapLanguage(String s)
	{
		mMapLanguage = s;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #179 <Field String mMapLanguage>
	//    3    5:return          
	}

	public void setMapPerPixelUnitLength(float f)
	{
		mapPerPixelUnitLength = f;
	//    0    0:aload_0         
	//    1    1:fload_1         
	//    2    2:putfield        #313 <Field float mapPerPixelUnitLength>
	//    3    5:return          
	}

	public void setMapRect(FPoint afpoint[])
	{
		if(lastMapconfig != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #155 <Field MapConfig lastMapconfig>
	//*   2    4:ifnull          15
			lastMapconfig.setMapRect(afpoint);
	//    3    7:aload_0         
	//    4    8:getfield        #155 <Field MapConfig lastMapconfig>
	//    5   11:aload_1         
	//    6   12:invokevirtual   #371 <Method void setMapRect(FPoint[])>
		mapRect = afpoint;
	//    7   15:aload_0         
	//    8   16:aload_1         
	//    9   17:putfield        #118 <Field FPoint[] mapRect>
	//   10   20:return          
	}

	public void setMapStyleMode(int i)
	{
		mMapStyleMode = i;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #169 <Field int mMapStyleMode>
	//    3    5:return          
	}

	public void setMapStyleState(int i)
	{
		mMapStyleState = i;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #173 <Field int mMapStyleState>
	//    3    5:return          
	}

	public void setMapStyleTime(int i)
	{
		mMapStyleTime = i;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #171 <Field int mMapStyleTime>
	//    3    5:return          
	}

	public void setMapTextEnable(boolean flag)
	{
		isMapTextEnable = flag;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #129 <Field boolean isMapTextEnable>
	//    3    5:return          
	}

	public void setMapWidth(int i)
	{
		mapWidth = i;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #321 <Field int mapWidth>
	//    3    5:return          
	}

	public void setMapZoomScale(float f)
	{
		mapZoomScale = f;
	//    0    0:aload_0         
	//    1    1:fload_1         
	//    2    2:putfield        #201 <Field float mapZoomScale>
	//    3    5:return          
	}

	public void setMaxZoomLevel(float f)
	{
		float f1 = f;
	//    0    0:fload_1         
	//    1    1:fstore_2        
		if(f > 20F)
	//*   2    2:fload_1         
	//*   3    3:ldc1            #14  <Float 20F>
	//*   4    5:fcmpl           
	//*   5    6:ifle            12
			f1 = 20F;
	//    6    9:ldc1            #14  <Float 20F>
	//    7   11:fstore_2        
		f = f1;
	//    8   12:fload_2         
	//    9   13:fstore_1        
		if(f1 < 3F)
	//*  10   14:fload_2         
	//*  11   15:ldc1            #17  <Float 3F>
	//*  12   17:fcmpg           
	//*  13   18:ifge            24
			f = 3F;
	//   14   21:ldc1            #17  <Float 3F>
	//   15   23:fstore_1        
		f1 = f;
	//   16   24:fload_1         
	//   17   25:fstore_2        
		if(f < getMinZoomLevel())
	//*  18   26:fload_1         
	//*  19   27:aload_0         
	//*  20   28:invokevirtual   #380 <Method float getMinZoomLevel()>
	//*  21   31:fcmpg           
	//*  22   32:ifge            40
			f1 = getMinZoomLevel();
	//   23   35:aload_0         
	//   24   36:invokevirtual   #380 <Method float getMinZoomLevel()>
	//   25   39:fstore_2        
		isSetLimitZoomLevel = true;
	//   26   40:aload_0         
	//   27   41:iconst_1        
	//   28   42:putfield        #342 <Field boolean isSetLimitZoomLevel>
		maxZoomLevel = f1;
	//   29   45:aload_0         
	//   30   46:fload_2         
	//   31   47:putfield        #114 <Field float maxZoomLevel>
	//   32   50:return          
	}

	public void setMinZoomLevel(float f)
	{
		float f1 = f;
	//    0    0:fload_1         
	//    1    1:fstore_2        
		if(f < 3F)
	//*   2    2:fload_1         
	//*   3    3:ldc1            #17  <Float 3F>
	//*   4    5:fcmpg           
	//*   5    6:ifge            12
			f1 = 3F;
	//    6    9:ldc1            #17  <Float 3F>
	//    7   11:fstore_2        
		f = f1;
	//    8   12:fload_2         
	//    9   13:fstore_1        
		if(f1 > 20F)
	//*  10   14:fload_2         
	//*  11   15:ldc1            #14  <Float 20F>
	//*  12   17:fcmpl           
	//*  13   18:ifle            24
			f = 20F;
	//   14   21:ldc1            #14  <Float 20F>
	//   15   23:fstore_1        
		f1 = f;
	//   16   24:fload_1         
	//   17   25:fstore_2        
		if(f > getMaxZoomLevel())
	//*  18   26:fload_1         
	//*  19   27:aload_0         
	//*  20   28:invokevirtual   #383 <Method float getMaxZoomLevel()>
	//*  21   31:fcmpl           
	//*  22   32:ifle            40
			f1 = getMaxZoomLevel();
	//   23   35:aload_0         
	//   24   36:invokevirtual   #383 <Method float getMaxZoomLevel()>
	//   25   39:fstore_2        
		isSetLimitZoomLevel = true;
	//   26   40:aload_0         
	//   27   41:iconst_1        
	//   28   42:putfield        #342 <Field boolean isSetLimitZoomLevel>
		minZoomLevel = f1;
	//   29   45:aload_0         
	//   30   46:fload_2         
	//   31   47:putfield        #116 <Field float minZoomLevel>
	//   32   50:return          
	}

	public void setProFunctionAuthEnable(boolean flag)
	{
		isProFunctionAuthEnable = flag;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #195 <Field boolean isProFunctionAuthEnable>
	//    3    5:return          
	}

	public void setSC(float f)
	{
		if(lastMapconfig != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #155 <Field MapConfig lastMapconfig>
	//*   2    4:ifnull          18
			lastMapconfig.setSC(sC);
	//    3    7:aload_0         
	//    4    8:getfield        #155 <Field MapConfig lastMapconfig>
	//    5   11:aload_0         
	//    6   12:getfield        #151 <Field float sC>
	//    7   15:invokevirtual   #234 <Method void setSC(float)>
		sC = f;
	//    8   18:aload_0         
	//    9   19:fload_1         
	//   10   20:putfield        #151 <Field float sC>
	//   11   23:return          
	}

	public void setSR(float f)
	{
		if(lastMapconfig != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #155 <Field MapConfig lastMapconfig>
	//*   2    4:ifnull          18
			lastMapconfig.setSR(sR);
	//    3    7:aload_0         
	//    4    8:getfield        #155 <Field MapConfig lastMapconfig>
	//    5   11:aload_0         
	//    6   12:getfield        #153 <Field float sR>
	//    7   15:invokevirtual   #237 <Method void setSR(float)>
		sR = f;
	//    8   18:aload_0         
	//    9   19:fload_1         
	//   10   20:putfield        #153 <Field float sR>
	//   11   23:return          
	}

	public void setSX(int i)
	{
		if(lastMapconfig != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #155 <Field MapConfig lastMapconfig>
	//*   2    4:ifnull          18
			lastMapconfig.setSX(sX);
	//    3    7:aload_0         
	//    4    8:getfield        #155 <Field MapConfig lastMapconfig>
	//    5   11:aload_0         
	//    6   12:getfield        #136 <Field int sX>
	//    7   15:invokevirtual   #224 <Method void setSX(int)>
		sX = i;
	//    8   18:aload_0         
	//    9   19:iload_1         
	//   10   20:putfield        #136 <Field int sX>
		mapGeoCenter.x = sX;
	//   11   23:aload_0         
	//   12   24:getfield        #146 <Field IPoint mapGeoCenter>
	//   13   27:aload_0         
	//   14   28:getfield        #136 <Field int sX>
	//   15   31:putfield        #387 <Field int IPoint.x>
	//   16   34:return          
	}

	public void setSY(int i)
	{
		if(lastMapconfig != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #155 <Field MapConfig lastMapconfig>
	//*   2    4:ifnull          18
			lastMapconfig.setSY(sY);
	//    3    7:aload_0         
	//    4    8:getfield        #155 <Field MapConfig lastMapconfig>
	//    5   11:aload_0         
	//    6   12:getfield        #139 <Field int sY>
	//    7   15:invokevirtual   #227 <Method void setSY(int)>
		sY = i;
	//    8   18:aload_0         
	//    9   19:iload_1         
	//   10   20:putfield        #139 <Field int sY>
		mapGeoCenter.x = sY;
	//   11   23:aload_0         
	//   12   24:getfield        #146 <Field IPoint mapGeoCenter>
	//   13   27:aload_0         
	//   14   28:getfield        #139 <Field int sY>
	//   15   31:putfield        #387 <Field int IPoint.x>
	//   16   34:return          
	}

	public void setSZ(float f)
	{
		if(lastMapconfig != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #155 <Field MapConfig lastMapconfig>
	//*   2    4:ifnull          18
			lastMapconfig.setSZ(sZ);
	//    3    7:aload_0         
	//    4    8:getfield        #155 <Field MapConfig lastMapconfig>
	//    5   11:aload_0         
	//    6   12:getfield        #149 <Field float sZ>
	//    7   15:invokevirtual   #231 <Method void setSZ(float)>
		sZ = f;
	//    8   18:aload_0         
	//    9   19:fload_1         
	//   10   20:putfield        #149 <Field float sZ>
	//   11   23:return          
	}

	public void setSkyHeight(float f)
	{
		skyHeight = f;
	//    0    0:aload_0         
	//    1    1:fload_1         
	//    2    2:putfield        #330 <Field float skyHeight>
	//    3    5:return          
	}

	public void setTrafficEnabled(boolean flag)
	{
		isTrafficEnabled = flag;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #131 <Field boolean isTrafficEnabled>
	//    3    5:return          
	}

	public void setUseProFunction(boolean flag)
	{
		isUseProFunction = flag;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #197 <Field boolean isUseProFunction>
	//    3    5:return          
	}

	public void setWorldMapEnable(boolean flag)
	{
		isWorldMapEnable = flag;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #183 <Field boolean isWorldMapEnable>
	//    3    5:return          
	}

	public String toString()
	{
		StringBuilder stringbuilder = new StringBuilder();
	//    0    0:new             #394 <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #395 <Method void StringBuilder()>
	//    3    7:astore_1        
		stringbuilder.append(" sX: ");
	//    4    8:aload_1         
	//    5    9:ldc2            #397 <String " sX: ">
	//    6   12:invokevirtual   #401 <Method StringBuilder StringBuilder.append(String)>
	//    7   15:pop             
		stringbuilder.append(sX);
	//    8   16:aload_1         
	//    9   17:aload_0         
	//   10   18:getfield        #136 <Field int sX>
	//   11   21:invokevirtual   #404 <Method StringBuilder StringBuilder.append(int)>
	//   12   24:pop             
		stringbuilder.append(" sY: ");
	//   13   25:aload_1         
	//   14   26:ldc2            #406 <String " sY: ">
	//   15   29:invokevirtual   #401 <Method StringBuilder StringBuilder.append(String)>
	//   16   32:pop             
		stringbuilder.append(sY);
	//   17   33:aload_1         
	//   18   34:aload_0         
	//   19   35:getfield        #139 <Field int sY>
	//   20   38:invokevirtual   #404 <Method StringBuilder StringBuilder.append(int)>
	//   21   41:pop             
		stringbuilder.append(" sZ: ");
	//   22   42:aload_1         
	//   23   43:ldc2            #408 <String " sZ: ">
	//   24   46:invokevirtual   #401 <Method StringBuilder StringBuilder.append(String)>
	//   25   49:pop             
		stringbuilder.append(sZ);
	//   26   50:aload_1         
	//   27   51:aload_0         
	//   28   52:getfield        #149 <Field float sZ>
	//   29   55:invokevirtual   #411 <Method StringBuilder StringBuilder.append(float)>
	//   30   58:pop             
		stringbuilder.append(" sC: ");
	//   31   59:aload_1         
	//   32   60:ldc2            #413 <String " sC: ">
	//   33   63:invokevirtual   #401 <Method StringBuilder StringBuilder.append(String)>
	//   34   66:pop             
		stringbuilder.append(sC);
	//   35   67:aload_1         
	//   36   68:aload_0         
	//   37   69:getfield        #151 <Field float sC>
	//   38   72:invokevirtual   #411 <Method StringBuilder StringBuilder.append(float)>
	//   39   75:pop             
		stringbuilder.append(" sR: ");
	//   40   76:aload_1         
	//   41   77:ldc2            #415 <String " sR: ">
	//   42   80:invokevirtual   #401 <Method StringBuilder StringBuilder.append(String)>
	//   43   83:pop             
		stringbuilder.append(sR);
	//   44   84:aload_1         
	//   45   85:aload_0         
	//   46   86:getfield        #153 <Field float sR>
	//   47   89:invokevirtual   #411 <Method StringBuilder StringBuilder.append(float)>
	//   48   92:pop             
		stringbuilder.append(" skyHeight: ");
	//   49   93:aload_1         
	//   50   94:ldc2            #417 <String " skyHeight: ">
	//   51   97:invokevirtual   #401 <Method StringBuilder StringBuilder.append(String)>
	//   52  100:pop             
		stringbuilder.append(skyHeight);
	//   53  101:aload_1         
	//   54  102:aload_0         
	//   55  103:getfield        #330 <Field float skyHeight>
	//   56  106:invokevirtual   #411 <Method StringBuilder StringBuilder.append(float)>
	//   57  109:pop             
		return stringbuilder.toString();
	//   58  110:aload_1         
	//   59  111:invokevirtual   #419 <Method String StringBuilder.toString()>
	//   60  114:areturn         
	}

	public void updateFinalMatrix()
	{
		Matrix.multiplyMM(mvpMatrix, 0, projectionMatrix, 0, viewMatrix, 0);
	//    0    0:aload_0         
	//    1    1:getfield        #189 <Field float[] mvpMatrix>
	//    2    4:iconst_0        
	//    3    5:aload_0         
	//    4    6:getfield        #187 <Field float[] projectionMatrix>
	//    5    9:iconst_0        
	//    6   10:aload_0         
	//    7   11:getfield        #185 <Field float[] viewMatrix>
	//    8   14:iconst_0        
	//    9   15:invokestatic    #426 <Method void Matrix.multiplyMM(float[], int, float[], int, float[], int)>
	//   10   18:return          
	}

	public void updateMapRectNextFrame(boolean flag)
	{
		isNeedUpdateMapRectNextFrame = flag;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #167 <Field boolean isNeedUpdateMapRectNextFrame>
	//    3    5:return          
	}

	public static final int DEFAULT_RATIO = 1;
	private static final int GEO_POINT_ZOOM = 20;
	public static final float MAX_ZOOM = 20F;
	public static final float MAX_ZOOM_INDOOR = 20F;
	public static final float MIN_ZOOM = 3F;
	public static final int MSG_ACTION_ONBASEPOICLICK = 20;
	public static final int MSG_ACTION_ONMAPCLICK = 19;
	public static final int MSG_AUTH_FAILURE = 2;
	public static final int MSG_CALLBACK_MAPLOADED = 16;
	public static final int MSG_CALLBACK_ONTOUCHEVENT = 14;
	public static final int MSG_CALLBACK_SCREENSHOT = 15;
	public static final int MSG_CAMERAUPDATE_CHANGE = 10;
	public static final int MSG_CAMERAUPDATE_FINISH = 11;
	public static final int MSG_COMPASSVIEW_CHANGESTATE = 13;
	public static final int MSG_INFOWINDOW_UPDATE = 18;
	public static final int MSG_TILEOVERLAY_REFRESH = 17;
	public static final int MSG_ZOOMVIEW_CHANGESTATE = 12;
	private static final int TILE_SIZE_POW = 8;
	private int anchorX;
	private int anchorY;
	private volatile double changeGridRatio;
	private volatile double changeRatio;
	private AtomicInteger changedCounter;
	private int customBackgroundColor;
	private String customTextureResourcePath;
	private Rectangle geoRectangle;
	private int gridX;
	private int gridY;
	private boolean isBearingChanged;
	private boolean isBuildingEnable;
	private boolean isCenterChanged;
	private boolean isCustomStyleEnabled;
	private boolean isHideLogoEnable;
	private boolean isIndoorEnable;
	private boolean isMapTextEnable;
	private boolean isNeedUpdateMapRectNextFrame;
	private boolean isNeedUpdateZoomControllerState;
	private boolean isProFunctionAuthEnable;
	private boolean isSetLimitZoomLevel;
	private boolean isTiltChanged;
	private boolean isTrafficEnabled;
	private boolean isUseProFunction;
	private boolean isWorldMapEnable;
	private boolean isZoomChanged;
	MapConfig lastMapconfig;
	private IPoint limitIPoints[];
	private LatLngBounds limitLatLngBounds;
	private String mCustomStyleID;
	private String mCustomStylePath;
	private String mMapLanguage;
	private int mMapStyleMode;
	private int mMapStyleState;
	private int mMapStyleTime;
	private IPoint mapGeoCenter;
	private int mapHeight;
	private float mapPerPixelUnitLength;
	private FPoint mapRect[];
	private int mapWidth;
	private float mapZoomScale;
	public float maxZoomLevel;
	public float minZoomLevel;
	float mvpMatrix[];
	float projectionMatrix[];
	private float sC;
	private float sR;
	private int sX;
	private int sY;
	private float sZ;
	private float skyHeight;
	int tilsIDs[];
	float viewMatrix[];
}
