.class Lkotlin/io/FilesKt__FilePathComponentsKt;
.super Ljava/lang/Object;
.source "FilePathComponents.kt"


# annotations
.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nFilePathComponents.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FilePathComponents.kt\nkotlin/io/FilesKt__FilePathComponentsKt\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,144:1\n1216#2:145\n1285#2,3:146\n*E\n*S KotlinDebug\n*F\n+ 1 FilePathComponents.kt\nkotlin/io/FilesKt__FilePathComponentsKt\n*L\n129#1:145\n129#1,3:146\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    bv = {
        0x1,
        0x0,
        0x2
    }
    d1 = {
        "\u0000$\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0010\u000e\n\u0002\u0008\u0003\n\u0002\u0010\u0008\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0000\u001a\u0011\u0010\u000b\u001a\u00020\u000c*\u00020\u0008H\u0002\u00a2\u0006\u0002\u0008\r\u001a\u001c\u0010\u000e\u001a\u00020\u0002*\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u000c2\u0006\u0010\u0010\u001a\u00020\u000cH\u0000\u001a\u000c\u0010\u0011\u001a\u00020\u0012*\u00020\u0002H\u0000\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F\u00a2\u0006\u0006\u001a\u0004\u0008\u0000\u0010\u0003\"\u0018\u0010\u0004\u001a\u00020\u0002*\u00020\u00028@X\u0080\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u0005\u0010\u0006\"\u0018\u0010\u0007\u001a\u00020\u0008*\u00020\u00028@X\u0080\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\t\u0010\n\u00a8\u0006\u0013"
    }
    d2 = {
        "isRooted",
        "",
        "Ljava/io/File;",
        "(Ljava/io/File;)Z",
        "root",
        "getRoot",
        "(Ljava/io/File;)Ljava/io/File;",
        "rootName",
        "",
        "getRootName",
        "(Ljava/io/File;)Ljava/lang/String;",
        "getRootLength",
        "",
        "getRootLength$FilesKt__FilePathComponentsKt",
        "subPath",
        "beginIndex",
        "endIndex",
        "toComponents",
        "Lkotlin/io/FilePathComponents;",
        "kotlin-stdlib"
    }
    k = 0x5
    mv = {
        0x1,
        0x1,
        0x7
    }
    xi = 0x1
    xs = "kotlin/io/FilesKt"
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static final getRoot(Ljava/io/File;)Ljava/io/File;
    .locals 2
    .param p0, "$receiver"    # Ljava/io/File;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .prologue
    const-string/jumbo v0, "$receiver"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 73
    new-instance v0, Ljava/io/File;

    invoke-static {p0}, Lkotlin/io/FilesKt;->getRootName(Ljava/io/File;)Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    return-object v0
.end method

