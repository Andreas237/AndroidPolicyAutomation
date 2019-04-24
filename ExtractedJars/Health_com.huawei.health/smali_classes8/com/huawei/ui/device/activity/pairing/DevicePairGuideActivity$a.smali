.class Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity$a;
.super Lo/djp$b;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "a"
.end annotation


# instance fields
.field private c:Landroid/os/Handler;


# direct methods
.method constructor <init>(Landroid/os/Handler;)V
    .locals 0

    .line 1506
    invoke-direct {p0}, Lo/djp$b;-><init>()V

    .line 1508
    iput-object p1, p0, Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity$a;->c:Landroid/os/Handler;

    .line 1509
    return-void
.end method


# virtual methods
.method public a(I)V
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    .line 1514
    iget-object v0, p0, Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity$a;->c:Landroid/os/Handler;

    const/4 v1, 0x0

    if-ne v1, v0, :cond_0

    .line 1515
    return-void

    .line 1517
    :cond_0
    iget-object v0, p0, Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity$a;->c:Landroid/os/Handler;

    invoke-virtual {v0}, Landroid/os/Handler;->obtainMessage()Landroid/os/Message;

    move-result-object v2

    .line 1518
    const/16 v0, 0x8

    iput v0, v2, Landroid/os/Message;->what:I

    .line 1519
    iput p1, v2, Landroid/os/Message;->arg1:I

    .line 1520
    iget-object v0, p0, Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity$a;->c:Landroid/os/Handler;

    invoke-virtual {v0, v2}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    .line 1521
    return-void
.end method
