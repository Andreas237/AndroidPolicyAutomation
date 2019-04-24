.class public abstract Ljava9/util/concurrent/CountedCompleter;
.super Ljava9/util/concurrent/ForkJoinTask;
.source "CountedCompleter.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Ljava9/util/concurrent/ForkJoinTask<",
        "TT;>;"
    }
.end annotation


# static fields
.field private static final PENDING:J

.field private static final U:Lsun/misc/Unsafe;

.field private static final serialVersionUID:J = 0x489d68f7081983ceL


# instance fields
.field final completer:Ljava9/util/concurrent/CountedCompleter;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava9/util/concurrent/CountedCompleter<",
            "*>;"
        }
    .end annotation
.end field

.field volatile pending:I


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 743
    sget-object v0, Ljava9/util/concurrent/UnsafeAccess;->unsafe:Lsun/misc/Unsafe;

    sput-object v0, Ljava9/util/concurrent/CountedCompleter;->U:Lsun/misc/Unsafe;

    .line 747
    :try_start_0
    sget-object v0, Ljava9/util/concurrent/CountedCompleter;->U:Lsun/misc/Unsafe;

    const-class v1, Ljava9/util/concurrent/CountedCompleter;

    const-string v2, "pending"

    .line 748
    invoke-virtual {v1, v2}, Ljava/lang/Class;->getDeclaredField(Ljava/lang/String;)Ljava/lang/reflect/Field;

    move-result-object v1

    invoke-virtual {v0, v1}, Lsun/misc/Unsafe;->objectFieldOffset(Ljava/lang/reflect/Field;)J

    move-result-wide v0

    sput-wide v0, Ljava9/util/concurrent/CountedCompleter;->PENDING:J
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception v0

    .line 750
    new-instance v1, Ljava/lang/Error;

    invoke-direct {v1, v0}, Ljava/lang/Error;-><init>(Ljava/lang/Throwable;)V

    throw v1
.end method

.method protected constructor <init>()V
    .locals 1

    .line 432
    invoke-direct {p0}, Ljava9/util/concurrent/ForkJoinTask;-><init>()V

    const/4 v0, 0x0

    .line 433
    iput-object v0, p0, Ljava9/util/concurrent/CountedCompleter;->completer:Ljava9/util/concurrent/CountedCompleter;

    return-void
.end method

.method protected constructor <init>(Ljava9/util/concurrent/CountedCompleter;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava9/util/concurrent/CountedCompleter<",
            "*>;)V"
        }
    .end annotation

    .line 424
    invoke-direct {p0}, Ljava9/util/concurrent/ForkJoinTask;-><init>()V

    .line 425
    iput-object p1, p0, Ljava9/util/concurrent/CountedCompleter;->completer:Ljava9/util/concurrent/CountedCompleter;

    return-void
.end method

.method protected constructor <init>(Ljava9/util/concurrent/CountedCompleter;I)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava9/util/concurrent/CountedCompleter<",
            "*>;I)V"
        }
    .end annotation

    .line 413
    invoke-direct {p0}, Ljava9/util/concurrent/ForkJoinTask;-><init>()V

    .line 414
    iput-object p1, p0, Ljava9/util/concurrent/CountedCompleter;->completer:Ljava9/util/concurrent/CountedCompleter;

    .line 415
    iput p2, p0, Ljava9/util/concurrent/CountedCompleter;->pending:I

    return-void
.end method


# virtual methods
.method public final addToPendingCount(I)V
    .locals 6

    .line 513
    :cond_0
    sget-object v0, Ljava9/util/concurrent/CountedCompleter;->U:Lsun/misc/Unsafe;

    sget-wide v2, Ljava9/util/concurrent/CountedCompleter;->PENDING:J

    iget v4, p0, Ljava9/util/concurrent/CountedCompleter;->pending:I

    add-int v5, v4, p1

    move-object v1, p0

    invoke-virtual/range {v0 .. v5}, Lsun/misc/Unsafe;->compareAndSwapInt(Ljava/lang/Object;JII)Z

    move-result v0

    if-eqz v0, :cond_0

    return-void
.end method

.method public abstract compute()V
.end method

.method protected final exec()Z
    .locals 1

    .line 718
    invoke-virtual {p0}, Ljava9/util/concurrent/CountedCompleter;->compute()V

    const/4 v0, 0x0

    return v0
.end method

.method public final getCompleter()Ljava9/util/concurrent/CountedCompleter;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava9/util/concurrent/CountedCompleter<",
            "*>;"
        }
    .end annotation

    .line 485
    iget-object v0, p0, Ljava9/util/concurrent/CountedCompleter;->completer:Ljava9/util/concurrent/CountedCompleter;

    return-object v0
.end method

