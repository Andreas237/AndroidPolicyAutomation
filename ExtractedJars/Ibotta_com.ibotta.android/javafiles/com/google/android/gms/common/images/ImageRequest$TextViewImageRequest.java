// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.common.images;

import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.widget.TextView;
import com.google.android.gms.common.images.internal.CrossFadingDrawable;
import com.google.android.gms.common.internal.Asserts;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.util.PlatformVersion;
import java.lang.ref.WeakReference;

// Referenced classes of package com.google.android.gms.common.images:
//			ImageRequest

public static final class ImageRequest$TextViewImageRequest extends ImageRequest
{

	public final boolean equals(Object obj)
	{
		if(!(obj instanceof ImageRequest$TextViewImageRequest))
	//*   0    0:aload_1         
	//*   1    1:instanceof      #2   <Class ImageRequest$TextViewImageRequest>
	//*   2    4:ifne            9
			return false;
	//    3    7:iconst_0        
	//    4    8:ireturn         
		if(this == obj)
	//*   5    9:aload_0         
	//*   6   10:aload_1         
	//*   7   11:if_acmpne       16
			return true;
	//    8   14:iconst_1        
	//    9   15:ireturn         
		obj = ((Object) ((ImageRequest$TextViewImageRequest)obj));
	//   10   16:aload_1         
	//   11   17:checkcast       #2   <Class ImageRequest$TextViewImageRequest>
	//   12   20:astore_1        
		TextView textview = (TextView)zzpq.get();
	//   13   21:aload_0         
	//   14   22:getfield        #59  <Field WeakReference zzpq>
	//   15   25:invokevirtual   #67  <Method Object WeakReference.get()>
	//   16   28:checkcast       #69  <Class TextView>
	//   17   31:astore_2        
		TextView textview1 = (TextView)((ImageRequest$TextViewImageRequest) (obj)).zzpq.get();
	//   18   32:aload_1         
	//   19   33:getfield        #59  <Field WeakReference zzpq>
	//   20   36:invokevirtual   #67  <Method Object WeakReference.get()>
	//   21   39:checkcast       #69  <Class TextView>
	//   22   42:astore_3        
		return textview1 != null && textview != null && Objects.equal(((Object) (textview1)), ((Object) (textview))) && Objects.equal(((Object) (Integer.valueOf(((ImageRequest$TextViewImageRequest) (obj)).zzpr))), ((Object) (Integer.valueOf(zzpr))));
	//   23   43:aload_3         
	//   24   44:ifnull          81
	//   25   47:aload_2         
	//   26   48:ifnull          81
	//   27   51:aload_3         
	//   28   52:aload_2         
	//   29   53:invokestatic    #75  <Method boolean Objects.equal(Object, Object)>
	//   30   56:ifeq            81
	//   31   59:aload_1         
	//   32   60:getfield        #25  <Field int zzpr>
	//   33   63:invokestatic    #81  <Method Integer Integer.valueOf(int)>
	//   34   66:aload_0         
	//   35   67:getfield        #25  <Field int zzpr>
	//   36   70:invokestatic    #81  <Method Integer Integer.valueOf(int)>
	//   37   73:invokestatic    #75  <Method boolean Objects.equal(Object, Object)>
	//   38   76:ifeq            81
	//   39   79:iconst_1        
	//   40   80:ireturn         
	//   41   81:iconst_0        
	//   42   82:ireturn         
	}

	public final int hashCode()
	{
		return Objects.hashCode(new Object[] {
			Integer.valueOf(zzpr)
		});
	//    0    0:iconst_1        
	//    1    1:anewarray       Object[]
	//    2    4:dup             
	//    3    5:iconst_0        
	//    4    6:aload_0         
	//    5    7:getfield        #25  <Field int zzpr>
	//    6   10:invokestatic    #81  <Method Integer Integer.valueOf(int)>
	//    7   13:aastore         
	//    8   14:invokestatic    #88  <Method int Objects.hashCode(Object[])>
	//    9   17:ireturn         
	}

