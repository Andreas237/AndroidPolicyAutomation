.class public abstract Lcom/ibotta/android/notification/call/BaseNotificationsCall;
.super Lcom/ibotta/api/BaseCacheableApiCall;
.source "BaseNotificationsCall.kt"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/ibotta/android/notification/call/BaseNotificationsCall$NotificationFilter;,
        Lcom/ibotta/android/notification/call/BaseNotificationsCall$Companion;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<NR:",
        "Lcom/ibotta/android/notification/call/BaseNotificationsResponse;",
        ">",
        "Lcom/ibotta/api/BaseCacheableApiCall<",
        "TNR;>;"
    }
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nBaseNotificationsCall.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BaseNotificationsCall.kt\ncom/ibotta/android/notification/call/BaseNotificationsCall\n*L\n1#1,101:1\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    bv = {
        0x1,
        0x0,
        0x3
    }
    d1 = {
        "\u0000N\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0010\n\u0002\u0010\u000e\n\u0002\u0008\u0003\n\u0002\u0010\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0006\u0008&\u0018\u0000 -*\u0008\u0008\u0000\u0010\u0001*\u00020\u00022\u0008\u0012\u0004\u0012\u0002H\u00010\u0003:\u0002-.B)\u0008\u0016\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005\u0012\u0008\u0010\u0007\u001a\u0004\u0018\u00010\u0008\u0012\u0006\u0010\t\u001a\u00020\n\u00a2\u0006\u0002\u0010\u000bB\u0005\u00a2\u0006\u0002\u0010\u000cJ\u0008\u0010\u001e\u001a\u00020\u001fH\u0016J\u001d\u0010 \u001a\u00028\u00002\u0006\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020$H\u0016\u00a2\u0006\u0002\u0010%J\u0008\u0010&\u001a\u00020\u001bH\u0016J\u0008\u0010\'\u001a\u00020\u001bH\u0016J\u0008\u0010(\u001a\u00020)H\u0016J\u0008\u0010*\u001a\u00020\u0008H\u0016J\r\u0010+\u001a\u00028\u0000H$\u00a2\u0006\u0002\u0010,R\u001e\u0010\u0007\u001a\u0004\u0018\u00010\u0008X\u0084\u000e\u00a2\u0006\u0010\n\u0002\u0010\u0011\u001a\u0004\u0008\r\u0010\u000e\"\u0004\u0008\u000f\u0010\u0010R\"\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005X\u0084\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008\u0012\u0010\u0013\"\u0004\u0008\u0014\u0010\u0015R\u001a\u0010\t\u001a\u00020\nX\u0084\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008\u0016\u0010\u0017\"\u0004\u0008\u0018\u0010\u0019R\u0011\u0010\u001a\u001a\u00020\u001b8F\u00a2\u0006\u0006\u001a\u0004\u0008\u001c\u0010\u001d\u00a8\u0006/"
    }
    d2 = {
        "Lcom/ibotta/android/notification/call/BaseNotificationsCall;",
        "NR",
        "Lcom/ibotta/android/notification/call/BaseNotificationsResponse;",
        "Lcom/ibotta/api/BaseCacheableApiCall;",
        "filters",
        "",
        "Lcom/ibotta/android/notification/call/BaseNotificationsCall$NotificationFilter;",
        "before",
        "",
        "limit",
        "",
        "(Ljava/util/Set;Ljava/lang/Long;I)V",
        "()V",
        "getBefore",
        "()Ljava/lang/Long;",
        "setBefore",
        "(Ljava/lang/Long;)V",
        "Ljava/lang/Long;",
        "getFilters",
        "()Ljava/util/Set;",
        "setFilters",
        "(Ljava/util/Set;)V",
        "getLimit",
        "()I",
        "setLimit",
        "(I)V",
        "name",
        "",
        "getName",
        "()Ljava/lang/String;",
        "buildParams",
        "",
        "buildResponse",
        "json",
        "Lcom/ibotta/android/json/IbottaJson;",
        "is",
        "Ljava/io/InputStream;",
        "(Lcom/ibotta/android/json/IbottaJson;Ljava/io/InputStream;)Lcom/ibotta/android/notification/call/BaseNotificationsResponse;",
        "getApiFunction",
        "getCacheKey",
        "getHttpMethod",
        "Lcom/ibotta/api/ApiCall$HttpMethod;",
        "getSocketTimeout",
        "newResponse",
        "()Lcom/ibotta/android/notification/call/BaseNotificationsResponse;",
        "Companion",
        "NotificationFilter",
        "ibotta-notification_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x1,
        0xd
    }
