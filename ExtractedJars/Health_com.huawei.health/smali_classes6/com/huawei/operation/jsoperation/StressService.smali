.class public Lcom/huawei/operation/jsoperation/StressService;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/huawei/operation/jsoperation/JsCommand;


# static fields
.field private static final CHECK_MONITOR:Ljava/lang/String; = "monitor_type"

.field private static final HAVE_DEVICE:I = 0x1

.field private static final LOG_TAG:Ljava/lang/String; = "Opera_StressService"

.field private static final TOTAL_TIME_TYPE_60:I = 0x0


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 26
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 27
    return-void
.end method

.method private breatheControl(Lcom/huawei/operation/activity/WebViewActivity;Lcom/huawei/operation/adapter/PluginOperationAdapter;Lcom/huawei/operation/jsoperation/JsCommandOption;)V
    .locals 13

    .line 67
    invoke-virtual/range {p3 .. p3}, Lcom/huawei/operation/jsoperation/JsCommandOption;->getParam()Ljava/lang/String;

    move-result-object v7

    .line 68
    invoke-virtual/range {p3 .. p3}, Lcom/huawei/operation/jsoperation/JsCommandOption;->getFunctionRes()Ljava/lang/String;

    move-result-object v8

    .line 69
    const/4 v9, 0x0

    .line 70
    const/4 v10, 0x0

    .line 71
    const/4 v11, 0x0

    .line 73
    :try_start_0
    new-instance v12, Lorg/json/JSONObject;

    invoke-direct {v12, v7}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    .line 74
    const-string v0, "type"

    invoke-virtual {v12, v0}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;)I

    move-result v9

    .line 75
    const-string v0, "breathe_time"

    invoke-virtual {v12, v0}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;)I

    move-result v10

    .line 76
    const-string v0, "result_code"

    invoke-virtual {v12, v0}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;)I
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    move-result v11

    .line 82
    goto :goto_0

    .line 77
    :catch_0
    move-exception v12

    .line 78
    const-string v0, "Opera_StressService"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "breatheControl parse param json fail!"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 79
    const-string v0, "Opera_StressService"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    invoke-virtual {v12}, Lorg/json/JSONException;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 80
    const-string v0, ""

    const/16 v1, 0x3e9

    invoke-static {p1, v8, v1, v0}, Lcom/huawei/operation/jsoperation/JsUtil;->runJsFunc(Lcom/huawei/operation/activity/WebViewActivity;Ljava/lang/String;ILjava/lang/Object;)V

    .line 81
    return-void

    .line 84
    :goto_0
    move-object v0, p0

    move v1, v9

    move-object v2, p1

    move-object v3, p2

    move-object/from16 v4, p3

    move v5, v10

    move v6, v11

    invoke-direct/range {v0 .. v6}, Lcom/huawei/operation/jsoperation/StressService;->switchBreathe(ILcom/huawei/operation/activity/WebViewActivity;Lcom/huawei/operation/adapter/PluginOperationAdapter;Lcom/huawei/operation/jsoperation/JsCommandOption;II)V

    .line 85
    return-void
.end method

