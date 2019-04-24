.class public Lcom/ibotta/android/tracking/proprietary/AtomicBoundedInteger;
.super Ljava/lang/Object;
.source "AtomicBoundedInteger.java"

# interfaces
.implements Lcom/ibotta/android/tracking/proprietary/BoundedIncrementableInteger;


# instance fields
.field private final lock:Ljava/util/concurrent/locks/Lock;

.field private final maxValue:I

.field private final minValue:I

.field private value:I


# direct methods
.method public constructor <init>(IIILjava/util/concurrent/locks/Lock;)V
    .locals 1

    .line 15
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    if-lt p1, p2, :cond_0

    if-le p1, p3, :cond_1

    :cond_0
    const-string p1, "Initial value is out of bounds. Setting to the minimum bound"

    const/4 v0, 0x0

    .line 17
    new-array v0, v0, [Ljava/lang/Object;

    invoke-static {p1, v0}, Ltimber/log/Timber;->w(Ljava/lang/String;[Ljava/lang/Object;)V

    move p1, p2

    .line 21
    :cond_1
    iput p1, p0, Lcom/ibotta/android/tracking/proprietary/AtomicBoundedInteger;->value:I

    .line 22
    iput p2, p0, Lcom/ibotta/android/tracking/proprietary/AtomicBoundedInteger;->minValue:I

    .line 23
    iput p3, p0, Lcom/ibotta/android/tracking/proprietary/AtomicBoundedInteger;->maxValue:I

    .line 24
    iput-object p4, p0, Lcom/ibotta/android/tracking/proprietary/AtomicBoundedInteger;->lock:Ljava/util/concurrent/locks/Lock;

    return-void
.end method


# virtual methods
.method public get()I
    .locals 1

    .line 29
    iget v0, p0, Lcom/ibotta/android/tracking/proprietary/AtomicBoundedInteger;->value:I

    return v0
.end method

.method public getAndIncrement()I
    .locals 2

    .line 35
    iget-object v0, p0, Lcom/ibotta/android/tracking/proprietary/AtomicBoundedInteger;->lock:Ljava/util/concurrent/locks/Lock;

    invoke-interface {v0}, Ljava/util/concurrent/locks/Lock;->lock()V

    .line 38
    :try_start_0
    iget v0, p0, Lcom/ibotta/android/tracking/proprietary/AtomicBoundedInteger;->value:I

    invoke-virtual {p0}, Lcom/ibotta/android/tracking/proprietary/AtomicBoundedInteger;->getMaxBound()I

    move-result v1

    if-le v0, v1, :cond_0

    invoke-virtual {p0}, Lcom/ibotta/android/tracking/proprietary/AtomicBoundedInteger;->getMinBound()I

    move-result v0

    goto :goto_0

    :cond_0
    iget v0, p0, Lcom/ibotta/android/tracking/proprietary/AtomicBoundedInteger;->value:I

    :goto_0
    iput v0, p0, Lcom/ibotta/android/tracking/proprietary/AtomicBoundedInteger;->value:I

    .line 39
    iget v0, p0, Lcom/ibotta/android/tracking/proprietary/AtomicBoundedInteger;->value:I

    add-int/lit8 v1, v0, 0x1

    iput v1, p0, Lcom/ibotta/android/tracking/proprietary/AtomicBoundedInteger;->value:I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 41
    iget-object v1, p0, Lcom/ibotta/android/tracking/proprietary/AtomicBoundedInteger;->lock:Ljava/util/concurrent/locks/Lock;

    invoke-interface {v1}, Ljava/util/concurrent/locks/Lock;->unlock()V

    return v0

    :catchall_0
    move-exception v0

    iget-object v1, p0, Lcom/ibotta/android/tracking/proprietary/AtomicBoundedInteger;->lock:Ljava/util/concurrent/locks/Lock;

    invoke-interface {v1}, Ljava/util/concurrent/locks/Lock;->unlock()V

    throw v0
.end method

.method public getMaxBound()I
    .locals 1

    .line 49
    iget v0, p0, Lcom/ibotta/android/tracking/proprietary/AtomicBoundedInteger;->maxValue:I

    return v0
.end method

.method public getMinBound()I
    .locals 1

    .line 54
    iget v0, p0, Lcom/ibotta/android/tracking/proprietary/AtomicBoundedInteger;->minValue:I

    return v0
.end method
