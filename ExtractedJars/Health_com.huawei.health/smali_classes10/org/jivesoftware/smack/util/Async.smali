.class public Lorg/jivesoftware/smack/util/Async;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lorg/jivesoftware/smack/util/Async$ThrowingRunnable;
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 21
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static daemonThreadFrom(Ljava/lang/Runnable;)Ljava/lang/Thread;
    .locals 2

    .line 51
    new-instance v1, Ljava/lang/Thread;

    invoke-direct {v1, p0}, Ljava/lang/Thread;-><init>(Ljava/lang/Runnable;)V

    .line 52
    const/4 v0, 0x1

    invoke-virtual {v1, v0}, Ljava/lang/Thread;->setDaemon(Z)V

    .line 53
    return-object v1
.end method

.method public static go(Ljava/lang/Runnable;)Ljava/lang/Thread;
    .locals 1

    .line 30
    invoke-static {p0}, Lorg/jivesoftware/smack/util/Async;->daemonThreadFrom(Ljava/lang/Runnable;)Ljava/lang/Thread;

    move-result-object v0

    .line 31
    invoke-virtual {v0}, Ljava/lang/Thread;->start()V

    .line 32
    return-object v0
.end method

.method public static go(Ljava/lang/Runnable;Ljava/lang/String;)Ljava/lang/Thread;
    .locals 1

    .line 44
    invoke-static {p0}, Lorg/jivesoftware/smack/util/Async;->daemonThreadFrom(Ljava/lang/Runnable;)Ljava/lang/Thread;

    move-result-object v0

    .line 45
    invoke-virtual {v0, p1}, Ljava/lang/Thread;->setName(Ljava/lang/String;)V

    .line 46
    invoke-virtual {v0}, Ljava/lang/Thread;->start()V

    .line 47
    return-object v0
.end method
