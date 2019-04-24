.class public Lcom/huawei/nfc/carrera/logic/filedownload/unionpay/handler/RequestUnionpayInfoHandler;
.super Landroid/os/Handler;
.source "SourceFile"


# static fields
.field private static final DIC_NAME:Ljava/lang/String; = "Huawei_Watch_LEO"

.field private static final UNIONPAYINFO_FAILED:I = 0x65

.field private static final UNIONPAYINFO_REQUEST:I = 0x0

.field private static final UNIONPAYINFO_SUCCESS:I = 0x64


# instance fields
.field private infoCallBack:Lcom/huawei/nfc/carrera/logic/filedownload/unionpay/listener/UnionpayInfoCallback;

.field private final mContext:Landroid/content/Context;


# direct methods
.method public constructor <init>(Landroid/content/Context;Lcom/huawei/nfc/carrera/logic/filedownload/unionpay/listener/UnionpayInfoCallback;)V
    .locals 0

    .line 57
    invoke-direct {p0}, Landroid/os/Handler;-><init>()V

    .line 58
    iput-object p2, p0, Lcom/huawei/nfc/carrera/logic/filedownload/unionpay/handler/RequestUnionpayInfoHandler;->infoCallBack:Lcom/huawei/nfc/carrera/logic/filedownload/unionpay/listener/UnionpayInfoCallback;

    .line 59
    iput-object p1, p0, Lcom/huawei/nfc/carrera/logic/filedownload/unionpay/handler/RequestUnionpayInfoHandler;->mContext:Landroid/content/Context;

    .line 60
    return-void
.end method

.method static synthetic access$000(Lcom/huawei/nfc/carrera/logic/filedownload/unionpay/handler/RequestUnionpayInfoHandler;)Landroid/content/Context;
    .locals 1

    .line 27
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/filedownload/unionpay/handler/RequestUnionpayInfoHandler;->mContext:Landroid/content/Context;

    return-object v0
.end method

.method static synthetic access$100(Lcom/huawei/nfc/carrera/logic/filedownload/unionpay/handler/RequestUnionpayInfoHandler;Ljava/lang/String;)V
    .locals 0

    .line 27
    invoke-direct {p0, p1}, Lcom/huawei/nfc/carrera/logic/filedownload/unionpay/handler/RequestUnionpayInfoHandler;->sendSuccessMessage(Ljava/lang/String;)V

    return-void
.end method

.method static synthetic access$200(Lcom/huawei/nfc/carrera/logic/filedownload/unionpay/handler/RequestUnionpayInfoHandler;Ljava/lang/String;)V
    .locals 0

    .line 27
    invoke-direct {p0, p1}, Lcom/huawei/nfc/carrera/logic/filedownload/unionpay/handler/RequestUnionpayInfoHandler;->sendFailedMessage(Ljava/lang/String;)V

    return-void
.end method

.method private analysisResult(Ljava/lang/String;)Ljava/util/Map;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/lang/String;)Ljava/util/Map<Ljava/lang/String;Ljava/lang/String;>;"
        }
    .end annotation

    .line 98
    new-instance v3, Ljava/util/HashMap;

    invoke-direct {v3}, Ljava/util/HashMap;-><init>()V

    .line 102
    :try_start_0
    new-instance v4, Lorg/json/JSONObject;

    invoke-direct {v4, p1}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    .line 103
    const-string v0, "downloadUrl"

    invoke-virtual {v4, v0}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    .line 104
    const-string v0, "signature"

    invoke-virtual {v4, v0}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    .line 106
    const-string v0, "url"

    invoke-interface {v3, v0, v5}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 107
    const-string v0, "signature"

    invoke-interface {v3, v0, v6}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    .line 112
    goto :goto_0

    .line 109
    :catch_0
    move-exception v5

    .line 111
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/filedownload/unionpay/handler/RequestUnionpayInfoHandler;->infoCallBack:Lcom/huawei/nfc/carrera/logic/filedownload/unionpay/listener/UnionpayInfoCallback;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "result is not a JSON value \n"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    const/16 v2, 0x65

    invoke-interface {v0, v2, v1}, Lcom/huawei/nfc/carrera/logic/filedownload/unionpay/listener/UnionpayInfoCallback;->failed(ILjava/lang/String;)V

    .line 113
    :goto_0
    return-object v3
.end method

.method private getUnionpayAPKInfo()V
    .locals 1

    .line 150
    new-instance v0, Lcom/huawei/nfc/carrera/logic/filedownload/unionpay/handler/RequestUnionpayInfoHandler$1;

    invoke-direct {v0, p0}, Lcom/huawei/nfc/carrera/logic/filedownload/unionpay/handler/RequestUnionpayInfoHandler$1;-><init>(Lcom/huawei/nfc/carrera/logic/filedownload/unionpay/handler/RequestUnionpayInfoHandler;)V

    .line 181
    invoke-virtual {v0}, Lcom/huawei/nfc/carrera/logic/filedownload/unionpay/handler/RequestUnionpayInfoHandler$1;->start()V

    .line 182
    return-void
.end method

