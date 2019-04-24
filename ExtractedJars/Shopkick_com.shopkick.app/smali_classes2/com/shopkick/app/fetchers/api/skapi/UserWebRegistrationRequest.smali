.class public Lcom/shopkick/app/fetchers/api/skapi/UserWebRegistrationRequest;
.super Lcom/shopkick/app/fetchers/api/IAPIObject;
.source "UserWebRegistrationRequest.java"

# interfaces
.implements Lcom/shopkick/app/fetchers/api/PostProcessable;


# instance fields
.field public accuracy:Ljava/lang/Double;

.field public inviteMetadata:Lcom/shopkick/app/fetchers/api/skapi/YozioInviteMetadata;

.field public lat:Ljava/lang/Double;

.field public lng:Ljava/lang/Double;

.field public webRegistrationId:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 23
    invoke-direct {p0}, Lcom/shopkick/app/fetchers/api/IAPIObject;-><init>()V

    return-void
.end method

.method public static fromJson(Ljava/lang/String;Z)Lcom/shopkick/app/fetchers/api/skapi/UserWebRegistrationRequest;
    .locals 2

    .line 37
    :try_start_0
    sget-object v0, Lcom/shopkick/app/util/GsonUtils;->gson:Lcom/google/gson/Gson;

    const-class v1, Lcom/shopkick/app/fetchers/api/skapi/UserWebRegistrationRequest;

    invoke-virtual {v0, p0, v1}, Lcom/google/gson/Gson;->fromJson(Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/shopkick/app/fetchers/api/skapi/UserWebRegistrationRequest;

    if-eqz p1, :cond_0

    .line 38
    invoke-virtual {p0}, Lcom/shopkick/app/fetchers/api/skapi/UserWebRegistrationRequest;->postProcess()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    :cond_0
    return-object p0

    :catch_0
    move-exception p0

    .line 41
    invoke-virtual {p0}, Ljava/lang/Exception;->printStackTrace()V

    const/4 p0, 0x0

    return-object p0
.end method


# virtual methods
.method public bridge synthetic cloneObject(Z)Lcom/shopkick/app/fetchers/api/IAPIObject;
    .locals 0

    .line 23
    invoke-virtual {p0, p1}, Lcom/shopkick/app/fetchers/api/skapi/UserWebRegistrationRequest;->cloneObject(Z)Lcom/shopkick/app/fetchers/api/skapi/UserWebRegistrationRequest;

    move-result-object p1

    return-object p1
.end method

.method public cloneObject(Z)Lcom/shopkick/app/fetchers/api/skapi/UserWebRegistrationRequest;
    .locals 1

    .line 32
    invoke-virtual {p0}, Lcom/shopkick/app/fetchers/api/skapi/UserWebRegistrationRequest;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0, p1}, Lcom/shopkick/app/fetchers/api/skapi/UserWebRegistrationRequest;->fromJson(Ljava/lang/String;Z)Lcom/shopkick/app/fetchers/api/skapi/UserWebRegistrationRequest;

    move-result-object p1

    return-object p1
.end method

.method public postProcess()V
    .locals 1

    .line 48
    iget-object v0, p0, Lcom/shopkick/app/fetchers/api/skapi/UserWebRegistrationRequest;->inviteMetadata:Lcom/shopkick/app/fetchers/api/skapi/YozioInviteMetadata;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lcom/shopkick/app/fetchers/api/skapi/YozioInviteMetadata;->postProcess()V

    :cond_0
    return-void
.end method
