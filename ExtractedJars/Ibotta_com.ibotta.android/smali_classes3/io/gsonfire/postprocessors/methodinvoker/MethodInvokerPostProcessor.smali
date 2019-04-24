.class public final Lio/gsonfire/postprocessors/methodinvoker/MethodInvokerPostProcessor;
.super Ljava/lang/Object;
.source "MethodInvokerPostProcessor.java"

# interfaces
.implements Lio/gsonfire/PostProcessor;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;",
        "Lio/gsonfire/PostProcessor<",
        "TT;>;"
    }
.end annotation


# static fields
.field private static methodInspector:Lio/gsonfire/postprocessors/methodinvoker/MappedMethodInspector;


# instance fields
.field private final serializationExclusionStrategy:Lio/gsonfire/gson/FireExclusionStrategy;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 18
    new-instance v0, Lio/gsonfire/postprocessors/methodinvoker/MappedMethodInspector;

    invoke-direct {v0}, Lio/gsonfire/postprocessors/methodinvoker/MappedMethodInspector;-><init>()V

    sput-object v0, Lio/gsonfire/postprocessors/methodinvoker/MethodInvokerPostProcessor;->methodInspector:Lio/gsonfire/postprocessors/methodinvoker/MappedMethodInspector;

    return-void
.end method

.method public constructor <init>()V
    .locals 2

    .line 23
    new-instance v0, Lio/gsonfire/gson/FireExclusionStrategyComposite;

    const/4 v1, 0x0

    new-array v1, v1, [Lio/gsonfire/gson/FireExclusionStrategy;

    invoke-direct {v0, v1}, Lio/gsonfire/gson/FireExclusionStrategyComposite;-><init>([Lio/gsonfire/gson/FireExclusionStrategy;)V

    invoke-direct {p0, v0}, Lio/gsonfire/postprocessors/methodinvoker/MethodInvokerPostProcessor;-><init>(Lio/gsonfire/gson/FireExclusionStrategy;)V

    return-void
.end method

.method public constructor <init>(Lio/gsonfire/gson/FireExclusionStrategy;)V
    .locals 0

    .line 26
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 27
    iput-object p1, p0, Lio/gsonfire/postprocessors/methodinvoker/MethodInvokerPostProcessor;->serializationExclusionStrategy:Lio/gsonfire/gson/FireExclusionStrategy;

    return-void
.end method


# virtual methods
.method public postDeserialize(Ljava/lang/Object;Lcom/google/gson/JsonElement;Lcom/google/gson/Gson;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;",
            "Lcom/google/gson/JsonElement;",
            "Lcom/google/gson/Gson;",
            ")V"
        }
    .end annotation

    return-void
.end method

.method public postSerialize(Lcom/google/gson/JsonElement;Ljava/lang/Object;Lcom/google/gson/Gson;)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/gson/JsonElement;",
            "TT;",
            "Lcom/google/gson/Gson;",
            ")V"
        }
    .end annotation

    .line 37
    invoke-virtual {p1}, Lcom/google/gson/JsonElement;->isJsonObject()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 38
    invoke-virtual {p1}, Lcom/google/gson/JsonElement;->getAsJsonObject()Lcom/google/gson/JsonObject;

    move-result-object p1

    .line 39
    sget-object v0, Lio/gsonfire/postprocessors/methodinvoker/MethodInvokerPostProcessor;->methodInspector:Lio/gsonfire/postprocessors/methodinvoker/MappedMethodInspector;

    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    const-class v2, Lio/gsonfire/annotations/ExposeMethodResult;

    invoke-virtual {v0, v1, v2}, Lio/gsonfire/postprocessors/methodinvoker/MappedMethodInspector;->getAnnotatedMembers(Ljava/lang/Class;Ljava/lang/Class;)Ljava/util/Collection;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lio/gsonfire/postprocessors/methodinvoker/MappedMethod;

    .line 40
    iget-object v2, p0, Lio/gsonfire/postprocessors/methodinvoker/MethodInvokerPostProcessor;->serializationExclusionStrategy:Lio/gsonfire/gson/FireExclusionStrategy;

    invoke-interface {v2, v1}, Lio/gsonfire/gson/FireExclusionStrategy;->shouldSkipMethod(Lio/gsonfire/postprocessors/methodinvoker/MappedMethod;)Z

    move-result v2

    if-nez v2, :cond_0

    .line 42
    :try_start_0
    invoke-virtual {v1}, Lio/gsonfire/postprocessors/methodinvoker/MappedMethod;->getConflictResolutionStrategy()Lio/gsonfire/annotations/ExposeMethodResult$ConflictResolutionStrategy;

    move-result-object v2

    sget-object v3, Lio/gsonfire/annotations/ExposeMethodResult$ConflictResolutionStrategy;->OVERWRITE:Lio/gsonfire/annotations/ExposeMethodResult$ConflictResolutionStrategy;

    if-eq v2, v3, :cond_1

    invoke-virtual {v1}, Lio/gsonfire/postprocessors/methodinvoker/MappedMethod;->getConflictResolutionStrategy()Lio/gsonfire/annotations/ExposeMethodResult$ConflictResolutionStrategy;

    move-result-object v2

    sget-object v3, Lio/gsonfire/annotations/ExposeMethodResult$ConflictResolutionStrategy;->SKIP:Lio/gsonfire/annotations/ExposeMethodResult$ConflictResolutionStrategy;

    if-ne v2, v3, :cond_0

    invoke-virtual {v1}, Lio/gsonfire/postprocessors/methodinvoker/MappedMethod;->getSerializedName()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p1, v2}, Lcom/google/gson/JsonObject;->has(Ljava/lang/String;)Z

    move-result v2

    if-nez v2, :cond_0

    .line 43
    :cond_1
    invoke-virtual {v1}, Lio/gsonfire/postprocessors/methodinvoker/MappedMethod;->getMethod()Ljava/lang/reflect/Method;

    move-result-object v2

    const/4 v3, 0x0

    new-array v3, v3, [Ljava/lang/Object;

    invoke-virtual {v2, p2, v3}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    .line 44
    invoke-virtual {v1}, Lio/gsonfire/postprocessors/methodinvoker/MappedMethod;->getSerializedName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p3, v2}, Lcom/google/gson/Gson;->toJsonTree(Ljava/lang/Object;)Lcom/google/gson/JsonElement;

    move-result-object v2

    invoke-virtual {p1, v1, v2}, Lcom/google/gson/JsonObject;->add(Ljava/lang/String;Lcom/google/gson/JsonElement;)V
    :try_end_0
    .catch Ljava/lang/IllegalAccessException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/reflect/InvocationTargetException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v1

    .line 49
    invoke-virtual {v1}, Ljava/lang/reflect/InvocationTargetException;->printStackTrace()V

    goto :goto_0

    :catch_1
    move-exception v1

    .line 47
    invoke-virtual {v1}, Ljava/lang/IllegalAccessException;->printStackTrace()V

    goto :goto_0

    :cond_2
    return-void
.end method
