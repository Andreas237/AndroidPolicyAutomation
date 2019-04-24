.class public Lcom/usebutton/sdk/internal/util/MemoryLink;
.super Lcom/usebutton/sdk/internal/util/ResourceLink;
.source "MemoryLink.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/usebutton/sdk/internal/util/ResourceLink<",
        "Landroid/net/Uri;",
        "Lcom/usebutton/sdk/internal/util/Data;",
        ">;"
    }
.end annotation


# static fields
.field private static final CACHE_SIZE_BYTES:I = 0x100000

.field private static final TAG:Ljava/lang/String; = "MemoryLink"


# instance fields
.field private final mConfiguration:Lcom/usebutton/sdk/internal/functional/Getter;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/usebutton/sdk/internal/functional/Getter<",
            "Lcom/usebutton/sdk/internal/models/Configuration;",
            ">;"
        }
    .end annotation
.end field

.field private mMaxItemSize:I

.field private mStore:Landroid/util/LruCache;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/util/LruCache<",
            "Landroid/net/Uri;",
            "Lcom/usebutton/sdk/internal/util/Data;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lcom/usebutton/sdk/internal/functional/Getter;Lcom/usebutton/sdk/internal/util/ResourceLink;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/usebutton/sdk/internal/functional/Getter<",
            "Lcom/usebutton/sdk/internal/models/Configuration;",
            ">;",
            "Lcom/usebutton/sdk/internal/util/ResourceLink;",
            ")V"
        }
    .end annotation

    .line 21
    invoke-direct {p0, p2}, Lcom/usebutton/sdk/internal/util/ResourceLink;-><init>(Lcom/usebutton/sdk/internal/util/CachingLink;)V

    .line 22
    iput-object p1, p0, Lcom/usebutton/sdk/internal/util/MemoryLink;->mConfiguration:Lcom/usebutton/sdk/internal/functional/Getter;

    return-void
.end method

.method private getStore()Landroid/util/LruCache;
    .locals 2
    .annotation build Landroid/support/annotation/NonNull;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Landroid/util/LruCache<",
            "Landroid/net/Uri;",
            "Lcom/usebutton/sdk/internal/util/Data;",
            ">;"
        }
    .end annotation

    .line 28
    iget-object v0, p0, Lcom/usebutton/sdk/internal/util/MemoryLink;->mStore:Landroid/util/LruCache;

    if-nez v0, :cond_0

    .line 29
    new-instance v0, Lcom/usebutton/sdk/internal/util/MemoryLink$1;

    const/high16 v1, 0x100000

    invoke-direct {v0, p0, v1}, Lcom/usebutton/sdk/internal/util/MemoryLink$1;-><init>(Lcom/usebutton/sdk/internal/util/MemoryLink;I)V

    iput-object v0, p0, Lcom/usebutton/sdk/internal/util/MemoryLink;->mStore:Landroid/util/LruCache;

    .line 38
    iget-object v0, p0, Lcom/usebutton/sdk/internal/util/MemoryLink;->mConfiguration:Lcom/usebutton/sdk/internal/functional/Getter;

    invoke-interface {v0}, Lcom/usebutton/sdk/internal/functional/Getter;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/usebutton/sdk/internal/models/Configuration;

    invoke-virtual {v0}, Lcom/usebutton/sdk/internal/models/Configuration;->getParameters()Lcom/usebutton/sdk/internal/models/Configuration$Parameters;

    move-result-object v0

    invoke-virtual {v0}, Lcom/usebutton/sdk/internal/models/Configuration$Parameters;->getCacheImageMaxSizeBytes()I

    move-result v0

    iput v0, p0, Lcom/usebutton/sdk/internal/util/MemoryLink;->mMaxItemSize:I

    .line 40
    :cond_0
    iget-object v0, p0, Lcom/usebutton/sdk/internal/util/MemoryLink;->mStore:Landroid/util/LruCache;

    return-object v0
.end method


