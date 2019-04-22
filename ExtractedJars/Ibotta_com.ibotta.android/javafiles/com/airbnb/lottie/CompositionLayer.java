// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.airbnb.lottie;

import android.graphics.*;
import android.support.v4.util.LongSparseArray;
import java.util.ArrayList;
import java.util.List;

// Referenced classes of package com.airbnb.lottie:
//			BaseLayer, LottieComposition, Layer, LottieDrawable

class CompositionLayer extends BaseLayer
{

	CompositionLayer(LottieDrawable lottiedrawable, Layer layer, List list, LottieComposition lottiecomposition)
	{
		super(lottiedrawable, layer);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #16  <Method void BaseLayer(LottieDrawable, Layer)>
	//    4    6:aload_0         
	//    5    7:new             #18  <Class ArrayList>
	//    6   10:dup             
	//    7   11:invokespecial   #21  <Method void ArrayList()>
	//    8   14:putfield        #23  <Field List layers>
	//    9   17:aload_0         
	//   10   18:new             #25  <Class RectF>
	//   11   21:dup             
	//   12   22:invokespecial   #26  <Method void RectF()>
	//   13   25:putfield        #28  <Field RectF rect>
		LongSparseArray longsparsearray = new LongSparseArray(lottiecomposition.getLayers().size());
	//   14   28:new             #30  <Class LongSparseArray>
	//   15   31:dup             
	//   16   32:aload           4
	//   17   34:invokevirtual   #36  <Method List LottieComposition.getLayers()>
	//   18   37:invokeinterface #42  <Method int List.size()>
	//   19   42:invokespecial   #45  <Method void LongSparseArray(int)>
	//   20   45:astore          8
		int i = list.size() - 1;
	//   21   47:aload_3         
	//   22   48:invokeinterface #42  <Method int List.size()>
	//   23   53:iconst_1        
	//   24   54:isub            
	//   25   55:istore          5
		layer = null;
	//   26   57:aconst_null     
	//   27   58:astore_2        
		int j;
		do
		{
			j = 0;
	//   28   59:iconst_0        
	//   29   60:istore          6
			if(i < 0)
				break;
	//   30   62:iload           5
	//   31   64:iflt            183
			Layer layer1 = (Layer)list.get(i);
	//   32   67:aload_3         
	//   33   68:iload           5
	//   34   70:invokeinterface #49  <Method Object List.get(int)>
	//   35   75:checkcast       #51  <Class Layer>
	//   36   78:astore          9
			BaseLayer baselayer = BaseLayer.forModel(layer1, lottiedrawable, lottiecomposition);
	//   37   80:aload           9
	//   38   82:aload_1         
	//   39   83:aload           4
	//   40   85:invokestatic    #55  <Method BaseLayer BaseLayer.forModel(Layer, LottieDrawable, LottieComposition)>
	//   41   88:astore          7
			longsparsearray.put(baselayer.getLayerModel().getId(), ((Object) (baselayer)));
	//   42   90:aload           8
	//   43   92:aload           7
	//   44   94:invokevirtual   #59  <Method Layer BaseLayer.getLayerModel()>
	//   45   97:invokevirtual   #63  <Method long Layer.getId()>
	//   46  100:aload           7
	//   47  102:invokevirtual   #67  <Method void LongSparseArray.put(long, Object)>
			if(layer != null)
	//*  48  105:aload_2         
	//*  49  106:ifnull          120
			{
				((BaseLayer) (layer)).setMatteLayer(baselayer);
	//   50  109:aload_2         
	//   51  110:aload           7
	//   52  112:invokevirtual   #71  <Method void BaseLayer.setMatteLayer(BaseLayer)>
				layer = null;
	//   53  115:aconst_null     
	//   54  116:astore_2        
			} else
	//*  55  117:goto            174
			{
				layers.add(0, ((Object) (baselayer)));
	//   56  120:aload_0         
	//   57  121:getfield        #23  <Field List layers>
	//   58  124:iconst_0        
	//   59  125:aload           7
	//   60  127:invokeinterface #75  <Method void List.add(int, Object)>
				static class _cls1
				{

					static final int $SwitchMap$com$airbnb$lottie$Layer$MatteType[];

					static 
					{
						$SwitchMap$com$airbnb$lottie$Layer$MatteType = new int[Layer.MatteType.values().length];
					//    0    0:invokestatic    #18  <Method Layer$MatteType[] Layer$MatteType.values()>
					//    1    3:arraylength     
					//    2    4:newarray        int[]
					//    3    6:putstatic       #20  <Field int[] $SwitchMap$com$airbnb$lottie$Layer$MatteType>
						try
						{
							$SwitchMap$com$airbnb$lottie$Layer$MatteType[Layer.MatteType.Add.ordinal()] = 1;
					//    4    9:getstatic       #20  <Field int[] $SwitchMap$com$airbnb$lottie$Layer$MatteType>
					//    5   12:getstatic       #24  <Field Layer$MatteType Layer$MatteType.Add>
					//    6   15:invokevirtual   #28  <Method int Layer$MatteType.ordinal()>
					//    7   18:iconst_1        
					//    8   19:iastore         
						}
					//*   9   20:getstatic       #20  <Field int[] $SwitchMap$com$airbnb$lottie$Layer$MatteType>
					//*  10   23:getstatic       #31  <Field Layer$MatteType Layer$MatteType.Invert>
					//*  11   26:invokevirtual   #28  <Method int Layer$MatteType.ordinal()>
					//*  12   29:iconst_2        
					//*  13   30:iastore         
					//*  14   31:return          
						catch(NoSuchFieldError nosuchfielderror) { }
					//   15   32:astore_0        
						try
						{
							$SwitchMap$com$airbnb$lottie$Layer$MatteType[Layer.MatteType.Invert.ordinal()] = 2;
						}
					//*  16   33:goto            20
						catch(NoSuchFieldError nosuchfielderror1) { }
					//   17   36:astore_0        
					//*  18   37:return          
					}
				}

				switch(_cls1..SwitchMap.com.airbnb.lottie.Layer.MatteType[layer1.getMatteType().ordinal()])
	//*  61  132:getstatic       #79  <Field int[] CompositionLayer$1.$SwitchMap$com$airbnb$lottie$Layer$MatteType>
	//*  62  135:aload           9
	//*  63  137:invokevirtual   #83  <Method Layer$MatteType Layer.getMatteType()>
	//*  64  140:invokevirtual   #88  <Method int Layer$MatteType.ordinal()>
	//*  65  143:iaload          
				{
	//*  66  144:tableswitch     1 2: default 168
	//	               1 171
	//	               2 171
	//*  67  168:goto            174
				case 1: // '\001'
				case 2: // '\002'
					layer = ((Layer) (baselayer));
	//   68  171:aload           7
	//   69  173:astore_2        
					break;
				}
			}
			i--;
	//   70  174:iload           5
	//   71  176:iconst_1        
	//   72  177:isub            
	//   73  178:istore          5
		} while(true);
	//   74  180:goto            59
		for(; j < longsparsearray.size(); j++)
	//*  75  183:iload           6
	//*  76  185:aload           8
	//*  77  187:invokevirtual   #89  <Method int LongSparseArray.size()>
	//*  78  190:icmpge          243
		{
			lottiedrawable = ((LottieDrawable) ((BaseLayer)longsparsearray.get(longsparsearray.keyAt(j))));
	//   79  193:aload           8
	//   80  195:aload           8
	//   81  197:iload           6
	//   82  199:invokevirtual   #93  <Method long LongSparseArray.keyAt(int)>
	//   83  202:invokevirtual   #96  <Method Object LongSparseArray.get(long)>
	//   84  205:checkcast       #4   <Class BaseLayer>
	//   85  208:astore_1        
			layer = ((Layer) ((BaseLayer)longsparsearray.get(((BaseLayer) (lottiedrawable)).getLayerModel().getParentId())));
	//   86  209:aload           8
	//   87  211:aload_1         
	//   88  212:invokevirtual   #59  <Method Layer BaseLayer.getLayerModel()>
	//   89  215:invokevirtual   #99  <Method long Layer.getParentId()>
	//   90  218:invokevirtual   #96  <Method Object LongSparseArray.get(long)>
	//   91  221:checkcast       #4   <Class BaseLayer>
	//   92  224:astore_2        
			if(layer != null)
	//*  93  225:aload_2         
	//*  94  226:ifnull          234
				((BaseLayer) (lottiedrawable)).setParentLayer(((BaseLayer) (layer)));
	//   95  229:aload_1         
	//   96  230:aload_2         
	//   97  231:invokevirtual   #102 <Method void BaseLayer.setParentLayer(BaseLayer)>
		}

	//   98  234:iload           6
	//   99  236:iconst_1        
	//  100  237:iadd            
	//  101  238:istore          6
	//* 102  240:goto            183
	//  103  243:return          
	}

