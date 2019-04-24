.class public Lo/cec;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/cei;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lo/cec$d;,
        Lo/cec$e;
    }
.end annotation


# static fields
.field private static a:Landroid/media/AudioManager;


# instance fields
.field private b:Ljava/lang/Thread;

.field private c:Landroid/content/Context;

.field private d:Z

.field private e:Landroid/media/MediaPlayer;

.field private f:Landroid/os/Handler;

.field private g:Landroid/os/Handler;

.field private h:Landroid/media/MediaPlayer$OnCompletionListener;

.field private i:Landroid/os/HandlerThread;

.field private k:Ljava/util/HashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/HashMap<Ljava/lang/Integer;Ljava/lang/Integer;>;"
        }
    .end annotation
.end field

.field private l:Z

.field private m:Landroid/media/AudioManager$OnAudioFocusChangeListener;

.field private p:Landroid/os/Handler;


# direct methods
.method public constructor <init>(Landroid/content/Context;Ljava/util/Map;)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Landroid/content/Context;Ljava/util/Map<Ljava/lang/Integer;Ljava/lang/Integer;>;)V"
        }
    .end annotation

    .line 88
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 54
    const/4 v0, 0x0

    iput-boolean v0, p0, Lo/cec;->d:Z

    .line 56
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lo/cec;->k:Ljava/util/HashMap;

    .line 57
    const/4 v0, 0x0

    iput-object v0, p0, Lo/cec;->i:Landroid/os/HandlerThread;

    .line 58
    const/4 v0, 0x0

    iput-object v0, p0, Lo/cec;->f:Landroid/os/Handler;

    .line 59
    new-instance v0, Landroid/os/Handler;

    invoke-direct {v0}, Landroid/os/Handler;-><init>()V

    iput-object v0, p0, Lo/cec;->g:Landroid/os/Handler;

    .line 60
    const/4 v0, 0x0

    iput-object v0, p0, Lo/cec;->h:Landroid/media/MediaPlayer$OnCompletionListener;

    .line 61
    const/4 v0, 0x0

    iput-boolean v0, p0, Lo/cec;->l:Z

    .line 62
    new-instance v0, Lo/cec$d;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Lo/cec$d;-><init>(Lo/cec;Lo/cec$4;)V

    iput-object v0, p0, Lo/cec;->p:Landroid/os/Handler;

    .line 63
    new-instance v0, Lo/cec$4;

    invoke-direct {v0, p0}, Lo/cec$4;-><init>(Lo/cec;)V

    iput-object v0, p0, Lo/cec;->m:Landroid/media/AudioManager$OnAudioFocusChangeListener;

    .line 89
    const-string v0, "Track_MediaPlayerVoiceEng"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "MediaPlayerVoiceEng"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const-string v2, " START"

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 90
    iput-object p1, p0, Lo/cec;->c:Landroid/content/Context;

    .line 91
    invoke-direct {p0, p2}, Lo/cec;->c(Ljava/util/Map;)V

    .line 92
    invoke-direct {p0}, Lo/cec;->f()V

    .line 93
    return-void
.end method

.method static synthetic a(Lo/cec;Landroid/media/MediaPlayer;)Landroid/media/MediaPlayer;
    .locals 0

    .line 42
    iput-object p1, p0, Lo/cec;->e:Landroid/media/MediaPlayer;

    return-object p1
.end method

.method private a()V
    .locals 2

    .line 283
    iget-object v0, p0, Lo/cec;->f:Landroid/os/Handler;

    if-eqz v0, :cond_0

    .line 284
    iget-object v0, p0, Lo/cec;->f:Landroid/os/Handler;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeCallbacksAndMessages(Ljava/lang/Object;)V

    .line 286
    :cond_0
    return-void
.end method

.method private a(Ljava/lang/Object;)V
    .locals 4

    .line 235
    iget-boolean v0, p0, Lo/cec;->d:Z

    if-nez v0, :cond_0

    .line 237
    const-string v0, "Track_MediaPlayerVoiceEng"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "playVoice() isFinishedLoad is false!"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 238
    return-void

    .line 241
    :cond_0
    new-instance v0, Lo/cec$1;

    invoke-direct {v0, p0, p1}, Lo/cec$1;-><init>(Lo/cec;Ljava/lang/Object;)V

    invoke-direct {p0, v0}, Lo/cec;->d(Ljava/lang/Runnable;)V

    .line 275
    return-void
.end method

