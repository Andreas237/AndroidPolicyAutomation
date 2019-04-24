.class public abstract Lio/branch/referral/ServerRequest;
.super Ljava/lang/Object;
.source "ServerRequest.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lio/branch/referral/ServerRequest$BRANCH_API_VERSION;,
        Lio/branch/referral/ServerRequest$PROCESS_WAIT_LOCK;
    }
.end annotation


# static fields
.field private static final POST_KEY:Ljava/lang/String; = "REQ_POST"

.field private static final POST_PATH_KEY:Ljava/lang/String; = "REQ_POST_PATH"


# instance fields
.field public constructError_:Z

.field private final context_:Landroid/content/Context;

.field private disableAndroidIDFetch_:Z

.field final locks_:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set<",
            "Lio/branch/referral/ServerRequest$PROCESS_WAIT_LOCK;",
            ">;"
        }
    .end annotation
.end field

.field private params_:Lorg/json/JSONObject;

.field protected final prefHelper_:Lio/branch/referral/PrefHelper;

.field queueWaitTime_:J

.field protected requestPath_:Ljava/lang/String;

.field skipOnTimeOut:Z

.field private final systemObserver_:Lio/branch/referral/SystemObserver;

.field private waitLockCnt:I


# direct methods
.method public constructor <init>(Landroid/content/Context;Ljava/lang/String;)V
    .locals 2

    .line 62
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-wide/16 v0, 0x0

    .line 34
    iput-wide v0, p0, Lio/branch/referral/ServerRequest;->queueWaitTime_:J

    const/4 v0, 0x0

    .line 36
    iput v0, p0, Lio/branch/referral/ServerRequest;->waitLockCnt:I

    .line 49
    iput-boolean v0, p0, Lio/branch/referral/ServerRequest;->constructError_:Z

    .line 376
    iput-boolean v0, p0, Lio/branch/referral/ServerRequest;->skipOnTimeOut:Z

    .line 63
    iput-object p1, p0, Lio/branch/referral/ServerRequest;->context_:Landroid/content/Context;

    .line 64
    iput-object p2, p0, Lio/branch/referral/ServerRequest;->requestPath_:Ljava/lang/String;

    .line 65
    invoke-static {p1}, Lio/branch/referral/PrefHelper;->getInstance(Landroid/content/Context;)Lio/branch/referral/PrefHelper;

    move-result-object p2

    iput-object p2, p0, Lio/branch/referral/ServerRequest;->prefHelper_:Lio/branch/referral/PrefHelper;

    .line 66
    new-instance p2, Lio/branch/referral/SystemObserver;

    invoke-direct {p2, p1}, Lio/branch/referral/SystemObserver;-><init>(Landroid/content/Context;)V

    iput-object p2, p0, Lio/branch/referral/ServerRequest;->systemObserver_:Lio/branch/referral/SystemObserver;

    .line 67
    new-instance p1, Lorg/json/JSONObject;

    invoke-direct {p1}, Lorg/json/JSONObject;-><init>()V

    iput-object p1, p0, Lio/branch/referral/ServerRequest;->params_:Lorg/json/JSONObject;

    .line 68
    invoke-static {}, Lio/branch/referral/Branch;->isDeviceIDFetchDisabled()Z

    move-result p1

    iput-boolean p1, p0, Lio/branch/referral/ServerRequest;->disableAndroidIDFetch_:Z

    .line 69
    new-instance p1, Ljava/util/HashSet;

    invoke-direct {p1}, Ljava/util/HashSet;-><init>()V

    iput-object p1, p0, Lio/branch/referral/ServerRequest;->locks_:Ljava/util/Set;

    return-void
.end method

.method protected constructor <init>(Ljava/lang/String;Lorg/json/JSONObject;Landroid/content/Context;)V
    .locals 2

    .line 80
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-wide/16 v0, 0x0

    .line 34
    iput-wide v0, p0, Lio/branch/referral/ServerRequest;->queueWaitTime_:J

    const/4 v0, 0x0

    .line 36
    iput v0, p0, Lio/branch/referral/ServerRequest;->waitLockCnt:I

    .line 49
    iput-boolean v0, p0, Lio/branch/referral/ServerRequest;->constructError_:Z

    .line 376
    iput-boolean v0, p0, Lio/branch/referral/ServerRequest;->skipOnTimeOut:Z

    .line 81
    iput-object p3, p0, Lio/branch/referral/ServerRequest;->context_:Landroid/content/Context;

    .line 82
    iput-object p1, p0, Lio/branch/referral/ServerRequest;->requestPath_:Ljava/lang/String;

    .line 83
    iput-object p2, p0, Lio/branch/referral/ServerRequest;->params_:Lorg/json/JSONObject;

    .line 84
    invoke-static {p3}, Lio/branch/referral/PrefHelper;->getInstance(Landroid/content/Context;)Lio/branch/referral/PrefHelper;

    move-result-object p1

    iput-object p1, p0, Lio/branch/referral/ServerRequest;->prefHelper_:Lio/branch/referral/PrefHelper;

    .line 85
    new-instance p1, Lio/branch/referral/SystemObserver;

    invoke-direct {p1, p3}, Lio/branch/referral/SystemObserver;-><init>(Landroid/content/Context;)V

    iput-object p1, p0, Lio/branch/referral/ServerRequest;->systemObserver_:Lio/branch/referral/SystemObserver;

    .line 86
    invoke-static {}, Lio/branch/referral/Branch;->isDeviceIDFetchDisabled()Z

    move-result p1

    iput-boolean p1, p0, Lio/branch/referral/ServerRequest;->disableAndroidIDFetch_:Z

    .line 87
    new-instance p1, Ljava/util/HashSet;

    invoke-direct {p1}, Ljava/util/HashSet;-><init>()V

    iput-object p1, p0, Lio/branch/referral/ServerRequest;->locks_:Ljava/util/Set;

    return-void
