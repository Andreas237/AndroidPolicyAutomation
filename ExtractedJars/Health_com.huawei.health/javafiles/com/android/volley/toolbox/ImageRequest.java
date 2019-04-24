// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.android.volley.toolbox;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import com.android.volley.*;

// Referenced classes of package com.android.volley.toolbox:
//			HttpHeaderParser

public class ImageRequest extends Request
{

	public ImageRequest(String s, com.android.volley.Response.Listener listener, int i, int j, android.graphics.Bitmap.Config config, com.android.volley.Response.ErrorListener errorlistener)
	{
		this(s, listener, i, j, android.widget.ImageView.ScaleType.CENTER_INSIDE, config, errorlistener);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:iload_3         
	//    4    4:iload           4
	//    5    6:getstatic       #41  <Field android.widget.ImageView$ScaleType android.widget.ImageView$ScaleType.CENTER_INSIDE>
	//    6    9:aload           5
	//    7   11:aload           6
	//    8   13:invokespecial   #44  <Method void ImageRequest(String, com.android.volley.Response$Listener, int, int, android.widget.ImageView$ScaleType, android.graphics.Bitmap$Config, com.android.volley.Response$ErrorListener)>
	//    9   16:return          
	}

	public ImageRequest(String s, com.android.volley.Response.Listener listener, int i, int j, android.widget.ImageView.ScaleType scaletype, android.graphics.Bitmap.Config config, com.android.volley.Response.ErrorListener errorlistener)
	{
		super(0, s, errorlistener);
	//    0    0:aload_0         
	//    1    1:iconst_0        
	//    2    2:aload_1         
	//    3    3:aload           7
	//    4    5:invokespecial   #50  <Method void Request(int, String, com.android.volley.Response$ErrorListener)>
		setRetryPolicy(((com.android.volley.RetryPolicy) (new DefaultRetryPolicy(1000, 2, 2.0F))));
	//    5    8:aload_0         
	//    6    9:new             #52  <Class DefaultRetryPolicy>
	//    7   12:dup             
	//    8   13:sipush          1000
	//    9   16:iconst_2        
	//   10   17:fconst_2        
	//   11   18:invokespecial   #55  <Method void DefaultRetryPolicy(int, int, float)>
	//   12   21:invokevirtual   #59  <Method Request setRetryPolicy(com.android.volley.RetryPolicy)>
	//   13   24:pop             
		mListener = listener;
	//   14   25:aload_0         
	//   15   26:aload_2         
	//   16   27:putfield        #61  <Field com.android.volley.Response$Listener mListener>
		mDecodeConfig = config;
	//   17   30:aload_0         
	//   18   31:aload           6
	//   19   33:putfield        #63  <Field android.graphics.Bitmap$Config mDecodeConfig>
		mMaxWidth = i;
	//   20   36:aload_0         
	//   21   37:iload_3         
	//   22   38:putfield        #65  <Field int mMaxWidth>
		mMaxHeight = j;
	//   23   41:aload_0         
	//   24   42:iload           4
	//   25   44:putfield        #67  <Field int mMaxHeight>
		mScaleType = scaletype;
	//   26   47:aload_0         
	//   27   48:aload           5
	//   28   50:putfield        #69  <Field android.widget.ImageView$ScaleType mScaleType>
	//   29   53:return          
	}

