// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package o;

import android.text.TextUtils;

// Referenced classes of package o:
//			hj, hh, hk

public final class hi
{

	private hi()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #13  <Method void Object()>
	//    2    4:return          
	}

	public static hi e()
	{
		o/hi;
	//    0    0:ldc1            #2   <Class hi>
		JVM INSTR monitorenter ;
	//    1    2:monitorenter    
		String s;
		hh hh1;
		String s1;
		String s2;
		hi hi1;
		if(a != null)
			break MISSING_BLOCK_LABEL_150;
	//    2    3:getstatic       #18  <Field hi a>
	//    3    6:ifnonnull       150
		a = new hi();
	//    4    9:new             #2   <Class hi>
	//    5   12:dup             
	//    6   13:invokespecial   #19  <Method void hi()>
	//    7   16:putstatic       #18  <Field hi a>
		android.content.Context context = hj.d().c;
	//    8   19:invokestatic    #25  <Method hj hj.d()>
	//    9   22:getfield        #28  <Field android.content.Context hj.c>
	//   10   25:astore_0        
		hh1 = new hh(context);
	//   11   26:new             #30  <Class hh>
	//   12   29:dup             
	//   13   30:aload_0         
	//   14   31:invokespecial   #33  <Method void hh(android.content.Context)>
	//   15   34:astore_2        
		s1 = hk.d(context).e();
	//   16   35:aload_0         
	//   17   36:invokestatic    #38  <Method hk hk.d(android.content.Context)>
	//   18   39:invokevirtual   #41  <Method String hk.e()>
	//   19   42:astore_3        
		s2 = hk.d(context).b();
	//   20   43:aload_0         
	//   21   44:invokestatic    #38  <Method hk hk.d(android.content.Context)>
	//   22   47:invokevirtual   #43  <Method String hk.b()>
	//   23   50:astore          4
		a.c = hh1.b(s1, s2);
	//   24   52:getstatic       #18  <Field hi a>
	//   25   55:aload_2         
	//   26   56:aload_3         
	//   27   57:aload           4
	//   28   59:invokevirtual   #46  <Method String hh.b(String, String)>
	//   29   62:putfield        #48  <Field String c>
		a.b = hh1.d(s1, s2);
	//   30   65:getstatic       #18  <Field hi a>
	//   31   68:aload_2         
	//   32   69:aload_3         
	//   33   70:aload           4
	//   34   72:invokevirtual   #50  <Method String hh.d(String, String)>
	//   35   75:putfield        #52  <Field String b>
		if(!TextUtils.isEmpty(((CharSequence) (a.b))))
			break MISSING_BLOCK_LABEL_131;
	//   36   78:getstatic       #18  <Field hi a>
	//   37   81:getfield        #52  <Field String b>
	//   38   84:invokestatic    #58  <Method boolean TextUtils.isEmpty(CharSequence)>
	//   39   87:ifeq            131
		hi1 = a;
	//   40   90:getstatic       #18  <Field hi a>
	//   41   93:astore          5
		s = Long.toHexString(System.currentTimeMillis());
	//   42   95:invokestatic    #64  <Method long System.currentTimeMillis()>
	//   43   98:invokestatic    #70  <Method String Long.toHexString(long)>
	//   44  101:astore_1        
		Object obj = ((Object) (s));
	//   45  102:aload_1         
	//   46  103:astore_0        
		if(s.length() > 10)
	//*  47  104:aload_1         
	//*  48  105:invokevirtual   #76  <Method int String.length()>
	//*  49  108:bipush          10
	//*  50  110:icmple          125
			obj = ((Object) (s.substring(s.length() - 10)));
	//   51  113:aload_1         
	//   52  114:aload_1         
	//   53  115:invokevirtual   #76  <Method int String.length()>
	//   54  118:bipush          10
	//   55  120:isub            
	//   56  121:invokevirtual   #80  <Method String String.substring(int)>
	//   57  124:astore_0        
		hi1.b = ((String) (obj));
	//   58  125:aload           5
	//   59  127:aload_0         
	//   60  128:putfield        #52  <Field String b>
		hh1.a(s1, s2, a.c, a.b);
	//   61  131:aload_2         
	//   62  132:aload_3         
	//   63  133:aload           4
	//   64  135:getstatic       #18  <Field hi a>
	//   65  138:getfield        #48  <Field String c>
	//   66  141:getstatic       #18  <Field hi a>
	//   67  144:getfield        #52  <Field String b>
	//   68  147:invokevirtual   #83  <Method void hh.a(String, String, String, String)>
		obj = ((Object) (a));
	//   69  150:getstatic       #18  <Field hi a>
	//   70  153:astore_0        
		o/hi;
	//   71  154:ldc1            #2   <Class hi>
		JVM INSTR monitorexit ;
	//   72  156:monitorexit     
		return ((hi) (obj));
	//   73  157:aload_0         
	//   74  158:areturn         
		Exception exception;
		exception;
	//   75  159:astore_0        
	//*  76  160:ldc1            #2   <Class hi>
		throw exception;
	//   77  162:monitorexit     
	//   78  163:aload_0         
	//   79  164:athrow          
	}

	private static hi a;
	public String b;
	public String c;
}