.method private calibrationControl(Lcom/huawei/operation/activity/WebViewActivity;Lcom/huawei/operation/adapter/PluginOperationAdapter;Lcom/huawei/operation/jsoperation/JsCommandOption;)V
    .locals 10

    .line 143
    invoke-virtual {p3}, Lcom/huawei/operation/jsoperation/JsCommandOption;->getFunctionRes()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p3}, Lcom/huawei/operation/jsoperation/JsCommandOption;->isLegal()Z

    move-result v1

    invoke-static {p1, v0, v1}, Lcom/huawei/operation/jsoperation/JsUtil;->checkAuth(Lcom/huawei/operation/activity/WebViewActivity;Ljava/lang/String;Z)Z

    move-result v0

    if-nez v0, :cond_0

    .line 144
    return-void

    .line 146
    :cond_0
    invoke-virtual {p3}, Lcom/huawei/operation/jsoperation/JsCommandOption;->getParam()Ljava/lang/String;

    move-result-object v4

    .line 147
    invoke-virtual {p3}, Lcom/huawei/operation/jsoperation/JsCommandOption;->getFunctionRes()Ljava/lang/String;

    move-result-object v5

    .line 148
    const/4 v6, 0x0

    .line 149
    const/4 v7, 0x0

    .line 150
    const/4 v8, 0x0

    .line 152
    :try_start_0
    new-instance v9, Lorg/json/JSONObject;

    invoke-direct {v9, v4}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    .line 153
    const-string v0, "type"

    invoke-virtual {v9, v0}, Lorg/json/JSONObject;->getInt(Ljava/lang/String;)I

    move-result v6

    .line 154
    const-string v0, "score"

    invoke-virtual {v9, v0}, Lorg/json/JSONObject;->getInt(Ljava/lang/String;)I

    move-result v8

    .line 155
    const-string v0, "duration"

    invoke-virtual {v9, v0}, Lorg/json/JSONObject;->getInt(Ljava/lang/String;)I
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    move-result v7

    .line 161
    goto :goto_0

    .line 156
    :catch_0
    move-exception v9

    .line 157
    const-string v0, "Opera_StressService"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "calibrationControl parse param json fail!"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 158
    const-string v0, "Opera_StressService"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    invoke-virtual {v9}, Lorg/json/JSONException;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 159
    const/16 v0, 0x3e9

    const/4 v1, 0x0

    invoke-static {p1, v5, v0, v1}, Lcom/huawei/operation/jsoperation/JsUtil;->runJsFunc(Lcom/huawei/operation/activity/WebViewActivity;Ljava/lang/String;ILjava/lang/Object;)V

    .line 160
    return-void

    .line 162
    :goto_0
    new-instance v0, Lcom/huawei/operation/jsoperation/StressService$3;

    invoke-direct {v0, p0, p1, v5}, Lcom/huawei/operation/jsoperation/StressService$3;-><init>(Lcom/huawei/operation/jsoperation/StressService;Lcom/huawei/operation/activity/WebViewActivity;Ljava/lang/String;)V

    invoke-interface {p2, v6, v7, v8, v0}, Lcom/huawei/operation/adapter/PluginOperationAdapter;->calibrationControl(IIILcom/huawei/hwbasemgr/IBaseResponseCallback;)V

    .line 171
    return-void
.end method

