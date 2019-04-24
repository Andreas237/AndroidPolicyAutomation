.class public Lcom/huawei/updatesdk/sdk/a/c/c/a;
.super Ljava/lang/Object;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/huawei/updatesdk/sdk/a/c/c/a$a;
    }
.end annotation


# static fields
.field private static final a:Landroid/net/Uri;

.field private static final b:Landroid/net/Uri;

.field private static final c:Landroid/net/Uri;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const-string v0, "content://telephony/carriers/preferapn"

    invoke-static {v0}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v0

    sput-object v0, Lcom/huawei/updatesdk/sdk/a/c/c/a;->a:Landroid/net/Uri;

    const-string v0, "content://telephony/carriers/preferapn/0"

    invoke-static {v0}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v0

    sput-object v0, Lcom/huawei/updatesdk/sdk/a/c/c/a;->b:Landroid/net/Uri;

    const-string v0, "content://telephony/carriers/preferapn/1"

    invoke-static {v0}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v0

    sput-object v0, Lcom/huawei/updatesdk/sdk/a/c/c/a;->c:Landroid/net/Uri;

    return-void
.end method

.method public static a(Landroid/content/Context;)Lcom/huawei/updatesdk/sdk/a/c/c/a$a;
    .locals 6
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/SecurityException;
        }
    .end annotation

    const/4 v2, 0x0

    new-instance v3, Lcom/huawei/updatesdk/sdk/a/c/c/a$a;

    invoke-direct {v3}, Lcom/huawei/updatesdk/sdk/a/c/c/a$a;-><init>()V

    :try_start_0
    invoke-static {}, Lcom/huawei/updatesdk/sdk/a/c/b/a/b;->b()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-static {p0}, Lcom/huawei/updatesdk/sdk/a/c/c/a;->d(Landroid/content/Context;)Landroid/database/Cursor;

    move-result-object v0

    move-object v2, v0

    goto :goto_0

    :cond_0
    invoke-static {p0}, Lcom/huawei/updatesdk/sdk/a/c/c/a;->c(Landroid/content/Context;)Landroid/database/Cursor;
    :try_end_0
    .catch Ljava/lang/SecurityException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_1
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result-object v0

    move-object v2, v0

    :goto_0
    if-nez v2, :cond_2

    const/4 v4, 0x0

    if-eqz v2, :cond_1

    invoke-interface {v2}, Landroid/database/Cursor;->close()V

    :cond_1
    return-object v4

    :cond_2
    :goto_1
    :try_start_1
    invoke-interface {v2}, Landroid/database/Cursor;->moveToNext()Z

    move-result v0

    if-eqz v0, :cond_3

    const-string v0, "_id"

    invoke-interface {v2, v0}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v0

    invoke-interface {v2, v0}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v3, v0}, Lcom/huawei/updatesdk/sdk/a/c/c/a$a;->a(Ljava/lang/String;)V

    const-string v0, "name"

    invoke-interface {v2, v0}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v0

    invoke-interface {v2, v0}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v3, v0}, Lcom/huawei/updatesdk/sdk/a/c/c/a$a;->c(Ljava/lang/String;)V

    const-string v0, "apn"

    invoke-interface {v2, v0}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v0

    invoke-interface {v2, v0}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-static {}, Ljava/util/Locale;->getDefault()Ljava/util/Locale;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v3, v0}, Lcom/huawei/updatesdk/sdk/a/c/c/a$a;->b(Ljava/lang/String;)V
    :try_end_1
    .catch Ljava/lang/SecurityException; {:try_start_1 .. :try_end_1} :catch_0
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_1

    :cond_3
    if-eqz v2, :cond_5

    invoke-interface {v2}, Landroid/database/Cursor;->close()V

    goto :goto_2

    :catch_0
    move-exception v4

    const-string v0, "ApnUtil"

    const-string v1, "getDefaultAPN, SecurityException: "

    :try_start_2
    invoke-static {v0, v1, v4}, Lcom/huawei/updatesdk/sdk/a/b/a/a/a;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v4

    :catch_1
    move-exception v4

    const-string v0, "ApnUtil"

    const-string v1, "getDefaultAPN, Exception: "

    invoke-static {v0, v1, v4}, Lcom/huawei/updatesdk/sdk/a/b/a/a/a;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    if-eqz v2, :cond_5

    invoke-interface {v2}, Landroid/database/Cursor;->close()V

    goto :goto_2

    :catchall_0
    move-exception v5

    if-eqz v2, :cond_4

    invoke-interface {v2}, Landroid/database/Cursor;->close()V

    :cond_4
    throw v5

    :cond_5
    :goto_2
    invoke-virtual {v3}, Lcom/huawei/updatesdk/sdk/a/c/c/a$a;->a()Ljava/lang/String;

    move-result-object v0

    if-nez v0, :cond_6

    const/4 v0, 0x0

    goto :goto_3

    :cond_6
    move-object v0, v3

    :goto_3
    return-object v0