.method private sendFailedMessage(Ljava/lang/String;)V
    .locals 2

    .line 131
    const/16 v0, 0x65

    invoke-virtual {p0, v0}, Lcom/huawei/nfc/carrera/logic/filedownload/unionpay/handler/RequestUnionpayInfoHandler;->obtainMessage(I)Landroid/os/Message;

    move-result-object v1

    .line 132
    iput-object p1, v1, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 133
    const/16 v0, 0x65

    iput v0, v1, Landroid/os/Message;->arg1:I

    .line 134
    invoke-virtual {p0, v1}, Lcom/huawei/nfc/carrera/logic/filedownload/unionpay/handler/RequestUnionpayInfoHandler;->sendMessage(Landroid/os/Message;)Z

    .line 135
    return-void
.end method

.method private sendSuccessMessage(Ljava/lang/String;)V
    .locals 2

    .line 121
    const/16 v0, 0x64

    invoke-virtual {p0, v0}, Lcom/huawei/nfc/carrera/logic/filedownload/unionpay/handler/RequestUnionpayInfoHandler;->obtainMessage(I)Landroid/os/Message;

    move-result-object v1

    .line 122
    iput-object p1, v1, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 123
    invoke-virtual {p0, v1}, Lcom/huawei/nfc/carrera/logic/filedownload/unionpay/handler/RequestUnionpayInfoHandler;->sendMessage(Landroid/os/Message;)Z

    .line 124
    return-void
.end method


# virtual methods
.method public handleMessage(Landroid/os/Message;)V
    .locals 7

    .line 65
    invoke-super {p0, p1}, Landroid/os/Handler;->handleMessage(Landroid/os/Message;)V

    .line 66
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/filedownload/unionpay/handler/RequestUnionpayInfoHandler;->infoCallBack:Lcom/huawei/nfc/carrera/logic/filedownload/unionpay/listener/UnionpayInfoCallback;

    if-nez v0, :cond_0

    .line 68
    const-string v0, "requestUnionpayInfo callback is null \uff0cyou need excute registeListeners()  method  before download() method"

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->e(Ljava/lang/String;)V

    .line 69
    return-void

    .line 72
    :cond_0
    iget v0, p1, Landroid/os/Message;->what:I

    sparse-switch v0, :sswitch_data_0

    goto :goto_0

    .line 75
    :sswitch_0
    iget-object v0, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    move-object v3, v0

    check-cast v3, Ljava/lang/String;

    .line 76
    invoke-direct {p0, v3}, Lcom/huawei/nfc/carrera/logic/filedownload/unionpay/handler/RequestUnionpayInfoHandler;->analysisResult(Ljava/lang/String;)Ljava/util/Map;

    move-result-object v4

    .line 77
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/filedownload/unionpay/handler/RequestUnionpayInfoHandler;->infoCallBack:Lcom/huawei/nfc/carrera/logic/filedownload/unionpay/listener/UnionpayInfoCallback;

    const-string v1, "url"

    invoke-interface {v4, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    const-string v2, "signature"

    invoke-interface {v4, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    invoke-interface {v0, v1, v2}, Lcom/huawei/nfc/carrera/logic/filedownload/unionpay/listener/UnionpayInfoCallback;->success(Ljava/lang/String;Ljava/lang/String;)V

    .line 78
    goto :goto_0

    .line 81
    :sswitch_1
    iget v5, p1, Landroid/os/Message;->arg1:I

    .line 82
    iget-object v0, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    move-object v6, v0

    check-cast v6, Ljava/lang/String;

    .line 83
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/filedownload/unionpay/handler/RequestUnionpayInfoHandler;->infoCallBack:Lcom/huawei/nfc/carrera/logic/filedownload/unionpay/listener/UnionpayInfoCallback;

    invoke-interface {v0, v5, v6}, Lcom/huawei/nfc/carrera/logic/filedownload/unionpay/listener/UnionpayInfoCallback;->failed(ILjava/lang/String;)V

    .line 84
    goto :goto_0

    .line 86
    :sswitch_2
    invoke-direct {p0}, Lcom/huawei/nfc/carrera/logic/filedownload/unionpay/handler/RequestUnionpayInfoHandler;->getUnionpayAPKInfo()V

    .line 87
    .line 91
    :goto_0
    return-void

    nop

    :sswitch_data_0
    .sparse-switch
        0x0 -> :sswitch_2
        0x64 -> :sswitch_0
        0x65 -> :sswitch_1
    .end sparse-switch
.end method

.method public requestUnionpayInfo()V
    .locals 1

    .line 142
    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lcom/huawei/nfc/carrera/logic/filedownload/unionpay/handler/RequestUnionpayInfoHandler;->sendEmptyMessage(I)Z

    .line 143
    return-void
.end method

.method public unregisterListener()V
    .locals 1

    .line 189
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/nfc/carrera/logic/filedownload/unionpay/handler/RequestUnionpayInfoHandler;->infoCallBack:Lcom/huawei/nfc/carrera/logic/filedownload/unionpay/listener/UnionpayInfoCallback;

    .line 190
    return-void
.end method
