.class public Lcom/huawei/hihealthservice/old/model/HealthOpenContactTable;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/huawei/hihealthservice/old/model/HealthOpenContactTable$SleepStatisticsColums;,
        Lcom/huawei/hihealthservice/old/model/HealthOpenContactTable$SportStatisticsColums;,
        Lcom/huawei/hihealthservice/old/model/HealthOpenContactTable$ECGColums;,
        Lcom/huawei/hihealthservice/old/model/HealthOpenContactTable$BloodPressureColums;,
        Lcom/huawei/hihealthservice/old/model/HealthOpenContactTable$BloodSugarColums;,
        Lcom/huawei/hihealthservice/old/model/HealthOpenContactTable$HeartRateColums;,
        Lcom/huawei/hihealthservice/old/model/HealthOpenContactTable$BodyFatRatColums;,
        Lcom/huawei/hihealthservice/old/model/HealthOpenContactTable$HeightColumns;,
        Lcom/huawei/hihealthservice/old/model/HealthOpenContactTable$WeightColumns;,
        Lcom/huawei/hihealthservice/old/model/HealthOpenContactTable$SleepColumns;,
        Lcom/huawei/hihealthservice/old/model/HealthOpenContactTable$SportColumns;,
        Lcom/huawei/hihealthservice/old/model/HealthOpenContactTable$CommonRawColumns;,
        Lcom/huawei/hihealthservice/old/model/HealthOpenContactTable$DeviceColumns;,
        Lcom/huawei/hihealthservice/old/model/HealthOpenContactTable$AppColumns;,
        Lcom/huawei/hihealthservice/old/model/HealthOpenContactTable$UserColumns;,
        Lcom/huawei/hihealthservice/old/model/HealthOpenContactTable$AuthorityColumns;,
        Lcom/huawei/hihealthservice/old/model/HealthOpenContactTable$AuthorityIndexs;,
        Lcom/huawei/hihealthservice/old/model/HealthOpenContactTable$AuthorityStatus;,
        Lcom/huawei/hihealthservice/old/model/HealthOpenContactTable$CodeSet;,
        Lcom/huawei/hihealthservice/old/model/HealthOpenContactTable$PathTable;,
        Lcom/huawei/hihealthservice/old/model/HealthOpenContactTable$AuthorityKey;
    }
.end annotation


# static fields
.field public static final HEALTH_OPEN_API_RECEIVE_ACTION:Ljava/lang/String; = "com.huawei.healthcloud.healthdatastore"

.field public static final HEALTH_OPEN_API_SEND_ACTION:Ljava/lang/String; = "com.huawei.healthcloud.app.AUTHORITY"

.field public static final HEALTH_OPEN_API_URI:Ljava/lang/String; = "content://com.huawei.healthcloud.health.provider"


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 23
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static getApiURI(Ljava/lang/String;)Landroid/net/Uri;
    .locals 3

    .line 362
    new-instance v0, Ljava/lang/StringBuffer;

    invoke-direct {v0}, Ljava/lang/StringBuffer;-><init>()V

    const-string v1, "content://com.huawei.healthcloud.health.provider"

    .line 363
    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    const-string v1, "/"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    invoke-virtual {v0, p0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;

    move-result-object v2

    .line 365
    invoke-static {v2}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v0

    return-object v0
.end method
