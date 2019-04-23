// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v7.graphics;

import android.graphics.Bitmap;
import android.graphics.Rect;
import android.os.AsyncTask;
import java.util.ArrayList;
import java.util.List;

// Referenced classes of package android.support.v7.graphics:
//			Palette, Target, ColorCutQuantizer

public final class Palette$Builder
{

	private int[] getPixelsFromBitmap(Bitmap bitmap)
	{
		int k = bitmap.getWidth();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #97  <Method int Bitmap.getWidth()>
	//    2    4:istore_3        
		int i = bitmap.getHeight();
	//    3    5:aload_1         
	//    4    6:invokevirtual   #100 <Method int Bitmap.getHeight()>
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
	//   19   26:invokevirtual   #104 <Method void Bitmap.getPixels(int[], int, int, int, int, int, int)>
		bitmap = ((Bitmap) (mRegion));
	//   20   29:aload_0         
	//   21   30:getfield        #106 <Field Rect mRegion>
	//   22   33:astore_1        
		if(bitmap == null)
	//*  23   34:aload_1         
	//*  24   35:ifnonnull       41
			return ai;
	//   25   38:aload           6
	//   26   40:areturn         
		int l = ((Rect) (bitmap)).width();
	//   27   41:aload_1         
	//   28   42:invokevirtual   #111 <Method int Rect.width()>
	//   29   45:istore          4
		int i1 = mRegion.height();
	//   30   47:aload_0         
	//   31   48:getfield        #106 <Field Rect mRegion>
	//   32   51:invokevirtual   #114 <Method int Rect.height()>
	//   33   54:istore          5
		bitmap = ((Bitmap) (new int[l * i1]));
	//   34   56:iload           4
	//   35   58:iload           5
	//   36   60:imul            
	//   37   61:newarray        int[]
	//   38   63:astore_1        
		for(int j = 0; j < i1; j++)
	//*  39   64:iconst_0        
	//*  40   65:istore_2        
	//*  41   66:iload_2         
	//*  42   67:iload           5
	//*  43   69:icmpge          110
			System.arraycopy(((Object) (ai)), (mRegion.top + j) * k + mRegion.left, ((Object) (bitmap)), j * l, l);
	//   44   72:aload           6
	//   45   74:aload_0         
	//   46   75:getfield        #106 <Field Rect mRegion>
	//   47   78:getfield        #117 <Field int Rect.top>
	//   48   81:iload_2         
	//   49   82:iadd            
	//   50   83:iload_3         
	//   51   84:imul            
	//   52   85:aload_0         
	//   53   86:getfield        #106 <Field Rect mRegion>
	//   54   89:getfield        #120 <Field int Rect.left>
	//   55   92:iadd            
	//   56   93:aload_1         
	//   57   94:iload_2         
	//   58   95:iload           4
	//   59   97:imul            
	//   60   98:iload           4
	//   61  100:invokestatic    #126 <Method void System.arraycopy(Object, int, Object, int, int)>

	//   62  103:iload_2         
	//   63  104:iconst_1        
	//   64  105:iadd            
	//   65  106:istore_2        
	//*  66  107:goto            66
		return ((int []) (bitmap));
	//   67  110:aload_1         
	//   68  111:areturn         
	}

