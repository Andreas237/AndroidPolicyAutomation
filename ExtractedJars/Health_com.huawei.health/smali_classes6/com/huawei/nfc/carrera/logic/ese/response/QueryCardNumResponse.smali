.class public Lcom/huawei/nfc/carrera/logic/ese/response/QueryCardNumResponse;
.super Lcom/huawei/nfc/carrera/logic/ese/response/QueryCardBaseResponse;
.source "SourceFile"


# instance fields
.field public cardNum:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 10
    invoke-direct {p0}, Lcom/huawei/nfc/carrera/logic/ese/response/QueryCardBaseResponse;-><init>()V

    .line 11
    const/4 v0, -0x1

    iput v0, p0, Lcom/huawei/nfc/carrera/logic/ese/response/QueryCardNumResponse;->resultCode:I

    .line 12
    return-void
.end method

.method public constructor <init>(ILjava/lang/String;)V
    .locals 0

    .line 16
    invoke-direct {p0}, Lcom/huawei/nfc/carrera/logic/ese/response/QueryCardBaseResponse;-><init>()V

    .line 17
    iput p1, p0, Lcom/huawei/nfc/carrera/logic/ese/response/QueryCardNumResponse;->resultCode:I

    .line 18
    iput-object p2, p0, Lcom/huawei/nfc/carrera/logic/ese/response/QueryCardNumResponse;->cardNum:Ljava/lang/String;

    .line 19
    return-void
.end method
