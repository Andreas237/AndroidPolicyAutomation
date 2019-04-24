.class public Lcom/shopkick/app/urlhandlers/ResetPasswordHandler;
.super Lcom/shopkick/app/url/URLHandler;
.source "ResetPasswordHandler.java"


# static fields
.field public static final DISPATCHER_KEY:Ljava/lang/String; = "reset_password"

.field public static final RESET_PASSWORD_HANDLER_PARAM_CODE:Ljava/lang/String; = "code"

.field public static final RESET_PASSWORD_HANDLER_PARAM_USER_ID:Ljava/lang/String; = "user_id"


# instance fields
.field private appActivityManager:Lcom/shopkick/app/application/AppActivityManager;

.field private userAccountDataSource:Lcom/shopkick/app/account/UserAccountDataSource;


# direct methods
.method public constructor <init>(Lcom/shopkick/app/application/AppActivityManager;Lcom/shopkick/app/account/UserAccountDataSource;)V
    .locals 0

    .line 26
    invoke-direct {p0}, Lcom/shopkick/app/url/URLHandler;-><init>()V

    .line 27
    iput-object p1, p0, Lcom/shopkick/app/urlhandlers/ResetPasswordHandler;->appActivityManager:Lcom/shopkick/app/application/AppActivityManager;

    .line 28
    iput-object p2, p0, Lcom/shopkick/app/urlhandlers/ResetPasswordHandler;->userAccountDataSource:Lcom/shopkick/app/account/UserAccountDataSource;

    const/4 p1, 0x0

    .line 29
    iput-boolean p1, p0, Lcom/shopkick/app/urlhandlers/ResetPasswordHandler;->isAsync:Z

    return-void
.end method


# virtual methods
.method public execute()V
    .locals 4

    .line 34
    iget-object v0, p0, Lcom/shopkick/app/urlhandlers/ResetPasswordHandler;->appActivityManager:Lcom/shopkick/app/application/AppActivityManager;

    invoke-virtual {v0}, Lcom/shopkick/app/application/AppActivityManager;->getCurrentActivity()Lcom/shopkick/app/activities/BaseActivity;

    move-result-object v0

    if-nez v0, :cond_0

    .line 36
    invoke-virtual {p0}, Lcom/shopkick/app/urlhandlers/ResetPasswordHandler;->finish()V

    return-void

    .line 40
    :cond_0
    iget-object v0, p0, Lcom/shopkick/app/urlhandlers/ResetPasswordHandler;->userAccountDataSource:Lcom/shopkick/app/account/UserAccountDataSource;

    invoke-virtual {v0}, Lcom/shopkick/app/account/UserAccountDataSource;->cancelRefreshAccountInfoRequest()V

    .line 42
    iget-object v0, p0, Lcom/shopkick/app/urlhandlers/ResetPasswordHandler;->userAccountDataSource:Lcom/shopkick/app/account/UserAccountDataSource;

    const/4 v1, 0x7

    invoke-virtual {v0, v1}, Lcom/shopkick/app/account/UserAccountDataSource;->resetCurrentUserWithReason(I)V

    .line 44
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    const-string/jumbo v1, "user_id"

    .line 45
    iget-object v2, p0, Lcom/shopkick/app/urlhandlers/ResetPasswordHandler;->params:Ljava/util/Map;

    const-string/jumbo v3, "user_id"

    .line 46
    invoke-interface {v2, v3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    .line 45
    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v1, "code"

    .line 47
    iget-object v2, p0, Lcom/shopkick/app/urlhandlers/ResetPasswordHandler;->params:Ljava/util/Map;

    const-string v3, "code"

    .line 48
    invoke-interface {v2, v3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    .line 47
    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 49
    new-instance v1, Lcom/shopkick/app/activities/PageIdentifierV2;

    const-class v2, Lcom/shopkick/app/activities/LoginRegistrationActivity;

    const-class v3, Lcom/shopkick/app/account/ResetPasswordScreen;

    invoke-direct {v1, v2, v3, v0}, Lcom/shopkick/app/activities/PageIdentifierV2;-><init>(Ljava/lang/Class;Ljava/lang/Class;Ljava/util/Map;)V

    .line 53
    iget-object v0, p0, Lcom/shopkick/app/urlhandlers/ResetPasswordHandler;->appActivityManager:Lcom/shopkick/app/application/AppActivityManager;

    invoke-virtual {v0}, Lcom/shopkick/app/application/AppActivityManager;->getCurrentActivity()Lcom/shopkick/app/activities/BaseActivity;

    move-result-object v0

    invoke-virtual {v0, v1}, Lcom/shopkick/app/activities/BaseActivity;->goToScreenForPageIdentifierV2(Lcom/shopkick/app/activities/PageIdentifierV2;)Z

    return-void
.end method
