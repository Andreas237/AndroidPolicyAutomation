.class Lcom/huawei/ui/device/activity/core_sleep/CoreSleepSelectorActivity$3;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/huawei/hwbasemgr/IBaseResponseCallback;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/ui/device/activity/core_sleep/CoreSleepSelectorActivity;->onResume()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/huawei/ui/device/activity/core_sleep/CoreSleepSelectorActivity;


# direct methods
.method constructor <init>(Lcom/huawei/ui/device/activity/core_sleep/CoreSleepSelectorActivity;)V
    .locals 0

    .line 116
    iput-object p1, p0, Lcom/huawei/ui/device/activity/core_sleep/CoreSleepSelectorActivity$3;->a:Lcom/huawei/ui/device/activity/core_sleep/CoreSleepSelectorActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onResponse(ILjava/lang/Object;)V
    .locals 7

    .line 119
    const-string v0, "CORESLEEPMISSON_CoreSleepSelectorActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "CORE_SLEEP_BUTTON err_code = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, " ; objData = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const/4 v3, 0x0

    if-ne v3, p2, :cond_0

    const-string v3, "null"

    goto :goto_0

    :cond_0
    move-object v3, p2

    :goto_0
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 120
    const/4 v4, 0x0

    .line 121
    const/4 v0, 0x0

    if-ne v0, p1, :cond_2

    .line 122
    move-object v5, p2

    check-cast v5, Ljava/lang/String;

    .line 123
    const/4 v0, 0x0

    if-eq v0, v5, :cond_2

    .line 124
    invoke-static {v5}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v6

    .line 125
    const/4 v0, 0x1

    if-ne v0, v6, :cond_1

    .line 126
    const/4 v4, 0x1

    goto :goto_1

    .line 128
    :cond_1
    const/4 v4, 0x0

    .line 132
    :cond_2
    :goto_1
    const-string v0, "CORESLEEPMISSON_CoreSleepSelectorActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "mDeviceInteractors.getCoreSleepBtStatus():"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 133
    move v5, v4

    .line 134
    iget-object v0, p0, Lcom/huawei/ui/device/activity/core_sleep/CoreSleepSelectorActivity$3;->a:Lcom/huawei/ui/device/activity/core_sleep/CoreSleepSelectorActivity;

    new-instance v1, Lcom/huawei/ui/device/activity/core_sleep/CoreSleepSelectorActivity$3$5;

    invoke-direct {v1, p0, v5}, Lcom/huawei/ui/device/activity/core_sleep/CoreSleepSelectorActivity$3$5;-><init>(Lcom/huawei/ui/device/activity/core_sleep/CoreSleepSelectorActivity$3;Z)V

    invoke-virtual {v0, v1}, Lcom/huawei/ui/device/activity/core_sleep/CoreSleepSelectorActivity;->runOnUiThread(Ljava/lang/Runnable;)V

    .line 153
    return-void
.end method
