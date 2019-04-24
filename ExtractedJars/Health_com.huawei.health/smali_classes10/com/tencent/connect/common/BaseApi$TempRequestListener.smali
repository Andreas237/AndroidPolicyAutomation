.class public Lcom/tencent/connect/common/BaseApi$TempRequestListener;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/tencent/tauth/IRequestListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/tencent/connect/common/BaseApi;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "TempRequestListener"
.end annotation


# instance fields
.field private final mHandler:Landroid/os/Handler;

.field private final mListener:Lcom/tencent/tauth/IUiListener;

.field final synthetic this$0:Lcom/tencent/connect/common/BaseApi;


# direct methods
.method public constructor <init>(Lcom/tencent/connect/common/BaseApi;Lcom/tencent/tauth/IUiListener;)V
    .locals 2

    .line 420
    iput-object p1, p0, Lcom/tencent/connect/common/BaseApi$TempRequestListener;->this$0:Lcom/tencent/connect/common/BaseApi;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 421
    iput-object p2, p0, Lcom/tencent/connect/common/BaseApi$TempRequestListener;->mListener:Lcom/tencent/tauth/IUiListener;

    .line 422
    new-instance v0, Lcom/tencent/connect/common/BaseApi$TempRequestListener$1;

    invoke-static {}, Lcom/tencent/open/utils/Global;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-virtual {v1}, Landroid/content/Context;->getMainLooper()Landroid/os/Looper;

    move-result-object v1

    invoke-direct {v0, p0, v1, p1}, Lcom/tencent/connect/common/BaseApi$TempRequestListener$1;-><init>(Lcom/tencent/connect/common/BaseApi$TempRequestListener;Landroid/os/Looper;Lcom/tencent/connect/common/BaseApi;)V

    iput-object v0, p0, Lcom/tencent/connect/common/BaseApi$TempRequestListener;->mHandler:Landroid/os/Handler;

    .line 432
    return-void
.end method

.method static synthetic access$000(Lcom/tencent/connect/common/BaseApi$TempRequestListener;)Lcom/tencent/tauth/IUiListener;
    .locals 1

    .line 417
    iget-object v0, p0, Lcom/tencent/connect/common/BaseApi$TempRequestListener;->mListener:Lcom/tencent/tauth/IUiListener;

    return-object v0
.end method


# virtual methods
.method public onComplete(Lorg/json/JSONObject;)V
    .locals 2

    .line 436
    iget-object v0, p0, Lcom/tencent/connect/common/BaseApi$TempRequestListener;->mHandler:Landroid/os/Handler;

    invoke-virtual {v0}, Landroid/os/Handler;->obtainMessage()Landroid/os/Message;

    move-result-object v1

    .line 437
    iput-object p1, v1, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 438
    const/4 v0, 0x0

    iput v0, v1, Landroid/os/Message;->what:I

    .line 439
    iget-object v0, p0, Lcom/tencent/connect/common/BaseApi$TempRequestListener;->mHandler:Landroid/os/Handler;

    invoke-virtual {v0, v1}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    .line 440
    return-void
.end method

.method public onConnectTimeoutException(Lorg/apache/http/conn/ConnectTimeoutException;)V
    .locals 2

    .line 468
    iget-object v0, p0, Lcom/tencent/connect/common/BaseApi$TempRequestListener;->mHandler:Landroid/os/Handler;

    invoke-virtual {v0}, Landroid/os/Handler;->obtainMessage()Landroid/os/Message;

    move-result-object v1

    .line 469
    invoke-virtual {p1}, Lorg/apache/http/conn/ConnectTimeoutException;->getMessage()Ljava/lang/String;

    move-result-object v0

    iput-object v0, v1, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 470
    const/4 v0, -0x7

    iput v0, v1, Landroid/os/Message;->what:I

    .line 471
    iget-object v0, p0, Lcom/tencent/connect/common/BaseApi$TempRequestListener;->mHandler:Landroid/os/Handler;

    invoke-virtual {v0, v1}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    .line 472
    return-void
.end method

.method public onHttpStatusException(Lcom/tencent/open/utils/HttpUtils$HttpStatusException;)V
    .locals 2

    .line 492
    iget-object v0, p0, Lcom/tencent/connect/common/BaseApi$TempRequestListener;->mHandler:Landroid/os/Handler;

    invoke-virtual {v0}, Landroid/os/Handler;->obtainMessage()Landroid/os/Message;

    move-result-object v1

    .line 493
    invoke-virtual {p1}, Lcom/tencent/open/utils/HttpUtils$HttpStatusException;->getMessage()Ljava/lang/String;

    move-result-object v0

    iput-object v0, v1, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 494
    const/16 v0, -0x9

    iput v0, v1, Landroid/os/Message;->what:I

    .line 495
    iget-object v0, p0, Lcom/tencent/connect/common/BaseApi$TempRequestListener;->mHandler:Landroid/os/Handler;

    invoke-virtual {v0, v1}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    .line 496
    return-void
.end method

