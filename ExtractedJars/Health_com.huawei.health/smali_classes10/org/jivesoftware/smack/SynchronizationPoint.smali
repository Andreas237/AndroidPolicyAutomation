.class public Lorg/jivesoftware/smack/SynchronizationPoint;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lorg/jivesoftware/smack/SynchronizationPoint$e;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<E:Ljava/lang/Exception;>Ljava/lang/Object;"
    }
.end annotation


# static fields
.field static final synthetic $assertionsDisabled:Z


# instance fields
.field private final condition:Ljava/util/concurrent/locks/Condition;

.field private final connection:Lorg/jivesoftware/smack/AbstractXMPPConnection;

.field private final connectionLock:Ljava/util/concurrent/locks/Lock;

.field private failureException:Ljava/lang/Exception;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "TE;"
        }
    .end annotation
.end field

.field private state:Lorg/jivesoftware/smack/SynchronizationPoint$e;

.field private final waitFor:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 29
    const-class v0, Lorg/jivesoftware/smack/SynchronizationPoint;

    invoke-virtual {v0}, Ljava/lang/Class;->desiredAssertionStatus()Z

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    sput-boolean v0, Lorg/jivesoftware/smack/SynchronizationPoint;->$assertionsDisabled:Z

    return-void
.end method

.method public constructor <init>(Lorg/jivesoftware/smack/AbstractXMPPConnection;Ljava/lang/String;)V
    .locals 1

    .line 47
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 48
    iput-object p1, p0, Lorg/jivesoftware/smack/SynchronizationPoint;->connection:Lorg/jivesoftware/smack/AbstractXMPPConnection;

    .line 49
    invoke-virtual {p1}, Lorg/jivesoftware/smack/AbstractXMPPConnection;->getConnectionLock()Ljava/util/concurrent/locks/Lock;

    move-result-object v0

    iput-object v0, p0, Lorg/jivesoftware/smack/SynchronizationPoint;->connectionLock:Ljava/util/concurrent/locks/Lock;

    .line 50
    invoke-virtual {p1}, Lorg/jivesoftware/smack/AbstractXMPPConnection;->getConnectionLock()Ljava/util/concurrent/locks/Lock;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/concurrent/locks/Lock;->newCondition()Ljava/util/concurrent/locks/Condition;

    move-result-object v0

    iput-object v0, p0, Lorg/jivesoftware/smack/SynchronizationPoint;->condition:Ljava/util/concurrent/locks/Condition;

    .line 51
    iput-object p2, p0, Lorg/jivesoftware/smack/SynchronizationPoint;->waitFor:Ljava/lang/String;

    .line 52
    invoke-virtual {p0}, Lorg/jivesoftware/smack/SynchronizationPoint;->init()V

    .line 53
    return-void
.end method

