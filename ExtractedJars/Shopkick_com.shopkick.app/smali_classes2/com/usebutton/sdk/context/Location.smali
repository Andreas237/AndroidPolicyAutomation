.class public Lcom/usebutton/sdk/context/Location;
.super Lcom/usebutton/sdk/internal/models/BaseEntity;
.source "Location.java"


# static fields
.field public static final KEY_LATITUDE:Ljava/lang/String; = "latitude"

.field public static final KEY_LONGITUDE:Ljava/lang/String; = "longitude"


# direct methods
.method public constructor <init>(DD)V
    .locals 6
    .param p1    # D
        .annotation build Landroid/support/annotation/FloatRange;
            from = -90.0
            to = 90.0
        .end annotation
    .end param
    .param p3    # D
        .annotation build Landroid/support/annotation/FloatRange;
            from = -180.0
            to = 180.0
        .end annotation
    .end param

    const/4 v1, 0x0

    move-object v0, p0

    move-wide v2, p1

    move-wide v4, p3

    .line 24
    invoke-direct/range {v0 .. v5}, Lcom/usebutton/sdk/context/Location;-><init>(Ljava/lang/String;DD)V

    return-void
.end method

.method public constructor <init>(Landroid/location/Location;)V
    .locals 4
    .param p1    # Landroid/location/Location;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    .line 50
    invoke-virtual {p1}, Landroid/location/Location;->getLatitude()D

    move-result-wide v0

    invoke-virtual {p1}, Landroid/location/Location;->getLongitude()D

    move-result-wide v2

    invoke-direct {p0, v0, v1, v2, v3}, Lcom/usebutton/sdk/context/Location;-><init>(DD)V

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;)V
    .locals 0

    .line 45
    invoke-direct {p0}, Lcom/usebutton/sdk/internal/models/BaseEntity;-><init>()V

    .line 46
    invoke-virtual {p0, p1}, Lcom/usebutton/sdk/context/Location;->setName(Ljava/lang/String;)Lcom/usebutton/sdk/context/Location;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;DD)V
    .locals 0
    .param p1    # Ljava/lang/String;
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param
    .param p2    # D
        .annotation build Landroid/support/annotation/FloatRange;
            from = -90.0
            to = 90.0
        .end annotation
    .end param
    .param p4    # D
        .annotation build Landroid/support/annotation/FloatRange;
            from = -180.0
            to = 180.0
        .end annotation
    .end param

    .line 29
    invoke-direct {p0}, Lcom/usebutton/sdk/internal/models/BaseEntity;-><init>()V

    if-eqz p1, :cond_0

    .line 31
    invoke-virtual {p0, p1}, Lcom/usebutton/sdk/context/Location;->setName(Ljava/lang/String;)Lcom/usebutton/sdk/context/Location;

    .line 33
    :cond_0
    invoke-virtual {p0, p2, p3, p4, p5}, Lcom/usebutton/sdk/context/Location;->setLocation(DD)Lcom/usebutton/sdk/context/Location;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    .line 37
    invoke-direct {p0}, Lcom/usebutton/sdk/internal/models/BaseEntity;-><init>()V

    .line 38
    invoke-virtual {p0, p1}, Lcom/usebutton/sdk/context/Location;->setAddress(Ljava/lang/String;)Lcom/usebutton/sdk/context/Location;

    .line 39
    invoke-virtual {p0, p2}, Lcom/usebutton/sdk/context/Location;->setCity(Ljava/lang/String;)Lcom/usebutton/sdk/context/Location;

    .line 40
    invoke-virtual {p0, p3}, Lcom/usebutton/sdk/context/Location;->setState(Ljava/lang/String;)Lcom/usebutton/sdk/context/Location;

    .line 41
    invoke-virtual {p0, p4}, Lcom/usebutton/sdk/context/Location;->setCountry(Ljava/lang/String;)Lcom/usebutton/sdk/context/Location;

    return-void
.end method

.method public constructor <init>(Lorg/json/JSONObject;)V
    .locals 0

    .line 57
    invoke-direct {p0, p1}, Lcom/usebutton/sdk/internal/models/BaseEntity;-><init>(Lorg/json/JSONObject;)V

    return-void
.end method


# virtual methods
.method protected getType()Ljava/lang/String;
    .locals 1

    const-string v0, "location"

    return-object v0
.end method

.method public setAddress(Ljava/lang/String;)Lcom/usebutton/sdk/context/Location;
    .locals 1

    const-string v0, "address_line"

    .line 78
    invoke-virtual {p0, v0, p1}, Lcom/usebutton/sdk/context/Location;->setValue(Ljava/lang/String;Ljava/lang/String;)V

    return-object p0
.end method

.method public setCity(Ljava/lang/String;)Lcom/usebutton/sdk/context/Location;
    .locals 1

    const-string v0, "city"

    .line 88
    invoke-virtual {p0, v0, p1}, Lcom/usebutton/sdk/context/Location;->setValue(Ljava/lang/String;Ljava/lang/String;)V

    return-object p0
.end method

.method public setCountry(Ljava/lang/String;)Lcom/usebutton/sdk/context/Location;
    .locals 1

    const-string v0, "country"

    .line 98
    invoke-virtual {p0, v0, p1}, Lcom/usebutton/sdk/context/Location;->setValue(Ljava/lang/String;Ljava/lang/String;)V

    return-object p0
.end method

.method public setLocation(DD)Lcom/usebutton/sdk/context/Location;
    .locals 1
    .param p1    # D
        .annotation build Landroid/support/annotation/FloatRange;
            from = -90.0
            to = 90.0
        .end annotation
    .end param
    .param p3    # D
        .annotation build Landroid/support/annotation/FloatRange;
            from = -180.0
            to = 180.0
        .end annotation
    .end param

    const-string v0, "latitude"

    .line 72
    invoke-virtual {p0, v0, p1, p2}, Lcom/usebutton/sdk/context/Location;->setValue(Ljava/lang/String;D)V

    const-string p1, "longitude"

    .line 73
    invoke-virtual {p0, p1, p3, p4}, Lcom/usebutton/sdk/context/Location;->setValue(Ljava/lang/String;D)V

    return-object p0
.end method

.method public setName(Ljava/lang/String;)Lcom/usebutton/sdk/context/Location;
    .locals 1

    const-string v0, "name"

    .line 66
    invoke-virtual {p0, v0, p1}, Lcom/usebutton/sdk/context/Location;->setValue(Ljava/lang/String;Ljava/lang/String;)V

    return-object p0
.end method

.method public setState(Ljava/lang/String;)Lcom/usebutton/sdk/context/Location;
    .locals 1

    const-string/jumbo v0, "state"

    .line 93
    invoke-virtual {p0, v0, p1}, Lcom/usebutton/sdk/context/Location;->setValue(Ljava/lang/String;Ljava/lang/String;)V

    return-object p0
.end method

.method public setZip(Ljava/lang/String;)Lcom/usebutton/sdk/context/Location;
    .locals 1

    const-string/jumbo v0, "zip"

    .line 83
    invoke-virtual {p0, v0, p1}, Lcom/usebutton/sdk/context/Location;->setValue(Ljava/lang/String;Ljava/lang/String;)V

    return-object p0
.end method
