// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v7.graphics.drawable;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.support.v4.content.res.TypedArrayUtils;
import android.support.v7.content.res.AppCompatResources;
import android.util.AttributeSet;
import android.util.StateSet;
import java.io.IOException;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

// Referenced classes of package android.support.v7.graphics.drawable:
//			DrawableContainer

class StateListDrawable extends DrawableContainer
{
	static class StateListState extends DrawableContainer.DrawableContainerState
	{

		int addStateSet(int ai[], Drawable drawable)
		{
			int i = addChild(drawable);
		//    0    0:aload_0         
		//    1    1:aload_2         
		//    2    2:invokevirtual   #29  <Method int addChild(Drawable)>
		//    3    5:istore_3        
			mStateSets[i] = ai;
		//    4    6:aload_0         
		//    5    7:getfield        #16  <Field int[][] mStateSets>
		//    6   10:iload_3         
		//    7   11:aload_1         
		//    8   12:aastore         
			return i;
		//    9   13:iload_3         
		//   10   14:ireturn         
		}

		public void growArray(int i, int j)
		{
			super.growArray(i, j);
		//    0    0:aload_0         
		//    1    1:iload_1         
		//    2    2:iload_2         
		//    3    3:invokespecial   #33  <Method void DrawableContainer$DrawableContainerState.growArray(int, int)>
			int ai[][] = new int[j][];
		//    4    6:iload_2         
		//    5    7:anewarray       int[][]
		//    6   10:astore_3        
			System.arraycopy(((Object) (mStateSets)), 0, ((Object) (ai)), 0, i);
		//    7   11:aload_0         
		//    8   12:getfield        #16  <Field int[][] mStateSets>
		//    9   15:iconst_0        
		//   10   16:aload_3         
		//   11   17:iconst_0        
		//   12   18:iload_1         
		//   13   19:invokestatic    #39  <Method void System.arraycopy(Object, int, Object, int, int)>
			mStateSets = ai;
		//   14   22:aload_0         
		//   15   23:aload_3         
		//   16   24:putfield        #16  <Field int[][] mStateSets>
		//   17   27:return          
		}

		int indexOfStateSet(int ai[])
		{
			int ai1[][] = mStateSets;
		//    0    0:aload_0         
		//    1    1:getfield        #16  <Field int[][] mStateSets>
		//    2    4:astore          4
			int j = getChildCount();
		//    3    6:aload_0         
		//    4    7:invokevirtual   #44  <Method int getChildCount()>
		//    5   10:istore_3        
			for(int i = 0; i < j; i++)
		//*   6   11:iconst_0        
		//*   7   12:istore_2        
		//*   8   13:iload_2         
		//*   9   14:iload_3         
		//*  10   15:icmpge          38
				if(StateSet.stateSetMatches(ai1[i], ai))
		//*  11   18:aload           4
		//*  12   20:iload_2         
		//*  13   21:aaload          
		//*  14   22:aload_1         
		//*  15   23:invokestatic    #50  <Method boolean StateSet.stateSetMatches(int[], int[])>
		//*  16   26:ifeq            31
					return i;
		//   17   29:iload_2         
		//   18   30:ireturn         

		//   19   31:iload_2         
		//   20   32:iconst_1        
		//   21   33:iadd            
		//   22   34:istore_2        
		//*  23   35:goto            13
			return -1;
		//   24   38:iconst_m1       
		//   25   39:ireturn         
		}

