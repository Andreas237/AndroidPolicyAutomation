.class public Lcom/huawei/nfc/carrera/logic/cardoperate/bus/resulthandler/QueryOfflineTrafficCardInfoResultHandler;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/huawei/nfc/carrera/logic/cardoperate/bus/resulthandler/QueryOfflineTrafficCardInfoResultHandler$Task;
    }
.end annotation


# instance fields
.field private callback:Lcom/huawei/nfc/carrera/logic/cardoperate/bus/callback/QueryOfflineTrafficCardInfoCallback;

.field private resultHandler:Landroid/os/Handler;


# direct methods
.method public constructor <init>(Landroid/os/Handler;Lcom/huawei/nfc/carrera/logic/cardoperate/bus/callback/QueryOfflineTrafficCardInfoCallback;)V
    .locals 0

    .line 21
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 22
    iput-object p2, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/resulthandler/QueryOfflineTrafficCardInfoResultHandler;->callback:Lcom/huawei/nfc/carrera/logic/cardoperate/bus/callback/QueryOfflineTrafficCardInfoCallback;

    .line 23
    iput-object p1, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/resulthandler/QueryOfflineTrafficCardInfoResultHandler;->resultHandler:Landroid/os/Handler;

    .line 24
    return-void
.end method

.method static synthetic access$000(Lcom/huawei/nfc/carrera/logic/cardoperate/bus/resulthandler/QueryOfflineTrafficCardInfoResultHandler;)Lcom/huawei/nfc/carrera/logic/cardoperate/bus/callback/QueryOfflineTrafficCardInfoCallback;
    .locals 1

    .line 8
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/resulthandler/QueryOfflineTrafficCardInfoResultHandler;->callback:Lcom/huawei/nfc/carrera/logic/cardoperate/bus/callback/QueryOfflineTrafficCardInfoCallback;

    return-object v0
.end method


# virtual methods
.method public handleResult(ILcom/huawei/nfc/carrera/logic/cardoperate/bus/model/OfflineTrafficCardInfo;)V
    .locals 2

    .line 35
    new-instance v1, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/resulthandler/QueryOfflineTrafficCardInfoResultHandler$Task;

    invoke-direct {v1, p0, p1, p2}, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/resulthandler/QueryOfflineTrafficCardInfoResultHandler$Task;-><init>(Lcom/huawei/nfc/carrera/logic/cardoperate/bus/resulthandler/QueryOfflineTrafficCardInfoResultHandler;ILcom/huawei/nfc/carrera/logic/cardoperate/bus/model/OfflineTrafficCardInfo;)V

    .line 36
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/resulthandler/QueryOfflineTrafficCardInfoResultHandler;->resultHandler:Landroid/os/Handler;

    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 37
    return-void
.end method
