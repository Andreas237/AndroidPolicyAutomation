.class public Lo/fgf;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static c:Lo/fgf;

.field private static d:Ljava/lang/Object;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 20
    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lo/fgf;->d:Ljava/lang/Object;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    .line 35
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 37
    return-void
.end method

.method private a(Landroid/content/Context;Landroid/net/Uri;Ljava/lang/String;[Ljava/lang/String;)Ljava/lang/String;
    .locals 11

    .line 116
    const/4 v6, 0x0

    .line 117
    const-string v7, "_data"

    .line 118
    const/4 v0, 0x1

    new-array v8, v0, [Ljava/lang/String;

    const/4 v0, 0x0

    aput-object v7, v8, v0

    .line 120
    :try_start_0
    invoke-virtual {p1}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    move-result-object v0

    move-object v1, p2

    move-object v2, v8

    move-object v3, p3

    move-object v4, p4

    const/4 v5, 0x0

    invoke-virtual/range {v0 .. v5}, Landroid/content/ContentResolver;->query(Landroid/net/Uri;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object v0

    move-object v6, v0

    .line 121
    const/4 v0, 0x0

    if-eq v0, v6, :cond_1

    invoke-interface {v6}, Landroid/database/Cursor;->moveToFirst()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 122
    invoke-interface {v6, v7}, Landroid/database/Cursor;->getColumnIndexOrThrow(Ljava/lang/String;)I

    move-result v0

    invoke-interface {v6, v0}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result-object v9

    .line 125
    const/4 v0, 0x0

    if-eq v0, v6, :cond_0

    .line 126
    invoke-interface {v6}, Landroid/database/Cursor;->close()V

    .line 122
    :cond_0
    return-object v9

    .line 125
    :cond_1
    const/4 v0, 0x0

    if-eq v0, v6, :cond_3

    .line 126
    invoke-interface {v6}, Landroid/database/Cursor;->close()V

    goto :goto_0

    .line 125
    :catchall_0
    move-exception v10

    const/4 v0, 0x0

    if-eq v0, v6, :cond_2

    .line 126
    invoke-interface {v6}, Landroid/database/Cursor;->close()V

    .line 128
    :cond_2
    throw v10

    .line 129
    :cond_3
    :goto_0
    const/4 v0, 0x0

    return-object v0
.end method

.method private a(Landroid/net/Uri;)Z
    .locals 2

    .line 133
    const-string v0, "com.android.externalstorage.documents"

    invoke-virtual {p1}, Landroid/net/Uri;->getAuthority()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    return v0
.end method

.method private c(Landroid/net/Uri;)Ljava/lang/String;
    .locals 5

    .line 99
    invoke-static {p1}, Landroid/provider/DocumentsContract;->getDocumentId(Landroid/net/Uri;)Ljava/lang/String;

    move-result-object v2

    .line 100
    const/4 v0, 0x0

    if-eq v0, v2, :cond_0

    .line 101
    const-string v0, ":"

    invoke-virtual {v2, v0}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v3

    .line 102
    const/4 v0, 0x0

    aget-object v4, v3, v0

    .line 103
    const/4 v0, 0x0

    if-eq v0, v4, :cond_0

    .line 104
    const-string v0, "primary"

    invoke-virtual {v0, v4}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 105
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-static {}, Landroid/os/Environment;->getExternalStorageDirectory()Ljava/io/File;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "/"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const/4 v1, 0x1

    aget-object v1, v3, v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0

    .line 109
    :cond_0
    const/4 v0, 0x0

    return-object v0
.end method

.method private d(Landroid/net/Uri;)Z
    .locals 2

    .line 137
    const-string v0, "com.android.providers.downloads.documents"

    invoke-virtual {p1}, Landroid/net/Uri;->getAuthority()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    return v0
.end method

.method private e(Ljava/lang/String;)Landroid/net/Uri;
    .locals 2

    .line 87
    const/4 v1, 0x0

    .line 88
    const-string v0, "image"

    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 89
    sget-object v1, Landroid/provider/MediaStore$Images$Media;->EXTERNAL_CONTENT_URI:Landroid/net/Uri;

    goto :goto_0

    .line 90
    :cond_0
    const-string v0, "video"

    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 91
    sget-object v1, Landroid/provider/MediaStore$Video$Media;->EXTERNAL_CONTENT_URI:Landroid/net/Uri;

    goto :goto_0

    .line 92
    :cond_1
    const-string v0, "audio"

    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 93
    sget-object v1, Landroid/provider/MediaStore$Audio$Media;->EXTERNAL_CONTENT_URI:Landroid/net/Uri;

    .line 95
    :cond_2
    :goto_0
    return-object v1
.end method

.method public static e()Lo/fgf;
    .locals 4

    .line 27
    sget-object v2, Lo/fgf;->d:Ljava/lang/Object;

    monitor-enter v2

    .line 28
    :try_start_0
    sget-object v0, Lo/fgf;->c:Lo/fgf;

    const/4 v1, 0x0

    if-ne v1, v0, :cond_0

    .line 29
    new-instance v0, Lo/fgf;

    invoke-direct {v0}, Lo/fgf;-><init>()V

    sput-object v0, Lo/fgf;->c:Lo/fgf;

    .line 31
    :cond_0
    sget-object v0, Lo/fgf;->c:Lo/fgf;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v2

    return-object v0

    .line 32
    :catchall_0
    move-exception v3

    monitor-exit v2

    throw v3
.end method

.method private e(Landroid/net/Uri;)Z
    .locals 2

    .line 141
    const-string v0, "com.android.providers.media.documents"

    invoke-virtual {p1}, Landroid/net/Uri;->getAuthority()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    return v0
.end method


# virtual methods
.method public b(Landroid/content/Context;Landroid/net/Uri;)Ljava/lang/String;
    .locals 11

    .line 40
    const/4 v0, 0x1

    new-array v6, v0, [Ljava/lang/String;

    const-string v0, "_data"

    const/4 v1, 0x0

    aput-object v0, v6, v1

    .line 41
    const/4 v7, 0x0

    .line 43
    :try_start_0
    invoke-virtual {p1}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    move-result-object v0

    move-object v1, p2

    move-object v2, v6

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    invoke-virtual/range {v0 .. v5}, Landroid/content/ContentResolver;->query(Landroid/net/Uri;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object v0

    move-object v7, v0

    .line 44
    const/4 v0, 0x0

    if-eq v0, v7, :cond_1

    invoke-interface {v7}, Landroid/database/Cursor;->moveToFirst()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 45
    const-string v0, "_data"

    invoke-interface {v7, v0}, Landroid/database/Cursor;->getColumnIndexOrThrow(Ljava/lang/String;)I

    move-result v8

    .line 46
    invoke-interface {v7, v8}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result-object v9

    .line 49
    const/4 v0, 0x0

    if-eq v0, v7, :cond_0

    .line 50
    invoke-interface {v7}, Landroid/database/Cursor;->close()V

    .line 46
    :cond_0
    return-object v9

    .line 49
    :cond_1
    const/4 v0, 0x0

    if-eq v0, v7, :cond_3

    .line 50
    invoke-interface {v7}, Landroid/database/Cursor;->close()V

    goto :goto_0

    .line 49
    :catchall_0
    move-exception v10

    const/4 v0, 0x0

    if-eq v0, v7, :cond_2

    .line 50
    invoke-interface {v7}, Landroid/database/Cursor;->close()V

    .line 51
    :cond_2
    throw v10

    .line 52
    :cond_3
    :goto_0
    const/4 v0, 0x0

    return-object v0
.end method

.method public e(Landroid/content/Context;Landroid/net/Uri;)Ljava/lang/String;
    .locals 8
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "NewApi"
        }
    .end annotation

    .line 57
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x13

    if-lt v0, v1, :cond_5

    invoke-static {p1, p2}, Landroid/provider/DocumentsContract;->isDocumentUri(Landroid/content/Context;Landroid/net/Uri;)Z

    move-result v0

    if-eqz v0, :cond_5

    .line 58
    invoke-direct {p0, p2}, Lo/fgf;->a(Landroid/net/Uri;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 59
    invoke-direct {p0, p2}, Lo/fgf;->c(Landroid/net/Uri;)Ljava/lang/String;

    move-result-object v4

    .line 60
    if-eqz v4, :cond_0

    return-object v4

    .line 61
    :cond_0
    goto/16 :goto_1

    :cond_1
    invoke-direct {p0, p2}, Lo/fgf;->d(Landroid/net/Uri;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 62
    const-string v0, "content://downloads/public_downloads"

    invoke-static {v0}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v0

    invoke-static {p2}, Landroid/content/ContentUris;->parseId(Landroid/net/Uri;)J

    move-result-wide v1

    invoke-static {v0, v1, v2}, Landroid/content/ContentUris;->withAppendedId(Landroid/net/Uri;J)Landroid/net/Uri;

    move-result-object v0

    const/4 v1, 0x0

    const/4 v2, 0x0

    invoke-direct {p0, p1, v0, v1, v2}, Lo/fgf;->a(Landroid/content/Context;Landroid/net/Uri;Ljava/lang/String;[Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0

    .line 63
    :cond_2
    invoke-direct {p0, p2}, Lo/fgf;->e(Landroid/net/Uri;)Z

    move-result v0

    if-eqz v0, :cond_7

    .line 64
    invoke-static {p2}, Landroid/provider/DocumentsContract;->getDocumentId(Landroid/net/Uri;)Ljava/lang/String;

    move-result-object v4

    .line 65
    const/4 v0, 0x0

    if-eq v0, v4, :cond_4

    .line 66
    const-string v0, ":"

    invoke-virtual {v4, v0}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v5

    .line 67
    const/4 v0, 0x0

    aget-object v6, v5, v0

    .line 68
    const/4 v0, 0x0

    if-eq v0, v6, :cond_4

    .line 69
    invoke-direct {p0, v6}, Lo/fgf;->e(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v7

    .line 70
    const/4 v0, 0x0

    if-ne v0, v7, :cond_3

    .line 71
    const-string v0, "PluginDevice_SelectFileManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getPath null == contentUri"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    goto :goto_0

    .line 73
    :cond_3
    const-string v0, "_id=?"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/String;

    const/4 v2, 0x1

    aget-object v2, v5, v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-direct {p0, p1, v7, v0, v1}, Lo/fgf;->a(Landroid/content/Context;Landroid/net/Uri;Ljava/lang/String;[Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0

    .line 77
    :cond_4
    :goto_0
    goto :goto_1

    .line 78
    :cond_5
    const-string v0, "content"

    invoke-virtual {p2}, Landroid/net/Uri;->getScheme()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_6

    .line 79
    const/4 v0, 0x0

    const/4 v1, 0x0

    invoke-direct {p0, p1, p2, v0, v1}, Lo/fgf;->a(Landroid/content/Context;Landroid/net/Uri;Ljava/lang/String;[Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0

    .line 80
    :cond_6
    const-string v0, "file"

    invoke-virtual {p2}, Landroid/net/Uri;->getScheme()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_7

    .line 81
    invoke-virtual {p2}, Landroid/net/Uri;->getPath()Ljava/lang/String;

    move-result-object v0

    return-object v0

    .line 83
    :cond_7
    :goto_1
    const/4 v0, 0x0

    return-object v0
.end method
