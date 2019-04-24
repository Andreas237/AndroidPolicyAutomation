.class public Lcom/huawei/nfc/carrera/logic/cardoperate/cup/InitCUPServiceResultTask;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/huawei/nfc/carrera/logic/cardoperate/cup/InitCUPServiceResultTask$Task;
    }
.end annotation


# instance fields
.field callback:Lcom/huawei/nfc/carrera/logic/cardoperate/response/InitCUPCardOperatorCallback;

.field private operateResultHandler:Landroid/os/Handler;


# direct methods
.method public constructor <init>(Landroid/os/Handler;Lcom/huawei/nfc/carrera/logic/cardoperate/response/InitCUPCardOperatorCallback;)V
    .locals 0

    .line 20
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 21
    iput-object p2, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/cup/InitCUPServiceResultTask;->callback:Lcom/huawei/nfc/carrera/logic/cardoperate/response/InitCUPCardOperatorCallback;

    .line 22
    iput-object p1, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/cup/InitCUPServiceResultTask;->operateResultHandler:Landroid/os/Handler;

    .line 23
    return-void
.end method


# virtual methods
.method public handleResult(I)V
    .locals 2

    .line 33
    new-instance v1, Lcom/huawei/nfc/carrera/logic/cardoperate/cup/InitCUPServiceResultTask$Task;

    invoke-direct {v1, p0, p1}, Lcom/huawei/nfc/carrera/logic/cardoperate/cup/InitCUPServiceResultTask$Task;-><init>(Lcom/huawei/nfc/carrera/logic/cardoperate/cup/InitCUPServiceResultTask;I)V

    .line 34
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/cup/InitCUPServiceResultTask;->operateResultHandler:Landroid/os/Handler;

    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 35
    return-void
.end method
