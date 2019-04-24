.class final Lio/radar/sdk/Radar$UserOptions;
.super Ljava/lang/Object;
.source "Radar.kt"


# annotations
.annotation build Lcom/newrelic/agent/android/instrumentation/Instrumented;
.end annotation

.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lio/radar/sdk/Radar;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1a
    name = "UserOptions"
.end annotation

.annotation runtime Lkotlin/Metadata;
    bv = {
        0x1,
        0x0,
        0x2
    }
    d1 = {
        "\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0010\u000e\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\t\u0008\u0002\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002R(\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0008\u0010\u0003\u001a\u0004\u0018\u00010\u00048F@FX\u0086\u000e\u00a2\u0006\u000c\u001a\u0004\u0008\u0006\u0010\u0007\"\u0004\u0008\u0008\u0010\tR(\u0010\u000b\u001a\u0004\u0018\u00010\n2\u0008\u0010\u0003\u001a\u0004\u0018\u00010\n8F@FX\u0086\u000e\u00a2\u0006\u000c\u001a\u0004\u0008\u000c\u0010\r\"\u0004\u0008\u000e\u0010\u000fR(\u0010\u0010\u001a\u0004\u0018\u00010\u00042\u0008\u0010\u0003\u001a\u0004\u0018\u00010\u00048F@FX\u0086\u000e\u00a2\u0006\u000c\u001a\u0004\u0008\u0011\u0010\u0007\"\u0004\u0008\u0012\u0010\t\u00a8\u0006\u0013"
    }
    d2 = {
        "Lio/radar/sdk/Radar$UserOptions;",
        "",
        "()V",
        "value",
        "",
        "description",
        "getDescription",
        "()Ljava/lang/String;",
        "setDescription",
        "(Ljava/lang/String;)V",
        "Lorg/json/JSONObject;",
        "metadata",
        "getMetadata",
        "()Lorg/json/JSONObject;",
        "setMetadata",
        "(Lorg/json/JSONObject;)V",
        "userId",
        "getUserId",
        "setUserId",
        "sdk_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x1,
        0xb
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 148
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final setUserId(Ljava/lang/String;)V
    .locals 2
    .param p1    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    .line 151
    sget-object v0, Lio/radar/sdk/Radar;->INSTANCE:Lio/radar/sdk/Radar;

    invoke-static {v0}, Lio/radar/sdk/Radar;->access$getIdentityRepository$p(Lio/radar/sdk/Radar;)Lio/radar/sdk/internal/repository/IdentityRepository;

    move-result-object v0

    invoke-virtual {v0}, Lio/radar/sdk/internal/repository/IdentityRepository;->getUserId$sdk_release()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 152
    invoke-static {v0, p1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    xor-int/lit8 v0, v0, 0x1

    if-eqz v0, :cond_1

    .line 153
    :cond_0
    sget-object v0, Lio/radar/sdk/Radar;->INSTANCE:Lio/radar/sdk/Radar;

    invoke-static {v0}, Lio/radar/sdk/Radar;->access$getIdentityRepository$p(Lio/radar/sdk/Radar;)Lio/radar/sdk/internal/repository/IdentityRepository;

    move-result-object v0

    const/4 v1, 0x0

    check-cast v1, Ljava/lang/String;

    invoke-virtual {v0, v1}, Lio/radar/sdk/internal/repository/IdentityRepository;->setRadarId$sdk_release(Ljava/lang/String;)V

    .line 155
    :cond_1
    sget-object v0, Lio/radar/sdk/Radar;->INSTANCE:Lio/radar/sdk/Radar;

    invoke-static {v0}, Lio/radar/sdk/Radar;->access$getIdentityRepository$p(Lio/radar/sdk/Radar;)Lio/radar/sdk/internal/repository/IdentityRepository;

    move-result-object v0

    invoke-virtual {v0, p1}, Lio/radar/sdk/internal/repository/IdentityRepository;->setUserId$sdk_release(Ljava/lang/String;)V

    return-void
.end method
