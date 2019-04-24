.class public Lcom/shopkick/app/urlhandlers/InviteHandler;
.super Lcom/shopkick/app/url/URLHandler;
.source "InviteHandler.java"

# interfaces
.implements Lcom/shopkick/app/util/INotificationObserver;


# static fields
.field public static final DISPATCHER_KEY:Ljava/lang/String; = "invite"

.field public static final PARAM_VERSION:Ljava/lang/String; = "version"


# instance fields
.field private appActivityManager:Lcom/shopkick/app/application/AppActivityManager;

.field private authenticator:Lcom/shopkick/app/account/Authenticator;

.field private final clientFlagsManager:Lcom/shopkick/app/application/ClientFlagsManager;

.field private launchingActivity:Ljava/lang/ref/WeakReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ref/WeakReference<",
            "Lcom/shopkick/app/activities/BaseActivity;",
            ">;"
        }
    .end annotation
.end field

.field private notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

.field private userAccountDataSource:Lcom/shopkick/app/account/UserAccountDataSource;


# direct methods
.method public constructor <init>(Lcom/shopkick/app/application/AppActivityManager;Lcom/shopkick/app/account/UserAccountDataSource;Lcom/shopkick/app/account/Authenticator;Lcom/shopkick/app/util/NotificationCenter;Lcom/shopkick/app/application/ClientFlagsManager;)V
    .locals 0

    .line 48
    invoke-direct {p0}, Lcom/shopkick/app/url/URLHandler;-><init>()V

    .line 49
    iput-object p1, p0, Lcom/shopkick/app/urlhandlers/InviteHandler;->appActivityManager:Lcom/shopkick/app/application/AppActivityManager;

    .line 50
    iput-object p2, p0, Lcom/shopkick/app/urlhandlers/InviteHandler;->userAccountDataSource:Lcom/shopkick/app/account/UserAccountDataSource;

    .line 51
    iput-object p3, p0, Lcom/shopkick/app/urlhandlers/InviteHandler;->authenticator:Lcom/shopkick/app/account/Authenticator;

    .line 52
    iput-object p4, p0, Lcom/shopkick/app/urlhandlers/InviteHandler;->notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

    const/4 p1, 0x0

    .line 53
    iput-boolean p1, p0, Lcom/shopkick/app/urlhandlers/InviteHandler;->isAsync:Z

    const-string p1, "client flags manager should not be null"

    .line 55
    invoke-static {p5, p1}, Lcom/google/common/base/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 56
    iput-object p5, p0, Lcom/shopkick/app/urlhandlers/InviteHandler;->clientFlagsManager:Lcom/shopkick/app/application/ClientFlagsManager;

    return-void
.end method

.method private maybeGoToInviteScreen()V
    .locals 5

    .line 78
    iget-object v0, p0, Lcom/shopkick/app/urlhandlers/InviteHandler;->launchingActivity:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/shopkick/app/activities/BaseActivity;

    if-nez v0, :cond_0

    return-void

    .line 83
    :cond_0
    iget-object v1, p0, Lcom/shopkick/app/urlhandlers/InviteHandler;->userAccountDataSource:Lcom/shopkick/app/account/UserAccountDataSource;

    invoke-virtual {v1}, Lcom/shopkick/app/account/UserAccountDataSource;->userIsRegistered()Z

    move-result v1

    if-eqz v1, :cond_2

    .line 85
    instance-of v1, v0, Lcom/shopkick/app/activities/FirstUseActivityV2;

    if-nez v1, :cond_1

    .line 86
    new-instance v1, Lcom/shopkick/app/activities/PageIdentifierV2;

    const-class v2, Lcom/shopkick/app/activities/HomeActivity;

    const-class v3, Lcom/shopkick/app/invite/InvitePromoCodeScreen;

    iget-object v4, p0, Lcom/shopkick/app/urlhandlers/InviteHandler;->params:Ljava/util/Map;

    invoke-direct {v1, v2, v3, v4}, Lcom/shopkick/app/activities/PageIdentifierV2;-><init>(Ljava/lang/Class;Ljava/lang/Class;Ljava/util/Map;)V

    goto :goto_0

    .line 88
    :cond_1
    new-instance v1, Lcom/shopkick/app/activities/PageIdentifierV2;

    const-class v2, Lcom/shopkick/app/activities/DetailsActivity;

    const-class v3, Lcom/shopkick/app/invite/InvitePromoCodeScreen;

    iget-object v4, p0, Lcom/shopkick/app/urlhandlers/InviteHandler;->params:Ljava/util/Map;

    invoke-direct {v1, v2, v3, v4}, Lcom/shopkick/app/activities/PageIdentifierV2;-><init>(Ljava/lang/Class;Ljava/lang/Class;Ljava/util/Map;)V

    .line 90
    :goto_0
    invoke-virtual {v0, v1}, Lcom/shopkick/app/activities/BaseActivity;->goToScreenForPageIdentifierV2(Lcom/shopkick/app/activities/PageIdentifierV2;)Z

    goto :goto_1

    .line 92
    :cond_2
    iget-object v1, p0, Lcom/shopkick/app/urlhandlers/InviteHandler;->notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

    const-string v2, "AUTHENTICATOR_SUCCESS"

    invoke-virtual {v1, p0, v2}, Lcom/shopkick/app/util/NotificationCenter;->addObserver(Lcom/shopkick/app/util/INotificationObserver;Ljava/lang/String;)V

    .line 93
    new-instance v1, Lcom/shopkick/app/activities/PageIdentifierV2;

    const-class v2, Lcom/shopkick/app/activities/LoginRegistrationActivity;

    const-class v3, Lcom/shopkick/app/registration/LoginPickerV3Screen;

    const/4 v4, 0x0

    invoke-direct {v1, v2, v3, v4}, Lcom/shopkick/app/activities/PageIdentifierV2;-><init>(Ljava/lang/Class;Ljava/lang/Class;Ljava/util/Map;)V

    .line 96
    invoke-virtual {v0, v1}, Lcom/shopkick/app/activities/BaseActivity;->goToScreenForPageIdentifierV2(Lcom/shopkick/app/activities/PageIdentifierV2;)Z

    :goto_1
    return-void
