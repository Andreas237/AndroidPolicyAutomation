.class public final Lcom/huawei/openalliance/ad/beans/parameter/AdSlotParam$Builder;
.super Ljava/lang/Object;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/openalliance/ad/beans/parameter/AdSlotParam;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Builder"
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
.method public constructor <init>()V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/util/ArrayList;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    iput-object v0, p0, Lcom/huawei/openalliance/ad/beans/parameter/AdSlotParam$Builder;->adIds:Ljava/util/List;

    const/4 v0, 0x1

    iput v0, p0, Lcom/huawei/openalliance/ad/beans/parameter/AdSlotParam$Builder;->orientation:I

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/openalliance/ad/beans/parameter/AdSlotParam$Builder;->test:Z

    const/4 v0, 0x4

    iput v0, p0, Lcom/huawei/openalliance/ad/beans/parameter/AdSlotParam$Builder;->deviceType:I

    const/4 v0, 0x0

    iput v0, p0, Lcom/huawei/openalliance/ad/beans/parameter/AdSlotParam$Builder;->width:I

    const/4 v0, 0x0

    iput v0, p0, Lcom/huawei/openalliance/ad/beans/parameter/AdSlotParam$Builder;->height:I

    return-void
.end method

.method static synthetic access$000(Lcom/huawei/openalliance/ad/beans/parameter/AdSlotParam$Builder;)Ljava/util/List;
    .locals 1

    iget-object v0, p0, Lcom/huawei/openalliance/ad/beans/parameter/AdSlotParam$Builder;->adIds:Ljava/util/List;

    return-object v0
.end method

.method static synthetic access$100(Lcom/huawei/openalliance/ad/beans/parameter/AdSlotParam$Builder;)I
    .locals 1

    iget v0, p0, Lcom/huawei/openalliance/ad/beans/parameter/AdSlotParam$Builder;->orientation:I

    return v0
.end method

.method static synthetic access$200(Lcom/huawei/openalliance/ad/beans/parameter/AdSlotParam$Builder;)Z
    .locals 1

    iget-boolean v0, p0, Lcom/huawei/openalliance/ad/beans/parameter/AdSlotParam$Builder;->test:Z

    return v0
.end method

.method static synthetic access$300(Lcom/huawei/openalliance/ad/beans/parameter/AdSlotParam$Builder;)I
    .locals 1

    iget v0, p0, Lcom/huawei/openalliance/ad/beans/parameter/AdSlotParam$Builder;->deviceType:I

    return v0
.end method

.method static synthetic access$400(Lcom/huawei/openalliance/ad/beans/parameter/AdSlotParam$Builder;)I
    .locals 1

    iget v0, p0, Lcom/huawei/openalliance/ad/beans/parameter/AdSlotParam$Builder;->width:I

    return v0
.end method

.method static synthetic access$500(Lcom/huawei/openalliance/ad/beans/parameter/AdSlotParam$Builder;)I
    .locals 1

    iget v0, p0, Lcom/huawei/openalliance/ad/beans/parameter/AdSlotParam$Builder;->height:I

    return v0
.end method

.method static synthetic access$600(Lcom/huawei/openalliance/ad/beans/parameter/AdSlotParam$Builder;)Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/huawei/openalliance/ad/beans/parameter/AdSlotParam$Builder;->requestSequence:Ljava/lang/String;

    return-object v0
.end method

.method static synthetic access$700(Lcom/huawei/openalliance/ad/beans/parameter/AdSlotParam$Builder;)Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/huawei/openalliance/ad/beans/parameter/AdSlotParam$Builder;->oaid:Ljava/lang/String;

    return-object v0
.end method

.method static synthetic access$800(Lcom/huawei/openalliance/ad/beans/parameter/AdSlotParam$Builder;)Ljava/lang/Boolean;
    .locals 1

    iget-object v0, p0, Lcom/huawei/openalliance/ad/beans/parameter/AdSlotParam$Builder;->isTrackLimited:Ljava/lang/Boolean;

    return-object v0
.end method


# virtual methods
.method public build()Lcom/huawei/openalliance/ad/beans/parameter/AdSlotParam;
    .locals 2

    new-instance v0, Lcom/huawei/openalliance/ad/beans/parameter/AdSlotParam;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Lcom/huawei/openalliance/ad/beans/parameter/AdSlotParam;-><init>(Lcom/huawei/openalliance/ad/beans/parameter/AdSlotParam$Builder;Lcom/huawei/openalliance/ad/beans/parameter/AdSlotParam$1;)V

    return-object v0
.end method

.method public getAdIds()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()Ljava/util/List<Ljava/lang/String;>;"
        }
    .end annotation

    iget-object v0, p0, Lcom/huawei/openalliance/ad/beans/parameter/AdSlotParam$Builder;->adIds:Ljava/util/List;

    return-object v0
