.class public final Lkotlin/coroutines/experimental/ContinuationInterceptor$DefaultImpls;
.super Ljava/lang/Object;
.source "ContinuationInterceptor.kt"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lkotlin/coroutines/experimental/ContinuationInterceptor;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "DefaultImpls"
.end annotation

.annotation runtime Lkotlin/Metadata;
    bv = {
        0x1,
        0x0,
        0x2
    }
    k = 0x3
    mv = {
        0x1,
        0x1,
        0x7
    }
.end annotation


# direct methods
.method public static fold(Lkotlin/coroutines/experimental/ContinuationInterceptor;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)Ljava/lang/Object;
    .locals 1
    .param p0, "$this"    # Lkotlin/coroutines/experimental/ContinuationInterceptor;
    .param p1, "initial"    # Ljava/lang/Object;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2, "operation"    # Lkotlin/jvm/functions/Function2;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<R:",
            "Ljava/lang/Object;",
            ">(",
            "Lkotlin/coroutines/experimental/ContinuationInterceptor;",
            "TR;",
            "Lkotlin/jvm/functions/Function2",
            "<-TR;-",
            "Lkotlin/coroutines/experimental/CoroutineContext$Element;",
            "+TR;>;)TR;"
        }
    .end annotation

    .prologue
    const-string/jumbo v0, "operation"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p0, Lkotlin/coroutines/experimental/CoroutineContext$Element;

    .end local p0    # "$this":Lkotlin/coroutines/experimental/ContinuationInterceptor;
    invoke-static {p0, p1, p2}, Lkotlin/coroutines/experimental/CoroutineContext$Element$DefaultImpls;->fold(Lkotlin/coroutines/experimental/CoroutineContext$Element;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public static get(Lkotlin/coroutines/experimental/ContinuationInterceptor;Lkotlin/coroutines/experimental/CoroutineContext$Key;)Lkotlin/coroutines/experimental/CoroutineContext$Element;
    .locals 1
    .param p0, "$this"    # Lkotlin/coroutines/experimental/ContinuationInterceptor;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p1, "key"    # Lkotlin/coroutines/experimental/CoroutineContext$Key;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<E::",
            "Lkotlin/coroutines/experimental/CoroutineContext$Element;",
            ">(",
            "Lkotlin/coroutines/experimental/ContinuationInterceptor;",
            "Lkotlin/coroutines/experimental/CoroutineContext$Key",
            "<TE;>;)TE;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .prologue
    const-string/jumbo v0, "key"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p0, Lkotlin/coroutines/experimental/CoroutineContext$Element;

    .end local p0    # "$this":Lkotlin/coroutines/experimental/ContinuationInterceptor;
    invoke-static {p0, p1}, Lkotlin/coroutines/experimental/CoroutineContext$Element$DefaultImpls;->get(Lkotlin/coroutines/experimental/CoroutineContext$Element;Lkotlin/coroutines/experimental/CoroutineContext$Key;)Lkotlin/coroutines/experimental/CoroutineContext$Element;

    move-result-object v0

    return-object v0
.end method

.method public static minusKey(Lkotlin/coroutines/experimental/ContinuationInterceptor;Lkotlin/coroutines/experimental/CoroutineContext$Key;)Lkotlin/coroutines/experimental/CoroutineContext;
    .locals 1
    .param p0, "$this"    # Lkotlin/coroutines/experimental/ContinuationInterceptor;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p1, "key"    # Lkotlin/coroutines/experimental/CoroutineContext$Key;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/coroutines/experimental/ContinuationInterceptor;",
            "Lkotlin/coroutines/experimental/CoroutineContext$Key",
            "<*>;)",
            "Lkotlin/coroutines/experimental/CoroutineContext;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .prologue
    const-string/jumbo v0, "key"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p0, Lkotlin/coroutines/experimental/CoroutineContext$Element;

    .end local p0    # "$this":Lkotlin/coroutines/experimental/ContinuationInterceptor;
    invoke-static {p0, p1}, Lkotlin/coroutines/experimental/CoroutineContext$Element$DefaultImpls;->minusKey(Lkotlin/coroutines/experimental/CoroutineContext$Element;Lkotlin/coroutines/experimental/CoroutineContext$Key;)Lkotlin/coroutines/experimental/CoroutineContext;

    move-result-object v0

    return-object v0
.end method

.method public static plus(Lkotlin/coroutines/experimental/ContinuationInterceptor;Lkotlin/coroutines/experimental/CoroutineContext;)Lkotlin/coroutines/experimental/CoroutineContext;
    .locals 1
    .param p0, "$this"    # Lkotlin/coroutines/experimental/ContinuationInterceptor;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p1, "context"    # Lkotlin/coroutines/experimental/CoroutineContext;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .prologue
    const-string/jumbo v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p0, Lkotlin/coroutines/experimental/CoroutineContext$Element;

    .end local p0    # "$this":Lkotlin/coroutines/experimental/ContinuationInterceptor;
    invoke-static {p0, p1}, Lkotlin/coroutines/experimental/CoroutineContext$Element$DefaultImpls;->plus(Lkotlin/coroutines/experimental/CoroutineContext$Element;Lkotlin/coroutines/experimental/CoroutineContext;)Lkotlin/coroutines/experimental/CoroutineContext;

    move-result-object v0

    return-object v0
.end method
