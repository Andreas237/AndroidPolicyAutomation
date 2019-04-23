// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v7.graphics;

import android.graphics.Color;
import android.support.v4.graphics.a;
import java.util.Arrays;

public final class Palette$Swatch
{

	private void ensureTextColorsGenerated()
	{
		if(!mGeneratedTextColors)
	//*   0    0:aload_0         
	//*   1    1:getfield        #63  <Field boolean mGeneratedTextColors>
	//*   2    4:ifne            184
		{
			int i = a.a(-1, mRgb, 4.5F);
	//    3    7:iconst_m1       
	//    4    8:aload_0         
	//    5    9:getfield        #41  <Field int mRgb>
	//    6   12:ldc1            #64  <Float 4.5F>
	//    7   14:invokestatic    #67  <Method int a.a(int, int, float)>
	//    8   17:istore_1        
			int j = a.a(-1, mRgb, 3F);
	//    9   18:iconst_m1       
	//   10   19:aload_0         
	//   11   20:getfield        #41  <Field int mRgb>
	//   12   23:ldc1            #68  <Float 3F>
	//   13   25:invokestatic    #67  <Method int a.a(int, int, float)>
	//   14   28:istore_2        
			if(i != -1 && j != -1)
	//*  15   29:iload_1         
	//*  16   30:iconst_m1       
	//*  17   31:icmpeq          63
	//*  18   34:iload_2         
	//*  19   35:iconst_m1       
	//*  20   36:icmpeq          63
			{
				mBodyTextColor = a.c(-1, i);
	//   21   39:aload_0         
	//   22   40:iconst_m1       
	//   23   41:iload_1         
	//   24   42:invokestatic    #72  <Method int a.c(int, int)>
	//   25   45:putfield        #74  <Field int mBodyTextColor>
				mTitleTextColor = a.c(-1, j);
	//   26   48:aload_0         
	//   27   49:iconst_m1       
	//   28   50:iload_2         
	//   29   51:invokestatic    #72  <Method int a.c(int, int)>
	//   30   54:putfield        #76  <Field int mTitleTextColor>
				mGeneratedTextColors = true;
	//   31   57:aload_0         
	//   32   58:iconst_1        
	//   33   59:putfield        #63  <Field boolean mGeneratedTextColors>
				return;
	//   34   62:return          
			}
			int l = a.a(0xff000000, mRgb, 4.5F);
	//   35   63:ldc1            #77  <Int 0xff000000>
	//   36   65:aload_0         
	//   37   66:getfield        #41  <Field int mRgb>
	//   38   69:ldc1            #64  <Float 4.5F>
	//   39   71:invokestatic    #67  <Method int a.a(int, int, float)>
	//   40   74:istore          4
			int k = a.a(0xff000000, mRgb, 3F);
	//   41   76:ldc1            #77  <Int 0xff000000>
	//   42   78:aload_0         
	//   43   79:getfield        #41  <Field int mRgb>
	//   44   82:ldc1            #68  <Float 3F>
	//   45   84:invokestatic    #67  <Method int a.a(int, int, float)>
	//   46   87:istore_3        
			if(l != -1 && k != -1)
	//*  47   88:iload           4
	//*  48   90:iconst_m1       
	//*  49   91:icmpeq          126
	//*  50   94:iload_3         
	//*  51   95:iconst_m1       
	//*  52   96:icmpeq          126
			{
				mBodyTextColor = a.c(0xff000000, l);
	//   53   99:aload_0         
	//   54  100:ldc1            #77  <Int 0xff000000>
	//   55  102:iload           4
	//   56  104:invokestatic    #72  <Method int a.c(int, int)>
	//   57  107:putfield        #74  <Field int mBodyTextColor>
				mTitleTextColor = a.c(0xff000000, k);
	//   58  110:aload_0         
	//   59  111:ldc1            #77  <Int 0xff000000>
	//   60  113:iload_3         
	//   61  114:invokestatic    #72  <Method int a.c(int, int)>
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
				i = a.c(-1, i);
	//   70  131:iconst_m1       
	//   71  132:iload_1         
	//   72  133:invokestatic    #72  <Method int a.c(int, int)>
	//   73  136:istore_1        
			else
	//*  74  137:goto            148
				i = a.c(0xff000000, l);
	//   75  140:ldc1            #77  <Int 0xff000000>
	//   76  142:iload           4
	//   77  144:invokestatic    #72  <Method int a.c(int, int)>
	//   78  147:istore_1        
			mBodyTextColor = i;
	//   79  148:aload_0         
	//   80  149:iload_1         
	//   81  150:putfield        #74  <Field int mBodyTextColor>
			if(j != -1)
	//*  82  153:iload_2         
	//*  83  154:iconst_m1       
	//*  84  155:icmpeq          167
				i = a.c(-1, j);
	//   85  158:iconst_m1       
	//   86  159:iload_2         
	//   87  160:invokestatic    #72  <Method int a.c(int, int)>
	//   88  163:istore_1        
			else
	//*  89  164:goto            174
				i = a.c(0xff000000, k);
	//   90  167:ldc1            #77  <Int 0xff000000>
	//   91  169:iload_3         
	//   92  170:invokestatic    #72  <Method int a.c(int, int)>
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
			obj = ((Object) ((Palette$Swatch)obj));
	//   14   24:aload_1         
	//   15   25:checkcast       #2   <Class Palette$Swatch>
	//   16   28:astore_1        
			return mPopulation == ((Palette$Swatch) (obj)).mPopulation && mRgb == ((Palette$Swatch) (obj)).mRgb;
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
		a.a(mRed, mGreen, mBlue, mHsl);
	//    7   14:aload_0         
	//    8   15:getfield        #29  <Field int mRed>
	//    9   18:aload_0         
	//   10   19:getfield        #34  <Field int mGreen>
	//   11   22:aload_0         
	//   12   23:getfield        #39  <Field int mBlue>
	//   13   26:aload_0         
	//   14   27:getfield        #60  <Field float[] mHsl>
	//   15   30:invokestatic    #92  <Method void a.a(int, int, int, float[])>
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

	public Palette$Swatch(int i, int j)
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

	Palette$Swatch(int i, int j, int k, int l)
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

	Palette$Swatch(float af[], int i)
	{
		this(a.a(af), i);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokestatic    #56  <Method int a.a(float[])>
	//    3    5:iload_2         
	//    4    6:invokespecial   #58  <Method void Palette$Swatch(int, int)>
		mHsl = af;
	//    5    9:aload_0         
	//    6   10:aload_1         
	//    7   11:putfield        #60  <Field float[] mHsl>
	//    8   14:return          
	}
}
