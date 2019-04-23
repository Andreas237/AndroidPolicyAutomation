// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.design.internal;


// Referenced classes of package android.support.design.internal:
//			NavigationMenuPresenter

private static class NavigationMenuPresenter$NavigationMenuSeparatorItem
	implements NavigationMenuPresenter.NavigationMenuItem
{

	public int getPaddingBottom()
	{
		return paddingBottom;
	//    0    0:aload_0         
	//    1    1:getfield        #21  <Field int paddingBottom>
	//    2    4:ireturn         
	}

	public int getPaddingTop()
	{
		return paddingTop;
	//    0    0:aload_0         
	//    1    1:getfield        #19  <Field int paddingTop>
	//    2    4:ireturn         
	}

	private final int paddingBottom;
	private final int paddingTop;

	public NavigationMenuPresenter$NavigationMenuSeparatorItem(int i, int j)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #17  <Method void Object()>
		paddingTop = i;
	//    2    4:aload_0         
	//    3    5:iload_1         
	//    4    6:putfield        #19  <Field int paddingTop>
		paddingBottom = j;
	//    5    9:aload_0         
	//    6   10:iload_2         
	//    7   11:putfield        #21  <Field int paddingBottom>
	//    8   14:return          
	}
}
