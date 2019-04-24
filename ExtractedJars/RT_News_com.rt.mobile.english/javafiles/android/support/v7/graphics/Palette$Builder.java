// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v7.graphics;

import android.graphics.Bitmap;
import android.graphics.Rect;
import android.os.AsyncTask;
import android.util.Log;
import java.util.ArrayList;
import java.util.List;

// Referenced classes of package android.support.v7.graphics:
//			Palette, Target, ColorCutQuantizer

public static final class Palette$Builder
{

	private int[] getPixelsFromBitmap(Bitmap bitmap)
	{
		int k = bitmap.getWidth();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #107 <Method int Bitmap.getWidth()>
	//    2    4:istore_3        
		int i = bitmap.getHeight();
	//    3    5:aload_1         
	//    4    6:invokevirtual   #110 <Method int Bitmap.getHeight()>
	//    5    9:istore_2        
		int ai[] = new int[k * i];
	//    6   10:iload_3         
	//    7   11:iload_2         
	//    8   12:imul            
	//    9   13:newarray        int[]
	//   10   15:astore          6
		bitmap.getPixels(ai, 0, k, 0, 0, k, i);
	//   11   17:aload_1         
	//   12   18:aload           6
	//   13   20:iconst_0        
	//   14   21:iload_3         
	//   15   22:iconst_0        
	//   16   23:iconst_0        
	//   17   24:iload_3         
	//   18   25:iload_2         
	//   19   26:invokevirtual   #114 <Method void Bitmap.getPixels(int[], int, int, int, int, int, int)>
		if(mRegion == null)
	//*  20   29:aload_0         
	//*  21   30:getfield        #116 <Field Rect mRegion>
	//*  22   33:ifnonnull       39
			return ai;
	//   23   36:aload           6
	//   24   38:areturn         
		int l = mRegion.width();
	//   25   39:aload_0         
	//   26   40:getfield        #116 <Field Rect mRegion>
	//   27   43:invokevirtual   #121 <Method int Rect.width()>
	//   28   46:istore          4
		int i1 = mRegion.height();
	//   29   48:aload_0         
	//   30   49:getfield        #116 <Field Rect mRegion>
	//   31   52:invokevirtual   #124 <Method int Rect.height()>
	//   32   55:istore          5
		bitmap = ((Bitmap) (new int[l * i1]));
	//   33   57:iload           4
	//   34   59:iload           5
	//   35   61:imul            
	//   36   62:newarray        int[]
	//   37   64:astore_1        
		for(int j = 0; j < i1; j++)
	//*  38   65:iconst_0        
	//*  39   66:istore_2        
	//*  40   67:iload_2         
	//*  41   68:iload           5
	//*  42   70:icmpge          111
			System.arraycopy(((Object) (ai)), (mRegion.top + j) * k + mRegion.left, ((Object) (bitmap)), j * l, l);
	//   43   73:aload           6
	//   44   75:aload_0         
	//   45   76:getfield        #116 <Field Rect mRegion>
	//   46   79:getfield        #127 <Field int Rect.top>
	//   47   82:iload_2         
	//   48   83:iadd            
	//   49   84:iload_3         
	//   50   85:imul            
	//   51   86:aload_0         
	//   52   87:getfield        #116 <Field Rect mRegion>
	//   53   90:getfield        #130 <Field int Rect.left>
	//   54   93:iadd            
	//   55   94:aload_1         
	//   56   95:iload_2         
	//   57   96:iload           4
	//   58   98:imul            
	//   59   99:iload           4
	//   60  101:invokestatic    #136 <Method void System.arraycopy(Object, int, Object, int, int)>

	//   61  104:iload_2         
	//   62  105:iconst_1        
	//   63  106:iadd            
	//   64  107:istore_2        
	//*  65  108:goto            67
		return ((int []) (bitmap));
	//   66  111:aload_1         
	//   67  112:areturn         
	}

