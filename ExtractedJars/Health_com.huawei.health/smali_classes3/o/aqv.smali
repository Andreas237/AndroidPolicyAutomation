.class public Lo/aqv;
.super Lo/aqw;
.source "SourceFile"


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 0

    .line 35
    invoke-direct {p0, p1}, Lo/aqw;-><init>(Landroid/content/Context;)V

    .line 36
    return-void
.end method

.method private a(Lo/ard;)Landroid/graphics/Bitmap;
    .locals 6

    .line 66
    if-nez p1, :cond_0

    .line 68
    const/4 v0, 0x0

    return-object v0

    .line 71
    :cond_0
    invoke-virtual {p1}, Lo/ard;->m()Ljava/lang/String;

    move-result-object v2

    .line 73
    invoke-static {v2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 75
    const/4 v0, 0x0

    return-object v0

    .line 78
    :cond_1
    const/4 v3, 0x0

    .line 79
    const/4 v4, 0x0

    .line 82
    :try_start_0
    new-instance v0, Ljava/io/File;

    invoke-direct {v0, v2}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    move-object v4, v0

    .line 83
    invoke-virtual {v4}, Ljava/io/File;->exists()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 85
    invoke-virtual {p1}, Lo/ard;->h()I

    move-result v0

    invoke-virtual {p1}, Lo/ard;->k()I

    move-result v1

    invoke-static {v2, v0, v1}, Lo/bbw;->e(Ljava/lang/String;II)Landroid/graphics/Bitmap;
    :try_end_0
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_1

    move-result-object v0

    move-object v3, v0

    .line 95
    :cond_2
    goto :goto_0

    .line 88
    :catch_0
    move-exception v5

    .line 90
    invoke-direct {p0, v4}, Lo/aqv;->c(Ljava/io/File;)V

    .line 95
    goto :goto_0

    .line 92
    :catch_1
    move-exception v5

    .line 94
    invoke-direct {p0, v4}, Lo/aqv;->c(Ljava/io/File;)V

    .line 96
    :goto_0
    return-object v3
.end method

.method private c(Ljava/io/File;)V
    .locals 4

    .line 108
    if-nez p1, :cond_0

    .line 110
    const-string v0, "MediaImageFetcher"

    const-string v1, "getBitmapFromFile:  file  is null "

    invoke-static {v0, v1}, Lo/bpf;->a(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0

    .line 114
    :cond_0
    invoke-virtual {p1}, Ljava/io/File;->delete()Z

    move-result v3

    .line 115
    const-string v0, "MediaImageFetcher"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "getBitmapFromFile: Delete file result is "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/bpf;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 118
    :goto_0
    return-void
.end method


# virtual methods
.method public e(Lo/ard;)Landroid/graphics/Bitmap;
    .locals 2

    .line 47
    if-nez p1, :cond_0

    .line 49
    const/4 v0, 0x0

    return-object v0

    .line 52
    :cond_0
    invoke-direct {p0, p1}, Lo/aqv;->a(Lo/ard;)Landroid/graphics/Bitmap;

    move-result-object v1

    .line 54
    return-object v1
.end method
