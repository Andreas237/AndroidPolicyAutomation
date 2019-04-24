.class public Lcom/launchdarkly/android/LDConfig;
.super Ljava/lang/Object;
.source "LDConfig.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/launchdarkly/android/LDConfig$Builder;
    }
.end annotation


# static fields
.field static final AUTH_SCHEME:Ljava/lang/String; = "api_key "

.field static final DEFAULT_BACKGROUND_POLLING_INTERVAL_MILLIS:I = 0x36ee80

.field static final DEFAULT_BASE_URI:Landroid/net/Uri;

.field static final DEFAULT_CONNECTION_TIMEOUT_MILLIS:I = 0x2710

.field static final DEFAULT_EVENTS_CAPACITY:I = 0x64

.field static final DEFAULT_EVENTS_URI:Landroid/net/Uri;

.field static final DEFAULT_FLUSH_INTERVAL_MILLIS:I = 0x7530

.field static final DEFAULT_POLLING_INTERVAL_MILLIS:I = 0x493e0

.field static final DEFAULT_STREAM_URI:Landroid/net/Uri;

.field static final GSON:Lcom/google/gson/Gson;

.field static final JSON:Lokhttp3/MediaType;

.field static final MIN_BACKGROUND_POLLING_INTERVAL_MILLIS:I = 0xdbba0

.field static final MIN_POLLING_INTERVAL_MILLIS:I = 0x493e0

.field static final SHARED_PREFS_BASE_KEY:Ljava/lang/String; = "LaunchDarkly-"

.field static final USER_AGENT_HEADER_VALUE:Ljava/lang/String; = "AndroidClient/2.6.0"

.field static final primaryEnvironmentName:Ljava/lang/String; = "default"


# instance fields
.field private final allAttributesPrivate:Z

.field private final backgroundPollingIntervalMillis:I

.field private final baseUri:Landroid/net/Uri;

.field private final connectionTimeoutMillis:I

.field private final disableBackgroundUpdating:Z

.field private final eventsCapacity:I

.field private final eventsFlushIntervalMillis:I

.field private final eventsUri:Landroid/net/Uri;

.field private final filteredEventGson:Lcom/google/gson/Gson;

.field private final inlineUsersInEvents:Z

.field private final mobileKeys:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private final offline:Z

.field private final pollingIntervalMillis:I

.field private final privateAttributeNames:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private final stream:Z

.field private final streamUri:Landroid/net/Uri;

.field private final useReport:Z


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const-string v0, "application/json; charset=utf-8"

    .line 23
    invoke-static {v0}, Lokhttp3/MediaType;->parse(Ljava/lang/String;)Lokhttp3/MediaType;

    move-result-object v0

    sput-object v0, Lcom/launchdarkly/android/LDConfig;->JSON:Lokhttp3/MediaType;

    .line 24
    new-instance v0, Lcom/google/gson/GsonBuilder;

    invoke-direct {v0}, Lcom/google/gson/GsonBuilder;-><init>()V

    invoke-virtual {v0}, Lcom/google/gson/GsonBuilder;->excludeFieldsWithoutExposeAnnotation()Lcom/google/gson/GsonBuilder;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/gson/GsonBuilder;->create()Lcom/google/gson/Gson;

    move-result-object v0

    sput-object v0, Lcom/launchdarkly/android/LDConfig;->GSON:Lcom/google/gson/Gson;

    const-string v0, "https://app.launchdarkly.com"

    .line 28
    invoke-static {v0}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v0

    sput-object v0, Lcom/launchdarkly/android/LDConfig;->DEFAULT_BASE_URI:Landroid/net/Uri;

    const-string v0, "https://mobile.launchdarkly.com/mobile"

    .line 29
    invoke-static {v0}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v0

    sput-object v0, Lcom/launchdarkly/android/LDConfig;->DEFAULT_EVENTS_URI:Landroid/net/Uri;

    const-string v0, "https://clientstream.launchdarkly.com"

    .line 30
    invoke-static {v0}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v0

    sput-object v0, Lcom/launchdarkly/android/LDConfig;->DEFAULT_STREAM_URI:Landroid/net/Uri;

    return-void
.end method

