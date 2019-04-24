.class public Lcom/scandit/barcodepicker/internal/gui/ScanFeedback;
.super Ljava/lang/Object;
.source "ScanFeedback.java"


# instance fields
.field private final mAudioManager:Landroid/media/AudioManager;

.field private mBeepEnabled:Z

.field private mBeepId:I

.field private mSoundPool:Landroid/media/SoundPool;

.field private mTrackingBeepId:I

.field private mVibrateEnabled:Z

.field private mVibratePermission:I

.field private mVibrateTime:J

.field private mVibrator:Landroid/os/Vibrator;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 3

    .line 39
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x1

    .line 24
    iput-boolean v0, p0, Lcom/scandit/barcodepicker/internal/gui/ScanFeedback;->mBeepEnabled:Z

    .line 25
    iput-boolean v0, p0, Lcom/scandit/barcodepicker/internal/gui/ScanFeedback;->mVibrateEnabled:Z

    const/4 v0, 0x0

    .line 28
    iput-object v0, p0, Lcom/scandit/barcodepicker/internal/gui/ScanFeedback;->mSoundPool:Landroid/media/SoundPool;

    .line 29
    iput-object v0, p0, Lcom/scandit/barcodepicker/internal/gui/ScanFeedback;->mVibrator:Landroid/os/Vibrator;

    const/4 v0, 0x0

    .line 30
    iput v0, p0, Lcom/scandit/barcodepicker/internal/gui/ScanFeedback;->mVibratePermission:I

    .line 31
    iput v0, p0, Lcom/scandit/barcodepicker/internal/gui/ScanFeedback;->mBeepId:I

    .line 32
    iput v0, p0, Lcom/scandit/barcodepicker/internal/gui/ScanFeedback;->mTrackingBeepId:I

    const-wide/16 v0, 0x12c

    .line 35
    iput-wide v0, p0, Lcom/scandit/barcodepicker/internal/gui/ScanFeedback;->mVibrateTime:J

    const-string v0, "audio"

    .line 40
    invoke-virtual {p1, v0}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/media/AudioManager;

    iput-object v0, p0, Lcom/scandit/barcodepicker/internal/gui/ScanFeedback;->mAudioManager:Landroid/media/AudioManager;

    .line 42
    invoke-virtual {p1}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v0

    const-string v1, "android.permission.VIBRATE"

    .line 43
    invoke-virtual {p1}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v2

    .line 42
    invoke-virtual {v0, v1, v2}, Landroid/content/pm/PackageManager;->checkPermission(Ljava/lang/String;Ljava/lang/String;)I

    move-result v0

    iput v0, p0, Lcom/scandit/barcodepicker/internal/gui/ScanFeedback;->mVibratePermission:I

    const-string/jumbo v0, "vibrator"

    .line 44
    invoke-virtual {p1, v0}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/os/Vibrator;

    iput-object v0, p0, Lcom/scandit/barcodepicker/internal/gui/ScanFeedback;->mVibrator:Landroid/os/Vibrator;

    .line 45
    invoke-virtual {p0, p1}, Lcom/scandit/barcodepicker/internal/gui/ScanFeedback;->ensureBeepResourcesLoaded(Landroid/content/Context;)V

    return-void
.end method

.method private beep()V
    .locals 9

    .line 142
    iget-object v0, p0, Lcom/scandit/barcodepicker/internal/gui/ScanFeedback;->mSoundPool:Landroid/media/SoundPool;

    if-eqz v0, :cond_0

    iget v0, p0, Lcom/scandit/barcodepicker/internal/gui/ScanFeedback;->mBeepId:I

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/scandit/barcodepicker/internal/gui/ScanFeedback;->mAudioManager:Landroid/media/AudioManager;

    .line 143
    invoke-virtual {v0}, Landroid/media/AudioManager;->getRingerMode()I

    move-result v0

    const/4 v1, 0x2

    if-ne v0, v1, :cond_0

    .line 144
    iget-object v2, p0, Lcom/scandit/barcodepicker/internal/gui/ScanFeedback;->mSoundPool:Landroid/media/SoundPool;

    iget v3, p0, Lcom/scandit/barcodepicker/internal/gui/ScanFeedback;->mBeepId:I

    const/high16 v4, 0x3f800000    # 1.0f

    const/high16 v5, 0x3f800000    # 1.0f

    const/4 v6, 0x1

    const/4 v7, 0x0

    const/high16 v8, 0x3f800000    # 1.0f

    invoke-virtual/range {v2 .. v8}, Landroid/media/SoundPool;->play(IFFIIF)I

    :cond_0
    return-void
