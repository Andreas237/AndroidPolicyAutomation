.class public final Lo/aus;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/aur;


# static fields
.field private static e:Lo/aus;


# instance fields
.field private c:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<Ljava/lang/Long;Ljava/util/ArrayList<Landroid/os/Handler;>;>;"
        }
    .end annotation
.end field


# direct methods
.method private constructor <init>()V
    .locals 1

    .line 53
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 47
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lo/aus;->c:Ljava/util/Map;

    .line 54
    return-void
.end method

.method public static declared-synchronized b()Lo/aus;
    .locals 4

    const-class v2, Lo/aus;

    monitor-enter v2

    .line 63
    :try_start_0
    sget-object v0, Lo/aus;->e:Lo/aus;

    const/4 v1, 0x0

    if-ne v1, v0, :cond_0

    .line 65
    new-instance v0, Lo/aus;

    invoke-direct {v0}, Lo/aus;-><init>()V

    sput-object v0, Lo/aus;->e:Lo/aus;

    .line 67
    :cond_0
    sget-object v0, Lo/aus;->e:Lo/aus;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v2

    return-object v0

    :catchall_0
    move-exception v3

    monitor-exit v2

    throw v3
.end method


# virtual methods
.method public a(Lcom/huawei/health/sns/model/chat/MessageItem;)V
    .locals 1

    .line 172
    if-nez p1, :cond_0

    .line 174
    return-void

    .line 176
    :cond_0
    new-instance v0, Lo/aum;

    invoke-direct {v0, p0}, Lo/aum;-><init>(Lo/aur;)V

    invoke-virtual {v0, p1}, Lo/aum;->a(Lcom/huawei/health/sns/model/chat/MessageItem;)V

    .line 177
    return-void
.end method

.method public b(JLandroid/os/Handler;)V
    .locals 3

    .line 78
    iget-object v0, p0, Lo/aus;->c:Ljava/util/Map;

    invoke-static {p1, p2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Ljava/util/ArrayList;

    .line 79
    if-nez v2, :cond_0

    .line 81
    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 83
    :cond_0
    invoke-virtual {v2, p3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 84
    iget-object v0, p0, Lo/aus;->c:Ljava/util/Map;

    invoke-static {p1, p2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 85
    return-void
.end method

.method public b(Lcom/huawei/health/sns/model/chat/MessageItem;)V
    .locals 1

    .line 203
    if-nez p1, :cond_0

    .line 205
    return-void

    .line 207
    :cond_0
    new-instance v0, Lo/aup;

    invoke-direct {v0, p0}, Lo/aup;-><init>(Lo/aur;)V

    invoke-virtual {v0, p1}, Lo/aup;->c(Lcom/huawei/health/sns/model/chat/MessageItem;)V

    .line 208
    return-void
.end method

.method public c(Lcom/huawei/health/sns/model/chat/MessageItem;)V
    .locals 1

    .line 141
    if-nez p1, :cond_0

    .line 143
    return-void

    .line 145
    :cond_0
    new-instance v0, Lo/auq;

    invoke-direct {v0, p0}, Lo/auq;-><init>(Lo/aur;)V

    invoke-virtual {v0, p1}, Lo/auq;->e(Lcom/huawei/health/sns/model/chat/MessageItem;)V

    .line 146
    return-void
.end method

.method public d(JLandroid/os/Handler;)V
    .locals 3

    .line 94
    iget-object v0, p0, Lo/aus;->c:Ljava/util/Map;

    invoke-static {p1, p2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Ljava/util/ArrayList;

    .line 95
    if-eqz v2, :cond_0

    .line 97
    invoke-virtual {v2, p3}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    .line 99
    invoke-virtual {v2}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 101
    iget-object v0, p0, Lo/aus;->c:Ljava/util/Map;

    invoke-static {p1, p2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 104
    :cond_0
    return-void
.end method

.method public d(Lcom/huawei/health/sns/model/chat/MessageItem;)V
    .locals 3

    .line 156
    if-nez p1, :cond_0

    .line 158
    const-class v0, Lo/aus;

    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v0

    const-string v1, "downloadThumbnailImage item is null"

    invoke-static {v0, v1}, Lo/bpf;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 159
    return-void

    .line 161
    :cond_0
    const-class v0, Lo/aus;

    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "downloadThumbnailImage item:"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {p1}, Lcom/huawei/health/sns/model/chat/MessageItem;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/bpf;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 162
    new-instance v0, Lo/aum;

    invoke-direct {v0, p0}, Lo/aum;-><init>(Lo/aur;)V

    invoke-virtual {v0, p1}, Lo/aum;->e(Lcom/huawei/health/sns/model/chat/MessageItem;)V

    .line 163
    return-void
.end method

.method public e(Lcom/huawei/health/sns/model/chat/MessageItem;)V
    .locals 3

    .line 187
    if-nez p1, :cond_0

    .line 189
    const-class v0, Lo/aus;

    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v0

    const-string v1, "loadOriginalImage item is null"

    invoke-static {v0, v1}, Lo/bpf;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 190
    return-void

    .line 192
    :cond_0
    const-class v0, Lo/aus;

    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "loadOriginalImage item:"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {p1}, Lcom/huawei/health/sns/model/chat/MessageItem;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/bpf;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 193
    new-instance v0, Lo/aum;

    invoke-direct {v0, p0}, Lo/aum;-><init>(Lo/aur;)V

    invoke-virtual {v0, p1}, Lo/aum;->d(Lcom/huawei/health/sns/model/chat/MessageItem;)V

    .line 194
    return-void
.end method

.method public e(Lcom/huawei/health/sns/model/chat/MessageItem;J)V
    .locals 8

    .line 115
    iget-object v2, p0, Lo/aus;->c:Ljava/util/Map;

    monitor-enter v2

    .line 117
    :try_start_0
    iget-object v0, p0, Lo/aus;->c:Ljava/util/Map;

    invoke-static {p2, p3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    move-object v3, v0

    check-cast v3, Ljava/util/ArrayList;

    .line 118
    if-eqz v3, :cond_1

    .line 120
    invoke-virtual {v3}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :goto_0
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v5, v0

    check-cast v5, Landroid/os/Handler;

    .line 123
    if-eqz v5, :cond_0

    .line 125
    const/16 v0, 0x2710

    invoke-virtual {v5, v0, p1}, Landroid/os/Handler;->obtainMessage(ILjava/lang/Object;)Landroid/os/Message;

    move-result-object v6

    .line 126
    invoke-virtual {v5, v6}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 128
    :cond_0
    goto :goto_0

    .line 130
    :cond_1
    monitor-exit v2

    goto :goto_1

    :catchall_0
    move-exception v7

    monitor-exit v2

    throw v7

    .line 131
    :goto_1
    return-void
.end method
