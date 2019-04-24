.class public final Lcom/huawei/openalliance/ad/g/b;
.super Lcom/huawei/openalliance/ad/g/a;


# instance fields
.field private b:Ljava/io/File;


# direct methods
.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lcom/huawei/openalliance/ad/g/a;-><init>()V

    return-void
.end method

.method public static a()Lcom/huawei/openalliance/ad/g/h;
    .locals 2

    new-instance v0, Lcom/huawei/openalliance/ad/g/f;

    new-instance v1, Lcom/huawei/openalliance/ad/g/b;

    invoke-direct {v1}, Lcom/huawei/openalliance/ad/g/b;-><init>()V

    invoke-direct {v0, v1}, Lcom/huawei/openalliance/ad/g/f;-><init>(Lcom/huawei/openalliance/ad/g/h;)V

    return-object v0
.end method

.method private static a(Ljava/io/Closeable;)V
    .locals 3

    if-eqz p0, :cond_0

    :try_start_0
    invoke-interface {p0}, Ljava/io/Closeable;->close()V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v2

    const-string v0, "FileLogNode"

    const-string v1, "Exception when closing the closeable."

    invoke-static {v0, v1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    :cond_0
    :goto_0
    return-void
.end method

.method private a(Ljava/lang/String;)V
    .locals 3

    const/4 v0, 0x0

    if-ne v0, p1, :cond_0

    return-void

    :cond_0
    iget-object v0, p0, Lcom/huawei/openalliance/ad/g/b;->b:Ljava/io/File;

    if-eqz v0, :cond_1

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const/16 v1, 0xa

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-direct {p0, v2}, Lcom/huawei/openalliance/ad/g/b;->b(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-direct {p0, v2}, Lcom/huawei/openalliance/ad/g/b;->c(Ljava/lang/String;)V

    :cond_1
    return-void
.end method

.method private b(Ljava/lang/String;)Z
    .locals 7

    iget-object v0, p0, Lcom/huawei/openalliance/ad/g/b;->b:Ljava/io/File;

    invoke-virtual {v0}, Ljava/io/File;->length()J

    move-result-wide v0

    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v2

    int-to-long v2, v2

    add-long/2addr v0, v2

    const-wide/32 v2, 0x64000

    cmp-long v0, v0, v2

    if-lez v0, :cond_3

    new-instance v4, Ljava/io/File;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v1, p0, Lcom/huawei/openalliance/ad/g/b;->b:Ljava/io/File;

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

    const/4 v5, 0x1

    invoke-virtual {v4}, Ljava/io/File;->exists()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {v4}, Ljava/io/File;->delete()Z

    move-result v5

    :cond_0
    if-eqz v5, :cond_2

    iget-object v0, p0, Lcom/huawei/openalliance/ad/g/b;->b:Ljava/io/File;

    invoke-virtual {v0, v4}, Ljava/io/File;->renameTo(Ljava/io/File;)Z

    move-result v6

    if-nez v6, :cond_1

    const-string v0, "FileLogNode"

    const-string v1, "Failed to backup the log file."

    invoke-static {v0, v1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    const/4 v0, 0x0

    return v0

    :cond_1
    goto :goto_0

    :cond_2
    const-string v0, "FileLogNode"

    const-string v1, "Cannot rename log file to bak."

    invoke-static {v0, v1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    const/4 v0, 0x0

    return v0

    :cond_3
    :goto_0
    const/4 v0, 0x1

    return v0
.end method

.method private c(Ljava/lang/String;)V
    .locals 8

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    :try_start_0
    new-instance v0, Ljava/io/FileOutputStream;

    iget-object v1, p0, Lcom/huawei/openalliance/ad/g/b;->b:Ljava/io/File;

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Ljava/io/FileOutputStream;-><init>(Ljava/io/File;Z)V

    move-object v3, v0

    new-instance v0, Ljava/io/BufferedOutputStream;

    invoke-direct {v0, v3}, Ljava/io/BufferedOutputStream;-><init>(Ljava/io/OutputStream;)V

    move-object v4, v0

    new-instance v0, Ljava/io/OutputStreamWriter;

    const-string v1, "UTF-8"

    invoke-direct {v0, v4, v1}, Ljava/io/OutputStreamWriter;-><init>(Ljava/io/OutputStream;Ljava/lang/String;)V

    move-object v5, v0

    invoke-virtual {v5, p1}, Ljava/io/OutputStreamWriter;->write(Ljava/lang/String;)V

    invoke-virtual {v5}, Ljava/io/OutputStreamWriter;->flush()V
    :try_end_0
    .catch Ljava/io/FileNotFoundException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_1
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-static {v5}, Lcom/huawei/openalliance/ad/g/b;->a(Ljava/io/Closeable;)V

    invoke-static {v4}, Lcom/huawei/openalliance/ad/g/b;->a(Ljava/io/Closeable;)V

    invoke-static {v3}, Lcom/huawei/openalliance/ad/g/b;->a(Ljava/io/Closeable;)V

    goto :goto_0

    :catch_0
    move-exception v6

    const-string v0, "FileLogNode"

    const-string v1, "Exception when writing the log file."

    :try_start_1
    invoke-static {v0, v1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    invoke-static {v5}, Lcom/huawei/openalliance/ad/g/b;->a(Ljava/io/Closeable;)V

    invoke-static {v4}, Lcom/huawei/openalliance/ad/g/b;->a(Ljava/io/Closeable;)V

    invoke-static {v3}, Lcom/huawei/openalliance/ad/g/b;->a(Ljava/io/Closeable;)V

    goto :goto_0

    :catch_1
    move-exception v6

    const-string v0, "FileLogNode"

    const-string v1, "Exception when writing the log file."

    :try_start_2
    invoke-static {v0, v1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    invoke-static {v5}, Lcom/huawei/openalliance/ad/g/b;->a(Ljava/io/Closeable;)V

    invoke-static {v4}, Lcom/huawei/openalliance/ad/g/b;->a(Ljava/io/Closeable;)V

    invoke-static {v3}, Lcom/huawei/openalliance/ad/g/b;->a(Ljava/io/Closeable;)V

    goto :goto_0

    :catchall_0
    move-exception v7

    invoke-static {v5}, Lcom/huawei/openalliance/ad/g/b;->a(Ljava/io/Closeable;)V

    invoke-static {v4}, Lcom/huawei/openalliance/ad/g/b;->a(Ljava/io/Closeable;)V

    invoke-static {v3}, Lcom/huawei/openalliance/ad/g/b;->a(Ljava/io/Closeable;)V

    throw v7

    :goto_0
    return-void
.end method


# virtual methods
.method public a(Ljava/lang/String;Ljava/lang/String;)Lcom/huawei/openalliance/ad/g/h;
    .locals 4

    const/4 v0, 0x0

    if-eq v0, p2, :cond_0

    invoke-virtual {p2}, Ljava/lang/String;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_1

    :cond_0
    const-string v0, "FileLogNode"

    const-string v1, "Failed to initialize the file logger, parameter error."

    invoke-static {v0, v1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    return-object p0

    :cond_1
    iget-object v0, p0, Lcom/huawei/openalliance/ad/g/b;->b:Ljava/io/File;

    const/4 v1, 0x0

    if-ne v1, v0, :cond_3

    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_3

    new-instance v3, Ljava/io/File;

    const-string v0, "Log"

    invoke-direct {v3, p1, v0}, Ljava/io/File;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v3}, Ljava/io/File;->isDirectory()Z

    move-result v0

    if-nez v0, :cond_2

    invoke-virtual {v3}, Ljava/io/File;->mkdirs()Z

    move-result v0

    if-eqz v0, :cond_3

    :cond_2
    new-instance v0, Ljava/io/File;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, ".log"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v3, v1}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    iput-object v0, p0, Lcom/huawei/openalliance/ad/g/b;->b:Ljava/io/File;

    iget-object v0, p0, Lcom/huawei/openalliance/ad/g/b;->b:Ljava/io/File;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Ljava/io/File;->setReadable(Z)Z

    iget-object v0, p0, Lcom/huawei/openalliance/ad/g/b;->b:Ljava/io/File;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Ljava/io/File;->setWritable(Z)Z

    iget-object v0, p0, Lcom/huawei/openalliance/ad/g/b;->b:Ljava/io/File;

    const/4 v1, 0x0

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Ljava/io/File;->setExecutable(ZZ)Z

    return-object p0

    :cond_3
    const-string v0, "FileLogNode"

    const-string v1, "Failed to initialize the file logger."

    invoke-static {v0, v1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    return-object p0
.end method

.method public a(Lcom/huawei/openalliance/ad/g/j;ILjava/lang/String;)V
    .locals 3

    if-nez p1, :cond_0

    return-void

    :cond_0
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p1}, Lcom/huawei/openalliance/ad/g/j;->a()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {p1}, Lcom/huawei/openalliance/ad/g/j;->b()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-direct {p0, v2}, Lcom/huawei/openalliance/ad/g/b;->a(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/huawei/openalliance/ad/g/b;->a:Lcom/huawei/openalliance/ad/g/h;

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/huawei/openalliance/ad/g/b;->a:Lcom/huawei/openalliance/ad/g/h;

    invoke-interface {v0, p1, p2, p3}, Lcom/huawei/openalliance/ad/g/h;->a(Lcom/huawei/openalliance/ad/g/j;ILjava/lang/String;)V

    :cond_1
    return-void
.end method
