.class Lcom/huawei/ui/commonui/scrollview/PagerSlidingTabStrip$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/ui/commonui/scrollview/PagerSlidingTabStrip;->b(ILjava/lang/String;Z)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic c:Lcom/huawei/ui/commonui/scrollview/PagerSlidingTabStrip;


# direct methods
.method constructor <init>(Lcom/huawei/ui/commonui/scrollview/PagerSlidingTabStrip;)V
    .locals 0

    .line 564
    iput-object p1, p0, Lcom/huawei/ui/commonui/scrollview/PagerSlidingTabStrip$1;->c:Lcom/huawei/ui/commonui/scrollview/PagerSlidingTabStrip;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 2

    .line 567
    invoke-static {}, Lo/czu;->e()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 569
    iget-object v0, p0, Lcom/huawei/ui/commonui/scrollview/PagerSlidingTabStrip$1;->c:Lcom/huawei/ui/commonui/scrollview/PagerSlidingTabStrip;

    invoke-virtual {v0}, Lcom/huawei/ui/commonui/scrollview/PagerSlidingTabStrip;->getContext()Landroid/content/Context;

    move-result-object v0

    const/4 v1, 0x2

    invoke-static {v0, v1}, Lo/ena;->c(Landroid/content/Context;I)V

    .line 570
    iget-object v0, p0, Lcom/huawei/ui/commonui/scrollview/PagerSlidingTabStrip$1;->c:Lcom/huawei/ui/commonui/scrollview/PagerSlidingTabStrip;

    invoke-static {v0}, Lcom/huawei/ui/commonui/scrollview/PagerSlidingTabStrip;->d(Lcom/huawei/ui/commonui/scrollview/PagerSlidingTabStrip;)V

    goto :goto_0

    .line 572
    :cond_0
    iget-object v0, p0, Lcom/huawei/ui/commonui/scrollview/PagerSlidingTabStrip$1;->c:Lcom/huawei/ui/commonui/scrollview/PagerSlidingTabStrip;

    invoke-static {v0}, Lcom/huawei/ui/commonui/scrollview/PagerSlidingTabStrip;->c(Lcom/huawei/ui/commonui/scrollview/PagerSlidingTabStrip;)V

    .line 575
    :goto_0
    return-void
.end method
