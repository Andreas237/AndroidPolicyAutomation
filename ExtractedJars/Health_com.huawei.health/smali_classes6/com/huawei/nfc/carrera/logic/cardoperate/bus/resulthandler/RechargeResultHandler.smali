.class public Lcom/huawei/nfc/carrera/logic/cardoperate/bus/resulthandler/RechargeResultHandler;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/huawei/nfc/carrera/logic/cardoperate/bus/resulthandler/RechargeResultHandler$Task;
    }
.end annotation


# instance fields
.field private mCallback:Lcom/huawei/nfc/carrera/logic/cardoperate/bus/callback/RechargeCallback;

.field private mUIHandler:Landroid/os/Handler;


# direct methods
.method public constructor <init>(Landroid/os/Handler;Lcom/huawei/nfc/carrera/logic/cardoperate/bus/callback/RechargeCallback;)V
    .locals 0

    .line 14
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 15
    iput-object p1, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/resulthandler/RechargeResultHandler;->mUIHandler:Landroid/os/Handler;

    .line 16
    iput-object p2, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/resulthandler/RechargeResultHandler;->mCallback:Lcom/huawei/nfc/carrera/logic/cardoperate/bus/callback/RechargeCallback;

    .line 17
    return-void
.end method

.method static synthetic access$000(Lcom/huawei/nfc/carrera/logic/cardoperate/bus/resulthandler/RechargeResultHandler;)Lcom/huawei/nfc/carrera/logic/cardoperate/bus/callback/RechargeCallback;
    .locals 1

    .line 7
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/resulthandler/RechargeResultHandler;->mCallback:Lcom/huawei/nfc/carrera/logic/cardoperate/bus/callback/RechargeCallback;

    return-object v0
.end method


# virtual methods
.method public handleResult(I)V
    .locals 2

    .line 21
    new-instance v1, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/resulthandler/RechargeResultHandler$Task;

    invoke-direct {v1, p0, p1}, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/resulthandler/RechargeResultHandler$Task;-><init>(Lcom/huawei/nfc/carrera/logic/cardoperate/bus/resulthandler/RechargeResultHandler;I)V

    .line 22
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/resulthandler/RechargeResultHandler;->mUIHandler:Landroid/os/Handler;

    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 23
    return-void
.end method
