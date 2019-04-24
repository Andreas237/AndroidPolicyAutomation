.class public Lorg/jivesoftware/smack/StanzaCollector;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lorg/jivesoftware/smack/StanzaCollector$Configuration;
    }
.end annotation


# instance fields
.field private cancelled:Z

.field private final collectorToReset:Lorg/jivesoftware/smack/StanzaCollector;

.field private final connection:Lorg/jivesoftware/smack/XMPPConnection;

.field private final packetFilter:Lorg/jivesoftware/smack/filter/StanzaFilter;

.field private final resultQueue:Ljava/util/concurrent/ArrayBlockingQueue;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/concurrent/ArrayBlockingQueue<Lorg/jivesoftware/smack/packet/Stanza;>;"
        }
    .end annotation
.end field

.field private volatile waitStart:J


# direct methods
.method protected constructor <init>(Lorg/jivesoftware/smack/XMPPConnection;Lorg/jivesoftware/smack/StanzaCollector$Configuration;)V
    .locals 2

    .line 65
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 56
    const/4 v0, 0x0

    iput-boolean v0, p0, Lorg/jivesoftware/smack/StanzaCollector;->cancelled:Z

    .line 66
    iput-object p1, p0, Lorg/jivesoftware/smack/StanzaCollector;->connection:Lorg/jivesoftware/smack/XMPPConnection;

    .line 67
    invoke-static {p2}, Lorg/jivesoftware/smack/StanzaCollector$Configuration;->access$000(Lorg/jivesoftware/smack/StanzaCollector$Configuration;)Lorg/jivesoftware/smack/filter/StanzaFilter;

    move-result-object v0

    iput-object v0, p0, Lorg/jivesoftware/smack/StanzaCollector;->packetFilter:Lorg/jivesoftware/smack/filter/StanzaFilter;

    .line 68
    new-instance v0, Ljava/util/concurrent/ArrayBlockingQueue;

    invoke-static {p2}, Lorg/jivesoftware/smack/StanzaCollector$Configuration;->access$100(Lorg/jivesoftware/smack/StanzaCollector$Configuration;)I

    move-result v1

    invoke-direct {v0, v1}, Ljava/util/concurrent/ArrayBlockingQueue;-><init>(I)V

    iput-object v0, p0, Lorg/jivesoftware/smack/StanzaCollector;->resultQueue:Ljava/util/concurrent/ArrayBlockingQueue;

    .line 69
    invoke-static {p2}, Lorg/jivesoftware/smack/StanzaCollector$Configuration;->access$200(Lorg/jivesoftware/smack/StanzaCollector$Configuration;)Lorg/jivesoftware/smack/StanzaCollector;

    move-result-object v0

    iput-object v0, p0, Lorg/jivesoftware/smack/StanzaCollector;->collectorToReset:Lorg/jivesoftware/smack/StanzaCollector;

    .line 70
    return-void
.end method

.method public static newConfiguration()Lorg/jivesoftware/smack/StanzaCollector$Configuration;
    .locals 2

    .line 303
    new-instance v0, Lorg/jivesoftware/smack/StanzaCollector$Configuration;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lorg/jivesoftware/smack/StanzaCollector$Configuration;-><init>(Lorg/jivesoftware/smack/StanzaCollector$4;)V

    return-object v0
.end method

.method private final throwIfCancelled()V
    .locals 2

    .line 292
    iget-boolean v0, p0, Lorg/jivesoftware/smack/StanzaCollector;->cancelled:Z

    if-eqz v0, :cond_0

    .line 293
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Packet collector already cancelled"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 295
    :cond_0
    return-void
.end method


