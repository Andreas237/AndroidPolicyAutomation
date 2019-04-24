.class public Lo/bcc;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 22
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static b(Landroid/content/Context;Landroid/net/Uri;)Ljava/lang/String;
    .locals 11

    .line 102
    const-string v6, ""

    .line 103
    const/4 v0, 0x1

    new-array v7, v0, [Ljava/lang/String;

    const-string v0, "title"

    const/4 v1, 0x0

    aput-object v0, v7, v1

    .line 105
    const/4 v8, 0x0

    .line 108
    :try_start_0
    invoke-virtual {p0}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    move-result-object v0

    move-object v1, p1

    move-object v2, v7

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    invoke-virtual/range {v0 .. v5}, Landroid/content/ContentResolver;->query(Landroid/net/Uri;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object v0

    move-object v8, v0

    .line 109
    if-eqz v8, :cond_0

    invoke-interface {v8}, Landroid/database/Cursor;->moveToFirst()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 111
    const-string v0, "title"

    invoke-interface {v8, v0}, Landroid/database/Cursor;->getColumnIndexOrThrow(Ljava/lang/String;)I

    move-result v0

    invoke-interface {v8, v0}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;
    :try_end_0
    .catch Landroid/database/SQLException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result-object v0

    move-object v6, v0

    .line 120
    :cond_0
    if-eqz v8, :cond_2

    .line 122
    invoke-interface {v8}, Landroid/database/Cursor;->close()V

    goto :goto_0

    .line 114
    :catch_0
    move-exception v9

    .line 116
    const-string v0, "RingToneUtil"

    const-string v1, "getTitleByUri SQLException"

    :try_start_1
    invoke-static {v0, v1}, Lo/bpf;->c(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 120
    if-eqz v8, :cond_2

    .line 122
    invoke-interface {v8}, Landroid/database/Cursor;->close()V

    goto :goto_0

    .line 120
    :catchall_0
    move-exception v10

    if-eqz v8, :cond_1

    .line 122
    invoke-interface {v8}, Landroid/database/Cursor;->close()V

    .line 124
    :cond_1
    throw v10

    .line 125
    :cond_2
    :goto_0
    return-object v6
.end method

.method private static c(Landroid/content/Context;Landroid/net/Uri;)Z
    .locals 10

    .line 68
    const/4 v6, 0x0

    .line 69
    const/4 v7, 0x0

    .line 72
    :try_start_0
    invoke-virtual {p0}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    move-result-object v0

    move-object v1, p1

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    invoke-virtual/range {v0 .. v5}, Landroid/content/ContentResolver;->query(Landroid/net/Uri;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object v0

    move-object v7, v0

    .line 74
    if-eqz v7, :cond_0

    invoke-interface {v7}, Landroid/database/Cursor;->getCount()I
    :try_end_0
    .catch Landroid/database/SQLException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result v0

    if-lez v0, :cond_0

    .line 76
    const/4 v6, 0x1

    .line 85
    :cond_0
    if-eqz v7, :cond_2

    .line 87
    invoke-interface {v7}, Landroid/database/Cursor;->close()V

    goto :goto_0

    .line 79
    :catch_0
    move-exception v8

    .line 81
    const-string v0, "RingToneUtil"

    const-string v1, "isRingtoneExist SQLException"

    :try_start_1
    invoke-static {v0, v1}, Lo/bpf;->c(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 85
    if-eqz v7, :cond_2

    .line 87
    invoke-interface {v7}, Landroid/database/Cursor;->close()V

    goto :goto_0

    .line 85
    :catchall_0
    move-exception v9

    if-eqz v7, :cond_1

    .line 87
    invoke-interface {v7}, Landroid/database/Cursor;->close()V

    .line 89
    :cond_1
    throw v9

    .line 90
    :cond_2
    :goto_0
    return v6
.end method

.method public static e(Landroid/content/Context;)Z
    .locals 8

    .line 34
    invoke-static {}, Lo/bcb;->b()Lo/bcb;

    move-result-object v0

    const-string v1, "ring_uri"

    const-string v2, ""

    invoke-virtual {v0, v1, v2}, Lo/bcb;->c(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    .line 35
    const/4 v4, 0x0

    .line 37
    invoke-static {v3}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 39
    const/4 v0, 0x0

    return v0

    .line 42
    :cond_0
    invoke-static {v3}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v5

    .line 43
    invoke-static {p0, v5}, Lo/bcc;->c(Landroid/content/Context;Landroid/net/Uri;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 45
    const/4 v4, 0x1

    .line 46
    const/4 v0, 0x2

    invoke-static {p0, v0}, Landroid/media/RingtoneManager;->getActualDefaultRingtoneUri(Landroid/content/Context;I)Landroid/net/Uri;

    move-result-object v6

    .line 47
    if-eqz v6, :cond_1

    .line 50
    invoke-static {p0, v6}, Lo/bcc;->b(Landroid/content/Context;Landroid/net/Uri;)Ljava/lang/String;

    move-result-object v7

    .line 51
    invoke-static {}, Lo/bcb;->b()Lo/bcb;

    move-result-object v0

    const-string v1, "isFollowNotification"

    const/4 v2, 0x1

    invoke-virtual {v0, v1, v2}, Lo/bcb;->e(Ljava/lang/String;Z)Z

    .line 52
    invoke-static {}, Lo/bcb;->b()Lo/bcb;

    move-result-object v0

    const-string v1, "ring_file_name"

    invoke-virtual {v0, v1, v7}, Lo/bcb;->e(Ljava/lang/String;Ljava/lang/String;)Z

    .line 53
    invoke-static {}, Lo/bcb;->b()Lo/bcb;

    move-result-object v0

    const-string v1, "ring_uri"

    invoke-virtual {v6}, Landroid/net/Uri;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lo/bcb;->e(Ljava/lang/String;Ljava/lang/String;)Z

    .line 56
    :cond_1
    return v4
.end method