# virtual methods
.method public doGet(Landroid/net/Uri;)Lcom/usebutton/sdk/internal/util/Data;
    .locals 1
    .param p1    # Landroid/net/Uri;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .annotation build Landroid/support/annotation/Nullable;
    .end annotation

    .line 46
    invoke-direct {p0}, Lcom/usebutton/sdk/internal/util/MemoryLink;->getStore()Landroid/util/LruCache;

    move-result-object v0

    invoke-virtual {v0, p1}, Landroid/util/LruCache;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/usebutton/sdk/internal/util/Data;

    return-object p1
.end method

.method public bridge synthetic doGet(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0
    .param p1    # Ljava/lang/Object;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .annotation build Landroid/support/annotation/Nullable;
    .end annotation

    .line 13
    check-cast p1, Landroid/net/Uri;

    invoke-virtual {p0, p1}, Lcom/usebutton/sdk/internal/util/MemoryLink;->doGet(Landroid/net/Uri;)Lcom/usebutton/sdk/internal/util/Data;

    move-result-object p1

    return-object p1
.end method

.method public doPut(Landroid/net/Uri;Lcom/usebutton/sdk/internal/util/Data;)V
    .locals 5
    .param p1    # Landroid/net/Uri;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .param p2    # Lcom/usebutton/sdk/internal/util/Data;
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param

    if-eqz p2, :cond_2

    .line 51
    iget-object v0, p2, Lcom/usebutton/sdk/internal/util/Data;->mData:[B

    if-nez v0, :cond_0

    goto :goto_0

    .line 55
    :cond_0
    iget-object v0, p2, Lcom/usebutton/sdk/internal/util/Data;->mData:[B

    array-length v0, v0

    iget v1, p0, Lcom/usebutton/sdk/internal/util/MemoryLink;->mMaxItemSize:I

    if-le v0, v1, :cond_1

    const-string v0, "MemoryLink"

    .line 56
    sget-object v1, Ljava/util/Locale;->US:Ljava/util/Locale;

    const-string v2, "Rejecting value for %s since size %d is greater than the per item limit of %d"

    const/4 v3, 0x3

    new-array v3, v3, [Ljava/lang/Object;

    const/4 v4, 0x0

    aput-object p1, v3, v4

    const/4 p1, 0x1

    iget-object p2, p2, Lcom/usebutton/sdk/internal/util/Data;->mData:[B

    array-length p2, p2

    .line 58
    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p2

    aput-object p2, v3, p1

    const/4 p1, 0x2

    iget p2, p0, Lcom/usebutton/sdk/internal/util/MemoryLink;->mMaxItemSize:I

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p2

    aput-object p2, v3, p1

    .line 57
    invoke-static {v1, v2, v3}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    .line 56
    invoke-static {v0, p1}, Lcom/usebutton/sdk/internal/util/ButtonLog;->verbose(Ljava/lang/String;Ljava/lang/String;)V

    return-void

    .line 61
    :cond_1
    invoke-direct {p0}, Lcom/usebutton/sdk/internal/util/MemoryLink;->getStore()Landroid/util/LruCache;

    move-result-object v0

    invoke-virtual {v0, p1, p2}, Landroid/util/LruCache;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-void

    .line 52
    :cond_2
    :goto_0
    invoke-direct {p0}, Lcom/usebutton/sdk/internal/util/MemoryLink;->getStore()Landroid/util/LruCache;

    move-result-object v0

    invoke-virtual {v0, p1, p2}, Landroid/util/LruCache;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public bridge synthetic doPut(Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 0
    .param p1    # Ljava/lang/Object;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .param p2    # Ljava/lang/Object;
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param

    .line 13
    check-cast p1, Landroid/net/Uri;

    check-cast p2, Lcom/usebutton/sdk/internal/util/Data;

    invoke-virtual {p0, p1, p2}, Lcom/usebutton/sdk/internal/util/MemoryLink;->doPut(Landroid/net/Uri;Lcom/usebutton/sdk/internal/util/Data;)V

    return-void
.end method

.method public declared-synchronized size()I
    .locals 1

    monitor-enter p0

    .line 66
    :try_start_0
    invoke-direct {p0}, Lcom/usebutton/sdk/internal/util/MemoryLink;->getStore()Landroid/util/LruCache;

    move-result-object v0

    invoke-virtual {v0}, Landroid/util/LruCache;->size()I

    move-result v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return v0

    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method
