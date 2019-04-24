// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package o;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONObject;

// Referenced classes of package o:
//			he

public final class hd
{

	private hd(String s, he he1)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #15  <Method void Object()>
		c = s;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #17  <Field String c>
		b = he1;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #19  <Field he b>
	//    8   14:return          
	}

	private static String[] a(String s)
	{
		ArrayList arraylist = new ArrayList();
	//    0    0:new             #23  <Class ArrayList>
	//    1    3:dup             
	//    2    4:invokespecial   #24  <Method void ArrayList()>
	//    3    7:astore_3        
		int i = s.indexOf('(');
	//    4    8:aload_0         
	//    5    9:bipush          40
	//    6   11:invokevirtual   #30  <Method int String.indexOf(int)>
	//    7   14:istore_1        
		int k = s.lastIndexOf(')');
	//    8   15:aload_0         
	//    9   16:bipush          41
	//   10   18:invokevirtual   #33  <Method int String.lastIndexOf(int)>
	//   11   21:istore_2        
		if(i == -1 || k == -1 || k <= i)
	//*  12   22:iload_1         
	//*  13   23:iconst_m1       
	//*  14   24:icmpeq          37
	//*  15   27:iload_2         
	//*  16   28:iconst_m1       
	//*  17   29:icmpeq          37
	//*  18   32:iload_2         
	//*  19   33:iload_1         
	//*  20   34:icmpgt          39
			return null;
	//   21   37:aconst_null     
	//   22   38:areturn         
		s = ((String) (s.substring(i + 1, k).split(",")));
	//   23   39:aload_0         
	//   24   40:iload_1         
	//   25   41:iconst_1        
	//   26   42:iadd            
	//   27   43:iload_2         
	//   28   44:invokevirtual   #37  <Method String String.substring(int, int)>
	//   29   47:ldc1            #39  <String ",">
	//   30   49:invokevirtual   #42  <Method String[] String.split(String)>
	//   31   52:astore_0        
		if(s != null)
	//*  32   53:aload_0         
	//*  33   54:ifnull          108
		{
			for(int j = 0; j < s.length; j++)
	//*  34   57:iconst_0        
	//*  35   58:istore_1        
	//*  36   59:iload_1         
	//*  37   60:aload_0         
	//*  38   61:arraylength     
	//*  39   62:icmpge          108
				if(!TextUtils.isEmpty(((CharSequence) (s[j]))))
	//*  40   65:aload_0         
	//*  41   66:iload_1         
	//*  42   67:aaload          
	//*  43   68:invokestatic    #48  <Method boolean TextUtils.isEmpty(CharSequence)>
	//*  44   71:ifne            101
					((List) (arraylist)).add(((Object) (((String) (s[j])).trim().replaceAll("'", "").replaceAll("\"", ""))));
	//   45   74:aload_3         
	//   46   75:aload_0         
	//   47   76:iload_1         
	//   48   77:aaload          
	//   49   78:invokevirtual   #52  <Method String String.trim()>
	//   50   81:ldc1            #54  <String "'">
	//   51   83:ldc1            #56  <String "">
	//   52   85:invokevirtual   #60  <Method String String.replaceAll(String, String)>
	//   53   88:ldc1            #62  <String "\"">
	//   54   90:ldc1            #56  <String "">
	//   55   92:invokevirtual   #60  <Method String String.replaceAll(String, String)>
	//   56   95:invokeinterface #68  <Method boolean List.add(Object)>
	//   57  100:pop             

	//   58  101:iload_1         
	//   59  102:iconst_1        
	//   60  103:iadd            
	//   61  104:istore_1        
		}
	//*  62  105:goto            59
		return (String[])((List) (arraylist)).toArray(((Object []) (new String[0])));
	//   63  108:aload_3         
	//   64  109:iconst_0        
	//   65  110:anewarray       String[]
	//   66  113:invokeinterface #72  <Method Object[] List.toArray(Object[])>
	//   67  118:checkcast       #73  <Class String[]>
	//   68  121:areturn         
	}

	public static List e(JSONObject jsonobject)
	{
		ArrayList arraylist = new ArrayList();
	//    0    0:new             #23  <Class ArrayList>
	//    1    3:dup             
	//    2    4:invokespecial   #24  <Method void ArrayList()>
	//    3    7:astore_2        
		if(jsonobject == null)
	//*   4    8:aload_0         
	//*   5    9:ifnonnull       14
			return ((List) (arraylist));
	//    6   12:aload_2         
	//    7   13:areturn         
		String s = jsonobject.optString("name", "");
	//    8   14:aload_0         
	//    9   15:ldc1            #77  <String "name">
	//   10   17:ldc1            #56  <String "">
	//   11   19:invokevirtual   #82  <Method String JSONObject.optString(String, String)>
	//   12   22:astore_3        
		jsonobject = null;
	//   13   23:aconst_null     
	//   14   24:astore_0        
		if(!TextUtils.isEmpty(((CharSequence) (s))))
	//*  15   25:aload_3         
	//*  16   26:invokestatic    #48  <Method boolean TextUtils.isEmpty(CharSequence)>
	//*  17   29:ifne            39
			jsonobject = ((JSONObject) (s.split(";")));
	//   18   32:aload_3         
	//   19   33:ldc1            #84  <String ";">
	//   20   35:invokevirtual   #42  <Method String[] String.split(String)>
	//   21   38:astore_0        
		for(int i = 0; i < jsonobject.length; i++)
	//*  22   39:iconst_0        
	//*  23   40:istore_1        
	//*  24   41:iload_1         
	//*  25   42:aload_0         
	//*  26   43:arraylength     
	//*  27   44:icmpge          98
		{
			Object obj = ((Object) (he.a(((String) (jsonobject[i])))));
	//   28   47:aload_0         
	//   29   48:iload_1         
	//   30   49:aaload          
	//   31   50:invokestatic    #89  <Method he he.a(String)>
	//   32   53:astore_3        
			if(obj != he.a)
	//*  33   54:aload_3         
	//*  34   55:getstatic       #91  <Field he he.a>
	//*  35   58:if_acmpeq       91
			{
				obj = ((Object) (new hd(((String) (jsonobject[i])), ((he) (obj)))));
	//   36   61:new             #2   <Class hd>
	//   37   64:dup             
	//   38   65:aload_0         
	//   39   66:iload_1         
	//   40   67:aaload          
	//   41   68:aload_3         
	//   42   69:invokespecial   #93  <Method void hd(String, he)>
	//   43   72:astore_3        
				obj.a = a(((String) (jsonobject[i])));
	//   44   73:aload_3         
	//   45   74:aload_0         
	//   46   75:iload_1         
	//   47   76:aaload          
	//   48   77:invokestatic    #95  <Method String[] a(String)>
	//   49   80:putfield        #97  <Field String[] a>
				((List) (arraylist)).add(obj);
	//   50   83:aload_2         
	//   51   84:aload_3         
	//   52   85:invokeinterface #68  <Method boolean List.add(Object)>
	//   53   90:pop             
			}
		}

	//   54   91:iload_1         
	//   55   92:iconst_1        
	//   56   93:iadd            
	//   57   94:istore_1        
	//*  58   95:goto            41
		return ((List) (arraylist));
	//   59   98:aload_2         
	//   60   99:areturn         
	}

	public String a[];
	public he b;
	private String c;
}
