.class public Lo/bud;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/media/MediaPlayer$OnCompletionListener;


# static fields
.field private static volatile e:Lo/bud;


# instance fields
.field private a:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<Ljava/lang/Integer;>;"
        }
    .end annotation
.end field

.field private b:Landroid/content/Context;

.field private c:Landroid/media/MediaPlayer;


# direct methods
.method private constructor <init>(Landroid/content/Context;)V
    .locals 1

    .line 24
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 25
    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    iput-object v0, p0, Lo/bud;->b:Landroid/content/Context;

    .line 26
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lo/bud;->a:Ljava/util/List;

    .line 27
    return-void
.end method

.method public static c(Landroid/content/Context;)Lo/bud;
    .locals 3

    .line 30
    sget-object v0, Lo/bud;->e:Lo/bud;

    if-nez v0, :cond_1

    .line 31
    const-class v1, Lo/bud;

    monitor-enter v1

    .line 32
    :try_start_0
    sget-object v0, Lo/bud;->e:Lo/bud;

    if-nez v0, :cond_0

    .line 33
    new-instance v0, Lo/bud;

    invoke-direct {v0, p0}, Lo/bud;-><init>(Landroid/content/Context;)V

    sput-object v0, Lo/bud;->e:Lo/bud;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 35
    :cond_0
    monitor-exit v1

    goto :goto_0

    :catchall_0
    move-exception v2

    monitor-exit v1

    throw v2

    .line 37
    :cond_1
    :goto_0
    sget-object v0, Lo/bud;->e:Lo/bud;

    return-object v0
.end method

