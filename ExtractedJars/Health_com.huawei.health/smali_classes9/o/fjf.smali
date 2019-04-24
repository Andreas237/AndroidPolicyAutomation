.class public Lo/fjf;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private b:Landroid/content/Context;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 0

    .line 65
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 66
    iput-object p1, p0, Lo/fjf;->b:Landroid/content/Context;

    .line 67
    return-void
.end method

.method static synthetic a(Lo/fjf;)Landroid/content/Context;
    .locals 1

    .line 26
    iget-object v0, p0, Lo/fjf;->b:Landroid/content/Context;

    return-object v0
.end method


# virtual methods
.method public b()V
    .locals 5

    .line 73
    const-string v0, "UserInfoMockUtil"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "insertUserInfoDataToDB"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 74
    invoke-static {}, Ljava/util/concurrent/Executors;->newSingleThreadExecutor()Ljava/util/concurrent/ExecutorService;

    move-result-object v4

    .line 75
    new-instance v0, Lo/fjf$1;

    invoke-direct {v0, p0}, Lo/fjf$1;-><init>(Lo/fjf;)V

    invoke-interface {v4, v0}, Ljava/util/concurrent/ExecutorService;->execute(Ljava/lang/Runnable;)V

    .line 98
    return-void
.end method

.method public c()Landroid/graphics/Bitmap;
    .locals 9

    .line 105
    const/4 v4, 0x0

    .line 106
    const/4 v5, 0x0

    .line 109
    const-string v0, "healthgroup"

    const-string v1, "pic_6.png"

    :try_start_0
    invoke-static {v0, v1}, Lo/dmq;->c(Ljava/lang/String;Ljava/lang/String;)Ljava/io/InputStream;

    move-result-object v0

    move-object v5, v0

    .line 110
    invoke-static {v5}, Landroid/graphics/BitmapFactory;->decodeStream(Ljava/io/InputStream;)Landroid/graphics/Bitmap;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_1
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result-object v0

    move-object v4, v0

    .line 114
    if-eqz v5, :cond_1

    .line 116
    :try_start_1
    invoke-virtual {v5}, Ljava/io/InputStream;->close()V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    .line 119
    goto :goto_1

    .line 117
    :catch_0
    move-exception v6

    .line 118
    const-string v0, "UserInfoMockUtil"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "readProfileBitmapFromStoreDemo e is "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {v6}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 119
    goto :goto_1

    .line 111
    :catch_1
    move-exception v6

    .line 112
    const-string v0, "UserInfoMockUtil"

    const/4 v1, 0x2

    :try_start_2
    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "readProfileBitmapFromStoreDemo e is "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {v6}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 114
    if-eqz v5, :cond_1

    .line 116
    :try_start_3
    invoke-virtual {v5}, Ljava/io/InputStream;->close()V
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_2

    .line 119
    goto :goto_1

    .line 117
    :catch_2
    move-exception v6

    .line 118
    const-string v0, "UserInfoMockUtil"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "readProfileBitmapFromStoreDemo e is "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {v6}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 119
    goto :goto_1

    .line 114
    :catchall_0
    move-exception v7

    if-eqz v5, :cond_0

    .line 116
    :try_start_4
    invoke-virtual {v5}, Ljava/io/InputStream;->close()V
    :try_end_4
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_3

    .line 119
    goto :goto_0

    .line 117
    :catch_3
    move-exception v8

    .line 118
    const-string v0, "UserInfoMockUtil"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "readProfileBitmapFromStoreDemo e is "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {v8}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 121
    :cond_0
    :goto_0
    throw v7

    .line 122
    :cond_1
    :goto_1
    return-object v4
.end method
