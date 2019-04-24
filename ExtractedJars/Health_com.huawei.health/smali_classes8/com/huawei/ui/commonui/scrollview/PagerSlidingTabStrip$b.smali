.class Lcom/huawei/ui/commonui/scrollview/PagerSlidingTabStrip$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/support/v4/view/ViewPager$OnPageChangeListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/ui/commonui/scrollview/PagerSlidingTabStrip;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = "b"
.end annotation


# instance fields
.field final synthetic c:Lcom/huawei/ui/commonui/scrollview/PagerSlidingTabStrip;


# direct methods
.method private constructor <init>(Lcom/huawei/ui/commonui/scrollview/PagerSlidingTabStrip;)V
    .locals 0

    .line 733
    iput-object p1, p0, Lcom/huawei/ui/commonui/scrollview/PagerSlidingTabStrip$b;->c:Lcom/huawei/ui/commonui/scrollview/PagerSlidingTabStrip;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/huawei/ui/commonui/scrollview/PagerSlidingTabStrip;Lcom/huawei/ui/commonui/scrollview/PagerSlidingTabStrip$3;)V
    .locals 0

    .line 733
    invoke-direct {p0, p1}, Lcom/huawei/ui/commonui/scrollview/PagerSlidingTabStrip$b;-><init>(Lcom/huawei/ui/commonui/scrollview/PagerSlidingTabStrip;)V

    return-void
.end method


# virtual methods
.method public onPageScrollStateChanged(I)V
    .locals 3

    .line 751
    iget-object v0, p0, Lcom/huawei/ui/commonui/scrollview/PagerSlidingTabStrip$b;->c:Lcom/huawei/ui/commonui/scrollview/PagerSlidingTabStrip;

    iget-object v0, v0, Lcom/huawei/ui/commonui/scrollview/PagerSlidingTabStrip;->a:Landroid/support/v4/view/ViewPager$OnPageChangeListener;

    invoke-interface {v0, p1}, Landroid/support/v4/view/ViewPager$OnPageChangeListener;->onPageScrollStateChanged(I)V

    .line 752
    if-nez p1, :cond_0

    .line 753
    iget-object v0, p0, Lcom/huawei/ui/commonui/scrollview/PagerSlidingTabStrip$b;->c:Lcom/huawei/ui/commonui/scrollview/PagerSlidingTabStrip;

    iget-object v1, p0, Lcom/huawei/ui/commonui/scrollview/PagerSlidingTabStrip$b;->c:Lcom/huawei/ui/commonui/scrollview/PagerSlidingTabStrip;

    invoke-static {v1}, Lcom/huawei/ui/commonui/scrollview/PagerSlidingTabStrip;->a(Lcom/huawei/ui/commonui/scrollview/PagerSlidingTabStrip;)Landroid/support/v4/view/ViewPager;

    move-result-object v1

    invoke-virtual {v1}, Landroid/support/v4/view/ViewPager;->getCurrentItem()I

    move-result v1

    const/4 v2, 0x0

    invoke-static {v0, v1, v2}, Lcom/huawei/ui/commonui/scrollview/PagerSlidingTabStrip;->a(Lcom/huawei/ui/commonui/scrollview/PagerSlidingTabStrip;II)V

    .line 756
    :cond_0
    return-void
.end method

