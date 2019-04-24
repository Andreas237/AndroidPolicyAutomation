.class final Lcom/nytimes/android/external/cache/LocalCache$WeakWriteEntry;
.super Lcom/nytimes/android/external/cache/LocalCache$WeakEntry;
.source "LocalCache.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/nytimes/android/external/cache/LocalCache;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = "WeakWriteEntry"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<K:",
        "Ljava/lang/Object;",
        "V:",
        "Ljava/lang/Object;",
        ">",
        "Lcom/nytimes/android/external/cache/LocalCache$WeakEntry<",
        "TK;TV;>;"
    }
.end annotation


# instance fields
.field nextWrite:Lcom/nytimes/android/external/cache/LocalCache$ReferenceEntry;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/nytimes/android/external/cache/LocalCache$ReferenceEntry<",
            "TK;TV;>;"
        }
    .end annotation
.end field

.field previousWrite:Lcom/nytimes/android/external/cache/LocalCache$ReferenceEntry;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/nytimes/android/external/cache/LocalCache$ReferenceEntry<",
            "TK;TV;>;"
        }
    .end annotation
.end field

.field volatile writeTime:J


# direct methods
.method constructor <init>(Ljava/lang/ref/ReferenceQueue;Ljava/lang/Object;ILcom/nytimes/android/external/cache/LocalCache$ReferenceEntry;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/ref/ReferenceQueue<",
            "TK;>;TK;I",
            "Lcom/nytimes/android/external/cache/LocalCache$ReferenceEntry<",
            "TK;TV;>;)V"
        }
    .end annotation

    .line 1470
    invoke-direct {p0, p1, p2, p3, p4}, Lcom/nytimes/android/external/cache/LocalCache$WeakEntry;-><init>(Ljava/lang/ref/ReferenceQueue;Ljava/lang/Object;ILcom/nytimes/android/external/cache/LocalCache$ReferenceEntry;)V

    const-wide p1, 0x7fffffffffffffffL

    .line 1475
    iput-wide p1, p0, Lcom/nytimes/android/external/cache/LocalCache$WeakWriteEntry;->writeTime:J

    .line 1488
    invoke-static {}, Lcom/nytimes/android/external/cache/LocalCache;->nullEntry()Lcom/nytimes/android/external/cache/LocalCache$ReferenceEntry;

    move-result-object p1

    iput-object p1, p0, Lcom/nytimes/android/external/cache/LocalCache$WeakWriteEntry;->nextWrite:Lcom/nytimes/android/external/cache/LocalCache$ReferenceEntry;

    .line 1501
    invoke-static {}, Lcom/nytimes/android/external/cache/LocalCache;->nullEntry()Lcom/nytimes/android/external/cache/LocalCache$ReferenceEntry;

    move-result-object p1

    iput-object p1, p0, Lcom/nytimes/android/external/cache/LocalCache$WeakWriteEntry;->previousWrite:Lcom/nytimes/android/external/cache/LocalCache$ReferenceEntry;

    return-void
.end method


# virtual methods
.method public getNextInWriteQueue()Lcom/nytimes/android/external/cache/LocalCache$ReferenceEntry;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/nytimes/android/external/cache/LocalCache$ReferenceEntry<",
            "TK;TV;>;"
        }
    .end annotation

    .line 1492
    iget-object v0, p0, Lcom/nytimes/android/external/cache/LocalCache$WeakWriteEntry;->nextWrite:Lcom/nytimes/android/external/cache/LocalCache$ReferenceEntry;

    return-object v0
.end method

.method public getPreviousInWriteQueue()Lcom/nytimes/android/external/cache/LocalCache$ReferenceEntry;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/nytimes/android/external/cache/LocalCache$ReferenceEntry<",
            "TK;TV;>;"
        }
    .end annotation

    .line 1505
    iget-object v0, p0, Lcom/nytimes/android/external/cache/LocalCache$WeakWriteEntry;->previousWrite:Lcom/nytimes/android/external/cache/LocalCache$ReferenceEntry;

    return-object v0
.end method

.method public getWriteTime()J
    .locals 2

    .line 1479
    iget-wide v0, p0, Lcom/nytimes/android/external/cache/LocalCache$WeakWriteEntry;->writeTime:J

    return-wide v0
.end method

.method public setNextInWriteQueue(Lcom/nytimes/android/external/cache/LocalCache$ReferenceEntry;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/nytimes/android/external/cache/LocalCache$ReferenceEntry<",
            "TK;TV;>;)V"
        }
    .end annotation

    .line 1497
    iput-object p1, p0, Lcom/nytimes/android/external/cache/LocalCache$WeakWriteEntry;->nextWrite:Lcom/nytimes/android/external/cache/LocalCache$ReferenceEntry;

    return-void
.end method

.method public setPreviousInWriteQueue(Lcom/nytimes/android/external/cache/LocalCache$ReferenceEntry;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/nytimes/android/external/cache/LocalCache$ReferenceEntry<",
            "TK;TV;>;)V"
        }
    .end annotation

    .line 1510
    iput-object p1, p0, Lcom/nytimes/android/external/cache/LocalCache$WeakWriteEntry;->previousWrite:Lcom/nytimes/android/external/cache/LocalCache$ReferenceEntry;

    return-void
.end method

.method public setWriteTime(J)V
    .locals 0

    .line 1484
    iput-wide p1, p0, Lcom/nytimes/android/external/cache/LocalCache$WeakWriteEntry;->writeTime:J

    return-void
.end method
