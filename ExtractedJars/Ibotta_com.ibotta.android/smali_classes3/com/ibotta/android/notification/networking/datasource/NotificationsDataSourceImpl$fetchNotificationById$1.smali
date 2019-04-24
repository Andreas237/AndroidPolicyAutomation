.class public final Lcom/ibotta/android/notification/networking/datasource/NotificationsDataSourceImpl$fetchNotificationById$1;
.super Ljava/lang/Object;
.source "NotificationsDataSourceImpl.kt"

# interfaces
.implements Lretrofit2/Callback;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/ibotta/android/notification/networking/datasource/NotificationsDataSourceImpl;->fetchNotificationById(JLcom/ibotta/android/notification/networking/MvpDataSourceCallback;)V
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
        "Lcom/ibotta/android/notification/networking/wrapper/NotificationWrapper;",
        ">;>;"
    }
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
        "com/ibotta/android/notification/networking/datasource/NotificationsDataSourceImpl$fetchNotificationById$1",
        "Lretrofit2/Callback;",
        "Lio/github/wax911/library/model/body/GraphContainer;",
        "Lcom/ibotta/android/notification/networking/wrapper/NotificationWrapper;",
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

    .line 102
    iput-object p1, p0, Lcom/ibotta/android/notification/networking/datasource/NotificationsDataSourceImpl$fetchNotificationById$1;->this$0:Lcom/ibotta/android/notification/networking/datasource/NotificationsDataSourceImpl;

    iput-object p2, p0, Lcom/ibotta/android/notification/networking/datasource/NotificationsDataSourceImpl$fetchNotificationById$1;->$callback:Lcom/ibotta/android/notification/networking/MvpDataSourceCallback;

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
            "Lcom/ibotta/android/notification/networking/wrapper/NotificationWrapper;",
            ">;>;",
            "Ljava/lang/Throwable;",
            ")V"
        }
    .end annotation

    const-string v0, "call"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p1, "t"

    invoke-static {p2, p1}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 105
    iget-object p1, p0, Lcom/ibotta/android/notification/networking/datasource/NotificationsDataSourceImpl$fetchNotificationById$1;->$callback:Lcom/ibotta/android/notification/networking/MvpDataSourceCallback;

    new-instance v0, Lcom/ibotta/android/notification/networking/model/NotificationsViewStateFailure;

    invoke-direct {v0, p2}, Lcom/ibotta/android/notification/networking/model/NotificationsViewStateFailure;-><init>(Ljava/lang/Throwable;)V

    invoke-interface {p1, v0}, Lcom/ibotta/android/notification/networking/MvpDataSourceCallback;->onLoadFinished(Ljava/lang/Object;)V

    return-void
.end method

.method public onResponse(Lretrofit2/Call;Lretrofit2/Response;)V
    .locals 24
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
            "Lcom/ibotta/android/notification/networking/wrapper/NotificationWrapper;",
            ">;>;",
            "Lretrofit2/Response<",
            "Lio/github/wax911/library/model/body/GraphContainer<",
            "Lcom/ibotta/android/notification/networking/wrapper/NotificationWrapper;",
            ">;>;)V"
        }
    .end annotation

    move-object/from16 v0, p0

    const-string v1, "call"

    move-object/from16 v2, p1

    invoke-static {v2, v1}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v1, "response"

    move-object/from16 v2, p2

    invoke-static {v2, v1}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 110
    iget-object v1, v0, Lcom/ibotta/android/notification/networking/datasource/NotificationsDataSourceImpl$fetchNotificationById$1;->this$0:Lcom/ibotta/android/notification/networking/datasource/NotificationsDataSourceImpl;

    invoke-static {v1}, Lcom/ibotta/android/notification/networking/datasource/NotificationsDataSourceImpl;->access$getMainModel$p(Lcom/ibotta/android/notification/networking/datasource/NotificationsDataSourceImpl;)Lcom/ibotta/android/notification/networking/model/NotificationsViewStateSuccess;

    move-result-object v3

    invoke-virtual/range {p2 .. p2}, Lretrofit2/Response;->body()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lio/github/wax911/library/model/body/GraphContainer;

    if-eqz v2, :cond_0

    invoke-virtual {v2}, Lio/github/wax911/library/model/body/GraphContainer;->getData()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/ibotta/android/notification/networking/wrapper/NotificationWrapper;

    if-eqz v2, :cond_0

    invoke-virtual {v2}, Lcom/ibotta/android/notification/networking/wrapper/NotificationWrapper;->getGetShopperNotificationById()Lcom/ibotta/android/notification/networking/model/Notification;

    move-result-object v2

    if-eqz v2, :cond_0

    goto :goto_0

    :cond_0
    new-instance v2, Lcom/ibotta/android/notification/networking/model/Notification;

    move-object v4, v2

    const-wide/16 v5, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    const v22, 0xffff

    const/16 v23, 0x0

    invoke-direct/range {v4 .. v23}, Lcom/ibotta/android/notification/networking/model/Notification;-><init>(JILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;FLjava/lang/String;IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    :goto_0
    move-object v5, v2

    const/4 v6, 0x3

    const/4 v7, 0x0

    const/4 v4, 0x0

    const/4 v8, 0x0

    move-object v2, v3

    move v3, v4

    move-object v4, v8

    invoke-static/range {v2 .. v7}, Lcom/ibotta/android/notification/networking/model/NotificationsViewStateSuccess;->copy$default(Lcom/ibotta/android/notification/networking/model/NotificationsViewStateSuccess;ILjava/util/List;Lcom/ibotta/android/notification/networking/model/Notification;ILjava/lang/Object;)Lcom/ibotta/android/notification/networking/model/NotificationsViewStateSuccess;

    move-result-object v2

    invoke-static {v1, v2}, Lcom/ibotta/android/notification/networking/datasource/NotificationsDataSourceImpl;->access$setMainModel$p(Lcom/ibotta/android/notification/networking/datasource/NotificationsDataSourceImpl;Lcom/ibotta/android/notification/networking/model/NotificationsViewStateSuccess;)V

    .line 111
    iget-object v1, v0, Lcom/ibotta/android/notification/networking/datasource/NotificationsDataSourceImpl$fetchNotificationById$1;->$callback:Lcom/ibotta/android/notification/networking/MvpDataSourceCallback;

    iget-object v2, v0, Lcom/ibotta/android/notification/networking/datasource/NotificationsDataSourceImpl$fetchNotificationById$1;->this$0:Lcom/ibotta/android/notification/networking/datasource/NotificationsDataSourceImpl;

    invoke-static {v2}, Lcom/ibotta/android/notification/networking/datasource/NotificationsDataSourceImpl;->access$getMainModel$p(Lcom/ibotta/android/notification/networking/datasource/NotificationsDataSourceImpl;)Lcom/ibotta/android/notification/networking/model/NotificationsViewStateSuccess;

    move-result-object v2

    invoke-interface {v1, v2}, Lcom/ibotta/android/notification/networking/MvpDataSourceCallback;->onLoadFinished(Ljava/lang/Object;)V

    return-void
.end method