.method public onPageScrolled(IFI)V
    .locals 2

    .line 737
    iget-object v0, p0, Lcom/huawei/ui/commonui/scrollview/PagerSlidingTabStrip$b;->c:Lcom/huawei/ui/commonui/scrollview/PagerSlidingTabStrip;

    iget-object v0, v0, Lcom/huawei/ui/commonui/scrollview/PagerSlidingTabStrip;->a:Landroid/support/v4/view/ViewPager$OnPageChangeListener;

    invoke-interface {v0, p1, p2, p3}, Landroid/support/v4/view/ViewPager$OnPageChangeListener;->onPageScrolled(IFI)V

    .line 739
    iget-object v0, p0, Lcom/huawei/ui/commonui/scrollview/PagerSlidingTabStrip$b;->c:Lcom/huawei/ui/commonui/scrollview/PagerSlidingTabStrip;

    invoke-static {v0, p1}, Lcom/huawei/ui/commonui/scrollview/PagerSlidingTabStrip;->a(Lcom/huawei/ui/commonui/scrollview/PagerSlidingTabStrip;I)I

    .line 742
    iget-object v0, p0, Lcom/huawei/ui/commonui/scrollview/PagerSlidingTabStrip$b;->c:Lcom/huawei/ui/commonui/scrollview/PagerSlidingTabStrip;

    iget-object v1, p0, Lcom/huawei/ui/commonui/scrollview/PagerSlidingTabStrip$b;->c:Lcom/huawei/ui/commonui/scrollview/PagerSlidingTabStrip;

    iget-object v1, v1, Lcom/huawei/ui/commonui/scrollview/PagerSlidingTabStrip;->d:Landroid/widget/LinearLayout;

    invoke-virtual {v1, p1}, Landroid/widget/LinearLayout;->getChildAt(I)Landroid/view/View;

    move-result-object v1

    invoke-virtual {v1}, Landroid/view/View;->getWidth()I

    move-result v1

    int-to-float v1, v1

    mul-float/2addr v1, p2

    float-to-int v1, v1

    invoke-static {v0, p1, v1}, Lcom/huawei/ui/commonui/scrollview/PagerSlidingTabStrip;->a(Lcom/huawei/ui/commonui/scrollview/PagerSlidingTabStrip;II)V

    .line 744
    iget-object v0, p0, Lcom/huawei/ui/commonui/scrollview/PagerSlidingTabStrip$b;->c:Lcom/huawei/ui/commonui/scrollview/PagerSlidingTabStrip;

    invoke-virtual {v0}, Lcom/huawei/ui/commonui/scrollview/PagerSlidingTabStrip;->invalidate()V

    .line 747
    return-void
.end method

