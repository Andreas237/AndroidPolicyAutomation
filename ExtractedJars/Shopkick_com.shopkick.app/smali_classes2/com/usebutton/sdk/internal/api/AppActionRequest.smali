.class public Lcom/usebutton/sdk/internal/api/AppActionRequest;
.super Ljava/lang/Object;
.source "AppActionRequest.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/usebutton/sdk/internal/api/AppActionRequest$Builder;
    }
.end annotation


# static fields
.field static final KEY_CAPABILITIES:Ljava/lang/String; = "capabilities"

.field static final KEY_CONTEXT:Ljava/lang/String; = "context"

.field static final KEY_MERCHANT_ID:Ljava/lang/String; = "merchant_id"

.field static final KEY_PLACEMENT_ID:Ljava/lang/String; = "placement_id"

.field static final KEY_PUB_REF:Ljava/lang/String; = "pub_ref"

.field static final KEY_THIRD_PARTY_ID:Ljava/lang/String; = "thirdparty_id"

.field static final KEY_URL:Ljava/lang/String; = "url"

.field static final KEY_USER_LOCAL_TIME:Ljava/lang/String; = "user_local_time"


# instance fields
.field private final body:Lorg/json/JSONObject;

.field private final capabilities:Lorg/json/JSONObject;

.field private final context:Lorg/json/JSONObject;

.field private final merchantId:Ljava/lang/String;

.field private final placementId:Ljava/lang/String;

.field private final pubRef:Ljava/lang/String;

.field private final thirdPartyId:Ljava/lang/String;

.field private final url:Ljava/net/URL;

.field private final userLocalTime:Ljava/lang/String;


# direct methods
.method private constructor <init>(Lorg/json/JSONObject;Lorg/json/JSONObject;Lorg/json/JSONObject;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/net/URL;Ljava/lang/String;)V
    .locals 0

    .line 44
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 46
    iput-object p1, p0, Lcom/usebutton/sdk/internal/api/AppActionRequest;->body:Lorg/json/JSONObject;

    .line 47
    iput-object p2, p0, Lcom/usebutton/sdk/internal/api/AppActionRequest;->capabilities:Lorg/json/JSONObject;

    .line 48
    iput-object p3, p0, Lcom/usebutton/sdk/internal/api/AppActionRequest;->context:Lorg/json/JSONObject;

    .line 49
    iput-object p4, p0, Lcom/usebutton/sdk/internal/api/AppActionRequest;->merchantId:Ljava/lang/String;

    .line 50
    iput-object p5, p0, Lcom/usebutton/sdk/internal/api/AppActionRequest;->placementId:Ljava/lang/String;

    .line 51
    iput-object p6, p0, Lcom/usebutton/sdk/internal/api/AppActionRequest;->pubRef:Ljava/lang/String;

    .line 52
    iput-object p7, p0, Lcom/usebutton/sdk/internal/api/AppActionRequest;->thirdPartyId:Ljava/lang/String;

    .line 53
    iput-object p8, p0, Lcom/usebutton/sdk/internal/api/AppActionRequest;->url:Ljava/net/URL;

    .line 54
    iput-object p9, p0, Lcom/usebutton/sdk/internal/api/AppActionRequest;->userLocalTime:Ljava/lang/String;

    return-void
.end method

.method synthetic constructor <init>(Lorg/json/JSONObject;Lorg/json/JSONObject;Lorg/json/JSONObject;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/net/URL;Ljava/lang/String;Lcom/usebutton/sdk/internal/api/AppActionRequest$1;)V
    .locals 0

    .line 13
    invoke-direct/range {p0 .. p9}, Lcom/usebutton/sdk/internal/api/AppActionRequest;-><init>(Lorg/json/JSONObject;Lorg/json/JSONObject;Lorg/json/JSONObject;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/net/URL;Ljava/lang/String;)V

    return-void
.end method


# virtual methods
.method public toJson()Lorg/json/JSONObject;
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/json/JSONException;
        }
    .end annotation

    .line 61
    iget-object v0, p0, Lcom/usebutton/sdk/internal/api/AppActionRequest;->capabilities:Lorg/json/JSONObject;

    if-eqz v0, :cond_0

    iget-object v1, p0, Lcom/usebutton/sdk/internal/api/AppActionRequest;->body:Lorg/json/JSONObject;

    const-string v2, "capabilities"

    invoke-virtual {v1, v2, v0}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 62
    :cond_0
    iget-object v0, p0, Lcom/usebutton/sdk/internal/api/AppActionRequest;->context:Lorg/json/JSONObject;

    if-eqz v0, :cond_1

    iget-object v1, p0, Lcom/usebutton/sdk/internal/api/AppActionRequest;->body:Lorg/json/JSONObject;

    const-string v2, "context"

    invoke-virtual {v1, v2, v0}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 63
    :cond_1
    iget-object v0, p0, Lcom/usebutton/sdk/internal/api/AppActionRequest;->merchantId:Ljava/lang/String;

    if-eqz v0, :cond_2

    iget-object v1, p0, Lcom/usebutton/sdk/internal/api/AppActionRequest;->body:Lorg/json/JSONObject;

    const-string v2, "merchant_id"

    invoke-virtual {v1, v2, v0}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 64
    :cond_2
    iget-object v0, p0, Lcom/usebutton/sdk/internal/api/AppActionRequest;->placementId:Ljava/lang/String;

    if-eqz v0, :cond_3

    iget-object v1, p0, Lcom/usebutton/sdk/internal/api/AppActionRequest;->body:Lorg/json/JSONObject;

    const-string v2, "placement_id"

    invoke-virtual {v1, v2, v0}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 65
    :cond_3
    iget-object v0, p0, Lcom/usebutton/sdk/internal/api/AppActionRequest;->pubRef:Ljava/lang/String;

    if-eqz v0, :cond_4

    iget-object v1, p0, Lcom/usebutton/sdk/internal/api/AppActionRequest;->body:Lorg/json/JSONObject;

    const-string v2, "pub_ref"

    invoke-virtual {v1, v2, v0}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 66
    :cond_4
    iget-object v0, p0, Lcom/usebutton/sdk/internal/api/AppActionRequest;->thirdPartyId:Ljava/lang/String;

    if-eqz v0, :cond_5

    iget-object v1, p0, Lcom/usebutton/sdk/internal/api/AppActionRequest;->body:Lorg/json/JSONObject;

    const-string/jumbo v2, "thirdparty_id"

    invoke-virtual {v1, v2, v0}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 67
    :cond_5
    iget-object v0, p0, Lcom/usebutton/sdk/internal/api/AppActionRequest;->url:Ljava/net/URL;

    if-eqz v0, :cond_6

    iget-object v1, p0, Lcom/usebutton/sdk/internal/api/AppActionRequest;->body:Lorg/json/JSONObject;

    const-string/jumbo v2, "url"

    invoke-virtual {v1, v2, v0}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 68
    :cond_6
    iget-object v0, p0, Lcom/usebutton/sdk/internal/api/AppActionRequest;->userLocalTime:Ljava/lang/String;

    if-eqz v0, :cond_7

    iget-object v1, p0, Lcom/usebutton/sdk/internal/api/AppActionRequest;->body:Lorg/json/JSONObject;

    const-string/jumbo v2, "user_local_time"

    invoke-virtual {v1, v2, v0}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 69
    :cond_7
    iget-object v0, p0, Lcom/usebutton/sdk/internal/api/AppActionRequest;->body:Lorg/json/JSONObject;

    return-object v0
.end method
