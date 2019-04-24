.class public Lcom/huawei/openalliance/ad/beans/server/ThirdReportRsp;
.super Lcom/huawei/openalliance/ad/beans/base/RspBean;


# instance fields
.field private httpCode:I


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lcom/huawei/openalliance/ad/beans/base/RspBean;-><init>()V

    return-void
.end method


# virtual methods
.method public getHttpCode()I
    .locals 1

    iget v0, p0, Lcom/huawei/openalliance/ad/beans/server/ThirdReportRsp;->httpCode:I

    return v0
.end method

.method public setHttpCode(I)V
    .locals 0

    iput p1, p0, Lcom/huawei/openalliance/ad/beans/server/ThirdReportRsp;->httpCode:I

    return-void
.end method
