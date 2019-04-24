.class public final Lo/azo;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lo/azo$e;
    }
.end annotation


# instance fields
.field private a:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<Ljava/lang/String;Lo/azn;>;"
        }
    .end annotation
.end field

.field private c:Landroid/os/Handler;

.field private d:J

.field private e:Lo/azt;


# direct methods
.method public constructor <init>(Lo/azt;)V
    .locals 4

    .line 90
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 37
    new-instance v0, Ljava/util/concurrent/ConcurrentHashMap;

    invoke-direct {v0}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    iput-object v0, p0, Lo/azo;->a:Ljava/util/Map;

    .line 91
    iput-object p1, p0, Lo/azo;->e:Lo/azt;

    .line 93
    new-instance v2, Landroid/os/HandlerThread;

    const-string v0, "PacketSendHandler"

    invoke-direct {v2, v0}, Landroid/os/HandlerThread;-><init>(Ljava/lang/String;)V

    .line 94
    invoke-virtual {v2}, Landroid/os/HandlerThread;->start()V

    .line 95
    invoke-virtual {v2}, Landroid/os/HandlerThread;->getLooper()Landroid/os/Looper;

    move-result-object v3

    .line 96
    if-eqz v3, :cond_0

    .line 98
    new-instance v0, Lo/azo$e;

    invoke-direct {v0, p0, v3}, Lo/azo$e;-><init>(Lo/azo;Landroid/os/Looper;)V

    iput-object v0, p0, Lo/azo;->c:Landroid/os/Handler;

    goto :goto_0

    .line 102
    :cond_0
    const-string v0, "PacketSender"

    const-string v1, "Warning !!!! PacketResendHandler Looper is null!"

    invoke-static {v0, v1}, Lo/bpf;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 104
    :goto_0
    return-void
.end method

.method static synthetic a(Lo/azo;)V
    .locals 0

    .line 27
    invoke-direct {p0}, Lo/azo;->e()V

    return-void
.end method

.method private a(Lorg/jivesoftware/smack/packet/Stanza;)V
    .locals 1

    .line 342
    iget-object v0, p0, Lo/azo;->e:Lo/azt;

    if-eqz v0, :cond_0

    .line 344
    iget-object v0, p0, Lo/azo;->e:Lo/azt;

    invoke-interface {v0, p1}, Lo/azt;->e(Lorg/jivesoftware/smack/packet/Stanza;)V

    .line 346
    :cond_0
    return-void
.end method

.method private a(Lorg/jivesoftware/smack/packet/Stanza;Z)V
    .locals 4

    .line 263
    new-instance v2, Lo/azn;

    invoke-virtual {p1}, Lorg/jivesoftware/smack/packet/Stanza;->getStanzaId()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x3

    invoke-direct {v2, v0, p1, v1, p2}, Lo/azn;-><init>(Ljava/lang/String;Lorg/jivesoftware/smack/packet/Stanza;IZ)V

    .line 266
    iget-object v0, p0, Lo/azo;->a:Ljava/util/Map;

    invoke-virtual {v2}, Lo/azn;->h()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 269
    invoke-direct {p0, v2}, Lo/azo;->d(Lo/azn;)V

    .line 270
    invoke-direct {p0}, Lo/azo;->d()Lorg/jivesoftware/smack/XMPPConnection;

    move-result-object v3

    .line 271
    invoke-direct {p0, v3, v2}, Lo/azo;->a(Lorg/jivesoftware/smack/XMPPConnection;Lo/azn;)Z

    .line 272
    return-void
.end method

.method private a()Z
    .locals 7

    .line 211
    const/4 v4, 0x0

    .line 212
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    iget-wide v2, p0, Lo/azo;->d:J

    sub-long/2addr v0, v2

    const-wide/16 v2, 0x3e8

    div-long v5, v0, v2

    .line 213
    const-wide/16 v0, 0x1e

    cmp-long v0, v5, v0

    if-lez v0, :cond_0

    .line 215
    const/4 v4, 0x1

    .line 217
    :cond_0
    return v4
.end method

