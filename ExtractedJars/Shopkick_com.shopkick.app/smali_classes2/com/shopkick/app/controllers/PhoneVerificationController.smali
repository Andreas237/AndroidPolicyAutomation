.class public Lcom/shopkick/app/controllers/PhoneVerificationController;
.super Ljava/lang/Object;
.source "PhoneVerificationController.java"

# interfaces
.implements Lcom/shopkick/app/util/INotificationObserver;


# static fields
.field public static final VERIFY_PHONE_COMPLETE_EVENT:Ljava/lang/String; = "VerifyPhoneCompleteEvent"


# instance fields
.field private appActivityManager:Lcom/shopkick/app/application/AppActivityManager;

.field private appPreferences:Lcom/shopkick/app/application/AppPreferences;

.field private inVerifyFlow:Z

.field private notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

.field private userAccountDataSource:Lcom/shopkick/app/account/UserAccountDataSource;


# direct methods
.method public constructor <init>(Lcom/shopkick/app/application/AppActivityManager;Lcom/shopkick/app/application/AppPreferences;Lcom/shopkick/app/account/UserAccountDataSource;Lcom/shopkick/app/util/NotificationCenter;)V
    .locals 1

    .line 32
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    .line 22
    iput-boolean v0, p0, Lcom/shopkick/app/controllers/PhoneVerificationController;->inVerifyFlow:Z

    .line 33
    iput-object p2, p0, Lcom/shopkick/app/controllers/PhoneVerificationController;->appPreferences:Lcom/shopkick/app/application/AppPreferences;

    .line 34
    iput-object p1, p0, Lcom/shopkick/app/controllers/PhoneVerificationController;->appActivityManager:Lcom/shopkick/app/application/AppActivityManager;

    .line 35
    iput-object p4, p0, Lcom/shopkick/app/controllers/PhoneVerificationController;->notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

    .line 36
    iput-object p3, p0, Lcom/shopkick/app/controllers/PhoneVerificationController;->userAccountDataSource:Lcom/shopkick/app/account/UserAccountDataSource;

    const-string p1, "VerifyPhoneCompleteEvent"

    .line 37
    invoke-virtual {p4, p0, p1}, Lcom/shopkick/app/util/NotificationCenter;->addObserver(Lcom/shopkick/app/util/INotificationObserver;Ljava/lang/String;)V

    return-void
.end method

.method private getInitialScreen(Ljava/lang/String;)Ljava/lang/Class;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")",
            "Ljava/lang/Class<",
            "+",
            "Lcom/shopkick/app/screens/AppScreen;",
            ">;"
        }
    .end annotation

    .line 66
    iget-object v0, p0, Lcom/shopkick/app/controllers/PhoneVerificationController;->userAccountDataSource:Lcom/shopkick/app/account/UserAccountDataSource;

    invoke-virtual {v0}, Lcom/shopkick/app/account/UserAccountDataSource;->userIsPhoneRegistered()Z

    move-result v0

    if-nez v0, :cond_0

    .line 67
    const-class p1, Lcom/shopkick/app/registration/LinkPhoneNumberScreen;

    return-object p1

    .line 68
    :cond_0
    iget-object v0, p0, Lcom/shopkick/app/controllers/PhoneVerificationController;->appPreferences:Lcom/shopkick/app/application/AppPreferences;

    invoke-virtual {v0}, Lcom/shopkick/app/application/AppPreferences;->getVerificationSMSSent()Z

    move-result v0

    if-nez v0, :cond_2

    if-eqz p1, :cond_1

    goto :goto_0

    .line 71
    :cond_1
    const-class p1, Lcom/shopkick/app/registration/VerifyPhoneScreen;

    return-object p1

    .line 69
    :cond_2
    :goto_0
    const-class p1, Lcom/shopkick/app/registration/EnterCodeScreen;

    return-object p1
.end method


# virtual methods
.method public destroy()V
    .locals 1

    .line 41
    iget-object v0, p0, Lcom/shopkick/app/controllers/PhoneVerificationController;->notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

    invoke-virtual {v0, p0}, Lcom/shopkick/app/util/NotificationCenter;->removeObserver(Lcom/shopkick/app/util/INotificationObserver;)V

    return-void
.end method

.method public launchVerifyPhoneFlow(Ljava/lang/String;)V
    .locals 4

    .line 45
    iget-object v0, p0, Lcom/shopkick/app/controllers/PhoneVerificationController;->userAccountDataSource:Lcom/shopkick/app/account/UserAccountDataSource;

    invoke-virtual {v0}, Lcom/shopkick/app/account/UserAccountDataSource;->userIsRegistered()Z

    move-result v0

    if-eqz v0, :cond_2

    iget-object v0, p0, Lcom/shopkick/app/controllers/PhoneVerificationController;->userAccountDataSource:Lcom/shopkick/app/account/UserAccountDataSource;

    invoke-virtual {v0}, Lcom/shopkick/app/account/UserAccountDataSource;->userIsPhoneVerified()Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    .line 49
    :cond_0
    iget-object v0, p0, Lcom/shopkick/app/controllers/PhoneVerificationController;->appActivityManager:Lcom/shopkick/app/application/AppActivityManager;

    invoke-virtual {v0}, Lcom/shopkick/app/application/AppActivityManager;->getCurrentActivity()Lcom/shopkick/app/activities/BaseActivity;

    move-result-object v0

    if-eqz v0, :cond_1

    .line 50
    instance-of v1, v0, Lcom/shopkick/app/activities/PhoneVerificationActivity;

    if-nez v1, :cond_1

    .line 51
    new-instance v1, Lcom/shopkick/app/activities/PageIdentifierV2;

    const-class v2, Lcom/shopkick/app/activities/PhoneVerificationActivity;

    .line 52
    invoke-direct {p0, p1}, Lcom/shopkick/app/controllers/PhoneVerificationController;->getInitialScreen(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object p1

    const/4 v3, 0x0

    invoke-direct {v1, v2, p1, v3}, Lcom/shopkick/app/activities/PageIdentifierV2;-><init>(Ljava/lang/Class;Ljava/lang/Class;Ljava/util/Map;)V

    .line 54
    invoke-virtual {v0, v1}, Lcom/shopkick/app/activities/BaseActivity;->goToScreenForPageIdentifierV2(Lcom/shopkick/app/activities/PageIdentifierV2;)Z

    :cond_1
    return-void

    :cond_2
    :goto_0
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

    const-string p2, "VerifyPhoneCompleteEvent"

    .line 60
    invoke-virtual {p1, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x0

    .line 61
    iput-boolean p1, p0, Lcom/shopkick/app/controllers/PhoneVerificationController;->inVerifyFlow:Z

    :cond_0
    return-void
.end method
