.class public Lcom/google/android/gms/vision/face/LargestFaceFocusingProcessor;
.super Lcom/google/android/gms/vision/FocusingProcessor;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/google/android/gms/vision/face/LargestFaceFocusingProcessor$Builder;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/google/android/gms/vision/FocusingProcessor<",
        "Lcom/google/android/gms/vision/face/Face;",
        ">;"
    }
.end annotation


# direct methods
.method public constructor <init>(Lcom/google/android/gms/vision/Detector;Lcom/google/android/gms/vision/Tracker;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/vision/Detector<",
            "Lcom/google/android/gms/vision/face/Face;",
            ">;",
            "Lcom/google/android/gms/vision/Tracker<",
            "Lcom/google/android/gms/vision/face/Face;",
            ">;)V"
        }
    .end annotation

    .line 1
    invoke-direct {p0, p1, p2}, Lcom/google/android/gms/vision/FocusingProcessor;-><init>(Lcom/google/android/gms/vision/Detector;Lcom/google/android/gms/vision/Tracker;)V

    return-void
.end method

.method static synthetic zza(Lcom/google/android/gms/vision/face/LargestFaceFocusingProcessor;I)V
    .locals 0

    .line 17
    invoke-virtual {p0, p1}, Lcom/google/android/gms/vision/FocusingProcessor;->zza(I)V

    return-void
.end method


# virtual methods
.method public selectFocus(Lcom/google/android/gms/vision/Detector$Detections;)I
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/vision/Detector$Detections<",
            "Lcom/google/android/gms/vision/face/Face;",
            ">;)I"
        }
    .end annotation

    .line 3
    invoke-virtual {p1}, Lcom/google/android/gms/vision/Detector$Detections;->getDetectedItems()Landroid/util/SparseArray;

    move-result-object p1

    .line 4
    invoke-virtual {p1}, Landroid/util/SparseArray;->size()I

    move-result v0

    if-eqz v0, :cond_2

    const/4 v0, 0x0

    .line 6
    invoke-virtual {p1, v0}, Landroid/util/SparseArray;->keyAt(I)I

    move-result v1

    .line 7
    invoke-virtual {p1, v0}, Landroid/util/SparseArray;->valueAt(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/vision/face/Face;

    invoke-virtual {v0}, Lcom/google/android/gms/vision/face/Face;->getWidth()F

    move-result v0

    const/4 v2, 0x1

    .line 8
    :goto_0
    invoke-virtual {p1}, Landroid/util/SparseArray;->size()I

    move-result v3

    if-ge v2, v3, :cond_1

    .line 9
    invoke-virtual {p1, v2}, Landroid/util/SparseArray;->keyAt(I)I

    move-result v3

    .line 10
    invoke-virtual {p1, v2}, Landroid/util/SparseArray;->valueAt(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lcom/google/android/gms/vision/face/Face;

    .line 11
    invoke-virtual {v4}, Lcom/google/android/gms/vision/face/Face;->getWidth()F

    move-result v4

    cmpl-float v5, v4, v0

    if-lez v5, :cond_0

    move v1, v3

    move v0, v4

    :cond_0
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_1
    return v1

    .line 5
    :cond_2
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "No faces for selectFocus."

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method
