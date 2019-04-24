.class public final Lcom/ibotta/android/notification/networking/mapper/NotificationsMapper;
.super Ljava/lang/Object;
.source "NotificationsMapper.kt"


# annotations
.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nNotificationsMapper.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NotificationsMapper.kt\ncom/ibotta/android/notification/networking/mapper/NotificationsMapper\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,39:1\n1301#2:40\n1370#2,3:41\n*E\n*S KotlinDebug\n*F\n+ 1 NotificationsMapper.kt\ncom/ibotta/android/notification/networking/mapper/NotificationsMapper\n*L\n12#1:40\n12#1,3:41\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    bv = {
        0x1,
        0x0,
        0x3
    }
    d1 = {
        "\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u001e\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u00042\u0008\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0002J\u001c\u0010\u0007\u001a\u0008\u0012\u0004\u0012\u00020\t0\u00082\u000e\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u0008J\u0010\u0010\u000c\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u000bH\u0002\u00a8\u0006\r"
    }
    d2 = {
        "Lcom/ibotta/android/notification/networking/mapper/NotificationsMapper;",
        "",
        "()V",
        "getMessageMap",
        "",
        "",
        "input",
        "map",
        "",
        "Lcom/ibotta/android/notification/model/Notification;",
        "inputList",
        "Lcom/ibotta/android/notification/networking/model/Notification;",
        "mapNotification",
        "ibotta-notification_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x1,
        0xd
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 9
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private final getMessageMap(Ljava/lang/String;)Ljava/util/Map;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .line 30
    move-object v0, p1

    check-cast v0, Ljava/lang/CharSequence;

    if-eqz v0, :cond_1

    invoke-interface {v0}, Ljava/lang/CharSequence;->length()I

    move-result v0

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 v0, 0x1

    :goto_1
    if-eqz v0, :cond_2

    new-instance p1, Ljava/util/LinkedHashMap;

    invoke-direct {p1}, Ljava/util/LinkedHashMap;-><init>()V

    check-cast p1, Ljava/util/Map;

    return-object p1

    .line 33
    :cond_2
    :try_start_0
    new-instance v0, Lcom/fasterxml/jackson/databind/ObjectMapper;

    invoke-direct {v0}, Lcom/fasterxml/jackson/databind/ObjectMapper;-><init>()V

    new-instance v1, Lcom/ibotta/android/notification/networking/mapper/NotificationsMapper$getMessageMap$1;

    invoke-direct {v1}, Lcom/ibotta/android/notification/networking/mapper/NotificationsMapper$getMessageMap$1;-><init>()V

    check-cast v1, Lcom/fasterxml/jackson/core/type/TypeReference;

    invoke-virtual {v0, p1, v1}, Lcom/fasterxml/jackson/databind/ObjectMapper;->readValue(Ljava/lang/String;Lcom/fasterxml/jackson/core/type/TypeReference;)Ljava/lang/Object;

    move-result-object p1

    const-string v0, "ObjectMapper().readValue\u2026ap<String, String>>() {})"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, Ljava/util/Map;
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_2

    :catch_0
    move-exception p1

    .line 35
    invoke-virtual {p1}, Ljava/io/IOException;->printStackTrace()V

    .line 36
    new-instance p1, Ljava/util/LinkedHashMap;

    invoke-direct {p1}, Ljava/util/LinkedHashMap;-><init>()V

    check-cast p1, Ljava/util/Map;

    :goto_2
    return-object p1
.end method

.method private final mapNotification(Lcom/ibotta/android/notification/networking/model/Notification;)Lcom/ibotta/android/notification/model/Notification;
    .locals 14

    .line 15
    new-instance v13, Lcom/ibotta/android/notification/model/Notification;

    .line 16
    invoke-virtual {p1}, Lcom/ibotta/android/notification/networking/model/Notification;->getStatus()Ljava/lang/String;

    move-result-object v1

    .line 17
    invoke-virtual {p1}, Lcom/ibotta/android/notification/networking/model/Notification;->getContext()Ljava/lang/String;

    move-result-object v2

    .line 18
    invoke-virtual {p1}, Lcom/ibotta/android/notification/networking/model/Notification;->getIconUrl()Ljava/lang/String;

    move-result-object v3

    .line 19
    new-instance v0, Lcom/ibotta/android/notification/typadapters/DateTimeAdapter;

    invoke-direct {v0}, Lcom/ibotta/android/notification/typadapters/DateTimeAdapter;-><init>()V

    invoke-virtual {p1}, Lcom/ibotta/android/notification/networking/model/Notification;->getCreatedAt()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v0, v4}, Lcom/ibotta/android/notification/typadapters/DateTimeAdapter;->decode(Ljava/lang/String;)Ljava/util/Date;

    move-result-object v4

    .line 20
    invoke-virtual {p1}, Lcom/ibotta/android/notification/networking/model/Notification;->getMessage()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    const-string v0, "Stub message"

    :goto_0
    move-object v5, v0

    .line 21
    invoke-virtual {p1}, Lcom/ibotta/android/notification/networking/model/Notification;->getAmount()F

    move-result v6

    .line 22
    invoke-virtual {p1}, Lcom/ibotta/android/notification/networking/model/Notification;->getItemId()I

    move-result v0

    int-to-long v7, v0

    .line 23
    invoke-virtual {p1}, Lcom/ibotta/android/notification/networking/model/Notification;->getItemType()Ljava/lang/String;

    move-result-object v9

    .line 24
    invoke-virtual {p1}, Lcom/ibotta/android/notification/networking/model/Notification;->getDisplayId()I

    move-result v10

    .line 25
    invoke-virtual {p1}, Lcom/ibotta/android/notification/networking/model/Notification;->getDisplayType()Ljava/lang/String;

    move-result-object v11

    .line 26
    invoke-virtual {p1}, Lcom/ibotta/android/notification/networking/model/Notification;->getMessageReplacements()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, p1}, Lcom/ibotta/android/notification/networking/mapper/NotificationsMapper;->getMessageMap(Ljava/lang/String;)Ljava/util/Map;

    move-result-object v12

    move-object v0, v13

    .line 15
    invoke-direct/range {v0 .. v12}, Lcom/ibotta/android/notification/model/Notification;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Date;Ljava/lang/String;FJLjava/lang/String;ILjava/lang/String;Ljava/util/Map;)V

    return-object v13
