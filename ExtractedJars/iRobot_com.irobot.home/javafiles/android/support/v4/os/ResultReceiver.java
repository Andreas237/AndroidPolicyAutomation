// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.os;

import android.os.*;

// Referenced classes of package android.support.v4.os:
//			a

public class ResultReceiver
	implements Parcelable
{
	class a extends a.a
	{

		public void a(int i, Bundle bundle)
		{
			if(a.b != null)
		//*   0    0:aload_0         
		//*   1    1:getfield        #12  <Field ResultReceiver a>
		//*   2    4:getfield        #21  <Field Handler ResultReceiver.b>
		//*   3    7:ifnull          35
			{
				a.b.post(((Runnable) (((b) (a)). new b(i, bundle))));
		//    4   10:aload_0         
		//    5   11:getfield        #12  <Field ResultReceiver a>
		//    6   14:getfield        #21  <Field Handler ResultReceiver.b>
		//    7   17:new             #23  <Class ResultReceiver$b>
		//    8   20:dup             
		//    9   21:aload_0         
		//   10   22:getfield        #12  <Field ResultReceiver a>
		//   11   25:iload_1         
		//   12   26:aload_2         
		//   13   27:invokespecial   #26  <Method void ResultReceiver$b(ResultReceiver, int, Bundle)>
		//   14   30:invokevirtual   #32  <Method boolean Handler.post(Runnable)>
		//   15   33:pop             
				return;
		//   16   34:return          
			} else
			{
				a.a(i, bundle);
		//   17   35:aload_0         
		//   18   36:getfield        #12  <Field ResultReceiver a>
		//   19   39:iload_1         
		//   20   40:aload_2         
		//   21   41:invokevirtual   #34  <Method void ResultReceiver.a(int, Bundle)>
				return;
		//   22   44:return          
			}
		}

		final ResultReceiver a;

		a()
		{
			a = ResultReceiver.this;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #12  <Field ResultReceiver a>
			super();
		//    3    5:aload_0         
		//    4    6:invokespecial   #15  <Method void a$a()>
		//    5    9:return          
		}
	}

	class b
		implements Runnable
	{

		public void run()
		{
			c.a(a, b);
		//    0    0:aload_0         
		//    1    1:getfield        #18  <Field ResultReceiver c>
		//    2    4:aload_0         
		//    3    5:getfield        #23  <Field int a>
		//    4    8:aload_0         
		//    5    9:getfield        #25  <Field Bundle b>
		//    6   12:invokevirtual   #30  <Method void ResultReceiver.a(int, Bundle)>
		//    7   15:return          
		}

		final int a;
		final Bundle b;
		final ResultReceiver c;

		b(int i, Bundle bundle)
		{
			c = ResultReceiver.this;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #18  <Field ResultReceiver c>
			super();
		//    3    5:aload_0         
		//    4    6:invokespecial   #21  <Method void Object()>
			a = i;
		//    5    9:aload_0         
		//    6   10:iload_2         
		//    7   11:putfield        #23  <Field int a>
			b = bundle;
		//    8   14:aload_0         
		//    9   15:aload_3         
		//   10   16:putfield        #25  <Field Bundle b>
		//   11   19:return          
		}
	}


	ResultReceiver(Parcel parcel)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #31  <Method void Object()>
	//    2    4:aload_0         
	//    3    5:iconst_0        
	//    4    6:putfield        #33  <Field boolean a>
	//    5    9:aload_0         
	//    6   10:aconst_null     
	//    7   11:putfield        #35  <Field Handler b>
		c = android.support.v4.os.a.a.a(parcel.readStrongBinder());
	//    8   14:aload_0         
	//    9   15:aload_1         
	//   10   16:invokevirtual   #41  <Method android.os.IBinder Parcel.readStrongBinder()>
	//   11   19:invokestatic    #46  <Method a a$a.a(android.os.IBinder)>
	//   12   22:putfield        #48  <Field a c>
	//   13   25:return          
	}

	protected void a(int i, Bundle bundle)
	{
	//    0    0:return          
	}

	public void b(int i, Bundle bundle)
	{
		if(a)
	//*   0    0:aload_0         
	//*   1    1:getfield        #33  <Field boolean a>
	//*   2    4:ifeq            40
			if(b != null)
	//*   3    7:aload_0         
	//*   4    8:getfield        #35  <Field Handler b>
	//*   5   11:ifnull          33
			{
				b.post(((Runnable) (new b(i, bundle))));
	//    6   14:aload_0         
	//    7   15:getfield        #35  <Field Handler b>
	//    8   18:new             #13  <Class ResultReceiver$b>
	//    9   21:dup             
	//   10   22:aload_0         
	//   11   23:iload_1         
	//   12   24:aload_2         
	//   13   25:invokespecial   #54  <Method void ResultReceiver$b(ResultReceiver, int, Bundle)>
	//   14   28:invokevirtual   #60  <Method boolean Handler.post(Runnable)>
	//   15   31:pop             
				return;
	//   16   32:return          
			} else
			{
				a(i, bundle);
	//   17   33:aload_0         
	//   18   34:iload_1         
	//   19   35:aload_2         
	//   20   36:invokevirtual   #62  <Method void a(int, Bundle)>
				return;
	//   21   39:return          
			}
		if(c == null)
			break MISSING_BLOCK_LABEL_58;
	//   22   40:aload_0         
	//   23   41:getfield        #48  <Field a c>
	//   24   44:ifnull          58
		c.a(i, bundle);
	//   25   47:aload_0         
	//   26   48:getfield        #48  <Field a c>
	//   27   51:iload_1         
	//   28   52:aload_2         
	//   29   53:invokeinterface #65  <Method void a.a(int, Bundle)>
		return;
	//   30   58:return          
		bundle;
	//   31   59:astore_2        
	//   32   60:return          
	}

	public int describeContents()
	{
		return 0;
	//    0    0:iconst_0        
	//    1    1:ireturn         
	}

	public void writeToParcel(Parcel parcel, int i)
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		if(c == null)
	//*   2    2:aload_0         
	//*   3    3:getfield        #48  <Field a c>
	//*   4    6:ifnonnull       21
			c = ((android.support.v4.os.a) (new a()));
	//    5    9:aload_0         
	//    6   10:new             #10  <Class ResultReceiver$a>
	//    7   13:dup             
	//    8   14:aload_0         
	//    9   15:invokespecial   #72  <Method void ResultReceiver$a(ResultReceiver)>
	//   10   18:putfield        #48  <Field a c>
		parcel.writeStrongBinder(c.asBinder());
	//   11   21:aload_1         
	//   12   22:aload_0         
	//   13   23:getfield        #48  <Field a c>
	//   14   26:invokeinterface #75  <Method android.os.IBinder a.asBinder()>
	//   15   31:invokevirtual   #79  <Method void Parcel.writeStrongBinder(android.os.IBinder)>
		this;
	//   16   34:aload_0         
		JVM INSTR monitorexit ;
	//   17   35:monitorexit     
		return;
	//   18   36:return          
		parcel;
	//   19   37:astore_1        
		this;
	//   20   38:aload_0         
		JVM INSTR monitorexit ;
	//   21   39:monitorexit     
		throw parcel;
	//   22   40:aload_1         
	//   23   41:athrow          
	}

	public static final android.os.Parcelable.Creator CREATOR = new android.os.Parcelable.Creator() {

		public ResultReceiver a(Parcel parcel)
		{
			return new ResultReceiver(parcel);
		//    0    0:new             #9   <Class ResultReceiver>
		//    1    3:dup             
		//    2    4:aload_1         
		//    3    5:invokespecial   #19  <Method void ResultReceiver(Parcel)>
		//    4    8:areturn         
		}

		public ResultReceiver[] a(int i)
		{
			return new ResultReceiver[i];
		//    0    0:iload_1         
		//    1    1:anewarray       ResultReceiver[]
		//    2    4:areturn         
		}

		public Object createFromParcel(Parcel parcel)
		{
			return ((Object) (a(parcel)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokevirtual   #24  <Method ResultReceiver a(Parcel)>
		//    3    5:areturn         
		}

		public Object[] newArray(int i)
		{
			return ((Object []) (a(i)));
		//    0    0:aload_0         
		//    1    1:iload_1         
		//    2    2:invokevirtual   #28  <Method ResultReceiver[] a(int)>
		//    3    5:areturn         
		}

	}
;
	final boolean a = false;
	final Handler b = null;
	android.support.v4.os.a c;

	static 
	{
	//    0    0:new             #8   <Class ResultReceiver$1>
	//    1    3:dup             
	//    2    4:invokespecial   #26  <Method void ResultReceiver$1()>
	//    3    7:putstatic       #28  <Field android.os.Parcelable$Creator CREATOR>
	//*   4   10:return          
	}
}
