.class public Lo/fpr;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/concurrent/ThreadFactory;


# static fields
.field public static final b:Ljava/lang/ThreadGroup;

.field public static final d:Ljava/lang/ThreadGroup;


# instance fields
.field private final a:Ljava/util/concurrent/atomic/AtomicInteger;

.field private final c:Ljava/lang/String;

.field private final e:Ljava/lang/ThreadGroup;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 14
    new-instance v0, Ljava/lang/ThreadGroup;

    const-string v1, "Californium"

    invoke-direct {v0, v1}, Ljava/lang/ThreadGroup;-><init>(Ljava/lang/String;)V

    sput-object v0, Lo/fpr;->d:Ljava/lang/ThreadGroup;

    .line 18
    new-instance v0, Ljava/lang/ThreadGroup;

    const-string v1, "Scandium"

    invoke-direct {v0, v1}, Ljava/lang/ThreadGroup;-><init>(Ljava/lang/String;)V

    sput-object v0, Lo/fpr;->b:Ljava/lang/ThreadGroup;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/lang/ThreadGroup;)V
    .locals 2

    .line 42
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 21
    new-instance v0, Ljava/util/concurrent/atomic/AtomicInteger;

    const/4 v1, 0x1

    invoke-direct {v0, v1}, Ljava/util/concurrent/atomic/AtomicInteger;-><init>(I)V

    iput-object v0, p0, Lo/fpr;->a:Ljava/util/concurrent/atomic/AtomicInteger;

    .line 43
    const/4 v0, 0x0

    if-ne v0, p2, :cond_0

    sget-object v0, Lo/fpr;->d:Ljava/lang/ThreadGroup;

    goto :goto_0

    :cond_0
    move-object v0, p2

    :goto_0
    iput-object v0, p0, Lo/fpr;->e:Ljava/lang/ThreadGroup;

    .line 44
    iput-object p1, p0, Lo/fpr;->c:Ljava/lang/String;

    .line 45
    return-void
.end method


# virtual methods
.method protected e()Z
    .locals 1

    .line 79
    const/4 v0, 0x0

    return v0
.end method

.method public final newThread(Ljava/lang/Runnable;)Ljava/lang/Thread;
    .locals 7

    .line 59
    new-instance v0, Ljava/lang/Thread;

    iget-object v1, p0, Lo/fpr;->e:Ljava/lang/ThreadGroup;

    move-object v2, p1

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v4, p0, Lo/fpr;->c:Ljava/lang/String;

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    iget-object v4, p0, Lo/fpr;->a:Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-virtual {v4}, Ljava/util/concurrent/atomic/AtomicInteger;->getAndIncrement()I

    move-result v4

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    const-wide/16 v4, 0x0

    invoke-direct/range {v0 .. v5}, Ljava/lang/Thread;-><init>(Ljava/lang/ThreadGroup;Ljava/lang/Runnable;Ljava/lang/String;J)V

    move-object v6, v0

    .line 60
    invoke-virtual {p0}, Lo/fpr;->e()Z

    move-result v0

    invoke-virtual {v6, v0}, Ljava/lang/Thread;->setDaemon(Z)V

    .line 61
    invoke-virtual {v6}, Ljava/lang/Thread;->getPriority()I

    move-result v0

    const/4 v1, 0x5

    if-eq v0, v1, :cond_0

    .line 62
    const/4 v0, 0x5

    invoke-virtual {v6, v0}, Ljava/lang/Thread;->setPriority(I)V

    .line 64
    :cond_0
    return-object v6
.end method
