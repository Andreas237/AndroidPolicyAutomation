.class public Lcom/usebutton/sdk/internal/api/RequestShepherd;
.super Ljava/lang/Object;
.source "RequestShepherd.java"


# static fields
.field public static final CAPACITY:I = 0x64

.field private static final NEWEST_TO_OLDEST_COMPARER:Ljava/util/Comparator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Comparator<",
            "Ljava/io/File;",
            ">;"
        }
    .end annotation
.end field

.field private static final REQUEST_FOLDER:Ljava/lang/String; = "com.usebutton.requests-1"

.field private static final TAG:Ljava/lang/String; = "RequestShepherd"


# instance fields
.field private final mContext:Landroid/content/Context;

.field private final mFileSystemLock:Ljava/lang/Object;

.field private mNextSequence:I

.field private mRequestDir:Ljava/io/File;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 49
    new-instance v0, Lcom/usebutton/sdk/internal/api/RequestShepherd$1;

    invoke-direct {v0}, Lcom/usebutton/sdk/internal/api/RequestShepherd$1;-><init>()V

    sput-object v0, Lcom/usebutton/sdk/internal/api/RequestShepherd;->NEWEST_TO_OLDEST_COMPARER:Ljava/util/Comparator;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    .line 60
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    .line 57
    iput v0, p0, Lcom/usebutton/sdk/internal/api/RequestShepherd;->mNextSequence:I

    .line 58
    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    iput-object v0, p0, Lcom/usebutton/sdk/internal/api/RequestShepherd;->mFileSystemLock:Ljava/lang/Object;

    .line 61
    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object p1

    iput-object p1, p0, Lcom/usebutton/sdk/internal/api/RequestShepherd;->mContext:Landroid/content/Context;

    return-void
.end method

.method private deleteFile(Ljava/io/File;)V
    .locals 2

    if-nez p1, :cond_0

    return-void

    .line 172
    :cond_0
    iget-object v0, p0, Lcom/usebutton/sdk/internal/api/RequestShepherd;->mFileSystemLock:Ljava/lang/Object;

    monitor-enter v0

    .line 173
    :try_start_0
    invoke-virtual {p1}, Ljava/io/File;->exists()Z

    move-result v1

    if-eqz v1, :cond_1

    .line 174
    invoke-virtual {p1}, Ljava/io/File;->delete()Z

    .line 176
    :cond_1
    monitor-exit v0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method

