.class final Lcom/ibotta/android/state/app/config/tracking/AutoValue_TrackingClientsConfig;
.super Lcom/ibotta/android/state/app/config/tracking/TrackingClientsConfig;
.source "AutoValue_TrackingClientsConfig.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/ibotta/android/state/app/config/tracking/AutoValue_TrackingClientsConfig$Builder;
    }
.end annotation


# instance fields
.field private final ibottaTrackingEnabled:Z

.field private final ibottaTrackingFakeEvents:Z

.field private final ibottaV1MappingEnabled:Z

.field private final ibottaV1TrackingEnabled:Z

.field private final ibottaV1TrackingFakeEvents:Z


# direct methods
.method private constructor <init>(ZZZZZ)V
    .locals 0

    .line 21
    invoke-direct {p0}, Lcom/ibotta/android/state/app/config/tracking/TrackingClientsConfig;-><init>()V

    .line 22
    iput-boolean p1, p0, Lcom/ibotta/android/state/app/config/tracking/AutoValue_TrackingClientsConfig;->ibottaTrackingEnabled:Z

    .line 23
    iput-boolean p2, p0, Lcom/ibotta/android/state/app/config/tracking/AutoValue_TrackingClientsConfig;->ibottaTrackingFakeEvents:Z

    .line 24
    iput-boolean p3, p0, Lcom/ibotta/android/state/app/config/tracking/AutoValue_TrackingClientsConfig;->ibottaV1MappingEnabled:Z

    .line 25
    iput-boolean p4, p0, Lcom/ibotta/android/state/app/config/tracking/AutoValue_TrackingClientsConfig;->ibottaV1TrackingEnabled:Z

    .line 26
    iput-boolean p5, p0, Lcom/ibotta/android/state/app/config/tracking/AutoValue_TrackingClientsConfig;->ibottaV1TrackingFakeEvents:Z

    return-void
.end method

.method synthetic constructor <init>(ZZZZZLcom/ibotta/android/state/app/config/tracking/AutoValue_TrackingClientsConfig$1;)V
    .locals 0

    .line 8
    invoke-direct/range {p0 .. p5}, Lcom/ibotta/android/state/app/config/tracking/AutoValue_TrackingClientsConfig;-><init>(ZZZZZ)V

    return-void
.end method


# virtual methods
.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p1, p0, :cond_0

    return v0

    .line 75
    :cond_0
    instance-of v1, p1, Lcom/ibotta/android/state/app/config/tracking/TrackingClientsConfig;

    const/4 v2, 0x0

    if-eqz v1, :cond_2

    .line 76
    check-cast p1, Lcom/ibotta/android/state/app/config/tracking/TrackingClientsConfig;

    .line 77
    iget-boolean v1, p0, Lcom/ibotta/android/state/app/config/tracking/AutoValue_TrackingClientsConfig;->ibottaTrackingEnabled:Z

    invoke-virtual {p1}, Lcom/ibotta/android/state/app/config/tracking/TrackingClientsConfig;->isIbottaTrackingEnabled()Z

    move-result v3

    if-ne v1, v3, :cond_1

    iget-boolean v1, p0, Lcom/ibotta/android/state/app/config/tracking/AutoValue_TrackingClientsConfig;->ibottaTrackingFakeEvents:Z

    .line 78
    invoke-virtual {p1}, Lcom/ibotta/android/state/app/config/tracking/TrackingClientsConfig;->isIbottaTrackingFakeEvents()Z

    move-result v3

    if-ne v1, v3, :cond_1

    iget-boolean v1, p0, Lcom/ibotta/android/state/app/config/tracking/AutoValue_TrackingClientsConfig;->ibottaV1MappingEnabled:Z

    .line 79
    invoke-virtual {p1}, Lcom/ibotta/android/state/app/config/tracking/TrackingClientsConfig;->isIbottaV1MappingEnabled()Z

    move-result v3

    if-ne v1, v3, :cond_1

    iget-boolean v1, p0, Lcom/ibotta/android/state/app/config/tracking/AutoValue_TrackingClientsConfig;->ibottaV1TrackingEnabled:Z

    .line 80
    invoke-virtual {p1}, Lcom/ibotta/android/state/app/config/tracking/TrackingClientsConfig;->isIbottaV1TrackingEnabled()Z

    move-result v3

    if-ne v1, v3, :cond_1

    iget-boolean v1, p0, Lcom/ibotta/android/state/app/config/tracking/AutoValue_TrackingClientsConfig;->ibottaV1TrackingFakeEvents:Z

    .line 81
    invoke-virtual {p1}, Lcom/ibotta/android/state/app/config/tracking/TrackingClientsConfig;->isIbottaV1TrackingFakeEvents()Z

    move-result p1

    if-ne v1, p1, :cond_1

    goto :goto_0

    :cond_1
    const/4 v0, 0x0

    :goto_0
    return v0

    :cond_2
    return v2
.end method

