.class Lcom/usebutton/sdk/internal/models/LinksConfiguration$QueryId;
.super Ljava/lang/Object;
.source "LinksConfiguration.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/usebutton/sdk/internal/models/LinksConfiguration;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "QueryId"
.end annotation


# instance fields
.field private final guaranteedAction:Z

.field private final key:Ljava/lang/String;

.field private final values:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method constructor <init>(Ljava/lang/String;Ljava/util/List;)V
    .locals 0
    .annotation build Landroid/support/annotation/VisibleForTesting;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    .line 259
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 260
    iput-object p1, p0, Lcom/usebutton/sdk/internal/models/LinksConfiguration$QueryId;->key:Ljava/lang/String;

    .line 261
    iput-object p2, p0, Lcom/usebutton/sdk/internal/models/LinksConfiguration$QueryId;->values:Ljava/util/List;

    const/4 p1, 0x1

    .line 262
    iput-boolean p1, p0, Lcom/usebutton/sdk/internal/models/LinksConfiguration$QueryId;->guaranteedAction:Z

    return-void
.end method

.method constructor <init>(Lorg/json/JSONObject;)V
    .locals 2
    .param p1    # Lorg/json/JSONObject;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    .line 252
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-string v0, "key"

    .line 253
    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/usebutton/sdk/internal/models/LinksConfiguration$QueryId;->key:Ljava/lang/String;

    .line 254
    invoke-direct {p0, p1}, Lcom/usebutton/sdk/internal/models/LinksConfiguration$QueryId;->parseValues(Lorg/json/JSONObject;)Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Lcom/usebutton/sdk/internal/models/LinksConfiguration$QueryId;->values:Ljava/util/List;

    const-string v0, "guaranteed_action"

    const/4 v1, 0x1

    .line 255
    invoke-virtual {p1, v0, v1}, Lorg/json/JSONObject;->optBoolean(Ljava/lang/String;Z)Z

    move-result p1

    iput-boolean p1, p0, Lcom/usebutton/sdk/internal/models/LinksConfiguration$QueryId;->guaranteedAction:Z

    return-void
.end method

.method private parseValues(Lorg/json/JSONObject;)Ljava/util/List;
    .locals 4
    .param p1    # Lorg/json/JSONObject;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .annotation build Landroid/support/annotation/Nullable;
    .end annotation

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

    const-string v0, "values"

    .line 291
    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->optJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    move-result-object p1

    if-nez p1, :cond_0

    const/4 p1, 0x0

    return-object p1

    .line 296
    :cond_0
    new-instance v0, Ljava/util/ArrayList;

    invoke-virtual {p1}, Lorg/json/JSONArray;->length()I

    move-result v1

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    const/4 v1, 0x0

    .line 297
    :goto_0
    invoke-virtual {p1}, Lorg/json/JSONArray;->length()I

    move-result v2

    if-ge v1, v2, :cond_1

    .line 298
    invoke-virtual {p1, v1}, Lorg/json/JSONArray;->optJSONObject(I)Lorg/json/JSONObject;

    move-result-object v2

    const-string v3, "value"

    invoke-virtual {v2, v3}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_1
    return-object v0
.end method


# virtual methods
.method getKey()Ljava/lang/String;
    .locals 1
    .annotation build Landroid/support/annotation/Nullable;
    .end annotation

    .line 272
    iget-object v0, p0, Lcom/usebutton/sdk/internal/models/LinksConfiguration$QueryId;->key:Ljava/lang/String;

    return-object v0
.end method

.method getValues()Ljava/util/List;
    .locals 1
    .annotation build Landroid/support/annotation/Nullable;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .line 282
    iget-object v0, p0, Lcom/usebutton/sdk/internal/models/LinksConfiguration$QueryId;->values:Ljava/util/List;

    return-object v0
.end method

.method isGuaranteedAction()Z
    .locals 1

    .line 286
    iget-boolean v0, p0, Lcom/usebutton/sdk/internal/models/LinksConfiguration$QueryId;->guaranteedAction:Z

    return v0
.end method
