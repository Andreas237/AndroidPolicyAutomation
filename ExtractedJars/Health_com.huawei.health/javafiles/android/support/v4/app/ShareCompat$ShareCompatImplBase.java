// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.app;

import android.view.MenuItem;

// Referenced classes of package android.support.v4.app:
//			ShareCompat

static class ShareCompat$ShareCompatImplBase
	implements ShareCompat.ShareCompatImpl
{

	private static void withinStyle(StringBuilder stringbuilder, CharSequence charsequence, int i, int j)
	{
		for(; i < j; i++)
	//*   0    0:iload_2         
	//*   1    1:iload_3         
	//*   2    2:icmpge          178
		{
			char c = charsequence.charAt(i);
	//    3    5:aload_1         
	//    4    6:iload_2         
	//    5    7:invokeinterface #22  <Method char CharSequence.charAt(int)>
	//    6   12:istore          4
			if(c == '<')
	//*   7   14:iload           4
	//*   8   16:bipush          60
	//*   9   18:icmpne          31
			{
				stringbuilder.append("&lt;");
	//   10   21:aload_0         
	//   11   22:ldc1            #24  <String "&lt;">
	//   12   24:invokevirtual   #30  <Method StringBuilder StringBuilder.append(String)>
	//   13   27:pop             
				continue;
	//   14   28:goto            171
			}
			if(c == '>')
	//*  15   31:iload           4
	//*  16   33:bipush          62
	//*  17   35:icmpne          48
			{
				stringbuilder.append("&gt;");
	//   18   38:aload_0         
	//   19   39:ldc1            #32  <String "&gt;">
	//   20   41:invokevirtual   #30  <Method StringBuilder StringBuilder.append(String)>
	//   21   44:pop             
				continue;
	//   22   45:goto            171
			}
			if(c == '&')
	//*  23   48:iload           4
	//*  24   50:bipush          38
	//*  25   52:icmpne          65
			{
				stringbuilder.append("&amp;");
	//   26   55:aload_0         
	//   27   56:ldc1            #34  <String "&amp;">
	//   28   58:invokevirtual   #30  <Method StringBuilder StringBuilder.append(String)>
	//   29   61:pop             
				continue;
	//   30   62:goto            171
			}
			if(c > '~' || c < ' ')
	//*  31   65:iload           4
	//*  32   67:bipush          126
	//*  33   69:icmpgt          79
	//*  34   72:iload           4
	//*  35   74:bipush          32
	//*  36   76:icmpge          112
			{
				stringbuilder.append((new StringBuilder()).append("&#").append(((int) (c))).append(";").toString());
	//   37   79:aload_0         
	//   38   80:new             #26  <Class StringBuilder>
	//   39   83:dup             
	//   40   84:invokespecial   #35  <Method void StringBuilder()>
	//   41   87:ldc1            #37  <String "&#">
	//   42   89:invokevirtual   #30  <Method StringBuilder StringBuilder.append(String)>
	//   43   92:iload           4
	//   44   94:invokevirtual   #40  <Method StringBuilder StringBuilder.append(int)>
	//   45   97:ldc1            #42  <String ";">
	//   46   99:invokevirtual   #30  <Method StringBuilder StringBuilder.append(String)>
	//   47  102:invokevirtual   #46  <Method String StringBuilder.toString()>
	//   48  105:invokevirtual   #30  <Method StringBuilder StringBuilder.append(String)>
	//   49  108:pop             
				continue;
	//   50  109:goto            171
			}
			if(c == ' ')
	//*  51  112:iload           4
	//*  52  114:bipush          32
	//*  53  116:icmpne          164
			{
				for(; i + 1 < j && charsequence.charAt(i + 1) == ' '; i++)
	//*  54  119:iload_2         
	//*  55  120:iconst_1        
	//*  56  121:iadd            
	//*  57  122:iload_3         
	//*  58  123:icmpge          154
	//*  59  126:aload_1         
	//*  60  127:iload_2         
	//*  61  128:iconst_1        
	//*  62  129:iadd            
	//*  63  130:invokeinterface #22  <Method char CharSequence.charAt(int)>
	//*  64  135:bipush          32
	//*  65  137:icmpne          154
					stringbuilder.append("&nbsp;");
	//   66  140:aload_0         
	//   67  141:ldc1            #48  <String "&nbsp;">
	//   68  143:invokevirtual   #30  <Method StringBuilder StringBuilder.append(String)>
	//   69  146:pop             

	//   70  147:iload_2         
	//   71  148:iconst_1        
	//   72  149:iadd            
	//   73  150:istore_2        
	//*  74  151:goto            119
				stringbuilder.append(' ');
	//   75  154:aload_0         
	//   76  155:bipush          32
	//   77  157:invokevirtual   #51  <Method StringBuilder StringBuilder.append(char)>
	//   78  160:pop             
			} else
	//*  79  161:goto            171
			{
				stringbuilder.append(c);
	//   80  164:aload_0         
	//   81  165:iload           4
	//   82  167:invokevirtual   #51  <Method StringBuilder StringBuilder.append(char)>
	//   83  170:pop             
			}
		}

	//   84  171:iload_2         
	//   85  172:iconst_1        
	//   86  173:iadd            
	//   87  174:istore_2        
	//*  88  175:goto            0
	//   89  178:return          
	}

	public void configureMenuItem(MenuItem menuitem, ShareCompat.IntentBuilder intentbuilder)
	{
		menuitem.setIntent(intentbuilder.createChooserIntent());
	//    0    0:aload_1         
	//    1    1:aload_2         
	//    2    2:invokevirtual   #59  <Method android.content.Intent ShareCompat$IntentBuilder.createChooserIntent()>
	//    3    5:invokeinterface #65  <Method MenuItem MenuItem.setIntent(android.content.Intent)>
	//    4   10:pop             
	//    5   11:return          
	}

	public String escapeHtml(CharSequence charsequence)
	{
		StringBuilder stringbuilder = new StringBuilder();
	//    0    0:new             #26  <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #35  <Method void StringBuilder()>
	//    3    7:astore_2        
		withinStyle(stringbuilder, charsequence, 0, charsequence.length());
	//    4    8:aload_2         
	//    5    9:aload_1         
	//    6   10:iconst_0        
	//    7   11:aload_1         
	//    8   12:invokeinterface #71  <Method int CharSequence.length()>
	//    9   17:invokestatic    #73  <Method void withinStyle(StringBuilder, CharSequence, int, int)>
		return stringbuilder.toString();
	//   10   20:aload_2         
	//   11   21:invokevirtual   #46  <Method String StringBuilder.toString()>
	//   12   24:areturn         
	}

	ShareCompat$ShareCompatImplBase()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #13  <Method void Object()>
	//    2    4:return          
	}
}
