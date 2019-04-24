.class Lo/arn$5;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/brd;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/arn;->b(Lcom/huawei/health/sns/model/chat/MessageItem;)Lcom/huawei/health/sns/model/user/User;
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
.field final synthetic a:Lcom/huawei/health/sns/model/chat/MessageItem;

.field final synthetic c:Lo/arn;

.field final synthetic d:J


# direct methods
.method constructor <init>(Lo/arn;Lcom/huawei/health/sns/model/chat/MessageItem;J)V
    .locals 0

    .line 708
    iput-object p1, p0, Lo/arn$5;->c:Lo/arn;

    iput-object p2, p0, Lo/arn$5;->a:Lcom/huawei/health/sns/model/chat/MessageItem;

    iput-wide p3, p0, Lo/arn$5;->d:J

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public synthetic a(Lo/bra;)Ljava/lang/Object;
    .locals 1

    .line 708
    invoke-virtual {p0, p1}, Lo/arn$5;->c(Lo/bra;)Ljava/lang/Boolean;

    move-result-object v0

    return-object v0
.end method

.method public c(Lo/bra;)Ljava/lang/Boolean;
    .locals 6

    .line 712
    iget-object v0, p0, Lo/arn$5;->a:Lcom/huawei/health/sns/model/chat/MessageItem;

    invoke-virtual {v0}, Lcom/huawei/health/sns/model/chat/MessageItem;->getSenderId()J

    move-result-wide v0

    iget-object v2, p0, Lo/arn$5;->a:Lcom/huawei/health/sns/model/chat/MessageItem;

    invoke-virtual {v2}, Lcom/huawei/health/sns/model/chat/MessageItem;->getUserId()J

    move-result-wide v2

    iget-object v4, p0, Lo/arn$5;->a:Lcom/huawei/health/sns/model/chat/MessageItem;

    invoke-virtual {v4}, Lcom/huawei/health/sns/model/chat/MessageItem;->getChatType()I

    move-result v4

    invoke-static {v0, v1, v2, v3, v4}, Lo/aro;->c(JJI)Lcom/huawei/health/sns/model/user/User;

    move-result-object v5

    .line 714
    if-nez v5, :cond_0

    .line 716
    iget-wide v0, p0, Lo/arn$5;->d:J

    const/4 v2, 0x0

    invoke-static {v0, v1, v2}, Lo/axb;->d(JLandroid/os/Handler;)Lcom/huawei/health/sns/model/user/User;

    move-result-object v5

    .line 718
    if-nez v5, :cond_0

    .line 720
    new-instance v5, Lcom/huawei/health/sns/model/user/User;

    invoke-direct {v5}, Lcom/huawei/health/sns/model/user/User;-><init>()V

    .line 721
    iget-wide v0, p0, Lo/arn$5;->d:J

    invoke-virtual {v5, v0, v1}, Lcom/huawei/health/sns/model/user/User;->setUserId(J)V

    .line 724
    :cond_0
    iget-object v0, p0, Lo/arn$5;->c:Lo/arn;

    iget-wide v1, p0, Lo/arn$5;->d:J

    invoke-static {v0, v1, v2, v5}, Lo/arn;->e(Lo/arn;JLcom/huawei/health/sns/model/user/User;)V

    .line 725
    invoke-static {}, Lo/aro;->d()V

    .line 726
    const/4 v0, 0x1

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    return-object v0
.end method
