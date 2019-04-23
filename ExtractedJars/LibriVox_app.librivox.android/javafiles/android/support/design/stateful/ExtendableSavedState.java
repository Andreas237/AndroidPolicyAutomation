// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.design.stateful;

import android.os.*;
import android.support.v4.g.w;
import android.support.v4.view.AbsSavedState;

// Referenced classes of package android.support.design.stateful:
//			a

public class ExtendableSavedState extends AbsSavedState
{

	private ExtendableSavedState(Parcel parcel, ClassLoader classloader)
	{
		super(parcel, classloader);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #21  <Method void AbsSavedState(Parcel, ClassLoader)>
		int j = parcel.readInt();
	//    4    6:aload_1         
	//    5    7:invokevirtual   #27  <Method int Parcel.readInt()>
	//    6   10:istore          4
		classloader = ((ClassLoader) (new String[j]));
	//    7   12:iload           4
	//    8   14:anewarray       String[]
	//    9   17:astore_2        
		parcel.readStringArray(((String []) (classloader)));
	//   10   18:aload_1         
	//   11   19:aload_2         
	//   12   20:invokevirtual   #33  <Method void Parcel.readStringArray(String[])>
		Bundle abundle[] = new Bundle[j];
	//   13   23:iload           4
	//   14   25:anewarray       Bundle[]
	//   15   28:astore          5
		parcel.readTypedArray(((Object []) (abundle)), Bundle.CREATOR);
	//   16   30:aload_1         
	//   17   31:aload           5
	//   18   33:getstatic       #36  <Field android.os.Parcelable$Creator Bundle.CREATOR>
	//   19   36:invokevirtual   #40  <Method void Parcel.readTypedArray(Object[], android.os.Parcelable$Creator)>
		a = new w(j);
	//   20   39:aload_0         
	//   21   40:new             #42  <Class w>
	//   22   43:dup             
	//   23   44:iload           4
	//   24   46:invokespecial   #45  <Method void w(int)>
	//   25   49:putfield        #47  <Field w a>
		for(int i = 0; i < j; i++)
	//*  26   52:iconst_0        
	//*  27   53:istore_3        
	//*  28   54:iload_3         
	//*  29   55:iload           4
	//*  30   57:icmpge          82
			a.put(((Object) (classloader[i])), ((Object) (abundle[i])));
	//   31   60:aload_0         
	//   32   61:getfield        #47  <Field w a>
	//   33   64:aload_2         
	//   34   65:iload_3         
	//   35   66:aaload          
	//   36   67:aload           5
	//   37   69:iload_3         
	//   38   70:aaload          
	//   39   71:invokevirtual   #51  <Method Object w.put(Object, Object)>
	//   40   74:pop             

	//   41   75:iload_3         
	//   42   76:iconst_1        
	//   43   77:iadd            
	//   44   78:istore_3        
	//*  45   79:goto            54
	//   46   82:return          
	}

	ExtendableSavedState(Parcel parcel, ClassLoader classloader, a a1)
	{
		this(parcel, classloader);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #53  <Method void ExtendableSavedState(Parcel, ClassLoader)>
	//    4    6:return          
	}

	public ExtendableSavedState(Parcelable parcelable)
	{
		super(parcelable);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #56  <Method void AbsSavedState(Parcelable)>
		a = new w();
	//    3    5:aload_0         
	//    4    6:new             #42  <Class w>
	//    5    9:dup             
	//    6   10:invokespecial   #57  <Method void w()>
	//    7   13:putfield        #47  <Field w a>
	//    8   16:return          
	}

