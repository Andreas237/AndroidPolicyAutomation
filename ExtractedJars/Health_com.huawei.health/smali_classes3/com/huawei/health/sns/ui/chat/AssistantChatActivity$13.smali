.class final Lcom/huawei/health/sns/ui/chat/AssistantChatActivity$13;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/brd;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/health/sns/ui/chat/AssistantChatActivity;->k(J)Lo/brd;
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
.field final synthetic a:J


# direct methods
.method constructor <init>(J)V
    .locals 0

    .line 1792
    iput-wide p1, p0, Lcom/huawei/health/sns/ui/chat/AssistantChatActivity$13;->a:J

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public synthetic a(Lo/bra;)Ljava/lang/Object;
    .locals 1

    .line 1792
    invoke-virtual {p0, p1}, Lcom/huawei/health/sns/ui/chat/AssistantChatActivity$13;->d(Lo/bra;)Ljava/lang/Boolean;

    move-result-object v0

    return-object v0
.end method

.method public d(Lo/bra;)Ljava/lang/Boolean;
    .locals 4

    .line 1796
    invoke-static {}, Lo/axi;->d()Lo/axi;

    move-result-object v0

    iget-wide v1, p0, Lcom/huawei/health/sns/ui/chat/AssistantChatActivity$13;->a:J

    invoke-virtual {v0, v1, v2}, Lo/axi;->c(J)Lcom/huawei/health/sns/model/user/UserNotify;

    move-result-object v3

    .line 1798
    if-eqz v3, :cond_0

    invoke-virtual {v3}, Lcom/huawei/health/sns/model/user/UserNotify;->isReaded()Z

    move-result v0

    if-nez v0, :cond_0

    .line 1801
    const/4 v0, 0x1

    invoke-virtual {v3, v0}, Lcom/huawei/health/sns/model/user/UserNotify;->setIsReaded(Z)V

    .line 1802
    invoke-static {}, Lo/axi;->d()Lo/axi;

    move-result-object v0

    invoke-virtual {v0, v3}, Lo/axi;->e(Lcom/huawei/health/sns/model/user/UserNotify;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 1805
    invoke-static {}, Lo/aob;->a()V

    .line 1808
    :cond_0
    const/4 v0, 0x0

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    return-object v0
.end method
