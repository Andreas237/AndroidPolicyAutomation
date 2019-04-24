.class Lo/azb$b;
.super Ljava/lang/Thread;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo/azb;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = "b"
.end annotation


# instance fields
.field final synthetic c:Lo/azb;


# direct methods
.method private constructor <init>(Lo/azb;)V
    .locals 0

    .line 90
    iput-object p1, p0, Lo/azb$b;->c:Lo/azb;

    invoke-direct {p0}, Ljava/lang/Thread;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lo/azb;Lo/azb$3;)V
    .locals 0

    .line 90
    invoke-direct {p0, p1}, Lo/azb$b;-><init>(Lo/azb;)V

    return-void
.end method

.method private a(J)V
    .locals 4

    .line 223
    const/4 v2, 0x1

    .line 224
    :goto_0
    if-eqz v2, :cond_1

    .line 228
    const-wide/16 v0, 0x0

    cmp-long v0, p1, v0

    if-lez v0, :cond_0

    .line 230
    :try_start_0
    iget-object v0, p0, Lo/azb$b;->c:Lo/azb;

    invoke-static {v0}, Lo/azb;->e(Lo/azb;)Ljava/lang/Object;

    move-result-object v0

    invoke-virtual {v0, p1, p2}, Ljava/lang/Object;->wait(J)V

    goto :goto_1

    .line 234
    :cond_0
    iget-object v0, p0, Lo/azb$b;->c:Lo/azb;

    invoke-static {v0}, Lo/azb;->e(Lo/azb;)Ljava/lang/Object;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->wait()V
    :try_end_0
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_0

    .line 236
    :goto_1
    const/4 v2, 0x0

    .line 241
    goto :goto_0

    .line 238
    :catch_0
    move-exception v3

    .line 240
    const/4 v2, 0x0

    .line 241
    goto :goto_0

    .line 243
    :cond_1
    return-void
.end method

.method private a(Lo/bag;)V
    .locals 4

    .line 164
    invoke-virtual {p1}, Lo/bag;->a()Lo/bag$c;

    move-result-object v0

    sget-object v1, Lo/bag$c;->d:Lo/bag$c;

    if-ne v0, v1, :cond_1

    .line 166
    invoke-static {}, Lo/bpf;->c()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 168
    const-string v0, "MessageTrace"

    const-string v1, "current BlockTask.Type.init"

    invoke-static {v0, v1}, Lo/bpf;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 170
    :cond_0
    const-wide/16 v0, 0x0

    invoke-direct {p0, v0, v1}, Lo/azb$b;->a(J)V

    goto :goto_1

    .line 172
    :cond_1
    invoke-virtual {p1}, Lo/bag;->a()Lo/bag$c;

    move-result-object v0

    sget-object v1, Lo/bag$c;->a:Lo/bag$c;

    if-ne v0, v1, :cond_3

    .line 174
    invoke-virtual {p1}, Lo/bag;->d()J

    move-result-wide v2

    .line 175
    const-wide/16 v0, 0x0

    cmp-long v0, v2, v0

    if-lez v0, :cond_2

    .line 177
    invoke-direct {p0, v2, v3}, Lo/azb$b;->a(J)V

    goto :goto_0

    .line 182
    :cond_2
    iget-object v0, p0, Lo/azb$b;->c:Lo/azb;

    invoke-static {v0}, Lo/azb;->k(Lo/azb;)V

    .line 184
    :goto_0
    goto :goto_1

    .line 185
    :cond_3
    invoke-virtual {p1}, Lo/bag;->a()Lo/bag$c;

    move-result-object v0

    sget-object v1, Lo/bag$c;->e:Lo/bag$c;

    if-ne v0, v1, :cond_4

    .line 187
    invoke-direct {p0, p1}, Lo/azb$b;->d(Lo/bag;)V

    .line 189
    :cond_4
    :goto_1
    return-void
.end method

