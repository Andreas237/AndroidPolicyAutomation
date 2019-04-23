// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.content.res;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Shader;
import android.util.Log;
import android.util.Xml;
import java.io.IOException;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

// Referenced classes of package android.support.v4.content.res:
//			GradientColorInflaterCompat, ColorStateListInflaterCompat

public final class ComplexColorCompat
{

	private ComplexColorCompat(Shader shader, ColorStateList colorstatelist, int i)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #24  <Method void Object()>
		mShader = shader;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #26  <Field Shader mShader>
		mColorStateList = colorstatelist;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #28  <Field ColorStateList mColorStateList>
		mColor = i;
	//    8   14:aload_0         
	//    9   15:iload_3         
	//   10   16:putfield        #30  <Field int mColor>
	//   11   19:return          
	}

	private static ComplexColorCompat createFromXml(Resources resources, int i, android.content.res.Resources.Theme theme)
		throws IOException, XmlPullParserException
	{
label0:
		{
			android.content.res.XmlResourceParser xmlresourceparser;
			String s;
			android.util.AttributeSet attributeset;
label1:
			{
				xmlresourceparser = resources.getXml(i);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokevirtual   #47  <Method android.content.res.XmlResourceParser Resources.getXml(int)>
	//    3    5:astore          4
				attributeset = Xml.asAttributeSet(((XmlPullParser) (xmlresourceparser)));
	//    4    7:aload           4
	//    5    9:invokestatic    #53  <Method android.util.AttributeSet Xml.asAttributeSet(XmlPullParser)>
	//    6   12:astore          6
				int j;
				do
				{
					j = ((XmlPullParser) (xmlresourceparser)).next();
	//    7   14:aload           4
	//    8   16:invokeinterface #59  <Method int XmlPullParser.next()>
	//    9   21:istore_3        
					i = 1;
	//   10   22:iconst_1        
	//   11   23:istore_1        
				} while(j != 2 && j != 1);
	//   12   24:iload_3         
	//   13   25:iconst_2        
	//   14   26:icmpeq          37
	//   15   29:iload_3         
	//   16   30:iconst_1        
	//   17   31:icmpeq          37
	//*  18   34:goto            14
				if(j != 2)
					break label0;
	//   19   37:iload_3         
	//   20   38:iconst_2        
	//   21   39:icmpne          196
				s = ((XmlPullParser) (xmlresourceparser)).getName();
	//   22   42:aload           4
	//   23   44:invokeinterface #63  <Method String XmlPullParser.getName()>
	//   24   49:astore          5
				j = s.hashCode();
	//   25   51:aload           5
	//   26   53:invokevirtual   #68  <Method int String.hashCode()>
	//   27   56:istore_3        
				if(j != 0x557f730)
	//*  28   57:iload_3         
	//*  29   58:ldc1            #69  <Int 0x557f730>
	//*  30   60:icmpeq          87
				{
					if(j == 0x4705f3df && s.equals("selector"))
	//*  31   63:iload_3         
	//*  32   64:ldc1            #70  <Int 0x4705f3df>
	//*  33   66:icmpeq          72
	//*  34   69:goto            100
	//*  35   72:aload           5
	//*  36   74:ldc1            #72  <String "selector">
	//*  37   76:invokevirtual   #76  <Method boolean String.equals(Object)>
	//*  38   79:ifeq            100
					{
						i = 0;
	//   39   82:iconst_0        
	//   40   83:istore_1        
						break label1;
	//   41   84:goto            102
					}
				} else
				if(s.equals("gradient"))
	//*  42   87:aload           5
	//*  43   89:ldc1            #78  <String "gradient">
	//*  44   91:invokevirtual   #76  <Method boolean String.equals(Object)>
	//*  45   94:ifeq            100
					break label1;
	//   46   97:goto            102
				i = -1;
	//   47  100:iconst_m1       
	//   48  101:istore_1        
			}
			switch(i)
	//*  49  102:iload_1         
			{
	//*  50  103:tableswitch     0 1: default 124
	//	               0 183
	//	               1 170
			default:
				resources = ((Resources) (new StringBuilder()));
	//   51  124:new             #80  <Class StringBuilder>
	//   52  127:dup             
	//   53  128:invokespecial   #81  <Method void StringBuilder()>
	//   54  131:astore_0        
				((StringBuilder) (resources)).append(((XmlPullParser) (xmlresourceparser)).getPositionDescription());
	//   55  132:aload_0         
	//   56  133:aload           4
	//   57  135:invokeinterface #84  <Method String XmlPullParser.getPositionDescription()>
	//   58  140:invokevirtual   #88  <Method StringBuilder StringBuilder.append(String)>
	//   59  143:pop             
				((StringBuilder) (resources)).append(": unsupported complex color tag ");
	//   60  144:aload_0         
	//   61  145:ldc1            #90  <String ": unsupported complex color tag ">
	//   62  147:invokevirtual   #88  <Method StringBuilder StringBuilder.append(String)>
	//   63  150:pop             
				((StringBuilder) (resources)).append(s);
	//   64  151:aload_0         
	//   65  152:aload           5
	//   66  154:invokevirtual   #88  <Method StringBuilder StringBuilder.append(String)>
	//   67  157:pop             
				throw new XmlPullParserException(((StringBuilder) (resources)).toString());
	//   68  158:new             #38  <Class XmlPullParserException>
	//   69  161:dup             
	//   70  162:aload_0         
	//   71  163:invokevirtual   #93  <Method String StringBuilder.toString()>
	//   72  166:invokespecial   #96  <Method void XmlPullParserException(String)>
	//   73  169:athrow          

			case 1: // '\001'
				return from(GradientColorInflaterCompat.createFromXmlInner(resources, ((XmlPullParser) (xmlresourceparser)), attributeset, theme));
	//   74  170:aload_0         
	//   75  171:aload           4
	//   76  173:aload           6
	//   77  175:aload_2         
	//   78  176:invokestatic    #102 <Method Shader GradientColorInflaterCompat.createFromXmlInner(Resources, XmlPullParser, android.util.AttributeSet, android.content.res.Resources$Theme)>
	//   79  179:invokestatic    #106 <Method ComplexColorCompat from(Shader)>
	//   80  182:areturn         

			case 0: // '\0'
				return from(ColorStateListInflaterCompat.createFromXmlInner(resources, ((XmlPullParser) (xmlresourceparser)), attributeset, theme));
	//   81  183:aload_0         
	//   82  184:aload           4
	//   83  186:aload           6
	//   84  188:aload_2         
	//   85  189:invokestatic    #111 <Method ColorStateList ColorStateListInflaterCompat.createFromXmlInner(Resources, XmlPullParser, android.util.AttributeSet, android.content.res.Resources$Theme)>
	//   86  192:invokestatic    #114 <Method ComplexColorCompat from(ColorStateList)>
	//   87  195:areturn         
			}
		}
		throw new XmlPullParserException("No start tag found");
	//   88  196:new             #38  <Class XmlPullParserException>
	//   89  199:dup             
	//   90  200:ldc1            #116 <String "No start tag found">
	//   91  202:invokespecial   #96  <Method void XmlPullParserException(String)>
	//   92  205:athrow          
	}

	static ComplexColorCompat from(int i)
	{
		return new ComplexColorCompat(((Shader) (null)), ((ColorStateList) (null)), i);
	//    0    0:new             #2   <Class ComplexColorCompat>
	//    1    3:dup             
	//    2    4:aconst_null     
	//    3    5:aconst_null     
	//    4    6:iload_0         
	//    5    7:invokespecial   #121 <Method void ComplexColorCompat(Shader, ColorStateList, int)>
	//    6   10:areturn         
	}

	static ComplexColorCompat from(ColorStateList colorstatelist)
	{
		return new ComplexColorCompat(((Shader) (null)), colorstatelist, colorstatelist.getDefaultColor());
	//    0    0:new             #2   <Class ComplexColorCompat>
	//    1    3:dup             
	//    2    4:aconst_null     
	//    3    5:aload_0         
	//    4    6:aload_0         
	//    5    7:invokevirtual   #126 <Method int ColorStateList.getDefaultColor()>
	//    6   10:invokespecial   #121 <Method void ComplexColorCompat(Shader, ColorStateList, int)>
	//    7   13:areturn         
	}

	static ComplexColorCompat from(Shader shader)
	{
		return new ComplexColorCompat(shader, ((ColorStateList) (null)), 0);
	//    0    0:new             #2   <Class ComplexColorCompat>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:aconst_null     
	//    4    6:iconst_0        
	//    5    7:invokespecial   #121 <Method void ComplexColorCompat(Shader, ColorStateList, int)>
	//    6   10:areturn         
	}

	public static ComplexColorCompat inflate(Resources resources, int i, android.content.res.Resources.Theme theme)
	{
		try
		{
			resources = ((Resources) (createFromXml(resources, i, theme)));
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:aload_2         
	//    3    3:invokestatic    #131 <Method ComplexColorCompat createFromXml(Resources, int, android.content.res.Resources$Theme)>
	//    4    6:astore_0        
		}
	//*   5    7:aload_0         
	//*   6    8:areturn         
		// Misplaced declaration of an exception variable
		catch(Resources resources)
	//*   7    9:astore_0        
		{
			Log.e("ComplexColorCompat", "Failed to inflate ComplexColor.", ((Throwable) (resources)));
	//    8   10:ldc1            #12  <String "ComplexColorCompat">
	//    9   12:ldc1            #133 <String "Failed to inflate ComplexColor.">
	//   10   14:aload_0         
	//   11   15:invokestatic    #139 <Method int Log.e(String, String, Throwable)>
	//   12   18:pop             
			return null;
	//   13   19:aconst_null     
	//   14   20:areturn         
		}
		return ((ComplexColorCompat) (resources));
	}

	public int getColor()
	{
		return mColor;
	//    0    0:aload_0         
	//    1    1:getfield        #30  <Field int mColor>
	//    2    4:ireturn         
	}

	public Shader getShader()
	{
		return mShader;
	//    0    0:aload_0         
	//    1    1:getfield        #26  <Field Shader mShader>
	//    2    4:areturn         
	}

	public boolean isGradient()
	{
		return mShader != null;
	//    0    0:aload_0         
	//    1    1:getfield        #26  <Field Shader mShader>
	//    2    4:ifnull          9
	//    3    7:iconst_1        
	//    4    8:ireturn         
	//    5    9:iconst_0        
	//    6   10:ireturn         
	}

	public boolean isStateful()
	{
		if(mShader == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #26  <Field Shader mShader>
	//*   2    4:ifnonnull       25
		{
			ColorStateList colorstatelist = mColorStateList;
	//    3    7:aload_0         
	//    4    8:getfield        #28  <Field ColorStateList mColorStateList>
	//    5   11:astore_1        
			if(colorstatelist != null && colorstatelist.isStateful())
	//*   6   12:aload_1         
	//*   7   13:ifnull          25
	//*   8   16:aload_1         
	//*   9   17:invokevirtual   #147 <Method boolean ColorStateList.isStateful()>
	//*  10   20:ifeq            25
				return true;
	//   11   23:iconst_1        
	//   12   24:ireturn         
		}
		return false;
	//   13   25:iconst_0        
	//   14   26:ireturn         
	}

	public boolean onStateChanged(int ai[])
	{
		if(isStateful())
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #150 <Method boolean isStateful()>
	//*   2    4:ifeq            37
		{
			ColorStateList colorstatelist = mColorStateList;
	//    3    7:aload_0         
	//    4    8:getfield        #28  <Field ColorStateList mColorStateList>
	//    5   11:astore_3        
			int i = colorstatelist.getColorForState(ai, colorstatelist.getDefaultColor());
	//    6   12:aload_3         
	//    7   13:aload_1         
	//    8   14:aload_3         
	//    9   15:invokevirtual   #126 <Method int ColorStateList.getDefaultColor()>
	//   10   18:invokevirtual   #154 <Method int ColorStateList.getColorForState(int[], int)>
	//   11   21:istore_2        
			if(i != mColor)
	//*  12   22:iload_2         
	//*  13   23:aload_0         
	//*  14   24:getfield        #30  <Field int mColor>
	//*  15   27:icmpeq          37
			{
				mColor = i;
	//   16   30:aload_0         
	//   17   31:iload_2         
	//   18   32:putfield        #30  <Field int mColor>
				return true;
	//   19   35:iconst_1        
	//   20   36:ireturn         
			}
		}
		return false;
	//   21   37:iconst_0        
	//   22   38:ireturn         
	}

	public void setColor(int i)
	{
		mColor = i;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #30  <Field int mColor>
	//    3    5:return          
	}

	public boolean willDraw()
	{
		return isGradient() || mColor != 0;
	//    0    0:aload_0         
	//    1    1:invokevirtual   #159 <Method boolean isGradient()>
	//    2    4:ifne            19
	//    3    7:aload_0         
	//    4    8:getfield        #30  <Field int mColor>
	//    5   11:ifeq            17
	//    6   14:goto            19
	//    7   17:iconst_0        
	//    8   18:ireturn         
	//    9   19:iconst_1        
	//   10   20:ireturn         
	}

	private static final String LOG_TAG = "ComplexColorCompat";
	private int mColor;
	private final ColorStateList mColorStateList;
	private final Shader mShader;
}