		void mutate()
		{
			int ai[][] = mStateSets;
		//    0    0:aload_0         
		//    1    1:getfield        #16  <Field int[][] mStateSets>
		//    2    4:astore_2        
			int ai1[][] = new int[ai.length][];
		//    3    5:aload_2         
		//    4    6:arraylength     
		//    5    7:anewarray       int[][]
		//    6   10:astore_3        
			for(int i = ai.length - 1; i >= 0; i--)
		//*   7   11:aload_2         
		//*   8   12:arraylength     
		//*   9   13:iconst_1        
		//*  10   14:isub            
		//*  11   15:istore_1        
		//*  12   16:iload_1         
		//*  13   17:iflt            57
			{
				Object obj = ((Object) (mStateSets));
		//   14   20:aload_0         
		//   15   21:getfield        #16  <Field int[][] mStateSets>
		//   16   24:astore_2        
				if(obj[i] != null)
		//*  17   25:aload_2         
		//*  18   26:iload_1         
		//*  19   27:aaload          
		//*  20   28:ifnull          44
					obj = ((Object) ((int[])((int []) (obj[i])).clone()));
		//   21   31:aload_2         
		//   22   32:iload_1         
		//   23   33:aaload          
		//   24   34:invokevirtual   #56  <Method Object _5B_I.clone()>
		//   25   37:checkcast       #22  <Class int[]>
		//   26   40:astore_2        
				else
		//*  27   41:goto            46
					obj = null;
		//   28   44:aconst_null     
		//   29   45:astore_2        
				ai1[i] = ((int []) (obj));
		//   30   46:aload_3         
		//   31   47:iload_1         
		//   32   48:aload_2         
		//   33   49:aastore         
			}

		//   34   50:iload_1         
		//   35   51:iconst_1        
		//   36   52:isub            
		//   37   53:istore_1        
		//*  38   54:goto            16
			mStateSets = ai1;
		//   39   57:aload_0         
		//   40   58:aload_3         
		//   41   59:putfield        #16  <Field int[][] mStateSets>
		//   42   62:return          
		}

		public Drawable newDrawable()
		{
			return ((Drawable) (new StateListDrawable(this, ((Resources) (null)))));
		//    0    0:new             #6   <Class StateListDrawable>
		//    1    3:dup             
		//    2    4:aload_0         
		//    3    5:aconst_null     
		//    4    6:invokespecial   #62  <Method void StateListDrawable(StateListDrawable$StateListState, Resources)>
		//    5    9:areturn         
		}

		public Drawable newDrawable(Resources resources)
		{
			return ((Drawable) (new StateListDrawable(this, resources)));
		//    0    0:new             #6   <Class StateListDrawable>
		//    1    3:dup             
		//    2    4:aload_0         
		//    3    5:aload_1         
		//    4    6:invokespecial   #62  <Method void StateListDrawable(StateListDrawable$StateListState, Resources)>
		//    5    9:areturn         
		}

		int mStateSets[][];

		StateListState(StateListState stateliststate, StateListDrawable statelistdrawable, Resources resources)
		{
			super(((DrawableContainer.DrawableContainerState) (stateliststate)), ((DrawableContainer) (statelistdrawable)), resources);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:aload_2         
		//    3    3:aload_3         
		//    4    4:invokespecial   #14  <Method void DrawableContainer$DrawableContainerState(DrawableContainer$DrawableContainerState, DrawableContainer, Resources)>
			if(stateliststate != null)
		//*   5    7:aload_1         
		//*   6    8:ifnull          20
			{
				mStateSets = stateliststate.mStateSets;
		//    7   11:aload_0         
		//    8   12:aload_1         
		//    9   13:getfield        #16  <Field int[][] mStateSets>
		//   10   16:putfield        #16  <Field int[][] mStateSets>
				return;
		//   11   19:return          
			} else
			{
				mStateSets = new int[getCapacity()][];
		//   12   20:aload_0         
		//   13   21:aload_0         
		//   14   22:invokevirtual   #20  <Method int getCapacity()>
		//   15   25:anewarray       int[][]
		//   16   28:putfield        #16  <Field int[][] mStateSets>
				return;
		//   17   31:return          
			}
		}
	}


	StateListDrawable()
	{
		this(((StateListState) (null)), ((Resources) (null)));
	//    0    0:aload_0         
	//    1    1:aconst_null     
	//    2    2:aconst_null     
	//    3    3:invokespecial   #20  <Method void StateListDrawable(StateListDrawable$StateListState, Resources)>
	//    4    6:return          
	}