.end method

.method public static b(Landroid/content/Context;)Z
    .locals 3

    :try_start_0
    invoke-static {p0}, Lcom/huawei/updatesdk/sdk/a/c/c/a;->a(Landroid/content/Context;)Lcom/huawei/updatesdk/sdk/a/c/c/a$a;

    move-result-object v2

    const/4 v0, 0x0

    if-eq v0, v2, :cond_0

    invoke-virtual {v2}, Lcom/huawei/updatesdk/sdk/a/c/c/a$a;->b()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_1

    invoke-virtual {v2}, Lcom/huawei/updatesdk/sdk/a/c/c/a$a;->b()Ljava/lang/String;

    move-result-object v0

    const-string v1, "wap"

    invoke-virtual {v0, v1}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z
    :try_end_0
    .catch Ljava/lang/SecurityException; {:try_start_0 .. :try_end_0} :catch_0

    move-result v0

    if-eqz v0, :cond_1

    :cond_0
    const/4 v0, 0x1

    return v0

    :cond_1
    goto :goto_0

    :catch_0
    move-exception v2

    const-string v0, "ApnUtil"

    const-string v1, "isWap(), SecurityException: "

    invoke-static {v0, v1, v2}, Lcom/huawei/updatesdk/sdk/a/b/a/a/a;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    const/4 v0, 0x0

    return v0

    :goto_0
    const/4 v0, 0x0

    return v0
.end method

.method private static c(Landroid/content/Context;)Landroid/database/Cursor;
    .locals 6

    invoke-virtual {p0}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    move-result-object v0

    sget-object v1, Lcom/huawei/updatesdk/sdk/a/c/c/a;->a:Landroid/net/Uri;

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    invoke-virtual/range {v0 .. v5}, Landroid/content/ContentResolver;->query(Landroid/net/Uri;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object v0

    return-object v0
.end method

.method private static d(Landroid/content/Context;)Landroid/database/Cursor;
    .locals 4

    const/4 v1, 0x0

    invoke-static {}, Lcom/huawei/updatesdk/sdk/a/c/b/a/b;->a()Lcom/huawei/updatesdk/sdk/a/c/b/a/a;

    move-result-object v2

    invoke-interface {v2}, Lcom/huawei/updatesdk/sdk/a/c/b/a/a;->a()I

    move-result v3

    const/4 v0, 0x0

    if-ne v0, v3, :cond_0

    invoke-static {p0}, Lcom/huawei/updatesdk/sdk/a/c/c/a;->f(Landroid/content/Context;)Landroid/database/Cursor;

    move-result-object v1

    const/4 v0, 0x0

    if-ne v0, v1, :cond_1

    invoke-static {p0}, Lcom/huawei/updatesdk/sdk/a/c/c/a;->e(Landroid/content/Context;)Landroid/database/Cursor;

    move-result-object v1

    goto :goto_0

    :cond_0
    invoke-static {p0}, Lcom/huawei/updatesdk/sdk/a/c/c/a;->e(Landroid/content/Context;)Landroid/database/Cursor;

    move-result-object v1

    const/4 v0, 0x0

    if-ne v0, v1, :cond_1

    invoke-static {p0}, Lcom/huawei/updatesdk/sdk/a/c/c/a;->f(Landroid/content/Context;)Landroid/database/Cursor;

    move-result-object v1

    :cond_1
    :goto_0
    const/4 v0, 0x0

    if-ne v0, v1, :cond_2

    invoke-static {p0}, Lcom/huawei/updatesdk/sdk/a/c/c/a;->c(Landroid/content/Context;)Landroid/database/Cursor;

    move-result-object v1

    :cond_2
    return-object v1
.end method

.method private static e(Landroid/content/Context;)Landroid/database/Cursor;
    .locals 6

    invoke-virtual {p0}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    move-result-object v0

    sget-object v1, Lcom/huawei/updatesdk/sdk/a/c/c/a;->c:Landroid/net/Uri;

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    invoke-virtual/range {v0 .. v5}, Landroid/content/ContentResolver;->query(Landroid/net/Uri;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object v0

    return-object v0
.end method

.method private static f(Landroid/content/Context;)Landroid/database/Cursor;
    .locals 6

    invoke-virtual {p0}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    move-result-object v0

    sget-object v1, Lcom/huawei/updatesdk/sdk/a/c/c/a;->b:Landroid/net/Uri;

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    invoke-virtual/range {v0 .. v5}, Landroid/content/ContentResolver;->query(Landroid/net/Uri;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object v0

    return-object v0
.end method
