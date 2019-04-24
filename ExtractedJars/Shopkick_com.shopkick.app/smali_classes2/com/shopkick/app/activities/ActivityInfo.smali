.class public Lcom/shopkick/app/activities/ActivityInfo;
.super Ljava/lang/Object;
.source "ActivityInfo.java"


# static fields
.field private static final BNC_ACTIVITY_KEY:Ljava/lang/String; = "BNC_ACTIVITY_KEY"

.field private static final DETAILS_ACTIVITY_KEY:Ljava/lang/String; = "DETAILS_ACTIVITY_KEY"

.field private static final FIRST_USE_ACTIVITY_KEY:Ljava/lang/String; = "FIRST_USE_ACTIVITY_KEY"

.field private static final HOME_ACTIVITY_KEY:Ljava/lang/String; = "HOME_ACTIVITY_KEY"

.field private static final INVITE_ACTIVITY_KEY:Ljava/lang/String; = "INVITE_ACTIVITY_KEY"

.field private static final KICKS_ACTIVITY_KEY:Ljava/lang/String; = "KICKS_ACTIVITY_KEY"

.field private static final LOGIN_REGISTRATION_ACTIVITY_KEY:Ljava/lang/String; = "LOGIN_REGISTRATION_ACTIVITY_KEY"

.field private static final PHONE_VERIFICATION_ACTIVITY_KEY:Ljava/lang/String; = "PHONE_VERIFICATION_ACTIVITY_KEY"

.field private static final RECEIPT_SCAN_ACTIVITY_KEY:Ljava/lang/String; = "RECEIPT_SCAN_ACTIVITY_KEY"

.field private static final REWARD_ACTIVITY_KEY:Ljava/lang/String; = "REWARD_ACTIVITY_KEY"

.field private static final SPLASH_ACTIVITY_KEY:Ljava/lang/String; = "SPLASH_ACTIVITY_KEY"

.field private static instance:Lcom/shopkick/app/activities/ActivityInfo;


# instance fields
.field private activitiesByKey:Ljava/util/HashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/HashMap<",
            "Ljava/lang/String;",
            "Ljava/lang/Class<",
            "+",
            "Lcom/shopkick/app/activities/BaseActivity;",
            ">;>;"
        }
    .end annotation
.end field

