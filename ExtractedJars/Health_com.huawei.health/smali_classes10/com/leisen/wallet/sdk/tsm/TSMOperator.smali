.class public Lcom/leisen/wallet/sdk/tsm/TSMOperator;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/leisen/wallet/sdk/tsm/ITSMOperator;
.implements Lcom/leisen/wallet/sdk/tsm/TSMOperatorResponse;


# static fields
.field private static final RETURN_APPLETAID_IS_NULL:I = 0x186a6

.field private static final RETURN_APPLETVERSION_IS_NULL:I = 0x186a7

.field private static final RETURN_COMMOMREQUESTPARAMS_IS_NULL:I = 0x186a1

.field private static final RETURN_CPLC_IS_NULL:I = 0x186a8

.field private static final RETURN_FUNCALLID_IS_NULL:I = 0x186a4

.field public static final RETURN_NETWORK_ERROR:I = 0x186aa

.field private static final RETURN_OPERAPPLETREQPARAMS_IS_NULL:I = 0x186a2

.field public static final RETURN_RESPONSE_PARSE_ERROR:I = 0x186ac

.field public static final RETURN_SERVER_ERROR:I = 0x186ad

.field private static final RETURN_SERVICEID_IS_NULL:I = 0x186a3

.field public static final RETURN_SMARTCARD_OPER_FAILURE:I = 0x186a9

.field private static final RETURN_SSDAID_IS_NULL:I = 0x186a5

.field private static final RETURN_SUCCESS:I = 0x186a0

.field public static final RETURN_UNKNOW_ERROR:I = 0x186ab

.field private static final lock:Ljava/lang/Object;


# instance fields
.field private mApduManager:Lcom/leisen/wallet/sdk/apdu/ApduManager;

.field private mOperatorResult:I

.field private mTsmOperatorResponse:Lcom/leisen/wallet/sdk/tsm/TSMOperatorResponse;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 31
    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lcom/leisen/wallet/sdk/tsm/TSMOperator;->lock:Ljava/lang/Object;

    return-void
.end method

.method private constructor <init>()V
    .locals 1

    .line 33
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 30
    const v0, 0x186a0

    iput v0, p0, Lcom/leisen/wallet/sdk/tsm/TSMOperator;->mOperatorResult:I

    .line 34
    return-void
.end method

.method private constructor <init>(Landroid/content/Context;)V
    .locals 1

    .line 36
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 30
    const v0, 0x186a0

    iput v0, p0, Lcom/leisen/wallet/sdk/tsm/TSMOperator;->mOperatorResult:I

    .line 37
    invoke-static {p1}, Lcom/leisen/wallet/sdk/AppConfig;->init(Landroid/content/Context;)V

    .line 38
    new-instance v0, Lcom/leisen/wallet/sdk/apdu/ApduManager;

    invoke-direct {v0, p1}, Lcom/leisen/wallet/sdk/apdu/ApduManager;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Lcom/leisen/wallet/sdk/tsm/TSMOperator;->mApduManager:Lcom/leisen/wallet/sdk/apdu/ApduManager;

    .line 39
    iget-object v0, p0, Lcom/leisen/wallet/sdk/tsm/TSMOperator;->mApduManager:Lcom/leisen/wallet/sdk/apdu/ApduManager;

    invoke-virtual {v0, p0}, Lcom/leisen/wallet/sdk/apdu/ApduManager;->setTsmOperatorResponse(Lcom/leisen/wallet/sdk/tsm/TSMOperatorResponse;)V

    .line 40
    return-void
.end method

.method private checkCommonRequestParams(Lcom/leisen/wallet/sdk/bean/CommonRequestParams;)I
    .locals 1

    .line 246
    if-nez p1, :cond_0

    .line 247
    const v0, 0x186a1

    return v0

    .line 249
    :cond_0
    invoke-virtual {p1}, Lcom/leisen/wallet/sdk/bean/CommonRequestParams;->getCplc()Ljava/lang/String;

    move-result-object v0

    if-nez v0, :cond_1

    .line 250
    const v0, 0x186a8

    return v0

    .line 252
    :cond_1
    invoke-virtual {p1}, Lcom/leisen/wallet/sdk/bean/CommonRequestParams;->getServiceId()Ljava/lang/String;

    move-result-object v0

    if-nez v0, :cond_2

    .line 253
    const v0, 0x186a3

    return v0

    .line 255
    :cond_2
    invoke-virtual {p1}, Lcom/leisen/wallet/sdk/bean/CommonRequestParams;->getFunCallId()Ljava/lang/String;

    move-result-object v0

    if-nez v0, :cond_3

    .line 256
    const v0, 0x186a4

    return v0

    .line 258
    :cond_3
    const/4 v0, -0x1

    return v0
