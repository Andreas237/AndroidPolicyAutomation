// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.os;

import android.os.*;

// Referenced classes of package android.support.v4.os:
//			e, b, g, a, 
//			f

public class ResultReceiver
	implements Parcelable
{

	ResultReceiver(Parcel parcel)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #26  <Method void Object()>
	//    2    4:aload_0         
	//    3    5:iconst_0        
	//    4    6:putfield        #28  <Field boolean a>
	//    5    9:aload_0         
	//    6   10:aconst_null     
	//    7   11:putfield        #30  <Field Handler b>
		c = android.support.v4.os.b.a(parcel.readStrongBinder());
	//    8   14:aload_0         
	//    9   15:aload_1         
	//   10   16:invokevirtual   #36  <Method android.os.IBinder Parcel.readStrongBinder()>
	//   11   19:invokestatic    #41  <Method a b.a(android.os.IBinder)>
	//   12   22:putfield        #43  <Field a c>
	//   13   25:return          
	}

	protected void a(int i, Bundle bundle)
	{
	//    0    0:return          
	}

	public void b(int i, Bundle bundle)
	{
		a a1;
		if(a)
	//*   0    0:aload_0         
	//*   1    1:getfield        #28  <Field boolean a>
	//*   2    4:ifeq            39
		{
			Handler handler = b;
	//    3    7:aload_0         
	//    4    8:getfield        #30  <Field Handler b>
	//    5   11:astore_3        
			if(handler != null)
	//*   6   12:aload_3         
	//*   7   13:ifnull          32
			{
				handler.post(((Runnable) (new g(this, i, bundle))));
	//    8   16:aload_3         
	//    9   17:new             #48  <Class g>
	//   10   20:dup             
	//   11   21:aload_0         
	//   12   22:iload_1         
	//   13   23:aload_2         
	//   14   24:invokespecial   #51  <Method void g(ResultReceiver, int, Bundle)>
	//   15   27:invokevirtual   #57  <Method boolean Handler.post(Runnable)>
	//   16   30:pop             
				return;
	//   17   31:return          
			} else
			{
				a(i, bundle);
	//   18   32:aload_0         
	//   19   33:iload_1         
	//   20   34:aload_2         
	//   21   35:invokevirtual   #59  <Method void a(int, Bundle)>
				return;
	//   22   38:return          
			}
		}
		a1 = c;
	//   23   39:aload_0         
	//   24   40:getfield        #43  <Field a c>
	//   25   43:astore_3        
		if(a1 == null)
			break MISSING_BLOCK_LABEL_56;
	//   26   44:aload_3         
	//   27   45:ifnull          56
		a1.a(i, bundle);
	//   28   48:aload_3         
	//   29   49:iload_1         
	//   30   50:aload_2         
	//   31   51:invokeinterface #62  <Method void a.a(int, Bundle)>
		return;
	//   32   56:return          
		bundle;
	//   33   57:astore_2        
	//   34   58:return          
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
	//*   3    3:getfield        #43  <Field a c>
	//*   4    6:ifnonnull       21
			c = ((a) (new f(this)));
	//    5    9:aload_0         
	//    6   10:new             #68  <Class f>
	//    7   13:dup             
	//    8   14:aload_0         
	//    9   15:invokespecial   #71  <Method void f(ResultReceiver)>
	//   10   18:putfield        #43  <Field a c>
		parcel.writeStrongBinder(c.asBinder());
	//   11   21:aload_1         
	//   12   22:aload_0         
	//   13   23:getfield        #43  <Field a c>
	//   14   26:invokeinterface #74  <Method android.os.IBinder a.asBinder()>
	//   15   31:invokevirtual   #78  <Method void Parcel.writeStrongBinder(android.os.IBinder)>
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

	public static final android.os.Parcelable.Creator CREATOR = new e();
	final boolean a = false;
	final Handler b = null;
	a c;

	static 
	{
	//    0    0:new             #18  <Class e>
	//    1    3:dup             
	//    2    4:invokespecial   #21  <Method void e()>
	//    3    7:putstatic       #23  <Field android.os.Parcelable$Creator CREATOR>
	//*   4   10:return          
	}
}
