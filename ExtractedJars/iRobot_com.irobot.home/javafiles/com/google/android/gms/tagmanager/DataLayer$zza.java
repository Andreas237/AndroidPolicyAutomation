// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.tagmanager;

import java.util.Arrays;

// Referenced classes of package com.google.android.gms.tagmanager:
//			DataLayer

static final class DataLayer$zza
{

	public final boolean equals(Object obj)
	{
		if(!(obj instanceof DataLayer$zza))
	//*   0    0:aload_1         
	//*   1    1:instanceof      #2   <Class DataLayer$zza>
	//*   2    4:ifne            9
			return false;
	//    3    7:iconst_0        
	//    4    8:ireturn         
		obj = ((Object) ((DataLayer$zza)obj));
	//    5    9:aload_1         
	//    6   10:checkcast       #2   <Class DataLayer$zza>
	//    7   13:astore_1        
		return mKey.equals(((Object) (((DataLayer$zza) (obj)).mKey))) && mValue.equals(((DataLayer$zza) (obj)).mValue);
	//    8   14:aload_0         
	//    9   15:getfield        #18  <Field String mKey>
	//   10   18:aload_1         
	//   11   19:getfield        #18  <Field String mKey>
	//   12   22:invokevirtual   #27  <Method boolean String.equals(Object)>
	//   13   25:ifeq            44
	//   14   28:aload_0         
	//   15   29:getfield        #20  <Field Object mValue>
	//   16   32:aload_1         
	//   17   33:getfield        #20  <Field Object mValue>
	//   18   36:invokevirtual   #28  <Method boolean Object.equals(Object)>
	//   19   39:ifeq            44
	//   20   42:iconst_1        
	//   21   43:ireturn         
	//   22   44:iconst_0        
	//   23   45:ireturn         
	}

	public final int hashCode()
	{
		return Arrays.hashCode(((Object []) (new Integer[] {
			Integer.valueOf(mKey.hashCode()), Integer.valueOf(mValue.hashCode())
		})));
	//    0    0:iconst_2        
	//    1    1:anewarray       Integer[]
	//    2    4:dup             
	//    3    5:iconst_0        
	//    4    6:aload_0         
	//    5    7:getfield        #18  <Field String mKey>
	//    6   10:invokevirtual   #34  <Method int String.hashCode()>
	//    7   13:invokestatic    #38  <Method Integer Integer.valueOf(int)>
	//    8   16:aastore         
	//    9   17:dup             
	//   10   18:iconst_1        
	//   11   19:aload_0         
	//   12   20:getfield        #20  <Field Object mValue>
	//   13   23:invokevirtual   #39  <Method int Object.hashCode()>
	//   14   26:invokestatic    #38  <Method Integer Integer.valueOf(int)>
	//   15   29:aastore         
	//   16   30:invokestatic    #44  <Method int Arrays.hashCode(Object[])>
	//   17   33:ireturn         
	}

	public final String toString()
	{
		String s = mKey;
	//    0    0:aload_0         
	//    1    1:getfield        #18  <Field String mKey>
	//    2    4:astore_1        
		String s1 = mValue.toString();
	//    3    5:aload_0         
	//    4    6:getfield        #20  <Field Object mValue>
	//    5    9:invokevirtual   #48  <Method String Object.toString()>
	//    6   12:astore_2        
		StringBuilder stringbuilder = new StringBuilder(String.valueOf(((Object) (s))).length() + 13 + String.valueOf(((Object) (s1))).length());
	//    7   13:new             #50  <Class StringBuilder>
	//    8   16:dup             
	//    9   17:aload_1         
	//   10   18:invokestatic    #53  <Method String String.valueOf(Object)>
	//   11   21:invokevirtual   #56  <Method int String.length()>
	//   12   24:bipush          13
	//   13   26:iadd            
	//   14   27:aload_2         
	//   15   28:invokestatic    #53  <Method String String.valueOf(Object)>
	//   16   31:invokevirtual   #56  <Method int String.length()>
	//   17   34:iadd            
	//   18   35:invokespecial   #59  <Method void StringBuilder(int)>
	//   19   38:astore_3        
		stringbuilder.append("Key: ");
	//   20   39:aload_3         
	//   21   40:ldc1            #61  <String "Key: ">
	//   22   42:invokevirtual   #65  <Method StringBuilder StringBuilder.append(String)>
	//   23   45:pop             
		stringbuilder.append(s);
	//   24   46:aload_3         
	//   25   47:aload_1         
	//   26   48:invokevirtual   #65  <Method StringBuilder StringBuilder.append(String)>
	//   27   51:pop             
		stringbuilder.append(" value: ");
	//   28   52:aload_3         
	//   29   53:ldc1            #67  <String " value: ">
	//   30   55:invokevirtual   #65  <Method StringBuilder StringBuilder.append(String)>
	//   31   58:pop             
		stringbuilder.append(s1);
	//   32   59:aload_3         
	//   33   60:aload_2         
	//   34   61:invokevirtual   #65  <Method StringBuilder StringBuilder.append(String)>
	//   35   64:pop             
		return stringbuilder.toString();
	//   36   65:aload_3         
	//   37   66:invokevirtual   #68  <Method String StringBuilder.toString()>
	//   38   69:areturn         
	}

	public final String mKey;
	public final Object mValue;

	DataLayer$zza(String s, Object obj)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #16  <Method void Object()>
		mKey = s;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #18  <Field String mKey>
		mValue = obj;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #20  <Field Object mValue>
	//    8   14:return          
	}
}