.method private checkForResponse()Ljava/lang/Exception;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()TE;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/jivesoftware/smack/SmackException$NoResponseException;
        }
    .end annotation

    .line 256
    sget-object v0, Lorg/jivesoftware/smack/SynchronizationPoint$3;->e:[I

    iget-object v1, p0, Lorg/jivesoftware/smack/SynchronizationPoint;->state:Lorg/jivesoftware/smack/SynchronizationPoint$e;

    invoke-virtual {v1}, Lorg/jivesoftware/smack/SynchronizationPoint$e;->ordinal()I

    move-result v1

    aget v0, v0, v1

    packed-switch v0, :pswitch_data_0

    goto :goto_0

    .line 260
    :pswitch_0
    iget-object v0, p0, Lorg/jivesoftware/smack/SynchronizationPoint;->connection:Lorg/jivesoftware/smack/AbstractXMPPConnection;

    iget-object v1, p0, Lorg/jivesoftware/smack/SynchronizationPoint;->waitFor:Ljava/lang/String;

    invoke-static {v0, v1}, Lorg/jivesoftware/smack/SmackException$NoResponseException;->newWith(Lorg/jivesoftware/smack/XMPPConnection;Ljava/lang/String;)Lorg/jivesoftware/smack/SmackException$NoResponseException;

    move-result-object v0

    throw v0

    .line 262
    :pswitch_1
    const/4 v0, 0x0

    return-object v0

    .line 264
    :pswitch_2
    iget-object v0, p0, Lorg/jivesoftware/smack/SynchronizationPoint;->failureException:Ljava/lang/Exception;

    return-object v0

    .line 266
    :goto_0
    new-instance v0, Ljava/lang/AssertionError;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Unknown state "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget-object v2, p0, Lorg/jivesoftware/smack/SynchronizationPoint;->state:Lorg/jivesoftware/smack/SynchronizationPoint$e;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/AssertionError;-><init>(Ljava/lang/Object;)V

    throw v0

    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_2
        :pswitch_1
        :pswitch_0
        :pswitch_0
        :pswitch_0
    .end packed-switch
.end method

.method private waitForConditionOrTimeout()V
    .locals 5
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/InterruptedException;
        }
    .end annotation

    .line 237
    sget-object v0, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    iget-object v1, p0, Lorg/jivesoftware/smack/SynchronizationPoint;->connection:Lorg/jivesoftware/smack/AbstractXMPPConnection;

    invoke-virtual {v1}, Lorg/jivesoftware/smack/AbstractXMPPConnection;->getReplyTimeout()J

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, Ljava/util/concurrent/TimeUnit;->toNanos(J)J

    move-result-wide v3

    .line 238
    :goto_0
    iget-object v0, p0, Lorg/jivesoftware/smack/SynchronizationPoint;->state:Lorg/jivesoftware/smack/SynchronizationPoint$e;

    sget-object v1, Lorg/jivesoftware/smack/SynchronizationPoint$e;->e:Lorg/jivesoftware/smack/SynchronizationPoint$e;

    if-eq v0, v1, :cond_0

    iget-object v0, p0, Lorg/jivesoftware/smack/SynchronizationPoint;->state:Lorg/jivesoftware/smack/SynchronizationPoint$e;

    sget-object v1, Lorg/jivesoftware/smack/SynchronizationPoint$e;->c:Lorg/jivesoftware/smack/SynchronizationPoint$e;

    if-ne v0, v1, :cond_2

    .line 239
    :cond_0
    const-wide/16 v0, 0x0

    cmp-long v0, v3, v0

    if-gtz v0, :cond_1

    .line 240
    sget-object v0, Lorg/jivesoftware/smack/SynchronizationPoint$e;->d:Lorg/jivesoftware/smack/SynchronizationPoint$e;

    iput-object v0, p0, Lorg/jivesoftware/smack/SynchronizationPoint;->state:Lorg/jivesoftware/smack/SynchronizationPoint$e;

    .line 241
    goto :goto_1

    .line 243
    :cond_1
    iget-object v0, p0, Lorg/jivesoftware/smack/SynchronizationPoint;->condition:Ljava/util/concurrent/locks/Condition;

    invoke-interface {v0, v3, v4}, Ljava/util/concurrent/locks/Condition;->awaitNanos(J)J

    move-result-wide v3

    goto :goto_0

    .line 245
    :cond_2
    :goto_1
    return-void
.end method


