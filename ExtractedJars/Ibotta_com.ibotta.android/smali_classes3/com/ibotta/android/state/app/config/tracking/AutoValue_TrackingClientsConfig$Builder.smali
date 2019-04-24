.class final Lcom/ibotta/android/state/app/config/tracking/AutoValue_TrackingClientsConfig$Builder;
.super Lcom/ibotta/android/state/app/config/tracking/TrackingClientsConfig$Builder;
.source "AutoValue_TrackingClientsConfig.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/ibotta/android/state/app/config/tracking/AutoValue_TrackingClientsConfig;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = "Builder"
.end annotation


# instance fields
.field private ibottaTrackingEnabled:Ljava/lang/Boolean;

.field private ibottaTrackingFakeEvents:Ljava/lang/Boolean;

.field private ibottaV1MappingEnabled:Ljava/lang/Boolean;

.field private ibottaV1TrackingEnabled:Ljava/lang/Boolean;

.field private ibottaV1TrackingFakeEvents:Ljava/lang/Boolean;


# direct methods
.method constructor <init>()V
    .locals 0

    .line 108
    invoke-direct {p0}, Lcom/ibotta/android/state/app/config/tracking/TrackingClientsConfig$Builder;-><init>()V

    return-void
.end method


# virtual methods
.method public build()Lcom/ibotta/android/state/app/config/tracking/TrackingClientsConfig;
    .locals 9

    const-string v0, ""

    .line 138
    iget-object v1, p0, Lcom/ibotta/android/state/app/config/tracking/AutoValue_TrackingClientsConfig$Builder;->ibottaTrackingEnabled:Ljava/lang/Boolean;

    if-nez v1, :cond_0

    .line 139
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, " ibottaTrackingEnabled"

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 141
    :cond_0
    iget-object v1, p0, Lcom/ibotta/android/state/app/config/tracking/AutoValue_TrackingClientsConfig$Builder;->ibottaTrackingFakeEvents:Ljava/lang/Boolean;

    if-nez v1, :cond_1

    .line 142
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, " ibottaTrackingFakeEvents"

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 144
    :cond_1
    iget-object v1, p0, Lcom/ibotta/android/state/app/config/tracking/AutoValue_TrackingClientsConfig$Builder;->ibottaV1MappingEnabled:Ljava/lang/Boolean;

    if-nez v1, :cond_2

    .line 145
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, " ibottaV1MappingEnabled"

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 147
    :cond_2
    iget-object v1, p0, Lcom/ibotta/android/state/app/config/tracking/AutoValue_TrackingClientsConfig$Builder;->ibottaV1TrackingEnabled:Ljava/lang/Boolean;

    if-nez v1, :cond_3

    .line 148
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, " ibottaV1TrackingEnabled"

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 150
    :cond_3
    iget-object v1, p0, Lcom/ibotta/android/state/app/config/tracking/AutoValue_TrackingClientsConfig$Builder;->ibottaV1TrackingFakeEvents:Ljava/lang/Boolean;

    if-nez v1, :cond_4

    .line 151
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, " ibottaV1TrackingFakeEvents"

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 153
    :cond_4
    invoke-virtual {v0}, Ljava/lang/String;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_5

    .line 156
    new-instance v0, Lcom/ibotta/android/state/app/config/tracking/AutoValue_TrackingClientsConfig;

    iget-object v1, p0, Lcom/ibotta/android/state/app/config/tracking/AutoValue_TrackingClientsConfig$Builder;->ibottaTrackingEnabled:Ljava/lang/Boolean;

    .line 157
    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v3

    iget-object v1, p0, Lcom/ibotta/android/state/app/config/tracking/AutoValue_TrackingClientsConfig$Builder;->ibottaTrackingFakeEvents:Ljava/lang/Boolean;

    .line 158
    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v4

    iget-object v1, p0, Lcom/ibotta/android/state/app/config/tracking/AutoValue_TrackingClientsConfig$Builder;->ibottaV1MappingEnabled:Ljava/lang/Boolean;

    .line 159
    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v5

    iget-object v1, p0, Lcom/ibotta/android/state/app/config/tracking/AutoValue_TrackingClientsConfig$Builder;->ibottaV1TrackingEnabled:Ljava/lang/Boolean;

    .line 160
    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v6

    iget-object v1, p0, Lcom/ibotta/android/state/app/config/tracking/AutoValue_TrackingClientsConfig$Builder;->ibottaV1TrackingFakeEvents:Ljava/lang/Boolean;

    .line 161
    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v7

    const/4 v8, 0x0

    move-object v2, v0

    invoke-direct/range {v2 .. v8}, Lcom/ibotta/android/state/app/config/tracking/AutoValue_TrackingClientsConfig;-><init>(ZZZZZLcom/ibotta/android/state/app/config/tracking/AutoValue_TrackingClientsConfig$1;)V

    return-object v0

    .line 154
    :cond_5
    new-instance v1, Ljava/lang/IllegalStateException;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Missing required properties:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1
.end method

.method public ibottaTrackingEnabled(Z)Lcom/ibotta/android/state/app/config/tracking/TrackingClientsConfig$Builder;
    .locals 0

    .line 112
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    iput-object p1, p0, Lcom/ibotta/android/state/app/config/tracking/AutoValue_TrackingClientsConfig$Builder;->ibottaTrackingEnabled:Ljava/lang/Boolean;

    return-object p0
.end method

.method public ibottaTrackingFakeEvents(Z)Lcom/ibotta/android/state/app/config/tracking/TrackingClientsConfig$Builder;
    .locals 0

    .line 117
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    iput-object p1, p0, Lcom/ibotta/android/state/app/config/tracking/AutoValue_TrackingClientsConfig$Builder;->ibottaTrackingFakeEvents:Ljava/lang/Boolean;

    return-object p0
.end method

.method public ibottaV1MappingEnabled(Z)Lcom/ibotta/android/state/app/config/tracking/TrackingClientsConfig$Builder;
    .locals 0

    .line 122
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    iput-object p1, p0, Lcom/ibotta/android/state/app/config/tracking/AutoValue_TrackingClientsConfig$Builder;->ibottaV1MappingEnabled:Ljava/lang/Boolean;

    return-object p0
.end method

.method public ibottaV1TrackingEnabled(Z)Lcom/ibotta/android/state/app/config/tracking/TrackingClientsConfig$Builder;
    .locals 0

    .line 127
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    iput-object p1, p0, Lcom/ibotta/android/state/app/config/tracking/AutoValue_TrackingClientsConfig$Builder;->ibottaV1TrackingEnabled:Ljava/lang/Boolean;

    return-object p0
.end method

.method public ibottaV1TrackingFakeEvents(Z)Lcom/ibotta/android/state/app/config/tracking/TrackingClientsConfig$Builder;
    .locals 0

    .line 132
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    iput-object p1, p0, Lcom/ibotta/android/state/app/config/tracking/AutoValue_TrackingClientsConfig$Builder;->ibottaV1TrackingFakeEvents:Ljava/lang/Boolean;

    return-object p0
.end method