.end method


# virtual methods
.method public final map(Ljava/util/List;)Ljava/util/List;
    .locals 2
    .param p1    # Ljava/util/List;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/ibotta/android/notification/networking/model/Notification;",
            ">;)",
            "Ljava/util/List<",
            "Lcom/ibotta/android/notification/model/Notification;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    if-eqz p1, :cond_1

    .line 12
    check-cast p1, Ljava/lang/Iterable;

    .line 40
    new-instance v0, Ljava/util/ArrayList;

    const/16 v1, 0xa

    invoke-static {p1, v1}, Lkotlin/collections/CollectionsKt;->collectionSizeOrDefault(Ljava/lang/Iterable;I)I

    move-result v1

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    check-cast v0, Ljava/util/Collection;

    .line 41
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    .line 42
    check-cast v1, Lcom/ibotta/android/notification/networking/model/Notification;

    .line 12
    invoke-direct {p0, v1}, Lcom/ibotta/android/notification/networking/mapper/NotificationsMapper;->mapNotification(Lcom/ibotta/android/notification/networking/model/Notification;)Lcom/ibotta/android/notification/model/Notification;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 43
    :cond_0
    check-cast v0, Ljava/util/List;

    goto :goto_1

    :cond_1
    const/4 v0, 0x0

    :goto_1
    if-eqz v0, :cond_2

    goto :goto_2

    .line 12
    :cond_2
    invoke-static {}, Lkotlin/collections/CollectionsKt;->emptyList()Ljava/util/List;

    move-result-object v0

    :goto_2
    return-object v0
.end method
