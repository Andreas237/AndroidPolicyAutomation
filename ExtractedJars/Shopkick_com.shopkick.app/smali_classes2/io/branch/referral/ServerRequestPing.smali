.class public Lio/branch/referral/ServerRequestPing;
.super Lio/branch/referral/ServerRequest;
.source "ServerRequestPing.java"


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    const/4 v0, 0x0

    .line 20
    invoke-direct {p0, p1, v0}, Lio/branch/referral/ServerRequest;-><init>(Landroid/content/Context;Ljava/lang/String;)V

    return-void
.end method


# virtual methods
.method public clearCallbacks()V
    .locals 0

    return-void
.end method

.method public handleErrors(Landroid/content/Context;)Z
    .locals 1

    .line 25
    invoke-super {p0, p1}, Lio/branch/referral/ServerRequest;->doesAppHasInternetPermission(Landroid/content/Context;)Z

    move-result p1

    if-nez p1, :cond_0

    const-string p1, "BranchSDK"

    const-string v0, "Trouble executing your request. Please add \'android.permission.INTERNET\' in your applications manifest file"

    .line 26
    invoke-static {p1, v0}, Lio/branch/referral/PrefHelper;->Debug(Ljava/lang/String;Ljava/lang/String;)V

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method public handleFailure(ILjava/lang/String;)V
    .locals 0

    return-void
.end method

.method public isGetRequest()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public onRequestSucceeded(Lio/branch/referral/ServerResponse;Lio/branch/referral/Branch;)V
    .locals 0

    return-void
.end method
