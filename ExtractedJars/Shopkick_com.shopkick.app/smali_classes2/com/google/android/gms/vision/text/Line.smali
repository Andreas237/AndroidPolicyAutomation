.class public Lcom/google/android/gms/vision/text/Line;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/google/android/gms/vision/text/Text;


# instance fields
.field private zzet:Lcom/google/android/gms/internal/vision/zzae;

.field private zzeu:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/google/android/gms/vision/text/Element;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method constructor <init>(Lcom/google/android/gms/internal/vision/zzae;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Lcom/google/android/gms/vision/text/Line;->zzet:Lcom/google/android/gms/internal/vision/zzae;

    return-void
.end method


# virtual methods
.method public getAngle()F
    .locals 1

    .line 18
    iget-object v0, p0, Lcom/google/android/gms/vision/text/Line;->zzet:Lcom/google/android/gms/internal/vision/zzae;

    iget-object v0, v0, Lcom/google/android/gms/internal/vision/zzae;->zzfd:Lcom/google/android/gms/internal/vision/zzy;

    iget v0, v0, Lcom/google/android/gms/internal/vision/zzy;->zzfb:F

    return v0
.end method

.method public getBoundingBox()Landroid/graphics/Rect;
    .locals 1

    .line 6
    invoke-static {p0}, Lcom/google/android/gms/vision/text/zzc;->zza(Lcom/google/android/gms/vision/text/Text;)Landroid/graphics/Rect;

    move-result-object v0

    return-object v0
.end method

.method public getComponents()Ljava/util/List;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "+",
            "Lcom/google/android/gms/vision/text/Text;",
            ">;"
        }
    .end annotation

    .line 9
    iget-object v0, p0, Lcom/google/android/gms/vision/text/Line;->zzet:Lcom/google/android/gms/internal/vision/zzae;

    iget-object v0, v0, Lcom/google/android/gms/internal/vision/zzae;->zzfc:[Lcom/google/android/gms/internal/vision/zzan;

    array-length v0, v0

    const/4 v1, 0x0

    if-nez v0, :cond_0

    .line 10
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    return-object v0

    .line 11
    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/vision/text/Line;->zzeu:Ljava/util/List;

    if-nez v0, :cond_1

    .line 12
    new-instance v0, Ljava/util/ArrayList;

    iget-object v2, p0, Lcom/google/android/gms/vision/text/Line;->zzet:Lcom/google/android/gms/internal/vision/zzae;

    iget-object v2, v2, Lcom/google/android/gms/internal/vision/zzae;->zzfc:[Lcom/google/android/gms/internal/vision/zzan;

    array-length v2, v2

    invoke-direct {v0, v2}, Ljava/util/ArrayList;-><init>(I)V

    iput-object v0, p0, Lcom/google/android/gms/vision/text/Line;->zzeu:Ljava/util/List;

    .line 13
    iget-object v0, p0, Lcom/google/android/gms/vision/text/Line;->zzet:Lcom/google/android/gms/internal/vision/zzae;

    iget-object v0, v0, Lcom/google/android/gms/internal/vision/zzae;->zzfc:[Lcom/google/android/gms/internal/vision/zzan;

    array-length v2, v0

    :goto_0
    if-ge v1, v2, :cond_1

    aget-object v3, v0, v1

    .line 14
    iget-object v4, p0, Lcom/google/android/gms/vision/text/Line;->zzeu:Ljava/util/List;

    new-instance v5, Lcom/google/android/gms/vision/text/Element;

    invoke-direct {v5, v3}, Lcom/google/android/gms/vision/text/Element;-><init>(Lcom/google/android/gms/internal/vision/zzan;)V

    invoke-interface {v4, v5}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    .line 16
    :cond_1
    iget-object v0, p0, Lcom/google/android/gms/vision/text/Line;->zzeu:Ljava/util/List;

    return-object v0
.end method

.method public getCornerPoints()[Landroid/graphics/Point;
    .locals 1

    .line 7
    iget-object v0, p0, Lcom/google/android/gms/vision/text/Line;->zzet:Lcom/google/android/gms/internal/vision/zzae;

    iget-object v0, v0, Lcom/google/android/gms/internal/vision/zzae;->zzfd:Lcom/google/android/gms/internal/vision/zzy;

    invoke-static {v0}, Lcom/google/android/gms/vision/text/zzc;->zza(Lcom/google/android/gms/internal/vision/zzy;)[Landroid/graphics/Point;

    move-result-object v0

    return-object v0
.end method

.method public getLanguage()Ljava/lang/String;
    .locals 1

    .line 4
    iget-object v0, p0, Lcom/google/android/gms/vision/text/Line;->zzet:Lcom/google/android/gms/internal/vision/zzae;

    iget-object v0, v0, Lcom/google/android/gms/internal/vision/zzae;->zzex:Ljava/lang/String;

    return-object v0
.end method

.method public getValue()Ljava/lang/String;
    .locals 1

    .line 5
    iget-object v0, p0, Lcom/google/android/gms/vision/text/Line;->zzet:Lcom/google/android/gms/internal/vision/zzae;

    iget-object v0, v0, Lcom/google/android/gms/internal/vision/zzae;->zzfg:Ljava/lang/String;

    return-object v0
.end method

.method public isVertical()Z
    .locals 1

    .line 19
    iget-object v0, p0, Lcom/google/android/gms/vision/text/Line;->zzet:Lcom/google/android/gms/internal/vision/zzae;

    iget-boolean v0, v0, Lcom/google/android/gms/internal/vision/zzae;->zzfi:Z

    return v0
.end method