	private Bitmap scaleBitmapDown(Bitmap bitmap)
	{
		int i = mResizeArea;
	//    0    0:aload_0         
	//    1    1:getfield        #30  <Field int mResizeArea>
	//    2    4:istore          6
		double d1 = -1D;
	//    3    6:ldc2w           #129 <Double -1D>
	//    4    9:dstore          4
		double d;
		if(i > 0)
	//*   5   11:iload           6
	//*   6   13:ifle            74
		{
			int j = bitmap.getWidth() * bitmap.getHeight();
	//    7   16:aload_1         
	//    8   17:invokevirtual   #97  <Method int Bitmap.getWidth()>
	//    9   20:aload_1         
	//   10   21:invokevirtual   #100 <Method int Bitmap.getHeight()>
	//   11   24:imul            
	//   12   25:istore          6
			int i1 = mResizeArea;
	//   13   27:aload_0         
	//   14   28:getfield        #30  <Field int mResizeArea>
	//   15   31:istore          7
			d = d1;
	//   16   33:dload           4
	//   17   35:dstore_2        
			if(j > i1)
	//*  18   36:iload           6
	//*  19   38:iload           7
	//*  20   40:icmple          138
			{
				d = i1;
	//   21   43:iload           7
	//   22   45:i2d             
	//   23   46:dstore_2        
				d1 = j;
	//   24   47:iload           6
	//   25   49:i2d             
	//   26   50:dstore          4
				Double.isNaN(d);
	//   27   52:dload_2         
	//   28   53:invokestatic    #136 <Method boolean Double.isNaN(double)>
	//   29   56:pop             
				Double.isNaN(d1);
	//   30   57:dload           4
	//   31   59:invokestatic    #136 <Method boolean Double.isNaN(double)>
	//   32   62:pop             
				d = Math.sqrt(d / d1);
	//   33   63:dload_2         
	//   34   64:dload           4
	//   35   66:ddiv            
	//   36   67:invokestatic    #142 <Method double Math.sqrt(double)>
	//   37   70:dstore_2        
			}
		} else
	//*  38   71:goto            138
		{
			d = d1;
	//   39   74:dload           4
	//   40   76:dstore_2        
			if(mResizeMaxDimension > 0)
	//*  41   77:aload_0         
	//*  42   78:getfield        #32  <Field int mResizeMaxDimension>
	//*  43   81:ifle            138
			{
				int k = Math.max(bitmap.getWidth(), bitmap.getHeight());
	//   44   84:aload_1         
	//   45   85:invokevirtual   #97  <Method int Bitmap.getWidth()>
	//   46   88:aload_1         
	//   47   89:invokevirtual   #100 <Method int Bitmap.getHeight()>
	//   48   92:invokestatic    #146 <Method int Math.max(int, int)>
	//   49   95:istore          6
				int j1 = mResizeMaxDimension;
	//   50   97:aload_0         
	//   51   98:getfield        #32  <Field int mResizeMaxDimension>
	//   52  101:istore          7
				d = d1;
	//   53  103:dload           4
	//   54  105:dstore_2        
				if(k > j1)
	//*  55  106:iload           6
	//*  56  108:iload           7
	//*  57  110:icmple          138
				{
					d = j1;
	//   58  113:iload           7
	//   59  115:i2d             
	//   60  116:dstore_2        
					double d2 = k;
	//   61  117:iload           6
	//   62  119:i2d             
	//   63  120:dstore          4
					Double.isNaN(d);
	//   64  122:dload_2         
	//   65  123:invokestatic    #136 <Method boolean Double.isNaN(double)>
	//   66  126:pop             
					Double.isNaN(d2);
	//   67  127:dload           4
	//   68  129:invokestatic    #136 <Method boolean Double.isNaN(double)>
	//   69  132:pop             
					d /= d2;
	//   70  133:dload_2         
	//   71  134:dload           4
	//   72  136:ddiv            
	//   73  137:dstore_2        
				}
			}
		}
		if(d <= 0.0D)
	//*  74  138:dload_2         
	//*  75  139:dconst_0        
	//*  76  140:dcmpg           
	//*  77  141:ifgt            146
		{
			return bitmap;
	//   78  144:aload_1         
	//   79  145:areturn         
		} else
		{
			double d3 = bitmap.getWidth();
	//   80  146:aload_1         
	//   81  147:invokevirtual   #97  <Method int Bitmap.getWidth()>
	//   82  150:i2d             
	//   83  151:dstore          4
			Double.isNaN(d3);
	//   84  153:dload           4
	//   85  155:invokestatic    #136 <Method boolean Double.isNaN(double)>
	//   86  158:pop             
			int l = (int)Math.ceil(d3 * d);
	//   87  159:dload           4
	//   88  161:dload_2         
	//   89  162:dmul            
	//   90  163:invokestatic    #149 <Method double Math.ceil(double)>
	//   91  166:d2i             
	//   92  167:istore          6
			d3 = bitmap.getHeight();
	//   93  169:aload_1         
	//   94  170:invokevirtual   #100 <Method int Bitmap.getHeight()>
	//   95  173:i2d             
	//   96  174:dstore          4
			Double.isNaN(d3);
	//   97  176:dload           4
	//   98  178:invokestatic    #136 <Method boolean Double.isNaN(double)>
	//   99  181:pop             
			return Bitmap.createScaledBitmap(bitmap, l, (int)Math.ceil(d3 * d), false);
	//  100  182:aload_1         
	//  101  183:iload           6
	//  102  185:dload           4
	//  103  187:dload_2         
	//  104  188:dmul            
	//  105  189:invokestatic    #149 <Method double Math.ceil(double)>
	//  106  192:d2i             
	//  107  193:iconst_0        
	//  108  194:invokestatic    #153 <Method Bitmap Bitmap.createScaledBitmap(Bitmap, int, int, boolean)>
	//  109  197:areturn         
		}
	}