# virtual methods
.method public checkIfSuccessOrWait()Ljava/lang/Exception;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()TE;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/jivesoftware/smack/SmackException$NoResponseException;,
            Ljava/lang/InterruptedException;
        }
    .end annotation

    .line 139
    iget-object v0, p0, Lorg/jivesoftware/smack/SynchronizationPoint;->connectionLock:Ljava/util/concurrent/locks/Lock;

    invoke-interface {v0}, Ljava/util/concurrent/locks/Lock;->lock()V

    .line 141
    :try_start_0
    sget-object v0, Lorg/jivesoftware/smack/SynchronizationPoint$3;->e:[I

    iget-object v1, p0, Lorg/jivesoftware/smack/SynchronizationPoint;->state:Lorg/jivesoftware/smack/SynchronizationPoint$e;

    invoke-virtual {v1}, Lorg/jivesoftware/smack/SynchronizationPoint$e;->ordinal()I

    move-result v1

    aget v0, v0, v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    sparse-switch v0, :sswitch_data_0

    goto :goto_0

    .line 144
    :sswitch_0
    const/4 v2, 0x0

    .line 153
    iget-object v0, p0, Lorg/jivesoftware/smack/SynchronizationPoint;->connectionLock:Ljava/util/concurrent/locks/Lock;

    invoke-interface {v0}, Ljava/util/concurrent/locks/Lock;->unlock()V

    .line 144
    return-object v2

    .line 146
    :sswitch_1
    :try_start_1
    iget-object v2, p0, Lorg/jivesoftware/smack/SynchronizationPoint;->failureException:Ljava/lang/Exception;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 153
    iget-object v0, p0, Lorg/jivesoftware/smack/SynchronizationPoint;->connectionLock:Ljava/util/concurrent/locks/Lock;

    invoke-interface {v0}, Ljava/util/concurrent/locks/Lock;->unlock()V

    .line 146
    return-object v2

    .line 151
    :goto_0
    :try_start_2
    invoke-direct {p0}, Lorg/jivesoftware/smack/SynchronizationPoint;->waitForConditionOrTimeout()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 153
    iget-object v0, p0, Lorg/jivesoftware/smack/SynchronizationPoint;->connectionLock:Ljava/util/concurrent/locks/Lock;

    invoke-interface {v0}, Ljava/util/concurrent/locks/Lock;->unlock()V

    .line 154
    goto :goto_1

    .line 153
    :catchall_0
    move-exception v3

    iget-object v0, p0, Lorg/jivesoftware/smack/SynchronizationPoint;->connectionLock:Ljava/util/concurrent/locks/Lock;

    invoke-interface {v0}, Ljava/util/concurrent/locks/Lock;->unlock()V

    .line 154
    throw v3

    .line 155
    :goto_1
    invoke-direct {p0}, Lorg/jivesoftware/smack/SynchronizationPoint;->checkForResponse()Ljava/lang/Exception;

    move-result-object v0

    return-object v0

    nop

    :sswitch_data_0
    .sparse-switch
        0x1 -> :sswitch_1
        0x2 -> :sswitch_0
    .end sparse-switch
.end method

.method public checkIfSuccessOrWaitOrThrow()V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V^Lorg/jivesoftware/smack/SmackException$NoResponseException;^TE;^Ljava/lang/InterruptedException;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/jivesoftware/smack/SmackException$NoResponseException;,
            Ljava/lang/Exception;,
            Ljava/lang/InterruptedException;
        }
    .end annotation

    .line 126
    invoke-virtual {p0}, Lorg/jivesoftware/smack/SynchronizationPoint;->checkIfSuccessOrWait()Ljava/lang/Exception;

    .line 127
    iget-object v0, p0, Lorg/jivesoftware/smack/SynchronizationPoint;->state:Lorg/jivesoftware/smack/SynchronizationPoint$e;

    sget-object v1, Lorg/jivesoftware/smack/SynchronizationPoint$e;->a:Lorg/jivesoftware/smack/SynchronizationPoint$e;

    if-ne v0, v1, :cond_0

    .line 128
    iget-object v0, p0, Lorg/jivesoftware/smack/SynchronizationPoint;->failureException:Ljava/lang/Exception;

    throw v0

    .line 130
    :cond_0
    return-void
.end method

.method public final init()V
    .locals 1

    .line 59
    iget-object v0, p0, Lorg/jivesoftware/smack/SynchronizationPoint;->connectionLock:Ljava/util/concurrent/locks/Lock;

    invoke-interface {v0}, Ljava/util/concurrent/locks/Lock;->lock()V

    .line 60
    sget-object v0, Lorg/jivesoftware/smack/SynchronizationPoint$e;->c:Lorg/jivesoftware/smack/SynchronizationPoint$e;

    iput-object v0, p0, Lorg/jivesoftware/smack/SynchronizationPoint;->state:Lorg/jivesoftware/smack/SynchronizationPoint$e;

    .line 61
    const/4 v0, 0x0

    iput-object v0, p0, Lorg/jivesoftware/smack/SynchronizationPoint;->failureException:Ljava/lang/Exception;

    .line 62
    iget-object v0, p0, Lorg/jivesoftware/smack/SynchronizationPoint;->connectionLock:Ljava/util/concurrent/locks/Lock;

    invoke-interface {v0}, Ljava/util/concurrent/locks/Lock;->unlock()V

    .line 63
    return-void
.end method

.method public reportFailure()V
    .locals 1
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 178
    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lorg/jivesoftware/smack/SynchronizationPoint;->reportFailure(Ljava/lang/Exception;)V

    .line 179
    return-void
.end method

