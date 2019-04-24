.class public final Lcom/ibotta/android/notification/networking/datasource/NotificationsDataSourceImpl;
.super Ljava/lang/Object;
.source "NotificationsDataSourceImpl.kt"

# interfaces
.implements Lcom/ibotta/android/notification/networking/datasource/NotificationsDataSource;


# annotations
.annotation runtime Lkotlin/Metadata;
    bv = {
        0x1,
        0x0,
        0x3
    }
    d1 = {
        "\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0008\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0008\u0010\u0011\u001a\u00020\u0012H\u0016J\u0008\u0010\u0013\u001a\u00020\u0012H\u0016J\u001e\u0010\u0014\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u00162\u000c\u0010\u0017\u001a\u0008\u0012\u0004\u0012\u00020\u00190\u0018H\u0016J\u001e\u0010\u001a\u001a\u00020\u00122\u0006\u0010\u001b\u001a\u00020\u00162\u000c\u0010\u0017\u001a\u0008\u0012\u0004\u0012\u00020\u00190\u0018H\u0016J(\u0010\u001c\u001a\u00020\u00122\u0006\u0010\u001b\u001a\u00020\u00162\u0008\u0010\u001d\u001a\u0004\u0018\u00010\u001e2\u000c\u0010\u0017\u001a\u0008\u0012\u0004\u0012\u00020\u00190\u0018H\u0016J\u0008\u0010\u001f\u001a\u00020 H\u0002R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0008X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001c\u0010\t\u001a\u0010\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u000c0\u000b\u0018\u00010\nX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001c\u0010\r\u001a\u0010\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u000e0\u000b\u0018\u00010\nX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006!"
    }
    d2 = {
        "Lcom/ibotta/android/notification/networking/datasource/NotificationsDataSourceImpl;",
        "Lcom/ibotta/android/notification/networking/datasource/NotificationsDataSource;",
        "context",
        "Landroid/content/Context;",
        "(Landroid/content/Context;)V",
        "graphConverterFactory",
        "Lio/github/wax911/library/converter/GraphConverter;",
        "mainModel",
        "Lcom/ibotta/android/notification/networking/model/NotificationsViewStateSuccess;",
        "notificationCountCall",
        "Lretrofit2/Call;",
        "Lio/github/wax911/library/model/body/GraphContainer;",
        "Lcom/ibotta/android/notification/networking/wrapper/NotificationsCountWrapper;",
        "notificationsCall",
        "Lcom/ibotta/android/notification/networking/wrapper/NotificationsWrapper;",
        "notificationsService",
        "Lcom/ibotta/android/notification/networking/NotificationsService;",
        "cancelNotificationCountCall",
        "",
        "cancelNotificationsCall",
        "fetchNotificationById",
        "notificationId",
        "",
        "callback",
        "Lcom/ibotta/android/notification/networking/MvpDataSourceCallback;",
        "Lcom/ibotta/android/notification/networking/model/NotificationsViewState;",
        "fetchNotifications",
        "customerID",
        "fetchNotificationsCount",
        "type",
        "Lcom/ibotta/android/notification/call/BaseNotificationsCall$NotificationFilter;",
        "getOkHttpClient",
        "Lokhttp3/OkHttpClient;",
        "ibotta-notification_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x1,
        0xd
    }
.end annotation


# instance fields
.field private final graphConverterFactory:Lio/github/wax911/library/converter/GraphConverter;

.field private mainModel:Lcom/ibotta/android/notification/networking/model/NotificationsViewStateSuccess;

.field private notificationCountCall:Lretrofit2/Call;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lretrofit2/Call<",
            "Lio/github/wax911/library/model/body/GraphContainer<",
            "Lcom/ibotta/android/notification/networking/wrapper/NotificationsCountWrapper;",
            ">;>;"
        }
    .end annotation
.end field

.field private notificationsCall:Lretrofit2/Call;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lretrofit2/Call<",
            "Lio/github/wax911/library/model/body/GraphContainer<",
            "Lcom/ibotta/android/notification/networking/wrapper/NotificationsWrapper;",
            ">;>;"
        }
    .end annotation
