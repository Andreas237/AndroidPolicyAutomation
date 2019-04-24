.class Lo/azb$d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo/azb;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = "d"
.end annotation


# instance fields
.field final synthetic b:Lo/azb;

.field private c:Lorg/jivesoftware/smack/packet/Message;


# direct methods
.method constructor <init>(Lo/azb;Lorg/jivesoftware/smack/packet/Message;)V
    .locals 0

    .line 379
    iput-object p1, p0, Lo/azb$d;->b:Lo/azb;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 380
    iput-object p2, p0, Lo/azb$d;->c:Lorg/jivesoftware/smack/packet/Message;

    .line 381
    return-void
.end method


# virtual methods
.method public run()V
    .locals 5

    .line 387
    iget-object v0, p0, Lo/azb$d;->c:Lorg/jivesoftware/smack/packet/Message;

    invoke-static {v0}, Lo/baj;->e(Lorg/jivesoftware/smack/packet/Message;)Lcom/huawei/health/sns/server/im/message/base/SNSMessageBase;

    move-result-object v2

    .line 388
    if-nez v2, :cond_0

    .line 390
    const-string v0, "MessageTrace"

    const-string v1, "Message to SNSMessageBase failed!"

    invoke-static {v0, v1}, Lo/bpf;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 391
    return-void

    .line 393
    :cond_0
    iget-object v0, p0, Lo/azb$d;->b:Lo/azb;

    invoke-static {v0}, Lo/azb;->g(Lo/azb;)Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :goto_0
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Lo/bab;

    .line 395
    invoke-interface {v4, v2}, Lo/bab;->e(Lcom/huawei/health/sns/server/im/message/base/SNSMessageBase;)V

    .line 396
    goto :goto_0

    .line 398
    :cond_1
    iget-object v0, p0, Lo/azb$d;->b:Lo/azb;

    iget-object v1, p0, Lo/azb$d;->c:Lorg/jivesoftware/smack/packet/Message;

    invoke-static {v0, v1}, Lo/azb;->c(Lo/azb;Lorg/jivesoftware/smack/packet/Message;)V

    .line 399
    return-void
.end method
