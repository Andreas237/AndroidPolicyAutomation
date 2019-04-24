// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.truenet.android;

import android.support.v7.ae;
import java.util.List;

public final class RedirectsResult
{

	public RedirectsResult(String s, long l, int i, List list)
	{
		ae.b(((Object) (s)), "url");
	//    0    0:aload_1         
	//    1    1:ldc1            #17  <String "url">
	//    2    3:invokestatic    #23  <Method void ae.b(Object, String)>
		ae.b(((Object) (list)), "cookies");
	//    3    6:aload           5
	//    4    8:ldc1            #24  <String "cookies">
	//    5   10:invokestatic    #23  <Method void ae.b(Object, String)>
		super();
	//    6   13:aload_0         
	//    7   14:invokespecial   #27  <Method void Object()>
		url = s;
	//    8   17:aload_0         
	//    9   18:aload_1         
	//   10   19:putfield        #29  <Field String url>
		loadTime = l;
	//   11   22:aload_0         
	//   12   23:lload_2         
	//   13   24:putfield        #31  <Field long loadTime>
		response = i;
	//   14   27:aload_0         
	//   15   28:iload           4
	//   16   30:putfield        #33  <Field int response>
		cookies = list;
	//   17   33:aload_0         
	//   18   34:aload           5
	//   19   36:putfield        #35  <Field List cookies>
	//   20   39:return          
	}

	public static RedirectsResult copy$default(RedirectsResult redirectsresult, String s, long l, int i, List list, int j, Object obj)
	{
		if((j & 1) != 0)
	//*   0    0:iload           6
	//*   1    2:iconst_1        
	//*   2    3:iand            
	//*   3    4:ifeq            71
			s = redirectsresult.url;
	//    4    7:aload_0         
	//    5    8:getfield        #29  <Field String url>
	//    6   11:astore_1        
		if((j & 2) != 0)
	//*   7   12:iload           6
	//*   8   14:iconst_2        
	//*   9   15:iand            
	//*  10   16:ifeq            68
			l = redirectsresult.loadTime;
	//   11   19:aload_0         
	//   12   20:getfield        #31  <Field long loadTime>
	//   13   23:lstore_2        
		if((j & 4) != 0)
	//*  14   24:iload           6
	//*  15   26:iconst_4        
	//*  16   27:iand            
	//*  17   28:ifeq            65
			i = redirectsresult.response;
	//   18   31:aload_0         
	//   19   32:getfield        #33  <Field int response>
	//   20   35:istore          4
		if((j & 8) != 0)
	//*  21   37:iload           6
	//*  22   39:bipush          8
	//*  23   41:iand            
	//*  24   42:ifeq            62
			list = redirectsresult.cookies;
	//   25   45:aload_0         
	//   26   46:getfield        #35  <Field List cookies>
	//   27   49:astore          5
		return redirectsresult.copy(s, l, i, list);
	//   28   51:aload_0         
	//   29   52:aload_1         
	//   30   53:lload_2         
	//   31   54:iload           4
	//   32   56:aload           5
	//   33   58:invokevirtual   #45  <Method RedirectsResult copy(String, long, int, List)>
	//   34   61:areturn         
	//*  35   62:goto            51
	//*  36   65:goto            37
	//*  37   68:goto            24
	//*  38   71:goto            12
	}

	public final String component1()
	{
		return url;
	//    0    0:aload_0         
	//    1    1:getfield        #29  <Field String url>
	//    2    4:areturn         
	}

	public final long component2()
	{
		return loadTime;
	//    0    0:aload_0         
	//    1    1:getfield        #31  <Field long loadTime>
	//    2    4:lreturn         
	}

	public final int component3()
	{
		return response;
	//    0    0:aload_0         
	//    1    1:getfield        #33  <Field int response>
	//    2    4:ireturn         
	}

	public final List component4()
	{
		return cookies;
	//    0    0:aload_0         
	//    1    1:getfield        #35  <Field List cookies>
	//    2    4:areturn         
	}

	public final RedirectsResult copy(String s, long l, int i, List list)
	{
		ae.b(((Object) (s)), "url");
	//    0    0:aload_1         
	//    1    1:ldc1            #17  <String "url">
	//    2    3:invokestatic    #23  <Method void ae.b(Object, String)>
		ae.b(((Object) (list)), "cookies");
	//    3    6:aload           5
	//    4    8:ldc1            #24  <String "cookies">
	//    5   10:invokestatic    #23  <Method void ae.b(Object, String)>
		return new RedirectsResult(s, l, i, list);
	//    6   13:new             #2   <Class RedirectsResult>
	//    7   16:dup             
	//    8   17:aload_1         
	//    9   18:lload_2         
	//   10   19:iload           4
	//   11   21:aload           5
	//   12   23:invokespecial   #57  <Method void RedirectsResult(String, long, int, List)>
	//   13   26:areturn         
	}

