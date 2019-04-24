.class public final Lio/gsonfire/ClassConfig;
.super Ljava/lang/Object;
.source "ClassConfig.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;"
    }
.end annotation


# instance fields
.field private clazz:Ljava/lang/Class;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/Class<",
            "TT;>;"
        }
    .end annotation
.end field

.field private hooksEnabled:Z

.field private postProcessors:Ljava/util/Collection;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Collection<",
            "Lio/gsonfire/PostProcessor<",
            "TT;>;>;"
        }
    .end annotation
.end field

.field private preProcessors:Ljava/util/Collection;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Collection<",
            "Lio/gsonfire/PreProcessor<",
            "TT;>;>;"
        }
    .end annotation
.end field

.field private typeSelector:Lio/gsonfire/TypeSelector;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lio/gsonfire/TypeSelector<",
            "-TT;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Ljava/lang/Class;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Class<",
            "TT;>;)V"
        }
    .end annotation

    .line 17
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 18
    iput-object p1, p0, Lio/gsonfire/ClassConfig;->clazz:Ljava/lang/Class;

    return-void
.end method


# virtual methods
.method public getConfiguredClass()Ljava/lang/Class;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/lang/Class<",
            "TT;>;"
        }
    .end annotation

    .line 22
    iget-object v0, p0, Lio/gsonfire/ClassConfig;->clazz:Ljava/lang/Class;

    return-object v0
.end method

.method public getPostProcessors()Ljava/util/Collection;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Collection<",
            "Lio/gsonfire/PostProcessor<",
            "TT;>;>;"
        }
    .end annotation

    .line 34
    iget-object v0, p0, Lio/gsonfire/ClassConfig;->postProcessors:Ljava/util/Collection;

    if-nez v0, :cond_0

    .line 35
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lio/gsonfire/ClassConfig;->postProcessors:Ljava/util/Collection;

    .line 37
    :cond_0
    iget-object v0, p0, Lio/gsonfire/ClassConfig;->postProcessors:Ljava/util/Collection;

    return-object v0
.end method

.method public getPreProcessors()Ljava/util/Collection;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Collection<",
            "Lio/gsonfire/PreProcessor<",
            "TT;>;>;"
        }
    .end annotation

    .line 41
    iget-object v0, p0, Lio/gsonfire/ClassConfig;->preProcessors:Ljava/util/Collection;

    if-nez v0, :cond_0

    .line 42
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lio/gsonfire/ClassConfig;->preProcessors:Ljava/util/Collection;

    .line 44
    :cond_0
    iget-object v0, p0, Lio/gsonfire/ClassConfig;->preProcessors:Ljava/util/Collection;

    return-object v0
.end method

.method public getTypeSelector()Lio/gsonfire/TypeSelector;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lio/gsonfire/TypeSelector<",
            "-TT;>;"
        }
    .end annotation

    .line 26
    iget-object v0, p0, Lio/gsonfire/ClassConfig;->typeSelector:Lio/gsonfire/TypeSelector;

    return-object v0
.end method

.method public isHooksEnabled()Z
    .locals 1

    .line 48
    iget-boolean v0, p0, Lio/gsonfire/ClassConfig;->hooksEnabled:Z

    return v0
.end method
