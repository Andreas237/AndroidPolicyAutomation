.class public Lcom/huawei/openalliance/ad/beans/metadata/AdEventResult;
.super Lcom/huawei/openalliance/ad/beans/base/RspBean;


# instance fields
.field private retcode__:I

.field private seq__:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lcom/huawei/openalliance/ad/beans/base/RspBean;-><init>()V

    return-void
.end method


# virtual methods
.method public getRetcode()I
    .locals 1

    iget v0, p0, Lcom/huawei/openalliance/ad/beans/metadata/AdEventResult;->retcode__:I

    return v0
.end method

.method public getSeq()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/huawei/openalliance/ad/beans/metadata/AdEventResult;->seq__:Ljava/lang/String;

    return-object v0
.end method

.method public setRetcode(I)V
    .locals 0

    iput p1, p0, Lcom/huawei/openalliance/ad/beans/metadata/AdEventResult;->retcode__:I

    return-void
.end method

.method public setSeq(Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lcom/huawei/openalliance/ad/beans/metadata/AdEventResult;->seq__:Ljava/lang/String;

    return-void
.end method
