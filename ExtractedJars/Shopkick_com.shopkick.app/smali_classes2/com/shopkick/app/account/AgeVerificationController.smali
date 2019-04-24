.class public Lcom/shopkick/app/account/AgeVerificationController;
.super Ljava/lang/Object;
.source "AgeVerificationController.java"

# interfaces
.implements Lcom/shopkick/app/util/INotificationObserver;
.implements Lcom/shopkick/fetchers/api/IAPICallback;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/shopkick/app/account/AgeVerificationController$DatePickerDialogClickListener;,
        Lcom/shopkick/app/account/AgeVerificationController$VerifyAgeClickListener;
    }
.end annotation


# static fields
.field public static final AGE_VERIFICATION_CANCELED_EVENT:Ljava/lang/String; = "ageVerificationCanceledEvent"

.field public static final AGE_VERIFICATION_STARTED_EVENT:Ljava/lang/String; = "ageVerificationStartedEvent"


# instance fields
.field private alertViewFactory:Lcom/shopkick/app/application/dialog/DialogsManager;

.field private apiManager:Lcom/shopkick/fetchers/api/APIManager;

.field private appPreferences:Lcom/shopkick/app/application/AppPreferences;

.field private appScreenWeakReference:Ljava/lang/ref/WeakReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ref/WeakReference<",
            "Lcom/shopkick/app/screens/AppScreen;",
            ">;"
        }
    .end annotation
.end field

.field private birthday:Ljava/util/Calendar;

.field private clientFlagsManager:Lcom/shopkick/app/application/ClientFlagsManager;

.field private notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

.field private profileInfo:Lcom/shopkick/app/application/ProfileInfo;

.field private userUpdateRequest:Lcom/shopkick/app/fetchers/api/skapi/UserUpdateRequest;


# direct methods
.method public constructor <init>(Lcom/shopkick/app/application/ProfileInfo;Lcom/shopkick/app/application/AppPreferences;Lcom/shopkick/app/application/ClientFlagsManager;Lcom/shopkick/app/util/NotificationCenter;Lcom/shopkick/fetchers/api/APIManager;Lcom/shopkick/app/application/dialog/DialogsManager;Lcom/shopkick/app/screens/AppScreen;)V
    .locals 0

    .line 61
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 62
    iput-object p1, p0, Lcom/shopkick/app/account/AgeVerificationController;->profileInfo:Lcom/shopkick/app/application/ProfileInfo;

    .line 63
    iput-object p2, p0, Lcom/shopkick/app/account/AgeVerificationController;->appPreferences:Lcom/shopkick/app/application/AppPreferences;

    .line 64
    iput-object p3, p0, Lcom/shopkick/app/account/AgeVerificationController;->clientFlagsManager:Lcom/shopkick/app/application/ClientFlagsManager;

    .line 65
    iput-object p4, p0, Lcom/shopkick/app/account/AgeVerificationController;->notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

    .line 66
    new-instance p1, Ljava/lang/ref/WeakReference;

    invoke-direct {p1, p7}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object p1, p0, Lcom/shopkick/app/account/AgeVerificationController;->appScreenWeakReference:Ljava/lang/ref/WeakReference;

    .line 67
    new-instance p1, Lcom/shopkick/app/fetchers/api/skapi/UserUpdateRequest;

    invoke-direct {p1}, Lcom/shopkick/app/fetchers/api/skapi/UserUpdateRequest;-><init>()V

    iput-object p1, p0, Lcom/shopkick/app/account/AgeVerificationController;->userUpdateRequest:Lcom/shopkick/app/fetchers/api/skapi/UserUpdateRequest;

    .line 68
    iput-object p5, p0, Lcom/shopkick/app/account/AgeVerificationController;->apiManager:Lcom/shopkick/fetchers/api/APIManager;

    .line 69
    iput-object p6, p0, Lcom/shopkick/app/account/AgeVerificationController;->alertViewFactory:Lcom/shopkick/app/application/dialog/DialogsManager;

    const-string p1, "UserAccountIdChangedEvent"

    .line 71
    invoke-virtual {p4, p0, p1}, Lcom/shopkick/app/util/NotificationCenter;->addObserver(Lcom/shopkick/app/util/INotificationObserver;Ljava/lang/String;)V

    const-string p1, "ProfileInfoUpdatedEvent"

    .line 72
    invoke-virtual {p4, p0, p1}, Lcom/shopkick/app/util/NotificationCenter;->addObserver(Lcom/shopkick/app/util/INotificationObserver;Ljava/lang/String;)V

    .line 74
    invoke-direct {p0}, Lcom/shopkick/app/account/AgeVerificationController;->maybeSetBirthday()V

    return-void
.end method