.method constructor <init>(Ljava/util/Map;Landroid/net/Uri;Landroid/net/Uri;Landroid/net/Uri;IIIZZIIZZZLjava/util/Set;Z)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;",
            "Landroid/net/Uri;",
            "Landroid/net/Uri;",
            "Landroid/net/Uri;",
            "IIIZZIIZZZ",
            "Ljava/util/Set<",
            "Ljava/lang/String;",
            ">;Z)V"
        }
    .end annotation

    move-object v0, p0

    .line 79
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    move-object v1, p1

    .line 81
    iput-object v1, v0, Lcom/launchdarkly/android/LDConfig;->mobileKeys:Ljava/util/Map;

    move-object v1, p2

    .line 82
    iput-object v1, v0, Lcom/launchdarkly/android/LDConfig;->baseUri:Landroid/net/Uri;

    move-object v1, p3

    .line 83
    iput-object v1, v0, Lcom/launchdarkly/android/LDConfig;->eventsUri:Landroid/net/Uri;

    move-object v1, p4

    .line 84
    iput-object v1, v0, Lcom/launchdarkly/android/LDConfig;->streamUri:Landroid/net/Uri;

    move v1, p5

    .line 85
    iput v1, v0, Lcom/launchdarkly/android/LDConfig;->eventsCapacity:I

    move v1, p6

    .line 86
    iput v1, v0, Lcom/launchdarkly/android/LDConfig;->eventsFlushIntervalMillis:I

    move v1, p7

    .line 87
    iput v1, v0, Lcom/launchdarkly/android/LDConfig;->connectionTimeoutMillis:I

    move v1, p8

    .line 88
    iput-boolean v1, v0, Lcom/launchdarkly/android/LDConfig;->offline:Z

    move v1, p9

    .line 89
    iput-boolean v1, v0, Lcom/launchdarkly/android/LDConfig;->stream:Z

    move v1, p10

    .line 90
    iput v1, v0, Lcom/launchdarkly/android/LDConfig;->pollingIntervalMillis:I

    move v1, p11

    .line 91
    iput v1, v0, Lcom/launchdarkly/android/LDConfig;->backgroundPollingIntervalMillis:I

    move/from16 v1, p12

    .line 92
    iput-boolean v1, v0, Lcom/launchdarkly/android/LDConfig;->disableBackgroundUpdating:Z

    move/from16 v1, p13

    .line 93
    iput-boolean v1, v0, Lcom/launchdarkly/android/LDConfig;->useReport:Z

    move/from16 v1, p14

    .line 94
    iput-boolean v1, v0, Lcom/launchdarkly/android/LDConfig;->allAttributesPrivate:Z

    move-object/from16 v1, p15

    .line 95
    iput-object v1, v0, Lcom/launchdarkly/android/LDConfig;->privateAttributeNames:Ljava/util/Set;

    move/from16 v1, p16

    .line 96
    iput-boolean v1, v0, Lcom/launchdarkly/android/LDConfig;->inlineUsersInEvents:Z

    .line 98
    new-instance v1, Lcom/google/gson/GsonBuilder;

    invoke-direct {v1}, Lcom/google/gson/GsonBuilder;-><init>()V

    const-class v2, Lcom/launchdarkly/android/LDUser;

    new-instance v3, Lcom/launchdarkly/android/LDUser$LDUserPrivateAttributesTypeAdapter;

    invoke-direct {v3, p0}, Lcom/launchdarkly/android/LDUser$LDUserPrivateAttributesTypeAdapter;-><init>(Lcom/launchdarkly/android/LDConfig;)V

    .line 99
    invoke-virtual {v1, v2, v3}, Lcom/google/gson/GsonBuilder;->registerTypeAdapter(Ljava/lang/reflect/Type;Ljava/lang/Object;)Lcom/google/gson/GsonBuilder;

    move-result-object v1

    .line 100
    invoke-virtual {v1}, Lcom/google/gson/GsonBuilder;->excludeFieldsWithoutExposeAnnotation()Lcom/google/gson/GsonBuilder;

    move-result-object v1

    invoke-virtual {v1}, Lcom/google/gson/GsonBuilder;->create()Lcom/google/gson/Gson;

    move-result-object v1

    iput-object v1, v0, Lcom/launchdarkly/android/LDConfig;->filteredEventGson:Lcom/google/gson/Gson;

    return-void
.end method


# virtual methods
.method public allAttributesPrivate()Z
    .locals 1

    .line 174
    iget-boolean v0, p0, Lcom/launchdarkly/android/LDConfig;->allAttributesPrivate:Z

    return v0
.end method

.method public getBackgroundPollingIntervalMillis()I
    .locals 1

    .line 166
    iget v0, p0, Lcom/launchdarkly/android/LDConfig;->backgroundPollingIntervalMillis:I

    return v0
.end method

.method public getBaseUri()Landroid/net/Uri;
    .locals 1

    .line 126
    iget-object v0, p0, Lcom/launchdarkly/android/LDConfig;->baseUri:Landroid/net/Uri;

    return-object v0
.end method

