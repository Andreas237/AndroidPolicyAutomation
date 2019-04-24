.class public abstract Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/fm/util/ServiceCodeBuilder;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final SEPERATOR:Ljava/lang/String; = "|"

.field private static final SERVICE_DATA_LEN:I = 0xe

.field public static final SERVICE_TYPE_ACT_ISSUE:I = 0x1

.field public static final SERVICE_TYPE_ACT_RECHARGE:I = 0x2

.field public static final SERVICE_TYPE_MANAGE_DELETE:I = 0x4

.field public static final SERVICE_TYPE_MANAGE_MOVE:I = 0x3

.field private static final SIGN_TYPE_RSA256:Ljava/lang/String; = "RSA256"


# instance fields
.field protected mContext:Landroid/content/Context;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 0

    .line 54
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 55
    iput-object p1, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/fm/util/ServiceCodeBuilder;->mContext:Landroid/content/Context;

    .line 56
    return-void
.end method

.method private buildServiceDataAndCheckCode([B)[B
    .locals 13

    .line 210
    const/4 v0, 0x0

    new-array v3, v0, [B

    .line 211
    const/4 v4, 0x0

    .line 212
    invoke-static {p1}, Lcn/com/fmsh/util/FM_Bytes;->bytesToHexString([B)Ljava/lang/String;

    move-result-object v5

    .line 213
    new-instance v6, Lcom/huawei/nfc/carrera/server/card/request/CardServerBaseRequest;

    invoke-direct {v6}, Lcom/huawei/nfc/carrera/server/card/request/CardServerBaseRequest;-><init>()V

    .line 215
    new-instance v0, Lcom/huawei/nfc/carrera/server/card/impl/CommonCardServer;

    iget-object v1, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/fm/util/ServiceCodeBuilder;->mContext:Landroid/content/Context;

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lcom/huawei/nfc/carrera/server/card/impl/CommonCardServer;-><init>(Landroid/content/Context;Ljava/lang/String;)V

    const-string v1, "RSA256"

    invoke-virtual {v0, v6, v5, v1}, Lcom/huawei/nfc/carrera/server/card/impl/CommonCardServer;->querySignData(Lcom/huawei/nfc/carrera/server/card/request/CardServerBaseRequest;Ljava/lang/String;Ljava/lang/String;)Lcom/huawei/nfc/carrera/server/card/response/SignDataResponse;

    move-result-object v7

    .line 216
    if-eqz v7, :cond_2

    iget v0, v7, Lcom/huawei/nfc/carrera/server/card/response/SignDataResponse;->returnCode:I

    if-nez v0, :cond_2

    .line 218
    iget-object v8, v7, Lcom/huawei/nfc/carrera/server/card/response/SignDataResponse;->time:Ljava/lang/String;

    .line 219
    iget-object v9, v7, Lcom/huawei/nfc/carrera/server/card/response/SignDataResponse;->sign:Ljava/lang/String;

    .line 220
    const/4 v0, 0x1

    invoke-static {v8, v0}, Lcom/huawei/nfc/carrera/util/StringUtil;->isEmpty(Ljava/lang/String;Z)Z

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x1

    invoke-static {v9, v0}, Lcom/huawei/nfc/carrera/util/StringUtil;->isEmpty(Ljava/lang/String;Z)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 222
    :cond_0
    new-instance v10, Ljava/util/HashMap;

    invoke-direct {v10}, Ljava/util/HashMap;-><init>()V

    .line 223
    const-string v11, "buildServiceDataAndCheckCode, illegal response"

    .line 224
    const-string v0, "fail_reason"

    invoke-interface {v10, v0, v11}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 225
    const v0, 0x3611a434

    const/4 v1, 0x0

    const/4 v2, 0x0

    invoke-static {v0, v10, v11, v1, v2}, Lcom/huawei/nfc/carrera/util/LogX;->e(ILjava/util/Map;Ljava/lang/String;ZZ)V

    .line 227
    return-object v3

    .line 232
    :cond_1
    :try_start_0
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "|"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "utf-8"

    invoke-virtual {v0, v1}, Ljava/lang/String;->getBytes(Ljava/lang/String;)[B

    move-result-object v10

    .line 233
    const-string v0, "utf-8"

    invoke-virtual {v9, v0}, Ljava/lang/String;->getBytes(Ljava/lang/String;)[B

    move-result-object v11

    .line 234
    invoke-static {v10, v11}, Lcn/com/fmsh/util/FM_Bytes;->join([B[B)[B
    :try_end_0
    .catch Ljava/io/UnsupportedEncodingException; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v4

    .line 243
    goto :goto_0

    .line 236
    :catch_0
    move-exception v10

    .line 238
    new-instance v11, Ljava/util/HashMap;

    invoke-direct {v11}, Ljava/util/HashMap;-><init>()V

    .line 239
    const-string v12, "buildActDataAndCheckCode, UnsupportedEncodingException serviceData or checkCode"

    .line 240
    const-string v0, "fail_reason"

    invoke-interface {v11, v0, v12}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 241
    const v0, 0x3611a434

    const/4 v1, 0x0

    const/4 v2, 0x0

    invoke-static {v0, v11, v12, v1, v2}, Lcom/huawei/nfc/carrera/util/LogX;->e(ILjava/util/Map;Ljava/lang/String;ZZ)V

    .line 242
    return-object v3

    .line 244
    :goto_0
    goto :goto_2

    .line 247
    :cond_2
    new-instance v8, Ljava/util/HashMap;

    invoke-direct {v8}, Ljava/util/HashMap;-><init>()V

    .line 248
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "buildActDataAndCheckCode, "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const/4 v1, 0x0

    if-ne v1, v7, :cond_3

    const-string v1, "response is null"

    goto :goto_1

    :cond_3
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "return code error : "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget v2, v7, Lcom/huawei/nfc/carrera/server/card/response/SignDataResponse;->returnCode:I

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    :goto_1
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v9

    .line 249
    const-string v0, "fail_reason"

    invoke-interface {v8, v0, v9}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 250
    const v0, 0x3611a434

    const/4 v1, 0x0

    const/4 v2, 0x0

    invoke-static {v0, v8, v9, v1, v2}, Lcom/huawei/nfc/carrera/util/LogX;->e(ILjava/util/Map;Ljava/lang/String;ZZ)V

    .line 253
    :goto_2
    return-object v4
.end method

.method private buildServiceNoAndServiceDataLenAndData(ILjava/lang/String;)[B
    .locals 9

    .line 105
    const-string v0, "enter buildServiceNoAndServiceDataLenAndData "

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->i(Ljava/lang/String;)V

    .line 106
    const/4 v0, 0x0

    new-array v2, v0, [B

    .line 107
    invoke-virtual {p0, p1}, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/fm/util/ServiceCodeBuilder;->getServiceNo(I)Ljava/lang/String;

    move-result-object v3

    .line 108
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "serviceNoStr = "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->i(Ljava/lang/String;)V

    .line 109
    const/4 v0, 0x1

    invoke-static {v3, v0}, Lcom/huawei/nfc/carrera/util/StringUtil;->isEmpty(Ljava/lang/String;Z)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 111
    const-string v0, "buildServiceNoAndServiceDataLenAndData, illegal serviceNoStr"

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->e(Ljava/lang/String;)V

    .line 112
    return-object v2

    .line 114
    :cond_0
    const/4 v4, 0x0

    .line 115
    const/4 v5, 0x0

    .line 116
    invoke-virtual {p0, p2}, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/fm/util/ServiceCodeBuilder;->getServiceData(Ljava/lang/String;)[B

    move-result-object v6

    .line 117
    const/4 v7, 0x0

    .line 118
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "enter serviceData : "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->i(Ljava/lang/String;)V

    .line 121
    const-string v0, "utf-8"

    :try_start_0
    invoke-virtual {v3, v0}, Ljava/lang/String;->getBytes(Ljava/lang/String;)[B

    move-result-object v4

    .line 122
    if-eqz v6, :cond_1

    array-length v0, v6

    if-nez v0, :cond_2

    .line 124
    :cond_1
    const-string v0, "buildServiceNoAndServiceDataLenAndData, illegal serviceData"

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->e(Ljava/lang/String;)V

    .line 125
    const/16 v0, 0xe

    const/4 v1, 0x2

    invoke-static {v0, v1}, Lcn/com/fmsh/util/FM_Bytes;->intToBytes(II)[B

    move-result-object v5

    .line 126
    invoke-static {v4, v5}, Lcn/com/fmsh/util/FM_Bytes;->join([B[B)[B

    move-result-object v7

    goto :goto_0

    .line 130
    :cond_2
    array-length v0, v6

    add-int/lit8 v0, v0, 0xe

    const/4 v1, 0x2

    invoke-static {v0, v1}, Lcn/com/fmsh/util/FM_Bytes;->intToBytes(II)[B

    move-result-object v5

    .line 131
    invoke-static {v4, v5}, Lcn/com/fmsh/util/FM_Bytes;->join([B[B)[B

    move-result-object v8

    .line 132
    invoke-static {v8, v6}, Lcn/com/fmsh/util/FM_Bytes;->join([B[B)[B
    :try_end_0
    .catch Ljava/io/UnsupportedEncodingException; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v7

    .line 139
    :goto_0
    goto :goto_1

    .line 135
    :catch_0
    move-exception v8

    .line 137
    const-string v0, "buildServiceNoAndServiceDataLenAndData, UnsupportedEncodingException serviceNo"

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->e(Ljava/lang/String;)V

    .line 138
    return-object v2

    .line 140
    :goto_1
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "buildServiceNoAndServiceDataLenAndData, serviceNo ="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-static {v4}, Lcn/com/fmsh/util/FM_Bytes;->bytesToHexString([B)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, " , serviceDataLen ="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    .line 141
    invoke-static {v5}, Lcn/com/fmsh/util/FM_Bytes;->bytesToHexString([B)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, " , serviceData ="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    .line 142
    invoke-static {v6}, Lcn/com/fmsh/util/FM_Bytes;->bytesToHexString([B)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, " , serviceNoAndServiceDataLenAndData ="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    .line 143
    invoke-static {v7}, Lcn/com/fmsh/util/FM_Bytes;->bytesToHexString([B)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 140
    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->i(Ljava/lang/String;)V

    .line 145
    return-object v7
.end method


# virtual methods
.method public buildServiceCode(ILjava/lang/String;)[B
    .locals 6

    .line 67
    const/4 v0, 0x0

    new-array v2, v0, [B

    .line 69
    invoke-direct {p0, p1, p2}, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/fm/util/ServiceCodeBuilder;->buildServiceNoAndServiceDataLenAndData(ILjava/lang/String;)[B

    move-result-object v3

    .line 70
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "serviceNoAndServiceDataLen = "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->i(Ljava/lang/String;)V

    .line 71
    const/4 v0, 0x0

    if-eq v0, v3, :cond_0

    array-length v0, v3

    const/4 v1, 0x0

    if-ne v1, v0, :cond_1

    .line 73
    :cond_0
    const-string v0, "buildServiceCode, illegal serviceNoAndServiceDataLen"

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->e(Ljava/lang/String;)V

    .line 74
    return-object v2

    .line 78
    :cond_1
    invoke-direct {p0, v3}, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/fm/util/ServiceCodeBuilder;->buildServiceDataAndCheckCode([B)[B

    move-result-object v4

    .line 79
    const/4 v0, 0x0

    if-eq v0, v4, :cond_2

    array-length v0, v4

    const/4 v1, 0x0

    if-ne v1, v0, :cond_3

    .line 81
    :cond_2
    const-string v0, "buildServiceCode, illegal serviceDataAndCheckCode"

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->e(Ljava/lang/String;)V

    .line 82
    return-object v2

    .line 86
    :cond_3
    invoke-static {v3, v4}, Lcn/com/fmsh/util/FM_Bytes;->join([B[B)[B

    move-result-object v5

    .line 88
    return-object v5
.end method

.method protected abstract getServiceData(Ljava/lang/String;)[B
.end method

.method protected abstract getServiceNo(I)Ljava/lang/String;
.end method
