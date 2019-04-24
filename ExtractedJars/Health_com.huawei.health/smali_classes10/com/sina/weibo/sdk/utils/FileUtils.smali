.class public Lcom/sina/weibo/sdk/utils/FileUtils;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final IMAGE_FILE_START:Ljava/lang/String; = "image/"

.field public static final VIDEO_FILE_START:Ljava/lang/String; = "video/"


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 12
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static getMIMEType(Ljava/io/File;)Ljava/lang/String;
    .locals 7

    .line 46
    const-string v2, "*/*"

    .line 47
    invoke-virtual {p0}, Ljava/io/File;->getName()Ljava/lang/String;

    move-result-object v3

    .line 48
    const-string v0, "."

    invoke-virtual {v3, v0}, Ljava/lang/String;->lastIndexOf(Ljava/lang/String;)I

    move-result v4

    .line 49
    if-gez v4, :cond_0

    .line 50
    return-object v2

    .line 52
    :cond_0
    invoke-virtual {v3}, Ljava/lang/String;->length()I

    move-result v0

    invoke-virtual {v3, v4, v0}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v5

    .line 53
    invoke-static {v5}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-virtual {v5}, Ljava/lang/String;->length()I

    move-result v0

    const/4 v1, 0x2

    if-ge v0, v1, :cond_1

    .line 54
    return-object v2

    .line 56
    :cond_1
    invoke-virtual {v5}, Ljava/lang/String;->length()I

    move-result v0

    const/4 v1, 0x1

    invoke-virtual {v5, v1, v0}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    move-result-object v5

    .line 57
    invoke-static {}, Landroid/webkit/MimeTypeMap;->getSingleton()Landroid/webkit/MimeTypeMap;

    move-result-object v6

    .line 58
    invoke-virtual {v6, v5}, Landroid/webkit/MimeTypeMap;->getMimeTypeFromExtension(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    .line 59
    return-object v2
.end method

.method public static getPath(Landroid/content/Context;Landroid/net/Uri;)Ljava/lang/String;
    .locals 11

    .line 18
    if-eqz p1, :cond_0

    if-nez p0, :cond_1

    .line 19
    :cond_0
    const/4 v0, 0x0

    return-object v0

    .line 21
    :cond_1
    const-string v0, "content"

    invoke-virtual {p1}, Landroid/net/Uri;->getScheme()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_6

    .line 22
    const/4 v0, 0x1

    new-array v6, v0, [Ljava/lang/String;

    const-string v0, "_data"

    const/4 v1, 0x0

    aput-object v0, v6, v1

    .line 23
    const/4 v7, 0x0

    .line 25
    :try_start_0
    invoke-virtual {p0}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    move-result-object v0

    move-object v1, p1

    move-object v2, v6

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    invoke-virtual/range {v0 .. v5}, Landroid/content/ContentResolver;->query(Landroid/net/Uri;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object v0

    move-object v7, v0

    .line 26
    if-eqz v7, :cond_3

    .line 27
    const-string v0, "_data"

    invoke-interface {v7, v0}, Landroid/database/Cursor;->getColumnIndexOrThrow(Ljava/lang/String;)I

    move-result v8

    .line 28
    invoke-interface {v7}, Landroid/database/Cursor;->moveToFirst()Z

    move-result v0

    if-eqz v0, :cond_3

    .line 29
    invoke-interface {v7, v8}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result-object v9

    .line 35
    if-eqz v7, :cond_2

    .line 36
    invoke-interface {v7}, Landroid/database/Cursor;->close()V

    :cond_2
    return-object v9

    .line 35
    :cond_3
    if-eqz v7, :cond_5

    .line 36
    invoke-interface {v7}, Landroid/database/Cursor;->close()V

    goto :goto_0

    .line 32
    :catch_0
    move-exception v8

    .line 33
    :try_start_1
    invoke-virtual {v8}, Ljava/lang/Exception;->printStackTrace()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 35
    if-eqz v7, :cond_5

    .line 36
    invoke-interface {v7}, Landroid/database/Cursor;->close()V

    goto :goto_0

    .line 35
    :catchall_0
    move-exception v10

    if-eqz v7, :cond_4

    .line 36
    invoke-interface {v7}, Landroid/database/Cursor;->close()V

    :cond_4
    throw v10

    .line 39
    :cond_5
    :goto_0
    goto :goto_1

    :cond_6
    const-string v0, "file"

    invoke-virtual {p1}, Landroid/net/Uri;->getScheme()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_7

    .line 40
    invoke-virtual {p1}, Landroid/net/Uri;->getPath()Ljava/lang/String;

    move-result-object v0

    return-object v0

    .line 42
    :cond_7
    :goto_1
    const/4 v0, 0x0

    return-object v0
.end method

.method public static isImageFile(Landroid/content/Context;Landroid/net/Uri;)Z
    .locals 3

    .line 64
    invoke-static {p0, p1}, Lcom/sina/weibo/sdk/utils/FileUtils;->getPath(Landroid/content/Context;Landroid/net/Uri;)Ljava/lang/String;

    move-result-object v2

    .line 65
    new-instance v0, Ljava/io/File;

    invoke-direct {v0, v2}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    invoke-static {v0}, Lcom/sina/weibo/sdk/utils/FileUtils;->getMIMEType(Ljava/io/File;)Ljava/lang/String;

    move-result-object v0

    const-string v1, "image/"

    invoke-virtual {v0, v1}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 66
    const/4 v0, 0x1

    return v0

    .line 68
    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public static isVideoFile(Landroid/content/Context;Landroid/net/Uri;)Z
    .locals 3

    .line 72
    invoke-static {p0, p1}, Lcom/sina/weibo/sdk/utils/FileUtils;->getPath(Landroid/content/Context;Landroid/net/Uri;)Ljava/lang/String;

    move-result-object v2

    .line 73
    new-instance v0, Ljava/io/File;

    invoke-direct {v0, v2}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    invoke-static {v0}, Lcom/sina/weibo/sdk/utils/FileUtils;->getMIMEType(Ljava/io/File;)Ljava/lang/String;

    move-result-object v0

    const-string v1, "video/"

    invoke-virtual {v0, v1}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 74
    const/4 v0, 0x1

    return v0

    .line 76
    :cond_0
    const/4 v0, 0x0

    return v0
.end method
