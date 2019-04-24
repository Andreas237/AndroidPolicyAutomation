.class public Lcom/shopkick/app/urlhandlers/RegisterHandler;
.super Lcom/shopkick/app/url/URLHandler;
.source "RegisterHandler.java"


# static fields
.field public static final DISPATCHER_KEY:Ljava/lang/String; = "register"


# instance fields
.field private appActivityManager:Lcom/shopkick/app/application/AppActivityManager;

.field private userAccount:Lcom/shopkick/app/account/UserAccount;


# direct methods
.method public constructor <init>(Lcom/shopkick/app/application/AppActivityManager;Lcom/shopkick/app/account/UserAccount;)V
    .locals 0

    .line 19
    invoke-direct {p0}, Lcom/shopkick/app/url/URLHandler;-><init>()V

    .line 20
    iput-object p1, p0, Lcom/shopkick/app/urlhandlers/RegisterHandler;->appActivityManager:Lcom/shopkick/app/application/AppActivityManager;

    .line 21
    iput-object p2, p0, Lcom/shopkick/app/urlhandlers/RegisterHandler;->userAccount:Lcom/shopkick/app/account/UserAccount;

    const/4 p1, 0x0

    .line 24
    iput-boolean p1, p0, Lcom/shopkick/app/urlhandlers/RegisterHandler;->isAsync:Z

    return-void
.end method


# virtual methods
.method public cancel()V
    .locals 0

    .line 29
    invoke-super {p0}, Lcom/shopkick/app/url/URLHandler;->cancel()V

    return-void
.end method

.method public execute()V
    .locals 4

    .line 34
    iget-object v0, p0, Lcom/shopkick/app/urlhandlers/RegisterHandler;->userAccount:Lcom/shopkick/app/account/UserAccount;

    invoke-virtual {v0}, Lcom/shopkick/app/account/UserAccount;->isRegistered()Z

    move-result v0

    if-nez v0, :cond_0

    .line 35
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    const-string v1, "LaunchPhoneVerificationPostRegistration"

    const/4 v2, 0x1

    .line 37
    invoke-static {v2}, Ljava/lang/String;->valueOf(Z)Ljava/lang/String;

    move-result-object v2

    .line 36
    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 38
    new-instance v1, Lcom/shopkick/app/activities/PageIdentifierV2;

    const-class v2, Lcom/shopkick/app/activities/LoginRegistrationActivity;

    const-class v3, Lcom/shopkick/app/registration/LoginPickerV3Screen;

    invoke-direct {v1, v2, v3, v0}, Lcom/shopkick/app/activities/PageIdentifierV2;-><init>(Ljava/lang/Class;Ljava/lang/Class;Ljava/util/Map;)V

    .line 41
    iget-object v0, p0, Lcom/shopkick/app/urlhandlers/RegisterHandler;->appActivityManager:Lcom/shopkick/app/application/AppActivityManager;

    invoke-virtual {v0}, Lcom/shopkick/app/application/AppActivityManager;->getCurrentActivity()Lcom/shopkick/app/activities/BaseActivity;

    move-result-object v0

    invoke-virtual {v0, v1}, Lcom/shopkick/app/activities/BaseActivity;->goToScreenForPageIdentifierV2(Lcom/shopkick/app/activities/PageIdentifierV2;)Z

    :cond_0
    return-void
.end method