.end method

.method public static fromJSON(Lorg/json/JSONObject;Landroid/content/Context;)Lio/branch/referral/ServerRequest;
    .locals 4

    const-string v0, ""

    const/4 v1, 0x0

    :try_start_0
    const-string v2, "REQ_POST"

    .line 318
    invoke-virtual {p0, v2}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_0

    const-string v2, "REQ_POST"

    .line 319
    invoke-virtual {p0, v2}, Lorg/json/JSONObject;->getJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v2
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :cond_0
    move-object v2, v1

    goto :goto_0

    :catch_0
    move-object v2, v1

    :goto_0
    :try_start_1
    const-string v3, "REQ_POST_PATH"

    .line 326
    invoke-virtual {p0, v3}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v3

    if-eqz v3, :cond_1

    const-string v3, "REQ_POST_PATH"

    .line 327
    invoke-virtual {p0, v3}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0
    :try_end_1
    .catch Lorg/json/JSONException; {:try_start_1 .. :try_end_1} :catch_1

    move-object v0, p0

    :catch_1
    :cond_1
    if-eqz v0, :cond_2

    .line 333
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result p0

    if-lez p0, :cond_2

    .line 334
    invoke-static {v0, v2, p1}, Lio/branch/referral/ServerRequest;->getExtendedServerRequest(Ljava/lang/String;Lorg/json/JSONObject;Landroid/content/Context;)Lio/branch/referral/ServerRequest;

    move-result-object p0

    return-object p0

    :cond_2
    return-object v1
.end method

.method private static getExtendedServerRequest(Ljava/lang/String;Lorg/json/JSONObject;Landroid/content/Context;)Lio/branch/referral/ServerRequest;
    .locals 1

    .line 351
    sget-object v0, Lio/branch/referral/Defines$RequestPath;->CompletedAction:Lio/branch/referral/Defines$RequestPath;

    invoke-virtual {v0}, Lio/branch/referral/Defines$RequestPath;->getPath()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 352
    new-instance v0, Lio/branch/referral/ServerRequestActionCompleted;

    invoke-direct {v0, p0, p1, p2}, Lio/branch/referral/ServerRequestActionCompleted;-><init>(Ljava/lang/String;Lorg/json/JSONObject;Landroid/content/Context;)V

    goto/16 :goto_0

    .line 353
    :cond_0
    sget-object v0, Lio/branch/referral/Defines$RequestPath;->GetURL:Lio/branch/referral/Defines$RequestPath;

    invoke-virtual {v0}, Lio/branch/referral/Defines$RequestPath;->getPath()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 354
    new-instance v0, Lio/branch/referral/ServerRequestCreateUrl;

    invoke-direct {v0, p0, p1, p2}, Lio/branch/referral/ServerRequestCreateUrl;-><init>(Ljava/lang/String;Lorg/json/JSONObject;Landroid/content/Context;)V

    goto/16 :goto_0

    .line 355
    :cond_1
    sget-object v0, Lio/branch/referral/Defines$RequestPath;->GetCreditHistory:Lio/branch/referral/Defines$RequestPath;

    invoke-virtual {v0}, Lio/branch/referral/Defines$RequestPath;->getPath()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 356
    new-instance v0, Lio/branch/referral/ServerRequestGetRewardHistory;

    invoke-direct {v0, p0, p1, p2}, Lio/branch/referral/ServerRequestGetRewardHistory;-><init>(Ljava/lang/String;Lorg/json/JSONObject;Landroid/content/Context;)V

    goto/16 :goto_0

    .line 357
    :cond_2
    sget-object v0, Lio/branch/referral/Defines$RequestPath;->GetCredits:Lio/branch/referral/Defines$RequestPath;

    invoke-virtual {v0}, Lio/branch/referral/Defines$RequestPath;->getPath()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 358
    new-instance v0, Lio/branch/referral/ServerRequestGetRewards;

    invoke-direct {v0, p0, p1, p2}, Lio/branch/referral/ServerRequestGetRewards;-><init>(Ljava/lang/String;Lorg/json/JSONObject;Landroid/content/Context;)V

    goto/16 :goto_0

    .line 359
    :cond_3
    sget-object v0, Lio/branch/referral/Defines$RequestPath;->IdentifyUser:Lio/branch/referral/Defines$RequestPath;

    invoke-virtual {v0}, Lio/branch/referral/Defines$RequestPath;->getPath()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_4

    .line 360
    new-instance v0, Lio/branch/referral/ServerRequestIdentifyUserRequest;

    invoke-direct {v0, p0, p1, p2}, Lio/branch/referral/ServerRequestIdentifyUserRequest;-><init>(Ljava/lang/String;Lorg/json/JSONObject;Landroid/content/Context;)V

    goto :goto_0

    .line 361
    :cond_4
    sget-object v0, Lio/branch/referral/Defines$RequestPath;->Logout:Lio/branch/referral/Defines$RequestPath;

    invoke-virtual {v0}, Lio/branch/referral/Defines$RequestPath;->getPath()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_5

    .line 362
    new-instance v0, Lio/branch/referral/ServerRequestLogout;

    invoke-direct {v0, p0, p1, p2}, Lio/branch/referral/ServerRequestLogout;-><init>(Ljava/lang/String;Lorg/json/JSONObject;Landroid/content/Context;)V

    goto :goto_0

    .line 363
    :cond_5
    sget-object v0, Lio/branch/referral/Defines$RequestPath;->RedeemRewards:Lio/branch/referral/Defines$RequestPath;

    invoke-virtual {v0}, Lio/branch/referral/Defines$RequestPath;->getPath()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_6

    .line 364
    new-instance v0, Lio/branch/referral/ServerRequestRedeemRewards;

    invoke-direct {v0, p0, p1, p2}, Lio/branch/referral/ServerRequestRedeemRewards;-><init>(Ljava/lang/String;Lorg/json/JSONObject;Landroid/content/Context;)V

    goto :goto_0

    .line 365
    :cond_6
    sget-object v0, Lio/branch/referral/Defines$RequestPath;->RegisterClose:Lio/branch/referral/Defines$RequestPath;

    invoke-virtual {v0}, Lio/branch/referral/Defines$RequestPath;->getPath()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_7

    .line 366
    new-instance v0, Lio/branch/referral/ServerRequestRegisterClose;

    invoke-direct {v0, p0, p1, p2}, Lio/branch/referral/ServerRequestRegisterClose;-><init>(Ljava/lang/String;Lorg/json/JSONObject;Landroid/content/Context;)V

    goto :goto_0

    .line 367
    :cond_7
    sget-object v0, Lio/branch/referral/Defines$RequestPath;->RegisterInstall:Lio/branch/referral/Defines$RequestPath;

    invoke-virtual {v0}, Lio/branch/referral/Defines$RequestPath;->getPath()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_8

    .line 368
    new-instance v0, Lio/branch/referral/ServerRequestRegisterInstall;

    invoke-direct {v0, p0, p1, p2}, Lio/branch/referral/ServerRequestRegisterInstall;-><init>(Ljava/lang/String;Lorg/json/JSONObject;Landroid/content/Context;)V

    goto :goto_0

    .line 369
    :cond_8
    sget-object v0, Lio/branch/referral/Defines$RequestPath;->RegisterOpen:Lio/branch/referral/Defines$RequestPath;

    invoke-virtual {v0}, Lio/branch/referral/Defines$RequestPath;->getPath()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_9

    .line 370
    new-instance v0, Lio/branch/referral/ServerRequestRegisterOpen;

    invoke-direct {v0, p0, p1, p2}, Lio/branch/referral/ServerRequestRegisterOpen;-><init>(Ljava/lang/String;Lorg/json/JSONObject;Landroid/content/Context;)V

    goto :goto_0

    :cond_9
    const/4 v0, 0x0

    :goto_0
    return-object v0
