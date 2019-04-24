.class Lcom/tencent/open/TaskGuide$d;
.super Lcom/tencent/open/TaskGuide$a;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/tencent/open/TaskGuide;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = "d"
.end annotation


# instance fields
.field b:I

.field final synthetic c:Lcom/tencent/open/TaskGuide;


# direct methods
.method public constructor <init>(Lcom/tencent/open/TaskGuide;I)V
    .locals 1

    .line 938
    iput-object p1, p0, Lcom/tencent/open/TaskGuide$d;->c:Lcom/tencent/open/TaskGuide;

    const/4 v0, 0x0

    invoke-direct {p0, p1, v0}, Lcom/tencent/open/TaskGuide$a;-><init>(Lcom/tencent/open/TaskGuide;Lcom/tencent/open/TaskGuide$1;)V

    .line 937
    const/4 v0, -0x1

    iput v0, p0, Lcom/tencent/open/TaskGuide$d;->b:I

    .line 939
    iput p2, p0, Lcom/tencent/open/TaskGuide$d;->b:I

    .line 940
    return-void
.end method


# virtual methods
.method protected a(Ljava/lang/Exception;)V
    .locals 5

    .line 987
    if-eqz p1, :cond_0

    .line 988
    invoke-virtual {p1}, Ljava/lang/Exception;->printStackTrace()V

    .line 991
    :cond_0
    iget-object v0, p0, Lcom/tencent/open/TaskGuide$d;->c:Lcom/tencent/open/TaskGuide;

    iget-object v0, v0, Lcom/tencent/open/TaskGuide;->c:Lcom/tencent/tauth/IUiListener;

    new-instance v1, Lcom/tencent/tauth/UiError;

    const-string v2, "error "

    const-string v3, "\u91d1\u5238\u9886\u53d6\u65f6\u51fa\u73b0\u5f02\u5e38"

    const/16 v4, 0x65

    invoke-direct {v1, v4, v2, v3}, Lcom/tencent/tauth/UiError;-><init>(ILjava/lang/String;Ljava/lang/String;)V

    invoke-interface {v0, v1}, Lcom/tencent/tauth/IUiListener;->onError(Lcom/tencent/tauth/UiError;)V

    .line 993
    iget-object v0, p0, Lcom/tencent/open/TaskGuide$d;->c:Lcom/tencent/open/TaskGuide;

    invoke-static {v0}, Lcom/tencent/open/TaskGuide;->s(Lcom/tencent/open/TaskGuide;)Landroid/os/Handler;

    move-result-object v0

    if-eqz v0, :cond_1

    .line 994
    iget-object v0, p0, Lcom/tencent/open/TaskGuide$d;->c:Lcom/tencent/open/TaskGuide;

    invoke-static {v0}, Lcom/tencent/open/TaskGuide;->s(Lcom/tencent/open/TaskGuide;)Landroid/os/Handler;

    move-result-object v0

    new-instance v1, Lcom/tencent/open/TaskGuide$d$1;

    invoke-direct {v1, p0, p1}, Lcom/tencent/open/TaskGuide$d$1;-><init>(Lcom/tencent/open/TaskGuide$d;Ljava/lang/Exception;)V

    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 1015
    :cond_1
    return-void
.end method

