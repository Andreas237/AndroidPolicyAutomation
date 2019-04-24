.class public final Lorg/jivesoftware/smack/util/SmackExecutorThreadFactory;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/concurrent/ThreadFactory;


# instance fields
.field private final connectionCounterValue:I

.field private count:I

.field private final name:Ljava/lang/String;


# direct methods
.method public constructor <init>(Lorg/jivesoftware/smack/XMPPConnection;Ljava/lang/String;)V
    .locals 1

    .line 32
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 30
    const/4 v0, 0x0

    iput v0, p0, Lorg/jivesoftware/smack/util/SmackExecutorThreadFactory;->count:I

    .line 33
    invoke-interface {p1}, Lorg/jivesoftware/smack/XMPPConnection;->getConnectionCounter()I

    move-result v0

    iput v0, p0, Lorg/jivesoftware/smack/util/SmackExecutorThreadFactory;->connectionCounterValue:I

    .line 34
    iput-object p2, p0, Lorg/jivesoftware/smack/util/SmackExecutorThreadFactory;->name:Ljava/lang/String;

    .line 35
    return-void
.end method


# virtual methods
.method public newThread(Ljava/lang/Runnable;)Ljava/lang/Thread;
    .locals 4

    .line 39
    new-instance v3, Ljava/lang/Thread;

    invoke-direct {v3, p1}, Ljava/lang/Thread;-><init>(Ljava/lang/Runnable;)V

    .line 40
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Smack-"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lorg/jivesoftware/smack/util/SmackExecutorThreadFactory;->name:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const/16 v1, 0x20

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    move-result-object v0

    iget v1, p0, Lorg/jivesoftware/smack/util/SmackExecutorThreadFactory;->count:I

    add-int/lit8 v2, v1, 0x1

    iput v2, p0, Lorg/jivesoftware/smack/util/SmackExecutorThreadFactory;->count:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, " ("

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget v1, p0, Lorg/jivesoftware/smack/util/SmackExecutorThreadFactory;->connectionCounterValue:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ")"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v3, v0}, Ljava/lang/Thread;->setName(Ljava/lang/String;)V

    .line 41
    const/4 v0, 0x1

    invoke-virtual {v3, v0}, Ljava/lang/Thread;->setDaemon(Z)V

    .line 42
    return-object v3
.end method
