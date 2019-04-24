.class public Lcom/shopkick/app/urlhandlers/PhoneVerificationHandler;
.super Lcom/shopkick/app/url/URLHandler;
.source "PhoneVerificationHandler.java"

# interfaces
.implements Lcom/shopkick/app/util/INotificationObserver;


# static fields
.field public static final DISPATCHER_KEY:Ljava/lang/String; = "verify"

.field private static final PARAM_CALLBACK:Ljava/lang/String; = "callback"


# instance fields
.field private appActivityManager:Lcom/shopkick/app/application/AppActivityManager;

.field private notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

.field private phoneVerificationController:Lcom/shopkick/app/controllers/PhoneVerificationController;

.field private userAccount:Lcom/shopkick/app/account/UserAccount;


# direct methods
.method public constructor <init>(Lcom/shopkick/app/application/AppActivityManager;Lcom/shopkick/app/account/UserAccount;Lcom/shopkick/app/util/NotificationCenter;Lcom/shopkick/app/controllers/PhoneVerificationController;)V
    .locals 0

    .line 25
    invoke-direct {p0}, Lcom/shopkick/app/url/URLHandler;-><init>()V

    .line 26
    iput-object p4, p0, Lcom/shopkick/app/urlhandlers/PhoneVerificationHandler;->phoneVerificationController:Lcom/shopkick/app/controllers/PhoneVerificationController;

    .line 27
    iput-object p3, p0, Lcom/shopkick/app/urlhandlers/PhoneVerificationHandler;->notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

    .line 28
    iput-object p1, p0, Lcom/shopkick/app/urlhandlers/PhoneVerificationHandler;->appActivityManager:Lcom/shopkick/app/application/AppActivityManager;

    .line 29
    iput-object p2, p0, Lcom/shopkick/app/urlhandlers/PhoneVerificationHandler;->userAccount:Lcom/shopkick/app/account/UserAccount;

    const/4 p1, 0x0

    .line 32
    iput-boolean p1, p0, Lcom/shopkick/app/urlhandlers/PhoneVerificationHandler;->isAsync:Z

    return-void
.end method


# virtual methods
.method public cancel()V
    .locals 0

    .line 43
    invoke-super {p0}, Lcom/shopkick/app/url/URLHandler;->cancel()V

    return-void
.end method

.method public execute()V
    .locals 2

    .line 49
    iget-object v0, p0, Lcom/shopkick/app/urlhandlers/PhoneVerificationHandler;->notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

    const-string v1, "VerifyPhoneCompleteEvent"

    invoke-virtual {v0, p0, v1}, Lcom/shopkick/app/util/NotificationCenter;->addObserver(Lcom/shopkick/app/util/INotificationObserver;Ljava/lang/String;)V

    .line 50
    iget-object v0, p0, Lcom/shopkick/app/urlhandlers/PhoneVerificationHandler;->phoneVerificationController:Lcom/shopkick/app/controllers/PhoneVerificationController;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/shopkick/app/controllers/PhoneVerificationController;->launchVerifyPhoneFlow(Ljava/lang/String;)V

    return-void
.end method

.method public finish()V
    .locals 1

    .line 37
    invoke-super {p0}, Lcom/shopkick/app/url/URLHandler;->finish()V

    .line 38
    iget-object v0, p0, Lcom/shopkick/app/urlhandlers/PhoneVerificationHandler;->notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

    invoke-virtual {v0, p0}, Lcom/shopkick/app/util/NotificationCenter;->removeObserver(Lcom/shopkick/app/util/INotificationObserver;)V

    return-void
.end method

.method public onEvent(Ljava/lang/String;Ljava/util/HashMap;)V
    .locals 2
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

    .line 55
    invoke-virtual {p1, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    const-string p1, "callback"

    const/4 p2, 0x1

    .line 56
    new-array p2, p2, [Ljava/lang/Object;

    const/4 v0, 0x0

    iget-object v1, p0, Lcom/shopkick/app/urlhandlers/PhoneVerificationHandler;->userAccount:Lcom/shopkick/app/account/UserAccount;

    invoke-virtual {v1}, Lcom/shopkick/app/account/UserAccount;->getUserId()Ljava/lang/String;

    move-result-object v1

    aput-object v1, p2, v0

    invoke-virtual {p0, p1, p2}, Lcom/shopkick/app/urlhandlers/PhoneVerificationHandler;->invokeWebViewCallback(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 58
    :cond_0
    iget-object p1, p0, Lcom/shopkick/app/urlhandlers/PhoneVerificationHandler;->notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

    invoke-virtual {p1, p0}, Lcom/shopkick/app/util/NotificationCenter;->removeObserver(Lcom/shopkick/app/util/INotificationObserver;)V

    return-void
.end method
