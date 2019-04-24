.class public Lo/dsn;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static a:I

.field private static d:I

.field private static final e:Ljava/nio/charset/Charset;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 8
    const/4 v0, 0x7

    sput v0, Lo/dsn;->a:I

    .line 9
    const/4 v0, 0x4

    sput v0, Lo/dsn;->d:I

    .line 10
    const-string v0, "UTF-8"

    invoke-static {v0}, Ljava/nio/charset/Charset;->forName(Ljava/lang/String;)Ljava/nio/charset/Charset;

    move-result-object v0

    sput-object v0, Lo/dsn;->e:Ljava/nio/charset/Charset;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private static a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    .locals 11

    .line 56
    invoke-static {p0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 57
    :cond_0
    const/4 v0, 0x0

    return-object v0

    .line 59
    :cond_1
    sget-object v0, Lo/dsn;->e:Ljava/nio/charset/Charset;

    invoke-virtual {p1, v0}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    move-result-object v2

    .line 60
    sget-object v0, Lo/dsn;->e:Ljava/nio/charset/Charset;

    invoke-virtual {p0, v0}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    move-result-object v3

    .line 61
    move-object v4, v3

    .line 62
    const/4 v5, 0x0

    array-length v6, v3

    :goto_0
    if-ge v5, v6, :cond_3

    .line 63
    move-object v7, v2

    array-length v8, v7

    const/4 v9, 0x0

    :goto_1
    if-ge v9, v8, :cond_2

    aget-byte v10, v7, v9

    .line 64
    aget-byte v0, v4, v5

    xor-int/2addr v0, v10

    int-to-byte v0, v0

    aput-byte v0, v3, v5

    .line 63
    add-int/lit8 v9, v9, 0x1

    goto :goto_1

    .line 62
    :cond_2
    add-int/lit8 v5, v5, 0x1

    goto :goto_0

    .line 67
    :cond_3
    new-instance v0, Ljava/lang/String;

    sget-object v1, Lo/dsn;->e:Ljava/nio/charset/Charset;

    invoke-direct {v0, v3, v1}, Ljava/lang/String;-><init>([BLjava/nio/charset/Charset;)V

    return-object v0
.end method

.method private static b(Ljava/lang/String;I)Ljava/lang/String;
    .locals 5

    .line 24
    invoke-static {p0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v0

    if-ge v0, p1, :cond_1

    .line 25
    :cond_0
    const/4 v0, 0x0

    return-object v0

    .line 27
    :cond_1
    invoke-virtual {p0}, Ljava/lang/String;->toCharArray()[C

    move-result-object v2

    .line 28
    invoke-virtual {p0}, Ljava/lang/String;->toCharArray()[C

    move-result-object v3

    .line 29
    const/4 v4, 0x0

    :goto_0
    array-length v0, v2

    if-ge v4, v0, :cond_3

    .line 30
    sub-int v0, v4, p1

    if-gez v0, :cond_2

    .line 31
    array-length v0, v2

    sub-int/2addr v0, p1

    add-int/2addr v0, v4

    aget-char v1, v2, v4

    aput-char v1, v3, v0

    goto :goto_1

    .line 33
    :cond_2
    sub-int v0, v4, p1

    aget-char v1, v2, v4

    aput-char v1, v3, v0

    .line 29
    :goto_1
    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    .line 36
    :cond_3
    new-instance v0, Ljava/lang/String;

    invoke-direct {v0, v3}, Ljava/lang/String;-><init>([C)V

    return-object v0
.end method

.method public static c(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    .locals 1

    .line 13
    invoke-static {p0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    invoke-static {p2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 14
    :cond_0
    const/4 v0, 0x0

    return-object v0

    .line 16
    :cond_1
    sget v0, Lo/dsn;->d:I

    invoke-static {p0, v0}, Lo/dsn;->b(Ljava/lang/String;I)Ljava/lang/String;

    move-result-object p0

    .line 17
    invoke-static {p0, p2}, Lo/dsn;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    .line 18
    sget v0, Lo/dsn;->a:I

    invoke-static {p0, v0}, Lo/dsn;->e(Ljava/lang/String;I)Ljava/lang/String;

    move-result-object p0

    .line 19
    invoke-static {p0, p1}, Lo/dsn;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    .line 20
    return-object p0
.end method

.method private static e(Ljava/lang/String;I)Ljava/lang/String;
    .locals 5

    .line 40
    invoke-static {p0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v0

    if-ge v0, p1, :cond_1

    .line 41
    :cond_0
    const/4 v0, 0x0

    return-object v0

    .line 43
    :cond_1
    invoke-virtual {p0}, Ljava/lang/String;->toCharArray()[C

    move-result-object v2

    .line 44
    invoke-virtual {p0}, Ljava/lang/String;->toCharArray()[C

    move-result-object v3

    .line 45
    const/4 v4, 0x0

    :goto_0
    array-length v0, v2

    if-ge v4, v0, :cond_3

    .line 46
    add-int v0, v4, p1

    array-length v1, v2

    if-lt v0, v1, :cond_2

    .line 47
    add-int v0, p1, v4

    array-length v1, v2

    sub-int/2addr v0, v1

    aget-char v1, v2, v4

    aput-char v1, v3, v0

    goto :goto_1

    .line 49
    :cond_2
    add-int v0, v4, p1

    aget-char v1, v2, v4

    aput-char v1, v3, v0

    .line 45
    :goto_1
    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    .line 52
    :cond_3
    invoke-static {v3}, Ljava/lang/String;->valueOf([C)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
