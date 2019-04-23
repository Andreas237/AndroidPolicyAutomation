// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.widget;

import android.view.View;
import android.widget.ListView;

public final class ListViewCompat
{

	private ListViewCompat()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #8   <Method void Object()>
	//    2    4:return          
	}

	public static boolean canScrollList(ListView listview, int i)
	{
		boolean flag;
label0:
		{
			if(android.os.Build.VERSION.SDK_INT >= 19)
	//*   0    0:getstatic       #18  <Field int android.os.Build$VERSION.SDK_INT>
	//*   1    3:bipush          19
	//*   2    5:icmplt          14
				return listview.canScrollList(i);
	//    3    8:aload_0         
	//    4    9:iload_1         
	//    5   10:invokevirtual   #23  <Method boolean ListView.canScrollList(int)>
	//    6   13:ireturn         
			int k = listview.getChildCount();
	//    7   14:aload_0         
	//    8   15:invokevirtual   #27  <Method int ListView.getChildCount()>
	//    9   18:istore_3        
			boolean flag1 = false;
	//   10   19:iconst_0        
	//   11   20:istore          5
			flag = false;
	//   12   22:iconst_0        
	//   13   23:istore          4
			if(k == 0)
	//*  14   25:iload_3         
	//*  15   26:ifne            31
				return false;
	//   16   29:iconst_0        
	//   17   30:ireturn         
			int j = listview.getFirstVisiblePosition();
	//   18   31:aload_0         
	//   19   32:invokevirtual   #30  <Method int ListView.getFirstVisiblePosition()>
	//   20   35:istore_2        
			if(i > 0)
	//*  21   36:iload_1         
	//*  22   37:ifle            80
			{
				i = listview.getChildAt(k - 1).getBottom();
	//   23   40:aload_0         
	//   24   41:iload_3         
	//   25   42:iconst_1        
	//   26   43:isub            
	//   27   44:invokevirtual   #34  <Method View ListView.getChildAt(int)>
	//   28   47:invokevirtual   #39  <Method int View.getBottom()>
	//   29   50:istore_1        
				if(j + k < listview.getCount() || i > listview.getHeight() - listview.getListPaddingBottom())
	//*  30   51:iload_2         
	//*  31   52:iload_3         
	//*  32   53:iadd            
	//*  33   54:aload_0         
	//*  34   55:invokevirtual   #42  <Method int ListView.getCount()>
	//*  35   58:icmplt          74
	//*  36   61:iload_1         
	//*  37   62:aload_0         
	//*  38   63:invokevirtual   #45  <Method int ListView.getHeight()>
	//*  39   66:aload_0         
	//*  40   67:invokevirtual   #48  <Method int ListView.getListPaddingBottom()>
	//*  41   70:isub            
	//*  42   71:icmple          77
					flag = true;
	//   43   74:iconst_1        
	//   44   75:istore          4
				return flag;
	//   45   77:iload           4
	//   46   79:ireturn         
			}
			i = listview.getChildAt(0).getTop();
	//   47   80:aload_0         
	//   48   81:iconst_0        
	//   49   82:invokevirtual   #34  <Method View ListView.getChildAt(int)>
	//   50   85:invokevirtual   #51  <Method int View.getTop()>
	//   51   88:istore_1        
			if(j <= 0)
	//*  52   89:iload_2         
	//*  53   90:ifgt            105
			{
				flag = flag1;
	//   54   93:iload           5
	//   55   95:istore          4
				if(i >= listview.getListPaddingTop())
					break label0;
	//   56   97:iload_1         
	//   57   98:aload_0         
	//   58   99:invokevirtual   #54  <Method int ListView.getListPaddingTop()>
	//   59  102:icmpge          108
			}
			flag = true;
	//   60  105:iconst_1        
	//   61  106:istore          4
		}
		return flag;
	//   62  108:iload           4
	//   63  110:ireturn         
	}

	public static void scrollListBy(ListView listview, int i)
	{
		if(android.os.Build.VERSION.SDK_INT >= 19)
	//*   0    0:getstatic       #18  <Field int android.os.Build$VERSION.SDK_INT>
	//*   1    3:bipush          19
	//*   2    5:icmplt          14
		{
			listview.scrollListBy(i);
	//    3    8:aload_0         
	//    4    9:iload_1         
	//    5   10:invokevirtual   #60  <Method void ListView.scrollListBy(int)>
			return;
	//    6   13:return          
		}
		int j = listview.getFirstVisiblePosition();
	//    7   14:aload_0         
	//    8   15:invokevirtual   #30  <Method int ListView.getFirstVisiblePosition()>
	//    9   18:istore_2        
		if(j == -1)
	//*  10   19:iload_2         
	//*  11   20:iconst_m1       
	//*  12   21:icmpne          25
			return;
	//   13   24:return          
		View view = listview.getChildAt(0);
	//   14   25:aload_0         
	//   15   26:iconst_0        
	//   16   27:invokevirtual   #34  <Method View ListView.getChildAt(int)>
	//   17   30:astore_3        
		if(view == null)
	//*  18   31:aload_3         
	//*  19   32:ifnonnull       36
		{
			return;
	//   20   35:return          
		} else
		{
			listview.setSelectionFromTop(j, view.getTop() - i);
	//   21   36:aload_0         
	//   22   37:iload_2         
	//   23   38:aload_3         
	//   24   39:invokevirtual   #51  <Method int View.getTop()>
	//   25   42:iload_1         
	//   26   43:isub            
	//   27   44:invokevirtual   #64  <Method void ListView.setSelectionFromTop(int, int)>
			return;
	//   28   47:return          
		}
	}
}
