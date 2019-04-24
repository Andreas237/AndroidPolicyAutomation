.class Lcom/huawei/health/sns/ui/conversation/ConversationFragment$8;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/brd;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/health/sns/ui/conversation/ConversationFragment;->g(Lo/axv;)Lo/brd;
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
.field final synthetic c:Lo/axv;

.field final synthetic d:Lcom/huawei/health/sns/ui/conversation/ConversationFragment;


# direct methods
.method constructor <init>(Lcom/huawei/health/sns/ui/conversation/ConversationFragment;Lo/axv;)V
    .locals 0

    .line 1038
    iput-object p1, p0, Lcom/huawei/health/sns/ui/conversation/ConversationFragment$8;->d:Lcom/huawei/health/sns/ui/conversation/ConversationFragment;

    iput-object p2, p0, Lcom/huawei/health/sns/ui/conversation/ConversationFragment$8;->c:Lo/axv;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public synthetic a(Lo/bra;)Ljava/lang/Object;
    .locals 1

    .line 1038
    invoke-virtual {p0, p1}, Lcom/huawei/health/sns/ui/conversation/ConversationFragment$8;->d(Lo/bra;)Ljava/lang/Boolean;

    move-result-object v0

    return-object v0
.end method

.method public d(Lo/bra;)Ljava/lang/Boolean;
    .locals 4

    .line 1042
    invoke-static {}, Lo/apm;->a()Lo/apm;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/health/sns/ui/conversation/ConversationFragment$8;->d:Lcom/huawei/health/sns/ui/conversation/ConversationFragment;

    iget-object v2, p0, Lcom/huawei/health/sns/ui/conversation/ConversationFragment$8;->c:Lo/axv;

    invoke-static {v1, v2}, Lcom/huawei/health/sns/ui/conversation/ConversationFragment;->h(Lcom/huawei/health/sns/ui/conversation/ConversationFragment;Lo/axv;)J

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, Lo/apm;->c(J)Z

    .line 1044
    iget-object v0, p0, Lcom/huawei/health/sns/ui/conversation/ConversationFragment$8;->c:Lo/axv;

    invoke-virtual {v0}, Lo/axv;->f()I

    move-result v0

    const/4 v1, 0x2

    if-ne v0, v1, :cond_0

    .line 1046
    iget-object v0, p0, Lcom/huawei/health/sns/ui/conversation/ConversationFragment$8;->d:Lcom/huawei/health/sns/ui/conversation/ConversationFragment;

    iget-object v1, p0, Lcom/huawei/health/sns/ui/conversation/ConversationFragment$8;->c:Lo/axv;

    invoke-static {v0, v1}, Lcom/huawei/health/sns/ui/conversation/ConversationFragment;->a(Lcom/huawei/health/sns/ui/conversation/ConversationFragment;Lo/axv;)V

    .line 1048
    :cond_0
    invoke-static {}, Lo/ast;->b()Lo/ast;

    move-result-object v0

    invoke-virtual {v0}, Lo/ast;->a()[I

    move-result-object v0

    const/4 v1, 0x1

    aget v3, v0, v1

    .line 1050
    if-nez v3, :cond_1

    .line 1052
    invoke-static {}, Lo/auv;->b()V

    .line 1054
    :cond_1
    const/4 v0, 0x1

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    return-object v0
.end method
