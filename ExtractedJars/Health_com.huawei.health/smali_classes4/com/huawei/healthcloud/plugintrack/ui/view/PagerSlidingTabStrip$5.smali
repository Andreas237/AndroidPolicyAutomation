.class Lcom/huawei/healthcloud/plugintrack/ui/view/PagerSlidingTabStrip$5;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/healthcloud/plugintrack/ui/view/PagerSlidingTabStrip;->c(ILandroid/view/View;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic c:I

.field final synthetic d:Lcom/huawei/healthcloud/plugintrack/ui/view/PagerSlidingTabStrip;


# direct methods
.method constructor <init>(Lcom/huawei/healthcloud/plugintrack/ui/view/PagerSlidingTabStrip;I)V
    .locals 0

    .line 229
    iput-object p1, p0, Lcom/huawei/healthcloud/plugintrack/ui/view/PagerSlidingTabStrip$5;->d:Lcom/huawei/healthcloud/plugintrack/ui/view/PagerSlidingTabStrip;

    iput p2, p0, Lcom/huawei/healthcloud/plugintrack/ui/view/PagerSlidingTabStrip$5;->c:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 2

    .line 232
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/view/PagerSlidingTabStrip$5;->d:Lcom/huawei/healthcloud/plugintrack/ui/view/PagerSlidingTabStrip;

    invoke-static {v0}, Lcom/huawei/healthcloud/plugintrack/ui/view/PagerSlidingTabStrip;->a(Lcom/huawei/healthcloud/plugintrack/ui/view/PagerSlidingTabStrip;)Landroid/support/v4/view/ViewPager;

    move-result-object v0

    iget v1, p0, Lcom/huawei/healthcloud/plugintrack/ui/view/PagerSlidingTabStrip$5;->c:I

    invoke-virtual {v0, v1}, Landroid/support/v4/view/ViewPager;->setCurrentItem(I)V

    .line 233
    return-void
.end method
