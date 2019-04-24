.class Lkotlin/collections/SetsKt__SetsKt;
.super Lkotlin/collections/SetsKt__SetsJVMKt;
.source "Sets.kt"


# annotations
.annotation runtime Lkotlin/Metadata;
    bv = {
        0x1,
        0x0,
        0x3
    }
    d1 = {
        "\u00000\n\u0000\n\u0002\u0010\"\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010#\n\u0002\u0008\u0005\u001a\u0012\u0010\u0000\u001a\u0008\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\u0008\u0000\u0010\u0002\u001a\u001f\u0010\u0003\u001a\u0012\u0012\u0004\u0012\u0002H\u00020\u0004j\u0008\u0012\u0004\u0012\u0002H\u0002`\u0005\"\u0004\u0008\u0000\u0010\u0002H\u0087\u0008\u001a5\u0010\u0003\u001a\u0012\u0012\u0004\u0012\u0002H\u00020\u0004j\u0008\u0012\u0004\u0012\u0002H\u0002`\u0005\"\u0004\u0008\u0000\u0010\u00022\u0012\u0010\u0006\u001a\n\u0012\u0006\u0008\u0001\u0012\u0002H\u00020\u0007\"\u0002H\u0002\u00a2\u0006\u0002\u0010\u0008\u001a\u001f\u0010\t\u001a\u0012\u0012\u0004\u0012\u0002H\u00020\nj\u0008\u0012\u0004\u0012\u0002H\u0002`\u000b\"\u0004\u0008\u0000\u0010\u0002H\u0087\u0008\u001a5\u0010\t\u001a\u0012\u0012\u0004\u0012\u0002H\u00020\nj\u0008\u0012\u0004\u0012\u0002H\u0002`\u000b\"\u0004\u0008\u0000\u0010\u00022\u0012\u0010\u0006\u001a\n\u0012\u0006\u0008\u0001\u0012\u0002H\u00020\u0007\"\u0002H\u0002\u00a2\u0006\u0002\u0010\u000c\u001a\u0015\u0010\r\u001a\u0008\u0012\u0004\u0012\u0002H\u00020\u000e\"\u0004\u0008\u0000\u0010\u0002H\u0087\u0008\u001a+\u0010\r\u001a\u0008\u0012\u0004\u0012\u0002H\u00020\u000e\"\u0004\u0008\u0000\u0010\u00022\u0012\u0010\u0006\u001a\n\u0012\u0006\u0008\u0001\u0012\u0002H\u00020\u0007\"\u0002H\u0002\u00a2\u0006\u0002\u0010\u000f\u001a\u0015\u0010\u0010\u001a\u0008\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\u0008\u0000\u0010\u0002H\u0087\u0008\u001a+\u0010\u0010\u001a\u0008\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\u0008\u0000\u0010\u00022\u0012\u0010\u0006\u001a\n\u0012\u0006\u0008\u0001\u0012\u0002H\u00020\u0007\"\u0002H\u0002\u00a2\u0006\u0002\u0010\u000f\u001a\u001e\u0010\u0011\u001a\u0008\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\u0008\u0000\u0010\u0002*\u0008\u0012\u0004\u0012\u0002H\u00020\u0001H\u0000\u001a!\u0010\u0012\u001a\u0008\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\u0008\u0000\u0010\u0002*\n\u0012\u0004\u0012\u0002H\u0002\u0018\u00010\u0001H\u0087\u0008\u00a8\u0006\u0013"
    }
    d2 = {
        "emptySet",
        "",
        "T",
        "hashSetOf",
        "Ljava/util/HashSet;",
        "Lkotlin/collections/HashSet;",
        "elements",
        "",
        "([Ljava/lang/Object;)Ljava/util/HashSet;",
        "linkedSetOf",
        "Ljava/util/LinkedHashSet;",
        "Lkotlin/collections/LinkedHashSet;",
        "([Ljava/lang/Object;)Ljava/util/LinkedHashSet;",
        "mutableSetOf",
        "",
        "([Ljava/lang/Object;)Ljava/util/Set;",
        "setOf",
        "optimizeReadOnlySet",
        "orEmpty",
        "kotlin-stdlib"
    }
    k = 0x5
    mv = {
        0x1,
        0x1,
        0xd
    }
    xi = 0x1
    xs = "kotlin/collections/SetsKt"
.end annotation


# direct methods
.method public static final emptySet()Ljava/util/Set;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">()",
            "Ljava/util/Set<",
            "TT;>;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 34
    sget-object v0, Lkotlin/collections/EmptySet;->INSTANCE:Lkotlin/collections/EmptySet;

    check-cast v0, Ljava/util/Set;

    return-object v0
.end method

.method public static final varargs setOf([Ljava/lang/Object;)Ljava/util/Set;
    .locals 1
    .param p0    # [Ljava/lang/Object;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">([TT;)",
            "Ljava/util/Set<",
            "TT;>;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    const-string v0, "elements"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 42
    array-length v0, p0

    if-lez v0, :cond_0

    invoke-static {p0}, Lkotlin/collections/ArraysKt;->toSet([Ljava/lang/Object;)Ljava/util/Set;

    move-result-object p0

    goto :goto_0

    :cond_0
    invoke-static {}, Lkotlin/collections/SetsKt;->emptySet()Ljava/util/Set;

    move-result-object p0

    :goto_0
    return-object p0
.end method
