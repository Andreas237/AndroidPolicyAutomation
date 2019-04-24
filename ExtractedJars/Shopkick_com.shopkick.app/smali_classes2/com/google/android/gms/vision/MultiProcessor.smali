.class public Lcom/google/android/gms/vision/MultiProcessor;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/google/android/gms/vision/Detector$Processor;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/google/android/gms/vision/MultiProcessor$zza;,
        Lcom/google/android/gms/vision/MultiProcessor$Builder;,
        Lcom/google/android/gms/vision/MultiProcessor$Factory;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;",
        "Lcom/google/android/gms/vision/Detector$Processor<",
        "TT;>;"
    }
.end annotation


# instance fields
.field private zzal:I

.field private zzaz:Lcom/google/android/gms/vision/MultiProcessor$Factory;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/android/gms/vision/MultiProcessor$Factory<",
            "TT;>;"
        }
    .end annotation
.end field

.field private zzba:Landroid/util/SparseArray;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/util/SparseArray<",
            "Lcom/google/android/gms/vision/MultiProcessor$zza;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method private constructor <init>()V
    .locals 1

    .line 44
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 45
    new-instance v0, Landroid/util/SparseArray;

    invoke-direct {v0}, Landroid/util/SparseArray;-><init>()V

    iput-object v0, p0, Lcom/google/android/gms/vision/MultiProcessor;->zzba:Landroid/util/SparseArray;

    const/4 v0, 0x3

    .line 46
    iput v0, p0, Lcom/google/android/gms/vision/MultiProcessor;->zzal:I

    return-void
.end method

.method synthetic constructor <init>(Lcom/google/android/gms/vision/zze;)V
    .locals 0

    .line 48
    invoke-direct {p0}, Lcom/google/android/gms/vision/MultiProcessor;-><init>()V

    return-void
.end method

.method static synthetic zza(Lcom/google/android/gms/vision/MultiProcessor;I)I
    .locals 0

    .line 50
    iput p1, p0, Lcom/google/android/gms/vision/MultiProcessor;->zzal:I

    return p1
.end method

.method static synthetic zza(Lcom/google/android/gms/vision/MultiProcessor;Lcom/google/android/gms/vision/MultiProcessor$Factory;)Lcom/google/android/gms/vision/MultiProcessor$Factory;
    .locals 0

    .line 49
    iput-object p1, p0, Lcom/google/android/gms/vision/MultiProcessor;->zzaz:Lcom/google/android/gms/vision/MultiProcessor$Factory;

    return-object p1
.end method


