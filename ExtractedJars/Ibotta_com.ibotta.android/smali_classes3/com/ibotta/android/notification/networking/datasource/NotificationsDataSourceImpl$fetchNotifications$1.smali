.class public final Lcom/ibotta/android/notification/networking/datasource/NotificationsDataSourceImpl$fetchNotifications$1;
.super Ljava/lang/Object;
.source "NotificationsDataSourceImpl.kt"

# interfaces
.implements Lretrofit2/Callback;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/ibotta/android/notification/networking/datasource/NotificationsDataSourceImpl;->fetchNotifications(JLcom/ibotta/android/notification/networking/MvpDataSourceCallback;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lretrofit2/Callback<",
        "Lio/github/wax911/library/model/body/GraphContainer<",
        "Lcom/ibotta/android/notification/networking/wrapper/NotificationsWrapper;",
        ">;>;"
    }
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nNotificationsDataSourceImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NotificationsDataSourceImpl.kt\ncom/ibotta/android/notification/networking/datasource/NotificationsDataSourceImpl$fetchNotifications$1\n*L\n1#1,137:1\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    bv = {
        0x1,
        0x0,
        0x3
    }
    d1 = {
        "\u0000-\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\u0008\n\u0018\u00002\u000e\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u00030\u00020\u0001J$\u0010\u0004\u001a\u00020\u00052\u0012\u0010\u0006\u001a\u000e\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u00030\u00020\u00072\u0006\u0010\u0008\u001a\u00020\tH\u0016J0\u0010\n\u001a\u00020\u00052\u0012\u0010\u0006\u001a\u000e\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u00030\u00020\u00072\u0012\u0010\u000b\u001a\u000e\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u00030\u00020\u000cH\u0016\u00a8\u0006\r"
    }
    d2 = {
        "com/ibotta/android/notification/networking/datasource/NotificationsDataSourceImpl$fetchNotifications$1",
        "Lretrofit2/Callback;",
        "Lio/github/wax911/library/model/body/GraphContainer;",
        "Lcom/ibotta/android/notification/networking/wrapper/NotificationsWrapper;",
        "onFailure",
        "",
        "call",
        "Lretrofit2/Call;",
        "t",
        "",
        "onResponse",
        "response",
        "Lretrofit2/Response;",
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
.field final synthetic $callback:Lcom/ibotta/android/notification/networking/MvpDataSourceCallback;

.field final synthetic this$0:Lcom/ibotta/android/notification/networking/datasource/NotificationsDataSourceImpl;


# direct methods
.method constructor <init>(Lcom/ibotta/android/notification/networking/datasource/NotificationsDataSourceImpl;Lcom/ibotta/android/notification/networking/MvpDataSourceCallback;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/ibotta/android/notification/networking/MvpDataSourceCallback;",
            ")V"
        }
    .end annotation

    .line 79
    iput-object p1, p0, Lcom/ibotta/android/notification/networking/datasource/NotificationsDataSourceImpl$fetchNotifications$1;->this$0:Lcom/ibotta/android/notification/networking/datasource/NotificationsDataSourceImpl;

    iput-object p2, p0, Lcom/ibotta/android/notification/networking/datasource/NotificationsDataSourceImpl$fetchNotifications$1;->$callback:Lcom/ibotta/android/notification/networking/MvpDataSourceCallback;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onFailure(Lretrofit2/Call;Ljava/lang/Throwable;)V
    .locals 1
    .param p1    # Lretrofit2/Call;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Ljava/lang/Throwable;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lretrofit2/Call<",
            "Lio/github/wax911/library/model/body/GraphContainer<",
            "Lcom/ibotta/android/notification/networking/wrapper/NotificationsWrapper;",
            ">;>;",
            "Ljava/lang/Throwable;",
            ")V"
        }
    .end annotation

    const-string v0, "call"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p1, "t"

    invoke-static {p2, p1}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 82
    iget-object p1, p0, Lcom/ibotta/android/notification/networking/datasource/NotificationsDataSourceImpl$fetchNotifications$1;->$callback:Lcom/ibotta/android/notification/networking/MvpDataSourceCallback;

    new-instance v0, Lcom/ibotta/android/notification/networking/model/NotificationsViewStateFailure;

    invoke-direct {v0, p2}, Lcom/ibotta/android/notification/networking/model/NotificationsViewStateFailure;-><init>(Ljava/lang/Throwable;)V

    invoke-interface {p1, v0}, Lcom/ibotta/android/notification/networking/MvpDataSourceCallback;->onLoadFinished(Ljava/lang/Object;)V

    return-void