.method private checkCalibration(Lcom/huawei/operation/activity/WebViewActivity;Lcom/huawei/operation/adapter/PluginOperationAdapter;Lcom/huawei/operation/jsoperation/JsCommandOption;)V
    .locals 3

    .line 174
    invoke-virtual {p3}, Lcom/huawei/operation/jsoperation/JsCommandOption;->getFunctionRes()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p3}, Lcom/huawei/operation/jsoperation/JsCommandOption;->isLegal()Z

    move-result v1

    invoke-static {p1, v0, v1}, Lcom/huawei/operation/jsoperation/JsUtil;->checkAuth(Lcom/huawei/operation/activity/WebViewActivity;Ljava/lang/String;Z)Z

    move-result v0

    if-nez v0, :cond_0

    .line 175
    return-void

    .line 177
    :cond_0
    invoke-virtual {p3}, Lcom/huawei/operation/jsoperation/JsCommandOption;->getFunctionRes()Ljava/lang/String;

    move-result-object v2

    .line 178
    new-instance v0, Lcom/huawei/operation/jsoperation/StressService$4;

    invoke-direct {v0, p0, p1, v2}, Lcom/huawei/operation/jsoperation/StressService$4;-><init>(Lcom/huawei/operation/jsoperation/StressService;Lcom/huawei/operation/activity/WebViewActivity;Ljava/lang/String;)V

    invoke-interface {p2, v0}, Lcom/huawei/operation/adapter/PluginOperationAdapter;->checkCalibration(Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V

    .line 187
    return-void
.end method

.method private checkConnected(Lcom/huawei/operation/activity/WebViewActivity;Lcom/huawei/operation/adapter/PluginOperationAdapter;Lcom/huawei/operation/jsoperation/JsCommandOption;)V
    .locals 3

    .line 266
    invoke-virtual {p3}, Lcom/huawei/operation/jsoperation/JsCommandOption;->getFunctionRes()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p3}, Lcom/huawei/operation/jsoperation/JsCommandOption;->isLegal()Z

    move-result v1

    invoke-static {p1, v0, v1}, Lcom/huawei/operation/jsoperation/JsUtil;->checkAuth(Lcom/huawei/operation/activity/WebViewActivity;Ljava/lang/String;Z)Z

    move-result v0

    if-nez v0, :cond_0

    .line 267
    return-void

    .line 269
    :cond_0
    invoke-virtual {p3}, Lcom/huawei/operation/jsoperation/JsCommandOption;->getFunctionRes()Ljava/lang/String;

    move-result-object v2

    .line 270
    new-instance v0, Lcom/huawei/operation/jsoperation/StressService$8;

    invoke-direct {v0, p0, p1, v2}, Lcom/huawei/operation/jsoperation/StressService$8;-><init>(Lcom/huawei/operation/jsoperation/StressService;Lcom/huawei/operation/activity/WebViewActivity;Ljava/lang/String;)V

    invoke-interface {p2, v0}, Lcom/huawei/operation/adapter/PluginOperationAdapter;->checkConnected(Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V

    .line 286
    return-void
.end method

.method private gameControl(Lcom/huawei/operation/activity/WebViewActivity;Lcom/huawei/operation/adapter/PluginOperationAdapter;Lcom/huawei/operation/jsoperation/JsCommandOption;)V
    .locals 10

    .line 235
    invoke-virtual {p3}, Lcom/huawei/operation/jsoperation/JsCommandOption;->getFunctionRes()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p3}, Lcom/huawei/operation/jsoperation/JsCommandOption;->isLegal()Z

    move-result v1

    invoke-static {p1, v0, v1}, Lcom/huawei/operation/jsoperation/JsUtil;->checkAuth(Lcom/huawei/operation/activity/WebViewActivity;Ljava/lang/String;Z)Z

    move-result v0

    if-nez v0, :cond_0

    .line 236
    return-void

    .line 238
    :cond_0
    invoke-virtual {p3}, Lcom/huawei/operation/jsoperation/JsCommandOption;->getParam()Ljava/lang/String;

    move-result-object v4

    .line 239
    invoke-virtual {p3}, Lcom/huawei/operation/jsoperation/JsCommandOption;->getFunctionRes()Ljava/lang/String;

    move-result-object v5

    .line 240
    const/4 v6, 0x0

    .line 241
    const/4 v7, 0x0

    .line 242
    const/4 v8, 0x0

    .line 244
    :try_start_0
    new-instance v9, Lorg/json/JSONObject;

    invoke-direct {v9, v4}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    .line 245
    const-string v0, "type"

    invoke-virtual {v9, v0}, Lorg/json/JSONObject;->getInt(Ljava/lang/String;)I

    move-result v6

    .line 246
    const-string v0, "duration"

    invoke-virtual {v9, v0}, Lorg/json/JSONObject;->getInt(Ljava/lang/String;)I

    move-result v8

    .line 247
    const-string v0, "score"

    invoke-virtual {v9, v0}, Lorg/json/JSONObject;->getInt(Ljava/lang/String;)I
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    move-result v7

    .line 253
    goto :goto_0

    .line 248
    :catch_0
    move-exception v9

    .line 249
    const-string v0, "Opera_StressService"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "gameControl parse param json fail!"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 250
    const-string v0, "Opera_StressService"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    invoke-virtual {v9}, Lorg/json/JSONException;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 251
    const/16 v0, 0x3e9

    const/4 v1, 0x0

    invoke-static {p1, v5, v0, v1}, Lcom/huawei/operation/jsoperation/JsUtil;->runJsFunc(Lcom/huawei/operation/activity/WebViewActivity;Ljava/lang/String;ILjava/lang/Object;)V

    .line 252
    return-void

    .line 254
    :goto_0
    new-instance v0, Lcom/huawei/operation/jsoperation/StressService$7;

    invoke-direct {v0, p0, p1, v5}, Lcom/huawei/operation/jsoperation/StressService$7;-><init>(Lcom/huawei/operation/jsoperation/StressService;Lcom/huawei/operation/activity/WebViewActivity;Ljava/lang/String;)V

    invoke-interface {p2, v6, v8, v7, v0}, Lcom/huawei/operation/adapter/PluginOperationAdapter;->gameControl(IIILcom/huawei/hwbasemgr/IBaseResponseCallback;)V

    .line 263
    return-void