.method private a(Ljava/lang/String;)V
    .locals 9

    .line 398
    iget-object v0, p0, Lo/cec;->e:Landroid/media/MediaPlayer;

    if-nez v0, :cond_0

    .line 400
    new-instance v0, Landroid/media/MediaPlayer;

    invoke-direct {v0}, Landroid/media/MediaPlayer;-><init>()V

    iput-object v0, p0, Lo/cec;->e:Landroid/media/MediaPlayer;

    .line 402
    :cond_0
    iget-object v0, p0, Lo/cec;->e:Landroid/media/MediaPlayer;

    invoke-virtual {v0}, Landroid/media/MediaPlayer;->reset()V

    .line 404
    const-string v0, "Track_MediaPlayerVoiceEng"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "playSound"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 407
    :try_start_0
    sget-object v0, Ljava/text/Normalizer$Form;->NFKC:Ljava/text/Normalizer$Form;

    invoke-static {p1, v0}, Ljava/text/Normalizer;->normalize(Ljava/lang/CharSequence;Ljava/text/Normalizer$Form;)Ljava/lang/String;

    move-result-object p1

    .line 408
    iget-object v0, p0, Lo/cec;->c:Landroid/content/Context;

    if-eqz v0, :cond_1

    const-string v0, "assert"

    invoke-virtual {p1, v0}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_2

    .line 409
    :cond_1
    iget-object v0, p0, Lo/cec;->e:Landroid/media/MediaPlayer;

    invoke-virtual {v0, p1}, Landroid/media/MediaPlayer;->setDataSource(Ljava/lang/String;)V

    goto :goto_0

    .line 411
    :cond_2
    iget-object v0, p0, Lo/cec;->c:Landroid/content/Context;

    const-string v1, "audio"

    invoke-virtual {v0, v1}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    move-object v6, v0

    check-cast v6, Landroid/media/AudioManager;

    .line 412
    const/4 v0, 0x3

    invoke-virtual {v6, v0}, Landroid/media/AudioManager;->getStreamVolume(I)I

    move-result v7

    .line 413
    const-string v0, "Track_MediaPlayerVoiceEng"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "playSound() voice volume"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 414
    const-string v0, "assert"

    const-string v1, ""

    invoke-virtual {p1, v0, v1}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;

    move-result-object p1

    .line 415
    iget-object v0, p0, Lo/cec;->c:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getAssets()Landroid/content/res/AssetManager;

    move-result-object v0

    invoke-virtual {v0, p1}, Landroid/content/res/AssetManager;->openFd(Ljava/lang/String;)Landroid/content/res/AssetFileDescriptor;

    move-result-object v8

    .line 416
    iget-object v0, p0, Lo/cec;->e:Landroid/media/MediaPlayer;

    invoke-virtual {v8}, Landroid/content/res/AssetFileDescriptor;->getFileDescriptor()Ljava/io/FileDescriptor;

    move-result-object v1

    invoke-virtual {v8}, Landroid/content/res/AssetFileDescriptor;->getStartOffset()J

    move-result-wide v2

    invoke-virtual {v8}, Landroid/content/res/AssetFileDescriptor;->getLength()J

    move-result-wide v4

    invoke-virtual/range {v0 .. v5}, Landroid/media/MediaPlayer;->setDataSource(Ljava/io/FileDescriptor;JJ)V

    .line 419
    :goto_0
    iget-object v0, p0, Lo/cec;->e:Landroid/media/MediaPlayer;

    invoke-virtual {v0}, Landroid/media/MediaPlayer;->prepare()V

    .line 420
    iget-object v0, p0, Lo/cec;->e:Landroid/media/MediaPlayer;

    invoke-virtual {v0}, Landroid/media/MediaPlayer;->start()V

    .line 421
    iget-object v0, p0, Lo/cec;->e:Landroid/media/MediaPlayer;

    new-instance v1, Lo/cec$10;

    invoke-direct {v1, p0}, Lo/cec$10;-><init>(Lo/cec;)V

    invoke-virtual {v0, v1}, Landroid/media/MediaPlayer;->setOnCompletionListener(Landroid/media/MediaPlayer$OnCompletionListener;)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/SecurityException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/IllegalStateException; {:try_start_0 .. :try_end_0} :catch_0

    .line 450
    goto :goto_1

    .line 437
    :catch_0
    move-exception v6

    .line 439
    const-string v0, "Track_MediaPlayerVoiceEng"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "PorcessFused()"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {v6}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 440
    iget-object v0, p0, Lo/cec;->e:Landroid/media/MediaPlayer;

    if-eqz v0, :cond_3

    .line 441
    iget-object v0, p0, Lo/cec;->e:Landroid/media/MediaPlayer;

    invoke-virtual {v0}, Landroid/media/MediaPlayer;->release()V

    .line 442
    const/4 v0, 0x0

    iput-object v0, p0, Lo/cec;->e:Landroid/media/MediaPlayer;

    .line 444
    :cond_3
    invoke-direct {p0}, Lo/cec;->h()I

    .line 447
    new-instance v7, Landroid/content/Intent;

    const-string v0, "ACTION_RESET_MEDIA_IDLE"

    invoke-direct {v7, v0}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    .line 448
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0, v7}, Lo/ccd;->b(Landroid/content/Context;Landroid/content/Intent;)V

    .line 452
    :goto_1
    return-void
