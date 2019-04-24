// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.irobot.home.view;

import android.text.InputFilter;
import android.text.Spanned;

// Referenced classes of package com.irobot.home.view:
//			IPAddressText

class IPAddressText$1
	implements InputFilter
{

	public CharSequence filter(CharSequence charsequence, int i, int j, Spanned spanned, int k, int l)
	{
		if(j > i)
	//*   0    0:iload_3         
	//*   1    1:iload_2         
	//*   2    2:icmple          124
		{
			spanned = ((Spanned) (((Object) (spanned)).toString()));
	//    3    5:aload           4
	//    4    7:invokevirtual   #25  <Method String Object.toString()>
	//    5   10:astore          4
			StringBuilder stringbuilder = new StringBuilder();
	//    6   12:new             #27  <Class StringBuilder>
	//    7   15:dup             
	//    8   16:invokespecial   #28  <Method void StringBuilder()>
	//    9   19:astore          8
			boolean flag = false;
	//   10   21:iconst_0        
	//   11   22:istore          7
			stringbuilder.append(((String) (spanned)).substring(0, k));
	//   12   24:aload           8
	//   13   26:aload           4
	//   14   28:iconst_0        
	//   15   29:iload           5
	//   16   31:invokevirtual   #34  <Method String String.substring(int, int)>
	//   17   34:invokevirtual   #38  <Method StringBuilder StringBuilder.append(String)>
	//   18   37:pop             
			stringbuilder.append(((Object) (charsequence.subSequence(i, j))));
	//   19   38:aload           8
	//   20   40:aload_1         
	//   21   41:iload_2         
	//   22   42:iload_3         
	//   23   43:invokeinterface #44  <Method CharSequence CharSequence.subSequence(int, int)>
	//   24   48:invokevirtual   #47  <Method StringBuilder StringBuilder.append(Object)>
	//   25   51:pop             
			stringbuilder.append(((String) (spanned)).substring(l));
	//   26   52:aload           8
	//   27   54:aload           4
	//   28   56:iload           6
	//   29   58:invokevirtual   #50  <Method String String.substring(int)>
	//   30   61:invokevirtual   #38  <Method StringBuilder StringBuilder.append(String)>
	//   31   64:pop             
			charsequence = ((CharSequence) (stringbuilder.toString()));
	//   32   65:aload           8
	//   33   67:invokevirtual   #51  <Method String StringBuilder.toString()>
	//   34   70:astore_1        
			if(!((String) (charsequence)).matches("^\\d{1,3}(\\.(\\d{1,3}(\\.(\\d{1,3}(\\.(\\d{1,3})?)?)?)?)?)?"))
	//*  35   71:aload_1         
	//*  36   72:ldc1            #53  <String "^\\d{1,3}(\\.(\\d{1,3}(\\.(\\d{1,3}(\\.(\\d{1,3})?)?)?)?)?)?">
	//*  37   74:invokevirtual   #57  <Method boolean String.matches(String)>
	//*  38   77:ifne            83
				return "";
	//   39   80:ldc1            #59  <String "">
	//   40   82:areturn         
			charsequence = ((CharSequence) (((String) (charsequence)).split("\\.")));
	//   41   83:aload_1         
	//   42   84:ldc1            #61  <String "\\.">
	//   43   86:invokevirtual   #65  <Method String[] String.split(String)>
	//   44   89:astore_1        
			for(i = ((int) (flag)); i < charsequence.length; i++)
	//*  45   90:iload           7
	//*  46   92:istore_2        
	//*  47   93:iload_2         
	//*  48   94:aload_1         
	//*  49   95:arraylength     
	//*  50   96:icmpge          124
				if(Integer.valueOf(((String) (charsequence[i]))).intValue() > 255)
	//*  51   99:aload_1         
	//*  52  100:iload_2         
	//*  53  101:aaload          
	//*  54  102:invokestatic    #71  <Method Integer Integer.valueOf(String)>
	//*  55  105:invokevirtual   #75  <Method int Integer.intValue()>
	//*  56  108:sipush          255
	//*  57  111:icmple          117
					return "";
	//   58  114:ldc1            #59  <String "">
	//   59  116:areturn         

	//   60  117:iload_2         
	//   61  118:iconst_1        
	//   62  119:iadd            
	//   63  120:istore_2        
		}
	//*  64  121:goto            93
		return null;
	//   65  124:aconst_null     
	//   66  125:areturn         
	}

	final IPAddressText a;

	IPAddressText$1(IPAddressText ipaddresstext)
	{
		a = ipaddresstext;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #16  <Field IPAddressText a>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #18  <Method void Object()>
	//    5    9:return          
	}
}
