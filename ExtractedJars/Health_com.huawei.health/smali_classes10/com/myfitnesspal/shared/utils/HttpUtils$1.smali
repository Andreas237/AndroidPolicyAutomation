.class final Lcom/myfitnesspal/shared/utils/HttpUtils$1;
.super Landroid/os/AsyncTask;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/myfitnesspal/shared/utils/HttpUtils;->makeRequest(Ljava/lang/String;Ljava/lang/String;)Z
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Landroid/os/AsyncTask<Ljava/net/HttpURLConnection;Ljava/lang/Integer;Ljava/lang/String;>;"
    }
.end annotation


# instance fields
.field final synthetic val$rc:Ljava/net/HttpURLConnection;


# direct methods
.method constructor <init>(Ljava/net/HttpURLConnection;)V
    .locals 0

    .line 69
    iput-object p1, p0, Lcom/myfitnesspal/shared/utils/HttpUtils$1;->val$rc:Ljava/net/HttpURLConnection;

    invoke-direct {p0}, Landroid/os/AsyncTask;-><init>()V

    return-void
.end method


# virtual methods
.method protected bridge synthetic doInBackground([Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 69
    move-object v0, p1

    check-cast v0, [Ljava/net/HttpURLConnection;

    invoke-virtual {p0, v0}, Lcom/myfitnesspal/shared/utils/HttpUtils$1;->doInBackground([Ljava/net/HttpURLConnection;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method protected varargs doInBackground([Ljava/net/HttpURLConnection;)Ljava/lang/String;
    .locals 11

    .line 73
    const-string v0, "Making request..."

    const/4 v1, 0x0

    new-array v1, v1, [Ljava/lang/Object;

    invoke-static {v0, v1}, Lcom/myfitnesspal/shared/utils/Ln;->d(Ljava/lang/Object;[Ljava/lang/Object;)I

    .line 74
    const/4 v3, 0x0

    .line 78
    :try_start_0
    iget-object v0, p0, Lcom/myfitnesspal/shared/utils/HttpUtils$1;->val$rc:Ljava/net/HttpURLConnection;

    invoke-virtual {v0}, Ljava/net/HttpURLConnection;->connect()V

    .line 79
    const-string v0, "Making request..."

    const/4 v1, 0x0

    new-array v1, v1, [Ljava/lang/Object;

    invoke-static {v0, v1}, Lcom/myfitnesspal/shared/utils/Ln;->d(Ljava/lang/Object;[Ljava/lang/Object;)I

    .line 81
    new-instance v0, Ljava/io/InputStreamReader;

    iget-object v1, p0, Lcom/myfitnesspal/shared/utils/HttpUtils$1;->val$rc:Ljava/net/HttpURLConnection;

    invoke-virtual {v1}, Ljava/net/HttpURLConnection;->getInputStream()Ljava/io/InputStream;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/io/InputStreamReader;-><init>(Ljava/io/InputStream;)V

    move-object v3, v0

    .line 82
    const-string v0, "Making request..."

    const/4 v1, 0x0

    new-array v1, v1, [Ljava/lang/Object;

    invoke-static {v0, v1}, Lcom/myfitnesspal/shared/utils/Ln;->d(Ljava/lang/Object;[Ljava/lang/Object;)I

    .line 84
    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    .line 85
    const/16 v0, 0x400

    new-array v5, v0, [C

    .line 86
    :goto_0
    invoke-virtual {v3, v5}, Ljava/io/InputStreamReader;->read([C)I

    move-result v0

    if-ltz v0, :cond_0

    .line 88
    const-string v0, "read %s"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const/4 v2, 0x0

    aput-object v5, v1, v2

    invoke-static {v0, v1}, Lcom/myfitnesspal/shared/utils/Ln;->d(Ljava/lang/Object;[Ljava/lang/Object;)I

    .line 89
    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append([C)Ljava/lang/StringBuilder;

    goto :goto_0

    .line 92
    :cond_0
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v6

    .line 93
    iget-object v0, p0, Lcom/myfitnesspal/shared/utils/HttpUtils$1;->val$rc:Ljava/net/HttpURLConnection;

    invoke-virtual {v0}, Ljava/net/HttpURLConnection;->disconnect()V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_1
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 94
    move-object v7, v6

    .line 102
    if-eqz v3, :cond_1

    .line 106
    const-string v0, "Closing stream"

    const/4 v1, 0x0

    :try_start_1
    new-array v1, v1, [Ljava/lang/Object;

    invoke-static {v0, v1}, Lcom/myfitnesspal/shared/utils/Ln;->d(Ljava/lang/Object;[Ljava/lang/Object;)I

    .line 107
    invoke-virtual {v3}, Ljava/io/InputStreamReader;->close()V
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_0

    .line 112
    goto :goto_1

    .line 109
    :catch_0
    move-exception v8

    .line 111
    invoke-static {v8}, Lcom/myfitnesspal/shared/utils/Ln;->e(Ljava/lang/Throwable;)I

    .line 112
    :cond_1
    :goto_1
    return-object v7

    .line 96
    :catch_1
    move-exception v4

    .line 98
    :try_start_2
    invoke-static {v4}, Lcom/myfitnesspal/shared/utils/Ln;->e(Ljava/lang/Throwable;)I
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 102
    if-eqz v3, :cond_3

    .line 106
    const-string v0, "Closing stream"

    const/4 v1, 0x0

    :try_start_3
    new-array v1, v1, [Ljava/lang/Object;

    invoke-static {v0, v1}, Lcom/myfitnesspal/shared/utils/Ln;->d(Ljava/lang/Object;[Ljava/lang/Object;)I

    .line 107
    invoke-virtual {v3}, Ljava/io/InputStreamReader;->close()V
    :try_end_3
    .catch Ljava/io/IOException; {:try_start_3 .. :try_end_3} :catch_2

    .line 112
    goto :goto_3

    .line 109
    :catch_2
    move-exception v4

    .line 111
    invoke-static {v4}, Lcom/myfitnesspal/shared/utils/Ln;->e(Ljava/lang/Throwable;)I

    .line 112
    goto :goto_3

    .line 102
    :catchall_0
    move-exception v9

    if-eqz v3, :cond_2

    .line 106
    const-string v0, "Closing stream"

    const/4 v1, 0x0

    :try_start_4
    new-array v1, v1, [Ljava/lang/Object;

    invoke-static {v0, v1}, Lcom/myfitnesspal/shared/utils/Ln;->d(Ljava/lang/Object;[Ljava/lang/Object;)I

    .line 107
    invoke-virtual {v3}, Ljava/io/InputStreamReader;->close()V
    :try_end_4
    .catch Ljava/io/IOException; {:try_start_4 .. :try_end_4} :catch_3

    .line 112
    goto :goto_2

    .line 109
    :catch_3
    move-exception v10

    .line 111
    invoke-static {v10}, Lcom/myfitnesspal/shared/utils/Ln;->e(Ljava/lang/Throwable;)I

    .line 112
    :cond_2
    :goto_2
    throw v9

    .line 116
    :cond_3
    :goto_3
    const-string v0, ""

    return-object v0
.end method