.method public reportFailure(Ljava/lang/Exception;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TE;)V"
        }
    .end annotation

    .line 187
    sget-boolean v0, Lorg/jivesoftware/smack/SynchronizationPoint;->$assertionsDisabled:Z

    if-nez v0, :cond_0

    if-nez p1, :cond_0

    new-instance v0, Ljava/lang/AssertionError;

    invoke-direct {v0}, Ljava/lang/AssertionError;-><init>()V

    throw v0

    .line 188
    :cond_0
    iget-object v0, p0, Lorg/jivesoftware/smack/SynchronizationPoint;->connectionLock:Ljava/util/concurrent/locks/Lock;

    invoke-interface {v0}, Ljava/util/concurrent/locks/Lock;->lock()V

    .line 190
    :try_start_0
    sget-object v0, Lorg/jivesoftware/smack/SynchronizationPoint$e;->a:Lorg/jivesoftware/smack/SynchronizationPoint$e;

    iput-object v0, p0, Lorg/jivesoftware/smack/SynchronizationPoint;->state:Lorg/jivesoftware/smack/SynchronizationPoint$e;

    .line 191
    iput-object p1, p0, Lorg/jivesoftware/smack/SynchronizationPoint;->failureException:Ljava/lang/Exception;

    .line 192
    iget-object v0, p0, Lorg/jivesoftware/smack/SynchronizationPoint;->condition:Ljava/util/concurrent/locks/Condition;

    invoke-interface {v0}, Ljava/util/concurrent/locks/Condition;->signalAll()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 195
    iget-object v0, p0, Lorg/jivesoftware/smack/SynchronizationPoint;->connectionLock:Ljava/util/concurrent/locks/Lock;

    invoke-interface {v0}, Ljava/util/concurrent/locks/Lock;->unlock()V

    .line 196
    goto :goto_0

    .line 195
    :catchall_0
    move-exception v1

    iget-object v0, p0, Lorg/jivesoftware/smack/SynchronizationPoint;->connectionLock:Ljava/util/concurrent/locks/Lock;

    invoke-interface {v0}, Ljava/util/concurrent/locks/Lock;->unlock()V

    .line 196
    throw v1

    .line 197
    :goto_0
    return-void
.end method

.method public reportSuccess()V
    .locals 2

    .line 162
    iget-object v0, p0, Lorg/jivesoftware/smack/SynchronizationPoint;->connectionLock:Ljava/util/concurrent/locks/Lock;

    invoke-interface {v0}, Ljava/util/concurrent/locks/Lock;->lock()V

    .line 164
    :try_start_0
    sget-object v0, Lorg/jivesoftware/smack/SynchronizationPoint$e;->b:Lorg/jivesoftware/smack/SynchronizationPoint$e;

    iput-object v0, p0, Lorg/jivesoftware/smack/SynchronizationPoint;->state:Lorg/jivesoftware/smack/SynchronizationPoint$e;

    .line 165
    iget-object v0, p0, Lorg/jivesoftware/smack/SynchronizationPoint;->condition:Ljava/util/concurrent/locks/Condition;

    invoke-interface {v0}, Ljava/util/concurrent/locks/Condition;->signalAll()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 168
    iget-object v0, p0, Lorg/jivesoftware/smack/SynchronizationPoint;->connectionLock:Ljava/util/concurrent/locks/Lock;

    invoke-interface {v0}, Ljava/util/concurrent/locks/Lock;->unlock()V

    .line 169
    goto :goto_0

    .line 168
    :catchall_0
    move-exception v1

    iget-object v0, p0, Lorg/jivesoftware/smack/SynchronizationPoint;->connectionLock:Ljava/util/concurrent/locks/Lock;

    invoke-interface {v0}, Ljava/util/concurrent/locks/Lock;->unlock()V

    .line 169
    throw v1

    .line 170
    :goto_0
    return-void
.end method