.end method

.method public getDeviceType()I
    .locals 1

    iget v0, p0, Lcom/huawei/openalliance/ad/beans/parameter/AdSlotParam$Builder;->deviceType:I

    return v0
.end method

.method public getHeight()I
    .locals 1

    iget v0, p0, Lcom/huawei/openalliance/ad/beans/parameter/AdSlotParam$Builder;->height:I

    return v0
.end method

.method public getOaid()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/huawei/openalliance/ad/beans/parameter/AdSlotParam$Builder;->oaid:Ljava/lang/String;

    return-object v0
.end method

.method public getOrientation()I
    .locals 1

    iget v0, p0, Lcom/huawei/openalliance/ad/beans/parameter/AdSlotParam$Builder;->orientation:I

    return v0
.end method

.method public getRequestSequence()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/huawei/openalliance/ad/beans/parameter/AdSlotParam$Builder;->requestSequence:Ljava/lang/String;

    return-object v0
.end method

.method public getWidth()I
    .locals 1

    iget v0, p0, Lcom/huawei/openalliance/ad/beans/parameter/AdSlotParam$Builder;->width:I

    return v0
.end method

.method public isTest()Z
    .locals 1

    iget-boolean v0, p0, Lcom/huawei/openalliance/ad/beans/parameter/AdSlotParam$Builder;->test:Z

    return v0
.end method

.method public isTrackLimited()Ljava/lang/Boolean;
    .locals 1

    iget-object v0, p0, Lcom/huawei/openalliance/ad/beans/parameter/AdSlotParam$Builder;->isTrackLimited:Ljava/lang/Boolean;

    return-object v0
.end method

.method public setAdIds(Ljava/util/List;)Lcom/huawei/openalliance/ad/beans/parameter/AdSlotParam$Builder;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Ljava/lang/String;>;)Lcom/huawei/openalliance/ad/beans/parameter/AdSlotParam$Builder;"
        }
    .end annotation

    iput-object p1, p0, Lcom/huawei/openalliance/ad/beans/parameter/AdSlotParam$Builder;->adIds:Ljava/util/List;

    return-object p0
.end method

.method public setDeviceType(I)Lcom/huawei/openalliance/ad/beans/parameter/AdSlotParam$Builder;
    .locals 0

    iput p1, p0, Lcom/huawei/openalliance/ad/beans/parameter/AdSlotParam$Builder;->deviceType:I

    return-object p0
.end method

.method public setHeight(I)Lcom/huawei/openalliance/ad/beans/parameter/AdSlotParam$Builder;
    .locals 0

    iput p1, p0, Lcom/huawei/openalliance/ad/beans/parameter/AdSlotParam$Builder;->height:I

    return-object p0
.end method

.method public setOaid(Ljava/lang/String;)Lcom/huawei/openalliance/ad/beans/parameter/AdSlotParam$Builder;
    .locals 0

    iput-object p1, p0, Lcom/huawei/openalliance/ad/beans/parameter/AdSlotParam$Builder;->oaid:Ljava/lang/String;

    return-object p0
.end method

.method public setOrientation(I)Lcom/huawei/openalliance/ad/beans/parameter/AdSlotParam$Builder;
    .locals 0

    iput p1, p0, Lcom/huawei/openalliance/ad/beans/parameter/AdSlotParam$Builder;->orientation:I

    return-object p0
.end method

.method public setRequestSequence(Ljava/lang/String;)Lcom/huawei/openalliance/ad/beans/parameter/AdSlotParam$Builder;
    .locals 0

    iput-object p1, p0, Lcom/huawei/openalliance/ad/beans/parameter/AdSlotParam$Builder;->requestSequence:Ljava/lang/String;

    return-object p0
.end method

.method public setTest(Z)Lcom/huawei/openalliance/ad/beans/parameter/AdSlotParam$Builder;
    .locals 0

    iput-boolean p1, p0, Lcom/huawei/openalliance/ad/beans/parameter/AdSlotParam$Builder;->test:Z

    return-object p0
.end method

.method public setTrackLimited(Ljava/lang/Boolean;)Lcom/huawei/openalliance/ad/beans/parameter/AdSlotParam$Builder;
    .locals 0

    iput-object p1, p0, Lcom/huawei/openalliance/ad/beans/parameter/AdSlotParam$Builder;->isTrackLimited:Ljava/lang/Boolean;

    return-object p0
.end method

.method public setWidth(I)Lcom/huawei/openalliance/ad/beans/parameter/AdSlotParam$Builder;
    .locals 0

    iput p1, p0, Lcom/huawei/openalliance/ad/beans/parameter/AdSlotParam$Builder;->width:I

    return-object p0
.end method
