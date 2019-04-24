.class public Lcom/usebutton/sdk/internal/api/models/InstallSheetDTO;
.super Ljava/lang/Object;
.source "InstallSheetDTO.java"


# static fields
.field private static final KEY_APP_ACTION_TEXT:Ljava/lang/String; = "app_action_text"

.field private static final KEY_APP_SUBTITLE_TEXT:Ljava/lang/String; = "app_subtitle_text"

.field private static final KEY_APP_TITLE_TEXT:Ljava/lang/String; = "app_title_text"

.field private static final KEY_TITLE_TEXT:Ljava/lang/String; = "title_text"

.field private static final KEY_WEB_ACTION_TEXT:Ljava/lang/String; = "web_action_text"


# instance fields
.field public final appActionText:Lcom/usebutton/sdk/internal/api/models/TextDTO;

.field public final appSubtitleText:Lcom/usebutton/sdk/internal/api/models/TextDTO;

.field public final appTitleText:Lcom/usebutton/sdk/internal/api/models/TextDTO;

.field public final titleText:Lcom/usebutton/sdk/internal/api/models/TextDTO;

.field public final webActionText:Lcom/usebutton/sdk/internal/api/models/TextDTO;


# direct methods
.method public constructor <init>(Lcom/usebutton/sdk/internal/api/models/TextDTO;Lcom/usebutton/sdk/internal/api/models/TextDTO;Lcom/usebutton/sdk/internal/api/models/TextDTO;Lcom/usebutton/sdk/internal/api/models/TextDTO;Lcom/usebutton/sdk/internal/api/models/TextDTO;)V
    .locals 0

    .line 25
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 26
    iput-object p1, p0, Lcom/usebutton/sdk/internal/api/models/InstallSheetDTO;->titleText:Lcom/usebutton/sdk/internal/api/models/TextDTO;

    .line 27
    iput-object p2, p0, Lcom/usebutton/sdk/internal/api/models/InstallSheetDTO;->appTitleText:Lcom/usebutton/sdk/internal/api/models/TextDTO;

    .line 28
    iput-object p3, p0, Lcom/usebutton/sdk/internal/api/models/InstallSheetDTO;->appSubtitleText:Lcom/usebutton/sdk/internal/api/models/TextDTO;

    .line 29
    iput-object p4, p0, Lcom/usebutton/sdk/internal/api/models/InstallSheetDTO;->appActionText:Lcom/usebutton/sdk/internal/api/models/TextDTO;

    .line 30
    iput-object p5, p0, Lcom/usebutton/sdk/internal/api/models/InstallSheetDTO;->webActionText:Lcom/usebutton/sdk/internal/api/models/TextDTO;

    return-void
.end method

.method public static fromJson(Lorg/json/JSONObject;)Lcom/usebutton/sdk/internal/api/models/InstallSheetDTO;
    .locals 7
    .param p0    # Lorg/json/JSONObject;
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param
    .annotation build Landroid/support/annotation/Nullable;
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/json/JSONException;
        }
    .end annotation

    if-nez p0, :cond_0

    const/4 p0, 0x0

    return-object p0

    .line 39
    :cond_0
    new-instance v6, Lcom/usebutton/sdk/internal/api/models/InstallSheetDTO;

    const-string/jumbo v0, "title_text"

    invoke-virtual {p0, v0}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v0

    invoke-static {v0}, Lcom/usebutton/sdk/internal/api/models/TextDTO;->fromJson(Lorg/json/JSONObject;)Lcom/usebutton/sdk/internal/api/models/TextDTO;

    move-result-object v1

    const-string v0, "app_title_text"

    .line 40
    invoke-virtual {p0, v0}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v0

    invoke-static {v0}, Lcom/usebutton/sdk/internal/api/models/TextDTO;->fromJson(Lorg/json/JSONObject;)Lcom/usebutton/sdk/internal/api/models/TextDTO;

    move-result-object v2

    const-string v0, "app_subtitle_text"

    .line 41
    invoke-virtual {p0, v0}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v0

    invoke-static {v0}, Lcom/usebutton/sdk/internal/api/models/TextDTO;->fromJson(Lorg/json/JSONObject;)Lcom/usebutton/sdk/internal/api/models/TextDTO;

    move-result-object v3

    const-string v0, "app_action_text"

    .line 42
    invoke-virtual {p0, v0}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v0

    invoke-static {v0}, Lcom/usebutton/sdk/internal/api/models/TextDTO;->fromJson(Lorg/json/JSONObject;)Lcom/usebutton/sdk/internal/api/models/TextDTO;

    move-result-object v4

    const-string/jumbo v0, "web_action_text"

    .line 43
    invoke-virtual {p0, v0}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object p0

    invoke-static {p0}, Lcom/usebutton/sdk/internal/api/models/TextDTO;->fromJson(Lorg/json/JSONObject;)Lcom/usebutton/sdk/internal/api/models/TextDTO;

    move-result-object v5

    move-object v0, v6

    invoke-direct/range {v0 .. v5}, Lcom/usebutton/sdk/internal/api/models/InstallSheetDTO;-><init>(Lcom/usebutton/sdk/internal/api/models/TextDTO;Lcom/usebutton/sdk/internal/api/models/TextDTO;Lcom/usebutton/sdk/internal/api/models/TextDTO;Lcom/usebutton/sdk/internal/api/models/TextDTO;Lcom/usebutton/sdk/internal/api/models/TextDTO;)V

    return-object v6
.end method
