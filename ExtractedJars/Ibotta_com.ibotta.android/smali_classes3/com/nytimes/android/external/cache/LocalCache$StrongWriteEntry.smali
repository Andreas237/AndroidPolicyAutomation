.class final Lcom/nytimes/android/external/cache/LocalCache$StrongWriteEntry;
.super Lcom/nytimes/android/external/cache/LocalCache$StrongEntry;
.source "LocalCache.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/nytimes/android/external/cache/LocalCache;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = "StrongWriteEntry"
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
.method constructor <init>(Ljava/lang/Object;ILcom/nytimes/android/external/cache/LocalCache$ReferenceEntry;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TK;I",
            "Lcom/nytimes/android/external/cache/LocalCache$ReferenceEntry<",
            "TK;TV;>;)V"
        }
    .end annotation

    .line 1177
    invoke-direct {p0, p1, p2, p3}, Lcom/nytimes/android/external/cache/LocalCache$StrongEntry;-><init>(Ljava/lang/Object;ILcom/nytimes/android/external/cache/LocalCache$ReferenceEntry;)V

    const-wide p1, 0x7fffffffffffffffL

    .line 1182
    iput-wide p1, p0, Lcom/nytimes/android/external/cache/LocalCache$StrongWriteEntry;->writeTime:J

    .line 1195
    invoke-static {}, Lcom/nytimes/android/external/cache/LocalCache;->nullEntry()Lcom/nytimes/android/external/cache/LocalCache$ReferenceEntry;

    move-result-object p1

    iput-object p1, p0, Lcom/nytimes/android/external/cache/LocalCache$StrongWriteEntry;->nextWrite:Lcom/nytimes/android/external/cache/LocalCache$ReferenceEntry;

    .line 1208
    invoke-static {}, Lcom/nytimes/android/external/cache/LocalCache;->nullEntry()Lcom/nytimes/android/external/cache/LocalCache$ReferenceEntry;

    move-result-object p1

    iput-object p1, p0, Lcom/nytimes/android/external/cache/LocalCache$StrongWriteEntry;->previousWrite:Lcom/nytimes/android/external/cache/LocalCache$ReferenceEntry;

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

    .line 1199
    iget-object v0, p0, Lcom/nytimes/android/external/cache/LocalCache$StrongWriteEntry;->nextWrite:Lcom/nytimes/android/external/cache/LocalCache$ReferenceEntry;

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

    .line 1212
    iget-object v0, p0, Lcom/nytimes/android/external/cache/LocalCache$StrongWriteEntry;->previousWrite:Lcom/nytimes/android/external/cache/LocalCache$ReferenceEntry;

    return-object v0
.end method

.method public getWriteTime()J
    .locals 2

    .line 1186
    iget-wide v0, p0, Lcom/nytimes/android/external/cache/LocalCache$StrongWriteEntry;->writeTime:J

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

    .line 1204
    iput-object p1, p0, Lcom/nytimes/android/external/cache/LocalCache$StrongWriteEntry;->nextWrite:Lcom/nytimes/android/external/cache/LocalCache$ReferenceEntry;

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

    .line 1217
    iput-object p1, p0, Lcom/nytimes/android/external/cache/LocalCache$StrongWriteEntry;->previousWrite:Lcom/nytimes/android/external/cache/LocalCache$ReferenceEntry;

    return-void
.end method

.method public setWriteTime(J)V
    .locals 0

    .line 1191
    iput-wide p1, p0, Lcom/nytimes/android/external/cache/LocalCache$StrongWriteEntry;->writeTime:J

    return-void
.end method
