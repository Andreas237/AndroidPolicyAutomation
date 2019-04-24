.class public Lcom/huawei/hwid/core/d/b/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/huawei/hwid/core/d/b/c$a;
.implements Ljava/lang/Runnable;


# instance fields
.field private final a:Ljava/util/concurrent/BlockingQueue;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/concurrent/BlockingQueue<Ljava/lang/String;>;"
        }
    .end annotation
.end field

.field private b:Ljava/lang/Thread;

.field private volatile c:Z

.field private d:Ljava/io/File;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 20
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 30
    new-instance v0, Ljava/util/concurrent/LinkedBlockingQueue;

    invoke-direct {v0}, Ljava/util/concurrent/LinkedBlockingQueue;-><init>()V

    iput-object v0, p0, Lcom/huawei/hwid/core/d/b/a;->a:Ljava/util/concurrent/BlockingQueue;

    .line 40
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/huawei/hwid/core/d/b/a;->c:Z

    return-void
.end method

.method private static a(Ljava/io/Closeable;)V
    .locals 3

    .line 179
    if-eqz p0, :cond_0

    .line 181
    :try_start_0
    invoke-interface {p0}, Ljava/io/Closeable;->close()V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 184
    goto :goto_0

    .line 182
    :catch_0
    move-exception v2

    .line 183
    const-string v0, "FileLogger"

    const-string v1, "Exception when closing the closeable."

    invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 186
    :cond_0
    :goto_0
    return-void
.end method

