.class public final Lcom/huawei/nfc/carrera/logic/spi/tsm/laser/LaserTSMServiceImpl;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/huawei/nfc/carrera/logic/spi/tsm/LaserTSMService;


# static fields
.field private static final SYNC_LOCK:[B

.field private static instance:Lcom/huawei/nfc/carrera/logic/spi/tsm/laser/LaserTSMServiceImpl;


# instance fields
.field private final mContext:Landroid/content/Context;

.field private final tsmOperator:Lcom/leisen/wallet/sdk/tsm/TSMOperator;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 44
    const/4 v0, 0x0

    new-array v0, v0, [B

    sput-object v0, Lcom/huawei/nfc/carrera/logic/spi/tsm/laser/LaserTSMServiceImpl;->SYNC_LOCK:[B

    return-void
.end method

.method private constructor <init>(Landroid/content/Context;)V
    .locals 2

    .line 47
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 48
    iput-object p1, p0, Lcom/huawei/nfc/carrera/logic/spi/tsm/laser/LaserTSMServiceImpl;->mContext:Landroid/content/Context;

    .line 50
    invoke-direct {p0}, Lcom/huawei/nfc/carrera/logic/spi/tsm/laser/LaserTSMServiceImpl;->getTsmRemoteUrl()Ljava/lang/String;

    move-result-object v1

    .line 51
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/spi/tsm/laser/LaserTSMServiceImpl;->mContext:Landroid/content/Context;

    invoke-static {v0, v1}, Lcom/leisen/wallet/sdk/tsm/TSMOperator;->getInstance(Landroid/content/Context;Ljava/lang/String;)Lcom/leisen/wallet/sdk/tsm/TSMOperator;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/nfc/carrera/logic/spi/tsm/laser/LaserTSMServiceImpl;->tsmOperator:Lcom/leisen/wallet/sdk/tsm/TSMOperator;

    .line 52
    return-void
.end method

.method public static getInstance(Landroid/content/Context;)Lcom/huawei/nfc/carrera/logic/spi/tsm/laser/LaserTSMServiceImpl;
    .locals 4

    .line 74
    sget-object v2, Lcom/huawei/nfc/carrera/logic/spi/tsm/laser/LaserTSMServiceImpl;->SYNC_LOCK:[B

    monitor-enter v2

    .line 75
    :try_start_0
    sget-object v0, Lcom/huawei/nfc/carrera/logic/spi/tsm/laser/LaserTSMServiceImpl;->instance:Lcom/huawei/nfc/carrera/logic/spi/tsm/laser/LaserTSMServiceImpl;

    const/4 v1, 0x0

    if-ne v1, v0, :cond_0

    .line 76
    new-instance v0, Lcom/huawei/nfc/carrera/logic/spi/tsm/laser/LaserTSMServiceImpl;

    invoke-direct {v0, p0}, Lcom/huawei/nfc/carrera/logic/spi/tsm/laser/LaserTSMServiceImpl;-><init>(Landroid/content/Context;)V

    sput-object v0, Lcom/huawei/nfc/carrera/logic/spi/tsm/laser/LaserTSMServiceImpl;->instance:Lcom/huawei/nfc/carrera/logic/spi/tsm/laser/LaserTSMServiceImpl;

    .line 78
    :cond_0
    sget-object v0, Lcom/huawei/nfc/carrera/logic/spi/tsm/laser/LaserTSMServiceImpl;->instance:Lcom/huawei/nfc/carrera/logic/spi/tsm/laser/LaserTSMServiceImpl;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v2

    return-object v0

    .line 79
    :catchall_0
    move-exception v3

    monitor-exit v2

    throw v3
.end method

.method private getTsmRemoteUrl()Ljava/lang/String;
    .locals 3

    .line 61
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/spi/tsm/laser/LaserTSMServiceImpl;->mContext:Landroid/content/Context;

    invoke-static {v0}, Lcom/huawei/wallet/utils/PackageUtil;->e(Landroid/content/Context;)I

    move-result v2

    .line 63
    const-string v0, "====123========reportCardStatus ServiceConfig.HUAWEI_TSM_REMOTE_URL.https://tsm.hicloud.com:9001/TSMAPKP/HwTSMServer/applicationBusiness.action"

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->i(Ljava/lang/String;)V

    .line 64
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "https://tsm.hicloud.com:9001/TSMAPKP/HwTSMServer/applicationBusiness.action?version="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method


# virtual methods
.method public excuteTsmCommand(Lcom/huawei/nfc/carrera/logic/spi/tsm/request/CommandRequest;)I
    .locals 5

    .line 85
    const-string v0, "tsm excuteTsmCommand now"

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->i(Ljava/lang/String;)V

    .line 86
    const/4 v0, 0x0

    if-eq v0, p1, :cond_0

    iget-object v0, p1, Lcom/huawei/nfc/carrera/logic/spi/tsm/request/CommandRequest;->serverID:Ljava/lang/String;

    const/4 v1, 0x1

    invoke-static {v0, v1}, Lcom/huawei/nfc/carrera/util/StringUtil;->isEmpty(Ljava/lang/String;Z)Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p1, Lcom/huawei/nfc/carrera/logic/spi/tsm/request/CommandRequest;->funcallID:Ljava/lang/String;

    .line 87
    const/4 v1, 0x1

    invoke-static {v0, v1}, Lcom/huawei/nfc/carrera/util/StringUtil;->isEmpty(Ljava/lang/String;Z)Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p1, Lcom/huawei/nfc/carrera/logic/spi/tsm/request/CommandRequest;->cplc:Ljava/lang/String;

    const/4 v1, 0x1

    invoke-static {v0, v1}, Lcom/huawei/nfc/carrera/util/StringUtil;->isEmpty(Ljava/lang/String;Z)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 89
    :cond_0
    const-string v0, "tsm excuteTsmCommand, params illegal."

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->e(Ljava/lang/String;)V

    .line 90
    const v0, -0x18703

    return v0

    .line 93
    :cond_1
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "tsm excuteTsmCommand, serviceId: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p1, Lcom/huawei/nfc/carrera/logic/spi/tsm/request/CommandRequest;->serverID:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ",functionId: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p1, Lcom/huawei/nfc/carrera/logic/spi/tsm/request/CommandRequest;->funcallID:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->d(Ljava/lang/String;)V

    .line 94
    new-instance v3, Lcom/leisen/wallet/sdk/bean/CommonRequestParams;

    iget-object v0, p1, Lcom/huawei/nfc/carrera/logic/spi/tsm/request/CommandRequest;->serverID:Ljava/lang/String;

    iget-object v1, p1, Lcom/huawei/nfc/carrera/logic/spi/tsm/request/CommandRequest;->funcallID:Ljava/lang/String;

    iget-object v2, p1, Lcom/huawei/nfc/carrera/logic/spi/tsm/request/CommandRequest;->cplc:Ljava/lang/String;

    invoke-direct {v3, v0, v1, v2}, Lcom/leisen/wallet/sdk/bean/CommonRequestParams;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 95
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/spi/tsm/laser/LaserTSMServiceImpl;->tsmOperator:Lcom/leisen/wallet/sdk/tsm/TSMOperator;

    invoke-virtual {v0, v3}, Lcom/leisen/wallet/sdk/tsm/TSMOperator;->commonExecute(Lcom/leisen/wallet/sdk/bean/CommonRequestParams;)I

    move-result v4

    .line 96
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "tsm excuteTsmCommand, result: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->i(Ljava/lang/String;)V

    .line 97
    return v4
.end method
