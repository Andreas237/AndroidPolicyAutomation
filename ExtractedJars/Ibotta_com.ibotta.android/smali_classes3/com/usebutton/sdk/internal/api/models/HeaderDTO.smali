.class public Lcom/usebutton/sdk/internal/api/models/HeaderDTO;
.super Ljava/lang/Object;
.source "HeaderDTO.java"


# instance fields
.field public final mBackgroundColor:Ljava/lang/String;

.field public final mSubtitle:Lcom/usebutton/sdk/internal/api/models/TextDTO;

.field public final mTitle:Lcom/usebutton/sdk/internal/api/models/TextDTO;


# direct methods
.method public constructor <init>(Ljava/lang/String;Lcom/usebutton/sdk/internal/api/models/TextDTO;Lcom/usebutton/sdk/internal/api/models/TextDTO;)V
    .locals 0

    .line 13
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 14
    iput-object p1, p0, Lcom/usebutton/sdk/internal/api/models/HeaderDTO;->mBackgroundColor:Ljava/lang/String;

    .line 15
    iput-object p2, p0, Lcom/usebutton/sdk/internal/api/models/HeaderDTO;->mTitle:Lcom/usebutton/sdk/internal/api/models/TextDTO;

    .line 16
    iput-object p3, p0, Lcom/usebutton/sdk/internal/api/models/HeaderDTO;->mSubtitle:Lcom/usebutton/sdk/internal/api/models/TextDTO;

    return-void
.end method

.method public static fromJson(Lorg/json/JSONObject;)Lcom/usebutton/sdk/internal/api/models/HeaderDTO;
    .locals 4
    .param p0    # Lorg/json/JSONObject;
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/json/JSONException;
        }
    .end annotation

    if-nez p0, :cond_0

    const/4 p0, 0x0

    return-object p0

    :cond_0
    const-string v0, "background"

    .line 23
    invoke-virtual {p0, v0}, Lorg/json/JSONObject;->getJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v0

    .line 24
    new-instance v1, Lcom/usebutton/sdk/internal/api/models/HeaderDTO;

    const-string v2, "color"

    .line 25
    invoke-virtual {v0, v2}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    const-string v2, "title_text"

    .line 26
    invoke-virtual {p0, v2}, Lorg/json/JSONObject;->getJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v2

    invoke-static {v2}, Lcom/usebutton/sdk/internal/api/models/TextDTO;->fromJson(Lorg/json/JSONObject;)Lcom/usebutton/sdk/internal/api/models/TextDTO;

    move-result-object v2

    const-string v3, "subtitle_text"

    .line 27
    invoke-virtual {p0, v3}, Lorg/json/JSONObject;->getJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object p0

    invoke-static {p0}, Lcom/usebutton/sdk/internal/api/models/TextDTO;->fromJson(Lorg/json/JSONObject;)Lcom/usebutton/sdk/internal/api/models/TextDTO;

    move-result-object p0

    invoke-direct {v1, v0, v2, p0}, Lcom/usebutton/sdk/internal/api/models/HeaderDTO;-><init>(Ljava/lang/String;Lcom/usebutton/sdk/internal/api/models/TextDTO;Lcom/usebutton/sdk/internal/api/models/TextDTO;)V

    return-object v1
.end method