.method private a(Lo/azn;)Z
    .locals 4

    .line 159
    const/4 v3, 0x0

    .line 160
    invoke-virtual {p1}, Lo/azn;->c()Z

    move-result v0

    if-nez v0, :cond_0

    .line 163
    invoke-direct {p0, p1}, Lo/azo;->c(Lo/azn;)V

    .line 165
    invoke-virtual {p1}, Lo/azn;->b()Lorg/jivesoftware/smack/packet/Stanza;

    move-result-object v0

    invoke-direct {p0, v0}, Lo/azo;->a(Lorg/jivesoftware/smack/packet/Stanza;)V

    .line 166
    const-string v0, "PacketSender"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "PacketSendTask Timeout failed:"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/bpf;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 167
    const/4 v3, 0x1

    .line 169
    :cond_0
    return v3
.end method

.method private a(Lorg/jivesoftware/smack/XMPPConnection;Lo/azn;)Z
    .locals 5

    .line 447
    const/4 v3, 0x0

    .line 448
    if-eqz p1, :cond_4

    invoke-interface {p1}, Lorg/jivesoftware/smack/XMPPConnection;->isConnected()Z

    move-result v0

    if-eqz v0, :cond_4

    invoke-interface {p1}, Lorg/jivesoftware/smack/XMPPConnection;->isAuthenticated()Z

    move-result v0

    if-eqz v0, :cond_4

    .line 450
    invoke-virtual {p2}, Lo/azn;->d()V

    .line 451
    invoke-virtual {p2}, Lo/azn;->e()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 454
    invoke-static {}, Lo/baa;->e()Lo/baa;

    move-result-object v0

    invoke-virtual {p2}, Lo/azn;->h()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/baa;->b(Ljava/lang/String;)V

    .line 458
    :cond_0
    :try_start_0
    invoke-static {}, Lo/bpf;->c()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 460
    const-string v0, "PacketSender"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "sendPacketTask Smack connection send:"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/bpf;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 462
    :cond_1
    invoke-virtual {p2}, Lo/azn;->b()Lorg/jivesoftware/smack/packet/Stanza;

    move-result-object v0

    invoke-interface {p1, v0}, Lorg/jivesoftware/smack/XMPPConnection;->sendStanza(Lorg/jivesoftware/smack/packet/Stanza;)V

    .line 463
    invoke-virtual {p2}, Lo/azn;->e()Z

    move-result v0

    if-nez v0, :cond_2

    .line 466
    invoke-direct {p0, p2}, Lo/azo;->c(Lo/azn;)V

    .line 468
    :cond_2
    const/4 v3, 0x1

    .line 471
    invoke-interface {p1}, Lorg/jivesoftware/smack/XMPPConnection;->getLastStanzaReceived()J

    move-result-wide v0

    invoke-static {v0, v1}, Lo/azr;->d(J)Z

    move-result v0

    if-nez v0, :cond_3

    .line 473
    invoke-direct {p0}, Lo/azo;->c()V
    :try_end_0
    .catch Lorg/jivesoftware/smack/SmackException$NotConnectedException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_1

    .line 485
    :cond_3
    goto :goto_1

    .line 476
    :catch_0
    move-exception v4

    .line 478
    const-string v0, "PacketSender"

    const-string v1, "sendStanza meet NotConnectedException!"

    invoke-static {v0, v1}, Lo/bpf;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 479
    invoke-direct {p0}, Lo/azo;->c()V

    .line 485
    goto :goto_1

    .line 481
    :catch_1
    move-exception v4

    .line 483
    const-string v0, "PacketSender"

    const-string v1, "sendStanza meet InterruptedException!"

    invoke-static {v0, v1}, Lo/bpf;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 484
    invoke-direct {p0}, Lo/azo;->c()V

    .line 485
    goto :goto_1

    .line 490
    :cond_4
    const-string v0, "PacketSender"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "sendPacketTask failed! task:"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, ",connection is not ok.check null:"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    if-nez p1, :cond_5

    const/4 v2, 0x1

    goto :goto_0

    :cond_5
    const/4 v2, 0x0

    :goto_0
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/bpf;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 492
    invoke-direct {p0}, Lo/azo;->c()V

    .line 494
    :goto_1
    return v3
.end method

