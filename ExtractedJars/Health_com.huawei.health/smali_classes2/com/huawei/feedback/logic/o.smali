.class public Lcom/huawei/feedback/logic/o;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# static fields
.field private static final b:Ljava/lang/String; = "GetFeedbackResTask"


# instance fields
.field private a:Ljava/lang/String;

.field private c:Landroid/os/Handler;

.field private d:Lcom/huawei/feedback/bean/f;


# direct methods
.method public constructor <init>(Ljava/lang/String;Landroid/os/Handler;)V
    .locals 2

    .line 25
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 19
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/feedback/logic/o;->a:Ljava/lang/String;

    .line 21
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/feedback/logic/o;->c:Landroid/os/Handler;

    .line 22
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/feedback/logic/o;->d:Lcom/huawei/feedback/bean/f;

    .line 26
    const-string v0, "GetFeedbackResTask"

    const-string v1, "GetFeedbackResTask was contructed "

    invoke-static {v0, v1}, Lcom/huawei/phoneserviceuni/common/e/c;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 27
    iput-object p1, p0, Lcom/huawei/feedback/logic/o;->a:Ljava/lang/String;

    .line 28
    iput-object p2, p0, Lcom/huawei/feedback/logic/o;->c:Landroid/os/Handler;

    .line 29
    return-void
.end method

.method public static a(Ljava/lang/String;)Ljava/lang/String;
    .locals 2

    .line 73
    invoke-static {p0}, Lcom/huawei/feedback/e;->d(Ljava/lang/String;)Ljavax/net/ssl/HttpsURLConnection;

    move-result-object v1

    .line 75
    if-nez v1, :cond_0

    .line 76
    const-string v0, ""

    return-object v0

    .line 79
    :cond_0
    invoke-static {v1}, Lcom/huawei/feedback/e;->a(Ljavax/net/ssl/HttpsURLConnection;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method private b(Ljava/lang/String;)Z
    .locals 8

    .line 85
    if-eqz p1, :cond_0

    .line 86
    :try_start_0
    new-instance v2, Lorg/json/JSONTokener;

    invoke-direct {v2, p1}, Lorg/json/JSONTokener;-><init>(Ljava/lang/String;)V

    .line 87
    invoke-virtual {v2}, Lorg/json/JSONTokener;->nextValue()Ljava/lang/Object;

    move-result-object v3

    .line 89
    if-eqz v3, :cond_0

    instance-of v0, v3, Lorg/json/JSONObject;

    if-eqz v0, :cond_0

    .line 90
    move-object v4, v3

    check-cast v4, Lorg/json/JSONObject;

    .line 92
    const-string v0, "questionId"

    invoke-virtual {v4, v0}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    .line 94
    const-string v0, "answer"

    invoke-virtual {v4, v0}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    .line 95
    const-string v0, "picUrl"

    invoke-virtual {v4, v0}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    .line 97
    new-instance v0, Lcom/huawei/feedback/bean/f;

    invoke-direct {v0}, Lcom/huawei/feedback/bean/f;-><init>()V

    iput-object v0, p0, Lcom/huawei/feedback/logic/o;->d:Lcom/huawei/feedback/bean/f;

    .line 98
    iget-object v0, p0, Lcom/huawei/feedback/logic/o;->d:Lcom/huawei/feedback/bean/f;

    invoke-virtual {v0, v5}, Lcom/huawei/feedback/bean/f;->i(Ljava/lang/String;)V

    .line 100
    iget-object v0, p0, Lcom/huawei/feedback/logic/o;->d:Lcom/huawei/feedback/bean/f;

    invoke-virtual {v0, v6}, Lcom/huawei/feedback/bean/f;->l(Ljava/lang/String;)V

    .line 101
    iget-object v0, p0, Lcom/huawei/feedback/logic/o;->d:Lcom/huawei/feedback/bean/f;

    invoke-virtual {v0, v7}, Lcom/huawei/feedback/bean/f;->m(Ljava/lang/String;)V
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    .line 103
    const/4 v0, 0x1

    return v0

    .line 110
    :cond_0
    goto :goto_0

    .line 108
    :catch_0
    move-exception v2

    .line 109
    const-string v0, "GetFeedbackResTask"

    const-string v1, "parse feedback response error,error is json exc "

    invoke-static {v0, v1}, Lcom/huawei/phoneserviceuni/common/e/c;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 116
    :goto_0
    const/4 v0, 0x0

    return v0
.end method


# virtual methods
.method public run()V
    .locals 7

    .line 36
    iget-object v0, p0, Lcom/huawei/feedback/logic/o;->a:Ljava/lang/String;

    invoke-static {v0}, Lcom/huawei/feedback/logic/o;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    .line 40
    invoke-direct {p0, v3}, Lcom/huawei/feedback/logic/o;->b(Ljava/lang/String;)Z

    move-result v4

    .line 41
    const/4 v5, 0x0

    .line 42
    :cond_0
    if-nez v4, :cond_1

    .line 44
    const-wide/16 v0, 0xbb8

    :try_start_0
    invoke-static {v0, v1}, Ljava/lang/Thread;->sleep(J)V
    :try_end_0
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_0

    .line 47
    goto :goto_0

    .line 45
    :catch_0
    move-exception v6

    .line 46
    const-string v0, "GetFeedbackResTask"

    const-string v1, "thread sleep error"

    invoke-static {v0, v1}, Lcom/huawei/phoneserviceuni/common/e/c;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 48
    :goto_0
    iget-object v0, p0, Lcom/huawei/feedback/logic/o;->a:Ljava/lang/String;

    invoke-static {v0}, Lcom/huawei/feedback/logic/o;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    .line 50
    invoke-direct {p0, v3}, Lcom/huawei/feedback/logic/o;->b(Ljava/lang/String;)Z

    move-result v4

    .line 51
    add-int/lit8 v5, v5, 0x1

    .line 52
    const-string v0, "GetFeedbackResTask"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, " retry getFeedbackResponse,time is "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/huawei/phoneserviceuni/common/e/c;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 54
    const/4 v0, 0x5

    if-ne v5, v0, :cond_0

    .line 55
    .line 59
    :cond_1
    if-eqz v4, :cond_2

    iget-object v0, p0, Lcom/huawei/feedback/logic/o;->d:Lcom/huawei/feedback/bean/f;

    if-eqz v0, :cond_2

    .line 61
    invoke-static {}, Landroid/os/Message;->obtain()Landroid/os/Message;

    move-result-object v6

    .line 62
    const/16 v0, 0x7d1

    iput v0, v6, Landroid/os/Message;->what:I

    .line 63
    iget-object v0, p0, Lcom/huawei/feedback/logic/o;->d:Lcom/huawei/feedback/bean/f;

    iput-object v0, v6, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 64
    iget-object v0, p0, Lcom/huawei/feedback/logic/o;->c:Landroid/os/Handler;

    invoke-virtual {v0, v6}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    .line 65
    goto :goto_1

    .line 66
    :cond_2
    invoke-static {}, Landroid/os/Message;->obtain()Landroid/os/Message;

    move-result-object v6

    .line 67
    const/16 v0, 0x7d2

    iput v0, v6, Landroid/os/Message;->what:I

    .line 68
    iget-object v0, p0, Lcom/huawei/feedback/logic/o;->c:Landroid/os/Handler;

    invoke-virtual {v0, v6}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    .line 70
    :goto_1
    return-void
.end method
