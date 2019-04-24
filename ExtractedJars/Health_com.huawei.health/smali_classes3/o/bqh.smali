.class public abstract Lo/bqh;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 18
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static a(Ljava/lang/String;Ljava/lang/String;)Lo/bqh;
    .locals 2

    .line 41
    if-nez p1, :cond_0

    .line 43
    new-instance v0, Ljava/lang/NullPointerException;

    const-string v1, "content == null"

    invoke-direct {v0, v1}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 46
    :cond_0
    const-string v0, "UTF-8"

    invoke-static {v0}, Ljava/nio/charset/Charset;->forName(Ljava/lang/String;)Ljava/nio/charset/Charset;

    move-result-object v0

    invoke-virtual {p1, v0}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    move-result-object v0

    invoke-static {p0, v0}, Lo/bqh;->a(Ljava/lang/String;[B)Lo/bqh;

    move-result-object v0

    return-object v0
.end method

.method public static a(Ljava/lang/String;[B)Lo/bqh;
    .locals 2

    .line 54
    array-length v0, p1

    const/4 v1, 0x0

    invoke-static {p0, p1, v1, v0}, Lo/bqh;->d(Ljava/lang/String;[BII)Lo/bqh;

    move-result-object v0

    return-object v0
.end method

.method public static c(Ljava/lang/String;Ljava/io/File;)Lo/bqh;
    .locals 2

    .line 101
    if-nez p1, :cond_0

    .line 103
    new-instance v0, Ljava/lang/NullPointerException;

    const-string v1, "content == null"

    invoke-direct {v0, v1}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 106
    :cond_0
    new-instance v0, Lo/bqh$2;

    invoke-direct {v0, p0, p1}, Lo/bqh$2;-><init>(Ljava/lang/String;Ljava/io/File;)V

    return-object v0
.end method

.method public static d(Ljava/lang/String;[BII)Lo/bqh;
    .locals 2

    .line 63
    if-nez p1, :cond_0

    .line 65
    new-instance v0, Ljava/lang/NullPointerException;

    const-string v1, "content == null"

    invoke-direct {v0, v1}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 68
    :cond_0
    new-instance v0, Lo/bqh$4;

    invoke-direct {v0, p0, p3, p1, p2}, Lo/bqh$4;-><init>(Ljava/lang/String;I[BI)V

    return-object v0
.end method


# virtual methods
.method public abstract a()Ljava/lang/String;
.end method

.method public abstract d(Ljava/io/OutputStream;)V
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation
.end method

.method public abstract e()J
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation
.end method
