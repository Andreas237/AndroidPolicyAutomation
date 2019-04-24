.class public Lcom/huawei/hwcloudmodel/model/unite/StressTotal;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private dataSource:Ljava/lang/Integer;

.field private deviceCode:Ljava/lang/Long;

.field private generateTime:Ljava/lang/Long;

.field private recordDay:Ljava/lang/Integer;

.field private stressBasic:Lcom/huawei/hwcloudmodel/model/unite/StressBasic;

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

    .line 38
    iput-object p1, p0, Lcom/huawei/hwcloudmodel/model/unite/StressTotal;->dataSource:Ljava/lang/Integer;

    .line 39
    return-void
.end method

.method public configDeviceCode(Ljava/lang/Long;)V
    .locals 0

    .line 46
    iput-object p1, p0, Lcom/huawei/hwcloudmodel/model/unite/StressTotal;->deviceCode:Ljava/lang/Long;

    .line 47
    return-void
.end method

.method public configGenerateTime(Ljava/lang/Long;)V
    .locals 0

    .line 30
    iput-object p1, p0, Lcom/huawei/hwcloudmodel/model/unite/StressTotal;->generateTime:Ljava/lang/Long;

    .line 31
    return-void
.end method

.method public configRecordDay(Ljava/lang/Integer;)V
    .locals 0

    .line 22
    iput-object p1, p0, Lcom/huawei/hwcloudmodel/model/unite/StressTotal;->recordDay:Ljava/lang/Integer;

    .line 23
    return-void
.end method

.method public configStressBasic(Lcom/huawei/hwcloudmodel/model/unite/StressBasic;)V
    .locals 0

    .line 54
    iput-object p1, p0, Lcom/huawei/hwcloudmodel/model/unite/StressTotal;->stressBasic:Lcom/huawei/hwcloudmodel/model/unite/StressBasic;

    .line 55
    return-void
.end method

.method public configTimeZone(Ljava/lang/String;)V
    .locals 0

    .line 62
    iput-object p1, p0, Lcom/huawei/hwcloudmodel/model/unite/StressTotal;->timeZone:Ljava/lang/String;

    .line 63
    return-void
.end method

.method public fetchDataSource()Ljava/lang/Integer;
    .locals 1

    .line 34
    iget-object v0, p0, Lcom/huawei/hwcloudmodel/model/unite/StressTotal;->dataSource:Ljava/lang/Integer;

    return-object v0
.end method

.method public fetchDeviceCode()Ljava/lang/Long;
    .locals 1

    .line 42
    iget-object v0, p0, Lcom/huawei/hwcloudmodel/model/unite/StressTotal;->deviceCode:Ljava/lang/Long;

    return-object v0
.end method

.method public fetchGenerateTime()Ljava/lang/Long;
    .locals 1

    .line 26
    iget-object v0, p0, Lcom/huawei/hwcloudmodel/model/unite/StressTotal;->generateTime:Ljava/lang/Long;

    return-object v0
.end method

.method public fetchRecordDay()Ljava/lang/Integer;
    .locals 1

    .line 18
    iget-object v0, p0, Lcom/huawei/hwcloudmodel/model/unite/StressTotal;->recordDay:Ljava/lang/Integer;

    return-object v0
.end method

.method public fetchStressBasic()Lcom/huawei/hwcloudmodel/model/unite/StressBasic;
    .locals 1

    .line 50
    iget-object v0, p0, Lcom/huawei/hwcloudmodel/model/unite/StressTotal;->stressBasic:Lcom/huawei/hwcloudmodel/model/unite/StressBasic;

    return-object v0
.end method

.method public fetchTimeZone()Ljava/lang/String;
    .locals 1

    .line 58
    iget-object v0, p0, Lcom/huawei/hwcloudmodel/model/unite/StressTotal;->timeZone:Ljava/lang/String;

    return-object v0
.end method
