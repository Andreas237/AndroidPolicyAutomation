// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package io.michaelrocks.libphonenumber.android;

import java.util.Arrays;

public final class PhoneNumberMatch
{

	PhoneNumberMatch(int i, String s, Phonenumber.PhoneNumber phonenumber)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #15  <Method void Object()>
		if(i < 0)
	//*   2    4:iload_1         
	//*   3    5:ifge            18
			throw new IllegalArgumentException("Start index must be >= 0.");
	//    4    8:new             #17  <Class IllegalArgumentException>
	//    5   11:dup             
	//    6   12:ldc1            #19  <String "Start index must be >= 0.">
	//    7   14:invokespecial   #22  <Method void IllegalArgumentException(String)>
	//    8   17:athrow          
		if(s == null || phonenumber == null)
	//*   9   18:aload_2         
	//*  10   19:ifnull          26
	//*  11   22:aload_3         
	//*  12   23:ifnonnull       34
		{
			throw new NullPointerException();
	//   13   26:new             #24  <Class NullPointerException>
	//   14   29:dup             
	//   15   30:invokespecial   #25  <Method void NullPointerException()>
	//   16   33:athrow          
		} else
		{
			start = i;
	//   17   34:aload_0         
	//   18   35:iload_1         
	//   19   36:putfield        #27  <Field int start>
			rawString = s;
	//   20   39:aload_0         
	//   21   40:aload_2         
	//   22   41:putfield        #29  <Field String rawString>
			number = phonenumber;
	//   23   44:aload_0         
	//   24   45:aload_3         
	//   25   46:putfield        #31  <Field Phonenumber$PhoneNumber number>
			return;
	//   26   49:return          
		}
	}

	public int end()
	{
		return start + rawString.length();
	//    0    0:aload_0         
	//    1    1:getfield        #27  <Field int start>
	//    2    4:aload_0         
	//    3    5:getfield        #29  <Field String rawString>
	//    4    8:invokevirtual   #39  <Method int String.length()>
	//    5   11:iadd            
	//    6   12:ireturn         
	}

	public boolean equals(Object obj)
	{
		if(this != obj)
	//*   0    0:aload_0         
	//*   1    1:aload_1         
	//*   2    2:if_acmpne       7
	//*   3    5:iconst_1        
	//*   4    6:ireturn         
		{
			if(!(obj instanceof PhoneNumberMatch))
	//*   5    7:aload_1         
	//*   6    8:instanceof      #2   <Class PhoneNumberMatch>
	//*   7   11:ifne            16
				return false;
	//    8   14:iconst_0        
	//    9   15:ireturn         
			obj = ((Object) ((PhoneNumberMatch)obj));
	//   10   16:aload_1         
	//   11   17:checkcast       #2   <Class PhoneNumberMatch>
	//   12   20:astore_1        
			if(!rawString.equals(((Object) (((PhoneNumberMatch) (obj)).rawString))) || start != ((PhoneNumberMatch) (obj)).start || !number.equals(((Object) (((PhoneNumberMatch) (obj)).number))))
	//*  13   21:aload_0         
	//*  14   22:getfield        #29  <Field String rawString>
	//*  15   25:aload_1         
	//*  16   26:getfield        #29  <Field String rawString>
	//*  17   29:invokevirtual   #43  <Method boolean String.equals(Object)>
	//*  18   32:ifeq            60
	//*  19   35:aload_0         
	//*  20   36:getfield        #27  <Field int start>
	//*  21   39:aload_1         
	//*  22   40:getfield        #27  <Field int start>
	//*  23   43:icmpne          60
	//*  24   46:aload_0         
	//*  25   47:getfield        #31  <Field Phonenumber$PhoneNumber number>
	//*  26   50:aload_1         
	//*  27   51:getfield        #31  <Field Phonenumber$PhoneNumber number>
	//*  28   54:invokevirtual   #46  <Method boolean Phonenumber$PhoneNumber.equals(Object)>
	//*  29   57:ifne            5
				return false;
	//   30   60:iconst_0        
	//   31   61:ireturn         
		}
		return true;
	}

	public int hashCode()
	{
		return Arrays.hashCode(new Object[] {
			Integer.valueOf(start), rawString, number
		});
	//    0    0:iconst_3        
	//    1    1:anewarray       Object[]
	//    2    4:dup             
	//    3    5:iconst_0        
	//    4    6:aload_0         
	//    5    7:getfield        #27  <Field int start>
	//    6   10:invokestatic    #53  <Method Integer Integer.valueOf(int)>
	//    7   13:aastore         
	//    8   14:dup             
	//    9   15:iconst_1        
	//   10   16:aload_0         
	//   11   17:getfield        #29  <Field String rawString>
	//   12   20:aastore         
	//   13   21:dup             
	//   14   22:iconst_2        
	//   15   23:aload_0         
	//   16   24:getfield        #31  <Field Phonenumber$PhoneNumber number>
	//   17   27:aastore         
	//   18   28:invokestatic    #58  <Method int Arrays.hashCode(Object[])>
	//   19   31:ireturn         
	}

	public Phonenumber.PhoneNumber number()
	{
		return number;
	//    0    0:aload_0         
	//    1    1:getfield        #31  <Field Phonenumber$PhoneNumber number>
	//    2    4:areturn         
	}

	public String rawString()
	{
		return rawString;
	//    0    0:aload_0         
	//    1    1:getfield        #29  <Field String rawString>
	//    2    4:areturn         
	}

	public int start()
	{
		return start;
	//    0    0:aload_0         
	//    1    1:getfield        #27  <Field int start>
	//    2    4:ireturn         
	}

	public String toString()
	{
		return (new StringBuilder()).append("PhoneNumberMatch [").append(start()).append(",").append(end()).append(") ").append(rawString).toString();
	//    0    0:new             #63  <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #64  <Method void StringBuilder()>
	//    3    7:ldc1            #66  <String "PhoneNumberMatch [">
	//    4    9:invokevirtual   #70  <Method StringBuilder StringBuilder.append(String)>
	//    5   12:aload_0         
	//    6   13:invokevirtual   #72  <Method int start()>
	//    7   16:invokevirtual   #75  <Method StringBuilder StringBuilder.append(int)>
	//    8   19:ldc1            #77  <String ",">
	//    9   21:invokevirtual   #70  <Method StringBuilder StringBuilder.append(String)>
	//   10   24:aload_0         
	//   11   25:invokevirtual   #79  <Method int end()>
	//   12   28:invokevirtual   #75  <Method StringBuilder StringBuilder.append(int)>
	//   13   31:ldc1            #81  <String ") ">
	//   14   33:invokevirtual   #70  <Method StringBuilder StringBuilder.append(String)>
	//   15   36:aload_0         
	//   16   37:getfield        #29  <Field String rawString>
	//   17   40:invokevirtual   #70  <Method StringBuilder StringBuilder.append(String)>
	//   18   43:invokevirtual   #83  <Method String StringBuilder.toString()>
	//   19   46:areturn         
	}

	private final Phonenumber.PhoneNumber number;
	private final String rawString;
	private final int start;
}
