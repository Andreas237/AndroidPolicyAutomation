.class public Lcom/huawei/hms/support/api/pay/ProductPayResultInfo;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private a:I

.field private b:Ljava/lang/String;

.field private c:Ljava/lang/String;

.field private d:Ljava/lang/String;

.field private e:J

.field private f:Ljava/lang/String;

.field private g:Ljava/lang/String;

.field private h:Ljava/lang/String;

.field private i:Ljava/lang/String;

.field private j:Ljava/lang/String;

.field private k:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 18
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public getCountry()Ljava/lang/String;
    .locals 1

    .line 121
    iget-object v0, p0, Lcom/huawei/hms/support/api/pay/ProductPayResultInfo;->g:Ljava/lang/String;

    return-object v0
.end method

.method public getCurrency()Ljava/lang/String;
    .locals 1

    .line 105
    iget-object v0, p0, Lcom/huawei/hms/support/api/pay/ProductPayResultInfo;->f:Ljava/lang/String;

    return-object v0
.end method

.method public getErrMsg()Ljava/lang/String;
    .locals 1

    .line 41
    iget-object v0, p0, Lcom/huawei/hms/support/api/pay/ProductPayResultInfo;->b:Ljava/lang/String;

    return-object v0
.end method

.method public getMerchantId()Ljava/lang/String;
    .locals 1

    .line 57
    iget-object v0, p0, Lcom/huawei/hms/support/api/pay/ProductPayResultInfo;->c:Ljava/lang/String;

    return-object v0
.end method

.method public getMicrosAmount()J
    .locals 2

    .line 89
    iget-wide v0, p0, Lcom/huawei/hms/support/api/pay/ProductPayResultInfo;->e:J

    return-wide v0
.end method

.method public getOrderID()Ljava/lang/String;
    .locals 1

    .line 73
    iget-object v0, p0, Lcom/huawei/hms/support/api/pay/ProductPayResultInfo;->d:Ljava/lang/String;

    return-object v0
.end method

.method public getProductNo()Ljava/lang/String;
    .locals 1

    .line 169
    iget-object v0, p0, Lcom/huawei/hms/support/api/pay/ProductPayResultInfo;->j:Ljava/lang/String;

    return-object v0
.end method

.method public getRequestId()Ljava/lang/String;
    .locals 1

    .line 153
    iget-object v0, p0, Lcom/huawei/hms/support/api/pay/ProductPayResultInfo;->i:Ljava/lang/String;

    return-object v0
.end method

.method public getReturnCode()I
    .locals 1

    .line 25
    iget v0, p0, Lcom/huawei/hms/support/api/pay/ProductPayResultInfo;->a:I

    return v0
.end method

.method public getSign()Ljava/lang/String;
    .locals 1

    .line 185
    iget-object v0, p0, Lcom/huawei/hms/support/api/pay/ProductPayResultInfo;->k:Ljava/lang/String;

    return-object v0
.end method

.method public getTime()Ljava/lang/String;
    .locals 1

    .line 137
    iget-object v0, p0, Lcom/huawei/hms/support/api/pay/ProductPayResultInfo;->h:Ljava/lang/String;

    return-object v0
.end method

.method public setCountry(Ljava/lang/String;)V
    .locals 0

    .line 129
    iput-object p1, p0, Lcom/huawei/hms/support/api/pay/ProductPayResultInfo;->g:Ljava/lang/String;

    .line 130
    return-void
.end method

.method public setCurrency(Ljava/lang/String;)V
    .locals 0

    .line 113
    iput-object p1, p0, Lcom/huawei/hms/support/api/pay/ProductPayResultInfo;->f:Ljava/lang/String;

    .line 114
    return-void
.end method

.method public setErrMsg(Ljava/lang/String;)V
    .locals 0

    .line 49
    iput-object p1, p0, Lcom/huawei/hms/support/api/pay/ProductPayResultInfo;->b:Ljava/lang/String;

    .line 50
    return-void
.end method

.method public setMerchantId(Ljava/lang/String;)V
    .locals 0

    .line 65
    iput-object p1, p0, Lcom/huawei/hms/support/api/pay/ProductPayResultInfo;->c:Ljava/lang/String;

    .line 66
    return-void
.end method

.method public setMicrosAmount(J)V
    .locals 0

    .line 97
    iput-wide p1, p0, Lcom/huawei/hms/support/api/pay/ProductPayResultInfo;->e:J

    .line 98
    return-void
.end method

.method public setOrderID(Ljava/lang/String;)V
    .locals 0

    .line 81
    iput-object p1, p0, Lcom/huawei/hms/support/api/pay/ProductPayResultInfo;->d:Ljava/lang/String;

    .line 82
    return-void
.end method

.method public setProductNo(Ljava/lang/String;)V
    .locals 0

    .line 177
    iput-object p1, p0, Lcom/huawei/hms/support/api/pay/ProductPayResultInfo;->j:Ljava/lang/String;

    .line 178
    return-void
.end method

.method public setRequestId(Ljava/lang/String;)V
    .locals 0

    .line 161
    iput-object p1, p0, Lcom/huawei/hms/support/api/pay/ProductPayResultInfo;->i:Ljava/lang/String;

    .line 162
    return-void
.end method

.method public setReturnCode(I)V
    .locals 0

    .line 33
    iput p1, p0, Lcom/huawei/hms/support/api/pay/ProductPayResultInfo;->a:I

    .line 34
    return-void
.end method

.method public setSign(Ljava/lang/String;)V
    .locals 0

    .line 193
    iput-object p1, p0, Lcom/huawei/hms/support/api/pay/ProductPayResultInfo;->k:Ljava/lang/String;

    .line 194
    return-void
.end method

.method public setTime(Ljava/lang/String;)V
    .locals 0

    .line 145
    iput-object p1, p0, Lcom/huawei/hms/support/api/pay/ProductPayResultInfo;->h:Ljava/lang/String;

    .line 146
    return-void
.end method
