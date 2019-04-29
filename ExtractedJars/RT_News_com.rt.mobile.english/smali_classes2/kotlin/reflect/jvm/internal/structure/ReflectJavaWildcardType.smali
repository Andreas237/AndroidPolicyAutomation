.class public final Lkotlin/reflect/jvm/internal/structure/ReflectJavaWildcardType;
.super Lkotlin/reflect/jvm/internal/structure/ReflectJavaType;
.source "ReflectJavaWildcardType.kt"

# interfaces
.implements Lkotlin/reflect/jvm/internal/impl/load/java/structure/JavaWildcardType;


# annotations
.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nReflectJavaWildcardType.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ReflectJavaWildcardType.kt\nkotlin/reflect/jvm/internal/structure/ReflectJavaWildcardType\n*L\n1#1,40:1\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    bv = {
        0x1,
        0x0,
        0x3
    }
    d1 = {
        "\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0010\u000b\n\u0002\u0008\u0004\u0018\u00002\u00020\u00012\u00020\u0002B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\u0002\u0010\u0005R\u0016\u0010\u0006\u001a\u0004\u0018\u00010\u00018VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u0007\u0010\u0008R\u0014\u0010\t\u001a\u00020\n8VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\t\u0010\u000bR\u0014\u0010\u0003\u001a\u00020\u0004X\u0094\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000c\u0010\r\u00a8\u0006\u000e"
    }
    d2 = {
        "Lkotlin/reflect/jvm/internal/structure/ReflectJavaWildcardType;",
        "Lkotlin/reflect/jvm/internal/structure/ReflectJavaType;",
        "Lkotlin/reflect/jvm/internal/impl/load/java/structure/JavaWildcardType;",
        "reflectType",
        "Ljava/lang/reflect/WildcardType;",
        "(Ljava/lang/reflect/WildcardType;)V",
        "bound",
        "getBound",
        "()Lkotlin/reflect/jvm/internal/structure/ReflectJavaType;",
        "isExtends",
        "",
        "()Z",
        "getReflectType",
        "()Ljava/lang/reflect/WildcardType;",
        "descriptors.runtime"
    }
    k = 0x1
    mv = {
        0x1,
        0x1,
        0xd
    }
.end annotation


# instance fields
.field private final reflectType:Ljava/lang/reflect/WildcardType;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# direct methods
.method public constructor <init>(Ljava/lang/reflect/WildcardType;)V
    .locals 1
    .param p1    # Ljava/lang/reflect/WildcardType;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "reflectType"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 22
    invoke-direct {p0}, Lkotlin/reflect/jvm/internal/structure/ReflectJavaType;-><init>()V

    iput-object p1, p0, Lkotlin/reflect/jvm/internal/structure/ReflectJavaWildcardType;->reflectType:Ljava/lang/reflect/WildcardType;

    return-void
.end method


# virtual methods
.method public bridge synthetic getBound()Lkotlin/reflect/jvm/internal/impl/load/java/structure/JavaType;
    .locals 1

    .line 22
    invoke-virtual {p0}, Lkotlin/reflect/jvm/internal/structure/ReflectJavaWildcardType;->getBound()Lkotlin/reflect/jvm/internal/structure/ReflectJavaType;

    move-result-object v0

    check-cast v0, Lkotlin/reflect/jvm/internal/impl/load/java/structure/JavaType;

    return-object v0
.end method

