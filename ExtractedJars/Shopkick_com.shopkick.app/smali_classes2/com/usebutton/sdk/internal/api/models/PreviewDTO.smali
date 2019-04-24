.class public Lcom/usebutton/sdk/internal/api/models/PreviewDTO;
.super Ljava/lang/Object;
.source "PreviewDTO.java"


# instance fields
.field public final mBackgroundColor:Ljava/lang/String;

.field public final mDeepLink:Lcom/usebutton/sdk/internal/api/models/LinkDTO;

.field public final mIcon:Lcom/usebutton/sdk/internal/api/models/ImageDTO;

.field public final mLabel:Lcom/usebutton/sdk/internal/api/models/TextDTO;

.field public final mTitle:Lcom/usebutton/sdk/internal/api/models/TextDTO;


# direct methods
.method private constructor <init>(Ljava/lang/String;Lcom/usebutton/sdk/internal/api/models/ImageDTO;Lcom/usebutton/sdk/internal/api/models/TextDTO;Lcom/usebutton/sdk/internal/api/models/TextDTO;Lcom/usebutton/sdk/internal/api/models/LinkDTO;)V
    .locals 0

    .line 17
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 18
    iput-object p1, p0, Lcom/usebutton/sdk/internal/api/models/PreviewDTO;->mBackgroundColor:Ljava/lang/String;

    .line 19
    iput-object p2, p0, Lcom/usebutton/sdk/internal/api/models/PreviewDTO;->mIcon:Lcom/usebutton/sdk/internal/api/models/ImageDTO;

    .line 20
    iput-object p3, p0, Lcom/usebutton/sdk/internal/api/models/PreviewDTO;->mLabel:Lcom/usebutton/sdk/internal/api/models/TextDTO;

    .line 21
    iput-object p5, p0, Lcom/usebutton/sdk/internal/api/models/PreviewDTO;->mDeepLink:Lcom/usebutton/sdk/internal/api/models/LinkDTO;

    .line 22
    iput-object p4, p0, Lcom/usebutton/sdk/internal/api/models/PreviewDTO;->mTitle:Lcom/usebutton/sdk/internal/api/models/TextDTO;

    return-void
.end method

.method public static fromJson(Lorg/json/JSONObject;)Lcom/usebutton/sdk/internal/api/models/PreviewDTO;
    .locals 7
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/json/JSONException;
        }
    .end annotation

    if-nez p0, :cond_0

    const/4 p0, 0x0

    return-object p0

    .line 30
    :cond_0
    new-instance v6, Lcom/usebutton/sdk/internal/api/models/PreviewDTO;

    const-string v0, "background"

    .line 31
    invoke-virtual {p0, v0}, Lorg/json/JSONObject;->getJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v0

    const-string v1, "color"

    invoke-virtual {v0, v1}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    const-string v0, "icon_image"

    .line 32
    invoke-virtual {p0, v0}, Lorg/json/JSONObject;->getJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v0

    invoke-static {v0}, Lcom/usebutton/sdk/internal/api/models/ImageDTO;->fromJson(Lorg/json/JSONObject;)Lcom/usebutton/sdk/internal/api/models/ImageDTO;

    move-result-object v2

    const-string v0, "label_text"

    .line 33
    invoke-virtual {p0, v0}, Lorg/json/JSONObject;->getJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v0

    invoke-static {v0}, Lcom/usebutton/sdk/internal/api/models/TextDTO;->fromJson(Lorg/json/JSONObject;)Lcom/usebutton/sdk/internal/api/models/TextDTO;

    move-result-object v3

    const-string/jumbo v0, "title_text"

    .line 34
    invoke-virtual {p0, v0}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v0

    invoke-static {v0}, Lcom/usebutton/sdk/internal/api/models/TextDTO;->fromJson(Lorg/json/JSONObject;)Lcom/usebutton/sdk/internal/api/models/TextDTO;

    move-result-object v4

    const-string v0, "direct_links"

    .line 35
    invoke-virtual {p0, v0}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object p0

    invoke-static {p0}, Lcom/usebutton/sdk/internal/api/models/LinkDTO;->fromJson(Lorg/json/JSONObject;)Lcom/usebutton/sdk/internal/api/models/LinkDTO;

    move-result-object v5

    move-object v0, v6

    invoke-direct/range {v0 .. v5}, Lcom/usebutton/sdk/internal/api/models/PreviewDTO;-><init>(Ljava/lang/String;Lcom/usebutton/sdk/internal/api/models/ImageDTO;Lcom/usebutton/sdk/internal/api/models/TextDTO;Lcom/usebutton/sdk/internal/api/models/TextDTO;Lcom/usebutton/sdk/internal/api/models/LinkDTO;)V

    return-object v6
.end method
