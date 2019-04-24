.class public Lcom/shopkick/fetchers/api/APIManager;
.super Ljava/lang/Object;
.source "APIManager.java"

# interfaces
.implements Lcom/shopkick/fetchers/network/INetworkResponseParseCallback;
.implements Lcom/shopkick/fetchers/network/INetworkRequestFinishedCallback;
.implements Lcom/shopkick/app/fetchers/api/IAPICommonHandlerCallback;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/shopkick/fetchers/api/APIManager$APIRequestState;,
        Lcom/shopkick/fetchers/api/APIManager$APIEndpointsMapKey;
    }
.end annotation


# static fields
.field static final synthetic $assertionsDisabled:Z = false

.field public static final APIMANAGER_AUTHENTICATION_FAILED_EVENT:Ljava/lang/String; = "APIManagerAuthenticationFailedEvent"

.field public static final AuthenticationType:Ljava/lang/String; = "authenticationType"

.field public static final AuthenticationTypeApp:I = 0x2

.field public static final AuthenticationTypeAppAuth:I = 0x5

.field public static final AuthenticationTypeConfiguredUser:I = 0x4

.field public static final AuthenticationTypeDeveloper:I = 0x3

.field public static final AuthenticationTypeNone:I = 0x0

.field public static final AuthenticationTypeUser:I = 0x1

.field public static final AuthenticationTypeUserAuth:I = 0x6

.field public static final DEFAULT_AUTH_DOMAIN:Ljava/lang/String; = "sdk.shopkick.com"

.field public static final EventTypeNetworkRequestTimeout:I = 0x668a1

.field private static volatile Instance:Lcom/shopkick/fetchers/api/APIManager; = null

.field private static final InstanceLock:Ljava/lang/Object;

.field private static final JSONKeyForDomainValue:Ljava/lang/String; = "domain"

.field public static final MAC_KEY:Ljava/lang/String; = "X-Mac"

.field public static final MODIFIES_SESSION_KEY:Ljava/lang/String; = "modifiesSession"

.field public static final Path:Ljava/lang/String; = "path"

.field public static final ResponseClass:Ljava/lang/String; = "responseClass"

.field public static final SERVER_TOKEN_KEY:Ljava/lang/String; = "X-K"

.field public static final UsePost:Ljava/lang/String; = "usePost"

.field private static final _RequestTypeIDMapAccessLock:Ljava/lang/Object;


# instance fields
.field private final apiEndpointsMap:Ljava/util/HashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/HashMap<",
            "Lcom/shopkick/fetchers/api/APIManager$APIEndpointsMapKey;",
            "Lcom/shopkick/comm/IAPIEndpoint;",
            ">;"
        }
    .end annotation
.end field

.field private apiToAPIRequestStateMap:Ljava/util/HashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/HashMap<",
            "Lcom/shopkick/app/fetchers/api/IAPIObject;",
            "Lcom/shopkick/fetchers/api/APIManager$APIRequestState;",
            ">;"
        }
    .end annotation
.end field

.field private final appInfo:Lcom/shopkick/app/application/AppInfo;

.field private final context:Landroid/content/Context;

.field private final developerInfo:Lcom/shopkick/app/application/DeveloperInfo;

.field disableHTTPS:Z

.field private enableNetworkRequestTimeoutLogging:Z

.field handlerList:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Lcom/shopkick/app/fetchers/api/IAPICommonHandler;",
            ">;"
        }
    .end annotation
.end field

.field private libPrefs:Lcom/shopkick/app/application/LibPreferences;

.field private logger:Lcom/shopkick/app/application/SKLogger;

.field private final networkManager:Lcom/shopkick/fetchers/network/NetworkManager;

.field private networkRequestToAPIRequestMap:Ljava/util/HashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/HashMap<",
            "Lcom/shopkick/fetchers/network/NetworkRequest;",
            "Lcom/shopkick/app/fetchers/api/IAPIObject;",
            ">;"
        }
    .end annotation
.end field

.field private notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

.field private requestThatModifiesSessionKey:Lcom/shopkick/app/fetchers/api/IAPIObject;

.field private requestTypeIDMapProvider:Lcom/shopkick/fetchers/api/RequestTypeIDMapProvider;

.field private final resources:Landroid/content/res/Resources;

.field serverToken:Ljava/lang/String;

.field private serverTokenListener:Lcom/shopkick/fetchers/network/NetworkManager$ServerTokenListener;

.field private final userAcct:Lcom/shopkick/app/application/Account;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 130
    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lcom/shopkick/fetchers/api/APIManager;->_RequestTypeIDMapAccessLock:Ljava/lang/Object;

    const/4 v0, 0x0

    .line 207
    sput-object v0, Lcom/shopkick/fetchers/api/APIManager;->Instance:Lcom/shopkick/fetchers/api/APIManager;

    .line 208
    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lcom/shopkick/fetchers/api/APIManager;->InstanceLock:Ljava/lang/Object;

    return-void
.end method