	public void addColorFilter(String s, String s1, ColorFilter colorfilter)
	{
		for(int i = 0; i < layers.size(); i++)
	//*   0    0:iconst_0        
	//*   1    1:istore          4
	//*   2    3:iload           4
	//*   3    5:aload_0         
	//*   4    6:getfield        #23  <Field List layers>
	//*   5    9:invokeinterface #42  <Method int List.size()>
	//*   6   14:icmpge          84
		{
			BaseLayer baselayer = (BaseLayer)layers.get(i);
	//    7   17:aload_0         
	//    8   18:getfield        #23  <Field List layers>
	//    9   21:iload           4
	//   10   23:invokeinterface #49  <Method Object List.get(int)>
	//   11   28:checkcast       #4   <Class BaseLayer>
	//   12   31:astore          5
			String s2 = baselayer.getLayerModel().getName();
	//   13   33:aload           5
	//   14   35:invokevirtual   #59  <Method Layer BaseLayer.getLayerModel()>
	//   15   38:invokevirtual   #112 <Method String Layer.getName()>
	//   16   41:astore          6
			if(s == null)
	//*  17   43:aload_1         
	//*  18   44:ifnonnull       58
			{
				baselayer.addColorFilter(((String) (null)), ((String) (null)), colorfilter);
	//   19   47:aload           5
	//   20   49:aconst_null     
	//   21   50:aconst_null     
	//   22   51:aload_3         
	//   23   52:invokevirtual   #114 <Method void BaseLayer.addColorFilter(String, String, ColorFilter)>
				continue;
	//   24   55:goto            75
			}
			if(s2.equals(((Object) (s))))
	//*  25   58:aload           6
	//*  26   60:aload_1         
	//*  27   61:invokevirtual   #120 <Method boolean String.equals(Object)>
	//*  28   64:ifeq            75
				baselayer.addColorFilter(s, s1, colorfilter);
	//   29   67:aload           5
	//   30   69:aload_1         
	//   31   70:aload_2         
	//   32   71:aload_3         
	//   33   72:invokevirtual   #114 <Method void BaseLayer.addColorFilter(String, String, ColorFilter)>
		}

	//   34   75:iload           4
	//   35   77:iconst_1        
	//   36   78:iadd            
	//   37   79:istore          4
	//*  38   81:goto            3
	//   39   84:return          
	}

