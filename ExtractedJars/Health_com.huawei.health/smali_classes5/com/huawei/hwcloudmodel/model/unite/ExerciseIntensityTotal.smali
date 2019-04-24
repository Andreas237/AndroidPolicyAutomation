.class public Lcom/huawei/hwcloudmodel/model/unite/ExerciseIntensityTotal;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private dataSource:Ljava/lang/Integer;

.field private deviceCode:Ljava/lang/Long;

.field private exerciseIntensityBasic:Lcom/huawei/hwcloudmodel/model/unite/ExerciseIntensityBasic;

.field private generateTime:Ljava/lang/Long;

.field private recordDay:Ljava/lang/Integer;

.field private timeZone:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 8
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public configDataSource(Ljava/lang/Integer;)V
    .locals 0

    .line 37
    iput-object p1, p0, Lcom/huawei/hwcloudmodel/model/unite/ExerciseIntensityTotal;->dataSource:Ljava/lang/Integer;

    .line 38
    return-void
.end method

.method public configDeviceCode(Ljava/lang/Long;)V
    .locals 0

    .line 45
    iput-object p1, p0, Lcom/huawei/hwcloudmodel/model/unite/ExerciseIntensityTotal;->deviceCode:Ljava/lang/Long;

    .line 46
    return-void
.end method

.method public configExerciseIntensityBasic(Lcom/huawei/hwcloudmodel/model/unite/ExerciseIntensityBasic;)V
    .locals 0

    .line 53
    iput-object p1, p0, Lcom/huawei/hwcloudmodel/model/unite/ExerciseIntensityTotal;->exerciseIntensityBasic:Lcom/huawei/hwcloudmodel/model/unite/ExerciseIntensityBasic;

    .line 54
    return-void
.end method

.method public configGenerateTime(Ljava/lang/Long;)V
    .locals 0

    .line 29
    iput-object p1, p0, Lcom/huawei/hwcloudmodel/model/unite/ExerciseIntensityTotal;->generateTime:Ljava/lang/Long;

    .line 30
    return-void
.end method

.method public configRecordDay(Ljava/lang/Integer;)V
    .locals 0

    .line 21
    iput-object p1, p0, Lcom/huawei/hwcloudmodel/model/unite/ExerciseIntensityTotal;->recordDay:Ljava/lang/Integer;

    .line 22
    return-void
.end method

.method public configTimeZone(Ljava/lang/String;)V
    .locals 0

    .line 61
    iput-object p1, p0, Lcom/huawei/hwcloudmodel/model/unite/ExerciseIntensityTotal;->timeZone:Ljava/lang/String;

    .line 62
    return-void
.end method

.method public fetchDataSource()Ljava/lang/Integer;
    .locals 1

    .line 33
    iget-object v0, p0, Lcom/huawei/hwcloudmodel/model/unite/ExerciseIntensityTotal;->dataSource:Ljava/lang/Integer;

    return-object v0
.end method

.method public fetchDeviceCode()Ljava/lang/Long;
    .locals 1

    .line 41
    iget-object v0, p0, Lcom/huawei/hwcloudmodel/model/unite/ExerciseIntensityTotal;->deviceCode:Ljava/lang/Long;

    return-object v0
.end method

.method public fetchExerciseIntensityBasic()Lcom/huawei/hwcloudmodel/model/unite/ExerciseIntensityBasic;
    .locals 1

    .line 49
    iget-object v0, p0, Lcom/huawei/hwcloudmodel/model/unite/ExerciseIntensityTotal;->exerciseIntensityBasic:Lcom/huawei/hwcloudmodel/model/unite/ExerciseIntensityBasic;

    return-object v0
.end method

.method public fetchGenerateTime()Ljava/lang/Long;
    .locals 1

    .line 25
    iget-object v0, p0, Lcom/huawei/hwcloudmodel/model/unite/ExerciseIntensityTotal;->generateTime:Ljava/lang/Long;

    return-object v0
.end method

.method public fetchRecordDay()Ljava/lang/Integer;
    .locals 1

    .line 17
    iget-object v0, p0, Lcom/huawei/hwcloudmodel/model/unite/ExerciseIntensityTotal;->recordDay:Ljava/lang/Integer;

    return-object v0
.end method

.method public fetchTimeZone()Ljava/lang/String;
    .locals 1

    .line 57
    iget-object v0, p0, Lcom/huawei/hwcloudmodel/model/unite/ExerciseIntensityTotal;->timeZone:Ljava/lang/String;

    return-object v0
.end method
