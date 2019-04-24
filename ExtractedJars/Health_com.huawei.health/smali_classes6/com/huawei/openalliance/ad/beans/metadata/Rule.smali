.class public Lcom/huawei/openalliance/ad/beans/metadata/Rule;
.super Lcom/huawei/openalliance/ad/beans/base/RspBean;


# static fields
.field private static final TAG:Ljava/lang/String; = "Rule"


# instance fields
.field private noShowTime__:J

.field private skippedAdMaxTimes__:I

.field private skippedAdMinTimes__:I

.field private timeScope__:I


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lcom/huawei/openalliance/ad/beans/base/RspBean;-><init>()V

    return-void
.end method


# virtual methods
.method public getNoShowTime__()J
    .locals 2

    iget-wide v0, p0, Lcom/huawei/openalliance/ad/beans/metadata/Rule;->noShowTime__:J

    return-wide v0
.end method

.method public getSkippedAdMaxTimes__()I
    .locals 1

    iget v0, p0, Lcom/huawei/openalliance/ad/beans/metadata/Rule;->skippedAdMaxTimes__:I

    return v0
.end method

.method public getSkippedAdMinTimes__()I
    .locals 1

    iget v0, p0, Lcom/huawei/openalliance/ad/beans/metadata/Rule;->skippedAdMinTimes__:I

    return v0
.end method

.method public getTimeScope__()I
    .locals 1

    iget v0, p0, Lcom/huawei/openalliance/ad/beans/metadata/Rule;->timeScope__:I

    return v0
.end method

.method public setNoShowTime__(J)V
    .locals 0

    iput-wide p1, p0, Lcom/huawei/openalliance/ad/beans/metadata/Rule;->noShowTime__:J

    return-void
.end method

.method public setSkippedAdMaxTimes__(I)V
    .locals 0

    iput p1, p0, Lcom/huawei/openalliance/ad/beans/metadata/Rule;->skippedAdMaxTimes__:I

    return-void
.end method

.method public setSkippedAdMinTimes__(I)V
    .locals 0

    iput p1, p0, Lcom/huawei/openalliance/ad/beans/metadata/Rule;->skippedAdMinTimes__:I

    return-void
.end method

.method public setTimeScope__(I)V
    .locals 0

    iput p1, p0, Lcom/huawei/openalliance/ad/beans/metadata/Rule;->timeScope__:I

    return-void
.end method