.method private c(I)V
    .locals 10

    .line 55
    iget-object v0, p0, Lo/bud;->b:Landroid/content/Context;

    invoke-static {v0}, Lo/bud;->e(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 56
    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lo/bud;->onCompletion(Landroid/media/MediaPlayer;)V

    .line 57
    return-void

    .line 60
    :cond_0
    iget-object v0, p0, Lo/bud;->b:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0, p1}, Landroid/content/res/Resources;->openRawResourceFd(I)Landroid/content/res/AssetFileDescriptor;

    move-result-object v6

    .line 61
    if-eqz v6, :cond_1

    .line 63
    :try_start_0
    iget-object v0, p0, Lo/bud;->c:Landroid/media/MediaPlayer;

    invoke-virtual {v0}, Landroid/media/MediaPlayer;->reset()V

    .line 64
    iget-object v0, p0, Lo/bud;->c:Landroid/media/MediaPlayer;

    invoke-virtual {v6}, Landroid/content/res/AssetFileDescriptor;->getFileDescriptor()Ljava/io/FileDescriptor;

    move-result-object v1

    invoke-virtual {v6}, Landroid/content/res/AssetFileDescriptor;->getStartOffset()J

    move-result-wide v2

    invoke-virtual {v6}, Landroid/content/res/AssetFileDescriptor;->getLength()J

    move-result-wide v4

    invoke-virtual/range {v0 .. v5}, Landroid/media/MediaPlayer;->setDataSource(Ljava/io/FileDescriptor;JJ)V

    .line 65
    iget-object v0, p0, Lo/bud;->c:Landroid/media/MediaPlayer;

    invoke-virtual {v0}, Landroid/media/MediaPlayer;->prepare()V

    .line 66
    iget-object v0, p0, Lo/bud;->c:Landroid/media/MediaPlayer;

    invoke-virtual {v0}, Landroid/media/MediaPlayer;->start()V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_1
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 71
    :try_start_1
    invoke-virtual {v6}, Landroid/content/res/AssetFileDescriptor;->close()V
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_0

    .line 74
    goto :goto_1

    .line 72
    :catch_0
    move-exception v7

    .line 73
    const-string v0, "SugVoice"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    invoke-virtual {v7}, Ljava/io/IOException;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cac;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 75
    goto :goto_1

    .line 67
    :catch_1
    move-exception v7

    .line 68
    const-string v0, "SugVoice"

    const/4 v1, 0x1

    :try_start_2
    new-array v1, v1, [Ljava/lang/Object;

    invoke-virtual {v7}, Ljava/io/IOException;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cac;->b(Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 71
    :try_start_3
    invoke-virtual {v6}, Landroid/content/res/AssetFileDescriptor;->close()V
    :try_end_3
    .catch Ljava/io/IOException; {:try_start_3 .. :try_end_3} :catch_2

    .line 74
    goto :goto_1

    .line 72
    :catch_2
    move-exception v7

    .line 73
    const-string v0, "SugVoice"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    invoke-virtual {v7}, Ljava/io/IOException;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cac;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 75
    goto :goto_1

    .line 70
    :catchall_0
    move-exception v8

    .line 71
    :try_start_4
    invoke-virtual {v6}, Landroid/content/res/AssetFileDescriptor;->close()V
    :try_end_4
    .catch Ljava/io/IOException; {:try_start_4 .. :try_end_4} :catch_3

    .line 74
    goto :goto_0

    .line 72
    :catch_3
    move-exception v9

    .line 73
    const-string v0, "SugVoice"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    invoke-virtual {v9}, Ljava/io/IOException;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cac;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 75
    :goto_0
    throw v8

    .line 77
    :cond_1
    :goto_1
    return-void
.end method

.method private e()V
    .locals 1

    .line 80
    new-instance v0, Landroid/media/MediaPlayer;

    invoke-direct {v0}, Landroid/media/MediaPlayer;-><init>()V

    iput-object v0, p0, Lo/bud;->c:Landroid/media/MediaPlayer;

    .line 81
    iget-object v0, p0, Lo/bud;->c:Landroid/media/MediaPlayer;

    invoke-virtual {v0, p0}, Landroid/media/MediaPlayer;->setOnCompletionListener(Landroid/media/MediaPlayer$OnCompletionListener;)V

    .line 82
    return-void
.end method

.method public static e(Landroid/content/Context;)Z
    .locals 4

    .line 99
    const-string v0, "phone"

    invoke-virtual {p0, v0}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Landroid/telephony/TelephonyManager;

    .line 100
    const/4 v3, 0x0

    .line 101
    if-eqz v2, :cond_1

    .line 103
    invoke-virtual {v2}, Landroid/telephony/TelephonyManager;->getCallState()I

    move-result v0

    const/4 v1, 0x2

    if-ne v0, v1, :cond_0

    const/4 v3, 0x1

    goto :goto_0

    :cond_0
    const/4 v3, 0x0

    .line 105
    :cond_1
    :goto_0
    return v3
.end method


# virtual methods
.method public d(I)V
    .locals 2

    .line 42
    iget-object v0, p0, Lo/bud;->c:Landroid/media/MediaPlayer;

    if-nez v0, :cond_0

    .line 43
    invoke-direct {p0}, Lo/bud;->e()V

    .line 46
    :cond_0
    iget-object v0, p0, Lo/bud;->c:Landroid/media/MediaPlayer;

    invoke-virtual {v0}, Landroid/media/MediaPlayer;->isPlaying()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 47
    iget-object v0, p0, Lo/bud;->a:Ljava/util/List;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 49
    :cond_1
    invoke-direct {p0, p1}, Lo/bud;->c(I)V

    .line 51
    :goto_0
    return-void
.end method

.method public onCompletion(Landroid/media/MediaPlayer;)V
    .locals 2

    .line 86
    iget-object v0, p0, Lo/bud;->a:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-eqz v0, :cond_0

    if-eqz p1, :cond_0

    .line 87
    iget-object v0, p0, Lo/bud;->a:Ljava/util/List;

    const/4 v1, 0x0

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    invoke-direct {p0, v0}, Lo/bud;->c(I)V

    .line 88
    iget-object v0, p0, Lo/bud;->a:Ljava/util/List;

    const/4 v1, 0x0

    invoke-interface {v0, v1}, Ljava/util/List;->remove(I)Ljava/lang/Object;

    goto :goto_0

    .line 90
    :cond_0
    iget-object v0, p0, Lo/bud;->a:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->clear()V

    .line 91
    iget-object v0, p0, Lo/bud;->c:Landroid/media/MediaPlayer;

    invoke-virtual {v0}, Landroid/media/MediaPlayer;->release()V

    .line 92
    const/4 v0, 0x0

    iput-object v0, p0, Lo/bud;->c:Landroid/media/MediaPlayer;

    .line 94
    :goto_0
    return-void
.end method
