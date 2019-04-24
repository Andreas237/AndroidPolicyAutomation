.class public Lcom/usebutton/sdk/internal/api/models/InternalRewardCardDTO;
.super Ljava/lang/Object;
.source "InternalRewardCardDTO.java"


# static fields
.field private static final KEY_BACKGROUND_COLOR:Ljava/lang/String; = "background_color"

.field private static final KEY_BODY:Ljava/lang/String; = "body_text"

.field private static final KEY_CTA:Ljava/lang/String; = "card_cta"

.field private static final KEY_CTA_ICON:Ljava/lang/String; = "icon_url"

.field private static final KEY_SHOW_COUNT:Ljava/lang/String; = "show_count"

.field private static final KEY_SHOW_DURATION_IN_MS:Ljava/lang/String; = "show_duration_in_ms"

.field private static final KEY_TITLE:Ljava/lang/String; = "title_text"


# instance fields
.field public final backgroundColor:Ljava/lang/String;

.field public final body:Lcom/usebutton/sdk/internal/api/models/TextDTO;

.field public final ctaIcon:Ljava/lang/String;

.field public final ctaText:Lcom/usebutton/sdk/internal/api/models/TextDTO;

.field public final showCount:I

.field public final showDurationInMs:J

.field public final title:Lcom/usebutton/sdk/internal/api/models/TextDTO;


# direct methods
.method private constructor <init>(Ljava/lang/String;IJLjava/lang/String;Lcom/usebutton/sdk/internal/api/models/TextDTO;Lcom/usebutton/sdk/internal/api/models/TextDTO;Lcom/usebutton/sdk/internal/api/models/TextDTO;)V
    .locals 0

    .line 32
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 33
    iput-object p1, p0, Lcom/usebutton/sdk/internal/api/models/InternalRewardCardDTO;->backgroundColor:Ljava/lang/String;

    .line 34
    iput p2, p0, Lcom/usebutton/sdk/internal/api/models/InternalRewardCardDTO;->showCount:I

    .line 35
    iput-wide p3, p0, Lcom/usebutton/sdk/internal/api/models/InternalRewardCardDTO;->showDurationInMs:J

    .line 36
    iput-object p5, p0, Lcom/usebutton/sdk/internal/api/models/InternalRewardCardDTO;->ctaIcon:Ljava/lang/String;

    .line 37
    iput-object p6, p0, Lcom/usebutton/sdk/internal/api/models/InternalRewardCardDTO;->ctaText:Lcom/usebutton/sdk/internal/api/models/TextDTO;

    .line 38
    iput-object p7, p0, Lcom/usebutton/sdk/internal/api/models/InternalRewardCardDTO;->title:Lcom/usebutton/sdk/internal/api/models/TextDTO;

    .line 39
    iput-object p8, p0, Lcom/usebutton/sdk/internal/api/models/InternalRewardCardDTO;->body:Lcom/usebutton/sdk/internal/api/models/TextDTO;

    return-void
.end method

.method public static fromJson(Lorg/json/JSONObject;)Lcom/usebutton/sdk/internal/api/models/InternalRewardCardDTO;
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

    .line 43
    new-instance v9, Lcom/usebutton/sdk/internal/api/models/InternalRewardCardDTO;

    const-string v0, "background_color"

    .line 44
    invoke-virtual {p0, v0}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    const-string/jumbo v0, "show_count"

    const/4 v2, 0x0

    .line 45
    invoke-virtual {p0, v0, v2}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;I)I

    move-result v2

    const-string/jumbo v0, "show_duration_in_ms"

    const-wide/16 v3, 0x0

    .line 46
    invoke-virtual {p0, v0, v3, v4}, Lorg/json/JSONObject;->optLong(Ljava/lang/String;J)J

    move-result-wide v3

    const-string v0, "card_cta"

    .line 47
    invoke-virtual {p0, v0}, Lorg/json/JSONObject;->getJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v0

    const-string v5, "icon_url"

    invoke-virtual {v0, v5}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    const-string v0, "card_cta"

    .line 49
    invoke-virtual {p0, v0}, Lorg/json/JSONObject;->getJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v0

    const-string/jumbo v6, "title_text"

    invoke-virtual {v0, v6}, Lorg/json/JSONObject;->getJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v0

    .line 48
    invoke-static {v0}, Lcom/usebutton/sdk/internal/api/models/TextDTO;->fromJson(Lorg/json/JSONObject;)Lcom/usebutton/sdk/internal/api/models/TextDTO;

    move-result-object v6

    const-string/jumbo v0, "title_text"

    .line 50
    invoke-virtual {p0, v0}, Lorg/json/JSONObject;->getJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v0

    invoke-static {v0}, Lcom/usebutton/sdk/internal/api/models/TextDTO;->fromJson(Lorg/json/JSONObject;)Lcom/usebutton/sdk/internal/api/models/TextDTO;

    move-result-object v7

    const-string v0, "body_text"

    .line 51
    invoke-virtual {p0, v0}, Lorg/json/JSONObject;->getJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object p0

    invoke-static {p0}, Lcom/usebutton/sdk/internal/api/models/TextDTO;->fromJson(Lorg/json/JSONObject;)Lcom/usebutton/sdk/internal/api/models/TextDTO;

    move-result-object v8

    move-object v0, v9

    invoke-direct/range {v0 .. v8}, Lcom/usebutton/sdk/internal/api/models/InternalRewardCardDTO;-><init>(Ljava/lang/String;IJLjava/lang/String;Lcom/usebutton/sdk/internal/api/models/TextDTO;Lcom/usebutton/sdk/internal/api/models/TextDTO;Lcom/usebutton/sdk/internal/api/models/TextDTO;)V

    return-object v9
.end method