.end method

.method private createSoundPoolPostLollipop()Landroid/media/SoundPool;
    .locals 2
    .annotation build Landroid/annotation/TargetApi;
        value = 0x15
    .end annotation

    .line 87
    new-instance v0, Landroid/media/AudioAttributes$Builder;

    invoke-direct {v0}, Landroid/media/AudioAttributes$Builder;-><init>()V

    const/16 v1, 0xe

    .line 88
    invoke-virtual {v0, v1}, Landroid/media/AudioAttributes$Builder;->setUsage(I)Landroid/media/AudioAttributes$Builder;

    move-result-object v0

    const/4 v1, 0x4

    .line 89
    invoke-virtual {v0, v1}, Landroid/media/AudioAttributes$Builder;->setContentType(I)Landroid/media/AudioAttributes$Builder;

    move-result-object v0

    .line 90
    invoke-virtual {v0}, Landroid/media/AudioAttributes$Builder;->build()Landroid/media/AudioAttributes;

    move-result-object v0

    .line 92
    new-instance v1, Landroid/media/SoundPool$Builder;

    invoke-direct {v1}, Landroid/media/SoundPool$Builder;-><init>()V

    invoke-virtual {v1, v0}, Landroid/media/SoundPool$Builder;->setAudioAttributes(Landroid/media/AudioAttributes;)Landroid/media/SoundPool$Builder;

    move-result-object v0

    const/4 v1, 0x2

    invoke-virtual {v0, v1}, Landroid/media/SoundPool$Builder;->setMaxStreams(I)Landroid/media/SoundPool$Builder;

    move-result-object v0

    invoke-virtual {v0}, Landroid/media/SoundPool$Builder;->build()Landroid/media/SoundPool;

    move-result-object v0

    return-object v0
.end method

.method private createSoundPoolPreLollipop()Landroid/media/SoundPool;
    .locals 3

    .line 82
    new-instance v0, Landroid/media/SoundPool;

    const/4 v1, 0x2

    const/4 v2, 0x0

    invoke-direct {v0, v1, v1, v2}, Landroid/media/SoundPool;-><init>(III)V

    return-object v0
.end method

.method private loadSoundResource(Landroid/content/Context;Ljava/lang/String;)I
    .locals 2

    .line 61
    iget-object v0, p0, Lcom/scandit/barcodepicker/internal/gui/ScanFeedback;->mSoundPool:Landroid/media/SoundPool;

    if-nez v0, :cond_1

    .line 62
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x15

    if-lt v0, v1, :cond_0

    .line 63
    invoke-direct {p0}, Lcom/scandit/barcodepicker/internal/gui/ScanFeedback;->createSoundPoolPostLollipop()Landroid/media/SoundPool;

    move-result-object v0

    iput-object v0, p0, Lcom/scandit/barcodepicker/internal/gui/ScanFeedback;->mSoundPool:Landroid/media/SoundPool;

    goto :goto_0

    .line 65
    :cond_0
    invoke-direct {p0}, Lcom/scandit/barcodepicker/internal/gui/ScanFeedback;->createSoundPoolPreLollipop()Landroid/media/SoundPool;

    move-result-object v0

    iput-object v0, p0, Lcom/scandit/barcodepicker/internal/gui/ScanFeedback;->mSoundPool:Landroid/media/SoundPool;

    :cond_1
    :goto_0
    const-string v0, "raw"

    .line 69
    invoke-static {p1, p2, v0}, Lcom/scandit/base/system/SbResourceUtils;->getResIdentifier(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)I

    move-result p2

    if-eqz p2, :cond_2

    .line 72
    :try_start_0
    iget-object v0, p0, Lcom/scandit/barcodepicker/internal/gui/ScanFeedback;->mSoundPool:Landroid/media/SoundPool;

    const/4 v1, 0x1

    invoke-virtual {v0, p1, p2, v1}, Landroid/media/SoundPool;->load(Landroid/content/Context;II)I

    move-result p1
    :try_end_0
    .catch Landroid/content/res/Resources$NotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    return p1

    :catch_0
    move-exception p1

    .line 74
    invoke-virtual {p1}, Landroid/content/res/Resources$NotFoundException;->printStackTrace()V

    :cond_2
    const/4 p1, 0x0

    return p1
