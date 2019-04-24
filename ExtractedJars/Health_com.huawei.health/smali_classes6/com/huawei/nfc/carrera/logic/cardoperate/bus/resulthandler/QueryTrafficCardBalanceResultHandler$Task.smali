.class Lcom/huawei/nfc/carrera/logic/cardoperate/bus/resulthandler/QueryTrafficCardBalanceResultHandler$Task;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/nfc/carrera/logic/cardoperate/bus/resulthandler/QueryTrafficCardBalanceResultHandler;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = "Task"
.end annotation


# instance fields
.field private balance:D

.field private resultCode:I

.field final synthetic this$0:Lcom/huawei/nfc/carrera/logic/cardoperate/bus/resulthandler/QueryTrafficCardBalanceResultHandler;


# direct methods
.method public constructor <init>(Lcom/huawei/nfc/carrera/logic/cardoperate/bus/resulthandler/QueryTrafficCardBalanceResultHandler;ID)V
    .locals 0

    .line 48
    iput-object p1, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/resulthandler/QueryTrafficCardBalanceResultHandler$Task;->this$0:Lcom/huawei/nfc/carrera/logic/cardoperate/bus/resulthandler/QueryTrafficCardBalanceResultHandler;

    .line 49
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 50
    iput p2, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/resulthandler/QueryTrafficCardBalanceResultHandler$Task;->resultCode:I

    .line 51
    iput-wide p3, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/resulthandler/QueryTrafficCardBalanceResultHandler$Task;->balance:D

    .line 52
    return-void
.end method


# virtual methods
.method public run()V
    .locals 4

    .line 58
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/resulthandler/QueryTrafficCardBalanceResultHandler$Task;->this$0:Lcom/huawei/nfc/carrera/logic/cardoperate/bus/resulthandler/QueryTrafficCardBalanceResultHandler;

    invoke-static {v0}, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/resulthandler/QueryTrafficCardBalanceResultHandler;->access$000(Lcom/huawei/nfc/carrera/logic/cardoperate/bus/resulthandler/QueryTrafficCardBalanceResultHandler;)Lcom/huawei/nfc/carrera/logic/cardoperate/bus/callback/QueryTrafficCardBalanceCallback;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 60
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/resulthandler/QueryTrafficCardBalanceResultHandler$Task;->this$0:Lcom/huawei/nfc/carrera/logic/cardoperate/bus/resulthandler/QueryTrafficCardBalanceResultHandler;

    invoke-static {v0}, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/resulthandler/QueryTrafficCardBalanceResultHandler;->access$000(Lcom/huawei/nfc/carrera/logic/cardoperate/bus/resulthandler/QueryTrafficCardBalanceResultHandler;)Lcom/huawei/nfc/carrera/logic/cardoperate/bus/callback/QueryTrafficCardBalanceCallback;

    move-result-object v0

    iget v1, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/resulthandler/QueryTrafficCardBalanceResultHandler$Task;->resultCode:I

    iget-wide v2, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/resulthandler/QueryTrafficCardBalanceResultHandler$Task;->balance:D

    invoke-interface {v0, v1, v2, v3}, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/callback/QueryTrafficCardBalanceCallback;->queryTrafficCardBalance(ID)V

    .line 62
    :cond_0
    return-void
.end method
