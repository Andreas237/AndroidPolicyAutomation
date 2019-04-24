.class public Lcom/huawei/hwcloudmodel/model/userprofile/LastClearCloudDataTimeReq;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private scenario:I


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 11
    const/4 v0, 0x0

    iput v0, p0, Lcom/huawei/hwcloudmodel/model/userprofile/LastClearCloudDataTimeReq;->scenario:I

    return-void
.end method


# virtual methods
.method public getScenario()I
    .locals 1

    .line 14
    iget v0, p0, Lcom/huawei/hwcloudmodel/model/userprofile/LastClearCloudDataTimeReq;->scenario:I

    return v0
.end method

.method public setScenario(I)V
    .locals 0

    .line 18
    iput p1, p0, Lcom/huawei/hwcloudmodel/model/userprofile/LastClearCloudDataTimeReq;->scenario:I

    .line 19
    return-void
.end method
