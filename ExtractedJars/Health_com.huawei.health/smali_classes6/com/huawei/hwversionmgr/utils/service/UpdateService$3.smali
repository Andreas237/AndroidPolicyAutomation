.class Lcom/huawei/hwversionmgr/utils/service/UpdateService$3;
.super Landroid/content/BroadcastReceiver;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/hwversionmgr/utils/service/UpdateService;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic d:Lcom/huawei/hwversionmgr/utils/service/UpdateService;


# direct methods
.method constructor <init>(Lcom/huawei/hwversionmgr/utils/service/UpdateService;)V
    .locals 0

    .line 240
    iput-object p1, p0, Lcom/huawei/hwversionmgr/utils/service/UpdateService$3;->d:Lcom/huawei/hwversionmgr/utils/service/UpdateService;

    invoke-direct {p0}, Landroid/content/BroadcastReceiver;-><init>()V

    return-void
.end method


# virtual methods
.method public onReceive(Landroid/content/Context;Landroid/content/Intent;)V
    .locals 6

    .line 243
    invoke-virtual {p2}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    move-result-object v4

    .line 244
    const-string v0, "android.intent.action.BATTERY_CHANGED"

    invoke-virtual {v0, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_4

    .line 245
    const-string v0, "level"

    const/4 v1, 0x0

    invoke-virtual {p2, v0, v1}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I

    move-result v5

    .line 246
    const-string v0, "UpdateService"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Batrery level = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 248
    iget-object v0, p0, Lcom/huawei/hwversionmgr/utils/service/UpdateService$3;->d:Lcom/huawei/hwversionmgr/utils/service/UpdateService;

    invoke-static {v0}, Lcom/huawei/hwversionmgr/utils/service/UpdateService;->d(Lcom/huawei/hwversionmgr/utils/service/UpdateService;)I

    move-result v0

    if-gez v0, :cond_3

    .line 249
    iget-object v0, p0, Lcom/huawei/hwversionmgr/utils/service/UpdateService$3;->d:Lcom/huawei/hwversionmgr/utils/service/UpdateService;

    invoke-static {v0, v5}, Lcom/huawei/hwversionmgr/utils/service/UpdateService;->b(Lcom/huawei/hwversionmgr/utils/service/UpdateService;I)I

    .line 250
    iget-object v0, p0, Lcom/huawei/hwversionmgr/utils/service/UpdateService$3;->d:Lcom/huawei/hwversionmgr/utils/service/UpdateService;

    invoke-static {v0}, Lcom/huawei/hwversionmgr/utils/service/UpdateService;->d(Lcom/huawei/hwversionmgr/utils/service/UpdateService;)I

    move-result v0

    const/16 v1, 0xa

    if-ge v0, v1, :cond_0

    .line 251
    const-string v0, "UpdateService"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Batrery mBatteryLevel = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lcom/huawei/hwversionmgr/utils/service/UpdateService$3;->d:Lcom/huawei/hwversionmgr/utils/service/UpdateService;

    invoke-static {v3}, Lcom/huawei/hwversionmgr/utils/service/UpdateService;->d(Lcom/huawei/hwversionmgr/utils/service/UpdateService;)I

    move-result v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 252
    const/16 v0, 0x16

    const/4 v1, 0x4

    invoke-static {v0, v1}, Lo/dpr;->c(II)V

    .line 253
    iget-object v0, p0, Lcom/huawei/hwversionmgr/utils/service/UpdateService$3;->d:Lcom/huawei/hwversionmgr/utils/service/UpdateService;

    invoke-virtual {v0}, Lcom/huawei/hwversionmgr/utils/service/UpdateService;->stopSelf()V

    goto :goto_0

    .line 255
    :cond_0
    const-string v0, "UpdateService"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "Batrery check ok! "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 256
    iget-object v0, p0, Lcom/huawei/hwversionmgr/utils/service/UpdateService$3;->d:Lcom/huawei/hwversionmgr/utils/service/UpdateService;

    invoke-static {v0}, Lcom/huawei/hwversionmgr/utils/service/UpdateService;->e(Lcom/huawei/hwversionmgr/utils/service/UpdateService;)I

    move-result v0

    const/4 v1, 0x2

    if-eq v0, v1, :cond_1

    iget-object v0, p0, Lcom/huawei/hwversionmgr/utils/service/UpdateService$3;->d:Lcom/huawei/hwversionmgr/utils/service/UpdateService;

    invoke-static {v0}, Lcom/huawei/hwversionmgr/utils/service/UpdateService;->e(Lcom/huawei/hwversionmgr/utils/service/UpdateService;)I

    move-result v0

    if-nez v0, :cond_2

    .line 257
    :cond_1
    iget-object v0, p0, Lcom/huawei/hwversionmgr/utils/service/UpdateService$3;->d:Lcom/huawei/hwversionmgr/utils/service/UpdateService;

    invoke-static {v0}, Lcom/huawei/hwversionmgr/utils/service/UpdateService;->a(Lcom/huawei/hwversionmgr/utils/service/UpdateService;)Lo/dpi;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/hwversionmgr/utils/service/UpdateService$3;->d:Lcom/huawei/hwversionmgr/utils/service/UpdateService;

    invoke-static {v1}, Lcom/huawei/hwversionmgr/utils/service/UpdateService;->b(Lcom/huawei/hwversionmgr/utils/service/UpdateService;)Lo/dpp;

    move-result-object v1

    const/4 v2, 0x1

    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lo/dpi;->d(Lo/dpp;Ljava/lang/Boolean;)V

    goto :goto_0

    .line 259
    :cond_2
    iget-object v0, p0, Lcom/huawei/hwversionmgr/utils/service/UpdateService$3;->d:Lcom/huawei/hwversionmgr/utils/service/UpdateService;

    invoke-static {v0}, Lcom/huawei/hwversionmgr/utils/service/UpdateService;->a(Lcom/huawei/hwversionmgr/utils/service/UpdateService;)Lo/dpi;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/hwversionmgr/utils/service/UpdateService$3;->d:Lcom/huawei/hwversionmgr/utils/service/UpdateService;

    invoke-static {v1}, Lcom/huawei/hwversionmgr/utils/service/UpdateService;->b(Lcom/huawei/hwversionmgr/utils/service/UpdateService;)Lo/dpp;

    move-result-object v1

    const/4 v2, 0x0

    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lo/dpi;->d(Lo/dpp;Ljava/lang/Boolean;)V

    goto :goto_0

    .line 263
    :cond_3
    const-string v0, "UpdateService"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "unregisterReceiver mGetPhoneBatteryReceiver "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 264
    iget-object v0, p0, Lcom/huawei/hwversionmgr/utils/service/UpdateService$3;->d:Lcom/huawei/hwversionmgr/utils/service/UpdateService;

    invoke-static {v0}, Lcom/huawei/hwversionmgr/utils/service/UpdateService;->f(Lcom/huawei/hwversionmgr/utils/service/UpdateService;)Landroid/content/Context;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/hwversionmgr/utils/service/UpdateService$3;->d:Lcom/huawei/hwversionmgr/utils/service/UpdateService;

    invoke-static {v1}, Lcom/huawei/hwversionmgr/utils/service/UpdateService;->c(Lcom/huawei/hwversionmgr/utils/service/UpdateService;)Landroid/content/BroadcastReceiver;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/content/Context;->unregisterReceiver(Landroid/content/BroadcastReceiver;)V

    .line 267
    :cond_4
    :goto_0
    return-void
.end method
