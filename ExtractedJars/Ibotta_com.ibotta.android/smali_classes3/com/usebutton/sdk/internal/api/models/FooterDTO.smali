.class public Lcom/usebutton/sdk/internal/api/models/FooterDTO;
.super Ljava/lang/Object;
.source "FooterDTO.java"


# instance fields
.field public final mAction:Lcom/usebutton/sdk/internal/api/models/LinkDTO;

.field public final mBackgroundColor:Ljava/lang/String;

.field public final mIcon:Lcom/usebutton/sdk/internal/api/models/ImageDTO;

.field public final mLabel:Lcom/usebutton/sdk/internal/api/models/TextDTO;


# direct methods
.method public constructor <init>(Lcom/usebutton/sdk/internal/api/models/LinkDTO;Ljava/lang/String;Lcom/usebutton/sdk/internal/api/models/ImageDTO;Lcom/usebutton/sdk/internal/api/models/TextDTO;)V
    .locals 0

    .line 14
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 15
    iput-object p1, p0, Lcom/usebutton/sdk/internal/api/models/FooterDTO;->mAction:Lcom/usebutton/sdk/internal/api/models/LinkDTO;

    .line 16
    iput-object p2, p0, Lcom/usebutton/sdk/internal/api/models/FooterDTO;->mBackgroundColor:Ljava/lang/String;

    .line 17
    iput-object p3, p0, Lcom/usebutton/sdk/internal/api/models/FooterDTO;->mIcon:Lcom/usebutton/sdk/internal/api/models/ImageDTO;

    .line 18
    iput-object p4, p0, Lcom/usebutton/sdk/internal/api/models/FooterDTO;->mLabel:Lcom/usebutton/sdk/internal/api/models/TextDTO;

    return-void
.end method

.method public static fromJson(Lorg/json/JSONObject;)Lcom/usebutton/sdk/internal/api/models/FooterDTO;
    .locals 5
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

    .line 25
    invoke-virtual {p0, v0}, Lorg/json/JSONObject;->getJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v0

    const-string v1, "color"

    invoke-virtual {v0, v1}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 26
    new-instance v1, Lcom/usebutton/sdk/internal/api/models/FooterDTO;

    const-string v2, "actions"

    .line 27
    invoke-virtual {p0, v2}, Lorg/json/JSONObject;->getJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v2

    invoke-static {v2}, Lcom/usebutton/sdk/internal/api/models/LinkDTO;->fromJson(Lorg/json/JSONObject;)Lcom/usebutton/sdk/internal/api/models/LinkDTO;

    move-result-object v2

    const-string v3, "icon_image"

    .line 29
    invoke-virtual {p0, v3}, Lorg/json/JSONObject;->getJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v3

    invoke-static {v3}, Lcom/usebutton/sdk/internal/api/models/ImageDTO;->fromJson(Lorg/json/JSONObject;)Lcom/usebutton/sdk/internal/api/models/ImageDTO;

    move-result-object v3

    const-string v4, "label_text"

    .line 30
    invoke-virtual {p0, v4}, Lorg/json/JSONObject;->getJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object p0

    invoke-static {p0}, Lcom/usebutton/sdk/internal/api/models/TextDTO;->fromJson(Lorg/json/JSONObject;)Lcom/usebutton/sdk/internal/api/models/TextDTO;

    move-result-object p0

    invoke-direct {v1, v2, v0, v3, p0}, Lcom/usebutton/sdk/internal/api/models/FooterDTO;-><init>(Lcom/usebutton/sdk/internal/api/models/LinkDTO;Ljava/lang/String;Lcom/usebutton/sdk/internal/api/models/ImageDTO;Lcom/usebutton/sdk/internal/api/models/TextDTO;)V

    return-object v1
.end method
