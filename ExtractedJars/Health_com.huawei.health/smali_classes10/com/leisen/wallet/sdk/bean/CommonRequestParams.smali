.class public Lcom/leisen/wallet/sdk/bean/CommonRequestParams;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private cplc:Ljava/lang/String;

.field private funCallId:Ljava/lang/String;

.field private serviceId:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    .line 10
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 11
    iput-object p1, p0, Lcom/leisen/wallet/sdk/bean/CommonRequestParams;->serviceId:Ljava/lang/String;

    .line 12
    iput-object p2, p0, Lcom/leisen/wallet/sdk/bean/CommonRequestParams;->funCallId:Ljava/lang/String;

    .line 13
    iput-object p3, p0, Lcom/leisen/wallet/sdk/bean/CommonRequestParams;->cplc:Ljava/lang/String;

    .line 14
    return-void
.end method


# virtual methods
.method public commonRequestParamsSAI1()V
    .locals 0

    .line 50
    return-void
.end method

.method public commonRequestParamsSAI2()V
    .locals 0

    .line 51
    return-void
.end method

.method public commonRequestParamsSAI3()V
    .locals 0

    .line 52
    return-void
.end method

.method public commonRequestParamsSAI4()V
    .locals 0

    .line 53
    return-void
.end method

.method public commonRequestParamsSAI5()V
    .locals 0

    .line 54
    return-void
.end method

.method public getCplc()Ljava/lang/String;
    .locals 1

    .line 33
    iget-object v0, p0, Lcom/leisen/wallet/sdk/bean/CommonRequestParams;->cplc:Ljava/lang/String;

    return-object v0
.end method

.method public getFunCallId()Ljava/lang/String;
    .locals 1

    .line 25
    iget-object v0, p0, Lcom/leisen/wallet/sdk/bean/CommonRequestParams;->funCallId:Ljava/lang/String;

    return-object v0
.end method

.method public getSeid()Ljava/lang/String;
    .locals 5

    .line 41
    iget-object v0, p0, Lcom/leisen/wallet/sdk/bean/CommonRequestParams;->cplc:Ljava/lang/String;

    if-eqz v0, :cond_0

    const-string v0, ""

    iget-object v1, p0, Lcom/leisen/wallet/sdk/bean/CommonRequestParams;->cplc:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/leisen/wallet/sdk/bean/CommonRequestParams;->cplc:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v0

    const/16 v1, 0x2a

    if-le v0, v1, :cond_0

    .line 44
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v1, p0, Lcom/leisen/wallet/sdk/bean/CommonRequestParams;->cplc:Ljava/lang/String;

    const/4 v2, 0x0

    const/4 v3, 0x4

    invoke-virtual {v1, v2, v3}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/leisen/wallet/sdk/bean/CommonRequestParams;->cplc:Ljava/lang/String;

    const/16 v2, 0x14

    const/16 v3, 0x24

    invoke-virtual {v1, v2, v3}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    .line 45
    invoke-static {}, Ljava/util/Locale;->getDefault()Ljava/util/Locale;

    move-result-object v0

    invoke-virtual {v4, v0}, Ljava/lang/String;->toUpperCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v0

    return-object v0

    .line 47
    :cond_0
    const/4 v0, 0x0

    return-object v0
.end method

.method public getServiceId()Ljava/lang/String;
    .locals 1

    .line 17
    iget-object v0, p0, Lcom/leisen/wallet/sdk/bean/CommonRequestParams;->serviceId:Ljava/lang/String;

    return-object v0
.end method

.method public setCplc(Ljava/lang/String;)V
    .locals 0

    .line 37
    iput-object p1, p0, Lcom/leisen/wallet/sdk/bean/CommonRequestParams;->cplc:Ljava/lang/String;

    .line 38
    return-void
.end method

.method public setFunCallId(Ljava/lang/String;)V
    .locals 0

    .line 29
    iput-object p1, p0, Lcom/leisen/wallet/sdk/bean/CommonRequestParams;->funCallId:Ljava/lang/String;

    .line 30
    return-void
.end method

.method public setServiceId(Ljava/lang/String;)V
    .locals 0

    .line 21
    iput-object p1, p0, Lcom/leisen/wallet/sdk/bean/CommonRequestParams;->serviceId:Ljava/lang/String;

    .line 22
    return-void
.end method
