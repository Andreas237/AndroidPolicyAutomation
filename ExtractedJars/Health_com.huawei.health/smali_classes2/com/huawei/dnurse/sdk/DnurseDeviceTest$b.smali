.class Lcom/huawei/dnurse/sdk/DnurseDeviceTest$b;
.super Ljava/lang/Object;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/dnurse/sdk/DnurseDeviceTest;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = "b"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/huawei/dnurse/sdk/DnurseDeviceTest$b$a;
    }
.end annotation


# instance fields
.field final synthetic a:Lcom/huawei/dnurse/sdk/DnurseDeviceTest;

.field private b:Landroid/media/AudioRecord;

.field private c:I

.field private d:S


# direct methods
.method public constructor <init>(Lcom/huawei/dnurse/sdk/DnurseDeviceTest;)V
    .locals 4

    iput-object p1, p0, Lcom/huawei/dnurse/sdk/DnurseDeviceTest$b;->a:Lcom/huawei/dnurse/sdk/DnurseDeviceTest;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    iput-short v0, p0, Lcom/huawei/dnurse/sdk/DnurseDeviceTest$b;->d:S

    const v0, 0xac44

    const/16 v1, 0x10

    const/4 v2, 0x2

    invoke-static {v0, v1, v2}, Landroid/media/AudioRecord;->getMinBufferSize(III)I

    move-result v3

    const-string v0, "HWHealthSDK"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "AudRec: min buffer="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    if-gez v3, :cond_0

    const-string v0, "HWHealthSDK"

    const-string v1, "AudRec: Error to get min buffer!"

    invoke-static {v0, v1}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    const/4 v0, 0x0

    iput v0, p0, Lcom/huawei/dnurse/sdk/DnurseDeviceTest$b;->c:I

    return-void

    :cond_0
    const/16 v0, 0x4000

    iput v0, p0, Lcom/huawei/dnurse/sdk/DnurseDeviceTest$b;->c:I

    iget v0, p0, Lcom/huawei/dnurse/sdk/DnurseDeviceTest$b;->c:I

    if-ge v0, v3, :cond_1

    mul-int/lit8 v0, v3, 0x8

    add-int/lit8 v0, v0, 0x7

    div-int/lit8 v0, v0, 0x8

    iput v0, p0, Lcom/huawei/dnurse/sdk/DnurseDeviceTest$b;->c:I

    :cond_1
    return-void
.end method

.method static synthetic a(Lcom/huawei/dnurse/sdk/DnurseDeviceTest$b;Landroid/media/AudioRecord;)Landroid/media/AudioRecord;
    .locals 0

    iput-object p1, p0, Lcom/huawei/dnurse/sdk/DnurseDeviceTest$b;->b:Landroid/media/AudioRecord;

    return-object p1
.end method

.method static synthetic a(Lcom/huawei/dnurse/sdk/DnurseDeviceTest$b;S)S
    .locals 0

    iput-short p1, p0, Lcom/huawei/dnurse/sdk/DnurseDeviceTest$b;->d:S

    return p1
.end method

.method static synthetic a(Lcom/huawei/dnurse/sdk/DnurseDeviceTest$b;)V
    .locals 0

    invoke-direct {p0}, Lcom/huawei/dnurse/sdk/DnurseDeviceTest$b;->d()V

    return-void
.end method

.method static synthetic b(Lcom/huawei/dnurse/sdk/DnurseDeviceTest$b;)Landroid/media/AudioRecord;
    .locals 1

    iget-object v0, p0, Lcom/huawei/dnurse/sdk/DnurseDeviceTest$b;->b:Landroid/media/AudioRecord;

    return-object v0
.end method

.method static synthetic c(Lcom/huawei/dnurse/sdk/DnurseDeviceTest$b;)S
    .locals 1

    iget-short v0, p0, Lcom/huawei/dnurse/sdk/DnurseDeviceTest$b;->d:S

    return v0
.end method

