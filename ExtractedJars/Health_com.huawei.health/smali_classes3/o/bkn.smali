.class public Lo/bkn;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 18
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private a(Lcom/huawei/health/sns/model/user/UserNotify;)Z
    .locals 3

    .line 47
    const/4 v2, 0x0

    .line 49
    if-eqz p1, :cond_1

    .line 50
    invoke-virtual {p1}, Lcom/huawei/health/sns/model/user/UserNotify;->getType()Lcom/huawei/health/sns/model/user/UserNotify$b;

    move-result-object v0

    sget-object v1, Lcom/huawei/health/sns/model/user/UserNotify$b;->a:Lcom/huawei/health/sns/model/user/UserNotify$b;

    if-eq v0, v1, :cond_0

    invoke-virtual {p1}, Lcom/huawei/health/sns/model/user/UserNotify;->getType()Lcom/huawei/health/sns/model/user/UserNotify$b;

    move-result-object v0

    sget-object v1, Lcom/huawei/health/sns/model/user/UserNotify$b;->b:Lcom/huawei/health/sns/model/user/UserNotify$b;

    if-ne v0, v1, :cond_1

    .line 52
    :cond_0
    const/4 v2, 0x1

    .line 54
    :cond_1
    return v2
.end method


# virtual methods
.method public a(Ljava/util/List;)V
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Lcom/huawei/health/sns/model/user/UserNotify;>;)V"
        }
    .end annotation

    .line 27
    if-eqz p1, :cond_1

    .line 29
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :goto_0
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v5, v0

    check-cast v5, Lcom/huawei/health/sns/model/user/UserNotify;

    .line 31
    invoke-direct {p0, v5}, Lo/bkn;->a(Lcom/huawei/health/sns/model/user/UserNotify;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 33
    invoke-static {}, Lo/auu;->b()Lo/auu;

    move-result-object v0

    sget-object v1, Lo/auu$b;->d:Lo/auu$b;

    invoke-virtual {v5}, Lcom/huawei/health/sns/model/user/UserNotify;->getUserId()J

    move-result-wide v2

    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Long;->intValue()I

    move-result v2

    invoke-virtual {v0, v1, v2}, Lo/auu;->a(Lo/auu$b;I)V

    .line 35
    :cond_0
    goto :goto_0

    .line 37
    :cond_1
    return-void
.end method

.method public a(Ljava/util/List;Ljava/util/Set;)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Lcom/huawei/health/sns/model/user/UserNotify;>;Ljava/util/Set<Ljava/lang/Long;>;)V"
        }
    .end annotation

    .line 66
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v3, v0

    check-cast v3, Lcom/huawei/health/sns/model/user/UserNotify;

    .line 68
    invoke-virtual {v3}, Lcom/huawei/health/sns/model/user/UserNotify;->isReaded()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 71
    invoke-virtual {v3}, Lcom/huawei/health/sns/model/user/UserNotify;->getUserId()J

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    invoke-interface {p2, v0}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 73
    const/4 v0, 0x0

    invoke-virtual {v3, v0}, Lcom/huawei/health/sns/model/user/UserNotify;->setIsReaded(Z)V

    goto :goto_1

    .line 79
    :cond_0
    invoke-virtual {v3}, Lcom/huawei/health/sns/model/user/UserNotify;->getUserId()J

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    invoke-interface {p2, v0}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 81
    :cond_1
    :goto_1
    goto :goto_0

    .line 82
    :cond_2
    return-void
.end method