.end annotation


# static fields
# The value of this static final field might be set in the static constructor
.field private static final API_FUNCTION:Ljava/lang/String; = "notifications.json"

.field public static final Companion:Lcom/ibotta/android/notification/call/BaseNotificationsCall$Companion;

.field private static final SOCKET_TIMEOUT:J


# instance fields
.field private before:Ljava/lang/Long;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field

.field private filters:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set<",
            "+",
            "Lcom/ibotta/android/notification/call/BaseNotificationsCall$NotificationFilter;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field

.field private limit:I


# direct methods
.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Lcom/ibotta/android/notification/call/BaseNotificationsCall$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/ibotta/android/notification/call/BaseNotificationsCall$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/ibotta/android/notification/call/BaseNotificationsCall;->Companion:Lcom/ibotta/android/notification/call/BaseNotificationsCall$Companion;

    const-string v0, "notifications.json"

    .line 98
    sput-object v0, Lcom/ibotta/android/notification/call/BaseNotificationsCall;->API_FUNCTION:Ljava/lang/String;

    .line 99
    sget-object v0, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    const-wide/16 v1, 0x1e

    invoke-virtual {v0, v1, v2}, Ljava/util/concurrent/TimeUnit;->toMillis(J)J

    move-result-wide v0

    sput-wide v0, Lcom/ibotta/android/notification/call/BaseNotificationsCall;->SOCKET_TIMEOUT:J

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    .line 14
    invoke-direct {p0}, Lcom/ibotta/api/BaseCacheableApiCall;-><init>()V

    const/4 v0, 0x1

    .line 31
    invoke-virtual {p0, v0}, Lcom/ibotta/android/notification/call/BaseNotificationsCall;->setRequiresAuthToken(Z)V

    return-void
.end method

.method public constructor <init>(Ljava/util/Set;Ljava/lang/Long;I)V
    .locals 0
    .param p1    # Ljava/util/Set;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p2    # Ljava/lang/Long;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Set<",
            "+",
            "Lcom/ibotta/android/notification/call/BaseNotificationsCall$NotificationFilter;",
            ">;",
            "Ljava/lang/Long;",
            "I)V"
        }
    .end annotation

    .line 40
    invoke-direct {p0}, Lcom/ibotta/android/notification/call/BaseNotificationsCall;-><init>()V

    if-eqz p1, :cond_0

    goto :goto_0

    .line 41
    :cond_0
    new-instance p1, Ljava/util/HashSet;

    invoke-direct {p1}, Ljava/util/HashSet;-><init>()V

    check-cast p1, Ljava/util/Set;

    :goto_0
    iput-object p1, p0, Lcom/ibotta/android/notification/call/BaseNotificationsCall;->filters:Ljava/util/Set;

    .line 42
    iput-object p2, p0, Lcom/ibotta/android/notification/call/BaseNotificationsCall;->before:Ljava/lang/Long;

    .line 43
    iput p3, p0, Lcom/ibotta/android/notification/call/BaseNotificationsCall;->limit:I

    return-void
.end method

