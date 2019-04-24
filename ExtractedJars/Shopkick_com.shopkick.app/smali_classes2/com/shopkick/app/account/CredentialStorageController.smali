.class public Lcom/shopkick/app/account/CredentialStorageController;
.super Ljava/lang/Object;
.source "CredentialStorageController.java"

# interfaces
.implements Lcom/shopkick/app/util/INotificationObserver;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/shopkick/app/account/CredentialStorageController$CredentialRetrieveFailureReason;
    }
.end annotation


# static fields
.field public static final CREDENTIAL_CHECK_FAILURE:Ljava/lang/String; = "CREDENTIAL_CHECK_FAILURE"

.field public static final CREDENTIAL_CHECK_SUCCESS:Ljava/lang/String; = "CREDENTIAL_CHECK_SUCCESS"

.field public static final CREDENTIAL_DELETE_FAILURE:Ljava/lang/String; = "CREDENTIAL_DELETE_FAILURE"

.field public static final CREDENTIAL_DELETE_SUCCESS:Ljava/lang/String; = "CREDENTIAL_DELETE_SUCCESS"

.field public static final CREDENTIAL_DISABLE_AUTO_SIGN_IN_FAILURE:Ljava/lang/String; = "CREDENTIAL_DISABLE_AUTO_SIGN_IN_FAILURE"

.field public static final CREDENTIAL_DISABLE_AUTO_SIGN_IN_SUCCESS:Ljava/lang/String; = "CREDENTIAL_DISABLE_AUTO_SIGN_IN_SUCCESS"

.field public static final CREDENTIAL_RETRIEVE_FAILURE:Ljava/lang/String; = "CREDENTIAL_RETRIEVE_FAILURE"

.field public static final CREDENTIAL_RETRIEVE_SUCCESS:Ljava/lang/String; = "CREDENTIAL_RETRIEVE_SUCCESS"

.field public static final CREDENTIAL_SAVE_FAILURE:Ljava/lang/String; = "CREDENTIAL_SAVE_FAILURE"

.field public static final CREDENTIAL_SAVE_SUCCESS:Ljava/lang/String; = "CREDENTIAL_SAVE_SUCCESS"

.field public static final RETRIEVED_CREDENTIAL_KEY:Ljava/lang/String; = "RETRIEVED_CREDENTIAL_KEY"


# instance fields
.field private final appPreferences:Lcom/shopkick/app/application/AppPreferences;

.field private final googleSmartLockController:Lcom/shopkick/app/account/GoogleSmartLockController;

.field private final notificationCenter:Lcom/shopkick/app/util/NotificationCenter;


# direct methods
.method public constructor <init>(Landroid/content/Context;Lcom/shopkick/app/util/NotificationCenter;Lcom/shopkick/app/application/SKLogger;Lcom/shopkick/app/application/AppPreferences;)V
    .locals 1

    .line 49
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 53
    new-instance v0, Lcom/shopkick/app/account/GoogleSmartLockController;

    invoke-direct {v0, p1, p2, p3}, Lcom/shopkick/app/account/GoogleSmartLockController;-><init>(Landroid/content/Context;Lcom/shopkick/app/util/NotificationCenter;Lcom/shopkick/app/application/SKLogger;)V

    iput-object v0, p0, Lcom/shopkick/app/account/CredentialStorageController;->googleSmartLockController:Lcom/shopkick/app/account/GoogleSmartLockController;

    .line 54
    iput-object p2, p0, Lcom/shopkick/app/account/CredentialStorageController;->notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

    .line 55
    iput-object p4, p0, Lcom/shopkick/app/account/CredentialStorageController;->appPreferences:Lcom/shopkick/app/application/AppPreferences;

    return-void
.end method

.method private checkCredentialCallback(Z)V
    .locals 1

    if-eqz p1, :cond_0

    .line 157
    iget-object p1, p0, Lcom/shopkick/app/account/CredentialStorageController;->notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

    const-string v0, "CREDENTIAL_CHECK_SUCCESS"

    invoke-virtual {p1, v0}, Lcom/shopkick/app/util/NotificationCenter;->notifyEvent(Ljava/lang/String;)Ljava/util/List;

    return-void

    .line 161
    :cond_0
    iget-object p1, p0, Lcom/shopkick/app/account/CredentialStorageController;->appPreferences:Lcom/shopkick/app/application/AppPreferences;

    invoke-virtual {p1}, Lcom/shopkick/app/application/AppPreferences;->getPreviousAuthMedium()Lcom/shopkick/app/account/Authenticator$AuthMedium;

    move-result-object p1

    .line 162
    sget-object v0, Lcom/shopkick/app/account/Authenticator$AuthMedium;->INVALID:Lcom/shopkick/app/account/Authenticator$AuthMedium;

    if-eq p1, v0, :cond_1

    .line 163
    iget-object p1, p0, Lcom/shopkick/app/account/CredentialStorageController;->notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

    const-string v0, "CREDENTIAL_CHECK_SUCCESS"

    invoke-virtual {p1, v0}, Lcom/shopkick/app/util/NotificationCenter;->notifyEvent(Ljava/lang/String;)Ljava/util/List;

    return-void

    .line 167
    :cond_1
    iget-object p1, p0, Lcom/shopkick/app/account/CredentialStorageController;->notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

    const-string v0, "CREDENTIAL_CHECK_FAILURE"

    invoke-virtual {p1, v0}, Lcom/shopkick/app/util/NotificationCenter;->notifyEvent(Ljava/lang/String;)Ljava/util/List;

    return-void
