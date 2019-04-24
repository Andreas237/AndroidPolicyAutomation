.class public Lcom/huawei/nfc/carrera/logic/cardoperate/impl/SPIOperatorManager;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private final lock:Ljava/lang/Object;

.field private mContext:Landroid/content/Context;

.field private mTrafficCardOperators:Landroid/util/SparseArray;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/util/SparseArray<Lcom/huawei/nfc/carrera/logic/cardoperate/bus/TrafficCardOperator;>;"
        }
    .end annotation
.end field

.field private operateHandler:Landroid/os/Handler;


# direct methods
.method public constructor <init>(Landroid/content/Context;Landroid/os/Handler;)V
    .locals 3

    .line 52
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 44
    new-instance v0, Landroid/util/SparseArray;

    invoke-direct {v0}, Landroid/util/SparseArray;-><init>()V

    iput-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/impl/SPIOperatorManager;->mTrafficCardOperators:Landroid/util/SparseArray;

    .line 50
    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    iput-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/impl/SPIOperatorManager;->lock:Ljava/lang/Object;

    .line 53
    iput-object p1, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/impl/SPIOperatorManager;->mContext:Landroid/content/Context;

    .line 54
    iput-object p2, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/impl/SPIOperatorManager;->operateHandler:Landroid/os/Handler;

    .line 56
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/impl/SPIOperatorManager;->mTrafficCardOperators:Landroid/util/SparseArray;

    new-instance v1, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/fm/FMTrafficCardOperatorImpl;

    invoke-direct {v1, p1}, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/fm/FMTrafficCardOperatorImpl;-><init>(Landroid/content/Context;)V

    const/16 v2, 0xe

    invoke-virtual {v0, v2, v1}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    .line 59
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/impl/SPIOperatorManager;->mTrafficCardOperators:Landroid/util/SparseArray;

    new-instance v1, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/serveraccess/ServerAccessImp;

    invoke-direct {v1, p1}, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/serveraccess/ServerAccessImp;-><init>(Landroid/content/Context;)V

    const/16 v2, 0x16

    invoke-virtual {v0, v2, v1}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    .line 62
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/impl/SPIOperatorManager;->mTrafficCardOperators:Landroid/util/SparseArray;

    new-instance v1, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/serveraccess/ServerAccessImp;

    invoke-direct {v1, p1}, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/serveraccess/ServerAccessImp;-><init>(Landroid/content/Context;)V

    const/16 v2, 0x14

    invoke-virtual {v0, v2, v1}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    .line 64
    return-void
.end method


# virtual methods
.method public getTrafficCardOpertor(I)Lcom/huawei/nfc/carrera/logic/cardoperate/bus/TrafficCardOperator;
    .locals 3

    .line 74
    iget-object v1, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/impl/SPIOperatorManager;->lock:Ljava/lang/Object;

    monitor-enter v1

    .line 75
    :try_start_0
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/impl/SPIOperatorManager;->mTrafficCardOperators:Landroid/util/SparseArray;

    invoke-virtual {v0, p1}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/TrafficCardOperator;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v1

    return-object v0

    .line 76
    :catchall_0
    move-exception v2

    monitor-exit v1

    throw v2
.end method
