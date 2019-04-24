.class public Lme/pushy/sdk/model/api/PushyAuthResponse;
.super Ljava/lang/Object;


# instance fields
.field public error:Ljava/lang/String;
    .annotation runtime Lme/pushy/sdk/lib/jackson/annotation/JsonProperty;
        value = "error"
    .end annotation
.end field

.field public success:Z
    .annotation runtime Lme/pushy/sdk/lib/jackson/annotation/JsonProperty;
        value = "success"
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method
