.class public final Lo/asm;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static a:Z

.field private static c:Z


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 27
    const/4 v0, 0x0

    sput-boolean v0, Lo/asm;->a:Z

    .line 29
    const/4 v0, 0x0

    sput-boolean v0, Lo/asm;->c:Z

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 19
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static c(Landroid/content/Context;)Z
    .locals 10

    .line 84
    const/4 v6, 0x0

    .line 86
    const/4 v7, 0x0

    .line 90
    :try_start_0
    invoke-virtual {p0}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    move-result-object v0

    const-string v1, "content://com.android.contacts/feature"

    invoke-static {v1}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v1

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    invoke-virtual/range {v0 .. v5}, Landroid/content/ContentResolver;->query(Landroid/net/Uri;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object v0

    move-object v7, v0

    .line 93
    if-eqz v7, :cond_0

    invoke-interface {v7}, Landroid/database/Cursor;->moveToFirst()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 95
    const-string v0, "is_support_insert_photo"

    invoke-interface {v7, v0}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v8

    .line 96
    const/4 v0, -0x1

    if-eq v8, v0, :cond_0

    invoke-interface {v7, v8}, Landroid/database/Cursor;->getInt(I)I
    :try_end_0
    .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    .line 98
    const/4 v6, 0x1

    .line 109
    :cond_0
    invoke-static {v7}, Lo/bpe;->d(Ljava/io/Closeable;)V

    .line 110
    goto :goto_0

    .line 102
    :catch_0
    move-exception v8

    .line 104
    const-string v0, "FeatureQueryHelper"

    const-string v1, "Query \'Contact\' whether to support SNS exception."

    :try_start_1
    invoke-static {v0, v1}, Lo/bpf;->c(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 105
    const/4 v6, 0x0

    .line 109
    invoke-static {v7}, Lo/bpe;->d(Ljava/io/Closeable;)V

    .line 110
    goto :goto_0

    .line 109
    :catchall_0
    move-exception v9

    invoke-static {v7}, Lo/bpe;->d(Ljava/io/Closeable;)V

    .line 110
    throw v9

    .line 112
    :goto_0
    return v6
.end method

.method public static e(Landroid/content/Context;)Z
    .locals 3

    .line 41
    if-nez p0, :cond_0

    .line 43
    const-string v0, "FeatureQueryHelper"

    const-string v1, "Invalid argument."

    invoke-static {v0, v1}, Lo/bpf;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 44
    const/4 v0, 0x0

    return v0

    .line 48
    :cond_0
    invoke-static {}, Lo/bom;->e()Z

    move-result v0

    if-nez v0, :cond_1

    .line 50
    const-string v0, "FeatureQueryHelper"

    const-string v1, "Non Huawei-phones does not support."

    invoke-static {v0, v1}, Lo/bpf;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 51
    const/4 v0, 0x0

    return v0

    .line 55
    :cond_1
    const/4 v0, 0x1

    new-array v0, v0, [Ljava/lang/String;

    const-string v1, "android.permission.READ_CONTACTS"

    const/4 v2, 0x0

    aput-object v1, v0, v2

    invoke-static {p0, v0}, Lo/biq;->d(Landroid/content/Context;[Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_2

    .line 57
    const-string v0, "FeatureQueryHelper"

    const-string v1, "Have not been granted read contact permission."

    invoke-static {v0, v1}, Lo/bpf;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 58
    const/4 v0, 0x0

    return v0

    .line 62
    :cond_2
    sget-boolean v0, Lo/asm;->c:Z

    if-nez v0, :cond_3

    .line 64
    invoke-static {p0}, Lo/asm;->c(Landroid/content/Context;)Z

    move-result v0

    sput-boolean v0, Lo/asm;->a:Z

    .line 65
    const/4 v0, 0x1

    sput-boolean v0, Lo/asm;->c:Z

    .line 68
    :cond_3
    sget-boolean v0, Lo/asm;->a:Z

    if-nez v0, :cond_4

    .line 70
    const-string v0, "FeatureQueryHelper"

    const-string v1, "The version of \'Contacts\' does not support update photo."

    invoke-static {v0, v1}, Lo/bpf;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 73
    :cond_4
    sget-boolean v0, Lo/asm;->a:Z

    return v0
.end method