# virtual methods
.method public cancel()V
    .locals 1

    .line 79
    iget-boolean v0, p0, Lorg/jivesoftware/smack/StanzaCollector;->cancelled:Z

    if-nez v0, :cond_0

    .line 80
    const/4 v0, 0x1

    iput-boolean v0, p0, Lorg/jivesoftware/smack/StanzaCollector;->cancelled:Z

    .line 81
    iget-object v0, p0, Lorg/jivesoftware/smack/StanzaCollector;->connection:Lorg/jivesoftware/smack/XMPPConnection;

    invoke-interface {v0, p0}, Lorg/jivesoftware/smack/XMPPConnection;->removeStanzaCollector(Lorg/jivesoftware/smack/StanzaCollector;)V

    .line 83
    :cond_0
    return-void
.end method

.method public getCollectedCount()I
    .locals 1

    .line 268
    iget-object v0, p0, Lorg/jivesoftware/smack/StanzaCollector;->resultQueue:Ljava/util/concurrent/ArrayBlockingQueue;

    invoke-virtual {v0}, Ljava/util/concurrent/ArrayBlockingQueue;->size()I

    move-result v0

    return v0
.end method

.method public getPacketFilter()Lorg/jivesoftware/smack/filter/StanzaFilter;
    .locals 1
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 94
    invoke-virtual {p0}, Lorg/jivesoftware/smack/StanzaCollector;->getStanzaFilter()Lorg/jivesoftware/smack/filter/StanzaFilter;

    move-result-object v0

    return-object v0
.end method

.method public getStanzaFilter()Lorg/jivesoftware/smack/filter/StanzaFilter;
    .locals 1

    .line 104
    iget-object v0, p0, Lorg/jivesoftware/smack/StanzaCollector;->packetFilter:Lorg/jivesoftware/smack/filter/StanzaFilter;

    return-object v0
.end method

.method public nextResult()Lorg/jivesoftware/smack/packet/Stanza;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<P:Lorg/jivesoftware/smack/packet/Stanza;>()TP;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/InterruptedException;
        }
    .end annotation

    .line 164
    iget-object v0, p0, Lorg/jivesoftware/smack/StanzaCollector;->connection:Lorg/jivesoftware/smack/XMPPConnection;

    invoke-interface {v0}, Lorg/jivesoftware/smack/XMPPConnection;->getReplyTimeout()J

    move-result-wide v0

    invoke-virtual {p0, v0, v1}, Lorg/jivesoftware/smack/StanzaCollector;->nextResult(J)Lorg/jivesoftware/smack/packet/Stanza;

    move-result-object v0

    return-object v0
.end method

.method public nextResult(J)Lorg/jivesoftware/smack/packet/Stanza;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<P:Lorg/jivesoftware/smack/packet/Stanza;>(J)TP;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/InterruptedException;
        }
    .end annotation

    .line 180
    invoke-direct {p0}, Lorg/jivesoftware/smack/StanzaCollector;->throwIfCancelled()V

    .line 181
    const/4 v4, 0x0

    .line 182
    move-wide v5, p1

    .line 183
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    iput-wide v0, p0, Lorg/jivesoftware/smack/StanzaCollector;->waitStart:J

    .line 185
    :cond_0
    iget-object v0, p0, Lorg/jivesoftware/smack/StanzaCollector;->resultQueue:Ljava/util/concurrent/ArrayBlockingQueue;

    sget-object v1, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    invoke-virtual {v0, v5, v6, v1}, Ljava/util/concurrent/ArrayBlockingQueue;->poll(JLjava/util/concurrent/TimeUnit;)Ljava/lang/Object;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Lorg/jivesoftware/smack/packet/Stanza;

    .line 186
    if-eqz v4, :cond_1

    .line 187
    return-object v4

    .line 189
    :cond_1
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    iget-wide v2, p0, Lorg/jivesoftware/smack/StanzaCollector;->waitStart:J

    sub-long/2addr v0, v2

    sub-long v5, p1, v0

    .line 190
    const-wide/16 v0, 0x0

    cmp-long v0, v5, v0

    if-gtz v0, :cond_0

    .line 191
    const/4 v0, 0x0

    return-object v0
.end method