	public Palette$Builder addFilter(Palette.Filter filter)
	{
		if(filter != null)
	//*   0    0:aload_1         
	//*   1    1:ifnull          15
			mFilters.add(((Object) (filter)));
	//    2    4:aload_0         
	//    3    5:getfield        #34  <Field List mFilters>
	//    4    8:aload_1         
	//    5    9:invokeinterface #52  <Method boolean List.add(Object)>
	//    6   14:pop             
		return this;
	//    7   15:aload_0         
	//    8   16:areturn         
	}

	public Palette$Builder addTarget(Target target)
	{
		if(!mTargets.contains(((Object) (target))))
	//*   0    0:aload_0         
	//*   1    1:getfield        #26  <Field List mTargets>
	//*   2    4:aload_1         
	//*   3    5:invokeinterface #160 <Method boolean List.contains(Object)>
	//*   4   10:ifne            24
			mTargets.add(((Object) (target)));
	//    5   13:aload_0         
	//    6   14:getfield        #26  <Field List mTargets>
	//    7   17:aload_1         
	//    8   18:invokeinterface #52  <Method boolean List.add(Object)>
	//    9   23:pop             
		return this;
	//   10   24:aload_0         
	//   11   25:areturn         
	}

	public Palette$Builder clearFilters()
	{
		mFilters.clear();
	//    0    0:aload_0         
	//    1    1:getfield        #34  <Field List mFilters>
	//    2    4:invokeinterface #165 <Method void List.clear()>
		return this;
	//    3    9:aload_0         
	//    4   10:areturn         
	}

	public Palette$Builder clearRegion()
	{
		mRegion = null;
	//    0    0:aload_0         
	//    1    1:aconst_null     
	//    2    2:putfield        #106 <Field Rect mRegion>
		return this;
	//    3    5:aload_0         
	//    4    6:areturn         
	}

	public Palette$Builder clearTargets()
	{
		List list = mTargets;
	//    0    0:aload_0         
	//    1    1:getfield        #26  <Field List mTargets>
	//    2    4:astore_1        
		if(list != null)
	//*   3    5:aload_1         
	//*   4    6:ifnull          15
			list.clear();
	//    5    9:aload_1         
	//    6   10:invokeinterface #165 <Method void List.clear()>
		return this;
	//    7   15:aload_0         
	//    8   16:areturn         
	}

