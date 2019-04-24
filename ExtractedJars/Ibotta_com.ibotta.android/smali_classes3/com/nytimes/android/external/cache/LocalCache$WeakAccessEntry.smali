.class final Lcom/nytimes/android/external/cache/LocalCache$WeakAccessEntry;
.super Lcom/nytimes/android/external/cache/LocalCache$WeakEntry;
.source "LocalCache.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/nytimes/android/external/cache/LocalCache;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = "WeakAccessEntry"
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
.field volatile accessTime:J

.field nextAccess:Lcom/nytimes/android/external/cache/LocalCache$ReferenceEntry;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/nytimes/android/external/cache/LocalCache$ReferenceEntry<",
            "TK;TV;>;"
        }
    .end annotation
.end field

.field previousAccess:Lcom/nytimes/android/external/cache/LocalCache$ReferenceEntry;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/nytimes/android/external/cache/LocalCache$ReferenceEntry<",
            "TK;TV;>;"
        }
    .end annotation
.end field


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

    .line 1423
    invoke-direct {p0, p1, p2, p3, p4}, Lcom/nytimes/android/external/cache/LocalCache$WeakEntry;-><init>(Ljava/lang/ref/ReferenceQueue;Ljava/lang/Object;ILcom/nytimes/android/external/cache/LocalCache$ReferenceEntry;)V

    const-wide p1, 0x7fffffffffffffffL

    .line 1428
    iput-wide p1, p0, Lcom/nytimes/android/external/cache/LocalCache$WeakAccessEntry;->accessTime:J

    .line 1441
    invoke-static {}, Lcom/nytimes/android/external/cache/LocalCache;->nullEntry()Lcom/nytimes/android/external/cache/LocalCache$ReferenceEntry;

    move-result-object p1

    iput-object p1, p0, Lcom/nytimes/android/external/cache/LocalCache$WeakAccessEntry;->nextAccess:Lcom/nytimes/android/external/cache/LocalCache$ReferenceEntry;

    .line 1454
    invoke-static {}, Lcom/nytimes/android/external/cache/LocalCache;->nullEntry()Lcom/nytimes/android/external/cache/LocalCache$ReferenceEntry;

    move-result-object p1

    iput-object p1, p0, Lcom/nytimes/android/external/cache/LocalCache$WeakAccessEntry;->previousAccess:Lcom/nytimes/android/external/cache/LocalCache$ReferenceEntry;

    return-void
.end method


# virtual methods
.method public getAccessTime()J
    .locals 2

    .line 1432
    iget-wide v0, p0, Lcom/nytimes/android/external/cache/LocalCache$WeakAccessEntry;->accessTime:J

    return-wide v0
.end method

.method public getNextInAccessQueue()Lcom/nytimes/android/external/cache/LocalCache$ReferenceEntry;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/nytimes/android/external/cache/LocalCache$ReferenceEntry<",
            "TK;TV;>;"
        }
    .end annotation

    .line 1445
    iget-object v0, p0, Lcom/nytimes/android/external/cache/LocalCache$WeakAccessEntry;->nextAccess:Lcom/nytimes/android/external/cache/LocalCache$ReferenceEntry;

    return-object v0
.end method

.method public getPreviousInAccessQueue()Lcom/nytimes/android/external/cache/LocalCache$ReferenceEntry;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/nytimes/android/external/cache/LocalCache$ReferenceEntry<",
            "TK;TV;>;"
        }
    .end annotation

    .line 1458
    iget-object v0, p0, Lcom/nytimes/android/external/cache/LocalCache$WeakAccessEntry;->previousAccess:Lcom/nytimes/android/external/cache/LocalCache$ReferenceEntry;

    return-object v0
.end method

.method public setAccessTime(J)V
    .locals 0

    .line 1437
    iput-wide p1, p0, Lcom/nytimes/android/external/cache/LocalCache$WeakAccessEntry;->accessTime:J

    return-void
.end method

.method public setNextInAccessQueue(Lcom/nytimes/android/external/cache/LocalCache$ReferenceEntry;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/nytimes/android/external/cache/LocalCache$ReferenceEntry<",
            "TK;TV;>;)V"
        }
    .end annotation

    .line 1450
    iput-object p1, p0, Lcom/nytimes/android/external/cache/LocalCache$WeakAccessEntry;->nextAccess:Lcom/nytimes/android/external/cache/LocalCache$ReferenceEntry;

    return-void
.end method

.method public setPreviousInAccessQueue(Lcom/nytimes/android/external/cache/LocalCache$ReferenceEntry;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/nytimes/android/external/cache/LocalCache$ReferenceEntry<",
            "TK;TV;>;)V"
        }
    .end annotation

    .line 1463
    iput-object p1, p0, Lcom/nytimes/android/external/cache/LocalCache$WeakAccessEntry;->previousAccess:Lcom/nytimes/android/external/cache/LocalCache$ReferenceEntry;

    return-void
.end method
