.class public Lcom/shopkick/app/urlhandlers/AuthCodeLoginHandler;
.super Lcom/shopkick/app/url/URLHandler;
.source "AuthCodeLoginHandler.java"


# static fields
.field public static final AUTH_CODE_LOGIN_HANDLER_PARAM_AUTH_CODE:Ljava/lang/String; = "auth_code"

.field public static final DISPATCHER_KEY:Ljava/lang/String; = "auth_code_login"


# instance fields
.field private appActivityManager:Lcom/shopkick/app/application/AppActivityManager;

.field private userAccountDataSource:Lcom/shopkick/app/account/UserAccountDataSource;


# direct methods
.method public constructor <init>(Lcom/shopkick/app/application/AppActivityManager;Lcom/shopkick/app/account/UserAccountDataSource;)V
    .locals 0

    .line 26
    invoke-direct {p0}, Lcom/shopkick/app/url/URLHandler;-><init>()V

    .line 27
    iput-object p1, p0, Lcom/shopkick/app/urlhandlers/AuthCodeLoginHandler;->appActivityManager:Lcom/shopkick/app/application/AppActivityManager;

    .line 28
    iput-object p2, p0, Lcom/shopkick/app/urlhandlers/AuthCodeLoginHandler;->userAccountDataSource:Lcom/shopkick/app/account/UserAccountDataSource;

    const/4 p1, 0x0

    .line 29
    iput-boolean p1, p0, Lcom/shopkick/app/urlhandlers/AuthCodeLoginHandler;->isAsync:Z

    return-void
.end method


# virtual methods
.method public execute()V
    .locals 5

    .line 34
    iget-object v0, p0, Lcom/shopkick/app/urlhandlers/AuthCodeLoginHandler;->appActivityManager:Lcom/shopkick/app/application/AppActivityManager;

    invoke-virtual {v0}, Lcom/shopkick/app/application/AppActivityManager;->getCurrentActivity()Lcom/shopkick/app/activities/BaseActivity;

    move-result-object v0

    if-nez v0, :cond_0

    .line 36
    invoke-virtual {p0}, Lcom/shopkick/app/urlhandlers/AuthCodeLoginHandler;->finish()V

    return-void

    .line 43
    :cond_0
    iget-object v1, p0, Lcom/shopkick/app/urlhandlers/AuthCodeLoginHandler;->userAccountDataSource:Lcom/shopkick/app/account/UserAccountDataSource;

    invoke-virtual {v1}, Lcom/shopkick/app/account/UserAccountDataSource;->cancelRefreshAccountInfoRequest()V

    .line 48
    iget-object v1, p0, Lcom/shopkick/app/urlhandlers/AuthCodeLoginHandler;->userAccountDataSource:Lcom/shopkick/app/account/UserAccountDataSource;

    const/4 v2, 0x7

    invoke-virtual {v1, v2}, Lcom/shopkick/app/account/UserAccountDataSource;->resetCurrentUserWithReason(I)V

    .line 50
    iget-object v1, p0, Lcom/shopkick/app/urlhandlers/AuthCodeLoginHandler;->params:Ljava/util/Map;

    const-string v2, "auth_code"

    invoke-interface {v1, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    .line 51
    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v2

    if-eqz v2, :cond_1

    const-string v1, " "

    .line 55
    :cond_1
    new-instance v2, Ljava/util/HashMap;

    invoke-direct {v2}, Ljava/util/HashMap;-><init>()V

    const-string v3, "auth_code"

    .line 56
    invoke-interface {v2, v3, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 57
    new-instance v1, Lcom/shopkick/app/activities/PageIdentifierV2;

    const-class v3, Lcom/shopkick/app/activities/LoginRegistrationActivity;

    const-class v4, Lcom/shopkick/app/registration/EmailLoginV3Screen;

    invoke-direct {v1, v3, v4, v2}, Lcom/shopkick/app/activities/PageIdentifierV2;-><init>(Ljava/lang/Class;Ljava/lang/Class;Ljava/util/Map;)V

    .line 61
    invoke-virtual {v0, v1}, Lcom/shopkick/app/activities/BaseActivity;->goToScreenForPageIdentifierV2(Lcom/shopkick/app/activities/PageIdentifierV2;)Z

    return-void
.end method
