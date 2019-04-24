.class Lcom/huawei/bone/ui/setting/NotificationPushListener$2;
.super Lo/dju$e;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/bone/ui/setting/NotificationPushListener;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic d:Lcom/huawei/bone/ui/setting/NotificationPushListener;


# direct methods
.method constructor <init>(Lcom/huawei/bone/ui/setting/NotificationPushListener;)V
    .locals 0

    .line 63
    iput-object p1, p0, Lcom/huawei/bone/ui/setting/NotificationPushListener$2;->d:Lcom/huawei/bone/ui/setting/NotificationPushListener;

    invoke-direct {p0}, Lo/dju$e;-><init>()V

    return-void
.end method


# virtual methods
.method public a()V
    .locals 4

    .line 114
    const-string v0, "NotificationPushListener"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "musicInterface remoteListener"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 115
    iget-object v0, p0, Lcom/huawei/bone/ui/setting/NotificationPushListener$2;->d:Lcom/huawei/bone/ui/setting/NotificationPushListener;

    invoke-static {v0}, Lcom/huawei/bone/ui/setting/NotificationPushListener;->h(Lcom/huawei/bone/ui/setting/NotificationPushListener;)V

    .line 116
    return-void
.end method

.method public b()Lcom/huawei/hwcommonmodel/datatypes/MusicInfo;
    .locals 8

    .line 71
    const-string v0, "NotificationPushListener"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "musicInterface getCurrentMusicInfo"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 72
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    const-string v1, "audio"

    invoke-virtual {v0, v1}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Landroid/media/AudioManager;

    .line 73
    const/4 v0, 0x3

    invoke-virtual {v4, v0}, Landroid/media/AudioManager;->getStreamVolume(I)I

    move-result v5

    .line 74
    const/4 v0, 0x3

    invoke-virtual {v4, v0}, Landroid/media/AudioManager;->getStreamMaxVolume(I)I

    move-result v6

    .line 75
    new-instance v7, Lcom/huawei/hwcommonmodel/datatypes/MusicInfo;

    invoke-direct {v7}, Lcom/huawei/hwcommonmodel/datatypes/MusicInfo;-><init>()V

    .line 77
    iget-object v0, p0, Lcom/huawei/bone/ui/setting/NotificationPushListener$2;->d:Lcom/huawei/bone/ui/setting/NotificationPushListener;

    invoke-static {v0}, Lcom/huawei/bone/ui/setting/NotificationPushListener;->a(Lcom/huawei/bone/ui/setting/NotificationPushListener;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 78
    const/4 v0, 0x0

    invoke-virtual {v7, v0}, Lcom/huawei/hwcommonmodel/datatypes/MusicInfo;->setPlay_State(I)V

    .line 79
    const-string v0, ""

    invoke-virtual {v7, v0}, Lcom/huawei/hwcommonmodel/datatypes/MusicInfo;->setSinger_Name(Ljava/lang/String;)V

    .line 80
    const-string v0, ""

    invoke-virtual {v7, v0}, Lcom/huawei/hwcommonmodel/datatypes/MusicInfo;->setSong_Name(Ljava/lang/String;)V

    .line 81
    const/4 v0, 0x0

    invoke-virtual {v7, v0}, Lcom/huawei/hwcommonmodel/datatypes/MusicInfo;->setMax_Volume(I)V

    .line 82
    const/4 v0, 0x0

    invoke-virtual {v7, v0}, Lcom/huawei/hwcommonmodel/datatypes/MusicInfo;->setCurrent_Volume(I)V

    goto :goto_0

    .line 84
    :cond_0
    iget-object v0, p0, Lcom/huawei/bone/ui/setting/NotificationPushListener$2;->d:Lcom/huawei/bone/ui/setting/NotificationPushListener;

    invoke-static {v0}, Lcom/huawei/bone/ui/setting/NotificationPushListener;->d(Lcom/huawei/bone/ui/setting/NotificationPushListener;)I

    move-result v0

    invoke-virtual {v7, v0}, Lcom/huawei/hwcommonmodel/datatypes/MusicInfo;->setPlay_State(I)V

    .line 85
    iget-object v0, p0, Lcom/huawei/bone/ui/setting/NotificationPushListener$2;->d:Lcom/huawei/bone/ui/setting/NotificationPushListener;

    invoke-static {v0}, Lcom/huawei/bone/ui/setting/NotificationPushListener;->e(Lcom/huawei/bone/ui/setting/NotificationPushListener;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v7, v0}, Lcom/huawei/hwcommonmodel/datatypes/MusicInfo;->setSinger_Name(Ljava/lang/String;)V

    .line 86
    iget-object v0, p0, Lcom/huawei/bone/ui/setting/NotificationPushListener$2;->d:Lcom/huawei/bone/ui/setting/NotificationPushListener;

    invoke-static {v0}, Lcom/huawei/bone/ui/setting/NotificationPushListener;->b(Lcom/huawei/bone/ui/setting/NotificationPushListener;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v7, v0}, Lcom/huawei/hwcommonmodel/datatypes/MusicInfo;->setSong_Name(Ljava/lang/String;)V

    .line 87
    invoke-virtual {v7, v6}, Lcom/huawei/hwcommonmodel/datatypes/MusicInfo;->setMax_Volume(I)V

    .line 88
    invoke-virtual {v7, v5}, Lcom/huawei/hwcommonmodel/datatypes/MusicInfo;->setCurrent_Volume(I)V

    .line 90
    :goto_0
    const-string v0, "NotificationPushListener"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "getCurrentMusicInfo :"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v7}, Lcom/huawei/hwcommonmodel/datatypes/MusicInfo;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 91
    return-object v7
