.class Lcom/rt/mobile/english/ui/widget/SlidingTabLayout$InternalViewPagerListener;
.super Ljava/lang/Object;
.source "SlidingTabLayout.java"

# interfaces
.implements Landroid/support/v4/view/ViewPager$OnPageChangeListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/rt/mobile/english/ui/widget/SlidingTabLayout;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x2
    name = "InternalViewPagerListener"
.end annotation


# instance fields
.field private mScrollState:I

.field final synthetic this$0:Lcom/rt/mobile/english/ui/widget/SlidingTabLayout;


# direct methods
.method private constructor <init>(Lcom/rt/mobile/english/ui/widget/SlidingTabLayout;)V
    .locals 0

    .line 271
    iput-object p1, p0, Lcom/rt/mobile/english/ui/widget/SlidingTabLayout$InternalViewPagerListener;->this$0:Lcom/rt/mobile/english/ui/widget/SlidingTabLayout;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/rt/mobile/english/ui/widget/SlidingTabLayout;Lcom/rt/mobile/english/ui/widget/SlidingTabLayout$1;)V
    .locals 0

    .line 271
    invoke-direct {p0, p1}, Lcom/rt/mobile/english/ui/widget/SlidingTabLayout$InternalViewPagerListener;-><init>(Lcom/rt/mobile/english/ui/widget/SlidingTabLayout;)V

    return-void
.end method


# virtual methods
.method public onPageScrollStateChanged(I)V
    .locals 1

    .line 297
    iput p1, p0, Lcom/rt/mobile/english/ui/widget/SlidingTabLayout$InternalViewPagerListener;->mScrollState:I

    .line 299
    iget-object v0, p0, Lcom/rt/mobile/english/ui/widget/SlidingTabLayout$InternalViewPagerListener;->this$0:Lcom/rt/mobile/english/ui/widget/SlidingTabLayout;

    invoke-static {v0}, Lcom/rt/mobile/english/ui/widget/SlidingTabLayout;->access$400(Lcom/rt/mobile/english/ui/widget/SlidingTabLayout;)Landroid/support/v4/view/ViewPager$OnPageChangeListener;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 300
    iget-object v0, p0, Lcom/rt/mobile/english/ui/widget/SlidingTabLayout$InternalViewPagerListener;->this$0:Lcom/rt/mobile/english/ui/widget/SlidingTabLayout;

    invoke-static {v0}, Lcom/rt/mobile/english/ui/widget/SlidingTabLayout;->access$400(Lcom/rt/mobile/english/ui/widget/SlidingTabLayout;)Landroid/support/v4/view/ViewPager$OnPageChangeListener;

    move-result-object v0

    invoke-interface {v0, p1}, Landroid/support/v4/view/ViewPager$OnPageChangeListener;->onPageScrollStateChanged(I)V

    :cond_0
    return-void
.end method

