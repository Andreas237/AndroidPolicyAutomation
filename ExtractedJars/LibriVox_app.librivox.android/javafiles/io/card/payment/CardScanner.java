// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package io.card.payment;

import android.content.Intent;
import android.graphics.*;
import android.hardware.Camera;
import android.os.Build;
import android.util.Log;
import android.view.*;
import java.io.File;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package io.card.payment:
//			CardIOActivity, CardIONativeLibsConfig, DetectionInfo

class CardScanner
	implements android.hardware.Camera.AutoFocusCallback, android.hardware.Camera.PreviewCallback, android.view.SurfaceHolder.Callback
{

	CardScanner(CardIOActivity cardioactivity, int i1)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #146 <Method void Object()>
		boolean flag1 = false;
	//    2    4:iconst_0        
	//    3    5:istore          4
		i = false;
	//    4    7:aload_0         
	//    5    8:iconst_0        
	//    6    9:putfield        #148 <Field boolean i>
		k = -1;
	//    7   12:aload_0         
	//    8   13:iconst_m1       
	//    9   14:putfield        #150 <Field int k>
	//   10   17:aload_0         
	//   11   18:sipush          640
	//   12   21:putfield        #152 <Field int b>
	//   13   24:aload_0         
	//   14   25:sipush          480
	//   15   28:putfield        #154 <Field int c>
		l = 1;
	//   16   31:aload_0         
	//   17   32:iconst_1        
	//   18   33:putfield        #156 <Field int l>
		m = true;
	//   19   36:aload_0         
	//   20   37:iconst_1        
	//   21   38:putfield        #158 <Field boolean m>
		d = true;
	//   22   41:aload_0         
	//   23   42:iconst_1        
	//   24   43:putfield        #160 <Field boolean d>
		Intent intent = cardioactivity.getIntent();
	//   25   46:aload_1         
	//   26   47:invokevirtual   #166 <Method Intent CardIOActivity.getIntent()>
	//   27   50:astore          5
		if(intent != null)
	//*  28   52:aload           5
	//*  29   54:ifnull          116
		{
			i = intent.getBooleanExtra("io.card.payment.suppressScan", false);
	//   30   57:aload_0         
	//   31   58:aload           5
	//   32   60:ldc1            #168 <String "io.card.payment.suppressScan">
	//   33   62:iconst_0        
	//   34   63:invokevirtual   #174 <Method boolean Intent.getBooleanExtra(String, boolean)>
	//   35   66:putfield        #148 <Field boolean i>
			boolean flag = flag1;
	//   36   69:iload           4
	//   37   71:istore_3        
			if(intent.getBooleanExtra("io.card.payment.requireExpiry", false))
	//*  38   72:aload           5
	//*  39   74:ldc1            #176 <String "io.card.payment.requireExpiry">
	//*  40   76:iconst_0        
	//*  41   77:invokevirtual   #174 <Method boolean Intent.getBooleanExtra(String, boolean)>
	//*  42   80:ifeq            99
			{
				flag = flag1;
	//   43   83:iload           4
	//   44   85:istore_3        
				if(intent.getBooleanExtra("io.card.payment.scanExpiry", true))
	//*  45   86:aload           5
	//*  46   88:ldc1            #178 <String "io.card.payment.scanExpiry">
	//*  47   90:iconst_1        
	//*  48   91:invokevirtual   #174 <Method boolean Intent.getBooleanExtra(String, boolean)>
	//*  49   94:ifeq            99
					flag = true;
	//   50   97:iconst_1        
	//   51   98:istore_3        
			}
			j = flag;
	//   52   99:aload_0         
	//   53  100:iload_3         
	//   54  101:putfield        #180 <Field boolean j>
			k = intent.getIntExtra("io.card.payment.unblurDigits", -1);
	//   55  104:aload_0         
	//   56  105:aload           5
	//   57  107:ldc1            #182 <String "io.card.payment.unblurDigits">
	//   58  109:iconst_m1       
	//   59  110:invokevirtual   #186 <Method int Intent.getIntExtra(String, int)>
	//   60  113:putfield        #150 <Field int k>
		}
		a = new WeakReference(((Object) (cardioactivity)));
	//   61  116:aload_0         
	//   62  117:new             #188 <Class WeakReference>
	//   63  120:dup             
	//   64  121:aload_1         
	//   65  122:invokespecial   #191 <Method void WeakReference(Object)>
	//   66  125:putfield        #193 <Field WeakReference a>
		l = i1;
	//   67  128:aload_0         
	//   68  129:iload_2         
	//   69  130:putfield        #156 <Field int l>
		nSetup(i, 6F, k);
	//   70  133:aload_0         
	//   71  134:aload_0         
	//   72  135:getfield        #148 <Field boolean i>
	//   73  138:ldc1            #194 <Float 6F>
	//   74  140:aload_0         
	//   75  141:getfield        #150 <Field int k>
	//   76  144:invokespecial   #198 <Method void nSetup(boolean, float, int)>
	//   77  147:return          
	}

	private void a(Camera camera)
	{
		int i1;
		if(android.os.Build.VERSION.SDK_INT >= 21)
	//*   0    0:getstatic       #204 <Field int android.os.Build$VERSION.SDK_INT>
	//*   1    3:bipush          21
	//*   2    5:icmplt          44
		{
			android.hardware.Camera.CameraInfo camerainfo = new android.hardware.Camera.CameraInfo();
	//    3    8:new             #206 <Class android.hardware.Camera$CameraInfo>
	//    4   11:dup             
	//    5   12:invokespecial   #207 <Method void android.hardware.Camera$CameraInfo()>
	//    6   15:astore_3        
			Camera.getCameraInfo(0, camerainfo);
	//    7   16:iconst_0        
	//    8   17:aload_3         
	//    9   18:invokestatic    #213 <Method void Camera.getCameraInfo(int, android.hardware.Camera$CameraInfo)>
			i1 = g();
	//   10   21:aload_0         
	//   11   22:invokevirtual   #216 <Method int g()>
	//   12   25:istore_2        
			i1 = ((camerainfo.orientation - i1) + 360) % 360;
	//   13   26:aload_3         
	//   14   27:getfield        #219 <Field int android.hardware.Camera$CameraInfo.orientation>
	//   15   30:iload_2         
	//   16   31:isub            
	//   17   32:sipush          360
	//   18   35:iadd            
	//   19   36:sipush          360
	//   20   39:irem            
	//   21   40:istore_2        
		} else
	//*  22   41:goto            47
		{
			i1 = 90;
	//   23   44:bipush          90
	//   24   46:istore_2        
		}
		camera.setDisplayOrientation(i1);
	//   25   47:aload_1         
	//   26   48:iload_2         
	//   27   49:invokevirtual   #223 <Method void Camera.setDisplayOrientation(int)>
	//   28   52:return          
	}

	private static void a(String s1)
	{
		try
		{
			System.loadLibrary(s1);
	//    0    0:aload_0         
	//    1    1:invokestatic    #228 <Method void System.loadLibrary(String)>
			return;
	//    2    4:return          
		}
		catch(Object obj)
	//*   3    5:astore_1        
		{
			Object obj1 = ((Object) (CardIONativeLibsConfig.a()));
	//    4    6:invokestatic    #232 <Method String CardIONativeLibsConfig.a()>
	//    5    9:astore_2        
			if(obj1 != null && ((String) (obj1)).length() != 0)
	//*   6   10:aload_2         
	//*   7   11:ifnull          167
	//*   8   14:aload_2         
	//*   9   15:invokevirtual   #237 <Method int String.length()>
	//*  10   18:ifeq            167
			{
				obj = obj1;
	//   11   21:aload_2         
	//   12   22:astore_1        
				if(!File.separator.equals(((Object) (Character.valueOf(((String) (obj1)).charAt(((String) (obj1)).length() - 1))))))
	//*  13   23:getstatic       #242 <Field String File.separator>
	//*  14   26:aload_2         
	//*  15   27:aload_2         
	//*  16   28:invokevirtual   #237 <Method int String.length()>
	//*  17   31:iconst_1        
	//*  18   32:isub            
	//*  19   33:invokevirtual   #246 <Method char String.charAt(int)>
	//*  20   36:invokestatic    #252 <Method Character Character.valueOf(char)>
	//*  21   39:invokevirtual   #256 <Method boolean String.equals(Object)>
	//*  22   42:ifne            72
				{
					obj = ((Object) (new StringBuilder()));
	//   23   45:new             #80  <Class StringBuilder>
	//   24   48:dup             
	//   25   49:invokespecial   #83  <Method void StringBuilder()>
	//   26   52:astore_1        
					((StringBuilder) (obj)).append(((String) (obj1)));
	//   27   53:aload_1         
	//   28   54:aload_2         
	//   29   55:invokevirtual   #89  <Method StringBuilder StringBuilder.append(String)>
	//   30   58:pop             
					((StringBuilder) (obj)).append(File.separator);
	//   31   59:aload_1         
	//   32   60:getstatic       #242 <Field String File.separator>
	//   33   63:invokevirtual   #89  <Method StringBuilder StringBuilder.append(String)>
	//   34   66:pop             
					obj = ((Object) (((StringBuilder) (obj)).toString()));
	//   35   67:aload_1         
	//   36   68:invokevirtual   #98  <Method String StringBuilder.toString()>
	//   37   71:astore_1        
				}
				obj1 = ((Object) (new StringBuilder()));
	//   38   72:new             #80  <Class StringBuilder>
	//   39   75:dup             
	//   40   76:invokespecial   #83  <Method void StringBuilder()>
	//   41   79:astore_2        
				((StringBuilder) (obj1)).append(((String) (obj)));
	//   42   80:aload_2         
	//   43   81:aload_1         
	//   44   82:invokevirtual   #89  <Method StringBuilder StringBuilder.append(String)>
	//   45   85:pop             
				((StringBuilder) (obj1)).append(Build.CPU_ABI);
	//   46   86:aload_2         
	//   47   87:getstatic       #261 <Field String Build.CPU_ABI>
	//   48   90:invokevirtual   #89  <Method StringBuilder StringBuilder.append(String)>
	//   49   93:pop             
				((StringBuilder) (obj1)).append(File.separator);
	//   50   94:aload_2         
	//   51   95:getstatic       #242 <Field String File.separator>
	//   52   98:invokevirtual   #89  <Method StringBuilder StringBuilder.append(String)>
	//   53  101:pop             
				((StringBuilder) (obj1)).append(System.mapLibraryName(s1));
	//   54  102:aload_2         
	//   55  103:aload_0         
	//   56  104:invokestatic    #265 <Method String System.mapLibraryName(String)>
	//   57  107:invokevirtual   #89  <Method StringBuilder StringBuilder.append(String)>
	//   58  110:pop             
				obj = ((Object) (((StringBuilder) (obj1)).toString()));
	//   59  111:aload_2         
	//   60  112:invokevirtual   #98  <Method String StringBuilder.toString()>
	//   61  115:astore_1        
				obj1 = ((Object) (new StringBuilder()));
	//   62  116:new             #80  <Class StringBuilder>
	//   63  119:dup             
	//   64  120:invokespecial   #83  <Method void StringBuilder()>
	//   65  123:astore_2        
				((StringBuilder) (obj1)).append("loadLibrary failed for library ");
	//   66  124:aload_2         
	//   67  125:ldc2            #267 <String "loadLibrary failed for library ">
	//   68  128:invokevirtual   #89  <Method StringBuilder StringBuilder.append(String)>
	//   69  131:pop             
				((StringBuilder) (obj1)).append(s1);
	//   70  132:aload_2         
	//   71  133:aload_0         
	//   72  134:invokevirtual   #89  <Method StringBuilder StringBuilder.append(String)>
	//   73  137:pop             
				((StringBuilder) (obj1)).append(". Trying ");
	//   74  138:aload_2         
	//   75  139:ldc2            #269 <String ". Trying ">
	//   76  142:invokevirtual   #89  <Method StringBuilder StringBuilder.append(String)>
	//   77  145:pop             
				((StringBuilder) (obj1)).append(((String) (obj)));
	//   78  146:aload_2         
	//   79  147:aload_1         
	//   80  148:invokevirtual   #89  <Method StringBuilder StringBuilder.append(String)>
	//   81  151:pop             
				Log.d("card.io", ((StringBuilder) (obj1)).toString());
	//   82  152:ldc1            #62  <String "card.io">
	//   83  154:aload_2         
	//   84  155:invokevirtual   #98  <Method String StringBuilder.toString()>
	//   85  158:invokestatic    #78  <Method int Log.d(String, String)>
	//   86  161:pop             
				System.load(((String) (obj)));
	//   87  162:aload_1         
	//   88  163:invokestatic    #272 <Method void System.load(String)>
				return;
	//   89  166:return          
			} else
			{
				throw obj;
	//   90  167:aload_1         
	//   91  168:athrow          
			}
		}
	}

	static boolean a()
	{
		return !h && h();
	//    0    0:getstatic       #134 <Field boolean h>
	//    1    3:ifne            14
	//    2    6:invokestatic    #110 <Method boolean h()>
	//    3    9:ifeq            14
	//    4   12:iconst_1        
	//    5   13:ireturn         
	//    6   14:iconst_0        
	//    7   15:ireturn         
	}

	private Camera b(int i1, int j1)
	{
		long l1 = System.currentTimeMillis();
	//    0    0:invokestatic    #283 <Method long System.currentTimeMillis()>
	//    1    3:lstore          4
		if(!d) goto _L2; else goto _L1
	//    2    5:aload_0         
	//    3    6:getfield        #160 <Field boolean d>
	//    4    9:ifeq            86
_L1:
		Camera camera = Camera.open();
	//    5   12:invokestatic    #287 <Method Camera Camera.open()>
	//    6   15:astore          6
		return camera;
	//    7   17:aload           6
	//    8   19:areturn         
		Object obj;
		obj;
	//    9   20:astore          6
		int k1;
		Log.e("card.io", "Unexpected exception. Please report it as a GitHub issue", ((Throwable) (obj)));
	//   10   22:ldc1            #62  <String "card.io">
	//   11   24:ldc2            #289 <String "Unexpected exception. Please report it as a GitHub issue">
	//   12   27:aload           6
	//   13   29:invokestatic    #292 <Method int Log.e(String, String, Throwable)>
	//   14   32:pop             
		k1 = 0;
	//   15   33:iconst_0        
	//   16   34:istore_3        
		  goto _L3
	//*  17   35:goto            72
_L4:
		Log.w("card.io", "Wasn't able to connect to camera service. Waiting and trying again...");
	//   18   38:ldc1            #62  <String "card.io">
	//   19   40:ldc2            #294 <String "Wasn't able to connect to camera service. Waiting and trying again...">
	//   20   43:invokestatic    #132 <Method int Log.w(String, String)>
	//   21   46:pop             
		Thread.sleep(i1);
	//   22   47:iload_1         
	//   23   48:i2l             
	//   24   49:invokestatic    #300 <Method void Thread.sleep(long)>
		k1 = j1;
	//   25   52:iload_2         
	//   26   53:istore_3        
		  goto _L3
	//*  27   54:goto            72
		obj;
	//   28   57:astore          6
		Log.e("card.io", "Interrupted while waiting for camera", ((Throwable) (obj)));
	//   29   59:ldc1            #62  <String "card.io">
	//   30   61:ldc2            #302 <String "Interrupted while waiting for camera">
	//   31   64:aload           6
	//   32   66:invokestatic    #292 <Method int Log.e(String, String, Throwable)>
	//   33   69:pop             
		k1 = j1;
	//   34   70:iload_2         
	//   35   71:istore_3        
_L3:
		j1 = k1;
	//   36   72:iload_3         
	//   37   73:istore_2        
		if(System.currentTimeMillis() - l1 < (long)k1) goto _L1; else goto _L2
	//   38   74:invokestatic    #283 <Method long System.currentTimeMillis()>
	//   39   77:lload           4
	//   40   79:lsub            
	//   41   80:iload_3         
	//   42   81:i2l             
	//   43   82:lcmp            
	//   44   83:iflt            12
_L2:
		Log.w(f, "camera connect timeout");
	//   45   86:getstatic       #60  <Field String f>
	//   46   89:ldc2            #304 <String "camera connect timeout">
	//   47   92:invokestatic    #132 <Method int Log.w(String, String)>
	//   48   95:pop             
		return null;
	//   49   96:aconst_null     
	//   50   97:areturn         
		obj;
	//   51   98:astore          6
		  goto _L4
	//*  52  100:goto            38
	}

	private boolean b(SurfaceHolder surfaceholder)
	{
		if(!e && surfaceholder == null)
	//*   0    0:getstatic       #54  <Field boolean e>
	//*   1    3:ifne            21
	//*   2    6:aload_1         
	//*   3    7:ifnull          13
	//*   4   10:goto            21
			throw new AssertionError();
	//    5   13:new             #309 <Class AssertionError>
	//    6   16:dup             
	//    7   17:invokespecial   #310 <Method void AssertionError()>
	//    8   20:athrow          
		if(!e && surfaceholder.getSurface() == null)
	//*   9   21:getstatic       #54  <Field boolean e>
	//*  10   24:ifne            47
	//*  11   27:aload_1         
	//*  12   28:invokeinterface #316 <Method android.view.Surface SurfaceHolder.getSurface()>
	//*  13   33:ifnull          39
	//*  14   36:goto            47
			throw new AssertionError();
	//   15   39:new             #309 <Class AssertionError>
	//   16   42:dup             
	//   17   43:invokespecial   #310 <Method void AssertionError()>
	//   18   46:athrow          
		m = true;
	//   19   47:aload_0         
	//   20   48:iconst_1        
	//   21   49:putfield        #158 <Field boolean m>
		if(d)
	//*  22   52:aload_0         
	//*  23   53:getfield        #160 <Field boolean d>
	//*  24   56:ifeq            110
		{
			try
			{
				q.setPreviewDisplay(surfaceholder);
	//   25   59:aload_0         
	//   26   60:getfield        #318 <Field Camera q>
	//   27   63:aload_1         
	//   28   64:invokevirtual   #322 <Method void Camera.setPreviewDisplay(SurfaceHolder)>
			}
	//*  29   67:aload_0         
	//*  30   68:getfield        #318 <Field Camera q>
	//*  31   71:invokevirtual   #325 <Method void Camera.startPreview()>
	//*  32   74:aload_0         
	//*  33   75:getfield        #318 <Field Camera q>
	//*  34   78:aload_0         
	//*  35   79:invokevirtual   #329 <Method void Camera.autoFocus(android.hardware.Camera$AutoFocusCallback)>
	//*  36   82:iconst_1        
	//*  37   83:ireturn         
	//*  38   84:astore_1        
	//*  39   85:ldc1            #62  <String "card.io">
	//*  40   87:ldc2            #331 <String "startPreview failed on camera. Error: ">
	//*  41   90:aload_1         
	//*  42   91:invokestatic    #292 <Method int Log.e(String, String, Throwable)>
	//*  43   94:pop             
	//*  44   95:iconst_0        
	//*  45   96:ireturn         
			// Misplaced declaration of an exception variable
			catch(SurfaceHolder surfaceholder)
	//*  46   97:astore_1        
			{
				Log.e("card.io", "can't set preview display", ((Throwable) (surfaceholder)));
	//   47   98:ldc1            #62  <String "card.io">
	//   48  100:ldc2            #333 <String "can't set preview display">
	//   49  103:aload_1         
	//   50  104:invokestatic    #292 <Method int Log.e(String, String, Throwable)>
	//   51  107:pop             
				return false;
	//   52  108:iconst_0        
	//   53  109:ireturn         
			}
			try
			{
				q.startPreview();
				q.autoFocus(((android.hardware.Camera.AutoFocusCallback) (this)));
			}
			// Misplaced declaration of an exception variable
			catch(SurfaceHolder surfaceholder)
			{
				Log.e("card.io", "startPreview failed on camera. Error: ", ((Throwable) (surfaceholder)));
				return false;
			}
			return true;
		} else
		{
			return true;
	//   54  110:iconst_1        
	//   55  111:ireturn         
		}
	}

	private static boolean h()
	{
		return nUseNeon() || nUseTegra() || nUseX86();
	//    0    0:invokestatic    #92  <Method boolean nUseNeon()>
	//    1    3:ifne            23
	//    2    6:invokestatic    #103 <Method boolean nUseTegra()>
	//    3    9:ifne            23
	//    4   12:invokestatic    #108 <Method boolean nUseX86()>
	//    5   15:ifeq            21
	//    6   18:goto            23
	//    7   21:iconst_0        
	//    8   22:ireturn         
	//    9   23:iconst_1        
	//   10   24:ireturn         
	}

	private native void nCleanup();

	private native void nGetGuideFrame(int i1, int j1, int k1, Rect rect);

	private native int nGetNumFramesScanned();

	private native void nResetAnalytics();

	private native void nScanFrame(byte abyte0[], int i1, int j1, int k1, DetectionInfo detectioninfo, Bitmap bitmap, boolean flag);

	private native void nSetup(boolean flag, float f1);

	private native void nSetup(boolean flag, float f1, int i1);

	public static native boolean nUseNeon();

	public static native boolean nUseTegra();

	public static native boolean nUseX86();

	Rect a(int i1, int j1)
	{
		return a(l, i1, j1);
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #156 <Field int l>
	//    3    5:iload_1         
	//    4    6:iload_2         
	//    5    7:invokevirtual   #345 <Method Rect a(int, int, int)>
	//    6   10:areturn         
	}

	Rect a(int i1, int j1, int k1)
	{
		if(a())
	//*   0    0:invokestatic    #347 <Method boolean a()>
	//*   1    3:ifeq            27
		{
			Rect rect = new Rect();
	//    2    6:new             #349 <Class Rect>
	//    3    9:dup             
	//    4   10:invokespecial   #350 <Method void Rect()>
	//    5   13:astore          4
			nGetGuideFrame(i1, j1, k1, rect);
	//    6   15:aload_0         
	//    7   16:iload_1         
	//    8   17:iload_2         
	//    9   18:iload_3         
	//   10   19:aload           4
	//   11   21:invokespecial   #352 <Method void nGetGuideFrame(int, int, int, Rect)>
			return rect;
	//   12   24:aload           4
	//   13   26:areturn         
		} else
		{
			return null;
	//   14   27:aconst_null     
	//   15   28:areturn         
		}
	}

	void a(int i1)
	{
		l = i1;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #156 <Field int l>
	//    3    5:return          
	}

	void a(boolean flag)
	{
		if(!d || e())
			break MISSING_BLOCK_LABEL_95;
	//    0    0:aload_0         
	//    1    1:getfield        #160 <Field boolean d>
	//    2    4:ifeq            95
	//    3    7:aload_0         
	//    4    8:invokevirtual   #355 <Method boolean e()>
	//    5   11:ifne            95
		o = System.currentTimeMillis();
	//    6   14:aload_0         
	//    7   15:invokestatic    #283 <Method long System.currentTimeMillis()>
	//    8   18:putfield        #357 <Field long o>
		q.autoFocus(((android.hardware.Camera.AutoFocusCallback) (this)));
	//    9   21:aload_0         
	//   10   22:getfield        #318 <Field Camera q>
	//   11   25:aload_0         
	//   12   26:invokevirtual   #329 <Method void Camera.autoFocus(android.hardware.Camera$AutoFocusCallback)>
		if(flag)
	//*  13   29:iload_1         
	//*  14   30:ifeq            44
		{
			try
			{
				t = t + 1;
	//   15   33:aload_0         
	//   16   34:aload_0         
	//   17   35:getfield        #359 <Field int t>
	//   18   38:iconst_1        
	//   19   39:iadd            
	//   20   40:putfield        #359 <Field int t>
				return;
	//   21   43:return          
			}
	//*  22   44:aload_0         
	//*  23   45:aload_0         
	//*  24   46:getfield        #361 <Field int u>
	//*  25   49:iconst_1        
	//*  26   50:iadd            
	//*  27   51:putfield        #361 <Field int u>
	//*  28   54:return          
			catch(RuntimeException runtimeexception)
	//*  29   55:astore_2        
			{
				String s1 = f;
	//   30   56:getstatic       #60  <Field String f>
	//   31   59:astore_3        
				StringBuilder stringbuilder = new StringBuilder();
	//   32   60:new             #80  <Class StringBuilder>
	//   33   63:dup             
	//   34   64:invokespecial   #83  <Method void StringBuilder()>
	//   35   67:astore          4
				stringbuilder.append("could not trigger auto focus: ");
	//   36   69:aload           4
	//   37   71:ldc2            #363 <String "could not trigger auto focus: ">
	//   38   74:invokevirtual   #89  <Method StringBuilder StringBuilder.append(String)>
	//   39   77:pop             
				stringbuilder.append(((Object) (runtimeexception)));
	//   40   78:aload           4
	//   41   80:aload_2         
	//   42   81:invokevirtual   #366 <Method StringBuilder StringBuilder.append(Object)>
	//   43   84:pop             
				Log.w(s1, stringbuilder.toString());
	//   44   85:aload_3         
	//   45   86:aload           4
	//   46   88:invokevirtual   #98  <Method String StringBuilder.toString()>
	//   47   91:invokestatic    #132 <Method int Log.w(String, String)>
	//   48   94:pop             
			}
			break MISSING_BLOCK_LABEL_95;
		}
		u = u + 1;
		return;
	//   49   95:return          
	}

	boolean a(SurfaceHolder surfaceholder)
	{
		if(q == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #318 <Field Camera q>
	//*   2    4:ifnonnull       11
			b();
	//    3    7:aload_0         
	//    4    8:invokevirtual   #368 <Method void b()>
		if(d && q == null)
	//*   5   11:aload_0         
	//*   6   12:getfield        #160 <Field boolean d>
	//*   7   15:ifeq            37
	//*   8   18:aload_0         
	//*   9   19:getfield        #318 <Field Camera q>
	//*  10   22:ifnonnull       37
		{
			Log.i(f, "null camera. failure");
	//   11   25:getstatic       #60  <Field String f>
	//   12   28:ldc2            #370 <String "null camera. failure">
	//   13   31:invokestatic    #69  <Method int Log.i(String, String)>
	//   14   34:pop             
			return false;
	//   15   35:iconst_0        
	//   16   36:ireturn         
		}
		if(!e && surfaceholder == null)
	//*  17   37:getstatic       #54  <Field boolean e>
	//*  18   40:ifne            58
	//*  19   43:aload_1         
	//*  20   44:ifnull          50
	//*  21   47:goto            58
			throw new AssertionError();
	//   22   50:new             #309 <Class AssertionError>
	//   23   53:dup             
	//   24   54:invokespecial   #310 <Method void AssertionError()>
	//   25   57:athrow          
		if(d && r == null)
	//*  26   58:aload_0         
	//*  27   59:getfield        #160 <Field boolean d>
	//*  28   62:ifeq            111
	//*  29   65:aload_0         
	//*  30   66:getfield        #372 <Field byte[] r>
	//*  31   69:ifnonnull       111
		{
			r = new byte[(ImageFormat.getBitsPerPixel(q.getParameters().getPreviewFormat()) / 8) * 0x4b000 * 3];
	//   32   72:aload_0         
	//   33   73:aload_0         
	//   34   74:getfield        #318 <Field Camera q>
	//   35   77:invokevirtual   #376 <Method android.hardware.Camera$Parameters Camera.getParameters()>
	//   36   80:invokevirtual   #381 <Method int android.hardware.Camera$Parameters.getPreviewFormat()>
	//   37   83:invokestatic    #387 <Method int ImageFormat.getBitsPerPixel(int)>
	//   38   86:bipush          8
	//   39   88:idiv            
	//   40   89:ldc2            #388 <Int 0x4b000>
	//   41   92:imul            
	//   42   93:iconst_3        
	//   43   94:imul            
	//   44   95:newarray        byte[]
	//   45   97:putfield        #372 <Field byte[] r>
			q.addCallbackBuffer(r);
	//   46  100:aload_0         
	//   47  101:getfield        #318 <Field Camera q>
	//   48  104:aload_0         
	//   49  105:getfield        #372 <Field byte[] r>
	//   50  108:invokevirtual   #392 <Method void Camera.addCallbackBuffer(byte[])>
		}
		surfaceholder.addCallback(((android.view.SurfaceHolder.Callback) (this)));
	//   51  111:aload_1         
	//   52  112:aload_0         
	//   53  113:invokeinterface #396 <Method void SurfaceHolder.addCallback(android.view.SurfaceHolder$Callback)>
		surfaceholder.setType(3);
	//   54  118:aload_1         
	//   55  119:iconst_3        
	//   56  120:invokeinterface #399 <Method void SurfaceHolder.setType(int)>
		if(d)
	//*  57  125:aload_0         
	//*  58  126:getfield        #160 <Field boolean d>
	//*  59  129:ifeq            140
			q.setPreviewCallbackWithBuffer(((android.hardware.Camera.PreviewCallback) (this)));
	//   60  132:aload_0         
	//   61  133:getfield        #318 <Field Camera q>
	//   62  136:aload_0         
	//   63  137:invokevirtual   #403 <Method void Camera.setPreviewCallbackWithBuffer(android.hardware.Camera$PreviewCallback)>
		if(s)
	//*  64  140:aload_0         
	//*  65  141:getfield        #405 <Field boolean s>
	//*  66  144:ifeq            153
			b(surfaceholder);
	//   67  147:aload_0         
	//   68  148:aload_1         
	//   69  149:invokespecial   #407 <Method boolean b(SurfaceHolder)>
	//   70  152:pop             
		b(false);
	//   71  153:aload_0         
	//   72  154:iconst_0        
	//   73  155:invokevirtual   #410 <Method boolean b(boolean)>
	//   74  158:pop             
		n = System.currentTimeMillis();
	//   75  159:aload_0         
	//   76  160:invokestatic    #283 <Method long System.currentTimeMillis()>
	//   77  163:putfield        #412 <Field long n>
		nResetAnalytics();
	//   78  166:aload_0         
	//   79  167:invokespecial   #414 <Method void nResetAnalytics()>
		return true;
	//   80  170:iconst_1        
	//   81  171:ireturn         
	}

	void b()
	{
		m = true;
	//    0    0:aload_0         
	//    1    1:iconst_1        
	//    2    2:putfield        #158 <Field boolean m>
		o = 0L;
	//    3    5:aload_0         
	//    4    6:lconst_0        
	//    5    7:putfield        #357 <Field long o>
		p = 0L;
	//    6   10:aload_0         
	//    7   11:lconst_0        
	//    8   12:putfield        #416 <Field long p>
		t = 0;
	//    9   15:aload_0         
	//   10   16:iconst_0        
	//   11   17:putfield        #359 <Field int t>
		u = 0;
	//   12   20:aload_0         
	//   13   21:iconst_0        
	//   14   22:putfield        #361 <Field int u>
		v = 0;
	//   15   25:aload_0         
	//   16   26:iconst_0        
	//   17   27:putfield        #418 <Field int v>
		w = 0;
	//   18   30:aload_0         
	//   19   31:iconst_0        
	//   20   32:putfield        #420 <Field int w>
		if(d && q == null)
	//*  21   35:aload_0         
	//*  22   36:getfield        #160 <Field boolean d>
	//*  23   39:ifeq            219
	//*  24   42:aload_0         
	//*  25   43:getfield        #318 <Field Camera q>
	//*  26   46:ifnonnull       219
		{
			q = b(50, 5000);
	//   27   49:aload_0         
	//   28   50:aload_0         
	//   29   51:bipush          50
	//   30   53:sipush          5000
	//   31   56:invokespecial   #422 <Method Camera b(int, int)>
	//   32   59:putfield        #318 <Field Camera q>
			Camera camera = q;
	//   33   62:aload_0         
	//   34   63:getfield        #318 <Field Camera q>
	//   35   66:astore_1        
			if(camera == null)
	//*  36   67:aload_1         
	//*  37   68:ifnonnull       81
			{
				Log.e("card.io", "prepare scanner couldn't connect to camera!");
	//   38   71:ldc1            #62  <String "card.io">
	//   39   73:ldc2            #424 <String "prepare scanner couldn't connect to camera!">
	//   40   76:invokestatic    #141 <Method int Log.e(String, String)>
	//   41   79:pop             
				return;
	//   42   80:return          
			}
			a(camera);
	//   43   81:aload_0         
	//   44   82:aload_1         
	//   45   83:invokespecial   #426 <Method void a(Camera)>
			android.hardware.Camera.Parameters parameters = q.getParameters();
	//   46   86:aload_0         
	//   47   87:getfield        #318 <Field Camera q>
	//   48   90:invokevirtual   #376 <Method android.hardware.Camera$Parameters Camera.getParameters()>
	//   49   93:astore_3        
			List list = parameters.getSupportedPreviewSizes();
	//   50   94:aload_3         
	//   51   95:invokevirtual   #430 <Method List android.hardware.Camera$Parameters.getSupportedPreviewSizes()>
	//   52   98:astore          4
			if(list != null)
	//*  53  100:aload           4
	//*  54  102:ifnull          198
			{
				Object obj = null;
	//   55  105:aconst_null     
	//   56  106:astore_2        
				Iterator iterator = list.iterator();
	//   57  107:aload           4
	//   58  109:invokeinterface #436 <Method Iterator List.iterator()>
	//   59  114:astore          5
				android.hardware.Camera.Size size;
				do
				{
					size = ((android.hardware.Camera.Size) (obj));
	//   60  116:aload_2         
	//   61  117:astore_1        
					if(!iterator.hasNext())
						break;
	//   62  118:aload           5
	//   63  120:invokeinterface #441 <Method boolean Iterator.hasNext()>
	//   64  125:ifeq            159
					size = (android.hardware.Camera.Size)iterator.next();
	//   65  128:aload           5
	//   66  130:invokeinterface #445 <Method Object Iterator.next()>
	//   67  135:checkcast       #447 <Class android.hardware.Camera$Size>
	//   68  138:astore_1        
				} while(size.width != 640 || size.height != 480);
	//   69  139:aload_1         
	//   70  140:getfield        #450 <Field int android.hardware.Camera$Size.width>
	//   71  143:sipush          640
	//   72  146:icmpne          116
	//   73  149:aload_1         
	//   74  150:getfield        #453 <Field int android.hardware.Camera$Size.height>
	//   75  153:sipush          480
	//   76  156:icmpne          116
				if(size == null)
	//*  77  159:aload_1         
	//*  78  160:ifnonnull       198
				{
					Log.w("card.io", "Didn't find a supported 640x480 resolution, so forcing");
	//   79  163:ldc1            #62  <String "card.io">
	//   80  165:ldc2            #455 <String "Didn't find a supported 640x480 resolution, so forcing">
	//   81  168:invokestatic    #132 <Method int Log.w(String, String)>
	//   82  171:pop             
					android.hardware.Camera.Size size1 = (android.hardware.Camera.Size)list.get(0);
	//   83  172:aload           4
	//   84  174:iconst_0        
	//   85  175:invokeinterface #459 <Method Object List.get(int)>
	//   86  180:checkcast       #447 <Class android.hardware.Camera$Size>
	//   87  183:astore_1        
					size1.width = 640;
	//   88  184:aload_1         
	//   89  185:sipush          640
	//   90  188:putfield        #450 <Field int android.hardware.Camera$Size.width>
					size1.height = 480;
	//   91  191:aload_1         
	//   92  192:sipush          480
	//   93  195:putfield        #453 <Field int android.hardware.Camera$Size.height>
				}
			}
			parameters.setPreviewSize(640, 480);
	//   94  198:aload_3         
	//   95  199:sipush          640
	//   96  202:sipush          480
	//   97  205:invokevirtual   #463 <Method void android.hardware.Camera$Parameters.setPreviewSize(int, int)>
			q.setParameters(parameters);
	//   98  208:aload_0         
	//   99  209:getfield        #318 <Field Camera q>
	//  100  212:aload_3         
	//  101  213:invokevirtual   #467 <Method void Camera.setParameters(android.hardware.Camera$Parameters)>
		} else
	//* 102  216:goto            284
		if(!d)
	//* 103  219:aload_0         
	//* 104  220:getfield        #160 <Field boolean d>
	//* 105  223:ifne            239
			Log.w(f, "useCamera is false!");
	//  106  226:getstatic       #60  <Field String f>
	//  107  229:ldc2            #469 <String "useCamera is false!">
	//  108  232:invokestatic    #132 <Method int Log.w(String, String)>
	//  109  235:pop             
		else
	//* 110  236:goto            284
		if(q != null)
	//* 111  239:aload_0         
	//* 112  240:getfield        #318 <Field Camera q>
	//* 113  243:ifnull          284
		{
			String s1 = f;
	//  114  246:getstatic       #60  <Field String f>
	//  115  249:astore_1        
			StringBuilder stringbuilder = new StringBuilder();
	//  116  250:new             #80  <Class StringBuilder>
	//  117  253:dup             
	//  118  254:invokespecial   #83  <Method void StringBuilder()>
	//  119  257:astore_2        
			stringbuilder.append("we already have a camera instance: ");
	//  120  258:aload_2         
	//  121  259:ldc2            #471 <String "we already have a camera instance: ">
	//  122  262:invokevirtual   #89  <Method StringBuilder StringBuilder.append(String)>
	//  123  265:pop             
			stringbuilder.append(((Object) (q)));
	//  124  266:aload_2         
	//  125  267:aload_0         
	//  126  268:getfield        #318 <Field Camera q>
	//  127  271:invokevirtual   #366 <Method StringBuilder StringBuilder.append(Object)>
	//  128  274:pop             
			Log.v(s1, stringbuilder.toString());
	//  129  275:aload_1         
	//  130  276:aload_2         
	//  131  277:invokevirtual   #98  <Method String StringBuilder.toString()>
	//  132  280:invokestatic    #473 <Method int Log.v(String, String)>
	//  133  283:pop             
		}
		if(g == null)
	//* 134  284:aload_0         
	//* 135  285:getfield        #475 <Field Bitmap g>
	//* 136  288:ifnonnull       307
			g = Bitmap.createBitmap(428, 270, android.graphics.Bitmap.Config.ARGB_8888);
	//  137  291:aload_0         
	//  138  292:sipush          428
	//  139  295:sipush          270
	//  140  298:getstatic       #481 <Field android.graphics.Bitmap$Config android.graphics.Bitmap$Config.ARGB_8888>
	//  141  301:invokestatic    #487 <Method Bitmap Bitmap.createBitmap(int, int, android.graphics.Bitmap$Config)>
	//  142  304:putfield        #475 <Field Bitmap g>
	//  143  307:return          
	}

	public boolean b(boolean flag)
	{
		Object obj;
		obj = ((Object) (q));
	//    0    0:aload_0         
	//    1    1:getfield        #318 <Field Camera q>
	//    2    4:astore_2        
		if(obj == null)
			break MISSING_BLOCK_LABEL_90;
	//    3    5:aload_2         
	//    4    6:ifnull          90
		android.hardware.Camera.Parameters parameters = ((Camera) (obj)).getParameters();
	//    5    9:aload_2         
	//    6   10:invokevirtual   #376 <Method android.hardware.Camera$Parameters Camera.getParameters()>
	//    7   13:astore_3        
		if(flag)
	//*   8   14:iload_1         
	//*   9   15:ifeq            92
			obj = "torch";
	//   10   18:ldc2            #489 <String "torch">
	//   11   21:astore_2        
		else
	//*  12   22:goto            25
	//*  13   25:aload_3         
	//*  14   26:aload_2         
	//*  15   27:invokevirtual   #492 <Method void android.hardware.Camera$Parameters.setFlashMode(String)>
	//*  16   30:aload_0         
	//*  17   31:getfield        #318 <Field Camera q>
	//*  18   34:aload_3         
	//*  19   35:invokevirtual   #467 <Method void Camera.setParameters(android.hardware.Camera$Parameters)>
	//*  20   38:aload_0         
	//*  21   39:aload_0         
	//*  22   40:getfield        #418 <Field int v>
	//*  23   43:iconst_1        
	//*  24   44:iadd            
	//*  25   45:putfield        #418 <Field int v>
	//*  26   48:iconst_1        
	//*  27   49:ireturn         
	//*  28   50:astore_2        
	//*  29   51:getstatic       #60  <Field String f>
	//*  30   54:astore_3        
	//*  31   55:new             #80  <Class StringBuilder>
	//*  32   58:dup             
	//*  33   59:invokespecial   #83  <Method void StringBuilder()>
	//*  34   62:astore          4
	//*  35   64:aload           4
	//*  36   66:ldc2            #494 <String "Could not set flash mode: ">
	//*  37   69:invokevirtual   #89  <Method StringBuilder StringBuilder.append(String)>
	//*  38   72:pop             
	//*  39   73:aload           4
	//*  40   75:aload_2         
	//*  41   76:invokevirtual   #366 <Method StringBuilder StringBuilder.append(Object)>
	//*  42   79:pop             
	//*  43   80:aload_3         
	//*  44   81:aload           4
	//*  45   83:invokevirtual   #98  <Method String StringBuilder.toString()>
	//*  46   86:invokestatic    #132 <Method int Log.w(String, String)>
	//*  47   89:pop             
	//*  48   90:iconst_0        
	//*  49   91:ireturn         
			obj = "off";
	//   50   92:ldc2            #496 <String "off">
	//   51   95:astore_2        
		parameters.setFlashMode(((String) (obj)));
		q.setParameters(parameters);
		v = v + 1;
		return true;
		obj;
		String s1 = f;
		StringBuilder stringbuilder = new StringBuilder();
		stringbuilder.append("Could not set flash mode: ");
		stringbuilder.append(obj);
		Log.w(s1, stringbuilder.toString());
		return false;
	//*  52   96:goto            25
	}

	public void c()
	{
		b(false);
	//    0    0:aload_0         
	//    1    1:iconst_0        
	//    2    2:invokevirtual   #410 <Method boolean b(boolean)>
	//    3    5:pop             
		Camera camera = q;
	//    4    6:aload_0         
	//    5    7:getfield        #318 <Field Camera q>
	//    6   10:astore_1        
		if(camera != null)
	//*   7   11:aload_1         
	//*   8   12:ifnull          66
		{
			try
			{
				camera.stopPreview();
	//    9   15:aload_1         
	//   10   16:invokevirtual   #499 <Method void Camera.stopPreview()>
				q.setPreviewDisplay(((SurfaceHolder) (null)));
	//   11   19:aload_0         
	//   12   20:getfield        #318 <Field Camera q>
	//   13   23:aconst_null     
	//   14   24:invokevirtual   #322 <Method void Camera.setPreviewDisplay(SurfaceHolder)>
			}
	//*  15   27:goto            41
			catch(IOException ioexception)
	//*  16   30:astore_1        
			{
				Log.w("card.io", "can't stop preview display", ((Throwable) (ioexception)));
	//   17   31:ldc1            #62  <String "card.io">
	//   18   33:ldc2            #501 <String "can't stop preview display">
	//   19   36:aload_1         
	//   20   37:invokestatic    #503 <Method int Log.w(String, String, Throwable)>
	//   21   40:pop             
			}
			q.setPreviewCallback(((android.hardware.Camera.PreviewCallback) (null)));
	//   22   41:aload_0         
	//   23   42:getfield        #318 <Field Camera q>
	//   24   45:aconst_null     
	//   25   46:invokevirtual   #506 <Method void Camera.setPreviewCallback(android.hardware.Camera$PreviewCallback)>
			q.release();
	//   26   49:aload_0         
	//   27   50:getfield        #318 <Field Camera q>
	//   28   53:invokevirtual   #509 <Method void Camera.release()>
			r = null;
	//   29   56:aload_0         
	//   30   57:aconst_null     
	//   31   58:putfield        #372 <Field byte[] r>
			q = null;
	//   32   61:aload_0         
	//   33   62:aconst_null     
	//   34   63:putfield        #318 <Field Camera q>
		}
	//   35   66:return          
	}

	public void d()
	{
		if(q != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #318 <Field Camera q>
	//*   2    4:ifnull          11
			c();
	//    3    7:aload_0         
	//    4    8:invokevirtual   #511 <Method void c()>
		nCleanup();
	//    5   11:aload_0         
	//    6   12:invokespecial   #513 <Method void nCleanup()>
		r = null;
	//    7   15:aload_0         
	//    8   16:aconst_null     
	//    9   17:putfield        #372 <Field byte[] r>
	//   10   20:return          
	}

	boolean e()
	{
		return p < o;
	//    0    0:aload_0         
	//    1    1:getfield        #416 <Field long p>
	//    2    4:aload_0         
	//    3    5:getfield        #357 <Field long o>
	//    4    8:lcmp            
	//    5    9:ifge            14
	//    6   12:iconst_1        
	//    7   13:ireturn         
	//    8   14:iconst_0        
	//    9   15:ireturn         
	}

	public boolean f()
	{
		if(!d)
	//*   0    0:aload_0         
	//*   1    1:getfield        #160 <Field boolean d>
	//*   2    4:ifne            9
			return false;
	//    3    7:iconst_0        
	//    4    8:ireturn         
		else
			return q.getParameters().getFlashMode().equals("torch");
	//    5    9:aload_0         
	//    6   10:getfield        #318 <Field Camera q>
	//    7   13:invokevirtual   #376 <Method android.hardware.Camera$Parameters Camera.getParameters()>
	//    8   16:invokevirtual   #516 <Method String android.hardware.Camera$Parameters.getFlashMode()>
	//    9   19:ldc2            #489 <String "torch">
	//   10   22:invokevirtual   #256 <Method boolean String.equals(Object)>
	//   11   25:ireturn         
	}

	int g()
	{
		int i1 = ((WindowManager)((CardIOActivity)a.get()).getSystemService("window")).getDefaultDisplay().getRotation();
	//    0    0:aload_0         
	//    1    1:getfield        #193 <Field WeakReference a>
	//    2    4:invokevirtual   #518 <Method Object WeakReference.get()>
	//    3    7:checkcast       #162 <Class CardIOActivity>
	//    4   10:ldc2            #520 <String "window">
	//    5   13:invokevirtual   #524 <Method Object CardIOActivity.getSystemService(String)>
	//    6   16:checkcast       #526 <Class WindowManager>
	//    7   19:invokeinterface #530 <Method Display WindowManager.getDefaultDisplay()>
	//    8   24:invokevirtual   #535 <Method int Display.getRotation()>
	//    9   27:istore_2        
		char c1 = '\0';
	//   10   28:iconst_0        
	//   11   29:istore_1        
		if(i1 == 0)
	//*  12   30:iload_2         
	//*  13   31:ifne            36
			return 0;
	//   14   34:iconst_0        
	//   15   35:ireturn         
		if(i1 == 1)
	//*  16   36:iload_2         
	//*  17   37:iconst_1        
	//*  18   38:icmpne          44
			return 90;
	//   19   41:bipush          90
	//   20   43:ireturn         
		if(i1 == 2)
	//*  21   44:iload_2         
	//*  22   45:iconst_2        
	//*  23   46:icmpne          53
			return 180;
	//   24   49:sipush          180
	//   25   52:ireturn         
		if(i1 == 3)
	//*  26   53:iload_2         
	//*  27   54:iconst_3        
	//*  28   55:icmpne          62
			c1 = '\u010E';
	//   29   58:sipush          270
	//   30   61:istore_1        
		return ((int) (c1));
	//   31   62:iload_1         
	//   32   63:ireturn         
	}

	public void onAutoFocus(boolean flag, Camera camera)
	{
		p = System.currentTimeMillis();
	//    0    0:aload_0         
	//    1    1:invokestatic    #283 <Method long System.currentTimeMillis()>
	//    2    4:putfield        #416 <Field long p>
	//    3    7:return          
	}

	void onEdgeUpdate(DetectionInfo detectioninfo)
	{
		((CardIOActivity)a.get()).a(detectioninfo);
	//    0    0:aload_0         
	//    1    1:getfield        #193 <Field WeakReference a>
	//    2    4:invokevirtual   #518 <Method Object WeakReference.get()>
	//    3    7:checkcast       #162 <Class CardIOActivity>
	//    4   10:aload_1         
	//    5   11:invokevirtual   #541 <Method void CardIOActivity.a(DetectionInfo)>
	//    6   14:return          
	}

	public void onPreviewFrame(byte abyte0[], Camera camera)
	{
		if(abyte0 == null)
	//*   0    0:aload_1         
	//*   1    1:ifnonnull       15
		{
			Log.w(f, "frame is null! skipping");
	//    2    4:getstatic       #60  <Field String f>
	//    3    7:ldc2            #545 <String "frame is null! skipping">
	//    4   10:invokestatic    #132 <Method int Log.w(String, String)>
	//    5   13:pop             
			return;
	//    6   14:return          
		}
		boolean flag1 = x;
	//    7   15:getstatic       #143 <Field boolean x>
	//    8   18:istore          4
		boolean flag = true;
	//    9   20:iconst_1        
	//   10   21:istore_3        
		if(flag1)
	//*  11   22:iload           4
	//*  12   24:ifeq            57
		{
			Log.e(f, "processing in progress.... dropping frame");
	//   13   27:getstatic       #60  <Field String f>
	//   14   30:ldc2            #547 <String "processing in progress.... dropping frame">
	//   15   33:invokestatic    #141 <Method int Log.e(String, String)>
	//   16   36:pop             
			w = w + 1;
	//   17   37:aload_0         
	//   18   38:aload_0         
	//   19   39:getfield        #420 <Field int w>
	//   20   42:iconst_1        
	//   21   43:iadd            
	//   22   44:putfield        #420 <Field int w>
			if(camera != null)
	//*  23   47:aload_2         
	//*  24   48:ifnull          56
				camera.addCallbackBuffer(abyte0);
	//   25   51:aload_2         
	//   26   52:aload_1         
	//   27   53:invokevirtual   #392 <Method void Camera.addCallbackBuffer(byte[])>
			return;
	//   28   56:return          
		}
		x = true;
	//   29   57:iconst_1        
	//   30   58:putstatic       #143 <Field boolean x>
		if(m)
	//*  31   61:aload_0         
	//*  32   62:getfield        #158 <Field boolean m>
	//*  33   65:ifeq            92
		{
			m = false;
	//   34   68:aload_0         
	//   35   69:iconst_0        
	//   36   70:putfield        #158 <Field boolean m>
			l = 1;
	//   37   73:aload_0         
	//   38   74:iconst_1        
	//   39   75:putfield        #156 <Field int l>
			((CardIOActivity)a.get()).a(1);
	//   40   78:aload_0         
	//   41   79:getfield        #193 <Field WeakReference a>
	//   42   82:invokevirtual   #518 <Method Object WeakReference.get()>
	//   43   85:checkcast       #162 <Class CardIOActivity>
	//   44   88:iconst_1        
	//   45   89:invokevirtual   #549 <Method void CardIOActivity.a(int)>
		}
		DetectionInfo detectioninfo = new DetectionInfo();
	//   46   92:new             #551 <Class DetectionInfo>
	//   47   95:dup             
	//   48   96:invokespecial   #552 <Method void DetectionInfo()>
	//   49   99:astore          5
		nScanFrame(abyte0, 640, 480, l, detectioninfo, g, j);
	//   50  101:aload_0         
	//   51  102:aload_1         
	//   52  103:sipush          640
	//   53  106:sipush          480
	//   54  109:aload_0         
	//   55  110:getfield        #156 <Field int l>
	//   56  113:aload           5
	//   57  115:aload_0         
	//   58  116:getfield        #475 <Field Bitmap g>
	//   59  119:aload_0         
	//   60  120:getfield        #180 <Field boolean j>
	//   61  123:invokespecial   #554 <Method void nScanFrame(byte[], int, int, int, DetectionInfo, Bitmap, boolean)>
		if(detectioninfo.focusScore < 6F)
	//*  62  126:aload           5
	//*  63  128:getfield        #558 <Field float DetectionInfo.focusScore>
	//*  64  131:ldc1            #194 <Float 6F>
	//*  65  133:fcmpl           
	//*  66  134:iflt            140
	//*  67  137:goto            142
			flag = false;
	//   68  140:iconst_0        
	//   69  141:istore_3        
		if(!flag)
	//*  70  142:iload_3         
	//*  71  143:ifne            154
			a(false);
	//   72  146:aload_0         
	//   73  147:iconst_0        
	//   74  148:invokevirtual   #560 <Method void a(boolean)>
		else
	//*  75  151:goto            196
		if(detectioninfo.b() || i && detectioninfo.a())
	//*  76  154:aload           5
	//*  77  156:invokevirtual   #562 <Method boolean DetectionInfo.b()>
	//*  78  159:ifne            177
	//*  79  162:aload_0         
	//*  80  163:getfield        #148 <Field boolean i>
	//*  81  166:ifeq            196
	//*  82  169:aload           5
	//*  83  171:invokevirtual   #563 <Method boolean DetectionInfo.a()>
	//*  84  174:ifeq            196
			((CardIOActivity)a.get()).a(g, detectioninfo);
	//   85  177:aload_0         
	//   86  178:getfield        #193 <Field WeakReference a>
	//   87  181:invokevirtual   #518 <Method Object WeakReference.get()>
	//   88  184:checkcast       #162 <Class CardIOActivity>
	//   89  187:aload_0         
	//   90  188:getfield        #475 <Field Bitmap g>
	//   91  191:aload           5
	//   92  193:invokevirtual   #566 <Method void CardIOActivity.a(Bitmap, DetectionInfo)>
		if(camera != null)
	//*  93  196:aload_2         
	//*  94  197:ifnull          205
			camera.addCallbackBuffer(abyte0);
	//   95  200:aload_2         
	//   96  201:aload_1         
	//   97  202:invokevirtual   #392 <Method void Camera.addCallbackBuffer(byte[])>
		x = false;
	//   98  205:iconst_0        
	//   99  206:putstatic       #143 <Field boolean x>
	//  100  209:return          
	}

	public void surfaceChanged(SurfaceHolder surfaceholder, int i1, int j1, int k1)
	{
		String s1 = f;
	//    0    0:getstatic       #60  <Field String f>
	//    1    3:astore          6
		boolean flag;
		if(surfaceholder != null)
	//*   2    5:aload_1         
	//*   3    6:ifnull          15
			flag = true;
	//    4    9:iconst_1        
	//    5   10:istore          5
		else
	//*   6   12:goto            18
			flag = false;
	//    7   15:iconst_0        
	//    8   16:istore          5
		Log.d(s1, String.format("Preview.surfaceChanged(holder?:%b, f:%d, w:%d, h:%d )", new Object[] {
			Boolean.valueOf(flag), Integer.valueOf(i1), Integer.valueOf(j1), Integer.valueOf(k1)
		}));
	//    9   18:aload           6
	//   10   20:ldc2            #570 <String "Preview.surfaceChanged(holder?:%b, f:%d, w:%d, h:%d )">
	//   11   23:iconst_4        
	//   12   24:anewarray       Object[]
	//   13   27:dup             
	//   14   28:iconst_0        
	//   15   29:iload           5
	//   16   31:invokestatic    #575 <Method Boolean Boolean.valueOf(boolean)>
	//   17   34:aastore         
	//   18   35:dup             
	//   19   36:iconst_1        
	//   20   37:iload_2         
	//   21   38:invokestatic    #580 <Method Integer Integer.valueOf(int)>
	//   22   41:aastore         
	//   23   42:dup             
	//   24   43:iconst_2        
	//   25   44:iload_3         
	//   26   45:invokestatic    #580 <Method Integer Integer.valueOf(int)>
	//   27   48:aastore         
	//   28   49:dup             
	//   29   50:iconst_3        
	//   30   51:iload           4
	//   31   53:invokestatic    #580 <Method Integer Integer.valueOf(int)>
	//   32   56:aastore         
	//   33   57:invokestatic    #584 <Method String String.format(String, Object[])>
	//   34   60:invokestatic    #78  <Method int Log.d(String, String)>
	//   35   63:pop             
	//   36   64:return          
	}

	public void surfaceCreated(SurfaceHolder surfaceholder)
	{
		if(q == null && d)
	//*   0    0:aload_0         
	//*   1    1:getfield        #318 <Field Camera q>
	//*   2    4:ifnonnull       27
	//*   3    7:aload_0         
	//*   4    8:getfield        #160 <Field boolean d>
	//*   5   11:ifne            17
	//*   6   14:goto            27
		{
			Log.wtf("card.io", "CardScanner.surfaceCreated() - camera is null!");
	//    7   17:ldc1            #62  <String "card.io">
	//    8   19:ldc2            #587 <String "CardScanner.surfaceCreated() - camera is null!">
	//    9   22:invokestatic    #590 <Method int Log.wtf(String, String)>
	//   10   25:pop             
			return;
	//   11   26:return          
		} else
		{
			s = true;
	//   12   27:aload_0         
	//   13   28:iconst_1        
	//   14   29:putfield        #405 <Field boolean s>
			b(surfaceholder);
	//   15   32:aload_0         
	//   16   33:aload_1         
	//   17   34:invokespecial   #407 <Method boolean b(SurfaceHolder)>
	//   18   37:pop             
			return;
	//   19   38:return          
		}
	}

	public void surfaceDestroyed(SurfaceHolder surfaceholder)
	{
		surfaceholder = ((SurfaceHolder) (q));
	//    0    0:aload_0         
	//    1    1:getfield        #318 <Field Camera q>
	//    2    4:astore_1        
		if(surfaceholder != null)
	//*   3    5:aload_1         
	//*   4    6:ifnull          27
			try
			{
				((Camera) (surfaceholder)).stopPreview();
	//    5    9:aload_1         
	//    6   10:invokevirtual   #499 <Method void Camera.stopPreview()>
			}
	//*   7   13:goto            27
			// Misplaced declaration of an exception variable
			catch(SurfaceHolder surfaceholder)
	//*   8   16:astore_1        
			{
				Log.e("card.io", "error stopping camera", ((Throwable) (surfaceholder)));
	//    9   17:ldc1            #62  <String "card.io">
	//   10   19:ldc2            #593 <String "error stopping camera">
	//   11   22:aload_1         
	//   12   23:invokestatic    #292 <Method int Log.e(String, String, Throwable)>
	//   13   26:pop             
			}
		s = false;
	//   14   27:aload_0         
	//   15   28:iconst_0        
	//   16   29:putfield        #405 <Field boolean s>
	//   17   32:return          
	}

	static final boolean e;
	private static final String f;
	private static boolean h;
	private static boolean x;
	protected WeakReference a;
	final int b = 640;
	final int c = 480;
	protected boolean d;
	private Bitmap g;
	private boolean i;
	private boolean j;
	private int k;
	private int l;
	private boolean m;
	private long n;
	private long o;
	private long p;
	private Camera q;
	private byte r[];
	private boolean s;
	private int t;
	private int u;
	private int v;
	private int w;

	static 
	{
		e = ((Class) (io/card/payment/CardScanner)).desiredAssertionStatus() ^ true;
	//    0    0:ldc1            #2   <Class CardScanner>
	//    1    2:invokevirtual   #52  <Method boolean Class.desiredAssertionStatus()>
	//    2    5:iconst_1        
	//    3    6:ixor            
	//    4    7:putstatic       #54  <Field boolean e>
		f = ((Class) (io/card/payment/CardScanner)).getSimpleName();
	//    5   10:ldc1            #2   <Class CardScanner>
	//    6   12:invokevirtual   #58  <Method String Class.getSimpleName()>
	//    7   15:putstatic       #60  <Field String f>
		Log.i("card.io", "card.io 5.5.1 03/17/2017 14:23:12 -0400");
	//    8   18:ldc1            #62  <String "card.io">
	//    9   20:ldc1            #64  <String "card.io 5.5.1 03/17/2017 14:23:12 -0400">
	//   10   22:invokestatic    #69  <Method int Log.i(String, String)>
	//   11   25:pop             
		a("cardioDecider");
	//   12   26:ldc1            #71  <String "cardioDecider">
	//   13   28:invokestatic    #74  <Method void a(String)>
		Log.d("card.io", "Loaded card.io decider library.");
	//   14   31:ldc1            #62  <String "card.io">
	//   15   33:ldc1            #76  <String "Loaded card.io decider library.">
	//   16   35:invokestatic    #78  <Method int Log.d(String, String)>
	//   17   38:pop             
		StringBuilder stringbuilder = new StringBuilder();
	//   18   39:new             #80  <Class StringBuilder>
	//   19   42:dup             
	//   20   43:invokespecial   #83  <Method void StringBuilder()>
	//   21   46:astore_0        
		stringbuilder.append("    nUseNeon(): ");
	//   22   47:aload_0         
	//   23   48:ldc1            #85  <String "    nUseNeon(): ">
	//   24   50:invokevirtual   #89  <Method StringBuilder StringBuilder.append(String)>
	//   25   53:pop             
		stringbuilder.append(nUseNeon());
	//   26   54:aload_0         
	//   27   55:invokestatic    #92  <Method boolean nUseNeon()>
	//   28   58:invokevirtual   #95  <Method StringBuilder StringBuilder.append(boolean)>
	//   29   61:pop             
		Log.d("card.io", stringbuilder.toString());
	//   30   62:ldc1            #62  <String "card.io">
	//   31   64:aload_0         
	//   32   65:invokevirtual   #98  <Method String StringBuilder.toString()>
	//   33   68:invokestatic    #78  <Method int Log.d(String, String)>
	//   34   71:pop             
		stringbuilder = new StringBuilder();
	//   35   72:new             #80  <Class StringBuilder>
	//   36   75:dup             
	//   37   76:invokespecial   #83  <Method void StringBuilder()>
	//   38   79:astore_0        
		stringbuilder.append("    nUseTegra():");
	//   39   80:aload_0         
	//   40   81:ldc1            #100 <String "    nUseTegra():">
	//   41   83:invokevirtual   #89  <Method StringBuilder StringBuilder.append(String)>
	//   42   86:pop             
		stringbuilder.append(nUseTegra());
	//   43   87:aload_0         
	//   44   88:invokestatic    #103 <Method boolean nUseTegra()>
	//   45   91:invokevirtual   #95  <Method StringBuilder StringBuilder.append(boolean)>
	//   46   94:pop             
		Log.d("card.io", stringbuilder.toString());
	//   47   95:ldc1            #62  <String "card.io">
	//   48   97:aload_0         
	//   49   98:invokevirtual   #98  <Method String StringBuilder.toString()>
	//   50  101:invokestatic    #78  <Method int Log.d(String, String)>
	//   51  104:pop             
		stringbuilder = new StringBuilder();
	//   52  105:new             #80  <Class StringBuilder>
	//   53  108:dup             
	//   54  109:invokespecial   #83  <Method void StringBuilder()>
	//   55  112:astore_0        
		stringbuilder.append("    nUseX86():  ");
	//   56  113:aload_0         
	//   57  114:ldc1            #105 <String "    nUseX86():  ">
	//   58  116:invokevirtual   #89  <Method StringBuilder StringBuilder.append(String)>
	//   59  119:pop             
		stringbuilder.append(nUseX86());
	//   60  120:aload_0         
	//   61  121:invokestatic    #108 <Method boolean nUseX86()>
	//   62  124:invokevirtual   #95  <Method StringBuilder StringBuilder.append(boolean)>
	//   63  127:pop             
		Log.d("card.io", stringbuilder.toString());
	//   64  128:ldc1            #62  <String "card.io">
	//   65  130:aload_0         
	//   66  131:invokevirtual   #98  <Method String StringBuilder.toString()>
	//   67  134:invokestatic    #78  <Method int Log.d(String, String)>
	//   68  137:pop             
		if(h())
	//*  69  138:invokestatic    #110 <Method boolean h()>
	//*  70  141:ifeq            170
		{
			a("opencv_core");
	//   71  144:ldc1            #112 <String "opencv_core">
	//   72  146:invokestatic    #74  <Method void a(String)>
			Log.d("card.io", "Loaded opencv core library");
	//   73  149:ldc1            #62  <String "card.io">
	//   74  151:ldc1            #114 <String "Loaded opencv core library">
	//   75  153:invokestatic    #78  <Method int Log.d(String, String)>
	//   76  156:pop             
			a("opencv_imgproc");
	//   77  157:ldc1            #116 <String "opencv_imgproc">
	//   78  159:invokestatic    #74  <Method void a(String)>
			Log.d("card.io", "Loaded opencv imgproc library");
	//   79  162:ldc1            #62  <String "card.io">
	//   80  164:ldc1            #118 <String "Loaded opencv imgproc library">
	//   81  166:invokestatic    #78  <Method int Log.d(String, String)>
	//   82  169:pop             
		}
		if(nUseNeon())
	//*  83  170:invokestatic    #92  <Method boolean nUseNeon()>
	//*  84  173:ifeq            192
		{
			a("cardioRecognizer");
	//   85  176:ldc1            #120 <String "cardioRecognizer">
	//   86  178:invokestatic    #74  <Method void a(String)>
			Log.i("card.io", "Loaded card.io NEON library");
	//   87  181:ldc1            #62  <String "card.io">
	//   88  183:ldc1            #122 <String "Loaded card.io NEON library">
	//   89  185:invokestatic    #69  <Method int Log.i(String, String)>
	//   90  188:pop             
			break MISSING_BLOCK_LABEL_290;
	//   91  189:goto            290
		}
		if(nUseX86())
	//*  92  192:invokestatic    #108 <Method boolean nUseX86()>
	//*  93  195:ifeq            214
		{
			a("cardioRecognizer");
	//   94  198:ldc1            #120 <String "cardioRecognizer">
	//   95  200:invokestatic    #74  <Method void a(String)>
			Log.i("card.io", "Loaded card.io x86 library");
	//   96  203:ldc1            #62  <String "card.io">
	//   97  205:ldc1            #124 <String "Loaded card.io x86 library">
	//   98  207:invokestatic    #69  <Method int Log.i(String, String)>
	//   99  210:pop             
			break MISSING_BLOCK_LABEL_290;
	//  100  211:goto            290
		}
		if(nUseTegra())
	//* 101  214:invokestatic    #103 <Method boolean nUseTegra()>
	//* 102  217:ifeq            236
		{
			a("cardioRecognizer_tegra2");
	//  103  220:ldc1            #126 <String "cardioRecognizer_tegra2">
	//  104  222:invokestatic    #74  <Method void a(String)>
			Log.i("card.io", "Loaded card.io Tegra2 library");
	//  105  225:ldc1            #62  <String "card.io">
	//  106  227:ldc1            #128 <String "Loaded card.io Tegra2 library">
	//  107  229:invokestatic    #69  <Method int Log.i(String, String)>
	//  108  232:pop             
			break MISSING_BLOCK_LABEL_290;
	//  109  233:goto            290
		}
		try
		{
			Log.w("card.io", "unsupported processor - card.io scanning requires ARMv7 or x86 architecture");
	//  110  236:ldc1            #62  <String "card.io">
	//  111  238:ldc1            #130 <String "unsupported processor - card.io scanning requires ARMv7 or x86 architecture">
	//  112  240:invokestatic    #132 <Method int Log.w(String, String)>
	//  113  243:pop             
			h = true;
	//  114  244:iconst_1        
	//  115  245:putstatic       #134 <Field boolean h>
		}
	//* 116  248:goto            290
		catch(UnsatisfiedLinkError unsatisfiedlinkerror)
	//* 117  251:astore_0        
		{
			StringBuilder stringbuilder1 = new StringBuilder();
	//  118  252:new             #80  <Class StringBuilder>
	//  119  255:dup             
	//  120  256:invokespecial   #83  <Method void StringBuilder()>
	//  121  259:astore_1        
			stringbuilder1.append("Failed to load native library: ");
	//  122  260:aload_1         
	//  123  261:ldc1            #136 <String "Failed to load native library: ">
	//  124  263:invokevirtual   #89  <Method StringBuilder StringBuilder.append(String)>
	//  125  266:pop             
			stringbuilder1.append(unsatisfiedlinkerror.getMessage());
	//  126  267:aload_1         
	//  127  268:aload_0         
	//  128  269:invokevirtual   #139 <Method String UnsatisfiedLinkError.getMessage()>
	//  129  272:invokevirtual   #89  <Method StringBuilder StringBuilder.append(String)>
	//  130  275:pop             
			Log.e("card.io", stringbuilder1.toString());
	//  131  276:ldc1            #62  <String "card.io">
	//  132  278:aload_1         
	//  133  279:invokevirtual   #98  <Method String StringBuilder.toString()>
	//  134  282:invokestatic    #141 <Method int Log.e(String, String)>
	//  135  285:pop             
			h = true;
	//  136  286:iconst_1        
	//  137  287:putstatic       #134 <Field boolean h>
		}
		x = false;
	//  138  290:iconst_0        
	//  139  291:putstatic       #143 <Field boolean x>
	//  140  294:return          
	}
}
