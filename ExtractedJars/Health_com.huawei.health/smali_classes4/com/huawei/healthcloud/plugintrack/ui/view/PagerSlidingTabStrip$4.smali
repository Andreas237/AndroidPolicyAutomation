.class Lcom/huawei/healthcloud/plugintrack/ui/view/PagerSlidingTabStrip$4;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/healthcloud/plugintrack/ui/view/PagerSlidingTabStrip;->a()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:Lcom/huawei/healthcloud/plugintrack/ui/view/PagerSlidingTabStrip;


# direct methods
.method constructor <init>(Lcom/huawei/healthcloud/plugintrack/ui/view/PagerSlidingTabStrip;)V
    .locals 0

    .line 190
    iput-object p1, p0, Lcom/huawei/healthcloud/plugintrack/ui/view/PagerSlidingTabStrip$4;->b:Lcom/huawei/healthcloud/plugintrack/ui/view/PagerSlidingTabStrip;

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

    .line 197
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x10

    if-ge v0, v1, :cond_0

    .line 198
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/view/PagerSlidingTabStrip$4;->b:Lcom/huawei/healthcloud/plugintrack/ui/view/PagerSlidingTabStrip;

    invoke-virtual {v0}, Lcom/huawei/healthcloud/plugintrack/ui/view/PagerSlidingTabStrip;->getViewTreeObserver()Landroid/view/ViewTreeObserver;

    move-result-object v0

    invoke-virtual {v0, p0}, Landroid/view/ViewTreeObserver;->removeGlobalOnLayoutListener(Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;)V

    goto :goto_0

    .line 200
    :cond_0
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/view/PagerSlidingTabStrip$4;->b:Lcom/huawei/healthcloud/plugintrack/ui/view/PagerSlidingTabStrip;

    invoke-virtual {v0}, Lcom/huawei/healthcloud/plugintrack/ui/view/PagerSlidingTabStrip;->getViewTreeObserver()Landroid/view/ViewTreeObserver;

    move-result-object v0

    invoke-virtual {v0, p0}, Landroid/view/ViewTreeObserver;->removeOnGlobalLayoutListener(Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;)V

    .line 203
    :goto_0
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/view/PagerSlidingTabStrip$4;->b:Lcom/huawei/healthcloud/plugintrack/ui/view/PagerSlidingTabStrip;

    iget-object v1, p0, Lcom/huawei/healthcloud/plugintrack/ui/view/PagerSlidingTabStrip$4;->b:Lcom/huawei/healthcloud/plugintrack/ui/view/PagerSlidingTabStrip;

    invoke-static {v1}, Lcom/huawei/healthcloud/plugintrack/ui/view/PagerSlidingTabStrip;->a(Lcom/huawei/healthcloud/plugintrack/ui/view/PagerSlidingTabStrip;)Landroid/support/v4/view/ViewPager;

    move-result-object v1

    invoke-virtual {v1}, Landroid/support/v4/view/ViewPager;->getCurrentItem()I

    move-result v1

    invoke-static {v0, v1}, Lcom/huawei/healthcloud/plugintrack/ui/view/PagerSlidingTabStrip;->b(Lcom/huawei/healthcloud/plugintrack/ui/view/PagerSlidingTabStrip;I)I

    .line 204
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/view/PagerSlidingTabStrip$4;->b:Lcom/huawei/healthcloud/plugintrack/ui/view/PagerSlidingTabStrip;

    iget-object v1, p0, Lcom/huawei/healthcloud/plugintrack/ui/view/PagerSlidingTabStrip$4;->b:Lcom/huawei/healthcloud/plugintrack/ui/view/PagerSlidingTabStrip;

    invoke-static {v1}, Lcom/huawei/healthcloud/plugintrack/ui/view/PagerSlidingTabStrip;->e(Lcom/huawei/healthcloud/plugintrack/ui/view/PagerSlidingTabStrip;)I

    move-result v1

    const/4 v2, 0x0

    invoke-static {v0, v1, v2}, Lcom/huawei/healthcloud/plugintrack/ui/view/PagerSlidingTabStrip;->e(Lcom/huawei/healthcloud/plugintrack/ui/view/PagerSlidingTabStrip;II)V

    .line 205
    return-void
.end method
