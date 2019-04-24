.class public Lcom/leisen/wallet/sdk/apdu/ApduManager;
.super Lcom/leisen/wallet/sdk/http/SimpleResponseHandler;
.source "SourceFile"


# static fields
.field private static final BUSINESS_TYPE_ACTIVATE:I = 0x23

.field private static final BUSINESS_TYPE_APPLETOPER:I = 0x1e

.field private static final BUSINESS_TYPE_COMMON_METHOD:I = 0x28

.field private static final BUSINESS_TYPE_GPACOPER:I = 0x20

.field private static final BUSINESS_TYPE_INFOINIT:I = 0x22

.field private static final BUSINESS_TYPE_INFOSYNC:I = 0x21

.field private static final BUSINESS_TYPE_SSDOPER:I = 0x1f

.field private static final FLAG_ACTIVATE_APPLET:I = 0x9

.field private static final FLAG_ESEINFOSYNC:I = 0x2

.field private static final FLAG_GETCIN:I = 0x7

.field private static final FLAG_GETCPLC:I = 0x6

.field private static final FLAG_GETIIN:I = 0x8

.field private static final FLAG_INFOINIT:I = 0x1

.field private static final FLAG_OPERAPPLET:I = 0x4

.field private static final FLAG_OPERGPAC:I = 0x5

.field private static final FLAG_OPERSSD:I = 0x3

.field public static final SEND_TYPE_FIRST:I = 0x1

.field public static final SEND_TYPE_NEXT:I = 0x2

.field private static final TAG:Ljava/lang/String; = "ApduManager"


# instance fields
.field private mApduResponseHandler:Lcom/leisen/wallet/sdk/apdu/ApduResponseHandler;

.field private mApduSmartCardRequest:Lcom/leisen/wallet/sdk/apdu/ApduSmartCardRequest;

.field private mAsyncHttpClient:Lcom/leisen/wallet/sdk/http/AsyncHttpClient;

.field private mBusinessType:I

.field private mCommonRequestParams:Lcom/leisen/wallet/sdk/bean/CommonRequestParams;

.field private mContext:Landroid/content/Context;

.field private mCurrentTaskIndex:I

.field private mErrorMessage:Ljava/lang/String;

.field private mTsmOperatorResponse:Lcom/leisen/wallet/sdk/tsm/TSMOperatorResponse;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    .line 96
    invoke-direct {p0}, Lcom/leisen/wallet/sdk/http/SimpleResponseHandler;-><init>()V

    .line 57
    const/4 v0, 0x1

    iput v0, p0, Lcom/leisen/wallet/sdk/apdu/ApduManager;->mCurrentTaskIndex:I

    .line 58
    const/4 v0, -0x1

    iput v0, p0, Lcom/leisen/wallet/sdk/apdu/ApduManager;->mBusinessType:I

    .line 61
    new-instance v0, Lcom/leisen/wallet/sdk/apdu/ApduManager$1;

    invoke-direct {v0, p0}, Lcom/leisen/wallet/sdk/apdu/ApduManager$1;-><init>(Lcom/leisen/wallet/sdk/apdu/ApduManager;)V

    iput-object v0, p0, Lcom/leisen/wallet/sdk/apdu/ApduManager;->mApduResponseHandler:Lcom/leisen/wallet/sdk/apdu/ApduResponseHandler;

    .line 97
    invoke-direct {p0, p1}, Lcom/leisen/wallet/sdk/apdu/ApduManager;->init(Landroid/content/Context;)V

    .line 98
    return-void
.end method

.method static synthetic access$000(Lcom/leisen/wallet/sdk/apdu/ApduManager;)Lcom/leisen/wallet/sdk/tsm/TSMOperatorResponse;
    .locals 1

    .line 26
    iget-object v0, p0, Lcom/leisen/wallet/sdk/apdu/ApduManager;->mTsmOperatorResponse:Lcom/leisen/wallet/sdk/tsm/TSMOperatorResponse;

    return-object v0
.end method

.method static synthetic access$100(Lcom/leisen/wallet/sdk/apdu/ApduManager;)V
    .locals 0

    .line 26
    invoke-direct {p0}, Lcom/leisen/wallet/sdk/apdu/ApduManager;->clearData()V

    return-void
.end method

.method static synthetic access$208(Lcom/leisen/wallet/sdk/apdu/ApduManager;)I
    .locals 2

    .line 26
    iget v0, p0, Lcom/leisen/wallet/sdk/apdu/ApduManager;->mCurrentTaskIndex:I

    add-int/lit8 v1, v0, 0x1

    iput v1, p0, Lcom/leisen/wallet/sdk/apdu/ApduManager;->mCurrentTaskIndex:I

    return v0
.end method

