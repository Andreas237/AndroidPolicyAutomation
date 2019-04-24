.class Lo/esl$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/huawei/hwbasemgr/IBaseResponseCallback;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/esl;->c()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic e:Lo/esl;


# direct methods
.method constructor <init>(Lo/esl;)V
    .locals 0

    .line 204
    iput-object p1, p0, Lo/esl$1;->e:Lo/esl;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onResponse(ILjava/lang/Object;)V
    .locals 7

    .line 207
    const-string v0, "SmartCardData"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "querySmartMsg onResponse"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 208
    move-object v4, p2

    check-cast v4, Ljava/util/List;

    .line 209
    if-eqz v4, :cond_2

    invoke-interface {v4}, Ljava/util/List;->size()I

    move-result v0

    if-lez v0, :cond_2

    .line 210
    iget-object v0, p0, Lo/esl$1;->e:Lo/esl;

    invoke-static {v0}, Lo/esl;->e(Lo/esl;)Landroid/os/Handler;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/os/Handler;->obtainMessage(I)Landroid/os/Message;

    move-result-object v5

    .line 211
    const/4 v0, 0x0

    invoke-interface {v4, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    iput-object v0, v5, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 212
    iget-object v0, v5, Landroid/os/Message;->obj:Ljava/lang/Object;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_1

    .line 213
    iget-object v0, p0, Lo/esl$1;->e:Lo/esl;

    invoke-static {v0}, Lo/esl;->e(Lo/esl;)Landroid/os/Handler;

    move-result-object v0

    invoke-virtual {v0, v5}, Landroid/os/Handler;->sendMessageAtFrontOfQueue(Landroid/os/Message;)Z

    move-result v6

    .line 214
    const-string v0, "SmartCardData"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "querySmartMsgData result = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v6}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 215
    if-nez v6, :cond_0

    .line 216
    iget-object v0, p0, Lo/esl$1;->e:Lo/esl;

    invoke-static {v0}, Lo/esl;->e(Lo/esl;)Landroid/os/Handler;

    move-result-object v0

    invoke-virtual {v0, v5}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    .line 218
    :cond_0
    const-string v0, "SmartCardData"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "MSG_SHOW_SMART_CARD_getSmartMsgData"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x0

    invoke-interface {v4, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/huawei/hwsmartinteractmgr/data/SmartMsgDBObject;

    invoke-virtual {v2}, Lcom/huawei/hwsmartinteractmgr/data/SmartMsgDBObject;->getMsgType()I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 220
    :cond_1
    goto :goto_0

    .line 221
    :cond_2
    iget-object v0, p0, Lo/esl$1;->e:Lo/esl;

    invoke-static {v0}, Lo/esl;->e(Lo/esl;)Landroid/os/Handler;

    move-result-object v0

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/os/Handler;->sendEmptyMessage(I)Z

    .line 223
    :goto_0
    return-void
.end method
