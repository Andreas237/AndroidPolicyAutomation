.class public Lcom/yandex/metrica/impl/ob/ea;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# static fields
.field private static volatile a:Lcom/yandex/metrica/impl/ob/ea;
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "StaticFieldLeak"
        }
    .end annotation
.end field

.field private static final b:Ljava/lang/Object;


# instance fields
.field private c:Landroid/content/Context;
    .annotation build Landroid/support/annotation/NonNull;
    .end annotation
.end field

.field private d:Landroid/net/LocalServerSocket;
    .annotation build Landroid/support/annotation/Nullable;
    .end annotation
.end field

.field private e:Z

.field private f:Ljava/lang/Thread;
    .annotation build Landroid/support/annotation/Nullable;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 30
    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lcom/yandex/metrica/impl/ob/ea;->b:Ljava/lang/Object;

    return-void
.end method

.method private constructor <init>(Landroid/content/Context;)V
    .locals 0
    .param p1    # Landroid/content/Context;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    .line 56
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 57
    iput-object p1, p0, Lcom/yandex/metrica/impl/ob/ea;->c:Landroid/content/Context;

    return-void
.end method

.method public static a(Landroid/content/Context;)Lcom/yandex/metrica/impl/ob/ea;
    .locals 2
    .annotation build Landroid/support/annotation/NonNull;
    .end annotation

    .line 34
    sget-object v0, Lcom/yandex/metrica/impl/ob/ea;->a:Lcom/yandex/metrica/impl/ob/ea;

    if-nez v0, :cond_1

    .line 35
    sget-object v0, Lcom/yandex/metrica/impl/ob/ea;->b:Ljava/lang/Object;

    monitor-enter v0

    .line 36
    :try_start_0
    sget-object v1, Lcom/yandex/metrica/impl/ob/ea;->a:Lcom/yandex/metrica/impl/ob/ea;

    if-nez v1, :cond_0

    .line 37
    new-instance v1, Lcom/yandex/metrica/impl/ob/ea;

    invoke-virtual {p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object p0

    invoke-direct {v1, p0}, Lcom/yandex/metrica/impl/ob/ea;-><init>(Landroid/content/Context;)V

    sput-object v1, Lcom/yandex/metrica/impl/ob/ea;->a:Lcom/yandex/metrica/impl/ob/ea;

    .line 39
    :cond_0
    monitor-exit v0

    goto :goto_0

    :catchall_0
    move-exception p0

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p0

    .line 41
    :cond_1
    :goto_0
    sget-object p0, Lcom/yandex/metrica/impl/ob/ea;->a:Lcom/yandex/metrica/impl/ob/ea;

    return-object p0
.end method


# virtual methods
.method public declared-synchronized a()Z
    .locals 3

    monitor-enter p0

    .line 62
    :try_start_0
    iget-boolean v0, p0, Lcom/yandex/metrica/impl/ob/ea;->e:Z

    const/4 v1, 0x1

    if-eq v0, v1, :cond_0

    .line 63
    iput-boolean v1, p0, Lcom/yandex/metrica/impl/ob/ea;->e:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 65
    :try_start_1
    new-instance v0, Landroid/net/LocalServerSocket;

    const-string v2, "com.yandex.metrica.configuration.MetricaConfigurationService"

    invoke-direct {v0, v2}, Landroid/net/LocalServerSocket;-><init>(Ljava/lang/String;)V

    iput-object v0, p0, Lcom/yandex/metrica/impl/ob/ea;->d:Landroid/net/LocalServerSocket;

    const-string v0, "YMM-CS"

    .line 66
    invoke-static {v0, p0}, Lcom/yandex/metrica/impl/ob/lt;->a(Ljava/lang/String;Ljava/lang/Runnable;)Ljava/lang/Thread;

    move-result-object v0

    iput-object v0, p0, Lcom/yandex/metrica/impl/ob/ea;->f:Ljava/lang/Thread;

    .line 67
    iget-object v0, p0, Lcom/yandex/metrica/impl/ob/ea;->f:Ljava/lang/Thread;

    invoke-virtual {v0}, Ljava/lang/Thread;->start()V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 69
    monitor-exit p0

    return v1

    :catch_0
    :cond_0
    const/4 v0, 0x0

    .line 74
    :try_start_2
    iput-boolean v0, p0, Lcom/yandex/metrica/impl/ob/ea;->e:Z
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 75
    monitor-exit p0

    return v0

    :catchall_0
    move-exception v0

    .line 61
    monitor-exit p0

    throw v0
.end method

.method public declared-synchronized b()V
    .locals 2

    monitor-enter p0

    const/4 v0, 0x0

    .line 80
    :try_start_0
    iput-boolean v0, p0, Lcom/yandex/metrica/impl/ob/ea;->e:Z

    .line 81
    iget-object v0, p0, Lcom/yandex/metrica/impl/ob/ea;->f:Ljava/lang/Thread;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    .line 82
    iget-object v0, p0, Lcom/yandex/metrica/impl/ob/ea;->f:Ljava/lang/Thread;

    invoke-virtual {v0}, Ljava/lang/Thread;->interrupt()V

    .line 83
    iput-object v1, p0, Lcom/yandex/metrica/impl/ob/ea;->f:Ljava/lang/Thread;

    .line 85
    :cond_0
    iget-object v0, p0, Lcom/yandex/metrica/impl/ob/ea;->d:Landroid/net/LocalServerSocket;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz v0, :cond_1

    .line 87
    :try_start_1
    iget-object v0, p0, Lcom/yandex/metrica/impl/ob/ea;->d:Landroid/net/LocalServerSocket;

    invoke-virtual {v0}, Landroid/net/LocalServerSocket;->close()V
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 91
    :catch_0
    :try_start_2
    iput-object v1, p0, Lcom/yandex/metrica/impl/ob/ea;->d:Landroid/net/LocalServerSocket;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 94
    :cond_1
    monitor-exit p0

    return-void

    :catchall_0
    move-exception v0

    .line 79
    monitor-exit p0

    throw v0
.end method

.method public run()V
    .locals 6

    .line 99
    :catch_0
    :cond_0
    :goto_0
    iget-boolean v0, p0, Lcom/yandex/metrica/impl/ob/ea;->e:Z

    if-eqz v0, :cond_5

    .line 101
    monitor-enter p0

    .line 102
    :try_start_0
    iget-boolean v0, p0, Lcom/yandex/metrica/impl/ob/ea;->e:Z

    const/4 v1, 0x0

    if-eqz v0, :cond_1

    .line 103
    iget-object v0, p0, Lcom/yandex/metrica/impl/ob/ea;->d:Landroid/net/LocalServerSocket;

    goto :goto_1

    :cond_1
    move-object v0, v1

    .line 105
    :goto_1
    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_4

    if-eqz v0, :cond_0

    .line 110
    :try_start_1
    invoke-virtual {v0}, Landroid/net/LocalServerSocket;->accept()Landroid/net/LocalSocket;

    move-result-object v0
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_6
    .catchall {:try_start_1 .. :try_end_1} :catchall_3

    .line 1130
    :try_start_2
    iget-object v2, p0, Lcom/yandex/metrica/impl/ob/ea;->c:Landroid/content/Context;

    invoke-virtual {v2}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v2
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_7
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    .line 1133
    :try_start_3
    new-instance v3, Ljava/io/BufferedOutputStream;

    invoke-virtual {v0}, Landroid/net/LocalSocket;->getOutputStream()Ljava/io/OutputStream;

    move-result-object v4

    invoke-direct {v3, v4}, Ljava/io/BufferedOutputStream;-><init>(Ljava/io/OutputStream;)V
    :try_end_3
    .catch Ljava/io/IOException; {:try_start_3 .. :try_end_3} :catch_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    :try_start_4
    const-string v1, "UTF-8"

    .line 1134
    invoke-virtual {v2, v1}, Ljava/lang/String;->getBytes(Ljava/lang/String;)[B

    move-result-object v1

    invoke-virtual {v3, v1}, Ljava/io/OutputStream;->write([B)V

    .line 1135
    invoke-virtual {v3}, Ljava/io/OutputStream;->flush()V
    :try_end_4
    .catch Ljava/io/IOException; {:try_start_4 .. :try_end_4} :catch_1
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 1142
    :try_start_5
    invoke-virtual {v3}, Ljava/io/OutputStream;->close()V
    :try_end_5
    .catch Ljava/io/IOException; {:try_start_5 .. :try_end_5} :catch_4
    .catchall {:try_start_5 .. :try_end_5} :catchall_2

    goto :goto_4

    :catchall_0
    move-exception v1

    goto :goto_2

    :catch_1
    move-object v1, v3

    goto :goto_3

    :catchall_1
    move-exception v2

    move-object v3, v1

    move-object v1, v2

    :goto_2
    if-eqz v3, :cond_2

    :try_start_6
    invoke-virtual {v3}, Ljava/io/OutputStream;->close()V
    :try_end_6
    .catch Ljava/io/IOException; {:try_start_6 .. :try_end_6} :catch_2
    .catchall {:try_start_6 .. :try_end_6} :catchall_2

    .line 1147
    :catch_2
    :cond_2
    :try_start_7
    throw v1
    :try_end_7
    .catch Ljava/io/IOException; {:try_start_7 .. :try_end_7} :catch_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_2

    :catch_3
    :goto_3
    if-eqz v1, :cond_3

    .line 1142
    :try_start_8
    invoke-virtual {v1}, Ljava/io/OutputStream;->close()V
    :try_end_8
    .catch Ljava/io/IOException; {:try_start_8 .. :try_end_8} :catch_4
    .catchall {:try_start_8 .. :try_end_8} :catchall_2

    :catch_4
    :cond_3
    :goto_4
    if-eqz v0, :cond_0

    .line 118
    :goto_5
    :try_start_9
    invoke-virtual {v0}, Landroid/net/LocalSocket;->close()V
    :try_end_9
    .catch Ljava/io/IOException; {:try_start_9 .. :try_end_9} :catch_0

    goto :goto_0

    :catchall_2
    move-exception v1

    goto :goto_6

    :catchall_3
    move-exception v0

    move-object v5, v1

    move-object v1, v0

    move-object v0, v5

    :goto_6
    if-eqz v0, :cond_4

    :try_start_a
    invoke-virtual {v0}, Landroid/net/LocalSocket;->close()V
    :try_end_a
    .catch Ljava/io/IOException; {:try_start_a .. :try_end_a} :catch_5

    .line 123
    :catch_5
    :cond_4
    throw v1

    :catch_6
    move-object v0, v1

    :catch_7
    if-eqz v0, :cond_0

    goto :goto_5

    :catchall_4
    move-exception v0

    .line 105
    :try_start_b
    monitor-exit p0
    :try_end_b
    .catchall {:try_start_b .. :try_end_b} :catchall_4

    throw v0

    :cond_5
    return-void
.end method
