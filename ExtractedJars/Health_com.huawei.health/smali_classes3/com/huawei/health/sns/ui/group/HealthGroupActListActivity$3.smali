.class Lcom/huawei/health/sns/ui/group/HealthGroupActListActivity$3;
.super Landroid/support/v7/widget/RecyclerView$OnScrollListener;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/health/sns/ui/group/HealthGroupActListActivity;->a()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/huawei/health/sns/ui/group/HealthGroupActListActivity;


# direct methods
.method constructor <init>(Lcom/huawei/health/sns/ui/group/HealthGroupActListActivity;)V
    .locals 0

    .line 246
    iput-object p1, p0, Lcom/huawei/health/sns/ui/group/HealthGroupActListActivity$3;->a:Lcom/huawei/health/sns/ui/group/HealthGroupActListActivity;

    invoke-direct {p0}, Landroid/support/v7/widget/RecyclerView$OnScrollListener;-><init>()V

    return-void
.end method


# virtual methods
.method public onScrollStateChanged(Landroid/support/v7/widget/RecyclerView;I)V
    .locals 3

    .line 249
    invoke-super {p0, p1, p2}, Landroid/support/v7/widget/RecyclerView$OnScrollListener;->onScrollStateChanged(Landroid/support/v7/widget/RecyclerView;I)V

    .line 250
    if-nez p2, :cond_0

    .line 251
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupActListActivity$3;->a:Lcom/huawei/health/sns/ui/group/HealthGroupActListActivity;

    invoke-static {v0}, Lcom/huawei/health/sns/ui/group/HealthGroupActListActivity;->e(Lcom/huawei/health/sns/ui/group/HealthGroupActListActivity;)I

    move-result v0

    iget-object v1, p0, Lcom/huawei/health/sns/ui/group/HealthGroupActListActivity$3;->a:Lcom/huawei/health/sns/ui/group/HealthGroupActListActivity;

    invoke-static {v1}, Lcom/huawei/health/sns/ui/group/HealthGroupActListActivity;->d(Lcom/huawei/health/sns/ui/group/HealthGroupActListActivity;)I

    move-result v1

    if-le v0, v1, :cond_0

    .line 252
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupActListActivity$3;->a:Lcom/huawei/health/sns/ui/group/HealthGroupActListActivity;

    invoke-static {v0}, Lcom/huawei/health/sns/ui/group/HealthGroupActListActivity;->a(Lcom/huawei/health/sns/ui/group/HealthGroupActListActivity;)Lo/bhm;

    move-result-object v0

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lo/bhm;->b(Z)V

    .line 254
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupActListActivity$3;->a:Lcom/huawei/health/sns/ui/group/HealthGroupActListActivity;

    iget-object v1, p0, Lcom/huawei/health/sns/ui/group/HealthGroupActListActivity$3;->a:Lcom/huawei/health/sns/ui/group/HealthGroupActListActivity;

    invoke-static {v1}, Lcom/huawei/health/sns/ui/group/HealthGroupActListActivity;->d(Lcom/huawei/health/sns/ui/group/HealthGroupActListActivity;)I

    move-result v1

    div-int/lit8 v1, v1, 0xa

    add-int/lit8 v1, v1, 0x1

    invoke-static {v0, v1}, Lcom/huawei/health/sns/ui/group/HealthGroupActListActivity;->e(Lcom/huawei/health/sns/ui/group/HealthGroupActListActivity;I)V

    .line 257
    :cond_0
    return-void
.end method

.method public onScrolled(Landroid/support/v7/widget/RecyclerView;II)V
    .locals 0

    .line 261
    invoke-super {p0, p1, p2, p3}, Landroid/support/v7/widget/RecyclerView$OnScrollListener;->onScrolled(Landroid/support/v7/widget/RecyclerView;II)V

    .line 262
    return-void
.end method
