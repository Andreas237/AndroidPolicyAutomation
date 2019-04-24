.class final Lcom/huawei/health/sns/ui/conversation/ConversationFragment$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/brd;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/health/sns/ui/conversation/ConversationFragment;->d(J)Lo/brd;
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

    .line 931
    iput-wide p1, p0, Lcom/huawei/health/sns/ui/conversation/ConversationFragment$1;->a:J

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public synthetic a(Lo/bra;)Ljava/lang/Object;
    .locals 1

    .line 931
    invoke-virtual {p0, p1}, Lcom/huawei/health/sns/ui/conversation/ConversationFragment$1;->b(Lo/bra;)Ljava/lang/Boolean;

    move-result-object v0

    return-object v0
.end method

.method public b(Lo/bra;)Ljava/lang/Boolean;
    .locals 3

    .line 937
    iget-wide v0, p0, Lcom/huawei/health/sns/ui/conversation/ConversationFragment$1;->a:J

    invoke-static {v0, v1}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lo/aqx;->d(Ljava/lang/String;)V

    .line 938
    invoke-static {}, Lo/ast;->b()Lo/ast;

    move-result-object v0

    iget-wide v1, p0, Lcom/huawei/health/sns/ui/conversation/ConversationFragment$1;->a:J

    invoke-virtual {v0, v1, v2}, Lo/ast;->b(J)Z

    .line 939
    invoke-static {}, Lo/apm;->a()Lo/apm;

    move-result-object v0

    iget-wide v1, p0, Lcom/huawei/health/sns/ui/conversation/ConversationFragment$1;->a:J

    invoke-virtual {v0, v1, v2}, Lo/apm;->e(J)Z

    .line 940
    const/4 v0, 0x1

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    return-object v0
.end method
