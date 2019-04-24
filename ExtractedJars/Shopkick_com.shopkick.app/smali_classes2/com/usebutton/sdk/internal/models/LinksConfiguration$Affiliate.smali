.class Lcom/usebutton/sdk/internal/models/LinksConfiguration$Affiliate;
.super Ljava/lang/Object;
.source "LinksConfiguration.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/usebutton/sdk/internal/models/LinksConfiguration;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "Affiliate"
.end annotation


# instance fields
.field private final hostname:Ljava/lang/String;

.field private final pathnameIds:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/usebutton/sdk/internal/models/LinksConfiguration$PathnameId;",
            ">;"
        }
    .end annotation
.end field

.field private final queryIds:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/usebutton/sdk/internal/models/LinksConfiguration$QueryId;",
            ">;"
        }
    .end annotation
.end field

.field private final queryUrlKeys:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method constructor <init>(Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/util/List;)V
    .locals 0
    .annotation build Landroid/support/annotation/VisibleForTesting;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;",
            "Ljava/util/List<",
            "Lcom/usebutton/sdk/internal/models/LinksConfiguration$QueryId;",
            ">;",
            "Ljava/util/List<",
            "Lcom/usebutton/sdk/internal/models/LinksConfiguration$PathnameId;",
            ">;)V"
        }
    .end annotation

    .line 151
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 152
    iput-object p1, p0, Lcom/usebutton/sdk/internal/models/LinksConfiguration$Affiliate;->hostname:Ljava/lang/String;

    .line 153
    iput-object p2, p0, Lcom/usebutton/sdk/internal/models/LinksConfiguration$Affiliate;->queryUrlKeys:Ljava/util/List;

    .line 154
    iput-object p3, p0, Lcom/usebutton/sdk/internal/models/LinksConfiguration$Affiliate;->queryIds:Ljava/util/List;

    .line 155
    iput-object p4, p0, Lcom/usebutton/sdk/internal/models/LinksConfiguration$Affiliate;->pathnameIds:Ljava/util/List;

    return-void
.end method

.method constructor <init>(Lorg/json/JSONObject;)V
    .locals 1
    .param p1    # Lorg/json/JSONObject;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    .line 142
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-string v0, "hostname"

    .line 143
    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/usebutton/sdk/internal/models/LinksConfiguration$Affiliate;->hostname:Ljava/lang/String;

    .line 144
    invoke-direct {p0, p1}, Lcom/usebutton/sdk/internal/models/LinksConfiguration$Affiliate;->parseQueryUrlKeys(Lorg/json/JSONObject;)Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Lcom/usebutton/sdk/internal/models/LinksConfiguration$Affiliate;->queryUrlKeys:Ljava/util/List;

    .line 145
    invoke-direct {p0, p1}, Lcom/usebutton/sdk/internal/models/LinksConfiguration$Affiliate;->parseQueryIds(Lorg/json/JSONObject;)Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Lcom/usebutton/sdk/internal/models/LinksConfiguration$Affiliate;->queryIds:Ljava/util/List;

    .line 146
    invoke-direct {p0, p1}, Lcom/usebutton/sdk/internal/models/LinksConfiguration$Affiliate;->parsePathnameIds(Lorg/json/JSONObject;)Ljava/util/List;

    move-result-object p1

    iput-object p1, p0, Lcom/usebutton/sdk/internal/models/LinksConfiguration$Affiliate;->pathnameIds:Ljava/util/List;

    return-void
.end method

.method private parsePathnameIds(Lorg/json/JSONObject;)Ljava/util/List;
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
            "Lcom/usebutton/sdk/internal/models/LinksConfiguration$PathnameId;",
            ">;"
        }
    .end annotation

    const-string v0, "pathname_ids"

    .line 224
    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->optJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    move-result-object p1

    const/4 v0, 0x0

    if-nez p1, :cond_0

    .line 226
    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1, v0}, Ljava/util/ArrayList;-><init>(I)V

    return-object p1

    .line 229
    :cond_0
    new-instance v1, Ljava/util/ArrayList;

    invoke-virtual {p1}, Lorg/json/JSONArray;->length()I

    move-result v2

    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(I)V

    .line 230
    :goto_0
    invoke-virtual {p1}, Lorg/json/JSONArray;->length()I

    move-result v2

    if-ge v0, v2, :cond_1

    .line 231
    new-instance v2, Lcom/usebutton/sdk/internal/models/LinksConfiguration$PathnameId;

    invoke-virtual {p1, v0}, Lorg/json/JSONArray;->optJSONObject(I)Lorg/json/JSONObject;

    move-result-object v3

    invoke-direct {v2, v3}, Lcom/usebutton/sdk/internal/models/LinksConfiguration$PathnameId;-><init>(Lorg/json/JSONObject;)V

    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_1
    return-object v1
