.class public Lme/pushy/sdk/model/api/PushyAuthRequest;
.super Ljava/lang/Object;


# instance fields
.field public auth:Ljava/lang/String;

.field public sdk:I

.field public token:Ljava/lang/String;


# direct methods
.method public constructor <init>(Lme/pushy/sdk/model/PushyDeviceCredentials;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iget-object v0, p1, Lme/pushy/sdk/model/PushyDeviceCredentials;->authKey:Ljava/lang/String;

    iput-object v0, p0, Lme/pushy/sdk/model/api/PushyAuthRequest;->auth:Ljava/lang/String;

    iget-object p1, p1, Lme/pushy/sdk/model/PushyDeviceCredentials;->token:Ljava/lang/String;

    iput-object p1, p0, Lme/pushy/sdk/model/api/PushyAuthRequest;->token:Ljava/lang/String;

    const/16 p1, 0x404

    iput p1, p0, Lme/pushy/sdk/model/api/PushyAuthRequest;->sdk:I

    return-void
.end method