.method static synthetic access$000(Lcom/shopkick/app/account/AgeVerificationController;)Ljava/util/Calendar;
    .locals 0

    .line 38
    iget-object p0, p0, Lcom/shopkick/app/account/AgeVerificationController;->birthday:Ljava/util/Calendar;

    return-object p0
.end method

.method static synthetic access$002(Lcom/shopkick/app/account/AgeVerificationController;Ljava/util/Calendar;)Ljava/util/Calendar;
    .locals 0

    .line 38
    iput-object p1, p0, Lcom/shopkick/app/account/AgeVerificationController;->birthday:Ljava/util/Calendar;

    return-object p1
.end method

.method static synthetic access$100(Lcom/shopkick/app/account/AgeVerificationController;)Lcom/shopkick/app/fetchers/api/skapi/UserUpdateRequest;
    .locals 0

    .line 38
    iget-object p0, p0, Lcom/shopkick/app/account/AgeVerificationController;->userUpdateRequest:Lcom/shopkick/app/fetchers/api/skapi/UserUpdateRequest;

    return-object p0
.end method

.method static synthetic access$200(Lcom/shopkick/app/account/AgeVerificationController;)Lcom/shopkick/fetchers/api/APIManager;
    .locals 0

    .line 38
    iget-object p0, p0, Lcom/shopkick/app/account/AgeVerificationController;->apiManager:Lcom/shopkick/fetchers/api/APIManager;

    return-object p0
.end method

.method static synthetic access$300(Lcom/shopkick/app/account/AgeVerificationController;)Lcom/shopkick/app/application/AppPreferences;
    .locals 0

    .line 38
    iget-object p0, p0, Lcom/shopkick/app/account/AgeVerificationController;->appPreferences:Lcom/shopkick/app/application/AppPreferences;

    return-object p0
.end method

.method static synthetic access$400(III)I
    .locals 0

    .line 38
    invoke-static {p0, p1, p2}, Lcom/shopkick/app/account/AgeVerificationController;->getAgeFromBirthday(III)I

    move-result p0

    return p0
.end method

.method static synthetic access$500(Lcom/shopkick/app/account/AgeVerificationController;)Ljava/lang/ref/WeakReference;
    .locals 0

    .line 38
    iget-object p0, p0, Lcom/shopkick/app/account/AgeVerificationController;->appScreenWeakReference:Ljava/lang/ref/WeakReference;

    return-object p0
.end method

.method static synthetic access$600(Lcom/shopkick/app/account/AgeVerificationController;Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;Landroid/view/View;Landroid/view/View$OnClickListener;Landroid/content/DialogInterface$OnDismissListener;)V
    .locals 0

    .line 38
    invoke-direct {p0, p1, p2, p3, p4}, Lcom/shopkick/app/account/AgeVerificationController;->verifyAge(Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;Landroid/view/View;Landroid/view/View$OnClickListener;Landroid/content/DialogInterface$OnDismissListener;)V

    return-void
.end method

.method static synthetic access$700(Lcom/shopkick/app/account/AgeVerificationController;)Lcom/shopkick/app/util/NotificationCenter;
    .locals 0

    .line 38
    iget-object p0, p0, Lcom/shopkick/app/account/AgeVerificationController;->notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

    return-object p0
.end method

.method public static getAge(Lcom/shopkick/app/application/ProfileInfo;Lcom/shopkick/app/application/AppPreferences;Lcom/shopkick/app/application/ClientFlagsManager;)I
    .locals 1

    .line 160
    invoke-static {p0, p1, p2}, Lcom/shopkick/app/account/AgeVerificationController;->getUserBirthdate(Lcom/shopkick/app/application/ProfileInfo;Lcom/shopkick/app/application/AppPreferences;Lcom/shopkick/app/application/ClientFlagsManager;)Ljava/util/Date;

    move-result-object p0

    if-nez p0, :cond_0

    const/4 p0, -0x1

    return p0

    .line 164
    :cond_0
    invoke-static {}, Ljava/util/Calendar;->getInstance()Ljava/util/Calendar;

    move-result-object p1

    .line 165
    invoke-virtual {p1, p0}, Ljava/util/Calendar;->setTime(Ljava/util/Date;)V

    const/4 p0, 0x1

    .line 166
    invoke-virtual {p1, p0}, Ljava/util/Calendar;->get(I)I

    move-result p0

    const/4 p2, 0x2

    invoke-virtual {p1, p2}, Ljava/util/Calendar;->get(I)I

    move-result p2

    const/4 v0, 0x5

    invoke-virtual {p1, v0}, Ljava/util/Calendar;->get(I)I

    move-result p1

    invoke-static {p0, p2, p1}, Lcom/shopkick/app/account/AgeVerificationController;->getAgeFromBirthday(III)I

    move-result p0

    return p0
