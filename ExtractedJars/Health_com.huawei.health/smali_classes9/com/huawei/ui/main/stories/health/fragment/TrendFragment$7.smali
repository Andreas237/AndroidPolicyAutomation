.class Lcom/huawei/ui/main/stories/health/fragment/TrendFragment$7;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/clz;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;->r()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic c:Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;


# direct methods
.method constructor <init>(Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;)V
    .locals 0

    .line 1478
    iput-object p1, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragment$7;->c:Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onFailure(ILjava/lang/Object;)V
    .locals 5

    .line 1494
    const-string v0, "WeightActivity_TrendFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getGoalData()onFailure"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1495
    invoke-static {}, Landroid/os/Message;->obtain()Landroid/os/Message;

    move-result-object v4

    .line 1496
    const/4 v0, 0x7

    iput v0, v4, Landroid/os/Message;->what:I

    .line 1497
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, v4, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 1498
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragment$7;->c:Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;->W(Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;)Landroid/os/Handler;

    move-result-object v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 1499
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragment$7;->c:Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;->W(Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;)Landroid/os/Handler;

    move-result-object v0

    invoke-virtual {v0, v4}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    .line 1501
    :cond_0
    return-void
.end method

.method public onSuccess(ILjava/lang/Object;)V
    .locals 5

    .line 1481
    invoke-static {}, Landroid/os/Message;->obtain()Landroid/os/Message;

    move-result-object v4

    .line 1483
    const/4 v0, 0x7

    iput v0, v4, Landroid/os/Message;->what:I

    .line 1484
    iput-object p2, v4, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 1485
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragment$7;->c:Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;->W(Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;)Landroid/os/Handler;

    move-result-object v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 1486
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragment$7;->c:Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;->W(Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;)Landroid/os/Handler;

    move-result-object v0

    invoke-virtual {v0, v4}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    .line 1489
    :cond_0
    const-string v0, "WeightActivity_TrendFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getGoalData()onSuccess,sendMessage success"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1490
    return-void
.end method
