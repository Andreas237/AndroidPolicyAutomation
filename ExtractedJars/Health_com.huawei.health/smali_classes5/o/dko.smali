.class public Lo/dko;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static c:Lo/dko;

.field private static final h:Ljava/lang/Object;


# instance fields
.field private a:Landroid/media/AudioManager;

.field private b:Landroid/media/MediaPlayer;

.field private d:Landroid/content/Context;

.field private e:I

.field private f:I

.field private i:Landroid/os/Handler;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 24
    const/4 v0, 0x0

    sput-object v0, Lo/dko;->c:Lo/dko;

    .line 56
    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lo/dko;->h:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    .line 44
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 38
    const/4 v0, 0x0

    iput-object v0, p0, Lo/dko;->b:Landroid/media/MediaPlayer;

    .line 39
    const/4 v0, 0x0

    iput-object v0, p0, Lo/dko;->a:Landroid/media/AudioManager;

    .line 40
    const/4 v0, 0x0

    iput v0, p0, Lo/dko;->e:I

    .line 41
    const/4 v0, 0x0

    iput v0, p0, Lo/dko;->f:I

    .line 66
    new-instance v0, Lo/dko$3;

    invoke-direct {v0, p0}, Lo/dko$3;-><init>(Lo/dko;)V

    iput-object v0, p0, Lo/dko;->i:Landroid/os/Handler;

    .line 45
    iput-object p1, p0, Lo/dko;->d:Landroid/content/Context;

    .line 46
    return-void
.end method

.method public static b(Landroid/content/Context;)Lo/dko;
    .locals 4

    .line 58
    sget-object v2, Lo/dko;->h:Ljava/lang/Object;

    monitor-enter v2

    .line 59
    :try_start_0
    sget-object v0, Lo/dko;->c:Lo/dko;

    const/4 v1, 0x0

    if-ne v1, v0, :cond_0

    .line 60
    new-instance v0, Lo/dko;

    invoke-direct {v0, p0}, Lo/dko;-><init>(Landroid/content/Context;)V

    sput-object v0, Lo/dko;->c:Lo/dko;

    .line 62
    :cond_0
    sget-object v0, Lo/dko;->c:Lo/dko;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v2

    return-object v0

    .line 63
    :catchall_0
    move-exception v3

    monitor-exit v2

    throw v3
.end method

