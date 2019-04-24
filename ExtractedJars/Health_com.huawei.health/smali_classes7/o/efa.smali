.class public Lo/efa;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 17
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static varargs c([Ljava/io/Closeable;)V
    .locals 6

    .line 32
    if-nez p0, :cond_0

    .line 33
    return-void

    .line 35
    :cond_0
    move-object v1, p0

    array-length v2, v1

    const/4 v3, 0x0

    :goto_0
    if-ge v3, v2, :cond_2

    aget-object v4, v1, v3

    .line 37
    if-nez v4, :cond_1

    .line 38
    goto :goto_1

    .line 40
    :cond_1
    :try_start_0
    invoke-interface {v4}, Ljava/io/Closeable;->close()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 41
    const/4 v4, 0x0

    .line 44
    goto :goto_1

    .line 42
    :catch_0
    move-exception v5

    .line 43
    invoke-virtual {v5}, Ljava/lang/Exception;->printStackTrace()V

    .line 35
    :goto_1
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    .line 46
    :cond_2
    return-void
.end method

.method public static e(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/String;
    .locals 4

    .line 21
    :try_start_0
    invoke-virtual {p0}, Landroid/content/Context;->getAssets()Landroid/content/res/AssetManager;

    move-result-object v0

    invoke-virtual {v0, p1}, Landroid/content/res/AssetManager;->open(Ljava/lang/String;)Ljava/io/InputStream;

    move-result-object v2

    .line 22
    invoke-virtual {v2}, Ljava/io/InputStream;->available()I

    move-result v0

    new-array v3, v0, [B

    .line 23
    invoke-virtual {v2, v3}, Ljava/io/InputStream;->read([B)I

    .line 24
    new-instance v0, Ljava/lang/String;

    const-string v1, "utf-8"

    invoke-direct {v0, v3, v1}, Ljava/lang/String;-><init>([BLjava/lang/String;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-object v0

    .line 25
    :catch_0
    move-exception v3

    .line 26
    invoke-virtual {v3}, Ljava/lang/Exception;->printStackTrace()V

    .line 28
    const-string v0, ""

    return-object v0
.end method