	public AsyncTask generate(final syncListener listener)
	{
		class _cls1 extends AsyncTask
		{

			protected transient Palette doInBackground(Bitmap abitmap[])
			{
				try
				{
					abitmap = ((Bitmap []) (generate()));
			//    0    0:aload_0         
			//    1    1:getfield        #12  <Field Palette$Builder this$0>
			//    2    4:invokevirtual   #28  <Method Palette Palette$Builder.generate()>
			//    3    7:astore_1        
				}
			//*   4    8:aload_1         
			//*   5    9:areturn         
				// Misplaced declaration of an exception variable
				catch(Bitmap abitmap[])
			//*   6   10:astore_1        
				{
					Log.e("Palette", "Exception thrown during async generate", ((Throwable) (abitmap)));
			//    7   11:ldc1            #30  <String "Palette">
			//    8   13:ldc1            #32  <String "Exception thrown during async generate">
			//    9   15:aload_1         
			//   10   16:invokestatic    #38  <Method int Log.e(String, String, Throwable)>
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
			//    2    2:checkcast       #41  <Class Bitmap[]>
			//    3    5:invokevirtual   #43  <Method Palette doInBackground(Bitmap[])>
			//    4    8:areturn         
			}

			protected void onPostExecute(Palette palette)
			{
				listener.onGenerated(palette);
			//    0    0:aload_0         
			//    1    1:getfield        #14  <Field Palette$PaletteAsyncListener val$listener>
			//    2    4:aload_1         
			//    3    5:invokeinterface #50  <Method void Palette$PaletteAsyncListener.onGenerated(Palette)>
			//    4   10:return          
			}

			protected volatile void onPostExecute(Object obj)
			{
				onPostExecute((Palette)obj);
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:checkcast       #53  <Class Palette>
			//    3    5:invokevirtual   #55  <Method void onPostExecute(Palette)>
			//    4    8:return          
			}

			final Palette.Builder this$0;
			final Palette.PaletteAsyncListener val$listener;

			_cls1()
			{
				this$0 = Palette.Builder.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #12  <Field Palette$Builder this$0>
				listener = paletteasynclistener;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #14  <Field Palette$PaletteAsyncListener val$listener>
				super();
			//    6   10:aload_0         
			//    7   11:invokespecial   #17  <Method void AsyncTask()>
			//    8   14:return          
			}
		}

		if(listener != null)
	//*   0    0:aload_1         
	//*   1    1:ifnull          31
			return (new _cls1()).executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, ((Object []) (new Bitmap[] {
				mBitmap
			})));
	//    2    4:new             #171 <Class Palette$Builder$1>
	//    3    7:dup             
	//    4    8:aload_0         
	//    5    9:aload_1         
	//    6   10:invokespecial   #174 <Method void Palette$Builder$1(Palette$Builder, Palette$PaletteAsyncListener)>
	//    7   13:getstatic       #180 <Field java.util.concurrent.Executor AsyncTask.THREAD_POOL_EXECUTOR>
	//    8   16:iconst_1        
	//    9   17:anewarray       Bitmap[]
	//   10   20:dup             
	//   11   21:iconst_0        
	//   12   22:aload_0         
	//   13   23:getfield        #54  <Field Bitmap mBitmap>
	//   14   26:aastore         
	//   15   27:invokevirtual   #184 <Method AsyncTask Palette$Builder$1.executeOnExecutor(java.util.concurrent.Executor, Object[])>
	//   16   30:areturn         
		else
			throw new IllegalArgumentException("listener can not be null");
	//   17   31:new             #79  <Class IllegalArgumentException>
	//   18   34:dup             
	//   19   35:ldc1            #186 <String "listener can not be null">
	//   20   37:invokespecial   #84  <Method void IllegalArgumentException(String)>
	//   21   40:athrow          
	}

