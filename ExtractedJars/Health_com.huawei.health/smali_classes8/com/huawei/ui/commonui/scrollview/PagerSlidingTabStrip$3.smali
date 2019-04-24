.class Lcom/huawei/ui/commonui/scrollview/PagerSlidingTabStrip$3;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/ui/commonui/scrollview/PagerSlidingTabStrip;->e(Z)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:Lcom/huawei/ui/commonui/scrollview/PagerSlidingTabStrip;


# direct methods
.method constructor <init>(Lcom/huawei/ui/commonui/scrollview/PagerSlidingTabStrip;)V
    .locals 0

    .line 315
    iput-object p1, p0, Lcom/huawei/ui/commonui/scrollview/PagerSlidingTabStrip$3;->b:Lcom/huawei/ui/commonui/scrollview/PagerSlidingTabStrip;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onGlobalLayout()V
    .locals 3
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "NewApi"
        }
    .end annotation

    .line 322
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x10

    if-lt v0, v1, :cond_0

    .line 323
    iget-object v0, p0, Lcom/huawei/ui/commonui/scrollview/PagerSlidingTabStrip$3;->b:Lcom/huawei/ui/commonui/scrollview/PagerSlidingTabStrip;

    invoke-virtual {v0}, Lcom/huawei/ui/commonui/scrollview/PagerSlidingTabStrip;->getViewTreeObserver()Landroid/view/ViewTreeObserver;

    move-result-object v0

    invoke-virtual {v0, p0}, Landroid/view/ViewTreeObserver;->removeOnGlobalLayoutListener(Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;)V

    goto :goto_0

    .line 325
    :cond_0
    iget-object v0, p0, Lcom/huawei/ui/commonui/scrollview/PagerSlidingTabStrip$3;->b:Lcom/huawei/ui/commonui/scrollview/PagerSlidingTabStrip;

    invoke-virtual {v0}, Lcom/huawei/ui/commonui/scrollview/PagerSlidingTabStrip;->getViewTreeObserver()Landroid/view/ViewTreeObserver;

    move-result-object v0

    invoke-virtual {v0, p0}, Landroid/view/ViewTreeObserver;->removeGlobalOnLayoutListener(Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;)V

    .line 327
    :goto_0
    iget-object v0, p0, Lcom/huawei/ui/commonui/scrollview/PagerSlidingTabStrip$3;->b:Lcom/huawei/ui/commonui/scrollview/PagerSlidingTabStrip;

    iget-object v1, p0, Lcom/huawei/ui/commonui/scrollview/PagerSlidingTabStrip$3;->b:Lcom/huawei/ui/commonui/scrollview/PagerSlidingTabStrip;

    invoke-static {v1}, Lcom/huawei/ui/commonui/scrollview/PagerSlidingTabStrip;->a(Lcom/huawei/ui/commonui/scrollview/PagerSlidingTabStrip;)Landroid/support/v4/view/ViewPager;

    move-result-object v1

    invoke-virtual {v1}, Landroid/support/v4/view/ViewPager;->getCurrentItem()I

    move-result v1

    invoke-static {v0, v1}, Lcom/huawei/ui/commonui/scrollview/PagerSlidingTabStrip;->a(Lcom/huawei/ui/commonui/scrollview/PagerSlidingTabStrip;I)I

    .line 328
    iget-object v0, p0, Lcom/huawei/ui/commonui/scrollview/PagerSlidingTabStrip$3;->b:Lcom/huawei/ui/commonui/scrollview/PagerSlidingTabStrip;

    iget-object v1, p0, Lcom/huawei/ui/commonui/scrollview/PagerSlidingTabStrip$3;->b:Lcom/huawei/ui/commonui/scrollview/PagerSlidingTabStrip;

    invoke-static {v1}, Lcom/huawei/ui/commonui/scrollview/PagerSlidingTabStrip;->b(Lcom/huawei/ui/commonui/scrollview/PagerSlidingTabStrip;)I

    move-result v1

    const/4 v2, 0x0

    invoke-static {v0, v1, v2}, Lcom/huawei/ui/commonui/scrollview/PagerSlidingTabStrip;->a(Lcom/huawei/ui/commonui/scrollview/PagerSlidingTabStrip;II)V

    .line 329
    iget-object v0, p0, Lcom/huawei/ui/commonui/scrollview/PagerSlidingTabStrip$3;->b:Lcom/huawei/ui/commonui/scrollview/PagerSlidingTabStrip;

    invoke-static {v0}, Lcom/huawei/ui/commonui/scrollview/PagerSlidingTabStrip;->e(Lcom/huawei/ui/commonui/scrollview/PagerSlidingTabStrip;)V

    .line 330
    return-void
.end method