	private Response doParse(NetworkResponse networkresponse)
	{
		Object obj = ((Object) (networkresponse.data));
	//    0    0:aload_1         
	//    1    1:getfield        #78  <Field byte[] NetworkResponse.data>
	//    2    4:astore          6
		android.graphics.BitmapFactory.Options options = new android.graphics.BitmapFactory.Options();
	//    3    6:new             #80  <Class android.graphics.BitmapFactory$Options>
	//    4    9:dup             
	//    5   10:invokespecial   #81  <Method void android.graphics.BitmapFactory$Options()>
	//    6   13:astore          7
		if(mMaxWidth == 0 && mMaxHeight == 0)
	//*   7   15:aload_0         
	//*   8   16:getfield        #65  <Field int mMaxWidth>
	//*   9   19:ifne            54
	//*  10   22:aload_0         
	//*  11   23:getfield        #67  <Field int mMaxHeight>
	//*  12   26:ifne            54
		{
			options.inPreferredConfig = mDecodeConfig;
	//   13   29:aload           7
	//   14   31:aload_0         
	//   15   32:getfield        #63  <Field android.graphics.Bitmap$Config mDecodeConfig>
	//   16   35:putfield        #84  <Field android.graphics.Bitmap$Config android.graphics.BitmapFactory$Options.inPreferredConfig>
			obj = ((Object) (BitmapFactory.decodeByteArray(((byte []) (obj)), 0, obj.length, options)));
	//   17   38:aload           6
	//   18   40:iconst_0        
	//   19   41:aload           6
	//   20   43:arraylength     
	//   21   44:aload           7
	//   22   46:invokestatic    #90  <Method Bitmap BitmapFactory.decodeByteArray(byte[], int, int, android.graphics.BitmapFactory$Options)>
	//   23   49:astore          6
		} else
	//*  24   51:goto            204
		{
			options.inJustDecodeBounds = true;
	//   25   54:aload           7
	//   26   56:iconst_1        
	//   27   57:putfield        #94  <Field boolean android.graphics.BitmapFactory$Options.inJustDecodeBounds>
			BitmapFactory.decodeByteArray(((byte []) (obj)), 0, obj.length, options);
	//   28   60:aload           6
	//   29   62:iconst_0        
	//   30   63:aload           6
	//   31   65:arraylength     
	//   32   66:aload           7
	//   33   68:invokestatic    #90  <Method Bitmap BitmapFactory.decodeByteArray(byte[], int, int, android.graphics.BitmapFactory$Options)>
	//   34   71:pop             
			int i = options.outWidth;
	//   35   72:aload           7
	//   36   74:getfield        #97  <Field int android.graphics.BitmapFactory$Options.outWidth>
	//   37   77:istore_2        
			int j = options.outHeight;
	//   38   78:aload           7
	//   39   80:getfield        #100 <Field int android.graphics.BitmapFactory$Options.outHeight>
	//   40   83:istore_3        
			int k = getResizedDimension(mMaxWidth, mMaxHeight, i, j, mScaleType);
	//   41   84:aload_0         
	//   42   85:getfield        #65  <Field int mMaxWidth>
	//   43   88:aload_0         
	//   44   89:getfield        #67  <Field int mMaxHeight>
	//   45   92:iload_2         
	//   46   93:iload_3         
	//   47   94:aload_0         
	//   48   95:getfield        #69  <Field android.widget.ImageView$ScaleType mScaleType>
	//   49   98:invokestatic    #104 <Method int getResizedDimension(int, int, int, int, android.widget.ImageView$ScaleType)>
	//   50  101:istore          4
			int l = getResizedDimension(mMaxHeight, mMaxWidth, j, i, mScaleType);
	//   51  103:aload_0         
	//   52  104:getfield        #67  <Field int mMaxHeight>
	//   53  107:aload_0         
	//   54  108:getfield        #65  <Field int mMaxWidth>
	//   55  111:iload_3         
	//   56  112:iload_2         
	//   57  113:aload_0         
	//   58  114:getfield        #69  <Field android.widget.ImageView$ScaleType mScaleType>
	//   59  117:invokestatic    #104 <Method int getResizedDimension(int, int, int, int, android.widget.ImageView$ScaleType)>
	//   60  120:istore          5
			options.inJustDecodeBounds = false;
	//   61  122:aload           7
	//   62  124:iconst_0        
	//   63  125:putfield        #94  <Field boolean android.graphics.BitmapFactory$Options.inJustDecodeBounds>
			options.inSampleSize = findBestSampleSize(i, j, k, l);
	//   64  128:aload           7
	//   65  130:iload_2         
	//   66  131:iload_3         
	//   67  132:iload           4
	//   68  134:iload           5
	//   69  136:invokestatic    #108 <Method int findBestSampleSize(int, int, int, int)>
	//   70  139:putfield        #111 <Field int android.graphics.BitmapFactory$Options.inSampleSize>
			obj = ((Object) (BitmapFactory.decodeByteArray(((byte []) (obj)), 0, obj.length, options)));
	//   71  142:aload           6
	//   72  144:iconst_0        
	//   73  145:aload           6
	//   74  147:arraylength     
	//   75  148:aload           7
	//   76  150:invokestatic    #90  <Method Bitmap BitmapFactory.decodeByteArray(byte[], int, int, android.graphics.BitmapFactory$Options)>
	//   77  153:astore          6
			if(obj != null && (((Bitmap) (obj)).getWidth() > k || ((Bitmap) (obj)).getHeight() > l))
	//*  78  155:aload           6
	//*  79  157:ifnull          204
	//*  80  160:aload           6
	//*  81  162:invokevirtual   #117 <Method int Bitmap.getWidth()>
	//*  82  165:iload           4
	//*  83  167:icmpgt          180
	//*  84  170:aload           6
	//*  85  172:invokevirtual   #120 <Method int Bitmap.getHeight()>
	//*  86  175:iload           5
	//*  87  177:icmple          204
			{
				Bitmap bitmap = Bitmap.createScaledBitmap(((Bitmap) (obj)), k, l, true);
	//   88  180:aload           6
	//   89  182:iload           4
	//   90  184:iload           5
	//   91  186:iconst_1        
	//   92  187:invokestatic    #124 <Method Bitmap Bitmap.createScaledBitmap(Bitmap, int, int, boolean)>
	//   93  190:astore          7
				((Bitmap) (obj)).recycle();
	//   94  192:aload           6
	//   95  194:invokevirtual   #127 <Method void Bitmap.recycle()>
				obj = ((Object) (bitmap));
	//   96  197:aload           7
	//   97  199:astore          6
			}
		}
	//*  98  201:goto            204
		if(obj == null)
	//*  99  204:aload           6
	//* 100  206:ifnonnull       221
			return Response.error(((com.android.volley.VolleyError) (new ParseError(networkresponse))));
	//  101  209:new             #129 <Class ParseError>
	//  102  212:dup             
	//  103  213:aload_1         
	//  104  214:invokespecial   #132 <Method void ParseError(NetworkResponse)>
	//  105  217:invokestatic    #138 <Method Response Response.error(com.android.volley.VolleyError)>
	//  106  220:areturn         
		else
			return Response.success(obj, HttpHeaderParser.parseCacheHeaders(networkresponse));
	//  107  221:aload           6
	//  108  223:aload_1         
	//  109  224:invokestatic    #144 <Method com.android.volley.Cache$Entry HttpHeaderParser.parseCacheHeaders(NetworkResponse)>
	//  110  227:invokestatic    #148 <Method Response Response.success(Object, com.android.volley.Cache$Entry)>
	//  111  230:areturn         
	}

