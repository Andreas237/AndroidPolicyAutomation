.class public Lcom/huawei/operation/jsoperation/DataService;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/huawei/operation/jsoperation/JsCommand;


# static fields
.field private static final TAG:Ljava/lang/String; = "Opera_DataService"


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 36
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 38
    return-void
.end method

.method private getAnnualReport(Lcom/huawei/operation/activity/WebViewActivity;Lcom/huawei/operation/adapter/PluginOperationAdapter;Lcom/huawei/operation/jsoperation/JsCommandOption;)V
    .locals 8

    .line 173
    invoke-virtual {p3}, Lcom/huawei/operation/jsoperation/JsCommandOption;->getFunctionRes()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p3}, Lcom/huawei/operation/jsoperation/JsCommandOption;->isLegal()Z

    move-result v1

    invoke-static {p1, v0, v1}, Lcom/huawei/operation/jsoperation/JsUtil;->checkAuth(Lcom/huawei/operation/activity/WebViewActivity;Ljava/lang/String;Z)Z

    move-result v0

    if-nez v0, :cond_0

    .line 174
    return-void

    .line 177
    :cond_0
    invoke-virtual {p3}, Lcom/huawei/operation/jsoperation/JsCommandOption;->getParam()Ljava/lang/String;

    move-result-object v4

    .line 178
    invoke-virtual {p3}, Lcom/huawei/operation/jsoperation/JsCommandOption;->getFunctionRes()Ljava/lang/String;

    move-result-object v5

    .line 179
    const/4 v6, 0x0

    .line 182
    :try_start_0
    new-instance v7, Lorg/json/JSONObject;

    invoke-direct {v7, v4}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    .line 183
    const-string v0, "annual"

    invoke-virtual {v7, v0}, Lorg/json/JSONObject;->getInt(Ljava/lang/String;)I
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    move-result v6

    .line 188
    goto :goto_0

    .line 184
    :catch_0
    move-exception v7

    .line 185
    const-string v0, "Opera_DataService"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getAnnualReport parse param json fail!"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 186
    const/16 v0, 0x3e9

    const/4 v1, 0x0

    invoke-static {p1, v5, v0, v1}, Lcom/huawei/operation/jsoperation/JsUtil;->runJsFunc(Lcom/huawei/operation/activity/WebViewActivity;Ljava/lang/String;ILjava/lang/Object;)V

    .line 187
    return-void

    .line 190
    :goto_0
    new-instance v0, Lcom/huawei/operation/jsoperation/DataService$3;

    invoke-direct {v0, p0, p1, v5}, Lcom/huawei/operation/jsoperation/DataService$3;-><init>(Lcom/huawei/operation/jsoperation/DataService;Lcom/huawei/operation/activity/WebViewActivity;Ljava/lang/String;)V

    invoke-interface {p2, v6, v0}, Lcom/huawei/operation/adapter/PluginOperationAdapter;->getAnnualReport(ILcom/huawei/hwbasemgr/IBaseResponseCallback;)V

    .line 203
    return-void
.end method