.method public nextResultBlockForever()Lorg/jivesoftware/smack/packet/Stanza;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<P:Lorg/jivesoftware/smack/packet/Stanza;>()TP;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/InterruptedException;
        }
    .end annotation

    .line 148
    invoke-direct {p0}, Lorg/jivesoftware/smack/StanzaCollector;->throwIfCancelled()V

    .line 149
    const/4 v1, 0x0

    .line 150
    :goto_0
    if-nez v1, :cond_0

    .line 151
    iget-object v0, p0, Lorg/jivesoftware/smack/StanzaCollector;->resultQueue:Ljava/util/concurrent/ArrayBlockingQueue;

    invoke-virtual {v0}, Ljava/util/concurrent/ArrayBlockingQueue;->take()Ljava/lang/Object;

    move-result-object v0

    move-object v1, v0

    check-cast v1, Lorg/jivesoftware/smack/packet/Stanza;

    goto :goto_0

    .line 153
    :cond_0
    return-object v1
.end method

.method public nextResultOrThrow()Lorg/jivesoftware/smack/packet/Stanza;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<P:Lorg/jivesoftware/smack/packet/Stanza;>()TP;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/jivesoftware/smack/SmackException$NoResponseException;,
            Lorg/jivesoftware/smack/XMPPException$XMPPErrorException;,
            Ljava/lang/InterruptedException;,
            Lorg/jivesoftware/smack/SmackException$NotConnectedException;
        }
    .end annotation

    .line 208
    iget-object v0, p0, Lorg/jivesoftware/smack/StanzaCollector;->connection:Lorg/jivesoftware/smack/XMPPConnection;

    invoke-interface {v0}, Lorg/jivesoftware/smack/XMPPConnection;->getReplyTimeout()J

    move-result-wide v0

    invoke-virtual {p0, v0, v1}, Lorg/jivesoftware/smack/StanzaCollector;->nextResultOrThrow(J)Lorg/jivesoftware/smack/packet/Stanza;

    move-result-object v0

    return-object v0
.end method

.method public nextResultOrThrow(J)Lorg/jivesoftware/smack/packet/Stanza;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<P:Lorg/jivesoftware/smack/packet/Stanza;>(J)TP;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/jivesoftware/smack/SmackException$NoResponseException;,
            Lorg/jivesoftware/smack/XMPPException$XMPPErrorException;,
            Ljava/lang/InterruptedException;,
            Lorg/jivesoftware/smack/SmackException$NotConnectedException;
        }
    .end annotation

    .line 247
    invoke-virtual {p0, p1, p2}, Lorg/jivesoftware/smack/StanzaCollector;->nextResult(J)Lorg/jivesoftware/smack/packet/Stanza;

    move-result-object v3

    .line 248
    invoke-virtual {p0}, Lorg/jivesoftware/smack/StanzaCollector;->cancel()V

    .line 249
    if-nez v3, :cond_1

    .line 250
    iget-object v0, p0, Lorg/jivesoftware/smack/StanzaCollector;->connection:Lorg/jivesoftware/smack/XMPPConnection;

    invoke-interface {v0}, Lorg/jivesoftware/smack/XMPPConnection;->isConnected()Z

    move-result v0

    if-nez v0, :cond_0

    .line 251
    new-instance v0, Lorg/jivesoftware/smack/SmackException$NotConnectedException;

    iget-object v1, p0, Lorg/jivesoftware/smack/StanzaCollector;->connection:Lorg/jivesoftware/smack/XMPPConnection;

    iget-object v2, p0, Lorg/jivesoftware/smack/StanzaCollector;->packetFilter:Lorg/jivesoftware/smack/filter/StanzaFilter;

    invoke-direct {v0, v1, v2}, Lorg/jivesoftware/smack/SmackException$NotConnectedException;-><init>(Lorg/jivesoftware/smack/XMPPConnection;Lorg/jivesoftware/smack/filter/StanzaFilter;)V

    throw v0

    .line 253
    :cond_0
    iget-object v0, p0, Lorg/jivesoftware/smack/StanzaCollector;->connection:Lorg/jivesoftware/smack/XMPPConnection;

    invoke-static {v0, p0}, Lorg/jivesoftware/smack/SmackException$NoResponseException;->newWith(Lorg/jivesoftware/smack/XMPPConnection;Lorg/jivesoftware/smack/StanzaCollector;)Lorg/jivesoftware/smack/SmackException$NoResponseException;

    move-result-object v0

    throw v0

    .line 256
    :cond_1
    invoke-static {v3}, Lorg/jivesoftware/smack/XMPPException$XMPPErrorException;->ifHasErrorThenThrow(Lorg/jivesoftware/smack/packet/Stanza;)V

    .line 258
    return-object v3