.end method

.method private getMappedFailureReason(Lcom/shopkick/app/account/GoogleSmartLockController$GoogleSmartLockRetrieveCredentialFailureReason;)Lcom/shopkick/app/account/CredentialStorageController$CredentialRetrieveFailureReason;
    .locals 1

    .line 93
    sget-object v0, Lcom/shopkick/app/account/GoogleSmartLockController$GoogleSmartLockRetrieveCredentialFailureReason;->NO_CREDENTIAL:Lcom/shopkick/app/account/GoogleSmartLockController$GoogleSmartLockRetrieveCredentialFailureReason;

    if-eq p1, v0, :cond_4

    sget-object v0, Lcom/shopkick/app/account/GoogleSmartLockController$GoogleSmartLockRetrieveCredentialFailureReason;->CONNECTION_TIMED_OUT:Lcom/shopkick/app/account/GoogleSmartLockController$GoogleSmartLockRetrieveCredentialFailureReason;

    if-ne p1, v0, :cond_0

    goto :goto_0

    .line 96
    :cond_0
    sget-object v0, Lcom/shopkick/app/account/GoogleSmartLockController$GoogleSmartLockRetrieveCredentialFailureReason;->ERROR_RETRIEVING:Lcom/shopkick/app/account/GoogleSmartLockController$GoogleSmartLockRetrieveCredentialFailureReason;

    if-ne p1, v0, :cond_1

    .line 97
    sget-object p1, Lcom/shopkick/app/account/CredentialStorageController$CredentialRetrieveFailureReason;->ERROR_RETRIEVING:Lcom/shopkick/app/account/CredentialStorageController$CredentialRetrieveFailureReason;

    return-object p1

    .line 98
    :cond_1
    sget-object v0, Lcom/shopkick/app/account/GoogleSmartLockController$GoogleSmartLockRetrieveCredentialFailureReason;->USER_DECLINED:Lcom/shopkick/app/account/GoogleSmartLockController$GoogleSmartLockRetrieveCredentialFailureReason;

    if-ne p1, v0, :cond_2

    .line 99
    sget-object p1, Lcom/shopkick/app/account/CredentialStorageController$CredentialRetrieveFailureReason;->USER_DECLINED:Lcom/shopkick/app/account/CredentialStorageController$CredentialRetrieveFailureReason;

    return-object p1

    .line 100
    :cond_2
    sget-object v0, Lcom/shopkick/app/account/GoogleSmartLockController$GoogleSmartLockRetrieveCredentialFailureReason;->SYSTEM_CANCELLED:Lcom/shopkick/app/account/GoogleSmartLockController$GoogleSmartLockRetrieveCredentialFailureReason;

    if-ne p1, v0, :cond_3

    .line 101
    sget-object p1, Lcom/shopkick/app/account/CredentialStorageController$CredentialRetrieveFailureReason;->SYSTEM_CANCELLED:Lcom/shopkick/app/account/CredentialStorageController$CredentialRetrieveFailureReason;

    return-object p1

    :cond_3
    const/4 p1, 0x0

    const-string v0, "Invalid GoogleSmartLockRetrieveCredentialFailureReason"

    .line 103
    invoke-static {p1, v0}, Lcom/shopkick/app/util/SKAssertion;->assertTrue(ZLjava/lang/String;)V

    const/4 p1, 0x0

    return-object p1

    .line 95
    :cond_4
    :goto_0
    sget-object p1, Lcom/shopkick/app/account/CredentialStorageController$CredentialRetrieveFailureReason;->NO_CREDENTIAL:Lcom/shopkick/app/account/CredentialStorageController$CredentialRetrieveFailureReason;

    return-object p1
.end method

