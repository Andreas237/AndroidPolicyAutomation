// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v7.graphics;

import android.graphics.*;
import android.os.AsyncTask;
import android.support.v4.graphics.ColorUtils;
import android.support.v4.util.ArrayMap;
import android.util.Log;
import android.util.SparseBooleanArray;
import java.util.*;

// Referenced classes of package android.support.v7.graphics:
//			Target, ColorCutQuantizer

public final class Palette
{
	public static final class Builder
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

		public Builder addFilter(Filter filter)
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

		public Builder addTarget(Target target)
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

		public Builder clearFilters()
		{
			mFilters.clear();
		//    0    0:aload_0         
		//    1    1:getfield        #43  <Field List mFilters>
		//    2    4:invokeinterface #170 <Method void List.clear()>
			return this;
		//    3    9:aload_0         
		//    4   10:areturn         
		}

		public Builder clearRegion()
		{
			mRegion = null;
		//    0    0:aload_0         
		//    1    1:aconst_null     
		//    2    2:putfield        #116 <Field Rect mRegion>
			return this;
		//    3    5:aload_0         
		//    4    6:areturn         
		}

		public Builder clearTargets()
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

		public AsyncTask generate(PaletteAsyncListener paletteasynclistener)
		{
			if(paletteasynclistener == null)
		//*   0    0:aload_1         
		//*   1    1:ifnonnull       14
				throw new IllegalArgumentException("listener can not be null");
		//    2    4:new             #86  <Class IllegalArgumentException>
		//    3    7:dup             
		//    4    8:ldc1            #176 <String "listener can not be null">
		//    5   10:invokespecial   #91  <Method void IllegalArgumentException(String)>
		//    6   13:athrow          
			else
				return ((_cls1) (((_cls1) (paletteasynclistener)). new AsyncTask() {

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

					final Builder this$0;
					final PaletteAsyncListener val$listener;

			
			{
				this$0 = final_builder;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #21  <Field Palette$Builder this$0>
				listener = PaletteAsyncListener.this;
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
				Filter afilter[];
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
					afilter = (Filter[])mFilters.toArray(((Object []) (new Filter[mFilters.size()])));
		//   82  168:aload_0         
		//   83  169:getfield        #43  <Field List mFilters>
		//   84  172:aload_0         
		//   85  173:getfield        #43  <Field List mFilters>
		//   86  176:invokeinterface #210 <Method int List.size()>
		//   87  181:anewarray       Filter[]
		//   88  184:invokeinterface #216 <Method Object[] List.toArray(Object[])>
		//   89  189:checkcast       #218 <Class Palette$Filter[]>
		//   90  192:astore          4
				afilter = ((Filter []) (new ColorCutQuantizer(ai, i, afilter)));
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
				afilter = ((Filter []) (((ColorCutQuantizer) (afilter)).getQuantizedColors()));
		//  104  222:aload           4
		//  105  224:invokevirtual   #230 <Method List ColorCutQuantizer.getQuantizedColors()>
		//  106  227:astore          4
			} else
		//* 107  229:goto            238
			{
				afilter = ((Filter []) (mSwatches));
		//  108  232:aload_0         
		//  109  233:getfield        #63  <Field List mSwatches>
		//  110  236:astore          4
			}
			afilter = ((Filter []) (new Palette(((List) (afilter)), mTargets)));
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

		public Builder maximumColorCount(int i)
		{
			mMaxColors = i;
		//    0    0:aload_0         
		//    1    1:iload_1         
		//    2    2:putfield        #37  <Field int mMaxColors>
			return this;
		//    3    5:aload_0         
		//    4    6:areturn         
		}

		public Builder resizeBitmapArea(int i)
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

		public Builder resizeBitmapSize(int i)
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

		public Builder setRegion(int i, int j, int k, int l)
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

		public Builder(Bitmap bitmap)
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

		public Builder(List list)
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

	public static interface Filter
	{

		public abstract boolean isAllowed(int i, float af[]);
	}

	public static interface PaletteAsyncListener
	{

		public abstract void onGenerated(Palette palette);
	}

	public static final class Swatch
	{

		private void ensureTextColorsGenerated()
		{
			if(!mGeneratedTextColors)
		//*   0    0:aload_0         
		//*   1    1:getfield        #68  <Field boolean mGeneratedTextColors>
		//*   2    4:ifne            184
			{
				int i = ColorUtils.calculateMinimumAlpha(-1, mRgb, 4.5F);
		//    3    7:iconst_m1       
		//    4    8:aload_0         
		//    5    9:getfield        #45  <Field int mRgb>
		//    6   12:ldc1            #69  <Float 4.5F>
		//    7   14:invokestatic    #73  <Method int ColorUtils.calculateMinimumAlpha(int, int, float)>
		//    8   17:istore_1        
				int j = ColorUtils.calculateMinimumAlpha(-1, mRgb, 3F);
		//    9   18:iconst_m1       
		//   10   19:aload_0         
		//   11   20:getfield        #45  <Field int mRgb>
		//   12   23:ldc1            #74  <Float 3F>
		//   13   25:invokestatic    #73  <Method int ColorUtils.calculateMinimumAlpha(int, int, float)>
		//   14   28:istore_2        
				if(i != -1 && j != -1)
		//*  15   29:iload_1         
		//*  16   30:iconst_m1       
		//*  17   31:icmpeq          63
		//*  18   34:iload_2         
		//*  19   35:iconst_m1       
		//*  20   36:icmpeq          63
				{
					mBodyTextColor = ColorUtils.setAlphaComponent(-1, i);
		//   21   39:aload_0         
		//   22   40:iconst_m1       
		//   23   41:iload_1         
		//   24   42:invokestatic    #78  <Method int ColorUtils.setAlphaComponent(int, int)>
		//   25   45:putfield        #80  <Field int mBodyTextColor>
					mTitleTextColor = ColorUtils.setAlphaComponent(-1, j);
		//   26   48:aload_0         
		//   27   49:iconst_m1       
		//   28   50:iload_2         
		//   29   51:invokestatic    #78  <Method int ColorUtils.setAlphaComponent(int, int)>
		//   30   54:putfield        #82  <Field int mTitleTextColor>
					mGeneratedTextColors = true;
		//   31   57:aload_0         
		//   32   58:iconst_1        
		//   33   59:putfield        #68  <Field boolean mGeneratedTextColors>
					return;
		//   34   62:return          
				}
				int l = ColorUtils.calculateMinimumAlpha(0xff000000, mRgb, 4.5F);
		//   35   63:ldc1            #83  <Int 0xff000000>
		//   36   65:aload_0         
		//   37   66:getfield        #45  <Field int mRgb>
		//   38   69:ldc1            #69  <Float 4.5F>
		//   39   71:invokestatic    #73  <Method int ColorUtils.calculateMinimumAlpha(int, int, float)>
		//   40   74:istore          4
				int k = ColorUtils.calculateMinimumAlpha(0xff000000, mRgb, 3F);
		//   41   76:ldc1            #83  <Int 0xff000000>
		//   42   78:aload_0         
		//   43   79:getfield        #45  <Field int mRgb>
		//   44   82:ldc1            #74  <Float 3F>
		//   45   84:invokestatic    #73  <Method int ColorUtils.calculateMinimumAlpha(int, int, float)>
		//   46   87:istore_3        
				if(l != -1 && k != -1)
		//*  47   88:iload           4
		//*  48   90:iconst_m1       
		//*  49   91:icmpeq          126
		//*  50   94:iload_3         
		//*  51   95:iconst_m1       
		//*  52   96:icmpeq          126
				{
					mBodyTextColor = ColorUtils.setAlphaComponent(0xff000000, l);
		//   53   99:aload_0         
		//   54  100:ldc1            #83  <Int 0xff000000>
		//   55  102:iload           4
		//   56  104:invokestatic    #78  <Method int ColorUtils.setAlphaComponent(int, int)>
		//   57  107:putfield        #80  <Field int mBodyTextColor>
					mTitleTextColor = ColorUtils.setAlphaComponent(0xff000000, k);
		//   58  110:aload_0         
		//   59  111:ldc1            #83  <Int 0xff000000>
		//   60  113:iload_3         
		//   61  114:invokestatic    #78  <Method int ColorUtils.setAlphaComponent(int, int)>
		//   62  117:putfield        #82  <Field int mTitleTextColor>
					mGeneratedTextColors = true;
		//   63  120:aload_0         
		//   64  121:iconst_1        
		//   65  122:putfield        #68  <Field boolean mGeneratedTextColors>
					return;
		//   66  125:return          
				}
				if(i != -1)
		//*  67  126:iload_1         
		//*  68  127:iconst_m1       
		//*  69  128:icmpeq          140
					i = ColorUtils.setAlphaComponent(-1, i);
		//   70  131:iconst_m1       
		//   71  132:iload_1         
		//   72  133:invokestatic    #78  <Method int ColorUtils.setAlphaComponent(int, int)>
		//   73  136:istore_1        
				else
		//*  74  137:goto            148
					i = ColorUtils.setAlphaComponent(0xff000000, l);
		//   75  140:ldc1            #83  <Int 0xff000000>
		//   76  142:iload           4
		//   77  144:invokestatic    #78  <Method int ColorUtils.setAlphaComponent(int, int)>
		//   78  147:istore_1        
				mBodyTextColor = i;
		//   79  148:aload_0         
		//   80  149:iload_1         
		//   81  150:putfield        #80  <Field int mBodyTextColor>
				if(j != -1)
		//*  82  153:iload_2         
		//*  83  154:iconst_m1       
		//*  84  155:icmpeq          167
					i = ColorUtils.setAlphaComponent(-1, j);
		//   85  158:iconst_m1       
		//   86  159:iload_2         
		//   87  160:invokestatic    #78  <Method int ColorUtils.setAlphaComponent(int, int)>
		//   88  163:istore_1        
				else
		//*  89  164:goto            174
					i = ColorUtils.setAlphaComponent(0xff000000, k);
		//   90  167:ldc1            #83  <Int 0xff000000>
		//   91  169:iload_3         
		//   92  170:invokestatic    #78  <Method int ColorUtils.setAlphaComponent(int, int)>
		//   93  173:istore_1        
				mTitleTextColor = i;
		//   94  174:aload_0         
		//   95  175:iload_1         
		//   96  176:putfield        #82  <Field int mTitleTextColor>
				mGeneratedTextColors = true;
		//   97  179:aload_0         
		//   98  180:iconst_1        
		//   99  181:putfield        #68  <Field boolean mGeneratedTextColors>
			}
		//  100  184:return          
		}

		public boolean equals(Object obj)
		{
			if(this == obj)
		//*   0    0:aload_0         
		//*   1    1:aload_1         
		//*   2    2:if_acmpne       7
				return true;
		//    3    5:iconst_1        
		//    4    6:ireturn         
			if(obj != null)
		//*   5    7:aload_1         
		//*   6    8:ifnull          55
			{
				if(((Object)this).getClass() != obj.getClass())
		//*   7   11:aload_0         
		//*   8   12:invokevirtual   #89  <Method Class Object.getClass()>
		//*   9   15:aload_1         
		//*  10   16:invokevirtual   #89  <Method Class Object.getClass()>
		//*  11   19:if_acmpeq       24
					return false;
		//   12   22:iconst_0        
		//   13   23:ireturn         
				obj = ((Object) ((Swatch)obj));
		//   14   24:aload_1         
		//   15   25:checkcast       #2   <Class Palette$Swatch>
		//   16   28:astore_1        
				return mPopulation == ((Swatch) (obj)).mPopulation && mRgb == ((Swatch) (obj)).mRgb;
		//   17   29:aload_0         
		//   18   30:getfield        #47  <Field int mPopulation>
		//   19   33:aload_1         
		//   20   34:getfield        #47  <Field int mPopulation>
		//   21   37:icmpne          53
		//   22   40:aload_0         
		//   23   41:getfield        #45  <Field int mRgb>
		//   24   44:aload_1         
		//   25   45:getfield        #45  <Field int mRgb>
		//   26   48:icmpne          53
		//   27   51:iconst_1        
		//   28   52:ireturn         
		//   29   53:iconst_0        
		//   30   54:ireturn         
			} else
			{
				return false;
		//   31   55:iconst_0        
		//   32   56:ireturn         
			}
		}

		public int getBodyTextColor()
		{
			ensureTextColorsGenerated();
		//    0    0:aload_0         
		//    1    1:invokespecial   #93  <Method void ensureTextColorsGenerated()>
			return mBodyTextColor;
		//    2    4:aload_0         
		//    3    5:getfield        #80  <Field int mBodyTextColor>
		//    4    8:ireturn         
		}

		public float[] getHsl()
		{
			if(mHsl == null)
		//*   0    0:aload_0         
		//*   1    1:getfield        #65  <Field float[] mHsl>
		//*   2    4:ifnonnull       14
				mHsl = new float[3];
		//    3    7:aload_0         
		//    4    8:iconst_3        
		//    5    9:newarray        float[]
		//    6   11:putfield        #65  <Field float[] mHsl>
			ColorUtils.RGBToHSL(mRed, mGreen, mBlue, mHsl);
		//    7   14:aload_0         
		//    8   15:getfield        #33  <Field int mRed>
		//    9   18:aload_0         
		//   10   19:getfield        #38  <Field int mGreen>
		//   11   22:aload_0         
		//   12   23:getfield        #43  <Field int mBlue>
		//   13   26:aload_0         
		//   14   27:getfield        #65  <Field float[] mHsl>
		//   15   30:invokestatic    #101 <Method void ColorUtils.RGBToHSL(int, int, int, float[])>
			return mHsl;
		//   16   33:aload_0         
		//   17   34:getfield        #65  <Field float[] mHsl>
		//   18   37:areturn         
		}

		public int getPopulation()
		{
			return mPopulation;
		//    0    0:aload_0         
		//    1    1:getfield        #47  <Field int mPopulation>
		//    2    4:ireturn         
		}

		public int getRgb()
		{
			return mRgb;
		//    0    0:aload_0         
		//    1    1:getfield        #45  <Field int mRgb>
		//    2    4:ireturn         
		}

		public int getTitleTextColor()
		{
			ensureTextColorsGenerated();
		//    0    0:aload_0         
		//    1    1:invokespecial   #93  <Method void ensureTextColorsGenerated()>
			return mTitleTextColor;
		//    2    4:aload_0         
		//    3    5:getfield        #82  <Field int mTitleTextColor>
		//    4    8:ireturn         
		}

		public int hashCode()
		{
			return 31 * mRgb + mPopulation;
		//    0    0:bipush          31
		//    1    2:aload_0         
		//    2    3:getfield        #45  <Field int mRgb>
		//    3    6:imul            
		//    4    7:aload_0         
		//    5    8:getfield        #47  <Field int mPopulation>
		//    6   11:iadd            
		//    7   12:ireturn         
		}

		public String toString()
		{
			StringBuilder stringbuilder = new StringBuilder(((Object)this).getClass().getSimpleName());
		//    0    0:new             #109 <Class StringBuilder>
		//    1    3:dup             
		//    2    4:aload_0         
		//    3    5:invokevirtual   #89  <Method Class Object.getClass()>
		//    4    8:invokevirtual   #114 <Method String Class.getSimpleName()>
		//    5   11:invokespecial   #117 <Method void StringBuilder(String)>
		//    6   14:astore_1        
			stringbuilder.append(" [RGB: #");
		//    7   15:aload_1         
		//    8   16:ldc1            #119 <String " [RGB: #">
		//    9   18:invokevirtual   #123 <Method StringBuilder StringBuilder.append(String)>
		//   10   21:pop             
			stringbuilder.append(Integer.toHexString(getRgb()));
		//   11   22:aload_1         
		//   12   23:aload_0         
		//   13   24:invokevirtual   #125 <Method int getRgb()>
		//   14   27:invokestatic    #131 <Method String Integer.toHexString(int)>
		//   15   30:invokevirtual   #123 <Method StringBuilder StringBuilder.append(String)>
		//   16   33:pop             
			stringbuilder.append(']');
		//   17   34:aload_1         
		//   18   35:bipush          93
		//   19   37:invokevirtual   #134 <Method StringBuilder StringBuilder.append(char)>
		//   20   40:pop             
			stringbuilder.append(" [HSL: ");
		//   21   41:aload_1         
		//   22   42:ldc1            #136 <String " [HSL: ">
		//   23   44:invokevirtual   #123 <Method StringBuilder StringBuilder.append(String)>
		//   24   47:pop             
			stringbuilder.append(Arrays.toString(getHsl()));
		//   25   48:aload_1         
		//   26   49:aload_0         
		//   27   50:invokevirtual   #138 <Method float[] getHsl()>
		//   28   53:invokestatic    #143 <Method String Arrays.toString(float[])>
		//   29   56:invokevirtual   #123 <Method StringBuilder StringBuilder.append(String)>
		//   30   59:pop             
			stringbuilder.append(']');
		//   31   60:aload_1         
		//   32   61:bipush          93
		//   33   63:invokevirtual   #134 <Method StringBuilder StringBuilder.append(char)>
		//   34   66:pop             
			stringbuilder.append(" [Population: ");
		//   35   67:aload_1         
		//   36   68:ldc1            #145 <String " [Population: ">
		//   37   70:invokevirtual   #123 <Method StringBuilder StringBuilder.append(String)>
		//   38   73:pop             
			stringbuilder.append(mPopulation);
		//   39   74:aload_1         
		//   40   75:aload_0         
		//   41   76:getfield        #47  <Field int mPopulation>
		//   42   79:invokevirtual   #148 <Method StringBuilder StringBuilder.append(int)>
		//   43   82:pop             
			stringbuilder.append(']');
		//   44   83:aload_1         
		//   45   84:bipush          93
		//   46   86:invokevirtual   #134 <Method StringBuilder StringBuilder.append(char)>
		//   47   89:pop             
			stringbuilder.append(" [Title Text: #");
		//   48   90:aload_1         
		//   49   91:ldc1            #150 <String " [Title Text: #">
		//   50   93:invokevirtual   #123 <Method StringBuilder StringBuilder.append(String)>
		//   51   96:pop             
			stringbuilder.append(Integer.toHexString(getTitleTextColor()));
		//   52   97:aload_1         
		//   53   98:aload_0         
		//   54   99:invokevirtual   #152 <Method int getTitleTextColor()>
		//   55  102:invokestatic    #131 <Method String Integer.toHexString(int)>
		//   56  105:invokevirtual   #123 <Method StringBuilder StringBuilder.append(String)>
		//   57  108:pop             
			stringbuilder.append(']');
		//   58  109:aload_1         
		//   59  110:bipush          93
		//   60  112:invokevirtual   #134 <Method StringBuilder StringBuilder.append(char)>
		//   61  115:pop             
			stringbuilder.append(" [Body Text: #");
		//   62  116:aload_1         
		//   63  117:ldc1            #154 <String " [Body Text: #">
		//   64  119:invokevirtual   #123 <Method StringBuilder StringBuilder.append(String)>
		//   65  122:pop             
			stringbuilder.append(Integer.toHexString(getBodyTextColor()));
		//   66  123:aload_1         
		//   67  124:aload_0         
		//   68  125:invokevirtual   #156 <Method int getBodyTextColor()>
		//   69  128:invokestatic    #131 <Method String Integer.toHexString(int)>
		//   70  131:invokevirtual   #123 <Method StringBuilder StringBuilder.append(String)>
		//   71  134:pop             
			stringbuilder.append(']');
		//   72  135:aload_1         
		//   73  136:bipush          93
		//   74  138:invokevirtual   #134 <Method StringBuilder StringBuilder.append(char)>
		//   75  141:pop             
			return stringbuilder.toString();
		//   76  142:aload_1         
		//   77  143:invokevirtual   #158 <Method String StringBuilder.toString()>
		//   78  146:areturn         
		}

		private final int mBlue;
		private int mBodyTextColor;
		private boolean mGeneratedTextColors;
		private final int mGreen;
		private float mHsl[];
		private final int mPopulation;
		private final int mRed;
		private final int mRgb;
		private int mTitleTextColor;

		public Swatch(int i, int j)
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #25  <Method void Object()>
			mRed = Color.red(i);
		//    2    4:aload_0         
		//    3    5:iload_1         
		//    4    6:invokestatic    #31  <Method int Color.red(int)>
		//    5    9:putfield        #33  <Field int mRed>
			mGreen = Color.green(i);
		//    6   12:aload_0         
		//    7   13:iload_1         
		//    8   14:invokestatic    #36  <Method int Color.green(int)>
		//    9   17:putfield        #38  <Field int mGreen>
			mBlue = Color.blue(i);
		//   10   20:aload_0         
		//   11   21:iload_1         
		//   12   22:invokestatic    #41  <Method int Color.blue(int)>
		//   13   25:putfield        #43  <Field int mBlue>
			mRgb = i;
		//   14   28:aload_0         
		//   15   29:iload_1         
		//   16   30:putfield        #45  <Field int mRgb>
			mPopulation = j;
		//   17   33:aload_0         
		//   18   34:iload_2         
		//   19   35:putfield        #47  <Field int mPopulation>
		//   20   38:return          
		}

		Swatch(int i, int j, int k, int l)
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #25  <Method void Object()>
			mRed = i;
		//    2    4:aload_0         
		//    3    5:iload_1         
		//    4    6:putfield        #33  <Field int mRed>
			mGreen = j;
		//    5    9:aload_0         
		//    6   10:iload_2         
		//    7   11:putfield        #38  <Field int mGreen>
			mBlue = k;
		//    8   14:aload_0         
		//    9   15:iload_3         
		//   10   16:putfield        #43  <Field int mBlue>
			mRgb = Color.rgb(i, j, k);
		//   11   19:aload_0         
		//   12   20:iload_1         
		//   13   21:iload_2         
		//   14   22:iload_3         
		//   15   23:invokestatic    #54  <Method int Color.rgb(int, int, int)>
		//   16   26:putfield        #45  <Field int mRgb>
			mPopulation = l;
		//   17   29:aload_0         
		//   18   30:iload           4
		//   19   32:putfield        #47  <Field int mPopulation>
		//   20   35:return          
		}

		Swatch(float af[], int i)
		{
			this(ColorUtils.HSLToColor(af), i);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokestatic    #61  <Method int ColorUtils.HSLToColor(float[])>
		//    3    5:iload_2         
		//    4    6:invokespecial   #63  <Method void Palette$Swatch(int, int)>
			mHsl = af;
		//    5    9:aload_0         
		//    6   10:aload_1         
		//    7   11:putfield        #65  <Field float[] mHsl>
		//    8   14:return          
		}
	}


	Palette(List list, List list1)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #61  <Method void Object()>
		mSwatches = list;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #63  <Field List mSwatches>
		mTargets = list1;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #65  <Field List mTargets>
	//    8   14:aload_0         
	//    9   15:new             #67  <Class SparseBooleanArray>
	//   10   18:dup             
	//   11   19:invokespecial   #68  <Method void SparseBooleanArray()>
	//   12   22:putfield        #70  <Field SparseBooleanArray mUsedColors>
	//   13   25:aload_0         
	//   14   26:new             #72  <Class ArrayMap>
	//   15   29:dup             
	//   16   30:invokespecial   #73  <Method void ArrayMap()>
	//   17   33:putfield        #75  <Field Map mSelectedSwatches>
	//   18   36:aload_0         
	//   19   37:aload_0         
	//   20   38:invokespecial   #79  <Method Palette$Swatch findDominantSwatch()>
	//   21   41:putfield        #81  <Field Palette$Swatch mDominantSwatch>
	//   22   44:return          
	}

	private static float[] copyHslValues(Swatch swatch)
	{
		float af[] = new float[3];
	//    0    0:iconst_3        
	//    1    1:newarray        float[]
	//    2    3:astore_1        
		System.arraycopy(((Object) (swatch.getHsl())), 0, ((Object) (af)), 0, 3);
	//    3    4:aload_0         
	//    4    5:invokevirtual   #89  <Method float[] Palette$Swatch.getHsl()>
	//    5    8:iconst_0        
	//    6    9:aload_1         
	//    7   10:iconst_0        
	//    8   11:iconst_3        
	//    9   12:invokestatic    #95  <Method void System.arraycopy(Object, int, Object, int, int)>
		return af;
	//   10   15:aload_1         
	//   11   16:areturn         
	}

	private Swatch findDominantSwatch()
	{
		int l = mSwatches.size();
	//    0    0:aload_0         
	//    1    1:getfield        #63  <Field List mSwatches>
	//    2    4:invokeinterface #101 <Method int List.size()>
	//    3    9:istore          4
		int j = 0x80000000;
	//    4   11:ldc1            #102 <Int 0x80000000>
	//    5   13:istore_2        
		Swatch swatch = null;
	//    6   14:aconst_null     
	//    7   15:astore          5
		for(int i = 0; i < l;)
	//*   8   17:iconst_0        
	//*   9   18:istore_1        
	//*  10   19:iload_1         
	//*  11   20:iload           4
	//*  12   22:icmpge          70
		{
			Swatch swatch1 = (Swatch)mSwatches.get(i);
	//   13   25:aload_0         
	//   14   26:getfield        #63  <Field List mSwatches>
	//   15   29:iload_1         
	//   16   30:invokeinterface #106 <Method Object List.get(int)>
	//   17   35:checkcast       #19  <Class Palette$Swatch>
	//   18   38:astore          6
			int k = j;
	//   19   40:iload_2         
	//   20   41:istore_3        
			if(swatch1.getPopulation() > j)
	//*  21   42:aload           6
	//*  22   44:invokevirtual   #109 <Method int Palette$Swatch.getPopulation()>
	//*  23   47:iload_2         
	//*  24   48:icmple          61
			{
				k = swatch1.getPopulation();
	//   25   51:aload           6
	//   26   53:invokevirtual   #109 <Method int Palette$Swatch.getPopulation()>
	//   27   56:istore_3        
				swatch = swatch1;
	//   28   57:aload           6
	//   29   59:astore          5
			}
			i++;
	//   30   61:iload_1         
	//   31   62:iconst_1        
	//   32   63:iadd            
	//   33   64:istore_1        
			j = k;
	//   34   65:iload_3         
	//   35   66:istore_2        
		}

	//*  36   67:goto            19
		return swatch;
	//   37   70:aload           5
	//   38   72:areturn         
	}

	public static Builder from(Bitmap bitmap)
	{
		return new Builder(bitmap);
	//    0    0:new             #8   <Class Palette$Builder>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokespecial   #115 <Method void Palette$Builder(Bitmap)>
	//    4    8:areturn         
	}

	public static Palette from(List list)
	{
		return (new Builder(list)).generate();
	//    0    0:new             #8   <Class Palette$Builder>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokespecial   #121 <Method void Palette$Builder(List)>
	//    4    8:invokevirtual   #125 <Method Palette Palette$Builder.generate()>
	//    5   11:areturn         
	}

	public static Palette generate(Bitmap bitmap)
	{
		return from(bitmap).generate();
	//    0    0:aload_0         
	//    1    1:invokestatic    #130 <Method Palette$Builder from(Bitmap)>
	//    2    4:invokevirtual   #125 <Method Palette Palette$Builder.generate()>
	//    3    7:areturn         
	}

	public static Palette generate(Bitmap bitmap, int i)
	{
		return from(bitmap).maximumColorCount(i).generate();
	//    0    0:aload_0         
	//    1    1:invokestatic    #130 <Method Palette$Builder from(Bitmap)>
	//    2    4:iload_1         
	//    3    5:invokevirtual   #136 <Method Palette$Builder Palette$Builder.maximumColorCount(int)>
	//    4    8:invokevirtual   #125 <Method Palette Palette$Builder.generate()>
	//    5   11:areturn         
	}

	public static AsyncTask generateAsync(Bitmap bitmap, int i, PaletteAsyncListener paletteasynclistener)
	{
		return from(bitmap).maximumColorCount(i).generate(paletteasynclistener);
	//    0    0:aload_0         
	//    1    1:invokestatic    #130 <Method Palette$Builder from(Bitmap)>
	//    2    4:iload_1         
	//    3    5:invokevirtual   #136 <Method Palette$Builder Palette$Builder.maximumColorCount(int)>
	//    4    8:aload_2         
	//    5    9:invokevirtual   #141 <Method AsyncTask Palette$Builder.generate(Palette$PaletteAsyncListener)>
	//    6   12:areturn         
	}

	public static AsyncTask generateAsync(Bitmap bitmap, PaletteAsyncListener paletteasynclistener)
	{
		return from(bitmap).generate(paletteasynclistener);
	//    0    0:aload_0         
	//    1    1:invokestatic    #130 <Method Palette$Builder from(Bitmap)>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #141 <Method AsyncTask Palette$Builder.generate(Palette$PaletteAsyncListener)>
	//    4    8:areturn         
	}

	private float generateScore(Swatch swatch, Target target)
	{
		float af[] = swatch.getHsl();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #89  <Method float[] Palette$Swatch.getHsl()>
	//    2    4:astore          7
		int i;
		if(mDominantSwatch != null)
	//*   3    6:aload_0         
	//*   4    7:getfield        #81  <Field Palette$Swatch mDominantSwatch>
	//*   5   10:ifnull          25
			i = mDominantSwatch.getPopulation();
	//    6   13:aload_0         
	//    7   14:getfield        #81  <Field Palette$Swatch mDominantSwatch>
	//    8   17:invokevirtual   #109 <Method int Palette$Swatch.getPopulation()>
	//    9   20:istore          6
		else
	//*  10   22:goto            28
			i = 1;
	//   11   25:iconst_1        
	//   12   26:istore          6
		float f = target.getSaturationWeight();
	//   13   28:aload_2         
	//   14   29:invokevirtual   #152 <Method float Target.getSaturationWeight()>
	//   15   32:fstore_3        
		float f2 = 0.0F;
	//   16   33:fconst_0        
	//   17   34:fstore          5
		if(f > 0.0F)
	//*  18   36:fload_3         
	//*  19   37:fconst_0        
	//*  20   38:fcmpl           
	//*  21   39:ifle            67
		{
			f = target.getSaturationWeight();
	//   22   42:aload_2         
	//   23   43:invokevirtual   #152 <Method float Target.getSaturationWeight()>
	//   24   46:fstore_3        
			f = (1.0F - Math.abs(af[1] - target.getTargetSaturation())) * f;
	//   25   47:fconst_1        
	//   26   48:aload           7
	//   27   50:iconst_1        
	//   28   51:faload          
	//   29   52:aload_2         
	//   30   53:invokevirtual   #155 <Method float Target.getTargetSaturation()>
	//   31   56:fsub            
	//   32   57:invokestatic    #161 <Method float Math.abs(float)>
	//   33   60:fsub            
	//   34   61:fload_3         
	//   35   62:fmul            
	//   36   63:fstore_3        
		} else
	//*  37   64:goto            69
		{
			f = 0.0F;
	//   38   67:fconst_0        
	//   39   68:fstore_3        
		}
		float f1;
		if(target.getLightnessWeight() > 0.0F)
	//*  40   69:aload_2         
	//*  41   70:invokevirtual   #164 <Method float Target.getLightnessWeight()>
	//*  42   73:fconst_0        
	//*  43   74:fcmpl           
	//*  44   75:ifle            102
			f1 = target.getLightnessWeight() * (1.0F - Math.abs(af[2] - target.getTargetLightness()));
	//   45   78:aload_2         
	//   46   79:invokevirtual   #164 <Method float Target.getLightnessWeight()>
	//   47   82:fconst_1        
	//   48   83:aload           7
	//   49   85:iconst_2        
	//   50   86:faload          
	//   51   87:aload_2         
	//   52   88:invokevirtual   #167 <Method float Target.getTargetLightness()>
	//   53   91:fsub            
	//   54   92:invokestatic    #161 <Method float Math.abs(float)>
	//   55   95:fsub            
	//   56   96:fmul            
	//   57   97:fstore          4
		else
	//*  58   99:goto            105
			f1 = 0.0F;
	//   59  102:fconst_0        
	//   60  103:fstore          4
		if(target.getPopulationWeight() > 0.0F)
	//*  61  105:aload_2         
	//*  62  106:invokevirtual   #170 <Method float Target.getPopulationWeight()>
	//*  63  109:fconst_0        
	//*  64  110:fcmpl           
	//*  65  111:ifle            130
			f2 = target.getPopulationWeight() * ((float)swatch.getPopulation() / (float)i);
	//   66  114:aload_2         
	//   67  115:invokevirtual   #170 <Method float Target.getPopulationWeight()>
	//   68  118:aload_1         
	//   69  119:invokevirtual   #109 <Method int Palette$Swatch.getPopulation()>
	//   70  122:i2f             
	//   71  123:iload           6
	//   72  125:i2f             
	//   73  126:fdiv            
	//   74  127:fmul            
	//   75  128:fstore          5
		return f + f1 + f2;
	//   76  130:fload_3         
	//   77  131:fload           4
	//   78  133:fadd            
	//   79  134:fload           5
	//   80  136:fadd            
	//   81  137:freturn         
	}

	private Swatch generateScoredTarget(Target target)
	{
		Swatch swatch = getMaxScoredSwatchForTarget(target);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #175 <Method Palette$Swatch getMaxScoredSwatchForTarget(Target)>
	//    3    5:astore_2        
		if(swatch != null && target.isExclusive())
	//*   4    6:aload_2         
	//*   5    7:ifnull          29
	//*   6   10:aload_1         
	//*   7   11:invokevirtual   #179 <Method boolean Target.isExclusive()>
	//*   8   14:ifeq            29
			mUsedColors.append(swatch.getRgb(), true);
	//    9   17:aload_0         
	//   10   18:getfield        #70  <Field SparseBooleanArray mUsedColors>
	//   11   21:aload_2         
	//   12   22:invokevirtual   #182 <Method int Palette$Swatch.getRgb()>
	//   13   25:iconst_1        
	//   14   26:invokevirtual   #186 <Method void SparseBooleanArray.append(int, boolean)>
		return swatch;
	//   15   29:aload_2         
	//   16   30:areturn         
	}

	private Swatch getMaxScoredSwatchForTarget(Target target)
	{
		int j = mSwatches.size();
	//    0    0:aload_0         
	//    1    1:getfield        #63  <Field List mSwatches>
	//    2    4:invokeinterface #101 <Method int List.size()>
	//    3    9:istore          6
		float f = 0.0F;
	//    4   11:fconst_0        
	//    5   12:fstore_2        
		Swatch swatch = null;
	//    6   13:aconst_null     
	//    7   14:astore          7
		for(int i = 0; i < j;)
	//*   8   16:iconst_0        
	//*   9   17:istore          5
	//*  10   19:iload           5
	//*  11   21:iload           6
	//*  12   23:icmpge          107
		{
			float f1;
			Swatch swatch1;
label0:
			{
				Swatch swatch2 = (Swatch)mSwatches.get(i);
	//   13   26:aload_0         
	//   14   27:getfield        #63  <Field List mSwatches>
	//   15   30:iload           5
	//   16   32:invokeinterface #106 <Method Object List.get(int)>
	//   17   37:checkcast       #19  <Class Palette$Swatch>
	//   18   40:astore          9
				f1 = f;
	//   19   42:fload_2         
	//   20   43:fstore_3        
				swatch1 = swatch;
	//   21   44:aload           7
	//   22   46:astore          8
				if(!shouldBeScoredForTarget(swatch2, target))
					break label0;
	//   23   48:aload_0         
	//   24   49:aload           9
	//   25   51:aload_1         
	//   26   52:invokespecial   #190 <Method boolean shouldBeScoredForTarget(Palette$Swatch, Target)>
	//   27   55:ifeq            92
				float f2 = generateScore(swatch2, target);
	//   28   58:aload_0         
	//   29   59:aload           9
	//   30   61:aload_1         
	//   31   62:invokespecial   #192 <Method float generateScore(Palette$Swatch, Target)>
	//   32   65:fstore          4
				if(swatch != null)
	//*  33   67:aload           7
	//*  34   69:ifnull          85
				{
					f1 = f;
	//   35   72:fload_2         
	//   36   73:fstore_3        
					swatch1 = swatch;
	//   37   74:aload           7
	//   38   76:astore          8
					if(f2 <= f)
						break label0;
	//   39   78:fload           4
	//   40   80:fload_2         
	//   41   81:fcmpl           
	//   42   82:ifle            92
				}
				swatch1 = swatch2;
	//   43   85:aload           9
	//   44   87:astore          8
				f1 = f2;
	//   45   89:fload           4
	//   46   91:fstore_3        
			}
			i++;
	//   47   92:iload           5
	//   48   94:iconst_1        
	//   49   95:iadd            
	//   50   96:istore          5
			f = f1;
	//   51   98:fload_3         
	//   52   99:fstore_2        
			swatch = swatch1;
	//   53  100:aload           8
	//   54  102:astore          7
		}

	//*  55  104:goto            19
		return swatch;
	//   56  107:aload           7
	//   57  109:areturn         
	}

	private boolean shouldBeScoredForTarget(Swatch swatch, Target target)
	{
		float af[] = swatch.getHsl();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #89  <Method float[] Palette$Swatch.getHsl()>
	//    2    4:astore_3        
		return af[1] >= target.getMinimumSaturation() && af[1] <= target.getMaximumSaturation() && af[2] >= target.getMinimumLightness() && af[2] <= target.getMaximumLightness() && !mUsedColors.get(swatch.getRgb());
	//    3    5:aload_3         
	//    4    6:iconst_1        
	//    5    7:faload          
	//    6    8:aload_2         
	//    7    9:invokevirtual   #195 <Method float Target.getMinimumSaturation()>
	//    8   12:fcmpl           
	//    9   13:iflt            65
	//   10   16:aload_3         
	//   11   17:iconst_1        
	//   12   18:faload          
	//   13   19:aload_2         
	//   14   20:invokevirtual   #198 <Method float Target.getMaximumSaturation()>
	//   15   23:fcmpg           
	//   16   24:ifgt            65
	//   17   27:aload_3         
	//   18   28:iconst_2        
	//   19   29:faload          
	//   20   30:aload_2         
	//   21   31:invokevirtual   #201 <Method float Target.getMinimumLightness()>
	//   22   34:fcmpl           
	//   23   35:iflt            65
	//   24   38:aload_3         
	//   25   39:iconst_2        
	//   26   40:faload          
	//   27   41:aload_2         
	//   28   42:invokevirtual   #204 <Method float Target.getMaximumLightness()>
	//   29   45:fcmpg           
	//   30   46:ifgt            65
	//   31   49:aload_0         
	//   32   50:getfield        #70  <Field SparseBooleanArray mUsedColors>
	//   33   53:aload_1         
	//   34   54:invokevirtual   #182 <Method int Palette$Swatch.getRgb()>
	//   35   57:invokevirtual   #207 <Method boolean SparseBooleanArray.get(int)>
	//   36   60:ifne            65
	//   37   63:iconst_1        
	//   38   64:ireturn         
	//   39   65:iconst_0        
	//   40   66:ireturn         
	}

	void generate()
	{
		int j = mTargets.size();
	//    0    0:aload_0         
	//    1    1:getfield        #65  <Field List mTargets>
	//    2    4:invokeinterface #101 <Method int List.size()>
	//    3    9:istore_2        
		for(int i = 0; i < j; i++)
	//*   4   10:iconst_0        
	//*   5   11:istore_1        
	//*   6   12:iload_1         
	//*   7   13:iload_2         
	//*   8   14:icmpge          58
		{
			Target target = (Target)mTargets.get(i);
	//    9   17:aload_0         
	//   10   18:getfield        #65  <Field List mTargets>
	//   11   21:iload_1         
	//   12   22:invokeinterface #106 <Method Object List.get(int)>
	//   13   27:checkcast       #148 <Class Target>
	//   14   30:astore_3        
			target.normalizeWeights();
	//   15   31:aload_3         
	//   16   32:invokevirtual   #210 <Method void Target.normalizeWeights()>
			mSelectedSwatches.put(((Object) (target)), ((Object) (generateScoredTarget(target))));
	//   17   35:aload_0         
	//   18   36:getfield        #75  <Field Map mSelectedSwatches>
	//   19   39:aload_3         
	//   20   40:aload_0         
	//   21   41:aload_3         
	//   22   42:invokespecial   #212 <Method Palette$Swatch generateScoredTarget(Target)>
	//   23   45:invokeinterface #218 <Method Object Map.put(Object, Object)>
	//   24   50:pop             
		}

	//   25   51:iload_1         
	//   26   52:iconst_1        
	//   27   53:iadd            
	//   28   54:istore_1        
	//*  29   55:goto            12
		mUsedColors.clear();
	//   30   58:aload_0         
	//   31   59:getfield        #70  <Field SparseBooleanArray mUsedColors>
	//   32   62:invokevirtual   #221 <Method void SparseBooleanArray.clear()>
	//   33   65:return          
	}

	public int getColorForTarget(Target target, int i)
	{
		target = ((Target) (getSwatchForTarget(target)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #227 <Method Palette$Swatch getSwatchForTarget(Target)>
	//    3    5:astore_1        
		if(target != null)
	//*   4    6:aload_1         
	//*   5    7:ifnull          15
			i = ((Swatch) (target)).getRgb();
	//    6   10:aload_1         
	//    7   11:invokevirtual   #182 <Method int Palette$Swatch.getRgb()>
	//    8   14:istore_2        
		return i;
	//    9   15:iload_2         
	//   10   16:ireturn         
	}

	public int getDarkMutedColor(int i)
	{
		return getColorForTarget(Target.DARK_MUTED, i);
	//    0    0:aload_0         
	//    1    1:getstatic       #233 <Field Target Target.DARK_MUTED>
	//    2    4:iload_1         
	//    3    5:invokevirtual   #235 <Method int getColorForTarget(Target, int)>
	//    4    8:ireturn         
	}

	public Swatch getDarkMutedSwatch()
	{
		return getSwatchForTarget(Target.DARK_MUTED);
	//    0    0:aload_0         
	//    1    1:getstatic       #233 <Field Target Target.DARK_MUTED>
	//    2    4:invokevirtual   #227 <Method Palette$Swatch getSwatchForTarget(Target)>
	//    3    7:areturn         
	}

	public int getDarkVibrantColor(int i)
	{
		return getColorForTarget(Target.DARK_VIBRANT, i);
	//    0    0:aload_0         
	//    1    1:getstatic       #241 <Field Target Target.DARK_VIBRANT>
	//    2    4:iload_1         
	//    3    5:invokevirtual   #235 <Method int getColorForTarget(Target, int)>
	//    4    8:ireturn         
	}

	public Swatch getDarkVibrantSwatch()
	{
		return getSwatchForTarget(Target.DARK_VIBRANT);
	//    0    0:aload_0         
	//    1    1:getstatic       #241 <Field Target Target.DARK_VIBRANT>
	//    2    4:invokevirtual   #227 <Method Palette$Swatch getSwatchForTarget(Target)>
	//    3    7:areturn         
	}

	public int getDominantColor(int i)
	{
		if(mDominantSwatch != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #81  <Field Palette$Swatch mDominantSwatch>
	//*   2    4:ifnull          15
			i = mDominantSwatch.getRgb();
	//    3    7:aload_0         
	//    4    8:getfield        #81  <Field Palette$Swatch mDominantSwatch>
	//    5   11:invokevirtual   #182 <Method int Palette$Swatch.getRgb()>
	//    6   14:istore_1        
		return i;
	//    7   15:iload_1         
	//    8   16:ireturn         
	}

	public Swatch getDominantSwatch()
	{
		return mDominantSwatch;
	//    0    0:aload_0         
	//    1    1:getfield        #81  <Field Palette$Swatch mDominantSwatch>
	//    2    4:areturn         
	}

	public int getLightMutedColor(int i)
	{
		return getColorForTarget(Target.LIGHT_MUTED, i);
	//    0    0:aload_0         
	//    1    1:getstatic       #248 <Field Target Target.LIGHT_MUTED>
	//    2    4:iload_1         
	//    3    5:invokevirtual   #235 <Method int getColorForTarget(Target, int)>
	//    4    8:ireturn         
	}

	public Swatch getLightMutedSwatch()
	{
		return getSwatchForTarget(Target.LIGHT_MUTED);
	//    0    0:aload_0         
	//    1    1:getstatic       #248 <Field Target Target.LIGHT_MUTED>
	//    2    4:invokevirtual   #227 <Method Palette$Swatch getSwatchForTarget(Target)>
	//    3    7:areturn         
	}

	public int getLightVibrantColor(int i)
	{
		return getColorForTarget(Target.LIGHT_VIBRANT, i);
	//    0    0:aload_0         
	//    1    1:getstatic       #253 <Field Target Target.LIGHT_VIBRANT>
	//    2    4:iload_1         
	//    3    5:invokevirtual   #235 <Method int getColorForTarget(Target, int)>
	//    4    8:ireturn         
	}

	public Swatch getLightVibrantSwatch()
	{
		return getSwatchForTarget(Target.LIGHT_VIBRANT);
	//    0    0:aload_0         
	//    1    1:getstatic       #253 <Field Target Target.LIGHT_VIBRANT>
	//    2    4:invokevirtual   #227 <Method Palette$Swatch getSwatchForTarget(Target)>
	//    3    7:areturn         
	}

	public int getMutedColor(int i)
	{
		return getColorForTarget(Target.MUTED, i);
	//    0    0:aload_0         
	//    1    1:getstatic       #258 <Field Target Target.MUTED>
	//    2    4:iload_1         
	//    3    5:invokevirtual   #235 <Method int getColorForTarget(Target, int)>
	//    4    8:ireturn         
	}

	public Swatch getMutedSwatch()
	{
		return getSwatchForTarget(Target.MUTED);
	//    0    0:aload_0         
	//    1    1:getstatic       #258 <Field Target Target.MUTED>
	//    2    4:invokevirtual   #227 <Method Palette$Swatch getSwatchForTarget(Target)>
	//    3    7:areturn         
	}

	public Swatch getSwatchForTarget(Target target)
	{
		return (Swatch)mSelectedSwatches.get(((Object) (target)));
	//    0    0:aload_0         
	//    1    1:getfield        #75  <Field Map mSelectedSwatches>
	//    2    4:aload_1         
	//    3    5:invokeinterface #262 <Method Object Map.get(Object)>
	//    4   10:checkcast       #19  <Class Palette$Swatch>
	//    5   13:areturn         
	}

	public List getSwatches()
	{
		return Collections.unmodifiableList(mSwatches);
	//    0    0:aload_0         
	//    1    1:getfield        #63  <Field List mSwatches>
	//    2    4:invokestatic    #270 <Method List Collections.unmodifiableList(List)>
	//    3    7:areturn         
	}

	public List getTargets()
	{
		return Collections.unmodifiableList(mTargets);
	//    0    0:aload_0         
	//    1    1:getfield        #65  <Field List mTargets>
	//    2    4:invokestatic    #270 <Method List Collections.unmodifiableList(List)>
	//    3    7:areturn         
	}

	public int getVibrantColor(int i)
	{
		return getColorForTarget(Target.VIBRANT, i);
	//    0    0:aload_0         
	//    1    1:getstatic       #277 <Field Target Target.VIBRANT>
	//    2    4:iload_1         
	//    3    5:invokevirtual   #235 <Method int getColorForTarget(Target, int)>
	//    4    8:ireturn         
	}

	public Swatch getVibrantSwatch()
	{
		return getSwatchForTarget(Target.VIBRANT);
	//    0    0:aload_0         
	//    1    1:getstatic       #277 <Field Target Target.VIBRANT>
	//    2    4:invokevirtual   #227 <Method Palette$Swatch getSwatchForTarget(Target)>
	//    3    7:areturn         
	}

	static final int DEFAULT_CALCULATE_NUMBER_COLORS = 16;
	static final Filter DEFAULT_FILTER = new Filter() {

		private boolean isBlack(float af[])
		{
			return af[2] <= 0.05F;
		//    0    0:aload_1         
		//    1    1:iconst_2        
		//    2    2:faload          
		//    3    3:ldc1            #11  <Float 0.05F>
		//    4    5:fcmpg           
		//    5    6:ifgt            11
		//    6    9:iconst_1        
		//    7   10:ireturn         
		//    8   11:iconst_0        
		//    9   12:ireturn         
		}

		private boolean isNearRedILine(float af[])
		{
			boolean flag1 = false;
		//    0    0:iconst_0        
		//    1    1:istore_3        
			boolean flag = flag1;
		//    2    2:iload_3         
		//    3    3:istore_2        
			if(af[0] >= 10F)
		//*   4    4:aload_1         
		//*   5    5:iconst_0        
		//*   6    6:faload          
		//*   7    7:ldc1            #22  <Float 10F>
		//*   8    9:fcmpl           
		//*   9   10:iflt            37
			{
				flag = flag1;
		//   10   13:iload_3         
		//   11   14:istore_2        
				if(af[0] <= 37F)
		//*  12   15:aload_1         
		//*  13   16:iconst_0        
		//*  14   17:faload          
		//*  15   18:ldc1            #23  <Float 37F>
		//*  16   20:fcmpg           
		//*  17   21:ifgt            37
				{
					flag = flag1;
		//   18   24:iload_3         
		//   19   25:istore_2        
					if(af[1] <= 0.82F)
		//*  20   26:aload_1         
		//*  21   27:iconst_1        
		//*  22   28:faload          
		//*  23   29:ldc1            #24  <Float 0.82F>
		//*  24   31:fcmpg           
		//*  25   32:ifgt            37
						flag = true;
		//   26   35:iconst_1        
		//   27   36:istore_2        
				}
			}
			return flag;
		//   28   37:iload_2         
		//   29   38:ireturn         
		}

		private boolean isWhite(float af[])
		{
			return af[2] >= 0.95F;
		//    0    0:aload_1         
		//    1    1:iconst_2        
		//    2    2:faload          
		//    3    3:ldc1            #13  <Float 0.95F>
		//    4    5:fcmpl           
		//    5    6:iflt            11
		//    6    9:iconst_1        
		//    7   10:ireturn         
		//    8   11:iconst_0        
		//    9   12:ireturn         
		}

		public boolean isAllowed(int i, float af[])
		{
			return !isWhite(af) && !isBlack(af) && !isNearRedILine(af);
		//    0    0:aload_0         
		//    1    1:aload_2         
		//    2    2:invokespecial   #29  <Method boolean isWhite(float[])>
		//    3    5:ifne            26
		//    4    8:aload_0         
		//    5    9:aload_2         
		//    6   10:invokespecial   #31  <Method boolean isBlack(float[])>
		//    7   13:ifne            26
		//    8   16:aload_0         
		//    9   17:aload_2         
		//   10   18:invokespecial   #33  <Method boolean isNearRedILine(float[])>
		//   11   21:ifne            26
		//   12   24:iconst_1        
		//   13   25:ireturn         
		//   14   26:iconst_0        
		//   15   27:ireturn         
		}

		private static final float BLACK_MAX_LIGHTNESS = 0.05F;
		private static final float WHITE_MIN_LIGHTNESS = 0.95F;

	}
;
	static final int DEFAULT_RESIZE_BITMAP_AREA = 12544;
	static final String LOG_TAG = "Palette";
	static final boolean LOG_TIMINGS = false;
	static final float MIN_CONTRAST_BODY_TEXT = 4.5F;
	static final float MIN_CONTRAST_TITLE_TEXT = 3F;
	private final Swatch mDominantSwatch = findDominantSwatch();
	private final Map mSelectedSwatches = new ArrayMap();
	private final List mSwatches;
	private final List mTargets;
	private final SparseBooleanArray mUsedColors = new SparseBooleanArray();

	static 
	{
	//    0    0:new             #6   <Class Palette$1>
	//    1    3:dup             
	//    2    4:invokespecial   #56  <Method void Palette$1()>
	//    3    7:putstatic       #58  <Field Palette$Filter DEFAULT_FILTER>
	//*   4   10:return          
	}
}