	static int findBestSampleSize(int i, int j, int k, int l)
	{
		double d = Math.min((double)i / (double)k, (double)j / (double)l);
	//    0    0:iload_0         
	//    1    1:i2d             
	//    2    2:iload_2         
	//    3    3:i2d             
	//    4    4:ddiv            
	//    5    5:iload_1         
	//    6    6:i2d             
	//    7    7:iload_3         
	//    8    8:i2d             
	//    9    9:ddiv            
	//   10   10:invokestatic    #155 <Method double Math.min(double, double)>
	//   11   13:dstore          4
		float f;
		for(f = 1.0F; (double)(2.0F * f) <= d; f *= 2.0F);
	//   12   15:fconst_1        
	//   13   16:fstore          6
	//   14   18:fconst_2        
	//   15   19:fload           6
	//   16   21:fmul            
	//   17   22:f2d             
	//   18   23:dload           4
	//   19   25:dcmpg           
	//   20   26:ifgt            38
	//   21   29:fload           6
	//   22   31:fconst_2        
	//   23   32:fmul            
	//   24   33:fstore          6
	//*  25   35:goto            18
		return (int)f;
	//   26   38:fload           6
	//   27   40:f2i             
	//   28   41:ireturn         
	}

	private static int getResizedDimension(int i, int j, int k, int l, android.widget.ImageView.ScaleType scaletype)
	{
		if(i == 0 && j == 0)
	//*   0    0:iload_0         
	//*   1    1:ifne            10
	//*   2    4:iload_1         
	//*   3    5:ifne            10
			return k;
	//    4    8:iload_2         
	//    5    9:ireturn         
		if(scaletype == android.widget.ImageView.ScaleType.FIT_XY)
	//*   6   10:aload           4
	//*   7   12:getstatic       #158 <Field android.widget.ImageView$ScaleType android.widget.ImageView$ScaleType.FIT_XY>
	//*   8   15:if_acmpne       26
			if(i == 0)
	//*   9   18:iload_0         
	//*  10   19:ifne            24
				return k;
	//   11   22:iload_2         
	//   12   23:ireturn         
			else
				return i;
	//   13   24:iload_0         
	//   14   25:ireturn         
		if(i == 0)
	//*  15   26:iload_0         
	//*  16   27:ifne            44
		{
			double d = (double)j / (double)l;
	//   17   30:iload_1         
	//   18   31:i2d             
	//   19   32:iload_3         
	//   20   33:i2d             
	//   21   34:ddiv            
	//   22   35:dstore          5
			return (int)((double)k * d);
	//   23   37:iload_2         
	//   24   38:i2d             
	//   25   39:dload           5
	//   26   41:dmul            
	//   27   42:d2i             
	//   28   43:ireturn         
		}
		if(j == 0)
	//*  29   44:iload_1         
	//*  30   45:ifne            50
			return i;
	//   31   48:iload_0         
	//   32   49:ireturn         
		double d1 = (double)l / (double)k;
	//   33   50:iload_3         
	//   34   51:i2d             
	//   35   52:iload_2         
	//   36   53:i2d             
	//   37   54:ddiv            
	//   38   55:dstore          5
		if(scaletype == android.widget.ImageView.ScaleType.CENTER_CROP)
	//*  39   57:aload           4
	//*  40   59:getstatic       #161 <Field android.widget.ImageView$ScaleType android.widget.ImageView$ScaleType.CENTER_CROP>
	//*  41   62:if_acmpne       87
		{
			k = i;
	//   42   65:iload_0         
	//   43   66:istore_2        
			if((double)i * d1 < (double)j)
	//*  44   67:iload_0         
	//*  45   68:i2d             
	//*  46   69:dload           5
	//*  47   71:dmul            
	//*  48   72:iload_1         
	//*  49   73:i2d             
	//*  50   74:dcmpg           
	//*  51   75:ifge            85
				k = (int)((double)j / d1);
	//   52   78:iload_1         
	//   53   79:i2d             
	//   54   80:dload           5
	//   55   82:ddiv            
	//   56   83:d2i             
	//   57   84:istore_2        
			return k;
	//   58   85:iload_2         
	//   59   86:ireturn         
		}
		k = i;
	//   60   87:iload_0         
	//   61   88:istore_2        
		if((double)i * d1 > (double)j)
	//*  62   89:iload_0         
	//*  63   90:i2d             
	//*  64   91:dload           5
	//*  65   93:dmul            
	//*  66   94:iload_1         
	//*  67   95:i2d             
	//*  68   96:dcmpl           
	//*  69   97:ifle            107
			k = (int)((double)j / d1);
	//   70  100:iload_1         
	//   71  101:i2d             
	//   72  102:dload           5
	//   73  104:ddiv            
	//   74  105:d2i             
	//   75  106:istore_2        
		return k;
	//   76  107:iload_2         
	//   77  108:ireturn         
	}