.end method

.method private static isPackageInstalled(Landroid/content/Context;)Z
    .locals 3

    .line 590
    invoke-virtual {p0}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v0

    .line 591
    invoke-virtual {p0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v0, p0}, Landroid/content/pm/PackageManager;->getLaunchIntentForPackage(Ljava/lang/String;)Landroid/content/Intent;

    move-result-object p0

    const/4 v1, 0x0

    if-nez p0, :cond_0

    return v1

    :cond_0
    const/high16 v2, 0x10000

    .line 595
    invoke-virtual {v0, p0, v2}, Landroid/content/pm/PackageManager;->queryIntentActivities(Landroid/content/Intent;I)Ljava/util/List;

    move-result-object p0

    if-eqz p0, :cond_1

    .line 596
    invoke-interface {p0}, Ljava/util/List;->size()I

    move-result p0

    if-lez p0, :cond_1

    const/4 v1, 0x1

    :cond_1
    return v1
.end method

.method private updateDeviceInfo()V
    .locals 3

    .line 418
    invoke-virtual {p0}, Lio/branch/referral/ServerRequest;->getBranchRemoteAPIVersion()Lio/branch/referral/ServerRequest$BRANCH_API_VERSION;

    move-result-object v0

    .line 419
    sget-object v1, Lio/branch/referral/ServerRequest$BRANCH_API_VERSION;->V2:Lio/branch/referral/ServerRequest$BRANCH_API_VERSION;

    if-ne v0, v1, :cond_0

    .line 420
    iget-object v0, p0, Lio/branch/referral/ServerRequest;->params_:Lorg/json/JSONObject;

    sget-object v1, Lio/branch/referral/Defines$Jsonkey;->UserData:Lio/branch/referral/Defines$Jsonkey;

    invoke-virtual {v1}, Lio/branch/referral/Defines$Jsonkey;->getKey()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 423
    :try_start_0
    sget-object v1, Lio/branch/referral/Defines$Jsonkey;->DeveloperIdentity:Lio/branch/referral/Defines$Jsonkey;

    invoke-virtual {v1}, Lio/branch/referral/Defines$Jsonkey;->getKey()Ljava/lang/String;

    move-result-object v1

    iget-object v2, p0, Lio/branch/referral/ServerRequest;->prefHelper_:Lio/branch/referral/PrefHelper;

    invoke-virtual {v2}, Lio/branch/referral/PrefHelper;->getIdentity()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 424
    sget-object v1, Lio/branch/referral/Defines$Jsonkey;->DeviceFingerprintID:Lio/branch/referral/Defines$Jsonkey;

    invoke-virtual {v1}, Lio/branch/referral/Defines$Jsonkey;->getKey()Ljava/lang/String;

    move-result-object v1

    iget-object v2, p0, Lio/branch/referral/ServerRequest;->prefHelper_:Lio/branch/referral/PrefHelper;

    invoke-virtual {v2}, Lio/branch/referral/PrefHelper;->getDeviceFingerPrintID()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    :cond_0
    return-void