.method private b(Lo/azn;)V
    .locals 3

    .line 227
    const-string v0, "PacketSender"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "handleTimeoutTask():"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/bpf;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 228
    invoke-direct {p0, p1}, Lo/azo;->a(Lo/azn;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 231
    return-void

    .line 233
    :cond_0
    invoke-direct {p0}, Lo/azo;->d()Lorg/jivesoftware/smack/XMPPConnection;

    move-result-object v0

    invoke-direct {p0, v0, p1}, Lo/azo;->a(Lorg/jivesoftware/smack/XMPPConnection;Lo/azn;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 236
    invoke-virtual {p1}, Lo/azn;->d()V

    .line 239
    :cond_1
    invoke-direct {p0, p1}, Lo/azo;->d(Lo/azn;)V

    .line 240
    return-void
.end method

.method static synthetic b(Lo/azo;Lo/azn;)V
    .locals 0

    .line 27
    invoke-direct {p0, p1}, Lo/azo;->b(Lo/azn;)V

    return-void
.end method

.method static synthetic b(Lo/azo;Lorg/jivesoftware/smack/packet/Stanza;Z)V
    .locals 0

    .line 27
    invoke-direct {p0, p1, p2}, Lo/azo;->a(Lorg/jivesoftware/smack/packet/Stanza;Z)V

    return-void
.end method

.method private c()V
    .locals 2

    .line 190
    invoke-direct {p0}, Lo/azo;->a()Z

    move-result v0

    if-nez v0, :cond_0

    .line 193
    return-void

    .line 195
    :cond_0
    const-string v0, "PacketSender"

    const-string v1, "Packet send failed. trigger valid connection."

    invoke-static {v0, v1}, Lo/bpf;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 197
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    iput-wide v0, p0, Lo/azo;->d:J

    .line 198
    iget-object v0, p0, Lo/azo;->e:Lo/azt;

    if-eqz v0, :cond_1

    .line 200
    iget-object v0, p0, Lo/azo;->e:Lo/azt;

    invoke-interface {v0}, Lo/azt;->d()V

    .line 202
    :cond_1
    return-void
.end method

.method private c(Lo/azn;)V
    .locals 2

    .line 180
    iget-object v0, p0, Lo/azo;->a:Ljava/util/Map;

    invoke-virtual {p1}, Lo/azn;->h()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 181
    iget-object v0, p0, Lo/azo;->c:Landroid/os/Handler;

    const/4 v1, 0x0

    invoke-virtual {v0, v1, p1}, Landroid/os/Handler;->removeMessages(ILjava/lang/Object;)V

    .line 182
    invoke-static {}, Lo/baa;->e()Lo/baa;

    move-result-object v0

    invoke-virtual {p1}, Lo/azn;->h()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/baa;->e(Ljava/lang/String;)V

    .line 183
    return-void
.end method

.method private d()Lorg/jivesoftware/smack/XMPPConnection;
    .locals 1

    .line 393
    iget-object v0, p0, Lo/azo;->e:Lo/azt;

    if-eqz v0, :cond_0

    .line 395
    iget-object v0, p0, Lo/azo;->e:Lo/azt;

    invoke-interface {v0}, Lo/azt;->b()Lorg/jivesoftware/smack/XMPPConnection;

    move-result-object v0

    return-object v0

    .line 397
    :cond_0
    const/4 v0, 0x0

    return-object v0
.end method

.method private d(Lo/azn;)V
    .locals 5

    .line 249
    iget-object v0, p0, Lo/azo;->c:Landroid/os/Handler;

    const/4 v1, 0x0

    invoke-virtual {v0, v1, p1}, Landroid/os/Handler;->obtainMessage(ILjava/lang/Object;)Landroid/os/Message;

    move-result-object v4

    .line 250
    iget-object v0, p0, Lo/azo;->c:Landroid/os/Handler;

    .line 251
    invoke-static {}, Lo/baa;->e()Lo/baa;

    move-result-object v1

    invoke-virtual {p1}, Lo/azn;->k()Z

    move-result v2

    invoke-virtual {p1}, Lo/azn;->a()I

    move-result v3

    invoke-virtual {v1, v2, v3}, Lo/baa;->c(ZI)J

    move-result-wide v1

    .line 250
    invoke-virtual {v0, v4, v1, v2}, Landroid/os/Handler;->sendMessageDelayed(Landroid/os/Message;J)Z

    .line 252
    return-void
.end method

.method private e()V
    .locals 10

    .line 361
    iget-object v0, p0, Lo/azo;->a:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->size()I

    move-result v0

    if-eqz v0, :cond_1

    .line 364
    new-instance v4, Ljava/util/HashSet;

    invoke-direct {v4}, Ljava/util/HashSet;-><init>()V

    .line 365
    iget-object v0, p0, Lo/azo;->a:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->keySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v4, v0}, Ljava/util/Set;->addAll(Ljava/util/Collection;)Z

    .line 366
    invoke-direct {p0}, Lo/azo;->d()Lorg/jivesoftware/smack/XMPPConnection;

    move-result-object v5

    .line 368
    invoke-interface {v4}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v6

    :goto_0
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v7, v0

    check-cast v7, Ljava/lang/String;

    .line 370
    iget-object v0, p0, Lo/azo;->a:Ljava/util/Map;

    invoke-interface {v0, v7}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    move-object v8, v0

    check-cast v8, Lo/azn;

    .line 371
    if-eqz v8, :cond_0

    invoke-virtual {v8}, Lo/azn;->b()Lorg/jivesoftware/smack/packet/Stanza;

    move-result-object v0

    instance-of v0, v0, Lorg/jivesoftware/smack/packet/Message;

    if-eqz v0, :cond_0

    .line 374
    iget-object v0, p0, Lo/azo;->c:Landroid/os/Handler;

    const/4 v1, 0x0

    invoke-virtual {v0, v1, v8}, Landroid/os/Handler;->removeMessages(ILjava/lang/Object;)V

    .line 375
    iget-object v0, p0, Lo/azo;->c:Landroid/os/Handler;

    const/4 v1, 0x0

    invoke-virtual {v0, v1, v8}, Landroid/os/Handler;->obtainMessage(ILjava/lang/Object;)Landroid/os/Message;

    move-result-object v9

    .line 376
    iget-object v0, p0, Lo/azo;->c:Landroid/os/Handler;

    .line 377
    invoke-static {}, Lo/baa;->e()Lo/baa;

    move-result-object v1

    invoke-virtual {v8}, Lo/azn;->k()Z

    move-result v2

    invoke-virtual {v8}, Lo/azn;->a()I

    move-result v3

    invoke-virtual {v1, v2, v3}, Lo/baa;->c(ZI)J

    move-result-wide v1

    .line 376
    invoke-virtual {v0, v9, v1, v2}, Landroid/os/Handler;->sendMessageDelayed(Landroid/os/Message;J)Z

    .line 379
    invoke-direct {p0, v5, v8}, Lo/azo;->a(Lorg/jivesoftware/smack/XMPPConnection;Lo/azn;)Z

    .line 380
    const-string v0, "PacketSender"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "handleQuickSendMsg() login success and quick resend cache task:"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/bpf;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 382
    :cond_0
    goto/16 :goto_0

    .line 384
    :cond_1
    return-void
.end method

.method private e(Ljava/lang/String;)V
    .locals 3

    .line 308
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 310
    return-void

    .line 313
    :cond_0
    iget-object v0, p0, Lo/azo;->a:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Lo/azn;

    .line 314
    if-eqz v2, :cond_1

    .line 317
    iget-object v0, p0, Lo/azo;->c:Landroid/os/Handler;

    const/4 v1, 0x0

    invoke-virtual {v0, v1, v2}, Landroid/os/Handler;->removeMessages(ILjava/lang/Object;)V

    .line 319
    :cond_1
    return-void
.end method


# virtual methods
.method public b()V
    .locals 2

    .line 353
    iget-object v0, p0, Lo/azo;->c:Landroid/os/Handler;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/os/Handler;->sendEmptyMessage(I)Z

    .line 354
    return-void
.end method

.method public b(Lorg/jivesoftware/smack/packet/Stanza;)V
    .locals 3

    .line 294
    iget-object v0, p0, Lo/azo;->c:Landroid/os/Handler;

    if-eqz v0, :cond_0

    .line 296
    iget-object v0, p0, Lo/azo;->c:Landroid/os/Handler;

    iget-object v1, p0, Lo/azo;->c:Landroid/os/Handler;

    const/4 v2, 0x3

    invoke-virtual {v1, v2, p1}, Landroid/os/Handler;->obtainMessage(ILjava/lang/Object;)Landroid/os/Message;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    .line 298
    :cond_0
    return-void
.end method

.method public d(Lorg/jivesoftware/smack/packet/Stanza;)V
    .locals 2

    .line 328
    if-eqz p1, :cond_0

    .line 330
    invoke-virtual {p1}, Lorg/jivesoftware/smack/packet/Stanza;->getStanzaId()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v0}, Lo/azo;->e(Ljava/lang/String;)V

    .line 331
    invoke-static {}, Lo/baa;->e()Lo/baa;

    move-result-object v0

    invoke-virtual {p1}, Lorg/jivesoftware/smack/packet/Stanza;->getStanzaId()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/baa;->e(Ljava/lang/String;)V

    .line 333
    :cond_0
    return-void
