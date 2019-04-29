.class final Lcom/google/android/gms/internal/measurement/zzge;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field private final synthetic val$context:Landroid/content/Context;

.field private final synthetic zzalk:Lcom/google/android/gms/internal/measurement/zzgm;

.field private final synthetic zzall:Lcom/google/android/gms/internal/measurement/zzfh;

.field private final synthetic zzalm:J

.field private final synthetic zzaln:Landroid/os/Bundle;

.field private final synthetic zzqu:Landroid/content/BroadcastReceiver$PendingResult;


# direct methods
.method constructor <init>(Lcom/google/android/gms/internal/measurement/zzgc;Lcom/google/android/gms/internal/measurement/zzgm;JLandroid/os/Bundle;Landroid/content/Context;Lcom/google/android/gms/internal/measurement/zzfh;Landroid/content/BroadcastReceiver$PendingResult;)V
    .locals 0

    iput-object p2, p0, Lcom/google/android/gms/internal/measurement/zzge;->zzalk:Lcom/google/android/gms/internal/measurement/zzgm;

    iput-wide p3, p0, Lcom/google/android/gms/internal/measurement/zzge;->zzalm:J

    iput-object p5, p0, Lcom/google/android/gms/internal/measurement/zzge;->zzaln:Landroid/os/Bundle;

    iput-object p6, p0, Lcom/google/android/gms/internal/measurement/zzge;->val$context:Landroid/content/Context;

    iput-object p7, p0, Lcom/google/android/gms/internal/measurement/zzge;->zzall:Lcom/google/android/gms/internal/measurement/zzfh;

    iput-object p8, p0, Lcom/google/android/gms/internal/measurement/zzge;->zzqu:Landroid/content/BroadcastReceiver$PendingResult;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 8

    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/zzge;->zzalk:Lcom/google/android/gms/internal/measurement/zzgm;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/measurement/zzgm;->zzgg()Lcom/google/android/gms/internal/measurement/zzfs;

    move-result-object v0

    iget-object v0, v0, Lcom/google/android/gms/internal/measurement/zzfs;->zzaki:Lcom/google/android/gms/internal/measurement/zzfv;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/measurement/zzfv;->get()J

    move-result-wide v0

    iget-wide v2, p0, Lcom/google/android/gms/internal/measurement/zzge;->zzalm:J

    const-wide/16 v4, 0x0

    cmp-long v6, v0, v4

    if-lez v6, :cond_1

    cmp-long v6, v2, v0

    if-gez v6, :cond_0

    cmp-long v6, v2, v4

    if-gtz v6, :cond_1

    :cond_0
    const-wide/16 v2, 0x1

    sub-long v6, v0, v2

    move-wide v2, v6

    :cond_1
    cmp-long v0, v2, v4

    if-lez v0, :cond_2

    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/zzge;->zzaln:Landroid/os/Bundle;

    const-string v1, "click_timestamp"

    invoke-virtual {v0, v1, v2, v3}, Landroid/os/Bundle;->putLong(Ljava/lang/String;J)V

    :cond_2
    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/zzge;->zzaln:Landroid/os/Bundle;

    const-string v1, "_cis"

    const-string v2, "referrer broadcast"

    invoke-virtual {v0, v1, v2}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/zzge;->val$context:Landroid/content/Context;

    invoke-static {v0}, Lcom/google/android/gms/measurement/AppMeasurement;->getInstance(Landroid/content/Context;)Lcom/google/android/gms/measurement/AppMeasurement;

    move-result-object v0

    const-string v1, "auto"

    const-string v2, "_cmp"

    iget-object v3, p0, Lcom/google/android/gms/internal/measurement/zzge;->zzaln:Landroid/os/Bundle;

    invoke-virtual {v0, v1, v2, v3}, Lcom/google/android/gms/measurement/AppMeasurement;->logEventInternal(Ljava/lang/String;Ljava/lang/String;Landroid/os/Bundle;)V

    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/zzge;->zzall:Lcom/google/android/gms/internal/measurement/zzfh;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/measurement/zzfh;->zziz()Lcom/google/android/gms/internal/measurement/zzfj;

    move-result-object v0

    const-string v1, "Install campaign recorded"

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/measurement/zzfj;->log(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/zzge;->zzqu:Landroid/content/BroadcastReceiver$PendingResult;

    if-eqz v0, :cond_3

    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/zzge;->zzqu:Landroid/content/BroadcastReceiver$PendingResult;

    invoke-virtual {v0}, Landroid/content/BroadcastReceiver$PendingResult;->finish()V

    :cond_3
    return-void
.end method
