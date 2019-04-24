.class final Lcom/huawei/health/sns/ui/chat/SingleChatActivity$8;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/brd;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/health/sns/ui/chat/SingleChatActivity;->g(J)Lo/brd;
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
.field final synthetic c:J


# direct methods
.method constructor <init>(J)V
    .locals 0

    .line 783
    iput-wide p1, p0, Lcom/huawei/health/sns/ui/chat/SingleChatActivity$8;->c:J

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public synthetic a(Lo/bra;)Ljava/lang/Object;
    .locals 1

    .line 783
    invoke-virtual {p0, p1}, Lcom/huawei/health/sns/ui/chat/SingleChatActivity$8;->d(Lo/bra;)Ljava/lang/Boolean;

    move-result-object v0

    return-object v0
.end method

.method public d(Lo/bra;)Ljava/lang/Boolean;
    .locals 8

    .line 786
    invoke-static {}, Lo/axi;->d()Lo/axi;

    move-result-object v0

    iget-wide v1, p0, Lcom/huawei/health/sns/ui/chat/SingleChatActivity$8;->c:J

    invoke-virtual {v0, v1, v2}, Lo/axi;->c(J)Lcom/huawei/health/sns/model/user/UserNotify;

    move-result-object v5

    .line 788
    if-eqz v5, :cond_1

    .line 789
    invoke-virtual {v5}, Lcom/huawei/health/sns/model/user/UserNotify;->isReaded()Z

    move-result v0

    if-nez v0, :cond_1

    .line 790
    invoke-virtual {v5}, Lcom/huawei/health/sns/model/user/UserNotify;->getType()Lcom/huawei/health/sns/model/user/UserNotify$b;

    move-result-object v0

    sget-object v1, Lcom/huawei/health/sns/model/user/UserNotify$b;->a:Lcom/huawei/health/sns/model/user/UserNotify$b;

    if-eq v0, v1, :cond_0

    invoke-virtual {v5}, Lcom/huawei/health/sns/model/user/UserNotify;->getType()Lcom/huawei/health/sns/model/user/UserNotify$b;

    move-result-object v0

    sget-object v1, Lcom/huawei/health/sns/model/user/UserNotify$b;->b:Lcom/huawei/health/sns/model/user/UserNotify$b;

    if-ne v0, v1, :cond_1

    .line 792
    :cond_0
    const/4 v0, 0x1

    invoke-virtual {v5, v0}, Lcom/huawei/health/sns/model/user/UserNotify;->setIsReaded(Z)V

    .line 793
    invoke-static {}, Lo/axi;->d()Lo/axi;

    move-result-object v0

    invoke-virtual {v0, v5}, Lo/axi;->e(Lcom/huawei/health/sns/model/user/UserNotify;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 795
    invoke-static {}, Lo/aob;->a()V

    .line 799
    :cond_1
    invoke-static {}, Lo/aoq;->e()Lo/aoq;

    move-result-object v0

    invoke-virtual {v0}, Lo/aoq;->a()J

    move-result-wide v6

    .line 800
    const-wide/16 v0, 0x0

    cmp-long v0, v6, v0

    if-lez v0, :cond_2

    .line 801
    invoke-static {}, Lo/auu;->b()Lo/auu;

    move-result-object v0

    sget-object v1, Lo/auu$b;->b:Lo/auu$b;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-static {v6, v7}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-wide v3, p0, Lcom/huawei/health/sns/ui/chat/SingleChatActivity$8;->c:J

    .line 802
    invoke-static {v3, v4}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    .line 801
    invoke-virtual {v0, v1, v2}, Lo/auu;->a(Lo/auu$b;I)V

    .line 804
    :cond_2
    const/4 v0, 0x0

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    return-object v0
.end method
