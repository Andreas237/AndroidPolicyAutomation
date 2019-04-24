.class Lcom/huawei/health/sns/ui/chat/ChatRecordActivity$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/brd;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/health/sns/ui/chat/ChatRecordActivity;->a()V
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
.field final synthetic e:Lcom/huawei/health/sns/ui/chat/ChatRecordActivity;


# direct methods
.method constructor <init>(Lcom/huawei/health/sns/ui/chat/ChatRecordActivity;)V
    .locals 0

    .line 209
    iput-object p1, p0, Lcom/huawei/health/sns/ui/chat/ChatRecordActivity$1;->e:Lcom/huawei/health/sns/ui/chat/ChatRecordActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public synthetic a(Lo/bra;)Ljava/lang/Object;
    .locals 1

    .line 209
    invoke-virtual {p0, p1}, Lcom/huawei/health/sns/ui/chat/ChatRecordActivity$1;->b(Lo/bra;)Ljava/lang/Boolean;

    move-result-object v0

    return-object v0
.end method

.method public b(Lo/bra;)Ljava/lang/Boolean;
    .locals 6

    .line 214
    iget-object v0, p0, Lcom/huawei/health/sns/ui/chat/ChatRecordActivity$1;->e:Lcom/huawei/health/sns/ui/chat/ChatRecordActivity;

    invoke-static {v0}, Lcom/huawei/health/sns/ui/chat/ChatRecordActivity;->a(Lcom/huawei/health/sns/ui/chat/ChatRecordActivity;)I

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_1

    .line 216
    invoke-static {}, Lo/axa;->a()Lo/axa;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/health/sns/ui/chat/ChatRecordActivity$1;->e:Lcom/huawei/health/sns/ui/chat/ChatRecordActivity;

    invoke-static {v1}, Lcom/huawei/health/sns/ui/chat/ChatRecordActivity;->e(Lcom/huawei/health/sns/ui/chat/ChatRecordActivity;)J

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, Lo/axa;->a(J)Lcom/huawei/health/sns/model/user/User;

    move-result-object v3

    .line 217
    if-nez v3, :cond_0

    .line 219
    const-string v0, "ChatRecordActivity"

    const-string v1, "ChatRecordActivity user is null"

    invoke-static {v0, v1}, Lo/bpf;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 220
    const/4 v0, 0x0

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    return-object v0

    .line 225
    :cond_0
    invoke-static {}, Lo/bci;->d()Lo/bci;

    move-result-object v0

    invoke-virtual {v0}, Lo/bci;->b()Landroid/content/Context;

    move-result-object v0

    invoke-virtual {v3, v0}, Lcom/huawei/health/sns/model/user/User;->getUIDisplayName(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v4

    .line 226
    iget-object v0, p0, Lcom/huawei/health/sns/ui/chat/ChatRecordActivity$1;->e:Lcom/huawei/health/sns/ui/chat/ChatRecordActivity;

    invoke-static {v0}, Lcom/huawei/health/sns/ui/chat/ChatRecordActivity;->c(Lcom/huawei/health/sns/ui/chat/ChatRecordActivity;)Landroid/os/Handler;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/health/sns/ui/chat/ChatRecordActivity$1;->e:Lcom/huawei/health/sns/ui/chat/ChatRecordActivity;

    invoke-static {v1}, Lcom/huawei/health/sns/ui/chat/ChatRecordActivity;->c(Lcom/huawei/health/sns/ui/chat/ChatRecordActivity;)Landroid/os/Handler;

    move-result-object v1

    const/4 v2, 0x2

    invoke-virtual {v1, v2, v4}, Landroid/os/Handler;->obtainMessage(ILjava/lang/Object;)Landroid/os/Message;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    .line 227
    const/4 v0, 0x1

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    return-object v0

    .line 231
    :cond_1
    iget-object v0, p0, Lcom/huawei/health/sns/ui/chat/ChatRecordActivity$1;->e:Lcom/huawei/health/sns/ui/chat/ChatRecordActivity;

    invoke-static {v0}, Lcom/huawei/health/sns/ui/chat/ChatRecordActivity;->a(Lcom/huawei/health/sns/ui/chat/ChatRecordActivity;)I

    move-result v0

    const/4 v1, 0x2

    if-ne v0, v1, :cond_4

    .line 233
    invoke-static {}, Lo/atc;->d()Lo/atc;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/health/sns/ui/chat/ChatRecordActivity$1;->e:Lcom/huawei/health/sns/ui/chat/ChatRecordActivity;

    invoke-static {v1}, Lcom/huawei/health/sns/ui/chat/ChatRecordActivity;->e(Lcom/huawei/health/sns/ui/chat/ChatRecordActivity;)J

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, Lo/atc;->b(J)Lcom/huawei/health/sns/model/group/Group;

    move-result-object v3

    .line 234
    if-nez v3, :cond_2

    .line 236
    const-string v0, "ChatRecordActivity"

    const-string v1, "ChatRecordActivity group is null"

    invoke-static {v0, v1}, Lo/bpf;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 237
    const/4 v0, 0x0

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    return-object v0

    .line 241
    :cond_2
    const/4 v4, 0x0

    .line 243
    iget-object v0, p0, Lcom/huawei/health/sns/ui/chat/ChatRecordActivity$1;->e:Lcom/huawei/health/sns/ui/chat/ChatRecordActivity;

    invoke-virtual {v3}, Lcom/huawei/health/sns/model/group/Group;->getGroupType()I

    move-result v1

    invoke-static {v0, v1}, Lcom/huawei/health/sns/ui/chat/ChatRecordActivity;->e(Lcom/huawei/health/sns/ui/chat/ChatRecordActivity;I)I

    .line 245
    invoke-virtual {v3}, Lcom/huawei/health/sns/model/group/Group;->getState()I

    move-result v0

    if-nez v0, :cond_3

    .line 247
    invoke-static {}, Lo/ath;->a()Lo/ath;

    move-result-object v0

    invoke-virtual {v3}, Lcom/huawei/health/sns/model/group/Group;->getGroupId()J

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, Lo/ath;->f(J)Ljava/util/ArrayList;

    move-result-object v0

    .line 248
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v5

    .line 249
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

    .line 250
    goto :goto_0

    .line 253
    :cond_3
    invoke-virtual {v3}, Lcom/huawei/health/sns/model/group/Group;->getGroupName()Ljava/lang/String;

    move-result-object v4

    .line 255
    :goto_0
    iget-object v0, p0, Lcom/huawei/health/sns/ui/chat/ChatRecordActivity$1;->e:Lcom/huawei/health/sns/ui/chat/ChatRecordActivity;

    invoke-static {v0}, Lcom/huawei/health/sns/ui/chat/ChatRecordActivity;->c(Lcom/huawei/health/sns/ui/chat/ChatRecordActivity;)Landroid/os/Handler;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/health/sns/ui/chat/ChatRecordActivity$1;->e:Lcom/huawei/health/sns/ui/chat/ChatRecordActivity;

    invoke-static {v1}, Lcom/huawei/health/sns/ui/chat/ChatRecordActivity;->c(Lcom/huawei/health/sns/ui/chat/ChatRecordActivity;)Landroid/os/Handler;

    move-result-object v1

    const/4 v2, 0x2

    invoke-virtual {v1, v2, v4}, Landroid/os/Handler;->obtainMessage(ILjava/lang/Object;)Landroid/os/Message;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    .line 256
    const/4 v0, 0x1

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    return-object v0

    .line 259
    :cond_4
    const/4 v0, 0x0

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    return-object v0
.end method
