.class public Lcom/usebutton/sdk/internal/api/Parameters;
.super Ljava/lang/Object;
.source "Parameters.java"

# interfaces
.implements Ljava/lang/Iterable;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ljava/lang/Iterable<",
        "Lcom/usebutton/sdk/internal/functional/Pair<",
        "Ljava/lang/String;",
        "Ljava/lang/Object;",
        ">;>;"
    }
.end annotation


# instance fields
.field private final mParameters:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/usebutton/sdk/internal/functional/Pair<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 9
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 11
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/usebutton/sdk/internal/api/Parameters;->mParameters:Ljava/util/List;

    return-void
.end method

.method private add(Lcom/usebutton/sdk/internal/functional/Pair;)Lcom/usebutton/sdk/internal/api/Parameters;
    .locals 1

    .line 14
    iget-object v0, p0, Lcom/usebutton/sdk/internal/api/Parameters;->mParameters:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    return-object p0
.end method


# virtual methods
.method public add(Ljava/lang/String;Ljava/lang/String;)Lcom/usebutton/sdk/internal/api/Parameters;
    .locals 1

    .line 19
    new-instance v0, Lcom/usebutton/sdk/internal/functional/Pair;

    invoke-direct {v0, p1, p2}, Lcom/usebutton/sdk/internal/functional/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-direct {p0, v0}, Lcom/usebutton/sdk/internal/api/Parameters;->add(Lcom/usebutton/sdk/internal/functional/Pair;)Lcom/usebutton/sdk/internal/api/Parameters;

    move-result-object p1

    return-object p1
.end method

.method public addIfNotNullValue(Lcom/usebutton/sdk/internal/functional/Pair;)Lcom/usebutton/sdk/internal/api/Parameters;
    .locals 1

    .line 23
    invoke-virtual {p1}, Lcom/usebutton/sdk/internal/functional/Pair;->second()Ljava/lang/Object;

    move-result-object v0

    if-nez v0, :cond_0

    return-object p0

    .line 24
    :cond_0
    iget-object v0, p0, Lcom/usebutton/sdk/internal/api/Parameters;->mParameters:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    return-object p0
.end method

.method public iterator()Ljava/util/Iterator;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Iterator<",
            "Lcom/usebutton/sdk/internal/functional/Pair<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;>;"
        }
    .end annotation

    .line 30
    iget-object v0, p0, Lcom/usebutton/sdk/internal/api/Parameters;->mParameters:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    return-object v0
.end method
