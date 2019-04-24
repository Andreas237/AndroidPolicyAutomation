// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.github.mikephil.charting.data;

import android.graphics.drawable.Drawable;
import android.os.*;
import o.ls;
import o.oc;

public class Entry extends ls
	implements Parcelable
{

	public Entry()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #22  <Method void ls()>
		x = 0.0F;
	//    2    4:aload_0         
	//    3    5:fconst_0        
	//    4    6:putfield        #24  <Field float x>
	//    5    9:return          
	}

	public Entry(float f, float f1)
	{
		super(f1);
	//    0    0:aload_0         
	//    1    1:fload_2         
	//    2    2:invokespecial   #28  <Method void ls(float)>
		x = 0.0F;
	//    3    5:aload_0         
	//    4    6:fconst_0        
	//    5    7:putfield        #24  <Field float x>
		x = f;
	//    6   10:aload_0         
	//    7   11:fload_1         
	//    8   12:putfield        #24  <Field float x>
	//    9   15:return          
	}

	public Entry(float f, float f1, Drawable drawable)
	{
		super(f1, drawable);
	//    0    0:aload_0         
	//    1    1:fload_2         
	//    2    2:aload_3         
	//    3    3:invokespecial   #32  <Method void ls(float, Drawable)>
		x = 0.0F;
	//    4    6:aload_0         
	//    5    7:fconst_0        
	//    6    8:putfield        #24  <Field float x>
		x = f;
	//    7   11:aload_0         
	//    8   12:fload_1         
	//    9   13:putfield        #24  <Field float x>
	//   10   16:return          
	}

	public Entry(float f, float f1, Drawable drawable, Object obj)
	{
		super(f1, drawable, obj);
	//    0    0:aload_0         
	//    1    1:fload_2         
	//    2    2:aload_3         
	//    3    3:aload           4
	//    4    5:invokespecial   #36  <Method void ls(float, Drawable, Object)>
		x = 0.0F;
	//    5    8:aload_0         
	//    6    9:fconst_0        
	//    7   10:putfield        #24  <Field float x>
		x = f;
	//    8   13:aload_0         
	//    9   14:fload_1         
	//   10   15:putfield        #24  <Field float x>
	//   11   18:return          
	}

	public Entry(float f, float f1, Object obj)
	{
		super(f1, obj);
	//    0    0:aload_0         
	//    1    1:fload_2         
	//    2    2:aload_3         
	//    3    3:invokespecial   #40  <Method void ls(float, Object)>
		x = 0.0F;
	//    4    6:aload_0         
	//    5    7:fconst_0        
	//    6    8:putfield        #24  <Field float x>
		x = f;
	//    7   11:aload_0         
	//    8   12:fload_1         
	//    9   13:putfield        #24  <Field float x>
	//   10   16:return          
	}

	protected Entry(Parcel parcel)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #22  <Method void ls()>
		x = 0.0F;
	//    2    4:aload_0         
	//    3    5:fconst_0        
	//    4    6:putfield        #24  <Field float x>
		x = parcel.readFloat();
	//    5    9:aload_0         
	//    6   10:aload_1         
	//    7   11:invokevirtual   #47  <Method float Parcel.readFloat()>
	//    8   14:putfield        #24  <Field float x>
		setY(parcel.readFloat());
	//    9   17:aload_0         
	//   10   18:aload_1         
	//   11   19:invokevirtual   #47  <Method float Parcel.readFloat()>
	//   12   22:invokevirtual   #50  <Method void setY(float)>
		if(parcel.readInt() == 1)
	//*  13   25:aload_1         
	//*  14   26:invokevirtual   #54  <Method int Parcel.readInt()>
	//*  15   29:iconst_1        
	//*  16   30:icmpne          46
			setData(((Object) (parcel.readParcelable(((Class) (java/lang/Object)).getClassLoader()))));
	//   17   33:aload_0         
	//   18   34:aload_1         
	//   19   35:ldc1            #56  <Class Object>
	//   20   37:invokevirtual   #62  <Method ClassLoader Class.getClassLoader()>
	//   21   40:invokevirtual   #66  <Method Parcelable Parcel.readParcelable(ClassLoader)>
	//   22   43:invokevirtual   #70  <Method void setData(Object)>
	//   23   46:return          
	}

	public Entry copy()
	{
		return new Entry(x, getY(), getData());
	//    0    0:new             #2   <Class Entry>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:getfield        #24  <Field float x>
	//    4    8:aload_0         
	//    5    9:invokevirtual   #75  <Method float getY()>
	//    6   12:aload_0         
	//    7   13:invokevirtual   #79  <Method Object getData()>
	//    8   16:invokespecial   #81  <Method void Entry(float, float, Object)>
	//    9   19:areturn         
	}

	public int describeContents()
	{
		return 0;
	//    0    0:iconst_0        
	//    1    1:ireturn         
	}

	public boolean equalTo(Entry entry)
	{
		if(entry == null)
	//*   0    0:aload_1         
	//*   1    1:ifnonnull       6
			return false;
	//    2    4:iconst_0        
	//    3    5:ireturn         
		if(entry.getData() != getData())
	//*   4    6:aload_1         
	//*   5    7:invokevirtual   #79  <Method Object getData()>
	//*   6   10:aload_0         
	//*   7   11:invokevirtual   #79  <Method Object getData()>
	//*   8   14:if_acmpeq       19
			return false;
	//    9   17:iconst_0        
	//   10   18:ireturn         
		if(Math.abs(entry.x - x) > oc.b)
	//*  11   19:aload_1         
	//*  12   20:getfield        #24  <Field float x>
	//*  13   23:aload_0         
	//*  14   24:getfield        #24  <Field float x>
	//*  15   27:fsub            
	//*  16   28:invokestatic    #90  <Method float Math.abs(float)>
	//*  17   31:getstatic       #95  <Field float oc.b>
	//*  18   34:fcmpl           
	//*  19   35:ifle            40
			return false;
	//   20   38:iconst_0        
	//   21   39:ireturn         
		return Math.abs(entry.getY() - getY()) <= oc.b;
	//   22   40:aload_1         
	//   23   41:invokevirtual   #75  <Method float getY()>
	//   24   44:aload_0         
	//   25   45:invokevirtual   #75  <Method float getY()>
	//   26   48:fsub            
	//   27   49:invokestatic    #90  <Method float Math.abs(float)>
	//   28   52:getstatic       #95  <Field float oc.b>
	//   29   55:fcmpl           
	//   30   56:ifle            61
	//   31   59:iconst_0        
	//   32   60:ireturn         
	//   33   61:iconst_1        
	//   34   62:ireturn         
	}

	public float getX()
	{
		return x;
	//    0    0:aload_0         
	//    1    1:getfield        #24  <Field float x>
	//    2    4:freturn         
	}

	public void setX(float f)
	{
		x = f;
	//    0    0:aload_0         
	//    1    1:fload_1         
	//    2    2:putfield        #24  <Field float x>
	//    3    5:return          
	}

	public String toString()
	{
		return (new StringBuilder()).append("Entry, x: ").append(x).append(" y: ").append(getY()).toString();
	//    0    0:new             #101 <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #102 <Method void StringBuilder()>
	//    3    7:ldc1            #104 <String "Entry, x: ">
	//    4    9:invokevirtual   #108 <Method StringBuilder StringBuilder.append(String)>
	//    5   12:aload_0         
	//    6   13:getfield        #24  <Field float x>
	//    7   16:invokevirtual   #111 <Method StringBuilder StringBuilder.append(float)>
	//    8   19:ldc1            #113 <String " y: ">
	//    9   21:invokevirtual   #108 <Method StringBuilder StringBuilder.append(String)>
	//   10   24:aload_0         
	//   11   25:invokevirtual   #75  <Method float getY()>
	//   12   28:invokevirtual   #111 <Method StringBuilder StringBuilder.append(float)>
	//   13   31:invokevirtual   #115 <Method String StringBuilder.toString()>
	//   14   34:areturn         
	}

	public void writeToParcel(Parcel parcel, int i)
	{
		parcel.writeFloat(x);
	//    0    0:aload_1         
	//    1    1:aload_0         
	//    2    2:getfield        #24  <Field float x>
	//    3    5:invokevirtual   #120 <Method void Parcel.writeFloat(float)>
		parcel.writeFloat(getY());
	//    4    8:aload_1         
	//    5    9:aload_0         
	//    6   10:invokevirtual   #75  <Method float getY()>
	//    7   13:invokevirtual   #120 <Method void Parcel.writeFloat(float)>
		if(getData() != null)
	//*   8   16:aload_0         
	//*   9   17:invokevirtual   #79  <Method Object getData()>
	//*  10   20:ifnull          61
		{
			if(getData() instanceof Parcelable)
	//*  11   23:aload_0         
	//*  12   24:invokevirtual   #79  <Method Object getData()>
	//*  13   27:instanceof      #6   <Class Parcelable>
	//*  14   30:ifeq            51
			{
				parcel.writeInt(1);
	//   15   33:aload_1         
	//   16   34:iconst_1        
	//   17   35:invokevirtual   #124 <Method void Parcel.writeInt(int)>
				parcel.writeParcelable((Parcelable)getData(), i);
	//   18   38:aload_1         
	//   19   39:aload_0         
	//   20   40:invokevirtual   #79  <Method Object getData()>
	//   21   43:checkcast       #6   <Class Parcelable>
	//   22   46:iload_2         
	//   23   47:invokevirtual   #128 <Method void Parcel.writeParcelable(Parcelable, int)>
				return;
	//   24   50:return          
			} else
			{
				throw new ParcelFormatException("Cannot parcel an Entry with non-parcelable data");
	//   25   51:new             #130 <Class ParcelFormatException>
	//   26   54:dup             
	//   27   55:ldc1            #132 <String "Cannot parcel an Entry with non-parcelable data">
	//   28   57:invokespecial   #135 <Method void ParcelFormatException(String)>
	//   29   60:athrow          
			}
		} else
		{
			parcel.writeInt(0);
	//   30   61:aload_1         
	//   31   62:iconst_0        
	//   32   63:invokevirtual   #124 <Method void Parcel.writeInt(int)>
			return;
	//   33   66:return          
		}
	}

	public static final android.os.Parcelable.Creator CREATOR = new android.os.Parcelable.Creator() {

		public Entry[] b(int i)
		{
			return new Entry[i];
		//    0    0:iload_1         
		//    1    1:anewarray       Entry[]
		//    2    4:areturn         
		}

		public Object createFromParcel(Parcel parcel)
		{
			return ((Object) (e(parcel)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokevirtual   #22  <Method Entry e(Parcel)>
		//    3    5:areturn         
		}

		public Entry e(Parcel parcel)
		{
			return new Entry(parcel);
		//    0    0:new             #9   <Class Entry>
		//    1    3:dup             
		//    2    4:aload_1         
		//    3    5:invokespecial   #25  <Method void Entry(Parcel)>
		//    4    8:areturn         
		}

		public Object[] newArray(int i)
		{
			return ((Object []) (b(i)));
		//    0    0:aload_0         
		//    1    1:iload_1         
		//    2    2:invokevirtual   #29  <Method Entry[] b(int)>
		//    3    5:areturn         
		}

	}
;
	private float x;

	static 
	{
	//    0    0:new             #8   <Class Entry$2>
	//    1    3:dup             
	//    2    4:invokespecial   #18  <Method void Entry$2()>
	//    3    7:putstatic       #20  <Field android.os.Parcelable$Creator CREATOR>
	//*   4   10:return          
	}
}
