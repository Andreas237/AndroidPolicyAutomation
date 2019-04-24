.class public Lcom/huawei/openalliance/ad/beans/metadata/AdSlot30;
.super Ljava/lang/Object;


# instance fields
.field private adtype__:I

.field private height__:I

.field private slotid__:Ljava/lang/String;

.field private test__:I

.field private width__:I


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    iput v0, p0, Lcom/huawei/openalliance/ad/beans/metadata/AdSlot30;->test__:I

    const/4 v0, 0x1

    iput v0, p0, Lcom/huawei/openalliance/ad/beans/metadata/AdSlot30;->adtype__:I

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;IIIZ)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    iput v0, p0, Lcom/huawei/openalliance/ad/beans/metadata/AdSlot30;->test__:I

    const/4 v0, 0x1

    iput v0, p0, Lcom/huawei/openalliance/ad/beans/metadata/AdSlot30;->adtype__:I

    iput-object p1, p0, Lcom/huawei/openalliance/ad/beans/metadata/AdSlot30;->slotid__:Ljava/lang/String;

    iput p2, p0, Lcom/huawei/openalliance/ad/beans/metadata/AdSlot30;->width__:I

    iput p3, p0, Lcom/huawei/openalliance/ad/beans/metadata/AdSlot30;->height__:I

    if-eqz p5, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    iput v0, p0, Lcom/huawei/openalliance/ad/beans/metadata/AdSlot30;->test__:I

    iput p4, p0, Lcom/huawei/openalliance/ad/beans/metadata/AdSlot30;->adtype__:I

    return-void
.end method


# virtual methods
.method public getAdtype__()I
    .locals 1

    iget v0, p0, Lcom/huawei/openalliance/ad/beans/metadata/AdSlot30;->adtype__:I

    return v0
.end method

.method public getHeight__()I
    .locals 1

    iget v0, p0, Lcom/huawei/openalliance/ad/beans/metadata/AdSlot30;->height__:I

    return v0
.end method

.method public getSlotid__()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/huawei/openalliance/ad/beans/metadata/AdSlot30;->slotid__:Ljava/lang/String;

    return-object v0
.end method

.method public getTest__()I
    .locals 1

    iget v0, p0, Lcom/huawei/openalliance/ad/beans/metadata/AdSlot30;->test__:I

    return v0
.end method

.method public getWidth__()I
    .locals 1

    iget v0, p0, Lcom/huawei/openalliance/ad/beans/metadata/AdSlot30;->width__:I

    return v0
.end method

.method public setAdtype__(I)V
    .locals 0

    iput p1, p0, Lcom/huawei/openalliance/ad/beans/metadata/AdSlot30;->adtype__:I

    return-void
.end method

.method public setHeight__(I)V
    .locals 0

    iput p1, p0, Lcom/huawei/openalliance/ad/beans/metadata/AdSlot30;->height__:I

    return-void
.end method

.method public setSlotid__(Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lcom/huawei/openalliance/ad/beans/metadata/AdSlot30;->slotid__:Ljava/lang/String;

    return-void
.end method

.method public setTest__(I)V
    .locals 0

    iput p1, p0, Lcom/huawei/openalliance/ad/beans/metadata/AdSlot30;->test__:I

    return-void
.end method

.method public setWidth__(I)V
    .locals 0

    iput p1, p0, Lcom/huawei/openalliance/ad/beans/metadata/AdSlot30;->width__:I

    return-void
.end method
