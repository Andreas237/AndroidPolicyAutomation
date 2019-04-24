.class public final Lo/fri;
.super Lo/frx;
.source "SourceFile"


# static fields
.field private static final d:Ljava/nio/charset/Charset;


# instance fields
.field private final a:Ljava/lang/String;

.field private final b:[B


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 42
    const-string v0, "UTF8"

    invoke-static {v0}, Ljava/nio/charset/Charset;->forName(Ljava/lang/String;)Ljava/nio/charset/Charset;

    move-result-object v0

    sput-object v0, Lo/fri;->d:Ljava/nio/charset/Charset;

    return-void
.end method

.method private constructor <init>([BLjava/net/InetSocketAddress;)V
    .locals 3

    .line 65
    invoke-direct {p0, p2}, Lo/frx;-><init>(Ljava/net/InetSocketAddress;)V

    .line 66
    array-length v0, p1

    invoke-static {p1, v0}, Ljava/util/Arrays;->copyOf([BI)[B

    move-result-object v0

    iput-object v0, p0, Lo/fri;->b:[B

    .line 67
    new-instance v0, Ljava/lang/String;

    iget-object v1, p0, Lo/fri;->b:[B

    sget-object v2, Lo/fri;->d:Ljava/nio/charset/Charset;

    invoke-direct {v0, v1, v2}, Ljava/lang/String;-><init>([BLjava/nio/charset/Charset;)V

    iput-object v0, p0, Lo/fri;->a:Ljava/lang/String;

    .line 68
    return-void
.end method

.method public static d([BLjava/net/InetSocketAddress;)Lo/fqy;
    .locals 4

    .line 100
    new-instance v1, Lo/fpq;

    invoke-direct {v1, p0}, Lo/fpq;-><init>([B)V

    .line 102
    const/16 v0, 0x10

    invoke-virtual {v1, v0}, Lo/fpq;->c(I)I

    move-result v2

    .line 103
    invoke-virtual {v1, v2}, Lo/fpq;->d(I)[B

    move-result-object v3

    .line 105
    new-instance v0, Lo/fri;

    invoke-direct {v0, v3, p1}, Lo/fri;-><init>([BLjava/net/InetSocketAddress;)V

    return-object v0
.end method


# virtual methods
.method public d()I
    .locals 2

    .line 76
    iget-object v0, p0, Lo/fri;->b:[B

    array-length v0, v0

    add-int/lit8 v0, v0, 0x2

    return v0
.end method

.method public g()[B
    .locals 3

    .line 91
    new-instance v2, Lo/fpp;

    invoke-direct {v2}, Lo/fpp;-><init>()V

    .line 93
    iget-object v0, p0, Lo/fri;->b:[B

    array-length v0, v0

    const/16 v1, 0x10

    invoke-virtual {v2, v0, v1}, Lo/fpp;->c(II)V

    .line 94
    iget-object v0, p0, Lo/fri;->b:[B

    invoke-virtual {v2, v0}, Lo/fpp;->e([B)V

    .line 96
    invoke-virtual {v2}, Lo/fpp;->e()[B

    move-result-object v0

    return-object v0
.end method

.method public toString()Ljava/lang/String;
    .locals 3

    .line 81
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-super {p0}, Lo/frx;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v2, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 82
    const-string v0, "\t\tPSK Identity Hint: "

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lo/fri;->a:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-static {}, Ljava/lang/System;->lineSeparator()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 84
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