.end method

.method public onResponse(Lretrofit2/Call;Lretrofit2/Response;)V
    .locals 6
    .param p1    # Lretrofit2/Call;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Lretrofit2/Response;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lretrofit2/Call<",
            "Lio/github/wax911/library/model/body/GraphContainer<",
            "Lcom/ibotta/android/notification/networking/wrapper/NotificationsWrapper;",
            ">;>;",
            "Lretrofit2/Response<",
            "Lio/github/wax911/library/model/body/GraphContainer<",
            "Lcom/ibotta/android/notification/networking/wrapper/NotificationsWrapper;",
            ">;>;)V"
        }
    .end annotation

    const-string v0, "call"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p1, "response"

    invoke-static {p2, p1}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 87
    iget-object p1, p0, Lcom/ibotta/android/notification/networking/datasource/NotificationsDataSourceImpl$fetchNotifications$1;->this$0:Lcom/ibotta/android/notification/networking/datasource/NotificationsDataSourceImpl;

    invoke-static {p1}, Lcom/ibotta/android/notification/networking/datasource/NotificationsDataSourceImpl;->access$getMainModel$p(Lcom/ibotta/android/notification/networking/datasource/NotificationsDataSourceImpl;)Lcom/ibotta/android/notification/networking/model/NotificationsViewStateSuccess;

    move-result-object v0

    invoke-virtual {p2}, Lretrofit2/Response;->body()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lio/github/wax911/library/model/body/GraphContainer;

    if-eqz p2, :cond_0

    invoke-virtual {p2}, Lio/github/wax911/library/model/body/GraphContainer;->getData()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lcom/ibotta/android/notification/networking/wrapper/NotificationsWrapper;

    if-eqz p2, :cond_0

    invoke-virtual {p2}, Lcom/ibotta/android/notification/networking/wrapper/NotificationsWrapper;->getShopperNotifications()Ljava/util/List;

    move-result-object p2

    if-eqz p2, :cond_0

    goto :goto_0

    :cond_0
    new-instance p2, Ljava/util/ArrayList;

    invoke-direct {p2}, Ljava/util/ArrayList;-><init>()V

    check-cast p2, Ljava/util/List;

    :goto_0
    move-object v2, p2

    const/4 v3, 0x0

    const/4 v4, 0x5

    const/4 v5, 0x0

    const/4 v1, 0x0

    invoke-static/range {v0 .. v5}, Lcom/ibotta/android/notification/networking/model/NotificationsViewStateSuccess;->copy$default(Lcom/ibotta/android/notification/networking/model/NotificationsViewStateSuccess;ILjava/util/List;Lcom/ibotta/android/notification/networking/model/Notification;ILjava/lang/Object;)Lcom/ibotta/android/notification/networking/model/NotificationsViewStateSuccess;

    move-result-object p2

    invoke-static {p1, p2}, Lcom/ibotta/android/notification/networking/datasource/NotificationsDataSourceImpl;->access$setMainModel$p(Lcom/ibotta/android/notification/networking/datasource/NotificationsDataSourceImpl;Lcom/ibotta/android/notification/networking/model/NotificationsViewStateSuccess;)V

    .line 88
    iget-object p1, p0, Lcom/ibotta/android/notification/networking/datasource/NotificationsDataSourceImpl$fetchNotifications$1;->$callback:Lcom/ibotta/android/notification/networking/MvpDataSourceCallback;

    iget-object p2, p0, Lcom/ibotta/android/notification/networking/datasource/NotificationsDataSourceImpl$fetchNotifications$1;->this$0:Lcom/ibotta/android/notification/networking/datasource/NotificationsDataSourceImpl;

    invoke-static {p2}, Lcom/ibotta/android/notification/networking/datasource/NotificationsDataSourceImpl;->access$getMainModel$p(Lcom/ibotta/android/notification/networking/datasource/NotificationsDataSourceImpl;)Lcom/ibotta/android/notification/networking/model/NotificationsViewStateSuccess;

    move-result-object p2

    invoke-interface {p1, p2}, Lcom/ibotta/android/notification/networking/MvpDataSourceCallback;->onLoadFinished(Ljava/lang/Object;)V

    return-void
.end method
