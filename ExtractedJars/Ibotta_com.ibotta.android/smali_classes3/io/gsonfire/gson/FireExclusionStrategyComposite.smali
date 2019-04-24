.class public final Lio/gsonfire/gson/FireExclusionStrategyComposite;
.super Ljava/lang/Object;
.source "FireExclusionStrategyComposite.java"

# interfaces
.implements Lio/gsonfire/gson/FireExclusionStrategy;


# instance fields
.field private final strategies:Ljava/util/Collection;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Collection<",
            "Lio/gsonfire/gson/FireExclusionStrategy;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Ljava/util/Collection;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Collection<",
            "Lio/gsonfire/gson/FireExclusionStrategy;",
            ">;)V"
        }
    .end annotation

    .line 20
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 21
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0, p1}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    iput-object v0, p0, Lio/gsonfire/gson/FireExclusionStrategyComposite;->strategies:Ljava/util/Collection;

    return-void
.end method

.method public varargs constructor <init>([Lio/gsonfire/gson/FireExclusionStrategy;)V
    .locals 0

    .line 17
    invoke-static {p1}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object p1

    invoke-direct {p0, p1}, Lio/gsonfire/gson/FireExclusionStrategyComposite;-><init>(Ljava/util/Collection;)V

    return-void
.end method


# virtual methods
.method public shouldSkipMethod(Lio/gsonfire/postprocessors/methodinvoker/MappedMethod;)Z
    .locals 2

    .line 26
    iget-object v0, p0, Lio/gsonfire/gson/FireExclusionStrategyComposite;->strategies:Ljava/util/Collection;

    invoke-interface {v0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lio/gsonfire/gson/FireExclusionStrategy;

    .line 27
    invoke-interface {v1, p1}, Lio/gsonfire/gson/FireExclusionStrategy;->shouldSkipMethod(Lio/gsonfire/postprocessors/methodinvoker/MappedMethod;)Z

    move-result v1

    if-eqz v1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_1
    const/4 p1, 0x0

    return p1
.end method