.method public requestSent()Z
    .locals 4

    .line 220
    iget-object v0, p0, Lorg/jivesoftware/smack/SynchronizationPoint;->connectionLock:Ljava/util/concurrent/locks/Lock;

    invoke-interface {v0}, Ljava/util/concurrent/locks/Lock;->lock()V

    .line 222
    :try_start_0
    iget-object v0, p0, Lorg/jivesoftware/smack/SynchronizationPoint;->state:Lorg/jivesoftware/smack/SynchronizationPoint$e;

    sget-object v1, Lorg/jivesoftware/smack/SynchronizationPoint$e;->e:Lorg/jivesoftware/smack/SynchronizationPoint$e;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-ne v0, v1, :cond_0

    const/4 v2, 0x1

    goto :goto_0

    :cond_0
    const/4 v2, 0x0

    .line 225
    :goto_0
    iget-object v0, p0, Lorg/jivesoftware/smack/SynchronizationPoint;->connectionLock:Ljava/util/concurrent/locks/Lock;

    invoke-interface {v0}, Ljava/util/concurrent/locks/Lock;->unlock()V

    .line 222
    return v2

    .line 225
    :catchall_0
    move-exception v3

    iget-object v0, p0, Lorg/jivesoftware/smack/SynchronizationPoint;->connectionLock:Ljava/util/concurrent/locks/Lock;

    invoke-interface {v0}, Ljava/util/concurrent/locks/Lock;->unlock()V

    .line 226
    throw v3
.end method

.method public sendAndWaitForResponse(Lorg/jivesoftware/smack/packet/TopLevelStreamElement;)Ljava/lang/Exception;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Lorg/jivesoftware/smack/packet/TopLevelStreamElement;)TE;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/jivesoftware/smack/SmackException$NoResponseException;,
            Lorg/jivesoftware/smack/SmackException$NotConnectedException;,
            Ljava/lang/InterruptedException;
        }
    .end annotation

    .line 75
    sget-boolean v0, Lorg/jivesoftware/smack/SynchronizationPoint;->$assertionsDisabled:Z

    if-nez v0, :cond_0

    iget-object v0, p0, Lorg/jivesoftware/smack/SynchronizationPoint;->state:Lorg/jivesoftware/smack/SynchronizationPoint$e;

    sget-object v1, Lorg/jivesoftware/smack/SynchronizationPoint$e;->c:Lorg/jivesoftware/smack/SynchronizationPoint$e;

    if-eq v0, v1, :cond_0

    new-instance v0, Ljava/lang/AssertionError;

    invoke-direct {v0}, Ljava/lang/AssertionError;-><init>()V

    throw v0

    .line 76
    :cond_0
    iget-object v0, p0, Lorg/jivesoftware/smack/SynchronizationPoint;->connectionLock:Ljava/util/concurrent/locks/Lock;

    invoke-interface {v0}, Ljava/util/concurrent/locks/Lock;->lock()V

    .line 78
    if-eqz p1, :cond_3

    .line 79
    instance-of v0, p1, Lorg/jivesoftware/smack/packet/Stanza;

    if-eqz v0, :cond_1

    .line 80
    :try_start_0
    iget-object v0, p0, Lorg/jivesoftware/smack/SynchronizationPoint;->connection:Lorg/jivesoftware/smack/AbstractXMPPConnection;

    move-object v1, p1

    check-cast v1, Lorg/jivesoftware/smack/packet/Stanza;

    invoke-virtual {v0, v1}, Lorg/jivesoftware/smack/AbstractXMPPConnection;->sendStanza(Lorg/jivesoftware/smack/packet/Stanza;)V

    goto :goto_0

    .line 82
    :cond_1
    instance-of v0, p1, Lorg/jivesoftware/smack/packet/Nonza;

    if-eqz v0, :cond_2

    .line 83
    iget-object v0, p0, Lorg/jivesoftware/smack/SynchronizationPoint;->connection:Lorg/jivesoftware/smack/AbstractXMPPConnection;

    move-object v1, p1

    check-cast v1, Lorg/jivesoftware/smack/packet/Nonza;

    invoke-virtual {v0, v1}, Lorg/jivesoftware/smack/AbstractXMPPConnection;->sendNonza(Lorg/jivesoftware/smack/packet/Nonza;)V

    goto :goto_0

    .line 85
    :cond_2
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Unsupported element type"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 87
    :goto_0
    sget-object v0, Lorg/jivesoftware/smack/SynchronizationPoint$e;->e:Lorg/jivesoftware/smack/SynchronizationPoint$e;

    iput-object v0, p0, Lorg/jivesoftware/smack/SynchronizationPoint;->state:Lorg/jivesoftware/smack/SynchronizationPoint$e;

    .line 89
    :cond_3
    invoke-direct {p0}, Lorg/jivesoftware/smack/SynchronizationPoint;->waitForConditionOrTimeout()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 92
    iget-object v0, p0, Lorg/jivesoftware/smack/SynchronizationPoint;->connectionLock:Ljava/util/concurrent/locks/Lock;

    invoke-interface {v0}, Ljava/util/concurrent/locks/Lock;->unlock()V

    .line 93
    goto :goto_1

    .line 92
    :catchall_0
    move-exception v2

    iget-object v0, p0, Lorg/jivesoftware/smack/SynchronizationPoint;->connectionLock:Ljava/util/concurrent/locks/Lock;

    invoke-interface {v0}, Ljava/util/concurrent/locks/Lock;->unlock()V

    .line 93
    throw v2

    .line 94
    :goto_1
    invoke-direct {p0}, Lorg/jivesoftware/smack/SynchronizationPoint;->checkForResponse()Ljava/lang/Exception;

    move-result-object v0

    return-object v0