.method private declared-synchronized getRequestDir()Ljava/io/File;
    .locals 3
    .annotation build Landroid/support/annotation/WorkerThread;
    .end annotation

    monitor-enter p0

    .line 121
    :try_start_0
    iget-object v0, p0, Lcom/usebutton/sdk/internal/api/RequestShepherd;->mRequestDir:Ljava/io/File;

    if-nez v0, :cond_0

    .line 122
    new-instance v0, Ljava/io/File;

    iget-object v1, p0, Lcom/usebutton/sdk/internal/api/RequestShepherd;->mContext:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getCacheDir()Ljava/io/File;

    move-result-object v1

    const-string v2, "com.usebutton.requests-1"

    invoke-direct {v0, v1, v2}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    iput-object v0, p0, Lcom/usebutton/sdk/internal/api/RequestShepherd;->mRequestDir:Ljava/io/File;

    .line 124
    :cond_0
    iget-object v0, p0, Lcom/usebutton/sdk/internal/api/RequestShepherd;->mRequestDir:Ljava/io/File;

    invoke-virtual {v0}, Ljava/io/File;->exists()Z

    move-result v0

    if-nez v0, :cond_1

    .line 125
    iget-object v0, p0, Lcom/usebutton/sdk/internal/api/RequestShepherd;->mRequestDir:Ljava/io/File;

    invoke-virtual {v0}, Ljava/io/File;->mkdirs()Z

    .line 127
    :cond_1
    iget-object v0, p0, Lcom/usebutton/sdk/internal/api/RequestShepherd;->mRequestDir:Ljava/io/File;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-object v0

    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method private isEmpty([Ljava/io/File;)Z
    .locals 0

    if-eqz p1, :cond_1

    .line 110
    array-length p1, p1

    if-nez p1, :cond_0

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 p1, 0x1

    :goto_1
    return p1
.end method

.method private nextRequestFile()Ljava/io/File;
    .locals 2

    .line 181
    iget-object v0, p0, Lcom/usebutton/sdk/internal/api/RequestShepherd;->mFileSystemLock:Ljava/lang/Object;

    monitor-enter v0

    .line 182
    :try_start_0
    invoke-direct {p0}, Lcom/usebutton/sdk/internal/api/RequestShepherd;->getRequestDir()Ljava/io/File;

    move-result-object v1

    invoke-virtual {v1}, Ljava/io/File;->listFiles()[Ljava/io/File;

    move-result-object v1

    .line 183
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 184
    invoke-direct {p0, v1}, Lcom/usebutton/sdk/internal/api/RequestShepherd;->isEmpty([Ljava/io/File;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x0

    return-object v0

    .line 185
    :cond_0
    sget-object v0, Lcom/usebutton/sdk/internal/api/RequestShepherd;->NEWEST_TO_OLDEST_COMPARER:Ljava/util/Comparator;

    invoke-static {v1, v0}, Ljava/util/Arrays;->sort([Ljava/lang/Object;Ljava/util/Comparator;)V

    const/4 v0, 0x0

    .line 186
    aget-object v0, v1, v0

    return-object v0

    :catchall_0
    move-exception v1

    .line 183
    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v1
.end method

.method private readFile(Ljava/io/File;)Ljava/lang/String;
    .locals 4
    .param p1    # Ljava/io/File;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .annotation build Landroid/support/annotation/Nullable;
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 192
    iget-object v0, p0, Lcom/usebutton/sdk/internal/api/RequestShepherd;->mFileSystemLock:Ljava/lang/Object;

    monitor-enter v0

    .line 193
    :try_start_0
    invoke-virtual {p1}, Ljava/io/File;->exists()Z

    move-result v1

    const/4 v2, 0x0

    if-nez v1, :cond_0

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_2

    return-object v2

    .line 196
    :cond_0
    :try_start_1
    new-instance v1, Ljava/io/BufferedReader;

    new-instance v3, Ljava/io/FileReader;

    invoke-direct {v3, p1}, Ljava/io/FileReader;-><init>(Ljava/io/File;)V

    invoke-direct {v1, v3}, Ljava/io/BufferedReader;-><init>(Ljava/io/Reader;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 197
    :try_start_2
    new-instance p1, Ljava/io/StringWriter;

    invoke-direct {p1}, Ljava/io/StringWriter;-><init>()V

    .line 199
    :goto_0
    invoke-virtual {v1}, Ljava/io/BufferedReader;->readLine()Ljava/lang/String;

    move-result-object v2

    if-eqz v2, :cond_1

    .line 200
    invoke-virtual {p1, v2}, Ljava/io/StringWriter;->append(Ljava/lang/CharSequence;)Ljava/io/StringWriter;

    goto :goto_0

    .line 202
    :cond_1
    invoke-virtual {p1}, Ljava/io/StringWriter;->toString()Ljava/lang/String;

    move-result-object p1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 206
    :try_start_3
    invoke-virtual {v1}, Ljava/io/BufferedReader;->close()V
    :try_end_3
    .catch Ljava/io/IOException; {:try_start_3 .. :try_end_3} :catch_0
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    goto :goto_1

    :catch_0
    move-exception v1

    :try_start_4
    const-string v2, "RequestShepherd"

    const-string v3, "Could not close reader."

    .line 208
    invoke-static {v2, v3, v1}, Lcom/usebutton/sdk/internal/util/ButtonLog;->warn(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 212
    :goto_1
    monitor-exit v0
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_2

    return-object p1

    :catchall_0
    move-exception p1

    goto :goto_2

    :catchall_1
    move-exception p1

    move-object v1, v2

    :goto_2
    if-eqz v1, :cond_2

    .line 206
    :try_start_5
    invoke-virtual {v1}, Ljava/io/BufferedReader;->close()V
    :try_end_5
    .catch Ljava/io/IOException; {:try_start_5 .. :try_end_5} :catch_1
    .catchall {:try_start_5 .. :try_end_5} :catchall_2

    goto :goto_3

    :catch_1
    move-exception v1

    :try_start_6
    const-string v2, "RequestShepherd"

    const-string v3, "Could not close reader."

    .line 208
    invoke-static {v2, v3, v1}, Lcom/usebutton/sdk/internal/util/ButtonLog;->warn(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 209
    :cond_2
    :goto_3
    throw p1

    :catchall_2
    move-exception p1

    .line 212
    monitor-exit v0
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_2

    throw p1
.end method

.method private trimToCapacity()V
    .locals 5

    .line 96
    iget-object v0, p0, Lcom/usebutton/sdk/internal/api/RequestShepherd;->mFileSystemLock:Ljava/lang/Object;

    monitor-enter v0

    .line 97
    :try_start_0
    invoke-direct {p0}, Lcom/usebutton/sdk/internal/api/RequestShepherd;->getRequestDir()Ljava/io/File;

    move-result-object v1

    invoke-virtual {v1}, Ljava/io/File;->listFiles()[Ljava/io/File;

    move-result-object v1

    .line 98
    invoke-direct {p0, v1}, Lcom/usebutton/sdk/internal/api/RequestShepherd;->isEmpty([Ljava/io/File;)Z

    move-result v2

    if-eqz v2, :cond_0

    monitor-exit v0

    return-void

    .line 100
    :cond_0
    array-length v2, v1

    const/16 v3, 0x64

    if-ge v2, v3, :cond_1

    monitor-exit v0

    return-void

    .line 102
    :cond_1
    sget-object v2, Lcom/usebutton/sdk/internal/api/RequestShepherd;->NEWEST_TO_OLDEST_COMPARER:Ljava/util/Comparator;

    invoke-static {v1, v2}, Ljava/util/Arrays;->sort([Ljava/lang/Object;Ljava/util/Comparator;)V

    const/4 v2, 0x0

    .line 103
    :goto_0
    array-length v4, v1

    sub-int/2addr v4, v3

    if-ge v2, v4, :cond_2

    .line 104
    aget-object v4, v1, v2

    invoke-virtual {v4}, Ljava/io/File;->delete()Z

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    .line 106
    :cond_2
    monitor-exit v0

    return-void

    :catchall_0
    move-exception v1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method


# virtual methods
.method protected fileForRequest(Lcom/usebutton/sdk/internal/api/Request;)Ljava/io/File;
    .locals 2
    .annotation build Landroid/support/annotation/NonNull;
    .end annotation

    .line 116
    new-instance v0, Ljava/io/File;

    invoke-direct {p0}, Lcom/usebutton/sdk/internal/api/RequestShepherd;->getRequestDir()Ljava/io/File;

    move-result-object v1

    invoke-virtual {p1}, Lcom/usebutton/sdk/internal/api/Request;->getRequestId()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, v1, p1}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    return-object v0
.end method

.method public hasPendingRequests()Z
    .locals 2
    .annotation build Landroid/support/annotation/WorkerThread;
    .end annotation

    .line 144
    iget-object v0, p0, Lcom/usebutton/sdk/internal/api/RequestShepherd;->mFileSystemLock:Ljava/lang/Object;

    monitor-enter v0

    .line 145
    :try_start_0
    invoke-direct {p0}, Lcom/usebutton/sdk/internal/api/RequestShepherd;->getRequestDir()Ljava/io/File;

    move-result-object v1

    invoke-virtual {v1}, Ljava/io/File;->listFiles()[Ljava/io/File;

    move-result-object v1

    .line 146
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz v1, :cond_0

    .line 147
    array-length v0, v1

    if-lez v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0

    :catchall_0
    move-exception v1

    .line 146
    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v1
.end method

.method public markAsDone(Lcom/usebutton/sdk/internal/api/Request;)V
    .locals 4
    .annotation build Landroid/support/annotation/WorkerThread;
    .end annotation

    .line 136
    invoke-virtual {p0, p1}, Lcom/usebutton/sdk/internal/api/RequestShepherd;->fileForRequest(Lcom/usebutton/sdk/internal/api/Request;)Ljava/io/File;

    move-result-object p1

    .line 137
    invoke-direct {p0, p1}, Lcom/usebutton/sdk/internal/api/RequestShepherd;->deleteFile(Ljava/io/File;)V

    const-string v0, "RequestShepherd"

    const-string v1, "Marked request as OK: %s"

    const/4 v2, 0x1

    .line 138
    new-array v2, v2, [Ljava/lang/Object;

    const/4 v3, 0x0

    aput-object p1, v2, v3

    invoke-static {v0, v1, v2}, Lcom/usebutton/sdk/internal/util/ButtonLog;->infoFormat(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    return-void
.end method

.method public nextPendingRequest()Lcom/usebutton/sdk/internal/api/Request;
    .locals 7
    .annotation build Landroid/support/annotation/Nullable;
    .end annotation

    .annotation build Landroid/support/annotation/WorkerThread;
    .end annotation

    .line 153
    invoke-direct {p0}, Lcom/usebutton/sdk/internal/api/RequestShepherd;->nextRequestFile()Ljava/io/File;

    move-result-object v0

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return-object v1

    .line 156
    :cond_0
    :try_start_0
    invoke-direct {p0, v0}, Lcom/usebutton/sdk/internal/api/RequestShepherd;->readFile(Ljava/io/File;)Ljava/lang/String;

    move-result-object v2

    const-string v3, "RequestShepherd"

    const-string v4, "Found persisted request at: %s"

    const/4 v5, 0x1

    .line 157
    new-array v5, v5, [Ljava/lang/Object;

    const/4 v6, 0x0

    aput-object v0, v5, v6

    invoke-static {v3, v4, v5}, Lcom/usebutton/sdk/internal/util/ButtonLog;->infoFormat(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    if-nez v2, :cond_1

    .line 159
    invoke-direct {p0, v0}, Lcom/usebutton/sdk/internal/api/RequestShepherd;->deleteFile(Ljava/io/File;)V

    .line 161
    :cond_1
    invoke-static {v2}, Lcom/usebutton/sdk/internal/api/Request;->read(Ljava/lang/String;)Lcom/usebutton/sdk/internal/api/Request;

    move-result-object v0
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    return-object v0

    :catch_0
    move-exception v2

    const-string v3, "RequestShepherd"

    const-string v4, "Couldn\'t read persisted request, will delete."

    .line 164
    invoke-static {v3, v4, v2}, Lcom/usebutton/sdk/internal/util/ButtonLog;->warn(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 165
    invoke-direct {p0, v0}, Lcom/usebutton/sdk/internal/api/RequestShepherd;->deleteFile(Ljava/io/File;)V

    return-object v1
.end method

.method public watch(Lcom/usebutton/sdk/internal/api/Request;)V
    .locals 7
    .annotation build Landroid/support/annotation/WorkerThread;
    .end annotation

    .line 70
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v1, "."

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/usebutton/sdk/internal/api/RequestShepherd;->mNextSequence:I

    add-int/lit8 v2, v1, 0x1

    iput v2, p0, Lcom/usebutton/sdk/internal/api/RequestShepherd;->mNextSequence:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/usebutton/sdk/internal/api/Request;->setRequestId(Ljava/lang/String;)V

    .line 71
    invoke-virtual {p0, p1}, Lcom/usebutton/sdk/internal/api/RequestShepherd;->fileForRequest(Lcom/usebutton/sdk/internal/api/Request;)Ljava/io/File;

    move-result-object v0

    const/4 v1, 0x0

    .line 74
    :try_start_0
    iget-object v2, p0, Lcom/usebutton/sdk/internal/api/RequestShepherd;->mFileSystemLock:Ljava/lang/Object;

    monitor-enter v2
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_1
    .catchall {:try_start_0 .. :try_end_0} :catchall_3

    .line 75
    :try_start_1
    new-instance v3, Ljava/io/FileWriter;

    invoke-direct {v3, v0}, Ljava/io/FileWriter;-><init>(Ljava/io/File;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_2

    .line 76
    :try_start_2
    new-instance v1, Ljava/io/StringWriter;

    invoke-direct {v1}, Ljava/io/StringWriter;-><init>()V

    .line 77
    invoke-virtual {p1, v1}, Lcom/usebutton/sdk/internal/api/Request;->write(Ljava/io/StringWriter;)V

    .line 78
    invoke-virtual {v1}, Ljava/io/StringWriter;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v3, p1}, Ljava/io/FileWriter;->write(Ljava/lang/String;)V

    const-string p1, "RequestShepherd"

    const-string v4, "Wrote request to: %s %s"

    const/4 v5, 0x2

    .line 79
    new-array v5, v5, [Ljava/lang/Object;

    const/4 v6, 0x0

    aput-object v0, v5, v6

    const/4 v6, 0x1

    aput-object v1, v5, v6

    invoke-static {p1, v4, v5}, Lcom/usebutton/sdk/internal/util/ButtonLog;->infoFormat(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 80
    monitor-exit v2
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 81
    :try_start_3
    invoke-direct {p0}, Lcom/usebutton/sdk/internal/api/RequestShepherd;->trimToCapacity()V
    :try_end_3
    .catch Ljava/io/IOException; {:try_start_3 .. :try_end_3} :catch_0
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 88
    :try_start_4
    invoke-virtual {v3}, Ljava/io/FileWriter;->close()V
    :try_end_4
    .catch Ljava/io/IOException; {:try_start_4 .. :try_end_4} :catch_2

    goto :goto_2

    :catchall_0
    move-exception p1

    move-object v1, v3

    goto :goto_3

    :catch_0
    move-exception p1

    move-object v1, v3

    goto :goto_1

    :catchall_1
    move-exception p1

    move-object v1, v3

    goto :goto_0

    :catchall_2
    move-exception p1

    .line 80
    :goto_0
    :try_start_5
    monitor-exit v2
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_2

    :try_start_6
    throw p1
    :try_end_6
    .catch Ljava/io/IOException; {:try_start_6 .. :try_end_6} :catch_1
    .catchall {:try_start_6 .. :try_end_6} :catchall_3

    :catchall_3
    move-exception p1

    goto :goto_3

    :catch_1
    move-exception p1

    :goto_1
    :try_start_7
    const-string v2, "RequestShepherd"

    const-string v3, "Couldn\'t write request to disk, not much we can do."

    .line 83
    invoke-static {v2, v3, p1}, Lcom/usebutton/sdk/internal/util/ButtonLog;->warn(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 84
    invoke-direct {p0, v0}, Lcom/usebutton/sdk/internal/api/RequestShepherd;->deleteFile(Ljava/io/File;)V
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_3

    if-eqz v1, :cond_0

    .line 88
    :try_start_8
    invoke-virtual {v1}, Ljava/io/FileWriter;->close()V
    :try_end_8
    .catch Ljava/io/IOException; {:try_start_8 .. :try_end_8} :catch_2

    :catch_2
    :cond_0
    :goto_2
    return-void

    :goto_3
    if-eqz v1, :cond_1

    :try_start_9
    invoke-virtual {v1}, Ljava/io/FileWriter;->close()V
    :try_end_9
    .catch Ljava/io/IOException; {:try_start_9 .. :try_end_9} :catch_3

    .line 90
    :catch_3
    :cond_1
    throw p1
.end method
