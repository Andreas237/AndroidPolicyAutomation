// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v7.graphics;

import android.graphics.Bitmap;
import android.os.AsyncTask;
import android.support.v4.g.a;
import android.util.SparseBooleanArray;
import java.util.*;

// Referenced classes of package android.support.v7.graphics:
//			Target

public final class Palette
{

	Palette(List list, List list1)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #44  <Method void Object()>
		mSwatches = list;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #46  <Field List mSwatches>
		mTargets = list1;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #48  <Field List mTargets>
	//    8   14:aload_0         
	//    9   15:new             #50  <Class SparseBooleanArray>
	//   10   18:dup             
	//   11   19:invokespecial   #51  <Method void SparseBooleanArray()>
	//   12   22:putfield        #53  <Field SparseBooleanArray mUsedColors>
	//   13   25:aload_0         
	//   14   26:new             #55  <Class a>
	//   15   29:dup             
	//   16   30:invokespecial   #56  <Method void a()>
	//   17   33:putfield        #58  <Field Map mSelectedSwatches>
	//   18   36:aload_0         
	//   19   37:aload_0         
	//   20   38:invokespecial   #62  <Method Palette$Swatch findDominantSwatch()>
	//   21   41:putfield        #64  <Field Palette$Swatch mDominantSwatch>
	//   22   44:return          
	}

	private Swatch findDominantSwatch()
	{
		int l = mSwatches.size();
	//    0    0:aload_0         
	//    1    1:getfield        #46  <Field List mSwatches>
	//    2    4:invokeinterface #70  <Method int List.size()>
	//    3    9:istore          4
		int j = 0x80000000;
	//    4   11:ldc1            #71  <Int 0x80000000>
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
	//   14   26:getfield        #46  <Field List mSwatches>
	//   15   29:iload_1         
	//   16   30:invokeinterface #75  <Method Object List.get(int)>
	//   17   35:checkcast       #77  <Class Palette$Swatch>
	//   18   38:astore          6
			int k = j;
	//   19   40:iload_2         
	//   20   41:istore_3        
			if(swatch1.getPopulation() > j)
	//*  21   42:aload           6
	//*  22   44:invokevirtual   #80  <Method int Palette$Swatch.getPopulation()>
	//*  23   47:iload_2         
	//*  24   48:icmple          61
			{
				k = swatch1.getPopulation();
	//   25   51:aload           6
	//   26   53:invokevirtual   #80  <Method int Palette$Swatch.getPopulation()>
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
	//    0    0:new             #84  <Class Palette$Builder>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokespecial   #87  <Method void Palette$Builder(Bitmap)>
	//    4    8:areturn         
	}

	public static Palette from(List list)
	{
		return (new Builder(list)).generate();
	//    0    0:new             #84  <Class Palette$Builder>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokespecial   #91  <Method void Palette$Builder(List)>
	//    4    8:invokevirtual   #95  <Method Palette Palette$Builder.generate()>
	//    5   11:areturn         
	}

	public static Palette generate(Bitmap bitmap)
	{
		return from(bitmap).generate();
	//    0    0:aload_0         
	//    1    1:invokestatic    #99  <Method Palette$Builder from(Bitmap)>
	//    2    4:invokevirtual   #95  <Method Palette Palette$Builder.generate()>
	//    3    7:areturn         
	}

	public static Palette generate(Bitmap bitmap, int i)
	{
		return from(bitmap).maximumColorCount(i).generate();
	//    0    0:aload_0         
	//    1    1:invokestatic    #99  <Method Palette$Builder from(Bitmap)>
	//    2    4:iload_1         
	//    3    5:invokevirtual   #105 <Method Palette$Builder Palette$Builder.maximumColorCount(int)>
	//    4    8:invokevirtual   #95  <Method Palette Palette$Builder.generate()>
	//    5   11:areturn         
	}

	public static AsyncTask generateAsync(Bitmap bitmap, int i, PaletteAsyncListener paletteasynclistener)
	{
		return from(bitmap).maximumColorCount(i).generate(paletteasynclistener);
	//    0    0:aload_0         
	//    1    1:invokestatic    #99  <Method Palette$Builder from(Bitmap)>
	//    2    4:iload_1         
	//    3    5:invokevirtual   #105 <Method Palette$Builder Palette$Builder.maximumColorCount(int)>
	//    4    8:aload_2         
	//    5    9:invokevirtual   #110 <Method AsyncTask Palette$Builder.generate(Palette$PaletteAsyncListener)>
	//    6   12:areturn         
	}

	public static AsyncTask generateAsync(Bitmap bitmap, PaletteAsyncListener paletteasynclistener)
	{
		return from(bitmap).generate(paletteasynclistener);
	//    0    0:aload_0         
	//    1    1:invokestatic    #99  <Method Palette$Builder from(Bitmap)>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #110 <Method AsyncTask Palette$Builder.generate(Palette$PaletteAsyncListener)>
	//    4    8:areturn         
	}

	private float generateScore(Swatch swatch, Target target)
	{
		float af[] = swatch.getHsl();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #117 <Method float[] Palette$Swatch.getHsl()>
	//    2    4:astore          7
		Swatch swatch1 = mDominantSwatch;
	//    3    6:aload_0         
	//    4    7:getfield        #64  <Field Palette$Swatch mDominantSwatch>
	//    5   10:astore          8
		int i;
		if(swatch1 != null)
	//*   6   12:aload           8
	//*   7   14:ifnull          27
			i = swatch1.getPopulation();
	//    8   17:aload           8
	//    9   19:invokevirtual   #80  <Method int Palette$Swatch.getPopulation()>
	//   10   22:istore          6
		else
	//*  11   24:goto            30
			i = 1;
	//   12   27:iconst_1        
	//   13   28:istore          6
		float f = target.getSaturationWeight();
	//   14   30:aload_2         
	//   15   31:invokevirtual   #123 <Method float Target.getSaturationWeight()>
	//   16   34:fstore_3        
		float f2 = 0.0F;
	//   17   35:fconst_0        
	//   18   36:fstore          5
		if(f > 0.0F)
	//*  19   38:fload_3         
	//*  20   39:fconst_0        
	//*  21   40:fcmpl           
	//*  22   41:ifle            69
		{
			f = target.getSaturationWeight();
	//   23   44:aload_2         
	//   24   45:invokevirtual   #123 <Method float Target.getSaturationWeight()>
	//   25   48:fstore_3        
			f = (1.0F - Math.abs(af[1] - target.getTargetSaturation())) * f;
	//   26   49:fconst_1        
	//   27   50:aload           7
	//   28   52:iconst_1        
	//   29   53:faload          
	//   30   54:aload_2         
	//   31   55:invokevirtual   #126 <Method float Target.getTargetSaturation()>
	//   32   58:fsub            
	//   33   59:invokestatic    #132 <Method float Math.abs(float)>
	//   34   62:fsub            
	//   35   63:fload_3         
	//   36   64:fmul            
	//   37   65:fstore_3        
		} else
	//*  38   66:goto            71
		{
			f = 0.0F;
	//   39   69:fconst_0        
	//   40   70:fstore_3        
		}
		float f1;
		if(target.getLightnessWeight() > 0.0F)
	//*  41   71:aload_2         
	//*  42   72:invokevirtual   #135 <Method float Target.getLightnessWeight()>
	//*  43   75:fconst_0        
	//*  44   76:fcmpl           
	//*  45   77:ifle            104
			f1 = target.getLightnessWeight() * (1.0F - Math.abs(af[2] - target.getTargetLightness()));
	//   46   80:aload_2         
	//   47   81:invokevirtual   #135 <Method float Target.getLightnessWeight()>
	//   48   84:fconst_1        
	//   49   85:aload           7
	//   50   87:iconst_2        
	//   51   88:faload          
	//   52   89:aload_2         
	//   53   90:invokevirtual   #138 <Method float Target.getTargetLightness()>
	//   54   93:fsub            
	//   55   94:invokestatic    #132 <Method float Math.abs(float)>
	//   56   97:fsub            
	//   57   98:fmul            
	//   58   99:fstore          4
		else
	//*  59  101:goto            107
			f1 = 0.0F;
	//   60  104:fconst_0        
	//   61  105:fstore          4
		if(target.getPopulationWeight() > 0.0F)
	//*  62  107:aload_2         
	//*  63  108:invokevirtual   #141 <Method float Target.getPopulationWeight()>
	//*  64  111:fconst_0        
	//*  65  112:fcmpl           
	//*  66  113:ifle            132
			f2 = target.getPopulationWeight() * ((float)swatch.getPopulation() / (float)i);
	//   67  116:aload_2         
	//   68  117:invokevirtual   #141 <Method float Target.getPopulationWeight()>
	//   69  120:aload_1         
	//   70  121:invokevirtual   #80  <Method int Palette$Swatch.getPopulation()>
	//   71  124:i2f             
	//   72  125:iload           6
	//   73  127:i2f             
	//   74  128:fdiv            
	//   75  129:fmul            
	//   76  130:fstore          5
		return f + f1 + f2;
	//   77  132:fload_3         
	//   78  133:fload           4
	//   79  135:fadd            
	//   80  136:fload           5
	//   81  138:fadd            
	//   82  139:freturn         
	}

	private Swatch generateScoredTarget(Target target)
	{
		Swatch swatch = getMaxScoredSwatchForTarget(target);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #146 <Method Palette$Swatch getMaxScoredSwatchForTarget(Target)>
	//    3    5:astore_2        
		if(swatch != null && target.isExclusive())
	//*   4    6:aload_2         
	//*   5    7:ifnull          29
	//*   6   10:aload_1         
	//*   7   11:invokevirtual   #150 <Method boolean Target.isExclusive()>
	//*   8   14:ifeq            29
			mUsedColors.append(swatch.getRgb(), true);
	//    9   17:aload_0         
	//   10   18:getfield        #53  <Field SparseBooleanArray mUsedColors>
	//   11   21:aload_2         
	//   12   22:invokevirtual   #153 <Method int Palette$Swatch.getRgb()>
	//   13   25:iconst_1        
	//   14   26:invokevirtual   #157 <Method void SparseBooleanArray.append(int, boolean)>
		return swatch;
	//   15   29:aload_2         
	//   16   30:areturn         
	}

	private Swatch getMaxScoredSwatchForTarget(Target target)
	{
		int j = mSwatches.size();
	//    0    0:aload_0         
	//    1    1:getfield        #46  <Field List mSwatches>
	//    2    4:invokeinterface #70  <Method int List.size()>
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
	//   14   27:getfield        #46  <Field List mSwatches>
	//   15   30:iload           5
	//   16   32:invokeinterface #75  <Method Object List.get(int)>
	//   17   37:checkcast       #77  <Class Palette$Swatch>
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
	//   26   52:invokespecial   #161 <Method boolean shouldBeScoredForTarget(Palette$Swatch, Target)>
	//   27   55:ifeq            92
				float f2 = generateScore(swatch2, target);
	//   28   58:aload_0         
	//   29   59:aload           9
	//   30   61:aload_1         
	//   31   62:invokespecial   #163 <Method float generateScore(Palette$Swatch, Target)>
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
	//    1    1:invokevirtual   #117 <Method float[] Palette$Swatch.getHsl()>
	//    2    4:astore_3        
		return af[1] >= target.getMinimumSaturation() && af[1] <= target.getMaximumSaturation() && af[2] >= target.getMinimumLightness() && af[2] <= target.getMaximumLightness() && !mUsedColors.get(swatch.getRgb());
	//    3    5:aload_3         
	//    4    6:iconst_1        
	//    5    7:faload          
	//    6    8:aload_2         
	//    7    9:invokevirtual   #166 <Method float Target.getMinimumSaturation()>
	//    8   12:fcmpl           
	//    9   13:iflt            65
	//   10   16:aload_3         
	//   11   17:iconst_1        
	//   12   18:faload          
	//   13   19:aload_2         
	//   14   20:invokevirtual   #169 <Method float Target.getMaximumSaturation()>
	//   15   23:fcmpg           
	//   16   24:ifgt            65
	//   17   27:aload_3         
	//   18   28:iconst_2        
	//   19   29:faload          
	//   20   30:aload_2         
	//   21   31:invokevirtual   #172 <Method float Target.getMinimumLightness()>
	//   22   34:fcmpl           
	//   23   35:iflt            65
	//   24   38:aload_3         
	//   25   39:iconst_2        
	//   26   40:faload          
	//   27   41:aload_2         
	//   28   42:invokevirtual   #175 <Method float Target.getMaximumLightness()>
	//   29   45:fcmpg           
	//   30   46:ifgt            65
	//   31   49:aload_0         
	//   32   50:getfield        #53  <Field SparseBooleanArray mUsedColors>
	//   33   53:aload_1         
	//   34   54:invokevirtual   #153 <Method int Palette$Swatch.getRgb()>
	//   35   57:invokevirtual   #178 <Method boolean SparseBooleanArray.get(int)>
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
	//    1    1:getfield        #48  <Field List mTargets>
	//    2    4:invokeinterface #70  <Method int List.size()>
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
	//   10   18:getfield        #48  <Field List mTargets>
	//   11   21:iload_1         
	//   12   22:invokeinterface #75  <Method Object List.get(int)>
	//   13   27:checkcast       #119 <Class Target>
	//   14   30:astore_3        
			target.normalizeWeights();
	//   15   31:aload_3         
	//   16   32:invokevirtual   #181 <Method void Target.normalizeWeights()>
			mSelectedSwatches.put(((Object) (target)), ((Object) (generateScoredTarget(target))));
	//   17   35:aload_0         
	//   18   36:getfield        #58  <Field Map mSelectedSwatches>
	//   19   39:aload_3         
	//   20   40:aload_0         
	//   21   41:aload_3         
	//   22   42:invokespecial   #183 <Method Palette$Swatch generateScoredTarget(Target)>
	//   23   45:invokeinterface #189 <Method Object Map.put(Object, Object)>
	//   24   50:pop             
		}

	//   25   51:iload_1         
	//   26   52:iconst_1        
	//   27   53:iadd            
	//   28   54:istore_1        
	//*  29   55:goto            12
		mUsedColors.clear();
	//   30   58:aload_0         
	//   31   59:getfield        #53  <Field SparseBooleanArray mUsedColors>
	//   32   62:invokevirtual   #192 <Method void SparseBooleanArray.clear()>
	//   33   65:return          
	}

	public int getColorForTarget(Target target, int i)
	{
		target = ((Target) (getSwatchForTarget(target)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #197 <Method Palette$Swatch getSwatchForTarget(Target)>
	//    3    5:astore_1        
		if(target != null)
	//*   4    6:aload_1         
	//*   5    7:ifnull          15
			i = ((Swatch) (target)).getRgb();
	//    6   10:aload_1         
	//    7   11:invokevirtual   #153 <Method int Palette$Swatch.getRgb()>
	//    8   14:istore_2        
		return i;
	//    9   15:iload_2         
	//   10   16:ireturn         
	}

	public int getDarkMutedColor(int i)
	{
		return getColorForTarget(Target.DARK_MUTED, i);
	//    0    0:aload_0         
	//    1    1:getstatic       #203 <Field Target Target.DARK_MUTED>
	//    2    4:iload_1         
	//    3    5:invokevirtual   #205 <Method int getColorForTarget(Target, int)>
	//    4    8:ireturn         
	}

	public Swatch getDarkMutedSwatch()
	{
		return getSwatchForTarget(Target.DARK_MUTED);
	//    0    0:aload_0         
	//    1    1:getstatic       #203 <Field Target Target.DARK_MUTED>
	//    2    4:invokevirtual   #197 <Method Palette$Swatch getSwatchForTarget(Target)>
	//    3    7:areturn         
	}

	public int getDarkVibrantColor(int i)
	{
		return getColorForTarget(Target.DARK_VIBRANT, i);
	//    0    0:aload_0         
	//    1    1:getstatic       #210 <Field Target Target.DARK_VIBRANT>
	//    2    4:iload_1         
	//    3    5:invokevirtual   #205 <Method int getColorForTarget(Target, int)>
	//    4    8:ireturn         
	}

	public Swatch getDarkVibrantSwatch()
	{
		return getSwatchForTarget(Target.DARK_VIBRANT);
	//    0    0:aload_0         
	//    1    1:getstatic       #210 <Field Target Target.DARK_VIBRANT>
	//    2    4:invokevirtual   #197 <Method Palette$Swatch getSwatchForTarget(Target)>
	//    3    7:areturn         
	}

	public int getDominantColor(int i)
	{
		Swatch swatch = mDominantSwatch;
	//    0    0:aload_0         
	//    1    1:getfield        #64  <Field Palette$Swatch mDominantSwatch>
	//    2    4:astore_2        
		if(swatch != null)
	//*   3    5:aload_2         
	//*   4    6:ifnull          14
			i = swatch.getRgb();
	//    5    9:aload_2         
	//    6   10:invokevirtual   #153 <Method int Palette$Swatch.getRgb()>
	//    7   13:istore_1        
		return i;
	//    8   14:iload_1         
	//    9   15:ireturn         
	}

	public Swatch getDominantSwatch()
	{
		return mDominantSwatch;
	//    0    0:aload_0         
	//    1    1:getfield        #64  <Field Palette$Swatch mDominantSwatch>
	//    2    4:areturn         
	}

	public int getLightMutedColor(int i)
	{
		return getColorForTarget(Target.LIGHT_MUTED, i);
	//    0    0:aload_0         
	//    1    1:getstatic       #217 <Field Target Target.LIGHT_MUTED>
	//    2    4:iload_1         
	//    3    5:invokevirtual   #205 <Method int getColorForTarget(Target, int)>
	//    4    8:ireturn         
	}

	public Swatch getLightMutedSwatch()
	{
		return getSwatchForTarget(Target.LIGHT_MUTED);
	//    0    0:aload_0         
	//    1    1:getstatic       #217 <Field Target Target.LIGHT_MUTED>
	//    2    4:invokevirtual   #197 <Method Palette$Swatch getSwatchForTarget(Target)>
	//    3    7:areturn         
	}

	public int getLightVibrantColor(int i)
	{
		return getColorForTarget(Target.LIGHT_VIBRANT, i);
	//    0    0:aload_0         
	//    1    1:getstatic       #222 <Field Target Target.LIGHT_VIBRANT>
	//    2    4:iload_1         
	//    3    5:invokevirtual   #205 <Method int getColorForTarget(Target, int)>
	//    4    8:ireturn         
	}

	public Swatch getLightVibrantSwatch()
	{
		return getSwatchForTarget(Target.LIGHT_VIBRANT);
	//    0    0:aload_0         
	//    1    1:getstatic       #222 <Field Target Target.LIGHT_VIBRANT>
	//    2    4:invokevirtual   #197 <Method Palette$Swatch getSwatchForTarget(Target)>
	//    3    7:areturn         
	}

	public int getMutedColor(int i)
	{
		return getColorForTarget(Target.MUTED, i);
	//    0    0:aload_0         
	//    1    1:getstatic       #227 <Field Target Target.MUTED>
	//    2    4:iload_1         
	//    3    5:invokevirtual   #205 <Method int getColorForTarget(Target, int)>
	//    4    8:ireturn         
	}

	public Swatch getMutedSwatch()
	{
		return getSwatchForTarget(Target.MUTED);
	//    0    0:aload_0         
	//    1    1:getstatic       #227 <Field Target Target.MUTED>
	//    2    4:invokevirtual   #197 <Method Palette$Swatch getSwatchForTarget(Target)>
	//    3    7:areturn         
	}

	public Swatch getSwatchForTarget(Target target)
	{
		return (Swatch)mSelectedSwatches.get(((Object) (target)));
	//    0    0:aload_0         
	//    1    1:getfield        #58  <Field Map mSelectedSwatches>
	//    2    4:aload_1         
	//    3    5:invokeinterface #231 <Method Object Map.get(Object)>
	//    4   10:checkcast       #77  <Class Palette$Swatch>
	//    5   13:areturn         
	}

	public List getSwatches()
	{
		return Collections.unmodifiableList(mSwatches);
	//    0    0:aload_0         
	//    1    1:getfield        #46  <Field List mSwatches>
	//    2    4:invokestatic    #239 <Method List Collections.unmodifiableList(List)>
	//    3    7:areturn         
	}

	public List getTargets()
	{
		return Collections.unmodifiableList(mTargets);
	//    0    0:aload_0         
	//    1    1:getfield        #48  <Field List mTargets>
	//    2    4:invokestatic    #239 <Method List Collections.unmodifiableList(List)>
	//    3    7:areturn         
	}

	public int getVibrantColor(int i)
	{
		return getColorForTarget(Target.VIBRANT, i);
	//    0    0:aload_0         
	//    1    1:getstatic       #244 <Field Target Target.VIBRANT>
	//    2    4:iload_1         
	//    3    5:invokevirtual   #205 <Method int getColorForTarget(Target, int)>
	//    4    8:ireturn         
	}

	public Swatch getVibrantSwatch()
	{
		return getSwatchForTarget(Target.VIBRANT);
	//    0    0:aload_0         
	//    1    1:getstatic       #244 <Field Target Target.VIBRANT>
	//    2    4:invokevirtual   #197 <Method Palette$Swatch getSwatchForTarget(Target)>
	//    3    7:areturn         
	}

	static final int DEFAULT_CALCULATE_NUMBER_COLORS = 16;
	static final Filter DEFAULT_FILTER = new _cls1();
	static final int DEFAULT_RESIZE_BITMAP_AREA = 12544;
	static final String LOG_TAG = "Palette";
	static final boolean LOG_TIMINGS = false;
	static final float MIN_CONTRAST_BODY_TEXT = 4.5F;
	static final float MIN_CONTRAST_TITLE_TEXT = 3F;
	private final Swatch mDominantSwatch = findDominantSwatch();
	private final Map mSelectedSwatches = new a();
	private final List mSwatches;
	private final List mTargets;
	private final SparseBooleanArray mUsedColors = new SparseBooleanArray();

	static 
	{
	//    0    0:new             #36  <Class Palette$1>
	//    1    3:dup             
	//    2    4:invokespecial   #39  <Method void Palette$1()>
	//    3    7:putstatic       #41  <Field Palette$Filter DEFAULT_FILTER>
	//*   4   10:return          
	}

	private class Swatch
	{

		private void ensureTextColorsGenerated()
		{
			if(!mGeneratedTextColors)
		//*   0    0:aload_0         
		//*   1    1:getfield        #63  <Field boolean mGeneratedTextColors>
		//*   2    4:ifne            184
			{
				int i = android.support.v4.graphics.a.a(-1, mRgb, 4.5F);
		//    3    7:iconst_m1       
		//    4    8:aload_0         
		//    5    9:getfield        #41  <Field int mRgb>
		//    6   12:ldc1            #64  <Float 4.5F>
		//    7   14:invokestatic    #67  <Method int android.support.v4.graphics.a.a(int, int, float)>
		//    8   17:istore_1        
				int j = android.support.v4.graphics.a.a(-1, mRgb, 3F);
		//    9   18:iconst_m1       
		//   10   19:aload_0         
		//   11   20:getfield        #41  <Field int mRgb>
		//   12   23:ldc1            #68  <Float 3F>
		//   13   25:invokestatic    #67  <Method int android.support.v4.graphics.a.a(int, int, float)>
		//   14   28:istore_2        
				if(i != -1 && j != -1)
		//*  15   29:iload_1         
		//*  16   30:iconst_m1       
		//*  17   31:icmpeq          63
		//*  18   34:iload_2         
		//*  19   35:iconst_m1       
		//*  20   36:icmpeq          63
				{
					mBodyTextColor = android.support.v4.graphics.a.c(-1, i);
		//   21   39:aload_0         
		//   22   40:iconst_m1       
		//   23   41:iload_1         
		//   24   42:invokestatic    #72  <Method int android.support.v4.graphics.a.c(int, int)>
		//   25   45:putfield        #74  <Field int mBodyTextColor>
					mTitleTextColor = android.support.v4.graphics.a.c(-1, j);
		//   26   48:aload_0         
		//   27   49:iconst_m1       
		//   28   50:iload_2         
		//   29   51:invokestatic    #72  <Method int android.support.v4.graphics.a.c(int, int)>
		//   30   54:putfield        #76  <Field int mTitleTextColor>
					mGeneratedTextColors = true;
		//   31   57:aload_0         
		//   32   58:iconst_1        
		//   33   59:putfield        #63  <Field boolean mGeneratedTextColors>
					return;
		//   34   62:return          
				}
				int l = android.support.v4.graphics.a.a(0xff000000, mRgb, 4.5F);
		//   35   63:ldc1            #77  <Int 0xff000000>
		//   36   65:aload_0         
		//   37   66:getfield        #41  <Field int mRgb>
		//   38   69:ldc1            #64  <Float 4.5F>
		//   39   71:invokestatic    #67  <Method int android.support.v4.graphics.a.a(int, int, float)>
		//   40   74:istore          4
				int k = android.support.v4.graphics.a.a(0xff000000, mRgb, 3F);
		//   41   76:ldc1            #77  <Int 0xff000000>
		//   42   78:aload_0         
		//   43   79:getfield        #41  <Field int mRgb>
		//   44   82:ldc1            #68  <Float 3F>
		//   45   84:invokestatic    #67  <Method int android.support.v4.graphics.a.a(int, int, float)>
		//   46   87:istore_3        
				if(l != -1 && k != -1)
		//*  47   88:iload           4
		//*  48   90:iconst_m1       
		//*  49   91:icmpeq          126
		//*  50   94:iload_3         
		//*  51   95:iconst_m1       
		//*  52   96:icmpeq          126
				{
					mBodyTextColor = android.support.v4.graphics.a.c(0xff000000, l);
		//   53   99:aload_0         
		//   54  100:ldc1            #77  <Int 0xff000000>
		//   55  102:iload           4
		//   56  104:invokestatic    #72  <Method int android.support.v4.graphics.a.c(int, int)>
		//   57  107:putfield        #74  <Field int mBodyTextColor>
					mTitleTextColor = android.support.v4.graphics.a.c(0xff000000, k);
		//   58  110:aload_0         
		//   59  111:ldc1            #77  <Int 0xff000000>
		//   60  113:iload_3         
		//   61  114:invokestatic    #72  <Method int android.support.v4.graphics.a.c(int, int)>
		//   62  117:putfield        #76  <Field int mTitleTextColor>
					mGeneratedTextColors = true;
		//   63  120:aload_0         
		//   64  121:iconst_1        
		//   65  122:putfield        #63  <Field boolean mGeneratedTextColors>
					return;
		//   66  125:return          
				}
				if(i != -1)
		//*  67  126:iload_1         
		//*  68  127:iconst_m1       
		//*  69  128:icmpeq          140
					i = android.support.v4.graphics.a.c(-1, i);
		//   70  131:iconst_m1       
		//   71  132:iload_1         
		//   72  133:invokestatic    #72  <Method int android.support.v4.graphics.a.c(int, int)>
		//   73  136:istore_1        
				else
		//*  74  137:goto            148
					i = android.support.v4.graphics.a.c(0xff000000, l);
		//   75  140:ldc1            #77  <Int 0xff000000>
		//   76  142:iload           4
		//   77  144:invokestatic    #72  <Method int android.support.v4.graphics.a.c(int, int)>
		//   78  147:istore_1        
				mBodyTextColor = i;
		//   79  148:aload_0         
		//   80  149:iload_1         
		//   81  150:putfield        #74  <Field int mBodyTextColor>
				if(j != -1)
		//*  82  153:iload_2         
		//*  83  154:iconst_m1       
		//*  84  155:icmpeq          167
					i = android.support.v4.graphics.a.c(-1, j);
		//   85  158:iconst_m1       
		//   86  159:iload_2         
		//   87  160:invokestatic    #72  <Method int android.support.v4.graphics.a.c(int, int)>
		//   88  163:istore_1        
				else
		//*  89  164:goto            174
					i = android.support.v4.graphics.a.c(0xff000000, k);
		//   90  167:ldc1            #77  <Int 0xff000000>
		//   91  169:iload_3         
		//   92  170:invokestatic    #72  <Method int android.support.v4.graphics.a.c(int, int)>
		//   93  173:istore_1        
				mTitleTextColor = i;
		//   94  174:aload_0         
		//   95  175:iload_1         
		//   96  176:putfield        #76  <Field int mTitleTextColor>
				mGeneratedTextColors = true;
		//   97  179:aload_0         
		//   98  180:iconst_1        
		//   99  181:putfield        #63  <Field boolean mGeneratedTextColors>
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
		//*   8   12:invokevirtual   #83  <Method Class Object.getClass()>
		//*   9   15:aload_1         
		//*  10   16:invokevirtual   #83  <Method Class Object.getClass()>
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
		//   18   30:getfield        #43  <Field int mPopulation>
		//   19   33:aload_1         
		//   20   34:getfield        #43  <Field int mPopulation>
		//   21   37:icmpne          53
		//   22   40:aload_0         
		//   23   41:getfield        #41  <Field int mRgb>
		//   24   44:aload_1         
		//   25   45:getfield        #41  <Field int mRgb>
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
		//    1    1:invokespecial   #87  <Method void ensureTextColorsGenerated()>
			return mBodyTextColor;
		//    2    4:aload_0         
		//    3    5:getfield        #74  <Field int mBodyTextColor>
		//    4    8:ireturn         
		}

		public float[] getHsl()
		{
			if(mHsl == null)
		//*   0    0:aload_0         
		//*   1    1:getfield        #60  <Field float[] mHsl>
		//*   2    4:ifnonnull       14
				mHsl = new float[3];
		//    3    7:aload_0         
		//    4    8:iconst_3        
		//    5    9:newarray        float[]
		//    6   11:putfield        #60  <Field float[] mHsl>
			android.support.v4.graphics.a.a(mRed, mGreen, mBlue, mHsl);
		//    7   14:aload_0         
		//    8   15:getfield        #29  <Field int mRed>
		//    9   18:aload_0         
		//   10   19:getfield        #34  <Field int mGreen>
		//   11   22:aload_0         
		//   12   23:getfield        #39  <Field int mBlue>
		//   13   26:aload_0         
		//   14   27:getfield        #60  <Field float[] mHsl>
		//   15   30:invokestatic    #92  <Method void android.support.v4.graphics.a.a(int, int, int, float[])>
			return mHsl;
		//   16   33:aload_0         
		//   17   34:getfield        #60  <Field float[] mHsl>
		//   18   37:areturn         
		}

		public int getPopulation()
		{
			return mPopulation;
		//    0    0:aload_0         
		//    1    1:getfield        #43  <Field int mPopulation>
		//    2    4:ireturn         
		}

		public int getRgb()
		{
			return mRgb;
		//    0    0:aload_0         
		//    1    1:getfield        #41  <Field int mRgb>
		//    2    4:ireturn         
		}

		public int getTitleTextColor()
		{
			ensureTextColorsGenerated();
		//    0    0:aload_0         
		//    1    1:invokespecial   #87  <Method void ensureTextColorsGenerated()>
			return mTitleTextColor;
		//    2    4:aload_0         
		//    3    5:getfield        #76  <Field int mTitleTextColor>
		//    4    8:ireturn         
		}

		public int hashCode()
		{
			return mRgb * 31 + mPopulation;
		//    0    0:aload_0         
		//    1    1:getfield        #41  <Field int mRgb>
		//    2    4:bipush          31
		//    3    6:imul            
		//    4    7:aload_0         
		//    5    8:getfield        #43  <Field int mPopulation>
		//    6   11:iadd            
		//    7   12:ireturn         
		}

		public String toString()
		{
			StringBuilder stringbuilder = new StringBuilder(((Object)this).getClass().getSimpleName());
		//    0    0:new             #100 <Class StringBuilder>
		//    1    3:dup             
		//    2    4:aload_0         
		//    3    5:invokevirtual   #83  <Method Class Object.getClass()>
		//    4    8:invokevirtual   #105 <Method String Class.getSimpleName()>
		//    5   11:invokespecial   #108 <Method void StringBuilder(String)>
		//    6   14:astore_1        
			stringbuilder.append(" [RGB: #");
		//    7   15:aload_1         
		//    8   16:ldc1            #110 <String " [RGB: #">
		//    9   18:invokevirtual   #114 <Method StringBuilder StringBuilder.append(String)>
		//   10   21:pop             
			stringbuilder.append(Integer.toHexString(getRgb()));
		//   11   22:aload_1         
		//   12   23:aload_0         
		//   13   24:invokevirtual   #116 <Method int getRgb()>
		//   14   27:invokestatic    #122 <Method String Integer.toHexString(int)>
		//   15   30:invokevirtual   #114 <Method StringBuilder StringBuilder.append(String)>
		//   16   33:pop             
			stringbuilder.append(']');
		//   17   34:aload_1         
		//   18   35:bipush          93
		//   19   37:invokevirtual   #125 <Method StringBuilder StringBuilder.append(char)>
		//   20   40:pop             
			stringbuilder.append(" [HSL: ");
		//   21   41:aload_1         
		//   22   42:ldc1            #127 <String " [HSL: ">
		//   23   44:invokevirtual   #114 <Method StringBuilder StringBuilder.append(String)>
		//   24   47:pop             
			stringbuilder.append(Arrays.toString(getHsl()));
		//   25   48:aload_1         
		//   26   49:aload_0         
		//   27   50:invokevirtual   #129 <Method float[] getHsl()>
		//   28   53:invokestatic    #134 <Method String Arrays.toString(float[])>
		//   29   56:invokevirtual   #114 <Method StringBuilder StringBuilder.append(String)>
		//   30   59:pop             
			stringbuilder.append(']');
		//   31   60:aload_1         
		//   32   61:bipush          93
		//   33   63:invokevirtual   #125 <Method StringBuilder StringBuilder.append(char)>
		//   34   66:pop             
			stringbuilder.append(" [Population: ");
		//   35   67:aload_1         
		//   36   68:ldc1            #136 <String " [Population: ">
		//   37   70:invokevirtual   #114 <Method StringBuilder StringBuilder.append(String)>
		//   38   73:pop             
			stringbuilder.append(mPopulation);
		//   39   74:aload_1         
		//   40   75:aload_0         
		//   41   76:getfield        #43  <Field int mPopulation>
		//   42   79:invokevirtual   #139 <Method StringBuilder StringBuilder.append(int)>
		//   43   82:pop             
			stringbuilder.append(']');
		//   44   83:aload_1         
		//   45   84:bipush          93
		//   46   86:invokevirtual   #125 <Method StringBuilder StringBuilder.append(char)>
		//   47   89:pop             
			stringbuilder.append(" [Title Text: #");
		//   48   90:aload_1         
		//   49   91:ldc1            #141 <String " [Title Text: #">
		//   50   93:invokevirtual   #114 <Method StringBuilder StringBuilder.append(String)>
		//   51   96:pop             
			stringbuilder.append(Integer.toHexString(getTitleTextColor()));
		//   52   97:aload_1         
		//   53   98:aload_0         
		//   54   99:invokevirtual   #143 <Method int getTitleTextColor()>
		//   55  102:invokestatic    #122 <Method String Integer.toHexString(int)>
		//   56  105:invokevirtual   #114 <Method StringBuilder StringBuilder.append(String)>
		//   57  108:pop             
			stringbuilder.append(']');
		//   58  109:aload_1         
		//   59  110:bipush          93
		//   60  112:invokevirtual   #125 <Method StringBuilder StringBuilder.append(char)>
		//   61  115:pop             
			stringbuilder.append(" [Body Text: #");
		//   62  116:aload_1         
		//   63  117:ldc1            #145 <String " [Body Text: #">
		//   64  119:invokevirtual   #114 <Method StringBuilder StringBuilder.append(String)>
		//   65  122:pop             
			stringbuilder.append(Integer.toHexString(getBodyTextColor()));
		//   66  123:aload_1         
		//   67  124:aload_0         
		//   68  125:invokevirtual   #147 <Method int getBodyTextColor()>
		//   69  128:invokestatic    #122 <Method String Integer.toHexString(int)>
		//   70  131:invokevirtual   #114 <Method StringBuilder StringBuilder.append(String)>
		//   71  134:pop             
			stringbuilder.append(']');
		//   72  135:aload_1         
		//   73  136:bipush          93
		//   74  138:invokevirtual   #125 <Method StringBuilder StringBuilder.append(char)>
		//   75  141:pop             
			return stringbuilder.toString();
		//   76  142:aload_1         
		//   77  143:invokevirtual   #149 <Method String StringBuilder.toString()>
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
		//    1    1:invokespecial   #21  <Method void Object()>
			mRed = Color.red(i);
		//    2    4:aload_0         
		//    3    5:iload_1         
		//    4    6:invokestatic    #27  <Method int Color.red(int)>
		//    5    9:putfield        #29  <Field int mRed>
			mGreen = Color.green(i);
		//    6   12:aload_0         
		//    7   13:iload_1         
		//    8   14:invokestatic    #32  <Method int Color.green(int)>
		//    9   17:putfield        #34  <Field int mGreen>
			mBlue = Color.blue(i);
		//   10   20:aload_0         
		//   11   21:iload_1         
		//   12   22:invokestatic    #37  <Method int Color.blue(int)>
		//   13   25:putfield        #39  <Field int mBlue>
			mRgb = i;
		//   14   28:aload_0         
		//   15   29:iload_1         
		//   16   30:putfield        #41  <Field int mRgb>
			mPopulation = j;
		//   17   33:aload_0         
		//   18   34:iload_2         
		//   19   35:putfield        #43  <Field int mPopulation>
		//   20   38:return          
		}

		Swatch(int i, int j, int k, int l)
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #21  <Method void Object()>
			mRed = i;
		//    2    4:aload_0         
		//    3    5:iload_1         
		//    4    6:putfield        #29  <Field int mRed>
			mGreen = j;
		//    5    9:aload_0         
		//    6   10:iload_2         
		//    7   11:putfield        #34  <Field int mGreen>
			mBlue = k;
		//    8   14:aload_0         
		//    9   15:iload_3         
		//   10   16:putfield        #39  <Field int mBlue>
			mRgb = Color.rgb(i, j, k);
		//   11   19:aload_0         
		//   12   20:iload_1         
		//   13   21:iload_2         
		//   14   22:iload_3         
		//   15   23:invokestatic    #49  <Method int Color.rgb(int, int, int)>
		//   16   26:putfield        #41  <Field int mRgb>
			mPopulation = l;
		//   17   29:aload_0         
		//   18   30:iload           4
		//   19   32:putfield        #43  <Field int mPopulation>
		//   20   35:return          
		}

		Swatch(float af[], int i)
		{
			this(android.support.v4.graphics.a.a(af), i);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokestatic    #56  <Method int android.support.v4.graphics.a.a(float[])>
		//    3    5:iload_2         
		//    4    6:invokespecial   #58  <Method void Palette$Swatch(int, int)>
			mHsl = af;
		//    5    9:aload_0         
		//    6   10:aload_1         
		//    7   11:putfield        #60  <Field float[] mHsl>
		//    8   14:return          
		}
	}


	private class Builder
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

		public Builder addFilter(Filter filter)
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

		public Builder addTarget(Target target)
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

		public Builder clearFilters()
		{
			mFilters.clear();
		//    0    0:aload_0         
		//    1    1:getfield        #34  <Field List mFilters>
		//    2    4:invokeinterface #165 <Method void List.clear()>
			return this;
		//    3    9:aload_0         
		//    4   10:areturn         
		}

		public Builder clearRegion()
		{
			mRegion = null;
		//    0    0:aload_0         
		//    1    1:aconst_null     
		//    2    2:putfield        #106 <Field Rect mRegion>
			return this;
		//    3    5:aload_0         
		//    4    6:areturn         
		}

		public Builder clearTargets()
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

		public AsyncTask generate(final PaletteAsyncListener listener)
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

				final Builder this$0;
				final PaletteAsyncListener val$listener;

				_cls1()
				{
					this$0 = Builder.this;
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

				private class PaletteAsyncListener
				{

					public abstract void onGenerated(Palette palette);
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
					Filter afilter[];
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
						afilter = ((Filter []) (mFilters));
		//  113  213:aload_0         
		//  114  214:getfield        #34  <Field List mFilters>
		//  115  217:astore          6
						afilter = (Filter[])((List) (afilter)).toArray(((Object []) (new Filter[((List) (afilter)).size()])));
		//  116  219:aload           6
		//  117  221:aload           6
		//  118  223:invokeinterface #206 <Method int List.size()>
		//  119  228:anewarray       Filter[]
		//  120  231:invokeinterface #212 <Method Object[] List.toArray(Object[])>
		//  121  236:checkcast       #214 <Class Palette$Filter[]>
		//  122  239:astore          6
					}
					afilter = ((Filter []) (new ColorCutQuantizer(ai, i, afilter)));
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
					afilter = ((Filter []) (((ColorCutQuantizer) (afilter)).getQuantizedColors()));
		//  136  270:aload           6
		//  137  272:invokevirtual   #226 <Method List ColorCutQuantizer.getQuantizedColors()>
		//  138  275:astore          6
				} else
		//* 139  277:goto            291
				{
					afilter = ((Filter []) (mSwatches));
		//  140  280:aload_0         
		//  141  281:getfield        #56  <Field List mSwatches>
		//  142  284:astore          6
					if(afilter == null)
						break label0;
		//  143  286:aload           6
		//  144  288:ifnull          314
				}
				afilter = ((Filter []) (new Palette(((List) (afilter)), mTargets)));
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

		public Builder maximumColorCount(int i)
		{
			mMaxColors = i;
		//    0    0:aload_0         
		//    1    1:iload_1         
		//    2    2:putfield        #28  <Field int mMaxColors>
			return this;
		//    3    5:aload_0         
		//    4    6:areturn         
		}

		public Builder resizeBitmapArea(int i)
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

		public Builder resizeBitmapSize(int i)
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

		public Builder setRegion(int i, int j, int k, int l)
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

		public Builder(Bitmap bitmap)
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

		public Builder(List list)
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

		private class Filter
		{

			public abstract boolean isAllowed(int i, float af[]);
		}

	}


	private class _cls1
		implements Filter
	{

		private boolean isBlack(float af[])
		{
			return af[2] <= 0.05F;
		//    0    0:aload_1         
		//    1    1:iconst_2        
		//    2    2:faload          
		//    3    3:ldc1            #9   <Float 0.05F>
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
		//*   7    7:ldc1            #20  <Float 10F>
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
		//*  15   18:ldc1            #21  <Float 37F>
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
		//*  23   29:ldc1            #22  <Float 0.82F>
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
		//    3    3:ldc1            #11  <Float 0.95F>
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
		//    2    2:invokespecial   #27  <Method boolean isWhite(float[])>
		//    3    5:ifne            26
		//    4    8:aload_0         
		//    5    9:aload_2         
		//    6   10:invokespecial   #29  <Method boolean isBlack(float[])>
		//    7   13:ifne            26
		//    8   16:aload_0         
		//    9   17:aload_2         
		//   10   18:invokespecial   #31  <Method boolean isNearRedILine(float[])>
		//   11   21:ifne            26
		//   12   24:iconst_1        
		//   13   25:ireturn         
		//   14   26:iconst_0        
		//   15   27:ireturn         
		}

		private static final float BLACK_MAX_LIGHTNESS = 0.05F;
		private static final float WHITE_MIN_LIGHTNESS = 0.95F;

		_cls1()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #15  <Method void Object()>
		//    2    4:return          
		}
	}

}