.end method

.method private relaxControl(Lcom/huawei/operation/activity/WebViewActivity;Lcom/huawei/operation/adapter/PluginOperationAdapter;Lcom/huawei/operation/jsoperation/JsCommandOption;)V
    .locals 9

    .line 206
    invoke-virtual {p3}, Lcom/huawei/operation/jsoperation/JsCommandOption;->getFunctionRes()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p3}, Lcom/huawei/operation/jsoperation/JsCommandOption;->isLegal()Z

    move-result v1

    invoke-static {p1, v0, v1}, Lcom/huawei/operation/jsoperation/JsUtil;->checkAuth(Lcom/huawei/operation/activity/WebViewActivity;Ljava/lang/String;Z)Z

    move-result v0

    if-nez v0, :cond_0

    .line 207
    return-void

    .line 209
    :cond_0
    invoke-virtual {p3}, Lcom/huawei/operation/jsoperation/JsCommandOption;->getParam()Ljava/lang/String;

    move-result-object v4

    .line 210
    invoke-virtual {p3}, Lcom/huawei/operation/jsoperation/JsCommandOption;->getFunctionRes()Ljava/lang/String;

    move-result-object v5

    .line 211
    const/4 v6, 0x0

    .line 212
    const/4 v7, 0x0

    .line 214
    :try_start_0
    new-instance v8, Lorg/json/JSONObject;

    invoke-direct {v8, v4}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    .line 215
    const-string v0, "type"

    invoke-virtual {v8, v0}, Lorg/json/JSONObject;->getInt(Ljava/lang/String;)I

    move-result v7

    .line 216
    const-string v0, "duration"

    invoke-virtual {v8, v0}, Lorg/json/JSONObject;->getInt(Ljava/lang/String;)I
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    move-result v6

    .line 222
    goto :goto_0

    .line 217
    :catch_0
    move-exception v8

    .line 218
    const-string v0, "Opera_StressService"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "relaxControl parse param json fail!"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 219
    const-string v0, "Opera_StressService"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    invoke-virtual {v8}, Lorg/json/JSONException;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 220
    const/16 v0, 0x3e9

    const/4 v1, 0x0

    invoke-static {p1, v5, v0, v1}, Lcom/huawei/operation/jsoperation/JsUtil;->runJsFunc(Lcom/huawei/operation/activity/WebViewActivity;Ljava/lang/String;ILjava/lang/Object;)V

    .line 221
    return-void

    .line 223
    :goto_0
    new-instance v0, Lcom/huawei/operation/jsoperation/StressService$6;

    invoke-direct {v0, p0, p1, v5}, Lcom/huawei/operation/jsoperation/StressService$6;-><init>(Lcom/huawei/operation/jsoperation/StressService;Lcom/huawei/operation/activity/WebViewActivity;Ljava/lang/String;)V

    invoke-interface {p2, v7, v6, v0}, Lcom/huawei/operation/adapter/PluginOperationAdapter;->relaxControl(IILcom/huawei/hwbasemgr/IBaseResponseCallback;)V

    .line 232
    return-void
.end method

