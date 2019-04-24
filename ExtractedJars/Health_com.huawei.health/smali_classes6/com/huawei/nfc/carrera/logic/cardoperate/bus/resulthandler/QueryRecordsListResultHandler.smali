.class public Lcom/huawei/nfc/carrera/logic/cardoperate/bus/resulthandler/QueryRecordsListResultHandler;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/huawei/nfc/carrera/logic/cardoperate/bus/resulthandler/QueryRecordsListResultHandler$Task;
    }
.end annotation


# instance fields
.field private callback:Lcom/huawei/nfc/carrera/logic/cardoperate/bus/callback/QueryRecordsListCallback;

.field private resultHandler:Landroid/os/Handler;


# direct methods
.method public constructor <init>(Landroid/os/Handler;Lcom/huawei/nfc/carrera/logic/cardoperate/bus/callback/QueryRecordsListCallback;)V
    .locals 0

    .line 23
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 24
    iput-object p2, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/resulthandler/QueryRecordsListResultHandler;->callback:Lcom/huawei/nfc/carrera/logic/cardoperate/bus/callback/QueryRecordsListCallback;

    .line 25
    iput-object p1, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/resulthandler/QueryRecordsListResultHandler;->resultHandler:Landroid/os/Handler;

    .line 26
    return-void
.end method

.method static synthetic access$000(Lcom/huawei/nfc/carrera/logic/cardoperate/bus/resulthandler/QueryRecordsListResultHandler;)Lcom/huawei/nfc/carrera/logic/cardoperate/bus/callback/QueryRecordsListCallback;
    .locals 1

    .line 10
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/resulthandler/QueryRecordsListResultHandler;->callback:Lcom/huawei/nfc/carrera/logic/cardoperate/bus/callback/QueryRecordsListCallback;

    return-object v0
.end method


# virtual methods
.method public handleResult(IILjava/util/List;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(IILjava/util/List<Lcom/huawei/nfc/carrera/logic/cardoperate/bus/model/RecordInfo;>;)V"
        }
    .end annotation

    .line 37
    new-instance v1, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/resulthandler/QueryRecordsListResultHandler$Task;

    invoke-direct {v1, p0, p1, p2, p3}, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/resulthandler/QueryRecordsListResultHandler$Task;-><init>(Lcom/huawei/nfc/carrera/logic/cardoperate/bus/resulthandler/QueryRecordsListResultHandler;IILjava/util/List;)V

    .line 38
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/resulthandler/QueryRecordsListResultHandler;->resultHandler:Landroid/os/Handler;

    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 39
    return-void
.end method
