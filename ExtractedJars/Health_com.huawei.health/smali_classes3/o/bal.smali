.class public Lo/bal;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private b:Lo/azg;

.field private c:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<Lo/bai;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lo/azg;)V
    .locals 1

    .line 41
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 28
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lo/bal;->c:Ljava/util/List;

    .line 42
    iput-object p1, p0, Lo/bal;->b:Lo/azg;

    .line 43
    return-void
.end method

.method private a(J)Lo/bai;
    .locals 5

    .line 133
    const/4 v2, 0x0

    .line 134
    iget-object v0, p0, Lo/bal;->c:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :goto_0
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Lo/bai;

    .line 136
    invoke-virtual {v4}, Lo/bai;->e()J

    move-result-wide v0

    cmp-long v0, p1, v0

    if-ltz v0, :cond_0

    invoke-virtual {v4}, Lo/bai;->c()J

    move-result-wide v0

    cmp-long v0, p1, v0

    if-gtz v0, :cond_0

    .line 138
    move-object v2, v4

    .line 139
    goto :goto_1

    .line 141
    :cond_0
    goto :goto_0

    .line 142
    :cond_1
    :goto_1
    return-object v2
.end method

.method private d(JJLjava/lang/String;)V
    .locals 7

    .line 154
    move-wide v1, p1

    move-wide v3, p3

    move-object v5, p5

    const/4 v0, 0x1

    invoke-static/range {v0 .. v5}, Lcom/huawei/health/sns/server/im/message/impl/packet/SyncSeq;->newInstance(IJJLjava/lang/String;)Lcom/huawei/health/sns/server/im/message/impl/packet/SyncSeq;

    move-result-object v6

    .line 155
    iget-object v0, p0, Lo/bal;->b:Lo/azg;

    if-eqz v0, :cond_0

    .line 157
    const-string v0, "MessageTrace"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "sendSyncReq()["

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p1, p2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, ","

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p3, p4}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, "]"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/bpf;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 158
    iget-object v0, p0, Lo/bal;->b:Lo/azg;

    const/4 v1, 0x1

    invoke-interface {v0, v6, v1}, Lo/azg;->e(Lorg/jivesoftware/smack/packet/Stanza;Z)V

    .line 160
    :cond_0
    return-void
.end method


# virtual methods
.method public b()V
    .locals 1

    .line 50
    iget-object v0, p0, Lo/bal;->c:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->clear()V

    .line 51
    return-void
.end method

.method public c()J
    .locals 6

    .line 55
    const-wide/16 v2, 0x0

    .line 56
    iget-object v0, p0, Lo/bal;->c:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :goto_0
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v5, v0

    check-cast v5, Lo/bai;

    .line 58
    invoke-virtual {v5}, Lo/bai;->c()J

    move-result-wide v0

    invoke-static {v2, v3, v0, v1}, Ljava/lang/Math;->max(JJ)J

    move-result-wide v2

    .line 59
    goto :goto_0

    .line 60
    :cond_0
    return-wide v2
.end method

.method public c(Lo/bai;)V
    .locals 6

    .line 70
    if-eqz p1, :cond_0

    .line 72
    iget-object v0, p0, Lo/bal;->c:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 73
    move-object v0, p0

    invoke-virtual {p1}, Lo/bai;->e()J

    move-result-wide v1

    invoke-virtual {p1}, Lo/bai;->c()J

    move-result-wide v3

    invoke-virtual {p1}, Lo/bai;->d()Ljava/lang/String;

    move-result-object v5

    invoke-direct/range {v0 .. v5}, Lo/bal;->d(JJLjava/lang/String;)V

    .line 75
    :cond_0
    return-void
.end method

.method public d(Lcom/huawei/health/sns/server/im/message/impl/packet/SyncSeq;)V
    .locals 7

    .line 84
    iget-object v0, p0, Lo/bal;->c:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-lez v0, :cond_0

    if-nez p1, :cond_1

    .line 86
    :cond_0
    return-void

    .line 89
    :cond_1
    const-string v0, "MessageTrace"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "reportSyncFailed:["

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {p1}, Lcom/huawei/health/sns/server/im/message/impl/packet/SyncSeq;->getSeq()J

    move-result-wide v2

    invoke-virtual {v1, v2, v3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, ","

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {p1}, Lcom/huawei/health/sns/server/im/message/impl/packet/SyncSeq;->getSeqEnd()J

    move-result-wide v2

    invoke-virtual {v1, v2, v3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, "]"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/bpf;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 91
    new-instance v4, Ljava/util/ArrayList;

    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    .line 92
    iget-object v0, p0, Lo/bal;->c:Ljava/util/List;

    invoke-interface {v4, v0}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    .line 93
    invoke-interface {v4}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v5

    :goto_0
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v6, v0

    check-cast v6, Lo/bai;

    .line 95
    invoke-virtual {p1}, Lcom/huawei/health/sns/server/im/message/impl/packet/SyncSeq;->getSeq()J

    move-result-wide v0

    invoke-virtual {v6}, Lo/bai;->e()J

    move-result-wide v2

    cmp-long v0, v0, v2

    if-ltz v0, :cond_2

    invoke-virtual {p1}, Lcom/huawei/health/sns/server/im/message/impl/packet/SyncSeq;->getSeqEnd()J

    move-result-wide v0

    invoke-virtual {v6}, Lo/bai;->c()J

    move-result-wide v2

    cmp-long v0, v0, v2

    if-gtz v0, :cond_2

    .line 97
    iget-object v0, p0, Lo/bal;->c:Ljava/util/List;

    invoke-interface {v0, v6}, Ljava/util/List;->remove(Ljava/lang/Object;)Z

    .line 99
    :cond_2
    goto :goto_0

    .line 100
    :cond_3
    return-void
.end method

.method public e(J)V
    .locals 7

    .line 109
    const-string v0, "MessageTrace"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "reportSyncSuccess,seq:"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p1, p2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/bpf;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 110
    invoke-direct {p0, p1, p2}, Lo/bal;->a(J)Lo/bai;

    move-result-object v6

    .line 111
    if-eqz v6, :cond_1

    .line 113
    invoke-virtual {v6}, Lo/bai;->c()J

    move-result-wide v0

    cmp-long v0, p1, v0

    if-nez v0, :cond_0

    .line 116
    iget-object v0, p0, Lo/bal;->c:Ljava/util/List;

    invoke-interface {v0, v6}, Ljava/util/List;->remove(Ljava/lang/Object;)Z

    goto :goto_0

    .line 120
    :cond_0
    move-object v0, p0

    move-wide v1, p1

    invoke-virtual {v6}, Lo/bai;->c()J

    move-result-wide v3

    invoke-virtual {v6}, Lo/bai;->d()Ljava/lang/String;

    move-result-object v5

    invoke-direct/range {v0 .. v5}, Lo/bal;->d(JJLjava/lang/String;)V

    .line 123
    :cond_1
    :goto_0
    return-void
.end method
