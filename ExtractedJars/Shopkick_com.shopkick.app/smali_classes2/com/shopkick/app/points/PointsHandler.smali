.class public Lcom/shopkick/app/points/PointsHandler;
.super Ljava/lang/Object;
.source "PointsHandler.java"

# interfaces
.implements Lcom/shopkick/app/fetchers/api/IAPICommonHandler;


# instance fields
.field private profilePoints:Lcom/shopkick/app/points/ProfilePoints;


# direct methods
.method public constructor <init>(Lcom/shopkick/app/points/ProfilePoints;)V
    .locals 0

    .line 15
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 16
    iput-object p1, p0, Lcom/shopkick/app/points/PointsHandler;->profilePoints:Lcom/shopkick/app/points/ProfilePoints;

    return-void
.end method


# virtual methods
.method public handle(Lcom/shopkick/app/fetchers/api/skapi/CommonPointsResponse;)V
    .locals 1

    if-eqz p1, :cond_0

    .line 31
    iget-object v0, p0, Lcom/shopkick/app/points/PointsHandler;->profilePoints:Lcom/shopkick/app/points/ProfilePoints;

    invoke-virtual {v0, p1}, Lcom/shopkick/app/points/ProfilePoints;->updateWithPointsResponse(Lcom/shopkick/app/fetchers/api/skapi/CommonPointsResponse;)V

    :cond_0
    return-void
.end method

.method public handle(Lcom/shopkick/app/fetchers/api/IAPICommonHandlerCallback;Lcom/shopkick/app/fetchers/api/IAPIObject;Lcom/shopkick/app/fetchers/api/IAPIObject;Z)Z
    .locals 0

    .line 24
    check-cast p2, Lcom/shopkick/app/fetchers/api/skapi/CommonResponseData;

    .line 25
    iget-object p1, p2, Lcom/shopkick/app/fetchers/api/skapi/CommonResponseData;->pointsResponse:Lcom/shopkick/app/fetchers/api/skapi/CommonPointsResponse;

    invoke-virtual {p0, p1}, Lcom/shopkick/app/points/PointsHandler;->handle(Lcom/shopkick/app/fetchers/api/skapi/CommonPointsResponse;)V

    const/4 p1, 0x0

    return p1
.end method
