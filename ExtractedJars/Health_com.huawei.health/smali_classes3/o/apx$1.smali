.class Lo/apx$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/brd;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/apx;->c(JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V
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
.field final synthetic b:Lcom/huawei/health/sns/model/chat/MessageItem;

.field final synthetic c:Lo/apx;

.field final synthetic d:J


# direct methods
.method constructor <init>(Lo/apx;JLcom/huawei/health/sns/model/chat/MessageItem;)V
    .locals 0

    .line 68
    iput-object p1, p0, Lo/apx$1;->c:Lo/apx;

    iput-wide p2, p0, Lo/apx$1;->d:J

    iput-object p4, p0, Lo/apx$1;->b:Lcom/huawei/health/sns/model/chat/MessageItem;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public synthetic a(Lo/bra;)Ljava/lang/Object;
    .locals 1

    .line 68
    invoke-virtual {p0, p1}, Lo/apx$1;->e(Lo/bra;)Ljava/lang/Boolean;

    move-result-object v0

    return-object v0
.end method

.method public e(Lo/bra;)Ljava/lang/Boolean;
    .locals 4

    .line 72
    invoke-static {}, Lo/axa;->a()Lo/axa;

    move-result-object v0

    iget-wide v1, p0, Lo/apx$1;->d:J

    invoke-virtual {v0, v1, v2}, Lo/axa;->g(J)Z

    move-result v0

    if-nez v0, :cond_0

    .line 74
    const-string v0, "MessageSendVCardImpl"

    const-string v1, "user is not two way relation"

    invoke-static {v0, v1}, Lo/bpf;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 75
    iget-object v0, p0, Lo/apx$1;->b:Lcom/huawei/health/sns/model/chat/MessageItem;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/huawei/health/sns/model/chat/MessageItem;->setCanSend(Z)V

    .line 77
    :cond_0
    iget-object v0, p0, Lo/apx$1;->c:Lo/apx;

    invoke-static {v0}, Lo/apx;->d(Lo/apx;)Lo/apo;

    move-result-object v0

    iget-object v1, p0, Lo/apx$1;->b:Lcom/huawei/health/sns/model/chat/MessageItem;

    const/4 v2, 0x0

    const/4 v3, 0x1

    invoke-interface {v0, v1, v2, v3}, Lo/apo;->d(Lcom/huawei/health/sns/model/chat/MessageItem;IZ)V

    .line 78
    const/4 v0, 0x1

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    return-object v0
.end method