	void drawLayer(Canvas canvas, Matrix matrix, int i)
	{
		for(int j = layers.size() - 1; j >= 0; j--)
	//*   0    0:aload_0         
	//*   1    1:getfield        #23  <Field List layers>
	//*   2    4:invokeinterface #42  <Method int List.size()>
	//*   3    9:iconst_1        
	//*   4   10:isub            
	//*   5   11:istore          4
	//*   6   13:iload           4
	//*   7   15:iflt            47
			((BaseLayer)layers.get(j)).draw(canvas, matrix, i);
	//    8   18:aload_0         
	//    9   19:getfield        #23  <Field List layers>
	//   10   22:iload           4
	//   11   24:invokeinterface #49  <Method Object List.get(int)>
	//   12   29:checkcast       #4   <Class BaseLayer>
	//   13   32:aload_1         
	//   14   33:aload_2         
	//   15   34:iload_3         
	//   16   35:invokevirtual   #126 <Method void BaseLayer.draw(Canvas, Matrix, int)>

	//   17   38:iload           4
	//   18   40:iconst_1        
	//   19   41:isub            
	//   20   42:istore          4
	//*  21   44:goto            13
	//   22   47:return          
	}

	public void getBounds(RectF rectf, Matrix matrix)
	{
		super.getBounds(rectf, matrix);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #130 <Method void BaseLayer.getBounds(RectF, Matrix)>
		rect.set(0.0F, 0.0F, 0.0F, 0.0F);
	//    4    6:aload_0         
	//    5    7:getfield        #28  <Field RectF rect>
	//    6   10:fconst_0        
	//    7   11:fconst_0        
	//    8   12:fconst_0        
	//    9   13:fconst_0        
	//   10   14:invokevirtual   #134 <Method void RectF.set(float, float, float, float)>
		for(int i = layers.size() - 1; i >= 0; i--)
	//*  11   17:aload_0         
	//*  12   18:getfield        #23  <Field List layers>
	//*  13   21:invokeinterface #42  <Method int List.size()>
	//*  14   26:iconst_1        
	//*  15   27:isub            
	//*  16   28:istore_3        
	//*  17   29:iload_3         
	//*  18   30:iflt            142
		{
			((BaseLayer)layers.get(i)).getBounds(rect, boundsMatrix);
	//   19   33:aload_0         
	//   20   34:getfield        #23  <Field List layers>
	//   21   37:iload_3         
	//   22   38:invokeinterface #49  <Method Object List.get(int)>
	//   23   43:checkcast       #4   <Class BaseLayer>
	//   24   46:aload_0         
	//   25   47:getfield        #28  <Field RectF rect>
	//   26   50:aload_0         
	//   27   51:getfield        #138 <Field Matrix boundsMatrix>
	//   28   54:invokevirtual   #130 <Method void BaseLayer.getBounds(RectF, Matrix)>
			if(rectf.isEmpty())
	//*  29   57:aload_1         
	//*  30   58:invokevirtual   #142 <Method boolean RectF.isEmpty()>
	//*  31   61:ifeq            75
				rectf.set(rect);
	//   32   64:aload_1         
	//   33   65:aload_0         
	//   34   66:getfield        #28  <Field RectF rect>
	//   35   69:invokevirtual   #145 <Method void RectF.set(RectF)>
			else
	//*  36   72:goto            135
				rectf.set(Math.min(rectf.left, rect.left), Math.min(rectf.top, rect.top), Math.max(rectf.right, rect.right), Math.max(rectf.bottom, rect.bottom));
	//   37   75:aload_1         
	//   38   76:aload_1         
	//   39   77:getfield        #149 <Field float RectF.left>
	//   40   80:aload_0         
	//   41   81:getfield        #28  <Field RectF rect>
	//   42   84:getfield        #149 <Field float RectF.left>
	//   43   87:invokestatic    #155 <Method float Math.min(float, float)>
	//   44   90:aload_1         
	//   45   91:getfield        #158 <Field float RectF.top>
	//   46   94:aload_0         
	//   47   95:getfield        #28  <Field RectF rect>
	//   48   98:getfield        #158 <Field float RectF.top>
	//   49  101:invokestatic    #155 <Method float Math.min(float, float)>
	//   50  104:aload_1         
	//   51  105:getfield        #161 <Field float RectF.right>
	//   52  108:aload_0         
	//   53  109:getfield        #28  <Field RectF rect>
	//   54  112:getfield        #161 <Field float RectF.right>
	//   55  115:invokestatic    #164 <Method float Math.max(float, float)>
	//   56  118:aload_1         
	//   57  119:getfield        #167 <Field float RectF.bottom>
	//   58  122:aload_0         
	//   59  123:getfield        #28  <Field RectF rect>
	//   60  126:getfield        #167 <Field float RectF.bottom>
	//   61  129:invokestatic    #164 <Method float Math.max(float, float)>
	//   62  132:invokevirtual   #134 <Method void RectF.set(float, float, float, float)>
		}

	//   63  135:iload_3         
	//   64  136:iconst_1        
	//   65  137:isub            
	//   66  138:istore_3        
	//*  67  139:goto            29
	//   68  142:return          
	}