	public String toString()
	{
		StringBuilder stringbuilder = new StringBuilder();
	//    0    0:new             #61  <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #62  <Method void StringBuilder()>
	//    3    7:astore_1        
		stringbuilder.append("ExtendableSavedState{");
	//    4    8:aload_1         
	//    5    9:ldc1            #64  <String "ExtendableSavedState{">
	//    6   11:invokevirtual   #68  <Method StringBuilder StringBuilder.append(String)>
	//    7   14:pop             
		stringbuilder.append(Integer.toHexString(System.identityHashCode(((Object) (this)))));
	//    8   15:aload_1         
	//    9   16:aload_0         
	//   10   17:invokestatic    #74  <Method int System.identityHashCode(Object)>
	//   11   20:invokestatic    #80  <Method String Integer.toHexString(int)>
	//   12   23:invokevirtual   #68  <Method StringBuilder StringBuilder.append(String)>
	//   13   26:pop             
		stringbuilder.append(" states=");
	//   14   27:aload_1         
	//   15   28:ldc1            #82  <String " states=">
	//   16   30:invokevirtual   #68  <Method StringBuilder StringBuilder.append(String)>
	//   17   33:pop             
		stringbuilder.append(((Object) (a)));
	//   18   34:aload_1         
	//   19   35:aload_0         
	//   20   36:getfield        #47  <Field w a>
	//   21   39:invokevirtual   #85  <Method StringBuilder StringBuilder.append(Object)>
	//   22   42:pop             
		stringbuilder.append("}");
	//   23   43:aload_1         
	//   24   44:ldc1            #87  <String "}">
	//   25   46:invokevirtual   #68  <Method StringBuilder StringBuilder.append(String)>
	//   26   49:pop             
		return stringbuilder.toString();
	//   27   50:aload_1         
	//   28   51:invokevirtual   #89  <Method String StringBuilder.toString()>
	//   29   54:areturn         
	}

	public void writeToParcel(Parcel parcel, int i)
	{
		super.writeToParcel(parcel, i);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:invokespecial   #93  <Method void AbsSavedState.writeToParcel(Parcel, int)>
		int j = a.size();
	//    4    6:aload_0         
	//    5    7:getfield        #47  <Field w a>
	//    6   10:invokevirtual   #96  <Method int w.size()>
	//    7   13:istore_3        
		parcel.writeInt(j);
	//    8   14:aload_1         
	//    9   15:iload_3         
	//   10   16:invokevirtual   #99  <Method void Parcel.writeInt(int)>
		String as[] = new String[j];
	//   11   19:iload_3         
	//   12   20:anewarray       String[]
	//   13   23:astore          4
		Bundle abundle[] = new Bundle[j];
	//   14   25:iload_3         
	//   15   26:anewarray       Bundle[]
	//   16   29:astore          5
		for(i = 0; i < j; i++)
	//*  17   31:iconst_0        
	//*  18   32:istore_2        
	//*  19   33:iload_2         
	//*  20   34:iload_3         
	//*  21   35:icmpge          75
		{
			as[i] = (String)a.b(i);
	//   22   38:aload           4
	//   23   40:iload_2         
	//   24   41:aload_0         
	//   25   42:getfield        #47  <Field w a>
	//   26   45:iload_2         
	//   27   46:invokevirtual   #103 <Method Object w.b(int)>
	//   28   49:checkcast       #29  <Class String>
	//   29   52:aastore         
			abundle[i] = (Bundle)a.c(i);
	//   30   53:aload           5
	//   31   55:iload_2         
	//   32   56:aload_0         
	//   33   57:getfield        #47  <Field w a>
	//   34   60:iload_2         
	//   35   61:invokevirtual   #106 <Method Object w.c(int)>
	//   36   64:checkcast       #35  <Class Bundle>
	//   37   67:aastore         
		}

	//   38   68:iload_2         
	//   39   69:iconst_1        
	//   40   70:iadd            
	//   41   71:istore_2        
	//*  42   72:goto            33
		parcel.writeStringArray(as);
	//   43   75:aload_1         
	//   44   76:aload           4
	//   45   78:invokevirtual   #109 <Method void Parcel.writeStringArray(String[])>
		parcel.writeTypedArray(((Parcelable []) (abundle)), 0);
	//   46   81:aload_1         
	//   47   82:aload           5
	//   48   84:iconst_0        
	//   49   85:invokevirtual   #113 <Method void Parcel.writeTypedArray(Parcelable[], int)>
	//   50   88:return          
	}

	public static final android.os.Parcelable.Creator CREATOR = new a();
	public final w a;

	static 
	{
	//    0    0:new             #12  <Class a>
	//    1    3:dup             
	//    2    4:invokespecial   #15  <Method void a()>
	//    3    7:putstatic       #17  <Field android.os.Parcelable$Creator CREATOR>
	//*   4   10:return          
	}
}