.method private resetCalibration(Lcom/huawei/operation/activity/WebViewActivity;Lcom/huawei/operation/adapter/PluginOperationAdapter;Lcom/huawei/operation/jsoperation/JsCommandOption;)V
    .locals 3

    .line 190
    invoke-virtual {p3}, Lcom/huawei/operation/jsoperation/JsCommandOption;->getFunctionRes()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p3}, Lcom/huawei/operation/jsoperation/JsCommandOption;->isLegal()Z

    move-result v1

    invoke-static {p1, v0, v1}, Lcom/huawei/operation/jsoperation/JsUtil;->checkAuth(Lcom/huawei/operation/activity/WebViewActivity;Ljava/lang/String;Z)Z

    move-result v0

    if-nez v0, :cond_0

    .line 191
    return-void

    .line 193
    :cond_0
    invoke-virtual {p3}, Lcom/huawei/operation/jsoperation/JsCommandOption;->getFunctionRes()Ljava/lang/String;

    move-result-object v2

    .line 194
    new-instance v0, Lcom/huawei/operation/jsoperation/StressService$5;

    invoke-direct {v0, p0, p1, v2}, Lcom/huawei/operation/jsoperation/StressService$5;-><init>(Lcom/huawei/operation/jsoperation/StressService;Lcom/huawei/operation/activity/WebViewActivity;Ljava/lang/String;)V

    invoke-interface {p2, v0}, Lcom/huawei/operation/adapter/PluginOperationAdapter;->resetCalibration(Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V

    .line 203
    return-void
.end method

.method private stressControl(Lcom/huawei/operation/activity/WebViewActivity;Lcom/huawei/operation/adapter/PluginOperationAdapter;Lcom/huawei/operation/jsoperation/JsCommandOption;)V
    .locals 9

    .line 114
    invoke-virtual {p3}, Lcom/huawei/operation/jsoperation/JsCommandOption;->getFunctionRes()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p3}, Lcom/huawei/operation/jsoperation/JsCommandOption;->isLegal()Z

    move-result v1

    invoke-static {p1, v0, v1}, Lcom/huawei/operation/jsoperation/JsUtil;->checkAuth(Lcom/huawei/operation/activity/WebViewActivity;Ljava/lang/String;Z)Z

    move-result v0

    if-nez v0, :cond_0

    .line 115
    return-void

    .line 117
    :cond_0
    invoke-virtual {p3}, Lcom/huawei/operation/jsoperation/JsCommandOption;->getParam()Ljava/lang/String;

    move-result-object v4

    .line 118
    invoke-virtual {p3}, Lcom/huawei/operation/jsoperation/JsCommandOption;->getFunctionRes()Ljava/lang/String;

    move-result-object v5

    .line 119
    const/4 v6, 0x0

    .line 120
    const/4 v7, 0x0

    .line 122
    :try_start_0
    new-instance v8, Lorg/json/JSONObject;

    invoke-direct {v8, v4}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    .line 123
    const-string v0, "type"

    invoke-virtual {v8, v0}, Lorg/json/JSONObject;->getInt(Ljava/lang/String;)I

    move-result v6

    .line 124
    const-string v0, "duration"

    invoke-virtual {v8, v0}, Lorg/json/JSONObject;->getInt(Ljava/lang/String;)I
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    move-result v7

    .line 130
    goto :goto_0

    .line 125
    :catch_0
    move-exception v8

    .line 126
    const-string v0, "Opera_StressService"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "stressControl parse param json fail!"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 127
    const-string v0, "Opera_StressService"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    invoke-virtual {v8}, Lorg/json/JSONException;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 128
    const/16 v0, 0x3e9

    const/4 v1, 0x0

    invoke-static {p1, v5, v0, v1}, Lcom/huawei/operation/jsoperation/JsUtil;->runJsFunc(Lcom/huawei/operation/activity/WebViewActivity;Ljava/lang/String;ILjava/lang/Object;)V

    .line 129
    return-void

    .line 131
    :goto_0
    new-instance v0, Lcom/huawei/operation/jsoperation/StressService$2;

    invoke-direct {v0, p0, p1, v5}, Lcom/huawei/operation/jsoperation/StressService$2;-><init>(Lcom/huawei/operation/jsoperation/StressService;Lcom/huawei/operation/activity/WebViewActivity;Ljava/lang/String;)V

    invoke-interface {p2, v6, v7, v0}, Lcom/huawei/operation/adapter/PluginOperationAdapter;->stressControl(IILcom/huawei/hwbasemgr/IBaseResponseCallback;)V

    .line 140
    return-void
.end method

