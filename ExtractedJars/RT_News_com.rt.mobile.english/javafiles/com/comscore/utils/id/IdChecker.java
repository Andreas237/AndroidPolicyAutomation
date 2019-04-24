// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.comscore.utils.id;

import android.content.Context;
import android.os.Build;
import com.comscore.utils.Storage;
import com.comscore.utils.Utils;

public class IdChecker
{

	public IdChecker(Context context, Storage storage)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #41  <Method void Object()>
		b = context;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #43  <Field Context b>
		e = storage;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #45  <Field Storage e>
		c = false;
	//    8   14:aload_0         
	//    9   15:iconst_0        
	//   10   16:putfield        #47  <Field boolean c>
	//   11   19:return          
	}

	private boolean a(String s, String s1)
	{
		s1 = ((String) (e.get(s1).split(";")));
	//    0    0:aload_0         
	//    1    1:getfield        #45  <Field Storage e>
	//    2    4:aload_2         
	//    3    5:invokevirtual   #54  <Method String Storage.get(String)>
	//    4    8:ldc1            #56  <String ";">
	//    5   10:invokevirtual   #60  <Method String[] String.split(String)>
	//    6   13:astore_2        
		for(int i = 0; i < s1.length; i++)
	//*   7   14:iconst_0        
	//*   8   15:istore_3        
	//*   9   16:iload_3         
	//*  10   17:aload_2         
	//*  11   18:arraylength     
	//*  12   19:icmpge          41
			if(((String) (s1[i])).equals(((Object) (s))))
	//*  13   22:aload_2         
	//*  14   23:iload_3         
	//*  15   24:aaload          
	//*  16   25:aload_1         
	//*  17   26:invokevirtual   #64  <Method boolean String.equals(Object)>
	//*  18   29:ifeq            34
				return true;
	//   19   32:iconst_1        
	//   20   33:ireturn         

	//   21   34:iload_3         
	//   22   35:iconst_1        
	//   23   36:iadd            
	//   24   37:istore_3        
	//*  25   38:goto            16
		return false;
	//   26   41:iconst_0        
	//   27   42:ireturn         
	}

	private String b()
	{
		if(Integer.valueOf(android.os.Build.VERSION.SDK_INT).intValue() >= 9)
	//*   0    0:getstatic       #71  <Field int android.os.Build$VERSION.SDK_INT>
	//*   1    3:invokestatic    #77  <Method Integer Integer.valueOf(int)>
	//*   2    6:invokevirtual   #81  <Method int Integer.intValue()>
	//*   3    9:bipush          9
	//*   4   11:icmplt          18
			return Build.SERIAL;
	//    5   14:getstatic       #86  <Field String Build.SERIAL>
	//    6   17:areturn         
		else
			return null;
	//    7   18:aconst_null     
	//    8   19:areturn         
	}

	private void b(String s, String s1)
	{
		String s2 = e.get(s1);
	//    0    0:aload_0         
	//    1    1:getfield        #45  <Field Storage e>
	//    2    4:aload_2         
	//    3    5:invokevirtual   #54  <Method String Storage.get(String)>
	//    4    8:astore          4
		Object obj = ((Object) (s));
	//    5   10:aload_1         
	//    6   11:astore_3        
		if(s2.length() > 0)
	//*   7   12:aload           4
	//*   8   14:invokevirtual   #90  <Method int String.length()>
	//*   9   17:ifle            53
		{
			obj = ((Object) (new StringBuilder()));
	//   10   20:new             #92  <Class StringBuilder>
	//   11   23:dup             
	//   12   24:invokespecial   #93  <Method void StringBuilder()>
	//   13   27:astore_3        
			((StringBuilder) (obj)).append(s2);
	//   14   28:aload_3         
	//   15   29:aload           4
	//   16   31:invokevirtual   #97  <Method StringBuilder StringBuilder.append(String)>
	//   17   34:pop             
			((StringBuilder) (obj)).append(";");
	//   18   35:aload_3         
	//   19   36:ldc1            #56  <String ";">
	//   20   38:invokevirtual   #97  <Method StringBuilder StringBuilder.append(String)>
	//   21   41:pop             
			((StringBuilder) (obj)).append(s);
	//   22   42:aload_3         
	//   23   43:aload_1         
	//   24   44:invokevirtual   #97  <Method StringBuilder StringBuilder.append(String)>
	//   25   47:pop             
			obj = ((Object) (((StringBuilder) (obj)).toString()));
	//   26   48:aload_3         
	//   27   49:invokevirtual   #100 <Method String StringBuilder.toString()>
	//   28   52:astore_3        
		}
		e.set(s1, ((String) (obj)));
	//   29   53:aload_0         
	//   30   54:getfield        #45  <Field Storage e>
	//   31   57:aload_2         
	//   32   58:aload_3         
	//   33   59:invokevirtual   #103 <Method void Storage.set(String, String)>
	//   34   62:return          
	}

	private String c()
	{
		if(Integer.valueOf(android.os.Build.VERSION.SDK_INT).intValue() >= 3)
	//*   0    0:getstatic       #71  <Field int android.os.Build$VERSION.SDK_INT>
	//*   1    3:invokestatic    #77  <Method Integer Integer.valueOf(int)>
	//*   2    6:invokevirtual   #81  <Method int Integer.intValue()>
	//*   3    9:iconst_3        
	//*   4   10:icmplt          39
		{
			String s = android.provider.Settings.Secure.getString(b.getContentResolver(), "android_id");
	//    5   13:aload_0         
	//    6   14:getfield        #43  <Field Context b>
	//    7   17:invokevirtual   #109 <Method android.content.ContentResolver Context.getContentResolver()>
	//    8   20:ldc1            #32  <String "android_id">
	//    9   22:invokestatic    #115 <Method String android.provider.Settings$Secure.getString(android.content.ContentResolver, String)>
	//   10   25:astore_1        
			if(s != null && s.length() > 0)
	//*  11   26:aload_1         
	//*  12   27:ifnull          39
	//*  13   30:aload_1         
	//*  14   31:invokevirtual   #90  <Method int String.length()>
	//*  15   34:ifle            39
				return s;
	//   16   37:aload_1         
	//   17   38:areturn         
		}
		return null;
	//   18   39:aconst_null     
	//   19   40:areturn         
	}

	protected String a()
	{
label0:
		{
			boolean flag;
			String s;
label1:
			{
				if(c)
	//*   0    0:aload_0         
	//*   1    1:getfield        #47  <Field boolean c>
	//*   2    4:ifeq            12
					return d;
	//    3    7:aload_0         
	//    4    8:getfield        #117 <Field String d>
	//    5   11:areturn         
				flag = true;
	//    6   12:iconst_1        
	//    7   13:istore_2        
				c = true;
	//    8   14:aload_0         
	//    9   15:iconst_1        
	//   10   16:putfield        #47  <Field boolean c>
				String s1 = b();
	//   11   19:aload_0         
	//   12   20:invokespecial   #119 <Method String b()>
	//   13   23:astore          4
				if(s1 != null)
	//*  14   25:aload           4
	//*  15   27:ifnull          41
				{
					s = s1;
	//   16   30:aload           4
	//   17   32:astore_3        
					if(s1.length() != 0)
						break label1;
	//   18   33:aload           4
	//   19   35:invokevirtual   #90  <Method int String.length()>
	//   20   38:ifne            65
				}
				s1 = c();
	//   21   41:aload_0         
	//   22   42:invokespecial   #121 <Method String c()>
	//   23   45:astore          4
				if(s1 == null)
					break label0;
	//   24   47:aload           4
	//   25   49:ifnull          112
				s = s1;
	//   26   52:aload           4
	//   27   54:astore_3        
				if(s1.length() == 0)
	//*  28   55:aload           4
	//*  29   57:invokevirtual   #90  <Method int String.length()>
	//*  30   60:ifne            65
					return null;
	//   31   63:aconst_null     
	//   32   64:areturn         
			}
			int i;
label2:
			{
				i = 0;
	//   33   65:iconst_0        
	//   34   66:istore_1        
				do
				{
					if(i >= a.length)
						break;
	//   35   67:iload_1         
	//   36   68:getstatic       #36  <Field String[] a>
	//   37   71:arraylength     
	//   38   72:icmpge          99
					if(a[i].equals(((Object) (s))))
	//*  39   75:getstatic       #36  <Field String[] a>
	//*  40   78:iload_1         
	//*  41   79:aaload          
	//*  42   80:aload_3         
	//*  43   81:invokevirtual   #64  <Method boolean String.equals(Object)>
	//*  44   84:ifeq            92
					{
						i = ((int) (flag));
	//   45   87:iload_2         
	//   46   88:istore_1        
						break label2;
	//   47   89:goto            101
					}
					i++;
	//   48   92:iload_1         
	//   49   93:iconst_1        
	//   50   94:iadd            
	//   51   95:istore_1        
				} while(true);
	//   52   96:goto            67
				i = 0;
	//   53   99:iconst_0        
	//   54  100:istore_1        
			}
			if(i != 0)
	//*  55  101:iload_1         
	//*  56  102:ifeq            112
			{
				d = s;
	//   57  105:aload_0         
	//   58  106:aload_3         
	//   59  107:putfield        #117 <Field String d>
				return s;
	//   60  110:aload_3         
	//   61  111:areturn         
			}
		}
		return null;
	//   62  112:aconst_null     
	//   63  113:areturn         
	}

	public boolean checkCrossPublisherId(String s)
	{
		if(s != null)
	//*   0    0:aload_1         
	//*   1    1:ifnull          56
		{
			if(s.length() == 0)
	//*   2    4:aload_1         
	//*   3    5:invokevirtual   #90  <Method int String.length()>
	//*   4    8:ifne            13
				return true;
	//    5   11:iconst_1        
	//    6   12:ireturn         
			String s1 = a();
	//    7   13:aload_0         
	//    8   14:invokevirtual   #125 <Method String a()>
	//    9   17:astore_2        
			if(s1 == null)
	//*  10   18:aload_2         
	//*  11   19:ifnonnull       24
				return true;
	//   12   22:iconst_1        
	//   13   23:ireturn         
			if(a(s1, "adIdCheckData"))
	//*  14   24:aload_0         
	//*  15   25:aload_2         
	//*  16   26:ldc1            #127 <String "adIdCheckData">
	//*  17   28:invokespecial   #129 <Method boolean a(String, String)>
	//*  18   31:ifeq            36
				return true;
	//   19   34:iconst_1        
	//   20   35:ireturn         
			b(s1, "adIdCheckData");
	//   21   36:aload_0         
	//   22   37:aload_2         
	//   23   38:ldc1            #127 <String "adIdCheckData">
	//   24   40:invokespecial   #131 <Method void b(String, String)>
			if(Utils.md5(s1).equals(((Object) (s))))
	//*  25   43:aload_2         
	//*  26   44:invokestatic    #136 <Method String Utils.md5(String)>
	//*  27   47:aload_1         
	//*  28   48:invokevirtual   #64  <Method boolean String.equals(Object)>
	//*  29   51:ifeq            56
				return false;
	//   30   54:iconst_0        
	//   31   55:ireturn         
		}
		return true;
	//   32   56:iconst_1        
	//   33   57:ireturn         
	}

	public boolean checkVisitorId()
	{
		String s = a();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #125 <Method String a()>
	//    2    4:astore_1        
		if(s == null)
	//*   3    5:aload_1         
	//*   4    6:ifnonnull       11
			return true;
	//    5    9:iconst_1        
	//    6   10:ireturn         
		if(a(s, "idCheckData"))
	//*   7   11:aload_0         
	//*   8   12:aload_1         
	//*   9   13:ldc1            #140 <String "idCheckData">
	//*  10   15:invokespecial   #129 <Method boolean a(String, String)>
	//*  11   18:ifeq            23
		{
			return true;
	//   12   21:iconst_1        
	//   13   22:ireturn         
		} else
		{
			b(s, "idCheckData");
	//   14   23:aload_0         
	//   15   24:aload_1         
	//   16   25:ldc1            #140 <String "idCheckData">
	//   17   27:invokespecial   #131 <Method void b(String, String)>
			return false;
	//   18   30:iconst_0        
	//   19   31:ireturn         
		}
	}

	private static final String a[] = {
		"0123456789ABCDEF", "0123456789abcdef", "9774d56d682e549c", "9774D56D682E549C", "unknown", "UNKNOWN", "android_id", "ANDROID_ID"
	};
	private Context b;
	private boolean c;
	private String d;
	private Storage e;

	static 
	{
	//    0    0:bipush          8
	//    1    2:anewarray       String[]
	//    2    5:dup             
	//    3    6:iconst_0        
	//    4    7:ldc1            #20  <String "0123456789ABCDEF">
	//    5    9:aastore         
	//    6   10:dup             
	//    7   11:iconst_1        
	//    8   12:ldc1            #22  <String "0123456789abcdef">
	//    9   14:aastore         
	//   10   15:dup             
	//   11   16:iconst_2        
	//   12   17:ldc1            #24  <String "9774d56d682e549c">
	//   13   19:aastore         
	//   14   20:dup             
	//   15   21:iconst_3        
	//   16   22:ldc1            #26  <String "9774D56D682E549C">
	//   17   24:aastore         
	//   18   25:dup             
	//   19   26:iconst_4        
	//   20   27:ldc1            #28  <String "unknown">
	//   21   29:aastore         
	//   22   30:dup             
	//   23   31:iconst_5        
	//   24   32:ldc1            #30  <String "UNKNOWN">
	//   25   34:aastore         
	//   26   35:dup             
	//   27   36:bipush          6
	//   28   38:ldc1            #32  <String "android_id">
	//   29   40:aastore         
	//   30   41:dup             
	//   31   42:bipush          7
	//   32   44:ldc1            #34  <String "ANDROID_ID">
	//   33   46:aastore         
	//   34   47:putstatic       #36  <Field String[] a>
	//*  35   50:return          
	}
}
