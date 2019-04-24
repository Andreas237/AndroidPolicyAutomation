.class public Lcom/sina/weibo/sdk/web/WebPicUploadResult;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final RESP_UPLOAD_PIC_PARAM_CODE:Ljava/lang/String; = "code"

.field public static final RESP_UPLOAD_PIC_PARAM_DATA:Ljava/lang/String; = "data"

.field public static final RESP_UPLOAD_PIC_SUCC_CODE:I = 0x1


# instance fields
.field private code:I

.field private picId:Ljava/lang/String;


# direct methods
.method private constructor <init>()V
    .locals 1

    .line 21
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 18
    const/4 v0, -0x2

    iput v0, p0, Lcom/sina/weibo/sdk/web/WebPicUploadResult;->code:I

    .line 21
    return-void
.end method

.method public static parse(Ljava/lang/String;)Lcom/sina/weibo/sdk/web/WebPicUploadResult;
    .locals 4

    .line 32
    invoke-static {p0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 33
    const/4 v0, 0x0

    return-object v0

    .line 35
    :cond_0
    new-instance v2, Lcom/sina/weibo/sdk/web/WebPicUploadResult;

    invoke-direct {v2}, Lcom/sina/weibo/sdk/web/WebPicUploadResult;-><init>()V

    .line 37
    :try_start_0
    new-instance v3, Lorg/json/JSONObject;

    invoke-direct {v3, p0}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    .line 38
    const-string v0, "code"

    const/4 v1, -0x2

    invoke-virtual {v3, v0, v1}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;I)I

    move-result v0

    iput v0, v2, Lcom/sina/weibo/sdk/web/WebPicUploadResult;->code:I

    .line 40
    const-string v0, "data"

    const-string v1, ""

    invoke-virtual {v3, v0, v1}, Lorg/json/JSONObject;->optString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, v2, Lcom/sina/weibo/sdk/web/WebPicUploadResult;->picId:Ljava/lang/String;
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    .line 42
    goto :goto_0

    .line 41
    :catch_0
    move-exception v3

    .line 43
    :goto_0
    return-object v2
.end method


# virtual methods
.method public getCode()I
    .locals 1

    .line 24
    iget v0, p0, Lcom/sina/weibo/sdk/web/WebPicUploadResult;->code:I

    return v0
.end method

.method public getPicId()Ljava/lang/String;
    .locals 1

    .line 28
    iget-object v0, p0, Lcom/sina/weibo/sdk/web/WebPicUploadResult;->picId:Ljava/lang/String;

    return-object v0
.end method
