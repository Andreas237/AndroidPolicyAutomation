// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v7.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.widget.SeekBar;

// Referenced classes of package android.support.v7.widget:
//			k

public class AppCompatSeekBar extends SeekBar
{

	public AppCompatSeekBar(Context context)
	{
		this(context, ((AttributeSet) (null)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aconst_null     
	//    3    3:invokespecial   #11  <Method void AppCompatSeekBar(Context, AttributeSet)>
	//    4    6:return          
	}

	public AppCompatSeekBar(Context context, AttributeSet attributeset)
	{
		this(context, attributeset, android.support.v7.a.a.a.seekBarStyle);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:getstatic       #18  <Field int android.support.v7.a.a$a.seekBarStyle>
	//    4    6:invokespecial   #21  <Method void AppCompatSeekBar(Context, AttributeSet, int)>
	//    5    9:return          
	}

	public AppCompatSeekBar(Context context, AttributeSet attributeset, int i)
	{
		super(context, attributeset, i);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:iload_3         
	//    4    4:invokespecial   #22  <Method void SeekBar(Context, AttributeSet, int)>
		a = new k(((SeekBar) (this)));
	//    5    7:aload_0         
	//    6    8:new             #24  <Class k>
	//    7   11:dup             
	//    8   12:aload_0         
	//    9   13:invokespecial   #27  <Method void k(SeekBar)>
	//   10   16:putfield        #29  <Field k a>
		a.a(attributeset, i);
	//   11   19:aload_0         
	//   12   20:getfield        #29  <Field k a>
	//   13   23:aload_2         
	//   14   24:iload_3         
	//   15   25:invokevirtual   #32  <Method void k.a(AttributeSet, int)>
	//   16   28:return          
	}

	protected void drawableStateChanged()
	{
		super.drawableStateChanged();
	//    0    0:aload_0         
	//    1    1:invokespecial   #36  <Method void SeekBar.drawableStateChanged()>
		a.c();
	//    2    4:aload_0         
	//    3    5:getfield        #29  <Field k a>
	//    4    8:invokevirtual   #39  <Method void k.c()>
	//    5   11:return          
	}

	public void jumpDrawablesToCurrentState()
	{
		super.jumpDrawablesToCurrentState();
	//    0    0:aload_0         
	//    1    1:invokespecial   #42  <Method void SeekBar.jumpDrawablesToCurrentState()>
		a.b();
	//    2    4:aload_0         
	//    3    5:getfield        #29  <Field k a>
	//    4    8:invokevirtual   #45  <Method void k.b()>
	//    5   11:return          
	}

	protected void onDraw(Canvas canvas)
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		super.onDraw(canvas);
	//    2    2:aload_0         
	//    3    3:aload_1         
	//    4    4:invokespecial   #49  <Method void SeekBar.onDraw(Canvas)>
		a.a(canvas);
	//    5    7:aload_0         
	//    6    8:getfield        #29  <Field k a>
	//    7   11:aload_1         
	//    8   12:invokevirtual   #51  <Method void k.a(Canvas)>
		this;
	//    9   15:aload_0         
		JVM INSTR monitorexit ;
	//   10   16:monitorexit     
		return;
	//   11   17:return          
		canvas;
	//   12   18:astore_1        
	//*  13   19:aload_0         
		throw canvas;
	//   14   20:monitorexit     
	//   15   21:aload_1         
	//   16   22:athrow          
	}

	private final k a;
}
