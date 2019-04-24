.class final Lcom/google/firebase/analytics/connector/internal/zze;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/google/android/gms/measurement/AppMeasurement$OnEventListener;


# instance fields
.field private final synthetic zzbtf:Lcom/google/firebase/analytics/connector/internal/zzd;


# direct methods
.method public constructor <init>(Lcom/google/firebase/analytics/connector/internal/zzd;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/google/firebase/analytics/connector/internal/zze;->zzbtf:Lcom/google/firebase/analytics/connector/internal/zzd;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onEvent(Ljava/lang/String;Ljava/lang/String;Landroid/os/Bundle;J)V
    .locals 0

    .line 2
    iget-object p1, p0, Lcom/google/firebase/analytics/connector/internal/zze;->zzbtf:Lcom/google/firebase/analytics/connector/internal/zzd;

    iget-object p1, p1, Lcom/google/firebase/analytics/connector/internal/zzd;->zzbtc:Ljava/util/Set;

    invoke-interface {p1, p2}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_0

    return-void

    .line 4
    :cond_0
    new-instance p1, Landroid/os/Bundle;

    invoke-direct {p1}, Landroid/os/Bundle;-><init>()V

    const-string p3, "events"

    .line 5
    invoke-static {p2}, Lcom/google/firebase/analytics/connector/internal/zzc;->zzfx(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p3, p2}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 6
    iget-object p2, p0, Lcom/google/firebase/analytics/connector/internal/zze;->zzbtf:Lcom/google/firebase/analytics/connector/internal/zzd;

    invoke-static {p2}, Lcom/google/firebase/analytics/connector/internal/zzd;->zza(Lcom/google/firebase/analytics/connector/internal/zzd;)Lcom/google/firebase/analytics/connector/AnalyticsConnector$AnalyticsConnectorListener;

    move-result-object p2

    const/4 p3, 0x2

    invoke-interface {p2, p3, p1}, Lcom/google/firebase/analytics/connector/AnalyticsConnector$AnalyticsConnectorListener;->onMessageTriggered(ILandroid/os/Bundle;)V

    return-void
.end method
