.class public Lo/dhz;
.super Lo/dif;
.source "SourceFile"


# instance fields
.field private e:Lo/die;


# direct methods
.method public constructor <init>(Landroid/os/Looper;Lo/dia;)V
    .locals 1

    .line 37
    invoke-direct {p0, p1}, Lo/dif;-><init>(Landroid/os/Looper;)V

    .line 34
    new-instance v0, Lo/dib;

    invoke-direct {v0}, Lo/dib;-><init>()V

    iput-object v0, p0, Lo/dhz;->e:Lo/die;

    .line 39
    return-void
.end method


# virtual methods
.method public c()V
    .locals 1

    .line 42
    iget-object v0, p0, Lo/dhz;->e:Lo/die;

    invoke-interface {v0}, Lo/die;->b()V

    .line 43
    return-void
.end method

.method protected d(Ljava/lang/Object;Ljava/lang/String;)V
    .locals 5

    .line 51
    const/4 v2, 0x0

    .line 52
    move-object v0, p1

    check-cast v0, [B

    move-object v3, v0

    check-cast v3, [B

    .line 54
    invoke-static {p2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 55
    invoke-static {p2}, Lo/dhu;->d(Ljava/lang/String;)Lo/dhu;

    move-result-object v2

    goto :goto_0

    .line 58
    :cond_0
    invoke-static {}, Lo/dhu;->f()Lo/dhu;

    move-result-object v2

    .line 62
    :goto_0
    invoke-virtual {v2}, Lo/dhu;->r()Ljava/io/File;

    move-result-object v4

    .line 63
    if-nez v3, :cond_1

    .line 64
    iget-object v0, p0, Lo/dhz;->e:Lo/die;

    const/4 v1, 0x1

    invoke-interface {v0, v4, v1}, Lo/die;->a(Ljava/io/File;Z)V

    .line 65
    return-void

    .line 68
    :cond_1
    if-eqz v4, :cond_2

    .line 69
    iget-object v0, p0, Lo/dhz;->e:Lo/die;

    const/4 v1, 0x1

    invoke-interface {v0, v4, v3, v1}, Lo/die;->e(Ljava/io/File;[BZ)Z

    move-result v0

    if-nez v0, :cond_3

    .line 70
    const-string v0, "LogUtil_BytesLogFileHandler"

    const-string v1, "writer.write() in Handler failed"

    invoke-static {v0, v1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    goto :goto_1

    .line 73
    :cond_2
    const-string v0, "LogUtil_BytesLogFileHandler"

    const-string v1, "get log file failed."

    invoke-static {v0, v1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 75
    :cond_3
    :goto_1
    return-void
.end method

.method protected e()V
    .locals 0

    .line 80
    return-void
.end method

.method public e([BLjava/lang/String;)V
    .locals 0

    .line 46
    invoke-virtual {p0, p1, p2}, Lo/dhz;->b(Ljava/lang/Object;Ljava/lang/String;)V

    .line 47
    return-void
.end method
