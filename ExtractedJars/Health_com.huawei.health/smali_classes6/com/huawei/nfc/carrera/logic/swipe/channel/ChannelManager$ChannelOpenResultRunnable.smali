.class Lcom/huawei/nfc/carrera/logic/swipe/channel/ChannelManager$ChannelOpenResultRunnable;
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
    name = "ChannelOpenResultRunnable"
.end annotation


# instance fields
.field private mCallback:Lcom/huawei/nfc/carrera/logic/swipe/channel/ChannelOpenCallback;

.field private mResult:Z


# direct methods
.method constructor <init>(Lcom/huawei/nfc/carrera/logic/swipe/channel/ChannelOpenCallback;Z)V
    .locals 0

    .line 243
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 244
    iput-object p1, p0, Lcom/huawei/nfc/carrera/logic/swipe/channel/ChannelManager$ChannelOpenResultRunnable;->mCallback:Lcom/huawei/nfc/carrera/logic/swipe/channel/ChannelOpenCallback;

    .line 245
    iput-boolean p2, p0, Lcom/huawei/nfc/carrera/logic/swipe/channel/ChannelManager$ChannelOpenResultRunnable;->mResult:Z

    .line 246
    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    .line 251
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/swipe/channel/ChannelManager$ChannelOpenResultRunnable;->mCallback:Lcom/huawei/nfc/carrera/logic/swipe/channel/ChannelOpenCallback;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 253
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/swipe/channel/ChannelManager$ChannelOpenResultRunnable;->mCallback:Lcom/huawei/nfc/carrera/logic/swipe/channel/ChannelOpenCallback;

    iget-boolean v1, p0, Lcom/huawei/nfc/carrera/logic/swipe/channel/ChannelManager$ChannelOpenResultRunnable;->mResult:Z

    invoke-interface {v0, v1}, Lcom/huawei/nfc/carrera/logic/swipe/channel/ChannelOpenCallback;->openChannelResult(Z)V

    .line 255
    :cond_0
    return-void
.end method
