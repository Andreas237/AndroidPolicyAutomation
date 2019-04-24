.class Lcom/nytimes/android/external/cache/LocalCache$WriteQueue$1;
.super Lcom/nytimes/android/external/cache/LocalCache$AbstractReferenceEntry;
.source "LocalCache.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/nytimes/android/external/cache/LocalCache$WriteQueue;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/nytimes/android/external/cache/LocalCache$AbstractReferenceEntry<",
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

.field final synthetic this$0:Lcom/nytimes/android/external/cache/LocalCache$WriteQueue;


# direct methods
.method constructor <init>(Lcom/nytimes/android/external/cache/LocalCache$WriteQueue;)V
    .locals 0

    .line 3625
    iput-object p1, p0, Lcom/nytimes/android/external/cache/LocalCache$WriteQueue$1;->this$0:Lcom/nytimes/android/external/cache/LocalCache$WriteQueue;

    invoke-direct {p0}, Lcom/nytimes/android/external/cache/LocalCache$AbstractReferenceEntry;-><init>()V

    .line 3636
    iput-object p0, p0, Lcom/nytimes/android/external/cache/LocalCache$WriteQueue$1;->nextWrite:Lcom/nytimes/android/external/cache/LocalCache$ReferenceEntry;

    .line 3648
    iput-object p0, p0, Lcom/nytimes/android/external/cache/LocalCache$WriteQueue$1;->previousWrite:Lcom/nytimes/android/external/cache/LocalCache$ReferenceEntry;

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

    .line 3640
    iget-object v0, p0, Lcom/nytimes/android/external/cache/LocalCache$WriteQueue$1;->nextWrite:Lcom/nytimes/android/external/cache/LocalCache$ReferenceEntry;

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

    .line 3652
    iget-object v0, p0, Lcom/nytimes/android/external/cache/LocalCache$WriteQueue$1;->previousWrite:Lcom/nytimes/android/external/cache/LocalCache$ReferenceEntry;

    return-object v0
.end method

.method public getWriteTime()J
    .locals 2

    const-wide v0, 0x7fffffffffffffffL

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

    .line 3645
    iput-object p1, p0, Lcom/nytimes/android/external/cache/LocalCache$WriteQueue$1;->nextWrite:Lcom/nytimes/android/external/cache/LocalCache$ReferenceEntry;

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

    .line 3657
    iput-object p1, p0, Lcom/nytimes/android/external/cache/LocalCache$WriteQueue$1;->previousWrite:Lcom/nytimes/android/external/cache/LocalCache$ReferenceEntry;

    return-void
.end method

.method public setWriteTime(J)V
    .locals 0

    return-void
.end method
