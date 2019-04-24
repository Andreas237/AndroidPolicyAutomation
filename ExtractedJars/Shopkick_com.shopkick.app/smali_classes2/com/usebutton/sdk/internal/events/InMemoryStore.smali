.class public Lcom/usebutton/sdk/internal/events/InMemoryStore;
.super Ljava/lang/Object;
.source "InMemoryStore.java"

# interfaces
.implements Lcom/usebutton/sdk/internal/events/EventsStore;


# instance fields
.field private final mEvents:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/usebutton/sdk/internal/api/models/ClientEventDTO;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 8
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 10
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/usebutton/sdk/internal/events/InMemoryStore;->mEvents:Ljava/util/List;

    return-void
.end method


# virtual methods
.method public add(Lcom/usebutton/sdk/internal/api/models/ClientEventDTO;)Z
    .locals 1

    .line 14
    iget-object v0, p0, Lcom/usebutton/sdk/internal/events/InMemoryStore;->mEvents:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    const/4 p1, 0x1

    return p1
.end method

.method public peek(I)Ljava/util/List;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I)",
            "Ljava/util/List<",
            "Lcom/usebutton/sdk/internal/api/models/ClientEventDTO;",
            ">;"
        }
    .end annotation

    .line 20
    iget-object v0, p0, Lcom/usebutton/sdk/internal/events/InMemoryStore;->mEvents:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v1

    invoke-static {p1, v1}, Ljava/lang/Math;->min(II)I

    move-result p1

    const/4 v1, 0x0

    invoke-interface {v0, v1, p1}, Ljava/util/List;->subList(II)Ljava/util/List;

    move-result-object p1

    return-object p1
.end method

.method public remove(I)V
    .locals 3

    const/4 v0, 0x0

    move v1, v0

    .line 26
    :goto_0
    iget-object v2, p0, Lcom/usebutton/sdk/internal/events/InMemoryStore;->mEvents:Ljava/util/List;

    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v2

    invoke-static {p1, v2}, Ljava/lang/Math;->min(II)I

    move-result v2

    if-ge v1, v2, :cond_0

    .line 27
    iget-object v2, p0, Lcom/usebutton/sdk/internal/events/InMemoryStore;->mEvents:Ljava/util/List;

    invoke-interface {v2, v0}, Ljava/util/List;->remove(I)Ljava/lang/Object;

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_0
    return-void
.end method

.method public size()I
    .locals 1

    .line 33
    iget-object v0, p0, Lcom/usebutton/sdk/internal/events/InMemoryStore;->mEvents:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    return v0
.end method

.method public trimToSize(I)V
    .locals 2

    .line 38
    :goto_0
    iget-object v0, p0, Lcom/usebutton/sdk/internal/events/InMemoryStore;->mEvents:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-le v0, p1, :cond_0

    .line 39
    iget-object v0, p0, Lcom/usebutton/sdk/internal/events/InMemoryStore;->mEvents:Ljava/util/List;

    const/4 v1, 0x0

    invoke-interface {v0, v1}, Ljava/util/List;->remove(I)Ljava/lang/Object;

    goto :goto_0

    :cond_0
    return-void
.end method
