.class public final Lcom/huawei/nfc/carrera/logic/spi/fm/impl/FMServiceImpl;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/huawei/nfc/carrera/logic/spi/fm/FMService;


# static fields
.field private static final APDU_EXCUTE_EXCEPTION:I = 0x235d

.field private static final EXIST_ISSUE_ORDER:I = 0x44f

.field private static final INVALID_SESSION:I = 0x233e

.field private static final LOCK:Ljava/lang/Object;

.field private static final PWORD:Ljava/lang/String; = "abcd1234"

.field private static final REPORT_ERROR:I = 0x2

.field private static final SUCCESS:I = 0x0

.field private static final SYSTEM_INNER_ERROR:I = 0x63

.field private static final SYSTEM_RETRY:I = 0x3fd

.field private static final TERMINALS_LINK_FAILURE:I = 0x2332

.field private static final USER_NOT_LOGIN:I = 0x3f1

.field private static final USER_NOT_REGISTER:I = 0x3e8

.field private static instance:Lcom/huawei/nfc/carrera/logic/spi/fm/impl/FMServiceImpl; = null


# instance fields
.field private isLogin:Z

.field private mApduHandler:Lcn/com/fmsh/script/ApduHandler;

.field private mContext:Landroid/content/Context;

.field private mNfcosClientManager:Lcn/com/fmsh/nfcos/client/libs/NfcosClientManager;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 62
    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lcom/huawei/nfc/carrera/logic/spi/fm/impl/FMServiceImpl;->LOCK:Ljava/lang/Object;

    .line 66
    const/4 v0, 0x0

    sput-object v0, Lcom/huawei/nfc/carrera/logic/spi/fm/impl/FMServiceImpl;->instance:Lcom/huawei/nfc/carrera/logic/spi/fm/impl/FMServiceImpl;

    return-void
.end method

.method private constructor <init>(Landroid/content/Context;)V
    .locals 2

    .line 126
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 64
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/nfc/carrera/logic/spi/fm/impl/FMServiceImpl;->mContext:Landroid/content/Context;

    .line 75
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/nfc/carrera/logic/spi/fm/impl/FMServiceImpl;->isLogin:Z

    .line 127
    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/nfc/carrera/logic/spi/fm/impl/FMServiceImpl;->mContext:Landroid/content/Context;

    .line 129
    invoke-static {}, Lcn/com/fmsh/nfcos/client/libs/NfcosClientManagerFactory;->getNfcosClientManager()Lcn/com/fmsh/nfcos/client/libs/NfcosClientManager;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/nfc/carrera/logic/spi/fm/impl/FMServiceImpl;->mNfcosClientManager:Lcn/com/fmsh/nfcos/client/libs/NfcosClientManager;

    .line 130
    new-instance v0, Lcom/huawei/nfc/carrera/logic/spi/fm/impl/FMApduHandlerImpl;

    iget-object v1, p0, Lcom/huawei/nfc/carrera/logic/spi/fm/impl/FMServiceImpl;->mContext:Landroid/content/Context;

    invoke-direct {v0, v1}, Lcom/huawei/nfc/carrera/logic/spi/fm/impl/FMApduHandlerImpl;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Lcom/huawei/nfc/carrera/logic/spi/fm/impl/FMServiceImpl;->mApduHandler:Lcn/com/fmsh/script/ApduHandler;

    .line 132
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/spi/fm/impl/FMServiceImpl;->mNfcosClientManager:Lcn/com/fmsh/nfcos/client/libs/NfcosClientManager;

    new-instance v1, Lcom/huawei/nfc/carrera/logic/spi/fm/impl/FMLog4Android;

    invoke-direct {v1}, Lcom/huawei/nfc/carrera/logic/spi/fm/impl/FMLog4Android;-><init>()V

    invoke-interface {v0, v1}, Lcn/com/fmsh/nfcos/client/libs/NfcosClientManager;->registerLogHandle(Lcn/com/fmsh/util/log/FMLog;)V

    .line 134
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/spi/fm/impl/FMServiceImpl;->mNfcosClientManager:Lcn/com/fmsh/nfcos/client/libs/NfcosClientManager;

    iget-object v1, p0, Lcom/huawei/nfc/carrera/logic/spi/fm/impl/FMServiceImpl;->mApduHandler:Lcn/com/fmsh/script/ApduHandler;

    invoke-interface {v0, v1}, Lcn/com/fmsh/nfcos/client/libs/NfcosClientManager;->registerApduHandler(Lcn/com/fmsh/script/ApduHandler;)V

    .line 135
    return-void
.end method

.method private bindNfcosService()V
    .locals 2

    .line 182
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/spi/fm/impl/FMServiceImpl;->mApduHandler:Lcn/com/fmsh/script/ApduHandler;

    if-nez v0, :cond_0

    .line 183
    new-instance v0, Lcom/huawei/nfc/carrera/logic/spi/fm/impl/FMApduHandlerImpl;

    iget-object v1, p0, Lcom/huawei/nfc/carrera/logic/spi/fm/impl/FMServiceImpl;->mContext:Landroid/content/Context;

    invoke-direct {v0, v1}, Lcom/huawei/nfc/carrera/logic/spi/fm/impl/FMApduHandlerImpl;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Lcom/huawei/nfc/carrera/logic/spi/fm/impl/FMServiceImpl;->mApduHandler:Lcn/com/fmsh/script/ApduHandler;

    .line 186
    :cond_0
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/spi/fm/impl/FMServiceImpl;->mNfcosClientManager:Lcn/com/fmsh/nfcos/client/libs/NfcosClientManager;

    if-nez v0, :cond_1

    .line 187
    invoke-static {}, Lcn/com/fmsh/nfcos/client/libs/NfcosClientManagerFactory;->getNfcosClientManager()Lcn/com/fmsh/nfcos/client/libs/NfcosClientManager;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/nfc/carrera/logic/spi/fm/impl/FMServiceImpl;->mNfcosClientManager:Lcn/com/fmsh/nfcos/client/libs/NfcosClientManager;

    .line 190
    :cond_1
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/spi/fm/impl/FMServiceImpl;->mNfcosClientManager:Lcn/com/fmsh/nfcos/client/libs/NfcosClientManager;

    iget-object v1, p0, Lcom/huawei/nfc/carrera/logic/spi/fm/impl/FMServiceImpl;->mApduHandler:Lcn/com/fmsh/script/ApduHandler;

    invoke-interface {v0, v1}, Lcn/com/fmsh/nfcos/client/libs/NfcosClientManager;->registerApduHandler(Lcn/com/fmsh/script/ApduHandler;)V

    .line 191
    return-void
.end method

.method private changeException2ErrorId(Ljava/lang/String;Lcn/com/fmsh/tsm/business/exception/BusinessException;)I
    .locals 4

    .line 1572
    const-string v0, "=========================================="

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->i(Ljava/lang/String;)V

    .line 1573
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "| FMServiceImpl, methodName ="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, " getErrorMsg = "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    .line 1574
    invoke-virtual {p2}, Lcn/com/fmsh/tsm/business/exception/BusinessException;->getErrorMsg()Lcn/com/fmsh/tsm/business/exception/BusinessException$ErrorMessage;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, " getDesc "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    .line 1575
    invoke-virtual {p2}, Lcn/com/fmsh/tsm/business/exception/BusinessException;->getErrorMsg()Lcn/com/fmsh/tsm/business/exception/BusinessException$ErrorMessage;

    move-result-object v1

    .line 1576
    invoke-virtual {v1}, Lcn/com/fmsh/tsm/business/exception/BusinessException$ErrorMessage;->getDesc()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, " getId "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    .line 1577
    invoke-virtual {p2}, Lcn/com/fmsh/tsm/business/exception/BusinessException;->getErrorMsg()Lcn/com/fmsh/tsm/business/exception/BusinessException$ErrorMessage;

    move-result-object v1

    .line 1578
    invoke-virtual {v1}, Lcn/com/fmsh/tsm/business/exception/BusinessException$ErrorMessage;->getId()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "|"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 1573
    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->i(Ljava/lang/String;)V

    .line 1579
    const-string v0, "=========================================="

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->i(Ljava/lang/String;)V

    .line 1581
    invoke-virtual {p2}, Lcn/com/fmsh/tsm/business/exception/BusinessException;->getErrorMsg()Lcn/com/fmsh/tsm/business/exception/BusinessException$ErrorMessage;

    move-result-object v0

    .line 1582
    invoke-virtual {v0}, Lcn/com/fmsh/tsm/business/exception/BusinessException$ErrorMessage;->getId()Ljava/lang/String;

    move-result-object v2

    .line 1585
    :try_start_0
    invoke-static {v2}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I
    :try_end_0
    .catch Ljava/lang/NumberFormatException; {:try_start_0 .. :try_end_0} :catch_0

    move-result v0

    return v0

    .line 1586
    :catch_0
    move-exception v3

    .line 1587
    const-string v0, "| FMServiceImpl, NumberFormatException |"

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->e(Ljava/lang/String;)V

    .line 1588
    const-string v0, "=========================================="

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->i(Ljava/lang/String;)V

    .line 1589
    const/4 v0, -0x1

    return v0
.end method

