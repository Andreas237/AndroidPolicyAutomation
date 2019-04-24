.class Lo/ant$4;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/awx$c;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/ant;->c(Lcom/huawei/health/sns/model/user/UserNotify;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:Lcom/huawei/health/sns/model/user/UserNotify;

.field final synthetic e:Lo/ant;


# direct methods
.method constructor <init>(Lo/ant;Lcom/huawei/health/sns/model/user/UserNotify;)V
    .locals 0

    .line 257
    iput-object p1, p0, Lo/ant$4;->e:Lo/ant;

    iput-object p2, p0, Lo/ant$4;->b:Lcom/huawei/health/sns/model/user/UserNotify;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lcom/huawei/health/sns/server/user/ReplyAddFriendRequest;Ljava/lang/String;)V
    .locals 3

    .line 273
    const-string v0, "ChatAPI_hwsns"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "replyFriendSucc sendTime:"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/bpf;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 274
    new-instance v0, Lo/awz;

    invoke-direct {v0}, Lo/awz;-><init>()V

    invoke-virtual {p1}, Lcom/huawei/health/sns/server/user/ReplyAddFriendRequest;->getFrdUID_()J

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, Lo/awz;->e(J)V

    .line 275
    return-void
.end method

.method public b(Lo/bfh;Ljava/lang/String;)Lcom/huawei/health/sns/server/user/ReplyAddFriendRequest;
    .locals 6

    .line 260
    instance-of v0, p1, Lcom/huawei/health/sns/model/user/UserNotify;

    if-eqz v0, :cond_0

    .line 261
    move-object v4, p1

    check-cast v4, Lcom/huawei/health/sns/model/user/UserNotify;

    .line 262
    new-instance v5, Lcom/huawei/health/sns/server/user/ReplyAddFriendRequest;

    invoke-direct {v5}, Lcom/huawei/health/sns/server/user/ReplyAddFriendRequest;-><init>()V

    .line 263
    invoke-virtual {v4}, Lcom/huawei/health/sns/model/user/UserNotify;->getUserId()J

    move-result-wide v0

    const/4 v2, 0x1

    const/4 v3, 0x0

    invoke-virtual {v5, v0, v1, v2, v3}, Lcom/huawei/health/sns/server/user/ReplyAddFriendRequest;->setData(JILjava/lang/String;)V

    .line 264
    return-object v5

    .line 266
    :cond_0
    const-string v0, "ChatAPI_hwsns"

    const-string v1, "getReplyFriendRequest bean not instanceof UserNotify"

    invoke-static {v0, v1}, Lo/bpf;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 267
    const/4 v0, 0x0

    return-object v0
.end method

.method public b()V
    .locals 2

    .line 279
    const-string v0, "ChatAPI_hwsns"

    const-string v1, "replyFriendExpired"

    invoke-static {v0, v1}, Lo/bpf;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 280
    invoke-static {}, Lo/axi;->d()Lo/axi;

    move-result-object v0

    iget-object v1, p0, Lo/ant$4;->b:Lcom/huawei/health/sns/model/user/UserNotify;

    invoke-virtual {v0, v1}, Lo/axi;->d(Lcom/huawei/health/sns/model/user/UserNotify;)Z

    .line 282
    return-void
.end method