.end method

.method private static getAgeFromBirthday(III)I
    .locals 1

    .line 195
    invoke-static {}, Ljava/util/Calendar;->getInstance()Ljava/util/Calendar;

    move-result-object v0

    .line 196
    invoke-virtual {v0, p0, p1, p2}, Ljava/util/Calendar;->set(III)V

    .line 197
    invoke-static {}, Ljava/util/Calendar;->getInstance()Ljava/util/Calendar;

    move-result-object p0

    const/4 p1, 0x1

    .line 199
    invoke-virtual {p0, p1}, Ljava/util/Calendar;->get(I)I

    move-result p2

    invoke-virtual {v0, p1}, Ljava/util/Calendar;->get(I)I

    move-result p1

    sub-int/2addr p2, p1

    const/4 p1, 0x6

    .line 200
    invoke-virtual {p0, p1}, Ljava/util/Calendar;->get(I)I

    move-result p0

    invoke-virtual {v0, p1}, Ljava/util/Calendar;->get(I)I

    move-result p1

    if-ge p0, p1, :cond_0

    add-int/lit8 p2, p2, -0x1

    :cond_0
    return p2
.end method

.method public static getAgeVerificationStatus(Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;I)I
    .locals 1

    .line 138
    iget-object v0, p0, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->minimumAgeForKicks:Ljava/lang/Integer;

    if-nez v0, :cond_0

    const/4 p0, 0x0

    return p0

    :cond_0
    if-gez p1, :cond_1

    const/16 p0, 0x3e7

    return p0

    .line 142
    :cond_1
    iget-object p0, p0, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->minimumAgeForKicks:Ljava/lang/Integer;

    invoke-virtual {p0}, Ljava/lang/Integer;->intValue()I

    move-result p0

    if-ge p1, p0, :cond_2

    const/4 p0, 0x2

    return p0

    :cond_2
    const/4 p0, 0x1

    return p0
.end method

