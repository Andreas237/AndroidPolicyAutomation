.class Lcom/huawei/ui/device/activity/heartrate/ContinueHeartRateSettingActivity$3;
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
.field final synthetic b:Lcom/huawei/ui/device/activity/heartrate/ContinueHeartRateSettingActivity;


# direct methods
.method constructor <init>(Lcom/huawei/ui/device/activity/heartrate/ContinueHeartRateSettingActivity;)V
    .locals 0

    .line 189
    iput-object p1, p0, Lcom/huawei/ui/device/activity/heartrate/ContinueHeartRateSettingActivity$3;->b:Lcom/huawei/ui/device/activity/heartrate/ContinueHeartRateSettingActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onResponse(ILjava/lang/Object;)V
    .locals 4

    .line 192
    const-string v0, "ContinueHeartRateSettingActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "getHeartRateRaiseRemindNumber err_code = "

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

    .line 193
    const/4 v0, 0x0

    if-ne v0, p1, :cond_1

    const/4 v0, 0x0

    if-eq v0, p2, :cond_1

    .line 194
    iget-object v0, p0, Lcom/huawei/ui/device/activity/heartrate/ContinueHeartRateSettingActivity$3;->b:Lcom/huawei/ui/device/activity/heartrate/ContinueHeartRateSettingActivity;

    move-object v1, p2

    check-cast v1, Ljava/lang/Integer;

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    invoke-static {v0, v1}, Lcom/huawei/ui/device/activity/heartrate/ContinueHeartRateSettingActivity;->c(Lcom/huawei/ui/device/activity/heartrate/ContinueHeartRateSettingActivity;I)I

    .line 196
    :cond_1
    iget-object v0, p0, Lcom/huawei/ui/device/activity/heartrate/ContinueHeartRateSettingActivity$3;->b:Lcom/huawei/ui/device/activity/heartrate/ContinueHeartRateSettingActivity;

    invoke-static {v0}, Lcom/huawei/ui/device/activity/heartrate/ContinueHeartRateSettingActivity;->b(Lcom/huawei/ui/device/activity/heartrate/ContinueHeartRateSettingActivity;)Ljava/util/concurrent/Semaphore;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/concurrent/Semaphore;->release()V

    .line 197
    return-void
.end method