.end method

.method public d(Z)V
    .locals 7

    .line 405
    iget-object v0, p0, Lo/azo;->a:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->size()I

    move-result v0

    if-gtz v0, :cond_0

    .line 407
    return-void

    .line 409
    :cond_0
    const-string v0, "PacketSender"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "clearIQAndResetMessage handle cache Resend Queue size:"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget-object v2, p0, Lo/azo;->a:Ljava/util/Map;

    invoke-interface {v2}, Ljava/util/Map;->size()I

    move-result v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/bpf;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 411
    new-instance v3, Ljava/util/HashSet;

    invoke-direct {v3}, Ljava/util/HashSet;-><init>()V

    .line 412
    iget-object v0, p0, Lo/azo;->a:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->keySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v3, v0}, Ljava/util/Set;->addAll(Ljava/util/Collection;)Z

    .line 414
    invoke-interface {v3}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :cond_1
    :goto_0
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_4

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v5, v0

    check-cast v5, Ljava/lang/String;

    .line 416
    iget-object v0, p0, Lo/azo;->a:Ljava/util/Map;

    invoke-interface {v0, v5}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    move-object v6, v0

    check-cast v6, Lo/azn;

    .line 417
    if-eqz v6, :cond_1

    iget-object v0, p0, Lo/azo;->c:Landroid/os/Handler;

    if-nez v0, :cond_2

    .line 420
    goto :goto_0

    .line 422
    :cond_2
    if-nez p1, :cond_3

    invoke-virtual {v6}, Lo/azn;->b()Lorg/jivesoftware/smack/packet/Stanza;

    move-result-object v0

    instance-of v0, v0, Lorg/jivesoftware/smack/packet/Message;

    if-eqz v0, :cond_3

    .line 425
    iget-object v0, p0, Lo/azo;->c:Landroid/os/Handler;

    const/4 v1, 0x0

    invoke-virtual {v0, v1, v6}, Landroid/os/Handler;->removeMessages(ILjava/lang/Object;)V

    .line 426
    invoke-direct {p0, v6}, Lo/azo;->d(Lo/azn;)V

    goto :goto_1

    .line 431
    :cond_3
    iget-object v0, p0, Lo/azo;->a:Ljava/util/Map;

    invoke-interface {v0, v5}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 432
    iget-object v0, p0, Lo/azo;->c:Landroid/os/Handler;

    const/4 v1, 0x0

    invoke-virtual {v0, v1, v6}, Landroid/os/Handler;->removeMessages(ILjava/lang/Object;)V

    .line 433
    invoke-virtual {v6}, Lo/azn;->b()Lorg/jivesoftware/smack/packet/Stanza;

    move-result-object v0

    invoke-direct {p0, v0}, Lo/azo;->a(Lorg/jivesoftware/smack/packet/Stanza;)V

    .line 434
    invoke-static {}, Lo/baa;->e()Lo/baa;

    move-result-object v0

    invoke-virtual {v0, v5}, Lo/baa;->c(Ljava/lang/String;)V

    .line 436
    :goto_1
    goto :goto_0

    .line 437
    :cond_4
    return-void
.end method

.method public e(Lorg/jivesoftware/smack/packet/Stanza;)V
    .locals 3

    .line 281
    iget-object v0, p0, Lo/azo;->c:Landroid/os/Handler;

    if-eqz v0, :cond_0

    .line 283
    iget-object v0, p0, Lo/azo;->c:Landroid/os/Handler;

    iget-object v1, p0, Lo/azo;->c:Landroid/os/Handler;

    const/4 v2, 0x2

    invoke-virtual {v1, v2, p1}, Landroid/os/Handler;->obtainMessage(ILjava/lang/Object;)Landroid/os/Message;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    .line 285
    :cond_0
    return-void
.end method
