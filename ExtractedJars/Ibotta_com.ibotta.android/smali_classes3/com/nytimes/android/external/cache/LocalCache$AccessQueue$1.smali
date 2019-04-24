.class Lcom/nytimes/android/external/cache/LocalCache$AccessQueue$1;
.super Lcom/nytimes/android/external/cache/LocalCache$AbstractReferenceEntry;
.source "LocalCache.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/nytimes/android/external/cache/LocalCache$AccessQueue;
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

.field final synthetic this$0:Lcom/nytimes/android/external/cache/LocalCache$AccessQueue;


# direct methods
.method constructor <init>(Lcom/nytimes/android/external/cache/LocalCache$AccessQueue;)V
    .locals 0

    .line 3765
    iput-object p1, p0, Lcom/nytimes/android/external/cache/LocalCache$AccessQueue$1;->this$0:Lcom/nytimes/android/external/cache/LocalCache$AccessQueue;

    invoke-direct {p0}, Lcom/nytimes/android/external/cache/LocalCache$AbstractReferenceEntry;-><init>()V

    .line 3776
    iput-object p0, p0, Lcom/nytimes/android/external/cache/LocalCache$AccessQueue$1;->nextAccess:Lcom/nytimes/android/external/cache/LocalCache$ReferenceEntry;

    .line 3788
    iput-object p0, p0, Lcom/nytimes/android/external/cache/LocalCache$AccessQueue$1;->previousAccess:Lcom/nytimes/android/external/cache/LocalCache$ReferenceEntry;

    return-void
.end method


# virtual methods
.method public getAccessTime()J
    .locals 2

    const-wide v0, 0x7fffffffffffffffL

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

    .line 3780
    iget-object v0, p0, Lcom/nytimes/android/external/cache/LocalCache$AccessQueue$1;->nextAccess:Lcom/nytimes/android/external/cache/LocalCache$ReferenceEntry;

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

    .line 3792
    iget-object v0, p0, Lcom/nytimes/android/external/cache/LocalCache$AccessQueue$1;->previousAccess:Lcom/nytimes/android/external/cache/LocalCache$ReferenceEntry;

    return-object v0
.end method

.method public setAccessTime(J)V
    .locals 0

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

    .line 3785
    iput-object p1, p0, Lcom/nytimes/android/external/cache/LocalCache$AccessQueue$1;->nextAccess:Lcom/nytimes/android/external/cache/LocalCache$ReferenceEntry;

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

    .line 3797
    iput-object p1, p0, Lcom/nytimes/android/external/cache/LocalCache$AccessQueue$1;->previousAccess:Lcom/nytimes/android/external/cache/LocalCache$ReferenceEntry;

    return-void
.end method