# virtual methods
.method public receiveDetections(Lcom/google/android/gms/vision/Detector$Detections;)V
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/vision/Detector$Detections<",
            "TT;>;)V"
        }
    .end annotation

    .line 8
    invoke-virtual {p1}, Lcom/google/android/gms/vision/Detector$Detections;->getDetectedItems()Landroid/util/SparseArray;

    move-result-object v0

    const/4 v1, 0x0

    move v2, v1

    .line 9
    :goto_0
    invoke-virtual {v0}, Landroid/util/SparseArray;->size()I

    move-result v3

    if-ge v2, v3, :cond_1

    .line 10
    invoke-virtual {v0, v2}, Landroid/util/SparseArray;->keyAt(I)I

    move-result v3

    .line 11
    invoke-virtual {v0, v2}, Landroid/util/SparseArray;->valueAt(I)Ljava/lang/Object;

    move-result-object v4

    .line 12
    iget-object v5, p0, Lcom/google/android/gms/vision/MultiProcessor;->zzba:Landroid/util/SparseArray;

    invoke-virtual {v5, v3}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    move-result-object v5

    if-nez v5, :cond_0

    .line 13
    new-instance v5, Lcom/google/android/gms/vision/MultiProcessor$zza;

    const/4 v6, 0x0

    invoke-direct {v5, p0, v6}, Lcom/google/android/gms/vision/MultiProcessor$zza;-><init>(Lcom/google/android/gms/vision/MultiProcessor;Lcom/google/android/gms/vision/zze;)V

    .line 14
    iget-object v6, p0, Lcom/google/android/gms/vision/MultiProcessor;->zzaz:Lcom/google/android/gms/vision/MultiProcessor$Factory;

    invoke-interface {v6, v4}, Lcom/google/android/gms/vision/MultiProcessor$Factory;->create(Ljava/lang/Object;)Lcom/google/android/gms/vision/Tracker;

    move-result-object v6

    invoke-static {v5, v6}, Lcom/google/android/gms/vision/MultiProcessor$zza;->zza(Lcom/google/android/gms/vision/MultiProcessor$zza;Lcom/google/android/gms/vision/Tracker;)Lcom/google/android/gms/vision/Tracker;

    .line 15
    invoke-static {v5}, Lcom/google/android/gms/vision/MultiProcessor$zza;->zza(Lcom/google/android/gms/vision/MultiProcessor$zza;)Lcom/google/android/gms/vision/Tracker;

    move-result-object v6

    invoke-virtual {v6, v3, v4}, Lcom/google/android/gms/vision/Tracker;->onNewItem(ILjava/lang/Object;)V

    .line 16
    iget-object v4, p0, Lcom/google/android/gms/vision/MultiProcessor;->zzba:Landroid/util/SparseArray;

    invoke-virtual {v4, v3, v5}, Landroid/util/SparseArray;->append(ILjava/lang/Object;)V

    :cond_0
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    .line 19
    :cond_1
    invoke-virtual {p1}, Lcom/google/android/gms/vision/Detector$Detections;->getDetectedItems()Landroid/util/SparseArray;

    move-result-object v0

    .line 20
    new-instance v2, Ljava/util/HashSet;

    invoke-direct {v2}, Ljava/util/HashSet;-><init>()V

    move v3, v1

    .line 21
    :goto_1
    iget-object v4, p0, Lcom/google/android/gms/vision/MultiProcessor;->zzba:Landroid/util/SparseArray;

    invoke-virtual {v4}, Landroid/util/SparseArray;->size()I

    move-result v4

    if-ge v3, v4, :cond_4

    .line 22
    iget-object v4, p0, Lcom/google/android/gms/vision/MultiProcessor;->zzba:Landroid/util/SparseArray;

    invoke-virtual {v4, v3}, Landroid/util/SparseArray;->keyAt(I)I

    move-result v4

    .line 23
    invoke-virtual {v0, v4}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    move-result-object v5

    if-nez v5, :cond_3

    .line 24
    iget-object v5, p0, Lcom/google/android/gms/vision/MultiProcessor;->zzba:Landroid/util/SparseArray;

    invoke-virtual {v5, v3}, Landroid/util/SparseArray;->valueAt(I)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lcom/google/android/gms/vision/MultiProcessor$zza;

    .line 25
    invoke-static {v5}, Lcom/google/android/gms/vision/MultiProcessor$zza;->zzb(Lcom/google/android/gms/vision/MultiProcessor$zza;)I

    .line 26
    invoke-static {v5}, Lcom/google/android/gms/vision/MultiProcessor$zza;->zzc(Lcom/google/android/gms/vision/MultiProcessor$zza;)I

    move-result v6

    iget v7, p0, Lcom/google/android/gms/vision/MultiProcessor;->zzal:I

    if-lt v6, v7, :cond_2

    .line 27
    invoke-static {v5}, Lcom/google/android/gms/vision/MultiProcessor$zza;->zza(Lcom/google/android/gms/vision/MultiProcessor$zza;)Lcom/google/android/gms/vision/Tracker;

    move-result-object v5

    invoke-virtual {v5}, Lcom/google/android/gms/vision/Tracker;->onDone()V

    .line 28
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-interface {v2, v4}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    goto :goto_2

    .line 29
    :cond_2
    invoke-static {v5}, Lcom/google/android/gms/vision/MultiProcessor$zza;->zza(Lcom/google/android/gms/vision/MultiProcessor$zza;)Lcom/google/android/gms/vision/Tracker;

    move-result-object v4

    invoke-virtual {v4, p1}, Lcom/google/android/gms/vision/Tracker;->onMissing(Lcom/google/android/gms/vision/Detector$Detections;)V

    :cond_3
    :goto_2
    add-int/lit8 v3, v3, 0x1

    goto :goto_1

    .line 31
    :cond_4
    invoke-interface {v2}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_3
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_5

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Integer;

    .line 32
    iget-object v3, p0, Lcom/google/android/gms/vision/MultiProcessor;->zzba:Landroid/util/SparseArray;

    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    move-result v2

    invoke-virtual {v3, v2}, Landroid/util/SparseArray;->delete(I)V

    goto :goto_3

    .line 35
    :cond_5
    invoke-virtual {p1}, Lcom/google/android/gms/vision/Detector$Detections;->getDetectedItems()Landroid/util/SparseArray;

    move-result-object v0

    move v2, v1

    .line 36
    :goto_4
    invoke-virtual {v0}, Landroid/util/SparseArray;->size()I

    move-result v3

    if-ge v2, v3, :cond_6

    .line 37
    invoke-virtual {v0, v2}, Landroid/util/SparseArray;->keyAt(I)I

    move-result v3

    .line 38
    invoke-virtual {v0, v2}, Landroid/util/SparseArray;->valueAt(I)Ljava/lang/Object;

    move-result-object v4

    .line 39
    iget-object v5, p0, Lcom/google/android/gms/vision/MultiProcessor;->zzba:Landroid/util/SparseArray;

    invoke-virtual {v5, v3}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/google/android/gms/vision/MultiProcessor$zza;

    .line 40
    invoke-static {v3, v1}, Lcom/google/android/gms/vision/MultiProcessor$zza;->zza(Lcom/google/android/gms/vision/MultiProcessor$zza;I)I

    .line 41
    invoke-static {v3}, Lcom/google/android/gms/vision/MultiProcessor$zza;->zza(Lcom/google/android/gms/vision/MultiProcessor$zza;)Lcom/google/android/gms/vision/Tracker;

    move-result-object v3

    invoke-virtual {v3, p1, v4}, Lcom/google/android/gms/vision/Tracker;->onUpdate(Lcom/google/android/gms/vision/Detector$Detections;Ljava/lang/Object;)V

    add-int/lit8 v2, v2, 0x1

    goto :goto_4

    :cond_6
    return-void
.end method

.method public release()V
    .locals 2

    const/4 v0, 0x0

    .line 1
    :goto_0
    iget-object v1, p0, Lcom/google/android/gms/vision/MultiProcessor;->zzba:Landroid/util/SparseArray;

    invoke-virtual {v1}, Landroid/util/SparseArray;->size()I

    move-result v1

    if-ge v0, v1, :cond_0

    .line 2
    iget-object v1, p0, Lcom/google/android/gms/vision/MultiProcessor;->zzba:Landroid/util/SparseArray;

    invoke-virtual {v1, v0}, Landroid/util/SparseArray;->valueAt(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/google/android/gms/vision/MultiProcessor$zza;

    invoke-static {v1}, Lcom/google/android/gms/vision/MultiProcessor$zza;->zza(Lcom/google/android/gms/vision/MultiProcessor$zza;)Lcom/google/android/gms/vision/Tracker;

    move-result-object v1

    .line 3
    invoke-virtual {v1}, Lcom/google/android/gms/vision/Tracker;->onDone()V

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    .line 5
    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/vision/MultiProcessor;->zzba:Landroid/util/SparseArray;

    invoke-virtual {v0}, Landroid/util/SparseArray;->clear()V

    return-void
.end method
