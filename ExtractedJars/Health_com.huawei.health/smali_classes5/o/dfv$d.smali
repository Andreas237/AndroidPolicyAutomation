.class Lo/dfv$d;
.super Landroid/os/Handler;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo/dfv;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = "d"
.end annotation


# instance fields
.field final synthetic e:Lo/dfv;


# direct methods
.method public constructor <init>(Lo/dfv;Landroid/os/Looper;)V
    .locals 0

    .line 1337
    iput-object p1, p0, Lo/dfv$d;->e:Lo/dfv;

    .line 1338
    invoke-direct {p0, p2}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    .line 1339
    return-void
.end method


# virtual methods
.method public handleMessage(Landroid/os/Message;)V
    .locals 5

    .line 1343
    invoke-super {p0, p1}, Landroid/os/Handler;->handleMessage(Landroid/os/Message;)V

    .line 1344
    iget v0, p1, Landroid/os/Message;->what:I

    sparse-switch v0, :sswitch_data_0

    goto :goto_0

    .line 1346
    :sswitch_0
    const-string v0, "HWFitnessAW70Mgr"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, " handleMessage() FitnessCommandID.COMMAND_FITNESS_SET_MOTION_GOAL"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1347
    goto :goto_0

    .line 1350
    :sswitch_1
    const-string v0, "HWFitnessAW70Mgr"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, " handleMessage() FitnessCommandID.GET_FITNESS_GET_ACTIVITY_REMINDER"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1351
    iget-object v0, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 1352
    iget-object v0, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    move-object v4, v0

    check-cast v4, Lcom/huawei/hwcommonmodel/fitnessdatatype/ActivityReminder;

    .line 1353
    const-string v0, "HWFitnessAW70Mgr"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "send other device configuration."

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1355
    invoke-static {v4}, Lo/dgb;->b(Lcom/huawei/hwcommonmodel/fitnessdatatype/ActivityReminder;)V

    .line 1357
    :cond_0
    iget-object v0, p0, Lo/dfv$d;->e:Lo/dfv;

    invoke-static {v0}, Lo/dfv;->a(Lo/dfv;)V

    .line 1358
    .line 1363
    :goto_0
    return-void

    :sswitch_data_0
    .sparse-switch
        0x1 -> :sswitch_0
        0x2711 -> :sswitch_1
    .end sparse-switch
.end method