	private Bitmap scaleBitmapDown(Bitmap bitmap)
	{
		int i = mResizeArea;
	//    0    0:aload_0         
	//    1    1:getfield        #39  <Field int mResizeArea>
	//    2    4:istore          6
		double d1 = -1D;
	//    3    6:ldc2w           #139 <Double -1D>
	//    4    9:dstore          4
		double d;
		if(i > 0)
	//*   5   11:iload           6
	//*   6   13:ifle            55
		{
			int j = bitmap.getWidth() * bitmap.getHeight();
	//    7   16:aload_1         
	//    8   17:invokevirtual   #107 <Method int Bitmap.getWidth()>
	//    9   20:aload_1         
	//   10   21:invokevirtual   #110 <Method int Bitmap.getHeight()>
	//   11   24:imul            
	//   12   25:istore          6
			d = d1;
	//   13   27:dload           4
	//   14   29:dstore_2        
			if(j > mResizeArea)
	//*  15   30:iload           6
	//*  16   32:aload_0         
	//*  17   33:getfield        #39  <Field int mResizeArea>
	//*  18   36:icmple          100
				d = Math.sqrt((double)mResizeArea / (double)j);
	//   19   39:aload_0         
	//   20   40:getfield        #39  <Field int mResizeArea>
	//   21   43:i2d             
	//   22   44:iload           6
	//   23   46:i2d             
	//   24   47:ddiv            
	//   25   48:invokestatic    #146 <Method double Math.sqrt(double)>
	//   26   51:dstore_2        
		} else
	//*  27   52:goto            100
		{
			d = d1;
	//   28   55:dload           4
	//   29   57:dstore_2        
			if(mResizeMaxDimension > 0)
	//*  30   58:aload_0         
	//*  31   59:getfield        #41  <Field int mResizeMaxDimension>
	//*  32   62:ifle            100
			{
				int k = Math.max(bitmap.getWidth(), bitmap.getHeight());
	//   33   65:aload_1         
	//   34   66:invokevirtual   #107 <Method int Bitmap.getWidth()>
	//   35   69:aload_1         
	//   36   70:invokevirtual   #110 <Method int Bitmap.getHeight()>
	//   37   73:invokestatic    #150 <Method int Math.max(int, int)>
	//   38   76:istore          6
				d = d1;
	//   39   78:dload           4
	//   40   80:dstore_2        
				if(k > mResizeMaxDimension)
	//*  41   81:iload           6
	//*  42   83:aload_0         
	//*  43   84:getfield        #41  <Field int mResizeMaxDimension>
	//*  44   87:icmple          100
					d = (double)mResizeMaxDimension / (double)k;
	//   45   90:aload_0         
	//   46   91:getfield        #41  <Field int mResizeMaxDimension>
	//   47   94:i2d             
	//   48   95:iload           6
	//   49   97:i2d             
	//   50   98:ddiv            
	//   51   99:dstore_2        
			}
		}
		if(d <= 0.0D)
	//*  52  100:dload_2         
	//*  53  101:dconst_0        
	//*  54  102:dcmpg           
	//*  55  103:ifgt            108
			return bitmap;
	//   56  106:aload_1         
	//   57  107:areturn         
		else
			return Bitmap.createScaledBitmap(bitmap, (int)Math.ceil((double)bitmap.getWidth() * d), (int)Math.ceil((double)bitmap.getHeight() * d), false);
	//   58  108:aload_1         
	//   59  109:aload_1         
	//   60  110:invokevirtual   #107 <Method int Bitmap.getWidth()>
	//   61  113:i2d             
	//   62  114:dload_2         
	//   63  115:dmul            
	//   64  116:invokestatic    #153 <Method double Math.ceil(double)>
	//   65  119:d2i             
	//   66  120:aload_1         
	//   67  121:invokevirtual   #110 <Method int Bitmap.getHeight()>
	//   68  124:i2d             
	//   69  125:dload_2         
	//   70  126:dmul            
	//   71  127:invokestatic    #153 <Method double Math.ceil(double)>
	//   72  130:d2i             
	//   73  131:iconst_0        
	//   74  132:invokestatic    #157 <Method Bitmap Bitmap.createScaledBitmap(Bitmap, int, int, boolean)>
	//   75  135:areturn         
	}

