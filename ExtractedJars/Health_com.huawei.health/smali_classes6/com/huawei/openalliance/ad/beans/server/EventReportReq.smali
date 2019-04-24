.class public Lcom/huawei/openalliance/ad/beans/server/EventReportReq;
.super Lcom/huawei/openalliance/ad/beans/base/ReqBean;


# instance fields
.field private event__:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<Lcom/huawei/openalliance/ad/beans/metadata/AdEvent;>;"
        }
    .end annotation
.end field

.field private sdkversion__:Ljava/lang/String;

.field private version__:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Lcom/huawei/openalliance/ad/beans/base/ReqBean;-><init>()V

    const-string v0, "3.4"

    iput-object v0, p0, Lcom/huawei/openalliance/ad/beans/server/EventReportReq;->version__:Ljava/lang/String;

    const-string v0, "3.4.20.301"

    iput-object v0, p0, Lcom/huawei/openalliance/ad/beans/server/EventReportReq;->sdkversion__:Ljava/lang/String;

    return-void
.end method

.method public constructor <init>(Ljava/util/List;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Lcom/huawei/openalliance/ad/beans/metadata/AdEvent;>;)V"
        }
    .end annotation

    invoke-direct {p0}, Lcom/huawei/openalliance/ad/beans/base/ReqBean;-><init>()V

    const-string v0, "3.4"

    iput-object v0, p0, Lcom/huawei/openalliance/ad/beans/server/EventReportReq;->version__:Ljava/lang/String;

    const-string v0, "3.4.20.301"

    iput-object v0, p0, Lcom/huawei/openalliance/ad/beans/server/EventReportReq;->sdkversion__:Ljava/lang/String;

    iput-object p1, p0, Lcom/huawei/openalliance/ad/beans/server/EventReportReq;->event__:Ljava/util/List;

    return-void
.end method


# virtual methods
.method public getAuthKey()Ljava/lang/String;
    .locals 1

    const-string v0, "b51de25f8215e06d7418bc3a607a2c88ce2d7d55f9b177cd32be8eb6f5f4e858a811149d941fc1fb4467cbe5ffa0a823ec715e007aa425665849c68516988807"

    return-object v0
.end method

.method public getEvent__()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()Ljava/util/List<Lcom/huawei/openalliance/ad/beans/metadata/AdEvent;>;"
        }
    .end annotation

    iget-object v0, p0, Lcom/huawei/openalliance/ad/beans/server/EventReportReq;->event__:Ljava/util/List;

    return-object v0
.end method

.method public getRealM()Ljava/lang/String;
    .locals 1

    const-string v0, "action"

    return-object v0
.end method

.method public getRequestUri()Ljava/lang/String;
    .locals 1

    const-string v0, "/contserver/newcontent/action"

    return-object v0
.end method

.method public getSdkversion__()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/huawei/openalliance/ad/beans/server/EventReportReq;->sdkversion__:Ljava/lang/String;

    return-object v0
.end method

.method public getVersion__()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/huawei/openalliance/ad/beans/server/EventReportReq;->version__:Ljava/lang/String;

    return-object v0
.end method

.method public setEvent__(Ljava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Lcom/huawei/openalliance/ad/beans/metadata/AdEvent;>;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/huawei/openalliance/ad/beans/server/EventReportReq;->event__:Ljava/util/List;

    return-void
.end method

.method public setSdkversion__(Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lcom/huawei/openalliance/ad/beans/server/EventReportReq;->sdkversion__:Ljava/lang/String;

    return-void
.end method

.method public setVersion__(Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lcom/huawei/openalliance/ad/beans/server/EventReportReq;->version__:Ljava/lang/String;

    return-void
.end method
