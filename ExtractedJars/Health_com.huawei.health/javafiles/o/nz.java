// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package o;

import android.os.Parcel;

// Referenced classes of package o:
//			ny

public class nz extends ny.b
{

	public nz()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #38  <Method void ny$b()>
	//    2    4:return          
	}

	public nz(float f, float f1)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #38  <Method void ny$b()>
		e = f;
	//    2    4:aload_0         
	//    3    5:fload_1         
	//    4    6:putfield        #40  <Field float e>
		c = f1;
	//    5    9:aload_0         
	//    6   10:fload_2         
	//    7   11:putfield        #42  <Field float c>
	//    8   14:return          
	}

	public static nz b()
	{
		return (nz)d.b();
	//    0    0:getstatic       #28  <Field ny d>
	//    1    3:invokevirtual   #46  <Method ny$b ny.b()>
	//    2    6:checkcast       #2   <Class nz>
	//    3    9:areturn         
	}

	public static nz b(nz nz1)
	{
		nz nz2 = (nz)d.b();
	//    0    0:getstatic       #28  <Field ny d>
	//    1    3:invokevirtual   #46  <Method ny$b ny.b()>
	//    2    6:checkcast       #2   <Class nz>
	//    3    9:astore_1        
		nz2.e = nz1.e;
	//    4   10:aload_1         
	//    5   11:aload_0         
	//    6   12:getfield        #40  <Field float e>
	//    7   15:putfield        #40  <Field float e>
		nz2.c = nz1.c;
	//    8   18:aload_1         
	//    9   19:aload_0         
	//   10   20:getfield        #42  <Field float c>
	//   11   23:putfield        #42  <Field float c>
		return nz2;
	//   12   26:aload_1         
	//   13   27:areturn         
	}

	public static void c(nz nz1)
	{
		d.c(((ny.b) (nz1)));
	//    0    0:getstatic       #28  <Field ny d>
	//    1    3:aload_0         
	//    2    4:invokevirtual   #51  <Method void ny.c(ny$b)>
	//    3    7:return          
	}

	public static nz d(float f, float f1)
	{
		nz nz1 = (nz)d.b();
	//    0    0:getstatic       #28  <Field ny d>
	//    1    3:invokevirtual   #46  <Method ny$b ny.b()>
	//    2    6:checkcast       #2   <Class nz>
	//    3    9:astore_2        
		nz1.e = f;
	//    4   10:aload_2         
	//    5   11:fload_0         
	//    6   12:putfield        #40  <Field float e>
		nz1.c = f1;
	//    7   15:aload_2         
	//    8   16:fload_1         
	//    9   17:putfield        #42  <Field float c>
		return nz1;
	//   10   20:aload_2         
	//   11   21:areturn         
	}

	protected ny.b a()
	{
		return ((ny.b) (new nz(0.0F, 0.0F)));
	//    0    0:new             #2   <Class nz>
	//    1    3:dup             
	//    2    4:fconst_0        
	//    3    5:fconst_0        
	//    4    6:invokespecial   #21  <Method void nz(float, float)>
	//    5    9:areturn         
	}

	public float c()
	{
		return c;
	//    0    0:aload_0         
	//    1    1:getfield        #42  <Field float c>
	//    2    4:freturn         
	}

	public void c(Parcel parcel)
	{
		e = parcel.readFloat();
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #60  <Method float Parcel.readFloat()>
	//    3    5:putfield        #40  <Field float e>
		c = parcel.readFloat();
	//    4    8:aload_0         
	//    5    9:aload_1         
	//    6   10:invokevirtual   #60  <Method float Parcel.readFloat()>
	//    7   13:putfield        #42  <Field float c>
	//    8   16:return          
	}

	public float d()
	{
		return e;
	//    0    0:aload_0         
	//    1    1:getfield        #40  <Field float e>
	//    2    4:freturn         
	}

	public static final android.os.Parcelable.Creator b = new android.os.Parcelable.Creator() {

		public Object createFromParcel(Parcel parcel)
		{
			return ((Object) (e(parcel)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokevirtual   #20  <Method nz e(Parcel)>
		//    3    5:areturn         
		}

		public nz[] d(int i)
		{
			return new nz[i];
		//    0    0:iload_1         
		//    1    1:anewarray       nz[]
		//    2    4:areturn         
		}

		public nz e(Parcel parcel)
		{
			nz nz1 = new nz(0.0F, 0.0F);
		//    0    0:new             #9   <Class nz>
		//    1    3:dup             
		//    2    4:fconst_0        
		//    3    5:fconst_0        
		//    4    6:invokespecial   #25  <Method void nz(float, float)>
		//    5    9:astore_2        
			nz1.c(parcel);
		//    6   10:aload_2         
		//    7   11:aload_1         
		//    8   12:invokevirtual   #29  <Method void nz.c(Parcel)>
			return nz1;
		//    9   15:aload_2         
		//   10   16:areturn         
		}

		public Object[] newArray(int i)
		{
			return ((Object []) (d(i)));
		//    0    0:aload_0         
		//    1    1:iload_1         
		//    2    2:invokevirtual   #33  <Method nz[] d(int)>
		//    3    5:areturn         
		}

	}
;
	private static ny d;
	public float c;
	public float e;

	static 
	{
		d = ny.b(32, ((ny.b) (new nz(0.0F, 0.0F))));
	//    0    0:bipush          32
	//    1    2:new             #2   <Class nz>
	//    2    5:dup             
	//    3    6:fconst_0        
	//    4    7:fconst_0        
	//    5    8:invokespecial   #21  <Method void nz(float, float)>
	//    6   11:invokestatic    #26  <Method ny ny.b(int, ny$b)>
	//    7   14:putstatic       #28  <Field ny d>
		d.c(0.5F);
	//    8   17:getstatic       #28  <Field ny d>
	//    9   20:ldc1            #29  <Float 0.5F>
	//   10   22:invokevirtual   #32  <Method void ny.c(float)>
	//   11   25:new             #6   <Class nz$2>
	//   12   28:dup             
	//   13   29:invokespecial   #34  <Method void nz$2()>
	//   14   32:putstatic       #36  <Field android.os.Parcelable$Creator b>
	//*  15   35:return          
	}
}
