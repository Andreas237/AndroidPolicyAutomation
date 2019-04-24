.class public Lcom/ibotta/api/model/retailer/ResolvedCoords;
.super Ljava/lang/Object;
.source "ResolvedCoords.java"


# instance fields
.field private latitude:F
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "lat"
    .end annotation
.end field

.field private longitude:F
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "long"
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 8
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public getLatitude()D
    .locals 2

    .line 16
    iget v0, p0, Lcom/ibotta/api/model/retailer/ResolvedCoords;->latitude:F

    float-to-double v0, v0

    return-wide v0
.end method

.method public getLongitude()D
    .locals 2

    .line 24
    iget v0, p0, Lcom/ibotta/api/model/retailer/ResolvedCoords;->longitude:F

    float-to-double v0, v0

    return-wide v0
.end method

.method public setLatitude(F)V
    .locals 0

    .line 20
    iput p1, p0, Lcom/ibotta/api/model/retailer/ResolvedCoords;->latitude:F

    return-void
.end method

.method public setLongitude(F)V
    .locals 0

    .line 28
    iput p1, p0, Lcom/ibotta/api/model/retailer/ResolvedCoords;->longitude:F

    return-void
.end method
