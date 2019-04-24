.class Lo/esw$2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/huawei/hwbasemgr/IBaseResponseCallback;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/esw;->b()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic c:Lo/esw;


# direct methods
.method constructor <init>(Lo/esw;)V
    .locals 0

    .line 82
    iput-object p1, p0, Lo/esw$2;->c:Lo/esw;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onResponse(ILjava/lang/Object;)V
    .locals 7

    .line 85
    move-object v4, p2

    check-cast v4, Lcom/huawei/hwsmartinteractmgr/data/SmartMsgDBObject;

    .line 86
    const/4 v0, 0x0

    if-eq v0, v4, :cond_1

    .line 87
    iget-object v0, p0, Lo/esw$2;->c:Lo/esw;

    invoke-static {v0}, Lo/esw;->b(Lo/esw;)Landroid/os/Handler;

    move-result-object v0

    const/16 v1, 0x2710

    invoke-virtual {v0, v1}, Landroid/os/Handler;->obtainMessage(I)Landroid/os/Message;

    move-result-object v5

    .line 88
    iput-object v4, v5, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 89
    iget-object v0, p0, Lo/esw$2;->c:Lo/esw;

    invoke-static {v0}, Lo/esw;->b(Lo/esw;)Landroid/os/Handler;

    move-result-object v0

    invoke-virtual {v0, v5}, Landroid/os/Handler;->sendMessageAtFrontOfQueue(Landroid/os/Message;)Z

    move-result v6

    .line 90
    const-string v0, "UIHLH_OperaMsgInteractors"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "queryOperationPositionMsg result = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v6}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 91
    if-nez v6, :cond_0

    .line 92
    iget-object v0, p0, Lo/esw$2;->c:Lo/esw;

    invoke-static {v0}, Lo/esw;->b(Lo/esw;)Landroid/os/Handler;

    move-result-object v0

    invoke-virtual {v0, v5}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    .line 94
    :cond_0
    goto :goto_0

    .line 95
    :cond_1
    const-string v0, "UIHLH_OperaMsgInteractors"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "smartMsgDBObject is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 96
    iget-object v0, p0, Lo/esw$2;->c:Lo/esw;

    invoke-static {v0}, Lo/esw;->b(Lo/esw;)Landroid/os/Handler;

    move-result-object v0

    const/16 v1, 0x2711

    invoke-virtual {v0, v1}, Landroid/os/Handler;->sendEmptyMessage(I)Z

    .line 98
    :goto_0
    return-void
.end method