.method private insertHealthData(Lcom/huawei/operation/activity/WebViewActivity;Lcom/huawei/operation/jsoperation/JsCommandOption;)V
    .locals 11

    .line 80
    invoke-virtual {p2}, Lcom/huawei/operation/jsoperation/JsCommandOption;->getFunctionRes()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p2}, Lcom/huawei/operation/jsoperation/JsCommandOption;->isLegal()Z

    move-result v1

    invoke-static {p1, v0, v1}, Lcom/huawei/operation/jsoperation/JsUtil;->checkAuth(Lcom/huawei/operation/activity/WebViewActivity;Ljava/lang/String;Z)Z

    move-result v0

    if-nez v0, :cond_0

    .line 81
    return-void

    .line 83
    :cond_0
    invoke-virtual {p2}, Lcom/huawei/operation/jsoperation/JsCommandOption;->getParam()Ljava/lang/String;

    move-result-object v4

    .line 84
    invoke-virtual {p2}, Lcom/huawei/operation/jsoperation/JsCommandOption;->getFunctionRes()Ljava/lang/String;

    move-result-object v5

    .line 85
    const-string v6, ""

    .line 86
    const/4 v7, 0x0

    .line 87
    new-instance v8, Ljava/util/ArrayList;

    invoke-direct {v8}, Ljava/util/ArrayList;-><init>()V

    .line 89
    :try_start_0
    new-instance v9, Lorg/json/JSONObject;

    invoke-direct {v9, v4}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    .line 90
    const-string v0, "appID"

    invoke-virtual {v9, v0}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    .line 91
    const-string v0, "type"

    invoke-virtual {v9, v0}, Lorg/json/JSONObject;->getInt(Ljava/lang/String;)I

    move-result v7

    .line 92
    const-string v0, "datas"

    invoke-virtual {v9, v0}, Lorg/json/JSONObject;->get(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    move-object v10, v0

    check-cast v10, Lorg/json/JSONArray;

    .line 93
    invoke-virtual {v10}, Lorg/json/JSONArray;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v7, v0, v6, v8}, Lcom/huawei/operation/jsoperation/PluginOperationDataStored;->parseHealthData(ILjava/lang/String;Ljava/lang/String;Ljava/util/List;)V
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    .line 98
    goto :goto_0

    .line 94
    :catch_0
    move-exception v9

    .line 95
    const-string v0, "Opera_DataService"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "registerDataClient JSONException param fail e = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v9}, Lorg/json/JSONException;->getMessage()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 96
    const/16 v0, 0x3e9

    const/4 v1, 0x0

    invoke-static {p1, v5, v0, v1}, Lcom/huawei/operation/jsoperation/JsUtil;->runJsFunc(Lcom/huawei/operation/activity/WebViewActivity;Ljava/lang/String;ILjava/lang/Object;)V

    .line 97
    return-void

    .line 99
    :goto_0
    invoke-interface {v8}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 100
    const-string v0, "Opera_DataService"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "hiHealthDatas.isEmpty())"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 101
    const/16 v0, 0x3e9

    const/4 v1, 0x0

    invoke-static {p1, v5, v0, v1}, Lcom/huawei/operation/jsoperation/JsUtil;->runJsFunc(Lcom/huawei/operation/activity/WebViewActivity;Ljava/lang/String;ILjava/lang/Object;)V

    .line 102
    return-void

    .line 104
    :cond_1
    const-string v0, "Opera_DataService"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "insertHealthData appID = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 105
    const-string v0, "Opera_DataService"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "insertHealthData type = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v7}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 106
    const-string v0, "Opera_DataService"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "begining insert HealthData "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 107
    new-instance v9, Lcom/huawei/hihealth/HiDataInsertOption;

    invoke-direct {v9}, Lcom/huawei/hihealth/HiDataInsertOption;-><init>()V

    .line 108
    invoke-virtual {v9, v8}, Lcom/huawei/hihealth/HiDataInsertOption;->setDatas(Ljava/util/List;)V

    .line 109
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lo/clp;->b(Landroid/content/Context;)Lo/clt;

    move-result-object v0

    new-instance v1, Lcom/huawei/operation/jsoperation/DataService$1;

    invoke-direct {v1, p0, p1, v5}, Lcom/huawei/operation/jsoperation/DataService$1;-><init>(Lcom/huawei/operation/jsoperation/DataService;Lcom/huawei/operation/activity/WebViewActivity;Ljava/lang/String;)V

    invoke-interface {v0, v9, v1}, Lo/clt;->c(Lcom/huawei/hihealth/HiDataInsertOption;Lo/cma;)V

    .line 124
    return-void
.end method