.method private d(Lo/bag;)V
    .locals 5

    .line 198
    invoke-virtual {p1}, Lo/bag;->d()J

    move-result-wide v3

    .line 199
    invoke-static {}, Lo/bpf;->c()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 201
    const-string v0, "MessageTrace"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "SyncTask wait:"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v3, v4}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/bpf;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 204
    :cond_0
    const-wide/16 v0, 0x0

    cmp-long v0, v3, v0

    if-lez v0, :cond_1

    .line 206
    invoke-direct {p0, v3, v4}, Lo/azb$b;->a(J)V

    goto :goto_0

    .line 210
    :cond_1
    iget-object v0, p0, Lo/azb$b;->c:Lo/azb;

    invoke-static {v0}, Lo/azb;->a(Lo/azb;)Ljava/util/concurrent/atomic/AtomicReference;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Ljava/util/concurrent/atomic/AtomicReference;->set(Ljava/lang/Object;)V

    .line 212
    iget-object v0, p0, Lo/azb$b;->c:Lo/azb;

    invoke-virtual {p1}, Lo/bag;->e()J

    move-result-wide v1

    invoke-static {v0, v1, v2}, Lo/azb;->e(Lo/azb;J)J

    .line 214
    :goto_0
    return-void
.end method


# virtual methods
.method public run()V
    .locals 11

    .line 97
    :goto_0
    iget-object v0, p0, Lo/azb$b;->c:Lo/azb;

    invoke-static {v0}, Lo/azb;->e(Lo/azb;)Ljava/lang/Object;

    move-result-object v6

    monitor-enter v6

    .line 99
    :try_start_0
    iget-object v0, p0, Lo/azb$b;->c:Lo/azb;

    invoke-static {v0}, Lo/azb;->a(Lo/azb;)Ljava/util/concurrent/atomic/AtomicReference;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v7, v0

    check-cast v7, Lo/bag;

    .line 100
    if-eqz v7, :cond_0

    .line 102
    invoke-direct {p0, v7}, Lo/azb$b;->a(Lo/bag;)V

    goto/16 :goto_1

    .line 107
    :cond_0
    iget-object v0, p0, Lo/azb$b;->c:Lo/azb;

    invoke-static {v0}, Lo/azb;->c(Lo/azb;)Ljava/util/Queue;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Queue;->peek()Ljava/lang/Object;

    move-result-object v0

    move-object v8, v0

    check-cast v8, Lorg/jivesoftware/smack/packet/Message;

    .line 108
    if-eqz v8, :cond_4

    .line 111
    invoke-virtual {v8}, Lorg/jivesoftware/smack/packet/Message;->getPreSeq()J

    move-result-wide v0

    iget-object v2, p0, Lo/azb$b;->c:Lo/azb;

    invoke-static {v2}, Lo/azb;->d(Lo/azb;)J

    move-result-wide v2

    cmp-long v0, v0, v2

    if-nez v0, :cond_1

    .line 113
    iget-object v0, p0, Lo/azb$b;->c:Lo/azb;

    invoke-static {v0}, Lo/azb;->c(Lo/azb;)Ljava/util/Queue;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Queue;->poll()Ljava/lang/Object;

    move-result-object v0

    move-object v8, v0

    check-cast v8, Lorg/jivesoftware/smack/packet/Message;

    .line 114
    iget-object v0, p0, Lo/azb$b;->c:Lo/azb;

    invoke-static {v0, v8}, Lo/azb;->d(Lo/azb;Lorg/jivesoftware/smack/packet/Message;)V

    goto/16 :goto_1

    .line 117
    :cond_1
    invoke-virtual {v8}, Lorg/jivesoftware/smack/packet/Message;->getPreSeq()J

    move-result-wide v0

    iget-object v2, p0, Lo/azb$b;->c:Lo/azb;

    invoke-static {v2}, Lo/azb;->d(Lo/azb;)J

    move-result-wide v2

    cmp-long v0, v0, v2

    if-lez v0, :cond_3

    .line 123
    iget-object v0, p0, Lo/azb$b;->c:Lo/azb;

    invoke-static {v0}, Lo/azb;->d(Lo/azb;)J

    move-result-wide v0

    const-wide/16 v2, 0x0

    cmp-long v0, v0, v2

    if-gtz v0, :cond_2

    .line 125
    iget-object v0, p0, Lo/azb$b;->c:Lo/azb;

    invoke-static {v0}, Lo/azb;->c(Lo/azb;)Ljava/util/Queue;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Queue;->poll()Ljava/lang/Object;

    move-result-object v0

    move-object v8, v0

    check-cast v8, Lorg/jivesoftware/smack/packet/Message;

    .line 126
    iget-object v0, p0, Lo/azb$b;->c:Lo/azb;

    invoke-static {v0, v8}, Lo/azb;->d(Lo/azb;Lorg/jivesoftware/smack/packet/Message;)V

    goto/16 :goto_1

    .line 131
    :cond_2
    new-instance v9, Lo/bag;

    sget-object v0, Lo/bag$c;->e:Lo/bag$c;

    invoke-direct {v9, v0}, Lo/bag;-><init>(Lo/bag$c;)V

    .line 132
    iget-object v0, p0, Lo/azb$b;->c:Lo/azb;

    invoke-static {v0}, Lo/azb;->d(Lo/azb;)J

    move-result-wide v0

    invoke-virtual {v8}, Lorg/jivesoftware/smack/packet/Message;->getPreSeq()J

    move-result-wide v2

    invoke-virtual {v9, v0, v1, v2, v3}, Lo/bag;->d(JJ)V

    .line 133
    iget-object v0, p0, Lo/azb$b;->c:Lo/azb;

    invoke-static {v0}, Lo/azb;->a(Lo/azb;)Ljava/util/concurrent/atomic/AtomicReference;

    move-result-object v0

    invoke-virtual {v0, v9}, Ljava/util/concurrent/atomic/AtomicReference;->set(Ljava/lang/Object;)V

    .line 134
    iget-object v0, p0, Lo/azb$b;->c:Lo/azb;

    invoke-static {v0}, Lo/azb;->b(Lo/azb;)Lo/bal;

    move-result-object v0

    new-instance v1, Lo/bai;

    iget-object v2, p0, Lo/azb$b;->c:Lo/azb;

    invoke-static {v2}, Lo/azb;->d(Lo/azb;)J

    move-result-wide v2

    invoke-virtual {v8}, Lorg/jivesoftware/smack/packet/Message;->getPreSeq()J

    move-result-wide v4

    invoke-direct {v1, v2, v3, v4, v5}, Lo/bai;-><init>(JJ)V

    invoke-virtual {v0, v1}, Lo/bal;->c(Lo/bai;)V

    .line 135
    goto :goto_1

    .line 141
    :cond_3
    iget-object v0, p0, Lo/azb$b;->c:Lo/azb;

    invoke-static {v0}, Lo/azb;->c(Lo/azb;)Ljava/util/Queue;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Queue;->poll()Ljava/lang/Object;

    move-result-object v0

    move-object v8, v0

    check-cast v8, Lorg/jivesoftware/smack/packet/Message;

    .line 142
    const-string v0, "MessageTrace"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Receive Message preSeq < lastSeq message.do not handle:"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-static {v8}, Lo/bak;->c(Lorg/jivesoftware/smack/packet/Message;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/bpf;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 144
    iget-object v0, p0, Lo/azb$b;->c:Lo/azb;

    invoke-static {v0, v8}, Lo/azb;->b(Lo/azb;Lorg/jivesoftware/smack/packet/Message;)V

    goto :goto_1

    .line 150
    :cond_4
    const-wide/16 v0, 0x0

    invoke-direct {p0, v0, v1}, Lo/azb$b;->a(J)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 153
    :goto_1
    monitor-exit v6

    goto :goto_2

    :catchall_0
    move-exception v10

    monitor-exit v6

    throw v10

    :goto_2
    goto/16 :goto_0
.end method
