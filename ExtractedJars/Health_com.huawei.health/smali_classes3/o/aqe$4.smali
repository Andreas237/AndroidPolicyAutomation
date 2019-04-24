.class final Lo/aqe$4;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/brd;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/aqe;->b(Lcom/huawei/health/sns/model/chat/MessageItem;Landroid/os/Handler;I)Lo/brd;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;Lo/brd<Ljava/lang/Boolean;>;"
    }
.end annotation


# instance fields
.field final synthetic a:I

.field final synthetic c:Lcom/huawei/health/sns/model/chat/MessageItem;

.field final synthetic d:Landroid/os/Handler;


# direct methods
.method constructor <init>(Lcom/huawei/health/sns/model/chat/MessageItem;Landroid/os/Handler;I)V
    .locals 0

    .line 93
    iput-object p1, p0, Lo/aqe$4;->c:Lcom/huawei/health/sns/model/chat/MessageItem;

    iput-object p2, p0, Lo/aqe$4;->d:Landroid/os/Handler;

    iput p3, p0, Lo/aqe$4;->a:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public synthetic a(Lo/bra;)Ljava/lang/Object;
    .locals 1

    .line 93
    invoke-virtual {p0, p1}, Lo/aqe$4;->d(Lo/bra;)Ljava/lang/Boolean;

    move-result-object v0

    return-object v0
.end method

.method public d(Lo/bra;)Ljava/lang/Boolean;
    .locals 7

    .line 97
    invoke-interface {p1}, Lo/bra;->a()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 99
    const-string v0, "PhotoViewManager"

    const-string v1, "getPicMessageList cancelled."

    invoke-static {v0, v1}, Lo/bpf;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 100
    const/4 v0, 0x0

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    return-object v0

    .line 103
    :cond_0
    const/4 v0, 0x1

    new-array v3, v0, [I

    .line 104
    invoke-static {}, Lo/apm;->a()Lo/apm;

    move-result-object v0

    iget-object v1, p0, Lo/aqe$4;->c:Lcom/huawei/health/sns/model/chat/MessageItem;

    invoke-virtual {v0, v1, v3}, Lo/apm;->a(Lcom/huawei/health/sns/model/chat/MessageItem;[I)Ljava/util/ArrayList;

    move-result-object v4

    .line 107
    invoke-interface {p1}, Lo/bra;->a()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 109
    const-string v0, "PhotoViewManager"

    const-string v1, "getPicMessageList cancelled."

    invoke-static {v0, v1}, Lo/bpf;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 110
    const/4 v0, 0x0

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    return-object v0

    .line 113
    :cond_1
    invoke-static {}, Lo/bpf;->c()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 115
    const-string v0, "PhotoViewManager"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "index = "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const/4 v2, 0x0

    aget v2, v3, v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, " total = "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v4}, Ljava/util/ArrayList;->size()I

    move-result v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/bpf;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 118
    :cond_2
    iget-object v0, p0, Lo/aqe$4;->d:Landroid/os/Handler;

    if-eqz v0, :cond_3

    .line 120
    iget-object v0, p0, Lo/aqe$4;->d:Landroid/os/Handler;

    invoke-virtual {v0}, Landroid/os/Handler;->obtainMessage()Landroid/os/Message;

    move-result-object v5

    .line 121
    iget v0, p0, Lo/aqe$4;->a:I

    iput v0, v5, Landroid/os/Message;->what:I

    .line 122
    new-instance v6, Landroid/os/Bundle;

    invoke-direct {v6}, Landroid/os/Bundle;-><init>()V

    .line 123
    const-string v0, "picMessageList"

    invoke-virtual {v6, v0, v4}, Landroid/os/Bundle;->putParcelableArrayList(Ljava/lang/String;Ljava/util/ArrayList;)V

    .line 124
    const-string v0, "index"

    const/4 v1, 0x0

    aget v1, v3, v1

    invoke-virtual {v6, v0, v1}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    .line 125
    invoke-virtual {v5, v6}, Landroid/os/Message;->setData(Landroid/os/Bundle;)V

    .line 126
    iget-object v0, p0, Lo/aqe$4;->d:Landroid/os/Handler;

    invoke-virtual {v0, v5}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    .line 129
    :cond_3
    const/4 v0, 0x1

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    return-object v0
.end method
