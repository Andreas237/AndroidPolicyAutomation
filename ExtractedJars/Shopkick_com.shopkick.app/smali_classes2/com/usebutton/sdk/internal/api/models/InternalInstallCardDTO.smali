.class public Lcom/usebutton/sdk/internal/api/models/InternalInstallCardDTO;
.super Ljava/lang/Object;
.source "InternalInstallCardDTO.java"


# static fields
.field private static final KEY_APP_ICON:Ljava/lang/String; = "app_icon_url"

.field private static final KEY_BODY:Ljava/lang/String; = "body_text"

.field private static final KEY_CTA:Ljava/lang/String; = "card_cta"

.field private static final KEY_CTA_ICON:Ljava/lang/String; = "icon_url"

.field private static final KEY_PRIMARY_ACTION:Ljava/lang/String; = "primary_action_text"

.field private static final KEY_PRIMARY_COLOR:Ljava/lang/String; = "primary_color"

.field private static final KEY_SECONDARY_ACTION:Ljava/lang/String; = "secondary_action_text"

.field private static final KEY_TITLE:Ljava/lang/String; = "title_text"


# instance fields
.field public final appIconUrl:Ljava/lang/String;

.field public final body:Lcom/usebutton/sdk/internal/api/models/TextDTO;

.field public final ctaIcon:Ljava/lang/String;

.field public final ctaText:Lcom/usebutton/sdk/internal/api/models/TextDTO;

.field public final primaryAction:Lcom/usebutton/sdk/internal/api/models/TextDTO;

.field public final primaryColor:Ljava/lang/String;

.field public final secondaryAction:Lcom/usebutton/sdk/internal/api/models/TextDTO;

.field public final title:Lcom/usebutton/sdk/internal/api/models/TextDTO;


# direct methods
.method private constructor <init>(Ljava/lang/String;Lcom/usebutton/sdk/internal/api/models/TextDTO;Lcom/usebutton/sdk/internal/api/models/TextDTO;Ljava/lang/String;Lcom/usebutton/sdk/internal/api/models/TextDTO;Lcom/usebutton/sdk/internal/api/models/TextDTO;Lcom/usebutton/sdk/internal/api/models/TextDTO;Ljava/lang/String;)V
    .locals 0

    .line 29
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 30
    iput-object p1, p0, Lcom/usebutton/sdk/internal/api/models/InternalInstallCardDTO;->primaryColor:Ljava/lang/String;

    .line 31
    iput-object p2, p0, Lcom/usebutton/sdk/internal/api/models/InternalInstallCardDTO;->title:Lcom/usebutton/sdk/internal/api/models/TextDTO;

    .line 32
    iput-object p3, p0, Lcom/usebutton/sdk/internal/api/models/InternalInstallCardDTO;->body:Lcom/usebutton/sdk/internal/api/models/TextDTO;

    .line 33
    iput-object p4, p0, Lcom/usebutton/sdk/internal/api/models/InternalInstallCardDTO;->ctaIcon:Ljava/lang/String;

    .line 34
    iput-object p5, p0, Lcom/usebutton/sdk/internal/api/models/InternalInstallCardDTO;->ctaText:Lcom/usebutton/sdk/internal/api/models/TextDTO;

    .line 35
    iput-object p6, p0, Lcom/usebutton/sdk/internal/api/models/InternalInstallCardDTO;->primaryAction:Lcom/usebutton/sdk/internal/api/models/TextDTO;

    .line 36
    iput-object p7, p0, Lcom/usebutton/sdk/internal/api/models/InternalInstallCardDTO;->secondaryAction:Lcom/usebutton/sdk/internal/api/models/TextDTO;

    .line 37
    iput-object p8, p0, Lcom/usebutton/sdk/internal/api/models/InternalInstallCardDTO;->appIconUrl:Ljava/lang/String;

    return-void
.end method

.method public static fromJson(Lorg/json/JSONObject;)Lcom/usebutton/sdk/internal/api/models/InternalInstallCardDTO;
    .locals 10
    .param p0    # Lorg/json/JSONObject;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/json/JSONException;
        }
    .end annotation

    .line 41
    new-instance v9, Lcom/usebutton/sdk/internal/api/models/InternalInstallCardDTO;

    const-string v0, "primary_color"

    .line 42
    invoke-virtual {p0, v0}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    const-string/jumbo v0, "title_text"

    .line 43
    invoke-virtual {p0, v0}, Lorg/json/JSONObject;->getJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v0

    invoke-static {v0}, Lcom/usebutton/sdk/internal/api/models/TextDTO;->fromJson(Lorg/json/JSONObject;)Lcom/usebutton/sdk/internal/api/models/TextDTO;

    move-result-object v2

    const-string v0, "body_text"

    .line 44
    invoke-virtual {p0, v0}, Lorg/json/JSONObject;->getJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v0

    invoke-static {v0}, Lcom/usebutton/sdk/internal/api/models/TextDTO;->fromJson(Lorg/json/JSONObject;)Lcom/usebutton/sdk/internal/api/models/TextDTO;

    move-result-object v3

    const-string v0, "card_cta"

    .line 45
    invoke-virtual {p0, v0}, Lorg/json/JSONObject;->getJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v0

    const-string v4, "icon_url"

    invoke-virtual {v0, v4}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    const-string v0, "card_cta"

    .line 46
    invoke-virtual {p0, v0}, Lorg/json/JSONObject;->getJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v0

    const-string/jumbo v5, "title_text"

    invoke-virtual {v0, v5}, Lorg/json/JSONObject;->getJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v0

    invoke-static {v0}, Lcom/usebutton/sdk/internal/api/models/TextDTO;->fromJson(Lorg/json/JSONObject;)Lcom/usebutton/sdk/internal/api/models/TextDTO;

    move-result-object v5

    const-string v0, "primary_action_text"

    .line 47
    invoke-virtual {p0, v0}, Lorg/json/JSONObject;->getJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v0

    invoke-static {v0}, Lcom/usebutton/sdk/internal/api/models/TextDTO;->fromJson(Lorg/json/JSONObject;)Lcom/usebutton/sdk/internal/api/models/TextDTO;

    move-result-object v6

    const-string v0, "secondary_action_text"

    .line 48
    invoke-virtual {p0, v0}, Lorg/json/JSONObject;->getJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v0

    invoke-static {v0}, Lcom/usebutton/sdk/internal/api/models/TextDTO;->fromJson(Lorg/json/JSONObject;)Lcom/usebutton/sdk/internal/api/models/TextDTO;

    move-result-object v7

    const-string v0, "app_icon_url"

    .line 49
    invoke-virtual {p0, v0}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v8

    move-object v0, v9

    invoke-direct/range {v0 .. v8}, Lcom/usebutton/sdk/internal/api/models/InternalInstallCardDTO;-><init>(Ljava/lang/String;Lcom/usebutton/sdk/internal/api/models/TextDTO;Lcom/usebutton/sdk/internal/api/models/TextDTO;Ljava/lang/String;Lcom/usebutton/sdk/internal/api/models/TextDTO;Lcom/usebutton/sdk/internal/api/models/TextDTO;Lcom/usebutton/sdk/internal/api/models/TextDTO;Ljava/lang/String;)V

    return-object v9
.end method
