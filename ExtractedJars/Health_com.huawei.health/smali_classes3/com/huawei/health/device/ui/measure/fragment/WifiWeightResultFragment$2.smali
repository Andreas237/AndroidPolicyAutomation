.class Lcom/huawei/health/device/ui/measure/fragment/WifiWeightResultFragment$2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/clz;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/health/device/ui/measure/fragment/WifiWeightResultFragment;->getUserTargetWeightValue()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/huawei/health/device/ui/measure/fragment/WifiWeightResultFragment;


# direct methods
.method constructor <init>(Lcom/huawei/health/device/ui/measure/fragment/WifiWeightResultFragment;)V
    .locals 0

    .line 153
    iput-object p1, p0, Lcom/huawei/health/device/ui/measure/fragment/WifiWeightResultFragment$2;->this$0:Lcom/huawei/health/device/ui/measure/fragment/WifiWeightResultFragment;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onFailure(ILjava/lang/Object;)V
    .locals 4

    .line 181
    const-string v0, "WifiWeightResultFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getUserTargetWeightValue failed to get data"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x0

    invoke-static {v2, v0, v1}, Lo/aho;->c(ZLjava/lang/String;[Ljava/lang/Object;)V

    .line 182
    return-void
.end method

.method public onSuccess(ILjava/lang/Object;)V
    .locals 7

    .line 156
    const/4 v0, 0x0

    if-eq v0, p2, :cond_1

    .line 157
    const/4 v5, 0x0

    .line 159
    move-object v0, p2

    :try_start_0
    check-cast v0, Ljava/util/List;
    :try_end_0
    .catch Ljava/lang/ClassCastException; {:try_start_0 .. :try_end_0} :catch_0

    move-object v5, v0

    .line 162
    goto :goto_0

    .line 160
    :catch_0
    move-exception v6

    .line 161
    const-string v0, "WifiWeightResultFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "getUserTargetWeightValue ClassCastException"

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

    const/4 v2, 0x0

    invoke-static {v2, v0, v1}, Lo/aho;->d(ZLjava/lang/String;[Ljava/lang/Object;)V

    .line 163
    :goto_0
    const/4 v0, 0x0

    if-eq v0, v5, :cond_0

    invoke-interface {v5}, Ljava/util/List;->size()I

    move-result v0

    if-lez v0, :cond_0

    .line 164
    const/4 v0, 0x0

    invoke-interface {v5, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v6, v0

    check-cast v6, Lcom/huawei/hihealth/HiGoalInfo;

    .line 165
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WifiWeightResultFragment$2;->this$0:Lcom/huawei/health/device/ui/measure/fragment/WifiWeightResultFragment;

    invoke-virtual {v6}, Lcom/huawei/hihealth/HiGoalInfo;->getGoalValue()D

    move-result-wide v1

    invoke-static {v0, v1, v2}, Lcom/huawei/health/device/ui/measure/fragment/WifiWeightResultFragment;->access$102(Lcom/huawei/health/device/ui/measure/fragment/WifiWeightResultFragment;D)D

    .line 166
    const-string v0, "WifiWeightResultFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "get mTargetWeightValue from HiHealthManager is "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lcom/huawei/health/device/ui/measure/fragment/WifiWeightResultFragment$2;->this$0:Lcom/huawei/health/device/ui/measure/fragment/WifiWeightResultFragment;

    invoke-static {v3}, Lcom/huawei/health/device/ui/measure/fragment/WifiWeightResultFragment;->access$100(Lcom/huawei/health/device/ui/measure/fragment/WifiWeightResultFragment;)D

    move-result-wide v3

    invoke-virtual {v2, v3, v4}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x0

    invoke-static {v2, v0, v1}, Lo/aho;->d(ZLjava/lang/String;[Ljava/lang/Object;)V

    .line 167
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WifiWeightResultFragment$2;->this$0:Lcom/huawei/health/device/ui/measure/fragment/WifiWeightResultFragment;

    invoke-static {v0}, Lcom/huawei/health/device/ui/measure/fragment/WifiWeightResultFragment;->access$300(Lcom/huawei/health/device/ui/measure/fragment/WifiWeightResultFragment;)Landroid/app/Activity;

    move-result-object v0

    new-instance v1, Lcom/huawei/health/device/ui/measure/fragment/WifiWeightResultFragment$2$1;

    invoke-direct {v1, p0}, Lcom/huawei/health/device/ui/measure/fragment/WifiWeightResultFragment$2$1;-><init>(Lcom/huawei/health/device/ui/measure/fragment/WifiWeightResultFragment$2;)V

    invoke-virtual {v0, v1}, Landroid/app/Activity;->runOnUiThread(Ljava/lang/Runnable;)V

    .line 174
    :cond_0
    goto :goto_1

    .line 175
    :cond_1
    const-string v0, "WifiWeightResultFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getUserTargetWeightValue parseData data is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x0

    invoke-static {v2, v0, v1}, Lo/aho;->c(ZLjava/lang/String;[Ljava/lang/Object;)V

    .line 177
    :goto_1
    return-void
.end method
