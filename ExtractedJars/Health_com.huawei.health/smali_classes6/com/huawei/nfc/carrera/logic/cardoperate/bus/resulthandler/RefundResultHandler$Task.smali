.class Lcom/huawei/nfc/carrera/logic/cardoperate/bus/resulthandler/RefundResultHandler$Task;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/nfc/carrera/logic/cardoperate/bus/resulthandler/RefundResultHandler;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = "Task"
.end annotation


# instance fields
.field private resultCode:I

.field final synthetic this$0:Lcom/huawei/nfc/carrera/logic/cardoperate/bus/resulthandler/RefundResultHandler;


# direct methods
.method public constructor <init>(Lcom/huawei/nfc/carrera/logic/cardoperate/bus/resulthandler/RefundResultHandler;I)V
    .locals 0

    .line 46
    iput-object p1, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/resulthandler/RefundResultHandler$Task;->this$0:Lcom/huawei/nfc/carrera/logic/cardoperate/bus/resulthandler/RefundResultHandler;

    .line 47
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 48
    iput p2, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/resulthandler/RefundResultHandler$Task;->resultCode:I

    .line 49
    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    .line 55
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/resulthandler/RefundResultHandler$Task;->this$0:Lcom/huawei/nfc/carrera/logic/cardoperate/bus/resulthandler/RefundResultHandler;

    invoke-static {v0}, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/resulthandler/RefundResultHandler;->access$000(Lcom/huawei/nfc/carrera/logic/cardoperate/bus/resulthandler/RefundResultHandler;)Lcom/huawei/nfc/carrera/logic/cardoperate/bus/callback/RefundCallback;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 57
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/resulthandler/RefundResultHandler$Task;->this$0:Lcom/huawei/nfc/carrera/logic/cardoperate/bus/resulthandler/RefundResultHandler;

    invoke-static {v0}, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/resulthandler/RefundResultHandler;->access$000(Lcom/huawei/nfc/carrera/logic/cardoperate/bus/resulthandler/RefundResultHandler;)Lcom/huawei/nfc/carrera/logic/cardoperate/bus/callback/RefundCallback;

    move-result-object v0

    iget v1, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/resulthandler/RefundResultHandler$Task;->resultCode:I

    invoke-interface {v0, v1}, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/callback/RefundCallback;->refundCallback(I)V

    .line 59
    :cond_0
    return-void
.end method
