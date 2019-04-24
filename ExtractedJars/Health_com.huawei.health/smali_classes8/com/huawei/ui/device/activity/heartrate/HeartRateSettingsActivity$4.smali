.class Lcom/huawei/ui/device/activity/heartrate/HeartRateSettingsActivity$4;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/huawei/hwbasemgr/IBaseResponseCallback;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/ui/device/activity/heartrate/HeartRateSettingsActivity;->e()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic e:Lcom/huawei/ui/device/activity/heartrate/HeartRateSettingsActivity;


# direct methods
.method constructor <init>(Lcom/huawei/ui/device/activity/heartrate/HeartRateSettingsActivity;)V
    .locals 0

    .line 96
    iput-object p1, p0, Lcom/huawei/ui/device/activity/heartrate/HeartRateSettingsActivity$4;->e:Lcom/huawei/ui/device/activity/heartrate/HeartRateSettingsActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onResponse(ILjava/lang/Object;)V
    .locals 7

    .line 99
    const-string v0, "HeartRateSettingsActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "HEART_RATE_BUTTON err_code = "

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

    .line 100
    const/4 v4, 0x0

    .line 101
    const/4 v0, 0x0

    if-ne v0, p1, :cond_2

    .line 102
    move-object v5, p2

    check-cast v5, Ljava/lang/String;

    .line 103
    const/4 v0, 0x0

    if-eq v0, v5, :cond_2

    .line 104
    invoke-static {v5}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v6

    .line 105
    const/4 v0, 0x1

    if-ne v0, v6, :cond_1

    .line 106
    const/4 v4, 0x1

    goto :goto_1

    .line 108
    :cond_1
    const/4 v4, 0x0

    .line 112
    :cond_2
    :goto_1
    const-string v0, "HeartRateSettingsActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "initData() getHeartRateEnable "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 113
    move v5, v4

    .line 114
    iget-object v0, p0, Lcom/huawei/ui/device/activity/heartrate/HeartRateSettingsActivity$4;->e:Lcom/huawei/ui/device/activity/heartrate/HeartRateSettingsActivity;

    new-instance v1, Lcom/huawei/ui/device/activity/heartrate/HeartRateSettingsActivity$4$2;

    invoke-direct {v1, p0, v5}, Lcom/huawei/ui/device/activity/heartrate/HeartRateSettingsActivity$4$2;-><init>(Lcom/huawei/ui/device/activity/heartrate/HeartRateSettingsActivity$4;Z)V

    invoke-virtual {v0, v1}, Lcom/huawei/ui/device/activity/heartrate/HeartRateSettingsActivity;->runOnUiThread(Ljava/lang/Runnable;)V

    .line 121
    iget-object v0, p0, Lcom/huawei/ui/device/activity/heartrate/HeartRateSettingsActivity$4;->e:Lcom/huawei/ui/device/activity/heartrate/HeartRateSettingsActivity;

    invoke-static {v0}, Lcom/huawei/ui/device/activity/heartrate/HeartRateSettingsActivity;->c(Lcom/huawei/ui/device/activity/heartrate/HeartRateSettingsActivity;)Lo/enz;

    move-result-object v0

    invoke-virtual {v0, v4}, Lo/enz;->a(Z)V

    .line 122
    return-void
.end method
