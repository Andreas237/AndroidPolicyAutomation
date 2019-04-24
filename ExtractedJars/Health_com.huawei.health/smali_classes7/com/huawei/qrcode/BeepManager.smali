.class final Lcom/huawei/qrcode/BeepManager;
.super Ljava/lang/Object;


# static fields
.field private static final BEEP_VOLUME:F = 0.1f

.field private static final TAG:Ljava/lang/String;

.field private static final VIBRATE_DURATION:J = 0xc8L


# instance fields
.field private final activity:Landroid/app/Activity;

.field private mediaPlayer:Landroid/media/MediaPlayer;

.field private playBeep:Z

.field private vibrate:Z


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const-class v0, Lcom/huawei/qrcode/BeepManager;

    invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lcom/huawei/qrcode/BeepManager;->TAG:Ljava/lang/String;

    return-void
.end method

.method constructor <init>(Landroid/app/Activity;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/huawei/qrcode/BeepManager;->activity:Landroid/app/Activity;

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/qrcode/BeepManager;->mediaPlayer:Landroid/media/MediaPlayer;

    invoke-virtual {p0}, Lcom/huawei/qrcode/BeepManager;->updatePrefs()V

    return-void
.end method

.method private static buildMediaPlayer(Landroid/content/Context;)Landroid/media/MediaPlayer;
    .locals 11

    new-instance v6, Landroid/media/MediaPlayer;

    invoke-direct {v6}, Landroid/media/MediaPlayer;-><init>()V

    const/4 v0, 0x3

    invoke-virtual {v6, v0}, Landroid/media/MediaPlayer;->setAudioStreamType(I)V

    new-instance v0, Lcom/huawei/qrcode/BeepManager$1;

    invoke-direct {v0}, Lcom/huawei/qrcode/BeepManager$1;-><init>()V

    invoke-virtual {v6, v0}, Landroid/media/MediaPlayer;->setOnCompletionListener(Landroid/media/MediaPlayer$OnCompletionListener;)V

    invoke-virtual {p0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    const-string v1, "scanqrcode_sdk_beep"

    invoke-static {p0, v1}, Lcom/huawei/qrcode/util/ResourceUtil;->getRawId(Landroid/content/Context;Ljava/lang/String;)I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->openRawResourceFd(I)Landroid/content/res/AssetFileDescriptor;

    move-result-object v7

    move-object v0, v6

    :try_start_0
    invoke-virtual {v7}, Landroid/content/res/AssetFileDescriptor;->getFileDescriptor()Ljava/io/FileDescriptor;

    move-result-object v1

    invoke-virtual {v7}, Landroid/content/res/AssetFileDescriptor;->getStartOffset()J

    move-result-wide v2

    invoke-virtual {v7}, Landroid/content/res/AssetFileDescriptor;->getLength()J

    move-result-wide v4

    invoke-virtual/range {v0 .. v5}, Landroid/media/MediaPlayer;->setDataSource(Ljava/io/FileDescriptor;JJ)V

    invoke-virtual {v7}, Landroid/content/res/AssetFileDescriptor;->close()V

    const v0, 0x3dcccccd    # 0.1f

    const v1, 0x3dcccccd    # 0.1f

    invoke-virtual {v6, v0, v1}, Landroid/media/MediaPlayer;->setVolume(FF)V

    invoke-virtual {v6}, Landroid/media/MediaPlayer;->prepare()V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_1
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz v7, :cond_1

    :try_start_1
    invoke-virtual {v7}, Landroid/content/res/AssetFileDescriptor;->close()V
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_0

    goto :goto_1

    :catch_0
    move-exception v8

    sget-object v0, Lcom/huawei/qrcode/BeepManager;->TAG:Ljava/lang/String;

    invoke-static {v0, v8}, Lcom/huawei/qrcode/util/LogX;->e(Ljava/lang/String;Ljava/lang/Throwable;)V

    goto :goto_1

    :catch_1
    move-exception v8

    :try_start_2
    sget-object v0, Lcom/huawei/qrcode/BeepManager;->TAG:Ljava/lang/String;

    invoke-static {v0, v8}, Lcom/huawei/qrcode/util/LogX;->e(Ljava/lang/String;Ljava/lang/Throwable;)V

    invoke-virtual {v6}, Landroid/media/MediaPlayer;->release()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    const/4 v6, 0x0

    if-eqz v7, :cond_1

    :try_start_3
    invoke-virtual {v7}, Landroid/content/res/AssetFileDescriptor;->close()V
    :try_end_3
    .catch Ljava/io/IOException; {:try_start_3 .. :try_end_3} :catch_2

    goto :goto_1

    :catch_2
    move-exception v8

    sget-object v0, Lcom/huawei/qrcode/BeepManager;->TAG:Ljava/lang/String;

    invoke-static {v0, v8}, Lcom/huawei/qrcode/util/LogX;->e(Ljava/lang/String;Ljava/lang/Throwable;)V

    goto :goto_1

    :catchall_0
    move-exception v9

    if-eqz v7, :cond_0

    :try_start_4
    invoke-virtual {v7}, Landroid/content/res/AssetFileDescriptor;->close()V
    :try_end_4
    .catch Ljava/io/IOException; {:try_start_4 .. :try_end_4} :catch_3

    goto :goto_0

    :catch_3
    move-exception v10

    sget-object v0, Lcom/huawei/qrcode/BeepManager;->TAG:Ljava/lang/String;

    invoke-static {v0, v10}, Lcom/huawei/qrcode/util/LogX;->e(Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_0
    :goto_0
    throw v9

    :cond_1
    :goto_1
    return-object v6
.end method

.method private static shouldBeep(Landroid/content/SharedPreferences;Landroid/content/Context;)Z
    .locals 4

    const-string v0, "preferences_play_beep"

    const/4 v1, 0x1

    invoke-interface {p0, v0, v1}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    move-result v2

    if-eqz v2, :cond_0

    const-string v0, "audio"

    invoke-virtual {p1, v0}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    move-object v3, v0

    check-cast v3, Landroid/media/AudioManager;

    invoke-virtual {v3}, Landroid/media/AudioManager;->getRingerMode()I

    move-result v0

    const/4 v1, 0x2

    if-eq v0, v1, :cond_0

    const/4 v2, 0x0

    :cond_0
    return v2
.end method


# virtual methods
.method public playBeepSoundAndVibrate()V
    .locals 3

    iget-boolean v0, p0, Lcom/huawei/qrcode/BeepManager;->playBeep:Z

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/huawei/qrcode/BeepManager;->mediaPlayer:Landroid/media/MediaPlayer;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/huawei/qrcode/BeepManager;->mediaPlayer:Landroid/media/MediaPlayer;

    invoke-virtual {v0}, Landroid/media/MediaPlayer;->start()V

    :cond_0
    iget-boolean v0, p0, Lcom/huawei/qrcode/BeepManager;->vibrate:Z

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/huawei/qrcode/BeepManager;->activity:Landroid/app/Activity;

    const-string v1, "vibrator"

    invoke-virtual {v0, v1}, Landroid/app/Activity;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Landroid/os/Vibrator;

    const-wide/16 v0, 0xc8

    invoke-virtual {v2, v0, v1}, Landroid/os/Vibrator;->vibrate(J)V

    :cond_1
    return-void
.end method

.method public release()V
    .locals 1

    iget-object v0, p0, Lcom/huawei/qrcode/BeepManager;->mediaPlayer:Landroid/media/MediaPlayer;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/huawei/qrcode/BeepManager;->mediaPlayer:Landroid/media/MediaPlayer;

    invoke-virtual {v0}, Landroid/media/MediaPlayer;->release()V

    :cond_0
    return-void
.end method

.method updatePrefs()V
    .locals 3

    iget-object v0, p0, Lcom/huawei/qrcode/BeepManager;->activity:Landroid/app/Activity;

    invoke-static {v0}, Landroid/preference/PreferenceManager;->getDefaultSharedPreferences(Landroid/content/Context;)Landroid/content/SharedPreferences;

    move-result-object v2

    iget-object v0, p0, Lcom/huawei/qrcode/BeepManager;->activity:Landroid/app/Activity;

    invoke-static {v2, v0}, Lcom/huawei/qrcode/BeepManager;->shouldBeep(Landroid/content/SharedPreferences;Landroid/content/Context;)Z

    move-result v0

    iput-boolean v0, p0, Lcom/huawei/qrcode/BeepManager;->playBeep:Z

    const-string v0, "preferences_vibrate"

    const/4 v1, 0x0

    invoke-interface {v2, v0, v1}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    move-result v0

    iput-boolean v0, p0, Lcom/huawei/qrcode/BeepManager;->vibrate:Z

    iget-boolean v0, p0, Lcom/huawei/qrcode/BeepManager;->playBeep:Z

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/huawei/qrcode/BeepManager;->mediaPlayer:Landroid/media/MediaPlayer;

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/huawei/qrcode/BeepManager;->activity:Landroid/app/Activity;

    const/4 v1, 0x3

    invoke-virtual {v0, v1}, Landroid/app/Activity;->setVolumeControlStream(I)V

    iget-object v0, p0, Lcom/huawei/qrcode/BeepManager;->activity:Landroid/app/Activity;

    invoke-static {v0}, Lcom/huawei/qrcode/BeepManager;->buildMediaPlayer(Landroid/content/Context;)Landroid/media/MediaPlayer;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/qrcode/BeepManager;->mediaPlayer:Landroid/media/MediaPlayer;

    :cond_0
    return-void
.end method
