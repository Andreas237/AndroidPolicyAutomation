.class public Lcom/usebutton/sdk/internal/api/models/AuthChallengeDTO;
.super Ljava/lang/Object;
.source "AuthChallengeDTO.java"


# static fields
.field private static final KEY_ACCESS_DENIED_TEXT:Ljava/lang/String; = "access_denied_text"

.field private static final KEY_AUTH_PROCESSING_TEXT:Ljava/lang/String; = "auth_processing_text"

.field private static final KEY_AUTH_PROCESSING_URL:Ljava/lang/String; = "auth_processing_url"

.field private static final KEY_AUTH_RESULT_QUERY_KEY:Ljava/lang/String; = "auth_result_query_key"

.field private static final KEY_AUTH_RESULT_URL:Ljava/lang/String; = "auth_result_url"

.field private static final KEY_AUTH_URL:Ljava/lang/String; = "auth_url"

.field private static final KEY_GENERAL_ERROR_TEXT:Ljava/lang/String; = "general_error_text"

.field private static final KEY_POSTBACK_URL:Ljava/lang/String; = "postback_url"

.field private static final KEY_TYPE:Ljava/lang/String; = "type"

.field private static final KEY_WEB_VIEW_CUSTOMIZATION_SCRIPT:Ljava/lang/String; = "webview_customization_script"

.field private static final KEY_WEB_VIEW_LOADING_TEXT:Ljava/lang/String; = "webview_loading_text"


# instance fields
.field public final mAccessDeniedText:Lcom/usebutton/sdk/internal/api/models/TextDTO;

.field public final mAuthProcessingText:Lcom/usebutton/sdk/internal/api/models/TextDTO;

.field public final mAuthProcessingUrl:Ljava/lang/String;

.field public final mAuthResultQueryKey:Ljava/lang/String;

.field public final mAuthResultUrl:Ljava/lang/String;

.field public final mAuthUrl:Ljava/lang/String;

.field public final mCustomizationScript:Ljava/lang/String;

.field public final mGeneralErrorText:Lcom/usebutton/sdk/internal/api/models/TextDTO;

.field public final mPostbackUrl:Ljava/lang/String;

.field public final mType:Ljava/lang/String;

.field public final mWebViewLoadingText:Lcom/usebutton/sdk/internal/api/models/TextDTO;


# direct methods
.method protected constructor <init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/usebutton/sdk/internal/api/models/TextDTO;Lcom/usebutton/sdk/internal/api/models/TextDTO;Lcom/usebutton/sdk/internal/api/models/TextDTO;Lcom/usebutton/sdk/internal/api/models/TextDTO;)V
    .locals 0

    .line 44
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 45
    iput-object p1, p0, Lcom/usebutton/sdk/internal/api/models/AuthChallengeDTO;->mType:Ljava/lang/String;

    .line 46
    iput-object p2, p0, Lcom/usebutton/sdk/internal/api/models/AuthChallengeDTO;->mAuthUrl:Ljava/lang/String;

    .line 47
    iput-object p3, p0, Lcom/usebutton/sdk/internal/api/models/AuthChallengeDTO;->mPostbackUrl:Ljava/lang/String;

    .line 48
    iput-object p4, p0, Lcom/usebutton/sdk/internal/api/models/AuthChallengeDTO;->mAuthProcessingUrl:Ljava/lang/String;

    .line 49
    iput-object p5, p0, Lcom/usebutton/sdk/internal/api/models/AuthChallengeDTO;->mAuthResultUrl:Ljava/lang/String;

    .line 50
    iput-object p6, p0, Lcom/usebutton/sdk/internal/api/models/AuthChallengeDTO;->mAuthResultQueryKey:Ljava/lang/String;

    .line 51
    iput-object p7, p0, Lcom/usebutton/sdk/internal/api/models/AuthChallengeDTO;->mCustomizationScript:Ljava/lang/String;

    .line 52
    iput-object p8, p0, Lcom/usebutton/sdk/internal/api/models/AuthChallengeDTO;->mGeneralErrorText:Lcom/usebutton/sdk/internal/api/models/TextDTO;

    .line 53
    iput-object p9, p0, Lcom/usebutton/sdk/internal/api/models/AuthChallengeDTO;->mWebViewLoadingText:Lcom/usebutton/sdk/internal/api/models/TextDTO;

    .line 54
    iput-object p10, p0, Lcom/usebutton/sdk/internal/api/models/AuthChallengeDTO;->mAccessDeniedText:Lcom/usebutton/sdk/internal/api/models/TextDTO;

    .line 55
    iput-object p11, p0, Lcom/usebutton/sdk/internal/api/models/AuthChallengeDTO;->mAuthProcessingText:Lcom/usebutton/sdk/internal/api/models/TextDTO;

    return-void
.end method

.method public static fromJson(Lorg/json/JSONObject;)Lcom/usebutton/sdk/internal/api/models/AuthChallengeDTO;
    .locals 13
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

    .line 64
    :cond_0
    new-instance v12, Lcom/usebutton/sdk/internal/api/models/AuthChallengeDTO;

    const-string/jumbo v0, "type"

    invoke-virtual {p0, v0}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    const-string v0, "auth_url"

    .line 65
    invoke-virtual {p0, v0}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    const-string v0, "postback_url"

    .line 66
    invoke-virtual {p0, v0}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    const-string v0, "auth_processing_url"

    .line 67
    invoke-virtual {p0, v0}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    const-string v0, "auth_result_url"

    .line 68
    invoke-virtual {p0, v0}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    const-string v0, "auth_result_query_key"

    .line 69
    invoke-virtual {p0, v0}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    const-string/jumbo v0, "webview_customization_script"

    .line 70
    invoke-virtual {p0, v0}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    const-string v0, "general_error_text"

    .line 71
    invoke-virtual {p0, v0}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v0

    invoke-static {v0}, Lcom/usebutton/sdk/internal/api/models/TextDTO;->fromJson(Lorg/json/JSONObject;)Lcom/usebutton/sdk/internal/api/models/TextDTO;

    move-result-object v8

    const-string/jumbo v0, "webview_loading_text"

    .line 72
    invoke-virtual {p0, v0}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v0

    invoke-static {v0}, Lcom/usebutton/sdk/internal/api/models/TextDTO;->fromJson(Lorg/json/JSONObject;)Lcom/usebutton/sdk/internal/api/models/TextDTO;

    move-result-object v9

    const-string v0, "access_denied_text"

    .line 73
    invoke-virtual {p0, v0}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v0

    invoke-static {v0}, Lcom/usebutton/sdk/internal/api/models/TextDTO;->fromJson(Lorg/json/JSONObject;)Lcom/usebutton/sdk/internal/api/models/TextDTO;

    move-result-object v10

    const-string v0, "auth_processing_text"

    .line 74
    invoke-virtual {p0, v0}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object p0

    invoke-static {p0}, Lcom/usebutton/sdk/internal/api/models/TextDTO;->fromJson(Lorg/json/JSONObject;)Lcom/usebutton/sdk/internal/api/models/TextDTO;

    move-result-object v11

    move-object v0, v12

    invoke-direct/range {v0 .. v11}, Lcom/usebutton/sdk/internal/api/models/AuthChallengeDTO;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/usebutton/sdk/internal/api/models/TextDTO;Lcom/usebutton/sdk/internal/api/models/TextDTO;Lcom/usebutton/sdk/internal/api/models/TextDTO;Lcom/usebutton/sdk/internal/api/models/TextDTO;)V

    return-object v12
.end method