.method private switchBreathe(ILcom/huawei/operation/activity/WebViewActivity;Lcom/huawei/operation/adapter/PluginOperationAdapter;Lcom/huawei/operation/jsoperation/JsCommandOption;II)V
    .locals 6

    .line 89
    invoke-virtual {p4}, Lcom/huawei/operation/jsoperation/JsCommandOption;->getFunctionRes()Ljava/lang/String;

    move-result-object v4

    .line 90
    const/4 v0, 0x1

    if-ne p1, v0, :cond_0

    .line 92
    :try_start_0
    new-instance v5, Lorg/json/JSONObject;

    invoke-direct {v5}, Lorg/json/JSONObject;-><init>()V

    .line 93
    const-string v0, "result_code"

    invoke-interface {p3}, Lcom/huawei/operation/adapter/PluginOperationAdapter;->getJanusDeviceConnect()I

    move-result v1

    invoke-virtual {v5, v0, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    .line 94
    invoke-virtual {v5}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    invoke-static {p2, v4, v1, v0}, Lcom/huawei/operation/jsoperation/JsUtil;->runJsFunc(Lcom/huawei/operation/activity/WebViewActivity;Ljava/lang/String;ILjava/lang/Object;)V

    .line 95
    const/4 v0, 0x1

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-interface {p3, v0, v1, v2, v3}, Lcom/huawei/operation/adapter/PluginOperationAdapter;->breatheControl(IIILcom/huawei/hwbasemgr/IBaseResponseCallback;)V
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    .line 99
    goto :goto_0

    .line 96
    :catch_0
    move-exception v5

    .line 97
    const-string v0, "Opera_StressService"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "switchBreathe "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v5}, Lorg/json/JSONException;->getMessage()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 98
    const-string v0, ""

    const/4 v1, 0x0

    invoke-static {p2, v4, v1, v0}, Lcom/huawei/operation/jsoperation/JsUtil;->runJsFunc(Lcom/huawei/operation/activity/WebViewActivity;Ljava/lang/String;ILjava/lang/Object;)V

    .line 99
    goto :goto_0

    .line 101
    :cond_0
    new-instance v0, Lcom/huawei/operation/jsoperation/StressService$1;

    invoke-direct {v0, p0, p2, v4}, Lcom/huawei/operation/jsoperation/StressService$1;-><init>(Lcom/huawei/operation/jsoperation/StressService;Lcom/huawei/operation/activity/WebViewActivity;Ljava/lang/String;)V

    invoke-interface {p3, p1, p5, p6, v0}, Lcom/huawei/operation/adapter/PluginOperationAdapter;->breatheControl(IIILcom/huawei/hwbasemgr/IBaseResponseCallback;)V

    .line 111
    :goto_0
    return-void
.end method


