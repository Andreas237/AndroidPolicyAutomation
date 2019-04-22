// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.apollographql.apollo.internal.json;


final class JsonScope
{

	static String getPath(int i, int ai[], String as[], int ai1[])
	{
		StringBuilder stringbuilder = new StringBuilder();
	//    0    0:new             #8   <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #12  <Method void StringBuilder()>
	//    3    7:astore          5
		stringbuilder.append('$');
	//    4    9:aload           5
	//    5   11:bipush          36
	//    6   13:invokevirtual   #16  <Method StringBuilder StringBuilder.append(char)>
	//    7   16:pop             
		for(int j = 0; j < i; j++)
	//*   8   17:iconst_0        
	//*   9   18:istore          4
	//*  10   20:iload           4
	//*  11   22:iload_0         
	//*  12   23:icmpge          130
			switch(ai[j])
	//*  13   26:aload_1         
	//*  14   27:iload           4
	//*  15   29:iaload          
			{
	//*  16   30:tableswitch     1 5: default 64
	//	               1 95
	//	               2 95
	//	               3 67
	//	               4 67
	//	               5 67
	//*  17   64:goto            121
			case 3: // '\003'
			case 4: // '\004'
			case 5: // '\005'
				stringbuilder.append('.');
	//   18   67:aload           5
	//   19   69:bipush          46
	//   20   71:invokevirtual   #16  <Method StringBuilder StringBuilder.append(char)>
	//   21   74:pop             
				if(as[j] != null)
	//*  22   75:aload_2         
	//*  23   76:iload           4
	//*  24   78:aaload          
	//*  25   79:ifnull          121
					stringbuilder.append(as[j]);
	//   26   82:aload           5
	//   27   84:aload_2         
	//   28   85:iload           4
	//   29   87:aaload          
	//   30   88:invokevirtual   #19  <Method StringBuilder StringBuilder.append(String)>
	//   31   91:pop             
				break;

	//*  32   92:goto            121
			case 1: // '\001'
			case 2: // '\002'
				stringbuilder.append('[');
	//   33   95:aload           5
	//   34   97:bipush          91
	//   35   99:invokevirtual   #16  <Method StringBuilder StringBuilder.append(char)>
	//   36  102:pop             
				stringbuilder.append(ai1[j]);
	//   37  103:aload           5
	//   38  105:aload_3         
	//   39  106:iload           4
	//   40  108:iaload          
	//   41  109:invokevirtual   #22  <Method StringBuilder StringBuilder.append(int)>
	//   42  112:pop             
				stringbuilder.append(']');
	//   43  113:aload           5
	//   44  115:bipush          93
	//   45  117:invokevirtual   #16  <Method StringBuilder StringBuilder.append(char)>
	//   46  120:pop             
				break;
			}

	//   47  121:iload           4
	//   48  123:iconst_1        
	//   49  124:iadd            
	//   50  125:istore          4
	//*  51  127:goto            20
		return stringbuilder.toString();
	//   52  130:aload           5
	//   53  132:invokevirtual   #26  <Method String StringBuilder.toString()>
	//   54  135:areturn         
	}
}
