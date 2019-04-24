.class public Lcom/huawei/openalliance/ad/beans/server/EventReportRsp;
.super Lcom/huawei/openalliance/ad/beans/base/RspBean;


# instance fields
.field private result:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<Lcom/huawei/openalliance/ad/beans/metadata/AdEventResult;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lcom/huawei/openalliance/ad/beans/base/RspBean;-><init>()V

    return-void
.end method


# virtual methods
.method public getResult()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()Ljava/util/List<Lcom/huawei/openalliance/ad/beans/metadata/AdEventResult;>;"
        }
    .end annotation

    iget-object v0, p0, Lcom/huawei/openalliance/ad/beans/server/EventReportRsp;->result:Ljava/util/List;

    return-object v0
.end method

.method public setResult(Ljava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Lcom/huawei/openalliance/ad/beans/metadata/AdEventResult;>;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/huawei/openalliance/ad/beans/server/EventReportRsp;->result:Ljava/util/List;

    return-void
.end method
