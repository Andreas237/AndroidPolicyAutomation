.class Lcom/huawei/ui/homehealth/HomeFragment$13;
.super Landroid/support/v7/widget/RecyclerView$OnScrollListener;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/ui/homehealth/HomeFragment;->onActivityCreated(Landroid/os/Bundle;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:Lcom/huawei/ui/homehealth/HomeFragment;


# direct methods
.method constructor <init>(Lcom/huawei/ui/homehealth/HomeFragment;)V
    .locals 0

    .line 372
    iput-object p1, p0, Lcom/huawei/ui/homehealth/HomeFragment$13;->b:Lcom/huawei/ui/homehealth/HomeFragment;

    invoke-direct {p0}, Landroid/support/v7/widget/RecyclerView$OnScrollListener;-><init>()V

    return-void
.end method


# virtual methods
.method public onScrollStateChanged(Landroid/support/v7/widget/RecyclerView;I)V
    .locals 6

    .line 375
    invoke-super {p0, p1, p2}, Landroid/support/v7/widget/RecyclerView$OnScrollListener;->onScrollStateChanged(Landroid/support/v7/widget/RecyclerView;I)V

    .line 376
    const/4 v0, 0x1

    invoke-virtual {p1, v0}, Landroid/support/v7/widget/RecyclerView;->canScrollVertically(I)Z

    move-result v0

    if-nez v0, :cond_0

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    iget-object v2, p0, Lcom/huawei/ui/homehealth/HomeFragment$13;->b:Lcom/huawei/ui/homehealth/HomeFragment;

    invoke-static {v2}, Lcom/huawei/ui/homehealth/HomeFragment;->g(Lcom/huawei/ui/homehealth/HomeFragment;)J

    move-result-wide v2

    sub-long/2addr v0, v2

    const-wide/16 v2, 0x7d0

    cmp-long v0, v0, v2

    if-lez v0, :cond_0

    .line 377
    const-string v0, "UIHLH_HomeFragment"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "mRecyclerView_GET_BOTTON"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, -0x1

    invoke-virtual {p1, v2}, Landroid/support/v7/widget/RecyclerView;->canScrollVertically(I)Z

    move-result v2

    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 378
    new-instance v4, Ljava/util/HashMap;

    invoke-direct {v4}, Ljava/util/HashMap;-><init>()V

    .line 379
    const-string v0, "scroll"

    const-string v1, "1"

    invoke-interface {v4, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 380
    sget-object v0, Lo/dae;->bO:Lo/dae;

    invoke-virtual {v0}, Lo/dae;->b()Ljava/lang/String;

    move-result-object v5

    .line 381
    invoke-static {}, Lo/cxf;->e()Lo/cxf;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/ui/homehealth/HomeFragment$13;->b:Lcom/huawei/ui/homehealth/HomeFragment;

    invoke-static {v1}, Lcom/huawei/ui/homehealth/HomeFragment;->b(Lcom/huawei/ui/homehealth/HomeFragment;)Landroid/content/Context;

    move-result-object v1

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v5, v4, v2}, Lo/cxf;->a(Landroid/content/Context;Ljava/lang/String;Ljava/util/Map;I)I

    .line 382
    invoke-static {}, Lo/cxf;->e()Lo/cxf;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/ui/homehealth/HomeFragment$13;->b:Lcom/huawei/ui/homehealth/HomeFragment;

    invoke-static {v1}, Lcom/huawei/ui/homehealth/HomeFragment;->b(Lcom/huawei/ui/homehealth/HomeFragment;)Landroid/content/Context;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/cxf;->d(Landroid/content/Context;)V

    .line 383
    iget-object v0, p0, Lcom/huawei/ui/homehealth/HomeFragment$13;->b:Lcom/huawei/ui/homehealth/HomeFragment;

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v1

    invoke-static {v0, v1, v2}, Lcom/huawei/ui/homehealth/HomeFragment;->e(Lcom/huawei/ui/homehealth/HomeFragment;J)J

    .line 385
    :cond_0
    return-void
.end method

.method public onScrolled(Landroid/support/v7/widget/RecyclerView;II)V
    .locals 0

    .line 389
    invoke-super {p0, p1, p2, p3}, Landroid/support/v7/widget/RecyclerView$OnScrollListener;->onScrolled(Landroid/support/v7/widget/RecyclerView;II)V

    .line 390
    return-void
.end method
