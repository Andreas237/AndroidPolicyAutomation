// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.amap.api.maps.model;

import android.graphics.Bitmap;
import android.graphics.Color;
import android.support.v4.util.LongSparseArray;
import android.util.Log;
import com.amap.api.mapcore.util.eh;
import com.amap.api.maps.AMapException;
import com.autonavi.amap.mapcore.DPoint;
import java.io.ByteArrayOutputStream;
import java.lang.reflect.Array;
import java.util.*;

// Referenced classes of package com.amap.api.maps.model:
//			TileProvider, Gradient, WeightedLatLng, Tile, 
//			LatLng, a

public class HeatmapTileProvider
	implements TileProvider
{
	public static class Builder
	{

		static Collection a(Builder builder)
		{
			return builder.a;
		//    0    0:aload_0         
		//    1    1:getfield        #35  <Field Collection a>
		//    2    4:areturn         
		}

		static int b(Builder builder)
		{
			return builder.b;
		//    0    0:aload_0         
		//    1    1:getfield        #22  <Field int b>
		//    2    4:ireturn         
		}

		static Gradient c(Builder builder)
		{
			return builder.c;
		//    0    0:aload_0         
		//    1    1:getfield        #27  <Field Gradient c>
		//    2    4:areturn         
		}

		static double d(Builder builder)
		{
			return builder.d;
		//    0    0:aload_0         
		//    1    1:getfield        #31  <Field double d>
		//    2    4:dreturn         
		}

		public HeatmapTileProvider build()
		{
			if(a == null || a.size() == 0)
		//*   0    0:aload_0         
		//*   1    1:getfield        #35  <Field Collection a>
		//*   2    4:ifnull          19
		//*   3    7:aload_0         
		//*   4    8:getfield        #35  <Field Collection a>
		//*   5   11:invokeinterface #50  <Method int Collection.size()>
		//*   6   16:ifne            46
				try
				{
					throw new AMapException("No input points.");
		//    7   19:new             #42  <Class AMapException>
		//    8   22:dup             
		//    9   23:ldc1            #52  <String "No input points.">
		//   10   25:invokespecial   #55  <Method void AMapException(String)>
		//   11   28:athrow          
				}
				catch(AMapException amapexception)
		//*  12   29:astore_1        
				{
					Log.e("amap", amapexception.getErrorMessage());
		//   13   30:ldc1            #57  <String "amap">
		//   14   32:aload_1         
		//   15   33:invokevirtual   #61  <Method String AMapException.getErrorMessage()>
		//   16   36:invokestatic    #67  <Method int Log.e(String, String)>
		//   17   39:pop             
					amapexception.printStackTrace();
		//   18   40:aload_1         
		//   19   41:invokevirtual   #70  <Method void AMapException.printStackTrace()>
					return null;
		//   20   44:aconst_null     
		//   21   45:areturn         
				}
			HeatmapTileProvider heatmaptileprovider;
			try
			{
				heatmaptileprovider = new HeatmapTileProvider(this);
		//   22   46:new             #6   <Class HeatmapTileProvider>
		//   23   49:dup             
		//   24   50:aload_0         
		//   25   51:aconst_null     
		//   26   52:invokespecial   #73  <Method void HeatmapTileProvider(HeatmapTileProvider$Builder, HeatmapTileProvider$1)>
		//   27   55:astore_1        
			}
		//*  28   56:aload_1         
		//*  29   57:areturn         
			catch(Throwable throwable)
		//*  30   58:astore_1        
			{
				throwable.printStackTrace();
		//   31   59:aload_1         
		//   32   60:invokevirtual   #74  <Method void Throwable.printStackTrace()>
				return null;
		//   33   63:aconst_null     
		//   34   64:areturn         
			}
			return heatmaptileprovider;
		}

		public Builder data(Collection collection)
		{
			return weightedData(HeatmapTileProvider.b(collection));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokestatic    #79  <Method Collection HeatmapTileProvider.b(Collection)>
		//    3    5:invokevirtual   #82  <Method HeatmapTileProvider$Builder weightedData(Collection)>
		//    4    8:areturn         
		}

		public Builder gradient(Gradient gradient1)
		{
			c = gradient1;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #27  <Field Gradient c>
			return this;
		//    3    5:aload_0         
		//    4    6:areturn         
		}

		public Builder radius(int l)
		{
			b = Math.max(10, Math.min(l, 50));
		//    0    0:aload_0         
		//    1    1:bipush          10
		//    2    3:iload_1         
		//    3    4:bipush          50
		//    4    6:invokestatic    #94  <Method int Math.min(int, int)>
		//    5    9:invokestatic    #97  <Method int Math.max(int, int)>
		//    6   12:putfield        #22  <Field int b>
			return this;
		//    7   15:aload_0         
		//    8   16:areturn         
		}

		public Builder transparency(double d1)
		{
			d = Math.max(0.0D, Math.min(d1, 1.0D));
		//    0    0:aload_0         
		//    1    1:dconst_0        
		//    2    2:dload_1         
		//    3    3:dconst_1        
		//    4    4:invokestatic    #102 <Method double Math.min(double, double)>
		//    5    7:invokestatic    #104 <Method double Math.max(double, double)>
		//    6   10:putfield        #31  <Field double d>
			return this;
		//    7   13:aload_0         
		//    8   14:areturn         
		}

		public Builder weightedData(Collection collection)
		{
			a = collection;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #35  <Field Collection a>
			return this;
		//    3    5:aload_0         
		//    4    6:areturn         
		}

		private Collection a;
		private int b;
		private Gradient c;
		private double d;

		public Builder()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #20  <Method void Object()>
			b = 12;
		//    2    4:aload_0         
		//    3    5:bipush          12
		//    4    7:putfield        #22  <Field int b>
			c = HeatmapTileProvider.DEFAULT_GRADIENT;
		//    5   10:aload_0         
		//    6   11:getstatic       #25  <Field Gradient HeatmapTileProvider.DEFAULT_GRADIENT>
		//    7   14:putfield        #27  <Field Gradient c>
			d = 0.59999999999999998D;
		//    8   17:aload_0         
		//    9   18:ldc2w           #28  <Double 0.59999999999999998D>
		//   10   21:putfield        #31  <Field double d>
		//   11   24:return          
		}
	}


	private HeatmapTileProvider(Builder builder)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #63  <Method void Object()>
		d = Builder.a(builder);
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:invokestatic    #66  <Method Collection HeatmapTileProvider$Builder.a(HeatmapTileProvider$Builder)>
	//    5    9:putfield        #68  <Field Collection d>
		f = Builder.b(builder);
	//    6   12:aload_0         
	//    7   13:aload_1         
	//    8   14:invokestatic    #71  <Method int HeatmapTileProvider$Builder.b(HeatmapTileProvider$Builder)>
	//    9   17:putfield        #73  <Field int f>
		g = Builder.c(builder);
	//   10   20:aload_0         
	//   11   21:aload_1         
	//   12   22:invokestatic    #76  <Method Gradient HeatmapTileProvider$Builder.c(HeatmapTileProvider$Builder)>
	//   13   25:putfield        #78  <Field Gradient g>
		if(g == null || !g.isAvailable())
	//*  14   28:aload_0         
	//*  15   29:getfield        #78  <Field Gradient g>
	//*  16   32:ifnull          45
	//*  17   35:aload_0         
	//*  18   36:getfield        #78  <Field Gradient g>
	//*  19   39:invokevirtual   #82  <Method boolean Gradient.isAvailable()>
	//*  20   42:ifne            52
			g = DEFAULT_GRADIENT;
	//   21   45:aload_0         
	//   22   46:getstatic       #59  <Field Gradient DEFAULT_GRADIENT>
	//   23   49:putfield        #78  <Field Gradient g>
		j = Builder.d(builder);
	//   24   52:aload_0         
	//   25   53:aload_1         
	//   26   54:invokestatic    #85  <Method double HeatmapTileProvider$Builder.d(HeatmapTileProvider$Builder)>
	//   27   57:putfield        #87  <Field double j>
		i = a(f, (double)f / 3D);
	//   28   60:aload_0         
	//   29   61:aload_0         
	//   30   62:getfield        #73  <Field int f>
	//   31   65:aload_0         
	//   32   66:getfield        #73  <Field int f>
	//   33   69:i2d             
	//   34   70:ldc2w           #88  <Double 3D>
	//   35   73:ddiv            
	//   36   74:invokestatic    #92  <Method double[] a(int, double)>
	//   37   77:putfield        #94  <Field double[] i>
		a(g);
	//   38   80:aload_0         
	//   39   81:aload_0         
	//   40   82:getfield        #78  <Field Gradient g>
	//   41   85:invokespecial   #97  <Method void a(Gradient)>
		c(d);
	//   42   88:aload_0         
	//   43   89:aload_0         
	//   44   90:getfield        #68  <Field Collection d>
	//   45   93:invokespecial   #100 <Method void c(Collection)>
	//   46   96:return          
	}


	static double a(Collection collection, eh eh1, int l, int i1)
	{
		double d4 = eh1.a;
	//    0    0:aload_1         
	//    1    1:getfield        #108 <Field double eh.a>
	//    2    4:dstore          8
		double d1 = eh1.c;
	//    3    6:aload_1         
	//    4    7:getfield        #110 <Field double eh.c>
	//    5   10:dstore          4
		double d5 = eh1.b;
	//    6   12:aload_1         
	//    7   13:getfield        #112 <Field double eh.b>
	//    8   16:dstore          10
		double d2 = eh1.d;
	//    9   18:aload_1         
	//   10   19:getfield        #114 <Field double eh.d>
	//   11   22:dstore          6
		if(d1 - d4 > d2 - d5)
	//*  12   24:dload           4
	//*  13   26:dload           8
	//*  14   28:dsub            
	//*  15   29:dload           6
	//*  16   31:dload           10
	//*  17   33:dsub            
	//*  18   34:dcmpl           
	//*  19   35:ifle            48
			d1 -= d4;
	//   20   38:dload           4
	//   21   40:dload           8
	//   22   42:dsub            
	//   23   43:dstore          4
		else
	//*  24   45:goto            55
			d1 = d2 - d5;
	//   25   48:dload           6
	//   26   50:dload           10
	//   27   52:dsub            
	//   28   53:dstore          4
		double d6 = (double)(int)((double)(i1 / (l * 2)) + 0.5D) / d1;
	//   29   55:iload_3         
	//   30   56:iload_2         
	//   31   57:iconst_2        
	//   32   58:imul            
	//   33   59:idiv            
	//   34   60:i2d             
	//   35   61:ldc2w           #115 <Double 0.5D>
	//   36   64:dadd            
	//   37   65:d2i             
	//   38   66:i2d             
	//   39   67:dload           4
	//   40   69:ddiv            
	//   41   70:dstore          12
		LongSparseArray longsparsearray = new LongSparseArray();
	//   42   72:new             #118 <Class LongSparseArray>
	//   43   75:dup             
	//   44   76:invokespecial   #119 <Method void LongSparseArray()>
	//   45   79:astore          17
		d1 = 0.0D;
	//   46   81:dconst_0        
	//   47   82:dstore          4
		for(Iterator iterator = collection.iterator(); iterator.hasNext();)
	//*  48   84:aload_0         
	//*  49   85:invokeinterface #125 <Method Iterator Collection.iterator()>
	//*  50   90:astore          18
	//*  51   92:aload           18
	//*  52   94:invokeinterface #130 <Method boolean Iterator.hasNext()>
	//*  53   99:ifeq            259
		{
			WeightedLatLng weightedlatlng = (WeightedLatLng)iterator.next();
	//   54  102:aload           18
	//   55  104:invokeinterface #134 <Method Object Iterator.next()>
	//   56  109:checkcast       #136 <Class WeightedLatLng>
	//   57  112:astore          19
			double d3 = weightedlatlng.getPoint().x;
	//   58  114:aload           19
	//   59  116:invokevirtual   #140 <Method DPoint WeightedLatLng.getPoint()>
	//   60  119:getfield        #145 <Field double DPoint.x>
	//   61  122:dstore          6
			double d7 = weightedlatlng.getPoint().y;
	//   62  124:aload           19
	//   63  126:invokevirtual   #140 <Method DPoint WeightedLatLng.getPoint()>
	//   64  129:getfield        #148 <Field double DPoint.y>
	//   65  132:dstore          14
			l = (int)((d3 - d4) * d6);
	//   66  134:dload           6
	//   67  136:dload           8
	//   68  138:dsub            
	//   69  139:dload           12
	//   70  141:dmul            
	//   71  142:d2i             
	//   72  143:istore_2        
			i1 = (int)((d7 - d5) * d6);
	//   73  144:dload           14
	//   74  146:dload           10
	//   75  148:dsub            
	//   76  149:dload           12
	//   77  151:dmul            
	//   78  152:d2i             
	//   79  153:istore_3        
			eh1 = ((eh) ((LongSparseArray)longsparsearray.get(l)));
	//   80  154:aload           17
	//   81  156:iload_2         
	//   82  157:i2l             
	//   83  158:invokevirtual   #152 <Method Object LongSparseArray.get(long)>
	//   84  161:checkcast       #118 <Class LongSparseArray>
	//   85  164:astore_1        
			collection = ((Collection) (eh1));
	//   86  165:aload_1         
	//   87  166:astore_0        
			if(eh1 == null)
	//*  88  167:aload_1         
	//*  89  168:ifnonnull       187
			{
				collection = ((Collection) (new LongSparseArray()));
	//   90  171:new             #118 <Class LongSparseArray>
	//   91  174:dup             
	//   92  175:invokespecial   #119 <Method void LongSparseArray()>
	//   93  178:astore_0        
				longsparsearray.put(l, ((Object) (collection)));
	//   94  179:aload           17
	//   95  181:iload_2         
	//   96  182:i2l             
	//   97  183:aload_0         
	//   98  184:invokevirtual   #156 <Method void LongSparseArray.put(long, Object)>
			}
			Double double1 = (Double)((LongSparseArray) (collection)).get(i1);
	//   99  187:aload_0         
	//  100  188:iload_3         
	//  101  189:i2l             
	//  102  190:invokevirtual   #152 <Method Object LongSparseArray.get(long)>
	//  103  193:checkcast       #158 <Class Double>
	//  104  196:astore          16
			eh1 = ((eh) (double1));
	//  105  198:aload           16
	//  106  200:astore_1        
			if(double1 == null)
	//* 107  201:aload           16
	//* 108  203:ifnonnull       211
				eh1 = ((eh) (Double.valueOf(0.0D)));
	//  109  206:dconst_0        
	//  110  207:invokestatic    #162 <Method Double Double.valueOf(double)>
	//  111  210:astore_1        
			eh1 = ((eh) (Double.valueOf(((Double) (eh1)).doubleValue() + weightedlatlng.intensity)));
	//  112  211:aload_1         
	//  113  212:invokevirtual   #166 <Method double Double.doubleValue()>
	//  114  215:aload           19
	//  115  217:getfield        #169 <Field double WeightedLatLng.intensity>
	//  116  220:dadd            
	//  117  221:invokestatic    #162 <Method Double Double.valueOf(double)>
	//  118  224:astore_1        
			((LongSparseArray) (collection)).put(i1, ((Object) (eh1)));
	//  119  225:aload_0         
	//  120  226:iload_3         
	//  121  227:i2l             
	//  122  228:aload_1         
	//  123  229:invokevirtual   #156 <Method void LongSparseArray.put(long, Object)>
			d3 = d1;
	//  124  232:dload           4
	//  125  234:dstore          6
			if(((Double) (eh1)).doubleValue() > d1)
	//* 126  236:aload_1         
	//* 127  237:invokevirtual   #166 <Method double Double.doubleValue()>
	//* 128  240:dload           4
	//* 129  242:dcmpl           
	//* 130  243:ifle            252
				d3 = ((Double) (eh1)).doubleValue();
	//  131  246:aload_1         
	//  132  247:invokevirtual   #166 <Method double Double.doubleValue()>
	//  133  250:dstore          6
			d1 = d3;
	//  134  252:dload           6
	//  135  254:dstore          4
		}

	//* 136  256:goto            92
		return d1;
	//  137  259:dload           4
	//  138  261:dreturn         
	}

	static Bitmap a(double ad[][], int ai[], double d1)
	{
		int j1 = ai[ai.length - 1];
	//    0    0:aload_1         
	//    1    1:aload_1         
	//    2    2:arraylength     
	//    3    3:iconst_1        
	//    4    4:isub            
	//    5    5:iaload          
	//    6    6:istore          8
		d1 = (double)(ai.length - 1) / d1;
	//    7    8:aload_1         
	//    8    9:arraylength     
	//    9   10:iconst_1        
	//   10   11:isub            
	//   11   12:i2d             
	//   12   13:dload_2         
	//   13   14:ddiv            
	//   14   15:dstore_2        
		int k1 = ad.length;
	//   15   16:aload_0         
	//   16   17:arraylength     
	//   17   18:istore          9
		int ai1[] = new int[k1 * k1];
	//   18   20:iload           9
	//   19   22:iload           9
	//   20   24:imul            
	//   21   25:newarray        int[]
	//   22   27:astore          12
		for(int l = 0; l < k1; l++)
	//*  23   29:iconst_0        
	//*  24   30:istore          6
	//*  25   32:iload           6
	//*  26   34:iload           9
	//*  27   36:icmpge          135
		{
			for(int i1 = 0; i1 < k1; i1++)
	//*  28   39:iconst_0        
	//*  29   40:istore          7
	//*  30   42:iload           7
	//*  31   44:iload           9
	//*  32   46:icmpge          126
			{
				double d2 = ad[i1][l];
	//   33   49:aload_0         
	//   34   50:iload           7
	//   35   52:aaload          
	//   36   53:iload           6
	//   37   55:daload          
	//   38   56:dstore          4
				int l1 = l * k1 + i1;
	//   39   58:iload           6
	//   40   60:iload           9
	//   41   62:imul            
	//   42   63:iload           7
	//   43   65:iadd            
	//   44   66:istore          10
				int i2 = (int)(d2 * d1);
	//   45   68:dload           4
	//   46   70:dload_2         
	//   47   71:dmul            
	//   48   72:d2i             
	//   49   73:istore          11
				if(d2 != 0.0D)
	//*  50   75:dload           4
	//*  51   77:dconst_0        
	//*  52   78:dcmpl           
	//*  53   79:ifeq            111
				{
					if(i2 < ai.length)
	//*  54   82:iload           11
	//*  55   84:aload_1         
	//*  56   85:arraylength     
	//*  57   86:icmpge          101
						ai1[l1] = ai[i2];
	//   58   89:aload           12
	//   59   91:iload           10
	//   60   93:aload_1         
	//   61   94:iload           11
	//   62   96:iaload          
	//   63   97:iastore         
					else
	//*  64   98:goto            117
						ai1[l1] = j1;
	//   65  101:aload           12
	//   66  103:iload           10
	//   67  105:iload           8
	//   68  107:iastore         
				} else
	//*  69  108:goto            117
				{
					ai1[l1] = 0;
	//   70  111:aload           12
	//   71  113:iload           10
	//   72  115:iconst_0        
	//   73  116:iastore         
				}
			}

	//   74  117:iload           7
	//   75  119:iconst_1        
	//   76  120:iadd            
	//   77  121:istore          7
		}

	//   78  123:goto            42
	//   79  126:iload           6
	//   80  128:iconst_1        
	//   81  129:iadd            
	//   82  130:istore          6
	//*  83  132:goto            32
		ad = ((double [][]) (Bitmap.createBitmap(k1, k1, android.graphics.Bitmap.Config.ARGB_8888)));
	//   84  135:iload           9
	//   85  137:iload           9
	//   86  139:getstatic       #178 <Field android.graphics.Bitmap$Config android.graphics.Bitmap$Config.ARGB_8888>
	//   87  142:invokestatic    #184 <Method Bitmap Bitmap.createBitmap(int, int, android.graphics.Bitmap$Config)>
	//   88  145:astore_0        
		((Bitmap) (ad)).setPixels(ai1, 0, k1, 0, 0, k1, k1);
	//   89  146:aload_0         
	//   90  147:aload           12
	//   91  149:iconst_0        
	//   92  150:iload           9
	//   93  152:iconst_0        
	//   94  153:iconst_0        
	//   95  154:iload           9
	//   96  156:iload           9
	//   97  158:invokevirtual   #188 <Method void Bitmap.setPixels(int[], int, int, int, int, int, int)>
		return ((Bitmap) (ad));
	//   98  161:aload_0         
	//   99  162:areturn         
	}

	static eh a(Collection collection)
	{
		collection = ((Collection) (collection.iterator()));
	//    0    0:aload_0         
	//    1    1:invokeinterface #125 <Method Iterator Collection.iterator()>
	//    2    6:astore_0        
		WeightedLatLng weightedlatlng = (WeightedLatLng)((Iterator) (collection)).next();
	//    3    7:aload_0         
	//    4    8:invokeinterface #134 <Method Object Iterator.next()>
	//    5   13:checkcast       #136 <Class WeightedLatLng>
	//    6   16:astore          19
		double d7 = weightedlatlng.getPoint().x;
	//    7   18:aload           19
	//    8   20:invokevirtual   #140 <Method DPoint WeightedLatLng.getPoint()>
	//    9   23:getfield        #145 <Field double DPoint.x>
	//   10   26:dstore          13
		double d5 = weightedlatlng.getPoint().x;
	//   11   28:aload           19
	//   12   30:invokevirtual   #140 <Method DPoint WeightedLatLng.getPoint()>
	//   13   33:getfield        #145 <Field double DPoint.x>
	//   14   36:dstore          9
		double d2 = weightedlatlng.getPoint().y;
	//   15   38:aload           19
	//   16   40:invokevirtual   #140 <Method DPoint WeightedLatLng.getPoint()>
	//   17   43:getfield        #148 <Field double DPoint.y>
	//   18   46:dstore_3        
		double d1;
		double d9;
		for(d1 = weightedlatlng.getPoint().y; ((Iterator) (collection)).hasNext(); d1 = d9)
	//*  19   47:aload           19
	//*  20   49:invokevirtual   #140 <Method DPoint WeightedLatLng.getPoint()>
	//*  21   52:getfield        #148 <Field double DPoint.y>
	//*  22   55:dstore_1        
	//*  23   56:aload_0         
	//*  24   57:invokeinterface #130 <Method boolean Iterator.hasNext()>
	//*  25   62:ifeq            173
		{
			WeightedLatLng weightedlatlng1 = (WeightedLatLng)((Iterator) (collection)).next();
	//   26   65:aload_0         
	//   27   66:invokeinterface #134 <Method Object Iterator.next()>
	//   28   71:checkcast       #136 <Class WeightedLatLng>
	//   29   74:astore          19
			double d8 = weightedlatlng1.getPoint().x;
	//   30   76:aload           19
	//   31   78:invokevirtual   #140 <Method DPoint WeightedLatLng.getPoint()>
	//   32   81:getfield        #145 <Field double DPoint.x>
	//   33   84:dstore          15
			double d3 = weightedlatlng1.getPoint().y;
	//   34   86:aload           19
	//   35   88:invokevirtual   #140 <Method DPoint WeightedLatLng.getPoint()>
	//   36   91:getfield        #148 <Field double DPoint.y>
	//   37   94:dstore          5
			double d4 = d7;
	//   38   96:dload           13
	//   39   98:dstore          7
			if(d8 < d7)
	//*  40  100:dload           15
	//*  41  102:dload           13
	//*  42  104:dcmpg           
	//*  43  105:ifge            112
				d4 = d8;
	//   44  108:dload           15
	//   45  110:dstore          7
			double d6 = d5;
	//   46  112:dload           9
	//   47  114:dstore          11
			if(d8 > d5)
	//*  48  116:dload           15
	//*  49  118:dload           9
	//*  50  120:dcmpl           
	//*  51  121:ifle            128
				d6 = d8;
	//   52  124:dload           15
	//   53  126:dstore          11
			d8 = d2;
	//   54  128:dload_3         
	//   55  129:dstore          15
			if(d3 < d2)
	//*  56  131:dload           5
	//*  57  133:dload_3         
	//*  58  134:dcmpg           
	//*  59  135:ifge            142
				d8 = d3;
	//   60  138:dload           5
	//   61  140:dstore          15
			d9 = d1;
	//   62  142:dload_1         
	//   63  143:dstore          17
			if(d3 > d1)
	//*  64  145:dload           5
	//*  65  147:dload_1         
	//*  66  148:dcmpl           
	//*  67  149:ifle            156
				d9 = d3;
	//   68  152:dload           5
	//   69  154:dstore          17
			d7 = d4;
	//   70  156:dload           7
	//   71  158:dstore          13
			d5 = d6;
	//   72  160:dload           11
	//   73  162:dstore          9
			d2 = d8;
	//   74  164:dload           15
	//   75  166:dstore_3        
		}

	//   76  167:dload           17
	//   77  169:dstore_1        
	//*  78  170:goto            56
		return new eh(d7, d5, d2, d1);
	//   79  173:new             #106 <Class eh>
	//   80  176:dup             
	//   81  177:dload           13
	//   82  179:dload           9
	//   83  181:dload_3         
	//   84  182:dload_1         
	//   85  183:invokespecial   #192 <Method void eh(double, double, double, double)>
	//   86  186:areturn         
	}

	private static Tile a(Bitmap bitmap)
	{
		ByteArrayOutputStream bytearrayoutputstream = new ByteArrayOutputStream();
	//    0    0:new             #196 <Class ByteArrayOutputStream>
	//    1    3:dup             
	//    2    4:invokespecial   #197 <Method void ByteArrayOutputStream()>
	//    3    7:astore_1        
		bitmap.compress(android.graphics.Bitmap.CompressFormat.PNG, 100, ((java.io.OutputStream) (bytearrayoutputstream)));
	//    4    8:aload_0         
	//    5    9:getstatic       #203 <Field android.graphics.Bitmap$CompressFormat android.graphics.Bitmap$CompressFormat.PNG>
	//    6   12:bipush          100
	//    7   14:aload_1         
	//    8   15:invokevirtual   #207 <Method boolean Bitmap.compress(android.graphics.Bitmap$CompressFormat, int, java.io.OutputStream)>
	//    9   18:pop             
		return Tile.obtain(256, 256, bytearrayoutputstream.toByteArray());
	//   10   19:sipush          256
	//   11   22:sipush          256
	//   12   25:aload_1         
	//   13   26:invokevirtual   #211 <Method byte[] ByteArrayOutputStream.toByteArray()>
	//   14   29:invokestatic    #217 <Method Tile Tile.obtain(int, int, byte[])>
	//   15   32:areturn         
	}

	private void a(Gradient gradient)
	{
		g = gradient;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #78  <Field Gradient g>
		h = gradient.generateColorMap(j);
	//    3    5:aload_0         
	//    4    6:aload_1         
	//    5    7:aload_0         
	//    6    8:getfield        #87  <Field double j>
	//    7   11:invokevirtual   #221 <Method int[] Gradient.generateColorMap(double)>
	//    8   14:putfield        #223 <Field int[] h>
	//    9   17:return          
	}

	private double[] a(int l)
	{
		double ad[] = new double[21];
	//    0    0:bipush          21
	//    1    2:newarray        double[]
	//    2    4:astore          4
		for(int i1 = 5; i1 < 11; i1++)
	//*   3    6:iconst_5        
	//*   4    7:istore_2        
	//*   5    8:iload_2         
	//*   6    9:bipush          11
	//*   7   11:icmpge          77
		{
			ad[i1] = a(d, e, l, (int)(Math.pow(2D, i1) * 1280D));
	//    8   14:aload           4
	//    9   16:iload_2         
	//   10   17:aload_0         
	//   11   18:getfield        #68  <Field Collection d>
	//   12   21:aload_0         
	//   13   22:getfield        #226 <Field eh e>
	//   14   25:iload_1         
	//   15   26:ldc2w           #227 <Double 2D>
	//   16   29:iload_2         
	//   17   30:i2d             
	//   18   31:invokestatic    #234 <Method double Math.pow(double, double)>
	//   19   34:ldc2w           #235 <Double 1280D>
	//   20   37:dmul            
	//   21   38:d2i             
	//   22   39:invokestatic    #238 <Method double a(Collection, eh, int, int)>
	//   23   42:dastore         
			if(i1 != 5)
				continue;
	//   24   43:iload_2         
	//   25   44:iconst_5        
	//   26   45:icmpne          70
			for(int j1 = 0; j1 < i1; j1++)
	//*  27   48:iconst_0        
	//*  28   49:istore_3        
	//*  29   50:iload_3         
	//*  30   51:iload_2         
	//*  31   52:icmpge          70
				ad[j1] = ad[i1];
	//   32   55:aload           4
	//   33   57:iload_3         
	//   34   58:aload           4
	//   35   60:iload_2         
	//   36   61:daload          
	//   37   62:dastore         

	//   38   63:iload_3         
	//   39   64:iconst_1        
	//   40   65:iadd            
	//   41   66:istore_3        
		}

	//   42   67:goto            50
	//   43   70:iload_2         
	//   44   71:iconst_1        
	//   45   72:iadd            
	//   46   73:istore_2        
	//*  47   74:goto            8
		for(l = 11; l < 21; l++)
	//*  48   77:bipush          11
	//*  49   79:istore_1        
	//*  50   80:iload_1         
	//*  51   81:bipush          21
	//*  52   83:icmpge          102
			ad[l] = ad[10];
	//   53   86:aload           4
	//   54   88:iload_1         
	//   55   89:aload           4
	//   56   91:bipush          10
	//   57   93:daload          
	//   58   94:dastore         

	//   59   95:iload_1         
	//   60   96:iconst_1        
	//   61   97:iadd            
	//   62   98:istore_1        
	//*  63   99:goto            80
		return ad;
	//   64  102:aload           4
	//   65  104:areturn         
	}

	static double[] a(int l, double d1)
	{
		double ad[] = new double[l * 2 + 1];
	//    0    0:iload_0         
	//    1    1:iconst_2        
	//    2    2:imul            
	//    3    3:iconst_1        
	//    4    4:iadd            
	//    5    5:newarray        double[]
	//    6    7:astore          4
		for(int i1 = -l; i1 <= l; i1++)
	//*   7    9:iload_0         
	//*   8   10:ineg            
	//*   9   11:istore_3        
	//*  10   12:iload_3         
	//*  11   13:iload_0         
	//*  12   14:icmpgt          46
			ad[i1 + l] = Math.exp((double)(-i1 * i1) / (2D * d1 * d1));
	//   13   17:aload           4
	//   14   19:iload_3         
	//   15   20:iload_0         
	//   16   21:iadd            
	//   17   22:iload_3         
	//   18   23:ineg            
	//   19   24:iload_3         
	//   20   25:imul            
	//   21   26:i2d             
	//   22   27:ldc2w           #227 <Double 2D>
	//   23   30:dload_1         
	//   24   31:dmul            
	//   25   32:dload_1         
	//   26   33:dmul            
	//   27   34:ddiv            
	//   28   35:invokestatic    #242 <Method double Math.exp(double)>
	//   29   38:dastore         

	//   30   39:iload_3         
	//   31   40:iconst_1        
	//   32   41:iadd            
	//   33   42:istore_3        
	//*  34   43:goto            12
		return ad;
	//   35   46:aload           4
	//   36   48:areturn         
	}

	static double[][] a(double ad[][], double ad1[])
	{
		int l = (int)Math.floor((double)ad1.length / 2D);
	//    0    0:aload_1         
	//    1    1:arraylength     
	//    2    2:i2d             
	//    3    3:ldc2w           #227 <Double 2D>
	//    4    6:ddiv            
	//    5    7:invokestatic    #246 <Method double Math.floor(double)>
	//    6   10:d2i             
	//    7   11:istore          4
		int j3 = ad.length;
	//    8   13:aload_0         
	//    9   14:arraylength     
	//   10   15:istore          10
		int k3 = j3 - l * 2;
	//   11   17:iload           10
	//   12   19:iload           4
	//   13   21:iconst_2        
	//   14   22:imul            
	//   15   23:isub            
	//   16   24:istore          11
		int k1 = (l + k3) - 1;
	//   17   26:iload           4
	//   18   28:iload           11
	//   19   30:iadd            
	//   20   31:iconst_1        
	//   21   32:isub            
	//   22   33:istore          6
		double ad2[][] = (double[][])Array.newInstance(Double.TYPE, new int[] {
			j3, j3
		});
	//   23   35:getstatic       #250 <Field Class Double.TYPE>
	//   24   38:iconst_2        
	//   25   39:newarray        int[]
	//   26   41:dup             
	//   27   42:iconst_0        
	//   28   43:iload           10
	//   29   45:iastore         
	//   30   46:dup             
	//   31   47:iconst_1        
	//   32   48:iload           10
	//   33   50:iastore         
	//   34   51:invokestatic    #256 <Method Object Array.newInstance(Class, int[])>
	//   35   54:checkcast       #258 <Class double[][]>
	//   36   57:astore          12
		for(int l1 = 0; l1 < j3; l1++)
	//*  37   59:iconst_0        
	//*  38   60:istore          7
	//*  39   62:iload           7
	//*  40   64:iload           10
	//*  41   66:icmpge          207
		{
			for(int j2 = 0; j2 < j3; j2++)
	//*  42   69:iconst_0        
	//*  43   70:istore          8
	//*  44   72:iload           8
	//*  45   74:iload           10
	//*  46   76:icmpge          198
			{
				double d1 = ad[l1][j2];
	//   47   79:aload_0         
	//   48   80:iload           7
	//   49   82:aaload          
	//   50   83:iload           8
	//   51   85:daload          
	//   52   86:dstore_2        
				if(d1 == 0.0D)
					continue;
	//   53   87:dload_2         
	//   54   88:dconst_0        
	//   55   89:dcmpl           
	//   56   90:ifeq            189
				int l2;
				if(k1 < l1 + l)
	//*  57   93:iload           6
	//*  58   95:iload           7
	//*  59   97:iload           4
	//*  60   99:iadd            
	//*  61  100:icmpge          110
					l2 = k1;
	//   62  103:iload           6
	//   63  105:istore          9
				else
	//*  64  107:goto            117
					l2 = l1 + l;
	//   65  110:iload           7
	//   66  112:iload           4
	//   67  114:iadd            
	//   68  115:istore          9
				int i1;
				if(l > l1 - l)
	//*  69  117:iload           4
	//*  70  119:iload           7
	//*  71  121:iload           4
	//*  72  123:isub            
	//*  73  124:icmple          134
					i1 = l;
	//   74  127:iload           4
	//   75  129:istore          5
				else
	//*  76  131:goto            141
					i1 = l1 - l;
	//   77  134:iload           7
	//   78  136:iload           4
	//   79  138:isub            
	//   80  139:istore          5
				for(; i1 < l2 + 1; i1++)
	//*  81  141:iload           5
	//*  82  143:iload           9
	//*  83  145:iconst_1        
	//*  84  146:iadd            
	//*  85  147:icmpge          189
				{
					double ad3[] = ad2[i1];
	//   86  150:aload           12
	//   87  152:iload           5
	//   88  154:aaload          
	//   89  155:astore          13
					ad3[j2] = ad3[j2] + ad1[i1 - (l1 - l)] * d1;
	//   90  157:aload           13
	//   91  159:iload           8
	//   92  161:aload           13
	//   93  163:iload           8
	//   94  165:daload          
	//   95  166:aload_1         
	//   96  167:iload           5
	//   97  169:iload           7
	//   98  171:iload           4
	//   99  173:isub            
	//  100  174:isub            
	//  101  175:daload          
	//  102  176:dload_2         
	//  103  177:dmul            
	//  104  178:dadd            
	//  105  179:dastore         
				}

	//  106  180:iload           5
	//  107  182:iconst_1        
	//  108  183:iadd            
	//  109  184:istore          5
			}

	//  110  186:goto            141
	//  111  189:iload           8
	//  112  191:iconst_1        
	//  113  192:iadd            
	//  114  193:istore          8
		}

	//  115  195:goto            72
	//  116  198:iload           7
	//  117  200:iconst_1        
	//  118  201:iadd            
	//  119  202:istore          7
	//* 120  204:goto            62
		ad = (double[][])Array.newInstance(Double.TYPE, new int[] {
			k3, k3
		});
	//  121  207:getstatic       #250 <Field Class Double.TYPE>
	//  122  210:iconst_2        
	//  123  211:newarray        int[]
	//  124  213:dup             
	//  125  214:iconst_0        
	//  126  215:iload           11
	//  127  217:iastore         
	//  128  218:dup             
	//  129  219:iconst_1        
	//  130  220:iload           11
	//  131  222:iastore         
	//  132  223:invokestatic    #256 <Method Object Array.newInstance(Class, int[])>
	//  133  226:checkcast       #258 <Class double[][]>
	//  134  229:astore_0        
		for(int i2 = l; i2 < k1 + 1; i2++)
	//* 135  230:iload           4
	//* 136  232:istore          7
	//* 137  234:iload           7
	//* 138  236:iload           6
	//* 139  238:iconst_1        
	//* 140  239:iadd            
	//* 141  240:icmpge          391
		{
			for(int k2 = 0; k2 < j3; k2++)
	//* 142  243:iconst_0        
	//* 143  244:istore          8
	//* 144  246:iload           8
	//* 145  248:iload           10
	//* 146  250:icmpge          382
			{
				double d2 = ad2[i2][k2];
	//  147  253:aload           12
	//  148  255:iload           7
	//  149  257:aaload          
	//  150  258:iload           8
	//  151  260:daload          
	//  152  261:dstore_2        
				if(d2 == 0.0D)
					continue;
	//  153  262:dload_2         
	//  154  263:dconst_0        
	//  155  264:dcmpl           
	//  156  265:ifeq            373
				int i3;
				if(k1 < k2 + l)
	//* 157  268:iload           6
	//* 158  270:iload           8
	//* 159  272:iload           4
	//* 160  274:iadd            
	//* 161  275:icmpge          285
					i3 = k1;
	//  162  278:iload           6
	//  163  280:istore          9
				else
	//* 164  282:goto            292
					i3 = k2 + l;
	//  165  285:iload           8
	//  166  287:iload           4
	//  167  289:iadd            
	//  168  290:istore          9
				int j1;
				if(l > k2 - l)
	//* 169  292:iload           4
	//* 170  294:iload           8
	//* 171  296:iload           4
	//* 172  298:isub            
	//* 173  299:icmple          309
					j1 = l;
	//  174  302:iload           4
	//  175  304:istore          5
				else
	//* 176  306:goto            316
					j1 = k2 - l;
	//  177  309:iload           8
	//  178  311:iload           4
	//  179  313:isub            
	//  180  314:istore          5
				for(; j1 < i3 + 1; j1++)
	//* 181  316:iload           5
	//* 182  318:iload           9
	//* 183  320:iconst_1        
	//* 184  321:iadd            
	//* 185  322:icmpge          373
				{
					double ad4[] = ad[i2 - l];
	//  186  325:aload_0         
	//  187  326:iload           7
	//  188  328:iload           4
	//  189  330:isub            
	//  190  331:aaload          
	//  191  332:astore          13
					int l3 = j1 - l;
	//  192  334:iload           5
	//  193  336:iload           4
	//  194  338:isub            
	//  195  339:istore          11
					ad4[l3] = ad4[l3] + ad1[j1 - (k2 - l)] * d2;
	//  196  341:aload           13
	//  197  343:iload           11
	//  198  345:aload           13
	//  199  347:iload           11
	//  200  349:daload          
	//  201  350:aload_1         
	//  202  351:iload           5
	//  203  353:iload           8
	//  204  355:iload           4
	//  205  357:isub            
	//  206  358:isub            
	//  207  359:daload          
	//  208  360:dload_2         
	//  209  361:dmul            
	//  210  362:dadd            
	//  211  363:dastore         
				}

	//  212  364:iload           5
	//  213  366:iconst_1        
	//  214  367:iadd            
	//  215  368:istore          5
			}

	//  216  370:goto            316
	//  217  373:iload           8
	//  218  375:iconst_1        
	//  219  376:iadd            
	//  220  377:istore          8
		}

	//  221  379:goto            246
	//  222  382:iload           7
	//  223  384:iconst_1        
	//  224  385:iadd            
	//  225  386:istore          7
	//* 226  388:goto            234
		return ad;
	//  227  391:aload_0         
	//  228  392:areturn         
	}

	static Collection b(Collection collection)
	{
		return d(collection);
	//    0    0:aload_0         
	//    1    1:invokestatic    #261 <Method Collection d(Collection)>
	//    2    4:areturn         
	}

	private void c(Collection collection)
	{
		ArrayList arraylist;
		arraylist = new ArrayList();
	//    0    0:new             #265 <Class ArrayList>
	//    1    3:dup             
	//    2    4:invokespecial   #266 <Method void ArrayList()>
	//    3    7:astore_2        
		collection = ((Collection) (collection.iterator()));
	//    4    8:aload_1         
	//    5    9:invokeinterface #125 <Method Iterator Collection.iterator()>
	//    6   14:astore_1        
		do
		{
			if(!((Iterator) (collection)).hasNext())
				break;
	//    7   15:aload_1         
	//    8   16:invokeinterface #130 <Method boolean Iterator.hasNext()>
	//    9   21:ifeq            71
			WeightedLatLng weightedlatlng1 = (WeightedLatLng)((Iterator) (collection)).next();
	//   10   24:aload_1         
	//   11   25:invokeinterface #134 <Method Object Iterator.next()>
	//   12   30:checkcast       #136 <Class WeightedLatLng>
	//   13   33:astore_3        
			if(weightedlatlng1.latLng.latitude < 85D && weightedlatlng1.latLng.latitude > -85D)
	//*  14   34:aload_3         
	//*  15   35:getfield        #270 <Field LatLng WeightedLatLng.latLng>
	//*  16   38:getfield        #275 <Field double LatLng.latitude>
	//*  17   41:ldc2w           #276 <Double 85D>
	//*  18   44:dcmpg           
	//*  19   45:ifge            161
	//*  20   48:aload_3         
	//*  21   49:getfield        #270 <Field LatLng WeightedLatLng.latLng>
	//*  22   52:getfield        #275 <Field double LatLng.latitude>
	//*  23   55:ldc2w           #278 <Double -85D>
	//*  24   58:dcmpl           
	//*  25   59:ifle            161
				arraylist.add(((Object) (weightedlatlng1)));
	//   26   62:aload_2         
	//   27   63:aload_3         
	//   28   64:invokevirtual   #283 <Method boolean ArrayList.add(Object)>
	//   29   67:pop             
		} while(true);
	//   30   68:goto            161
		d = ((Collection) (arraylist));
	//   31   71:aload_0         
	//   32   72:aload_2         
	//   33   73:putfield        #68  <Field Collection d>
		e = a(d);
	//   34   76:aload_0         
	//   35   77:aload_0         
	//   36   78:getfield        #68  <Field Collection d>
	//   37   81:invokestatic    #285 <Method eh a(Collection)>
	//   38   84:putfield        #226 <Field eh e>
		c = new a(e);
	//   39   87:aload_0         
	//   40   88:new             #287 <Class a>
	//   41   91:dup             
	//   42   92:aload_0         
	//   43   93:getfield        #226 <Field eh e>
	//   44   96:invokespecial   #290 <Method void a(eh)>
	//   45   99:putfield        #292 <Field a c>
		WeightedLatLng weightedlatlng;
		for(collection = ((Collection) (d.iterator())); ((Iterator) (collection)).hasNext(); c.a(weightedlatlng))
	//*  46  102:aload_0         
	//*  47  103:getfield        #68  <Field Collection d>
	//*  48  106:invokeinterface #125 <Method Iterator Collection.iterator()>
	//*  49  111:astore_1        
	//*  50  112:aload_1         
	//*  51  113:invokeinterface #130 <Method boolean Iterator.hasNext()>
	//*  52  118:ifeq            142
			weightedlatlng = (WeightedLatLng)((Iterator) (collection)).next();
	//   53  121:aload_1         
	//   54  122:invokeinterface #134 <Method Object Iterator.next()>
	//   55  127:checkcast       #136 <Class WeightedLatLng>
	//   56  130:astore_2        

	//   57  131:aload_0         
	//   58  132:getfield        #292 <Field a c>
	//   59  135:aload_2         
	//   60  136:invokevirtual   #295 <Method void a.a(WeightedLatLng)>
	//*  61  139:goto            112
		try
		{
			k = a(f);
	//   62  142:aload_0         
	//   63  143:aload_0         
	//   64  144:aload_0         
	//   65  145:getfield        #73  <Field int f>
	//   66  148:invokespecial   #297 <Method double[] a(int)>
	//   67  151:putfield        #299 <Field double[] k>
			return;
	//   68  154:return          
		}
		// Misplaced declaration of an exception variable
		catch(Collection collection)
	//*  69  155:astore_1        
		{
			((Throwable) (collection)).printStackTrace();
	//   70  156:aload_1         
	//   71  157:invokevirtual   #302 <Method void Throwable.printStackTrace()>
		}
		return;
	//   72  160:return          
	//*  73  161:goto            15
	}

	private static Collection d(Collection collection)
	{
		ArrayList arraylist = new ArrayList();
	//    0    0:new             #265 <Class ArrayList>
	//    1    3:dup             
	//    2    4:invokespecial   #266 <Method void ArrayList()>
	//    3    7:astore_1        
		for(collection = ((Collection) (collection.iterator())); ((Iterator) (collection)).hasNext(); arraylist.add(((Object) (new WeightedLatLng((LatLng)((Iterator) (collection)).next())))));
	//    4    8:aload_0         
	//    5    9:invokeinterface #125 <Method Iterator Collection.iterator()>
	//    6   14:astore_0        
	//    7   15:aload_0         
	//    8   16:invokeinterface #130 <Method boolean Iterator.hasNext()>
	//    9   21:ifeq            48
	//   10   24:aload_1         
	//   11   25:new             #136 <Class WeightedLatLng>
	//   12   28:dup             
	//   13   29:aload_0         
	//   14   30:invokeinterface #134 <Method Object Iterator.next()>
	//   15   35:checkcast       #272 <Class LatLng>
	//   16   38:invokespecial   #306 <Method void WeightedLatLng(LatLng)>
	//   17   41:invokevirtual   #283 <Method boolean ArrayList.add(Object)>
	//   18   44:pop             
	//*  19   45:goto            15
		return ((Collection) (arraylist));
	//   20   48:aload_1         
	//   21   49:areturn         
	}

	public Tile getTile(int l, int i1, int j1)
	{
		double d1 = 1.0D / Math.pow(2D, j1);
	//    0    0:dconst_1        
	//    1    1:ldc2w           #227 <Double 2D>
	//    2    4:iload_3         
	//    3    5:i2d             
	//    4    6:invokestatic    #234 <Method double Math.pow(double, double)>
	//    5    9:ddiv            
	//    6   10:dstore          4
		double d2 = ((double)f * d1) / 256D;
	//    7   12:aload_0         
	//    8   13:getfield        #73  <Field int f>
	//    9   16:i2d             
	//   10   17:dload           4
	//   11   19:dmul            
	//   12   20:ldc2w           #310 <Double 256D>
	//   13   23:ddiv            
	//   14   24:dstore          6
		double d3 = (d1 + 2D * d2) / (double)(f * 2 + 256);
	//   15   26:dload           4
	//   16   28:ldc2w           #227 <Double 2D>
	//   17   31:dload           6
	//   18   33:dmul            
	//   19   34:dadd            
	//   20   35:aload_0         
	//   21   36:getfield        #73  <Field int f>
	//   22   39:iconst_2        
	//   23   40:imul            
	//   24   41:sipush          256
	//   25   44:iadd            
	//   26   45:i2d             
	//   27   46:ddiv            
	//   28   47:dstore          8
		double d4 = (double)l * d1 - d2;
	//   29   49:iload_1         
	//   30   50:i2d             
	//   31   51:dload           4
	//   32   53:dmul            
	//   33   54:dload           6
	//   34   56:dsub            
	//   35   57:dstore          10
		double d5 = (double)(l + 1) * d1 + d2;
	//   36   59:iload_1         
	//   37   60:iconst_1        
	//   38   61:iadd            
	//   39   62:i2d             
	//   40   63:dload           4
	//   41   65:dmul            
	//   42   66:dload           6
	//   43   68:dadd            
	//   44   69:dstore          12
		double d6 = (double)i1 * d1 - d2;
	//   45   71:iload_2         
	//   46   72:i2d             
	//   47   73:dload           4
	//   48   75:dmul            
	//   49   76:dload           6
	//   50   78:dsub            
	//   51   79:dstore          14
		double d7 = (double)(i1 + 1) * d1 + d2;
	//   52   81:iload_2         
	//   53   82:iconst_1        
	//   54   83:iadd            
	//   55   84:i2d             
	//   56   85:dload           4
	//   57   87:dmul            
	//   58   88:dload           6
	//   59   90:dadd            
	//   60   91:dstore          16
		d1 = 0.0D;
	//   61   93:dconst_0        
	//   62   94:dstore          4
		Object obj = ((Object) (new ArrayList()));
	//   63   96:new             #265 <Class ArrayList>
	//   64   99:dup             
	//   65  100:invokespecial   #266 <Method void ArrayList()>
	//   66  103:astore          18
		if(d4 < 0.0D)
	//*  67  105:dload           10
	//*  68  107:dconst_0        
	//*  69  108:dcmpg           
	//*  70  109:ifge            149
		{
			obj = ((Object) (new eh(1.0D + d4, 1.0D, d6, d7)));
	//   71  112:new             #106 <Class eh>
	//   72  115:dup             
	//   73  116:dconst_1        
	//   74  117:dload           10
	//   75  119:dadd            
	//   76  120:dconst_1        
	//   77  121:dload           14
	//   78  123:dload           16
	//   79  125:invokespecial   #192 <Method void eh(double, double, double, double)>
	//   80  128:astore          18
			d1 = -1D;
	//   81  130:ldc2w           #312 <Double -1D>
	//   82  133:dstore          4
			obj = ((Object) (c.a(((eh) (obj)))));
	//   83  135:aload_0         
	//   84  136:getfield        #292 <Field a c>
	//   85  139:aload           18
	//   86  141:invokevirtual   #316 <Method Collection a.a(eh)>
	//   87  144:astore          18
		} else
	//*  88  146:goto            188
		if(d5 > 1.0D)
	//*  89  149:dload           12
	//*  90  151:dconst_1        
	//*  91  152:dcmpl           
	//*  92  153:ifle            188
		{
			obj = ((Object) (new eh(0.0D, d5 - 1.0D, d6, d7)));
	//   93  156:new             #106 <Class eh>
	//   94  159:dup             
	//   95  160:dconst_0        
	//   96  161:dload           12
	//   97  163:dconst_1        
	//   98  164:dsub            
	//   99  165:dload           14
	//  100  167:dload           16
	//  101  169:invokespecial   #192 <Method void eh(double, double, double, double)>
	//  102  172:astore          18
			d1 = 1.0D;
	//  103  174:dconst_1        
	//  104  175:dstore          4
			obj = ((Object) (c.a(((eh) (obj)))));
	//  105  177:aload_0         
	//  106  178:getfield        #292 <Field a c>
	//  107  181:aload           18
	//  108  183:invokevirtual   #316 <Method Collection a.a(eh)>
	//  109  186:astore          18
		}
		eh eh1 = new eh(d4, d5, d6, d7);
	//  110  188:new             #106 <Class eh>
	//  111  191:dup             
	//  112  192:dload           10
	//  113  194:dload           12
	//  114  196:dload           14
	//  115  198:dload           16
	//  116  200:invokespecial   #192 <Method void eh(double, double, double, double)>
	//  117  203:astore          19
		if(!eh1.a(new eh(e.a - d2, e.c + d2, e.b - d2, e.d + d2)))
	//* 118  205:aload           19
	//* 119  207:new             #106 <Class eh>
	//* 120  210:dup             
	//* 121  211:aload_0         
	//* 122  212:getfield        #226 <Field eh e>
	//* 123  215:getfield        #108 <Field double eh.a>
	//* 124  218:dload           6
	//* 125  220:dsub            
	//* 126  221:aload_0         
	//* 127  222:getfield        #226 <Field eh e>
	//* 128  225:getfield        #110 <Field double eh.c>
	//* 129  228:dload           6
	//* 130  230:dadd            
	//* 131  231:aload_0         
	//* 132  232:getfield        #226 <Field eh e>
	//* 133  235:getfield        #112 <Field double eh.b>
	//* 134  238:dload           6
	//* 135  240:dsub            
	//* 136  241:aload_0         
	//* 137  242:getfield        #226 <Field eh e>
	//* 138  245:getfield        #114 <Field double eh.d>
	//* 139  248:dload           6
	//* 140  250:dadd            
	//* 141  251:invokespecial   #192 <Method void eh(double, double, double, double)>
	//* 142  254:invokevirtual   #319 <Method boolean eh.a(eh)>
	//* 143  257:ifne            264
			return TileProvider.NO_TILE;
	//  144  260:getstatic       #323 <Field Tile TileProvider.NO_TILE>
	//  145  263:areturn         
		Object obj1 = ((Object) (c.a(eh1)));
	//  146  264:aload_0         
	//  147  265:getfield        #292 <Field a c>
	//  148  268:aload           19
	//  149  270:invokevirtual   #316 <Method Collection a.a(eh)>
	//  150  273:astore          20
		if(((Collection) (obj1)).isEmpty())
	//* 151  275:aload           20
	//* 152  277:invokeinterface #326 <Method boolean Collection.isEmpty()>
	//* 153  282:ifeq            289
			return TileProvider.NO_TILE;
	//  154  285:getstatic       #323 <Field Tile TileProvider.NO_TILE>
	//  155  288:areturn         
		l = f;
	//  156  289:aload_0         
	//  157  290:getfield        #73  <Field int f>
	//  158  293:istore_1        
		i1 = f;
	//  159  294:aload_0         
	//  160  295:getfield        #73  <Field int f>
	//  161  298:istore_2        
		double ad[][] = (double[][])Array.newInstance(Double.TYPE, new int[] {
			l * 2 + 256, i1 * 2 + 256
		});
	//  162  299:getstatic       #250 <Field Class Double.TYPE>
	//  163  302:iconst_2        
	//  164  303:newarray        int[]
	//  165  305:dup             
	//  166  306:iconst_0        
	//  167  307:iload_1         
	//  168  308:iconst_2        
	//  169  309:imul            
	//  170  310:sipush          256
	//  171  313:iadd            
	//  172  314:iastore         
	//  173  315:dup             
	//  174  316:iconst_1        
	//  175  317:iload_2         
	//  176  318:iconst_2        
	//  177  319:imul            
	//  178  320:sipush          256
	//  179  323:iadd            
	//  180  324:iastore         
	//  181  325:invokestatic    #256 <Method Object Array.newInstance(Class, int[])>
	//  182  328:checkcast       #258 <Class double[][]>
	//  183  331:astore          19
		for(obj1 = ((Object) (((Collection) (obj1)).iterator())); ((Iterator) (obj1)).hasNext();)
	//* 184  333:aload           20
	//* 185  335:invokeinterface #125 <Method Iterator Collection.iterator()>
	//* 186  340:astore          20
	//* 187  342:aload           20
	//* 188  344:invokeinterface #130 <Method boolean Iterator.hasNext()>
	//* 189  349:ifeq            420
		{
			WeightedLatLng weightedlatlng1 = (WeightedLatLng)((Iterator) (obj1)).next();
	//  190  352:aload           20
	//  191  354:invokeinterface #134 <Method Object Iterator.next()>
	//  192  359:checkcast       #136 <Class WeightedLatLng>
	//  193  362:astore          21
			DPoint dpoint1 = weightedlatlng1.getPoint();
	//  194  364:aload           21
	//  195  366:invokevirtual   #140 <Method DPoint WeightedLatLng.getPoint()>
	//  196  369:astore          22
			l = (int)((dpoint1.x - d4) / d3);
	//  197  371:aload           22
	//  198  373:getfield        #145 <Field double DPoint.x>
	//  199  376:dload           10
	//  200  378:dsub            
	//  201  379:dload           8
	//  202  381:ddiv            
	//  203  382:d2i             
	//  204  383:istore_1        
			i1 = (int)((dpoint1.y - d6) / d3);
	//  205  384:aload           22
	//  206  386:getfield        #148 <Field double DPoint.y>
	//  207  389:dload           14
	//  208  391:dsub            
	//  209  392:dload           8
	//  210  394:ddiv            
	//  211  395:d2i             
	//  212  396:istore_2        
			double ad2[] = ad[l];
	//  213  397:aload           19
	//  214  399:iload_1         
	//  215  400:aaload          
	//  216  401:astore          22
			ad2[i1] = ad2[i1] + weightedlatlng1.intensity;
	//  217  403:aload           22
	//  218  405:iload_2         
	//  219  406:aload           22
	//  220  408:iload_2         
	//  221  409:daload          
	//  222  410:aload           21
	//  223  412:getfield        #169 <Field double WeightedLatLng.intensity>
	//  224  415:dadd            
	//  225  416:dastore         
		}

	//* 226  417:goto            342
		for(obj = ((Object) (((Collection) (obj)).iterator())); ((Iterator) (obj)).hasNext();)
	//* 227  420:aload           18
	//* 228  422:invokeinterface #125 <Method Iterator Collection.iterator()>
	//* 229  427:astore          18
	//* 230  429:aload           18
	//* 231  431:invokeinterface #130 <Method boolean Iterator.hasNext()>
	//* 232  436:ifeq            510
		{
			WeightedLatLng weightedlatlng = (WeightedLatLng)((Iterator) (obj)).next();
	//  233  439:aload           18
	//  234  441:invokeinterface #134 <Method Object Iterator.next()>
	//  235  446:checkcast       #136 <Class WeightedLatLng>
	//  236  449:astore          20
			DPoint dpoint = weightedlatlng.getPoint();
	//  237  451:aload           20
	//  238  453:invokevirtual   #140 <Method DPoint WeightedLatLng.getPoint()>
	//  239  456:astore          21
			l = (int)(((dpoint.x + d1) - d4) / d3);
	//  240  458:aload           21
	//  241  460:getfield        #145 <Field double DPoint.x>
	//  242  463:dload           4
	//  243  465:dadd            
	//  244  466:dload           10
	//  245  468:dsub            
	//  246  469:dload           8
	//  247  471:ddiv            
	//  248  472:d2i             
	//  249  473:istore_1        
			i1 = (int)((dpoint.y - d6) / d3);
	//  250  474:aload           21
	//  251  476:getfield        #148 <Field double DPoint.y>
	//  252  479:dload           14
	//  253  481:dsub            
	//  254  482:dload           8
	//  255  484:ddiv            
	//  256  485:d2i             
	//  257  486:istore_2        
			double ad1[] = ad[l];
	//  258  487:aload           19
	//  259  489:iload_1         
	//  260  490:aaload          
	//  261  491:astore          21
			ad1[i1] = ad1[i1] + weightedlatlng.intensity;
	//  262  493:aload           21
	//  263  495:iload_2         
	//  264  496:aload           21
	//  265  498:iload_2         
	//  266  499:daload          
	//  267  500:aload           20
	//  268  502:getfield        #169 <Field double WeightedLatLng.intensity>
	//  269  505:dadd            
	//  270  506:dastore         
		}

	//* 271  507:goto            429
		return a(a(a(ad, i), h, k[j1]));
	//  272  510:aload           19
	//  273  512:aload_0         
	//  274  513:getfield        #94  <Field double[] i>
	//  275  516:invokestatic    #328 <Method double[][] a(double[][], double[])>
	//  276  519:aload_0         
	//  277  520:getfield        #223 <Field int[] h>
	//  278  523:aload_0         
	//  279  524:getfield        #299 <Field double[] k>
	//  280  527:iload_3         
	//  281  528:daload          
	//  282  529:invokestatic    #330 <Method Bitmap a(double[][], int[], double)>
	//  283  532:invokestatic    #332 <Method Tile a(Bitmap)>
	//  284  535:areturn         
	}

	public int getTileHeight()
	{
		return 256;
	//    0    0:sipush          256
	//    1    3:ireturn         
	}

	public int getTileWidth()
	{
		return 256;
	//    0    0:sipush          256
	//    1    3:ireturn         
	}

	public static final Gradient DEFAULT_GRADIENT = new Gradient(a, b);
	public static final double DEFAULT_OPACITY = 0.59999999999999998D;
	public static final int DEFAULT_RADIUS = 12;
	private static final int a[] = {
		Color.rgb(102, 225, 0), Color.rgb(255, 0, 0)
	};
	private static final float b[] = {
		0.2F, 1.0F
	};
	private a c;
	private Collection d;
	private eh e;
	private int f;
	private Gradient g;
	private int h[];
	private double i[];
	private double j;
	private double k[];

	static 
	{
	//    0    0:iconst_2        
	//    1    1:newarray        int[]
	//    2    3:dup             
	//    3    4:iconst_0        
	//    4    5:bipush          102
	//    5    7:sipush          225
	//    6   10:iconst_0        
	//    7   11:invokestatic    #46  <Method int Color.rgb(int, int, int)>
	//    8   14:iastore         
	//    9   15:dup             
	//   10   16:iconst_1        
	//   11   17:sipush          255
	//   12   20:iconst_0        
	//   13   21:iconst_0        
	//   14   22:invokestatic    #46  <Method int Color.rgb(int, int, int)>
	//   15   25:iastore         
	//   16   26:putstatic       #48  <Field int[] a>
	//   17   29:iconst_2        
	//   18   30:newarray        float[]
	//   19   32:dup             
	//   20   33:iconst_0        
	//   21   34:ldc1            #49  <Float 0.2F>
	//   22   36:fastore         
	//   23   37:dup             
	//   24   38:iconst_1        
	//   25   39:fconst_1        
	//   26   40:fastore         
	//   27   41:putstatic       #51  <Field float[] b>
	//   28   44:new             #53  <Class Gradient>
	//   29   47:dup             
	//   30   48:getstatic       #48  <Field int[] a>
	//   31   51:getstatic       #51  <Field float[] b>
	//   32   54:invokespecial   #57  <Method void Gradient(int[], float[])>
	//   33   57:putstatic       #59  <Field Gradient DEFAULT_GRADIENT>
	//*  34   60:return          
	}
}
