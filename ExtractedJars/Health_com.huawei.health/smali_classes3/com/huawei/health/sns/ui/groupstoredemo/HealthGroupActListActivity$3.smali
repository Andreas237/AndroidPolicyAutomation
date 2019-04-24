.class Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActListActivity$3;
.super Landroid/support/v7/widget/RecyclerView$OnScrollListener;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActListActivity;->b()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic d:Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActListActivity;


# direct methods
.method constructor <init>(Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActListActivity;)V
    .locals 0

    .line 242
    iput-object p1, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActListActivity$3;->d:Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActListActivity;

    invoke-direct {p0}, Landroid/support/v7/widget/RecyclerView$OnScrollListener;-><init>()V

    return-void
.end method


# virtual methods
.method public onScrollStateChanged(Landroid/support/v7/widget/RecyclerView;I)V
    .locals 3

    .line 245
    invoke-super {p0, p1, p2}, Landroid/support/v7/widget/RecyclerView$OnScrollListener;->onScrollStateChanged(Landroid/support/v7/widget/RecyclerView;I)V

    .line 246
    if-nez p2, :cond_0

    .line 247
    iget-object v0, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActListActivity$3;->d:Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActListActivity;

    invoke-static {v0}, Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActListActivity;->d(Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActListActivity;)I

    move-result v0

    iget-object v1, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActListActivity$3;->d:Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActListActivity;

    invoke-static {v1}, Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActListActivity;->a(Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActListActivity;)I

    move-result v1

    if-le v0, v1, :cond_0

    .line 248
    iget-object v0, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActListActivity$3;->d:Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActListActivity;

    invoke-static {v0}, Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActListActivity;->e(Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActListActivity;)Lo/bim;

    move-result-object v0

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lo/bim;->e(Z)V

    .line 250
    iget-object v0, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActListActivity$3;->d:Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActListActivity;

    iget-object v1, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActListActivity$3;->d:Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActListActivity;

    invoke-static {v1}, Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActListActivity;->a(Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActListActivity;)I

    move-result v1

    div-int/lit8 v1, v1, 0xa

    add-int/lit8 v1, v1, 0x1

    invoke-static {v0, v1}, Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActListActivity;->b(Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActListActivity;I)V

    .line 253
    :cond_0
    return-void
.end method

.method public onScrolled(Landroid/support/v7/widget/RecyclerView;II)V
    .locals 0

    .line 257
    invoke-super {p0, p1, p2, p3}, Landroid/support/v7/widget/RecyclerView$OnScrollListener;->onScrolled(Landroid/support/v7/widget/RecyclerView;II)V

    .line 258
    return-void
.end method
