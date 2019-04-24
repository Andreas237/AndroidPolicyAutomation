.class Lcom/launchdarkly/android/LDUser$LDUserPrivateAttributesTypeAdapter;
.super Lcom/google/gson/TypeAdapter;
.source "LDUser.java"


# annotations
.annotation build Lcom/newrelic/agent/android/instrumentation/Instrumented;
.end annotation

.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/launchdarkly/android/LDUser;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "LDUserPrivateAttributesTypeAdapter"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/google/gson/TypeAdapter<",
        "Lcom/launchdarkly/android/LDUser;",
        ">;"
    }
.end annotation


# static fields
.field static final PRIVATE_ATTRS:Ljava/lang/String; = "privateAttrs"


# instance fields
.field private final config:Lcom/launchdarkly/android/LDConfig;


# direct methods
.method constructor <init>(Lcom/launchdarkly/android/LDConfig;)V
    .locals 0

    .line 715
    invoke-direct {p0}, Lcom/google/gson/TypeAdapter;-><init>()V

    .line 716
    iput-object p1, p0, Lcom/launchdarkly/android/LDUser$LDUserPrivateAttributesTypeAdapter;->config:Lcom/launchdarkly/android/LDConfig;

    return-void
.end method

.method private checkAndAddPrivate(Ljava/lang/String;Lcom/launchdarkly/android/LDUser;Ljava/util/Set;)Z
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lcom/launchdarkly/android/LDUser;",
            "Ljava/util/Set<",
            "Ljava/lang/String;",
            ">;)Z"
        }
    .end annotation

    .line 826
    iget-object v0, p0, Lcom/launchdarkly/android/LDUser$LDUserPrivateAttributesTypeAdapter;->config:Lcom/launchdarkly/android/LDConfig;

    invoke-virtual {v0}, Lcom/launchdarkly/android/LDConfig;->allAttributesPrivate()Z

    move-result v0

    const/4 v1, 0x0

    const/4 v2, 0x1

    if-nez v0, :cond_1

    iget-object v0, p0, Lcom/launchdarkly/android/LDUser$LDUserPrivateAttributesTypeAdapter;->config:Lcom/launchdarkly/android/LDConfig;

    .line 827
    invoke-virtual {v0}, Lcom/launchdarkly/android/LDConfig;->getPrivateAttributeNames()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0, p1}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 828
    invoke-virtual {p2}, Lcom/launchdarkly/android/LDUser;->getPrivateAttributeNames()Ljava/util/Set;

    move-result-object p2

    invoke-interface {p2, p1}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result p2

    if-eqz p2, :cond_0

    goto :goto_0

    :cond_0
    const/4 p2, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 p2, 0x1

    :goto_1
    if-eqz p2, :cond_2

    const-string p2, "device"

    .line 829
    invoke-virtual {p1, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p2

    if-nez p2, :cond_2

    const-string p2, "os"

    invoke-virtual {p1, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p2

    if-nez p2, :cond_2

    const/4 v1, 0x1

    :cond_2
    if-eqz v1, :cond_3

    .line 832
    invoke-interface {p3, p1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    :cond_3
    return v1
.end method

.method private writeCustomAttrs(Lcom/google/gson/stream/JsonWriter;Lcom/launchdarkly/android/LDUser;Ljava/util/Set;)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/gson/stream/JsonWriter;",
            "Lcom/launchdarkly/android/LDUser;",
            "Ljava/util/Set<",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 791
    invoke-static {p2}, Lcom/launchdarkly/android/LDUser;->access$1200(Lcom/launchdarkly/android/LDUser;)Ljava/util/Map;

    move-result-object v0

    if-nez v0, :cond_0

    return-void

    .line 794
    :cond_0
    invoke-static {p2}, Lcom/launchdarkly/android/LDUser;->access$1200(Lcom/launchdarkly/android/LDUser;)Ljava/util/Map;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v0

    const/4 v1, 0x0

    :cond_1
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_3

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/util/Map$Entry;

    .line 795
    invoke-interface {v2}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    invoke-direct {p0, v3, p2, p3}, Lcom/launchdarkly/android/LDUser$LDUserPrivateAttributesTypeAdapter;->checkAndAddPrivate(Ljava/lang/String;Lcom/launchdarkly/android/LDUser;Ljava/util/Set;)Z

    move-result v3

    if-nez v3, :cond_1

    if-nez v1, :cond_2

    const-string v1, "custom"

    .line 797
    invoke-virtual {p1, v1}, Lcom/google/gson/stream/JsonWriter;->name(Ljava/lang/String;)Lcom/google/gson/stream/JsonWriter;

    .line 798
    invoke-virtual {p1}, Lcom/google/gson/stream/JsonWriter;->beginObject()Lcom/google/gson/stream/JsonWriter;

    const/4 v1, 0x1

    .line 801
    :cond_2
    invoke-interface {v2}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    invoke-virtual {p1, v3}, Lcom/google/gson/stream/JsonWriter;->name(Ljava/lang/String;)Lcom/google/gson/stream/JsonWriter;

    .line 805
    invoke-interface {v2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/google/gson/JsonElement;

    invoke-static {v2, p1}, Lcom/google/gson/internal/Streams;->write(Lcom/google/gson/JsonElement;Lcom/google/gson/stream/JsonWriter;)V

    goto :goto_0

    :cond_3
    if-eqz v1, :cond_4

    .line 809
    invoke-virtual {p1}, Lcom/google/gson/stream/JsonWriter;->endObject()Lcom/google/gson/stream/JsonWriter;

    :cond_4
    return-void
.end method

.method private writePrivateAttrNames(Lcom/google/gson/stream/JsonWriter;Ljava/util/Set;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/gson/stream/JsonWriter;",
            "Ljava/util/Set<",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 814
    invoke-interface {p2}, Ljava/util/Set;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    :cond_0
    const-string v0, "privateAttrs"

    .line 817
    invoke-virtual {p1, v0}, Lcom/google/gson/stream/JsonWriter;->name(Ljava/lang/String;)Lcom/google/gson/stream/JsonWriter;

    .line 818
    invoke-virtual {p1}, Lcom/google/gson/stream/JsonWriter;->beginArray()Lcom/google/gson/stream/JsonWriter;

    .line 819
    invoke-interface {p2}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object p2

    :goto_0
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    .line 820
    invoke-virtual {p1, v0}, Lcom/google/gson/stream/JsonWriter;->value(Ljava/lang/String;)Lcom/google/gson/stream/JsonWriter;

    goto :goto_0

    .line 822
    :cond_1
    invoke-virtual {p1}, Lcom/google/gson/stream/JsonWriter;->endArray()Lcom/google/gson/stream/JsonWriter;

    return-void
.end method


# virtual methods
.method public read(Lcom/google/gson/stream/JsonReader;)Lcom/launchdarkly/android/LDUser;
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 786
    sget-object v0, Lcom/launchdarkly/android/LDConfig;->GSON:Lcom/google/gson/Gson;

    const-class v1, Lcom/launchdarkly/android/LDUser;

    instance-of v2, v0, Lcom/google/gson/Gson;

    if-nez v2, :cond_0

    invoke-virtual {v0, p1, v1}, Lcom/google/gson/Gson;->fromJson(Lcom/google/gson/stream/JsonReader;Ljava/lang/reflect/Type;)Ljava/lang/Object;

    move-result-object p1

    goto :goto_0

    :cond_0
    check-cast v0, Lcom/google/gson/Gson;

    invoke-static {v0, p1, v1}, Lcom/newrelic/agent/android/instrumentation/GsonInstrumentation;->fromJson(Lcom/google/gson/Gson;Lcom/google/gson/stream/JsonReader;Ljava/lang/reflect/Type;)Ljava/lang/Object;

    move-result-object p1

    :goto_0
    check-cast p1, Lcom/launchdarkly/android/LDUser;

    return-object p1
.end method

.method public bridge synthetic read(Lcom/google/gson/stream/JsonReader;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 709
    invoke-virtual {p0, p1}, Lcom/launchdarkly/android/LDUser$LDUserPrivateAttributesTypeAdapter;->read(Lcom/google/gson/stream/JsonReader;)Lcom/launchdarkly/android/LDUser;

    move-result-object p1

    return-object p1
.end method

.method public write(Lcom/google/gson/stream/JsonWriter;Lcom/launchdarkly/android/LDUser;)V
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    if-nez p2, :cond_0

    .line 723
    invoke-virtual {p1}, Lcom/google/gson/stream/JsonWriter;->nullValue()Lcom/google/gson/stream/JsonWriter;

    return-void

    .line 728
    :cond_0
    new-instance v0, Ljava/util/HashSet;

    iget-object v1, p0, Lcom/launchdarkly/android/LDUser$LDUserPrivateAttributesTypeAdapter;->config:Lcom/launchdarkly/android/LDConfig;

    invoke-virtual {v1}, Lcom/launchdarkly/android/LDConfig;->getPrivateAttributeNames()Ljava/util/Set;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/util/HashSet;-><init>(Ljava/util/Collection;)V

    .line 730
    invoke-virtual {p1}, Lcom/google/gson/stream/JsonWriter;->beginObject()Lcom/google/gson/stream/JsonWriter;

    const-string v1, "key"

    .line 732
    invoke-virtual {p1, v1}, Lcom/google/gson/stream/JsonWriter;->name(Ljava/lang/String;)Lcom/google/gson/stream/JsonWriter;

    move-result-object v1

    invoke-virtual {p2}, Lcom/launchdarkly/android/LDUser;->getKeyAsString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Lcom/google/gson/stream/JsonWriter;->value(Ljava/lang/String;)Lcom/google/gson/stream/JsonWriter;

    .line 734
    invoke-virtual {p2}, Lcom/launchdarkly/android/LDUser;->getSecondary()Lcom/google/gson/JsonPrimitive;

    move-result-object v1

    if-eqz v1, :cond_1

    const-string v1, "secondary"

    .line 735
    invoke-direct {p0, v1, p2, v0}, Lcom/launchdarkly/android/LDUser$LDUserPrivateAttributesTypeAdapter;->checkAndAddPrivate(Ljava/lang/String;Lcom/launchdarkly/android/LDUser;Ljava/util/Set;)Z

    move-result v1

    if-nez v1, :cond_1

    const-string v1, "secondary"

    .line 736
    invoke-virtual {p1, v1}, Lcom/google/gson/stream/JsonWriter;->name(Ljava/lang/String;)Lcom/google/gson/stream/JsonWriter;

    move-result-object v1

    invoke-virtual {p2}, Lcom/launchdarkly/android/LDUser;->getSecondary()Lcom/google/gson/JsonPrimitive;

    move-result-object v2

    invoke-virtual {v2}, Lcom/google/gson/JsonPrimitive;->getAsString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Lcom/google/gson/stream/JsonWriter;->value(Ljava/lang/String;)Lcom/google/gson/stream/JsonWriter;

    .line 739
    :cond_1
    invoke-virtual {p2}, Lcom/launchdarkly/android/LDUser;->getIp()Lcom/google/gson/JsonPrimitive;

    move-result-object v1

    if-eqz v1, :cond_2

    const-string v1, "ip"

    .line 740
    invoke-direct {p0, v1, p2, v0}, Lcom/launchdarkly/android/LDUser$LDUserPrivateAttributesTypeAdapter;->checkAndAddPrivate(Ljava/lang/String;Lcom/launchdarkly/android/LDUser;Ljava/util/Set;)Z

    move-result v1

    if-nez v1, :cond_2

    const-string v1, "ip"

    .line 741
    invoke-virtual {p1, v1}, Lcom/google/gson/stream/JsonWriter;->name(Ljava/lang/String;)Lcom/google/gson/stream/JsonWriter;

    move-result-object v1

    invoke-virtual {p2}, Lcom/launchdarkly/android/LDUser;->getIp()Lcom/google/gson/JsonPrimitive;

    move-result-object v2

    invoke-virtual {v2}, Lcom/google/gson/JsonPrimitive;->getAsString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Lcom/google/gson/stream/JsonWriter;->value(Ljava/lang/String;)Lcom/google/gson/stream/JsonWriter;

    .line 744
    :cond_2
    invoke-virtual {p2}, Lcom/launchdarkly/android/LDUser;->getEmail()Lcom/google/gson/JsonPrimitive;

    move-result-object v1

    if-eqz v1, :cond_3

    const-string v1, "email"

    .line 745
    invoke-direct {p0, v1, p2, v0}, Lcom/launchdarkly/android/LDUser$LDUserPrivateAttributesTypeAdapter;->checkAndAddPrivate(Ljava/lang/String;Lcom/launchdarkly/android/LDUser;Ljava/util/Set;)Z

    move-result v1

    if-nez v1, :cond_3

    const-string v1, "email"

    .line 746
    invoke-virtual {p1, v1}, Lcom/google/gson/stream/JsonWriter;->name(Ljava/lang/String;)Lcom/google/gson/stream/JsonWriter;

    move-result-object v1

    invoke-virtual {p2}, Lcom/launchdarkly/android/LDUser;->getEmail()Lcom/google/gson/JsonPrimitive;

    move-result-object v2

    invoke-virtual {v2}, Lcom/google/gson/JsonPrimitive;->getAsString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Lcom/google/gson/stream/JsonWriter;->value(Ljava/lang/String;)Lcom/google/gson/stream/JsonWriter;

    .line 749
    :cond_3
    invoke-virtual {p2}, Lcom/launchdarkly/android/LDUser;->getName()Lcom/google/gson/JsonPrimitive;

    move-result-object v1

    if-eqz v1, :cond_4

    const-string v1, "name"

    .line 750
    invoke-direct {p0, v1, p2, v0}, Lcom/launchdarkly/android/LDUser$LDUserPrivateAttributesTypeAdapter;->checkAndAddPrivate(Ljava/lang/String;Lcom/launchdarkly/android/LDUser;Ljava/util/Set;)Z

    move-result v1

    if-nez v1, :cond_4

    const-string v1, "name"

    .line 751
    invoke-virtual {p1, v1}, Lcom/google/gson/stream/JsonWriter;->name(Ljava/lang/String;)Lcom/google/gson/stream/JsonWriter;

    move-result-object v1

    invoke-virtual {p2}, Lcom/launchdarkly/android/LDUser;->getName()Lcom/google/gson/JsonPrimitive;

    move-result-object v2

    invoke-virtual {v2}, Lcom/google/gson/JsonPrimitive;->getAsString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Lcom/google/gson/stream/JsonWriter;->value(Ljava/lang/String;)Lcom/google/gson/stream/JsonWriter;

    .line 754
    :cond_4
    invoke-virtual {p2}, Lcom/launchdarkly/android/LDUser;->getAvatar()Lcom/google/gson/JsonPrimitive;

    move-result-object v1

    if-eqz v1, :cond_5

    const-string v1, "avatar"

    .line 755
    invoke-direct {p0, v1, p2, v0}, Lcom/launchdarkly/android/LDUser$LDUserPrivateAttributesTypeAdapter;->checkAndAddPrivate(Ljava/lang/String;Lcom/launchdarkly/android/LDUser;Ljava/util/Set;)Z

    move-result v1

    if-nez v1, :cond_5

    const-string v1, "avatar"

    .line 756
    invoke-virtual {p1, v1}, Lcom/google/gson/stream/JsonWriter;->name(Ljava/lang/String;)Lcom/google/gson/stream/JsonWriter;

    move-result-object v1

    invoke-virtual {p2}, Lcom/launchdarkly/android/LDUser;->getAvatar()Lcom/google/gson/JsonPrimitive;

    move-result-object v2

    invoke-virtual {v2}, Lcom/google/gson/JsonPrimitive;->getAsString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Lcom/google/gson/stream/JsonWriter;->value(Ljava/lang/String;)Lcom/google/gson/stream/JsonWriter;

    .line 759
    :cond_5
    invoke-virtual {p2}, Lcom/launchdarkly/android/LDUser;->getFirstName()Lcom/google/gson/JsonPrimitive;

    move-result-object v1

    if-eqz v1, :cond_6

    const-string v1, "firstName"

    .line 760
    invoke-direct {p0, v1, p2, v0}, Lcom/launchdarkly/android/LDUser$LDUserPrivateAttributesTypeAdapter;->checkAndAddPrivate(Ljava/lang/String;Lcom/launchdarkly/android/LDUser;Ljava/util/Set;)Z

    move-result v1

    if-nez v1, :cond_6

    const-string v1, "firstName"

    .line 761
    invoke-virtual {p1, v1}, Lcom/google/gson/stream/JsonWriter;->name(Ljava/lang/String;)Lcom/google/gson/stream/JsonWriter;

    move-result-object v1

    invoke-virtual {p2}, Lcom/launchdarkly/android/LDUser;->getFirstName()Lcom/google/gson/JsonPrimitive;

    move-result-object v2

    invoke-virtual {v2}, Lcom/google/gson/JsonPrimitive;->getAsString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Lcom/google/gson/stream/JsonWriter;->value(Ljava/lang/String;)Lcom/google/gson/stream/JsonWriter;

    .line 764
    :cond_6
    invoke-virtual {p2}, Lcom/launchdarkly/android/LDUser;->getLastName()Lcom/google/gson/JsonPrimitive;

    move-result-object v1

    if-eqz v1, :cond_7

    const-string v1, "lastName"

    .line 765
    invoke-direct {p0, v1, p2, v0}, Lcom/launchdarkly/android/LDUser$LDUserPrivateAttributesTypeAdapter;->checkAndAddPrivate(Ljava/lang/String;Lcom/launchdarkly/android/LDUser;Ljava/util/Set;)Z

    move-result v1

    if-nez v1, :cond_7

    const-string v1, "lastName"

    .line 766
    invoke-virtual {p1, v1}, Lcom/google/gson/stream/JsonWriter;->name(Ljava/lang/String;)Lcom/google/gson/stream/JsonWriter;

    move-result-object v1

    invoke-virtual {p2}, Lcom/launchdarkly/android/LDUser;->getLastName()Lcom/google/gson/JsonPrimitive;

    move-result-object v2

    invoke-virtual {v2}, Lcom/google/gson/JsonPrimitive;->getAsString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Lcom/google/gson/stream/JsonWriter;->value(Ljava/lang/String;)Lcom/google/gson/stream/JsonWriter;

    .line 769
    :cond_7
    invoke-virtual {p2}, Lcom/launchdarkly/android/LDUser;->getAnonymous()Lcom/google/gson/JsonPrimitive;

    move-result-object v1

    if-eqz v1, :cond_8

    const-string v1, "anonymous"

    .line 770
    invoke-virtual {p1, v1}, Lcom/google/gson/stream/JsonWriter;->name(Ljava/lang/String;)Lcom/google/gson/stream/JsonWriter;

    move-result-object v1

    invoke-virtual {p2}, Lcom/launchdarkly/android/LDUser;->getAnonymous()Lcom/google/gson/JsonPrimitive;

    move-result-object v2

    invoke-virtual {v2}, Lcom/google/gson/JsonPrimitive;->getAsBoolean()Z

    move-result v2

    invoke-virtual {v1, v2}, Lcom/google/gson/stream/JsonWriter;->value(Z)Lcom/google/gson/stream/JsonWriter;

    .line 772
    :cond_8
    invoke-virtual {p2}, Lcom/launchdarkly/android/LDUser;->getCountry()Lcom/google/gson/JsonPrimitive;

    move-result-object v1

    if-eqz v1, :cond_9

    const-string v1, "country"

    .line 773
    invoke-direct {p0, v1, p2, v0}, Lcom/launchdarkly/android/LDUser$LDUserPrivateAttributesTypeAdapter;->checkAndAddPrivate(Ljava/lang/String;Lcom/launchdarkly/android/LDUser;Ljava/util/Set;)Z

    move-result v1

    if-nez v1, :cond_9

    const-string v1, "country"

    .line 774
    invoke-virtual {p1, v1}, Lcom/google/gson/stream/JsonWriter;->name(Ljava/lang/String;)Lcom/google/gson/stream/JsonWriter;

    move-result-object v1

    invoke-virtual {p2}, Lcom/launchdarkly/android/LDUser;->getCountry()Lcom/google/gson/JsonPrimitive;

    move-result-object v2

    invoke-virtual {v2}, Lcom/google/gson/JsonPrimitive;->getAsString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Lcom/google/gson/stream/JsonWriter;->value(Ljava/lang/String;)Lcom/google/gson/stream/JsonWriter;

    .line 777
    :cond_9
    invoke-direct {p0, p1, p2, v0}, Lcom/launchdarkly/android/LDUser$LDUserPrivateAttributesTypeAdapter;->writeCustomAttrs(Lcom/google/gson/stream/JsonWriter;Lcom/launchdarkly/android/LDUser;Ljava/util/Set;)V

    .line 778
    invoke-direct {p0, p1, v0}, Lcom/launchdarkly/android/LDUser$LDUserPrivateAttributesTypeAdapter;->writePrivateAttrNames(Lcom/google/gson/stream/JsonWriter;Ljava/util/Set;)V

    .line 780
    invoke-virtual {p1}, Lcom/google/gson/stream/JsonWriter;->endObject()Lcom/google/gson/stream/JsonWriter;

    return-void
.end method

.method public bridge synthetic write(Lcom/google/gson/stream/JsonWriter;Ljava/lang/Object;)V
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 709
    check-cast p2, Lcom/launchdarkly/android/LDUser;

    invoke-virtual {p0, p1, p2}, Lcom/launchdarkly/android/LDUser$LDUserPrivateAttributesTypeAdapter;->write(Lcom/google/gson/stream/JsonWriter;Lcom/launchdarkly/android/LDUser;)V

    return-void
.end method
