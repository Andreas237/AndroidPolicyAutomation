.class public Lcom/usebutton/sdk/context/Journey;
.super Lcom/usebutton/sdk/internal/models/BaseEntity;
.source "Journey.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/usebutton/sdk/context/Journey$Type;
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 28
    invoke-direct {p0}, Lcom/usebutton/sdk/internal/models/BaseEntity;-><init>()V

    return-void
.end method

.method public constructor <init>(Lorg/json/JSONObject;)V
    .locals 0

    .line 35
    invoke-direct {p0, p1}, Lcom/usebutton/sdk/internal/models/BaseEntity;-><init>(Lorg/json/JSONObject;)V

    return-void
.end method


# virtual methods
.method protected getType()Ljava/lang/String;
    .locals 1

    const-string v0, "journey"

    return-object v0
.end method

.method public setDestination(Lcom/usebutton/sdk/context/Location;)Lcom/usebutton/sdk/context/Journey;
    .locals 1

    const-string v0, "destination_location"

    .line 54
    invoke-virtual {p0, v0, p1}, Lcom/usebutton/sdk/context/Journey;->setValue(Ljava/lang/String;Lcom/usebutton/sdk/internal/models/BaseEntity;)V

    return-object p0
.end method

.method public setEnd(Ljava/util/Date;)Lcom/usebutton/sdk/context/Journey;
    .locals 1

    const-string v0, "date_end"

    .line 69
    invoke-static {p1}, Lcom/usebutton/sdk/internal/util/ButtonUtil;->isoFormat(Ljava/util/Date;)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0, v0, p1}, Lcom/usebutton/sdk/context/Journey;->setValue(Ljava/lang/String;Ljava/lang/String;)V

    return-object p0
.end method

.method public setName(Ljava/lang/String;)Lcom/usebutton/sdk/context/Journey;
    .locals 1

    const-string v0, "name"

    .line 39
    invoke-virtual {p0, v0, p1}, Lcom/usebutton/sdk/context/Journey;->setValue(Ljava/lang/String;Ljava/lang/String;)V

    return-object p0
.end method

.method public setSku(Ljava/lang/String;)Lcom/usebutton/sdk/context/Journey;
    .locals 1

    const-string/jumbo v0, "sku"

    .line 44
    invoke-virtual {p0, v0, p1}, Lcom/usebutton/sdk/context/Journey;->setValue(Ljava/lang/String;Ljava/lang/String;)V

    return-object p0
.end method

.method public setStart(Lcom/usebutton/sdk/context/Location;)Lcom/usebutton/sdk/context/Journey;
    .locals 1

    const-string/jumbo v0, "start_location"

    .line 59
    invoke-virtual {p0, v0, p1}, Lcom/usebutton/sdk/context/Journey;->setValue(Ljava/lang/String;Lcom/usebutton/sdk/internal/models/BaseEntity;)V

    return-object p0
.end method

.method public setStart(Ljava/util/Date;)Lcom/usebutton/sdk/context/Journey;
    .locals 1

    const-string v0, "date_start"

    .line 64
    invoke-static {p1}, Lcom/usebutton/sdk/internal/util/ButtonUtil;->isoFormat(Ljava/util/Date;)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0, v0, p1}, Lcom/usebutton/sdk/context/Journey;->setValue(Ljava/lang/String;Ljava/lang/String;)V

    return-object p0
.end method

.method public setType(Lcom/usebutton/sdk/context/Journey$Type;)Lcom/usebutton/sdk/context/Journey;
    .locals 2
    .param p1    # Lcom/usebutton/sdk/context/Journey$Type;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    const-string/jumbo v0, "transport_type"

    .line 74
    invoke-virtual {p1}, Lcom/usebutton/sdk/context/Journey$Type;->toString()Ljava/lang/String;

    move-result-object p1

    sget-object v1, Ljava/util/Locale;->US:Ljava/util/Locale;

    invoke-virtual {p1, v1}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0, v0, p1}, Lcom/usebutton/sdk/context/Journey;->setValue(Ljava/lang/String;Ljava/lang/String;)V

    return-object p0
.end method

.method public setUrl(Landroid/net/Uri;)Lcom/usebutton/sdk/context/Journey;
    .locals 1

    const-string/jumbo v0, "url"

    .line 49
    invoke-virtual {p1}, Landroid/net/Uri;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0, v0, p1}, Lcom/usebutton/sdk/context/Journey;->setValue(Ljava/lang/String;Ljava/lang/String;)V

    return-object p0
.end method
