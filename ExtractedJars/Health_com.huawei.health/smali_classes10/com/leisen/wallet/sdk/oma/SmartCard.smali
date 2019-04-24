.class public Lcom/leisen/wallet/sdk/oma/SmartCard;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final MAIN_CHANNEL:I = 0x0

.field private static final SYNC_LOCK:[B

.field private static final TAG:Ljava/lang/String; = "SmartCard"

.field private static mInstance:Lcom/leisen/wallet/sdk/oma/SmartCard; = null


# instance fields
.field private mCallback:Lcom/leisen/wallet/sdk/oma/SmartCardCallback;

.field private mFlag:I

.field private mServiceIsConnection:Z

.field private mSmartCardBean:Lcom/leisen/wallet/sdk/oma/SmartCardBean;

.field private mSmartCardRequest:Lcom/leisen/wallet/sdk/oma/SmartCardRequest;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 20
    const/4 v0, 0x0

    new-array v0, v0, [B

    sput-object v0, Lcom/leisen/wallet/sdk/oma/SmartCard;->SYNC_LOCK:[B

    return-void
.end method

.method private constructor <init>()V
    .locals 1

    .line 29
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 26
    const/4 v0, -0x1

    iput v0, p0, Lcom/leisen/wallet/sdk/oma/SmartCard;->mFlag:I

    .line 27
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/leisen/wallet/sdk/oma/SmartCard;->mServiceIsConnection:Z

    .line 31
    return-void
.end method

.method private executeSmartCardRequest()V
    .locals 4

    .line 77
    iget-object v0, p0, Lcom/leisen/wallet/sdk/oma/SmartCard;->mSmartCardRequest:Lcom/leisen/wallet/sdk/oma/SmartCardRequest;

    if-nez v0, :cond_0

    .line 78
    const-string v0, "SmartCard"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "new  SmartCardRequest"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 79
    new-instance v0, Lcom/leisen/wallet/sdk/oma/SmartCardRequest;

    invoke-direct {v0}, Lcom/leisen/wallet/sdk/oma/SmartCardRequest;-><init>()V

    iput-object v0, p0, Lcom/leisen/wallet/sdk/oma/SmartCard;->mSmartCardRequest:Lcom/leisen/wallet/sdk/oma/SmartCardRequest;

    .line 81
    :cond_0
    iget-object v0, p0, Lcom/leisen/wallet/sdk/oma/SmartCard;->mSmartCardRequest:Lcom/leisen/wallet/sdk/oma/SmartCardRequest;

    iget-object v1, p0, Lcom/leisen/wallet/sdk/oma/SmartCard;->mSmartCardBean:Lcom/leisen/wallet/sdk/oma/SmartCardBean;

    invoke-virtual {v0, v1}, Lcom/leisen/wallet/sdk/oma/SmartCardRequest;->setSmartCartBean(Lcom/leisen/wallet/sdk/oma/SmartCardBean;)V

    .line 82
    iget-object v0, p0, Lcom/leisen/wallet/sdk/oma/SmartCard;->mSmartCardRequest:Lcom/leisen/wallet/sdk/oma/SmartCardRequest;

    iget-object v1, p0, Lcom/leisen/wallet/sdk/oma/SmartCard;->mCallback:Lcom/leisen/wallet/sdk/oma/SmartCardCallback;

    invoke-virtual {v0, v1}, Lcom/leisen/wallet/sdk/oma/SmartCardRequest;->setSmartCardCallback(Lcom/leisen/wallet/sdk/oma/SmartCardCallback;)V

    .line 83
    iget-object v0, p0, Lcom/leisen/wallet/sdk/oma/SmartCard;->mSmartCardRequest:Lcom/leisen/wallet/sdk/oma/SmartCardRequest;

    iget v1, p0, Lcom/leisen/wallet/sdk/oma/SmartCard;->mFlag:I

    invoke-virtual {v0, v1}, Lcom/leisen/wallet/sdk/oma/SmartCardRequest;->setFlag(I)V

    .line 84
    iget-object v0, p0, Lcom/leisen/wallet/sdk/oma/SmartCard;->mSmartCardRequest:Lcom/leisen/wallet/sdk/oma/SmartCardRequest;

    invoke-virtual {v0}, Lcom/leisen/wallet/sdk/oma/SmartCardRequest;->run()V

    .line 85
    return-void
.end method

.method public static getInstance()Lcom/leisen/wallet/sdk/oma/SmartCard;
    .locals 3

    .line 40
    sget-object v1, Lcom/leisen/wallet/sdk/oma/SmartCard;->SYNC_LOCK:[B

    monitor-enter v1

    .line 41
    :try_start_0
    sget-object v0, Lcom/leisen/wallet/sdk/oma/SmartCard;->mInstance:Lcom/leisen/wallet/sdk/oma/SmartCard;

    if-nez v0, :cond_0

    .line 42
    new-instance v0, Lcom/leisen/wallet/sdk/oma/SmartCard;

    invoke-direct {v0}, Lcom/leisen/wallet/sdk/oma/SmartCard;-><init>()V

    sput-object v0, Lcom/leisen/wallet/sdk/oma/SmartCard;->mInstance:Lcom/leisen/wallet/sdk/oma/SmartCard;

    .line 44
    :cond_0
    sget-object v0, Lcom/leisen/wallet/sdk/oma/SmartCard;->mInstance:Lcom/leisen/wallet/sdk/oma/SmartCard;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v1

    return-object v0

    .line 45
    :catchall_0
    move-exception v2

    monitor-exit v1

    throw v2
.end method

.method private operFailure(ILjava/lang/String;)V
    .locals 2

    .line 117
    iget-object v0, p0, Lcom/leisen/wallet/sdk/oma/SmartCard;->mCallback:Lcom/leisen/wallet/sdk/oma/SmartCardCallback;

    if-eqz v0, :cond_0

    .line 118
    new-instance v1, Ljava/lang/Error;

    invoke-direct {v1, p2}, Ljava/lang/Error;-><init>(Ljava/lang/String;)V

    .line 119
    iget-object v0, p0, Lcom/leisen/wallet/sdk/oma/SmartCard;->mCallback:Lcom/leisen/wallet/sdk/oma/SmartCardCallback;

    invoke-interface {v0, p1, v1}, Lcom/leisen/wallet/sdk/oma/SmartCardCallback;->onOperFailure(ILjava/lang/Error;)V

    .line 121
    :cond_0
    return-void
.end method


# virtual methods
.method public closeChannel()V
    .locals 1

    .line 101
    iget-object v0, p0, Lcom/leisen/wallet/sdk/oma/SmartCard;->mSmartCardRequest:Lcom/leisen/wallet/sdk/oma/SmartCardRequest;

    if-eqz v0, :cond_0

    .line 102
    iget-object v0, p0, Lcom/leisen/wallet/sdk/oma/SmartCard;->mSmartCardRequest:Lcom/leisen/wallet/sdk/oma/SmartCardRequest;

    invoke-virtual {v0}, Lcom/leisen/wallet/sdk/oma/SmartCardRequest;->closeChannelAndSession()V

    .line 103
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/leisen/wallet/sdk/oma/SmartCard;->mSmartCardRequest:Lcom/leisen/wallet/sdk/oma/SmartCardRequest;

    .line 105
    :cond_0
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/leisen/wallet/sdk/oma/SmartCard;->mCallback:Lcom/leisen/wallet/sdk/oma/SmartCardCallback;

    .line 106
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/leisen/wallet/sdk/oma/SmartCard;->mSmartCardBean:Lcom/leisen/wallet/sdk/oma/SmartCardBean;

    .line 107
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/leisen/wallet/sdk/oma/SmartCard;->mSmartCardRequest:Lcom/leisen/wallet/sdk/oma/SmartCardRequest;

    .line 108
    return-void
.end method

.method public execute(Landroid/content/Context;ILcom/leisen/wallet/sdk/oma/SmartCardBean;)V
    .locals 2

    .line 56
    iput p2, p0, Lcom/leisen/wallet/sdk/oma/SmartCard;->mFlag:I

    .line 57
    if-nez p3, :cond_0

    .line 58
    iget v0, p0, Lcom/leisen/wallet/sdk/oma/SmartCard;->mFlag:I

    const-string v1, "SmartCardBean must not allow to null"

    invoke-direct {p0, v0, v1}, Lcom/leisen/wallet/sdk/oma/SmartCard;->operFailure(ILjava/lang/String;)V

    .line 59
    return-void

    .line 62
    :cond_0
    invoke-virtual {p3}, Lcom/leisen/wallet/sdk/oma/SmartCardBean;->getReaderName()Ljava/lang/String;

    move-result-object v0

    if-nez v0, :cond_1

    .line 63
    iget v0, p0, Lcom/leisen/wallet/sdk/oma/SmartCard;->mFlag:I

    const-string v1, "choose reader not exist"

    invoke-direct {p0, v0, v1}, Lcom/leisen/wallet/sdk/oma/SmartCard;->operFailure(ILjava/lang/String;)V

    .line 64
    return-void

    .line 67
    :cond_1
    invoke-virtual {p3}, Lcom/leisen/wallet/sdk/oma/SmartCardBean;->getAid()Ljava/lang/String;

    move-result-object v0

    if-nez v0, :cond_2

    .line 68
    iget v0, p0, Lcom/leisen/wallet/sdk/oma/SmartCard;->mFlag:I

    const-string v1, "the aid must not allow to null"

    invoke-direct {p0, v0, v1}, Lcom/leisen/wallet/sdk/oma/SmartCard;->operFailure(ILjava/lang/String;)V

    .line 69
    return-void

    .line 72
    :cond_2
    iput-object p3, p0, Lcom/leisen/wallet/sdk/oma/SmartCard;->mSmartCardBean:Lcom/leisen/wallet/sdk/oma/SmartCardBean;

    .line 73
    invoke-direct {p0}, Lcom/leisen/wallet/sdk/oma/SmartCard;->executeSmartCardRequest()V

    .line 74
    return-void
.end method

.method public setSmartCardCallBack(Lcom/leisen/wallet/sdk/oma/SmartCardCallback;)Lcom/leisen/wallet/sdk/oma/SmartCard;
    .locals 0

    .line 93
    iput-object p1, p0, Lcom/leisen/wallet/sdk/oma/SmartCard;->mCallback:Lcom/leisen/wallet/sdk/oma/SmartCardCallback;

    .line 94
    return-object p0
.end method
