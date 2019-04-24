// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package o;

import android.widget.Toast;
import java.util.Timer;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package o:
//			ge, gk, gi

final class gl
	implements Runnable
{

	gl(gk gk1, ge ge1)
	{
		a = gk1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #14  <Field gk a>
		d = ge1;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #16  <Field ge d>
		super();
	//    6   10:aload_0         
	//    7   11:invokespecial   #19  <Method void Object()>
	//    8   14:return          
	}

	public final void run()
	{
		gk gk1 = a;
	//    0    0:aload_0         
	//    1    1:getfield        #14  <Field gk a>
	//    2    4:astore_3        
		ge ge1 = d;
	//    3    5:aload_0         
	//    4    6:getfield        #16  <Field ge d>
	//    5    9:astore          4
		if(ge1 != null && "toast".equals(((Object) (ge1.d))))
	//*   6   11:aload           4
	//*   7   13:ifnull          99
	//*   8   16:ldc1            #25  <String "toast">
	//*   9   18:aload           4
	//*  10   20:getfield        #30  <Field String ge.d>
	//*  11   23:invokevirtual   #36  <Method boolean String.equals(Object)>
	//*  12   26:ifeq            99
		{
			JSONObject jsonobject = ge1.e;
	//   13   29:aload           4
	//   14   31:getfield        #40  <Field JSONObject ge.e>
	//   15   34:astore          5
			String s = jsonobject.optString("content");
	//   16   36:aload           5
	//   17   38:ldc1            #42  <String "content">
	//   18   40:invokevirtual   #48  <Method String JSONObject.optString(String)>
	//   19   43:astore          6
			int k = jsonobject.optInt("duration");
	//   20   45:aload           5
	//   21   47:ldc1            #50  <String "duration">
	//   22   49:invokevirtual   #54  <Method int JSONObject.optInt(String)>
	//   23   52:istore_2        
			int i = 1;
	//   24   53:iconst_1        
	//   25   54:istore_1        
			if(k < 2500)
	//*  26   55:iload_2         
	//*  27   56:sipush          2500
	//*  28   59:icmpge          64
				i = 0;
	//   29   62:iconst_0        
	//   30   63:istore_1        
			Toast.makeText(gk1.c, ((CharSequence) (s)), i).show();
	//   31   64:aload_3         
	//   32   65:getfield        #60  <Field android.content.Context gk.c>
	//   33   68:aload           6
	//   34   70:iload_1         
	//   35   71:invokestatic    #66  <Method Toast Toast.makeText(android.content.Context, CharSequence, int)>
	//   36   74:invokevirtual   #69  <Method void Toast.show()>
			(new Timer()).schedule(((java.util.TimerTask) (new gi(gk1, ge1))), i);
	//   37   77:new             #71  <Class Timer>
	//   38   80:dup             
	//   39   81:invokespecial   #72  <Method void Timer()>
	//   40   84:new             #74  <Class gi>
	//   41   87:dup             
	//   42   88:aload_3         
	//   43   89:aload           4
	//   44   91:invokespecial   #76  <Method void gi(gk, ge)>
	//   45   94:iload_1         
	//   46   95:i2l             
	//   47   96:invokevirtual   #80  <Method void Timer.schedule(java.util.TimerTask, long)>
		}
		int j = ge.e.c;
	//   48   99:getstatic       #85  <Field int ge$e.c>
	//   49  102:istore_1        
		if(j != ge.e.c)
	//*  50  103:iload_1         
	//*  51  104:getstatic       #85  <Field int ge$e.c>
	//*  52  107:icmpeq          126
			try
			{
				a.d(d.a, j);
	//   53  110:aload_0         
	//   54  111:getfield        #14  <Field gk a>
	//   55  114:aload_0         
	//   56  115:getfield        #16  <Field ge d>
	//   57  118:getfield        #87  <Field String ge.a>
	//   58  121:iload_1         
	//   59  122:invokevirtual   #90  <Method void gk.d(String, int)>
				return;
	//   60  125:return          
			}
	//*  61  126:return          
			catch(JSONException jsonexception)
	//*  62  127:astore_3        
			{
				return;
	//   63  128:return          
			}
		else
			return;
	}

	final gk a;
	final ge d;
}
