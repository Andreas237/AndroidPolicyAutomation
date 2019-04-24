.class public Lcom/tencent/open/yyb/a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/tencent/open/yyb/a$1;,
        Lcom/tencent/open/yyb/a$b;,
        Lcom/tencent/open/yyb/a$a;
    }
.end annotation


# direct methods
.method public static a(Ljava/lang/String;Landroid/content/Context;)Landroid/graphics/drawable/Drawable;
    .locals 5

    .line 102
    new-instance v0, Landroid/graphics/Rect;

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    invoke-direct {v0, v1, v2, v3, v4}, Landroid/graphics/Rect;-><init>(IIII)V

    invoke-static {p0, p1, v0}, Lcom/tencent/open/yyb/a;->a(Ljava/lang/String;Landroid/content/Context;Landroid/graphics/Rect;)Landroid/graphics/drawable/Drawable;

    move-result-object v0

    return-object v0
.end method

.method public static a(Ljava/lang/String;Landroid/content/Context;Landroid/graphics/Rect;)Landroid/graphics/drawable/Drawable;
    .locals 14

    .line 106
    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object p1

    .line 107
    invoke-virtual {p1}, Landroid/content/Context;->getAssets()Landroid/content/res/AssetManager;

    move-result-object v6

    .line 109
    const/4 v7, 0x0

    .line 110
    const/4 v8, 0x0

    .line 112
    :try_start_0
    invoke-virtual {v6, p0}, Landroid/content/res/AssetManager;->open(Ljava/lang/String;)Ljava/io/InputStream;
    :try_end_0
    .catch Ljava/lang/OutOfMemoryError; {:try_start_0 .. :try_end_0} :catch_3
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_5
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result-object v0

    move-object v8, v0

    .line 113
    if-nez v8, :cond_1

    .line 114
    const/4 v9, 0x0

    .line 136
    if-eqz v8, :cond_0

    .line 138
    :try_start_1
    invoke-virtual {v8}, Ljava/io/InputStream;->close()V
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_0

    .line 141
    goto :goto_0

    .line 139
    :catch_0
    move-exception v10

    .line 140
    invoke-virtual {v10}, Ljava/io/IOException;->printStackTrace()V

    .line 141
    :cond_0
    :goto_0
    return-object v9

    .line 116
    :cond_1
    const-string v0, ".9.png"

    :try_start_2
    invoke-virtual {p0, v0}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_4

    .line 117
    invoke-static {v8}, Landroid/graphics/BitmapFactory;->decodeStream(Ljava/io/InputStream;)Landroid/graphics/Bitmap;

    move-result-object v9

    .line 118
    if-eqz v9, :cond_2

    .line 119
    invoke-virtual {v9}, Landroid/graphics/Bitmap;->getNinePatchChunk()[B

    move-result-object v10

    .line 120
    new-instance v0, Landroid/graphics/drawable/NinePatchDrawable;

    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    move-object v2, v9

    move-object v3, v10

    move-object/from16 v4, p2

    const/4 v5, 0x0

    invoke-direct/range {v0 .. v5}, Landroid/graphics/drawable/NinePatchDrawable;-><init>(Landroid/content/res/Resources;Landroid/graphics/Bitmap;[BLandroid/graphics/Rect;Ljava/lang/String;)V
    :try_end_2
    .catch Ljava/lang/OutOfMemoryError; {:try_start_2 .. :try_end_2} :catch_3
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_5
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    move-object v11, v0

    .line 122
    move-object v7, v11

    .line 123
    goto :goto_2

    .line 124
    :cond_2
    const/4 v10, 0x0

    .line 136
    if-eqz v8, :cond_3

    .line 138
    :try_start_3
    invoke-virtual {v8}, Ljava/io/InputStream;->close()V
    :try_end_3
    .catch Ljava/io/IOException; {:try_start_3 .. :try_end_3} :catch_1

    .line 141
    goto :goto_1

    .line 139
    :catch_1
    move-exception v11

    .line 140
    invoke-virtual {v11}, Ljava/io/IOException;->printStackTrace()V

    .line 141
    :cond_3
    :goto_1
    return-object v10

    .line 126
    :goto_2
    goto :goto_3

    .line 127
    :cond_4
    :try_start_4
    invoke-static {v8, p0}, Landroid/graphics/drawable/Drawable;->createFromStream(Ljava/io/InputStream;Ljava/lang/String;)Landroid/graphics/drawable/Drawable;
    :try_end_4
    .catch Ljava/lang/OutOfMemoryError; {:try_start_4 .. :try_end_4} :catch_3
    .catch Ljava/io/IOException; {:try_start_4 .. :try_end_4} :catch_5
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    move-result-object v0

    move-object v7, v0

    .line 136
    :goto_3
    if-eqz v8, :cond_6

    .line 138
    :try_start_5
    invoke-virtual {v8}, Ljava/io/InputStream;->close()V
    :try_end_5
    .catch Ljava/io/IOException; {:try_start_5 .. :try_end_5} :catch_2

    .line 141
    goto :goto_5

    .line 139
    :catch_2
    move-exception v9

    .line 140
    invoke-virtual {v9}, Ljava/io/IOException;->printStackTrace()V

    .line 141
    goto :goto_5

    .line 129
    :catch_3
    move-exception v9

    .line 130
    :try_start_6
    invoke-virtual {v9}, Ljava/lang/OutOfMemoryError;->printStackTrace()V

    .line 131
    const-string v0, "openSDK_LOG"

    const-string v1, "-->(AppbarUtil)getDrawable : IOException"

    invoke-static {v0, v1}, Lcom/tencent/open/a/f;->b(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_0

    .line 136
    if-eqz v8, :cond_6

    .line 138
    :try_start_7
    invoke-virtual {v8}, Ljava/io/InputStream;->close()V
    :try_end_7
    .catch Ljava/io/IOException; {:try_start_7 .. :try_end_7} :catch_4

    .line 141
    goto :goto_5

    .line 139
    :catch_4
    move-exception v9

    .line 140
    invoke-virtual {v9}, Ljava/io/IOException;->printStackTrace()V

    .line 141
    goto :goto_5

    .line 132
    :catch_5
    move-exception v9

    .line 133
    :try_start_8
    invoke-virtual {v9}, Ljava/io/IOException;->printStackTrace()V

    .line 134
    const-string v0, "openSDK_LOG"

    const-string v1, "-->(AppbarUtil)getDrawable : IOException"

    invoke-static {v0, v1}, Lcom/tencent/open/a/f;->b(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_0

    .line 136
    if-eqz v8, :cond_6

    .line 138
    :try_start_9
    invoke-virtual {v8}, Ljava/io/InputStream;->close()V
    :try_end_9
    .catch Ljava/io/IOException; {:try_start_9 .. :try_end_9} :catch_6

    .line 141
    goto :goto_5

    .line 139
    :catch_6
    move-exception v9

    .line 140
    invoke-virtual {v9}, Ljava/io/IOException;->printStackTrace()V

    .line 141
    goto :goto_5

    .line 136
    :catchall_0
    move-exception v12

    if-eqz v8, :cond_5

    .line 138
    :try_start_a
    invoke-virtual {v8}, Ljava/io/InputStream;->close()V
    :try_end_a
    .catch Ljava/io/IOException; {:try_start_a .. :try_end_a} :catch_7

    .line 141
    goto :goto_4

    .line 139
    :catch_7
    move-exception v13

    .line 140
    invoke-virtual {v13}, Ljava/io/IOException;->printStackTrace()V

    .line 141
    :cond_5
    :goto_4
    throw v12

    .line 144
    :cond_6
    :goto_5
    return-object v7
.end method

.method public static a(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 6

    .line 40
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 41
    return-void

    .line 43
    :cond_0
    invoke-static {p0}, Landroid/webkit/CookieSyncManager;->createInstance(Landroid/content/Context;)Landroid/webkit/CookieSyncManager;

    .line 44
    invoke-static {}, Landroid/webkit/CookieManager;->getInstance()Landroid/webkit/CookieManager;

    move-result-object v2

    .line 45
    const/4 v0, 0x1

    invoke-virtual {v2, v0}, Landroid/webkit/CookieManager;->setAcceptCookie(Z)V

    .line 47
    invoke-static {p1}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v3

    .line 48
    invoke-virtual {v3}, Landroid/net/Uri;->getHost()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    move-result-object v4

    .line 49
    const/4 v5, 0x0

    .line 50
    const-string v0, ".qq.com"

    invoke-virtual {v4, v0}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 51
    const-string v5, ".qq.com"

    .line 58
    :cond_1
    const-string v0, "logintype"

    const-string v1, "MOBILEQ"

    invoke-static {v0, v1, v5}, Lcom/tencent/open/yyb/a;->b(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, p1, v0}, Landroid/webkit/CookieManager;->setCookie(Ljava/lang/String;Ljava/lang/String;)V

    .line 59
    const-string v0, "qopenid"

    invoke-static {v0, p2, v5}, Lcom/tencent/open/yyb/a;->b(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, p1, v0}, Landroid/webkit/CookieManager;->setCookie(Ljava/lang/String;Ljava/lang/String;)V

    .line 60
    const-string v0, "qaccesstoken"

    invoke-static {v0, p3, v5}, Lcom/tencent/open/yyb/a;->b(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, p1, v0}, Landroid/webkit/CookieManager;->setCookie(Ljava/lang/String;Ljava/lang/String;)V

    .line 61
    const-string v0, "openappid"

    invoke-static {v0, p4, v5}, Lcom/tencent/open/yyb/a;->b(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, p1, v0}, Landroid/webkit/CookieManager;->setCookie(Ljava/lang/String;Ljava/lang/String;)V

    .line 63
    invoke-static {}, Landroid/webkit/CookieSyncManager;->getInstance()Landroid/webkit/CookieSyncManager;

    move-result-object v0

    invoke-virtual {v0}, Landroid/webkit/CookieSyncManager;->sync()V

    .line 64
    return-void
.end method

.method public static a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 4

    .line 148
    new-instance v3, Landroid/os/Bundle;

    invoke-direct {v3}, Landroid/os/Bundle;-><init>()V

    .line 149
    const-string v0, "uin"

    const-string v1, "1000"

    invoke-virtual {v3, v0, v1}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 150
    const-string v0, "action"

    invoke-virtual {v3, v0, p1}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 151
    const-string v0, "appid"

    invoke-virtual {v3, v0, p0}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 152
    const-string v0, "via"

    invoke-virtual {v3, v0, p2}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 153
    new-instance v0, Lcom/tencent/open/yyb/a$b;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/tencent/open/yyb/a$b;-><init>(Lcom/tencent/open/yyb/a$1;)V

    const/4 v1, 0x1

    new-array v1, v1, [Landroid/os/Bundle;

    const/4 v2, 0x0

    aput-object v3, v1, v2

    invoke-virtual {v0, v1}, Lcom/tencent/open/yyb/a$b;->execute([Ljava/lang/Object;)Landroid/os/AsyncTask;

    .line 154
    return-void
.end method

.method private static b(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    .locals 3

    .line 87
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    .line 88
    if-eqz p2, :cond_0

    .line 89
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "; path=/"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    .line 90
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "; domain="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    .line 92
    :cond_0
    return-object v2
.end method
