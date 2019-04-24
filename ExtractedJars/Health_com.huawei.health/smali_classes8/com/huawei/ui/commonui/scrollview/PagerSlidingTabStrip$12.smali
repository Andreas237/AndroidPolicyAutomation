.class Lcom/huawei/ui/commonui/scrollview/PagerSlidingTabStrip$12;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/ui/commonui/scrollview/PagerSlidingTabStrip;->g()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic c:Landroid/content/Context;

.field final synthetic d:Lcom/huawei/ui/commonui/scrollview/PagerSlidingTabStrip;

.field final synthetic e:Lo/egy;


# direct methods
.method constructor <init>(Lcom/huawei/ui/commonui/scrollview/PagerSlidingTabStrip;Landroid/content/Context;Lo/egy;)V
    .locals 0

    .line 949
    iput-object p1, p0, Lcom/huawei/ui/commonui/scrollview/PagerSlidingTabStrip$12;->d:Lcom/huawei/ui/commonui/scrollview/PagerSlidingTabStrip;

    iput-object p2, p0, Lcom/huawei/ui/commonui/scrollview/PagerSlidingTabStrip$12;->c:Landroid/content/Context;

    iput-object p3, p0, Lcom/huawei/ui/commonui/scrollview/PagerSlidingTabStrip$12;->e:Lo/egy;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 2

    .line 952
    iget-object v0, p0, Lcom/huawei/ui/commonui/scrollview/PagerSlidingTabStrip$12;->c:Landroid/content/Context;

    invoke-static {v0}, Lo/ena;->a(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 953
    iget-object v0, p0, Lcom/huawei/ui/commonui/scrollview/PagerSlidingTabStrip$12;->c:Landroid/content/Context;

    const/4 v1, 0x2

    invoke-static {v0, v1}, Lo/ena;->c(Landroid/content/Context;I)V

    .line 954
    iget-object v0, p0, Lcom/huawei/ui/commonui/scrollview/PagerSlidingTabStrip$12;->d:Lcom/huawei/ui/commonui/scrollview/PagerSlidingTabStrip;

    invoke-static {v0}, Lcom/huawei/ui/commonui/scrollview/PagerSlidingTabStrip;->p(Lcom/huawei/ui/commonui/scrollview/PagerSlidingTabStrip;)V

    goto :goto_0

    .line 956
    :cond_0
    iget-object v0, p0, Lcom/huawei/ui/commonui/scrollview/PagerSlidingTabStrip$12;->e:Lo/egy;

    invoke-virtual {v0}, Lo/egy;->show()V

    .line 958
    :goto_0
    return-void
.end method
