.class public Lcom/huawei/nfc/carrera/logic/filedownload/unionpay/handler/UnionpayDownLoadHandler;
.super Landroid/os/Handler;
.source "SourceFile"


# static fields
.field public static final DOWNLOAD_CANCEL:I = 0x5

.field private static final DOWNLOAD_CONNECTED:I = 0x6

.field private static final DOWNLOAD_FAILED:I = 0x2

.field private static final DOWNLOAD_PROGRESS:I = 0x3

.field private static final DOWNLOAD_REQUEST:I = 0x4

.field private static final DOWNLOAD_SUCCESS:I = 0x1


# instance fields
.field private downLoadCallback:Lcom/huawei/nfc/carrera/logic/filedownload/unionpay/listener/DownLoadCallback;

.field fileDownloadApi:Lcom/huawei/nfc/carrera/server/download/impl/FileDownloadImpl;

.field private filePath:Ljava/lang/String;

.field private final mContext:Landroid/content/Context;


# direct methods
.method public constructor <init>(Landroid/content/Context;Lcom/huawei/nfc/carrera/logic/filedownload/unionpay/listener/DownLoadCallback;)V
    .locals 2

    .line 72
    invoke-direct {p0}, Landroid/os/Handler;-><init>()V

    .line 73
    iput-object p2, p0, Lcom/huawei/nfc/carrera/logic/filedownload/unionpay/handler/UnionpayDownLoadHandler;->downLoadCallback:Lcom/huawei/nfc/carrera/logic/filedownload/unionpay/listener/DownLoadCallback;

    .line 74
    iput-object p1, p0, Lcom/huawei/nfc/carrera/logic/filedownload/unionpay/handler/UnionpayDownLoadHandler;->mContext:Landroid/content/Context;

    .line 75
    new-instance v0, Lcom/huawei/nfc/carrera/server/download/impl/FileDownloadImpl;

    iget-object v1, p0, Lcom/huawei/nfc/carrera/logic/filedownload/unionpay/handler/UnionpayDownLoadHandler;->mContext:Landroid/content/Context;

    invoke-direct {v0, v1}, Lcom/huawei/nfc/carrera/server/download/impl/FileDownloadImpl;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Lcom/huawei/nfc/carrera/logic/filedownload/unionpay/handler/UnionpayDownLoadHandler;->fileDownloadApi:Lcom/huawei/nfc/carrera/server/download/impl/FileDownloadImpl;

    .line 76
    return-void
.end method

.method static synthetic access$000(Lcom/huawei/nfc/carrera/logic/filedownload/unionpay/handler/UnionpayDownLoadHandler;)Ljava/lang/String;
    .locals 1

    .line 24
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/filedownload/unionpay/handler/UnionpayDownLoadHandler;->filePath:Ljava/lang/String;

    return-object v0
.end method

.method static synthetic access$002(Lcom/huawei/nfc/carrera/logic/filedownload/unionpay/handler/UnionpayDownLoadHandler;Ljava/lang/String;)Ljava/lang/String;
    .locals 0

    .line 24
    iput-object p1, p0, Lcom/huawei/nfc/carrera/logic/filedownload/unionpay/handler/UnionpayDownLoadHandler;->filePath:Ljava/lang/String;

    return-object p1
.end method

.method static synthetic access$100(Lcom/huawei/nfc/carrera/logic/filedownload/unionpay/handler/UnionpayDownLoadHandler;IJ)V
    .locals 0

    .line 24
    invoke-direct {p0, p1, p2, p3}, Lcom/huawei/nfc/carrera/logic/filedownload/unionpay/handler/UnionpayDownLoadHandler;->sendProgressMessage(IJ)V

    return-void
.end method

.method static synthetic access$200(Lcom/huawei/nfc/carrera/logic/filedownload/unionpay/handler/UnionpayDownLoadHandler;J)V
    .locals 0

    .line 24
    invoke-direct {p0, p1, p2}, Lcom/huawei/nfc/carrera/logic/filedownload/unionpay/handler/UnionpayDownLoadHandler;->sendConnectedMessage(J)V

    return-void