.end method

.method public pollResult()Lorg/jivesoftware/smack/packet/Stanza;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<P:Lorg/jivesoftware/smack/packet/Stanza;>()TP;"
        }
    .end annotation

    .line 117
    iget-object v0, p0, Lorg/jivesoftware/smack/StanzaCollector;->resultQueue:Ljava/util/concurrent/ArrayBlockingQueue;

    invoke-virtual {v0}, Ljava/util/concurrent/ArrayBlockingQueue;->poll()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lorg/jivesoftware/smack/packet/Stanza;

    return-object v0
.end method

.method public pollResultOrThrow()Lorg/jivesoftware/smack/packet/Stanza;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<P:Lorg/jivesoftware/smack/packet/Stanza;>()TP;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/jivesoftware/smack/XMPPException$XMPPErrorException;
        }
    .end annotation

    .line 132
    invoke-virtual {p0}, Lorg/jivesoftware/smack/StanzaCollector;->pollResult()Lorg/jivesoftware/smack/packet/Stanza;

    move-result-object v0

    .line 133
    if-eqz v0, :cond_0

    .line 134
    invoke-static {v0}, Lorg/jivesoftware/smack/XMPPException$XMPPErrorException;->ifHasErrorThenThrow(Lorg/jivesoftware/smack/packet/Stanza;)V

    .line 136
    :cond_0
    return-object v0
.end method

.method protected processStanza(Lorg/jivesoftware/smack/packet/Stanza;)V
    .locals 3

    .line 278
    iget-object v0, p0, Lorg/jivesoftware/smack/StanzaCollector;->packetFilter:Lorg/jivesoftware/smack/filter/StanzaFilter;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lorg/jivesoftware/smack/StanzaCollector;->packetFilter:Lorg/jivesoftware/smack/filter/StanzaFilter;

    invoke-interface {v0, p1}, Lorg/jivesoftware/smack/filter/StanzaFilter;->accept(Lorg/jivesoftware/smack/packet/Stanza;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 280
    :cond_0
    :goto_0
    iget-object v0, p0, Lorg/jivesoftware/smack/StanzaCollector;->resultQueue:Ljava/util/concurrent/ArrayBlockingQueue;

    invoke-virtual {v0, p1}, Ljava/util/concurrent/ArrayBlockingQueue;->offer(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 282
    iget-object v0, p0, Lorg/jivesoftware/smack/StanzaCollector;->resultQueue:Ljava/util/concurrent/ArrayBlockingQueue;

    invoke-virtual {v0}, Ljava/util/concurrent/ArrayBlockingQueue;->poll()Ljava/lang/Object;

    goto :goto_0

    .line 285
    :cond_1
    iget-object v0, p0, Lorg/jivesoftware/smack/StanzaCollector;->collectorToReset:Lorg/jivesoftware/smack/StanzaCollector;

    if-eqz v0, :cond_2

    .line 286
    iget-object v0, p0, Lorg/jivesoftware/smack/StanzaCollector;->collectorToReset:Lorg/jivesoftware/smack/StanzaCollector;

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v1

    iput-wide v1, v0, Lorg/jivesoftware/smack/StanzaCollector;->waitStart:J

    .line 289
    :cond_2
    return-void
.end method