.method public onPageScrolled(IFI)V
    .locals 2

    .line 276
    iget-object v0, p0, Lcom/rt/mobile/english/ui/widget/SlidingTabLayout$InternalViewPagerListener;->this$0:Lcom/rt/mobile/english/ui/widget/SlidingTabLayout;

    invoke-static {v0}, Lcom/rt/mobile/english/ui/widget/SlidingTabLayout;->access$200(Lcom/rt/mobile/english/ui/widget/SlidingTabLayout;)Lcom/rt/mobile/english/ui/widget/SlidingTabStrip;

    move-result-object v0

    invoke-virtual {v0}, Lcom/rt/mobile/english/ui/widget/SlidingTabStrip;->getChildCount()I

    move-result v0

    if-eqz v0, :cond_3

    if-ltz p1, :cond_3

    if-lt p1, v0, :cond_0

    goto :goto_1

    .line 281
    :cond_0
    iget-object v0, p0, Lcom/rt/mobile/english/ui/widget/SlidingTabLayout$InternalViewPagerListener;->this$0:Lcom/rt/mobile/english/ui/widget/SlidingTabLayout;

    invoke-static {v0}, Lcom/rt/mobile/english/ui/widget/SlidingTabLayout;->access$200(Lcom/rt/mobile/english/ui/widget/SlidingTabLayout;)Lcom/rt/mobile/english/ui/widget/SlidingTabStrip;

    move-result-object v0

    invoke-virtual {v0, p1, p2}, Lcom/rt/mobile/english/ui/widget/SlidingTabStrip;->onViewPagerPageChanged(IF)V

    .line 283
    iget-object v0, p0, Lcom/rt/mobile/english/ui/widget/SlidingTabLayout$InternalViewPagerListener;->this$0:Lcom/rt/mobile/english/ui/widget/SlidingTabLayout;

    invoke-static {v0}, Lcom/rt/mobile/english/ui/widget/SlidingTabLayout;->access$200(Lcom/rt/mobile/english/ui/widget/SlidingTabLayout;)Lcom/rt/mobile/english/ui/widget/SlidingTabStrip;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/rt/mobile/english/ui/widget/SlidingTabStrip;->getChildAt(I)Landroid/view/View;

    move-result-object v0

    if-eqz v0, :cond_1

    .line 285
    invoke-virtual {v0}, Landroid/view/View;->getWidth()I

    move-result v0

    int-to-float v0, v0

    mul-float/2addr v0, p2

    float-to-int v0, v0

    goto :goto_0

    :cond_1
    const/4 v0, 0x0

    .line 287
    :goto_0
    iget-object v1, p0, Lcom/rt/mobile/english/ui/widget/SlidingTabLayout$InternalViewPagerListener;->this$0:Lcom/rt/mobile/english/ui/widget/SlidingTabLayout;

    invoke-static {v1, p1, v0}, Lcom/rt/mobile/english/ui/widget/SlidingTabLayout;->access$300(Lcom/rt/mobile/english/ui/widget/SlidingTabLayout;II)V

    .line 289
    iget-object v0, p0, Lcom/rt/mobile/english/ui/widget/SlidingTabLayout$InternalViewPagerListener;->this$0:Lcom/rt/mobile/english/ui/widget/SlidingTabLayout;

    invoke-static {v0}, Lcom/rt/mobile/english/ui/widget/SlidingTabLayout;->access$400(Lcom/rt/mobile/english/ui/widget/SlidingTabLayout;)Landroid/support/v4/view/ViewPager$OnPageChangeListener;

    move-result-object v0

    if-eqz v0, :cond_2

    .line 290
    iget-object v0, p0, Lcom/rt/mobile/english/ui/widget/SlidingTabLayout$InternalViewPagerListener;->this$0:Lcom/rt/mobile/english/ui/widget/SlidingTabLayout;

    invoke-static {v0}, Lcom/rt/mobile/english/ui/widget/SlidingTabLayout;->access$400(Lcom/rt/mobile/english/ui/widget/SlidingTabLayout;)Landroid/support/v4/view/ViewPager$OnPageChangeListener;

    move-result-object v0

    invoke-interface {v0, p1, p2, p3}, Landroid/support/v4/view/ViewPager$OnPageChangeListener;->onPageScrolled(IFI)V

    :cond_2
    return-void

    :cond_3
    :goto_1
    return-void
.end method

.method public onPageSelected(I)V
    .locals 2

    .line 306
    iget v0, p0, Lcom/rt/mobile/english/ui/widget/SlidingTabLayout$InternalViewPagerListener;->mScrollState:I

    if-nez v0, :cond_0

    .line 307
    iget-object v0, p0, Lcom/rt/mobile/english/ui/widget/SlidingTabLayout$InternalViewPagerListener;->this$0:Lcom/rt/mobile/english/ui/widget/SlidingTabLayout;

    invoke-static {v0}, Lcom/rt/mobile/english/ui/widget/SlidingTabLayout;->access$200(Lcom/rt/mobile/english/ui/widget/SlidingTabLayout;)Lcom/rt/mobile/english/ui/widget/SlidingTabStrip;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, p1, v1}, Lcom/rt/mobile/english/ui/widget/SlidingTabStrip;->onViewPagerPageChanged(IF)V

    .line 308
    iget-object v0, p0, Lcom/rt/mobile/english/ui/widget/SlidingTabLayout$InternalViewPagerListener;->this$0:Lcom/rt/mobile/english/ui/widget/SlidingTabLayout;

    const/4 v1, 0x0

    invoke-static {v0, p1, v1}, Lcom/rt/mobile/english/ui/widget/SlidingTabLayout;->access$300(Lcom/rt/mobile/english/ui/widget/SlidingTabLayout;II)V

    .line 311
    :cond_0
    iget-object v0, p0, Lcom/rt/mobile/english/ui/widget/SlidingTabLayout$InternalViewPagerListener;->this$0:Lcom/rt/mobile/english/ui/widget/SlidingTabLayout;

    invoke-static {v0}, Lcom/rt/mobile/english/ui/widget/SlidingTabLayout;->access$400(Lcom/rt/mobile/english/ui/widget/SlidingTabLayout;)Landroid/support/v4/view/ViewPager$OnPageChangeListener;

    move-result-object v0

    if-eqz v0, :cond_1

    .line 312
    iget-object v0, p0, Lcom/rt/mobile/english/ui/widget/SlidingTabLayout$InternalViewPagerListener;->this$0:Lcom/rt/mobile/english/ui/widget/SlidingTabLayout;

    invoke-static {v0}, Lcom/rt/mobile/english/ui/widget/SlidingTabLayout;->access$400(Lcom/rt/mobile/english/ui/widget/SlidingTabLayout;)Landroid/support/v4/view/ViewPager$OnPageChangeListener;

    move-result-object v0

    invoke-interface {v0, p1}, Landroid/support/v4/view/ViewPager$OnPageChangeListener;->onPageSelected(I)V

    :cond_1
    return-void
.end method