.end method

.method static synthetic access$300(Lcom/huawei/nfc/carrera/logic/filedownload/unionpay/handler/UnionpayDownLoadHandler;Ljava/lang/String;)V
    .locals 0

    .line 24
    invoke-direct {p0, p1}, Lcom/huawei/nfc/carrera/logic/filedownload/unionpay/handler/UnionpayDownLoadHandler;->sendSuccessMessage(Ljava/lang/String;)V

    return-void
.end method

.method static synthetic access$400(Lcom/huawei/nfc/carrera/logic/filedownload/unionpay/handler/UnionpayDownLoadHandler;I)V
    .locals 0

    .line 24
    invoke-direct {p0, p1}, Lcom/huawei/nfc/carrera/logic/filedownload/unionpay/handler/UnionpayDownLoadHandler;->sendFailedMessage(I)V

    return-void
.end method

.method private downLoad(Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    .line 180
    new-instance v0, Lcom/huawei/nfc/carrera/logic/filedownload/unionpay/handler/UnionpayDownLoadHandler$1;

    invoke-direct {v0, p0, p1, p2}, Lcom/huawei/nfc/carrera/logic/filedownload/unionpay/handler/UnionpayDownLoadHandler$1;-><init>(Lcom/huawei/nfc/carrera/logic/filedownload/unionpay/handler/UnionpayDownLoadHandler;Ljava/lang/String;Ljava/lang/String;)V

    .line 214
    invoke-virtual {v0}, Lcom/huawei/nfc/carrera/logic/filedownload/unionpay/handler/UnionpayDownLoadHandler$1;->start()V

    .line 216
    return-void
.end method

.method private sendConnectedMessage(J)V
    .locals 2

    .line 234
    const/4 v0, 0x6

    invoke-virtual {p0, v0}, Lcom/huawei/nfc/carrera/logic/filedownload/unionpay/handler/UnionpayDownLoadHandler;->obtainMessage(I)Landroid/os/Message;

    move-result-object v1

    .line 235
    invoke-static {p1, p2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    iput-object v0, v1, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 236
    invoke-virtual {v1}, Landroid/os/Message;->sendToTarget()V

    .line 237
    return-void
.end method

.method private sendFailedMessage(I)V
    .locals 2

    .line 157
    const/4 v0, 0x2

    invoke-virtual {p0, v0}, Lcom/huawei/nfc/carrera/logic/filedownload/unionpay/handler/UnionpayDownLoadHandler;->obtainMessage(I)Landroid/os/Message;

    move-result-object v1

    .line 158
    iput p1, v1, Landroid/os/Message;->arg1:I

    .line 159
    invoke-virtual {v1}, Landroid/os/Message;->sendToTarget()V

    .line 160
    return-void
.end method

.method private sendProgressMessage(IJ)V
    .locals 3

    .line 142
    const/4 v0, 0x3

    invoke-virtual {p0, v0}, Lcom/huawei/nfc/carrera/logic/filedownload/unionpay/handler/UnionpayDownLoadHandler;->obtainMessage(I)Landroid/os/Message;

    move-result-object v1

    .line 143
    invoke-virtual {v1}, Landroid/os/Message;->getData()Landroid/os/Bundle;

    move-result-object v2

    .line 144
    const-string v0, "progress"

    invoke-virtual {v2, v0, p1}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    .line 145
    const-string v0, "currentSize"

    invoke-virtual {v2, v0, p2, p3}, Landroid/os/Bundle;->putLong(Ljava/lang/String;J)V

    .line 146
    invoke-virtual {v1, v2}, Landroid/os/Message;->setData(Landroid/os/Bundle;)V

    .line 147
    invoke-virtual {v1}, Landroid/os/Message;->sendToTarget()V

    .line 148
    return-void
.end method

.method private sendSuccessMessage(Ljava/lang/String;)V
    .locals 2

    .line 129
    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Lcom/huawei/nfc/carrera/logic/filedownload/unionpay/handler/UnionpayDownLoadHandler;->obtainMessage(I)Landroid/os/Message;

    move-result-object v1

    .line 130
    iput-object p1, v1, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 131
    invoke-virtual {v1}, Landroid/os/Message;->sendToTarget()V

    .line 132
    return-void
.end method


# virtual methods
.method public handleMessage(Landroid/os/Message;)V
    .locals 7

    .line 81
    invoke-super {p0, p1}, Landroid/os/Handler;->handleMessage(Landroid/os/Message;)V

    .line 82
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/filedownload/unionpay/handler/UnionpayDownLoadHandler;->downLoadCallback:Lcom/huawei/nfc/carrera/logic/filedownload/unionpay/listener/DownLoadCallback;

    const/4 v1, 0x0

    if-ne v1, v0, :cond_0

    .line 84
    new-instance v4, Ljava/util/HashMap;

    invoke-direct {v4}, Ljava/util/HashMap;-><init>()V

    .line 85
    const-string v0, "fail_reason"

    const-string v1, "Unionpay Download, callback is null"

    invoke-interface {v4, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 86
    const-string v0, "download callback is null \uff0cyou need excute registeListeners()  method  before download() method"

    const v1, 0x3611a3fb

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-static {v1, v4, v0, v2, v3}, Lcom/huawei/nfc/carrera/util/LogX;->e(ILjava/util/Map;Ljava/lang/String;ZZ)V

    .line 88
    return-void

    .line 90
    :cond_0
    iget v0, p1, Landroid/os/Message;->what:I

    packed-switch v0, :pswitch_data_0

    goto/16 :goto_0

    .line 94
    :pswitch_0
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/filedownload/unionpay/handler/UnionpayDownLoadHandler;->downLoadCallback:Lcom/huawei/nfc/carrera/logic/filedownload/unionpay/listener/DownLoadCallback;

    iget-object v1, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    check-cast v1, Ljava/lang/String;

    invoke-interface {v0, v1}, Lcom/huawei/nfc/carrera/logic/filedownload/unionpay/listener/DownLoadCallback;->downLoadSuccess(Ljava/lang/String;)V

    .line 95
    goto/16 :goto_1

    .line 97
    :pswitch_1
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/filedownload/unionpay/handler/UnionpayDownLoadHandler;->downLoadCallback:Lcom/huawei/nfc/carrera/logic/filedownload/unionpay/listener/DownLoadCallback;

    iget v1, p1, Landroid/os/Message;->arg1:I

    invoke-interface {v0, v1}, Lcom/huawei/nfc/carrera/logic/filedownload/unionpay/listener/DownLoadCallback;->downLoadFailed(I)V

    .line 98
    goto/16 :goto_1

    .line 100
    :pswitch_2
    invoke-virtual {p1}, Landroid/os/Message;->getData()Landroid/os/Bundle;

    move-result-object v4

    .line 101
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/filedownload/unionpay/handler/UnionpayDownLoadHandler;->downLoadCallback:Lcom/huawei/nfc/carrera/logic/filedownload/unionpay/listener/DownLoadCallback;

    const-string v1, "progress"

    invoke-virtual {v4, v1}, Landroid/os/Bundle;->getInt(Ljava/lang/String;)I

    move-result v1

    const-string v2, "currentSize"

    invoke-virtual {v4, v2}, Landroid/os/Bundle;->getLong(Ljava/lang/String;)J

    move-result-wide v2

    invoke-interface {v0, v1, v2, v3}, Lcom/huawei/nfc/carrera/logic/filedownload/unionpay/listener/DownLoadCallback;->downProgress(IJ)V

    .line 102
    goto/16 :goto_1

    .line 104
    :pswitch_3
    invoke-virtual {p1}, Landroid/os/Message;->getData()Landroid/os/Bundle;

    move-result-object v5

    .line 105
    const-string v0, "url"

    invoke-virtual {v5, v0}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    const-string v1, "path"

    invoke-virtual {v5, v1}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-direct {p0, v0, v1}, Lcom/huawei/nfc/carrera/logic/filedownload/unionpay/handler/UnionpayDownLoadHandler;->downLoad(Ljava/lang/String;Ljava/lang/String;)V

    .line 106
    goto :goto_1

    .line 108
    :pswitch_4
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/filedownload/unionpay/handler/UnionpayDownLoadHandler;->fileDownloadApi:Lcom/huawei/nfc/carrera/server/download/impl/FileDownloadImpl;

    invoke-virtual {v0}, Lcom/huawei/nfc/carrera/server/download/impl/FileDownloadImpl;->cancelDownLoad()V

    .line 109
    goto :goto_1

    .line 111
    :pswitch_5
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/filedownload/unionpay/handler/UnionpayDownLoadHandler;->downLoadCallback:Lcom/huawei/nfc/carrera/logic/filedownload/unionpay/listener/DownLoadCallback;

    iget-object v1, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    check-cast v1, Ljava/lang/Long;

    invoke-virtual {v1}, Ljava/lang/Long;->longValue()J

    move-result-wide v1

    invoke-interface {v0, v1, v2}, Lcom/huawei/nfc/carrera/logic/filedownload/unionpay/listener/DownLoadCallback;->downLoadConnected(J)V

    .line 112
    goto :goto_1

    .line 114
    :goto_0
    new-instance v6, Ljava/util/HashMap;

    invoke-direct {v6}, Ljava/util/HashMap;-><init>()V

    .line 115
    const-string v0, "fail_reason"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Unionpay Download, invalid message info : "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget v2, p1, Landroid/os/Message;->what:I

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v6, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 116
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Unionpay Download, invalid message info : "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget v1, p1, Landroid/os/Message;->what:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const v1, 0x3611a3fb

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-static {v1, v6, v0, v2, v3}, Lcom/huawei/nfc/carrera/util/LogX;->e(ILjava/util/Map;Ljava/lang/String;ZZ)V

    .line 120
    :goto_1
    return-void

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
        :pswitch_1
        :pswitch_2
        :pswitch_3
        :pswitch_4
        :pswitch_5
    .end packed-switch
.end method

.method public sendCancelMessage()V
    .locals 1

    .line 223
    const/4 v0, 0x5

    invoke-virtual {p0, v0}, Lcom/huawei/nfc/carrera/logic/filedownload/unionpay/handler/UnionpayDownLoadHandler;->sendEmptyMessage(I)Z

    .line 224
    return-void
.end method

.method public sendDownMessage(Ljava/lang/String;Ljava/lang/String;)V
    .locals 3

    .line 170
    const/4 v0, 0x4

    invoke-virtual {p0, v0}, Lcom/huawei/nfc/carrera/logic/filedownload/unionpay/handler/UnionpayDownLoadHandler;->obtainMessage(I)Landroid/os/Message;

    move-result-object v1

    .line 171
    new-instance v2, Landroid/os/Bundle;

    invoke-direct {v2}, Landroid/os/Bundle;-><init>()V

    .line 172
    const-string v0, "url"

    invoke-virtual {v2, v0, p1}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 173
    const-string v0, "path"

    invoke-virtual {v2, v0, p2}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 174
    invoke-virtual {v1, v2}, Landroid/os/Message;->setData(Landroid/os/Bundle;)V

    .line 175
    invoke-virtual {v1}, Landroid/os/Message;->sendToTarget()V

    .line 176
    return-void
.end method

.method public unregisterListener()V
    .locals 1

    .line 244
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/nfc/carrera/logic/filedownload/unionpay/handler/UnionpayDownLoadHandler;->downLoadCallback:Lcom/huawei/nfc/carrera/logic/filedownload/unionpay/listener/DownLoadCallback;

    .line 245
    return-void
.end method
