.class Lo/dca$2;
.super Landroid/content/BroadcastReceiver;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo/dca;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lo/dca;


# direct methods
.method constructor <init>(Lo/dca;)V
    .locals 0

    .line 1120
    iput-object p1, p0, Lo/dca$2;->a:Lo/dca;

    invoke-direct {p0}, Landroid/content/BroadcastReceiver;-><init>()V

    return-void
.end method


# virtual methods
.method public onReceive(Landroid/content/Context;Landroid/content/Intent;)V
    .locals 7

    .line 1123
    const-string v0, "CORESLEEPMISSON_HwCoreSleepMgr"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "mConnectStateChangedReceiver(): intent = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {p2}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1124
    const/4 v0, 0x0

    if-eq v0, p1, :cond_2

    .line 1125
    const-string v0, "com.huawei.bone.action.CONNECTION_STATE_CHANGED"

    invoke-virtual {p2}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 1126
    const-string v0, "deviceinfo"

    invoke-virtual {p2, v0}, Landroid/content/Intent;->getParcelableExtra(Ljava/lang/String;)Landroid/os/Parcelable;

    move-result-object v4

    .line 1127
    const/4 v0, 0x0

    if-eq v0, v4, :cond_0

    instance-of v0, v4, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;

    if-nez v0, :cond_1

    .line 1128
    :cond_0
    const-string v0, "CORESLEEPMISSON_HwCoreSleepMgr"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "mConnectStateChangedReceiver(): cast error"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1129
    return-void

    .line 1131
    :cond_1
    move-object v5, v4

    check-cast v5, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;

    .line 1133
    invoke-virtual {v5}, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->getDeviceConnectState()I

    move-result v6

    .line 1134
    const-string v0, "CORESLEEPMISSON_HwCoreSleepMgr"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "mConnectStateChangedReceiver(): "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v5}, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->getDeviceName()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, ",state = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v6}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1135
    const/4 v0, 0x3

    if-ne v6, v0, :cond_2

    .line 1136
    const-string v0, "CORESLEEPMISSON_HwCoreSleepMgr"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, " bt disconnect, coreSleepSyncFlag =  "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lo/dca$2;->a:Lo/dca;

    iget v3, v3, Lo/dca;->a:I

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1137
    iget-object v0, p0, Lo/dca$2;->a:Lo/dca;

    iget v0, v0, Lo/dca;->a:I

    const/4 v1, 0x2

    if-ne v1, v0, :cond_2

    .line 1138
    iget-object v0, p0, Lo/dca$2;->a:Lo/dca;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lo/dca;->b(Lo/dca;Z)Z

    .line 1139
    iget-object v0, p0, Lo/dca$2;->a:Lo/dca;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lo/dca;->e(Lo/dca;Z)Z

    .line 1140
    iget-object v0, p0, Lo/dca$2;->a:Lo/dca;

    invoke-static {v0}, Lo/dca;->e(Lo/dca;)V

    .line 1141
    iget-object v0, p0, Lo/dca$2;->a:Lo/dca;

    const/4 v1, -0x1

    invoke-static {v0, v1}, Lo/dca;->b(Lo/dca;I)V

    .line 1143
    iget-object v0, p0, Lo/dca$2;->a:Lo/dca;

    const-string v1, ""

    const/16 v2, 0x5208

    invoke-static {v0, v2, v1}, Lo/dca;->e(Lo/dca;ILjava/lang/String;)V

    .line 1151
    :cond_2
    return-void
.end method
