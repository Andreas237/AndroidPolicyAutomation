.class public Lcom/huawei/feedback/logic/h;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final a:Ljava/lang/String; = "FeedbackScoreResponse"


# instance fields
.field private b:I

.field private c:Ljava/lang/String;

.field private d:Ljava/lang/String;

.field private e:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 11
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 23
    const-string v0, "status"

    iput-object v0, p0, Lcom/huawei/feedback/logic/h;->c:Ljava/lang/String;

    .line 25
    const-string v0, "questionId"

    iput-object v0, p0, Lcom/huawei/feedback/logic/h;->d:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public a()I
    .locals 1

    .line 77
    iget v0, p0, Lcom/huawei/feedback/logic/h;->b:I

    return v0
.end method

.method public a(Ljava/lang/String;)I
    .locals 4

    .line 36
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 38
    const-string v0, "FeedbackScoreResponse"

    const-string v1, "Input param invalid."

    invoke-static {v0, v1}, Lcom/huawei/phoneserviceuni/common/e/c;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 40
    const/16 v0, 0x3e9

    return v0

    .line 43
    :cond_0
    const/4 v2, 0x0

    .line 45
    :try_start_0
    new-instance v2, Lorg/json/JSONObject;

    invoke-direct {v2, p1}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    .line 51
    goto :goto_0

    .line 46
    :catch_0
    move-exception v3

    .line 48
    const-string v0, "FeedbackScoreResponse"

    const-string v1, "JSONException - new JSONObject error..."

    invoke-static {v0, v1}, Lcom/huawei/phoneserviceuni/common/e/c;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 50
    const/16 v0, 0x3f0

    return v0

    .line 55
    :goto_0
    :try_start_1
    iget-object v0, p0, Lcom/huawei/feedback/logic/h;->c:Ljava/lang/String;

    invoke-virtual {v2, v0}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v0

    invoke-virtual {p0, v0}, Lcom/huawei/feedback/logic/h;->a(I)V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    .line 61
    goto :goto_1

    .line 56
    :catch_1
    move-exception v3

    .line 58
    const-string v0, "FeedbackScoreResponse"

    const-string v1, "number_format_exception..."

    invoke-static {v0, v1}, Lcom/huawei/phoneserviceuni/common/e/c;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 60
    const/16 v0, 0x3ef

    return v0

    .line 65
    :goto_1
    :try_start_2
    iget-object v0, p0, Lcom/huawei/feedback/logic/h;->d:Ljava/lang/String;

    invoke-virtual {v2, v0}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/huawei/feedback/logic/h;->b(Ljava/lang/String;)V
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_2

    .line 71
    goto :goto_2

    .line 66
    :catch_2
    move-exception v3

    .line 68
    const-string v0, "FeedbackScoreResponse"

    const-string v1, "unknown_error..."

    invoke-static {v0, v1}, Lcom/huawei/phoneserviceuni/common/e/c;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 70
    const/4 v0, -0x1

    return v0

    .line 73
    :goto_2
    const/4 v0, 0x0

    return v0
.end method

.method public a(I)V
    .locals 0

    .line 81
    iput p1, p0, Lcom/huawei/feedback/logic/h;->b:I

    .line 82
    return-void
.end method

.method public b()Ljava/lang/String;
    .locals 1

    .line 85
    iget-object v0, p0, Lcom/huawei/feedback/logic/h;->e:Ljava/lang/String;

    return-object v0
.end method

.method public b(Ljava/lang/String;)V
    .locals 0

    .line 89
    iput-object p1, p0, Lcom/huawei/feedback/logic/h;->e:Ljava/lang/String;

    .line 90
    return-void
.end method
