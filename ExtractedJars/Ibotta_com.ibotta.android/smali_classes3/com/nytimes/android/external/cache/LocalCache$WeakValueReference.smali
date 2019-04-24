.class Lcom/nytimes/android/external/cache/LocalCache$WeakValueReference;
.super Ljava/lang/ref/WeakReference;
.source "LocalCache.java"

# interfaces
.implements Lcom/nytimes/android/external/cache/LocalCache$ValueReference;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/nytimes/android/external/cache/LocalCache;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "WeakValueReference"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<K:",
        "Ljava/lang/Object;",
        "V:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/ref/WeakReference<",
        "TV;>;",
        "Lcom/nytimes/android/external/cache/LocalCache$ValueReference<",
        "TK;TV;>;"
    }
.end annotation


# instance fields
.field final entry:Lcom/nytimes/android/external/cache/LocalCache$ReferenceEntry;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/nytimes/android/external/cache/LocalCache$ReferenceEntry<",
            "TK;TV;>;"
        }
    .end annotation
.end field


# direct methods
.method constructor <init>(Ljava/lang/ref/ReferenceQueue;Ljava/lang/Object;Lcom/nytimes/android/external/cache/LocalCache$ReferenceEntry;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/ref/ReferenceQueue<",
            "TV;>;TV;",
            "Lcom/nytimes/android/external/cache/LocalCache$ReferenceEntry<",
            "TK;TV;>;)V"
        }
    .end annotation

    .line 1609
    invoke-direct {p0, p2, p1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;Ljava/lang/ref/ReferenceQueue;)V

    .line 1610
    iput-object p3, p0, Lcom/nytimes/android/external/cache/LocalCache$WeakValueReference;->entry:Lcom/nytimes/android/external/cache/LocalCache$ReferenceEntry;

    return-void
.end method


# virtual methods
.method public copyFor(Ljava/lang/ref/ReferenceQueue;Ljava/lang/Object;Lcom/nytimes/android/external/cache/LocalCache$ReferenceEntry;)Lcom/nytimes/android/external/cache/LocalCache$ValueReference;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/ref/ReferenceQueue<",
            "TV;>;TV;",
            "Lcom/nytimes/android/external/cache/LocalCache$ReferenceEntry<",
            "TK;TV;>;)",
            "Lcom/nytimes/android/external/cache/LocalCache$ValueReference<",
            "TK;TV;>;"
        }
    .end annotation

    .annotation runtime Ljavax/annotation/Nonnull;
    .end annotation

    .line 1631
    new-instance v0, Lcom/nytimes/android/external/cache/LocalCache$WeakValueReference;

    invoke-direct {v0, p1, p2, p3}, Lcom/nytimes/android/external/cache/LocalCache$WeakValueReference;-><init>(Ljava/lang/ref/ReferenceQueue;Ljava/lang/Object;Lcom/nytimes/android/external/cache/LocalCache$ReferenceEntry;)V

    return-object v0
.end method

.method public getEntry()Lcom/nytimes/android/external/cache/LocalCache$ReferenceEntry;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/nytimes/android/external/cache/LocalCache$ReferenceEntry<",
            "TK;TV;>;"
        }
    .end annotation

    .line 1620
    iget-object v0, p0, Lcom/nytimes/android/external/cache/LocalCache$WeakValueReference;->entry:Lcom/nytimes/android/external/cache/LocalCache$ReferenceEntry;

    return-object v0
.end method

.method public getWeight()I
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method public isActive()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method public isLoading()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public notifyNewValue(Ljava/lang/Object;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TV;)V"
        }
    .end annotation

    return-void
.end method

.method public waitForValue()Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()TV;"
        }
    .end annotation

    .line 1646
    invoke-virtual {p0}, Lcom/nytimes/android/external/cache/LocalCache$WeakValueReference;->get()Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method
