.class public final synthetic Lcom/ibotta/android/util/AppHelper$-CC;
.super Ljava/lang/Object;
.source "AppHelper.java"


# direct methods
.method public static cast(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/lang/Object;",
            ")TT;"
        }
    .end annotation

    return-object p0
.end method

.method public static getStreamOf(Ljava/util/Collection;)Ljava9/util/stream/Stream;
    .locals 1
    .param p0    # Ljava/util/Collection;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/util/Collection<",
            "TT;>;)",
            "Ljava9/util/stream/Stream<",
            "TT;>;"
        }
    .end annotation

    .line 109
    invoke-static {p0}, Ljava9/util/Optional;->ofNullable(Ljava/lang/Object;)Ljava9/util/Optional;

    move-result-object p0

    sget-object v0, Lcom/ibotta/android/util/-$$Lambda$yJ-stdYs6LKqqVguUkgnBhLRaTk;->INSTANCE:Lcom/ibotta/android/util/-$$Lambda$yJ-stdYs6LKqqVguUkgnBhLRaTk;

    invoke-virtual {p0, v0}, Ljava9/util/Optional;->map(Ljava9/util/function/Function;)Ljava9/util/Optional;

    move-result-object p0

    sget-object v0, Lcom/ibotta/android/util/-$$Lambda$shdRqn5vzkwW22Ga8zG15IbM0wQ;->INSTANCE:Lcom/ibotta/android/util/-$$Lambda$shdRqn5vzkwW22Ga8zG15IbM0wQ;

    invoke-virtual {p0, v0}, Ljava9/util/Optional;->orElseGet(Ljava9/util/function/Supplier;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava9/util/stream/Stream;

    return-object p0
.end method

.method public static sanitizeNull(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0
    .param p0    # Ljava/lang/Object;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(TT;TT;)TT;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/Contract;
        value = "null, !null -> !null; _, null -> fail"
    .end annotation

    .line 81
    invoke-static {p1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    if-eqz p0, :cond_0

    goto :goto_0

    :cond_0
    move-object p0, p1

    :goto_0
    return-object p0
.end method

.method public static sanitizeNull(Ljava/lang/Object;Ljava/lang/Object;Ljava9/util/function/Supplier;)Ljava/lang/Object;
    .locals 0
    .param p0    # Ljava/lang/Object;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            "S:",
            "Ljava/lang/Object;",
            ">(TT;TS;",
            "Ljava9/util/function/Supplier<",
            "TS;>;)TS;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/Contract;
        value = "null, !null, _ -> !null; _, null, _ -> fail; !null, _, null -> fail"
    .end annotation

    .line 90
    invoke-static {p1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    if-nez p0, :cond_0

    return-object p1

    :cond_0
    if-eqz p2, :cond_1

    .line 94
    invoke-interface {p2}, Ljava9/util/function/Supplier;->get()Ljava/lang/Object;

    move-result-object p0

    return-object p0

    .line 95
    :cond_1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object p2

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object p1

    invoke-virtual {p2, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_2

    .line 96
    invoke-static {p0}, Lcom/ibotta/android/util/AppHelper$-CC;->cast(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    return-object p0

    .line 98
    :cond_2
    new-instance p0, Ljava/lang/IllegalArgumentException;

    const-string p1, "Value passed is non-null but no mutator given"

    invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0
.end method
