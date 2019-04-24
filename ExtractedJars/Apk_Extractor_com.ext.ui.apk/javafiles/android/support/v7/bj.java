// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v7;


// Referenced classes of package android.support.v7:
//			bi, ae, bb

class bj extends bi
{

	public static final boolean a(String s, int i, String s1, int j, int k, boolean flag)
	{
		ae.b(((Object) (s)), "$receiver");
	//    0    0:aload_0         
	//    1    1:ldc1            #9   <String "$receiver">
	//    2    3:invokestatic    #15  <Method void ae.b(Object, String)>
		ae.b(((Object) (s1)), "other");
	//    3    6:aload_2         
	//    4    7:ldc1            #17  <String "other">
	//    5    9:invokestatic    #15  <Method void ae.b(Object, String)>
		if(!flag)
	//*   6   12:iload           5
	//*   7   14:ifne            27
			return s.regionMatches(i, s1, j, k);
	//    8   17:aload_0         
	//    9   18:iload_1         
	//   10   19:aload_2         
	//   11   20:iload_3         
	//   12   21:iload           4
	//   13   23:invokevirtual   #23  <Method boolean String.regionMatches(int, String, int, int)>
	//   14   26:ireturn         
		else
			return s.regionMatches(flag, i, s1, j, k);
	//   15   27:aload_0         
	//   16   28:iload           5
	//   17   30:iload_1         
	//   18   31:aload_2         
	//   19   32:iload_3         
	//   20   33:iload           4
	//   21   35:invokevirtual   #26  <Method boolean String.regionMatches(boolean, int, String, int, int)>
	//   22   38:ireturn         
	}

	public static final boolean a(String s, String s1, boolean flag)
	{
		ae.b(((Object) (s)), "$receiver");
	//    0    0:aload_0         
	//    1    1:ldc1            #9   <String "$receiver">
	//    2    3:invokestatic    #15  <Method void ae.b(Object, String)>
		ae.b(((Object) (s1)), "prefix");
	//    3    6:aload_1         
	//    4    7:ldc1            #31  <String "prefix">
	//    5    9:invokestatic    #15  <Method void ae.b(Object, String)>
		if(!flag)
	//*   6   12:iload_2         
	//*   7   13:ifne            22
			return s.startsWith(s1);
	//    8   16:aload_0         
	//    9   17:aload_1         
	//   10   18:invokevirtual   #35  <Method boolean String.startsWith(String)>
	//   11   21:ireturn         
		else
			return bb.a(s, 0, s1, 0, s1.length(), flag);
	//   12   22:aload_0         
	//   13   23:iconst_0        
	//   14   24:aload_1         
	//   15   25:iconst_0        
	//   16   26:aload_1         
	//   17   27:invokevirtual   #39  <Method int String.length()>
	//   18   30:iload_2         
	//   19   31:invokestatic    #43  <Method boolean bb.a(String, int, String, int, int, boolean)>
	//   20   34:ireturn         
	}

	public static volatile boolean a(String s, String s1, boolean flag, int i, Object obj)
	{
		if((i & 2) != 0)
	//*   0    0:iload_3         
	//*   1    1:iconst_2        
	//*   2    2:iand            
	//*   3    3:ifeq            8
			flag = false;
	//    4    6:iconst_0        
	//    5    7:istore_2        
		return bb.a(s, s1, flag);
	//    6    8:aload_0         
	//    7    9:aload_1         
	//    8   10:iload_2         
	//    9   11:invokestatic    #46  <Method boolean bb.a(String, String, boolean)>
	//   10   14:ireturn         
	}
}
