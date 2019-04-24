.class public Lme/pushy/sdk/model/api/PushyRegistrationRequest;
.super Ljava/lang/Object;


# instance fields
.field public app:Ljava/lang/String;

.field public platform:Ljava/lang/String;

.field public sdk:I


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-string v0, "unknown"

    iput-object v0, p0, Lme/pushy/sdk/model/api/PushyRegistrationRequest;->app:Ljava/lang/String;

    const-string v0, "android"

    iput-object v0, p0, Lme/pushy/sdk/model/api/PushyRegistrationRequest;->platform:Ljava/lang/String;

    const/16 v0, 0x404

    iput v0, p0, Lme/pushy/sdk/model/api/PushyRegistrationRequest;->sdk:I

    return-void
.end method
