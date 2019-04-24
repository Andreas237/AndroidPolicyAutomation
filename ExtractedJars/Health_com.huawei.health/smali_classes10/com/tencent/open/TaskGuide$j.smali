.class Lcom/tencent/open/TaskGuide$j;
.super Lcom/tencent/open/TaskGuide$a;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/tencent/open/TaskGuide;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = "j"
.end annotation


# instance fields
.field final synthetic b:Lcom/tencent/open/TaskGuide;


# direct methods
.method private constructor <init>(Lcom/tencent/open/TaskGuide;)V
    .locals 1

    .line 814
    iput-object p1, p0, Lcom/tencent/open/TaskGuide$j;->b:Lcom/tencent/open/TaskGuide;

    const/4 v0, 0x0

    invoke-direct {p0, p1, v0}, Lcom/tencent/open/TaskGuide$a;-><init>(Lcom/tencent/open/TaskGuide;Lcom/tencent/open/TaskGuide$1;)V

    return-void
.end method

.method synthetic constructor <init>(Lcom/tencent/open/TaskGuide;Lcom/tencent/open/TaskGuide$1;)V
    .locals 0

    .line 814
    invoke-direct {p0, p1}, Lcom/tencent/open/TaskGuide$j;-><init>(Lcom/tencent/open/TaskGuide;)V

    return-void
.end method


# virtual methods
.method protected a(Ljava/lang/Exception;)V
    .locals 7

    .line 846
    if-eqz p1, :cond_0

    .line 847
    invoke-virtual {p1}, Ljava/lang/Exception;->printStackTrace()V

    .line 850
    :cond_0
    if-nez p1, :cond_1

    .line 851
    new-instance v5, Lorg/json/JSONObject;

    invoke-direct {v5}, Lorg/json/JSONObject;-><init>()V

    .line 853
    const-string v0, "result"

    const-string v1, "\u6682\u65e0\u4efb\u52a1"

    :try_start_0
    invoke-virtual {v5, v0, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    .line 857
    goto :goto_0

    .line 854
    :catch_0
    move-exception v6

    .line 856
    invoke-virtual {v6}, Lorg/json/JSONException;->printStackTrace()V

    .line 858
    :goto_0
    iget-object v0, p0, Lcom/tencent/open/TaskGuide$j;->b:Lcom/tencent/open/TaskGuide;

    iget-object v0, v0, Lcom/tencent/open/TaskGuide;->c:Lcom/tencent/tauth/IUiListener;

    invoke-interface {v0, v5}, Lcom/tencent/tauth/IUiListener;->onComplete(Ljava/lang/Object;)V

    .line 859
    goto :goto_1

    .line 860
    :cond_1
    iget-object v0, p0, Lcom/tencent/open/TaskGuide$j;->b:Lcom/tencent/open/TaskGuide;

    iget-object v0, v0, Lcom/tencent/open/TaskGuide;->c:Lcom/tencent/tauth/IUiListener;

    new-instance v1, Lcom/tencent/tauth/UiError;

    const-string v2, "error "

    const-string v3, "\u83b7\u53d6\u4efb\u52a1\u5931\u8d25"

    const/16 v4, 0x64

    invoke-direct {v1, v4, v2, v3}, Lcom/tencent/tauth/UiError;-><init>(ILjava/lang/String;Ljava/lang/String;)V

    invoke-interface {v0, v1}, Lcom/tencent/tauth/IUiListener;->onError(Lcom/tencent/tauth/UiError;)V

    .line 862
    :goto_1
    iget-object v0, p0, Lcom/tencent/open/TaskGuide$j;->b:Lcom/tencent/open/TaskGuide;

    invoke-static {v0}, Lcom/tencent/open/TaskGuide;->s(Lcom/tencent/open/TaskGuide;)Landroid/os/Handler;

    move-result-object v0

    new-instance v1, Lcom/tencent/open/TaskGuide$j$1;

    invoke-direct {v1, p0}, Lcom/tencent/open/TaskGuide$j$1;-><init>(Lcom/tencent/open/TaskGuide$j;)V

    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 873
    return-void
.end method

.method public onComplete(Lorg/json/JSONObject;)V
    .locals 5

    .line 820
    :try_start_0
    iget-object v0, p0, Lcom/tencent/open/TaskGuide$j;->b:Lcom/tencent/open/TaskGuide;

    invoke-static {p1}, Lcom/tencent/open/TaskGuide$h;->a(Lorg/json/JSONObject;)Lcom/tencent/open/TaskGuide$h;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/tencent/open/TaskGuide;->a(Lcom/tencent/open/TaskGuide;Lcom/tencent/open/TaskGuide$h;)Lcom/tencent/open/TaskGuide$h;
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    .line 824
    goto :goto_0

    .line 821
    :catch_0
    move-exception v3

    .line 823
    invoke-virtual {v3}, Lorg/json/JSONException;->printStackTrace()V

    .line 827
    :goto_0
    iget-object v0, p0, Lcom/tencent/open/TaskGuide$j;->b:Lcom/tencent/open/TaskGuide;

    invoke-static {v0}, Lcom/tencent/open/TaskGuide;->t(Lcom/tencent/open/TaskGuide;)Lcom/tencent/open/TaskGuide$h;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/tencent/open/TaskGuide$j;->b:Lcom/tencent/open/TaskGuide;

    invoke-static {v0}, Lcom/tencent/open/TaskGuide;->t(Lcom/tencent/open/TaskGuide;)Lcom/tencent/open/TaskGuide$h;

    move-result-object v0

    invoke-virtual {v0}, Lcom/tencent/open/TaskGuide$h;->a()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 828
    iget-object v0, p0, Lcom/tencent/open/TaskGuide$j;->b:Lcom/tencent/open/TaskGuide;

    invoke-virtual {v0}, Lcom/tencent/open/TaskGuide;->showWindow()V

    .line 829
    iget-object v0, p0, Lcom/tencent/open/TaskGuide$j;->b:Lcom/tencent/open/TaskGuide;

    sget-object v1, Lcom/tencent/open/TaskGuide$k;->d:Lcom/tencent/open/TaskGuide$k;

    const/4 v2, 0x2

    invoke-static {v0, v2, v1}, Lcom/tencent/open/TaskGuide;->a(Lcom/tencent/open/TaskGuide;ILcom/tencent/open/TaskGuide$k;)V

    .line 830
    new-instance v3, Lorg/json/JSONObject;

    invoke-direct {v3}, Lorg/json/JSONObject;-><init>()V

    .line 832
    const-string v0, "result"

    const-string v1, "\u83b7\u53d6\u6210\u529f"

    :try_start_1
    invoke-virtual {v3, v0, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    :try_end_1
    .catch Lorg/json/JSONException; {:try_start_1 .. :try_end_1} :catch_1

    .line 836
    goto :goto_1

    .line 833
    :catch_1
    move-exception v4

    .line 835
    invoke-virtual {v4}, Lorg/json/JSONException;->printStackTrace()V

    .line 837
    :goto_1
    iget-object v0, p0, Lcom/tencent/open/TaskGuide$j;->b:Lcom/tencent/open/TaskGuide;

    iget-object v0, v0, Lcom/tencent/open/TaskGuide;->c:Lcom/tencent/tauth/IUiListener;

    invoke-interface {v0, v3}, Lcom/tencent/tauth/IUiListener;->onComplete(Ljava/lang/Object;)V

    .line 838
    goto :goto_2

    .line 839
    :cond_0
    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lcom/tencent/open/TaskGuide$j;->a(Ljava/lang/Exception;)V

    .line 841
    :goto_2
    return-void
.end method
