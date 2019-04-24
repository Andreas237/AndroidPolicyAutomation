.class public Lo/brj;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private a:Landroid/content/Context;

.field private b:Lcom/huawei/health/sns/model/chat/MessageItem;

.field private c:Ljava/lang/String;

.field private d:Z

.field private e:Landroid/media/MediaPlayer;

.field private g:Landroid/widget/ImageView;

.field private i:Landroid/graphics/drawable/AnimationDrawable;


# direct methods
.method public constructor <init>(Landroid/content/Context;Lcom/huawei/health/sns/model/chat/MessageItem;Landroid/widget/ImageView;)V
    .locals 1

    .line 36
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 24
    const/4 v0, 0x0

    iput-boolean v0, p0, Lo/brj;->d:Z

    .line 37
    iput-object p1, p0, Lo/brj;->a:Landroid/content/Context;

    .line 38
    iput-object p2, p0, Lo/brj;->b:Lcom/huawei/health/sns/model/chat/MessageItem;

    .line 39
    iput-object p3, p0, Lo/brj;->g:Landroid/widget/ImageView;

    .line 40
    return-void
.end method

.method static synthetic a(Lo/brj;)V
    .locals 0

    .line 21
    invoke-direct {p0}, Lo/brj;->b()V

    return-void
.end method

.method static synthetic b(Lo/brj;)Landroid/media/MediaPlayer;
    .locals 1

    .line 21
    iget-object v0, p0, Lo/brj;->e:Landroid/media/MediaPlayer;

    return-object v0
.end method

.method private b()V
    .locals 3

    .line 137
    const-string v0, "VoicePlayUtil"

    const-string v1, "stopPlayVoice"

    invoke-static {v0, v1}, Lo/bpf;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 139
    iget-object v0, p0, Lo/brj;->i:Landroid/graphics/drawable/AnimationDrawable;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 140
    iget-object v0, p0, Lo/brj;->i:Landroid/graphics/drawable/AnimationDrawable;

    invoke-virtual {v0}, Landroid/graphics/drawable/AnimationDrawable;->stop()V

    .line 142
    :cond_0
    iget-object v0, p0, Lo/brj;->b:Lcom/huawei/health/sns/model/chat/MessageItem;

    invoke-virtual {v0}, Lcom/huawei/health/sns/model/chat/MessageItem;->getMsgStatus()I

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_1

    sget v2, Lcom/huawei/android/sns/R$drawable;->chatfrom_voice_playing_f3:I

    goto :goto_0

    :cond_1
    sget v2, Lcom/huawei/android/sns/R$drawable;->chatto_voice_playing_f3:I

    .line 143
    :goto_0
    iget-object v0, p0, Lo/brj;->g:Landroid/widget/ImageView;

    invoke-virtual {v0, v2}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 146
    iget-object v0, p0, Lo/brj;->e:Landroid/media/MediaPlayer;

    if-eqz v0, :cond_2

    .line 147
    iget-object v0, p0, Lo/brj;->e:Landroid/media/MediaPlayer;

    invoke-virtual {v0}, Landroid/media/MediaPlayer;->stop()V

    .line 148
    iget-object v0, p0, Lo/brj;->e:Landroid/media/MediaPlayer;

    invoke-virtual {v0}, Landroid/media/MediaPlayer;->release()V

    .line 150
    :cond_2
    const/4 v0, 0x0

    iput-boolean v0, p0, Lo/brj;->d:Z

    .line 151
    const-string v0, "VoicePlayUtil"

    const-string v1, "stopPlayVoice mIsPlaying = false"

    invoke-static {v0, v1}, Lo/bpf;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 152
    const/4 v0, 0x0

    iput-object v0, p0, Lo/brj;->c:Ljava/lang/String;

    .line 154
    return-void
.end method

.method static synthetic c(Lo/brj;Landroid/media/MediaPlayer;)Landroid/media/MediaPlayer;
    .locals 0

    .line 21
    iput-object p1, p0, Lo/brj;->e:Landroid/media/MediaPlayer;

    return-object p1
