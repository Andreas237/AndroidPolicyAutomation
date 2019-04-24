.class final Lcom/huawei/hms/c/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = null
.end annotation


# instance fields
.field final synthetic a:Ljava/io/File;

.field final synthetic b:J

.field final synthetic c:Ljava/lang/String;


# direct methods
.method constructor <init>(Ljava/io/File;JLjava/lang/String;)V
    .locals 0

    .line 35
    iput-object p1, p0, Lcom/huawei/hms/c/c;->a:Ljava/io/File;

    iput-wide p2, p0, Lcom/huawei/hms/c/c;->b:J

    iput-object p4, p0, Lcom/huawei/hms/c/c;->c:Ljava/lang/String;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 9

    .line 38
    iget-object v0, p0, Lcom/huawei/hms/c/c;->a:Ljava/io/File;

    if-nez v0, :cond_0

    .line 39
    const-string v0, "FileUtil"

    const-string v1, "In writeFile Failed to get local file."

    invoke-static {v0, v1}, Lcom/huawei/hms/support/log/a;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 40
    return-void

    .line 44
    :cond_0
    iget-object v0, p0, Lcom/huawei/hms/c/c;->a:Ljava/io/File;

    invoke-virtual {v0}, Ljava/io/File;->getParentFile()Ljava/io/File;

    move-result-object v3

    .line 45
    if-eqz v3, :cond_1

    invoke-virtual {v3}, Ljava/io/File;->mkdirs()Z

    move-result v0

    if-nez v0, :cond_2

    invoke-virtual {v3}, Ljava/io/File;->isDirectory()Z

    move-result v0

    if-nez v0, :cond_2

    .line 46
    :cond_1
    const-string v0, "FileUtil"

    const-string v1, "In writeFile, Failed to create directory."

    invoke-static {v0, v1}, Lcom/huawei/hms/support/log/a;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 47
    return-void

    .line 50
    :cond_2
    const/4 v4, 0x0

    .line 54
    :try_start_0
    iget-object v0, p0, Lcom/huawei/hms/c/c;->a:Ljava/io/File;

    invoke-virtual {v0}, Ljava/io/File;->length()J

    move-result-wide v5

    .line 56
    iget-wide v0, p0, Lcom/huawei/hms/c/c;->b:J

    cmp-long v0, v5, v0

    if-lez v0, :cond_4

    .line 58
    iget-object v0, p0, Lcom/huawei/hms/c/c;->a:Ljava/io/File;

    invoke-virtual {v0}, Ljava/io/File;->getCanonicalPath()Ljava/lang/String;

    move-result-object v7

    .line 59
    iget-object v0, p0, Lcom/huawei/hms/c/c;->a:Ljava/io/File;

    invoke-virtual {v0}, Ljava/io/File;->delete()Z

    move-result v0

    if-nez v0, :cond_3

    .line 61
    const-string v0, "FileUtil"

    const-string v1, "last file delete failed."

    invoke-static {v0, v1}, Lcom/huawei/hms/support/log/a;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 63
    :cond_3
    new-instance v0, Ljava/io/RandomAccessFile;

    new-instance v1, Ljava/io/File;

    invoke-direct {v1, v7}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    const-string v2, "rw"

    invoke-direct {v0, v1, v2}, Ljava/io/RandomAccessFile;-><init>(Ljava/io/File;Ljava/lang/String;)V

    move-object v4, v0

    .line 64
    goto :goto_0

    .line 68
    :cond_4
    new-instance v0, Ljava/io/RandomAccessFile;

    iget-object v1, p0, Lcom/huawei/hms/c/c;->a:Ljava/io/File;

    const-string v2, "rw"

    invoke-direct {v0, v1, v2}, Ljava/io/RandomAccessFile;-><init>(Ljava/io/File;Ljava/lang/String;)V

    move-object v4, v0

    .line 70
    invoke-virtual {v4, v5, v6}, Ljava/io/RandomAccessFile;->seek(J)V

    .line 73
    :goto_0
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v1, p0, Lcom/huawei/hms/c/c;->c:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "line.separator"

    invoke-static {v1}, Ljava/lang/System;->getProperty(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v4, v0}, Ljava/io/RandomAccessFile;->writeBytes(Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 79
    invoke-static {v4}, Lcom/huawei/hms/c/e;->a(Ljava/io/Closeable;)V

    .line 81
    goto :goto_1

    .line 75
    :catch_0
    move-exception v5

    .line 76
    const-string v0, "FileUtil"

    const-string v1, "writeFile exception:"

    :try_start_1
    invoke-static {v0, v1, v5}, Lcom/huawei/hms/support/log/a;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 79
    invoke-static {v4}, Lcom/huawei/hms/c/e;->a(Ljava/io/Closeable;)V

    .line 81
    goto :goto_1

    .line 79
    :catchall_0
    move-exception v8

    invoke-static {v4}, Lcom/huawei/hms/c/e;->a(Ljava/io/Closeable;)V

    throw v8

    .line 82
    :goto_1
    return-void
.end method
