.class public Lkotlin/reflect/jvm/internal/impl/metadata/jvm/deserialization/BitEncoding;
.super Ljava/lang/Object;
.source "BitEncoding.java"


# static fields
.field static final synthetic $assertionsDisabled:Z

.field private static final FORCE_8TO7_ENCODING:Z


# direct methods
.method static constructor <clinit>()V
    .locals 2

    :try_start_0
    const-string v0, "kotlin.jvm.serialization.use8to7"

    .line 21
    invoke-static {v0}, Ljava/lang/System;->getProperty(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0
    :try_end_0
    .catch Ljava/lang/SecurityException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    const/4 v0, 0x0

    :goto_0
    const-string v1, "true"

    .line 27
    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    sput-boolean v0, Lkotlin/reflect/jvm/internal/impl/metadata/jvm/deserialization/BitEncoding;->FORCE_8TO7_ENCODING:Z

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    .line 32
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private static addModuloByte([BI)V
    .locals 3
    .param p0    # [B
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const/4 v0, 0x0

    .line 114
    array-length v1, p0

    :goto_0
    if-ge v0, v1, :cond_0

    .line 115
    aget-byte v2, p0, v0

    add-int/2addr v2, p1

    and-int/lit8 v2, v2, 0x7f

    int-to-byte v2, v2

    aput-byte v2, p0, v0

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_0
    return-void
.end method

.method private static combineStringArrayIntoBytes([Ljava/lang/String;)[B
    .locals 10
    .param p0    # [Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    const/4 v0, 0x0

    .line 210
    array-length v1, p0

    move v2, v0

    move v3, v2

    :goto_0
    if-ge v2, v1, :cond_0

    aget-object v4, p0, v2

    .line 212
    invoke-virtual {v4}, Ljava/lang/String;->length()I

    move-result v4

    add-int/2addr v3, v4

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    .line 215
    :cond_0
    new-array v1, v3, [B

    .line 217
    array-length v2, p0

    move v3, v0

    move v4, v3

    :goto_1
    if-ge v3, v2, :cond_2

    aget-object v5, p0, v3

    .line 218
    invoke-virtual {v5}, Ljava/lang/String;->length()I

    move-result v6

    move v7, v4

    move v4, v0

    :goto_2
    if-ge v4, v6, :cond_1

    add-int/lit8 v8, v7, 0x1

    .line 219
    invoke-virtual {v5, v4}, Ljava/lang/String;->charAt(I)C

    move-result v9

    int-to-byte v9, v9

    aput-byte v9, v1, v7

    add-int/lit8 v4, v4, 0x1

    move v7, v8

    goto :goto_2

    :cond_1
    add-int/lit8 v3, v3, 0x1

    move v4, v7

    goto :goto_1

    :cond_2
    return-object v1
.end method

.method private static decode7to8([B)[B
    .locals 12
    .param p0    # [B
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    const/4 v0, 0x7

    const/4 v1, 0x0

    .line 247
    array-length v2, p0

    mul-int/2addr v2, v0

    div-int/lit8 v2, v2, 0x8

    .line 249
    new-array v3, v2, [B

    move v4, v1

    move v5, v4

    move v6, v5

    :goto_0
    if-ge v4, v2, :cond_1

    .line 260
    aget-byte v7, p0, v5

    and-int/lit16 v7, v7, 0xff

    ushr-int/2addr v7, v6

    const/4 v8, 0x1

    add-int/2addr v5, v8

    .line 262
    aget-byte v9, p0, v5

    add-int/lit8 v10, v6, 0x1

    shl-int v11, v8, v10

    sub-int/2addr v11, v8

    and-int v8, v9, v11

    rsub-int/lit8 v9, v6, 0x7

    shl-int/2addr v8, v9

    add-int/2addr v7, v8

    int-to-byte v7, v7

    .line 263
    aput-byte v7, v3, v4

    const/4 v7, 0x6

    if-ne v6, v7, :cond_0

    add-int/lit8 v5, v5, 0x1

    move v6, v1

    goto :goto_1

    :cond_0
    move v6, v10

    :goto_1
    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    :cond_1
    return-object v3
.end method

.method public static decodeBytes([Ljava/lang/String;)[B
    .locals 2
    .param p0    # [Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 179
    array-length v0, p0

    if-lez v0, :cond_1

    const/4 v0, 0x0

    aget-object v1, p0, v0

    invoke-virtual {v1}, Ljava/lang/String;->isEmpty()Z

    move-result v1

    if-nez v1, :cond_1

    .line 180
    aget-object v1, p0, v0

    invoke-virtual {v1, v0}, Ljava/lang/String;->charAt(I)C

    move-result v0

    if-nez v0, :cond_0

    .line 182
    invoke-static {p0}, Lkotlin/reflect/jvm/internal/impl/metadata/jvm/deserialization/BitEncoding;->dropMarker([Ljava/lang/String;)[Ljava/lang/String;

    move-result-object p0

    invoke-static {p0}, Lkotlin/reflect/jvm/internal/impl/metadata/jvm/deserialization/UtfEncodingKt;->stringsToBytes([Ljava/lang/String;)[B

    move-result-object p0

    return-object p0

    :cond_0
    const v1, 0xffff

    if-ne v0, v1, :cond_1

    .line 185
    invoke-static {p0}, Lkotlin/reflect/jvm/internal/impl/metadata/jvm/deserialization/BitEncoding;->dropMarker([Ljava/lang/String;)[Ljava/lang/String;

    move-result-object p0

    .line 189
    :cond_1
    invoke-static {p0}, Lkotlin/reflect/jvm/internal/impl/metadata/jvm/deserialization/BitEncoding;->combineStringArrayIntoBytes([Ljava/lang/String;)[B

    move-result-object p0

    const/16 v0, 0x7f

    .line 191
    invoke-static {p0, v0}, Lkotlin/reflect/jvm/internal/impl/metadata/jvm/deserialization/BitEncoding;->addModuloByte([BI)V

    .line 192
    invoke-static {p0}, Lkotlin/reflect/jvm/internal/impl/metadata/jvm/deserialization/BitEncoding;->decode7to8([B)[B

    move-result-object p0

    return-object p0
.end method

.method private static dropMarker([Ljava/lang/String;)[Ljava/lang/String;
    .locals 3
    .param p0    # [Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 199
    invoke-virtual {p0}, [Ljava/lang/String;->clone()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, [Ljava/lang/String;

    const/4 v0, 0x0

    .line 200
    aget-object v1, p0, v0

    const/4 v2, 0x1

    invoke-virtual {v1, v2}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v1

    aput-object v1, p0, v0

    return-object p0
.end method