.method private static final getRootLength$FilesKt__FilePathComponentsKt(Ljava/lang/String;)I
    .locals 14
    .param p0, "$receiver"    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .prologue
    const/4 v8, 0x2

    const/4 v4, 0x4

    const/4 v13, 0x1

    const/4 v5, 0x0

    const/4 v2, 0x0

    .line 24
    move-object v0, p0

    check-cast v0, Ljava/lang/CharSequence;

    sget-char v1, Ljava/io/File;->separatorChar:C

    move v3, v2

    invoke-static/range {v0 .. v5}, Lkotlin/text/StringsKt;->indexOf$default(Ljava/lang/CharSequence;CIZILjava/lang/Object;)I

    move-result v12

    .line 25
    .local v12, "first":I
    if-nez v12, :cond_3

    .line 26
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v0

    if-le v0, v13, :cond_2

    invoke-virtual {p0, v13}, Ljava/lang/String;->charAt(I)C

    move-result v0

    sget-char v1, Ljava/io/File;->separatorChar:C

    if-ne v0, v1, :cond_2

    move-object v6, p0

    .line 30
    check-cast v6, Ljava/lang/CharSequence;

    sget-char v7, Ljava/io/File;->separatorChar:C

    move v9, v2

    move v10, v4

    move-object v11, v5

    invoke-static/range {v6 .. v11}, Lkotlin/text/StringsKt;->indexOf$default(Ljava/lang/CharSequence;CIZILjava/lang/Object;)I

    move-result v12

    .line 31
    if-ltz v12, :cond_2

    move-object v6, p0

    .line 32
    check-cast v6, Ljava/lang/CharSequence;

    sget-char v7, Ljava/io/File;->separatorChar:C

    add-int/lit8 v8, v12, 0x1

    move v9, v2

    move v10, v4

    move-object v11, v5

    invoke-static/range {v6 .. v11}, Lkotlin/text/StringsKt;->indexOf$default(Ljava/lang/CharSequence;CIZILjava/lang/Object;)I

    move-result v12

    .line 33
    if-ltz v12, :cond_1

    .line 34
    add-int/lit8 v2, v12, 0x1

    .line 49
    :cond_0
    :goto_0
    return v2

    .line 36
    :cond_1
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v2

    goto :goto_0

    :cond_2
    move v2, v13

    .line 39
    goto :goto_0

    .line 42
    :cond_3
    if-lez v12, :cond_4

    add-int/lit8 v0, v12, -0x1

    invoke-virtual {p0, v0}, Ljava/lang/String;->charAt(I)C

    move-result v0

    const/16 v1, 0x3a

    if-ne v0, v1, :cond_4

    .line 43
    add-int/lit8 v12, v12, 0x1

    move v2, v12

    .line 44
    goto :goto_0

    .line 47
    :cond_4
    const/4 v0, -0x1

    if-ne v12, v0, :cond_0

    move-object v0, p0

    check-cast v0, Ljava/lang/CharSequence;

    const/16 v1, 0x3a

    invoke-static {v0, v1, v2, v8, v5}, Lkotlin/text/StringsKt;->endsWith$default(Ljava/lang/CharSequence;CZILjava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 48
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v2

    goto :goto_0
.end method

.method public static final getRootName(Ljava/io/File;)Ljava/lang/String;
    .locals 3
    .param p0, "$receiver"    # Ljava/io/File;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .prologue
    const-string/jumbo v0, "$receiver"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 66
    invoke-virtual {p0}, Ljava/io/File;->getPath()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {p0}, Ljava/io/File;->getPath()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Lkotlin/io/FilesKt__FilePathComponentsKt;->getRootLength$FilesKt__FilePathComponentsKt(Ljava/lang/String;)I

    move-result v2

    if-nez v0, :cond_0

    new-instance v0, Lkotlin/TypeCastException;

    const-string/jumbo v1, "null cannot be cast to non-null type java.lang.String"

    invoke-direct {v0, v1}, Lkotlin/TypeCastException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_0
    invoke-virtual {v0, v1, v2}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v0

    const-string/jumbo v1, "(this as java.lang.Strin\u2026ing(startIndex, endIndex)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v0
.end method

.method public static final isRooted(Ljava/io/File;)Z
    .locals 1
    .param p0, "$receiver"    # Ljava/io/File;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .prologue
    const-string/jumbo v0, "$receiver"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 81
    invoke-virtual {p0}, Ljava/io/File;->getPath()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lkotlin/io/FilesKt__FilePathComponentsKt;->getRootLength$FilesKt__FilePathComponentsKt(Ljava/lang/String;)I

    move-result v0

    if-lez v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public static final subPath(Ljava/io/File;II)Ljava/io/File;
    .locals 1
    .param p0, "$receiver"    # Ljava/io/File;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p1, "beginIndex"    # I
    .param p2, "endIndex"    # I
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .prologue
    const-string/jumbo v0, "$receiver"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 143
    invoke-static {p0}, Lkotlin/io/FilesKt;->toComponents(Ljava/io/File;)Lkotlin/io/FilePathComponents;

    move-result-object v0

    invoke-virtual {v0, p1, p2}, Lkotlin/io/FilePathComponents;->subPath(II)Ljava/io/File;

    move-result-object v0

    return-object v0
.end method

.method public static final toComponents(Ljava/io/File;)Lkotlin/io/FilePathComponents;
    .locals 14
    .param p0, "$receiver"    # Ljava/io/File;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .prologue
    const/4 v1, 0x1

    const/4 v2, 0x0

    const-string/jumbo v0, "$receiver"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 125
    invoke-virtual {p0}, Ljava/io/File;->getPath()Ljava/lang/String;

    move-result-object v10

    .line 126
    .local v10, "path":Ljava/lang/String;
    invoke-static {v10}, Lkotlin/io/FilesKt__FilePathComponentsKt;->getRootLength$FilesKt__FilePathComponentsKt(Ljava/lang/String;)I

    move-result v11

    .line 127
    .local v11, "rootLength":I
    if-nez v10, :cond_0

    new-instance v0, Lkotlin/TypeCastException;

    const-string/jumbo v1, "null cannot be cast to non-null type java.lang.String"

    invoke-direct {v0, v1}, Lkotlin/TypeCastException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_0
    invoke-virtual {v10, v2, v11}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v12

    const-string/jumbo v0, "(this as java.lang.Strin\u2026ing(startIndex, endIndex)"

    invoke-static {v12, v0}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 128
    .local v12, "rootName":Ljava/lang/String;
    if-nez v10, :cond_1

    new-instance v0, Lkotlin/TypeCastException;

    const-string/jumbo v1, "null cannot be cast to non-null type java.lang.String"

    invoke-direct {v0, v1}, Lkotlin/TypeCastException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1
    invoke-virtual {v10, v11}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v13

    const-string/jumbo v0, "(this as java.lang.String).substring(startIndex)"

    invoke-static {v13, v0}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .local v13, "subPath":Ljava/lang/String;
    move-object v0, v13

    .line 129
    check-cast v0, Ljava/lang/CharSequence;

    invoke-interface {v0}, Ljava/lang/CharSequence;->length()I

    move-result v0

    if-nez v0, :cond_2

    move v0, v1

    :goto_0
    if-eqz v0, :cond_3

    invoke-static {}, Lkotlin/collections/CollectionsKt;->emptyList()Ljava/util/List;

    move-result-object v9

    .line 130
    .local v9, "list":Ljava/util/List;
    :goto_1
    new-instance v0, Lkotlin/io/FilePathComponents;

    new-instance v1, Ljava/io/File;

    invoke-direct {v1, v12}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    invoke-direct {v0, v1, v9}, Lkotlin/io/FilePathComponents;-><init>(Ljava/io/File;Ljava/util/List;)V

    return-object v0

    .end local v9    # "list":Ljava/util/List;
    :cond_2
    move v0, v2

    .line 129
    goto :goto_0

    :cond_3
    move-object v0, v13

    check-cast v0, Ljava/lang/CharSequence;

    new-array v1, v1, [C

    sget-char v3, Ljava/io/File;->separatorChar:C

    aput-char v3, v1, v2

    const/4 v4, 0x6

    const/4 v5, 0x0

    move v3, v2

    invoke-static/range {v0 .. v5}, Lkotlin/text/StringsKt;->split$default(Ljava/lang/CharSequence;[CZIILjava/lang/Object;)Ljava/util/List;

    move-result-object v6

    check-cast v6, Ljava/lang/Iterable;

    .line 145
    .local v6, "$receiver$iv":Ljava/lang/Iterable;
    new-instance v7, Ljava/util/ArrayList;

    const/16 v0, 0xa

    invoke-static {v6, v0}, Lkotlin/collections/CollectionsKt;->collectionSizeOrDefault(Ljava/lang/Iterable;I)I

    move-result v0

    invoke-direct {v7, v0}, Ljava/util/ArrayList;-><init>(I)V

    check-cast v7, Ljava/util/Collection;

    .line 146
    .local v7, "destination$iv$iv":Ljava/util/Collection;
    invoke-interface {v6}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_2
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_4

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v8

    .line 147
    .local v8, "item$iv$iv":Ljava/lang/Object;
    check-cast v8, Ljava/lang/String;

    .end local v8    # "item$iv$iv":Ljava/lang/Object;
    new-instance v1, Ljava/io/File;

    .line 129
    invoke-direct {v1, v8}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    invoke-interface {v7, v1}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_2

    .line 148
    :cond_4
    check-cast v7, Ljava/util/List;

    move-object v9, v7

    goto :goto_1
.end method
