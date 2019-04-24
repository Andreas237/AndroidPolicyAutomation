.class public Lcom/shopkick/app/controllers/SKDeskIntegrationController;
.super Ljava/lang/Object;
.source "SKDeskIntegrationController.java"


# static fields
.field static final SUPPORT_APP_STRING_KEY:Ljava/lang/String; = "app_string"

.field static final SUPPORT_DEVICE_ID_KEY:Ljava/lang/String; = "device_id"

.field static final SUPPORT_DEVICE_MODEL_KEY:Ljava/lang/String; = "device_model"

.field static final SUPPORT_OS_STRING_KEY:Ljava/lang/String; = "os_string"

.field static final SUPPORT_USER_ID_KEY:Ljava/lang/String; = "user_id"


# instance fields
.field private appActivityManager:Lcom/shopkick/app/application/AppActivityManager;

.field private appInfo:Lcom/shopkick/app/application/AppInfo;

.field private clientFlagsManager:Lcom/shopkick/app/application/ClientFlagsManager;

.field private deviceInfo:Lcom/shopkick/app/application/DeviceInfo;

.field private userAccount:Lcom/shopkick/app/account/UserAccount;


# direct methods
.method public constructor <init>(Lcom/shopkick/app/account/UserAccount;Lcom/shopkick/app/application/DeviceInfo;Lcom/shopkick/app/application/AppInfo;Lcom/shopkick/app/application/ClientFlagsManager;Lcom/shopkick/app/application/AppActivityManager;)V
    .locals 0

    .line 39
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 40
    iput-object p5, p0, Lcom/shopkick/app/controllers/SKDeskIntegrationController;->appActivityManager:Lcom/shopkick/app/application/AppActivityManager;

    .line 41
    iput-object p1, p0, Lcom/shopkick/app/controllers/SKDeskIntegrationController;->userAccount:Lcom/shopkick/app/account/UserAccount;

    .line 42
    iput-object p4, p0, Lcom/shopkick/app/controllers/SKDeskIntegrationController;->clientFlagsManager:Lcom/shopkick/app/application/ClientFlagsManager;

    .line 43
    iput-object p2, p0, Lcom/shopkick/app/controllers/SKDeskIntegrationController;->deviceInfo:Lcom/shopkick/app/application/DeviceInfo;

    .line 44
    iput-object p3, p0, Lcom/shopkick/app/controllers/SKDeskIntegrationController;->appInfo:Lcom/shopkick/app/application/AppInfo;

    return-void
.end method


# virtual methods
.method public showSKDeskWebview(Lcom/shopkick/app/screens/AppScreen;)V
    .locals 4

    if-nez p1, :cond_0

    return-void

    .line 50
    :cond_0
    invoke-virtual {p1}, Lcom/shopkick/app/screens/AppScreen;->getBaseActivity()Lcom/shopkick/app/activities/BaseActivity;

    move-result-object p1

    if-nez p1, :cond_1

    return-void

    .line 53
    :cond_1
    iget-object v0, p0, Lcom/shopkick/app/controllers/SKDeskIntegrationController;->clientFlagsManager:Lcom/shopkick/app/application/ClientFlagsManager;

    iget-object v0, v0, Lcom/shopkick/app/application/ClientFlagsManager;->clientFlags:Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;

    iget-object v0, v0, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->supportUrl:Ljava/lang/String;

    invoke-static {v0}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v0

    invoke-virtual {v0}, Landroid/net/Uri;->buildUpon()Landroid/net/Uri$Builder;

    move-result-object v0

    const-string/jumbo v1, "user_id"

    .line 54
    iget-object v2, p0, Lcom/shopkick/app/controllers/SKDeskIntegrationController;->userAccount:Lcom/shopkick/app/account/UserAccount;

    invoke-virtual {v2}, Lcom/shopkick/app/account/UserAccount;->getUserId()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Landroid/net/Uri$Builder;->appendQueryParameter(Ljava/lang/String;Ljava/lang/String;)Landroid/net/Uri$Builder;

    const-string v1, "app_string"

    .line 55
    iget-object v2, p0, Lcom/shopkick/app/controllers/SKDeskIntegrationController;->appInfo:Lcom/shopkick/app/application/AppInfo;

    invoke-virtual {v2}, Lcom/shopkick/app/application/AppInfo;->getAppString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Landroid/net/Uri$Builder;->appendQueryParameter(Ljava/lang/String;Ljava/lang/String;)Landroid/net/Uri$Builder;

    const-string v1, "os_string"

    .line 56
    iget-object v2, p0, Lcom/shopkick/app/controllers/SKDeskIntegrationController;->deviceInfo:Lcom/shopkick/app/application/DeviceInfo;

    invoke-virtual {v2}, Lcom/shopkick/app/application/DeviceInfo;->getOsString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Landroid/net/Uri$Builder;->appendQueryParameter(Ljava/lang/String;Ljava/lang/String;)Landroid/net/Uri$Builder;

    const-string v1, "device_model"

    .line 57
    iget-object v2, p0, Lcom/shopkick/app/controllers/SKDeskIntegrationController;->deviceInfo:Lcom/shopkick/app/application/DeviceInfo;

    invoke-virtual {v2}, Lcom/shopkick/app/application/DeviceInfo;->getDeviceModel()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Landroid/net/Uri$Builder;->appendQueryParameter(Ljava/lang/String;Ljava/lang/String;)Landroid/net/Uri$Builder;

    const-string v1, "device_id"

    .line 58
    iget-object v2, p0, Lcom/shopkick/app/controllers/SKDeskIntegrationController;->deviceInfo:Lcom/shopkick/app/application/DeviceInfo;

    invoke-virtual {v2}, Lcom/shopkick/app/application/DeviceInfo;->getDeviceId()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Landroid/net/Uri$Builder;->appendQueryParameter(Ljava/lang/String;Ljava/lang/String;)Landroid/net/Uri$Builder;

    .line 60
    new-instance v1, Ljava/util/HashMap;

    invoke-direct {v1}, Ljava/util/HashMap;-><init>()V

    const-string/jumbo v2, "url"

    .line 61
    invoke-virtual {v0}, Landroid/net/Uri$Builder;->build()Landroid/net/Uri;

    move-result-object v0

    invoke-virtual {v0}, Landroid/net/Uri;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v2, v0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v0, "header_title"

    const v2, 0x7f11066d

    .line 62
    invoke-virtual {p1, v2}, Lcom/shopkick/app/activities/BaseActivity;->getString(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v0, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string/jumbo v0, "show_nav_bar"

    const/4 v2, 0x0

    .line 63
    invoke-static {v2}, Ljava/lang/String;->valueOf(Z)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v0, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 65
    new-instance v0, Lcom/shopkick/app/activities/PageIdentifierV2;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v2

    const-class v3, Lcom/shopkick/app/webview/WebViewScreen;

    invoke-direct {v0, v2, v3, v1}, Lcom/shopkick/app/activities/PageIdentifierV2;-><init>(Ljava/lang/Class;Ljava/lang/Class;Ljava/util/Map;)V

    .line 66
    invoke-virtual {p1, v0}, Lcom/shopkick/app/activities/BaseActivity;->goToScreenForPageIdentifierV2(Lcom/shopkick/app/activities/PageIdentifierV2;)Z

    return-void
.end method