.method private checkNetAndIslogin(Lcom/huawei/nfc/carrera/logic/spi/fm/response/FMBaseResponse;)Z
    .locals 1

    .line 1544
    const-string v0, "FMServiceImpl, checkNetAndIslogin enter"

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->i(Ljava/lang/String;)V

    .line 1546
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/spi/fm/impl/FMServiceImpl;->mContext:Landroid/content/Context;

    invoke-static {v0}, Lo/ecz;->a(Landroid/content/Context;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 1547
    const-string v0, "FMServiceImpl, checkNetAndIslogin no network"

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->w(Ljava/lang/String;)V

    .line 1548
    const/4 v0, -0x2

    iput v0, p1, Lcom/huawei/nfc/carrera/logic/spi/fm/response/FMBaseResponse;->resultCode:I

    .line 1549
    const/4 v0, 0x0

    return v0

    .line 1552
    :cond_0
    invoke-direct {p0}, Lcom/huawei/nfc/carrera/logic/spi/fm/impl/FMServiceImpl;->bindNfcosService()V

    .line 1555
    iget-boolean v0, p0, Lcom/huawei/nfc/carrera/logic/spi/fm/impl/FMServiceImpl;->isLogin:Z

    if-nez v0, :cond_2

    .line 1556
    invoke-direct {p0, p1}, Lcom/huawei/nfc/carrera/logic/spi/fm/impl/FMServiceImpl;->login(Lcom/huawei/nfc/carrera/logic/spi/fm/response/FMBaseResponse;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 1557
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/huawei/nfc/carrera/logic/spi/fm/impl/FMServiceImpl;->isLogin:Z

    .line 1558
    const/4 v0, 0x1

    return v0

    .line 1561
    :cond_1
    const/4 v0, 0x0

    return v0

    .line 1564
    :cond_2
    const/4 v0, 0x1

    return v0
.end method

.method private getAppNo(Ljava/lang/String;)[B
    .locals 6

    .line 341
    const-string v0, "FMServiceImpl, getAppNo enter"

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->i(Ljava/lang/String;)V

    .line 343
    const/4 v2, 0x1

    .line 345
    new-instance v3, Lcn/com/fmsh/tsm/business/bean/CardAppInfo;

    invoke-direct {v3}, Lcn/com/fmsh/tsm/business/bean/CardAppInfo;-><init>()V

    .line 349
    :try_start_0
    invoke-direct {p0, p1}, Lcom/huawei/nfc/carrera/logic/spi/fm/impl/FMServiceImpl;->getCardAppType(Ljava/lang/String;)Lcn/com/fmsh/tsm/business/enums/EnumCardAppType;

    move-result-object v4

    .line 350
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/spi/fm/impl/FMServiceImpl;->mNfcosClientManager:Lcn/com/fmsh/nfcos/client/libs/NfcosClientManager;

    invoke-interface {v0, v2, v4}, Lcn/com/fmsh/nfcos/client/libs/NfcosClientManager;->getCardAppInfo(ILcn/com/fmsh/tsm/business/enums/EnumCardAppType;)Lcn/com/fmsh/tsm/business/bean/CardAppInfo;
    :try_end_0
    .catch Lcn/com/fmsh/tsm/business/exception/BusinessException; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v0

    move-object v3, v0

    .line 358
    goto :goto_0

    .line 356
    :catch_0
    move-exception v4

    .line 357
    const-string v0, "getAppNo"

    invoke-direct {p0, v0, v4}, Lcom/huawei/nfc/carrera/logic/spi/fm/impl/FMServiceImpl;->changeException2ErrorId(Ljava/lang/String;Lcn/com/fmsh/tsm/business/exception/BusinessException;)I

    move-result v5

    .line 360
    :goto_0
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "FMServiceImpl, getAppNo is "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    .line 361
    invoke-virtual {v3}, Lcn/com/fmsh/tsm/business/bean/CardAppInfo;->getCardAppNo()[B

    move-result-object v1

    invoke-static {v1}, Lcn/com/fmsh/util/FM_Bytes;->bytesToHexString([B)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 360
    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->w(Ljava/lang/String;)V

    .line 363
    invoke-virtual {v3}, Lcn/com/fmsh/tsm/business/bean/CardAppInfo;->getCardAppNo()[B

    move-result-object v0

    return-object v0
.end method

.method private getAppNoRecharge(Ljava/lang/String;)[B
    .locals 6

    .line 372
    const-string v0, "FMServiceImpl, getAppNoRecharge enter"

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->i(Ljava/lang/String;)V

    .line 374
    const-string v0, "A00000000386980701"

    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 375
    invoke-direct {p0, p1}, Lcom/huawei/nfc/carrera/logic/spi/fm/impl/FMServiceImpl;->getAppNo(Ljava/lang/String;)[B

    move-result-object v0

    return-object v0

    .line 378
    :cond_0
    const/16 v2, 0x10

    .line 380
    new-instance v3, Lcn/com/fmsh/tsm/business/bean/CardAppInfo;

    invoke-direct {v3}, Lcn/com/fmsh/tsm/business/bean/CardAppInfo;-><init>()V

    .line 384
    :try_start_0
    invoke-direct {p0, p1}, Lcom/huawei/nfc/carrera/logic/spi/fm/impl/FMServiceImpl;->getCardAppType(Ljava/lang/String;)Lcn/com/fmsh/tsm/business/enums/EnumCardAppType;

    move-result-object v4

    .line 385
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/spi/fm/impl/FMServiceImpl;->mNfcosClientManager:Lcn/com/fmsh/nfcos/client/libs/NfcosClientManager;

    invoke-interface {v0, v2, v4}, Lcn/com/fmsh/nfcos/client/libs/NfcosClientManager;->getCardAppInfo(ILcn/com/fmsh/tsm/business/enums/EnumCardAppType;)Lcn/com/fmsh/tsm/business/bean/CardAppInfo;
    :try_end_0
    .catch Lcn/com/fmsh/tsm/business/exception/BusinessException; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v0

    move-object v3, v0

    .line 393
    goto :goto_0

    .line 391
    :catch_0
    move-exception v4

    .line 392
    const-string v0, "getAppNo"

    invoke-direct {p0, v0, v4}, Lcom/huawei/nfc/carrera/logic/spi/fm/impl/FMServiceImpl;->changeException2ErrorId(Ljava/lang/String;Lcn/com/fmsh/tsm/business/exception/BusinessException;)I

    move-result v5

    .line 395
    :goto_0
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "FMServiceImpl, getMoc is "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v3}, Lcn/com/fmsh/tsm/business/bean/CardAppInfo;->getMoc()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->w(Ljava/lang/String;)V

    .line 397
    invoke-virtual {v3}, Lcn/com/fmsh/tsm/business/bean/CardAppInfo;->getMoc()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcn/com/fmsh/util/FM_Bytes;->hexStringToBytes(Ljava/lang/String;)[B

    move-result-object v0

    return-object v0
.end method

.method private getCardAppType(Ljava/lang/String;)Lcn/com/fmsh/tsm/business/enums/EnumCardAppType;
    .locals 3

    .line 1594
    const/4 v2, 0x0

    .line 1595
    const/4 v0, 0x0

    if-eq v0, p1, :cond_0

    const-string v0, ""

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 1596
    :cond_0
    const-string v0, "getCardAppType enter aid is null "

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->i(Ljava/lang/String;)V

    .line 1597
    return-object v2

    .line 1599
    :cond_1
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "getCardAppType aid : "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->i(Ljava/lang/String;)V

    .line 1600
    const-string v0, "A00000000386980701"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 1601
    sget-object v0, Lcn/com/fmsh/tsm/business/enums/EnumCardAppType;->CARD_APP_TYPE_SH:Lcn/com/fmsh/tsm/business/enums/EnumCardAppType;

    return-object v0

    .line 1602
    :cond_2
    const-string v0, "5943542E55534552"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 1603
    sget-object v0, Lcn/com/fmsh/tsm/business/enums/EnumCardAppType;->CARD_APP_TYPE_LNT:Lcn/com/fmsh/tsm/business/enums/EnumCardAppType;

    return-object v0

    .line 1605
    :cond_3
    const/4 v0, 0x0

    return-object v0
.end method

.method private getFmBaseResponse(Lcom/huawei/nfc/carrera/logic/spi/fm/response/FMBaseResponse;Lcn/com/fmsh/tsm/business/exception/BusinessException;)Lcom/huawei/nfc/carrera/logic/spi/fm/response/FMBaseResponse;
    .locals 2

    .line 766
    const-string v0, "retry installAndPersonalizeApplet"

    invoke-direct {p0, v0, p2}, Lcom/huawei/nfc/carrera/logic/spi/fm/impl/FMServiceImpl;->changeException2ErrorId(Ljava/lang/String;Lcn/com/fmsh/tsm/business/exception/BusinessException;)I

    move-result v1

    .line 767
    iput v1, p1, Lcom/huawei/nfc/carrera/logic/spi/fm/response/FMBaseResponse;->resultCode:I

    .line 769
    if-nez v1, :cond_0

    .line 770
    const/4 v0, 0x0

    iput v0, p1, Lcom/huawei/nfc/carrera/logic/spi/fm/response/FMBaseResponse;->resultCode:I

    goto :goto_0

    .line 772
    :cond_0
    const/16 v0, 0x233e

    if-ne v1, v0, :cond_1

    .line 773
    const/4 v0, -0x2

    iput v0, p1, Lcom/huawei/nfc/carrera/logic/spi/fm/response/FMBaseResponse;->resultCode:I

    .line 776
    :cond_1
    :goto_0
    return-object p1
.end method

.method public static getInstance(Landroid/content/Context;)Lcom/huawei/nfc/carrera/logic/spi/fm/FMService;
    .locals 3

    .line 117
    sget-object v1, Lcom/huawei/nfc/carrera/logic/spi/fm/impl/FMServiceImpl;->LOCK:Ljava/lang/Object;

    monitor-enter v1

    .line 118
    :try_start_0
    sget-object v0, Lcom/huawei/nfc/carrera/logic/spi/fm/impl/FMServiceImpl;->instance:Lcom/huawei/nfc/carrera/logic/spi/fm/impl/FMServiceImpl;

    if-nez v0, :cond_0

    .line 119
    new-instance v0, Lcom/huawei/nfc/carrera/logic/spi/fm/impl/FMServiceImpl;

    invoke-direct {v0, p0}, Lcom/huawei/nfc/carrera/logic/spi/fm/impl/FMServiceImpl;-><init>(Landroid/content/Context;)V

    sput-object v0, Lcom/huawei/nfc/carrera/logic/spi/fm/impl/FMServiceImpl;->instance:Lcom/huawei/nfc/carrera/logic/spi/fm/impl/FMServiceImpl;

    .line 121
    :cond_0
    sget-object v0, Lcom/huawei/nfc/carrera/logic/spi/fm/impl/FMServiceImpl;->instance:Lcom/huawei/nfc/carrera/logic/spi/fm/impl/FMServiceImpl;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v1

    return-object v0

    .line 122
    :catchall_0
    move-exception v2

    monitor-exit v1

    throw v2
.end method

.method private judgeApplyIssueOrderRequestValid(Lcom/huawei/nfc/carrera/logic/spi/fm/request/ApplyIssueOrderRequest;)Z
    .locals 2

    .line 405
    const/4 v0, 0x0

    if-eq v0, p1, :cond_0

    invoke-virtual {p1}, Lcom/huawei/nfc/carrera/logic/spi/fm/request/ApplyIssueOrderRequest;->getModule()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    invoke-static {v0, v1}, Lcom/huawei/nfc/carrera/util/StringUtil;->isEmpty(Ljava/lang/String;Z)Z

    move-result v0

    if-nez v0, :cond_0

    invoke-virtual {p1}, Lcom/huawei/nfc/carrera/logic/spi/fm/request/ApplyIssueOrderRequest;->getSeid()[B

    move-result-object v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 406
    invoke-virtual {p1}, Lcom/huawei/nfc/carrera/logic/spi/fm/request/ApplyIssueOrderRequest;->getSeid()[B

    move-result-object v0

    array-length v0, v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    invoke-virtual {p1}, Lcom/huawei/nfc/carrera/logic/spi/fm/request/ApplyIssueOrderRequest;->getActCode()[B

    move-result-object v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    invoke-virtual {p1}, Lcom/huawei/nfc/carrera/logic/spi/fm/request/ApplyIssueOrderRequest;->getActCode()[B

    move-result-object v0

    array-length v0, v0

    const/4 v1, 0x0

    if-ne v1, v0, :cond_1

    .line 407
    :cond_0
    const/4 v0, 0x0

    return v0

    .line 409
    :cond_1
    const/4 v0, 0x1

    return v0
.end method

.method private judgeDoIssueRequestValid(Lcom/huawei/nfc/carrera/logic/spi/fm/request/DoIssueRequest;)Z
    .locals 2

    .line 862
    const/4 v0, 0x0

    if-eq v0, p1, :cond_0

    iget-object v0, p1, Lcom/huawei/nfc/carrera/logic/spi/fm/request/DoIssueRequest;->order:[B

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    iget-object v0, p1, Lcom/huawei/nfc/carrera/logic/spi/fm/request/DoIssueRequest;->order:[B

    array-length v0, v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    iget-object v0, p1, Lcom/huawei/nfc/carrera/logic/spi/fm/request/DoIssueRequest;->seid:[B

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    iget-object v0, p1, Lcom/huawei/nfc/carrera/logic/spi/fm/request/DoIssueRequest;->seid:[B

    array-length v0, v0

    const/4 v1, 0x0

    if-ne v1, v0, :cond_1

    .line 864
    :cond_0
    const/4 v0, 0x0

    return v0

    .line 866
    :cond_1
    const/4 v0, 0x1

    return v0
.end method

.method private judgeQueryBusinessOrdersRequestValid(Lcom/huawei/nfc/carrera/logic/spi/fm/request/QueryBusinessOrdersRequest;)Z
    .locals 2

    .line 1238
    const/4 v0, 0x0

    if-eq v0, p1, :cond_0

    invoke-virtual {p1}, Lcom/huawei/nfc/carrera/logic/spi/fm/request/QueryBusinessOrdersRequest;->getOrderStatuses()[I

    move-result-object v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 1239
    invoke-virtual {p1}, Lcom/huawei/nfc/carrera/logic/spi/fm/request/QueryBusinessOrdersRequest;->getBusinessOrderType()I

    move-result v0

    const/4 v1, 0x2

    if-ne v0, v1, :cond_1

    .line 1240
    invoke-virtual {p1}, Lcom/huawei/nfc/carrera/logic/spi/fm/request/QueryBusinessOrdersRequest;->getSeid()[B

    move-result-object v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    invoke-virtual {p1}, Lcom/huawei/nfc/carrera/logic/spi/fm/request/QueryBusinessOrdersRequest;->getSeid()[B

    move-result-object v0

    array-length v0, v0

    const/4 v1, 0x0

    if-ne v1, v0, :cond_1

    .line 1241
    :cond_0
    const/4 v0, 0x0

    return v0

    .line 1243
    :cond_1
    const/4 v0, 0x1

    return v0
.end method

.method private judgeQueryProductsRequestValid(Lcom/huawei/nfc/carrera/logic/spi/fm/request/QueryProductsRequest;)Z
    .locals 2

    .line 1672
    const/4 v0, 0x0

    if-eq v0, p1, :cond_0

    invoke-virtual {p1}, Lcom/huawei/nfc/carrera/logic/spi/fm/request/QueryProductsRequest;->getAid()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    invoke-virtual {p1}, Lcom/huawei/nfc/carrera/logic/spi/fm/request/QueryProductsRequest;->getDeviceModel()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    if-ne v1, v0, :cond_1

    .line 1673
    :cond_0
    const/4 v0, 0x0

    return v0

    .line 1675
    :cond_1
    const/4 v0, 0x1

    return v0
.end method

.method private login(Lcom/huawei/nfc/carrera/logic/spi/fm/response/FMBaseResponse;)Z
    .locals 8

    .line 217
    const-string v0, "FMServiceImpl, login enter"

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->i(Ljava/lang/String;)V

    .line 218
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/spi/fm/impl/FMServiceImpl;->mContext:Landroid/content/Context;

    invoke-static {v0}, Lcom/huawei/login/ui/login/LoginInit;->getInstance(Landroid/content/Context;)Lcom/huawei/login/ui/login/LoginInit;

    move-result-object v0

    .line 219
    invoke-virtual {v0}, Lcom/huawei/login/ui/login/LoginInit;->getUsetId()Ljava/lang/String;

    move-result-object v2

    .line 221
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "FMServiceImpl, login userName = "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->i(Ljava/lang/String;)V

    .line 223
    const/4 v3, 0x0

    .line 225
    const/4 v4, 0x0

    .line 228
    :try_start_0
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/spi/fm/impl/FMServiceImpl;->mNfcosClientManager:Lcn/com/fmsh/nfcos/client/libs/NfcosClientManager;

    const-string v1, "abcd1234"

    invoke-interface {v0, v2, v1}, Lcn/com/fmsh/nfcos/client/libs/NfcosClientManager;->login(Ljava/lang/String;Ljava/lang/String;)Lcn/com/fmsh/tsm/business/bean/LoginInfo;

    move-result-object v4

    .line 232
    invoke-virtual {v4}, Lcn/com/fmsh/tsm/business/bean/LoginInfo;->getResult()I

    move-result v5

    .line 233
    iput v5, p1, Lcom/huawei/nfc/carrera/logic/spi/fm/response/FMBaseResponse;->FMCode:I

    .line 234
    iput v5, p1, Lcom/huawei/nfc/carrera/logic/spi/fm/response/FMBaseResponse;->resultCode:I

    .line 236
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "FMServiceImpl, login info  -getResult "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->i(Ljava/lang/String;)V

    .line 238
    if-nez v5, :cond_0

    .line 239
    const/4 v3, 0x1

    goto :goto_0

    .line 241
    :cond_0
    const/16 v0, 0x3e8

    if-ne v5, v0, :cond_1

    .line 242
    invoke-direct {p0, p1}, Lcom/huawei/nfc/carrera/logic/spi/fm/impl/FMServiceImpl;->register(Lcom/huawei/nfc/carrera/logic/spi/fm/response/FMBaseResponse;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 243
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/spi/fm/impl/FMServiceImpl;->mNfcosClientManager:Lcn/com/fmsh/nfcos/client/libs/NfcosClientManager;

    const-string v1, "abcd1234"

    invoke-interface {v0, v2, v1}, Lcn/com/fmsh/nfcos/client/libs/NfcosClientManager;->login(Ljava/lang/String;Ljava/lang/String;)Lcn/com/fmsh/tsm/business/bean/LoginInfo;

    move-result-object v4

    .line 244
    invoke-virtual {v4}, Lcn/com/fmsh/tsm/business/bean/LoginInfo;->getResult()I

    move-result v5

    .line 245
    iput v5, p1, Lcom/huawei/nfc/carrera/logic/spi/fm/response/FMBaseResponse;->FMCode:I

    .line 246
    iput v5, p1, Lcom/huawei/nfc/carrera/logic/spi/fm/response/FMBaseResponse;->resultCode:I

    .line 247
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "FMServiceImpl, login returnCode="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->i(Ljava/lang/String;)V

    .line 249
    if-nez v5, :cond_2

    .line 250
    const/4 v3, 0x1

    goto :goto_0

    .line 254
    :cond_1
    const/16 v0, 0x233e

    if-ne v5, v0, :cond_2

    .line 255
    const/4 v0, -0x2

    iput v0, p1, Lcom/huawei/nfc/carrera/logic/spi/fm/response/FMBaseResponse;->resultCode:I
    :try_end_0
    .catch Lcn/com/fmsh/tsm/business/exception/BusinessException; {:try_start_0 .. :try_end_0} :catch_0

    .line 288
    :cond_2
    :goto_0
    goto/16 :goto_2

    .line 262
    :catch_0
    move-exception v5

    .line 263
    const-string v0, "login"

    invoke-direct {p0, v0, v5}, Lcom/huawei/nfc/carrera/logic/spi/fm/impl/FMServiceImpl;->changeException2ErrorId(Ljava/lang/String;Lcn/com/fmsh/tsm/business/exception/BusinessException;)I

    move-result v6

    .line 264
    iput v6, p1, Lcom/huawei/nfc/carrera/logic/spi/fm/response/FMBaseResponse;->FMCode:I

    .line 265
    iput v6, p1, Lcom/huawei/nfc/carrera/logic/spi/fm/response/FMBaseResponse;->resultCode:I

    .line 267
    const/16 v0, 0x3e8

    if-ne v6, v0, :cond_3

    .line 268
    :try_start_1
    invoke-direct {p0, p1}, Lcom/huawei/nfc/carrera/logic/spi/fm/impl/FMServiceImpl;->register(Lcom/huawei/nfc/carrera/logic/spi/fm/response/FMBaseResponse;)Z

    move-result v0

    if-eqz v0, :cond_4

    .line 269
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/spi/fm/impl/FMServiceImpl;->mNfcosClientManager:Lcn/com/fmsh/nfcos/client/libs/NfcosClientManager;

    const-string v1, "abcd1234"

    invoke-interface {v0, v2, v1}, Lcn/com/fmsh/nfcos/client/libs/NfcosClientManager;->login(Ljava/lang/String;Ljava/lang/String;)Lcn/com/fmsh/tsm/business/bean/LoginInfo;

    move-result-object v4

    .line 270
    invoke-virtual {v4}, Lcn/com/fmsh/tsm/business/bean/LoginInfo;->getResult()I

    move-result v6

    .line 271
    iput v6, p1, Lcom/huawei/nfc/carrera/logic/spi/fm/response/FMBaseResponse;->FMCode:I

    .line 272
    iput v6, p1, Lcom/huawei/nfc/carrera/logic/spi/fm/response/FMBaseResponse;->resultCode:I

    .line 273
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "FMServiceImpl, login returnCode="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v6}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ",loginCode="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    .line 274
    invoke-virtual {v4}, Lcn/com/fmsh/tsm/business/bean/LoginInfo;->getResult()I

    move-result v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 273
    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->i(Ljava/lang/String;)V

    .line 276
    if-nez v6, :cond_4

    .line 277
    const/4 v3, 0x1

    goto :goto_1

    .line 281
    :cond_3
    const/16 v0, 0x233e

    if-ne v6, v0, :cond_4

    .line 282
    const/4 v0, -0x2

    iput v0, p1, Lcom/huawei/nfc/carrera/logic/spi/fm/response/FMBaseResponse;->resultCode:I
    :try_end_1
    .catch Lcn/com/fmsh/tsm/business/exception/BusinessException; {:try_start_1 .. :try_end_1} :catch_1

    .line 287
    :cond_4
    :goto_1
    goto :goto_2

    .line 285
    :catch_1
    move-exception v7

    .line 286
    const-string v0, "loginAgain"

    invoke-direct {p0, v0, v7}, Lcom/huawei/nfc/carrera/logic/spi/fm/impl/FMServiceImpl;->changeException2ErrorId(Ljava/lang/String;Lcn/com/fmsh/tsm/business/exception/BusinessException;)I

    .line 291
    :goto_2
    return v3
.end method

.method private register(Lcom/huawei/nfc/carrera/logic/spi/fm/response/FMBaseResponse;)Z
    .locals 6

    .line 301
    const-string v0, "FMServiceImpl, register enter"

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->i(Ljava/lang/String;)V

    .line 302
    const/4 v3, 0x0

    .line 309
    :try_start_0
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/spi/fm/impl/FMServiceImpl;->mNfcosClientManager:Lcn/com/fmsh/nfcos/client/libs/NfcosClientManager;

    iget-object v1, p0, Lcom/huawei/nfc/carrera/logic/spi/fm/impl/FMServiceImpl;->mContext:Landroid/content/Context;

    invoke-static {v1}, Lcom/huawei/login/ui/login/LoginInit;->getInstance(Landroid/content/Context;)Lcom/huawei/login/ui/login/LoginInit;

    move-result-object v1

    .line 310
    invoke-virtual {v1}, Lcom/huawei/login/ui/login/LoginInit;->getUsetId()Ljava/lang/String;

    move-result-object v1

    const-string v2, "abcd1234"

    .line 309
    invoke-interface {v0, v1, v2}, Lcn/com/fmsh/nfcos/client/libs/NfcosClientManager;->register(Ljava/lang/String;Ljava/lang/String;)I

    move-result v4

    .line 312
    iput v4, p1, Lcom/huawei/nfc/carrera/logic/spi/fm/response/FMBaseResponse;->FMCode:I

    .line 313
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "FMServiceImpl, register returnCode="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->i(Ljava/lang/String;)V

    .line 314
    if-nez v4, :cond_0

    .line 315
    const/4 v3, 0x1

    goto :goto_0

    .line 317
    :cond_0
    const/16 v0, 0x233e

    if-ne v4, v0, :cond_1

    .line 318
    const/4 v0, -0x2

    iput v0, p1, Lcom/huawei/nfc/carrera/logic/spi/fm/response/FMBaseResponse;->resultCode:I
    :try_end_0
    .catch Ljava/lang/IllegalStateException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Lcn/com/fmsh/tsm/business/exception/BusinessException; {:try_start_0 .. :try_end_0} :catch_1

    .line 329
    :cond_1
    :goto_0
    goto :goto_1

    .line 320
    :catch_0
    move-exception v4

    .line 321
    const-string v0, "FMServiceImpl, register IllegalStateException"

    invoke-static {v0, v4}, Lcom/huawei/nfc/carrera/util/LogX;->e(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 329
    goto :goto_1

    .line 322
    :catch_1
    move-exception v4

    .line 323
    const-string v0, "register"

    invoke-direct {p0, v0, v4}, Lcom/huawei/nfc/carrera/logic/spi/fm/impl/FMServiceImpl;->changeException2ErrorId(Ljava/lang/String;Lcn/com/fmsh/tsm/business/exception/BusinessException;)I

    move-result v5

    .line 325
    const/16 v0, 0x233e

    if-ne v5, v0, :cond_2

    .line 326
    const/4 v0, -0x2

    iput v0, p1, Lcom/huawei/nfc/carrera/logic/spi/fm/response/FMBaseResponse;->resultCode:I

    .line 331
    :cond_2
    :goto_1
    return v3
.end method


# virtual methods
.method public applyIssueOrder(Lcom/huawei/nfc/carrera/logic/spi/fm/request/ApplyIssueOrderRequest;I)Lcom/huawei/nfc/carrera/logic/spi/fm/response/MainOrderResponse;
    .locals 18

    .line 415
    const-string v0, "FMServiceImpl, applyIssueOrder enter"

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->i(Ljava/lang/String;)V

    .line 416
    new-instance v7, Lcom/huawei/nfc/carrera/logic/spi/fm/response/MainOrderResponse;

    invoke-direct {v7}, Lcom/huawei/nfc/carrera/logic/spi/fm/response/MainOrderResponse;-><init>()V

    .line 418
    move-object/from16 v0, p0

    move-object/from16 v1, p1

    invoke-direct {v0, v1}, Lcom/huawei/nfc/carrera/logic/spi/fm/impl/FMServiceImpl;->judgeApplyIssueOrderRequestValid(Lcom/huawei/nfc/carrera/logic/spi/fm/request/ApplyIssueOrderRequest;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 419
    const-string v0, "FMServiceImpl, applyIssueOrder illegal params"

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->e(Ljava/lang/String;)V

    .line 420
    return-object v7

    .line 423
    :cond_0
    move-object/from16 v0, p0

    invoke-direct {v0, v7}, Lcom/huawei/nfc/carrera/logic/spi/fm/impl/FMServiceImpl;->checkNetAndIslogin(Lcom/huawei/nfc/carrera/logic/spi/fm/response/FMBaseResponse;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 424
    return-object v7

    .line 429
    :cond_1
    invoke-virtual/range {p1 .. p1}, Lcom/huawei/nfc/carrera/logic/spi/fm/request/ApplyIssueOrderRequest;->getAmount()I

    move-result v8

    .line 430
    invoke-virtual/range {p1 .. p1}, Lcom/huawei/nfc/carrera/logic/spi/fm/request/ApplyIssueOrderRequest;->getModule()Ljava/lang/String;

    move-result-object v9

    .line 431
    invoke-virtual/range {p1 .. p1}, Lcom/huawei/nfc/carrera/logic/spi/fm/request/ApplyIssueOrderRequest;->getSeid()[B

    move-result-object v10

    .line 432
    invoke-virtual/range {p1 .. p1}, Lcom/huawei/nfc/carrera/logic/spi/fm/request/ApplyIssueOrderRequest;->getActCode()[B

    move-result-object v11

    .line 433
    invoke-virtual/range {p1 .. p1}, Lcom/huawei/nfc/carrera/logic/spi/fm/request/ApplyIssueOrderRequest;->getAid()Ljava/lang/String;

    move-result-object v0

    move-object/from16 v1, p0

    invoke-direct {v1, v0}, Lcom/huawei/nfc/carrera/logic/spi/fm/impl/FMServiceImpl;->getCardAppType(Ljava/lang/String;)Lcn/com/fmsh/tsm/business/enums/EnumCardAppType;

    move-result-object v12

    .line 440
    :try_start_0
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "FMServiceImpl, applyIssueOrder module="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, " amount "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v8}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, " seid "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    .line 441
    invoke-static {v10}, Lcn/com/fmsh/util/FM_Bytes;->bytesToHexString([B)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, " actCode.length "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    array-length v1, v11

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, " ; mode : "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    move/from16 v1, p2

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, " ; Aid : "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    .line 442
    invoke-virtual/range {p1 .. p1}, Lcom/huawei/nfc/carrera/logic/spi/fm/request/ApplyIssueOrderRequest;->getAid()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 440
    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->i(Ljava/lang/String;)V

    .line 456
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/nfc/carrera/logic/spi/fm/impl/FMServiceImpl;->mNfcosClientManager:Lcn/com/fmsh/nfcos/client/libs/NfcosClientManager;

    move-object v1, v12

    move v2, v8

    move/from16 v3, p2

    move-object v4, v10

    move-object v5, v9

    move-object v6, v11

    invoke-interface/range {v0 .. v6}, Lcn/com/fmsh/nfcos/client/libs/NfcosClientManager;->applyIssue(Lcn/com/fmsh/tsm/business/enums/EnumCardAppType;II[BLjava/lang/String;[B)Lcn/com/fmsh/tsm/business/bean/MainOrder;

    move-result-object v13

    .line 461
    const/4 v0, 0x0

    iput v0, v7, Lcom/huawei/nfc/carrera/logic/spi/fm/response/MainOrderResponse;->FMCode:I

    .line 462
    const/4 v0, 0x0

    iput v0, v7, Lcom/huawei/nfc/carrera/logic/spi/fm/response/MainOrderResponse;->resultCode:I

    .line 463
    invoke-static {v13}, Lcom/huawei/nfc/carrera/logic/spi/fm/impl/NfcParserUtil;->parseMainOrder2NfcType(Lcn/com/fmsh/tsm/business/bean/MainOrder;)Lcn/com/fmsh/nfcos/client/service/huawei/NfcosMainOrder;

    move-result-object v0

    iput-object v0, v7, Lcom/huawei/nfc/carrera/logic/spi/fm/response/MainOrderResponse;->order:Lcn/com/fmsh/nfcos/client/service/huawei/NfcosMainOrder;
    :try_end_0
    .catch Lcn/com/fmsh/tsm/business/exception/BusinessException; {:try_start_0 .. :try_end_0} :catch_0

    .line 553
    goto/16 :goto_1

    .line 502
    :catch_0
    move-exception v13

    .line 503
    const-string v0, "applyIssueOrder"

    move-object/from16 v1, p0

    invoke-direct {v1, v0, v13}, Lcom/huawei/nfc/carrera/logic/spi/fm/impl/FMServiceImpl;->changeException2ErrorId(Ljava/lang/String;Lcn/com/fmsh/tsm/business/exception/BusinessException;)I

    move-result v14

    .line 504
    const/16 v0, 0x44f

    if-ne v14, v0, :cond_2

    .line 505
    const/4 v0, 0x1

    iput v0, v7, Lcom/huawei/nfc/carrera/logic/spi/fm/response/MainOrderResponse;->resultCode:I

    goto/16 :goto_1

    .line 521
    :cond_2
    const/16 v0, 0x3f1

    if-eq v14, v0, :cond_3

    const/16 v0, 0x233e

    if-eq v14, v0, :cond_3

    const/16 v0, 0x2332

    if-ne v14, v0, :cond_7

    .line 523
    :cond_3
    const/4 v0, 0x0

    move-object/from16 v1, p0

    iput-boolean v0, v1, Lcom/huawei/nfc/carrera/logic/spi/fm/impl/FMServiceImpl;->isLogin:Z

    .line 524
    move-object/from16 v0, p0

    invoke-direct {v0, v7}, Lcom/huawei/nfc/carrera/logic/spi/fm/impl/FMServiceImpl;->login(Lcom/huawei/nfc/carrera/logic/spi/fm/response/FMBaseResponse;)Z

    move-result v0

    if-eqz v0, :cond_6

    .line 525
    const/4 v0, 0x1

    move-object/from16 v1, p0

    iput-boolean v0, v1, Lcom/huawei/nfc/carrera/logic/spi/fm/impl/FMServiceImpl;->isLogin:Z

    .line 526
    const/4 v15, 0x0

    .line 528
    move-object/from16 v0, p0

    :try_start_1
    iget-object v0, v0, Lcom/huawei/nfc/carrera/logic/spi/fm/impl/FMServiceImpl;->mNfcosClientManager:Lcn/com/fmsh/nfcos/client/libs/NfcosClientManager;

    move-object v1, v12

    move v2, v8

    move/from16 v3, p2

    move-object v4, v10

    move-object v5, v9

    move-object v6, v11

    invoke-interface/range {v0 .. v6}, Lcn/com/fmsh/nfcos/client/libs/NfcosClientManager;->applyIssue(Lcn/com/fmsh/tsm/business/enums/EnumCardAppType;II[BLjava/lang/String;[B)Lcn/com/fmsh/tsm/business/bean/MainOrder;

    move-result-object v15

    .line 533
    const/4 v0, 0x0

    iput v0, v7, Lcom/huawei/nfc/carrera/logic/spi/fm/response/MainOrderResponse;->FMCode:I

    .line 534
    const/4 v0, 0x0

    iput v0, v7, Lcom/huawei/nfc/carrera/logic/spi/fm/response/MainOrderResponse;->resultCode:I

    .line 535
    invoke-static {v15}, Lcom/huawei/nfc/carrera/logic/spi/fm/impl/NfcParserUtil;->parseMainOrder2NfcType(Lcn/com/fmsh/tsm/business/bean/MainOrder;)Lcn/com/fmsh/nfcos/client/service/huawei/NfcosMainOrder;

    move-result-object v0

    iput-object v0, v7, Lcom/huawei/nfc/carrera/logic/spi/fm/response/MainOrderResponse;->order:Lcn/com/fmsh/nfcos/client/service/huawei/NfcosMainOrder;
    :try_end_1
    .catch Lcn/com/fmsh/tsm/business/exception/BusinessException; {:try_start_1 .. :try_end_1} :catch_1

    .line 547
    goto :goto_0

    .line 537
    :catch_1
    move-exception v16

    .line 538
    const-string v0, "applyIssueOrder_BusinessException"

    move-object/from16 v1, p0

    move-object/from16 v2, v16

    invoke-direct {v1, v0, v2}, Lcom/huawei/nfc/carrera/logic/spi/fm/impl/FMServiceImpl;->changeException2ErrorId(Ljava/lang/String;Lcn/com/fmsh/tsm/business/exception/BusinessException;)I

    move-result v17

    .line 541
    move/from16 v0, v17

    const/16 v1, 0x44f

    if-ne v0, v1, :cond_4

    .line 542
    const/4 v0, 0x1

    iput v0, v7, Lcom/huawei/nfc/carrera/logic/spi/fm/response/MainOrderResponse;->resultCode:I

    goto :goto_0

    .line 544
    :cond_4
    move/from16 v0, v17

    const/16 v1, 0x233e

    if-ne v0, v1, :cond_5

    .line 545
    const/4 v0, -0x2

    iput v0, v7, Lcom/huawei/nfc/carrera/logic/spi/fm/response/MainOrderResponse;->resultCode:I

    .line 548
    :cond_5
    :goto_0
    goto :goto_1

    .line 550
    :cond_6
    return-object v7

    .line 554
    :cond_7
    :goto_1
    return-object v7
.end method

.method public applyIssueOrderByproduct(Lcom/huawei/nfc/carrera/logic/spi/fm/request/ApplyIssueOrderRequest;I)Lcom/huawei/nfc/carrera/logic/spi/fm/response/MainOrderResponse;
    .locals 18

    .line 1680
    const-string v0, "FMServiceImpl, applyIssueOrderByproduct enter"

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->i(Ljava/lang/String;)V

    .line 1681
    new-instance v7, Lcom/huawei/nfc/carrera/logic/spi/fm/response/MainOrderResponse;

    invoke-direct {v7}, Lcom/huawei/nfc/carrera/logic/spi/fm/response/MainOrderResponse;-><init>()V

    .line 1683
    move-object/from16 v0, p0

    move-object/from16 v1, p1

    invoke-direct {v0, v1}, Lcom/huawei/nfc/carrera/logic/spi/fm/impl/FMServiceImpl;->judgeApplyIssueOrderRequestValid(Lcom/huawei/nfc/carrera/logic/spi/fm/request/ApplyIssueOrderRequest;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 1684
    const-string v0, "FMServiceImpl, applyIssueOrderByproduct illegal params"

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->e(Ljava/lang/String;)V

    .line 1685
    return-object v7

    .line 1688
    :cond_0
    move-object/from16 v0, p0

    invoke-direct {v0, v7}, Lcom/huawei/nfc/carrera/logic/spi/fm/impl/FMServiceImpl;->checkNetAndIslogin(Lcom/huawei/nfc/carrera/logic/spi/fm/response/FMBaseResponse;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 1689
    return-object v7

    .line 1693
    :cond_1
    invoke-virtual/range {p1 .. p1}, Lcom/huawei/nfc/carrera/logic/spi/fm/request/ApplyIssueOrderRequest;->getProductCode()Ljava/lang/String;

    move-result-object v8

    .line 1694
    invoke-virtual/range {p1 .. p1}, Lcom/huawei/nfc/carrera/logic/spi/fm/request/ApplyIssueOrderRequest;->getModule()Ljava/lang/String;

    move-result-object v9

    .line 1695
    invoke-virtual/range {p1 .. p1}, Lcom/huawei/nfc/carrera/logic/spi/fm/request/ApplyIssueOrderRequest;->getSeid()[B

    move-result-object v10

    .line 1696
    invoke-virtual/range {p1 .. p1}, Lcom/huawei/nfc/carrera/logic/spi/fm/request/ApplyIssueOrderRequest;->getActCode()[B

    move-result-object v11

    .line 1697
    invoke-virtual/range {p1 .. p1}, Lcom/huawei/nfc/carrera/logic/spi/fm/request/ApplyIssueOrderRequest;->getAid()Ljava/lang/String;

    move-result-object v0

    move-object/from16 v1, p0

    invoke-direct {v1, v0}, Lcom/huawei/nfc/carrera/logic/spi/fm/impl/FMServiceImpl;->getCardAppType(Ljava/lang/String;)Lcn/com/fmsh/tsm/business/enums/EnumCardAppType;

    move-result-object v12

    .line 1701
    :try_start_0
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "FMServiceImpl, applyIssueOrderByproduct module="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, " product "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, " ; actCode : "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual/range {p1 .. p1}, Lcom/huawei/nfc/carrera/logic/spi/fm/request/ApplyIssueOrderRequest;->getActCode()[B

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, " seid "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    .line 1702
    invoke-virtual/range {p1 .. p1}, Lcom/huawei/nfc/carrera/logic/spi/fm/request/ApplyIssueOrderRequest;->getSeid()[B

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 1701
    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->i(Ljava/lang/String;)V

    .line 1716
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/nfc/carrera/logic/spi/fm/impl/FMServiceImpl;->mNfcosClientManager:Lcn/com/fmsh/nfcos/client/libs/NfcosClientManager;

    move-object v1, v12

    move-object v2, v8

    move/from16 v3, p2

    move-object v4, v10

    move-object v5, v9

    move-object v6, v11

    invoke-interface/range {v0 .. v6}, Lcn/com/fmsh/nfcos/client/libs/NfcosClientManager;->applyIssueByProduct(Lcn/com/fmsh/tsm/business/enums/EnumCardAppType;Ljava/lang/String;I[BLjava/lang/String;[B)Lcn/com/fmsh/tsm/business/bean/MainOrder;

    move-result-object v13

    .line 1721
    const/4 v0, 0x0

    iput v0, v7, Lcom/huawei/nfc/carrera/logic/spi/fm/response/MainOrderResponse;->FMCode:I

    .line 1722
    const/4 v0, 0x0

    iput v0, v7, Lcom/huawei/nfc/carrera/logic/spi/fm/response/MainOrderResponse;->resultCode:I

    .line 1723
    invoke-static {v13}, Lcom/huawei/nfc/carrera/logic/spi/fm/impl/NfcParserUtil;->parseMainOrder2NfcType(Lcn/com/fmsh/tsm/business/bean/MainOrder;)Lcn/com/fmsh/nfcos/client/service/huawei/NfcosMainOrder;

    move-result-object v0

    iput-object v0, v7, Lcom/huawei/nfc/carrera/logic/spi/fm/response/MainOrderResponse;->order:Lcn/com/fmsh/nfcos/client/service/huawei/NfcosMainOrder;
    :try_end_0
    .catch Lcn/com/fmsh/tsm/business/exception/BusinessException; {:try_start_0 .. :try_end_0} :catch_0

    .line 1758
    goto/16 :goto_1

    .line 1725
    :catch_0
    move-exception v13

    .line 1726
    const-string v0, "applyIssueOrderByproduct"

    move-object/from16 v1, p0

    invoke-direct {v1, v0, v13}, Lcom/huawei/nfc/carrera/logic/spi/fm/impl/FMServiceImpl;->changeException2ErrorId(Ljava/lang/String;Lcn/com/fmsh/tsm/business/exception/BusinessException;)I

    move-result v14

    .line 1727
    const/16 v0, 0x44f

    if-ne v14, v0, :cond_2

    .line 1728
    const/4 v0, 0x1

    iput v0, v7, Lcom/huawei/nfc/carrera/logic/spi/fm/response/MainOrderResponse;->resultCode:I

    goto/16 :goto_1

    .line 1729
    :cond_2
    const/16 v0, 0x3f1

    if-eq v14, v0, :cond_3

    const/16 v0, 0x233e

    if-eq v14, v0, :cond_3

    const/16 v0, 0x2332

    if-ne v14, v0, :cond_7

    .line 1730
    :cond_3
    const/4 v0, 0x0

    move-object/from16 v1, p0

    iput-boolean v0, v1, Lcom/huawei/nfc/carrera/logic/spi/fm/impl/FMServiceImpl;->isLogin:Z

    .line 1731
    move-object/from16 v0, p0

    invoke-direct {v0, v7}, Lcom/huawei/nfc/carrera/logic/spi/fm/impl/FMServiceImpl;->login(Lcom/huawei/nfc/carrera/logic/spi/fm/response/FMBaseResponse;)Z

    move-result v0

    if-eqz v0, :cond_6

    .line 1732
    const/4 v0, 0x1

    move-object/from16 v1, p0

    iput-boolean v0, v1, Lcom/huawei/nfc/carrera/logic/spi/fm/impl/FMServiceImpl;->isLogin:Z

    .line 1733
    const/4 v15, 0x0

    .line 1735
    move-object/from16 v0, p0

    :try_start_1
    iget-object v0, v0, Lcom/huawei/nfc/carrera/logic/spi/fm/impl/FMServiceImpl;->mNfcosClientManager:Lcn/com/fmsh/nfcos/client/libs/NfcosClientManager;

    move-object v1, v12

    move-object v2, v8

    move/from16 v3, p2

    move-object v4, v10

    move-object v5, v9

    move-object v6, v11

    invoke-interface/range {v0 .. v6}, Lcn/com/fmsh/nfcos/client/libs/NfcosClientManager;->applyIssueByProduct(Lcn/com/fmsh/tsm/business/enums/EnumCardAppType;Ljava/lang/String;I[BLjava/lang/String;[B)Lcn/com/fmsh/tsm/business/bean/MainOrder;

    move-result-object v15

    .line 1740
    const/4 v0, 0x0

    iput v0, v7, Lcom/huawei/nfc/carrera/logic/spi/fm/response/MainOrderResponse;->FMCode:I

    .line 1741
    const/4 v0, 0x0

    iput v0, v7, Lcom/huawei/nfc/carrera/logic/spi/fm/response/MainOrderResponse;->resultCode:I

    .line 1742
    invoke-static {v15}, Lcom/huawei/nfc/carrera/logic/spi/fm/impl/NfcParserUtil;->parseMainOrder2NfcType(Lcn/com/fmsh/tsm/business/bean/MainOrder;)Lcn/com/fmsh/nfcos/client/service/huawei/NfcosMainOrder;

    move-result-object v0

    iput-object v0, v7, Lcom/huawei/nfc/carrera/logic/spi/fm/response/MainOrderResponse;->order:Lcn/com/fmsh/nfcos/client/service/huawei/NfcosMainOrder;
    :try_end_1
    .catch Lcn/com/fmsh/tsm/business/exception/BusinessException; {:try_start_1 .. :try_end_1} :catch_1

    .line 1753
    goto :goto_0

    .line 1744
    :catch_1
    move-exception v16

    .line 1745
    const-string v0, "applyIssueOrderByproduct"

    move-object/from16 v1, p0

    move-object/from16 v2, v16

    invoke-direct {v1, v0, v2}, Lcom/huawei/nfc/carrera/logic/spi/fm/impl/FMServiceImpl;->changeException2ErrorId(Ljava/lang/String;Lcn/com/fmsh/tsm/business/exception/BusinessException;)I

    move-result v17

    .line 1748
    move/from16 v0, v17

    const/16 v1, 0x44f

    if-ne v0, v1, :cond_4

    .line 1749
    const/4 v0, 0x1

    iput v0, v7, Lcom/huawei/nfc/carrera/logic/spi/fm/response/MainOrderResponse;->resultCode:I

    goto :goto_0

    .line 1750
    :cond_4
    move/from16 v0, v17

    const/16 v1, 0x233e

    if-ne v0, v1, :cond_5

    .line 1751
    const/4 v0, -0x2

    iput v0, v7, Lcom/huawei/nfc/carrera/logic/spi/fm/response/MainOrderResponse;->resultCode:I

    .line 1754
    :cond_5
    :goto_0
    goto :goto_1

    .line 1755
    :cond_6
    return-object v7

    .line 1759
    :cond_7
    :goto_1
    return-object v7
.end method

.method public applyRechargeOrder(Lcom/huawei/nfc/carrera/logic/spi/fm/request/ApplyRechargeOrderRequest;I)Lcom/huawei/nfc/carrera/logic/spi/fm/response/MainOrderResponse;
    .locals 18

    .line 872
    const-string v0, "FMServiceImpl, applyRechargeOrder enter"

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->i(Ljava/lang/String;)V

    .line 873
    new-instance v6, Lcom/huawei/nfc/carrera/logic/spi/fm/response/MainOrderResponse;

    invoke-direct {v6}, Lcom/huawei/nfc/carrera/logic/spi/fm/response/MainOrderResponse;-><init>()V

    .line 875
    const/4 v0, 0x0

    move-object/from16 v1, p1

    if-eq v0, v1, :cond_0

    invoke-virtual/range {p1 .. p1}, Lcom/huawei/nfc/carrera/logic/spi/fm/request/ApplyRechargeOrderRequest;->getActCode()[B

    move-result-object v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    invoke-virtual/range {p1 .. p1}, Lcom/huawei/nfc/carrera/logic/spi/fm/request/ApplyRechargeOrderRequest;->getActCode()[B

    move-result-object v0

    array-length v0, v0

    const/4 v1, 0x0

    if-ne v1, v0, :cond_1

    .line 876
    :cond_0
    const-string v0, "FMServiceImpl, applyRechargeOrder illegal params"

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->e(Ljava/lang/String;)V

    .line 877
    return-object v6

    .line 880
    :cond_1
    move-object/from16 v0, p0

    invoke-direct {v0, v6}, Lcom/huawei/nfc/carrera/logic/spi/fm/impl/FMServiceImpl;->checkNetAndIslogin(Lcom/huawei/nfc/carrera/logic/spi/fm/response/FMBaseResponse;)Z

    move-result v0

    if-nez v0, :cond_2

    .line 881
    return-object v6

    .line 884
    :cond_2
    invoke-virtual/range {p1 .. p1}, Lcom/huawei/nfc/carrera/logic/spi/fm/request/ApplyRechargeOrderRequest;->getAid()Ljava/lang/String;

    move-result-object v7

    .line 887
    new-instance v8, Lcn/com/fmsh/nfcos/client/service/huawei/NfcosMainOrder;

    invoke-direct {v8}, Lcn/com/fmsh/nfcos/client/service/huawei/NfcosMainOrder;-><init>()V

    .line 888
    invoke-virtual/range {p1 .. p1}, Lcom/huawei/nfc/carrera/logic/spi/fm/request/ApplyRechargeOrderRequest;->getAmount()I

    move-result v9

    .line 889
    move-object/from16 v0, p0

    invoke-direct {v0, v7}, Lcom/huawei/nfc/carrera/logic/spi/fm/impl/FMServiceImpl;->getAppNoRecharge(Ljava/lang/String;)[B

    move-result-object v10

    .line 890
    invoke-virtual/range {p1 .. p1}, Lcom/huawei/nfc/carrera/logic/spi/fm/request/ApplyRechargeOrderRequest;->getActCode()[B

    move-result-object v11

    .line 891
    move-object/from16 v0, p0

    invoke-direct {v0, v7}, Lcom/huawei/nfc/carrera/logic/spi/fm/impl/FMServiceImpl;->getCardAppType(Ljava/lang/String;)Lcn/com/fmsh/tsm/business/enums/EnumCardAppType;

    move-result-object v12

    .line 908
    move-object/from16 v0, p0

    :try_start_0
    iget-object v0, v0, Lcom/huawei/nfc/carrera/logic/spi/fm/impl/FMServiceImpl;->mNfcosClientManager:Lcn/com/fmsh/nfcos/client/libs/NfcosClientManager;

    move-object v1, v12

    move v2, v9

    move/from16 v3, p2

    move-object v4, v10

    move-object v5, v11

    invoke-interface/range {v0 .. v5}, Lcn/com/fmsh/nfcos/client/libs/NfcosClientManager;->apply4PayEx(Lcn/com/fmsh/tsm/business/enums/EnumCardAppType;II[B[B)Lcn/com/fmsh/tsm/business/bean/MainOrder;

    move-result-object v13

    .line 913
    invoke-static {v13}, Lcom/huawei/nfc/carrera/logic/spi/fm/impl/NfcParserUtil;->parseMainOrder2NfcType(Lcn/com/fmsh/tsm/business/bean/MainOrder;)Lcn/com/fmsh/nfcos/client/service/huawei/NfcosMainOrder;

    move-result-object v0

    iput-object v0, v6, Lcom/huawei/nfc/carrera/logic/spi/fm/response/MainOrderResponse;->order:Lcn/com/fmsh/nfcos/client/service/huawei/NfcosMainOrder;

    .line 914
    const/4 v0, 0x0

    iput v0, v6, Lcom/huawei/nfc/carrera/logic/spi/fm/response/MainOrderResponse;->FMCode:I

    .line 915
    const/4 v0, 0x0

    iput v0, v6, Lcom/huawei/nfc/carrera/logic/spi/fm/response/MainOrderResponse;->resultCode:I
    :try_end_0
    .catch Lcn/com/fmsh/tsm/business/exception/BusinessException; {:try_start_0 .. :try_end_0} :catch_0

    .line 988
    goto/16 :goto_1

    .line 954
    :catch_0
    move-exception v13

    .line 955
    const-string v0, "applyRechargeOrder"

    move-object/from16 v1, p0

    invoke-direct {v1, v0, v13}, Lcom/huawei/nfc/carrera/logic/spi/fm/impl/FMServiceImpl;->changeException2ErrorId(Ljava/lang/String;Lcn/com/fmsh/tsm/business/exception/BusinessException;)I

    move-result v14

    .line 957
    const/16 v0, 0x3f1

    if-eq v14, v0, :cond_3

    const/16 v0, 0x233e

    if-eq v14, v0, :cond_3

    const/16 v0, 0x2332

    if-ne v14, v0, :cond_7

    .line 959
    :cond_3
    const/4 v0, 0x0

    move-object/from16 v1, p0

    iput-boolean v0, v1, Lcom/huawei/nfc/carrera/logic/spi/fm/impl/FMServiceImpl;->isLogin:Z

    .line 960
    move-object/from16 v0, p0

    invoke-direct {v0, v6}, Lcom/huawei/nfc/carrera/logic/spi/fm/impl/FMServiceImpl;->login(Lcom/huawei/nfc/carrera/logic/spi/fm/response/FMBaseResponse;)Z

    move-result v0

    if-eqz v0, :cond_6

    .line 961
    const/4 v0, 0x1

    move-object/from16 v1, p0

    iput-boolean v0, v1, Lcom/huawei/nfc/carrera/logic/spi/fm/impl/FMServiceImpl;->isLogin:Z

    .line 963
    const/4 v15, 0x0

    .line 965
    move-object/from16 v0, p0

    :try_start_1
    iget-object v0, v0, Lcom/huawei/nfc/carrera/logic/spi/fm/impl/FMServiceImpl;->mNfcosClientManager:Lcn/com/fmsh/nfcos/client/libs/NfcosClientManager;

    move-object v1, v12

    move v2, v9

    move/from16 v3, p2

    move-object v4, v10

    move-object v5, v11

    invoke-interface/range {v0 .. v5}, Lcn/com/fmsh/nfcos/client/libs/NfcosClientManager;->apply4PayEx(Lcn/com/fmsh/tsm/business/enums/EnumCardAppType;II[B[B)Lcn/com/fmsh/tsm/business/bean/MainOrder;

    move-result-object v15

    .line 968
    invoke-static {v15}, Lcom/huawei/nfc/carrera/logic/spi/fm/impl/NfcParserUtil;->parseMainOrder2NfcType(Lcn/com/fmsh/tsm/business/bean/MainOrder;)Lcn/com/fmsh/nfcos/client/service/huawei/NfcosMainOrder;

    move-result-object v0

    iput-object v0, v6, Lcom/huawei/nfc/carrera/logic/spi/fm/response/MainOrderResponse;->order:Lcn/com/fmsh/nfcos/client/service/huawei/NfcosMainOrder;

    .line 969
    const/4 v0, 0x0

    iput v0, v6, Lcom/huawei/nfc/carrera/logic/spi/fm/response/MainOrderResponse;->FMCode:I

    .line 970
    const/4 v0, 0x0

    iput v0, v6, Lcom/huawei/nfc/carrera/logic/spi/fm/response/MainOrderResponse;->resultCode:I
    :try_end_1
    .catch Lcn/com/fmsh/tsm/business/exception/BusinessException; {:try_start_1 .. :try_end_1} :catch_1

    .line 980
    goto :goto_0

    .line 971
    :catch_1
    move-exception v16

    .line 972
    const-string v0, "applyRechargeOrder"

    move-object/from16 v1, p0

    move-object/from16 v2, v16

    invoke-direct {v1, v0, v2}, Lcom/huawei/nfc/carrera/logic/spi/fm/impl/FMServiceImpl;->changeException2ErrorId(Ljava/lang/String;Lcn/com/fmsh/tsm/business/exception/BusinessException;)I

    move-result v17

    .line 973
    if-nez v17, :cond_4

    .line 974
    const/4 v0, 0x0

    iput v0, v6, Lcom/huawei/nfc/carrera/logic/spi/fm/response/MainOrderResponse;->resultCode:I

    .line 975
    iput-object v8, v6, Lcom/huawei/nfc/carrera/logic/spi/fm/response/MainOrderResponse;->order:Lcn/com/fmsh/nfcos/client/service/huawei/NfcosMainOrder;

    goto :goto_0

    .line 977
    :cond_4
    move/from16 v0, v17

    const/16 v1, 0x233e

    if-ne v0, v1, :cond_5

    .line 978
    const/4 v0, -0x2

    iput v0, v6, Lcom/huawei/nfc/carrera/logic/spi/fm/response/MainOrderResponse;->resultCode:I

    .line 982
    :cond_5
    :goto_0
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "FMServiceImpl, applyRechargeOrder returnCode="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v14}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->i(Ljava/lang/String;)V

    .line 983
    goto :goto_1

    .line 985
    :cond_6
    return-object v6

    .line 990
    :cond_7
    :goto_1
    return-object v6
.end method

.method public deleteApp(Lcom/huawei/nfc/carrera/logic/spi/fm/request/MoveOrDeleteAppRequest;)Lcom/huawei/nfc/carrera/logic/spi/fm/response/FMBaseResponse;
    .locals 2

    .line 1100
    const-string v0, "FMServiceImpl, deleteApp enter"

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->i(Ljava/lang/String;)V

    .line 1101
    new-instance v1, Lcom/huawei/nfc/carrera/logic/spi/fm/response/FMBaseResponse;

    invoke-direct {v1}, Lcom/huawei/nfc/carrera/logic/spi/fm/response/FMBaseResponse;-><init>()V

    .line 1102
    return-object v1
.end method

.method public doUnsolvedOrder(Lcom/huawei/nfc/carrera/logic/spi/fm/request/RechargeOrDoUnsolvedOrderRequest;)Lcom/huawei/nfc/carrera/logic/spi/fm/response/FMBaseResponse;
    .locals 8

    .line 1366
    const-string v0, "FMServiceImpl, doUnsolvedOrder enter"

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->i(Ljava/lang/String;)V

    .line 1367
    new-instance v2, Lcom/huawei/nfc/carrera/logic/spi/fm/response/FMBaseResponse;

    invoke-direct {v2}, Lcom/huawei/nfc/carrera/logic/spi/fm/response/FMBaseResponse;-><init>()V

    .line 1369
    const/4 v0, 0x0

    if-eq v0, p1, :cond_0

    invoke-virtual {p1}, Lcom/huawei/nfc/carrera/logic/spi/fm/request/RechargeOrDoUnsolvedOrderRequest;->getOrder()[B

    move-result-object v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    invoke-virtual {p1}, Lcom/huawei/nfc/carrera/logic/spi/fm/request/RechargeOrDoUnsolvedOrderRequest;->getOrder()[B

    move-result-object v0

    array-length v0, v0

    const/4 v1, 0x0

    if-ne v1, v0, :cond_1

    .line 1370
    :cond_0
    const-string v0, "FMServiceImpl, doUnsolvedOrder illegal params"

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->e(Ljava/lang/String;)V

    .line 1371
    return-object v2

    .line 1374
    :cond_1
    invoke-direct {p0, v2}, Lcom/huawei/nfc/carrera/logic/spi/fm/impl/FMServiceImpl;->checkNetAndIslogin(Lcom/huawei/nfc/carrera/logic/spi/fm/response/FMBaseResponse;)Z

    move-result v0

    if-nez v0, :cond_2

    .line 1375
    return-object v2

    .line 1379
    :cond_2
    invoke-virtual {p1}, Lcom/huawei/nfc/carrera/logic/spi/fm/request/RechargeOrDoUnsolvedOrderRequest;->getOrder()[B

    move-result-object v3

    .line 1383
    :try_start_0
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/spi/fm/impl/FMServiceImpl;->mNfcosClientManager:Lcn/com/fmsh/nfcos/client/libs/NfcosClientManager;

    invoke-interface {v0, v3, v3}, Lcn/com/fmsh/nfcos/client/libs/NfcosClientManager;->doUnsolvedOrder([B[B)I

    move-result v4

    .line 1385
    iput v4, v2, Lcom/huawei/nfc/carrera/logic/spi/fm/response/FMBaseResponse;->FMCode:I

    .line 1386
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "FMServiceImpl, doUnsolvedOrder returnCode="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->i(Ljava/lang/String;)V

    .line 1387
    if-nez v4, :cond_3

    .line 1388
    const/4 v0, 0x0

    iput v0, v2, Lcom/huawei/nfc/carrera/logic/spi/fm/response/FMBaseResponse;->resultCode:I

    goto :goto_0

    .line 1391
    :cond_3
    const/16 v0, 0x3f1

    if-eq v4, v0, :cond_4

    const/16 v0, 0x233e

    if-ne v4, v0, :cond_7

    .line 1392
    :cond_4
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/nfc/carrera/logic/spi/fm/impl/FMServiceImpl;->isLogin:Z

    .line 1393
    invoke-direct {p0, v2}, Lcom/huawei/nfc/carrera/logic/spi/fm/impl/FMServiceImpl;->login(Lcom/huawei/nfc/carrera/logic/spi/fm/response/FMBaseResponse;)Z

    move-result v0

    if-eqz v0, :cond_6

    .line 1394
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/huawei/nfc/carrera/logic/spi/fm/impl/FMServiceImpl;->isLogin:Z

    .line 1396
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/spi/fm/impl/FMServiceImpl;->mNfcosClientManager:Lcn/com/fmsh/nfcos/client/libs/NfcosClientManager;

    invoke-interface {v0, v3, v3}, Lcn/com/fmsh/nfcos/client/libs/NfcosClientManager;->doUnsolvedOrder([B[B)I

    move-result v4

    .line 1397
    iput v4, v2, Lcom/huawei/nfc/carrera/logic/spi/fm/response/FMBaseResponse;->FMCode:I

    .line 1398
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "FMServiceImpl, doUnsolvedOrder returnCode="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->i(Ljava/lang/String;)V

    .line 1399
    if-nez v4, :cond_5

    .line 1400
    const/4 v0, 0x0

    iput v0, v2, Lcom/huawei/nfc/carrera/logic/spi/fm/response/FMBaseResponse;->resultCode:I

    goto :goto_0

    .line 1402
    :cond_5
    const/16 v0, 0x233e

    if-ne v4, v0, :cond_7

    .line 1403
    const/4 v0, -0x2

    iput v0, v2, Lcom/huawei/nfc/carrera/logic/spi/fm/response/FMBaseResponse;->resultCode:I
    :try_end_0
    .catch Lcn/com/fmsh/tsm/business/exception/BusinessException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    .line 1407
    :cond_6
    return-object v2

    .line 1441
    :cond_7
    :goto_0
    goto/16 :goto_2

    .line 1412
    :catch_0
    move-exception v4

    .line 1413
    const-string v0, "doUnsolvedOrder"

    invoke-direct {p0, v0, v4}, Lcom/huawei/nfc/carrera/logic/spi/fm/impl/FMServiceImpl;->changeException2ErrorId(Ljava/lang/String;Lcn/com/fmsh/tsm/business/exception/BusinessException;)I

    move-result v5

    .line 1414
    const/16 v0, 0x3f1

    if-eq v5, v0, :cond_8

    const/16 v0, 0x233e

    if-ne v5, v0, :cond_d

    .line 1415
    :cond_8
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/nfc/carrera/logic/spi/fm/impl/FMServiceImpl;->isLogin:Z

    .line 1416
    invoke-direct {p0, v2}, Lcom/huawei/nfc/carrera/logic/spi/fm/impl/FMServiceImpl;->login(Lcom/huawei/nfc/carrera/logic/spi/fm/response/FMBaseResponse;)Z

    move-result v0

    if-eqz v0, :cond_c

    .line 1417
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/huawei/nfc/carrera/logic/spi/fm/impl/FMServiceImpl;->isLogin:Z

    .line 1420
    :try_start_1
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/spi/fm/impl/FMServiceImpl;->mNfcosClientManager:Lcn/com/fmsh/nfcos/client/libs/NfcosClientManager;

    invoke-interface {v0, v3, v3}, Lcn/com/fmsh/nfcos/client/libs/NfcosClientManager;->doUnsolvedOrder([B[B)I

    move-result v5

    .line 1421
    iput v5, v2, Lcom/huawei/nfc/carrera/logic/spi/fm/response/FMBaseResponse;->FMCode:I

    .line 1422
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "FMServiceImpl, doUnsolvedOrder returnCode="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->i(Ljava/lang/String;)V

    .line 1423
    if-nez v5, :cond_9

    .line 1424
    const/4 v0, 0x0

    iput v0, v2, Lcom/huawei/nfc/carrera/logic/spi/fm/response/FMBaseResponse;->resultCode:I

    goto :goto_1

    .line 1426
    :cond_9
    const/16 v0, 0x233e

    if-ne v5, v0, :cond_a

    .line 1427
    const/4 v0, -0x2

    iput v0, v2, Lcom/huawei/nfc/carrera/logic/spi/fm/response/FMBaseResponse;->resultCode:I
    :try_end_1
    .catch Lcn/com/fmsh/tsm/business/exception/BusinessException; {:try_start_1 .. :try_end_1} :catch_1

    .line 1435
    :cond_a
    :goto_1
    goto :goto_2

    .line 1430
    :catch_1
    move-exception v6

    .line 1431
    const-string v0, "doUnsolvedOrder"

    invoke-direct {p0, v0, v6}, Lcom/huawei/nfc/carrera/logic/spi/fm/impl/FMServiceImpl;->changeException2ErrorId(Ljava/lang/String;Lcn/com/fmsh/tsm/business/exception/BusinessException;)I

    move-result v7

    .line 1432
    const/16 v0, 0x233e

    if-ne v7, v0, :cond_b

    .line 1433
    const/4 v0, -0x2

    iput v0, v2, Lcom/huawei/nfc/carrera/logic/spi/fm/response/FMBaseResponse;->resultCode:I

    .line 1435
    :cond_b
    goto :goto_2

    .line 1438
    :cond_c
    return-object v2

    .line 1443
    :cond_d
    :goto_2
    return-object v2
.end method

.method public downloadCAP(Lcom/huawei/nfc/carrera/logic/spi/fm/request/DoIssueRequest;)Lcom/huawei/nfc/carrera/logic/spi/fm/response/FMBaseResponse;
    .locals 8

    .line 560
    const-string v0, "FMServiceImpl, downloadCAP enter"

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->i(Ljava/lang/String;)V

    .line 561
    new-instance v3, Lcom/huawei/nfc/carrera/logic/spi/fm/response/FMBaseResponse;

    invoke-direct {v3}, Lcom/huawei/nfc/carrera/logic/spi/fm/response/FMBaseResponse;-><init>()V

    .line 563
    const/4 v0, 0x0

    if-eq v0, p1, :cond_0

    iget-object v0, p1, Lcom/huawei/nfc/carrera/logic/spi/fm/request/DoIssueRequest;->order:[B

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    iget-object v0, p1, Lcom/huawei/nfc/carrera/logic/spi/fm/request/DoIssueRequest;->order:[B

    array-length v0, v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    iget-object v0, p1, Lcom/huawei/nfc/carrera/logic/spi/fm/request/DoIssueRequest;->seid:[B

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    iget-object v0, p1, Lcom/huawei/nfc/carrera/logic/spi/fm/request/DoIssueRequest;->seid:[B

    array-length v0, v0

    const/4 v1, 0x0

    if-ne v1, v0, :cond_1

    .line 565
    :cond_0
    const-string v0, "FMServiceImpl, downloadCAP illegal params"

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->e(Ljava/lang/String;)V

    .line 566
    return-object v3

    .line 569
    :cond_1
    invoke-direct {p0, v3}, Lcom/huawei/nfc/carrera/logic/spi/fm/impl/FMServiceImpl;->checkNetAndIslogin(Lcom/huawei/nfc/carrera/logic/spi/fm/response/FMBaseResponse;)Z

    move-result v0

    if-nez v0, :cond_2

    .line 570
    return-object v3

    .line 574
    :cond_2
    iget-object v4, p1, Lcom/huawei/nfc/carrera/logic/spi/fm/request/DoIssueRequest;->order:[B

    .line 575
    iget-object v5, p1, Lcom/huawei/nfc/carrera/logic/spi/fm/request/DoIssueRequest;->seid:[B

    .line 596
    :try_start_0
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/spi/fm/impl/FMServiceImpl;->mNfcosClientManager:Lcn/com/fmsh/nfcos/client/libs/NfcosClientManager;

    const/16 v1, 0x51

    const/4 v2, 0x0

    invoke-interface {v0, v4, v1, v5, v2}, Lcn/com/fmsh/nfcos/client/libs/NfcosClientManager;->doIssue([BI[B[B)I

    move-result v6

    .line 600
    iput v6, v3, Lcom/huawei/nfc/carrera/logic/spi/fm/response/FMBaseResponse;->FMCode:I

    .line 601
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "FMServiceImpl, downloadCAP returnCode="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v6}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->i(Ljava/lang/String;)V

    .line 602
    if-nez v6, :cond_3

    .line 603
    const/4 v0, 0x0

    iput v0, v3, Lcom/huawei/nfc/carrera/logic/spi/fm/response/FMBaseResponse;->resultCode:I

    goto :goto_0

    .line 606
    :cond_3
    const/16 v0, 0x3f1

    if-eq v6, v0, :cond_4

    const/16 v0, 0x233e

    if-ne v6, v0, :cond_7

    .line 607
    :cond_4
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/nfc/carrera/logic/spi/fm/impl/FMServiceImpl;->isLogin:Z

    .line 608
    invoke-direct {p0, v3}, Lcom/huawei/nfc/carrera/logic/spi/fm/impl/FMServiceImpl;->login(Lcom/huawei/nfc/carrera/logic/spi/fm/response/FMBaseResponse;)Z

    move-result v0

    if-eqz v0, :cond_6

    .line 609
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/huawei/nfc/carrera/logic/spi/fm/impl/FMServiceImpl;->isLogin:Z

    .line 611
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/spi/fm/impl/FMServiceImpl;->mNfcosClientManager:Lcn/com/fmsh/nfcos/client/libs/NfcosClientManager;

    const/16 v1, 0x51

    const/4 v2, 0x0

    invoke-interface {v0, v4, v1, v5, v2}, Lcn/com/fmsh/nfcos/client/libs/NfcosClientManager;->doIssue([BI[B[B)I

    move-result v6

    .line 614
    iput v6, v3, Lcom/huawei/nfc/carrera/logic/spi/fm/response/FMBaseResponse;->FMCode:I

    .line 615
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "FMServiceImpl, downloadCAP returnCode="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v6}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->i(Ljava/lang/String;)V

    .line 616
    if-nez v6, :cond_5

    .line 617
    const/4 v0, 0x0

    iput v0, v3, Lcom/huawei/nfc/carrera/logic/spi/fm/response/FMBaseResponse;->resultCode:I

    goto :goto_0

    .line 619
    :cond_5
    const/16 v0, 0x233e

    if-ne v6, v0, :cond_7

    .line 620
    const/4 v0, -0x2

    iput v0, v3, Lcom/huawei/nfc/carrera/logic/spi/fm/response/FMBaseResponse;->resultCode:I
    :try_end_0
    .catch Lcn/com/fmsh/tsm/business/exception/BusinessException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    .line 624
    :cond_6
    return-object v3

    .line 633
    :cond_7
    :goto_0
    goto :goto_1

    .line 631
    :catch_0
    move-exception v6

    .line 632
    const-string v0, "downloadCAP"

    invoke-direct {p0, v0, v6}, Lcom/huawei/nfc/carrera/logic/spi/fm/impl/FMServiceImpl;->changeException2ErrorId(Ljava/lang/String;Lcn/com/fmsh/tsm/business/exception/BusinessException;)I

    move-result v7

    .line 635
    :goto_1
    return-object v3
.end method

.method public installAndPersonalizeApplet(Lcom/huawei/nfc/carrera/logic/spi/fm/request/DoIssueRequest;)Lcom/huawei/nfc/carrera/logic/spi/fm/response/FMBaseResponse;
    .locals 9

    .line 641
    const-string v0, "FMServiceImpl, installAndPersonalizeApplet enter"

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->i(Ljava/lang/String;)V

    .line 642
    new-instance v3, Lcom/huawei/nfc/carrera/logic/spi/fm/response/FMBaseResponse;

    invoke-direct {v3}, Lcom/huawei/nfc/carrera/logic/spi/fm/response/FMBaseResponse;-><init>()V

    .line 644
    const/4 v0, 0x0

    if-eq v0, p1, :cond_0

    iget-object v0, p1, Lcom/huawei/nfc/carrera/logic/spi/fm/request/DoIssueRequest;->order:[B

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    iget-object v0, p1, Lcom/huawei/nfc/carrera/logic/spi/fm/request/DoIssueRequest;->order:[B

    array-length v0, v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    iget-object v0, p1, Lcom/huawei/nfc/carrera/logic/spi/fm/request/DoIssueRequest;->seid:[B

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    iget-object v0, p1, Lcom/huawei/nfc/carrera/logic/spi/fm/request/DoIssueRequest;->seid:[B

    array-length v0, v0

    const/4 v1, 0x0

    if-ne v1, v0, :cond_1

    .line 646
    :cond_0
    const-string v0, "FMServiceImpl, installAndPersonalizeApplet illegal params"

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->e(Ljava/lang/String;)V

    .line 647
    return-object v3

    .line 650
    :cond_1
    invoke-direct {p0, v3}, Lcom/huawei/nfc/carrera/logic/spi/fm/impl/FMServiceImpl;->checkNetAndIslogin(Lcom/huawei/nfc/carrera/logic/spi/fm/response/FMBaseResponse;)Z

    move-result v0

    if-nez v0, :cond_2

    .line 651
    return-object v3

    .line 655
    :cond_2
    iget-object v4, p1, Lcom/huawei/nfc/carrera/logic/spi/fm/request/DoIssueRequest;->order:[B

    .line 656
    iget-object v5, p1, Lcom/huawei/nfc/carrera/logic/spi/fm/request/DoIssueRequest;->seid:[B

    .line 658
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "FMServiceImpl, installAndPersonalizeApplet order="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    .line 659
    invoke-static {v4}, Lcn/com/fmsh/util/FM_Bytes;->bytesToHexString([B)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, " seid="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    .line 660
    invoke-static {v5}, Lcn/com/fmsh/util/FM_Bytes;->bytesToHexString([B)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 658
    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->i(Ljava/lang/String;)V

    .line 680
    :try_start_0
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/spi/fm/impl/FMServiceImpl;->mNfcosClientManager:Lcn/com/fmsh/nfcos/client/libs/NfcosClientManager;

    const/4 v1, 0x1

    const/4 v2, 0x0

    invoke-interface {v0, v4, v1, v5, v2}, Lcn/com/fmsh/nfcos/client/libs/NfcosClientManager;->doIssue([BI[B[B)I

    move-result v6

    .line 683
    iput v6, v3, Lcom/huawei/nfc/carrera/logic/spi/fm/response/FMBaseResponse;->FMCode:I

    .line 684
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "FMServiceImpl, installAndPersonalizeApplet returnCode="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v6}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->i(Ljava/lang/String;)V

    .line 685
    if-nez v6, :cond_3

    .line 686
    const/4 v0, 0x0

    iput v0, v3, Lcom/huawei/nfc/carrera/logic/spi/fm/response/FMBaseResponse;->resultCode:I

    goto :goto_0

    .line 689
    :cond_3
    const/16 v0, 0x3f1

    if-eq v6, v0, :cond_4

    const/16 v0, 0x233e

    if-ne v6, v0, :cond_6

    .line 690
    :cond_4
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/nfc/carrera/logic/spi/fm/impl/FMServiceImpl;->isLogin:Z

    .line 691
    invoke-direct {p0, v3}, Lcom/huawei/nfc/carrera/logic/spi/fm/impl/FMServiceImpl;->login(Lcom/huawei/nfc/carrera/logic/spi/fm/response/FMBaseResponse;)Z

    move-result v0

    if-eqz v0, :cond_6

    .line 692
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/huawei/nfc/carrera/logic/spi/fm/impl/FMServiceImpl;->isLogin:Z

    .line 694
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/spi/fm/impl/FMServiceImpl;->mNfcosClientManager:Lcn/com/fmsh/nfcos/client/libs/NfcosClientManager;

    const/4 v1, 0x1

    const/4 v2, 0x0

    invoke-interface {v0, v4, v1, v5, v2}, Lcn/com/fmsh/nfcos/client/libs/NfcosClientManager;->doIssue([BI[B[B)I

    move-result v6

    .line 697
    iput v6, v3, Lcom/huawei/nfc/carrera/logic/spi/fm/response/FMBaseResponse;->FMCode:I

    .line 698
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "FMServiceImpl, installAndPersonalizeApplet returnCode="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v6}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->i(Ljava/lang/String;)V

    .line 699
    if-nez v6, :cond_5

    .line 700
    const/4 v0, 0x0

    iput v0, v3, Lcom/huawei/nfc/carrera/logic/spi/fm/response/FMBaseResponse;->resultCode:I

    goto :goto_0

    .line 702
    :cond_5
    const/16 v0, 0x233e

    if-ne v6, v0, :cond_6

    .line 703
    const/4 v0, -0x2

    iput v0, v3, Lcom/huawei/nfc/carrera/logic/spi/fm/response/FMBaseResponse;->resultCode:I
    :try_end_0
    .catch Lcn/com/fmsh/tsm/business/exception/BusinessException; {:try_start_0 .. :try_end_0} :catch_0

    .line 708
    :cond_6
    :goto_0
    return-object v3

    .line 710
    :catch_0
    move-exception v6

    .line 711
    const-string v0, "installAndPersonalizeApplet"

    invoke-direct {p0, v0, v6}, Lcom/huawei/nfc/carrera/logic/spi/fm/impl/FMServiceImpl;->changeException2ErrorId(Ljava/lang/String;Lcn/com/fmsh/tsm/business/exception/BusinessException;)I

    move-result v7

    .line 712
    iput v7, v3, Lcom/huawei/nfc/carrera/logic/spi/fm/response/FMBaseResponse;->resultCode:I

    .line 713
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "FMServiceImpl, BusinessException returnCode="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v7}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->i(Ljava/lang/String;)V

    .line 717
    const/16 v0, 0x3f1

    if-eq v7, v0, :cond_7

    const/16 v0, 0x233e

    if-ne v7, v0, :cond_a

    .line 719
    :cond_7
    const/4 v0, 0x0

    :try_start_1
    iput-boolean v0, p0, Lcom/huawei/nfc/carrera/logic/spi/fm/impl/FMServiceImpl;->isLogin:Z

    .line 720
    invoke-direct {p0, v3}, Lcom/huawei/nfc/carrera/logic/spi/fm/impl/FMServiceImpl;->login(Lcom/huawei/nfc/carrera/logic/spi/fm/response/FMBaseResponse;)Z

    move-result v0

    if-eqz v0, :cond_e

    .line 721
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/huawei/nfc/carrera/logic/spi/fm/impl/FMServiceImpl;->isLogin:Z

    .line 722
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/spi/fm/impl/FMServiceImpl;->mApduHandler:Lcn/com/fmsh/script/ApduHandler;

    check-cast v0, Lcom/huawei/nfc/carrera/logic/spi/fm/impl/FMApduHandlerImpl;

    invoke-virtual {v0}, Lcom/huawei/nfc/carrera/logic/spi/fm/impl/FMApduHandlerImpl;->isBTConnect()Z
    :try_end_1
    .catch Lcn/com/fmsh/tsm/business/exception/BusinessException; {:try_start_1 .. :try_end_1} :catch_1

    move-result v0

    if-nez v0, :cond_8

    .line 723
    return-object v3

    .line 725
    :cond_8
    :try_start_2
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/spi/fm/impl/FMServiceImpl;->mNfcosClientManager:Lcn/com/fmsh/nfcos/client/libs/NfcosClientManager;

    const/4 v1, 0x1

    const/4 v2, 0x0

    invoke-interface {v0, v4, v1, v5, v2}, Lcn/com/fmsh/nfcos/client/libs/NfcosClientManager;->doIssue([BI[B[B)I

    move-result v7

    .line 728
    iput v7, v3, Lcom/huawei/nfc/carrera/logic/spi/fm/response/FMBaseResponse;->FMCode:I

    .line 729
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "FMServiceImpl, retry installAndPersonalizeApplet returnCode="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v7}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->i(Ljava/lang/String;)V

    .line 730
    if-nez v7, :cond_9

    .line 731
    const/4 v0, 0x0

    iput v0, v3, Lcom/huawei/nfc/carrera/logic/spi/fm/response/FMBaseResponse;->resultCode:I

    goto/16 :goto_1

    .line 733
    :cond_9
    const/16 v0, 0x233e

    if-ne v7, v0, :cond_e

    .line 734
    const/4 v0, -0x2

    iput v0, v3, Lcom/huawei/nfc/carrera/logic/spi/fm/response/FMBaseResponse;->resultCode:I

    goto :goto_1

    .line 738
    :cond_a
    const/16 v0, 0x3fd

    if-eq v7, v0, :cond_b

    const/4 v0, 0x2

    if-eq v7, v0, :cond_b

    const/16 v0, 0x63

    if-eq v7, v0, :cond_b

    const/16 v0, 0x2332

    if-ne v7, v0, :cond_e

    .line 740
    :cond_b
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/spi/fm/impl/FMServiceImpl;->mApduHandler:Lcn/com/fmsh/script/ApduHandler;

    check-cast v0, Lcom/huawei/nfc/carrera/logic/spi/fm/impl/FMApduHandlerImpl;

    invoke-virtual {v0}, Lcom/huawei/nfc/carrera/logic/spi/fm/impl/FMApduHandlerImpl;->isBTConnect()Z
    :try_end_2
    .catch Lcn/com/fmsh/tsm/business/exception/BusinessException; {:try_start_2 .. :try_end_2} :catch_1

    move-result v0

    if-nez v0, :cond_c

    .line 741
    return-object v3

    .line 743
    :cond_c
    :try_start_3
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/spi/fm/impl/FMServiceImpl;->mNfcosClientManager:Lcn/com/fmsh/nfcos/client/libs/NfcosClientManager;

    const/4 v1, 0x1

    const/4 v2, 0x0

    invoke-interface {v0, v4, v1, v5, v2}, Lcn/com/fmsh/nfcos/client/libs/NfcosClientManager;->doIssue([BI[B[B)I

    move-result v7

    .line 746
    iput v7, v3, Lcom/huawei/nfc/carrera/logic/spi/fm/response/FMBaseResponse;->FMCode:I

    .line 747
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "FMServiceImpl, retry installAndPersonalizeApplet returnCode="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v7}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->i(Ljava/lang/String;)V

    .line 748
    if-nez v7, :cond_d

    .line 749
    const/4 v0, 0x0

    iput v0, v3, Lcom/huawei/nfc/carrera/logic/spi/fm/response/FMBaseResponse;->resultCode:I

    goto :goto_1

    .line 751
    :cond_d
    const/16 v0, 0x233e

    if-ne v7, v0, :cond_e

    .line 752
    const/4 v0, -0x2

    iput v0, v3, Lcom/huawei/nfc/carrera/logic/spi/fm/response/FMBaseResponse;->resultCode:I
    :try_end_3
    .catch Lcn/com/fmsh/tsm/business/exception/BusinessException; {:try_start_3 .. :try_end_3} :catch_1

    .line 758
    :cond_e
    :goto_1
    goto :goto_2

    .line 756
    :catch_1
    move-exception v8

    .line 757
    invoke-direct {p0, v3, v8}, Lcom/huawei/nfc/carrera/logic/spi/fm/impl/FMServiceImpl;->getFmBaseResponse(Lcom/huawei/nfc/carrera/logic/spi/fm/response/FMBaseResponse;Lcn/com/fmsh/tsm/business/exception/BusinessException;)Lcom/huawei/nfc/carrera/logic/spi/fm/response/FMBaseResponse;

    move-result-object v0

    return-object v0

    .line 760
    :goto_2
    return-object v3
.end method

.method public moveApp(Lcom/huawei/nfc/carrera/logic/spi/fm/request/MoveOrDeleteAppRequest;)Lcom/huawei/nfc/carrera/logic/spi/fm/response/FMBaseResponse;
    .locals 2

    .line 1092
    const-string v0, "FMServiceImpl, moveApp enter"

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->i(Ljava/lang/String;)V

    .line 1093
    new-instance v1, Lcom/huawei/nfc/carrera/logic/spi/fm/response/FMBaseResponse;

    invoke-direct {v1}, Lcom/huawei/nfc/carrera/logic/spi/fm/response/FMBaseResponse;-><init>()V

    .line 1094
    return-object v1
.end method

.method public queryBusinessOrder(Lcom/huawei/nfc/carrera/logic/spi/fm/request/QueryBusinessOrderRequest;)Lcom/huawei/nfc/carrera/logic/spi/fm/response/QueryBusinessOrderResponse;
    .locals 9

    .line 1449
    const-string v0, "FMServiceImpl, queryBusinessOrder enter"

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->i(Ljava/lang/String;)V

    .line 1450
    new-instance v1, Lcom/huawei/nfc/carrera/logic/spi/fm/response/QueryBusinessOrderResponse;

    invoke-direct {v1}, Lcom/huawei/nfc/carrera/logic/spi/fm/response/QueryBusinessOrderResponse;-><init>()V

    .line 1451
    if-eqz p1, :cond_0

    iget-object v0, p1, Lcom/huawei/nfc/carrera/logic/spi/fm/request/QueryBusinessOrderRequest;->order:[B

    if-eqz v0, :cond_0

    iget-object v0, p1, Lcom/huawei/nfc/carrera/logic/spi/fm/request/QueryBusinessOrderRequest;->order:[B

    array-length v0, v0

    if-nez v0, :cond_1

    .line 1452
    :cond_0
    const-string v0, "FMServiceImpl, queryBusinessOrder illegal params"

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->e(Ljava/lang/String;)V

    .line 1453
    return-object v1

    .line 1456
    :cond_1
    invoke-direct {p0, v1}, Lcom/huawei/nfc/carrera/logic/spi/fm/impl/FMServiceImpl;->checkNetAndIslogin(Lcom/huawei/nfc/carrera/logic/spi/fm/response/FMBaseResponse;)Z

    move-result v0

    if-nez v0, :cond_2

    .line 1457
    return-object v1

    .line 1461
    :cond_2
    new-instance v2, Lcn/com/fmsh/nfcos/client/service/huawei/NfcosBusinessOrder;

    invoke-direct {v2}, Lcn/com/fmsh/nfcos/client/service/huawei/NfcosBusinessOrder;-><init>()V

    .line 1462
    iget-object v3, p1, Lcom/huawei/nfc/carrera/logic/spi/fm/request/QueryBusinessOrderRequest;->order:[B

    .line 1465
    :try_start_0
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/spi/fm/impl/FMServiceImpl;->mNfcosClientManager:Lcn/com/fmsh/nfcos/client/libs/NfcosClientManager;

    invoke-interface {v0, v3}, Lcn/com/fmsh/nfcos/client/libs/NfcosClientManager;->queryBusinessOrder([B)Lcn/com/fmsh/tsm/business/bean/BusinessOrder;

    move-result-object v4

    .line 1467
    const/4 v0, 0x0

    iput v0, v1, Lcom/huawei/nfc/carrera/logic/spi/fm/response/QueryBusinessOrderResponse;->FMCode:I

    .line 1468
    const/4 v0, 0x0

    iput v0, v1, Lcom/huawei/nfc/carrera/logic/spi/fm/response/QueryBusinessOrderResponse;->resultCode:I

    .line 1469
    invoke-static {v4}, Lcom/huawei/nfc/carrera/logic/spi/fm/impl/NfcParserUtil;->parseBusinessOrder2NfcosType(Lcn/com/fmsh/tsm/business/bean/BusinessOrder;)Lcn/com/fmsh/nfcos/client/service/huawei/NfcosBusinessOrder;

    move-result-object v0

    iput-object v0, v1, Lcom/huawei/nfc/carrera/logic/spi/fm/response/QueryBusinessOrderResponse;->order:Lcn/com/fmsh/nfcos/client/service/huawei/NfcosBusinessOrder;
    :try_end_0
    .catch Lcn/com/fmsh/tsm/business/exception/BusinessException; {:try_start_0 .. :try_end_0} :catch_0

    .line 1532
    goto :goto_1

    .line 1508
    :catch_0
    move-exception v4

    .line 1509
    const-string v0, "queryBusinessOrder"

    invoke-direct {p0, v0, v4}, Lcom/huawei/nfc/carrera/logic/spi/fm/impl/FMServiceImpl;->changeException2ErrorId(Ljava/lang/String;Lcn/com/fmsh/tsm/business/exception/BusinessException;)I

    move-result v5

    .line 1511
    const/16 v0, 0x3f1

    if-eq v5, v0, :cond_3

    const/16 v0, 0x233e

    if-ne v5, v0, :cond_6

    .line 1512
    :cond_3
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/nfc/carrera/logic/spi/fm/impl/FMServiceImpl;->isLogin:Z

    .line 1513
    invoke-direct {p0, v1}, Lcom/huawei/nfc/carrera/logic/spi/fm/impl/FMServiceImpl;->login(Lcom/huawei/nfc/carrera/logic/spi/fm/response/FMBaseResponse;)Z

    move-result v0

    if-eqz v0, :cond_5

    .line 1514
    const/4 v6, 0x0

    .line 1516
    :try_start_1
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/spi/fm/impl/FMServiceImpl;->mNfcosClientManager:Lcn/com/fmsh/nfcos/client/libs/NfcosClientManager;

    invoke-interface {v0, v3}, Lcn/com/fmsh/nfcos/client/libs/NfcosClientManager;->queryBusinessOrder([B)Lcn/com/fmsh/tsm/business/bean/BusinessOrder;

    move-result-object v6

    .line 1517
    const/4 v0, 0x0

    iput v0, v1, Lcom/huawei/nfc/carrera/logic/spi/fm/response/QueryBusinessOrderResponse;->FMCode:I

    .line 1518
    const/4 v0, 0x0

    iput v0, v1, Lcom/huawei/nfc/carrera/logic/spi/fm/response/QueryBusinessOrderResponse;->resultCode:I

    .line 1519
    invoke-static {v6}, Lcom/huawei/nfc/carrera/logic/spi/fm/impl/NfcParserUtil;->parseBusinessOrder2NfcosType(Lcn/com/fmsh/tsm/business/bean/BusinessOrder;)Lcn/com/fmsh/nfcos/client/service/huawei/NfcosBusinessOrder;

    move-result-object v0

    iput-object v0, v1, Lcom/huawei/nfc/carrera/logic/spi/fm/response/QueryBusinessOrderResponse;->order:Lcn/com/fmsh/nfcos/client/service/huawei/NfcosBusinessOrder;
    :try_end_1
    .catch Lcn/com/fmsh/tsm/business/exception/BusinessException; {:try_start_1 .. :try_end_1} :catch_1

    .line 1525
    goto :goto_0

    .line 1520
    :catch_1
    move-exception v7

    .line 1521
    const-string v0, "queryBusinessOrder"

    invoke-direct {p0, v0, v7}, Lcom/huawei/nfc/carrera/logic/spi/fm/impl/FMServiceImpl;->changeException2ErrorId(Ljava/lang/String;Lcn/com/fmsh/tsm/business/exception/BusinessException;)I

    move-result v8

    .line 1522
    const/16 v0, 0x233e

    if-ne v8, v0, :cond_4

    .line 1523
    const/4 v0, -0x2

    iput v0, v1, Lcom/huawei/nfc/carrera/logic/spi/fm/response/QueryBusinessOrderResponse;->resultCode:I

    .line 1527
    :cond_4
    :goto_0
    goto :goto_1

    .line 1529
    :cond_5
    return-object v1

    .line 1534
    :cond_6
    :goto_1
    return-object v1
.end method

.method public queryBusinessOrders(Lcom/huawei/nfc/carrera/logic/spi/fm/request/QueryBusinessOrdersRequest;)Lcom/huawei/nfc/carrera/logic/spi/fm/response/QueryBusinessOrdersResponse;
    .locals 23

    .line 1108
    const-string v0, "FMServiceImpl, queryBusinessOrders enter"

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->i(Ljava/lang/String;)V

    .line 1109
    new-instance v7, Lcom/huawei/nfc/carrera/logic/spi/fm/response/QueryBusinessOrdersResponse;

    invoke-direct {v7}, Lcom/huawei/nfc/carrera/logic/spi/fm/response/QueryBusinessOrdersResponse;-><init>()V

    .line 1110
    move-object/from16 v0, p0

    move-object/from16 v1, p1

    invoke-direct {v0, v1}, Lcom/huawei/nfc/carrera/logic/spi/fm/impl/FMServiceImpl;->judgeQueryBusinessOrdersRequestValid(Lcom/huawei/nfc/carrera/logic/spi/fm/request/QueryBusinessOrdersRequest;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 1111
    const-string v0, "FMServiceImpl, queryBusinessOrders illegal params"

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->e(Ljava/lang/String;)V

    .line 1112
    return-object v7

    .line 1115
    :cond_0
    move-object/from16 v0, p0

    invoke-direct {v0, v7}, Lcom/huawei/nfc/carrera/logic/spi/fm/impl/FMServiceImpl;->checkNetAndIslogin(Lcom/huawei/nfc/carrera/logic/spi/fm/response/FMBaseResponse;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 1116
    return-object v7

    .line 1120
    :cond_1
    new-instance v8, Ljava/util/ArrayList;

    invoke-direct {v8}, Ljava/util/ArrayList;-><init>()V

    .line 1123
    invoke-virtual/range {p1 .. p1}, Lcom/huawei/nfc/carrera/logic/spi/fm/request/QueryBusinessOrdersRequest;->getStart()I

    move-result v9

    .line 1124
    const/16 v10, 0xa

    .line 1125
    invoke-virtual/range {p1 .. p1}, Lcom/huawei/nfc/carrera/logic/spi/fm/request/QueryBusinessOrdersRequest;->getBusinessOrderType()I

    move-result v11

    .line 1126
    const/4 v12, 0x0

    .line 1127
    invoke-virtual/range {p1 .. p1}, Lcom/huawei/nfc/carrera/logic/spi/fm/request/QueryBusinessOrdersRequest;->getOrderStatuses()[I

    move-result-object v13

    .line 1128
    invoke-virtual/range {p1 .. p1}, Lcom/huawei/nfc/carrera/logic/spi/fm/request/QueryBusinessOrdersRequest;->getAid()Ljava/lang/String;

    move-result-object v14

    .line 1129
    move-object/from16 v0, p0

    invoke-direct {v0, v14}, Lcom/huawei/nfc/carrera/logic/spi/fm/impl/FMServiceImpl;->getCardAppType(Ljava/lang/String;)Lcn/com/fmsh/tsm/business/enums/EnumCardAppType;

    move-result-object v15

    .line 1131
    const/4 v0, 0x2

    if-ne v11, v0, :cond_2

    .line 1132
    invoke-virtual/range {p1 .. p1}, Lcom/huawei/nfc/carrera/logic/spi/fm/request/QueryBusinessOrdersRequest;->getSeid()[B

    move-result-object v12

    goto :goto_0

    .line 1135
    :cond_2
    move-object/from16 v0, p0

    invoke-direct {v0, v14}, Lcom/huawei/nfc/carrera/logic/spi/fm/impl/FMServiceImpl;->getAppNoRecharge(Ljava/lang/String;)[B

    move-result-object v12

    .line 1137
    if-nez v12, :cond_3

    .line 1138
    const-string v0, "FMServiceImpl, queryBusinessOrders appNoOrSeid == null"

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->e(Ljava/lang/String;)V

    .line 1139
    return-object v7

    .line 1143
    :cond_3
    :goto_0
    invoke-static {v11}, Lcom/huawei/nfc/carrera/logic/spi/fm/impl/NfcParserUtil;->getEnumBusinessOrderType(I)Lcn/com/fmsh/tsm/business/enums/EnumBusinessOrderType;

    move-result-object v16

    .line 1144
    invoke-static {v13}, Lcom/huawei/nfc/carrera/logic/spi/fm/impl/NfcParserUtil;->getEnumOrderStatuses([I)Ljava/util/ArrayList;

    move-result-object v17

    .line 1154
    move-object/from16 v0, p0

    :try_start_0
    iget-object v0, v0, Lcom/huawei/nfc/carrera/logic/spi/fm/impl/FMServiceImpl;->mNfcosClientManager:Lcn/com/fmsh/nfcos/client/libs/NfcosClientManager;

    move v1, v9

    move v2, v10

    move-object v3, v15

    move-object/from16 v4, v16

    move-object/from16 v5, v17

    move-object v6, v12

    const/16 v2, 0xa

    invoke-interface/range {v0 .. v6}, Lcn/com/fmsh/nfcos/client/libs/NfcosClientManager;->queryBusinessOrders(IILcn/com/fmsh/tsm/business/enums/EnumCardAppType;Lcn/com/fmsh/tsm/business/enums/EnumBusinessOrderType;Ljava/util/List;[B)Ljava/util/List;

    move-result-object v18

    .line 1161
    invoke-interface/range {v18 .. v18}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v19

    :goto_1
    invoke-interface/range {v19 .. v19}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_4

    invoke-interface/range {v19 .. v19}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object/from16 v20, v0

    check-cast v20, Lcn/com/fmsh/tsm/business/bean/BusinessOrder;

    .line 1162
    const-string v0, "FMServiceImpl, queryBusinessOrder businessOrder getOrder "

    .line 1163
    invoke-virtual/range {v20 .. v20}, Lcn/com/fmsh/tsm/business/bean/BusinessOrder;->getOrder()[B

    move-result-object v1

    invoke-static {v1}, Lcn/com/fmsh/util/FM_Bytes;->bytesToHexString([B)Ljava/lang/String;

    move-result-object v1

    .line 1162
    invoke-static {v0, v1}, Lcom/huawei/nfc/carrera/util/LogX;->i(Ljava/lang/String;Ljava/lang/String;)V

    .line 1164
    invoke-static/range {v20 .. v20}, Lcom/huawei/nfc/carrera/logic/spi/fm/impl/NfcParserUtil;->parseBusinessOrder2NfcosType(Lcn/com/fmsh/tsm/business/bean/BusinessOrder;)Lcn/com/fmsh/nfcos/client/service/huawei/NfcosBusinessOrder;

    move-result-object v0

    invoke-virtual {v8, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1165
    goto :goto_1

    .line 1166
    :cond_4
    iput-object v8, v7, Lcom/huawei/nfc/carrera/logic/spi/fm/response/QueryBusinessOrdersResponse;->orderList:Ljava/util/ArrayList;

    .line 1167
    const/4 v0, 0x0

    iput v0, v7, Lcom/huawei/nfc/carrera/logic/spi/fm/response/QueryBusinessOrdersResponse;->resultCode:I
    :try_end_0
    .catch Lcn/com/fmsh/tsm/business/exception/BusinessException; {:try_start_0 .. :try_end_0} :catch_0

    .line 1231
    goto/16 :goto_4

    .line 1200
    :catch_0
    move-exception v18

    .line 1201
    const-string v0, "queryBusinessOrders"

    move-object/from16 v1, p0

    move-object/from16 v2, v18

    invoke-direct {v1, v0, v2}, Lcom/huawei/nfc/carrera/logic/spi/fm/impl/FMServiceImpl;->changeException2ErrorId(Ljava/lang/String;Lcn/com/fmsh/tsm/business/exception/BusinessException;)I

    move-result v19

    .line 1203
    move/from16 v0, v19

    const/16 v1, 0x3f1

    if-eq v0, v1, :cond_5

    move/from16 v0, v19

    const/16 v1, 0x233e

    if-ne v0, v1, :cond_8

    .line 1204
    :cond_5
    const/4 v0, 0x0

    move-object/from16 v1, p0

    iput-boolean v0, v1, Lcom/huawei/nfc/carrera/logic/spi/fm/impl/FMServiceImpl;->isLogin:Z

    .line 1205
    move-object/from16 v0, p0

    invoke-direct {v0, v7}, Lcom/huawei/nfc/carrera/logic/spi/fm/impl/FMServiceImpl;->login(Lcom/huawei/nfc/carrera/logic/spi/fm/response/FMBaseResponse;)Z

    move-result v0

    if-eqz v0, :cond_7

    .line 1206
    const/4 v0, 0x1

    move-object/from16 v1, p0

    iput-boolean v0, v1, Lcom/huawei/nfc/carrera/logic/spi/fm/impl/FMServiceImpl;->isLogin:Z

    .line 1207
    const/16 v20, 0x0

    .line 1209
    move-object/from16 v0, p0

    :try_start_1
    iget-object v0, v0, Lcom/huawei/nfc/carrera/logic/spi/fm/impl/FMServiceImpl;->mNfcosClientManager:Lcn/com/fmsh/nfcos/client/libs/NfcosClientManager;

    move v1, v9

    move v2, v10

    move-object v3, v15

    move-object/from16 v4, v16

    move-object/from16 v5, v17

    move-object v6, v12

    const/16 v2, 0xa

    invoke-interface/range {v0 .. v6}, Lcn/com/fmsh/nfcos/client/libs/NfcosClientManager;->queryBusinessOrders(IILcn/com/fmsh/tsm/business/enums/EnumCardAppType;Lcn/com/fmsh/tsm/business/enums/EnumBusinessOrderType;Ljava/util/List;[B)Ljava/util/List;

    move-result-object v20

    .line 1215
    invoke-interface/range {v20 .. v20}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v21

    :goto_2
    invoke-interface/range {v21 .. v21}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_6

    invoke-interface/range {v21 .. v21}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object/from16 v22, v0

    check-cast v22, Lcn/com/fmsh/tsm/business/bean/BusinessOrder;

    .line 1216
    .line 1217
    invoke-static/range {v22 .. v22}, Lcom/huawei/nfc/carrera/logic/spi/fm/impl/NfcParserUtil;->parseBusinessOrder2NfcosType(Lcn/com/fmsh/tsm/business/bean/BusinessOrder;)Lcn/com/fmsh/nfcos/client/service/huawei/NfcosBusinessOrder;

    move-result-object v0

    .line 1216
    invoke-virtual {v8, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1218
    goto :goto_2

    .line 1220
    :cond_6
    iput-object v8, v7, Lcom/huawei/nfc/carrera/logic/spi/fm/response/QueryBusinessOrdersResponse;->orderList:Ljava/util/ArrayList;

    .line 1221
    const/4 v0, 0x0

    iput v0, v7, Lcom/huawei/nfc/carrera/logic/spi/fm/response/QueryBusinessOrdersResponse;->resultCode:I
    :try_end_1
    .catch Lcn/com/fmsh/tsm/business/exception/BusinessException; {:try_start_1 .. :try_end_1} :catch_1

    .line 1225
    goto :goto_3

    .line 1223
    :catch_1
    move-exception v21

    .line 1224
    const-string v0, "queryBusinessOrders"

    move-object/from16 v1, p0

    move-object/from16 v2, v21

    invoke-direct {v1, v0, v2}, Lcom/huawei/nfc/carrera/logic/spi/fm/impl/FMServiceImpl;->changeException2ErrorId(Ljava/lang/String;Lcn/com/fmsh/tsm/business/exception/BusinessException;)I

    .line 1226
    :goto_3
    goto :goto_4

    .line 1228
    :cond_7
    return-object v7

    .line 1233
    :cond_8
    :goto_4
    return-object v7
.end method

.method public queryCardInfo(ILjava/lang/String;)Lcom/huawei/nfc/carrera/logic/spi/fm/response/QueryCardInfoResponse;
    .locals 9

    .line 1249
    const-string v0, "FMServiceImpl, queryCardInfo enter"

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->i(Ljava/lang/String;)V

    .line 1250
    invoke-direct {p0}, Lcom/huawei/nfc/carrera/logic/spi/fm/impl/FMServiceImpl;->bindNfcosService()V

    .line 1251
    new-instance v2, Lcom/huawei/nfc/carrera/logic/spi/fm/response/QueryCardInfoResponse;

    invoke-direct {v2}, Lcom/huawei/nfc/carrera/logic/spi/fm/response/QueryCardInfoResponse;-><init>()V

    .line 1252
    invoke-direct {p0, p2}, Lcom/huawei/nfc/carrera/logic/spi/fm/impl/FMServiceImpl;->getCardAppType(Ljava/lang/String;)Lcn/com/fmsh/tsm/business/enums/EnumCardAppType;

    move-result-object v3

    .line 1255
    new-instance v4, Lcn/com/fmsh/nfcos/client/service/huawei/CardAppInfo;

    invoke-direct {v4}, Lcn/com/fmsh/nfcos/client/service/huawei/CardAppInfo;-><init>()V

    .line 1274
    :try_start_0
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/spi/fm/impl/FMServiceImpl;->mNfcosClientManager:Lcn/com/fmsh/nfcos/client/libs/NfcosClientManager;

    .line 1275
    invoke-interface {v0, p1, v3}, Lcn/com/fmsh/nfcos/client/libs/NfcosClientManager;->getCardAppInfo(ILcn/com/fmsh/tsm/business/enums/EnumCardAppType;)Lcn/com/fmsh/tsm/business/bean/CardAppInfo;

    move-result-object v5

    .line 1277
    invoke-static {v5}, Lcom/huawei/nfc/carrera/logic/spi/fm/impl/NfcParserUtil;->parseCardAppInfo2NfcosType(Lcn/com/fmsh/tsm/business/bean/CardAppInfo;)Lcn/com/fmsh/nfcos/client/service/huawei/CardAppInfo;

    move-result-object v4

    .line 1278
    const/4 v0, 0x0

    iput v0, v2, Lcom/huawei/nfc/carrera/logic/spi/fm/response/QueryCardInfoResponse;->resultCode:I

    .line 1280
    iget-object v0, v4, Lcn/com/fmsh/nfcos/client/service/huawei/CardAppInfo;->cardFaceNo:Ljava/lang/String;

    invoke-virtual {v2, v0}, Lcom/huawei/nfc/carrera/logic/spi/fm/response/QueryCardInfoResponse;->setCardNo(Ljava/lang/String;)V

    .line 1281
    iget v0, v4, Lcn/com/fmsh/nfcos/client/service/huawei/CardAppInfo;->balance:I

    invoke-virtual {v2, v0}, Lcom/huawei/nfc/carrera/logic/spi/fm/response/QueryCardInfoResponse;->setBalance(I)V

    .line 1282
    iget-object v0, v4, Lcn/com/fmsh/nfcos/client/service/huawei/CardAppInfo;->time4Validity:Ljava/lang/String;

    invoke-virtual {v2, v0}, Lcom/huawei/nfc/carrera/logic/spi/fm/response/QueryCardInfoResponse;->setTime4Validity(Ljava/lang/String;)V

    .line 1285
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "FMServiceImpl, getAppNo is "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    .line 1286
    invoke-virtual {v5}, Lcn/com/fmsh/tsm/business/bean/CardAppInfo;->getCardAppNo()[B

    move-result-object v1

    invoke-static {v1}, Lcn/com/fmsh/util/FM_Bytes;->bytesToHexString([B)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, " time4Validity "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    .line 1287
    invoke-virtual {v5}, Lcn/com/fmsh/tsm/business/bean/CardAppInfo;->getTime4Validity()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 1285
    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->w(Ljava/lang/String;)V
    :try_end_0
    .catch Lcn/com/fmsh/tsm/business/exception/BusinessException; {:try_start_0 .. :try_end_0} :catch_0

    .line 1319
    goto :goto_0

    .line 1298
    :catch_0
    move-exception v5

    .line 1299
    const-string v0, "FMServiceImpl, queryCardInfo Error Id"

    invoke-virtual {v5}, Lcn/com/fmsh/tsm/business/exception/BusinessException;->getErrorMsg()Lcn/com/fmsh/tsm/business/exception/BusinessException$ErrorMessage;

    move-result-object v1

    .line 1300
    invoke-virtual {v1}, Lcn/com/fmsh/tsm/business/exception/BusinessException$ErrorMessage;->getId()Ljava/lang/String;

    move-result-object v1

    .line 1299
    invoke-static {v0, v1}, Lcom/huawei/nfc/carrera/util/LogX;->w(Ljava/lang/String;Ljava/lang/String;)V

    .line 1303
    const-string v0, "queryCardInfo"

    invoke-direct {p0, v0, v5}, Lcom/huawei/nfc/carrera/logic/spi/fm/impl/FMServiceImpl;->changeException2ErrorId(Ljava/lang/String;Lcn/com/fmsh/tsm/business/exception/BusinessException;)I

    move-result v6

    .line 1304
    const/16 v0, 0x235d

    if-ne v6, v0, :cond_0

    .line 1305
    const/4 v7, 0x0

    .line 1307
    :try_start_1
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/spi/fm/impl/FMServiceImpl;->mNfcosClientManager:Lcn/com/fmsh/nfcos/client/libs/NfcosClientManager;

    invoke-interface {v0, p1, v3}, Lcn/com/fmsh/nfcos/client/libs/NfcosClientManager;->getCardAppInfo(ILcn/com/fmsh/tsm/business/enums/EnumCardAppType;)Lcn/com/fmsh/tsm/business/bean/CardAppInfo;

    move-result-object v7

    .line 1308
    invoke-static {v7}, Lcom/huawei/nfc/carrera/logic/spi/fm/impl/NfcParserUtil;->parseCardAppInfo2NfcosType(Lcn/com/fmsh/tsm/business/bean/CardAppInfo;)Lcn/com/fmsh/nfcos/client/service/huawei/CardAppInfo;

    move-result-object v4

    .line 1309
    const/4 v0, 0x0

    iput v0, v2, Lcom/huawei/nfc/carrera/logic/spi/fm/response/QueryCardInfoResponse;->resultCode:I

    .line 1310
    iget-object v0, v4, Lcn/com/fmsh/nfcos/client/service/huawei/CardAppInfo;->cardFaceNo:Ljava/lang/String;

    invoke-virtual {v2, v0}, Lcom/huawei/nfc/carrera/logic/spi/fm/response/QueryCardInfoResponse;->setCardNo(Ljava/lang/String;)V

    .line 1311
    iget v0, v4, Lcn/com/fmsh/nfcos/client/service/huawei/CardAppInfo;->balance:I

    invoke-virtual {v2, v0}, Lcom/huawei/nfc/carrera/logic/spi/fm/response/QueryCardInfoResponse;->setBalance(I)V

    .line 1312
    iget-object v0, v4, Lcn/com/fmsh/nfcos/client/service/huawei/CardAppInfo;->time4Validity:Ljava/lang/String;

    invoke-virtual {v2, v0}, Lcom/huawei/nfc/carrera/logic/spi/fm/response/QueryCardInfoResponse;->setTime4Validity(Ljava/lang/String;)V
    :try_end_1
    .catch Lcn/com/fmsh/tsm/business/exception/BusinessException; {:try_start_1 .. :try_end_1} :catch_1

    .line 1316
    goto :goto_0

    .line 1314
    :catch_1
    move-exception v8

    .line 1315
    const-string v0, "queryCardInfoAgain"

    invoke-direct {p0, v0, v8}, Lcom/huawei/nfc/carrera/logic/spi/fm/impl/FMServiceImpl;->changeException2ErrorId(Ljava/lang/String;Lcn/com/fmsh/tsm/business/exception/BusinessException;)I

    .line 1321
    :cond_0
    :goto_0
    return-object v2
.end method

.method public queryProducts(Lcom/huawei/nfc/carrera/logic/spi/fm/request/QueryProductsRequest;)Lcom/huawei/nfc/carrera/logic/spi/fm/response/QueryProductsResponse;
    .locals 11

    .line 1610
    const-string v0, "FMServiceImpl, queryProducts enter"

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->i(Ljava/lang/String;)V

    .line 1612
    new-instance v2, Lcom/huawei/nfc/carrera/logic/spi/fm/response/QueryProductsResponse;

    invoke-direct {v2}, Lcom/huawei/nfc/carrera/logic/spi/fm/response/QueryProductsResponse;-><init>()V

    .line 1614
    invoke-direct {p0, p1}, Lcom/huawei/nfc/carrera/logic/spi/fm/impl/FMServiceImpl;->judgeQueryProductsRequestValid(Lcom/huawei/nfc/carrera/logic/spi/fm/request/QueryProductsRequest;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 1615
    const-string v0, "FMServiceImpl, queryProducts illegal params"

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->e(Ljava/lang/String;)V

    .line 1616
    return-object v2

    .line 1619
    :cond_0
    invoke-direct {p0, v2}, Lcom/huawei/nfc/carrera/logic/spi/fm/impl/FMServiceImpl;->checkNetAndIslogin(Lcom/huawei/nfc/carrera/logic/spi/fm/response/FMBaseResponse;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 1620
    return-object v2

    .line 1623
    :cond_1
    invoke-virtual {p1}, Lcom/huawei/nfc/carrera/logic/spi/fm/request/QueryProductsRequest;->getDeviceModel()Ljava/lang/String;

    move-result-object v3

    .line 1624
    invoke-virtual {p1}, Lcom/huawei/nfc/carrera/logic/spi/fm/request/QueryProductsRequest;->getAid()Ljava/lang/String;

    move-result-object v4

    .line 1625
    invoke-virtual {p1}, Lcom/huawei/nfc/carrera/logic/spi/fm/request/QueryProductsRequest;->getCity4Current()Ljava/lang/String;

    move-result-object v5

    .line 1626
    invoke-direct {p0, v4}, Lcom/huawei/nfc/carrera/logic/spi/fm/impl/FMServiceImpl;->getCardAppType(Ljava/lang/String;)Lcn/com/fmsh/tsm/business/enums/EnumCardAppType;

    move-result-object v6

    .line 1627
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "FMServiceImpl, queryProducts deviceModel : "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, " ; aid : "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, " ; cityCode : "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->i(Ljava/lang/String;)V

    .line 1630
    :try_start_0
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/spi/fm/impl/FMServiceImpl;->mNfcosClientManager:Lcn/com/fmsh/nfcos/client/libs/NfcosClientManager;

    invoke-interface {v0, v3, v6, v5, v5}, Lcn/com/fmsh/nfcos/client/libs/NfcosClientManager;->queryProducts(Ljava/lang/String;Lcn/com/fmsh/tsm/business/enums/EnumCardAppType;Ljava/lang/String;Ljava/lang/String;)Ljava/util/List;

    move-result-object v7

    .line 1631
    const/4 v0, 0x0

    if-eq v0, v7, :cond_2

    .line 1632
    const/4 v0, 0x0

    iput v0, v2, Lcom/huawei/nfc/carrera/logic/spi/fm/response/QueryProductsResponse;->resultCode:I

    .line 1633
    invoke-virtual {v2, v7}, Lcom/huawei/nfc/carrera/logic/spi/fm/response/QueryProductsResponse;->setList(Ljava/util/List;)V

    goto :goto_0

    .line 1635
    :cond_2
    const/4 v0, -0x1

    iput v0, v2, Lcom/huawei/nfc/carrera/logic/spi/fm/response/QueryProductsResponse;->resultCode:I
    :try_end_0
    .catch Lcn/com/fmsh/tsm/business/exception/BusinessException; {:try_start_0 .. :try_end_0} :catch_0

    .line 1666
    :goto_0
    goto/16 :goto_2

    .line 1638
    :catch_0
    move-exception v7

    .line 1639
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "FMServiceImpl, BusinessException : "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v7}, Lcn/com/fmsh/tsm/business/exception/BusinessException;->getMessage()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->e(Ljava/lang/String;)V

    .line 1640
    const-string v0, "queryBusinessOrder"

    invoke-direct {p0, v0, v7}, Lcom/huawei/nfc/carrera/logic/spi/fm/impl/FMServiceImpl;->changeException2ErrorId(Ljava/lang/String;Lcn/com/fmsh/tsm/business/exception/BusinessException;)I

    move-result v8

    .line 1642
    const/16 v0, 0x3f1

    if-eq v8, v0, :cond_3

    const/16 v0, 0x233e

    if-ne v8, v0, :cond_7

    .line 1643
    :cond_3
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/nfc/carrera/logic/spi/fm/impl/FMServiceImpl;->isLogin:Z

    .line 1644
    invoke-direct {p0, v2}, Lcom/huawei/nfc/carrera/logic/spi/fm/impl/FMServiceImpl;->login(Lcom/huawei/nfc/carrera/logic/spi/fm/response/FMBaseResponse;)Z

    move-result v0

    if-eqz v0, :cond_6

    .line 1647
    :try_start_1
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/spi/fm/impl/FMServiceImpl;->mNfcosClientManager:Lcn/com/fmsh/nfcos/client/libs/NfcosClientManager;

    invoke-interface {v0, v3, v6, v5, v5}, Lcn/com/fmsh/nfcos/client/libs/NfcosClientManager;->queryProducts(Ljava/lang/String;Lcn/com/fmsh/tsm/business/enums/EnumCardAppType;Ljava/lang/String;Ljava/lang/String;)Ljava/util/List;

    move-result-object v9

    .line 1648
    const/4 v0, 0x0

    if-eq v0, v9, :cond_4

    .line 1649
    const/4 v0, 0x0

    iput v0, v2, Lcom/huawei/nfc/carrera/logic/spi/fm/response/QueryProductsResponse;->resultCode:I

    .line 1650
    invoke-virtual {v2, v9}, Lcom/huawei/nfc/carrera/logic/spi/fm/response/QueryProductsResponse;->setList(Ljava/util/List;)V

    goto :goto_1

    .line 1652
    :cond_4
    const/4 v0, -0x1

    iput v0, v2, Lcom/huawei/nfc/carrera/logic/spi/fm/response/QueryProductsResponse;->resultCode:I
    :try_end_1
    .catch Lcn/com/fmsh/tsm/business/exception/BusinessException; {:try_start_1 .. :try_end_1} :catch_1

    .line 1659
    :goto_1
    goto :goto_2

    .line 1654
    :catch_1
    move-exception v9

    .line 1655
    const-string v0, "queryBusinessOrder"

    invoke-direct {p0, v0, v9}, Lcom/huawei/nfc/carrera/logic/spi/fm/impl/FMServiceImpl;->changeException2ErrorId(Ljava/lang/String;Lcn/com/fmsh/tsm/business/exception/BusinessException;)I

    move-result v10

    .line 1656
    const/16 v0, 0x233e

    if-ne v10, v0, :cond_5

    .line 1657
    const/4 v0, -0x2

    iput v0, v2, Lcom/huawei/nfc/carrera/logic/spi/fm/response/QueryProductsResponse;->resultCode:I

    .line 1659
    :cond_5
    goto :goto_2

    .line 1662
    :cond_6
    return-object v2

    .line 1668
    :cond_7
    :goto_2
    return-object v2
.end method

.method public queryTrade(Ljava/lang/String;)Lcom/huawei/nfc/carrera/logic/spi/fm/response/QueryTradeResponse;
    .locals 7

    .line 1327
    const-string v0, "FMServiceImpl, queryTrade enter"

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->i(Ljava/lang/String;)V

    .line 1328
    invoke-direct {p0}, Lcom/huawei/nfc/carrera/logic/spi/fm/impl/FMServiceImpl;->bindNfcosService()V

    .line 1329
    invoke-direct {p0, p1}, Lcom/huawei/nfc/carrera/logic/spi/fm/impl/FMServiceImpl;->getCardAppType(Ljava/lang/String;)Lcn/com/fmsh/tsm/business/enums/EnumCardAppType;

    move-result-object v1

    .line 1330
    new-instance v2, Lcom/huawei/nfc/carrera/logic/spi/fm/response/QueryTradeResponse;

    invoke-direct {v2}, Lcom/huawei/nfc/carrera/logic/spi/fm/response/QueryTradeResponse;-><init>()V

    .line 1333
    const/4 v3, 0x4

    .line 1334
    new-instance v4, Lcn/com/fmsh/nfcos/client/service/huawei/CardAppInfo;

    invoke-direct {v4}, Lcn/com/fmsh/nfcos/client/service/huawei/CardAppInfo;-><init>()V

    .line 1337
    :try_start_0
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/spi/fm/impl/FMServiceImpl;->mNfcosClientManager:Lcn/com/fmsh/nfcos/client/libs/NfcosClientManager;

    .line 1338
    invoke-interface {v0, v3, v1}, Lcn/com/fmsh/nfcos/client/libs/NfcosClientManager;->getCardAppInfo(ILcn/com/fmsh/tsm/business/enums/EnumCardAppType;)Lcn/com/fmsh/tsm/business/bean/CardAppInfo;

    move-result-object v5

    .line 1340
    invoke-static {v5}, Lcom/huawei/nfc/carrera/logic/spi/fm/impl/NfcParserUtil;->parseCardAppInfo2NfcosType(Lcn/com/fmsh/tsm/business/bean/CardAppInfo;)Lcn/com/fmsh/nfcos/client/service/huawei/CardAppInfo;

    move-result-object v4

    .line 1341
    const/4 v0, 0x0

    iput v0, v2, Lcom/huawei/nfc/carrera/logic/spi/fm/response/QueryTradeResponse;->resultCode:I

    .line 1342
    iget-object v0, v4, Lcn/com/fmsh/nfcos/client/service/huawei/CardAppInfo;->records:[Lcn/com/fmsh/nfcos/client/service/huawei/CardAppRecord;

    iput-object v0, v2, Lcom/huawei/nfc/carrera/logic/spi/fm/response/QueryTradeResponse;->tradeRecords:[Lcn/com/fmsh/nfcos/client/service/huawei/CardAppRecord;
    :try_end_0
    .catch Lcn/com/fmsh/tsm/business/exception/BusinessException; {:try_start_0 .. :try_end_0} :catch_0

    .line 1358
    goto :goto_0

    .line 1356
    :catch_0
    move-exception v5

    .line 1357
    const-string v0, "queryTrade"

    invoke-direct {p0, v0, v5}, Lcom/huawei/nfc/carrera/logic/spi/fm/impl/FMServiceImpl;->changeException2ErrorId(Ljava/lang/String;Lcn/com/fmsh/tsm/business/exception/BusinessException;)I

    move-result v6

    .line 1360
    :goto_0
    return-object v2
.end method

.method public recharge(Lcom/huawei/nfc/carrera/logic/spi/fm/request/RechargeOrDoUnsolvedOrderRequest;)Lcom/huawei/nfc/carrera/logic/spi/fm/response/FMBaseResponse;
    .locals 9

    .line 996
    const-string v0, "FMServiceImpl, recharge enter"

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->i(Ljava/lang/String;)V

    .line 997
    new-instance v2, Lcom/huawei/nfc/carrera/logic/spi/fm/response/FMBaseResponse;

    invoke-direct {v2}, Lcom/huawei/nfc/carrera/logic/spi/fm/response/FMBaseResponse;-><init>()V

    .line 999
    const/4 v0, 0x0

    if-eq v0, p1, :cond_0

    invoke-virtual {p1}, Lcom/huawei/nfc/carrera/logic/spi/fm/request/RechargeOrDoUnsolvedOrderRequest;->getOrder()[B

    move-result-object v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    invoke-virtual {p1}, Lcom/huawei/nfc/carrera/logic/spi/fm/request/RechargeOrDoUnsolvedOrderRequest;->getOrder()[B

    move-result-object v0

    array-length v0, v0

    const/4 v1, 0x0

    if-ne v1, v0, :cond_1

    .line 1000
    :cond_0
    const-string v0, "FMServiceImpl, recharge illegal params"

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->e(Ljava/lang/String;)V

    .line 1001
    return-object v2

    .line 1004
    :cond_1
    invoke-direct {p0, v2}, Lcom/huawei/nfc/carrera/logic/spi/fm/impl/FMServiceImpl;->checkNetAndIslogin(Lcom/huawei/nfc/carrera/logic/spi/fm/response/FMBaseResponse;)Z

    move-result v0

    if-nez v0, :cond_2

    .line 1005
    return-object v2

    .line 1009
    :cond_2
    invoke-virtual {p1}, Lcom/huawei/nfc/carrera/logic/spi/fm/request/RechargeOrDoUnsolvedOrderRequest;->getOrder()[B

    move-result-object v3

    .line 1010
    invoke-virtual {p1}, Lcom/huawei/nfc/carrera/logic/spi/fm/request/RechargeOrDoUnsolvedOrderRequest;->getAid()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/huawei/nfc/carrera/logic/spi/fm/impl/FMServiceImpl;->getAppNoRecharge(Ljava/lang/String;)[B

    move-result-object v4

    .line 1023
    :try_start_0
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/spi/fm/impl/FMServiceImpl;->mNfcosClientManager:Lcn/com/fmsh/nfcos/client/libs/NfcosClientManager;

    invoke-interface {v0, v3, v4}, Lcn/com/fmsh/nfcos/client/libs/NfcosClientManager;->recharge([B[B)I

    move-result v5

    .line 1025
    iput v5, v2, Lcom/huawei/nfc/carrera/logic/spi/fm/response/FMBaseResponse;->FMCode:I

    .line 1026
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "FMServiceImpl, recharge returnCode="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->i(Ljava/lang/String;)V

    .line 1027
    if-nez v5, :cond_3

    .line 1028
    const/4 v0, 0x0

    iput v0, v2, Lcom/huawei/nfc/carrera/logic/spi/fm/response/FMBaseResponse;->resultCode:I

    goto :goto_0

    .line 1031
    :cond_3
    const/16 v0, 0x3f1

    if-eq v5, v0, :cond_4

    const/16 v0, 0x233e

    if-ne v5, v0, :cond_7

    .line 1032
    :cond_4
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/nfc/carrera/logic/spi/fm/impl/FMServiceImpl;->isLogin:Z

    .line 1033
    invoke-direct {p0, v2}, Lcom/huawei/nfc/carrera/logic/spi/fm/impl/FMServiceImpl;->login(Lcom/huawei/nfc/carrera/logic/spi/fm/response/FMBaseResponse;)Z

    move-result v0

    if-eqz v0, :cond_6

    .line 1034
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/huawei/nfc/carrera/logic/spi/fm/impl/FMServiceImpl;->isLogin:Z

    .line 1036
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/spi/fm/impl/FMServiceImpl;->mNfcosClientManager:Lcn/com/fmsh/nfcos/client/libs/NfcosClientManager;

    invoke-interface {v0, v3, v4}, Lcn/com/fmsh/nfcos/client/libs/NfcosClientManager;->recharge([B[B)I

    move-result v5

    .line 1037
    iput v5, v2, Lcom/huawei/nfc/carrera/logic/spi/fm/response/FMBaseResponse;->FMCode:I

    .line 1038
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "FMServiceImpl, recharge returnCode="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->i(Ljava/lang/String;)V

    .line 1039
    if-nez v5, :cond_5

    .line 1040
    const/4 v0, 0x0

    iput v0, v2, Lcom/huawei/nfc/carrera/logic/spi/fm/response/FMBaseResponse;->resultCode:I

    goto :goto_0

    .line 1042
    :cond_5
    const/16 v0, 0x233e

    if-ne v5, v0, :cond_7

    .line 1043
    const/4 v0, -0x2

    iput v0, v2, Lcom/huawei/nfc/carrera/logic/spi/fm/response/FMBaseResponse;->resultCode:I
    :try_end_0
    .catch Lcn/com/fmsh/tsm/business/exception/BusinessException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    .line 1047
    :cond_6
    return-object v2

    .line 1084
    :cond_7
    :goto_0
    goto/16 :goto_2

    .line 1054
    :catch_0
    move-exception v5

    .line 1055
    const-string v0, "recharge"

    invoke-direct {p0, v0, v5}, Lcom/huawei/nfc/carrera/logic/spi/fm/impl/FMServiceImpl;->changeException2ErrorId(Ljava/lang/String;Lcn/com/fmsh/tsm/business/exception/BusinessException;)I

    move-result v6

    .line 1056
    const/16 v0, 0x3f1

    if-eq v6, v0, :cond_8

    const/16 v0, 0x233e

    if-ne v6, v0, :cond_d

    .line 1057
    :cond_8
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/nfc/carrera/logic/spi/fm/impl/FMServiceImpl;->isLogin:Z

    .line 1058
    invoke-direct {p0, v2}, Lcom/huawei/nfc/carrera/logic/spi/fm/impl/FMServiceImpl;->login(Lcom/huawei/nfc/carrera/logic/spi/fm/response/FMBaseResponse;)Z

    move-result v0

    if-eqz v0, :cond_c

    .line 1059
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/huawei/nfc/carrera/logic/spi/fm/impl/FMServiceImpl;->isLogin:Z

    .line 1062
    :try_start_1
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/spi/fm/impl/FMServiceImpl;->mNfcosClientManager:Lcn/com/fmsh/nfcos/client/libs/NfcosClientManager;

    invoke-interface {v0, v3, v4}, Lcn/com/fmsh/nfcos/client/libs/NfcosClientManager;->recharge([B[B)I

    move-result v6

    .line 1063
    iput v6, v2, Lcom/huawei/nfc/carrera/logic/spi/fm/response/FMBaseResponse;->FMCode:I

    .line 1065
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "FMServiceImpl, recharge returnCode="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v6}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->i(Ljava/lang/String;)V

    .line 1066
    if-nez v6, :cond_9

    .line 1067
    const/4 v0, 0x0

    iput v0, v2, Lcom/huawei/nfc/carrera/logic/spi/fm/response/FMBaseResponse;->resultCode:I

    goto :goto_1

    .line 1069
    :cond_9
    const/16 v0, 0x233e

    if-ne v6, v0, :cond_a

    .line 1070
    const/4 v0, -0x2

    iput v0, v2, Lcom/huawei/nfc/carrera/logic/spi/fm/response/FMBaseResponse;->resultCode:I
    :try_end_1
    .catch Lcn/com/fmsh/tsm/business/exception/BusinessException; {:try_start_1 .. :try_end_1} :catch_1

    .line 1078
    :cond_a
    :goto_1
    goto :goto_2

    .line 1073
    :catch_1
    move-exception v7

    .line 1074
    const-string v0, "recharge"

    invoke-direct {p0, v0, v7}, Lcom/huawei/nfc/carrera/logic/spi/fm/impl/FMServiceImpl;->changeException2ErrorId(Ljava/lang/String;Lcn/com/fmsh/tsm/business/exception/BusinessException;)I

    move-result v8

    .line 1075
    const/16 v0, 0x233e

    if-ne v8, v0, :cond_b

    .line 1076
    const/4 v0, -0x2

    iput v0, v2, Lcom/huawei/nfc/carrera/logic/spi/fm/response/FMBaseResponse;->resultCode:I

    .line 1078
    :cond_b
    goto :goto_2

    .line 1081
    :cond_c
    return-object v2

    .line 1086
    :cond_d
    :goto_2
    return-object v2
.end method

.method public retryInstallApplet(Lcom/huawei/nfc/carrera/logic/spi/fm/request/DoIssueRequest;)Lcom/huawei/nfc/carrera/logic/spi/fm/response/FMBaseResponse;
    .locals 8

    .line 782
    const-string v0, "FMServiceImpl, retryInstallApplet enter"

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->i(Ljava/lang/String;)V

    .line 783
    new-instance v3, Lcom/huawei/nfc/carrera/logic/spi/fm/response/FMBaseResponse;

    invoke-direct {v3}, Lcom/huawei/nfc/carrera/logic/spi/fm/response/FMBaseResponse;-><init>()V

    .line 784
    invoke-direct {p0, p1}, Lcom/huawei/nfc/carrera/logic/spi/fm/impl/FMServiceImpl;->judgeDoIssueRequestValid(Lcom/huawei/nfc/carrera/logic/spi/fm/request/DoIssueRequest;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 785
    const-string v0, "FMServiceImpl, retryInstallApplet illegal params"

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->e(Ljava/lang/String;)V

    .line 786
    return-object v3

    .line 789
    :cond_0
    invoke-direct {p0, v3}, Lcom/huawei/nfc/carrera/logic/spi/fm/impl/FMServiceImpl;->checkNetAndIslogin(Lcom/huawei/nfc/carrera/logic/spi/fm/response/FMBaseResponse;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 790
    return-object v3

    .line 794
    :cond_1
    iget-object v4, p1, Lcom/huawei/nfc/carrera/logic/spi/fm/request/DoIssueRequest;->order:[B

    .line 795
    iget-object v5, p1, Lcom/huawei/nfc/carrera/logic/spi/fm/request/DoIssueRequest;->seid:[B

    .line 817
    :try_start_0
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/spi/fm/impl/FMServiceImpl;->mNfcosClientManager:Lcn/com/fmsh/nfcos/client/libs/NfcosClientManager;

    const/4 v1, 0x1

    const/4 v2, 0x0

    invoke-interface {v0, v4, v1, v5, v2}, Lcn/com/fmsh/nfcos/client/libs/NfcosClientManager;->doIssue([BI[B[B)I

    move-result v6

    .line 821
    iput v6, v3, Lcom/huawei/nfc/carrera/logic/spi/fm/response/FMBaseResponse;->FMCode:I

    .line 822
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "FMServiceImpl, retryInstallApplet returnCode="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v6}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->i(Ljava/lang/String;)V

    .line 823
    if-nez v6, :cond_2

    .line 824
    const/4 v0, 0x0

    iput v0, v3, Lcom/huawei/nfc/carrera/logic/spi/fm/response/FMBaseResponse;->resultCode:I

    goto :goto_0

    .line 827
    :cond_2
    const/16 v0, 0x3f1

    if-eq v6, v0, :cond_3

    const/16 v0, 0x233e

    if-ne v6, v0, :cond_6

    .line 828
    :cond_3
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/nfc/carrera/logic/spi/fm/impl/FMServiceImpl;->isLogin:Z

    .line 829
    invoke-direct {p0, v3}, Lcom/huawei/nfc/carrera/logic/spi/fm/impl/FMServiceImpl;->login(Lcom/huawei/nfc/carrera/logic/spi/fm/response/FMBaseResponse;)Z

    move-result v0

    if-eqz v0, :cond_5

    .line 830
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/huawei/nfc/carrera/logic/spi/fm/impl/FMServiceImpl;->isLogin:Z

    .line 832
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/spi/fm/impl/FMServiceImpl;->mNfcosClientManager:Lcn/com/fmsh/nfcos/client/libs/NfcosClientManager;

    const/4 v1, 0x1

    const/4 v2, 0x0

    invoke-interface {v0, v4, v1, v5, v2}, Lcn/com/fmsh/nfcos/client/libs/NfcosClientManager;->doIssue([BI[B[B)I

    move-result v6

    .line 835
    iput v6, v3, Lcom/huawei/nfc/carrera/logic/spi/fm/response/FMBaseResponse;->FMCode:I

    .line 836
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "FMServiceImpl, retryInstallApplet returnCode="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v6}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->i(Ljava/lang/String;)V

    .line 837
    if-nez v6, :cond_4

    .line 838
    const/4 v0, 0x0

    iput v0, v3, Lcom/huawei/nfc/carrera/logic/spi/fm/response/FMBaseResponse;->resultCode:I

    goto :goto_0

    .line 840
    :cond_4
    const/16 v0, 0x233e

    if-ne v6, v0, :cond_6

    .line 841
    const/4 v0, -0x2

    iput v0, v3, Lcom/huawei/nfc/carrera/logic/spi/fm/response/FMBaseResponse;->resultCode:I
    :try_end_0
    .catch Lcn/com/fmsh/tsm/business/exception/BusinessException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    .line 845
    :cond_5
    return-object v3

    .line 852
    :cond_6
    :goto_0
    goto :goto_1

    .line 850
    :catch_0
    move-exception v6

    .line 851
    const-string v0, "retryInstallApplet"

    invoke-direct {p0, v0, v6}, Lcom/huawei/nfc/carrera/logic/spi/fm/impl/FMServiceImpl;->changeException2ErrorId(Ljava/lang/String;Lcn/com/fmsh/tsm/business/exception/BusinessException;)I

    move-result v7

    .line 854
    :goto_1
    return-object v3
.end method