	public Palette generate()
	{
label0:
		{
			Object obj = ((Object) (mBitmap));
	//    0    0:aload_0         
	//    1    1:getfield        #54  <Field Bitmap mBitmap>
	//    2    4:astore          6
			if(obj != null)
	//*   3    6:aload           6
	//*   4    8:ifnull          280
			{
				Bitmap bitmap = scaleBitmapDown(((Bitmap) (obj)));
	//    5   11:aload_0         
	//    6   12:aload           6
	//    7   14:invokespecial   #189 <Method Bitmap scaleBitmapDown(Bitmap)>
	//    8   17:astore          7
				obj = ((Object) (mRegion));
	//    9   19:aload_0         
	//   10   20:getfield        #106 <Field Rect mRegion>
	//   11   23:astore          6
				if(bitmap != mBitmap && obj != null)
	//*  12   25:aload           7
	//*  13   27:aload_0         
	//*  14   28:getfield        #54  <Field Bitmap mBitmap>
	//*  15   31:if_acmpeq       181
	//*  16   34:aload           6
	//*  17   36:ifnull          181
				{
					double d = bitmap.getWidth();
	//   18   39:aload           7
	//   19   41:invokevirtual   #97  <Method int Bitmap.getWidth()>
	//   20   44:i2d             
	//   21   45:dstore_1        
					double d1 = mBitmap.getWidth();
	//   22   46:aload_0         
	//   23   47:getfield        #54  <Field Bitmap mBitmap>
	//   24   50:invokevirtual   #97  <Method int Bitmap.getWidth()>
	//   25   53:i2d             
	//   26   54:dstore_3        
					Double.isNaN(d);
	//   27   55:dload_1         
	//   28   56:invokestatic    #136 <Method boolean Double.isNaN(double)>
	//   29   59:pop             
					Double.isNaN(d1);
	//   30   60:dload_3         
	//   31   61:invokestatic    #136 <Method boolean Double.isNaN(double)>
	//   32   64:pop             
					d /= d1;
	//   33   65:dload_1         
	//   34   66:dload_3         
	//   35   67:ddiv            
	//   36   68:dstore_1        
					d1 = ((Rect) (obj)).left;
	//   37   69:aload           6
	//   38   71:getfield        #120 <Field int Rect.left>
	//   39   74:i2d             
	//   40   75:dstore_3        
					Double.isNaN(d1);
	//   41   76:dload_3         
	//   42   77:invokestatic    #136 <Method boolean Double.isNaN(double)>
	//   43   80:pop             
					obj.left = (int)Math.floor(d1 * d);
	//   44   81:aload           6
	//   45   83:dload_3         
	//   46   84:dload_1         
	//   47   85:dmul            
	//   48   86:invokestatic    #192 <Method double Math.floor(double)>
	//   49   89:d2i             
	//   50   90:putfield        #120 <Field int Rect.left>
					d1 = ((Rect) (obj)).top;
	//   51   93:aload           6
	//   52   95:getfield        #117 <Field int Rect.top>
	//   53   98:i2d             
	//   54   99:dstore_3        
					Double.isNaN(d1);
	//   55  100:dload_3         
	//   56  101:invokestatic    #136 <Method boolean Double.isNaN(double)>
	//   57  104:pop             
					obj.top = (int)Math.floor(d1 * d);
	//   58  105:aload           6
	//   59  107:dload_3         
	//   60  108:dload_1         
	//   61  109:dmul            
	//   62  110:invokestatic    #192 <Method double Math.floor(double)>
	//   63  113:d2i             
	//   64  114:putfield        #117 <Field int Rect.top>
					d1 = ((Rect) (obj)).right;
	//   65  117:aload           6
	//   66  119:getfield        #195 <Field int Rect.right>
	//   67  122:i2d             
	//   68  123:dstore_3        
					Double.isNaN(d1);
	//   69  124:dload_3         
	//   70  125:invokestatic    #136 <Method boolean Double.isNaN(double)>
	//   71  128:pop             
					obj.right = Math.min((int)Math.ceil(d1 * d), bitmap.getWidth());
	//   72  129:aload           6
	//   73  131:dload_3         
	//   74  132:dload_1         
	//   75  133:dmul            
	//   76  134:invokestatic    #149 <Method double Math.ceil(double)>
	//   77  137:d2i             
	//   78  138:aload           7
	//   79  140:invokevirtual   #97  <Method int Bitmap.getWidth()>
	//   80  143:invokestatic    #198 <Method int Math.min(int, int)>
	//   81  146:putfield        #195 <Field int Rect.right>
					d1 = ((Rect) (obj)).bottom;
	//   82  149:aload           6
	//   83  151:getfield        #201 <Field int Rect.bottom>
	//   84  154:i2d             
	//   85  155:dstore_3        
					Double.isNaN(d1);
	//   86  156:dload_3         
	//   87  157:invokestatic    #136 <Method boolean Double.isNaN(double)>
	//   88  160:pop             
					obj.bottom = Math.min((int)Math.ceil(d1 * d), bitmap.getHeight());
	//   89  161:aload           6
	//   90  163:dload_3         
	//   91  164:dload_1         
	//   92  165:dmul            
	//   93  166:invokestatic    #149 <Method double Math.ceil(double)>
	//   94  169:d2i             
	//   95  170:aload           7
	//   96  172:invokevirtual   #100 <Method int Bitmap.getHeight()>
	//   97  175:invokestatic    #198 <Method int Math.min(int, int)>
	//   98  178:putfield        #201 <Field int Rect.bottom>
				}
				int ai[] = getPixelsFromBitmap(bitmap);
	//   99  181:aload_0         
	//  100  182:aload           7
	//  101  184:invokespecial   #203 <Method int[] getPixelsFromBitmap(Bitmap)>
	//  102  187:astore          8
				int i = mMaxColors;
	//  103  189:aload_0         
	//  104  190:getfield        #28  <Field int mMaxColors>
	//  105  193:istore          5
				Palette.Filter afilter[];
				if(mFilters.isEmpty())
	//* 106  195:aload_0         
	//* 107  196:getfield        #34  <Field List mFilters>
	//* 108  199:invokeinterface #89  <Method boolean List.isEmpty()>
	//* 109  204:ifeq            213
				{
					afilter = null;
	//  110  207:aconst_null     
	//  111  208:astore          6
				} else
	//* 112  210:goto            241
				{
					afilter = ((Palette.Filter []) (mFilters));
	//  113  213:aload_0         
	//  114  214:getfield        #34  <Field List mFilters>
	//  115  217:astore          6
					afilter = (Palette.Filter[])((List) (afilter)).toArray(((Object []) (new Palette.Filter[((List) (afilter)).size()])));
	//  116  219:aload           6
	//  117  221:aload           6
	//  118  223:invokeinterface #206 <Method int List.size()>
	//  119  228:anewarray       Palette.Filter[]
	//  120  231:invokeinterface #212 <Method Object[] List.toArray(Object[])>
	//  121  236:checkcast       #214 <Class Palette$Filter[]>
	//  122  239:astore          6
				}
				afilter = ((Palette.Filter []) (new ColorCutQuantizer(ai, i, afilter)));
	//  123  241:new             #216 <Class ColorCutQuantizer>
	//  124  244:dup             
	//  125  245:aload           8
	//  126  247:iload           5
	//  127  249:aload           6
	//  128  251:invokespecial   #219 <Method void ColorCutQuantizer(int[], int, Palette$Filter[])>
	//  129  254:astore          6
				if(bitmap != mBitmap)
	//* 130  256:aload           7
	//* 131  258:aload_0         
	//* 132  259:getfield        #54  <Field Bitmap mBitmap>
	//* 133  262:if_acmpeq       270
					bitmap.recycle();
	//  134  265:aload           7
	//  135  267:invokevirtual   #222 <Method void Bitmap.recycle()>
				afilter = ((Palette.Filter []) (((ColorCutQuantizer) (afilter)).getQuantizedColors()));
	//  136  270:aload           6
	//  137  272:invokevirtual   #226 <Method List ColorCutQuantizer.getQuantizedColors()>
	//  138  275:astore          6
			} else
	//* 139  277:goto            291
			{
				afilter = ((Palette.Filter []) (mSwatches));
	//  140  280:aload_0         
	//  141  281:getfield        #56  <Field List mSwatches>
	//  142  284:astore          6
				if(afilter == null)
					break label0;
	//  143  286:aload           6
	//  144  288:ifnull          314
			}
			afilter = ((Palette.Filter []) (new Palette(((List) (afilter)), mTargets)));
	//  145  291:new             #42  <Class Palette>
	//  146  294:dup             
	//  147  295:aload           6
	//  148  297:aload_0         
	//  149  298:getfield        #26  <Field List mTargets>
	//  150  301:invokespecial   #229 <Method void Palette(List, List)>
	//  151  304:astore          6
			((Palette) (afilter)).generate();
	//  152  306:aload           6
	//  153  308:invokevirtual   #231 <Method void Palette.generate()>
			return ((Palette) (afilter));
	//  154  311:aload           6
	//  155  313:areturn         
		}
		throw new AssertionError();
	//  156  314:new             #233 <Class AssertionError>
	//  157  317:dup             
	//  158  318:invokespecial   #234 <Method void AssertionError()>
	//  159  321:athrow          
	}