.method private d()V
    .locals 2

    iget-object v0, p0, Lcom/huawei/dnurse/sdk/DnurseDeviceTest$b;->b:Landroid/media/AudioRecord;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/huawei/dnurse/sdk/DnurseDeviceTest$b;->b:Landroid/media/AudioRecord;

    invoke-virtual {v0}, Landroid/media/AudioRecord;->getRecordingState()I

    move-result v0

    const/4 v1, 0x3

    if-ne v0, v1, :cond_0

    const-string v0, "HWHealthSDK"

    const-string v1, "AudRec: stopped"

    invoke-static {v0, v1}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    iget-object v0, p0, Lcom/huawei/dnurse/sdk/DnurseDeviceTest$b;->b:Landroid/media/AudioRecord;

    invoke-virtual {v0}, Landroid/media/AudioRecord;->stop()V

    :cond_0
    return-void
.end method


# virtual methods
.method public a()Ljava/lang/Boolean;
    .locals 1

    iget-object v0, p0, Lcom/huawei/dnurse/sdk/DnurseDeviceTest$b;->b:Landroid/media/AudioRecord;

    if-nez v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    return-object v0
.end method

.method public b()Z
    .locals 1

    iget-short v0, p0, Lcom/huawei/dnurse/sdk/DnurseDeviceTest$b;->d:S

    if-nez v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public c()Ljava/lang/Boolean;
    .locals 6

    iget v0, p0, Lcom/huawei/dnurse/sdk/DnurseDeviceTest$b;->c:I

    if-gtz v0, :cond_0

    const/4 v0, 0x0

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    return-object v0

    :cond_0
    new-instance v0, Landroid/media/AudioRecord;

    iget v5, p0, Lcom/huawei/dnurse/sdk/DnurseDeviceTest$b;->c:I

    const/4 v1, 0x1

    const v2, 0xac44

    const/16 v3, 0x10

    const/4 v4, 0x2

    invoke-direct/range {v0 .. v5}, Landroid/media/AudioRecord;-><init>(IIIII)V

    iput-object v0, p0, Lcom/huawei/dnurse/sdk/DnurseDeviceTest$b;->b:Landroid/media/AudioRecord;

    iget-object v0, p0, Lcom/huawei/dnurse/sdk/DnurseDeviceTest$b;->b:Landroid/media/AudioRecord;

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/huawei/dnurse/sdk/DnurseDeviceTest$b;->b:Landroid/media/AudioRecord;

    invoke-virtual {v0}, Landroid/media/AudioRecord;->getState()I

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_1

    iget-object v0, p0, Lcom/huawei/dnurse/sdk/DnurseDeviceTest$b;->b:Landroid/media/AudioRecord;

    invoke-virtual {v0}, Landroid/media/AudioRecord;->startRecording()V

    new-instance v0, Ljava/lang/Thread;

    new-instance v1, Lcom/huawei/dnurse/sdk/DnurseDeviceTest$b$a;

    iget v2, p0, Lcom/huawei/dnurse/sdk/DnurseDeviceTest$b;->c:I

    div-int/lit8 v2, v2, 0x2

    invoke-direct {v1, p0, v2}, Lcom/huawei/dnurse/sdk/DnurseDeviceTest$b$a;-><init>(Lcom/huawei/dnurse/sdk/DnurseDeviceTest$b;I)V

    invoke-direct {v0, v1}, Ljava/lang/Thread;-><init>(Ljava/lang/Runnable;)V

    invoke-virtual {v0}, Ljava/lang/Thread;->start()V

    const-string v0, "HWHealthSDK"

    const-string v1, "AudRec: Recording started!"

    invoke-static {v0, v1}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    const/4 v0, 0x1

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    return-object v0

    :cond_1
    const-string v0, "HWHealthSDK"

    const-string v1, "AudRec: Create failed!"

    invoke-static {v0, v1}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    iget-object v0, p0, Lcom/huawei/dnurse/sdk/DnurseDeviceTest$b;->b:Landroid/media/AudioRecord;

    if-eqz v0, :cond_2

    const-string v0, "HWHealthSDK"

    const-string v1, "AudRec: released"

    invoke-static {v0, v1}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    iget-object v0, p0, Lcom/huawei/dnurse/sdk/DnurseDeviceTest$b;->b:Landroid/media/AudioRecord;

    invoke-virtual {v0}, Landroid/media/AudioRecord;->release()V

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/dnurse/sdk/DnurseDeviceTest$b;->b:Landroid/media/AudioRecord;

    :cond_2
    const/4 v0, 0x0

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    return-object v0
.end method
