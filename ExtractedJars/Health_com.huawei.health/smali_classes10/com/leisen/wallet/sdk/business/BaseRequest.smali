.class public Lcom/leisen/wallet/sdk/business/BaseRequest;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:Lcom/leisen/wallet/sdk/business/Business;>Ljava/lang/Object;"
    }
.end annotation


# instance fields
.field private business:Lcom/leisen/wallet/sdk/business/Business;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "TT;"
        }
    .end annotation
.end field

.field private clientVersion:Ljava/lang/String;

.field private cplc:Ljava/lang/String;

.field private functionCallId:Ljava/lang/String;

.field private imei:Ljava/lang/String;

.field private mobileType:Ljava/lang/String;

.field private seid:Ljava/lang/String;

.field private serviceId:Ljava/lang/String;

.field private version:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public getBusiness()Lcom/leisen/wallet/sdk/business/Business;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()TT;"
        }
    .end annotation

    .line 98
    iget-object v0, p0, Lcom/leisen/wallet/sdk/business/BaseRequest;->business:Lcom/leisen/wallet/sdk/business/Business;

    return-object v0
.end method

.method public getClientVersion()Ljava/lang/String;
    .locals 1

    .line 74
    iget-object v0, p0, Lcom/leisen/wallet/sdk/business/BaseRequest;->clientVersion:Ljava/lang/String;

    return-object v0
.end method

.method public getCplc()Ljava/lang/String;
    .locals 1

    .line 106
    iget-object v0, p0, Lcom/leisen/wallet/sdk/business/BaseRequest;->cplc:Ljava/lang/String;

    return-object v0
.end method

.method public getFunctionCallId()Ljava/lang/String;
    .locals 1

    .line 90
    iget-object v0, p0, Lcom/leisen/wallet/sdk/business/BaseRequest;->functionCallId:Ljava/lang/String;

    return-object v0
.end method

.method public getImei()Ljava/lang/String;
    .locals 1

    .line 58
    iget-object v0, p0, Lcom/leisen/wallet/sdk/business/BaseRequest;->imei:Ljava/lang/String;

    return-object v0
.end method

.method public getMobileType()Ljava/lang/String;
    .locals 1

    .line 82
    iget-object v0, p0, Lcom/leisen/wallet/sdk/business/BaseRequest;->mobileType:Ljava/lang/String;

    return-object v0
.end method

.method public getSeid()Ljava/lang/String;
    .locals 1

    .line 50
    iget-object v0, p0, Lcom/leisen/wallet/sdk/business/BaseRequest;->seid:Ljava/lang/String;

    return-object v0
.end method

.method public getServiceId()Ljava/lang/String;
    .locals 1

    .line 66
    iget-object v0, p0, Lcom/leisen/wallet/sdk/business/BaseRequest;->serviceId:Ljava/lang/String;

    return-object v0
.end method

.method public getVersion()Ljava/lang/String;
    .locals 1

    .line 42
    iget-object v0, p0, Lcom/leisen/wallet/sdk/business/BaseRequest;->version:Ljava/lang/String;

    return-object v0
.end method

.method public setBusiness(Lcom/leisen/wallet/sdk/business/Business;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;)V"
        }
    .end annotation

    .line 102
    iput-object p1, p0, Lcom/leisen/wallet/sdk/business/BaseRequest;->business:Lcom/leisen/wallet/sdk/business/Business;

    .line 103
    return-void
.end method

.method public setClientVersion(Ljava/lang/String;)V
    .locals 0

    .line 78
    iput-object p1, p0, Lcom/leisen/wallet/sdk/business/BaseRequest;->clientVersion:Ljava/lang/String;

    .line 79
    return-void
.end method

.method public setCplc(Ljava/lang/String;)V
    .locals 0

    .line 110
    iput-object p1, p0, Lcom/leisen/wallet/sdk/business/BaseRequest;->cplc:Ljava/lang/String;

    .line 111
    return-void
.end method

.method public setFunctionCallId(Ljava/lang/String;)V
    .locals 0

    .line 94
    iput-object p1, p0, Lcom/leisen/wallet/sdk/business/BaseRequest;->functionCallId:Ljava/lang/String;

    .line 95
    return-void
.end method

.method public setImei(Ljava/lang/String;)V
    .locals 0

    .line 62
    iput-object p1, p0, Lcom/leisen/wallet/sdk/business/BaseRequest;->imei:Ljava/lang/String;

    .line 63
    return-void
.end method

.method public setMobileType(Ljava/lang/String;)V
    .locals 0

    .line 86
    iput-object p1, p0, Lcom/leisen/wallet/sdk/business/BaseRequest;->mobileType:Ljava/lang/String;

    .line 87
    return-void
.end method

.method public setSeid(Ljava/lang/String;)V
    .locals 0

    .line 54
    iput-object p1, p0, Lcom/leisen/wallet/sdk/business/BaseRequest;->seid:Ljava/lang/String;

    .line 55
    return-void
.end method

.method public setServiceId(Ljava/lang/String;)V
    .locals 0

    .line 70
    iput-object p1, p0, Lcom/leisen/wallet/sdk/business/BaseRequest;->serviceId:Ljava/lang/String;

    .line 71
    return-void
.end method

.method public setVersion(Ljava/lang/String;)V
    .locals 0

    .line 46
    iput-object p1, p0, Lcom/leisen/wallet/sdk/business/BaseRequest;->version:Ljava/lang/String;

    .line 47
    return-void
.end method