# virtual methods
.method public execute(Lcom/huawei/operation/activity/WebViewActivity;Lcom/huawei/operation/adapter/PluginOperationAdapter;Lcom/huawei/operation/jsoperation/JsCommandOption;)V
    .locals 6

    .line 31
    if-eqz p3, :cond_0

    if-eqz p1, :cond_0

    if-nez p2, :cond_1

    .line 32
    :cond_0
    const-string v0, "Opera_StressService"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "execute option or web or adapter is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 33
    return-void

    .line 35
    :cond_1
    const-string v0, "Opera_StressService"

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

    .line 36
    invoke-virtual {p3}, Lcom/huawei/operation/jsoperation/JsCommandOption;->getFuncType()Ljava/lang/String;

    move-result-object v4

    const/4 v5, -0x1

    invoke-virtual {v4}, Ljava/lang/String;->hashCode()I

    move-result v0

    sparse-switch v0, :sswitch_data_0

    goto/16 :goto_0

    :sswitch_0
    const-string v0, "STRESS_CONTROL"

    invoke-virtual {v4, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    const/4 v5, 0x0

    goto :goto_0

    :sswitch_1
    const-string v0, "CALIBRATION_CONTROL"

    invoke-virtual {v4, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    const/4 v5, 0x1

    goto :goto_0

    :sswitch_2
    const-string v0, "CHECK_CALIBRATION"

    invoke-virtual {v4, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    const/4 v5, 0x2

    goto :goto_0

    :sswitch_3
    const-string v0, "RESET_CALIBRATION"

    invoke-virtual {v4, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    const/4 v5, 0x3

    goto :goto_0

    :sswitch_4
    const-string v0, "RELAX_CONTROL"

    invoke-virtual {v4, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    const/4 v5, 0x4

    goto :goto_0

    :sswitch_5
    const-string v0, "GAME_CONTROL"

    invoke-virtual {v4, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    const/4 v5, 0x5

    goto :goto_0

    :sswitch_6
    const-string v0, "CHECK_CONNECTED"

    invoke-virtual {v4, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    const/4 v5, 0x6

    goto :goto_0

    :sswitch_7
    const-string v0, "BREATHE_CONTROL"

    invoke-virtual {v4, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    const/4 v5, 0x7

    :cond_2
    :goto_0
    packed-switch v5, :pswitch_data_0

    goto :goto_1

    .line 38
    :pswitch_0
    invoke-direct {p0, p1, p2, p3}, Lcom/huawei/operation/jsoperation/StressService;->stressControl(Lcom/huawei/operation/activity/WebViewActivity;Lcom/huawei/operation/adapter/PluginOperationAdapter;Lcom/huawei/operation/jsoperation/JsCommandOption;)V

    .line 39
    goto :goto_1

    .line 41
    :pswitch_1
    invoke-direct {p0, p1, p2, p3}, Lcom/huawei/operation/jsoperation/StressService;->calibrationControl(Lcom/huawei/operation/activity/WebViewActivity;Lcom/huawei/operation/adapter/PluginOperationAdapter;Lcom/huawei/operation/jsoperation/JsCommandOption;)V

    .line 42
    goto :goto_1

    .line 44
    :pswitch_2
    invoke-direct {p0, p1, p2, p3}, Lcom/huawei/operation/jsoperation/StressService;->checkCalibration(Lcom/huawei/operation/activity/WebViewActivity;Lcom/huawei/operation/adapter/PluginOperationAdapter;Lcom/huawei/operation/jsoperation/JsCommandOption;)V

    .line 45
    goto :goto_1

    .line 47
    :pswitch_3
    invoke-direct {p0, p1, p2, p3}, Lcom/huawei/operation/jsoperation/StressService;->resetCalibration(Lcom/huawei/operation/activity/WebViewActivity;Lcom/huawei/operation/adapter/PluginOperationAdapter;Lcom/huawei/operation/jsoperation/JsCommandOption;)V

    .line 48
    goto :goto_1

    .line 50
    :pswitch_4
    invoke-direct {p0, p1, p2, p3}, Lcom/huawei/operation/jsoperation/StressService;->relaxControl(Lcom/huawei/operation/activity/WebViewActivity;Lcom/huawei/operation/adapter/PluginOperationAdapter;Lcom/huawei/operation/jsoperation/JsCommandOption;)V

    .line 51
    goto :goto_1

    .line 53
    :pswitch_5
    invoke-direct {p0, p1, p2, p3}, Lcom/huawei/operation/jsoperation/StressService;->gameControl(Lcom/huawei/operation/activity/WebViewActivity;Lcom/huawei/operation/adapter/PluginOperationAdapter;Lcom/huawei/operation/jsoperation/JsCommandOption;)V

    .line 54
    goto :goto_1

    .line 56
    :pswitch_6
    invoke-direct {p0, p1, p2, p3}, Lcom/huawei/operation/jsoperation/StressService;->checkConnected(Lcom/huawei/operation/activity/WebViewActivity;Lcom/huawei/operation/adapter/PluginOperationAdapter;Lcom/huawei/operation/jsoperation/JsCommandOption;)V

    .line 57
    goto :goto_1

    .line 59
    :pswitch_7
    invoke-direct {p0, p1, p2, p3}, Lcom/huawei/operation/jsoperation/StressService;->breatheControl(Lcom/huawei/operation/activity/WebViewActivity;Lcom/huawei/operation/adapter/PluginOperationAdapter;Lcom/huawei/operation/jsoperation/JsCommandOption;)V

    .line 60
    .line 64
    :goto_1
    return-void

    nop

    :sswitch_data_0
    .sparse-switch
        -0x705fa438 -> :sswitch_1
        -0x67659d46 -> :sswitch_3
        -0x6502cd92 -> :sswitch_4
        0x216fe852 -> :sswitch_6
        0x373eb2e3 -> :sswitch_7
        0x4c83e9b2 -> :sswitch_0
        0x50f1c9f0 -> :sswitch_5
        0x73055cf3 -> :sswitch_2
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
    .end packed-switch
.end method