.end method

.method private e()V
    .locals 3

    .line 67
    iget-object v0, p0, Lo/brj;->b:Lcom/huawei/health/sns/model/chat/MessageItem;

    invoke-virtual {v0}, Lcom/huawei/health/sns/model/chat/MessageItem;->getMsgStatus()I

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    sget v2, Lcom/huawei/android/sns/R$drawable;->voice_from_me:I

    goto :goto_0

    :cond_0
    sget v2, Lcom/huawei/android/sns/R$drawable;->voice_to_me:I

    .line 68
    :goto_0
    iget-object v0, p0, Lo/brj;->g:Landroid/widget/ImageView;

    invoke-virtual {v0, v2}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 69
    iget-object v0, p0, Lo/brj;->g:Landroid/widget/ImageView;

    invoke-virtual {v0}, Landroid/widget/ImageView;->getDrawable()Landroid/graphics/drawable/Drawable;

    move-result-object v0

    check-cast v0, Landroid/graphics/drawable/AnimationDrawable;

    iput-object v0, p0, Lo/brj;->i:Landroid/graphics/drawable/AnimationDrawable;

    .line 70
    iget-object v0, p0, Lo/brj;->i:Landroid/graphics/drawable/AnimationDrawable;

    invoke-virtual {v0}, Landroid/graphics/drawable/AnimationDrawable;->start()V

    .line 71
    return-void
.end method


# virtual methods
.method public a(Ljava/lang/String;)V
    .locals 6

    .line 75
    const-string v0, "VoicePlayUtil"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "playVoice filePath="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/bpf;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 77
    new-instance v0, Ljava/io/File;

    invoke-direct {v0, p1}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0}, Ljava/io/File;->exists()Z

    move-result v0

    if-nez v0, :cond_0

    .line 78
    return-void

    .line 80
    :cond_0
    iget-object v0, p0, Lo/brj;->b:Lcom/huawei/health/sns/model/chat/MessageItem;

    invoke-virtual {v0}, Lcom/huawei/health/sns/model/chat/MessageItem;->getMediaUrl()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lo/brj;->c:Ljava/lang/String;

    .line 81
    const-string v0, "VoicePlayUtil"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "playVoice mPlayingMsgId="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget-object v2, p0, Lo/brj;->c:Ljava/lang/String;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/bpf;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 82
    iget-object v0, p0, Lo/brj;->a:Landroid/content/Context;

    const-string v1, "audio"

    invoke-virtual {v0, v1}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Landroid/media/AudioManager;

    .line 84
    new-instance v0, Landroid/media/MediaPlayer;

    invoke-direct {v0}, Landroid/media/MediaPlayer;-><init>()V

    iput-object v0, p0, Lo/brj;->e:Landroid/media/MediaPlayer;

    .line 86
    const/4 v0, 0x0

    invoke-virtual {v4, v0}, Landroid/media/AudioManager;->setMode(I)V

    .line 88
    const/4 v0, 0x1

    invoke-virtual {v4, v0}, Landroid/media/AudioManager;->setSpeakerphoneOn(Z)V

    .line 89
    iget-object v0, p0, Lo/brj;->e:Landroid/media/MediaPlayer;

    const/4 v1, 0x2

    invoke-virtual {v0, v1}, Landroid/media/MediaPlayer;->setAudioStreamType(I)V

    .line 98
    :try_start_0
    iget-object v0, p0, Lo/brj;->e:Landroid/media/MediaPlayer;

    invoke-virtual {v0, p1}, Landroid/media/MediaPlayer;->setDataSource(Ljava/lang/String;)V

    .line 99
    iget-object v0, p0, Lo/brj;->e:Landroid/media/MediaPlayer;

    invoke-virtual {v0}, Landroid/media/MediaPlayer;->prepare()V

    .line 100
    iget-object v0, p0, Lo/brj;->e:Landroid/media/MediaPlayer;

    new-instance v1, Lo/brj$2;

    invoke-direct {v1, p0}, Lo/brj$2;-><init>(Lo/brj;)V

    invoke-virtual {v0, v1}, Landroid/media/MediaPlayer;->setOnCompletionListener(Landroid/media/MediaPlayer$OnCompletionListener;)V

    .line 110
    const/4 v0, 0x1

    iput-boolean v0, p0, Lo/brj;->d:Z

    .line 111
    const-string v0, "VoicePlayUtil"

    const-string v1, "playVoice mIsPlaying = true"

    invoke-static {v0, v1}, Lo/bpf;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 113
    iget-object v0, p0, Lo/brj;->e:Landroid/media/MediaPlayer;

    invoke-virtual {v0}, Landroid/media/MediaPlayer;->start()V

    .line 114
    invoke-direct {p0}, Lo/brj;->e()V

    .line 117
    iget-object v0, p0, Lo/brj;->b:Lcom/huawei/health/sns/model/chat/MessageItem;

    invoke-virtual {v0}, Lcom/huawei/health/sns/model/chat/MessageItem;->getMsgStatus()I
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    move-result v0

    .line 132
    goto :goto_0

    .line 130
    :catch_0
    move-exception v5

    .line 131
    const-string v0, "VoicePlayUtil"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "playVoice Exception "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {v5}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 133
    :goto_0
    return-void
