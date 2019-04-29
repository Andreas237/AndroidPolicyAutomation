.class public final Lcom/google/android/gms/tagmanager/zzai;
.super Ljava/lang/Object;


# instance fields
.field private final zzavt:Ljava/lang/String;

.field private final zzawz:Ljava/util/Random;

.field private final zzqx:Landroid/content/Context;


# direct methods
.method public constructor <init>(Landroid/content/Context;Ljava/lang/String;)V
    .locals 1

    new-instance v0, Ljava/util/Random;

    invoke-direct {v0}, Ljava/util/Random;-><init>()V

    invoke-direct {p0, p1, p2, v0}, Lcom/google/android/gms/tagmanager/zzai;-><init>(Landroid/content/Context;Ljava/lang/String;Ljava/util/Random;)V

    return-void
.end method

.method private constructor <init>(Landroid/content/Context;Ljava/lang/String;Ljava/util/Random;)V
    .locals 0
    .annotation build Landroid/support/annotation/VisibleForTesting;
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-static {p1}, Lcom/google/android/gms/common/internal/Preconditions;->checkNotNull(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroid/content/Context;

    iput-object p1, p0, Lcom/google/android/gms/tagmanager/zzai;->zzqx:Landroid/content/Context;

    invoke-static {p2}, Lcom/google/android/gms/common/internal/Preconditions;->checkNotNull(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/String;

    iput-object p1, p0, Lcom/google/android/gms/tagmanager/zzai;->zzavt:Ljava/lang/String;

    iput-object p3, p0, Lcom/google/android/gms/tagmanager/zzai;->zzawz:Ljava/util/Random;

    return-void
.end method

.method private final zzb(JJ)J
    .locals 8

    invoke-direct {p0}, Lcom/google/android/gms/tagmanager/zzai;->zzmx()Landroid/content/SharedPreferences;

    move-result-object v0

    const-string v1, "FORBIDDEN_COUNT"

    const-wide/16 v2, 0x0

    invoke-interface {v0, v1, v2, v3}, Landroid/content/SharedPreferences;->getLong(Ljava/lang/String;J)J

    move-result-wide v4

    invoke-static {v2, v3, v4, v5}, Ljava/lang/Math;->max(JJ)J

    move-result-wide v4

    const-string v1, "SUCCESSFUL_COUNT"

    invoke-interface {v0, v1, v2, v3}, Landroid/content/SharedPreferences;->getLong(Ljava/lang/String;J)J

    move-result-wide v0

    invoke-static {v2, v3, v0, v1}, Ljava/lang/Math;->max(JJ)J

    move-result-wide v0

    long-to-float v2, v4

    add-long v6, v4, v0

    const-wide/16 v0, 0x1

    add-long v3, v6, v0

    long-to-float v0, v3

    div-float/2addr v2, v0

    sub-long v0, p3, p1

    long-to-float p3, v0

    mul-float/2addr v2, p3

    float-to-long p3, v2

    add-long v0, p1, p3

    iget-object p1, p0, Lcom/google/android/gms/tagmanager/zzai;->zzawz:Ljava/util/Random;

    invoke-virtual {p1}, Ljava/util/Random;->nextFloat()F

    move-result p1

    long-to-float p2, v0

    mul-float/2addr p1, p2

    float-to-long p1, p1

    return-wide p1
.end method

.method private final zzmx()Landroid/content/SharedPreferences;
    .locals 4

    iget-object v0, p0, Lcom/google/android/gms/tagmanager/zzai;->zzqx:Landroid/content/Context;

    const-string v1, "_gtmContainerRefreshPolicy_"

    invoke-static {v1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    iget-object v2, p0, Lcom/google/android/gms/tagmanager/zzai;->zzavt:Ljava/lang/String;

    invoke-static {v2}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/String;->length()I

    move-result v3

    if-eqz v3, :cond_0

    invoke-virtual {v1, v2}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    goto :goto_0

    :cond_0
    new-instance v2, Ljava/lang/String;

    invoke-direct {v2, v1}, Ljava/lang/String;-><init>(Ljava/lang/String;)V

    move-object v1, v2

    :goto_0
    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    move-result-object v0

    return-object v0
.end method


# virtual methods
.method public final zzmt()J
    .locals 6

    const-wide/32 v0, 0x6ddd00

    const-wide/32 v2, 0xf731400

    invoke-direct {p0, v0, v1, v2, v3}, Lcom/google/android/gms/tagmanager/zzai;->zzb(JJ)J

    move-result-wide v0

    const-wide/32 v2, 0x2932e00

    add-long v4, v2, v0

    return-wide v4
.end method

.method public final zzmu()J
    .locals 6

    const-wide/32 v0, 0x927c0

    const-wide/32 v2, 0x5265c00

    invoke-direct {p0, v0, v1, v2, v3}, Lcom/google/android/gms/tagmanager/zzai;->zzb(JJ)J

    move-result-wide v0

    const-wide/32 v2, 0x36ee80

    add-long v4, v2, v0

    return-wide v4
.end method

.method public final zzmv()V
    .locals 14
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "CommitPrefEdits"
        }
    .end annotation

    invoke-direct {p0}, Lcom/google/android/gms/tagmanager/zzai;->zzmx()Landroid/content/SharedPreferences;

    move-result-object v0

    const-string v1, "FORBIDDEN_COUNT"

    const-wide/16 v2, 0x0

    invoke-interface {v0, v1, v2, v3}, Landroid/content/SharedPreferences;->getLong(Ljava/lang/String;J)J

    move-result-wide v4

    const-string v1, "SUCCESSFUL_COUNT"

    invoke-interface {v0, v1, v2, v3}, Landroid/content/SharedPreferences;->getLong(Ljava/lang/String;J)J

    move-result-wide v6

    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    cmp-long v1, v4, v2

    const-wide/16 v8, 0xa

    if-nez v1, :cond_0

    const-wide/16 v4, 0x3

    goto :goto_0

    :cond_0
    const-wide/16 v10, 0x1

    add-long v12, v4, v10

    invoke-static {v8, v9, v12, v13}, Ljava/lang/Math;->min(JJ)J

    move-result-wide v4

    :goto_0
    sub-long v10, v8, v4

    invoke-static {v6, v7, v10, v11}, Ljava/lang/Math;->min(JJ)J

    move-result-wide v6

    invoke-static {v2, v3, v6, v7}, Ljava/lang/Math;->max(JJ)J

    move-result-wide v1

    const-string v3, "FORBIDDEN_COUNT"

    invoke-interface {v0, v3, v4, v5}, Landroid/content/SharedPreferences$Editor;->putLong(Ljava/lang/String;J)Landroid/content/SharedPreferences$Editor;

    const-string v3, "SUCCESSFUL_COUNT"

    invoke-interface {v0, v3, v1, v2}, Landroid/content/SharedPreferences$Editor;->putLong(Ljava/lang/String;J)Landroid/content/SharedPreferences$Editor;

    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->apply()V

    return-void
.end method

.method public final zzmw()V
    .locals 12
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "CommitPrefEdits"
        }
    .end annotation

    invoke-direct {p0}, Lcom/google/android/gms/tagmanager/zzai;->zzmx()Landroid/content/SharedPreferences;

    move-result-object v0

    const-string v1, "SUCCESSFUL_COUNT"

    const-wide/16 v2, 0x0

    invoke-interface {v0, v1, v2, v3}, Landroid/content/SharedPreferences;->getLong(Ljava/lang/String;J)J

    move-result-wide v4

    const-string v1, "FORBIDDEN_COUNT"

    invoke-interface {v0, v1, v2, v3}, Landroid/content/SharedPreferences;->getLong(Ljava/lang/String;J)J

    move-result-wide v6

    const-wide/16 v8, 0x1

    add-long v10, v4, v8

    const-wide/16 v4, 0xa

    invoke-static {v4, v5, v10, v11}, Ljava/lang/Math;->min(JJ)J

    move-result-wide v8

    sub-long v10, v4, v8

    invoke-static {v6, v7, v10, v11}, Ljava/lang/Math;->min(JJ)J

    move-result-wide v4

    invoke-static {v2, v3, v4, v5}, Ljava/lang/Math;->max(JJ)J

    move-result-wide v1

    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    const-string v3, "SUCCESSFUL_COUNT"

    invoke-interface {v0, v3, v8, v9}, Landroid/content/SharedPreferences$Editor;->putLong(Ljava/lang/String;J)Landroid/content/SharedPreferences$Editor;

    const-string v3, "FORBIDDEN_COUNT"

    invoke-interface {v0, v3, v1, v2}, Landroid/content/SharedPreferences$Editor;->putLong(Ljava/lang/String;J)Landroid/content/SharedPreferences$Editor;

    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->apply()V

    return-void
.end method
