.class Lcom/huawei/ui/device/activity/update/WeightDeviceOtaActivity$3;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/ahi$e;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/ui/device/activity/update/WeightDeviceOtaActivity;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic c:Lcom/huawei/ui/device/activity/update/WeightDeviceOtaActivity;


# direct methods
.method constructor <init>(Lcom/huawei/ui/device/activity/update/WeightDeviceOtaActivity;)V
    .locals 0

    .line 231
    iput-object p1, p0, Lcom/huawei/ui/device/activity/update/WeightDeviceOtaActivity$3;->c:Lcom/huawei/ui/device/activity/update/WeightDeviceOtaActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onEvent(Lo/ahi$a;)V
    .locals 6

    .line 234
    invoke-virtual {p1}, Lo/ahi$a;->e()Landroid/content/Intent;

    move-result-object v4

    .line 235
    const-string v0, "upgrade_update_status"

    invoke-virtual {p1}, Lo/ahi$a;->a()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_4

    .line 236
    const-string v0, "update_status"

    const/4 v1, 0x0

    invoke-virtual {v4, v0, v1}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I

    move-result v5

    .line 237
    if-nez v5, :cond_0

    .line 238
    iget-object v0, p0, Lcom/huawei/ui/device/activity/update/WeightDeviceOtaActivity$3;->c:Lcom/huawei/ui/device/activity/update/WeightDeviceOtaActivity;

    invoke-static {v0}, Lcom/huawei/ui/device/activity/update/WeightDeviceOtaActivity;->d(Lcom/huawei/ui/device/activity/update/WeightDeviceOtaActivity;)V

    .line 239
    const-string v0, "DeviceOtaActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "update success."

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    goto :goto_0

    .line 240
    :cond_0
    const/4 v0, 0x1

    if-ne v5, v0, :cond_1

    .line 241
    const-string v0, "DeviceOtaActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "update fail. timeout"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 242
    iget-object v0, p0, Lcom/huawei/ui/device/activity/update/WeightDeviceOtaActivity$3;->c:Lcom/huawei/ui/device/activity/update/WeightDeviceOtaActivity;

    invoke-static {v0, v5}, Lcom/huawei/ui/device/activity/update/WeightDeviceOtaActivity;->c(Lcom/huawei/ui/device/activity/update/WeightDeviceOtaActivity;I)V

    goto :goto_0

    .line 243
    :cond_1
    const/4 v0, 0x2

    if-ne v5, v0, :cond_2

    .line 244
    const-string v0, "DeviceOtaActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "update fail. CS error"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 245
    iget-object v0, p0, Lcom/huawei/ui/device/activity/update/WeightDeviceOtaActivity$3;->c:Lcom/huawei/ui/device/activity/update/WeightDeviceOtaActivity;

    const/4 v1, 0x2

    invoke-static {v0, v1}, Lcom/huawei/ui/device/activity/update/WeightDeviceOtaActivity;->b(Lcom/huawei/ui/device/activity/update/WeightDeviceOtaActivity;I)V

    goto :goto_0

    .line 246
    :cond_2
    const/4 v0, 0x4

    if-ne v5, v0, :cond_3

    .line 247
    const-string v0, "DeviceOtaActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "update fail. power low"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 248
    iget-object v0, p0, Lcom/huawei/ui/device/activity/update/WeightDeviceOtaActivity$3;->c:Lcom/huawei/ui/device/activity/update/WeightDeviceOtaActivity;

    invoke-static {v0, v5}, Lcom/huawei/ui/device/activity/update/WeightDeviceOtaActivity;->c(Lcom/huawei/ui/device/activity/update/WeightDeviceOtaActivity;I)V

    goto :goto_0

    .line 250
    :cond_3
    iget-object v0, p0, Lcom/huawei/ui/device/activity/update/WeightDeviceOtaActivity$3;->c:Lcom/huawei/ui/device/activity/update/WeightDeviceOtaActivity;

    invoke-static {v0, v5}, Lcom/huawei/ui/device/activity/update/WeightDeviceOtaActivity;->c(Lcom/huawei/ui/device/activity/update/WeightDeviceOtaActivity;I)V

    .line 251
    const-string v0, "DeviceOtaActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "update fail"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 253
    :goto_0
    goto :goto_1

    :cond_4
    const-string v0, "upgrade_update_progress"

    invoke-virtual {p1}, Lo/ahi$a;->a()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_5

    .line 254
    iget-object v0, p0, Lcom/huawei/ui/device/activity/update/WeightDeviceOtaActivity$3;->c:Lcom/huawei/ui/device/activity/update/WeightDeviceOtaActivity;

    invoke-static {v0}, Lcom/huawei/ui/device/activity/update/WeightDeviceOtaActivity;->e(Lcom/huawei/ui/device/activity/update/WeightDeviceOtaActivity;)Lo/eof;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/ui/device/activity/update/WeightDeviceOtaActivity$3;->c:Lcom/huawei/ui/device/activity/update/WeightDeviceOtaActivity;

    invoke-static {v1}, Lcom/huawei/ui/device/activity/update/WeightDeviceOtaActivity;->e(Lcom/huawei/ui/device/activity/update/WeightDeviceOtaActivity;)Lo/eof;

    const/16 v1, 0xb

    iput v1, v0, Lo/eof;->f:I

    .line 255
    const-string v0, "update_progress"

    const/4 v1, 0x0

    invoke-virtual {v4, v0, v1}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I

    move-result v5

    .line 256
    iget-object v0, p0, Lcom/huawei/ui/device/activity/update/WeightDeviceOtaActivity$3;->c:Lcom/huawei/ui/device/activity/update/WeightDeviceOtaActivity;

    invoke-static {v0, v5}, Lcom/huawei/ui/device/activity/update/WeightDeviceOtaActivity;->e(Lcom/huawei/ui/device/activity/update/WeightDeviceOtaActivity;I)V

    .line 258
    :cond_5
    :goto_1
    return-void
.end method