.method private getFailureMessageForTileType(Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;)Ljava/lang/String;
    .locals 1

    .line 299
    iget-object p1, p0, Lcom/shopkick/app/account/AgeVerificationController;->appScreenWeakReference:Ljava/lang/ref/WeakReference;

    invoke-virtual {p1}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/shopkick/app/screens/AppScreen;

    if-nez p1, :cond_0

    const/4 p1, 0x0

    return-object p1

    .line 304
    :cond_0
    invoke-virtual {p1}, Lcom/shopkick/app/screens/AppScreen;->getBaseActivity()Lcom/shopkick/app/activities/BaseActivity;

    move-result-object p1

    const v0, 0x7f110748

    invoke-virtual {p1, v0}, Lcom/shopkick/app/activities/BaseActivity;->getString(I)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method private getTitleForTileType(I)Ljava/lang/String;
    .locals 1

    .line 289
    iget-object p1, p0, Lcom/shopkick/app/account/AgeVerificationController;->appScreenWeakReference:Ljava/lang/ref/WeakReference;

    invoke-virtual {p1}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/shopkick/app/screens/AppScreen;

    if-nez p1, :cond_0

    const/4 p1, 0x0

    return-object p1

    .line 294
    :cond_0
    invoke-virtual {p1}, Lcom/shopkick/app/screens/AppScreen;->getBaseActivity()Lcom/shopkick/app/activities/BaseActivity;

    move-result-object p1

    const v0, 0x7f110747

    .line 295
    invoke-virtual {p1, v0}, Lcom/shopkick/app/activities/BaseActivity;->getString(I)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public static getUserBirthdate(Lcom/shopkick/app/application/ProfileInfo;Lcom/shopkick/app/application/AppPreferences;Lcom/shopkick/app/application/ClientFlagsManager;)Ljava/util/Date;
    .locals 1

    .line 183
    iget-object v0, p0, Lcom/shopkick/app/application/ProfileInfo;->profile:Lcom/shopkick/app/fetchers/api/skapi/ProfilesInfoV3Response;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/shopkick/app/application/ProfileInfo;->profile:Lcom/shopkick/app/fetchers/api/skapi/ProfilesInfoV3Response;

    iget-object v0, v0, Lcom/shopkick/app/fetchers/api/skapi/ProfilesInfoV3Response;->birthdate:Ljava/lang/String;

    invoke-static {v0}, Lcom/shopkick/app/util/StringUtils;->isEmpty(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 184
    iget-object p0, p0, Lcom/shopkick/app/application/ProfileInfo;->profile:Lcom/shopkick/app/fetchers/api/skapi/ProfilesInfoV3Response;

    iget-object p0, p0, Lcom/shopkick/app/fetchers/api/skapi/ProfilesInfoV3Response;->birthdate:Ljava/lang/String;

    invoke-static {p0}, Lcom/shopkick/app/util/DateUtils;->stringToDate(Ljava/lang/String;)Ljava/util/Date;

    move-result-object p0

    goto :goto_0

    :cond_0
    const-string/jumbo p0, "user_birthday"

    .line 185
    invoke-virtual {p1, p0}, Lcom/shopkick/app/application/AppPreferences;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    invoke-static {p0}, Lcom/shopkick/app/util/StringUtils;->isEmpty(Ljava/lang/String;)Z

    move-result p0

    if-nez p0, :cond_1

    invoke-static {p1, p2}, Lcom/shopkick/app/account/AgeVerificationController;->storedBirthdayIsExpired(Lcom/shopkick/app/application/AppPreferences;Lcom/shopkick/app/application/ClientFlagsManager;)Z

    move-result p0

    if-nez p0, :cond_1

    const-string/jumbo p0, "user_birthday"

    .line 189
    invoke-virtual {p1, p0}, Lcom/shopkick/app/application/AppPreferences;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    invoke-static {p0}, Lcom/shopkick/app/util/DateUtils;->stringToDate(Ljava/lang/String;)Ljava/util/Date;

    move-result-object p0

    goto :goto_0

    :cond_1
    const/4 p0, 0x0

    :goto_0
    return-object p0
.end method

.method private maybeSetBirthday()V
    .locals 3

    const/4 v0, 0x0

    .line 208
    iput-object v0, p0, Lcom/shopkick/app/account/AgeVerificationController;->birthday:Ljava/util/Calendar;

    .line 210
    iget-object v0, p0, Lcom/shopkick/app/account/AgeVerificationController;->profileInfo:Lcom/shopkick/app/application/ProfileInfo;

    iget-object v1, p0, Lcom/shopkick/app/account/AgeVerificationController;->appPreferences:Lcom/shopkick/app/application/AppPreferences;

    iget-object v2, p0, Lcom/shopkick/app/account/AgeVerificationController;->clientFlagsManager:Lcom/shopkick/app/application/ClientFlagsManager;

    invoke-static {v0, v1, v2}, Lcom/shopkick/app/account/AgeVerificationController;->getUserBirthdate(Lcom/shopkick/app/application/ProfileInfo;Lcom/shopkick/app/application/AppPreferences;Lcom/shopkick/app/application/ClientFlagsManager;)Ljava/util/Date;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 212
    invoke-static {}, Ljava/util/Calendar;->getInstance()Ljava/util/Calendar;

    move-result-object v1

    iput-object v1, p0, Lcom/shopkick/app/account/AgeVerificationController;->birthday:Ljava/util/Calendar;

    .line 213
    iget-object v1, p0, Lcom/shopkick/app/account/AgeVerificationController;->birthday:Ljava/util/Calendar;

    invoke-virtual {v1, v0}, Ljava/util/Calendar;->setTime(Ljava/util/Date;)V

    :cond_0
    return-void
.end method

.method private static storedBirthdayIsExpired(Lcom/shopkick/app/application/AppPreferences;Lcom/shopkick/app/application/ClientFlagsManager;)Z
    .locals 6

    const-string/jumbo v0, "user_bithday_last_updated_timestamp_ms"

    .line 309
    invoke-virtual {p0, v0}, Lcom/shopkick/app/application/AppPreferences;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/shopkick/app/util/StringUtils;->isEmpty(Ljava/lang/String;)Z

    move-result v0

    const/4 v1, 0x1

    if-eqz v0, :cond_0

    return v1

    .line 313
    :cond_0
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v2

    const-string/jumbo v0, "user_bithday_last_updated_timestamp_ms"

    .line 314
    invoke-virtual {p0, v0}, Lcom/shopkick/app/application/AppPreferences;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    invoke-static {p0}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    move-result-wide v4

    iget-object p0, p1, Lcom/shopkick/app/application/ClientFlagsManager;->clientFlags:Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;

    iget-object p0, p0, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->ageValidationBirthdateCacheTimeSeconds:Ljava/lang/Integer;

    .line 315
    invoke-virtual {p0}, Ljava/lang/Integer;->intValue()I

    move-result p0

    mul-int/lit16 p0, p0, 0x3e8

    int-to-long p0, p0

    add-long/2addr v4, p0

    cmp-long p0, v2, v4

    if-lez p0, :cond_1

    goto :goto_0

    :cond_1
    const/4 v1, 0x0

    :goto_0
    return v1
.end method

.method private verifyAge(Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;Landroid/view/View;Landroid/view/View$OnClickListener;Landroid/content/DialogInterface$OnDismissListener;)V
    .locals 13

    move-object v7, p0

    move-object v8, p1

    move-object/from16 v5, p3

    move-object/from16 v6, p4

    .line 221
    iget-object v0, v7, Lcom/shopkick/app/account/AgeVerificationController;->appScreenWeakReference:Ljava/lang/ref/WeakReference;

    if-eqz v0, :cond_5

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    if-nez v0, :cond_0

    goto/16 :goto_1

    .line 222
    :cond_0
    iget-object v0, v7, Lcom/shopkick/app/account/AgeVerificationController;->appScreenWeakReference:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v9, v0

    check-cast v9, Lcom/shopkick/app/screens/AppScreen;

    .line 224
    invoke-direct {p0}, Lcom/shopkick/app/account/AgeVerificationController;->maybeSetBirthday()V

    .line 226
    iget-object v0, v7, Lcom/shopkick/app/account/AgeVerificationController;->birthday:Ljava/util/Calendar;

    const v10, 0x7f11014f

    const/4 v1, 0x5

    const/4 v2, 0x2

    const/4 v3, 0x0

    if-nez v0, :cond_1

    .line 228
    invoke-virtual {v9}, Lcom/shopkick/app/screens/AppScreen;->getBaseActivity()Lcom/shopkick/app/activities/BaseActivity;

    move-result-object v0

    invoke-static {v0}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v0

    const v4, 0x7f0c008f

    .line 229
    invoke-virtual {v0, v4, v3}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v4

    check-cast v4, Landroid/widget/DatePicker;

    .line 230
    invoke-static {}, Ljava/util/Calendar;->getInstance()Ljava/util/Calendar;

    move-result-object v11

    const/16 v12, 0xb

    .line 232
    invoke-virtual {v11, v2, v12}, Ljava/util/Calendar;->set(II)V

    const/16 v2, 0x1f

    .line 233
    invoke-virtual {v11, v1, v2}, Ljava/util/Calendar;->set(II)V

    const/4 v1, 0x0

    .line 234
    invoke-virtual {v11, v12, v1}, Ljava/util/Calendar;->set(II)V

    const/16 v2, 0xc

    .line 235
    invoke-virtual {v11, v2, v1}, Ljava/util/Calendar;->set(II)V

    const/16 v2, 0xd

    .line 236
    invoke-virtual {v11, v2, v1}, Ljava/util/Calendar;->set(II)V

    const/16 v2, 0xe

    .line 237
    invoke-virtual {v11, v2, v1}, Ljava/util/Calendar;->set(II)V

    .line 238
    invoke-virtual {v11}, Ljava/util/Calendar;->getTimeInMillis()J

    move-result-wide v1

    invoke-virtual {v4, v1, v2}, Landroid/widget/DatePicker;->setMaxDate(J)V

    const v1, 0x7f0c0021

    .line 239
    invoke-virtual {v0, v1, v3}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    .line 240
    iget-object v1, v8, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->type:Ljava/lang/Integer;

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    invoke-direct {p0, v1}, Lcom/shopkick/app/account/AgeVerificationController;->getTitleForTileType(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 242
    new-instance v11, Landroid/app/AlertDialog$Builder;

    invoke-virtual {v9}, Lcom/shopkick/app/screens/AppScreen;->getBaseActivity()Lcom/shopkick/app/activities/BaseActivity;

    move-result-object v1

    invoke-direct {v11, v1}, Landroid/app/AlertDialog$Builder;-><init>(Landroid/content/Context;)V

    .line 243
    invoke-virtual {v11, v0}, Landroid/app/AlertDialog$Builder;->setCustomTitle(Landroid/view/View;)Landroid/app/AlertDialog$Builder;

    .line 244
    invoke-virtual {v11, v4}, Landroid/app/AlertDialog$Builder;->setView(Landroid/view/View;)Landroid/app/AlertDialog$Builder;

    .line 246
    new-instance v12, Lcom/shopkick/app/account/AgeVerificationController$DatePickerDialogClickListener;

    move-object v0, v12

    move-object v1, p0

    move-object v2, v4

    move-object v3, p1

    move-object v4, p2

    move-object/from16 v5, p3

    move-object/from16 v6, p4

    invoke-direct/range {v0 .. v6}, Lcom/shopkick/app/account/AgeVerificationController$DatePickerDialogClickListener;-><init>(Lcom/shopkick/app/account/AgeVerificationController;Landroid/widget/DatePicker;Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;Landroid/view/View;Landroid/view/View$OnClickListener;Landroid/content/DialogInterface$OnDismissListener;)V

    .line 251
    invoke-virtual {v9}, Lcom/shopkick/app/screens/AppScreen;->getBaseActivity()Lcom/shopkick/app/activities/BaseActivity;

    move-result-object v0

    invoke-virtual {v0}, Lcom/shopkick/app/activities/BaseActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0, v10}, Landroid/content/res/Resources;->getText(I)Ljava/lang/CharSequence;

    move-result-object v0

    invoke-virtual {v11, v0, v12}, Landroid/app/AlertDialog$Builder;->setPositiveButton(Ljava/lang/CharSequence;Landroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;

    .line 253
    invoke-virtual {v9}, Lcom/shopkick/app/screens/AppScreen;->getBaseActivity()Lcom/shopkick/app/activities/BaseActivity;

    move-result-object v0

    invoke-virtual {v0}, Lcom/shopkick/app/activities/BaseActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    const v1, 0x7f110140

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getText(I)Ljava/lang/CharSequence;

    move-result-object v0

    invoke-virtual {v11, v0, v12}, Landroid/app/AlertDialog$Builder;->setNegativeButton(Ljava/lang/CharSequence;Landroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;

    .line 255
    invoke-virtual {v11}, Landroid/app/AlertDialog$Builder;->create()Landroid/app/AlertDialog;

    move-result-object v0

    invoke-virtual {v0}, Landroid/app/AlertDialog;->show()V

    .line 256
    iget-object v0, v7, Lcom/shopkick/app/account/AgeVerificationController;->notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

    const-string v1, "ageVerificationStartedEvent"

    invoke-virtual {v0, v1}, Lcom/shopkick/app/util/NotificationCenter;->notifyEvent(Ljava/lang/String;)Ljava/util/List;

    .line 257
    iget-object v0, v7, Lcom/shopkick/app/account/AgeVerificationController;->appScreenWeakReference:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    if-eqz v0, :cond_4

    .line 258
    new-instance v0, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;

    const/16 v1, 0xcc

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const/4 v2, 0x3

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-direct {v0, v1, v2}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;-><init>(Ljava/lang/Integer;Ljava/lang/Integer;)V

    .line 259
    iget-object v1, v8, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->productFamilyId:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;->setProductFamilyId(Ljava/lang/String;)V

    .line 260
    iget-object v1, v8, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->videoId:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;->setVideoId(Ljava/lang/String;)V

    .line 261
    iget-object v1, v7, Lcom/shopkick/app/account/AgeVerificationController;->appScreenWeakReference:Ljava/lang/ref/WeakReference;

    invoke-virtual {v1}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/shopkick/app/screens/AppScreen;

    iget-object v1, v1, Lcom/shopkick/app/screens/AppScreen;->eventLogger:Lcom/shopkick/app/logging/UserEventLogger;

    invoke-virtual {v1, v0}, Lcom/shopkick/app/logging/UserEventLogger;->detectedEvent(Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;)V

    goto :goto_0

    :cond_1
    const/4 v4, 0x1

    .line 264
    invoke-virtual {v0, v4}, Ljava/util/Calendar;->get(I)I

    move-result v0

    iget-object v4, v7, Lcom/shopkick/app/account/AgeVerificationController;->birthday:Ljava/util/Calendar;

    .line 265
    invoke-virtual {v4, v2}, Ljava/util/Calendar;->get(I)I

    move-result v2

    iget-object v4, v7, Lcom/shopkick/app/account/AgeVerificationController;->birthday:Ljava/util/Calendar;

    .line 266
    invoke-virtual {v4, v1}, Ljava/util/Calendar;->get(I)I

    move-result v1

    .line 264
    invoke-static {v0, v2, v1}, Lcom/shopkick/app/account/AgeVerificationController;->getAgeFromBirthday(III)I

    move-result v0

    iget-object v1, v8, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->minimumAgeForKicks:Ljava/lang/Integer;

    .line 266
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    if-ge v0, v1, :cond_3

    .line 268
    new-instance v0, Landroid/app/AlertDialog$Builder;

    invoke-virtual {v9}, Lcom/shopkick/app/screens/AppScreen;->getBaseActivity()Lcom/shopkick/app/activities/BaseActivity;

    move-result-object v1

    invoke-direct {v0, v1}, Landroid/app/AlertDialog$Builder;-><init>(Landroid/content/Context;)V

    .line 269
    invoke-direct {p0, p1}, Lcom/shopkick/app/account/AgeVerificationController;->getFailureMessageForTileType(Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/app/AlertDialog$Builder;->setMessage(Ljava/lang/CharSequence;)Landroid/app/AlertDialog$Builder;

    .line 271
    invoke-virtual {v9}, Lcom/shopkick/app/screens/AppScreen;->getBaseActivity()Lcom/shopkick/app/activities/BaseActivity;

    move-result-object v1

    invoke-virtual {v1}, Lcom/shopkick/app/activities/BaseActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    invoke-virtual {v1, v10}, Landroid/content/res/Resources;->getText(I)Ljava/lang/CharSequence;

    move-result-object v1

    invoke-virtual {v0, v1, v3}, Landroid/app/AlertDialog$Builder;->setPositiveButton(Ljava/lang/CharSequence;Landroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;

    .line 273
    invoke-virtual {v0}, Landroid/app/AlertDialog$Builder;->create()Landroid/app/AlertDialog;

    move-result-object v0

    if-eqz v6, :cond_2

    .line 276
    invoke-virtual {v0, v6}, Landroid/app/AlertDialog;->setOnDismissListener(Landroid/content/DialogInterface$OnDismissListener;)V

    .line 279
    :cond_2
    invoke-virtual {v0}, Landroid/app/AlertDialog;->show()V

    goto :goto_0

    :cond_3
    if-eqz v5, :cond_4

    move-object v0, p2

    .line 282
    invoke-interface {v5, p2}, Landroid/view/View$OnClickListener;->onClick(Landroid/view/View;)V

    :cond_4
    :goto_0
    return-void

    :cond_5
    :goto_1
    return-void
.end method


# virtual methods
.method public completedResponse(Lcom/shopkick/app/fetchers/api/IAPIObject;Lcom/shopkick/fetchers/DataResponse;)V
    .locals 1

    .line 342
    iget-object v0, p0, Lcom/shopkick/app/account/AgeVerificationController;->userUpdateRequest:Lcom/shopkick/app/fetchers/api/skapi/UserUpdateRequest;

    if-ne p1, v0, :cond_2

    .line 343
    iget-boolean p1, p2, Lcom/shopkick/fetchers/DataResponse;->success:Z

    if-eqz p1, :cond_1

    .line 344
    iget-object p1, p2, Lcom/shopkick/fetchers/DataResponse;->responseData:Ljava/lang/Object;

    check-cast p1, Lcom/shopkick/app/fetchers/api/skapi/UserUpdateResponse;

    .line 345
    iget-object p2, p1, Lcom/shopkick/app/fetchers/api/skapi/UserUpdateResponse;->status:Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    if-nez p2, :cond_0

    .line 347
    iget-object p1, p0, Lcom/shopkick/app/account/AgeVerificationController;->profileInfo:Lcom/shopkick/app/application/ProfileInfo;

    invoke-virtual {p1}, Lcom/shopkick/app/application/ProfileInfo;->refresh()V

    goto :goto_0

    .line 349
    :cond_0
    iget-object p2, p0, Lcom/shopkick/app/account/AgeVerificationController;->alertViewFactory:Lcom/shopkick/app/application/dialog/DialogsManager;

    iget-object p1, p1, Lcom/shopkick/app/fetchers/api/skapi/UserUpdateResponse;->errorMsg:Ljava/lang/String;

    invoke-virtual {p2, p1}, Lcom/shopkick/app/application/dialog/DialogsManager;->showDialogWithMessage(Ljava/lang/String;)Lcom/shopkick/app/application/dialog/SKDialogFragment;

    goto :goto_0

    .line 352
    :cond_1
    iget-object p1, p0, Lcom/shopkick/app/account/AgeVerificationController;->alertViewFactory:Lcom/shopkick/app/application/dialog/DialogsManager;

    invoke-virtual {p1, p2}, Lcom/shopkick/app/application/dialog/DialogsManager;->showResponseErrorAlert(Lcom/shopkick/fetchers/DataResponse;)V

    :cond_2
    :goto_0
    return-void
.end method

.method public destroy()V
    .locals 2

    .line 78
    iget-object v0, p0, Lcom/shopkick/app/account/AgeVerificationController;->userUpdateRequest:Lcom/shopkick/app/fetchers/api/skapi/UserUpdateRequest;

    if-eqz v0, :cond_0

    .line 79
    iget-object v1, p0, Lcom/shopkick/app/account/AgeVerificationController;->apiManager:Lcom/shopkick/fetchers/api/APIManager;

    invoke-virtual {v1, v0, p0}, Lcom/shopkick/fetchers/api/APIManager;->cancel(Lcom/shopkick/app/fetchers/api/IAPIObject;Lcom/shopkick/fetchers/api/IAPICallback;)V

    :cond_0
    const/4 v0, 0x0

    .line 81
    iput-object v0, p0, Lcom/shopkick/app/account/AgeVerificationController;->userUpdateRequest:Lcom/shopkick/app/fetchers/api/skapi/UserUpdateRequest;

    .line 82
    iget-object v1, p0, Lcom/shopkick/app/account/AgeVerificationController;->notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

    invoke-virtual {v1, p0}, Lcom/shopkick/app/util/NotificationCenter;->removeObserver(Lcom/shopkick/app/util/INotificationObserver;)V

    .line 83
    iput-object v0, p0, Lcom/shopkick/app/account/AgeVerificationController;->appScreenWeakReference:Ljava/lang/ref/WeakReference;

    return-void
.end method

.method public getAgeVerificationStatus(Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;)I
    .locals 4

    .line 119
    iget-object v0, p0, Lcom/shopkick/app/account/AgeVerificationController;->birthday:Ljava/util/Calendar;

    if-eqz v0, :cond_0

    const/4 v1, 0x1

    .line 120
    invoke-virtual {v0, v1}, Ljava/util/Calendar;->get(I)I

    move-result v0

    iget-object v1, p0, Lcom/shopkick/app/account/AgeVerificationController;->birthday:Ljava/util/Calendar;

    const/4 v2, 0x2

    .line 121
    invoke-virtual {v1, v2}, Ljava/util/Calendar;->get(I)I

    move-result v1

    iget-object v2, p0, Lcom/shopkick/app/account/AgeVerificationController;->birthday:Ljava/util/Calendar;

    const/4 v3, 0x5

    .line 122
    invoke-virtual {v2, v3}, Ljava/util/Calendar;->get(I)I

    move-result v2

    .line 120
    invoke-static {v0, v1, v2}, Lcom/shopkick/app/account/AgeVerificationController;->getAgeFromBirthday(III)I

    move-result v0

    goto :goto_0

    :cond_0
    const/4 v0, -0x1

    .line 125
    :goto_0
    invoke-static {p1, v0}, Lcom/shopkick/app/account/AgeVerificationController;->getAgeVerificationStatus(Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;I)I

    move-result p1

    return p1
.end method

.method public maybeVerifyAge(Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;Landroid/view/View;Landroid/view/View$OnClickListener;Landroid/content/DialogInterface$OnDismissListener;)V
    .locals 1

    .line 100
    iget-object v0, p1, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->minimumAgeForKicks:Ljava/lang/Integer;

    if-nez v0, :cond_1

    if-nez p3, :cond_0

    return-void

    .line 105
    :cond_0
    invoke-interface {p3, p2}, Landroid/view/View$OnClickListener;->onClick(Landroid/view/View;)V

    goto :goto_0

    .line 107
    :cond_1
    invoke-direct {p0, p1, p2, p3, p4}, Lcom/shopkick/app/account/AgeVerificationController;->verifyAge(Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;Landroid/view/View;Landroid/view/View$OnClickListener;Landroid/content/DialogInterface$OnDismissListener;)V

    :goto_0
    return-void
.end method

.method public onEvent(Ljava/lang/String;Ljava/util/HashMap;)V
    .locals 1
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

    .line 324
    invoke-virtual {p1}, Ljava/lang/String;->hashCode()I

    move-result p2

    const v0, 0x44e6563

    if-eq p2, v0, :cond_1

    const v0, 0x37893616

    if-eq p2, v0, :cond_0

    goto :goto_0

    :cond_0
    const-string p2, "ProfileInfoUpdatedEvent"

    invoke-virtual {p1, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_2

    const/4 p1, 0x1

    goto :goto_1

    :cond_1
    const-string p2, "UserAccountIdChangedEvent"

    invoke-virtual {p1, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_2

    const/4 p1, 0x0

    goto :goto_1

    :cond_2
    :goto_0
    const/4 p1, -0x1

    :goto_1
    packed-switch p1, :pswitch_data_0

    goto :goto_2

    .line 330
    :pswitch_0
    invoke-direct {p0}, Lcom/shopkick/app/account/AgeVerificationController;->maybeSetBirthday()V

    goto :goto_2

    .line 326
    :pswitch_1
    iget-object p1, p0, Lcom/shopkick/app/account/AgeVerificationController;->appPreferences:Lcom/shopkick/app/application/AppPreferences;

    const-string/jumbo p2, "user_birthday"

    const/4 v0, 0x0

    invoke-virtual {p1, p2, v0}, Lcom/shopkick/app/application/AppPreferences;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 327
    iget-object p1, p0, Lcom/shopkick/app/account/AgeVerificationController;->appPreferences:Lcom/shopkick/app/application/AppPreferences;

    const-string/jumbo p2, "user_bithday_last_updated_timestamp_ms"

    invoke-virtual {p1, p2, v0}, Lcom/shopkick/app/application/AppPreferences;->putString(Ljava/lang/String;Ljava/lang/String;)V

    :goto_2
    return-void

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public receivedResponse(Lcom/shopkick/app/fetchers/api/IAPIObject;Lcom/shopkick/fetchers/DataResponse;)V
    .locals 0

    return-void
.end method
