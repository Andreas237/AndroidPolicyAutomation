.class public Lcom/usebutton/sdk/internal/api/models/BrowserCardMapDTO;
.super Ljava/lang/Object;
.source "BrowserCardMapDTO.java"


# instance fields
.field private final internalInstallCardDTOMap:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Lcom/usebutton/sdk/internal/models/BrowserCardType;",
            "Lcom/usebutton/sdk/internal/api/models/InternalInstallCardDTO;",
            ">;"
        }
    .end annotation
.end field

.field private final internalRewardCardDTOMap:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Lcom/usebutton/sdk/internal/models/BrowserCardType;",
            "Lcom/usebutton/sdk/internal/api/models/InternalRewardCardDTO;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method private constructor <init>(Ljava/util/Map;Ljava/util/Map;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Lcom/usebutton/sdk/internal/models/BrowserCardType;",
            "Lcom/usebutton/sdk/internal/api/models/InternalRewardCardDTO;",
            ">;",
            "Ljava/util/Map<",
            "Lcom/usebutton/sdk/internal/models/BrowserCardType;",
            "Lcom/usebutton/sdk/internal/api/models/InternalInstallCardDTO;",
            ">;)V"
        }
    .end annotation

    .line 19
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 20
    iput-object p1, p0, Lcom/usebutton/sdk/internal/api/models/BrowserCardMapDTO;->internalRewardCardDTOMap:Ljava/util/Map;

    .line 21
    iput-object p2, p0, Lcom/usebutton/sdk/internal/api/models/BrowserCardMapDTO;->internalInstallCardDTOMap:Ljava/util/Map;

    return-void
.end method

.method public static fromJson(Lorg/json/JSONObject;)Lcom/usebutton/sdk/internal/api/models/BrowserCardMapDTO;
    .locals 9
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

    .line 30
    :cond_0
    new-instance v0, Ljava/util/EnumMap;

    const-class v1, Lcom/usebutton/sdk/internal/models/BrowserCardType;

    invoke-direct {v0, v1}, Ljava/util/EnumMap;-><init>(Ljava/lang/Class;)V

    .line 31
    new-instance v1, Ljava/util/EnumMap;

    const-class v2, Lcom/usebutton/sdk/internal/models/BrowserCardType;

    invoke-direct {v1, v2}, Ljava/util/EnumMap;-><init>(Ljava/lang/Class;)V

    .line 33
    invoke-static {}, Lcom/usebutton/sdk/internal/models/BrowserCardType;->values()[Lcom/usebutton/sdk/internal/models/BrowserCardType;

    move-result-object v2

    array-length v3, v2

    const/4 v4, 0x0

    :goto_0
    if-ge v4, v3, :cond_2

    aget-object v5, v2, v4

    .line 34
    invoke-virtual {v5}, Lcom/usebutton/sdk/internal/models/BrowserCardType;->getApiValue()Ljava/lang/String;

    move-result-object v6

    .line 36
    invoke-virtual {p0, v6}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v7

    if-eqz v7, :cond_1

    .line 37
    invoke-virtual {p0, v6}, Lorg/json/JSONObject;->getJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v6

    .line 39
    sget-object v7, Lcom/usebutton/sdk/internal/api/models/BrowserCardMapDTO$1;->$SwitchMap$com$usebutton$sdk$internal$models$BrowserCardType:[I

    invoke-virtual {v5}, Lcom/usebutton/sdk/internal/models/BrowserCardType;->ordinal()I

    move-result v8

    aget v7, v7, v8

    packed-switch v7, :pswitch_data_0

    goto :goto_1

    .line 48
    :pswitch_0
    invoke-static {v6}, Lcom/usebutton/sdk/internal/api/models/InternalInstallCardDTO;->fromJson(Lorg/json/JSONObject;)Lcom/usebutton/sdk/internal/api/models/InternalInstallCardDTO;

    move-result-object v6

    .line 49
    invoke-interface {v1, v5, v6}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_1

    .line 43
    :pswitch_1
    invoke-static {v6}, Lcom/usebutton/sdk/internal/api/models/InternalRewardCardDTO;->fromJson(Lorg/json/JSONObject;)Lcom/usebutton/sdk/internal/api/models/InternalRewardCardDTO;

    move-result-object v6

    .line 44
    invoke-interface {v0, v5, v6}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_1
    :goto_1
    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    .line 58
    :cond_2
    new-instance p0, Lcom/usebutton/sdk/internal/api/models/BrowserCardMapDTO;

    invoke-direct {p0, v0, v1}, Lcom/usebutton/sdk/internal/api/models/BrowserCardMapDTO;-><init>(Ljava/util/Map;Ljava/util/Map;)V

    return-object p0

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method


# virtual methods
.method public getInternalInstallCardDTOMap()Ljava/util/Map;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "Lcom/usebutton/sdk/internal/models/BrowserCardType;",
            "Lcom/usebutton/sdk/internal/api/models/InternalInstallCardDTO;",
            ">;"
        }
    .end annotation

    .line 66
    iget-object v0, p0, Lcom/usebutton/sdk/internal/api/models/BrowserCardMapDTO;->internalInstallCardDTOMap:Ljava/util/Map;

    return-object v0
.end method

.method public getInternalRewardCardDTOMap()Ljava/util/Map;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "Lcom/usebutton/sdk/internal/models/BrowserCardType;",
            "Lcom/usebutton/sdk/internal/api/models/InternalRewardCardDTO;",
            ">;"
        }
    .end annotation

    .line 62
    iget-object v0, p0, Lcom/usebutton/sdk/internal/api/models/BrowserCardMapDTO;->internalRewardCardDTOMap:Ljava/util/Map;

    return-object v0
.end method
