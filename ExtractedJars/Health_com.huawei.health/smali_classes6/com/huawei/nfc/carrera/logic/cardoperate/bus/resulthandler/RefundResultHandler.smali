.class public Lcom/huawei/nfc/carrera/logic/cardoperate/bus/resulthandler/RefundResultHandler;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/huawei/nfc/carrera/logic/cardoperate/bus/resulthandler/RefundResultHandler$Task;
    }
.end annotation


# instance fields
.field private callback:Lcom/huawei/nfc/carrera/logic/cardoperate/bus/callback/RefundCallback;

.field private resultHandler:Landroid/os/Handler;


# direct methods
.method public constructor <init>(Landroid/os/Handler;Lcom/huawei/nfc/carrera/logic/cardoperate/bus/callback/RefundCallback;)V
    .locals 0

    .line 20
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 21
    iput-object p2, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/resulthandler/RefundResultHandler;->callback:Lcom/huawei/nfc/carrera/logic/cardoperate/bus/callback/RefundCallback;

    .line 22
    iput-object p1, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/resulthandler/RefundResultHandler;->resultHandler:Landroid/os/Handler;

    .line 23
    return-void
.end method

.method static synthetic access$000(Lcom/huawei/nfc/carrera/logic/cardoperate/bus/resulthandler/RefundResultHandler;)Lcom/huawei/nfc/carrera/logic/cardoperate/bus/callback/RefundCallback;
    .locals 1

    .line 7
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/resulthandler/RefundResultHandler;->callback:Lcom/huawei/nfc/carrera/logic/cardoperate/bus/callback/RefundCallback;

    return-object v0
.end method


# virtual methods
.method public handleResult(I)V
    .locals 2

    .line 34
    new-instance v1, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/resulthandler/RefundResultHandler$Task;

    invoke-direct {v1, p0, p1}, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/resulthandler/RefundResultHandler$Task;-><init>(Lcom/huawei/nfc/carrera/logic/cardoperate/bus/resulthandler/RefundResultHandler;I)V

    .line 35
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/resulthandler/RefundResultHandler;->resultHandler:Landroid/os/Handler;

    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 36
    return-void
.end method
