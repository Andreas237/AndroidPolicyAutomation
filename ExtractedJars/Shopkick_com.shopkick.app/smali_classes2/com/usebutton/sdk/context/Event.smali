.class public Lcom/usebutton/sdk/context/Event;
.super Lcom/usebutton/sdk/internal/models/BaseEntity;
.source "Event.java"


# direct methods
.method public constructor <init>(Ljava/lang/String;)V
    .locals 1

    .line 15
    invoke-direct {p0}, Lcom/usebutton/sdk/internal/models/BaseEntity;-><init>()V

    const-string v0, "name"

    .line 16
    invoke-virtual {p0, v0, p1}, Lcom/usebutton/sdk/context/Event;->setValue(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public constructor <init>(Lorg/json/JSONObject;)V
    .locals 0

    .line 23
    invoke-direct {p0, p1}, Lcom/usebutton/sdk/internal/models/BaseEntity;-><init>(Lorg/json/JSONObject;)V

    return-void
.end method


# virtual methods
.method protected getType()Ljava/lang/String;
    .locals 1

    const-string v0, "event"

    return-object v0
.end method

.method public setEnd(Ljava/util/Date;)Lcom/usebutton/sdk/context/Event;
    .locals 1
    .param p1    # Ljava/util/Date;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    const-string v0, "date_end"

    .line 37
    invoke-static {p1}, Lcom/usebutton/sdk/internal/util/ButtonUtil;->isoFormat(Ljava/util/Date;)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0, v0, p1}, Lcom/usebutton/sdk/context/Event;->setValue(Ljava/lang/String;Ljava/lang/String;)V

    return-object p0
.end method

.method public setLocation(Lcom/usebutton/sdk/context/Location;)Lcom/usebutton/sdk/context/Event;
    .locals 1

    const-string v0, "location"

    .line 47
    invoke-virtual {p0, v0, p1}, Lcom/usebutton/sdk/context/Event;->setValue(Ljava/lang/String;Lcom/usebutton/sdk/internal/models/BaseEntity;)V

    return-object p0
.end method

.method public setStart(Ljava/util/Date;)Lcom/usebutton/sdk/context/Event;
    .locals 1
    .param p1    # Ljava/util/Date;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    const-string v0, "date_start"

    .line 32
    invoke-static {p1}, Lcom/usebutton/sdk/internal/util/ButtonUtil;->isoFormat(Ljava/util/Date;)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0, v0, p1}, Lcom/usebutton/sdk/context/Event;->setValue(Ljava/lang/String;Ljava/lang/String;)V

    return-object p0
.end method

.method public setUrl(Landroid/net/Uri;)Lcom/usebutton/sdk/context/Event;
    .locals 1
    .param p1    # Landroid/net/Uri;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    const-string/jumbo v0, "url"

    .line 42
    invoke-virtual {p1}, Landroid/net/Uri;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0, v0, p1}, Lcom/usebutton/sdk/context/Event;->setValue(Ljava/lang/String;Ljava/lang/String;)V

    return-object p0
.end method
