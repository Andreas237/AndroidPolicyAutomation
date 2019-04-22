// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.digits.sdk.android;

import java.text.Collator;
import java.util.Locale;

class CountryInfo
	implements Comparable
{

	public CountryInfo(String s, int i)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #18  <Method void Object()>
	//    2    4:aload_0         
	//    3    5:invokestatic    #24  <Method Locale Locale.getDefault()>
	//    4    8:invokestatic    #30  <Method Collator Collator.getInstance(Locale)>
	//    5   11:putfield        #32  <Field Collator collator>
		collator.setStrength(0);
	//    6   14:aload_0         
	//    7   15:getfield        #32  <Field Collator collator>
	//    8   18:iconst_0        
	//    9   19:invokevirtual   #36  <Method void Collator.setStrength(int)>
		country = s;
	//   10   22:aload_0         
	//   11   23:aload_1         
	//   12   24:putfield        #38  <Field String country>
		countryCode = i;
	//   13   27:aload_0         
	//   14   28:iload_2         
	//   15   29:putfield        #40  <Field int countryCode>
	//   16   32:return          
	}

	public int compareTo(CountryInfo countryinfo)
	{
		return collator.compare(country, countryinfo.country);
	//    0    0:aload_0         
	//    1    1:getfield        #32  <Field Collator collator>
	//    2    4:aload_0         
	//    3    5:getfield        #38  <Field String country>
	//    4    8:aload_1         
	//    5    9:getfield        #38  <Field String country>
	//    6   12:invokevirtual   #47  <Method int Collator.compare(String, String)>
	//    7   15:ireturn         
	}

	public volatile int compareTo(Object obj)
	{
		return compareTo((CountryInfo)obj);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:checkcast       #2   <Class CountryInfo>
	//    3    5:invokevirtual   #50  <Method int compareTo(CountryInfo)>
	//    4    8:ireturn         
	}

	public boolean equals(Object obj)
	{
label0:
		{
			boolean flag;
label1:
			{
				flag = true;
	//    0    0:iconst_1        
	//    1    1:istore_2        
				if(this == obj)
	//*   2    2:aload_0         
	//*   3    3:aload_1         
	//*   4    4:if_acmpne       9
					return true;
	//    5    7:iconst_1        
	//    6    8:ireturn         
				if(obj == null)
					break label0;
	//    7    9:aload_1         
	//    8   10:ifnull          78
				if(((Object)this).getClass() != obj.getClass())
	//*   9   13:aload_0         
	//*  10   14:invokevirtual   #56  <Method Class Object.getClass()>
	//*  11   17:aload_1         
	//*  12   18:invokevirtual   #56  <Method Class Object.getClass()>
	//*  13   21:if_acmpeq       26
					return false;
	//   14   24:iconst_0        
	//   15   25:ireturn         
				obj = ((Object) ((CountryInfo)obj));
	//   16   26:aload_1         
	//   17   27:checkcast       #2   <Class CountryInfo>
	//   18   30:astore_1        
				if(countryCode == ((CountryInfo) (obj)).countryCode)
	//*  19   31:aload_0         
	//*  20   32:getfield        #40  <Field int countryCode>
	//*  21   35:aload_1         
	//*  22   36:getfield        #40  <Field int countryCode>
	//*  23   39:icmpne          74
				{
					String s = country;
	//   24   42:aload_0         
	//   25   43:getfield        #38  <Field String country>
	//   26   46:astore_3        
					if(s != null)
	//*  27   47:aload_3         
	//*  28   48:ifnull          65
					{
						if(s.equals(((Object) (((CountryInfo) (obj)).country))))
	//*  29   51:aload_3         
	//*  30   52:aload_1         
	//*  31   53:getfield        #38  <Field String country>
	//*  32   56:invokevirtual   #60  <Method boolean String.equals(Object)>
	//*  33   59:ifne            76
							break label1;
	//   34   62:goto            74
					} else
					if(((CountryInfo) (obj)).country == null)
	//*  35   65:aload_1         
	//*  36   66:getfield        #38  <Field String country>
	//*  37   69:ifnonnull       74
						return true;
	//   38   72:iconst_1        
	//   39   73:ireturn         
				}
				flag = false;
	//   40   74:iconst_0        
	//   41   75:istore_2        
			}
			return flag;
	//   42   76:iload_2         
	//   43   77:ireturn         
		}
		return false;
	//   44   78:iconst_0        
	//   45   79:ireturn         
	}

	public int hashCode()
	{
		String s = country;
	//    0    0:aload_0         
	//    1    1:getfield        #38  <Field String country>
	//    2    4:astore_2        
		int i;
		if(s != null)
	//*   3    5:aload_2         
	//*   4    6:ifnull          17
			i = s.hashCode();
	//    5    9:aload_2         
	//    6   10:invokevirtual   #64  <Method int String.hashCode()>
	//    7   13:istore_1        
		else
	//*   8   14:goto            19
			i = 0;
	//    9   17:iconst_0        
	//   10   18:istore_1        
		return i * 31 + countryCode;
	//   11   19:iload_1         
	//   12   20:bipush          31
	//   13   22:imul            
	//   14   23:aload_0         
	//   15   24:getfield        #40  <Field int countryCode>
	//   16   27:iadd            
	//   17   28:ireturn         
	}

	public String toString()
	{
		StringBuilder stringbuilder = new StringBuilder();
	//    0    0:new             #68  <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #69  <Method void StringBuilder()>
	//    3    7:astore_1        
		stringbuilder.append(country);
	//    4    8:aload_1         
	//    5    9:aload_0         
	//    6   10:getfield        #38  <Field String country>
	//    7   13:invokevirtual   #73  <Method StringBuilder StringBuilder.append(String)>
	//    8   16:pop             
		stringbuilder.append(" +");
	//    9   17:aload_1         
	//   10   18:ldc1            #75  <String " +">
	//   11   20:invokevirtual   #73  <Method StringBuilder StringBuilder.append(String)>
	//   12   23:pop             
		stringbuilder.append(countryCode);
	//   13   24:aload_1         
	//   14   25:aload_0         
	//   15   26:getfield        #40  <Field int countryCode>
	//   16   29:invokevirtual   #78  <Method StringBuilder StringBuilder.append(int)>
	//   17   32:pop             
		return stringbuilder.toString();
	//   18   33:aload_1         
	//   19   34:invokevirtual   #80  <Method String StringBuilder.toString()>
	//   20   37:areturn         
	}

	private final Collator collator = Collator.getInstance(Locale.getDefault());
	public final String country;
	public final int countryCode;
}
