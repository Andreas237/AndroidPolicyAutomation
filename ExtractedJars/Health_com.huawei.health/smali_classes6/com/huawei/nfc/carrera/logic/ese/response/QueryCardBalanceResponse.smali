.class public Lcom/huawei/nfc/carrera/logic/ese/response/QueryCardBalanceResponse;
.super Lcom/huawei/nfc/carrera/logic/ese/response/QueryCardBaseResponse;
.source "SourceFile"


# instance fields
.field public balance:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 13
    invoke-direct {p0}, Lcom/huawei/nfc/carrera/logic/ese/response/QueryCardBaseResponse;-><init>()V

    .line 14
    const/4 v0, -0x1

    iput v0, p0, Lcom/huawei/nfc/carrera/logic/ese/response/QueryCardBalanceResponse;->resultCode:I

    .line 15
    return-void
.end method

.method public constructor <init>(ILjava/lang/String;)V
    .locals 0

    .line 19
    invoke-direct {p0}, Lcom/huawei/nfc/carrera/logic/ese/response/QueryCardBaseResponse;-><init>()V

    .line 20
    iput p1, p0, Lcom/huawei/nfc/carrera/logic/ese/response/QueryCardBalanceResponse;->resultCode:I

    .line 21
    iput-object p2, p0, Lcom/huawei/nfc/carrera/logic/ese/response/QueryCardBalanceResponse;->balance:Ljava/lang/String;

    .line 22
    return-void
.end method
