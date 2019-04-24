.class Lcom/huawei/ui/device/activity/heartrate/ContinueHeartRateSettingActivity$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/huawei/hwbasemgr/IBaseResponseCallback;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/ui/device/activity/heartrate/ContinueHeartRateSettingActivity;->d()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic c:Lcom/huawei/ui/device/activity/heartrate/ContinueHeartRateSettingActivity;


# direct methods
.method constructor <init>(Lcom/huawei/ui/device/activity/heartrate/ContinueHeartRateSettingActivity;)V
    .locals 0

    .line 153
    iput-object p1, p0, Lcom/huawei/ui/device/activity/heartrate/ContinueHeartRateSettingActivity$1;->c:Lcom/huawei/ui/device/activity/heartrate/ContinueHeartRateSettingActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onResponse(ILjava/lang/Object;)V
    .locals 6

    .line 157
    :try_start_0
    iget-object v0, p0, Lcom/huawei/ui/device/activity/heartrate/ContinueHeartRateSettingActivity$1;->c:Lcom/huawei/ui/device/activity/heartrate/ContinueHeartRateSettingActivity;

    invoke-static {v0}, Lcom/huawei/ui/device/activity/heartrate/ContinueHeartRateSettingActivity;->b(Lcom/huawei/ui/device/activity/heartrate/ContinueHeartRateSettingActivity;)Ljava/util/concurrent/Semaphore;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/concurrent/Semaphore;->acquire()V
    :try_end_0
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_0

    .line 160
    goto :goto_0

    .line 158
    :catch_0
    move-exception v4

    .line 159
    const-string v0, "ContinueHeartRateSettingActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    invoke-virtual {v4}, Ljava/lang/InterruptedException;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 161
    :goto_0
    const-string v0, "ContinueHeartRateSettingActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "CONTINUE_MEASURE_HEART_RATE err_code = "

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

    goto :goto_1

    :cond_0
    move-object v3, p2

    :goto_1
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 162
    const/4 v4, 0x0

    .line 163
    const/4 v0, 0x0

    if-ne v0, p1, :cond_1

    .line 164
    const/4 v0, 0x0

    if-eq v0, p2, :cond_1

    .line 165
    move-object v0, p2

    check-cast v0, Ljava/lang/String;

    invoke-static {v0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v4

    .line 168
    :cond_1
    const-string v0, "ContinueHeartRateSettingActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "CONTINUE_MEASURE_HEART_RATE status : "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 169
    move v5, v4

    .line 170
    iget-object v0, p0, Lcom/huawei/ui/device/activity/heartrate/ContinueHeartRateSettingActivity$1;->c:Lcom/huawei/ui/device/activity/heartrate/ContinueHeartRateSettingActivity;

    new-instance v1, Lcom/huawei/ui/device/activity/heartrate/ContinueHeartRateSettingActivity$1$2;

    invoke-direct {v1, p0, v5}, Lcom/huawei/ui/device/activity/heartrate/ContinueHeartRateSettingActivity$1$2;-><init>(Lcom/huawei/ui/device/activity/heartrate/ContinueHeartRateSettingActivity$1;I)V

    invoke-virtual {v0, v1}, Lcom/huawei/ui/device/activity/heartrate/ContinueHeartRateSettingActivity;->runOnUiThread(Ljava/lang/Runnable;)V

    .line 186
    return-void
.end method
