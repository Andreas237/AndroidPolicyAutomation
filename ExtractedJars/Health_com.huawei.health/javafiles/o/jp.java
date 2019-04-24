// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package o;

import android.content.*;
import android.os.*;
import com.amap.api.location.core.*;
import org.json.JSONObject;

// Referenced classes of package o:
//			jt, kh, ii

public class jp
{
	public static interface b
	{

		public abstract void c(int j);
	}


	jp(Context context)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #35  <Method void Object()>
		e = null;
	//    2    4:aload_0         
	//    3    5:aconst_null     
	//    4    6:putfield        #37  <Field String e>
		d = null;
	//    5    9:aload_0         
	//    6   10:aconst_null     
	//    7   11:putfield        #39  <Field Context d>
		c = true;
	//    8   14:aload_0         
	//    9   15:iconst_1        
	//   10   16:putfield        #41  <Field boolean c>
		b = null;
	//   11   19:aload_0         
	//   12   20:aconst_null     
	//   13   21:putfield        #43  <Field ii b>
		f = null;
	//   14   24:aload_0         
	//   15   25:aconst_null     
	//   16   26:putfield        #45  <Field ServiceConnection f>
		h = new Intent();
	//   17   29:aload_0         
	//   18   30:new             #47  <Class Intent>
	//   19   33:dup             
	//   20   34:invokespecial   #48  <Method void Intent()>
	//   21   37:putfield        #50  <Field Intent h>
		k = "com.autonavi.minimap";
	//   22   40:aload_0         
	//   23   41:ldc1            #52  <String "com.autonavi.minimap">
	//   24   43:putfield        #54  <Field String k>
		i = "com.amap.api.service.AMapService";
	//   25   46:aload_0         
	//   26   47:ldc1            #56  <String "com.amap.api.service.AMapService">
	//   27   49:putfield        #58  <Field String i>
		a = null;
	//   28   52:aload_0         
	//   29   53:aconst_null     
	//   30   54:putfield        #60  <Field jp$b a>
		g = "invaid type";
	//   31   57:aload_0         
	//   32   58:ldc1            #62  <String "invaid type">
	//   33   60:putfield        #64  <Field String g>
		l = "empty appkey";
	//   34   63:aload_0         
	//   35   64:ldc1            #66  <String "empty appkey">
	//   36   66:putfield        #68  <Field String l>
		p = "refused";
	//   37   69:aload_0         
	//   38   70:ldc1            #70  <String "refused">
	//   39   72:putfield        #72  <Field String p>
		n = "failed";
	//   40   75:aload_0         
	//   41   76:ldc1            #74  <String "failed">
	//   42   78:putfield        #76  <Field String n>
		d = context;
	//   43   81:aload_0         
	//   44   82:aload_1         
	//   45   83:putfield        #39  <Field Context d>
		try
		{
			e = com.amap.api.location.core.b.a(com.amap.api.location.core.e.b(c.a.getBytes("UTF-8"), "MIIEvgIBADANBgkqhkiG9w0BAQEFAASCBKgwggSkAgEAAoIBAQDCEYwdO3V2ANrhApjqyk7X8FH5AEaWly58kP9IDAhMqwtIbmcJrUK9oO9Afh3KZnOlDtjiowy733YqpLRO7WBvdbW/c4Dz/d3dy/m+6HMqxaak+GQQRHw/VPdKciaZ3eIZp4MWOyIQwiFSQvPTAo/Na8hV4SgBZHB3lGFw0yu+BmG+h32eIE6p4Y8EDCn+G+yzekX+taMrWTQIysledrygZSGPv1ukbdFDnH/xZEI0dCr9pZT+AZQl3o9a2aMyuRrHM0oupXKKiYl69Y8fKh1Tyd752rF6LrR5uOb9aOfXt18hb+3YL5P9rQ+ZRYbyHYFaxzBPA2jLq0KUQ+Dmg7YhAgMBAAECggEAL9pj0lF3BUHwtssNKdf42QZJMD0BKuDcdZrLV9ifs0f54EJY5enzKw8j76MpdV8N5QVkNX4/BZR0bs9uJogh31oHFs5EXeWbb7V8P7bRrxpNnSAijGBWwscQsyqymf48YlcL28949ujnjoEz3jQjgWOyYnrCgpVhphrQbCGmB5TcZnTFvHfozt/0tzuMj5na5lRnkD0kYXgr0x/SRZcPoCybSpc3t/B/9MAAboGaV/QQkTotr7VOuJfaPRjvg8rzyPzavo3evxsjXj7vDXbN4w0cbk/Uqn2JtvPQ8HoysmF2HdYvILZibvJmWH1hA58b4sn5s6AqFRjMOL7rHdD+gQKBgQD+IzoofmZK5tTxgO9sWsG71IUeshQP9fe159jKCehk1RfuIqqbRP0UcxJiw4eNjHs4zU0HeRL3iF5XfUs0FQanO/pp6YL1xgVdfQlDdTdk6KFHJ0sUJapnJn1S2k7IKfRKE1+rkofSXMYUTsgHF1fDp+gxy4yUMY+h9O+JlKVKOwKBgQDDfaDIblaSm+B0lyG//wFPynAeGd0Q8wcMZbQQ/LWMJZhMZ7fyUZ+A6eL/jB53a2tgnaw2rXBpMe1qu8uSpym2plU0fkgLAnVugS5+KRhOkUHyorcbpVZbs5azf7GlTydR5dI1PHF3Bncemoa6IsEvumHWgQbVyTTz/O9mlFafUwKBgQCvDebms8KUf5JY1F6XfaCLWGVl8nZdVCmQFKbA7Lg2lI5KS3jHQWsupeEZRORffU/3nXsc1apZ9YY+r6CYvI77rRXd1KqPzxos/o7d96TzjkZhc9CEjTlmmh2jb5rqx/Ns/xFcZq/GGH+cx3ODZvHeZQ9NFY+9GLJ+dfB2DX0ZtwKBgQC+9/lZ8telbpqMqpqwqRaJ8LMn5JIdHZu0E6IcuhFLr+ogMW3zTKMpVtGGXEXi2M/TWRPDchiO2tQX4Q5T2/KW19QCbJ5KCwPWiGF3owN4tNOciDGh0xkSidRc0xAh8bnyejSoBry8zlcNUVztdkgMLOGonvCjZWPSOTNQnPYluwKBgCV+WVftpTk3l+OfAJTaXEPNYdh7+WQjzxZKjUaDzx80Ts7hRo2U+EQT7FBjQQNqmmDnWtujo5p1YmJC0FT3n1CVa7g901pb3b0RcOziYWAoJi0/+kLyeo6XBhuLeZ7h90S70GGh1o0V/j/9N1jb5DCL4xKkvdYePPTSTku0BM+n"));
	//   46   86:aload_0         
	//   47   87:getstatic       #80  <Field String c.a>
	//   48   90:ldc1            #82  <String "UTF-8">
	//   49   92:invokevirtual   #88  <Method byte[] String.getBytes(String)>
	//   50   95:ldc1            #90  <String "MIIEvgIBADANBgkqhkiG9w0BAQEFAASCBKgwggSkAgEAAoIBAQDCEYwdO3V2ANrhApjqyk7X8FH5AEaWly58kP9IDAhMqwtIbmcJrUK9oO9Afh3KZnOlDtjiowy733YqpLRO7WBvdbW/c4Dz/d3dy/m+6HMqxaak+GQQRHw/VPdKciaZ3eIZp4MWOyIQwiFSQvPTAo/Na8hV4SgBZHB3lGFw0yu+BmG+h32eIE6p4Y8EDCn+G+yzekX+taMrWTQIysledrygZSGPv1ukbdFDnH/xZEI0dCr9pZT+AZQl3o9a2aMyuRrHM0oupXKKiYl69Y8fKh1Tyd752rF6LrR5uOb9aOfXt18hb+3YL5P9rQ+ZRYbyHYFaxzBPA2jLq0KUQ+Dmg7YhAgMBAAECggEAL9pj0lF3BUHwtssNKdf42QZJMD0BKuDcdZrLV9ifs0f54EJY5enzKw8j76MpdV8N5QVkNX4/BZR0bs9uJogh31oHFs5EXeWbb7V8P7bRrxpNnSAijGBWwscQsyqymf48YlcL28949ujnjoEz3jQjgWOyYnrCgpVhphrQbCGmB5TcZnTFvHfozt/0tzuMj5na5lRnkD0kYXgr0x/SRZcPoCybSpc3t/B/9MAAboGaV/QQkTotr7VOuJfaPRjvg8rzyPzavo3evxsjXj7vDXbN4w0cbk/Uqn2JtvPQ8HoysmF2HdYvILZibvJmWH1hA58b4sn5s6AqFRjMOL7rHdD+gQKBgQD+IzoofmZK5tTxgO9sWsG71IUeshQP9fe159jKCehk1RfuIqqbRP0UcxJiw4eNjHs4zU0HeRL3iF5XfUs0FQanO/pp6YL1xgVdfQlDdTdk6KFHJ0sUJapnJn1S2k7IKfRKE1+rkofSXMYUTsgHF1fDp+gxy4yUMY+h9O+JlKVKOwKBgQDDfaDIblaSm+B0lyG//wFPynAeGd0Q8wcMZbQQ/LWMJZhMZ7fyUZ+A6eL/jB53a2tgnaw2rXBpMe1qu8uSpym2plU0fkgLAnVugS5+KRhOkUHyorcbpVZbs5azf7GlTydR5dI1PHF3Bncemoa6IsEvumHWgQbVyTTz/O9mlFafUwKBgQCvDebms8KUf5JY1F6XfaCLWGVl8nZdVCmQFKbA7Lg2lI5KS3jHQWsupeEZRORffU/3nXsc1apZ9YY+r6CYvI77rRXd1KqPzxos/o7d96TzjkZhc9CEjTlmmh2jb5rqx/Ns/xFcZq/GGH+cx3ODZvHeZQ9NFY+9GLJ+dfB2DX0ZtwKBgQC+9/lZ8telbpqMqpqwqRaJ8LMn5JIdHZu0E6IcuhFLr+ogMW3zTKMpVtGGXEXi2M/TWRPDchiO2tQX4Q5T2/KW19QCbJ5KCwPWiGF3owN4tNOciDGh0xkSidRc0xAh8bnyejSoBry8zlcNUVztdkgMLOGonvCjZWPSOTNQnPYluwKBgCV+WVftpTk3l+OfAJTaXEPNYdh7+WQjzxZKjUaDzx80Ts7hRo2U+EQT7FBjQQNqmmDnWtujo5p1YmJC0FT3n1CVa7g901pb3b0RcOziYWAoJi0/+kLyeo6XBhuLeZ7h90S70GGh1o0V/j/9N1jb5DCL4xKkvdYePPTSTku0BM+n">
	//   51   97:invokestatic    #95  <Method byte[] e.b(byte[], String)>
	//   52  100:invokestatic    #100 <Method String b.a(byte[])>
	//   53  103:putfield        #37  <Field String e>
			return;
	//   54  106:return          
		}
		// Misplaced declaration of an exception variable
		catch(Context context)
	//*  55  107:astore_1        
		{
			((Throwable) (context)).printStackTrace();
	//   56  108:aload_1         
	//   57  109:invokevirtual   #103 <Method void Throwable.printStackTrace()>
		}
	//   58  112:return          
	}

	static ii b(jp jp1, ii ii1)
	{
		jp1.b = ii1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #43  <Field ii b>
		return ii1;
	//    3    5:aload_1         
	//    4    6:areturn         
	}

	private jt c(Bundle bundle)
	{
		Object obj;
		if(bundle == null)
	//*   0    0:aload_1         
	//*   1    1:ifnonnull       6
			return null;
	//    2    4:aconst_null     
	//    3    5:areturn         
		Object obj1 = null;
	//    4    6:aconst_null     
	//    5    7:astore          7
		obj = ((Object) (obj1));
	//    6    9:aload           7
	//    7   11:astore          6
		if(bundle.containsKey("key"))
	//*   8   13:aload_1         
	//*   9   14:ldc1            #110 <String "key">
	//*  10   16:invokevirtual   #116 <Method boolean Bundle.containsKey(String)>
	//*  11   19:ifeq            56
		{
			obj = ((Object) (com.amap.api.location.core.b.a(bundle.getString("key"))));
	//   12   22:aload_1         
	//   13   23:ldc1            #110 <String "key">
	//   14   25:invokevirtual   #120 <Method String Bundle.getString(String)>
	//   15   28:invokestatic    #122 <Method byte[] b.a(String)>
	//   16   31:astore          6
			try
			{
				obj = ((Object) (com.amap.api.location.core.e.c(((byte []) (obj)), "MIIEvgIBADANBgkqhkiG9w0BAQEFAASCBKgwggSkAgEAAoIBAQDCEYwdO3V2ANrhApjqyk7X8FH5AEaWly58kP9IDAhMqwtIbmcJrUK9oO9Afh3KZnOlDtjiowy733YqpLRO7WBvdbW/c4Dz/d3dy/m+6HMqxaak+GQQRHw/VPdKciaZ3eIZp4MWOyIQwiFSQvPTAo/Na8hV4SgBZHB3lGFw0yu+BmG+h32eIE6p4Y8EDCn+G+yzekX+taMrWTQIysledrygZSGPv1ukbdFDnH/xZEI0dCr9pZT+AZQl3o9a2aMyuRrHM0oupXKKiYl69Y8fKh1Tyd752rF6LrR5uOb9aOfXt18hb+3YL5P9rQ+ZRYbyHYFaxzBPA2jLq0KUQ+Dmg7YhAgMBAAECggEAL9pj0lF3BUHwtssNKdf42QZJMD0BKuDcdZrLV9ifs0f54EJY5enzKw8j76MpdV8N5QVkNX4/BZR0bs9uJogh31oHFs5EXeWbb7V8P7bRrxpNnSAijGBWwscQsyqymf48YlcL28949ujnjoEz3jQjgWOyYnrCgpVhphrQbCGmB5TcZnTFvHfozt/0tzuMj5na5lRnkD0kYXgr0x/SRZcPoCybSpc3t/B/9MAAboGaV/QQkTotr7VOuJfaPRjvg8rzyPzavo3evxsjXj7vDXbN4w0cbk/Uqn2JtvPQ8HoysmF2HdYvILZibvJmWH1hA58b4sn5s6AqFRjMOL7rHdD+gQKBgQD+IzoofmZK5tTxgO9sWsG71IUeshQP9fe159jKCehk1RfuIqqbRP0UcxJiw4eNjHs4zU0HeRL3iF5XfUs0FQanO/pp6YL1xgVdfQlDdTdk6KFHJ0sUJapnJn1S2k7IKfRKE1+rkofSXMYUTsgHF1fDp+gxy4yUMY+h9O+JlKVKOwKBgQDDfaDIblaSm+B0lyG//wFPynAeGd0Q8wcMZbQQ/LWMJZhMZ7fyUZ+A6eL/jB53a2tgnaw2rXBpMe1qu8uSpym2plU0fkgLAnVugS5+KRhOkUHyorcbpVZbs5azf7GlTydR5dI1PHF3Bncemoa6IsEvumHWgQbVyTTz/O9mlFafUwKBgQCvDebms8KUf5JY1F6XfaCLWGVl8nZdVCmQFKbA7Lg2lI5KS3jHQWsupeEZRORffU/3nXsc1apZ9YY+r6CYvI77rRXd1KqPzxos/o7d96TzjkZhc9CEjTlmmh2jb5rqx/Ns/xFcZq/GGH+cx3ODZvHeZQ9NFY+9GLJ+dfB2DX0ZtwKBgQC+9/lZ8telbpqMqpqwqRaJ8LMn5JIdHZu0E6IcuhFLr+ogMW3zTKMpVtGGXEXi2M/TWRPDchiO2tQX4Q5T2/KW19QCbJ5KCwPWiGF3owN4tNOciDGh0xkSidRc0xAh8bnyejSoBry8zlcNUVztdkgMLOGonvCjZWPSOTNQnPYluwKBgCV+WVftpTk3l+OfAJTaXEPNYdh7+WQjzxZKjUaDzx80Ts7hRo2U+EQT7FBjQQNqmmDnWtujo5p1YmJC0FT3n1CVa7g901pb3b0RcOziYWAoJi0/+kLyeo6XBhuLeZ7h90S70GGh1o0V/j/9N1jb5DCL4xKkvdYePPTSTku0BM+n")));
	//   17   33:aload           6
	//   18   35:ldc1            #90  <String "MIIEvgIBADANBgkqhkiG9w0BAQEFAASCBKgwggSkAgEAAoIBAQDCEYwdO3V2ANrhApjqyk7X8FH5AEaWly58kP9IDAhMqwtIbmcJrUK9oO9Afh3KZnOlDtjiowy733YqpLRO7WBvdbW/c4Dz/d3dy/m+6HMqxaak+GQQRHw/VPdKciaZ3eIZp4MWOyIQwiFSQvPTAo/Na8hV4SgBZHB3lGFw0yu+BmG+h32eIE6p4Y8EDCn+G+yzekX+taMrWTQIysledrygZSGPv1ukbdFDnH/xZEI0dCr9pZT+AZQl3o9a2aMyuRrHM0oupXKKiYl69Y8fKh1Tyd752rF6LrR5uOb9aOfXt18hb+3YL5P9rQ+ZRYbyHYFaxzBPA2jLq0KUQ+Dmg7YhAgMBAAECggEAL9pj0lF3BUHwtssNKdf42QZJMD0BKuDcdZrLV9ifs0f54EJY5enzKw8j76MpdV8N5QVkNX4/BZR0bs9uJogh31oHFs5EXeWbb7V8P7bRrxpNnSAijGBWwscQsyqymf48YlcL28949ujnjoEz3jQjgWOyYnrCgpVhphrQbCGmB5TcZnTFvHfozt/0tzuMj5na5lRnkD0kYXgr0x/SRZcPoCybSpc3t/B/9MAAboGaV/QQkTotr7VOuJfaPRjvg8rzyPzavo3evxsjXj7vDXbN4w0cbk/Uqn2JtvPQ8HoysmF2HdYvILZibvJmWH1hA58b4sn5s6AqFRjMOL7rHdD+gQKBgQD+IzoofmZK5tTxgO9sWsG71IUeshQP9fe159jKCehk1RfuIqqbRP0UcxJiw4eNjHs4zU0HeRL3iF5XfUs0FQanO/pp6YL1xgVdfQlDdTdk6KFHJ0sUJapnJn1S2k7IKfRKE1+rkofSXMYUTsgHF1fDp+gxy4yUMY+h9O+JlKVKOwKBgQDDfaDIblaSm+B0lyG//wFPynAeGd0Q8wcMZbQQ/LWMJZhMZ7fyUZ+A6eL/jB53a2tgnaw2rXBpMe1qu8uSpym2plU0fkgLAnVugS5+KRhOkUHyorcbpVZbs5azf7GlTydR5dI1PHF3Bncemoa6IsEvumHWgQbVyTTz/O9mlFafUwKBgQCvDebms8KUf5JY1F6XfaCLWGVl8nZdVCmQFKbA7Lg2lI5KS3jHQWsupeEZRORffU/3nXsc1apZ9YY+r6CYvI77rRXd1KqPzxos/o7d96TzjkZhc9CEjTlmmh2jb5rqx/Ns/xFcZq/GGH+cx3ODZvHeZQ9NFY+9GLJ+dfB2DX0ZtwKBgQC+9/lZ8telbpqMqpqwqRaJ8LMn5JIdHZu0E6IcuhFLr+ogMW3zTKMpVtGGXEXi2M/TWRPDchiO2tQX4Q5T2/KW19QCbJ5KCwPWiGF3owN4tNOciDGh0xkSidRc0xAh8bnyejSoBry8zlcNUVztdkgMLOGonvCjZWPSOTNQnPYluwKBgCV+WVftpTk3l+OfAJTaXEPNYdh7+WQjzxZKjUaDzx80Ts7hRo2U+EQT7FBjQQNqmmDnWtujo5p1YmJC0FT3n1CVa7g901pb3b0RcOziYWAoJi0/+kLyeo6XBhuLeZ7h90S70GGh1o0V/j/9N1jb5DCL4xKkvdYePPTSTku0BM+n">
	//   19   37:invokestatic    #124 <Method byte[] e.c(byte[], String)>
	//   20   40:astore          6
			}
	//*  21   42:goto            56
			// Misplaced declaration of an exception variable
			catch(Object obj)
	//*  22   45:astore          6
			{
				((Exception) (obj)).printStackTrace();
	//   23   47:aload           6
	//   24   49:invokevirtual   #125 <Method void Exception.printStackTrace()>
				obj = ((Object) (obj1));
	//   25   52:aload           7
	//   26   54:astore          6
			}
		}
		if(!bundle.containsKey("result"))
			break MISSING_BLOCK_LABEL_746;
	//   27   56:aload_1         
	//   28   57:ldc1            #127 <String "result">
	//   29   59:invokevirtual   #116 <Method boolean Bundle.containsKey(String)>
	//   30   62:ifeq            746
		bundle = ((Bundle) (com.amap.api.location.core.b.a(bundle.getString("result"))));
	//   31   65:aload_1         
	//   32   66:ldc1            #127 <String "result">
	//   33   68:invokevirtual   #120 <Method String Bundle.getString(String)>
	//   34   71:invokestatic    #122 <Method byte[] b.a(String)>
	//   35   74:astore_1        
		bundle = ((Bundle) (new String(com.amap.api.location.core.e.b(((byte []) (obj)), ((byte []) (bundle))), "utf-8")));
	//   36   75:new             #84  <Class String>
	//   37   78:dup             
	//   38   79:aload           6
	//   39   81:aload_1         
	//   40   82:invokestatic    #130 <Method byte[] e.b(byte[], byte[])>
	//   41   85:ldc1            #132 <String "utf-8">
	//   42   87:invokespecial   #135 <Method void String(byte[], String)>
	//   43   90:astore_1        
		if(bundle == null)
			break MISSING_BLOCK_LABEL_746;
	//   44   91:aload_1         
	//   45   92:ifnull          738
		JSONObject jsonobject;
		jsonobject = new JSONObject(((String) (bundle)));
	//   46   95:new             #137 <Class JSONObject>
	//   47   98:dup             
	//   48   99:aload_1         
	//   49  100:invokespecial   #140 <Method void JSONObject(String)>
	//   50  103:astore          8
		if(!jsonobject.has("error"))
			break MISSING_BLOCK_LABEL_182;
	//   51  105:aload           8
	//   52  107:ldc1            #142 <String "error">
	//   53  109:invokevirtual   #145 <Method boolean JSONObject.has(String)>
	//   54  112:ifeq            182
		bundle = ((Bundle) (jsonobject.getString("error")));
	//   55  115:aload           8
	//   56  117:ldc1            #142 <String "error">
	//   57  119:invokevirtual   #146 <Method String JSONObject.getString(String)>
	//   58  122:astore_1        
		if(g.equals(((Object) (bundle))))
	//*  59  123:aload_0         
	//*  60  124:getfield        #64  <Field String g>
	//*  61  127:aload_1         
	//*  62  128:invokevirtual   #150 <Method boolean String.equals(Object)>
	//*  63  131:ifeq            139
			c = false;
	//   64  134:aload_0         
	//   65  135:iconst_0        
	//   66  136:putfield        #41  <Field boolean c>
		if(l.equals(((Object) (bundle))))
	//*  67  139:aload_0         
	//*  68  140:getfield        #68  <Field String l>
	//*  69  143:aload_1         
	//*  70  144:invokevirtual   #150 <Method boolean String.equals(Object)>
	//*  71  147:ifeq            155
			c = false;
	//   72  150:aload_0         
	//   73  151:iconst_0        
	//   74  152:putfield        #41  <Field boolean c>
		if(p.equals(((Object) (bundle))))
	//*  75  155:aload_0         
	//*  76  156:getfield        #72  <Field String p>
	//*  77  159:aload_1         
	//*  78  160:invokevirtual   #150 <Method boolean String.equals(Object)>
	//*  79  163:ifeq            171
			c = false;
	//   80  166:aload_0         
	//   81  167:iconst_0        
	//   82  168:putfield        #41  <Field boolean c>
		n.equals(((Object) (bundle)));
	//   83  171:aload_0         
	//   84  172:getfield        #76  <Field String n>
	//   85  175:aload_1         
	//   86  176:invokevirtual   #150 <Method boolean String.equals(Object)>
	//   87  179:pop             
		return null;
	//   88  180:aconst_null     
	//   89  181:areturn         
		jt jt1;
		jt1 = new jt();
	//   90  182:new             #152 <Class jt>
	//   91  185:dup             
	//   92  186:invokespecial   #153 <Method void jt()>
	//   93  189:astore          7
		if(jsonobject.has("time"))
	//*  94  191:aload           8
	//*  95  193:ldc1            #155 <String "time">
	//*  96  195:invokevirtual   #145 <Method boolean JSONObject.has(String)>
	//*  97  198:ifeq            213
			jt1.b(jsonobject.getLong("time"));
	//   98  201:aload           7
	//   99  203:aload           8
	//  100  205:ldc1            #155 <String "time">
	//  101  207:invokevirtual   #159 <Method long JSONObject.getLong(String)>
	//  102  210:invokevirtual   #162 <Method void o.jt.b(long)>
		if(jsonobject.has("acc"))
	//* 103  213:aload           8
	//* 104  215:ldc1            #164 <String "acc">
	//* 105  217:invokevirtual   #145 <Method boolean JSONObject.has(String)>
	//* 106  220:ifeq            236
			jt1.b(jsonobject.getInt("acc"));
	//  107  223:aload           7
	//  108  225:aload           8
	//  109  227:ldc1            #164 <String "acc">
	//  110  229:invokevirtual   #168 <Method int JSONObject.getInt(String)>
	//  111  232:i2f             
	//  112  233:invokevirtual   #171 <Method void o.jt.b(float)>
		if(jsonobject.has("dir"))
	//* 113  236:aload           8
	//* 114  238:ldc1            #173 <String "dir">
	//* 115  240:invokevirtual   #145 <Method boolean JSONObject.has(String)>
	//* 116  243:ifeq            261
			jt1.c(Float.parseFloat(jsonobject.getString("dir")));
	//  117  246:aload           7
	//  118  248:aload           8
	//  119  250:ldc1            #173 <String "dir">
	//  120  252:invokevirtual   #146 <Method String JSONObject.getString(String)>
	//  121  255:invokestatic    #179 <Method float Float.parseFloat(String)>
	//  122  258:invokevirtual   #181 <Method void o.jt.c(float)>
		jt1.f("lbs");
	//  123  261:aload           7
	//  124  263:ldc1            #183 <String "lbs">
	//  125  265:invokevirtual   #185 <Method void jt.f(String)>
		double d1;
		double d2;
		d1 = 0.0D;
	//  126  268:dconst_0        
	//  127  269:dstore_2        
		d2 = 0.0D;
	//  128  270:dconst_0        
	//  129  271:dstore          4
		if(jsonobject.has("lat"))
	//* 130  273:aload           8
	//* 131  275:ldc1            #187 <String "lat">
	//* 132  277:invokevirtual   #145 <Method boolean JSONObject.has(String)>
	//* 133  280:ifeq            291
			d1 = jsonobject.getDouble("lat");
	//  134  283:aload           8
	//  135  285:ldc1            #187 <String "lat">
	//  136  287:invokevirtual   #191 <Method double JSONObject.getDouble(String)>
	//  137  290:dstore_2        
		if(jsonobject.has("lon"))
	//* 138  291:aload           8
	//* 139  293:ldc1            #193 <String "lon">
	//* 140  295:invokevirtual   #145 <Method boolean JSONObject.has(String)>
	//* 141  298:ifeq            310
			d2 = jsonobject.getDouble("lon");
	//  142  301:aload           8
	//  143  303:ldc1            #193 <String "lon">
	//  144  305:invokevirtual   #191 <Method double JSONObject.getDouble(String)>
	//  145  308:dstore          4
		bundle = null;
	//  146  310:aconst_null     
	//  147  311:astore_1        
		if(jsonobject.has("type"))
	//* 148  312:aload           8
	//* 149  314:ldc1            #195 <String "type">
	//* 150  316:invokevirtual   #145 <Method boolean JSONObject.has(String)>
	//* 151  319:ifeq            330
			bundle = ((Bundle) (jsonobject.getString("type")));
	//  152  322:aload           8
	//  153  324:ldc1            #195 <String "type">
	//  154  326:invokevirtual   #146 <Method String JSONObject.getString(String)>
	//  155  329:astore_1        
		obj = null;
	//  156  330:aconst_null     
	//  157  331:astore          6
		if(jsonobject.has("poiname"))
	//* 158  333:aload           8
	//* 159  335:ldc1            #197 <String "poiname">
	//* 160  337:invokevirtual   #145 <Method boolean JSONObject.has(String)>
	//* 161  340:ifeq            352
			obj = ((Object) (jsonobject.getString("poiname")));
	//  162  343:aload           8
	//  163  345:ldc1            #197 <String "poiname">
	//  164  347:invokevirtual   #146 <Method String JSONObject.getString(String)>
	//  165  350:astore          6
		jt1.t(((String) (obj)));
	//  166  352:aload           7
	//  167  354:aload           6
	//  168  356:invokevirtual   #200 <Method void jt.t(String)>
		obj = null;
	//  169  359:aconst_null     
	//  170  360:astore          6
		if(jsonobject.has("desc"))
	//* 171  362:aload           8
	//* 172  364:ldc1            #202 <String "desc">
	//* 173  366:invokevirtual   #145 <Method boolean JSONObject.has(String)>
	//* 174  369:ifeq            381
			obj = ((Object) (jsonobject.getString("desc")));
	//  175  372:aload           8
	//  176  374:ldc1            #202 <String "desc">
	//  177  376:invokevirtual   #146 <Method String JSONObject.getString(String)>
	//  178  379:astore          6
		jt1.i(((String) (obj)));
	//  179  381:aload           7
	//  180  383:aload           6
	//  181  385:invokevirtual   #204 <Method void jt.i(String)>
		obj = null;
	//  182  388:aconst_null     
	//  183  389:astore          6
		if(jsonobject.has("street"))
	//* 184  391:aload           8
	//* 185  393:ldc1            #206 <String "street">
	//* 186  395:invokevirtual   #145 <Method boolean JSONObject.has(String)>
	//* 187  398:ifeq            410
			obj = ((Object) (jsonobject.getString("street")));
	//  188  401:aload           8
	//  189  403:ldc1            #206 <String "street">
	//  190  405:invokevirtual   #146 <Method String JSONObject.getString(String)>
	//  191  408:astore          6
		jt1.u(((String) (obj)));
	//  192  410:aload           7
	//  193  412:aload           6
	//  194  414:invokevirtual   #209 <Method void jt.u(String)>
		obj = null;
	//  195  417:aconst_null     
	//  196  418:astore          6
		if(jsonobject.has("pid"))
	//* 197  420:aload           8
	//* 198  422:ldc1            #211 <String "pid">
	//* 199  424:invokevirtual   #145 <Method boolean JSONObject.has(String)>
	//* 200  427:ifeq            439
			obj = ((Object) (jsonobject.getString("pid")));
	//  201  430:aload           8
	//  202  432:ldc1            #211 <String "pid">
	//  203  434:invokevirtual   #146 <Method String JSONObject.getString(String)>
	//  204  437:astore          6
		jt1.e(((String) (obj)));
	//  205  439:aload           7
	//  206  441:aload           6
	//  207  443:invokevirtual   #213 <Method void o.jt.e(String)>
		obj = null;
	//  208  446:aconst_null     
	//  209  447:astore          6
		if(jsonobject.has("flr"))
	//* 210  449:aload           8
	//* 211  451:ldc1            #215 <String "flr">
	//* 212  453:invokevirtual   #145 <Method boolean JSONObject.has(String)>
	//* 213  456:ifeq            468
			obj = ((Object) (jsonobject.getString("flr")));
	//  214  459:aload           8
	//  215  461:ldc1            #215 <String "flr">
	//  216  463:invokevirtual   #146 <Method String JSONObject.getString(String)>
	//  217  466:astore          6
		jt1.d(((String) (obj)));
	//  218  468:aload           7
	//  219  470:aload           6
	//  220  472:invokevirtual   #217 <Method void jt.d(String)>
		obj = null;
	//  221  475:aconst_null     
	//  222  476:astore          6
		if(jsonobject.has("road"))
	//* 223  478:aload           8
	//* 224  480:ldc1            #219 <String "road">
	//* 225  482:invokevirtual   #145 <Method boolean JSONObject.has(String)>
	//* 226  485:ifeq            497
			obj = ((Object) (jsonobject.getString("road")));
	//  227  488:aload           8
	//  228  490:ldc1            #219 <String "road">
	//  229  492:invokevirtual   #146 <Method String JSONObject.getString(String)>
	//  230  495:astore          6
		jt1.l(((String) (obj)));
	//  231  497:aload           7
	//  232  499:aload           6
	//  233  501:invokevirtual   #221 <Method void jt.l(String)>
		obj = null;
	//  234  504:aconst_null     
	//  235  505:astore          6
		if(jsonobject.has("city"))
	//* 236  507:aload           8
	//* 237  509:ldc1            #223 <String "city">
	//* 238  511:invokevirtual   #145 <Method boolean JSONObject.has(String)>
	//* 239  514:ifeq            526
			obj = ((Object) (jsonobject.getString("city")));
	//  240  517:aload           8
	//  241  519:ldc1            #223 <String "city">
	//  242  521:invokevirtual   #146 <Method String JSONObject.getString(String)>
	//  243  524:astore          6
		jt1.n(((String) (obj)));
	//  244  526:aload           7
	//  245  528:aload           6
	//  246  530:invokevirtual   #225 <Method void jt.n(String)>
		obj = null;
	//  247  533:aconst_null     
	//  248  534:astore          6
		if(jsonobject.has("country"))
	//* 249  536:aload           8
	//* 250  538:ldc1            #227 <String "country">
	//* 251  540:invokevirtual   #145 <Method boolean JSONObject.has(String)>
	//* 252  543:ifeq            555
			obj = ((Object) (jsonobject.getString("country")));
	//  253  546:aload           8
	//  254  548:ldc1            #227 <String "country">
	//  255  550:invokevirtual   #146 <Method String JSONObject.getString(String)>
	//  256  553:astore          6
		jt1.o(((String) (obj)));
	//  257  555:aload           7
	//  258  557:aload           6
	//  259  559:invokevirtual   #230 <Method void jt.o(String)>
		obj = null;
	//  260  562:aconst_null     
	//  261  563:astore          6
		if(jsonobject.has("citycode"))
	//* 262  565:aload           8
	//* 263  567:ldc1            #232 <String "citycode">
	//* 264  569:invokevirtual   #145 <Method boolean JSONObject.has(String)>
	//* 265  572:ifeq            584
			obj = ((Object) (jsonobject.getString("citycode")));
	//  266  575:aload           8
	//  267  577:ldc1            #232 <String "citycode">
	//  268  579:invokevirtual   #146 <Method String JSONObject.getString(String)>
	//  269  582:astore          6
		jt1.k(((String) (obj)));
	//  270  584:aload           7
	//  271  586:aload           6
	//  272  588:invokevirtual   #234 <Method void jt.k(String)>
		obj = null;
	//  273  591:aconst_null     
	//  274  592:astore          6
		if(jsonobject.has("province"))
	//* 275  594:aload           8
	//* 276  596:ldc1            #236 <String "province">
	//* 277  598:invokevirtual   #145 <Method boolean JSONObject.has(String)>
	//* 278  601:ifeq            613
			obj = ((Object) (jsonobject.getString("province")));
	//  279  604:aload           8
	//  280  606:ldc1            #236 <String "province">
	//  281  608:invokevirtual   #146 <Method String JSONObject.getString(String)>
	//  282  611:astore          6
		jt1.m(((String) (obj)));
	//  283  613:aload           7
	//  284  615:aload           6
	//  285  617:invokevirtual   #239 <Method void jt.m(String)>
		obj = null;
	//  286  620:aconst_null     
	//  287  621:astore          6
		if(jsonobject.has("adcode"))
	//* 288  623:aload           8
	//* 289  625:ldc1            #241 <String "adcode">
	//* 290  627:invokevirtual   #145 <Method boolean JSONObject.has(String)>
	//* 291  630:ifeq            642
			obj = ((Object) (jsonobject.getString("adcode")));
	//  292  633:aload           8
	//  293  635:ldc1            #241 <String "adcode">
	//  294  637:invokevirtual   #146 <Method String JSONObject.getString(String)>
	//  295  640:astore          6
		jt1.p(((String) (obj)));
	//  296  642:aload           7
	//  297  644:aload           6
	//  298  646:invokevirtual   #243 <Method void jt.p(String)>
		obj = null;
	//  299  649:aconst_null     
	//  300  650:astore          6
		if(jsonobject.has("district"))
	//* 301  652:aload           8
	//* 302  654:ldc1            #245 <String "district">
	//* 303  656:invokevirtual   #145 <Method boolean JSONObject.has(String)>
	//* 304  659:ifeq            671
			obj = ((Object) (jsonobject.getString("district")));
	//  305  662:aload           8
	//  306  664:ldc1            #245 <String "district">
	//  307  666:invokevirtual   #146 <Method String JSONObject.getString(String)>
	//  308  669:astore          6
		jt1.a(((String) (obj)));
	//  309  671:aload           7
	//  310  673:aload           6
	//  311  675:invokevirtual   #247 <Method void jt.a(String)>
		if(!"WGS84".equals(((Object) (bundle))) || !com.amap.api.location.core.c.a(d1, d2))
			break MISSING_BLOCK_LABEL_722;
	//  312  678:ldc1            #249 <String "WGS84">
	//  313  680:aload_1         
	//  314  681:invokevirtual   #150 <Method boolean String.equals(Object)>
	//  315  684:ifeq            722
	//  316  687:dload_2         
	//  317  688:dload           4
	//  318  690:invokestatic    #252 <Method boolean c.a(double, double)>
	//  319  693:ifeq            722
		bundle = ((Bundle) (kh.d(d2, d1)));
	//  320  696:dload           4
	//  321  698:dload_2         
	//  322  699:invokestatic    #257 <Method double[] kh.d(double, double)>
	//  323  702:astore_1        
		jt1.a(bundle[1]);
	//  324  703:aload           7
	//  325  705:aload_1         
	//  326  706:iconst_1        
	//  327  707:daload          
	//  328  708:invokevirtual   #260 <Method void jt.a(double)>
		jt1.d(bundle[0]);
	//  329  711:aload           7
	//  330  713:aload_1         
	//  331  714:iconst_0        
	//  332  715:daload          
	//  333  716:invokevirtual   #262 <Method void jt.d(double)>
		return jt1;
	//  334  719:aload           7
	//  335  721:areturn         
		jt1.a(d1);
	//  336  722:aload           7
	//  337  724:dload_2         
	//  338  725:invokevirtual   #260 <Method void jt.a(double)>
		jt1.d(d2);
	//  339  728:aload           7
	//  340  730:dload           4
	//  341  732:invokevirtual   #262 <Method void jt.d(double)>
		return jt1;
	//  342  735:aload           7
	//  343  737:areturn         
	//* 344  738:goto            746
		bundle;
	//  345  741:astore_1        
		((Exception) (bundle)).printStackTrace();
	//  346  742:aload_1         
	//  347  743:invokevirtual   #125 <Method void Exception.printStackTrace()>
		return null;
	//  348  746:aconst_null     
	//  349  747:areturn         
	}

	void a()
	{
		try
		{
			d.unbindService(f);
	//    0    0:aload_0         
	//    1    1:getfield        #39  <Field Context d>
	//    2    4:aload_0         
	//    3    5:getfield        #45  <Field ServiceConnection f>
	//    4    8:invokevirtual   #270 <Method void Context.unbindService(ServiceConnection)>
		}
	//*   5   11:goto            23
		catch(IllegalArgumentException illegalargumentexception)
	//*   6   14:astore_1        
		{
			illegalargumentexception.printStackTrace();
	//    7   15:aload_1         
	//    8   16:invokevirtual   #271 <Method void IllegalArgumentException.printStackTrace()>
		}
	//*   9   19:goto            23
		catch(Throwable throwable) { }
	//   10   22:astore_1        
		b = null;
	//   11   23:aload_0         
	//   12   24:aconst_null     
	//   13   25:putfield        #43  <Field ii b>
	//   14   28:return          
	}

	public void a(b b1)
	{
		try
		{
			a = b1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #60  <Field jp$b a>
			if(f == null)
	//*   3    5:aload_0         
	//*   4    6:getfield        #45  <Field ServiceConnection f>
	//*   5    9:ifnonnull       25
				f = new ServiceConnection(b1) {

					public void onServiceConnected(ComponentName componentname, IBinder ibinder)
					{
						o.jp.b(d, o.ii.b.c(ibinder));
					//    0    0:aload_0         
					//    1    1:getfield        #19  <Field jp d>
					//    2    4:aload_2         
					//    3    5:invokestatic    #33  <Method ii o.ii$b.c(IBinder)>
					//    4    8:invokestatic    #36  <Method ii o.jp.b(jp, ii)>
					//    5   11:pop             
						b.c(0);
					//    6   12:aload_0         
					//    7   13:getfield        #21  <Field jp$b b>
					//    8   16:iconst_0        
					//    9   17:invokeinterface #41  <Method void o.jp$b.c(int)>
					//   10   22:return          
					}

					public void onServiceDisconnected(ComponentName componentname)
					{
						o.jp.b(d, ((ii) (null)));
					//    0    0:aload_0         
					//    1    1:getfield        #19  <Field jp d>
					//    2    4:aconst_null     
					//    3    5:invokestatic    #36  <Method ii o.jp.b(jp, ii)>
					//    4    8:pop             
					//    5    9:return          
					}

					final b b;
					final jp d;

			
			{
				d = jp.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #19  <Field jp d>
				b = b1;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #21  <Field jp$b b>
				super();
			//    6   10:aload_0         
			//    7   11:invokespecial   #24  <Method void Object()>
			//    8   14:return          
			}
				}
;
	//    6   12:aload_0         
	//    7   13:new             #6   <Class jp$1>
	//    8   16:dup             
	//    9   17:aload_0         
	//   10   18:aload_1         
	//   11   19:invokespecial   #275 <Method void jp$1(jp, jp$b)>
	//   12   22:putfield        #45  <Field ServiceConnection f>
			return;
	//   13   25:return          
		}
		// Misplaced declaration of an exception variable
		catch(b b1)
	//*  14   26:astore_1        
		{
			((Throwable) (b1)).printStackTrace();
	//   15   27:aload_1         
	//   16   28:invokevirtual   #103 <Method void Throwable.printStackTrace()>
		}
	//   17   31:return          
	}

	public void b()
	{
		a();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #277 <Method void a()>
		d = null;
	//    2    4:aload_0         
	//    3    5:aconst_null     
	//    4    6:putfield        #39  <Field Context d>
		b = null;
	//    5    9:aload_0         
	//    6   10:aconst_null     
	//    7   11:putfield        #43  <Field ii b>
		f = null;
	//    8   14:aload_0         
	//    9   15:aconst_null     
	//   10   16:putfield        #45  <Field ServiceConnection f>
		if(a != null)
	//*  11   19:aload_0         
	//*  12   20:getfield        #60  <Field jp$b a>
	//*  13   23:ifnull          36
			a.c(-1);
	//   14   26:aload_0         
	//   15   27:getfield        #60  <Field jp$b a>
	//   16   30:iconst_m1       
	//   17   31:invokeinterface #280 <Method void o.jp$b.c(int)>
		c = true;
	//   18   36:aload_0         
	//   19   37:iconst_1        
	//   20   38:putfield        #41  <Field boolean c>
	//   21   41:return          
	}

	jt d()
	{
		boolean flag = c;
	//    0    0:aload_0         
	//    1    1:getfield        #41  <Field boolean c>
	//    2    4:istore_1        
		if(!flag)
	//*   3    5:iload_1         
	//*   4    6:ifne            11
			return null;
	//    5    9:aconst_null     
	//    6   10:areturn         
		Object obj;
		obj = ((Object) (new Bundle()));
	//    7   11:new             #112 <Class Bundle>
	//    8   14:dup             
	//    9   15:invokespecial   #284 <Method void Bundle()>
	//   10   18:astore_2        
		((Bundle) (obj)).putString("type", "corse");
	//   11   19:aload_2         
	//   12   20:ldc1            #195 <String "type">
	//   13   22:ldc2            #286 <String "corse">
	//   14   25:invokevirtual   #290 <Method void Bundle.putString(String, String)>
		((Bundle) (obj)).putString("appkey", e);
	//   15   28:aload_2         
	//   16   29:ldc2            #292 <String "appkey">
	//   17   32:aload_0         
	//   18   33:getfield        #37  <Field String e>
	//   19   36:invokevirtual   #290 <Method void Bundle.putString(String, String)>
		b.b(((Bundle) (obj)));
	//   20   39:aload_0         
	//   21   40:getfield        #43  <Field ii b>
	//   22   43:aload_2         
	//   23   44:invokeinterface #297 <Method int o.ii.b(Bundle)>
	//   24   49:pop             
		if(((Bundle) (obj)).size() < 1)
			break MISSING_BLOCK_LABEL_74;
	//   25   50:aload_2         
	//   26   51:invokevirtual   #301 <Method int Bundle.size()>
	//   27   54:iconst_1        
	//   28   55:icmplt          66
		obj = ((Object) (c(((Bundle) (obj)))));
	//   29   58:aload_0         
	//   30   59:aload_2         
	//   31   60:invokespecial   #303 <Method jt c(Bundle)>
	//   32   63:astore_2        
		return ((jt) (obj));
	//   33   64:aload_2         
	//   34   65:areturn         
	//*  35   66:goto            74
		Object obj1;
		obj1;
	//   36   69:astore_2        
		break MISSING_BLOCK_LABEL_74;
	//   37   70:goto            74
		obj1;
	//   38   73:astore_2        
		return null;
	//   39   74:aconst_null     
	//   40   75:areturn         
	}

	boolean e()
	{
		boolean flag;
		try
		{
			h.setComponent(new ComponentName(k, i));
	//    0    0:aload_0         
	//    1    1:getfield        #50  <Field Intent h>
	//    2    4:new             #306 <Class ComponentName>
	//    3    7:dup             
	//    4    8:aload_0         
	//    5    9:getfield        #54  <Field String k>
	//    6   12:aload_0         
	//    7   13:getfield        #58  <Field String i>
	//    8   16:invokespecial   #308 <Method void ComponentName(String, String)>
	//    9   19:invokevirtual   #312 <Method Intent Intent.setComponent(ComponentName)>
	//   10   22:pop             
			h.putExtra("appkey", e);
	//   11   23:aload_0         
	//   12   24:getfield        #50  <Field Intent h>
	//   13   27:ldc2            #292 <String "appkey">
	//   14   30:aload_0         
	//   15   31:getfield        #37  <Field String e>
	//   16   34:invokevirtual   #316 <Method Intent Intent.putExtra(String, String)>
	//   17   37:pop             
			flag = d.bindService(h, f, 1);
	//   18   38:aload_0         
	//   19   39:getfield        #39  <Field Context d>
	//   20   42:aload_0         
	//   21   43:getfield        #50  <Field Intent h>
	//   22   46:aload_0         
	//   23   47:getfield        #45  <Field ServiceConnection f>
	//   24   50:iconst_1        
	//   25   51:invokevirtual   #320 <Method boolean Context.bindService(Intent, ServiceConnection, int)>
	//   26   54:istore_1        
		}
	//*  27   55:iload_1         
	//*  28   56:ireturn         
		catch(Exception exception)
	//*  29   57:astore_2        
		{
			return false;
	//   30   58:iconst_0        
	//   31   59:ireturn         
		}
		return flag;
	}

	b a;
	private ii b;
	private boolean c;
	private Context d;
	private String e;
	private ServiceConnection f;
	private String g;
	private Intent h;
	private String i;
	private String k;
	private String l;
	private String n;
	private String p;
}