	StateListDrawable(StateListState stateliststate)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #25  <Method void DrawableContainer()>
		if(stateliststate != null)
	//*   2    4:aload_1         
	//*   3    5:ifnull          13
			setConstantState(((DrawableContainer.DrawableContainerState) (stateliststate)));
	//    4    8:aload_0         
	//    5    9:aload_1         
	//    6   10:invokevirtual   #29  <Method void setConstantState(DrawableContainer$DrawableContainerState)>
	//    7   13:return          
	}

	StateListDrawable(StateListState stateliststate, Resources resources)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #25  <Method void DrawableContainer()>
		setConstantState(((DrawableContainer.DrawableContainerState) (new StateListState(stateliststate, this, resources))));
	//    2    4:aload_0         
	//    3    5:new             #6   <Class StateListDrawable$StateListState>
	//    4    8:dup             
	//    5    9:aload_1         
	//    6   10:aload_0         
	//    7   11:aload_2         
	//    8   12:invokespecial   #33  <Method void StateListDrawable$StateListState(StateListDrawable$StateListState, StateListDrawable, Resources)>
	//    9   15:invokevirtual   #29  <Method void setConstantState(DrawableContainer$DrawableContainerState)>
		onStateChange(getState());
	//   10   18:aload_0         
	//   11   19:aload_0         
	//   12   20:invokevirtual   #37  <Method int[] getState()>
	//   13   23:invokevirtual   #41  <Method boolean onStateChange(int[])>
	//   14   26:pop             
	//   15   27:return          
	}

	private void inflateChildElements(Context context, Resources resources, XmlPullParser xmlpullparser, AttributeSet attributeset, android.content.res.Resources.Theme theme)
		throws XmlPullParserException, IOException
	{
		StateListState stateliststate = mStateListState;
	//    0    0:aload_0         
	//    1    1:getfield        #49  <Field StateListDrawable$StateListState mStateListState>
	//    2    4:astore          11
		int i = xmlpullparser.getDepth() + 1;
	//    3    6:aload_3         
	//    4    7:invokeinterface #55  <Method int XmlPullParser.getDepth()>
	//    5   12:iconst_1        
	//    6   13:iadd            
	//    7   14:istore          6
		do
		{
			int j = xmlpullparser.next();
	//    8   16:aload_3         
	//    9   17:invokeinterface #58  <Method int XmlPullParser.next()>
	//   10   22:istore          7
			if(j == 1)
				break;
	//   11   24:iload           7
	//   12   26:iconst_1        
	//   13   27:icmpeq          261
			int i1 = xmlpullparser.getDepth();
	//   14   30:aload_3         
	//   15   31:invokeinterface #55  <Method int XmlPullParser.getDepth()>
	//   16   36:istore          8
			if(i1 < i && j == 3)
				break;
	//   17   38:iload           8
	//   18   40:iload           6
	//   19   42:icmpge          51
	//   20   45:iload           7
	//   21   47:iconst_3        
	//   22   48:icmpeq          261
			if(j == 2 && i1 <= i && xmlpullparser.getName().equals("item"))
	//*  23   51:iload           7
	//*  24   53:iconst_2        
	//*  25   54:icmpeq          60
	//*  26   57:goto            16
	//*  27   60:iload           8
	//*  28   62:iload           6
	//*  29   64:icmpgt          16
	//*  30   67:aload_3         
	//*  31   68:invokeinterface #62  <Method String XmlPullParser.getName()>
	//*  32   73:ldc1            #64  <String "item">
	//*  33   75:invokevirtual   #70  <Method boolean String.equals(Object)>
	//*  34   78:ifne            84
	//*  35   81:goto            16
			{
				Object obj = ((Object) (TypedArrayUtils.obtainAttributes(resources, theme, attributeset, android.support.v7.appcompat.R.styleable.StateListDrawableItem)));
	//   36   84:aload_2         
	//   37   85:aload           5
	//   38   87:aload           4
	//   39   89:getstatic       #76  <Field int[] android.support.v7.appcompat.R$styleable.StateListDrawableItem>
	//   40   92:invokestatic    #82  <Method TypedArray TypedArrayUtils.obtainAttributes(Resources, android.content.res.Resources$Theme, AttributeSet, int[])>
	//   41   95:astore          10
				Drawable drawable = null;
	//   42   97:aconst_null     
	//   43   98:astore          9
				int k = ((TypedArray) (obj)).getResourceId(android.support.v7.appcompat.R.styleable.StateListDrawableItem_android_drawable, -1);
	//   44  100:aload           10
	//   45  102:getstatic       #86  <Field int android.support.v7.appcompat.R$styleable.StateListDrawableItem_android_drawable>
	//   46  105:iconst_m1       
	//   47  106:invokevirtual   #92  <Method int TypedArray.getResourceId(int, int)>
	//   48  109:istore          7
				if(k > 0)
	//*  49  111:iload           7
	//*  50  113:ifle            124
					drawable = AppCompatResources.getDrawable(context, k);
	//   51  116:aload_1         
	//   52  117:iload           7
	//   53  119:invokestatic    #98  <Method Drawable AppCompatResources.getDrawable(Context, int)>
	//   54  122:astore          9
				((TypedArray) (obj)).recycle();
	//   55  124:aload           10
	//   56  126:invokevirtual   #101 <Method void TypedArray.recycle()>
				int ai[] = extractStateSet(attributeset);
	//   57  129:aload_0         
	//   58  130:aload           4
	//   59  132:invokevirtual   #105 <Method int[] extractStateSet(AttributeSet)>
	//   60  135:astore          12
				obj = ((Object) (drawable));
	//   61  137:aload           9
	//   62  139:astore          10
				if(drawable == null)
	//*  63  141:aload           9
	//*  64  143:ifnonnull       248
				{
					int l;
					do
						l = xmlpullparser.next();
	//   65  146:aload_3         
	//   66  147:invokeinterface #58  <Method int XmlPullParser.next()>
	//   67  152:istore          7
					while(l == 4);
	//   68  154:iload           7
	//   69  156:iconst_4        
	//   70  157:icmpne          163
	//*  71  160:goto            146
					if(l == 2)
	//*  72  163:iload           7
	//*  73  165:iconst_2        
	//*  74  166:icmpne          203
					{
						if(android.os.Build.VERSION.SDK_INT >= 21)
	//*  75  169:getstatic       #110 <Field int android.os.Build$VERSION.SDK_INT>
	//*  76  172:bipush          21
	//*  77  174:icmplt          191
							obj = ((Object) (Drawable.createFromXmlInner(resources, xmlpullparser, attributeset, theme)));
	//   78  177:aload_2         
	//   79  178:aload_3         
	//   80  179:aload           4
	//   81  181:aload           5
	//   82  183:invokestatic    #116 <Method Drawable Drawable.createFromXmlInner(Resources, XmlPullParser, AttributeSet, android.content.res.Resources$Theme)>
	//   83  186:astore          10
						else
	//*  84  188:goto            248
							obj = ((Object) (Drawable.createFromXmlInner(resources, xmlpullparser, attributeset)));
	//   85  191:aload_2         
	//   86  192:aload_3         
	//   87  193:aload           4
	//   88  195:invokestatic    #119 <Method Drawable Drawable.createFromXmlInner(Resources, XmlPullParser, AttributeSet)>
	//   89  198:astore          10
					} else
	//*  90  200:goto            248
					{
						context = ((Context) (new StringBuilder()));
	//   91  203:new             #121 <Class StringBuilder>
	//   92  206:dup             
	//   93  207:invokespecial   #122 <Method void StringBuilder()>
	//   94  210:astore_1        
						((StringBuilder) (context)).append(xmlpullparser.getPositionDescription());
	//   95  211:aload_1         
	//   96  212:aload_3         
	//   97  213:invokeinterface #125 <Method String XmlPullParser.getPositionDescription()>
	//   98  218:invokevirtual   #129 <Method StringBuilder StringBuilder.append(String)>
	//   99  221:pop             
						((StringBuilder) (context)).append(": <item> tag requires a 'drawable' attribute or ");
	//  100  222:aload_1         
	//  101  223:ldc1            #131 <String ": <item> tag requires a 'drawable' attribute or ">
	//  102  225:invokevirtual   #129 <Method StringBuilder StringBuilder.append(String)>
	//  103  228:pop             
						((StringBuilder) (context)).append("child tag defining a drawable");
	//  104  229:aload_1         
	//  105  230:ldc1            #133 <String "child tag defining a drawable">
	//  106  232:invokevirtual   #129 <Method StringBuilder StringBuilder.append(String)>
	//  107  235:pop             
						throw new XmlPullParserException(((StringBuilder) (context)).toString());
	//  108  236:new             #45  <Class XmlPullParserException>
	//  109  239:dup             
	//  110  240:aload_1         
	//  111  241:invokevirtual   #136 <Method String StringBuilder.toString()>
	//  112  244:invokespecial   #139 <Method void XmlPullParserException(String)>
	//  113  247:athrow          
					}
				}
				stateliststate.addStateSet(ai, ((Drawable) (obj)));
	//  114  248:aload           11
	//  115  250:aload           12
	//  116  252:aload           10
	//  117  254:invokevirtual   #143 <Method int StateListDrawable$StateListState.addStateSet(int[], Drawable)>
	//  118  257:pop             
			}
		} while(true);
	//  119  258:goto            16
	//  120  261:return          
	}

	private void updateStateFromTypedArray(TypedArray typedarray)
	{
		StateListState stateliststate = mStateListState;
	//    0    0:aload_0         
	//    1    1:getfield        #49  <Field StateListDrawable$StateListState mStateListState>
	//    2    4:astore_2        
		if(android.os.Build.VERSION.SDK_INT >= 21)
	//*   3    5:getstatic       #110 <Field int android.os.Build$VERSION.SDK_INT>
	//*   4    8:bipush          21
	//*   5   10:icmplt          26
			stateliststate.mChangingConfigurations = stateliststate.mChangingConfigurations | typedarray.getChangingConfigurations();
	//    6   13:aload_2         
	//    7   14:aload_2         
	//    8   15:getfield        #149 <Field int StateListDrawable$StateListState.mChangingConfigurations>
	//    9   18:aload_1         
	//   10   19:invokevirtual   #152 <Method int TypedArray.getChangingConfigurations()>
	//   11   22:ior             
	//   12   23:putfield        #149 <Field int StateListDrawable$StateListState.mChangingConfigurations>
		stateliststate.mVariablePadding = typedarray.getBoolean(android.support.v7.appcompat.R.styleable.StateListDrawable_android_variablePadding, stateliststate.mVariablePadding);
	//   13   26:aload_2         
	//   14   27:aload_1         
	//   15   28:getstatic       #155 <Field int android.support.v7.appcompat.R$styleable.StateListDrawable_android_variablePadding>
	//   16   31:aload_2         
	//   17   32:getfield        #158 <Field boolean StateListDrawable$StateListState.mVariablePadding>
	//   18   35:invokevirtual   #162 <Method boolean TypedArray.getBoolean(int, boolean)>
	//   19   38:putfield        #158 <Field boolean StateListDrawable$StateListState.mVariablePadding>
		stateliststate.mConstantSize = typedarray.getBoolean(android.support.v7.appcompat.R.styleable.StateListDrawable_android_constantSize, stateliststate.mConstantSize);
	//   20   41:aload_2         
	//   21   42:aload_1         
	//   22   43:getstatic       #165 <Field int android.support.v7.appcompat.R$styleable.StateListDrawable_android_constantSize>
	//   23   46:aload_2         
	//   24   47:getfield        #168 <Field boolean StateListDrawable$StateListState.mConstantSize>
	//   25   50:invokevirtual   #162 <Method boolean TypedArray.getBoolean(int, boolean)>
	//   26   53:putfield        #168 <Field boolean StateListDrawable$StateListState.mConstantSize>
		stateliststate.mEnterFadeDuration = typedarray.getInt(android.support.v7.appcompat.R.styleable.StateListDrawable_android_enterFadeDuration, stateliststate.mEnterFadeDuration);
	//   27   56:aload_2         
	//   28   57:aload_1         
	//   29   58:getstatic       #171 <Field int android.support.v7.appcompat.R$styleable.StateListDrawable_android_enterFadeDuration>
	//   30   61:aload_2         
	//   31   62:getfield        #174 <Field int StateListDrawable$StateListState.mEnterFadeDuration>
	//   32   65:invokevirtual   #177 <Method int TypedArray.getInt(int, int)>
	//   33   68:putfield        #174 <Field int StateListDrawable$StateListState.mEnterFadeDuration>
		stateliststate.mExitFadeDuration = typedarray.getInt(android.support.v7.appcompat.R.styleable.StateListDrawable_android_exitFadeDuration, stateliststate.mExitFadeDuration);
	//   34   71:aload_2         
	//   35   72:aload_1         
	//   36   73:getstatic       #180 <Field int android.support.v7.appcompat.R$styleable.StateListDrawable_android_exitFadeDuration>
	//   37   76:aload_2         
	//   38   77:getfield        #183 <Field int StateListDrawable$StateListState.mExitFadeDuration>
	//   39   80:invokevirtual   #177 <Method int TypedArray.getInt(int, int)>
	//   40   83:putfield        #183 <Field int StateListDrawable$StateListState.mExitFadeDuration>
		stateliststate.mDither = typedarray.getBoolean(android.support.v7.appcompat.R.styleable.StateListDrawable_android_dither, stateliststate.mDither);
	//   41   86:aload_2         
	//   42   87:aload_1         
	//   43   88:getstatic       #186 <Field int android.support.v7.appcompat.R$styleable.StateListDrawable_android_dither>
	//   44   91:aload_2         
	//   45   92:getfield        #189 <Field boolean StateListDrawable$StateListState.mDither>
	//   46   95:invokevirtual   #162 <Method boolean TypedArray.getBoolean(int, boolean)>
	//   47   98:putfield        #189 <Field boolean StateListDrawable$StateListState.mDither>
	//   48  101:return          
	}

	public void applyTheme(android.content.res.Resources.Theme theme)
	{
		super.applyTheme(theme);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #196 <Method void DrawableContainer.applyTheme(android.content.res.Resources$Theme)>
		onStateChange(getState());
	//    3    5:aload_0         
	//    4    6:aload_0         
	//    5    7:invokevirtual   #37  <Method int[] getState()>
	//    6   10:invokevirtual   #41  <Method boolean onStateChange(int[])>
	//    7   13:pop             
	//    8   14:return          
	}

	volatile DrawableContainer.DrawableContainerState cloneConstantState()
	{
		return ((DrawableContainer.DrawableContainerState) (cloneConstantState()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #202 <Method StateListDrawable$StateListState cloneConstantState()>
	//    2    4:areturn         
	}

	StateListState cloneConstantState()
	{
		return new StateListState(mStateListState, this, ((Resources) (null)));
	//    0    0:new             #6   <Class StateListDrawable$StateListState>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:getfield        #49  <Field StateListDrawable$StateListState mStateListState>
	//    4    8:aload_0         
	//    5    9:aconst_null     
	//    6   10:invokespecial   #33  <Method void StateListDrawable$StateListState(StateListDrawable$StateListState, StateListDrawable, Resources)>
	//    7   13:areturn         
	}

	int[] extractStateSet(AttributeSet attributeset)
	{
		int i1 = attributeset.getAttributeCount();
	//    0    0:aload_1         
	//    1    1:invokeinterface #207 <Method int AttributeSet.getAttributeCount()>
	//    2    6:istore          6
		int ai[] = new int[i1];
	//    3    8:iload           6
	//    4   10:newarray        int[]
	//    5   12:astore          7
		int i = 0;
	//    6   14:iconst_0        
	//    7   15:istore_2        
		int j;
		int k;
		for(j = 0; i < i1; j = k)
	//*   8   16:iconst_0        
	//*   9   17:istore_3        
	//*  10   18:iload_2         
	//*  11   19:iload           6
	//*  12   21:icmpge          105
		{
			int l = attributeset.getAttributeNameResource(i);
	//   13   24:aload_1         
	//   14   25:iload_2         
	//   15   26:invokeinterface #211 <Method int AttributeSet.getAttributeNameResource(int)>
	//   16   31:istore          5
			k = j;
	//   17   33:iload_3         
	//   18   34:istore          4
			if(l != 0)
	//*  19   36:iload           5
	//*  20   38:ifeq            95
			{
				k = j;
	//   21   41:iload_3         
	//   22   42:istore          4
				if(l != 0x10100d0)
	//*  23   44:iload           5
	//*  24   46:ldc1            #212 <Int 0x10100d0>
	//*  25   48:icmpeq          95
				{
					k = j;
	//   26   51:iload_3         
	//   27   52:istore          4
					if(l != 0x1010199)
	//*  28   54:iload           5
	//*  29   56:ldc1            #213 <Int 0x1010199>
	//*  30   58:icmpeq          95
					{
						if(attributeset.getAttributeBooleanValue(i, false))
	//*  31   61:aload_1         
	//*  32   62:iload_2         
	//*  33   63:iconst_0        
	//*  34   64:invokeinterface #216 <Method boolean AttributeSet.getAttributeBooleanValue(int, boolean)>
	//*  35   69:ifeq            79
							k = l;
	//   36   72:iload           5
	//   37   74:istore          4
						else
	//*  38   76:goto            84
							k = -l;
	//   39   79:iload           5
	//   40   81:ineg            
	//   41   82:istore          4
						ai[j] = k;
	//   42   84:aload           7
	//   43   86:iload_3         
	//   44   87:iload           4
	//   45   89:iastore         
						k = j + 1;
	//   46   90:iload_3         
	//   47   91:iconst_1        
	//   48   92:iadd            
	//   49   93:istore          4
					}
				}
			}
			i++;
	//   50   95:iload_2         
	//   51   96:iconst_1        
	//   52   97:iadd            
	//   53   98:istore_2        
		}

	//   54   99:iload           4
	//   55  101:istore_3        
	//*  56  102:goto            18
		return StateSet.trimStateSet(ai, j);
	//   57  105:aload           7
	//   58  107:iload_3         
	//   59  108:invokestatic    #222 <Method int[] StateSet.trimStateSet(int[], int)>
	//   60  111:areturn         
	}

	public void inflate(Context context, Resources resources, XmlPullParser xmlpullparser, AttributeSet attributeset, android.content.res.Resources.Theme theme)
		throws XmlPullParserException, IOException
	{
		TypedArray typedarray = TypedArrayUtils.obtainAttributes(resources, theme, attributeset, android.support.v7.appcompat.R.styleable.StateListDrawable);
	//    0    0:aload_2         
	//    1    1:aload           5
	//    2    3:aload           4
	//    3    5:getstatic       #226 <Field int[] android.support.v7.appcompat.R$styleable.StateListDrawable>
	//    4    8:invokestatic    #82  <Method TypedArray TypedArrayUtils.obtainAttributes(Resources, android.content.res.Resources$Theme, AttributeSet, int[])>
	//    5   11:astore          6
		setVisible(typedarray.getBoolean(android.support.v7.appcompat.R.styleable.StateListDrawable_android_visible, true), true);
	//    6   13:aload_0         
	//    7   14:aload           6
	//    8   16:getstatic       #229 <Field int android.support.v7.appcompat.R$styleable.StateListDrawable_android_visible>
	//    9   19:iconst_1        
	//   10   20:invokevirtual   #162 <Method boolean TypedArray.getBoolean(int, boolean)>
	//   11   23:iconst_1        
	//   12   24:invokevirtual   #233 <Method boolean setVisible(boolean, boolean)>
	//   13   27:pop             
		updateStateFromTypedArray(typedarray);
	//   14   28:aload_0         
	//   15   29:aload           6
	//   16   31:invokespecial   #235 <Method void updateStateFromTypedArray(TypedArray)>
		updateDensity(resources);
	//   17   34:aload_0         
	//   18   35:aload_2         
	//   19   36:invokevirtual   #239 <Method void updateDensity(Resources)>
		typedarray.recycle();
	//   20   39:aload           6
	//   21   41:invokevirtual   #101 <Method void TypedArray.recycle()>
		inflateChildElements(context, resources, xmlpullparser, attributeset, theme);
	//   22   44:aload_0         
	//   23   45:aload_1         
	//   24   46:aload_2         
	//   25   47:aload_3         
	//   26   48:aload           4
	//   27   50:aload           5
	//   28   52:invokespecial   #241 <Method void inflateChildElements(Context, Resources, XmlPullParser, AttributeSet, android.content.res.Resources$Theme)>
		onStateChange(getState());
	//   29   55:aload_0         
	//   30   56:aload_0         
	//   31   57:invokevirtual   #37  <Method int[] getState()>
	//   32   60:invokevirtual   #41  <Method boolean onStateChange(int[])>
	//   33   63:pop             
	//   34   64:return          
	}

	public boolean isStateful()
	{
		return true;
	//    0    0:iconst_1        
	//    1    1:ireturn         
	}

	public Drawable mutate()
	{
		if(!mMutated && super.mutate() == this)
	//*   0    0:aload_0         
	//*   1    1:getfield        #247 <Field boolean mMutated>
	//*   2    4:ifne            27
	//*   3    7:aload_0         
	//*   4    8:invokespecial   #249 <Method Drawable DrawableContainer.mutate()>
	//*   5   11:aload_0         
	//*   6   12:if_acmpne       27
		{
			mStateListState.mutate();
	//    7   15:aload_0         
	//    8   16:getfield        #49  <Field StateListDrawable$StateListState mStateListState>
	//    9   19:invokevirtual   #251 <Method void StateListDrawable$StateListState.mutate()>
			mMutated = true;
	//   10   22:aload_0         
	//   11   23:iconst_1        
	//   12   24:putfield        #247 <Field boolean mMutated>
		}
		return ((Drawable) (this));
	//   13   27:aload_0         
	//   14   28:areturn         
	}

	protected boolean onStateChange(int ai[])
	{
		boolean flag = super.onStateChange(ai);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #252 <Method boolean DrawableContainer.onStateChange(int[])>
	//    3    5:istore          4
		int j = mStateListState.indexOfStateSet(ai);
	//    4    7:aload_0         
	//    5    8:getfield        #49  <Field StateListDrawable$StateListState mStateListState>
	//    6   11:aload_1         
	//    7   12:invokevirtual   #256 <Method int StateListDrawable$StateListState.indexOfStateSet(int[])>
	//    8   15:istore_3        
		int i = j;
	//    9   16:iload_3         
	//   10   17:istore_2        
		if(j < 0)
	//*  11   18:iload_3         
	//*  12   19:ifge            33
			i = mStateListState.indexOfStateSet(StateSet.WILD_CARD);
	//   13   22:aload_0         
	//   14   23:getfield        #49  <Field StateListDrawable$StateListState mStateListState>
	//   15   26:getstatic       #259 <Field int[] StateSet.WILD_CARD>
	//   16   29:invokevirtual   #256 <Method int StateListDrawable$StateListState.indexOfStateSet(int[])>
	//   17   32:istore_2        
		return selectDrawable(i) || flag;
	//   18   33:aload_0         
	//   19   34:iload_2         
	//   20   35:invokevirtual   #263 <Method boolean selectDrawable(int)>
	//   21   38:ifne            51
	//   22   41:iload           4
	//   23   43:ifeq            49
	//   24   46:goto            51
	//   25   49:iconst_0        
	//   26   50:ireturn         
	//   27   51:iconst_1        
	//   28   52:ireturn         
	}

	protected void setConstantState(DrawableContainer.DrawableContainerState drawablecontainerstate)
	{
		super.setConstantState(drawablecontainerstate);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #264 <Method void DrawableContainer.setConstantState(DrawableContainer$DrawableContainerState)>
		if(drawablecontainerstate instanceof StateListState)
	//*   3    5:aload_1         
	//*   4    6:instanceof      #6   <Class StateListDrawable$StateListState>
	//*   5    9:ifeq            20
			mStateListState = (StateListState)drawablecontainerstate;
	//    6   12:aload_0         
	//    7   13:aload_1         
	//    8   14:checkcast       #6   <Class StateListDrawable$StateListState>
	//    9   17:putfield        #49  <Field StateListDrawable$StateListState mStateListState>
	//   10   20:return          
	}

	private boolean mMutated;
	private StateListState mStateListState;
}
