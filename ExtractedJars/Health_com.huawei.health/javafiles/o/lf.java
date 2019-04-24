// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package o;

import android.content.Context;
import android.util.AttributeSet;

// Referenced classes of package o:
//			le, mu, nm, lx

public class lf extends le
	implements mu
{

	public lf(Context context)
	{
		super(context);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #11  <Method void le(Context)>
	//    3    5:return          
	}

	public lf(Context context, AttributeSet attributeset)
	{
		super(context, attributeset);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #15  <Method void le(Context, AttributeSet)>
	//    4    6:return          
	}

	public lf(Context context, AttributeSet attributeset, int i)
	{
		super(context, attributeset, i);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:iload_3         
	//    4    4:invokespecial   #18  <Method void le(Context, AttributeSet, int)>
	//    5    7:return          
	}

	protected void a()
	{
		super.a();
	//    0    0:aload_0         
	//    1    1:invokespecial   #22  <Method void le.a()>
		S = ((nj) (new nm(((mu) (this)), P, O)));
	//    2    4:aload_0         
	//    3    5:new             #24  <Class nm>
	//    4    8:dup             
	//    5    9:aload_0         
	//    6   10:aload_0         
	//    7   11:getfield        #28  <Field la P>
	//    8   14:aload_0         
	//    9   15:getfield        #32  <Field oa O>
	//   10   18:invokespecial   #35  <Method void nm(mu, la, oa)>
	//   11   21:putfield        #39  <Field nj S>
	//   12   24:return          
	}

	public lx getLineData()
	{
		return (lx)A;
	//    0    0:aload_0         
	//    1    1:getfield        #45  <Field ma A>
	//    2    4:checkcast       #47  <Class lx>
	//    3    7:areturn         
	}

	protected void onDetachedFromWindow()
	{
		if(S != null && (S instanceof nm))
	//*   0    0:aload_0         
	//*   1    1:getfield        #39  <Field nj S>
	//*   2    4:ifnull          27
	//*   3    7:aload_0         
	//*   4    8:getfield        #39  <Field nj S>
	//*   5   11:instanceof      #24  <Class nm>
	//*   6   14:ifeq            27
			((nm)S).d();
	//    7   17:aload_0         
	//    8   18:getfield        #39  <Field nj S>
	//    9   21:checkcast       #24  <Class nm>
	//   10   24:invokevirtual   #51  <Method void nm.d()>
		super.onDetachedFromWindow();
	//   11   27:aload_0         
	//   12   28:invokespecial   #53  <Method void le.onDetachedFromWindow()>
	//   13   31:return          
	}
}
