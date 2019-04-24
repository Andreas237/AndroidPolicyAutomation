.class public Lcom/huawei/openalliance/ad/beans/parameter/AdSlotParam;
.super Ljava/lang/Object;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/huawei/openalliance/ad/beans/parameter/AdSlotParam$Builder;
    }
.end annotation


# instance fields
.field private adIds:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<Ljava/lang/String;>;"
        }
    .end annotation
.end field

.field private deviceType:I

.field private height:I

.field private isTrackLimited:Ljava/lang/Boolean;

.field private oaid:Ljava/lang/String;

.field private orientation:I

.field private requestSequence:Ljava/lang/String;

.field private test:Z

.field private width:I


# direct methods
.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private constructor <init>(Lcom/huawei/openalliance/ad/beans/parameter/AdSlotParam$Builder;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-static {p1}, Lcom/huawei/openalliance/ad/beans/parameter/AdSlotParam$Builder;->access$000(Lcom/huawei/openalliance/ad/beans/parameter/AdSlotParam$Builder;)Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/openalliance/ad/beans/parameter/AdSlotParam;->adIds:Ljava/util/List;

    invoke-static {p1}, Lcom/huawei/openalliance/ad/beans/parameter/AdSlotParam$Builder;->access$100(Lcom/huawei/openalliance/ad/beans/parameter/AdSlotParam$Builder;)I

    move-result v0

    iput v0, p0, Lcom/huawei/openalliance/ad/beans/parameter/AdSlotParam;->orientation:I

    invoke-static {p1}, Lcom/huawei/openalliance/ad/beans/parameter/AdSlotParam$Builder;->access$200(Lcom/huawei/openalliance/ad/beans/parameter/AdSlotParam$Builder;)Z

    move-result v0

    iput-boolean v0, p0, Lcom/huawei/openalliance/ad/beans/parameter/AdSlotParam;->test:Z

    invoke-static {p1}, Lcom/huawei/openalliance/ad/beans/parameter/AdSlotParam$Builder;->access$300(Lcom/huawei/openalliance/ad/beans/parameter/AdSlotParam$Builder;)I

    move-result v0

    iput v0, p0, Lcom/huawei/openalliance/ad/beans/parameter/AdSlotParam;->deviceType:I

    invoke-static {p1}, Lcom/huawei/openalliance/ad/beans/parameter/AdSlotParam$Builder;->access$400(Lcom/huawei/openalliance/ad/beans/parameter/AdSlotParam$Builder;)I

    move-result v0

    iput v0, p0, Lcom/huawei/openalliance/ad/beans/parameter/AdSlotParam;->width:I

    invoke-static {p1}, Lcom/huawei/openalliance/ad/beans/parameter/AdSlotParam$Builder;->access$500(Lcom/huawei/openalliance/ad/beans/parameter/AdSlotParam$Builder;)I

    move-result v0

    iput v0, p0, Lcom/huawei/openalliance/ad/beans/parameter/AdSlotParam;->height:I

    invoke-static {p1}, Lcom/huawei/openalliance/ad/beans/parameter/AdSlotParam$Builder;->access$600(Lcom/huawei/openalliance/ad/beans/parameter/AdSlotParam$Builder;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/openalliance/ad/beans/parameter/AdSlotParam;->requestSequence:Ljava/lang/String;

    invoke-static {p1}, Lcom/huawei/openalliance/ad/beans/parameter/AdSlotParam$Builder;->access$700(Lcom/huawei/openalliance/ad/beans/parameter/AdSlotParam$Builder;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/openalliance/ad/beans/parameter/AdSlotParam;->oaid:Ljava/lang/String;

    invoke-static {p1}, Lcom/huawei/openalliance/ad/beans/parameter/AdSlotParam$Builder;->access$800(Lcom/huawei/openalliance/ad/beans/parameter/AdSlotParam$Builder;)Ljava/lang/Boolean;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/openalliance/ad/beans/parameter/AdSlotParam;->isTrackLimited:Ljava/lang/Boolean;

    return-void
.end method

.method synthetic constructor <init>(Lcom/huawei/openalliance/ad/beans/parameter/AdSlotParam$Builder;Lcom/huawei/openalliance/ad/beans/parameter/AdSlotParam$1;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/huawei/openalliance/ad/beans/parameter/AdSlotParam;-><init>(Lcom/huawei/openalliance/ad/beans/parameter/AdSlotParam$Builder;)V

    return-void
.end method


# virtual methods
.method public getAdIds()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()Ljava/util/List<Ljava/lang/String;>;"
        }
    .end annotation

    iget-object v0, p0, Lcom/huawei/openalliance/ad/beans/parameter/AdSlotParam;->adIds:Ljava/util/List;

    return-object v0
.end method

.method public getDeviceType()I
    .locals 1

    iget v0, p0, Lcom/huawei/openalliance/ad/beans/parameter/AdSlotParam;->deviceType:I

    return v0
.end method

.method public getHeight()I
    .locals 1

    iget v0, p0, Lcom/huawei/openalliance/ad/beans/parameter/AdSlotParam;->height:I

    return v0
.end method

.method public getOaid()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/huawei/openalliance/ad/beans/parameter/AdSlotParam;->oaid:Ljava/lang/String;

    return-object v0
.end method

.method public getOrientation()I
    .locals 1

    iget v0, p0, Lcom/huawei/openalliance/ad/beans/parameter/AdSlotParam;->orientation:I

    return v0
.end method

.method public getRequestSequence()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/huawei/openalliance/ad/beans/parameter/AdSlotParam;->requestSequence:Ljava/lang/String;

    return-object v0
.end method

.method public getWidth()I
    .locals 1

    iget v0, p0, Lcom/huawei/openalliance/ad/beans/parameter/AdSlotParam;->width:I

    return v0
.end method

.method public isTest()Z
    .locals 1

    iget-boolean v0, p0, Lcom/huawei/openalliance/ad/beans/parameter/AdSlotParam;->test:Z

    return v0
.end method

.method public isTrackLimited()Ljava/lang/Boolean;
    .locals 1

    iget-object v0, p0, Lcom/huawei/openalliance/ad/beans/parameter/AdSlotParam;->isTrackLimited:Ljava/lang/Boolean;

    return-object v0
.end method

.method public setAdIds(Ljava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Ljava/lang/String;>;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/huawei/openalliance/ad/beans/parameter/AdSlotParam;->adIds:Ljava/util/List;

    return-void
.end method

.method public setDeviceType(I)V
    .locals 0

    iput p1, p0, Lcom/huawei/openalliance/ad/beans/parameter/AdSlotParam;->deviceType:I

    return-void
.end method

.method public setHeight(I)V
    .locals 0

    iput p1, p0, Lcom/huawei/openalliance/ad/beans/parameter/AdSlotParam;->height:I

    return-void
.end method

.method public setOaid(Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lcom/huawei/openalliance/ad/beans/parameter/AdSlotParam;->oaid:Ljava/lang/String;

    return-void
.end method

.method public setOrientation(I)V
    .locals 0

    iput p1, p0, Lcom/huawei/openalliance/ad/beans/parameter/AdSlotParam;->orientation:I

    return-void
.end method

.method public setRequestSequence(Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lcom/huawei/openalliance/ad/beans/parameter/AdSlotParam;->requestSequence:Ljava/lang/String;

    return-void
.end method

.method public setTest(Z)V
    .locals 0

    iput-boolean p1, p0, Lcom/huawei/openalliance/ad/beans/parameter/AdSlotParam;->test:Z

    return-void
.end method

.method public setTrackLimited(Z)V
    .locals 1

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/openalliance/ad/beans/parameter/AdSlotParam;->isTrackLimited:Ljava/lang/Boolean;

    return-void
.end method

.method public setWidth(I)V
    .locals 0

    iput p1, p0, Lcom/huawei/openalliance/ad/beans/parameter/AdSlotParam;->width:I

    return-void
.end method
