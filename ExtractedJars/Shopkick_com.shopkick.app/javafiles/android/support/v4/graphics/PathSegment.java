// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.graphics;

import android.graphics.PointF;
import android.support.v4.util.Preconditions;

public final class PathSegment
{

	public PathSegment(PointF pointf, float f, PointF pointf1, float f1)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #16  <Method void Object()>
		mStart = (PointF)Preconditions.checkNotNull(((Object) (pointf)), "start == null");
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:ldc1            #18  <String "start == null">
	//    5    8:invokestatic    #24  <Method Object Preconditions.checkNotNull(Object, Object)>
	//    6   11:checkcast       #26  <Class PointF>
	//    7   14:putfield        #28  <Field PointF mStart>
		mStartFraction = f;
	//    8   17:aload_0         
	//    9   18:fload_2         
	//   10   19:putfield        #30  <Field float mStartFraction>
		mEnd = (PointF)Preconditions.checkNotNull(((Object) (pointf1)), "end == null");
	//   11   22:aload_0         
	//   12   23:aload_3         
	//   13   24:ldc1            #32  <String "end == null">
	//   14   26:invokestatic    #24  <Method Object Preconditions.checkNotNull(Object, Object)>
	//   15   29:checkcast       #26  <Class PointF>
	//   16   32:putfield        #34  <Field PointF mEnd>
		mEndFraction = f1;
	//   17   35:aload_0         
	//   18   36:fload           4
	//   19   38:putfield        #36  <Field float mEndFraction>
	//   20   41:return          
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
		if(!(obj instanceof PathSegment))
	//*   5    7:aload_1         
	//*   6    8:instanceof      #2   <Class PathSegment>
	//*   7   11:ifne            16
			return false;
	//    8   14:iconst_0        
	//    9   15:ireturn         
		obj = ((Object) ((PathSegment)obj));
	//   10   16:aload_1         
	//   11   17:checkcast       #2   <Class PathSegment>
	//   12   20:astore_1        
		return Float.compare(mStartFraction, ((PathSegment) (obj)).mStartFraction) == 0 && Float.compare(mEndFraction, ((PathSegment) (obj)).mEndFraction) == 0 && mStart.equals(((Object) (((PathSegment) (obj)).mStart))) && mEnd.equals(((Object) (((PathSegment) (obj)).mEnd)));
	//   13   21:aload_0         
	//   14   22:getfield        #30  <Field float mStartFraction>
	//   15   25:aload_1         
	//   16   26:getfield        #30  <Field float mStartFraction>
	//   17   29:invokestatic    #46  <Method int Float.compare(float, float)>
	//   18   32:ifne            79
	//   19   35:aload_0         
	//   20   36:getfield        #36  <Field float mEndFraction>
	//   21   39:aload_1         
	//   22   40:getfield        #36  <Field float mEndFraction>
	//   23   43:invokestatic    #46  <Method int Float.compare(float, float)>
	//   24   46:ifne            79
	//   25   49:aload_0         
	//   26   50:getfield        #28  <Field PointF mStart>
	//   27   53:aload_1         
	//   28   54:getfield        #28  <Field PointF mStart>
	//   29   57:invokevirtual   #48  <Method boolean PointF.equals(Object)>
	//   30   60:ifeq            79
	//   31   63:aload_0         
	//   32   64:getfield        #34  <Field PointF mEnd>
	//   33   67:aload_1         
	//   34   68:getfield        #34  <Field PointF mEnd>
	//   35   71:invokevirtual   #48  <Method boolean PointF.equals(Object)>
	//   36   74:ifeq            79
	//   37   77:iconst_1        
	//   38   78:ireturn         
	//   39   79:iconst_0        
	//   40   80:ireturn         
	}

	public PointF getEnd()
	{
		return mEnd;
	//    0    0:aload_0         
	//    1    1:getfield        #34  <Field PointF mEnd>
	//    2    4:areturn         
	}

	public float getEndFraction()
	{
		return mEndFraction;
	//    0    0:aload_0         
	//    1    1:getfield        #36  <Field float mEndFraction>
	//    2    4:freturn         
	}

	public PointF getStart()
	{
		return mStart;
	//    0    0:aload_0         
	//    1    1:getfield        #28  <Field PointF mStart>
	//    2    4:areturn         
	}

	public float getStartFraction()
	{
		return mStartFraction;
	//    0    0:aload_0         
	//    1    1:getfield        #30  <Field float mStartFraction>
	//    2    4:freturn         
	}

	public int hashCode()
	{
		int k = mStart.hashCode();
	//    0    0:aload_0         
	//    1    1:getfield        #28  <Field PointF mStart>
	//    2    4:invokevirtual   #59  <Method int PointF.hashCode()>
	//    3    7:istore          4
		float f = mStartFraction;
	//    4    9:aload_0         
	//    5   10:getfield        #30  <Field float mStartFraction>
	//    6   13:fstore_1        
		int j = 0;
	//    7   14:iconst_0        
	//    8   15:istore_3        
		int i;
		if(f != 0.0F)
	//*   9   16:fload_1         
	//*  10   17:fconst_0        
	//*  11   18:fcmpl           
	//*  12   19:ifeq            30
			i = Float.floatToIntBits(f);
	//   13   22:fload_1         
	//   14   23:invokestatic    #63  <Method int Float.floatToIntBits(float)>
	//   15   26:istore_2        
		else
	//*  16   27:goto            32
			i = 0;
	//   17   30:iconst_0        
	//   18   31:istore_2        
		int l = mEnd.hashCode();
	//   19   32:aload_0         
	//   20   33:getfield        #34  <Field PointF mEnd>
	//   21   36:invokevirtual   #59  <Method int PointF.hashCode()>
	//   22   39:istore          5
		f = mEndFraction;
	//   23   41:aload_0         
	//   24   42:getfield        #36  <Field float mEndFraction>
	//   25   45:fstore_1        
		if(f != 0.0F)
	//*  26   46:fload_1         
	//*  27   47:fconst_0        
	//*  28   48:fcmpl           
	//*  29   49:ifeq            57
			j = Float.floatToIntBits(f);
	//   30   52:fload_1         
	//   31   53:invokestatic    #63  <Method int Float.floatToIntBits(float)>
	//   32   56:istore_3        
		return ((k * 31 + i) * 31 + l) * 31 + j;
	//   33   57:iload           4
	//   34   59:bipush          31
	//   35   61:imul            
	//   36   62:iload_2         
	//   37   63:iadd            
	//   38   64:bipush          31
	//   39   66:imul            
	//   40   67:iload           5
	//   41   69:iadd            
	//   42   70:bipush          31
	//   43   72:imul            
	//   44   73:iload_3         
	//   45   74:iadd            
	//   46   75:ireturn         
	}

	public String toString()
	{
		StringBuilder stringbuilder = new StringBuilder();
	//    0    0:new             #67  <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #68  <Method void StringBuilder()>
	//    3    7:astore_1        
		stringbuilder.append("PathSegment{start=");
	//    4    8:aload_1         
	//    5    9:ldc1            #70  <String "PathSegment{start=">
	//    6   11:invokevirtual   #74  <Method StringBuilder StringBuilder.append(String)>
	//    7   14:pop             
		stringbuilder.append(((Object) (mStart)));
	//    8   15:aload_1         
	//    9   16:aload_0         
	//   10   17:getfield        #28  <Field PointF mStart>
	//   11   20:invokevirtual   #77  <Method StringBuilder StringBuilder.append(Object)>
	//   12   23:pop             
		stringbuilder.append(", startFraction=");
	//   13   24:aload_1         
	//   14   25:ldc1            #79  <String ", startFraction=">
	//   15   27:invokevirtual   #74  <Method StringBuilder StringBuilder.append(String)>
	//   16   30:pop             
		stringbuilder.append(mStartFraction);
	//   17   31:aload_1         
	//   18   32:aload_0         
	//   19   33:getfield        #30  <Field float mStartFraction>
	//   20   36:invokevirtual   #82  <Method StringBuilder StringBuilder.append(float)>
	//   21   39:pop             
		stringbuilder.append(", end=");
	//   22   40:aload_1         
	//   23   41:ldc1            #84  <String ", end=">
	//   24   43:invokevirtual   #74  <Method StringBuilder StringBuilder.append(String)>
	//   25   46:pop             
		stringbuilder.append(((Object) (mEnd)));
	//   26   47:aload_1         
	//   27   48:aload_0         
	//   28   49:getfield        #34  <Field PointF mEnd>
	//   29   52:invokevirtual   #77  <Method StringBuilder StringBuilder.append(Object)>
	//   30   55:pop             
		stringbuilder.append(", endFraction=");
	//   31   56:aload_1         
	//   32   57:ldc1            #86  <String ", endFraction=">
	//   33   59:invokevirtual   #74  <Method StringBuilder StringBuilder.append(String)>
	//   34   62:pop             
		stringbuilder.append(mEndFraction);
	//   35   63:aload_1         
	//   36   64:aload_0         
	//   37   65:getfield        #36  <Field float mEndFraction>
	//   38   68:invokevirtual   #82  <Method StringBuilder StringBuilder.append(float)>
	//   39   71:pop             
		stringbuilder.append('}');
	//   40   72:aload_1         
	//   41   73:bipush          125
	//   42   75:invokevirtual   #89  <Method StringBuilder StringBuilder.append(char)>
	//   43   78:pop             
		return stringbuilder.toString();
	//   44   79:aload_1         
	//   45   80:invokevirtual   #91  <Method String StringBuilder.toString()>
	//   46   83:areturn         
	}

	private final PointF mEnd;
	private final float mEndFraction;
	private final PointF mStart;
	private final float mStartFraction;
}
