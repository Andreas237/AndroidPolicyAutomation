.class public Lcom/launchdarkly/android/LDUser$Builder;
.super Ljava/lang/Object;
.source "LDUser.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/launchdarkly/android/LDUser;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "Builder"
.end annotation


# instance fields
.field private anonymous:Ljava/lang/Boolean;

.field private avatar:Ljava/lang/String;

.field private country:Lcom/launchdarkly/android/LDCountryCode;

.field private final custom:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Lcom/google/gson/JsonElement;",
            ">;"
        }
    .end annotation
.end field

.field private email:Ljava/lang/String;

.field private firstName:Ljava/lang/String;

.field private ip:Ljava/lang/String;

.field private key:Ljava/lang/String;

.field private lastName:Ljava/lang/String;

.field private name:Ljava/lang/String;

.field private final privateAttributeNames:Ljava/util/Set;
    .annotation build Landroid/support/annotation/NonNull;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private secondary:Ljava/lang/String;


# direct methods
.method public constructor <init>(Lcom/launchdarkly/android/LDUser;)V
    .locals 2

    .line 239
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 240
    invoke-virtual {p1}, Lcom/launchdarkly/android/LDUser;->getKey()Lcom/google/gson/JsonPrimitive;

    move-result-object v0

    .line 241
    invoke-virtual {v0}, Lcom/google/gson/JsonPrimitive;->isJsonNull()Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    .line 242
    iput-object v1, p0, Lcom/launchdarkly/android/LDUser$Builder;->key:Ljava/lang/String;

    goto :goto_0

    .line 244
    :cond_0
    invoke-virtual {p1}, Lcom/launchdarkly/android/LDUser;->getKeyAsString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/launchdarkly/android/LDUser$Builder;->key:Ljava/lang/String;

    .line 246
    :goto_0
    invoke-virtual {p1}, Lcom/launchdarkly/android/LDUser;->getAnonymous()Lcom/google/gson/JsonPrimitive;

    move-result-object v0

    if-eqz v0, :cond_1

    invoke-virtual {p1}, Lcom/launchdarkly/android/LDUser;->getAnonymous()Lcom/google/gson/JsonPrimitive;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/gson/JsonPrimitive;->getAsBoolean()Z

    move-result v0

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    goto :goto_1

    :cond_1
    move-object v0, v1

    :goto_1
    iput-object v0, p0, Lcom/launchdarkly/android/LDUser$Builder;->anonymous:Ljava/lang/Boolean;

    .line 248
    invoke-virtual {p1}, Lcom/launchdarkly/android/LDUser;->getSecondary()Lcom/google/gson/JsonPrimitive;

    move-result-object v0

    if-eqz v0, :cond_2

    invoke-virtual {p1}, Lcom/launchdarkly/android/LDUser;->getSecondary()Lcom/google/gson/JsonPrimitive;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/gson/JsonPrimitive;->getAsString()Ljava/lang/String;

    move-result-object v0

    goto :goto_2

    :cond_2
    move-object v0, v1

    :goto_2
    iput-object v0, p0, Lcom/launchdarkly/android/LDUser$Builder;->secondary:Ljava/lang/String;

    .line 249
    invoke-virtual {p1}, Lcom/launchdarkly/android/LDUser;->getIp()Lcom/google/gson/JsonPrimitive;

    move-result-object v0

    if-eqz v0, :cond_3

    invoke-virtual {p1}, Lcom/launchdarkly/android/LDUser;->getIp()Lcom/google/gson/JsonPrimitive;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/gson/JsonPrimitive;->getAsString()Ljava/lang/String;

    move-result-object v0

    goto :goto_3

    :cond_3
    move-object v0, v1

    :goto_3
    iput-object v0, p0, Lcom/launchdarkly/android/LDUser$Builder;->ip:Ljava/lang/String;

    .line 250
    invoke-virtual {p1}, Lcom/launchdarkly/android/LDUser;->getFirstName()Lcom/google/gson/JsonPrimitive;

    move-result-object v0

    if-eqz v0, :cond_4

    invoke-virtual {p1}, Lcom/launchdarkly/android/LDUser;->getFirstName()Lcom/google/gson/JsonPrimitive;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/gson/JsonPrimitive;->getAsString()Ljava/lang/String;

    move-result-object v0

    goto :goto_4

    :cond_4
    move-object v0, v1

    :goto_4
    iput-object v0, p0, Lcom/launchdarkly/android/LDUser$Builder;->firstName:Ljava/lang/String;

    .line 251
    invoke-virtual {p1}, Lcom/launchdarkly/android/LDUser;->getLastName()Lcom/google/gson/JsonPrimitive;

    move-result-object v0

    if-eqz v0, :cond_5

    invoke-virtual {p1}, Lcom/launchdarkly/android/LDUser;->getLastName()Lcom/google/gson/JsonPrimitive;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/gson/JsonPrimitive;->getAsString()Ljava/lang/String;

    move-result-object v0

    goto :goto_5

    :cond_5
    move-object v0, v1

    :goto_5
    iput-object v0, p0, Lcom/launchdarkly/android/LDUser$Builder;->lastName:Ljava/lang/String;

    .line 252
    invoke-virtual {p1}, Lcom/launchdarkly/android/LDUser;->getEmail()Lcom/google/gson/JsonPrimitive;

    move-result-object v0

    if-eqz v0, :cond_6

    invoke-virtual {p1}, Lcom/launchdarkly/android/LDUser;->getEmail()Lcom/google/gson/JsonPrimitive;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/gson/JsonPrimitive;->getAsString()Ljava/lang/String;

    move-result-object v0

    goto :goto_6

    :cond_6
    move-object v0, v1

    :goto_6
    iput-object v0, p0, Lcom/launchdarkly/android/LDUser$Builder;->email:Ljava/lang/String;

    .line 253
    invoke-virtual {p1}, Lcom/launchdarkly/android/LDUser;->getName()Lcom/google/gson/JsonPrimitive;

    move-result-object v0

    if-eqz v0, :cond_7

    invoke-virtual {p1}, Lcom/launchdarkly/android/LDUser;->getName()Lcom/google/gson/JsonPrimitive;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/gson/JsonPrimitive;->getAsString()Ljava/lang/String;

    move-result-object v0

    goto :goto_7

    :cond_7
    move-object v0, v1

    :goto_7
    iput-object v0, p0, Lcom/launchdarkly/android/LDUser$Builder;->name:Ljava/lang/String;

    .line 254
    invoke-virtual {p1}, Lcom/launchdarkly/android/LDUser;->getAvatar()Lcom/google/gson/JsonPrimitive;

    move-result-object v0

    if-eqz v0, :cond_8

    invoke-virtual {p1}, Lcom/launchdarkly/android/LDUser;->getAvatar()Lcom/google/gson/JsonPrimitive;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/gson/JsonPrimitive;->getAsString()Ljava/lang/String;

    move-result-object v0

    goto :goto_8

    :cond_8
    move-object v0, v1

    :goto_8
    iput-object v0, p0, Lcom/launchdarkly/android/LDUser$Builder;->avatar:Ljava/lang/String;

    .line 255
    invoke-virtual {p1}, Lcom/launchdarkly/android/LDUser;->getCountry()Lcom/google/gson/JsonPrimitive;

    move-result-object v0

    if-eqz v0, :cond_9

    invoke-virtual {p1}, Lcom/launchdarkly/android/LDUser;->getCountry()Lcom/google/gson/JsonPrimitive;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/gson/JsonPrimitive;->getAsString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/launchdarkly/android/LDCountryCode;->valueOf(Ljava/lang/String;)Lcom/launchdarkly/android/LDCountryCode;

    move-result-object v1

    :cond_9
    iput-object v1, p0, Lcom/launchdarkly/android/LDUser$Builder;->country:Lcom/launchdarkly/android/LDCountryCode;

    .line 256
    new-instance v0, Ljava/util/HashMap;

    invoke-static {p1}, Lcom/launchdarkly/android/LDUser;->access$1200(Lcom/launchdarkly/android/LDUser;)Ljava/util/Map;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/util/HashMap;-><init>(Ljava/util/Map;)V

    iput-object v0, p0, Lcom/launchdarkly/android/LDUser$Builder;->custom:Ljava/util/Map;

    .line 258
    new-instance v0, Ljava/util/HashSet;

    invoke-virtual {p1}, Lcom/launchdarkly/android/LDUser;->getPrivateAttributeNames()Ljava/util/Set;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/util/HashSet;-><init>(Ljava/util/Collection;)V

    iput-object v0, p0, Lcom/launchdarkly/android/LDUser$Builder;->privateAttributeNames:Ljava/util/Set;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;)V
    .locals 4

    .line 230
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 231
    iput-object p1, p0, Lcom/launchdarkly/android/LDUser$Builder;->key:Ljava/lang/String;

    .line 232
    new-instance p1, Ljava/util/HashMap;

    invoke-direct {p1}, Ljava/util/HashMap;-><init>()V

    iput-object p1, p0, Lcom/launchdarkly/android/LDUser$Builder;->custom:Ljava/util/Map;

    .line 234
    iget-object p1, p0, Lcom/launchdarkly/android/LDUser$Builder;->custom:Ljava/util/Map;

    const-string v0, "os"

    new-instance v1, Lcom/google/gson/JsonPrimitive;

    sget v2, Landroid/os/Build$VERSION;->SDK_INT:I

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-direct {v1, v2}, Lcom/google/gson/JsonPrimitive;-><init>(Ljava/lang/Number;)V

    invoke-interface {p1, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 235
    iget-object p1, p0, Lcom/launchdarkly/android/LDUser$Builder;->custom:Ljava/util/Map;

    const-string v0, "device"

    new-instance v1, Lcom/google/gson/JsonPrimitive;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    sget-object v3, Landroid/os/Build;->MODEL:Ljava/lang/String;

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v3, " "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    sget-object v3, Landroid/os/Build;->PRODUCT:Ljava/lang/String;

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, v2}, Lcom/google/gson/JsonPrimitive;-><init>(Ljava/lang/String;)V

    invoke-interface {p1, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 236
    new-instance p1, Ljava/util/HashSet;

    invoke-direct {p1}, Ljava/util/HashSet;-><init>()V

    iput-object p1, p0, Lcom/launchdarkly/android/LDUser$Builder;->privateAttributeNames:Ljava/util/Set;

    return-void
.end method

.method static synthetic access$000(Lcom/launchdarkly/android/LDUser$Builder;)Ljava/lang/String;
    .locals 0

    .line 206
    iget-object p0, p0, Lcom/launchdarkly/android/LDUser$Builder;->key:Ljava/lang/String;

    return-object p0
.end method

.method static synthetic access$100(Lcom/launchdarkly/android/LDUser$Builder;)Ljava/lang/Boolean;
    .locals 0

    .line 206
    iget-object p0, p0, Lcom/launchdarkly/android/LDUser$Builder;->anonymous:Ljava/lang/Boolean;

    return-object p0
.end method

.method static synthetic access$1000(Lcom/launchdarkly/android/LDUser$Builder;)Ljava/util/Map;
    .locals 0

    .line 206
    iget-object p0, p0, Lcom/launchdarkly/android/LDUser$Builder;->custom:Ljava/util/Map;

    return-object p0
.end method

.method static synthetic access$1100(Lcom/launchdarkly/android/LDUser$Builder;)Ljava/util/Set;
    .locals 0

    .line 206
    iget-object p0, p0, Lcom/launchdarkly/android/LDUser$Builder;->privateAttributeNames:Ljava/util/Set;

    return-object p0
.end method

.method static synthetic access$200(Lcom/launchdarkly/android/LDUser$Builder;)Ljava/lang/String;
    .locals 0

    .line 206
    iget-object p0, p0, Lcom/launchdarkly/android/LDUser$Builder;->ip:Ljava/lang/String;

    return-object p0
.end method

.method static synthetic access$300(Lcom/launchdarkly/android/LDUser$Builder;)Lcom/launchdarkly/android/LDCountryCode;
    .locals 0

    .line 206
    iget-object p0, p0, Lcom/launchdarkly/android/LDUser$Builder;->country:Lcom/launchdarkly/android/LDCountryCode;

    return-object p0
.end method

.method static synthetic access$400(Lcom/launchdarkly/android/LDUser$Builder;)Ljava/lang/String;
    .locals 0

    .line 206
    iget-object p0, p0, Lcom/launchdarkly/android/LDUser$Builder;->secondary:Ljava/lang/String;

    return-object p0
.end method

.method static synthetic access$500(Lcom/launchdarkly/android/LDUser$Builder;)Ljava/lang/String;
    .locals 0

    .line 206
    iget-object p0, p0, Lcom/launchdarkly/android/LDUser$Builder;->firstName:Ljava/lang/String;

    return-object p0
.end method

.method static synthetic access$600(Lcom/launchdarkly/android/LDUser$Builder;)Ljava/lang/String;
    .locals 0

    .line 206
    iget-object p0, p0, Lcom/launchdarkly/android/LDUser$Builder;->lastName:Ljava/lang/String;

    return-object p0
.end method

.method static synthetic access$700(Lcom/launchdarkly/android/LDUser$Builder;)Ljava/lang/String;
    .locals 0

    .line 206
    iget-object p0, p0, Lcom/launchdarkly/android/LDUser$Builder;->email:Ljava/lang/String;

    return-object p0
.end method

.method static synthetic access$800(Lcom/launchdarkly/android/LDUser$Builder;)Ljava/lang/String;
    .locals 0

    .line 206
    iget-object p0, p0, Lcom/launchdarkly/android/LDUser$Builder;->name:Ljava/lang/String;

    return-object p0
.end method

.method static synthetic access$900(Lcom/launchdarkly/android/LDUser$Builder;)Ljava/lang/String;
    .locals 0

    .line 206
    iget-object p0, p0, Lcom/launchdarkly/android/LDUser$Builder;->avatar:Ljava/lang/String;

    return-object p0
.end method

.method private checkCustomAttribute(Ljava/lang/String;)V
    .locals 5

    .line 684
    invoke-static {}, Lcom/launchdarkly/android/UserAttribute;->values()[Lcom/launchdarkly/android/UserAttribute;

    move-result-object v0

    array-length v1, v0

    const/4 v2, 0x0

    const/4 v3, 0x0

    :goto_0
    if-ge v3, v1, :cond_1

    aget-object v4, v0, v3

    .line 685
    invoke-virtual {v4}, Lcom/launchdarkly/android/UserAttribute;->name()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v4, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_0

    const-string v0, "Built-in attribute key: %s added as custom attribute! This custom attribute will be ignored during Feature Flag evaluation"

    const/4 v1, 0x1

    .line 686
    new-array v1, v1, [Ljava/lang/Object;

    aput-object p1, v1, v2

    invoke-static {v0, v1}, Ltimber/log/Timber;->w(Ljava/lang/String;[Ljava/lang/Object;)V

    return-void

    :cond_0
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_1
    return-void
.end method

.method private countryCode(Ljava/lang/String;)Lcom/launchdarkly/android/LDCountryCode;
    .locals 6

    const/4 v0, 0x0

    .line 323
    invoke-static {p1, v0}, Lcom/launchdarkly/android/LDCountryCode;->getByCode(Ljava/lang/String;Z)Lcom/launchdarkly/android/LDCountryCode;

    move-result-object v1

    if-nez v1, :cond_4

    .line 326
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "^"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {p1}, Ljava/util/regex/Pattern;->quote(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v3, ".*"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Lcom/launchdarkly/android/LDCountryCode;->findByName(Ljava/lang/String;)Ljava/util/List;

    move-result-object v2

    .line 328
    invoke-interface {v2}, Ljava/util/List;->isEmpty()Z

    move-result v3

    const/4 v4, 0x1

    if-eqz v3, :cond_0

    const-string v2, "Invalid country. Expected valid ISO-3166-1 code: %s"

    .line 329
    new-array v3, v4, [Ljava/lang/Object;

    aput-object p1, v3, v0

    invoke-static {v2, v3}, Ltimber/log/Timber;->w(Ljava/lang/String;[Ljava/lang/Object;)V

    goto :goto_0

    .line 330
    :cond_0
    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v1

    if-le v1, v4, :cond_3

    .line 332
    invoke-interface {v2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_2

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/launchdarkly/android/LDCountryCode;

    .line 333
    invoke-virtual {v3}, Lcom/launchdarkly/android/LDCountryCode;->getName()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v5, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_1

    return-object v3

    :cond_2
    const-string v1, "Ambiguous country. Provided code matches multiple countries: %s"

    .line 338
    new-array v3, v4, [Ljava/lang/Object;

    aput-object p1, v3, v0

    invoke-static {v1, v3}, Ltimber/log/Timber;->w(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 339
    invoke-interface {v2, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    move-object v1, p1

    check-cast v1, Lcom/launchdarkly/android/LDCountryCode;

    goto :goto_0

    .line 341
    :cond_3
    invoke-interface {v2, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    move-object v1, p1

    check-cast v1, Lcom/launchdarkly/android/LDCountryCode;

    :cond_4
    :goto_0
    return-object v1
.end method

.method private custom(Ljava/util/Map;Ljava/lang/String;Ljava/lang/Object;)Lcom/launchdarkly/android/LDUser$Builder;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "TT;>;",
            "Ljava/lang/String;",
            "TT;)",
            "Lcom/launchdarkly/android/LDUser$Builder;"
        }
    .end annotation

    .line 526
    invoke-direct {p0, p2}, Lcom/launchdarkly/android/LDUser$Builder;->checkCustomAttribute(Ljava/lang/String;)V

    if-eqz p2, :cond_0

    if-eqz p3, :cond_0

    .line 528
    invoke-interface {p1, p2, p3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_0
    return-object p0
.end method

.method private custom(Ljava/util/Map;Ljava/lang/String;Ljava/util/List;)Lcom/launchdarkly/android/LDUser$Builder;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Lcom/google/gson/JsonElement;",
            ">;",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;)",
            "Lcom/launchdarkly/android/LDUser$Builder;"
        }
    .end annotation

    .line 632
    invoke-direct {p0, p2}, Lcom/launchdarkly/android/LDUser$Builder;->checkCustomAttribute(Ljava/lang/String;)V

    .line 633
    new-instance p1, Lcom/google/gson/JsonArray;

    invoke-direct {p1}, Lcom/google/gson/JsonArray;-><init>()V

    .line 634
    invoke-interface {p3}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p3

    :cond_0
    :goto_0
    invoke-interface {p3}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {p3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    if-eqz v0, :cond_0

    .line 636
    new-instance v1, Lcom/google/gson/JsonPrimitive;

    invoke-direct {v1, v0}, Lcom/google/gson/JsonPrimitive;-><init>(Ljava/lang/String;)V

    invoke-virtual {p1, v1}, Lcom/google/gson/JsonArray;->add(Lcom/google/gson/JsonElement;)V

    goto :goto_0

    .line 639
    :cond_1
    iget-object p3, p0, Lcom/launchdarkly/android/LDUser$Builder;->custom:Ljava/util/Map;

    invoke-interface {p3, p2, p1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-object p0
.end method

.method private customNumber(Ljava/util/Map;Ljava/lang/String;Ljava/util/List;)Lcom/launchdarkly/android/LDUser$Builder;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Lcom/google/gson/JsonElement;",
            ">;",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Ljava/lang/Number;",
            ">;)",
            "Lcom/launchdarkly/android/LDUser$Builder;"
        }
    .end annotation

    .line 672
    invoke-direct {p0, p2}, Lcom/launchdarkly/android/LDUser$Builder;->checkCustomAttribute(Ljava/lang/String;)V

    .line 673
    new-instance v0, Lcom/google/gson/JsonArray;

    invoke-direct {v0}, Lcom/google/gson/JsonArray;-><init>()V

    .line 674
    invoke-interface {p3}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p3

    :cond_0
    :goto_0
    invoke-interface {p3}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {p3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Number;

    if-eqz v1, :cond_0

    .line 676
    new-instance v2, Lcom/google/gson/JsonPrimitive;

    invoke-direct {v2, v1}, Lcom/google/gson/JsonPrimitive;-><init>(Ljava/lang/Number;)V

    invoke-virtual {v0, v2}, Lcom/google/gson/JsonArray;->add(Lcom/google/gson/JsonElement;)V

    goto :goto_0

    .line 679
    :cond_1
    invoke-interface {p1, p2, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-object p0
.end method


# virtual methods
.method public anonymous(Z)Lcom/launchdarkly/android/LDUser$Builder;
    .locals 0

    .line 401
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    iput-object p1, p0, Lcom/launchdarkly/android/LDUser$Builder;->anonymous:Ljava/lang/Boolean;

    return-object p0
.end method

.method public avatar(Ljava/lang/String;)Lcom/launchdarkly/android/LDUser$Builder;
    .locals 0

    .line 458
    iput-object p1, p0, Lcom/launchdarkly/android/LDUser$Builder;->avatar:Ljava/lang/String;

    return-object p0
.end method

.method public build()Lcom/launchdarkly/android/LDUser;
    .locals 1

    .line 704
    new-instance v0, Lcom/launchdarkly/android/LDUser;

    invoke-direct {v0, p0}, Lcom/launchdarkly/android/LDUser;-><init>(Lcom/launchdarkly/android/LDUser$Builder;)V

    return-object v0
.end method

.method public country(Lcom/launchdarkly/android/LDCountryCode;)Lcom/launchdarkly/android/LDUser$Builder;
    .locals 0

    .line 355
    iput-object p1, p0, Lcom/launchdarkly/android/LDUser$Builder;->country:Lcom/launchdarkly/android/LDCountryCode;

    return-object p0
.end method

.method public country(Ljava/lang/String;)Lcom/launchdarkly/android/LDUser$Builder;
    .locals 0

    .line 303
    invoke-direct {p0, p1}, Lcom/launchdarkly/android/LDUser$Builder;->countryCode(Ljava/lang/String;)Lcom/launchdarkly/android/LDCountryCode;

    move-result-object p1

    iput-object p1, p0, Lcom/launchdarkly/android/LDUser$Builder;->country:Lcom/launchdarkly/android/LDCountryCode;

    return-object p0
.end method

.method public custom(Ljava/lang/String;Ljava/lang/Boolean;)Lcom/launchdarkly/android/LDUser$Builder;
    .locals 2

    .line 571
    iget-object v0, p0, Lcom/launchdarkly/android/LDUser$Builder;->custom:Ljava/util/Map;

    new-instance v1, Lcom/google/gson/JsonPrimitive;

    invoke-direct {v1, p2}, Lcom/google/gson/JsonPrimitive;-><init>(Ljava/lang/Boolean;)V

    invoke-direct {p0, v0, p1, v1}, Lcom/launchdarkly/android/LDUser$Builder;->custom(Ljava/util/Map;Ljava/lang/String;Ljava/lang/Object;)Lcom/launchdarkly/android/LDUser$Builder;

    move-result-object p1

    return-object p1
.end method

.method public custom(Ljava/lang/String;Ljava/lang/Number;)Lcom/launchdarkly/android/LDUser$Builder;
    .locals 2

    .line 543
    iget-object v0, p0, Lcom/launchdarkly/android/LDUser$Builder;->custom:Ljava/util/Map;

    new-instance v1, Lcom/google/gson/JsonPrimitive;

    invoke-direct {v1, p2}, Lcom/google/gson/JsonPrimitive;-><init>(Ljava/lang/Number;)V

    invoke-direct {p0, v0, p1, v1}, Lcom/launchdarkly/android/LDUser$Builder;->custom(Ljava/util/Map;Ljava/lang/String;Ljava/lang/Object;)Lcom/launchdarkly/android/LDUser$Builder;

    move-result-object p1

    return-object p1
.end method

.method public custom(Ljava/lang/String;Ljava/lang/String;)Lcom/launchdarkly/android/LDUser$Builder;
    .locals 2

    .line 507
    iget-object v0, p0, Lcom/launchdarkly/android/LDUser$Builder;->custom:Ljava/util/Map;

    new-instance v1, Lcom/google/gson/JsonPrimitive;

    invoke-direct {v1, p2}, Lcom/google/gson/JsonPrimitive;-><init>(Ljava/lang/String;)V

    invoke-direct {p0, v0, p1, v1}, Lcom/launchdarkly/android/LDUser$Builder;->custom(Ljava/util/Map;Ljava/lang/String;Ljava/lang/Object;)Lcom/launchdarkly/android/LDUser$Builder;

    move-result-object p1

    return-object p1
.end method

.method public custom(Ljava/lang/String;Ljava/util/List;)Lcom/launchdarkly/android/LDUser$Builder;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;)",
            "Lcom/launchdarkly/android/LDUser$Builder;"
        }
    .end annotation

    .line 600
    iget-object v0, p0, Lcom/launchdarkly/android/LDUser$Builder;->custom:Ljava/util/Map;

    invoke-direct {p0, v0, p1, p2}, Lcom/launchdarkly/android/LDUser$Builder;->custom(Ljava/util/Map;Ljava/lang/String;Ljava/util/List;)Lcom/launchdarkly/android/LDUser$Builder;

    move-result-object p1

    return-object p1
.end method

.method public customNumber(Ljava/lang/String;Ljava/util/List;)Lcom/launchdarkly/android/LDUser$Builder;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Ljava/lang/Number;",
            ">;)",
            "Lcom/launchdarkly/android/LDUser$Builder;"
        }
    .end annotation

    .line 653
    iget-object v0, p0, Lcom/launchdarkly/android/LDUser$Builder;->custom:Ljava/util/Map;

    invoke-direct {p0, v0, p1, p2}, Lcom/launchdarkly/android/LDUser$Builder;->customNumber(Ljava/util/Map;Ljava/lang/String;Ljava/util/List;)Lcom/launchdarkly/android/LDUser$Builder;

    move-result-object p1

    return-object p1
.end method

.method public customString(Ljava/lang/String;Ljava/util/List;)Lcom/launchdarkly/android/LDUser$Builder;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;)",
            "Lcom/launchdarkly/android/LDUser$Builder;"
        }
    .end annotation

    .line 613
    iget-object v0, p0, Lcom/launchdarkly/android/LDUser$Builder;->custom:Ljava/util/Map;

    invoke-direct {p0, v0, p1, p2}, Lcom/launchdarkly/android/LDUser$Builder;->custom(Ljava/util/Map;Ljava/lang/String;Ljava/util/List;)Lcom/launchdarkly/android/LDUser$Builder;

    move-result-object p1

    return-object p1
.end method

.method public email(Ljava/lang/String;)Lcom/launchdarkly/android/LDUser$Builder;
    .locals 0

    .line 481
    iput-object p1, p0, Lcom/launchdarkly/android/LDUser$Builder;->email:Ljava/lang/String;

    return-object p0
.end method

.method public firstName(Ljava/lang/String;)Lcom/launchdarkly/android/LDUser$Builder;
    .locals 0

    .line 378
    iput-object p1, p0, Lcom/launchdarkly/android/LDUser$Builder;->firstName:Ljava/lang/String;

    return-object p0
.end method

.method getPrivateAttributeNames()Ljava/util/Set;
    .locals 1
    .annotation build Landroid/support/annotation/NonNull;
    .end annotation

    .annotation build Landroid/support/annotation/VisibleForTesting;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Set<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .line 695
    iget-object v0, p0, Lcom/launchdarkly/android/LDUser$Builder;->privateAttributeNames:Ljava/util/Set;

    return-object v0
.end method

.method public ip(Ljava/lang/String;)Lcom/launchdarkly/android/LDUser$Builder;
    .locals 0

    .line 268
    iput-object p1, p0, Lcom/launchdarkly/android/LDUser$Builder;->ip:Ljava/lang/String;

    return-object p0
.end method

.method public lastName(Ljava/lang/String;)Lcom/launchdarkly/android/LDUser$Builder;
    .locals 0

    .line 412
    iput-object p1, p0, Lcom/launchdarkly/android/LDUser$Builder;->lastName:Ljava/lang/String;

    return-object p0
.end method

.method public name(Ljava/lang/String;)Lcom/launchdarkly/android/LDUser$Builder;
    .locals 0

    .line 435
    iput-object p1, p0, Lcom/launchdarkly/android/LDUser$Builder;->name:Ljava/lang/String;

    return-object p0
.end method

.method public privateAvatar(Ljava/lang/String;)Lcom/launchdarkly/android/LDUser$Builder;
    .locals 2

    .line 470
    iget-object v0, p0, Lcom/launchdarkly/android/LDUser$Builder;->privateAttributeNames:Ljava/util/Set;

    const-string v1, "avatar"

    invoke-interface {v0, v1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 471
    invoke-virtual {p0, p1}, Lcom/launchdarkly/android/LDUser$Builder;->avatar(Ljava/lang/String;)Lcom/launchdarkly/android/LDUser$Builder;

    move-result-object p1

    return-object p1
.end method

.method public privateCountry(Lcom/launchdarkly/android/LDCountryCode;)Lcom/launchdarkly/android/LDUser$Builder;
    .locals 2

    .line 367
    iget-object v0, p0, Lcom/launchdarkly/android/LDUser$Builder;->privateAttributeNames:Ljava/util/Set;

    const-string v1, "country"

    invoke-interface {v0, v1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 368
    invoke-virtual {p0, p1}, Lcom/launchdarkly/android/LDUser$Builder;->country(Lcom/launchdarkly/android/LDCountryCode;)Lcom/launchdarkly/android/LDUser$Builder;

    move-result-object p1

    return-object p1
.end method

.method public privateCountry(Ljava/lang/String;)Lcom/launchdarkly/android/LDUser$Builder;
    .locals 2

    .line 318
    iget-object v0, p0, Lcom/launchdarkly/android/LDUser$Builder;->privateAttributeNames:Ljava/util/Set;

    const-string v1, "country"

    invoke-interface {v0, v1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 319
    invoke-virtual {p0, p1}, Lcom/launchdarkly/android/LDUser$Builder;->country(Ljava/lang/String;)Lcom/launchdarkly/android/LDUser$Builder;

    move-result-object p1

    return-object p1
.end method

.method public privateCustom(Ljava/lang/String;Ljava/lang/Boolean;)Lcom/launchdarkly/android/LDUser$Builder;
    .locals 1

    .line 585
    iget-object v0, p0, Lcom/launchdarkly/android/LDUser$Builder;->privateAttributeNames:Ljava/util/Set;

    invoke-interface {v0, p1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 586
    invoke-virtual {p0, p1, p2}, Lcom/launchdarkly/android/LDUser$Builder;->custom(Ljava/lang/String;Ljava/lang/Boolean;)Lcom/launchdarkly/android/LDUser$Builder;

    move-result-object p1

    return-object p1
.end method

.method public privateCustom(Ljava/lang/String;Ljava/lang/Number;)Lcom/launchdarkly/android/LDUser$Builder;
    .locals 1

    .line 557
    iget-object v0, p0, Lcom/launchdarkly/android/LDUser$Builder;->privateAttributeNames:Ljava/util/Set;

    invoke-interface {v0, p1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 558
    invoke-virtual {p0, p1, p2}, Lcom/launchdarkly/android/LDUser$Builder;->custom(Ljava/lang/String;Ljava/lang/Number;)Lcom/launchdarkly/android/LDUser$Builder;

    move-result-object p1

    return-object p1
.end method

.method public privateCustom(Ljava/lang/String;Ljava/lang/String;)Lcom/launchdarkly/android/LDUser$Builder;
    .locals 1

    .line 521
    iget-object v0, p0, Lcom/launchdarkly/android/LDUser$Builder;->privateAttributeNames:Ljava/util/Set;

    invoke-interface {v0, p1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 522
    invoke-virtual {p0, p1, p2}, Lcom/launchdarkly/android/LDUser$Builder;->custom(Ljava/lang/String;Ljava/lang/String;)Lcom/launchdarkly/android/LDUser$Builder;

    move-result-object p1

    return-object p1
.end method

.method public privateCustomNumber(Ljava/lang/String;Ljava/util/List;)Lcom/launchdarkly/android/LDUser$Builder;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Ljava/lang/Number;",
            ">;)",
            "Lcom/launchdarkly/android/LDUser$Builder;"
        }
    .end annotation

    .line 667
    iget-object v0, p0, Lcom/launchdarkly/android/LDUser$Builder;->privateAttributeNames:Ljava/util/Set;

    invoke-interface {v0, p1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 668
    invoke-virtual {p0, p1, p2}, Lcom/launchdarkly/android/LDUser$Builder;->customNumber(Ljava/lang/String;Ljava/util/List;)Lcom/launchdarkly/android/LDUser$Builder;

    move-result-object p1

    return-object p1
.end method

.method public privateCustomString(Ljava/lang/String;Ljava/util/List;)Lcom/launchdarkly/android/LDUser$Builder;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;)",
            "Lcom/launchdarkly/android/LDUser$Builder;"
        }
    .end annotation

    .line 627
    iget-object v0, p0, Lcom/launchdarkly/android/LDUser$Builder;->privateAttributeNames:Ljava/util/Set;

    invoke-interface {v0, p1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 628
    invoke-virtual {p0, p1, p2}, Lcom/launchdarkly/android/LDUser$Builder;->customString(Ljava/lang/String;Ljava/util/List;)Lcom/launchdarkly/android/LDUser$Builder;

    move-result-object p1

    return-object p1
.end method

.method public privateEmail(Ljava/lang/String;)Lcom/launchdarkly/android/LDUser$Builder;
    .locals 2

    .line 493
    iget-object v0, p0, Lcom/launchdarkly/android/LDUser$Builder;->privateAttributeNames:Ljava/util/Set;

    const-string v1, "email"

    invoke-interface {v0, v1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 494
    invoke-virtual {p0, p1}, Lcom/launchdarkly/android/LDUser$Builder;->email(Ljava/lang/String;)Lcom/launchdarkly/android/LDUser$Builder;

    move-result-object p1

    return-object p1
.end method

.method public privateFirstName(Ljava/lang/String;)Lcom/launchdarkly/android/LDUser$Builder;
    .locals 2

    .line 390
    iget-object v0, p0, Lcom/launchdarkly/android/LDUser$Builder;->privateAttributeNames:Ljava/util/Set;

    const-string v1, "firstName"

    invoke-interface {v0, v1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 391
    invoke-virtual {p0, p1}, Lcom/launchdarkly/android/LDUser$Builder;->firstName(Ljava/lang/String;)Lcom/launchdarkly/android/LDUser$Builder;

    move-result-object p1

    return-object p1
.end method

.method public privateIp(Ljava/lang/String;)Lcom/launchdarkly/android/LDUser$Builder;
    .locals 2

    .line 280
    iget-object v0, p0, Lcom/launchdarkly/android/LDUser$Builder;->privateAttributeNames:Ljava/util/Set;

    const-string v1, "ip"

    invoke-interface {v0, v1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 281
    invoke-virtual {p0, p1}, Lcom/launchdarkly/android/LDUser$Builder;->ip(Ljava/lang/String;)Lcom/launchdarkly/android/LDUser$Builder;

    move-result-object p1

    return-object p1
.end method

.method public privateLastName(Ljava/lang/String;)Lcom/launchdarkly/android/LDUser$Builder;
    .locals 2

    .line 424
    iget-object v0, p0, Lcom/launchdarkly/android/LDUser$Builder;->privateAttributeNames:Ljava/util/Set;

    const-string v1, "lastName"

    invoke-interface {v0, v1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 425
    invoke-virtual {p0, p1}, Lcom/launchdarkly/android/LDUser$Builder;->lastName(Ljava/lang/String;)Lcom/launchdarkly/android/LDUser$Builder;

    move-result-object p1

    return-object p1
.end method

.method public privateName(Ljava/lang/String;)Lcom/launchdarkly/android/LDUser$Builder;
    .locals 2

    .line 447
    iget-object v0, p0, Lcom/launchdarkly/android/LDUser$Builder;->privateAttributeNames:Ljava/util/Set;

    const-string v1, "name"

    invoke-interface {v0, v1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 448
    invoke-virtual {p0, p1}, Lcom/launchdarkly/android/LDUser$Builder;->name(Ljava/lang/String;)Lcom/launchdarkly/android/LDUser$Builder;

    move-result-object p1

    return-object p1
.end method

.method public privateSecondary(Ljava/lang/String;)Lcom/launchdarkly/android/LDUser$Builder;
    .locals 2

    .line 290
    iget-object v0, p0, Lcom/launchdarkly/android/LDUser$Builder;->privateAttributeNames:Ljava/util/Set;

    const-string v1, "secondary"

    invoke-interface {v0, v1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 291
    invoke-virtual {p0, p1}, Lcom/launchdarkly/android/LDUser$Builder;->secondary(Ljava/lang/String;)Lcom/launchdarkly/android/LDUser$Builder;

    move-result-object p1

    return-object p1
.end method

.method public secondary(Ljava/lang/String;)Lcom/launchdarkly/android/LDUser$Builder;
    .locals 0

    .line 285
    iput-object p1, p0, Lcom/launchdarkly/android/LDUser$Builder;->secondary:Ljava/lang/String;

    return-object p0
.end method
