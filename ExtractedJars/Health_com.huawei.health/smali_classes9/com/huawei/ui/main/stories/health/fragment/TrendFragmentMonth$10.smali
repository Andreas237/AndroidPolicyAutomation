.class Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth$10;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/clz;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;->q()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;


# direct methods
.method constructor <init>(Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;)V
    .locals 0

    .line 1512
    iput-object p1, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth$10;->a:Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onFailure(ILjava/lang/Object;)V
    .locals 5

    .line 1528
    const-string v0, "WeightActivity_TrendFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getGoalData()onFailure"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1529
    invoke-static {}, Landroid/os/Message;->obtain()Landroid/os/Message;

    move-result-object v4

    .line 1530
    const/4 v0, 0x7

    iput v0, v4, Landroid/os/Message;->what:I

    .line 1531
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, v4, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 1532
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth$10;->a:Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;->P(Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;)Landroid/os/Handler;

    move-result-object v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 1533
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth$10;->a:Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;->P(Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;)Landroid/os/Handler;

    move-result-object v0

    invoke-virtual {v0, v4}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    .line 1535
    :cond_0
    return-void
.end method

.method public onSuccess(ILjava/lang/Object;)V
    .locals 5

    .line 1515
    invoke-static {}, Landroid/os/Message;->obtain()Landroid/os/Message;

    move-result-object v4

    .line 1517
    const/4 v0, 0x7

    iput v0, v4, Landroid/os/Message;->what:I

    .line 1518
    iput-object p2, v4, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 1519
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth$10;->a:Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;->P(Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;)Landroid/os/Handler;

    move-result-object v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 1520
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth$10;->a:Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;->P(Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;)Landroid/os/Handler;

    move-result-object v0

    invoke-virtual {v0, v4}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    .line 1523
    :cond_0
    const-string v0, "WeightActivity_TrendFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getGoalData()onSuccess,sendMessage success"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1524
    return-void
.end method
