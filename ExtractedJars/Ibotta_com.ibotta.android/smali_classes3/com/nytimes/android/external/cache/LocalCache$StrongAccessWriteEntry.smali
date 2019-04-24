.class final Lcom/nytimes/android/external/cache/LocalCache$StrongAccessWriteEntry;
.super Lcom/nytimes/android/external/cache/LocalCache$StrongEntry;
.source "LocalCache.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/nytimes/android/external/cache/LocalCache;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = "StrongAccessWriteEntry"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<K:",
        "Ljava/lang/Object;",
        "V:",
        "Ljava/lang/Object;",
        ">",
        "Lcom/nytimes/android/external/cache/LocalCache$StrongEntry<",
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

.field nextWrite:Lcom/nytimes/android/external/cache/LocalCache$ReferenceEntry;
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
.method constructor <init>(Ljava/lang/Object;ILcom/nytimes/android/external/cache/LocalCache$ReferenceEntry;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TK;I",
            "Lcom/nytimes/android/external/cache/LocalCache$ReferenceEntry<",
            "TK;TV;>;)V"
        }
    .end annotation

    .line 1223
    invoke-direct {p0, p1, p2, p3}, Lcom/nytimes/android/external/cache/LocalCache$StrongEntry;-><init>(Ljava/lang/Object;ILcom/nytimes/android/external/cache/LocalCache$ReferenceEntry;)V

    const-wide p1, 0x7fffffffffffffffL

    .line 1228
    iput-wide p1, p0, Lcom/nytimes/android/external/cache/LocalCache$StrongAccessWriteEntry;->accessTime:J

    .line 1241
    invoke-static {}, Lcom/nytimes/android/external/cache/LocalCache;->nullEntry()Lcom/nytimes/android/external/cache/LocalCache$ReferenceEntry;

    move-result-object p3

    iput-object p3, p0, Lcom/nytimes/android/external/cache/LocalCache$StrongAccessWriteEntry;->nextAccess:Lcom/nytimes/android/external/cache/LocalCache$ReferenceEntry;

    .line 1254
    invoke-static {}, Lcom/nytimes/android/external/cache/LocalCache;->nullEntry()Lcom/nytimes/android/external/cache/LocalCache$ReferenceEntry;

    move-result-object p3

    iput-object p3, p0, Lcom/nytimes/android/external/cache/LocalCache$StrongAccessWriteEntry;->previousAccess:Lcom/nytimes/android/external/cache/LocalCache$ReferenceEntry;

    .line 1268
    iput-wide p1, p0, Lcom/nytimes/android/external/cache/LocalCache$StrongAccessWriteEntry;->writeTime:J

    .line 1281
    invoke-static {}, Lcom/nytimes/android/external/cache/LocalCache;->nullEntry()Lcom/nytimes/android/external/cache/LocalCache$ReferenceEntry;

    move-result-object p1

    iput-object p1, p0, Lcom/nytimes/android/external/cache/LocalCache$StrongAccessWriteEntry;->nextWrite:Lcom/nytimes/android/external/cache/LocalCache$ReferenceEntry;

    .line 1294
    invoke-static {}, Lcom/nytimes/android/external/cache/LocalCache;->nullEntry()Lcom/nytimes/android/external/cache/LocalCache$ReferenceEntry;

    move-result-object p1

    iput-object p1, p0, Lcom/nytimes/android/external/cache/LocalCache$StrongAccessWriteEntry;->previousWrite:Lcom/nytimes/android/external/cache/LocalCache$ReferenceEntry;

    return-void
.end method


# virtual methods
.method public getAccessTime()J
    .locals 2

    .line 1232
    iget-wide v0, p0, Lcom/nytimes/android/external/cache/LocalCache$StrongAccessWriteEntry;->accessTime:J

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

    .line 1245
    iget-object v0, p0, Lcom/nytimes/android/external/cache/LocalCache$StrongAccessWriteEntry;->nextAccess:Lcom/nytimes/android/external/cache/LocalCache$ReferenceEntry;

    return-object v0
.end method

.method public getNextInWriteQueue()Lcom/nytimes/android/external/cache/LocalCache$ReferenceEntry;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/nytimes/android/external/cache/LocalCache$ReferenceEntry<",
            "TK;TV;>;"
        }
    .end annotation

    .line 1285
    iget-object v0, p0, Lcom/nytimes/android/external/cache/LocalCache$StrongAccessWriteEntry;->nextWrite:Lcom/nytimes/android/external/cache/LocalCache$ReferenceEntry;

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

    .line 1258
    iget-object v0, p0, Lcom/nytimes/android/external/cache/LocalCache$StrongAccessWriteEntry;->previousAccess:Lcom/nytimes/android/external/cache/LocalCache$ReferenceEntry;

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

    .line 1298
    iget-object v0, p0, Lcom/nytimes/android/external/cache/LocalCache$StrongAccessWriteEntry;->previousWrite:Lcom/nytimes/android/external/cache/LocalCache$ReferenceEntry;

    return-object v0
.end method

.method public getWriteTime()J
    .locals 2

    .line 1272
    iget-wide v0, p0, Lcom/nytimes/android/external/cache/LocalCache$StrongAccessWriteEntry;->writeTime:J

    return-wide v0
.end method

.method public setAccessTime(J)V
    .locals 0

    .line 1237
    iput-wide p1, p0, Lcom/nytimes/android/external/cache/LocalCache$StrongAccessWriteEntry;->accessTime:J

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

    .line 1250
    iput-object p1, p0, Lcom/nytimes/android/external/cache/LocalCache$StrongAccessWriteEntry;->nextAccess:Lcom/nytimes/android/external/cache/LocalCache$ReferenceEntry;

    return-void
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

    .line 1290
    iput-object p1, p0, Lcom/nytimes/android/external/cache/LocalCache$StrongAccessWriteEntry;->nextWrite:Lcom/nytimes/android/external/cache/LocalCache$ReferenceEntry;

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

    .line 1263
    iput-object p1, p0, Lcom/nytimes/android/external/cache/LocalCache$StrongAccessWriteEntry;->previousAccess:Lcom/nytimes/android/external/cache/LocalCache$ReferenceEntry;

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

    .line 1303
    iput-object p1, p0, Lcom/nytimes/android/external/cache/LocalCache$StrongAccessWriteEntry;->previousWrite:Lcom/nytimes/android/external/cache/LocalCache$ReferenceEntry;

    return-void
.end method

.method public setWriteTime(J)V
    .locals 0

    .line 1277
    iput-wide p1, p0, Lcom/nytimes/android/external/cache/LocalCache$StrongAccessWriteEntry;->writeTime:J

    return-void
.end method
