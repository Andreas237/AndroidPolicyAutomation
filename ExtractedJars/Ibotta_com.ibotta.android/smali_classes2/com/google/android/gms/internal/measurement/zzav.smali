.class public final Lcom/google/android/gms/internal/measurement/zzav;
.super Ljava/lang/Object;


# instance fields
.field private final zzwf:Landroid/content/Context;

.field private final zzwg:Landroid/content/Context;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-static {p1}, Lcom/google/android/gms/common/internal/Preconditions;->checkNotNull(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object p1

    const-string v0, "Application context can\'t be null"

    invoke-static {p1, v0}, Lcom/google/android/gms/common/internal/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iput-object p1, p0, Lcom/google/android/gms/internal/measurement/zzav;->zzwf:Landroid/content/Context;

    iput-object p1, p0, Lcom/google/android/gms/internal/measurement/zzav;->zzwg:Landroid/content/Context;

    return-void
.end method


# virtual methods
.method public final getApplicationContext()Landroid/content/Context;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/zzav;->zzwf:Landroid/content/Context;

    return-object v0
.end method

.method public final zzci()Landroid/content/Context;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/zzav;->zzwg:Landroid/content/Context;

    return-object v0
.end method
