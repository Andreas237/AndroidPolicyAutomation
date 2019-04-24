.class Lcom/usebutton/sdk/internal/models/LinksConfiguration;
.super Ljava/lang/Object;
.source "LinksConfiguration.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/usebutton/sdk/internal/models/LinksConfiguration$PathnameId;,
        Lcom/usebutton/sdk/internal/models/LinksConfiguration$QueryId;,
        Lcom/usebutton/sdk/internal/models/LinksConfiguration$Affiliate;
    }
.end annotation


# static fields
.field static final KEY_GUARANTEED_ACTION:Ljava/lang/String; = "guaranteed_action"

.field static final KEY_HOSTNAME:Ljava/lang/String; = "hostname"

.field static final KEY_KEY:Ljava/lang/String; = "key"

.field static final KEY_MATCHES:Ljava/lang/String; = "matches"

.field static final KEY_PATHNAME_IDS:Ljava/lang/String; = "pathname_ids"

.field static final KEY_QUERY_IDS:Ljava/lang/String; = "query_ids"

.field static final KEY_QUERY_URL_KEYS:Ljava/lang/String; = "query_url_keys"

.field static final KEY_REGEX:Ljava/lang/String; = "regex"

.field static final KEY_SUBDOMAIN:Ljava/lang/String; = "subdomain"

.field static final KEY_SUPPORTED_AFFILIATES:Ljava/lang/String; = "supported_affiliates"

.field static final KEY_SUPPORTED_HOSTNAMES:Ljava/lang/String; = "supported_hostnames"

.field static final KEY_SUPPORTED_SUBDOMAINS:Ljava/lang/String; = "supported_bttnio_subdomains"

.field static final KEY_VALUE:Ljava/lang/String; = "value"

.field static final KEY_VALUES:Ljava/lang/String; = "values"


# instance fields
.field private final supportedAffiliates:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/usebutton/sdk/internal/models/LinksConfiguration$Affiliate;",
            ">;"
        }
    .end annotation
.end field

.field private final supportedButtonSubdomains:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private final supportedHostnames:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method constructor <init>(Ljava/util/List;Ljava/util/List;Ljava/util/List;)V
    .locals 0
    .annotation build Landroid/support/annotation/VisibleForTesting;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;",
            "Ljava/util/List<",
            "Lcom/usebutton/sdk/internal/models/LinksConfiguration$Affiliate;",
            ">;)V"
        }
    .end annotation

    .line 52
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 53
    iput-object p1, p0, Lcom/usebutton/sdk/internal/models/LinksConfiguration;->supportedHostnames:Ljava/util/List;

    .line 54
    iput-object p2, p0, Lcom/usebutton/sdk/internal/models/LinksConfiguration;->supportedButtonSubdomains:Ljava/util/List;

    .line 55
    iput-object p3, p0, Lcom/usebutton/sdk/internal/models/LinksConfiguration;->supportedAffiliates:Ljava/util/List;

    return-void
.end method

.method constructor <init>(Lorg/json/JSONObject;)V
    .locals 1
    .param p1    # Lorg/json/JSONObject;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    .line 44
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 45
    invoke-direct {p0, p1}, Lcom/usebutton/sdk/internal/models/LinksConfiguration;->parseSupportedHostnames(Lorg/json/JSONObject;)Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Lcom/usebutton/sdk/internal/models/LinksConfiguration;->supportedHostnames:Ljava/util/List;

    .line 46
    invoke-direct {p0, p1}, Lcom/usebutton/sdk/internal/models/LinksConfiguration;->parseSupportedSubdomains(Lorg/json/JSONObject;)Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Lcom/usebutton/sdk/internal/models/LinksConfiguration;->supportedButtonSubdomains:Ljava/util/List;

    .line 47
    invoke-direct {p0, p1}, Lcom/usebutton/sdk/internal/models/LinksConfiguration;->parseSupportedAffiliates(Lorg/json/JSONObject;)Ljava/util/List;

    move-result-object p1

    iput-object p1, p0, Lcom/usebutton/sdk/internal/models/LinksConfiguration;->supportedAffiliates:Ljava/util/List;

    return-void
.end method

