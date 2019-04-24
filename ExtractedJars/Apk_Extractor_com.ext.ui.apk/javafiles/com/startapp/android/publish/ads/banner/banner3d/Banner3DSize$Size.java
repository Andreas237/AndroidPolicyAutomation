// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.startapp.android.publish.ads.banner.banner3d;

import com.startapp.android.publish.ads.banner.d;

// Referenced classes of package com.startapp.android.publish.ads.banner.banner3d:
//			Banner3DSize

public static final class Banner3DSize$Size extends Enum
{

	public static Banner3DSize$Size valueOf(String s)
	{
		return (Banner3DSize$Size)Enum.valueOf(com/startapp/android/publish/ads/banner/banner3d/Banner3DSize$Size, s);
	//    0    0:ldc1            #2   <Class Banner3DSize$Size>
	//    1    2:aload_0         
	//    2    3:invokestatic    #63  <Method Enum Enum.valueOf(Class, String)>
	//    3    6:checkcast       #2   <Class Banner3DSize$Size>
	//    4    9:areturn         
	}

	public static Banner3DSize$Size[] values()
	{
		return (Banner3DSize$Size[])((Banner3DSize$Size []) ($VALUES)).clone();
	//    0    0:getstatic       #50  <Field Banner3DSize$Size[] $VALUES>
	//    1    3:invokevirtual   #70  <Method Object _5B_Lcom.startapp.android.publish.ads.banner.banner3d.Banner3DSize$Size_3B_.clone()>
	//    2    6:checkcast       #66  <Class Banner3DSize$Size[]>
	//    3    9:areturn         
	}

	public d getSize()
	{
		return size;
	//    0    0:aload_0         
	//    1    1:getfield        #56  <Field d size>
	//    2    4:areturn         
	}

	private static final Banner3DSize$Size $VALUES[];
	public static final Banner3DSize$Size LARGE;
	public static final Banner3DSize$Size MEDIUM;
	public static final Banner3DSize$Size SMALL;
	public static final Banner3DSize$Size XLARGE;
	public static final Banner3DSize$Size XSMALL;
	public static final Banner3DSize$Size XXSMALL;
	private d size;

