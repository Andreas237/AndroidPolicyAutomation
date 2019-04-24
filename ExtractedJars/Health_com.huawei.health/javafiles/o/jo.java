// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package o;


public final class jo
{

	protected static boolean c(String as[], String s)
	{
		if(as != null && s != null)
	//*   0    0:aload_0         
	//*   1    1:ifnull          35
	//*   2    4:aload_1         
	//*   3    5:ifnull          35
		{
			for(int i = 0; i < as.length; i++)
	//*   4    8:iconst_0        
	//*   5    9:istore_2        
	//*   6   10:iload_2         
	//*   7   11:aload_0         
	//*   8   12:arraylength     
	//*   9   13:icmpge          35
				if(as[i].equals(((Object) (s))))
	//*  10   16:aload_0         
	//*  11   17:iload_2         
	//*  12   18:aaload          
	//*  13   19:aload_1         
	//*  14   20:invokevirtual   #37  <Method boolean String.equals(Object)>
	//*  15   23:ifeq            28
					return true;
	//   16   26:iconst_1        
	//   17   27:ireturn         

	//   18   28:iload_2         
	//   19   29:iconst_1        
	//   20   30:iadd            
	//   21   31:istore_2        
		}
	//*  22   32:goto            10
		return false;
	//   23   35:iconst_0        
	//   24   36:ireturn         
	}

	protected static boolean a = false;
	protected static final String d[] = {
		"android.permission.READ_PHONE_STATE", "android.permission.ACCESS_WIFI_STATE", "android.permission.WRITE_EXTERNAL_STORAGE", "android.permission.ACCESS_FINE_LOCATION", "android.permission.ACCESS_COARSE_LOCATION", "android.permission.CHANGE_WIFI_STATE", "android.permission.ACCESS_NETWORK_STATE"
	};

	static 
	{
	//    0    0:iconst_0        
	//    1    1:putstatic       #12  <Field boolean a>
	//    2    4:bipush          7
	//    3    6:anewarray       String[]
	//    4    9:dup             
	//    5   10:iconst_0        
	//    6   11:ldc1            #16  <String "android.permission.READ_PHONE_STATE">
	//    7   13:aastore         
	//    8   14:dup             
	//    9   15:iconst_1        
	//   10   16:ldc1            #18  <String "android.permission.ACCESS_WIFI_STATE">
	//   11   18:aastore         
	//   12   19:dup             
	//   13   20:iconst_2        
	//   14   21:ldc1            #20  <String "android.permission.WRITE_EXTERNAL_STORAGE">
	//   15   23:aastore         
	//   16   24:dup             
	//   17   25:iconst_3        
	//   18   26:ldc1            #22  <String "android.permission.ACCESS_FINE_LOCATION">
	//   19   28:aastore         
	//   20   29:dup             
	//   21   30:iconst_4        
	//   22   31:ldc1            #24  <String "android.permission.ACCESS_COARSE_LOCATION">
	//   23   33:aastore         
	//   24   34:dup             
	//   25   35:iconst_5        
	//   26   36:ldc1            #26  <String "android.permission.CHANGE_WIFI_STATE">
	//   27   38:aastore         
	//   28   39:dup             
	//   29   40:bipush          6
	//   30   42:ldc1            #28  <String "android.permission.ACCESS_NETWORK_STATE">
	//   31   44:aastore         
	//   32   45:putstatic       #30  <Field String[] d>
	//*  33   48:return          
	}
}