	public boolean equals(Object obj)
	{
label0:
		{
			boolean flag2 = false;
	//    0    0:iconst_0        
	//    1    1:istore          4
			if(this != obj)
	//*   2    3:aload_0         
	//*   3    4:aload_1         
	//*   4    5:if_acmpeq       98
			{
				boolean flag1 = flag2;
	//    5    8:iload           4
	//    6   10:istore_3        
				if(!(obj instanceof RedirectsResult))
					break label0;
	//    7   11:aload_1         
	//    8   12:instanceof      #2   <Class RedirectsResult>
	//    9   15:ifeq            100
				obj = ((Object) ((RedirectsResult)obj));
	//   10   18:aload_1         
	//   11   19:checkcast       #2   <Class RedirectsResult>
	//   12   22:astore_1        
				flag1 = flag2;
	//   13   23:iload           4
	//   14   25:istore_3        
				if(!ae.a(((Object) (url)), ((Object) (((RedirectsResult) (obj)).url))))
					break label0;
	//   15   26:aload_0         
	//   16   27:getfield        #29  <Field String url>
	//   17   30:aload_1         
	//   18   31:getfield        #29  <Field String url>
	//   19   34:invokestatic    #64  <Method boolean ae.a(Object, Object)>
	//   20   37:ifeq            100
				boolean flag;
				if(loadTime == ((RedirectsResult) (obj)).loadTime)
	//*  21   40:aload_0         
	//*  22   41:getfield        #31  <Field long loadTime>
	//*  23   44:aload_1         
	//*  24   45:getfield        #31  <Field long loadTime>
	//*  25   48:lcmp            
	//*  26   49:ifne            102
					flag = true;
	//   27   52:iconst_1        
	//   28   53:istore_2        
				else
	//*  29   54:iload           4
	//*  30   56:istore_3        
	//*  31   57:iload_2         
	//*  32   58:ifeq            100
	//*  33   61:aload_0         
	//*  34   62:getfield        #33  <Field int response>
	//*  35   65:aload_1         
	//*  36   66:getfield        #33  <Field int response>
	//*  37   69:icmpne          107
	//*  38   72:iconst_1        
	//*  39   73:istore_2        
	//*  40   74:iload           4
	//*  41   76:istore_3        
	//*  42   77:iload_2         
	//*  43   78:ifeq            100
	//*  44   81:iload           4
	//*  45   83:istore_3        
	//*  46   84:aload_0         
	//*  47   85:getfield        #35  <Field List cookies>
	//*  48   88:aload_1         
	//*  49   89:getfield        #35  <Field List cookies>
	//*  50   92:invokestatic    #64  <Method boolean ae.a(Object, Object)>
	//*  51   95:ifeq            100
	//*  52   98:iconst_1        
	//*  53   99:istore_3        
	//*  54  100:iload_3         
	//*  55  101:ireturn         
					flag = false;
	//   56  102:iconst_0        
	//   57  103:istore_2        
				flag1 = flag2;
				if(!flag)
					break label0;
				if(response == ((RedirectsResult) (obj)).response)
					flag = true;
				else
	//*  58  104:goto            54
					flag = false;
	//   59  107:iconst_0        
	//   60  108:istore_2        
				flag1 = flag2;
				if(!flag)
					break label0;
				flag1 = flag2;
				if(!ae.a(((Object) (cookies)), ((Object) (((RedirectsResult) (obj)).cookies))))
					break label0;
			}
			flag1 = true;
		}
		return flag1;
	//*  61  109:goto            74
	}

	public final List getCookies()
	{
		return cookies;
	//    0    0:aload_0         
	//    1    1:getfield        #35  <Field List cookies>
	//    2    4:areturn         
	}

	public final long getLoadTime()
	{
		return loadTime;
	//    0    0:aload_0         
	//    1    1:getfield        #31  <Field long loadTime>
	//    2    4:lreturn         
	}

	public final int getResponse()
	{
		return response;
	//    0    0:aload_0         
	//    1    1:getfield        #33  <Field int response>
	//    2    4:ireturn         
	}

