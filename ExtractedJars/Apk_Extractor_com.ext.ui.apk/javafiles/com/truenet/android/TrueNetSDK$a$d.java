// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.truenet.android;

import android.content.Context;
import android.support.v7.*;
import com.truenet.android.a.g;

// Referenced classes of package com.truenet.android:
//			TrueNetSDK

static final class TrueNetSDK$a$d
	implements Runnable
{

	public final void run()
	{
		Object obj = ((Object) (new android.support.v7.aj.a()));
	//    0    0:new             #33  <Class android.support.v7.aj$a>
	//    1    3:dup             
	//    2    4:invokespecial   #34  <Method void android.support.v7.aj$a()>
	//    3    7:astore_3        
		obj.a = ((Object) ((String)null));
	//    4    8:aload_3         
	//    5    9:aconst_null     
	//    6   10:checkcast       #36  <Class String>
	//    7   13:putfield        #39  <Field Object android.support.v7.aj$a.a>
		if(a == 0L && ((v)new v(this, ((android.support.v7.aj.a) (obj))) {

		public Object a()
		{
			return ((Object) (b()));
		//    0    0:aload_0         
		//    1    1:invokevirtual   #36  <Method String b()>
		//    2    4:areturn         
		}

		public final String b()
		{
			$res.a = ((Object) (g.b(TrueNetSDK.access$getInitUrl$cp(), TrueNetSDK.a.a(TrueNetSDK.Companion, TrueNetSDK.a.d.this.b), TrueNetSDK.a.d.this.b)));
		//    0    0:aload_0         
		//    1    1:getfield        #27  <Field android.support.v7.aj$a $res>
		//    2    4:invokestatic    #41  <Method java.net.URL TrueNetSDK.access$getInitUrl$cp()>
		//    3    7:getstatic       #45  <Field TrueNetSDK$a TrueNetSDK.Companion>
		//    4   10:aload_0         
		//    5   11:getfield        #25  <Field TrueNetSDK$a$d this$0>
		//    6   14:getfield        #48  <Field Context TrueNetSDK$a$d.b>
		//    7   17:invokestatic    #51  <Method String TrueNetSDK$a.a(TrueNetSDK$a, Context)>
		//    8   20:aload_0         
		//    9   21:getfield        #25  <Field TrueNetSDK$a$d this$0>
		//   10   24:getfield        #48  <Field Context TrueNetSDK$a$d.b>
		//   11   27:invokestatic    #56  <Method String g.b(java.net.URL, String, Context)>
		//   12   30:putfield        #61  <Field Object android.support.v7.aj$a.a>
			return (String)$res.a;
		//   13   33:aload_0         
		//   14   34:getfield        #27  <Field android.support.v7.aj$a $res>
		//   15   37:getfield        #61  <Field Object android.support.v7.aj$a.a>
		//   16   40:checkcast       #63  <Class String>
		//   17   43:areturn         
		}

		final android.support.v7.aj.a $res;
		final TrueNetSDK.a.d this$0;

			
			{
				this$0 = d1;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #25  <Field TrueNetSDK$a$d this$0>
				$res = a1;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #27  <Field android.support.v7.aj$a $res>
				super(0);
			//    6   10:aload_0         
			//    7   11:iconst_0        
			//    8   12:invokespecial   #30  <Method void af(int)>
			//    9   15:return          
			}
	}
).a() != null)
	//*   8   16:aload_0         
	//*   9   17:getfield        #24  <Field long a>
	//*  10   20:lconst_0        
	//*  11   21:lcmp            
	//*  12   22:ifne            82
	//*  13   25:new             #15  <Class TrueNetSDK$a$d$1>
	//*  14   28:dup             
	//*  15   29:aload_0         
	//*  16   30:aload_3         
	//*  17   31:invokespecial   #42  <Method void TrueNetSDK$a$d$1(TrueNetSDK$a$d, android.support.v7.aj$a)>
	//*  18   34:checkcast       #44  <Class v>
	//*  19   37:invokeinterface #47  <Method Object v.a()>
	//*  20   42:ifnull          82
		{
			TrueNetSDK.a a1 = TrueNetSDK.Companion;
	//   21   45:getstatic       #51  <Field TrueNetSDK$a TrueNetSDK.Companion>
	//   22   48:astore_1        
			Context context = b;
	//   23   49:aload_0         
	//   24   50:getfield        #26  <Field Context b>
	//   25   53:astore_2        
			obj = ((Object) ((String)((android.support.v7.aj.a) (obj)).a));
	//   26   54:aload_3         
	//   27   55:getfield        #39  <Field Object android.support.v7.aj$a.a>
	//   28   58:checkcast       #36  <Class String>
	//   29   61:astore_3        
			if(obj == null)
	//*  30   62:aload_3         
	//*  31   63:ifnonnull       69
				ae.a();
	//   32   66:invokestatic    #55  <Method void ae.a()>
			static final class _cls2 extends af
				implements v
			{

				public Object a()
				{
					b();
				//    0    0:aload_0         
				//    1    1:invokevirtual   #32  <Method void b()>
					return ((Object) (br.a));
				//    2    4:getstatic       #37  <Field br br.a>
				//    3    7:areturn         
				}

				public final void b()
				{
				//    0    0:return          
				}

				public static final _cls2 a = new _cls2();

				static 
				{
				//    0    0:new             #2   <Class TrueNetSDK$a$d$2>
				//    1    3:dup             
				//    2    4:invokespecial   #22  <Method void TrueNetSDK$a$d$2()>
				//    3    7:putstatic       #24  <Field TrueNetSDK$a$d$2 a>
				//*   4   10:return          
				}

			}

			TrueNetSDK.a.a(a1, context, ((String) (obj)), (v)_cls2.a);
	//   33   69:aload_1         
	//   34   70:aload_2         
	//   35   71:aload_3         
	//   36   72:getstatic       #58  <Field TrueNetSDK$a$d$2 TrueNetSDK$a$d$2.a>
	//   37   75:checkcast       #44  <Class v>
	//   38   78:invokestatic    #61  <Method void TrueNetSDK$a.a(TrueNetSDK$a, Context, String, v)>
			return;
	//   39   81:return          
		} else
		{
			TrueNetSDK.a.a(TrueNetSDK.Companion, 0, a);
	//   40   82:getstatic       #51  <Field TrueNetSDK$a TrueNetSDK.Companion>
	//   41   85:iconst_0        
	//   42   86:aload_0         
	//   43   87:getfield        #24  <Field long a>
	//   44   90:invokestatic    #64  <Method void TrueNetSDK$a.a(TrueNetSDK$a, int, long)>
			return;
	//   45   93:return          
		}
	}

	final long a;
	final Context b;

	TrueNetSDK$a$d(long l, Context context)
	{
		a = l;
	//    0    0:aload_0         
	//    1    1:lload_1         
	//    2    2:putfield        #24  <Field long a>
		b = context;
	//    3    5:aload_0         
	//    4    6:aload_3         
	//    5    7:putfield        #26  <Field Context b>
		super();
	//    6   10:aload_0         
	//    7   11:invokespecial   #29  <Method void Object()>
	//    8   14:return          
	}
}
