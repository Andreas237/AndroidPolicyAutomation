.class public Lcom/huawei/hwcloudmodel/model/unite/ExerciseIntensityBasic;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private intensityMap:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<Ljava/lang/Integer;Ljava/lang/Integer;>;"
        }
    .end annotation
.end field

.field private totalMidHighIntensity:Ljava/lang/Integer;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 10
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public configIntensityMap(Ljava/util/Map;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/Map<Ljava/lang/Integer;Ljava/lang/Integer;>;)V"
        }
    .end annotation

    .line 19
    iput-object p1, p0, Lcom/huawei/hwcloudmodel/model/unite/ExerciseIntensityBasic;->intensityMap:Ljava/util/Map;

    .line 20
    return-void
.end method

.method public configTotalMidHighIntensity(Ljava/lang/Integer;)V
    .locals 0

    .line 27
    iput-object p1, p0, Lcom/huawei/hwcloudmodel/model/unite/ExerciseIntensityBasic;->totalMidHighIntensity:Ljava/lang/Integer;

    .line 28
    return-void
.end method

.method public fetchIntensityMap()Ljava/util/Map;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()Ljava/util/Map<Ljava/lang/Integer;Ljava/lang/Integer;>;"
        }
    .end annotation

    .line 15
    iget-object v0, p0, Lcom/huawei/hwcloudmodel/model/unite/ExerciseIntensityBasic;->intensityMap:Ljava/util/Map;

    return-object v0
.end method

.method public fetchTotalMidHighIntensity()Ljava/lang/Integer;
    .locals 1

    .line 23
    iget-object v0, p0, Lcom/huawei/hwcloudmodel/model/unite/ExerciseIntensityBasic;->totalMidHighIntensity:Ljava/lang/Integer;

    return-object v0
.end method
