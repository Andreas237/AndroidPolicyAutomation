.class public Lcom/huawei/nfc/carrera/logic/cardoperate/impl/BankSPIOperatorManager;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private cupCardOperator:Lcom/huawei/nfc/carrera/logic/lifecycle/cupoperate/CUPCardOperator;

.field private final lock:Ljava/lang/Object;

.field private mContext:Landroid/content/Context;

.field private operateHandler:Landroid/os/Handler;


# direct methods
.method public constructor <init>(Landroid/content/Context;Landroid/os/Handler;)V
    .locals 1

    .line 45
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 43
    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    iput-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/impl/BankSPIOperatorManager;->lock:Ljava/lang/Object;

    .line 46
    iput-object p1, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/impl/BankSPIOperatorManager;->mContext:Landroid/content/Context;

    .line 47
    iput-object p2, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/impl/BankSPIOperatorManager;->operateHandler:Landroid/os/Handler;

    .line 48
    return-void
.end method


# virtual methods
.method public getCUPOperator()Lcom/huawei/nfc/carrera/logic/lifecycle/cupoperate/CUPCardOperator;
    .locals 5

    .line 58
    iget-object v3, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/impl/BankSPIOperatorManager;->lock:Ljava/lang/Object;

    monitor-enter v3

    .line 59
    :try_start_0
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/impl/BankSPIOperatorManager;->cupCardOperator:Lcom/huawei/nfc/carrera/logic/lifecycle/cupoperate/CUPCardOperator;

    const/4 v1, 0x0

    if-ne v1, v0, :cond_0

    .line 60
    new-instance v0, Lcom/huawei/nfc/carrera/logic/lifecycle/cupoperate/CUPCardOperator;

    iget-object v1, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/impl/BankSPIOperatorManager;->mContext:Landroid/content/Context;

    iget-object v2, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/impl/BankSPIOperatorManager;->operateHandler:Landroid/os/Handler;

    invoke-direct {v0, v1, v2}, Lcom/huawei/nfc/carrera/logic/lifecycle/cupoperate/CUPCardOperator;-><init>(Landroid/content/Context;Landroid/os/Handler;)V

    iput-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/impl/BankSPIOperatorManager;->cupCardOperator:Lcom/huawei/nfc/carrera/logic/lifecycle/cupoperate/CUPCardOperator;

    .line 63
    :cond_0
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/impl/BankSPIOperatorManager;->cupCardOperator:Lcom/huawei/nfc/carrera/logic/lifecycle/cupoperate/CUPCardOperator;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v3

    return-object v0

    .line 64
    :catchall_0
    move-exception v4

    monitor-exit v3

    throw v4
.end method

.method public isCiticMode(I)Z
    .locals 1

    .line 76
    const/16 v0, 0xb

    if-ne v0, p1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public isCiticMode(ILjava/lang/String;)Z
    .locals 5

    .line 88
    iget-object v2, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/impl/BankSPIOperatorManager;->lock:Ljava/lang/Object;

    monitor-enter v2

    .line 89
    const/16 v0, 0xb

    if-ne p1, v0, :cond_1

    .line 90
    :try_start_0
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/impl/BankSPIOperatorManager;->mContext:Landroid/content/Context;

    invoke-static {v0}, Lcom/huawei/nfc/carrera/logic/ta/WalletTaManager;->getInstance(Landroid/content/Context;)Lcom/huawei/nfc/carrera/logic/ta/WalletTaManager;

    move-result-object v0

    .line 91
    invoke-virtual {v0, p2}, Lcom/huawei/nfc/carrera/logic/ta/WalletTaManager;->getCard(Ljava/lang/String;)Lcom/huawei/nfc/carrera/logic/ta/TACardInfo;

    move-result-object v3

    .line 93
    if-eqz v3, :cond_0

    const-string v0, "A0000003330101020063020000000301"

    .line 94
    invoke-virtual {v3}, Lcom/huawei/nfc/carrera/logic/ta/TACardInfo;->getAid()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    monitor-exit v2

    .line 93
    return v0

    .line 97
    :cond_1
    monitor-exit v2

    const/4 v0, 0x0

    return v0

    .line 98
    :catchall_0
    move-exception v4

    monitor-exit v2

    throw v4
.end method

.method public isCupMode(I)Z
    .locals 1

    .line 109
    const/16 v0, 0xd

    if-ne v0, p1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method
