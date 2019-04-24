.class final Lcom/huawei/health/sns/ui/chat/SingleChatActivity$5;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/brd;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/health/sns/ui/chat/SingleChatActivity;->d(Lcom/huawei/health/sns/ui/chat/SingleChatActivity;Landroid/os/Handler;J)Lo/brd;
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
.field final synthetic a:Landroid/os/Handler;

.field final synthetic c:Lcom/huawei/health/sns/ui/chat/SingleChatActivity;

.field final synthetic d:J


# direct methods
.method constructor <init>(JLcom/huawei/health/sns/ui/chat/SingleChatActivity;Landroid/os/Handler;)V
    .locals 0

    .line 305
    iput-wide p1, p0, Lcom/huawei/health/sns/ui/chat/SingleChatActivity$5;->d:J

    iput-object p3, p0, Lcom/huawei/health/sns/ui/chat/SingleChatActivity$5;->c:Lcom/huawei/health/sns/ui/chat/SingleChatActivity;

    iput-object p4, p0, Lcom/huawei/health/sns/ui/chat/SingleChatActivity$5;->a:Landroid/os/Handler;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public synthetic a(Lo/bra;)Ljava/lang/Object;
    .locals 1

    .line 305
    invoke-virtual {p0, p1}, Lcom/huawei/health/sns/ui/chat/SingleChatActivity$5;->b(Lo/bra;)Ljava/lang/Boolean;

    move-result-object v0

    return-object v0
.end method

.method public b(Lo/bra;)Ljava/lang/Boolean;
    .locals 6

    .line 308
    invoke-static {}, Lo/axa;->a()Lo/axa;

    move-result-object v0

    iget-wide v1, p0, Lcom/huawei/health/sns/ui/chat/SingleChatActivity$5;->d:J

    invoke-virtual {v0, v1, v2}, Lo/axa;->a(J)Lcom/huawei/health/sns/model/user/User;

    move-result-object v4

    .line 311
    iget-object v0, p0, Lcom/huawei/health/sns/ui/chat/SingleChatActivity$5;->c:Lcom/huawei/health/sns/ui/chat/SingleChatActivity;

    invoke-static {v0, v4}, Lcom/huawei/health/sns/ui/chat/SingleChatActivity;->a(Lcom/huawei/health/sns/ui/chat/SingleChatActivity;Lcom/huawei/health/sns/model/user/User;)V

    .line 313
    if-eqz v4, :cond_4

    .line 314
    const-string v0, "SingleChatActivity"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "get user info done, f="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v4}, Lcom/huawei/health/sns/model/user/User;->getIsFriend()I

    move-result v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, ", r="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v4}, Lcom/huawei/health/sns/model/user/User;->getRelation()I

    move-result v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/bpf;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 316
    invoke-virtual {v4}, Lcom/huawei/health/sns/model/user/User;->getUserId()J

    move-result-wide v0

    invoke-static {}, Lo/aoq;->e()Lo/aoq;

    move-result-object v2

    invoke-virtual {v2}, Lo/aoq;->a()J

    move-result-wide v2

    cmp-long v0, v0, v2

    if-nez v0, :cond_0

    .line 318
    iget-object v0, p0, Lcom/huawei/health/sns/ui/chat/SingleChatActivity$5;->a:Landroid/os/Handler;

    iget-object v1, p0, Lcom/huawei/health/sns/ui/chat/SingleChatActivity$5;->a:Landroid/os/Handler;

    const/16 v2, 0x7f2

    invoke-virtual {v1, v2}, Landroid/os/Handler;->obtainMessage(I)Landroid/os/Message;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    goto/16 :goto_0

    .line 320
    :cond_0
    invoke-virtual {v4}, Lcom/huawei/health/sns/model/user/User;->getIsFriend()I

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_2

    .line 321
    invoke-virtual {v4}, Lcom/huawei/health/sns/model/user/User;->getUserType()I

    move-result v0

    if-nez v0, :cond_1

    .line 323
    iget-object v0, p0, Lcom/huawei/health/sns/ui/chat/SingleChatActivity$5;->a:Landroid/os/Handler;

    iget-object v1, p0, Lcom/huawei/health/sns/ui/chat/SingleChatActivity$5;->a:Landroid/os/Handler;

    const/16 v2, 0x7e5

    invoke-virtual {v1, v2}, Landroid/os/Handler;->obtainMessage(I)Landroid/os/Message;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    goto/16 :goto_0

    .line 326
    :cond_1
    iget-object v0, p0, Lcom/huawei/health/sns/ui/chat/SingleChatActivity$5;->a:Landroid/os/Handler;

    iget-object v1, p0, Lcom/huawei/health/sns/ui/chat/SingleChatActivity$5;->a:Landroid/os/Handler;

    const/16 v2, 0x7e7

    invoke-virtual {v1, v2}, Landroid/os/Handler;->obtainMessage(I)Landroid/os/Message;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    .line 327
    const-string v0, "SingleChatActivity"

    const-string v1, "SingleChatActivity getUserFromId ,the user queryed from DB is assistant"

    invoke-static {v0, v1}, Lo/bpf;->d(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0

    .line 330
    :cond_2
    const-string v0, "SingleChatActivity"

    const-string v1, "SingleChatActivity not friends !!!!"

    invoke-static {v0, v1}, Lo/bpf;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 333
    invoke-static {}, Lo/anx;->g()Z

    move-result v0

    if-eqz v0, :cond_3

    .line 334
    new-instance v5, Lcom/huawei/health/sns/server/user/Origin;

    invoke-virtual {v4}, Lcom/huawei/health/sns/model/user/User;->getOriginType()I

    move-result v0

    invoke-virtual {v4}, Lcom/huawei/health/sns/model/user/User;->getOriginDesc()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v5, v0, v1}, Lcom/huawei/health/sns/server/user/Origin;-><init>(ILjava/lang/String;)V

    .line 335
    iget-object v0, p0, Lcom/huawei/health/sns/ui/chat/SingleChatActivity$5;->a:Landroid/os/Handler;

    iget-object v1, p0, Lcom/huawei/health/sns/ui/chat/SingleChatActivity$5;->a:Landroid/os/Handler;

    const/16 v2, 0x7f2

    invoke-virtual {v1, v2, v5}, Landroid/os/Handler;->obtainMessage(ILjava/lang/Object;)Landroid/os/Message;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    .line 336
    goto :goto_0

    .line 337
    :cond_3
    iget-object v0, p0, Lcom/huawei/health/sns/ui/chat/SingleChatActivity$5;->a:Landroid/os/Handler;

    iget-object v1, p0, Lcom/huawei/health/sns/ui/chat/SingleChatActivity$5;->a:Landroid/os/Handler;

    const/16 v2, 0x7e5

    invoke-virtual {v1, v2}, Landroid/os/Handler;->obtainMessage(I)Landroid/os/Message;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    goto :goto_0

    .line 342
    :cond_4
    iget-object v0, p0, Lcom/huawei/health/sns/ui/chat/SingleChatActivity$5;->a:Landroid/os/Handler;

    iget-object v1, p0, Lcom/huawei/health/sns/ui/chat/SingleChatActivity$5;->a:Landroid/os/Handler;

    const/16 v2, 0x7e7

    invoke-virtual {v1, v2}, Landroid/os/Handler;->obtainMessage(I)Landroid/os/Message;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    .line 343
    const-string v0, "SingleChatActivity"

    const-string v1, "SingleChatActivity getUserFromId error, The user queryed from DB is null"

    invoke-static {v0, v1}, Lo/bpf;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 346
    :goto_0
    const/4 v0, 0x1

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    return-object v0
.end method