.end method

.method private trackingBeep()V
    .locals 9

    .line 149
    iget-object v0, p0, Lcom/scandit/barcodepicker/internal/gui/ScanFeedback;->mSoundPool:Landroid/media/SoundPool;

    if-eqz v0, :cond_0

    iget v0, p0, Lcom/scandit/barcodepicker/internal/gui/ScanFeedback;->mTrackingBeepId:I

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/scandit/barcodepicker/internal/gui/ScanFeedback;->mAudioManager:Landroid/media/AudioManager;

    .line 150
    invoke-virtual {v0}, Landroid/media/AudioManager;->getRingerMode()I

    move-result v0

    const/4 v1, 0x2

    if-ne v0, v1, :cond_0

    .line 151
    iget-object v2, p0, Lcom/scandit/barcodepicker/internal/gui/ScanFeedback;->mSoundPool:Landroid/media/SoundPool;

    iget v3, p0, Lcom/scandit/barcodepicker/internal/gui/ScanFeedback;->mTrackingBeepId:I

    const/high16 v4, 0x3f800000    # 1.0f

    const/high16 v5, 0x3f800000    # 1.0f

    const/4 v6, 0x1

    const/4 v7, 0x0

    const/high16 v8, 0x3f800000    # 1.0f

    invoke-virtual/range {v2 .. v8}, Landroid/media/SoundPool;->play(IFFIIF)I

    :cond_0
    return-void
.end method

.method private vibrate()V
    .locals 3

    .line 156
    iget-object v0, p0, Lcom/scandit/barcodepicker/internal/gui/ScanFeedback;->mVibrator:Landroid/os/Vibrator;

    if-eqz v0, :cond_0

    iget v0, p0, Lcom/scandit/barcodepicker/internal/gui/ScanFeedback;->mVibratePermission:I

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/scandit/barcodepicker/internal/gui/ScanFeedback;->mAudioManager:Landroid/media/AudioManager;

    .line 158
    invoke-virtual {v0}, Landroid/media/AudioManager;->getRingerMode()I

    move-result v0

    if-eqz v0, :cond_0

    .line 159
    iget-object v0, p0, Lcom/scandit/barcodepicker/internal/gui/ScanFeedback;->mVibrator:Landroid/os/Vibrator;

    iget-wide v1, p0, Lcom/scandit/barcodepicker/internal/gui/ScanFeedback;->mVibrateTime:J

    invoke-virtual {v0, v1, v2}, Landroid/os/Vibrator;->vibrate(J)V

    :cond_0
    return-void
.end method


# virtual methods
.method public ensureBeepResourcesLoaded(Landroid/content/Context;)V
    .locals 1

    if-nez p1, :cond_0

    return-void

    .line 52
    :cond_0
    iget v0, p0, Lcom/scandit/barcodepicker/internal/gui/ScanFeedback;->mBeepId:I

    if-nez v0, :cond_1

    const-string v0, "beep"

    .line 53
    invoke-direct {p0, p1, v0}, Lcom/scandit/barcodepicker/internal/gui/ScanFeedback;->loadSoundResource(Landroid/content/Context;Ljava/lang/String;)I

    move-result v0

    iput v0, p0, Lcom/scandit/barcodepicker/internal/gui/ScanFeedback;->mBeepId:I

    .line 55
    :cond_1
    iget v0, p0, Lcom/scandit/barcodepicker/internal/gui/ScanFeedback;->mTrackingBeepId:I

    if-nez v0, :cond_2

    const-string/jumbo v0, "tracking_beep"

    .line 56
    invoke-direct {p0, p1, v0}, Lcom/scandit/barcodepicker/internal/gui/ScanFeedback;->loadSoundResource(Landroid/content/Context;Ljava/lang/String;)I

    move-result p1

    iput p1, p0, Lcom/scandit/barcodepicker/internal/gui/ScanFeedback;->mTrackingBeepId:I

    :cond_2
    return-void