.end method

.method private updateGAdsParams()V
    .locals 3

    .line 382
    invoke-virtual {p0}, Lio/branch/referral/ServerRequest;->getBranchRemoteAPIVersion()Lio/branch/referral/ServerRequest$BRANCH_API_VERSION;

    move-result-object v0

    .line 383
    iget-object v1, p0, Lio/branch/referral/ServerRequest;->systemObserver_:Lio/branch/referral/SystemObserver;

    sget-object v1, Lio/branch/referral/SystemObserver;->GAIDString_:Ljava/lang/String;

    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    if-nez v1, :cond_1

    .line 385
    :try_start_0
    sget-object v1, Lio/branch/referral/ServerRequest$BRANCH_API_VERSION;->V2:Lio/branch/referral/ServerRequest$BRANCH_API_VERSION;

    if-ne v0, v1, :cond_0

    .line 386
    iget-object v0, p0, Lio/branch/referral/ServerRequest;->params_:Lorg/json/JSONObject;

    sget-object v1, Lio/branch/referral/Defines$Jsonkey;->UserData:Lio/branch/referral/Defines$Jsonkey;

    invoke-virtual {v1}, Lio/branch/referral/Defines$Jsonkey;->getKey()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v0

    if-eqz v0, :cond_2

    .line 388
    sget-object v1, Lio/branch/referral/Defines$Jsonkey;->AAID:Lio/branch/referral/Defines$Jsonkey;

    invoke-virtual {v1}, Lio/branch/referral/Defines$Jsonkey;->getKey()Ljava/lang/String;

    move-result-object v1

    iget-object v2, p0, Lio/branch/referral/ServerRequest;->systemObserver_:Lio/branch/referral/SystemObserver;

    sget-object v2, Lio/branch/referral/SystemObserver;->GAIDString_:Ljava/lang/String;

    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 389
    sget-object v1, Lio/branch/referral/Defines$Jsonkey;->LimitedAdTracking:Lio/branch/referral/Defines$Jsonkey;

    invoke-virtual {v1}, Lio/branch/referral/Defines$Jsonkey;->getKey()Ljava/lang/String;

    move-result-object v1

    iget-object v2, p0, Lio/branch/referral/ServerRequest;->systemObserver_:Lio/branch/referral/SystemObserver;

    iget v2, v2, Lio/branch/referral/SystemObserver;->LATVal_:I

    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    .line 390
    sget-object v1, Lio/branch/referral/Defines$Jsonkey;->UnidentifiedDevice:Lio/branch/referral/Defines$Jsonkey;

    invoke-virtual {v1}, Lio/branch/referral/Defines$Jsonkey;->getKey()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lorg/json/JSONObject;->remove(Ljava/lang/String;)Ljava/lang/Object;

    goto :goto_0

    .line 393
    :cond_0
    iget-object v0, p0, Lio/branch/referral/ServerRequest;->params_:Lorg/json/JSONObject;

    sget-object v1, Lio/branch/referral/Defines$Jsonkey;->GoogleAdvertisingID:Lio/branch/referral/Defines$Jsonkey;

    invoke-virtual {v1}, Lio/branch/referral/Defines$Jsonkey;->getKey()Ljava/lang/String;

    move-result-object v1

    iget-object v2, p0, Lio/branch/referral/ServerRequest;->systemObserver_:Lio/branch/referral/SystemObserver;

    sget-object v2, Lio/branch/referral/SystemObserver;->GAIDString_:Ljava/lang/String;

    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 394
    iget-object v0, p0, Lio/branch/referral/ServerRequest;->params_:Lorg/json/JSONObject;

    sget-object v1, Lio/branch/referral/Defines$Jsonkey;->LATVal:Lio/branch/referral/Defines$Jsonkey;

    invoke-virtual {v1}, Lio/branch/referral/Defines$Jsonkey;->getKey()Ljava/lang/String;

    move-result-object v1

    iget-object v2, p0, Lio/branch/referral/ServerRequest;->systemObserver_:Lio/branch/referral/SystemObserver;

    iget v2, v2, Lio/branch/referral/SystemObserver;->LATVal_:I

    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v0

    .line 397
    invoke-virtual {v0}, Lorg/json/JSONException;->printStackTrace()V

    goto :goto_0

    .line 400
    :cond_1
    sget-object v1, Lio/branch/referral/ServerRequest$BRANCH_API_VERSION;->V2:Lio/branch/referral/ServerRequest$BRANCH_API_VERSION;

    if-ne v0, v1, :cond_2

    .line 402
    :try_start_1
    sget-object v1, Lio/branch/referral/ServerRequest$BRANCH_API_VERSION;->V2:Lio/branch/referral/ServerRequest$BRANCH_API_VERSION;

    if-ne v0, v1, :cond_2

    .line 403
    iget-object v0, p0, Lio/branch/referral/ServerRequest;->params_:Lorg/json/JSONObject;

    sget-object v1, Lio/branch/referral/Defines$Jsonkey;->UserData:Lio/branch/referral/Defines$Jsonkey;

    invoke-virtual {v1}, Lio/branch/referral/Defines$Jsonkey;->getKey()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v0

    if-eqz v0, :cond_2

    .line 405
    sget-object v1, Lio/branch/referral/Defines$Jsonkey;->AndroidID:Lio/branch/referral/Defines$Jsonkey;

    invoke-virtual {v1}, Lio/branch/referral/Defines$Jsonkey;->getKey()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v1

    if-nez v1, :cond_2

    .line 406
    sget-object v1, Lio/branch/referral/Defines$Jsonkey;->UnidentifiedDevice:Lio/branch/referral/Defines$Jsonkey;

    invoke-virtual {v1}, Lio/branch/referral/Defines$Jsonkey;->getKey()Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x1

    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Z)Lorg/json/JSONObject;
    :try_end_1
    .catch Lorg/json/JSONException; {:try_start_1 .. :try_end_1} :catch_1

    :catch_1
    :cond_2
    :goto_0
    return-void
