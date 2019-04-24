// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.irobot.home;

import android.os.Parcelable;
import com.irobot.home.model.Robot;
import com.irobot.home.model.RobotAvailableLanguages;
import com.irobot.home.model.RobotLanguage;
import com.irobot.home.model.rest.LanguagePack;
import com.irobot.home.q.b;
import com.irobot.home.util.j;
import com.irobot.home.util.o;
import java.util.Iterator;
import java.util.List;
import org.androidannotations.api.a;

// Referenced classes of package com.irobot.home:
//			BaseRobotLanguageListActivity, i, IRobotApplication

public class RoombaV1LanguageListActivity extends BaseRobotLanguageListActivity
	implements i.b
{

	public RoombaV1LanguageListActivity()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #14  <Method void BaseRobotLanguageListActivity()>
	//    2    4:aload_0         
	//    3    5:ldc1            #16  <String "AxedaLangListActivity">
	//    4    7:putfield        #18  <Field String k>
	//    5   10:return          
	}

	public void a(Parcelable parcelable)
	{
		h(0x7f0f0287);
	//    0    0:aload_0         
	//    1    1:ldc1            #22  <Int 0x7f0f0287>
	//    2    3:invokevirtual   #26  <Method void h(int)>
	//    3    6:return          
	}

	public void a(LanguagePack languagepack)
	{
		super.a(languagepack);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #29  <Method void com.irobot.home.BaseRobotLanguageListActivity.a(LanguagePack)>
		l.a(languagepack.downloadUrl, false, ((Parcelable) (languagepack)));
	//    3    5:aload_0         
	//    4    6:getfield        #31  <Field i l>
	//    5    9:aload_1         
	//    6   10:getfield        #36  <Field String LanguagePack.downloadUrl>
	//    7   13:iconst_0        
	//    8   14:aload_1         
	//    9   15:invokevirtual   #41  <Method void com.irobot.home.i.a(String, boolean, Parcelable)>
	//   10   18:return          
	}

	public void b(Parcelable parcelable)
	{
		a(false);
	//    0    0:aload_0         
	//    1    1:iconst_0        
	//    2    2:invokevirtual   #45  <Method void a(boolean)>
		g(0x7f0f0286);
	//    3    5:aload_0         
	//    4    6:ldc1            #46  <Int 0x7f0f0286>
	//    5    8:invokevirtual   #49  <Method void g(int)>
	//    6   11:return          
	}

	public void c(Parcelable parcelable)
	{
		h(0x7f0f0288);
	//    0    0:aload_0         
	//    1    1:ldc1            #51  <Int 0x7f0f0288>
	//    2    3:invokevirtual   #26  <Method void h(int)>
		e(parcelable);
	//    3    6:aload_0         
	//    4    7:aload_1         
	//    5    8:invokevirtual   #54  <Method void e(Parcelable)>
	//    6   11:return          
	}

	public void d(Parcelable parcelable)
	{
		a(false);
	//    0    0:aload_0         
	//    1    1:iconst_0        
	//    2    2:invokevirtual   #45  <Method void a(boolean)>
		g(0x7f0f0284);
	//    3    5:aload_0         
	//    4    6:ldc1            #56  <Int 0x7f0f0284>
	//    5    8:invokevirtual   #49  <Method void g(int)>
	//    6   11:return          
	}

	void e()
	{
		super.e();
	//    0    0:aload_0         
	//    1    1:invokespecial   #58  <Method void BaseRobotLanguageListActivity.e()>
		l = c.e(d);
	//    2    4:aload_0         
	//    3    5:aload_0         
	//    4    6:getfield        #61  <Field IRobotApplication c>
	//    5    9:aload_0         
	//    6   10:getfield        #63  <Field String d>
	//    7   13:invokevirtual   #68  <Method i IRobotApplication.e(String)>
	//    8   16:putfield        #31  <Field i l>
		l.a(((i.b) (this)));
	//    9   19:aload_0         
	//   10   20:getfield        #31  <Field i l>
	//   11   23:aload_0         
	//   12   24:invokevirtual   #71  <Method void com.irobot.home.i.a(i$b)>
		if(l.a())
	//*  13   27:aload_0         
	//*  14   28:getfield        #31  <Field i l>
	//*  15   31:invokevirtual   #74  <Method boolean com.irobot.home.i.a()>
	//*  16   34:ifeq            43
			f(0x7f0f0289);
	//   17   37:aload_0         
	//   18   38:ldc1            #75  <Int 0x7f0f0289>
	//   19   40:invokevirtual   #78  <Method void f(int)>
	//   20   43:return          
	}

	public void e(Parcelable parcelable)
	{
		try
		{
			Thread.sleep(15000L);
	//    0    0:ldc2w           #81  <Long 15000L>
	//    1    3:invokestatic    #88  <Method void Thread.sleep(long)>
		}
	//*   2    6:goto            49
		catch(InterruptedException interruptedexception)
	//*   3    9:astore          8
		{
			StringBuilder stringbuilder = new StringBuilder();
	//    4   11:new             #90  <Class StringBuilder>
	//    5   14:dup             
	//    6   15:invokespecial   #91  <Method void StringBuilder()>
	//    7   18:astore          9
			stringbuilder.append("Sleep interrupted in checkRobotForNewLanguage: ");
	//    8   20:aload           9
	//    9   22:ldc1            #93  <String "Sleep interrupted in checkRobotForNewLanguage: ">
	//   10   24:invokevirtual   #97  <Method StringBuilder StringBuilder.append(String)>
	//   11   27:pop             
			stringbuilder.append(interruptedexception.getMessage());
	//   12   28:aload           9
	//   13   30:aload           8
	//   14   32:invokevirtual   #101 <Method String InterruptedException.getMessage()>
	//   15   35:invokevirtual   #97  <Method StringBuilder StringBuilder.append(String)>
	//   16   38:pop             
			o.e("AxedaLangListActivity", stringbuilder.toString());
	//   17   39:ldc1            #16  <String "AxedaLangListActivity">
	//   18   41:aload           9
	//   19   43:invokevirtual   #104 <Method String StringBuilder.toString()>
	//   20   46:invokestatic    #109 <Method void o.e(String, String)>
		}
		if(parcelable instanceof LanguagePack)
	//*  21   49:aload_1         
	//*  22   50:instanceof      #33  <Class LanguagePack>
	//*  23   53:ifeq            328
		{
			String s = ((LanguagePack)parcelable).lang;
	//   24   56:aload_1         
	//   25   57:checkcast       #33  <Class LanguagePack>
	//   26   60:getfield        #112 <Field String LanguagePack.lang>
	//   27   63:astore          10
			long l1 = System.currentTimeMillis();
	//   28   65:invokestatic    #118 <Method long System.currentTimeMillis()>
	//   29   68:lstore          5
			boolean flag3 = s.equals("default");
	//   30   70:aload           10
	//   31   72:ldc1            #120 <String "default">
	//   32   74:invokevirtual   #126 <Method boolean String.equals(Object)>
	//   33   77:istore          7
			j.o(d).l();
	//   34   79:aload_0         
	//   35   80:getfield        #63  <Field String d>
	//   36   83:invokestatic    #132 <Method Robot j.o(String)>
	//   37   86:invokevirtual   #136 <Method void Robot.l()>
			Object obj = null;
	//   38   89:aconst_null     
	//   39   90:astore          8
			parcelable = ((Parcelable) (obj));
	//   40   92:aload           8
	//   41   94:astore_1        
			boolean flag = false;
	//   42   95:iconst_0        
	//   43   96:istore_2        
			boolean flag2 = false;
	//   44   97:iconst_0        
	//   45   98:istore          4
			RobotAvailableLanguages robotavailablelanguages = ((RobotAvailableLanguages) (obj));
	//   46  100:aload           8
	//   47  102:astore          9
			do
			{
				if(flag || flag2)
					break;
	//   48  104:iload_2         
	//   49  105:ifne            295
	//   50  108:iload           4
	//   51  110:ifne            295
				robotavailablelanguages = j.o(d).k();
	//   52  113:aload_0         
	//   53  114:getfield        #63  <Field String d>
	//   54  117:invokestatic    #132 <Method Robot j.o(String)>
	//   55  120:invokevirtual   #139 <Method RobotAvailableLanguages Robot.k()>
	//   56  123:astore          9
				Iterator iterator = robotavailablelanguages.a().iterator();
	//   57  125:aload           9
	//   58  127:invokevirtual   #144 <Method List RobotAvailableLanguages.a()>
	//   59  130:invokeinterface #150 <Method Iterator List.iterator()>
	//   60  135:astore          11
				boolean flag1;
				Object obj1;
				do
				{
					flag1 = flag2;
	//   61  137:iload           4
	//   62  139:istore_3        
					obj1 = ((Object) (parcelable));
	//   63  140:aload_1         
	//   64  141:astore          8
					if(!iterator.hasNext())
						break;
	//   65  143:aload           11
	//   66  145:invokeinterface #155 <Method boolean Iterator.hasNext()>
	//   67  150:ifeq            202
					obj1 = ((Object) ((RobotLanguage)iterator.next()));
	//   68  153:aload           11
	//   69  155:invokeinterface #159 <Method Object Iterator.next()>
	//   70  160:checkcast       #161 <Class RobotLanguage>
	//   71  163:astore          8
					if(!((RobotLanguage) (obj1)).b.equals(((Object) (s))) && (!flag3 || ((RobotLanguage) (obj1)).a != 0))
						continue;
	//   72  165:aload           8
	//   73  167:getfield        #163 <Field String RobotLanguage.b>
	//   74  170:aload           10
	//   75  172:invokevirtual   #126 <Method boolean String.equals(Object)>
	//   76  175:ifne            191
	//   77  178:iload           7
	//   78  180:ifeq            137
	//   79  183:aload           8
	//   80  185:getfield        #166 <Field int RobotLanguage.a>
	//   81  188:ifne            137
					i = ((RobotLanguage) (obj1)).a;
	//   82  191:aload_0         
	//   83  192:aload           8
	//   84  194:getfield        #166 <Field int RobotLanguage.a>
	//   85  197:putfield        #169 <Field int i>
					flag1 = true;
	//   86  200:iconst_1        
	//   87  201:istore_3        
					break;
				} while(true);
				if(!flag1)
	//*  88  202:iload_3         
	//*  89  203:ifne            260
				{
					r.c();
	//   90  206:aload_0         
	//   91  207:getfield        #173 <Field b r>
	//   92  210:invokevirtual   #177 <Method void b.c()>
					try
					{
						Thread.sleep(5000L);
	//   93  213:ldc2w           #178 <Long 5000L>
	//   94  216:invokestatic    #88  <Method void Thread.sleep(long)>
					}
	//*  95  219:goto            260
					// Misplaced declaration of an exception variable
					catch(Parcelable parcelable)
	//*  96  222:astore_1        
					{
						StringBuilder stringbuilder1 = new StringBuilder();
	//   97  223:new             #90  <Class StringBuilder>
	//   98  226:dup             
	//   99  227:invokespecial   #91  <Method void StringBuilder()>
	//  100  230:astore          11
						stringbuilder1.append("Interrupt while waiting to query languages: ");
	//  101  232:aload           11
	//  102  234:ldc1            #181 <String "Interrupt while waiting to query languages: ">
	//  103  236:invokevirtual   #97  <Method StringBuilder StringBuilder.append(String)>
	//  104  239:pop             
						stringbuilder1.append(((InterruptedException) (parcelable)).getMessage());
	//  105  240:aload           11
	//  106  242:aload_1         
	//  107  243:invokevirtual   #101 <Method String InterruptedException.getMessage()>
	//  108  246:invokevirtual   #97  <Method StringBuilder StringBuilder.append(String)>
	//  109  249:pop             
						o.e("AxedaLangListActivity", stringbuilder1.toString());
	//  110  250:ldc1            #16  <String "AxedaLangListActivity">
	//  111  252:aload           11
	//  112  254:invokevirtual   #104 <Method String StringBuilder.toString()>
	//  113  257:invokestatic    #109 <Method void o.e(String, String)>
					}
				}
				if(System.currentTimeMillis() - l1 > 0x493e0L)
	//* 114  260:invokestatic    #118 <Method long System.currentTimeMillis()>
	//* 115  263:lload           5
	//* 116  265:lsub            
	//* 117  266:ldc2w           #182 <Long 0x493e0L>
	//* 118  269:lcmp            
	//* 119  270:ifle            284
				{
					flag = true;
	//  120  273:iconst_1        
	//  121  274:istore_2        
					flag2 = flag1;
	//  122  275:iload_3         
	//  123  276:istore          4
					parcelable = ((Parcelable) (obj1));
	//  124  278:aload           8
	//  125  280:astore_1        
				} else
	//* 126  281:goto            104
				{
					flag = false;
	//  127  284:iconst_0        
	//  128  285:istore_2        
					flag2 = flag1;
	//  129  286:iload_3         
	//  130  287:istore          4
					parcelable = ((Parcelable) (obj1));
	//  131  289:aload           8
	//  132  291:astore_1        
				}
			} while(true);
	//  133  292:goto            104
			a(false);
	//  134  295:aload_0         
	//  135  296:iconst_0        
	//  136  297:invokevirtual   #45  <Method void a(boolean)>
			if(flag2)
	//* 137  300:iload           4
	//* 138  302:ifeq            321
			{
				j = robotavailablelanguages;
	//  139  305:aload_0         
	//  140  306:aload           9
	//  141  308:putfield        #187 <Field RobotAvailableLanguages j>
				f();
	//  142  311:aload_0         
	//  143  312:invokevirtual   #189 <Method void f()>
				a(((RobotLanguage) (parcelable)));
	//  144  315:aload_0         
	//  145  316:aload_1         
	//  146  317:invokevirtual   #192 <Method void a(RobotLanguage)>
				return;
	//  147  320:return          
			} else
			{
				g(0x7f0f0285);
	//  148  321:aload_0         
	//  149  322:ldc1            #193 <Int 0x7f0f0285>
	//  150  324:invokevirtual   #49  <Method void g(int)>
				return;
	//  151  327:return          
			}
		} else
		{
			o.e("AxedaLangListActivity", "Unable to set the selected language");
	//  152  328:ldc1            #16  <String "AxedaLangListActivity">
	//  153  330:ldc1            #195 <String "Unable to set the selected language">
	//  154  332:invokestatic    #109 <Method void o.e(String, String)>
			return;
	//  155  335:return          
		}
	}

	protected void onDestroy()
	{
		org.androidannotations.api.a.a("checkForNewLanguage", true);
	//    0    0:ldc1            #198 <String "checkForNewLanguage">
	//    1    2:iconst_1        
	//    2    3:invokestatic    #203 <Method void a.a(String, boolean)>
		super.onDestroy();
	//    3    6:aload_0         
	//    4    7:invokespecial   #205 <Method void BaseRobotLanguageListActivity.onDestroy()>
	//    5   10:return          
	}

	private final String k = "AxedaLangListActivity";
	private i l;
}
