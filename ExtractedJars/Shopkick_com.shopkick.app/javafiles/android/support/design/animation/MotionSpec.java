// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.design.animation;

import android.animation.*;
import android.content.Context;
import android.content.res.TypedArray;
import android.support.v4.util.SimpleArrayMap;
import android.util.Log;
import java.util.ArrayList;
import java.util.List;

// Referenced classes of package android.support.design.animation:
//			MotionTiming

public class MotionSpec
{

	public MotionSpec()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #15  <Method void Object()>
	//    2    4:aload_0         
	//    3    5:new             #17  <Class SimpleArrayMap>
	//    4    8:dup             
	//    5    9:invokespecial   #18  <Method void SimpleArrayMap()>
	//    6   12:putfield        #20  <Field SimpleArrayMap timings>
	//    7   15:return          
	}

	private static void addTimingFromAnimator(MotionSpec motionspec, Animator animator)
	{
		if(animator instanceof ObjectAnimator)
	//*   0    0:aload_1         
	//*   1    1:instanceof      #25  <Class ObjectAnimator>
	//*   2    4:ifeq            25
		{
			animator = ((Animator) ((ObjectAnimator)animator));
	//    3    7:aload_1         
	//    4    8:checkcast       #25  <Class ObjectAnimator>
	//    5   11:astore_1        
			motionspec.setTiming(((ObjectAnimator) (animator)).getPropertyName(), MotionTiming.createFromAnimator(((android.animation.ValueAnimator) (animator))));
	//    6   12:aload_0         
	//    7   13:aload_1         
	//    8   14:invokevirtual   #29  <Method String ObjectAnimator.getPropertyName()>
	//    9   17:aload_1         
	//   10   18:invokestatic    #35  <Method MotionTiming MotionTiming.createFromAnimator(android.animation.ValueAnimator)>
	//   11   21:invokevirtual   #39  <Method void setTiming(String, MotionTiming)>
			return;
	//   12   24:return          
		} else
		{
			motionspec = ((MotionSpec) (new StringBuilder()));
	//   13   25:new             #41  <Class StringBuilder>
	//   14   28:dup             
	//   15   29:invokespecial   #42  <Method void StringBuilder()>
	//   16   32:astore_0        
			((StringBuilder) (motionspec)).append("Animator must be an ObjectAnimator: ");
	//   17   33:aload_0         
	//   18   34:ldc1            #44  <String "Animator must be an ObjectAnimator: ">
	//   19   36:invokevirtual   #48  <Method StringBuilder StringBuilder.append(String)>
	//   20   39:pop             
			((StringBuilder) (motionspec)).append(((Object) (animator)));
	//   21   40:aload_0         
	//   22   41:aload_1         
	//   23   42:invokevirtual   #51  <Method StringBuilder StringBuilder.append(Object)>
	//   24   45:pop             
			throw new IllegalArgumentException(((StringBuilder) (motionspec)).toString());
	//   25   46:new             #53  <Class IllegalArgumentException>
	//   26   49:dup             
	//   27   50:aload_0         
	//   28   51:invokevirtual   #56  <Method String StringBuilder.toString()>
	//   29   54:invokespecial   #59  <Method void IllegalArgumentException(String)>
	//   30   57:athrow          
		}
	}

	public static MotionSpec createFromAttribute(Context context, TypedArray typedarray, int i)
	{
		if(typedarray.hasValue(i))
	//*   0    0:aload_1         
	//*   1    1:iload_2         
	//*   2    2:invokevirtual   #69  <Method boolean TypedArray.hasValue(int)>
	//*   3    5:ifeq            25
		{
			i = typedarray.getResourceId(i, 0);
	//    4    8:aload_1         
	//    5    9:iload_2         
	//    6   10:iconst_0        
	//    7   11:invokevirtual   #73  <Method int TypedArray.getResourceId(int, int)>
	//    8   14:istore_2        
			if(i != 0)
	//*   9   15:iload_2         
	//*  10   16:ifeq            25
				return createFromResource(context, i);
	//   11   19:aload_0         
	//   12   20:iload_2         
	//   13   21:invokestatic    #77  <Method MotionSpec createFromResource(Context, int)>
	//   14   24:areturn         
		}
		return null;
	//   15   25:aconst_null     
	//   16   26:areturn         
	}

	public static MotionSpec createFromResource(Context context, int i)
	{
		ArrayList arraylist;
		try
		{
			context = ((Context) (AnimatorInflater.loadAnimator(context, i)));
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokestatic    #88  <Method Animator AnimatorInflater.loadAnimator(Context, int)>
	//    3    5:astore_0        
			if(context instanceof AnimatorSet)
	//*   4    6:aload_0         
	//*   5    7:instanceof      #90  <Class AnimatorSet>
	//*   6   10:ifeq            24
				return createSpecFromAnimators(((List) (((AnimatorSet)context).getChildAnimations())));
	//    7   13:aload_0         
	//    8   14:checkcast       #90  <Class AnimatorSet>
	//    9   17:invokevirtual   #94  <Method ArrayList AnimatorSet.getChildAnimations()>
	//   10   20:invokestatic    #98  <Method MotionSpec createSpecFromAnimators(List)>
	//   11   23:areturn         
		}
	//*  12   24:aload_0         
	//*  13   25:ifnull          51
	//*  14   28:new             #100 <Class ArrayList>
	//*  15   31:dup             
	//*  16   32:invokespecial   #101 <Method void ArrayList()>
	//*  17   35:astore_2        
	//*  18   36:aload_2         
	//*  19   37:aload_0         
	//*  20   38:invokeinterface #107 <Method boolean List.add(Object)>
	//*  21   43:pop             
	//*  22   44:aload_2         
	//*  23   45:invokestatic    #98  <Method MotionSpec createSpecFromAnimators(List)>
	//*  24   48:astore_0        
	//*  25   49:aload_0         
	//*  26   50:areturn         
	//*  27   51:aconst_null     
	//*  28   52:areturn         
		// Misplaced declaration of an exception variable
		catch(Context context)
	//*  29   53:astore_0        
		{
			StringBuilder stringbuilder = new StringBuilder();
	//   30   54:new             #41  <Class StringBuilder>
	//   31   57:dup             
	//   32   58:invokespecial   #42  <Method void StringBuilder()>
	//   33   61:astore_2        
			stringbuilder.append("Can't load animation resource ID #0x");
	//   34   62:aload_2         
	//   35   63:ldc1            #109 <String "Can't load animation resource ID #0x">
	//   36   65:invokevirtual   #48  <Method StringBuilder StringBuilder.append(String)>
	//   37   68:pop             
			stringbuilder.append(Integer.toHexString(i));
	//   38   69:aload_2         
	//   39   70:iload_1         
	//   40   71:invokestatic    #115 <Method String Integer.toHexString(int)>
	//   41   74:invokevirtual   #48  <Method StringBuilder StringBuilder.append(String)>
	//   42   77:pop             
			Log.w("MotionSpec", stringbuilder.toString(), ((Throwable) (context)));
	//   43   78:ldc1            #8   <String "MotionSpec">
	//   44   80:aload_2         
	//   45   81:invokevirtual   #56  <Method String StringBuilder.toString()>
	//   46   84:aload_0         
	//   47   85:invokestatic    #121 <Method int Log.w(String, String, Throwable)>
	//   48   88:pop             
			return null;
	//   49   89:aconst_null     
	//   50   90:areturn         
		}
		if(context == null)
			break MISSING_BLOCK_LABEL_51;
		arraylist = new ArrayList();
		((List) (arraylist)).add(((Object) (context)));
		context = ((Context) (createSpecFromAnimators(((List) (arraylist)))));
		return ((MotionSpec) (context));
		return null;
	}

	private static MotionSpec createSpecFromAnimators(List list)
	{
		MotionSpec motionspec = new MotionSpec();
	//    0    0:new             #2   <Class MotionSpec>
	//    1    3:dup             
	//    2    4:invokespecial   #122 <Method void MotionSpec()>
	//    3    7:astore_3        
		int j = list.size();
	//    4    8:aload_0         
	//    5    9:invokeinterface #126 <Method int List.size()>
	//    6   14:istore_2        
		for(int i = 0; i < j; i++)
	//*   7   15:iconst_0        
	//*   8   16:istore_1        
	//*   9   17:iload_1         
	//*  10   18:iload_2         
	//*  11   19:icmpge          43
			addTimingFromAnimator(motionspec, (Animator)list.get(i));
	//   12   22:aload_3         
	//   13   23:aload_0         
	//   14   24:iload_1         
	//   15   25:invokeinterface #130 <Method Object List.get(int)>
	//   16   30:checkcast       #132 <Class Animator>
	//   17   33:invokestatic    #134 <Method void addTimingFromAnimator(MotionSpec, Animator)>

	//   18   36:iload_1         
	//   19   37:iconst_1        
	//   20   38:iadd            
	//   21   39:istore_1        
	//*  22   40:goto            17
		return motionspec;
	//   23   43:aload_3         
	//   24   44:areturn         
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
		if(obj != null && ((Object)this).getClass() == obj.getClass())
	//*   5    7:aload_1         
	//*   6    8:ifnull          42
	//*   7   11:aload_0         
	//*   8   12:invokevirtual   #141 <Method Class Object.getClass()>
	//*   9   15:aload_1         
	//*  10   16:invokevirtual   #141 <Method Class Object.getClass()>
	//*  11   19:if_acmpeq       25
	//*  12   22:goto            42
		{
			obj = ((Object) ((MotionSpec)obj));
	//   13   25:aload_1         
	//   14   26:checkcast       #2   <Class MotionSpec>
	//   15   29:astore_1        
			return timings.equals(((Object) (((MotionSpec) (obj)).timings)));
	//   16   30:aload_0         
	//   17   31:getfield        #20  <Field SimpleArrayMap timings>
	//   18   34:aload_1         
	//   19   35:getfield        #20  <Field SimpleArrayMap timings>
	//   20   38:invokevirtual   #143 <Method boolean SimpleArrayMap.equals(Object)>
	//   21   41:ireturn         
		} else
		{
			return false;
	//   22   42:iconst_0        
	//   23   43:ireturn         
		}
	}

	public MotionTiming getTiming(String s)
	{
		if(hasTiming(s))
	//*   0    0:aload_0         
	//*   1    1:aload_1         
	//*   2    2:invokevirtual   #149 <Method boolean hasTiming(String)>
	//*   3    5:ifeq            20
			return (MotionTiming)timings.get(((Object) (s)));
	//    4    8:aload_0         
	//    5    9:getfield        #20  <Field SimpleArrayMap timings>
	//    6   12:aload_1         
	//    7   13:invokevirtual   #152 <Method Object SimpleArrayMap.get(Object)>
	//    8   16:checkcast       #31  <Class MotionTiming>
	//    9   19:areturn         
		else
			throw new IllegalArgumentException();
	//   10   20:new             #53  <Class IllegalArgumentException>
	//   11   23:dup             
	//   12   24:invokespecial   #153 <Method void IllegalArgumentException()>
	//   13   27:athrow          
	}

	public long getTotalDuration()
	{
		int j = timings.size();
	//    0    0:aload_0         
	//    1    1:getfield        #20  <Field SimpleArrayMap timings>
	//    2    4:invokevirtual   #156 <Method int SimpleArrayMap.size()>
	//    3    7:istore_2        
		long l = 0L;
	//    4    8:lconst_0        
	//    5    9:lstore_3        
		for(int i = 0; i < j; i++)
	//*   6   10:iconst_0        
	//*   7   11:istore_1        
	//*   8   12:iload_1         
	//*   9   13:iload_2         
	//*  10   14:icmpge          53
		{
			MotionTiming motiontiming = (MotionTiming)timings.valueAt(i);
	//   11   17:aload_0         
	//   12   18:getfield        #20  <Field SimpleArrayMap timings>
	//   13   21:iload_1         
	//   14   22:invokevirtual   #159 <Method Object SimpleArrayMap.valueAt(int)>
	//   15   25:checkcast       #31  <Class MotionTiming>
	//   16   28:astore          5
			l = Math.max(l, motiontiming.getDelay() + motiontiming.getDuration());
	//   17   30:lload_3         
	//   18   31:aload           5
	//   19   33:invokevirtual   #162 <Method long MotionTiming.getDelay()>
	//   20   36:aload           5
	//   21   38:invokevirtual   #165 <Method long MotionTiming.getDuration()>
	//   22   41:ladd            
	//   23   42:invokestatic    #171 <Method long Math.max(long, long)>
	//   24   45:lstore_3        
		}

	//   25   46:iload_1         
	//   26   47:iconst_1        
	//   27   48:iadd            
	//   28   49:istore_1        
	//*  29   50:goto            12
		return l;
	//   30   53:lload_3         
	//   31   54:lreturn         
	}

	public boolean hasTiming(String s)
	{
		return timings.get(((Object) (s))) != null;
	//    0    0:aload_0         
	//    1    1:getfield        #20  <Field SimpleArrayMap timings>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #152 <Method Object SimpleArrayMap.get(Object)>
	//    4    8:ifnull          13
	//    5   11:iconst_1        
	//    6   12:ireturn         
	//    7   13:iconst_0        
	//    8   14:ireturn         
	}

	public int hashCode()
	{
		return timings.hashCode();
	//    0    0:aload_0         
	//    1    1:getfield        #20  <Field SimpleArrayMap timings>
	//    2    4:invokevirtual   #174 <Method int SimpleArrayMap.hashCode()>
	//    3    7:ireturn         
	}

	public void setTiming(String s, MotionTiming motiontiming)
	{
		timings.put(((Object) (s)), ((Object) (motiontiming)));
	//    0    0:aload_0         
	//    1    1:getfield        #20  <Field SimpleArrayMap timings>
	//    2    4:aload_1         
	//    3    5:aload_2         
	//    4    6:invokevirtual   #178 <Method Object SimpleArrayMap.put(Object, Object)>
	//    5    9:pop             
	//    6   10:return          
	}

	public String toString()
	{
		StringBuilder stringbuilder = new StringBuilder();
	//    0    0:new             #41  <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #42  <Method void StringBuilder()>
	//    3    7:astore_1        
		stringbuilder.append('\n');
	//    4    8:aload_1         
	//    5    9:bipush          10
	//    6   11:invokevirtual   #181 <Method StringBuilder StringBuilder.append(char)>
	//    7   14:pop             
		stringbuilder.append(((Object)this).getClass().getName());
	//    8   15:aload_1         
	//    9   16:aload_0         
	//   10   17:invokevirtual   #141 <Method Class Object.getClass()>
	//   11   20:invokevirtual   #186 <Method String Class.getName()>
	//   12   23:invokevirtual   #48  <Method StringBuilder StringBuilder.append(String)>
	//   13   26:pop             
		stringbuilder.append('{');
	//   14   27:aload_1         
	//   15   28:bipush          123
	//   16   30:invokevirtual   #181 <Method StringBuilder StringBuilder.append(char)>
	//   17   33:pop             
		stringbuilder.append(Integer.toHexString(System.identityHashCode(((Object) (this)))));
	//   18   34:aload_1         
	//   19   35:aload_0         
	//   20   36:invokestatic    #192 <Method int System.identityHashCode(Object)>
	//   21   39:invokestatic    #115 <Method String Integer.toHexString(int)>
	//   22   42:invokevirtual   #48  <Method StringBuilder StringBuilder.append(String)>
	//   23   45:pop             
		stringbuilder.append(" timings: ");
	//   24   46:aload_1         
	//   25   47:ldc1            #194 <String " timings: ">
	//   26   49:invokevirtual   #48  <Method StringBuilder StringBuilder.append(String)>
	//   27   52:pop             
		stringbuilder.append(((Object) (timings)));
	//   28   53:aload_1         
	//   29   54:aload_0         
	//   30   55:getfield        #20  <Field SimpleArrayMap timings>
	//   31   58:invokevirtual   #51  <Method StringBuilder StringBuilder.append(Object)>
	//   32   61:pop             
		stringbuilder.append("}\n");
	//   33   62:aload_1         
	//   34   63:ldc1            #196 <String "}\n">
	//   35   65:invokevirtual   #48  <Method StringBuilder StringBuilder.append(String)>
	//   36   68:pop             
		return stringbuilder.toString();
	//   37   69:aload_1         
	//   38   70:invokevirtual   #56  <Method String StringBuilder.toString()>
	//   39   73:areturn         
	}

	private static final String TAG = "MotionSpec";
	private final SimpleArrayMap timings = new SimpleArrayMap();
}
