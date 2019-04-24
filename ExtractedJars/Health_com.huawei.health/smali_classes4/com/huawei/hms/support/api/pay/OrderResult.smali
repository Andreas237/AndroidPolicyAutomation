.class public Lcom/huawei/hms/support/api/pay/OrderResult;
.super Lcom/huawei/hms/support/api/client/Result;
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


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 15
    invoke-direct {p0}, Lcom/huawei/hms/support/api/client/Result;-><init>()V

    return-void
.end method

.method public constructor <init>(Lcom/huawei/hms/support/api/entity/pay/OrderResp;)V
    .locals 1

    .line 31
    invoke-direct {p0}, Lcom/huawei/hms/support/api/client/Result;-><init>()V

    .line 32
    invoke-virtual {p1}, Lcom/huawei/hms/support/api/entity/pay/OrderResp;->getReturnCode()I

    move-result v0

    invoke-direct {p0, v0}, Lcom/huawei/hms/support/api/pay/OrderResult;->a(I)V

    .line 33
    invoke-virtual {p1}, Lcom/huawei/hms/support/api/entity/pay/OrderResp;->getReturnDesc()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/huawei/hms/support/api/pay/OrderResult;->a(Ljava/lang/String;)V

    .line 34
    invoke-virtual {p1}, Lcom/huawei/hms/support/api/entity/pay/OrderResp;->getRequestId()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/huawei/hms/support/api/pay/OrderResult;->b(Ljava/lang/String;)V

    .line 35
    invoke-virtual {p1}, Lcom/huawei/hms/support/api/entity/pay/OrderResp;->getOrderID()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/huawei/hms/support/api/pay/OrderResult;->c(Ljava/lang/String;)V

    .line 36
    invoke-virtual {p1}, Lcom/huawei/hms/support/api/entity/pay/OrderResp;->getOrderTime()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/huawei/hms/support/api/pay/OrderResult;->d(Ljava/lang/String;)V

    .line 37
    invoke-virtual {p1}, Lcom/huawei/hms/support/api/entity/pay/OrderResp;->getTradeTime()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/huawei/hms/support/api/pay/OrderResult;->e(Ljava/lang/String;)V

    .line 38
    invoke-virtual {p1}, Lcom/huawei/hms/support/api/entity/pay/OrderResp;->getStatus()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/huawei/hms/support/api/pay/OrderResult;->f(Ljava/lang/String;)V

    .line 39
    invoke-virtual {p1}, Lcom/huawei/hms/support/api/entity/pay/OrderResp;->getSign()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/huawei/hms/support/api/pay/OrderResult;->g(Ljava/lang/String;)V

    .line 40
    return-void
.end method

.method private static a(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:Ljava/lang/Object;>(TT;)TT;"
        }
    .end annotation

    .line 173
    return-object p0
.end method

.method private a(I)V
    .locals 0

    .line 111
    iput p1, p0, Lcom/huawei/hms/support/api/pay/OrderResult;->a:I

    .line 112
    return-void
.end method

.method private a(Ljava/lang/String;)V
    .locals 0

    .line 119
    iput-object p1, p0, Lcom/huawei/hms/support/api/pay/OrderResult;->b:Ljava/lang/String;

    .line 120
    return-void
.end method

.method private b(Ljava/lang/String;)V
    .locals 0

    .line 127
    iput-object p1, p0, Lcom/huawei/hms/support/api/pay/OrderResult;->c:Ljava/lang/String;

    .line 128
    return-void
.end method

.method private c(Ljava/lang/String;)V
    .locals 0

    .line 135
    iput-object p1, p0, Lcom/huawei/hms/support/api/pay/OrderResult;->d:Ljava/lang/String;

    .line 136
    return-void
.end method

.method private d(Ljava/lang/String;)V
    .locals 0

    .line 143
    iput-object p1, p0, Lcom/huawei/hms/support/api/pay/OrderResult;->e:Ljava/lang/String;

    .line 144
    return-void
.end method

.method private e(Ljava/lang/String;)V
    .locals 0

    .line 151
    iput-object p1, p0, Lcom/huawei/hms/support/api/pay/OrderResult;->f:Ljava/lang/String;

    .line 152
    return-void
.end method

.method private f(Ljava/lang/String;)V
    .locals 0

    .line 159
    iput-object p1, p0, Lcom/huawei/hms/support/api/pay/OrderResult;->g:Ljava/lang/String;

    .line 160
    return-void
.end method

.method private g(Ljava/lang/String;)V
    .locals 0

    .line 167
    iput-object p1, p0, Lcom/huawei/hms/support/api/pay/OrderResult;->h:Ljava/lang/String;

    .line 168
    return-void
.end method


# virtual methods
.method public getOrderID()Ljava/lang/String;
    .locals 1

    .line 71
    iget-object v0, p0, Lcom/huawei/hms/support/api/pay/OrderResult;->d:Ljava/lang/String;

    invoke-static {v0}, Lcom/huawei/hms/support/api/pay/OrderResult;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    return-object v0
.end method

.method public getOrderStatus()Ljava/lang/String;
    .locals 1

    .line 95
    iget-object v0, p0, Lcom/huawei/hms/support/api/pay/OrderResult;->g:Ljava/lang/String;

    invoke-static {v0}, Lcom/huawei/hms/support/api/pay/OrderResult;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    return-object v0
.end method

.method public getOrderTime()Ljava/lang/String;
    .locals 1

    .line 79
    iget-object v0, p0, Lcom/huawei/hms/support/api/pay/OrderResult;->e:Ljava/lang/String;

    invoke-static {v0}, Lcom/huawei/hms/support/api/pay/OrderResult;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    return-object v0
.end method

.method public getRequestId()Ljava/lang/String;
    .locals 1

    .line 63
    iget-object v0, p0, Lcom/huawei/hms/support/api/pay/OrderResult;->c:Ljava/lang/String;

    invoke-static {v0}, Lcom/huawei/hms/support/api/pay/OrderResult;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    return-object v0
.end method

.method public getReturnCode()I
    .locals 1

    .line 47
    iget v0, p0, Lcom/huawei/hms/support/api/pay/OrderResult;->a:I

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-static {v0}, Lcom/huawei/hms/support/api/pay/OrderResult;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    return v0
.end method

.method public getReturnDesc()Ljava/lang/String;
    .locals 1

    .line 55
    iget-object v0, p0, Lcom/huawei/hms/support/api/pay/OrderResult;->b:Ljava/lang/String;

    invoke-static {v0}, Lcom/huawei/hms/support/api/pay/OrderResult;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    return-object v0
.end method

.method public getSign()Ljava/lang/String;
    .locals 1

    .line 103
    iget-object v0, p0, Lcom/huawei/hms/support/api/pay/OrderResult;->h:Ljava/lang/String;

    invoke-static {v0}, Lcom/huawei/hms/support/api/pay/OrderResult;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    return-object v0
.end method

.method public getTradeTime()Ljava/lang/String;
    .locals 1

    .line 87
    iget-object v0, p0, Lcom/huawei/hms/support/api/pay/OrderResult;->f:Ljava/lang/String;

    invoke-static {v0}, Lcom/huawei/hms/support/api/pay/OrderResult;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    return-object v0
.end method
