.class public Lo/dem;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 35
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private static a(Ljava/lang/String;Ljava/nio/charset/Charset;)[B
    .locals 1

    .line 47
    if-nez p0, :cond_0

    .line 48
    const/4 v0, 0x0

    new-array v0, v0, [B

    return-object v0

    .line 50
    :cond_0
    invoke-virtual {p0, p1}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    move-result-object v0

    return-object v0
.end method

.method public static c([B)Ljava/lang/String;
    .locals 1

    .line 100
    sget-object v0, Lo/dei;->f:Ljava/nio/charset/Charset;

    invoke-static {p0, v0}, Lo/dem;->e([BLjava/nio/charset/Charset;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method private static e([BLjava/nio/charset/Charset;)Ljava/lang/String;
    .locals 1

    .line 84
    if-nez p0, :cond_0

    const/4 v0, 0x0

    goto :goto_0

    :cond_0
    new-instance v0, Ljava/lang/String;

    invoke-direct {v0, p0, p1}, Ljava/lang/String;-><init>([BLjava/nio/charset/Charset;)V

    :goto_0
    return-object v0
.end method

.method public static e(Ljava/lang/String;)[B
    .locals 1

    .line 67
    sget-object v0, Lo/dei;->f:Ljava/nio/charset/Charset;

    invoke-static {p0, v0}, Lo/dem;->a(Ljava/lang/String;Ljava/nio/charset/Charset;)[B

    move-result-object v0

    return-object v0
.end method
