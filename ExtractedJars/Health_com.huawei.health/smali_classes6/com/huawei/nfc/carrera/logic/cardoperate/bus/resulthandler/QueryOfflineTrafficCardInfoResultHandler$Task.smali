.class Lcom/huawei/nfc/carrera/logic/cardoperate/bus/resulthandler/QueryOfflineTrafficCardInfoResultHandler$Task;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/nfc/carrera/logic/cardoperate/bus/resulthandler/QueryOfflineTrafficCardInfoResultHandler;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = "Task"
.end annotation


# instance fields
.field private info:Lcom/huawei/nfc/carrera/logic/cardoperate/bus/model/OfflineTrafficCardInfo;

.field private resultCode:I

.field final synthetic this$0:Lcom/huawei/nfc/carrera/logic/cardoperate/bus/resulthandler/QueryOfflineTrafficCardInfoResultHandler;


# direct methods
.method public constructor <init>(Lcom/huawei/nfc/carrera/logic/cardoperate/bus/resulthandler/QueryOfflineTrafficCardInfoResultHandler;ILcom/huawei/nfc/carrera/logic/cardoperate/bus/model/OfflineTrafficCardInfo;)V
    .locals 0

    .line 49
    iput-object p1, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/resulthandler/QueryOfflineTrafficCardInfoResultHandler$Task;->this$0:Lcom/huawei/nfc/carrera/logic/cardoperate/bus/resulthandler/QueryOfflineTrafficCardInfoResultHandler;

    .line 50
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 51
    iput p2, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/resulthandler/QueryOfflineTrafficCardInfoResultHandler$Task;->resultCode:I

    .line 52
    iput-object p3, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/resulthandler/QueryOfflineTrafficCardInfoResultHandler$Task;->info:Lcom/huawei/nfc/carrera/logic/cardoperate/bus/model/OfflineTrafficCardInfo;

    .line 53
    return-void
.end method


# virtual methods
.method public run()V
    .locals 3

    .line 59
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/resulthandler/QueryOfflineTrafficCardInfoResultHandler$Task;->this$0:Lcom/huawei/nfc/carrera/logic/cardoperate/bus/resulthandler/QueryOfflineTrafficCardInfoResultHandler;

    invoke-static {v0}, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/resulthandler/QueryOfflineTrafficCardInfoResultHandler;->access$000(Lcom/huawei/nfc/carrera/logic/cardoperate/bus/resulthandler/QueryOfflineTrafficCardInfoResultHandler;)Lcom/huawei/nfc/carrera/logic/cardoperate/bus/callback/QueryOfflineTrafficCardInfoCallback;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 61
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/resulthandler/QueryOfflineTrafficCardInfoResultHandler$Task;->this$0:Lcom/huawei/nfc/carrera/logic/cardoperate/bus/resulthandler/QueryOfflineTrafficCardInfoResultHandler;

    invoke-static {v0}, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/resulthandler/QueryOfflineTrafficCardInfoResultHandler;->access$000(Lcom/huawei/nfc/carrera/logic/cardoperate/bus/resulthandler/QueryOfflineTrafficCardInfoResultHandler;)Lcom/huawei/nfc/carrera/logic/cardoperate/bus/callback/QueryOfflineTrafficCardInfoCallback;

    move-result-object v0

    iget v1, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/resulthandler/QueryOfflineTrafficCardInfoResultHandler$Task;->resultCode:I

    iget-object v2, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/resulthandler/QueryOfflineTrafficCardInfoResultHandler$Task;->info:Lcom/huawei/nfc/carrera/logic/cardoperate/bus/model/OfflineTrafficCardInfo;

    invoke-interface {v0, v1, v2}, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/callback/QueryOfflineTrafficCardInfoCallback;->queryOfflineTrafficCardInfoCallback(ILcom/huawei/nfc/carrera/logic/cardoperate/bus/model/OfflineTrafficCardInfo;)V

    .line 63
    :cond_0
    return-void
.end method