	public Palette$Builder addFilter(Palette.Filter filter)
	{
		if(filter != null)
	//*   0    0:aload_1         
	//*   1    1:ifnull          15
			mFilters.add(((Object) (filter)));
	//    2    4:aload_0         
	//    3    5:getfield        #43  <Field List mFilters>
	//    4    8:aload_1         
	//    5    9:invokeinterface #59  <Method boolean List.add(Object)>
	//    6   14:pop             
		return this;
	//    7   15:aload_0         
	//    8   16:areturn         
	}

	public Palette$Builder addTarget(Target target)
	{
		if(!mTargets.contains(((Object) (target))))
	//*   0    0:aload_0         
	//*   1    1:getfield        #35  <Field List mTargets>
	//*   2    4:aload_1         
	//*   3    5:invokeinterface #165 <Method boolean List.contains(Object)>
	//*   4   10:ifne            24
			mTargets.add(((Object) (target)));
	//    5   13:aload_0         
	//    6   14:getfield        #35  <Field List mTargets>
	//    7   17:aload_1         
	//    8   18:invokeinterface #59  <Method boolean List.add(Object)>
	//    9   23:pop             
		return this;
	//   10   24:aload_0         
	//   11   25:areturn         
	}

	public Palette$Builder clearFilters()
	{
		mFilters.clear();
	//    0    0:aload_0         
	//    1    1:getfield        #43  <Field List mFilters>
	//    2    4:invokeinterface #170 <Method void List.clear()>
		return this;
	//    3    9:aload_0         
	//    4   10:areturn         
	}

	public Palette$Builder clearRegion()
	{
		mRegion = null;
	//    0    0:aload_0         
	//    1    1:aconst_null     
	//    2    2:putfield        #116 <Field Rect mRegion>
		return this;
	//    3    5:aload_0         
	//    4    6:areturn         
	}

	public Palette$Builder clearTargets()
	{
		if(mTargets != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #35  <Field List mTargets>
	//*   2    4:ifnull          16
			mTargets.clear();
	//    3    7:aload_0         
	//    4    8:getfield        #35  <Field List mTargets>
	//    5   11:invokeinterface #170 <Method void List.clear()>
		return this;
	//    6   16:aload_0         
	//    7   17:areturn         
	}

	public AsyncTask generate(final syncListener listener)
	{
		if(listener == null)
	//*   0    0:aload_1         
	//*   1    1:ifnonnull       14
			throw new IllegalArgumentException("listener can not be null");
	//    2    4:new             #86  <Class IllegalArgumentException>
	//    3    7:dup             
	//    4    8:ldc1            #176 <String "listener can not be null">
	//    5   10:invokespecial   #91  <Method void IllegalArgumentException(String)>
	//    6   13:athrow          
		else
			return ((_cls1) (new AsyncTask() {

				protected transient Palette doInBackground(Bitmap abitmap[])
				{
					try
					{
						abitmap = ((Bitmap []) (generate()));
				//    0    0:aload_0         
				//    1    1:getfield        #21  <Field Palette$Builder this$0>
				//    2    4:invokevirtual   #34  <Method Palette Palette$Builder.generate()>
				//    3    7:astore_1        
					}
				//*   4    8:aload_1         
				//*   5    9:areturn         
					// Misplaced declaration of an exception variable
					catch(Bitmap abitmap[])
				//*   6   10:astore_1        
					{
						Log.e("Palette", "Exception thrown during async generate", ((Throwable) (abitmap)));
				//    7   11:ldc1            #36  <String "Palette">
				//    8   13:ldc1            #38  <String "Exception thrown during async generate">
				//    9   15:aload_1         
				//   10   16:invokestatic    #44  <Method int Log.e(String, String, Throwable)>
				//   11   19:pop             
						return null;
				//   12   20:aconst_null     
				//   13   21:areturn         
					}
					return ((Palette) (abitmap));
				}

				protected volatile Object doInBackground(Object aobj[])
				{
					return ((Object) (doInBackground((Bitmap[])aobj)));
				//    0    0:aload_0         
				//    1    1:aload_1         
				//    2    2:checkcast       #47  <Class Bitmap[]>
				//    3    5:invokevirtual   #49  <Method Palette doInBackground(Bitmap[])>
				//    4    8:areturn         
				}

				protected void onPostExecute(Palette palette)
				{
					listener.onGenerated(palette);
				//    0    0:aload_0         
				//    1    1:getfield        #23  <Field Palette$PaletteAsyncListener val$listener>
				//    2    4:aload_1         
				//    3    5:invokeinterface #56  <Method void Palette$PaletteAsyncListener.onGenerated(Palette)>
				//    4   10:return          
				}

				protected volatile void onPostExecute(Object obj)
				{
					onPostExecute((Palette)obj);
				//    0    0:aload_0         
				//    1    1:aload_1         
				//    2    2:checkcast       #12  <Class Palette>
				//    3    5:invokevirtual   #59  <Method void onPostExecute(Palette)>
				//    4    8:return          
				}

				final Palette.Builder this$0;
				final Palette.PaletteAsyncListener val$listener;

			
			{
				this$0 = Palette.Builder.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #21  <Field Palette$Builder this$0>
				listener = paletteasynclistener;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #23  <Field Palette$PaletteAsyncListener val$listener>
				super();
			//    6   10:aload_0         
			//    7   11:invokespecial   #26  <Method void AsyncTask()>
			//    8   14:return          
			}
			}
)).executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, ((Object []) (new Bitmap[] {
				mBitmap
			})));
	//    7   14:new             #9   <Class Palette$Builder$1>
	//    8   17:dup             
	//    9   18:aload_0         
	//   10   19:aload_1         
	//   11   20:invokespecial   #179 <Method void Palette$Builder$1(Palette$Builder, Palette$PaletteAsyncListener)>
	//   12   23:getstatic       #185 <Field java.util.concurrent.Executor AsyncTask.THREAD_POOL_EXECUTOR>
	//   13   26:iconst_1        
	//   14   27:anewarray       Bitmap[]
	//   15   30:dup             
	//   16   31:iconst_0        
	//   17   32:aload_0         
	//   18   33:getfield        #61  <Field Bitmap mBitmap>
	//   19   36:aastore         
	//   20   37:invokevirtual   #189 <Method AsyncTask Palette$Builder$1.executeOnExecutor(java.util.concurrent.Executor, Object[])>
	//   21   40:areturn         
	}