.end method

.method public sendAndWaitForResponseOrThrow(Lorg/jivesoftware/smack/packet/Nonza;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Lorg/jivesoftware/smack/packet/Nonza;)V^TE;^Lorg/jivesoftware/smack/SmackException$NoResponseException;^Lorg/jivesoftware/smack/SmackException$NotConnectedException;^Ljava/lang/InterruptedException;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;,
            Lorg/jivesoftware/smack/SmackException$NoResponseException;,
            Lorg/jivesoftware/smack/SmackException$NotConnectedException;,
            Ljava/lang/InterruptedException;
        }
    .end annotation

    .line 107
    invoke-virtual {p0, p1}, Lorg/jivesoftware/smack/SynchronizationPoint;->sendAndWaitForResponse(Lorg/jivesoftware/smack/packet/TopLevelStreamElement;)Ljava/lang/Exception;

    .line 108
    sget-object v0, Lorg/jivesoftware/smack/SynchronizationPoint$3;->e:[I

    iget-object v1, p0, Lorg/jivesoftware/smack/SynchronizationPoint;->state:Lorg/jivesoftware/smack/SynchronizationPoint$e;

    invoke-virtual {v1}, Lorg/jivesoftware/smack/SynchronizationPoint$e;->ordinal()I

    move-result v1

    aget v0, v0, v1

    sparse-switch v0, :sswitch_data_0

    goto :goto_0

    .line 110
    :sswitch_0
    iget-object v0, p0, Lorg/jivesoftware/smack/SynchronizationPoint;->failureException:Ljava/lang/Exception;

    if-eqz v0, :cond_0

    .line 111
    iget-object v0, p0, Lorg/jivesoftware/smack/SynchronizationPoint;->failureException:Ljava/lang/Exception;

    throw v0

    .line 117
    :cond_0
    :goto_0
    return-void

    nop

    :sswitch_data_0
    .sparse-switch
        0x1 -> :sswitch_0
    .end sparse-switch
.end method

.method public wasSuccessful()Z
    .locals 4

    .line 205
    iget-object v0, p0, Lorg/jivesoftware/smack/SynchronizationPoint;->connectionLock:Ljava/util/concurrent/locks/Lock;

    invoke-interface {v0}, Ljava/util/concurrent/locks/Lock;->lock()V

    .line 207
    :try_start_0
    iget-object v0, p0, Lorg/jivesoftware/smack/SynchronizationPoint;->state:Lorg/jivesoftware/smack/SynchronizationPoint$e;

    sget-object v1, Lorg/jivesoftware/smack/SynchronizationPoint$e;->b:Lorg/jivesoftware/smack/SynchronizationPoint$e;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-ne v0, v1, :cond_0

    const/4 v2, 0x1

    goto :goto_0

    :cond_0
    const/4 v2, 0x0

    .line 210
    :goto_0
    iget-object v0, p0, Lorg/jivesoftware/smack/SynchronizationPoint;->connectionLock:Ljava/util/concurrent/locks/Lock;

    invoke-interface {v0}, Ljava/util/concurrent/locks/Lock;->unlock()V

    .line 207
    return v2

    .line 210
    :catchall_0
    move-exception v3

    iget-object v0, p0, Lorg/jivesoftware/smack/SynchronizationPoint;->connectionLock:Ljava/util/concurrent/locks/Lock;

    invoke-interface {v0}, Ljava/util/concurrent/locks/Lock;->unlock()V

    .line 211
    throw v3
.end method