.method static synthetic access$300(Lcom/leisen/wallet/sdk/apdu/ApduManager;IILjava/lang/String;Ljava/lang/String;)V
    .locals 0

    .line 26
    invoke-direct {p0, p1, p2, p3, p4}, Lcom/leisen/wallet/sdk/apdu/ApduManager;->sendNextApdu(IILjava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method static synthetic access$402(Lcom/leisen/wallet/sdk/apdu/ApduManager;Ljava/lang/String;)Ljava/lang/String;
    .locals 0

    .line 26
    iput-object p1, p0, Lcom/leisen/wallet/sdk/apdu/ApduManager;->mErrorMessage:Ljava/lang/String;

    return-object p1
.end method

.method private clearData()V
    .locals 1

    .line 295
    const/4 v0, 0x1

    iput v0, p0, Lcom/leisen/wallet/sdk/apdu/ApduManager;->mCurrentTaskIndex:I

    .line 296
    const/4 v0, -0x1

    iput v0, p0, Lcom/leisen/wallet/sdk/apdu/ApduManager;->mBusinessType:I

    .line 297
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/leisen/wallet/sdk/apdu/ApduManager;->mCommonRequestParams:Lcom/leisen/wallet/sdk/bean/CommonRequestParams;

    .line 298
    invoke-static {}, Lcom/leisen/wallet/sdk/oma/SmartCard;->getInstance()Lcom/leisen/wallet/sdk/oma/SmartCard;

    move-result-object v0

    invoke-virtual {v0}, Lcom/leisen/wallet/sdk/oma/SmartCard;->closeChannel()V

    .line 299
    return-void
.end method

.method private init(Landroid/content/Context;)V
    .locals 3

    .line 101
    iput-object p1, p0, Lcom/leisen/wallet/sdk/apdu/ApduManager;->mContext:Landroid/content/Context;

    .line 102
    new-instance v0, Lcom/leisen/wallet/sdk/http/AsyncHttpClient;

    const/4 v1, 0x1

    invoke-direct {v0, v1}, Lcom/leisen/wallet/sdk/http/AsyncHttpClient;-><init>(Z)V

    iput-object v0, p0, Lcom/leisen/wallet/sdk/apdu/ApduManager;->mAsyncHttpClient:Lcom/leisen/wallet/sdk/http/AsyncHttpClient;

    .line 103
    new-instance v0, Lcom/leisen/wallet/sdk/apdu/ApduSmartCardRequest;

    iget-object v1, p0, Lcom/leisen/wallet/sdk/apdu/ApduManager;->mContext:Landroid/content/Context;

    iget-object v2, p0, Lcom/leisen/wallet/sdk/apdu/ApduManager;->mApduResponseHandler:Lcom/leisen/wallet/sdk/apdu/ApduResponseHandler;

    invoke-direct {v0, v1, v2}, Lcom/leisen/wallet/sdk/apdu/ApduSmartCardRequest;-><init>(Landroid/content/Context;Lcom/leisen/wallet/sdk/apdu/ApduResponseHandler;)V

    iput-object v0, p0, Lcom/leisen/wallet/sdk/apdu/ApduManager;->mApduSmartCardRequest:Lcom/leisen/wallet/sdk/apdu/ApduSmartCardRequest;

    .line 104
    return-void
.end method

.method private sendApduToServer(Ljava/lang/String;)V
    .locals 8

    .line 259
    const-string v0, "ApduManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "sendApduToServer request url:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-static {}, Lcom/leisen/wallet/sdk/AppConfig;->getStreamUrl()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 260
    const-string v0, "ApduManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "sendApduToServer request:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 261
    if-nez p1, :cond_0

    .line 262
    return-void

    .line 265
    :cond_0
    :try_start_0
    new-instance v6, Lorg/apache/http/entity/StringEntity;

    const-string v0, "UTF-8"

    invoke-direct {v6, p1, v0}, Lorg/apache/http/entity/StringEntity;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 266
    const-string v7, "text/json"

    .line 267
    iget-object v0, p0, Lcom/leisen/wallet/sdk/apdu/ApduManager;->mAsyncHttpClient:Lcom/leisen/wallet/sdk/http/AsyncHttpClient;

    iget-object v1, p0, Lcom/leisen/wallet/sdk/apdu/ApduManager;->mContext:Landroid/content/Context;

    invoke-static {}, Lcom/leisen/wallet/sdk/AppConfig;->getStreamUrl()Ljava/lang/String;

    move-result-object v2

    move-object v3, v6

    move-object v4, v7

    move-object v5, p0

    invoke-virtual/range {v0 .. v5}, Lcom/leisen/wallet/sdk/http/AsyncHttpClient;->post(Landroid/content/Context;Ljava/lang/String;Lorg/apache/http/HttpEntity;Ljava/lang/String;Lcom/leisen/wallet/sdk/http/ResponseHandlerInterface;)Lcom/leisen/wallet/sdk/http/RequestHandle;
    :try_end_0
    .catch Ljava/io/UnsupportedEncodingException; {:try_start_0 .. :try_end_0} :catch_0

    .line 270
    goto :goto_0

    .line 268
    :catch_0
    move-exception v6

    .line 269
    iget-object v0, p0, Lcom/leisen/wallet/sdk/apdu/ApduManager;->mApduResponseHandler:Lcom/leisen/wallet/sdk/apdu/ApduResponseHandler;

    new-instance v1, Ljava/lang/Error;

    invoke-virtual {v6}, Ljava/io/UnsupportedEncodingException;->getMessage()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, v2}, Ljava/lang/Error;-><init>(Ljava/lang/String;)V

    const v2, 0x186ab

    invoke-virtual {v0, v2, v1}, Lcom/leisen/wallet/sdk/apdu/ApduResponseHandler;->sendFailureMessage(ILjava/lang/Error;)V

    .line 271
    :goto_0
    return-void