.method private validateSKCredential(Lcom/shopkick/app/account/SKCredential;)Z
    .locals 4

    .line 109
    iget-object v0, p1, Lcom/shopkick/app/account/SKCredential;->authMedium:Lcom/shopkick/app/account/Authenticator$AuthMedium;

    sget-object v1, Lcom/shopkick/app/account/Authenticator$AuthMedium;->EMAIL:Lcom/shopkick/app/account/Authenticator$AuthMedium;

    const/4 v2, 0x1

    const/4 v3, 0x0

    if-ne v0, v1, :cond_1

    .line 110
    iget-object v0, p1, Lcom/shopkick/app/account/SKCredential;->displayName:Ljava/lang/String;

    if-eqz v0, :cond_0

    iget-object v0, p1, Lcom/shopkick/app/account/SKCredential;->email:Ljava/lang/String;

    if-eqz v0, :cond_0

    iget-object p1, p1, Lcom/shopkick/app/account/SKCredential;->password:Ljava/lang/String;

    if-eqz p1, :cond_0

    goto :goto_0

    :cond_0
    move v2, v3

    :goto_0
    return v2

    .line 111
    :cond_1
    iget-object v0, p1, Lcom/shopkick/app/account/SKCredential;->authMedium:Lcom/shopkick/app/account/Authenticator$AuthMedium;

    sget-object v1, Lcom/shopkick/app/account/Authenticator$AuthMedium;->FACEBOOK:Lcom/shopkick/app/account/Authenticator$AuthMedium;

    if-ne v0, v1, :cond_3

    .line 112
    iget-object p1, p1, Lcom/shopkick/app/account/SKCredential;->displayName:Ljava/lang/String;

    if-eqz p1, :cond_2

    goto :goto_1

    :cond_2
    move v2, v3

    :goto_1
    return v2

    .line 113
    :cond_3
    iget-object v0, p1, Lcom/shopkick/app/account/SKCredential;->authMedium:Lcom/shopkick/app/account/Authenticator$AuthMedium;

    sget-object v1, Lcom/shopkick/app/account/Authenticator$AuthMedium;->GOOGLE:Lcom/shopkick/app/account/Authenticator$AuthMedium;

    if-ne v0, v1, :cond_5

    .line 114
    iget-object v0, p1, Lcom/shopkick/app/account/SKCredential;->displayName:Ljava/lang/String;

    if-eqz v0, :cond_4

    iget-object p1, p1, Lcom/shopkick/app/account/SKCredential;->email:Ljava/lang/String;

    if-eqz p1, :cond_4

    goto :goto_2

    :cond_4
    move v2, v3

    :goto_2
    return v2

    :cond_5
    return v3
.end method


# virtual methods
.method public checkCredential(Landroid/app/Activity;)V
    .locals 3

    .line 150
    iget-object v0, p0, Lcom/shopkick/app/account/CredentialStorageController;->notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

    const-string v1, "GOOGLE_SMART_LOCK_CHECK_CREDENTIAL_SUCCESS"

    const/4 v2, 0x0

    invoke-virtual {v0, p0, v1, v2}, Lcom/shopkick/app/util/NotificationCenter;->addObserver(Lcom/shopkick/app/util/INotificationObserver;Ljava/lang/String;Z)V

    .line 151
    iget-object v0, p0, Lcom/shopkick/app/account/CredentialStorageController;->notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

    const-string v1, "GOOGLE_SMART_LOCK_CHECK_CREDENTIAL_FAILURE"

    invoke-virtual {v0, p0, v1, v2}, Lcom/shopkick/app/util/NotificationCenter;->addObserver(Lcom/shopkick/app/util/INotificationObserver;Ljava/lang/String;Z)V

    .line 152
    iget-object v0, p0, Lcom/shopkick/app/account/CredentialStorageController;->googleSmartLockController:Lcom/shopkick/app/account/GoogleSmartLockController;

    invoke-virtual {v0, p1}, Lcom/shopkick/app/account/GoogleSmartLockController;->checkCredential(Landroid/app/Activity;)V

    return-void
.end method

