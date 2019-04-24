.class final Lo/aqj$5;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/brd;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/aqj;->e(Lcom/huawei/health/sns/model/chat/MessageItem;)Lo/brd;
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
.field final synthetic a:Lcom/huawei/health/sns/model/chat/MessageItem;


# direct methods
.method constructor <init>(Lcom/huawei/health/sns/model/chat/MessageItem;)V
    .locals 0

    .line 275
    iput-object p1, p0, Lo/aqj$5;->a:Lcom/huawei/health/sns/model/chat/MessageItem;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public synthetic a(Lo/bra;)Ljava/lang/Object;
    .locals 1

    .line 275
    invoke-virtual {p0, p1}, Lo/aqj$5;->e(Lo/bra;)Ljava/lang/Boolean;

    move-result-object v0

    return-object v0
.end method

.method public e(Lo/bra;)Ljava/lang/Boolean;
    .locals 3

    .line 280
    iget-object v0, p0, Lo/aqj$5;->a:Lcom/huawei/health/sns/model/chat/MessageItem;

    invoke-static {}, Lo/apm;->a()Lo/apm;

    move-result-object v1

    iget-object v2, p0, Lo/aqj$5;->a:Lcom/huawei/health/sns/model/chat/MessageItem;

    invoke-virtual {v1, v2}, Lo/apm;->a(Lcom/huawei/health/sns/model/chat/MessageItem;)I

    move-result v1

    invoke-virtual {v0, v1}, Lcom/huawei/health/sns/model/chat/MessageItem;->setId(I)V

    .line 281
    iget-object v0, p0, Lo/aqj$5;->a:Lcom/huawei/health/sns/model/chat/MessageItem;

    const/4 v1, 0x1

    const v2, 0x310dc

    invoke-static {v1, v2, v0}, Lo/apf;->d(IILjava/lang/Object;)V

    .line 283
    const/4 v0, 0x1

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    return-object v0
.end method