.end field

.field private notificationsService:Lcom/ibotta/android/notification/networking/NotificationsService;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 7
    .param p1    # Landroid/content/Context;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 32
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 34
    new-instance v0, Lcom/ibotta/android/notification/networking/model/NotificationsViewStateSuccess;

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x7

    const/4 v6, 0x0

    move-object v1, v0

    invoke-direct/range {v1 .. v6}, Lcom/ibotta/android/notification/networking/model/NotificationsViewStateSuccess;-><init>(ILjava/util/List;Lcom/ibotta/android/notification/networking/model/Notification;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    iput-object v0, p0, Lcom/ibotta/android/notification/networking/datasource/NotificationsDataSourceImpl;->mainModel:Lcom/ibotta/android/notification/networking/model/NotificationsViewStateSuccess;

    .line 35
    sget-object v0, Lio/github/wax911/library/converter/GraphConverter;->Companion:Lio/github/wax911/library/converter/GraphConverter$Companion;

    invoke-virtual {v0, p1}, Lio/github/wax911/library/converter/GraphConverter$Companion;->create(Landroid/content/Context;)Lio/github/wax911/library/converter/GraphConverter;

    move-result-object p1

    iput-object p1, p0, Lcom/ibotta/android/notification/networking/datasource/NotificationsDataSourceImpl;->graphConverterFactory:Lio/github/wax911/library/converter/GraphConverter;

    .line 39
    new-instance p1, Lretrofit2/Retrofit$Builder;

    invoke-direct {p1}, Lretrofit2/Retrofit$Builder;-><init>()V

    const-string v0, "https://api.ibops.net/shopper_notification_service/"

    .line 40
    invoke-virtual {p1, v0}, Lretrofit2/Retrofit$Builder;->baseUrl(Ljava/lang/String;)Lretrofit2/Retrofit$Builder;

    move-result-object p1

    .line 41
    iget-object v0, p0, Lcom/ibotta/android/notification/networking/datasource/NotificationsDataSourceImpl;->graphConverterFactory:Lio/github/wax911/library/converter/GraphConverter;

    check-cast v0, Lretrofit2/Converter$Factory;

    invoke-virtual {p1, v0}, Lretrofit2/Retrofit$Builder;->addConverterFactory(Lretrofit2/Converter$Factory;)Lretrofit2/Retrofit$Builder;

    move-result-object p1

    .line 42
    invoke-direct {p0}, Lcom/ibotta/android/notification/networking/datasource/NotificationsDataSourceImpl;->getOkHttpClient()Lokhttp3/OkHttpClient;

    move-result-object v0

    invoke-virtual {p1, v0}, Lretrofit2/Retrofit$Builder;->client(Lokhttp3/OkHttpClient;)Lretrofit2/Retrofit$Builder;

    move-result-object p1

    .line 43
    invoke-virtual {p1}, Lretrofit2/Retrofit$Builder;->build()Lretrofit2/Retrofit;

    move-result-object p1

    .line 44
    const-class v0, Lcom/ibotta/android/notification/networking/NotificationsService;

    invoke-virtual {p1, v0}, Lretrofit2/Retrofit;->create(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object p1

    const-string v0, "Retrofit.Builder()\n     \u2026tionsService::class.java)"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, Lcom/ibotta/android/notification/networking/NotificationsService;

    iput-object p1, p0, Lcom/ibotta/android/notification/networking/datasource/NotificationsDataSourceImpl;->notificationsService:Lcom/ibotta/android/notification/networking/NotificationsService;

    return-void
.end method

.method public static final synthetic access$getMainModel$p(Lcom/ibotta/android/notification/networking/datasource/NotificationsDataSourceImpl;)Lcom/ibotta/android/notification/networking/model/NotificationsViewStateSuccess;
    .locals 0

    .line 32
    iget-object p0, p0, Lcom/ibotta/android/notification/networking/datasource/NotificationsDataSourceImpl;->mainModel:Lcom/ibotta/android/notification/networking/model/NotificationsViewStateSuccess;

    return-object p0
.end method

.method public static final synthetic access$setMainModel$p(Lcom/ibotta/android/notification/networking/datasource/NotificationsDataSourceImpl;Lcom/ibotta/android/notification/networking/model/NotificationsViewStateSuccess;)V
    .locals 0

    .line 32
    iput-object p1, p0, Lcom/ibotta/android/notification/networking/datasource/NotificationsDataSourceImpl;->mainModel:Lcom/ibotta/android/notification/networking/model/NotificationsViewStateSuccess;

    return-void
.end method

.method private final getOkHttpClient()Lokhttp3/OkHttpClient;
    .locals 3

    .line 126
    sget-object v0, Lcom/ibotta/api/ApiModule;->INSTANCE:Lcom/ibotta/api/ApiModule;

    invoke-virtual {v0}, Lcom/ibotta/api/ApiModule;->getHttpHeaders()Lcom/ibotta/api/HttpHeaders;

    move-result-object v0

    const-string v1, "ApiModule.INSTANCE.httpHeaders"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0}, Lcom/ibotta/api/HttpHeaders;->getBearer()Ljava/lang/String;

    move-result-object v0

    .line 128
    new-instance v1, Lokhttp3/OkHttpClient$Builder;

    invoke-direct {v1}, Lokhttp3/OkHttpClient$Builder;-><init>()V

    .line 129
    new-instance v2, Lcom/ibotta/android/notification/networking/datasource/NotificationsDataSourceImpl$getOkHttpClient$1;

    invoke-direct {v2, v0}, Lcom/ibotta/android/notification/networking/datasource/NotificationsDataSourceImpl$getOkHttpClient$1;-><init>(Ljava/lang/String;)V

    check-cast v2, Lokhttp3/Interceptor;

    invoke-virtual {v1, v2}, Lokhttp3/OkHttpClient$Builder;->addInterceptor(Lokhttp3/Interceptor;)Lokhttp3/OkHttpClient$Builder;

    move-result-object v0

    .line 135
    invoke-virtual {v0}, Lokhttp3/OkHttpClient$Builder;->build()Lokhttp3/OkHttpClient;

    move-result-object v0

    const-string v1, "OkHttpClient.Builder()\n \u2026   }\n            .build()"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v0
.end method


# virtual methods
.method public cancelNotificationCountCall()V
    .locals 1

    .line 121
    iget-object v0, p0, Lcom/ibotta/android/notification/networking/datasource/NotificationsDataSourceImpl;->notificationCountCall:Lretrofit2/Call;

    if-eqz v0, :cond_0

    invoke-interface {v0}, Lretrofit2/Call;->cancel()V

    :cond_0
    return-void
.end method

.method public cancelNotificationsCall()V
    .locals 1

    .line 117
    iget-object v0, p0, Lcom/ibotta/android/notification/networking/datasource/NotificationsDataSourceImpl;->notificationsCall:Lretrofit2/Call;

    if-eqz v0, :cond_0

    invoke-interface {v0}, Lretrofit2/Call;->cancel()V

    :cond_0
    return-void
.end method

.method public fetchNotificationById(JLcom/ibotta/android/notification/networking/MvpDataSourceCallback;)V
    .locals 3
    .param p3    # Lcom/ibotta/android/notification/networking/MvpDataSourceCallback;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(J",
            "Lcom/ibotta/android/notification/networking/MvpDataSourceCallback<",
            "Lcom/ibotta/android/notification/networking/model/NotificationsViewState;",
            ">;)V"
        }
    .end annotation

    const-string v0, "callback"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 97
    new-instance v0, Lio/github/wax911/library/model/request/QueryContainerBuilder;

    const/4 v1, 0x0

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2, v1}, Lio/github/wax911/library/model/request/QueryContainerBuilder;-><init>(Lio/github/wax911/library/model/request/QueryContainer;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const-string v1, "id"

    .line 98
    invoke-static {p1, p2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p1

    invoke-virtual {v0, v1, p1}, Lio/github/wax911/library/model/request/QueryContainerBuilder;->putVariable(Ljava/lang/String;Ljava/lang/Object;)Lio/github/wax911/library/model/request/QueryContainerBuilder;

    move-result-object p1

    .line 100
    iget-object p2, p0, Lcom/ibotta/android/notification/networking/datasource/NotificationsDataSourceImpl;->notificationsService:Lcom/ibotta/android/notification/networking/NotificationsService;

    .line 101
    invoke-interface {p2, p1}, Lcom/ibotta/android/notification/networking/NotificationsService;->getShopperNotificationById(Lio/github/wax911/library/model/request/QueryContainerBuilder;)Lretrofit2/Call;

    move-result-object p1

    .line 102
    new-instance p2, Lcom/ibotta/android/notification/networking/datasource/NotificationsDataSourceImpl$fetchNotificationById$1;

    invoke-direct {p2, p0, p3}, Lcom/ibotta/android/notification/networking/datasource/NotificationsDataSourceImpl$fetchNotificationById$1;-><init>(Lcom/ibotta/android/notification/networking/datasource/NotificationsDataSourceImpl;Lcom/ibotta/android/notification/networking/MvpDataSourceCallback;)V

    check-cast p2, Lretrofit2/Callback;

    invoke-interface {p1, p2}, Lretrofit2/Call;->enqueue(Lretrofit2/Callback;)V

    return-void
.end method

.method public fetchNotifications(JLcom/ibotta/android/notification/networking/MvpDataSourceCallback;)V
    .locals 3
    .param p3    # Lcom/ibotta/android/notification/networking/MvpDataSourceCallback;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(J",
            "Lcom/ibotta/android/notification/networking/MvpDataSourceCallback<",
            "Lcom/ibotta/android/notification/networking/model/NotificationsViewState;",
            ">;)V"
        }
    .end annotation

    const-string v0, "callback"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 74
    new-instance v0, Lio/github/wax911/library/model/request/QueryContainerBuilder;

    const/4 v1, 0x0

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2, v1}, Lio/github/wax911/library/model/request/QueryContainerBuilder;-><init>(Lio/github/wax911/library/model/request/QueryContainer;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const-string v1, "customerId"

    .line 75
    invoke-static {p1, p2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p1

    invoke-virtual {v0, v1, p1}, Lio/github/wax911/library/model/request/QueryContainerBuilder;->putVariable(Ljava/lang/String;Ljava/lang/Object;)Lio/github/wax911/library/model/request/QueryContainerBuilder;

    move-result-object p1

    .line 77
    iget-object p2, p0, Lcom/ibotta/android/notification/networking/datasource/NotificationsDataSourceImpl;->notificationsService:Lcom/ibotta/android/notification/networking/NotificationsService;

    invoke-interface {p2, p1}, Lcom/ibotta/android/notification/networking/NotificationsService;->getNotifications(Lio/github/wax911/library/model/request/QueryContainerBuilder;)Lretrofit2/Call;

    move-result-object p1

    iput-object p1, p0, Lcom/ibotta/android/notification/networking/datasource/NotificationsDataSourceImpl;->notificationsCall:Lretrofit2/Call;

    .line 79
    iget-object p1, p0, Lcom/ibotta/android/notification/networking/datasource/NotificationsDataSourceImpl;->notificationsCall:Lretrofit2/Call;

    if-eqz p1, :cond_0

    new-instance p2, Lcom/ibotta/android/notification/networking/datasource/NotificationsDataSourceImpl$fetchNotifications$1;

    invoke-direct {p2, p0, p3}, Lcom/ibotta/android/notification/networking/datasource/NotificationsDataSourceImpl$fetchNotifications$1;-><init>(Lcom/ibotta/android/notification/networking/datasource/NotificationsDataSourceImpl;Lcom/ibotta/android/notification/networking/MvpDataSourceCallback;)V

    check-cast p2, Lretrofit2/Callback;

    invoke-interface {p1, p2}, Lretrofit2/Call;->enqueue(Lretrofit2/Callback;)V

    :cond_0
    return-void
.end method

.method public fetchNotificationsCount(JLcom/ibotta/android/notification/call/BaseNotificationsCall$NotificationFilter;Lcom/ibotta/android/notification/networking/MvpDataSourceCallback;)V
    .locals 3
    .param p3    # Lcom/ibotta/android/notification/call/BaseNotificationsCall$NotificationFilter;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p4    # Lcom/ibotta/android/notification/networking/MvpDataSourceCallback;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(J",
            "Lcom/ibotta/android/notification/call/BaseNotificationsCall$NotificationFilter;",
            "Lcom/ibotta/android/notification/networking/MvpDataSourceCallback<",
            "Lcom/ibotta/android/notification/networking/model/NotificationsViewState;",
            ">;)V"
        }
    .end annotation

    const-string v0, "callback"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 50
    new-instance v0, Lio/github/wax911/library/model/request/QueryContainerBuilder;

    const/4 v1, 0x0

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2, v1}, Lio/github/wax911/library/model/request/QueryContainerBuilder;-><init>(Lio/github/wax911/library/model/request/QueryContainer;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const-string v1, "customerId"

    .line 51
    invoke-static {p1, p2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p1

    invoke-virtual {v0, v1, p1}, Lio/github/wax911/library/model/request/QueryContainerBuilder;->putVariable(Ljava/lang/String;Ljava/lang/Object;)Lio/github/wax911/library/model/request/QueryContainerBuilder;

    move-result-object p1

    const-string p2, "type"

    .line 52
    invoke-virtual {p1, p2, p3}, Lio/github/wax911/library/model/request/QueryContainerBuilder;->putVariable(Ljava/lang/String;Ljava/lang/Object;)Lio/github/wax911/library/model/request/QueryContainerBuilder;

    move-result-object p1

    const-string p2, "since"

    const-string p3, "2015-01-25T17:29:28Z"

    .line 53
    invoke-virtual {p1, p2, p3}, Lio/github/wax911/library/model/request/QueryContainerBuilder;->putVariable(Ljava/lang/String;Ljava/lang/Object;)Lio/github/wax911/library/model/request/QueryContainerBuilder;

    move-result-object p1

    .line 55
    iget-object p2, p0, Lcom/ibotta/android/notification/networking/datasource/NotificationsDataSourceImpl;->notificationsService:Lcom/ibotta/android/notification/networking/NotificationsService;

    invoke-interface {p2, p1}, Lcom/ibotta/android/notification/networking/NotificationsService;->getNotificationsCount(Lio/github/wax911/library/model/request/QueryContainerBuilder;)Lretrofit2/Call;

    move-result-object p1

    iput-object p1, p0, Lcom/ibotta/android/notification/networking/datasource/NotificationsDataSourceImpl;->notificationCountCall:Lretrofit2/Call;

    .line 57
    iget-object p1, p0, Lcom/ibotta/android/notification/networking/datasource/NotificationsDataSourceImpl;->notificationCountCall:Lretrofit2/Call;

    if-eqz p1, :cond_0

    new-instance p2, Lcom/ibotta/android/notification/networking/datasource/NotificationsDataSourceImpl$fetchNotificationsCount$1;

    invoke-direct {p2, p0, p4}, Lcom/ibotta/android/notification/networking/datasource/NotificationsDataSourceImpl$fetchNotificationsCount$1;-><init>(Lcom/ibotta/android/notification/networking/datasource/NotificationsDataSourceImpl;Lcom/ibotta/android/notification/networking/MvpDataSourceCallback;)V

    check-cast p2, Lretrofit2/Callback;

    invoke-interface {p1, p2}, Lretrofit2/Call;->enqueue(Lretrofit2/Callback;)V

    :cond_0
    return-void
.end method
