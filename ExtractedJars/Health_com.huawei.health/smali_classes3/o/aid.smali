.class public Lo/aid;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 12
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private static b(I[I)I
    .locals 7

    .line 66
    div-int/lit8 v2, p0, 0x8

    .line 67
    rem-int/lit8 v3, p0, 0x8

    .line 68
    const/16 v4, 0x8

    new-array v4, v4, [I

    fill-array-data v4, :array_0

    .line 69
    const/4 v5, 0x0

    .line 70
    array-length v0, p1

    mul-int/lit8 v6, v0, 0x8

    .line 71
    if-ge p0, v6, :cond_0

    .line 72
    aget v0, p1, v2

    aget v1, v4, v3

    and-int/2addr v0, v1

    shr-int v5, v0, v3

    .line 74
    :cond_0
    return v5

    nop

    :array_0
    .array-data 4
        0x1
        0x2
        0x4
        0x8
        0x10
        0x20
        0x40
        0x80
    .end array-data
.end method

.method public static d(Ljava/lang/String;)Z
    .locals 6

    .line 23
    const-string v3, "239\\.[456][0]\\.[0-9]{1,3}\\.[0-9]{1,3}"

    .line 24
    const-string v0, "/"

    const-string v1, ""

    invoke-virtual {p0, v0, v1}, Ljava/lang/String;->replaceAll(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    .line 25
    invoke-static {v3}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    move-result-object v4

    .line 26
    invoke-virtual {v4, p0}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    move-result-object v5

    .line 27
    invoke-virtual {v5}, Ljava/util/regex/Matcher;->matches()Z

    move-result v2

    .line 28
    return v2
.end method

.method public static d([I)[I
    .locals 13

    .line 37
    if-eqz p0, :cond_0

    array-length v0, p0

    if-nez v0, :cond_1

    .line 38
    :cond_0
    const/4 v0, 0x0

    return-object v0

    .line 41
    :cond_1
    array-length v4, p0

    .line 42
    mul-int/lit8 v5, v4, 0x8

    .line 43
    div-int/lit8 v6, v5, 0x3

    .line 44
    rem-int/lit8 v0, v5, 0x3

    const/4 v1, 0x0

    if-eq v1, v0, :cond_2

    .line 45
    add-int/lit8 v6, v6, 0x1

    .line 47
    :cond_2
    new-array v7, v6, [I

    .line 48
    const/4 v8, 0x0

    :goto_0
    if-ge v8, v6, :cond_4

    .line 50
    mul-int/lit8 v0, v8, 0x3

    invoke-static {v0, p0}, Lo/aid;->b(I[I)I

    move-result v9

    .line 51
    mul-int/lit8 v0, v8, 0x3

    add-int/lit8 v0, v0, 0x1

    invoke-static {v0, p0}, Lo/aid;->b(I[I)I

    move-result v10

    .line 52
    mul-int/lit8 v0, v8, 0x3

    add-int/lit8 v0, v0, 0x2

    invoke-static {v0, p0}, Lo/aid;->b(I[I)I

    move-result v11

    .line 53
    shl-int/lit8 v12, v8, 0x3

    .line 54
    const/16 v0, 0xb0

    if-lt v8, v0, :cond_3

    .line 55
    goto :goto_1

    .line 57
    :cond_3
    shl-int/lit8 v0, v11, 0x2

    or-int/2addr v0, v12

    shl-int/lit8 v1, v10, 0x1

    or-int/2addr v0, v1

    or-int/2addr v0, v9

    add-int/lit8 v0, v0, 0x31

    aput v0, v7, v8

    .line 48
    add-int/lit8 v8, v8, 0x1

    goto :goto_0

    .line 59
    :cond_4
    :goto_1
    const-string v0, "MultcastUitl"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "OctData len "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    array-length v2, v7

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    const/4 v2, 0x0

    invoke-static {v2, v0, v1}, Lo/aho;->a(ZLjava/lang/String;[Ljava/lang/Object;)V

    .line 60
    return-object v7
.end method