.end method

.method public d()V
    .locals 3

    .line 44
    const-string v0, "VoicePlayUtil"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "playVoice "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget-object v2, p0, Lo/brj;->b:Lcom/huawei/health/sns/model/chat/MessageItem;

    invoke-virtual {v2}, Lcom/huawei/health/sns/model/chat/MessageItem;->getMediaUrl()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/bpf;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 45
    iget-object v0, p0, Lo/brj;->b:Lcom/huawei/health/sns/model/chat/MessageItem;

    invoke-virtual {v0}, Lcom/huawei/health/sns/model/chat/MessageItem;->getMediaUrl()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 46
    const-string v0, "VoicePlayUtil"

    const-string v1, "playVoice mVoiceMessage getMediaUrl is null"

    invoke-static {v0, v1}, Lo/bpf;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 47
    return-void

    .line 50
    :cond_0
    const-string v0, "VoicePlayUtil"

    const-string v1, "playVoice"

    invoke-static {v0, v1}, Lo/bpf;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 52
    iget-boolean v0, p0, Lo/brj;->d:Z

    if-eqz v0, :cond_2

    .line 53
    const-string v0, "VoicePlayUtil"

    const-string v1, "playVoice is mIsPlaying"

    invoke-static {v0, v1}, Lo/bpf;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 54
    iget-object v0, p0, Lo/brj;->c:Ljava/lang/String;

    if-eqz v0, :cond_1

    iget-object v0, p0, Lo/brj;->c:Ljava/lang/String;

    iget-object v1, p0, Lo/brj;->b:Lcom/huawei/health/sns/model/chat/MessageItem;

    invoke-virtual {v1}, Lcom/huawei/health/sns/model/chat/MessageItem;->getMediaUrl()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 55
    invoke-direct {p0}, Lo/brj;->b()V

    .line 56
    const-string v0, "VoicePlayUtil"

    const-string v1, "playVoice mIsPlaying and same voice,return"

    invoke-static {v0, v1}, Lo/bpf;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 57
    return-void

    .line 59
    :cond_1
    invoke-direct {p0}, Lo/brj;->b()V

    .line 61
    :cond_2
    iget-object v0, p0, Lo/brj;->b:Lcom/huawei/health/sns/model/chat/MessageItem;

    invoke-virtual {v0}, Lcom/huawei/health/sns/model/chat/MessageItem;->getMediaUrl()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Lo/brj;->a(Ljava/lang/String;)V

    .line 62
    return-void
.end method
