// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.transition;

import android.animation.TimeInterpolator;
import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.support.v4.content.a.c;
import android.util.AndroidRuntimeException;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.Iterator;

// Referenced classes of package android.support.transition:
//			Transition, ac, ah, ai, 
//			ad

public class TransitionSet extends Transition
{
	static class a extends ad
	{

		public void a(Transition transition)
		{
			TransitionSet.b(a);
		//    0    0:aload_0         
		//    1    1:getfield        #15  <Field TransitionSet a>
		//    2    4:invokestatic    #21  <Method int TransitionSet.b(TransitionSet)>
		//    3    7:pop             
			if(android.support.transition.TransitionSet.c(a) == 0)
		//*   4    8:aload_0         
		//*   5    9:getfield        #15  <Field TransitionSet a>
		//*   6   12:invokestatic    #24  <Method int android.support.transition.TransitionSet.c(TransitionSet)>
		//*   7   15:ifne            34
			{
				TransitionSet.a(a, false);
		//    8   18:aload_0         
		//    9   19:getfield        #15  <Field TransitionSet a>
		//   10   22:iconst_0        
		//   11   23:invokestatic    #27  <Method boolean TransitionSet.a(TransitionSet, boolean)>
		//   12   26:pop             
				a.g();
		//   13   27:aload_0         
		//   14   28:getfield        #15  <Field TransitionSet a>
		//   15   31:invokevirtual   #30  <Method void TransitionSet.g()>
			}
			transition.b(((Transition.c) (this)));
		//   16   34:aload_1         
		//   17   35:aload_0         
		//   18   36:invokevirtual   #35  <Method Transition Transition.b(Transition$c)>
		//   19   39:pop             
		//   20   40:return          
		}

		public void d(Transition transition)
		{
			if(!TransitionSet.a(a))
		//*   0    0:aload_0         
		//*   1    1:getfield        #15  <Field TransitionSet a>
		//*   2    4:invokestatic    #39  <Method boolean TransitionSet.a(TransitionSet)>
		//*   3    7:ifne            26
			{
				a.f();
		//    4   10:aload_0         
		//    5   11:getfield        #15  <Field TransitionSet a>
		//    6   14:invokevirtual   #42  <Method void TransitionSet.f()>
				TransitionSet.a(a, true);
		//    7   17:aload_0         
		//    8   18:getfield        #15  <Field TransitionSet a>
		//    9   21:iconst_1        
		//   10   22:invokestatic    #27  <Method boolean TransitionSet.a(TransitionSet, boolean)>
		//   11   25:pop             
			}
		//   12   26:return          
		}

		TransitionSet a;