.method private b(Ljava/lang/String;)V
    .locals 6

    .line 136
    iget-object v0, p0, Lcom/huawei/hwid/core/d/b/a;->d:Ljava/io/File;

    invoke-virtual {v0}, Ljava/io/File;->length()J

    move-result-wide v0

    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v2

    int-to-long v2, v2

    add-long/2addr v0, v2

    const-wide/32 v2, 0x300000

    cmp-long v0, v0, v2

    if-lez v0, :cond_0

    .line 137
    new-instance v4, Ljava/io/File;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v1, p0, Lcom/huawei/hwid/core/d/b/a;->d:Ljava/io/File;

    invoke-virtual {v1}, Ljava/io/File;->getPath()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ".bak"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v4, v0}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 139
    iget-object v0, p0, Lcom/huawei/hwid/core/d/b/a;->d:Ljava/io/File;

    invoke-virtual {v0, v4}, Ljava/io/File;->renameTo(Ljava/io/File;)Z

    move-result v5

    .line 140
    if-nez v5, :cond_0

    .line 141
    const-string v0, "FileLogger"

    const-string v1, "Failed to backup the log file."

    invoke-static {v0, v1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 144
    :cond_0
    return-void
.end method

.method private c(Ljava/lang/String;)V
    .locals 8

    .line 152
    const/4 v3, 0x0

    .line 153
    const/4 v4, 0x0

    .line 154
    const/4 v5, 0x0

    .line 156
    :try_start_0
    new-instance v0, Ljava/io/FileOutputStream;

    iget-object v1, p0, Lcom/huawei/hwid/core/d/b/a;->d:Ljava/io/File;

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Ljava/io/FileOutputStream;-><init>(Ljava/io/File;Z)V

    move-object v3, v0

    .line 157
    new-instance v0, Ljava/io/BufferedOutputStream;

    invoke-direct {v0, v3}, Ljava/io/BufferedOutputStream;-><init>(Ljava/io/OutputStream;)V

    move-object v4, v0

    .line 158
    new-instance v0, Ljava/io/OutputStreamWriter;

    const-string v1, "UTF-8"

    invoke-direct {v0, v4, v1}, Ljava/io/OutputStreamWriter;-><init>(Ljava/io/OutputStream;Ljava/lang/String;)V

    move-object v5, v0

    .line 160
    invoke-virtual {v5, p1}, Ljava/io/OutputStreamWriter;->write(Ljava/lang/String;)V

    .line 161
    invoke-virtual {v5}, Ljava/io/OutputStreamWriter;->flush()V
    :try_end_0
    .catch Ljava/io/FileNotFoundException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_1
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 167
    invoke-static {v5}, Lcom/huawei/hwid/core/d/b/a;->a(Ljava/io/Closeable;)V

    .line 168
    invoke-static {v4}, Lcom/huawei/hwid/core/d/b/a;->a(Ljava/io/Closeable;)V

    .line 169
    invoke-static {v3}, Lcom/huawei/hwid/core/d/b/a;->a(Ljava/io/Closeable;)V

    .line 170
    goto :goto_0

    .line 162
    :catch_0
    move-exception v6

    .line 163
    const-string v0, "FileLogger"

    const-string v1, "Exception when writing the log file."

    :try_start_1
    invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 167
    invoke-static {v5}, Lcom/huawei/hwid/core/d/b/a;->a(Ljava/io/Closeable;)V

    .line 168
    invoke-static {v4}, Lcom/huawei/hwid/core/d/b/a;->a(Ljava/io/Closeable;)V

    .line 169
    invoke-static {v3}, Lcom/huawei/hwid/core/d/b/a;->a(Ljava/io/Closeable;)V

    .line 170
    goto :goto_0

    .line 164
    :catch_1
    move-exception v6

    .line 165
    const-string v0, "FileLogger"

    const-string v1, "Exception when writing the log file."

    :try_start_2
    invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 167
    invoke-static {v5}, Lcom/huawei/hwid/core/d/b/a;->a(Ljava/io/Closeable;)V

    .line 168
    invoke-static {v4}, Lcom/huawei/hwid/core/d/b/a;->a(Ljava/io/Closeable;)V

    .line 169
    invoke-static {v3}, Lcom/huawei/hwid/core/d/b/a;->a(Ljava/io/Closeable;)V

    .line 170
    goto :goto_0

    .line 167
    :catchall_0
    move-exception v7

    invoke-static {v5}, Lcom/huawei/hwid/core/d/b/a;->a(Ljava/io/Closeable;)V

    .line 168
    invoke-static {v4}, Lcom/huawei/hwid/core/d/b/a;->a(Ljava/io/Closeable;)V

    .line 169
    invoke-static {v3}, Lcom/huawei/hwid/core/d/b/a;->a(Ljava/io/Closeable;)V

    throw v7

    .line 171
    :goto_0
    return-void
.end method


# virtual methods
.method public a(Ljava/io/File;)V
    .locals 3

    .line 66
    if-nez p1, :cond_0

    .line 67
    const-string v0, "FileLogger"

    const-string v1, "Invalid argument."

    invoke-static {v0, v1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 68
    return-void

    .line 71
    :cond_0
    invoke-virtual {p1}, Ljava/io/File;->getParentFile()Ljava/io/File;

    move-result-object v2

    .line 72
    const/4 v0, 0x0

    if-ne v0, v2, :cond_1

    .line 73
    const-string v0, "FileLogger"

    const-string v1, "logDir is null"

    invoke-static {v0, v1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 74
    return-void

    .line 76
    :cond_1
    invoke-virtual {v2}, Ljava/io/File;->mkdirs()Z

    move-result v0

    if-nez v0, :cond_2

    .line 77
    const-string v0, "FileLogger"

    const-string v1, "Failed to create the log dir or has created."

    invoke-static {v0, v1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 79
    :cond_2
    invoke-virtual {v2}, Ljava/io/File;->isDirectory()Z

    move-result v0

    if-nez v0, :cond_3

    .line 80
    const-string v0, "FileLogger"

    const-string v1, "Failed to create the log dir."

    invoke-static {v0, v1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 81
    return-void

    .line 84
    :cond_3
    iput-object p1, p0, Lcom/huawei/hwid/core/d/b/a;->d:Ljava/io/File;

    .line 86
    new-instance v0, Ljava/lang/Thread;

    const-string v1, "hwid-log-thread"

    invoke-direct {v0, p0, v1}, Ljava/lang/Thread;-><init>(Ljava/lang/Runnable;Ljava/lang/String;)V

    iput-object v0, p0, Lcom/huawei/hwid/core/d/b/a;->b:Ljava/lang/Thread;

    .line 87
    iget-object v0, p0, Lcom/huawei/hwid/core/d/b/a;->b:Ljava/lang/Thread;

    invoke-virtual {v0}, Ljava/lang/Thread;->start()V

    .line 88
    return-void
.end method

.method public a(Ljava/lang/String;)V
    .locals 2

    .line 52
    if-eqz p1, :cond_0

    iget-object v0, p0, Lcom/huawei/hwid/core/d/b/a;->d:Ljava/io/File;

    if-eqz v0, :cond_0

    .line 53
    iget-object v0, p0, Lcom/huawei/hwid/core/d/b/a;->a:Ljava/util/concurrent/BlockingQueue;

    invoke-interface {v0, p1}, Ljava/util/concurrent/BlockingQueue;->offer(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 54
    const-string v0, "FileLogger"

    const-string v1, "write offer failed"

    invoke-static {v0, v1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 57
    :cond_0
    return-void
.end method

.method public run()V
    .locals 5

    .line 110
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/huawei/hwid/core/d/b/a;->c:Z

    .line 112
    iget-object v0, p0, Lcom/huawei/hwid/core/d/b/a;->d:Ljava/io/File;

    if-eqz v0, :cond_1

    .line 114
    :goto_0
    iget-boolean v0, p0, Lcom/huawei/hwid/core/d/b/a;->c:Z

    if-eqz v0, :cond_1

    .line 116
    :try_start_0
    iget-object v0, p0, Lcom/huawei/hwid/core/d/b/a;->a:Ljava/util/concurrent/BlockingQueue;

    sget-object v1, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    const-wide/16 v2, 0x1

    invoke-interface {v0, v2, v3, v1}, Ljava/util/concurrent/BlockingQueue;->poll(JLjava/util/concurrent/TimeUnit;)Ljava/lang/Object;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Ljava/lang/String;

    .line 117
    if-eqz v4, :cond_0

    .line 118
    invoke-direct {p0, v4}, Lcom/huawei/hwid/core/d/b/a;->b(Ljava/lang/String;)V

    .line 119
    invoke-direct {p0, v4}, Lcom/huawei/hwid/core/d/b/a;->c(Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_0

    .line 123
    :cond_0
    goto :goto_0

    .line 121
    :catch_0
    move-exception v4

    .line 122
    .line 127
    :cond_1
    const-string v0, "FileLogger"

    const-string v1, "The log logger is closed."

    invoke-static {v0, v1}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 128
    return-void
.end method