.method public onIOException(Ljava/io/IOException;)V
    .locals 2

    .line 444
    iget-object v0, p0, Lcom/tencent/connect/common/BaseApi$TempRequestListener;->mHandler:Landroid/os/Handler;

    invoke-virtual {v0}, Landroid/os/Handler;->obtainMessage()Landroid/os/Message;

    move-result-object v1

    .line 445
    invoke-virtual {p1}, Ljava/io/IOException;->getMessage()Ljava/lang/String;

    move-result-object v0

    iput-object v0, v1, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 446
    const/4 v0, -0x2

    iput v0, v1, Landroid/os/Message;->what:I

    .line 447
    iget-object v0, p0, Lcom/tencent/connect/common/BaseApi$TempRequestListener;->mHandler:Landroid/os/Handler;

    invoke-virtual {v0, v1}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    .line 448
    return-void
.end method

.method public onJSONException(Lorg/json/JSONException;)V
    .locals 2

    .line 460
    iget-object v0, p0, Lcom/tencent/connect/common/BaseApi$TempRequestListener;->mHandler:Landroid/os/Handler;

    invoke-virtual {v0}, Landroid/os/Handler;->obtainMessage()Landroid/os/Message;

    move-result-object v1

    .line 461
    invoke-virtual {p1}, Lorg/json/JSONException;->getMessage()Ljava/lang/String;

    move-result-object v0

    iput-object v0, v1, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 462
    const/4 v0, -0x4

    iput v0, v1, Landroid/os/Message;->what:I

    .line 463
    iget-object v0, p0, Lcom/tencent/connect/common/BaseApi$TempRequestListener;->mHandler:Landroid/os/Handler;

    invoke-virtual {v0, v1}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    .line 464
    return-void
.end method

.method public onMalformedURLException(Ljava/net/MalformedURLException;)V
    .locals 2

    .line 452
    iget-object v0, p0, Lcom/tencent/connect/common/BaseApi$TempRequestListener;->mHandler:Landroid/os/Handler;

    invoke-virtual {v0}, Landroid/os/Handler;->obtainMessage()Landroid/os/Message;

    move-result-object v1

    .line 453
    invoke-virtual {p1}, Ljava/net/MalformedURLException;->getMessage()Ljava/lang/String;

    move-result-object v0

    iput-object v0, v1, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 454
    const/4 v0, -0x3

    iput v0, v1, Landroid/os/Message;->what:I

    .line 455
    iget-object v0, p0, Lcom/tencent/connect/common/BaseApi$TempRequestListener;->mHandler:Landroid/os/Handler;

    invoke-virtual {v0, v1}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    .line 456
    return-void
.end method

.method public onNetworkUnavailableException(Lcom/tencent/open/utils/HttpUtils$NetworkUnavailableException;)V
    .locals 2

    .line 484
    iget-object v0, p0, Lcom/tencent/connect/common/BaseApi$TempRequestListener;->mHandler:Landroid/os/Handler;

    invoke-virtual {v0}, Landroid/os/Handler;->obtainMessage()Landroid/os/Message;

    move-result-object v1

    .line 485
    invoke-virtual {p1}, Lcom/tencent/open/utils/HttpUtils$NetworkUnavailableException;->getMessage()Ljava/lang/String;

    move-result-object v0

    iput-object v0, v1, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 486
    const/16 v0, -0xa

    iput v0, v1, Landroid/os/Message;->what:I

    .line 487
    iget-object v0, p0, Lcom/tencent/connect/common/BaseApi$TempRequestListener;->mHandler:Landroid/os/Handler;

    invoke-virtual {v0, v1}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    .line 488
    return-void
.end method

.method public onSocketTimeoutException(Ljava/net/SocketTimeoutException;)V
    .locals 2

    .line 476
    iget-object v0, p0, Lcom/tencent/connect/common/BaseApi$TempRequestListener;->mHandler:Landroid/os/Handler;

    invoke-virtual {v0}, Landroid/os/Handler;->obtainMessage()Landroid/os/Message;

    move-result-object v1

    .line 477
    invoke-virtual {p1}, Ljava/net/SocketTimeoutException;->getMessage()Ljava/lang/String;

    move-result-object v0

    iput-object v0, v1, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 478
    const/4 v0, -0x8

    iput v0, v1, Landroid/os/Message;->what:I

    .line 479
    iget-object v0, p0, Lcom/tencent/connect/common/BaseApi$TempRequestListener;->mHandler:Landroid/os/Handler;

    invoke-virtual {v0, v1}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    .line 480
    return-void
.end method

.method public onUnknowException(Ljava/lang/Exception;)V
    .locals 2

    .line 500
    iget-object v0, p0, Lcom/tencent/connect/common/BaseApi$TempRequestListener;->mHandler:Landroid/os/Handler;

    invoke-virtual {v0}, Landroid/os/Handler;->obtainMessage()Landroid/os/Message;

    move-result-object v1

    .line 501
    invoke-virtual {p1}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object v0

    iput-object v0, v1, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 502
    const/4 v0, -0x6

    iput v0, v1, Landroid/os/Message;->what:I

    .line 503
    iget-object v0, p0, Lcom/tencent/connect/common/BaseApi$TempRequestListener;->mHandler:Landroid/os/Handler;

    invoke-virtual {v0, v1}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    .line 504
    return-void
.end method
