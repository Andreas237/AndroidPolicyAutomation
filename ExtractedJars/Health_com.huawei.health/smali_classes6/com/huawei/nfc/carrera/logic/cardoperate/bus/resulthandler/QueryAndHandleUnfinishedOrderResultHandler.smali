.class public Lcom/huawei/nfc/carrera/logic/cardoperate/bus/resulthandler/QueryAndHandleUnfinishedOrderResultHandler;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/huawei/nfc/carrera/logic/cardoperate/bus/resulthandler/QueryAndHandleUnfinishedOrderResultHandler$Task;
    }
.end annotation


# instance fields
.field private mCallback:Lcom/huawei/nfc/carrera/logic/cardoperate/bus/callback/QueryAndHandleUnfinishedOrderCallback;

.field private resultHandler:Landroid/os/Handler;


# direct methods
.method public constructor <init>(Landroid/os/Handler;Lcom/huawei/nfc/carrera/logic/cardoperate/bus/callback/QueryAndHandleUnfinishedOrderCallback;)V
    .locals 0

    .line 17
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 18
    iput-object p1, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/resulthandler/QueryAndHandleUnfinishedOrderResultHandler;->resultHandler:Landroid/os/Handler;

    .line 19
    iput-object p2, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/resulthandler/QueryAndHandleUnfinishedOrderResultHandler;->mCallback:Lcom/huawei/nfc/carrera/logic/cardoperate/bus/callback/QueryAndHandleUnfinishedOrderCallback;

    .line 20
    return-void
.end method

.method static synthetic access$000(Lcom/huawei/nfc/carrera/logic/cardoperate/bus/resulthandler/QueryAndHandleUnfinishedOrderResultHandler;)Lcom/huawei/nfc/carrera/logic/cardoperate/bus/callback/QueryAndHandleUnfinishedOrderCallback;
    .locals 1

    .line 8
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/resulthandler/QueryAndHandleUnfinishedOrderResultHandler;->mCallback:Lcom/huawei/nfc/carrera/logic/cardoperate/bus/callback/QueryAndHandleUnfinishedOrderCallback;

    return-object v0
.end method


# virtual methods
.method public handleResult(IILcom/huawei/nfc/carrera/logic/cardoperate/bus/model/OrderHandleResultInfo;)V
    .locals 2

    .line 24
    new-instance v1, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/resulthandler/QueryAndHandleUnfinishedOrderResultHandler$Task;

    invoke-direct {v1, p0, p1, p2, p3}, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/resulthandler/QueryAndHandleUnfinishedOrderResultHandler$Task;-><init>(Lcom/huawei/nfc/carrera/logic/cardoperate/bus/resulthandler/QueryAndHandleUnfinishedOrderResultHandler;IILcom/huawei/nfc/carrera/logic/cardoperate/bus/model/OrderHandleResultInfo;)V

    .line 25
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/resulthandler/QueryAndHandleUnfinishedOrderResultHandler;->resultHandler:Landroid/os/Handler;

    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 26
    return-void
.end method
