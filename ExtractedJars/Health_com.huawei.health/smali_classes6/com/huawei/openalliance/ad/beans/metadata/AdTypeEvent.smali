.class public Lcom/huawei/openalliance/ad/beans/metadata/AdTypeEvent;
.super Ljava/lang/Object;


# instance fields
.field private adType:I

.field private eventTypeList:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<Ljava/lang/String;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public getAdType()I
    .locals 1

    iget v0, p0, Lcom/huawei/openalliance/ad/beans/metadata/AdTypeEvent;->adType:I

    return v0
.end method

.method public getEventTypeList()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()Ljava/util/List<Ljava/lang/String;>;"
        }
    .end annotation

    iget-object v0, p0, Lcom/huawei/openalliance/ad/beans/metadata/AdTypeEvent;->eventTypeList:Ljava/util/List;

    return-object v0
.end method

.method public setAdType(I)V
    .locals 0

    iput p1, p0, Lcom/huawei/openalliance/ad/beans/metadata/AdTypeEvent;->adType:I

    return-void
.end method

.method public setEventTypeList(Ljava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Ljava/lang/String;>;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/huawei/openalliance/ad/beans/metadata/AdTypeEvent;->eventTypeList:Ljava/util/List;

    return-void
.end method
