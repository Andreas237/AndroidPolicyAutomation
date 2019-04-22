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
import java.lang.annotation.Annotation;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.charset.Charset;

public class IconCompat extends CustomVersionedParcelable
{
	public static interface IconType
		extends Annotation
	{
	}


	public IconCompat()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #41  <Method void CustomVersionedParcelable()>
		mTintList = null;
	//    2    4:aload_0         
	//    3    5:aconst_null     
	//    4    6:putfield        #43  <Field ColorStateList mTintList>
		mTintMode = DEFAULT_TINT_MODE;
	//    5    9:aload_0         
	//    6   10:getstatic       #37  <Field android.graphics.PorterDuff$Mode DEFAULT_TINT_MODE>
	//    7   13:putfield        #45  <Field android.graphics.PorterDuff$Mode mTintMode>
	//    8   16:return          
	}

	private static int getResId(Icon icon)
	{
		if(android.os.Build.VERSION.SDK_INT >= 28)
	//*   0    0:getstatic       #64  <Field int android.os.Build$VERSION.SDK_INT>
	//*   1    3:bipush          28
	//*   2    5:icmplt          13
			return icon.getResId();
	//    3    8:aload_0         
	//    4    9:invokevirtual   #69  <Method int Icon.getResId()>
	//    5   12:ireturn         
		int i;
		try
		{
			i = ((Integer)((Object) (icon)).getClass().getMethod("getResId", new Class[0]).invoke(((Object) (icon)), new Object[0])).intValue();
	//    6   13:aload_0         
	//    7   14:invokevirtual   #75  <Method Class Object.getClass()>
	//    8   17:ldc1            #76  <String "getResId">
	//    9   19:iconst_0        
	//   10   20:anewarray       Class[]
	//   11   23:invokevirtual   #82  <Method Method Class.getMethod(String, Class[])>
	//   12   26:aload_0         
	//   13   27:iconst_0        
	//   14   28:anewarray       Object[]
	//   15   31:invokevirtual   #88  <Method Object Method.invoke(Object, Object[])>
	//   16   34:checkcast       #90  <Class Integer>
	//   17   37:invokevirtual   #93  <Method int Integer.intValue()>
	//   18   40:istore_1        
		}
	//*  19   41:iload_1         
	//*  20   42:ireturn         
	//*  21   43:astore_0        
	//*  22   44:ldc1            #95  <String "IconCompat">
	//*  23   46:ldc1            #97  <String "Unable to get icon resource">
	//*  24   48:aload_0         
	//*  25   49:invokestatic    #103 <Method int Log.e(String, String, Throwable)>
	//*  26   52:pop             
	//*  27   53:iconst_0        
	//*  28   54:ireturn         
	//*  29   55:astore_0        
	//*  30   56:ldc1            #95  <String "IconCompat">
	//*  31   58:ldc1            #97  <String "Unable to get icon resource">
	//*  32   60:aload_0         
	//*  33   61:invokestatic    #103 <Method int Log.e(String, String, Throwable)>
	//*  34   64:pop             
	//*  35   65:iconst_0        
	//*  36   66:ireturn         
		// Misplaced declaration of an exception variable
		catch(Icon icon)
	//*  37   67:astore_0        
		{
			Log.e("IconCompat", "Unable to get icon resource", ((Throwable) (icon)));
	//   38   68:ldc1            #95  <String "IconCompat">
	//   39   70:ldc1            #97  <String "Unable to get icon resource">
	//   40   72:aload_0         
	//   41   73:invokestatic    #103 <Method int Log.e(String, String, Throwable)>
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
		return i;
	}

	private static String getResPackage(Icon icon)
	{
		if(android.os.Build.VERSION.SDK_INT >= 28)
	//*   0    0:getstatic       #64  <Field int android.os.Build$VERSION.SDK_INT>
	//*   1    3:bipush          28
	//*   2    5:icmplt          13
			return icon.getResPackage();
	//    3    8:aload_0         
	//    4    9:invokevirtual   #110 <Method String Icon.getResPackage()>
	//    5   12:areturn         
		try
		{
			icon = ((Icon) ((String)((Object) (icon)).getClass().getMethod("getResPackage", new Class[0]).invoke(((Object) (icon)), new Object[0])));
	//    6   13:aload_0         
	//    7   14:invokevirtual   #75  <Method Class Object.getClass()>
	//    8   17:ldc1            #111 <String "getResPackage">
	//    9   19:iconst_0        
	//   10   20:anewarray       Class[]
	//   11   23:invokevirtual   #82  <Method Method Class.getMethod(String, Class[])>
	//   12   26:aload_0         
	//   13   27:iconst_0        
	//   14   28:anewarray       Object[]
	//   15   31:invokevirtual   #88  <Method Object Method.invoke(Object, Object[])>
	//   16   34:checkcast       #113 <Class String>
	//   17   37:astore_0        
		}
	//*  18   38:aload_0         
	//*  19   39:areturn         
	//*  20   40:astore_0        
	//*  21   41:ldc1            #95  <String "IconCompat">
	//*  22   43:ldc1            #115 <String "Unable to get icon package">
	//*  23   45:aload_0         
	//*  24   46:invokestatic    #103 <Method int Log.e(String, String, Throwable)>
	//*  25   49:pop             
	//*  26   50:aconst_null     
	//*  27   51:areturn         
	//*  28   52:astore_0        
	//*  29   53:ldc1            #95  <String "IconCompat">
	//*  30   55:ldc1            #115 <String "Unable to get icon package">
	//*  31   57:aload_0         
	//*  32   58:invokestatic    #103 <Method int Log.e(String, String, Throwable)>
	//*  33   61:pop             
	//*  34   62:aconst_null     
	//*  35   63:areturn         
		// Misplaced declaration of an exception variable
		catch(Icon icon)
	//*  36   64:astore_0        
		{
			Log.e("IconCompat", "Unable to get icon package", ((Throwable) (icon)));
	//   37   65:ldc1            #95  <String "IconCompat">
	//   38   67:ldc1            #115 <String "Unable to get icon package">
	//   39   69:aload_0         
	//   40   70:invokestatic    #103 <Method int Log.e(String, String, Throwable)>
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

	private static String typeToString(int i)
	{
		switch(i)
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
	//    2   36:ldc1            #119 <String "UNKNOWN">
	//    3   38:areturn         

		case 5: // '\005'
			return "BITMAP_MASKABLE";
	//    4   39:ldc1            #121 <String "BITMAP_MASKABLE">
	//    5   41:areturn         

		case 4: // '\004'
			return "URI";
	//    6   42:ldc1            #123 <String "URI">
	//    7   44:areturn         

		case 3: // '\003'
			return "DATA";
	//    8   45:ldc1            #125 <String "DATA">
	//    9   47:areturn         

		case 2: // '\002'
			return "RESOURCE";
	//   10   48:ldc1            #127 <String "RESOURCE">
	//   11   50:areturn         

		case 1: // '\001'
			return "BITMAP";
	//   12   51:ldc1            #129 <String "BITMAP">
	//   13   53:areturn         
		}
	}

	public int getResId()
	{
		if(mType == -1 && android.os.Build.VERSION.SDK_INT >= 23)
	//*   0    0:aload_0         
	//*   1    1:getfield        #131 <Field int mType>
	//*   2    4:iconst_m1       
	//*   3    5:icmpne          27
	//*   4    8:getstatic       #64  <Field int android.os.Build$VERSION.SDK_INT>
	//*   5   11:bipush          23
	//*   6   13:icmplt          27
			return getResId((Icon)mObj1);
	//    7   16:aload_0         
	//    8   17:getfield        #133 <Field Object mObj1>
	//    9   20:checkcast       #66  <Class Icon>
	//   10   23:invokestatic    #135 <Method int getResId(Icon)>
	//   11   26:ireturn         
		if(mType == 2)
	//*  12   27:aload_0         
	//*  13   28:getfield        #131 <Field int mType>
	//*  14   31:iconst_2        
	//*  15   32:icmpne          40
		{
			return mInt1;
	//   16   35:aload_0         
	//   17   36:getfield        #137 <Field int mInt1>
	//   18   39:ireturn         
		} else
		{
			StringBuilder stringbuilder = new StringBuilder();
	//   19   40:new             #139 <Class StringBuilder>
	//   20   43:dup             
	//   21   44:invokespecial   #140 <Method void StringBuilder()>
	//   22   47:astore_1        
			stringbuilder.append("called getResId() on ");
	//   23   48:aload_1         
	//   24   49:ldc1            #142 <String "called getResId() on ">
	//   25   51:invokevirtual   #146 <Method StringBuilder StringBuilder.append(String)>
	//   26   54:pop             
			stringbuilder.append(((Object) (this)));
	//   27   55:aload_1         
	//   28   56:aload_0         
	//   29   57:invokevirtual   #149 <Method StringBuilder StringBuilder.append(Object)>
	//   30   60:pop             
			throw new IllegalStateException(stringbuilder.toString());
	//   31   61:new             #151 <Class IllegalStateException>
	//   32   64:dup             
	//   33   65:aload_1         
	//   34   66:invokevirtual   #154 <Method String StringBuilder.toString()>
	//   35   69:invokespecial   #157 <Method void IllegalStateException(String)>
	//   36   72:athrow          
		}
	}

	public String getResPackage()
	{
		if(mType == -1 && android.os.Build.VERSION.SDK_INT >= 23)
	//*   0    0:aload_0         
	//*   1    1:getfield        #131 <Field int mType>
	//*   2    4:iconst_m1       
	//*   3    5:icmpne          27
	//*   4    8:getstatic       #64  <Field int android.os.Build$VERSION.SDK_INT>
	//*   5   11:bipush          23
	//*   6   13:icmplt          27
			return getResPackage((Icon)mObj1);
	//    7   16:aload_0         
	//    8   17:getfield        #133 <Field Object mObj1>
	//    9   20:checkcast       #66  <Class Icon>
	//   10   23:invokestatic    #159 <Method String getResPackage(Icon)>
	//   11   26:areturn         
		if(mType == 2)
	//*  12   27:aload_0         
	//*  13   28:getfield        #131 <Field int mType>
	//*  14   31:iconst_2        
	//*  15   32:icmpne          51
		{
			return ((String)mObj1).split(":", -1)[0];
	//   16   35:aload_0         
	//   17   36:getfield        #133 <Field Object mObj1>
	//   18   39:checkcast       #113 <Class String>
	//   19   42:ldc1            #161 <String ":">
	//   20   44:iconst_m1       
	//   21   45:invokevirtual   #165 <Method String[] String.split(String, int)>
	//   22   48:iconst_0        
	//   23   49:aaload          
	//   24   50:areturn         
		} else
		{
			StringBuilder stringbuilder = new StringBuilder();
	//   25   51:new             #139 <Class StringBuilder>
	//   26   54:dup             
	//   27   55:invokespecial   #140 <Method void StringBuilder()>
	//   28   58:astore_1        
			stringbuilder.append("called getResPackage() on ");
	//   29   59:aload_1         
	//   30   60:ldc1            #167 <String "called getResPackage() on ">
	//   31   62:invokevirtual   #146 <Method StringBuilder StringBuilder.append(String)>
	//   32   65:pop             
			stringbuilder.append(((Object) (this)));
	//   33   66:aload_1         
	//   34   67:aload_0         
	//   35   68:invokevirtual   #149 <Method StringBuilder StringBuilder.append(Object)>
	//   36   71:pop             
			throw new IllegalStateException(stringbuilder.toString());
	//   37   72:new             #151 <Class IllegalStateException>
	//   38   75:dup             
	//   39   76:aload_1         
	//   40   77:invokevirtual   #154 <Method String StringBuilder.toString()>
	//   41   80:invokespecial   #157 <Method void IllegalStateException(String)>
	//   42   83:athrow          
		}
	}

	public void onPostParceling()
	{
		mTintMode = android.graphics.PorterDuff.Mode.valueOf(mTintModeStr);
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #170 <Field String mTintModeStr>
	//    3    5:invokestatic    #174 <Method android.graphics.PorterDuff$Mode android.graphics.PorterDuff$Mode.valueOf(String)>
	//    4    8:putfield        #45  <Field android.graphics.PorterDuff$Mode mTintMode>
		int i = mType;
	//    5   11:aload_0         
	//    6   12:getfield        #131 <Field int mType>
	//    7   15:istore_1        
		if(i != -1)
	//*   8   16:iload_1         
	//*   9   17:iconst_m1       
	//*  10   18:icmpeq          129
		{
			Parcelable parcelable;
			switch(i)
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
				mObj1 = ((Object) (mData));
	//   14   57:aload_0         
	//   15   58:aload_0         
	//   16   59:getfield        #176 <Field byte[] mData>
	//   17   62:putfield        #133 <Field Object mObj1>
				return;
	//   18   65:return          

			case 2: // '\002'
			case 4: // '\004'
				mObj1 = ((Object) (new String(mData, Charset.forName("UTF-16"))));
	//   19   66:aload_0         
	//   20   67:new             #113 <Class String>
	//   21   70:dup             
	//   22   71:aload_0         
	//   23   72:getfield        #176 <Field byte[] mData>
	//   24   75:ldc1            #178 <String "UTF-16">
	//   25   77:invokestatic    #184 <Method Charset Charset.forName(String)>
	//   26   80:invokespecial   #187 <Method void String(byte[], Charset)>
	//   27   83:putfield        #133 <Field Object mObj1>
				return;
	//   28   86:return          

			case 1: // '\001'
			case 5: // '\005'
				parcelable = mParcelable;
	//   29   87:aload_0         
	//   30   88:getfield        #189 <Field Parcelable mParcelable>
	//   31   91:astore_2        
				break;
			}
			if(parcelable != null)
	//*  32   92:aload_2         
	//*  33   93:ifnull          102
			{
				mObj1 = ((Object) (parcelable));
	//   34   96:aload_0         
	//   35   97:aload_2         
	//   36   98:putfield        #133 <Field Object mObj1>
				return;
	//   37  101:return          
			} else
			{
				byte abyte0[] = mData;
	//   38  102:aload_0         
	//   39  103:getfield        #176 <Field byte[] mData>
	//   40  106:astore_2        
				mObj1 = ((Object) (abyte0));
	//   41  107:aload_0         
	//   42  108:aload_2         
	//   43  109:putfield        #133 <Field Object mObj1>
				mType = 3;
	//   44  112:aload_0         
	//   45  113:iconst_3        
	//   46  114:putfield        #131 <Field int mType>
				mInt1 = 0;
	//   47  117:aload_0         
	//   48  118:iconst_0        
	//   49  119:putfield        #137 <Field int mInt1>
				mInt2 = abyte0.length;
	//   50  122:aload_0         
	//   51  123:aload_2         
	//   52  124:arraylength     
	//   53  125:putfield        #191 <Field int mInt2>
				return;
	//   54  128:return          
			}
		}
		Parcelable parcelable1 = mParcelable;
	//   55  129:aload_0         
	//   56  130:getfield        #189 <Field Parcelable mParcelable>
	//   57  133:astore_2        
		if(parcelable1 != null)
	//*  58  134:aload_2         
	//*  59  135:ifnull          144
		{
			mObj1 = ((Object) (parcelable1));
	//   60  138:aload_0         
	//   61  139:aload_2         
	//   62  140:putfield        #133 <Field Object mObj1>
			return;
	//   63  143:return          
		} else
		{
			throw new IllegalArgumentException("Invalid icon");
	//   64  144:new             #193 <Class IllegalArgumentException>
	//   65  147:dup             
	//   66  148:ldc1            #195 <String "Invalid icon">
	//   67  150:invokespecial   #196 <Method void IllegalArgumentException(String)>
	//   68  153:athrow          
		}
	}

	public void onPreParceling(boolean flag)
	{
		mTintModeStr = mTintMode.name();
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #45  <Field android.graphics.PorterDuff$Mode mTintMode>
	//    3    5:invokevirtual   #201 <Method String android.graphics.PorterDuff$Mode.name()>
	//    4    8:putfield        #170 <Field String mTintModeStr>
		int i = mType;
	//    5   11:aload_0         
	//    6   12:getfield        #131 <Field int mType>
	//    7   15:istore_2        
		if(i != -1)
	//*   8   16:iload_2         
	//*   9   17:iconst_m1       
	//*  10   18:icmpeq          164
		{
			switch(i)
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
				mData = mObj1.toString().getBytes(Charset.forName("UTF-16"));
	//   14   57:aload_0         
	//   15   58:aload_0         
	//   16   59:getfield        #133 <Field Object mObj1>
	//   17   62:invokevirtual   #202 <Method String Object.toString()>
	//   18   65:ldc1            #178 <String "UTF-16">
	//   19   67:invokestatic    #184 <Method Charset Charset.forName(String)>
	//   20   70:invokevirtual   #206 <Method byte[] String.getBytes(Charset)>
	//   21   73:putfield        #176 <Field byte[] mData>
				return;
	//   22   76:return          

			case 3: // '\003'
				mData = (byte[])mObj1;
	//   23   77:aload_0         
	//   24   78:aload_0         
	//   25   79:getfield        #133 <Field Object mObj1>
	//   26   82:checkcast       #207 <Class byte[]>
	//   27   85:putfield        #176 <Field byte[] mData>
				return;
	//   28   88:return          

			case 2: // '\002'
				mData = ((String)mObj1).getBytes(Charset.forName("UTF-16"));
	//   29   89:aload_0         
	//   30   90:aload_0         
	//   31   91:getfield        #133 <Field Object mObj1>
	//   32   94:checkcast       #113 <Class String>
	//   33   97:ldc1            #178 <String "UTF-16">
	//   34   99:invokestatic    #184 <Method Charset Charset.forName(String)>
	//   35  102:invokevirtual   #206 <Method byte[] String.getBytes(Charset)>
	//   36  105:putfield        #176 <Field byte[] mData>
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
				Bitmap bitmap = (Bitmap)mObj1;
	//   40  113:aload_0         
	//   41  114:getfield        #133 <Field Object mObj1>
	//   42  117:checkcast       #209 <Class Bitmap>
	//   43  120:astore_3        
				ByteArrayOutputStream bytearrayoutputstream = new ByteArrayOutputStream();
	//   44  121:new             #211 <Class ByteArrayOutputStream>
	//   45  124:dup             
	//   46  125:invokespecial   #212 <Method void ByteArrayOutputStream()>
	//   47  128:astore          4
				bitmap.compress(android.graphics.Bitmap.CompressFormat.PNG, 90, ((java.io.OutputStream) (bytearrayoutputstream)));
	//   48  130:aload_3         
	//   49  131:getstatic       #218 <Field android.graphics.Bitmap$CompressFormat android.graphics.Bitmap$CompressFormat.PNG>
	//   50  134:bipush          90
	//   51  136:aload           4
	//   52  138:invokevirtual   #222 <Method boolean Bitmap.compress(android.graphics.Bitmap$CompressFormat, int, java.io.OutputStream)>
	//   53  141:pop             
				mData = bytearrayoutputstream.toByteArray();
	//   54  142:aload_0         
	//   55  143:aload           4
	//   56  145:invokevirtual   #226 <Method byte[] ByteArrayOutputStream.toByteArray()>
	//   57  148:putfield        #176 <Field byte[] mData>
				return;
	//   58  151:return          
			} else
			{
				mParcelable = (Parcelable)mObj1;
	//   59  152:aload_0         
	//   60  153:aload_0         
	//   61  154:getfield        #133 <Field Object mObj1>
	//   62  157:checkcast       #228 <Class Parcelable>
	//   63  160:putfield        #189 <Field Parcelable mParcelable>
				return;
	//   64  163:return          
			}
		}
		if(!flag)
	//*  65  164:iload_1         
	//*  66  165:ifne            180
		{
			mParcelable = (Parcelable)mObj1;
	//   67  168:aload_0         
	//   68  169:aload_0         
	//   69  170:getfield        #133 <Field Object mObj1>
	//   70  173:checkcast       #228 <Class Parcelable>
	//   71  176:putfield        #189 <Field Parcelable mParcelable>
			return;
	//   72  179:return          
		} else
		{
			throw new IllegalArgumentException("Can't serialize Icon created with IconCompat#createFromIcon");
	//   73  180:new             #193 <Class IllegalArgumentException>
	//   74  183:dup             
	//   75  184:ldc1            #230 <String "Can't serialize Icon created with IconCompat#createFromIcon">
	//   76  186:invokespecial   #196 <Method void IllegalArgumentException(String)>
	//   77  189:athrow          
		}
	}

	public String toString()
	{
		if(mType == -1)
	//*   0    0:aload_0         
	//*   1    1:getfield        #131 <Field int mType>
	//*   2    4:iconst_m1       
	//*   3    5:icmpne          16
			return String.valueOf(mObj1);
	//    4    8:aload_0         
	//    5    9:getfield        #133 <Field Object mObj1>
	//    6   12:invokestatic    #233 <Method String String.valueOf(Object)>
	//    7   15:areturn         
		StringBuilder stringbuilder = new StringBuilder("Icon(typ=");
	//    8   16:new             #139 <Class StringBuilder>
	//    9   19:dup             
	//   10   20:ldc1            #235 <String "Icon(typ=">
	//   11   22:invokespecial   #236 <Method void StringBuilder(String)>
	//   12   25:astore_1        
		stringbuilder.append(typeToString(mType));
	//   13   26:aload_1         
	//   14   27:aload_0         
	//   15   28:getfield        #131 <Field int mType>
	//   16   31:invokestatic    #238 <Method String typeToString(int)>
	//   17   34:invokevirtual   #146 <Method StringBuilder StringBuilder.append(String)>
	//   18   37:pop             
		switch(mType)
	//*  19   38:aload_0         
	//*  20   39:getfield        #131 <Field int mType>
		{
	//*  21   42:tableswitch     1 5: default 76
	//	               1 190
	//	               2 140
	//	               3 98
	//	               4 79
	//	               5 190
	//*  22   76:goto            236
		case 4: // '\004'
			stringbuilder.append(" uri=");
	//   23   79:aload_1         
	//   24   80:ldc1            #240 <String " uri=">
	//   25   82:invokevirtual   #146 <Method StringBuilder StringBuilder.append(String)>
	//   26   85:pop             
			stringbuilder.append(mObj1);
	//   27   86:aload_1         
	//   28   87:aload_0         
	//   29   88:getfield        #133 <Field Object mObj1>
	//   30   91:invokevirtual   #149 <Method StringBuilder StringBuilder.append(Object)>
	//   31   94:pop             
			break;

	//*  32   95:goto            236
		case 3: // '\003'
			stringbuilder.append(" len=");
	//   33   98:aload_1         
	//   34   99:ldc1            #242 <String " len=">
	//   35  101:invokevirtual   #146 <Method StringBuilder StringBuilder.append(String)>
	//   36  104:pop             
			stringbuilder.append(mInt1);
	//   37  105:aload_1         
	//   38  106:aload_0         
	//   39  107:getfield        #137 <Field int mInt1>
	//   40  110:invokevirtual   #245 <Method StringBuilder StringBuilder.append(int)>
	//   41  113:pop             
			if(mInt2 != 0)
	//*  42  114:aload_0         
	//*  43  115:getfield        #191 <Field int mInt2>
	//*  44  118:ifeq            236
			{
				stringbuilder.append(" off=");
	//   45  121:aload_1         
	//   46  122:ldc1            #247 <String " off=">
	//   47  124:invokevirtual   #146 <Method StringBuilder StringBuilder.append(String)>
	//   48  127:pop             
				stringbuilder.append(mInt2);
	//   49  128:aload_1         
	//   50  129:aload_0         
	//   51  130:getfield        #191 <Field int mInt2>
	//   52  133:invokevirtual   #245 <Method StringBuilder StringBuilder.append(int)>
	//   53  136:pop             
			}
			break;

	//*  54  137:goto            236
		case 2: // '\002'
			stringbuilder.append(" pkg=");
	//   55  140:aload_1         
	//   56  141:ldc1            #249 <String " pkg=">
	//   57  143:invokevirtual   #146 <Method StringBuilder StringBuilder.append(String)>
	//   58  146:pop             
			stringbuilder.append(getResPackage());
	//   59  147:aload_1         
	//   60  148:aload_0         
	//   61  149:invokevirtual   #250 <Method String getResPackage()>
	//   62  152:invokevirtual   #146 <Method StringBuilder StringBuilder.append(String)>
	//   63  155:pop             
			stringbuilder.append(" id=");
	//   64  156:aload_1         
	//   65  157:ldc1            #252 <String " id=">
	//   66  159:invokevirtual   #146 <Method StringBuilder StringBuilder.append(String)>
	//   67  162:pop             
			stringbuilder.append(String.format("0x%08x", new Object[] {
				Integer.valueOf(getResId())
			}));
	//   68  163:aload_1         
	//   69  164:ldc1            #254 <String "0x%08x">
	//   70  166:iconst_1        
	//   71  167:anewarray       Object[]
	//   72  170:dup             
	//   73  171:iconst_0        
	//   74  172:aload_0         
	//   75  173:invokevirtual   #255 <Method int getResId()>
	//   76  176:invokestatic    #258 <Method Integer Integer.valueOf(int)>
	//   77  179:aastore         
	//   78  180:invokestatic    #262 <Method String String.format(String, Object[])>
	//   79  183:invokevirtual   #146 <Method StringBuilder StringBuilder.append(String)>
	//   80  186:pop             
			break;

	//*  81  187:goto            236
		case 1: // '\001'
		case 5: // '\005'
			stringbuilder.append(" size=");
	//   82  190:aload_1         
	//   83  191:ldc2            #264 <String " size=">
	//   84  194:invokevirtual   #146 <Method StringBuilder StringBuilder.append(String)>
	//   85  197:pop             
			stringbuilder.append(((Bitmap)mObj1).getWidth());
	//   86  198:aload_1         
	//   87  199:aload_0         
	//   88  200:getfield        #133 <Field Object mObj1>
	//   89  203:checkcast       #209 <Class Bitmap>
	//   90  206:invokevirtual   #267 <Method int Bitmap.getWidth()>
	//   91  209:invokevirtual   #245 <Method StringBuilder StringBuilder.append(int)>
	//   92  212:pop             
			stringbuilder.append("x");
	//   93  213:aload_1         
	//   94  214:ldc2            #269 <String "x">
	//   95  217:invokevirtual   #146 <Method StringBuilder StringBuilder.append(String)>
	//   96  220:pop             
			stringbuilder.append(((Bitmap)mObj1).getHeight());
	//   97  221:aload_1         
	//   98  222:aload_0         
	//   99  223:getfield        #133 <Field Object mObj1>
	//  100  226:checkcast       #209 <Class Bitmap>
	//  101  229:invokevirtual   #272 <Method int Bitmap.getHeight()>
	//  102  232:invokevirtual   #245 <Method StringBuilder StringBuilder.append(int)>
	//  103  235:pop             
			break;
		}
		if(mTintList != null)
	//* 104  236:aload_0         
	//* 105  237:getfield        #43  <Field ColorStateList mTintList>
	//* 106  240:ifnull          260
		{
			stringbuilder.append(" tint=");
	//  107  243:aload_1         
	//  108  244:ldc2            #274 <String " tint=">
	//  109  247:invokevirtual   #146 <Method StringBuilder StringBuilder.append(String)>
	//  110  250:pop             
			stringbuilder.append(((Object) (mTintList)));
	//  111  251:aload_1         
	//  112  252:aload_0         
	//  113  253:getfield        #43  <Field ColorStateList mTintList>
	//  114  256:invokevirtual   #149 <Method StringBuilder StringBuilder.append(Object)>
	//  115  259:pop             
		}
		if(mTintMode != DEFAULT_TINT_MODE)
	//* 116  260:aload_0         
	//* 117  261:getfield        #45  <Field android.graphics.PorterDuff$Mode mTintMode>
	//* 118  264:getstatic       #37  <Field android.graphics.PorterDuff$Mode DEFAULT_TINT_MODE>
	//* 119  267:if_acmpeq       287
		{
			stringbuilder.append(" mode=");
	//  120  270:aload_1         
	//  121  271:ldc2            #276 <String " mode=">
	//  122  274:invokevirtual   #146 <Method StringBuilder StringBuilder.append(String)>
	//  123  277:pop             
			stringbuilder.append(((Object) (mTintMode)));
	//  124  278:aload_1         
	//  125  279:aload_0         
	//  126  280:getfield        #45  <Field android.graphics.PorterDuff$Mode mTintMode>
	//  127  283:invokevirtual   #149 <Method StringBuilder StringBuilder.append(Object)>
	//  128  286:pop             
		}
		stringbuilder.append(")");
	//  129  287:aload_1         
	//  130  288:ldc2            #278 <String ")">
	//  131  291:invokevirtual   #146 <Method StringBuilder StringBuilder.append(String)>
	//  132  294:pop             
		return stringbuilder.toString();
	//  133  295:aload_1         
	//  134  296:invokevirtual   #154 <Method String StringBuilder.toString()>
	//  135  299:areturn         
	}

	static final android.graphics.PorterDuff.Mode DEFAULT_TINT_MODE;
	public byte mData[];
	public int mInt1;
	public int mInt2;
	Object mObj1;
	public Parcelable mParcelable;
	public ColorStateList mTintList;
	android.graphics.PorterDuff.Mode mTintMode;
	public String mTintModeStr;
	public int mType;

	static 
	{
		DEFAULT_TINT_MODE = android.graphics.PorterDuff.Mode.SRC_IN;
	//    0    0:getstatic       #35  <Field android.graphics.PorterDuff$Mode android.graphics.PorterDuff$Mode.SRC_IN>
	//    1    3:putstatic       #37  <Field android.graphics.PorterDuff$Mode DEFAULT_TINT_MODE>
	//*   2    6:return          
	}
}