.end method

.method private sendFirstApdu(Ljava/lang/String;)V
    .locals 0

    .line 231
    invoke-direct {p0, p1}, Lcom/leisen/wallet/sdk/apdu/ApduManager;->sendApduToServer(Ljava/lang/String;)V

    .line 232
    return-void
.end method

.method private sendNextApdu(IILjava/lang/String;Ljava/lang/String;)V
    .locals 6

    .line 243
    const-string v0, "ApduManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "sendNextApdu index : "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "  ; result : "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, " ; rapdu : "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, " ; sw : "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 244
    new-instance v4, Lcom/leisen/wallet/sdk/business/ApduResBean;

    invoke-direct {v4}, Lcom/leisen/wallet/sdk/business/ApduResBean;-><init>()V

    .line 245
    invoke-virtual {v4, p2}, Lcom/leisen/wallet/sdk/business/ApduResBean;->setIndex(I)V

    .line 246
    invoke-virtual {v4, p3}, Lcom/leisen/wallet/sdk/business/ApduResBean;->setApdu(Ljava/lang/String;)V

    .line 247
    invoke-virtual {v4, p4}, Lcom/leisen/wallet/sdk/business/ApduResBean;->setSw(Ljava/lang/String;)V

    .line 249
    iget-object v0, p0, Lcom/leisen/wallet/sdk/apdu/ApduManager;->mCommonRequestParams:Lcom/leisen/wallet/sdk/bean/CommonRequestParams;

    iget v1, p0, Lcom/leisen/wallet/sdk/apdu/ApduManager;->mBusinessType:I

    iget v2, p0, Lcom/leisen/wallet/sdk/apdu/ApduManager;->mCurrentTaskIndex:I

    invoke-static {v0, v1, v4, p1, v2}, Lcom/leisen/wallet/sdk/util/AppJsonUtil;->getReqNextJsonResult(Lcom/leisen/wallet/sdk/bean/CommonRequestParams;ILcom/leisen/wallet/sdk/business/ApduResBean;II)Ljava/lang/String;

    move-result-object v5

    .line 250
    invoke-direct {p0, v5}, Lcom/leisen/wallet/sdk/apdu/ApduManager;->sendApduToServer(Ljava/lang/String;)V

    .line 251
    return-void
.end method

.method private sendRequestToSmartCard()V
    .locals 1

    .line 286
    iget-object v0, p0, Lcom/leisen/wallet/sdk/apdu/ApduManager;->mApduSmartCardRequest:Lcom/leisen/wallet/sdk/apdu/ApduSmartCardRequest;

    if-eqz v0, :cond_0

    .line 287
    iget-object v0, p0, Lcom/leisen/wallet/sdk/apdu/ApduManager;->mApduSmartCardRequest:Lcom/leisen/wallet/sdk/apdu/ApduSmartCardRequest;

    invoke-virtual {v0}, Lcom/leisen/wallet/sdk/apdu/ApduSmartCardRequest;->run()V

    .line 289
    :cond_0
    return-void
.end method


# virtual methods
.method public OnFailure(Ljava/lang/String;Ljava/lang/Throwable;)V
    .locals 4

    .line 342
    const-string v0, "ApduManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "OnFailure response:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 343
    iget-object v0, p0, Lcom/leisen/wallet/sdk/apdu/ApduManager;->mApduResponseHandler:Lcom/leisen/wallet/sdk/apdu/ApduResponseHandler;

    new-instance v1, Ljava/lang/Error;

    invoke-virtual {p2}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, v2}, Ljava/lang/Error;-><init>(Ljava/lang/String;)V

    const v2, 0x186aa

    invoke-virtual {v0, v2, v1}, Lcom/leisen/wallet/sdk/apdu/ApduResponseHandler;->sendFailureMessage(ILjava/lang/Error;)V

    .line 344
    return-void
