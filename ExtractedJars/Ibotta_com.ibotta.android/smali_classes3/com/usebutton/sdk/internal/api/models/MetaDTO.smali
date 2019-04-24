.class public Lcom/usebutton/sdk/internal/api/models/MetaDTO;
.super Ljava/lang/Object;
.source "MetaDTO.java"


# static fields
.field private static final DEFAULT_SCALE:D = 1.0

.field private static final DEFAULT_TARGET:Ljava/lang/String; = "app"

.field private static final KEY_APP_DISPLAY_NAME:Ljava/lang/String; = "app_display_name"

.field private static final KEY_APP_ICON:Ljava/lang/String; = "app_icon"

.field private static final KEY_ID:Ljava/lang/String; = "id"

.field private static final KEY_MAX_AGE_SECONDS:Ljava/lang/String; = "max_age_seconds"

.field private static final KEY_REQUEST_TIME:Ljava/lang/String; = "request_time"

.field private static final KEY_SOURCE_TOKEN:Ljava/lang/String; = "source_token"

.field private static final KEY_STORE_ID:Ljava/lang/String; = "store_id"

.field private static final KEY_TAP_SIGNAL:Ljava/lang/String; = "tap_signal"

.field private static final KEY_TARGET:Ljava/lang/String; = "target"


# instance fields
.field public final appIcon:Lcom/usebutton/sdk/internal/api/models/ImageDTO;
    .annotation build Landroid/support/annotation/Nullable;
    .end annotation
.end field

.field public final appName:Ljava/lang/String;

.field public final id:Ljava/lang/String;

.field public final maxAgeSeconds:I

.field public final requestTime:Ljava/lang/String;

.field public final sourceToken:Ljava/lang/String;

.field public final storeId:Ljava/lang/String;

.field public final tapSignal:Ljava/lang/String;

.field public final target:Ljava/lang/String;


# direct methods
.method private constructor <init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILcom/usebutton/sdk/internal/api/models/ImageDTO;Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    .line 40
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 42
    iput-object p1, p0, Lcom/usebutton/sdk/internal/api/models/MetaDTO;->id:Ljava/lang/String;

    .line 43
    iput-object p2, p0, Lcom/usebutton/sdk/internal/api/models/MetaDTO;->storeId:Ljava/lang/String;

    .line 44
    iput-object p3, p0, Lcom/usebutton/sdk/internal/api/models/MetaDTO;->sourceToken:Ljava/lang/String;

    .line 45
    iput-object p4, p0, Lcom/usebutton/sdk/internal/api/models/MetaDTO;->target:Ljava/lang/String;

    .line 46
    iput-object p5, p0, Lcom/usebutton/sdk/internal/api/models/MetaDTO;->appName:Ljava/lang/String;

    .line 47
    iput p6, p0, Lcom/usebutton/sdk/internal/api/models/MetaDTO;->maxAgeSeconds:I

    .line 48
    iput-object p7, p0, Lcom/usebutton/sdk/internal/api/models/MetaDTO;->appIcon:Lcom/usebutton/sdk/internal/api/models/ImageDTO;

    .line 49
    iput-object p8, p0, Lcom/usebutton/sdk/internal/api/models/MetaDTO;->requestTime:Ljava/lang/String;

    .line 50
    iput-object p9, p0, Lcom/usebutton/sdk/internal/api/models/MetaDTO;->tapSignal:Ljava/lang/String;

    return-void
.end method

.method public static fromJson(Lorg/json/JSONObject;)Lcom/usebutton/sdk/internal/api/models/MetaDTO;
    .locals 11
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/json/JSONException;
        }
    .end annotation

    const-string v0, "id"

    .line 54
    invoke-virtual {p0, v0}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    const-string v0, "store_id"

    .line 55
    invoke-virtual {p0, v0}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    const-string v0, "source_token"

    .line 56
    invoke-virtual {p0, v0}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    const-string v0, "target"

    const-string v1, "app"

    .line 57
    invoke-virtual {p0, v0, v1}, Lorg/json/JSONObject;->optString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    const-string v0, "app_display_name"

    .line 58
    invoke-virtual {p0, v0}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    const-string v0, "max_age_seconds"

    .line 59
    invoke-virtual {p0, v0}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;)I

    move-result v7

    .line 60
    new-instance v8, Lcom/usebutton/sdk/internal/api/models/ImageDTO;

    const-string v0, "app_icon"

    invoke-static {p0, v0}, Lcom/usebutton/sdk/internal/api/models/BaseDTO;->uriOrNull(Lorg/json/JSONObject;Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v0

    const/4 v1, 0x0

    const-wide/high16 v9, 0x3ff0000000000000L    # 1.0

    invoke-direct {v8, v1, v9, v10, v0}, Lcom/usebutton/sdk/internal/api/models/ImageDTO;-><init>(Ljava/lang/String;DLandroid/net/Uri;)V

    const-string v0, "request_time"

    .line 61
    invoke-virtual {p0, v0}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v9

    const-string v0, "tap_signal"

    .line 62
    invoke-virtual {p0, v0}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v10

    .line 63
    new-instance p0, Lcom/usebutton/sdk/internal/api/models/MetaDTO;

    move-object v1, p0

    invoke-direct/range {v1 .. v10}, Lcom/usebutton/sdk/internal/api/models/MetaDTO;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILcom/usebutton/sdk/internal/api/models/ImageDTO;Ljava/lang/String;Ljava/lang/String;)V

    return-object p0
.end method