.method public onComplete(Lorg/json/JSONObject;)V
    .locals 7

    .line 944
    const/4 v3, 0x0

    .line 946
    const-string v0, "code"

    :try_start_0
    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->getInt(Ljava/lang/String;)I

    move-result v4

    .line 947
    const-string v0, "message"

    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    move-object v3, v0

    .line 948
    if-nez v4, :cond_0

    .line 949
    iget-object v0, p0, Lcom/tencent/open/TaskGuide$d;->c:Lcom/tencent/open/TaskGuide;

    iget v1, p0, Lcom/tencent/open/TaskGuide$d;->b:I

    sget-object v2, Lcom/tencent/open/TaskGuide$k;->e:Lcom/tencent/open/TaskGuide$k;

    invoke-static {v0, v1, v2}, Lcom/tencent/open/TaskGuide;->a(Lcom/tencent/open/TaskGuide;ILcom/tencent/open/TaskGuide$k;)V

    .line 951
    new-instance v5, Lorg/json/JSONObject;

    invoke-direct {v5}, Lorg/json/JSONObject;-><init>()V
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_2

    .line 953
    const-string v0, "result"

    const-string v1, "\u91d1\u5238\u9886\u53d6\u6210\u529f"

    :try_start_1
    invoke-virtual {v5, v0, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    :try_end_1
    .catch Lorg/json/JSONException; {:try_start_1 .. :try_end_1} :catch_0

    .line 957
    goto :goto_0

    .line 954
    :catch_0
    move-exception v6

    .line 956
    :try_start_2
    invoke-virtual {v6}, Lorg/json/JSONException;->printStackTrace()V

    .line 958
    :goto_0
    iget-object v0, p0, Lcom/tencent/open/TaskGuide$d;->c:Lcom/tencent/open/TaskGuide;

    iget-object v0, v0, Lcom/tencent/open/TaskGuide;->c:Lcom/tencent/tauth/IUiListener;

    invoke-interface {v0, v5}, Lcom/tencent/tauth/IUiListener;->onComplete(Ljava/lang/Object;)V

    .line 961
    goto :goto_2

    .line 962
    :cond_0
    iget-object v0, p0, Lcom/tencent/open/TaskGuide$d;->c:Lcom/tencent/open/TaskGuide;

    iget v1, p0, Lcom/tencent/open/TaskGuide$d;->b:I

    sget-object v2, Lcom/tencent/open/TaskGuide$k;->d:Lcom/tencent/open/TaskGuide$k;

    invoke-static {v0, v1, v2}, Lcom/tencent/open/TaskGuide;->a(Lcom/tencent/open/TaskGuide;ILcom/tencent/open/TaskGuide$k;)V

    .line 963
    iget-object v0, p0, Lcom/tencent/open/TaskGuide$d;->c:Lcom/tencent/open/TaskGuide;

    invoke-static {v0, v3}, Lcom/tencent/open/TaskGuide;->a(Lcom/tencent/open/TaskGuide;Ljava/lang/String;)V

    .line 965
    new-instance v5, Lorg/json/JSONObject;

    invoke-direct {v5}, Lorg/json/JSONObject;-><init>()V
    :try_end_2
    .catch Lorg/json/JSONException; {:try_start_2 .. :try_end_2} :catch_2

    .line 967
    const-string v0, "result"

    const-string v1, "\u91d1\u5238\u9886\u53d6\u5931\u8d25"

    :try_start_3
    invoke-virtual {v5, v0, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    :try_end_3
    .catch Lorg/json/JSONException; {:try_start_3 .. :try_end_3} :catch_1

    .line 971
    goto :goto_1

    .line 968
    :catch_1
    move-exception v6

    .line 970
    :try_start_4
    invoke-virtual {v6}, Lorg/json/JSONException;->printStackTrace()V

    .line 972
    :goto_1
    iget-object v0, p0, Lcom/tencent/open/TaskGuide$d;->c:Lcom/tencent/open/TaskGuide;

    iget-object v0, v0, Lcom/tencent/open/TaskGuide;->c:Lcom/tencent/tauth/IUiListener;

    invoke-interface {v0, v5}, Lcom/tencent/tauth/IUiListener;->onComplete(Ljava/lang/Object;)V
    :try_end_4
    .catch Lorg/json/JSONException; {:try_start_4 .. :try_end_4} :catch_2

    .line 979
    :goto_2
    goto :goto_3

    .line 975
    :catch_2
    move-exception v4

    .line 976
    iget-object v0, p0, Lcom/tencent/open/TaskGuide$d;->c:Lcom/tencent/open/TaskGuide;

    iget v1, p0, Lcom/tencent/open/TaskGuide$d;->b:I

    sget-object v2, Lcom/tencent/open/TaskGuide$k;->d:Lcom/tencent/open/TaskGuide$k;

    invoke-static {v0, v1, v2}, Lcom/tencent/open/TaskGuide;->a(Lcom/tencent/open/TaskGuide;ILcom/tencent/open/TaskGuide$k;)V

    .line 977
    iget-object v0, p0, Lcom/tencent/open/TaskGuide$d;->c:Lcom/tencent/open/TaskGuide;

    invoke-static {v0, v3}, Lcom/tencent/open/TaskGuide;->a(Lcom/tencent/open/TaskGuide;Ljava/lang/String;)V

    .line 978
    invoke-virtual {v4}, Lorg/json/JSONException;->printStackTrace()V

    .line 980
    :goto_3
    iget-object v0, p0, Lcom/tencent/open/TaskGuide$d;->c:Lcom/tencent/open/TaskGuide;

    iget v1, p0, Lcom/tencent/open/TaskGuide$d;->b:I

    invoke-static {v0, v1}, Lcom/tencent/open/TaskGuide;->c(Lcom/tencent/open/TaskGuide;I)V

    .line 982
    iget-object v0, p0, Lcom/tencent/open/TaskGuide$d;->c:Lcom/tencent/open/TaskGuide;

    const/16 v1, 0x7d0

    invoke-static {v0, v1}, Lcom/tencent/open/TaskGuide;->e(Lcom/tencent/open/TaskGuide;I)V

    .line 983
    return-void
.end method
