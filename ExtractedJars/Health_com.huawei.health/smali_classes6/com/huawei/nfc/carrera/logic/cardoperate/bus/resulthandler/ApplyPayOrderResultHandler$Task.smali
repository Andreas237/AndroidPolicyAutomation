.class Lcom/huawei/nfc/carrera/logic/cardoperate/bus/resulthandler/ApplyPayOrderResultHandler$Task;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/nfc/carrera/logic/cardoperate/bus/resulthandler/ApplyPayOrderResultHandler;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = "Task"
.end annotation


# instance fields
.field order:Lcom/huawei/nfc/carrera/logic/cardoperate/bus/model/TrafficOrder;

.field resultCode:I

.field final synthetic this$0:Lcom/huawei/nfc/carrera/logic/cardoperate/bus/resulthandler/ApplyPayOrderResultHandler;


# direct methods
.method public constructor <init>(Lcom/huawei/nfc/carrera/logic/cardoperate/bus/resulthandler/ApplyPayOrderResultHandler;ILcom/huawei/nfc/carrera/logic/cardoperate/bus/model/TrafficOrder;)V
    .locals 0

    .line 31
    iput-object p1, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/resulthandler/ApplyPayOrderResultHandler$Task;->this$0:Lcom/huawei/nfc/carrera/logic/cardoperate/bus/resulthandler/ApplyPayOrderResultHandler;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 32
    iput p2, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/resulthandler/ApplyPayOrderResultHandler$Task;->resultCode:I

    .line 33
    iput-object p3, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/resulthandler/ApplyPayOrderResultHandler$Task;->order:Lcom/huawei/nfc/carrera/logic/cardoperate/bus/model/TrafficOrder;

    .line 34
    return-void
.end method


# virtual methods
.method public run()V
    .locals 3

    .line 39
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/resulthandler/ApplyPayOrderResultHandler$Task;->this$0:Lcom/huawei/nfc/carrera/logic/cardoperate/bus/resulthandler/ApplyPayOrderResultHandler;

    invoke-static {v0}, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/resulthandler/ApplyPayOrderResultHandler;->access$000(Lcom/huawei/nfc/carrera/logic/cardoperate/bus/resulthandler/ApplyPayOrderResultHandler;)Lcom/huawei/nfc/carrera/logic/cardoperate/bus/callback/ApplyPayOrderCallback;

    move-result-object v0

    iget v1, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/resulthandler/ApplyPayOrderResultHandler$Task;->resultCode:I

    iget-object v2, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/resulthandler/ApplyPayOrderResultHandler$Task;->order:Lcom/huawei/nfc/carrera/logic/cardoperate/bus/model/TrafficOrder;

    invoke-interface {v0, v1, v2}, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/callback/ApplyPayOrderCallback;->applyPayOrderCallback(ILcom/huawei/nfc/carrera/logic/cardoperate/bus/model/TrafficOrder;)V

    .line 40
    return-void
.end method
