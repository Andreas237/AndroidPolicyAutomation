.class public Lcom/huawei/openalliance/ad/beans/metadata/Ad30;
.super Lcom/huawei/openalliance/ad/beans/base/RspBean;


# instance fields
.field private content__:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<Lcom/huawei/openalliance/ad/beans/metadata/Content;>;"
        }
    .end annotation
.end field

.field private retcode30__:I

.field private slotid__:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Lcom/huawei/openalliance/ad/beans/base/RspBean;-><init>()V

    const/4 v0, -0x1

    iput v0, p0, Lcom/huawei/openalliance/ad/beans/metadata/Ad30;->retcode30__:I

    return-void
.end method


# virtual methods
.method public getContent__()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()Ljava/util/List<Lcom/huawei/openalliance/ad/beans/metadata/Content;>;"
        }
    .end annotation

    iget-object v0, p0, Lcom/huawei/openalliance/ad/beans/metadata/Ad30;->content__:Ljava/util/List;

    return-object v0
.end method

.method public getRetcode30__()I
    .locals 1

    iget v0, p0, Lcom/huawei/openalliance/ad/beans/metadata/Ad30;->retcode30__:I

    return v0
.end method

.method public getSlotid__()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/huawei/openalliance/ad/beans/metadata/Ad30;->slotid__:Ljava/lang/String;

    return-object v0
.end method

.method public setContent__(Ljava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Lcom/huawei/openalliance/ad/beans/metadata/Content;>;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/huawei/openalliance/ad/beans/metadata/Ad30;->content__:Ljava/util/List;

    return-void
.end method

.method public setRetcode30__(I)V
    .locals 0

    iput p1, p0, Lcom/huawei/openalliance/ad/beans/metadata/Ad30;->retcode30__:I

    return-void
.end method

.method public setSlotid__(Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lcom/huawei/openalliance/ad/beans/metadata/Ad30;->slotid__:Ljava/lang/String;

    return-void
.end method
