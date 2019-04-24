.class public final Lcom/sina/weibo/sdk/utils/AidTask$AidInfo;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/sina/weibo/sdk/utils/AidTask;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "AidInfo"
.end annotation


# instance fields
.field private mAid:Ljava/lang/String;

.field private mSubCookie:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 128
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static parseJson(Ljava/lang/String;)Lcom/sina/weibo/sdk/utils/AidTask$AidInfo;
    .locals 5
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/sina/weibo/sdk/exception/WeiboException;
        }
    .end annotation

    .line 141
    new-instance v3, Lcom/sina/weibo/sdk/utils/AidTask$AidInfo;

    invoke-direct {v3}, Lcom/sina/weibo/sdk/utils/AidTask$AidInfo;-><init>()V

    .line 143
    :try_start_0
    new-instance v4, Lorg/json/JSONObject;

    invoke-direct {v4, p0}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    .line 144
    const-string v0, "error"

    invoke-virtual {v4, v0}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_0

    const-string v0, "error_code"

    invoke-virtual {v4, v0}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 146
    :cond_0
    const-string v0, "AidTask"

    const-string v1, "loadAidFromNet has error !!!"

    invoke-static {v0, v1}, Lcom/sina/weibo/sdk/utils/LogUtil;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 147
    new-instance v0, Lcom/sina/weibo/sdk/exception/WeiboException;

    const-string v1, "loadAidFromNet has error !!!"

    invoke-direct {v0, v1}, Lcom/sina/weibo/sdk/exception/WeiboException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 149
    :cond_1
    const-string v0, "aid"

    const-string v1, ""

    invoke-virtual {v4, v0, v1}, Lorg/json/JSONObject;->optString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, v3, Lcom/sina/weibo/sdk/utils/AidTask$AidInfo;->mAid:Ljava/lang/String;

    .line 150
    const-string v0, "sub"

    const-string v1, ""

    invoke-virtual {v4, v0, v1}, Lorg/json/JSONObject;->optString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, v3, Lcom/sina/weibo/sdk/utils/AidTask$AidInfo;->mSubCookie:Ljava/lang/String;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 155
    goto :goto_0

    .line 152
    :catch_0
    move-exception v4

    .line 153
    const-string v0, "AidTask"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "loadAidFromNet JSONException Msg : "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v4}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/sina/weibo/sdk/utils/LogUtil;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 154
    new-instance v0, Lcom/sina/weibo/sdk/exception/WeiboException;

    const-string v1, "loadAidFromNet has error !!!"

    invoke-direct {v0, v1}, Lcom/sina/weibo/sdk/exception/WeiboException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 156
    :goto_0
    return-object v3
.end method


# virtual methods
.method cloneAidInfo()Lcom/sina/weibo/sdk/utils/AidTask$AidInfo;
    .locals 2

    .line 160
    new-instance v1, Lcom/sina/weibo/sdk/utils/AidTask$AidInfo;

    invoke-direct {v1}, Lcom/sina/weibo/sdk/utils/AidTask$AidInfo;-><init>()V

    .line 161
    iget-object v0, p0, Lcom/sina/weibo/sdk/utils/AidTask$AidInfo;->mAid:Ljava/lang/String;

    iput-object v0, v1, Lcom/sina/weibo/sdk/utils/AidTask$AidInfo;->mAid:Ljava/lang/String;

    .line 162
    iget-object v0, p0, Lcom/sina/weibo/sdk/utils/AidTask$AidInfo;->mSubCookie:Ljava/lang/String;

    iput-object v0, v1, Lcom/sina/weibo/sdk/utils/AidTask$AidInfo;->mSubCookie:Ljava/lang/String;

    .line 163
    return-object v1
.end method

.method public getAid()Ljava/lang/String;
    .locals 1

    .line 133
    iget-object v0, p0, Lcom/sina/weibo/sdk/utils/AidTask$AidInfo;->mAid:Ljava/lang/String;

    return-object v0
.end method

.method public getSubCookie()Ljava/lang/String;
    .locals 1

    .line 137
    iget-object v0, p0, Lcom/sina/weibo/sdk/utils/AidTask$AidInfo;->mSubCookie:Ljava/lang/String;

    return-object v0
.end method
