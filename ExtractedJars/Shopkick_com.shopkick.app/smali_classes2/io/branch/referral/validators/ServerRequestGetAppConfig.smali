.class Lio/branch/referral/validators/ServerRequestGetAppConfig;
.super Lio/branch/referral/ServerRequest;
.source "ServerRequestGetAppConfig.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lio/branch/referral/validators/ServerRequestGetAppConfig$IGetAppConfigEvents;
    }
.end annotation


# instance fields
.field private final callback:Lio/branch/referral/validators/ServerRequestGetAppConfig$IGetAppConfigEvents;


# direct methods
.method public constructor <init>(Landroid/content/Context;Lio/branch/referral/validators/ServerRequestGetAppConfig$IGetAppConfigEvents;)V
    .locals 1

    const-string v0, ""

    .line 16
    invoke-direct {p0, p1, v0}, Lio/branch/referral/ServerRequest;-><init>(Landroid/content/Context;Ljava/lang/String;)V

    .line 17
    iput-object p2, p0, Lio/branch/referral/validators/ServerRequestGetAppConfig;->callback:Lio/branch/referral/validators/ServerRequestGetAppConfig$IGetAppConfigEvents;

    return-void
.end method


# virtual methods
.method public clearCallbacks()V
    .locals 0

    return-void
.end method

.method public getRequestUrl()Ljava/lang/String;
    .locals 2

    .line 46
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v1, p0, Lio/branch/referral/validators/ServerRequestGetAppConfig;->prefHelper_:Lio/branch/referral/PrefHelper;

    invoke-virtual {v1}, Lio/branch/referral/PrefHelper;->getAPIBaseUrl()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    sget-object v1, Lio/branch/referral/Defines$RequestPath;->GetApp:Lio/branch/referral/Defines$RequestPath;

    invoke-virtual {v1}, Lio/branch/referral/Defines$RequestPath;->getPath()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "/"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lio/branch/referral/validators/ServerRequestGetAppConfig;->prefHelper_:Lio/branch/referral/PrefHelper;

    invoke-virtual {v1}, Lio/branch/referral/PrefHelper;->getBranchKey()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public handleErrors(Landroid/content/Context;)Z
    .locals 0

    const/4 p1, 0x0

    return p1
.end method

.method public handleFailure(ILjava/lang/String;)V
    .locals 0

    .line 34
    iget-object p1, p0, Lio/branch/referral/validators/ServerRequestGetAppConfig;->callback:Lio/branch/referral/validators/ServerRequestGetAppConfig$IGetAppConfigEvents;

    if-eqz p1, :cond_0

    const/4 p2, 0x0

    .line 35
    invoke-interface {p1, p2}, Lio/branch/referral/validators/ServerRequestGetAppConfig$IGetAppConfigEvents;->onAppConfigAvailable(Lorg/json/JSONObject;)V

    :cond_0
    return-void
.end method

.method public isGetRequest()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method public onRequestSucceeded(Lio/branch/referral/ServerResponse;Lio/branch/referral/Branch;)V
    .locals 0

    .line 27
    iget-object p2, p0, Lio/branch/referral/validators/ServerRequestGetAppConfig;->callback:Lio/branch/referral/validators/ServerRequestGetAppConfig$IGetAppConfigEvents;

    if-eqz p2, :cond_0

    .line 28
    invoke-virtual {p1}, Lio/branch/referral/ServerResponse;->getObject()Lorg/json/JSONObject;

    move-result-object p1

    invoke-interface {p2, p1}, Lio/branch/referral/validators/ServerRequestGetAppConfig$IGetAppConfigEvents;->onAppConfigAvailable(Lorg/json/JSONObject;)V

    :cond_0
    return-void
.end method