.method private constructor <init>(Lcom/shopkick/fetchers/network/NetworkManager;Lcom/shopkick/app/application/AppInfo;Lcom/shopkick/app/application/DeveloperInfo;Lcom/shopkick/app/application/Account;ZLandroid/content/Context;Lcom/shopkick/app/util/NotificationCenter;Lcom/shopkick/app/application/LibPreferences;Lcom/shopkick/app/application/SKLogger;)V
    .locals 1

    .line 170
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 292
    new-instance v0, Lcom/shopkick/fetchers/api/APIManager$1;

    invoke-direct {v0, p0}, Lcom/shopkick/fetchers/api/APIManager$1;-><init>(Lcom/shopkick/fetchers/api/APIManager;)V

    iput-object v0, p0, Lcom/shopkick/fetchers/api/APIManager;->serverTokenListener:Lcom/shopkick/fetchers/network/NetworkManager$ServerTokenListener;

    .line 172
    iput-object p1, p0, Lcom/shopkick/fetchers/api/APIManager;->networkManager:Lcom/shopkick/fetchers/network/NetworkManager;

    .line 173
    iput-object p2, p0, Lcom/shopkick/fetchers/api/APIManager;->appInfo:Lcom/shopkick/app/application/AppInfo;

    .line 174
    iput-object p3, p0, Lcom/shopkick/fetchers/api/APIManager;->developerInfo:Lcom/shopkick/app/application/DeveloperInfo;

    .line 175
    iput-object p4, p0, Lcom/shopkick/fetchers/api/APIManager;->userAcct:Lcom/shopkick/app/application/Account;

    .line 176
    iput-boolean p5, p0, Lcom/shopkick/fetchers/api/APIManager;->disableHTTPS:Z

    .line 177
    invoke-virtual {p6}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object p2

    iput-object p2, p0, Lcom/shopkick/fetchers/api/APIManager;->context:Landroid/content/Context;

    .line 178
    invoke-virtual {p6}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object p2

    iput-object p2, p0, Lcom/shopkick/fetchers/api/APIManager;->resources:Landroid/content/res/Resources;

    .line 179
    iput-object p7, p0, Lcom/shopkick/fetchers/api/APIManager;->notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

    .line 180
    iput-object p8, p0, Lcom/shopkick/fetchers/api/APIManager;->libPrefs:Lcom/shopkick/app/application/LibPreferences;

    .line 181
    iput-object p9, p0, Lcom/shopkick/fetchers/api/APIManager;->logger:Lcom/shopkick/app/application/SKLogger;

    .line 183
    new-instance p2, Ljava/util/HashMap;

    invoke-direct {p2}, Ljava/util/HashMap;-><init>()V

    iput-object p2, p0, Lcom/shopkick/fetchers/api/APIManager;->apiEndpointsMap:Ljava/util/HashMap;

    .line 185
    new-instance p2, Ljava/util/HashMap;

    invoke-direct {p2}, Ljava/util/HashMap;-><init>()V

    iput-object p2, p0, Lcom/shopkick/fetchers/api/APIManager;->apiToAPIRequestStateMap:Ljava/util/HashMap;

    .line 186
    new-instance p2, Ljava/util/HashMap;

    invoke-direct {p2}, Ljava/util/HashMap;-><init>()V

    iput-object p2, p0, Lcom/shopkick/fetchers/api/APIManager;->networkRequestToAPIRequestMap:Ljava/util/HashMap;

    const/4 p2, 0x0

    .line 187
    iput-object p2, p0, Lcom/shopkick/fetchers/api/APIManager;->requestThatModifiesSessionKey:Lcom/shopkick/app/fetchers/api/IAPIObject;

    .line 189
    new-instance p2, Ljava/util/ArrayList;

    invoke-direct {p2}, Ljava/util/ArrayList;-><init>()V

    iput-object p2, p0, Lcom/shopkick/fetchers/api/APIManager;->handlerList:Ljava/util/ArrayList;

    if-eqz p8, :cond_0

    .line 192
    invoke-virtual {p8}, Lcom/shopkick/app/application/LibPreferences;->getAPIManagerToken()Ljava/lang/String;

    move-result-object p2

    iput-object p2, p0, Lcom/shopkick/fetchers/api/APIManager;->serverToken:Ljava/lang/String;

    .line 196
    :cond_0
    invoke-virtual {p4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object p2

    invoke-virtual {p2}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object p2

    const-string p3, ".SDKUser"

    invoke-virtual {p2, p3}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    move-result p2

    if-nez p2, :cond_1

    .line 197
    iget-object p2, p0, Lcom/shopkick/fetchers/api/APIManager;->serverTokenListener:Lcom/shopkick/fetchers/network/NetworkManager$ServerTokenListener;

    invoke-virtual {p1, p2}, Lcom/shopkick/fetchers/network/NetworkManager;->setServerTokenListener(Lcom/shopkick/fetchers/network/NetworkManager$ServerTokenListener;)V

    .line 199
    :cond_1
    invoke-virtual {p1, p0}, Lcom/shopkick/fetchers/network/NetworkManager;->setDefaultNetworkResponseParseCallback(Lcom/shopkick/fetchers/network/INetworkResponseParseCallback;)V

    .line 201
    iget-object p1, p0, Lcom/shopkick/fetchers/api/APIManager;->context:Landroid/content/Context;

    invoke-static {}, Lcom/shopkick/utilities/DefaultCacheLoggingProvider;->getInstance()Lcom/shopkick/utilities/DefaultCacheLoggingProvider;

    move-result-object p2

    invoke-static {p1, p2}, Lcom/shopkick/fetchers/api/RequestTypeIDMapProvider;->initialize(Landroid/content/Context;Lnet/toddm/cache/LoggingProvider;)Z

    move-result p1

    if-eqz p1, :cond_2

    .line 202
    invoke-static {}, Lcom/shopkick/fetchers/api/RequestTypeIDMapProvider;->getInstance()Lcom/shopkick/fetchers/api/RequestTypeIDMapProvider;

    move-result-object p1

    iput-object p1, p0, Lcom/shopkick/fetchers/api/APIManager;->requestTypeIDMapProvider:Lcom/shopkick/fetchers/api/RequestTypeIDMapProvider;

    :cond_2
    return-void
.end method

.method static synthetic access$000(Lcom/shopkick/fetchers/api/APIManager;)Lcom/shopkick/app/application/Account;
    .locals 0

    .line 77
    iget-object p0, p0, Lcom/shopkick/fetchers/api/APIManager;->userAcct:Lcom/shopkick/app/application/Account;

    return-object p0
.end method

.method static synthetic access$100(Lcom/shopkick/fetchers/api/APIManager;)Lcom/shopkick/app/application/DeveloperInfo;
    .locals 0

    .line 77
    iget-object p0, p0, Lcom/shopkick/fetchers/api/APIManager;->developerInfo:Lcom/shopkick/app/application/DeveloperInfo;

    return-object p0
.end method

.method static synthetic access$200(Lcom/shopkick/fetchers/api/APIManager;)Lcom/shopkick/app/application/AppInfo;
    .locals 0

    .line 77
    iget-object p0, p0, Lcom/shopkick/fetchers/api/APIManager;->appInfo:Lcom/shopkick/app/application/AppInfo;

    return-object p0
.end method

.method static synthetic access$300(Lcom/shopkick/fetchers/api/APIManager;)Lcom/shopkick/app/application/LibPreferences;
    .locals 0

    .line 77
    iget-object p0, p0, Lcom/shopkick/fetchers/api/APIManager;->libPrefs:Lcom/shopkick/app/application/LibPreferences;

    return-object p0
.end method

.method private addApiDefinitions(Lcom/shopkick/fetchers/api/RequestDomainId;Ljava/lang/String;Ljava/util/List;)V
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/shopkick/fetchers/api/RequestDomainId;",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Ljava/lang/Integer;",
            ">;)V"
        }
    .end annotation

    if-eqz p1, :cond_4

    .line 830
    invoke-static {p2}, Lcom/shopkick/app/util/StringUtils;->isEmpty(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_4

    if-eqz p3, :cond_4

    .line 831
    invoke-interface {p3}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_4

    .line 837
    invoke-interface {p3}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p3

    :cond_0
    invoke-interface {p3}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-interface {p3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    .line 838
    invoke-direct {p0, v0}, Lcom/shopkick/fetchers/api/APIManager;->loadDetailsFromFile(I)Lorg/json/JSONObject;

    move-result-object v1

    if-eqz v1, :cond_2

    .line 842
    invoke-virtual {v1}, Lorg/json/JSONObject;->keys()Ljava/util/Iterator;

    move-result-object v0

    .line 843
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_0

    .line 844
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    .line 848
    :try_start_0
    invoke-virtual {v1, v2}, Lorg/json/JSONObject;->getJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v3

    const-string v4, "domain"

    .line 849
    invoke-virtual {v3, v4}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v4

    if-nez v4, :cond_1

    const-string v4, "domain"

    .line 850
    invoke-virtual {v3, v4, p2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 852
    :cond_1
    new-instance v4, Lcom/shopkick/comm/DefaultAPIEndpoint;

    invoke-direct {v4, v3}, Lcom/shopkick/comm/DefaultAPIEndpoint;-><init>(Lorg/json/JSONObject;)V

    .line 853
    iget-object v3, p0, Lcom/shopkick/fetchers/api/APIManager;->apiEndpointsMap:Ljava/util/HashMap;

    new-instance v5, Lcom/shopkick/fetchers/api/APIManager$APIEndpointsMapKey;

    const/4 v6, 0x0

    invoke-direct {v5, p0, p1, v2, v6}, Lcom/shopkick/fetchers/api/APIManager$APIEndpointsMapKey;-><init>(Lcom/shopkick/fetchers/api/APIManager;Lcom/shopkick/fetchers/api/RequestDomainId;Ljava/lang/String;Lcom/shopkick/fetchers/api/APIManager$1;)V

    invoke-virtual {v3, v5, v4}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p1

    .line 855
    new-instance p2, Ljava/lang/RuntimeException;

    invoke-direct {p2, p1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    throw p2

    .line 840
    :cond_2
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const/4 p2, 0x1

    new-array p2, p2, [Ljava/lang/Object;

    const/4 p3, 0x0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    aput-object v0, p2, p3

    const-string p3, "Failed to load resource file %1$d"

    invoke-static {p3, p2}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_3
    return-void

    .line 832
    :cond_4
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "at least one of domain, domainId or apiDetailsFileResourceIds is null or empty"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method private addApiDefinitions(Lcom/shopkick/fetchers/api/RequestDomainId;Ljava/lang/String;Ljava/util/Map;)V
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/shopkick/fetchers/api/RequestDomainId;",
            "Ljava/lang/String;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Lcom/shopkick/comm/IAPIEndpoint;",
            ">;)V"
        }
    .end annotation

    .line 862
    invoke-static {p2}, Lcom/shopkick/app/util/StringUtils;->isEmpty(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_3

    if-eqz p3, :cond_3

    invoke-interface {p3}, Ljava/util/Map;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_3

    if-eqz p1, :cond_3

    .line 867
    invoke-interface {p3}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object p3

    invoke-interface {p3}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object p3

    :goto_0
    invoke-interface {p3}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-interface {p3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Map$Entry;

    .line 868
    invoke-interface {v0}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    invoke-static {v1}, Lcom/shopkick/app/util/StringUtils;->isEmpty(Ljava/lang/String;)Z

    move-result v1

    if-nez v1, :cond_1

    invoke-interface {v0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v1

    if-eqz v1, :cond_1

    .line 871
    new-instance v1, Lcom/shopkick/comm/DefaultAPIEndpoint;

    invoke-interface {v0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/shopkick/comm/IAPIEndpoint;

    invoke-direct {v1, v2}, Lcom/shopkick/comm/DefaultAPIEndpoint;-><init>(Lcom/shopkick/comm/IAPIEndpoint;)V

    .line 872
    invoke-virtual {v1}, Lcom/shopkick/comm/DefaultAPIEndpoint;->getDomain()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Lcom/shopkick/app/util/StringUtils;->isEmpty(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_0

    .line 873
    invoke-virtual {v1, p2}, Lcom/shopkick/comm/DefaultAPIEndpoint;->setDomain(Ljava/lang/String;)V

    .line 875
    :cond_0
    iget-object v2, p0, Lcom/shopkick/fetchers/api/APIManager;->apiEndpointsMap:Ljava/util/HashMap;

    new-instance v3, Lcom/shopkick/fetchers/api/APIManager$APIEndpointsMapKey;

    invoke-interface {v0}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    const/4 v4, 0x0

    invoke-direct {v3, p0, p1, v0, v4}, Lcom/shopkick/fetchers/api/APIManager$APIEndpointsMapKey;-><init>(Lcom/shopkick/fetchers/api/APIManager;Lcom/shopkick/fetchers/api/RequestDomainId;Ljava/lang/String;Lcom/shopkick/fetchers/api/APIManager$1;)V

    invoke-virtual {v2, v3, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    .line 869
    :cond_1
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string/jumbo p2, "trying to add an empty endpoint"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    return-void

    .line 864
    :cond_3
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "at least one of domain, domainId or endpointsMap is null or empty."

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public static addApis(Lcom/shopkick/fetchers/api/RequestDomainId;Ljava/lang/String;Ljava/util/List;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/shopkick/fetchers/api/RequestDomainId;",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Ljava/lang/Integer;",
            ">;)V"
        }
    .end annotation

    .line 228
    sget-object v0, Lcom/shopkick/fetchers/api/APIManager;->Instance:Lcom/shopkick/fetchers/api/APIManager;

    if-eqz v0, :cond_0

    .line 231
    sget-object v0, Lcom/shopkick/fetchers/api/APIManager;->Instance:Lcom/shopkick/fetchers/api/APIManager;

    invoke-direct {v0, p0, p1, p2}, Lcom/shopkick/fetchers/api/APIManager;->addApiDefinitions(Lcom/shopkick/fetchers/api/RequestDomainId;Ljava/lang/String;Ljava/util/List;)V

    return-void

    .line 229
    :cond_0
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string p1, "APIManager.initialize() must be called before APIManager.addApis()"

    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static addApis(Lcom/shopkick/fetchers/api/RequestDomainId;Ljava/lang/String;Ljava/util/Map;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/shopkick/fetchers/api/RequestDomainId;",
            "Ljava/lang/String;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Lcom/shopkick/comm/IAPIEndpoint;",
            ">;)V"
        }
    .end annotation

    .line 235
    sget-object v0, Lcom/shopkick/fetchers/api/APIManager;->Instance:Lcom/shopkick/fetchers/api/APIManager;

    if-eqz v0, :cond_0

    .line 238
    sget-object v0, Lcom/shopkick/fetchers/api/APIManager;->Instance:Lcom/shopkick/fetchers/api/APIManager;

    invoke-direct {v0, p0, p1, p2}, Lcom/shopkick/fetchers/api/APIManager;->addApiDefinitions(Lcom/shopkick/fetchers/api/RequestDomainId;Ljava/lang/String;Ljava/util/Map;)V

    return-void

    .line 236
    :cond_0
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string p1, "APIManager.initialize() must be called before APIManager.addApis()"

    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method private buildURLString(Landroid/net/Uri$Builder;Lcom/shopkick/comm/IAPIEndpoint;)V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/json/JSONException;
        }
    .end annotation

    if-eqz p1, :cond_2

    if-nez p2, :cond_0

    goto :goto_1

    .line 820
    :cond_0
    iget-boolean v0, p0, Lcom/shopkick/fetchers/api/APIManager;->disableHTTPS:Z

    if-eqz v0, :cond_1

    const-string v0, "http"

    goto :goto_0

    :cond_1
    const-string v0, "https"

    :goto_0
    invoke-virtual {p1, v0}, Landroid/net/Uri$Builder;->scheme(Ljava/lang/String;)Landroid/net/Uri$Builder;

    .line 821
    invoke-interface {p2}, Lcom/shopkick/comm/IAPIEndpoint;->getDomain()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/net/Uri$Builder;->encodedAuthority(Ljava/lang/String;)Landroid/net/Uri$Builder;

    .line 822
    invoke-interface {p2}, Lcom/shopkick/comm/IAPIEndpoint;->getPath()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Landroid/net/Uri$Builder;->path(Ljava/lang/String;)Landroid/net/Uri$Builder;

    return-void

    :cond_2
    :goto_1
    return-void
.end method

.method private cancelSuspendedRequests()V
    .locals 9

    .line 1170
    iget-object v0, p0, Lcom/shopkick/fetchers/api/APIManager;->requestThatModifiesSessionKey:Lcom/shopkick/app/fetchers/api/IAPIObject;

    const/4 v1, 0x0

    .line 1171
    iput-object v1, p0, Lcom/shopkick/fetchers/api/APIManager;->requestThatModifiesSessionKey:Lcom/shopkick/app/fetchers/api/IAPIObject;

    .line 1175
    iget-object v2, p0, Lcom/shopkick/fetchers/api/APIManager;->apiToAPIRequestStateMap:Ljava/util/HashMap;

    invoke-virtual {v2}, Ljava/util/HashMap;->clone()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/util/HashMap;

    invoke-virtual {v2}, Ljava/util/HashMap;->keySet()Ljava/util/Set;

    move-result-object v2

    .line 1176
    invoke-interface {v2}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_2

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/shopkick/app/fetchers/api/IAPIObject;

    if-ne v0, v3, :cond_0

    goto :goto_0

    .line 1180
    :cond_0
    iget-object v4, p0, Lcom/shopkick/fetchers/api/APIManager;->apiToAPIRequestStateMap:Ljava/util/HashMap;

    invoke-virtual {v4, v3}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lcom/shopkick/fetchers/api/APIManager$APIRequestState;

    .line 1181
    iget-object v5, v4, Lcom/shopkick/fetchers/api/APIManager$APIRequestState;->networkRequest:Lcom/shopkick/fetchers/network/NetworkRequest;

    if-eqz v5, :cond_1

    .line 1182
    iget-object v5, p0, Lcom/shopkick/fetchers/api/APIManager;->networkManager:Lcom/shopkick/fetchers/network/NetworkManager;

    iget-object v6, v4, Lcom/shopkick/fetchers/api/APIManager$APIRequestState;->networkRequest:Lcom/shopkick/fetchers/network/NetworkRequest;

    invoke-virtual {v5, v6}, Lcom/shopkick/fetchers/network/NetworkManager;->cancel(Lcom/shopkick/fetchers/network/NetworkRequest;)V

    .line 1184
    :cond_1
    new-instance v5, Lcom/shopkick/fetchers/DataResponse;

    const/4 v6, 0x0

    const/16 v7, 0x190

    const/4 v8, 0x6

    invoke-direct {v5, v6, v7, v8, v1}, Lcom/shopkick/fetchers/DataResponse;-><init>(ZIILjava/lang/Object;)V

    iput-object v5, v4, Lcom/shopkick/fetchers/api/APIManager$APIRequestState;->response:Lcom/shopkick/fetchers/DataResponse;

    .line 1189
    invoke-virtual {p0, v3}, Lcom/shopkick/fetchers/api/APIManager;->executeCallbacksForRequest(Lcom/shopkick/app/fetchers/api/IAPIObject;)V

    goto :goto_0

    :cond_2
    return-void
.end method

.method private cleanupAPIRequest(Lcom/shopkick/app/fetchers/api/IAPIObject;)V
    .locals 2

    .line 1244
    iget-object v0, p0, Lcom/shopkick/fetchers/api/APIManager;->apiToAPIRequestStateMap:Ljava/util/HashMap;

    invoke-virtual {v0, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/shopkick/fetchers/api/APIManager$APIRequestState;

    if-eqz v0, :cond_0

    .line 1246
    iget-object v0, v0, Lcom/shopkick/fetchers/api/APIManager$APIRequestState;->networkRequest:Lcom/shopkick/fetchers/network/NetworkRequest;

    if-eqz v0, :cond_0

    .line 1248
    iget-object v1, p0, Lcom/shopkick/fetchers/api/APIManager;->networkRequestToAPIRequestMap:Ljava/util/HashMap;

    invoke-virtual {v1, v0}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1251
    :cond_0
    iget-object v0, p0, Lcom/shopkick/fetchers/api/APIManager;->apiToAPIRequestStateMap:Ljava/util/HashMap;

    invoke-virtual {v0, p1}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method private fetch(ZLcom/shopkick/fetchers/api/RequestDomainId;Lcom/shopkick/app/fetchers/api/IAPIObject;Lcom/shopkick/fetchers/api/IAPICallback;ZZLnet/toddm/comm/Priority$StartingPriority;Lnet/toddm/cache/CachePriority;Lnet/toddm/comm/CacheBehavior;)Lcom/shopkick/fetchers/RequestDetails;
    .locals 15

    move-object v9, p0

    move-object/from16 v8, p2

    move-object/from16 v10, p3

    move-object/from16 v0, p4

    if-eqz v8, :cond_12

    if-eqz v10, :cond_11

    if-eqz p7, :cond_10

    if-eqz p8, :cond_f

    if-eqz p9, :cond_e

    if-eqz p1, :cond_1

    if-nez v0, :cond_0

    goto :goto_0

    .line 541
    :cond_0
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "\'callback\' should not be set when processing synchronously"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1
    :goto_0
    if-nez p1, :cond_3

    if-eqz v0, :cond_2

    goto :goto_1

    .line 544
    :cond_2
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "\'callback\' should be set when processing asynchronously"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 548
    :cond_3
    :goto_1
    iget-object v1, v9, Lcom/shopkick/fetchers/api/APIManager;->apiToAPIRequestStateMap:Ljava/util/HashMap;

    invoke-virtual {v1, v10}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/shopkick/fetchers/api/APIManager$APIRequestState;

    const/4 v11, 0x0

    const/4 v12, 0x0

    if-eqz v1, :cond_6

    .line 551
    invoke-virtual {v1}, Lcom/shopkick/fetchers/api/APIManager$APIRequestState;->getNetworkWork()Lnet/toddm/comm/SubmittableWork;

    move-result-object v0

    if-eqz p1, :cond_4

    .line 555
    invoke-static {}, Lcom/shopkick/comm/FetchersCommManagerAccessor;->getInstance()Lnet/toddm/comm/CommManager;

    move-result-object v1

    invoke-virtual {v1, v0}, Lnet/toddm/comm/CommManager;->enqueueWork(Lnet/toddm/comm/SubmittableWork;)Lnet/toddm/comm/Work;

    move-result-object v1

    .line 558
    :try_start_0
    invoke-interface {v1}, Lnet/toddm/comm/Work;->get()Lnet/toddm/comm/Response;

    move-result-object v0
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_2

    :catch_0
    move-exception v0

    move-object v2, v0

    .line 560
    invoke-static {}, Lcom/shopkick/logging/LoggerManager;->getInstance()Lcom/shopkick/logging/LoggerManager;

    move-result-object v0

    invoke-virtual {v0}, Lcom/shopkick/logging/LoggerManager;->getDiagnosticLogger()Lcom/shopkick/logging/DiagnosticLogger;

    move-result-object v0

    sget-object v3, Lcom/shopkick/logging/Area;->COMM:Lcom/shopkick/logging/Area;

    invoke-virtual {v3}, Lcom/shopkick/logging/Area;->getValue()J

    move-result-wide v3

    const-string v5, "fetchSynchronous() failed waiting on async work"

    new-array v6, v11, [Ljava/lang/Object;

    move-object/from16 p4, v0

    move-wide/from16 p5, v3

    move-object/from16 p7, v2

    move-object/from16 p8, v5

    move-object/from16 p9, v6

    invoke-virtual/range {p4 .. p9}, Lcom/shopkick/logging/DiagnosticLogger;->e(JLjava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V

    move-object v0, v12

    :goto_2
    if-eqz v0, :cond_5

    .line 565
    invoke-virtual {v0}, Lnet/toddm/comm/Response;->getResponseBytes()[B

    move-result-object v0

    invoke-virtual {p0, v8, v10, v0}, Lcom/shopkick/fetchers/api/APIManager;->parseResponse(Lcom/shopkick/fetchers/api/RequestDomainId;Lcom/shopkick/app/fetchers/api/IAPIObject;[B)Lcom/shopkick/app/fetchers/api/IAPIObject;

    move-result-object v0

    .line 566
    iget-object v2, v9, Lcom/shopkick/fetchers/api/APIManager;->networkManager:Lcom/shopkick/fetchers/network/NetworkManager;

    invoke-virtual {v2, v1, v0, v11}, Lcom/shopkick/fetchers/network/NetworkManager;->buildDataResponseFromCommWork(Lnet/toddm/comm/Work;Ljava/lang/Object;I)Lcom/shopkick/fetchers/DataResponse;

    move-result-object v12

    goto :goto_3

    .line 571
    :cond_4
    new-instance v12, Lcom/shopkick/fetchers/AsyncRequestDetails;

    invoke-direct {v12, v0}, Lcom/shopkick/fetchers/AsyncRequestDetails;-><init>(Lnet/toddm/comm/SubmittableWork;)V

    :cond_5
    :goto_3
    return-object v12

    :cond_6
    move-object v1, p0

    move-object/from16 v2, p2

    move-object/from16 v3, p3

    move/from16 v4, p6

    move-object/from16 v5, p7

    move-object/from16 v6, p8

    move-object/from16 v7, p9

    .line 577
    invoke-virtual/range {v1 .. v7}, Lcom/shopkick/fetchers/api/APIManager;->buildNetworkRequest(Lcom/shopkick/fetchers/api/RequestDomainId;Lcom/shopkick/app/fetchers/api/IAPIObject;ZLnet/toddm/comm/Priority$StartingPriority;Lnet/toddm/cache/CachePriority;Lnet/toddm/comm/CacheBehavior;)Lcom/shopkick/fetchers/network/NetworkRequest;

    move-result-object v13

    .line 585
    invoke-virtual/range {p3 .. p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v1

    invoke-direct {p0, v8, v1}, Lcom/shopkick/fetchers/api/APIManager;->getRequestDetails(Lcom/shopkick/fetchers/api/RequestDomainId;Ljava/lang/String;)Lcom/shopkick/comm/IAPIEndpoint;

    move-result-object v14

    if-eqz v14, :cond_7

    .line 588
    invoke-interface {v14}, Lcom/shopkick/comm/IAPIEndpoint;->getAuthenticationType()I

    :cond_7
    if-eqz v13, :cond_c

    .line 599
    invoke-virtual {v13}, Lcom/shopkick/fetchers/network/NetworkRequest;->isAuthenticated()Z

    move-result v1

    if-nez v1, :cond_8

    iget-object v1, v9, Lcom/shopkick/fetchers/api/APIManager;->requestThatModifiesSessionKey:Lcom/shopkick/app/fetchers/api/IAPIObject;

    if-nez v1, :cond_8

    goto :goto_4

    .line 616
    :cond_8
    invoke-virtual {p0, v13}, Lcom/shopkick/fetchers/api/APIManager;->submittableWorkForNetworkRequest(Lcom/shopkick/fetchers/network/NetworkRequest;)Lnet/toddm/comm/SubmittableWork;

    move-result-object v11

    .line 619
    new-instance v12, Lcom/shopkick/fetchers/api/APIManager$APIRequestState;

    move-object v1, v12

    move-object v2, p0

    move/from16 v3, p6

    move-object/from16 v4, p7

    move-object/from16 v5, p8

    move-object/from16 v6, p9

    move-object v7, v11

    move-object/from16 v8, p2

    invoke-direct/range {v1 .. v8}, Lcom/shopkick/fetchers/api/APIManager$APIRequestState;-><init>(Lcom/shopkick/fetchers/api/APIManager;ZLnet/toddm/comm/Priority$StartingPriority;Lnet/toddm/cache/CachePriority;Lnet/toddm/comm/CacheBehavior;Lnet/toddm/comm/SubmittableWork;Lcom/shopkick/fetchers/api/RequestDomainId;)V

    move/from16 v1, p5

    .line 625
    iput-boolean v1, v12, Lcom/shopkick/fetchers/api/APIManager$APIRequestState;->isBackgroundRequest:Z

    .line 626
    iput-object v0, v12, Lcom/shopkick/fetchers/api/APIManager$APIRequestState;->callback:Lcom/shopkick/fetchers/api/IAPICallback;

    .line 627
    iget-object v0, v9, Lcom/shopkick/fetchers/api/APIManager;->apiToAPIRequestStateMap:Ljava/util/HashMap;

    invoke-virtual {v0, v10, v12}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 631
    iget-object v0, v9, Lcom/shopkick/fetchers/api/APIManager;->requestThatModifiesSessionKey:Lcom/shopkick/app/fetchers/api/IAPIObject;

    if-eqz v0, :cond_9

    .line 635
    new-instance v0, Lcom/shopkick/fetchers/AsyncRequestDetails;

    invoke-direct {v0, v11}, Lcom/shopkick/fetchers/AsyncRequestDetails;-><init>(Lnet/toddm/comm/SubmittableWork;)V

    return-object v0

    :cond_9
    if-eqz v14, :cond_a

    .line 638
    invoke-interface {v14}, Lcom/shopkick/comm/IAPIEndpoint;->modifiesSession()Z

    move-result v0

    if-eqz v0, :cond_a

    .line 639
    iput-object v10, v9, Lcom/shopkick/fetchers/api/APIManager;->requestThatModifiesSessionKey:Lcom/shopkick/app/fetchers/api/IAPIObject;

    .line 642
    :cond_a
    iput-object v13, v12, Lcom/shopkick/fetchers/api/APIManager$APIRequestState;->networkRequest:Lcom/shopkick/fetchers/network/NetworkRequest;

    .line 643
    iget-object v0, v9, Lcom/shopkick/fetchers/api/APIManager;->networkRequestToAPIRequestMap:Ljava/util/HashMap;

    invoke-virtual {v0, v13, v10}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    if-eqz p1, :cond_b

    .line 646
    iget-object v0, v9, Lcom/shopkick/fetchers/api/APIManager;->networkManager:Lcom/shopkick/fetchers/network/NetworkManager;

    invoke-virtual {v0, v13, p0, v11}, Lcom/shopkick/fetchers/network/NetworkManager;->fetch(Lcom/shopkick/fetchers/network/NetworkRequest;Lcom/shopkick/fetchers/network/INetworkResponseParseCallback;Lnet/toddm/comm/SubmittableWork;)Lcom/shopkick/fetchers/DataResponse;

    move-result-object v0

    .line 647
    invoke-virtual {p0, v13, v0}, Lcom/shopkick/fetchers/api/APIManager;->receivedResponse(Lcom/shopkick/fetchers/network/NetworkRequest;Lcom/shopkick/fetchers/DataResponse;)V

    return-object v0

    .line 650
    :cond_b
    iget-object v0, v9, Lcom/shopkick/fetchers/api/APIManager;->networkManager:Lcom/shopkick/fetchers/network/NetworkManager;

    invoke-virtual {v0, v13, p0, p0, v11}, Lcom/shopkick/fetchers/network/NetworkManager;->fetch(Lcom/shopkick/fetchers/network/NetworkRequest;Lcom/shopkick/fetchers/network/INetworkResponseParseCallback;Lcom/shopkick/fetchers/network/INetworkRequestFinishedCallback;Lnet/toddm/comm/SubmittableWork;)Lcom/shopkick/fetchers/AsyncRequestDetails;

    move-result-object v0

    return-object v0

    .line 601
    :cond_c
    :goto_4
    new-instance v1, Lcom/shopkick/fetchers/DataResponse;

    const/16 v2, 0x190

    const/4 v3, 0x5

    invoke-direct {v1, v11, v2, v3, v12}, Lcom/shopkick/fetchers/DataResponse;-><init>(ZIILjava/lang/Object;)V

    if-eqz p1, :cond_d

    .line 606
    invoke-virtual {p0, v13, v1}, Lcom/shopkick/fetchers/api/APIManager;->receivedResponse(Lcom/shopkick/fetchers/network/NetworkRequest;Lcom/shopkick/fetchers/DataResponse;)V

    return-object v1

    .line 609
    :cond_d
    invoke-interface {v0, v10, v1}, Lcom/shopkick/fetchers/api/IAPICallback;->receivedResponse(Lcom/shopkick/app/fetchers/api/IAPIObject;Lcom/shopkick/fetchers/DataResponse;)V

    .line 610
    invoke-interface {v0, v10, v1}, Lcom/shopkick/fetchers/api/IAPICallback;->completedResponse(Lcom/shopkick/app/fetchers/api/IAPIObject;Lcom/shopkick/fetchers/DataResponse;)V

    return-object v1

    .line 539
    :cond_e
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "\'cachingBehavior\' can not be null"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 538
    :cond_f
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "\'cachingPriority\' can not be null"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 537
    :cond_10
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "\'requestPriority\' can not be null"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 536
    :cond_11
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "\'apiRequest\' can not be null"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 535
    :cond_12
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "domainId can not be null"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public static getInstance()Lcom/shopkick/fetchers/api/APIManager;
    .locals 2

    .line 217
    sget-object v0, Lcom/shopkick/fetchers/api/APIManager;->Instance:Lcom/shopkick/fetchers/api/APIManager;

    if-eqz v0, :cond_0

    .line 220
    sget-object v0, Lcom/shopkick/fetchers/api/APIManager;->Instance:Lcom/shopkick/fetchers/api/APIManager;

    return-object v0

    .line 218
    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "APIManager.initialize() must be called before APIManager.getInstance()"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method private getRequestDetails(Lcom/shopkick/fetchers/api/RequestDomainId;Ljava/lang/String;)Lcom/shopkick/comm/IAPIEndpoint;
    .locals 4
    .annotation build Landroid/support/annotation/NonNull;
    .end annotation

    const-string v0, "$"

    .line 886
    invoke-virtual {p2, v0}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v0

    const/4 v1, 0x0

    if-nez v0, :cond_0

    .line 887
    iget-object v0, p0, Lcom/shopkick/fetchers/api/APIManager;->apiEndpointsMap:Ljava/util/HashMap;

    new-instance v2, Lcom/shopkick/fetchers/api/APIManager$APIEndpointsMapKey;

    invoke-direct {v2, p0, p1, p2, v1}, Lcom/shopkick/fetchers/api/APIManager$APIEndpointsMapKey;-><init>(Lcom/shopkick/fetchers/api/APIManager;Lcom/shopkick/fetchers/api/RequestDomainId;Ljava/lang/String;Lcom/shopkick/fetchers/api/APIManager$1;)V

    invoke-virtual {v0, v2}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/shopkick/comm/IAPIEndpoint;

    goto :goto_0

    .line 889
    :cond_0
    iget-object v0, p0, Lcom/shopkick/fetchers/api/APIManager;->apiEndpointsMap:Ljava/util/HashMap;

    new-instance v2, Lcom/shopkick/fetchers/api/APIManager$APIEndpointsMapKey;

    const-string v3, "$"

    .line 890
    invoke-virtual {p2, v3}, Ljava/lang/String;->indexOf(Ljava/lang/String;)I

    move-result v3

    add-int/lit8 v3, v3, 0x1

    invoke-virtual {p2, v3}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v3

    invoke-direct {v2, p0, p1, v3, v1}, Lcom/shopkick/fetchers/api/APIManager$APIEndpointsMapKey;-><init>(Lcom/shopkick/fetchers/api/APIManager;Lcom/shopkick/fetchers/api/RequestDomainId;Ljava/lang/String;Lcom/shopkick/fetchers/api/APIManager$1;)V

    .line 889
    invoke-virtual {v0, v2}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/shopkick/comm/IAPIEndpoint;

    :goto_0
    if-eqz p1, :cond_1

    return-object p1

    .line 893
    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string/jumbo v1, "try to call an API that doesn\'t exist : "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public static initialize(Lcom/shopkick/fetchers/network/NetworkManager;Lcom/shopkick/app/application/AppInfo;Lcom/shopkick/app/application/DeveloperInfo;Lcom/shopkick/app/application/Account;ZLandroid/content/Context;Lcom/shopkick/app/util/NotificationCenter;Lcom/shopkick/app/application/LibPreferences;Lcom/shopkick/app/application/SKLogger;)Z
    .locals 12

    .line 269
    sget-object v0, Lcom/shopkick/fetchers/api/APIManager;->Instance:Lcom/shopkick/fetchers/api/APIManager;

    if-nez v0, :cond_1

    .line 270
    sget-object v1, Lcom/shopkick/fetchers/api/APIManager;->InstanceLock:Ljava/lang/Object;

    monitor-enter v1

    .line 271
    :try_start_0
    sget-object v0, Lcom/shopkick/fetchers/api/APIManager;->Instance:Lcom/shopkick/fetchers/api/APIManager;

    if-nez v0, :cond_0

    .line 272
    new-instance v0, Lcom/shopkick/fetchers/api/APIManager;

    move-object v2, v0

    move-object v3, p0

    move-object v4, p1

    move-object v5, p2

    move-object v6, p3

    move/from16 v7, p4

    move-object/from16 v8, p5

    move-object/from16 v9, p6

    move-object/from16 v10, p7

    move-object/from16 v11, p8

    invoke-direct/range {v2 .. v11}, Lcom/shopkick/fetchers/api/APIManager;-><init>(Lcom/shopkick/fetchers/network/NetworkManager;Lcom/shopkick/app/application/AppInfo;Lcom/shopkick/app/application/DeveloperInfo;Lcom/shopkick/app/application/Account;ZLandroid/content/Context;Lcom/shopkick/app/util/NotificationCenter;Lcom/shopkick/app/application/LibPreferences;Lcom/shopkick/app/application/SKLogger;)V

    sput-object v0, Lcom/shopkick/fetchers/api/APIManager;->Instance:Lcom/shopkick/fetchers/api/APIManager;

    const/4 v0, 0x1

    .line 281
    monitor-exit v1

    return v0

    .line 283
    :cond_0
    monitor-exit v1

    goto :goto_0

    :catchall_0
    move-exception v0

    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0

    :cond_1
    :goto_0
    const/4 v0, 0x0

    return v0
.end method

.method private loadDetailsFromFile(I)Lorg/json/JSONObject;
    .locals 4

    const/4 v0, 0x0

    if-nez p1, :cond_0

    return-object v0

    .line 907
    :cond_0
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 911
    :try_start_0
    iget-object v2, p0, Lcom/shopkick/fetchers/api/APIManager;->resources:Landroid/content/res/Resources;

    invoke-virtual {v2, p1}, Landroid/content/res/Resources;->openRawResource(I)Ljava/io/InputStream;

    move-result-object p1

    .line 912
    new-instance v2, Ljava/io/BufferedReader;

    new-instance v3, Ljava/io/InputStreamReader;

    invoke-direct {v3, p1}, Ljava/io/InputStreamReader;-><init>(Ljava/io/InputStream;)V

    invoke-direct {v2, v3}, Ljava/io/BufferedReader;-><init>(Ljava/io/Reader;)V

    .line 915
    :goto_0
    invoke-virtual {v2}, Ljava/io/BufferedReader;->readLine()Ljava/lang/String;

    move-result-object p1

    if-eqz p1, :cond_1

    .line 916
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_0

    .line 918
    :cond_1
    invoke-virtual {v2}, Ljava/io/BufferedReader;->close()V

    .line 920
    new-instance p1, Lorg/json/JSONObject;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {p1, v1}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V
    :try_end_0
    .catch Landroid/content/res/Resources$NotFoundException; {:try_start_0 .. :try_end_0} :catch_2
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_2

    :catch_0
    move-exception p1

    goto :goto_1

    :catch_1
    move-exception p1

    goto :goto_1

    :catch_2
    move-exception p1

    .line 923
    :goto_1
    const-class v1, Lcom/shopkick/fetchers/api/APIManager;

    invoke-virtual {v1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1}, Ljava/lang/Exception;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {v1, p1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    move-object p1, v0

    :goto_2
    return-object p1
.end method

.method private parseResponse(Ljava/lang/Class;[B)Lcom/shopkick/app/fetchers/api/IAPIObject;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Class<",
            "+",
            "Lcom/shopkick/app/fetchers/api/IAPIObject;",
            ">;[B)",
            "Lcom/shopkick/app/fetchers/api/IAPIObject;"
        }
    .end annotation

    .line 1003
    :try_start_0
    new-instance v0, Ljava/lang/String;

    const-string v1, "UTF-8"

    invoke-direct {v0, p2, v1}, Ljava/lang/String;-><init>([BLjava/lang/String;)V

    .line 1005
    sget-object p2, Lcom/shopkick/app/util/GsonUtils;->gson:Lcom/google/gson/Gson;

    invoke-virtual {p2, v0, p1}, Lcom/google/gson/Gson;->fromJson(Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/shopkick/app/fetchers/api/IAPIObject;

    .line 1006
    instance-of p2, p1, Lcom/shopkick/app/fetchers/api/PostProcessable;

    if-eqz p2, :cond_0

    .line 1007
    move-object p2, p1

    check-cast p2, Lcom/shopkick/app/fetchers/api/PostProcessable;

    invoke-interface {p2}, Lcom/shopkick/app/fetchers/api/PostProcessable;->postProcess()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    :cond_0
    return-object p1

    :catch_0
    move-exception p1

    .line 1012
    const-class p2, Lcom/shopkick/fetchers/api/APIManager;

    invoke-virtual {p2}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1}, Ljava/lang/Exception;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {p2, p1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    const/4 p1, 0x0

    return-object p1
.end method

.method private processCommonResponseHandlers(Lcom/shopkick/app/fetchers/api/IAPIObject;)V
    .locals 6

    .line 1200
    iget-object v0, p0, Lcom/shopkick/fetchers/api/APIManager;->apiToAPIRequestStateMap:Ljava/util/HashMap;

    invoke-virtual {v0, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/shopkick/fetchers/api/APIManager$APIRequestState;

    if-nez v0, :cond_0

    return-void

    :cond_0
    const/4 v1, 0x0

    .line 1207
    iget-object v2, v0, Lcom/shopkick/fetchers/api/APIManager$APIRequestState;->response:Lcom/shopkick/fetchers/DataResponse;

    if-eqz v2, :cond_2

    .line 1208
    iget-object v3, v2, Lcom/shopkick/fetchers/DataResponse;->responseData:Ljava/lang/Object;

    instance-of v3, v3, Lcom/shopkick/app/fetchers/api/IAPIResponseObject;

    if-eqz v3, :cond_2

    .line 1209
    iget-object v3, v2, Lcom/shopkick/fetchers/DataResponse;->responseData:Ljava/lang/Object;

    check-cast v3, Lcom/shopkick/app/fetchers/api/IAPIResponseObject;

    invoke-virtual {v3}, Lcom/shopkick/app/fetchers/api/IAPIResponseObject;->commonResponseData()Lcom/shopkick/app/fetchers/api/IAPIObject;

    move-result-object v3

    if-eqz v3, :cond_2

    .line 1211
    iget v4, v0, Lcom/shopkick/fetchers/api/APIManager$APIRequestState;->nextHandlerIndex:I

    :cond_1
    iget-object v5, p0, Lcom/shopkick/fetchers/api/APIManager;->handlerList:Ljava/util/ArrayList;

    invoke-virtual {v5}, Ljava/util/ArrayList;->size()I

    move-result v5

    if-ge v4, v5, :cond_2

    .line 1213
    iget-object v1, p0, Lcom/shopkick/fetchers/api/APIManager;->handlerList:Ljava/util/ArrayList;

    invoke-virtual {v1, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/shopkick/app/fetchers/api/IAPICommonHandler;

    add-int/lit8 v4, v4, 0x1

    .line 1216
    iput v4, v0, Lcom/shopkick/fetchers/api/APIManager$APIRequestState;->nextHandlerIndex:I

    .line 1219
    iget-boolean v5, v0, Lcom/shopkick/fetchers/api/APIManager$APIRequestState;->isBackgroundRequest:Z

    invoke-interface {v1, p0, v3, p1, v5}, Lcom/shopkick/app/fetchers/api/IAPICommonHandler;->handle(Lcom/shopkick/app/fetchers/api/IAPICommonHandlerCallback;Lcom/shopkick/app/fetchers/api/IAPIObject;Lcom/shopkick/app/fetchers/api/IAPIObject;Z)Z

    move-result v1

    if-eqz v1, :cond_1

    :cond_2
    if-nez v1, :cond_4

    .line 1235
    iget-object v0, v0, Lcom/shopkick/fetchers/api/APIManager$APIRequestState;->callback:Lcom/shopkick/fetchers/api/IAPICallback;

    if-eqz v0, :cond_3

    .line 1237
    invoke-interface {v0, p1, v2}, Lcom/shopkick/fetchers/api/IAPICallback;->completedResponse(Lcom/shopkick/app/fetchers/api/IAPIObject;Lcom/shopkick/fetchers/DataResponse;)V

    .line 1239
    :cond_3
    invoke-direct {p0, p1}, Lcom/shopkick/fetchers/api/APIManager;->cleanupAPIRequest(Lcom/shopkick/app/fetchers/api/IAPIObject;)V

    :cond_4
    return-void
.end method

.method private refetchNetworkRequestForAPIRequest(Lcom/shopkick/fetchers/api/RequestDomainId;Lcom/shopkick/app/fetchers/api/IAPIObject;)V
    .locals 13

    .line 697
    iget-object v0, p0, Lcom/shopkick/fetchers/api/APIManager;->apiToAPIRequestStateMap:Ljava/util/HashMap;

    invoke-virtual {v0, p2}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/shopkick/fetchers/api/APIManager$APIRequestState;

    .line 698
    iget-object v1, v0, Lcom/shopkick/fetchers/api/APIManager$APIRequestState;->callback:Lcom/shopkick/fetchers/api/IAPICallback;

    if-nez v1, :cond_0

    .line 701
    invoke-direct {p0, p2}, Lcom/shopkick/fetchers/api/APIManager;->cleanupAPIRequest(Lcom/shopkick/app/fetchers/api/IAPIObject;)V

    return-void

    .line 705
    :cond_0
    iget-object v1, p0, Lcom/shopkick/fetchers/api/APIManager;->apiToAPIRequestStateMap:Ljava/util/HashMap;

    invoke-virtual {v1, p2}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 706
    iget-object v1, v0, Lcom/shopkick/fetchers/api/APIManager$APIRequestState;->networkRequest:Lcom/shopkick/fetchers/network/NetworkRequest;

    if-eqz v1, :cond_1

    .line 707
    iget-object v1, p0, Lcom/shopkick/fetchers/api/APIManager;->networkRequestToAPIRequestMap:Ljava/util/HashMap;

    iget-object v2, v0, Lcom/shopkick/fetchers/api/APIManager$APIRequestState;->networkRequest:Lcom/shopkick/fetchers/network/NetworkRequest;

    invoke-virtual {v1, v2}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    :cond_1
    const/4 v4, 0x0

    .line 710
    iget-object v7, v0, Lcom/shopkick/fetchers/api/APIManager$APIRequestState;->callback:Lcom/shopkick/fetchers/api/IAPICallback;

    iget-boolean v8, v0, Lcom/shopkick/fetchers/api/APIManager$APIRequestState;->isBackgroundRequest:Z

    .line 715
    invoke-virtual {v0}, Lcom/shopkick/fetchers/api/APIManager$APIRequestState;->isIdempotent()Z

    move-result v9

    .line 716
    invoke-virtual {v0}, Lcom/shopkick/fetchers/api/APIManager$APIRequestState;->getRequestPriority()Lnet/toddm/comm/Priority$StartingPriority;

    move-result-object v10

    .line 717
    invoke-virtual {v0}, Lcom/shopkick/fetchers/api/APIManager$APIRequestState;->getCachingPriority()Lnet/toddm/cache/CachePriority;

    move-result-object v11

    .line 718
    invoke-virtual {v0}, Lcom/shopkick/fetchers/api/APIManager$APIRequestState;->getCachingBehavior()Lnet/toddm/comm/CacheBehavior;

    move-result-object v12

    move-object v3, p0

    move-object v5, p1

    move-object v6, p2

    .line 710
    invoke-direct/range {v3 .. v12}, Lcom/shopkick/fetchers/api/APIManager;->fetch(ZLcom/shopkick/fetchers/api/RequestDomainId;Lcom/shopkick/app/fetchers/api/IAPIObject;Lcom/shopkick/fetchers/api/IAPICallback;ZZLnet/toddm/comm/Priority$StartingPriority;Lnet/toddm/cache/CachePriority;Lnet/toddm/comm/CacheBehavior;)Lcom/shopkick/fetchers/RequestDetails;

    return-void
.end method

.method private resumeSuspendedRequests()V
    .locals 5

    .line 1144
    iget-object v0, p0, Lcom/shopkick/fetchers/api/APIManager;->requestThatModifiesSessionKey:Lcom/shopkick/app/fetchers/api/IAPIObject;

    const/4 v1, 0x0

    .line 1145
    iput-object v1, p0, Lcom/shopkick/fetchers/api/APIManager;->requestThatModifiesSessionKey:Lcom/shopkick/app/fetchers/api/IAPIObject;

    .line 1149
    iget-object v1, p0, Lcom/shopkick/fetchers/api/APIManager;->apiToAPIRequestStateMap:Ljava/util/HashMap;

    invoke-virtual {v1}, Ljava/util/HashMap;->clone()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/HashMap;

    invoke-virtual {v1}, Ljava/util/HashMap;->keySet()Ljava/util/Set;

    move-result-object v1

    .line 1150
    invoke-interface {v1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_0
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_3

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/shopkick/app/fetchers/api/IAPIObject;

    if-ne v0, v2, :cond_1

    goto :goto_0

    .line 1154
    :cond_1
    iget-object v3, p0, Lcom/shopkick/fetchers/api/APIManager;->apiToAPIRequestStateMap:Ljava/util/HashMap;

    invoke-virtual {v3, v2}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/shopkick/fetchers/api/APIManager$APIRequestState;

    .line 1155
    iget-object v4, v3, Lcom/shopkick/fetchers/api/APIManager$APIRequestState;->response:Lcom/shopkick/fetchers/DataResponse;

    if-eqz v4, :cond_2

    .line 1156
    invoke-virtual {p0, v2}, Lcom/shopkick/fetchers/api/APIManager;->executeCallbacksForRequest(Lcom/shopkick/app/fetchers/api/IAPIObject;)V

    goto :goto_0

    .line 1157
    :cond_2
    iget-object v4, v3, Lcom/shopkick/fetchers/api/APIManager$APIRequestState;->networkRequest:Lcom/shopkick/fetchers/network/NetworkRequest;

    if-nez v4, :cond_0

    .line 1158
    invoke-virtual {v3}, Lcom/shopkick/fetchers/api/APIManager$APIRequestState;->getRequestDomainId()Lcom/shopkick/fetchers/api/RequestDomainId;

    move-result-object v3

    invoke-direct {p0, v3, v2}, Lcom/shopkick/fetchers/api/APIManager;->refetchNetworkRequestForAPIRequest(Lcom/shopkick/fetchers/api/RequestDomainId;Lcom/shopkick/app/fetchers/api/IAPIObject;)V

    goto :goto_0

    :cond_3
    return-void
.end method


# virtual methods
.method public appFetch(Lcom/shopkick/app/fetchers/api/IAPIObject;Lcom/shopkick/fetchers/api/IAPICallback;)Lcom/shopkick/fetchers/RequestDetails;
    .locals 10

    .line 1367
    sget-object v2, Lcom/shopkick/fetchers/api/RequestDomainId;->SHOPKICK_APP:Lcom/shopkick/fetchers/api/RequestDomainId;

    sget-object v7, Lnet/toddm/comm/Priority$StartingPriority;->MEDIUM:Lnet/toddm/comm/Priority$StartingPriority;

    sget-object v8, Lnet/toddm/cache/CachePriority;->NORMAL:Lnet/toddm/cache/CachePriority;

    sget-object v9, Lnet/toddm/comm/CacheBehavior;->DO_NOT_CACHE:Lnet/toddm/comm/CacheBehavior;

    const/4 v1, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    move-object v0, p0

    move-object v3, p1

    move-object v4, p2

    invoke-direct/range {v0 .. v9}, Lcom/shopkick/fetchers/api/APIManager;->fetch(ZLcom/shopkick/fetchers/api/RequestDomainId;Lcom/shopkick/app/fetchers/api/IAPIObject;Lcom/shopkick/fetchers/api/IAPICallback;ZZLnet/toddm/comm/Priority$StartingPriority;Lnet/toddm/cache/CachePriority;Lnet/toddm/comm/CacheBehavior;)Lcom/shopkick/fetchers/RequestDetails;

    move-result-object p1

    return-object p1
.end method

.method public appFetch(Lcom/shopkick/app/fetchers/api/IAPIObject;Lcom/shopkick/fetchers/api/IAPICallback;Z)Lcom/shopkick/fetchers/RequestDetails;
    .locals 10

    .line 1382
    sget-object v2, Lcom/shopkick/fetchers/api/RequestDomainId;->SHOPKICK_APP:Lcom/shopkick/fetchers/api/RequestDomainId;

    sget-object v7, Lnet/toddm/comm/Priority$StartingPriority;->MEDIUM:Lnet/toddm/comm/Priority$StartingPriority;

    sget-object v8, Lnet/toddm/cache/CachePriority;->NORMAL:Lnet/toddm/cache/CachePriority;

    sget-object v9, Lnet/toddm/comm/CacheBehavior;->DO_NOT_CACHE:Lnet/toddm/comm/CacheBehavior;

    const/4 v1, 0x0

    const/4 v5, 0x0

    move-object v0, p0

    move-object v3, p1

    move-object v4, p2

    move v6, p3

    invoke-direct/range {v0 .. v9}, Lcom/shopkick/fetchers/api/APIManager;->fetch(ZLcom/shopkick/fetchers/api/RequestDomainId;Lcom/shopkick/app/fetchers/api/IAPIObject;Lcom/shopkick/fetchers/api/IAPICallback;ZZLnet/toddm/comm/Priority$StartingPriority;Lnet/toddm/cache/CachePriority;Lnet/toddm/comm/CacheBehavior;)Lcom/shopkick/fetchers/RequestDetails;

    move-result-object p1

    return-object p1
.end method

.method public buildDataResponseForApiRequestAndWork(Lcom/shopkick/fetchers/api/RequestDomainId;Lcom/shopkick/app/fetchers/api/IAPIObject;Lnet/toddm/comm/Work;)Lcom/shopkick/fetchers/DataResponse;
    .locals 3

    .line 1338
    :try_start_0
    invoke-interface {p3}, Lnet/toddm/comm/Work;->get()Lnet/toddm/comm/Response;

    move-result-object v0

    .line 1339
    invoke-virtual {v0}, Lnet/toddm/comm/Response;->getResponseCode()Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    const/16 v2, 0x191

    if-ne v1, v2, :cond_0

    .line 1341
    const-class p1, Lcom/shopkick/fetchers/auth/AuthErrorResponse;

    invoke-virtual {v0}, Lnet/toddm/comm/Response;->getResponseBytes()[B

    move-result-object p2

    invoke-direct {p0, p1, p2}, Lcom/shopkick/fetchers/api/APIManager;->parseResponse(Ljava/lang/Class;[B)Lcom/shopkick/app/fetchers/api/IAPIObject;

    move-result-object p1

    goto :goto_0

    .line 1344
    :cond_0
    invoke-virtual {v0}, Lnet/toddm/comm/Response;->getResponseBytes()[B

    move-result-object v0

    invoke-virtual {p0, p1, p2, v0}, Lcom/shopkick/fetchers/api/APIManager;->parseResponse(Lcom/shopkick/fetchers/api/RequestDomainId;Lcom/shopkick/app/fetchers/api/IAPIObject;[B)Lcom/shopkick/app/fetchers/api/IAPIObject;

    move-result-object p1
    :try_end_0
    .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0

    :goto_0
    const/4 p2, 0x0

    goto :goto_1

    :catch_0
    move-exception p1

    .line 1347
    const-class p2, Lcom/shopkick/fetchers/api/APIManager;

    invoke-virtual {p2}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1}, Ljava/lang/Throwable;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {p2, p1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    const/4 p2, 0x1

    const/4 p1, 0x0

    .line 1351
    :goto_1
    iget-object v0, p0, Lcom/shopkick/fetchers/api/APIManager;->networkManager:Lcom/shopkick/fetchers/network/NetworkManager;

    invoke-virtual {v0, p3, p1, p2}, Lcom/shopkick/fetchers/network/NetworkManager;->buildDataResponseFromCommWork(Lnet/toddm/comm/Work;Ljava/lang/Object;I)Lcom/shopkick/fetchers/DataResponse;

    move-result-object p1

    return-object p1
.end method

.method public buildNetworkRequest(Lcom/shopkick/fetchers/api/RequestDomainId;Lcom/shopkick/app/fetchers/api/IAPIObject;ZLnet/toddm/comm/Priority$StartingPriority;Lnet/toddm/cache/CachePriority;Lnet/toddm/comm/CacheBehavior;)Lcom/shopkick/fetchers/network/NetworkRequest;
    .locals 16

    move-object/from16 v1, p0

    .line 731
    invoke-virtual/range {p2 .. p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v0

    move-object/from16 v4, p1

    invoke-direct {v1, v4, v0}, Lcom/shopkick/fetchers/api/APIManager;->getRequestDetails(Lcom/shopkick/fetchers/api/RequestDomainId;Ljava/lang/String;)Lcom/shopkick/comm/IAPIEndpoint;

    move-result-object v0

    .line 733
    new-instance v12, Landroid/net/Uri$Builder;

    invoke-direct {v12}, Landroid/net/Uri$Builder;-><init>()V

    const/4 v13, 0x0

    .line 738
    :try_start_0
    invoke-direct {v1, v12, v0}, Lcom/shopkick/fetchers/api/APIManager;->buildURLString(Landroid/net/Uri$Builder;Lcom/shopkick/comm/IAPIEndpoint;)V

    .line 739
    sget-object v2, Lnet/toddm/comm/Request$RequestMethod;->GET:Lnet/toddm/comm/Request$RequestMethod;

    .line 740
    invoke-interface {v0}, Lcom/shopkick/comm/IAPIEndpoint;->usePost()Z

    move-result v3

    if-eqz v3, :cond_0

    .line 741
    sget-object v2, Lnet/toddm/comm/Request$RequestMethod;->POST:Lnet/toddm/comm/Request$RequestMethod;

    move-object v5, v2

    goto :goto_0

    :cond_0
    move-object v5, v2

    .line 743
    :goto_0
    invoke-interface {v0}, Lcom/shopkick/comm/IAPIEndpoint;->getAuthenticationType()I

    move-result v7

    .line 744
    invoke-static/range {p2 .. p2}, Lcom/shopkick/app/util/GsonUtils;->getParams(Lcom/shopkick/app/fetchers/api/IAPIObject;)Ljava/util/ArrayList;

    move-result-object v14

    if-nez v7, :cond_1

    .line 747
    new-instance v15, Lcom/shopkick/fetchers/network/NetworkRequest;

    const/4 v6, 0x0

    const/4 v8, 0x0

    move-object v2, v15

    move-object/from16 v3, p1

    move-object v4, v6

    move-object v6, v8

    move/from16 v8, p3

    move-object/from16 v9, p4

    move-object/from16 v10, p5

    move-object/from16 v11, p6

    invoke-direct/range {v2 .. v11}, Lcom/shopkick/fetchers/network/NetworkRequest;-><init>(Lcom/shopkick/fetchers/api/RequestDomainId;Ljava/lang/String;Lnet/toddm/comm/Request$RequestMethod;Ljava/lang/String;IZLnet/toddm/comm/Priority$StartingPriority;Lnet/toddm/cache/CachePriority;Lnet/toddm/comm/CacheBehavior;)V

    goto/16 :goto_1

    :cond_1
    const/4 v2, 0x1

    if-ne v7, v2, :cond_2

    .line 757
    iget-object v2, v1, Lcom/shopkick/fetchers/api/APIManager;->userAcct:Lcom/shopkick/app/application/Account;

    if-eqz v2, :cond_4

    iget-object v2, v1, Lcom/shopkick/fetchers/api/APIManager;->userAcct:Lcom/shopkick/app/application/Account;

    invoke-virtual {v2}, Lcom/shopkick/app/application/Account;->accountExists()Z

    move-result v2

    if-eqz v2, :cond_4

    .line 758
    new-instance v15, Lcom/shopkick/fetchers/api/AuthenticatedRequest;

    iget-object v2, v1, Lcom/shopkick/fetchers/api/APIManager;->userAcct:Lcom/shopkick/app/application/Account;

    invoke-virtual {v2}, Lcom/shopkick/app/application/Account;->getSessionKey()[B

    move-result-object v3

    const/4 v6, 0x0

    move-object v2, v15

    move-object/from16 v4, p1

    move/from16 v8, p3

    move-object/from16 v9, p4

    move-object/from16 v10, p5

    move-object/from16 v11, p6

    invoke-direct/range {v2 .. v11}, Lcom/shopkick/fetchers/api/AuthenticatedRequest;-><init>([BLcom/shopkick/fetchers/api/RequestDomainId;Lnet/toddm/comm/Request$RequestMethod;Ljava/lang/String;IZLnet/toddm/comm/Priority$StartingPriority;Lnet/toddm/cache/CachePriority;Lnet/toddm/comm/CacheBehavior;)V

    .line 767
    iget-object v2, v1, Lcom/shopkick/fetchers/api/APIManager;->serverToken:Ljava/lang/String;

    if-eqz v2, :cond_5

    const-string v2, "X-K"

    .line 771
    iget-object v3, v1, Lcom/shopkick/fetchers/api/APIManager;->serverToken:Ljava/lang/String;

    invoke-virtual {v15, v2, v3}, Lcom/shopkick/fetchers/network/NetworkRequest;->addHeader(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_1

    :cond_2
    const/4 v2, 0x3

    if-ne v7, v2, :cond_3

    .line 775
    iget-object v2, v1, Lcom/shopkick/fetchers/api/APIManager;->developerInfo:Lcom/shopkick/app/application/DeveloperInfo;

    invoke-virtual {v2}, Lcom/shopkick/app/application/DeveloperInfo;->getInfo()[B

    move-result-object v3

    .line 776
    new-instance v15, Lcom/shopkick/fetchers/api/AuthenticatedRequest;

    const/4 v6, 0x0

    move-object v2, v15

    move-object/from16 v4, p1

    move/from16 v8, p3

    move-object/from16 v9, p4

    move-object/from16 v10, p5

    move-object/from16 v11, p6

    invoke-direct/range {v2 .. v11}, Lcom/shopkick/fetchers/api/AuthenticatedRequest;-><init>([BLcom/shopkick/fetchers/api/RequestDomainId;Lnet/toddm/comm/Request$RequestMethod;Ljava/lang/String;IZLnet/toddm/comm/Priority$StartingPriority;Lnet/toddm/cache/CachePriority;Lnet/toddm/comm/CacheBehavior;)V

    goto :goto_1

    .line 786
    :cond_3
    iget-object v2, v1, Lcom/shopkick/fetchers/api/APIManager;->appInfo:Lcom/shopkick/app/application/AppInfo;

    if-eqz v2, :cond_4

    .line 787
    new-instance v15, Lcom/shopkick/fetchers/api/AuthenticatedRequest;

    iget-object v2, v1, Lcom/shopkick/fetchers/api/APIManager;->appInfo:Lcom/shopkick/app/application/AppInfo;

    invoke-virtual {v2}, Lcom/shopkick/app/application/AppInfo;->getInfo()[B

    move-result-object v3

    const/4 v6, 0x0

    move-object v2, v15

    move-object/from16 v4, p1

    move/from16 v8, p3

    move-object/from16 v9, p4

    move-object/from16 v10, p5

    move-object/from16 v11, p6

    invoke-direct/range {v2 .. v11}, Lcom/shopkick/fetchers/api/AuthenticatedRequest;-><init>([BLcom/shopkick/fetchers/api/RequestDomainId;Lnet/toddm/comm/Request$RequestMethod;Ljava/lang/String;IZLnet/toddm/comm/Priority$StartingPriority;Lnet/toddm/cache/CachePriority;Lnet/toddm/comm/CacheBehavior;)V

    goto :goto_1

    :cond_4
    move-object v15, v13

    :cond_5
    :goto_1
    if-eqz v15, :cond_6

    .line 800
    invoke-virtual {v15, v12, v14}, Lcom/shopkick/fetchers/network/NetworkRequest;->populateURL(Landroid/net/Uri$Builder;Ljava/util/ArrayList;)V

    .line 801
    invoke-interface {v0}, Lcom/shopkick/comm/IAPIEndpoint;->getPath()Ljava/lang/String;

    move-result-object v0

    iput-object v0, v15, Lcom/shopkick/fetchers/network/NetworkRequest;->requestPath:Ljava/lang/String;
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_2
    .catch Lnet/toddm/comm/CommException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_0

    :cond_6
    move-object v13, v15

    goto :goto_3

    :catch_0
    move-exception v0

    goto :goto_2

    :catch_1
    move-exception v0

    goto :goto_2

    :catch_2
    move-exception v0

    .line 805
    :goto_2
    const-class v2, Lcom/shopkick/fetchers/api/APIManager;

    invoke-virtual {v2}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0}, Ljava/lang/Exception;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v2, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    :goto_3
    return-object v13
.end method

.method public cancel(Lcom/shopkick/app/fetchers/api/IAPIObject;Lcom/shopkick/fetchers/api/IAPICallback;)V
    .locals 2

    if-eqz p1, :cond_6

    if-nez p2, :cond_0

    goto :goto_1

    .line 666
    :cond_0
    iget-object v0, p0, Lcom/shopkick/fetchers/api/APIManager;->apiToAPIRequestStateMap:Ljava/util/HashMap;

    invoke-virtual {v0, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/shopkick/fetchers/api/APIManager$APIRequestState;

    if-nez v0, :cond_1

    return-void

    .line 671
    :cond_1
    iget-object v1, p0, Lcom/shopkick/fetchers/api/APIManager;->requestThatModifiesSessionKey:Lcom/shopkick/app/fetchers/api/IAPIObject;

    if-ne v1, p1, :cond_2

    .line 674
    invoke-direct {p0}, Lcom/shopkick/fetchers/api/APIManager;->resumeSuspendedRequests()V

    .line 677
    :cond_2
    iget-object v1, v0, Lcom/shopkick/fetchers/api/APIManager$APIRequestState;->callback:Lcom/shopkick/fetchers/api/IAPICallback;

    if-eqz v1, :cond_5

    .line 678
    invoke-virtual {v1, p2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result p2

    if-eqz p2, :cond_5

    .line 679
    iget-object p2, v0, Lcom/shopkick/fetchers/api/APIManager$APIRequestState;->response:Lcom/shopkick/fetchers/DataResponse;

    if-nez p2, :cond_4

    .line 681
    iget-object p2, v0, Lcom/shopkick/fetchers/api/APIManager$APIRequestState;->networkRequest:Lcom/shopkick/fetchers/network/NetworkRequest;

    if-eqz p2, :cond_3

    .line 683
    iget-object v0, p0, Lcom/shopkick/fetchers/api/APIManager;->networkManager:Lcom/shopkick/fetchers/network/NetworkManager;

    invoke-virtual {v0, p2}, Lcom/shopkick/fetchers/network/NetworkManager;->cancel(Lcom/shopkick/fetchers/network/NetworkRequest;)V

    .line 685
    :cond_3
    invoke-direct {p0, p1}, Lcom/shopkick/fetchers/api/APIManager;->cleanupAPIRequest(Lcom/shopkick/app/fetchers/api/IAPIObject;)V

    goto :goto_0

    :cond_4
    const/4 p1, 0x0

    .line 691
    iput-object p1, v0, Lcom/shopkick/fetchers/api/APIManager$APIRequestState;->callback:Lcom/shopkick/fetchers/api/IAPICallback;

    :cond_5
    :goto_0
    return-void

    :cond_6
    :goto_1
    return-void
.end method

.method public executeCallbacksForRequest(Lcom/shopkick/app/fetchers/api/IAPIObject;)V
    .locals 3

    .line 1111
    iget-object v0, p0, Lcom/shopkick/fetchers/api/APIManager;->apiToAPIRequestStateMap:Ljava/util/HashMap;

    invoke-virtual {v0, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/shopkick/fetchers/api/APIManager$APIRequestState;

    .line 1114
    iget-object v1, p0, Lcom/shopkick/fetchers/api/APIManager;->userAcct:Lcom/shopkick/app/application/Account;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v1

    const-string v2, ".SDKUser"

    invoke-virtual {v1, v2}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    move-result v1

    if-nez v1, :cond_2

    .line 1117
    iget-object v1, v0, Lcom/shopkick/fetchers/api/APIManager$APIRequestState;->response:Lcom/shopkick/fetchers/DataResponse;

    const-string v2, "X-Token"

    invoke-virtual {v1, v2}, Lcom/shopkick/fetchers/DataResponse;->getHeader(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    if-eqz v1, :cond_0

    .line 1118
    iget-object v2, p0, Lcom/shopkick/fetchers/api/APIManager;->libPrefs:Lcom/shopkick/app/application/LibPreferences;

    if-eqz v2, :cond_0

    iget-object v2, p0, Lcom/shopkick/fetchers/api/APIManager;->serverToken:Ljava/lang/String;

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_0

    .line 1119
    iget-object v2, p0, Lcom/shopkick/fetchers/api/APIManager;->libPrefs:Lcom/shopkick/app/application/LibPreferences;

    invoke-virtual {v2, v1}, Lcom/shopkick/app/application/LibPreferences;->setAPIManagerToken(Ljava/lang/String;)V

    .line 1120
    iput-object v1, p0, Lcom/shopkick/fetchers/api/APIManager;->serverToken:Ljava/lang/String;

    .line 1124
    :cond_0
    iget-object v1, v0, Lcom/shopkick/fetchers/api/APIManager$APIRequestState;->response:Lcom/shopkick/fetchers/DataResponse;

    const-string v2, "X-Auth-Error"

    invoke-virtual {v1, v2}, Lcom/shopkick/fetchers/DataResponse;->getHeader(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    if-eqz v1, :cond_1

    const/4 v1, 0x1

    goto :goto_0

    :cond_1
    const/4 v1, 0x0

    :goto_0
    if-eqz v1, :cond_2

    .line 1126
    iget-object v1, p0, Lcom/shopkick/fetchers/api/APIManager;->notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

    const-string v2, "APIManagerAuthenticationFailedEvent"

    invoke-virtual {v1, v2}, Lcom/shopkick/app/util/NotificationCenter;->notifyEvent(Ljava/lang/String;)Ljava/util/List;

    .line 1130
    :cond_2
    iget-object v1, v0, Lcom/shopkick/fetchers/api/APIManager$APIRequestState;->callback:Lcom/shopkick/fetchers/api/IAPICallback;

    if-eqz v1, :cond_3

    .line 1132
    iget-object v0, v0, Lcom/shopkick/fetchers/api/APIManager$APIRequestState;->response:Lcom/shopkick/fetchers/DataResponse;

    invoke-interface {v1, p1, v0}, Lcom/shopkick/fetchers/api/IAPICallback;->receivedResponse(Lcom/shopkick/app/fetchers/api/IAPIObject;Lcom/shopkick/fetchers/DataResponse;)V

    .line 1136
    :cond_3
    invoke-direct {p0, p1}, Lcom/shopkick/fetchers/api/APIManager;->processCommonResponseHandlers(Lcom/shopkick/app/fetchers/api/IAPIObject;)V

    return-void
.end method

.method public fetch(Lcom/shopkick/fetchers/api/RequestDomainId;Lcom/shopkick/app/fetchers/api/IAPIObject;Lcom/shopkick/fetchers/api/IAPICallback;ZLnet/toddm/comm/Priority$StartingPriority;Lnet/toddm/cache/CachePriority;Lnet/toddm/comm/CacheBehavior;)Lcom/shopkick/fetchers/RequestDetails;
    .locals 10

    const/4 v1, 0x0

    const/4 v5, 0x0

    move-object v0, p0

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move v6, p4

    move-object v7, p5

    move-object/from16 v8, p6

    move-object/from16 v9, p7

    .line 425
    invoke-direct/range {v0 .. v9}, Lcom/shopkick/fetchers/api/APIManager;->fetch(ZLcom/shopkick/fetchers/api/RequestDomainId;Lcom/shopkick/app/fetchers/api/IAPIObject;Lcom/shopkick/fetchers/api/IAPICallback;ZZLnet/toddm/comm/Priority$StartingPriority;Lnet/toddm/cache/CachePriority;Lnet/toddm/comm/CacheBehavior;)Lcom/shopkick/fetchers/RequestDetails;

    move-result-object v0

    return-object v0
.end method

.method public fetchAndRecordByType(Lcom/shopkick/fetchers/api/RequestDomainId;Lcom/shopkick/app/fetchers/api/IAPIObject;Lcom/shopkick/fetchers/api/IAPICallback;ZLnet/toddm/comm/Priority$StartingPriority;Lnet/toddm/cache/CachePriority;Lnet/toddm/comm/CacheBehavior;)Lcom/shopkick/fetchers/RequestDetails;
    .locals 1

    .line 438
    sget-object v0, Lnet/toddm/comm/CacheBehavior;->DO_NOT_CACHE:Lnet/toddm/comm/CacheBehavior;

    if-eq p7, v0, :cond_0

    .line 442
    sget-object v0, Lcom/shopkick/fetchers/api/APIManager;->_RequestTypeIDMapAccessLock:Ljava/lang/Object;

    monitor-enter v0

    .line 443
    :try_start_0
    invoke-virtual/range {p0 .. p7}, Lcom/shopkick/fetchers/api/APIManager;->fetch(Lcom/shopkick/fetchers/api/RequestDomainId;Lcom/shopkick/app/fetchers/api/IAPIObject;Lcom/shopkick/fetchers/api/IAPICallback;ZLnet/toddm/comm/Priority$StartingPriority;Lnet/toddm/cache/CachePriority;Lnet/toddm/comm/CacheBehavior;)Lcom/shopkick/fetchers/RequestDetails;

    move-result-object p1

    .line 450
    invoke-interface {p1}, Lcom/shopkick/fetchers/RequestDetails;->getRequestWork()Lnet/toddm/comm/SubmittableWork;

    move-result-object p3

    invoke-interface {p3}, Lnet/toddm/comm/SubmittableWork;->getId()I

    move-result p3

    .line 451
    iget-object p4, p0, Lcom/shopkick/fetchers/api/APIManager;->requestTypeIDMapProvider:Lcom/shopkick/fetchers/api/RequestTypeIDMapProvider;

    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object p2

    int-to-long p5, p3

    invoke-virtual {p4, p2, p5, p6}, Lcom/shopkick/fetchers/api/RequestTypeIDMapProvider;->add(Ljava/lang/Class;J)Z

    .line 452
    monitor-exit v0

    return-object p1

    :catchall_0
    move-exception p1

    .line 453
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1

    .line 439
    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "Trying to record a fetchtype and id that should not be cached."

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public fetchInBackground(Lcom/shopkick/fetchers/api/RequestDomainId;Lcom/shopkick/app/fetchers/api/IAPIObject;Lcom/shopkick/fetchers/api/IAPICallback;ZLnet/toddm/comm/Priority$StartingPriority;Lnet/toddm/cache/CachePriority;Lnet/toddm/comm/CacheBehavior;)Lcom/shopkick/fetchers/RequestDetails;
    .locals 10

    const/4 v1, 0x0

    const/4 v5, 0x1

    move-object v0, p0

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move v6, p4

    move-object v7, p5

    move-object/from16 v8, p6

    move-object/from16 v9, p7

    .line 489
    invoke-direct/range {v0 .. v9}, Lcom/shopkick/fetchers/api/APIManager;->fetch(ZLcom/shopkick/fetchers/api/RequestDomainId;Lcom/shopkick/app/fetchers/api/IAPIObject;Lcom/shopkick/fetchers/api/IAPICallback;ZZLnet/toddm/comm/Priority$StartingPriority;Lnet/toddm/cache/CachePriority;Lnet/toddm/comm/CacheBehavior;)Lcom/shopkick/fetchers/RequestDetails;

    move-result-object v0

    return-object v0
.end method

.method public fetchSynchronous(Lcom/shopkick/fetchers/api/RequestDomainId;Lcom/shopkick/app/fetchers/api/IAPIObject;ZLnet/toddm/comm/Priority$StartingPriority;Lnet/toddm/cache/CachePriority;Lnet/toddm/comm/CacheBehavior;)Lcom/shopkick/fetchers/DataResponse;
    .locals 10

    const/4 v1, 0x1

    const/4 v4, 0x0

    const/4 v5, 0x0

    move-object v0, p0

    move-object v2, p1

    move-object v3, p2

    move v6, p3

    move-object v7, p4

    move-object v8, p5

    move-object/from16 v9, p6

    .line 377
    invoke-direct/range {v0 .. v9}, Lcom/shopkick/fetchers/api/APIManager;->fetch(ZLcom/shopkick/fetchers/api/RequestDomainId;Lcom/shopkick/app/fetchers/api/IAPIObject;Lcom/shopkick/fetchers/api/IAPICallback;ZZLnet/toddm/comm/Priority$StartingPriority;Lnet/toddm/cache/CachePriority;Lnet/toddm/comm/CacheBehavior;)Lcom/shopkick/fetchers/RequestDetails;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 387
    instance-of v1, v0, Lcom/shopkick/fetchers/DataResponse;

    if-eqz v1, :cond_0

    .line 388
    check-cast v0, Lcom/shopkick/fetchers/DataResponse;

    return-object v0

    :cond_0
    const/4 v0, 0x0

    return-object v0
.end method

.method public finishedProcessing(Lcom/shopkick/app/fetchers/api/IAPIObject;)V
    .locals 0

    if-eqz p1, :cond_0

    .line 1195
    invoke-direct {p0, p1}, Lcom/shopkick/fetchers/api/APIManager;->processCommonResponseHandlers(Lcom/shopkick/app/fetchers/api/IAPIObject;)V

    :cond_0
    return-void
.end method

.method public isBackgroundEnabled()Z
    .locals 1

    .line 1318
    iget-object v0, p0, Lcom/shopkick/fetchers/api/APIManager;->networkManager:Lcom/shopkick/fetchers/network/NetworkManager;

    invoke-virtual {v0}, Lcom/shopkick/fetchers/network/NetworkManager;->isBackgroundEnabled()Z

    move-result v0

    return v0
.end method

.method public parse401Response([B)Lcom/shopkick/app/fetchers/api/IAPIObject;
    .locals 1

    if-nez p1, :cond_0

    const/4 p1, 0x0

    return-object p1

    .line 973
    :cond_0
    const-class v0, Lcom/shopkick/fetchers/auth/AuthErrorResponse;

    invoke-direct {p0, v0, p1}, Lcom/shopkick/fetchers/api/APIManager;->parseResponse(Ljava/lang/Class;[B)Lcom/shopkick/app/fetchers/api/IAPIObject;

    move-result-object p1

    return-object p1
.end method

.method public parseResponse(Lcom/shopkick/fetchers/api/RequestDomainId;Lcom/shopkick/app/fetchers/api/IAPIObject;[B)Lcom/shopkick/app/fetchers/api/IAPIObject;
    .locals 3

    const/4 v0, 0x0

    if-eqz p2, :cond_1

    if-eqz p3, :cond_1

    .line 981
    array-length v1, p3

    if-gtz v1, :cond_0

    goto :goto_1

    .line 986
    :cond_0
    :try_start_0
    new-instance v1, Ljava/lang/String;

    const-string v2, "UTF-8"

    invoke-direct {v1, p3, v2}, Ljava/lang/String;-><init>([BLjava/lang/String;)V

    .line 987
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object p2

    invoke-virtual {p2}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p0, p1, p2}, Lcom/shopkick/fetchers/api/APIManager;->getRequestDetails(Lcom/shopkick/fetchers/api/RequestDomainId;Ljava/lang/String;)Lcom/shopkick/comm/IAPIEndpoint;

    move-result-object p1

    .line 988
    invoke-interface {p1}, Lcom/shopkick/comm/IAPIEndpoint;->getResponseClass()Ljava/lang/String;

    move-result-object p1

    .line 989
    invoke-static {p1}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object p1

    .line 990
    invoke-direct {p0, p1, p3}, Lcom/shopkick/fetchers/api/APIManager;->parseResponse(Ljava/lang/Class;[B)Lcom/shopkick/app/fetchers/api/IAPIObject;

    move-result-object p1
    :try_end_0
    .catch Ljava/lang/ClassNotFoundException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/io/UnsupportedEncodingException; {:try_start_0 .. :try_end_0} :catch_0

    return-object p1

    :catch_0
    move-exception p1

    goto :goto_0

    :catch_1
    move-exception p1

    .line 992
    :goto_0
    const-class p2, Lcom/shopkick/fetchers/api/APIManager;

    invoke-virtual {p2}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1}, Ljava/lang/Exception;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {p2, p1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    return-object v0

    :cond_1
    :goto_1
    return-object v0
.end method

.method public parseResponse(Lcom/shopkick/fetchers/network/NetworkRequest;[B)Lcom/shopkick/app/fetchers/api/IAPIObject;
    .locals 3

    const/4 v0, 0x0

    if-eqz p1, :cond_3

    if-nez p2, :cond_0

    goto :goto_0

    .line 950
    :cond_0
    iget-object v1, p0, Lcom/shopkick/fetchers/api/APIManager;->networkRequestToAPIRequestMap:Ljava/util/HashMap;

    invoke-virtual {v1, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/shopkick/app/fetchers/api/IAPIObject;

    if-nez v1, :cond_1

    return-object v0

    .line 955
    :cond_1
    iget-object v2, p0, Lcom/shopkick/fetchers/api/APIManager;->apiToAPIRequestStateMap:Ljava/util/HashMap;

    invoke-virtual {v2, v1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/shopkick/fetchers/api/APIManager$APIRequestState;

    if-nez v2, :cond_2

    return-object v0

    .line 960
    :cond_2
    iget-object p1, p1, Lcom/shopkick/fetchers/network/NetworkRequest;->domainId:Lcom/shopkick/fetchers/api/RequestDomainId;

    invoke-virtual {p0, p1, v1, p2}, Lcom/shopkick/fetchers/api/APIManager;->parseResponse(Lcom/shopkick/fetchers/api/RequestDomainId;Lcom/shopkick/app/fetchers/api/IAPIObject;[B)Lcom/shopkick/app/fetchers/api/IAPIObject;

    move-result-object p1

    return-object p1

    :cond_3
    :goto_0
    return-object v0
.end method

.method public purgeCacheByRequestType(Ljava/lang/Class;)I
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Class<",
            "+",
            "Lcom/shopkick/app/fetchers/api/IAPIObject;",
            ">;)I"
        }
    .end annotation

    .line 461
    iget-object v0, p0, Lcom/shopkick/fetchers/api/APIManager;->requestTypeIDMapProvider:Lcom/shopkick/fetchers/api/RequestTypeIDMapProvider;

    invoke-virtual {v0, p1}, Lcom/shopkick/fetchers/api/RequestTypeIDMapProvider;->get(Ljava/lang/Class;)Ljava/util/List;

    move-result-object v0

    .line 463
    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v1

    if-lez v1, :cond_1

    .line 464
    sget-object v1, Lcom/shopkick/fetchers/api/APIManager;->_RequestTypeIDMapAccessLock:Ljava/lang/Object;

    monitor-enter v1

    .line 465
    :try_start_0
    invoke-static {}, Lcom/shopkick/comm/FetchersCommManagerAccessor;->getInstance()Lnet/toddm/comm/CommManager;

    move-result-object v2

    .line 466
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :goto_0
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_0

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/Integer;

    invoke-virtual {v4}, Ljava/lang/Integer;->intValue()I

    move-result v4

    .line 467
    invoke-virtual {v2, v4}, Lnet/toddm/comm/CommManager;->purgeCache(I)V

    goto :goto_0

    .line 469
    :cond_0
    iget-object v2, p0, Lcom/shopkick/fetchers/api/APIManager;->requestTypeIDMapProvider:Lcom/shopkick/fetchers/api/RequestTypeIDMapProvider;

    invoke-virtual {v2, p1}, Lcom/shopkick/fetchers/api/RequestTypeIDMapProvider;->remove(Ljava/lang/Class;)Z

    .line 470
    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 471
    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result p1

    return p1

    :catchall_0
    move-exception p1

    .line 470
    :try_start_1
    monitor-exit v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1

    :cond_1
    const/4 p1, 0x0

    return p1
.end method

.method public receivedResponse(Lcom/shopkick/fetchers/network/NetworkRequest;Lcom/shopkick/fetchers/DataResponse;)V
    .locals 7

    .line 1026
    iget-object v0, p0, Lcom/shopkick/fetchers/api/APIManager;->networkRequestToAPIRequestMap:Ljava/util/HashMap;

    invoke-virtual {v0, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/shopkick/app/fetchers/api/IAPIObject;

    if-nez v0, :cond_0

    return-void

    .line 1031
    :cond_0
    iget-object v1, p0, Lcom/shopkick/fetchers/api/APIManager;->apiToAPIRequestStateMap:Ljava/util/HashMap;

    invoke-virtual {v1, v0}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/shopkick/fetchers/api/APIManager$APIRequestState;

    if-nez v1, :cond_1

    return-void

    :cond_1
    const-string v2, "X-Auth-Error"

    .line 1036
    invoke-virtual {p2, v2}, Lcom/shopkick/fetchers/DataResponse;->getHeader(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    const/4 v4, 0x0

    if-eqz v2, :cond_2

    move v2, v3

    goto :goto_0

    :cond_2
    move v2, v4

    :goto_0
    if-eqz v2, :cond_3

    .line 1038
    iput-boolean v4, p2, Lcom/shopkick/fetchers/DataResponse;->success:Z

    .line 1041
    :cond_3
    iget-object v2, p2, Lcom/shopkick/fetchers/DataResponse;->responseData:Ljava/lang/Object;

    if-nez v2, :cond_5

    .line 1042
    iput-boolean v4, p2, Lcom/shopkick/fetchers/DataResponse;->success:Z

    .line 1043
    iget v2, p2, Lcom/shopkick/fetchers/DataResponse;->clientError:I

    if-nez v2, :cond_4

    const/4 p1, 0x4

    .line 1044
    iput p1, p2, Lcom/shopkick/fetchers/DataResponse;->clientError:I

    goto :goto_1

    .line 1045
    :cond_4
    iget v2, p2, Lcom/shopkick/fetchers/DataResponse;->clientError:I

    const/4 v5, 0x7

    if-ne v2, v5, :cond_5

    iget-boolean v2, p0, Lcom/shopkick/fetchers/api/APIManager;->enableNetworkRequestTimeoutLogging:Z

    if-eqz v2, :cond_5

    .line 1047
    new-instance v2, Ljava/util/HashMap;

    invoke-direct {v2}, Ljava/util/HashMap;-><init>()V

    const-string v5, "event_type"

    const v6, 0x668a1

    .line 1048
    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    invoke-interface {v2, v5, v6}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v5, "failed_request_url_path"

    .line 1049
    iget-object p1, p1, Lcom/shopkick/fetchers/network/NetworkRequest;->requestPath:Ljava/lang/String;

    invoke-interface {v2, v5, p1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 1050
    iget-object p1, p0, Lcom/shopkick/fetchers/api/APIManager;->logger:Lcom/shopkick/app/application/SKLogger;

    invoke-virtual {p1, v2}, Lcom/shopkick/app/application/SKLogger;->logPersistentEvent2(Ljava/util/Map;)V

    .line 1054
    :cond_5
    :goto_1
    iget-boolean p1, p2, Lcom/shopkick/fetchers/DataResponse;->success:Z

    const/4 v2, 0x0

    if-eqz p1, :cond_6

    .line 1055
    invoke-virtual {p2}, Lcom/shopkick/fetchers/DataResponse;->getStatusCode()I

    move-result p1

    const/16 v5, 0x130

    if-ne p1, v5, :cond_6

    .line 1057
    iput-object v2, p2, Lcom/shopkick/fetchers/DataResponse;->responseData:Ljava/lang/Object;

    .line 1061
    :cond_6
    iget-boolean p1, p2, Lcom/shopkick/fetchers/DataResponse;->success:Z

    if-nez p1, :cond_7

    .line 1062
    iput-object v2, p2, Lcom/shopkick/fetchers/DataResponse;->responseData:Ljava/lang/Object;

    .line 1066
    :cond_7
    iput-object p2, v1, Lcom/shopkick/fetchers/api/APIManager$APIRequestState;->response:Lcom/shopkick/fetchers/DataResponse;

    .line 1068
    iget-object p1, p0, Lcom/shopkick/fetchers/api/APIManager;->requestThatModifiesSessionKey:Lcom/shopkick/app/fetchers/api/IAPIObject;

    if-eqz p1, :cond_e

    if-eq p1, v0, :cond_8

    return-void

    .line 1077
    :cond_8
    iget-object p1, p2, Lcom/shopkick/fetchers/DataResponse;->responseData:Ljava/lang/Object;

    if-eqz p1, :cond_c

    .line 1079
    :try_start_0
    iget-object p1, p2, Lcom/shopkick/fetchers/DataResponse;->responseData:Ljava/lang/Object;

    check-cast p1, Lcom/shopkick/app/fetchers/api/IAPIObject;

    invoke-virtual {p1}, Lcom/shopkick/app/fetchers/api/IAPIObject;->toJsonTree()Lcom/google/gson/JsonObject;

    move-result-object p1

    if-eqz p1, :cond_c

    const-string/jumbo v1, "user_id"

    .line 1081
    invoke-static {p1, v1}, Lcom/shopkick/app/util/GsonUtils;->getAsString(Lcom/google/gson/JsonObject;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    const-string v2, "session_key_base64_enc"

    .line 1082
    invoke-static {p1, v2}, Lcom/shopkick/app/util/GsonUtils;->getAsString(Lcom/google/gson/JsonObject;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    .line 1083
    iget-boolean p2, p2, Lcom/shopkick/fetchers/DataResponse;->success:Z

    if-eqz p2, :cond_c

    if-nez v1, :cond_9

    if-eqz p1, :cond_c

    :cond_9
    if-eqz v1, :cond_a

    iget-object p2, p0, Lcom/shopkick/fetchers/api/APIManager;->userAcct:Lcom/shopkick/app/application/Account;

    .line 1084
    invoke-virtual {p2}, Lcom/shopkick/app/application/Account;->getUserId()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {v1, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p2

    if-eqz p2, :cond_b

    :cond_a
    iget-object p2, p0, Lcom/shopkick/fetchers/api/APIManager;->userAcct:Lcom/shopkick/app/application/Account;

    .line 1085
    invoke-virtual {p2, p1}, Lcom/shopkick/app/application/Account;->matchesEncryptedSessionKey(Ljava/lang/String;)Z

    move-result p1
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    if-nez p1, :cond_c

    :cond_b
    move v4, v3

    goto :goto_2

    :catch_0
    move-exception p1

    .line 1088
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object p2

    invoke-virtual {p2}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1}, Ljava/lang/Exception;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {p2, p1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    :cond_c
    :goto_2
    if-eqz v4, :cond_d

    .line 1094
    invoke-direct {p0}, Lcom/shopkick/fetchers/api/APIManager;->cancelSuspendedRequests()V

    .line 1098
    invoke-virtual {p0, v0}, Lcom/shopkick/fetchers/api/APIManager;->executeCallbacksForRequest(Lcom/shopkick/app/fetchers/api/IAPIObject;)V

    goto :goto_3

    .line 1101
    :cond_d
    invoke-direct {p0}, Lcom/shopkick/fetchers/api/APIManager;->resumeSuspendedRequests()V

    .line 1102
    invoke-virtual {p0, v0}, Lcom/shopkick/fetchers/api/APIManager;->executeCallbacksForRequest(Lcom/shopkick/app/fetchers/api/IAPIObject;)V

    goto :goto_3

    .line 1106
    :cond_e
    invoke-virtual {p0, v0}, Lcom/shopkick/fetchers/api/APIManager;->executeCallbacksForRequest(Lcom/shopkick/app/fetchers/api/IAPIObject;)V

    :goto_3
    return-void
.end method

.method public registerHandler(Lcom/shopkick/app/fetchers/api/IAPICommonHandler;)V
    .locals 1

    if-eqz p1, :cond_0

    .line 342
    iget-object v0, p0, Lcom/shopkick/fetchers/api/APIManager;->handlerList:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_0
    return-void
.end method

.method public sdkFetch(Lcom/shopkick/app/fetchers/api/IAPIObject;Lcom/shopkick/fetchers/api/IAPICallback;)Lcom/shopkick/fetchers/RequestDetails;
    .locals 10

    .line 1395
    sget-object v2, Lcom/shopkick/fetchers/api/RequestDomainId;->SHOPKICK_SDK:Lcom/shopkick/fetchers/api/RequestDomainId;

    sget-object v7, Lnet/toddm/comm/Priority$StartingPriority;->MEDIUM:Lnet/toddm/comm/Priority$StartingPriority;

    sget-object v8, Lnet/toddm/cache/CachePriority;->NORMAL:Lnet/toddm/cache/CachePriority;

    sget-object v9, Lnet/toddm/comm/CacheBehavior;->DO_NOT_CACHE:Lnet/toddm/comm/CacheBehavior;

    const/4 v1, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    move-object v0, p0

    move-object v3, p1

    move-object v4, p2

    invoke-direct/range {v0 .. v9}, Lcom/shopkick/fetchers/api/APIManager;->fetch(ZLcom/shopkick/fetchers/api/RequestDomainId;Lcom/shopkick/app/fetchers/api/IAPIObject;Lcom/shopkick/fetchers/api/IAPICallback;ZZLnet/toddm/comm/Priority$StartingPriority;Lnet/toddm/cache/CachePriority;Lnet/toddm/comm/CacheBehavior;)Lcom/shopkick/fetchers/RequestDetails;

    move-result-object p1

    return-object p1
.end method

.method public sdkFetch(Lcom/shopkick/app/fetchers/api/IAPIObject;Lcom/shopkick/fetchers/api/IAPICallback;Z)Lcom/shopkick/fetchers/RequestDetails;
    .locals 10

    .line 1410
    sget-object v2, Lcom/shopkick/fetchers/api/RequestDomainId;->SHOPKICK_SDK:Lcom/shopkick/fetchers/api/RequestDomainId;

    sget-object v7, Lnet/toddm/comm/Priority$StartingPriority;->MEDIUM:Lnet/toddm/comm/Priority$StartingPriority;

    sget-object v8, Lnet/toddm/cache/CachePriority;->NORMAL:Lnet/toddm/cache/CachePriority;

    sget-object v9, Lnet/toddm/comm/CacheBehavior;->DO_NOT_CACHE:Lnet/toddm/comm/CacheBehavior;

    const/4 v1, 0x0

    const/4 v5, 0x0

    move-object v0, p0

    move-object v3, p1

    move-object v4, p2

    move v6, p3

    invoke-direct/range {v0 .. v9}, Lcom/shopkick/fetchers/api/APIManager;->fetch(ZLcom/shopkick/fetchers/api/RequestDomainId;Lcom/shopkick/app/fetchers/api/IAPIObject;Lcom/shopkick/fetchers/api/IAPICallback;ZZLnet/toddm/comm/Priority$StartingPriority;Lnet/toddm/cache/CachePriority;Lnet/toddm/comm/CacheBehavior;)Lcom/shopkick/fetchers/RequestDetails;

    move-result-object p1

    return-object p1
.end method

.method public setEnableNetworkRequestTimeoutLogging(Z)V
    .locals 0

    .line 1322
    iput-boolean p1, p0, Lcom/shopkick/fetchers/api/APIManager;->enableNetworkRequestTimeoutLogging:Z

    return-void
.end method

.method public submittableWorkForNetworkRequest(Lcom/shopkick/fetchers/network/NetworkRequest;)Lnet/toddm/comm/SubmittableWork;
    .locals 9

    .line 1258
    :try_start_0
    new-instance v1, Ljava/net/URI;

    iget-object v0, p1, Lcom/shopkick/fetchers/network/NetworkRequest;->urlString:Ljava/lang/String;

    invoke-direct {v1, v0}, Ljava/net/URI;-><init>(Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/net/URISyntaxException; {:try_start_0 .. :try_end_0} :catch_0

    .line 1264
    invoke-static {}, Lcom/shopkick/comm/FetchersCommManagerAccessor;->getInstance()Lnet/toddm/comm/CommManager;

    move-result-object v0

    iget-object v2, p1, Lcom/shopkick/fetchers/network/NetworkRequest;->requestMethod:Lnet/toddm/comm/Request$RequestMethod;

    .line 1267
    invoke-virtual {p1}, Lcom/shopkick/fetchers/network/NetworkRequest;->getPostBodyAsBytes()[B

    move-result-object v3

    iget-object v4, p0, Lcom/shopkick/fetchers/api/APIManager;->networkManager:Lcom/shopkick/fetchers/network/NetworkManager;

    .line 1268
    invoke-virtual {v4, p1}, Lcom/shopkick/fetchers/network/NetworkManager;->getHeaders(Lcom/shopkick/fetchers/network/NetworkRequest;)Ljava/util/HashMap;

    move-result-object v4

    iget-boolean v5, p1, Lcom/shopkick/fetchers/network/NetworkRequest;->isIdempotent:Z

    iget-object v6, p1, Lcom/shopkick/fetchers/network/NetworkRequest;->requestPriority:Lnet/toddm/comm/Priority$StartingPriority;

    iget-object v7, p1, Lcom/shopkick/fetchers/network/NetworkRequest;->cachingPriority:Lnet/toddm/cache/CachePriority;

    iget-object v8, p1, Lcom/shopkick/fetchers/network/NetworkRequest;->cachingBehavior:Lnet/toddm/comm/CacheBehavior;

    .line 1265
    invoke-virtual/range {v0 .. v8}, Lnet/toddm/comm/CommManager;->getWork(Ljava/net/URI;Lnet/toddm/comm/Request$RequestMethod;[BLjava/util/Map;ZLnet/toddm/comm/Priority$StartingPriority;Lnet/toddm/cache/CachePriority;Lnet/toddm/comm/CacheBehavior;)Lnet/toddm/comm/SubmittableWork;

    move-result-object p1

    return-object p1

    :catch_0
    move-exception v0

    .line 1260
    new-instance v1, Lnet/toddm/comm/CommException;

    sget-object v2, Ljava/util/Locale;->US:Ljava/util/Locale;

    const/4 v3, 0x1

    new-array v3, v3, [Ljava/lang/Object;

    const/4 v4, 0x0

    iget-object p1, p1, Lcom/shopkick/fetchers/network/NetworkRequest;->urlString:Ljava/lang/String;

    aput-object p1, v3, v4

    const-string p1, "Bad \'request.urlString\' provided [%1$s]"

    invoke-static {v2, p1, v3}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    invoke-direct {v1, p1, v0}, Lnet/toddm/comm/CommException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v1
.end method

.method public toJson(Lcom/shopkick/app/fetchers/api/IAPIObject;)Lcom/google/gson/JsonObject;
    .locals 1

    .line 936
    sget-object v0, Lcom/shopkick/app/util/GsonUtils;->gson:Lcom/google/gson/Gson;

    invoke-virtual {v0, p1}, Lcom/google/gson/Gson;->toJsonTree(Ljava/lang/Object;)Lcom/google/gson/JsonElement;

    move-result-object p1

    .line 937
    instance-of v0, p1, Lcom/google/gson/JsonObject;

    if-eqz v0, :cond_0

    check-cast p1, Lcom/google/gson/JsonObject;

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return-object p1
.end method
