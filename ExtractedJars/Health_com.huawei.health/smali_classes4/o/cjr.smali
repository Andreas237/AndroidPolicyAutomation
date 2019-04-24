.class public abstract Lo/cjr;
.super Ljava/lang/Object;


# static fields
.field private static final c:[C


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const/16 v0, 0x10

    new-array v0, v0, [C

    fill-array-data v0, :array_0

    sput-object v0, Lo/cjr;->c:[C

    return-void

    :array_0
    .array-data 2
        0x30s
        0x31s
        0x32s
        0x33s
        0x34s
        0x35s
        0x36s
        0x37s
        0x38s
        0x39s
        0x61s
        0x62s
        0x63s
        0x64s
        0x65s
        0x66s
    .end array-data
.end method

.method public static b([B)Ljava/lang/String;
    .locals 8

    const/4 v0, 0x0

    if-eq v0, p0, :cond_0

    array-length v0, p0

    const/4 v1, 0x0

    if-ne v1, v0, :cond_1

    :cond_0
    const-string v0, ""

    return-object v0

    :cond_1
    new-instance v3, Ljava/lang/StringBuilder;

    array-length v0, p0

    mul-int/lit8 v0, v0, 0x2

    invoke-direct {v3, v0}, Ljava/lang/StringBuilder;-><init>(I)V

    move-object v4, p0

    array-length v5, v4

    const/4 v6, 0x0

    :goto_0
    if-ge v6, v5, :cond_2

    aget-byte v7, v4, v6

    sget-object v0, Lo/cjr;->c:[C

    and-int/lit16 v1, v7, 0xf0

    shr-int/lit8 v1, v1, 0x4

    aget-char v0, v0, v1

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    move-result-object v0

    sget-object v1, Lo/cjr;->c:[C

    and-int/lit8 v2, v7, 0xf

    aget-char v1, v1, v2

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    add-int/lit8 v6, v6, 0x1

    goto :goto_0

    :cond_2
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method private static d(C)B
    .locals 1

    const-string v0, "0123456789ABCDEF"

    invoke-virtual {v0, p0}, Ljava/lang/String;->indexOf(I)I

    move-result v0

    int-to-byte v0, v0

    return v0
.end method

.method static d()Ljava/lang/String;
    .locals 1

    const-string v0, "a8cb572c8030b2df5c2b622608bea02b0c3e5d4dff3f72c9e3204049a45c0760cd3604af8d57f0e0c693cc"

    return-object v0
.end method

.method public static e(Ljava/lang/String;)[B
    .locals 7

    invoke-static {p0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x0

    new-array v0, v0, [B

    return-object v0

    :cond_0
    sget-object v0, Ljava/util/Locale;->ENGLISH:Ljava/util/Locale;

    invoke-virtual {p0, v0}, Ljava/lang/String;->toUpperCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object p0

    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v0

    div-int/lit8 v2, v0, 0x2

    invoke-virtual {p0}, Ljava/lang/String;->toCharArray()[C

    move-result-object v3

    new-array v4, v2, [B

    const/4 v5, 0x0

    :goto_0
    if-ge v5, v2, :cond_1

    mul-int/lit8 v6, v5, 0x2

    aget-char v0, v3, v6

    invoke-static {v0}, Lo/cjr;->d(C)B

    move-result v0

    shl-int/lit8 v0, v0, 0x4

    add-int/lit8 v1, v6, 0x1

    aget-char v1, v3, v1

    invoke-static {v1}, Lo/cjr;->d(C)B

    move-result v1

    or-int/2addr v0, v1

    int-to-byte v0, v0

    aput-byte v0, v4, v5

    add-int/lit8 v5, v5, 0x1

    goto :goto_0

    :cond_1
    return-object v4
.end method