.method public getConnectionTimeoutMillis()I
    .locals 1

    .line 142
    iget v0, p0, Lcom/launchdarkly/android/LDConfig;->connectionTimeoutMillis:I

    return v0
.end method

.method public getEventsCapacity()I
    .locals 1

    .line 134
    iget v0, p0, Lcom/launchdarkly/android/LDConfig;->eventsCapacity:I

    return v0
.end method

.method public getEventsFlushIntervalMillis()I
    .locals 1

    .line 138
    iget v0, p0, Lcom/launchdarkly/android/LDConfig;->eventsFlushIntervalMillis:I

    return v0
.end method

.method public getEventsUri()Landroid/net/Uri;
    .locals 1

    .line 130
    iget-object v0, p0, Lcom/launchdarkly/android/LDConfig;->eventsUri:Landroid/net/Uri;

    return-object v0
.end method

.method public getFilteredEventGson()Lcom/google/gson/Gson;
    .locals 1

    .line 182
    iget-object v0, p0, Lcom/launchdarkly/android/LDConfig;->filteredEventGson:Lcom/google/gson/Gson;

    return-object v0
.end method

.method public getMobileKey()Ljava/lang/String;
    .locals 2

    .line 118
    iget-object v0, p0, Lcom/launchdarkly/android/LDConfig;->mobileKeys:Ljava/util/Map;

    const-string v1, "default"

    invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    return-object v0
.end method

.method public getMobileKeys()Ljava/util/Map;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .line 122
    iget-object v0, p0, Lcom/launchdarkly/android/LDConfig;->mobileKeys:Ljava/util/Map;

    return-object v0
.end method

.method public getPollingIntervalMillis()I
    .locals 1

    .line 162
    iget v0, p0, Lcom/launchdarkly/android/LDConfig;->pollingIntervalMillis:I

    return v0
.end method

.method public getPrivateAttributeNames()Ljava/util/Set;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Set<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .line 178
    iget-object v0, p0, Lcom/launchdarkly/android/LDConfig;->privateAttributeNames:Ljava/util/Set;

    invoke-static {v0}, Ljava/util/Collections;->unmodifiableSet(Ljava/util/Set;)Ljava/util/Set;

    move-result-object v0

    return-object v0
.end method

.method getRequestBuilderFor(Ljava/lang/String;)Lokhttp3/Request$Builder;
    .locals 4

    if-eqz p1, :cond_1

    .line 108
    iget-object v0, p0, Lcom/launchdarkly/android/LDConfig;->mobileKeys:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/String;

    if-eqz p1, :cond_0

    .line 112
    new-instance v0, Lokhttp3/Request$Builder;

    invoke-direct {v0}, Lokhttp3/Request$Builder;-><init>()V

    const-string v1, "Authorization"

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "api_key "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    .line 113
    invoke-virtual {v0, v1, p1}, Lokhttp3/Request$Builder;->addHeader(Ljava/lang/String;Ljava/lang/String;)Lokhttp3/Request$Builder;

    move-result-object p1

    const-string v0, "User-Agent"

    const-string v1, "AndroidClient/2.6.0"

    .line 114
    invoke-virtual {p1, v0, v1}, Lokhttp3/Request$Builder;->addHeader(Ljava/lang/String;Ljava/lang/String;)Lokhttp3/Request$Builder;

    move-result-object p1

    return-object p1

    .line 110
    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "No environment by that name."

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 106
    :cond_1
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "null is not a valid environment"

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public getStreamUri()Landroid/net/Uri;
    .locals 1

    .line 146
    iget-object v0, p0, Lcom/launchdarkly/android/LDConfig;->streamUri:Landroid/net/Uri;

    return-object v0
.end method

.method public inlineUsersInEvents()Z
    .locals 1

    .line 186
    iget-boolean v0, p0, Lcom/launchdarkly/android/LDConfig;->inlineUsersInEvents:Z

    return v0
.end method

.method public isDisableBackgroundPolling()Z
    .locals 1

    .line 170
    iget-boolean v0, p0, Lcom/launchdarkly/android/LDConfig;->disableBackgroundUpdating:Z

    return v0
.end method

.method public isOffline()Z
    .locals 1

    .line 150
    iget-boolean v0, p0, Lcom/launchdarkly/android/LDConfig;->offline:Z

    return v0
.end method

.method public isStream()Z
    .locals 1

    .line 154
    iget-boolean v0, p0, Lcom/launchdarkly/android/LDConfig;->stream:Z

    return v0
.end method

.method public isUseReport()Z
    .locals 1

    .line 158
    iget-boolean v0, p0, Lcom/launchdarkly/android/LDConfig;->useReport:Z

    return v0
.end method