.method private parseSupportedAffiliates(Lorg/json/JSONObject;)Ljava/util/List;
    .locals 4
    .param p1    # Lorg/json/JSONObject;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lorg/json/JSONObject;",
            ")",
            "Ljava/util/List<",
            "Lcom/usebutton/sdk/internal/models/LinksConfiguration$Affiliate;",
            ">;"
        }
    .end annotation

    const-string/jumbo v0, "supported_affiliates"

    .line 114
    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->optJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    move-result-object p1

    const/4 v0, 0x0

    if-nez p1, :cond_0

    .line 116
    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1, v0}, Ljava/util/ArrayList;-><init>(I)V

    return-object p1

    .line 119
    :cond_0
    new-instance v1, Ljava/util/ArrayList;

    invoke-virtual {p1}, Lorg/json/JSONArray;->length()I

    move-result v2

    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(I)V

    .line 120
    :goto_0
    invoke-virtual {p1}, Lorg/json/JSONArray;->length()I

    move-result v2

    if-ge v0, v2, :cond_1

    .line 121
    new-instance v2, Lcom/usebutton/sdk/internal/models/LinksConfiguration$Affiliate;

    invoke-virtual {p1, v0}, Lorg/json/JSONArray;->optJSONObject(I)Lorg/json/JSONObject;

    move-result-object v3

    invoke-direct {v2, v3}, Lcom/usebutton/sdk/internal/models/LinksConfiguration$Affiliate;-><init>(Lorg/json/JSONObject;)V

    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_1
    return-object v1
.end method

.method private parseSupportedHostnames(Lorg/json/JSONObject;)Ljava/util/List;
    .locals 4
    .param p1    # Lorg/json/JSONObject;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lorg/json/JSONObject;",
            ")",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    const-string/jumbo v0, "supported_hostnames"

    .line 86
    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->optJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    move-result-object p1

    const/4 v0, 0x0

    if-nez p1, :cond_0

    .line 88
    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1, v0}, Ljava/util/ArrayList;-><init>(I)V

    return-object p1

    .line 91
    :cond_0
    new-instance v1, Ljava/util/ArrayList;

    invoke-virtual {p1}, Lorg/json/JSONArray;->length()I

    move-result v2

    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(I)V

    .line 92
    :goto_0
    invoke-virtual {p1}, Lorg/json/JSONArray;->length()I

    move-result v2

    if-ge v0, v2, :cond_1

    .line 93
    invoke-virtual {p1, v0}, Lorg/json/JSONArray;->optJSONObject(I)Lorg/json/JSONObject;

    move-result-object v2

    const-string v3, "hostname"

    invoke-virtual {v2, v3}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_1
    return-object v1
.end method

.method private parseSupportedSubdomains(Lorg/json/JSONObject;)Ljava/util/List;
    .locals 4
    .param p1    # Lorg/json/JSONObject;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lorg/json/JSONObject;",
            ")",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    const-string/jumbo v0, "supported_bttnio_subdomains"

    .line 100
    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->optJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    move-result-object p1

    const/4 v0, 0x0

    if-nez p1, :cond_0

    .line 102
    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1, v0}, Ljava/util/ArrayList;-><init>(I)V

    return-object p1

    .line 105
    :cond_0
    new-instance v1, Ljava/util/ArrayList;

    invoke-virtual {p1}, Lorg/json/JSONArray;->length()I

    move-result v2

    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(I)V

    .line 106
    :goto_0
    invoke-virtual {p1}, Lorg/json/JSONArray;->length()I

    move-result v2

    if-ge v0, v2, :cond_1

    .line 107
    invoke-virtual {p1, v0}, Lorg/json/JSONArray;->optJSONObject(I)Lorg/json/JSONObject;

    move-result-object v2

    const-string/jumbo v3, "subdomain"

    invoke-virtual {v2, v3}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_1
    return-object v1
.end method


# virtual methods
.method getSupportedAffiliates()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/usebutton/sdk/internal/models/LinksConfiguration$Affiliate;",
            ">;"
        }
    .end annotation

    .line 82
    iget-object v0, p0, Lcom/usebutton/sdk/internal/models/LinksConfiguration;->supportedAffiliates:Ljava/util/List;

    return-object v0
.end method

.method getSupportedButtonSubdomains()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .line 73
    iget-object v0, p0, Lcom/usebutton/sdk/internal/models/LinksConfiguration;->supportedButtonSubdomains:Ljava/util/List;

    return-object v0
.end method

.method getSupportedHostnames()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .line 64
    iget-object v0, p0, Lcom/usebutton/sdk/internal/models/LinksConfiguration;->supportedHostnames:Ljava/util/List;

    return-object v0
.end method