	public void setProgress(float f)
	{
		super.setProgress(f);
	//    0    0:aload_0         
	//    1    1:fload_1         
	//    2    2:invokespecial   #178 <Method void BaseLayer.setProgress(float)>
		float f1 = layerModel.getStartProgress();
	//    3    5:aload_0         
	//    4    6:getfield        #182 <Field Layer layerModel>
	//    5    9:invokevirtual   #186 <Method float Layer.getStartProgress()>
	//    6   12:fstore_2        
		for(int i = layers.size() - 1; i >= 0; i--)
	//*   7   13:aload_0         
	//*   8   14:getfield        #23  <Field List layers>
	//*   9   17:invokeinterface #42  <Method int List.size()>
	//*  10   22:iconst_1        
	//*  11   23:isub            
	//*  12   24:istore_3        
	//*  13   25:iload_3         
	//*  14   26:iflt            55
			((BaseLayer)layers.get(i)).setProgress(f - f1);
	//   15   29:aload_0         
	//   16   30:getfield        #23  <Field List layers>
	//   17   33:iload_3         
	//   18   34:invokeinterface #49  <Method Object List.get(int)>
	//   19   39:checkcast       #4   <Class BaseLayer>
	//   20   42:fload_1         
	//   21   43:fload_2         
	//   22   44:fsub            
	//   23   45:invokevirtual   #178 <Method void BaseLayer.setProgress(float)>

	//   24   48:iload_3         
	//   25   49:iconst_1        
	//   26   50:isub            
	//   27   51:istore_3        
	//*  28   52:goto            25
	//   29   55:return          
	}

	private final List layers = new ArrayList();
	private final RectF rect = new RectF();
}