.method public hashCode()I
    .locals 5

    .line 90
    iget-boolean v0, p0, Lcom/ibotta/android/state/app/config/tracking/AutoValue_TrackingClientsConfig;->ibottaTrackingEnabled:Z

    const/16 v1, 0x4cf

    const/16 v2, 0x4d5

    if-eqz v0, :cond_0

    const/16 v0, 0x4cf

    goto :goto_0

    :cond_0
    const/16 v0, 0x4d5

    :goto_0
    const v3, 0xf4243

    xor-int/2addr v0, v3

    mul-int v0, v0, v3

    .line 92
    iget-boolean v4, p0, Lcom/ibotta/android/state/app/config/tracking/AutoValue_TrackingClientsConfig;->ibottaTrackingFakeEvents:Z

    if-eqz v4, :cond_1

    const/16 v4, 0x4cf

    goto :goto_1

    :cond_1
    const/16 v4, 0x4d5

    :goto_1
    xor-int/2addr v0, v4

    mul-int v0, v0, v3

    .line 94
    iget-boolean v4, p0, Lcom/ibotta/android/state/app/config/tracking/AutoValue_TrackingClientsConfig;->ibottaV1MappingEnabled:Z

    if-eqz v4, :cond_2

    const/16 v4, 0x4cf

    goto :goto_2

    :cond_2
    const/16 v4, 0x4d5

    :goto_2
    xor-int/2addr v0, v4

    mul-int v0, v0, v3

    .line 96
    iget-boolean v4, p0, Lcom/ibotta/android/state/app/config/tracking/AutoValue_TrackingClientsConfig;->ibottaV1TrackingEnabled:Z

    if-eqz v4, :cond_3

    const/16 v4, 0x4cf

    goto :goto_3

    :cond_3
    const/16 v4, 0x4d5

    :goto_3
    xor-int/2addr v0, v4

    mul-int v0, v0, v3

    .line 98
    iget-boolean v3, p0, Lcom/ibotta/android/state/app/config/tracking/AutoValue_TrackingClientsConfig;->ibottaV1TrackingFakeEvents:Z

    if-eqz v3, :cond_4

    goto :goto_4

    :cond_4
    const/16 v1, 0x4d5

    :goto_4
    xor-int/2addr v0, v1

    return v0
.end method

.method public isIbottaTrackingEnabled()Z
    .locals 1
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "ibotta_tracking_enabled"
    .end annotation

    .line 32
    iget-boolean v0, p0, Lcom/ibotta/android/state/app/config/tracking/AutoValue_TrackingClientsConfig;->ibottaTrackingEnabled:Z

    return v0
.end method

.method public isIbottaTrackingFakeEvents()Z
    .locals 1
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "ibotta_tracking_fake_events"
    .end annotation

    .line 38
    iget-boolean v0, p0, Lcom/ibotta/android/state/app/config/tracking/AutoValue_TrackingClientsConfig;->ibottaTrackingFakeEvents:Z

    return v0
.end method

.method public isIbottaV1MappingEnabled()Z
    .locals 1
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "ibotta_v1_mapping_enabled"
    .end annotation

    .line 44
    iget-boolean v0, p0, Lcom/ibotta/android/state/app/config/tracking/AutoValue_TrackingClientsConfig;->ibottaV1MappingEnabled:Z

    return v0
.end method

.method public isIbottaV1TrackingEnabled()Z
    .locals 1
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "ibotta_v1_tracking_enabled"
    .end annotation

    .line 50
    iget-boolean v0, p0, Lcom/ibotta/android/state/app/config/tracking/AutoValue_TrackingClientsConfig;->ibottaV1TrackingEnabled:Z

    return v0
.end method

.method public isIbottaV1TrackingFakeEvents()Z
    .locals 1
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "ibotta_v1_tracking_fake_events"
    .end annotation

    .line 56
    iget-boolean v0, p0, Lcom/ibotta/android/state/app/config/tracking/AutoValue_TrackingClientsConfig;->ibottaV1TrackingFakeEvents:Z

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    .line 61
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "TrackingClientsConfig{ibottaTrackingEnabled="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-boolean v1, p0, Lcom/ibotta/android/state/app/config/tracking/AutoValue_TrackingClientsConfig;->ibottaTrackingEnabled:Z

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v1, ", ibottaTrackingFakeEvents="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-boolean v1, p0, Lcom/ibotta/android/state/app/config/tracking/AutoValue_TrackingClientsConfig;->ibottaTrackingFakeEvents:Z

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v1, ", ibottaV1MappingEnabled="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-boolean v1, p0, Lcom/ibotta/android/state/app/config/tracking/AutoValue_TrackingClientsConfig;->ibottaV1MappingEnabled:Z

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v1, ", ibottaV1TrackingEnabled="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-boolean v1, p0, Lcom/ibotta/android/state/app/config/tracking/AutoValue_TrackingClientsConfig;->ibottaV1TrackingEnabled:Z

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v1, ", ibottaV1TrackingFakeEvents="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-boolean v1, p0, Lcom/ibotta/android/state/app/config/tracking/AutoValue_TrackingClientsConfig;->ibottaV1TrackingFakeEvents:Z

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v1, "}"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