	public Palette$Builder maximumColorCount(int i)
	{
		mMaxColors = i;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #28  <Field int mMaxColors>
		return this;
	//    3    5:aload_0         
	//    4    6:areturn         
	}

	public Palette$Builder resizeBitmapArea(int i)
	{
		mResizeArea = i;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #30  <Field int mResizeArea>
		mResizeMaxDimension = -1;
	//    3    5:aload_0         
	//    4    6:iconst_m1       
	//    5    7:putfield        #32  <Field int mResizeMaxDimension>
		return this;
	//    6   10:aload_0         
	//    7   11:areturn         
	}

	public Palette$Builder resizeBitmapSize(int i)
	{
		mResizeMaxDimension = i;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #32  <Field int mResizeMaxDimension>
		mResizeArea = -1;
	//    3    5:aload_0         
	//    4    6:iconst_m1       
	//    5    7:putfield        #30  <Field int mResizeArea>
		return this;
	//    6   10:aload_0         
	//    7   11:areturn         
	}

	public Palette$Builder setRegion(int i, int j, int k, int l)
	{
		if(mBitmap != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #54  <Field Bitmap mBitmap>
	//*   2    4:ifnull          75
		{
			if(mRegion == null)
	//*   3    7:aload_0         
	//*   4    8:getfield        #106 <Field Rect mRegion>
	//*   5   11:ifnonnull       25
				mRegion = new Rect();
	//    6   14:aload_0         
	//    7   15:new             #108 <Class Rect>
	//    8   18:dup             
	//    9   19:invokespecial   #243 <Method void Rect()>
	//   10   22:putfield        #106 <Field Rect mRegion>
			mRegion.set(0, 0, mBitmap.getWidth(), mBitmap.getHeight());
	//   11   25:aload_0         
	//   12   26:getfield        #106 <Field Rect mRegion>
	//   13   29:iconst_0        
	//   14   30:iconst_0        
	//   15   31:aload_0         
	//   16   32:getfield        #54  <Field Bitmap mBitmap>
	//   17   35:invokevirtual   #97  <Method int Bitmap.getWidth()>
	//   18   38:aload_0         
	//   19   39:getfield        #54  <Field Bitmap mBitmap>
	//   20   42:invokevirtual   #100 <Method int Bitmap.getHeight()>
	//   21   45:invokevirtual   #247 <Method void Rect.set(int, int, int, int)>
			if(mRegion.intersect(i, j, k, l))
	//*  22   48:aload_0         
	//*  23   49:getfield        #106 <Field Rect mRegion>
	//*  24   52:iload_1         
	//*  25   53:iload_2         
	//*  26   54:iload_3         
	//*  27   55:iload           4
	//*  28   57:invokevirtual   #251 <Method boolean Rect.intersect(int, int, int, int)>
	//*  29   60:ifeq            65
				return this;
	//   30   63:aload_0         
	//   31   64:areturn         
			else
				throw new IllegalArgumentException("The given region must intersect with the Bitmap's dimensions.");
	//   32   65:new             #79  <Class IllegalArgumentException>
	//   33   68:dup             
	//   34   69:ldc1            #253 <String "The given region must intersect with the Bitmap's dimensions.">
	//   35   71:invokespecial   #84  <Method void IllegalArgumentException(String)>
	//   36   74:athrow          
		} else
		{
			return this;
	//   37   75:aload_0         
	//   38   76:areturn         
		}
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
	//    1    1:invokespecial   #21  <Method void Object()>
		mTargets = ((List) (new ArrayList()));
	//    2    4:aload_0         
	//    3    5:new             #23  <Class ArrayList>
	//    4    8:dup             
	//    5    9:invokespecial   #24  <Method void ArrayList()>
	//    6   12:putfield        #26  <Field List mTargets>
		mMaxColors = 16;
	//    7   15:aload_0         
	//    8   16:bipush          16
	//    9   18:putfield        #28  <Field int mMaxColors>
		mResizeArea = 12544;
	//   10   21:aload_0         
	//   11   22:sipush          12544
	//   12   25:putfield        #30  <Field int mResizeArea>
		mResizeMaxDimension = -1;
	//   13   28:aload_0         
	//   14   29:iconst_m1       
	//   15   30:putfield        #32  <Field int mResizeMaxDimension>
		mFilters = ((List) (new ArrayList()));
	//   16   33:aload_0         
	//   17   34:new             #23  <Class ArrayList>
	//   18   37:dup             
	//   19   38:invokespecial   #24  <Method void ArrayList()>
	//   20   41:putfield        #34  <Field List mFilters>
		if(bitmap != null && !bitmap.isRecycled())
	//*  21   44:aload_1         
	//*  22   45:ifnull          157
	//*  23   48:aload_1         
	//*  24   49:invokevirtual   #40  <Method boolean Bitmap.isRecycled()>
	//*  25   52:ifne            157
		{
			mFilters.add(((Object) (Palette.DEFAULT_FILTER)));
	//   26   55:aload_0         
	//   27   56:getfield        #34  <Field List mFilters>
	//   28   59:getstatic       #46  <Field Palette$Filter Palette.DEFAULT_FILTER>
	//   29   62:invokeinterface #52  <Method boolean List.add(Object)>
	//   30   67:pop             
			mBitmap = bitmap;
	//   31   68:aload_0         
	//   32   69:aload_1         
	//   33   70:putfield        #54  <Field Bitmap mBitmap>
			mSwatches = null;
	//   34   73:aload_0         
	//   35   74:aconst_null     
	//   36   75:putfield        #56  <Field List mSwatches>
			mTargets.add(((Object) (Target.LIGHT_VIBRANT)));
	//   37   78:aload_0         
	//   38   79:getfield        #26  <Field List mTargets>
	//   39   82:getstatic       #62  <Field Target Target.LIGHT_VIBRANT>
	//   40   85:invokeinterface #52  <Method boolean List.add(Object)>
	//   41   90:pop             
			mTargets.add(((Object) (Target.VIBRANT)));
	//   42   91:aload_0         
	//   43   92:getfield        #26  <Field List mTargets>
	//   44   95:getstatic       #65  <Field Target Target.VIBRANT>
	//   45   98:invokeinterface #52  <Method boolean List.add(Object)>
	//   46  103:pop             
			mTargets.add(((Object) (Target.DARK_VIBRANT)));
	//   47  104:aload_0         
	//   48  105:getfield        #26  <Field List mTargets>
	//   49  108:getstatic       #68  <Field Target Target.DARK_VIBRANT>
	//   50  111:invokeinterface #52  <Method boolean List.add(Object)>
	//   51  116:pop             
			mTargets.add(((Object) (Target.LIGHT_MUTED)));
	//   52  117:aload_0         
	//   53  118:getfield        #26  <Field List mTargets>
	//   54  121:getstatic       #71  <Field Target Target.LIGHT_MUTED>
	//   55  124:invokeinterface #52  <Method boolean List.add(Object)>
	//   56  129:pop             
			mTargets.add(((Object) (Target.MUTED)));
	//   57  130:aload_0         
	//   58  131:getfield        #26  <Field List mTargets>
	//   59  134:getstatic       #74  <Field Target Target.MUTED>
	//   60  137:invokeinterface #52  <Method boolean List.add(Object)>
	//   61  142:pop             
			mTargets.add(((Object) (Target.DARK_MUTED)));
	//   62  143:aload_0         
	//   63  144:getfield        #26  <Field List mTargets>
	//   64  147:getstatic       #77  <Field Target Target.DARK_MUTED>
	//   65  150:invokeinterface #52  <Method boolean List.add(Object)>
	//   66  155:pop             
			return;
	//   67  156:return          
		} else
		{
			throw new IllegalArgumentException("Bitmap is not valid");
	//   68  157:new             #79  <Class IllegalArgumentException>
	//   69  160:dup             
	//   70  161:ldc1            #81  <String "Bitmap is not valid">
	//   71  163:invokespecial   #84  <Method void IllegalArgumentException(String)>
	//   72  166:athrow          
		}
	}

	public Palette$Builder(List list)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #21  <Method void Object()>
		mTargets = ((List) (new ArrayList()));
	//    2    4:aload_0         
	//    3    5:new             #23  <Class ArrayList>
	//    4    8:dup             
	//    5    9:invokespecial   #24  <Method void ArrayList()>
	//    6   12:putfield        #26  <Field List mTargets>
		mMaxColors = 16;
	//    7   15:aload_0         
	//    8   16:bipush          16
	//    9   18:putfield        #28  <Field int mMaxColors>
		mResizeArea = 12544;
	//   10   21:aload_0         
	//   11   22:sipush          12544
	//   12   25:putfield        #30  <Field int mResizeArea>
		mResizeMaxDimension = -1;
	//   13   28:aload_0         
	//   14   29:iconst_m1       
	//   15   30:putfield        #32  <Field int mResizeMaxDimension>
		mFilters = ((List) (new ArrayList()));
	//   16   33:aload_0         
	//   17   34:new             #23  <Class ArrayList>
	//   18   37:dup             
	//   19   38:invokespecial   #24  <Method void ArrayList()>
	//   20   41:putfield        #34  <Field List mFilters>
		if(list != null && !list.isEmpty())
	//*  21   44:aload_1         
	//*  22   45:ifnull          81
	//*  23   48:aload_1         
	//*  24   49:invokeinterface #89  <Method boolean List.isEmpty()>
	//*  25   54:ifne            81
		{
			mFilters.add(((Object) (Palette.DEFAULT_FILTER)));
	//   26   57:aload_0         
	//   27   58:getfield        #34  <Field List mFilters>
	//   28   61:getstatic       #46  <Field Palette$Filter Palette.DEFAULT_FILTER>
	//   29   64:invokeinterface #52  <Method boolean List.add(Object)>
	//   30   69:pop             
			mSwatches = list;
	//   31   70:aload_0         
	//   32   71:aload_1         
	//   33   72:putfield        #56  <Field List mSwatches>
			mBitmap = null;
	//   34   75:aload_0         
	//   35   76:aconst_null     
	//   36   77:putfield        #54  <Field Bitmap mBitmap>
			return;
	//   37   80:return          
		} else
		{
			throw new IllegalArgumentException("List of Swatches is not valid");
	//   38   81:new             #79  <Class IllegalArgumentException>
	//   39   84:dup             
	//   40   85:ldc1            #91  <String "List of Swatches is not valid">
	//   41   87:invokespecial   #84  <Method void IllegalArgumentException(String)>
	//   42   90:athrow          
		}
	}
}