	protected void deliverResponse(Bitmap bitmap)
	{
		mListener.onResponse(((Object) (bitmap)));
	//    0    0:aload_0         
	//    1    1:getfield        #61  <Field com.android.volley.Response$Listener mListener>
	//    2    4:aload_1         
	//    3    5:invokeinterface #169 <Method void com.android.volley.Response$Listener.onResponse(Object)>
	//    4   10:return          
	}

	public volatile void deliverResponse(Object obj)
	{
		deliverResponse((Bitmap)obj);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:checkcast       #113 <Class Bitmap>
	//    3    5:invokevirtual   #171 <Method void deliverResponse(Bitmap)>
	//    4    8:return          
	}

	public com.android.volley.Request.Priority getPriority()
	{
		return com.android.volley.Request.Priority.LOW;
	//    0    0:getstatic       #179 <Field com.android.volley.Request$Priority com.android.volley.Request$Priority.LOW>
	//    1    3:areturn         
	}

	public Response parseNetworkResponse(NetworkResponse networkresponse)
	{
		Object obj = sDecodeLock;
	//    0    0:getstatic       #33  <Field Object sDecodeLock>
	//    1    3:astore_2        
		obj;
	//    2    4:aload_2         
		JVM INSTR monitorenter ;
	//    3    5:monitorenter    
		Response response = doParse(networkresponse);
	//    4    6:aload_0         
	//    5    7:aload_1         
	//    6    8:invokespecial   #184 <Method Response doParse(NetworkResponse)>
	//    7   11:astore_3        
		obj;
	//    8   12:aload_2         
		JVM INSTR monitorexit ;
	//    9   13:monitorexit     
		return response;
	//   10   14:aload_3         
	//   11   15:areturn         
		OutOfMemoryError outofmemoryerror;
		outofmemoryerror;
	//   12   16:astore_3        
		VolleyLog.e("Caught OOM for %d byte image, url=%s", new Object[] {
			Integer.valueOf(networkresponse.data.length), getUrl()
		});
	//   13   17:ldc1            #186 <String "Caught OOM for %d byte image, url=%s">
	//   14   19:iconst_2        
	//   15   20:anewarray       Object[]
	//   16   23:dup             
	//   17   24:iconst_0        
	//   18   25:aload_1         
	//   19   26:getfield        #78  <Field byte[] NetworkResponse.data>
	//   20   29:arraylength     
	//   21   30:invokestatic    #192 <Method Integer Integer.valueOf(int)>
	//   22   33:aastore         
	//   23   34:dup             
	//   24   35:iconst_1        
	//   25   36:aload_0         
	//   26   37:invokevirtual   #196 <Method String getUrl()>
	//   27   40:aastore         
	//   28   41:invokestatic    #202 <Method void VolleyLog.e(String, Object[])>
		networkresponse = ((NetworkResponse) (Response.error(((com.android.volley.VolleyError) (new ParseError(((Throwable) (outofmemoryerror))))))));
	//   29   44:new             #129 <Class ParseError>
	//   30   47:dup             
	//   31   48:aload_3         
	//   32   49:invokespecial   #205 <Method void ParseError(Throwable)>
	//   33   52:invokestatic    #138 <Method Response Response.error(com.android.volley.VolleyError)>
	//   34   55:astore_1        
		obj;
	//   35   56:aload_2         
		JVM INSTR monitorexit ;
	//   36   57:monitorexit     
		return ((Response) (networkresponse));
	//   37   58:aload_1         
	//   38   59:areturn         
		networkresponse;
	//   39   60:astore_1        
	//*  40   61:aload_2         
		throw networkresponse;
	//   41   62:monitorexit     
	//   42   63:aload_1         
	//   43   64:athrow          
	}

	private static final float IMAGE_BACKOFF_MULT = 2F;
	private static final int IMAGE_MAX_RETRIES = 2;
	private static final int IMAGE_TIMEOUT_MS = 1000;
	private static final Object sDecodeLock = new Object();
	private final android.graphics.Bitmap.Config mDecodeConfig;
	private final com.android.volley.Response.Listener mListener;
	private final int mMaxHeight;
	private final int mMaxWidth;
	private android.widget.ImageView.ScaleType mScaleType;

	static 
	{
	//    0    0:new             #28  <Class Object>
	//    1    3:dup             
	//    2    4:invokespecial   #31  <Method void Object()>
	//    3    7:putstatic       #33  <Field Object sDecodeLock>
	//*   4   10:return          
	}
}