	protected final void loadImage(Drawable drawable, boolean flag, boolean flag1, boolean flag2)
	{
		TextView textview = (TextView)zzpq.get();
	//    0    0:aload_0         
	//    1    1:getfield        #59  <Field WeakReference zzpq>
	//    2    4:invokevirtual   #67  <Method Object WeakReference.get()>
	//    3    7:checkcast       #69  <Class TextView>
	//    4   10:astore          10
		if(textview != null)
	//*   5   12:aload           10
	//*   6   14:ifnull          197
		{
			int i = zzpr;
	//    7   17:aload_0         
	//    8   18:getfield        #25  <Field int zzpr>
	//    9   21:istore          5
			flag = ((ImageRequest)this).shouldCrossFade(flag, flag1);
	//   10   23:aload_0         
	//   11   24:iload_2         
	//   12   25:iload_3         
	//   13   26:invokevirtual   #94  <Method boolean ImageRequest.shouldCrossFade(boolean, boolean)>
	//   14   29:istore_2        
			Object obj1;
			if(PlatformVersion.isAtLeastJellyBeanMR1())
	//*  15   30:invokestatic    #100 <Method boolean PlatformVersion.isAtLeastJellyBeanMR1()>
	//*  16   33:ifeq            46
				obj1 = ((Object) (textview.getCompoundDrawablesRelative()));
	//   17   36:aload           10
	//   18   38:invokevirtual   #104 <Method Drawable[] TextView.getCompoundDrawablesRelative()>
	//   19   41:astore          7
			else
	//*  20   43:goto            53
				obj1 = ((Object) (textview.getCompoundDrawables()));
	//   21   46:aload           10
	//   22   48:invokevirtual   #107 <Method Drawable[] TextView.getCompoundDrawables()>
	//   23   51:astore          7
			Object obj2 = ((Object) (obj1[i]));
	//   24   53:aload           7
	//   25   55:iload           5
	//   26   57:aaload          
	//   27   58:astore          8
			Object obj = ((Object) (drawable));
	//   28   60:aload_1         
	//   29   61:astore          6
			if(flag)
	//*  30   63:iload_2         
	//*  31   64:ifeq            76
				obj = ((Object) (((ImageRequest)this).createTransitionDrawable(((Drawable) (obj2)), drawable)));
	//   32   67:aload_0         
	//   33   68:aload           8
	//   34   70:aload_1         
	//   35   71:invokevirtual   #111 <Method CrossFadingDrawable ImageRequest.createTransitionDrawable(Drawable, Drawable)>
	//   36   74:astore          6
			if(i == 0)
	//*  37   76:iload           5
	//*  38   78:ifne            87
				drawable = ((Drawable) (obj));
	//   39   81:aload           6
	//   40   83:astore_1        
			else
	//*  41   84:goto            92
				drawable = obj1[0];
	//   42   87:aload           7
	//   43   89:iconst_0        
	//   44   90:aaload          
	//   45   91:astore_1        
			if(i == 1)
	//*  46   92:iload           5
	//*  47   94:iconst_1        
	//*  48   95:icmpne          105
				obj2 = obj;
	//   49   98:aload           6
	//   50  100:astore          8
			else
	//*  51  102:goto            111
				obj2 = ((Object) (obj1[1]));
	//   52  105:aload           7
	//   53  107:iconst_1        
	//   54  108:aaload          
	//   55  109:astore          8
			Object obj3;
			if(i == 2)
	//*  56  111:iload           5
	//*  57  113:iconst_2        
	//*  58  114:icmpne          124
				obj3 = obj;
	//   59  117:aload           6
	//   60  119:astore          9
			else
	//*  61  121:goto            130
				obj3 = ((Object) (obj1[2]));
	//   62  124:aload           7
	//   63  126:iconst_2        
	//   64  127:aaload          
	//   65  128:astore          9
			if(i == 3)
	//*  66  130:iload           5
	//*  67  132:iconst_3        
	//*  68  133:icmpne          143
				obj1 = obj;
	//   69  136:aload           6
	//   70  138:astore          7
			else
	//*  71  140:goto            149
				obj1 = ((Object) (obj1[3]));
	//   72  143:aload           7
	//   73  145:iconst_3        
	//   74  146:aaload          
	//   75  147:astore          7
			if(PlatformVersion.isAtLeastJellyBeanMR1())
	//*  76  149:invokestatic    #100 <Method boolean PlatformVersion.isAtLeastJellyBeanMR1()>
	//*  77  152:ifeq            170
				textview.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, ((Drawable) (obj2)), ((Drawable) (obj3)), ((Drawable) (obj1)));
	//   78  155:aload           10
	//   79  157:aload_1         
	//   80  158:aload           8
	//   81  160:aload           9
	//   82  162:aload           7
	//   83  164:invokevirtual   #115 <Method void TextView.setCompoundDrawablesRelativeWithIntrinsicBounds(Drawable, Drawable, Drawable, Drawable)>
			else
	//*  84  167:goto            182
				textview.setCompoundDrawablesWithIntrinsicBounds(drawable, ((Drawable) (obj2)), ((Drawable) (obj3)), ((Drawable) (obj1)));
	//   85  170:aload           10
	//   86  172:aload_1         
	//   87  173:aload           8
	//   88  175:aload           9
	//   89  177:aload           7
	//   90  179:invokevirtual   #118 <Method void TextView.setCompoundDrawablesWithIntrinsicBounds(Drawable, Drawable, Drawable, Drawable)>
			if(flag)
	//*  91  182:iload_2         
	//*  92  183:ifeq            197
				((CrossFadingDrawable)obj).startTransition(250);
	//   93  186:aload           6
	//   94  188:checkcast       #120 <Class CrossFadingDrawable>
	//   95  191:sipush          250
	//   96  194:invokevirtual   #123 <Method void CrossFadingDrawable.startTransition(int)>
		}
	//   97  197:return          
	}

	public static final int POSITION_BOTTOM = 3;
	public static final int POSITION_END = 2;
	public static final int POSITION_START = 0;
	public static final int POSITION_TOP = 1;
	private WeakReference zzpq;
	private int zzpr;

	public ImageRequest$TextViewImageRequest(TextView textview, int i, int j)
	{
		super(((Uri) (null)), j);
	//    0    0:aload_0         
	//    1    1:aconst_null     
	//    2    2:iload_3         
	//    3    3:invokespecial   #23  <Method void ImageRequest(Uri, int)>
		zzpr = -1;
	//    4    6:aload_0         
	//    5    7:iconst_m1       
	//    6    8:putfield        #25  <Field int zzpr>
		Asserts.checkNotNull(((Object) (textview)));
	//    7   11:aload_1         
	//    8   12:invokestatic    #31  <Method void Asserts.checkNotNull(Object)>
		boolean flag = true;
	//    9   15:iconst_1        
	//   10   16:istore          4
		if(i == 0 || i == 1 || i == 2 || i == 3)
	//*  11   18:iload_2         
	//*  12   19:ifeq            40
	//*  13   22:iload_2         
	//*  14   23:iconst_1        
	//*  15   24:icmpeq          40
	//*  16   27:iload_2         
	//*  17   28:iconst_2        
	//*  18   29:icmpeq          40
	//*  19   32:iload_2         
	//*  20   33:iconst_3        
	//*  21   34:icmpeq          40
	//*  22   37:goto            43
			flag = false;
	//   23   40:iconst_0        
	//   24   41:istore          4
		StringBuilder stringbuilder = new StringBuilder(29);
	//   25   43:new             #33  <Class StringBuilder>
	//   26   46:dup             
	//   27   47:bipush          29
	//   28   49:invokespecial   #36  <Method void StringBuilder(int)>
	//   29   52:astore          5
		stringbuilder.append("Invalid position: ");
	//   30   54:aload           5
	//   31   56:ldc1            #38  <String "Invalid position: ">
	//   32   58:invokevirtual   #42  <Method StringBuilder StringBuilder.append(String)>
	//   33   61:pop             
		stringbuilder.append(i);
	//   34   62:aload           5
	//   35   64:iload_2         
	//   36   65:invokevirtual   #45  <Method StringBuilder StringBuilder.append(int)>
	//   37   68:pop             
		Asserts.checkState(flag, ((Object) (stringbuilder.toString())));
	//   38   69:iload           4
	//   39   71:aload           5
	//   40   73:invokevirtual   #49  <Method String StringBuilder.toString()>
	//   41   76:invokestatic    #53  <Method void Asserts.checkState(boolean, Object)>
		zzpq = new WeakReference(((Object) (textview)));
	//   42   79:aload_0         
	//   43   80:new             #55  <Class WeakReference>
	//   44   83:dup             
	//   45   84:aload_1         
	//   46   85:invokespecial   #57  <Method void WeakReference(Object)>
	//   47   88:putfield        #59  <Field WeakReference zzpq>
		zzpr = i;
	//   48   91:aload_0         
	//   49   92:iload_2         
	//   50   93:putfield        #25  <Field int zzpr>
	//   51   96:return          
	}

	public ImageRequest$TextViewImageRequest(TextView textview, int i, Uri uri)
	{
		super(uri, 0);
	//    0    0:aload_0         
	//    1    1:aload_3         
	//    2    2:iconst_0        
	//    3    3:invokespecial   #23  <Method void ImageRequest(Uri, int)>
		zzpr = -1;
	//    4    6:aload_0         
	//    5    7:iconst_m1       
	//    6    8:putfield        #25  <Field int zzpr>
		Asserts.checkNotNull(((Object) (textview)));
	//    7   11:aload_1         
	//    8   12:invokestatic    #31  <Method void Asserts.checkNotNull(Object)>
		boolean flag = true;
	//    9   15:iconst_1        
	//   10   16:istore          4
		if(i == 0 || i == 1 || i == 2 || i == 3)
	//*  11   18:iload_2         
	//*  12   19:ifeq            40
	//*  13   22:iload_2         
	//*  14   23:iconst_1        
	//*  15   24:icmpeq          40
	//*  16   27:iload_2         
	//*  17   28:iconst_2        
	//*  18   29:icmpeq          40
	//*  19   32:iload_2         
	//*  20   33:iconst_3        
	//*  21   34:icmpeq          40
	//*  22   37:goto            43
			flag = false;
	//   23   40:iconst_0        
	//   24   41:istore          4
		uri = ((Uri) (new StringBuilder(29)));
	//   25   43:new             #33  <Class StringBuilder>
	//   26   46:dup             
	//   27   47:bipush          29
	//   28   49:invokespecial   #36  <Method void StringBuilder(int)>
	//   29   52:astore_3        
		((StringBuilder) (uri)).append("Invalid position: ");
	//   30   53:aload_3         
	//   31   54:ldc1            #38  <String "Invalid position: ">
	//   32   56:invokevirtual   #42  <Method StringBuilder StringBuilder.append(String)>
	//   33   59:pop             
		((StringBuilder) (uri)).append(i);
	//   34   60:aload_3         
	//   35   61:iload_2         
	//   36   62:invokevirtual   #45  <Method StringBuilder StringBuilder.append(int)>
	//   37   65:pop             
		Asserts.checkState(flag, ((Object) (((StringBuilder) (uri)).toString())));
	//   38   66:iload           4
	//   39   68:aload_3         
	//   40   69:invokevirtual   #49  <Method String StringBuilder.toString()>
	//   41   72:invokestatic    #53  <Method void Asserts.checkState(boolean, Object)>
		zzpq = new WeakReference(((Object) (textview)));
	//   42   75:aload_0         
	//   43   76:new             #55  <Class WeakReference>
	//   44   79:dup             
	//   45   80:aload_1         
	//   46   81:invokespecial   #57  <Method void WeakReference(Object)>
	//   47   84:putfield        #59  <Field WeakReference zzpq>
		zzpr = i;
	//   48   87:aload_0         
	//   49   88:iload_2         
	//   50   89:putfield        #25  <Field int zzpr>
	//   51   92:return          
	}
}
