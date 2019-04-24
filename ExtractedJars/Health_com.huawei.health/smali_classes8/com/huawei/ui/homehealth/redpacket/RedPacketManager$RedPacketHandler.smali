.class Lcom/huawei/ui/homehealth/redpacket/RedPacketManager$RedPacketHandler;
.super Landroid/os/Handler;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/ui/homehealth/redpacket/RedPacketManager;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "RedPacketHandler"
.end annotation


# instance fields
.field private mReference:Ljava/lang/ref/WeakReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ref/WeakReference<Lcom/huawei/ui/homehealth/redpacket/RedPacketManager;>;"
        }
    .end annotation
.end field

.field private mShake:Landroid/view/animation/Animation;


# direct methods
.method private constructor <init>(Lcom/huawei/ui/homehealth/redpacket/RedPacketManager;)V
    .locals 7

    .line 416
    invoke-direct {p0}, Landroid/os/Handler;-><init>()V

    .line 417
    new-instance v0, Ljava/lang/ref/WeakReference;

    invoke-direct {v0, p1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object v0, p0, Lcom/huawei/ui/homehealth/redpacket/RedPacketManager$RedPacketHandler;->mReference:Ljava/lang/ref/WeakReference;

    .line 418
    new-instance v0, Landroid/view/animation/RotateAnimation;

    const/high16 v1, -0x3fc00000    # -3.0f

    const/high16 v2, 0x40400000    # 3.0f

    const/4 v3, 0x1

    const/high16 v4, 0x3f000000    # 0.5f

    const/4 v5, 0x1

    const v6, 0x3f666666    # 0.9f

    invoke-direct/range {v0 .. v6}, Landroid/view/animation/RotateAnimation;-><init>(FFIFIF)V

    iput-object v0, p0, Lcom/huawei/ui/homehealth/redpacket/RedPacketManager$RedPacketHandler;->mShake:Landroid/view/animation/Animation;

    .line 420
    iget-object v0, p0, Lcom/huawei/ui/homehealth/redpacket/RedPacketManager$RedPacketHandler;->mShake:Landroid/view/animation/Animation;

    const-wide/16 v1, 0x32

    invoke-virtual {v0, v1, v2}, Landroid/view/animation/Animation;->setDuration(J)V

    .line 421
    iget-object v0, p0, Lcom/huawei/ui/homehealth/redpacket/RedPacketManager$RedPacketHandler;->mShake:Landroid/view/animation/Animation;

    const/4 v1, 0x2

    invoke-virtual {v0, v1}, Landroid/view/animation/Animation;->setRepeatMode(I)V

    .line 422
    iget-object v0, p0, Lcom/huawei/ui/homehealth/redpacket/RedPacketManager$RedPacketHandler;->mShake:Landroid/view/animation/Animation;

    const/4 v1, 0x5

    invoke-virtual {v0, v1}, Landroid/view/animation/Animation;->setRepeatCount(I)V

    .line 423
    return-void
.end method

.method synthetic constructor <init>(Lcom/huawei/ui/homehealth/redpacket/RedPacketManager;Lcom/huawei/ui/homehealth/redpacket/RedPacketManager$1;)V
    .locals 0

    .line 411
    invoke-direct {p0, p1}, Lcom/huawei/ui/homehealth/redpacket/RedPacketManager$RedPacketHandler;-><init>(Lcom/huawei/ui/homehealth/redpacket/RedPacketManager;)V

    return-void
.end method


# virtual methods
.method public handleMessage(Landroid/os/Message;)V
    .locals 3

    .line 427
    invoke-super {p0, p1}, Landroid/os/Handler;->handleMessage(Landroid/os/Message;)V

    .line 428
    iget-object v0, p0, Lcom/huawei/ui/homehealth/redpacket/RedPacketManager$RedPacketHandler;->mReference:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Lcom/huawei/ui/homehealth/redpacket/RedPacketManager;

    .line 429
    iget v0, p1, Landroid/os/Message;->what:I

    sparse-switch v0, :sswitch_data_0

    goto :goto_0

    .line 431
    :sswitch_0
    if-eqz v2, :cond_1

    invoke-static {v2}, Lcom/huawei/ui/homehealth/redpacket/RedPacketManager;->access$900(Lcom/huawei/ui/homehealth/redpacket/RedPacketManager;)Landroid/widget/ImageView;

    move-result-object v0

    if-eqz v0, :cond_1

    .line 432
    invoke-static {v2}, Lcom/huawei/ui/homehealth/redpacket/RedPacketManager;->access$900(Lcom/huawei/ui/homehealth/redpacket/RedPacketManager;)Landroid/widget/ImageView;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/ui/homehealth/redpacket/RedPacketManager$RedPacketHandler;->mShake:Landroid/view/animation/Animation;

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->startAnimation(Landroid/view/animation/Animation;)V

    goto :goto_0

    .line 436
    :sswitch_1
    if-eqz v2, :cond_0

    invoke-static {v2}, Lcom/huawei/ui/homehealth/redpacket/RedPacketManager;->access$900(Lcom/huawei/ui/homehealth/redpacket/RedPacketManager;)Landroid/widget/ImageView;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 437
    invoke-static {v2}, Lcom/huawei/ui/homehealth/redpacket/RedPacketManager;->access$900(Lcom/huawei/ui/homehealth/redpacket/RedPacketManager;)Landroid/widget/ImageView;

    move-result-object v0

    invoke-virtual {v0}, Landroid/widget/ImageView;->clearAnimation()V

    .line 439
    :cond_0
    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Lcom/huawei/ui/homehealth/redpacket/RedPacketManager$RedPacketHandler;->removeMessages(I)V

    .line 440
    .line 444
    :cond_1
    :goto_0
    return-void

    :sswitch_data_0
    .sparse-switch
        0x1 -> :sswitch_0
        0x2 -> :sswitch_1
    .end sparse-switch
.end method
