.class public Lcom/huawei/operation/jsoperation/JsUtil;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/huawei/operation/jsoperation/JsUtil$DataFunc;,
        Lcom/huawei/operation/jsoperation/JsUtil$StressFunc;,
        Lcom/huawei/operation/jsoperation/JsUtil$ServiceType;
    }
.end annotation


# static fields
.field public static final ACCESS_TOKEN:Ljava/lang/String; = "accessToken"

.field public static final ANNUAL_YEAR:Ljava/lang/String; = "annual"

.field public static final APPID:Ljava/lang/String; = "appID"

.field public static final BLOODPRESSURE_DATA:I = 0x5

.field public static final BLOOD_PRESSURE_DIASTOLIC:Ljava/lang/String; = "BLOOD_PRESSURE_DIASTOLIC"

.field public static final BLOOD_PRESSURE_SYSTOLIC:Ljava/lang/String; = "BLOOD_PRESSURE_SYSTOLIC"

.field public static final BREATHE_TIME:Ljava/lang/String; = "breathe_time"

.field public static final COMMON_DATA:Ljava/lang/String; = "data"

.field public static final DATAS:Ljava/lang/String; = "datas"

.field public static final DATA_POINT_DYNAMIC_HEARTRATE:Ljava/lang/String; = "DATA_POINT_DYNAMIC_HEARTRATE"

.field public static final DURATION:Ljava/lang/String; = "duration"

.field public static final END_DATE:Ljava/lang/String; = "endDate"

.field public static final END_TIME:Ljava/lang/String; = "endTime"

.field public static final FUNCTION_RES:Ljava/lang/String; = "functionRes"

.field public static final JAVA_SCRIPT:Ljava/lang/String; = "javascript:"

.field public static final MANUFACTURER:Ljava/lang/String; = "manufacturer"

.field public static final RESULT_CODE:Ljava/lang/String; = "result_code"

.field public static final SAMPLEPOINTS:Ljava/lang/String; = "samplePoints"

.field public static final SCORE:Ljava/lang/String; = "score"

.field public static final SERVICE_NAME:Ljava/lang/String; = "serviceName"

.field public static final START_DATE:Ljava/lang/String; = "startDate"

.field public static final START_TIME:Ljava/lang/String; = "startTime"

.field public static final SUGAR_DATA:I = 0x4

.field public static final SUGGESTION_DATE:Ljava/lang/String; = "date"

.field public static final SUGGESTION_TOTAL_CALORIE:Ljava/lang/String; = "totalcalorie"

.field public static final SUGGESTION_TOTAL_DURATION:Ljava/lang/String; = "totalduration"

.field public static final SUMMARIES_KEY:Ljava/lang/String; = "summaries"

.field private static final TAG:Ljava/lang/String; = "Opera_JsUtil"

.field public static final TYPE:Ljava/lang/String; = "type"

.field public static final WEIGHT_FAT_DATA:I = 0x8


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 18
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static checkAuth(Lcom/huawei/operation/activity/WebViewActivity;Ljava/lang/String;Z)Z
    .locals 2

    .line 106
    if-eqz p2, :cond_0

    const/4 v0, 0x1

    return v0

    .line 107
    :cond_0
    const-string v0, "not auth"

    const/16 v1, 0x3eb

    invoke-static {p0, p1, v1, v0}, Lcom/huawei/operation/jsoperation/JsUtil;->runJsFunc(Lcom/huawei/operation/activity/WebViewActivity;Ljava/lang/String;ILjava/lang/Object;)V

    .line 108
    const/4 v0, 0x0

    return v0
.end method

.method public static checkParamIsLegal(Ljava/lang/String;Ljava/lang/String;)Z
    .locals 8

    .line 112
    const/4 v4, 0x0

    .line 113
    const/4 v5, 0x0

    .line 114
    const/4 v6, 0x0

    .line 115
    invoke-static {p0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 116
    :cond_0
    const/4 v0, 0x0

    return v0

    .line 119
    :cond_1
    :try_start_0
    invoke-static {p0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v4

    .line 120
    invoke-static {p1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I
    :try_end_0
    .catch Ljava/lang/NumberFormatException; {:try_start_0 .. :try_end_0} :catch_0

    move-result v5

    .line 124
    goto :goto_0

    .line 121
    :catch_0
    move-exception v7

    .line 122
    const-string v0, "Opera_JsUtil"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "JsUtil checkParamIsLegal NumberFormatException :"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v7}, Ljava/lang/NumberFormatException;->getMessage()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 123
    const/4 v0, 0x0

    return v0

    .line 125
    :goto_0
    if-le v4, v5, :cond_2

    .line 127
    const/4 v0, 0x0

    return v0

    .line 130
    :cond_2
    const-string v0, "yyyyMMdd"

    :try_start_1
    invoke-static {v4, v5, v0}, Lo/cnk;->d(IILjava/lang/String;)I
    :try_end_1
    .catch Ljava/text/ParseException; {:try_start_1 .. :try_end_1} :catch_1

    move-result v6

    .line 134
    goto :goto_1

    .line 131
    :catch_1
    move-exception v7

    .line 132
    const-string v0, "Opera_JsUtil"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "JsUtil checkParamIsLegal ParseException :"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v7}, Ljava/text/ParseException;->getMessage()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 133
    const/4 v0, 0x0

    return v0

    .line 135
    :goto_1
    const/4 v0, 0x1

    if-lt v6, v0, :cond_3

    const/16 v0, 0xa

    if-le v6, v0, :cond_4

    .line 137
    :cond_3
    const-string v0, "Opera_JsUtil"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "JsUtil checkParamIsLegal dayCounts = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v6}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 138
    const/4 v0, 0x0

    return v0

    .line 140
    :cond_4
    const/4 v0, 0x1

    return v0
.end method

.method public static getJsFunc(Ljava/lang/String;ILjava/lang/Object;)Ljava/lang/String;
    .locals 2

    .line 85
    if-eqz p0, :cond_0

    invoke-virtual {p0}, Ljava/lang/String;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_1

    :cond_0
    const/4 v0, 0x0

    return-object v0

    .line 86
    :cond_1
    const/4 v0, 0x0

    if-ne v0, p2, :cond_2

    .line 87
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "javascript:"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "( "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, " , null)"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0

    .line 89
    :cond_2
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "javascript:"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "( "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, " , "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-static {p2}, Lo/cnj;->d(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, " )"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public static runJsFunc(Lcom/huawei/operation/activity/WebViewActivity;Ljava/lang/String;ILjava/lang/Object;)V
    .locals 2

    .line 93
    invoke-static {p1, p2, p3}, Lcom/huawei/operation/jsoperation/JsUtil;->getJsFunc(Ljava/lang/String;ILjava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    .line 95
    if-eqz p0, :cond_0

    if-eqz v1, :cond_0

    invoke-virtual {v1}, Ljava/lang/String;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_1

    :cond_0
    return-void

    .line 96
    :cond_1
    new-instance v0, Lcom/huawei/operation/jsoperation/JsUtil$1;

    invoke-direct {v0, p0, v1}, Lcom/huawei/operation/jsoperation/JsUtil$1;-><init>(Lcom/huawei/operation/activity/WebViewActivity;Ljava/lang/String;)V

    invoke-virtual {p0, v0}, Lcom/huawei/operation/activity/WebViewActivity;->runOnUiThread(Ljava/lang/Runnable;)V

    .line 103
    return-void
.end method
