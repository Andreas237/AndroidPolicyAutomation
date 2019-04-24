.class public Lo/axs;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private a:Ljava/lang/String;

.field private c:Ljava/lang/String;

.field private e:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<Lo/axq;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Ljava/lang/String;)V
    .locals 1

    .line 54
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 46
    const/4 v0, 0x0

    iput-object v0, p0, Lo/axs;->e:Ljava/util/ArrayList;

    .line 55
    invoke-direct {p0, p1}, Lo/axs;->c(Ljava/lang/String;)V

    .line 56
    return-void
.end method

.method private c(Ljava/lang/String;)V
    .locals 4

    .line 65
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 67
    return-void

    .line 72
    :cond_0
    :try_start_0
    new-instance v2, Lorg/json/JSONObject;

    invoke-direct {v2, p1}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    .line 75
    const-string v0, "title"

    invoke-virtual {v2, v0}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 77
    const-string v0, "title"

    invoke-virtual {v2, v0}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lo/axs;->a:Ljava/lang/String;

    .line 79
    :cond_1
    const-string v0, "category"

    invoke-virtual {v2, v0}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 81
    const-string v0, "category"

    invoke-virtual {v2, v0}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lo/axs;->c:Ljava/lang/String;

    .line 84
    :cond_2
    const-string v0, "message"

    invoke-virtual {v2, v0}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 86
    const-string v0, "message"

    invoke-virtual {v2, v0}, Lorg/json/JSONObject;->getJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    move-result-object v3

    .line 87
    invoke-static {v3}, Lo/axq;->c(Lorg/json/JSONArray;)Ljava/util/ArrayList;

    move-result-object v0

    iput-object v0, p0, Lo/axs;->e:Ljava/util/ArrayList;
    :try_end_0
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_1

    .line 97
    :cond_3
    goto :goto_0

    .line 90
    :catch_0
    move-exception v2

    .line 92
    const-string v0, "AssistantMessage"

    const-string v1, "parseJson error,RuntimeException"

    invoke-static {v0, v1}, Lo/bpf;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 97
    goto :goto_0

    .line 94
    :catch_1
    move-exception v2

    .line 96
    const-string v0, "AssistantMessage"

    const-string v1, "parseJson error,JSONException"

    invoke-static {v0, v1}, Lo/bpf;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 98
    :goto_0
    return-void
.end method


# virtual methods
.method public a()Ljava/lang/String;
    .locals 1

    .line 102
    iget-object v0, p0, Lo/axs;->a:Ljava/lang/String;

    .line 103
    return-object v0
.end method

.method public b()Ljava/lang/String;
    .locals 1

    .line 117
    iget-object v0, p0, Lo/axs;->c:Ljava/lang/String;

    .line 118
    return-object v0
.end method

.method public e()Ljava/util/ArrayList;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()Ljava/util/ArrayList<Lo/axq;>;"
        }
    .end annotation

    .line 108
    iget-object v0, p0, Lo/axs;->e:Ljava/util/ArrayList;

    return-object v0
.end method
