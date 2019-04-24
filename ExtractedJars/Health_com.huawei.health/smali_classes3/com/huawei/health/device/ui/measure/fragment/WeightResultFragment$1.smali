.class Lcom/huawei/health/device/ui/measure/fragment/WeightResultFragment$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/clz;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/health/device/ui/measure/fragment/WeightResultFragment;->onCreate(Landroid/os/Bundle;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/huawei/health/device/ui/measure/fragment/WeightResultFragment;


# direct methods
.method constructor <init>(Lcom/huawei/health/device/ui/measure/fragment/WeightResultFragment;)V
    .locals 0

    .line 73
    iput-object p1, p0, Lcom/huawei/health/device/ui/measure/fragment/WeightResultFragment$1;->this$0:Lcom/huawei/health/device/ui/measure/fragment/WeightResultFragment;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onFailure(ILjava/lang/Object;)V
    .locals 4

    .line 97
    const-string v0, "PluginDevice_PluginDevice"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "WeightResultFragment failed to get data"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 98
    return-void
.end method

.method public onSuccess(ILjava/lang/Object;)V
    .locals 7

    .line 77
    const/4 v0, 0x0

    if-eq v0, p2, :cond_1

    .line 78
    const/4 v5, 0x0

    .line 80
    move-object v0, p2

    :try_start_0
    check-cast v0, Ljava/util/List;
    :try_end_0
    .catch Ljava/lang/ClassCastException; {:try_start_0 .. :try_end_0} :catch_0

    move-object v5, v0

    .line 83
    goto :goto_0

    .line 81
    :catch_0
    move-exception v6

    .line 82
    const-string v0, "PluginDevice_PluginDevice"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "WeightResultFragment ClassCastException"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v6}, Ljava/lang/ClassCastException;->getMessage()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 85
    :goto_0
    const/4 v0, 0x0

    if-eq v0, v5, :cond_0

    invoke-interface {v5}, Ljava/util/List;->size()I

    move-result v0

    if-lez v0, :cond_0

    .line 86
    const/4 v0, 0x0

    invoke-interface {v5, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v6, v0

    check-cast v6, Lcom/huawei/hihealth/HiGoalInfo;

    .line 87
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WeightResultFragment$1;->this$0:Lcom/huawei/health/device/ui/measure/fragment/WeightResultFragment;

    invoke-virtual {v6}, Lcom/huawei/hihealth/HiGoalInfo;->getGoalValue()D

    move-result-wide v1

    invoke-static {v0, v1, v2}, Lcom/huawei/health/device/ui/measure/fragment/WeightResultFragment;->access$002(Lcom/huawei/health/device/ui/measure/fragment/WeightResultFragment;D)D

    .line 88
    const-string v0, "PluginDevice_PluginDevice"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "get mTargetWeightValue from HiHealthManager is "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lcom/huawei/health/device/ui/measure/fragment/WeightResultFragment$1;->this$0:Lcom/huawei/health/device/ui/measure/fragment/WeightResultFragment;

    invoke-static {v3}, Lcom/huawei/health/device/ui/measure/fragment/WeightResultFragment;->access$000(Lcom/huawei/health/device/ui/measure/fragment/WeightResultFragment;)D

    move-result-wide v3

    invoke-virtual {v2, v3, v4}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 90
    :cond_0
    goto :goto_1

    .line 91
    :cond_1
    const-string v0, "PluginDevice_PluginDevice"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "WeightResultFragment parseData data is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 93
    :goto_1
    return-void
.end method
