.class Lcom/huawei/nfc/carrera/logic/swipe/channel/ChannelManager$ChannelCloseResultRunnable;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/nfc/carrera/logic/swipe/channel/ChannelManager;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "ChannelCloseResultRunnable"
.end annotation


# instance fields
.field private mCallback:Lcom/huawei/nfc/carrera/logic/swipe/channel/ChannelCloseCallback;

.field private mResult:Z


# direct methods
.method constructor <init>(Lcom/huawei/nfc/carrera/logic/swipe/channel/ChannelCloseCallback;Z)V
    .locals 0

    .line 290
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 291
    iput-object p1, p0, Lcom/huawei/nfc/carrera/logic/swipe/channel/ChannelManager$ChannelCloseResultRunnable;->mCallback:Lcom/huawei/nfc/carrera/logic/swipe/channel/ChannelCloseCallback;

    .line 292
    iput-boolean p2, p0, Lcom/huawei/nfc/carrera/logic/swipe/channel/ChannelManager$ChannelCloseResultRunnable;->mResult:Z

    .line 293
    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    .line 298
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/swipe/channel/ChannelManager$ChannelCloseResultRunnable;->mCallback:Lcom/huawei/nfc/carrera/logic/swipe/channel/ChannelCloseCallback;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 300
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/swipe/channel/ChannelManager$ChannelCloseResultRunnable;->mCallback:Lcom/huawei/nfc/carrera/logic/swipe/channel/ChannelCloseCallback;

    iget-boolean v1, p0, Lcom/huawei/nfc/carrera/logic/swipe/channel/ChannelManager$ChannelCloseResultRunnable;->mResult:Z

    invoke-interface {v0, v1}, Lcom/huawei/nfc/carrera/logic/swipe/channel/ChannelCloseCallback;->closeChannelResult(Z)V

    .line 302
    :cond_0
    return-void
.end method