		a(TransitionSet transitionset)
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #13  <Method void ad()>
			a = transitionset;
		//    2    4:aload_0         
		//    3    5:aload_1         
		//    4    6:putfield        #15  <Field TransitionSet a>
		//    5    9:return          
		}
	}


	public TransitionSet()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #21  <Method void Transition()>
		g = new ArrayList();
	//    2    4:aload_0         
	//    3    5:new             #23  <Class ArrayList>
	//    4    8:dup             
	//    5    9:invokespecial   #24  <Method void ArrayList()>
	//    6   12:putfield        #26  <Field ArrayList g>
		h = true;
	//    7   15:aload_0         
	//    8   16:iconst_1        
	//    9   17:putfield        #28  <Field boolean h>
		j = false;
	//   10   20:aload_0         
	//   11   21:iconst_0        
	//   12   22:putfield        #30  <Field boolean j>
	//   13   25:return          
	}

	public TransitionSet(Context context, AttributeSet attributeset)
	{
		super(context, attributeset);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #34  <Method void Transition(Context, AttributeSet)>
		g = new ArrayList();
	//    4    6:aload_0         
	//    5    7:new             #23  <Class ArrayList>
	//    6   10:dup             
	//    7   11:invokespecial   #24  <Method void ArrayList()>
	//    8   14:putfield        #26  <Field ArrayList g>
		h = true;
	//    9   17:aload_0         
	//   10   18:iconst_1        
	//   11   19:putfield        #28  <Field boolean h>
		j = false;
	//   12   22:aload_0         
	//   13   23:iconst_0        
	//   14   24:putfield        #30  <Field boolean j>
		context = ((Context) (context.obtainStyledAttributes(attributeset, ac.i)));
	//   15   27:aload_1         
	//   16   28:aload_2         
	//   17   29:getstatic       #39  <Field int[] ac.i>
	//   18   32:invokevirtual   #45  <Method TypedArray Context.obtainStyledAttributes(AttributeSet, int[])>
	//   19   35:astore_1        
		a(android.support.v4.content.a.c.a(((TypedArray) (context)), ((org.xmlpull.v1.XmlPullParser) ((XmlResourceParser)attributeset)), "transitionOrdering", 0, 0));
	//   20   36:aload_0         
	//   21   37:aload_1         
	//   22   38:aload_2         
	//   23   39:checkcast       #47  <Class XmlResourceParser>
	//   24   42:ldc1            #49  <String "transitionOrdering">
	//   25   44:iconst_0        
	//   26   45:iconst_0        
	//   27   46:invokestatic    #54  <Method int c.a(TypedArray, org.xmlpull.v1.XmlPullParser, String, int, int)>
	//   28   49:invokevirtual   #57  <Method TransitionSet a(int)>
	//   29   52:pop             
		((TypedArray) (context)).recycle();
	//   30   53:aload_1         
	//   31   54:invokevirtual   #62  <Method void TypedArray.recycle()>
	//   32   57:return          
	}

	static boolean a(TransitionSet transitionset)
	{
		return transitionset.j;
	//    0    0:aload_0         
	//    1    1:getfield        #30  <Field boolean j>
	//    2    4:ireturn         
	}

	static boolean a(TransitionSet transitionset, boolean flag)
	{
		transitionset.j = flag;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #30  <Field boolean j>
		return flag;
	//    3    5:iload_1         
	//    4    6:ireturn         
	}

	static int b(TransitionSet transitionset)
	{
		int k = transitionset.i - 1;
	//    0    0:aload_0         
	//    1    1:getfield        #68  <Field int i>
	//    2    4:iconst_1        
	//    3    5:isub            
	//    4    6:istore_1        
		transitionset.i = k;
	//    5    7:aload_0         
	//    6    8:iload_1         
	//    7    9:putfield        #68  <Field int i>
		return k;
	//    8   12:iload_1         
	//    9   13:ireturn         
	}

	static int c(TransitionSet transitionset)
	{
		return transitionset.i;
	//    0    0:aload_0         
	//    1    1:getfield        #68  <Field int i>
	//    2    4:ireturn         
	}

	private void l()
	{
		a a1 = new a(this);
	//    0    0:new             #8   <Class TransitionSet$a>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokespecial   #73  <Method void TransitionSet$a(TransitionSet)>
	//    4    8:astore_1        
		for(Iterator iterator = g.iterator(); iterator.hasNext(); ((Transition)iterator.next()).a(((Transition.c) (a1))));
	//    5    9:aload_0         
	//    6   10:getfield        #26  <Field ArrayList g>
	//    7   13:invokevirtual   #77  <Method Iterator ArrayList.iterator()>
	//    8   16:astore_2        
	//    9   17:aload_2         
	//   10   18:invokeinterface #83  <Method boolean Iterator.hasNext()>
	//   11   23:ifeq            43
	//   12   26:aload_2         
	//   13   27:invokeinterface #87  <Method Object Iterator.next()>
	//   14   32:checkcast       #4   <Class Transition>
	//   15   35:aload_1         
	//   16   36:invokevirtual   #90  <Method Transition Transition.a(Transition$c)>
	//   17   39:pop             
	//*  18   40:goto            17
		i = g.size();
	//   19   43:aload_0         
	//   20   44:aload_0         
	//   21   45:getfield        #26  <Field ArrayList g>
	//   22   48:invokevirtual   #94  <Method int ArrayList.size()>
	//   23   51:putfield        #68  <Field int i>
	//   24   54:return          
	}

	public Transition a(long l1)
	{
		return ((Transition) (c(l1)));
	//    0    0:aload_0         
	//    1    1:lload_1         
	//    2    2:invokevirtual   #98  <Method TransitionSet c(long)>
	//    3    5:areturn         
	}

	public Transition a(TimeInterpolator timeinterpolator)
	{
		return ((Transition) (b(timeinterpolator)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #102 <Method TransitionSet b(TimeInterpolator)>
	//    3    5:areturn         
	}

	public Transition a(Transition.c c1)
	{
		return ((Transition) (c(c1)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #105 <Method TransitionSet c(Transition$c)>
	//    3    5:areturn         
	}

	public TransitionSet a(int k)
	{
		boolean flag;
		switch(k)
	//*   0    0:iload_1         
		{
	//*   1    1:tableswitch     0 1: default 24
	//	               0 62
	//	               1 57
		default:
			StringBuilder stringbuilder = new StringBuilder();
	//    2   24:new             #107 <Class StringBuilder>
	//    3   27:dup             
	//    4   28:invokespecial   #108 <Method void StringBuilder()>
	//    5   31:astore_3        
			stringbuilder.append("Invalid parameter for TransitionSet ordering: ");
	//    6   32:aload_3         
	//    7   33:ldc1            #110 <String "Invalid parameter for TransitionSet ordering: ">
	//    8   35:invokevirtual   #114 <Method StringBuilder StringBuilder.append(String)>
	//    9   38:pop             
			stringbuilder.append(k);
	//   10   39:aload_3         
	//   11   40:iload_1         
	//   12   41:invokevirtual   #117 <Method StringBuilder StringBuilder.append(int)>
	//   13   44:pop             
			throw new AndroidRuntimeException(stringbuilder.toString());
	//   14   45:new             #119 <Class AndroidRuntimeException>
	//   15   48:dup             
	//   16   49:aload_3         
	//   17   50:invokevirtual   #123 <Method String StringBuilder.toString()>
	//   18   53:invokespecial   #126 <Method void AndroidRuntimeException(String)>
	//   19   56:athrow          

		case 1: // '\001'
			flag = false;
	//   20   57:iconst_0        
	//   21   58:istore_2        
			break;

	//*  22   59:goto            64
		case 0: // '\0'
			flag = true;
	//   23   62:iconst_1        
	//   24   63:istore_2        
			break;
		}
		h = flag;
	//   25   64:aload_0         
	//   26   65:iload_2         
	//   27   66:putfield        #28  <Field boolean h>
		return this;
	//   28   69:aload_0         
	//   29   70:areturn         
	}

	String a(String s)
	{
		Object obj = ((Object) (super.a(s)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #129 <Method String Transition.a(String)>
	//    3    5:astore_3        
		for(int k = 0; k < g.size(); k++)
	//*   4    6:iconst_0        
	//*   5    7:istore_2        
	//*   6    8:iload_2         
	//*   7    9:aload_0         
	//*   8   10:getfield        #26  <Field ArrayList g>
	//*   9   13:invokevirtual   #94  <Method int ArrayList.size()>
	//*  10   16:icmpge          107
		{
			StringBuilder stringbuilder = new StringBuilder();
	//   11   19:new             #107 <Class StringBuilder>
	//   12   22:dup             
	//   13   23:invokespecial   #108 <Method void StringBuilder()>
	//   14   26:astore          4
			stringbuilder.append(((String) (obj)));
	//   15   28:aload           4
	//   16   30:aload_3         
	//   17   31:invokevirtual   #114 <Method StringBuilder StringBuilder.append(String)>
	//   18   34:pop             
			stringbuilder.append("\n");
	//   19   35:aload           4
	//   20   37:ldc1            #131 <String "\n">
	//   21   39:invokevirtual   #114 <Method StringBuilder StringBuilder.append(String)>
	//   22   42:pop             
			obj = ((Object) ((Transition)g.get(k)));
	//   23   43:aload_0         
	//   24   44:getfield        #26  <Field ArrayList g>
	//   25   47:iload_2         
	//   26   48:invokevirtual   #135 <Method Object ArrayList.get(int)>
	//   27   51:checkcast       #4   <Class Transition>
	//   28   54:astore_3        
			StringBuilder stringbuilder1 = new StringBuilder();
	//   29   55:new             #107 <Class StringBuilder>
	//   30   58:dup             
	//   31   59:invokespecial   #108 <Method void StringBuilder()>
	//   32   62:astore          5
			stringbuilder1.append(s);
	//   33   64:aload           5
	//   34   66:aload_1         
	//   35   67:invokevirtual   #114 <Method StringBuilder StringBuilder.append(String)>
	//   36   70:pop             
			stringbuilder1.append("  ");
	//   37   71:aload           5
	//   38   73:ldc1            #137 <String "  ">
	//   39   75:invokevirtual   #114 <Method StringBuilder StringBuilder.append(String)>
	//   40   78:pop             
			stringbuilder.append(((Transition) (obj)).a(stringbuilder1.toString()));
	//   41   79:aload           4
	//   42   81:aload_3         
	//   43   82:aload           5
	//   44   84:invokevirtual   #123 <Method String StringBuilder.toString()>
	//   45   87:invokevirtual   #129 <Method String Transition.a(String)>
	//   46   90:invokevirtual   #114 <Method StringBuilder StringBuilder.append(String)>
	//   47   93:pop             
			obj = ((Object) (stringbuilder.toString()));
	//   48   94:aload           4
	//   49   96:invokevirtual   #123 <Method String StringBuilder.toString()>
	//   50   99:astore_3        
		}

	//   51  100:iload_2         
	//   52  101:iconst_1        
	//   53  102:iadd            
	//   54  103:istore_2        
	//*  55  104:goto            8
		return ((String) (obj));
	//   56  107:aload_3         
	//   57  108:areturn         
	}

	public void a(ah ah1)
	{
		if(b(ah1.b))
	//*   0    0:aload_0         
	//*   1    1:aload_1         
	//*   2    2:getfield        #143 <Field View ah.b>
	//*   3    5:invokevirtual   #146 <Method boolean b(View)>
	//*   4    8:ifeq            66
		{
			Iterator iterator = g.iterator();
	//    5   11:aload_0         
	//    6   12:getfield        #26  <Field ArrayList g>
	//    7   15:invokevirtual   #77  <Method Iterator ArrayList.iterator()>
	//    8   18:astore_2        
			do
			{
				if(!iterator.hasNext())
					break;
	//    9   19:aload_2         
	//   10   20:invokeinterface #83  <Method boolean Iterator.hasNext()>
	//   11   25:ifeq            66
				Transition transition = (Transition)iterator.next();
	//   12   28:aload_2         
	//   13   29:invokeinterface #87  <Method Object Iterator.next()>
	//   14   34:checkcast       #4   <Class Transition>
	//   15   37:astore_3        
				if(transition.b(ah1.b))
	//*  16   38:aload_3         
	//*  17   39:aload_1         
	//*  18   40:getfield        #143 <Field View ah.b>
	//*  19   43:invokevirtual   #147 <Method boolean Transition.b(View)>
	//*  20   46:ifeq            19
				{
					transition.a(ah1);
	//   21   49:aload_3         
	//   22   50:aload_1         
	//   23   51:invokevirtual   #149 <Method void Transition.a(ah)>
					ah1.c.add(((Object) (transition)));
	//   24   54:aload_1         
	//   25   55:getfield        #151 <Field ArrayList android.support.transition.ah.c>
	//   26   58:aload_3         
	//   27   59:invokevirtual   #155 <Method boolean ArrayList.add(Object)>
	//   28   62:pop             
				}
			} while(true);
	//   29   63:goto            19
		}
	//   30   66:return          
	}

	protected void a(ViewGroup viewgroup, ai ai, ai ai1, ArrayList arraylist, ArrayList arraylist1)
	{
		long l1 = c();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #159 <Method long c()>
	//    2    4:lstore          8
		int i1 = g.size();
	//    3    6:aload_0         
	//    4    7:getfield        #26  <Field ArrayList g>
	//    5   10:invokevirtual   #94  <Method int ArrayList.size()>
	//    6   13:istore          7
		for(int k = 0; k < i1; k++)
	//*   7   15:iconst_0        
	//*   8   16:istore          6
	//*   9   18:iload           6
	//*  10   20:iload           7
	//*  11   22:icmpge          115
		{
			Transition transition = (Transition)g.get(k);
	//   12   25:aload_0         
	//   13   26:getfield        #26  <Field ArrayList g>
	//   14   29:iload           6
	//   15   31:invokevirtual   #135 <Method Object ArrayList.get(int)>
	//   16   34:checkcast       #4   <Class Transition>
	//   17   37:astore          12
			if(l1 > 0L && (h || k == 0))
	//*  18   39:lload           8
	//*  19   41:lconst_0        
	//*  20   42:lcmp            
	//*  21   43:ifle            94
	//*  22   46:aload_0         
	//*  23   47:getfield        #28  <Field boolean h>
	//*  24   50:ifne            58
	//*  25   53:iload           6
	//*  26   55:ifne            94
			{
				long l2 = transition.c();
	//   27   58:aload           12
	//   28   60:invokevirtual   #160 <Method long android.support.transition.Transition.c()>
	//   29   63:lstore          10
				if(l2 > 0L)
	//*  30   65:lload           10
	//*  31   67:lconst_0        
	//*  32   68:lcmp            
	//*  33   69:ifle            86
					transition.b(l2 + l1);
	//   34   72:aload           12
	//   35   74:lload           10
	//   36   76:lload           8
	//   37   78:ladd            
	//   38   79:invokevirtual   #162 <Method Transition Transition.b(long)>
	//   39   82:pop             
				else
	//*  40   83:goto            94
					transition.b(l1);
	//   41   86:aload           12
	//   42   88:lload           8
	//   43   90:invokevirtual   #162 <Method Transition Transition.b(long)>
	//   44   93:pop             
			}
			transition.a(viewgroup, ai, ai1, arraylist, arraylist1);
	//   45   94:aload           12
	//   46   96:aload_1         
	//   47   97:aload_2         
	//   48   98:aload_3         
	//   49   99:aload           4
	//   50  101:aload           5
	//   51  103:invokevirtual   #164 <Method void Transition.a(ViewGroup, ai, ai, ArrayList, ArrayList)>
		}

	//   52  106:iload           6
	//   53  108:iconst_1        
	//   54  109:iadd            
	//   55  110:istore          6
	//*  56  112:goto            18
	//   57  115:return          
	}

	public Transition b(long l1)
	{
		return ((Transition) (d(l1)));
	//    0    0:aload_0         
	//    1    1:lload_1         
	//    2    2:invokevirtual   #169 <Method TransitionSet d(long)>
	//    3    5:areturn         
	}

	public Transition b(Transition.c c1)
	{
		return ((Transition) (d(c1)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #171 <Method TransitionSet d(Transition$c)>
	//    3    5:areturn         
	}

	public TransitionSet b(TimeInterpolator timeinterpolator)
	{
		return (TransitionSet)super.a(timeinterpolator);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #173 <Method Transition Transition.a(TimeInterpolator)>
	//    3    5:checkcast       #2   <Class TransitionSet>
	//    4    8:areturn         
	}

	public TransitionSet b(Transition transition)
	{
		g.add(((Object) (transition)));
	//    0    0:aload_0         
	//    1    1:getfield        #26  <Field ArrayList g>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #155 <Method boolean ArrayList.add(Object)>
	//    4    8:pop             
		transition.d = this;
	//    5    9:aload_1         
	//    6   10:aload_0         
	//    7   11:putfield        #177 <Field TransitionSet Transition.d>
		if(a >= 0L)
	//*   8   14:aload_0         
	//*   9   15:getfield        #180 <Field long a>
	//*  10   18:lconst_0        
	//*  11   19:lcmp            
	//*  12   20:iflt            32
			transition.a(a);
	//   13   23:aload_1         
	//   14   24:aload_0         
	//   15   25:getfield        #180 <Field long a>
	//   16   28:invokevirtual   #182 <Method Transition Transition.a(long)>
	//   17   31:pop             
		return this;
	//   18   32:aload_0         
	//   19   33:areturn         
	}

	public void b(ah ah1)
	{
		if(b(ah1.b))
	//*   0    0:aload_0         
	//*   1    1:aload_1         
	//*   2    2:getfield        #143 <Field View ah.b>
	//*   3    5:invokevirtual   #146 <Method boolean b(View)>
	//*   4    8:ifeq            66
		{
			Iterator iterator = g.iterator();
	//    5   11:aload_0         
	//    6   12:getfield        #26  <Field ArrayList g>
	//    7   15:invokevirtual   #77  <Method Iterator ArrayList.iterator()>
	//    8   18:astore_2        
			do
			{
				if(!iterator.hasNext())
					break;
	//    9   19:aload_2         
	//   10   20:invokeinterface #83  <Method boolean Iterator.hasNext()>
	//   11   25:ifeq            66
				Transition transition = (Transition)iterator.next();
	//   12   28:aload_2         
	//   13   29:invokeinterface #87  <Method Object Iterator.next()>
	//   14   34:checkcast       #4   <Class Transition>
	//   15   37:astore_3        
				if(transition.b(ah1.b))
	//*  16   38:aload_3         
	//*  17   39:aload_1         
	//*  18   40:getfield        #143 <Field View ah.b>
	//*  19   43:invokevirtual   #147 <Method boolean Transition.b(View)>
	//*  20   46:ifeq            19
				{
					transition.b(ah1);
	//   21   49:aload_3         
	//   22   50:aload_1         
	//   23   51:invokevirtual   #184 <Method void Transition.b(ah)>
					ah1.c.add(((Object) (transition)));
	//   24   54:aload_1         
	//   25   55:getfield        #151 <Field ArrayList android.support.transition.ah.c>
	//   26   58:aload_3         
	//   27   59:invokevirtual   #155 <Method boolean ArrayList.add(Object)>
	//   28   62:pop             
				}
			} while(true);
	//   29   63:goto            19
		}
	//   30   66:return          
	}

	public TransitionSet c(long l1)
	{
		super.a(l1);
	//    0    0:aload_0         
	//    1    1:lload_1         
	//    2    2:invokespecial   #182 <Method Transition Transition.a(long)>
	//    3    5:pop             
		if(a >= 0L)
	//*   4    6:aload_0         
	//*   5    7:getfield        #180 <Field long a>
	//*   6   10:lconst_0        
	//*   7   11:lcmp            
	//*   8   12:iflt            55
		{
			int i1 = g.size();
	//    9   15:aload_0         
	//   10   16:getfield        #26  <Field ArrayList g>
	//   11   19:invokevirtual   #94  <Method int ArrayList.size()>
	//   12   22:istore          4
			for(int k = 0; k < i1; k++)
	//*  13   24:iconst_0        
	//*  14   25:istore_3        
	//*  15   26:iload_3         
	//*  16   27:iload           4
	//*  17   29:icmpge          55
				((Transition)g.get(k)).a(l1);
	//   18   32:aload_0         
	//   19   33:getfield        #26  <Field ArrayList g>
	//   20   36:iload_3         
	//   21   37:invokevirtual   #135 <Method Object ArrayList.get(int)>
	//   22   40:checkcast       #4   <Class Transition>
	//   23   43:lload_1         
	//   24   44:invokevirtual   #182 <Method Transition Transition.a(long)>
	//   25   47:pop             

	//   26   48:iload_3         
	//   27   49:iconst_1        
	//   28   50:iadd            
	//   29   51:istore_3        
		}
	//*  30   52:goto            26
		return this;
	//   31   55:aload_0         
	//   32   56:areturn         
	}

	public TransitionSet c(Transition.c c1)
	{
		return (TransitionSet)super.a(c1);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #90  <Method Transition Transition.a(Transition$c)>
	//    3    5:checkcast       #2   <Class TransitionSet>
	//    4    8:areturn         
	}

	void c(ah ah1)
	{
		super.c(ah1);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #186 <Method void android.support.transition.Transition.c(ah)>
		int i1 = g.size();
	//    3    5:aload_0         
	//    4    6:getfield        #26  <Field ArrayList g>
	//    5    9:invokevirtual   #94  <Method int ArrayList.size()>
	//    6   12:istore_3        
		for(int k = 0; k < i1; k++)
	//*   7   13:iconst_0        
	//*   8   14:istore_2        
	//*   9   15:iload_2         
	//*  10   16:iload_3         
	//*  11   17:icmpge          42
			((Transition)g.get(k)).c(ah1);
	//   12   20:aload_0         
	//   13   21:getfield        #26  <Field ArrayList g>
	//   14   24:iload_2         
	//   15   25:invokevirtual   #135 <Method Object ArrayList.get(int)>
	//   16   28:checkcast       #4   <Class Transition>
	//   17   31:aload_1         
	//   18   32:invokevirtual   #186 <Method void android.support.transition.Transition.c(ah)>

	//   19   35:iload_2         
	//   20   36:iconst_1        
	//   21   37:iadd            
	//   22   38:istore_2        
	//*  23   39:goto            15
	//   24   42:return          
	}

	public void c(View view)
	{
		super.c(view);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #189 <Method void android.support.transition.Transition.c(View)>
		int i1 = g.size();
	//    3    5:aload_0         
	//    4    6:getfield        #26  <Field ArrayList g>
	//    5    9:invokevirtual   #94  <Method int ArrayList.size()>
	//    6   12:istore_3        
		for(int k = 0; k < i1; k++)
	//*   7   13:iconst_0        
	//*   8   14:istore_2        
	//*   9   15:iload_2         
	//*  10   16:iload_3         
	//*  11   17:icmpge          42
			((Transition)g.get(k)).c(view);
	//   12   20:aload_0         
	//   13   21:getfield        #26  <Field ArrayList g>
	//   14   24:iload_2         
	//   15   25:invokevirtual   #135 <Method Object ArrayList.get(int)>
	//   16   28:checkcast       #4   <Class Transition>
	//   17   31:aload_1         
	//   18   32:invokevirtual   #189 <Method void android.support.transition.Transition.c(View)>

	//   19   35:iload_2         
	//   20   36:iconst_1        
	//   21   37:iadd            
	//   22   38:istore_2        
	//*  23   39:goto            15
	//   24   42:return          
	}

	public Object clone()
	{
		return ((Object) (j()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #193 <Method Transition j()>
	//    2    4:areturn         
	}

	public TransitionSet d(long l1)
	{
		return (TransitionSet)super.b(l1);
	//    0    0:aload_0         
	//    1    1:lload_1         
	//    2    2:invokespecial   #162 <Method Transition Transition.b(long)>
	//    3    5:checkcast       #2   <Class TransitionSet>
	//    4    8:areturn         
	}

	public TransitionSet d(Transition.c c1)
	{
		return (TransitionSet)super.b(c1);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #195 <Method Transition Transition.b(Transition$c)>
	//    3    5:checkcast       #2   <Class TransitionSet>
	//    4    8:areturn         
	}

	public void d(View view)
	{
		super.d(view);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #197 <Method void Transition.d(View)>
		int i1 = g.size();
	//    3    5:aload_0         
	//    4    6:getfield        #26  <Field ArrayList g>
	//    5    9:invokevirtual   #94  <Method int ArrayList.size()>
	//    6   12:istore_3        
		for(int k = 0; k < i1; k++)
	//*   7   13:iconst_0        
	//*   8   14:istore_2        
	//*   9   15:iload_2         
	//*  10   16:iload_3         
	//*  11   17:icmpge          42
			((Transition)g.get(k)).d(view);
	//   12   20:aload_0         
	//   13   21:getfield        #26  <Field ArrayList g>
	//   14   24:iload_2         
	//   15   25:invokevirtual   #135 <Method Object ArrayList.get(int)>
	//   16   28:checkcast       #4   <Class Transition>
	//   17   31:aload_1         
	//   18   32:invokevirtual   #197 <Method void Transition.d(View)>

	//   19   35:iload_2         
	//   20   36:iconst_1        
	//   21   37:iadd            
	//   22   38:istore_2        
	//*  23   39:goto            15
	//   24   42:return          
	}

	protected void e()
	{
		if(g.isEmpty())
	//*   0    0:aload_0         
	//*   1    1:getfield        #26  <Field ArrayList g>
	//*   2    4:invokevirtual   #201 <Method boolean ArrayList.isEmpty()>
	//*   3    7:ifeq            19
		{
			f();
	//    4   10:aload_0         
	//    5   11:invokevirtual   #204 <Method void f()>
			g();
	//    6   14:aload_0         
	//    7   15:invokevirtual   #206 <Method void g()>
			return;
	//    8   18:return          
		}
		l();
	//    9   19:aload_0         
	//   10   20:invokespecial   #208 <Method void l()>
		if(!h)
	//*  11   23:aload_0         
	//*  12   24:getfield        #28  <Field boolean h>
	//*  13   27:ifne            107
		{
			for(int k = 1; k < g.size(); k++)
	//*  14   30:iconst_1        
	//*  15   31:istore_1        
	//*  16   32:iload_1         
	//*  17   33:aload_0         
	//*  18   34:getfield        #26  <Field ArrayList g>
	//*  19   37:invokevirtual   #94  <Method int ArrayList.size()>
	//*  20   40:icmpge          86
				((Transition)g.get(k - 1)).a(((Transition.c) (new ad((Transition)g.get(k)) {

					public void a(Transition transition1)
					{
						a.e();
					//    0    0:aload_0         
					//    1    1:getfield        #19  <Field Transition a>
					//    2    4:invokevirtual   #26  <Method void Transition.e()>
						transition1.b(((Transition.c) (this)));
					//    3    7:aload_1         
					//    4    8:aload_0         
					//    5    9:invokevirtual   #29  <Method Transition Transition.b(Transition$c)>
					//    6   12:pop             
					//    7   13:return          
					}

					final Transition a;
					final TransitionSet b;

			
			{
				b = TransitionSet.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #17  <Field TransitionSet b>
				a = transition;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #19  <Field Transition a>
				super();
			//    6   10:aload_0         
			//    7   11:invokespecial   #21  <Method void ad()>
			//    8   14:return          
			}
				}
)));
	//   21   43:aload_0         
	//   22   44:getfield        #26  <Field ArrayList g>
	//   23   47:iload_1         
	//   24   48:iconst_1        
	//   25   49:isub            
	//   26   50:invokevirtual   #135 <Method Object ArrayList.get(int)>
	//   27   53:checkcast       #4   <Class Transition>
	//   28   56:new             #6   <Class TransitionSet$1>
	//   29   59:dup             
	//   30   60:aload_0         
	//   31   61:aload_0         
	//   32   62:getfield        #26  <Field ArrayList g>
	//   33   65:iload_1         
	//   34   66:invokevirtual   #135 <Method Object ArrayList.get(int)>
	//   35   69:checkcast       #4   <Class Transition>
	//   36   72:invokespecial   #211 <Method void TransitionSet$1(TransitionSet, Transition)>
	//   37   75:invokevirtual   #90  <Method Transition Transition.a(Transition$c)>
	//   38   78:pop             

	//   39   79:iload_1         
	//   40   80:iconst_1        
	//   41   81:iadd            
	//   42   82:istore_1        
	//*  43   83:goto            32
			Transition transition = (Transition)g.get(0);
	//   44   86:aload_0         
	//   45   87:getfield        #26  <Field ArrayList g>
	//   46   90:iconst_0        
	//   47   91:invokevirtual   #135 <Method Object ArrayList.get(int)>
	//   48   94:checkcast       #4   <Class Transition>
	//   49   97:astore_2        
			if(transition != null)
	//*  50   98:aload_2         
	//*  51   99:ifnull          139
			{
				transition.e();
	//   52  102:aload_2         
	//   53  103:invokevirtual   #213 <Method void Transition.e()>
				return;
	//   54  106:return          
			}
		} else
		{
			for(Iterator iterator = g.iterator(); iterator.hasNext(); ((Transition)iterator.next()).e());
	//   55  107:aload_0         
	//   56  108:getfield        #26  <Field ArrayList g>
	//   57  111:invokevirtual   #77  <Method Iterator ArrayList.iterator()>
	//   58  114:astore_2        
	//   59  115:aload_2         
	//   60  116:invokeinterface #83  <Method boolean Iterator.hasNext()>
	//   61  121:ifeq            139
	//   62  124:aload_2         
	//   63  125:invokeinterface #87  <Method Object Iterator.next()>
	//   64  130:checkcast       #4   <Class Transition>
	//   65  133:invokevirtual   #213 <Method void Transition.e()>
		}
	//*  66  136:goto            115
	//   67  139:return          
	}

	public Transition j()
	{
		TransitionSet transitionset = (TransitionSet)super.j();
	//    0    0:aload_0         
	//    1    1:invokespecial   #214 <Method Transition Transition.j()>
	//    2    4:checkcast       #2   <Class TransitionSet>
	//    3    7:astore_3        
		transitionset.g = new ArrayList();
	//    4    8:aload_3         
	//    5    9:new             #23  <Class ArrayList>
	//    6   12:dup             
	//    7   13:invokespecial   #24  <Method void ArrayList()>
	//    8   16:putfield        #26  <Field ArrayList g>
		int i1 = g.size();
	//    9   19:aload_0         
	//   10   20:getfield        #26  <Field ArrayList g>
	//   11   23:invokevirtual   #94  <Method int ArrayList.size()>
	//   12   26:istore_2        
		for(int k = 0; k < i1; k++)
	//*  13   27:iconst_0        
	//*  14   28:istore_1        
	//*  15   29:iload_1         
	//*  16   30:iload_2         
	//*  17   31:icmpge          60
			transitionset.b(((Transition)g.get(k)).j());
	//   18   34:aload_3         
	//   19   35:aload_0         
	//   20   36:getfield        #26  <Field ArrayList g>
	//   21   39:iload_1         
	//   22   40:invokevirtual   #135 <Method Object ArrayList.get(int)>
	//   23   43:checkcast       #4   <Class Transition>
	//   24   46:invokevirtual   #214 <Method Transition Transition.j()>
	//   25   49:invokevirtual   #216 <Method TransitionSet b(Transition)>
	//   26   52:pop             

	//   27   53:iload_1         
	//   28   54:iconst_1        
	//   29   55:iadd            
	//   30   56:istore_1        
	//*  31   57:goto            29
		return ((Transition) (transitionset));
	//   32   60:aload_3         
	//   33   61:areturn         
	}

	private ArrayList g;
	private boolean h;
	private int i;
	private boolean j;
}
