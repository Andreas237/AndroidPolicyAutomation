.class Lcom/huawei/health/sns/ui/group/HealthEventRankFragment$3;
.super Landroid/support/v7/widget/RecyclerView$OnScrollListener;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/health/sns/ui/group/HealthEventRankFragment;->e(Landroid/view/View;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic d:Lcom/huawei/health/sns/ui/group/HealthEventRankFragment;


# direct methods
.method constructor <init>(Lcom/huawei/health/sns/ui/group/HealthEventRankFragment;)V
    .locals 0

    .line 234
    iput-object p1, p0, Lcom/huawei/health/sns/ui/group/HealthEventRankFragment$3;->d:Lcom/huawei/health/sns/ui/group/HealthEventRankFragment;

    invoke-direct {p0}, Landroid/support/v7/widget/RecyclerView$OnScrollListener;-><init>()V

    return-void
.end method


# virtual methods
.method public onScrollStateChanged(Landroid/support/v7/widget/RecyclerView;I)V
    .locals 3

    .line 237
    invoke-super {p0, p1, p2}, Landroid/support/v7/widget/RecyclerView$OnScrollListener;->onScrollStateChanged(Landroid/support/v7/widget/RecyclerView;I)V

    .line 238
    if-nez p2, :cond_1

    .line 239
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthEventRankFragment$3;->d:Lcom/huawei/health/sns/ui/group/HealthEventRankFragment;

    invoke-static {v0}, Lcom/huawei/health/sns/ui/group/HealthEventRankFragment;->d(Lcom/huawei/health/sns/ui/group/HealthEventRankFragment;)I

    move-result v0

    iget-object v1, p0, Lcom/huawei/health/sns/ui/group/HealthEventRankFragment$3;->d:Lcom/huawei/health/sns/ui/group/HealthEventRankFragment;

    invoke-static {v1}, Lcom/huawei/health/sns/ui/group/HealthEventRankFragment;->c(Lcom/huawei/health/sns/ui/group/HealthEventRankFragment;)I

    move-result v1

    if-le v0, v1, :cond_1

    .line 240
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthEventRankFragment$3;->d:Lcom/huawei/health/sns/ui/group/HealthEventRankFragment;

    invoke-static {v0}, Lcom/huawei/health/sns/ui/group/HealthEventRankFragment;->i(Lcom/huawei/health/sns/ui/group/HealthEventRankFragment;)Lo/bhi;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 241
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthEventRankFragment$3;->d:Lcom/huawei/health/sns/ui/group/HealthEventRankFragment;

    invoke-static {v0}, Lcom/huawei/health/sns/ui/group/HealthEventRankFragment;->i(Lcom/huawei/health/sns/ui/group/HealthEventRankFragment;)Lo/bhi;

    move-result-object v0

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lo/bhi;->c(Z)V

    .line 244
    :cond_0
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthEventRankFragment$3;->d:Lcom/huawei/health/sns/ui/group/HealthEventRankFragment;

    iget-object v1, p0, Lcom/huawei/health/sns/ui/group/HealthEventRankFragment$3;->d:Lcom/huawei/health/sns/ui/group/HealthEventRankFragment;

    invoke-static {v1}, Lcom/huawei/health/sns/ui/group/HealthEventRankFragment;->c(Lcom/huawei/health/sns/ui/group/HealthEventRankFragment;)I

    move-result v1

    div-int/lit8 v1, v1, 0xa

    add-int/lit8 v1, v1, 0x1

    invoke-static {v0, v1}, Lcom/huawei/health/sns/ui/group/HealthEventRankFragment;->c(Lcom/huawei/health/sns/ui/group/HealthEventRankFragment;I)V

    .line 247
    :cond_1
    return-void
.end method

.method public onScrolled(Landroid/support/v7/widget/RecyclerView;II)V
    .locals 0

    .line 250
    invoke-super {p0, p1, p2, p3}, Landroid/support/v7/widget/RecyclerView$OnScrollListener;->onScrolled(Landroid/support/v7/widget/RecyclerView;II)V

    .line 251
    return-void
.end method