.method public onPageSelected(I)V
    .locals 9

    .line 760
    iget-object v0, p0, Lcom/huawei/ui/commonui/scrollview/PagerSlidingTabStrip$b;->c:Lcom/huawei/ui/commonui/scrollview/PagerSlidingTabStrip;

    iget-object v0, v0, Lcom/huawei/ui/commonui/scrollview/PagerSlidingTabStrip;->a:Landroid/support/v4/view/ViewPager$OnPageChangeListener;

    invoke-interface {v0, p1}, Landroid/support/v4/view/ViewPager$OnPageChangeListener;->onPageSelected(I)V

    .line 761
    new-instance v4, Ljava/util/HashMap;

    invoke-direct {v4}, Ljava/util/HashMap;-><init>()V

    .line 762
    const-string v0, "click"

    const-string v1, "1"

    invoke-interface {v4, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 763
    if-nez p1, :cond_0

    .line 764
    sget-object v0, Lo/dae;->bn:Lo/dae;

    invoke-virtual {v0}, Lo/dae;->b()Ljava/lang/String;

    move-result-object v5

    .line 765
    invoke-static {}, Lo/cxf;->e()Lo/cxf;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/ui/commonui/scrollview/PagerSlidingTabStrip$b;->c:Lcom/huawei/ui/commonui/scrollview/PagerSlidingTabStrip;

    invoke-virtual {v1}, Lcom/huawei/ui/commonui/scrollview/PagerSlidingTabStrip;->getContext()Landroid/content/Context;

    move-result-object v1

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v5, v4, v2}, Lo/cxf;->a(Landroid/content/Context;Ljava/lang/String;Ljava/util/Map;I)I

    .line 766
    iget-object v0, p0, Lcom/huawei/ui/commonui/scrollview/PagerSlidingTabStrip$b;->c:Lcom/huawei/ui/commonui/scrollview/PagerSlidingTabStrip;

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v1

    invoke-static {v0, v1, v2}, Lcom/huawei/ui/commonui/scrollview/PagerSlidingTabStrip;->d(Lcom/huawei/ui/commonui/scrollview/PagerSlidingTabStrip;J)J

    .line 767
    goto/16 :goto_1

    :cond_0
    const/4 v0, 0x1

    if-ne p1, v0, :cond_2

    .line 768
    const/4 v5, 0x0

    .line 769
    invoke-static {}, Lo/czu;->e()Z

    move-result v0

    if-nez v0, :cond_1

    .line 770
    sget-object v0, Lo/dae;->cg:Lo/dae;

    invoke-virtual {v0}, Lo/dae;->b()Ljava/lang/String;

    move-result-object v5

    goto :goto_0

    .line 772
    :cond_1
    sget-object v0, Lo/dae;->dt:Lo/dae;

    invoke-virtual {v0}, Lo/dae;->b()Ljava/lang/String;

    move-result-object v5

    .line 774
    :goto_0
    invoke-static {}, Lo/cxf;->e()Lo/cxf;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/ui/commonui/scrollview/PagerSlidingTabStrip$b;->c:Lcom/huawei/ui/commonui/scrollview/PagerSlidingTabStrip;

    invoke-virtual {v1}, Lcom/huawei/ui/commonui/scrollview/PagerSlidingTabStrip;->getContext()Landroid/content/Context;

    move-result-object v1

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v5, v4, v2}, Lo/cxf;->a(Landroid/content/Context;Ljava/lang/String;Ljava/util/Map;I)I

    .line 775
    iget-object v0, p0, Lcom/huawei/ui/commonui/scrollview/PagerSlidingTabStrip$b;->c:Lcom/huawei/ui/commonui/scrollview/PagerSlidingTabStrip;

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v1

    invoke-static {v0, v1, v2}, Lcom/huawei/ui/commonui/scrollview/PagerSlidingTabStrip;->d(Lcom/huawei/ui/commonui/scrollview/PagerSlidingTabStrip;J)J

    .line 776
    goto :goto_1

    :cond_2
    const/4 v0, 0x2

    if-ne p1, v0, :cond_3

    .line 777
    sget-object v0, Lo/dae;->ct:Lo/dae;

    invoke-virtual {v0}, Lo/dae;->b()Ljava/lang/String;

    move-result-object v5

    .line 778
    invoke-static {}, Lo/cxf;->e()Lo/cxf;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/ui/commonui/scrollview/PagerSlidingTabStrip$b;->c:Lcom/huawei/ui/commonui/scrollview/PagerSlidingTabStrip;

    invoke-virtual {v1}, Lcom/huawei/ui/commonui/scrollview/PagerSlidingTabStrip;->getContext()Landroid/content/Context;

    move-result-object v1

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v5, v4, v2}, Lo/cxf;->a(Landroid/content/Context;Ljava/lang/String;Ljava/util/Map;I)I

    .line 779
    iget-object v0, p0, Lcom/huawei/ui/commonui/scrollview/PagerSlidingTabStrip$b;->c:Lcom/huawei/ui/commonui/scrollview/PagerSlidingTabStrip;

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v1

    invoke-static {v0, v1, v2}, Lcom/huawei/ui/commonui/scrollview/PagerSlidingTabStrip;->d(Lcom/huawei/ui/commonui/scrollview/PagerSlidingTabStrip;J)J

    .line 780
    goto :goto_1

    .line 781
    :cond_3
    sget-object v0, Lo/dae;->dt:Lo/dae;

    invoke-virtual {v0}, Lo/dae;->b()Ljava/lang/String;

    move-result-object v5

    .line 782
    invoke-static {}, Lo/cxf;->e()Lo/cxf;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/ui/commonui/scrollview/PagerSlidingTabStrip$b;->c:Lcom/huawei/ui/commonui/scrollview/PagerSlidingTabStrip;

    invoke-virtual {v1}, Lcom/huawei/ui/commonui/scrollview/PagerSlidingTabStrip;->getContext()Landroid/content/Context;

    move-result-object v1

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v5, v4, v2}, Lo/cxf;->a(Landroid/content/Context;Ljava/lang/String;Ljava/util/Map;I)I

    .line 783
    iget-object v0, p0, Lcom/huawei/ui/commonui/scrollview/PagerSlidingTabStrip$b;->c:Lcom/huawei/ui/commonui/scrollview/PagerSlidingTabStrip;

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v1

    invoke-static {v0, v1, v2}, Lcom/huawei/ui/commonui/scrollview/PagerSlidingTabStrip;->d(Lcom/huawei/ui/commonui/scrollview/PagerSlidingTabStrip;J)J

    .line 785
    :goto_1
    invoke-static {}, Lo/czu;->b()Z

    move-result v0

    if-eqz v0, :cond_4

    .line 786
    iget-object v0, p0, Lcom/huawei/ui/commonui/scrollview/PagerSlidingTabStrip$b;->c:Lcom/huawei/ui/commonui/scrollview/PagerSlidingTabStrip;

    const/4 v1, 0x1

    invoke-static {v0, v1}, Lcom/huawei/ui/commonui/scrollview/PagerSlidingTabStrip;->c(Lcom/huawei/ui/commonui/scrollview/PagerSlidingTabStrip;I)I

    goto :goto_2

    .line 788
    :cond_4
    iget-object v0, p0, Lcom/huawei/ui/commonui/scrollview/PagerSlidingTabStrip$b;->c:Lcom/huawei/ui/commonui/scrollview/PagerSlidingTabStrip;

    const/4 v1, 0x3

    invoke-static {v0, v1}, Lcom/huawei/ui/commonui/scrollview/PagerSlidingTabStrip;->c(Lcom/huawei/ui/commonui/scrollview/PagerSlidingTabStrip;I)I

    .line 791
    :goto_2
    if-eqz p1, :cond_5

    iget-object v0, p0, Lcom/huawei/ui/commonui/scrollview/PagerSlidingTabStrip$b;->c:Lcom/huawei/ui/commonui/scrollview/PagerSlidingTabStrip;

    invoke-static {v0}, Lcom/huawei/ui/commonui/scrollview/PagerSlidingTabStrip;->k(Lcom/huawei/ui/commonui/scrollview/PagerSlidingTabStrip;)I

    move-result v0

    if-eq p1, v0, :cond_5

    const/4 v0, 0x2

    if-eq p1, v0, :cond_5

    const/4 v0, 0x1

    if-ne p1, v0, :cond_6

    .line 796
    :cond_5
    iget-object v0, p0, Lcom/huawei/ui/commonui/scrollview/PagerSlidingTabStrip$b;->c:Lcom/huawei/ui/commonui/scrollview/PagerSlidingTabStrip;

    iget-object v1, p0, Lcom/huawei/ui/commonui/scrollview/PagerSlidingTabStrip$b;->c:Lcom/huawei/ui/commonui/scrollview/PagerSlidingTabStrip;

    invoke-virtual {v1}, Lcom/huawei/ui/commonui/scrollview/PagerSlidingTabStrip;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/ui/commonui/R$color;->user_profile_level_color:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getColor(I)I

    move-result v1

    iget-object v2, p0, Lcom/huawei/ui/commonui/scrollview/PagerSlidingTabStrip$b;->c:Lcom/huawei/ui/commonui/scrollview/PagerSlidingTabStrip;

    invoke-virtual {v2}, Lcom/huawei/ui/commonui/scrollview/PagerSlidingTabStrip;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    sget v3, Lcom/huawei/ui/commonui/R$color;->hw_show_color_text_main_title_color:I

    invoke-virtual {v2, v3}, Landroid/content/res/Resources;->getColor(I)I

    move-result v2

    const/high16 v3, 0x3f800000    # 1.0f

    invoke-virtual {v0, v3, v1, v2}, Lcom/huawei/ui/commonui/scrollview/PagerSlidingTabStrip;->a(FII)V

    .line 797
    iget-object v0, p0, Lcom/huawei/ui/commonui/scrollview/PagerSlidingTabStrip$b;->c:Lcom/huawei/ui/commonui/scrollview/PagerSlidingTabStrip;

    invoke-virtual {v0}, Lcom/huawei/ui/commonui/scrollview/PagerSlidingTabStrip;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lo/elx;->e(Landroid/content/Context;)V

    goto :goto_3

    .line 799
    :cond_6
    iget-object v0, p0, Lcom/huawei/ui/commonui/scrollview/PagerSlidingTabStrip$b;->c:Lcom/huawei/ui/commonui/scrollview/PagerSlidingTabStrip;

    invoke-virtual {v0}, Lcom/huawei/ui/commonui/scrollview/PagerSlidingTabStrip;->getContext()Landroid/content/Context;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/ui/commonui/scrollview/PagerSlidingTabStrip$b;->c:Lcom/huawei/ui/commonui/scrollview/PagerSlidingTabStrip;

    invoke-static {v0, v1, p1}, Lo/elx;->e(Landroid/content/Context;Lcom/huawei/ui/commonui/scrollview/PagerSlidingTabStrip;I)V

    .line 801
    :goto_3
    const/4 v5, 0x0

    :goto_4
    iget-object v0, p0, Lcom/huawei/ui/commonui/scrollview/PagerSlidingTabStrip$b;->c:Lcom/huawei/ui/commonui/scrollview/PagerSlidingTabStrip;

    invoke-static {v0}, Lcom/huawei/ui/commonui/scrollview/PagerSlidingTabStrip;->h(Lcom/huawei/ui/commonui/scrollview/PagerSlidingTabStrip;)Ljava/util/ArrayList;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-ge v5, v0, :cond_8

    .line 802
    if-ne p1, v5, :cond_7

    .line 803
    iget-object v0, p0, Lcom/huawei/ui/commonui/scrollview/PagerSlidingTabStrip$b;->c:Lcom/huawei/ui/commonui/scrollview/PagerSlidingTabStrip;

    invoke-static {v0}, Lcom/huawei/ui/commonui/scrollview/PagerSlidingTabStrip;->h(Lcom/huawei/ui/commonui/scrollview/PagerSlidingTabStrip;)Ljava/util/ArrayList;

    move-result-object v0

    invoke-virtual {v0, v5}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iget-object v1, p0, Lcom/huawei/ui/commonui/scrollview/PagerSlidingTabStrip$b;->c:Lcom/huawei/ui/commonui/scrollview/PagerSlidingTabStrip;

    invoke-static {v1}, Lcom/huawei/ui/commonui/scrollview/PagerSlidingTabStrip;->i(Lcom/huawei/ui/commonui/scrollview/PagerSlidingTabStrip;)I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setTextColor(I)V

    .line 804
    iget-object v0, p0, Lcom/huawei/ui/commonui/scrollview/PagerSlidingTabStrip$b;->c:Lcom/huawei/ui/commonui/scrollview/PagerSlidingTabStrip;

    invoke-static {v0}, Lcom/huawei/ui/commonui/scrollview/PagerSlidingTabStrip;->h(Lcom/huawei/ui/commonui/scrollview/PagerSlidingTabStrip;)Ljava/util/ArrayList;

    move-result-object v0

    invoke-virtual {v0, v5}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    const-string v1, "HwChinese-medium"

    const/4 v2, 0x0

    invoke-static {v1, v2}, Landroid/graphics/Typeface;->create(Ljava/lang/String;I)Landroid/graphics/Typeface;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setTypeface(Landroid/graphics/Typeface;)V

    goto :goto_5

    .line 806
    :cond_7
    iget-object v0, p0, Lcom/huawei/ui/commonui/scrollview/PagerSlidingTabStrip$b;->c:Lcom/huawei/ui/commonui/scrollview/PagerSlidingTabStrip;

    invoke-static {v0}, Lcom/huawei/ui/commonui/scrollview/PagerSlidingTabStrip;->h(Lcom/huawei/ui/commonui/scrollview/PagerSlidingTabStrip;)Ljava/util/ArrayList;

    move-result-object v0

    invoke-virtual {v0, v5}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iget-object v1, p0, Lcom/huawei/ui/commonui/scrollview/PagerSlidingTabStrip$b;->c:Lcom/huawei/ui/commonui/scrollview/PagerSlidingTabStrip;

    invoke-static {v1}, Lcom/huawei/ui/commonui/scrollview/PagerSlidingTabStrip;->f(Lcom/huawei/ui/commonui/scrollview/PagerSlidingTabStrip;)I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setTextColor(I)V

    .line 807
    iget-object v0, p0, Lcom/huawei/ui/commonui/scrollview/PagerSlidingTabStrip$b;->c:Lcom/huawei/ui/commonui/scrollview/PagerSlidingTabStrip;

    invoke-static {v0}, Lcom/huawei/ui/commonui/scrollview/PagerSlidingTabStrip;->h(Lcom/huawei/ui/commonui/scrollview/PagerSlidingTabStrip;)Ljava/util/ArrayList;

    move-result-object v0

    invoke-virtual {v0, v5}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    const-string v1, "regular"

    const/4 v2, 0x0

    invoke-static {v1, v2}, Landroid/graphics/Typeface;->create(Ljava/lang/String;I)Landroid/graphics/Typeface;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setTypeface(Landroid/graphics/Typeface;)V

    .line 801
    :goto_5
    add-int/lit8 v5, v5, 0x1

    goto :goto_4

    .line 810
    :cond_8
    const/4 v5, 0x0

    :goto_6
    iget-object v0, p0, Lcom/huawei/ui/commonui/scrollview/PagerSlidingTabStrip$b;->c:Lcom/huawei/ui/commonui/scrollview/PagerSlidingTabStrip;

    invoke-static {v0}, Lcom/huawei/ui/commonui/scrollview/PagerSlidingTabStrip;->g(Lcom/huawei/ui/commonui/scrollview/PagerSlidingTabStrip;)Ljava/util/ArrayList;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-ge v5, v0, :cond_9

    .line 811
    iget-object v0, p0, Lcom/huawei/ui/commonui/scrollview/PagerSlidingTabStrip$b;->c:Lcom/huawei/ui/commonui/scrollview/PagerSlidingTabStrip;

    invoke-static {v0}, Lcom/huawei/ui/commonui/scrollview/PagerSlidingTabStrip;->g(Lcom/huawei/ui/commonui/scrollview/PagerSlidingTabStrip;)Ljava/util/ArrayList;

    move-result-object v0

    invoke-virtual {v0, v5}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v6, v0

    check-cast v6, Landroid/view/View;

    .line 812
    iget-object v0, p0, Lcom/huawei/ui/commonui/scrollview/PagerSlidingTabStrip$b;->c:Lcom/huawei/ui/commonui/scrollview/PagerSlidingTabStrip;

    move-object v1, v6

    check-cast v1, Landroid/widget/ImageView;

    invoke-static {v0, p1, v5, v1}, Lcom/huawei/ui/commonui/scrollview/PagerSlidingTabStrip;->b(Lcom/huawei/ui/commonui/scrollview/PagerSlidingTabStrip;IILandroid/widget/ImageView;)V

    .line 810
    add-int/lit8 v5, v5, 0x1

    goto :goto_6

    .line 815
    :cond_9
    iget-object v0, p0, Lcom/huawei/ui/commonui/scrollview/PagerSlidingTabStrip$b;->c:Lcom/huawei/ui/commonui/scrollview/PagerSlidingTabStrip;

    invoke-static {v0}, Lcom/huawei/ui/commonui/scrollview/PagerSlidingTabStrip;->l(Lcom/huawei/ui/commonui/scrollview/PagerSlidingTabStrip;)I

    move-result v0

    if-eq p1, v0, :cond_b

    .line 816
    iget-object v0, p0, Lcom/huawei/ui/commonui/scrollview/PagerSlidingTabStrip$b;->c:Lcom/huawei/ui/commonui/scrollview/PagerSlidingTabStrip;

    invoke-static {v0}, Lcom/huawei/ui/commonui/scrollview/PagerSlidingTabStrip;->o(Lcom/huawei/ui/commonui/scrollview/PagerSlidingTabStrip;)J

    move-result-wide v0

    iget-object v2, p0, Lcom/huawei/ui/commonui/scrollview/PagerSlidingTabStrip$b;->c:Lcom/huawei/ui/commonui/scrollview/PagerSlidingTabStrip;

    invoke-static {v2}, Lcom/huawei/ui/commonui/scrollview/PagerSlidingTabStrip;->n(Lcom/huawei/ui/commonui/scrollview/PagerSlidingTabStrip;)J

    move-result-wide v2

    sub-long v5, v0, v2

    .line 817
    iget-object v0, p0, Lcom/huawei/ui/commonui/scrollview/PagerSlidingTabStrip$b;->c:Lcom/huawei/ui/commonui/scrollview/PagerSlidingTabStrip;

    invoke-static {v0}, Lcom/huawei/ui/commonui/scrollview/PagerSlidingTabStrip;->m(Lcom/huawei/ui/commonui/scrollview/PagerSlidingTabStrip;)J

    move-result-wide v0

    sub-long/2addr v5, v0

    .line 818
    const-string v0, "UIHLH_PagerSlidingTabStrip"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "UIHLH_PagerSlidingTabStrip"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v3, p0, Lcom/huawei/ui/commonui/scrollview/PagerSlidingTabStrip$b;->c:Lcom/huawei/ui/commonui/scrollview/PagerSlidingTabStrip;

    invoke-static {v3}, Lcom/huawei/ui/commonui/scrollview/PagerSlidingTabStrip;->l(Lcom/huawei/ui/commonui/scrollview/PagerSlidingTabStrip;)I

    move-result v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "--stayTime---"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v5, v6}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 819
    iget-object v0, p0, Lcom/huawei/ui/commonui/scrollview/PagerSlidingTabStrip$b;->c:Lcom/huawei/ui/commonui/scrollview/PagerSlidingTabStrip;

    const-wide/16 v1, 0x0

    invoke-static {v0, v1, v2}, Lcom/huawei/ui/commonui/scrollview/PagerSlidingTabStrip;->e(Lcom/huawei/ui/commonui/scrollview/PagerSlidingTabStrip;J)J

    .line 820
    new-instance v7, Ljava/util/HashMap;

    invoke-direct {v7}, Ljava/util/HashMap;-><init>()V

    .line 821
    const-string v0, "pageType"

    iget-object v1, p0, Lcom/huawei/ui/commonui/scrollview/PagerSlidingTabStrip$b;->c:Lcom/huawei/ui/commonui/scrollview/PagerSlidingTabStrip;

    invoke-static {v1}, Lcom/huawei/ui/commonui/scrollview/PagerSlidingTabStrip;->l(Lcom/huawei/ui/commonui/scrollview/PagerSlidingTabStrip;)I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v7, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 822
    const-string v0, "duration"

    invoke-static {v5, v6}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    invoke-interface {v7, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 823
    const-wide/16 v0, 0x3e8

    cmp-long v0, v5, v0

    if-lez v0, :cond_a

    .line 824
    sget-object v0, Lo/dae;->bp:Lo/dae;

    invoke-virtual {v0}, Lo/dae;->b()Ljava/lang/String;

    move-result-object v8

    .line 825
    invoke-static {}, Lo/cxf;->e()Lo/cxf;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/ui/commonui/scrollview/PagerSlidingTabStrip$b;->c:Lcom/huawei/ui/commonui/scrollview/PagerSlidingTabStrip;

    invoke-virtual {v1}, Lcom/huawei/ui/commonui/scrollview/PagerSlidingTabStrip;->getContext()Landroid/content/Context;

    move-result-object v1

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v8, v7, v2}, Lo/cxf;->a(Landroid/content/Context;Ljava/lang/String;Ljava/util/Map;I)I

    .line 827
    :cond_a
    iget-object v0, p0, Lcom/huawei/ui/commonui/scrollview/PagerSlidingTabStrip$b;->c:Lcom/huawei/ui/commonui/scrollview/PagerSlidingTabStrip;

    iget-object v1, p0, Lcom/huawei/ui/commonui/scrollview/PagerSlidingTabStrip$b;->c:Lcom/huawei/ui/commonui/scrollview/PagerSlidingTabStrip;

    invoke-static {v1}, Lcom/huawei/ui/commonui/scrollview/PagerSlidingTabStrip;->o(Lcom/huawei/ui/commonui/scrollview/PagerSlidingTabStrip;)J

    move-result-wide v1

    invoke-static {v0, v1, v2}, Lcom/huawei/ui/commonui/scrollview/PagerSlidingTabStrip;->c(Lcom/huawei/ui/commonui/scrollview/PagerSlidingTabStrip;J)J

    .line 829
    :cond_b
    iget-object v0, p0, Lcom/huawei/ui/commonui/scrollview/PagerSlidingTabStrip$b;->c:Lcom/huawei/ui/commonui/scrollview/PagerSlidingTabStrip;

    invoke-static {v0, p1}, Lcom/huawei/ui/commonui/scrollview/PagerSlidingTabStrip;->b(Lcom/huawei/ui/commonui/scrollview/PagerSlidingTabStrip;I)I

    .line 830
    return-void
.end method
