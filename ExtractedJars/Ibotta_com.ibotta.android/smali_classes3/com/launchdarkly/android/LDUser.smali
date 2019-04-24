.class public Lcom/launchdarkly/android/LDUser;
.super Ljava/lang/Object;
.source "LDUser.java"


# annotations
.annotation build Lcom/newrelic/agent/android/instrumentation/Instrumented;
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/launchdarkly/android/LDUser$LDUserPrivateAttributesTypeAdapter;,
        Lcom/launchdarkly/android/LDUser$Builder;
    }
.end annotation


# static fields
.field private static final ANONYMOUS:Ljava/lang/String; = "anonymous"

.field static final AVATAR:Ljava/lang/String; = "avatar"

.field static final COUNTRY:Ljava/lang/String; = "country"

.field private static final CUSTOM:Ljava/lang/String; = "custom"

.field private static final DEVICE:Ljava/lang/String; = "device"

.field static final EMAIL:Ljava/lang/String; = "email"

.field static final FIRST_NAME:Ljava/lang/String; = "firstName"

.field static final IP:Ljava/lang/String; = "ip"

.field private static final KEY:Ljava/lang/String; = "key"

.field static final LAST_NAME:Ljava/lang/String; = "lastName"

.field static final NAME:Ljava/lang/String; = "name"

.field private static final OS:Ljava/lang/String; = "os"

.field static final SECONDARY:Ljava/lang/String; = "secondary"

.field private static final USER_HASHER:Lcom/launchdarkly/android/UserHasher;


# instance fields
.field private final anonymous:Lcom/google/gson/JsonPrimitive;
    .annotation runtime Lcom/google/gson/annotations/Expose;
    .end annotation
.end field

.field private final avatar:Lcom/google/gson/JsonPrimitive;
    .annotation runtime Lcom/google/gson/annotations/Expose;
    .end annotation
.end field

.field private final country:Lcom/google/gson/JsonPrimitive;
    .annotation runtime Lcom/google/gson/annotations/Expose;
    .end annotation
.end field

.field private final custom:Ljava/util/Map;
    .annotation runtime Lcom/google/gson/annotations/Expose;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Lcom/google/gson/JsonElement;",
            ">;"
        }
    .end annotation
.end field

.field private final email:Lcom/google/gson/JsonPrimitive;
    .annotation runtime Lcom/google/gson/annotations/Expose;
    .end annotation
.end field

.field private final firstName:Lcom/google/gson/JsonPrimitive;
    .annotation runtime Lcom/google/gson/annotations/Expose;
    .end annotation
.end field

.field private final ip:Lcom/google/gson/JsonPrimitive;
    .annotation runtime Lcom/google/gson/annotations/Expose;
    .end annotation
.end field

.field private final key:Lcom/google/gson/JsonPrimitive;
    .annotation runtime Lcom/google/gson/annotations/Expose;
    .end annotation
.end field

.field private final lastName:Lcom/google/gson/JsonPrimitive;
    .annotation runtime Lcom/google/gson/annotations/Expose;
    .end annotation
.end field

.field private final name:Lcom/google/gson/JsonPrimitive;
    .annotation runtime Lcom/google/gson/annotations/Expose;
    .end annotation
.end field

.field private final privateAttributeNames:Ljava/util/Set;
    .annotation build Landroid/support/annotation/NonNull;
    .end annotation

    .annotation runtime Lcom/google/gson/annotations/Expose;
        deserialize = false
        serialize = false
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private final secondary:Lcom/google/gson/JsonPrimitive;
    .annotation runtime Lcom/google/gson/annotations/Expose;
    .end annotation
.end field

.field private final sharedPrefsKey:Ljava/lang/String;
    .annotation runtime Lcom/google/gson/annotations/Expose;
        deserialize = false
        serialize = false
    .end annotation
.end field

.field private final urlSafeBase64:Ljava/lang/String;
    .annotation runtime Lcom/google/gson/annotations/Expose;
        deserialize = false
        serialize = false
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 42
    new-instance v0, Lcom/launchdarkly/android/UserHasher;

    invoke-direct {v0}, Lcom/launchdarkly/android/UserHasher;-><init>()V

    sput-object v0, Lcom/launchdarkly/android/LDUser;->USER_HASHER:Lcom/launchdarkly/android/UserHasher;

    return-void
.end method