.end method

.method private parseQueryIds(Lorg/json/JSONObject;)Ljava/util/List;
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
            "Lcom/usebutton/sdk/internal/models/LinksConfiguration$QueryId;",
            ">;"
        }
    .end annotation

    const-string v0, "query_ids"

    .line 210
    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->optJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    move-result-object p1

    const/4 v0, 0x0

    if-nez p1, :cond_0

    .line 212
    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1, v0}, Ljava/util/ArrayList;-><init>(I)V

    return-object p1

    .line 215
    :cond_0
    new-instance v1, Ljava/util/ArrayList;

    invoke-virtual {p1}, Lorg/json/JSONArray;->length()I

    move-result v2

    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(I)V

    .line 216
    :goto_0
    invoke-virtual {p1}, Lorg/json/JSONArray;->length()I

    move-result v2

    if-ge v0, v2, :cond_1

    .line 217
    new-instance v2, Lcom/usebutton/sdk/internal/models/LinksConfiguration$QueryId;

    invoke-virtual {p1, v0}, Lorg/json/JSONArray;->optJSONObject(I)Lorg/json/JSONObject;

    move-result-object v3

    invoke-direct {v2, v3}, Lcom/usebutton/sdk/internal/models/LinksConfiguration$QueryId;-><init>(Lorg/json/JSONObject;)V

    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_1
    return-object v1
.end method

.method private parseQueryUrlKeys(Lorg/json/JSONObject;)Ljava/util/List;
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

    const-string v0, "query_url_keys"

    .line 196
    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->optJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    move-result-object p1

    const/4 v0, 0x0

    if-nez p1, :cond_0

    .line 198
    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1, v0}, Ljava/util/ArrayList;-><init>(I)V

    return-object p1

    .line 201
    :cond_0
    new-instance v1, Ljava/util/ArrayList;

    invoke-virtual {p1}, Lorg/json/JSONArray;->length()I

    move-result v2

    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(I)V

    .line 202
    :goto_0
    invoke-virtual {p1}, Lorg/json/JSONArray;->length()I

    move-result v2

    if-ge v0, v2, :cond_1

    .line 203
    invoke-virtual {p1, v0}, Lorg/json/JSONArray;->optJSONObject(I)Lorg/json/JSONObject;

    move-result-object v2

    const-string v3, "key"

    invoke-virtual {v2, v3}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_1
    return-object v1
.end method


# virtual methods
.method getHostname()Ljava/lang/String;
    .locals 1
    .annotation build Landroid/support/annotation/Nullable;
    .end annotation

    .line 165
    iget-object v0, p0, Lcom/usebutton/sdk/internal/models/LinksConfiguration$Affiliate;->hostname:Ljava/lang/String;

    return-object v0
.end method

.method getPathnameIds()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/usebutton/sdk/internal/models/LinksConfiguration$PathnameId;",
            ">;"
        }
    .end annotation

    .line 192
    iget-object v0, p0, Lcom/usebutton/sdk/internal/models/LinksConfiguration$Affiliate;->pathnameIds:Ljava/util/List;

    return-object v0
.end method

.method getQueryIds()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/usebutton/sdk/internal/models/LinksConfiguration$QueryId;",
            ">;"
        }
    .end annotation

    .line 183
    iget-object v0, p0, Lcom/usebutton/sdk/internal/models/LinksConfiguration$Affiliate;->queryIds:Ljava/util/List;

    return-object v0
.end method

.method getQueryUrlKeys()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .line 174
    iget-object v0, p0, Lcom/usebutton/sdk/internal/models/LinksConfiguration$Affiliate;->queryUrlKeys:Ljava/util/List;

    return-object v0
.end method
