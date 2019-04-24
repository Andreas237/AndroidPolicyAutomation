.class final Lo/ber$3;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/brd;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/ber;->d(Lcom/huawei/health/sns/model/chat/MessageItem;)Lo/brd;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;Lo/brd<Ljava/lang/Void;>;"
    }
.end annotation


# instance fields
.field final synthetic c:Lcom/huawei/health/sns/model/chat/MessageItem;


# direct methods
.method constructor <init>(Lcom/huawei/health/sns/model/chat/MessageItem;)V
    .locals 0

    .line 128
    iput-object p1, p0, Lo/ber$3;->c:Lcom/huawei/health/sns/model/chat/MessageItem;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public synthetic a(Lo/bra;)Ljava/lang/Object;
    .locals 1

    .line 128
    invoke-virtual {p0, p1}, Lo/ber$3;->b(Lo/bra;)Ljava/lang/Void;

    move-result-object v0

    return-object v0
.end method

.method public b(Lo/bra;)Ljava/lang/Void;
    .locals 3

    .line 134
    invoke-static {}, Lo/axa;->a()Lo/axa;

    move-result-object v0

    iget-object v1, p0, Lo/ber$3;->c:Lcom/huawei/health/sns/model/chat/MessageItem;

    invoke-virtual {v1}, Lcom/huawei/health/sns/model/chat/MessageItem;->getReceiverId()J

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, Lo/axa;->g(J)Z

    move-result v0

    if-nez v0, :cond_0

    .line 136
    const-string v0, "ChatViewHelper"

    const-string v1, "resend, user is not two way relation"

    invoke-static {v0, v1}, Lo/bpf;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 137
    iget-object v0, p0, Lo/ber$3;->c:Lcom/huawei/health/sns/model/chat/MessageItem;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/huawei/health/sns/model/chat/MessageItem;->setCanSend(Z)V

    goto :goto_0

    .line 141
    :cond_0
    iget-object v0, p0, Lo/ber$3;->c:Lcom/huawei/health/sns/model/chat/MessageItem;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lcom/huawei/health/sns/model/chat/MessageItem;->setCanSend(Z)V

    .line 144
    :goto_0
    invoke-static {}, Lo/apz;->d()Lo/apz;

    move-result-object v0

    iget-object v1, p0, Lo/ber$3;->c:Lcom/huawei/health/sns/model/chat/MessageItem;

    invoke-virtual {v0, v1}, Lo/apz;->a(Lcom/huawei/health/sns/model/chat/MessageItem;)V

    .line 146
    const/4 v0, 0x0

    return-object v0
.end method
