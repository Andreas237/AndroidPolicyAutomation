.class public Lme/pushy/sdk/model/api/PushyRegistrationResponse;
.super Ljava/lang/Object;


# instance fields
.field public auth:Ljava/lang/String;
    .annotation runtime Lme/pushy/sdk/lib/jackson/annotation/JsonProperty;
        value = "auth"
    .end annotation
.end field

.field public error:Ljava/lang/String;
    .annotation runtime Lme/pushy/sdk/lib/jackson/annotation/JsonProperty;
        value = "error"
    .end annotation
.end field

.field public token:Ljava/lang/String;
    .annotation runtime Lme/pushy/sdk/lib/jackson/annotation/JsonProperty;
        value = "token"
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method
