.class final Lo/bes$2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/brd;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/bes;->c(Lcom/huawei/health/sns/model/chat/MessageItem;)Lo/brd;
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
.field final synthetic d:Lcom/huawei/health/sns/model/chat/MessageItem;


# direct methods
.method constructor <init>(Lcom/huawei/health/sns/model/chat/MessageItem;)V
    .locals 0

    .line 452
    iput-object p1, p0, Lo/bes$2;->d:Lcom/huawei/health/sns/model/chat/MessageItem;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public synthetic a(Lo/bra;)Ljava/lang/Object;
    .locals 1

    .line 452
    invoke-virtual {p0, p1}, Lo/bes$2;->e(Lo/bra;)Ljava/lang/Boolean;

    move-result-object v0

    return-object v0
.end method

.method public e(Lo/bra;)Ljava/lang/Boolean;
    .locals 3

    .line 457
    invoke-static {}, Lo/apm;->a()Lo/apm;

    move-result-object v0

    iget-object v1, p0, Lo/bes$2;->d:Lcom/huawei/health/sns/model/chat/MessageItem;

    invoke-virtual {v1}, Lcom/huawei/health/sns/model/chat/MessageItem;->getMsgId()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/apm;->c(Ljava/lang/String;)V

    .line 459
    iget-object v0, p0, Lo/bes$2;->d:Lcom/huawei/health/sns/model/chat/MessageItem;

    invoke-virtual {v0}, Lcom/huawei/health/sns/model/chat/MessageItem;->getChatType()I

    move-result v0

    const/4 v1, 0x2

    if-ne v0, v1, :cond_0

    .line 461
    invoke-static {}, Lo/apm;->a()Lo/apm;

    move-result-object v0

    iget-object v1, p0, Lo/bes$2;->d:Lcom/huawei/health/sns/model/chat/MessageItem;

    invoke-virtual {v1}, Lcom/huawei/health/sns/model/chat/MessageItem;->getUserId()J

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, Lo/apm;->h(J)V

    .line 463
    :cond_0
    iget-object v0, p0, Lo/bes$2;->d:Lcom/huawei/health/sns/model/chat/MessageItem;

    const/16 v1, 0x9

    const/16 v2, 0x16

    invoke-static {v1, v2, v0}, Lo/apf;->d(IILjava/lang/Object;)V

    .line 465
    const/4 v0, 0x1

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    return-object v0
.end method
