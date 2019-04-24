.class public Lcom/launchdarkly/android/response/UserFlagResponse;
.super Ljava/lang/Object;
.source "UserFlagResponse.java"

# interfaces
.implements Lcom/launchdarkly/android/response/FlagResponse;


# instance fields
.field private final debugEventsUntilDate:Ljava/lang/Long;
    .annotation build Landroid/support/annotation/Nullable;
    .end annotation
.end field

.field private final flagVersion:I

.field private final key:Ljava/lang/String;
    .annotation build Landroid/support/annotation/NonNull;
    .end annotation
.end field

.field private final trackEvents:Ljava/lang/Boolean;
    .annotation build Landroid/support/annotation/Nullable;
    .end annotation
.end field

.field private final value:Lcom/google/gson/JsonElement;
    .annotation build Landroid/support/annotation/Nullable;
    .end annotation
.end field

.field private final variation:Ljava/lang/Integer;
    .annotation build Landroid/support/annotation/Nullable;
    .end annotation
.end field

.field private final version:I


# direct methods
.method public constructor <init>(Ljava/lang/String;Lcom/google/gson/JsonElement;)V
    .locals 8

    const/4 v3, -0x1

    const/4 v4, -0x1

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    .line 46
    invoke-direct/range {v0 .. v7}, Lcom/launchdarkly/android/response/UserFlagResponse;-><init>(Ljava/lang/String;Lcom/google/gson/JsonElement;IILjava/lang/Integer;Ljava/lang/Boolean;Ljava/lang/Long;)V

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Lcom/google/gson/JsonElement;II)V
    .locals 8

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move v3, p3

    move v4, p4

    .line 50
    invoke-direct/range {v0 .. v7}, Lcom/launchdarkly/android/response/UserFlagResponse;-><init>(Ljava/lang/String;Lcom/google/gson/JsonElement;IILjava/lang/Integer;Ljava/lang/Boolean;Ljava/lang/Long;)V

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Lcom/google/gson/JsonElement;IILjava/lang/Integer;Ljava/lang/Boolean;Ljava/lang/Long;)V
    .locals 0
    .param p1    # Ljava/lang/String;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .param p2    # Lcom/google/gson/JsonElement;
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param
    .param p5    # Ljava/lang/Integer;
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param
    .param p6    # Ljava/lang/Boolean;
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param
    .param p7    # Ljava/lang/Long;
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param

    .line 35
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 36
    iput-object p1, p0, Lcom/launchdarkly/android/response/UserFlagResponse;->key:Ljava/lang/String;

    .line 37
    iput-object p2, p0, Lcom/launchdarkly/android/response/UserFlagResponse;->value:Lcom/google/gson/JsonElement;

    .line 38
    iput p3, p0, Lcom/launchdarkly/android/response/UserFlagResponse;->version:I

    .line 39
    iput p4, p0, Lcom/launchdarkly/android/response/UserFlagResponse;->flagVersion:I

    .line 40
    iput-object p5, p0, Lcom/launchdarkly/android/response/UserFlagResponse;->variation:Ljava/lang/Integer;

    .line 41
    iput-object p6, p0, Lcom/launchdarkly/android/response/UserFlagResponse;->trackEvents:Ljava/lang/Boolean;

    .line 42
    iput-object p7, p0, Lcom/launchdarkly/android/response/UserFlagResponse;->debugEventsUntilDate:Ljava/lang/Long;

    return-void
.end method