.method public deleteCredential(Landroid/app/Activity;Lcom/shopkick/app/account/SKCredential;)V
    .locals 3

    .line 125
    iget-object v0, p0, Lcom/shopkick/app/account/CredentialStorageController;->appPreferences:Lcom/shopkick/app/application/AppPreferences;

    sget-object v1, Lcom/shopkick/app/account/Authenticator$AuthMedium;->INVALID:Lcom/shopkick/app/account/Authenticator$AuthMedium;

    invoke-virtual {v0, v1}, Lcom/shopkick/app/application/AppPreferences;->setPreviousAuthMedium(Lcom/shopkick/app/account/Authenticator$AuthMedium;)V

    .line 128
    iget-object v0, p0, Lcom/shopkick/app/account/CredentialStorageController;->notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

    const-string v1, "GOOGLE_SMART_LOCK_DELETE_CREDENTIAL_SUCCESS"

    const/4 v2, 0x0

    invoke-virtual {v0, p0, v1, v2}, Lcom/shopkick/app/util/NotificationCenter;->addObserver(Lcom/shopkick/app/util/INotificationObserver;Ljava/lang/String;Z)V

    .line 129
    iget-object v0, p0, Lcom/shopkick/app/account/CredentialStorageController;->notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

    const-string v1, "GOOGLE_SMART_LOCK_DELETE_CREDENTIAL_FAILURE"

    invoke-virtual {v0, p0, v1, v2}, Lcom/shopkick/app/util/NotificationCenter;->addObserver(Lcom/shopkick/app/util/INotificationObserver;Ljava/lang/String;Z)V

    .line 130
    iget-object v0, p0, Lcom/shopkick/app/account/CredentialStorageController;->googleSmartLockController:Lcom/shopkick/app/account/GoogleSmartLockController;

    invoke-virtual {v0, p1, p2}, Lcom/shopkick/app/account/GoogleSmartLockController;->deleteCredential(Landroid/app/Activity;Lcom/shopkick/app/account/SKCredential;)V

    return-void
.end method

.method public disableAutoSignInCredential(Landroid/app/Activity;)V
    .locals 3

    .line 139
    iget-object v0, p0, Lcom/shopkick/app/account/CredentialStorageController;->notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

    const-string v1, "GOOGLE_SMART_LOCK_DISABLE_AUTO_SIGN_IN_CREDENTIAL_SUCCESS"

    const/4 v2, 0x0

    invoke-virtual {v0, p0, v1, v2}, Lcom/shopkick/app/util/NotificationCenter;->addObserver(Lcom/shopkick/app/util/INotificationObserver;Ljava/lang/String;Z)V

    .line 140
    iget-object v0, p0, Lcom/shopkick/app/account/CredentialStorageController;->notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

    const-string v1, "GOOGLE_SMART_LOCK_DISABLE_AUTO_SIGN_IN_CREDENTIAL_FAILURE"

    invoke-virtual {v0, p0, v1, v2}, Lcom/shopkick/app/util/NotificationCenter;->addObserver(Lcom/shopkick/app/util/INotificationObserver;Ljava/lang/String;Z)V

    .line 141
    iget-object v0, p0, Lcom/shopkick/app/account/CredentialStorageController;->googleSmartLockController:Lcom/shopkick/app/account/GoogleSmartLockController;

    invoke-virtual {v0, p1}, Lcom/shopkick/app/account/GoogleSmartLockController;->disableAutoSignInCredential(Landroid/app/Activity;)V

    return-void
.end method

