.class public final Lcom/google/firebase/analytics/connector/internal/zzd;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/google/firebase/analytics/connector/internal/zza;


# instance fields
.field private zzbsq:Lcom/google/android/gms/measurement/AppMeasurement;

.field zzbtc:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private zzbtd:Lcom/google/firebase/analytics/connector/AnalyticsConnector$AnalyticsConnectorListener;

.field private zzbte:Lcom/google/firebase/analytics/connector/internal/zze;


# direct methods
.method public constructor <init>(Lcom/google/android/gms/measurement/AppMeasurement;Lcom/google/firebase/analytics/connector/AnalyticsConnector$AnalyticsConnectorListener;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p2, p0, Lcom/google/firebase/analytics/connector/internal/zzd;->zzbtd:Lcom/google/firebase/analytics/connector/AnalyticsConnector$AnalyticsConnectorListener;

    .line 3
    iput-object p1, p0, Lcom/google/firebase/analytics/connector/internal/zzd;->zzbsq:Lcom/google/android/gms/measurement/AppMeasurement;

    .line 4
    new-instance p1, Lcom/google/firebase/analytics/connector/internal/zze;

    invoke-direct {p1, p0}, Lcom/google/firebase/analytics/connector/internal/zze;-><init>(Lcom/google/firebase/analytics/connector/internal/zzd;)V

    iput-object p1, p0, Lcom/google/firebase/analytics/connector/internal/zzd;->zzbte:Lcom/google/firebase/analytics/connector/internal/zze;

    .line 5
    iget-object p1, p0, Lcom/google/firebase/analytics/connector/internal/zzd;->zzbsq:Lcom/google/android/gms/measurement/AppMeasurement;

    iget-object p2, p0, Lcom/google/firebase/analytics/connector/internal/zzd;->zzbte:Lcom/google/firebase/analytics/connector/internal/zze;

    invoke-virtual {p1, p2}, Lcom/google/android/gms/measurement/AppMeasurement;->registerOnMeasurementEventListener(Lcom/google/android/gms/measurement/AppMeasurement$OnEventListener;)V

    .line 6
    new-instance p1, Ljava/util/HashSet;

    invoke-direct {p1}, Ljava/util/HashSet;-><init>()V

    iput-object p1, p0, Lcom/google/firebase/analytics/connector/internal/zzd;->zzbtc:Ljava/util/Set;

    return-void
.end method

.method static synthetic zza(Lcom/google/firebase/analytics/connector/internal/zzd;)Lcom/google/firebase/analytics/connector/AnalyticsConnector$AnalyticsConnectorListener;
    .locals 0

    .line 22
    iget-object p0, p0, Lcom/google/firebase/analytics/connector/internal/zzd;->zzbtd:Lcom/google/firebase/analytics/connector/AnalyticsConnector$AnalyticsConnectorListener;

    return-object p0
.end method


# virtual methods
.method public final registerEventNames(Ljava/util/Set;)V
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Set<",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    .line 9
    iget-object v0, p0, Lcom/google/firebase/analytics/connector/internal/zzd;->zzbtc:Ljava/util/Set;

    invoke-interface {v0}, Ljava/util/Set;->clear()V

    .line 10
    iget-object v0, p0, Lcom/google/firebase/analytics/connector/internal/zzd;->zzbtc:Ljava/util/Set;

    .line 11
    new-instance v1, Ljava/util/HashSet;

    invoke-direct {v1}, Ljava/util/HashSet;-><init>()V

    .line 12
    invoke-interface {p1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_0
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    .line 13
    invoke-interface {v1}, Ljava/util/Set;->size()I

    move-result v3

    const/16 v4, 0x32

    if-ge v3, v4, :cond_1

    .line 14
    invoke-static {v2}, Lcom/google/firebase/analytics/connector/internal/zzc;->zzfw(Ljava/lang/String;)Z

    move-result v3

    if-eqz v3, :cond_0

    invoke-static {v2}, Lcom/google/firebase/analytics/connector/internal/zzc;->zzfv(Ljava/lang/String;)Z

    move-result v3

    if-eqz v3, :cond_0

    .line 15
    invoke-static {v2}, Lcom/google/firebase/analytics/connector/internal/zzc;->zzfy(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-interface {v1, v2}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 18
    :cond_1
    invoke-interface {v0, v1}, Ljava/util/Set;->addAll(Ljava/util/Collection;)Z

    return-void
.end method

.method public final unregisterEventNames()V
    .locals 1

    .line 20
    iget-object v0, p0, Lcom/google/firebase/analytics/connector/internal/zzd;->zzbtc:Ljava/util/Set;

    invoke-interface {v0}, Ljava/util/Set;->clear()V

    return-void
.end method

.method public final zztv()Lcom/google/firebase/analytics/connector/AnalyticsConnector$AnalyticsConnectorListener;
    .locals 1

    .line 8
    iget-object v0, p0, Lcom/google/firebase/analytics/connector/internal/zzd;->zzbtd:Lcom/google/firebase/analytics/connector/AnalyticsConnector$AnalyticsConnectorListener;

    return-object v0
.end method
