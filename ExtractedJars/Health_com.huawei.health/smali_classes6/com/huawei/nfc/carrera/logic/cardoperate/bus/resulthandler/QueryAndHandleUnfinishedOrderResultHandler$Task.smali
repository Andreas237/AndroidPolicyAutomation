.class Lcom/huawei/nfc/carrera/logic/cardoperate/bus/resulthandler/QueryAndHandleUnfinishedOrderResultHandler$Task;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/nfc/carrera/logic/cardoperate/bus/resulthandler/QueryAndHandleUnfinishedOrderResultHandler;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = "Task"
.end annotation


# instance fields
.field private mInfo:Lcom/huawei/nfc/carrera/logic/cardoperate/bus/model/OrderHandleResultInfo;

.field private mResultCode:I

.field private mResultType:I

.field final synthetic this$0:Lcom/huawei/nfc/carrera/logic/cardoperate/bus/resulthandler/QueryAndHandleUnfinishedOrderResultHandler;


# direct methods
.method public constructor <init>(Lcom/huawei/nfc/carrera/logic/cardoperate/bus/resulthandler/QueryAndHandleUnfinishedOrderResultHandler;IILcom/huawei/nfc/carrera/logic/cardoperate/bus/model/OrderHandleResultInfo;)V
    .locals 0

    .line 37
    iput-object p1, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/resulthandler/QueryAndHandleUnfinishedOrderResultHandler$Task;->this$0:Lcom/huawei/nfc/carrera/logic/cardoperate/bus/resulthandler/QueryAndHandleUnfinishedOrderResultHandler;

    .line 38
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 39
    iput p2, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/resulthandler/QueryAndHandleUnfinishedOrderResultHandler$Task;->mResultCode:I

    .line 40
    iput p3, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/resulthandler/QueryAndHandleUnfinishedOrderResultHandler$Task;->mResultType:I

    .line 41
    iput-object p4, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/resulthandler/QueryAndHandleUnfinishedOrderResultHandler$Task;->mInfo:Lcom/huawei/nfc/carrera/logic/cardoperate/bus/model/OrderHandleResultInfo;

    .line 42
    return-void
.end method


# virtual methods
.method public run()V
    .locals 4

    .line 47
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/resulthandler/QueryAndHandleUnfinishedOrderResultHandler$Task;->this$0:Lcom/huawei/nfc/carrera/logic/cardoperate/bus/resulthandler/QueryAndHandleUnfinishedOrderResultHandler;

    invoke-static {v0}, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/resulthandler/QueryAndHandleUnfinishedOrderResultHandler;->access$000(Lcom/huawei/nfc/carrera/logic/cardoperate/bus/resulthandler/QueryAndHandleUnfinishedOrderResultHandler;)Lcom/huawei/nfc/carrera/logic/cardoperate/bus/callback/QueryAndHandleUnfinishedOrderCallback;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 49
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/resulthandler/QueryAndHandleUnfinishedOrderResultHandler$Task;->this$0:Lcom/huawei/nfc/carrera/logic/cardoperate/bus/resulthandler/QueryAndHandleUnfinishedOrderResultHandler;

    invoke-static {v0}, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/resulthandler/QueryAndHandleUnfinishedOrderResultHandler;->access$000(Lcom/huawei/nfc/carrera/logic/cardoperate/bus/resulthandler/QueryAndHandleUnfinishedOrderResultHandler;)Lcom/huawei/nfc/carrera/logic/cardoperate/bus/callback/QueryAndHandleUnfinishedOrderCallback;

    move-result-object v0

    iget v1, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/resulthandler/QueryAndHandleUnfinishedOrderResultHandler$Task;->mResultCode:I

    iget v2, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/resulthandler/QueryAndHandleUnfinishedOrderResultHandler$Task;->mResultType:I

    iget-object v3, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/resulthandler/QueryAndHandleUnfinishedOrderResultHandler$Task;->mInfo:Lcom/huawei/nfc/carrera/logic/cardoperate/bus/model/OrderHandleResultInfo;

    invoke-interface {v0, v1, v2, v3}, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/callback/QueryAndHandleUnfinishedOrderCallback;->queryAndHandleUnfinishedOrderCallback(IILcom/huawei/nfc/carrera/logic/cardoperate/bus/model/OrderHandleResultInfo;)V

    .line 51
    :cond_0
    return-void
.end method