	public final String getUrl()
	{
		return url;
	//    0    0:aload_0         
	//    1    1:getfield        #29  <Field String url>
	//    2    4:areturn         
	}

	public int hashCode()
	{
		int j = 0;
	//    0    0:iconst_0        
	//    1    1:istore_2        
		Object obj = ((Object) (url));
	//    2    2:aload_0         
	//    3    3:getfield        #29  <Field String url>
	//    4    6:astore          7
		int i;
		int k;
		int l;
		long l1;
		if(obj != null)
	//*   5    8:aload           7
	//*   6   10:ifnull          76
			i = obj.hashCode();
	//    7   13:aload           7
	//    8   15:invokevirtual   #71  <Method int Object.hashCode()>
	//    9   18:istore_1        
		else
	//*  10   19:aload_0         
	//*  11   20:getfield        #31  <Field long loadTime>
	//*  12   23:lstore          5
	//*  13   25:lload           5
	//*  14   27:lload           5
	//*  15   29:bipush          32
	//*  16   31:lushr           
	//*  17   32:lxor            
	//*  18   33:l2i             
	//*  19   34:istore_3        
	//*  20   35:aload_0         
	//*  21   36:getfield        #33  <Field int response>
	//*  22   39:istore          4
	//*  23   41:aload_0         
	//*  24   42:getfield        #35  <Field List cookies>
	//*  25   45:astore          7
	//*  26   47:aload           7
	//*  27   49:ifnull          58
	//*  28   52:aload           7
	//*  29   54:invokevirtual   #71  <Method int Object.hashCode()>
	//*  30   57:istore_2        
	//*  31   58:iload_1         
	//*  32   59:bipush          31
	//*  33   61:imul            
	//*  34   62:iload_3         
	//*  35   63:iadd            
	//*  36   64:bipush          31
	//*  37   66:imul            
	//*  38   67:iload           4
	//*  39   69:iadd            
	//*  40   70:bipush          31
	//*  41   72:imul            
	//*  42   73:iload_2         
	//*  43   74:iadd            
	//*  44   75:ireturn         
			i = 0;
	//   45   76:iconst_0        
	//   46   77:istore_1        
		l1 = loadTime;
		k = (int)(l1 ^ l1 >>> 32);
		l = response;
		obj = ((Object) (cookies));
		if(obj != null)
			j = obj.hashCode();
		return ((i * 31 + k) * 31 + l) * 31 + j;
	//*  47   78:goto            19
	}

	public String toString()
	{
		return (new StringBuilder()).append("RedirectsResult(url=").append(url).append(", loadTime=").append(loadTime).append(", response=").append(response).append(", cookies=").append(((Object) (cookies))).append(")").toString();
	//    0    0:new             #74  <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #75  <Method void StringBuilder()>
	//    3    7:ldc1            #77  <String "RedirectsResult(url=">
	//    4    9:invokevirtual   #81  <Method StringBuilder StringBuilder.append(String)>
	//    5   12:aload_0         
	//    6   13:getfield        #29  <Field String url>
	//    7   16:invokevirtual   #81  <Method StringBuilder StringBuilder.append(String)>
	//    8   19:ldc1            #83  <String ", loadTime=">
	//    9   21:invokevirtual   #81  <Method StringBuilder StringBuilder.append(String)>
	//   10   24:aload_0         
	//   11   25:getfield        #31  <Field long loadTime>
	//   12   28:invokevirtual   #86  <Method StringBuilder StringBuilder.append(long)>
	//   13   31:ldc1            #88  <String ", response=">
	//   14   33:invokevirtual   #81  <Method StringBuilder StringBuilder.append(String)>
	//   15   36:aload_0         
	//   16   37:getfield        #33  <Field int response>
	//   17   40:invokevirtual   #91  <Method StringBuilder StringBuilder.append(int)>
	//   18   43:ldc1            #93  <String ", cookies=">
	//   19   45:invokevirtual   #81  <Method StringBuilder StringBuilder.append(String)>
	//   20   48:aload_0         
	//   21   49:getfield        #35  <Field List cookies>
	//   22   52:invokevirtual   #96  <Method StringBuilder StringBuilder.append(Object)>
	//   23   55:ldc1            #98  <String ")">
	//   24   57:invokevirtual   #81  <Method StringBuilder StringBuilder.append(String)>
	//   25   60:invokevirtual   #100 <Method String StringBuilder.toString()>
	//   26   63:areturn         
	}

	private final List cookies;
	private final long loadTime;
	private final int response;
	private final String url;
}
