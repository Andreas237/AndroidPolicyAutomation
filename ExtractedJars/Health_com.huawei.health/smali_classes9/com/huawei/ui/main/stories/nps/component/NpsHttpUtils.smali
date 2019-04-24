.class public Lcom/huawei/ui/main/stories/nps/component/NpsHttpUtils;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final URL_NPS_COMMIT:Ljava/lang/String; = "http://ccpc-cn.consumer.huawei.com/ccpcmd/services/dispatch/secured/CCPC/EN/ccpcnps/submitSurveyV2/1"

.field private static final URL_NPS_QUERY:Ljava/lang/String; = " http://ccpc-cn.consumer.huawei.com/ccpcmd/services/dispatch/secured/CCPC/EN/ccpcnps/getSurveyV2/1"


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 15
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static commitSurvey()V
    .locals 0

    .line 46
    return-void
.end method

.method public static querySurvey(Landroid/content/Context;Lcom/huawei/ui/main/stories/nps/https/HttpResCallBack;)V
    .locals 4

    .line 22
    new-instance v2, Ljava/util/HashMap;

    invoke-direct {v2}, Ljava/util/HashMap;-><init>()V

    .line 24
    new-instance v3, Ljava/util/HashMap;

    invoke-direct {v3}, Ljava/util/HashMap;-><init>()V

    .line 25
    const-string v0, "surveyID"

    const-string v1, "8206d9f6-8816-11e7-b0e5-fa163ec7a185"

    invoke-virtual {v3, v0, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 26
    const-string v0, "systemid"

    const-string v1, "sawshark_sw-userdebug 7.1.1 NXH19V eng.m00230.20170621.174057 test-keys"

    invoke-virtual {v3, v0, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 27
    const-string v0, "os"

    const-string v1, "Android 7.1.1"

    invoke-virtual {v3, v0, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 28
    const-string v0, "channel"

    const-string v1, "100001"

    invoke-virtual {v3, v0, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 29
    const-string v0, "times"

    const-string v1, "100001"

    invoke-virtual {v3, v0, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 30
    const-string v0, "answers"

    const-string v1, "[{\\\"questionId\\\":1,\\\"answer\\\":\\\"9\u5206\\\"},{\\\"questionId\\\":2,\\\"answer\\\":\\\"10\u5206\uff08\u975e\u5e38\u613f\u610f\uff09\\\"},{\\\"questionId\\\":3,\\\"answer\\\":\\\"\u6ca1\u6709\u4ec0\u4e48\u60f3\u8bf4\u4e86   \\\"}]"

    invoke-virtual {v3, v0, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 31
    const-string v0, "language"

    const-string v1, "zh-CN"

    invoke-virtual {v3, v0, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 32
    const-string v0, "cVer"

    const-string v1, "50000200"

    invoke-virtual {v3, v0, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 33
    const-string v0, "emuiVersion"

    const-string v1, "cVersionName="

    invoke-virtual {v3, v0, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 34
    const-string v0, "countryCode"

    const-string v1, "460"

    invoke-virtual {v3, v0, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 35
    const-string v0, "appID"

    const-string v1, "20"

    invoke-virtual {v3, v0, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 36
    const-string v0, "model"

    const-string v1, "LEO-DLXX"

    invoke-virtual {v3, v0, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 37
    const-string v0, "sn"

    const-string v1, "QEV7N17308000753"

    invoke-virtual {v3, v0, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 38
    const-string v0, "imeiEnc"

    const-string v1, ""

    invoke-virtual {v3, v0, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 39
    const-string v0, "brand"

    const-string v1, ""

    invoke-virtual {v3, v0, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 40
    const-string v0, "firmware"

    const-string v1, "sawshark_sw-userdebug 7.1.1 NXH19V eng.m00230.20170621.174057 test-keys"

    invoke-virtual {v3, v0, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 41
    const-string v0, " http://ccpc-cn.consumer.huawei.com/ccpcmd/services/dispatch/secured/CCPC/EN/ccpcnps/getSurveyV2/1"

    invoke-static {p0, v0, v3, v2, p1}, Lcom/huawei/ui/main/stories/nps/https/HttpUtils;->postReq(Landroid/content/Context;Ljava/lang/String;Ljava/util/HashMap;Ljava/util/HashMap;Lcom/huawei/ui/main/stories/nps/https/HttpResCallBack;)I

    .line 42
    return-void
.end method
