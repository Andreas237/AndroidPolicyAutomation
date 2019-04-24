.class public final Lcom/google/firebase/analytics/connector/internal/zzf;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/google/firebase/analytics/connector/internal/zza;


# instance fields
.field private zzbsq:Lcom/google/android/gms/measurement/AppMeasurement;

.field private zzbtd:Lcom/google/firebase/analytics/connector/AnalyticsConnector$AnalyticsConnectorListener;

.field private zzbtg:Lcom/google/firebase/analytics/connector/internal/zzg;


# direct methods
.method public constructor <init>(Lcom/google/android/gms/measurement/AppMeasurement;Lcom/google/firebase/analytics/connector/AnalyticsConnector$AnalyticsConnectorListener;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p2, p0, Lcom/google/firebase/analytics/connector/internal/zzf;->zzbtd:Lcom/google/firebase/analytics/connector/AnalyticsConnector$AnalyticsConnectorListener;

    .line 3
    iput-object p1, p0, Lcom/google/firebase/analytics/connector/internal/zzf;->zzbsq:Lcom/google/android/gms/measurement/AppMeasurement;

    .line 4
    new-instance p1, Lcom/google/firebase/analytics/connector/internal/zzg;

    invoke-direct {p1, p0}, Lcom/google/firebase/analytics/connector/internal/zzg;-><init>(Lcom/google/firebase/analytics/connector/internal/zzf;)V

    iput-object p1, p0, Lcom/google/firebase/analytics/connector/internal/zzf;->zzbtg:Lcom/google/firebase/analytics/connector/internal/zzg;

    .line 5
    iget-object p1, p0, Lcom/google/firebase/analytics/connector/internal/zzf;->zzbsq:Lcom/google/android/gms/measurement/AppMeasurement;

    iget-object p2, p0, Lcom/google/firebase/analytics/connector/internal/zzf;->zzbtg:Lcom/google/firebase/analytics/connector/internal/zzg;

    invoke-virtual {p1, p2}, Lcom/google/android/gms/measurement/AppMeasurement;->registerOnMeasurementEventListener(Lcom/google/android/gms/measurement/AppMeasurement$OnEventListener;)V

    return-void
.end method

.method static synthetic zza(Lcom/google/firebase/analytics/connector/internal/zzf;)Lcom/google/firebase/analytics/connector/AnalyticsConnector$AnalyticsConnectorListener;
    .locals 0

    .line 10
    iget-object p0, p0, Lcom/google/firebase/analytics/connector/internal/zzf;->zzbtd:Lcom/google/firebase/analytics/connector/AnalyticsConnector$AnalyticsConnectorListener;

    return-object p0
.end method


# virtual methods
.method public final registerEventNames(Ljava/util/Set;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Set<",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    return-void
.end method

.method public final unregisterEventNames()V
    .locals 0

    return-void
.end method

.method public final zztv()Lcom/google/firebase/analytics/connector/AnalyticsConnector$AnalyticsConnectorListener;
    .locals 1

    .line 7
    iget-object v0, p0, Lcom/google/firebase/analytics/connector/internal/zzf;->zzbtd:Lcom/google/firebase/analytics/connector/AnalyticsConnector$AnalyticsConnectorListener;

    return-object v0
.end method
