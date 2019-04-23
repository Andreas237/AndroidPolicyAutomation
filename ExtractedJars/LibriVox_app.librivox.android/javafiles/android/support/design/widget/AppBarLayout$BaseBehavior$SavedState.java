// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.design.widget;

import android.os.Parcel;
import android.os.Parcelable;
import android.support.v4.view.AbsSavedState;

// Referenced classes of package android.support.design.widget:
//			c

public class AppBarLayout$BaseBehavior$SavedState extends AbsSavedState
{

	public void writeToParcel(Parcel parcel, int i)
	{
		super.writeToParcel(parcel, i);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:invokespecial   #52  <Method void AbsSavedState.writeToParcel(Parcel, int)>
		parcel.writeInt(a);
	//    4    6:aload_1         
	//    5    7:aload_0         
	//    6    8:getfield        #33  <Field int a>
	//    7   11:invokevirtual   #56  <Method void Parcel.writeInt(int)>
		parcel.writeFloat(b);
	//    8   14:aload_1         
	//    9   15:aload_0         
	//   10   16:getfield        #39  <Field float b>
	//   11   19:invokevirtual   #60  <Method void Parcel.writeFloat(float)>
		parcel.writeByte((byte)c);
	//   12   22:aload_1         
	//   13   23:aload_0         
	//   14   24:getfield        #45  <Field boolean c>
	//   15   27:int2byte        
	//   16   28:invokevirtual   #64  <Method void Parcel.writeByte(byte)>
	//   17   31:return          
	}

	public static final android.os.Parcelable.Creator CREATOR = new c();
	int a;
	float b;
	boolean c;

	static 
	{
	//    0    0:new             #16  <Class c>
	//    1    3:dup             
	//    2    4:invokespecial   #19  <Method void c()>
	//    3    7:putstatic       #21  <Field android.os.Parcelable$Creator CREATOR>
	//*   4   10:return          
	}

	public AppBarLayout$BaseBehavior$SavedState(Parcel parcel, ClassLoader classloader)
	{
		super(parcel, classloader);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #25  <Method void AbsSavedState(Parcel, ClassLoader)>
		a = parcel.readInt();
	//    4    6:aload_0         
	//    5    7:aload_1         
	//    6    8:invokevirtual   #31  <Method int Parcel.readInt()>
	//    7   11:putfield        #33  <Field int a>
		b = parcel.readFloat();
	//    8   14:aload_0         
	//    9   15:aload_1         
	//   10   16:invokevirtual   #37  <Method float Parcel.readFloat()>
	//   11   19:putfield        #39  <Field float b>
		boolean flag;
		if(parcel.readByte() != 0)
	//*  12   22:aload_1         
	//*  13   23:invokevirtual   #43  <Method byte Parcel.readByte()>
	//*  14   26:ifeq            34
			flag = true;
	//   15   29:iconst_1        
	//   16   30:istore_3        
		else
	//*  17   31:goto            36
			flag = false;
	//   18   34:iconst_0        
	//   19   35:istore_3        
		c = flag;
	//   20   36:aload_0         
	//   21   37:iload_3         
	//   22   38:putfield        #45  <Field boolean c>
	//   23   41:return          
	}

	public AppBarLayout$BaseBehavior$SavedState(Parcelable parcelable)
	{
		super(parcelable);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #48  <Method void AbsSavedState(Parcelable)>
	//    3    5:return          
	}
}
