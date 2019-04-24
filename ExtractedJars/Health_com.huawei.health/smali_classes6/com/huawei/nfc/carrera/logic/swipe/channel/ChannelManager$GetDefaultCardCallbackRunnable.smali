.class Lcom/huawei/nfc/carrera/logic/swipe/channel/ChannelManager$GetDefaultCardCallbackRunnable;
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
    name = "GetDefaultCardCallbackRunnable"
.end annotation


# instance fields
.field private mCallback:Lcom/huawei/nfc/carrera/logic/swipe/channel/GetDefaultCardCallback;

.field private mDefaultCard:Lcom/huawei/nfc/carrera/logic/ta/TACardInfo;


# direct methods
.method constructor <init>(Lcom/huawei/nfc/carrera/logic/swipe/channel/GetDefaultCardCallback;Lcom/huawei/nfc/carrera/logic/ta/TACardInfo;)V
    .locals 0

    .line 346
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 347
    iput-object p1, p0, Lcom/huawei/nfc/carrera/logic/swipe/channel/ChannelManager$GetDefaultCardCallbackRunnable;->mCallback:Lcom/huawei/nfc/carrera/logic/swipe/channel/GetDefaultCardCallback;

    .line 348
    iput-object p2, p0, Lcom/huawei/nfc/carrera/logic/swipe/channel/ChannelManager$GetDefaultCardCallbackRunnable;->mDefaultCard:Lcom/huawei/nfc/carrera/logic/ta/TACardInfo;

    .line 349
    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    .line 354
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/swipe/channel/ChannelManager$GetDefaultCardCallbackRunnable;->mCallback:Lcom/huawei/nfc/carrera/logic/swipe/channel/GetDefaultCardCallback;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 356
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/swipe/channel/ChannelManager$GetDefaultCardCallbackRunnable;->mCallback:Lcom/huawei/nfc/carrera/logic/swipe/channel/GetDefaultCardCallback;

    iget-object v1, p0, Lcom/huawei/nfc/carrera/logic/swipe/channel/ChannelManager$GetDefaultCardCallbackRunnable;->mDefaultCard:Lcom/huawei/nfc/carrera/logic/ta/TACardInfo;

    invoke-interface {v0, v1}, Lcom/huawei/nfc/carrera/logic/swipe/channel/GetDefaultCardCallback;->getDefaultCardCallback(Lcom/huawei/nfc/carrera/logic/ta/TACardInfo;)V

    .line 358
    :cond_0
    return-void
.end method