.end method

.method public onSuccess(Ljava/lang/String;)V
    .locals 7

    .line 303
    const-string v0, "ApduManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "onSuccess response:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 304
    const/4 v4, 0x0

    .line 307
    :try_start_0
    new-instance v5, Lcom/google/gson/Gson;

    invoke-direct {v5}, Lcom/google/gson/Gson;-><init>()V

    .line 308
    new-instance v0, Lcom/leisen/wallet/sdk/apdu/ApduManager$2;

    invoke-direct {v0, p0}, Lcom/leisen/wallet/sdk/apdu/ApduManager$2;-><init>(Lcom/leisen/wallet/sdk/apdu/ApduManager;)V

    .line 309
    invoke-virtual {v0}, Lcom/leisen/wallet/sdk/apdu/ApduManager$2;->getType()Ljava/lang/reflect/Type;

    move-result-object v0

    .line 308
    invoke-virtual {v5, p1, v0}, Lcom/google/gson/Gson;->fromJson(Ljava/lang/String;Ljava/lang/reflect/Type;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/leisen/wallet/sdk/business/BaseResponse;
    :try_end_0
    .catch Lcom/google/gson/JsonSyntaxException; {:try_start_0 .. :try_end_0} :catch_0

    move-object v4, v0

    .line 312
    goto :goto_0

    .line 310
    :catch_0
    move-exception v5

    .line 311
    iget-object v0, p0, Lcom/leisen/wallet/sdk/apdu/ApduManager;->mApduResponseHandler:Lcom/leisen/wallet/sdk/apdu/ApduResponseHandler;

    new-instance v1, Ljava/lang/Error;

    const-string v2, "response data parse failure"

    invoke-direct {v1, v2}, Ljava/lang/Error;-><init>(Ljava/lang/String;)V

    const v2, 0x186ac

    invoke-virtual {v0, v2, v1}, Lcom/leisen/wallet/sdk/apdu/ApduResponseHandler;->sendFailureMessage(ILjava/lang/Error;)V

    .line 313
    :goto_0
    if-nez v4, :cond_0

    .line 314
    iget-object v0, p0, Lcom/leisen/wallet/sdk/apdu/ApduManager;->mApduResponseHandler:Lcom/leisen/wallet/sdk/apdu/ApduResponseHandler;

    new-instance v1, Ljava/lang/Error;

    const-string v2, "response data is empty"

    invoke-direct {v1, v2}, Ljava/lang/Error;-><init>(Ljava/lang/String;)V

    const v2, 0x186ac

    invoke-virtual {v0, v2, v1}, Lcom/leisen/wallet/sdk/apdu/ApduResponseHandler;->sendFailureMessage(ILjava/lang/Error;)V

    .line 315
    return-void

    .line 317
    :cond_0
    invoke-virtual {v4}, Lcom/leisen/wallet/sdk/business/BaseResponse;->getBusiness()Lcom/leisen/wallet/sdk/business/Business;

    move-result-object v0

    check-cast v0, Lcom/leisen/wallet/sdk/business/BaseBusinessForResp;

    invoke-virtual {v0}, Lcom/leisen/wallet/sdk/business/BaseBusinessForResp;->getOperationResult()I

    move-result v5

    .line 319
    const v0, 0x186a0

    if-eq v5, v0, :cond_2

    .line 320
    invoke-virtual {v4}, Lcom/leisen/wallet/sdk/business/BaseResponse;->getBusiness()Lcom/leisen/wallet/sdk/business/Business;

    move-result-object v0

    check-cast v0, Lcom/leisen/wallet/sdk/business/BaseBusinessForResp;

    invoke-virtual {v0}, Lcom/leisen/wallet/sdk/business/BaseBusinessForResp;->getOperationDes()Ljava/lang/String;

    move-result-object v6

    .line 321
    iget-object v0, p0, Lcom/leisen/wallet/sdk/apdu/ApduManager;->mErrorMessage:Ljava/lang/String;

    if-eqz v0, :cond_1

    const-string v0, ""

    iget-object v1, p0, Lcom/leisen/wallet/sdk/apdu/ApduManager;->mErrorMessage:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 322
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ":"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/leisen/wallet/sdk/apdu/ApduManager;->mErrorMessage:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v6

    .line 323
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/leisen/wallet/sdk/apdu/ApduManager;->mErrorMessage:Ljava/lang/String;

    .line 325
    :cond_1
    iget-object v0, p0, Lcom/leisen/wallet/sdk/apdu/ApduManager;->mApduResponseHandler:Lcom/leisen/wallet/sdk/apdu/ApduResponseHandler;

    new-instance v1, Ljava/lang/Error;

    invoke-direct {v1, v6}, Ljava/lang/Error;-><init>(Ljava/lang/String;)V

    const v2, 0x186ad

    invoke-virtual {v0, v2, v1}, Lcom/leisen/wallet/sdk/apdu/ApduResponseHandler;->sendFailureMessage(ILjava/lang/Error;)V

    .line 326
    return-void

    .line 329
    :cond_2
    invoke-virtual {v4}, Lcom/leisen/wallet/sdk/business/BaseResponse;->getBusiness()Lcom/leisen/wallet/sdk/business/Business;

    move-result-object v0

    check-cast v0, Lcom/leisen/wallet/sdk/business/BaseBusinessForResp;

    invoke-virtual {v0}, Lcom/leisen/wallet/sdk/business/BaseBusinessForResp;->getFinishFlag()I

    move-result v6

    .line 330
    if-nez v6, :cond_3

    .line 332
    iget-object v0, p0, Lcom/leisen/wallet/sdk/apdu/ApduManager;->mApduResponseHandler:Lcom/leisen/wallet/sdk/apdu/ApduResponseHandler;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/leisen/wallet/sdk/apdu/ApduResponseHandler;->sendSuccessMessage(Ljava/lang/String;)V

    goto :goto_1

    .line 335
    :cond_3
    iget-object v0, p0, Lcom/leisen/wallet/sdk/apdu/ApduManager;->mApduSmartCardRequest:Lcom/leisen/wallet/sdk/apdu/ApduSmartCardRequest;

    invoke-virtual {v4}, Lcom/leisen/wallet/sdk/business/BaseResponse;->getBusiness()Lcom/leisen/wallet/sdk/business/Business;

    move-result-object v1

    check-cast v1, Lcom/leisen/wallet/sdk/business/BaseBusinessForResp;

    invoke-virtual {v1}, Lcom/leisen/wallet/sdk/business/BaseBusinessForResp;->getCapduList()Ljava/util/List;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/leisen/wallet/sdk/apdu/ApduSmartCardRequest;->setCapduList(Ljava/util/List;)V

    .line 336
    invoke-direct {p0}, Lcom/leisen/wallet/sdk/apdu/ApduManager;->sendRequestToSmartCard()V

    .line 338
    :goto_1
    return-void
.end method

.method public requestCommonMethod(Lcom/leisen/wallet/sdk/bean/CommonRequestParams;)V
    .locals 3

    .line 171
    const/16 v0, 0x28

    iput v0, p0, Lcom/leisen/wallet/sdk/apdu/ApduManager;->mBusinessType:I

    .line 172
    iget-object v0, p0, Lcom/leisen/wallet/sdk/apdu/ApduManager;->mApduSmartCardRequest:Lcom/leisen/wallet/sdk/apdu/ApduSmartCardRequest;

    const/4 v1, -0x1

    invoke-virtual {v0, v1}, Lcom/leisen/wallet/sdk/apdu/ApduSmartCardRequest;->setFlag(I)V

    .line 173
    iput-object p1, p0, Lcom/leisen/wallet/sdk/apdu/ApduManager;->mCommonRequestParams:Lcom/leisen/wallet/sdk/bean/CommonRequestParams;

    .line 174
    iget v0, p0, Lcom/leisen/wallet/sdk/apdu/ApduManager;->mBusinessType:I

    iget v1, p0, Lcom/leisen/wallet/sdk/apdu/ApduManager;->mCurrentTaskIndex:I

    invoke-static {p1, v0, v1}, Lcom/leisen/wallet/sdk/util/AppJsonUtil;->getBaseReqJsonResult(Lcom/leisen/wallet/sdk/bean/CommonRequestParams;II)Ljava/lang/String;

    move-result-object v2

    .line 175
    invoke-direct {p0, v2}, Lcom/leisen/wallet/sdk/apdu/ApduManager;->sendFirstApdu(Ljava/lang/String;)V

    .line 176
    return-void
.end method

.method public requestEseInfoSync(Lcom/leisen/wallet/sdk/bean/CommonRequestParams;)V
    .locals 3

    .line 121
    const/16 v0, 0x21

    iput v0, p0, Lcom/leisen/wallet/sdk/apdu/ApduManager;->mBusinessType:I

    .line 122
    iget-object v0, p0, Lcom/leisen/wallet/sdk/apdu/ApduManager;->mApduSmartCardRequest:Lcom/leisen/wallet/sdk/apdu/ApduSmartCardRequest;

    const/4 v1, 0x2

    invoke-virtual {v0, v1}, Lcom/leisen/wallet/sdk/apdu/ApduSmartCardRequest;->setFlag(I)V

    .line 123
    iput-object p1, p0, Lcom/leisen/wallet/sdk/apdu/ApduManager;->mCommonRequestParams:Lcom/leisen/wallet/sdk/bean/CommonRequestParams;

    .line 124
    iget v0, p0, Lcom/leisen/wallet/sdk/apdu/ApduManager;->mBusinessType:I

    iget v1, p0, Lcom/leisen/wallet/sdk/apdu/ApduManager;->mCurrentTaskIndex:I

    invoke-static {p1, v0, v1}, Lcom/leisen/wallet/sdk/util/AppJsonUtil;->getBaseReqJsonResult(Lcom/leisen/wallet/sdk/bean/CommonRequestParams;II)Ljava/lang/String;

    move-result-object v2

    .line 125
    invoke-direct {p0, v2}, Lcom/leisen/wallet/sdk/apdu/ApduManager;->sendFirstApdu(Ljava/lang/String;)V

    .line 126
    return-void
.end method

.method public requestGetCIN(Ljava/lang/String;)V
    .locals 2

    .line 207
    iget-object v0, p0, Lcom/leisen/wallet/sdk/apdu/ApduManager;->mApduSmartCardRequest:Lcom/leisen/wallet/sdk/apdu/ApduSmartCardRequest;

    const/4 v1, 0x7

    invoke-virtual {v0, v1}, Lcom/leisen/wallet/sdk/apdu/ApduSmartCardRequest;->setFlag(I)V

    .line 208
    iget-object v0, p0, Lcom/leisen/wallet/sdk/apdu/ApduManager;->mApduSmartCardRequest:Lcom/leisen/wallet/sdk/apdu/ApduSmartCardRequest;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lcom/leisen/wallet/sdk/apdu/ApduSmartCardRequest;->isGetLocalData(Z)V

    .line 209
    iget-object v0, p0, Lcom/leisen/wallet/sdk/apdu/ApduManager;->mApduSmartCardRequest:Lcom/leisen/wallet/sdk/apdu/ApduSmartCardRequest;

    const-string v1, "80CA004500"

    invoke-virtual {v0, v1, p1}, Lcom/leisen/wallet/sdk/apdu/ApduSmartCardRequest;->setGetLocalDataApdu(Ljava/lang/String;Ljava/lang/String;)V

    .line 210
    invoke-direct {p0}, Lcom/leisen/wallet/sdk/apdu/ApduManager;->sendRequestToSmartCard()V

    .line 211
    return-void
.end method

.method public requestGetCPLC(Ljava/lang/String;)V
    .locals 2

    .line 195
    iget-object v0, p0, Lcom/leisen/wallet/sdk/apdu/ApduManager;->mApduSmartCardRequest:Lcom/leisen/wallet/sdk/apdu/ApduSmartCardRequest;

    const/4 v1, 0x6

    invoke-virtual {v0, v1}, Lcom/leisen/wallet/sdk/apdu/ApduSmartCardRequest;->setFlag(I)V

    .line 196
    iget-object v0, p0, Lcom/leisen/wallet/sdk/apdu/ApduManager;->mApduSmartCardRequest:Lcom/leisen/wallet/sdk/apdu/ApduSmartCardRequest;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lcom/leisen/wallet/sdk/apdu/ApduSmartCardRequest;->isGetLocalData(Z)V

    .line 197
    iget-object v0, p0, Lcom/leisen/wallet/sdk/apdu/ApduManager;->mApduSmartCardRequest:Lcom/leisen/wallet/sdk/apdu/ApduSmartCardRequest;

    const-string v1, "80CA9f7f00"

    invoke-virtual {v0, v1, p1}, Lcom/leisen/wallet/sdk/apdu/ApduSmartCardRequest;->setGetLocalDataApdu(Ljava/lang/String;Ljava/lang/String;)V

    .line 198
    invoke-direct {p0}, Lcom/leisen/wallet/sdk/apdu/ApduManager;->sendRequestToSmartCard()V

    .line 199
    return-void
.end method

.method public requestGetIIN(Ljava/lang/String;)V
    .locals 2

    .line 219
    iget-object v0, p0, Lcom/leisen/wallet/sdk/apdu/ApduManager;->mApduSmartCardRequest:Lcom/leisen/wallet/sdk/apdu/ApduSmartCardRequest;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Lcom/leisen/wallet/sdk/apdu/ApduSmartCardRequest;->setFlag(I)V

    .line 220
    iget-object v0, p0, Lcom/leisen/wallet/sdk/apdu/ApduManager;->mApduSmartCardRequest:Lcom/leisen/wallet/sdk/apdu/ApduSmartCardRequest;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lcom/leisen/wallet/sdk/apdu/ApduSmartCardRequest;->isGetLocalData(Z)V

    .line 221
    iget-object v0, p0, Lcom/leisen/wallet/sdk/apdu/ApduManager;->mApduSmartCardRequest:Lcom/leisen/wallet/sdk/apdu/ApduSmartCardRequest;

    const-string v1, "80CA004200"

    invoke-virtual {v0, v1, p1}, Lcom/leisen/wallet/sdk/apdu/ApduSmartCardRequest;->setGetLocalDataApdu(Ljava/lang/String;Ljava/lang/String;)V

    .line 222
    invoke-direct {p0}, Lcom/leisen/wallet/sdk/apdu/ApduManager;->sendRequestToSmartCard()V

    .line 223
    return-void
.end method

.method public requestInfoInit(Lcom/leisen/wallet/sdk/bean/CommonRequestParams;)V
    .locals 3

    .line 110
    const/16 v0, 0x22

    iput v0, p0, Lcom/leisen/wallet/sdk/apdu/ApduManager;->mBusinessType:I

    .line 111
    iget-object v0, p0, Lcom/leisen/wallet/sdk/apdu/ApduManager;->mApduSmartCardRequest:Lcom/leisen/wallet/sdk/apdu/ApduSmartCardRequest;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lcom/leisen/wallet/sdk/apdu/ApduSmartCardRequest;->setFlag(I)V

    .line 112
    iput-object p1, p0, Lcom/leisen/wallet/sdk/apdu/ApduManager;->mCommonRequestParams:Lcom/leisen/wallet/sdk/bean/CommonRequestParams;

    .line 113
    iget v0, p0, Lcom/leisen/wallet/sdk/apdu/ApduManager;->mBusinessType:I

    iget v1, p0, Lcom/leisen/wallet/sdk/apdu/ApduManager;->mCurrentTaskIndex:I

    invoke-static {p1, v0, v1}, Lcom/leisen/wallet/sdk/util/AppJsonUtil;->getBaseReqJsonResult(Lcom/leisen/wallet/sdk/bean/CommonRequestParams;II)Ljava/lang/String;

    move-result-object v2

    .line 114
    invoke-direct {p0, v2}, Lcom/leisen/wallet/sdk/apdu/ApduManager;->sendFirstApdu(Ljava/lang/String;)V

    .line 115
    return-void
.end method

.method public requestOperApplet(ILcom/leisen/wallet/sdk/bean/CommonRequestParams;Lcom/leisen/wallet/sdk/bean/OperAppletReqParams;)V
    .locals 3

    .line 143
    const/16 v0, 0x1e

    iput v0, p0, Lcom/leisen/wallet/sdk/apdu/ApduManager;->mBusinessType:I

    .line 144
    iget-object v0, p0, Lcom/leisen/wallet/sdk/apdu/ApduManager;->mApduSmartCardRequest:Lcom/leisen/wallet/sdk/apdu/ApduSmartCardRequest;

    const/4 v1, 0x4

    invoke-virtual {v0, v1}, Lcom/leisen/wallet/sdk/apdu/ApduSmartCardRequest;->setFlag(I)V

    .line 145
    iput-object p2, p0, Lcom/leisen/wallet/sdk/apdu/ApduManager;->mCommonRequestParams:Lcom/leisen/wallet/sdk/bean/CommonRequestParams;

    .line 146
    iget v0, p0, Lcom/leisen/wallet/sdk/apdu/ApduManager;->mBusinessType:I

    iget v1, p0, Lcom/leisen/wallet/sdk/apdu/ApduManager;->mCurrentTaskIndex:I

    invoke-static {p2, v0, p1, p3, v1}, Lcom/leisen/wallet/sdk/util/AppJsonUtil;->getOperAppletJsonResult(Lcom/leisen/wallet/sdk/bean/CommonRequestParams;IILcom/leisen/wallet/sdk/bean/OperAppletReqParams;I)Ljava/lang/String;

    move-result-object v2

    .line 147
    invoke-direct {p0, v2}, Lcom/leisen/wallet/sdk/apdu/ApduManager;->sendFirstApdu(Ljava/lang/String;)V

    .line 148
    return-void
.end method

.method public requestOperGPAC(ILcom/leisen/wallet/sdk/bean/CommonRequestParams;Ljava/lang/String;)V
    .locals 3

    .line 182
    const/16 v0, 0x20

    iput v0, p0, Lcom/leisen/wallet/sdk/apdu/ApduManager;->mBusinessType:I

    .line 183
    iget-object v0, p0, Lcom/leisen/wallet/sdk/apdu/ApduManager;->mApduSmartCardRequest:Lcom/leisen/wallet/sdk/apdu/ApduSmartCardRequest;

    const/4 v1, 0x5

    invoke-virtual {v0, v1}, Lcom/leisen/wallet/sdk/apdu/ApduSmartCardRequest;->setFlag(I)V

    .line 184
    iput-object p2, p0, Lcom/leisen/wallet/sdk/apdu/ApduManager;->mCommonRequestParams:Lcom/leisen/wallet/sdk/bean/CommonRequestParams;

    .line 185
    iget v0, p0, Lcom/leisen/wallet/sdk/apdu/ApduManager;->mBusinessType:I

    iget v1, p0, Lcom/leisen/wallet/sdk/apdu/ApduManager;->mCurrentTaskIndex:I

    invoke-static {p2, v0, p1, p3, v1}, Lcom/leisen/wallet/sdk/util/AppJsonUtil;->getOperGPACJsonResult(Lcom/leisen/wallet/sdk/bean/CommonRequestParams;IILjava/lang/String;I)Ljava/lang/String;

    move-result-object v2

    .line 186
    invoke-direct {p0, v2}, Lcom/leisen/wallet/sdk/apdu/ApduManager;->sendFirstApdu(Ljava/lang/String;)V

    .line 187
    return-void
.end method

.method public requestOperSSD(ILcom/leisen/wallet/sdk/bean/CommonRequestParams;Ljava/lang/String;)V
    .locals 3

    .line 132
    const/16 v0, 0x1f

    iput v0, p0, Lcom/leisen/wallet/sdk/apdu/ApduManager;->mBusinessType:I

    .line 133
    iget-object v0, p0, Lcom/leisen/wallet/sdk/apdu/ApduManager;->mApduSmartCardRequest:Lcom/leisen/wallet/sdk/apdu/ApduSmartCardRequest;

    const/4 v1, 0x3

    invoke-virtual {v0, v1}, Lcom/leisen/wallet/sdk/apdu/ApduSmartCardRequest;->setFlag(I)V

    .line 134
    iput-object p2, p0, Lcom/leisen/wallet/sdk/apdu/ApduManager;->mCommonRequestParams:Lcom/leisen/wallet/sdk/bean/CommonRequestParams;

    .line 135
    iget v0, p0, Lcom/leisen/wallet/sdk/apdu/ApduManager;->mBusinessType:I

    iget v1, p0, Lcom/leisen/wallet/sdk/apdu/ApduManager;->mCurrentTaskIndex:I

    invoke-static {p2, v0, p1, p3, v1}, Lcom/leisen/wallet/sdk/util/AppJsonUtil;->getOperSSDJsonResult(Lcom/leisen/wallet/sdk/bean/CommonRequestParams;IILjava/lang/String;I)Ljava/lang/String;

    move-result-object v2

    .line 136
    invoke-direct {p0, v2}, Lcom/leisen/wallet/sdk/apdu/ApduManager;->sendFirstApdu(Ljava/lang/String;)V

    .line 137
    return-void
.end method

.method public requestactivateApplet(Lcom/leisen/wallet/sdk/bean/CommonRequestParams;Ljava/lang/String;)V
    .locals 3

    .line 157
    const/16 v0, 0x23

    iput v0, p0, Lcom/leisen/wallet/sdk/apdu/ApduManager;->mBusinessType:I

    .line 158
    iget-object v0, p0, Lcom/leisen/wallet/sdk/apdu/ApduManager;->mApduSmartCardRequest:Lcom/leisen/wallet/sdk/apdu/ApduSmartCardRequest;

    const/16 v1, 0x9

    invoke-virtual {v0, v1}, Lcom/leisen/wallet/sdk/apdu/ApduSmartCardRequest;->setFlag(I)V

    .line 159
    iput-object p1, p0, Lcom/leisen/wallet/sdk/apdu/ApduManager;->mCommonRequestParams:Lcom/leisen/wallet/sdk/bean/CommonRequestParams;

    .line 160
    iget v0, p0, Lcom/leisen/wallet/sdk/apdu/ApduManager;->mBusinessType:I

    iget v1, p0, Lcom/leisen/wallet/sdk/apdu/ApduManager;->mCurrentTaskIndex:I

    invoke-static {p1, v0, p2, v1}, Lcom/leisen/wallet/sdk/util/AppJsonUtil;->getActivateAppletJsonResult(Lcom/leisen/wallet/sdk/bean/CommonRequestParams;ILjava/lang/String;I)Ljava/lang/String;

    move-result-object v2

    .line 161
    invoke-direct {p0, v2}, Lcom/leisen/wallet/sdk/apdu/ApduManager;->sendFirstApdu(Ljava/lang/String;)V

    .line 163
    return-void
.end method

.method public setTsmOperatorResponse(Lcom/leisen/wallet/sdk/tsm/TSMOperatorResponse;)V
    .locals 0

    .line 279
    iput-object p1, p0, Lcom/leisen/wallet/sdk/apdu/ApduManager;->mTsmOperatorResponse:Lcom/leisen/wallet/sdk/tsm/TSMOperatorResponse;

    .line 280
    return-void
.end method
