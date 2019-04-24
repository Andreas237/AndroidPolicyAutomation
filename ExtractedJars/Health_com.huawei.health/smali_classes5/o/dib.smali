.class public Lo/dib;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/die;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 53
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private static b(Ljava/io/File;[BZ)Z
    .locals 5

    .line 67
    const-string v0, "sensor"

    invoke-static {v0}, Lo/dhu;->d(Ljava/lang/String;)Lo/dhu;

    move-result-object v2

    .line 68
    if-nez v2, :cond_0

    .line 69
    const-string v0, "LogUtil_BytesWriterImpl"

    const-string v1, "writeFileSafe,logConfig null,return"

    invoke-static {v0, v1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 70
    const/4 v0, 0x0

    return v0

    .line 72
    :cond_0
    invoke-static {v2}, Lo/dhw;->c(Lo/dhu;)Lo/dhw$c;

    move-result-object v3

    .line 73
    if-nez v3, :cond_1

    .line 75
    const/4 v0, 0x0

    return v0

    .line 78
    :cond_1
    invoke-static {p0, p1, p2}, Lo/dig;->e(Ljava/io/File;[BZ)Z

    move-result v4

    .line 79
    invoke-virtual {v3}, Lo/dhw$c;->a()V

    .line 80
    return v4
.end method


# virtual methods
.method public a(Ljava/io/File;Z)V
    .locals 0

    .line 86
    return-void
.end method

.method public b()V
    .locals 0

    .line 90
    return-void
.end method

.method public e(Ljava/io/File;[BZ)Z
    .locals 2

    .line 59
    const/4 v1, 0x0

    .line 60
    if-eqz p2, :cond_0

    .line 61
    const/4 v0, 0x1

    invoke-static {p1, p2, v0}, Lo/dib;->b(Ljava/io/File;[BZ)Z

    move-result v1

    .line 63
    :cond_0
    return v1
.end method