.method public getBound()Lkotlin/reflect/jvm/internal/structure/ReflectJavaType;
    .locals 5
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 25
    invoke-virtual {p0}, Lkotlin/reflect/jvm/internal/structure/ReflectJavaWildcardType;->getReflectType()Ljava/lang/reflect/WildcardType;

    move-result-object v0

    invoke-interface {v0}, Ljava/lang/reflect/WildcardType;->getUpperBounds()[Ljava/lang/reflect/Type;

    move-result-object v0

    .line 26
    invoke-virtual {p0}, Lkotlin/reflect/jvm/internal/structure/ReflectJavaWildcardType;->getReflectType()Ljava/lang/reflect/WildcardType;

    move-result-object v1

    invoke-interface {v1}, Ljava/lang/reflect/WildcardType;->getLowerBounds()[Ljava/lang/reflect/Type;

    move-result-object v1

    const/4 v2, 0x1

    .line 27
    array-length v3, v0

    if-gt v3, v2, :cond_3

    array-length v3, v1

    if-le v3, v2, :cond_0

    goto :goto_1

    :cond_0
    const/4 v3, 0x0

    .line 31
    array-length v4, v1

    if-ne v4, v2, :cond_1

    sget-object v0, Lkotlin/reflect/jvm/internal/structure/ReflectJavaType;->Factory:Lkotlin/reflect/jvm/internal/structure/ReflectJavaType$Factory;

    const-string v2, "lowerBounds"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v1}, Lkotlin/collections/ArraysKt;->single([Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    const-string v2, "lowerBounds.single()"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v1, Ljava/lang/reflect/Type;

    invoke-virtual {v0, v1}, Lkotlin/reflect/jvm/internal/structure/ReflectJavaType$Factory;->create(Ljava/lang/reflect/Type;)Lkotlin/reflect/jvm/internal/structure/ReflectJavaType;

    move-result-object v3

    goto :goto_0

    .line 32
    :cond_1
    array-length v1, v0

    if-ne v1, v2, :cond_2

    const-string v1, "upperBounds"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v0}, Lkotlin/collections/ArraysKt;->single([Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/reflect/Type;

    const-class v1, Ljava/lang/Object;

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    xor-int/2addr v1, v2

    if-eqz v1, :cond_2

    sget-object v1, Lkotlin/reflect/jvm/internal/structure/ReflectJavaType;->Factory:Lkotlin/reflect/jvm/internal/structure/ReflectJavaType$Factory;

    const-string v2, "ub"

    invoke-static {v0, v2}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v1, v0}, Lkotlin/reflect/jvm/internal/structure/ReflectJavaType$Factory;->create(Ljava/lang/reflect/Type;)Lkotlin/reflect/jvm/internal/structure/ReflectJavaType;

    move-result-object v3

    :cond_2
    :goto_0
    return-object v3

    .line 28
    :cond_3
    :goto_1
    new-instance v0, Ljava/lang/UnsupportedOperationException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Wildcard types with many bounds are not yet supported: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Lkotlin/reflect/jvm/internal/structure/ReflectJavaWildcardType;->getReflectType()Ljava/lang/reflect/WildcardType;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    check-cast v0, Ljava/lang/Throwable;

    throw v0
.end method

.method public bridge synthetic getReflectType()Ljava/lang/reflect/Type;
    .locals 1

    .line 22
    invoke-virtual {p0}, Lkotlin/reflect/jvm/internal/structure/ReflectJavaWildcardType;->getReflectType()Ljava/lang/reflect/WildcardType;

    move-result-object v0

    check-cast v0, Ljava/lang/reflect/Type;

    return-object v0
.end method

.method protected getReflectType()Ljava/lang/reflect/WildcardType;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 22
    iget-object v0, p0, Lkotlin/reflect/jvm/internal/structure/ReflectJavaWildcardType;->reflectType:Ljava/lang/reflect/WildcardType;

    return-object v0
.end method

.method public isExtends()Z
    .locals 2

    .line 38
    invoke-virtual {p0}, Lkotlin/reflect/jvm/internal/structure/ReflectJavaWildcardType;->getReflectType()Ljava/lang/reflect/WildcardType;

    move-result-object v0

    invoke-interface {v0}, Ljava/lang/reflect/WildcardType;->getUpperBounds()[Ljava/lang/reflect/Type;

    move-result-object v0

    const-string v1, "reflectType.upperBounds"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v0}, Lkotlin/collections/ArraysKt;->firstOrNull([Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/reflect/Type;

    const-class v1, Ljava/lang/Object;

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    xor-int/lit8 v0, v0, 0x1

    return v0
.end method
