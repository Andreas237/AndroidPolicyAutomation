// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v7.widget;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import java.util.List;

// Referenced classes of package android.support.v7.widget:
//			ah, an, bb, RecyclerView

public class LinearLayoutManager extends RecyclerView.h
	implements android.support.v7.widget.a.a.e
{
	public static class SavedState
		implements Parcelable
	{

		boolean a()
		{
			return a >= 0;
		//    0    0:aload_0         
		//    1    1:getfield        #37  <Field int a>
		//    2    4:iflt            9
		//    3    7:iconst_1        
		//    4    8:ireturn         
		//    5    9:iconst_0        
		//    6   10:ireturn         
		}

		void b()
		{
			a = -1;
		//    0    0:aload_0         
		//    1    1:iconst_m1       
		//    2    2:putfield        #37  <Field int a>
		//    3    5:return          
		}

		public int describeContents()
		{
			return 0;
		//    0    0:iconst_0        
		//    1    1:ireturn         
		}

		public void writeToParcel(Parcel parcel, int i1)
		{
			throw new Runtime("d2j fail translate: java.lang.RuntimeException: can not merge I and Z\n\tat com.googlecode.dex2jar.ir.TypeClass.merge(TypeClass.java:100)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeRef.updateTypeClass(TypeTransformer.java:174)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.provideAs(TypeTransformer.java:780)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.e1expr(TypeTransformer.java:496)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:713)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:703)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.enexpr(TypeTransformer.java:698)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:719)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:703)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.s1stmt(TypeTransformer.java:810)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.sxStmt(TypeTransformer.java:840)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.analyze(TypeTransformer.java:206)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer.transform(TypeTransformer.java:44)\n\tat com.googlecode.d2j.dex.Dex2jar$2.optimize(Dex2jar.java:162)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertCode(Dex2Asm.java:414)\n\tat com.googlecode.d2j.dex.ExDex2Asm.convertCode(ExDex2Asm.java:42)\n\tat com.googlecode.d2j.dex.Dex2jar$2.convertCode(Dex2jar.java:128)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertMethod(Dex2Asm.java:509)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertClass(Dex2Asm.java:406)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertDex(Dex2Asm.java:422)\n\tat com.googlecode.d2j.dex.Dex2jar.doTranslate(Dex2jar.java:172)\n\tat com.googlecode.d2j.dex.Dex2jar.to(Dex2jar.java:272)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.doCommandLine(Dex2jarCmd.java:108)\n\tat com.googlecode.dex2jar.tools.BaseCmd.doMain(BaseCmd.java:288)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.main(Dex2jarCmd.java:32)\n");
		//    0    0:new             #48  <Class RuntimeException>
		//    1    3:dup             
		//    2    4:ldc1            #50  <String "d2j fail translate: java.lang.RuntimeException: can not merge I and Z\n\tat com.googlecode.dex2jar.ir.TypeClass.merge(TypeClass.java:100)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeRef.updateTypeClass(TypeTransformer.java:174)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.provideAs(TypeTransformer.java:780)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.e1expr(TypeTransformer.java:496)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:713)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:703)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.enexpr(TypeTransformer.java:698)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:719)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:703)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.s1stmt(TypeTransformer.java:810)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.sxStmt(TypeTransformer.java:840)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.analyze(TypeTransformer.java:206)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer.transform(TypeTransformer.java:44)\n\tat com.googlecode.d2j.dex.Dex2jar$2.optimize(Dex2jar.java:162)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertCode(Dex2Asm.java:414)\n\tat com.googlecode.d2j.dex.ExDex2Asm.convertCode(ExDex2Asm.java:42)\n\tat com.googlecode.d2j.dex.Dex2jar$2.convertCode(Dex2jar.java:128)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertMethod(Dex2Asm.java:509)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertClass(Dex2Asm.java:406)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertDex(Dex2Asm.java:422)\n\tat com.googlecode.d2j.dex.Dex2jar.doTranslate(Dex2jar.java:172)\n\tat com.googlecode.d2j.dex.Dex2jar.to(Dex2jar.java:272)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.doCommandLine(Dex2jarCmd.java:108)\n\tat com.googlecode.dex2jar.tools.BaseCmd.doMain(BaseCmd.java:288)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.main(Dex2jarCmd.java:32)\n">
		//    3    6:invokespecial   #55  <Method void Runtime(String)>
		//    4    9:athrow          
		}

		public static final android.os.Parcelable.Creator CREATOR = new android.os.Parcelable.Creator() {

			public SavedState a(Parcel parcel)
			{
				return new SavedState(parcel);
			//    0    0:new             #9   <Class LinearLayoutManager$SavedState>
			//    1    3:dup             
			//    2    4:aload_1         
			//    3    5:invokespecial   #22  <Method void LinearLayoutManager$SavedState(Parcel)>
			//    4    8:areturn         
			}

			public SavedState[] a(int i1)
			{
				return new SavedState[i1];
			//    0    0:iload_1         
			//    1    1:anewarray       SavedState[]
			//    2    4:areturn         
			}

			public Object createFromParcel(Parcel parcel)
			{
				return ((Object) (a(parcel)));
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:invokevirtual   #27  <Method LinearLayoutManager$SavedState a(Parcel)>
			//    3    5:areturn         
			}

			public Object[] newArray(int i1)
			{
				return ((Object []) (a(i1)));
			//    0    0:aload_0         
			//    1    1:iload_1         
			//    2    2:invokevirtual   #31  <Method LinearLayoutManager$SavedState[] a(int)>
			//    3    5:areturn         
			}

		}
;
		int a;
		int b;
		boolean c;

		static 
		{
		//    0    0:new             #11  <Class LinearLayoutManager$SavedState$1>
		//    1    3:dup             
		//    2    4:invokespecial   #24  <Method void LinearLayoutManager$SavedState$1()>
		//    3    7:putstatic       #26  <Field android.os.Parcelable$Creator CREATOR>
		//*   4   10:return          
		}

		public SavedState()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #28  <Method void Object()>
		//    2    4:return          
		}

		SavedState(Parcel parcel)
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #28  <Method void Object()>
			a = parcel.readInt();
		//    2    4:aload_0         
		//    3    5:aload_1         
		//    4    6:invokevirtual   #35  <Method int Parcel.readInt()>
		//    5    9:putfield        #37  <Field int a>
			b = parcel.readInt();
		//    6   12:aload_0         
		//    7   13:aload_1         
		//    8   14:invokevirtual   #35  <Method int Parcel.readInt()>
		//    9   17:putfield        #39  <Field int b>
			int i1 = parcel.readInt();
		//   10   20:aload_1         
		//   11   21:invokevirtual   #35  <Method int Parcel.readInt()>
		//   12   24:istore_2        
			boolean flag = true;
		//   13   25:iconst_1        
		//   14   26:istore_3        
			if(i1 != 1)
		//*  15   27:iload_2         
		//*  16   28:iconst_1        
		//*  17   29:icmpne          35
		//*  18   32:goto            37
				flag = false;
		//   19   35:iconst_0        
		//   20   36:istore_3        
			c = flag;
		//   21   37:aload_0         
		//   22   38:iload_3         
		//   23   39:putfield        #41  <Field boolean c>
		//   24   42:return          
		}

		public SavedState(SavedState savedstate)
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #28  <Method void Object()>
			a = savedstate.a;
		//    2    4:aload_0         
		//    3    5:aload_1         
		//    4    6:getfield        #37  <Field int a>
		//    5    9:putfield        #37  <Field int a>
			b = savedstate.b;
		//    6   12:aload_0         
		//    7   13:aload_1         
		//    8   14:getfield        #39  <Field int b>
		//    9   17:putfield        #39  <Field int b>
			c = savedstate.c;
		//   10   20:aload_0         
		//   11   21:aload_1         
		//   12   22:getfield        #41  <Field boolean c>
		//   13   25:putfield        #41  <Field boolean c>
		//   14   28:return          
		}
	}

	class a
	{

		void a()
		{
			a = -1;
		//    0    0:aload_0         
		//    1    1:iconst_m1       
		//    2    2:putfield        #26  <Field int a>
			b = 0x80000000;
		//    3    5:aload_0         
		//    4    6:ldc1            #27  <Int 0x80000000>
		//    5    8:putfield        #29  <Field int b>
			c = false;
		//    6   11:aload_0         
		//    7   12:iconst_0        
		//    8   13:putfield        #31  <Field boolean c>
			d = false;
		//    9   16:aload_0         
		//   10   17:iconst_0        
		//   11   18:putfield        #33  <Field boolean d>
		//   12   21:return          
		}

		public void a(View view)
		{
			int k1 = e.j.b();
		//    0    0:aload_0         
		//    1    1:getfield        #18  <Field LinearLayoutManager e>
		//    2    4:getfield        #38  <Field ah LinearLayoutManager.j>
		//    3    7:invokevirtual   #43  <Method int ah.b()>
		//    4   10:istore_3        
			if(k1 >= 0)
		//*   5   11:iload_3         
		//*   6   12:iflt            21
			{
				b(view);
		//    7   15:aload_0         
		//    8   16:aload_1         
		//    9   17:invokevirtual   #45  <Method void b(View)>
				return;
		//   10   20:return          
			}
			a = e.d(view);
		//   11   21:aload_0         
		//   12   22:aload_0         
		//   13   23:getfield        #18  <Field LinearLayoutManager e>
		//   14   26:aload_1         
		//   15   27:invokevirtual   #48  <Method int LinearLayoutManager.d(View)>
		//   16   30:putfield        #26  <Field int a>
			if(c)
		//*  17   33:aload_0         
		//*  18   34:getfield        #31  <Field boolean c>
		//*  19   37:ifeq            162
			{
				int i1 = e.j.d() - k1 - e.j.b(view);
		//   20   40:aload_0         
		//   21   41:getfield        #18  <Field LinearLayoutManager e>
		//   22   44:getfield        #38  <Field ah LinearLayoutManager.j>
		//   23   47:invokevirtual   #50  <Method int ah.d()>
		//   24   50:iload_3         
		//   25   51:isub            
		//   26   52:aload_0         
		//   27   53:getfield        #18  <Field LinearLayoutManager e>
		//   28   56:getfield        #38  <Field ah LinearLayoutManager.j>
		//   29   59:aload_1         
		//   30   60:invokevirtual   #52  <Method int ah.b(View)>
		//   31   63:isub            
		//   32   64:istore_2        
				b = e.j.d() - i1;
		//   33   65:aload_0         
		//   34   66:aload_0         
		//   35   67:getfield        #18  <Field LinearLayoutManager e>
		//   36   70:getfield        #38  <Field ah LinearLayoutManager.j>
		//   37   73:invokevirtual   #50  <Method int ah.d()>
		//   38   76:iload_2         
		//   39   77:isub            
		//   40   78:putfield        #29  <Field int b>
				if(i1 > 0)
		//*  41   81:iload_2         
		//*  42   82:ifle            285
				{
					k1 = e.j.e(view);
		//   43   85:aload_0         
		//   44   86:getfield        #18  <Field LinearLayoutManager e>
		//   45   89:getfield        #38  <Field ah LinearLayoutManager.j>
		//   46   92:aload_1         
		//   47   93:invokevirtual   #54  <Method int ah.e(View)>
		//   48   96:istore_3        
					int l1 = b;
		//   49   97:aload_0         
		//   50   98:getfield        #29  <Field int b>
		//   51  101:istore          4
					int j2 = e.j.c();
		//   52  103:aload_0         
		//   53  104:getfield        #18  <Field LinearLayoutManager e>
		//   54  107:getfield        #38  <Field ah LinearLayoutManager.j>
		//   55  110:invokevirtual   #56  <Method int ah.c()>
		//   56  113:istore          5
					k1 = l1 - k1 - (j2 + Math.min(e.j.a(view) - j2, 0));
		//   57  115:iload           4
		//   58  117:iload_3         
		//   59  118:isub            
		//   60  119:iload           5
		//   61  121:aload_0         
		//   62  122:getfield        #18  <Field LinearLayoutManager e>
		//   63  125:getfield        #38  <Field ah LinearLayoutManager.j>
		//   64  128:aload_1         
		//   65  129:invokevirtual   #58  <Method int ah.a(View)>
		//   66  132:iload           5
		//   67  134:isub            
		//   68  135:iconst_0        
		//   69  136:invokestatic    #64  <Method int Math.min(int, int)>
		//   70  139:iadd            
		//   71  140:isub            
		//   72  141:istore_3        
					if(k1 < 0)
		//*  73  142:iload_3         
		//*  74  143:ifge            285
					{
						b = b + Math.min(i1, -k1);
		//   75  146:aload_0         
		//   76  147:aload_0         
		//   77  148:getfield        #29  <Field int b>
		//   78  151:iload_2         
		//   79  152:iload_3         
		//   80  153:ineg            
		//   81  154:invokestatic    #64  <Method int Math.min(int, int)>
		//   82  157:iadd            
		//   83  158:putfield        #29  <Field int b>
						return;
		//   84  161:return          
					}
				}
			} else
			{
				int i2 = e.j.a(view);
		//   85  162:aload_0         
		//   86  163:getfield        #18  <Field LinearLayoutManager e>
		//   87  166:getfield        #38  <Field ah LinearLayoutManager.j>
		//   88  169:aload_1         
		//   89  170:invokevirtual   #58  <Method int ah.a(View)>
		//   90  173:istore          4
				int j1 = i2 - e.j.c();
		//   91  175:iload           4
		//   92  177:aload_0         
		//   93  178:getfield        #18  <Field LinearLayoutManager e>
		//   94  181:getfield        #38  <Field ah LinearLayoutManager.j>
		//   95  184:invokevirtual   #56  <Method int ah.c()>
		//   96  187:isub            
		//   97  188:istore_2        
				b = i2;
		//   98  189:aload_0         
		//   99  190:iload           4
		//  100  192:putfield        #29  <Field int b>
				if(j1 > 0)
		//* 101  195:iload_2         
		//* 102  196:ifle            285
				{
					int k2 = e.j.e(view);
		//  103  199:aload_0         
		//  104  200:getfield        #18  <Field LinearLayoutManager e>
		//  105  203:getfield        #38  <Field ah LinearLayoutManager.j>
		//  106  206:aload_1         
		//  107  207:invokevirtual   #54  <Method int ah.e(View)>
		//  108  210:istore          5
					int l2 = e.j.d();
		//  109  212:aload_0         
		//  110  213:getfield        #18  <Field LinearLayoutManager e>
		//  111  216:getfield        #38  <Field ah LinearLayoutManager.j>
		//  112  219:invokevirtual   #50  <Method int ah.d()>
		//  113  222:istore          6
					int i3 = e.j.b(view);
		//  114  224:aload_0         
		//  115  225:getfield        #18  <Field LinearLayoutManager e>
		//  116  228:getfield        #38  <Field ah LinearLayoutManager.j>
		//  117  231:aload_1         
		//  118  232:invokevirtual   #52  <Method int ah.b(View)>
		//  119  235:istore          7
					k1 = e.j.d() - Math.min(0, l2 - k1 - i3) - (i2 + k2);
		//  120  237:aload_0         
		//  121  238:getfield        #18  <Field LinearLayoutManager e>
		//  122  241:getfield        #38  <Field ah LinearLayoutManager.j>
		//  123  244:invokevirtual   #50  <Method int ah.d()>
		//  124  247:iconst_0        
		//  125  248:iload           6
		//  126  250:iload_3         
		//  127  251:isub            
		//  128  252:iload           7
		//  129  254:isub            
		//  130  255:invokestatic    #64  <Method int Math.min(int, int)>
		//  131  258:isub            
		//  132  259:iload           4
		//  133  261:iload           5
		//  134  263:iadd            
		//  135  264:isub            
		//  136  265:istore_3        
					if(k1 < 0)
		//* 137  266:iload_3         
		//* 138  267:ifge            285
						b = b - Math.min(j1, -k1);
		//  139  270:aload_0         
		//  140  271:aload_0         
		//  141  272:getfield        #29  <Field int b>
		//  142  275:iload_2         
		//  143  276:iload_3         
		//  144  277:ineg            
		//  145  278:invokestatic    #64  <Method int Math.min(int, int)>
		//  146  281:isub            
		//  147  282:putfield        #29  <Field int b>
				}
			}
		//  148  285:return          
		}

		boolean a(View view, RecyclerView.r r)
		{
			view = ((View) ((RecyclerView.LayoutParams)view.getLayoutParams()));
		//    0    0:aload_1         
		//    1    1:invokevirtual   #71  <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
		//    2    4:checkcast       #73  <Class RecyclerView$LayoutParams>
		//    3    7:astore_1        
			return !((RecyclerView.LayoutParams) (view)).d() && ((RecyclerView.LayoutParams) (view)).f() >= 0 && ((RecyclerView.LayoutParams) (view)).f() < r.e();
		//    4    8:aload_1         
		//    5    9:invokevirtual   #76  <Method boolean RecyclerView$LayoutParams.d()>
		//    6   12:ifne            35
		//    7   15:aload_1         
		//    8   16:invokevirtual   #79  <Method int RecyclerView$LayoutParams.f()>
		//    9   19:iflt            35
		//   10   22:aload_1         
		//   11   23:invokevirtual   #79  <Method int RecyclerView$LayoutParams.f()>
		//   12   26:aload_2         
		//   13   27:invokevirtual   #83  <Method int RecyclerView$r.e()>
		//   14   30:icmpge          35
		//   15   33:iconst_1        
		//   16   34:ireturn         
		//   17   35:iconst_0        
		//   18   36:ireturn         
		}

		void b()
		{
			int i1;
			if(c)
		//*   0    0:aload_0         
		//*   1    1:getfield        #31  <Field boolean c>
		//*   2    4:ifeq            21
				i1 = e.j.d();
		//    3    7:aload_0         
		//    4    8:getfield        #18  <Field LinearLayoutManager e>
		//    5   11:getfield        #38  <Field ah LinearLayoutManager.j>
		//    6   14:invokevirtual   #50  <Method int ah.d()>
		//    7   17:istore_1        
			else
		//*   8   18:goto            32
				i1 = e.j.c();
		//    9   21:aload_0         
		//   10   22:getfield        #18  <Field LinearLayoutManager e>
		//   11   25:getfield        #38  <Field ah LinearLayoutManager.j>
		//   12   28:invokevirtual   #56  <Method int ah.c()>
		//   13   31:istore_1        
			b = i1;
		//   14   32:aload_0         
		//   15   33:iload_1         
		//   16   34:putfield        #29  <Field int b>
		//   17   37:return          
		}

		public void b(View view)
		{
			int i1;
			if(c)
		//*   0    0:aload_0         
		//*   1    1:getfield        #31  <Field boolean c>
		//*   2    4:ifeq            38
				i1 = e.j.b(view) + e.j.b();
		//    3    7:aload_0         
		//    4    8:getfield        #18  <Field LinearLayoutManager e>
		//    5   11:getfield        #38  <Field ah LinearLayoutManager.j>
		//    6   14:aload_1         
		//    7   15:invokevirtual   #52  <Method int ah.b(View)>
		//    8   18:aload_0         
		//    9   19:getfield        #18  <Field LinearLayoutManager e>
		//   10   22:getfield        #38  <Field ah LinearLayoutManager.j>
		//   11   25:invokevirtual   #43  <Method int ah.b()>
		//   12   28:iadd            
		//   13   29:istore_2        
			else
		//*  14   30:aload_0         
		//*  15   31:iload_2         
		//*  16   32:putfield        #29  <Field int b>
		//*  17   35:goto            53
				i1 = e.j.a(view);
		//   18   38:aload_0         
		//   19   39:getfield        #18  <Field LinearLayoutManager e>
		//   20   42:getfield        #38  <Field ah LinearLayoutManager.j>
		//   21   45:aload_1         
		//   22   46:invokevirtual   #58  <Method int ah.a(View)>
		//   23   49:istore_2        
			b = i1;
		//*  24   50:goto            30
			a = e.d(view);
		//   25   53:aload_0         
		//   26   54:aload_0         
		//   27   55:getfield        #18  <Field LinearLayoutManager e>
		//   28   58:aload_1         
		//   29   59:invokevirtual   #48  <Method int LinearLayoutManager.d(View)>
		//   30   62:putfield        #26  <Field int a>
		//   31   65:return          
		}

		public String toString()
		{
			StringBuilder stringbuilder = new StringBuilder();
		//    0    0:new             #87  <Class StringBuilder>
		//    1    3:dup             
		//    2    4:invokespecial   #88  <Method void StringBuilder()>
		//    3    7:astore_1        
			stringbuilder.append("AnchorInfo{mPosition=");
		//    4    8:aload_1         
		//    5    9:ldc1            #90  <String "AnchorInfo{mPosition=">
		//    6   11:invokevirtual   #94  <Method StringBuilder StringBuilder.append(String)>
		//    7   14:pop             
			stringbuilder.append(a);
		//    8   15:aload_1         
		//    9   16:aload_0         
		//   10   17:getfield        #26  <Field int a>
		//   11   20:invokevirtual   #97  <Method StringBuilder StringBuilder.append(int)>
		//   12   23:pop             
			stringbuilder.append(", mCoordinate=");
		//   13   24:aload_1         
		//   14   25:ldc1            #99  <String ", mCoordinate=">
		//   15   27:invokevirtual   #94  <Method StringBuilder StringBuilder.append(String)>
		//   16   30:pop             
			stringbuilder.append(b);
		//   17   31:aload_1         
		//   18   32:aload_0         
		//   19   33:getfield        #29  <Field int b>
		//   20   36:invokevirtual   #97  <Method StringBuilder StringBuilder.append(int)>
		//   21   39:pop             
			stringbuilder.append(", mLayoutFromEnd=");
		//   22   40:aload_1         
		//   23   41:ldc1            #101 <String ", mLayoutFromEnd=">
		//   24   43:invokevirtual   #94  <Method StringBuilder StringBuilder.append(String)>
		//   25   46:pop             
			stringbuilder.append(c);
		//   26   47:aload_1         
		//   27   48:aload_0         
		//   28   49:getfield        #31  <Field boolean c>
		//   29   52:invokevirtual   #104 <Method StringBuilder StringBuilder.append(boolean)>
		//   30   55:pop             
			stringbuilder.append(", mValid=");
		//   31   56:aload_1         
		//   32   57:ldc1            #106 <String ", mValid=">
		//   33   59:invokevirtual   #94  <Method StringBuilder StringBuilder.append(String)>
		//   34   62:pop             
			stringbuilder.append(d);
		//   35   63:aload_1         
		//   36   64:aload_0         
		//   37   65:getfield        #33  <Field boolean d>
		//   38   68:invokevirtual   #104 <Method StringBuilder StringBuilder.append(boolean)>
		//   39   71:pop             
			stringbuilder.append('}');
		//   40   72:aload_1         
		//   41   73:bipush          125
		//   42   75:invokevirtual   #109 <Method StringBuilder StringBuilder.append(char)>
		//   43   78:pop             
			return stringbuilder.toString();
		//   44   79:aload_1         
		//   45   80:invokevirtual   #111 <Method String StringBuilder.toString()>
		//   46   83:areturn         
		}

		int a;
		int b;
		boolean c;
		boolean d;
		final LinearLayoutManager e;

		a()
		{
			e = LinearLayoutManager.this;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #18  <Field LinearLayoutManager e>
			super();
		//    3    5:aload_0         
		//    4    6:invokespecial   #21  <Method void Object()>
			a();
		//    5    9:aload_0         
		//    6   10:invokevirtual   #23  <Method void a()>
		//    7   13:return          
		}
	}

	protected static class b
	{

		void a()
		{
			a = 0;
		//    0    0:aload_0         
		//    1    1:iconst_0        
		//    2    2:putfield        #19  <Field int a>
			b = false;
		//    3    5:aload_0         
		//    4    6:iconst_0        
		//    5    7:putfield        #21  <Field boolean b>
			c = false;
		//    6   10:aload_0         
		//    7   11:iconst_0        
		//    8   12:putfield        #23  <Field boolean c>
			d = false;
		//    9   15:aload_0         
		//   10   16:iconst_0        
		//   11   17:putfield        #25  <Field boolean d>
		//   12   20:return          
		}

		public int a;
		public boolean b;
		public boolean c;
		public boolean d;

		protected b()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #16  <Method void Object()>
		//    2    4:return          
		}
	}

	static class c
	{

		private View b()
		{
			int j1 = k.size();
		//    0    0:aload_0         
		//    1    1:getfield        #34  <Field List k>
		//    2    4:invokeinterface #42  <Method int List.size()>
		//    3    9:istore_2        
			for(int i1 = 0; i1 < j1; i1++)
		//*   4   10:iconst_0        
		//*   5   11:istore_1        
		//*   6   12:iload_1         
		//*   7   13:iload_2         
		//*   8   14:icmpge          80
			{
				View view = ((RecyclerView.u)k.get(i1)).a;
		//    9   17:aload_0         
		//   10   18:getfield        #34  <Field List k>
		//   11   21:iload_1         
		//   12   22:invokeinterface #46  <Method Object List.get(int)>
		//   13   27:checkcast       #48  <Class RecyclerView$u>
		//   14   30:getfield        #51  <Field View RecyclerView$u.a>
		//   15   33:astore_3        
				RecyclerView.LayoutParams layoutparams = (RecyclerView.LayoutParams)view.getLayoutParams();
		//   16   34:aload_3         
		//   17   35:invokevirtual   #57  <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
		//   18   38:checkcast       #59  <Class RecyclerView$LayoutParams>
		//   19   41:astore          4
				if(!layoutparams.d() && d == layoutparams.f())
		//*  20   43:aload           4
		//*  21   45:invokevirtual   #62  <Method boolean RecyclerView$LayoutParams.d()>
		//*  22   48:ifeq            54
		//*  23   51:goto            73
		//*  24   54:aload_0         
		//*  25   55:getfield        #64  <Field int d>
		//*  26   58:aload           4
		//*  27   60:invokevirtual   #66  <Method int RecyclerView$LayoutParams.f()>
		//*  28   63:icmpne          73
				{
					a(view);
		//   29   66:aload_0         
		//   30   67:aload_3         
		//   31   68:invokevirtual   #69  <Method void a(View)>
					return view;
		//   32   71:aload_3         
		//   33   72:areturn         
				}
			}

		//   34   73:iload_1         
		//   35   74:iconst_1        
		//   36   75:iadd            
		//   37   76:istore_1        
		//*  38   77:goto            12
			return null;
		//   39   80:aconst_null     
		//   40   81:areturn         
		}

		View a(RecyclerView.n n1)
		{
			if(k != null)
		//*   0    0:aload_0         
		//*   1    1:getfield        #34  <Field List k>
		//*   2    4:ifnull          12
			{
				return b();
		//    3    7:aload_0         
		//    4    8:invokespecial   #72  <Method View b()>
		//    5   11:areturn         
			} else
			{
				n1 = ((RecyclerView.n) (n1.c(d)));
		//    6   12:aload_1         
		//    7   13:aload_0         
		//    8   14:getfield        #64  <Field int d>
		//    9   17:invokevirtual   #77  <Method View RecyclerView$n.c(int)>
		//   10   20:astore_1        
				d = d + e;
		//   11   21:aload_0         
		//   12   22:aload_0         
		//   13   23:getfield        #64  <Field int d>
		//   14   26:aload_0         
		//   15   27:getfield        #79  <Field int e>
		//   16   30:iadd            
		//   17   31:putfield        #64  <Field int d>
				return ((View) (n1));
		//   18   34:aload_1         
		//   19   35:areturn         
			}
		}

		public void a()
		{
			a(((View) (null)));
		//    0    0:aload_0         
		//    1    1:aconst_null     
		//    2    2:invokevirtual   #69  <Method void a(View)>
		//    3    5:return          
		}

		public void a(View view)
		{
			view = b(view);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokevirtual   #82  <Method View b(View)>
		//    3    5:astore_1        
			int i1;
			if(view == null)
		//*   4    6:aload_1         
		//*   5    7:ifnonnull       18
				i1 = -1;
		//    6   10:iconst_m1       
		//    7   11:istore_2        
			else
		//*   8   12:aload_0         
		//*   9   13:iload_2         
		//*  10   14:putfield        #64  <Field int d>
		//*  11   17:return          
				i1 = ((RecyclerView.LayoutParams)view.getLayoutParams()).f();
		//   12   18:aload_1         
		//   13   19:invokevirtual   #57  <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
		//   14   22:checkcast       #59  <Class RecyclerView$LayoutParams>
		//   15   25:invokevirtual   #66  <Method int RecyclerView$LayoutParams.f()>
		//   16   28:istore_2        
			d = i1;
		//*  17   29:goto            12
		}

		boolean a(RecyclerView.r r)
		{
			return d >= 0 && d < r.e();
		//    0    0:aload_0         
		//    1    1:getfield        #64  <Field int d>
		//    2    4:iflt            20
		//    3    7:aload_0         
		//    4    8:getfield        #64  <Field int d>
		//    5   11:aload_1         
		//    6   12:invokevirtual   #87  <Method int RecyclerView$r.e()>
		//    7   15:icmpge          20
		//    8   18:iconst_1        
		//    9   19:ireturn         
		//   10   20:iconst_0        
		//   11   21:ireturn         
		}

		public View b(View view)
		{
			int i2 = k.size();
		//    0    0:aload_0         
		//    1    1:getfield        #34  <Field List k>
		//    2    4:invokeinterface #42  <Method int List.size()>
		//    3    9:istore          6
			View view1 = null;
		//    4   11:aconst_null     
		//    5   12:astore          7
			int j1 = 0x7fffffff;
		//    6   14:ldc1            #88  <Int 0x7fffffff>
		//    7   16:istore_3        
			for(int i1 = 0; i1 < i2;)
		//*   8   17:iconst_0        
		//*   9   18:istore_2        
		//*  10   19:iload_2         
		//*  11   20:iload           6
		//*  12   22:icmpge          159
			{
				View view3 = ((RecyclerView.u)k.get(i1)).a;
		//   13   25:aload_0         
		//   14   26:getfield        #34  <Field List k>
		//   15   29:iload_2         
		//   16   30:invokeinterface #46  <Method Object List.get(int)>
		//   17   35:checkcast       #48  <Class RecyclerView$u>
		//   18   38:getfield        #51  <Field View RecyclerView$u.a>
		//   19   41:astore          9
				RecyclerView.LayoutParams layoutparams = (RecyclerView.LayoutParams)view3.getLayoutParams();
		//   20   43:aload           9
		//   21   45:invokevirtual   #57  <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
		//   22   48:checkcast       #59  <Class RecyclerView$LayoutParams>
		//   23   51:astore          10
				View view2 = view1;
		//   24   53:aload           7
		//   25   55:astore          8
				int k1 = j1;
		//   26   57:iload_3         
		//   27   58:istore          4
				if(view3 != view)
		//*  28   60:aload           9
		//*  29   62:aload_1         
		//*  30   63:if_acmpeq       145
					if(layoutparams.d())
		//*  31   66:aload           10
		//*  32   68:invokevirtual   #62  <Method boolean RecyclerView$LayoutParams.d()>
		//*  33   71:ifeq            84
					{
						view2 = view1;
		//   34   74:aload           7
		//   35   76:astore          8
						k1 = j1;
		//   36   78:iload_3         
		//   37   79:istore          4
					} else
		//*  38   81:goto            145
					{
						int l1 = (layoutparams.f() - d) * e;
		//   39   84:aload           10
		//   40   86:invokevirtual   #66  <Method int RecyclerView$LayoutParams.f()>
		//   41   89:aload_0         
		//   42   90:getfield        #64  <Field int d>
		//   43   93:isub            
		//   44   94:aload_0         
		//   45   95:getfield        #79  <Field int e>
		//   46   98:imul            
		//   47   99:istore          5
						if(l1 < 0)
		//*  48  101:iload           5
		//*  49  103:ifge            116
						{
							view2 = view1;
		//   50  106:aload           7
		//   51  108:astore          8
							k1 = j1;
		//   52  110:iload_3         
		//   53  111:istore          4
						} else
		//*  54  113:goto            145
						{
							view2 = view1;
		//   55  116:aload           7
		//   56  118:astore          8
							k1 = j1;
		//   57  120:iload_3         
		//   58  121:istore          4
							if(l1 < j1)
		//*  59  123:iload           5
		//*  60  125:iload_3         
		//*  61  126:icmpge          145
							{
								if(l1 == 0)
		//*  62  129:iload           5
		//*  63  131:ifne            137
									return view3;
		//   64  134:aload           9
		//   65  136:areturn         
								view2 = view3;
		//   66  137:aload           9
		//   67  139:astore          8
								k1 = l1;
		//   68  141:iload           5
		//   69  143:istore          4
							}
						}
					}
				i1++;
		//   70  145:iload_2         
		//   71  146:iconst_1        
		//   72  147:iadd            
		//   73  148:istore_2        
				view1 = view2;
		//   74  149:aload           8
		//   75  151:astore          7
				j1 = k1;
		//   76  153:iload           4
		//   77  155:istore_3        
			}

		//*  78  156:goto            19
			return view1;
		//   79  159:aload           7
		//   80  161:areturn         
		}

		boolean a;
		int b;
		int c;
		int d;
		int e;
		int f;
		int g;
		int h;
		boolean i;
		int j;
		List k;
		boolean l;

		c()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #26  <Method void Object()>
			a = true;
		//    2    4:aload_0         
		//    3    5:iconst_1        
		//    4    6:putfield        #28  <Field boolean a>
			h = 0;
		//    5    9:aload_0         
		//    6   10:iconst_0        
		//    7   11:putfield        #30  <Field int h>
			i = false;
		//    8   14:aload_0         
		//    9   15:iconst_0        
		//   10   16:putfield        #32  <Field boolean i>
			k = null;
		//   11   19:aload_0         
		//   12   20:aconst_null     
		//   13   21:putfield        #34  <Field List k>
		//   14   24:return          
		}
	}


	public LinearLayoutManager(Context context)
	{
		this(context, 1, false);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iconst_1        
	//    3    3:iconst_0        
	//    4    4:invokespecial   #44  <Method void LinearLayoutManager(Context, int, boolean)>
	//    5    7:return          
	}

	public LinearLayoutManager(Context context, int i1, boolean flag)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #48  <Method void RecyclerView$h()>
		c = false;
	//    2    4:aload_0         
	//    3    5:iconst_0        
	//    4    6:putfield        #50  <Field boolean c>
		k = false;
	//    5    9:aload_0         
	//    6   10:iconst_0        
	//    7   11:putfield        #52  <Field boolean k>
		d = false;
	//    8   14:aload_0         
	//    9   15:iconst_0        
	//   10   16:putfield        #54  <Field boolean d>
		e = true;
	//   11   19:aload_0         
	//   12   20:iconst_1        
	//   13   21:putfield        #56  <Field boolean e>
		l = -1;
	//   14   24:aload_0         
	//   15   25:iconst_m1       
	//   16   26:putfield        #58  <Field int l>
		m = 0x80000000;
	//   17   29:aload_0         
	//   18   30:ldc1            #59  <Int 0x80000000>
	//   19   32:putfield        #61  <Field int m>
		n = null;
	//   20   35:aload_0         
	//   21   36:aconst_null     
	//   22   37:putfield        #63  <Field LinearLayoutManager$SavedState n>
		o = new a();
	//   23   40:aload_0         
	//   24   41:new             #13  <Class LinearLayoutManager$a>
	//   25   44:dup             
	//   26   45:aload_0         
	//   27   46:invokespecial   #66  <Method void LinearLayoutManager$a(LinearLayoutManager)>
	//   28   49:putfield        #68  <Field LinearLayoutManager$a o>
		g = new b();
	//   29   52:aload_0         
	//   30   53:new             #16  <Class LinearLayoutManager$b>
	//   31   56:dup             
	//   32   57:invokespecial   #69  <Method void LinearLayoutManager$b()>
	//   33   60:putfield        #71  <Field LinearLayoutManager$b g>
		h = 2;
	//   34   63:aload_0         
	//   35   64:iconst_2        
	//   36   65:putfield        #73  <Field int h>
		b(i1);
	//   37   68:aload_0         
	//   38   69:iload_2         
	//   39   70:invokevirtual   #76  <Method void b(int)>
		b(flag);
	//   40   73:aload_0         
	//   41   74:iload_3         
	//   42   75:invokevirtual   #79  <Method void b(boolean)>
		c(true);
	//   43   78:aload_0         
	//   44   79:iconst_1        
	//   45   80:invokevirtual   #81  <Method void c(boolean)>
	//   46   83:return          
	}

	public LinearLayoutManager(Context context, AttributeSet attributeset, int i1, int j1)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #48  <Method void RecyclerView$h()>
		c = false;
	//    2    4:aload_0         
	//    3    5:iconst_0        
	//    4    6:putfield        #50  <Field boolean c>
		k = false;
	//    5    9:aload_0         
	//    6   10:iconst_0        
	//    7   11:putfield        #52  <Field boolean k>
		d = false;
	//    8   14:aload_0         
	//    9   15:iconst_0        
	//   10   16:putfield        #54  <Field boolean d>
		e = true;
	//   11   19:aload_0         
	//   12   20:iconst_1        
	//   13   21:putfield        #56  <Field boolean e>
		l = -1;
	//   14   24:aload_0         
	//   15   25:iconst_m1       
	//   16   26:putfield        #58  <Field int l>
		m = 0x80000000;
	//   17   29:aload_0         
	//   18   30:ldc1            #59  <Int 0x80000000>
	//   19   32:putfield        #61  <Field int m>
		n = null;
	//   20   35:aload_0         
	//   21   36:aconst_null     
	//   22   37:putfield        #63  <Field LinearLayoutManager$SavedState n>
		o = new a();
	//   23   40:aload_0         
	//   24   41:new             #13  <Class LinearLayoutManager$a>
	//   25   44:dup             
	//   26   45:aload_0         
	//   27   46:invokespecial   #66  <Method void LinearLayoutManager$a(LinearLayoutManager)>
	//   28   49:putfield        #68  <Field LinearLayoutManager$a o>
		g = new b();
	//   29   52:aload_0         
	//   30   53:new             #16  <Class LinearLayoutManager$b>
	//   31   56:dup             
	//   32   57:invokespecial   #69  <Method void LinearLayoutManager$b()>
	//   33   60:putfield        #71  <Field LinearLayoutManager$b g>
		h = 2;
	//   34   63:aload_0         
	//   35   64:iconst_2        
	//   36   65:putfield        #73  <Field int h>
		context = ((Context) (a(context, attributeset, i1, j1)));
	//   37   68:aload_1         
	//   38   69:aload_2         
	//   39   70:iload_3         
	//   40   71:iload           4
	//   41   73:invokestatic    #85  <Method RecyclerView$h$b a(Context, AttributeSet, int, int)>
	//   42   76:astore_1        
		b(((RecyclerView.h.b) (context)).a);
	//   43   77:aload_0         
	//   44   78:aload_1         
	//   45   79:getfield        #89  <Field int RecyclerView$h$b.a>
	//   46   82:invokevirtual   #76  <Method void b(int)>
		b(((RecyclerView.h.b) (context)).c);
	//   47   85:aload_0         
	//   48   86:aload_1         
	//   49   87:getfield        #90  <Field boolean RecyclerView$h$b.c>
	//   50   90:invokevirtual   #79  <Method void b(boolean)>
		a(((RecyclerView.h.b) (context)).d);
	//   51   93:aload_0         
	//   52   94:aload_1         
	//   53   95:getfield        #91  <Field boolean RecyclerView$h$b.d>
	//   54   98:invokevirtual   #93  <Method void a(boolean)>
		c(true);
	//   55  101:aload_0         
	//   56  102:iconst_1        
	//   57  103:invokevirtual   #81  <Method void c(boolean)>
	//   58  106:return          
	}

	private void J()
	{
		boolean flag;
		if(i != 1 && g())
	//*   0    0:aload_0         
	//*   1    1:getfield        #96  <Field int i>
	//*   2    4:iconst_1        
	//*   3    5:icmpeq          28
	//*   4    8:aload_0         
	//*   5    9:invokevirtual   #99  <Method boolean g()>
	//*   6   12:ifne            18
	//*   7   15:goto            28
			flag = c ^ true;
	//    8   18:aload_0         
	//    9   19:getfield        #50  <Field boolean c>
	//   10   22:iconst_1        
	//   11   23:ixor            
	//   12   24:istore_1        
		else
	//*  13   25:goto            33
			flag = c;
	//   14   28:aload_0         
	//   15   29:getfield        #50  <Field boolean c>
	//   16   32:istore_1        
		k = flag;
	//   17   33:aload_0         
	//   18   34:iload_1         
	//   19   35:putfield        #52  <Field boolean k>
	//   20   38:return          
	}

	private View K()
	{
		int i1;
		if(k)
	//*   0    0:aload_0         
	//*   1    1:getfield        #52  <Field boolean k>
	//*   2    4:ifeq            17
			i1 = u() - 1;
	//    3    7:aload_0         
	//    4    8:invokevirtual   #105 <Method int u()>
	//    5   11:iconst_1        
	//    6   12:isub            
	//    7   13:istore_1        
		else
	//*   8   14:goto            19
			i1 = 0;
	//    9   17:iconst_0        
	//   10   18:istore_1        
		return h(i1);
	//   11   19:aload_0         
	//   12   20:iload_1         
	//   13   21:invokevirtual   #108 <Method View h(int)>
	//   14   24:areturn         
	}

	private View L()
	{
		int i1;
		if(k)
	//*   0    0:aload_0         
	//*   1    1:getfield        #52  <Field boolean k>
	//*   2    4:ifeq            12
			i1 = 0;
	//    3    7:iconst_0        
	//    4    8:istore_1        
		else
	//*   5    9:goto            19
			i1 = u() - 1;
	//    6   12:aload_0         
	//    7   13:invokevirtual   #105 <Method int u()>
	//    8   16:iconst_1        
	//    9   17:isub            
	//   10   18:istore_1        
		return h(i1);
	//   11   19:aload_0         
	//   12   20:iload_1         
	//   13   21:invokevirtual   #108 <Method View h(int)>
	//   14   24:areturn         
	}

	private int a(int i1, RecyclerView.n n1, RecyclerView.r r, boolean flag)
	{
		int j1 = j.d() - i1;
	//    0    0:aload_0         
	//    1    1:getfield        #112 <Field ah j>
	//    2    4:invokevirtual   #116 <Method int ah.d()>
	//    3    7:iload_1         
	//    4    8:isub            
	//    5    9:istore          5
		if(j1 > 0)
	//*   6   11:iload           5
	//*   7   13:ifle            66
		{
			j1 = -c(-j1, n1, r);
	//    8   16:aload_0         
	//    9   17:iload           5
	//   10   19:ineg            
	//   11   20:aload_2         
	//   12   21:aload_3         
	//   13   22:invokevirtual   #119 <Method int c(int, RecyclerView$n, RecyclerView$r)>
	//   14   25:ineg            
	//   15   26:istore          5
			if(flag)
	//*  16   28:iload           4
	//*  17   30:ifeq            63
			{
				i1 = j.d() - (i1 + j1);
	//   18   33:aload_0         
	//   19   34:getfield        #112 <Field ah j>
	//   20   37:invokevirtual   #116 <Method int ah.d()>
	//   21   40:iload_1         
	//   22   41:iload           5
	//   23   43:iadd            
	//   24   44:isub            
	//   25   45:istore_1        
				if(i1 > 0)
	//*  26   46:iload_1         
	//*  27   47:ifle            63
				{
					j.a(i1);
	//   28   50:aload_0         
	//   29   51:getfield        #112 <Field ah j>
	//   30   54:iload_1         
	//   31   55:invokevirtual   #121 <Method void ah.a(int)>
					return i1 + j1;
	//   32   58:iload_1         
	//   33   59:iload           5
	//   34   61:iadd            
	//   35   62:ireturn         
				}
			}
			return j1;
	//   36   63:iload           5
	//   37   65:ireturn         
		} else
		{
			return 0;
	//   38   66:iconst_0        
	//   39   67:ireturn         
		}
	}

	private View a(boolean flag, boolean flag1)
	{
		int i1;
		int j1;
		if(k)
	//*   0    0:aload_0         
	//*   1    1:getfield        #52  <Field boolean k>
	//*   2    4:ifeq            27
		{
			i1 = u() - 1;
	//    3    7:aload_0         
	//    4    8:invokevirtual   #105 <Method int u()>
	//    5   11:iconst_1        
	//    6   12:isub            
	//    7   13:istore_3        
			j1 = -1;
	//    8   14:iconst_m1       
	//    9   15:istore          4
		} else
	//*  10   17:aload_0         
	//*  11   18:iload_3         
	//*  12   19:iload           4
	//*  13   21:iload_1         
	//*  14   22:iload_2         
	//*  15   23:invokevirtual   #125 <Method View a(int, int, boolean, boolean)>
	//*  16   26:areturn         
		{
			i1 = 0;
	//   17   27:iconst_0        
	//   18   28:istore_3        
			j1 = u();
	//   19   29:aload_0         
	//   20   30:invokevirtual   #105 <Method int u()>
	//   21   33:istore          4
		}
		return a(i1, j1, flag, flag1);
	//*  22   35:goto            17
	}

	private void a(int i1, int j1)
	{
		a.c = j.d() - j1;
	//    0    0:aload_0         
	//    1    1:getfield        #128 <Field LinearLayoutManager$c a>
	//    2    4:aload_0         
	//    3    5:getfield        #112 <Field ah j>
	//    4    8:invokevirtual   #116 <Method int ah.d()>
	//    5   11:iload_2         
	//    6   12:isub            
	//    7   13:putfield        #130 <Field int LinearLayoutManager$c.c>
		c c1 = a;
	//    8   16:aload_0         
	//    9   17:getfield        #128 <Field LinearLayoutManager$c a>
	//   10   20:astore          4
		int k1;
		if(k)
	//*  11   22:aload_0         
	//*  12   23:getfield        #52  <Field boolean k>
	//*  13   26:ifeq            34
			k1 = -1;
	//   14   29:iconst_m1       
	//   15   30:istore_3        
		else
	//*  16   31:goto            36
			k1 = 1;
	//   17   34:iconst_1        
	//   18   35:istore_3        
		c1.e = k1;
	//   19   36:aload           4
	//   20   38:iload_3         
	//   21   39:putfield        #132 <Field int LinearLayoutManager$c.e>
		a.d = i1;
	//   22   42:aload_0         
	//   23   43:getfield        #128 <Field LinearLayoutManager$c a>
	//   24   46:iload_1         
	//   25   47:putfield        #134 <Field int LinearLayoutManager$c.d>
		a.f = 1;
	//   26   50:aload_0         
	//   27   51:getfield        #128 <Field LinearLayoutManager$c a>
	//   28   54:iconst_1        
	//   29   55:putfield        #136 <Field int LinearLayoutManager$c.f>
		a.b = j1;
	//   30   58:aload_0         
	//   31   59:getfield        #128 <Field LinearLayoutManager$c a>
	//   32   62:iload_2         
	//   33   63:putfield        #138 <Field int LinearLayoutManager$c.b>
		a.g = 0x80000000;
	//   34   66:aload_0         
	//   35   67:getfield        #128 <Field LinearLayoutManager$c a>
	//   36   70:ldc1            #59  <Int 0x80000000>
	//   37   72:putfield        #140 <Field int LinearLayoutManager$c.g>
	//   38   75:return          
	}

	private void a(int i1, int j1, boolean flag, RecyclerView.r r)
	{
		a.l = j();
	//    0    0:aload_0         
	//    1    1:getfield        #128 <Field LinearLayoutManager$c a>
	//    2    4:aload_0         
	//    3    5:invokevirtual   #143 <Method boolean j()>
	//    4    8:putfield        #145 <Field boolean LinearLayoutManager$c.l>
		a.h = b(r);
	//    5   11:aload_0         
	//    6   12:getfield        #128 <Field LinearLayoutManager$c a>
	//    7   15:aload_0         
	//    8   16:aload           4
	//    9   18:invokevirtual   #148 <Method int b(RecyclerView$r)>
	//   10   21:putfield        #149 <Field int LinearLayoutManager$c.h>
		a.f = i1;
	//   11   24:aload_0         
	//   12   25:getfield        #128 <Field LinearLayoutManager$c a>
	//   13   28:iload_1         
	//   14   29:putfield        #136 <Field int LinearLayoutManager$c.f>
		int k1 = -1;
	//   15   32:iconst_m1       
	//   16   33:istore          5
		if(i1 == 1)
	//*  17   35:iload_1         
	//*  18   36:iconst_1        
	//*  19   37:icmpne          154
		{
			r = ((RecyclerView.r) (a));
	//   20   40:aload_0         
	//   21   41:getfield        #128 <Field LinearLayoutManager$c a>
	//   22   44:astore          4
			r.h = ((c) (r)).h + j.g();
	//   23   46:aload           4
	//   24   48:aload           4
	//   25   50:getfield        #149 <Field int LinearLayoutManager$c.h>
	//   26   53:aload_0         
	//   27   54:getfield        #112 <Field ah j>
	//   28   57:invokevirtual   #151 <Method int ah.g()>
	//   29   60:iadd            
	//   30   61:putfield        #149 <Field int LinearLayoutManager$c.h>
			r = ((RecyclerView.r) (L()));
	//   31   64:aload_0         
	//   32   65:invokespecial   #153 <Method View L()>
	//   33   68:astore          4
			c c1 = a;
	//   34   70:aload_0         
	//   35   71:getfield        #128 <Field LinearLayoutManager$c a>
	//   36   74:astore          6
			if(!k)
	//*  37   76:aload_0         
	//*  38   77:getfield        #52  <Field boolean k>
	//*  39   80:ifeq            86
	//*  40   83:goto            89
				k1 = 1;
	//   41   86:iconst_1        
	//   42   87:istore          5
			c1.e = k1;
	//   43   89:aload           6
	//   44   91:iload           5
	//   45   93:putfield        #132 <Field int LinearLayoutManager$c.e>
			a.d = d(((View) (r))) + a.e;
	//   46   96:aload_0         
	//   47   97:getfield        #128 <Field LinearLayoutManager$c a>
	//   48  100:aload_0         
	//   49  101:aload           4
	//   50  103:invokevirtual   #156 <Method int d(View)>
	//   51  106:aload_0         
	//   52  107:getfield        #128 <Field LinearLayoutManager$c a>
	//   53  110:getfield        #132 <Field int LinearLayoutManager$c.e>
	//   54  113:iadd            
	//   55  114:putfield        #134 <Field int LinearLayoutManager$c.d>
			a.b = j.b(((View) (r)));
	//   56  117:aload_0         
	//   57  118:getfield        #128 <Field LinearLayoutManager$c a>
	//   58  121:aload_0         
	//   59  122:getfield        #112 <Field ah j>
	//   60  125:aload           4
	//   61  127:invokevirtual   #158 <Method int ah.b(View)>
	//   62  130:putfield        #138 <Field int LinearLayoutManager$c.b>
			i1 = j.b(((View) (r))) - j.d();
	//   63  133:aload_0         
	//   64  134:getfield        #112 <Field ah j>
	//   65  137:aload           4
	//   66  139:invokevirtual   #158 <Method int ah.b(View)>
	//   67  142:aload_0         
	//   68  143:getfield        #112 <Field ah j>
	//   69  146:invokevirtual   #116 <Method int ah.d()>
	//   70  149:isub            
	//   71  150:istore_1        
		} else
	//*  72  151:goto            263
		{
			r = ((RecyclerView.r) (K()));
	//   73  154:aload_0         
	//   74  155:invokespecial   #160 <Method View K()>
	//   75  158:astore          4
			c c2 = a;
	//   76  160:aload_0         
	//   77  161:getfield        #128 <Field LinearLayoutManager$c a>
	//   78  164:astore          6
			c2.h = c2.h + j.c();
	//   79  166:aload           6
	//   80  168:aload           6
	//   81  170:getfield        #149 <Field int LinearLayoutManager$c.h>
	//   82  173:aload_0         
	//   83  174:getfield        #112 <Field ah j>
	//   84  177:invokevirtual   #162 <Method int ah.c()>
	//   85  180:iadd            
	//   86  181:putfield        #149 <Field int LinearLayoutManager$c.h>
			c2 = a;
	//   87  184:aload_0         
	//   88  185:getfield        #128 <Field LinearLayoutManager$c a>
	//   89  188:astore          6
			if(k)
	//*  90  190:aload_0         
	//*  91  191:getfield        #52  <Field boolean k>
	//*  92  194:ifeq            200
				k1 = 1;
	//   93  197:iconst_1        
	//   94  198:istore          5
			c2.e = k1;
	//   95  200:aload           6
	//   96  202:iload           5
	//   97  204:putfield        #132 <Field int LinearLayoutManager$c.e>
			a.d = d(((View) (r))) + a.e;
	//   98  207:aload_0         
	//   99  208:getfield        #128 <Field LinearLayoutManager$c a>
	//  100  211:aload_0         
	//  101  212:aload           4
	//  102  214:invokevirtual   #156 <Method int d(View)>
	//  103  217:aload_0         
	//  104  218:getfield        #128 <Field LinearLayoutManager$c a>
	//  105  221:getfield        #132 <Field int LinearLayoutManager$c.e>
	//  106  224:iadd            
	//  107  225:putfield        #134 <Field int LinearLayoutManager$c.d>
			a.b = j.a(((View) (r)));
	//  108  228:aload_0         
	//  109  229:getfield        #128 <Field LinearLayoutManager$c a>
	//  110  232:aload_0         
	//  111  233:getfield        #112 <Field ah j>
	//  112  236:aload           4
	//  113  238:invokevirtual   #164 <Method int ah.a(View)>
	//  114  241:putfield        #138 <Field int LinearLayoutManager$c.b>
			i1 = -j.a(((View) (r))) + j.c();
	//  115  244:aload_0         
	//  116  245:getfield        #112 <Field ah j>
	//  117  248:aload           4
	//  118  250:invokevirtual   #164 <Method int ah.a(View)>
	//  119  253:ineg            
	//  120  254:aload_0         
	//  121  255:getfield        #112 <Field ah j>
	//  122  258:invokevirtual   #162 <Method int ah.c()>
	//  123  261:iadd            
	//  124  262:istore_1        
		}
		a.c = j1;
	//  125  263:aload_0         
	//  126  264:getfield        #128 <Field LinearLayoutManager$c a>
	//  127  267:iload_2         
	//  128  268:putfield        #130 <Field int LinearLayoutManager$c.c>
		if(flag)
	//* 129  271:iload_3         
	//* 130  272:ifeq            293
		{
			r = ((RecyclerView.r) (a));
	//  131  275:aload_0         
	//  132  276:getfield        #128 <Field LinearLayoutManager$c a>
	//  133  279:astore          4
			r.c = ((c) (r)).c - i1;
	//  134  281:aload           4
	//  135  283:aload           4
	//  136  285:getfield        #130 <Field int LinearLayoutManager$c.c>
	//  137  288:iload_1         
	//  138  289:isub            
	//  139  290:putfield        #130 <Field int LinearLayoutManager$c.c>
		}
		a.g = i1;
	//  140  293:aload_0         
	//  141  294:getfield        #128 <Field LinearLayoutManager$c a>
	//  142  297:iload_1         
	//  143  298:putfield        #140 <Field int LinearLayoutManager$c.g>
	//  144  301:return          
	}

	private void a(a a1)
	{
		a(a1.a, a1.b);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:getfield        #166 <Field int LinearLayoutManager$a.a>
	//    3    5:aload_1         
	//    4    6:getfield        #167 <Field int LinearLayoutManager$a.b>
	//    5    9:invokespecial   #169 <Method void a(int, int)>
	//    6   12:return          
	}

	private void a(RecyclerView.n n1, int i1)
	{
label0:
		{
			if(i1 < 0)
	//*   0    0:iload_2         
	//*   1    1:ifge            5
				return;
	//    2    4:return          
			int l1 = u();
	//    3    5:aload_0         
	//    4    6:invokevirtual   #105 <Method int u()>
	//    5    9:istore          4
			if(k)
	//*   6   11:aload_0         
	//*   7   12:getfield        #52  <Field boolean k>
	//*   8   15:ifeq            83
			{
				l1--;
	//    9   18:iload           4
	//   10   20:iconst_1        
	//   11   21:isub            
	//   12   22:istore          4
				for(int j1 = l1; j1 >= 0;)
	//*  13   24:iload           4
	//*  14   26:istore_3        
	//*  15   27:iload_3         
	//*  16   28:iflt            141
				{
					View view = h(j1);
	//   17   31:aload_0         
	//   18   32:iload_3         
	//   19   33:invokevirtual   #108 <Method View h(int)>
	//   20   36:astore          5
					if(j.b(view) <= i1 && j.c(view) <= i1)
	//*  21   38:aload_0         
	//*  22   39:getfield        #112 <Field ah j>
	//*  23   42:aload           5
	//*  24   44:invokevirtual   #158 <Method int ah.b(View)>
	//*  25   47:iload_2         
	//*  26   48:icmpgt          74
	//*  27   51:aload_0         
	//*  28   52:getfield        #112 <Field ah j>
	//*  29   55:aload           5
	//*  30   57:invokevirtual   #172 <Method int ah.c(View)>
	//*  31   60:iload_2         
	//*  32   61:icmple          67
	//*  33   64:goto            74
					{
						j1--;
	//   34   67:iload_3         
	//   35   68:iconst_1        
	//   36   69:isub            
	//   37   70:istore_3        
					} else
	//*  38   71:goto            27
					{
						a(n1, l1, j1);
	//   39   74:aload_0         
	//   40   75:aload_1         
	//   41   76:iload           4
	//   42   78:iload_3         
	//   43   79:invokespecial   #175 <Method void a(RecyclerView$n, int, int)>
						return;
	//   44   82:return          
					}
				}

				break label0;
			}
			int k1 = 0;
	//   45   83:iconst_0        
	//   46   84:istore_3        
			do
			{
				if(k1 >= l1)
					break label0;
	//   47   85:iload_3         
	//   48   86:iload           4
	//   49   88:icmpge          141
				View view1 = h(k1);
	//   50   91:aload_0         
	//   51   92:iload_3         
	//   52   93:invokevirtual   #108 <Method View h(int)>
	//   53   96:astore          5
				if(j.b(view1) > i1 || j.c(view1) > i1)
	//*  54   98:aload_0         
	//*  55   99:getfield        #112 <Field ah j>
	//*  56  102:aload           5
	//*  57  104:invokevirtual   #158 <Method int ah.b(View)>
	//*  58  107:iload_2         
	//*  59  108:icmpgt          134
	//*  60  111:aload_0         
	//*  61  112:getfield        #112 <Field ah j>
	//*  62  115:aload           5
	//*  63  117:invokevirtual   #172 <Method int ah.c(View)>
	//*  64  120:iload_2         
	//*  65  121:icmple          127
					break;
	//   66  124:goto            134
				k1++;
	//   67  127:iload_3         
	//   68  128:iconst_1        
	//   69  129:iadd            
	//   70  130:istore_3        
			} while(true);
	//   71  131:goto            85
			a(n1, 0, k1);
	//   72  134:aload_0         
	//   73  135:aload_1         
	//   74  136:iconst_0        
	//   75  137:iload_3         
	//   76  138:invokespecial   #175 <Method void a(RecyclerView$n, int, int)>
		}
	//   77  141:return          
	}

	private void a(RecyclerView.n n1, int i1, int j1)
	{
		if(i1 == j1)
	//*   0    0:iload_2         
	//*   1    1:iload_3         
	//*   2    2:icmpne          6
			return;
	//    3    5:return          
		int k1 = i1;
	//    4    6:iload_2         
	//    5    7:istore          4
		if(j1 > i1)
	//*   6    9:iload_3         
	//*   7   10:iload_2         
	//*   8   11:icmple          36
			for(j1--; j1 >= i1; j1--)
	//*   9   14:iload_3         
	//*  10   15:iconst_1        
	//*  11   16:isub            
	//*  12   17:istore_3        
	//*  13   18:iload_3         
	//*  14   19:iload_2         
	//*  15   20:icmplt          58
				a(j1, n1);
	//   16   23:aload_0         
	//   17   24:iload_3         
	//   18   25:aload_1         
	//   19   26:invokevirtual   #178 <Method void a(int, RecyclerView$n)>

	//   20   29:iload_3         
	//   21   30:iconst_1        
	//   22   31:isub            
	//   23   32:istore_3        
		else
	//*  24   33:goto            18
			for(; k1 > j1; k1--)
	//*  25   36:iload           4
	//*  26   38:iload_3         
	//*  27   39:icmple          58
				a(k1, n1);
	//   28   42:aload_0         
	//   29   43:iload           4
	//   30   45:aload_1         
	//   31   46:invokevirtual   #178 <Method void a(int, RecyclerView$n)>

	//   32   49:iload           4
	//   33   51:iconst_1        
	//   34   52:isub            
	//   35   53:istore          4
	//*  36   55:goto            36
	//   37   58:return          
	}

	private void a(RecyclerView.n n1, c c1)
	{
		if(c1.a)
	//*   0    0:aload_2         
	//*   1    1:getfield        #181 <Field boolean LinearLayoutManager$c.a>
	//*   2    4:ifeq            42
		{
			if(c1.l)
	//*   3    7:aload_2         
	//*   4    8:getfield        #145 <Field boolean LinearLayoutManager$c.l>
	//*   5   11:ifeq            15
				return;
	//    6   14:return          
			if(c1.f == -1)
	//*   7   15:aload_2         
	//*   8   16:getfield        #136 <Field int LinearLayoutManager$c.f>
	//*   9   19:iconst_m1       
	//*  10   20:icmpne          33
			{
				b(n1, c1.g);
	//   11   23:aload_0         
	//   12   24:aload_1         
	//   13   25:aload_2         
	//   14   26:getfield        #140 <Field int LinearLayoutManager$c.g>
	//   15   29:invokespecial   #183 <Method void b(RecyclerView$n, int)>
				return;
	//   16   32:return          
			}
			a(n1, c1.g);
	//   17   33:aload_0         
	//   18   34:aload_1         
	//   19   35:aload_2         
	//   20   36:getfield        #140 <Field int LinearLayoutManager$c.g>
	//   21   39:invokespecial   #185 <Method void a(RecyclerView$n, int)>
		}
	//   22   42:return          
	}

	private void a(RecyclerView.n n1, RecyclerView.r r, a a1)
	{
		if(a(r, a1))
	//*   0    0:aload_0         
	//*   1    1:aload_2         
	//*   2    2:aload_3         
	//*   3    3:invokespecial   #189 <Method boolean a(RecyclerView$r, LinearLayoutManager$a)>
	//*   4    6:ifeq            10
			return;
	//    5    9:return          
		if(b(n1, r, a1))
	//*   6   10:aload_0         
	//*   7   11:aload_1         
	//*   8   12:aload_2         
	//*   9   13:aload_3         
	//*  10   14:invokespecial   #192 <Method boolean b(RecyclerView$n, RecyclerView$r, LinearLayoutManager$a)>
	//*  11   17:ifeq            21
			return;
	//   12   20:return          
		a1.b();
	//   13   21:aload_3         
	//   14   22:invokevirtual   #194 <Method void LinearLayoutManager$a.b()>
		int i1;
		if(d)
	//*  15   25:aload_0         
	//*  16   26:getfield        #54  <Field boolean d>
	//*  17   29:ifeq            43
			i1 = r.e() - 1;
	//   18   32:aload_2         
	//   19   33:invokevirtual   #198 <Method int RecyclerView$r.e()>
	//   20   36:iconst_1        
	//   21   37:isub            
	//   22   38:istore          4
		else
	//*  23   40:goto            46
			i1 = 0;
	//   24   43:iconst_0        
	//   25   44:istore          4
		a1.a = i1;
	//   26   46:aload_3         
	//   27   47:iload           4
	//   28   49:putfield        #166 <Field int LinearLayoutManager$a.a>
	//   29   52:return          
	}

	private boolean a(RecyclerView.r r, a a1)
	{
		boolean flag = r.a();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #200 <Method boolean RecyclerView$r.a()>
	//    2    4:istore          4
		boolean flag2 = false;
	//    3    6:iconst_0        
	//    4    7:istore          5
		if(!flag)
	//*   5    9:iload           4
	//*   6   11:ifne            413
		{
			if(l == -1)
	//*   7   14:aload_0         
	//*   8   15:getfield        #58  <Field int l>
	//*   9   18:iconst_m1       
	//*  10   19:icmpne          24
				return false;
	//   11   22:iconst_0        
	//   12   23:ireturn         
			if(l >= 0 && l < r.e())
	//*  13   24:aload_0         
	//*  14   25:getfield        #58  <Field int l>
	//*  15   28:iflt            402
	//*  16   31:aload_0         
	//*  17   32:getfield        #58  <Field int l>
	//*  18   35:aload_1         
	//*  19   36:invokevirtual   #198 <Method int RecyclerView$r.e()>
	//*  20   39:icmplt          45
	//*  21   42:goto            402
			{
				a1.a = l;
	//   22   45:aload_2         
	//   23   46:aload_0         
	//   24   47:getfield        #58  <Field int l>
	//   25   50:putfield        #166 <Field int LinearLayoutManager$a.a>
				if(n != null && n.a())
	//*  26   53:aload_0         
	//*  27   54:getfield        #63  <Field LinearLayoutManager$SavedState n>
	//*  28   57:ifnull          130
	//*  29   60:aload_0         
	//*  30   61:getfield        #63  <Field LinearLayoutManager$SavedState n>
	//*  31   64:invokevirtual   #201 <Method boolean LinearLayoutManager$SavedState.a()>
	//*  32   67:ifeq            130
				{
					a1.c = n.c;
	//   33   70:aload_2         
	//   34   71:aload_0         
	//   35   72:getfield        #63  <Field LinearLayoutManager$SavedState n>
	//   36   75:getfield        #202 <Field boolean LinearLayoutManager$SavedState.c>
	//   37   78:putfield        #203 <Field boolean LinearLayoutManager$a.c>
					int i1;
					if(a1.c)
	//*  38   81:aload_2         
	//*  39   82:getfield        #203 <Field boolean LinearLayoutManager$a.c>
	//*  40   85:ifeq            111
						i1 = j.d() - n.b;
	//   41   88:aload_0         
	//   42   89:getfield        #112 <Field ah j>
	//   43   92:invokevirtual   #116 <Method int ah.d()>
	//   44   95:aload_0         
	//   45   96:getfield        #63  <Field LinearLayoutManager$SavedState n>
	//   46   99:getfield        #204 <Field int LinearLayoutManager$SavedState.b>
	//   47  102:isub            
	//   48  103:istore_3        
					else
	//*  49  104:aload_2         
	//*  50  105:iload_3         
	//*  51  106:putfield        #167 <Field int LinearLayoutManager$a.b>
	//*  52  109:iconst_1        
	//*  53  110:ireturn         
						i1 = j.c() + n.b;
	//   54  111:aload_0         
	//   55  112:getfield        #112 <Field ah j>
	//   56  115:invokevirtual   #162 <Method int ah.c()>
	//   57  118:aload_0         
	//   58  119:getfield        #63  <Field LinearLayoutManager$SavedState n>
	//   59  122:getfield        #204 <Field int LinearLayoutManager$SavedState.b>
	//   60  125:iadd            
	//   61  126:istore_3        
					a1.b = i1;
					return true;
				}
	//*  62  127:goto            104
				if(m == 0x80000000)
	//*  63  130:aload_0         
	//*  64  131:getfield        #61  <Field int m>
	//*  65  134:ldc1            #59  <Int 0x80000000>
	//*  66  136:icmpne          351
				{
					r = ((RecyclerView.r) (c(l)));
	//   67  139:aload_0         
	//   68  140:aload_0         
	//   69  141:getfield        #58  <Field int l>
	//   70  144:invokevirtual   #206 <Method View c(int)>
	//   71  147:astore_1        
					if(r != null)
	//*  72  148:aload_1         
	//*  73  149:ifnull          293
					{
						if(j.e(((View) (r))) > j.f())
	//*  74  152:aload_0         
	//*  75  153:getfield        #112 <Field ah j>
	//*  76  156:aload_1         
	//*  77  157:invokevirtual   #208 <Method int ah.e(View)>
	//*  78  160:aload_0         
	//*  79  161:getfield        #112 <Field ah j>
	//*  80  164:invokevirtual   #210 <Method int ah.f()>
	//*  81  167:icmple          176
						{
							a1.b();
	//   82  170:aload_2         
	//   83  171:invokevirtual   #194 <Method void LinearLayoutManager$a.b()>
							return true;
	//   84  174:iconst_1        
	//   85  175:ireturn         
						}
						if(j.a(((View) (r))) - j.c() < 0)
	//*  86  176:aload_0         
	//*  87  177:getfield        #112 <Field ah j>
	//*  88  180:aload_1         
	//*  89  181:invokevirtual   #164 <Method int ah.a(View)>
	//*  90  184:aload_0         
	//*  91  185:getfield        #112 <Field ah j>
	//*  92  188:invokevirtual   #162 <Method int ah.c()>
	//*  93  191:isub            
	//*  94  192:ifge            213
						{
							a1.b = j.c();
	//   95  195:aload_2         
	//   96  196:aload_0         
	//   97  197:getfield        #112 <Field ah j>
	//   98  200:invokevirtual   #162 <Method int ah.c()>
	//   99  203:putfield        #167 <Field int LinearLayoutManager$a.b>
							a1.c = false;
	//  100  206:aload_2         
	//  101  207:iconst_0        
	//  102  208:putfield        #203 <Field boolean LinearLayoutManager$a.c>
							return true;
	//  103  211:iconst_1        
	//  104  212:ireturn         
						}
						if(j.d() - j.b(((View) (r))) < 0)
	//* 105  213:aload_0         
	//* 106  214:getfield        #112 <Field ah j>
	//* 107  217:invokevirtual   #116 <Method int ah.d()>
	//* 108  220:aload_0         
	//* 109  221:getfield        #112 <Field ah j>
	//* 110  224:aload_1         
	//* 111  225:invokevirtual   #158 <Method int ah.b(View)>
	//* 112  228:isub            
	//* 113  229:ifge            250
						{
							a1.b = j.d();
	//  114  232:aload_2         
	//  115  233:aload_0         
	//  116  234:getfield        #112 <Field ah j>
	//  117  237:invokevirtual   #116 <Method int ah.d()>
	//  118  240:putfield        #167 <Field int LinearLayoutManager$a.b>
							a1.c = true;
	//  119  243:aload_2         
	//  120  244:iconst_1        
	//  121  245:putfield        #203 <Field boolean LinearLayoutManager$a.c>
							return true;
	//  122  248:iconst_1        
	//  123  249:ireturn         
						}
						int j1;
						if(a1.c)
	//* 124  250:aload_2         
	//* 125  251:getfield        #203 <Field boolean LinearLayoutManager$a.c>
	//* 126  254:ifeq            277
							j1 = j.b(((View) (r))) + j.b();
	//  127  257:aload_0         
	//  128  258:getfield        #112 <Field ah j>
	//  129  261:aload_1         
	//  130  262:invokevirtual   #158 <Method int ah.b(View)>
	//  131  265:aload_0         
	//  132  266:getfield        #112 <Field ah j>
	//  133  269:invokevirtual   #212 <Method int ah.b()>
	//  134  272:iadd            
	//  135  273:istore_3        
						else
	//* 136  274:goto            286
							j1 = j.a(((View) (r)));
	//  137  277:aload_0         
	//  138  278:getfield        #112 <Field ah j>
	//  139  281:aload_1         
	//  140  282:invokevirtual   #164 <Method int ah.a(View)>
	//  141  285:istore_3        
						a1.b = j1;
	//  142  286:aload_2         
	//  143  287:iload_3         
	//  144  288:putfield        #167 <Field int LinearLayoutManager$a.b>
						return true;
	//  145  291:iconst_1        
	//  146  292:ireturn         
					}
					if(u() > 0)
	//* 147  293:aload_0         
	//* 148  294:invokevirtual   #105 <Method int u()>
	//* 149  297:ifle            345
					{
						int k1 = d(h(0));
	//  150  300:aload_0         
	//  151  301:aload_0         
	//  152  302:iconst_0        
	//  153  303:invokevirtual   #108 <Method View h(int)>
	//  154  306:invokevirtual   #156 <Method int d(View)>
	//  155  309:istore_3        
						boolean flag1;
						if(l < k1)
	//* 156  310:aload_0         
	//* 157  311:getfield        #58  <Field int l>
	//* 158  314:iload_3         
	//* 159  315:icmpge          324
							flag1 = true;
	//  160  318:iconst_1        
	//  161  319:istore          4
						else
	//* 162  321:goto            327
							flag1 = false;
	//  163  324:iconst_0        
	//  164  325:istore          4
						if(flag1 == k)
	//* 165  327:iload           4
	//* 166  329:aload_0         
	//* 167  330:getfield        #52  <Field boolean k>
	//* 168  333:icmpne          339
							flag2 = true;
	//  169  336:iconst_1        
	//  170  337:istore          5
						a1.c = flag2;
	//  171  339:aload_2         
	//  172  340:iload           5
	//  173  342:putfield        #203 <Field boolean LinearLayoutManager$a.c>
					}
					a1.b();
	//  174  345:aload_2         
	//  175  346:invokevirtual   #194 <Method void LinearLayoutManager$a.b()>
					return true;
	//  176  349:iconst_1        
	//  177  350:ireturn         
				}
				a1.c = k;
	//  178  351:aload_2         
	//  179  352:aload_0         
	//  180  353:getfield        #52  <Field boolean k>
	//  181  356:putfield        #203 <Field boolean LinearLayoutManager$a.c>
				int l1;
				if(k)
	//* 182  359:aload_0         
	//* 183  360:getfield        #52  <Field boolean k>
	//* 184  363:ifeq            386
					l1 = j.d() - m;
	//  185  366:aload_0         
	//  186  367:getfield        #112 <Field ah j>
	//  187  370:invokevirtual   #116 <Method int ah.d()>
	//  188  373:aload_0         
	//  189  374:getfield        #61  <Field int m>
	//  190  377:isub            
	//  191  378:istore_3        
				else
	//* 192  379:aload_2         
	//* 193  380:iload_3         
	//* 194  381:putfield        #167 <Field int LinearLayoutManager$a.b>
	//* 195  384:iconst_1        
	//* 196  385:ireturn         
					l1 = j.c() + m;
	//  197  386:aload_0         
	//  198  387:getfield        #112 <Field ah j>
	//  199  390:invokevirtual   #162 <Method int ah.c()>
	//  200  393:aload_0         
	//  201  394:getfield        #61  <Field int m>
	//  202  397:iadd            
	//  203  398:istore_3        
				a1.b = l1;
				return true;
			}
	//* 204  399:goto            379
			l = -1;
	//  205  402:aload_0         
	//  206  403:iconst_m1       
	//  207  404:putfield        #58  <Field int l>
			m = 0x80000000;
	//  208  407:aload_0         
	//  209  408:ldc1            #59  <Int 0x80000000>
	//  210  410:putfield        #61  <Field int m>
		}
		return false;
	//  211  413:iconst_0        
	//  212  414:ireturn         
	}

	private int b(int i1, RecyclerView.n n1, RecyclerView.r r, boolean flag)
	{
		int j1 = i1 - j.c();
	//    0    0:iload_1         
	//    1    1:aload_0         
	//    2    2:getfield        #112 <Field ah j>
	//    3    5:invokevirtual   #162 <Method int ah.c()>
	//    4    8:isub            
	//    5    9:istore          5
		if(j1 > 0)
	//*   6   11:iload           5
	//*   7   13:ifle            75
		{
			int k1 = -c(j1, n1, r);
	//    8   16:aload_0         
	//    9   17:iload           5
	//   10   19:aload_2         
	//   11   20:aload_3         
	//   12   21:invokevirtual   #119 <Method int c(int, RecyclerView$n, RecyclerView$r)>
	//   13   24:ineg            
	//   14   25:istore          6
			j1 = k1;
	//   15   27:iload           6
	//   16   29:istore          5
			if(flag)
	//*  17   31:iload           4
	//*  18   33:ifeq            72
			{
				i1 = (i1 + k1) - j.c();
	//   19   36:iload_1         
	//   20   37:iload           6
	//   21   39:iadd            
	//   22   40:aload_0         
	//   23   41:getfield        #112 <Field ah j>
	//   24   44:invokevirtual   #162 <Method int ah.c()>
	//   25   47:isub            
	//   26   48:istore_1        
				j1 = k1;
	//   27   49:iload           6
	//   28   51:istore          5
				if(i1 > 0)
	//*  29   53:iload_1         
	//*  30   54:ifle            72
				{
					j.a(-i1);
	//   31   57:aload_0         
	//   32   58:getfield        #112 <Field ah j>
	//   33   61:iload_1         
	//   34   62:ineg            
	//   35   63:invokevirtual   #121 <Method void ah.a(int)>
					j1 = k1 - i1;
	//   36   66:iload           6
	//   37   68:iload_1         
	//   38   69:isub            
	//   39   70:istore          5
				}
			}
			return j1;
	//   40   72:iload           5
	//   41   74:ireturn         
		} else
		{
			return 0;
	//   42   75:iconst_0        
	//   43   76:ireturn         
		}
	}

	private View b(boolean flag, boolean flag1)
	{
		int i1;
		int j1;
		if(k)
	//*   0    0:aload_0         
	//*   1    1:getfield        #52  <Field boolean k>
	//*   2    4:ifeq            25
		{
			i1 = 0;
	//    3    7:iconst_0        
	//    4    8:istore_3        
			j1 = u();
	//    5    9:aload_0         
	//    6   10:invokevirtual   #105 <Method int u()>
	//    7   13:istore          4
		} else
	//*   8   15:aload_0         
	//*   9   16:iload_3         
	//*  10   17:iload           4
	//*  11   19:iload_1         
	//*  12   20:iload_2         
	//*  13   21:invokevirtual   #125 <Method View a(int, int, boolean, boolean)>
	//*  14   24:areturn         
		{
			i1 = u() - 1;
	//   15   25:aload_0         
	//   16   26:invokevirtual   #105 <Method int u()>
	//   17   29:iconst_1        
	//   18   30:isub            
	//   19   31:istore_3        
			j1 = -1;
	//   20   32:iconst_m1       
	//   21   33:istore          4
		}
		return a(i1, j1, flag, flag1);
	//*  22   35:goto            15
	}

	private void b(a a1)
	{
		h(a1.a, a1.b);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:getfield        #166 <Field int LinearLayoutManager$a.a>
	//    3    5:aload_1         
	//    4    6:getfield        #167 <Field int LinearLayoutManager$a.b>
	//    5    9:invokespecial   #214 <Method void h(int, int)>
	//    6   12:return          
	}

	private void b(RecyclerView.n n1, int i1)
	{
label0:
		{
			int j1 = u();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #105 <Method int u()>
	//    2    4:istore_3        
			if(i1 < 0)
	//*   3    5:iload_2         
	//*   4    6:ifge            10
				return;
	//    5    9:return          
			int k1 = j.e() - i1;
	//    6   10:aload_0         
	//    7   11:getfield        #112 <Field ah j>
	//    8   14:invokevirtual   #215 <Method int ah.e()>
	//    9   17:iload_2         
	//   10   18:isub            
	//   11   19:istore          4
			if(k)
	//*  12   21:aload_0         
	//*  13   22:getfield        #52  <Field boolean k>
	//*  14   25:ifeq            88
			{
				for(i1 = 0; i1 < j1;)
	//*  15   28:iconst_0        
	//*  16   29:istore_2        
	//*  17   30:iload_2         
	//*  18   31:iload_3         
	//*  19   32:icmpge          150
				{
					View view = h(i1);
	//   20   35:aload_0         
	//   21   36:iload_2         
	//   22   37:invokevirtual   #108 <Method View h(int)>
	//   23   40:astore          5
					if(j.a(view) >= k1 && j.d(view) >= k1)
	//*  24   42:aload_0         
	//*  25   43:getfield        #112 <Field ah j>
	//*  26   46:aload           5
	//*  27   48:invokevirtual   #164 <Method int ah.a(View)>
	//*  28   51:iload           4
	//*  29   53:icmplt          80
	//*  30   56:aload_0         
	//*  31   57:getfield        #112 <Field ah j>
	//*  32   60:aload           5
	//*  33   62:invokevirtual   #216 <Method int ah.d(View)>
	//*  34   65:iload           4
	//*  35   67:icmpge          73
	//*  36   70:goto            80
					{
						i1++;
	//   37   73:iload_2         
	//   38   74:iconst_1        
	//   39   75:iadd            
	//   40   76:istore_2        
					} else
	//*  41   77:goto            30
					{
						a(n1, 0, i1);
	//   42   80:aload_0         
	//   43   81:aload_1         
	//   44   82:iconst_0        
	//   45   83:iload_2         
	//   46   84:invokespecial   #175 <Method void a(RecyclerView$n, int, int)>
						return;
	//   47   87:return          
					}
				}

				break label0;
			}
			j1--;
	//   48   88:iload_3         
	//   49   89:iconst_1        
	//   50   90:isub            
	//   51   91:istore_3        
			i1 = j1;
	//   52   92:iload_3         
	//   53   93:istore_2        
			do
			{
				if(i1 < 0)
					break label0;
	//   54   94:iload_2         
	//   55   95:iflt            150
				View view1 = h(i1);
	//   56   98:aload_0         
	//   57   99:iload_2         
	//   58  100:invokevirtual   #108 <Method View h(int)>
	//   59  103:astore          5
				if(j.a(view1) < k1 || j.d(view1) < k1)
	//*  60  105:aload_0         
	//*  61  106:getfield        #112 <Field ah j>
	//*  62  109:aload           5
	//*  63  111:invokevirtual   #164 <Method int ah.a(View)>
	//*  64  114:iload           4
	//*  65  116:icmplt          143
	//*  66  119:aload_0         
	//*  67  120:getfield        #112 <Field ah j>
	//*  68  123:aload           5
	//*  69  125:invokevirtual   #216 <Method int ah.d(View)>
	//*  70  128:iload           4
	//*  71  130:icmpge          136
					break;
	//   72  133:goto            143
				i1--;
	//   73  136:iload_2         
	//   74  137:iconst_1        
	//   75  138:isub            
	//   76  139:istore_2        
			} while(true);
	//   77  140:goto            94
			a(n1, j1, i1);
	//   78  143:aload_0         
	//   79  144:aload_1         
	//   80  145:iload_3         
	//   81  146:iload_2         
	//   82  147:invokespecial   #175 <Method void a(RecyclerView$n, int, int)>
		}
	//   83  150:return          
	}

	private void b(RecyclerView.n n1, RecyclerView.r r, int i1, int j1)
	{
		if(r.b() && u() != 0 && !r.a())
	//*   0    0:aload_2         
	//*   1    1:invokevirtual   #219 <Method boolean RecyclerView$r.b()>
	//*   2    4:ifeq            312
	//*   3    7:aload_0         
	//*   4    8:invokevirtual   #105 <Method int u()>
	//*   5   11:ifeq            312
	//*   6   14:aload_2         
	//*   7   15:invokevirtual   #200 <Method boolean RecyclerView$r.a()>
	//*   8   18:ifne            312
		{
			if(!b())
	//*   9   21:aload_0         
	//*  10   22:invokevirtual   #220 <Method boolean b()>
	//*  11   25:ifne            29
				return;
	//   12   28:return          
			List list = n1.c();
	//   13   29:aload_1         
	//   14   30:invokevirtual   #225 <Method List RecyclerView$n.c()>
	//   15   33:astore          13
			int j2 = list.size();
	//   16   35:aload           13
	//   17   37:invokeinterface #230 <Method int List.size()>
	//   18   42:istore          9
			int k2 = d(h(0));
	//   19   44:aload_0         
	//   20   45:aload_0         
	//   21   46:iconst_0        
	//   22   47:invokevirtual   #108 <Method View h(int)>
	//   23   50:invokevirtual   #156 <Method int d(View)>
	//   24   53:istore          10
			int k1 = 0;
	//   25   55:iconst_0        
	//   26   56:istore          5
			int i2 = 0;
	//   27   58:iconst_0        
	//   28   59:istore          7
			int l1 = 0;
	//   29   61:iconst_0        
	//   30   62:istore          6
			for(; k1 < j2; k1++)
	//*  31   64:iload           5
	//*  32   66:iload           9
	//*  33   68:icmpge          186
			{
				RecyclerView.u u = (RecyclerView.u)list.get(k1);
	//   34   71:aload           13
	//   35   73:iload           5
	//   36   75:invokeinterface #234 <Method Object List.get(int)>
	//   37   80:checkcast       #236 <Class RecyclerView$u>
	//   38   83:astore          14
				if(u.q())
	//*  39   85:aload           14
	//*  40   87:invokevirtual   #239 <Method boolean RecyclerView$u.q()>
	//*  41   90:ifeq            96
					continue;
	//   42   93:goto            177
				int l2 = u.d();
	//   43   96:aload           14
	//   44   98:invokevirtual   #240 <Method int RecyclerView$u.d()>
	//   45  101:istore          11
				byte byte0 = 1;
	//   46  103:iconst_1        
	//   47  104:istore          8
				boolean flag;
				if(l2 < k2)
	//*  48  106:iload           11
	//*  49  108:iload           10
	//*  50  110:icmpge          119
					flag = true;
	//   51  113:iconst_1        
	//   52  114:istore          12
				else
	//*  53  116:goto            122
					flag = false;
	//   54  119:iconst_0        
	//   55  120:istore          12
				if(flag != k)
	//*  56  122:iload           12
	//*  57  124:aload_0         
	//*  58  125:getfield        #52  <Field boolean k>
	//*  59  128:icmpeq          134
					byte0 = -1;
	//   60  131:iconst_m1       
	//   61  132:istore          8
				if(byte0 == -1)
	//*  62  134:iload           8
	//*  63  136:iconst_m1       
	//*  64  137:icmpne          160
					i2 += j.e(u.a);
	//   65  140:iload           7
	//   66  142:aload_0         
	//   67  143:getfield        #112 <Field ah j>
	//   68  146:aload           14
	//   69  148:getfield        #243 <Field View RecyclerView$u.a>
	//   70  151:invokevirtual   #208 <Method int ah.e(View)>
	//   71  154:iadd            
	//   72  155:istore          7
				else
	//*  73  157:goto            177
					l1 += j.e(u.a);
	//   74  160:iload           6
	//   75  162:aload_0         
	//   76  163:getfield        #112 <Field ah j>
	//   77  166:aload           14
	//   78  168:getfield        #243 <Field View RecyclerView$u.a>
	//   79  171:invokevirtual   #208 <Method int ah.e(View)>
	//   80  174:iadd            
	//   81  175:istore          6
			}

	//   82  177:iload           5
	//   83  179:iconst_1        
	//   84  180:iadd            
	//   85  181:istore          5
	//*  86  183:goto            64
			a.k = list;
	//   87  186:aload_0         
	//   88  187:getfield        #128 <Field LinearLayoutManager$c a>
	//   89  190:aload           13
	//   90  192:putfield        #246 <Field List LinearLayoutManager$c.k>
			if(i2 > 0)
	//*  91  195:iload           7
	//*  92  197:ifle            249
			{
				h(d(K()), i1);
	//   93  200:aload_0         
	//   94  201:aload_0         
	//   95  202:aload_0         
	//   96  203:invokespecial   #160 <Method View K()>
	//   97  206:invokevirtual   #156 <Method int d(View)>
	//   98  209:iload_3         
	//   99  210:invokespecial   #214 <Method void h(int, int)>
				a.h = i2;
	//  100  213:aload_0         
	//  101  214:getfield        #128 <Field LinearLayoutManager$c a>
	//  102  217:iload           7
	//  103  219:putfield        #149 <Field int LinearLayoutManager$c.h>
				a.c = 0;
	//  104  222:aload_0         
	//  105  223:getfield        #128 <Field LinearLayoutManager$c a>
	//  106  226:iconst_0        
	//  107  227:putfield        #130 <Field int LinearLayoutManager$c.c>
				a.a();
	//  108  230:aload_0         
	//  109  231:getfield        #128 <Field LinearLayoutManager$c a>
	//  110  234:invokevirtual   #248 <Method void LinearLayoutManager$c.a()>
				a(n1, a, r, false);
	//  111  237:aload_0         
	//  112  238:aload_1         
	//  113  239:aload_0         
	//  114  240:getfield        #128 <Field LinearLayoutManager$c a>
	//  115  243:aload_2         
	//  116  244:iconst_0        
	//  117  245:invokevirtual   #251 <Method int a(RecyclerView$n, LinearLayoutManager$c, RecyclerView$r, boolean)>
	//  118  248:pop             
			}
			if(l1 > 0)
	//* 119  249:iload           6
	//* 120  251:ifle            304
			{
				a(d(L()), j1);
	//  121  254:aload_0         
	//  122  255:aload_0         
	//  123  256:aload_0         
	//  124  257:invokespecial   #153 <Method View L()>
	//  125  260:invokevirtual   #156 <Method int d(View)>
	//  126  263:iload           4
	//  127  265:invokespecial   #169 <Method void a(int, int)>
				a.h = l1;
	//  128  268:aload_0         
	//  129  269:getfield        #128 <Field LinearLayoutManager$c a>
	//  130  272:iload           6
	//  131  274:putfield        #149 <Field int LinearLayoutManager$c.h>
				a.c = 0;
	//  132  277:aload_0         
	//  133  278:getfield        #128 <Field LinearLayoutManager$c a>
	//  134  281:iconst_0        
	//  135  282:putfield        #130 <Field int LinearLayoutManager$c.c>
				a.a();
	//  136  285:aload_0         
	//  137  286:getfield        #128 <Field LinearLayoutManager$c a>
	//  138  289:invokevirtual   #248 <Method void LinearLayoutManager$c.a()>
				a(n1, a, r, false);
	//  139  292:aload_0         
	//  140  293:aload_1         
	//  141  294:aload_0         
	//  142  295:getfield        #128 <Field LinearLayoutManager$c a>
	//  143  298:aload_2         
	//  144  299:iconst_0        
	//  145  300:invokevirtual   #251 <Method int a(RecyclerView$n, LinearLayoutManager$c, RecyclerView$r, boolean)>
	//  146  303:pop             
			}
			a.k = null;
	//  147  304:aload_0         
	//  148  305:getfield        #128 <Field LinearLayoutManager$c a>
	//  149  308:aconst_null     
	//  150  309:putfield        #246 <Field List LinearLayoutManager$c.k>
		}
	//  151  312:return          
	}

	private boolean b(RecyclerView.n n1, RecyclerView.r r, a a1)
	{
		int j1 = u();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #105 <Method int u()>
	//    2    4:istore          5
		boolean flag = false;
	//    3    6:iconst_0        
	//    4    7:istore          4
		if(j1 == 0)
	//*   5    9:iload           5
	//*   6   11:ifne            16
			return false;
	//    7   14:iconst_0        
	//    8   15:ireturn         
		View view = D();
	//    9   16:aload_0         
	//   10   17:invokevirtual   #254 <Method View D()>
	//   11   20:astore          6
		if(view != null && a1.a(view, r))
	//*  12   22:aload           6
	//*  13   24:ifnull          45
	//*  14   27:aload_3         
	//*  15   28:aload           6
	//*  16   30:aload_2         
	//*  17   31:invokevirtual   #257 <Method boolean LinearLayoutManager$a.a(View, RecyclerView$r)>
	//*  18   34:ifeq            45
		{
			a1.a(view);
	//   19   37:aload_3         
	//   20   38:aload           6
	//   21   40:invokevirtual   #260 <Method void LinearLayoutManager$a.a(View)>
			return true;
	//   22   43:iconst_1        
	//   23   44:ireturn         
		}
		if(b != d)
	//*  24   45:aload_0         
	//*  25   46:getfield        #262 <Field boolean b>
	//*  26   49:aload_0         
	//*  27   50:getfield        #54  <Field boolean d>
	//*  28   53:icmpeq          58
			return false;
	//   29   56:iconst_0        
	//   30   57:ireturn         
		if(a1.c)
	//*  31   58:aload_3         
	//*  32   59:getfield        #203 <Field boolean LinearLayoutManager$a.c>
	//*  33   62:ifeq            75
			n1 = ((RecyclerView.n) (f(n1, r)));
	//   34   65:aload_0         
	//   35   66:aload_1         
	//   36   67:aload_2         
	//   37   68:invokespecial   #265 <Method View f(RecyclerView$n, RecyclerView$r)>
	//   38   71:astore_1        
		else
	//*  39   72:goto            82
			n1 = ((RecyclerView.n) (g(n1, r)));
	//   40   75:aload_0         
	//   41   76:aload_1         
	//   42   77:aload_2         
	//   43   78:invokespecial   #267 <Method View g(RecyclerView$n, RecyclerView$r)>
	//   44   81:astore_1        
		if(n1 != null)
	//*  45   82:aload_1         
	//*  46   83:ifnull          185
		{
			a1.b(((View) (n1)));
	//   47   86:aload_3         
	//   48   87:aload_1         
	//   49   88:invokevirtual   #269 <Method void LinearLayoutManager$a.b(View)>
			if(!r.a() && b())
	//*  50   91:aload_2         
	//*  51   92:invokevirtual   #200 <Method boolean RecyclerView$r.a()>
	//*  52   95:ifne            183
	//*  53   98:aload_0         
	//*  54   99:invokevirtual   #220 <Method boolean b()>
	//*  55  102:ifeq            183
			{
				if(j.a(((View) (n1))) >= j.d() || j.b(((View) (n1))) < j.c())
	//*  56  105:aload_0         
	//*  57  106:getfield        #112 <Field ah j>
	//*  58  109:aload_1         
	//*  59  110:invokevirtual   #164 <Method int ah.a(View)>
	//*  60  113:aload_0         
	//*  61  114:getfield        #112 <Field ah j>
	//*  62  117:invokevirtual   #116 <Method int ah.d()>
	//*  63  120:icmpge          141
	//*  64  123:aload_0         
	//*  65  124:getfield        #112 <Field ah j>
	//*  66  127:aload_1         
	//*  67  128:invokevirtual   #158 <Method int ah.b(View)>
	//*  68  131:aload_0         
	//*  69  132:getfield        #112 <Field ah j>
	//*  70  135:invokevirtual   #162 <Method int ah.c()>
	//*  71  138:icmpge          144
					flag = true;
	//   72  141:iconst_1        
	//   73  142:istore          4
				if(flag)
	//*  74  144:iload           4
	//*  75  146:ifeq            183
				{
					int i1;
					if(a1.c)
	//*  76  149:aload_3         
	//*  77  150:getfield        #203 <Field boolean LinearLayoutManager$a.c>
	//*  78  153:ifeq            168
						i1 = j.d();
	//   79  156:aload_0         
	//   80  157:getfield        #112 <Field ah j>
	//   81  160:invokevirtual   #116 <Method int ah.d()>
	//   82  163:istore          4
					else
	//*  83  165:goto            177
						i1 = j.c();
	//   84  168:aload_0         
	//   85  169:getfield        #112 <Field ah j>
	//   86  172:invokevirtual   #162 <Method int ah.c()>
	//   87  175:istore          4
					a1.b = i1;
	//   88  177:aload_3         
	//   89  178:iload           4
	//   90  180:putfield        #167 <Field int LinearLayoutManager$a.b>
				}
			}
			return true;
	//   91  183:iconst_1        
	//   92  184:ireturn         
		} else
		{
			return false;
	//   93  185:iconst_0        
	//   94  186:ireturn         
		}
	}

	private View f(RecyclerView.n n1, RecyclerView.r r)
	{
		if(k)
	//*   0    0:aload_0         
	//*   1    1:getfield        #52  <Field boolean k>
	//*   2    4:ifeq            14
			return h(n1, r);
	//    3    7:aload_0         
	//    4    8:aload_1         
	//    5    9:aload_2         
	//    6   10:invokespecial   #271 <Method View h(RecyclerView$n, RecyclerView$r)>
	//    7   13:areturn         
		else
			return i(n1, r);
	//    8   14:aload_0         
	//    9   15:aload_1         
	//   10   16:aload_2         
	//   11   17:invokespecial   #273 <Method View i(RecyclerView$n, RecyclerView$r)>
	//   12   20:areturn         
	}

	private View g(RecyclerView.n n1, RecyclerView.r r)
	{
		if(k)
	//*   0    0:aload_0         
	//*   1    1:getfield        #52  <Field boolean k>
	//*   2    4:ifeq            14
			return i(n1, r);
	//    3    7:aload_0         
	//    4    8:aload_1         
	//    5    9:aload_2         
	//    6   10:invokespecial   #273 <Method View i(RecyclerView$n, RecyclerView$r)>
	//    7   13:areturn         
		else
			return h(n1, r);
	//    8   14:aload_0         
	//    9   15:aload_1         
	//   10   16:aload_2         
	//   11   17:invokespecial   #271 <Method View h(RecyclerView$n, RecyclerView$r)>
	//   12   20:areturn         
	}

	private View h(RecyclerView.n n1, RecyclerView.r r)
	{
		return a(n1, r, 0, u(), r.e());
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:iconst_0        
	//    4    4:aload_0         
	//    5    5:invokevirtual   #105 <Method int u()>
	//    6    8:aload_2         
	//    7    9:invokevirtual   #198 <Method int RecyclerView$r.e()>
	//    8   12:invokevirtual   #276 <Method View a(RecyclerView$n, RecyclerView$r, int, int, int)>
	//    9   15:areturn         
	}

	private void h(int i1, int j1)
	{
		a.c = j1 - j.c();
	//    0    0:aload_0         
	//    1    1:getfield        #128 <Field LinearLayoutManager$c a>
	//    2    4:iload_2         
	//    3    5:aload_0         
	//    4    6:getfield        #112 <Field ah j>
	//    5    9:invokevirtual   #162 <Method int ah.c()>
	//    6   12:isub            
	//    7   13:putfield        #130 <Field int LinearLayoutManager$c.c>
		a.d = i1;
	//    8   16:aload_0         
	//    9   17:getfield        #128 <Field LinearLayoutManager$c a>
	//   10   20:iload_1         
	//   11   21:putfield        #134 <Field int LinearLayoutManager$c.d>
		c c1 = a;
	//   12   24:aload_0         
	//   13   25:getfield        #128 <Field LinearLayoutManager$c a>
	//   14   28:astore_3        
		if(k)
	//*  15   29:aload_0         
	//*  16   30:getfield        #52  <Field boolean k>
	//*  17   33:ifeq            41
			i1 = 1;
	//   18   36:iconst_1        
	//   19   37:istore_1        
		else
	//*  20   38:goto            43
			i1 = -1;
	//   21   41:iconst_m1       
	//   22   42:istore_1        
		c1.e = i1;
	//   23   43:aload_3         
	//   24   44:iload_1         
	//   25   45:putfield        #132 <Field int LinearLayoutManager$c.e>
		a.f = -1;
	//   26   48:aload_0         
	//   27   49:getfield        #128 <Field LinearLayoutManager$c a>
	//   28   52:iconst_m1       
	//   29   53:putfield        #136 <Field int LinearLayoutManager$c.f>
		a.b = j1;
	//   30   56:aload_0         
	//   31   57:getfield        #128 <Field LinearLayoutManager$c a>
	//   32   60:iload_2         
	//   33   61:putfield        #138 <Field int LinearLayoutManager$c.b>
		a.g = 0x80000000;
	//   34   64:aload_0         
	//   35   65:getfield        #128 <Field LinearLayoutManager$c a>
	//   36   68:ldc1            #59  <Int 0x80000000>
	//   37   70:putfield        #140 <Field int LinearLayoutManager$c.g>
	//   38   73:return          
	}

	private int i(RecyclerView.r r)
	{
		if(u() == 0)
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #105 <Method int u()>
	//*   2    4:ifne            9
		{
			return 0;
	//    3    7:iconst_0        
	//    4    8:ireturn         
		} else
		{
			h();
	//    5    9:aload_0         
	//    6   10:invokevirtual   #278 <Method void h()>
			return an.a(r, j, a(e ^ true, true), b(e ^ true, true), ((RecyclerView.h) (this)), e, k);
	//    7   13:aload_1         
	//    8   14:aload_0         
	//    9   15:getfield        #112 <Field ah j>
	//   10   18:aload_0         
	//   11   19:aload_0         
	//   12   20:getfield        #56  <Field boolean e>
	//   13   23:iconst_1        
	//   14   24:ixor            
	//   15   25:iconst_1        
	//   16   26:invokespecial   #280 <Method View a(boolean, boolean)>
	//   17   29:aload_0         
	//   18   30:aload_0         
	//   19   31:getfield        #56  <Field boolean e>
	//   20   34:iconst_1        
	//   21   35:ixor            
	//   22   36:iconst_1        
	//   23   37:invokespecial   #282 <Method View b(boolean, boolean)>
	//   24   40:aload_0         
	//   25   41:aload_0         
	//   26   42:getfield        #56  <Field boolean e>
	//   27   45:aload_0         
	//   28   46:getfield        #52  <Field boolean k>
	//   29   49:invokestatic    #287 <Method int an.a(RecyclerView$r, ah, View, View, RecyclerView$h, boolean, boolean)>
	//   30   52:ireturn         
		}
	}

	private View i(RecyclerView.n n1, RecyclerView.r r)
	{
		return a(n1, r, u() - 1, -1, r.e());
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:aload_0         
	//    4    4:invokevirtual   #105 <Method int u()>
	//    5    7:iconst_1        
	//    6    8:isub            
	//    7    9:iconst_m1       
	//    8   10:aload_2         
	//    9   11:invokevirtual   #198 <Method int RecyclerView$r.e()>
	//   10   14:invokevirtual   #276 <Method View a(RecyclerView$n, RecyclerView$r, int, int, int)>
	//   11   17:areturn         
	}

	private int j(RecyclerView.r r)
	{
		if(u() == 0)
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #105 <Method int u()>
	//*   2    4:ifne            9
		{
			return 0;
	//    3    7:iconst_0        
	//    4    8:ireturn         
		} else
		{
			h();
	//    5    9:aload_0         
	//    6   10:invokevirtual   #278 <Method void h()>
			return an.a(r, j, a(e ^ true, true), b(e ^ true, true), ((RecyclerView.h) (this)), e);
	//    7   13:aload_1         
	//    8   14:aload_0         
	//    9   15:getfield        #112 <Field ah j>
	//   10   18:aload_0         
	//   11   19:aload_0         
	//   12   20:getfield        #56  <Field boolean e>
	//   13   23:iconst_1        
	//   14   24:ixor            
	//   15   25:iconst_1        
	//   16   26:invokespecial   #280 <Method View a(boolean, boolean)>
	//   17   29:aload_0         
	//   18   30:aload_0         
	//   19   31:getfield        #56  <Field boolean e>
	//   20   34:iconst_1        
	//   21   35:ixor            
	//   22   36:iconst_1        
	//   23   37:invokespecial   #282 <Method View b(boolean, boolean)>
	//   24   40:aload_0         
	//   25   41:aload_0         
	//   26   42:getfield        #56  <Field boolean e>
	//   27   45:invokestatic    #290 <Method int an.a(RecyclerView$r, ah, View, View, RecyclerView$h, boolean)>
	//   28   48:ireturn         
		}
	}

	private View j(RecyclerView.n n1, RecyclerView.r r)
	{
		if(k)
	//*   0    0:aload_0         
	//*   1    1:getfield        #52  <Field boolean k>
	//*   2    4:ifeq            14
			return l(n1, r);
	//    3    7:aload_0         
	//    4    8:aload_1         
	//    5    9:aload_2         
	//    6   10:invokespecial   #292 <Method View l(RecyclerView$n, RecyclerView$r)>
	//    7   13:areturn         
		else
			return m(n1, r);
	//    8   14:aload_0         
	//    9   15:aload_1         
	//   10   16:aload_2         
	//   11   17:invokespecial   #294 <Method View m(RecyclerView$n, RecyclerView$r)>
	//   12   20:areturn         
	}

	private int k(RecyclerView.r r)
	{
		if(u() == 0)
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #105 <Method int u()>
	//*   2    4:ifne            9
		{
			return 0;
	//    3    7:iconst_0        
	//    4    8:ireturn         
		} else
		{
			h();
	//    5    9:aload_0         
	//    6   10:invokevirtual   #278 <Method void h()>
			return an.b(r, j, a(e ^ true, true), b(e ^ true, true), ((RecyclerView.h) (this)), e);
	//    7   13:aload_1         
	//    8   14:aload_0         
	//    9   15:getfield        #112 <Field ah j>
	//   10   18:aload_0         
	//   11   19:aload_0         
	//   12   20:getfield        #56  <Field boolean e>
	//   13   23:iconst_1        
	//   14   24:ixor            
	//   15   25:iconst_1        
	//   16   26:invokespecial   #280 <Method View a(boolean, boolean)>
	//   17   29:aload_0         
	//   18   30:aload_0         
	//   19   31:getfield        #56  <Field boolean e>
	//   20   34:iconst_1        
	//   21   35:ixor            
	//   22   36:iconst_1        
	//   23   37:invokespecial   #282 <Method View b(boolean, boolean)>
	//   24   40:aload_0         
	//   25   41:aload_0         
	//   26   42:getfield        #56  <Field boolean e>
	//   27   45:invokestatic    #296 <Method int an.b(RecyclerView$r, ah, View, View, RecyclerView$h, boolean)>
	//   28   48:ireturn         
		}
	}

	private View k(RecyclerView.n n1, RecyclerView.r r)
	{
		if(k)
	//*   0    0:aload_0         
	//*   1    1:getfield        #52  <Field boolean k>
	//*   2    4:ifeq            14
			return m(n1, r);
	//    3    7:aload_0         
	//    4    8:aload_1         
	//    5    9:aload_2         
	//    6   10:invokespecial   #294 <Method View m(RecyclerView$n, RecyclerView$r)>
	//    7   13:areturn         
		else
			return l(n1, r);
	//    8   14:aload_0         
	//    9   15:aload_1         
	//   10   16:aload_2         
	//   11   17:invokespecial   #292 <Method View l(RecyclerView$n, RecyclerView$r)>
	//   12   20:areturn         
	}

	private View l(RecyclerView.n n1, RecyclerView.r r)
	{
		return c(0, u());
	//    0    0:aload_0         
	//    1    1:iconst_0        
	//    2    2:aload_0         
	//    3    3:invokevirtual   #105 <Method int u()>
	//    4    6:invokevirtual   #299 <Method View c(int, int)>
	//    5    9:areturn         
	}

	private View m(RecyclerView.n n1, RecyclerView.r r)
	{
		return c(u() - 1, -1);
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:invokevirtual   #105 <Method int u()>
	//    3    5:iconst_1        
	//    4    6:isub            
	//    5    7:iconst_m1       
	//    6    8:invokevirtual   #299 <Method View c(int, int)>
	//    7   11:areturn         
	}

	public int a(int i1, RecyclerView.n n1, RecyclerView.r r)
	{
		if(i == 1)
	//*   0    0:aload_0         
	//*   1    1:getfield        #96  <Field int i>
	//*   2    4:iconst_1        
	//*   3    5:icmpne          10
			return 0;
	//    4    8:iconst_0        
	//    5    9:ireturn         
		else
			return c(i1, n1, r);
	//    6   10:aload_0         
	//    7   11:iload_1         
	//    8   12:aload_2         
	//    9   13:aload_3         
	//   10   14:invokevirtual   #119 <Method int c(int, RecyclerView$n, RecyclerView$r)>
	//   11   17:ireturn         
	}

	int a(RecyclerView.n n1, c c1, RecyclerView.r r, boolean flag)
	{
		int k1 = c1.c;
	//    0    0:aload_2         
	//    1    1:getfield        #130 <Field int LinearLayoutManager$c.c>
	//    2    4:istore          7
		if(c1.g != 0x80000000)
	//*   3    6:aload_2         
	//*   4    7:getfield        #140 <Field int LinearLayoutManager$c.g>
	//*   5   10:ldc1            #59  <Int 0x80000000>
	//*   6   12:icmpeq          41
		{
			if(c1.c < 0)
	//*   7   15:aload_2         
	//*   8   16:getfield        #130 <Field int LinearLayoutManager$c.c>
	//*   9   19:ifge            35
				c1.g = c1.g + c1.c;
	//   10   22:aload_2         
	//   11   23:aload_2         
	//   12   24:getfield        #140 <Field int LinearLayoutManager$c.g>
	//   13   27:aload_2         
	//   14   28:getfield        #130 <Field int LinearLayoutManager$c.c>
	//   15   31:iadd            
	//   16   32:putfield        #140 <Field int LinearLayoutManager$c.g>
			a(n1, c1);
	//   17   35:aload_0         
	//   18   36:aload_1         
	//   19   37:aload_2         
	//   20   38:invokespecial   #301 <Method void a(RecyclerView$n, LinearLayoutManager$c)>
		}
		int i1 = c1.c + c1.h;
	//   21   41:aload_2         
	//   22   42:getfield        #130 <Field int LinearLayoutManager$c.c>
	//   23   45:aload_2         
	//   24   46:getfield        #149 <Field int LinearLayoutManager$c.h>
	//   25   49:iadd            
	//   26   50:istore          5
		b b1 = g;
	//   27   52:aload_0         
	//   28   53:getfield        #71  <Field LinearLayoutManager$b g>
	//   29   56:astore          8
label0:
		do
		{
			int j1;
			do
			{
label1:
				{
					if(!c1.l && i1 <= 0 || !c1.a(r))
						break label0;
	//   30   58:aload_2         
	//   31   59:getfield        #145 <Field boolean LinearLayoutManager$c.l>
	//   32   62:ifne            70
	//   33   65:iload           5
	//   34   67:ifle            245
	//   35   70:aload_2         
	//   36   71:aload_3         
	//   37   72:invokevirtual   #304 <Method boolean LinearLayoutManager$c.a(RecyclerView$r)>
	//   38   75:ifeq            245
					b1.a();
	//   39   78:aload           8
	//   40   80:invokevirtual   #305 <Method void LinearLayoutManager$b.a()>
					a(n1, r, c1, b1);
	//   41   83:aload_0         
	//   42   84:aload_1         
	//   43   85:aload_3         
	//   44   86:aload_2         
	//   45   87:aload           8
	//   46   89:invokevirtual   #308 <Method void a(RecyclerView$n, RecyclerView$r, LinearLayoutManager$c, LinearLayoutManager$b)>
					if(b1.b)
	//*  47   92:aload           8
	//*  48   94:getfield        #309 <Field boolean LinearLayoutManager$b.b>
	//*  49   97:ifeq            103
						break label0;
	//   50  100:goto            245
					c1.b = c1.b + b1.a * c1.f;
	//   51  103:aload_2         
	//   52  104:aload_2         
	//   53  105:getfield        #138 <Field int LinearLayoutManager$c.b>
	//   54  108:aload           8
	//   55  110:getfield        #310 <Field int LinearLayoutManager$b.a>
	//   56  113:aload_2         
	//   57  114:getfield        #136 <Field int LinearLayoutManager$c.f>
	//   58  117:imul            
	//   59  118:iadd            
	//   60  119:putfield        #138 <Field int LinearLayoutManager$c.b>
					if(b1.c && a.k == null)
	//*  61  122:aload           8
	//*  62  124:getfield        #311 <Field boolean LinearLayoutManager$b.c>
	//*  63  127:ifeq            151
	//*  64  130:aload_0         
	//*  65  131:getfield        #128 <Field LinearLayoutManager$c a>
	//*  66  134:getfield        #246 <Field List LinearLayoutManager$c.k>
	//*  67  137:ifnonnull       151
					{
						j1 = i1;
	//   68  140:iload           5
	//   69  142:istore          6
						if(r.a())
							break label1;
	//   70  144:aload_3         
	//   71  145:invokevirtual   #200 <Method boolean RecyclerView$r.a()>
	//   72  148:ifne            175
					}
					c1.c = c1.c - b1.a;
	//   73  151:aload_2         
	//   74  152:aload_2         
	//   75  153:getfield        #130 <Field int LinearLayoutManager$c.c>
	//   76  156:aload           8
	//   77  158:getfield        #310 <Field int LinearLayoutManager$b.a>
	//   78  161:isub            
	//   79  162:putfield        #130 <Field int LinearLayoutManager$c.c>
					j1 = i1 - b1.a;
	//   80  165:iload           5
	//   81  167:aload           8
	//   82  169:getfield        #310 <Field int LinearLayoutManager$b.a>
	//   83  172:isub            
	//   84  173:istore          6
				}
				if(c1.g != 0x80000000)
	//*  85  175:aload_2         
	//*  86  176:getfield        #140 <Field int LinearLayoutManager$c.g>
	//*  87  179:ldc1            #59  <Int 0x80000000>
	//*  88  181:icmpeq          224
				{
					c1.g = c1.g + b1.a;
	//   89  184:aload_2         
	//   90  185:aload_2         
	//   91  186:getfield        #140 <Field int LinearLayoutManager$c.g>
	//   92  189:aload           8
	//   93  191:getfield        #310 <Field int LinearLayoutManager$b.a>
	//   94  194:iadd            
	//   95  195:putfield        #140 <Field int LinearLayoutManager$c.g>
					if(c1.c < 0)
	//*  96  198:aload_2         
	//*  97  199:getfield        #130 <Field int LinearLayoutManager$c.c>
	//*  98  202:ifge            218
						c1.g = c1.g + c1.c;
	//   99  205:aload_2         
	//  100  206:aload_2         
	//  101  207:getfield        #140 <Field int LinearLayoutManager$c.g>
	//  102  210:aload_2         
	//  103  211:getfield        #130 <Field int LinearLayoutManager$c.c>
	//  104  214:iadd            
	//  105  215:putfield        #140 <Field int LinearLayoutManager$c.g>
					a(n1, c1);
	//  106  218:aload_0         
	//  107  219:aload_1         
	//  108  220:aload_2         
	//  109  221:invokespecial   #301 <Method void a(RecyclerView$n, LinearLayoutManager$c)>
				}
				i1 = j1;
	//  110  224:iload           6
	//  111  226:istore          5
			} while(!flag);
	//  112  228:iload           4
	//  113  230:ifeq            58
			i1 = j1;
	//  114  233:iload           6
	//  115  235:istore          5
		} while(!b1.d);
	//  116  237:aload           8
	//  117  239:getfield        #312 <Field boolean LinearLayoutManager$b.d>
	//  118  242:ifeq            58
		return k1 - c1.c;
	//  119  245:iload           7
	//  120  247:aload_2         
	//  121  248:getfield        #130 <Field int LinearLayoutManager$c.c>
	//  122  251:isub            
	//  123  252:ireturn         
	}

	public RecyclerView.LayoutParams a()
	{
		return new RecyclerView.LayoutParams(-2, -2);
	//    0    0:new             #315 <Class RecyclerView$LayoutParams>
	//    1    3:dup             
	//    2    4:bipush          -2
	//    3    6:bipush          -2
	//    4    8:invokespecial   #317 <Method void RecyclerView$LayoutParams(int, int)>
	//    5   11:areturn         
	}

	View a(int i1, int j1, boolean flag, boolean flag1)
	{
		h();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #278 <Method void h()>
		char c2 = '\u0140';
	//    2    4:sipush          320
	//    3    7:istore          6
		char c1;
		if(flag)
	//*   4    9:iload_3         
	//*   5   10:ifeq            21
			c1 = '\u6003';
	//    6   13:sipush          24579
	//    7   16:istore          5
		else
	//*   8   18:goto            26
			c1 = '\u0140';
	//    9   21:sipush          320
	//   10   24:istore          5
		if(!flag1)
	//*  11   26:iload           4
	//*  12   28:ifeq            34
	//*  13   31:goto            37
			c2 = '\0';
	//   14   34:iconst_0        
	//   15   35:istore          6
		bb bb1;
		if(i == 0)
	//*  16   37:aload_0         
	//*  17   38:getfield        #96  <Field int i>
	//*  18   41:ifne            62
			bb1 = r;
	//   19   44:aload_0         
	//   20   45:getfield        #321 <Field bb r>
	//   21   48:astore          7
		else
	//*  22   50:aload           7
	//*  23   52:iload_1         
	//*  24   53:iload_2         
	//*  25   54:iload           5
	//*  26   56:iload           6
	//*  27   58:invokevirtual   #326 <Method View bb.a(int, int, int, int)>
	//*  28   61:areturn         
			bb1 = s;
	//   29   62:aload_0         
	//   30   63:getfield        #329 <Field bb s>
	//   31   66:astore          7
		return bb1.a(i1, j1, ((int) (c1)), ((int) (c2)));
	//*  32   68:goto            50
	}

	View a(RecyclerView.n n1, RecyclerView.r r, int i1, int j1, int k1)
	{
		h();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #278 <Method void h()>
		int l1 = j.c();
	//    2    4:aload_0         
	//    3    5:getfield        #112 <Field ah j>
	//    4    8:invokevirtual   #162 <Method int ah.c()>
	//    5   11:istore          7
		int i2 = j.d();
	//    6   13:aload_0         
	//    7   14:getfield        #112 <Field ah j>
	//    8   17:invokevirtual   #116 <Method int ah.d()>
	//    9   20:istore          8
		byte byte0;
		if(j1 > i1)
	//*  10   22:iload           4
	//*  11   24:iload_3         
	//*  12   25:icmple          34
			byte0 = 1;
	//   13   28:iconst_1        
	//   14   29:istore          6
		else
	//*  15   31:goto            37
			byte0 = -1;
	//   16   34:iconst_m1       
	//   17   35:istore          6
		r = null;
	//   18   37:aconst_null     
	//   19   38:astore_2        
		Object obj1;
		for(n1 = null; i1 != j1; n1 = ((RecyclerView.n) (obj1)))
	//*  20   39:aconst_null     
	//*  21   40:astore_1        
	//*  22   41:iload_3         
	//*  23   42:iload           4
	//*  24   44:icmpeq          185
		{
			View view = h(i1);
	//   25   47:aload_0         
	//   26   48:iload_3         
	//   27   49:invokevirtual   #108 <Method View h(int)>
	//   28   52:astore          12
			int j2 = d(view);
	//   29   54:aload_0         
	//   30   55:aload           12
	//   31   57:invokevirtual   #156 <Method int d(View)>
	//   32   60:istore          9
			Object obj = ((Object) (r));
	//   33   62:aload_2         
	//   34   63:astore          10
			obj1 = ((Object) (n1));
	//   35   65:aload_1         
	//   36   66:astore          11
			if(j2 >= 0)
	//*  37   68:iload           9
	//*  38   70:iflt            171
			{
				obj = ((Object) (r));
	//   39   73:aload_2         
	//   40   74:astore          10
				obj1 = ((Object) (n1));
	//   41   76:aload_1         
	//   42   77:astore          11
				if(j2 < k1)
	//*  43   79:iload           9
	//*  44   81:iload           5
	//*  45   83:icmpge          171
					if(((RecyclerView.LayoutParams)view.getLayoutParams()).d())
	//*  46   86:aload           12
	//*  47   88:invokevirtual   #335 <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//*  48   91:checkcast       #315 <Class RecyclerView$LayoutParams>
	//*  49   94:invokevirtual   #337 <Method boolean RecyclerView$LayoutParams.d()>
	//*  50   97:ifeq            120
					{
						obj = ((Object) (r));
	//   51  100:aload_2         
	//   52  101:astore          10
						obj1 = ((Object) (n1));
	//   53  103:aload_1         
	//   54  104:astore          11
						if(n1 == null)
	//*  55  106:aload_1         
	//*  56  107:ifnonnull       171
						{
							obj1 = ((Object) (view));
	//   57  110:aload           12
	//   58  112:astore          11
							obj = ((Object) (r));
	//   59  114:aload_2         
	//   60  115:astore          10
						}
					} else
	//*  61  117:goto            171
					{
						if(j.a(view) < i2 && j.b(view) >= l1)
	//*  62  120:aload_0         
	//*  63  121:getfield        #112 <Field ah j>
	//*  64  124:aload           12
	//*  65  126:invokevirtual   #164 <Method int ah.a(View)>
	//*  66  129:iload           8
	//*  67  131:icmpge          154
	//*  68  134:aload_0         
	//*  69  135:getfield        #112 <Field ah j>
	//*  70  138:aload           12
	//*  71  140:invokevirtual   #158 <Method int ah.b(View)>
	//*  72  143:iload           7
	//*  73  145:icmpge          151
	//*  74  148:goto            154
							return view;
	//   75  151:aload           12
	//   76  153:areturn         
						obj = ((Object) (r));
	//   77  154:aload_2         
	//   78  155:astore          10
						obj1 = ((Object) (n1));
	//   79  157:aload_1         
	//   80  158:astore          11
						if(r == null)
	//*  81  160:aload_2         
	//*  82  161:ifnonnull       171
						{
							obj = ((Object) (view));
	//   83  164:aload           12
	//   84  166:astore          10
							obj1 = ((Object) (n1));
	//   85  168:aload_1         
	//   86  169:astore          11
						}
					}
			}
			i1 += ((int) (byte0));
	//   87  171:iload_3         
	//   88  172:iload           6
	//   89  174:iadd            
	//   90  175:istore_3        
			r = ((RecyclerView.r) (obj));
	//   91  176:aload           10
	//   92  178:astore_2        
		}

	//   93  179:aload           11
	//   94  181:astore_1        
	//*  95  182:goto            41
		if(r != null)
	//*  96  185:aload_2         
	//*  97  186:ifnull          191
			return ((View) (r));
	//   98  189:aload_2         
	//   99  190:areturn         
		else
			return ((View) (n1));
	//  100  191:aload_1         
	//  101  192:areturn         
	}

	public View a(View view, int i1, RecyclerView.n n1, RecyclerView.r r)
	{
		J();
	//    0    0:aload_0         
	//    1    1:invokespecial   #340 <Method void J()>
		if(u() == 0)
	//*   2    4:aload_0         
	//*   3    5:invokevirtual   #105 <Method int u()>
	//*   4    8:ifne            13
			return null;
	//    5   11:aconst_null     
	//    6   12:areturn         
		i1 = e(i1);
	//    7   13:aload_0         
	//    8   14:iload_2         
	//    9   15:invokevirtual   #343 <Method int e(int)>
	//   10   18:istore_2        
		if(i1 == 0x80000000)
	//*  11   19:iload_2         
	//*  12   20:ldc1            #59  <Int 0x80000000>
	//*  13   22:icmpne          27
			return null;
	//   14   25:aconst_null     
	//   15   26:areturn         
		h();
	//   16   27:aload_0         
	//   17   28:invokevirtual   #278 <Method void h()>
		h();
	//   18   31:aload_0         
	//   19   32:invokevirtual   #278 <Method void h()>
		a(i1, (int)((float)j.f() * 0.3333333F), false, r);
	//   20   35:aload_0         
	//   21   36:iload_2         
	//   22   37:aload_0         
	//   23   38:getfield        #112 <Field ah j>
	//   24   41:invokevirtual   #210 <Method int ah.f()>
	//   25   44:i2f             
	//   26   45:ldc2            #344 <Float 0.3333333F>
	//   27   48:fmul            
	//   28   49:f2i             
	//   29   50:iconst_0        
	//   30   51:aload           4
	//   31   53:invokespecial   #346 <Method void a(int, int, boolean, RecyclerView$r)>
		a.g = 0x80000000;
	//   32   56:aload_0         
	//   33   57:getfield        #128 <Field LinearLayoutManager$c a>
	//   34   60:ldc1            #59  <Int 0x80000000>
	//   35   62:putfield        #140 <Field int LinearLayoutManager$c.g>
		a.a = false;
	//   36   65:aload_0         
	//   37   66:getfield        #128 <Field LinearLayoutManager$c a>
	//   38   69:iconst_0        
	//   39   70:putfield        #181 <Field boolean LinearLayoutManager$c.a>
		a(n1, a, r, true);
	//   40   73:aload_0         
	//   41   74:aload_3         
	//   42   75:aload_0         
	//   43   76:getfield        #128 <Field LinearLayoutManager$c a>
	//   44   79:aload           4
	//   45   81:iconst_1        
	//   46   82:invokevirtual   #251 <Method int a(RecyclerView$n, LinearLayoutManager$c, RecyclerView$r, boolean)>
	//   47   85:pop             
		if(i1 == -1)
	//*  48   86:iload_2         
	//*  49   87:iconst_m1       
	//*  50   88:icmpne          102
			view = k(n1, r);
	//   51   91:aload_0         
	//   52   92:aload_3         
	//   53   93:aload           4
	//   54   95:invokespecial   #348 <Method View k(RecyclerView$n, RecyclerView$r)>
	//   55   98:astore_1        
		else
	//*  56   99:goto            110
			view = j(n1, r);
	//   57  102:aload_0         
	//   58  103:aload_3         
	//   59  104:aload           4
	//   60  106:invokespecial   #350 <Method View j(RecyclerView$n, RecyclerView$r)>
	//   61  109:astore_1        
		if(i1 == -1)
	//*  62  110:iload_2         
	//*  63  111:iconst_m1       
	//*  64  112:icmpne          123
			n1 = ((RecyclerView.n) (K()));
	//   65  115:aload_0         
	//   66  116:invokespecial   #160 <Method View K()>
	//   67  119:astore_3        
		else
	//*  68  120:goto            128
			n1 = ((RecyclerView.n) (L()));
	//   69  123:aload_0         
	//   70  124:invokespecial   #153 <Method View L()>
	//   71  127:astore_3        
		if(((View) (n1)).hasFocusable())
	//*  72  128:aload_3         
	//*  73  129:invokevirtual   #353 <Method boolean View.hasFocusable()>
	//*  74  132:ifeq            143
		{
			if(view == null)
	//*  75  135:aload_1         
	//*  76  136:ifnonnull       141
				return null;
	//   77  139:aconst_null     
	//   78  140:areturn         
			else
				return ((View) (n1));
	//   79  141:aload_3         
	//   80  142:areturn         
		} else
		{
			return view;
	//   81  143:aload_1         
	//   82  144:areturn         
		}
	}

	public void a(int i1, int j1, RecyclerView.r r, RecyclerView.h.a a1)
	{
		if(i != 0)
	//*   0    0:aload_0         
	//*   1    1:getfield        #96  <Field int i>
	//*   2    4:ifne            10
	//*   3    7:goto            12
			i1 = j1;
	//    4   10:iload_2         
	//    5   11:istore_1        
		if(u() != 0)
	//*   6   12:aload_0         
	//*   7   13:invokevirtual   #105 <Method int u()>
	//*   8   16:ifeq            61
		{
			if(i1 == 0)
	//*   9   19:iload_1         
	//*  10   20:ifne            24
				return;
	//   11   23:return          
			h();
	//   12   24:aload_0         
	//   13   25:invokevirtual   #278 <Method void h()>
			if(i1 > 0)
	//*  14   28:iload_1         
	//*  15   29:ifle            37
				j1 = 1;
	//   16   32:iconst_1        
	//   17   33:istore_2        
			else
	//*  18   34:goto            39
				j1 = -1;
	//   19   37:iconst_m1       
	//   20   38:istore_2        
			a(j1, Math.abs(i1), true, r);
	//   21   39:aload_0         
	//   22   40:iload_2         
	//   23   41:iload_1         
	//   24   42:invokestatic    #359 <Method int Math.abs(int)>
	//   25   45:iconst_1        
	//   26   46:aload_3         
	//   27   47:invokespecial   #346 <Method void a(int, int, boolean, RecyclerView$r)>
			a(r, a, a1);
	//   28   50:aload_0         
	//   29   51:aload_3         
	//   30   52:aload_0         
	//   31   53:getfield        #128 <Field LinearLayoutManager$c a>
	//   32   56:aload           4
	//   33   58:invokevirtual   #362 <Method void a(RecyclerView$r, LinearLayoutManager$c, RecyclerView$h$a)>
		}
	//   34   61:return          
	}

	public void a(int i1, RecyclerView.h.a a1)
	{
		SavedState savedstate = n;
	//    0    0:aload_0         
	//    1    1:getfield        #63  <Field LinearLayoutManager$SavedState n>
	//    2    4:astore          8
		byte byte0 = -1;
	//    3    6:iconst_m1       
	//    4    7:istore          4
		int j1;
		boolean flag1;
		if(savedstate != null && n.a())
	//*   5    9:aload           8
	//*   6   11:ifnull          44
	//*   7   14:aload_0         
	//*   8   15:getfield        #63  <Field LinearLayoutManager$SavedState n>
	//*   9   18:invokevirtual   #201 <Method boolean LinearLayoutManager$SavedState.a()>
	//*  10   21:ifeq            44
		{
			flag1 = n.c;
	//   11   24:aload_0         
	//   12   25:getfield        #63  <Field LinearLayoutManager$SavedState n>
	//   13   28:getfield        #202 <Field boolean LinearLayoutManager$SavedState.c>
	//   14   31:istore          7
			j1 = n.a;
	//   15   33:aload_0         
	//   16   34:getfield        #63  <Field LinearLayoutManager$SavedState n>
	//   17   37:getfield        #364 <Field int LinearLayoutManager$SavedState.a>
	//   18   40:istore_3        
		} else
	//*  19   41:goto            84
		{
			J();
	//   20   44:aload_0         
	//   21   45:invokespecial   #340 <Method void J()>
			flag1 = k;
	//   22   48:aload_0         
	//   23   49:getfield        #52  <Field boolean k>
	//   24   52:istore          7
			if(l == -1)
	//*  25   54:aload_0         
	//*  26   55:getfield        #58  <Field int l>
	//*  27   58:iconst_m1       
	//*  28   59:icmpne          79
			{
				if(flag1)
	//*  29   62:iload           7
	//*  30   64:ifeq            74
					j1 = i1 - 1;
	//   31   67:iload_1         
	//   32   68:iconst_1        
	//   33   69:isub            
	//   34   70:istore_3        
				else
	//*  35   71:goto            84
					j1 = 0;
	//   36   74:iconst_0        
	//   37   75:istore_3        
			} else
	//*  38   76:goto            84
			{
				j1 = l;
	//   39   79:aload_0         
	//   40   80:getfield        #58  <Field int l>
	//   41   83:istore_3        
			}
		}
		if(!flag1)
	//*  42   84:iload           7
	//*  43   86:ifeq            92
	//*  44   89:goto            95
			byte0 = 1;
	//   45   92:iconst_1        
	//   46   93:istore          4
		boolean flag = false;
	//   47   95:iconst_0        
	//   48   96:istore          6
		int l1 = j1;
	//   49   98:iload_3         
	//   50   99:istore          5
		for(int k1 = ((int) (flag)); k1 < h && l1 >= 0 && l1 < i1; k1++)
	//*  51  101:iload           6
	//*  52  103:istore_3        
	//*  53  104:iload_3         
	//*  54  105:aload_0         
	//*  55  106:getfield        #73  <Field int h>
	//*  56  109:icmpge          146
	//*  57  112:iload           5
	//*  58  114:iflt            146
	//*  59  117:iload           5
	//*  60  119:iload_1         
	//*  61  120:icmpge          146
		{
			a1.b(l1, 0);
	//   62  123:aload_2         
	//   63  124:iload           5
	//   64  126:iconst_0        
	//   65  127:invokeinterface #368 <Method void RecyclerView$h$a.b(int, int)>
			l1 += ((int) (byte0));
	//   66  132:iload           5
	//   67  134:iload           4
	//   68  136:iadd            
	//   69  137:istore          5
		}

	//   70  139:iload_3         
	//   71  140:iconst_1        
	//   72  141:iadd            
	//   73  142:istore_3        
	//*  74  143:goto            104
	//   75  146:return          
	}

	public void a(Parcelable parcelable)
	{
		if(parcelable instanceof SavedState)
	//*   0    0:aload_1         
	//*   1    1:instanceof      #8   <Class LinearLayoutManager$SavedState>
	//*   2    4:ifeq            19
		{
			n = (SavedState)parcelable;
	//    3    7:aload_0         
	//    4    8:aload_1         
	//    5    9:checkcast       #8   <Class LinearLayoutManager$SavedState>
	//    6   12:putfield        #63  <Field LinearLayoutManager$SavedState n>
			n();
	//    7   15:aload_0         
	//    8   16:invokevirtual   #371 <Method void n()>
		}
	//    9   19:return          
	}

	void a(RecyclerView.n n1, RecyclerView.r r, a a1, int i1)
	{
	//    0    0:return          
	}

	void a(RecyclerView.n n1, RecyclerView.r r, c c1, b b1)
	{
		n1 = ((RecyclerView.n) (c1.a(n1)));
	//    0    0:aload_3         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #375 <Method View LinearLayoutManager$c.a(RecyclerView$n)>
	//    3    5:astore_1        
		if(n1 == null)
	//*   4    6:aload_1         
	//*   5    7:ifnonnull       17
		{
			b1.b = true;
	//    6   10:aload           4
	//    7   12:iconst_1        
	//    8   13:putfield        #309 <Field boolean LinearLayoutManager$b.b>
			return;
	//    9   16:return          
		}
		r = ((RecyclerView.r) ((RecyclerView.LayoutParams)((View) (n1)).getLayoutParams()));
	//   10   17:aload_1         
	//   11   18:invokevirtual   #335 <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//   12   21:checkcast       #315 <Class RecyclerView$LayoutParams>
	//   13   24:astore_2        
		if(c1.k == null)
	//*  14   25:aload_3         
	//*  15   26:getfield        #246 <Field List LinearLayoutManager$c.k>
	//*  16   29:ifnonnull       79
		{
			boolean flag2 = k;
	//   17   32:aload_0         
	//   18   33:getfield        #52  <Field boolean k>
	//   19   36:istore          12
			boolean flag;
			if(c1.f == -1)
	//*  20   38:aload_3         
	//*  21   39:getfield        #136 <Field int LinearLayoutManager$c.f>
	//*  22   42:iconst_m1       
	//*  23   43:icmpne          52
				flag = true;
	//   24   46:iconst_1        
	//   25   47:istore          11
			else
	//*  26   49:goto            55
				flag = false;
	//   27   52:iconst_0        
	//   28   53:istore          11
			if(flag2 == flag)
	//*  29   55:iload           12
	//*  30   57:iload           11
	//*  31   59:icmpne          70
				b(((View) (n1)));
	//   32   62:aload_0         
	//   33   63:aload_1         
	//   34   64:invokevirtual   #376 <Method void b(View)>
			else
	//*  35   67:goto            123
				b(((View) (n1)), 0);
	//   36   70:aload_0         
	//   37   71:aload_1         
	//   38   72:iconst_0        
	//   39   73:invokevirtual   #379 <Method void b(View, int)>
		} else
	//*  40   76:goto            123
		{
			boolean flag3 = k;
	//   41   79:aload_0         
	//   42   80:getfield        #52  <Field boolean k>
	//   43   83:istore          12
			boolean flag1;
			if(c1.f == -1)
	//*  44   85:aload_3         
	//*  45   86:getfield        #136 <Field int LinearLayoutManager$c.f>
	//*  46   89:iconst_m1       
	//*  47   90:icmpne          99
				flag1 = true;
	//   48   93:iconst_1        
	//   49   94:istore          11
			else
	//*  50   96:goto            102
				flag1 = false;
	//   51   99:iconst_0        
	//   52  100:istore          11
			if(flag3 == flag1)
	//*  53  102:iload           12
	//*  54  104:iload           11
	//*  55  106:icmpne          117
				a(((View) (n1)));
	//   56  109:aload_0         
	//   57  110:aload_1         
	//   58  111:invokevirtual   #380 <Method void a(View)>
			else
	//*  59  114:goto            123
				a(((View) (n1)), 0);
	//   60  117:aload_0         
	//   61  118:aload_1         
	//   62  119:iconst_0        
	//   63  120:invokevirtual   #382 <Method void a(View, int)>
		}
		a(((View) (n1)), 0, 0);
	//   64  123:aload_0         
	//   65  124:aload_1         
	//   66  125:iconst_0        
	//   67  126:iconst_0        
	//   68  127:invokevirtual   #385 <Method void a(View, int, int)>
		b1.a = j.e(((View) (n1)));
	//   69  130:aload           4
	//   70  132:aload_0         
	//   71  133:getfield        #112 <Field ah j>
	//   72  136:aload_1         
	//   73  137:invokevirtual   #208 <Method int ah.e(View)>
	//   74  140:putfield        #310 <Field int LinearLayoutManager$b.a>
		int i1;
		int j1;
		int k1;
		int l1;
		if(i == 1)
	//*  75  143:aload_0         
	//*  76  144:getfield        #96  <Field int i>
	//*  77  147:iconst_1        
	//*  78  148:icmpne          270
		{
			if(g())
	//*  79  151:aload_0         
	//*  80  152:invokevirtual   #99  <Method boolean g()>
	//*  81  155:ifeq            185
			{
				i1 = x() - B();
	//   82  158:aload_0         
	//   83  159:invokevirtual   #388 <Method int x()>
	//   84  162:aload_0         
	//   85  163:invokevirtual   #391 <Method int B()>
	//   86  166:isub            
	//   87  167:istore          5
				l1 = i1 - j.f(((View) (n1)));
	//   88  169:iload           5
	//   89  171:aload_0         
	//   90  172:getfield        #112 <Field ah j>
	//   91  175:aload_1         
	//   92  176:invokevirtual   #393 <Method int ah.f(View)>
	//   93  179:isub            
	//   94  180:istore          8
			} else
	//*  95  182:goto            204
			{
				l1 = z();
	//   96  185:aload_0         
	//   97  186:invokevirtual   #396 <Method int z()>
	//   98  189:istore          8
				i1 = j.f(((View) (n1))) + l1;
	//   99  191:aload_0         
	//  100  192:getfield        #112 <Field ah j>
	//  101  195:aload_1         
	//  102  196:invokevirtual   #393 <Method int ah.f(View)>
	//  103  199:iload           8
	//  104  201:iadd            
	//  105  202:istore          5
			}
			if(c1.f == -1)
	//* 106  204:aload_3         
	//* 107  205:getfield        #136 <Field int LinearLayoutManager$c.f>
	//* 108  208:iconst_m1       
	//* 109  209:icmpne          241
			{
				k1 = c1.b;
	//  110  212:aload_3         
	//  111  213:getfield        #138 <Field int LinearLayoutManager$c.b>
	//  112  216:istore          7
				int i2 = c1.b - b1.a;
	//  113  218:aload_3         
	//  114  219:getfield        #138 <Field int LinearLayoutManager$c.b>
	//  115  222:aload           4
	//  116  224:getfield        #310 <Field int LinearLayoutManager$b.a>
	//  117  227:isub            
	//  118  228:istore          9
				j1 = i1;
	//  119  230:iload           5
	//  120  232:istore          6
				i1 = i2;
	//  121  234:iload           9
	//  122  236:istore          5
			} else
	//* 123  238:goto            380
			{
				int j2 = c1.b;
	//  124  241:aload_3         
	//  125  242:getfield        #138 <Field int LinearLayoutManager$c.b>
	//  126  245:istore          9
				k1 = c1.b + b1.a;
	//  127  247:aload_3         
	//  128  248:getfield        #138 <Field int LinearLayoutManager$c.b>
	//  129  251:aload           4
	//  130  253:getfield        #310 <Field int LinearLayoutManager$b.a>
	//  131  256:iadd            
	//  132  257:istore          7
				j1 = i1;
	//  133  259:iload           5
	//  134  261:istore          6
				i1 = j2;
	//  135  263:iload           9
	//  136  265:istore          5
			}
		} else
	//* 137  267:goto            380
		{
			j1 = A();
	//  138  270:aload_0         
	//  139  271:invokevirtual   #399 <Method int A()>
	//  140  274:istore          6
			i1 = j.f(((View) (n1))) + j1;
	//  141  276:aload_0         
	//  142  277:getfield        #112 <Field ah j>
	//  143  280:aload_1         
	//  144  281:invokevirtual   #393 <Method int ah.f(View)>
	//  145  284:iload           6
	//  146  286:iadd            
	//  147  287:istore          5
			if(c1.f == -1)
	//* 148  289:aload_3         
	//* 149  290:getfield        #136 <Field int LinearLayoutManager$c.f>
	//* 150  293:iconst_m1       
	//* 151  294:icmpne          342
			{
				k1 = c1.b;
	//  152  297:aload_3         
	//  153  298:getfield        #138 <Field int LinearLayoutManager$c.b>
	//  154  301:istore          7
				l1 = c1.b;
	//  155  303:aload_3         
	//  156  304:getfield        #138 <Field int LinearLayoutManager$c.b>
	//  157  307:istore          8
				int i3 = b1.a;
	//  158  309:aload           4
	//  159  311:getfield        #310 <Field int LinearLayoutManager$b.a>
	//  160  314:istore          10
				int k2 = i1;
	//  161  316:iload           5
	//  162  318:istore          9
				l1 -= i3;
	//  163  320:iload           8
	//  164  322:iload           10
	//  165  324:isub            
	//  166  325:istore          8
				i1 = j1;
	//  167  327:iload           6
	//  168  329:istore          5
				j1 = k1;
	//  169  331:iload           7
	//  170  333:istore          6
				k1 = k2;
	//  171  335:iload           9
	//  172  337:istore          7
			} else
	//* 173  339:goto            380
			{
				int l2 = c1.b;
	//  174  342:aload_3         
	//  175  343:getfield        #138 <Field int LinearLayoutManager$c.b>
	//  176  346:istore          9
				int j3 = c1.b + b1.a;
	//  177  348:aload_3         
	//  178  349:getfield        #138 <Field int LinearLayoutManager$c.b>
	//  179  352:aload           4
	//  180  354:getfield        #310 <Field int LinearLayoutManager$b.a>
	//  181  357:iadd            
	//  182  358:istore          10
				l1 = j1;
	//  183  360:iload           6
	//  184  362:istore          8
				k1 = i1;
	//  185  364:iload           5
	//  186  366:istore          7
				j1 = j3;
	//  187  368:iload           10
	//  188  370:istore          6
				i1 = l1;
	//  189  372:iload           8
	//  190  374:istore          5
				l1 = l2;
	//  191  376:iload           9
	//  192  378:istore          8
			}
		}
		a(((View) (n1)), l1, i1, j1, k1);
	//  193  380:aload_0         
	//  194  381:aload_1         
	//  195  382:iload           8
	//  196  384:iload           5
	//  197  386:iload           6
	//  198  388:iload           7
	//  199  390:invokevirtual   #402 <Method void a(View, int, int, int, int)>
		if(((RecyclerView.LayoutParams) (r)).d() || ((RecyclerView.LayoutParams) (r)).e())
	//* 200  393:aload_2         
	//* 201  394:invokevirtual   #337 <Method boolean RecyclerView$LayoutParams.d()>
	//* 202  397:ifne            407
	//* 203  400:aload_2         
	//* 204  401:invokevirtual   #404 <Method boolean RecyclerView$LayoutParams.e()>
	//* 205  404:ifeq            413
			b1.c = true;
	//  206  407:aload           4
	//  207  409:iconst_1        
	//  208  410:putfield        #311 <Field boolean LinearLayoutManager$b.c>
		b1.d = ((View) (n1)).hasFocusable();
	//  209  413:aload           4
	//  210  415:aload_1         
	//  211  416:invokevirtual   #353 <Method boolean View.hasFocusable()>
	//  212  419:putfield        #312 <Field boolean LinearLayoutManager$b.d>
	//  213  422:return          
	}

	public void a(RecyclerView.r r)
	{
		super.a(r);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #407 <Method void RecyclerView$h.a(RecyclerView$r)>
		n = null;
	//    3    5:aload_0         
	//    4    6:aconst_null     
	//    5    7:putfield        #63  <Field LinearLayoutManager$SavedState n>
		l = -1;
	//    6   10:aload_0         
	//    7   11:iconst_m1       
	//    8   12:putfield        #58  <Field int l>
		m = 0x80000000;
	//    9   15:aload_0         
	//   10   16:ldc1            #59  <Int 0x80000000>
	//   11   18:putfield        #61  <Field int m>
		o.a();
	//   12   21:aload_0         
	//   13   22:getfield        #68  <Field LinearLayoutManager$a o>
	//   14   25:invokevirtual   #408 <Method void LinearLayoutManager$a.a()>
	//   15   28:return          
	}

	void a(RecyclerView.r r, c c1, RecyclerView.h.a a1)
	{
		int i1 = c1.d;
	//    0    0:aload_2         
	//    1    1:getfield        #134 <Field int LinearLayoutManager$c.d>
	//    2    4:istore          4
		if(i1 >= 0 && i1 < r.e())
	//*   3    6:iload           4
	//*   4    8:iflt            36
	//*   5   11:iload           4
	//*   6   13:aload_1         
	//*   7   14:invokevirtual   #198 <Method int RecyclerView$r.e()>
	//*   8   17:icmpge          36
			a1.b(i1, Math.max(0, c1.g));
	//    9   20:aload_3         
	//   10   21:iload           4
	//   11   23:iconst_0        
	//   12   24:aload_2         
	//   13   25:getfield        #140 <Field int LinearLayoutManager$c.g>
	//   14   28:invokestatic    #412 <Method int Math.max(int, int)>
	//   15   31:invokeinterface #368 <Method void RecyclerView$h$a.b(int, int)>
	//   16   36:return          
	}

	public void a(RecyclerView recyclerview, RecyclerView.n n1)
	{
		super.a(recyclerview, n1);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #415 <Method void RecyclerView$h.a(RecyclerView, RecyclerView$n)>
		if(f)
	//*   4    6:aload_0         
	//*   5    7:getfield        #417 <Field boolean f>
	//*   6   10:ifeq            22
		{
			c(n1);
	//    7   13:aload_0         
	//    8   14:aload_2         
	//    9   15:invokevirtual   #420 <Method void c(RecyclerView$n)>
			n1.a();
	//   10   18:aload_2         
	//   11   19:invokevirtual   #421 <Method void RecyclerView$n.a()>
		}
	//   12   22:return          
	}

	public void a(View view, View view1, int i1, int j1)
	{
		a("Cannot drop a view during a scroll or layout calculation");
	//    0    0:aload_0         
	//    1    1:ldc2            #424 <String "Cannot drop a view during a scroll or layout calculation">
	//    2    4:invokevirtual   #427 <Method void a(String)>
		h();
	//    3    7:aload_0         
	//    4    8:invokevirtual   #278 <Method void h()>
		J();
	//    5   11:aload_0         
	//    6   12:invokespecial   #340 <Method void J()>
		i1 = d(view);
	//    7   15:aload_0         
	//    8   16:aload_1         
	//    9   17:invokevirtual   #156 <Method int d(View)>
	//   10   20:istore_3        
		j1 = d(view1);
	//   11   21:aload_0         
	//   12   22:aload_2         
	//   13   23:invokevirtual   #156 <Method int d(View)>
	//   14   26:istore          4
		if(i1 < j1)
	//*  15   28:iload_3         
	//*  16   29:iload           4
	//*  17   31:icmpge          39
			i1 = 1;
	//   18   34:iconst_1        
	//   19   35:istore_3        
		else
	//*  20   36:goto            41
			i1 = -1;
	//   21   39:iconst_m1       
	//   22   40:istore_3        
		if(k)
	//*  23   41:aload_0         
	//*  24   42:getfield        #52  <Field boolean k>
	//*  25   45:ifeq            110
		{
			if(i1 == 1)
	//*  26   48:iload_3         
	//*  27   49:iconst_1        
	//*  28   50:icmpne          85
			{
				b(j1, j.d() - (j.a(view1) + j.e(view)));
	//   29   53:aload_0         
	//   30   54:iload           4
	//   31   56:aload_0         
	//   32   57:getfield        #112 <Field ah j>
	//   33   60:invokevirtual   #116 <Method int ah.d()>
	//   34   63:aload_0         
	//   35   64:getfield        #112 <Field ah j>
	//   36   67:aload_2         
	//   37   68:invokevirtual   #164 <Method int ah.a(View)>
	//   38   71:aload_0         
	//   39   72:getfield        #112 <Field ah j>
	//   40   75:aload_1         
	//   41   76:invokevirtual   #208 <Method int ah.e(View)>
	//   42   79:iadd            
	//   43   80:isub            
	//   44   81:invokevirtual   #428 <Method void b(int, int)>
				return;
	//   45   84:return          
			}
			i1 = j.d() - j.b(view1);
	//   46   85:aload_0         
	//   47   86:getfield        #112 <Field ah j>
	//   48   89:invokevirtual   #116 <Method int ah.d()>
	//   49   92:aload_0         
	//   50   93:getfield        #112 <Field ah j>
	//   51   96:aload_2         
	//   52   97:invokevirtual   #158 <Method int ah.b(View)>
	//   53  100:isub            
	//   54  101:istore_3        
		} else
	//*  55  102:aload_0         
	//*  56  103:iload           4
	//*  57  105:iload_3         
	//*  58  106:invokevirtual   #428 <Method void b(int, int)>
	//*  59  109:return          
		if(i1 == -1)
	//*  60  110:iload_3         
	//*  61  111:iconst_m1       
	//*  62  112:icmpne          127
		{
			i1 = j.a(view1);
	//   63  115:aload_0         
	//   64  116:getfield        #112 <Field ah j>
	//   65  119:aload_2         
	//   66  120:invokevirtual   #164 <Method int ah.a(View)>
	//   67  123:istore_3        
		} else
	//*  68  124:goto            102
		{
			b(j1, j.b(view1) - j.e(view));
	//   69  127:aload_0         
	//   70  128:iload           4
	//   71  130:aload_0         
	//   72  131:getfield        #112 <Field ah j>
	//   73  134:aload_2         
	//   74  135:invokevirtual   #158 <Method int ah.b(View)>
	//   75  138:aload_0         
	//   76  139:getfield        #112 <Field ah j>
	//   77  142:aload_1         
	//   78  143:invokevirtual   #208 <Method int ah.e(View)>
	//   79  146:isub            
	//   80  147:invokevirtual   #428 <Method void b(int, int)>
			return;
	//   81  150:return          
		}
		b(j1, i1);
	}

	public void a(AccessibilityEvent accessibilityevent)
	{
		super.a(accessibilityevent);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #431 <Method void RecyclerView$h.a(AccessibilityEvent)>
		if(u() > 0)
	//*   3    5:aload_0         
	//*   4    6:invokevirtual   #105 <Method int u()>
	//*   5    9:ifle            28
		{
			accessibilityevent.setFromIndex(l());
	//    6   12:aload_1         
	//    7   13:aload_0         
	//    8   14:invokevirtual   #433 <Method int l()>
	//    9   17:invokevirtual   #438 <Method void AccessibilityEvent.setFromIndex(int)>
			accessibilityevent.setToIndex(m());
	//   10   20:aload_1         
	//   11   21:aload_0         
	//   12   22:invokevirtual   #440 <Method int m()>
	//   13   25:invokevirtual   #443 <Method void AccessibilityEvent.setToIndex(int)>
		}
	//   14   28:return          
	}

	public void a(String s)
	{
		if(n == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #63  <Field LinearLayoutManager$SavedState n>
	//*   2    4:ifnonnull       12
			super.a(s);
	//    3    7:aload_0         
	//    4    8:aload_1         
	//    5    9:invokespecial   #444 <Method void RecyclerView$h.a(String)>
	//    6   12:return          
	}

	public void a(boolean flag)
	{
		a(((String) (null)));
	//    0    0:aload_0         
	//    1    1:aconst_null     
	//    2    2:invokevirtual   #427 <Method void a(String)>
		if(d == flag)
	//*   3    5:aload_0         
	//*   4    6:getfield        #54  <Field boolean d>
	//*   5    9:iload_1         
	//*   6   10:icmpne          14
		{
			return;
	//    7   13:return          
		} else
		{
			d = flag;
	//    8   14:aload_0         
	//    9   15:iload_1         
	//   10   16:putfield        #54  <Field boolean d>
			n();
	//   11   19:aload_0         
	//   12   20:invokevirtual   #371 <Method void n()>
			return;
	//   13   23:return          
		}
	}

	public int b(int i1, RecyclerView.n n1, RecyclerView.r r)
	{
		if(i == 0)
	//*   0    0:aload_0         
	//*   1    1:getfield        #96  <Field int i>
	//*   2    4:ifne            9
			return 0;
	//    3    7:iconst_0        
	//    4    8:ireturn         
		else
			return c(i1, n1, r);
	//    5    9:aload_0         
	//    6   10:iload_1         
	//    7   11:aload_2         
	//    8   12:aload_3         
	//    9   13:invokevirtual   #119 <Method int c(int, RecyclerView$n, RecyclerView$r)>
	//   10   16:ireturn         
	}

	protected int b(RecyclerView.r r)
	{
		if(r.d())
	//*   0    0:aload_1         
	//*   1    1:invokevirtual   #445 <Method boolean RecyclerView$r.d()>
	//*   2    4:ifeq            15
			return j.f();
	//    3    7:aload_0         
	//    4    8:getfield        #112 <Field ah j>
	//    5   11:invokevirtual   #210 <Method int ah.f()>
	//    6   14:ireturn         
		else
			return 0;
	//    7   15:iconst_0        
	//    8   16:ireturn         
	}

	public void b(int i1)
	{
		if(i1 != 0 && i1 != 1)
	//*   0    0:iload_1         
	//*   1    1:ifeq            43
	//*   2    4:iload_1         
	//*   3    5:iconst_1        
	//*   4    6:icmpeq          43
		{
			StringBuilder stringbuilder = new StringBuilder();
	//    5    9:new             #447 <Class StringBuilder>
	//    6   12:dup             
	//    7   13:invokespecial   #448 <Method void StringBuilder()>
	//    8   16:astore_2        
			stringbuilder.append("invalid orientation:");
	//    9   17:aload_2         
	//   10   18:ldc2            #450 <String "invalid orientation:">
	//   11   21:invokevirtual   #454 <Method StringBuilder StringBuilder.append(String)>
	//   12   24:pop             
			stringbuilder.append(i1);
	//   13   25:aload_2         
	//   14   26:iload_1         
	//   15   27:invokevirtual   #457 <Method StringBuilder StringBuilder.append(int)>
	//   16   30:pop             
			throw new IllegalArgumentException(stringbuilder.toString());
	//   17   31:new             #459 <Class IllegalArgumentException>
	//   18   34:dup             
	//   19   35:aload_2         
	//   20   36:invokevirtual   #463 <Method String StringBuilder.toString()>
	//   21   39:invokespecial   #465 <Method void IllegalArgumentException(String)>
	//   22   42:athrow          
		}
		a(((String) (null)));
	//   23   43:aload_0         
	//   24   44:aconst_null     
	//   25   45:invokevirtual   #427 <Method void a(String)>
		if(i1 == i)
	//*  26   48:iload_1         
	//*  27   49:aload_0         
	//*  28   50:getfield        #96  <Field int i>
	//*  29   53:icmpne          57
		{
			return;
	//   30   56:return          
		} else
		{
			i = i1;
	//   31   57:aload_0         
	//   32   58:iload_1         
	//   33   59:putfield        #96  <Field int i>
			j = null;
	//   34   62:aload_0         
	//   35   63:aconst_null     
	//   36   64:putfield        #112 <Field ah j>
			n();
	//   37   67:aload_0         
	//   38   68:invokevirtual   #371 <Method void n()>
			return;
	//   39   71:return          
		}
	}

	public void b(int i1, int j1)
	{
		l = i1;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #58  <Field int l>
		m = j1;
	//    3    5:aload_0         
	//    4    6:iload_2         
	//    5    7:putfield        #61  <Field int m>
		if(n != null)
	//*   6   10:aload_0         
	//*   7   11:getfield        #63  <Field LinearLayoutManager$SavedState n>
	//*   8   14:ifnull          24
			n.b();
	//    9   17:aload_0         
	//   10   18:getfield        #63  <Field LinearLayoutManager$SavedState n>
	//   11   21:invokevirtual   #466 <Method void LinearLayoutManager$SavedState.b()>
		n();
	//   12   24:aload_0         
	//   13   25:invokevirtual   #371 <Method void n()>
	//   14   28:return          
	}

	public void b(boolean flag)
	{
		a(((String) (null)));
	//    0    0:aload_0         
	//    1    1:aconst_null     
	//    2    2:invokevirtual   #427 <Method void a(String)>
		if(flag == c)
	//*   3    5:iload_1         
	//*   4    6:aload_0         
	//*   5    7:getfield        #50  <Field boolean c>
	//*   6   10:icmpne          14
		{
			return;
	//    7   13:return          
		} else
		{
			c = flag;
	//    8   14:aload_0         
	//    9   15:iload_1         
	//   10   16:putfield        #50  <Field boolean c>
			n();
	//   11   19:aload_0         
	//   12   20:invokevirtual   #371 <Method void n()>
			return;
	//   13   23:return          
		}
	}

	public boolean b()
	{
		return n == null && b == d;
	//    0    0:aload_0         
	//    1    1:getfield        #63  <Field LinearLayoutManager$SavedState n>
	//    2    4:ifnonnull       20
	//    3    7:aload_0         
	//    4    8:getfield        #262 <Field boolean b>
	//    5   11:aload_0         
	//    6   12:getfield        #54  <Field boolean d>
	//    7   15:icmpne          20
	//    8   18:iconst_1        
	//    9   19:ireturn         
	//   10   20:iconst_0        
	//   11   21:ireturn         
	}

	int c(int i1, RecyclerView.n n1, RecyclerView.r r)
	{
		if(u() != 0)
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #105 <Method int u()>
	//*   2    4:ifeq            114
		{
			if(i1 == 0)
	//*   3    7:iload_1         
	//*   4    8:ifne            13
				return 0;
	//    5   11:iconst_0        
	//    6   12:ireturn         
			a.a = true;
	//    7   13:aload_0         
	//    8   14:getfield        #128 <Field LinearLayoutManager$c a>
	//    9   17:iconst_1        
	//   10   18:putfield        #181 <Field boolean LinearLayoutManager$c.a>
			h();
	//   11   21:aload_0         
	//   12   22:invokevirtual   #278 <Method void h()>
			byte byte0;
			if(i1 > 0)
	//*  13   25:iload_1         
	//*  14   26:ifle            35
				byte0 = 1;
	//   15   29:iconst_1        
	//   16   30:istore          4
			else
	//*  17   32:goto            38
				byte0 = -1;
	//   18   35:iconst_m1       
	//   19   36:istore          4
			int j1 = Math.abs(i1);
	//   20   38:iload_1         
	//   21   39:invokestatic    #359 <Method int Math.abs(int)>
	//   22   42:istore          5
			a(((int) (byte0)), j1, true, r);
	//   23   44:aload_0         
	//   24   45:iload           4
	//   25   47:iload           5
	//   26   49:iconst_1        
	//   27   50:aload_3         
	//   28   51:invokespecial   #346 <Method void a(int, int, boolean, RecyclerView$r)>
			int k1 = a.g + a(n1, a, r, false);
	//   29   54:aload_0         
	//   30   55:getfield        #128 <Field LinearLayoutManager$c a>
	//   31   58:getfield        #140 <Field int LinearLayoutManager$c.g>
	//   32   61:aload_0         
	//   33   62:aload_2         
	//   34   63:aload_0         
	//   35   64:getfield        #128 <Field LinearLayoutManager$c a>
	//   36   67:aload_3         
	//   37   68:iconst_0        
	//   38   69:invokevirtual   #251 <Method int a(RecyclerView$n, LinearLayoutManager$c, RecyclerView$r, boolean)>
	//   39   72:iadd            
	//   40   73:istore          6
			if(k1 < 0)
	//*  41   75:iload           6
	//*  42   77:ifge            82
				return 0;
	//   43   80:iconst_0        
	//   44   81:ireturn         
			if(j1 > k1)
	//*  45   82:iload           5
	//*  46   84:iload           6
	//*  47   86:icmple          95
				i1 = byte0 * k1;
	//   48   89:iload           4
	//   49   91:iload           6
	//   50   93:imul            
	//   51   94:istore_1        
			j.a(-i1);
	//   52   95:aload_0         
	//   53   96:getfield        #112 <Field ah j>
	//   54   99:iload_1         
	//   55  100:ineg            
	//   56  101:invokevirtual   #121 <Method void ah.a(int)>
			a.j = i1;
	//   57  104:aload_0         
	//   58  105:getfield        #128 <Field LinearLayoutManager$c a>
	//   59  108:iload_1         
	//   60  109:putfield        #468 <Field int LinearLayoutManager$c.j>
			return i1;
	//   61  112:iload_1         
	//   62  113:ireturn         
		} else
		{
			return 0;
	//   63  114:iconst_0        
	//   64  115:ireturn         
		}
	}

	public int c(RecyclerView.r r)
	{
		return i(r);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #470 <Method int i(RecyclerView$r)>
	//    3    5:ireturn         
	}

	public Parcelable c()
	{
		if(n != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #63  <Field LinearLayoutManager$SavedState n>
	//*   2    4:ifnull          19
			return ((Parcelable) (new SavedState(n)));
	//    3    7:new             #8   <Class LinearLayoutManager$SavedState>
	//    4   10:dup             
	//    5   11:aload_0         
	//    6   12:getfield        #63  <Field LinearLayoutManager$SavedState n>
	//    7   15:invokespecial   #474 <Method void LinearLayoutManager$SavedState(LinearLayoutManager$SavedState)>
	//    8   18:areturn         
		SavedState savedstate = new SavedState();
	//    9   19:new             #8   <Class LinearLayoutManager$SavedState>
	//   10   22:dup             
	//   11   23:invokespecial   #475 <Method void LinearLayoutManager$SavedState()>
	//   12   26:astore_2        
		if(u() > 0)
	//*  13   27:aload_0         
	//*  14   28:invokevirtual   #105 <Method int u()>
	//*  15   31:ifle            129
		{
			h();
	//   16   34:aload_0         
	//   17   35:invokevirtual   #278 <Method void h()>
			boolean flag = b ^ k;
	//   18   38:aload_0         
	//   19   39:getfield        #262 <Field boolean b>
	//   20   42:aload_0         
	//   21   43:getfield        #52  <Field boolean k>
	//   22   46:ixor            
	//   23   47:istore_1        
			savedstate.c = flag;
	//   24   48:aload_2         
	//   25   49:iload_1         
	//   26   50:putfield        #202 <Field boolean LinearLayoutManager$SavedState.c>
			if(flag)
	//*  27   53:iload_1         
	//*  28   54:ifeq            93
			{
				View view = L();
	//   29   57:aload_0         
	//   30   58:invokespecial   #153 <Method View L()>
	//   31   61:astore_3        
				savedstate.b = j.d() - j.b(view);
	//   32   62:aload_2         
	//   33   63:aload_0         
	//   34   64:getfield        #112 <Field ah j>
	//   35   67:invokevirtual   #116 <Method int ah.d()>
	//   36   70:aload_0         
	//   37   71:getfield        #112 <Field ah j>
	//   38   74:aload_3         
	//   39   75:invokevirtual   #158 <Method int ah.b(View)>
	//   40   78:isub            
	//   41   79:putfield        #204 <Field int LinearLayoutManager$SavedState.b>
				savedstate.a = d(view);
	//   42   82:aload_2         
	//   43   83:aload_0         
	//   44   84:aload_3         
	//   45   85:invokevirtual   #156 <Method int d(View)>
	//   46   88:putfield        #364 <Field int LinearLayoutManager$SavedState.a>
				return ((Parcelable) (savedstate));
	//   47   91:aload_2         
	//   48   92:areturn         
			} else
			{
				View view1 = K();
	//   49   93:aload_0         
	//   50   94:invokespecial   #160 <Method View K()>
	//   51   97:astore_3        
				savedstate.a = d(view1);
	//   52   98:aload_2         
	//   53   99:aload_0         
	//   54  100:aload_3         
	//   55  101:invokevirtual   #156 <Method int d(View)>
	//   56  104:putfield        #364 <Field int LinearLayoutManager$SavedState.a>
				savedstate.b = j.a(view1) - j.c();
	//   57  107:aload_2         
	//   58  108:aload_0         
	//   59  109:getfield        #112 <Field ah j>
	//   60  112:aload_3         
	//   61  113:invokevirtual   #164 <Method int ah.a(View)>
	//   62  116:aload_0         
	//   63  117:getfield        #112 <Field ah j>
	//   64  120:invokevirtual   #162 <Method int ah.c()>
	//   65  123:isub            
	//   66  124:putfield        #204 <Field int LinearLayoutManager$SavedState.b>
				return ((Parcelable) (savedstate));
	//   67  127:aload_2         
	//   68  128:areturn         
			}
		} else
		{
			savedstate.b();
	//   69  129:aload_2         
	//   70  130:invokevirtual   #466 <Method void LinearLayoutManager$SavedState.b()>
			return ((Parcelable) (savedstate));
	//   71  133:aload_2         
	//   72  134:areturn         
		}
	}

	public View c(int i1)
	{
		int j1 = u();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #105 <Method int u()>
	//    2    4:istore_2        
		if(j1 == 0)
	//*   3    5:iload_2         
	//*   4    6:ifne            11
			return null;
	//    5    9:aconst_null     
	//    6   10:areturn         
		int k1 = i1 - d(h(0));
	//    7   11:iload_1         
	//    8   12:aload_0         
	//    9   13:aload_0         
	//   10   14:iconst_0        
	//   11   15:invokevirtual   #108 <Method View h(int)>
	//   12   18:invokevirtual   #156 <Method int d(View)>
	//   13   21:isub            
	//   14   22:istore_3        
		if(k1 >= 0 && k1 < j1)
	//*  15   23:iload_3         
	//*  16   24:iflt            52
	//*  17   27:iload_3         
	//*  18   28:iload_2         
	//*  19   29:icmpge          52
		{
			View view = h(k1);
	//   20   32:aload_0         
	//   21   33:iload_3         
	//   22   34:invokevirtual   #108 <Method View h(int)>
	//   23   37:astore          4
			if(d(view) == i1)
	//*  24   39:aload_0         
	//*  25   40:aload           4
	//*  26   42:invokevirtual   #156 <Method int d(View)>
	//*  27   45:iload_1         
	//*  28   46:icmpne          52
				return view;
	//   29   49:aload           4
	//   30   51:areturn         
		}
		return super.c(i1);
	//   31   52:aload_0         
	//   32   53:iload_1         
	//   33   54:invokespecial   #476 <Method View RecyclerView$h.c(int)>
	//   34   57:areturn         
	}

	View c(int i1, int j1)
	{
		h();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #278 <Method void h()>
		char c1;
		if(j1 > i1)
	//*   2    4:iload_2         
	//*   3    5:iload_1         
	//*   4    6:icmple          14
			c1 = '\001';
	//    5    9:iconst_1        
	//    6   10:istore_3        
		else
	//*   7   11:goto            26
		if(j1 < i1)
	//*   8   14:iload_2         
	//*   9   15:iload_1         
	//*  10   16:icmpge          24
			c1 = '\uFFFF';
	//   11   19:iconst_m1       
	//   12   20:istore_3        
		else
	//*  13   21:goto            26
			c1 = '\0';
	//   14   24:iconst_0        
	//   15   25:istore_3        
		if(c1 == 0)
	//*  16   26:iload_3         
	//*  17   27:ifne            36
			return h(i1);
	//   18   30:aload_0         
	//   19   31:iload_1         
	//   20   32:invokevirtual   #108 <Method View h(int)>
	//   21   35:areturn         
		char c2;
		if(j.a(h(i1)) < j.c())
	//*  22   36:aload_0         
	//*  23   37:getfield        #112 <Field ah j>
	//*  24   40:aload_0         
	//*  25   41:iload_1         
	//*  26   42:invokevirtual   #108 <Method View h(int)>
	//*  27   45:invokevirtual   #164 <Method int ah.a(View)>
	//*  28   48:aload_0         
	//*  29   49:getfield        #112 <Field ah j>
	//*  30   52:invokevirtual   #162 <Method int ah.c()>
	//*  31   55:icmpge          70
		{
			c1 = '\u4104';
	//   32   58:sipush          16644
	//   33   61:istore_3        
			c2 = '\u4004';
	//   34   62:sipush          16388
	//   35   65:istore          4
		} else
	//*  36   67:goto            79
		{
			c1 = '\u1041';
	//   37   70:sipush          4161
	//   38   73:istore_3        
			c2 = '\u1001';
	//   39   74:sipush          4097
	//   40   77:istore          4
		}
		bb bb1;
		if(i == 0)
	//*  41   79:aload_0         
	//*  42   80:getfield        #96  <Field int i>
	//*  43   83:ifne            103
			bb1 = r;
	//   44   86:aload_0         
	//   45   87:getfield        #321 <Field bb r>
	//   46   90:astore          5
		else
	//*  47   92:aload           5
	//*  48   94:iload_1         
	//*  49   95:iload_2         
	//*  50   96:iload_3         
	//*  51   97:iload           4
	//*  52   99:invokevirtual   #326 <Method View bb.a(int, int, int, int)>
	//*  53  102:areturn         
			bb1 = s;
	//   54  103:aload_0         
	//   55  104:getfield        #329 <Field bb s>
	//   56  107:astore          5
		return bb1.a(i1, j1, ((int) (c1)), ((int) (c2)));
	//*  57  109:goto            92
	}

	public void c(RecyclerView.n n1, RecyclerView.r r)
	{
		Object obj = ((Object) (n));
	//    0    0:aload_0         
	//    1    1:getfield        #63  <Field LinearLayoutManager$SavedState n>
	//    2    4:astore          8
		int k1 = -1;
	//    3    6:iconst_m1       
	//    4    7:istore          5
		if((obj != null || l != -1) && r.e() == 0)
	//*   5    9:aload           8
	//*   6   11:ifnonnull       22
	//*   7   14:aload_0         
	//*   8   15:getfield        #58  <Field int l>
	//*   9   18:iconst_m1       
	//*  10   19:icmpeq          35
	//*  11   22:aload_2         
	//*  12   23:invokevirtual   #198 <Method int RecyclerView$r.e()>
	//*  13   26:ifne            35
		{
			c(n1);
	//   14   29:aload_0         
	//   15   30:aload_1         
	//   16   31:invokevirtual   #420 <Method void c(RecyclerView$n)>
			return;
	//   17   34:return          
		}
		if(n != null && n.a())
	//*  18   35:aload_0         
	//*  19   36:getfield        #63  <Field LinearLayoutManager$SavedState n>
	//*  20   39:ifnull          63
	//*  21   42:aload_0         
	//*  22   43:getfield        #63  <Field LinearLayoutManager$SavedState n>
	//*  23   46:invokevirtual   #201 <Method boolean LinearLayoutManager$SavedState.a()>
	//*  24   49:ifeq            63
			l = n.a;
	//   25   52:aload_0         
	//   26   53:aload_0         
	//   27   54:getfield        #63  <Field LinearLayoutManager$SavedState n>
	//   28   57:getfield        #364 <Field int LinearLayoutManager$SavedState.a>
	//   29   60:putfield        #58  <Field int l>
		h();
	//   30   63:aload_0         
	//   31   64:invokevirtual   #278 <Method void h()>
		a.a = false;
	//   32   67:aload_0         
	//   33   68:getfield        #128 <Field LinearLayoutManager$c a>
	//   34   71:iconst_0        
	//   35   72:putfield        #181 <Field boolean LinearLayoutManager$c.a>
		J();
	//   36   75:aload_0         
	//   37   76:invokespecial   #340 <Method void J()>
		obj = ((Object) (D()));
	//   38   79:aload_0         
	//   39   80:invokevirtual   #254 <Method View D()>
	//   40   83:astore          8
		if(o.d && l == -1 && n == null)
	//*  41   85:aload_0         
	//*  42   86:getfield        #68  <Field LinearLayoutManager$a o>
	//*  43   89:getfield        #478 <Field boolean LinearLayoutManager$a.d>
	//*  44   92:ifeq            168
	//*  45   95:aload_0         
	//*  46   96:getfield        #58  <Field int l>
	//*  47   99:iconst_m1       
	//*  48  100:icmpne          168
	//*  49  103:aload_0         
	//*  50  104:getfield        #63  <Field LinearLayoutManager$SavedState n>
	//*  51  107:ifnull          113
	//*  52  110:goto            168
		{
			if(obj != null && (j.a(((View) (obj))) >= j.d() || j.b(((View) (obj))) <= j.c()))
	//*  53  113:aload           8
	//*  54  115:ifnull          209
	//*  55  118:aload_0         
	//*  56  119:getfield        #112 <Field ah j>
	//*  57  122:aload           8
	//*  58  124:invokevirtual   #164 <Method int ah.a(View)>
	//*  59  127:aload_0         
	//*  60  128:getfield        #112 <Field ah j>
	//*  61  131:invokevirtual   #116 <Method int ah.d()>
	//*  62  134:icmpge          156
	//*  63  137:aload_0         
	//*  64  138:getfield        #112 <Field ah j>
	//*  65  141:aload           8
	//*  66  143:invokevirtual   #158 <Method int ah.b(View)>
	//*  67  146:aload_0         
	//*  68  147:getfield        #112 <Field ah j>
	//*  69  150:invokevirtual   #162 <Method int ah.c()>
	//*  70  153:icmpgt          209
				o.a(((View) (obj)));
	//   71  156:aload_0         
	//   72  157:getfield        #68  <Field LinearLayoutManager$a o>
	//   73  160:aload           8
	//   74  162:invokevirtual   #260 <Method void LinearLayoutManager$a.a(View)>
		} else
	//*  75  165:goto            209
		{
			o.a();
	//   76  168:aload_0         
	//   77  169:getfield        #68  <Field LinearLayoutManager$a o>
	//   78  172:invokevirtual   #408 <Method void LinearLayoutManager$a.a()>
			o.c = k ^ d;
	//   79  175:aload_0         
	//   80  176:getfield        #68  <Field LinearLayoutManager$a o>
	//   81  179:aload_0         
	//   82  180:getfield        #52  <Field boolean k>
	//   83  183:aload_0         
	//   84  184:getfield        #54  <Field boolean d>
	//   85  187:ixor            
	//   86  188:putfield        #203 <Field boolean LinearLayoutManager$a.c>
			a(n1, r, o);
	//   87  191:aload_0         
	//   88  192:aload_1         
	//   89  193:aload_2         
	//   90  194:aload_0         
	//   91  195:getfield        #68  <Field LinearLayoutManager$a o>
	//   92  198:invokespecial   #480 <Method void a(RecyclerView$n, RecyclerView$r, LinearLayoutManager$a)>
			o.d = true;
	//   93  201:aload_0         
	//   94  202:getfield        #68  <Field LinearLayoutManager$a o>
	//   95  205:iconst_1        
	//   96  206:putfield        #478 <Field boolean LinearLayoutManager$a.d>
		}
		int j1 = b(r);
	//   97  209:aload_0         
	//   98  210:aload_2         
	//   99  211:invokevirtual   #148 <Method int b(RecyclerView$r)>
	//  100  214:istore          4
		int i1;
		if(a.j >= 0)
	//* 101  216:aload_0         
	//* 102  217:getfield        #128 <Field LinearLayoutManager$c a>
	//* 103  220:getfield        #468 <Field int LinearLayoutManager$c.j>
	//* 104  223:iflt            235
		{
			i1 = j1;
	//  105  226:iload           4
	//  106  228:istore_3        
			j1 = 0;
	//  107  229:iconst_0        
	//  108  230:istore          4
		} else
	//* 109  232:goto            237
		{
			i1 = 0;
	//  110  235:iconst_0        
	//  111  236:istore_3        
		}
		int l1 = j1 + j.c();
	//  112  237:iload           4
	//  113  239:aload_0         
	//  114  240:getfield        #112 <Field ah j>
	//  115  243:invokevirtual   #162 <Method int ah.c()>
	//  116  246:iadd            
	//  117  247:istore          6
		int i2 = i1 + j.g();
	//  118  249:iload_3         
	//  119  250:aload_0         
	//  120  251:getfield        #112 <Field ah j>
	//  121  254:invokevirtual   #151 <Method int ah.g()>
	//  122  257:iadd            
	//  123  258:istore          7
		i1 = l1;
	//  124  260:iload           6
	//  125  262:istore_3        
		j1 = i2;
	//  126  263:iload           7
	//  127  265:istore          4
		if(r.a())
	//* 128  267:aload_2         
	//* 129  268:invokevirtual   #200 <Method boolean RecyclerView$r.a()>
	//* 130  271:ifeq            418
		{
			i1 = l1;
	//  131  274:iload           6
	//  132  276:istore_3        
			j1 = i2;
	//  133  277:iload           7
	//  134  279:istore          4
			if(l != -1)
	//* 135  281:aload_0         
	//* 136  282:getfield        #58  <Field int l>
	//* 137  285:iconst_m1       
	//* 138  286:icmpeq          418
			{
				i1 = l1;
	//  139  289:iload           6
	//  140  291:istore_3        
				j1 = i2;
	//  141  292:iload           7
	//  142  294:istore          4
				if(m != 0x80000000)
	//* 143  296:aload_0         
	//* 144  297:getfield        #61  <Field int m>
	//* 145  300:ldc1            #59  <Int 0x80000000>
	//* 146  302:icmpeq          418
				{
					View view = c(l);
	//  147  305:aload_0         
	//  148  306:aload_0         
	//  149  307:getfield        #58  <Field int l>
	//  150  310:invokevirtual   #206 <Method View c(int)>
	//  151  313:astore          8
					i1 = l1;
	//  152  315:iload           6
	//  153  317:istore_3        
					j1 = i2;
	//  154  318:iload           7
	//  155  320:istore          4
					if(view != null)
	//* 156  322:aload           8
	//* 157  324:ifnull          418
					{
						if(k)
	//* 158  327:aload_0         
	//* 159  328:getfield        #52  <Field boolean k>
	//* 160  331:ifeq            366
						{
							j1 = j.d() - j.b(view);
	//  161  334:aload_0         
	//  162  335:getfield        #112 <Field ah j>
	//  163  338:invokevirtual   #116 <Method int ah.d()>
	//  164  341:aload_0         
	//  165  342:getfield        #112 <Field ah j>
	//  166  345:aload           8
	//  167  347:invokevirtual   #158 <Method int ah.b(View)>
	//  168  350:isub            
	//  169  351:istore          4
							i1 = m;
	//  170  353:aload_0         
	//  171  354:getfield        #61  <Field int m>
	//  172  357:istore_3        
						} else
	//* 173  358:iload           4
	//* 174  360:iload_3         
	//* 175  361:isub            
	//* 176  362:istore_3        
	//* 177  363:goto            393
						{
							i1 = j.a(view) - j.c();
	//  178  366:aload_0         
	//  179  367:getfield        #112 <Field ah j>
	//  180  370:aload           8
	//  181  372:invokevirtual   #164 <Method int ah.a(View)>
	//  182  375:aload_0         
	//  183  376:getfield        #112 <Field ah j>
	//  184  379:invokevirtual   #162 <Method int ah.c()>
	//  185  382:isub            
	//  186  383:istore_3        
							j1 = m;
	//  187  384:aload_0         
	//  188  385:getfield        #61  <Field int m>
	//  189  388:istore          4
						}
						i1 = j1 - i1;
	//* 190  390:goto            358
						if(i1 > 0)
	//* 191  393:iload_3         
	//* 192  394:ifle            409
						{
							i1 = l1 + i1;
	//  193  397:iload           6
	//  194  399:iload_3         
	//  195  400:iadd            
	//  196  401:istore_3        
							j1 = i2;
	//  197  402:iload           7
	//  198  404:istore          4
						} else
	//* 199  406:goto            418
						{
							j1 = i2 - i1;
	//  200  409:iload           7
	//  201  411:iload_3         
	//  202  412:isub            
	//  203  413:istore          4
							i1 = l1;
	//  204  415:iload           6
	//  205  417:istore_3        
						}
					}
				}
			}
		}
		if(o.c ? k : !k)
	//* 206  418:aload_0         
	//* 207  419:getfield        #68  <Field LinearLayoutManager$a o>
	//* 208  422:getfield        #203 <Field boolean LinearLayoutManager$a.c>
	//* 209  425:ifeq            441
	//* 210  428:aload_0         
	//* 211  429:getfield        #52  <Field boolean k>
	//* 212  432:ifeq            448
			k1 = 1;
	//  213  435:iconst_1        
	//  214  436:istore          5
	//  215  438:goto            448
	//  216  441:aload_0         
	//  217  442:getfield        #52  <Field boolean k>
	//  218  445:ifeq            435
		a(n1, r, o, k1);
	//  219  448:aload_0         
	//  220  449:aload_1         
	//  221  450:aload_2         
	//  222  451:aload_0         
	//  223  452:getfield        #68  <Field LinearLayoutManager$a o>
	//  224  455:iload           5
	//  225  457:invokevirtual   #482 <Method void a(RecyclerView$n, RecyclerView$r, LinearLayoutManager$a, int)>
		a(n1);
	//  226  460:aload_0         
	//  227  461:aload_1         
	//  228  462:invokevirtual   #484 <Method void a(RecyclerView$n)>
		a.l = j();
	//  229  465:aload_0         
	//  230  466:getfield        #128 <Field LinearLayoutManager$c a>
	//  231  469:aload_0         
	//  232  470:invokevirtual   #143 <Method boolean j()>
	//  233  473:putfield        #145 <Field boolean LinearLayoutManager$c.l>
		a.i = r.a();
	//  234  476:aload_0         
	//  235  477:getfield        #128 <Field LinearLayoutManager$c a>
	//  236  480:aload_2         
	//  237  481:invokevirtual   #200 <Method boolean RecyclerView$r.a()>
	//  238  484:putfield        #486 <Field boolean LinearLayoutManager$c.i>
		if(o.c)
	//* 239  487:aload_0         
	//* 240  488:getfield        #68  <Field LinearLayoutManager$a o>
	//* 241  491:getfield        #203 <Field boolean LinearLayoutManager$a.c>
	//* 242  494:ifeq            696
		{
			b(o);
	//  243  497:aload_0         
	//  244  498:aload_0         
	//  245  499:getfield        #68  <Field LinearLayoutManager$a o>
	//  246  502:invokespecial   #488 <Method void b(LinearLayoutManager$a)>
			a.h = i1;
	//  247  505:aload_0         
	//  248  506:getfield        #128 <Field LinearLayoutManager$c a>
	//  249  509:iload_3         
	//  250  510:putfield        #149 <Field int LinearLayoutManager$c.h>
			a(n1, a, r, false);
	//  251  513:aload_0         
	//  252  514:aload_1         
	//  253  515:aload_0         
	//  254  516:getfield        #128 <Field LinearLayoutManager$c a>
	//  255  519:aload_2         
	//  256  520:iconst_0        
	//  257  521:invokevirtual   #251 <Method int a(RecyclerView$n, LinearLayoutManager$c, RecyclerView$r, boolean)>
	//  258  524:pop             
			k1 = a.b;
	//  259  525:aload_0         
	//  260  526:getfield        #128 <Field LinearLayoutManager$c a>
	//  261  529:getfield        #138 <Field int LinearLayoutManager$c.b>
	//  262  532:istore          5
			int j2 = a.d;
	//  263  534:aload_0         
	//  264  535:getfield        #128 <Field LinearLayoutManager$c a>
	//  265  538:getfield        #134 <Field int LinearLayoutManager$c.d>
	//  266  541:istore          7
			i1 = j1;
	//  267  543:iload           4
	//  268  545:istore_3        
			if(a.c > 0)
	//* 269  546:aload_0         
	//* 270  547:getfield        #128 <Field LinearLayoutManager$c a>
	//* 271  550:getfield        #130 <Field int LinearLayoutManager$c.c>
	//* 272  553:ifle            567
				i1 = j1 + a.c;
	//  273  556:iload           4
	//  274  558:aload_0         
	//  275  559:getfield        #128 <Field LinearLayoutManager$c a>
	//  276  562:getfield        #130 <Field int LinearLayoutManager$c.c>
	//  277  565:iadd            
	//  278  566:istore_3        
			a(o);
	//  279  567:aload_0         
	//  280  568:aload_0         
	//  281  569:getfield        #68  <Field LinearLayoutManager$a o>
	//  282  572:invokespecial   #490 <Method void a(LinearLayoutManager$a)>
			a.h = i1;
	//  283  575:aload_0         
	//  284  576:getfield        #128 <Field LinearLayoutManager$c a>
	//  285  579:iload_3         
	//  286  580:putfield        #149 <Field int LinearLayoutManager$c.h>
			c c1 = a;
	//  287  583:aload_0         
	//  288  584:getfield        #128 <Field LinearLayoutManager$c a>
	//  289  587:astore          8
			c1.d = c1.d + a.e;
	//  290  589:aload           8
	//  291  591:aload           8
	//  292  593:getfield        #134 <Field int LinearLayoutManager$c.d>
	//  293  596:aload_0         
	//  294  597:getfield        #128 <Field LinearLayoutManager$c a>
	//  295  600:getfield        #132 <Field int LinearLayoutManager$c.e>
	//  296  603:iadd            
	//  297  604:putfield        #134 <Field int LinearLayoutManager$c.d>
			a(n1, a, r, false);
	//  298  607:aload_0         
	//  299  608:aload_1         
	//  300  609:aload_0         
	//  301  610:getfield        #128 <Field LinearLayoutManager$c a>
	//  302  613:aload_2         
	//  303  614:iconst_0        
	//  304  615:invokevirtual   #251 <Method int a(RecyclerView$n, LinearLayoutManager$c, RecyclerView$r, boolean)>
	//  305  618:pop             
			l1 = a.b;
	//  306  619:aload_0         
	//  307  620:getfield        #128 <Field LinearLayoutManager$c a>
	//  308  623:getfield        #138 <Field int LinearLayoutManager$c.b>
	//  309  626:istore          6
			j1 = k1;
	//  310  628:iload           5
	//  311  630:istore          4
			i1 = l1;
	//  312  632:iload           6
	//  313  634:istore_3        
			if(a.c > 0)
	//* 314  635:aload_0         
	//* 315  636:getfield        #128 <Field LinearLayoutManager$c a>
	//* 316  639:getfield        #130 <Field int LinearLayoutManager$c.c>
	//* 317  642:ifle            894
			{
				i1 = a.c;
	//  318  645:aload_0         
	//  319  646:getfield        #128 <Field LinearLayoutManager$c a>
	//  320  649:getfield        #130 <Field int LinearLayoutManager$c.c>
	//  321  652:istore_3        
				h(j2, k1);
	//  322  653:aload_0         
	//  323  654:iload           7
	//  324  656:iload           5
	//  325  658:invokespecial   #214 <Method void h(int, int)>
				a.h = i1;
	//  326  661:aload_0         
	//  327  662:getfield        #128 <Field LinearLayoutManager$c a>
	//  328  665:iload_3         
	//  329  666:putfield        #149 <Field int LinearLayoutManager$c.h>
				a(n1, a, r, false);
	//  330  669:aload_0         
	//  331  670:aload_1         
	//  332  671:aload_0         
	//  333  672:getfield        #128 <Field LinearLayoutManager$c a>
	//  334  675:aload_2         
	//  335  676:iconst_0        
	//  336  677:invokevirtual   #251 <Method int a(RecyclerView$n, LinearLayoutManager$c, RecyclerView$r, boolean)>
	//  337  680:pop             
				j1 = a.b;
	//  338  681:aload_0         
	//  339  682:getfield        #128 <Field LinearLayoutManager$c a>
	//  340  685:getfield        #138 <Field int LinearLayoutManager$c.b>
	//  341  688:istore          4
				i1 = l1;
	//  342  690:iload           6
	//  343  692:istore_3        
			}
		} else
	//* 344  693:goto            894
		{
			a(o);
	//  345  696:aload_0         
	//  346  697:aload_0         
	//  347  698:getfield        #68  <Field LinearLayoutManager$a o>
	//  348  701:invokespecial   #490 <Method void a(LinearLayoutManager$a)>
			a.h = j1;
	//  349  704:aload_0         
	//  350  705:getfield        #128 <Field LinearLayoutManager$c a>
	//  351  708:iload           4
	//  352  710:putfield        #149 <Field int LinearLayoutManager$c.h>
			a(n1, a, r, false);
	//  353  713:aload_0         
	//  354  714:aload_1         
	//  355  715:aload_0         
	//  356  716:getfield        #128 <Field LinearLayoutManager$c a>
	//  357  719:aload_2         
	//  358  720:iconst_0        
	//  359  721:invokevirtual   #251 <Method int a(RecyclerView$n, LinearLayoutManager$c, RecyclerView$r, boolean)>
	//  360  724:pop             
			k1 = a.b;
	//  361  725:aload_0         
	//  362  726:getfield        #128 <Field LinearLayoutManager$c a>
	//  363  729:getfield        #138 <Field int LinearLayoutManager$c.b>
	//  364  732:istore          5
			int k2 = a.d;
	//  365  734:aload_0         
	//  366  735:getfield        #128 <Field LinearLayoutManager$c a>
	//  367  738:getfield        #134 <Field int LinearLayoutManager$c.d>
	//  368  741:istore          7
			j1 = i1;
	//  369  743:iload_3         
	//  370  744:istore          4
			if(a.c > 0)
	//* 371  746:aload_0         
	//* 372  747:getfield        #128 <Field LinearLayoutManager$c a>
	//* 373  750:getfield        #130 <Field int LinearLayoutManager$c.c>
	//* 374  753:ifle            767
				j1 = i1 + a.c;
	//  375  756:iload_3         
	//  376  757:aload_0         
	//  377  758:getfield        #128 <Field LinearLayoutManager$c a>
	//  378  761:getfield        #130 <Field int LinearLayoutManager$c.c>
	//  379  764:iadd            
	//  380  765:istore          4
			b(o);
	//  381  767:aload_0         
	//  382  768:aload_0         
	//  383  769:getfield        #68  <Field LinearLayoutManager$a o>
	//  384  772:invokespecial   #488 <Method void b(LinearLayoutManager$a)>
			a.h = j1;
	//  385  775:aload_0         
	//  386  776:getfield        #128 <Field LinearLayoutManager$c a>
	//  387  779:iload           4
	//  388  781:putfield        #149 <Field int LinearLayoutManager$c.h>
			c c2 = a;
	//  389  784:aload_0         
	//  390  785:getfield        #128 <Field LinearLayoutManager$c a>
	//  391  788:astore          8
			c2.d = c2.d + a.e;
	//  392  790:aload           8
	//  393  792:aload           8
	//  394  794:getfield        #134 <Field int LinearLayoutManager$c.d>
	//  395  797:aload_0         
	//  396  798:getfield        #128 <Field LinearLayoutManager$c a>
	//  397  801:getfield        #132 <Field int LinearLayoutManager$c.e>
	//  398  804:iadd            
	//  399  805:putfield        #134 <Field int LinearLayoutManager$c.d>
			a(n1, a, r, false);
	//  400  808:aload_0         
	//  401  809:aload_1         
	//  402  810:aload_0         
	//  403  811:getfield        #128 <Field LinearLayoutManager$c a>
	//  404  814:aload_2         
	//  405  815:iconst_0        
	//  406  816:invokevirtual   #251 <Method int a(RecyclerView$n, LinearLayoutManager$c, RecyclerView$r, boolean)>
	//  407  819:pop             
			l1 = a.b;
	//  408  820:aload_0         
	//  409  821:getfield        #128 <Field LinearLayoutManager$c a>
	//  410  824:getfield        #138 <Field int LinearLayoutManager$c.b>
	//  411  827:istore          6
			j1 = l1;
	//  412  829:iload           6
	//  413  831:istore          4
			i1 = k1;
	//  414  833:iload           5
	//  415  835:istore_3        
			if(a.c > 0)
	//* 416  836:aload_0         
	//* 417  837:getfield        #128 <Field LinearLayoutManager$c a>
	//* 418  840:getfield        #130 <Field int LinearLayoutManager$c.c>
	//* 419  843:ifle            894
			{
				i1 = a.c;
	//  420  846:aload_0         
	//  421  847:getfield        #128 <Field LinearLayoutManager$c a>
	//  422  850:getfield        #130 <Field int LinearLayoutManager$c.c>
	//  423  853:istore_3        
				a(k2, k1);
	//  424  854:aload_0         
	//  425  855:iload           7
	//  426  857:iload           5
	//  427  859:invokespecial   #169 <Method void a(int, int)>
				a.h = i1;
	//  428  862:aload_0         
	//  429  863:getfield        #128 <Field LinearLayoutManager$c a>
	//  430  866:iload_3         
	//  431  867:putfield        #149 <Field int LinearLayoutManager$c.h>
				a(n1, a, r, false);
	//  432  870:aload_0         
	//  433  871:aload_1         
	//  434  872:aload_0         
	//  435  873:getfield        #128 <Field LinearLayoutManager$c a>
	//  436  876:aload_2         
	//  437  877:iconst_0        
	//  438  878:invokevirtual   #251 <Method int a(RecyclerView$n, LinearLayoutManager$c, RecyclerView$r, boolean)>
	//  439  881:pop             
				i1 = a.b;
	//  440  882:aload_0         
	//  441  883:getfield        #128 <Field LinearLayoutManager$c a>
	//  442  886:getfield        #138 <Field int LinearLayoutManager$c.b>
	//  443  889:istore_3        
				j1 = l1;
	//  444  890:iload           6
	//  445  892:istore          4
			}
		}
		k1 = j1;
	//  446  894:iload           4
	//  447  896:istore          5
		l1 = i1;
	//  448  898:iload_3         
	//  449  899:istore          6
		if(u() > 0)
	//* 450  901:aload_0         
	//* 451  902:invokevirtual   #105 <Method int u()>
	//* 452  905:ifle            1005
		{
			if(k ^ d)
	//* 453  908:aload_0         
	//* 454  909:getfield        #52  <Field boolean k>
	//* 455  912:aload_0         
	//* 456  913:getfield        #54  <Field boolean d>
	//* 457  916:ixor            
	//* 458  917:ifeq            968
			{
				l1 = a(i1, n1, r, true);
	//  459  920:aload_0         
	//  460  921:iload_3         
	//  461  922:aload_1         
	//  462  923:aload_2         
	//  463  924:iconst_1        
	//  464  925:invokespecial   #492 <Method int a(int, RecyclerView$n, RecyclerView$r, boolean)>
	//  465  928:istore          6
				k1 = j1 + l1;
	//  466  930:iload           4
	//  467  932:iload           6
	//  468  934:iadd            
	//  469  935:istore          5
				j1 = i1 + l1;
	//  470  937:iload_3         
	//  471  938:iload           6
	//  472  940:iadd            
	//  473  941:istore          4
				i1 = b(k1, n1, r, false);
	//  474  943:aload_0         
	//  475  944:iload           5
	//  476  946:aload_1         
	//  477  947:aload_2         
	//  478  948:iconst_0        
	//  479  949:invokespecial   #494 <Method int b(int, RecyclerView$n, RecyclerView$r, boolean)>
	//  480  952:istore_3        
			} else
	//* 481  953:iload           5
	//* 482  955:iload_3         
	//* 483  956:iadd            
	//* 484  957:istore          5
	//* 485  959:iload           4
	//* 486  961:iload_3         
	//* 487  962:iadd            
	//* 488  963:istore          6
	//* 489  965:goto            1005
			{
				l1 = b(j1, n1, r, true);
	//  490  968:aload_0         
	//  491  969:iload           4
	//  492  971:aload_1         
	//  493  972:aload_2         
	//  494  973:iconst_1        
	//  495  974:invokespecial   #494 <Method int b(int, RecyclerView$n, RecyclerView$r, boolean)>
	//  496  977:istore          6
				k1 = j1 + l1;
	//  497  979:iload           4
	//  498  981:iload           6
	//  499  983:iadd            
	//  500  984:istore          5
				j1 = i1 + l1;
	//  501  986:iload_3         
	//  502  987:iload           6
	//  503  989:iadd            
	//  504  990:istore          4
				i1 = a(j1, n1, r, false);
	//  505  992:aload_0         
	//  506  993:iload           4
	//  507  995:aload_1         
	//  508  996:aload_2         
	//  509  997:iconst_0        
	//  510  998:invokespecial   #492 <Method int a(int, RecyclerView$n, RecyclerView$r, boolean)>
	//  511 1001:istore_3        
			}
			k1 += i1;
			l1 = j1 + i1;
		}
	//* 512 1002:goto            953
		b(n1, r, k1, l1);
	//  513 1005:aload_0         
	//  514 1006:aload_1         
	//  515 1007:aload_2         
	//  516 1008:iload           5
	//  517 1010:iload           6
	//  518 1012:invokespecial   #496 <Method void b(RecyclerView$n, RecyclerView$r, int, int)>
		if(!r.a())
	//* 519 1015:aload_2         
	//* 520 1016:invokevirtual   #200 <Method boolean RecyclerView$r.a()>
	//* 521 1019:ifne            1032
			j.a();
	//  522 1022:aload_0         
	//  523 1023:getfield        #112 <Field ah j>
	//  524 1026:invokevirtual   #497 <Method void ah.a()>
		else
	//* 525 1029:goto            1039
			o.a();
	//  526 1032:aload_0         
	//  527 1033:getfield        #68  <Field LinearLayoutManager$a o>
	//  528 1036:invokevirtual   #408 <Method void LinearLayoutManager$a.a()>
		b = d;
	//  529 1039:aload_0         
	//  530 1040:aload_0         
	//  531 1041:getfield        #54  <Field boolean d>
	//  532 1044:putfield        #262 <Field boolean b>
	//  533 1047:return          
	}

	public int d(RecyclerView.r r)
	{
		return i(r);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #470 <Method int i(RecyclerView$r)>
	//    3    5:ireturn         
	}

	public void d(int i1)
	{
		l = i1;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #58  <Field int l>
		m = 0x80000000;
	//    3    5:aload_0         
	//    4    6:ldc1            #59  <Int 0x80000000>
	//    5    8:putfield        #61  <Field int m>
		if(n != null)
	//*   6   11:aload_0         
	//*   7   12:getfield        #63  <Field LinearLayoutManager$SavedState n>
	//*   8   15:ifnull          25
			n.b();
	//    9   18:aload_0         
	//   10   19:getfield        #63  <Field LinearLayoutManager$SavedState n>
	//   11   22:invokevirtual   #466 <Method void LinearLayoutManager$SavedState.b()>
		n();
	//   12   25:aload_0         
	//   13   26:invokevirtual   #371 <Method void n()>
	//   14   29:return          
	}

	public boolean d()
	{
		return i == 0;
	//    0    0:aload_0         
	//    1    1:getfield        #96  <Field int i>
	//    2    4:ifne            9
	//    3    7:iconst_1        
	//    4    8:ireturn         
	//    5    9:iconst_0        
	//    6   10:ireturn         
	}

	int e(int i1)
	{
		int j1 = 0x80000000;
	//    0    0:ldc1            #59  <Int 0x80000000>
	//    1    2:istore_2        
		if(i1 != 17)
	//*   2    3:iload_1         
	//*   3    4:bipush          17
	//*   4    6:icmpeq          133
		{
			if(i1 != 33)
	//*   5    9:iload_1         
	//*   6   10:bipush          33
	//*   7   12:icmpeq          120
			{
				if(i1 != 66)
	//*   8   15:iload_1         
	//*   9   16:bipush          66
	//*  10   18:icmpeq          109
				{
					if(i1 != 130)
	//*  11   21:iload_1         
	//*  12   22:sipush          130
	//*  13   25:icmpeq          97
					{
						switch(i1)
	//*  14   28:iload_1         
						{
	//*  15   29:tableswitch     1 2: default 52
	//	               1 76
	//	               2 55
						default:
							return 0x80000000;
	//   16   52:ldc1            #59  <Int 0x80000000>
	//   17   54:ireturn         

						case 2: // '\002'
							if(i == 1)
	//*  18   55:aload_0         
	//*  19   56:getfield        #96  <Field int i>
	//*  20   59:iconst_1        
	//*  21   60:icmpne          65
								return 1;
	//   22   63:iconst_1        
	//   23   64:ireturn         
							return !g() ? 1 : -1;
	//   24   65:aload_0         
	//   25   66:invokevirtual   #99  <Method boolean g()>
	//   26   69:ifeq            74
	//   27   72:iconst_m1       
	//   28   73:ireturn         
	//   29   74:iconst_1        
	//   30   75:ireturn         

						case 1: // '\001'
							break;
						}
						if(i == 1)
	//*  31   76:aload_0         
	//*  32   77:getfield        #96  <Field int i>
	//*  33   80:iconst_1        
	//*  34   81:icmpne          86
							return -1;
	//   35   84:iconst_m1       
	//   36   85:ireturn         
						return !g() ? -1 : 1;
	//   37   86:aload_0         
	//   38   87:invokevirtual   #99  <Method boolean g()>
	//   39   90:ifeq            95
	//   40   93:iconst_1        
	//   41   94:ireturn         
	//   42   95:iconst_m1       
	//   43   96:ireturn         
					}
					if(i == 1)
	//*  44   97:aload_0         
	//*  45   98:getfield        #96  <Field int i>
	//*  46  101:iconst_1        
	//*  47  102:icmpne          107
						j1 = 1;
	//   48  105:iconst_1        
	//   49  106:istore_2        
					return j1;
	//   50  107:iload_2         
	//   51  108:ireturn         
				}
				if(i == 0)
	//*  52  109:aload_0         
	//*  53  110:getfield        #96  <Field int i>
	//*  54  113:ifne            118
					j1 = 1;
	//   55  116:iconst_1        
	//   56  117:istore_2        
				return j1;
	//   57  118:iload_2         
	//   58  119:ireturn         
			}
			return i != 1 ? 0x80000000 : -1;
	//   59  120:aload_0         
	//   60  121:getfield        #96  <Field int i>
	//   61  124:iconst_1        
	//   62  125:icmpne          130
	//   63  128:iconst_m1       
	//   64  129:ireturn         
	//   65  130:ldc1            #59  <Int 0x80000000>
	//   66  132:ireturn         
		}
		return i != 0 ? 0x80000000 : -1;
	//   67  133:aload_0         
	//   68  134:getfield        #96  <Field int i>
	//   69  137:ifne            142
	//   70  140:iconst_m1       
	//   71  141:ireturn         
	//   72  142:ldc1            #59  <Int 0x80000000>
	//   73  144:ireturn         
	}

	public int e(RecyclerView.r r)
	{
		return j(r);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #499 <Method int j(RecyclerView$r)>
	//    3    5:ireturn         
	}

	public boolean e()
	{
		return i == 1;
	//    0    0:aload_0         
	//    1    1:getfield        #96  <Field int i>
	//    2    4:iconst_1        
	//    3    5:icmpne          10
	//    4    8:iconst_1        
	//    5    9:ireturn         
	//    6   10:iconst_0        
	//    7   11:ireturn         
	}

	public int f()
	{
		return i;
	//    0    0:aload_0         
	//    1    1:getfield        #96  <Field int i>
	//    2    4:ireturn         
	}

	public int f(RecyclerView.r r)
	{
		return j(r);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #499 <Method int j(RecyclerView$r)>
	//    3    5:ireturn         
	}

	public int g(RecyclerView.r r)
	{
		return k(r);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #501 <Method int k(RecyclerView$r)>
	//    3    5:ireturn         
	}

	protected boolean g()
	{
		return s() == 1;
	//    0    0:aload_0         
	//    1    1:invokevirtual   #503 <Method int s()>
	//    2    4:iconst_1        
	//    3    5:icmpne          10
	//    4    8:iconst_1        
	//    5    9:ireturn         
	//    6   10:iconst_0        
	//    7   11:ireturn         
	}

	public int h(RecyclerView.r r)
	{
		return k(r);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #501 <Method int k(RecyclerView$r)>
	//    3    5:ireturn         
	}

	void h()
	{
		if(a == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #128 <Field LinearLayoutManager$c a>
	//*   2    4:ifnonnull       15
			a = i();
	//    3    7:aload_0         
	//    4    8:aload_0         
	//    5    9:invokevirtual   #506 <Method LinearLayoutManager$c i()>
	//    6   12:putfield        #128 <Field LinearLayoutManager$c a>
		if(j == null)
	//*   7   15:aload_0         
	//*   8   16:getfield        #112 <Field ah j>
	//*   9   19:ifnonnull       34
			j = ah.a(((RecyclerView.h) (this)), i);
	//   10   22:aload_0         
	//   11   23:aload_0         
	//   12   24:aload_0         
	//   13   25:getfield        #96  <Field int i>
	//   14   28:invokestatic    #509 <Method ah ah.a(RecyclerView$h, int)>
	//   15   31:putfield        #112 <Field ah j>
	//   16   34:return          
	}

	c i()
	{
		return new c();
	//    0    0:new             #19  <Class LinearLayoutManager$c>
	//    1    3:dup             
	//    2    4:invokespecial   #510 <Method void LinearLayoutManager$c()>
	//    3    7:areturn         
	}

	boolean j()
	{
		return j.h() == 0 && j.e() == 0;
	//    0    0:aload_0         
	//    1    1:getfield        #112 <Field ah j>
	//    2    4:invokevirtual   #512 <Method int ah.h()>
	//    3    7:ifne            22
	//    4   10:aload_0         
	//    5   11:getfield        #112 <Field ah j>
	//    6   14:invokevirtual   #215 <Method int ah.e()>
	//    7   17:ifne            22
	//    8   20:iconst_1        
	//    9   21:ireturn         
	//   10   22:iconst_0        
	//   11   23:ireturn         
	}

	boolean k()
	{
		return w() != 0x40000000 && v() != 0x40000000 && I();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #515 <Method int w()>
	//    2    4:ldc2            #516 <Int 0x40000000>
	//    3    7:icmpeq          29
	//    4   10:aload_0         
	//    5   11:invokevirtual   #519 <Method int v()>
	//    6   14:ldc2            #516 <Int 0x40000000>
	//    7   17:icmpeq          29
	//    8   20:aload_0         
	//    9   21:invokevirtual   #521 <Method boolean I()>
	//   10   24:ifeq            29
	//   11   27:iconst_1        
	//   12   28:ireturn         
	//   13   29:iconst_0        
	//   14   30:ireturn         
	}

	public int l()
	{
		View view = a(0, u(), false, true);
	//    0    0:aload_0         
	//    1    1:iconst_0        
	//    2    2:aload_0         
	//    3    3:invokevirtual   #105 <Method int u()>
	//    4    6:iconst_0        
	//    5    7:iconst_1        
	//    6    8:invokevirtual   #125 <Method View a(int, int, boolean, boolean)>
	//    7   11:astore_1        
		if(view == null)
	//*   8   12:aload_1         
	//*   9   13:ifnonnull       18
			return -1;
	//   10   16:iconst_m1       
	//   11   17:ireturn         
		else
			return d(view);
	//   12   18:aload_0         
	//   13   19:aload_1         
	//   14   20:invokevirtual   #156 <Method int d(View)>
	//   15   23:ireturn         
	}

	public int m()
	{
		View view = a(u() - 1, -1, false, true);
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:invokevirtual   #105 <Method int u()>
	//    3    5:iconst_1        
	//    4    6:isub            
	//    5    7:iconst_m1       
	//    6    8:iconst_0        
	//    7    9:iconst_1        
	//    8   10:invokevirtual   #125 <Method View a(int, int, boolean, boolean)>
	//    9   13:astore_1        
		if(view == null)
	//*  10   14:aload_1         
	//*  11   15:ifnonnull       20
			return -1;
	//   12   18:iconst_m1       
	//   13   19:ireturn         
		else
			return d(view);
	//   14   20:aload_0         
	//   15   21:aload_1         
	//   16   22:invokevirtual   #156 <Method int d(View)>
	//   17   25:ireturn         
	}

	private c a;
	private boolean b;
	private boolean c;
	private boolean d;
	private boolean e;
	private boolean f;
	private final b g;
	private int h;
	int i;
	ah j;
	boolean k;
	int l;
	int m;
	SavedState n;
	final a o;
}
