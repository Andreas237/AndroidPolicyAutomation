.class public Lcom/ibotta/api/model/common/Coords;
.super Ljava/lang/Object;
.source "Coords.java"


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

    .line 9
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public getLatitude()F
    .locals 1

    .line 17
    iget v0, p0, Lcom/ibotta/api/model/common/Coords;->latitude:F

    return v0
.end method

.method public getLongitude()F
    .locals 1

    .line 25
    iget v0, p0, Lcom/ibotta/api/model/common/Coords;->longitude:F

    return v0
.end method

.method public setLatitude(F)V
    .locals 0

    .line 21
    iput p1, p0, Lcom/ibotta/api/model/common/Coords;->latitude:F

    return-void
.end method

.method public setLongitude(F)V
    .locals 0

    .line 29
    iput p1, p0, Lcom/ibotta/api/model/common/Coords;->longitude:F

    return-void
.end method