.field private keysByActivity:Ljava/util/HashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/HashMap<",
            "Ljava/lang/Class<",
            "+",
            "Lcom/shopkick/app/activities/BaseActivity;",
            ">;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method protected constructor <init>()V
    .locals 3

    .line 38
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 39
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lcom/shopkick/app/activities/ActivityInfo;->activitiesByKey:Ljava/util/HashMap;

    .line 40
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lcom/shopkick/app/activities/ActivityInfo;->keysByActivity:Ljava/util/HashMap;

    .line 42
    iget-object v0, p0, Lcom/shopkick/app/activities/ActivityInfo;->activitiesByKey:Ljava/util/HashMap;

    const-string v1, "HOME_ACTIVITY_KEY"

    const-class v2, Lcom/shopkick/app/activities/HomeActivity;

    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 43
    iget-object v0, p0, Lcom/shopkick/app/activities/ActivityInfo;->keysByActivity:Ljava/util/HashMap;

    const-class v1, Lcom/shopkick/app/activities/HomeActivity;

    const-string v2, "HOME_ACTIVITY_KEY"

    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 45
    iget-object v0, p0, Lcom/shopkick/app/activities/ActivityInfo;->activitiesByKey:Ljava/util/HashMap;

    const-string v1, "DETAILS_ACTIVITY_KEY"

    const-class v2, Lcom/shopkick/app/activities/DetailsActivity;

    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 46
    iget-object v0, p0, Lcom/shopkick/app/activities/ActivityInfo;->keysByActivity:Ljava/util/HashMap;

    const-class v1, Lcom/shopkick/app/activities/DetailsActivity;

    const-string v2, "DETAILS_ACTIVITY_KEY"

    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 48
    iget-object v0, p0, Lcom/shopkick/app/activities/ActivityInfo;->activitiesByKey:Ljava/util/HashMap;

    const-string v1, "BNC_ACTIVITY_KEY"

    const-class v2, Lcom/shopkick/app/activities/BncActivity;

    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 49
    iget-object v0, p0, Lcom/shopkick/app/activities/ActivityInfo;->keysByActivity:Ljava/util/HashMap;

    const-class v1, Lcom/shopkick/app/activities/BncActivity;

    const-string v2, "BNC_ACTIVITY_KEY"

    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 51
    iget-object v0, p0, Lcom/shopkick/app/activities/ActivityInfo;->activitiesByKey:Ljava/util/HashMap;

    const-string v1, "FIRST_USE_ACTIVITY_KEY"

    const-class v2, Lcom/shopkick/app/activities/FirstUseActivityV2;

    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 52
    iget-object v0, p0, Lcom/shopkick/app/activities/ActivityInfo;->keysByActivity:Ljava/util/HashMap;

    const-class v1, Lcom/shopkick/app/activities/FirstUseActivityV2;

    const-string v2, "FIRST_USE_ACTIVITY_KEY"

    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 54
    iget-object v0, p0, Lcom/shopkick/app/activities/ActivityInfo;->activitiesByKey:Ljava/util/HashMap;

    const-string v1, "LOGIN_REGISTRATION_ACTIVITY_KEY"

    const-class v2, Lcom/shopkick/app/activities/LoginRegistrationActivity;

    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 55
    iget-object v0, p0, Lcom/shopkick/app/activities/ActivityInfo;->keysByActivity:Ljava/util/HashMap;

    const-class v1, Lcom/shopkick/app/activities/LoginRegistrationActivity;

    const-string v2, "LOGIN_REGISTRATION_ACTIVITY_KEY"

    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 57
    iget-object v0, p0, Lcom/shopkick/app/activities/ActivityInfo;->activitiesByKey:Ljava/util/HashMap;

    const-string v1, "SPLASH_ACTIVITY_KEY"

    const-class v2, Lcom/shopkick/app/activities/SplashActivity;

    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 58
    iget-object v0, p0, Lcom/shopkick/app/activities/ActivityInfo;->keysByActivity:Ljava/util/HashMap;

    const-class v1, Lcom/shopkick/app/activities/SplashActivity;

    const-string v2, "SPLASH_ACTIVITY_KEY"

    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 60
    iget-object v0, p0, Lcom/shopkick/app/activities/ActivityInfo;->activitiesByKey:Ljava/util/HashMap;

    const-string v1, "PHONE_VERIFICATION_ACTIVITY_KEY"

    const-class v2, Lcom/shopkick/app/activities/PhoneVerificationActivity;

    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 61
    iget-object v0, p0, Lcom/shopkick/app/activities/ActivityInfo;->keysByActivity:Ljava/util/HashMap;

    const-class v1, Lcom/shopkick/app/activities/PhoneVerificationActivity;

    const-string v2, "PHONE_VERIFICATION_ACTIVITY_KEY"

    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 63
    iget-object v0, p0, Lcom/shopkick/app/activities/ActivityInfo;->activitiesByKey:Ljava/util/HashMap;

    const-string v1, "REWARD_ACTIVITY_KEY"

    const-class v2, Lcom/shopkick/app/activities/RewardActivity;

    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 64
    iget-object v0, p0, Lcom/shopkick/app/activities/ActivityInfo;->keysByActivity:Ljava/util/HashMap;

    const-class v1, Lcom/shopkick/app/activities/RewardActivity;

    const-string v2, "REWARD_ACTIVITY_KEY"

    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 66
    iget-object v0, p0, Lcom/shopkick/app/activities/ActivityInfo;->activitiesByKey:Ljava/util/HashMap;

    const-string v1, "INVITE_ACTIVITY_KEY"

    const-class v2, Lcom/shopkick/app/activities/InviteActivity;

    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 67
    iget-object v0, p0, Lcom/shopkick/app/activities/ActivityInfo;->keysByActivity:Ljava/util/HashMap;

    const-class v1, Lcom/shopkick/app/activities/InviteActivity;

    const-string v2, "INVITE_ACTIVITY_KEY"

    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 69
    iget-object v0, p0, Lcom/shopkick/app/activities/ActivityInfo;->activitiesByKey:Ljava/util/HashMap;

    const-string v1, "RECEIPT_SCAN_ACTIVITY_KEY"

    const-class v2, Lcom/shopkick/app/activities/ReceiptScanActivity;

    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 70
    iget-object v0, p0, Lcom/shopkick/app/activities/ActivityInfo;->keysByActivity:Ljava/util/HashMap;

    const-class v1, Lcom/shopkick/app/activities/ReceiptScanActivity;

    const-string v2, "RECEIPT_SCAN_ACTIVITY_KEY"

    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 72
    iget-object v0, p0, Lcom/shopkick/app/activities/ActivityInfo;->activitiesByKey:Ljava/util/HashMap;

    const-string v1, "KICKS_ACTIVITY_KEY"

    const-class v2, Lcom/shopkick/app/activities/KicksActivity;

    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 73
    iget-object v0, p0, Lcom/shopkick/app/activities/ActivityInfo;->keysByActivity:Ljava/util/HashMap;

    const-class v1, Lcom/shopkick/app/activities/KicksActivity;

    const-string v2, "KICKS_ACTIVITY_KEY"

    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public static getInstance()Lcom/shopkick/app/activities/ActivityInfo;
    .locals 1

    .line 24
    sget-object v0, Lcom/shopkick/app/activities/ActivityInfo;->instance:Lcom/shopkick/app/activities/ActivityInfo;

    if-nez v0, :cond_0

    .line 25
    new-instance v0, Lcom/shopkick/app/activities/ActivityInfo;

    invoke-direct {v0}, Lcom/shopkick/app/activities/ActivityInfo;-><init>()V

    sput-object v0, Lcom/shopkick/app/activities/ActivityInfo;->instance:Lcom/shopkick/app/activities/ActivityInfo;

    .line 27
    :cond_0
    sget-object v0, Lcom/shopkick/app/activities/ActivityInfo;->instance:Lcom/shopkick/app/activities/ActivityInfo;

    return-object v0
.end method


# virtual methods
.method public classForKey(Ljava/lang/String;)Ljava/lang/Class;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")",
            "Ljava/lang/Class<",
            "+",
            "Lcom/shopkick/app/activities/BaseActivity;",
            ">;"
        }
    .end annotation

    .line 31
    iget-object v0, p0, Lcom/shopkick/app/activities/ActivityInfo;->activitiesByKey:Ljava/util/HashMap;

    invoke-virtual {v0, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Class;

    return-object p1
.end method

.method public keyForClass(Ljava/lang/Class;)Ljava/lang/String;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Class<",
            "+",
            "Lcom/shopkick/app/activities/BaseActivity;",
            ">;)",
            "Ljava/lang/String;"
        }
    .end annotation

    .line 35
    iget-object v0, p0, Lcom/shopkick/app/activities/ActivityInfo;->keysByActivity:Ljava/util/HashMap;

    invoke-virtual {v0, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/String;

    return-object p1
.end method
