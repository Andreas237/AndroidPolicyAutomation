.class public Lme/pushy/sdk/model/api/PushyPubSubRequest;
.super Ljava/lang/Object;


# instance fields
.field public auth:Ljava/lang/String;

.field public token:Ljava/lang/String;

.field public topics:[Ljava/lang/String;


# direct methods
.method public constructor <init>([Ljava/lang/String;Lme/pushy/sdk/model/PushyDeviceCredentials;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lme/pushy/sdk/model/api/PushyPubSubRequest;->topics:[Ljava/lang/String;

    iget-object p1, p2, Lme/pushy/sdk/model/PushyDeviceCredentials;->authKey:Ljava/lang/String;

    iput-object p1, p0, Lme/pushy/sdk/model/api/PushyPubSubRequest;->auth:Ljava/lang/String;

    iget-object p1, p2, Lme/pushy/sdk/model/PushyDeviceCredentials;->token:Ljava/lang/String;

    iput-object p1, p0, Lme/pushy/sdk/model/api/PushyPubSubRequest;->token:Ljava/lang/String;

    return-void
.end method
