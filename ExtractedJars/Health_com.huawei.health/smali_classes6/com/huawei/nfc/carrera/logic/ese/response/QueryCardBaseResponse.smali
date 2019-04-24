.class public Lcom/huawei/nfc/carrera/logic/ese/response/QueryCardBaseResponse;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public resultCode:I


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 19
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 20
    return-void
.end method

.method public constructor <init>(I)V
    .locals 0

    .line 23
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 24
    iput p1, p0, Lcom/huawei/nfc/carrera/logic/ese/response/QueryCardBaseResponse;->resultCode:I

    .line 25
    return-void
.end method


# virtual methods
.method public isSuccess()Z
    .locals 1

    .line 15
    iget v0, p0, Lcom/huawei/nfc/carrera/logic/ese/response/QueryCardBaseResponse;->resultCode:I

    if-nez v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method