.end method


# virtual methods
.method public cancel()V
    .locals 1

    .line 61
    invoke-super {p0}, Lcom/shopkick/app/url/URLHandler;->cancel()V

    .line 62
    iget-object v0, p0, Lcom/shopkick/app/urlhandlers/InviteHandler;->notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

    invoke-virtual {v0, p0}, Lcom/shopkick/app/util/NotificationCenter;->removeObserver(Lcom/shopkick/app/util/INotificationObserver;)V

    return-void
.end method

.method public clone()Lcom/shopkick/app/url/URLHandler;
    .locals 7

    .line 67
    new-instance v6, Lcom/shopkick/app/urlhandlers/InviteHandler;

    iget-object v1, p0, Lcom/shopkick/app/urlhandlers/InviteHandler;->appActivityManager:Lcom/shopkick/app/application/AppActivityManager;

    iget-object v2, p0, Lcom/shopkick/app/urlhandlers/InviteHandler;->userAccountDataSource:Lcom/shopkick/app/account/UserAccountDataSource;

    iget-object v3, p0, Lcom/shopkick/app/urlhandlers/InviteHandler;->authenticator:Lcom/shopkick/app/account/Authenticator;

    iget-object v4, p0, Lcom/shopkick/app/urlhandlers/InviteHandler;->notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

    iget-object v5, p0, Lcom/shopkick/app/urlhandlers/InviteHandler;->clientFlagsManager:Lcom/shopkick/app/application/ClientFlagsManager;

    move-object v0, v6

    invoke-direct/range {v0 .. v5}, Lcom/shopkick/app/urlhandlers/InviteHandler;-><init>(Lcom/shopkick/app/application/AppActivityManager;Lcom/shopkick/app/account/UserAccountDataSource;Lcom/shopkick/app/account/Authenticator;Lcom/shopkick/app/util/NotificationCenter;Lcom/shopkick/app/application/ClientFlagsManager;)V

    return-object v6
.end method

.method public bridge synthetic clone()Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/CloneNotSupportedException;
        }
    .end annotation

    .line 23
    invoke-virtual {p0}, Lcom/shopkick/app/urlhandlers/InviteHandler;->clone()Lcom/shopkick/app/url/URLHandler;

    move-result-object v0

    return-object v0
.end method

.method public execute()V
    .locals 2

    .line 73
    new-instance v0, Ljava/lang/ref/WeakReference;

    iget-object v1, p0, Lcom/shopkick/app/urlhandlers/InviteHandler;->appActivityManager:Lcom/shopkick/app/application/AppActivityManager;

    invoke-virtual {v1}, Lcom/shopkick/app/application/AppActivityManager;->getCurrentActivity()Lcom/shopkick/app/activities/BaseActivity;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object v0, p0, Lcom/shopkick/app/urlhandlers/InviteHandler;->launchingActivity:Ljava/lang/ref/WeakReference;

    .line 74
    invoke-direct {p0}, Lcom/shopkick/app/urlhandlers/InviteHandler;->maybeGoToInviteScreen()V

    return-void
.end method

.method public onEvent(Ljava/lang/String;Ljava/util/HashMap;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/util/HashMap<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;)V"
        }
    .end annotation

    const-string p2, "AUTHENTICATOR_SUCCESS"

    .line 102
    invoke-virtual {p1, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    .line 103
    invoke-direct {p0}, Lcom/shopkick/app/urlhandlers/InviteHandler;->maybeGoToInviteScreen()V

    .line 104
    iget-object p1, p0, Lcom/shopkick/app/urlhandlers/InviteHandler;->notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

    const-string p2, "AUTHENTICATOR_SUCCESS"

    invoke-virtual {p1, p0, p2}, Lcom/shopkick/app/util/NotificationCenter;->removeObserver(Lcom/shopkick/app/util/INotificationObserver;Ljava/lang/String;)V

    :cond_0
    return-void
.end method