.method protected constructor <init>(Lcom/launchdarkly/android/LDUser$Builder;)V
    .locals 6

    .line 94
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 95
    invoke-static {p1}, Lcom/launchdarkly/android/LDUser$Builder;->access$000(Lcom/launchdarkly/android/LDUser$Builder;)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    if-eqz v0, :cond_2

    invoke-static {p1}, Lcom/launchdarkly/android/LDUser$Builder;->access$000(Lcom/launchdarkly/android/LDUser$Builder;)Ljava/lang/String;

    move-result-object v0

    const-string v2, ""

    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_1

    .line 100
    :cond_0
    new-instance v0, Lcom/google/gson/JsonPrimitive;

    invoke-static {p1}, Lcom/launchdarkly/android/LDUser$Builder;->access$000(Lcom/launchdarkly/android/LDUser$Builder;)Ljava/lang/String;

    move-result-object v2

    invoke-direct {v0, v2}, Lcom/google/gson/JsonPrimitive;-><init>(Ljava/lang/String;)V

    iput-object v0, p0, Lcom/launchdarkly/android/LDUser;->key:Lcom/google/gson/JsonPrimitive;

    .line 101
    invoke-static {p1}, Lcom/launchdarkly/android/LDUser$Builder;->access$100(Lcom/launchdarkly/android/LDUser$Builder;)Ljava/lang/Boolean;

    move-result-object v0

    if-nez v0, :cond_1

    move-object v0, v1

    goto :goto_0

    :cond_1
    new-instance v0, Lcom/google/gson/JsonPrimitive;

    invoke-static {p1}, Lcom/launchdarkly/android/LDUser$Builder;->access$100(Lcom/launchdarkly/android/LDUser$Builder;)Ljava/lang/Boolean;

    move-result-object v2

    invoke-direct {v0, v2}, Lcom/google/gson/JsonPrimitive;-><init>(Ljava/lang/Boolean;)V

    :goto_0
    iput-object v0, p0, Lcom/launchdarkly/android/LDUser;->anonymous:Lcom/google/gson/JsonPrimitive;

    goto :goto_2

    :cond_2
    :goto_1
    const-string v0, "User was created with null/empty key. Using device-unique anonymous user key: %s"

    const/4 v2, 0x1

    .line 96
    new-array v3, v2, [Ljava/lang/Object;

    const/4 v4, 0x0

    invoke-static {}, Lcom/launchdarkly/android/LDClient;->getInstanceId()Ljava/lang/String;

    move-result-object v5

    aput-object v5, v3, v4

    invoke-static {v0, v3}, Ltimber/log/Timber;->w(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 97
    new-instance v0, Lcom/google/gson/JsonPrimitive;

    invoke-static {}, Lcom/launchdarkly/android/LDClient;->getInstanceId()Ljava/lang/String;

    move-result-object v3

    invoke-direct {v0, v3}, Lcom/google/gson/JsonPrimitive;-><init>(Ljava/lang/String;)V

    iput-object v0, p0, Lcom/launchdarkly/android/LDUser;->key:Lcom/google/gson/JsonPrimitive;

    .line 98
    new-instance v0, Lcom/google/gson/JsonPrimitive;

    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    invoke-direct {v0, v2}, Lcom/google/gson/JsonPrimitive;-><init>(Ljava/lang/Boolean;)V

    iput-object v0, p0, Lcom/launchdarkly/android/LDUser;->anonymous:Lcom/google/gson/JsonPrimitive;

    .line 104
    :goto_2
    invoke-static {p1}, Lcom/launchdarkly/android/LDUser$Builder;->access$200(Lcom/launchdarkly/android/LDUser$Builder;)Ljava/lang/String;

    move-result-object v0

    if-nez v0, :cond_3

    move-object v0, v1

    goto :goto_3

    :cond_3
    new-instance v0, Lcom/google/gson/JsonPrimitive;

    invoke-static {p1}, Lcom/launchdarkly/android/LDUser$Builder;->access$200(Lcom/launchdarkly/android/LDUser$Builder;)Ljava/lang/String;

    move-result-object v2

    invoke-direct {v0, v2}, Lcom/google/gson/JsonPrimitive;-><init>(Ljava/lang/String;)V

    :goto_3
    iput-object v0, p0, Lcom/launchdarkly/android/LDUser;->ip:Lcom/google/gson/JsonPrimitive;

    .line 105
    invoke-static {p1}, Lcom/launchdarkly/android/LDUser$Builder;->access$300(Lcom/launchdarkly/android/LDUser$Builder;)Lcom/launchdarkly/android/LDCountryCode;

    move-result-object v0

    if-nez v0, :cond_4

    move-object v0, v1

    goto :goto_4

    :cond_4
    new-instance v0, Lcom/google/gson/JsonPrimitive;

    invoke-static {p1}, Lcom/launchdarkly/android/LDUser$Builder;->access$300(Lcom/launchdarkly/android/LDUser$Builder;)Lcom/launchdarkly/android/LDCountryCode;

    move-result-object v2

    invoke-virtual {v2}, Lcom/launchdarkly/android/LDCountryCode;->getAlpha2()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v0, v2}, Lcom/google/gson/JsonPrimitive;-><init>(Ljava/lang/String;)V

    :goto_4
    iput-object v0, p0, Lcom/launchdarkly/android/LDUser;->country:Lcom/google/gson/JsonPrimitive;

    .line 106
    invoke-static {p1}, Lcom/launchdarkly/android/LDUser$Builder;->access$400(Lcom/launchdarkly/android/LDUser$Builder;)Ljava/lang/String;

    move-result-object v0

    if-nez v0, :cond_5

    move-object v0, v1

    goto :goto_5

    :cond_5
    new-instance v0, Lcom/google/gson/JsonPrimitive;

    invoke-static {p1}, Lcom/launchdarkly/android/LDUser$Builder;->access$400(Lcom/launchdarkly/android/LDUser$Builder;)Ljava/lang/String;

    move-result-object v2

    invoke-direct {v0, v2}, Lcom/google/gson/JsonPrimitive;-><init>(Ljava/lang/String;)V

    :goto_5
    iput-object v0, p0, Lcom/launchdarkly/android/LDUser;->secondary:Lcom/google/gson/JsonPrimitive;

    .line 107
    invoke-static {p1}, Lcom/launchdarkly/android/LDUser$Builder;->access$500(Lcom/launchdarkly/android/LDUser$Builder;)Ljava/lang/String;

    move-result-object v0

    if-nez v0, :cond_6

    move-object v0, v1

    goto :goto_6

    :cond_6
    new-instance v0, Lcom/google/gson/JsonPrimitive;

    invoke-static {p1}, Lcom/launchdarkly/android/LDUser$Builder;->access$500(Lcom/launchdarkly/android/LDUser$Builder;)Ljava/lang/String;

    move-result-object v2

    invoke-direct {v0, v2}, Lcom/google/gson/JsonPrimitive;-><init>(Ljava/lang/String;)V

    :goto_6
    iput-object v0, p0, Lcom/launchdarkly/android/LDUser;->firstName:Lcom/google/gson/JsonPrimitive;

    .line 108
    invoke-static {p1}, Lcom/launchdarkly/android/LDUser$Builder;->access$600(Lcom/launchdarkly/android/LDUser$Builder;)Ljava/lang/String;

    move-result-object v0

    if-nez v0, :cond_7

    move-object v0, v1

    goto :goto_7

    :cond_7
    new-instance v0, Lcom/google/gson/JsonPrimitive;

    invoke-static {p1}, Lcom/launchdarkly/android/LDUser$Builder;->access$600(Lcom/launchdarkly/android/LDUser$Builder;)Ljava/lang/String;

    move-result-object v2

    invoke-direct {v0, v2}, Lcom/google/gson/JsonPrimitive;-><init>(Ljava/lang/String;)V

    :goto_7
    iput-object v0, p0, Lcom/launchdarkly/android/LDUser;->lastName:Lcom/google/gson/JsonPrimitive;

    .line 109
    invoke-static {p1}, Lcom/launchdarkly/android/LDUser$Builder;->access$700(Lcom/launchdarkly/android/LDUser$Builder;)Ljava/lang/String;

    move-result-object v0

    if-nez v0, :cond_8

    move-object v0, v1

    goto :goto_8

    :cond_8
    new-instance v0, Lcom/google/gson/JsonPrimitive;

    invoke-static {p1}, Lcom/launchdarkly/android/LDUser$Builder;->access$700(Lcom/launchdarkly/android/LDUser$Builder;)Ljava/lang/String;

    move-result-object v2

    invoke-direct {v0, v2}, Lcom/google/gson/JsonPrimitive;-><init>(Ljava/lang/String;)V

    :goto_8
    iput-object v0, p0, Lcom/launchdarkly/android/LDUser;->email:Lcom/google/gson/JsonPrimitive;

    .line 110
    invoke-static {p1}, Lcom/launchdarkly/android/LDUser$Builder;->access$800(Lcom/launchdarkly/android/LDUser$Builder;)Ljava/lang/String;

    move-result-object v0

    if-nez v0, :cond_9

    move-object v0, v1

    goto :goto_9

    :cond_9
    new-instance v0, Lcom/google/gson/JsonPrimitive;

    invoke-static {p1}, Lcom/launchdarkly/android/LDUser$Builder;->access$800(Lcom/launchdarkly/android/LDUser$Builder;)Ljava/lang/String;

    move-result-object v2

    invoke-direct {v0, v2}, Lcom/google/gson/JsonPrimitive;-><init>(Ljava/lang/String;)V

    :goto_9
    iput-object v0, p0, Lcom/launchdarkly/android/LDUser;->name:Lcom/google/gson/JsonPrimitive;

    .line 111
    invoke-static {p1}, Lcom/launchdarkly/android/LDUser$Builder;->access$900(Lcom/launchdarkly/android/LDUser$Builder;)Ljava/lang/String;

    move-result-object v0

    if-nez v0, :cond_a

    goto :goto_a

    :cond_a
    new-instance v1, Lcom/google/gson/JsonPrimitive;

    invoke-static {p1}, Lcom/launchdarkly/android/LDUser$Builder;->access$900(Lcom/launchdarkly/android/LDUser$Builder;)Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0}, Lcom/google/gson/JsonPrimitive;-><init>(Ljava/lang/String;)V

    :goto_a
    iput-object v1, p0, Lcom/launchdarkly/android/LDUser;->avatar:Lcom/google/gson/JsonPrimitive;

    .line 112
    invoke-static {p1}, Lcom/launchdarkly/android/LDUser$Builder;->access$1000(Lcom/launchdarkly/android/LDUser$Builder;)Ljava/util/Map;

    move-result-object v0

    invoke-static {v0}, Ljava/util/Collections;->unmodifiableMap(Ljava/util/Map;)Ljava/util/Map;

    move-result-object v0

    iput-object v0, p0, Lcom/launchdarkly/android/LDUser;->custom:Ljava/util/Map;

    .line 114
    invoke-static {p1}, Lcom/launchdarkly/android/LDUser$Builder;->access$1100(Lcom/launchdarkly/android/LDUser$Builder;)Ljava/util/Set;

    move-result-object p1

    iput-object p1, p0, Lcom/launchdarkly/android/LDUser;->privateAttributeNames:Ljava/util/Set;

    .line 116
    invoke-virtual {p0}, Lcom/launchdarkly/android/LDUser;->getJson()Ljava/lang/String;

    move-result-object p1

    .line 117
    invoke-virtual {p1}, Ljava/lang/String;->getBytes()[B

    move-result-object v0

    const/16 v1, 0xa

    invoke-static {v0, v1}, Landroid/util/Base64;->encodeToString([BI)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/launchdarkly/android/LDUser;->urlSafeBase64:Ljava/lang/String;

    .line 118
    sget-object v0, Lcom/launchdarkly/android/LDUser;->USER_HASHER:Lcom/launchdarkly/android/UserHasher;

    invoke-virtual {v0, p1}, Lcom/launchdarkly/android/UserHasher;->hash(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lcom/launchdarkly/android/LDUser;->sharedPrefsKey:Ljava/lang/String;

    return-void
.end method

.method static synthetic access$1200(Lcom/launchdarkly/android/LDUser;)Ljava/util/Map;
    .locals 0

    .line 41
    iget-object p0, p0, Lcom/launchdarkly/android/LDUser;->custom:Ljava/util/Map;

    return-object p0
.end method


# virtual methods
.method getAnonymous()Lcom/google/gson/JsonPrimitive;
    .locals 1

    .line 176
    iget-object v0, p0, Lcom/launchdarkly/android/LDUser;->anonymous:Lcom/google/gson/JsonPrimitive;

    return-object v0
.end method

.method getAsUrlSafeBase64()Ljava/lang/String;
    .locals 1

    .line 128
    iget-object v0, p0, Lcom/launchdarkly/android/LDUser;->urlSafeBase64:Ljava/lang/String;

    return-object v0
.end method

.method getAvatar()Lcom/google/gson/JsonPrimitive;
    .locals 1

    .line 172
    iget-object v0, p0, Lcom/launchdarkly/android/LDUser;->avatar:Lcom/google/gson/JsonPrimitive;

    return-object v0
.end method

.method getCountry()Lcom/google/gson/JsonPrimitive;
    .locals 1

    .line 148
    iget-object v0, p0, Lcom/launchdarkly/android/LDUser;->country:Lcom/google/gson/JsonPrimitive;

    return-object v0
.end method

.method getCustom(Ljava/lang/String;)Lcom/google/gson/JsonElement;
    .locals 1

    .line 180
    iget-object v0, p0, Lcom/launchdarkly/android/LDUser;->custom:Ljava/util/Map;

    if-eqz v0, :cond_0

    .line 181
    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/google/gson/JsonElement;

    return-object p1

    :cond_0
    const/4 p1, 0x0

    return-object p1
.end method

.method getEmail()Lcom/google/gson/JsonPrimitive;
    .locals 1

    .line 168
    iget-object v0, p0, Lcom/launchdarkly/android/LDUser;->email:Lcom/google/gson/JsonPrimitive;

    return-object v0
.end method

.method getFirstName()Lcom/google/gson/JsonPrimitive;
    .locals 1

    .line 160
    iget-object v0, p0, Lcom/launchdarkly/android/LDUser;->firstName:Lcom/google/gson/JsonPrimitive;

    return-object v0
.end method

.method getIp()Lcom/google/gson/JsonPrimitive;
    .locals 1

    .line 144
    iget-object v0, p0, Lcom/launchdarkly/android/LDUser;->ip:Lcom/google/gson/JsonPrimitive;

    return-object v0
.end method

.method getJson()Ljava/lang/String;
    .locals 2
    .annotation build Landroid/support/annotation/VisibleForTesting;
    .end annotation

    .line 124
    sget-object v0, Lcom/launchdarkly/android/LDConfig;->GSON:Lcom/google/gson/Gson;

    instance-of v1, v0, Lcom/google/gson/Gson;

    if-nez v1, :cond_0

    invoke-virtual {v0, p0}, Lcom/google/gson/Gson;->toJson(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    goto :goto_0

    :cond_0
    check-cast v0, Lcom/google/gson/Gson;

    invoke-static {v0, p0}, Lcom/newrelic/agent/android/instrumentation/GsonInstrumentation;->toJson(Lcom/google/gson/Gson;Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    :goto_0
    return-object v0
.end method

.method getKey()Lcom/google/gson/JsonPrimitive;
    .locals 1

    .line 132
    iget-object v0, p0, Lcom/launchdarkly/android/LDUser;->key:Lcom/google/gson/JsonPrimitive;

    return-object v0
.end method

.method getKeyAsString()Ljava/lang/String;
    .locals 1

    .line 136
    iget-object v0, p0, Lcom/launchdarkly/android/LDUser;->key:Lcom/google/gson/JsonPrimitive;

    if-nez v0, :cond_0

    const-string v0, ""

    return-object v0

    .line 139
    :cond_0
    invoke-virtual {v0}, Lcom/google/gson/JsonPrimitive;->getAsString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method getLastName()Lcom/google/gson/JsonPrimitive;
    .locals 1

    .line 164
    iget-object v0, p0, Lcom/launchdarkly/android/LDUser;->lastName:Lcom/google/gson/JsonPrimitive;

    return-object v0
.end method

.method getName()Lcom/google/gson/JsonPrimitive;
    .locals 1

    .line 156
    iget-object v0, p0, Lcom/launchdarkly/android/LDUser;->name:Lcom/google/gson/JsonPrimitive;

    return-object v0
.end method

.method getPrivateAttributeNames()Ljava/util/Set;
    .locals 1
    .annotation build Landroid/support/annotation/NonNull;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Set<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .line 188
    iget-object v0, p0, Lcom/launchdarkly/android/LDUser;->privateAttributeNames:Ljava/util/Set;

    invoke-static {v0}, Ljava/util/Collections;->unmodifiableSet(Ljava/util/Set;)Ljava/util/Set;

    move-result-object v0

    return-object v0
.end method

.method getSecondary()Lcom/google/gson/JsonPrimitive;
    .locals 1

    .line 152
    iget-object v0, p0, Lcom/launchdarkly/android/LDUser;->secondary:Lcom/google/gson/JsonPrimitive;

    return-object v0
.end method

.method getSharedPrefsKey()Ljava/lang/String;
    .locals 1

    .line 192
    iget-object v0, p0, Lcom/launchdarkly/android/LDUser;->sharedPrefsKey:Ljava/lang/String;

    return-object v0
.end method