.end method

.method static synthetic a(Lo/cec;)V
    .locals 0

    .line 42
    invoke-direct {p0}, Lo/cec;->g()V

    return-void
.end method

.method static synthetic b(Lo/cec;)I
    .locals 1

    .line 42
    invoke-direct {p0}, Lo/cec;->i()I

    move-result v0

    return v0
.end method

.method private b()V
    .locals 4

    .line 172
    const-string v0, "Track_MediaPlayerVoiceEng"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "music"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const-string v2, " onPlaySpeak() engine is not valid!"

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 173
    iget-object v0, p0, Lo/cec;->h:Landroid/media/MediaPlayer$OnCompletionListener;

    if-eqz v0, :cond_1

    .line 175
    iget-boolean v0, p0, Lo/cec;->l:Z

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    .line 176
    iget-object v0, p0, Lo/cec;->h:Landroid/media/MediaPlayer$OnCompletionListener;

    const/4 v1, 0x0

    invoke-interface {v0, v1}, Landroid/media/MediaPlayer$OnCompletionListener;->onCompletion(Landroid/media/MediaPlayer;)V

    goto :goto_0

    .line 178
    :cond_0
    iget-object v0, p0, Lo/cec;->h:Landroid/media/MediaPlayer$OnCompletionListener;

    iget-object v1, p0, Lo/cec;->e:Landroid/media/MediaPlayer;

    invoke-interface {v0, v1}, Landroid/media/MediaPlayer$OnCompletionListener;->onCompletion(Landroid/media/MediaPlayer;)V

    .line 182
    :cond_1
    :goto_0
    return-void
.end method

.method private b(Ljava/lang/String;)V
    .locals 3

    .line 388
    iget-object v0, p0, Lo/cec;->p:Landroid/os/Handler;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 389
    iget-object v0, p0, Lo/cec;->p:Landroid/os/Handler;

    invoke-virtual {v0}, Landroid/os/Handler;->obtainMessage()Landroid/os/Message;

    move-result-object v2

    .line 390
    const/16 v0, 0x65

    iput v0, v2, Landroid/os/Message;->what:I

    .line 391
    iput-object p1, v2, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 392
    iget-object v0, p0, Lo/cec;->p:Landroid/os/Handler;

    invoke-virtual {v0, v2}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    .line 394
    :cond_0
    return-void
.end method

.method static synthetic b(Lo/cec;Ljava/lang/Object;)V
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 42
    invoke-direct {p0, p1}, Lo/cec;->d(Ljava/lang/Object;)V

    return-void
.end method

.method static synthetic b(Lo/cec;Ljava/lang/String;)V
    .locals 0

    .line 42
    invoke-direct {p0, p1}, Lo/cec;->b(Ljava/lang/String;)V

    return-void
.end method

.method static synthetic c(Lo/cec;)Ljava/util/HashMap;
    .locals 1

    .line 42
    iget-object v0, p0, Lo/cec;->k:Ljava/util/HashMap;

    return-object v0
.end method

.method private c(Ljava/util/Map;)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/Map<Ljava/lang/Integer;Ljava/lang/Integer;>;)V"
        }
    .end annotation

    .line 197
    if-eqz p1, :cond_0

    invoke-interface {p1}, Ljava/util/Map;->size()I

    move-result v0

    if-nez v0, :cond_1

    .line 199
    :cond_0
    const-string v0, "Track_MediaPlayerVoiceEng"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "music"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const-string v2, " initSoundPool() voiceResource is null!"

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 200
    return-void

    .line 202
    :cond_1
    iget-object v0, p0, Lo/cec;->c:Landroid/content/Context;

    const-string v1, "audio"

    invoke-virtual {v0, v1}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/media/AudioManager;

    sput-object v0, Lo/cec;->a:Landroid/media/AudioManager;

    .line 204
    new-instance v0, Ljava/lang/Thread;

    new-instance v1, Lo/cec$2;

    invoke-direct {v1, p0, p1}, Lo/cec$2;-><init>(Lo/cec;Ljava/util/Map;)V

    const-string v2, "LoadStreamThread"

    invoke-direct {v0, v1, v2}, Ljava/lang/Thread;-><init>(Ljava/lang/Runnable;Ljava/lang/String;)V

    iput-object v0, p0, Lo/cec;->b:Ljava/lang/Thread;

    .line 217
    iget-object v0, p0, Lo/cec;->b:Ljava/lang/Thread;

    invoke-virtual {v0}, Ljava/lang/Thread;->start()V

    .line 218
    return-void