.end method

.method private updateLimitFacebookTracking()V
    .locals 3

    .line 468
    invoke-virtual {p0}, Lio/branch/referral/ServerRequest;->getBranchRemoteAPIVersion()Lio/branch/referral/ServerRequest$BRANCH_API_VERSION;

    move-result-object v0

    sget-object v1, Lio/branch/referral/ServerRequest$BRANCH_API_VERSION;->V1:Lio/branch/referral/ServerRequest$BRANCH_API_VERSION;

    if-ne v0, v1, :cond_0

    iget-object v0, p0, Lio/branch/referral/ServerRequest;->params_:Lorg/json/JSONObject;

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lio/branch/referral/ServerRequest;->params_:Lorg/json/JSONObject;

    sget-object v1, Lio/branch/referral/Defines$Jsonkey;->UserData:Lio/branch/referral/Defines$Jsonkey;

    invoke-virtual {v1}, Lio/branch/referral/Defines$Jsonkey;->getKey()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v0

    :goto_0
    if-eqz v0, :cond_1

    .line 470
    iget-object v1, p0, Lio/branch/referral/ServerRequest;->prefHelper_:Lio/branch/referral/PrefHelper;

    invoke-virtual {v1}, Lio/branch/referral/PrefHelper;->isAppTrackingLimited()Z

    move-result v1

    if-eqz v1, :cond_1

    .line 473
    :try_start_0
    sget-object v2, Lio/branch/referral/Defines$Jsonkey;->limitFacebookTracking:Lio/branch/referral/Defines$Jsonkey;

    invoke-virtual {v2}, Lio/branch/referral/Defines$Jsonkey;->getKey()Ljava/lang/String;

    move-result-object v2

    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    invoke-virtual {v0, v2, v1}, Lorg/json/JSONObject;->putOpt(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    :cond_1
    return-void
.end method

.method private updateRequestMetadata()V
    .locals 5

    .line 439
    :try_start_0
    new-instance v0, Lorg/json/JSONObject;

    invoke-direct {v0}, Lorg/json/JSONObject;-><init>()V

    .line 440
    iget-object v1, p0, Lio/branch/referral/ServerRequest;->prefHelper_:Lio/branch/referral/PrefHelper;

    invoke-virtual {v1}, Lio/branch/referral/PrefHelper;->getRequestMetadata()Lorg/json/JSONObject;

    move-result-object v1

    invoke-virtual {v1}, Lorg/json/JSONObject;->keys()Ljava/util/Iterator;

    move-result-object v1

    .line 441
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_0

    .line 442
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    .line 443
    iget-object v3, p0, Lio/branch/referral/ServerRequest;->prefHelper_:Lio/branch/referral/PrefHelper;

    invoke-virtual {v3}, Lio/branch/referral/PrefHelper;->getRequestMetadata()Lorg/json/JSONObject;

    move-result-object v3

    invoke-virtual {v3, v2}, Lorg/json/JSONObject;->get(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v3

    invoke-virtual {v0, v2, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    goto :goto_0

    .line 445
    :cond_0
    iget-object v1, p0, Lio/branch/referral/ServerRequest;->params_:Lorg/json/JSONObject;

    sget-object v2, Lio/branch/referral/Defines$Jsonkey;->Metadata:Lio/branch/referral/Defines$Jsonkey;

    invoke-virtual {v2}, Lio/branch/referral/Defines$Jsonkey;->getKey()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v1

    if-eqz v1, :cond_1

    .line 447
    invoke-virtual {v1}, Lorg/json/JSONObject;->keys()Ljava/util/Iterator;

    move-result-object v2

    .line 448
    :goto_1
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_1

    .line 449
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    .line 451
    invoke-virtual {v1, v3}, Lorg/json/JSONObject;->get(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v4

    invoke-virtual {v0, v3, v4}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    goto :goto_1

    .line 455
    :cond_1
    instance-of v1, p0, Lio/branch/referral/ServerRequestRegisterInstall;

    if-eqz v1, :cond_2

    iget-object v1, p0, Lio/branch/referral/ServerRequest;->prefHelper_:Lio/branch/referral/PrefHelper;

    invoke-virtual {v1}, Lio/branch/referral/PrefHelper;->getInstallMetadata()Lorg/json/JSONObject;

    move-result-object v1

    invoke-virtual {v1}, Lorg/json/JSONObject;->length()I

    move-result v1

    if-lez v1, :cond_2

    .line 456
    iget-object v1, p0, Lio/branch/referral/ServerRequest;->params_:Lorg/json/JSONObject;

    sget-object v2, Lio/branch/referral/Defines$Jsonkey;->InstallMetadata:Lio/branch/referral/Defines$Jsonkey;

    invoke-virtual {v2}, Lio/branch/referral/Defines$Jsonkey;->getKey()Ljava/lang/String;

    move-result-object v2

    iget-object v3, p0, Lio/branch/referral/ServerRequest;->prefHelper_:Lio/branch/referral/PrefHelper;

    invoke-virtual {v3}, Lio/branch/referral/PrefHelper;->getInstallMetadata()Lorg/json/JSONObject;

    move-result-object v3

    invoke-virtual {v1, v2, v3}, Lorg/json/JSONObject;->putOpt(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 458
    :cond_2
    iget-object v1, p0, Lio/branch/referral/ServerRequest;->params_:Lorg/json/JSONObject;

    sget-object v2, Lio/branch/referral/Defines$Jsonkey;->Metadata:Lio/branch/referral/Defines$Jsonkey;

    invoke-virtual {v2}, Lio/branch/referral/Defines$Jsonkey;->getKey()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2, v0}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_2

    :catch_0
    const-string v0, "BranchSDK"

    const-string v1, "Could not merge metadata, ignoring user metadata."

    .line 460
    invoke-static {v0, v1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    :goto_2
    return-void
.end method


# virtual methods
.method protected addGetParam(Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    .line 280
    :try_start_0
    iget-object v0, p0, Lio/branch/referral/ServerRequest;->params_:Lorg/json/JSONObject;

    invoke-virtual {v0, p1, p2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    return-void
.end method

.method public addProcessWaitLock(Lio/branch/referral/ServerRequest$PROCESS_WAIT_LOCK;)V
    .locals 1

    if-eqz p1, :cond_0

    .line 544
    iget-object v0, p0, Lio/branch/referral/ServerRequest;->locks_:Ljava/util/Set;

    invoke-interface {v0, p1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    :cond_0
    return-void
.end method

.method public abstract clearCallbacks()V
.end method

.method doFinalUpdateOnBackgroundThread()V
    .locals 1

    .line 488
    instance-of v0, p0, Lio/branch/referral/ServerRequestInitSession;

    if-eqz v0, :cond_0

    .line 489
    move-object v0, p0

    check-cast v0, Lio/branch/referral/ServerRequestInitSession;

    invoke-virtual {v0}, Lio/branch/referral/ServerRequestInitSession;->updateLinkReferrerParams()V

    .line 493
    :cond_0
    invoke-direct {p0}, Lio/branch/referral/ServerRequest;->updateDeviceInfo()V

    .line 496
    invoke-virtual {p0}, Lio/branch/referral/ServerRequest;->isGAdsParamsRequired()Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lio/branch/referral/ServerRequest;->context_:Landroid/content/Context;

    invoke-static {v0}, Lio/branch/referral/BranchUtil;->isTestModeEnabled(Landroid/content/Context;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 497
    invoke-direct {p0}, Lio/branch/referral/ServerRequest;->updateGAdsParams()V

    :cond_1
    return-void
.end method

.method doFinalUpdateOnMainThread()V
    .locals 1

    .line 481
    invoke-direct {p0}, Lio/branch/referral/ServerRequest;->updateRequestMetadata()V

    .line 482
    invoke-virtual {p0}, Lio/branch/referral/ServerRequest;->shouldUpdateLimitFacebookTracking()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 483
    invoke-direct {p0}, Lio/branch/referral/ServerRequest;->updateLimitFacebookTracking()V

    :cond_0
    return-void
.end method

.method protected doesAppHasInternetPermission(Landroid/content/Context;)Z
    .locals 1

    const-string v0, "android.permission.INTERNET"

    .line 510
    invoke-virtual {p1, v0}, Landroid/content/Context;->checkCallingOrSelfPermission(Ljava/lang/String;)I

    move-result p1

    if-nez p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method

.method public getBranchRemoteAPIVersion()Lio/branch/referral/ServerRequest$BRANCH_API_VERSION;
    .locals 1

    .line 605
    sget-object v0, Lio/branch/referral/ServerRequest$BRANCH_API_VERSION;->V1:Lio/branch/referral/ServerRequest$BRANCH_API_VERSION;

    return-object v0
.end method

.method public getGetParams()Lorg/json/JSONObject;
    .locals 1

    .line 269
    iget-object v0, p0, Lio/branch/referral/ServerRequest;->params_:Lorg/json/JSONObject;

    return-object v0
.end method

.method public getPost()Lorg/json/JSONObject;
    .locals 1

    .line 207
    iget-object v0, p0, Lio/branch/referral/ServerRequest;->params_:Lorg/json/JSONObject;

    return-object v0
.end method

.method public getPostWithInstrumentationValues(Ljava/util/concurrent/ConcurrentHashMap;)Lorg/json/JSONObject;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/concurrent/ConcurrentHashMap<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;)",
            "Lorg/json/JSONObject;"
        }
    .end annotation

    .line 232
    new-instance v0, Lorg/json/JSONObject;

    invoke-direct {v0}, Lorg/json/JSONObject;-><init>()V

    .line 235
    :try_start_0
    iget-object v1, p0, Lio/branch/referral/ServerRequest;->params_:Lorg/json/JSONObject;

    if-eqz v1, :cond_0

    .line 236
    new-instance v1, Lorg/json/JSONObject;

    iget-object v2, p0, Lio/branch/referral/ServerRequest;->params_:Lorg/json/JSONObject;

    invoke-virtual {v2}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, v2}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    .line 237
    invoke-virtual {v1}, Lorg/json/JSONObject;->keys()Ljava/util/Iterator;

    move-result-object v2

    .line 238
    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_0

    .line 239
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    .line 240
    invoke-virtual {v1, v3}, Lorg/json/JSONObject;->get(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v4

    invoke-virtual {v0, v3, v4}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    goto :goto_0

    .line 244
    :cond_0
    invoke-virtual {p1}, Ljava/util/concurrent/ConcurrentHashMap;->size()I

    move-result v1

    if-lez v1, :cond_2

    .line 245
    new-instance v1, Lorg/json/JSONObject;

    invoke-direct {v1}, Lorg/json/JSONObject;-><init>()V

    .line 246
    invoke-virtual {p1}, Ljava/util/concurrent/ConcurrentHashMap;->keySet()Ljava/util/Set;

    move-result-object v2

    .line 248
    invoke-interface {v2}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_1
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_1

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    .line 249
    invoke-virtual {p1, v3}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    invoke-virtual {v1, v3, v4}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 250
    invoke-virtual {p1, v3}, Ljava/util/concurrent/ConcurrentHashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_1

    .line 252
    :cond_1
    sget-object p1, Lio/branch/referral/Defines$Jsonkey;->Branch_Instrumentation:Lio/branch/referral/Defines$Jsonkey;

    invoke-virtual {p1}, Lio/branch/referral/Defines$Jsonkey;->getKey()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/util/ConcurrentModificationException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_2

    .line 258
    :catch_0
    iget-object v0, p0, Lio/branch/referral/ServerRequest;->params_:Lorg/json/JSONObject;

    :catch_1
    :cond_2
    :goto_2
    return-object v0
.end method

.method public getQueueWaitTime()J
    .locals 4

    .line 528
    iget-wide v0, p0, Lio/branch/referral/ServerRequest;->queueWaitTime_:J

    const-wide/16 v2, 0x0

    cmp-long v0, v0, v2

    if-lez v0, :cond_0

    .line 529
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    iget-wide v2, p0, Lio/branch/referral/ServerRequest;->queueWaitTime_:J

    sub-long v2, v0, v2

    :cond_0
    return-wide v2
.end method

.method public final getRequestPath()Ljava/lang/String;
    .locals 1

    .line 166
    iget-object v0, p0, Lio/branch/referral/ServerRequest;->requestPath_:Ljava/lang/String;

    return-object v0
.end method

.method public getRequestUrl()Ljava/lang/String;
    .locals 2

    .line 176
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v1, p0, Lio/branch/referral/ServerRequest;->prefHelper_:Lio/branch/referral/PrefHelper;

    invoke-virtual {v1}, Lio/branch/referral/PrefHelper;->getAPIBaseUrl()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lio/branch/referral/ServerRequest;->requestPath_:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public abstract handleErrors(Landroid/content/Context;)Z
.end method

.method public abstract handleFailure(ILjava/lang/String;)V
.end method

.method public isGAdsParamsRequired()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public abstract isGetRequest()Z
.end method

.method isPersistable()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method public isWaitingOnProcessToFinish()Z
    .locals 1

    .line 564
    iget-object v0, p0, Lio/branch/referral/ServerRequest;->locks_:Ljava/util/Set;

    invoke-interface {v0}, Ljava/util/Set;->size()I

    move-result v0

    if-lez v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public onPreExecute()V
    .locals 0

    return-void
.end method

.method public onRequestQueued()V
    .locals 2

    .line 518
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    iput-wide v0, p0, Lio/branch/referral/ServerRequest;->queueWaitTime_:J

    return-void
.end method

.method public abstract onRequestSucceeded(Lio/branch/referral/ServerResponse;Lio/branch/referral/Branch;)V
.end method

.method protected prepareExecuteWithoutTracking()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public removeProcessWaitLock(Lio/branch/referral/ServerRequest$PROCESS_WAIT_LOCK;)V
    .locals 1

    .line 554
    iget-object v0, p0, Lio/branch/referral/ServerRequest;->locks_:Ljava/util/Set;

    invoke-interface {v0, p1}, Ljava/util/Set;->remove(Ljava/lang/Object;)Z

    return-void
.end method

.method public reportTrackingDisabledError()V
    .locals 3

    const-string v0, "BranchSDK"

    .line 609
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Requested operation cannot be completed since tracking is disabled ["

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, p0, Lio/branch/referral/ServerRequest;->requestPath_:Ljava/lang/String;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, "]"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lio/branch/referral/PrefHelper;->Debug(Ljava/lang/String;Ljava/lang/String;)V

    const-string v0, ""

    const/16 v1, -0x75

    .line 610
    invoke-virtual {p0, v1, v0}, Lio/branch/referral/ServerRequest;->handleFailure(ILjava/lang/String;)V

    return-void
.end method

.method protected setPost(Lorg/json/JSONObject;)V
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/json/JSONException;
        }
    .end annotation

    .line 186
    iput-object p1, p0, Lio/branch/referral/ServerRequest;->params_:Lorg/json/JSONObject;

    .line 187
    invoke-virtual {p0}, Lio/branch/referral/ServerRequest;->getBranchRemoteAPIVersion()Lio/branch/referral/ServerRequest$BRANCH_API_VERSION;

    move-result-object p1

    sget-object v0, Lio/branch/referral/ServerRequest$BRANCH_API_VERSION;->V2:Lio/branch/referral/ServerRequest$BRANCH_API_VERSION;

    if-ne p1, v0, :cond_0

    .line 189
    :try_start_0
    new-instance p1, Lorg/json/JSONObject;

    invoke-direct {p1}, Lorg/json/JSONObject;-><init>()V

    .line 190
    iget-object v0, p0, Lio/branch/referral/ServerRequest;->params_:Lorg/json/JSONObject;

    sget-object v1, Lio/branch/referral/Defines$Jsonkey;->UserData:Lio/branch/referral/Defines$Jsonkey;

    invoke-virtual {v1}, Lio/branch/referral/Defines$Jsonkey;->getKey()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1, p1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 191
    iget-object v0, p0, Lio/branch/referral/ServerRequest;->prefHelper_:Lio/branch/referral/PrefHelper;

    invoke-virtual {v0}, Lio/branch/referral/PrefHelper;->getExternDebug()Z

    move-result v0

    iget-object v1, p0, Lio/branch/referral/ServerRequest;->systemObserver_:Lio/branch/referral/SystemObserver;

    iget-boolean v2, p0, Lio/branch/referral/ServerRequest;->disableAndroidIDFetch_:Z

    invoke-static {v0, v1, v2}, Lio/branch/referral/DeviceInfo;->getInstance(ZLio/branch/referral/SystemObserver;Z)Lio/branch/referral/DeviceInfo;

    move-result-object v0

    iget-object v1, p0, Lio/branch/referral/ServerRequest;->context_:Landroid/content/Context;

    iget-object v2, p0, Lio/branch/referral/ServerRequest;->prefHelper_:Lio/branch/referral/PrefHelper;

    invoke-virtual {v0, v1, v2, p1}, Lio/branch/referral/DeviceInfo;->updateRequestWithUserData(Landroid/content/Context;Lio/branch/referral/PrefHelper;Lorg/json/JSONObject;)V
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    .line 195
    :cond_0
    iget-object p1, p0, Lio/branch/referral/ServerRequest;->prefHelper_:Lio/branch/referral/PrefHelper;

    invoke-virtual {p1}, Lio/branch/referral/PrefHelper;->getExternDebug()Z

    move-result p1

    iget-object v0, p0, Lio/branch/referral/ServerRequest;->systemObserver_:Lio/branch/referral/SystemObserver;

    iget-boolean v1, p0, Lio/branch/referral/ServerRequest;->disableAndroidIDFetch_:Z

    invoke-static {p1, v0, v1}, Lio/branch/referral/DeviceInfo;->getInstance(ZLio/branch/referral/SystemObserver;Z)Lio/branch/referral/DeviceInfo;

    move-result-object p1

    iget-object v0, p0, Lio/branch/referral/ServerRequest;->params_:Lorg/json/JSONObject;

    invoke-virtual {p1, v0}, Lio/branch/referral/DeviceInfo;->updateRequestWithDeviceParams(Lorg/json/JSONObject;)V

    :catch_0
    :goto_0
    return-void
.end method

.method public shouldRetryOnFail()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method protected shouldUpdateLimitFacebookTracking()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public toJSON()Lorg/json/JSONObject;
    .locals 3

    .line 294
    new-instance v0, Lorg/json/JSONObject;

    invoke-direct {v0}, Lorg/json/JSONObject;-><init>()V

    :try_start_0
    const-string v1, "REQ_POST"

    .line 296
    iget-object v2, p0, Lio/branch/referral/ServerRequest;->params_:Lorg/json/JSONObject;

    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    const-string v1, "REQ_POST_PATH"

    .line 297
    iget-object v2, p0, Lio/branch/referral/ServerRequest;->requestPath_:Ljava/lang/String;

    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    return-object v0

    :catch_0
    const/4 v0, 0x0

    return-object v0
.end method

.method protected updateEnvironment(Landroid/content/Context;Lorg/json/JSONObject;)V
    .locals 2

    .line 576
    :try_start_0
    invoke-static {p1}, Lio/branch/referral/ServerRequest;->isPackageInstalled(Landroid/content/Context;)Z

    move-result p1

    if-eqz p1, :cond_0

    sget-object p1, Lio/branch/referral/Defines$Jsonkey;->NativeApp:Lio/branch/referral/Defines$Jsonkey;

    :goto_0
    invoke-virtual {p1}, Lio/branch/referral/Defines$Jsonkey;->getKey()Ljava/lang/String;

    move-result-object p1

    goto :goto_1

    :cond_0
    sget-object p1, Lio/branch/referral/Defines$Jsonkey;->InstantApp:Lio/branch/referral/Defines$Jsonkey;

    goto :goto_0

    .line 577
    :goto_1
    invoke-virtual {p0}, Lio/branch/referral/ServerRequest;->getBranchRemoteAPIVersion()Lio/branch/referral/ServerRequest$BRANCH_API_VERSION;

    move-result-object v0

    sget-object v1, Lio/branch/referral/ServerRequest$BRANCH_API_VERSION;->V2:Lio/branch/referral/ServerRequest$BRANCH_API_VERSION;

    if-ne v0, v1, :cond_1

    .line 578
    sget-object v0, Lio/branch/referral/Defines$Jsonkey;->UserData:Lio/branch/referral/Defines$Jsonkey;

    invoke-virtual {v0}, Lio/branch/referral/Defines$Jsonkey;->getKey()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p2, v0}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object p2

    if-eqz p2, :cond_2

    .line 580
    sget-object v0, Lio/branch/referral/Defines$Jsonkey;->Environment:Lio/branch/referral/Defines$Jsonkey;

    invoke-virtual {v0}, Lio/branch/referral/Defines$Jsonkey;->getKey()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p2, v0, p1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    goto :goto_2

    .line 583
    :cond_1
    sget-object v0, Lio/branch/referral/Defines$Jsonkey;->Environment:Lio/branch/referral/Defines$Jsonkey;

    invoke-virtual {v0}, Lio/branch/referral/Defines$Jsonkey;->getKey()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p2, v0, p1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    :cond_2
    :goto_2
    return-void
.end method