# virtual methods
.method public getAsJsonObject()Lcom/google/gson/JsonObject;
    .locals 4

    .line 95
    new-instance v0, Lcom/google/gson/JsonObject;

    invoke-direct {v0}, Lcom/google/gson/JsonObject;-><init>()V

    const-string v1, "version"

    .line 96
    new-instance v2, Lcom/google/gson/JsonPrimitive;

    iget v3, p0, Lcom/launchdarkly/android/response/UserFlagResponse;->version:I

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-direct {v2, v3}, Lcom/google/gson/JsonPrimitive;-><init>(Ljava/lang/Number;)V

    invoke-virtual {v0, v1, v2}, Lcom/google/gson/JsonObject;->add(Ljava/lang/String;Lcom/google/gson/JsonElement;)V

    const-string v1, "flagVersion"

    .line 97
    new-instance v2, Lcom/google/gson/JsonPrimitive;

    iget v3, p0, Lcom/launchdarkly/android/response/UserFlagResponse;->flagVersion:I

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-direct {v2, v3}, Lcom/google/gson/JsonPrimitive;-><init>(Ljava/lang/Number;)V

    invoke-virtual {v0, v1, v2}, Lcom/google/gson/JsonObject;->add(Ljava/lang/String;Lcom/google/gson/JsonElement;)V

    const-string v1, "variation"

    .line 98
    iget-object v2, p0, Lcom/launchdarkly/android/response/UserFlagResponse;->variation:Ljava/lang/Integer;

    if-nez v2, :cond_0

    sget-object v2, Lcom/google/gson/JsonNull;->INSTANCE:Lcom/google/gson/JsonNull;

    goto :goto_0

    :cond_0
    new-instance v3, Lcom/google/gson/JsonPrimitive;

    invoke-direct {v3, v2}, Lcom/google/gson/JsonPrimitive;-><init>(Ljava/lang/Number;)V

    move-object v2, v3

    :goto_0
    invoke-virtual {v0, v1, v2}, Lcom/google/gson/JsonObject;->add(Ljava/lang/String;Lcom/google/gson/JsonElement;)V

    const-string v1, "trackEvents"

    .line 99
    iget-object v2, p0, Lcom/launchdarkly/android/response/UserFlagResponse;->trackEvents:Ljava/lang/Boolean;

    if-nez v2, :cond_1

    sget-object v2, Lcom/google/gson/JsonNull;->INSTANCE:Lcom/google/gson/JsonNull;

    goto :goto_1

    :cond_1
    new-instance v3, Lcom/google/gson/JsonPrimitive;

    invoke-direct {v3, v2}, Lcom/google/gson/JsonPrimitive;-><init>(Ljava/lang/Boolean;)V

    move-object v2, v3

    :goto_1
    invoke-virtual {v0, v1, v2}, Lcom/google/gson/JsonObject;->add(Ljava/lang/String;Lcom/google/gson/JsonElement;)V

    const-string v1, "debugEventsUntilDate"

    .line 100
    iget-object v2, p0, Lcom/launchdarkly/android/response/UserFlagResponse;->debugEventsUntilDate:Ljava/lang/Long;

    if-nez v2, :cond_2

    sget-object v2, Lcom/google/gson/JsonNull;->INSTANCE:Lcom/google/gson/JsonNull;

    goto :goto_2

    :cond_2
    new-instance v3, Lcom/google/gson/JsonPrimitive;

    invoke-direct {v3, v2}, Lcom/google/gson/JsonPrimitive;-><init>(Ljava/lang/Number;)V

    move-object v2, v3

    :goto_2
    invoke-virtual {v0, v1, v2}, Lcom/google/gson/JsonObject;->add(Ljava/lang/String;Lcom/google/gson/JsonElement;)V

    return-object v0
.end method

.method public getDebugEventsUntilDate()Ljava/lang/Long;
    .locals 1
    .annotation build Landroid/support/annotation/Nullable;
    .end annotation

    .line 90
    iget-object v0, p0, Lcom/launchdarkly/android/response/UserFlagResponse;->debugEventsUntilDate:Ljava/lang/Long;

    return-object v0
.end method

.method public getFlagVersion()I
    .locals 1

    .line 72
    iget v0, p0, Lcom/launchdarkly/android/response/UserFlagResponse;->flagVersion:I

    return v0
.end method

.method public getKey()Ljava/lang/String;
    .locals 1
    .annotation build Landroid/support/annotation/NonNull;
    .end annotation

    .line 56
    iget-object v0, p0, Lcom/launchdarkly/android/response/UserFlagResponse;->key:Ljava/lang/String;

    return-object v0
.end method

.method public getTrackEvents()Ljava/lang/Boolean;
    .locals 1
    .annotation build Landroid/support/annotation/Nullable;
    .end annotation

    .line 84
    iget-object v0, p0, Lcom/launchdarkly/android/response/UserFlagResponse;->trackEvents:Ljava/lang/Boolean;

    return-object v0
.end method

.method public getValue()Lcom/google/gson/JsonElement;
    .locals 1
    .annotation build Landroid/support/annotation/Nullable;
    .end annotation

    .line 62
    iget-object v0, p0, Lcom/launchdarkly/android/response/UserFlagResponse;->value:Lcom/google/gson/JsonElement;

    return-object v0
.end method

.method public getVariation()Ljava/lang/Integer;
    .locals 1
    .annotation build Landroid/support/annotation/Nullable;
    .end annotation

    .line 78
    iget-object v0, p0, Lcom/launchdarkly/android/response/UserFlagResponse;->variation:Ljava/lang/Integer;

    return-object v0
.end method

.method public getVersion()I
    .locals 1

    .line 67
    iget v0, p0, Lcom/launchdarkly/android/response/UserFlagResponse;->version:I

    return v0
.end method

.method public isVersionMissing()Z
    .locals 2

    .line 106
    iget v0, p0, Lcom/launchdarkly/android/response/UserFlagResponse;->version:I

    const/4 v1, -0x1

    if-ne v0, v1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method
