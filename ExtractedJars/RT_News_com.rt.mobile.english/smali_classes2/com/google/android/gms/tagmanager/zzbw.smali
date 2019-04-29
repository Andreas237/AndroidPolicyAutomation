.class final Lcom/google/android/gms/tagmanager/zzbw;
.super Ljava/lang/Object;


# annotations
.annotation build Lcom/google/android/gms/common/util/VisibleForTesting;
.end annotation


# instance fields
.field private final zzaal:J

.field private final zzayn:J

.field private final zzayo:J

.field private zzayp:Ljava/lang/String;


# direct methods
.method constructor <init>(JJJ)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-wide p1, p0, Lcom/google/android/gms/tagmanager/zzbw;->zzayn:J

    iput-wide p3, p0, Lcom/google/android/gms/tagmanager/zzbw;->zzaal:J

    iput-wide p5, p0, Lcom/google/android/gms/tagmanager/zzbw;->zzayo:J

    return-void
.end method


# virtual methods
.method final zzdc(Ljava/lang/String;)V
    .locals 1

    if-eqz p1, :cond_1

    invoke-virtual {p1}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    :cond_0
    iput-object p1, p0, Lcom/google/android/gms/tagmanager/zzbw;->zzayp:Ljava/lang/String;

    :cond_1
    return-void
.end method

.method final zznp()J
    .locals 2

    iget-wide v0, p0, Lcom/google/android/gms/tagmanager/zzbw;->zzayn:J

    return-wide v0
.end method

.method final zznq()J
    .locals 2

    iget-wide v0, p0, Lcom/google/android/gms/tagmanager/zzbw;->zzayo:J

    return-wide v0
.end method

.method final zznr()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/tagmanager/zzbw;->zzayp:Ljava/lang/String;

    return-object v0
.end method
