.class Lo/aup$4$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/brd;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/aup$4;->e(II)V
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
.field final synthetic a:Lo/aup$4;


# direct methods
.method constructor <init>(Lo/aup$4;)V
    .locals 0

    .line 159
    iput-object p1, p0, Lo/aup$4$1;->a:Lo/aup$4;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public synthetic a(Lo/bra;)Ljava/lang/Object;
    .locals 1

    .line 159
    invoke-virtual {p0, p1}, Lo/aup$4$1;->b(Lo/bra;)Ljava/lang/Boolean;

    move-result-object v0

    return-object v0
.end method

.method public b(Lo/bra;)Ljava/lang/Boolean;
    .locals 4

    .line 163
    const-string v0, "MediaTransfer"

    const-string v1, "transferMultiMessage onLoginError"

    invoke-static {v0, v1}, Lo/bpf;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 165
    iget-object v0, p0, Lo/aup$4$1;->a:Lo/aup$4;

    iget-object v0, v0, Lo/aup$4;->d:Lcom/huawei/health/sns/model/chat/MessageItem;

    const/4 v1, 0x3

    invoke-virtual {v0, v1}, Lcom/huawei/health/sns/model/chat/MessageItem;->setSendMsgStatus(I)V

    .line 166
    iget-object v0, p0, Lo/aup$4$1;->a:Lo/aup$4;

    iget-object v0, v0, Lo/aup$4;->c:Lo/aup;

    invoke-static {v0}, Lo/aup;->a(Lo/aup;)Lo/aur;

    move-result-object v0

    iget-object v1, p0, Lo/aup$4$1;->a:Lo/aup$4;

    iget-object v1, v1, Lo/aup$4;->d:Lcom/huawei/health/sns/model/chat/MessageItem;

    iget-object v2, p0, Lo/aup$4$1;->a:Lo/aup$4;

    iget-object v2, v2, Lo/aup$4;->d:Lcom/huawei/health/sns/model/chat/MessageItem;

    invoke-virtual {v2}, Lcom/huawei/health/sns/model/chat/MessageItem;->getUserId()J

    move-result-wide v2

    invoke-interface {v0, v1, v2, v3}, Lo/aur;->e(Lcom/huawei/health/sns/model/chat/MessageItem;J)V

    .line 168
    invoke-static {}, Lo/apm;->a()Lo/apm;

    move-result-object v0

    iget-object v1, p0, Lo/aup$4$1;->a:Lo/aup$4;

    iget-object v1, v1, Lo/aup$4;->d:Lcom/huawei/health/sns/model/chat/MessageItem;

    invoke-virtual {v0, v1}, Lo/apm;->d(Lcom/huawei/health/sns/model/chat/MessageItem;)V

    .line 169
    const/4 v0, 0x1

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    return-object v0
.end method
