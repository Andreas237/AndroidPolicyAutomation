.class Lcom/huawei/nfc/carrera/logic/cardoperate/cup/InitCUPServiceResultTask$Task;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/nfc/carrera/logic/cardoperate/cup/InitCUPServiceResultTask;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = "Task"
.end annotation


# instance fields
.field private resultCode:I

.field final synthetic this$0:Lcom/huawei/nfc/carrera/logic/cardoperate/cup/InitCUPServiceResultTask;


# direct methods
.method public constructor <init>(Lcom/huawei/nfc/carrera/logic/cardoperate/cup/InitCUPServiceResultTask;I)V
    .locals 0

    .line 45
    iput-object p1, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/cup/InitCUPServiceResultTask$Task;->this$0:Lcom/huawei/nfc/carrera/logic/cardoperate/cup/InitCUPServiceResultTask;

    .line 46
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 47
    iput p2, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/cup/InitCUPServiceResultTask$Task;->resultCode:I

    .line 48
    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    .line 53
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/cup/InitCUPServiceResultTask$Task;->this$0:Lcom/huawei/nfc/carrera/logic/cardoperate/cup/InitCUPServiceResultTask;

    iget-object v0, v0, Lcom/huawei/nfc/carrera/logic/cardoperate/cup/InitCUPServiceResultTask;->callback:Lcom/huawei/nfc/carrera/logic/cardoperate/response/InitCUPCardOperatorCallback;

    if-eqz v0, :cond_0

    .line 55
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/cup/InitCUPServiceResultTask$Task;->this$0:Lcom/huawei/nfc/carrera/logic/cardoperate/cup/InitCUPServiceResultTask;

    iget-object v0, v0, Lcom/huawei/nfc/carrera/logic/cardoperate/cup/InitCUPServiceResultTask;->callback:Lcom/huawei/nfc/carrera/logic/cardoperate/response/InitCUPCardOperatorCallback;

    iget v1, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/cup/InitCUPServiceResultTask$Task;->resultCode:I

    invoke-interface {v0, v1}, Lcom/huawei/nfc/carrera/logic/cardoperate/response/InitCUPCardOperatorCallback;->initCUPCardOperatorResult(I)V

    .line 57
    :cond_0
    return-void
.end method