.end method

.method public freeResources()V
    .locals 1

    const/4 v0, 0x0

    .line 169
    iput v0, p0, Lcom/scandit/barcodepicker/internal/gui/ScanFeedback;->mBeepId:I

    .line 170
    iput v0, p0, Lcom/scandit/barcodepicker/internal/gui/ScanFeedback;->mTrackingBeepId:I

    .line 172
    iget-object v0, p0, Lcom/scandit/barcodepicker/internal/gui/ScanFeedback;->mSoundPool:Landroid/media/SoundPool;

    if-eqz v0, :cond_0

    .line 173
    invoke-virtual {v0}, Landroid/media/SoundPool;->release()V

    const/4 v0, 0x0

    .line 174
    iput-object v0, p0, Lcom/scandit/barcodepicker/internal/gui/ScanFeedback;->mSoundPool:Landroid/media/SoundPool;

    :cond_0
    return-void
.end method

.method public handleNewTrack()V
    .locals 1

    .line 133
    iget-boolean v0, p0, Lcom/scandit/barcodepicker/internal/gui/ScanFeedback;->mVibrateEnabled:Z

    if-eqz v0, :cond_0

    .line 134
    invoke-direct {p0}, Lcom/scandit/barcodepicker/internal/gui/ScanFeedback;->vibrate()V

    .line 136
    :cond_0
    iget-boolean v0, p0, Lcom/scandit/barcodepicker/internal/gui/ScanFeedback;->mBeepEnabled:Z

    if-eqz v0, :cond_1

    .line 137
    invoke-direct {p0}, Lcom/scandit/barcodepicker/internal/gui/ScanFeedback;->trackingBeep()V

    :cond_1
    return-void
.end method

.method public handleSuccessfulScan()V
    .locals 1

    .line 124
    iget-boolean v0, p0, Lcom/scandit/barcodepicker/internal/gui/ScanFeedback;->mVibrateEnabled:Z

    if-eqz v0, :cond_0

    .line 125
    invoke-direct {p0}, Lcom/scandit/barcodepicker/internal/gui/ScanFeedback;->vibrate()V

    .line 127
    :cond_0
    iget-boolean v0, p0, Lcom/scandit/barcodepicker/internal/gui/ScanFeedback;->mBeepEnabled:Z

    if-eqz v0, :cond_1

    .line 128
    invoke-direct {p0}, Lcom/scandit/barcodepicker/internal/gui/ScanFeedback;->beep()V

    :cond_1
    return-void
.end method

.method public isBeepEnabled()Z
    .locals 1

    .line 99
    iget-boolean v0, p0, Lcom/scandit/barcodepicker/internal/gui/ScanFeedback;->mBeepEnabled:Z

    return v0
.end method

.method public isVibrateEnabled()Z
    .locals 1

    .line 105
    iget-boolean v0, p0, Lcom/scandit/barcodepicker/internal/gui/ScanFeedback;->mVibrateEnabled:Z

    return v0
.end method

.method public setBeepEnabled(Z)V
    .locals 0

    .line 96
    iput-boolean p1, p0, Lcom/scandit/barcodepicker/internal/gui/ScanFeedback;->mBeepEnabled:Z

    return-void
.end method

.method public setVibrateEnabled(Z)V
    .locals 0

    .line 102
    iput-boolean p1, p0, Lcom/scandit/barcodepicker/internal/gui/ScanFeedback;->mVibrateEnabled:Z

    return-void
.end method
