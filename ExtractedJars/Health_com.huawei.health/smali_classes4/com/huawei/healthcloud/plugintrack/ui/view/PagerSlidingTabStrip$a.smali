.class Lcom/huawei/healthcloud/plugintrack/ui/view/PagerSlidingTabStrip$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/support/v4/view/ViewPager$OnPageChangeListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/healthcloud/plugintrack/ui/view/PagerSlidingTabStrip;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = "a"
.end annotation


# instance fields
.field final synthetic c:Lcom/huawei/healthcloud/plugintrack/ui/view/PagerSlidingTabStrip;


# direct methods
.method private constructor <init>(Lcom/huawei/healthcloud/plugintrack/ui/view/PagerSlidingTabStrip;)V
    .locals 0

    .line 329
    iput-object p1, p0, Lcom/huawei/healthcloud/plugintrack/ui/view/PagerSlidingTabStrip$a;->c:Lcom/huawei/healthcloud/plugintrack/ui/view/PagerSlidingTabStrip;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/huawei/healthcloud/plugintrack/ui/view/PagerSlidingTabStrip;Lcom/huawei/healthcloud/plugintrack/ui/view/PagerSlidingTabStrip$4;)V
    .locals 0

    .line 329
    invoke-direct {p0, p1}, Lcom/huawei/healthcloud/plugintrack/ui/view/PagerSlidingTabStrip$a;-><init>(Lcom/huawei/healthcloud/plugintrack/ui/view/PagerSlidingTabStrip;)V

    return-void
.end method


# virtual methods
.method public onPageScrollStateChanged(I)V
    .locals 3

    .line 346
    if-nez p1, :cond_0

    .line 347
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/view/PagerSlidingTabStrip$a;->c:Lcom/huawei/healthcloud/plugintrack/ui/view/PagerSlidingTabStrip;

    iget-object v1, p0, Lcom/huawei/healthcloud/plugintrack/ui/view/PagerSlidingTabStrip$a;->c:Lcom/huawei/healthcloud/plugintrack/ui/view/PagerSlidingTabStrip;

    invoke-static {v1}, Lcom/huawei/healthcloud/plugintrack/ui/view/PagerSlidingTabStrip;->a(Lcom/huawei/healthcloud/plugintrack/ui/view/PagerSlidingTabStrip;)Landroid/support/v4/view/ViewPager;

    move-result-object v1

    invoke-virtual {v1}, Landroid/support/v4/view/ViewPager;->getCurrentItem()I

    move-result v1

    const/4 v2, 0x0

    invoke-static {v0, v1, v2}, Lcom/huawei/healthcloud/plugintrack/ui/view/PagerSlidingTabStrip;->e(Lcom/huawei/healthcloud/plugintrack/ui/view/PagerSlidingTabStrip;II)V

    .line 349
    :cond_0
    return-void
.end method

