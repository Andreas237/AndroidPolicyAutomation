.class public final Lkotlin/reflect/jvm/internal/impl/metadata/jvm/deserialization/ClassMapperLite;
.super Ljava/lang/Object;
.source "ClassMapperLite.kt"


# annotations
.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nClassMapperLite.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ClassMapperLite.kt\norg/jetbrains/kotlin/metadata/jvm/deserialization/ClassMapperLite\n*L\n1#1,81:1\n*E\n"
.end annotation


# static fields
.field public static final INSTANCE:Lkotlin/reflect/jvm/internal/impl/metadata/jvm/deserialization/ClassMapperLite;

.field private static final map:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 17

    .line 15
    new-instance v0, Lkotlin/reflect/jvm/internal/impl/metadata/jvm/deserialization/ClassMapperLite;

    invoke-direct {v0}, Lkotlin/reflect/jvm/internal/impl/metadata/jvm/deserialization/ClassMapperLite;-><init>()V

    sput-object v0, Lkotlin/reflect/jvm/internal/impl/metadata/jvm/deserialization/ClassMapperLite;->INSTANCE:Lkotlin/reflect/jvm/internal/impl/metadata/jvm/deserialization/ClassMapperLite;

    .line 20
    new-instance v0, Ljava/util/LinkedHashMap;

    invoke-direct {v0}, Ljava/util/LinkedHashMap;-><init>()V

    check-cast v0, Ljava/util/Map;

    const/16 v1, 0x10

    .line 21
    new-array v1, v1, [Ljava/lang/String;

    const-string v2, "Boolean"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const-string v2, "Z"

    const/4 v4, 0x1

    aput-object v2, v1, v4

    const-string v2, "Char"

    const/4 v5, 0x2

    aput-object v2, v1, v5

    const-string v2, "C"

    const/4 v6, 0x3

    aput-object v2, v1, v6

    const-string v2, "Byte"

    const/4 v7, 0x4

    aput-object v2, v1, v7

    const-string v2, "B"

    const/4 v8, 0x5

    aput-object v2, v1, v8

    const-string v2, "Short"

    const/4 v9, 0x6

    aput-object v2, v1, v9

    const-string v2, "S"

    const/4 v10, 0x7

    aput-object v2, v1, v10

    const-string v2, "Int"

    const/16 v11, 0x8

    aput-object v2, v1, v11

    const-string v2, "I"

    const/16 v12, 0x9

    aput-object v2, v1, v12

    const-string v2, "Float"

    const/16 v13, 0xa

    aput-object v2, v1, v13

    const-string v2, "F"

    const/16 v13, 0xb

    aput-object v2, v1, v13

    const-string v2, "Long"

    const/16 v13, 0xc

    aput-object v2, v1, v13

    const-string v2, "J"

    const/16 v13, 0xd

    aput-object v2, v1, v13

    const-string v2, "Double"

    const/16 v13, 0xe

    aput-object v2, v1, v13

    const-string v2, "D"

    const/16 v13, 0xf

    aput-object v2, v1, v13

    invoke-static {v1}, Lkotlin/collections/CollectionsKt;->listOf([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v1

    .line 32
    move-object v2, v1

    check-cast v2, Ljava/util/Collection;

    invoke-static {v2}, Lkotlin/collections/CollectionsKt;->getIndices(Ljava/util/Collection;)Lkotlin/ranges/IntRange;

    move-result-object v2

    check-cast v2, Lkotlin/ranges/IntProgression;

    invoke-static {v2, v5}, Lkotlin/ranges/RangesKt;->step(Lkotlin/ranges/IntProgression;I)Lkotlin/ranges/IntProgression;

    move-result-object v2

    invoke-virtual {v2}, Lkotlin/ranges/IntProgression;->getFirst()I

    move-result v13

    invoke-virtual {v2}, Lkotlin/ranges/IntProgression;->getLast()I

    move-result v14

    invoke-virtual {v2}, Lkotlin/ranges/IntProgression;->getStep()I

    move-result v2

    if-lez v2, :cond_0

    if-gt v13, v14, :cond_1

    goto :goto_0

    :cond_0
    if-lt v13, v14, :cond_1

    .line 33
    :goto_0
    new-instance v15, Ljava/lang/StringBuilder;

    invoke-direct {v15}, Ljava/lang/StringBuilder;-><init>()V

    const-string v11, "kotlin/"

    invoke-virtual {v15, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-interface {v1, v13}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v11

    check-cast v11, Ljava/lang/String;

    invoke-virtual {v15, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v15}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v11

    add-int/lit8 v15, v13, 0x1

    invoke-interface {v1, v15}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v12

    invoke-interface {v0, v11, v12}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 34
    new-instance v11, Ljava/lang/StringBuilder;

    invoke-direct {v11}, Ljava/lang/StringBuilder;-><init>()V

    const-string v12, "kotlin/"

    invoke-virtual {v11, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-interface {v1, v13}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v12

    check-cast v12, Ljava/lang/String;

    invoke-virtual {v11, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v12, "Array"

    invoke-virtual {v11, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v11}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v11

    new-instance v12, Ljava/lang/StringBuilder;

    invoke-direct {v12}, Ljava/lang/StringBuilder;-><init>()V

    const/16 v9, 0x5b

    invoke-virtual {v12, v9}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-interface {v1, v15}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Ljava/lang/String;

    invoke-virtual {v12, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v12}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v9

    invoke-interface {v0, v11, v9}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    if-eq v13, v14, :cond_1

    add-int/2addr v13, v2

    const/4 v9, 0x6

    const/16 v11, 0x8

    const/16 v12, 0x9

    goto :goto_0

    :cond_1
    const-string v1, "kotlin/Unit"

    const-string v2, "V"

    .line 37
    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 39
    new-instance v1, Lkotlin/reflect/jvm/internal/impl/metadata/jvm/deserialization/ClassMapperLite$map$1$1;

    invoke-direct {v1, v0}, Lkotlin/reflect/jvm/internal/impl/metadata/jvm/deserialization/ClassMapperLite$map$1$1;-><init>(Ljava/util/Map;)V

    const-string v2, "Any"

    const-string v9, "java/lang/Object"

    .line 43
    invoke-virtual {v1, v2, v9}, Lkotlin/reflect/jvm/internal/impl/metadata/jvm/deserialization/ClassMapperLite$map$1$1;->invoke(Ljava/lang/String;Ljava/lang/String;)V

    const-string v2, "Nothing"

    const-string v9, "java/lang/Void"

    .line 44
    invoke-virtual {v1, v2, v9}, Lkotlin/reflect/jvm/internal/impl/metadata/jvm/deserialization/ClassMapperLite$map$1$1;->invoke(Ljava/lang/String;Ljava/lang/String;)V

    const-string v2, "Annotation"

    const-string v9, "java/lang/annotation/Annotation"

    .line 45
    invoke-virtual {v1, v2, v9}, Lkotlin/reflect/jvm/internal/impl/metadata/jvm/deserialization/ClassMapperLite$map$1$1;->invoke(Ljava/lang/String;Ljava/lang/String;)V

    .line 47
    new-array v2, v10, [Ljava/lang/String;

    const-string v9, "String"

    aput-object v9, v2, v3

    const-string v9, "CharSequence"

    aput-object v9, v2, v4

    const-string v9, "Throwable"

    aput-object v9, v2, v5

    const-string v9, "Cloneable"

    aput-object v9, v2, v6

    const-string v9, "Number"

    aput-object v9, v2, v7

    const-string v9, "Comparable"

    aput-object v9, v2, v8

    const-string v9, "Enum"

    const/4 v11, 0x6

    aput-object v9, v2, v11

    invoke-static {v2}, Lkotlin/collections/CollectionsKt;->listOf([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v2

    invoke-interface {v2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_1
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v9

    if-eqz v9, :cond_2

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Ljava/lang/String;

    .line 48
    new-instance v11, Ljava/lang/StringBuilder;

    invoke-direct {v11}, Ljava/lang/StringBuilder;-><init>()V

    const-string v12, "java/lang/"

    invoke-virtual {v11, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v11, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v11}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v11

    invoke-virtual {v1, v9, v11}, Lkotlin/reflect/jvm/internal/impl/metadata/jvm/deserialization/ClassMapperLite$map$1$1;->invoke(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_1

    :cond_2
    const/4 v9, 0x6

    .line 51
    new-array v2, v9, [Ljava/lang/String;

    const-string v9, "Iterator"

    aput-object v9, v2, v3

    const-string v9, "Collection"

    aput-object v9, v2, v4

    const-string v9, "List"

    aput-object v9, v2, v5

    const-string v9, "Set"

    aput-object v9, v2, v6

    const-string v9, "Map"

    aput-object v9, v2, v7

    const-string v9, "ListIterator"

    aput-object v9, v2, v8

    invoke-static {v2}, Lkotlin/collections/CollectionsKt;->listOf([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v2

    invoke-interface {v2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_2
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v9

    if-eqz v9, :cond_3

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Ljava/lang/String;

    .line 52
    new-instance v11, Ljava/lang/StringBuilder;

    invoke-direct {v11}, Ljava/lang/StringBuilder;-><init>()V

    const-string v12, "collections/"

    invoke-virtual {v11, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v11, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v11}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v11

    new-instance v12, Ljava/lang/StringBuilder;

    invoke-direct {v12}, Ljava/lang/StringBuilder;-><init>()V

    const-string v13, "java/util/"

    invoke-virtual {v12, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v12, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v12}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v12

    invoke-virtual {v1, v11, v12}, Lkotlin/reflect/jvm/internal/impl/metadata/jvm/deserialization/ClassMapperLite$map$1$1;->invoke(Ljava/lang/String;Ljava/lang/String;)V

    .line 53
    new-instance v11, Ljava/lang/StringBuilder;

    invoke-direct {v11}, Ljava/lang/StringBuilder;-><init>()V

    const-string v12, "collections/Mutable"

    invoke-virtual {v11, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v11, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v11}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v11

    new-instance v12, Ljava/lang/StringBuilder;

    invoke-direct {v12}, Ljava/lang/StringBuilder;-><init>()V

    const-string v13, "java/util/"

    invoke-virtual {v12, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v12, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v12}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v9

    invoke-virtual {v1, v11, v9}, Lkotlin/reflect/jvm/internal/impl/metadata/jvm/deserialization/ClassMapperLite$map$1$1;->invoke(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_2

    :cond_3
    const-string v2, "collections/Iterable"

    const-string v9, "java/lang/Iterable"

    .line 56
    invoke-virtual {v1, v2, v9}, Lkotlin/reflect/jvm/internal/impl/metadata/jvm/deserialization/ClassMapperLite$map$1$1;->invoke(Ljava/lang/String;Ljava/lang/String;)V

    const-string v2, "collections/MutableIterable"

    const-string v9, "java/lang/Iterable"

    .line 57
    invoke-virtual {v1, v2, v9}, Lkotlin/reflect/jvm/internal/impl/metadata/jvm/deserialization/ClassMapperLite$map$1$1;->invoke(Ljava/lang/String;Ljava/lang/String;)V

    const-string v2, "collections/Map.Entry"

    const-string v9, "java/util/Map$Entry"

    .line 58
    invoke-virtual {v1, v2, v9}, Lkotlin/reflect/jvm/internal/impl/metadata/jvm/deserialization/ClassMapperLite$map$1$1;->invoke(Ljava/lang/String;Ljava/lang/String;)V

    const-string v2, "collections/MutableMap.MutableEntry"

    const-string v9, "java/util/Map$Entry"

    .line 59
    invoke-virtual {v1, v2, v9}, Lkotlin/reflect/jvm/internal/impl/metadata/jvm/deserialization/ClassMapperLite$map$1$1;->invoke(Ljava/lang/String;Ljava/lang/String;)V

    const/16 v2, 0x16

    move v9, v3

    :goto_3
    if-gt v9, v2, :cond_4

    .line 62
    new-instance v11, Ljava/lang/StringBuilder;

    invoke-direct {v11}, Ljava/lang/StringBuilder;-><init>()V

    const-string v12, "Function"

    invoke-virtual {v11, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v11, v9}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v11}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v11

    new-instance v12, Ljava/lang/StringBuilder;

    invoke-direct {v12}, Ljava/lang/StringBuilder;-><init>()V

    const-string v13, "kotlin/jvm/functions/Function"

    invoke-virtual {v12, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v12, v9}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v12}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v12

    invoke-virtual {v1, v11, v12}, Lkotlin/reflect/jvm/internal/impl/metadata/jvm/deserialization/ClassMapperLite$map$1$1;->invoke(Ljava/lang/String;Ljava/lang/String;)V

    .line 63
    new-instance v11, Ljava/lang/StringBuilder;

    invoke-direct {v11}, Ljava/lang/StringBuilder;-><init>()V

    const-string v12, "reflect/KFunction"

    invoke-virtual {v11, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v11, v9}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v11}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v11

    const-string v12, "kotlin/reflect/KFunction"

    invoke-virtual {v1, v11, v12}, Lkotlin/reflect/jvm/internal/impl/metadata/jvm/deserialization/ClassMapperLite$map$1$1;->invoke(Ljava/lang/String;Ljava/lang/String;)V

    add-int/lit8 v9, v9, 0x1

    goto :goto_3

    :cond_4
    const/16 v9, 0x9

    .line 68
    new-array v2, v9, [Ljava/lang/String;

    const-string v9, "Char"

    aput-object v9, v2, v3

    const-string v3, "Byte"

    aput-object v3, v2, v4

    const-string v3, "Short"

    aput-object v3, v2, v5

    const-string v3, "Int"

    aput-object v3, v2, v6

    const-string v3, "Float"

    aput-object v3, v2, v7

    const-string v3, "Long"

    aput-object v3, v2, v8

    const-string v3, "Double"

    const/4 v4, 0x6

    aput-object v3, v2, v4

    const-string v3, "String"

    aput-object v3, v2, v10

    const-string v3, "Enum"

    const/16 v4, 0x8

    aput-object v3, v2, v4

    invoke-static {v2}, Lkotlin/collections/CollectionsKt;->listOf([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v2

    invoke-interface {v2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_4
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_5

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    .line 69
    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v5, ".Companion"

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    const-string v6, "kotlin/jvm/internal/"

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v3, "CompanionObject"

    invoke-virtual {v5, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v4, v3}, Lkotlin/reflect/jvm/internal/impl/metadata/jvm/deserialization/ClassMapperLite$map$1$1;->invoke(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_4

    .line 20
    :cond_5
    sput-object v0, Lkotlin/reflect/jvm/internal/impl/metadata/jvm/deserialization/ClassMapperLite;->map:Ljava/util/Map;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    .line 15
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static final mapClass(Ljava/lang/String;)Ljava/lang/String;
    .locals 8
    .param p0    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation runtime Lkotlin/jvm/JvmStatic;
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    const-string v0, "classId"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 78
    sget-object v0, Lkotlin/reflect/jvm/internal/impl/metadata/jvm/deserialization/ClassMapperLite;->map:Ljava/util/Map;

    invoke-interface {v0, p0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const/16 v1, 0x4c

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    const/16 v3, 0x2e

    const/16 v4, 0x24

    const/4 v5, 0x0

    const/4 v6, 0x4

    const/4 v7, 0x0

    move-object v2, p0

    invoke-static/range {v2 .. v7}, Lkotlin/text/StringsKt;->replace$default(Ljava/lang/String;CCZILjava/lang/Object;)Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 p0, 0x3b

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    :goto_0
    return-object v0
.end method
