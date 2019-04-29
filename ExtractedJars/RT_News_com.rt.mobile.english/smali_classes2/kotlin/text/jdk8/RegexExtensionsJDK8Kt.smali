.class public final Lkotlin/text/jdk8/RegexExtensionsJDK8Kt;
.super Ljava/lang/Object;
.source "RegexExtensions.kt"


# annotations
.annotation runtime Lkotlin/Metadata;
    bv = {
        0x1,
        0x0,
        0x3
    }
    d1 = {
        "\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u001a\u0017\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\u0087\u0002\u00a8\u0006\u0005"
    }
    d2 = {
        "get",
        "Lkotlin/text/MatchGroup;",
        "Lkotlin/text/MatchGroupCollection;",
        "name",
        "",
        "kotlin-stdlib-jdk8"
    }
    k = 0x2
    mv = {
        0x1,
        0x1,
        0xd
    }
    pn = "kotlin.text"
.end annotation

.annotation build Lkotlin/jvm/JvmName;
    name = "RegexExtensionsJDK8Kt"
.end annotation


# direct methods
.method public static final get(Lkotlin/text/MatchGroupCollection;Ljava/lang/String;)Lkotlin/text/MatchGroup;
    .locals 1
    .param p0    # Lkotlin/text/MatchGroupCollection;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p1    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lkotlin/SinceKotlin;
        version = "1.2"
    .end annotation

    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    const-string v0, "receiver$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "name"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 30
    instance-of v0, p0, Lkotlin/text/MatchNamedGroupCollection;

    if-nez v0, :cond_0

    const/4 p0, 0x0

    :cond_0
    check-cast p0, Lkotlin/text/MatchNamedGroupCollection;

    if-eqz p0, :cond_1

    .line 33
    invoke-interface {p0, p1}, Lkotlin/text/MatchNamedGroupCollection;->get(Ljava/lang/String;)Lkotlin/text/MatchGroup;

    move-result-object p0

    return-object p0

    .line 31
    :cond_1
    new-instance p0, Ljava/lang/UnsupportedOperationException;

    const-string p1, "Retrieving groups by name is not supported on this platform."

    invoke-direct {p0, p1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    check-cast p0, Ljava/lang/Throwable;

    throw p0
.end method