	public Palette generate()
	{
		Object obj;
		if(mBitmap != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #61  <Field Bitmap mBitmap>
	//*   2    4:ifnull          232
		{
			Bitmap bitmap = scaleBitmapDown(mBitmap);
	//    3    7:aload_0         
	//    4    8:aload_0         
	//    5    9:getfield        #61  <Field Bitmap mBitmap>
	//    6   12:invokespecial   #193 <Method Bitmap scaleBitmapDown(Bitmap)>
	//    7   15:astore          5
			obj = ((Object) (mRegion));
	//    8   17:aload_0         
	//    9   18:getfield        #116 <Field Rect mRegion>
	//   10   21:astore          4
			if(bitmap != mBitmap && obj != null)
	//*  11   23:aload           5
	//*  12   25:aload_0         
	//*  13   26:getfield        #61  <Field Bitmap mBitmap>
	//*  14   29:if_acmpeq       137
	//*  15   32:aload           4
	//*  16   34:ifnull          137
			{
				double d = (double)bitmap.getWidth() / (double)mBitmap.getWidth();
	//   17   37:aload           5
	//   18   39:invokevirtual   #107 <Method int Bitmap.getWidth()>
	//   19   42:i2d             
	//   20   43:aload_0         
	//   21   44:getfield        #61  <Field Bitmap mBitmap>
	//   22   47:invokevirtual   #107 <Method int Bitmap.getWidth()>
	//   23   50:i2d             
	//   24   51:ddiv            
	//   25   52:dstore_1        
				obj.left = (int)Math.floor((double)((Rect) (obj)).left * d);
	//   26   53:aload           4
	//   27   55:aload           4
	//   28   57:getfield        #130 <Field int Rect.left>
	//   29   60:i2d             
	//   30   61:dload_1         
	//   31   62:dmul            
	//   32   63:invokestatic    #196 <Method double Math.floor(double)>
	//   33   66:d2i             
	//   34   67:putfield        #130 <Field int Rect.left>
				obj.top = (int)Math.floor((double)((Rect) (obj)).top * d);
	//   35   70:aload           4
	//   36   72:aload           4
	//   37   74:getfield        #127 <Field int Rect.top>
	//   38   77:i2d             
	//   39   78:dload_1         
	//   40   79:dmul            
	//   41   80:invokestatic    #196 <Method double Math.floor(double)>
	//   42   83:d2i             
	//   43   84:putfield        #127 <Field int Rect.top>
				obj.right = Math.min((int)Math.ceil((double)((Rect) (obj)).right * d), bitmap.getWidth());
	//   44   87:aload           4
	//   45   89:aload           4
	//   46   91:getfield        #199 <Field int Rect.right>
	//   47   94:i2d             
	//   48   95:dload_1         
	//   49   96:dmul            
	//   50   97:invokestatic    #153 <Method double Math.ceil(double)>
	//   51  100:d2i             
	//   52  101:aload           5
	//   53  103:invokevirtual   #107 <Method int Bitmap.getWidth()>
	//   54  106:invokestatic    #202 <Method int Math.min(int, int)>
	//   55  109:putfield        #199 <Field int Rect.right>
				obj.bottom = Math.min((int)Math.ceil((double)((Rect) (obj)).bottom * d), bitmap.getHeight());
	//   56  112:aload           4
	//   57  114:aload           4
	//   58  116:getfield        #205 <Field int Rect.bottom>
	//   59  119:i2d             
	//   60  120:dload_1         
	//   61  121:dmul            
	//   62  122:invokestatic    #153 <Method double Math.ceil(double)>
	//   63  125:d2i             
	//   64  126:aload           5
	//   65  128:invokevirtual   #110 <Method int Bitmap.getHeight()>
	//   66  131:invokestatic    #202 <Method int Math.min(int, int)>
	//   67  134:putfield        #205 <Field int Rect.bottom>
			}
			int ai[] = getPixelsFromBitmap(bitmap);
	//   68  137:aload_0         
	//   69  138:aload           5
	//   70  140:invokespecial   #207 <Method int[] getPixelsFromBitmap(Bitmap)>
	//   71  143:astore          6
			int i = mMaxColors;
	//   72  145:aload_0         
	//   73  146:getfield        #37  <Field int mMaxColors>
	//   74  149:istore_3        
			Palette.Filter afilter[];
			if(mFilters.isEmpty())
	//*  75  150:aload_0         
	//*  76  151:getfield        #43  <Field List mFilters>
	//*  77  154:invokeinterface #97  <Method boolean List.isEmpty()>
	//*  78  159:ifeq            168
				afilter = null;
	//   79  162:aconst_null     
	//   80  163:astore          4
			else
	//*  81  165:goto            194
				afilter = (Palette.Filter[])mFilters.toArray(((Object []) (new Palette.Filter[mFilters.size()])));
	//   82  168:aload_0         
	//   83  169:getfield        #43  <Field List mFilters>
	//   84  172:aload_0         
	//   85  173:getfield        #43  <Field List mFilters>
	//   86  176:invokeinterface #210 <Method int List.size()>
	//   87  181:anewarray       Palette.Filter[]
	//   88  184:invokeinterface #216 <Method Object[] List.toArray(Object[])>
	//   89  189:checkcast       #218 <Class Palette$Filter[]>
	//   90  192:astore          4
			afilter = ((Palette.Filter []) (new ColorCutQuantizer(ai, i, afilter)));
	//   91  194:new             #220 <Class ColorCutQuantizer>
	//   92  197:dup             
	//   93  198:aload           6
	//   94  200:iload_3         
	//   95  201:aload           4
	//   96  203:invokespecial   #223 <Method void ColorCutQuantizer(int[], int, Palette$Filter[])>
	//   97  206:astore          4
			if(bitmap != mBitmap)
	//*  98  208:aload           5
	//*  99  210:aload_0         
	//* 100  211:getfield        #61  <Field Bitmap mBitmap>
	//* 101  214:if_acmpeq       222
				bitmap.recycle();
	//  102  217:aload           5
	//  103  219:invokevirtual   #226 <Method void Bitmap.recycle()>
			afilter = ((Palette.Filter []) (((ColorCutQuantizer) (afilter)).getQuantizedColors()));
	//  104  222:aload           4
	//  105  224:invokevirtual   #230 <Method List ColorCutQuantizer.getQuantizedColors()>
	//  106  227:astore          4
		} else
	//* 107  229:goto            238
		{
			afilter = ((Palette.Filter []) (mSwatches));
	//  108  232:aload_0         
	//  109  233:getfield        #63  <Field List mSwatches>
	//  110  236:astore          4
		}
		afilter = ((Palette.Filter []) (new Palette(((List) (afilter)), mTargets)));
	//  111  238:new             #6   <Class Palette>
	//  112  241:dup             
	//  113  242:aload           4
	//  114  244:aload_0         
	//  115  245:getfield        #35  <Field List mTargets>
	//  116  248:invokespecial   #233 <Method void Palette(List, List)>
	//  117  251:astore          4
		((Palette) (afilter)).generate();
	//  118  253:aload           4
	//  119  255:invokevirtual   #235 <Method void Palette.generate()>
		return ((Palette) (afilter));
	//  120  258:aload           4
	//  121  260:areturn         
	}

	public Palette$Builder maximumColorCount(int i)
	{
		mMaxColors = i;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #37  <Field int mMaxColors>
		return this;
	//    3    5:aload_0         
	//    4    6:areturn         
	}

	public Palette$Builder resizeBitmapArea(int i)
	{
		mResizeArea = i;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #39  <Field int mResizeArea>
		mResizeMaxDimension = -1;
	//    3    5:aload_0         
	//    4    6:iconst_m1       
	//    5    7:putfield        #41  <Field int mResizeMaxDimension>
		return this;
	//    6   10:aload_0         
	//    7   11:areturn         
	}

	public Palette$Builder resizeBitmapSize(int i)
	{
		mResizeMaxDimension = i;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #41  <Field int mResizeMaxDimension>
		mResizeArea = -1;
	//    3    5:aload_0         
	//    4    6:iconst_m1       
	//    5    7:putfield        #39  <Field int mResizeArea>
		return this;
	//    6   10:aload_0         
	//    7   11:areturn         
	}

	public Palette$Builder setRegion(int i, int j, int k, int l)
	{
		if(mBitmap != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #61  <Field Bitmap mBitmap>
	//*   2    4:ifnull          73
		{
			if(mRegion == null)
	//*   3    7:aload_0         
	//*   4    8:getfield        #116 <Field Rect mRegion>
	//*   5   11:ifnonnull       25
				mRegion = new Rect();
	//    6   14:aload_0         
	//    7   15:new             #118 <Class Rect>
	//    8   18:dup             
	//    9   19:invokespecial   #244 <Method void Rect()>
	//   10   22:putfield        #116 <Field Rect mRegion>
			mRegion.set(0, 0, mBitmap.getWidth(), mBitmap.getHeight());
	//   11   25:aload_0         
	//   12   26:getfield        #116 <Field Rect mRegion>
	//   13   29:iconst_0        
	//   14   30:iconst_0        
	//   15   31:aload_0         
	//   16   32:getfield        #61  <Field Bitmap mBitmap>
	//   17   35:invokevirtual   #107 <Method int Bitmap.getWidth()>
	//   18   38:aload_0         
	//   19   39:getfield        #61  <Field Bitmap mBitmap>
	//   20   42:invokevirtual   #110 <Method int Bitmap.getHeight()>
	//   21   45:invokevirtual   #248 <Method void Rect.set(int, int, int, int)>
			if(!mRegion.intersect(i, j, k, l))
	//*  22   48:aload_0         
	//*  23   49:getfield        #116 <Field Rect mRegion>
	//*  24   52:iload_1         
	//*  25   53:iload_2         
	//*  26   54:iload_3         
	//*  27   55:iload           4
	//*  28   57:invokevirtual   #252 <Method boolean Rect.intersect(int, int, int, int)>
	//*  29   60:ifne            73
				throw new IllegalArgumentException("The given region must intersect with the Bitmap's dimensions.");
	//   30   63:new             #86  <Class IllegalArgumentException>
	//   31   66:dup             
	//   32   67:ldc1            #254 <String "The given region must intersect with the Bitmap's dimensions.">
	//   33   69:invokespecial   #91  <Method void IllegalArgumentException(String)>
	//   34   72:athrow          
		}
		return this;
	//   35   73:aload_0         
	//   36   74:areturn         
	}

	private final Bitmap mBitmap;
	private final List mFilters;
	private int mMaxColors;
	private Rect mRegion;
	private int mResizeArea;
	private int mResizeMaxDimension;
	private final List mSwatches;
	private final List mTargets;

	public Palette$Builder(Bitmap bitmap)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #30  <Method void Object()>
		mTargets = ((List) (new ArrayList()));
	//    2    4:aload_0         
	//    3    5:new             #32  <Class ArrayList>
	//    4    8:dup             
	//    5    9:invokespecial   #33  <Method void ArrayList()>
	//    6   12:putfield        #35  <Field List mTargets>
		mMaxColors = 16;
	//    7   15:aload_0         
	//    8   16:bipush          16
	//    9   18:putfield        #37  <Field int mMaxColors>
		mResizeArea = 12544;
	//   10   21:aload_0         
	//   11   22:sipush          12544
	//   12   25:putfield        #39  <Field int mResizeArea>
		mResizeMaxDimension = -1;
	//   13   28:aload_0         
	//   14   29:iconst_m1       
	//   15   30:putfield        #41  <Field int mResizeMaxDimension>
		mFilters = ((List) (new ArrayList()));
	//   16   33:aload_0         
	//   17   34:new             #32  <Class ArrayList>
	//   18   37:dup             
	//   19   38:invokespecial   #33  <Method void ArrayList()>
	//   20   41:putfield        #43  <Field List mFilters>
		if(bitmap != null && !bitmap.isRecycled())
	//*  21   44:aload_1         
	//*  22   45:ifnull          160
	//*  23   48:aload_1         
	//*  24   49:invokevirtual   #49  <Method boolean Bitmap.isRecycled()>
	//*  25   52:ifeq            58
	//*  26   55:goto            160
		{
			mFilters.add(((Object) (Palette.DEFAULT_FILTER)));
	//   27   58:aload_0         
	//   28   59:getfield        #43  <Field List mFilters>
	//   29   62:getstatic       #53  <Field Palette$Filter Palette.DEFAULT_FILTER>
	//   30   65:invokeinterface #59  <Method boolean List.add(Object)>
	//   31   70:pop             
			mBitmap = bitmap;
	//   32   71:aload_0         
	//   33   72:aload_1         
	//   34   73:putfield        #61  <Field Bitmap mBitmap>
			mSwatches = null;
	//   35   76:aload_0         
	//   36   77:aconst_null     
	//   37   78:putfield        #63  <Field List mSwatches>
			mTargets.add(((Object) (Target.LIGHT_VIBRANT)));
	//   38   81:aload_0         
	//   39   82:getfield        #35  <Field List mTargets>
	//   40   85:getstatic       #69  <Field Target Target.LIGHT_VIBRANT>
	//   41   88:invokeinterface #59  <Method boolean List.add(Object)>
	//   42   93:pop             
			mTargets.add(((Object) (Target.VIBRANT)));
	//   43   94:aload_0         
	//   44   95:getfield        #35  <Field List mTargets>
	//   45   98:getstatic       #72  <Field Target Target.VIBRANT>
	//   46  101:invokeinterface #59  <Method boolean List.add(Object)>
	//   47  106:pop             
			mTargets.add(((Object) (Target.DARK_VIBRANT)));
	//   48  107:aload_0         
	//   49  108:getfield        #35  <Field List mTargets>
	//   50  111:getstatic       #75  <Field Target Target.DARK_VIBRANT>
	//   51  114:invokeinterface #59  <Method boolean List.add(Object)>
	//   52  119:pop             
			mTargets.add(((Object) (Target.LIGHT_MUTED)));
	//   53  120:aload_0         
	//   54  121:getfield        #35  <Field List mTargets>
	//   55  124:getstatic       #78  <Field Target Target.LIGHT_MUTED>
	//   56  127:invokeinterface #59  <Method boolean List.add(Object)>
	//   57  132:pop             
			mTargets.add(((Object) (Target.MUTED)));
	//   58  133:aload_0         
	//   59  134:getfield        #35  <Field List mTargets>
	//   60  137:getstatic       #81  <Field Target Target.MUTED>
	//   61  140:invokeinterface #59  <Method boolean List.add(Object)>
	//   62  145:pop             
			mTargets.add(((Object) (Target.DARK_MUTED)));
	//   63  146:aload_0         
	//   64  147:getfield        #35  <Field List mTargets>
	//   65  150:getstatic       #84  <Field Target Target.DARK_MUTED>
	//   66  153:invokeinterface #59  <Method boolean List.add(Object)>
	//   67  158:pop             
			return;
	//   68  159:return          
		} else
		{
			throw new IllegalArgumentException("Bitmap is not valid");
	//   69  160:new             #86  <Class IllegalArgumentException>
	//   70  163:dup             
	//   71  164:ldc1            #88  <String "Bitmap is not valid">
	//   72  166:invokespecial   #91  <Method void IllegalArgumentException(String)>
	//   73  169:athrow          
		}
	}

	public Palette$Builder(List list)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #30  <Method void Object()>
		mTargets = ((List) (new ArrayList()));
	//    2    4:aload_0         
	//    3    5:new             #32  <Class ArrayList>
	//    4    8:dup             
	//    5    9:invokespecial   #33  <Method void ArrayList()>
	//    6   12:putfield        #35  <Field List mTargets>
		mMaxColors = 16;
	//    7   15:aload_0         
	//    8   16:bipush          16
	//    9   18:putfield        #37  <Field int mMaxColors>
		mResizeArea = 12544;
	//   10   21:aload_0         
	//   11   22:sipush          12544
	//   12   25:putfield        #39  <Field int mResizeArea>
		mResizeMaxDimension = -1;
	//   13   28:aload_0         
	//   14   29:iconst_m1       
	//   15   30:putfield        #41  <Field int mResizeMaxDimension>
		mFilters = ((List) (new ArrayList()));
	//   16   33:aload_0         
	//   17   34:new             #32  <Class ArrayList>
	//   18   37:dup             
	//   19   38:invokespecial   #33  <Method void ArrayList()>
	//   20   41:putfield        #43  <Field List mFilters>
		if(list != null && !list.isEmpty())
	//*  21   44:aload_1         
	//*  22   45:ifnull          84
	//*  23   48:aload_1         
	//*  24   49:invokeinterface #97  <Method boolean List.isEmpty()>
	//*  25   54:ifeq            60
	//*  26   57:goto            84
		{
			mFilters.add(((Object) (Palette.DEFAULT_FILTER)));
	//   27   60:aload_0         
	//   28   61:getfield        #43  <Field List mFilters>
	//   29   64:getstatic       #53  <Field Palette$Filter Palette.DEFAULT_FILTER>
	//   30   67:invokeinterface #59  <Method boolean List.add(Object)>
	//   31   72:pop             
			mSwatches = list;
	//   32   73:aload_0         
	//   33   74:aload_1         
	//   34   75:putfield        #63  <Field List mSwatches>
			mBitmap = null;
	//   35   78:aload_0         
	//   36   79:aconst_null     
	//   37   80:putfield        #61  <Field Bitmap mBitmap>
			return;
	//   38   83:return          
		} else
		{
			throw new IllegalArgumentException("List of Swatches is not valid");
	//   39   84:new             #86  <Class IllegalArgumentException>
	//   40   87:dup             
	//   41   88:ldc1            #99  <String "List of Swatches is not valid">
	//   42   90:invokespecial   #91  <Method void IllegalArgumentException(String)>
	//   43   93:athrow          
		}
	}
}