.end method

.method private checkOperAppetReqParams(Lcom/leisen/wallet/sdk/bean/OperAppletReqParams;)I
    .locals 1

    .line 262
    if-nez p1, :cond_0

    .line 263
    const v0, 0x186a2

    return v0

    .line 265
    :cond_0
    invoke-virtual {p1}, Lcom/leisen/wallet/sdk/bean/OperAppletReqParams;->getAppletAid()Ljava/lang/String;

    move-result-object v0

    if-nez v0, :cond_1

    .line 266
    const v0, 0x186a6

    return v0

    .line 271
    :cond_1
    const/4 v0, -0x1

    return v0
.end method

.method public static getInstance(Landroid/content/Context;Ljava/lang/String;)Lcom/leisen/wallet/sdk/tsm/TSMOperator;
    .locals 3

    .line 43
    sget-object v1, Lcom/leisen/wallet/sdk/tsm/TSMOperator;->lock:Ljava/lang/Object;

    monitor-enter v1

    .line 44
    if-eqz p1, :cond_0

    .line 45
    :try_start_0
    invoke-static {p1}, Lcom/leisen/wallet/sdk/AppConfig;->setStreamUrl(Ljava/lang/String;)V

    .line 47
    :cond_0
    new-instance v0, Lcom/leisen/wallet/sdk/tsm/TSMOperator;

    invoke-direct {v0, p0}, Lcom/leisen/wallet/sdk/tsm/TSMOperator;-><init>(Landroid/content/Context;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v1

    return-object v0

    .line 48
    :catchall_0
    move-exception v2

    monitor-exit v1

    throw v2
.end method


# virtual methods
.method public activateApplet(Lcom/leisen/wallet/sdk/bean/CommonRequestParams;Ljava/lang/String;)I
    .locals 2

    .line 227
    invoke-direct {p0, p1}, Lcom/leisen/wallet/sdk/tsm/TSMOperator;->checkCommonRequestParams(Lcom/leisen/wallet/sdk/bean/CommonRequestParams;)I

    move-result v1

    .line 228
    const/4 v0, -0x1

    if-eq v1, v0, :cond_0

    .line 229
    return v1

    .line 232
    :cond_0
    if-nez p2, :cond_1

    .line 233
    const v0, 0x186a6

    return v0

    .line 236
    :cond_1
    iget-object v0, p0, Lcom/leisen/wallet/sdk/tsm/TSMOperator;->mApduManager:Lcom/leisen/wallet/sdk/apdu/ApduManager;

    invoke-virtual {v0, p1, p2}, Lcom/leisen/wallet/sdk/apdu/ApduManager;->requestactivateApplet(Lcom/leisen/wallet/sdk/bean/CommonRequestParams;Ljava/lang/String;)V

    .line 237
    iget v0, p0, Lcom/leisen/wallet/sdk/tsm/TSMOperator;->mOperatorResult:I

    return v0
.end method

.method public addGPAC(Lcom/leisen/wallet/sdk/bean/CommonRequestParams;Ljava/lang/String;)I
    .locals 3

    .line 73
    invoke-direct {p0, p1}, Lcom/leisen/wallet/sdk/tsm/TSMOperator;->checkCommonRequestParams(Lcom/leisen/wallet/sdk/bean/CommonRequestParams;)I

    move-result v2

    .line 74
    const/4 v0, -0x1

    if-eq v2, v0, :cond_0

    .line 75
    return v2

    .line 78
    :cond_0
    if-nez p2, :cond_1

    .line 79
    const v0, 0x186a6

    return v0

    .line 82
    :cond_1
    iget-object v0, p0, Lcom/leisen/wallet/sdk/tsm/TSMOperator;->mApduManager:Lcom/leisen/wallet/sdk/apdu/ApduManager;

    const/4 v1, 0x1

    invoke-virtual {v0, v1, p1, p2}, Lcom/leisen/wallet/sdk/apdu/ApduManager;->requestOperGPAC(ILcom/leisen/wallet/sdk/bean/CommonRequestParams;Ljava/lang/String;)V

    .line 83
    iget v0, p0, Lcom/leisen/wallet/sdk/tsm/TSMOperator;->mOperatorResult:I

    return v0
.end method

.method public commonExecute(Lcom/leisen/wallet/sdk/bean/CommonRequestParams;)I
    .locals 2

    .line 307
    invoke-direct {p0, p1}, Lcom/leisen/wallet/sdk/tsm/TSMOperator;->checkCommonRequestParams(Lcom/leisen/wallet/sdk/bean/CommonRequestParams;)I

    move-result v1

    .line 308
    const/4 v0, -0x1

    if-eq v1, v0, :cond_0

    .line 309
    return v1

    .line 311
    :cond_0
    iget-object v0, p0, Lcom/leisen/wallet/sdk/tsm/TSMOperator;->mApduManager:Lcom/leisen/wallet/sdk/apdu/ApduManager;

    invoke-virtual {v0, p1}, Lcom/leisen/wallet/sdk/apdu/ApduManager;->requestCommonMethod(Lcom/leisen/wallet/sdk/bean/CommonRequestParams;)V

    .line 312
    iget v0, p0, Lcom/leisen/wallet/sdk/tsm/TSMOperator;->mOperatorResult:I

    return v0
.end method

.method public createSSD(Lcom/leisen/wallet/sdk/bean/CommonRequestParams;Ljava/lang/String;)I
    .locals 3

    .line 103
    invoke-direct {p0, p1}, Lcom/leisen/wallet/sdk/tsm/TSMOperator;->checkCommonRequestParams(Lcom/leisen/wallet/sdk/bean/CommonRequestParams;)I

    move-result v2

    .line 104
    const/4 v0, -0x1

    if-eq v2, v0, :cond_0

    .line 105
    return v2

    .line 108
    :cond_0
    if-nez p2, :cond_1

    .line 109
    const v0, 0x186a5

    return v0

    .line 112
    :cond_1
    iget-object v0, p0, Lcom/leisen/wallet/sdk/tsm/TSMOperator;->mApduManager:Lcom/leisen/wallet/sdk/apdu/ApduManager;

    const/4 v1, 0x1

    invoke-virtual {v0, v1, p1, p2}, Lcom/leisen/wallet/sdk/apdu/ApduManager;->requestOperSSD(ILcom/leisen/wallet/sdk/bean/CommonRequestParams;Ljava/lang/String;)V

    .line 113
    iget v0, p0, Lcom/leisen/wallet/sdk/tsm/TSMOperator;->mOperatorResult:I

    return v0
.end method

.method public deleteApplet(Lcom/leisen/wallet/sdk/bean/CommonRequestParams;Lcom/leisen/wallet/sdk/bean/OperAppletReqParams;)I
    .locals 4

    .line 179
    invoke-direct {p0, p1}, Lcom/leisen/wallet/sdk/tsm/TSMOperator;->checkCommonRequestParams(Lcom/leisen/wallet/sdk/bean/CommonRequestParams;)I

    move-result v2

    .line 180
    const/4 v0, -0x1

    if-eq v2, v0, :cond_0

    .line 181
    return v2

    .line 184
    :cond_0
    invoke-direct {p0, p2}, Lcom/leisen/wallet/sdk/tsm/TSMOperator;->checkOperAppetReqParams(Lcom/leisen/wallet/sdk/bean/OperAppletReqParams;)I

    move-result v3

    .line 185
    const/4 v0, -0x1

    if-eq v3, v0, :cond_1

    .line 186
    return v3

    .line 189
    :cond_1
    iget-object v0, p0, Lcom/leisen/wallet/sdk/tsm/TSMOperator;->mApduManager:Lcom/leisen/wallet/sdk/apdu/ApduManager;

    const/4 v1, 0x2

    invoke-virtual {v0, v1, p1, p2}, Lcom/leisen/wallet/sdk/apdu/ApduManager;->requestOperApplet(ILcom/leisen/wallet/sdk/bean/CommonRequestParams;Lcom/leisen/wallet/sdk/bean/OperAppletReqParams;)V

    .line 190
    iget v0, p0, Lcom/leisen/wallet/sdk/tsm/TSMOperator;->mOperatorResult:I

    return v0
.end method

.method public deleteGPAC(Lcom/leisen/wallet/sdk/bean/CommonRequestParams;Ljava/lang/String;)I
    .locals 3

    .line 88
    invoke-direct {p0, p1}, Lcom/leisen/wallet/sdk/tsm/TSMOperator;->checkCommonRequestParams(Lcom/leisen/wallet/sdk/bean/CommonRequestParams;)I

    move-result v2

    .line 89
    const/4 v0, -0x1

    if-eq v2, v0, :cond_0

    .line 90
    return v2

    .line 93
    :cond_0
    if-nez p2, :cond_1

    .line 94
    const v0, 0x186a6

    return v0

    .line 97
    :cond_1
    iget-object v0, p0, Lcom/leisen/wallet/sdk/tsm/TSMOperator;->mApduManager:Lcom/leisen/wallet/sdk/apdu/ApduManager;

    const/4 v1, 0x2

    invoke-virtual {v0, v1, p1, p2}, Lcom/leisen/wallet/sdk/apdu/ApduManager;->requestOperGPAC(ILcom/leisen/wallet/sdk/bean/CommonRequestParams;Ljava/lang/String;)V

    .line 98
    iget v0, p0, Lcom/leisen/wallet/sdk/tsm/TSMOperator;->mOperatorResult:I

    return v0
.end method

.method public deleteSSD(Lcom/leisen/wallet/sdk/bean/CommonRequestParams;Ljava/lang/String;)I
    .locals 3

    .line 118
    invoke-direct {p0, p1}, Lcom/leisen/wallet/sdk/tsm/TSMOperator;->checkCommonRequestParams(Lcom/leisen/wallet/sdk/bean/CommonRequestParams;)I

    move-result v2

    .line 119
    const/4 v0, -0x1

    if-eq v2, v0, :cond_0

    .line 120
    return v2

    .line 123
    :cond_0
    if-nez p2, :cond_1

    .line 124
    const v0, 0x186a5

    return v0

    .line 127
    :cond_1
    iget-object v0, p0, Lcom/leisen/wallet/sdk/tsm/TSMOperator;->mApduManager:Lcom/leisen/wallet/sdk/apdu/ApduManager;

    const/4 v1, 0x2

    invoke-virtual {v0, v1, p1, p2}, Lcom/leisen/wallet/sdk/apdu/ApduManager;->requestOperSSD(ILcom/leisen/wallet/sdk/bean/CommonRequestParams;Ljava/lang/String;)V

    .line 128
    iget v0, p0, Lcom/leisen/wallet/sdk/tsm/TSMOperator;->mOperatorResult:I

    return v0
.end method

.method public getCIN(Ljava/lang/String;)V
    .locals 1

    .line 281
    iget-object v0, p0, Lcom/leisen/wallet/sdk/tsm/TSMOperator;->mApduManager:Lcom/leisen/wallet/sdk/apdu/ApduManager;

    invoke-virtual {v0, p1}, Lcom/leisen/wallet/sdk/apdu/ApduManager;->requestGetCIN(Ljava/lang/String;)V

    .line 282
    return-void
.end method

.method public getCPLC(Ljava/lang/String;)V
    .locals 1

    .line 276
    iget-object v0, p0, Lcom/leisen/wallet/sdk/tsm/TSMOperator;->mApduManager:Lcom/leisen/wallet/sdk/apdu/ApduManager;

    invoke-virtual {v0, p1}, Lcom/leisen/wallet/sdk/apdu/ApduManager;->requestGetCPLC(Ljava/lang/String;)V

    .line 277
    return-void
.end method

.method public getIIN(Ljava/lang/String;)V
    .locals 1

    .line 286
    iget-object v0, p0, Lcom/leisen/wallet/sdk/tsm/TSMOperator;->mApduManager:Lcom/leisen/wallet/sdk/apdu/ApduManager;

    invoke-virtual {v0, p1}, Lcom/leisen/wallet/sdk/apdu/ApduManager;->requestGetIIN(Ljava/lang/String;)V

    .line 287
    return-void
.end method

.method public installApplet(Lcom/leisen/wallet/sdk/bean/CommonRequestParams;Lcom/leisen/wallet/sdk/bean/OperAppletReqParams;)I
    .locals 4

    .line 163
    invoke-direct {p0, p1}, Lcom/leisen/wallet/sdk/tsm/TSMOperator;->checkCommonRequestParams(Lcom/leisen/wallet/sdk/bean/CommonRequestParams;)I

    move-result v2

    .line 164
    const/4 v0, -0x1

    if-eq v2, v0, :cond_0

    .line 165
    return v2

    .line 168
    :cond_0
    invoke-direct {p0, p2}, Lcom/leisen/wallet/sdk/tsm/TSMOperator;->checkOperAppetReqParams(Lcom/leisen/wallet/sdk/bean/OperAppletReqParams;)I

    move-result v3

    .line 169
    const/4 v0, -0x1

    if-eq v3, v0, :cond_1

    .line 170
    return v3

    .line 173
    :cond_1
    iget-object v0, p0, Lcom/leisen/wallet/sdk/tsm/TSMOperator;->mApduManager:Lcom/leisen/wallet/sdk/apdu/ApduManager;

    const/4 v1, 0x1

    invoke-virtual {v0, v1, p1, p2}, Lcom/leisen/wallet/sdk/apdu/ApduManager;->requestOperApplet(ILcom/leisen/wallet/sdk/bean/CommonRequestParams;Lcom/leisen/wallet/sdk/bean/OperAppletReqParams;)V

    .line 174
    iget v0, p0, Lcom/leisen/wallet/sdk/tsm/TSMOperator;->mOperatorResult:I

    return v0
.end method

.method public lockApplet(Lcom/leisen/wallet/sdk/bean/CommonRequestParams;Lcom/leisen/wallet/sdk/bean/OperAppletReqParams;)I
    .locals 4

    .line 195
    invoke-direct {p0, p1}, Lcom/leisen/wallet/sdk/tsm/TSMOperator;->checkCommonRequestParams(Lcom/leisen/wallet/sdk/bean/CommonRequestParams;)I

    move-result v2

    .line 196
    const/4 v0, -0x1

    if-eq v2, v0, :cond_0

    .line 197
    return v2

    .line 200
    :cond_0
    invoke-direct {p0, p2}, Lcom/leisen/wallet/sdk/tsm/TSMOperator;->checkOperAppetReqParams(Lcom/leisen/wallet/sdk/bean/OperAppletReqParams;)I

    move-result v3

    .line 201
    const/4 v0, -0x1

    if-eq v3, v0, :cond_1

    .line 202
    return v3

    .line 205
    :cond_1
    iget-object v0, p0, Lcom/leisen/wallet/sdk/tsm/TSMOperator;->mApduManager:Lcom/leisen/wallet/sdk/apdu/ApduManager;

    const/4 v1, 0x3

    invoke-virtual {v0, v1, p1, p2}, Lcom/leisen/wallet/sdk/apdu/ApduManager;->requestOperApplet(ILcom/leisen/wallet/sdk/bean/CommonRequestParams;Lcom/leisen/wallet/sdk/bean/OperAppletReqParams;)V

    .line 206
    iget v0, p0, Lcom/leisen/wallet/sdk/tsm/TSMOperator;->mOperatorResult:I

    return v0
.end method

.method public lockSSD(Lcom/leisen/wallet/sdk/bean/CommonRequestParams;Ljava/lang/String;)I
    .locals 3

    .line 133
    invoke-direct {p0, p1}, Lcom/leisen/wallet/sdk/tsm/TSMOperator;->checkCommonRequestParams(Lcom/leisen/wallet/sdk/bean/CommonRequestParams;)I

    move-result v2

    .line 134
    const/4 v0, -0x1

    if-eq v2, v0, :cond_0

    .line 135
    return v2

    .line 138
    :cond_0
    if-nez p2, :cond_1

    .line 139
    const v0, 0x186a5

    return v0

    .line 142
    :cond_1
    iget-object v0, p0, Lcom/leisen/wallet/sdk/tsm/TSMOperator;->mApduManager:Lcom/leisen/wallet/sdk/apdu/ApduManager;

    const/4 v1, 0x3

    invoke-virtual {v0, v1, p1, p2}, Lcom/leisen/wallet/sdk/apdu/ApduManager;->requestOperSSD(ILcom/leisen/wallet/sdk/bean/CommonRequestParams;Ljava/lang/String;)V

    .line 143
    iget v0, p0, Lcom/leisen/wallet/sdk/tsm/TSMOperator;->mOperatorResult:I

    return v0
.end method

.method public notifyEseInfoSync(Lcom/leisen/wallet/sdk/bean/CommonRequestParams;)I
    .locals 2

    .line 53
    invoke-direct {p0, p1}, Lcom/leisen/wallet/sdk/tsm/TSMOperator;->checkCommonRequestParams(Lcom/leisen/wallet/sdk/bean/CommonRequestParams;)I

    move-result v1

    .line 54
    const/4 v0, -0x1

    if-eq v1, v0, :cond_0

    .line 55
    return v1

    .line 57
    :cond_0
    iget-object v0, p0, Lcom/leisen/wallet/sdk/tsm/TSMOperator;->mApduManager:Lcom/leisen/wallet/sdk/apdu/ApduManager;

    invoke-virtual {v0, p1}, Lcom/leisen/wallet/sdk/apdu/ApduManager;->requestEseInfoSync(Lcom/leisen/wallet/sdk/bean/CommonRequestParams;)V

    .line 58
    iget v0, p0, Lcom/leisen/wallet/sdk/tsm/TSMOperator;->mOperatorResult:I

    return v0
.end method

.method public notifyInfoInit(Lcom/leisen/wallet/sdk/bean/CommonRequestParams;)I
    .locals 2

    .line 63
    invoke-direct {p0, p1}, Lcom/leisen/wallet/sdk/tsm/TSMOperator;->checkCommonRequestParams(Lcom/leisen/wallet/sdk/bean/CommonRequestParams;)I

    move-result v1

    .line 64
    const/4 v0, -0x1

    if-eq v1, v0, :cond_0

    .line 65
    return v1

    .line 67
    :cond_0
    iget-object v0, p0, Lcom/leisen/wallet/sdk/tsm/TSMOperator;->mApduManager:Lcom/leisen/wallet/sdk/apdu/ApduManager;

    invoke-virtual {v0, p1}, Lcom/leisen/wallet/sdk/apdu/ApduManager;->requestInfoInit(Lcom/leisen/wallet/sdk/bean/CommonRequestParams;)V

    .line 68
    iget v0, p0, Lcom/leisen/wallet/sdk/tsm/TSMOperator;->mOperatorResult:I

    return v0
.end method

.method public onOperFailure(ILjava/lang/Error;)V
    .locals 1

    .line 299
    iput p1, p0, Lcom/leisen/wallet/sdk/tsm/TSMOperator;->mOperatorResult:I

    .line 300
    iget-object v0, p0, Lcom/leisen/wallet/sdk/tsm/TSMOperator;->mTsmOperatorResponse:Lcom/leisen/wallet/sdk/tsm/TSMOperatorResponse;

    if-eqz v0, :cond_0

    .line 301
    iget-object v0, p0, Lcom/leisen/wallet/sdk/tsm/TSMOperator;->mTsmOperatorResponse:Lcom/leisen/wallet/sdk/tsm/TSMOperatorResponse;

    invoke-interface {v0, p1, p2}, Lcom/leisen/wallet/sdk/tsm/TSMOperatorResponse;->onOperFailure(ILjava/lang/Error;)V

    .line 303
    :cond_0
    return-void
.end method

.method public onOperSuccess(Ljava/lang/String;)V
    .locals 1

    .line 291
    const v0, 0x186a0

    iput v0, p0, Lcom/leisen/wallet/sdk/tsm/TSMOperator;->mOperatorResult:I

    .line 292
    iget-object v0, p0, Lcom/leisen/wallet/sdk/tsm/TSMOperator;->mTsmOperatorResponse:Lcom/leisen/wallet/sdk/tsm/TSMOperatorResponse;

    if-eqz v0, :cond_0

    .line 293
    iget-object v0, p0, Lcom/leisen/wallet/sdk/tsm/TSMOperator;->mTsmOperatorResponse:Lcom/leisen/wallet/sdk/tsm/TSMOperatorResponse;

    invoke-interface {v0, p1}, Lcom/leisen/wallet/sdk/tsm/TSMOperatorResponse;->onOperSuccess(Ljava/lang/String;)V

    .line 295
    :cond_0
    return-void
.end method

.method public setTsmOperatorResponse(Lcom/leisen/wallet/sdk/tsm/TSMOperatorResponse;)Lcom/leisen/wallet/sdk/tsm/TSMOperator;
    .locals 0

    .line 241
    iput-object p1, p0, Lcom/leisen/wallet/sdk/tsm/TSMOperator;->mTsmOperatorResponse:Lcom/leisen/wallet/sdk/tsm/TSMOperatorResponse;

    .line 242
    return-object p0
.end method

.method public unlockApplet(Lcom/leisen/wallet/sdk/bean/CommonRequestParams;Lcom/leisen/wallet/sdk/bean/OperAppletReqParams;)I
    .locals 4

    .line 211
    invoke-direct {p0, p1}, Lcom/leisen/wallet/sdk/tsm/TSMOperator;->checkCommonRequestParams(Lcom/leisen/wallet/sdk/bean/CommonRequestParams;)I

    move-result v2

    .line 212
    const/4 v0, -0x1

    if-eq v2, v0, :cond_0

    .line 213
    return v2

    .line 216
    :cond_0
    invoke-direct {p0, p2}, Lcom/leisen/wallet/sdk/tsm/TSMOperator;->checkOperAppetReqParams(Lcom/leisen/wallet/sdk/bean/OperAppletReqParams;)I

    move-result v3

    .line 217
    const/4 v0, -0x1

    if-eq v3, v0, :cond_1

    .line 218
    return v3

    .line 221
    :cond_1
    iget-object v0, p0, Lcom/leisen/wallet/sdk/tsm/TSMOperator;->mApduManager:Lcom/leisen/wallet/sdk/apdu/ApduManager;

    const/4 v1, 0x4

    invoke-virtual {v0, v1, p1, p2}, Lcom/leisen/wallet/sdk/apdu/ApduManager;->requestOperApplet(ILcom/leisen/wallet/sdk/bean/CommonRequestParams;Lcom/leisen/wallet/sdk/bean/OperAppletReqParams;)V

    .line 222
    iget v0, p0, Lcom/leisen/wallet/sdk/tsm/TSMOperator;->mOperatorResult:I

    return v0
.end method

.method public unlockSSD(Lcom/leisen/wallet/sdk/bean/CommonRequestParams;Ljava/lang/String;)I
    .locals 3

    .line 148
    invoke-direct {p0, p1}, Lcom/leisen/wallet/sdk/tsm/TSMOperator;->checkCommonRequestParams(Lcom/leisen/wallet/sdk/bean/CommonRequestParams;)I

    move-result v2

    .line 149
    const/4 v0, -0x1

    if-eq v2, v0, :cond_0

    .line 150
    return v2

    .line 153
    :cond_0
    if-nez p2, :cond_1

    .line 154
    const v0, 0x186a5

    return v0

    .line 157
    :cond_1
    iget-object v0, p0, Lcom/leisen/wallet/sdk/tsm/TSMOperator;->mApduManager:Lcom/leisen/wallet/sdk/apdu/ApduManager;

    const/4 v1, 0x4

    invoke-virtual {v0, v1, p1, p2}, Lcom/leisen/wallet/sdk/apdu/ApduManager;->requestOperSSD(ILcom/leisen/wallet/sdk/bean/CommonRequestParams;Ljava/lang/String;)V

    .line 158
    iget v0, p0, Lcom/leisen/wallet/sdk/tsm/TSMOperator;->mOperatorResult:I

    return v0
.end method
