.class Lcom/huawei/health/sns/ui/chat/ChatActivity$5;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/boj$c;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/health/sns/ui/chat/ChatActivity;->a()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic c:Lcom/huawei/health/sns/ui/chat/ChatActivity;

.field final synthetic e:Ljava/util/ArrayList;


# direct methods
.method constructor <init>(Lcom/huawei/health/sns/ui/chat/ChatActivity;Ljava/util/ArrayList;)V
    .locals 0

    .line 458
    iput-object p1, p0, Lcom/huawei/health/sns/ui/chat/ChatActivity$5;->c:Lcom/huawei/health/sns/ui/chat/ChatActivity;

    iput-object p2, p0, Lcom/huawei/health/sns/ui/chat/ChatActivity$5;->e:Ljava/util/ArrayList;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public c()V
    .locals 5

    .line 462
    iget-object v0, p0, Lcom/huawei/health/sns/ui/chat/ChatActivity$5;->e:Ljava/util/ArrayList;

    if-nez v0, :cond_0

    .line 464
    iget-object v0, p0, Lcom/huawei/health/sns/ui/chat/ChatActivity$5;->c:Lcom/huawei/health/sns/ui/chat/ChatActivity;

    const/4 v1, 0x0

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Lcom/huawei/health/sns/ui/chat/ChatActivity;->a(Lcom/huawei/health/sns/model/chat/MessageItem;Z)V

    .line 465
    return-void

    .line 468
    :cond_0
    iget-object v0, p0, Lcom/huawei/health/sns/ui/chat/ChatActivity$5;->e:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :goto_0
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Lcom/huawei/health/sns/model/chat/MessageItem;

    .line 470
    const/16 v0, 0x9

    const/16 v1, 0x16

    invoke-static {v0, v1, v4}, Lo/apf;->d(IILjava/lang/Object;)V

    .line 472
    invoke-static {}, Lo/apm;->a()Lo/apm;

    move-result-object v0

    invoke-virtual {v4}, Lcom/huawei/health/sns/model/chat/MessageItem;->getMsgId()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/apm;->a(Ljava/lang/String;)V

    .line 473
    goto :goto_0

    .line 474
    :cond_1
    invoke-static {}, Lo/aqp;->c()Lo/aqp;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/health/sns/ui/chat/ChatActivity$5;->e:Ljava/util/ArrayList;

    invoke-virtual {v0, v1}, Lo/aqp;->c(Ljava/util/ArrayList;)V

    .line 476
    iget-object v0, p0, Lcom/huawei/health/sns/ui/chat/ChatActivity$5;->e:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-lez v0, :cond_2

    .line 478
    invoke-static {}, Lo/apm;->a()Lo/apm;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/health/sns/ui/chat/ChatActivity$5;->e:Ljava/util/ArrayList;

    .line 479
    const/4 v2, 0x0

    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/huawei/health/sns/model/chat/MessageItem;

    invoke-virtual {v1}, Lcom/huawei/health/sns/model/chat/MessageItem;->getUserId()J

    move-result-wide v1

    .line 478
    invoke-virtual {v0, v1, v2}, Lo/apm;->g(J)V

    .line 481
    :cond_2
    iget-object v0, p0, Lcom/huawei/health/sns/ui/chat/ChatActivity$5;->c:Lcom/huawei/health/sns/ui/chat/ChatActivity;

    const/4 v1, 0x0

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Lcom/huawei/health/sns/ui/chat/ChatActivity;->a(Lcom/huawei/health/sns/model/chat/MessageItem;Z)V

    .line 482
    return-void
.end method

.method public d()V
    .locals 0

    .line 488
    return-void
.end method