.method private registerDataClient(Lcom/huawei/operation/activity/WebViewActivity;Lcom/huawei/operation/jsoperation/JsCommandOption;)V
    .locals 11

    .line 127
    invoke-virtual {p2}, Lcom/huawei/operation/jsoperation/JsCommandOption;->getFunctionRes()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p2}, Lcom/huawei/operation/jsoperation/JsCommandOption;->isLegal()Z

    move-result v1

    invoke-static {p1, v0, v1}, Lcom/huawei/operation/jsoperation/JsUtil;->checkAuth(Lcom/huawei/operation/activity/WebViewActivity;Ljava/lang/String;Z)Z

    move-result v0

    if-nez v0, :cond_0

    .line 128
    return-void

    .line 130
    :cond_0
    invoke-virtual {p2}, Lcom/huawei/operation/jsoperation/JsCommandOption;->getParam()Ljava/lang/String;

    move-result-object v4

    .line 131
    invoke-virtual {p2}, Lcom/huawei/operation/jsoperation/JsCommandOption;->getFunctionRes()Ljava/lang/String;

    move-result-object v5

    .line 132
    const-string v6, ""

    .line 133
    const-string v7, ""

    .line 134
    const-string v8, ""

    .line 136
    :try_start_0
    new-instance v9, Lorg/json/JSONObject;

    invoke-direct {v9, v4}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    .line 137
    const-string v0, "appID"

    invoke-virtual {v9, v0}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    .line 138
    const-string v0, "serviceName"

    invoke-virtual {v9, v0}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    .line 139
    const-string v0, "manufacturer"

    invoke-virtual {v9, v0}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v8

    .line 144
    goto :goto_0

    .line 140
    :catch_0
    move-exception v9

    .line 141
    const-string v0, "Opera_DataService"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "registerDataClient JSONException param fail e = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v9}, Lorg/json/JSONException;->getMessage()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 142
    const/16 v0, 0x3e9

    const/4 v1, 0x0

    invoke-static {p1, v5, v0, v1}, Lcom/huawei/operation/jsoperation/JsUtil;->runJsFunc(Lcom/huawei/operation/activity/WebViewActivity;Ljava/lang/String;ILjava/lang/Object;)V

    .line 143
    return-void

    .line 145
    :goto_0
    const-string v0, "Opera_DataService"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "registerDataClient appID = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 146
    const-string v0, "Opera_DataService"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "registerDataClient serviceName = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 147
    const-string v0, "Opera_DataService"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "registerDataClient manufacturer = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 148
    const-string v0, "Opera_DataService"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "registerDeviceToHiHealth enter"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 149
    new-instance v9, Lcom/huawei/hihealth/HiDeviceInfo;

    invoke-direct {v9}, Lcom/huawei/hihealth/HiDeviceInfo;-><init>()V

    .line 150
    invoke-virtual {v9, v6}, Lcom/huawei/hihealth/HiDeviceInfo;->setDeviceUniqueCode(Ljava/lang/String;)V

    .line 151
    invoke-virtual {v9, v7}, Lcom/huawei/hihealth/HiDeviceInfo;->setDeviceName(Ljava/lang/String;)V

    .line 152
    invoke-virtual {v9, v8}, Lcom/huawei/hihealth/HiDeviceInfo;->setManufacturer(Ljava/lang/String;)V

    .line 153
    const/16 v0, 0x2711

    invoke-virtual {v9, v0}, Lcom/huawei/hihealth/HiDeviceInfo;->setDeviceType(I)V

    .line 154
    new-instance v10, Ljava/util/ArrayList;

    invoke-direct {v10}, Ljava/util/ArrayList;-><init>()V

    .line 155
    const/4 v0, 0x0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-interface {v10, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 156
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lo/clp;->b(Landroid/content/Context;)Lo/clt;

    move-result-object v0

    new-instance v1, Lcom/huawei/operation/jsoperation/DataService$2;

    invoke-direct {v1, p0, p1, v5}, Lcom/huawei/operation/jsoperation/DataService$2;-><init>(Lcom/huawei/operation/jsoperation/DataService;Lcom/huawei/operation/activity/WebViewActivity;Ljava/lang/String;)V

    invoke-interface {v0, v9, v10, v1}, Lo/clt;->c(Lcom/huawei/hihealth/HiDeviceInfo;Ljava/util/List;Lo/cme;)V

    .line 170
    return-void
.end method

.method private selectFitnessData(Lcom/huawei/operation/activity/WebViewActivity;Lcom/huawei/operation/adapter/PluginOperationAdapter;Lcom/huawei/operation/jsoperation/JsCommandOption;)V
    .locals 15

    .line 275
    invoke-virtual/range {p3 .. p3}, Lcom/huawei/operation/jsoperation/JsCommandOption;->getFunctionRes()Ljava/lang/String;

    move-result-object v0

    invoke-virtual/range {p3 .. p3}, Lcom/huawei/operation/jsoperation/JsCommandOption;->isLegal()Z

    move-result v1

    move-object/from16 v2, p1

    invoke-static {v2, v0, v1}, Lcom/huawei/operation/jsoperation/JsUtil;->checkAuth(Lcom/huawei/operation/activity/WebViewActivity;Ljava/lang/String;Z)Z

    move-result v0

    if-nez v0, :cond_0

    .line 276
    return-void

    .line 278
    :cond_0
    invoke-virtual/range {p3 .. p3}, Lcom/huawei/operation/jsoperation/JsCommandOption;->getParam()Ljava/lang/String;

    move-result-object v4

    .line 279
    invoke-virtual/range {p3 .. p3}, Lcom/huawei/operation/jsoperation/JsCommandOption;->getFunctionRes()Ljava/lang/String;

    move-result-object v5

    .line 280
    const/4 v6, 0x0

    .line 281
    const/4 v7, 0x0

    .line 283
    :try_start_0
    new-instance v8, Lorg/json/JSONObject;

    invoke-direct {v8, v4}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    .line 284
    const-string v0, "startDate"

    invoke-virtual {v8, v0}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    .line 285
    const-string v0, "endDate"

    invoke-virtual {v8, v0}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v7

    .line 290
    goto :goto_0

    .line 286
    :catch_0
    move-exception v8

    .line 287
    const-string v0, "Opera_DataService"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "selectFitnessData parse param json fail! e = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v8}, Lorg/json/JSONException;->getMessage()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 288
    move-object/from16 v0, p1

    const/16 v1, 0x3e9

    const/4 v2, 0x0

    invoke-static {v0, v5, v1, v2}, Lcom/huawei/operation/jsoperation/JsUtil;->runJsFunc(Lcom/huawei/operation/activity/WebViewActivity;Ljava/lang/String;ILjava/lang/Object;)V

    .line 289
    return-void

    .line 291
    :goto_0
    const-string v0, "Opera_DataService"

    const/4 v1, 0x4

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "fitness Data startDate = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object v6, v1, v2

    const-string v2, ", endDate = "

    const/4 v3, 0x2

    aput-object v2, v1, v3

    const/4 v2, 0x3

    aput-object v7, v1, v2

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 292
    invoke-static {v6, v7}, Lcom/huawei/operation/jsoperation/JsUtil;->checkParamIsLegal(Ljava/lang/String;Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 293
    const-string v0, "Opera_DataService"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "JsUtil.checkParamIsLegal return false"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 294
    move-object/from16 v0, p1

    const/16 v1, 0x3e9

    const/4 v2, 0x0

    invoke-static {v0, v5, v1, v2}, Lcom/huawei/operation/jsoperation/JsUtil;->runJsFunc(Lcom/huawei/operation/activity/WebViewActivity;Ljava/lang/String;ILjava/lang/Object;)V

    .line 295
    return-void

    .line 298
    :cond_1
    move-object/from16 v0, p2

    invoke-interface {v0, v6, v7}, Lcom/huawei/operation/adapter/PluginOperationAdapter;->getRecordsByDateRange(Ljava/lang/String;Ljava/lang/String;)Ljava/util/List;

    move-result-object v8

    .line 299
    if-eqz v8, :cond_2

    invoke-interface {v8}, Ljava/util/List;->size()I

    move-result v0

    if-gtz v0, :cond_3

    .line 300
    :cond_2
    const-string v0, "Opera_DataService"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "sportListData == null || sportListData.size() <= 0"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 301
    move-object/from16 v0, p1

    const/4 v1, 0x0

    const/4 v2, 0x0

    invoke-static {v0, v5, v1, v2}, Lcom/huawei/operation/jsoperation/JsUtil;->runJsFunc(Lcom/huawei/operation/activity/WebViewActivity;Ljava/lang/String;ILjava/lang/Object;)V

    .line 302
    return-void

    .line 304
    :cond_3
    new-instance v9, Lorg/json/JSONObject;

    invoke-direct {v9}, Lorg/json/JSONObject;-><init>()V

    .line 305
    new-instance v10, Lorg/json/JSONArray;

    invoke-direct {v10}, Lorg/json/JSONArray;-><init>()V

    .line 306
    const-string v0, "Opera_DataService"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "getFitnessStat sportListData.size() == "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-interface {v8}, Ljava/util/List;->size()I

    move-result v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 307
    invoke-interface {v8}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v11

    :goto_1
    invoke-interface {v11}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_4

    invoke-interface {v11}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v12, v0

    check-cast v12, Ljava/util/Map;

    .line 308
    new-instance v13, Lorg/json/JSONObject;

    invoke-direct {v13}, Lorg/json/JSONObject;-><init>()V

    .line 310
    const-string v0, "date"

    const-string v1, "date"

    :try_start_1
    invoke-interface {v12, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(Ljava/lang/String;)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v13, v0, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 311
    const-string v0, "totalcalorie"

    const-string v1, "totalcalorie"

    invoke-interface {v12, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    invoke-static {v1}, Ljava/lang/Float;->valueOf(Ljava/lang/String;)Ljava/lang/Float;

    move-result-object v1

    invoke-virtual {v13, v0, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 312
    const-string v0, "totalduration"

    const-string v1, "totalduration"

    invoke-interface {v12, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(Ljava/lang/String;)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v13, v0, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 313
    invoke-virtual {v10, v13}, Lorg/json/JSONArray;->put(Ljava/lang/Object;)Lorg/json/JSONArray;
    :try_end_1
    .catch Lorg/json/JSONException; {:try_start_1 .. :try_end_1} :catch_1

    .line 318
    goto :goto_2

    .line 314
    :catch_1
    move-exception v14

    .line 315
    const-string v0, "Opera_DataService"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "getFitnessStat JSONException Three e = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v14}, Lorg/json/JSONException;->getMessage()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 316
    move-object/from16 v0, p1

    const/16 v1, 0x3e9

    const/4 v2, 0x0

    invoke-static {v0, v5, v1, v2}, Lcom/huawei/operation/jsoperation/JsUtil;->runJsFunc(Lcom/huawei/operation/activity/WebViewActivity;Ljava/lang/String;ILjava/lang/Object;)V

    .line 317
    return-void

    .line 319
    :goto_2
    goto/16 :goto_1

    .line 321
    :cond_4
    const-string v0, "data"

    :try_start_2
    invoke-virtual {v9, v0, v10}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    :try_end_2
    .catch Lorg/json/JSONException; {:try_start_2 .. :try_end_2} :catch_2

    .line 326
    goto :goto_3

    .line 322
    :catch_2
    move-exception v11

    .line 323
    const-string v0, "Opera_DataService"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "getFitnessStatData param json fail Four e = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v11}, Lorg/json/JSONException;->getMessage()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 324
    move-object/from16 v0, p1

    const/16 v1, 0x3e9

    const/4 v2, 0x0

    invoke-static {v0, v5, v1, v2}, Lcom/huawei/operation/jsoperation/JsUtil;->runJsFunc(Lcom/huawei/operation/activity/WebViewActivity;Ljava/lang/String;ILjava/lang/Object;)V

    .line 325
    return-void

    .line 327
    :goto_3
    const-string v0, "Opera_DataService"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "getFitnessStatData jsonObject = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v9}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 328
    invoke-virtual {v9}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    move-result-object v0

    move-object/from16 v1, p1

    const/4 v2, 0x0

    invoke-static {v1, v5, v2, v0}, Lcom/huawei/operation/jsoperation/JsUtil;->runJsFunc(Lcom/huawei/operation/activity/WebViewActivity;Ljava/lang/String;ILjava/lang/Object;)V

    .line 329
    return-void
.end method

.method private selectHealthData(Lcom/huawei/operation/activity/WebViewActivity;Lcom/huawei/operation/adapter/PluginOperationAdapter;Lcom/huawei/operation/jsoperation/JsCommandOption;)V
    .locals 17

    .line 206
    invoke-virtual/range {p3 .. p3}, Lcom/huawei/operation/jsoperation/JsCommandOption;->getFunctionRes()Ljava/lang/String;

    move-result-object v0

    invoke-virtual/range {p3 .. p3}, Lcom/huawei/operation/jsoperation/JsCommandOption;->isLegal()Z

    move-result v1

    move-object/from16 v2, p1

    invoke-static {v2, v0, v1}, Lcom/huawei/operation/jsoperation/JsUtil;->checkAuth(Lcom/huawei/operation/activity/WebViewActivity;Ljava/lang/String;Z)Z

    move-result v0

    if-nez v0, :cond_0

    .line 207
    return-void

    .line 209
    :cond_0
    invoke-virtual/range {p3 .. p3}, Lcom/huawei/operation/jsoperation/JsCommandOption;->getParam()Ljava/lang/String;

    move-result-object v9

    .line 210
    invoke-virtual/range {p3 .. p3}, Lcom/huawei/operation/jsoperation/JsCommandOption;->getFunctionRes()Ljava/lang/String;

    move-result-object v10

    .line 211
    const-wide/16 v11, 0x0

    .line 212
    const-wide/16 v13, 0x0

    .line 213
    const/4 v15, 0x0

    .line 215
    :try_start_0
    new-instance v0, Lorg/json/JSONObject;

    move-object v1, v9

    invoke-direct {v0, v1}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    move-object/from16 v16, v0

    .line 216
    const-string v0, "startTime"

    move-object/from16 v1, v16

    invoke-virtual {v1, v0}, Lorg/json/JSONObject;->getLong(Ljava/lang/String;)J

    move-result-wide v11

    .line 217
    const-string v0, "endTime"

    move-object/from16 v1, v16

    invoke-virtual {v1, v0}, Lorg/json/JSONObject;->getLong(Ljava/lang/String;)J

    move-result-wide v13

    .line 218
    const-string v0, "type"

    move-object/from16 v1, v16

    invoke-virtual {v1, v0}, Lorg/json/JSONObject;->getInt(Ljava/lang/String;)I
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    move-result v15

    .line 223
    goto :goto_0

    .line 219
    :catch_0
    move-exception v16

    .line 220
    const-string v0, "Opera_DataService"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "selectHealthStat parse param json fail!"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 221
    move-object/from16 v0, p1

    const/16 v1, 0x3e9

    const/4 v2, 0x0

    invoke-static {v0, v10, v1, v2}, Lcom/huawei/operation/jsoperation/JsUtil;->runJsFunc(Lcom/huawei/operation/activity/WebViewActivity;Ljava/lang/String;ILjava/lang/Object;)V

    .line 222
    return-void

    .line 224
    :goto_0
    move-object/from16 v0, p2

    move-wide v1, v11

    move-wide v3, v13

    move v5, v15

    new-instance v6, Lcom/huawei/operation/jsoperation/DataService$4;

    move-object/from16 v7, p0

    move-object/from16 v8, p1

    invoke-direct {v6, v7, v8, v10}, Lcom/huawei/operation/jsoperation/DataService$4;-><init>(Lcom/huawei/operation/jsoperation/DataService;Lcom/huawei/operation/activity/WebViewActivity;Ljava/lang/String;)V

    invoke-interface/range {v0 .. v6}, Lcom/huawei/operation/adapter/PluginOperationAdapter;->getHealthData(JJILcom/huawei/hwbasemgr/IBaseResponseCallback;)V

    .line 237
    return-void
.end method

.method private selectHealthStat(Lcom/huawei/operation/activity/WebViewActivity;Lcom/huawei/operation/adapter/PluginOperationAdapter;Lcom/huawei/operation/jsoperation/JsCommandOption;)V
    .locals 10

    .line 240
    invoke-virtual {p3}, Lcom/huawei/operation/jsoperation/JsCommandOption;->getFunctionRes()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p3}, Lcom/huawei/operation/jsoperation/JsCommandOption;->isLegal()Z

    move-result v1

    invoke-static {p1, v0, v1}, Lcom/huawei/operation/jsoperation/JsUtil;->checkAuth(Lcom/huawei/operation/activity/WebViewActivity;Ljava/lang/String;Z)Z

    move-result v0

    if-nez v0, :cond_0

    .line 241
    return-void

    .line 244
    :cond_0
    invoke-virtual {p3}, Lcom/huawei/operation/jsoperation/JsCommandOption;->getParam()Ljava/lang/String;

    move-result-object v4

    .line 245
    invoke-virtual {p3}, Lcom/huawei/operation/jsoperation/JsCommandOption;->getFunctionRes()Ljava/lang/String;

    move-result-object v5

    .line 246
    const/4 v6, 0x0

    .line 247
    const/4 v7, 0x0

    .line 248
    const/4 v8, 0x0

    .line 250
    :try_start_0
    new-instance v9, Lorg/json/JSONObject;

    invoke-direct {v9, v4}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    .line 251
    const-string v0, "startDate"

    invoke-virtual {v9, v0}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    .line 252
    const-string v0, "endDate"

    invoke-virtual {v9, v0}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    .line 253
    const-string v0, "type"

    invoke-virtual {v9, v0}, Lorg/json/JSONObject;->getInt(Ljava/lang/String;)I
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    move-result v8

    .line 258
    goto :goto_0

    .line 254
    :catch_0
    move-exception v9

    .line 255
    const-string v0, "Opera_DataService"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "selectHealthStat parse param json fail!"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 256
    const/16 v0, 0x3e9

    const/4 v1, 0x0

    invoke-static {p1, v5, v0, v1}, Lcom/huawei/operation/jsoperation/JsUtil;->runJsFunc(Lcom/huawei/operation/activity/WebViewActivity;Ljava/lang/String;ILjava/lang/Object;)V

    .line 257
    return-void

    .line 259
    :goto_0
    new-instance v0, Lcom/huawei/operation/jsoperation/DataService$5;

    invoke-direct {v0, p0, p1, v5}, Lcom/huawei/operation/jsoperation/DataService$5;-><init>(Lcom/huawei/operation/jsoperation/DataService;Lcom/huawei/operation/activity/WebViewActivity;Ljava/lang/String;)V

    invoke-interface {p2, v6, v7, v8, v0}, Lcom/huawei/operation/adapter/PluginOperationAdapter;->getHealthStat(Ljava/lang/String;Ljava/lang/String;ILcom/huawei/hwbasemgr/IBaseResponseCallback;)V

    .line 272
    return-void
.end method

.method private selectMotionPathData(Lcom/huawei/operation/activity/WebViewActivity;Lcom/huawei/operation/adapter/PluginOperationAdapter;Lcom/huawei/operation/jsoperation/JsCommandOption;)V
    .locals 13

    .line 399
    invoke-virtual/range {p3 .. p3}, Lcom/huawei/operation/jsoperation/JsCommandOption;->getFunctionRes()Ljava/lang/String;

    move-result-object v0

    invoke-virtual/range {p3 .. p3}, Lcom/huawei/operation/jsoperation/JsCommandOption;->isLegal()Z

    move-result v1

    invoke-static {p1, v0, v1}, Lcom/huawei/operation/jsoperation/JsUtil;->checkAuth(Lcom/huawei/operation/activity/WebViewActivity;Ljava/lang/String;Z)Z

    move-result v0

    if-nez v0, :cond_0

    .line 400
    return-void

    .line 402
    :cond_0
    invoke-virtual/range {p3 .. p3}, Lcom/huawei/operation/jsoperation/JsCommandOption;->getParam()Ljava/lang/String;

    move-result-object v6

    .line 403
    invoke-virtual/range {p3 .. p3}, Lcom/huawei/operation/jsoperation/JsCommandOption;->getFunctionRes()Ljava/lang/String;

    move-result-object v7

    .line 404
    const-wide/16 v8, 0x0

    .line 405
    const-wide/16 v10, 0x0

    .line 407
    :try_start_0
    new-instance v0, Lorg/json/JSONObject;

    move-object v1, v6

    invoke-direct {v0, v1}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    move-object v12, v0

    .line 408
    const-string v0, "startTime"

    invoke-virtual {v12, v0}, Lorg/json/JSONObject;->getLong(Ljava/lang/String;)J

    move-result-wide v8

    .line 409
    const-string v0, "endTime"

    invoke-virtual {v12, v0}, Lorg/json/JSONObject;->getLong(Ljava/lang/String;)J
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    move-result-wide v10

    .line 414
    goto :goto_0

    .line 410
    :catch_0
    move-exception v12

    .line 411
    const-string v0, "Opera_DataService"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "parse param json fail! e : "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v12}, Lorg/json/JSONException;->getMessage()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 412
    const/16 v0, 0x3e9

    const/4 v1, 0x0

    invoke-static {p1, v7, v0, v1}, Lcom/huawei/operation/jsoperation/JsUtil;->runJsFunc(Lcom/huawei/operation/activity/WebViewActivity;Ljava/lang/String;ILjava/lang/Object;)V

    .line 413
    return-void

    .line 416
    :goto_0
    const-string v0, "Opera_DataService"

    const/4 v1, 0x4

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "motion path startTime = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v8, v9}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    const-string v2, ", endTime = "

    const/4 v3, 0x2

    aput-object v2, v1, v3

    invoke-static {v10, v11}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    const/4 v3, 0x3

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 417
    move-object v0, p2

    move-wide v1, v8

    move-wide v3, v10

    new-instance v5, Lcom/huawei/operation/jsoperation/DataService$8;

    invoke-direct {v5, p0, p1, v7}, Lcom/huawei/operation/jsoperation/DataService$8;-><init>(Lcom/huawei/operation/jsoperation/DataService;Lcom/huawei/operation/activity/WebViewActivity;Ljava/lang/String;)V

    invoke-interface/range {v0 .. v5}, Lcom/huawei/operation/adapter/PluginOperationAdapter;->getMotionPathData(JJLcom/huawei/hwbasemgr/IBaseResponseCallback;)V

    .line 431
    return-void
.end method

.method private selectSportData(Lcom/huawei/operation/activity/WebViewActivity;Lcom/huawei/operation/adapter/PluginOperationAdapter;Lcom/huawei/operation/jsoperation/JsCommandOption;)V
    .locals 9

    .line 332
    invoke-virtual {p3}, Lcom/huawei/operation/jsoperation/JsCommandOption;->getFunctionRes()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p3}, Lcom/huawei/operation/jsoperation/JsCommandOption;->isLegal()Z

    move-result v1

    invoke-static {p1, v0, v1}, Lcom/huawei/operation/jsoperation/JsUtil;->checkAuth(Lcom/huawei/operation/activity/WebViewActivity;Ljava/lang/String;Z)Z

    move-result v0

    if-nez v0, :cond_0

    .line 333
    return-void

    .line 335
    :cond_0
    const/4 v4, 0x0

    .line 336
    const/4 v5, 0x0

    .line 337
    invoke-virtual {p3}, Lcom/huawei/operation/jsoperation/JsCommandOption;->getParam()Ljava/lang/String;

    move-result-object v6

    .line 338
    invoke-virtual {p3}, Lcom/huawei/operation/jsoperation/JsCommandOption;->getFunctionRes()Ljava/lang/String;

    move-result-object v7

    .line 340
    :try_start_0
    new-instance v8, Lorg/json/JSONObject;

    invoke-direct {v8, v6}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    .line 341
    const-string v0, "startDate"

    invoke-virtual {v8, v0}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    .line 342
    const-string v0, "endDate"

    invoke-virtual {v8, v0}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v5

    .line 347
    goto :goto_0

    .line 343
    :catch_0
    move-exception v8

    .line 344
    const-string v0, "Opera_DataService"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "selectSportData parse param json fail! ONE e = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v8}, Lorg/json/JSONException;->getMessage()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 345
    const/16 v0, 0x3e9

    const/4 v1, 0x0

    invoke-static {p1, v7, v0, v1}, Lcom/huawei/operation/jsoperation/JsUtil;->runJsFunc(Lcom/huawei/operation/activity/WebViewActivity;Ljava/lang/String;ILjava/lang/Object;)V

    .line 346
    return-void

    .line 348
    :goto_0
    const-string v0, "Opera_DataService"

    const/4 v1, 0x4

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "sport Data startDate = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object v4, v1, v2

    const-string v2, ", endDate = "

    const/4 v3, 0x2

    aput-object v2, v1, v3

    const/4 v2, 0x3

    aput-object v5, v1, v2

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 349
    new-instance v0, Lcom/huawei/operation/jsoperation/DataService$6;

    invoke-direct {v0, p0, p1, v7}, Lcom/huawei/operation/jsoperation/DataService$6;-><init>(Lcom/huawei/operation/jsoperation/DataService;Lcom/huawei/operation/activity/WebViewActivity;Ljava/lang/String;)V

    invoke-interface {p2, v4, v5, v0}, Lcom/huawei/operation/adapter/PluginOperationAdapter;->getSportData(Ljava/lang/String;Ljava/lang/String;Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V

    .line 376
    return-void
.end method

.method private selectUserInfoData(Lcom/huawei/operation/activity/WebViewActivity;Lcom/huawei/operation/adapter/PluginOperationAdapter;Lcom/huawei/operation/jsoperation/JsCommandOption;)V
    .locals 3

    .line 379
    invoke-virtual {p3}, Lcom/huawei/operation/jsoperation/JsCommandOption;->getFunctionRes()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p3}, Lcom/huawei/operation/jsoperation/JsCommandOption;->isLegal()Z

    move-result v1

    invoke-static {p1, v0, v1}, Lcom/huawei/operation/jsoperation/JsUtil;->checkAuth(Lcom/huawei/operation/activity/WebViewActivity;Ljava/lang/String;Z)Z

    move-result v0

    if-nez v0, :cond_0

    .line 380
    return-void

    .line 382
    :cond_0
    invoke-virtual {p3}, Lcom/huawei/operation/jsoperation/JsCommandOption;->getFunctionRes()Ljava/lang/String;

    move-result-object v2

    .line 383
    new-instance v0, Lcom/huawei/operation/jsoperation/DataService$7;

    invoke-direct {v0, p0, p1, v2}, Lcom/huawei/operation/jsoperation/DataService$7;-><init>(Lcom/huawei/operation/jsoperation/DataService;Lcom/huawei/operation/activity/WebViewActivity;Ljava/lang/String;)V

    invoke-interface {p2, v0}, Lcom/huawei/operation/adapter/PluginOperationAdapter;->getUserInfo(Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V

    .line 396
    return-void
.end method


# virtual methods
.method public execute(Lcom/huawei/operation/activity/WebViewActivity;Lcom/huawei/operation/adapter/PluginOperationAdapter;Lcom/huawei/operation/jsoperation/JsCommandOption;)V
    .locals 6

    .line 41
    if-eqz p3, :cond_0

    if-eqz p1, :cond_0

    if-nez p2, :cond_1

    .line 42
    :cond_0
    const-string v0, "Opera_DataService"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "execute option or web or adapter is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 43
    return-void

    .line 45
    :cond_1
    const-string v0, "hfssdk"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "execute fun type is "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {p3}, Lcom/huawei/operation/jsoperation/JsCommandOption;->getFuncType()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 46
    invoke-virtual {p3}, Lcom/huawei/operation/jsoperation/JsCommandOption;->getFuncType()Ljava/lang/String;

    move-result-object v4

    const/4 v5, -0x1

    invoke-virtual {v4}, Ljava/lang/String;->hashCode()I

    move-result v0

    sparse-switch v0, :sswitch_data_0

    goto/16 :goto_0

    :sswitch_0
    const-string v0, "MOTION_PATH_DATA"

    invoke-virtual {v4, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    const/4 v5, 0x0

    goto/16 :goto_0

    :sswitch_1
    const-string v0, "USER_INFO_DATA"

    invoke-virtual {v4, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    const/4 v5, 0x1

    goto :goto_0

    :sswitch_2
    const-string v0, "SPORT_DATA"

    invoke-virtual {v4, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    const/4 v5, 0x2

    goto :goto_0

    :sswitch_3
    const-string v0, "FITNESS_DATA"

    invoke-virtual {v4, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    const/4 v5, 0x3

    goto :goto_0

    :sswitch_4
    const-string v0, "HEALTH_STAT"

    invoke-virtual {v4, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    const/4 v5, 0x4

    goto :goto_0

    :sswitch_5
    const-string v0, "HEALTH_DATA"

    invoke-virtual {v4, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    const/4 v5, 0x5

    goto :goto_0

    :sswitch_6
    const-string v0, "REGISTER_DATA_CLIENT"

    invoke-virtual {v4, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    const/4 v5, 0x6

    goto :goto_0

    :sswitch_7
    const-string v0, "INSERT_HEALTH_DATA"

    invoke-virtual {v4, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    const/4 v5, 0x7

    goto :goto_0

    :sswitch_8
    const-string v0, "ANNUAL_REPORT_DATA"

    invoke-virtual {v4, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    const/16 v5, 0x8

    :cond_2
    :goto_0
    packed-switch v5, :pswitch_data_0

    goto/16 :goto_1

    .line 48
    :pswitch_0
    invoke-direct {p0, p1, p2, p3}, Lcom/huawei/operation/jsoperation/DataService;->selectMotionPathData(Lcom/huawei/operation/activity/WebViewActivity;Lcom/huawei/operation/adapter/PluginOperationAdapter;Lcom/huawei/operation/jsoperation/JsCommandOption;)V

    .line 49
    goto :goto_1

    .line 51
    :pswitch_1
    invoke-direct {p0, p1, p2, p3}, Lcom/huawei/operation/jsoperation/DataService;->selectUserInfoData(Lcom/huawei/operation/activity/WebViewActivity;Lcom/huawei/operation/adapter/PluginOperationAdapter;Lcom/huawei/operation/jsoperation/JsCommandOption;)V

    .line 52
    goto :goto_1

    .line 54
    :pswitch_2
    invoke-direct {p0, p1, p2, p3}, Lcom/huawei/operation/jsoperation/DataService;->selectSportData(Lcom/huawei/operation/activity/WebViewActivity;Lcom/huawei/operation/adapter/PluginOperationAdapter;Lcom/huawei/operation/jsoperation/JsCommandOption;)V

    .line 55
    goto :goto_1

    .line 57
    :pswitch_3
    invoke-direct {p0, p1, p2, p3}, Lcom/huawei/operation/jsoperation/DataService;->selectFitnessData(Lcom/huawei/operation/activity/WebViewActivity;Lcom/huawei/operation/adapter/PluginOperationAdapter;Lcom/huawei/operation/jsoperation/JsCommandOption;)V

    .line 58
    goto :goto_1

    .line 60
    :pswitch_4
    invoke-direct {p0, p1, p2, p3}, Lcom/huawei/operation/jsoperation/DataService;->selectHealthStat(Lcom/huawei/operation/activity/WebViewActivity;Lcom/huawei/operation/adapter/PluginOperationAdapter;Lcom/huawei/operation/jsoperation/JsCommandOption;)V

    .line 61
    goto :goto_1

    .line 63
    :pswitch_5
    invoke-direct {p0, p1, p2, p3}, Lcom/huawei/operation/jsoperation/DataService;->selectHealthData(Lcom/huawei/operation/activity/WebViewActivity;Lcom/huawei/operation/adapter/PluginOperationAdapter;Lcom/huawei/operation/jsoperation/JsCommandOption;)V

    .line 64
    goto :goto_1

    .line 66
    :pswitch_6
    invoke-direct {p0, p1, p3}, Lcom/huawei/operation/jsoperation/DataService;->registerDataClient(Lcom/huawei/operation/activity/WebViewActivity;Lcom/huawei/operation/jsoperation/JsCommandOption;)V

    .line 67
    goto :goto_1

    .line 69
    :pswitch_7
    invoke-direct {p0, p1, p3}, Lcom/huawei/operation/jsoperation/DataService;->insertHealthData(Lcom/huawei/operation/activity/WebViewActivity;Lcom/huawei/operation/jsoperation/JsCommandOption;)V

    .line 70
    goto :goto_1

    .line 72
    :pswitch_8
    invoke-direct {p0, p1, p2, p3}, Lcom/huawei/operation/jsoperation/DataService;->getAnnualReport(Lcom/huawei/operation/activity/WebViewActivity;Lcom/huawei/operation/adapter/PluginOperationAdapter;Lcom/huawei/operation/jsoperation/JsCommandOption;)V

    .line 73
    .line 77
    :goto_1
    return-void

    :sswitch_data_0
    .sparse-switch
        -0x7d26f4d9 -> :sswitch_7
        -0x7c689a8b -> :sswitch_8
        -0x6845759c -> :sswitch_6
        -0x61efb43f -> :sswitch_3
        -0x5633e9c5 -> :sswitch_0
        -0x504022d9 -> :sswitch_1
        0x101a43ad -> :sswitch_5
        0x10215a57 -> :sswitch_4
        0x1e1fe5b5 -> :sswitch_2
    .end sparse-switch

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
        :pswitch_1
        :pswitch_2
        :pswitch_3
        :pswitch_4
        :pswitch_5
        :pswitch_6
        :pswitch_7
        :pswitch_8
    .end packed-switch
.end method
