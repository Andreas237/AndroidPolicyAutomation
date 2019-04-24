.class public Lcom/huawei/nfc/carrera/logic/cardoperate/bus/resulthandler/ApplyPayOrderResultHandler;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/huawei/nfc/carrera/logic/cardoperate/bus/resulthandler/ApplyPayOrderResultHandler$Task;
    }
.end annotation


# instance fields
.field private mCallback:Lcom/huawei/nfc/carrera/logic/cardoperate/bus/callback/ApplyPayOrderCallback;

.field private mUIHandler:Landroid/os/Handler;


# direct methods
.method public constructor <init>(Landroid/os/Handler;Lcom/huawei/nfc/carrera/logic/cardoperate/bus/callback/ApplyPayOrderCallback;)V
    .locals 0

    .line 15
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 16
    iput-object p1, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/resulthandler/ApplyPayOrderResultHandler;->mUIHandler:Landroid/os/Handler;

    .line 17
    iput-object p2, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/resulthandler/ApplyPayOrderResultHandler;->mCallback:Lcom/huawei/nfc/carrera/logic/cardoperate/bus/callback/ApplyPayOrderCallback;

    .line 18
    return-void
.end method

.method static synthetic access$000(Lcom/huawei/nfc/carrera/logic/cardoperate/bus/resulthandler/ApplyPayOrderResultHandler;)Lcom/huawei/nfc/carrera/logic/cardoperate/bus/callback/ApplyPayOrderCallback;
    .locals 1

    .line 8
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/resulthandler/ApplyPayOrderResultHandler;->mCallback:Lcom/huawei/nfc/carrera/logic/cardoperate/bus/callback/ApplyPayOrderCallback;

    return-object v0
.end method


# virtual methods
.method public handleResult(ILcom/huawei/nfc/carrera/logic/cardoperate/bus/model/TrafficOrder;)V
    .locals 2

    .line 22
    new-instance v1, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/resulthandler/ApplyPayOrderResultHandler$Task;

    invoke-direct {v1, p0, p1, p2}, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/resulthandler/ApplyPayOrderResultHandler$Task;-><init>(Lcom/huawei/nfc/carrera/logic/cardoperate/bus/resulthandler/ApplyPayOrderResultHandler;ILcom/huawei/nfc/carrera/logic/cardoperate/bus/model/TrafficOrder;)V

    .line 23
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/resulthandler/ApplyPayOrderResultHandler;->mUIHandler:Landroid/os/Handler;

    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 24
    return-void
.end method
