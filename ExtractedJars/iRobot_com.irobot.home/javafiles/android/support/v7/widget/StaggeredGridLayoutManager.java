// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v7.widget;

import android.content.Context;
import android.graphics.Rect;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.v4.view.a.b;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import java.util.*;

// Referenced classes of package android.support.v7.widget:
//			ae, ah, an, RecyclerView

public class StaggeredGridLayoutManager extends RecyclerView.h
{
	public static class LayoutParams extends RecyclerView.LayoutParams
	{

		public boolean a()
		{
			return b;
		//    0    0:aload_0         
		//    1    1:getfield        #28  <Field boolean b>
		//    2    4:ireturn         
		}

		public final int b()
		{
			if(a == null)
		//*   0    0:aload_0         
		//*   1    1:getfield        #31  <Field StaggeredGridLayoutManager$b a>
		//*   2    4:ifnonnull       9
				return -1;
		//    3    7:iconst_m1       
		//    4    8:ireturn         
			else
				return a.e;
		//    5    9:aload_0         
		//    6   10:getfield        #31  <Field StaggeredGridLayoutManager$b a>
		//    7   13:getfield        #37  <Field int StaggeredGridLayoutManager$b.e>
		//    8   16:ireturn         
		}

		b a;
		boolean b;

		public LayoutParams(int i1, int j1)
		{
			super(i1, j1);
		//    0    0:aload_0         
		//    1    1:iload_1         
		//    2    2:iload_2         
		//    3    3:invokespecial   #15  <Method void RecyclerView$LayoutParams(int, int)>
		//    4    6:return          
		}

		public LayoutParams(Context context, AttributeSet attributeset)
		{
			super(context, attributeset);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:aload_2         
		//    3    3:invokespecial   #19  <Method void RecyclerView$LayoutParams(Context, AttributeSet)>
		//    4    6:return          
		}

		public LayoutParams(android.view.ViewGroup.LayoutParams layoutparams)
		{
			super(layoutparams);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokespecial   #22  <Method void RecyclerView$LayoutParams(android.view.ViewGroup$LayoutParams)>
		//    3    5:return          
		}

		public LayoutParams(android.view.ViewGroup.MarginLayoutParams marginlayoutparams)
		{
			super(marginlayoutparams);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokespecial   #25  <Method void RecyclerView$LayoutParams(android.view.ViewGroup$MarginLayoutParams)>
		//    3    5:return          
		}
	}

	static class LazySpanLookup
	{

		private void c(int i1, int j1)
		{
			if(b == null)
		//*   0    0:aload_0         
		//*   1    1:getfield        #26  <Field List b>
		//*   2    4:ifnonnull       8
				return;
		//    3    7:return          
			for(int k1 = b.size() - 1; k1 >= 0; k1--)
		//*   4    8:aload_0         
		//*   5    9:getfield        #26  <Field List b>
		//*   6   12:invokeinterface #32  <Method int List.size()>
		//*   7   17:iconst_1        
		//*   8   18:isub            
		//*   9   19:istore_3        
		//*  10   20:iload_3         
		//*  11   21:iflt            95
			{
				FullSpanItem fullspanitem = (FullSpanItem)b.get(k1);
		//   12   24:aload_0         
		//   13   25:getfield        #26  <Field List b>
		//   14   28:iload_3         
		//   15   29:invokeinterface #36  <Method Object List.get(int)>
		//   16   34:checkcast       #9   <Class StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem>
		//   17   37:astore          4
				if(fullspanitem.a < i1)
		//*  18   39:aload           4
		//*  19   41:getfield        #39  <Field int StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem.a>
		//*  20   44:iload_1         
		//*  21   45:icmpge          51
					continue;
		//   22   48:goto            88
				if(fullspanitem.a < i1 + j1)
		//*  23   51:aload           4
		//*  24   53:getfield        #39  <Field int StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem.a>
		//*  25   56:iload_1         
		//*  26   57:iload_2         
		//*  27   58:iadd            
		//*  28   59:icmpge          76
					b.remove(k1);
		//   29   62:aload_0         
		//   30   63:getfield        #26  <Field List b>
		//   31   66:iload_3         
		//   32   67:invokeinterface #42  <Method Object List.remove(int)>
		//   33   72:pop             
				else
		//*  34   73:goto            88
					fullspanitem.a = fullspanitem.a - j1;
		//   35   76:aload           4
		//   36   78:aload           4
		//   37   80:getfield        #39  <Field int StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem.a>
		//   38   83:iload_2         
		//   39   84:isub            
		//   40   85:putfield        #39  <Field int StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem.a>
			}

		//   41   88:iload_3         
		//   42   89:iconst_1        
		//   43   90:isub            
		//   44   91:istore_3        
		//*  45   92:goto            20
		//   46   95:return          
		}

		private void d(int i1, int j1)
		{
			if(b == null)
		//*   0    0:aload_0         
		//*   1    1:getfield        #26  <Field List b>
		//*   2    4:ifnonnull       8
				return;
		//    3    7:return          
			for(int k1 = b.size() - 1; k1 >= 0; k1--)
		//*   4    8:aload_0         
		//*   5    9:getfield        #26  <Field List b>
		//*   6   12:invokeinterface #32  <Method int List.size()>
		//*   7   17:iconst_1        
		//*   8   18:isub            
		//*   9   19:istore_3        
		//*  10   20:iload_3         
		//*  11   21:iflt            70
			{
				FullSpanItem fullspanitem = (FullSpanItem)b.get(k1);
		//   12   24:aload_0         
		//   13   25:getfield        #26  <Field List b>
		//   14   28:iload_3         
		//   15   29:invokeinterface #36  <Method Object List.get(int)>
		//   16   34:checkcast       #9   <Class StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem>
		//   17   37:astore          4
				if(fullspanitem.a >= i1)
		//*  18   39:aload           4
		//*  19   41:getfield        #39  <Field int StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem.a>
		//*  20   44:iload_1         
		//*  21   45:icmpge          51
		//*  22   48:goto            63
					fullspanitem.a = fullspanitem.a + j1;
		//   23   51:aload           4
		//   24   53:aload           4
		//   25   55:getfield        #39  <Field int StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem.a>
		//   26   58:iload_2         
		//   27   59:iadd            
		//   28   60:putfield        #39  <Field int StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem.a>
			}

		//   29   63:iload_3         
		//   30   64:iconst_1        
		//   31   65:isub            
		//   32   66:istore_3        
		//*  33   67:goto            20
		//   34   70:return          
		}

		private int g(int i1)
		{
			int j1;
label0:
			{
				if(b == null)
		//*   0    0:aload_0         
		//*   1    1:getfield        #26  <Field List b>
		//*   2    4:ifnonnull       9
					return -1;
		//    3    7:iconst_m1       
		//    4    8:ireturn         
				FullSpanItem fullspanitem = f(i1);
		//    5    9:aload_0         
		//    6   10:iload_1         
		//    7   11:invokevirtual   #49  <Method StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem f(int)>
		//    8   14:astore          4
				if(fullspanitem != null)
		//*   9   16:aload           4
		//*  10   18:ifnull          33
					b.remove(((Object) (fullspanitem)));
		//   11   21:aload_0         
		//   12   22:getfield        #26  <Field List b>
		//   13   25:aload           4
		//   14   27:invokeinterface #52  <Method boolean List.remove(Object)>
		//   15   32:pop             
				int k1 = b.size();
		//   16   33:aload_0         
		//   17   34:getfield        #26  <Field List b>
		//   18   37:invokeinterface #32  <Method int List.size()>
		//   19   42:istore_3        
				for(j1 = 0; j1 < k1; j1++)
		//*  20   43:iconst_0        
		//*  21   44:istore_2        
		//*  22   45:iload_2         
		//*  23   46:iload_3         
		//*  24   47:icmpge          80
					if(((FullSpanItem)b.get(j1)).a >= i1)
		//*  25   50:aload_0         
		//*  26   51:getfield        #26  <Field List b>
		//*  27   54:iload_2         
		//*  28   55:invokeinterface #36  <Method Object List.get(int)>
		//*  29   60:checkcast       #9   <Class StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem>
		//*  30   63:getfield        #39  <Field int StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem.a>
		//*  31   66:iload_1         
		//*  32   67:icmplt          73
						break label0;
		//   33   70:goto            82

		//   34   73:iload_2         
		//   35   74:iconst_1        
		//   36   75:iadd            
		//   37   76:istore_2        
		//*  38   77:goto            45
				j1 = -1;
		//   39   80:iconst_m1       
		//   40   81:istore_2        
			}
			if(j1 != -1)
		//*  41   82:iload_2         
		//*  42   83:iconst_m1       
		//*  43   84:icmpeq          119
			{
				FullSpanItem fullspanitem1 = (FullSpanItem)b.get(j1);
		//   44   87:aload_0         
		//   45   88:getfield        #26  <Field List b>
		//   46   91:iload_2         
		//   47   92:invokeinterface #36  <Method Object List.get(int)>
		//   48   97:checkcast       #9   <Class StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem>
		//   49  100:astore          4
				b.remove(j1);
		//   50  102:aload_0         
		//   51  103:getfield        #26  <Field List b>
		//   52  106:iload_2         
		//   53  107:invokeinterface #42  <Method Object List.remove(int)>
		//   54  112:pop             
				return fullspanitem1.a;
		//   55  113:aload           4
		//   56  115:getfield        #39  <Field int StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem.a>
		//   57  118:ireturn         
			} else
			{
				return -1;
		//   58  119:iconst_m1       
		//   59  120:ireturn         
			}
		}

		int a(int i1)
		{
			if(b != null)
		//*   0    0:aload_0         
		//*   1    1:getfield        #26  <Field List b>
		//*   2    4:ifnull          61
			{
				for(int j1 = b.size() - 1; j1 >= 0; j1--)
		//*   3    7:aload_0         
		//*   4    8:getfield        #26  <Field List b>
		//*   5   11:invokeinterface #32  <Method int List.size()>
		//*   6   16:iconst_1        
		//*   7   17:isub            
		//*   8   18:istore_2        
		//*   9   19:iload_2         
		//*  10   20:iflt            61
					if(((FullSpanItem)b.get(j1)).a >= i1)
		//*  11   23:aload_0         
		//*  12   24:getfield        #26  <Field List b>
		//*  13   27:iload_2         
		//*  14   28:invokeinterface #36  <Method Object List.get(int)>
		//*  15   33:checkcast       #9   <Class StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem>
		//*  16   36:getfield        #39  <Field int StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem.a>
		//*  17   39:iload_1         
		//*  18   40:icmplt          54
						b.remove(j1);
		//   19   43:aload_0         
		//   20   44:getfield        #26  <Field List b>
		//   21   47:iload_2         
		//   22   48:invokeinterface #42  <Method Object List.remove(int)>
		//   23   53:pop             

		//   24   54:iload_2         
		//   25   55:iconst_1        
		//   26   56:isub            
		//   27   57:istore_2        
			}
		//*  28   58:goto            19
			return b(i1);
		//   29   61:aload_0         
		//   30   62:iload_1         
		//   31   63:invokevirtual   #54  <Method int b(int)>
		//   32   66:ireturn         
		}

		public FullSpanItem a(int i1, int j1, int k1, boolean flag)
		{
			if(b == null)
		//*   0    0:aload_0         
		//*   1    1:getfield        #26  <Field List b>
		//*   2    4:ifnonnull       9
				return null;
		//    3    7:aconst_null     
		//    4    8:areturn         
			int i2 = b.size();
		//    5    9:aload_0         
		//    6   10:getfield        #26  <Field List b>
		//    7   13:invokeinterface #32  <Method int List.size()>
		//    8   18:istore          6
			for(int l1 = 0; l1 < i2; l1++)
		//*   9   20:iconst_0        
		//*  10   21:istore          5
		//*  11   23:iload           5
		//*  12   25:iload           6
		//*  13   27:icmpge          104
			{
				FullSpanItem fullspanitem = (FullSpanItem)b.get(l1);
		//   14   30:aload_0         
		//   15   31:getfield        #26  <Field List b>
		//   16   34:iload           5
		//   17   36:invokeinterface #36  <Method Object List.get(int)>
		//   18   41:checkcast       #9   <Class StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem>
		//   19   44:astore          7
				if(fullspanitem.a >= j1)
		//*  20   46:aload           7
		//*  21   48:getfield        #39  <Field int StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem.a>
		//*  22   51:iload_2         
		//*  23   52:icmplt          57
					return null;
		//   24   55:aconst_null     
		//   25   56:areturn         
				if(fullspanitem.a >= i1 && (k1 == 0 || fullspanitem.b == k1 || flag && fullspanitem.d))
		//*  26   57:aload           7
		//*  27   59:getfield        #39  <Field int StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem.a>
		//*  28   62:iload_1         
		//*  29   63:icmplt          95
		//*  30   66:iload_3         
		//*  31   67:ifeq            92
		//*  32   70:aload           7
		//*  33   72:getfield        #57  <Field int android.support.v7.widget.StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem.b>
		//*  34   75:iload_3         
		//*  35   76:icmpeq          92
		//*  36   79:iload           4
		//*  37   81:ifeq            95
		//*  38   84:aload           7
		//*  39   86:getfield        #60  <Field boolean StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem.d>
		//*  40   89:ifeq            95
					return fullspanitem;
		//   41   92:aload           7
		//   42   94:areturn         
			}

		//   43   95:iload           5
		//   44   97:iconst_1        
		//   45   98:iadd            
		//   46   99:istore          5
		//*  47  101:goto            23
			return null;
		//   48  104:aconst_null     
		//   49  105:areturn         
		}

		void a()
		{
			if(a != null)
		//*   0    0:aload_0         
		//*   1    1:getfield        #62  <Field int[] a>
		//*   2    4:ifnull          15
				Arrays.fill(a, -1);
		//    3    7:aload_0         
		//    4    8:getfield        #62  <Field int[] a>
		//    5   11:iconst_m1       
		//    6   12:invokestatic    #68  <Method void Arrays.fill(int[], int)>
			b = null;
		//    7   15:aload_0         
		//    8   16:aconst_null     
		//    9   17:putfield        #26  <Field List b>
		//   10   20:return          
		}

		void a(int i1, int j1)
		{
			if(a != null)
		//*   0    0:aload_0         
		//*   1    1:getfield        #62  <Field int[] a>
		//*   2    4:ifnull          74
			{
				if(i1 >= a.length)
		//*   3    7:iload_1         
		//*   4    8:aload_0         
		//*   5    9:getfield        #62  <Field int[] a>
		//*   6   12:arraylength     
		//*   7   13:icmplt          17
					return;
		//    8   16:return          
				int k1 = i1 + j1;
		//    9   17:iload_1         
		//   10   18:iload_2         
		//   11   19:iadd            
		//   12   20:istore_3        
				e(k1);
		//   13   21:aload_0         
		//   14   22:iload_3         
		//   15   23:invokevirtual   #72  <Method void e(int)>
				System.arraycopy(((Object) (a)), k1, ((Object) (a)), i1, a.length - i1 - j1);
		//   16   26:aload_0         
		//   17   27:getfield        #62  <Field int[] a>
		//   18   30:iload_3         
		//   19   31:aload_0         
		//   20   32:getfield        #62  <Field int[] a>
		//   21   35:iload_1         
		//   22   36:aload_0         
		//   23   37:getfield        #62  <Field int[] a>
		//   24   40:arraylength     
		//   25   41:iload_1         
		//   26   42:isub            
		//   27   43:iload_2         
		//   28   44:isub            
		//   29   45:invokestatic    #78  <Method void System.arraycopy(Object, int, Object, int, int)>
				Arrays.fill(a, a.length - j1, a.length, -1);
		//   30   48:aload_0         
		//   31   49:getfield        #62  <Field int[] a>
		//   32   52:aload_0         
		//   33   53:getfield        #62  <Field int[] a>
		//   34   56:arraylength     
		//   35   57:iload_2         
		//   36   58:isub            
		//   37   59:aload_0         
		//   38   60:getfield        #62  <Field int[] a>
		//   39   63:arraylength     
		//   40   64:iconst_m1       
		//   41   65:invokestatic    #81  <Method void Arrays.fill(int[], int, int, int)>
				c(i1, j1);
		//   42   68:aload_0         
		//   43   69:iload_1         
		//   44   70:iload_2         
		//   45   71:invokespecial   #83  <Method void c(int, int)>
			}
		//   46   74:return          
		}

		void a(int i1, b b1)
		{
			e(i1);
		//    0    0:aload_0         
		//    1    1:iload_1         
		//    2    2:invokevirtual   #72  <Method void e(int)>
			a[i1] = b1.e;
		//    3    5:aload_0         
		//    4    6:getfield        #62  <Field int[] a>
		//    5    9:iload_1         
		//    6   10:aload_2         
		//    7   11:getfield        #88  <Field int StaggeredGridLayoutManager$b.e>
		//    8   14:iastore         
		//    9   15:return          
		}

		public void a(FullSpanItem fullspanitem)
		{
			if(b == null)
		//*   0    0:aload_0         
		//*   1    1:getfield        #26  <Field List b>
		//*   2    4:ifnonnull       18
				b = ((List) (new ArrayList()));
		//    3    7:aload_0         
		//    4    8:new             #91  <Class ArrayList>
		//    5   11:dup             
		//    6   12:invokespecial   #92  <Method void ArrayList()>
		//    7   15:putfield        #26  <Field List b>
			int j1 = b.size();
		//    8   18:aload_0         
		//    9   19:getfield        #26  <Field List b>
		//   10   22:invokeinterface #32  <Method int List.size()>
		//   11   27:istore_3        
			for(int i1 = 0; i1 < j1; i1++)
		//*  12   28:iconst_0        
		//*  13   29:istore_2        
		//*  14   30:iload_2         
		//*  15   31:iload_3         
		//*  16   32:icmpge          104
			{
				FullSpanItem fullspanitem1 = (FullSpanItem)b.get(i1);
		//   17   35:aload_0         
		//   18   36:getfield        #26  <Field List b>
		//   19   39:iload_2         
		//   20   40:invokeinterface #36  <Method Object List.get(int)>
		//   21   45:checkcast       #9   <Class StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem>
		//   22   48:astore          4
				if(fullspanitem1.a == fullspanitem.a)
		//*  23   50:aload           4
		//*  24   52:getfield        #39  <Field int StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem.a>
		//*  25   55:aload_1         
		//*  26   56:getfield        #39  <Field int StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem.a>
		//*  27   59:icmpne          73
					b.remove(i1);
		//   28   62:aload_0         
		//   29   63:getfield        #26  <Field List b>
		//   30   66:iload_2         
		//   31   67:invokeinterface #42  <Method Object List.remove(int)>
		//   32   72:pop             
				if(fullspanitem1.a >= fullspanitem.a)
		//*  33   73:aload           4
		//*  34   75:getfield        #39  <Field int StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem.a>
		//*  35   78:aload_1         
		//*  36   79:getfield        #39  <Field int StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem.a>
		//*  37   82:icmplt          97
				{
					b.add(i1, ((Object) (fullspanitem)));
		//   38   85:aload_0         
		//   39   86:getfield        #26  <Field List b>
		//   40   89:iload_2         
		//   41   90:aload_1         
		//   42   91:invokeinterface #96  <Method void List.add(int, Object)>
					return;
		//   43   96:return          
				}
			}

		//   44   97:iload_2         
		//   45   98:iconst_1        
		//   46   99:iadd            
		//   47  100:istore_2        
		//*  48  101:goto            30
			b.add(((Object) (fullspanitem)));
		//   49  104:aload_0         
		//   50  105:getfield        #26  <Field List b>
		//   51  108:aload_1         
		//   52  109:invokeinterface #98  <Method boolean List.add(Object)>
		//   53  114:pop             
		//   54  115:return          
		}

		int b(int i1)
		{
			if(a == null)
		//*   0    0:aload_0         
		//*   1    1:getfield        #62  <Field int[] a>
		//*   2    4:ifnonnull       9
				return -1;
		//    3    7:iconst_m1       
		//    4    8:ireturn         
			if(i1 >= a.length)
		//*   5    9:iload_1         
		//*   6   10:aload_0         
		//*   7   11:getfield        #62  <Field int[] a>
		//*   8   14:arraylength     
		//*   9   15:icmplt          20
				return -1;
		//   10   18:iconst_m1       
		//   11   19:ireturn         
			int j1 = g(i1);
		//   12   20:aload_0         
		//   13   21:iload_1         
		//   14   22:invokespecial   #100 <Method int g(int)>
		//   15   25:istore_2        
			if(j1 == -1)
		//*  16   26:iload_2         
		//*  17   27:iconst_m1       
		//*  18   28:icmpne          51
			{
				Arrays.fill(a, i1, a.length, -1);
		//   19   31:aload_0         
		//   20   32:getfield        #62  <Field int[] a>
		//   21   35:iload_1         
		//   22   36:aload_0         
		//   23   37:getfield        #62  <Field int[] a>
		//   24   40:arraylength     
		//   25   41:iconst_m1       
		//   26   42:invokestatic    #81  <Method void Arrays.fill(int[], int, int, int)>
				return a.length;
		//   27   45:aload_0         
		//   28   46:getfield        #62  <Field int[] a>
		//   29   49:arraylength     
		//   30   50:ireturn         
			} else
			{
				int ai[] = a;
		//   31   51:aload_0         
		//   32   52:getfield        #62  <Field int[] a>
		//   33   55:astore_3        
				j1++;
		//   34   56:iload_2         
		//   35   57:iconst_1        
		//   36   58:iadd            
		//   37   59:istore_2        
				Arrays.fill(ai, i1, j1, -1);
		//   38   60:aload_3         
		//   39   61:iload_1         
		//   40   62:iload_2         
		//   41   63:iconst_m1       
		//   42   64:invokestatic    #81  <Method void Arrays.fill(int[], int, int, int)>
				return j1;
		//   43   67:iload_2         
		//   44   68:ireturn         
			}
		}

		void b(int i1, int j1)
		{
			if(a != null)
		//*   0    0:aload_0         
		//*   1    1:getfield        #62  <Field int[] a>
		//*   2    4:ifnull          64
			{
				if(i1 >= a.length)
		//*   3    7:iload_1         
		//*   4    8:aload_0         
		//*   5    9:getfield        #62  <Field int[] a>
		//*   6   12:arraylength     
		//*   7   13:icmplt          17
					return;
		//    8   16:return          
				int k1 = i1 + j1;
		//    9   17:iload_1         
		//   10   18:iload_2         
		//   11   19:iadd            
		//   12   20:istore_3        
				e(k1);
		//   13   21:aload_0         
		//   14   22:iload_3         
		//   15   23:invokevirtual   #72  <Method void e(int)>
				System.arraycopy(((Object) (a)), i1, ((Object) (a)), k1, a.length - i1 - j1);
		//   16   26:aload_0         
		//   17   27:getfield        #62  <Field int[] a>
		//   18   30:iload_1         
		//   19   31:aload_0         
		//   20   32:getfield        #62  <Field int[] a>
		//   21   35:iload_3         
		//   22   36:aload_0         
		//   23   37:getfield        #62  <Field int[] a>
		//   24   40:arraylength     
		//   25   41:iload_1         
		//   26   42:isub            
		//   27   43:iload_2         
		//   28   44:isub            
		//   29   45:invokestatic    #78  <Method void System.arraycopy(Object, int, Object, int, int)>
				Arrays.fill(a, i1, k1, -1);
		//   30   48:aload_0         
		//   31   49:getfield        #62  <Field int[] a>
		//   32   52:iload_1         
		//   33   53:iload_3         
		//   34   54:iconst_m1       
		//   35   55:invokestatic    #81  <Method void Arrays.fill(int[], int, int, int)>
				d(i1, j1);
		//   36   58:aload_0         
		//   37   59:iload_1         
		//   38   60:iload_2         
		//   39   61:invokespecial   #102 <Method void d(int, int)>
			}
		//   40   64:return          
		}

		int c(int i1)
		{
			if(a != null && i1 < a.length)
		//*   0    0:aload_0         
		//*   1    1:getfield        #62  <Field int[] a>
		//*   2    4:ifnull          26
		//*   3    7:iload_1         
		//*   4    8:aload_0         
		//*   5    9:getfield        #62  <Field int[] a>
		//*   6   12:arraylength     
		//*   7   13:icmplt          19
		//*   8   16:goto            26
				return a[i1];
		//    9   19:aload_0         
		//   10   20:getfield        #62  <Field int[] a>
		//   11   23:iload_1         
		//   12   24:iaload          
		//   13   25:ireturn         
			else
				return -1;
		//   14   26:iconst_m1       
		//   15   27:ireturn         
		}

		int d(int i1)
		{
			int j1;
			for(j1 = a.length; j1 <= i1; j1 *= 2);
		//    0    0:aload_0         
		//    1    1:getfield        #62  <Field int[] a>
		//    2    4:arraylength     
		//    3    5:istore_2        
		//    4    6:iload_2         
		//    5    7:iload_1         
		//    6    8:icmpgt          18
		//    7   11:iload_2         
		//    8   12:iconst_2        
		//    9   13:imul            
		//   10   14:istore_2        
		//*  11   15:goto            6
			return j1;
		//   12   18:iload_2         
		//   13   19:ireturn         
		}

		void e(int i1)
		{
			if(a == null)
		//*   0    0:aload_0         
		//*   1    1:getfield        #62  <Field int[] a>
		//*   2    4:ifnonnull       30
			{
				a = new int[Math.max(i1, 10) + 1];
		//    3    7:aload_0         
		//    4    8:iload_1         
		//    5    9:bipush          10
		//    6   11:invokestatic    #108 <Method int Math.max(int, int)>
		//    7   14:iconst_1        
		//    8   15:iadd            
		//    9   16:newarray        int[]
		//   10   18:putfield        #62  <Field int[] a>
				Arrays.fill(a, -1);
		//   11   21:aload_0         
		//   12   22:getfield        #62  <Field int[] a>
		//   13   25:iconst_m1       
		//   14   26:invokestatic    #68  <Method void Arrays.fill(int[], int)>
				return;
		//   15   29:return          
			}
			if(i1 >= a.length)
		//*  16   30:iload_1         
		//*  17   31:aload_0         
		//*  18   32:getfield        #62  <Field int[] a>
		//*  19   35:arraylength     
		//*  20   36:icmplt          82
			{
				int ai[] = a;
		//   21   39:aload_0         
		//   22   40:getfield        #62  <Field int[] a>
		//   23   43:astore_2        
				a = new int[d(i1)];
		//   24   44:aload_0         
		//   25   45:aload_0         
		//   26   46:iload_1         
		//   27   47:invokevirtual   #110 <Method int d(int)>
		//   28   50:newarray        int[]
		//   29   52:putfield        #62  <Field int[] a>
				System.arraycopy(((Object) (ai)), 0, ((Object) (a)), 0, ai.length);
		//   30   55:aload_2         
		//   31   56:iconst_0        
		//   32   57:aload_0         
		//   33   58:getfield        #62  <Field int[] a>
		//   34   61:iconst_0        
		//   35   62:aload_2         
		//   36   63:arraylength     
		//   37   64:invokestatic    #78  <Method void System.arraycopy(Object, int, Object, int, int)>
				Arrays.fill(a, ai.length, a.length, -1);
		//   38   67:aload_0         
		//   39   68:getfield        #62  <Field int[] a>
		//   40   71:aload_2         
		//   41   72:arraylength     
		//   42   73:aload_0         
		//   43   74:getfield        #62  <Field int[] a>
		//   44   77:arraylength     
		//   45   78:iconst_m1       
		//   46   79:invokestatic    #81  <Method void Arrays.fill(int[], int, int, int)>
			}
		//   47   82:return          
		}

		public FullSpanItem f(int i1)
		{
			if(b == null)
		//*   0    0:aload_0         
		//*   1    1:getfield        #26  <Field List b>
		//*   2    4:ifnonnull       9
				return null;
		//    3    7:aconst_null     
		//    4    8:areturn         
			for(int j1 = b.size() - 1; j1 >= 0; j1--)
		//*   5    9:aload_0         
		//*   6   10:getfield        #26  <Field List b>
		//*   7   13:invokeinterface #32  <Method int List.size()>
		//*   8   18:iconst_1        
		//*   9   19:isub            
		//*  10   20:istore_2        
		//*  11   21:iload_2         
		//*  12   22:iflt            56
			{
				FullSpanItem fullspanitem = (FullSpanItem)b.get(j1);
		//   13   25:aload_0         
		//   14   26:getfield        #26  <Field List b>
		//   15   29:iload_2         
		//   16   30:invokeinterface #36  <Method Object List.get(int)>
		//   17   35:checkcast       #9   <Class StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem>
		//   18   38:astore_3        
				if(fullspanitem.a == i1)
		//*  19   39:aload_3         
		//*  20   40:getfield        #39  <Field int StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem.a>
		//*  21   43:iload_1         
		//*  22   44:icmpne          49
					return fullspanitem;
		//   23   47:aload_3         
		//   24   48:areturn         
			}

		//   25   49:iload_2         
		//   26   50:iconst_1        
		//   27   51:isub            
		//   28   52:istore_2        
		//*  29   53:goto            21
			return null;
		//   30   56:aconst_null     
		//   31   57:areturn         
		}

		int a[];
		List b;

		LazySpanLookup()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #21  <Method void Object()>
		//    2    4:return          
		}
	}

	static class LazySpanLookup.FullSpanItem
		implements Parcelable
	{

		int a(int i1)
		{
			if(c == null)
		//*   0    0:aload_0         
		//*   1    1:getfield        #48  <Field int[] c>
		//*   2    4:ifnonnull       9
				return 0;
		//    3    7:iconst_0        
		//    4    8:ireturn         
			else
				return c[i1];
		//    5    9:aload_0         
		//    6   10:getfield        #48  <Field int[] c>
		//    7   13:iload_1         
		//    8   14:iaload          
		//    9   15:ireturn         
		}

		public int describeContents()
		{
			return 0;
		//    0    0:iconst_0        
		//    1    1:ireturn         
		}

		public String toString()
		{
			StringBuilder stringbuilder = new StringBuilder();
		//    0    0:new             #58  <Class StringBuilder>
		//    1    3:dup             
		//    2    4:invokespecial   #59  <Method void StringBuilder()>
		//    3    7:astore_1        
			stringbuilder.append("FullSpanItem{mPosition=");
		//    4    8:aload_1         
		//    5    9:ldc1            #61  <String "FullSpanItem{mPosition=">
		//    6   11:invokevirtual   #65  <Method StringBuilder StringBuilder.append(String)>
		//    7   14:pop             
			stringbuilder.append(a);
		//    8   15:aload_1         
		//    9   16:aload_0         
		//   10   17:getfield        #42  <Field int a>
		//   11   20:invokevirtual   #68  <Method StringBuilder StringBuilder.append(int)>
		//   12   23:pop             
			stringbuilder.append(", mGapDir=");
		//   13   24:aload_1         
		//   14   25:ldc1            #70  <String ", mGapDir=">
		//   15   27:invokevirtual   #65  <Method StringBuilder StringBuilder.append(String)>
		//   16   30:pop             
			stringbuilder.append(b);
		//   17   31:aload_1         
		//   18   32:aload_0         
		//   19   33:getfield        #44  <Field int b>
		//   20   36:invokevirtual   #68  <Method StringBuilder StringBuilder.append(int)>
		//   21   39:pop             
			stringbuilder.append(", mHasUnwantedGapAfter=");
		//   22   40:aload_1         
		//   23   41:ldc1            #72  <String ", mHasUnwantedGapAfter=">
		//   24   43:invokevirtual   #65  <Method StringBuilder StringBuilder.append(String)>
		//   25   46:pop             
			stringbuilder.append(d);
		//   26   47:aload_1         
		//   27   48:aload_0         
		//   28   49:getfield        #46  <Field boolean d>
		//   29   52:invokevirtual   #75  <Method StringBuilder StringBuilder.append(boolean)>
		//   30   55:pop             
			stringbuilder.append(", mGapPerSpan=");
		//   31   56:aload_1         
		//   32   57:ldc1            #77  <String ", mGapPerSpan=">
		//   33   59:invokevirtual   #65  <Method StringBuilder StringBuilder.append(String)>
		//   34   62:pop             
			stringbuilder.append(Arrays.toString(c));
		//   35   63:aload_1         
		//   36   64:aload_0         
		//   37   65:getfield        #48  <Field int[] c>
		//   38   68:invokestatic    #82  <Method String Arrays.toString(int[])>
		//   39   71:invokevirtual   #65  <Method StringBuilder StringBuilder.append(String)>
		//   40   74:pop             
			stringbuilder.append('}');
		//   41   75:aload_1         
		//   42   76:bipush          125
		//   43   78:invokevirtual   #85  <Method StringBuilder StringBuilder.append(char)>
		//   44   81:pop             
			return stringbuilder.toString();
		//   45   82:aload_1         
		//   46   83:invokevirtual   #87  <Method String StringBuilder.toString()>
		//   47   86:areturn         
		}

		public void writeToParcel(Parcel parcel, int i1)
		{
			throw new Runtime("d2j fail translate: java.lang.RuntimeException: can not merge I and Z\n\tat com.googlecode.dex2jar.ir.TypeClass.merge(TypeClass.java:100)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeRef.updateTypeClass(TypeTransformer.java:174)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.provideAs(TypeTransformer.java:780)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.e1expr(TypeTransformer.java:496)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:713)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:703)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.enexpr(TypeTransformer.java:698)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:719)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:703)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.s1stmt(TypeTransformer.java:810)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.sxStmt(TypeTransformer.java:840)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.analyze(TypeTransformer.java:206)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer.transform(TypeTransformer.java:44)\n\tat com.googlecode.d2j.dex.Dex2jar$2.optimize(Dex2jar.java:162)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertCode(Dex2Asm.java:414)\n\tat com.googlecode.d2j.dex.ExDex2Asm.convertCode(ExDex2Asm.java:42)\n\tat com.googlecode.d2j.dex.Dex2jar$2.convertCode(Dex2jar.java:128)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertMethod(Dex2Asm.java:509)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertClass(Dex2Asm.java:406)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertDex(Dex2Asm.java:422)\n\tat com.googlecode.d2j.dex.Dex2jar.doTranslate(Dex2jar.java:172)\n\tat com.googlecode.d2j.dex.Dex2jar.to(Dex2jar.java:272)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.doCommandLine(Dex2jarCmd.java:108)\n\tat com.googlecode.dex2jar.tools.BaseCmd.doMain(BaseCmd.java:288)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.main(Dex2jarCmd.java:32)\n");
		//    0    0:new             #91  <Class RuntimeException>
		//    1    3:dup             
		//    2    4:ldc1            #93  <String "d2j fail translate: java.lang.RuntimeException: can not merge I and Z\n\tat com.googlecode.dex2jar.ir.TypeClass.merge(TypeClass.java:100)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeRef.updateTypeClass(TypeTransformer.java:174)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.provideAs(TypeTransformer.java:780)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.e1expr(TypeTransformer.java:496)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:713)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:703)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.enexpr(TypeTransformer.java:698)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:719)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:703)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.s1stmt(TypeTransformer.java:810)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.sxStmt(TypeTransformer.java:840)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.analyze(TypeTransformer.java:206)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer.transform(TypeTransformer.java:44)\n\tat com.googlecode.d2j.dex.Dex2jar$2.optimize(Dex2jar.java:162)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertCode(Dex2Asm.java:414)\n\tat com.googlecode.d2j.dex.ExDex2Asm.convertCode(ExDex2Asm.java:42)\n\tat com.googlecode.d2j.dex.Dex2jar$2.convertCode(Dex2jar.java:128)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertMethod(Dex2Asm.java:509)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertClass(Dex2Asm.java:406)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertDex(Dex2Asm.java:422)\n\tat com.googlecode.d2j.dex.Dex2jar.doTranslate(Dex2jar.java:172)\n\tat com.googlecode.d2j.dex.Dex2jar.to(Dex2jar.java:272)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.doCommandLine(Dex2jarCmd.java:108)\n\tat com.googlecode.dex2jar.tools.BaseCmd.doMain(BaseCmd.java:288)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.main(Dex2jarCmd.java:32)\n">
		//    3    6:invokespecial   #98  <Method void Runtime(String)>
		//    4    9:athrow          
		}

		public static final android.os.Parcelable.Creator CREATOR = new android.os.Parcelable.Creator() {

			public LazySpanLookup.FullSpanItem a(Parcel parcel)
			{
				return new LazySpanLookup.FullSpanItem(parcel);
			//    0    0:new             #9   <Class StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem>
			//    1    3:dup             
			//    2    4:aload_1         
			//    3    5:invokespecial   #25  <Method void StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem(Parcel)>
			//    4    8:areturn         
			}

			public LazySpanLookup.FullSpanItem[] a(int i1)
			{
				return new LazySpanLookup.FullSpanItem[i1];
			//    0    0:iload_1         
			//    1    1:anewarray       LazySpanLookup.FullSpanItem[]
			//    2    4:areturn         
			}

			public Object createFromParcel(Parcel parcel)
			{
				return ((Object) (a(parcel)));
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:invokevirtual   #30  <Method StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem a(Parcel)>
			//    3    5:areturn         
			}

			public Object[] newArray(int i1)
			{
				return ((Object []) (a(i1)));
			//    0    0:aload_0         
			//    1    1:iload_1         
			//    2    2:invokevirtual   #34  <Method StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem[] a(int)>
			//    3    5:areturn         
			}

		}
;
		int a;
		int b;
		int c[];
		boolean d;

		static 
		{
		//    0    0:new             #14  <Class StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem$1>
		//    1    3:dup             
		//    2    4:invokespecial   #29  <Method void StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem$1()>
		//    3    7:putstatic       #31  <Field android.os.Parcelable$Creator CREATOR>
		//*   4   10:return          
		}

		LazySpanLookup.FullSpanItem()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #33  <Method void Object()>
		//    2    4:return          
		}

		LazySpanLookup.FullSpanItem(Parcel parcel)
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #33  <Method void Object()>
			a = parcel.readInt();
		//    2    4:aload_0         
		//    3    5:aload_1         
		//    4    6:invokevirtual   #40  <Method int Parcel.readInt()>
		//    5    9:putfield        #42  <Field int a>
			b = parcel.readInt();
		//    6   12:aload_0         
		//    7   13:aload_1         
		//    8   14:invokevirtual   #40  <Method int Parcel.readInt()>
		//    9   17:putfield        #44  <Field int b>
			int i1 = parcel.readInt();
		//   10   20:aload_1         
		//   11   21:invokevirtual   #40  <Method int Parcel.readInt()>
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
			d = flag;
		//   21   37:aload_0         
		//   22   38:iload_3         
		//   23   39:putfield        #46  <Field boolean d>
			i1 = parcel.readInt();
		//   24   42:aload_1         
		//   25   43:invokevirtual   #40  <Method int Parcel.readInt()>
		//   26   46:istore_2        
			if(i1 > 0)
		//*  27   47:iload_2         
		//*  28   48:ifle            66
			{
				c = new int[i1];
		//   29   51:aload_0         
		//   30   52:iload_2         
		//   31   53:newarray        int[]
		//   32   55:putfield        #48  <Field int[] c>
				parcel.readIntArray(c);
		//   33   58:aload_1         
		//   34   59:aload_0         
		//   35   60:getfield        #48  <Field int[] c>
		//   36   63:invokevirtual   #52  <Method void Parcel.readIntArray(int[])>
			}
		//   37   66:return          
		}
	}

	public static class SavedState
		implements Parcelable
	{

		void a()
		{
			d = null;
		//    0    0:aload_0         
		//    1    1:aconst_null     
		//    2    2:putfield        #53  <Field int[] d>
			c = 0;
		//    3    5:aload_0         
		//    4    6:iconst_0        
		//    5    7:putfield        #51  <Field int c>
			e = 0;
		//    6   10:aload_0         
		//    7   11:iconst_0        
		//    8   12:putfield        #59  <Field int e>
			f = null;
		//    9   15:aload_0         
		//   10   16:aconst_null     
		//   11   17:putfield        #61  <Field int[] f>
			g = null;
		//   12   20:aload_0         
		//   13   21:aconst_null     
		//   14   22:putfield        #81  <Field List g>
		//   15   25:return          
		}

		void b()
		{
			d = null;
		//    0    0:aload_0         
		//    1    1:aconst_null     
		//    2    2:putfield        #53  <Field int[] d>
			c = 0;
		//    3    5:aload_0         
		//    4    6:iconst_0        
		//    5    7:putfield        #51  <Field int c>
			a = -1;
		//    6   10:aload_0         
		//    7   11:iconst_m1       
		//    8   12:putfield        #47  <Field int a>
			b = -1;
		//    9   15:aload_0         
		//   10   16:iconst_m1       
		//   11   17:putfield        #49  <Field int b>
		//   12   20:return          
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
		//    0    0:new             #87  <Class RuntimeException>
		//    1    3:dup             
		//    2    4:ldc1            #89  <String "d2j fail translate: java.lang.RuntimeException: can not merge I and Z\n\tat com.googlecode.dex2jar.ir.TypeClass.merge(TypeClass.java:100)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeRef.updateTypeClass(TypeTransformer.java:174)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.provideAs(TypeTransformer.java:780)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.e1expr(TypeTransformer.java:496)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:713)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:703)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.enexpr(TypeTransformer.java:698)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:719)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:703)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.s1stmt(TypeTransformer.java:810)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.sxStmt(TypeTransformer.java:840)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.analyze(TypeTransformer.java:206)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer.transform(TypeTransformer.java:44)\n\tat com.googlecode.d2j.dex.Dex2jar$2.optimize(Dex2jar.java:162)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertCode(Dex2Asm.java:414)\n\tat com.googlecode.d2j.dex.ExDex2Asm.convertCode(ExDex2Asm.java:42)\n\tat com.googlecode.d2j.dex.Dex2jar$2.convertCode(Dex2jar.java:128)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertMethod(Dex2Asm.java:509)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertClass(Dex2Asm.java:406)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertDex(Dex2Asm.java:422)\n\tat com.googlecode.d2j.dex.Dex2jar.doTranslate(Dex2jar.java:172)\n\tat com.googlecode.d2j.dex.Dex2jar.to(Dex2jar.java:272)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.doCommandLine(Dex2jarCmd.java:108)\n\tat com.googlecode.dex2jar.tools.BaseCmd.doMain(BaseCmd.java:288)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.main(Dex2jarCmd.java:32)\n">
		//    3    6:invokespecial   #94  <Method void Runtime(String)>
		//    4    9:athrow          
		}

		public static final android.os.Parcelable.Creator CREATOR = new android.os.Parcelable.Creator() {

			public SavedState a(Parcel parcel)
			{
				return new SavedState(parcel);
			//    0    0:new             #9   <Class StaggeredGridLayoutManager$SavedState>
			//    1    3:dup             
			//    2    4:aload_1         
			//    3    5:invokespecial   #22  <Method void StaggeredGridLayoutManager$SavedState(Parcel)>
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
			//    2    2:invokevirtual   #27  <Method StaggeredGridLayoutManager$SavedState a(Parcel)>
			//    3    5:areturn         
			}

			public Object[] newArray(int i1)
			{
				return ((Object []) (a(i1)));
			//    0    0:aload_0         
			//    1    1:iload_1         
			//    2    2:invokevirtual   #31  <Method StaggeredGridLayoutManager$SavedState[] a(int)>
			//    3    5:areturn         
			}

		}
;
		int a;
		int b;
		int c;
		int d[];
		int e;
		int f[];
		List g;
		boolean h;
		boolean i;
		boolean j;

		static 
		{
		//    0    0:new             #11  <Class StaggeredGridLayoutManager$SavedState$1>
		//    1    3:dup             
		//    2    4:invokespecial   #34  <Method void StaggeredGridLayoutManager$SavedState$1()>
		//    3    7:putstatic       #36  <Field android.os.Parcelable$Creator CREATOR>
		//*   4   10:return          
		}

		public SavedState()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #38  <Method void Object()>
		//    2    4:return          
		}

		SavedState(Parcel parcel)
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #38  <Method void Object()>
			a = parcel.readInt();
		//    2    4:aload_0         
		//    3    5:aload_1         
		//    4    6:invokevirtual   #45  <Method int Parcel.readInt()>
		//    5    9:putfield        #47  <Field int a>
			b = parcel.readInt();
		//    6   12:aload_0         
		//    7   13:aload_1         
		//    8   14:invokevirtual   #45  <Method int Parcel.readInt()>
		//    9   17:putfield        #49  <Field int b>
			c = parcel.readInt();
		//   10   20:aload_0         
		//   11   21:aload_1         
		//   12   22:invokevirtual   #45  <Method int Parcel.readInt()>
		//   13   25:putfield        #51  <Field int c>
			if(c > 0)
		//*  14   28:aload_0         
		//*  15   29:getfield        #51  <Field int c>
		//*  16   32:ifle            53
			{
				d = new int[c];
		//   17   35:aload_0         
		//   18   36:aload_0         
		//   19   37:getfield        #51  <Field int c>
		//   20   40:newarray        int[]
		//   21   42:putfield        #53  <Field int[] d>
				parcel.readIntArray(d);
		//   22   45:aload_1         
		//   23   46:aload_0         
		//   24   47:getfield        #53  <Field int[] d>
		//   25   50:invokevirtual   #57  <Method void Parcel.readIntArray(int[])>
			}
			e = parcel.readInt();
		//   26   53:aload_0         
		//   27   54:aload_1         
		//   28   55:invokevirtual   #45  <Method int Parcel.readInt()>
		//   29   58:putfield        #59  <Field int e>
			if(e > 0)
		//*  30   61:aload_0         
		//*  31   62:getfield        #59  <Field int e>
		//*  32   65:ifle            86
			{
				f = new int[e];
		//   33   68:aload_0         
		//   34   69:aload_0         
		//   35   70:getfield        #59  <Field int e>
		//   36   73:newarray        int[]
		//   37   75:putfield        #61  <Field int[] f>
				parcel.readIntArray(f);
		//   38   78:aload_1         
		//   39   79:aload_0         
		//   40   80:getfield        #61  <Field int[] f>
		//   41   83:invokevirtual   #57  <Method void Parcel.readIntArray(int[])>
			}
			int i1 = parcel.readInt();
		//   42   86:aload_1         
		//   43   87:invokevirtual   #45  <Method int Parcel.readInt()>
		//   44   90:istore_2        
			boolean flag1 = false;
		//   45   91:iconst_0        
		//   46   92:istore          4
			boolean flag;
			if(i1 == 1)
		//*  47   94:iload_2         
		//*  48   95:iconst_1        
		//*  49   96:icmpne          104
				flag = true;
		//   50   99:iconst_1        
		//   51  100:istore_3        
			else
		//*  52  101:goto            106
				flag = false;
		//   53  104:iconst_0        
		//   54  105:istore_3        
			h = flag;
		//   55  106:aload_0         
		//   56  107:iload_3         
		//   57  108:putfield        #63  <Field boolean h>
			if(parcel.readInt() == 1)
		//*  58  111:aload_1         
		//*  59  112:invokevirtual   #45  <Method int Parcel.readInt()>
		//*  60  115:iconst_1        
		//*  61  116:icmpne          124
				flag = true;
		//   62  119:iconst_1        
		//   63  120:istore_3        
			else
		//*  64  121:goto            126
				flag = false;
		//   65  124:iconst_0        
		//   66  125:istore_3        
			i = flag;
		//   67  126:aload_0         
		//   68  127:iload_3         
		//   69  128:putfield        #65  <Field boolean i>
			flag = flag1;
		//   70  131:iload           4
		//   71  133:istore_3        
			if(parcel.readInt() == 1)
		//*  72  134:aload_1         
		//*  73  135:invokevirtual   #45  <Method int Parcel.readInt()>
		//*  74  138:iconst_1        
		//*  75  139:icmpne          144
				flag = true;
		//   76  142:iconst_1        
		//   77  143:istore_3        
			j = flag;
		//   78  144:aload_0         
		//   79  145:iload_3         
		//   80  146:putfield        #67  <Field boolean j>
			g = ((List) (parcel.readArrayList(((Class) (android/support/v7/widget/StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem)).getClassLoader())));
		//   81  149:aload_0         
		//   82  150:aload_1         
		//   83  151:ldc1            #69  <Class StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem>
		//   84  153:invokevirtual   #75  <Method ClassLoader Class.getClassLoader()>
		//   85  156:invokevirtual   #79  <Method ArrayList Parcel.readArrayList(ClassLoader)>
		//   86  159:putfield        #81  <Field List g>
		//   87  162:return          
		}

		public SavedState(SavedState savedstate)
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #38  <Method void Object()>
			c = savedstate.c;
		//    2    4:aload_0         
		//    3    5:aload_1         
		//    4    6:getfield        #51  <Field int c>
		//    5    9:putfield        #51  <Field int c>
			a = savedstate.a;
		//    6   12:aload_0         
		//    7   13:aload_1         
		//    8   14:getfield        #47  <Field int a>
		//    9   17:putfield        #47  <Field int a>
			b = savedstate.b;
		//   10   20:aload_0         
		//   11   21:aload_1         
		//   12   22:getfield        #49  <Field int b>
		//   13   25:putfield        #49  <Field int b>
			d = savedstate.d;
		//   14   28:aload_0         
		//   15   29:aload_1         
		//   16   30:getfield        #53  <Field int[] d>
		//   17   33:putfield        #53  <Field int[] d>
			e = savedstate.e;
		//   18   36:aload_0         
		//   19   37:aload_1         
		//   20   38:getfield        #59  <Field int e>
		//   21   41:putfield        #59  <Field int e>
			f = savedstate.f;
		//   22   44:aload_0         
		//   23   45:aload_1         
		//   24   46:getfield        #61  <Field int[] f>
		//   25   49:putfield        #61  <Field int[] f>
			h = savedstate.h;
		//   26   52:aload_0         
		//   27   53:aload_1         
		//   28   54:getfield        #63  <Field boolean h>
		//   29   57:putfield        #63  <Field boolean h>
			i = savedstate.i;
		//   30   60:aload_0         
		//   31   61:aload_1         
		//   32   62:getfield        #65  <Field boolean i>
		//   33   65:putfield        #65  <Field boolean i>
			j = savedstate.j;
		//   34   68:aload_0         
		//   35   69:aload_1         
		//   36   70:getfield        #67  <Field boolean j>
		//   37   73:putfield        #67  <Field boolean j>
			g = savedstate.g;
		//   38   76:aload_0         
		//   39   77:aload_1         
		//   40   78:getfield        #81  <Field List g>
		//   41   81:putfield        #81  <Field List g>
		//   42   84:return          
		}
	}

	class a
	{

		void a()
		{
			a = -1;
		//    0    0:aload_0         
		//    1    1:iconst_m1       
		//    2    2:putfield        #29  <Field int a>
			b = 0x80000000;
		//    3    5:aload_0         
		//    4    6:ldc1            #30  <Int 0x80000000>
		//    5    8:putfield        #32  <Field int b>
			c = false;
		//    6   11:aload_0         
		//    7   12:iconst_0        
		//    8   13:putfield        #34  <Field boolean c>
			d = false;
		//    9   16:aload_0         
		//   10   17:iconst_0        
		//   11   18:putfield        #36  <Field boolean d>
			e = false;
		//   12   21:aload_0         
		//   13   22:iconst_0        
		//   14   23:putfield        #38  <Field boolean e>
			if(f != null)
		//*  15   26:aload_0         
		//*  16   27:getfield        #40  <Field int[] f>
		//*  17   30:ifnull          41
				Arrays.fill(f, -1);
		//   18   33:aload_0         
		//   19   34:getfield        #40  <Field int[] f>
		//   20   37:iconst_m1       
		//   21   38:invokestatic    #46  <Method void Arrays.fill(int[], int)>
		//   22   41:return          
		}

		void a(int i1)
		{
			if(c)
		//*   0    0:aload_0         
		//*   1    1:getfield        #34  <Field boolean c>
		//*   2    4:ifeq            26
				i1 = g.b.d() - i1;
		//    3    7:aload_0         
		//    4    8:getfield        #21  <Field StaggeredGridLayoutManager g>
		//    5   11:getfield        #50  <Field ah android.support.v7.widget.StaggeredGridLayoutManager.b>
		//    6   14:invokevirtual   #55  <Method int ah.d()>
		//    7   17:iload_1         
		//    8   18:isub            
		//    9   19:istore_1        
			else
		//*  10   20:aload_0         
		//*  11   21:iload_1         
		//*  12   22:putfield        #32  <Field int b>
		//*  13   25:return          
				i1 = g.b.c() + i1;
		//   14   26:aload_0         
		//   15   27:getfield        #21  <Field StaggeredGridLayoutManager g>
		//   16   30:getfield        #50  <Field ah android.support.v7.widget.StaggeredGridLayoutManager.b>
		//   17   33:invokevirtual   #57  <Method int ah.c()>
		//   18   36:iload_1         
		//   19   37:iadd            
		//   20   38:istore_1        
			b = i1;
		//*  21   39:goto            20
		}

		void a(b ab[])
		{
			int j1 = ab.length;
		//    0    0:aload_1         
		//    1    1:arraylength     
		//    2    2:istore_3        
			if(f == null || f.length < j1)
		//*   3    3:aload_0         
		//*   4    4:getfield        #40  <Field int[] f>
		//*   5    7:ifnull          19
		//*   6   10:aload_0         
		//*   7   11:getfield        #40  <Field int[] f>
		//*   8   14:arraylength     
		//*   9   15:iload_3         
		//*  10   16:icmpge          33
				f = new int[g.a.length];
		//   11   19:aload_0         
		//   12   20:aload_0         
		//   13   21:getfield        #21  <Field StaggeredGridLayoutManager g>
		//   14   24:getfield        #61  <Field StaggeredGridLayoutManager$b[] StaggeredGridLayoutManager.a>
		//   15   27:arraylength     
		//   16   28:newarray        int[]
		//   17   30:putfield        #40  <Field int[] f>
			for(int i1 = 0; i1 < j1; i1++)
		//*  18   33:iconst_0        
		//*  19   34:istore_2        
		//*  20   35:iload_2         
		//*  21   36:iload_3         
		//*  22   37:icmpge          61
				f[i1] = ab[i1].a(0x80000000);
		//   23   40:aload_0         
		//   24   41:getfield        #40  <Field int[] f>
		//   25   44:iload_2         
		//   26   45:aload_1         
		//   27   46:iload_2         
		//   28   47:aaload          
		//   29   48:ldc1            #30  <Int 0x80000000>
		//   30   50:invokevirtual   #66  <Method int StaggeredGridLayoutManager$b.a(int)>
		//   31   53:iastore         

		//   32   54:iload_2         
		//   33   55:iconst_1        
		//   34   56:iadd            
		//   35   57:istore_2        
		//*  36   58:goto            35
		//   37   61:return          
		}

		void b()
		{
			int i1;
			if(c)
		//*   0    0:aload_0         
		//*   1    1:getfield        #34  <Field boolean c>
		//*   2    4:ifeq            21
				i1 = g.b.d();
		//    3    7:aload_0         
		//    4    8:getfield        #21  <Field StaggeredGridLayoutManager g>
		//    5   11:getfield        #50  <Field ah android.support.v7.widget.StaggeredGridLayoutManager.b>
		//    6   14:invokevirtual   #55  <Method int ah.d()>
		//    7   17:istore_1        
			else
		//*   8   18:goto            32
				i1 = g.b.c();
		//    9   21:aload_0         
		//   10   22:getfield        #21  <Field StaggeredGridLayoutManager g>
		//   11   25:getfield        #50  <Field ah android.support.v7.widget.StaggeredGridLayoutManager.b>
		//   12   28:invokevirtual   #57  <Method int ah.c()>
		//   13   31:istore_1        
			b = i1;
		//   14   32:aload_0         
		//   15   33:iload_1         
		//   16   34:putfield        #32  <Field int b>
		//   17   37:return          
		}

		int a;
		int b;
		boolean c;
		boolean d;
		boolean e;
		int f[];
		final StaggeredGridLayoutManager g;

		a()
		{
			g = StaggeredGridLayoutManager.this;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #21  <Field StaggeredGridLayoutManager g>
			super();
		//    3    5:aload_0         
		//    4    6:invokespecial   #24  <Method void Object()>
			a();
		//    5    9:aload_0         
		//    6   10:invokevirtual   #26  <Method void a()>
		//    7   13:return          
		}
	}

	class b
	{

		int a(int i1)
		{
			if(b != 0x80000000)
		//*   0    0:aload_0         
		//*   1    1:getfield        #31  <Field int b>
		//*   2    4:ldc1            #29  <Int 0x80000000>
		//*   3    6:icmpeq          14
				return b;
		//    4    9:aload_0         
		//    5   10:getfield        #31  <Field int b>
		//    6   13:ireturn         
			if(a.size() == 0)
		//*   7   14:aload_0         
		//*   8   15:getfield        #28  <Field ArrayList a>
		//*   9   18:invokevirtual   #43  <Method int ArrayList.size()>
		//*  10   21:ifne            26
			{
				return i1;
		//   11   24:iload_1         
		//   12   25:ireturn         
			} else
			{
				a();
		//   13   26:aload_0         
		//   14   27:invokevirtual   #45  <Method void a()>
				return b;
		//   15   30:aload_0         
		//   16   31:getfield        #31  <Field int b>
		//   17   34:ireturn         
			}
		}

		int a(int i1, int j1, boolean flag)
		{
			return a(i1, j1, false, false, flag);
		//    0    0:aload_0         
		//    1    1:iload_1         
		//    2    2:iload_2         
		//    3    3:iconst_0        
		//    4    4:iconst_0        
		//    5    5:iload_3         
		//    6    6:invokevirtual   #49  <Method int a(int, int, boolean, boolean, boolean)>
		//    7    9:ireturn         
		}

		int a(int i1, int j1, boolean flag, boolean flag1, boolean flag2)
		{
			int k1 = f.b.c();
		//    0    0:aload_0         
		//    1    1:getfield        #20  <Field StaggeredGridLayoutManager f>
		//    2    4:getfield        #52  <Field ah android.support.v7.widget.StaggeredGridLayoutManager.b>
		//    3    7:invokevirtual   #56  <Method int ah.c()>
		//    4   10:istore          9
			int l1 = f.b.d();
		//    5   12:aload_0         
		//    6   13:getfield        #20  <Field StaggeredGridLayoutManager f>
		//    7   16:getfield        #52  <Field ah android.support.v7.widget.StaggeredGridLayoutManager.b>
		//    8   19:invokevirtual   #58  <Method int ah.d()>
		//    9   22:istore          10
			byte byte0;
			if(j1 > i1)
		//*  10   24:iload_2         
		//*  11   25:iload_1         
		//*  12   26:icmple          35
				byte0 = 1;
		//   13   29:iconst_1        
		//   14   30:istore          6
			else
		//*  15   32:goto            38
				byte0 = -1;
		//   16   35:iconst_m1       
		//   17   36:istore          6
			for(; i1 != j1; i1 += ((int) (byte0)))
		//*  18   38:iload_1         
		//*  19   39:iload_2         
		//*  20   40:icmpeq          225
			{
				View view = (View)a.get(i1);
		//   21   43:aload_0         
		//   22   44:getfield        #28  <Field ArrayList a>
		//   23   47:iload_1         
		//   24   48:invokevirtual   #62  <Method Object ArrayList.get(int)>
		//   25   51:checkcast       #64  <Class View>
		//   26   54:astore          13
				int i2 = f.b.a(view);
		//   27   56:aload_0         
		//   28   57:getfield        #20  <Field StaggeredGridLayoutManager f>
		//   29   60:getfield        #52  <Field ah android.support.v7.widget.StaggeredGridLayoutManager.b>
		//   30   63:aload           13
		//   31   65:invokevirtual   #67  <Method int ah.a(View)>
		//   32   68:istore          11
				int j2 = f.b.b(view);
		//   33   70:aload_0         
		//   34   71:getfield        #20  <Field StaggeredGridLayoutManager f>
		//   35   74:getfield        #52  <Field ah android.support.v7.widget.StaggeredGridLayoutManager.b>
		//   36   77:aload           13
		//   37   79:invokevirtual   #69  <Method int android.support.v7.widget.ah.b(View)>
		//   38   82:istore          12
				boolean flag4 = false;
		//   39   84:iconst_0        
		//   40   85:istore          8
				boolean flag3;
				if(flag2 ? i2 <= l1 : i2 < l1)
		//*  41   87:iload           5
		//*  42   89:ifeq            111
		//*  43   92:iload           11
		//*  44   94:iload           10
		//*  45   96:icmpgt          105
					flag3 = true;
		//   46   99:iconst_1        
		//   47  100:istore          7
				else
		//*  48  102:goto            121
					flag3 = false;
		//   49  105:iconst_0        
		//   50  106:istore          7
		//   51  108:goto            121
		//   52  111:iload           11
		//   53  113:iload           10
		//   54  115:icmpge          105
		//*  55  118:goto            99
				if(flag2 ? j2 >= k1 : j2 > k1)
		//*  56  121:iload           5
		//*  57  123:ifeq            139
		//*  58  126:iload           12
		//*  59  128:iload           9
		//*  60  130:icmplt          149
					flag4 = true;
		//   61  133:iconst_1        
		//   62  134:istore          8
		//   63  136:goto            149
		//   64  139:iload           12
		//   65  141:iload           9
		//   66  143:icmple          149
		//*  67  146:goto            133
				if(flag3 && flag4 && (!flag || !flag1 ? flag1 || i2 < k1 || j2 > l1 : i2 >= k1 && j2 <= l1))
		//*  68  149:iload           7
		//*  69  151:ifeq            217
		//*  70  154:iload           8
		//*  71  156:ifeq            217
		//*  72  159:iload_3         
		//*  73  160:ifeq            192
		//*  74  163:iload           4
		//*  75  165:ifeq            192
		//*  76  168:iload           11
		//*  77  170:iload           9
		//*  78  172:icmplt          217
		//*  79  175:iload           12
		//*  80  177:iload           10
		//*  81  179:icmpgt          217
					return f.d(view);
		//   82  182:aload_0         
		//   83  183:getfield        #20  <Field StaggeredGridLayoutManager f>
		//   84  186:aload           13
		//   85  188:invokevirtual   #71  <Method int StaggeredGridLayoutManager.d(View)>
		//   86  191:ireturn         
		//   87  192:iload           4
		//   88  194:ifeq            200
		//   89  197:goto            182
		//   90  200:iload           11
		//   91  202:iload           9
		//   92  204:icmplt          182
		//   93  207:iload           12
		//   94  209:iload           10
		//   95  211:icmple          217
			}

		//   96  214:goto            182
		//   97  217:iload_1         
		//   98  218:iload           6
		//   99  220:iadd            
		//  100  221:istore_1        
		//* 101  222:goto            38
			return -1;
		//  102  225:iconst_m1       
		//  103  226:ireturn         
		}

		public View a(int i1, int j1)
		{
			View view2 = null;
		//    0    0:aconst_null     
		//    1    1:astore          5
			View view = null;
		//    2    3:aconst_null     
		//    3    4:astore          4
			if(j1 == -1)
		//*   4    6:iload_2         
		//*   5    7:iconst_m1       
		//*   6    8:icmpne          119
			{
				int k1 = a.size();
		//    7   11:aload_0         
		//    8   12:getfield        #28  <Field ArrayList a>
		//    9   15:invokevirtual   #43  <Method int ArrayList.size()>
		//   10   18:istore_3        
				j1 = 0;
		//   11   19:iconst_0        
		//   12   20:istore_2        
				do
				{
					view2 = view;
		//   13   21:aload           4
		//   14   23:astore          5
					if(j1 >= k1)
						break;
		//   15   25:iload_2         
		//   16   26:iload_3         
		//   17   27:icmpge          230
					View view3 = (View)a.get(j1);
		//   18   30:aload_0         
		//   19   31:getfield        #28  <Field ArrayList a>
		//   20   34:iload_2         
		//   21   35:invokevirtual   #62  <Method Object ArrayList.get(int)>
		//   22   38:checkcast       #64  <Class View>
		//   23   41:astore          6
					if(f.d)
		//*  24   43:aload_0         
		//*  25   44:getfield        #20  <Field StaggeredGridLayoutManager f>
		//*  26   47:getfield        #75  <Field boolean StaggeredGridLayoutManager.d>
		//*  27   50:ifeq            70
					{
						view2 = view;
		//   28   53:aload           4
		//   29   55:astore          5
						if(f.d(view3) <= i1)
							break;
		//   30   57:aload_0         
		//   31   58:getfield        #20  <Field StaggeredGridLayoutManager f>
		//   32   61:aload           6
		//   33   63:invokevirtual   #71  <Method int StaggeredGridLayoutManager.d(View)>
		//   34   66:iload_1         
		//   35   67:icmple          230
					}
					if(!f.d && f.d(view3) >= i1)
		//*  36   70:aload_0         
		//*  37   71:getfield        #20  <Field StaggeredGridLayoutManager f>
		//*  38   74:getfield        #75  <Field boolean StaggeredGridLayoutManager.d>
		//*  39   77:ifne            96
		//*  40   80:aload_0         
		//*  41   81:getfield        #20  <Field StaggeredGridLayoutManager f>
		//*  42   84:aload           6
		//*  43   86:invokevirtual   #71  <Method int StaggeredGridLayoutManager.d(View)>
		//*  44   89:iload_1         
		//*  45   90:icmplt          96
						return view;
		//   46   93:aload           4
		//   47   95:areturn         
					view2 = view;
		//   48   96:aload           4
		//   49   98:astore          5
					if(!view3.hasFocusable())
						break;
		//   50  100:aload           6
		//   51  102:invokevirtual   #79  <Method boolean View.hasFocusable()>
		//   52  105:ifeq            230
					j1++;
		//   53  108:iload_2         
		//   54  109:iconst_1        
		//   55  110:iadd            
		//   56  111:istore_2        
					view = view3;
		//   57  112:aload           6
		//   58  114:astore          4
				} while(true);
		//   59  116:goto            21
			} else
			{
				j1 = a.size() - 1;
		//   60  119:aload_0         
		//   61  120:getfield        #28  <Field ArrayList a>
		//   62  123:invokevirtual   #43  <Method int ArrayList.size()>
		//   63  126:iconst_1        
		//   64  127:isub            
		//   65  128:istore_2        
				View view1 = view2;
		//   66  129:aload           5
		//   67  131:astore          4
				do
				{
					view2 = view1;
		//   68  133:aload           4
		//   69  135:astore          5
					if(j1 < 0)
						break;
		//   70  137:iload_2         
		//   71  138:iflt            230
					View view4 = (View)a.get(j1);
		//   72  141:aload_0         
		//   73  142:getfield        #28  <Field ArrayList a>
		//   74  145:iload_2         
		//   75  146:invokevirtual   #62  <Method Object ArrayList.get(int)>
		//   76  149:checkcast       #64  <Class View>
		//   77  152:astore          6
					if(f.d)
		//*  78  154:aload_0         
		//*  79  155:getfield        #20  <Field StaggeredGridLayoutManager f>
		//*  80  158:getfield        #75  <Field boolean StaggeredGridLayoutManager.d>
		//*  81  161:ifeq            181
					{
						view2 = view1;
		//   82  164:aload           4
		//   83  166:astore          5
						if(f.d(view4) >= i1)
							break;
		//   84  168:aload_0         
		//   85  169:getfield        #20  <Field StaggeredGridLayoutManager f>
		//   86  172:aload           6
		//   87  174:invokevirtual   #71  <Method int StaggeredGridLayoutManager.d(View)>
		//   88  177:iload_1         
		//   89  178:icmpge          230
					}
					if(!f.d && f.d(view4) <= i1)
		//*  90  181:aload_0         
		//*  91  182:getfield        #20  <Field StaggeredGridLayoutManager f>
		//*  92  185:getfield        #75  <Field boolean StaggeredGridLayoutManager.d>
		//*  93  188:ifne            207
		//*  94  191:aload_0         
		//*  95  192:getfield        #20  <Field StaggeredGridLayoutManager f>
		//*  96  195:aload           6
		//*  97  197:invokevirtual   #71  <Method int StaggeredGridLayoutManager.d(View)>
		//*  98  200:iload_1         
		//*  99  201:icmpgt          207
						return view1;
		//  100  204:aload           4
		//  101  206:areturn         
					view2 = view1;
		//  102  207:aload           4
		//  103  209:astore          5
					if(!view4.hasFocusable())
						break;
		//  104  211:aload           6
		//  105  213:invokevirtual   #79  <Method boolean View.hasFocusable()>
		//  106  216:ifeq            230
					j1--;
		//  107  219:iload_2         
		//  108  220:iconst_1        
		//  109  221:isub            
		//  110  222:istore_2        
					view1 = view4;
		//  111  223:aload           6
		//  112  225:astore          4
				} while(true);
		//  113  227:goto            133
			}
			return view2;
		//  114  230:aload           5
		//  115  232:areturn         
		}

		void a()
		{
			View view = (View)a.get(0);
		//    0    0:aload_0         
		//    1    1:getfield        #28  <Field ArrayList a>
		//    2    4:iconst_0        
		//    3    5:invokevirtual   #62  <Method Object ArrayList.get(int)>
		//    4    8:checkcast       #64  <Class View>
		//    5   11:astore_1        
			LayoutParams layoutparams = c(view);
		//    6   12:aload_0         
		//    7   13:aload_1         
		//    8   14:invokevirtual   #82  <Method StaggeredGridLayoutManager$LayoutParams c(View)>
		//    9   17:astore_2        
			b = f.b.a(view);
		//   10   18:aload_0         
		//   11   19:aload_0         
		//   12   20:getfield        #20  <Field StaggeredGridLayoutManager f>
		//   13   23:getfield        #52  <Field ah android.support.v7.widget.StaggeredGridLayoutManager.b>
		//   14   26:aload_1         
		//   15   27:invokevirtual   #67  <Method int ah.a(View)>
		//   16   30:putfield        #31  <Field int b>
			if(layoutparams.b)
		//*  17   33:aload_2         
		//*  18   34:getfield        #86  <Field boolean android.support.v7.widget.StaggeredGridLayoutManager$LayoutParams.b>
		//*  19   37:ifeq            84
			{
				LazySpanLookup.FullSpanItem fullspanitem = f.h.f(layoutparams.f());
		//   20   40:aload_0         
		//   21   41:getfield        #20  <Field StaggeredGridLayoutManager f>
		//   22   44:getfield        #90  <Field StaggeredGridLayoutManager$LazySpanLookup StaggeredGridLayoutManager.h>
		//   23   47:aload_2         
		//   24   48:invokevirtual   #92  <Method int StaggeredGridLayoutManager$LayoutParams.f()>
		//   25   51:invokevirtual   #97  <Method StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem StaggeredGridLayoutManager$LazySpanLookup.f(int)>
		//   26   54:astore_1        
				if(fullspanitem != null && fullspanitem.b == -1)
		//*  27   55:aload_1         
		//*  28   56:ifnull          84
		//*  29   59:aload_1         
		//*  30   60:getfield        #100 <Field int android.support.v7.widget.StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem.b>
		//*  31   63:iconst_m1       
		//*  32   64:icmpne          84
					b = b - fullspanitem.a(e);
		//   33   67:aload_0         
		//   34   68:aload_0         
		//   35   69:getfield        #31  <Field int b>
		//   36   72:aload_1         
		//   37   73:aload_0         
		//   38   74:getfield        #37  <Field int e>
		//   39   77:invokevirtual   #102 <Method int StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem.a(int)>
		//   40   80:isub            
		//   41   81:putfield        #31  <Field int b>
			}
		//   42   84:return          
		}

		void a(View view)
		{
			LayoutParams layoutparams = c(view);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokevirtual   #82  <Method StaggeredGridLayoutManager$LayoutParams c(View)>
		//    3    5:astore_2        
			layoutparams.a = this;
		//    4    6:aload_2         
		//    5    7:aload_0         
		//    6    8:putfield        #106 <Field StaggeredGridLayoutManager$b StaggeredGridLayoutManager$LayoutParams.a>
			a.add(0, ((Object) (view)));
		//    7   11:aload_0         
		//    8   12:getfield        #28  <Field ArrayList a>
		//    9   15:iconst_0        
		//   10   16:aload_1         
		//   11   17:invokevirtual   #110 <Method void ArrayList.add(int, Object)>
			b = 0x80000000;
		//   12   20:aload_0         
		//   13   21:ldc1            #29  <Int 0x80000000>
		//   14   23:putfield        #31  <Field int b>
			if(a.size() == 1)
		//*  15   26:aload_0         
		//*  16   27:getfield        #28  <Field ArrayList a>
		//*  17   30:invokevirtual   #43  <Method int ArrayList.size()>
		//*  18   33:iconst_1        
		//*  19   34:icmpne          43
				c = 0x80000000;
		//   20   37:aload_0         
		//   21   38:ldc1            #29  <Int 0x80000000>
		//   22   40:putfield        #33  <Field int c>
			if(layoutparams.d() || layoutparams.e())
		//*  23   43:aload_2         
		//*  24   44:invokevirtual   #112 <Method boolean StaggeredGridLayoutManager$LayoutParams.d()>
		//*  25   47:ifne            57
		//*  26   50:aload_2         
		//*  27   51:invokevirtual   #114 <Method boolean StaggeredGridLayoutManager$LayoutParams.e()>
		//*  28   54:ifeq            77
				d = d + f.b.e(view);
		//   29   57:aload_0         
		//   30   58:aload_0         
		//   31   59:getfield        #35  <Field int d>
		//   32   62:aload_0         
		//   33   63:getfield        #20  <Field StaggeredGridLayoutManager f>
		//   34   66:getfield        #52  <Field ah android.support.v7.widget.StaggeredGridLayoutManager.b>
		//   35   69:aload_1         
		//   36   70:invokevirtual   #116 <Method int ah.e(View)>
		//   37   73:iadd            
		//   38   74:putfield        #35  <Field int d>
		//   39   77:return          
		}

		void a(boolean flag, int i1)
		{
			int j1;
			if(flag)
		//*   0    0:iload_1         
		//*   1    1:ifeq            14
				j1 = b(0x80000000);
		//    2    4:aload_0         
		//    3    5:ldc1            #29  <Int 0x80000000>
		//    4    7:invokevirtual   #119 <Method int b(int)>
		//    5   10:istore_3        
			else
		//*   6   11:goto            21
				j1 = a(0x80000000);
		//    7   14:aload_0         
		//    8   15:ldc1            #29  <Int 0x80000000>
		//    9   17:invokevirtual   #120 <Method int a(int)>
		//   10   20:istore_3        
			e();
		//   11   21:aload_0         
		//   12   22:invokevirtual   #122 <Method void e()>
			if(j1 == 0x80000000)
		//*  13   25:iload_3         
		//*  14   26:ldc1            #29  <Int 0x80000000>
		//*  15   28:icmpne          32
				return;
		//   16   31:return          
			if(flag && j1 < f.b.d() || !flag && j1 > f.b.c())
		//*  17   32:iload_1         
		//*  18   33:ifeq            50
		//*  19   36:iload_3         
		//*  20   37:aload_0         
		//*  21   38:getfield        #20  <Field StaggeredGridLayoutManager f>
		//*  22   41:getfield        #52  <Field ah android.support.v7.widget.StaggeredGridLayoutManager.b>
		//*  23   44:invokevirtual   #58  <Method int ah.d()>
		//*  24   47:icmplt          68
		//*  25   50:iload_1         
		//*  26   51:ifne            69
		//*  27   54:iload_3         
		//*  28   55:aload_0         
		//*  29   56:getfield        #20  <Field StaggeredGridLayoutManager f>
		//*  30   59:getfield        #52  <Field ah android.support.v7.widget.StaggeredGridLayoutManager.b>
		//*  31   62:invokevirtual   #56  <Method int ah.c()>
		//*  32   65:icmple          69
				return;
		//   33   68:return          
			int k1 = j1;
		//   34   69:iload_3         
		//   35   70:istore          4
			if(i1 != 0x80000000)
		//*  36   72:iload_2         
		//*  37   73:ldc1            #29  <Int 0x80000000>
		//*  38   75:icmpeq          83
				k1 = j1 + i1;
		//   39   78:iload_3         
		//   40   79:iload_2         
		//   41   80:iadd            
		//   42   81:istore          4
			c = k1;
		//   43   83:aload_0         
		//   44   84:iload           4
		//   45   86:putfield        #33  <Field int c>
			b = k1;
		//   46   89:aload_0         
		//   47   90:iload           4
		//   48   92:putfield        #31  <Field int b>
		//   49   95:return          
		}

		int b()
		{
			if(b != 0x80000000)
		//*   0    0:aload_0         
		//*   1    1:getfield        #31  <Field int b>
		//*   2    4:ldc1            #29  <Int 0x80000000>
		//*   3    6:icmpeq          14
			{
				return b;
		//    4    9:aload_0         
		//    5   10:getfield        #31  <Field int b>
		//    6   13:ireturn         
			} else
			{
				a();
		//    7   14:aload_0         
		//    8   15:invokevirtual   #45  <Method void a()>
				return b;
		//    9   18:aload_0         
		//   10   19:getfield        #31  <Field int b>
		//   11   22:ireturn         
			}
		}

		int b(int i1)
		{
			if(c != 0x80000000)
		//*   0    0:aload_0         
		//*   1    1:getfield        #33  <Field int c>
		//*   2    4:ldc1            #29  <Int 0x80000000>
		//*   3    6:icmpeq          14
				return c;
		//    4    9:aload_0         
		//    5   10:getfield        #33  <Field int c>
		//    6   13:ireturn         
			if(a.size() == 0)
		//*   7   14:aload_0         
		//*   8   15:getfield        #28  <Field ArrayList a>
		//*   9   18:invokevirtual   #43  <Method int ArrayList.size()>
		//*  10   21:ifne            26
			{
				return i1;
		//   11   24:iload_1         
		//   12   25:ireturn         
			} else
			{
				c();
		//   13   26:aload_0         
		//   14   27:invokevirtual   #124 <Method void c()>
				return c;
		//   15   30:aload_0         
		//   16   31:getfield        #33  <Field int c>
		//   17   34:ireturn         
			}
		}

		void b(View view)
		{
			LayoutParams layoutparams = c(view);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokevirtual   #82  <Method StaggeredGridLayoutManager$LayoutParams c(View)>
		//    3    5:astore_2        
			layoutparams.a = this;
		//    4    6:aload_2         
		//    5    7:aload_0         
		//    6    8:putfield        #106 <Field StaggeredGridLayoutManager$b StaggeredGridLayoutManager$LayoutParams.a>
			a.add(((Object) (view)));
		//    7   11:aload_0         
		//    8   12:getfield        #28  <Field ArrayList a>
		//    9   15:aload_1         
		//   10   16:invokevirtual   #127 <Method boolean ArrayList.add(Object)>
		//   11   19:pop             
			c = 0x80000000;
		//   12   20:aload_0         
		//   13   21:ldc1            #29  <Int 0x80000000>
		//   14   23:putfield        #33  <Field int c>
			if(a.size() == 1)
		//*  15   26:aload_0         
		//*  16   27:getfield        #28  <Field ArrayList a>
		//*  17   30:invokevirtual   #43  <Method int ArrayList.size()>
		//*  18   33:iconst_1        
		//*  19   34:icmpne          43
				b = 0x80000000;
		//   20   37:aload_0         
		//   21   38:ldc1            #29  <Int 0x80000000>
		//   22   40:putfield        #31  <Field int b>
			if(layoutparams.d() || layoutparams.e())
		//*  23   43:aload_2         
		//*  24   44:invokevirtual   #112 <Method boolean StaggeredGridLayoutManager$LayoutParams.d()>
		//*  25   47:ifne            57
		//*  26   50:aload_2         
		//*  27   51:invokevirtual   #114 <Method boolean StaggeredGridLayoutManager$LayoutParams.e()>
		//*  28   54:ifeq            77
				d = d + f.b.e(view);
		//   29   57:aload_0         
		//   30   58:aload_0         
		//   31   59:getfield        #35  <Field int d>
		//   32   62:aload_0         
		//   33   63:getfield        #20  <Field StaggeredGridLayoutManager f>
		//   34   66:getfield        #52  <Field ah android.support.v7.widget.StaggeredGridLayoutManager.b>
		//   35   69:aload_1         
		//   36   70:invokevirtual   #116 <Method int ah.e(View)>
		//   37   73:iadd            
		//   38   74:putfield        #35  <Field int d>
		//   39   77:return          
		}

		LayoutParams c(View view)
		{
			return (LayoutParams)view.getLayoutParams();
		//    0    0:aload_1         
		//    1    1:invokevirtual   #131 <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
		//    2    4:checkcast       #84  <Class StaggeredGridLayoutManager$LayoutParams>
		//    3    7:areturn         
		}

		void c()
		{
			View view = (View)a.get(a.size() - 1);
		//    0    0:aload_0         
		//    1    1:getfield        #28  <Field ArrayList a>
		//    2    4:aload_0         
		//    3    5:getfield        #28  <Field ArrayList a>
		//    4    8:invokevirtual   #43  <Method int ArrayList.size()>
		//    5   11:iconst_1        
		//    6   12:isub            
		//    7   13:invokevirtual   #62  <Method Object ArrayList.get(int)>
		//    8   16:checkcast       #64  <Class View>
		//    9   19:astore_1        
			LayoutParams layoutparams = c(view);
		//   10   20:aload_0         
		//   11   21:aload_1         
		//   12   22:invokevirtual   #82  <Method StaggeredGridLayoutManager$LayoutParams c(View)>
		//   13   25:astore_2        
			c = f.b.b(view);
		//   14   26:aload_0         
		//   15   27:aload_0         
		//   16   28:getfield        #20  <Field StaggeredGridLayoutManager f>
		//   17   31:getfield        #52  <Field ah android.support.v7.widget.StaggeredGridLayoutManager.b>
		//   18   34:aload_1         
		//   19   35:invokevirtual   #69  <Method int android.support.v7.widget.ah.b(View)>
		//   20   38:putfield        #33  <Field int c>
			if(layoutparams.b)
		//*  21   41:aload_2         
		//*  22   42:getfield        #86  <Field boolean android.support.v7.widget.StaggeredGridLayoutManager$LayoutParams.b>
		//*  23   45:ifeq            92
			{
				LazySpanLookup.FullSpanItem fullspanitem = f.h.f(layoutparams.f());
		//   24   48:aload_0         
		//   25   49:getfield        #20  <Field StaggeredGridLayoutManager f>
		//   26   52:getfield        #90  <Field StaggeredGridLayoutManager$LazySpanLookup StaggeredGridLayoutManager.h>
		//   27   55:aload_2         
		//   28   56:invokevirtual   #92  <Method int StaggeredGridLayoutManager$LayoutParams.f()>
		//   29   59:invokevirtual   #97  <Method StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem StaggeredGridLayoutManager$LazySpanLookup.f(int)>
		//   30   62:astore_1        
				if(fullspanitem != null && fullspanitem.b == 1)
		//*  31   63:aload_1         
		//*  32   64:ifnull          92
		//*  33   67:aload_1         
		//*  34   68:getfield        #100 <Field int android.support.v7.widget.StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem.b>
		//*  35   71:iconst_1        
		//*  36   72:icmpne          92
					c = c + fullspanitem.a(e);
		//   37   75:aload_0         
		//   38   76:aload_0         
		//   39   77:getfield        #33  <Field int c>
		//   40   80:aload_1         
		//   41   81:aload_0         
		//   42   82:getfield        #37  <Field int e>
		//   43   85:invokevirtual   #102 <Method int StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem.a(int)>
		//   44   88:iadd            
		//   45   89:putfield        #33  <Field int c>
			}
		//   46   92:return          
		}

		void c(int i1)
		{
			b = i1;
		//    0    0:aload_0         
		//    1    1:iload_1         
		//    2    2:putfield        #31  <Field int b>
			c = i1;
		//    3    5:aload_0         
		//    4    6:iload_1         
		//    5    7:putfield        #33  <Field int c>
		//    6   10:return          
		}

		int d()
		{
			if(c != 0x80000000)
		//*   0    0:aload_0         
		//*   1    1:getfield        #33  <Field int c>
		//*   2    4:ldc1            #29  <Int 0x80000000>
		//*   3    6:icmpeq          14
			{
				return c;
		//    4    9:aload_0         
		//    5   10:getfield        #33  <Field int c>
		//    6   13:ireturn         
			} else
			{
				c();
		//    7   14:aload_0         
		//    8   15:invokevirtual   #124 <Method void c()>
				return c;
		//    9   18:aload_0         
		//   10   19:getfield        #33  <Field int c>
		//   11   22:ireturn         
			}
		}

		void d(int i1)
		{
			if(b != 0x80000000)
		//*   0    0:aload_0         
		//*   1    1:getfield        #31  <Field int b>
		//*   2    4:ldc1            #29  <Int 0x80000000>
		//*   3    6:icmpeq          19
				b = b + i1;
		//    4    9:aload_0         
		//    5   10:aload_0         
		//    6   11:getfield        #31  <Field int b>
		//    7   14:iload_1         
		//    8   15:iadd            
		//    9   16:putfield        #31  <Field int b>
			if(c != 0x80000000)
		//*  10   19:aload_0         
		//*  11   20:getfield        #33  <Field int c>
		//*  12   23:ldc1            #29  <Int 0x80000000>
		//*  13   25:icmpeq          38
				c = c + i1;
		//   14   28:aload_0         
		//   15   29:aload_0         
		//   16   30:getfield        #33  <Field int c>
		//   17   33:iload_1         
		//   18   34:iadd            
		//   19   35:putfield        #33  <Field int c>
		//   20   38:return          
		}

		void e()
		{
			a.clear();
		//    0    0:aload_0         
		//    1    1:getfield        #28  <Field ArrayList a>
		//    2    4:invokevirtual   #135 <Method void ArrayList.clear()>
			f();
		//    3    7:aload_0         
		//    4    8:invokevirtual   #137 <Method void f()>
			d = 0;
		//    5   11:aload_0         
		//    6   12:iconst_0        
		//    7   13:putfield        #35  <Field int d>
		//    8   16:return          
		}

		void f()
		{
			b = 0x80000000;
		//    0    0:aload_0         
		//    1    1:ldc1            #29  <Int 0x80000000>
		//    2    3:putfield        #31  <Field int b>
			c = 0x80000000;
		//    3    6:aload_0         
		//    4    7:ldc1            #29  <Int 0x80000000>
		//    5    9:putfield        #33  <Field int c>
		//    6   12:return          
		}

		void g()
		{
			int i1 = a.size();
		//    0    0:aload_0         
		//    1    1:getfield        #28  <Field ArrayList a>
		//    2    4:invokevirtual   #43  <Method int ArrayList.size()>
		//    3    7:istore_1        
			View view = (View)a.remove(i1 - 1);
		//    4    8:aload_0         
		//    5    9:getfield        #28  <Field ArrayList a>
		//    6   12:iload_1         
		//    7   13:iconst_1        
		//    8   14:isub            
		//    9   15:invokevirtual   #141 <Method Object ArrayList.remove(int)>
		//   10   18:checkcast       #64  <Class View>
		//   11   21:astore_2        
			LayoutParams layoutparams = c(view);
		//   12   22:aload_0         
		//   13   23:aload_2         
		//   14   24:invokevirtual   #82  <Method StaggeredGridLayoutManager$LayoutParams c(View)>
		//   15   27:astore_3        
			layoutparams.a = null;
		//   16   28:aload_3         
		//   17   29:aconst_null     
		//   18   30:putfield        #106 <Field StaggeredGridLayoutManager$b StaggeredGridLayoutManager$LayoutParams.a>
			if(layoutparams.d() || layoutparams.e())
		//*  19   33:aload_3         
		//*  20   34:invokevirtual   #112 <Method boolean StaggeredGridLayoutManager$LayoutParams.d()>
		//*  21   37:ifne            47
		//*  22   40:aload_3         
		//*  23   41:invokevirtual   #114 <Method boolean StaggeredGridLayoutManager$LayoutParams.e()>
		//*  24   44:ifeq            67
				d = d - f.b.e(view);
		//   25   47:aload_0         
		//   26   48:aload_0         
		//   27   49:getfield        #35  <Field int d>
		//   28   52:aload_0         
		//   29   53:getfield        #20  <Field StaggeredGridLayoutManager f>
		//   30   56:getfield        #52  <Field ah android.support.v7.widget.StaggeredGridLayoutManager.b>
		//   31   59:aload_2         
		//   32   60:invokevirtual   #116 <Method int ah.e(View)>
		//   33   63:isub            
		//   34   64:putfield        #35  <Field int d>
			if(i1 == 1)
		//*  35   67:iload_1         
		//*  36   68:iconst_1        
		//*  37   69:icmpne          78
				b = 0x80000000;
		//   38   72:aload_0         
		//   39   73:ldc1            #29  <Int 0x80000000>
		//   40   75:putfield        #31  <Field int b>
			c = 0x80000000;
		//   41   78:aload_0         
		//   42   79:ldc1            #29  <Int 0x80000000>
		//   43   81:putfield        #33  <Field int c>
		//   44   84:return          
		}

		void h()
		{
			View view = (View)a.remove(0);
		//    0    0:aload_0         
		//    1    1:getfield        #28  <Field ArrayList a>
		//    2    4:iconst_0        
		//    3    5:invokevirtual   #141 <Method Object ArrayList.remove(int)>
		//    4    8:checkcast       #64  <Class View>
		//    5   11:astore_1        
			LayoutParams layoutparams = c(view);
		//    6   12:aload_0         
		//    7   13:aload_1         
		//    8   14:invokevirtual   #82  <Method StaggeredGridLayoutManager$LayoutParams c(View)>
		//    9   17:astore_2        
			layoutparams.a = null;
		//   10   18:aload_2         
		//   11   19:aconst_null     
		//   12   20:putfield        #106 <Field StaggeredGridLayoutManager$b StaggeredGridLayoutManager$LayoutParams.a>
			if(a.size() == 0)
		//*  13   23:aload_0         
		//*  14   24:getfield        #28  <Field ArrayList a>
		//*  15   27:invokevirtual   #43  <Method int ArrayList.size()>
		//*  16   30:ifne            39
				c = 0x80000000;
		//   17   33:aload_0         
		//   18   34:ldc1            #29  <Int 0x80000000>
		//   19   36:putfield        #33  <Field int c>
			if(layoutparams.d() || layoutparams.e())
		//*  20   39:aload_2         
		//*  21   40:invokevirtual   #112 <Method boolean StaggeredGridLayoutManager$LayoutParams.d()>
		//*  22   43:ifne            53
		//*  23   46:aload_2         
		//*  24   47:invokevirtual   #114 <Method boolean StaggeredGridLayoutManager$LayoutParams.e()>
		//*  25   50:ifeq            73
				d = d - f.b.e(view);
		//   26   53:aload_0         
		//   27   54:aload_0         
		//   28   55:getfield        #35  <Field int d>
		//   29   58:aload_0         
		//   30   59:getfield        #20  <Field StaggeredGridLayoutManager f>
		//   31   62:getfield        #52  <Field ah android.support.v7.widget.StaggeredGridLayoutManager.b>
		//   32   65:aload_1         
		//   33   66:invokevirtual   #116 <Method int ah.e(View)>
		//   34   69:isub            
		//   35   70:putfield        #35  <Field int d>
			b = 0x80000000;
		//   36   73:aload_0         
		//   37   74:ldc1            #29  <Int 0x80000000>
		//   38   76:putfield        #31  <Field int b>
		//   39   79:return          
		}

		public int i()
		{
			return d;
		//    0    0:aload_0         
		//    1    1:getfield        #35  <Field int d>
		//    2    4:ireturn         
		}

		public int j()
		{
			int i1;
			int j1;
			if(f.d)
		//*   0    0:aload_0         
		//*   1    1:getfield        #20  <Field StaggeredGridLayoutManager f>
		//*   2    4:getfield        #75  <Field boolean StaggeredGridLayoutManager.d>
		//*   3    7:ifeq            30
			{
				i1 = a.size() - 1;
		//    4   10:aload_0         
		//    5   11:getfield        #28  <Field ArrayList a>
		//    6   14:invokevirtual   #43  <Method int ArrayList.size()>
		//    7   17:iconst_1        
		//    8   18:isub            
		//    9   19:istore_1        
				j1 = -1;
		//   10   20:iconst_m1       
		//   11   21:istore_2        
			} else
		//*  12   22:aload_0         
		//*  13   23:iload_1         
		//*  14   24:iload_2         
		//*  15   25:iconst_1        
		//*  16   26:invokevirtual   #145 <Method int a(int, int, boolean)>
		//*  17   29:ireturn         
			{
				i1 = 0;
		//   18   30:iconst_0        
		//   19   31:istore_1        
				j1 = a.size();
		//   20   32:aload_0         
		//   21   33:getfield        #28  <Field ArrayList a>
		//   22   36:invokevirtual   #43  <Method int ArrayList.size()>
		//   23   39:istore_2        
			}
			return a(i1, j1, true);
		//*  24   40:goto            22
		}

		public int k()
		{
			int i1;
			int j1;
			if(f.d)
		//*   0    0:aload_0         
		//*   1    1:getfield        #20  <Field StaggeredGridLayoutManager f>
		//*   2    4:getfield        #75  <Field boolean StaggeredGridLayoutManager.d>
		//*   3    7:ifeq            28
			{
				i1 = 0;
		//    4   10:iconst_0        
		//    5   11:istore_1        
				j1 = a.size();
		//    6   12:aload_0         
		//    7   13:getfield        #28  <Field ArrayList a>
		//    8   16:invokevirtual   #43  <Method int ArrayList.size()>
		//    9   19:istore_2        
			} else
		//*  10   20:aload_0         
		//*  11   21:iload_1         
		//*  12   22:iload_2         
		//*  13   23:iconst_1        
		//*  14   24:invokevirtual   #145 <Method int a(int, int, boolean)>
		//*  15   27:ireturn         
			{
				i1 = a.size() - 1;
		//   16   28:aload_0         
		//   17   29:getfield        #28  <Field ArrayList a>
		//   18   32:invokevirtual   #43  <Method int ArrayList.size()>
		//   19   35:iconst_1        
		//   20   36:isub            
		//   21   37:istore_1        
				j1 = -1;
		//   22   38:iconst_m1       
		//   23   39:istore_2        
			}
			return a(i1, j1, true);
		//*  24   40:goto            20
		}

		ArrayList a;
		int b;
		int c;
		int d;
		final int e;
		final StaggeredGridLayoutManager f;

		b(int i1)
		{
			f = StaggeredGridLayoutManager.this;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #20  <Field StaggeredGridLayoutManager f>
			super();
		//    3    5:aload_0         
		//    4    6:invokespecial   #23  <Method void Object()>
			a = new ArrayList();
		//    5    9:aload_0         
		//    6   10:new             #25  <Class ArrayList>
		//    7   13:dup             
		//    8   14:invokespecial   #26  <Method void ArrayList()>
		//    9   17:putfield        #28  <Field ArrayList a>
			b = 0x80000000;
		//   10   20:aload_0         
		//   11   21:ldc1            #29  <Int 0x80000000>
		//   12   23:putfield        #31  <Field int b>
			c = 0x80000000;
		//   13   26:aload_0         
		//   14   27:ldc1            #29  <Int 0x80000000>
		//   15   29:putfield        #33  <Field int c>
			d = 0;
		//   16   32:aload_0         
		//   17   33:iconst_0        
		//   18   34:putfield        #35  <Field int d>
			e = i1;
		//   19   37:aload_0         
		//   20   38:iload_2         
		//   21   39:putfield        #37  <Field int e>
		//   22   42:return          
		}
	}


	public StaggeredGridLayoutManager(int i1, int j1)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #67  <Method void RecyclerView$h()>
		i = -1;
	//    2    4:aload_0         
	//    3    5:iconst_m1       
	//    4    6:putfield        #69  <Field int i>
		d = false;
	//    5    9:aload_0         
	//    6   10:iconst_0        
	//    7   11:putfield        #71  <Field boolean d>
		e = false;
	//    8   14:aload_0         
	//    9   15:iconst_0        
	//   10   16:putfield        #73  <Field boolean e>
		f = -1;
	//   11   19:aload_0         
	//   12   20:iconst_m1       
	//   13   21:putfield        #75  <Field int f>
		g = 0x80000000;
	//   14   24:aload_0         
	//   15   25:ldc1            #76  <Int 0x80000000>
	//   16   27:putfield        #78  <Field int g>
		h = new LazySpanLookup();
	//   17   30:aload_0         
	//   18   31:new             #11  <Class StaggeredGridLayoutManager$LazySpanLookup>
	//   19   34:dup             
	//   20   35:invokespecial   #79  <Method void StaggeredGridLayoutManager$LazySpanLookup()>
	//   21   38:putfield        #81  <Field StaggeredGridLayoutManager$LazySpanLookup h>
		n = 2;
	//   22   41:aload_0         
	//   23   42:iconst_2        
	//   24   43:putfield        #83  <Field int n>
		C = new Rect();
	//   25   46:aload_0         
	//   26   47:new             #85  <Class Rect>
	//   27   50:dup             
	//   28   51:invokespecial   #86  <Method void Rect()>
	//   29   54:putfield        #88  <Field Rect C>
		D = new a();
	//   30   57:aload_0         
	//   31   58:new             #24  <Class StaggeredGridLayoutManager$a>
	//   32   61:dup             
	//   33   62:aload_0         
	//   34   63:invokespecial   #91  <Method void StaggeredGridLayoutManager$a(StaggeredGridLayoutManager)>
	//   35   66:putfield        #93  <Field StaggeredGridLayoutManager$a D>
		E = false;
	//   36   69:aload_0         
	//   37   70:iconst_0        
	//   38   71:putfield        #95  <Field boolean E>
		boolean flag = true;
	//   39   74:iconst_1        
	//   40   75:istore_3        
		F = true;
	//   41   76:aload_0         
	//   42   77:iconst_1        
	//   43   78:putfield        #97  <Field boolean F>
		H = new Runnable() {

			public void run()
			{
				a.f();
			//    0    0:aload_0         
			//    1    1:getfield        #14  <Field StaggeredGridLayoutManager a>
			//    2    4:invokevirtual   #23  <Method boolean StaggeredGridLayoutManager.f()>
			//    3    7:pop             
			//    4    8:return          
			}

			final StaggeredGridLayoutManager a;

			
			{
				a = StaggeredGridLayoutManager.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #14  <Field StaggeredGridLayoutManager a>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #17  <Method void Object()>
			//    5    9:return          
			}
		}
;
	//   44   81:aload_0         
	//   45   82:new             #6   <Class StaggeredGridLayoutManager$1>
	//   46   85:dup             
	//   47   86:aload_0         
	//   48   87:invokespecial   #98  <Method void StaggeredGridLayoutManager$1(StaggeredGridLayoutManager)>
	//   49   90:putfield        #100 <Field Runnable H>
		j = j1;
	//   50   93:aload_0         
	//   51   94:iload_2         
	//   52   95:putfield        #102 <Field int j>
		a(i1);
	//   53   98:aload_0         
	//   54   99:iload_1         
	//   55  100:invokevirtual   #105 <Method void a(int)>
		if(n == 0)
	//*  56  103:aload_0         
	//*  57  104:getfield        #83  <Field int n>
	//*  58  107:ifeq            113
	//*  59  110:goto            115
			flag = false;
	//   60  113:iconst_0        
	//   61  114:istore_3        
		c(flag);
	//   62  115:aload_0         
	//   63  116:iload_3         
	//   64  117:invokevirtual   #108 <Method void c(boolean)>
		l = new ae();
	//   65  120:aload_0         
	//   66  121:new             #110 <Class ae>
	//   67  124:dup             
	//   68  125:invokespecial   #111 <Method void ae()>
	//   69  128:putfield        #113 <Field ae l>
		L();
	//   70  131:aload_0         
	//   71  132:invokespecial   #116 <Method void L()>
	//   72  135:return          
	}

	public StaggeredGridLayoutManager(Context context, AttributeSet attributeset, int i1, int j1)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #67  <Method void RecyclerView$h()>
		i = -1;
	//    2    4:aload_0         
	//    3    5:iconst_m1       
	//    4    6:putfield        #69  <Field int i>
		d = false;
	//    5    9:aload_0         
	//    6   10:iconst_0        
	//    7   11:putfield        #71  <Field boolean d>
		e = false;
	//    8   14:aload_0         
	//    9   15:iconst_0        
	//   10   16:putfield        #73  <Field boolean e>
		f = -1;
	//   11   19:aload_0         
	//   12   20:iconst_m1       
	//   13   21:putfield        #75  <Field int f>
		g = 0x80000000;
	//   14   24:aload_0         
	//   15   25:ldc1            #76  <Int 0x80000000>
	//   16   27:putfield        #78  <Field int g>
		h = new LazySpanLookup();
	//   17   30:aload_0         
	//   18   31:new             #11  <Class StaggeredGridLayoutManager$LazySpanLookup>
	//   19   34:dup             
	//   20   35:invokespecial   #79  <Method void StaggeredGridLayoutManager$LazySpanLookup()>
	//   21   38:putfield        #81  <Field StaggeredGridLayoutManager$LazySpanLookup h>
		n = 2;
	//   22   41:aload_0         
	//   23   42:iconst_2        
	//   24   43:putfield        #83  <Field int n>
		C = new Rect();
	//   25   46:aload_0         
	//   26   47:new             #85  <Class Rect>
	//   27   50:dup             
	//   28   51:invokespecial   #86  <Method void Rect()>
	//   29   54:putfield        #88  <Field Rect C>
		D = new a();
	//   30   57:aload_0         
	//   31   58:new             #24  <Class StaggeredGridLayoutManager$a>
	//   32   61:dup             
	//   33   62:aload_0         
	//   34   63:invokespecial   #91  <Method void StaggeredGridLayoutManager$a(StaggeredGridLayoutManager)>
	//   35   66:putfield        #93  <Field StaggeredGridLayoutManager$a D>
		E = false;
	//   36   69:aload_0         
	//   37   70:iconst_0        
	//   38   71:putfield        #95  <Field boolean E>
		boolean flag = true;
	//   39   74:iconst_1        
	//   40   75:istore          5
		F = true;
	//   41   77:aload_0         
	//   42   78:iconst_1        
	//   43   79:putfield        #97  <Field boolean F>
		H = new _cls1();
	//   44   82:aload_0         
	//   45   83:new             #6   <Class StaggeredGridLayoutManager$1>
	//   46   86:dup             
	//   47   87:aload_0         
	//   48   88:invokespecial   #98  <Method void StaggeredGridLayoutManager$1(StaggeredGridLayoutManager)>
	//   49   91:putfield        #100 <Field Runnable H>
		context = ((Context) (a(context, attributeset, i1, j1)));
	//   50   94:aload_1         
	//   51   95:aload_2         
	//   52   96:iload_3         
	//   53   97:iload           4
	//   54   99:invokestatic    #121 <Method RecyclerView$h$b a(Context, AttributeSet, int, int)>
	//   55  102:astore_1        
		b(((RecyclerView.h.b) (context)).a);
	//   56  103:aload_0         
	//   57  104:aload_1         
	//   58  105:getfield        #125 <Field int RecyclerView$h$b.a>
	//   59  108:invokevirtual   #127 <Method void b(int)>
		a(((RecyclerView.h.b) (context)).b);
	//   60  111:aload_0         
	//   61  112:aload_1         
	//   62  113:getfield        #129 <Field int android.support.v7.widget.RecyclerView$h$b.b>
	//   63  116:invokevirtual   #105 <Method void a(int)>
		a(((RecyclerView.h.b) (context)).c);
	//   64  119:aload_0         
	//   65  120:aload_1         
	//   66  121:getfield        #131 <Field boolean RecyclerView$h$b.c>
	//   67  124:invokevirtual   #133 <Method void a(boolean)>
		if(n == 0)
	//*  68  127:aload_0         
	//*  69  128:getfield        #83  <Field int n>
	//*  70  131:ifeq            137
	//*  71  134:goto            140
			flag = false;
	//   72  137:iconst_0        
	//   73  138:istore          5
		c(flag);
	//   74  140:aload_0         
	//   75  141:iload           5
	//   76  143:invokevirtual   #108 <Method void c(boolean)>
		l = new ae();
	//   77  146:aload_0         
	//   78  147:new             #110 <Class ae>
	//   79  150:dup             
	//   80  151:invokespecial   #111 <Method void ae()>
	//   81  154:putfield        #113 <Field ae l>
		L();
	//   82  157:aload_0         
	//   83  158:invokespecial   #116 <Method void L()>
	//   84  161:return          
	}

	private void L()
	{
		b = ah.a(((RecyclerView.h) (this)), j);
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:aload_0         
	//    3    3:getfield        #102 <Field int j>
	//    4    6:invokestatic    #138 <Method ah ah.a(RecyclerView$h, int)>
	//    5    9:putfield        #140 <Field ah b>
		c = ah.a(((RecyclerView.h) (this)), 1 - j);
	//    6   12:aload_0         
	//    7   13:aload_0         
	//    8   14:iconst_1        
	//    9   15:aload_0         
	//   10   16:getfield        #102 <Field int j>
	//   11   19:isub            
	//   12   20:invokestatic    #138 <Method ah ah.a(RecyclerView$h, int)>
	//   13   23:putfield        #142 <Field ah c>
	//   14   26:return          
	}

	private void M()
	{
		boolean flag;
		if(j != 1 && i())
	//*   0    0:aload_0         
	//*   1    1:getfield        #102 <Field int j>
	//*   2    4:iconst_1        
	//*   3    5:icmpeq          28
	//*   4    8:aload_0         
	//*   5    9:invokevirtual   #146 <Method boolean i()>
	//*   6   12:ifne            18
	//*   7   15:goto            28
			flag = d ^ true;
	//    8   18:aload_0         
	//    9   19:getfield        #71  <Field boolean d>
	//   10   22:iconst_1        
	//   11   23:ixor            
	//   12   24:istore_1        
		else
	//*  13   25:goto            33
			flag = d;
	//   14   28:aload_0         
	//   15   29:getfield        #71  <Field boolean d>
	//   16   32:istore_1        
		e = flag;
	//   17   33:aload_0         
	//   18   34:iload_1         
	//   19   35:putfield        #73  <Field boolean e>
	//   20   38:return          
	}

	private void N()
	{
		int i1;
		int i2;
		int j2;
		if(c.h() == 0x40000000)
	//*   0    0:aload_0         
	//*   1    1:getfield        #142 <Field ah c>
	//*   2    4:invokevirtual   #150 <Method int ah.h()>
	//*   3    7:ldc1            #151 <Int 0x40000000>
	//*   4    9:icmpne          13
			return;
	//    5   12:return          
		i2 = u();
	//    6   13:aload_0         
	//    7   14:invokevirtual   #154 <Method int u()>
	//    8   17:istore          7
		boolean flag = false;
	//    9   19:iconst_0        
	//   10   20:istore          5
		i1 = 0;
	//   11   22:iconst_0        
	//   12   23:istore          4
		float f1 = 0.0F;
	//   13   25:fconst_0        
	//   14   26:fstore_1        
		for(; i1 < i2; i1++)
	//*  15   27:iload           4
	//*  16   29:iload           7
	//*  17   31:icmpge          103
		{
			View view = h(i1);
	//   18   34:aload_0         
	//   19   35:iload           4
	//   20   37:invokevirtual   #157 <Method View h(int)>
	//   21   40:astore          9
			float f3 = c.e(view);
	//   22   42:aload_0         
	//   23   43:getfield        #142 <Field ah c>
	//   24   46:aload           9
	//   25   48:invokevirtual   #160 <Method int ah.e(View)>
	//   26   51:i2f             
	//   27   52:fstore_3        
			if(f3 < f1)
	//*  28   53:fload_3         
	//*  29   54:fload_1         
	//*  30   55:fcmpg           
	//*  31   56:ifge            62
				continue;
	//   32   59:goto            94
			float f2 = f3;
	//   33   62:fload_3         
	//   34   63:fstore_2        
			if(((LayoutParams)view.getLayoutParams()).a())
	//*  35   64:aload           9
	//*  36   66:invokevirtual   #166 <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//*  37   69:checkcast       #8   <Class StaggeredGridLayoutManager$LayoutParams>
	//*  38   72:invokevirtual   #168 <Method boolean StaggeredGridLayoutManager$LayoutParams.a()>
	//*  39   75:ifeq            88
				f2 = (f3 * 1.0F) / (float)i;
	//   40   78:fload_3         
	//   41   79:fconst_1        
	//   42   80:fmul            
	//   43   81:aload_0         
	//   44   82:getfield        #69  <Field int i>
	//   45   85:i2f             
	//   46   86:fdiv            
	//   47   87:fstore_2        
			f1 = Math.max(f1, f2);
	//   48   88:fload_1         
	//   49   89:fload_2         
	//   50   90:invokestatic    #174 <Method float Math.max(float, float)>
	//   51   93:fstore_1        
		}

	//   52   94:iload           4
	//   53   96:iconst_1        
	//   54   97:iadd            
	//   55   98:istore          4
	//*  56  100:goto            27
		j2 = k;
	//   57  103:aload_0         
	//   58  104:getfield        #176 <Field int k>
	//   59  107:istore          8
		int k1 = Math.round(f1 * (float)i);
	//   60  109:fload_1         
	//   61  110:aload_0         
	//   62  111:getfield        #69  <Field int i>
	//   63  114:i2f             
	//   64  115:fmul            
	//   65  116:invokestatic    #180 <Method int Math.round(float)>
	//   66  119:istore          6
		i1 = k1;
	//   67  121:iload           6
	//   68  123:istore          4
		if(c.h() == 0x80000000)
	//*  69  125:aload_0         
	//*  70  126:getfield        #142 <Field ah c>
	//*  71  129:invokevirtual   #150 <Method int ah.h()>
	//*  72  132:ldc1            #76  <Int 0x80000000>
	//*  73  134:icmpne          151
			i1 = Math.min(k1, c.f());
	//   74  137:iload           6
	//   75  139:aload_0         
	//   76  140:getfield        #142 <Field ah c>
	//   77  143:invokevirtual   #182 <Method int ah.f()>
	//   78  146:invokestatic    #186 <Method int Math.min(int, int)>
	//   79  149:istore          4
		e(i1);
	//   80  151:aload_0         
	//   81  152:iload           4
	//   82  154:invokevirtual   #188 <Method void e(int)>
		i1 = ((int) (flag));
	//   83  157:iload           5
	//   84  159:istore          4
		if(k == j2)
	//*  85  161:aload_0         
	//*  86  162:getfield        #176 <Field int k>
	//*  87  165:iload           8
	//*  88  167:icmpne          171
			return;
	//   89  170:return          
_L7:
		if(i1 >= i2) goto _L2; else goto _L1
	//   90  171:iload           4
	//   91  173:iload           7
	//   92  175:icmpge          337
_L1:
		View view1;
		LayoutParams layoutparams;
		view1 = h(i1);
	//   93  178:aload_0         
	//   94  179:iload           4
	//   95  181:invokevirtual   #157 <Method View h(int)>
	//   96  184:astore          9
		layoutparams = (LayoutParams)view1.getLayoutParams();
	//   97  186:aload           9
	//   98  188:invokevirtual   #166 <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//   99  191:checkcast       #8   <Class StaggeredGridLayoutManager$LayoutParams>
	//  100  194:astore          10
		if(layoutparams.b)
	//* 101  196:aload           10
	//* 102  198:getfield        #190 <Field boolean android.support.v7.widget.StaggeredGridLayoutManager$LayoutParams.b>
	//* 103  201:ifeq            207
			continue; /* Loop/switch isn't completed */
	//  104  204:goto            328
		if(!i() || j != 1) goto _L4; else goto _L3
	//  105  207:aload_0         
	//  106  208:invokevirtual   #146 <Method boolean i()>
	//  107  211:ifeq            279
	//  108  214:aload_0         
	//  109  215:getfield        #102 <Field int j>
	//  110  218:iconst_1        
	//  111  219:icmpne          279
_L3:
		int j1;
		int l1;
		l1 = -(i - 1 - layoutparams.a.e) * k;
	//  112  222:aload_0         
	//  113  223:getfield        #69  <Field int i>
	//  114  226:iconst_1        
	//  115  227:isub            
	//  116  228:aload           10
	//  117  230:getfield        #193 <Field StaggeredGridLayoutManager$b StaggeredGridLayoutManager$LayoutParams.a>
	//  118  233:getfield        #195 <Field int StaggeredGridLayoutManager$b.e>
	//  119  236:isub            
	//  120  237:ineg            
	//  121  238:aload_0         
	//  122  239:getfield        #176 <Field int k>
	//  123  242:imul            
	//  124  243:istore          6
		j1 = -(i - 1 - layoutparams.a.e) * j2;
	//  125  245:aload_0         
	//  126  246:getfield        #69  <Field int i>
	//  127  249:iconst_1        
	//  128  250:isub            
	//  129  251:aload           10
	//  130  253:getfield        #193 <Field StaggeredGridLayoutManager$b StaggeredGridLayoutManager$LayoutParams.a>
	//  131  256:getfield        #195 <Field int StaggeredGridLayoutManager$b.e>
	//  132  259:isub            
	//  133  260:ineg            
	//  134  261:iload           8
	//  135  263:imul            
	//  136  264:istore          5
_L5:
		view1.offsetLeftAndRight(l1 - j1);
	//  137  266:aload           9
	//  138  268:iload           6
	//  139  270:iload           5
	//  140  272:isub            
	//  141  273:invokevirtual   #198 <Method void View.offsetLeftAndRight(int)>
		continue; /* Loop/switch isn't completed */
	//  142  276:goto            328
_L4:
		l1 = layoutparams.a.e * k;
	//  143  279:aload           10
	//  144  281:getfield        #193 <Field StaggeredGridLayoutManager$b StaggeredGridLayoutManager$LayoutParams.a>
	//  145  284:getfield        #195 <Field int StaggeredGridLayoutManager$b.e>
	//  146  287:aload_0         
	//  147  288:getfield        #176 <Field int k>
	//  148  291:imul            
	//  149  292:istore          6
		j1 = layoutparams.a.e * j2;
	//  150  294:aload           10
	//  151  296:getfield        #193 <Field StaggeredGridLayoutManager$b StaggeredGridLayoutManager$LayoutParams.a>
	//  152  299:getfield        #195 <Field int StaggeredGridLayoutManager$b.e>
	//  153  302:iload           8
	//  154  304:imul            
	//  155  305:istore          5
		if(j != 1) goto _L6; else goto _L5
	//  156  307:aload_0         
	//  157  308:getfield        #102 <Field int j>
	//  158  311:iconst_1        
	//  159  312:icmpne          318
	//* 160  315:goto            266
_L6:
		view1.offsetTopAndBottom(l1 - j1);
	//  161  318:aload           9
	//  162  320:iload           6
	//  163  322:iload           5
	//  164  324:isub            
	//  165  325:invokevirtual   #201 <Method void View.offsetTopAndBottom(int)>
		i1++;
	//  166  328:iload           4
	//  167  330:iconst_1        
	//  168  331:iadd            
	//  169  332:istore          4
		  goto _L7
	//* 170  334:goto            171
_L2:
	//  171  337:return          
	}

	private int a(RecyclerView.n n1, ae ae1, RecyclerView.r r1)
	{
		int j1;
		int l2;
		int i3;
		m.set(0, i, true);
	//    0    0:aload_0         
	//    1    1:getfield        #204 <Field BitSet m>
	//    2    4:iconst_0        
	//    3    5:aload_0         
	//    4    6:getfield        #69  <Field int i>
	//    5    9:iconst_1        
	//    6   10:invokevirtual   #210 <Method void BitSet.set(int, int, boolean)>
		if(l.i)
	//*   7   13:aload_0         
	//*   8   14:getfield        #113 <Field ae l>
	//*   9   17:getfield        #212 <Field boolean ae.i>
	//*  10   20:ifeq            45
		{
			if(ae1.e == 1)
	//*  11   23:aload_2         
	//*  12   24:getfield        #213 <Field int ae.e>
	//*  13   27:iconst_1        
	//*  14   28:icmpne          38
				l2 = 0x7fffffff;
	//   15   31:ldc1            #214 <Int 0x7fffffff>
	//   16   33:istore          8
			else
	//*  17   35:goto            85
				l2 = 0x80000000;
	//   18   38:ldc1            #76  <Int 0x80000000>
	//   19   40:istore          8
		} else
	//*  20   42:goto            85
		{
			int i1;
			if(ae1.e == 1)
	//*  21   45:aload_2         
	//*  22   46:getfield        #213 <Field int ae.e>
	//*  23   49:iconst_1        
	//*  24   50:icmpne          71
				i1 = ae1.g + ae1.b;
	//   25   53:aload_2         
	//   26   54:getfield        #215 <Field int ae.g>
	//   27   57:aload_2         
	//   28   58:getfield        #216 <Field int android.support.v7.widget.ae.b>
	//   29   61:iadd            
	//   30   62:istore          4
			else
	//*  31   64:iload           4
	//*  32   66:istore          8
	//*  33   68:goto            85
				i1 = ae1.f - ae1.b;
	//   34   71:aload_2         
	//   35   72:getfield        #217 <Field int ae.f>
	//   36   75:aload_2         
	//   37   76:getfield        #216 <Field int android.support.v7.widget.ae.b>
	//   38   79:isub            
	//   39   80:istore          4
			l2 = i1;
		}
	//*  40   82:goto            64
		a(ae1.e, l2);
	//   41   85:aload_0         
	//   42   86:aload_2         
	//   43   87:getfield        #213 <Field int ae.e>
	//   44   90:iload           8
	//   45   92:invokespecial   #219 <Method void a(int, int)>
		if(e)
	//*  46   95:aload_0         
	//*  47   96:getfield        #73  <Field boolean e>
	//*  48   99:ifeq            114
			i3 = b.d();
	//   49  102:aload_0         
	//   50  103:getfield        #140 <Field ah b>
	//   51  106:invokevirtual   #221 <Method int ah.d()>
	//   52  109:istore          9
		else
	//*  53  111:goto            126
			i3 = b.c();
	//   54  114:aload_0         
	//   55  115:getfield        #140 <Field ah b>
	//   56  118:invokevirtual   #223 <Method int ah.c()>
	//   57  121:istore          9
	//*  58  123:goto            111
		j1 = 0;
	//   59  126:iconst_0        
	//   60  127:istore          4
_L7:
		if(!ae1.a(r1) || !l.i && m.isEmpty()) goto _L2; else goto _L1
	//   61  129:aload_2         
	//   62  130:aload_3         
	//   63  131:invokevirtual   #226 <Method boolean ae.a(RecyclerView$r)>
	//   64  134:ifeq            909
	//   65  137:aload_0         
	//   66  138:getfield        #113 <Field ae l>
	//   67  141:getfield        #212 <Field boolean ae.i>
	//   68  144:ifne            157
	//   69  147:aload_0         
	//   70  148:getfield        #204 <Field BitSet m>
	//   71  151:invokevirtual   #229 <Method boolean BitSet.isEmpty()>
	//   72  154:ifne            909
_L1:
		int k1;
		boolean flag;
		int j3;
		b b1;
		View view;
		LayoutParams layoutparams;
		view = ae1.a(n1);
	//   73  157:aload_2         
	//   74  158:aload_1         
	//   75  159:invokevirtual   #232 <Method View ae.a(RecyclerView$n)>
	//   76  162:astore          14
		layoutparams = (LayoutParams)view.getLayoutParams();
	//   77  164:aload           14
	//   78  166:invokevirtual   #166 <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//   79  169:checkcast       #8   <Class StaggeredGridLayoutManager$LayoutParams>
	//   80  172:astore          15
		j3 = layoutparams.f();
	//   81  174:aload           15
	//   82  176:invokevirtual   #233 <Method int StaggeredGridLayoutManager$LayoutParams.f()>
	//   83  179:istore          10
		j1 = h.c(j3);
	//   84  181:aload_0         
	//   85  182:getfield        #81  <Field StaggeredGridLayoutManager$LazySpanLookup h>
	//   86  185:iload           10
	//   87  187:invokevirtual   #236 <Method int StaggeredGridLayoutManager$LazySpanLookup.c(int)>
	//   88  190:istore          4
		if(j1 == -1)
	//*  89  192:iload           4
	//*  90  194:iconst_m1       
	//*  91  195:icmpne          204
			flag = true;
	//   92  198:iconst_1        
	//   93  199:istore          6
		else
	//*  94  201:goto            207
			flag = false;
	//   95  204:iconst_0        
	//   96  205:istore          6
		if(flag)
	//*  97  207:iload           6
	//*  98  209:ifeq            252
		{
			if(layoutparams.b)
	//*  99  212:aload           15
	//* 100  214:getfield        #190 <Field boolean android.support.v7.widget.StaggeredGridLayoutManager$LayoutParams.b>
	//* 101  217:ifeq            231
				b1 = a[0];
	//  102  220:aload_0         
	//  103  221:getfield        #238 <Field StaggeredGridLayoutManager$b[] a>
	//  104  224:iconst_0        
	//  105  225:aaload          
	//  106  226:astore          13
			else
	//* 107  228:goto            238
				b1 = a(ae1);
	//  108  231:aload_0         
	//  109  232:aload_2         
	//  110  233:invokespecial   #241 <Method StaggeredGridLayoutManager$b a(ae)>
	//  111  236:astore          13
			h.a(j3, b1);
	//  112  238:aload_0         
	//  113  239:getfield        #81  <Field StaggeredGridLayoutManager$LazySpanLookup h>
	//  114  242:iload           10
	//  115  244:aload           13
	//  116  246:invokevirtual   #244 <Method void StaggeredGridLayoutManager$LazySpanLookup.a(int, StaggeredGridLayoutManager$b)>
		} else
	//* 117  249:goto            261
		{
			b1 = a[j1];
	//  118  252:aload_0         
	//  119  253:getfield        #238 <Field StaggeredGridLayoutManager$b[] a>
	//  120  256:iload           4
	//  121  258:aaload          
	//  122  259:astore          13
		}
		layoutparams.a = b1;
	//  123  261:aload           15
	//  124  263:aload           13
	//  125  265:putfield        #193 <Field StaggeredGridLayoutManager$b StaggeredGridLayoutManager$LayoutParams.a>
		if(ae1.e == 1)
	//* 126  268:aload_2         
	//* 127  269:getfield        #213 <Field int ae.e>
	//* 128  272:iconst_1        
	//* 129  273:icmpne          285
			b(view);
	//  130  276:aload_0         
	//  131  277:aload           14
	//  132  279:invokevirtual   #247 <Method void b(View)>
		else
	//* 133  282:goto            292
			b(view, 0);
	//  134  285:aload_0         
	//  135  286:aload           14
	//  136  288:iconst_0        
	//  137  289:invokevirtual   #250 <Method void b(View, int)>
		a(view, layoutparams, false);
	//  138  292:aload_0         
	//  139  293:aload           14
	//  140  295:aload           15
	//  141  297:iconst_0        
	//  142  298:invokespecial   #253 <Method void a(View, StaggeredGridLayoutManager$LayoutParams, boolean)>
		if(ae1.e == 1)
	//* 143  301:aload_2         
	//* 144  302:getfield        #213 <Field int ae.e>
	//* 145  305:iconst_1        
	//* 146  306:icmpne          409
		{
			if(layoutparams.b)
	//* 147  309:aload           15
	//* 148  311:getfield        #190 <Field boolean android.support.v7.widget.StaggeredGridLayoutManager$LayoutParams.b>
	//* 149  314:ifeq            328
				j1 = q(i3);
	//  150  317:aload_0         
	//  151  318:iload           9
	//  152  320:invokespecial   #256 <Method int q(int)>
	//  153  323:istore          4
			else
	//* 154  325:goto            337
				j1 = b1.b(i3);
	//  155  328:aload           13
	//  156  330:iload           9
	//  157  332:invokevirtual   #258 <Method int android.support.v7.widget.StaggeredGridLayoutManager$b.b(int)>
	//  158  335:istore          4
			k1 = b.e(view);
	//  159  337:aload_0         
	//  160  338:getfield        #140 <Field ah b>
	//  161  341:aload           14
	//  162  343:invokevirtual   #160 <Method int ah.e(View)>
	//  163  346:istore          5
			if(flag && layoutparams.b)
	//* 164  348:iload           6
	//* 165  350:ifeq            391
	//* 166  353:aload           15
	//* 167  355:getfield        #190 <Field boolean android.support.v7.widget.StaggeredGridLayoutManager$LayoutParams.b>
	//* 168  358:ifeq            391
			{
				LazySpanLookup.FullSpanItem fullspanitem = m(j1);
	//  169  361:aload_0         
	//  170  362:iload           4
	//  171  364:invokespecial   #261 <Method StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem m(int)>
	//  172  367:astore          16
				fullspanitem.b = -1;
	//  173  369:aload           16
	//  174  371:iconst_m1       
	//  175  372:putfield        #262 <Field int android.support.v7.widget.StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem.b>
				fullspanitem.a = j3;
	//  176  375:aload           16
	//  177  377:iload           10
	//  178  379:putfield        #263 <Field int StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem.a>
				h.a(fullspanitem);
	//  179  382:aload_0         
	//  180  383:getfield        #81  <Field StaggeredGridLayoutManager$LazySpanLookup h>
	//  181  386:aload           16
	//  182  388:invokevirtual   #266 <Method void StaggeredGridLayoutManager$LazySpanLookup.a(StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem)>
			}
			int j2 = k1 + j1;
	//  183  391:iload           5
	//  184  393:iload           4
	//  185  395:iadd            
	//  186  396:istore          7
			k1 = j1;
	//  187  398:iload           4
	//  188  400:istore          5
			j1 = j2;
	//  189  402:iload           7
	//  190  404:istore          4
		} else
	//* 191  406:goto            494
		{
			if(layoutparams.b)
	//* 192  409:aload           15
	//* 193  411:getfield        #190 <Field boolean android.support.v7.widget.StaggeredGridLayoutManager$LayoutParams.b>
	//* 194  414:ifeq            428
				j1 = p(i3);
	//  195  417:aload_0         
	//  196  418:iload           9
	//  197  420:invokespecial   #269 <Method int p(int)>
	//  198  423:istore          4
			else
	//* 199  425:goto            437
				j1 = b1.a(i3);
	//  200  428:aload           13
	//  201  430:iload           9
	//  202  432:invokevirtual   #271 <Method int StaggeredGridLayoutManager$b.a(int)>
	//  203  435:istore          4
			k1 = j1 - b.e(view);
	//  204  437:iload           4
	//  205  439:aload_0         
	//  206  440:getfield        #140 <Field ah b>
	//  207  443:aload           14
	//  208  445:invokevirtual   #160 <Method int ah.e(View)>
	//  209  448:isub            
	//  210  449:istore          5
			if(flag && layoutparams.b)
	//* 211  451:iload           6
	//* 212  453:ifeq            494
	//* 213  456:aload           15
	//* 214  458:getfield        #190 <Field boolean android.support.v7.widget.StaggeredGridLayoutManager$LayoutParams.b>
	//* 215  461:ifeq            494
			{
				LazySpanLookup.FullSpanItem fullspanitem1 = n(j1);
	//  216  464:aload_0         
	//  217  465:iload           4
	//  218  467:invokespecial   #273 <Method StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem n(int)>
	//  219  470:astore          16
				fullspanitem1.b = 1;
	//  220  472:aload           16
	//  221  474:iconst_1        
	//  222  475:putfield        #262 <Field int android.support.v7.widget.StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem.b>
				fullspanitem1.a = j3;
	//  223  478:aload           16
	//  224  480:iload           10
	//  225  482:putfield        #263 <Field int StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem.a>
				h.a(fullspanitem1);
	//  226  485:aload_0         
	//  227  486:getfield        #81  <Field StaggeredGridLayoutManager$LazySpanLookup h>
	//  228  489:aload           16
	//  229  491:invokevirtual   #266 <Method void StaggeredGridLayoutManager$LazySpanLookup.a(StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem)>
			}
		}
		if(!layoutparams.b || ae1.d != -1) goto _L4; else goto _L3
	//  230  494:aload           15
	//  231  496:getfield        #190 <Field boolean android.support.v7.widget.StaggeredGridLayoutManager$LayoutParams.b>
	//  232  499:ifeq            581
	//  233  502:aload_2         
	//  234  503:getfield        #275 <Field int ae.d>
	//  235  506:iconst_m1       
	//  236  507:icmpne          581
_L3:
		if(!flag) goto _L6; else goto _L5
	//  237  510:iload           6
	//  238  512:ifeq            523
_L5:
		E = true;
	//  239  515:aload_0         
	//  240  516:iconst_1        
	//  241  517:putfield        #95  <Field boolean E>
		break; /* Loop/switch isn't completed */
	//  242  520:goto            581
_L6:
		boolean flag1;
		if(ae1.e == 1)
	//* 243  523:aload_2         
	//* 244  524:getfield        #213 <Field int ae.e>
	//* 245  527:iconst_1        
	//* 246  528:icmpne          540
			flag1 = l();
	//  247  531:aload_0         
	//  248  532:invokevirtual   #277 <Method boolean l()>
	//  249  535:istore          12
		else
	//* 250  537:goto            549
			flag1 = m();
	//  251  540:aload_0         
	//  252  541:invokevirtual   #279 <Method boolean m()>
	//  253  544:istore          12
	//* 254  546:goto            537
		if(!(flag1 ^ true))
			break; /* Loop/switch isn't completed */
	//  255  549:iload           12
	//  256  551:iconst_1        
	//  257  552:ixor            
	//  258  553:ifeq            581
		LazySpanLookup.FullSpanItem fullspanitem2 = h.f(j3);
	//  259  556:aload_0         
	//  260  557:getfield        #81  <Field StaggeredGridLayoutManager$LazySpanLookup h>
	//  261  560:iload           10
	//  262  562:invokevirtual   #281 <Method StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem StaggeredGridLayoutManager$LazySpanLookup.f(int)>
	//  263  565:astore          16
		if(fullspanitem2 != null)
	//* 264  567:aload           16
	//* 265  569:ifnull          515
			fullspanitem2.d = true;
	//  266  572:aload           16
	//  267  574:iconst_1        
	//  268  575:putfield        #282 <Field boolean StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem.d>
		if(true) goto _L5; else goto _L4
	//  269  578:goto            515
_L4:
		a(view, layoutparams, ae1);
	//  270  581:aload_0         
	//  271  582:aload           14
	//  272  584:aload           15
	//  273  586:aload_2         
	//  274  587:invokespecial   #285 <Method void a(View, StaggeredGridLayoutManager$LayoutParams, ae)>
		int i2;
		int k2;
		if(i() && j == 1)
	//* 275  590:aload_0         
	//* 276  591:invokevirtual   #146 <Method boolean i()>
	//* 277  594:ifeq            677
	//* 278  597:aload_0         
	//* 279  598:getfield        #102 <Field int j>
	//* 280  601:iconst_1        
	//* 281  602:icmpne          677
		{
			if(layoutparams.b)
	//* 282  605:aload           15
	//* 283  607:getfield        #190 <Field boolean android.support.v7.widget.StaggeredGridLayoutManager$LayoutParams.b>
	//* 284  610:ifeq            625
				i2 = c.d();
	//  285  613:aload_0         
	//  286  614:getfield        #142 <Field ah c>
	//  287  617:invokevirtual   #221 <Method int ah.d()>
	//  288  620:istore          6
			else
	//* 289  622:goto            652
				i2 = c.d() - (i - 1 - b1.e) * k;
	//  290  625:aload_0         
	//  291  626:getfield        #142 <Field ah c>
	//  292  629:invokevirtual   #221 <Method int ah.d()>
	//  293  632:aload_0         
	//  294  633:getfield        #69  <Field int i>
	//  295  636:iconst_1        
	//  296  637:isub            
	//  297  638:aload           13
	//  298  640:getfield        #195 <Field int StaggeredGridLayoutManager$b.e>
	//  299  643:isub            
	//  300  644:aload_0         
	//  301  645:getfield        #176 <Field int k>
	//  302  648:imul            
	//  303  649:isub            
	//  304  650:istore          6
			int k3 = c.e(view);
	//  305  652:aload_0         
	//  306  653:getfield        #142 <Field ah c>
	//  307  656:aload           14
	//  308  658:invokevirtual   #160 <Method int ah.e(View)>
	//  309  661:istore          10
			k2 = i2;
	//  310  663:iload           6
	//  311  665:istore          7
			i2 -= k3;
	//  312  667:iload           6
	//  313  669:iload           10
	//  314  671:isub            
	//  315  672:istore          6
		} else
	//* 316  674:goto            743
		{
			if(layoutparams.b)
	//* 317  677:aload           15
	//* 318  679:getfield        #190 <Field boolean android.support.v7.widget.StaggeredGridLayoutManager$LayoutParams.b>
	//* 319  682:ifeq            697
				i2 = c.c();
	//  320  685:aload_0         
	//  321  686:getfield        #142 <Field ah c>
	//  322  689:invokevirtual   #223 <Method int ah.c()>
	//  323  692:istore          6
			else
	//* 324  694:goto            717
				i2 = b1.e * k + c.c();
	//  325  697:aload           13
	//  326  699:getfield        #195 <Field int StaggeredGridLayoutManager$b.e>
	//  327  702:aload_0         
	//  328  703:getfield        #176 <Field int k>
	//  329  706:imul            
	//  330  707:aload_0         
	//  331  708:getfield        #142 <Field ah c>
	//  332  711:invokevirtual   #223 <Method int ah.c()>
	//  333  714:iadd            
	//  334  715:istore          6
			k2 = c.e(view);
	//  335  717:aload_0         
	//  336  718:getfield        #142 <Field ah c>
	//  337  721:aload           14
	//  338  723:invokevirtual   #160 <Method int ah.e(View)>
	//  339  726:istore          7
			int l3 = i2;
	//  340  728:iload           6
	//  341  730:istore          10
			k2 += i2;
	//  342  732:iload           7
	//  343  734:iload           6
	//  344  736:iadd            
	//  345  737:istore          7
			i2 = l3;
	//  346  739:iload           10
	//  347  741:istore          6
		}
		int i4;
		if(j == 1)
	//* 348  743:aload_0         
	//* 349  744:getfield        #102 <Field int j>
	//* 350  747:iconst_1        
	//* 351  748:icmpne          776
		{
			i4 = j1;
	//  352  751:iload           4
	//  353  753:istore          10
			j1 = i2;
	//  354  755:iload           6
	//  355  757:istore          4
		} else
	//* 356  759:aload_0         
	//* 357  760:aload           14
	//* 358  762:iload           4
	//* 359  764:iload           5
	//* 360  766:iload           7
	//* 361  768:iload           10
	//* 362  770:invokevirtual   #288 <Method void a(View, int, int, int, int)>
	//* 363  773:goto            803
		{
			i4 = j1;
	//  364  776:iload           4
	//  365  778:istore          10
			int j4 = k2;
	//  366  780:iload           7
	//  367  782:istore          11
			j1 = k1;
	//  368  784:iload           5
	//  369  786:istore          4
			k1 = i2;
	//  370  788:iload           6
	//  371  790:istore          5
			k2 = i4;
	//  372  792:iload           10
	//  373  794:istore          7
			i4 = j4;
	//  374  796:iload           11
	//  375  798:istore          10
		}
		a(view, j1, k1, k2, i4);
	//* 376  800:goto            759
		if(layoutparams.b)
	//* 377  803:aload           15
	//* 378  805:getfield        #190 <Field boolean android.support.v7.widget.StaggeredGridLayoutManager$LayoutParams.b>
	//* 379  808:ifeq            827
			a(l.e, l2);
	//  380  811:aload_0         
	//  381  812:aload_0         
	//  382  813:getfield        #113 <Field ae l>
	//  383  816:getfield        #213 <Field int ae.e>
	//  384  819:iload           8
	//  385  821:invokespecial   #219 <Method void a(int, int)>
		else
	//* 386  824:goto            842
			a(b1, l.e, l2);
	//  387  827:aload_0         
	//  388  828:aload           13
	//  389  830:aload_0         
	//  390  831:getfield        #113 <Field ae l>
	//  391  834:getfield        #213 <Field int ae.e>
	//  392  837:iload           8
	//  393  839:invokespecial   #291 <Method void a(StaggeredGridLayoutManager$b, int, int)>
		a(n1, l);
	//  394  842:aload_0         
	//  395  843:aload_1         
	//  396  844:aload_0         
	//  397  845:getfield        #113 <Field ae l>
	//  398  848:invokespecial   #294 <Method void a(RecyclerView$n, ae)>
		if(!l.h || !view.hasFocusable())
			continue; /* Loop/switch isn't completed */
	//  399  851:aload_0         
	//  400  852:getfield        #113 <Field ae l>
	//  401  855:getfield        #296 <Field boolean ae.h>
	//  402  858:ifeq            903
	//  403  861:aload           14
	//  404  863:invokevirtual   #299 <Method boolean View.hasFocusable()>
	//  405  866:ifeq            903
		if(layoutparams.b)
	//* 406  869:aload           15
	//* 407  871:getfield        #190 <Field boolean android.support.v7.widget.StaggeredGridLayoutManager$LayoutParams.b>
	//* 408  874:ifeq            887
			m.clear();
	//  409  877:aload_0         
	//  410  878:getfield        #204 <Field BitSet m>
	//  411  881:invokevirtual   #302 <Method void BitSet.clear()>
		else
	//* 412  884:goto            903
			m.set(b1.e, false);
	//  413  887:aload_0         
	//  414  888:getfield        #204 <Field BitSet m>
	//  415  891:aload           13
	//  416  893:getfield        #195 <Field int StaggeredGridLayoutManager$b.e>
	//  417  896:iconst_0        
	//  418  897:invokevirtual   #305 <Method void BitSet.set(int, boolean)>
	//* 419  900:goto            903
		j1 = 1;
	//  420  903:iconst_1        
	//  421  904:istore          4
		  goto _L7
	//* 422  906:goto            129
_L2:
		int l1 = 0;
	//  423  909:iconst_0        
	//  424  910:istore          5
		if(j1 == 0)
	//* 425  912:iload           4
	//* 426  914:ifne            926
			a(n1, l);
	//  427  917:aload_0         
	//  428  918:aload_1         
	//  429  919:aload_0         
	//  430  920:getfield        #113 <Field ae l>
	//  431  923:invokespecial   #294 <Method void a(RecyclerView$n, ae)>
		if(l.e == -1)
	//* 432  926:aload_0         
	//* 433  927:getfield        #113 <Field ae l>
	//* 434  930:getfield        #213 <Field int ae.e>
	//* 435  933:iconst_m1       
	//* 436  934:icmpne          965
		{
			j1 = p(b.c());
	//  437  937:aload_0         
	//  438  938:aload_0         
	//  439  939:getfield        #140 <Field ah b>
	//  440  942:invokevirtual   #223 <Method int ah.c()>
	//  441  945:invokespecial   #269 <Method int p(int)>
	//  442  948:istore          4
			j1 = b.c() - j1;
	//  443  950:aload_0         
	//  444  951:getfield        #140 <Field ah b>
	//  445  954:invokevirtual   #223 <Method int ah.c()>
	//  446  957:iload           4
	//  447  959:isub            
	//  448  960:istore          4
		} else
	//* 449  962:goto            986
		{
			j1 = q(b.d()) - b.d();
	//  450  965:aload_0         
	//  451  966:aload_0         
	//  452  967:getfield        #140 <Field ah b>
	//  453  970:invokevirtual   #221 <Method int ah.d()>
	//  454  973:invokespecial   #256 <Method int q(int)>
	//  455  976:aload_0         
	//  456  977:getfield        #140 <Field ah b>
	//  457  980:invokevirtual   #221 <Method int ah.d()>
	//  458  983:isub            
	//  459  984:istore          4
		}
		if(j1 > 0)
	//* 460  986:iload           4
	//* 461  988:ifle            1002
			l1 = Math.min(ae1.b, j1);
	//  462  991:aload_2         
	//  463  992:getfield        #216 <Field int android.support.v7.widget.ae.b>
	//  464  995:iload           4
	//  465  997:invokestatic    #186 <Method int Math.min(int, int)>
	//  466 1000:istore          5
		return l1;
	//  467 1002:iload           5
	//  468 1004:ireturn         
	}

	private b a(ae ae1)
	{
		boolean flag = s(ae1.e);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:getfield        #213 <Field int ae.e>
	//    3    5:invokespecial   #309 <Method boolean s(int)>
	//    4    8:istore          9
		int j1 = -1;
	//    5   10:iconst_m1       
	//    6   11:istore_3        
		int i1;
		byte byte0;
		if(flag)
	//*   7   12:iload           9
	//*   8   14:ifeq            30
		{
			i1 = i - 1;
	//    9   17:aload_0         
	//   10   18:getfield        #69  <Field int i>
	//   11   21:iconst_1        
	//   12   22:isub            
	//   13   23:istore_2        
			byte0 = -1;
	//   14   24:iconst_m1       
	//   15   25:istore          4
		} else
	//*  16   27:goto            40
		{
			i1 = 0;
	//   17   30:iconst_0        
	//   18   31:istore_2        
			j1 = i;
	//   19   32:aload_0         
	//   20   33:getfield        #69  <Field int i>
	//   21   36:istore_3        
			byte0 = 1;
	//   22   37:iconst_1        
	//   23   38:istore          4
		}
		int k1 = ae1.e;
	//   24   40:aload_1         
	//   25   41:getfield        #213 <Field int ae.e>
	//   26   44:istore          5
		b b1 = null;
	//   27   46:aconst_null     
	//   28   47:astore          10
		ae1 = null;
	//   29   49:aconst_null     
	//   30   50:astore_1        
		if(k1 == 1)
	//*  31   51:iload           5
	//*  32   53:iconst_1        
	//*  33   54:icmpne          124
		{
			k1 = 0x7fffffff;
	//   34   57:ldc1            #214 <Int 0x7fffffff>
	//   35   59:istore          5
			int l2 = b.c();
	//   36   61:aload_0         
	//   37   62:getfield        #140 <Field ah b>
	//   38   65:invokevirtual   #223 <Method int ah.c()>
	//   39   68:istore          8
			while(i1 != j1) 
	//*  40   70:iload_2         
	//*  41   71:iload_3         
	//*  42   72:icmpeq          122
			{
				b1 = a[i1];
	//   43   75:aload_0         
	//   44   76:getfield        #238 <Field StaggeredGridLayoutManager$b[] a>
	//   45   79:iload_2         
	//   46   80:aaload          
	//   47   81:astore          10
				int j2 = b1.b(l2);
	//   48   83:aload           10
	//   49   85:iload           8
	//   50   87:invokevirtual   #258 <Method int android.support.v7.widget.StaggeredGridLayoutManager$b.b(int)>
	//   51   90:istore          7
				int l1 = k1;
	//   52   92:iload           5
	//   53   94:istore          6
				if(j2 < k1)
	//*  54   96:iload           7
	//*  55   98:iload           5
	//*  56  100:icmpge          110
				{
					ae1 = ((ae) (b1));
	//   57  103:aload           10
	//   58  105:astore_1        
					l1 = j2;
	//   59  106:iload           7
	//   60  108:istore          6
				}
				i1 += ((int) (byte0));
	//   61  110:iload_2         
	//   62  111:iload           4
	//   63  113:iadd            
	//   64  114:istore_2        
				k1 = l1;
	//   65  115:iload           6
	//   66  117:istore          5
			}
	//*  67  119:goto            70
			return ((b) (ae1));
	//   68  122:aload_1         
	//   69  123:areturn         
		}
		k1 = 0x80000000;
	//   70  124:ldc1            #76  <Int 0x80000000>
	//   71  126:istore          5
		int i3 = b.d();
	//   72  128:aload_0         
	//   73  129:getfield        #140 <Field ah b>
	//   74  132:invokevirtual   #221 <Method int ah.d()>
	//   75  135:istore          8
		ae1 = ((ae) (b1));
	//   76  137:aload           10
	//   77  139:astore_1        
		while(i1 != j1) 
	//*  78  140:iload_2         
	//*  79  141:iload_3         
	//*  80  142:icmpeq          192
		{
			b b2 = a[i1];
	//   81  145:aload_0         
	//   82  146:getfield        #238 <Field StaggeredGridLayoutManager$b[] a>
	//   83  149:iload_2         
	//   84  150:aaload          
	//   85  151:astore          10
			int k2 = b2.a(i3);
	//   86  153:aload           10
	//   87  155:iload           8
	//   88  157:invokevirtual   #271 <Method int StaggeredGridLayoutManager$b.a(int)>
	//   89  160:istore          7
			int i2 = k1;
	//   90  162:iload           5
	//   91  164:istore          6
			if(k2 > k1)
	//*  92  166:iload           7
	//*  93  168:iload           5
	//*  94  170:icmple          180
			{
				ae1 = ((ae) (b2));
	//   95  173:aload           10
	//   96  175:astore_1        
				i2 = k2;
	//   97  176:iload           7
	//   98  178:istore          6
			}
			i1 += ((int) (byte0));
	//   99  180:iload_2         
	//  100  181:iload           4
	//  101  183:iadd            
	//  102  184:istore_2        
			k1 = i2;
	//  103  185:iload           6
	//  104  187:istore          5
		}
	//* 105  189:goto            140
		return ((b) (ae1));
	//  106  192:aload_1         
	//  107  193:areturn         
	}

	private void a(int i1, int j1)
	{
		for(int k1 = 0; k1 < i; k1++)
	//*   0    0:iconst_0        
	//*   1    1:istore_3        
	//*   2    2:iload_3         
	//*   3    3:aload_0         
	//*   4    4:getfield        #69  <Field int i>
	//*   5    7:icmpge          47
			if(!a[k1].a.isEmpty())
	//*   6   10:aload_0         
	//*   7   11:getfield        #238 <Field StaggeredGridLayoutManager$b[] a>
	//*   8   14:iload_3         
	//*   9   15:aaload          
	//*  10   16:getfield        #312 <Field ArrayList StaggeredGridLayoutManager$b.a>
	//*  11   19:invokevirtual   #315 <Method boolean ArrayList.isEmpty()>
	//*  12   22:ifeq            28
	//*  13   25:goto            40
				a(a[k1], i1, j1);
	//   14   28:aload_0         
	//   15   29:aload_0         
	//   16   30:getfield        #238 <Field StaggeredGridLayoutManager$b[] a>
	//   17   33:iload_3         
	//   18   34:aaload          
	//   19   35:iload_1         
	//   20   36:iload_2         
	//   21   37:invokespecial   #291 <Method void a(StaggeredGridLayoutManager$b, int, int)>

	//   22   40:iload_3         
	//   23   41:iconst_1        
	//   24   42:iadd            
	//   25   43:istore_3        
	//*  26   44:goto            2
	//   27   47:return          
	}

	private void a(RecyclerView.n n1, int i1)
	{
		View view;
		for(; u() > 0; a(view, n1))
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #154 <Method int u()>
	//*   2    4:ifle            161
		{
			boolean flag = false;
	//    3    7:iconst_0        
	//    4    8:istore          5
			view = h(0);
	//    5   10:aload_0         
	//    6   11:iconst_0        
	//    7   12:invokevirtual   #157 <Method View h(int)>
	//    8   15:astore          6
			if(b.b(view) > i1 || b.c(view) > i1)
				break;
	//    9   17:aload_0         
	//   10   18:getfield        #140 <Field ah b>
	//   11   21:aload           6
	//   12   23:invokevirtual   #318 <Method int android.support.v7.widget.ah.b(View)>
	//   13   26:iload_2         
	//   14   27:icmpgt          161
	//   15   30:aload_0         
	//   16   31:getfield        #140 <Field ah b>
	//   17   34:aload           6
	//   18   36:invokevirtual   #320 <Method int ah.c(View)>
	//   19   39:iload_2         
	//   20   40:icmpgt          161
			LayoutParams layoutparams = (LayoutParams)view.getLayoutParams();
	//   21   43:aload           6
	//   22   45:invokevirtual   #166 <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//   23   48:checkcast       #8   <Class StaggeredGridLayoutManager$LayoutParams>
	//   24   51:astore          7
			if(layoutparams.b)
	//*  25   53:aload           7
	//*  26   55:getfield        #190 <Field boolean android.support.v7.widget.StaggeredGridLayoutManager$LayoutParams.b>
	//*  27   58:ifeq            127
			{
				int j1 = 0;
	//   28   61:iconst_0        
	//   29   62:istore_3        
				int k1;
				do
				{
					k1 = ((int) (flag));
	//   30   63:iload           5
	//   31   65:istore          4
					if(j1 >= i)
						break;
	//   32   67:iload_3         
	//   33   68:aload_0         
	//   34   69:getfield        #69  <Field int i>
	//   35   72:icmpge          99
					if(a[j1].a.size() == 1)
	//*  36   75:aload_0         
	//*  37   76:getfield        #238 <Field StaggeredGridLayoutManager$b[] a>
	//*  38   79:iload_3         
	//*  39   80:aaload          
	//*  40   81:getfield        #312 <Field ArrayList StaggeredGridLayoutManager$b.a>
	//*  41   84:invokevirtual   #323 <Method int ArrayList.size()>
	//*  42   87:iconst_1        
	//*  43   88:icmpne          92
						return;
	//   44   91:return          
					j1++;
	//   45   92:iload_3         
	//   46   93:iconst_1        
	//   47   94:iadd            
	//   48   95:istore_3        
				} while(true);
	//   49   96:goto            63
				for(; k1 < i; k1++)
	//*  50   99:iload           4
	//*  51  101:aload_0         
	//*  52  102:getfield        #69  <Field int i>
	//*  53  105:icmpge          151
					a[k1].h();
	//   54  108:aload_0         
	//   55  109:getfield        #238 <Field StaggeredGridLayoutManager$b[] a>
	//   56  112:iload           4
	//   57  114:aaload          
	//   58  115:invokevirtual   #325 <Method void StaggeredGridLayoutManager$b.h()>

	//   59  118:iload           4
	//   60  120:iconst_1        
	//   61  121:iadd            
	//   62  122:istore          4
				continue;
	//   63  124:goto            99
			}
			if(layoutparams.a.a.size() == 1)
	//*  64  127:aload           7
	//*  65  129:getfield        #193 <Field StaggeredGridLayoutManager$b StaggeredGridLayoutManager$LayoutParams.a>
	//*  66  132:getfield        #312 <Field ArrayList StaggeredGridLayoutManager$b.a>
	//*  67  135:invokevirtual   #323 <Method int ArrayList.size()>
	//*  68  138:iconst_1        
	//*  69  139:icmpne          143
				return;
	//   70  142:return          
			layoutparams.a.h();
	//   71  143:aload           7
	//   72  145:getfield        #193 <Field StaggeredGridLayoutManager$b StaggeredGridLayoutManager$LayoutParams.a>
	//   73  148:invokevirtual   #325 <Method void StaggeredGridLayoutManager$b.h()>
		}

	//   74  151:aload_0         
	//   75  152:aload           6
	//   76  154:aload_1         
	//   77  155:invokevirtual   #328 <Method void a(View, RecyclerView$n)>
	//*  78  158:goto            0
	//   79  161:return          
	}

	private void a(RecyclerView.n n1, RecyclerView.r r1, boolean flag)
	{
		boolean flag1;
		a a1;
label0:
		{
			a1 = D;
	//    0    0:aload_0         
	//    1    1:getfield        #93  <Field StaggeredGridLayoutManager$a D>
	//    2    4:astore          7
			if((A != null || f != -1) && r1.e() == 0)
	//*   3    6:aload_0         
	//*   4    7:getfield        #331 <Field StaggeredGridLayoutManager$SavedState A>
	//*   5   10:ifnonnull       21
	//*   6   13:aload_0         
	//*   7   14:getfield        #75  <Field int f>
	//*   8   17:iconst_m1       
	//*   9   18:icmpeq          39
	//*  10   21:aload_2         
	//*  11   22:invokevirtual   #335 <Method int RecyclerView$r.e()>
	//*  12   25:ifne            39
			{
				c(n1);
	//   13   28:aload_0         
	//   14   29:aload_1         
	//   15   30:invokevirtual   #338 <Method void c(RecyclerView$n)>
				a1.a();
	//   16   33:aload           7
	//   17   35:invokevirtual   #340 <Method void StaggeredGridLayoutManager$a.a()>
				return;
	//   18   38:return          
			}
			boolean flag3 = a1.e;
	//   19   39:aload           7
	//   20   41:getfield        #341 <Field boolean StaggeredGridLayoutManager$a.e>
	//   21   44:istore          6
			boolean flag2 = true;
	//   22   46:iconst_1        
	//   23   47:istore          5
			int i1;
			if(flag3 && f == -1 && A == null)
	//*  24   49:iload           6
	//*  25   51:ifeq            78
	//*  26   54:aload_0         
	//*  27   55:getfield        #75  <Field int f>
	//*  28   58:iconst_m1       
	//*  29   59:icmpne          78
	//*  30   62:aload_0         
	//*  31   63:getfield        #331 <Field StaggeredGridLayoutManager$SavedState A>
	//*  32   66:ifnull          72
	//*  33   69:goto            78
				i1 = 0;
	//   34   72:iconst_0        
	//   35   73:istore          4
			else
	//*  36   75:goto            81
				i1 = 1;
	//   37   78:iconst_1        
	//   38   79:istore          4
			if(i1 != 0)
	//*  39   81:iload           4
	//*  40   83:ifeq            133
			{
				a1.a();
	//   41   86:aload           7
	//   42   88:invokevirtual   #340 <Method void StaggeredGridLayoutManager$a.a()>
				if(A != null)
	//*  43   91:aload_0         
	//*  44   92:getfield        #331 <Field StaggeredGridLayoutManager$SavedState A>
	//*  45   95:ifnull          107
				{
					a(a1);
	//   46   98:aload_0         
	//   47   99:aload           7
	//   48  101:invokespecial   #344 <Method void a(StaggeredGridLayoutManager$a)>
				} else
	//*  49  104:goto            120
				{
					M();
	//   50  107:aload_0         
	//   51  108:invokespecial   #346 <Method void M()>
					a1.c = e;
	//   52  111:aload           7
	//   53  113:aload_0         
	//   54  114:getfield        #73  <Field boolean e>
	//   55  117:putfield        #347 <Field boolean StaggeredGridLayoutManager$a.c>
				}
				a(r1, a1);
	//   56  120:aload_0         
	//   57  121:aload_2         
	//   58  122:aload           7
	//   59  124:invokevirtual   #350 <Method void a(RecyclerView$r, StaggeredGridLayoutManager$a)>
				a1.e = true;
	//   60  127:aload           7
	//   61  129:iconst_1        
	//   62  130:putfield        #341 <Field boolean StaggeredGridLayoutManager$a.e>
			}
			if(A == null && f == -1 && (a1.c != o || i() != z))
	//*  63  133:aload_0         
	//*  64  134:getfield        #331 <Field StaggeredGridLayoutManager$SavedState A>
	//*  65  137:ifnonnull       184
	//*  66  140:aload_0         
	//*  67  141:getfield        #75  <Field int f>
	//*  68  144:iconst_m1       
	//*  69  145:icmpne          184
	//*  70  148:aload           7
	//*  71  150:getfield        #347 <Field boolean StaggeredGridLayoutManager$a.c>
	//*  72  153:aload_0         
	//*  73  154:getfield        #352 <Field boolean o>
	//*  74  157:icmpne          171
	//*  75  160:aload_0         
	//*  76  161:invokevirtual   #146 <Method boolean i()>
	//*  77  164:aload_0         
	//*  78  165:getfield        #354 <Field boolean z>
	//*  79  168:icmpeq          184
			{
				h.a();
	//   80  171:aload_0         
	//   81  172:getfield        #81  <Field StaggeredGridLayoutManager$LazySpanLookup h>
	//   82  175:invokevirtual   #355 <Method void StaggeredGridLayoutManager$LazySpanLookup.a()>
				a1.d = true;
	//   83  178:aload           7
	//   84  180:iconst_1        
	//   85  181:putfield        #356 <Field boolean StaggeredGridLayoutManager$a.d>
			}
			if(u() > 0 && (A == null || A.c < 1))
	//*  86  184:aload_0         
	//*  87  185:invokevirtual   #154 <Method int u()>
	//*  88  188:ifle            392
	//*  89  191:aload_0         
	//*  90  192:getfield        #331 <Field StaggeredGridLayoutManager$SavedState A>
	//*  91  195:ifnull          209
	//*  92  198:aload_0         
	//*  93  199:getfield        #331 <Field StaggeredGridLayoutManager$SavedState A>
	//*  94  202:getfield        #358 <Field int StaggeredGridLayoutManager$SavedState.c>
	//*  95  205:iconst_1        
	//*  96  206:icmpge          392
				if(a1.d)
	//*  97  209:aload           7
	//*  98  211:getfield        #356 <Field boolean StaggeredGridLayoutManager$a.d>
	//*  99  214:ifeq            273
					for(i1 = 0; i1 < i; i1++)
	//* 100  217:iconst_0        
	//* 101  218:istore          4
	//* 102  220:iload           4
	//* 103  222:aload_0         
	//* 104  223:getfield        #69  <Field int i>
	//* 105  226:icmpge          392
					{
						a[i1].e();
	//  106  229:aload_0         
	//  107  230:getfield        #238 <Field StaggeredGridLayoutManager$b[] a>
	//  108  233:iload           4
	//  109  235:aaload          
	//  110  236:invokevirtual   #360 <Method void StaggeredGridLayoutManager$b.e()>
						if(a1.b != 0x80000000)
	//* 111  239:aload           7
	//* 112  241:getfield        #361 <Field int android.support.v7.widget.StaggeredGridLayoutManager$a.b>
	//* 113  244:ldc1            #76  <Int 0x80000000>
	//* 114  246:icmpeq          264
							a[i1].c(a1.b);
	//  115  249:aload_0         
	//  116  250:getfield        #238 <Field StaggeredGridLayoutManager$b[] a>
	//  117  253:iload           4
	//  118  255:aaload          
	//  119  256:aload           7
	//  120  258:getfield        #361 <Field int android.support.v7.widget.StaggeredGridLayoutManager$a.b>
	//  121  261:invokevirtual   #363 <Method void StaggeredGridLayoutManager$b.c(int)>
					}

	//  122  264:iload           4
	//  123  266:iconst_1        
	//  124  267:iadd            
	//  125  268:istore          4
				else
	//* 126  270:goto            220
				if(i1 == 0 && D.f != null)
	//* 127  273:iload           4
	//* 128  275:ifne            341
	//* 129  278:aload_0         
	//* 130  279:getfield        #93  <Field StaggeredGridLayoutManager$a D>
	//* 131  282:getfield        #365 <Field int[] StaggeredGridLayoutManager$a.f>
	//* 132  285:ifnonnull       291
	//* 133  288:goto            341
				{
					for(int j1 = 0; j1 < i; j1++)
	//* 134  291:iconst_0        
	//* 135  292:istore          4
	//* 136  294:iload           4
	//* 137  296:aload_0         
	//* 138  297:getfield        #69  <Field int i>
	//* 139  300:icmpge          392
					{
						b b1 = a[j1];
	//  140  303:aload_0         
	//  141  304:getfield        #238 <Field StaggeredGridLayoutManager$b[] a>
	//  142  307:iload           4
	//  143  309:aaload          
	//  144  310:astore          8
						b1.e();
	//  145  312:aload           8
	//  146  314:invokevirtual   #360 <Method void StaggeredGridLayoutManager$b.e()>
						b1.c(D.f[j1]);
	//  147  317:aload           8
	//  148  319:aload_0         
	//  149  320:getfield        #93  <Field StaggeredGridLayoutManager$a D>
	//  150  323:getfield        #365 <Field int[] StaggeredGridLayoutManager$a.f>
	//  151  326:iload           4
	//  152  328:iaload          
	//  153  329:invokevirtual   #363 <Method void StaggeredGridLayoutManager$b.c(int)>
					}

	//  154  332:iload           4
	//  155  334:iconst_1        
	//  156  335:iadd            
	//  157  336:istore          4
				} else
	//* 158  338:goto            294
				{
					for(int k1 = 0; k1 < i; k1++)
	//* 159  341:iconst_0        
	//* 160  342:istore          4
	//* 161  344:iload           4
	//* 162  346:aload_0         
	//* 163  347:getfield        #69  <Field int i>
	//* 164  350:icmpge          381
						a[k1].a(e, a1.b);
	//  165  353:aload_0         
	//  166  354:getfield        #238 <Field StaggeredGridLayoutManager$b[] a>
	//  167  357:iload           4
	//  168  359:aaload          
	//  169  360:aload_0         
	//  170  361:getfield        #73  <Field boolean e>
	//  171  364:aload           7
	//  172  366:getfield        #361 <Field int android.support.v7.widget.StaggeredGridLayoutManager$a.b>
	//  173  369:invokevirtual   #368 <Method void StaggeredGridLayoutManager$b.a(boolean, int)>

	//  174  372:iload           4
	//  175  374:iconst_1        
	//  176  375:iadd            
	//  177  376:istore          4
	//* 178  378:goto            344
					D.a(a);
	//  179  381:aload_0         
	//  180  382:getfield        #93  <Field StaggeredGridLayoutManager$a D>
	//  181  385:aload_0         
	//  182  386:getfield        #238 <Field StaggeredGridLayoutManager$b[] a>
	//  183  389:invokevirtual   #371 <Method void StaggeredGridLayoutManager$a.a(StaggeredGridLayoutManager$b[])>
				}
			a(n1);
	//  184  392:aload_0         
	//  185  393:aload_1         
	//  186  394:invokevirtual   #373 <Method void a(RecyclerView$n)>
			l.a = false;
	//  187  397:aload_0         
	//  188  398:getfield        #113 <Field ae l>
	//  189  401:iconst_0        
	//  190  402:putfield        #375 <Field boolean ae.a>
			E = false;
	//  191  405:aload_0         
	//  192  406:iconst_0        
	//  193  407:putfield        #95  <Field boolean E>
			e(c.f());
	//  194  410:aload_0         
	//  195  411:aload_0         
	//  196  412:getfield        #142 <Field ah c>
	//  197  415:invokevirtual   #182 <Method int ah.f()>
	//  198  418:invokevirtual   #188 <Method void e(int)>
			b(a1.a, r1);
	//  199  421:aload_0         
	//  200  422:aload           7
	//  201  424:getfield        #376 <Field int StaggeredGridLayoutManager$a.a>
	//  202  427:aload_2         
	//  203  428:invokespecial   #379 <Method void b(int, RecyclerView$r)>
			if(a1.c)
	//* 204  431:aload           7
	//* 205  433:getfield        #347 <Field boolean StaggeredGridLayoutManager$a.c>
	//* 206  436:ifeq            494
			{
				l(-1);
	//  207  439:aload_0         
	//  208  440:iconst_m1       
	//  209  441:invokespecial   #381 <Method void l(int)>
				a(n1, l, r1);
	//  210  444:aload_0         
	//  211  445:aload_1         
	//  212  446:aload_0         
	//  213  447:getfield        #113 <Field ae l>
	//  214  450:aload_2         
	//  215  451:invokespecial   #383 <Method int a(RecyclerView$n, ae, RecyclerView$r)>
	//  216  454:pop             
				l(1);
	//  217  455:aload_0         
	//  218  456:iconst_1        
	//  219  457:invokespecial   #381 <Method void l(int)>
			} else
	//* 220  460:aload_0         
	//* 221  461:getfield        #113 <Field ae l>
	//* 222  464:aload           7
	//* 223  466:getfield        #376 <Field int StaggeredGridLayoutManager$a.a>
	//* 224  469:aload_0         
	//* 225  470:getfield        #113 <Field ae l>
	//* 226  473:getfield        #275 <Field int ae.d>
	//* 227  476:iadd            
	//* 228  477:putfield        #384 <Field int ae.c>
	//* 229  480:aload_0         
	//* 230  481:aload_1         
	//* 231  482:aload_0         
	//* 232  483:getfield        #113 <Field ae l>
	//* 233  486:aload_2         
	//* 234  487:invokespecial   #383 <Method int a(RecyclerView$n, ae, RecyclerView$r)>
	//* 235  490:pop             
	//* 236  491:goto            518
			{
				l(1);
	//  237  494:aload_0         
	//  238  495:iconst_1        
	//  239  496:invokespecial   #381 <Method void l(int)>
				a(n1, l, r1);
	//  240  499:aload_0         
	//  241  500:aload_1         
	//  242  501:aload_0         
	//  243  502:getfield        #113 <Field ae l>
	//  244  505:aload_2         
	//  245  506:invokespecial   #383 <Method int a(RecyclerView$n, ae, RecyclerView$r)>
	//  246  509:pop             
				l(-1);
	//  247  510:aload_0         
	//  248  511:iconst_m1       
	//  249  512:invokespecial   #381 <Method void l(int)>
			}
			l.c = a1.a + l.d;
			a(n1, l, r1);
	//* 250  515:goto            460
			N();
	//  251  518:aload_0         
	//  252  519:invokespecial   #386 <Method void N()>
			if(u() > 0)
	//* 253  522:aload_0         
	//* 254  523:invokevirtual   #154 <Method int u()>
	//* 255  526:ifle            567
				if(e)
	//* 256  529:aload_0         
	//* 257  530:getfield        #73  <Field boolean e>
	//* 258  533:ifeq            553
				{
					b(n1, r1, true);
	//  259  536:aload_0         
	//  260  537:aload_1         
	//  261  538:aload_2         
	//  262  539:iconst_1        
	//  263  540:invokespecial   #388 <Method void b(RecyclerView$n, RecyclerView$r, boolean)>
					c(n1, r1, false);
	//  264  543:aload_0         
	//  265  544:aload_1         
	//  266  545:aload_2         
	//  267  546:iconst_0        
	//  268  547:invokespecial   #390 <Method void c(RecyclerView$n, RecyclerView$r, boolean)>
				} else
	//* 269  550:goto            567
				{
					c(n1, r1, true);
	//  270  553:aload_0         
	//  271  554:aload_1         
	//  272  555:aload_2         
	//  273  556:iconst_1        
	//  274  557:invokespecial   #390 <Method void c(RecyclerView$n, RecyclerView$r, boolean)>
					b(n1, r1, false);
	//  275  560:aload_0         
	//  276  561:aload_1         
	//  277  562:aload_2         
	//  278  563:iconst_0        
	//  279  564:invokespecial   #388 <Method void b(RecyclerView$n, RecyclerView$r, boolean)>
				}
			if(flag && !r1.a())
	//* 280  567:iload_3         
	//* 281  568:ifeq            643
	//* 282  571:aload_2         
	//* 283  572:invokevirtual   #391 <Method boolean RecyclerView$r.a()>
	//* 284  575:ifne            643
			{
				if(n != 0 && u() > 0 && (E || g() != null))
	//* 285  578:aload_0         
	//* 286  579:getfield        #83  <Field int n>
	//* 287  582:ifeq            612
	//* 288  585:aload_0         
	//* 289  586:invokevirtual   #154 <Method int u()>
	//* 290  589:ifle            612
	//* 291  592:aload_0         
	//* 292  593:getfield        #95  <Field boolean E>
	//* 293  596:ifne            606
	//* 294  599:aload_0         
	//* 295  600:invokevirtual   #394 <Method View g()>
	//* 296  603:ifnull          612
					flag1 = true;
	//  297  606:iconst_1        
	//  298  607:istore          4
				else
	//* 299  609:goto            615
					flag1 = false;
	//  300  612:iconst_0        
	//  301  613:istore          4
				if(flag1)
	//* 302  615:iload           4
	//* 303  617:ifeq            643
				{
					a(H);
	//  304  620:aload_0         
	//  305  621:aload_0         
	//  306  622:getfield        #100 <Field Runnable H>
	//  307  625:invokevirtual   #397 <Method boolean a(Runnable)>
	//  308  628:pop             
					if(f())
	//* 309  629:aload_0         
	//* 310  630:invokevirtual   #399 <Method boolean f()>
	//* 311  633:ifeq            643
					{
						flag1 = flag2;
	//  312  636:iload           5
	//  313  638:istore          4
						break label0;
	//  314  640:goto            646
					}
				}
			}
			flag1 = false;
	//  315  643:iconst_0        
	//  316  644:istore          4
		}
		if(r1.a())
	//* 317  646:aload_2         
	//* 318  647:invokevirtual   #391 <Method boolean RecyclerView$r.a()>
	//* 319  650:ifeq            660
			D.a();
	//  320  653:aload_0         
	//  321  654:getfield        #93  <Field StaggeredGridLayoutManager$a D>
	//  322  657:invokevirtual   #340 <Method void StaggeredGridLayoutManager$a.a()>
		o = a1.c;
	//  323  660:aload_0         
	//  324  661:aload           7
	//  325  663:getfield        #347 <Field boolean StaggeredGridLayoutManager$a.c>
	//  326  666:putfield        #352 <Field boolean o>
		z = i();
	//  327  669:aload_0         
	//  328  670:aload_0         
	//  329  671:invokevirtual   #146 <Method boolean i()>
	//  330  674:putfield        #354 <Field boolean z>
		if(flag1)
	//* 331  677:iload           4
	//* 332  679:ifeq            696
		{
			D.a();
	//  333  682:aload_0         
	//  334  683:getfield        #93  <Field StaggeredGridLayoutManager$a D>
	//  335  686:invokevirtual   #340 <Method void StaggeredGridLayoutManager$a.a()>
			a(n1, r1, false);
	//  336  689:aload_0         
	//  337  690:aload_1         
	//  338  691:aload_2         
	//  339  692:iconst_0        
	//  340  693:invokespecial   #401 <Method void a(RecyclerView$n, RecyclerView$r, boolean)>
		}
	//  341  696:return          
	}

	private void a(RecyclerView.n n1, ae ae1)
	{
		if(!ae1.a)
			break MISSING_BLOCK_LABEL_142;
	//    0    0:aload_2         
	//    1    1:getfield        #375 <Field boolean ae.a>
	//    2    4:ifeq            142
		if(ae1.i)
	//*   3    7:aload_2         
	//*   4    8:getfield        #212 <Field boolean ae.i>
	//*   5   11:ifeq            15
			return;
	//    6   14:return          
		if(ae1.b != 0) goto _L2; else goto _L1
	//    7   15:aload_2         
	//    8   16:getfield        #216 <Field int android.support.v7.widget.ae.b>
	//    9   19:ifne            54
_L1:
		if(ae1.e != -1) goto _L4; else goto _L3
	//   10   22:aload_2         
	//   11   23:getfield        #213 <Field int ae.e>
	//   12   26:iconst_m1       
	//   13   27:icmpne          42
_L3:
		int i1 = ae1.g;
	//   14   30:aload_2         
	//   15   31:getfield        #215 <Field int ae.g>
	//   16   34:istore_3        
_L6:
		b(n1, i1);
	//   17   35:aload_0         
	//   18   36:aload_1         
	//   19   37:iload_3         
	//   20   38:invokespecial   #403 <Method void b(RecyclerView$n, int)>
		return;
	//   21   41:return          
_L4:
		i1 = ae1.f;
	//   22   42:aload_2         
	//   23   43:getfield        #217 <Field int ae.f>
	//   24   46:istore_3        
_L8:
		a(n1, i1);
	//   25   47:aload_0         
	//   26   48:aload_1         
	//   27   49:iload_3         
	//   28   50:invokespecial   #405 <Method void a(RecyclerView$n, int)>
		return;
	//   29   53:return          
_L2:
		if(ae1.e != -1)
			break MISSING_BLOCK_LABEL_100;
	//   30   54:aload_2         
	//   31   55:getfield        #213 <Field int ae.e>
	//   32   58:iconst_m1       
	//   33   59:icmpne          100
		i1 = ae1.f - o(ae1.f);
	//   34   62:aload_2         
	//   35   63:getfield        #217 <Field int ae.f>
	//   36   66:aload_0         
	//   37   67:aload_2         
	//   38   68:getfield        #217 <Field int ae.f>
	//   39   71:invokespecial   #407 <Method int o(int)>
	//   40   74:isub            
	//   41   75:istore_3        
		if(i1 >= 0) goto _L5; else goto _L3
	//   42   76:iload_3         
	//   43   77:ifge            83
	//*  44   80:goto            30
_L5:
		i1 = ae1.g - Math.min(i1, ae1.b);
	//   45   83:aload_2         
	//   46   84:getfield        #215 <Field int ae.g>
	//   47   87:iload_3         
	//   48   88:aload_2         
	//   49   89:getfield        #216 <Field int android.support.v7.widget.ae.b>
	//   50   92:invokestatic    #186 <Method int Math.min(int, int)>
	//   51   95:isub            
	//   52   96:istore_3        
		  goto _L6
	//*  53   97:goto            35
		i1 = r(ae1.g) - ae1.g;
	//   54  100:aload_0         
	//   55  101:aload_2         
	//   56  102:getfield        #215 <Field int ae.g>
	//   57  105:invokespecial   #410 <Method int r(int)>
	//   58  108:aload_2         
	//   59  109:getfield        #215 <Field int ae.g>
	//   60  112:isub            
	//   61  113:istore_3        
		if(i1 >= 0) goto _L7; else goto _L4
	//   62  114:iload_3         
	//   63  115:ifge            121
	//*  64  118:goto            42
_L7:
		int j1 = ae1.f;
	//   65  121:aload_2         
	//   66  122:getfield        #217 <Field int ae.f>
	//   67  125:istore          4
		i1 = Math.min(i1, ae1.b) + j1;
	//   68  127:iload_3         
	//   69  128:aload_2         
	//   70  129:getfield        #216 <Field int android.support.v7.widget.ae.b>
	//   71  132:invokestatic    #186 <Method int Math.min(int, int)>
	//   72  135:iload           4
	//   73  137:iadd            
	//   74  138:istore_3        
		  goto _L8
	//*  75  139:goto            47
	//   76  142:return          
		  goto _L6
	}

	private void a(a a1)
	{
		if(A.c > 0)
	//*   0    0:aload_0         
	//*   1    1:getfield        #331 <Field StaggeredGridLayoutManager$SavedState A>
	//*   2    4:getfield        #358 <Field int StaggeredGridLayoutManager$SavedState.c>
	//*   3    7:ifle            139
			if(A.c == i)
	//*   4   10:aload_0         
	//*   5   11:getfield        #331 <Field StaggeredGridLayoutManager$SavedState A>
	//*   6   14:getfield        #358 <Field int StaggeredGridLayoutManager$SavedState.c>
	//*   7   17:aload_0         
	//*   8   18:getfield        #69  <Field int i>
	//*   9   21:icmpne          118
			{
				for(int i1 = 0; i1 < i; i1++)
	//*  10   24:iconst_0        
	//*  11   25:istore_2        
	//*  12   26:iload_2         
	//*  13   27:aload_0         
	//*  14   28:getfield        #69  <Field int i>
	//*  15   31:icmpge          139
				{
					a[i1].e();
	//   16   34:aload_0         
	//   17   35:getfield        #238 <Field StaggeredGridLayoutManager$b[] a>
	//   18   38:iload_2         
	//   19   39:aaload          
	//   20   40:invokevirtual   #360 <Method void StaggeredGridLayoutManager$b.e()>
					int k1 = A.d[i1];
	//   21   43:aload_0         
	//   22   44:getfield        #331 <Field StaggeredGridLayoutManager$SavedState A>
	//   23   47:getfield        #412 <Field int[] StaggeredGridLayoutManager$SavedState.d>
	//   24   50:iload_2         
	//   25   51:iaload          
	//   26   52:istore          4
					int j1 = k1;
	//   27   54:iload           4
	//   28   56:istore_3        
					if(k1 != 0x80000000)
	//*  29   57:iload           4
	//*  30   59:ldc1            #76  <Int 0x80000000>
	//*  31   61:icmpeq          101
					{
						if(A.i)
	//*  32   64:aload_0         
	//*  33   65:getfield        #331 <Field StaggeredGridLayoutManager$SavedState A>
	//*  34   68:getfield        #413 <Field boolean StaggeredGridLayoutManager$SavedState.i>
	//*  35   71:ifeq            90
							j1 = b.d();
	//   36   74:aload_0         
	//   37   75:getfield        #140 <Field ah b>
	//   38   78:invokevirtual   #221 <Method int ah.d()>
	//   39   81:istore_3        
						else
	//*  40   82:iload           4
	//*  41   84:iload_3         
	//*  42   85:iadd            
	//*  43   86:istore_3        
	//*  44   87:goto            101
							j1 = b.c();
	//   45   90:aload_0         
	//   46   91:getfield        #140 <Field ah b>
	//   47   94:invokevirtual   #223 <Method int ah.c()>
	//   48   97:istore_3        
						j1 = k1 + j1;
					}
	//*  49   98:goto            82
					a[i1].c(j1);
	//   50  101:aload_0         
	//   51  102:getfield        #238 <Field StaggeredGridLayoutManager$b[] a>
	//   52  105:iload_2         
	//   53  106:aaload          
	//   54  107:iload_3         
	//   55  108:invokevirtual   #363 <Method void StaggeredGridLayoutManager$b.c(int)>
				}

	//   56  111:iload_2         
	//   57  112:iconst_1        
	//   58  113:iadd            
	//   59  114:istore_2        
			} else
	//*  60  115:goto            26
			{
				A.a();
	//   61  118:aload_0         
	//   62  119:getfield        #331 <Field StaggeredGridLayoutManager$SavedState A>
	//   63  122:invokevirtual   #414 <Method void StaggeredGridLayoutManager$SavedState.a()>
				A.a = A.b;
	//   64  125:aload_0         
	//   65  126:getfield        #331 <Field StaggeredGridLayoutManager$SavedState A>
	//   66  129:aload_0         
	//   67  130:getfield        #331 <Field StaggeredGridLayoutManager$SavedState A>
	//   68  133:getfield        #415 <Field int android.support.v7.widget.StaggeredGridLayoutManager$SavedState.b>
	//   69  136:putfield        #416 <Field int StaggeredGridLayoutManager$SavedState.a>
			}
		z = A.j;
	//   70  139:aload_0         
	//   71  140:aload_0         
	//   72  141:getfield        #331 <Field StaggeredGridLayoutManager$SavedState A>
	//   73  144:getfield        #418 <Field boolean StaggeredGridLayoutManager$SavedState.j>
	//   74  147:putfield        #354 <Field boolean z>
		a(A.h);
	//   75  150:aload_0         
	//   76  151:aload_0         
	//   77  152:getfield        #331 <Field StaggeredGridLayoutManager$SavedState A>
	//   78  155:getfield        #419 <Field boolean StaggeredGridLayoutManager$SavedState.h>
	//   79  158:invokevirtual   #133 <Method void a(boolean)>
		M();
	//   80  161:aload_0         
	//   81  162:invokespecial   #346 <Method void M()>
		boolean flag;
		if(A.a != -1)
	//*  82  165:aload_0         
	//*  83  166:getfield        #331 <Field StaggeredGridLayoutManager$SavedState A>
	//*  84  169:getfield        #416 <Field int StaggeredGridLayoutManager$SavedState.a>
	//*  85  172:iconst_m1       
	//*  86  173:icmpeq          205
		{
			f = A.a;
	//   87  176:aload_0         
	//   88  177:aload_0         
	//   89  178:getfield        #331 <Field StaggeredGridLayoutManager$SavedState A>
	//   90  181:getfield        #416 <Field int StaggeredGridLayoutManager$SavedState.a>
	//   91  184:putfield        #75  <Field int f>
			flag = A.i;
	//   92  187:aload_0         
	//   93  188:getfield        #331 <Field StaggeredGridLayoutManager$SavedState A>
	//   94  191:getfield        #413 <Field boolean StaggeredGridLayoutManager$SavedState.i>
	//   95  194:istore          5
		} else
	//*  96  196:aload_1         
	//*  97  197:iload           5
	//*  98  199:putfield        #347 <Field boolean StaggeredGridLayoutManager$a.c>
	//*  99  202:goto            214
		{
			flag = e;
	//  100  205:aload_0         
	//  101  206:getfield        #73  <Field boolean e>
	//  102  209:istore          5
		}
		a1.c = flag;
	//* 103  211:goto            196
		if(A.e > 1)
	//* 104  214:aload_0         
	//* 105  215:getfield        #331 <Field StaggeredGridLayoutManager$SavedState A>
	//* 106  218:getfield        #420 <Field int StaggeredGridLayoutManager$SavedState.e>
	//* 107  221:iconst_1        
	//* 108  222:icmple          253
		{
			h.a = A.f;
	//  109  225:aload_0         
	//  110  226:getfield        #81  <Field StaggeredGridLayoutManager$LazySpanLookup h>
	//  111  229:aload_0         
	//  112  230:getfield        #331 <Field StaggeredGridLayoutManager$SavedState A>
	//  113  233:getfield        #421 <Field int[] StaggeredGridLayoutManager$SavedState.f>
	//  114  236:putfield        #423 <Field int[] StaggeredGridLayoutManager$LazySpanLookup.a>
			h.b = A.g;
	//  115  239:aload_0         
	//  116  240:getfield        #81  <Field StaggeredGridLayoutManager$LazySpanLookup h>
	//  117  243:aload_0         
	//  118  244:getfield        #331 <Field StaggeredGridLayoutManager$SavedState A>
	//  119  247:getfield        #426 <Field List StaggeredGridLayoutManager$SavedState.g>
	//  120  250:putfield        #428 <Field List android.support.v7.widget.StaggeredGridLayoutManager$LazySpanLookup.b>
		}
	//  121  253:return          
	}

	private void a(b b1, int i1, int j1)
	{
		int k1 = b1.i();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #430 <Method int StaggeredGridLayoutManager$b.i()>
	//    2    4:istore          4
		if(i1 != -1 ? b1.d() - k1 >= j1 : b1.b() + k1 <= j1)
	//*   3    6:iload_2         
	//*   4    7:iconst_m1       
	//*   5    8:icmpne          25
	//*   6   11:aload_1         
	//*   7   12:invokevirtual   #432 <Method int android.support.v7.widget.StaggeredGridLayoutManager$b.b()>
	//*   8   15:iload           4
	//*   9   17:iadd            
	//*  10   18:iload_3         
	//*  11   19:icmpgt          48
	//*  12   22:goto            36
	//*  13   25:aload_1         
	//*  14   26:invokevirtual   #433 <Method int StaggeredGridLayoutManager$b.d()>
	//*  15   29:iload           4
	//*  16   31:isub            
	//*  17   32:iload_3         
	//*  18   33:icmplt          48
			m.set(b1.e, false);
	//   19   36:aload_0         
	//   20   37:getfield        #204 <Field BitSet m>
	//   21   40:aload_1         
	//   22   41:getfield        #195 <Field int StaggeredGridLayoutManager$b.e>
	//   23   44:iconst_0        
	//   24   45:invokevirtual   #305 <Method void BitSet.set(int, boolean)>
	//   25   48:return          
	}

	private void a(View view, int i1, int j1, boolean flag)
	{
		b(view, C);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_0         
	//    3    3:getfield        #88  <Field Rect C>
	//    4    6:invokevirtual   #437 <Method void b(View, Rect)>
		LayoutParams layoutparams = (LayoutParams)view.getLayoutParams();
	//    5    9:aload_1         
	//    6   10:invokevirtual   #166 <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//    7   13:checkcast       #8   <Class StaggeredGridLayoutManager$LayoutParams>
	//    8   16:astore          5
		i1 = b(i1, layoutparams.leftMargin + C.left, layoutparams.rightMargin + C.right);
	//    9   18:aload_0         
	//   10   19:iload_2         
	//   11   20:aload           5
	//   12   22:getfield        #440 <Field int StaggeredGridLayoutManager$LayoutParams.leftMargin>
	//   13   25:aload_0         
	//   14   26:getfield        #88  <Field Rect C>
	//   15   29:getfield        #443 <Field int Rect.left>
	//   16   32:iadd            
	//   17   33:aload           5
	//   18   35:getfield        #446 <Field int StaggeredGridLayoutManager$LayoutParams.rightMargin>
	//   19   38:aload_0         
	//   20   39:getfield        #88  <Field Rect C>
	//   21   42:getfield        #449 <Field int Rect.right>
	//   22   45:iadd            
	//   23   46:invokespecial   #452 <Method int b(int, int, int)>
	//   24   49:istore_2        
		j1 = b(j1, layoutparams.topMargin + C.top, layoutparams.bottomMargin + C.bottom);
	//   25   50:aload_0         
	//   26   51:iload_3         
	//   27   52:aload           5
	//   28   54:getfield        #455 <Field int StaggeredGridLayoutManager$LayoutParams.topMargin>
	//   29   57:aload_0         
	//   30   58:getfield        #88  <Field Rect C>
	//   31   61:getfield        #458 <Field int Rect.top>
	//   32   64:iadd            
	//   33   65:aload           5
	//   34   67:getfield        #461 <Field int StaggeredGridLayoutManager$LayoutParams.bottomMargin>
	//   35   70:aload_0         
	//   36   71:getfield        #88  <Field Rect C>
	//   37   74:getfield        #464 <Field int Rect.bottom>
	//   38   77:iadd            
	//   39   78:invokespecial   #452 <Method int b(int, int, int)>
	//   40   81:istore_3        
		if(flag)
	//*  41   82:iload           4
	//*  42   84:ifeq            101
			flag = a(view, i1, j1, ((RecyclerView.LayoutParams) (layoutparams)));
	//   43   87:aload_0         
	//   44   88:aload_1         
	//   45   89:iload_2         
	//   46   90:iload_3         
	//   47   91:aload           5
	//   48   93:invokevirtual   #467 <Method boolean a(View, int, int, RecyclerView$LayoutParams)>
	//   49   96:istore          4
		else
	//*  50   98:goto            112
			flag = b(view, i1, j1, ((RecyclerView.LayoutParams) (layoutparams)));
	//   51  101:aload_0         
	//   52  102:aload_1         
	//   53  103:iload_2         
	//   54  104:iload_3         
	//   55  105:aload           5
	//   56  107:invokevirtual   #469 <Method boolean b(View, int, int, RecyclerView$LayoutParams)>
	//   57  110:istore          4
		if(flag)
	//*  58  112:iload           4
	//*  59  114:ifeq            123
			view.measure(i1, j1);
	//   60  117:aload_1         
	//   61  118:iload_2         
	//   62  119:iload_3         
	//   63  120:invokevirtual   #472 <Method void View.measure(int, int)>
	//   64  123:return          
	}

	private void a(View view, LayoutParams layoutparams, ae ae1)
	{
		if(ae1.e == 1)
	//*   0    0:aload_3         
	//*   1    1:getfield        #213 <Field int ae.e>
	//*   2    4:iconst_1        
	//*   3    5:icmpne          30
			if(layoutparams.b)
	//*   4    8:aload_2         
	//*   5    9:getfield        #190 <Field boolean android.support.v7.widget.StaggeredGridLayoutManager$LayoutParams.b>
	//*   6   12:ifeq            21
			{
				p(view);
	//    7   15:aload_0         
	//    8   16:aload_1         
	//    9   17:invokespecial   #474 <Method void p(View)>
				return;
	//   10   20:return          
			} else
			{
				layoutparams.a.b(view);
	//   11   21:aload_2         
	//   12   22:getfield        #193 <Field StaggeredGridLayoutManager$b StaggeredGridLayoutManager$LayoutParams.a>
	//   13   25:aload_1         
	//   14   26:invokevirtual   #475 <Method void android.support.v7.widget.StaggeredGridLayoutManager$b.b(View)>
				return;
	//   15   29:return          
			}
		if(layoutparams.b)
	//*  16   30:aload_2         
	//*  17   31:getfield        #190 <Field boolean android.support.v7.widget.StaggeredGridLayoutManager$LayoutParams.b>
	//*  18   34:ifeq            43
		{
			q(view);
	//   19   37:aload_0         
	//   20   38:aload_1         
	//   21   39:invokespecial   #477 <Method void q(View)>
			return;
	//   22   42:return          
		} else
		{
			layoutparams.a.a(view);
	//   23   43:aload_2         
	//   24   44:getfield        #193 <Field StaggeredGridLayoutManager$b StaggeredGridLayoutManager$LayoutParams.a>
	//   25   47:aload_1         
	//   26   48:invokevirtual   #479 <Method void StaggeredGridLayoutManager$b.a(View)>
			return;
	//   27   51:return          
		}
	}

	private void a(View view, LayoutParams layoutparams, boolean flag)
	{
		if(!layoutparams.b) goto _L2; else goto _L1
	//    0    0:aload_2         
	//    1    1:getfield        #190 <Field boolean android.support.v7.widget.StaggeredGridLayoutManager$LayoutParams.b>
	//    2    4:ifeq            79
_L1:
		if(j != 1) goto _L4; else goto _L3
	//    3    7:aload_0         
	//    4    8:getfield        #102 <Field int j>
	//    5   11:iconst_1        
	//    6   12:icmpne          51
_L3:
		int i1 = B;
	//    7   15:aload_0         
	//    8   16:getfield        #481 <Field int B>
	//    9   19:istore          4
_L5:
		int j1 = a(y(), w(), 0, layoutparams.height, true);
	//   10   21:aload_0         
	//   11   22:invokevirtual   #484 <Method int y()>
	//   12   25:aload_0         
	//   13   26:invokevirtual   #487 <Method int w()>
	//   14   29:iconst_0        
	//   15   30:aload_2         
	//   16   31:getfield        #490 <Field int StaggeredGridLayoutManager$LayoutParams.height>
	//   17   34:iconst_1        
	//   18   35:invokestatic    #493 <Method int a(int, int, int, int, boolean)>
	//   19   38:istore          5
_L6:
		a(view, i1, j1, flag);
	//   20   40:aload_0         
	//   21   41:aload_1         
	//   22   42:iload           4
	//   23   44:iload           5
	//   24   46:iload_3         
	//   25   47:invokespecial   #495 <Method void a(View, int, int, boolean)>
		return;
	//   26   50:return          
_L4:
		a(view, a(x(), v(), 0, layoutparams.width, true), B, flag);
	//   27   51:aload_0         
	//   28   52:aload_1         
	//   29   53:aload_0         
	//   30   54:invokevirtual   #498 <Method int x()>
	//   31   57:aload_0         
	//   32   58:invokevirtual   #501 <Method int v()>
	//   33   61:iconst_0        
	//   34   62:aload_2         
	//   35   63:getfield        #504 <Field int StaggeredGridLayoutManager$LayoutParams.width>
	//   36   66:iconst_1        
	//   37   67:invokestatic    #493 <Method int a(int, int, int, int, boolean)>
	//   38   70:aload_0         
	//   39   71:getfield        #481 <Field int B>
	//   40   74:iload_3         
	//   41   75:invokespecial   #495 <Method void a(View, int, int, boolean)>
		return;
	//   42   78:return          
_L2:
label0:
		{
			if(j != 1)
				break label0;
	//   43   79:aload_0         
	//   44   80:getfield        #102 <Field int j>
	//   45   83:iconst_1        
	//   46   84:icmpne          109
			i1 = a(k, v(), 0, layoutparams.width, false);
	//   47   87:aload_0         
	//   48   88:getfield        #176 <Field int k>
	//   49   91:aload_0         
	//   50   92:invokevirtual   #501 <Method int v()>
	//   51   95:iconst_0        
	//   52   96:aload_2         
	//   53   97:getfield        #504 <Field int StaggeredGridLayoutManager$LayoutParams.width>
	//   54  100:iconst_0        
	//   55  101:invokestatic    #493 <Method int a(int, int, int, int, boolean)>
	//   56  104:istore          4
		}
		  goto _L5
	//*  57  106:goto            21
		i1 = a(x(), v(), 0, layoutparams.width, true);
	//   58  109:aload_0         
	//   59  110:invokevirtual   #498 <Method int x()>
	//   60  113:aload_0         
	//   61  114:invokevirtual   #501 <Method int v()>
	//   62  117:iconst_0        
	//   63  118:aload_2         
	//   64  119:getfield        #504 <Field int StaggeredGridLayoutManager$LayoutParams.width>
	//   65  122:iconst_1        
	//   66  123:invokestatic    #493 <Method int a(int, int, int, int, boolean)>
	//   67  126:istore          4
		j1 = a(k, w(), 0, layoutparams.height, false);
	//   68  128:aload_0         
	//   69  129:getfield        #176 <Field int k>
	//   70  132:aload_0         
	//   71  133:invokevirtual   #487 <Method int w()>
	//   72  136:iconst_0        
	//   73  137:aload_2         
	//   74  138:getfield        #490 <Field int StaggeredGridLayoutManager$LayoutParams.height>
	//   75  141:iconst_0        
	//   76  142:invokestatic    #493 <Method int a(int, int, int, int, boolean)>
	//   77  145:istore          5
		  goto _L6
	//*  78  147:goto            40
	}

	private boolean a(b b1)
	{
		if(e)
	//*   0    0:aload_0         
	//*   1    1:getfield        #73  <Field boolean e>
	//*   2    4:ifeq            50
		{
			if(b1.d() < b.d())
	//*   3    7:aload_1         
	//*   4    8:invokevirtual   #433 <Method int StaggeredGridLayoutManager$b.d()>
	//*   5   11:aload_0         
	//*   6   12:getfield        #140 <Field ah b>
	//*   7   15:invokevirtual   #221 <Method int ah.d()>
	//*   8   18:icmpge          85
				return b1.c((View)b1.a.get(b1.a.size() - 1)).b ^ true;
	//    9   21:aload_1         
	//   10   22:aload_1         
	//   11   23:getfield        #312 <Field ArrayList StaggeredGridLayoutManager$b.a>
	//   12   26:aload_1         
	//   13   27:getfield        #312 <Field ArrayList StaggeredGridLayoutManager$b.a>
	//   14   30:invokevirtual   #323 <Method int ArrayList.size()>
	//   15   33:iconst_1        
	//   16   34:isub            
	//   17   35:invokevirtual   #509 <Method Object ArrayList.get(int)>
	//   18   38:checkcast       #162 <Class View>
	//   19   41:invokevirtual   #512 <Method StaggeredGridLayoutManager$LayoutParams StaggeredGridLayoutManager$b.c(View)>
	//   20   44:getfield        #190 <Field boolean android.support.v7.widget.StaggeredGridLayoutManager$LayoutParams.b>
	//   21   47:iconst_1        
	//   22   48:ixor            
	//   23   49:ireturn         
		} else
		if(b1.b() > b.c())
	//*  24   50:aload_1         
	//*  25   51:invokevirtual   #432 <Method int android.support.v7.widget.StaggeredGridLayoutManager$b.b()>
	//*  26   54:aload_0         
	//*  27   55:getfield        #140 <Field ah b>
	//*  28   58:invokevirtual   #223 <Method int ah.c()>
	//*  29   61:icmple          85
			return b1.c((View)b1.a.get(0)).b ^ true;
	//   30   64:aload_1         
	//   31   65:aload_1         
	//   32   66:getfield        #312 <Field ArrayList StaggeredGridLayoutManager$b.a>
	//   33   69:iconst_0        
	//   34   70:invokevirtual   #509 <Method Object ArrayList.get(int)>
	//   35   73:checkcast       #162 <Class View>
	//   36   76:invokevirtual   #512 <Method StaggeredGridLayoutManager$LayoutParams StaggeredGridLayoutManager$b.c(View)>
	//   37   79:getfield        #190 <Field boolean android.support.v7.widget.StaggeredGridLayoutManager$LayoutParams.b>
	//   38   82:iconst_1        
	//   39   83:ixor            
	//   40   84:ireturn         
		return false;
	//   41   85:iconst_0        
	//   42   86:ireturn         
	}

	private int b(int i1, int j1, int k1)
	{
		if(j1 == 0 && k1 == 0)
	//*   0    0:iload_2         
	//*   1    1:ifne            10
	//*   2    4:iload_3         
	//*   3    5:ifne            10
			return i1;
	//    4    8:iload_1         
	//    5    9:ireturn         
		int l1 = android.view.View.MeasureSpec.getMode(i1);
	//    6   10:iload_1         
	//    7   11:invokestatic    #517 <Method int android.view.View$MeasureSpec.getMode(int)>
	//    8   14:istore          4
		if(l1 != 0x80000000 && l1 != 0x40000000)
	//*   9   16:iload           4
	//*  10   18:ldc1            #76  <Int 0x80000000>
	//*  11   20:icmpeq          35
	//*  12   23:iload           4
	//*  13   25:ldc1            #151 <Int 0x40000000>
	//*  14   27:icmpne          33
	//*  15   30:goto            35
			return i1;
	//   16   33:iload_1         
	//   17   34:ireturn         
		else
			return android.view.View.MeasureSpec.makeMeasureSpec(Math.max(0, android.view.View.MeasureSpec.getSize(i1) - j1 - k1), l1);
	//   18   35:iconst_0        
	//   19   36:iload_1         
	//   20   37:invokestatic    #520 <Method int android.view.View$MeasureSpec.getSize(int)>
	//   21   40:iload_2         
	//   22   41:isub            
	//   23   42:iload_3         
	//   24   43:isub            
	//   25   44:invokestatic    #522 <Method int Math.max(int, int)>
	//   26   47:iload           4
	//   27   49:invokestatic    #525 <Method int android.view.View$MeasureSpec.makeMeasureSpec(int, int)>
	//   28   52:ireturn         
	}

	private int b(RecyclerView.r r1)
	{
		if(u() == 0)
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #154 <Method int u()>
	//*   2    4:ifne            9
			return 0;
	//    3    7:iconst_0        
	//    4    8:ireturn         
		else
			return an.a(r1, b, b(F ^ true), d(F ^ true), ((RecyclerView.h) (this)), F, e);
	//    5    9:aload_1         
	//    6   10:aload_0         
	//    7   11:getfield        #140 <Field ah b>
	//    8   14:aload_0         
	//    9   15:aload_0         
	//   10   16:getfield        #97  <Field boolean F>
	//   11   19:iconst_1        
	//   12   20:ixor            
	//   13   21:invokevirtual   #529 <Method View b(boolean)>
	//   14   24:aload_0         
	//   15   25:aload_0         
	//   16   26:getfield        #97  <Field boolean F>
	//   17   29:iconst_1        
	//   18   30:ixor            
	//   19   31:invokevirtual   #531 <Method View d(boolean)>
	//   20   34:aload_0         
	//   21   35:aload_0         
	//   22   36:getfield        #97  <Field boolean F>
	//   23   39:aload_0         
	//   24   40:getfield        #73  <Field boolean e>
	//   25   43:invokestatic    #536 <Method int an.a(RecyclerView$r, ah, View, View, RecyclerView$h, boolean, boolean)>
	//   26   46:ireturn         
	}

	private void b(int i1, RecyclerView.r r1)
	{
		int j1;
		boolean flag2;
label0:
		{
label1:
			{
				ae ae1 = l;
	//    0    0:aload_0         
	//    1    1:getfield        #113 <Field ae l>
	//    2    4:astore          7
				flag2 = false;
	//    3    6:iconst_0        
	//    4    7:istore          5
				ae1.b = 0;
	//    5    9:aload           7
	//    6   11:iconst_0        
	//    7   12:putfield        #216 <Field int android.support.v7.widget.ae.b>
				l.c = i1;
	//    8   15:aload_0         
	//    9   16:getfield        #113 <Field ae l>
	//   10   19:iload_1         
	//   11   20:putfield        #384 <Field int ae.c>
				if(r())
	//*  12   23:aload_0         
	//*  13   24:invokevirtual   #538 <Method boolean r()>
	//*  14   27:ifeq            91
				{
					j1 = r1.c();
	//   15   30:aload_2         
	//   16   31:invokevirtual   #539 <Method int RecyclerView$r.c()>
	//   17   34:istore_3        
					if(j1 != -1)
	//*  18   35:iload_3         
	//*  19   36:iconst_m1       
	//*  20   37:icmpeq          91
					{
						boolean flag3 = e;
	//   21   40:aload_0         
	//   22   41:getfield        #73  <Field boolean e>
	//   23   44:istore          6
						boolean flag;
						if(j1 < i1)
	//*  24   46:iload_3         
	//*  25   47:iload_1         
	//*  26   48:icmpge          57
							flag = true;
	//   27   51:iconst_1        
	//   28   52:istore          4
						else
	//*  29   54:goto            60
							flag = false;
	//   30   57:iconst_0        
	//   31   58:istore          4
						if(flag3 == flag)
	//*  32   60:iload           6
	//*  33   62:iload           4
	//*  34   64:icmpne          80
						{
							j1 = b.f();
	//   35   67:aload_0         
	//   36   68:getfield        #140 <Field ah b>
	//   37   71:invokevirtual   #182 <Method int ah.f()>
	//   38   74:istore_3        
							i1 = 0;
	//   39   75:iconst_0        
	//   40   76:istore_1        
							break label0;
	//   41   77:goto            95
						}
						i1 = b.f();
	//   42   80:aload_0         
	//   43   81:getfield        #140 <Field ah b>
	//   44   84:invokevirtual   #182 <Method int ah.f()>
	//   45   87:istore_1        
						break label1;
	//   46   88:goto            93
					}
				}
				i1 = 0;
	//   47   91:iconst_0        
	//   48   92:istore_1        
			}
			j1 = 0;
	//   49   93:iconst_0        
	//   50   94:istore_3        
		}
		if(q())
	//*  51   95:aload_0         
	//*  52   96:invokevirtual   #541 <Method boolean q()>
	//*  53   99:ifeq            137
		{
			l.f = b.c() - i1;
	//   54  102:aload_0         
	//   55  103:getfield        #113 <Field ae l>
	//   56  106:aload_0         
	//   57  107:getfield        #140 <Field ah b>
	//   58  110:invokevirtual   #223 <Method int ah.c()>
	//   59  113:iload_1         
	//   60  114:isub            
	//   61  115:putfield        #217 <Field int ae.f>
			l.g = b.d() + j1;
	//   62  118:aload_0         
	//   63  119:getfield        #113 <Field ae l>
	//   64  122:aload_0         
	//   65  123:getfield        #140 <Field ah b>
	//   66  126:invokevirtual   #221 <Method int ah.d()>
	//   67  129:iload_3         
	//   68  130:iadd            
	//   69  131:putfield        #215 <Field int ae.g>
		} else
	//*  70  134:goto            162
		{
			l.g = b.e() + j1;
	//   71  137:aload_0         
	//   72  138:getfield        #113 <Field ae l>
	//   73  141:aload_0         
	//   74  142:getfield        #140 <Field ah b>
	//   75  145:invokevirtual   #542 <Method int ah.e()>
	//   76  148:iload_3         
	//   77  149:iadd            
	//   78  150:putfield        #215 <Field int ae.g>
			l.f = -i1;
	//   79  153:aload_0         
	//   80  154:getfield        #113 <Field ae l>
	//   81  157:iload_1         
	//   82  158:ineg            
	//   83  159:putfield        #217 <Field int ae.f>
		}
		l.h = false;
	//   84  162:aload_0         
	//   85  163:getfield        #113 <Field ae l>
	//   86  166:iconst_0        
	//   87  167:putfield        #296 <Field boolean ae.h>
		l.a = true;
	//   88  170:aload_0         
	//   89  171:getfield        #113 <Field ae l>
	//   90  174:iconst_1        
	//   91  175:putfield        #375 <Field boolean ae.a>
		r1 = ((RecyclerView.r) (l));
	//   92  178:aload_0         
	//   93  179:getfield        #113 <Field ae l>
	//   94  182:astore_2        
		boolean flag1 = flag2;
	//   95  183:iload           5
	//   96  185:istore          4
		if(b.h() == 0)
	//*  97  187:aload_0         
	//*  98  188:getfield        #140 <Field ah b>
	//*  99  191:invokevirtual   #150 <Method int ah.h()>
	//* 100  194:ifne            214
		{
			flag1 = flag2;
	//  101  197:iload           5
	//  102  199:istore          4
			if(b.e() == 0)
	//* 103  201:aload_0         
	//* 104  202:getfield        #140 <Field ah b>
	//* 105  205:invokevirtual   #542 <Method int ah.e()>
	//* 106  208:ifne            214
				flag1 = true;
	//  107  211:iconst_1        
	//  108  212:istore          4
		}
		r1.i = flag1;
	//  109  214:aload_2         
	//  110  215:iload           4
	//  111  217:putfield        #212 <Field boolean ae.i>
	//  112  220:return          
	}

	private void b(RecyclerView.n n1, int i1)
	{
		int j1 = u() - 1;
	//    0    0:aload_0         
	//    1    1:invokevirtual   #154 <Method int u()>
	//    2    4:iconst_1        
	//    3    5:isub            
	//    4    6:istore_3        
		do
		{
			if(j1 < 0)
				break;
	//    5    7:iload_3         
	//    6    8:iflt            174
			View view = h(j1);
	//    7   11:aload_0         
	//    8   12:iload_3         
	//    9   13:invokevirtual   #157 <Method View h(int)>
	//   10   16:astore          7
			if(b.a(view) < i1 || b.d(view) < i1)
				break;
	//   11   18:aload_0         
	//   12   19:getfield        #140 <Field ah b>
	//   13   22:aload           7
	//   14   24:invokevirtual   #544 <Method int ah.a(View)>
	//   15   27:iload_2         
	//   16   28:icmplt          174
	//   17   31:aload_0         
	//   18   32:getfield        #140 <Field ah b>
	//   19   35:aload           7
	//   20   37:invokevirtual   #546 <Method int ah.d(View)>
	//   21   40:iload_2         
	//   22   41:icmplt          174
			LayoutParams layoutparams = (LayoutParams)view.getLayoutParams();
	//   23   44:aload           7
	//   24   46:invokevirtual   #166 <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//   25   49:checkcast       #8   <Class StaggeredGridLayoutManager$LayoutParams>
	//   26   52:astore          8
			if(layoutparams.b)
	//*  27   54:aload           8
	//*  28   56:getfield        #190 <Field boolean android.support.v7.widget.StaggeredGridLayoutManager$LayoutParams.b>
	//*  29   59:ifeq            136
			{
				boolean flag = false;
	//   30   62:iconst_0        
	//   31   63:istore          6
				int k1 = 0;
	//   32   65:iconst_0        
	//   33   66:istore          4
				int l1;
				do
				{
					l1 = ((int) (flag));
	//   34   68:iload           6
	//   35   70:istore          5
					if(k1 >= i)
						break;
	//   36   72:iload           4
	//   37   74:aload_0         
	//   38   75:getfield        #69  <Field int i>
	//   39   78:icmpge          108
					if(a[k1].a.size() == 1)
	//*  40   81:aload_0         
	//*  41   82:getfield        #238 <Field StaggeredGridLayoutManager$b[] a>
	//*  42   85:iload           4
	//*  43   87:aaload          
	//*  44   88:getfield        #312 <Field ArrayList StaggeredGridLayoutManager$b.a>
	//*  45   91:invokevirtual   #323 <Method int ArrayList.size()>
	//*  46   94:iconst_1        
	//*  47   95:icmpne          99
						return;
	//   48   98:return          
					k1++;
	//   49   99:iload           4
	//   50  101:iconst_1        
	//   51  102:iadd            
	//   52  103:istore          4
				} while(true);
	//   53  105:goto            68
				for(; l1 < i; l1++)
	//*  54  108:iload           5
	//*  55  110:aload_0         
	//*  56  111:getfield        #69  <Field int i>
	//*  57  114:icmpge          160
					a[l1].g();
	//   58  117:aload_0         
	//   59  118:getfield        #238 <Field StaggeredGridLayoutManager$b[] a>
	//   60  121:iload           5
	//   61  123:aaload          
	//   62  124:invokevirtual   #548 <Method void StaggeredGridLayoutManager$b.g()>

	//   63  127:iload           5
	//   64  129:iconst_1        
	//   65  130:iadd            
	//   66  131:istore          5
			} else
	//*  67  133:goto            108
			{
				if(layoutparams.a.a.size() == 1)
	//*  68  136:aload           8
	//*  69  138:getfield        #193 <Field StaggeredGridLayoutManager$b StaggeredGridLayoutManager$LayoutParams.a>
	//*  70  141:getfield        #312 <Field ArrayList StaggeredGridLayoutManager$b.a>
	//*  71  144:invokevirtual   #323 <Method int ArrayList.size()>
	//*  72  147:iconst_1        
	//*  73  148:icmpne          152
					return;
	//   74  151:return          
				layoutparams.a.g();
	//   75  152:aload           8
	//   76  154:getfield        #193 <Field StaggeredGridLayoutManager$b StaggeredGridLayoutManager$LayoutParams.a>
	//   77  157:invokevirtual   #548 <Method void StaggeredGridLayoutManager$b.g()>
			}
			a(view, n1);
	//   78  160:aload_0         
	//   79  161:aload           7
	//   80  163:aload_1         
	//   81  164:invokevirtual   #328 <Method void a(View, RecyclerView$n)>
			j1--;
	//   82  167:iload_3         
	//   83  168:iconst_1        
	//   84  169:isub            
	//   85  170:istore_3        
		} while(true);
	//   86  171:goto            7
	//   87  174:return          
	}

	private void b(RecyclerView.n n1, RecyclerView.r r1, boolean flag)
	{
		int i1 = q(0x80000000);
	//    0    0:aload_0         
	//    1    1:ldc1            #76  <Int 0x80000000>
	//    2    3:invokespecial   #256 <Method int q(int)>
	//    3    6:istore          4
		if(i1 == 0x80000000)
	//*   4    8:iload           4
	//*   5   10:ldc1            #76  <Int 0x80000000>
	//*   6   12:icmpne          16
			return;
	//    7   15:return          
		i1 = b.d() - i1;
	//    8   16:aload_0         
	//    9   17:getfield        #140 <Field ah b>
	//   10   20:invokevirtual   #221 <Method int ah.d()>
	//   11   23:iload           4
	//   12   25:isub            
	//   13   26:istore          4
		if(i1 > 0)
	//*  14   28:iload           4
	//*  15   30:ifle            66
		{
			i1 -= -c(-i1, n1, r1);
	//   16   33:iload           4
	//   17   35:aload_0         
	//   18   36:iload           4
	//   19   38:ineg            
	//   20   39:aload_1         
	//   21   40:aload_2         
	//   22   41:invokevirtual   #551 <Method int c(int, RecyclerView$n, RecyclerView$r)>
	//   23   44:ineg            
	//   24   45:isub            
	//   25   46:istore          4
			if(flag && i1 > 0)
	//*  26   48:iload_3         
	//*  27   49:ifeq            66
	//*  28   52:iload           4
	//*  29   54:ifle            66
				b.a(i1);
	//   30   57:aload_0         
	//   31   58:getfield        #140 <Field ah b>
	//   32   61:iload           4
	//   33   63:invokevirtual   #552 <Method void ah.a(int)>
		}
	//   34   66:return          
	}

	private void c(int i1, int j1, int k1)
	{
		int l1;
		int i2;
		int j2;
label0:
		{
			if(e)
	//*   0    0:aload_0         
	//*   1    1:getfield        #73  <Field boolean e>
	//*   2    4:ifeq            16
				i2 = J();
	//    3    7:aload_0         
	//    4    8:invokevirtual   #556 <Method int J()>
	//    5   11:istore          5
			else
	//*   6   13:goto            22
				i2 = K();
	//    7   16:aload_0         
	//    8   17:invokevirtual   #559 <Method int K()>
	//    9   20:istore          5
			if(k1 == 8)
	//*  10   22:iload_3         
	//*  11   23:bipush          8
	//*  12   25:icmpne          52
			{
				if(i1 < j1)
	//*  13   28:iload_1         
	//*  14   29:iload_2         
	//*  15   30:icmpge          41
				{
					l1 = j1 + 1;
	//   16   33:iload_2         
	//   17   34:iconst_1        
	//   18   35:iadd            
	//   19   36:istore          4
				} else
	//*  20   38:goto            57
				{
					j2 = i1 + 1;
	//   21   41:iload_1         
	//   22   42:iconst_1        
	//   23   43:iadd            
	//   24   44:istore          6
					l1 = j1;
	//   25   46:iload_2         
	//   26   47:istore          4
					break label0;
	//   27   49:goto            64
				}
			} else
			{
				l1 = i1 + j1;
	//   28   52:iload_1         
	//   29   53:iload_2         
	//   30   54:iadd            
	//   31   55:istore          4
			}
			j2 = l1;
	//   32   57:iload           4
	//   33   59:istore          6
			l1 = i1;
	//   34   61:iload_1         
	//   35   62:istore          4
		}
		h.b(l1);
	//   36   64:aload_0         
	//   37   65:getfield        #81  <Field StaggeredGridLayoutManager$LazySpanLookup h>
	//   38   68:iload           4
	//   39   70:invokevirtual   #560 <Method int android.support.v7.widget.StaggeredGridLayoutManager$LazySpanLookup.b(int)>
	//   40   73:pop             
		if(k1 != 8)
	//*  41   74:iload_3         
	//*  42   75:bipush          8
	//*  43   77:icmpeq          131
		{
			switch(k1)
	//*  44   80:iload_3         
			{
	//*  45   81:tableswitch     1 2: default 104
	//	               1 119
	//	               2 107
	//*  46  104:goto            149
			case 2: // '\002'
				h.a(i1, j1);
	//   47  107:aload_0         
	//   48  108:getfield        #81  <Field StaggeredGridLayoutManager$LazySpanLookup h>
	//   49  111:iload_1         
	//   50  112:iload_2         
	//   51  113:invokevirtual   #561 <Method void StaggeredGridLayoutManager$LazySpanLookup.a(int, int)>
				break;

	//*  52  116:goto            149
			case 1: // '\001'
				h.b(i1, j1);
	//   53  119:aload_0         
	//   54  120:getfield        #81  <Field StaggeredGridLayoutManager$LazySpanLookup h>
	//   55  123:iload_1         
	//   56  124:iload_2         
	//   57  125:invokevirtual   #563 <Method void android.support.v7.widget.StaggeredGridLayoutManager$LazySpanLookup.b(int, int)>
				break;
			}
		} else
	//*  58  128:goto            149
		{
			h.a(i1, 1);
	//   59  131:aload_0         
	//   60  132:getfield        #81  <Field StaggeredGridLayoutManager$LazySpanLookup h>
	//   61  135:iload_1         
	//   62  136:iconst_1        
	//   63  137:invokevirtual   #561 <Method void StaggeredGridLayoutManager$LazySpanLookup.a(int, int)>
			h.b(j1, 1);
	//   64  140:aload_0         
	//   65  141:getfield        #81  <Field StaggeredGridLayoutManager$LazySpanLookup h>
	//   66  144:iload_2         
	//   67  145:iconst_1        
	//   68  146:invokevirtual   #563 <Method void android.support.v7.widget.StaggeredGridLayoutManager$LazySpanLookup.b(int, int)>
		}
		if(j2 <= i2)
	//*  69  149:iload           6
	//*  70  151:iload           5
	//*  71  153:icmpgt          157
			return;
	//   72  156:return          
		if(e)
	//*  73  157:aload_0         
	//*  74  158:getfield        #73  <Field boolean e>
	//*  75  161:ifeq            172
			i1 = K();
	//   76  164:aload_0         
	//   77  165:invokevirtual   #559 <Method int K()>
	//   78  168:istore_1        
		else
	//*  79  169:goto            177
			i1 = J();
	//   80  172:aload_0         
	//   81  173:invokevirtual   #556 <Method int J()>
	//   82  176:istore_1        
		if(l1 <= i1)
	//*  83  177:iload           4
	//*  84  179:iload_1         
	//*  85  180:icmpgt          187
			n();
	//   86  183:aload_0         
	//   87  184:invokevirtual   #565 <Method void n()>
	//   88  187:return          
	}

	private void c(RecyclerView.n n1, RecyclerView.r r1, boolean flag)
	{
		int i1 = p(0x7fffffff);
	//    0    0:aload_0         
	//    1    1:ldc1            #214 <Int 0x7fffffff>
	//    2    3:invokespecial   #269 <Method int p(int)>
	//    3    6:istore          4
		if(i1 == 0x7fffffff)
	//*   4    8:iload           4
	//*   5   10:ldc1            #214 <Int 0x7fffffff>
	//*   6   12:icmpne          16
			return;
	//    7   15:return          
		i1 -= b.c();
	//    8   16:iload           4
	//    9   18:aload_0         
	//   10   19:getfield        #140 <Field ah b>
	//   11   22:invokevirtual   #223 <Method int ah.c()>
	//   12   25:isub            
	//   13   26:istore          4
		if(i1 > 0)
	//*  14   28:iload           4
	//*  15   30:ifle            65
		{
			i1 -= c(i1, n1, r1);
	//   16   33:iload           4
	//   17   35:aload_0         
	//   18   36:iload           4
	//   19   38:aload_1         
	//   20   39:aload_2         
	//   21   40:invokevirtual   #551 <Method int c(int, RecyclerView$n, RecyclerView$r)>
	//   22   43:isub            
	//   23   44:istore          4
			if(flag && i1 > 0)
	//*  24   46:iload_3         
	//*  25   47:ifeq            65
	//*  26   50:iload           4
	//*  27   52:ifle            65
				b.a(-i1);
	//   28   55:aload_0         
	//   29   56:getfield        #140 <Field ah b>
	//   30   59:iload           4
	//   31   61:ineg            
	//   32   62:invokevirtual   #552 <Method void ah.a(int)>
		}
	//   33   65:return          
	}

	private boolean c(RecyclerView.r r1, a a1)
	{
		int i1;
		if(o)
	//*   0    0:aload_0         
	//*   1    1:getfield        #352 <Field boolean o>
	//*   2    4:ifeq            19
			i1 = v(r1.e());
	//    3    7:aload_0         
	//    4    8:aload_1         
	//    5    9:invokevirtual   #335 <Method int RecyclerView$r.e()>
	//    6   12:invokespecial   #568 <Method int v(int)>
	//    7   15:istore_3        
		else
	//*   8   16:goto            28
			i1 = u(r1.e());
	//    9   19:aload_0         
	//   10   20:aload_1         
	//   11   21:invokevirtual   #335 <Method int RecyclerView$r.e()>
	//   12   24:invokespecial   #570 <Method int u(int)>
	//   13   27:istore_3        
		a1.a = i1;
	//   14   28:aload_2         
	//   15   29:iload_3         
	//   16   30:putfield        #376 <Field int StaggeredGridLayoutManager$a.a>
		a1.b = 0x80000000;
	//   17   33:aload_2         
	//   18   34:ldc1            #76  <Int 0x80000000>
	//   19   36:putfield        #361 <Field int android.support.v7.widget.StaggeredGridLayoutManager$a.b>
		return true;
	//   20   39:iconst_1        
	//   21   40:ireturn         
	}

	private int i(RecyclerView.r r1)
	{
		if(u() == 0)
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #154 <Method int u()>
	//*   2    4:ifne            9
			return 0;
	//    3    7:iconst_0        
	//    4    8:ireturn         
		else
			return an.a(r1, b, b(F ^ true), d(F ^ true), ((RecyclerView.h) (this)), F);
	//    5    9:aload_1         
	//    6   10:aload_0         
	//    7   11:getfield        #140 <Field ah b>
	//    8   14:aload_0         
	//    9   15:aload_0         
	//   10   16:getfield        #97  <Field boolean F>
	//   11   19:iconst_1        
	//   12   20:ixor            
	//   13   21:invokevirtual   #529 <Method View b(boolean)>
	//   14   24:aload_0         
	//   15   25:aload_0         
	//   16   26:getfield        #97  <Field boolean F>
	//   17   29:iconst_1        
	//   18   30:ixor            
	//   19   31:invokevirtual   #531 <Method View d(boolean)>
	//   20   34:aload_0         
	//   21   35:aload_0         
	//   22   36:getfield        #97  <Field boolean F>
	//   23   39:invokestatic    #573 <Method int an.a(RecyclerView$r, ah, View, View, RecyclerView$h, boolean)>
	//   24   42:ireturn         
	}

	private int j(RecyclerView.r r1)
	{
		if(u() == 0)
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #154 <Method int u()>
	//*   2    4:ifne            9
			return 0;
	//    3    7:iconst_0        
	//    4    8:ireturn         
		else
			return android.support.v7.widget.an.b(r1, b, b(F ^ true), d(F ^ true), ((RecyclerView.h) (this)), F);
	//    5    9:aload_1         
	//    6   10:aload_0         
	//    7   11:getfield        #140 <Field ah b>
	//    8   14:aload_0         
	//    9   15:aload_0         
	//   10   16:getfield        #97  <Field boolean F>
	//   11   19:iconst_1        
	//   12   20:ixor            
	//   13   21:invokevirtual   #529 <Method View b(boolean)>
	//   14   24:aload_0         
	//   15   25:aload_0         
	//   16   26:getfield        #97  <Field boolean F>
	//   17   29:iconst_1        
	//   18   30:ixor            
	//   19   31:invokevirtual   #531 <Method View d(boolean)>
	//   20   34:aload_0         
	//   21   35:aload_0         
	//   22   36:getfield        #97  <Field boolean F>
	//   23   39:invokestatic    #575 <Method int android.support.v7.widget.an.b(RecyclerView$r, ah, View, View, RecyclerView$h, boolean)>
	//   24   42:ireturn         
	}

	private void l(int i1)
	{
		l.e = i1;
	//    0    0:aload_0         
	//    1    1:getfield        #113 <Field ae l>
	//    2    4:iload_1         
	//    3    5:putfield        #213 <Field int ae.e>
		ae ae1 = l;
	//    4    8:aload_0         
	//    5    9:getfield        #113 <Field ae l>
	//    6   12:astore          5
		boolean flag2 = e;
	//    7   14:aload_0         
	//    8   15:getfield        #73  <Field boolean e>
	//    9   18:istore          4
		boolean flag = true;
	//   10   20:iconst_1        
	//   11   21:istore_2        
		boolean flag1;
		if(i1 == -1)
	//*  12   22:iload_1         
	//*  13   23:iconst_m1       
	//*  14   24:icmpne          32
			flag1 = true;
	//   15   27:iconst_1        
	//   16   28:istore_3        
		else
	//*  17   29:goto            34
			flag1 = false;
	//   18   32:iconst_0        
	//   19   33:istore_3        
		if(flag2 == flag1)
	//*  20   34:iload           4
	//*  21   36:iload_3         
	//*  22   37:icmpne          45
			i1 = ((int) (flag));
	//   23   40:iload_2         
	//   24   41:istore_1        
		else
	//*  25   42:goto            47
			i1 = -1;
	//   26   45:iconst_m1       
	//   27   46:istore_1        
		ae1.d = i1;
	//   28   47:aload           5
	//   29   49:iload_1         
	//   30   50:putfield        #275 <Field int ae.d>
	//   31   53:return          
	}

	private LazySpanLookup.FullSpanItem m(int i1)
	{
		LazySpanLookup.FullSpanItem fullspanitem = new LazySpanLookup.FullSpanItem();
	//    0    0:new             #14  <Class StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem>
	//    1    3:dup             
	//    2    4:invokespecial   #576 <Method void StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem()>
	//    3    7:astore_3        
		fullspanitem.c = new int[i];
	//    4    8:aload_3         
	//    5    9:aload_0         
	//    6   10:getfield        #69  <Field int i>
	//    7   13:newarray        int[]
	//    8   15:putfield        #578 <Field int[] StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem.c>
		for(int j1 = 0; j1 < i; j1++)
	//*   9   18:iconst_0        
	//*  10   19:istore_2        
	//*  11   20:iload_2         
	//*  12   21:aload_0         
	//*  13   22:getfield        #69  <Field int i>
	//*  14   25:icmpge          53
			fullspanitem.c[j1] = i1 - a[j1].b(i1);
	//   15   28:aload_3         
	//   16   29:getfield        #578 <Field int[] StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem.c>
	//   17   32:iload_2         
	//   18   33:iload_1         
	//   19   34:aload_0         
	//   20   35:getfield        #238 <Field StaggeredGridLayoutManager$b[] a>
	//   21   38:iload_2         
	//   22   39:aaload          
	//   23   40:iload_1         
	//   24   41:invokevirtual   #258 <Method int android.support.v7.widget.StaggeredGridLayoutManager$b.b(int)>
	//   25   44:isub            
	//   26   45:iastore         

	//   27   46:iload_2         
	//   28   47:iconst_1        
	//   29   48:iadd            
	//   30   49:istore_2        
	//*  31   50:goto            20
		return fullspanitem;
	//   32   53:aload_3         
	//   33   54:areturn         
	}

	private LazySpanLookup.FullSpanItem n(int i1)
	{
		LazySpanLookup.FullSpanItem fullspanitem = new LazySpanLookup.FullSpanItem();
	//    0    0:new             #14  <Class StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem>
	//    1    3:dup             
	//    2    4:invokespecial   #576 <Method void StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem()>
	//    3    7:astore_3        
		fullspanitem.c = new int[i];
	//    4    8:aload_3         
	//    5    9:aload_0         
	//    6   10:getfield        #69  <Field int i>
	//    7   13:newarray        int[]
	//    8   15:putfield        #578 <Field int[] StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem.c>
		for(int j1 = 0; j1 < i; j1++)
	//*   9   18:iconst_0        
	//*  10   19:istore_2        
	//*  11   20:iload_2         
	//*  12   21:aload_0         
	//*  13   22:getfield        #69  <Field int i>
	//*  14   25:icmpge          53
			fullspanitem.c[j1] = a[j1].a(i1) - i1;
	//   15   28:aload_3         
	//   16   29:getfield        #578 <Field int[] StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem.c>
	//   17   32:iload_2         
	//   18   33:aload_0         
	//   19   34:getfield        #238 <Field StaggeredGridLayoutManager$b[] a>
	//   20   37:iload_2         
	//   21   38:aaload          
	//   22   39:iload_1         
	//   23   40:invokevirtual   #271 <Method int StaggeredGridLayoutManager$b.a(int)>
	//   24   43:iload_1         
	//   25   44:isub            
	//   26   45:iastore         

	//   27   46:iload_2         
	//   28   47:iconst_1        
	//   29   48:iadd            
	//   30   49:istore_2        
	//*  31   50:goto            20
		return fullspanitem;
	//   32   53:aload_3         
	//   33   54:areturn         
	}

	private int o(int i1)
	{
		int k1 = a[0].a(i1);
	//    0    0:aload_0         
	//    1    1:getfield        #238 <Field StaggeredGridLayoutManager$b[] a>
	//    2    4:iconst_0        
	//    3    5:aaload          
	//    4    6:iload_1         
	//    5    7:invokevirtual   #271 <Method int StaggeredGridLayoutManager$b.a(int)>
	//    6   10:istore_3        
		for(int j1 = 1; j1 < i;)
	//*   7   11:iconst_1        
	//*   8   12:istore_2        
	//*   9   13:iload_2         
	//*  10   14:aload_0         
	//*  11   15:getfield        #69  <Field int i>
	//*  12   18:icmpge          56
		{
			int i2 = a[j1].a(i1);
	//   13   21:aload_0         
	//   14   22:getfield        #238 <Field StaggeredGridLayoutManager$b[] a>
	//   15   25:iload_2         
	//   16   26:aaload          
	//   17   27:iload_1         
	//   18   28:invokevirtual   #271 <Method int StaggeredGridLayoutManager$b.a(int)>
	//   19   31:istore          5
			int l1 = k1;
	//   20   33:iload_3         
	//   21   34:istore          4
			if(i2 > k1)
	//*  22   36:iload           5
	//*  23   38:iload_3         
	//*  24   39:icmple          46
				l1 = i2;
	//   25   42:iload           5
	//   26   44:istore          4
			j1++;
	//   27   46:iload_2         
	//   28   47:iconst_1        
	//   29   48:iadd            
	//   30   49:istore_2        
			k1 = l1;
	//   31   50:iload           4
	//   32   52:istore_3        
		}

	//*  33   53:goto            13
		return k1;
	//   34   56:iload_3         
	//   35   57:ireturn         
	}

	private int p(int i1)
	{
		int k1 = a[0].a(i1);
	//    0    0:aload_0         
	//    1    1:getfield        #238 <Field StaggeredGridLayoutManager$b[] a>
	//    2    4:iconst_0        
	//    3    5:aaload          
	//    4    6:iload_1         
	//    5    7:invokevirtual   #271 <Method int StaggeredGridLayoutManager$b.a(int)>
	//    6   10:istore_3        
		for(int j1 = 1; j1 < i;)
	//*   7   11:iconst_1        
	//*   8   12:istore_2        
	//*   9   13:iload_2         
	//*  10   14:aload_0         
	//*  11   15:getfield        #69  <Field int i>
	//*  12   18:icmpge          56
		{
			int i2 = a[j1].a(i1);
	//   13   21:aload_0         
	//   14   22:getfield        #238 <Field StaggeredGridLayoutManager$b[] a>
	//   15   25:iload_2         
	//   16   26:aaload          
	//   17   27:iload_1         
	//   18   28:invokevirtual   #271 <Method int StaggeredGridLayoutManager$b.a(int)>
	//   19   31:istore          5
			int l1 = k1;
	//   20   33:iload_3         
	//   21   34:istore          4
			if(i2 < k1)
	//*  22   36:iload           5
	//*  23   38:iload_3         
	//*  24   39:icmpge          46
				l1 = i2;
	//   25   42:iload           5
	//   26   44:istore          4
			j1++;
	//   27   46:iload_2         
	//   28   47:iconst_1        
	//   29   48:iadd            
	//   30   49:istore_2        
			k1 = l1;
	//   31   50:iload           4
	//   32   52:istore_3        
		}

	//*  33   53:goto            13
		return k1;
	//   34   56:iload_3         
	//   35   57:ireturn         
	}

	private void p(View view)
	{
		for(int i1 = i - 1; i1 >= 0; i1--)
	//*   0    0:aload_0         
	//*   1    1:getfield        #69  <Field int i>
	//*   2    4:iconst_1        
	//*   3    5:isub            
	//*   4    6:istore_2        
	//*   5    7:iload_2         
	//*   6    8:iflt            28
			a[i1].b(view);
	//    7   11:aload_0         
	//    8   12:getfield        #238 <Field StaggeredGridLayoutManager$b[] a>
	//    9   15:iload_2         
	//   10   16:aaload          
	//   11   17:aload_1         
	//   12   18:invokevirtual   #475 <Method void android.support.v7.widget.StaggeredGridLayoutManager$b.b(View)>

	//   13   21:iload_2         
	//   14   22:iconst_1        
	//   15   23:isub            
	//   16   24:istore_2        
	//*  17   25:goto            7
	//   18   28:return          
	}

	private int q(int i1)
	{
		int k1 = a[0].b(i1);
	//    0    0:aload_0         
	//    1    1:getfield        #238 <Field StaggeredGridLayoutManager$b[] a>
	//    2    4:iconst_0        
	//    3    5:aaload          
	//    4    6:iload_1         
	//    5    7:invokevirtual   #258 <Method int android.support.v7.widget.StaggeredGridLayoutManager$b.b(int)>
	//    6   10:istore_3        
		for(int j1 = 1; j1 < i;)
	//*   7   11:iconst_1        
	//*   8   12:istore_2        
	//*   9   13:iload_2         
	//*  10   14:aload_0         
	//*  11   15:getfield        #69  <Field int i>
	//*  12   18:icmpge          56
		{
			int i2 = a[j1].b(i1);
	//   13   21:aload_0         
	//   14   22:getfield        #238 <Field StaggeredGridLayoutManager$b[] a>
	//   15   25:iload_2         
	//   16   26:aaload          
	//   17   27:iload_1         
	//   18   28:invokevirtual   #258 <Method int android.support.v7.widget.StaggeredGridLayoutManager$b.b(int)>
	//   19   31:istore          5
			int l1 = k1;
	//   20   33:iload_3         
	//   21   34:istore          4
			if(i2 > k1)
	//*  22   36:iload           5
	//*  23   38:iload_3         
	//*  24   39:icmple          46
				l1 = i2;
	//   25   42:iload           5
	//   26   44:istore          4
			j1++;
	//   27   46:iload_2         
	//   28   47:iconst_1        
	//   29   48:iadd            
	//   30   49:istore_2        
			k1 = l1;
	//   31   50:iload           4
	//   32   52:istore_3        
		}

	//*  33   53:goto            13
		return k1;
	//   34   56:iload_3         
	//   35   57:ireturn         
	}

	private void q(View view)
	{
		for(int i1 = i - 1; i1 >= 0; i1--)
	//*   0    0:aload_0         
	//*   1    1:getfield        #69  <Field int i>
	//*   2    4:iconst_1        
	//*   3    5:isub            
	//*   4    6:istore_2        
	//*   5    7:iload_2         
	//*   6    8:iflt            28
			a[i1].a(view);
	//    7   11:aload_0         
	//    8   12:getfield        #238 <Field StaggeredGridLayoutManager$b[] a>
	//    9   15:iload_2         
	//   10   16:aaload          
	//   11   17:aload_1         
	//   12   18:invokevirtual   #479 <Method void StaggeredGridLayoutManager$b.a(View)>

	//   13   21:iload_2         
	//   14   22:iconst_1        
	//   15   23:isub            
	//   16   24:istore_2        
	//*  17   25:goto            7
	//   18   28:return          
	}

	private int r(int i1)
	{
		int k1 = a[0].b(i1);
	//    0    0:aload_0         
	//    1    1:getfield        #238 <Field StaggeredGridLayoutManager$b[] a>
	//    2    4:iconst_0        
	//    3    5:aaload          
	//    4    6:iload_1         
	//    5    7:invokevirtual   #258 <Method int android.support.v7.widget.StaggeredGridLayoutManager$b.b(int)>
	//    6   10:istore_3        
		for(int j1 = 1; j1 < i;)
	//*   7   11:iconst_1        
	//*   8   12:istore_2        
	//*   9   13:iload_2         
	//*  10   14:aload_0         
	//*  11   15:getfield        #69  <Field int i>
	//*  12   18:icmpge          56
		{
			int i2 = a[j1].b(i1);
	//   13   21:aload_0         
	//   14   22:getfield        #238 <Field StaggeredGridLayoutManager$b[] a>
	//   15   25:iload_2         
	//   16   26:aaload          
	//   17   27:iload_1         
	//   18   28:invokevirtual   #258 <Method int android.support.v7.widget.StaggeredGridLayoutManager$b.b(int)>
	//   19   31:istore          5
			int l1 = k1;
	//   20   33:iload_3         
	//   21   34:istore          4
			if(i2 < k1)
	//*  22   36:iload           5
	//*  23   38:iload_3         
	//*  24   39:icmpge          46
				l1 = i2;
	//   25   42:iload           5
	//   26   44:istore          4
			j1++;
	//   27   46:iload_2         
	//   28   47:iconst_1        
	//   29   48:iadd            
	//   30   49:istore_2        
			k1 = l1;
	//   31   50:iload           4
	//   32   52:istore_3        
		}

	//*  33   53:goto            13
		return k1;
	//   34   56:iload_3         
	//   35   57:ireturn         
	}

	private boolean s(int i1)
	{
		int j1 = j;
	//    0    0:aload_0         
	//    1    1:getfield        #102 <Field int j>
	//    2    4:istore_2        
		boolean flag2 = false;
	//    3    5:iconst_0        
	//    4    6:istore          4
		boolean flag3 = false;
	//    5    8:iconst_0        
	//    6    9:istore          5
		if(j1 == 0)
	//*   7   11:iload_2         
	//*   8   12:ifne            45
		{
			boolean flag;
			if(i1 == -1)
	//*   9   15:iload_1         
	//*  10   16:iconst_m1       
	//*  11   17:icmpne          25
				flag = true;
	//   12   20:iconst_1        
	//   13   21:istore_3        
			else
	//*  14   22:goto            27
				flag = false;
	//   15   25:iconst_0        
	//   16   26:istore_3        
			flag2 = flag3;
	//   17   27:iload           5
	//   18   29:istore          4
			if(flag != e)
	//*  19   31:iload_3         
	//*  20   32:aload_0         
	//*  21   33:getfield        #73  <Field boolean e>
	//*  22   36:icmpeq          42
				flag2 = true;
	//   23   39:iconst_1        
	//   24   40:istore          4
			return flag2;
	//   25   42:iload           4
	//   26   44:ireturn         
		}
		boolean flag1;
		if(i1 == -1)
	//*  27   45:iload_1         
	//*  28   46:iconst_m1       
	//*  29   47:icmpne          55
			flag1 = true;
	//   30   50:iconst_1        
	//   31   51:istore_3        
		else
	//*  32   52:goto            57
			flag1 = false;
	//   33   55:iconst_0        
	//   34   56:istore_3        
		if(flag1 == e)
	//*  35   57:iload_3         
	//*  36   58:aload_0         
	//*  37   59:getfield        #73  <Field boolean e>
	//*  38   62:icmpne          70
			flag1 = true;
	//   39   65:iconst_1        
	//   40   66:istore_3        
		else
	//*  41   67:goto            72
			flag1 = false;
	//   42   70:iconst_0        
	//   43   71:istore_3        
		if(flag1 == i())
	//*  44   72:iload_3         
	//*  45   73:aload_0         
	//*  46   74:invokevirtual   #146 <Method boolean i()>
	//*  47   77:icmpne          83
			flag2 = true;
	//   48   80:iconst_1        
	//   49   81:istore          4
		return flag2;
	//   50   83:iload           4
	//   51   85:ireturn         
	}

	private int t(int i1)
	{
		int j1 = u();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #154 <Method int u()>
	//    2    4:istore_3        
		byte byte0 = -1;
	//    3    5:iconst_m1       
	//    4    6:istore_2        
		if(j1 == 0)
	//*   5    7:iload_3         
	//*   6    8:ifne            24
		{
			i1 = ((int) (byte0));
	//    7   11:iload_2         
	//    8   12:istore_1        
			if(e)
	//*   9   13:aload_0         
	//*  10   14:getfield        #73  <Field boolean e>
	//*  11   17:ifeq            22
				i1 = 1;
	//   12   20:iconst_1        
	//   13   21:istore_1        
			return i1;
	//   14   22:iload_1         
	//   15   23:ireturn         
		}
		boolean flag;
		if(i1 < K())
	//*  16   24:iload_1         
	//*  17   25:aload_0         
	//*  18   26:invokevirtual   #559 <Method int K()>
	//*  19   29:icmpge          38
			flag = true;
	//   20   32:iconst_1        
	//   21   33:istore          4
		else
	//*  22   35:goto            41
			flag = false;
	//   23   38:iconst_0        
	//   24   39:istore          4
		return flag == e ? 1 : -1;
	//   25   41:iload           4
	//   26   43:aload_0         
	//   27   44:getfield        #73  <Field boolean e>
	//   28   47:icmpeq          52
	//   29   50:iconst_m1       
	//   30   51:ireturn         
	//   31   52:iconst_1        
	//   32   53:ireturn         
	}

	private int u(int i1)
	{
		int k1 = u();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #154 <Method int u()>
	//    2    4:istore_3        
		for(int j1 = 0; j1 < k1; j1++)
	//*   3    5:iconst_0        
	//*   4    6:istore_2        
	//*   5    7:iload_2         
	//*   6    8:iload_3         
	//*   7    9:icmpge          44
		{
			int l1 = d(h(j1));
	//    8   12:aload_0         
	//    9   13:aload_0         
	//   10   14:iload_2         
	//   11   15:invokevirtual   #157 <Method View h(int)>
	//   12   18:invokevirtual   #580 <Method int d(View)>
	//   13   21:istore          4
			if(l1 >= 0 && l1 < i1)
	//*  14   23:iload           4
	//*  15   25:iflt            37
	//*  16   28:iload           4
	//*  17   30:iload_1         
	//*  18   31:icmpge          37
				return l1;
	//   19   34:iload           4
	//   20   36:ireturn         
		}

	//   21   37:iload_2         
	//   22   38:iconst_1        
	//   23   39:iadd            
	//   24   40:istore_2        
	//*  25   41:goto            7
		return 0;
	//   26   44:iconst_0        
	//   27   45:ireturn         
	}

	private int v(int i1)
	{
		for(int j1 = u() - 1; j1 >= 0; j1--)
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #154 <Method int u()>
	//*   2    4:iconst_1        
	//*   3    5:isub            
	//*   4    6:istore_2        
	//*   5    7:iload_2         
	//*   6    8:iflt            39
		{
			int k1 = d(h(j1));
	//    7   11:aload_0         
	//    8   12:aload_0         
	//    9   13:iload_2         
	//   10   14:invokevirtual   #157 <Method View h(int)>
	//   11   17:invokevirtual   #580 <Method int d(View)>
	//   12   20:istore_3        
			if(k1 >= 0 && k1 < i1)
	//*  13   21:iload_3         
	//*  14   22:iflt            32
	//*  15   25:iload_3         
	//*  16   26:iload_1         
	//*  17   27:icmpge          32
				return k1;
	//   18   30:iload_3         
	//   19   31:ireturn         
		}

	//   20   32:iload_2         
	//   21   33:iconst_1        
	//   22   34:isub            
	//   23   35:istore_2        
	//*  24   36:goto            7
		return 0;
	//   25   39:iconst_0        
	//   26   40:ireturn         
	}

	private int w(int i1)
	{
		int j1 = 0x80000000;
	//    0    0:ldc1            #76  <Int 0x80000000>
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
	//   16   52:ldc1            #76  <Int 0x80000000>
	//   17   54:ireturn         

						case 2: // '\002'
							if(j == 1)
	//*  18   55:aload_0         
	//*  19   56:getfield        #102 <Field int j>
	//*  20   59:iconst_1        
	//*  21   60:icmpne          65
								return 1;
	//   22   63:iconst_1        
	//   23   64:ireturn         
							return !i() ? 1 : -1;
	//   24   65:aload_0         
	//   25   66:invokevirtual   #146 <Method boolean i()>
	//   26   69:ifeq            74
	//   27   72:iconst_m1       
	//   28   73:ireturn         
	//   29   74:iconst_1        
	//   30   75:ireturn         

						case 1: // '\001'
							break;
						}
						if(j == 1)
	//*  31   76:aload_0         
	//*  32   77:getfield        #102 <Field int j>
	//*  33   80:iconst_1        
	//*  34   81:icmpne          86
							return -1;
	//   35   84:iconst_m1       
	//   36   85:ireturn         
						return !i() ? -1 : 1;
	//   37   86:aload_0         
	//   38   87:invokevirtual   #146 <Method boolean i()>
	//   39   90:ifeq            95
	//   40   93:iconst_1        
	//   41   94:ireturn         
	//   42   95:iconst_m1       
	//   43   96:ireturn         
					}
					if(j == 1)
	//*  44   97:aload_0         
	//*  45   98:getfield        #102 <Field int j>
	//*  46  101:iconst_1        
	//*  47  102:icmpne          107
						j1 = 1;
	//   48  105:iconst_1        
	//   49  106:istore_2        
					return j1;
	//   50  107:iload_2         
	//   51  108:ireturn         
				}
				if(j == 0)
	//*  52  109:aload_0         
	//*  53  110:getfield        #102 <Field int j>
	//*  54  113:ifne            118
					j1 = 1;
	//   55  116:iconst_1        
	//   56  117:istore_2        
				return j1;
	//   57  118:iload_2         
	//   58  119:ireturn         
			}
			return j != 1 ? 0x80000000 : -1;
	//   59  120:aload_0         
	//   60  121:getfield        #102 <Field int j>
	//   61  124:iconst_1        
	//   62  125:icmpne          130
	//   63  128:iconst_m1       
	//   64  129:ireturn         
	//   65  130:ldc1            #76  <Int 0x80000000>
	//   66  132:ireturn         
		}
		return j != 0 ? 0x80000000 : -1;
	//   67  133:aload_0         
	//   68  134:getfield        #102 <Field int j>
	//   69  137:ifne            142
	//   70  140:iconst_m1       
	//   71  141:ireturn         
	//   72  142:ldc1            #76  <Int 0x80000000>
	//   73  144:ireturn         
	}

	int J()
	{
		int i1 = u();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #154 <Method int u()>
	//    2    4:istore_1        
		if(i1 == 0)
	//*   3    5:iload_1         
	//*   4    6:ifne            11
			return 0;
	//    5    9:iconst_0        
	//    6   10:ireturn         
		else
			return d(h(i1 - 1));
	//    7   11:aload_0         
	//    8   12:aload_0         
	//    9   13:iload_1         
	//   10   14:iconst_1        
	//   11   15:isub            
	//   12   16:invokevirtual   #157 <Method View h(int)>
	//   13   19:invokevirtual   #580 <Method int d(View)>
	//   14   22:ireturn         
	}

	int K()
	{
		if(u() == 0)
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #154 <Method int u()>
	//*   2    4:ifne            9
			return 0;
	//    3    7:iconst_0        
	//    4    8:ireturn         
		else
			return d(h(0));
	//    5    9:aload_0         
	//    6   10:aload_0         
	//    7   11:iconst_0        
	//    8   12:invokevirtual   #157 <Method View h(int)>
	//    9   15:invokevirtual   #580 <Method int d(View)>
	//   10   18:ireturn         
	}

	public int a(int i1, RecyclerView.n n1, RecyclerView.r r1)
	{
		return c(i1, n1, r1);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:aload_2         
	//    3    3:aload_3         
	//    4    4:invokevirtual   #551 <Method int c(int, RecyclerView$n, RecyclerView$r)>
	//    5    7:ireturn         
	}

	public int a(RecyclerView.n n1, RecyclerView.r r1)
	{
		if(j == 0)
	//*   0    0:aload_0         
	//*   1    1:getfield        #102 <Field int j>
	//*   2    4:ifne            12
			return i;
	//    3    7:aload_0         
	//    4    8:getfield        #69  <Field int i>
	//    5   11:ireturn         
		else
			return super.a(n1, r1);
	//    6   12:aload_0         
	//    7   13:aload_1         
	//    8   14:aload_2         
	//    9   15:invokespecial   #583 <Method int RecyclerView$h.a(RecyclerView$n, RecyclerView$r)>
	//   10   18:ireturn         
	}

	public RecyclerView.LayoutParams a()
	{
		if(j == 0)
	//*   0    0:aload_0         
	//*   1    1:getfield        #102 <Field int j>
	//*   2    4:ifne            18
			return ((RecyclerView.LayoutParams) (new LayoutParams(-2, -1)));
	//    3    7:new             #8   <Class StaggeredGridLayoutManager$LayoutParams>
	//    4   10:dup             
	//    5   11:bipush          -2
	//    6   13:iconst_m1       
	//    7   14:invokespecial   #586 <Method void StaggeredGridLayoutManager$LayoutParams(int, int)>
	//    8   17:areturn         
		else
			return ((RecyclerView.LayoutParams) (new LayoutParams(-1, -2)));
	//    9   18:new             #8   <Class StaggeredGridLayoutManager$LayoutParams>
	//   10   21:dup             
	//   11   22:iconst_m1       
	//   12   23:bipush          -2
	//   13   25:invokespecial   #586 <Method void StaggeredGridLayoutManager$LayoutParams(int, int)>
	//   14   28:areturn         
	}

	public RecyclerView.LayoutParams a(Context context, AttributeSet attributeset)
	{
		return ((RecyclerView.LayoutParams) (new LayoutParams(context, attributeset)));
	//    0    0:new             #8   <Class StaggeredGridLayoutManager$LayoutParams>
	//    1    3:dup             
	//    2    4:aload_1         
	//    3    5:aload_2         
	//    4    6:invokespecial   #590 <Method void StaggeredGridLayoutManager$LayoutParams(Context, AttributeSet)>
	//    5    9:areturn         
	}

	public RecyclerView.LayoutParams a(android.view.ViewGroup.LayoutParams layoutparams)
	{
		if(layoutparams instanceof android.view.ViewGroup.MarginLayoutParams)
	//*   0    0:aload_1         
	//*   1    1:instanceof      #593 <Class android.view.ViewGroup$MarginLayoutParams>
	//*   2    4:ifeq            19
			return ((RecyclerView.LayoutParams) (new LayoutParams((android.view.ViewGroup.MarginLayoutParams)layoutparams)));
	//    3    7:new             #8   <Class StaggeredGridLayoutManager$LayoutParams>
	//    4   10:dup             
	//    5   11:aload_1         
	//    6   12:checkcast       #593 <Class android.view.ViewGroup$MarginLayoutParams>
	//    7   15:invokespecial   #596 <Method void StaggeredGridLayoutManager$LayoutParams(android.view.ViewGroup$MarginLayoutParams)>
	//    8   18:areturn         
		else
			return ((RecyclerView.LayoutParams) (new LayoutParams(layoutparams)));
	//    9   19:new             #8   <Class StaggeredGridLayoutManager$LayoutParams>
	//   10   22:dup             
	//   11   23:aload_1         
	//   12   24:invokespecial   #599 <Method void StaggeredGridLayoutManager$LayoutParams(android.view.ViewGroup$LayoutParams)>
	//   13   27:areturn         
	}

	public View a(View view, int i1, RecyclerView.n n1, RecyclerView.r r1)
	{
		if(u() == 0)
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #154 <Method int u()>
	//*   2    4:ifne            9
			return null;
	//    3    7:aconst_null     
	//    4    8:areturn         
		view = e(view);
	//    5    9:aload_0         
	//    6   10:aload_1         
	//    7   11:invokevirtual   #603 <Method View e(View)>
	//    8   14:astore_1        
		if(view == null)
	//*   9   15:aload_1         
	//*  10   16:ifnonnull       21
			return null;
	//   11   19:aconst_null     
	//   12   20:areturn         
		M();
	//   13   21:aload_0         
	//   14   22:invokespecial   #346 <Method void M()>
		int l2 = w(i1);
	//   15   25:aload_0         
	//   16   26:iload_2         
	//   17   27:invokespecial   #605 <Method int w(int)>
	//   18   30:istore          7
		if(l2 == 0x80000000)
	//*  19   32:iload           7
	//*  20   34:ldc1            #76  <Int 0x80000000>
	//*  21   36:icmpne          41
			return null;
	//   22   39:aconst_null     
	//   23   40:areturn         
		Object obj = ((Object) ((LayoutParams)view.getLayoutParams()));
	//   24   41:aload_1         
	//   25   42:invokevirtual   #166 <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//   26   45:checkcast       #8   <Class StaggeredGridLayoutManager$LayoutParams>
	//   27   48:astore          10
		boolean flag1 = ((LayoutParams) (obj)).b;
	//   28   50:aload           10
	//   29   52:getfield        #190 <Field boolean android.support.v7.widget.StaggeredGridLayoutManager$LayoutParams.b>
	//   30   55:istore          8
		obj = ((Object) (((LayoutParams) (obj)).a));
	//   31   57:aload           10
	//   32   59:getfield        #193 <Field StaggeredGridLayoutManager$b StaggeredGridLayoutManager$LayoutParams.a>
	//   33   62:astore          10
		if(l2 == 1)
	//*  34   64:iload           7
	//*  35   66:iconst_1        
	//*  36   67:icmpne          78
			i1 = J();
	//   37   70:aload_0         
	//   38   71:invokevirtual   #556 <Method int J()>
	//   39   74:istore_2        
		else
	//*  40   75:goto            83
			i1 = K();
	//   41   78:aload_0         
	//   42   79:invokevirtual   #559 <Method int K()>
	//   43   82:istore_2        
		b(i1, r1);
	//   44   83:aload_0         
	//   45   84:iload_2         
	//   46   85:aload           4
	//   47   87:invokespecial   #379 <Method void b(int, RecyclerView$r)>
		l(l2);
	//   48   90:aload_0         
	//   49   91:iload           7
	//   50   93:invokespecial   #381 <Method void l(int)>
		l.c = l.d + i1;
	//   51   96:aload_0         
	//   52   97:getfield        #113 <Field ae l>
	//   53  100:aload_0         
	//   54  101:getfield        #113 <Field ae l>
	//   55  104:getfield        #275 <Field int ae.d>
	//   56  107:iload_2         
	//   57  108:iadd            
	//   58  109:putfield        #384 <Field int ae.c>
		l.b = (int)((float)b.f() * 0.3333333F);
	//   59  112:aload_0         
	//   60  113:getfield        #113 <Field ae l>
	//   61  116:aload_0         
	//   62  117:getfield        #140 <Field ah b>
	//   63  120:invokevirtual   #182 <Method int ah.f()>
	//   64  123:i2f             
	//   65  124:ldc2            #606 <Float 0.3333333F>
	//   66  127:fmul            
	//   67  128:f2i             
	//   68  129:putfield        #216 <Field int android.support.v7.widget.ae.b>
		l.h = true;
	//   69  132:aload_0         
	//   70  133:getfield        #113 <Field ae l>
	//   71  136:iconst_1        
	//   72  137:putfield        #296 <Field boolean ae.h>
		ae ae1 = l;
	//   73  140:aload_0         
	//   74  141:getfield        #113 <Field ae l>
	//   75  144:astore          11
		boolean flag = false;
	//   76  146:iconst_0        
	//   77  147:istore          6
		ae1.a = false;
	//   78  149:aload           11
	//   79  151:iconst_0        
	//   80  152:putfield        #375 <Field boolean ae.a>
		a(n1, l, r1);
	//   81  155:aload_0         
	//   82  156:aload_3         
	//   83  157:aload_0         
	//   84  158:getfield        #113 <Field ae l>
	//   85  161:aload           4
	//   86  163:invokespecial   #383 <Method int a(RecyclerView$n, ae, RecyclerView$r)>
	//   87  166:pop             
		o = e;
	//   88  167:aload_0         
	//   89  168:aload_0         
	//   90  169:getfield        #73  <Field boolean e>
	//   91  172:putfield        #352 <Field boolean o>
		if(!flag1)
	//*  92  175:iload           8
	//*  93  177:ifne            200
		{
			n1 = ((RecyclerView.n) (((b) (obj)).a(i1, l2)));
	//   94  180:aload           10
	//   95  182:iload_2         
	//   96  183:iload           7
	//   97  185:invokevirtual   #609 <Method View StaggeredGridLayoutManager$b.a(int, int)>
	//   98  188:astore_3        
			if(n1 != null && n1 != view)
	//*  99  189:aload_3         
	//* 100  190:ifnull          200
	//* 101  193:aload_3         
	//* 102  194:aload_1         
	//* 103  195:if_acmpeq       200
				return ((View) (n1));
	//  104  198:aload_3         
	//  105  199:areturn         
		}
		if(s(l2))
	//* 106  200:aload_0         
	//* 107  201:iload           7
	//* 108  203:invokespecial   #309 <Method boolean s(int)>
	//* 109  206:ifeq            256
		{
			for(int j1 = i - 1; j1 >= 0; j1--)
	//* 110  209:aload_0         
	//* 111  210:getfield        #69  <Field int i>
	//* 112  213:iconst_1        
	//* 113  214:isub            
	//* 114  215:istore          5
	//* 115  217:iload           5
	//* 116  219:iflt            302
			{
				n1 = ((RecyclerView.n) (a[j1].a(i1, l2)));
	//  117  222:aload_0         
	//  118  223:getfield        #238 <Field StaggeredGridLayoutManager$b[] a>
	//  119  226:iload           5
	//  120  228:aaload          
	//  121  229:iload_2         
	//  122  230:iload           7
	//  123  232:invokevirtual   #609 <Method View StaggeredGridLayoutManager$b.a(int, int)>
	//  124  235:astore_3        
				if(n1 != null && n1 != view)
	//* 125  236:aload_3         
	//* 126  237:ifnull          247
	//* 127  240:aload_3         
	//* 128  241:aload_1         
	//* 129  242:if_acmpeq       247
					return ((View) (n1));
	//  130  245:aload_3         
	//  131  246:areturn         
			}

	//  132  247:iload           5
	//  133  249:iconst_1        
	//  134  250:isub            
	//  135  251:istore          5
		} else
	//* 136  253:goto            217
		{
			for(int k1 = 0; k1 < i; k1++)
	//* 137  256:iconst_0        
	//* 138  257:istore          5
	//* 139  259:iload           5
	//* 140  261:aload_0         
	//* 141  262:getfield        #69  <Field int i>
	//* 142  265:icmpge          302
			{
				n1 = ((RecyclerView.n) (a[k1].a(i1, l2)));
	//  143  268:aload_0         
	//  144  269:getfield        #238 <Field StaggeredGridLayoutManager$b[] a>
	//  145  272:iload           5
	//  146  274:aaload          
	//  147  275:iload_2         
	//  148  276:iload           7
	//  149  278:invokevirtual   #609 <Method View StaggeredGridLayoutManager$b.a(int, int)>
	//  150  281:astore_3        
				if(n1 != null && n1 != view)
	//* 151  282:aload_3         
	//* 152  283:ifnull          293
	//* 153  286:aload_3         
	//* 154  287:aload_1         
	//* 155  288:if_acmpeq       293
					return ((View) (n1));
	//  156  291:aload_3         
	//  157  292:areturn         
			}

	//  158  293:iload           5
	//  159  295:iconst_1        
	//  160  296:iadd            
	//  161  297:istore          5
		}
	//* 162  299:goto            259
		boolean flag2 = d;
	//  163  302:aload_0         
	//  164  303:getfield        #71  <Field boolean d>
	//  165  306:istore          9
		if(l2 == -1)
	//* 166  308:iload           7
	//* 167  310:iconst_m1       
	//* 168  311:icmpne          319
			i1 = 1;
	//  169  314:iconst_1        
	//  170  315:istore_2        
		else
	//* 171  316:goto            321
			i1 = 0;
	//  172  319:iconst_0        
	//  173  320:istore_2        
		if((flag2 ^ true) == i1)
	//* 174  321:iload           9
	//* 175  323:iconst_1        
	//* 176  324:ixor            
	//* 177  325:iload_2         
	//* 178  326:icmpne          334
			i1 = 1;
	//  179  329:iconst_1        
	//  180  330:istore_2        
		else
	//* 181  331:goto            336
			i1 = 0;
	//  182  334:iconst_0        
	//  183  335:istore_2        
		if(!flag1)
	//* 184  336:iload           8
	//* 185  338:ifne            380
		{
			int l1;
			if(i1 != 0)
	//* 186  341:iload_2         
	//* 187  342:ifeq            355
				l1 = ((b) (obj)).j();
	//  188  345:aload           10
	//  189  347:invokevirtual   #611 <Method int StaggeredGridLayoutManager$b.j()>
	//  190  350:istore          5
			else
	//* 191  352:goto            362
				l1 = ((b) (obj)).k();
	//  192  355:aload           10
	//  193  357:invokevirtual   #613 <Method int StaggeredGridLayoutManager$b.k()>
	//  194  360:istore          5
			n1 = ((RecyclerView.n) (c(l1)));
	//  195  362:aload_0         
	//  196  363:iload           5
	//  197  365:invokevirtual   #615 <Method View c(int)>
	//  198  368:astore_3        
			if(n1 != null && n1 != view)
	//* 199  369:aload_3         
	//* 200  370:ifnull          380
	//* 201  373:aload_3         
	//* 202  374:aload_1         
	//* 203  375:if_acmpeq       380
				return ((View) (n1));
	//  204  378:aload_3         
	//  205  379:areturn         
		}
		int i2 = ((int) (flag));
	//  206  380:iload           6
	//  207  382:istore          5
		if(s(l2))
	//* 208  384:aload_0         
	//* 209  385:iload           7
	//* 210  387:invokespecial   #309 <Method boolean s(int)>
	//* 211  390:ifeq            477
			for(i2 = i - 1; i2 >= 0; i2--)
	//* 212  393:aload_0         
	//* 213  394:getfield        #69  <Field int i>
	//* 214  397:iconst_1        
	//* 215  398:isub            
	//* 216  399:istore          5
	//* 217  401:iload           5
	//* 218  403:iflt            544
				if(i2 != ((b) (obj)).e)
	//* 219  406:iload           5
	//* 220  408:aload           10
	//* 221  410:getfield        #195 <Field int StaggeredGridLayoutManager$b.e>
	//* 222  413:icmpne          419
	//* 223  416:goto            468
				{
					int j2;
					if(i1 != 0)
	//* 224  419:iload_2         
	//* 225  420:ifeq            438
						j2 = a[i2].j();
	//  226  423:aload_0         
	//  227  424:getfield        #238 <Field StaggeredGridLayoutManager$b[] a>
	//  228  427:iload           5
	//  229  429:aaload          
	//  230  430:invokevirtual   #611 <Method int StaggeredGridLayoutManager$b.j()>
	//  231  433:istore          6
					else
	//* 232  435:goto            450
						j2 = a[i2].k();
	//  233  438:aload_0         
	//  234  439:getfield        #238 <Field StaggeredGridLayoutManager$b[] a>
	//  235  442:iload           5
	//  236  444:aaload          
	//  237  445:invokevirtual   #613 <Method int StaggeredGridLayoutManager$b.k()>
	//  238  448:istore          6
					n1 = ((RecyclerView.n) (c(j2)));
	//  239  450:aload_0         
	//  240  451:iload           6
	//  241  453:invokevirtual   #615 <Method View c(int)>
	//  242  456:astore_3        
					if(n1 != null && n1 != view)
	//* 243  457:aload_3         
	//* 244  458:ifnull          468
	//* 245  461:aload_3         
	//* 246  462:aload_1         
	//* 247  463:if_acmpeq       468
						return ((View) (n1));
	//  248  466:aload_3         
	//  249  467:areturn         
				}

	//  250  468:iload           5
	//  251  470:iconst_1        
	//  252  471:isub            
	//  253  472:istore          5
		else
	//* 254  474:goto            401
			for(; i2 < i; i2++)
	//* 255  477:iload           5
	//* 256  479:aload_0         
	//* 257  480:getfield        #69  <Field int i>
	//* 258  483:icmpge          544
			{
				int k2;
				if(i1 != 0)
	//* 259  486:iload_2         
	//* 260  487:ifeq            505
					k2 = a[i2].j();
	//  261  490:aload_0         
	//  262  491:getfield        #238 <Field StaggeredGridLayoutManager$b[] a>
	//  263  494:iload           5
	//  264  496:aaload          
	//  265  497:invokevirtual   #611 <Method int StaggeredGridLayoutManager$b.j()>
	//  266  500:istore          6
				else
	//* 267  502:goto            517
					k2 = a[i2].k();
	//  268  505:aload_0         
	//  269  506:getfield        #238 <Field StaggeredGridLayoutManager$b[] a>
	//  270  509:iload           5
	//  271  511:aaload          
	//  272  512:invokevirtual   #613 <Method int StaggeredGridLayoutManager$b.k()>
	//  273  515:istore          6
				n1 = ((RecyclerView.n) (c(k2)));
	//  274  517:aload_0         
	//  275  518:iload           6
	//  276  520:invokevirtual   #615 <Method View c(int)>
	//  277  523:astore_3        
				if(n1 != null && n1 != view)
	//* 278  524:aload_3         
	//* 279  525:ifnull          535
	//* 280  528:aload_3         
	//* 281  529:aload_1         
	//* 282  530:if_acmpeq       535
					return ((View) (n1));
	//  283  533:aload_3         
	//  284  534:areturn         
			}

	//  285  535:iload           5
	//  286  537:iconst_1        
	//  287  538:iadd            
	//  288  539:istore          5
	//* 289  541:goto            477
		return null;
	//  290  544:aconst_null     
	//  291  545:areturn         
	}

	public void a(int i1)
	{
		a(((String) (null)));
	//    0    0:aload_0         
	//    1    1:aconst_null     
	//    2    2:invokevirtual   #618 <Method void a(String)>
		if(i1 != i)
	//*   3    5:iload_1         
	//*   4    6:aload_0         
	//*   5    7:getfield        #69  <Field int i>
	//*   6   10:icmpeq          84
		{
			h();
	//    7   13:aload_0         
	//    8   14:invokevirtual   #619 <Method void h()>
			i = i1;
	//    9   17:aload_0         
	//   10   18:iload_1         
	//   11   19:putfield        #69  <Field int i>
			m = new BitSet(i);
	//   12   22:aload_0         
	//   13   23:new             #206 <Class BitSet>
	//   14   26:dup             
	//   15   27:aload_0         
	//   16   28:getfield        #69  <Field int i>
	//   17   31:invokespecial   #621 <Method void BitSet(int)>
	//   18   34:putfield        #204 <Field BitSet m>
			a = new b[i];
	//   19   37:aload_0         
	//   20   38:aload_0         
	//   21   39:getfield        #69  <Field int i>
	//   22   42:anewarray       b[]
	//   23   45:putfield        #238 <Field StaggeredGridLayoutManager$b[] a>
			for(i1 = 0; i1 < i; i1++)
	//*  24   48:iconst_0        
	//*  25   49:istore_1        
	//*  26   50:iload_1         
	//*  27   51:aload_0         
	//*  28   52:getfield        #69  <Field int i>
	//*  29   55:icmpge          80
				a[i1] = new b(i1);
	//   30   58:aload_0         
	//   31   59:getfield        #238 <Field StaggeredGridLayoutManager$b[] a>
	//   32   62:iload_1         
	//   33   63:new             #27  <Class StaggeredGridLayoutManager$b>
	//   34   66:dup             
	//   35   67:aload_0         
	//   36   68:iload_1         
	//   37   69:invokespecial   #624 <Method void StaggeredGridLayoutManager$b(StaggeredGridLayoutManager, int)>
	//   38   72:aastore         

	//   39   73:iload_1         
	//   40   74:iconst_1        
	//   41   75:iadd            
	//   42   76:istore_1        
	//*  43   77:goto            50
			n();
	//   44   80:aload_0         
	//   45   81:invokevirtual   #565 <Method void n()>
		}
	//   46   84:return          
	}

	public void a(int i1, int j1, RecyclerView.r r1, RecyclerView.h.a a1)
	{
		if(j != 0)
	//*   0    0:aload_0         
	//*   1    1:getfield        #102 <Field int j>
	//*   2    4:ifne            10
	//*   3    7:goto            12
			i1 = j1;
	//    4   10:iload_2         
	//    5   11:istore_1        
		if(u() != 0)
	//*   6   12:aload_0         
	//*   7   13:invokevirtual   #154 <Method int u()>
	//*   8   16:ifeq            262
		{
			if(i1 == 0)
	//*   9   19:iload_1         
	//*  10   20:ifne            24
				return;
	//   11   23:return          
			a(i1, r1);
	//   12   24:aload_0         
	//   13   25:iload_1         
	//   14   26:aload_3         
	//   15   27:invokevirtual   #627 <Method void a(int, RecyclerView$r)>
			if(G == null || G.length < i)
	//*  16   30:aload_0         
	//*  17   31:getfield        #629 <Field int[] G>
	//*  18   34:ifnull          49
	//*  19   37:aload_0         
	//*  20   38:getfield        #629 <Field int[] G>
	//*  21   41:arraylength     
	//*  22   42:aload_0         
	//*  23   43:getfield        #69  <Field int i>
	//*  24   46:icmpge          59
				G = new int[i];
	//   25   49:aload_0         
	//   26   50:aload_0         
	//   27   51:getfield        #69  <Field int i>
	//   28   54:newarray        int[]
	//   29   56:putfield        #629 <Field int[] G>
			boolean flag = false;
	//   30   59:iconst_0        
	//   31   60:istore          7
			j1 = 0;
	//   32   62:iconst_0        
	//   33   63:istore_2        
			int k1;
			for(i1 = 0; j1 < i; i1 = k1)
	//*  34   64:iconst_0        
	//*  35   65:istore_1        
	//*  36   66:iload_2         
	//*  37   67:aload_0         
	//*  38   68:getfield        #69  <Field int i>
	//*  39   71:icmpge          183
			{
				int l1;
				if(l.d == -1)
	//*  40   74:aload_0         
	//*  41   75:getfield        #113 <Field ae l>
	//*  42   78:getfield        #275 <Field int ae.d>
	//*  43   81:iconst_m1       
	//*  44   82:icmpne          122
				{
					k1 = l.f;
	//   45   85:aload_0         
	//   46   86:getfield        #113 <Field ae l>
	//   47   89:getfield        #217 <Field int ae.f>
	//   48   92:istore          5
					l1 = a[j1].a(l.f);
	//   49   94:aload_0         
	//   50   95:getfield        #238 <Field StaggeredGridLayoutManager$b[] a>
	//   51   98:iload_2         
	//   52   99:aaload          
	//   53  100:aload_0         
	//   54  101:getfield        #113 <Field ae l>
	//   55  104:getfield        #217 <Field int ae.f>
	//   56  107:invokevirtual   #271 <Method int StaggeredGridLayoutManager$b.a(int)>
	//   57  110:istore          6
				} else
	//*  58  112:iload           5
	//*  59  114:iload           6
	//*  60  116:isub            
	//*  61  117:istore          6
	//*  62  119:goto            152
				{
					k1 = a[j1].b(l.g);
	//   63  122:aload_0         
	//   64  123:getfield        #238 <Field StaggeredGridLayoutManager$b[] a>
	//   65  126:iload_2         
	//   66  127:aaload          
	//   67  128:aload_0         
	//   68  129:getfield        #113 <Field ae l>
	//   69  132:getfield        #215 <Field int ae.g>
	//   70  135:invokevirtual   #258 <Method int android.support.v7.widget.StaggeredGridLayoutManager$b.b(int)>
	//   71  138:istore          5
					l1 = l.g;
	//   72  140:aload_0         
	//   73  141:getfield        #113 <Field ae l>
	//   74  144:getfield        #215 <Field int ae.g>
	//   75  147:istore          6
				}
				l1 = k1 - l1;
	//*  76  149:goto            112
				k1 = i1;
	//   77  152:iload_1         
	//   78  153:istore          5
				if(l1 >= 0)
	//*  79  155:iload           6
	//*  80  157:iflt            173
				{
					G[i1] = l1;
	//   81  160:aload_0         
	//   82  161:getfield        #629 <Field int[] G>
	//   83  164:iload_1         
	//   84  165:iload           6
	//   85  167:iastore         
					k1 = i1 + 1;
	//   86  168:iload_1         
	//   87  169:iconst_1        
	//   88  170:iadd            
	//   89  171:istore          5
				}
				j1++;
	//   90  173:iload_2         
	//   91  174:iconst_1        
	//   92  175:iadd            
	//   93  176:istore_2        
			}

	//   94  177:iload           5
	//   95  179:istore_1        
	//*  96  180:goto            66
			Arrays.sort(G, 0, i1);
	//   97  183:aload_0         
	//   98  184:getfield        #629 <Field int[] G>
	//   99  187:iconst_0        
	//  100  188:iload_1         
	//  101  189:invokestatic    #635 <Method void Arrays.sort(int[], int, int)>
			for(j1 = ((int) (flag)); j1 < i1 && l.a(r1); j1++)
	//* 102  192:iload           7
	//* 103  194:istore_2        
	//* 104  195:iload_2         
	//* 105  196:iload_1         
	//* 106  197:icmpge          262
	//* 107  200:aload_0         
	//* 108  201:getfield        #113 <Field ae l>
	//* 109  204:aload_3         
	//* 110  205:invokevirtual   #226 <Method boolean ae.a(RecyclerView$r)>
	//* 111  208:ifeq            262
			{
				a1.b(l.c, G[j1]);
	//  112  211:aload           4
	//  113  213:aload_0         
	//  114  214:getfield        #113 <Field ae l>
	//  115  217:getfield        #384 <Field int ae.c>
	//  116  220:aload_0         
	//  117  221:getfield        #629 <Field int[] G>
	//  118  224:iload_2         
	//  119  225:iaload          
	//  120  226:invokeinterface #638 <Method void android.support.v7.widget.RecyclerView$h$a.b(int, int)>
				ae ae1 = l;
	//  121  231:aload_0         
	//  122  232:getfield        #113 <Field ae l>
	//  123  235:astore          8
				ae1.c = ae1.c + l.d;
	//  124  237:aload           8
	//  125  239:aload           8
	//  126  241:getfield        #384 <Field int ae.c>
	//  127  244:aload_0         
	//  128  245:getfield        #113 <Field ae l>
	//  129  248:getfield        #275 <Field int ae.d>
	//  130  251:iadd            
	//  131  252:putfield        #384 <Field int ae.c>
			}

	//  132  255:iload_2         
	//  133  256:iconst_1        
	//  134  257:iadd            
	//  135  258:istore_2        
		}
	//* 136  259:goto            195
	//  137  262:return          
	}

	void a(int i1, RecyclerView.r r1)
	{
		int j1;
		byte byte0;
		if(i1 > 0)
	//*   0    0:iload_1         
	//*   1    1:ifle            15
		{
			j1 = J();
	//    2    4:aload_0         
	//    3    5:invokevirtual   #556 <Method int J()>
	//    4    8:istore_3        
			byte0 = 1;
	//    5    9:iconst_1        
	//    6   10:istore          4
		} else
	//*   7   12:goto            23
		{
			j1 = K();
	//    8   15:aload_0         
	//    9   16:invokevirtual   #559 <Method int K()>
	//   10   19:istore_3        
			byte0 = -1;
	//   11   20:iconst_m1       
	//   12   21:istore          4
		}
		l.a = true;
	//   13   23:aload_0         
	//   14   24:getfield        #113 <Field ae l>
	//   15   27:iconst_1        
	//   16   28:putfield        #375 <Field boolean ae.a>
		b(j1, r1);
	//   17   31:aload_0         
	//   18   32:iload_3         
	//   19   33:aload_2         
	//   20   34:invokespecial   #379 <Method void b(int, RecyclerView$r)>
		l(((int) (byte0)));
	//   21   37:aload_0         
	//   22   38:iload           4
	//   23   40:invokespecial   #381 <Method void l(int)>
		l.c = j1 + l.d;
	//   24   43:aload_0         
	//   25   44:getfield        #113 <Field ae l>
	//   26   47:iload_3         
	//   27   48:aload_0         
	//   28   49:getfield        #113 <Field ae l>
	//   29   52:getfield        #275 <Field int ae.d>
	//   30   55:iadd            
	//   31   56:putfield        #384 <Field int ae.c>
		l.b = Math.abs(i1);
	//   32   59:aload_0         
	//   33   60:getfield        #113 <Field ae l>
	//   34   63:iload_1         
	//   35   64:invokestatic    #641 <Method int Math.abs(int)>
	//   36   67:putfield        #216 <Field int android.support.v7.widget.ae.b>
	//   37   70:return          
	}

	public void a(Rect rect, int i1, int j1)
	{
		int k1 = z() + B();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #644 <Method int z()>
	//    2    4:aload_0         
	//    3    5:invokevirtual   #646 <Method int B()>
	//    4    8:iadd            
	//    5    9:istore          4
		int l1 = A() + C();
	//    6   11:aload_0         
	//    7   12:invokevirtual   #648 <Method int A()>
	//    8   15:aload_0         
	//    9   16:invokevirtual   #650 <Method int C()>
	//   10   19:iadd            
	//   11   20:istore          5
		if(j == 1)
	//*  12   22:aload_0         
	//*  13   23:getfield        #102 <Field int j>
	//*  14   26:iconst_1        
	//*  15   27:icmpne          76
		{
			j1 = a(j1, rect.height() + l1, F());
	//   16   30:iload_3         
	//   17   31:aload_1         
	//   18   32:invokevirtual   #652 <Method int Rect.height()>
	//   19   35:iload           5
	//   20   37:iadd            
	//   21   38:aload_0         
	//   22   39:invokevirtual   #654 <Method int F()>
	//   23   42:invokestatic    #656 <Method int a(int, int, int)>
	//   24   45:istore_3        
			k1 = a(i1, k * i + k1, E());
	//   25   46:iload_2         
	//   26   47:aload_0         
	//   27   48:getfield        #176 <Field int k>
	//   28   51:aload_0         
	//   29   52:getfield        #69  <Field int i>
	//   30   55:imul            
	//   31   56:iload           4
	//   32   58:iadd            
	//   33   59:aload_0         
	//   34   60:invokevirtual   #658 <Method int E()>
	//   35   63:invokestatic    #656 <Method int a(int, int, int)>
	//   36   66:istore          4
			i1 = j1;
	//   37   68:iload_3         
	//   38   69:istore_2        
			j1 = k1;
	//   39   70:iload           4
	//   40   72:istore_3        
		} else
	//*  41   73:goto            119
		{
			i1 = a(i1, rect.width() + k1, E());
	//   42   76:iload_2         
	//   43   77:aload_1         
	//   44   78:invokevirtual   #660 <Method int Rect.width()>
	//   45   81:iload           4
	//   46   83:iadd            
	//   47   84:aload_0         
	//   48   85:invokevirtual   #658 <Method int E()>
	//   49   88:invokestatic    #656 <Method int a(int, int, int)>
	//   50   91:istore_2        
			k1 = a(j1, k * i + l1, F());
	//   51   92:iload_3         
	//   52   93:aload_0         
	//   53   94:getfield        #176 <Field int k>
	//   54   97:aload_0         
	//   55   98:getfield        #69  <Field int i>
	//   56  101:imul            
	//   57  102:iload           5
	//   58  104:iadd            
	//   59  105:aload_0         
	//   60  106:invokevirtual   #654 <Method int F()>
	//   61  109:invokestatic    #656 <Method int a(int, int, int)>
	//   62  112:istore          4
			j1 = i1;
	//   63  114:iload_2         
	//   64  115:istore_3        
			i1 = k1;
	//   65  116:iload           4
	//   66  118:istore_2        
		}
		g(j1, i1);
	//   67  119:aload_0         
	//   68  120:iload_3         
	//   69  121:iload_2         
	//   70  122:invokevirtual   #662 <Method void g(int, int)>
	//   71  125:return          
	}

	public void a(Parcelable parcelable)
	{
		if(parcelable instanceof SavedState)
	//*   0    0:aload_1         
	//*   1    1:instanceof      #19  <Class StaggeredGridLayoutManager$SavedState>
	//*   2    4:ifeq            19
		{
			A = (SavedState)parcelable;
	//    3    7:aload_0         
	//    4    8:aload_1         
	//    5    9:checkcast       #19  <Class StaggeredGridLayoutManager$SavedState>
	//    6   12:putfield        #331 <Field StaggeredGridLayoutManager$SavedState A>
			n();
	//    7   15:aload_0         
	//    8   16:invokevirtual   #565 <Method void n()>
		}
	//    9   19:return          
	}

	public void a(RecyclerView.n n1, RecyclerView.r r1, View view, android.support.v4.view.a.b b1)
	{
		n1 = ((RecyclerView.n) (view.getLayoutParams()));
	//    0    0:aload_3         
	//    1    1:invokevirtual   #166 <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//    2    4:astore_1        
		if(!(n1 instanceof LayoutParams))
	//*   3    5:aload_1         
	//*   4    6:instanceof      #8   <Class StaggeredGridLayoutManager$LayoutParams>
	//*   5    9:ifne            20
		{
			super.a(view, b1);
	//    6   12:aload_0         
	//    7   13:aload_3         
	//    8   14:aload           4
	//    9   16:invokespecial   #667 <Method void RecyclerView$h.a(View, b)>
			return;
	//   10   19:return          
		}
		n1 = ((RecyclerView.n) ((LayoutParams)n1));
	//   11   20:aload_1         
	//   12   21:checkcast       #8   <Class StaggeredGridLayoutManager$LayoutParams>
	//   13   24:astore_1        
		int i1;
		int j1;
		int k1;
		int l1;
		if(j == 0)
	//*  14   25:aload_0         
	//*  15   26:getfield        #102 <Field int j>
	//*  16   29:ifne            93
		{
			int i2 = ((LayoutParams) (n1)).b();
	//   17   32:aload_1         
	//   18   33:invokevirtual   #668 <Method int android.support.v7.widget.StaggeredGridLayoutManager$LayoutParams.b()>
	//   19   36:istore          9
			if(((LayoutParams) (n1)).b)
	//*  20   38:aload_1         
	//*  21   39:getfield        #190 <Field boolean android.support.v7.widget.StaggeredGridLayoutManager$LayoutParams.b>
	//*  22   42:ifeq            54
				j1 = i;
	//   23   45:aload_0         
	//   24   46:getfield        #69  <Field int i>
	//   25   49:istore          6
			else
	//*  26   51:goto            57
				j1 = 1;
	//   27   54:iconst_1        
	//   28   55:istore          6
			l1 = -1;
	//   29   57:iconst_m1       
	//   30   58:istore          8
			i1 = -1;
	//   31   60:iconst_m1       
	//   32   61:istore          5
			k1 = j1;
	//   33   63:iload           6
	//   34   65:istore          7
			j1 = i2;
	//   35   67:iload           9
	//   36   69:istore          6
		} else
	//*  37   71:aload           4
	//*  38   73:iload           6
	//*  39   75:iload           7
	//*  40   77:iload           8
	//*  41   79:iload           5
	//*  42   81:aload_1         
	//*  43   82:getfield        #190 <Field boolean android.support.v7.widget.StaggeredGridLayoutManager$LayoutParams.b>
	//*  44   85:iconst_0        
	//*  45   86:invokestatic    #673 <Method android.support.v4.view.a.b$l android.support.v4.view.a.b$l.a(int, int, int, int, boolean, boolean)>
	//*  46   89:invokevirtual   #678 <Method void b.b(Object)>
	//*  47   92:return          
		{
			j1 = -1;
	//   48   93:iconst_m1       
	//   49   94:istore          6
			k1 = -1;
	//   50   96:iconst_m1       
	//   51   97:istore          7
			l1 = ((LayoutParams) (n1)).b();
	//   52   99:aload_1         
	//   53  100:invokevirtual   #668 <Method int android.support.v7.widget.StaggeredGridLayoutManager$LayoutParams.b()>
	//   54  103:istore          8
			if(((LayoutParams) (n1)).b)
	//*  55  105:aload_1         
	//*  56  106:getfield        #190 <Field boolean android.support.v7.widget.StaggeredGridLayoutManager$LayoutParams.b>
	//*  57  109:ifeq            121
				i1 = i;
	//   58  112:aload_0         
	//   59  113:getfield        #69  <Field int i>
	//   60  116:istore          5
			else
	//*  61  118:goto            71
				i1 = 1;
	//   62  121:iconst_1        
	//   63  122:istore          5
		}
		b1.b(((Object) (android.support.v4.view.a.b.l.a(j1, k1, l1, i1, ((LayoutParams) (n1)).b, false))));
	//*  64  124:goto            71
	}

	public void a(RecyclerView.r r1)
	{
		super.a(r1);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #681 <Method void RecyclerView$h.a(RecyclerView$r)>
		f = -1;
	//    3    5:aload_0         
	//    4    6:iconst_m1       
	//    5    7:putfield        #75  <Field int f>
		g = 0x80000000;
	//    6   10:aload_0         
	//    7   11:ldc1            #76  <Int 0x80000000>
	//    8   13:putfield        #78  <Field int g>
		A = null;
	//    9   16:aload_0         
	//   10   17:aconst_null     
	//   11   18:putfield        #331 <Field StaggeredGridLayoutManager$SavedState A>
		D.a();
	//   12   21:aload_0         
	//   13   22:getfield        #93  <Field StaggeredGridLayoutManager$a D>
	//   14   25:invokevirtual   #340 <Method void StaggeredGridLayoutManager$a.a()>
	//   15   28:return          
	}

	void a(RecyclerView.r r1, a a1)
	{
		if(b(r1, a1))
	//*   0    0:aload_0         
	//*   1    1:aload_1         
	//*   2    2:aload_2         
	//*   3    3:invokevirtual   #683 <Method boolean b(RecyclerView$r, StaggeredGridLayoutManager$a)>
	//*   4    6:ifeq            10
			return;
	//    5    9:return          
		if(c(r1, a1))
	//*   6   10:aload_0         
	//*   7   11:aload_1         
	//*   8   12:aload_2         
	//*   9   13:invokespecial   #685 <Method boolean c(RecyclerView$r, StaggeredGridLayoutManager$a)>
	//*  10   16:ifeq            20
		{
			return;
	//   11   19:return          
		} else
		{
			a1.b();
	//   12   20:aload_2         
	//   13   21:invokevirtual   #687 <Method void android.support.v7.widget.StaggeredGridLayoutManager$a.b()>
			a1.a = 0;
	//   14   24:aload_2         
	//   15   25:iconst_0        
	//   16   26:putfield        #376 <Field int StaggeredGridLayoutManager$a.a>
			return;
	//   17   29:return          
		}
	}

	public void a(RecyclerView recyclerview)
	{
		h.a();
	//    0    0:aload_0         
	//    1    1:getfield        #81  <Field StaggeredGridLayoutManager$LazySpanLookup h>
	//    2    4:invokevirtual   #355 <Method void StaggeredGridLayoutManager$LazySpanLookup.a()>
		n();
	//    3    7:aload_0         
	//    4    8:invokevirtual   #565 <Method void n()>
	//    5   11:return          
	}

	public void a(RecyclerView recyclerview, int i1, int j1)
	{
		c(i1, j1, 1);
	//    0    0:aload_0         
	//    1    1:iload_2         
	//    2    2:iload_3         
	//    3    3:iconst_1        
	//    4    4:invokespecial   #691 <Method void c(int, int, int)>
	//    5    7:return          
	}

	public void a(RecyclerView recyclerview, int i1, int j1, int k1)
	{
		c(i1, j1, 8);
	//    0    0:aload_0         
	//    1    1:iload_2         
	//    2    2:iload_3         
	//    3    3:bipush          8
	//    4    5:invokespecial   #691 <Method void c(int, int, int)>
	//    5    8:return          
	}

	public void a(RecyclerView recyclerview, int i1, int j1, Object obj)
	{
		c(i1, j1, 4);
	//    0    0:aload_0         
	//    1    1:iload_2         
	//    2    2:iload_3         
	//    3    3:iconst_4        
	//    4    4:invokespecial   #691 <Method void c(int, int, int)>
	//    5    7:return          
	}

	public void a(RecyclerView recyclerview, RecyclerView.n n1)
	{
		a(H);
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #100 <Field Runnable H>
	//    3    5:invokevirtual   #397 <Method boolean a(Runnable)>
	//    4    8:pop             
		for(int i1 = 0; i1 < i; i1++)
	//*   5    9:iconst_0        
	//*   6   10:istore_3        
	//*   7   11:iload_3         
	//*   8   12:aload_0         
	//*   9   13:getfield        #69  <Field int i>
	//*  10   16:icmpge          35
			a[i1].e();
	//   11   19:aload_0         
	//   12   20:getfield        #238 <Field StaggeredGridLayoutManager$b[] a>
	//   13   23:iload_3         
	//   14   24:aaload          
	//   15   25:invokevirtual   #360 <Method void StaggeredGridLayoutManager$b.e()>

	//   16   28:iload_3         
	//   17   29:iconst_1        
	//   18   30:iadd            
	//   19   31:istore_3        
	//*  20   32:goto            11
		recyclerview.requestLayout();
	//   21   35:aload_1         
	//   22   36:invokevirtual   #699 <Method void RecyclerView.requestLayout()>
	//   23   39:return          
	}

	public void a(AccessibilityEvent accessibilityevent)
	{
		super.a(accessibilityevent);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #702 <Method void RecyclerView$h.a(AccessibilityEvent)>
		if(u() > 0)
	//*   3    5:aload_0         
	//*   4    6:invokevirtual   #154 <Method int u()>
	//*   5    9:ifle            78
		{
			View view = b(false);
	//    6   12:aload_0         
	//    7   13:iconst_0        
	//    8   14:invokevirtual   #529 <Method View b(boolean)>
	//    9   17:astore          4
			View view1 = d(false);
	//   10   19:aload_0         
	//   11   20:iconst_0        
	//   12   21:invokevirtual   #531 <Method View d(boolean)>
	//   13   24:astore          5
			if(view != null)
	//*  14   26:aload           4
	//*  15   28:ifnull          78
			{
				if(view1 == null)
	//*  16   31:aload           5
	//*  17   33:ifnonnull       37
					return;
	//   18   36:return          
				int i1 = d(view);
	//   19   37:aload_0         
	//   20   38:aload           4
	//   21   40:invokevirtual   #580 <Method int d(View)>
	//   22   43:istore_2        
				int j1 = d(view1);
	//   23   44:aload_0         
	//   24   45:aload           5
	//   25   47:invokevirtual   #580 <Method int d(View)>
	//   26   50:istore_3        
				if(i1 < j1)
	//*  27   51:iload_2         
	//*  28   52:iload_3         
	//*  29   53:icmpge          67
				{
					accessibilityevent.setFromIndex(i1);
	//   30   56:aload_1         
	//   31   57:iload_2         
	//   32   58:invokevirtual   #707 <Method void AccessibilityEvent.setFromIndex(int)>
					accessibilityevent.setToIndex(j1);
	//   33   61:aload_1         
	//   34   62:iload_3         
	//   35   63:invokevirtual   #710 <Method void AccessibilityEvent.setToIndex(int)>
					return;
	//   36   66:return          
				} else
				{
					accessibilityevent.setFromIndex(j1);
	//   37   67:aload_1         
	//   38   68:iload_3         
	//   39   69:invokevirtual   #707 <Method void AccessibilityEvent.setFromIndex(int)>
					accessibilityevent.setToIndex(i1);
	//   40   72:aload_1         
	//   41   73:iload_2         
	//   42   74:invokevirtual   #710 <Method void AccessibilityEvent.setToIndex(int)>
					return;
	//   43   77:return          
				}
			}
		}
	//   44   78:return          
	}

	public void a(String s1)
	{
		if(A == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #331 <Field StaggeredGridLayoutManager$SavedState A>
	//*   2    4:ifnonnull       12
			super.a(s1);
	//    3    7:aload_0         
	//    4    8:aload_1         
	//    5    9:invokespecial   #711 <Method void RecyclerView$h.a(String)>
	//    6   12:return          
	}

	public void a(boolean flag)
	{
		a(((String) (null)));
	//    0    0:aload_0         
	//    1    1:aconst_null     
	//    2    2:invokevirtual   #618 <Method void a(String)>
		if(A != null && A.h != flag)
	//*   3    5:aload_0         
	//*   4    6:getfield        #331 <Field StaggeredGridLayoutManager$SavedState A>
	//*   5    9:ifnull          31
	//*   6   12:aload_0         
	//*   7   13:getfield        #331 <Field StaggeredGridLayoutManager$SavedState A>
	//*   8   16:getfield        #419 <Field boolean StaggeredGridLayoutManager$SavedState.h>
	//*   9   19:iload_1         
	//*  10   20:icmpeq          31
			A.h = flag;
	//   11   23:aload_0         
	//   12   24:getfield        #331 <Field StaggeredGridLayoutManager$SavedState A>
	//   13   27:iload_1         
	//   14   28:putfield        #419 <Field boolean StaggeredGridLayoutManager$SavedState.h>
		d = flag;
	//   15   31:aload_0         
	//   16   32:iload_1         
	//   17   33:putfield        #71  <Field boolean d>
		n();
	//   18   36:aload_0         
	//   19   37:invokevirtual   #565 <Method void n()>
	//   20   40:return          
	}

	public boolean a(RecyclerView.LayoutParams layoutparams)
	{
		return layoutparams instanceof LayoutParams;
	//    0    0:aload_1         
	//    1    1:instanceof      #8   <Class StaggeredGridLayoutManager$LayoutParams>
	//    2    4:ireturn         
	}

	public int b(int i1, RecyclerView.n n1, RecyclerView.r r1)
	{
		return c(i1, n1, r1);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:aload_2         
	//    3    3:aload_3         
	//    4    4:invokevirtual   #551 <Method int c(int, RecyclerView$n, RecyclerView$r)>
	//    5    7:ireturn         
	}

	public int b(RecyclerView.n n1, RecyclerView.r r1)
	{
		if(j == 1)
	//*   0    0:aload_0         
	//*   1    1:getfield        #102 <Field int j>
	//*   2    4:iconst_1        
	//*   3    5:icmpne          13
			return i;
	//    4    8:aload_0         
	//    5    9:getfield        #69  <Field int i>
	//    6   12:ireturn         
		else
			return super.b(n1, r1);
	//    7   13:aload_0         
	//    8   14:aload_1         
	//    9   15:aload_2         
	//   10   16:invokespecial   #714 <Method int android.support.v7.widget.RecyclerView$h.b(RecyclerView$n, RecyclerView$r)>
	//   11   19:ireturn         
	}

	View b(boolean flag)
	{
		int j1 = b.c();
	//    0    0:aload_0         
	//    1    1:getfield        #140 <Field ah b>
	//    2    4:invokevirtual   #223 <Method int ah.c()>
	//    3    7:istore_3        
		int k1 = b.d();
	//    4    8:aload_0         
	//    5    9:getfield        #140 <Field ah b>
	//    6   12:invokevirtual   #221 <Method int ah.d()>
	//    7   15:istore          4
		int l1 = u();
	//    8   17:aload_0         
	//    9   18:invokevirtual   #154 <Method int u()>
	//   10   21:istore          5
		View view = null;
	//   11   23:aconst_null     
	//   12   24:astore          7
		for(int i1 = 0; i1 < l1;)
	//*  13   26:iconst_0        
	//*  14   27:istore_2        
	//*  15   28:iload_2         
	//*  16   29:iload           5
	//*  17   31:icmpge          126
		{
			View view2 = h(i1);
	//   18   34:aload_0         
	//   19   35:iload_2         
	//   20   36:invokevirtual   #157 <Method View h(int)>
	//   21   39:astore          9
			int i2 = b.a(view2);
	//   22   41:aload_0         
	//   23   42:getfield        #140 <Field ah b>
	//   24   45:aload           9
	//   25   47:invokevirtual   #544 <Method int ah.a(View)>
	//   26   50:istore          6
			View view1 = view;
	//   27   52:aload           7
	//   28   54:astore          8
			if(b.b(view2) > j1)
	//*  29   56:aload_0         
	//*  30   57:getfield        #140 <Field ah b>
	//*  31   60:aload           9
	//*  32   62:invokevirtual   #318 <Method int android.support.v7.widget.ah.b(View)>
	//*  33   65:iload_3         
	//*  34   66:icmple          115
				if(i2 >= k1)
	//*  35   69:iload           6
	//*  36   71:iload           4
	//*  37   73:icmplt          83
					view1 = view;
	//   38   76:aload           7
	//   39   78:astore          8
				else
	//*  40   80:goto            115
				if(i2 < j1)
	//*  41   83:iload           6
	//*  42   85:iload_3         
	//*  43   86:icmpge          112
				{
					if(!flag)
	//*  44   89:iload_1         
	//*  45   90:ifne            96
						return view2;
	//   46   93:aload           9
	//   47   95:areturn         
					view1 = view;
	//   48   96:aload           7
	//   49   98:astore          8
					if(view == null)
	//*  50  100:aload           7
	//*  51  102:ifnonnull       115
						view1 = view2;
	//   52  105:aload           9
	//   53  107:astore          8
				} else
	//*  54  109:goto            115
				{
					return view2;
	//   55  112:aload           9
	//   56  114:areturn         
				}
			i1++;
	//   57  115:iload_2         
	//   58  116:iconst_1        
	//   59  117:iadd            
	//   60  118:istore_2        
			view = view1;
	//   61  119:aload           8
	//   62  121:astore          7
		}

	//*  63  123:goto            28
		return view;
	//   64  126:aload           7
	//   65  128:areturn         
	}

	public void b(int i1)
	{
		if(i1 != 0 && i1 != 1)
	//*   0    0:iload_1         
	//*   1    1:ifeq            20
	//*   2    4:iload_1         
	//*   3    5:iconst_1        
	//*   4    6:icmpeq          20
			throw new IllegalArgumentException("invalid orientation.");
	//    5    9:new             #716 <Class IllegalArgumentException>
	//    6   12:dup             
	//    7   13:ldc2            #718 <String "invalid orientation.">
	//    8   16:invokespecial   #720 <Method void IllegalArgumentException(String)>
	//    9   19:athrow          
		a(((String) (null)));
	//   10   20:aload_0         
	//   11   21:aconst_null     
	//   12   22:invokevirtual   #618 <Method void a(String)>
		if(i1 == j)
	//*  13   25:iload_1         
	//*  14   26:aload_0         
	//*  15   27:getfield        #102 <Field int j>
	//*  16   30:icmpne          34
		{
			return;
	//   17   33:return          
		} else
		{
			j = i1;
	//   18   34:aload_0         
	//   19   35:iload_1         
	//   20   36:putfield        #102 <Field int j>
			ah ah1 = b;
	//   21   39:aload_0         
	//   22   40:getfield        #140 <Field ah b>
	//   23   43:astore_2        
			b = c;
	//   24   44:aload_0         
	//   25   45:aload_0         
	//   26   46:getfield        #142 <Field ah c>
	//   27   49:putfield        #140 <Field ah b>
			c = ah1;
	//   28   52:aload_0         
	//   29   53:aload_2         
	//   30   54:putfield        #142 <Field ah c>
			n();
	//   31   57:aload_0         
	//   32   58:invokevirtual   #565 <Method void n()>
			return;
	//   33   61:return          
		}
	}

	public void b(RecyclerView recyclerview, int i1, int j1)
	{
		c(i1, j1, 2);
	//    0    0:aload_0         
	//    1    1:iload_2         
	//    2    2:iload_3         
	//    3    3:iconst_2        
	//    4    4:invokespecial   #691 <Method void c(int, int, int)>
	//    5    7:return          
	}

	public boolean b()
	{
		return A == null;
	//    0    0:aload_0         
	//    1    1:getfield        #331 <Field StaggeredGridLayoutManager$SavedState A>
	//    2    4:ifnonnull       9
	//    3    7:iconst_1        
	//    4    8:ireturn         
	//    5    9:iconst_0        
	//    6   10:ireturn         
	}

	boolean b(RecyclerView.r r1, a a1)
	{
		boolean flag1 = r1.a();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #391 <Method boolean RecyclerView$r.a()>
	//    2    4:istore          6
		boolean flag = false;
	//    3    6:iconst_0        
	//    4    7:istore          5
		if(!flag1)
	//*   5    9:iload           6
	//*   6   11:ifne            393
		{
			if(f == -1)
	//*   7   14:aload_0         
	//*   8   15:getfield        #75  <Field int f>
	//*   9   18:iconst_m1       
	//*  10   19:icmpne          24
				return false;
	//   11   22:iconst_0        
	//   12   23:ireturn         
			if(f >= 0 && f < r1.e())
	//*  13   24:aload_0         
	//*  14   25:getfield        #75  <Field int f>
	//*  15   28:iflt            382
	//*  16   31:aload_0         
	//*  17   32:getfield        #75  <Field int f>
	//*  18   35:aload_1         
	//*  19   36:invokevirtual   #335 <Method int RecyclerView$r.e()>
	//*  20   39:icmplt          45
	//*  21   42:goto            382
			{
				if(A != null && A.a != -1 && A.c >= 1)
	//*  22   45:aload_0         
	//*  23   46:getfield        #331 <Field StaggeredGridLayoutManager$SavedState A>
	//*  24   49:ifnull          93
	//*  25   52:aload_0         
	//*  26   53:getfield        #331 <Field StaggeredGridLayoutManager$SavedState A>
	//*  27   56:getfield        #416 <Field int StaggeredGridLayoutManager$SavedState.a>
	//*  28   59:iconst_m1       
	//*  29   60:icmpeq          93
	//*  30   63:aload_0         
	//*  31   64:getfield        #331 <Field StaggeredGridLayoutManager$SavedState A>
	//*  32   67:getfield        #358 <Field int StaggeredGridLayoutManager$SavedState.c>
	//*  33   70:iconst_1        
	//*  34   71:icmpge          77
	//*  35   74:goto            93
				{
					a1.b = 0x80000000;
	//   36   77:aload_2         
	//   37   78:ldc1            #76  <Int 0x80000000>
	//   38   80:putfield        #361 <Field int android.support.v7.widget.StaggeredGridLayoutManager$a.b>
					a1.a = f;
	//   39   83:aload_2         
	//   40   84:aload_0         
	//   41   85:getfield        #75  <Field int f>
	//   42   88:putfield        #376 <Field int StaggeredGridLayoutManager$a.a>
					return true;
	//   43   91:iconst_1        
	//   44   92:ireturn         
				}
				r1 = ((RecyclerView.r) (c(f)));
	//   45   93:aload_0         
	//   46   94:aload_0         
	//   47   95:getfield        #75  <Field int f>
	//   48   98:invokevirtual   #615 <Method View c(int)>
	//   49  101:astore_1        
				if(r1 != null)
	//*  50  102:aload_1         
	//*  51  103:ifnull          322
				{
					int i1;
					if(e)
	//*  52  106:aload_0         
	//*  53  107:getfield        #73  <Field boolean e>
	//*  54  110:ifeq            121
						i1 = J();
	//   55  113:aload_0         
	//   56  114:invokevirtual   #556 <Method int J()>
	//   57  117:istore_3        
					else
	//*  58  118:goto            126
						i1 = K();
	//   59  121:aload_0         
	//   60  122:invokevirtual   #559 <Method int K()>
	//   61  125:istore_3        
					a1.a = i1;
	//   62  126:aload_2         
	//   63  127:iload_3         
	//   64  128:putfield        #376 <Field int StaggeredGridLayoutManager$a.a>
					if(g != 0x80000000)
	//*  65  131:aload_0         
	//*  66  132:getfield        #78  <Field int g>
	//*  67  135:ldc1            #76  <Int 0x80000000>
	//*  68  137:icmpeq          206
					{
						int j1;
						if(a1.c)
	//*  69  140:aload_2         
	//*  70  141:getfield        #347 <Field boolean StaggeredGridLayoutManager$a.c>
	//*  71  144:ifeq            180
						{
							i1 = b.d() - g;
	//   72  147:aload_0         
	//   73  148:getfield        #140 <Field ah b>
	//   74  151:invokevirtual   #221 <Method int ah.d()>
	//   75  154:aload_0         
	//   76  155:getfield        #78  <Field int g>
	//   77  158:isub            
	//   78  159:istore_3        
							j1 = b.b(((View) (r1)));
	//   79  160:aload_0         
	//   80  161:getfield        #140 <Field ah b>
	//   81  164:aload_1         
	//   82  165:invokevirtual   #318 <Method int android.support.v7.widget.ah.b(View)>
	//   83  168:istore          4
						} else
	//*  84  170:aload_2         
	//*  85  171:iload_3         
	//*  86  172:iload           4
	//*  87  174:isub            
	//*  88  175:putfield        #361 <Field int android.support.v7.widget.StaggeredGridLayoutManager$a.b>
	//*  89  178:iconst_1        
	//*  90  179:ireturn         
						{
							i1 = b.c() + g;
	//   91  180:aload_0         
	//   92  181:getfield        #140 <Field ah b>
	//   93  184:invokevirtual   #223 <Method int ah.c()>
	//   94  187:aload_0         
	//   95  188:getfield        #78  <Field int g>
	//   96  191:iadd            
	//   97  192:istore_3        
							j1 = b.a(((View) (r1)));
	//   98  193:aload_0         
	//   99  194:getfield        #140 <Field ah b>
	//  100  197:aload_1         
	//  101  198:invokevirtual   #544 <Method int ah.a(View)>
	//  102  201:istore          4
						}
						a1.b = i1 - j1;
						return true;
					}
	//* 103  203:goto            170
					if(b.e(((View) (r1))) > b.f())
	//* 104  206:aload_0         
	//* 105  207:getfield        #140 <Field ah b>
	//* 106  210:aload_1         
	//* 107  211:invokevirtual   #160 <Method int ah.e(View)>
	//* 108  214:aload_0         
	//* 109  215:getfield        #140 <Field ah b>
	//* 110  218:invokevirtual   #182 <Method int ah.f()>
	//* 111  221:icmple          257
					{
						if(a1.c)
	//* 112  224:aload_2         
	//* 113  225:getfield        #347 <Field boolean StaggeredGridLayoutManager$a.c>
	//* 114  228:ifeq            242
							i1 = b.d();
	//  115  231:aload_0         
	//  116  232:getfield        #140 <Field ah b>
	//  117  235:invokevirtual   #221 <Method int ah.d()>
	//  118  238:istore_3        
						else
	//* 119  239:goto            250
							i1 = b.c();
	//  120  242:aload_0         
	//  121  243:getfield        #140 <Field ah b>
	//  122  246:invokevirtual   #223 <Method int ah.c()>
	//  123  249:istore_3        
						a1.b = i1;
	//  124  250:aload_2         
	//  125  251:iload_3         
	//  126  252:putfield        #361 <Field int android.support.v7.widget.StaggeredGridLayoutManager$a.b>
						return true;
	//  127  255:iconst_1        
	//  128  256:ireturn         
					}
					i1 = b.a(((View) (r1))) - b.c();
	//  129  257:aload_0         
	//  130  258:getfield        #140 <Field ah b>
	//  131  261:aload_1         
	//  132  262:invokevirtual   #544 <Method int ah.a(View)>
	//  133  265:aload_0         
	//  134  266:getfield        #140 <Field ah b>
	//  135  269:invokevirtual   #223 <Method int ah.c()>
	//  136  272:isub            
	//  137  273:istore_3        
					if(i1 < 0)
	//* 138  274:iload_3         
	//* 139  275:ifge            286
					{
						a1.b = -i1;
	//  140  278:aload_2         
	//  141  279:iload_3         
	//  142  280:ineg            
	//  143  281:putfield        #361 <Field int android.support.v7.widget.StaggeredGridLayoutManager$a.b>
						return true;
	//  144  284:iconst_1        
	//  145  285:ireturn         
					}
					i1 = b.d() - b.b(((View) (r1)));
	//  146  286:aload_0         
	//  147  287:getfield        #140 <Field ah b>
	//  148  290:invokevirtual   #221 <Method int ah.d()>
	//  149  293:aload_0         
	//  150  294:getfield        #140 <Field ah b>
	//  151  297:aload_1         
	//  152  298:invokevirtual   #318 <Method int android.support.v7.widget.ah.b(View)>
	//  153  301:isub            
	//  154  302:istore_3        
					if(i1 < 0)
	//* 155  303:iload_3         
	//* 156  304:ifge            314
					{
						a1.b = i1;
	//  157  307:aload_2         
	//  158  308:iload_3         
	//  159  309:putfield        #361 <Field int android.support.v7.widget.StaggeredGridLayoutManager$a.b>
						return true;
	//  160  312:iconst_1        
	//  161  313:ireturn         
					} else
					{
						a1.b = 0x80000000;
	//  162  314:aload_2         
	//  163  315:ldc1            #76  <Int 0x80000000>
	//  164  317:putfield        #361 <Field int android.support.v7.widget.StaggeredGridLayoutManager$a.b>
						return true;
	//  165  320:iconst_1        
	//  166  321:ireturn         
					}
				}
				a1.a = f;
	//  167  322:aload_2         
	//  168  323:aload_0         
	//  169  324:getfield        #75  <Field int f>
	//  170  327:putfield        #376 <Field int StaggeredGridLayoutManager$a.a>
				if(g == 0x80000000)
	//* 171  330:aload_0         
	//* 172  331:getfield        #78  <Field int g>
	//* 173  334:ldc1            #76  <Int 0x80000000>
	//* 174  336:icmpne          367
				{
					if(t(a1.a) == 1)
	//* 175  339:aload_0         
	//* 176  340:aload_2         
	//* 177  341:getfield        #376 <Field int StaggeredGridLayoutManager$a.a>
	//* 178  344:invokespecial   #722 <Method int t(int)>
	//* 179  347:iconst_1        
	//* 180  348:icmpne          354
						flag = true;
	//  181  351:iconst_1        
	//  182  352:istore          5
					a1.c = flag;
	//  183  354:aload_2         
	//  184  355:iload           5
	//  185  357:putfield        #347 <Field boolean StaggeredGridLayoutManager$a.c>
					a1.b();
	//  186  360:aload_2         
	//  187  361:invokevirtual   #687 <Method void android.support.v7.widget.StaggeredGridLayoutManager$a.b()>
				} else
	//* 188  364:goto            375
				{
					a1.a(g);
	//  189  367:aload_2         
	//  190  368:aload_0         
	//  191  369:getfield        #78  <Field int g>
	//  192  372:invokevirtual   #723 <Method void StaggeredGridLayoutManager$a.a(int)>
				}
				a1.d = true;
	//  193  375:aload_2         
	//  194  376:iconst_1        
	//  195  377:putfield        #356 <Field boolean StaggeredGridLayoutManager$a.d>
				return true;
	//  196  380:iconst_1        
	//  197  381:ireturn         
			}
			f = -1;
	//  198  382:aload_0         
	//  199  383:iconst_m1       
	//  200  384:putfield        #75  <Field int f>
			g = 0x80000000;
	//  201  387:aload_0         
	//  202  388:ldc1            #76  <Int 0x80000000>
	//  203  390:putfield        #78  <Field int g>
		}
		return false;
	//  204  393:iconst_0        
	//  205  394:ireturn         
	}

	int c(int i1, RecyclerView.n n1, RecyclerView.r r1)
	{
		if(u() != 0)
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #154 <Method int u()>
	//*   2    4:ifeq            96
		{
			if(i1 == 0)
	//*   3    7:iload_1         
	//*   4    8:ifne            13
				return 0;
	//    5   11:iconst_0        
	//    6   12:ireturn         
			a(i1, r1);
	//    7   13:aload_0         
	//    8   14:iload_1         
	//    9   15:aload_3         
	//   10   16:invokevirtual   #627 <Method void a(int, RecyclerView$r)>
			int j1 = a(n1, l, r1);
	//   11   19:aload_0         
	//   12   20:aload_2         
	//   13   21:aload_0         
	//   14   22:getfield        #113 <Field ae l>
	//   15   25:aload_3         
	//   16   26:invokespecial   #383 <Method int a(RecyclerView$n, ae, RecyclerView$r)>
	//   17   29:istore          4
			if(l.b >= j1)
	//*  18   31:aload_0         
	//*  19   32:getfield        #113 <Field ae l>
	//*  20   35:getfield        #216 <Field int android.support.v7.widget.ae.b>
	//*  21   38:iload           4
	//*  22   40:icmpge          46
	//*  23   43:goto            60
				if(i1 < 0)
	//*  24   46:iload_1         
	//*  25   47:ifge            57
					i1 = -j1;
	//   26   50:iload           4
	//   27   52:ineg            
	//   28   53:istore_1        
				else
	//*  29   54:goto            60
					i1 = j1;
	//   30   57:iload           4
	//   31   59:istore_1        
			b.a(-i1);
	//   32   60:aload_0         
	//   33   61:getfield        #140 <Field ah b>
	//   34   64:iload_1         
	//   35   65:ineg            
	//   36   66:invokevirtual   #552 <Method void ah.a(int)>
			o = e;
	//   37   69:aload_0         
	//   38   70:aload_0         
	//   39   71:getfield        #73  <Field boolean e>
	//   40   74:putfield        #352 <Field boolean o>
			l.b = 0;
	//   41   77:aload_0         
	//   42   78:getfield        #113 <Field ae l>
	//   43   81:iconst_0        
	//   44   82:putfield        #216 <Field int android.support.v7.widget.ae.b>
			a(n1, l);
	//   45   85:aload_0         
	//   46   86:aload_2         
	//   47   87:aload_0         
	//   48   88:getfield        #113 <Field ae l>
	//   49   91:invokespecial   #294 <Method void a(RecyclerView$n, ae)>
			return i1;
	//   50   94:iload_1         
	//   51   95:ireturn         
		} else
		{
			return 0;
	//   52   96:iconst_0        
	//   53   97:ireturn         
		}
	}

	public int c(RecyclerView.r r1)
	{
		return b(r1);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #725 <Method int b(RecyclerView$r)>
	//    3    5:ireturn         
	}

	public Parcelable c()
	{
		int k1;
		SavedState savedstate;
		if(A != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #331 <Field StaggeredGridLayoutManager$SavedState A>
	//*   2    4:ifnull          19
			return ((Parcelable) (new SavedState(A)));
	//    3    7:new             #19  <Class StaggeredGridLayoutManager$SavedState>
	//    4   10:dup             
	//    5   11:aload_0         
	//    6   12:getfield        #331 <Field StaggeredGridLayoutManager$SavedState A>
	//    7   15:invokespecial   #729 <Method void StaggeredGridLayoutManager$SavedState(StaggeredGridLayoutManager$SavedState)>
	//    8   18:areturn         
		savedstate = new SavedState();
	//    9   19:new             #19  <Class StaggeredGridLayoutManager$SavedState>
	//   10   22:dup             
	//   11   23:invokespecial   #730 <Method void StaggeredGridLayoutManager$SavedState()>
	//   12   26:astore          4
		savedstate.h = d;
	//   13   28:aload           4
	//   14   30:aload_0         
	//   15   31:getfield        #71  <Field boolean d>
	//   16   34:putfield        #419 <Field boolean StaggeredGridLayoutManager$SavedState.h>
		savedstate.i = o;
	//   17   37:aload           4
	//   18   39:aload_0         
	//   19   40:getfield        #352 <Field boolean o>
	//   20   43:putfield        #413 <Field boolean StaggeredGridLayoutManager$SavedState.i>
		savedstate.j = z;
	//   21   46:aload           4
	//   22   48:aload_0         
	//   23   49:getfield        #354 <Field boolean z>
	//   24   52:putfield        #418 <Field boolean StaggeredGridLayoutManager$SavedState.j>
		LazySpanLookup lazyspanlookup = h;
	//   25   55:aload_0         
	//   26   56:getfield        #81  <Field StaggeredGridLayoutManager$LazySpanLookup h>
	//   27   59:astore          5
		k1 = 0;
	//   28   61:iconst_0        
	//   29   62:istore_2        
		if(lazyspanlookup != null && h.a != null)
	//*  30   63:aload           5
	//*  31   65:ifnull          116
	//*  32   68:aload_0         
	//*  33   69:getfield        #81  <Field StaggeredGridLayoutManager$LazySpanLookup h>
	//*  34   72:getfield        #423 <Field int[] StaggeredGridLayoutManager$LazySpanLookup.a>
	//*  35   75:ifnull          116
		{
			savedstate.f = h.a;
	//   36   78:aload           4
	//   37   80:aload_0         
	//   38   81:getfield        #81  <Field StaggeredGridLayoutManager$LazySpanLookup h>
	//   39   84:getfield        #423 <Field int[] StaggeredGridLayoutManager$LazySpanLookup.a>
	//   40   87:putfield        #421 <Field int[] StaggeredGridLayoutManager$SavedState.f>
			savedstate.e = savedstate.f.length;
	//   41   90:aload           4
	//   42   92:aload           4
	//   43   94:getfield        #421 <Field int[] StaggeredGridLayoutManager$SavedState.f>
	//   44   97:arraylength     
	//   45   98:putfield        #420 <Field int StaggeredGridLayoutManager$SavedState.e>
			savedstate.g = h.b;
	//   46  101:aload           4
	//   47  103:aload_0         
	//   48  104:getfield        #81  <Field StaggeredGridLayoutManager$LazySpanLookup h>
	//   49  107:getfield        #428 <Field List android.support.v7.widget.StaggeredGridLayoutManager$LazySpanLookup.b>
	//   50  110:putfield        #426 <Field List StaggeredGridLayoutManager$SavedState.g>
		} else
	//*  51  113:goto            122
		{
			savedstate.e = 0;
	//   52  116:aload           4
	//   53  118:iconst_0        
	//   54  119:putfield        #420 <Field int StaggeredGridLayoutManager$SavedState.e>
		}
		if(u() <= 0) goto _L2; else goto _L1
	//   55  122:aload_0         
	//   56  123:invokevirtual   #154 <Method int u()>
	//   57  126:ifle            280
_L1:
		int i1;
		if(o)
	//*  58  129:aload_0         
	//*  59  130:getfield        #352 <Field boolean o>
	//*  60  133:ifeq            144
			i1 = J();
	//   61  136:aload_0         
	//   62  137:invokevirtual   #556 <Method int J()>
	//   63  140:istore_1        
		else
	//*  64  141:goto            149
			i1 = K();
	//   65  144:aload_0         
	//   66  145:invokevirtual   #559 <Method int K()>
	//   67  148:istore_1        
		savedstate.a = i1;
	//   68  149:aload           4
	//   69  151:iload_1         
	//   70  152:putfield        #416 <Field int StaggeredGridLayoutManager$SavedState.a>
		savedstate.b = j();
	//   71  155:aload           4
	//   72  157:aload_0         
	//   73  158:invokevirtual   #731 <Method int j()>
	//   74  161:putfield        #415 <Field int android.support.v7.widget.StaggeredGridLayoutManager$SavedState.b>
		savedstate.c = i;
	//   75  164:aload           4
	//   76  166:aload_0         
	//   77  167:getfield        #69  <Field int i>
	//   78  170:putfield        #358 <Field int StaggeredGridLayoutManager$SavedState.c>
		savedstate.d = new int[i];
	//   79  173:aload           4
	//   80  175:aload_0         
	//   81  176:getfield        #69  <Field int i>
	//   82  179:newarray        int[]
	//   83  181:putfield        #412 <Field int[] StaggeredGridLayoutManager$SavedState.d>
_L9:
		if(k1 >= i)
			break; /* Loop/switch isn't completed */
	//   84  184:iload_2         
	//   85  185:aload_0         
	//   86  186:getfield        #69  <Field int i>
	//   87  189:icmpge          298
		if(!o) goto _L4; else goto _L3
	//   88  192:aload_0         
	//   89  193:getfield        #352 <Field boolean o>
	//   90  196:ifeq            234
_L3:
		int j1;
		int l1;
		l1 = a[k1].b(0x80000000);
	//   91  199:aload_0         
	//   92  200:getfield        #238 <Field StaggeredGridLayoutManager$b[] a>
	//   93  203:iload_2         
	//   94  204:aaload          
	//   95  205:ldc1            #76  <Int 0x80000000>
	//   96  207:invokevirtual   #258 <Method int android.support.v7.widget.StaggeredGridLayoutManager$b.b(int)>
	//   97  210:istore_3        
		j1 = l1;
	//   98  211:iload_3         
	//   99  212:istore_1        
		if(l1 == 0x80000000) goto _L6; else goto _L5
	//  100  213:iload_3         
	//  101  214:ldc1            #76  <Int 0x80000000>
	//  102  216:icmpeq          265
_L5:
		j1 = b.d();
	//  103  219:aload_0         
	//  104  220:getfield        #140 <Field ah b>
	//  105  223:invokevirtual   #221 <Method int ah.d()>
	//  106  226:istore_1        
_L7:
		j1 = l1 - j1;
	//  107  227:iload_3         
	//  108  228:iload_1         
	//  109  229:isub            
	//  110  230:istore_1        
		break; /* Loop/switch isn't completed */
	//  111  231:goto            265
_L4:
		l1 = a[k1].a(0x80000000);
	//  112  234:aload_0         
	//  113  235:getfield        #238 <Field StaggeredGridLayoutManager$b[] a>
	//  114  238:iload_2         
	//  115  239:aaload          
	//  116  240:ldc1            #76  <Int 0x80000000>
	//  117  242:invokevirtual   #271 <Method int StaggeredGridLayoutManager$b.a(int)>
	//  118  245:istore_3        
		j1 = l1;
	//  119  246:iload_3         
	//  120  247:istore_1        
		if(l1 == 0x80000000)
			break; /* Loop/switch isn't completed */
	//  121  248:iload_3         
	//  122  249:ldc1            #76  <Int 0x80000000>
	//  123  251:icmpeq          265
		j1 = b.c();
	//  124  254:aload_0         
	//  125  255:getfield        #140 <Field ah b>
	//  126  258:invokevirtual   #223 <Method int ah.c()>
	//  127  261:istore_1        
		if(true) goto _L7; else goto _L6
	//  128  262:goto            227
_L6:
		savedstate.d[k1] = j1;
	//  129  265:aload           4
	//  130  267:getfield        #412 <Field int[] StaggeredGridLayoutManager$SavedState.d>
	//  131  270:iload_2         
	//  132  271:iload_1         
	//  133  272:iastore         
		k1++;
	//  134  273:iload_2         
	//  135  274:iconst_1        
	//  136  275:iadd            
	//  137  276:istore_2        
		if(true) goto _L9; else goto _L8
	//  138  277:goto            184
_L2:
		savedstate.a = -1;
	//  139  280:aload           4
	//  140  282:iconst_m1       
	//  141  283:putfield        #416 <Field int StaggeredGridLayoutManager$SavedState.a>
		savedstate.b = -1;
	//  142  286:aload           4
	//  143  288:iconst_m1       
	//  144  289:putfield        #415 <Field int android.support.v7.widget.StaggeredGridLayoutManager$SavedState.b>
		savedstate.c = 0;
	//  145  292:aload           4
	//  146  294:iconst_0        
	//  147  295:putfield        #358 <Field int StaggeredGridLayoutManager$SavedState.c>
_L8:
		return ((Parcelable) (savedstate));
	//  148  298:aload           4
	//  149  300:areturn         
	}

	public void c(RecyclerView.n n1, RecyclerView.r r1)
	{
		a(n1, r1, true);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:iconst_1        
	//    4    4:invokespecial   #401 <Method void a(RecyclerView$n, RecyclerView$r, boolean)>
	//    5    7:return          
	}

	public int d(RecyclerView.r r1)
	{
		return b(r1);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #725 <Method int b(RecyclerView$r)>
	//    3    5:ireturn         
	}

	View d(boolean flag)
	{
		int j1 = b.c();
	//    0    0:aload_0         
	//    1    1:getfield        #140 <Field ah b>
	//    2    4:invokevirtual   #223 <Method int ah.c()>
	//    3    7:istore_3        
		int k1 = b.d();
	//    4    8:aload_0         
	//    5    9:getfield        #140 <Field ah b>
	//    6   12:invokevirtual   #221 <Method int ah.d()>
	//    7   15:istore          4
		int i1 = u() - 1;
	//    8   17:aload_0         
	//    9   18:invokevirtual   #154 <Method int u()>
	//   10   21:iconst_1        
	//   11   22:isub            
	//   12   23:istore_2        
		View view;
		View view1;
		for(view = null; i1 >= 0; view = view1)
	//*  13   24:aconst_null     
	//*  14   25:astore          7
	//*  15   27:iload_2         
	//*  16   28:iflt            128
		{
			View view2 = h(i1);
	//   17   31:aload_0         
	//   18   32:iload_2         
	//   19   33:invokevirtual   #157 <Method View h(int)>
	//   20   36:astore          9
			int l1 = b.a(view2);
	//   21   38:aload_0         
	//   22   39:getfield        #140 <Field ah b>
	//   23   42:aload           9
	//   24   44:invokevirtual   #544 <Method int ah.a(View)>
	//   25   47:istore          5
			int i2 = b.b(view2);
	//   26   49:aload_0         
	//   27   50:getfield        #140 <Field ah b>
	//   28   53:aload           9
	//   29   55:invokevirtual   #318 <Method int android.support.v7.widget.ah.b(View)>
	//   30   58:istore          6
			view1 = view;
	//   31   60:aload           7
	//   32   62:astore          8
			if(i2 > j1)
	//*  33   64:iload           6
	//*  34   66:iload_3         
	//*  35   67:icmple          117
				if(l1 >= k1)
	//*  36   70:iload           5
	//*  37   72:iload           4
	//*  38   74:icmplt          84
					view1 = view;
	//   39   77:aload           7
	//   40   79:astore          8
				else
	//*  41   81:goto            117
				if(i2 > k1)
	//*  42   84:iload           6
	//*  43   86:iload           4
	//*  44   88:icmple          114
				{
					if(!flag)
	//*  45   91:iload_1         
	//*  46   92:ifne            98
						return view2;
	//   47   95:aload           9
	//   48   97:areturn         
					view1 = view;
	//   49   98:aload           7
	//   50  100:astore          8
					if(view == null)
	//*  51  102:aload           7
	//*  52  104:ifnonnull       117
						view1 = view2;
	//   53  107:aload           9
	//   54  109:astore          8
				} else
	//*  55  111:goto            117
				{
					return view2;
	//   56  114:aload           9
	//   57  116:areturn         
				}
			i1--;
	//   58  117:iload_2         
	//   59  118:iconst_1        
	//   60  119:isub            
	//   61  120:istore_2        
		}

	//   62  121:aload           8
	//   63  123:astore          7
	//*  64  125:goto            27
		return view;
	//   65  128:aload           7
	//   66  130:areturn         
	}

	public void d(int i1)
	{
		if(A != null && A.a != i1)
	//*   0    0:aload_0         
	//*   1    1:getfield        #331 <Field StaggeredGridLayoutManager$SavedState A>
	//*   2    4:ifnull          25
	//*   3    7:aload_0         
	//*   4    8:getfield        #331 <Field StaggeredGridLayoutManager$SavedState A>
	//*   5   11:getfield        #416 <Field int StaggeredGridLayoutManager$SavedState.a>
	//*   6   14:iload_1         
	//*   7   15:icmpeq          25
			A.b();
	//    8   18:aload_0         
	//    9   19:getfield        #331 <Field StaggeredGridLayoutManager$SavedState A>
	//   10   22:invokevirtual   #733 <Method void android.support.v7.widget.StaggeredGridLayoutManager$SavedState.b()>
		f = i1;
	//   11   25:aload_0         
	//   12   26:iload_1         
	//   13   27:putfield        #75  <Field int f>
		g = 0x80000000;
	//   14   30:aload_0         
	//   15   31:ldc1            #76  <Int 0x80000000>
	//   16   33:putfield        #78  <Field int g>
		n();
	//   17   36:aload_0         
	//   18   37:invokevirtual   #565 <Method void n()>
	//   19   40:return          
	}

	public boolean d()
	{
		return j == 0;
	//    0    0:aload_0         
	//    1    1:getfield        #102 <Field int j>
	//    2    4:ifne            9
	//    3    7:iconst_1        
	//    4    8:ireturn         
	//    5    9:iconst_0        
	//    6   10:ireturn         
	}

	public int e(RecyclerView.r r1)
	{
		return i(r1);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #735 <Method int i(RecyclerView$r)>
	//    3    5:ireturn         
	}

	void e(int i1)
	{
		k = i1 / i;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:aload_0         
	//    3    3:getfield        #69  <Field int i>
	//    4    6:idiv            
	//    5    7:putfield        #176 <Field int k>
		B = android.view.View.MeasureSpec.makeMeasureSpec(i1, c.h());
	//    6   10:aload_0         
	//    7   11:iload_1         
	//    8   12:aload_0         
	//    9   13:getfield        #142 <Field ah c>
	//   10   16:invokevirtual   #150 <Method int ah.h()>
	//   11   19:invokestatic    #525 <Method int android.view.View$MeasureSpec.makeMeasureSpec(int, int)>
	//   12   22:putfield        #481 <Field int B>
	//   13   25:return          
	}

	public boolean e()
	{
		return j == 1;
	//    0    0:aload_0         
	//    1    1:getfield        #102 <Field int j>
	//    2    4:iconst_1        
	//    3    5:icmpne          10
	//    4    8:iconst_1        
	//    5    9:ireturn         
	//    6   10:iconst_0        
	//    7   11:ireturn         
	}

	public int f(RecyclerView.r r1)
	{
		return i(r1);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #735 <Method int i(RecyclerView$r)>
	//    3    5:ireturn         
	}

	boolean f()
	{
		if(u() != 0 && n != 0)
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #154 <Method int u()>
	//*   2    4:ifeq            204
	//*   3    7:aload_0         
	//*   4    8:getfield        #83  <Field int n>
	//*   5   11:ifeq            204
		{
			if(!p())
	//*   6   14:aload_0         
	//*   7   15:invokevirtual   #737 <Method boolean p()>
	//*   8   18:ifne            23
				return false;
	//    9   21:iconst_0        
	//   10   22:ireturn         
			int i1;
			int j1;
			if(e)
	//*  11   23:aload_0         
	//*  12   24:getfield        #73  <Field boolean e>
	//*  13   27:ifeq            43
			{
				i1 = J();
	//   14   30:aload_0         
	//   15   31:invokevirtual   #556 <Method int J()>
	//   16   34:istore_1        
				j1 = K();
	//   17   35:aload_0         
	//   18   36:invokevirtual   #559 <Method int K()>
	//   19   39:istore_2        
			} else
	//*  20   40:goto            53
			{
				i1 = K();
	//   21   43:aload_0         
	//   22   44:invokevirtual   #559 <Method int K()>
	//   23   47:istore_1        
				j1 = J();
	//   24   48:aload_0         
	//   25   49:invokevirtual   #556 <Method int J()>
	//   26   52:istore_2        
			}
			if(i1 == 0 && g() != null)
	//*  27   53:iload_1         
	//*  28   54:ifne            81
	//*  29   57:aload_0         
	//*  30   58:invokevirtual   #394 <Method View g()>
	//*  31   61:ifnull          81
			{
				h.a();
	//   32   64:aload_0         
	//   33   65:getfield        #81  <Field StaggeredGridLayoutManager$LazySpanLookup h>
	//   34   68:invokevirtual   #355 <Method void StaggeredGridLayoutManager$LazySpanLookup.a()>
			} else
	//*  35   71:aload_0         
	//*  36   72:invokevirtual   #739 <Method void H()>
	//*  37   75:aload_0         
	//*  38   76:invokevirtual   #565 <Method void n()>
	//*  39   79:iconst_1        
	//*  40   80:ireturn         
			{
				if(!E)
	//*  41   81:aload_0         
	//*  42   82:getfield        #95  <Field boolean E>
	//*  43   85:ifne            90
					return false;
	//   44   88:iconst_0        
	//   45   89:ireturn         
				byte byte0;
				if(e)
	//*  46   90:aload_0         
	//*  47   91:getfield        #73  <Field boolean e>
	//*  48   94:ifeq            102
					byte0 = -1;
	//   49   97:iconst_m1       
	//   50   98:istore_3        
				else
	//*  51   99:goto            104
					byte0 = 1;
	//   52  102:iconst_1        
	//   53  103:istore_3        
				Object obj = ((Object) (h));
	//   54  104:aload_0         
	//   55  105:getfield        #81  <Field StaggeredGridLayoutManager$LazySpanLookup h>
	//   56  108:astore          4
				j1++;
	//   57  110:iload_2         
	//   58  111:iconst_1        
	//   59  112:iadd            
	//   60  113:istore_2        
				obj = ((Object) (((LazySpanLookup) (obj)).a(i1, j1, ((int) (byte0)), true)));
	//   61  114:aload           4
	//   62  116:iload_1         
	//   63  117:iload_2         
	//   64  118:iload_3         
	//   65  119:iconst_1        
	//   66  120:invokevirtual   #742 <Method StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem StaggeredGridLayoutManager$LazySpanLookup.a(int, int, int, boolean)>
	//   67  123:astore          4
				if(obj == null)
	//*  68  125:aload           4
	//*  69  127:ifnonnull       146
				{
					E = false;
	//   70  130:aload_0         
	//   71  131:iconst_0        
	//   72  132:putfield        #95  <Field boolean E>
					h.a(j1);
	//   73  135:aload_0         
	//   74  136:getfield        #81  <Field StaggeredGridLayoutManager$LazySpanLookup h>
	//   75  139:iload_2         
	//   76  140:invokevirtual   #743 <Method int StaggeredGridLayoutManager$LazySpanLookup.a(int)>
	//   77  143:pop             
					return false;
	//   78  144:iconst_0        
	//   79  145:ireturn         
				}
				LazySpanLookup.FullSpanItem fullspanitem = h.a(i1, ((LazySpanLookup.FullSpanItem) (obj)).a, byte0 * -1, true);
	//   80  146:aload_0         
	//   81  147:getfield        #81  <Field StaggeredGridLayoutManager$LazySpanLookup h>
	//   82  150:iload_1         
	//   83  151:aload           4
	//   84  153:getfield        #263 <Field int StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem.a>
	//   85  156:iload_3         
	//   86  157:iconst_m1       
	//   87  158:imul            
	//   88  159:iconst_1        
	//   89  160:invokevirtual   #742 <Method StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem StaggeredGridLayoutManager$LazySpanLookup.a(int, int, int, boolean)>
	//   90  163:astore          5
				if(fullspanitem == null)
	//*  91  165:aload           5
	//*  92  167:ifnonnull       186
					h.a(((LazySpanLookup.FullSpanItem) (obj)).a);
	//   93  170:aload_0         
	//   94  171:getfield        #81  <Field StaggeredGridLayoutManager$LazySpanLookup h>
	//   95  174:aload           4
	//   96  176:getfield        #263 <Field int StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem.a>
	//   97  179:invokevirtual   #743 <Method int StaggeredGridLayoutManager$LazySpanLookup.a(int)>
	//   98  182:pop             
				else
	//*  99  183:goto            71
					h.a(fullspanitem.a + 1);
	//  100  186:aload_0         
	//  101  187:getfield        #81  <Field StaggeredGridLayoutManager$LazySpanLookup h>
	//  102  190:aload           5
	//  103  192:getfield        #263 <Field int StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem.a>
	//  104  195:iconst_1        
	//  105  196:iadd            
	//  106  197:invokevirtual   #743 <Method int StaggeredGridLayoutManager$LazySpanLookup.a(int)>
	//  107  200:pop             
			}
			H();
			n();
			return true;
		} else
	//* 108  201:goto            71
		{
			return false;
	//  109  204:iconst_0        
	//  110  205:ireturn         
		}
	}

	public int g(RecyclerView.r r1)
	{
		return j(r1);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #745 <Method int j(RecyclerView$r)>
	//    3    5:ireturn         
	}

	View g()
	{
		int i1 = u() - 1;
	//    0    0:aload_0         
	//    1    1:invokevirtual   #154 <Method int u()>
	//    2    4:iconst_1        
	//    3    5:isub            
	//    4    6:istore_1        
		BitSet bitset = new BitSet(i);
	//    5    7:new             #206 <Class BitSet>
	//    6   10:dup             
	//    7   11:aload_0         
	//    8   12:getfield        #69  <Field int i>
	//    9   15:invokespecial   #621 <Method void BitSet(int)>
	//   10   18:astore          7
		bitset.set(0, i, true);
	//   11   20:aload           7
	//   12   22:iconst_0        
	//   13   23:aload_0         
	//   14   24:getfield        #69  <Field int i>
	//   15   27:iconst_1        
	//   16   28:invokevirtual   #210 <Method void BitSet.set(int, int, boolean)>
		int k1 = j;
	//   17   31:aload_0         
	//   18   32:getfield        #102 <Field int j>
	//   19   35:istore_2        
		byte byte0 = -1;
	//   20   36:iconst_m1       
	//   21   37:istore          5
		if(k1 == 1 && i())
	//*  22   39:iload_2         
	//*  23   40:iconst_1        
	//*  24   41:icmpne          56
	//*  25   44:aload_0         
	//*  26   45:invokevirtual   #146 <Method boolean i()>
	//*  27   48:ifeq            56
			k1 = 1;
	//   28   51:iconst_1        
	//   29   52:istore_2        
		else
	//*  30   53:goto            58
			k1 = -1;
	//   31   56:iconst_m1       
	//   32   57:istore_2        
		int l1;
		if(e)
	//*  33   58:aload_0         
	//*  34   59:getfield        #73  <Field boolean e>
	//*  35   62:ifeq            70
		{
			l1 = -1;
	//   36   65:iconst_m1       
	//   37   66:istore_3        
		} else
	//*  38   67:goto            76
		{
			l1 = i1 + 1;
	//   39   70:iload_1         
	//   40   71:iconst_1        
	//   41   72:iadd            
	//   42   73:istore_3        
			i1 = 0;
	//   43   74:iconst_0        
	//   44   75:istore_1        
		}
		int i2 = i1;
	//   45   76:iload_1         
	//   46   77:istore          4
		if(i1 < l1)
	//*  47   79:iload_1         
	//*  48   80:iload_3         
	//*  49   81:icmpge          90
		{
			byte0 = 1;
	//   50   84:iconst_1        
	//   51   85:istore          5
			i2 = i1;
	//   52   87:iload_1         
	//   53   88:istore          4
		}
		for(; i2 != l1; i2 += ((int) (byte0)))
	//*  54   90:iload           4
	//*  55   92:iload_3         
	//*  56   93:icmpeq          349
		{
			int j1;
			View view;
			LayoutParams layoutparams;
			Object obj;
label0:
			{
label1:
				{
					view = h(i2);
	//   57   96:aload_0         
	//   58   97:iload           4
	//   59   99:invokevirtual   #157 <Method View h(int)>
	//   60  102:astore          8
					layoutparams = (LayoutParams)view.getLayoutParams();
	//   61  104:aload           8
	//   62  106:invokevirtual   #166 <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//   63  109:checkcast       #8   <Class StaggeredGridLayoutManager$LayoutParams>
	//   64  112:astore          9
					if(bitset.get(layoutparams.a.e))
	//*  65  114:aload           7
	//*  66  116:aload           9
	//*  67  118:getfield        #193 <Field StaggeredGridLayoutManager$b StaggeredGridLayoutManager$LayoutParams.a>
	//*  68  121:getfield        #195 <Field int StaggeredGridLayoutManager$b.e>
	//*  69  124:invokevirtual   #747 <Method boolean BitSet.get(int)>
	//*  70  127:ifeq            158
					{
						if(a(layoutparams.a))
	//*  71  130:aload_0         
	//*  72  131:aload           9
	//*  73  133:getfield        #193 <Field StaggeredGridLayoutManager$b StaggeredGridLayoutManager$LayoutParams.a>
	//*  74  136:invokespecial   #749 <Method boolean a(StaggeredGridLayoutManager$b)>
	//*  75  139:ifeq            145
							return view;
	//   76  142:aload           8
	//   77  144:areturn         
						bitset.clear(layoutparams.a.e);
	//   78  145:aload           7
	//   79  147:aload           9
	//   80  149:getfield        #193 <Field StaggeredGridLayoutManager$b StaggeredGridLayoutManager$LayoutParams.a>
	//   81  152:getfield        #195 <Field int StaggeredGridLayoutManager$b.e>
	//   82  155:invokevirtual   #751 <Method void BitSet.clear(int)>
					}
					if(layoutparams.b)
	//*  83  158:aload           9
	//*  84  160:getfield        #190 <Field boolean android.support.v7.widget.StaggeredGridLayoutManager$LayoutParams.b>
	//*  85  163:ifeq            169
						continue;
	//   86  166:goto            339
					j1 = i2 + byte0;
	//   87  169:iload           4
	//   88  171:iload           5
	//   89  173:iadd            
	//   90  174:istore_1        
					if(j1 == l1)
						continue;
	//   91  175:iload_1         
	//   92  176:iload_3         
	//   93  177:icmpeq          339
					obj = ((Object) (h(j1)));
	//   94  180:aload_0         
	//   95  181:iload_1         
	//   96  182:invokevirtual   #157 <Method View h(int)>
	//   97  185:astore          10
					if(e)
	//*  98  187:aload_0         
	//*  99  188:getfield        #73  <Field boolean e>
	//* 100  191:ifeq            233
					{
						j1 = b.b(view);
	//  101  194:aload_0         
	//  102  195:getfield        #140 <Field ah b>
	//  103  198:aload           8
	//  104  200:invokevirtual   #318 <Method int android.support.v7.widget.ah.b(View)>
	//  105  203:istore_1        
						int j2 = b.b(((View) (obj)));
	//  106  204:aload_0         
	//  107  205:getfield        #140 <Field ah b>
	//  108  208:aload           10
	//  109  210:invokevirtual   #318 <Method int android.support.v7.widget.ah.b(View)>
	//  110  213:istore          6
						if(j1 < j2)
	//* 111  215:iload_1         
	//* 112  216:iload           6
	//* 113  218:icmpge          224
							return view;
	//  114  221:aload           8
	//  115  223:areturn         
						if(j1 != j2)
	//* 116  224:iload_1         
	//* 117  225:iload           6
	//* 118  227:icmpne          274
							break label1;
	//  119  230:goto            269
					} else
					{
						j1 = b.a(view);
	//  120  233:aload_0         
	//  121  234:getfield        #140 <Field ah b>
	//  122  237:aload           8
	//  123  239:invokevirtual   #544 <Method int ah.a(View)>
	//  124  242:istore_1        
						int k2 = b.a(((View) (obj)));
	//  125  243:aload_0         
	//  126  244:getfield        #140 <Field ah b>
	//  127  247:aload           10
	//  128  249:invokevirtual   #544 <Method int ah.a(View)>
	//  129  252:istore          6
						if(j1 > k2)
	//* 130  254:iload_1         
	//* 131  255:iload           6
	//* 132  257:icmple          263
							return view;
	//  133  260:aload           8
	//  134  262:areturn         
						if(j1 != k2)
							break label1;
	//  135  263:iload_1         
	//  136  264:iload           6
	//  137  266:icmpne          274
					}
					j1 = 1;
	//  138  269:iconst_1        
	//  139  270:istore_1        
					break label0;
	//  140  271:goto            276
				}
				j1 = 0;
	//  141  274:iconst_0        
	//  142  275:istore_1        
			}
			if(!j1)
				continue;
	//  143  276:iload_1         
	//  144  277:ifeq            339
			obj = ((Object) ((LayoutParams)((View) (obj)).getLayoutParams()));
	//  145  280:aload           10
	//  146  282:invokevirtual   #166 <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//  147  285:checkcast       #8   <Class StaggeredGridLayoutManager$LayoutParams>
	//  148  288:astore          10
			if(layoutparams.a.e - ((LayoutParams) (obj)).a.e < 0)
	//* 149  290:aload           9
	//* 150  292:getfield        #193 <Field StaggeredGridLayoutManager$b StaggeredGridLayoutManager$LayoutParams.a>
	//* 151  295:getfield        #195 <Field int StaggeredGridLayoutManager$b.e>
	//* 152  298:aload           10
	//* 153  300:getfield        #193 <Field StaggeredGridLayoutManager$b StaggeredGridLayoutManager$LayoutParams.a>
	//* 154  303:getfield        #195 <Field int StaggeredGridLayoutManager$b.e>
	//* 155  306:isub            
	//* 156  307:ifge            315
				j1 = 1;
	//  157  310:iconst_1        
	//  158  311:istore_1        
			else
	//* 159  312:goto            317
				j1 = 0;
	//  160  315:iconst_0        
	//  161  316:istore_1        
			boolean flag;
			if(k1 < 0)
	//* 162  317:iload_2         
	//* 163  318:ifge            327
				flag = true;
	//  164  321:iconst_1        
	//  165  322:istore          6
			else
	//* 166  324:goto            330
				flag = false;
	//  167  327:iconst_0        
	//  168  328:istore          6
			if(j1 != flag)
	//* 169  330:iload_1         
	//* 170  331:iload           6
	//* 171  333:icmpeq          339
				return view;
	//  172  336:aload           8
	//  173  338:areturn         
		}

	//  174  339:iload           4
	//  175  341:iload           5
	//  176  343:iadd            
	//  177  344:istore          4
	//* 178  346:goto            90
		return null;
	//  179  349:aconst_null     
	//  180  350:areturn         
	}

	public int h(RecyclerView.r r1)
	{
		return j(r1);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #745 <Method int j(RecyclerView$r)>
	//    3    5:ireturn         
	}

	public void h()
	{
		h.a();
	//    0    0:aload_0         
	//    1    1:getfield        #81  <Field StaggeredGridLayoutManager$LazySpanLookup h>
	//    2    4:invokevirtual   #355 <Method void StaggeredGridLayoutManager$LazySpanLookup.a()>
		n();
	//    3    7:aload_0         
	//    4    8:invokevirtual   #565 <Method void n()>
	//    5   11:return          
	}

	public void i(int i1)
	{
		super.i(i1);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokespecial   #753 <Method void RecyclerView$h.i(int)>
		for(int j1 = 0; j1 < i; j1++)
	//*   3    5:iconst_0        
	//*   4    6:istore_2        
	//*   5    7:iload_2         
	//*   6    8:aload_0         
	//*   7    9:getfield        #69  <Field int i>
	//*   8   12:icmpge          32
			a[j1].d(i1);
	//    9   15:aload_0         
	//   10   16:getfield        #238 <Field StaggeredGridLayoutManager$b[] a>
	//   11   19:iload_2         
	//   12   20:aaload          
	//   13   21:iload_1         
	//   14   22:invokevirtual   #755 <Method void StaggeredGridLayoutManager$b.d(int)>

	//   15   25:iload_2         
	//   16   26:iconst_1        
	//   17   27:iadd            
	//   18   28:istore_2        
	//*  19   29:goto            7
	//   20   32:return          
	}

	boolean i()
	{
		return s() == 1;
	//    0    0:aload_0         
	//    1    1:invokevirtual   #757 <Method int s()>
	//    2    4:iconst_1        
	//    3    5:icmpne          10
	//    4    8:iconst_1        
	//    5    9:ireturn         
	//    6   10:iconst_0        
	//    7   11:ireturn         
	}

	int j()
	{
		View view;
		if(e)
	//*   0    0:aload_0         
	//*   1    1:getfield        #73  <Field boolean e>
	//*   2    4:ifeq            16
			view = d(true);
	//    3    7:aload_0         
	//    4    8:iconst_1        
	//    5    9:invokevirtual   #531 <Method View d(boolean)>
	//    6   12:astore_1        
		else
	//*   7   13:goto            22
			view = b(true);
	//    8   16:aload_0         
	//    9   17:iconst_1        
	//   10   18:invokevirtual   #529 <Method View b(boolean)>
	//   11   21:astore_1        
		if(view == null)
	//*  12   22:aload_1         
	//*  13   23:ifnonnull       28
			return -1;
	//   14   26:iconst_m1       
	//   15   27:ireturn         
		else
			return d(view);
	//   16   28:aload_0         
	//   17   29:aload_1         
	//   18   30:invokevirtual   #580 <Method int d(View)>
	//   19   33:ireturn         
	}

	public void j(int i1)
	{
		super.j(i1);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokespecial   #759 <Method void RecyclerView$h.j(int)>
		for(int j1 = 0; j1 < i; j1++)
	//*   3    5:iconst_0        
	//*   4    6:istore_2        
	//*   5    7:iload_2         
	//*   6    8:aload_0         
	//*   7    9:getfield        #69  <Field int i>
	//*   8   12:icmpge          32
			a[j1].d(i1);
	//    9   15:aload_0         
	//   10   16:getfield        #238 <Field StaggeredGridLayoutManager$b[] a>
	//   11   19:iload_2         
	//   12   20:aaload          
	//   13   21:iload_1         
	//   14   22:invokevirtual   #755 <Method void StaggeredGridLayoutManager$b.d(int)>

	//   15   25:iload_2         
	//   16   26:iconst_1        
	//   17   27:iadd            
	//   18   28:istore_2        
	//*  19   29:goto            7
	//   20   32:return          
	}

	public void k(int i1)
	{
		if(i1 == 0)
	//*   0    0:iload_1         
	//*   1    1:ifne            9
			f();
	//    2    4:aload_0         
	//    3    5:invokevirtual   #399 <Method boolean f()>
	//    4    8:pop             
	//    5    9:return          
	}

	boolean l()
	{
		int j1 = a[0].b(0x80000000);
	//    0    0:aload_0         
	//    1    1:getfield        #238 <Field StaggeredGridLayoutManager$b[] a>
	//    2    4:iconst_0        
	//    3    5:aaload          
	//    4    6:ldc1            #76  <Int 0x80000000>
	//    5    8:invokevirtual   #258 <Method int android.support.v7.widget.StaggeredGridLayoutManager$b.b(int)>
	//    6   11:istore_2        
		for(int i1 = 1; i1 < i; i1++)
	//*   7   12:iconst_1        
	//*   8   13:istore_1        
	//*   9   14:iload_1         
	//*  10   15:aload_0         
	//*  11   16:getfield        #69  <Field int i>
	//*  12   19:icmpge          46
			if(a[i1].b(0x80000000) != j1)
	//*  13   22:aload_0         
	//*  14   23:getfield        #238 <Field StaggeredGridLayoutManager$b[] a>
	//*  15   26:iload_1         
	//*  16   27:aaload          
	//*  17   28:ldc1            #76  <Int 0x80000000>
	//*  18   30:invokevirtual   #258 <Method int android.support.v7.widget.StaggeredGridLayoutManager$b.b(int)>
	//*  19   33:iload_2         
	//*  20   34:icmpeq          39
				return false;
	//   21   37:iconst_0        
	//   22   38:ireturn         

	//   23   39:iload_1         
	//   24   40:iconst_1        
	//   25   41:iadd            
	//   26   42:istore_1        
	//*  27   43:goto            14
		return true;
	//   28   46:iconst_1        
	//   29   47:ireturn         
	}

	boolean m()
	{
		int j1 = a[0].a(0x80000000);
	//    0    0:aload_0         
	//    1    1:getfield        #238 <Field StaggeredGridLayoutManager$b[] a>
	//    2    4:iconst_0        
	//    3    5:aaload          
	//    4    6:ldc1            #76  <Int 0x80000000>
	//    5    8:invokevirtual   #271 <Method int StaggeredGridLayoutManager$b.a(int)>
	//    6   11:istore_2        
		for(int i1 = 1; i1 < i; i1++)
	//*   7   12:iconst_1        
	//*   8   13:istore_1        
	//*   9   14:iload_1         
	//*  10   15:aload_0         
	//*  11   16:getfield        #69  <Field int i>
	//*  12   19:icmpge          46
			if(a[i1].a(0x80000000) != j1)
	//*  13   22:aload_0         
	//*  14   23:getfield        #238 <Field StaggeredGridLayoutManager$b[] a>
	//*  15   26:iload_1         
	//*  16   27:aaload          
	//*  17   28:ldc1            #76  <Int 0x80000000>
	//*  18   30:invokevirtual   #271 <Method int StaggeredGridLayoutManager$b.a(int)>
	//*  19   33:iload_2         
	//*  20   34:icmpeq          39
				return false;
	//   21   37:iconst_0        
	//   22   38:ireturn         

	//   23   39:iload_1         
	//   24   40:iconst_1        
	//   25   41:iadd            
	//   26   42:istore_1        
	//*  27   43:goto            14
		return true;
	//   28   46:iconst_1        
	//   29   47:ireturn         
	}

	private SavedState A;
	private int B;
	private final Rect C;
	private final a D;
	private boolean E;
	private boolean F;
	private int G[];
	private final Runnable H;
	b a[];
	ah b;
	ah c;
	boolean d;
	boolean e;
	int f;
	int g;
	LazySpanLookup h;
	private int i;
	private int j;
	private int k;
	private final ae l;
	private BitSet m;
	private int n;
	private boolean o;
	private boolean z;
}