.method private b()V
    .locals 5

    .line 145
    const-string v0, "HWFindPhoneMgr"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "startPlayRing()"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 146
    iget-object v0, p0, Lo/dko;->a:Landroid/media/AudioManager;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 147
    iget-object v0, p0, Lo/dko;->a:Landroid/media/AudioManager;

    const/4 v1, 0x0

    const/4 v2, 0x3

    const/4 v3, 0x2

    invoke-virtual {v0, v1, v2, v3}, Landroid/media/AudioManager;->requestAudioFocus(Landroid/media/AudioManager$OnAudioFocusChangeListener;II)I

    .line 148
    iget-object v0, p0, Lo/dko;->a:Landroid/media/AudioManager;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/media/AudioManager;->setSpeakerphoneOn(Z)V

    .line 149
    iget-object v0, p0, Lo/dko;->a:Landroid/media/AudioManager;

    const/4 v1, 0x3

    invoke-virtual {v0, v1}, Landroid/media/AudioManager;->setMode(I)V

    .line 151
    :cond_0
    iget-object v0, p0, Lo/dko;->b:Landroid/media/MediaPlayer;

    const/4 v1, 0x0

    if-ne v1, v0, :cond_2

    .line 152
    invoke-static {}, Ljava/util/Locale;->getDefault()Ljava/util/Locale;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/Locale;->getLanguage()Ljava/lang/String;

    move-result-object v4

    .line 153
    const-string v0, "zh"

    invoke-virtual {v4, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 154
    iget-object v0, p0, Lo/dko;->d:Landroid/content/Context;

    sget v1, Lcom/huawei/hwdevicemgr/R$raw;->ring_vivid:I

    invoke-static {v0, v1}, Landroid/media/MediaPlayer;->create(Landroid/content/Context;I)Landroid/media/MediaPlayer;

    move-result-object v0

    iput-object v0, p0, Lo/dko;->b:Landroid/media/MediaPlayer;

    goto :goto_0

    .line 156
    :cond_1
    iget-object v0, p0, Lo/dko;->d:Landroid/content/Context;

    sget v1, Lcom/huawei/hwdevicemgr/R$raw;->ring_vivid_en:I

    invoke-static {v0, v1}, Landroid/media/MediaPlayer;->create(Landroid/content/Context;I)Landroid/media/MediaPlayer;

    move-result-object v0

    iput-object v0, p0, Lo/dko;->b:Landroid/media/MediaPlayer;

    .line 160
    :cond_2
    :goto_0
    iget-object v0, p0, Lo/dko;->b:Landroid/media/MediaPlayer;

    invoke-virtual {v0}, Landroid/media/MediaPlayer;->isPlaying()Z

    move-result v0

    if-eqz v0, :cond_3

    .line 161
    const-string v0, "HWFindPhoneMgr"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "startPlayRing() isPlaying"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 162
    return-void

    .line 165
    :cond_3
    iget-object v0, p0, Lo/dko;->b:Landroid/media/MediaPlayer;

    const/4 v1, 0x3

    invoke-virtual {v0, v1}, Landroid/media/MediaPlayer;->setAudioStreamType(I)V

    .line 166
    iget-object v0, p0, Lo/dko;->b:Landroid/media/MediaPlayer;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/media/MediaPlayer;->setLooping(Z)V

    .line 169
    iget v0, p0, Lo/dko;->e:I

    invoke-direct {p0, v0}, Lo/dko;->b(I)V

    .line 170
    iget-object v0, p0, Lo/dko;->b:Landroid/media/MediaPlayer;

    invoke-virtual {v0}, Landroid/media/MediaPlayer;->start()V

    .line 171
    return-void
.end method

.method private b(I)V
    .locals 4

    .line 193
    const-string v0, "HWFindPhoneMgr"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "===www===setRingVolume"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 194
    iget-object v0, p0, Lo/dko;->a:Landroid/media/AudioManager;

    if-eqz v0, :cond_0

    .line 199
    iget-object v0, p0, Lo/dko;->a:Landroid/media/AudioManager;

    const/4 v1, 0x3

    const/4 v2, 0x0

    invoke-virtual {v0, v1, p1, v2}, Landroid/media/AudioManager;->setStreamVolume(III)V

    .line 201
    :cond_0
    return-void
.end method

.method private c()V
    .locals 5

    .line 174
    const-string v0, "HWFindPhoneMgr"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "stopPlayRing()"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 177
    :try_start_0
    iget-object v0, p0, Lo/dko;->b:Landroid/media/MediaPlayer;

    if-eqz v0, :cond_0

    .line 178
    const-string v0, "HWFindPhoneMgr"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "===www==stopPlayRing()  mMediaPlayer"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 179
    iget-object v0, p0, Lo/dko;->b:Landroid/media/MediaPlayer;

    invoke-virtual {v0}, Landroid/media/MediaPlayer;->stop()V

    .line 180
    iget-object v0, p0, Lo/dko;->b:Landroid/media/MediaPlayer;

    invoke-virtual {v0}, Landroid/media/MediaPlayer;->reset()V

    .line 181
    iget-object v0, p0, Lo/dko;->b:Landroid/media/MediaPlayer;

    invoke-virtual {v0}, Landroid/media/MediaPlayer;->release()V

    .line 182
    const/4 v0, 0x0

    iput-object v0, p0, Lo/dko;->b:Landroid/media/MediaPlayer;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 186
    :cond_0
    goto :goto_0

    .line 184
    :catch_0
    move-exception v4

    .line 185
    const-string v0, "stopPlayRing"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    invoke-virtual {v4}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 187
    :goto_0
    iget-object v0, p0, Lo/dko;->a:Landroid/media/AudioManager;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/media/AudioManager;->setMode(I)V

    .line 189
    iget v0, p0, Lo/dko;->f:I

    invoke-direct {p0, v0}, Lo/dko;->b(I)V

    .line 190
    return-void
.end method

.method private d()V
    .locals 4

    .line 114
    iget-object v0, p0, Lo/dko;->d:Landroid/content/Context;

    const-string v1, "audio"

    invoke-virtual {v0, v1}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/media/AudioManager;

    iput-object v0, p0, Lo/dko;->a:Landroid/media/AudioManager;

    .line 115
    iget-object v0, p0, Lo/dko;->a:Landroid/media/AudioManager;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 116
    iget-object v0, p0, Lo/dko;->a:Landroid/media/AudioManager;

    const/4 v1, 0x3

    invoke-virtual {v0, v1}, Landroid/media/AudioManager;->getStreamMaxVolume(I)I

    move-result v0

    iput v0, p0, Lo/dko;->e:I

    .line 117
    iget-object v0, p0, Lo/dko;->a:Landroid/media/AudioManager;

    const/4 v1, 0x3

    invoke-virtual {v0, v1}, Landroid/media/AudioManager;->getStreamVolume(I)I

    move-result v0

    iput v0, p0, Lo/dko;->f:I

    .line 121
    :cond_0
    invoke-direct {p0}, Lo/dko;->b()V

    .line 124
    new-instance v3, Landroid/os/Message;

    invoke-direct {v3}, Landroid/os/Message;-><init>()V

    .line 125
    const/4 v0, 0x1

    iput v0, v3, Landroid/os/Message;->what:I

    .line 126
    iget-object v0, p0, Lo/dko;->i:Landroid/os/Handler;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_1

    .line 127
    iget-object v0, p0, Lo/dko;->i:Landroid/os/Handler;

    const-wide/16 v1, 0x2710

    invoke-virtual {v0, v3, v1, v2}, Landroid/os/Handler;->sendMessageDelayed(Landroid/os/Message;J)Z

    .line 130
    :cond_1
    return-void
.end method

.method static synthetic d(Lo/dko;)V
    .locals 0

    .line 21
    invoke-direct {p0}, Lo/dko;->e()V

    return-void
.end method

.method private e()V
    .locals 4

    .line 136
    const-string v0, "HWFindPhoneMgr"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "===www===Stop phone lost alert"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 137
    iget-object v0, p0, Lo/dko;->i:Landroid/os/Handler;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 138
    iget-object v0, p0, Lo/dko;->i:Landroid/os/Handler;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeMessages(I)V

    .line 141
    :cond_0
    invoke-direct {p0}, Lo/dko;->c()V

    .line 142
    return-void
.end method


# virtual methods
.method public a()V
    .locals 2

    .line 50
    iget-object v0, p0, Lo/dko;->i:Landroid/os/Handler;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 51
    iget-object v0, p0, Lo/dko;->i:Landroid/os/Handler;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeCallbacksAndMessages(Ljava/lang/Object;)V

    .line 52
    const/4 v0, 0x0

    iput-object v0, p0, Lo/dko;->i:Landroid/os/Handler;

    .line 54
    :cond_0
    return-void
.end method

.method public a([B)V
    .locals 4

    .line 88
    array-length v0, p1

    const/4 v1, 0x5

    if-ge v0, v1, :cond_0

    .line 89
    const-string v0, "HWFindPhoneMgr"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "handleFindPhoneOperationReport ,length < 5, return"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 90
    return-void

    .line 93
    :cond_0
    const/4 v0, 0x1

    aget-byte v0, p1, v0

    const/4 v1, 0x1

    if-ne v1, v0, :cond_1

    .line 94
    const/4 v0, 0x4

    aget-byte v0, p1, v0

    sparse-switch v0, :sswitch_data_0

    goto :goto_0

    .line 96
    :sswitch_0
    const-string v0, "HWFindPhoneMgr"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "operation = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const/4 v3, 0x4

    aget-byte v3, p1, v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "\u2014\u2014\u2014\u2014\u2014\u2014Find phone start"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 97
    invoke-direct {p0}, Lo/dko;->d()V

    .line 98
    goto :goto_0

    .line 100
    :sswitch_1
    const-string v0, "HWFindPhoneMgr"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "operation = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const/4 v3, 0x4

    aget-byte v3, p1, v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "\u2014\u2014\u2014\u2014\u2014\u2014Find phone stop"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 101
    invoke-direct {p0}, Lo/dko;->e()V

    .line 102
    .line 107
    :cond_1
    :goto_0
    return-void

    nop

    :sswitch_data_0
    .sparse-switch
        0x1 -> :sswitch_0
        0x2 -> :sswitch_1
    .end sparse-switch
.end method

.method public c(I)V
    .locals 6

    .line 208
    new-instance v1, Lcom/huawei/hwdevicemgr/dmsdatatype/datatype/DeviceCommand;

    invoke-direct {v1}, Lcom/huawei/hwdevicemgr/dmsdatatype/datatype/DeviceCommand;-><init>()V

    .line 209
    const/16 v0, 0xb

    invoke-virtual {v1, v0}, Lcom/huawei/hwdevicemgr/dmsdatatype/datatype/DeviceCommand;->setServiceID(I)V

    .line 210
    const/4 v0, 0x2

    invoke-virtual {v1, v0}, Lcom/huawei/hwdevicemgr/dmsdatatype/datatype/DeviceCommand;->setCommandID(I)V

    .line 211
    const/4 v0, 0x0

    invoke-virtual {v1, v0}, Lcom/huawei/hwdevicemgr/dmsdatatype/datatype/DeviceCommand;->setNeedAck(Z)V

    .line 214
    const/4 v0, 0x1

    invoke-static {v0}, Lo/czx;->d(I)Ljava/lang/String;

    move-result-object v2

    .line 216
    const/4 v0, 0x1

    invoke-static {v0}, Lo/czx;->d(I)Ljava/lang/String;

    move-result-object v3

    .line 218
    invoke-static {p1}, Lo/czx;->d(I)Ljava/lang/String;

    move-result-object v4

    .line 219
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    .line 221
    invoke-static {v5}, Lo/czx;->e(Ljava/lang/String;)[B

    move-result-object v0

    invoke-virtual {v1, v0}, Lcom/huawei/hwdevicemgr/dmsdatatype/datatype/DeviceCommand;->setDataContent([B)V

    .line 222
    invoke-static {v5}, Lo/czx;->e(Ljava/lang/String;)[B

    move-result-object v0

    array-length v0, v0

    invoke-virtual {v1, v0}, Lcom/huawei/hwdevicemgr/dmsdatatype/datatype/DeviceCommand;->setDataLen(I)V

    .line 224
    iget-object v0, p0, Lo/dko;->d:Landroid/content/Context;

    invoke-static {v0}, Lo/dea;->a(Landroid/content/Context;)Lo/dea;

    move-result-object v0

    invoke-virtual {v0, v1}, Lo/dea;->d(Lcom/huawei/hwdevicemgr/dmsdatatype/datatype/DeviceCommand;)V

    .line 225
    return-void
.end method