.end method

.method static synthetic d(Lo/cec;)Landroid/content/Context;
    .locals 1

    .line 42
    iget-object v0, p0, Lo/cec;->c:Landroid/content/Context;

    return-object v0
.end method

.method private d(Ljava/lang/Object;)V
    .locals 16
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 456
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    move-object/from16 v1, p0

    iget-object v1, v1, Lo/cec;->c:Landroid/content/Context;

    const-string v2, "Sound"

    invoke-virtual {v1, v2}, Landroid/content/Context;->getExternalFilesDir(Ljava/lang/String;)Ljava/io/File;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    sget-object v1, Ljava/io/File;->separator:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "sound.mp3"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    .line 457
    new-instance v5, Ljava/io/File;

    invoke-direct {v5, v4}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 458
    invoke-virtual {v5}, Ljava/io/File;->exists()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 459
    new-instance v0, Ljava/io/File;

    invoke-direct {v0, v4}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0}, Ljava/io/File;->delete()Z

    move-result v0

    const/4 v1, 0x0

    if-ne v1, v0, :cond_0

    .line 460
    const-string v0, "Track_MediaPlayerVoiceEng"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    sget v2, Lcom/huawei/healthcloud/plugintrack/R$string;->IDS_motiontrack_show_tip_file_delete_failed:I

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 464
    :cond_0
    new-instance v6, Ljava/util/Vector;

    invoke-direct {v6}, Ljava/util/Vector;-><init>()V

    .line 466
    const/4 v7, 0x1

    .line 467
    move-object/from16 v8, p1

    :try_start_0
    check-cast v8, Ljava/util/List;

    .line 468
    const/4 v0, 0x0

    invoke-interface {v8, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v9

    .line 469
    instance-of v7, v9, Ljava/lang/Integer;

    .line 470
    if-eqz v7, :cond_2

    .line 471
    move-object/from16 v10, p1

    check-cast v10, Ljava/util/List;

    .line 472
    invoke-interface {v10}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v11

    :goto_0
    invoke-interface {v11}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {v11}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v12, v0

    check-cast v12, Ljava/lang/Integer;

    .line 473
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/cec;->c:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    move-object/from16 v1, p0

    iget-object v1, v1, Lo/cec;->k:Ljava/util/HashMap;

    invoke-virtual {v1, v12}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Integer;

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->openRawResource(I)Ljava/io/InputStream;

    move-result-object v0

    invoke-virtual {v6, v0}, Ljava/util/Vector;->add(Ljava/lang/Object;)Z

    .line 474
    goto :goto_0

    .line 475
    :cond_1
    goto :goto_2

    .line 476
    :cond_2
    move-object/from16 v10, p1

    check-cast v10, Ljava/util/List;

    .line 477
    invoke-interface {v10}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v11

    :goto_1
    invoke-interface {v11}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-interface {v11}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v12, v0

    check-cast v12, Ljava/lang/String;

    .line 478
    new-instance v0, Ljava/io/FileInputStream;

    invoke-direct {v0, v12}, Ljava/io/FileInputStream;-><init>(Ljava/lang/String;)V

    invoke-virtual {v6, v0}, Ljava/util/Vector;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 479
    goto :goto_1

    .line 494
    :cond_3
    :goto_2
    goto :goto_4

    .line 481
    :catch_0
    move-exception v7

    .line 482
    const/4 v8, 0x1

    .line 483
    move-object/from16 v9, p1

    check-cast v9, Ljava/util/List;

    .line 484
    const/4 v0, 0x0

    invoke-interface {v9, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v10

    .line 485
    instance-of v8, v10, Ljava/lang/Integer;

    .line 486
    if-eqz v8, :cond_5

    .line 487
    move-object/from16 v11, p1

    check-cast v11, Ljava/util/List;

    .line 488
    invoke-interface {v11}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v12

    :goto_3
    invoke-interface {v12}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_4

    invoke-interface {v12}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v13, v0

    check-cast v13, Ljava/lang/Integer;

    .line 489
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/cec;->c:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v13}, Ljava/lang/Integer;->intValue()I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->openRawResource(I)Ljava/io/InputStream;

    move-result-object v0

    invoke-virtual {v6, v0}, Ljava/util/Vector;->add(Ljava/lang/Object;)Z

    .line 490
    goto :goto_3

    .line 491
    :cond_4
    goto :goto_4

    .line 492
    :cond_5
    const-string v0, "Track_MediaPlayerVoiceEng"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "mergeSoundFile() e = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {v7}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 495
    :goto_4
    invoke-virtual {v6}, Ljava/util/Vector;->elements()Ljava/util/Enumeration;

    move-result-object v7

    .line 497
    const/4 v8, 0x0

    .line 498
    const/4 v9, 0x0

    .line 500
    :try_start_1
    new-instance v0, Ljava/io/SequenceInputStream;

    invoke-direct {v0, v7}, Ljava/io/SequenceInputStream;-><init>(Ljava/util/Enumeration;)V

    move-object v8, v0

    .line 501
    new-instance v0, Ljava/io/FileOutputStream;

    invoke-direct {v0, v5}, Ljava/io/FileOutputStream;-><init>(Ljava/io/File;)V

    move-object v9, v0

    .line 502
    const/16 v0, 0x400

    new-array v10, v0, [B

    .line 503
    :goto_5
    invoke-virtual {v8, v10}, Ljava/io/SequenceInputStream;->read([B)I

    move-result v0

    const/4 v1, -0x1

    if-eq v0, v1, :cond_6

    .line 504
    invoke-virtual {v9, v10}, Ljava/io/FileOutputStream;->write([B)V
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_3
    .catch Ljava/lang/IllegalArgumentException; {:try_start_1 .. :try_end_1} :catch_3
    .catch Ljava/lang/SecurityException; {:try_start_1 .. :try_end_1} :catch_3
    .catch Ljava/lang/IllegalStateException; {:try_start_1 .. :try_end_1} :catch_3
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_5

    .line 511
    :cond_6
    if-eqz v9, :cond_7

    .line 512
    :try_start_2
    invoke-virtual {v9}, Ljava/io/FileOutputStream;->close()V
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_1

    .line 516
    :cond_7
    goto :goto_6

    .line 514
    :catch_1
    move-exception v10

    .line 515
    const-string v0, "Track_MediaPlayerVoiceEng"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "PorcessFused() fos e = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {v10}, Ljava/io/IOException;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 518
    :goto_6
    if-eqz v8, :cond_8

    .line 519
    :try_start_3
    invoke-virtual {v8}, Ljava/io/SequenceInputStream;->close()V
    :try_end_3
    .catch Ljava/io/IOException; {:try_start_3 .. :try_end_3} :catch_2

    .line 523
    :cond_8
    goto/16 :goto_a

    .line 521
    :catch_2
    move-exception v10

    .line 522
    const-string v0, "Track_MediaPlayerVoiceEng"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "PorcessFused() seq e = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {v10}, Ljava/io/IOException;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 524
    goto/16 :goto_a

    .line 507
    :catch_3
    move-exception v10

    .line 508
    const-string v0, "Track_MediaPlayerVoiceEng"

    const/4 v1, 0x2

    :try_start_4
    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "PorcessFused()"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {v10}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 511
    if-eqz v9, :cond_9

    .line 512
    :try_start_5
    invoke-virtual {v9}, Ljava/io/FileOutputStream;->close()V
    :try_end_5
    .catch Ljava/io/IOException; {:try_start_5 .. :try_end_5} :catch_4

    .line 516
    :cond_9
    goto :goto_7

    .line 514
    :catch_4
    move-exception v10

    .line 515
    const-string v0, "Track_MediaPlayerVoiceEng"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "PorcessFused() fos e = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {v10}, Ljava/io/IOException;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 518
    :goto_7
    if-eqz v8, :cond_a

    .line 519
    :try_start_6
    invoke-virtual {v8}, Ljava/io/SequenceInputStream;->close()V
    :try_end_6
    .catch Ljava/io/IOException; {:try_start_6 .. :try_end_6} :catch_5

    .line 523
    :cond_a
    goto :goto_a

    .line 521
    :catch_5
    move-exception v10

    .line 522
    const-string v0, "Track_MediaPlayerVoiceEng"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "PorcessFused() seq e = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {v10}, Ljava/io/IOException;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 524
    goto :goto_a

    .line 510
    :catchall_0
    move-exception v14

    .line 511
    if-eqz v9, :cond_b

    .line 512
    :try_start_7
    invoke-virtual {v9}, Ljava/io/FileOutputStream;->close()V
    :try_end_7
    .catch Ljava/io/IOException; {:try_start_7 .. :try_end_7} :catch_6

    .line 516
    :cond_b
    goto :goto_8

    .line 514
    :catch_6
    move-exception v15

    .line 515
    const-string v0, "Track_MediaPlayerVoiceEng"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "PorcessFused() fos e = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {v15}, Ljava/io/IOException;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 518
    :goto_8
    if-eqz v8, :cond_c

    .line 519
    :try_start_8
    invoke-virtual {v8}, Ljava/io/SequenceInputStream;->close()V
    :try_end_8
    .catch Ljava/io/IOException; {:try_start_8 .. :try_end_8} :catch_7

    .line 523
    :cond_c
    goto :goto_9

    .line 521
    :catch_7
    move-exception v15

    .line 522
    const-string v0, "Track_MediaPlayerVoiceEng"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "PorcessFused() seq e = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {v15}, Ljava/io/IOException;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 524
    :goto_9
    throw v14

    .line 526
    :goto_a
    return-void
.end method

.method private d(Ljava/lang/Runnable;)V
    .locals 4

    .line 376
    iget-object v0, p0, Lo/cec;->f:Landroid/os/Handler;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 378
    iget-object v0, p0, Lo/cec;->f:Landroid/os/Handler;

    invoke-virtual {v0, p1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    goto :goto_0

    .line 382
    :cond_0
    const-string v0, "Track_MediaPlayerVoiceEng"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "postRunnableToHandlerThread() mHandler is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 384
    :goto_0
    return-void
.end method

.method static synthetic d(Lo/cec;Ljava/lang/Object;)V
    .locals 0

    .line 42
    invoke-direct {p0, p1}, Lo/cec;->a(Ljava/lang/Object;)V

    return-void
.end method

.method static synthetic d(Lo/cec;Z)Z
    .locals 0

    .line 42
    iput-boolean p1, p0, Lo/cec;->d:Z

    return p1
.end method

.method static synthetic e(Lo/cec;)Landroid/media/MediaPlayer;
    .locals 1

    .line 42
    iget-object v0, p0, Lo/cec;->e:Landroid/media/MediaPlayer;

    return-object v0
.end method

.method private e(Ljava/lang/Object;J)V
    .locals 2

    .line 222
    iget-object v0, p0, Lo/cec;->g:Landroid/os/Handler;

    new-instance v1, Lo/cec$3;

    invoke-direct {v1, p0, p1}, Lo/cec$3;-><init>(Lo/cec;Ljava/lang/Object;)V

    invoke-virtual {v0, v1, p2, p3}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 231
    return-void
.end method

.method static synthetic e(Lo/cec;Ljava/lang/String;)V
    .locals 0

    .line 42
    invoke-direct {p0, p1}, Lo/cec;->a(Ljava/lang/String;)V

    return-void
.end method

.method private f()V
    .locals 4

    .line 344
    const-string v0, "Track_MediaPlayerVoiceEng"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "startHandlerThread() enter"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 345
    iget-object v0, p0, Lo/cec;->i:Landroid/os/HandlerThread;

    const/4 v1, 0x0

    if-ne v1, v0, :cond_0

    .line 347
    new-instance v0, Landroid/os/HandlerThread;

    const-string v1, "SoundVoiceHandlerThread"

    invoke-direct {v0, v1}, Landroid/os/HandlerThread;-><init>(Ljava/lang/String;)V

    iput-object v0, p0, Lo/cec;->i:Landroid/os/HandlerThread;

    .line 348
    iget-object v0, p0, Lo/cec;->i:Landroid/os/HandlerThread;

    invoke-virtual {v0}, Landroid/os/HandlerThread;->start()V

    .line 349
    new-instance v0, Lo/cec$e;

    iget-object v1, p0, Lo/cec;->i:Landroid/os/HandlerThread;

    invoke-virtual {v1}, Landroid/os/HandlerThread;->getLooper()Landroid/os/Looper;

    move-result-object v1

    invoke-direct {v0, v1, p0}, Lo/cec$e;-><init>(Landroid/os/Looper;Lo/cec;)V

    iput-object v0, p0, Lo/cec;->f:Landroid/os/Handler;

    .line 351
    :cond_0
    return-void
.end method

.method static synthetic g(Lo/cec;)I
    .locals 1

    .line 42
    invoke-direct {p0}, Lo/cec;->h()I

    move-result v0

    return v0
.end method

.method private g()V
    .locals 2

    .line 332
    iget-object v0, p0, Lo/cec;->g:Landroid/os/Handler;

    new-instance v1, Lo/cec$5;

    invoke-direct {v1, p0}, Lo/cec$5;-><init>(Lo/cec;)V

    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 340
    return-void
.end method

.method private h()I
    .locals 2

    .line 327
    sget-object v0, Lo/cec;->a:Landroid/media/AudioManager;

    iget-object v1, p0, Lo/cec;->m:Landroid/media/AudioManager$OnAudioFocusChangeListener;

    invoke-virtual {v0, v1}, Landroid/media/AudioManager;->abandonAudioFocus(Landroid/media/AudioManager$OnAudioFocusChangeListener;)I

    move-result v0

    return v0
.end method

.method static synthetic h(Lo/cec;)Landroid/media/MediaPlayer$OnCompletionListener;
    .locals 1

    .line 42
    iget-object v0, p0, Lo/cec;->h:Landroid/media/MediaPlayer$OnCompletionListener;

    return-object v0
.end method

.method private i()I
    .locals 4

    .line 317
    const/4 v3, 0x2

    .line 318
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x13

    if-lt v0, v1, :cond_0

    .line 320
    const/4 v3, 0x3

    .line 322
    :cond_0
    sget-object v0, Lo/cec;->a:Landroid/media/AudioManager;

    iget-object v1, p0, Lo/cec;->m:Landroid/media/AudioManager$OnAudioFocusChangeListener;

    const/4 v2, 0x3

    invoke-virtual {v0, v1, v2, v3}, Landroid/media/AudioManager;->requestAudioFocus(Landroid/media/AudioManager$OnAudioFocusChangeListener;II)I

    move-result v0

    return v0
.end method

.method private k()Z
    .locals 4

    .line 290
    iget-object v0, p0, Lo/cec;->c:Landroid/content/Context;

    invoke-static {v0}, Lo/cbu;->c(Landroid/content/Context;)Lo/cbu;

    move-result-object v0

    invoke-virtual {v0}, Lo/cbu;->S()Z

    move-result v0

    if-nez v0, :cond_0

    .line 292
    const-string v0, "Track_MediaPlayerVoiceEng"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "music"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const-string v2, " onPlaySpeak mSportManager.getVoiceEnable() is false!"

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 293
    const/4 v0, 0x0

    return v0

    .line 296
    :cond_0
    sget-object v0, Lo/cec;->a:Landroid/media/AudioManager;

    if-nez v0, :cond_1

    .line 298
    const-string v0, "Track_MediaPlayerVoiceEng"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "music"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const-string v2, " onPlaySpeak mAudioManager is null!"

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 299
    const/4 v0, 0x0

    return v0

    .line 302
    :cond_1
    iget-object v0, p0, Lo/cec;->c:Landroid/content/Context;

    invoke-static {v0}, Lo/cds;->d(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 304
    const-string v0, "Track_MediaPlayerVoiceEng"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "music"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const-string v2, " onPlaySpeak is Phoning !"

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 305
    const/4 v0, 0x1

    iput-boolean v0, p0, Lo/cec;->l:Z

    .line 306
    const/4 v0, 0x0

    return v0

    .line 308
    :cond_2
    const/4 v0, 0x0

    iput-boolean v0, p0, Lo/cec;->l:Z

    .line 311
    const/4 v0, 0x1

    return v0
.end method

.method private o()V
    .locals 4

    .line 355
    const-string v0, "Track_MediaPlayerVoiceEng"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "stopHandlerThread() enter"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 356
    iget-object v0, p0, Lo/cec;->f:Landroid/os/Handler;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 358
    iget-object v0, p0, Lo/cec;->f:Landroid/os/Handler;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeCallbacksAndMessages(Ljava/lang/Object;)V

    .line 359
    const/4 v0, 0x0

    iput-object v0, p0, Lo/cec;->f:Landroid/os/Handler;

    .line 362
    :cond_0
    iget-object v0, p0, Lo/cec;->i:Landroid/os/HandlerThread;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_1

    .line 364
    iget-object v0, p0, Lo/cec;->i:Landroid/os/HandlerThread;

    invoke-virtual {v0}, Landroid/os/HandlerThread;->quit()Z

    .line 365
    const/4 v0, 0x0

    iput-object v0, p0, Lo/cec;->i:Landroid/os/HandlerThread;

    .line 367
    :cond_1
    iget-object v0, p0, Lo/cec;->p:Landroid/os/Handler;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_2

    .line 368
    iget-object v0, p0, Lo/cec;->p:Landroid/os/Handler;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeCallbacksAndMessages(Ljava/lang/Object;)V

    .line 369
    const/4 v0, 0x0

    iput-object v0, p0, Lo/cec;->p:Landroid/os/Handler;

    .line 371
    :cond_2
    return-void
.end method


# virtual methods
.method public b(Landroid/media/MediaPlayer$OnCompletionListener;)V
    .locals 0

    .line 556
    iput-object p1, p0, Lo/cec;->h:Landroid/media/MediaPlayer$OnCompletionListener;

    .line 557
    return-void
.end method

.method public c()V
    .locals 4

    .line 190
    invoke-virtual {p0}, Lo/cec;->d()V

    .line 191
    invoke-direct {p0}, Lo/cec;->o()V

    .line 192
    const-string v0, "Track_MediaPlayerVoiceEng"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "destroy()"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 193
    return-void
.end method

.method public c(Landroid/media/MediaPlayer$OnCompletionListener;)V
    .locals 1

    .line 560
    const/4 v0, 0x0

    iput-object v0, p0, Lo/cec;->h:Landroid/media/MediaPlayer$OnCompletionListener;

    .line 562
    return-void
.end method

.method public c(Ljava/lang/Object;Z)V
    .locals 5

    .line 125
    instance-of v0, p1, Ljava/util/List;

    if-nez v0, :cond_0

    instance-of v0, p1, Ljava/lang/String;

    if-nez v0, :cond_0

    .line 126
    const-string v0, "Track_MediaPlayerVoiceEng"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "music"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const-string v2, " playVoice() content is not List<Integer>!"

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 127
    return-void

    .line 129
    :cond_0
    const/4 v4, 0x1

    .line 130
    instance-of v4, p1, Ljava/util/List;

    .line 133
    invoke-direct {p0}, Lo/cec;->k()Z

    move-result v0

    if-nez v0, :cond_1

    .line 134
    invoke-direct {p0}, Lo/cec;->b()V

    .line 135
    return-void

    .line 138
    :cond_1
    invoke-direct {p0}, Lo/cec;->a()V

    .line 141
    iget-boolean v0, p0, Lo/cec;->d:Z

    if-nez v0, :cond_3

    .line 142
    const-string v0, "Track_MediaPlayerVoiceEng"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "music"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const-string v2, " onPlaySpeak() isFinishedLoad is false!"

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 143
    if-eqz v4, :cond_2

    .line 145
    const-wide/16 v0, 0x3e8

    invoke-direct {p0, p1, v0, v1}, Lo/cec;->e(Ljava/lang/Object;J)V

    goto :goto_0

    .line 147
    :cond_2
    move-object v0, p1

    check-cast v0, Ljava/lang/String;

    invoke-direct {p0, v0}, Lo/cec;->b(Ljava/lang/String;)V

    goto :goto_0

    .line 150
    :cond_3
    if-eqz p2, :cond_5

    .line 151
    if-eqz v4, :cond_4

    .line 153
    const-wide/16 v0, 0xc8

    invoke-direct {p0, p1, v0, v1}, Lo/cec;->e(Ljava/lang/Object;J)V

    goto :goto_0

    .line 155
    :cond_4
    move-object v0, p1

    check-cast v0, Ljava/lang/String;

    invoke-direct {p0, v0}, Lo/cec;->b(Ljava/lang/String;)V

    goto :goto_0

    .line 159
    :cond_5
    if-eqz v4, :cond_6

    .line 161
    invoke-direct {p0, p1}, Lo/cec;->a(Ljava/lang/Object;)V

    goto :goto_0

    .line 163
    :cond_6
    move-object v0, p1

    check-cast v0, Ljava/lang/String;

    invoke-direct {p0, v0}, Lo/cec;->b(Ljava/lang/String;)V

    .line 167
    :goto_0
    return-void
.end method

.method public d()V
    .locals 3

    .line 113
    iget-object v0, p0, Lo/cec;->p:Landroid/os/Handler;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 114
    iget-object v0, p0, Lo/cec;->p:Landroid/os/Handler;

    invoke-virtual {v0}, Landroid/os/Handler;->obtainMessage()Landroid/os/Message;

    move-result-object v2

    .line 115
    const/16 v0, 0x66

    iput v0, v2, Landroid/os/Message;->what:I

    .line 116
    iget-object v0, p0, Lo/cec;->p:Landroid/os/Handler;

    invoke-virtual {v0, v2}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    .line 119
    :cond_0
    return-void
.end method

.method public e()V
    .locals 5

    .line 96
    const-string v0, "Track_MediaPlayerVoiceEng"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "stopVoice"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 97
    iget-object v0, p0, Lo/cec;->e:Landroid/media/MediaPlayer;

    if-eqz v0, :cond_0

    .line 99
    const-string v0, "Track_MediaPlayerVoiceEng"

    const/4 v1, 0x1

    :try_start_0
    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "stopVoice() stop and release mediaplayer"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 100
    iget-object v0, p0, Lo/cec;->e:Landroid/media/MediaPlayer;

    invoke-virtual {v0}, Landroid/media/MediaPlayer;->stop()V

    .line 101
    iget-object v0, p0, Lo/cec;->e:Landroid/media/MediaPlayer;

    invoke-virtual {v0}, Landroid/media/MediaPlayer;->release()V

    .line 102
    const/4 v0, 0x0

    iput-object v0, p0, Lo/cec;->e:Landroid/media/MediaPlayer;
    :try_end_0
    .catch Ljava/lang/IllegalStateException; {:try_start_0 .. :try_end_0} :catch_0

    .line 105
    goto :goto_0

    .line 103
    :catch_0
    move-exception v4

    .line 104
    const-string v0, "Track_MediaPlayerVoiceEng"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "IllegalStateException during onDestroy"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 107
    :cond_0
    :goto_0
    invoke-direct {p0}, Lo/cec;->a()V

    .line 108
    return-void
.end method