.method public static final synthetic access$fromJsonToArrayList$s-1126570137(Lcom/ibotta/android/json/IbottaJson;Ljava/io/InputStream;Ljava/lang/Class;)Ljava/util/ArrayList;
    .locals 0

    .line 14
    invoke-static {p0, p1, p2}, Lcom/ibotta/api/BaseApiCall;->fromJsonToArrayList(Lcom/ibotta/android/json/IbottaJson;Ljava/io/InputStream;Ljava/lang/Class;)Ljava/util/ArrayList;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public buildParams()V
    .locals 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/ibotta/api/ApiException;
        }
    .end annotation

    .line 56
    invoke-super {p0}, Lcom/ibotta/api/BaseCacheableApiCall;->buildParams()V

    .line 58
    iget-object v0, p0, Lcom/ibotta/android/notification/call/BaseNotificationsCall;->filters:Ljava/util/Set;

    if-eqz v0, :cond_0

    .line 60
    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v0

    .line 61
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    .line 62
    iget-object v1, p0, Lcom/ibotta/android/notification/call/BaseNotificationsCall;->params:Ljava/util/Map;

    const-string v2, "params"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v2, "filter"

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/notification/call/BaseNotificationsCall$NotificationFilter;

    invoke-virtual {v0}, Lcom/ibotta/android/notification/call/BaseNotificationsCall$NotificationFilter;->toApiName()Ljava/lang/String;

    move-result-object v0

    invoke-interface {v1, v2, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 66
    :cond_0
    iget-object v0, p0, Lcom/ibotta/android/notification/call/BaseNotificationsCall;->before:Ljava/lang/Long;

    if-eqz v0, :cond_1

    check-cast v0, Ljava/lang/Number;

    invoke-virtual {v0}, Ljava/lang/Number;->longValue()J

    move-result-wide v0

    iget-object v2, p0, Lcom/ibotta/android/notification/call/BaseNotificationsCall;->params:Ljava/util/Map;

    const-string v3, "params"

    invoke-static {v2, v3}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v3, "before"

    invoke-static {v0, v1}, Ljava/lang/Long;->toString(J)Ljava/lang/String;

    move-result-object v0

    invoke-interface {v2, v3, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 67
    :cond_1
    iget-object v0, p0, Lcom/ibotta/android/notification/call/BaseNotificationsCall;->params:Ljava/util/Map;

    const-string v1, "params"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v1, "limit"

    iget v2, p0, Lcom/ibotta/android/notification/call/BaseNotificationsCall;->limit:I

    invoke-static {v2}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public buildResponse(Lcom/ibotta/android/json/IbottaJson;Ljava/io/InputStream;)Lcom/ibotta/android/notification/call/BaseNotificationsResponse;
    .locals 1
    .param p1    # Lcom/ibotta/android/json/IbottaJson;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Ljava/io/InputStream;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/ibotta/android/json/IbottaJson;",
            "Ljava/io/InputStream;",
            ")TNR;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/ibotta/api/ApiException;
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    const-string v0, "json"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "is"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 72
    const-class v0, Lcom/ibotta/android/notification/model/Notification;

    invoke-static {p1, p2, v0}, Lcom/ibotta/android/notification/call/BaseNotificationsCall;->access$fromJsonToArrayList$s-1126570137(Lcom/ibotta/android/json/IbottaJson;Ljava/io/InputStream;Ljava/lang/Class;)Ljava/util/ArrayList;

    move-result-object p1

    .line 74
    invoke-virtual {p0}, Lcom/ibotta/android/notification/call/BaseNotificationsCall;->newResponse()Lcom/ibotta/android/notification/call/BaseNotificationsResponse;

    move-result-object p2

    const-string v0, "notifications"

    .line 75
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, Ljava/util/List;

    invoke-virtual {p2, p1}, Lcom/ibotta/android/notification/call/BaseNotificationsResponse;->setNotifications(Ljava/util/List;)V

    return-object p2
.end method

.method public bridge synthetic buildResponse(Lcom/ibotta/android/json/IbottaJson;Ljava/io/InputStream;)Lcom/ibotta/api/ApiResponse;
    .locals 0

    .line 14
    invoke-virtual {p0, p1, p2}, Lcom/ibotta/android/notification/call/BaseNotificationsCall;->buildResponse(Lcom/ibotta/android/json/IbottaJson;Ljava/io/InputStream;)Lcom/ibotta/android/notification/call/BaseNotificationsResponse;

    move-result-object p1

    check-cast p1, Lcom/ibotta/api/ApiResponse;

    return-object p1
.end method

.method public getApiFunction()Ljava/lang/String;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 52
    sget-object v0, Lcom/ibotta/android/notification/call/BaseNotificationsCall;->API_FUNCTION:Ljava/lang/String;

    return-object v0
.end method

.method protected final getBefore()Ljava/lang/Long;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 23
    iget-object v0, p0, Lcom/ibotta/android/notification/call/BaseNotificationsCall;->before:Ljava/lang/Long;

    return-object v0
.end method

.method public getCacheKey()Ljava/lang/String;
    .locals 3
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 80
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 81
    invoke-virtual {p0}, Lcom/ibotta/android/notification/call/BaseNotificationsCall;->getApiFunction()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 82
    invoke-virtual {p0}, Lcom/ibotta/android/notification/call/BaseNotificationsCall;->getHttpMethod()Lcom/ibotta/api/ApiCall$HttpMethod;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 84
    iget-object v1, p0, Lcom/ibotta/android/notification/call/BaseNotificationsCall;->filters:Ljava/util/Set;

    if-eqz v1, :cond_0

    .line 86
    invoke-interface {v1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v1

    .line 87
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_0

    .line 88
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 91
    :cond_0
    iget-object v1, p0, Lcom/ibotta/android/notification/call/BaseNotificationsCall;->before:Ljava/lang/Long;

    if-eqz v1, :cond_1

    check-cast v1, Ljava/lang/Number;

    invoke-virtual {v1}, Ljava/lang/Number;->longValue()J

    move-result-wide v1

    invoke-static {v1, v2}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 92
    :cond_1
    iget v1, p0, Lcom/ibotta/android/notification/call/BaseNotificationsCall;->limit:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 94
    invoke-static {v0}, Lcom/ibotta/api/CacheKeyHelper;->buildCacheKey(Ljava/lang/StringBuilder;)Ljava/lang/String;

    move-result-object v0

    const-string v1, "CacheKeyHelper.buildCacheKey(sb)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v0
.end method

.method protected final getFilters()Ljava/util/Set;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Set<",
            "Lcom/ibotta/android/notification/call/BaseNotificationsCall$NotificationFilter;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 22
    iget-object v0, p0, Lcom/ibotta/android/notification/call/BaseNotificationsCall;->filters:Ljava/util/Set;

    return-object v0
.end method

.method public getHttpMethod()Lcom/ibotta/api/ApiCall$HttpMethod;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 50
    sget-object v0, Lcom/ibotta/api/ApiCall$HttpMethod;->GET:Lcom/ibotta/api/ApiCall$HttpMethod;

    return-object v0
.end method

.method protected final getLimit()I
    .locals 1

    .line 24
    iget v0, p0, Lcom/ibotta/android/notification/call/BaseNotificationsCall;->limit:I

    return v0
.end method

.method public final getName()Ljava/lang/String;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 27
    invoke-virtual {p0}, Lcom/ibotta/android/notification/call/BaseNotificationsCall;->getApiFunction()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public getSocketTimeout()J
    .locals 2

    .line 48
    sget-wide v0, Lcom/ibotta/android/notification/call/BaseNotificationsCall;->SOCKET_TIMEOUT:J

    return-wide v0
.end method

.method public bridge synthetic getSocketTimeout()Ljava/lang/Long;
    .locals 2

    .line 14
    invoke-virtual {p0}, Lcom/ibotta/android/notification/call/BaseNotificationsCall;->getSocketTimeout()J

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    return-object v0
.end method

.method protected abstract newResponse()Lcom/ibotta/android/notification/call/BaseNotificationsResponse;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()TNR;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end method

.method protected final setBefore(Ljava/lang/Long;)V
    .locals 0
    .param p1    # Ljava/lang/Long;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    .line 23
    iput-object p1, p0, Lcom/ibotta/android/notification/call/BaseNotificationsCall;->before:Ljava/lang/Long;

    return-void
.end method

.method protected final setFilters(Ljava/util/Set;)V
    .locals 0
    .param p1    # Ljava/util/Set;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Set<",
            "+",
            "Lcom/ibotta/android/notification/call/BaseNotificationsCall$NotificationFilter;",
            ">;)V"
        }
    .end annotation

    .line 22
    iput-object p1, p0, Lcom/ibotta/android/notification/call/BaseNotificationsCall;->filters:Ljava/util/Set;

    return-void
.end method

.method protected final setLimit(I)V
    .locals 0

    .line 24
    iput p1, p0, Lcom/ibotta/android/notification/call/BaseNotificationsCall;->limit:I

    return-void
.end method