	static 
	{
		XXSMALL = new Banner3DSize$Size("XXSMALL", 0, new d(280, 50));
	//    0    0:new             #2   <Class Banner3DSize$Size>
	//    1    3:dup             
	//    2    4:ldc1            #22  <String "XXSMALL">
	//    3    6:iconst_0        
	//    4    7:new             #24  <Class d>
	//    5   10:dup             
	//    6   11:sipush          280
	//    7   14:bipush          50
	//    8   16:invokespecial   #28  <Method void d(int, int)>
	//    9   19:invokespecial   #31  <Method void Banner3DSize$Size(String, int, d)>
	//   10   22:putstatic       #33  <Field Banner3DSize$Size XXSMALL>
		XSMALL = new Banner3DSize$Size("XSMALL", 1, new d(300, 50));
	//   11   25:new             #2   <Class Banner3DSize$Size>
	//   12   28:dup             
	//   13   29:ldc1            #34  <String "XSMALL">
	//   14   31:iconst_1        
	//   15   32:new             #24  <Class d>
	//   16   35:dup             
	//   17   36:sipush          300
	//   18   39:bipush          50
	//   19   41:invokespecial   #28  <Method void d(int, int)>
	//   20   44:invokespecial   #31  <Method void Banner3DSize$Size(String, int, d)>
	//   21   47:putstatic       #36  <Field Banner3DSize$Size XSMALL>
		SMALL = new Banner3DSize$Size("SMALL", 2, new d(320, 50));
	//   22   50:new             #2   <Class Banner3DSize$Size>
	//   23   53:dup             
	//   24   54:ldc1            #37  <String "SMALL">
	//   25   56:iconst_2        
	//   26   57:new             #24  <Class d>
	//   27   60:dup             
	//   28   61:sipush          320
	//   29   64:bipush          50
	//   30   66:invokespecial   #28  <Method void d(int, int)>
	//   31   69:invokespecial   #31  <Method void Banner3DSize$Size(String, int, d)>
	//   32   72:putstatic       #39  <Field Banner3DSize$Size SMALL>
		MEDIUM = new Banner3DSize$Size("MEDIUM", 3, new d(468, 60));
	//   33   75:new             #2   <Class Banner3DSize$Size>
	//   34   78:dup             
	//   35   79:ldc1            #40  <String "MEDIUM">
	//   36   81:iconst_3        
	//   37   82:new             #24  <Class d>
	//   38   85:dup             
	//   39   86:sipush          468
	//   40   89:bipush          60
	//   41   91:invokespecial   #28  <Method void d(int, int)>
	//   42   94:invokespecial   #31  <Method void Banner3DSize$Size(String, int, d)>
	//   43   97:putstatic       #42  <Field Banner3DSize$Size MEDIUM>
		LARGE = new Banner3DSize$Size("LARGE", 4, new d(728, 90));
	//   44  100:new             #2   <Class Banner3DSize$Size>
	//   45  103:dup             
	//   46  104:ldc1            #43  <String "LARGE">
	//   47  106:iconst_4        
	//   48  107:new             #24  <Class d>
	//   49  110:dup             
	//   50  111:sipush          728
	//   51  114:bipush          90
	//   52  116:invokespecial   #28  <Method void d(int, int)>
	//   53  119:invokespecial   #31  <Method void Banner3DSize$Size(String, int, d)>
	//   54  122:putstatic       #45  <Field Banner3DSize$Size LARGE>
		XLARGE = new Banner3DSize$Size("XLARGE", 5, new d(1024, 90));
	//   55  125:new             #2   <Class Banner3DSize$Size>
	//   56  128:dup             
	//   57  129:ldc1            #46  <String "XLARGE">
	//   58  131:iconst_5        
	//   59  132:new             #24  <Class d>
	//   60  135:dup             
	//   61  136:sipush          1024
	//   62  139:bipush          90
	//   63  141:invokespecial   #28  <Method void d(int, int)>
	//   64  144:invokespecial   #31  <Method void Banner3DSize$Size(String, int, d)>
	//   65  147:putstatic       #48  <Field Banner3DSize$Size XLARGE>
		$VALUES = (new Banner3DSize$Size[] {
			XXSMALL, XSMALL, SMALL, MEDIUM, LARGE, XLARGE
		});
	//   66  150:bipush          6
	//   67  152:anewarray       Banner3DSize$Size[]
	//   68  155:dup             
	//   69  156:iconst_0        
	//   70  157:getstatic       #33  <Field Banner3DSize$Size XXSMALL>
	//   71  160:aastore         
	//   72  161:dup             
	//   73  162:iconst_1        
	//   74  163:getstatic       #36  <Field Banner3DSize$Size XSMALL>
	//   75  166:aastore         
	//   76  167:dup             
	//   77  168:iconst_2        
	//   78  169:getstatic       #39  <Field Banner3DSize$Size SMALL>
	//   79  172:aastore         
	//   80  173:dup             
	//   81  174:iconst_3        
	//   82  175:getstatic       #42  <Field Banner3DSize$Size MEDIUM>
	//   83  178:aastore         
	//   84  179:dup             
	//   85  180:iconst_4        
	//   86  181:getstatic       #45  <Field Banner3DSize$Size LARGE>
	//   87  184:aastore         
	//   88  185:dup             
	//   89  186:iconst_5        
	//   90  187:getstatic       #48  <Field Banner3DSize$Size XLARGE>
	//   91  190:aastore         
	//   92  191:putstatic       #50  <Field Banner3DSize$Size[] $VALUES>
	//*  93  194:return          
	}

	private Banner3DSize$Size(String s, int i, d d1)
	{
		super(s, i);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:invokespecial   #54  <Method void Enum(String, int)>
		size = d1;
	//    4    6:aload_0         
	//    5    7:aload_3         
	//    6    8:putfield        #56  <Field d size>
	//    7   11:return          
	}
}
