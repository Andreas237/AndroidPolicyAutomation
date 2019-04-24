.class public Lcom/google/android/gms/vision/CameraSource$Builder;
.super Ljava/lang/Object;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/android/gms/vision/CameraSource;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "Builder"
.end annotation


# instance fields
.field private final zzr:Lcom/google/android/gms/vision/Detector;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/android/gms/vision/Detector<",
            "*>;"
        }
    .end annotation
.end field

.field private zzs:Lcom/google/android/gms/vision/CameraSource;


# direct methods
.method public constructor <init>(Landroid/content/Context;Lcom/google/android/gms/vision/Detector;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "Lcom/google/android/gms/vision/Detector<",
            "*>;)V"
        }
    .end annotation

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    new-instance v0, Lcom/google/android/gms/vision/CameraSource;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/google/android/gms/vision/CameraSource;-><init>(Lcom/google/android/gms/vision/zza;)V

    iput-object v0, p0, Lcom/google/android/gms/vision/CameraSource$Builder;->zzs:Lcom/google/android/gms/vision/CameraSource;

    if-eqz p1, :cond_1

    if-eqz p2, :cond_0

    .line 7
    iput-object p2, p0, Lcom/google/android/gms/vision/CameraSource$Builder;->zzr:Lcom/google/android/gms/vision/Detector;

    .line 8
    iget-object p2, p0, Lcom/google/android/gms/vision/CameraSource$Builder;->zzs:Lcom/google/android/gms/vision/CameraSource;

    invoke-static {p2, p1}, Lcom/google/android/gms/vision/CameraSource;->zza(Lcom/google/android/gms/vision/CameraSource;Landroid/content/Context;)Landroid/content/Context;

    return-void

    .line 6
    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "No detector supplied."

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 4
    :cond_1
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "No context supplied."

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method


# virtual methods
.method public build()Lcom/google/android/gms/vision/CameraSource;
    .locals 3

    .line 25
    iget-object v0, p0, Lcom/google/android/gms/vision/CameraSource$Builder;->zzs:Lcom/google/android/gms/vision/CameraSource;

    new-instance v1, Lcom/google/android/gms/vision/CameraSource$zzb;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-object v2, p0, Lcom/google/android/gms/vision/CameraSource$Builder;->zzr:Lcom/google/android/gms/vision/Detector;

    invoke-direct {v1, v0, v2}, Lcom/google/android/gms/vision/CameraSource$zzb;-><init>(Lcom/google/android/gms/vision/CameraSource;Lcom/google/android/gms/vision/Detector;)V

    invoke-static {v0, v1}, Lcom/google/android/gms/vision/CameraSource;->zza(Lcom/google/android/gms/vision/CameraSource;Lcom/google/android/gms/vision/CameraSource$zzb;)Lcom/google/android/gms/vision/CameraSource$zzb;

    .line 26
    iget-object v0, p0, Lcom/google/android/gms/vision/CameraSource$Builder;->zzs:Lcom/google/android/gms/vision/CameraSource;

    return-object v0
.end method

.method public setAutoFocusEnabled(Z)Lcom/google/android/gms/vision/CameraSource$Builder;
    .locals 1

    .line 23
    iget-object v0, p0, Lcom/google/android/gms/vision/CameraSource$Builder;->zzs:Lcom/google/android/gms/vision/CameraSource;

    invoke-static {v0, p1}, Lcom/google/android/gms/vision/CameraSource;->zza(Lcom/google/android/gms/vision/CameraSource;Z)Z

    return-object p0
.end method

.method public setFacing(I)Lcom/google/android/gms/vision/CameraSource$Builder;
    .locals 3

    if-eqz p1, :cond_1

    const/4 v0, 0x1

    if-ne p1, v0, :cond_0

    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const/16 v1, 0x1b

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2, v1}, Ljava/lang/StringBuilder;-><init>(I)V

    const-string v1, "Invalid camera: "

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 21
    :cond_1
    :goto_0
    iget-object v0, p0, Lcom/google/android/gms/vision/CameraSource$Builder;->zzs:Lcom/google/android/gms/vision/CameraSource;

    invoke-static {v0, p1}, Lcom/google/android/gms/vision/CameraSource;->zzc(Lcom/google/android/gms/vision/CameraSource;I)I

    return-object p0
.end method

.method public setRequestedFps(F)Lcom/google/android/gms/vision/CameraSource$Builder;
    .locals 3

    const/4 v0, 0x0

    cmpg-float v0, p1, v0

    if-lez v0, :cond_0

    .line 12
    iget-object v0, p0, Lcom/google/android/gms/vision/CameraSource$Builder;->zzs:Lcom/google/android/gms/vision/CameraSource;

    invoke-static {v0, p1}, Lcom/google/android/gms/vision/CameraSource;->zza(Lcom/google/android/gms/vision/CameraSource;F)F

    return-object p0

    .line 11
    :cond_0
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const/16 v1, 0x1c

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2, v1}, Ljava/lang/StringBuilder;-><init>(I)V

    const-string v1, "Invalid fps: "

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public setRequestedPreviewSize(II)Lcom/google/android/gms/vision/CameraSource$Builder;
    .locals 3

    if-lez p1, :cond_0

    const v0, 0xf4240

    if-gt p1, v0, :cond_0

    if-lez p2, :cond_0

    if-gt p2, v0, :cond_0

    .line 16
    iget-object v0, p0, Lcom/google/android/gms/vision/CameraSource$Builder;->zzs:Lcom/google/android/gms/vision/CameraSource;

    invoke-static {v0, p1}, Lcom/google/android/gms/vision/CameraSource;->zza(Lcom/google/android/gms/vision/CameraSource;I)I

    .line 17
    iget-object p1, p0, Lcom/google/android/gms/vision/CameraSource$Builder;->zzs:Lcom/google/android/gms/vision/CameraSource;

    invoke-static {p1, p2}, Lcom/google/android/gms/vision/CameraSource;->zzb(Lcom/google/android/gms/vision/CameraSource;I)I

    return-object p0

    .line 15
    :cond_0
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const/16 v1, 0x2d

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2, v1}, Ljava/lang/StringBuilder;-><init>(I)V

    const-string v1, "Invalid preview size: "

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string/jumbo p1, "x"

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0
.end method
