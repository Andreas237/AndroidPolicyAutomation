.class public Lcom/huawei/nfc/carrera/logic/cardoperate/bus/resulthandler/IssueTrafficCardResultHandler;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/huawei/nfc/carrera/logic/cardoperate/bus/TrafficCardBaseResultHandler;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/huawei/nfc/carrera/logic/cardoperate/bus/resulthandler/IssueTrafficCardResultHandler$Task;
    }
.end annotation


# instance fields
.field private mCallback:Lcom/huawei/nfc/carrera/logic/cardoperate/bus/callback/IssueTrafficCardCallback;

.field private mUIHandler:Landroid/os/Handler;


# direct methods
.method public constructor <init>(Landroid/os/Handler;Lcom/huawei/nfc/carrera/logic/cardoperate/bus/callback/IssueTrafficCardCallback;)V
    .locals 0

    .line 15
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 16
    iput-object p1, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/resulthandler/IssueTrafficCardResultHandler;->mUIHandler:Landroid/os/Handler;

    .line 17
    iput-object p2, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/resulthandler/IssueTrafficCardResultHandler;->mCallback:Lcom/huawei/nfc/carrera/logic/cardoperate/bus/callback/IssueTrafficCardCallback;

    .line 18
    return-void
.end method

.method static synthetic access$000(Lcom/huawei/nfc/carrera/logic/cardoperate/bus/resulthandler/IssueTrafficCardResultHandler;)Lcom/huawei/nfc/carrera/logic/cardoperate/bus/callback/IssueTrafficCardCallback;
    .locals 1

    .line 8
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/resulthandler/IssueTrafficCardResultHandler;->mCallback:Lcom/huawei/nfc/carrera/logic/cardoperate/bus/callback/IssueTrafficCardCallback;

    return-object v0
.end method


# virtual methods
.method public handleResult(I)V
    .locals 2

    .line 22
    new-instance v1, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/resulthandler/IssueTrafficCardResultHandler$Task;

    invoke-direct {v1, p0, p1}, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/resulthandler/IssueTrafficCardResultHandler$Task;-><init>(Lcom/huawei/nfc/carrera/logic/cardoperate/bus/resulthandler/IssueTrafficCardResultHandler;I)V

    .line 23
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/resulthandler/IssueTrafficCardResultHandler;->mUIHandler:Landroid/os/Handler;

    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 24
    return-void
.end method
