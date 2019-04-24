.class Lcom/huawei/health/sns/ui/conversation/ConversationFragment$10;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/brd;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/health/sns/ui/conversation/ConversationFragment;->f(Lo/axv;)Lo/brd;
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
.field final synthetic c:Lcom/huawei/health/sns/ui/conversation/ConversationFragment;

.field final synthetic e:Lo/axv;


# direct methods
.method constructor <init>(Lcom/huawei/health/sns/ui/conversation/ConversationFragment;Lo/axv;)V
    .locals 0

    .line 957
    iput-object p1, p0, Lcom/huawei/health/sns/ui/conversation/ConversationFragment$10;->c:Lcom/huawei/health/sns/ui/conversation/ConversationFragment;

    iput-object p2, p0, Lcom/huawei/health/sns/ui/conversation/ConversationFragment$10;->e:Lo/axv;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public synthetic a(Lo/bra;)Ljava/lang/Object;
    .locals 1

    .line 957
    invoke-virtual {p0, p1}, Lcom/huawei/health/sns/ui/conversation/ConversationFragment$10;->e(Lo/bra;)Ljava/lang/Boolean;

    move-result-object v0

    return-object v0
.end method

.method public e(Lo/bra;)Ljava/lang/Boolean;
    .locals 7

    .line 964
    iget-object v0, p0, Lcom/huawei/health/sns/ui/conversation/ConversationFragment$10;->c:Lcom/huawei/health/sns/ui/conversation/ConversationFragment;

    iget-object v1, p0, Lcom/huawei/health/sns/ui/conversation/ConversationFragment$10;->e:Lo/axv;

    invoke-static {v0, v1}, Lcom/huawei/health/sns/ui/conversation/ConversationFragment;->e(Lcom/huawei/health/sns/ui/conversation/ConversationFragment;Lo/axv;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 966
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object v4

    .line 967
    const/4 v5, 0x1

    goto :goto_0

    .line 971
    :cond_0
    const-string v4, "0"

    .line 972
    const/4 v5, 0x0

    .line 975
    :goto_0
    iget-object v0, p0, Lcom/huawei/health/sns/ui/conversation/ConversationFragment$10;->c:Lcom/huawei/health/sns/ui/conversation/ConversationFragment;

    iget-object v1, p0, Lcom/huawei/health/sns/ui/conversation/ConversationFragment$10;->e:Lo/axv;

    invoke-static {v0, v1}, Lcom/huawei/health/sns/ui/conversation/ConversationFragment;->c(Lcom/huawei/health/sns/ui/conversation/ConversationFragment;Lo/axv;)I

    move-result v0

    const/4 v1, 0x2

    if-ne v1, v0, :cond_2

    .line 978
    iget-object v0, p0, Lcom/huawei/health/sns/ui/conversation/ConversationFragment$10;->c:Lcom/huawei/health/sns/ui/conversation/ConversationFragment;

    iget-object v1, p0, Lcom/huawei/health/sns/ui/conversation/ConversationFragment$10;->e:Lo/axv;

    invoke-static {v0, v1}, Lcom/huawei/health/sns/ui/conversation/ConversationFragment;->a(Lcom/huawei/health/sns/ui/conversation/ConversationFragment;Lo/axv;)V

    .line 979
    invoke-static {}, Lo/atc;->d()Lo/atc;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/health/sns/ui/conversation/ConversationFragment$10;->c:Lcom/huawei/health/sns/ui/conversation/ConversationFragment;

    iget-object v2, p0, Lcom/huawei/health/sns/ui/conversation/ConversationFragment$10;->e:Lo/axv;

    invoke-static {v1, v2}, Lcom/huawei/health/sns/ui/conversation/ConversationFragment;->h(Lcom/huawei/health/sns/ui/conversation/ConversationFragment;Lo/axv;)J

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, Lo/atc;->b(J)Lcom/huawei/health/sns/model/group/Group;

    move-result-object v6

    .line 980
    if-nez v6, :cond_1

    .line 982
    const-string v0, "ConversationFragment"

    const-string v1, "group setTop,but group is null"

    invoke-static {v0, v1}, Lo/bpf;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 983
    const/4 v0, 0x0

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    return-object v0

    .line 985
    :cond_1
    invoke-virtual {v6, v4}, Lcom/huawei/health/sns/model/group/Group;->setStickTime(Ljava/lang/String;)V

    .line 986
    iget-object v0, p0, Lcom/huawei/health/sns/ui/conversation/ConversationFragment$10;->c:Lcom/huawei/health/sns/ui/conversation/ConversationFragment;

    invoke-virtual {v0, v6}, Lcom/huawei/health/sns/ui/conversation/ConversationFragment;->d(Lcom/huawei/health/sns/model/group/Group;)V

    .line 987
    goto :goto_1

    .line 991
    :cond_2
    iget-object v0, p0, Lcom/huawei/health/sns/ui/conversation/ConversationFragment$10;->c:Lcom/huawei/health/sns/ui/conversation/ConversationFragment;

    iget-object v1, p0, Lcom/huawei/health/sns/ui/conversation/ConversationFragment$10;->c:Lcom/huawei/health/sns/ui/conversation/ConversationFragment;

    iget-object v2, p0, Lcom/huawei/health/sns/ui/conversation/ConversationFragment$10;->e:Lo/axv;

    invoke-static {v1, v2}, Lcom/huawei/health/sns/ui/conversation/ConversationFragment;->h(Lcom/huawei/health/sns/ui/conversation/ConversationFragment;Lo/axv;)J

    move-result-wide v1

    const/4 v3, 0x0

    invoke-virtual {v0, v1, v2, v5, v3}, Lcom/huawei/health/sns/ui/conversation/ConversationFragment;->e(JIZ)V

    .line 993
    :goto_1
    const/4 v0, 0x1

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    return-object v0
.end method