.method public onPageScrolled(IFI)V
    .locals 2

    .line 334
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/view/PagerSlidingTabStrip$a;->c:Lcom/huawei/healthcloud/plugintrack/ui/view/PagerSlidingTabStrip;

    invoke-static {v0, p1}, Lcom/huawei/healthcloud/plugintrack/ui/view/PagerSlidingTabStrip;->b(Lcom/huawei/healthcloud/plugintrack/ui/view/PagerSlidingTabStrip;I)I

    .line 335
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/view/PagerSlidingTabStrip$a;->c:Lcom/huawei/healthcloud/plugintrack/ui/view/PagerSlidingTabStrip;

    invoke-static {v0, p2}, Lcom/huawei/healthcloud/plugintrack/ui/view/PagerSlidingTabStrip;->a(Lcom/huawei/healthcloud/plugintrack/ui/view/PagerSlidingTabStrip;F)F

    .line 337
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/view/PagerSlidingTabStrip$a;->c:Lcom/huawei/healthcloud/plugintrack/ui/view/PagerSlidingTabStrip;

    iget-object v1, p0, Lcom/huawei/healthcloud/plugintrack/ui/view/PagerSlidingTabStrip$a;->c:Lcom/huawei/healthcloud/plugintrack/ui/view/PagerSlidingTabStrip;

    invoke-static {v1}, Lcom/huawei/healthcloud/plugintrack/ui/view/PagerSlidingTabStrip;->b(Lcom/huawei/healthcloud/plugintrack/ui/view/PagerSlidingTabStrip;)Landroid/widget/LinearLayout;

    move-result-object v1

    invoke-virtual {v1, p1}, Landroid/widget/LinearLayout;->getChildAt(I)Landroid/view/View;

    move-result-object v1

    invoke-virtual {v1}, Landroid/view/View;->getWidth()I

    move-result v1

    int-to-float v1, v1

    mul-float/2addr v1, p2

    float-to-int v1, v1

    invoke-static {v0, p1, v1}, Lcom/huawei/healthcloud/plugintrack/ui/view/PagerSlidingTabStrip;->e(Lcom/huawei/healthcloud/plugintrack/ui/view/PagerSlidingTabStrip;II)V

    .line 339
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/view/PagerSlidingTabStrip$a;->c:Lcom/huawei/healthcloud/plugintrack/ui/view/PagerSlidingTabStrip;

    invoke-virtual {v0}, Lcom/huawei/healthcloud/plugintrack/ui/view/PagerSlidingTabStrip;->invalidate()V

    .line 342
    return-void
.end method

.method public onPageSelected(I)V
    .locals 3

    .line 354
    const/4 v2, 0x0

    :goto_0
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/view/PagerSlidingTabStrip$a;->c:Lcom/huawei/healthcloud/plugintrack/ui/view/PagerSlidingTabStrip;

    invoke-static {v0}, Lcom/huawei/healthcloud/plugintrack/ui/view/PagerSlidingTabStrip;->c(Lcom/huawei/healthcloud/plugintrack/ui/view/PagerSlidingTabStrip;)Ljava/util/ArrayList;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-ge v2, v0, :cond_1

    .line 355
    if-ne p1, v2, :cond_0

    .line 356
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/view/PagerSlidingTabStrip$a;->c:Lcom/huawei/healthcloud/plugintrack/ui/view/PagerSlidingTabStrip;

    invoke-static {v0}, Lcom/huawei/healthcloud/plugintrack/ui/view/PagerSlidingTabStrip;->c(Lcom/huawei/healthcloud/plugintrack/ui/view/PagerSlidingTabStrip;)Ljava/util/ArrayList;

    move-result-object v0

    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iget-object v1, p0, Lcom/huawei/healthcloud/plugintrack/ui/view/PagerSlidingTabStrip$a;->c:Lcom/huawei/healthcloud/plugintrack/ui/view/PagerSlidingTabStrip;

    invoke-static {v1}, Lcom/huawei/healthcloud/plugintrack/ui/view/PagerSlidingTabStrip;->d(Lcom/huawei/healthcloud/plugintrack/ui/view/PagerSlidingTabStrip;)I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setTextColor(I)V

    goto :goto_1

    .line 358
    :cond_0
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/view/PagerSlidingTabStrip$a;->c:Lcom/huawei/healthcloud/plugintrack/ui/view/PagerSlidingTabStrip;

    invoke-static {v0}, Lcom/huawei/healthcloud/plugintrack/ui/view/PagerSlidingTabStrip;->c(Lcom/huawei/healthcloud/plugintrack/ui/view/PagerSlidingTabStrip;)Ljava/util/ArrayList;

    move-result-object v0

    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iget-object v1, p0, Lcom/huawei/healthcloud/plugintrack/ui/view/PagerSlidingTabStrip$a;->c:Lcom/huawei/healthcloud/plugintrack/ui/view/PagerSlidingTabStrip;

    invoke-static {v1}, Lcom/huawei/healthcloud/plugintrack/ui/view/PagerSlidingTabStrip;->k(Lcom/huawei/healthcloud/plugintrack/ui/view/PagerSlidingTabStrip;)I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setTextColor(I)V

    .line 354
    :goto_1
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    .line 361
    :cond_1
    return-void
.end method
