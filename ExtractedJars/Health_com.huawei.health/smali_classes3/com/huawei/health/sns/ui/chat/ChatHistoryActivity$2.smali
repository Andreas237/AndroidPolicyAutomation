.class Lcom/huawei/health/sns/ui/chat/ChatHistoryActivity$2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/brd;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/health/sns/ui/chat/ChatHistoryActivity;->c()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;Lo/brd<Ljava/lang/Boolean;>;"
    }
.end annotation


# instance fields
.field final synthetic d:Lcom/huawei/health/sns/ui/chat/ChatHistoryActivity;


# direct methods
.method constructor <init>(Lcom/huawei/health/sns/ui/chat/ChatHistoryActivity;)V
    .locals 0

    .line 337
    iput-object p1, p0, Lcom/huawei/health/sns/ui/chat/ChatHistoryActivity$2;->d:Lcom/huawei/health/sns/ui/chat/ChatHistoryActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public synthetic a(Lo/bra;)Ljava/lang/Object;
    .locals 1

    .line 337
    invoke-virtual {p0, p1}, Lcom/huawei/health/sns/ui/chat/ChatHistoryActivity$2;->e(Lo/bra;)Ljava/lang/Boolean;

    move-result-object v0

    return-object v0
.end method

.method public e(Lo/bra;)Ljava/lang/Boolean;
    .locals 6

    .line 342
    iget-object v0, p0, Lcom/huawei/health/sns/ui/chat/ChatHistoryActivity$2;->d:Lcom/huawei/health/sns/ui/chat/ChatHistoryActivity;

    invoke-static {v0}, Lcom/huawei/health/sns/ui/chat/ChatHistoryActivity;->d(Lcom/huawei/health/sns/ui/chat/ChatHistoryActivity;)I

    move-result v0

    const/4 v1, 0x1

    if-eq v0, v1, :cond_0

    iget-object v0, p0, Lcom/huawei/health/sns/ui/chat/ChatHistoryActivity$2;->d:Lcom/huawei/health/sns/ui/chat/ChatHistoryActivity;

    invoke-static {v0}, Lcom/huawei/health/sns/ui/chat/ChatHistoryActivity;->d(Lcom/huawei/health/sns/ui/chat/ChatHistoryActivity;)I

    move-result v0

    const/4 v1, 0x4

    if-ne v0, v1, :cond_2

    .line 344
    :cond_0
    invoke-static {}, Lo/axa;->a()Lo/axa;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/health/sns/ui/chat/ChatHistoryActivity$2;->d:Lcom/huawei/health/sns/ui/chat/ChatHistoryActivity;

    invoke-static {v1}, Lcom/huawei/health/sns/ui/chat/ChatHistoryActivity;->c(Lcom/huawei/health/sns/ui/chat/ChatHistoryActivity;)J

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, Lo/axa;->a(J)Lcom/huawei/health/sns/model/user/User;

    move-result-object v3

    .line 345
    if-nez v3, :cond_1

    .line 347
    const-string v0, "ChatHistoryActivity"

    const-string v1, "ChatHistoryActivity user is null"

    invoke-static {v0, v1}, Lo/bpf;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 348
    const/4 v0, 0x0

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    return-object v0

    .line 351
    :cond_1
    invoke-static {}, Lo/bci;->d()Lo/bci;

    move-result-object v0

    invoke-virtual {v0}, Lo/bci;->b()Landroid/content/Context;

    move-result-object v0

    invoke-virtual {v3, v0}, Lcom/huawei/health/sns/model/user/User;->getUIDisplayName(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v4

    .line 352
    iget-object v0, p0, Lcom/huawei/health/sns/ui/chat/ChatHistoryActivity$2;->d:Lcom/huawei/health/sns/ui/chat/ChatHistoryActivity;

    invoke-static {v0}, Lcom/huawei/health/sns/ui/chat/ChatHistoryActivity;->b(Lcom/huawei/health/sns/ui/chat/ChatHistoryActivity;)Landroid/os/Handler;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/health/sns/ui/chat/ChatHistoryActivity$2;->d:Lcom/huawei/health/sns/ui/chat/ChatHistoryActivity;

    invoke-static {v1}, Lcom/huawei/health/sns/ui/chat/ChatHistoryActivity;->b(Lcom/huawei/health/sns/ui/chat/ChatHistoryActivity;)Landroid/os/Handler;

    move-result-object v1

    const/4 v2, 0x3

    invoke-virtual {v1, v2, v4}, Landroid/os/Handler;->obtainMessage(ILjava/lang/Object;)Landroid/os/Message;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    .line 353
    const/4 v0, 0x1

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    return-object v0

    .line 356
    :cond_2
    iget-object v0, p0, Lcom/huawei/health/sns/ui/chat/ChatHistoryActivity$2;->d:Lcom/huawei/health/sns/ui/chat/ChatHistoryActivity;

    invoke-static {v0}, Lcom/huawei/health/sns/ui/chat/ChatHistoryActivity;->d(Lcom/huawei/health/sns/ui/chat/ChatHistoryActivity;)I

    move-result v0

    const/4 v1, 0x2

    if-eq v0, v1, :cond_3

    iget-object v0, p0, Lcom/huawei/health/sns/ui/chat/ChatHistoryActivity$2;->d:Lcom/huawei/health/sns/ui/chat/ChatHistoryActivity;

    invoke-static {v0}, Lcom/huawei/health/sns/ui/chat/ChatHistoryActivity;->d(Lcom/huawei/health/sns/ui/chat/ChatHistoryActivity;)I

    move-result v0

    const/4 v1, 0x3

    if-ne v0, v1, :cond_6

    .line 358
    :cond_3
    invoke-static {}, Lo/atc;->d()Lo/atc;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/health/sns/ui/chat/ChatHistoryActivity$2;->d:Lcom/huawei/health/sns/ui/chat/ChatHistoryActivity;

    invoke-static {v1}, Lcom/huawei/health/sns/ui/chat/ChatHistoryActivity;->c(Lcom/huawei/health/sns/ui/chat/ChatHistoryActivity;)J

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, Lo/atc;->b(J)Lcom/huawei/health/sns/model/group/Group;

    move-result-object v3

    .line 359
    if-nez v3, :cond_4

    .line 361
    const-string v0, "ChatHistoryActivity"

    const-string v1, "ChatHistoryActivity group is null"

    invoke-static {v0, v1}, Lo/bpf;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 362
    const/4 v0, 0x0

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    return-object v0

    .line 364
    :cond_4
    const/4 v4, 0x0

    .line 366
    invoke-virtual {v3}, Lcom/huawei/health/sns/model/group/Group;->getState()I

    move-result v0

    if-nez v0, :cond_5

    .line 368
    invoke-static {}, Lo/ath;->a()Lo/ath;

    move-result-object v0

    invoke-virtual {v3}, Lcom/huawei/health/sns/model/group/Group;->getGroupId()J

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, Lo/ath;->f(J)Ljava/util/ArrayList;

    move-result-object v0

    .line 369
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v5

    .line 370
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v3}, Lcom/huawei/health/sns/model/group/Group;->getGroupName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "("

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ")"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    .line 371
    goto :goto_0

    .line 374
    :cond_5
    invoke-virtual {v3}, Lcom/huawei/health/sns/model/group/Group;->getGroupName()Ljava/lang/String;

    move-result-object v4

    .line 376
    :goto_0
    iget-object v0, p0, Lcom/huawei/health/sns/ui/chat/ChatHistoryActivity$2;->d:Lcom/huawei/health/sns/ui/chat/ChatHistoryActivity;

    invoke-static {v0}, Lcom/huawei/health/sns/ui/chat/ChatHistoryActivity;->b(Lcom/huawei/health/sns/ui/chat/ChatHistoryActivity;)Landroid/os/Handler;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/health/sns/ui/chat/ChatHistoryActivity$2;->d:Lcom/huawei/health/sns/ui/chat/ChatHistoryActivity;

    invoke-static {v1}, Lcom/huawei/health/sns/ui/chat/ChatHistoryActivity;->b(Lcom/huawei/health/sns/ui/chat/ChatHistoryActivity;)Landroid/os/Handler;

    move-result-object v1

    const/4 v2, 0x3

    invoke-virtual {v1, v2, v4}, Landroid/os/Handler;->obtainMessage(ILjava/lang/Object;)Landroid/os/Message;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    .line 377
    const/4 v0, 0x1

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    return-object v0

    .line 379
    :cond_6
    const/4 v0, 0x0

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    return-object v0
.end method