.method public onEvent(Ljava/lang/String;Ljava/util/HashMap;)V
    .locals 3
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

    .line 171
    invoke-virtual {p1}, Ljava/lang/String;->hashCode()I

    move-result v0

    const/4 v1, 0x0

    const/4 v2, 0x1

    sparse-switch v0, :sswitch_data_0

    goto/16 :goto_0

    :sswitch_0
    const-string v0, "GOOGLE_SMART_LOCK_CHECK_CREDENTIAL_SUCCESS"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    const/16 p1, 0x8

    goto :goto_1

    :sswitch_1
    const-string v0, "GOOGLE_SMART_LOCK_RETRIEVE_CREDENTIAL_FAILURE"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x3

    goto :goto_1

    :sswitch_2
    const-string v0, "GOOGLE_SMART_LOCK_DELETE_CREDENTIAL_FAILURE"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x5

    goto :goto_1

    :sswitch_3
    const-string v0, "GOOGLE_SMART_LOCK_RETRIEVE_CREDENTIAL_SUCCESS"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x2

    goto :goto_1

    :sswitch_4
    const-string v0, "GOOGLE_SMART_LOCK_DELETE_CREDENTIAL_SUCCESS"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x4

    goto :goto_1

    :sswitch_5
    const-string v0, "GOOGLE_SMART_LOCK_DISABLE_AUTO_SIGN_IN_CREDENTIAL_FAILURE"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x7

    goto :goto_1

    :sswitch_6
    const-string v0, "GOOGLE_SMART_LOCK_SAVE_CREDENTIAL_FAILURE"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    move p1, v2

    goto :goto_1

    :sswitch_7
    const-string v0, "GOOGLE_SMART_LOCK_DISABLE_AUTO_SIGN_IN_CREDENTIAL_SUCCESS"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x6

    goto :goto_1

    :sswitch_8
    const-string v0, "GOOGLE_SMART_LOCK_SAVE_CREDENTIAL_SUCCESS"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    move p1, v1

    goto :goto_1

    :sswitch_9
    const-string v0, "GOOGLE_SMART_LOCK_CHECK_CREDENTIAL_FAILURE"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    const/16 p1, 0x9

    goto :goto_1

    :cond_0
    :goto_0
    const/4 p1, -0x1

    :goto_1
    packed-switch p1, :pswitch_data_0

    goto/16 :goto_2

    .line 234
    :pswitch_0
    iget-object p1, p0, Lcom/shopkick/app/account/CredentialStorageController;->notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

    const-string p2, "GOOGLE_SMART_LOCK_CHECK_CREDENTIAL_SUCCESS"

    invoke-virtual {p1, p0, p2}, Lcom/shopkick/app/util/NotificationCenter;->removeObserver(Lcom/shopkick/app/util/INotificationObserver;Ljava/lang/String;)V

    .line 235
    iget-object p1, p0, Lcom/shopkick/app/account/CredentialStorageController;->notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

    const-string p2, "GOOGLE_SMART_LOCK_CHECK_CREDENTIAL_FAILURE"

    invoke-virtual {p1, p0, p2}, Lcom/shopkick/app/util/NotificationCenter;->removeObserver(Lcom/shopkick/app/util/INotificationObserver;Ljava/lang/String;)V

    .line 236
    invoke-direct {p0, v1}, Lcom/shopkick/app/account/CredentialStorageController;->checkCredentialCallback(Z)V

    goto/16 :goto_2

    .line 229
    :pswitch_1
    iget-object p1, p0, Lcom/shopkick/app/account/CredentialStorageController;->notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

    const-string p2, "GOOGLE_SMART_LOCK_CHECK_CREDENTIAL_SUCCESS"

    invoke-virtual {p1, p0, p2}, Lcom/shopkick/app/util/NotificationCenter;->removeObserver(Lcom/shopkick/app/util/INotificationObserver;Ljava/lang/String;)V

    .line 230
    iget-object p1, p0, Lcom/shopkick/app/account/CredentialStorageController;->notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

    const-string p2, "GOOGLE_SMART_LOCK_CHECK_CREDENTIAL_FAILURE"

    invoke-virtual {p1, p0, p2}, Lcom/shopkick/app/util/NotificationCenter;->removeObserver(Lcom/shopkick/app/util/INotificationObserver;Ljava/lang/String;)V

    .line 231
    invoke-direct {p0, v2}, Lcom/shopkick/app/account/CredentialStorageController;->checkCredentialCallback(Z)V

    goto/16 :goto_2

    .line 223
    :pswitch_2
    iget-object p1, p0, Lcom/shopkick/app/account/CredentialStorageController;->notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

    const-string p2, "GOOGLE_SMART_LOCK_DISABLE_AUTO_SIGN_IN_CREDENTIAL_SUCCESS"

    invoke-virtual {p1, p0, p2}, Lcom/shopkick/app/util/NotificationCenter;->removeObserver(Lcom/shopkick/app/util/INotificationObserver;Ljava/lang/String;)V

    .line 224
    iget-object p1, p0, Lcom/shopkick/app/account/CredentialStorageController;->notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

    const-string p2, "GOOGLE_SMART_LOCK_DISABLE_AUTO_SIGN_IN_CREDENTIAL_FAILURE"

    invoke-virtual {p1, p0, p2}, Lcom/shopkick/app/util/NotificationCenter;->removeObserver(Lcom/shopkick/app/util/INotificationObserver;Ljava/lang/String;)V

    .line 225
    iget-object p1, p0, Lcom/shopkick/app/account/CredentialStorageController;->notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

    const-string p2, "CREDENTIAL_DISABLE_AUTO_SIGN_IN_FAILURE"

    invoke-virtual {p1, p2}, Lcom/shopkick/app/util/NotificationCenter;->notifyEvent(Ljava/lang/String;)Ljava/util/List;

    goto/16 :goto_2

    .line 218
    :pswitch_3
    iget-object p1, p0, Lcom/shopkick/app/account/CredentialStorageController;->notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

    const-string p2, "GOOGLE_SMART_LOCK_DISABLE_AUTO_SIGN_IN_CREDENTIAL_SUCCESS"

    invoke-virtual {p1, p0, p2}, Lcom/shopkick/app/util/NotificationCenter;->removeObserver(Lcom/shopkick/app/util/INotificationObserver;Ljava/lang/String;)V

    .line 219
    iget-object p1, p0, Lcom/shopkick/app/account/CredentialStorageController;->notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

    const-string p2, "GOOGLE_SMART_LOCK_DISABLE_AUTO_SIGN_IN_CREDENTIAL_FAILURE"

    invoke-virtual {p1, p0, p2}, Lcom/shopkick/app/util/NotificationCenter;->removeObserver(Lcom/shopkick/app/util/INotificationObserver;Ljava/lang/String;)V

    .line 220
    iget-object p1, p0, Lcom/shopkick/app/account/CredentialStorageController;->notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

    const-string p2, "CREDENTIAL_DISABLE_AUTO_SIGN_IN_SUCCESS"

    invoke-virtual {p1, p2}, Lcom/shopkick/app/util/NotificationCenter;->notifyEvent(Ljava/lang/String;)Ljava/util/List;

    goto/16 :goto_2

    .line 212
    :pswitch_4
    iget-object p1, p0, Lcom/shopkick/app/account/CredentialStorageController;->notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

    const-string p2, "GOOGLE_SMART_LOCK_DELETE_CREDENTIAL_SUCCESS"

    invoke-virtual {p1, p0, p2}, Lcom/shopkick/app/util/NotificationCenter;->removeObserver(Lcom/shopkick/app/util/INotificationObserver;Ljava/lang/String;)V

    .line 213
    iget-object p1, p0, Lcom/shopkick/app/account/CredentialStorageController;->notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

    const-string p2, "GOOGLE_SMART_LOCK_DELETE_CREDENTIAL_FAILURE"

    invoke-virtual {p1, p0, p2}, Lcom/shopkick/app/util/NotificationCenter;->removeObserver(Lcom/shopkick/app/util/INotificationObserver;Ljava/lang/String;)V

    .line 214
    iget-object p1, p0, Lcom/shopkick/app/account/CredentialStorageController;->notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

    const-string p2, "CREDENTIAL_DELETE_FAILURE"

    invoke-virtual {p1, p2}, Lcom/shopkick/app/util/NotificationCenter;->notifyEvent(Ljava/lang/String;)Ljava/util/List;

    goto/16 :goto_2

    .line 207
    :pswitch_5
    iget-object p1, p0, Lcom/shopkick/app/account/CredentialStorageController;->notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

    const-string p2, "GOOGLE_SMART_LOCK_DELETE_CREDENTIAL_SUCCESS"

    invoke-virtual {p1, p0, p2}, Lcom/shopkick/app/util/NotificationCenter;->removeObserver(Lcom/shopkick/app/util/INotificationObserver;Ljava/lang/String;)V

    .line 208
    iget-object p1, p0, Lcom/shopkick/app/account/CredentialStorageController;->notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

    const-string p2, "GOOGLE_SMART_LOCK_DELETE_CREDENTIAL_FAILURE"

    invoke-virtual {p1, p0, p2}, Lcom/shopkick/app/util/NotificationCenter;->removeObserver(Lcom/shopkick/app/util/INotificationObserver;Ljava/lang/String;)V

    .line 209
    iget-object p1, p0, Lcom/shopkick/app/account/CredentialStorageController;->notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

    const-string p2, "CREDENTIAL_DELETE_SUCCESS"

    invoke-virtual {p1, p2}, Lcom/shopkick/app/util/NotificationCenter;->notifyEvent(Ljava/lang/String;)Ljava/util/List;

    goto/16 :goto_2

    .line 194
    :pswitch_6
    iget-object p1, p0, Lcom/shopkick/app/account/CredentialStorageController;->notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

    const-string v0, "GOOGLE_SMART_LOCK_RETRIEVE_CREDENTIAL_SUCCESS"

    invoke-virtual {p1, p0, v0}, Lcom/shopkick/app/util/NotificationCenter;->removeObserver(Lcom/shopkick/app/util/INotificationObserver;Ljava/lang/String;)V

    .line 195
    iget-object p1, p0, Lcom/shopkick/app/account/CredentialStorageController;->notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

    const-string v0, "GOOGLE_SMART_LOCK_RETRIEVE_CREDENTIAL_FAILURE"

    invoke-virtual {p1, p0, v0}, Lcom/shopkick/app/util/NotificationCenter;->removeObserver(Lcom/shopkick/app/util/INotificationObserver;Ljava/lang/String;)V

    const-string p1, "GOOGLE_SMART_LOCK_RETRIEVED_CREDENTIAL_KEY"

    .line 199
    invoke-virtual {p2, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/shopkick/app/account/GoogleSmartLockController$GoogleSmartLockRetrieveCredentialFailureReason;

    .line 198
    invoke-direct {p0, p1}, Lcom/shopkick/app/account/CredentialStorageController;->getMappedFailureReason(Lcom/shopkick/app/account/GoogleSmartLockController$GoogleSmartLockRetrieveCredentialFailureReason;)Lcom/shopkick/app/account/CredentialStorageController$CredentialRetrieveFailureReason;

    move-result-object p1

    .line 201
    new-instance p2, Ljava/util/HashMap;

    invoke-direct {p2}, Ljava/util/HashMap;-><init>()V

    const-string v0, "RETRIEVED_CREDENTIAL_KEY"

    .line 202
    invoke-virtual {p2, v0, p1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 203
    iget-object p1, p0, Lcom/shopkick/app/account/CredentialStorageController;->notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

    const-string v0, "CREDENTIAL_RETRIEVE_FAILURE"

    invoke-virtual {p1, v0, p2}, Lcom/shopkick/app/util/NotificationCenter;->notifyEvent(Ljava/lang/String;Ljava/util/HashMap;)Ljava/util/List;

    goto :goto_2

    .line 184
    :pswitch_7
    iget-object p1, p0, Lcom/shopkick/app/account/CredentialStorageController;->notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

    const-string v0, "GOOGLE_SMART_LOCK_RETRIEVE_CREDENTIAL_SUCCESS"

    invoke-virtual {p1, p0, v0}, Lcom/shopkick/app/util/NotificationCenter;->removeObserver(Lcom/shopkick/app/util/INotificationObserver;Ljava/lang/String;)V

    .line 185
    iget-object p1, p0, Lcom/shopkick/app/account/CredentialStorageController;->notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

    const-string v0, "GOOGLE_SMART_LOCK_RETRIEVE_CREDENTIAL_FAILURE"

    invoke-virtual {p1, p0, v0}, Lcom/shopkick/app/util/NotificationCenter;->removeObserver(Lcom/shopkick/app/util/INotificationObserver;Ljava/lang/String;)V

    const-string p1, "GOOGLE_SMART_LOCK_RETRIEVED_CREDENTIAL_KEY"

    .line 188
    invoke-virtual {p2, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/shopkick/app/account/SKCredential;

    .line 189
    new-instance p2, Ljava/util/HashMap;

    invoke-direct {p2}, Ljava/util/HashMap;-><init>()V

    const-string v0, "RETRIEVED_CREDENTIAL_KEY"

    .line 190
    invoke-virtual {p2, v0, p1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 191
    iget-object p1, p0, Lcom/shopkick/app/account/CredentialStorageController;->notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

    const-string v0, "CREDENTIAL_RETRIEVE_SUCCESS"

    invoke-virtual {p1, v0, p2}, Lcom/shopkick/app/util/NotificationCenter;->notifyEvent(Ljava/lang/String;Ljava/util/HashMap;)Ljava/util/List;

    goto :goto_2

    .line 178
    :pswitch_8
    iget-object p1, p0, Lcom/shopkick/app/account/CredentialStorageController;->notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

    const-string p2, "GOOGLE_SMART_LOCK_SAVE_CREDENTIAL_SUCCESS"

    invoke-virtual {p1, p0, p2}, Lcom/shopkick/app/util/NotificationCenter;->removeObserver(Lcom/shopkick/app/util/INotificationObserver;Ljava/lang/String;)V

    .line 179
    iget-object p1, p0, Lcom/shopkick/app/account/CredentialStorageController;->notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

    const-string p2, "GOOGLE_SMART_LOCK_SAVE_CREDENTIAL_FAILURE"

    invoke-virtual {p1, p0, p2}, Lcom/shopkick/app/util/NotificationCenter;->removeObserver(Lcom/shopkick/app/util/INotificationObserver;Ljava/lang/String;)V

    .line 180
    iget-object p1, p0, Lcom/shopkick/app/account/CredentialStorageController;->notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

    const-string p2, "CREDENTIAL_SAVE_FAILURE"

    invoke-virtual {p1, p2}, Lcom/shopkick/app/util/NotificationCenter;->notifyEvent(Ljava/lang/String;)Ljava/util/List;

    goto :goto_2

    .line 173
    :pswitch_9
    iget-object p1, p0, Lcom/shopkick/app/account/CredentialStorageController;->notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

    const-string p2, "GOOGLE_SMART_LOCK_SAVE_CREDENTIAL_SUCCESS"

    invoke-virtual {p1, p0, p2}, Lcom/shopkick/app/util/NotificationCenter;->removeObserver(Lcom/shopkick/app/util/INotificationObserver;Ljava/lang/String;)V

    .line 174
    iget-object p1, p0, Lcom/shopkick/app/account/CredentialStorageController;->notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

    const-string p2, "GOOGLE_SMART_LOCK_SAVE_CREDENTIAL_FAILURE"

    invoke-virtual {p1, p0, p2}, Lcom/shopkick/app/util/NotificationCenter;->removeObserver(Lcom/shopkick/app/util/INotificationObserver;Ljava/lang/String;)V

    .line 175
    iget-object p1, p0, Lcom/shopkick/app/account/CredentialStorageController;->notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

    const-string p2, "CREDENTIAL_SAVE_SUCCESS"

    invoke-virtual {p1, p2}, Lcom/shopkick/app/util/NotificationCenter;->notifyEvent(Ljava/lang/String;)Ljava/util/List;

    :goto_2
    return-void

    nop

    :sswitch_data_0
    .sparse-switch
        -0x74336c4f -> :sswitch_9
        -0x5a27f67b -> :sswitch_8
        -0x327bfd0c -> :sswitch_7
        -0x2ba104f4 -> :sswitch_6
        -0x3f50b85 -> :sswitch_5
        -0x37bf369 -> :sswitch_4
        0x60fc066 -> :sswitch_3
        0x2b0afe1e -> :sswitch_2
        0x3496b1ed -> :sswitch_1
        0x5d45a22a -> :sswitch_0
    .end sparse-switch

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public retrieveCredential(Landroid/app/Activity;)V
    .locals 3

    .line 87
    iget-object v0, p0, Lcom/shopkick/app/account/CredentialStorageController;->notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

    const-string v1, "GOOGLE_SMART_LOCK_RETRIEVE_CREDENTIAL_SUCCESS"

    const/4 v2, 0x0

    invoke-virtual {v0, p0, v1, v2}, Lcom/shopkick/app/util/NotificationCenter;->addObserver(Lcom/shopkick/app/util/INotificationObserver;Ljava/lang/String;Z)V

    .line 88
    iget-object v0, p0, Lcom/shopkick/app/account/CredentialStorageController;->notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

    const-string v1, "GOOGLE_SMART_LOCK_RETRIEVE_CREDENTIAL_FAILURE"

    invoke-virtual {v0, p0, v1, v2}, Lcom/shopkick/app/util/NotificationCenter;->addObserver(Lcom/shopkick/app/util/INotificationObserver;Ljava/lang/String;Z)V

    .line 89
    iget-object v0, p0, Lcom/shopkick/app/account/CredentialStorageController;->googleSmartLockController:Lcom/shopkick/app/account/GoogleSmartLockController;

    invoke-virtual {v0, p1}, Lcom/shopkick/app/account/GoogleSmartLockController;->retrieveCredential(Landroid/app/Activity;)V

    return-void
.end method

.method public saveCredential(Landroid/app/Activity;Ljava/lang/String;Lcom/shopkick/app/account/SKCredential;)V
    .locals 3

    .line 66
    iget-object v0, p0, Lcom/shopkick/app/account/CredentialStorageController;->appPreferences:Lcom/shopkick/app/application/AppPreferences;

    iget-object v1, p3, Lcom/shopkick/app/account/SKCredential;->authMedium:Lcom/shopkick/app/account/Authenticator$AuthMedium;

    invoke-virtual {v0, v1}, Lcom/shopkick/app/application/AppPreferences;->setPreviousAuthMedium(Lcom/shopkick/app/account/Authenticator$AuthMedium;)V

    .line 68
    iget-object v0, p0, Lcom/shopkick/app/account/CredentialStorageController;->notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

    const-string v1, "GOOGLE_SMART_LOCK_SAVE_CREDENTIAL_SUCCESS"

    const/4 v2, 0x0

    invoke-virtual {v0, p0, v1, v2}, Lcom/shopkick/app/util/NotificationCenter;->addObserver(Lcom/shopkick/app/util/INotificationObserver;Ljava/lang/String;Z)V

    .line 69
    iget-object v0, p0, Lcom/shopkick/app/account/CredentialStorageController;->notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

    const-string v1, "GOOGLE_SMART_LOCK_SAVE_CREDENTIAL_FAILURE"

    invoke-virtual {v0, p0, v1, v2}, Lcom/shopkick/app/util/NotificationCenter;->addObserver(Lcom/shopkick/app/util/INotificationObserver;Ljava/lang/String;Z)V

    .line 70
    iget-object v0, p0, Lcom/shopkick/app/account/CredentialStorageController;->googleSmartLockController:Lcom/shopkick/app/account/GoogleSmartLockController;

    invoke-virtual {v0, p1, p2, p3}, Lcom/shopkick/app/account/GoogleSmartLockController;->saveCredential(Landroid/app/Activity;Ljava/lang/String;Lcom/shopkick/app/account/SKCredential;)V

    return-void
.end method
