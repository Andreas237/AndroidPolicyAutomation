// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.graphics.drawable;

import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.drawable.Icon;
import android.os.Parcelable;
import android.util.Log;
import androidx.versionedparcelable.CustomVersionedParcelable;
import java.io.ByteArrayOutputStream;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.charset.Charset;

public class IconCompat extends CustomVersionedParcelable
{

	public IconCompat()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #34  <Method void CustomVersionedParcelable()>
		g = null;
	//    2    4:aload_0         
	//    3    5:aconst_null     
	//    4    6:putfield        #36  <Field ColorStateList g>
		i = h;
	//    5    9:aload_0         
	//    6   10:getstatic       #30  <Field android.graphics.PorterDuff$Mode h>
	//    7   13:putfield        #38  <Field android.graphics.PorterDuff$Mode i>
	//    8   16:return          
	}

	private static String a(int k)
	{
		switch(k)
	//*   0    0:iload_0         
		{
	//*   1    1:tableswitch     1 5: default 36
	//	               1 51
	//	               2 48
	//	               3 45
	//	               4 42
	//	               5 39
		default:
			return "UNKNOWN";
	//    2   36:ldc1            #41  <String "UNKNOWN">
	//    3   38:areturn         

		case 5: // '\005'
			return "BITMAP_MASKABLE";
	//    4   39:ldc1            #43  <String "BITMAP_MASKABLE">
	//    5   41:areturn         

		case 4: // '\004'
			return "URI";
	//    6   42:ldc1            #45  <String "URI">
	//    7   44:areturn         

		case 3: // '\003'
			return "DATA";
	//    8   45:ldc1            #47  <String "DATA">
	//    9   47:areturn         

		case 2: // '\002'
			return "RESOURCE";
	//   10   48:ldc1            #49  <String "RESOURCE">
	//   11   50:areturn         

		case 1: // '\001'
			return "BITMAP";
	//   12   51:ldc1            #51  <String "BITMAP">
	//   13   53:areturn         
		}
	}

	private static String a(Icon icon)
	{
		if(android.os.Build.VERSION.SDK_INT >= 28)
	//*   0    0:getstatic       #63  <Field int android.os.Build$VERSION.SDK_INT>
	//*   1    3:bipush          28
	//*   2    5:icmplt          13
			return icon.getResPackage();
	//    3    8:aload_0         
	//    4    9:invokevirtual   #69  <Method String Icon.getResPackage()>
	//    5   12:areturn         
		try
		{
			icon = ((Icon) ((String)((Object) (icon)).getClass().getMethod("getResPackage", new Class[0]).invoke(((Object) (icon)), new Object[0])));
	//    6   13:aload_0         
	//    7   14:invokevirtual   #75  <Method Class Object.getClass()>
	//    8   17:ldc1            #76  <String "getResPackage">
	//    9   19:iconst_0        
	//   10   20:anewarray       Class[]
	//   11   23:invokevirtual   #82  <Method Method Class.getMethod(String, Class[])>
	//   12   26:aload_0         
	//   13   27:iconst_0        
	//   14   28:anewarray       Object[]
	//   15   31:invokevirtual   #88  <Method Object Method.invoke(Object, Object[])>
	//   16   34:checkcast       #90  <Class String>
	//   17   37:astore_0        
		}
	//*  18   38:aload_0         
	//*  19   39:areturn         
	//*  20   40:astore_0        
	//*  21   41:ldc1            #92  <String "IconCompat">
	//*  22   43:ldc1            #94  <String "Unable to get icon package">
	//*  23   45:aload_0         
	//*  24   46:invokestatic    #99  <Method int Log.e(String, String, Throwable)>
	//*  25   49:pop             
	//*  26   50:aconst_null     
	//*  27   51:areturn         
	//*  28   52:astore_0        
	//*  29   53:ldc1            #92  <String "IconCompat">
	//*  30   55:ldc1            #94  <String "Unable to get icon package">
	//*  31   57:aload_0         
	//*  32   58:invokestatic    #99  <Method int Log.e(String, String, Throwable)>
	//*  33   61:pop             
	//*  34   62:aconst_null     
	//*  35   63:areturn         
		// Misplaced declaration of an exception variable
		catch(Icon icon)
	//*  36   64:astore_0        
		{
			Log.e("IconCompat", "Unable to get icon package", ((Throwable) (icon)));
	//   37   65:ldc1            #92  <String "IconCompat">
	//   38   67:ldc1            #94  <String "Unable to get icon package">
	//   39   69:aload_0         
	//   40   70:invokestatic    #99  <Method int Log.e(String, String, Throwable)>
	//   41   73:pop             
			return null;
	//   42   74:aconst_null     
	//   43   75:areturn         
		}
		// Misplaced declaration of an exception variable
		catch(Icon icon)
		{
			Log.e("IconCompat", "Unable to get icon package", ((Throwable) (icon)));
			return null;
		}
		// Misplaced declaration of an exception variable
		catch(Icon icon)
		{
			Log.e("IconCompat", "Unable to get icon package", ((Throwable) (icon)));
			return null;
		}
		return ((String) (icon));
	}

	private static int b(Icon icon)
	{
		if(android.os.Build.VERSION.SDK_INT >= 28)
	//*   0    0:getstatic       #63  <Field int android.os.Build$VERSION.SDK_INT>
	//*   1    3:bipush          28
	//*   2    5:icmplt          13
			return icon.getResId();
	//    3    8:aload_0         
	//    4    9:invokevirtual   #104 <Method int Icon.getResId()>
	//    5   12:ireturn         
		int k;
		try
		{
			k = ((Integer)((Object) (icon)).getClass().getMethod("getResId", new Class[0]).invoke(((Object) (icon)), new Object[0])).intValue();
	//    6   13:aload_0         
	//    7   14:invokevirtual   #75  <Method Class Object.getClass()>
	//    8   17:ldc1            #105 <String "getResId">
	//    9   19:iconst_0        
	//   10   20:anewarray       Class[]
	//   11   23:invokevirtual   #82  <Method Method Class.getMethod(String, Class[])>
	//   12   26:aload_0         
	//   13   27:iconst_0        
	//   14   28:anewarray       Object[]
	//   15   31:invokevirtual   #88  <Method Object Method.invoke(Object, Object[])>
	//   16   34:checkcast       #107 <Class Integer>
	//   17   37:invokevirtual   #110 <Method int Integer.intValue()>
	//   18   40:istore_1        
		}
	//*  19   41:iload_1         
	//*  20   42:ireturn         
	//*  21   43:astore_0        
	//*  22   44:ldc1            #92  <String "IconCompat">
	//*  23   46:ldc1            #112 <String "Unable to get icon resource">
	//*  24   48:aload_0         
	//*  25   49:invokestatic    #99  <Method int Log.e(String, String, Throwable)>
	//*  26   52:pop             
	//*  27   53:iconst_0        
	//*  28   54:ireturn         
	//*  29   55:astore_0        
	//*  30   56:ldc1            #92  <String "IconCompat">
	//*  31   58:ldc1            #112 <String "Unable to get icon resource">
	//*  32   60:aload_0         
	//*  33   61:invokestatic    #99  <Method int Log.e(String, String, Throwable)>
	//*  34   64:pop             
	//*  35   65:iconst_0        
	//*  36   66:ireturn         
		// Misplaced declaration of an exception variable
		catch(Icon icon)
	//*  37   67:astore_0        
		{
			Log.e("IconCompat", "Unable to get icon resource", ((Throwable) (icon)));
	//   38   68:ldc1            #92  <String "IconCompat">
	//   39   70:ldc1            #112 <String "Unable to get icon resource">
	//   40   72:aload_0         
	//   41   73:invokestatic    #99  <Method int Log.e(String, String, Throwable)>
	//   42   76:pop             
			return 0;
	//   43   77:iconst_0        
	//   44   78:ireturn         
		}
		// Misplaced declaration of an exception variable
		catch(Icon icon)
		{
			Log.e("IconCompat", "Unable to get icon resource", ((Throwable) (icon)));
			return 0;
		}
		// Misplaced declaration of an exception variable
		catch(Icon icon)
		{
			Log.e("IconCompat", "Unable to get icon resource", ((Throwable) (icon)));
			return 0;
		}
		return k;
	}

	public String a()
	{
		if(a == -1 && android.os.Build.VERSION.SDK_INT >= 23)
	//*   0    0:aload_0         
	//*   1    1:getfield        #114 <Field int a>
	//*   2    4:iconst_m1       
	//*   3    5:icmpne          27
	//*   4    8:getstatic       #63  <Field int android.os.Build$VERSION.SDK_INT>
	//*   5   11:bipush          23
	//*   6   13:icmplt          27
			return a((Icon)b);
	//    7   16:aload_0         
	//    8   17:getfield        #116 <Field Object b>
	//    9   20:checkcast       #65  <Class Icon>
	//   10   23:invokestatic    #118 <Method String a(Icon)>
	//   11   26:areturn         
		if(a == 2)
	//*  12   27:aload_0         
	//*  13   28:getfield        #114 <Field int a>
	//*  14   31:iconst_2        
	//*  15   32:icmpne          51
		{
			return ((String)b).split(":", -1)[0];
	//   16   35:aload_0         
	//   17   36:getfield        #116 <Field Object b>
	//   18   39:checkcast       #90  <Class String>
	//   19   42:ldc1            #120 <String ":">
	//   20   44:iconst_m1       
	//   21   45:invokevirtual   #124 <Method String[] String.split(String, int)>
	//   22   48:iconst_0        
	//   23   49:aaload          
	//   24   50:areturn         
		} else
		{
			StringBuilder stringbuilder = new StringBuilder();
	//   25   51:new             #126 <Class StringBuilder>
	//   26   54:dup             
	//   27   55:invokespecial   #127 <Method void StringBuilder()>
	//   28   58:astore_1        
			stringbuilder.append("called getResPackage() on ");
	//   29   59:aload_1         
	//   30   60:ldc1            #129 <String "called getResPackage() on ">
	//   31   62:invokevirtual   #133 <Method StringBuilder StringBuilder.append(String)>
	//   32   65:pop             
			stringbuilder.append(((Object) (this)));
	//   33   66:aload_1         
	//   34   67:aload_0         
	//   35   68:invokevirtual   #136 <Method StringBuilder StringBuilder.append(Object)>
	//   36   71:pop             
			throw new IllegalStateException(stringbuilder.toString());
	//   37   72:new             #138 <Class IllegalStateException>
	//   38   75:dup             
	//   39   76:aload_1         
	//   40   77:invokevirtual   #141 <Method String StringBuilder.toString()>
	//   41   80:invokespecial   #144 <Method void IllegalStateException(String)>
	//   42   83:athrow          
		}
	}

	public void a(boolean flag)
	{
		j = i.name();
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #38  <Field android.graphics.PorterDuff$Mode i>
	//    3    5:invokevirtual   #148 <Method String android.graphics.PorterDuff$Mode.name()>
	//    4    8:putfield        #150 <Field String j>
		int k = a;
	//    5   11:aload_0         
	//    6   12:getfield        #114 <Field int a>
	//    7   15:istore_2        
		if(k != -1)
	//*   8   16:iload_2         
	//*   9   17:iconst_m1       
	//*  10   18:icmpeq          164
		{
			switch(k)
	//*  11   21:iload_2         
			{
	//*  12   22:tableswitch     1 5: default 56
	//	               1 109
	//	               2 89
	//	               3 77
	//	               4 57
	//	               5 109
			default:
				return;
	//   13   56:return          

			case 4: // '\004'
				c = b.toString().getBytes(Charset.forName("UTF-16"));
	//   14   57:aload_0         
	//   15   58:aload_0         
	//   16   59:getfield        #116 <Field Object b>
	//   17   62:invokevirtual   #151 <Method String Object.toString()>
	//   18   65:ldc1            #153 <String "UTF-16">
	//   19   67:invokestatic    #159 <Method Charset Charset.forName(String)>
	//   20   70:invokevirtual   #163 <Method byte[] String.getBytes(Charset)>
	//   21   73:putfield        #165 <Field byte[] c>
				return;
	//   22   76:return          

			case 3: // '\003'
				c = (byte[])b;
	//   23   77:aload_0         
	//   24   78:aload_0         
	//   25   79:getfield        #116 <Field Object b>
	//   26   82:checkcast       #166 <Class byte[]>
	//   27   85:putfield        #165 <Field byte[] c>
				return;
	//   28   88:return          

			case 2: // '\002'
				c = ((String)b).getBytes(Charset.forName("UTF-16"));
	//   29   89:aload_0         
	//   30   90:aload_0         
	//   31   91:getfield        #116 <Field Object b>
	//   32   94:checkcast       #90  <Class String>
	//   33   97:ldc1            #153 <String "UTF-16">
	//   34   99:invokestatic    #159 <Method Charset Charset.forName(String)>
	//   35  102:invokevirtual   #163 <Method byte[] String.getBytes(Charset)>
	//   36  105:putfield        #165 <Field byte[] c>
				return;
	//   37  108:return          

			case 1: // '\001'
			case 5: // '\005'
				break;
			}
			if(flag)
	//*  38  109:iload_1         
	//*  39  110:ifeq            152
			{
				Bitmap bitmap = (Bitmap)b;
	//   40  113:aload_0         
	//   41  114:getfield        #116 <Field Object b>
	//   42  117:checkcast       #168 <Class Bitmap>
	//   43  120:astore_3        
				ByteArrayOutputStream bytearrayoutputstream = new ByteArrayOutputStream();
	//   44  121:new             #170 <Class ByteArrayOutputStream>
	//   45  124:dup             
	//   46  125:invokespecial   #171 <Method void ByteArrayOutputStream()>
	//   47  128:astore          4
				bitmap.compress(android.graphics.Bitmap.CompressFormat.PNG, 90, ((java.io.OutputStream) (bytearrayoutputstream)));
	//   48  130:aload_3         
	//   49  131:getstatic       #177 <Field android.graphics.Bitmap$CompressFormat android.graphics.Bitmap$CompressFormat.PNG>
	//   50  134:bipush          90
	//   51  136:aload           4
	//   52  138:invokevirtual   #181 <Method boolean Bitmap.compress(android.graphics.Bitmap$CompressFormat, int, java.io.OutputStream)>
	//   53  141:pop             
				c = bytearrayoutputstream.toByteArray();
	//   54  142:aload_0         
	//   55  143:aload           4
	//   56  145:invokevirtual   #185 <Method byte[] ByteArrayOutputStream.toByteArray()>
	//   57  148:putfield        #165 <Field byte[] c>
				return;
	//   58  151:return          
			} else
			{
				d = (Parcelable)b;
	//   59  152:aload_0         
	//   60  153:aload_0         
	//   61  154:getfield        #116 <Field Object b>
	//   62  157:checkcast       #187 <Class Parcelable>
	//   63  160:putfield        #189 <Field Parcelable d>
				return;
	//   64  163:return          
			}
		}
		if(!flag)
	//*  65  164:iload_1         
	//*  66  165:ifne            180
		{
			d = (Parcelable)b;
	//   67  168:aload_0         
	//   68  169:aload_0         
	//   69  170:getfield        #116 <Field Object b>
	//   70  173:checkcast       #187 <Class Parcelable>
	//   71  176:putfield        #189 <Field Parcelable d>
			return;
	//   72  179:return          
		} else
		{
			throw new IllegalArgumentException("Can't serialize Icon created with IconCompat#createFromIcon");
	//   73  180:new             #191 <Class IllegalArgumentException>
	//   74  183:dup             
	//   75  184:ldc1            #193 <String "Can't serialize Icon created with IconCompat#createFromIcon">
	//   76  186:invokespecial   #194 <Method void IllegalArgumentException(String)>
	//   77  189:athrow          
		}
	}

	public int b()
	{
		if(a == -1 && android.os.Build.VERSION.SDK_INT >= 23)
	//*   0    0:aload_0         
	//*   1    1:getfield        #114 <Field int a>
	//*   2    4:iconst_m1       
	//*   3    5:icmpne          27
	//*   4    8:getstatic       #63  <Field int android.os.Build$VERSION.SDK_INT>
	//*   5   11:bipush          23
	//*   6   13:icmplt          27
			return b((Icon)b);
	//    7   16:aload_0         
	//    8   17:getfield        #116 <Field Object b>
	//    9   20:checkcast       #65  <Class Icon>
	//   10   23:invokestatic    #196 <Method int b(Icon)>
	//   11   26:ireturn         
		if(a == 2)
	//*  12   27:aload_0         
	//*  13   28:getfield        #114 <Field int a>
	//*  14   31:iconst_2        
	//*  15   32:icmpne          40
		{
			return e;
	//   16   35:aload_0         
	//   17   36:getfield        #198 <Field int e>
	//   18   39:ireturn         
		} else
		{
			StringBuilder stringbuilder = new StringBuilder();
	//   19   40:new             #126 <Class StringBuilder>
	//   20   43:dup             
	//   21   44:invokespecial   #127 <Method void StringBuilder()>
	//   22   47:astore_1        
			stringbuilder.append("called getResId() on ");
	//   23   48:aload_1         
	//   24   49:ldc1            #200 <String "called getResId() on ">
	//   25   51:invokevirtual   #133 <Method StringBuilder StringBuilder.append(String)>
	//   26   54:pop             
			stringbuilder.append(((Object) (this)));
	//   27   55:aload_1         
	//   28   56:aload_0         
	//   29   57:invokevirtual   #136 <Method StringBuilder StringBuilder.append(Object)>
	//   30   60:pop             
			throw new IllegalStateException(stringbuilder.toString());
	//   31   61:new             #138 <Class IllegalStateException>
	//   32   64:dup             
	//   33   65:aload_1         
	//   34   66:invokevirtual   #141 <Method String StringBuilder.toString()>
	//   35   69:invokespecial   #144 <Method void IllegalStateException(String)>
	//   36   72:athrow          
		}
	}

	public void c()
	{
		i = android.graphics.PorterDuff.Mode.valueOf(j);
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #150 <Field String j>
	//    3    5:invokestatic    #204 <Method android.graphics.PorterDuff$Mode android.graphics.PorterDuff$Mode.valueOf(String)>
	//    4    8:putfield        #38  <Field android.graphics.PorterDuff$Mode i>
		int k = a;
	//    5   11:aload_0         
	//    6   12:getfield        #114 <Field int a>
	//    7   15:istore_1        
		if(k != -1)
	//*   8   16:iload_1         
	//*   9   17:iconst_m1       
	//*  10   18:icmpeq          129
		{
			Parcelable parcelable;
			switch(k)
	//*  11   21:iload_1         
			{
	//*  12   22:tableswitch     1 5: default 56
	//	               1 87
	//	               2 66
	//	               3 57
	//	               4 66
	//	               5 87
			default:
				return;
	//   13   56:return          

			case 3: // '\003'
				b = ((Object) (c));
	//   14   57:aload_0         
	//   15   58:aload_0         
	//   16   59:getfield        #165 <Field byte[] c>
	//   17   62:putfield        #116 <Field Object b>
				return;
	//   18   65:return          

			case 2: // '\002'
			case 4: // '\004'
				b = ((Object) (new String(c, Charset.forName("UTF-16"))));
	//   19   66:aload_0         
	//   20   67:new             #90  <Class String>
	//   21   70:dup             
	//   22   71:aload_0         
	//   23   72:getfield        #165 <Field byte[] c>
	//   24   75:ldc1            #153 <String "UTF-16">
	//   25   77:invokestatic    #159 <Method Charset Charset.forName(String)>
	//   26   80:invokespecial   #207 <Method void String(byte[], Charset)>
	//   27   83:putfield        #116 <Field Object b>
				return;
	//   28   86:return          

			case 1: // '\001'
			case 5: // '\005'
				parcelable = d;
	//   29   87:aload_0         
	//   30   88:getfield        #189 <Field Parcelable d>
	//   31   91:astore_2        
				break;
			}
			if(parcelable != null)
	//*  32   92:aload_2         
	//*  33   93:ifnull          102
			{
				b = ((Object) (parcelable));
	//   34   96:aload_0         
	//   35   97:aload_2         
	//   36   98:putfield        #116 <Field Object b>
				return;
	//   37  101:return          
			} else
			{
				byte abyte0[] = c;
	//   38  102:aload_0         
	//   39  103:getfield        #165 <Field byte[] c>
	//   40  106:astore_2        
				b = ((Object) (abyte0));
	//   41  107:aload_0         
	//   42  108:aload_2         
	//   43  109:putfield        #116 <Field Object b>
				a = 3;
	//   44  112:aload_0         
	//   45  113:iconst_3        
	//   46  114:putfield        #114 <Field int a>
				e = 0;
	//   47  117:aload_0         
	//   48  118:iconst_0        
	//   49  119:putfield        #198 <Field int e>
				f = abyte0.length;
	//   50  122:aload_0         
	//   51  123:aload_2         
	//   52  124:arraylength     
	//   53  125:putfield        #209 <Field int f>
				return;
	//   54  128:return          
			}
		}
		Parcelable parcelable1 = d;
	//   55  129:aload_0         
	//   56  130:getfield        #189 <Field Parcelable d>
	//   57  133:astore_2        
		if(parcelable1 != null)
	//*  58  134:aload_2         
	//*  59  135:ifnull          144
		{
			b = ((Object) (parcelable1));
	//   60  138:aload_0         
	//   61  139:aload_2         
	//   62  140:putfield        #116 <Field Object b>
			return;
	//   63  143:return          
		} else
		{
			throw new IllegalArgumentException("Invalid icon");
	//   64  144:new             #191 <Class IllegalArgumentException>
	//   65  147:dup             
	//   66  148:ldc1            #211 <String "Invalid icon">
	//   67  150:invokespecial   #194 <Method void IllegalArgumentException(String)>
	//   68  153:athrow          
		}
	}

	public String toString()
	{
		if(a == -1)
	//*   0    0:aload_0         
	//*   1    1:getfield        #114 <Field int a>
	//*   2    4:iconst_m1       
	//*   3    5:icmpne          16
			return String.valueOf(b);
	//    4    8:aload_0         
	//    5    9:getfield        #116 <Field Object b>
	//    6   12:invokestatic    #214 <Method String String.valueOf(Object)>
	//    7   15:areturn         
		StringBuilder stringbuilder = new StringBuilder("Icon(typ=");
	//    8   16:new             #126 <Class StringBuilder>
	//    9   19:dup             
	//   10   20:ldc1            #216 <String "Icon(typ=">
	//   11   22:invokespecial   #217 <Method void StringBuilder(String)>
	//   12   25:astore_1        
		stringbuilder.append(a(a));
	//   13   26:aload_1         
	//   14   27:aload_0         
	//   15   28:getfield        #114 <Field int a>
	//   16   31:invokestatic    #219 <Method String a(int)>
	//   17   34:invokevirtual   #133 <Method StringBuilder StringBuilder.append(String)>
	//   18   37:pop             
		switch(a)
	//*  19   38:aload_0         
	//*  20   39:getfield        #114 <Field int a>
		{
	//*  21   42:tableswitch     1 5: default 76
	//	               1 190
	//	               2 140
	//	               3 98
	//	               4 79
	//	               5 190
	//*  22   76:goto            234
		case 4: // '\004'
			stringbuilder.append(" uri=");
	//   23   79:aload_1         
	//   24   80:ldc1            #221 <String " uri=">
	//   25   82:invokevirtual   #133 <Method StringBuilder StringBuilder.append(String)>
	//   26   85:pop             
			stringbuilder.append(b);
	//   27   86:aload_1         
	//   28   87:aload_0         
	//   29   88:getfield        #116 <Field Object b>
	//   30   91:invokevirtual   #136 <Method StringBuilder StringBuilder.append(Object)>
	//   31   94:pop             
			break;

	//*  32   95:goto            234
		case 3: // '\003'
			stringbuilder.append(" len=");
	//   33   98:aload_1         
	//   34   99:ldc1            #223 <String " len=">
	//   35  101:invokevirtual   #133 <Method StringBuilder StringBuilder.append(String)>
	//   36  104:pop             
			stringbuilder.append(e);
	//   37  105:aload_1         
	//   38  106:aload_0         
	//   39  107:getfield        #198 <Field int e>
	//   40  110:invokevirtual   #226 <Method StringBuilder StringBuilder.append(int)>
	//   41  113:pop             
			if(f != 0)
	//*  42  114:aload_0         
	//*  43  115:getfield        #209 <Field int f>
	//*  44  118:ifeq            234
			{
				stringbuilder.append(" off=");
	//   45  121:aload_1         
	//   46  122:ldc1            #228 <String " off=">
	//   47  124:invokevirtual   #133 <Method StringBuilder StringBuilder.append(String)>
	//   48  127:pop             
				stringbuilder.append(f);
	//   49  128:aload_1         
	//   50  129:aload_0         
	//   51  130:getfield        #209 <Field int f>
	//   52  133:invokevirtual   #226 <Method StringBuilder StringBuilder.append(int)>
	//   53  136:pop             
			}
			break;

	//*  54  137:goto            234
		case 2: // '\002'
			stringbuilder.append(" pkg=");
	//   55  140:aload_1         
	//   56  141:ldc1            #230 <String " pkg=">
	//   57  143:invokevirtual   #133 <Method StringBuilder StringBuilder.append(String)>
	//   58  146:pop             
			stringbuilder.append(a());
	//   59  147:aload_1         
	//   60  148:aload_0         
	//   61  149:invokevirtual   #232 <Method String a()>
	//   62  152:invokevirtual   #133 <Method StringBuilder StringBuilder.append(String)>
	//   63  155:pop             
			stringbuilder.append(" id=");
	//   64  156:aload_1         
	//   65  157:ldc1            #234 <String " id=">
	//   66  159:invokevirtual   #133 <Method StringBuilder StringBuilder.append(String)>
	//   67  162:pop             
			stringbuilder.append(String.format("0x%08x", new Object[] {
				Integer.valueOf(b())
			}));
	//   68  163:aload_1         
	//   69  164:ldc1            #236 <String "0x%08x">
	//   70  166:iconst_1        
	//   71  167:anewarray       Object[]
	//   72  170:dup             
	//   73  171:iconst_0        
	//   74  172:aload_0         
	//   75  173:invokevirtual   #238 <Method int b()>
	//   76  176:invokestatic    #241 <Method Integer Integer.valueOf(int)>
	//   77  179:aastore         
	//   78  180:invokestatic    #245 <Method String String.format(String, Object[])>
	//   79  183:invokevirtual   #133 <Method StringBuilder StringBuilder.append(String)>
	//   80  186:pop             
			break;

	//*  81  187:goto            234
		case 1: // '\001'
		case 5: // '\005'
			stringbuilder.append(" size=");
	//   82  190:aload_1         
	//   83  191:ldc1            #247 <String " size=">
	//   84  193:invokevirtual   #133 <Method StringBuilder StringBuilder.append(String)>
	//   85  196:pop             
			stringbuilder.append(((Bitmap)b).getWidth());
	//   86  197:aload_1         
	//   87  198:aload_0         
	//   88  199:getfield        #116 <Field Object b>
	//   89  202:checkcast       #168 <Class Bitmap>
	//   90  205:invokevirtual   #250 <Method int Bitmap.getWidth()>
	//   91  208:invokevirtual   #226 <Method StringBuilder StringBuilder.append(int)>
	//   92  211:pop             
			stringbuilder.append("x");
	//   93  212:aload_1         
	//   94  213:ldc1            #252 <String "x">
	//   95  215:invokevirtual   #133 <Method StringBuilder StringBuilder.append(String)>
	//   96  218:pop             
			stringbuilder.append(((Bitmap)b).getHeight());
	//   97  219:aload_1         
	//   98  220:aload_0         
	//   99  221:getfield        #116 <Field Object b>
	//  100  224:checkcast       #168 <Class Bitmap>
	//  101  227:invokevirtual   #255 <Method int Bitmap.getHeight()>
	//  102  230:invokevirtual   #226 <Method StringBuilder StringBuilder.append(int)>
	//  103  233:pop             
			break;
		}
		if(g != null)
	//* 104  234:aload_0         
	//* 105  235:getfield        #36  <Field ColorStateList g>
	//* 106  238:ifnull          258
		{
			stringbuilder.append(" tint=");
	//  107  241:aload_1         
	//  108  242:ldc2            #257 <String " tint=">
	//  109  245:invokevirtual   #133 <Method StringBuilder StringBuilder.append(String)>
	//  110  248:pop             
			stringbuilder.append(((Object) (g)));
	//  111  249:aload_1         
	//  112  250:aload_0         
	//  113  251:getfield        #36  <Field ColorStateList g>
	//  114  254:invokevirtual   #136 <Method StringBuilder StringBuilder.append(Object)>
	//  115  257:pop             
		}
		if(i != h)
	//* 116  258:aload_0         
	//* 117  259:getfield        #38  <Field android.graphics.PorterDuff$Mode i>
	//* 118  262:getstatic       #30  <Field android.graphics.PorterDuff$Mode h>
	//* 119  265:if_acmpeq       285
		{
			stringbuilder.append(" mode=");
	//  120  268:aload_1         
	//  121  269:ldc2            #259 <String " mode=">
	//  122  272:invokevirtual   #133 <Method StringBuilder StringBuilder.append(String)>
	//  123  275:pop             
			stringbuilder.append(((Object) (i)));
	//  124  276:aload_1         
	//  125  277:aload_0         
	//  126  278:getfield        #38  <Field android.graphics.PorterDuff$Mode i>
	//  127  281:invokevirtual   #136 <Method StringBuilder StringBuilder.append(Object)>
	//  128  284:pop             
		}
		stringbuilder.append(")");
	//  129  285:aload_1         
	//  130  286:ldc2            #261 <String ")">
	//  131  289:invokevirtual   #133 <Method StringBuilder StringBuilder.append(String)>
	//  132  292:pop             
		return stringbuilder.toString();
	//  133  293:aload_1         
	//  134  294:invokevirtual   #141 <Method String StringBuilder.toString()>
	//  135  297:areturn         
	}

	static final android.graphics.PorterDuff.Mode h;
	public int a;
	Object b;
	public byte c[];
	public Parcelable d;
	public int e;
	public int f;
	public ColorStateList g;
	android.graphics.PorterDuff.Mode i;
	public String j;

	static 
	{
		h = android.graphics.PorterDuff.Mode.SRC_IN;
	//    0    0:getstatic       #28  <Field android.graphics.PorterDuff$Mode android.graphics.PorterDuff$Mode.SRC_IN>
	//    1    3:putstatic       #30  <Field android.graphics.PorterDuff$Mode h>
	//*   2    6:return          
	}
}