.method public final getPendingCount()I
    .locals 1

    .line 494
    iget v0, p0, Ljava9/util/concurrent/CountedCompleter;->pending:I

    return v0
.end method

.method public getRawResult()Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()TT;"
        }
    .end annotation

    const/4 v0, 0x0

    return-object v0
.end method

.method internalPropagateException(Ljava/lang/Throwable;)V
    .locals 5

    move-object v0, p0

    move-object v1, v0

    .line 708
    :goto_0
    invoke-virtual {v0, p1, v1}, Ljava9/util/concurrent/CountedCompleter;->onExceptionalCompletion(Ljava/lang/Throwable;Ljava9/util/concurrent/CountedCompleter;)Z

    move-result v1

    if-eqz v1, :cond_0

    iget-object v1, v0, Ljava9/util/concurrent/CountedCompleter;->completer:Ljava9/util/concurrent/CountedCompleter;

    if-eqz v1, :cond_0

    iget v2, v1, Ljava9/util/concurrent/CountedCompleter;->status:I

    if-ltz v2, :cond_0

    .line 710
    invoke-virtual {v1, p1}, Ljava9/util/concurrent/CountedCompleter;->recordExceptionalCompletion(Ljava/lang/Throwable;)I

    move-result v2

    const/high16 v3, -0x80000000

    if-ne v2, v3, :cond_0

    move-object v4, v1

    move-object v1, v0

    move-object v0, v4

    goto :goto_0

    :cond_0
    return-void
.end method

.method public onCompletion(Ljava9/util/concurrent/CountedCompleter;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava9/util/concurrent/CountedCompleter<",
            "*>;)V"
        }
    .end annotation

    return-void
.end method

.method public onExceptionalCompletion(Ljava/lang/Throwable;Ljava9/util/concurrent/CountedCompleter;)Z
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Throwable;",
            "Ljava9/util/concurrent/CountedCompleter<",
            "*>;)Z"
        }
    .end annotation

    const/4 p1, 0x1

    return p1
.end method

.method public final propagateCompletion()V
    .locals 7

    move-object v6, p0

    .line 587
    :cond_0
    :goto_0
    iget v4, v6, Ljava9/util/concurrent/CountedCompleter;->pending:I

    if-nez v4, :cond_2

    .line 588
    iget-object v0, v6, Ljava9/util/concurrent/CountedCompleter;->completer:Ljava9/util/concurrent/CountedCompleter;

    if-nez v0, :cond_1

    .line 589
    invoke-virtual {v6}, Ljava9/util/concurrent/CountedCompleter;->quietlyComplete()V

    return-void

    :cond_1
    move-object v6, v0

    goto :goto_0

    .line 593
    :cond_2
    sget-object v0, Ljava9/util/concurrent/CountedCompleter;->U:Lsun/misc/Unsafe;

    sget-wide v2, Ljava9/util/concurrent/CountedCompleter;->PENDING:J

    add-int/lit8 v5, v4, -0x1

    move-object v1, v6

    invoke-virtual/range {v0 .. v5}, Lsun/misc/Unsafe;->compareAndSwapInt(Ljava/lang/Object;JII)Z

    move-result v0

    if-eqz v0, :cond_0

    return-void
.end method

.method public final setPendingCount(I)V
    .locals 0

    .line 503
    iput p1, p0, Ljava9/util/concurrent/CountedCompleter;->pending:I

    return-void
.end method

.method public final tryComplete()V
    .locals 8

    move-object v6, p0

    move-object v7, v6

    .line 563
    :cond_0
    :goto_0
    iget v4, v6, Ljava9/util/concurrent/CountedCompleter;->pending:I

    if-nez v4, :cond_2

    .line 564
    invoke-virtual {v6, v7}, Ljava9/util/concurrent/CountedCompleter;->onCompletion(Ljava9/util/concurrent/CountedCompleter;)V

    .line 565
    iget-object v0, v6, Ljava9/util/concurrent/CountedCompleter;->completer:Ljava9/util/concurrent/CountedCompleter;

    if-nez v0, :cond_1

    .line 566
    invoke-virtual {v6}, Ljava9/util/concurrent/CountedCompleter;->quietlyComplete()V

    return-void

    :cond_1
    move-object v7, v6

    move-object v6, v0

    goto :goto_0

    .line 570
    :cond_2
    sget-object v0, Ljava9/util/concurrent/CountedCompleter;->U:Lsun/misc/Unsafe;

    sget-wide v2, Ljava9/util/concurrent/CountedCompleter;->PENDING:J

    add-int/lit8 v5, v4, -0x1

    move-object v1, v6

    invoke-virtual/range {v0 .. v5}, Lsun/misc/Unsafe;->compareAndSwapInt(Ljava/lang/Object;JII)Z

    move-result v0

    if-eqz v0, :cond_0

    return-void
.end method
