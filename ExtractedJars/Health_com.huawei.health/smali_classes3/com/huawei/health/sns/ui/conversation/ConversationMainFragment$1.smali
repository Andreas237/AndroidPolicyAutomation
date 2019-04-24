.class final Lcom/huawei/health/sns/ui/conversation/ConversationMainFragment$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/brc;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/health/sns/ui/conversation/ConversationMainFragment;->b(Landroid/os/Handler;)Lo/brc;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;Lo/brc<Ljava/util/List<Lcom/huawei/health/sns/model/user/UserNotify;>;>;"
    }
.end annotation


# direct methods
.method constructor <init>()V
    .locals 0

    .line 318
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public d(Lo/bqy;)V
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Lo/bqy<Ljava/util/List<Lcom/huawei/health/sns/model/user/UserNotify;>;>;)V"
        }
    .end annotation

    .line 323
    const/4 v4, 0x0

    .line 324
    invoke-interface {p1}, Lo/bqy;->e()Ljava/lang/Object;

    move-result-object v0

    move-object v5, v0

    check-cast v5, Ljava/util/List;

    .line 325
    if-eqz v5, :cond_1

    .line 327
    new-instance v4, Ljava/util/ArrayList;

    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    .line 328
    invoke-interface {v5}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v6

    :goto_0
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v7, v0

    check-cast v7, Lcom/huawei/health/sns/model/user/UserNotify;

    .line 331
    invoke-static {v7}, Lo/axj;->a(Lcom/huawei/health/sns/model/user/UserNotify;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 333
    invoke-virtual {v4, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 335
    :cond_0
    goto :goto_0

    .line 337
    :cond_1
    if-eqz v4, :cond_4

    invoke-virtual {v4}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-lez v0, :cond_4

    .line 340
    invoke-virtual {v4}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v6

    :goto_1
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_4

    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v7, v0

    check-cast v7, Lcom/huawei/health/sns/model/user/UserNotify;

    .line 341
    const-string v0, "ConversationMainFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getLocalUserNotifyList arr"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 342
    invoke-virtual {v7}, Lcom/huawei/health/sns/model/user/UserNotify;->getState()I

    move-result v0

    const/4 v1, 0x0

    if-ne v1, v0, :cond_3

    sget-object v0, Lcom/huawei/health/sns/model/user/UserNotify$b;->c:Lcom/huawei/health/sns/model/user/UserNotify$b;

    invoke-virtual {v7}, Lcom/huawei/health/sns/model/user/UserNotify;->getType()Lcom/huawei/health/sns/model/user/UserNotify$b;

    move-result-object v1

    if-eq v0, v1, :cond_2

    sget-object v0, Lcom/huawei/health/sns/model/user/UserNotify$b;->d:Lcom/huawei/health/sns/model/user/UserNotify$b;

    invoke-virtual {v7}, Lcom/huawei/health/sns/model/user/UserNotify;->getType()Lcom/huawei/health/sns/model/user/UserNotify$b;

    move-result-object v1

    if-ne v0, v1, :cond_3

    :cond_2
    invoke-virtual {v7}, Lcom/huawei/health/sns/model/user/UserNotify;->getNotifiedSide()I

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_3

    .line 343
    const-string v0, "ConversationMainFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "agree friend apply"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 344
    invoke-static {}, Lo/ant;->a()Lo/ant;

    move-result-object v0

    invoke-virtual {v0, v7}, Lo/ant;->c(Lcom/huawei/health/sns/model/user/UserNotify;)V

    goto :goto_2

    .line 346
    :cond_3
    const-string v0, "ConversationMainFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "not match"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 348
    :goto_2
    goto :goto_1

    .line 351
    :cond_4
    return-void
.end method
