.class public final Lkotlin/reflect/jvm/internal/impl/metadata/jvm/deserialization/UtfEncodingKt;
.super Ljava/lang/Object;
.source "utfEncoding.kt"


# annotations
.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nutfEncoding.kt\nKotlin\n*S Kotlin\n*F\n+ 1 utfEncoding.kt\norg/jetbrains/kotlin/metadata/jvm/deserialization/UtfEncodingKt\n+ 2 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n+ 3 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,73:1\n37#2,2:74\n12376#3,5:76\n*E\n*S KotlinDebug\n*F\n+ 1 utfEncoding.kt\norg/jetbrains/kotlin/metadata/jvm/deserialization/UtfEncodingKt\n*L\n55#1,2:74\n59#1,5:76\n*E\n"
.end annotation


# direct methods
.method public static final stringsToBytes([Ljava/lang/String;)[B
    .locals 10
    .param p0    # [Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    const-string v0, "strings"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    .line 77
    array-length v1, p0

    move v2, v0

    move v3, v2

    :goto_0
    if-ge v2, v1, :cond_0

    aget-object v4, p0, v2

    .line 59
    invoke-virtual {v4}, Ljava/lang/String;->length()I

    move-result v4

    add-int/2addr v3, v4

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    .line 60
    :cond_0
    new-array v1, v3, [B

    .line 63
    array-length v2, p0

    move v3, v0

    move v4, v3

    :goto_1
    const/4 v5, 0x1

    if-ge v3, v2, :cond_3

    aget-object v6, p0, v3

    .line 64
    invoke-virtual {v6}, Ljava/lang/String;->length()I

    move-result v7

    sub-int/2addr v7, v5

    if-ltz v7, :cond_2

    move v5, v0

    :goto_2
    add-int/lit8 v8, v4, 0x1

    .line 65
    invoke-virtual {v6, v5}, Ljava/lang/String;->charAt(I)C

    move-result v9

    int-to-byte v9, v9

    aput-byte v9, v1, v4

    if-eq v5, v7, :cond_1

    add-int/lit8 v5, v5, 0x1

    move v4, v8

    goto :goto_2

    :cond_1
    move v4, v8

    :cond_2
    add-int/lit8 v3, v3, 0x1

    goto :goto_1

    .line 69
    :cond_3
    array-length p0, v1

    if-ne v4, p0, :cond_4

    move v0, v5

    :cond_4
    sget-boolean p0, Lkotlin/_Assertions;->ENABLED:Z

    if-eqz p0, :cond_5

    if-nez v0, :cond_5

    const-string p0, "Should have reached the end"

    new-instance v0, Ljava/lang/AssertionError;

    invoke-direct {v0, p0}, Ljava/lang/AssertionError;-><init>(Ljava/lang/Object;)V

    check-cast v0, Ljava/lang/Throwable;

    throw v0

    :cond_5
    return-object v1
.end method
