.class public Lcom/huawei/hms/support/api/pay/PayResultInfo;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private a:I

.field private b:Ljava/lang/String;

.field private c:Ljava/lang/String;

.field private d:Ljava/lang/String;

.field private e:Ljava/lang/String;

.field private f:Ljava/lang/String;

.field private g:Ljava/lang/String;

.field private h:Ljava/lang/String;

.field private i:Ljava/lang/String;

.field private j:Ljava/lang/String;

.field private k:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 17
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public getAmount()Ljava/lang/String;
    .locals 1

    .line 72
    iget-object v0, p0, Lcom/huawei/hms/support/api/pay/PayResultInfo;->d:Ljava/lang/String;

    return-object v0
.end method

.method public getCountry()Ljava/lang/String;
    .locals 1

    .line 104
    iget-object v0, p0, Lcom/huawei/hms/support/api/pay/PayResultInfo;->f:Ljava/lang/String;

    return-object v0
.end method

.method public getCurrency()Ljava/lang/String;
    .locals 1

    .line 88
    iget-object v0, p0, Lcom/huawei/hms/support/api/pay/PayResultInfo;->e:Ljava/lang/String;

    return-object v0
.end method

.method public getErrMsg()Ljava/lang/String;
    .locals 1

    .line 40
    iget-object v0, p0, Lcom/huawei/hms/support/api/pay/PayResultInfo;->b:Ljava/lang/String;

    return-object v0
.end method

.method public getOrderID()Ljava/lang/String;
    .locals 1

    .line 56
    iget-object v0, p0, Lcom/huawei/hms/support/api/pay/PayResultInfo;->c:Ljava/lang/String;

    return-object v0
.end method

.method public getRequestId()Ljava/lang/String;
    .locals 1

    .line 152
    iget-object v0, p0, Lcom/huawei/hms/support/api/pay/PayResultInfo;->i:Ljava/lang/String;

    return-object v0
.end method

.method public getReturnCode()I
    .locals 1

    .line 24
    iget v0, p0, Lcom/huawei/hms/support/api/pay/PayResultInfo;->a:I

    return v0
.end method

.method public getSign()Ljava/lang/String;
    .locals 1

    .line 184
    iget-object v0, p0, Lcom/huawei/hms/support/api/pay/PayResultInfo;->k:Ljava/lang/String;

    return-object v0
.end method

.method public getTime()Ljava/lang/String;
    .locals 1

    .line 112
    iget-object v0, p0, Lcom/huawei/hms/support/api/pay/PayResultInfo;->g:Ljava/lang/String;

    return-object v0
.end method

.method public getUserName()Ljava/lang/String;
    .locals 1

    .line 168
    iget-object v0, p0, Lcom/huawei/hms/support/api/pay/PayResultInfo;->j:Ljava/lang/String;

    return-object v0
.end method

.method public getWithholdID()Ljava/lang/String;
    .locals 1

    .line 136
    iget-object v0, p0, Lcom/huawei/hms/support/api/pay/PayResultInfo;->h:Ljava/lang/String;

    return-object v0
.end method

.method public setAmount(Ljava/lang/String;)V
    .locals 0

    .line 80
    iput-object p1, p0, Lcom/huawei/hms/support/api/pay/PayResultInfo;->d:Ljava/lang/String;

    .line 81
    return-void
.end method

.method public setCountry(Ljava/lang/String;)V
    .locals 0

    .line 120
    iput-object p1, p0, Lcom/huawei/hms/support/api/pay/PayResultInfo;->f:Ljava/lang/String;

    .line 121
    return-void
.end method

.method public setCurrency(Ljava/lang/String;)V
    .locals 0

    .line 96
    iput-object p1, p0, Lcom/huawei/hms/support/api/pay/PayResultInfo;->e:Ljava/lang/String;

    .line 97
    return-void
.end method

.method public setErrMsg(Ljava/lang/String;)V
    .locals 0

    .line 48
    iput-object p1, p0, Lcom/huawei/hms/support/api/pay/PayResultInfo;->b:Ljava/lang/String;

    .line 49
    return-void
.end method

.method public setOrderID(Ljava/lang/String;)V
    .locals 0

    .line 64
    iput-object p1, p0, Lcom/huawei/hms/support/api/pay/PayResultInfo;->c:Ljava/lang/String;

    .line 65
    return-void
.end method

.method public setRequestId(Ljava/lang/String;)V
    .locals 0

    .line 160
    iput-object p1, p0, Lcom/huawei/hms/support/api/pay/PayResultInfo;->i:Ljava/lang/String;

    .line 161
    return-void
.end method

.method public setReturnCode(I)V
    .locals 0

    .line 32
    iput p1, p0, Lcom/huawei/hms/support/api/pay/PayResultInfo;->a:I

    .line 33
    return-void
.end method

.method public setSign(Ljava/lang/String;)V
    .locals 0

    .line 192
    iput-object p1, p0, Lcom/huawei/hms/support/api/pay/PayResultInfo;->k:Ljava/lang/String;

    .line 193
    return-void
.end method

.method public setTime(Ljava/lang/String;)V
    .locals 0

    .line 128
    iput-object p1, p0, Lcom/huawei/hms/support/api/pay/PayResultInfo;->g:Ljava/lang/String;

    .line 129
    return-void
.end method

.method public setUserName(Ljava/lang/String;)V
    .locals 0

    .line 176
    iput-object p1, p0, Lcom/huawei/hms/support/api/pay/PayResultInfo;->j:Ljava/lang/String;

    .line 177
    return-void
.end method

.method public setWithholdID(Ljava/lang/String;)V
    .locals 0

    .line 144
    iput-object p1, p0, Lcom/huawei/hms/support/api/pay/PayResultInfo;->h:Ljava/lang/String;

    .line 145
    return-void
.end method