.end method

.method public d(I)V
    .locals 5

    .line 95
    const-string v0, "NotificationPushListener"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "musicInterface controllMusic"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 96
    iget-object v0, p0, Lcom/huawei/bone/ui/setting/NotificationPushListener$2;->d:Lcom/huawei/bone/ui/setting/NotificationPushListener;

    invoke-static {v0}, Lcom/huawei/bone/ui/setting/NotificationPushListener;->f(Lcom/huawei/bone/ui/setting/NotificationPushListener;)Landroid/media/RemoteController;

    move-result-object v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    iget-object v0, p0, Lcom/huawei/bone/ui/setting/NotificationPushListener$2;->d:Lcom/huawei/bone/ui/setting/NotificationPushListener;

    invoke-static {v0}, Lcom/huawei/bone/ui/setting/NotificationPushListener;->a(Lcom/huawei/bone/ui/setting/NotificationPushListener;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 97
    iget-object v0, p0, Lcom/huawei/bone/ui/setting/NotificationPushListener$2;->d:Lcom/huawei/bone/ui/setting/NotificationPushListener;

    invoke-static {v0}, Lcom/huawei/bone/ui/setting/NotificationPushListener;->f(Lcom/huawei/bone/ui/setting/NotificationPushListener;)Landroid/media/RemoteController;

    move-result-object v0

    new-instance v1, Landroid/view/KeyEvent;

    const/4 v2, 0x0

    invoke-direct {v1, v2, p1}, Landroid/view/KeyEvent;-><init>(II)V

    invoke-virtual {v0, v1}, Landroid/media/RemoteController;->sendMediaKeyEvent(Landroid/view/KeyEvent;)Z

    .line 98
    iget-object v0, p0, Lcom/huawei/bone/ui/setting/NotificationPushListener$2;->d:Lcom/huawei/bone/ui/setting/NotificationPushListener;

    invoke-static {v0}, Lcom/huawei/bone/ui/setting/NotificationPushListener;->f(Lcom/huawei/bone/ui/setting/NotificationPushListener;)Landroid/media/RemoteController;

    move-result-object v0

    new-instance v1, Landroid/view/KeyEvent;

    const/4 v2, 0x1

    invoke-direct {v1, v2, p1}, Landroid/view/KeyEvent;-><init>(II)V

    invoke-virtual {v0, v1}, Landroid/media/RemoteController;->sendMediaKeyEvent(Landroid/view/KeyEvent;)Z

    .line 99
    const-string v0, "NotificationPushListener"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "controllMusic end"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    goto :goto_0

    .line 100
    :cond_0
    iget-object v0, p0, Lcom/huawei/bone/ui/setting/NotificationPushListener$2;->d:Lcom/huawei/bone/ui/setting/NotificationPushListener;

    invoke-static {v0}, Lcom/huawei/bone/ui/setting/NotificationPushListener;->a(Lcom/huawei/bone/ui/setting/NotificationPushListener;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 101
    const-string v0, "NotificationPushListener"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "controllMusic isPlayEnd!!!"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 102
    iget-object v0, p0, Lcom/huawei/bone/ui/setting/NotificationPushListener$2;->d:Lcom/huawei/bone/ui/setting/NotificationPushListener;

    const-string v1, "audio"

    invoke-virtual {v0, v1}, Lcom/huawei/bone/ui/setting/NotificationPushListener;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Landroid/media/AudioManager;

    .line 103
    new-instance v0, Landroid/view/KeyEvent;

    const/4 v1, 0x0

    invoke-direct {v0, v1, p1}, Landroid/view/KeyEvent;-><init>(II)V

    invoke-virtual {v4, v0}, Landroid/media/AudioManager;->dispatchMediaKeyEvent(Landroid/view/KeyEvent;)V

    .line 104
    new-instance v0, Landroid/view/KeyEvent;

    const/4 v1, 0x1

    invoke-direct {v0, v1, p1}, Landroid/view/KeyEvent;-><init>(II)V

    invoke-virtual {v4, v0}, Landroid/media/AudioManager;->dispatchMediaKeyEvent(Landroid/view/KeyEvent;)V

    .line 106
    :cond_1
    :goto_0
    return-void
.end method

.method public d(Lo/djq;)V
    .locals 4

    .line 109
    const-string v0, "NotificationPushListener"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "musicInterface setCallback"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 110
    iget-object v0, p0, Lcom/huawei/bone/ui/setting/NotificationPushListener$2;->d:Lcom/huawei/bone/ui/setting/NotificationPushListener;

    invoke-static {v0, p1}, Lcom/huawei/bone/ui/setting/NotificationPushListener;->c(Lcom/huawei/bone/ui/setting/NotificationPushListener;Lo/djq;)Lo/djq;

    .line 111
    return-void
.end method

.method public e()V
    .locals 4

    .line 66
    const-string v0, "NotificationPushListener"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "musicInterface initMusic"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 67
    iget-object v0, p0, Lcom/huawei/bone/ui/setting/NotificationPushListener$2;->d:Lcom/huawei/bone/ui/setting/NotificationPushListener;

    invoke-static {v0}, Lcom/huawei/bone/ui/setting/NotificationPushListener;->c(Lcom/huawei/bone/ui/setting/NotificationPushListener;)Landroid/os/Handler;

    move-result-object v0

    const/16 v1, 0xa

    invoke-virtual {v0, v1}, Landroid/os/Handler;->obtainMessage(I)Landroid/os/Message;

    move-result-object v0

    invoke-virtual {v0}, Landroid/os/Message;->sendToTarget()V

    .line 68
    return-void
.end method
