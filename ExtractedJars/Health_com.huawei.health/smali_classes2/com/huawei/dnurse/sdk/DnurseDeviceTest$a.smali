.class Lcom/huawei/dnurse/sdk/DnurseDeviceTest$a;
.super Ljava/lang/Object;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/dnurse/sdk/DnurseDeviceTest;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = "a"
.end annotation


# instance fields
.field public a:Z

.field final synthetic b:Lcom/huawei/dnurse/sdk/DnurseDeviceTest;

.field private c:I

.field private d:I

.field private e:Landroid/media/AudioManager;

.field private f:Landroid/media/AudioTrack;

.field private final g:[S

.field private final h:[S

.field private final i:[S


# direct methods
.method constructor <init>(Lcom/huawei/dnurse/sdk/DnurseDeviceTest;)V
    .locals 7

    iput-object p1, p0, Lcom/huawei/dnurse/sdk/DnurseDeviceTest$a;->b:Lcom/huawei/dnurse/sdk/DnurseDeviceTest;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, -0x1

    iput v0, p0, Lcom/huawei/dnurse/sdk/DnurseDeviceTest$a;->c:I

    const/4 v0, 0x0

    iput v0, p0, Lcom/huawei/dnurse/sdk/DnurseDeviceTest$a;->d:I

    const/16 v0, 0x20

    new-array v0, v0, [S

    fill-array-data v0, :array_0

    iput-object v0, p0, Lcom/huawei/dnurse/sdk/DnurseDeviceTest$a;->g:[S

    const/16 v0, 0x20

    new-array v0, v0, [S

    fill-array-data v0, :array_1

    iput-object v0, p0, Lcom/huawei/dnurse/sdk/DnurseDeviceTest$a;->h:[S

    const/16 v0, 0x8

    new-array v0, v0, [S

    fill-array-data v0, :array_2

    iput-object v0, p0, Lcom/huawei/dnurse/sdk/DnurseDeviceTest$a;->i:[S

    invoke-static {p1}, Lcom/huawei/dnurse/sdk/DnurseDeviceTest;->p(Lcom/huawei/dnurse/sdk/DnurseDeviceTest;)Landroid/content/Context;

    move-result-object v0

    const-string v1, "audio"

    invoke-virtual {v0, v1}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/media/AudioManager;

    iput-object v0, p0, Lcom/huawei/dnurse/sdk/DnurseDeviceTest$a;->e:Landroid/media/AudioManager;

    const/16 v0, 0xfa0

    const/16 v1, 0xc

    const/4 v2, 0x2

    invoke-static {v0, v1, v2}, Landroid/media/AudioTrack;->getMinBufferSize(III)I

    move-result v0

    iput v0, p0, Lcom/huawei/dnurse/sdk/DnurseDeviceTest$a;->d:I

    const-string v0, "HWHealthSDK"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "AudPly: min buffer="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget v2, p0, Lcom/huawei/dnurse/sdk/DnurseDeviceTest$a;->d:I

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    new-instance v0, Landroid/media/AudioTrack;

    iget v5, p0, Lcom/huawei/dnurse/sdk/DnurseDeviceTest$a;->d:I

    const/4 v1, 0x3

    const/16 v2, 0xfa0

    const/16 v3, 0xc

    const/4 v4, 0x2

    const/4 v6, 0x1

    invoke-direct/range {v0 .. v6}, Landroid/media/AudioTrack;-><init>(IIIIII)V

    iput-object v0, p0, Lcom/huawei/dnurse/sdk/DnurseDeviceTest$a;->f:Landroid/media/AudioTrack;

    iget-object v0, p0, Lcom/huawei/dnurse/sdk/DnurseDeviceTest$a;->f:Landroid/media/AudioTrack;

    invoke-virtual {v0}, Landroid/media/AudioTrack;->getState()I

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    iget-object v0, p0, Lcom/huawei/dnurse/sdk/DnurseDeviceTest$a;->f:Landroid/media/AudioTrack;

    invoke-static {}, Landroid/media/AudioTrack;->getMaxVolume()F

    move-result v1

    invoke-static {}, Landroid/media/AudioTrack;->getMaxVolume()F

    move-result v2

    invoke-virtual {v0, v1, v2}, Landroid/media/AudioTrack;->setStereoVolume(FF)I

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lcom/huawei/dnurse/sdk/DnurseDeviceTest$a;->f:Landroid/media/AudioTrack;

    invoke-virtual {v0}, Landroid/media/AudioTrack;->release()V

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/dnurse/sdk/DnurseDeviceTest$a;->f:Landroid/media/AudioTrack;

    :goto_0
    return-void

    nop

    :array_0
    .array-data 2
        0x0s
        0x0s
        0x4000s
        -0x4000s
        0x6800s
        -0x6800s
        0x7c00s
        -0x7c00s
        0x7fffs
        -0x8000s
        0x7c00s
        -0x7c00s
        0x6800s
        -0x6800s
        0x4000s
        -0x4000s
        0x0s
        0x0s
        -0x4000s
        0x4000s
        -0x6800s
        0x6800s
        -0x7c00s
        0x7c00s
        -0x8000s
        0x7fffs
        -0x7c00s
        0x7c00s
        -0x6800s
        0x6800s
        -0x4000s
        0x4000s
    .end array-data

    :array_1
    .array-data 2
        0x0s
        0x0s
        0x7c00s
        -0x7c00s
        0x7fffs
        -0x8000s
        0x7c00s
        -0x7c00s
        0x0s
        0x0s
        -0x7c00s
        0x7c00s
        -0x8000s
        0x7fffs
        -0x7c00s
        0x7c00s
        0x0s
        0x0s
        0x7c00s
        -0x7c00s
        0x7fffs
        -0x8000s
        0x7c00s
        -0x7c00s
        0x0s
        0x0s
        -0x7c00s
        0x7c00s
        -0x8000s
        0x7fffs
        -0x7c00s
        0x7c00s
    .end array-data

    :array_2
    .array-data 2
        0x0s
        0x0s
        0x0s
        0x0s
        0x0s
        0x0s
        0x0s
        0x0s
    .end array-data
.end method

.method private a([SII)Z
    .locals 8

    const/4 v3, 0x0

    iget-object v0, p0, Lcom/huawei/dnurse/sdk/DnurseDeviceTest$a;->f:Landroid/media/AudioTrack;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    return v0

    :cond_0
    iget v0, p0, Lcom/huawei/dnurse/sdk/DnurseDeviceTest$a;->d:I

    iget-object v1, p0, Lcom/huawei/dnurse/sdk/DnurseDeviceTest$a;->i:[S

    array-length v1, v1

    div-int/2addr v0, v1

    div-int/lit8 v0, v0, 0x2

    add-int/lit8 v3, v0, 0x2

    iget-object v0, p0, Lcom/huawei/dnurse/sdk/DnurseDeviceTest$a;->f:Landroid/media/AudioTrack;

    if-eqz v0, :cond_8

    array-length v0, p1

    mul-int/2addr v0, p3

    iget-object v1, p0, Lcom/huawei/dnurse/sdk/DnurseDeviceTest$a;->i:[S

    array-length v1, v1

    mul-int/2addr v1, p2

    add-int/2addr v0, v1

    iget-object v1, p0, Lcom/huawei/dnurse/sdk/DnurseDeviceTest$a;->i:[S

    array-length v1, v1

    mul-int/2addr v1, v3

    add-int/2addr v0, v1

    new-array v4, v0, [S

    const/4 v5, 0x0

    const/4 v6, 0x0

    :goto_0
    if-ge v6, p2, :cond_2

    const/4 v7, 0x0

    :goto_1
    iget-object v0, p0, Lcom/huawei/dnurse/sdk/DnurseDeviceTest$a;->i:[S

    array-length v0, v0

    if-ge v7, v0, :cond_1

    move v0, v5

    add-int/lit8 v5, v5, 0x1

    iget-object v1, p0, Lcom/huawei/dnurse/sdk/DnurseDeviceTest$a;->i:[S

    aget-short v1, v1, v7

    aput-short v1, v4, v0

    add-int/lit8 v7, v7, 0x1

    goto :goto_1

    :cond_1
    add-int/lit8 v6, v6, 0x1

    goto :goto_0

    :cond_2
    const/4 v6, 0x0

    :goto_2
    if-ge v6, p3, :cond_4

    const/4 v7, 0x0

    :goto_3
    array-length v0, p1

    if-ge v7, v0, :cond_3

    move v0, v5

    add-int/lit8 v5, v5, 0x1

    aget-short v1, p1, v7

    aput-short v1, v4, v0

    add-int/lit8 v7, v7, 0x1

    goto :goto_3

    :cond_3
    add-int/lit8 v6, v6, 0x1

    goto :goto_2

    :cond_4
    const/4 v6, 0x0

    :goto_4
    if-ge v6, v3, :cond_6

    const/4 v7, 0x0

    :goto_5
    iget-object v0, p0, Lcom/huawei/dnurse/sdk/DnurseDeviceTest$a;->i:[S

    array-length v0, v0

    if-ge v7, v0, :cond_5

    move v0, v5

    add-int/lit8 v5, v5, 0x1

    iget-object v1, p0, Lcom/huawei/dnurse/sdk/DnurseDeviceTest$a;->i:[S

    aget-short v1, v1, v7

    aput-short v1, v4, v0

    add-int/lit8 v7, v7, 0x1

    goto :goto_5

    :cond_5
    add-int/lit8 v6, v6, 0x1

    goto :goto_4

    :cond_6
    iget-object v0, p0, Lcom/huawei/dnurse/sdk/DnurseDeviceTest$a;->f:Landroid/media/AudioTrack;

    invoke-virtual {v0}, Landroid/media/AudioTrack;->flush()V

    iget-object v0, p0, Lcom/huawei/dnurse/sdk/DnurseDeviceTest$a;->f:Landroid/media/AudioTrack;

    invoke-virtual {v0}, Landroid/media/AudioTrack;->play()V

    iget-object v0, p0, Lcom/huawei/dnurse/sdk/DnurseDeviceTest$a;->f:Landroid/media/AudioTrack;

    array-length v1, v4

    const/4 v2, 0x0

    invoke-virtual {v0, v4, v2, v1}, Landroid/media/AudioTrack;->write([SII)I

    iget-object v0, p0, Lcom/huawei/dnurse/sdk/DnurseDeviceTest$a;->b:Lcom/huawei/dnurse/sdk/DnurseDeviceTest;

    invoke-static {v0}, Lcom/huawei/dnurse/sdk/DnurseDeviceTest;->x(Lcom/huawei/dnurse/sdk/DnurseDeviceTest;)Z

    move-result v0

    if-nez v0, :cond_7

    iget-object v0, p0, Lcom/huawei/dnurse/sdk/DnurseDeviceTest$a;->f:Landroid/media/AudioTrack;

    invoke-virtual {v0}, Landroid/media/AudioTrack;->stop()V

    :cond_7
    const-string v0, "HWHealthSDK"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "AudPly: Play F:"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, " B:"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, " T:"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, " finished!"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    :cond_8
    const/4 v0, 0x1

    return v0
.end method


# virtual methods
.method public a(Z)V
    .locals 4

    iget-object v0, p0, Lcom/huawei/dnurse/sdk/DnurseDeviceTest$a;->b:Lcom/huawei/dnurse/sdk/DnurseDeviceTest;

    invoke-static {v0}, Lcom/huawei/dnurse/sdk/DnurseDeviceTest;->s(Lcom/huawei/dnurse/sdk/DnurseDeviceTest;)I

    move-result v0

    iget-object v1, p0, Lcom/huawei/dnurse/sdk/DnurseDeviceTest$a;->b:Lcom/huawei/dnurse/sdk/DnurseDeviceTest;

    invoke-static {v1}, Lcom/huawei/dnurse/sdk/DnurseDeviceTest;->v(Lcom/huawei/dnurse/sdk/DnurseDeviceTest;)[[I

    move-result-object v1

    iget-object v2, p0, Lcom/huawei/dnurse/sdk/DnurseDeviceTest$a;->b:Lcom/huawei/dnurse/sdk/DnurseDeviceTest;

    invoke-static {v2}, Lcom/huawei/dnurse/sdk/DnurseDeviceTest;->w(Lcom/huawei/dnurse/sdk/DnurseDeviceTest;)I

    move-result v2

    aget-object v1, v1, v2

    const/4 v2, 0x5

    aget v1, v1, v2

    add-int v3, v0, v1

    if-eqz p1, :cond_0

    iget-object v0, p0, Lcom/huawei/dnurse/sdk/DnurseDeviceTest$a;->h:[S

    iget-object v1, p0, Lcom/huawei/dnurse/sdk/DnurseDeviceTest$a;->b:Lcom/huawei/dnurse/sdk/DnurseDeviceTest;

    invoke-static {v1}, Lcom/huawei/dnurse/sdk/DnurseDeviceTest;->u(Lcom/huawei/dnurse/sdk/DnurseDeviceTest;)I

    move-result v1

    invoke-direct {p0, v0, v1, v3}, Lcom/huawei/dnurse/sdk/DnurseDeviceTest$a;->a([SII)Z

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lcom/huawei/dnurse/sdk/DnurseDeviceTest$a;->g:[S

    iget-object v1, p0, Lcom/huawei/dnurse/sdk/DnurseDeviceTest$a;->b:Lcom/huawei/dnurse/sdk/DnurseDeviceTest;

    invoke-static {v1}, Lcom/huawei/dnurse/sdk/DnurseDeviceTest;->u(Lcom/huawei/dnurse/sdk/DnurseDeviceTest;)I

    move-result v1

    invoke-direct {p0, v0, v1, v3}, Lcom/huawei/dnurse/sdk/DnurseDeviceTest$a;->a([SII)Z

    :goto_0
    return-void
.end method

.method public a()Z
    .locals 7

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    iget-object v0, p0, Lcom/huawei/dnurse/sdk/DnurseDeviceTest$a;->e:Landroid/media/AudioManager;

    const/4 v1, 0x3

    invoke-virtual {v0, v1}, Landroid/media/AudioManager;->getStreamVolume(I)I

    move-result v3

    const-string v0, "HWHealthSDK"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "AudPly: setMaxVolume Old="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    iget v0, p0, Lcom/huawei/dnurse/sdk/DnurseDeviceTest$a;->c:I

    const/4 v1, -0x1

    if-ne v0, v1, :cond_0

    iput v3, p0, Lcom/huawei/dnurse/sdk/DnurseDeviceTest$a;->c:I

    :cond_0
    iget-object v0, p0, Lcom/huawei/dnurse/sdk/DnurseDeviceTest$a;->e:Landroid/media/AudioManager;

    const/4 v1, 0x3

    invoke-virtual {v0, v1}, Landroid/media/AudioManager;->getStreamMaxVolume(I)I

    move-result v5

    move v4, v5

    iget-object v0, p0, Lcom/huawei/dnurse/sdk/DnurseDeviceTest$a;->e:Landroid/media/AudioManager;

    const/4 v1, 0x3

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v4, v2}, Landroid/media/AudioManager;->setStreamVolume(III)V

    iget-object v0, p0, Lcom/huawei/dnurse/sdk/DnurseDeviceTest$a;->b:Lcom/huawei/dnurse/sdk/DnurseDeviceTest;

    invoke-static {v0}, Lcom/huawei/dnurse/sdk/DnurseDeviceTest;->q(Lcom/huawei/dnurse/sdk/DnurseDeviceTest;)Z

    move-result v0

    if-eqz v0, :cond_4

    iget-object v0, p0, Lcom/huawei/dnurse/sdk/DnurseDeviceTest$a;->e:Landroid/media/AudioManager;

    const/4 v1, 0x3

    invoke-virtual {v0, v1}, Landroid/media/AudioManager;->getStreamVolume(I)I

    move-result v0

    if-eq v4, v0, :cond_1

    const-wide/16 v0, 0x3e8

    :try_start_0
    invoke-static {v0, v1}, Ljava/lang/Thread;->sleep(J)V
    :try_end_0
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v6

    invoke-virtual {v6}, Ljava/lang/InterruptedException;->printStackTrace()V

    :cond_1
    :goto_0
    mul-int/lit8 v0, v5, 0x2

    div-int/lit8 v0, v0, 0x3

    if-le v4, v0, :cond_2

    iget-object v0, p0, Lcom/huawei/dnurse/sdk/DnurseDeviceTest$a;->e:Landroid/media/AudioManager;

    const/4 v1, 0x3

    invoke-virtual {v0, v1}, Landroid/media/AudioManager;->getStreamVolume(I)I

    move-result v0

    if-eq v4, v0, :cond_2

    add-int/lit8 v4, v4, -0x1

    iget-object v0, p0, Lcom/huawei/dnurse/sdk/DnurseDeviceTest$a;->e:Landroid/media/AudioManager;

    const/4 v1, 0x3

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v4, v2}, Landroid/media/AudioManager;->setStreamVolume(III)V

    goto :goto_0

    :cond_2
    sget-object v0, Landroid/os/Build$VERSION;->RELEASE:Ljava/lang/String;

    const-string v1, "4.3"

    invoke-virtual {v0, v1}, Ljava/lang/String;->compareTo(Ljava/lang/String;)I

    move-result v0

    if-ltz v0, :cond_3

    if-ge v4, v5, :cond_3

    iget-object v0, p0, Lcom/huawei/dnurse/sdk/DnurseDeviceTest$a;->e:Landroid/media/AudioManager;

    const/4 v1, 0x3

    const/16 v2, 0x9

    invoke-virtual {v0, v1, v5, v2}, Landroid/media/AudioManager;->setStreamVolume(III)V

    :cond_3
    iget-object v0, p0, Lcom/huawei/dnurse/sdk/DnurseDeviceTest$a;->e:Landroid/media/AudioManager;

    const/4 v1, 0x3

    invoke-virtual {v0, v1}, Landroid/media/AudioManager;->getStreamVolume(I)I

    move-result v0

    if-eq v4, v0, :cond_4

    const/4 v0, 0x0

    return v0

    :cond_4
    const-string v0, "HWHealthSDK"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "AudPly: Vol change from "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, " to "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    if-ne v4, v5, :cond_5

    const/4 v0, 0x1

    goto :goto_1

    :cond_5
    const/4 v0, 0x0

    :goto_1
    iput-boolean v0, p0, Lcom/huawei/dnurse/sdk/DnurseDeviceTest$a;->a:Z

    iget-object v0, p0, Lcom/huawei/dnurse/sdk/DnurseDeviceTest$a;->g:[S

    iget-object v1, p0, Lcom/huawei/dnurse/sdk/DnurseDeviceTest$a;->b:Lcom/huawei/dnurse/sdk/DnurseDeviceTest;

    invoke-static {v1}, Lcom/huawei/dnurse/sdk/DnurseDeviceTest;->r(Lcom/huawei/dnurse/sdk/DnurseDeviceTest;)I

    move-result v1

    const/4 v2, 0x0

    invoke-direct {p0, v0, v1, v2}, Lcom/huawei/dnurse/sdk/DnurseDeviceTest$a;->a([SII)Z

    move-result v0

    return v0
.end method

.method public b()V
    .locals 4

    iget v0, p0, Lcom/huawei/dnurse/sdk/DnurseDeviceTest$a;->c:I

    const/4 v1, -0x1

    if-eq v0, v1, :cond_0

    iget-object v0, p0, Lcom/huawei/dnurse/sdk/DnurseDeviceTest$a;->e:Landroid/media/AudioManager;

    iget v1, p0, Lcom/huawei/dnurse/sdk/DnurseDeviceTest$a;->c:I

    const/4 v2, 0x3

    const/4 v3, 0x0

    invoke-virtual {v0, v2, v1, v3}, Landroid/media/AudioManager;->setStreamVolume(III)V

    const-string v0, "HWHealthSDK"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "AudPly: Vol change to "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget v2, p0, Lcom/huawei/dnurse/sdk/DnurseDeviceTest$a;->c:I

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    const/4 v0, -0x1

    iput v0, p0, Lcom/huawei/dnurse/sdk/DnurseDeviceTest$a;->c:I

    :cond_0
    return-void
.end method

.method public c()V
    .locals 3

    iget-object v0, p0, Lcom/huawei/dnurse/sdk/DnurseDeviceTest$a;->b:Lcom/huawei/dnurse/sdk/DnurseDeviceTest;

    invoke-static {v0}, Lcom/huawei/dnurse/sdk/DnurseDeviceTest;->s(Lcom/huawei/dnurse/sdk/DnurseDeviceTest;)I

    move-result v0

    add-int/lit8 v2, v0, 0x4

    iget-object v0, p0, Lcom/huawei/dnurse/sdk/DnurseDeviceTest$a;->b:Lcom/huawei/dnurse/sdk/DnurseDeviceTest;

    invoke-static {v0}, Lcom/huawei/dnurse/sdk/DnurseDeviceTest;->t(Lcom/huawei/dnurse/sdk/DnurseDeviceTest;)B

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    iget-object v0, p0, Lcom/huawei/dnurse/sdk/DnurseDeviceTest$a;->h:[S

    iget-object v1, p0, Lcom/huawei/dnurse/sdk/DnurseDeviceTest$a;->b:Lcom/huawei/dnurse/sdk/DnurseDeviceTest;

    invoke-static {v1}, Lcom/huawei/dnurse/sdk/DnurseDeviceTest;->u(Lcom/huawei/dnurse/sdk/DnurseDeviceTest;)I

    move-result v1

    invoke-direct {p0, v0, v1, v2}, Lcom/huawei/dnurse/sdk/DnurseDeviceTest$a;->a([SII)Z

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lcom/huawei/dnurse/sdk/DnurseDeviceTest$a;->g:[S

    iget-object v1, p0, Lcom/huawei/dnurse/sdk/DnurseDeviceTest$a;->b:Lcom/huawei/dnurse/sdk/DnurseDeviceTest;

    invoke-static {v1}, Lcom/huawei/dnurse/sdk/DnurseDeviceTest;->u(Lcom/huawei/dnurse/sdk/DnurseDeviceTest;)I

    move-result v1

    invoke-direct {p0, v0, v1, v2}, Lcom/huawei/dnurse/sdk/DnurseDeviceTest$a;->a([SII)Z

    :goto_0
    return-void
.end method

.method public d()V
    .locals 3

    iget-object v0, p0, Lcom/huawei/dnurse/sdk/DnurseDeviceTest$a;->g:[S

    iget-object v1, p0, Lcom/huawei/dnurse/sdk/DnurseDeviceTest$a;->b:Lcom/huawei/dnurse/sdk/DnurseDeviceTest;

    invoke-static {v1}, Lcom/huawei/dnurse/sdk/DnurseDeviceTest;->u(Lcom/huawei/dnurse/sdk/DnurseDeviceTest;)I

    move-result v1

    iget-object v2, p0, Lcom/huawei/dnurse/sdk/DnurseDeviceTest$a;->b:Lcom/huawei/dnurse/sdk/DnurseDeviceTest;

    invoke-static {v2}, Lcom/huawei/dnurse/sdk/DnurseDeviceTest;->s(Lcom/huawei/dnurse/sdk/DnurseDeviceTest;)I

    move-result v2

    invoke-direct {p0, v0, v1, v2}, Lcom/huawei/dnurse/sdk/DnurseDeviceTest$a;->a([SII)Z

    return-void
.end method

.method public e()V
    .locals 2

    iget-object v0, p0, Lcom/huawei/dnurse/sdk/DnurseDeviceTest$a;->f:Landroid/media/AudioTrack;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/huawei/dnurse/sdk/DnurseDeviceTest$a;->f:Landroid/media/AudioTrack;

    invoke-virtual {v0}, Landroid/media/AudioTrack;->flush()V

    iget-object v0, p0, Lcom/huawei/dnurse/sdk/DnurseDeviceTest$a;->f:Landroid/media/AudioTrack;

    invoke-virtual {v0}, Landroid/media/AudioTrack;->stop()V

    const-string v0, "HWHealthSDK"

    const-string v1, "AudPly: Stop playing!"

    invoke-static {v0, v1}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    :cond_0
    return-void
.end method
