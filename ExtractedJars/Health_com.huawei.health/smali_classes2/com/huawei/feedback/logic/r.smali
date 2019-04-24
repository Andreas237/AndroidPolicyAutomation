.class public Lcom/huawei/feedback/logic/r;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Ljava/lang/String; = "status"

.field public static final b:Ljava/lang/String; = "id"

.field private static final c:Ljava/lang/String; = "SubmitFeedbackResponse"


# instance fields
.field private d:I

.field private e:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 11
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a()I
    .locals 1

    .line 89
    iget v0, p0, Lcom/huawei/feedback/logic/r;->d:I

    return v0
.end method

.method public a(Ljava/lang/String;)I
    .locals 5

    .line 42
    const-string v0, "SubmitFeedbackResponse"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "rsp = "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/huawei/phoneserviceuni/common/e/c;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 43
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 45
    const-string v0, "SubmitFeedbackResponse"

    const-string v1, "Input param invalid."

    invoke-static {v0, v1}, Lcom/huawei/phoneserviceuni/common/e/c;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 47
    const/16 v0, 0x3e9

    return v0

    .line 50
    :cond_0
    const/4 v3, 0x0

    .line 52
    :try_start_0
    new-instance v3, Lorg/json/JSONObject;

    invoke-direct {v3, p1}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    .line 58
    goto :goto_0

    .line 53
    :catch_0
    move-exception v4

    .line 55
    const-string v0, "SubmitFeedbackResponse"

    const-string v1, "JSONException ..."

    invoke-static {v0, v1}, Lcom/huawei/phoneserviceuni/common/e/c;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 57
    const/16 v0, 0x3f0

    return v0

    .line 62
    :goto_0
    const-string v0, "status"

    :try_start_1
    invoke-virtual {v3, v0}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v0

    iput v0, p0, Lcom/huawei/feedback/logic/r;->d:I
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    .line 68
    goto :goto_1

    .line 63
    :catch_1
    move-exception v4

    .line 65
    const-string v0, "SubmitFeedbackResponse"

    const-string v1, "NUMBER_FORMAT_EXCEPTION ..."

    invoke-static {v0, v1}, Lcom/huawei/phoneserviceuni/common/e/c;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 67
    const/16 v0, 0x3ef

    return v0

    .line 70
    :goto_1
    iget v0, p0, Lcom/huawei/feedback/logic/r;->d:I

    const/4 v1, 0x0

    if-eq v1, v0, :cond_1

    .line 72
    iget v0, p0, Lcom/huawei/feedback/logic/r;->d:I

    return v0

    .line 77
    :cond_1
    const-string v0, "id"

    :try_start_2
    invoke-virtual {v3, v0}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/feedback/logic/r;->e:Ljava/lang/String;
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_2

    .line 83
    goto :goto_2

    .line 78
    :catch_2
    move-exception v4

    .line 80
    const-string v0, "SubmitFeedbackResponse"

    const-string v1, "jsonObject.getString error"

    invoke-static {v0, v1}, Lcom/huawei/phoneserviceuni/common/e/c;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 82
    const-string v0, ""

    iput-object v0, p0, Lcom/huawei/feedback/logic/r;->e:Ljava/lang/String;

    .line 85
    :goto_2
    const/4 v0, 0x0

    return v0
.end method

.method public a(I)V
    .locals 0

    .line 93
    iput p1, p0, Lcom/huawei/feedback/logic/r;->d:I

    .line 94
    return-void
.end method

.method public b()Ljava/lang/String;
    .locals 1

    .line 97
    iget-object v0, p0, Lcom/huawei/feedback/logic/r;->e:Ljava/lang/String;

    return-object v0
.end method

.method public b(Ljava/lang/String;)V
    .locals 0

    .line 101
    iput-object p1, p0, Lcom/huawei/feedback/logic/r;->e:Ljava/lang/String;

    .line 102
    return-void
.end method
