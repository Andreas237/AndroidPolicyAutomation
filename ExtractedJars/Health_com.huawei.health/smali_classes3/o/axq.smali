.class public Lo/axq;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private a:Ljava/lang/String;

.field private b:Ljava/lang/String;

.field private c:Ljava/lang/String;

.field private d:Ljava/lang/String;

.field private e:Ljava/lang/String;

.field private k:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 23
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static c(Lorg/json/JSONArray;)Ljava/util/ArrayList;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Lorg/json/JSONArray;)Ljava/util/ArrayList<Lo/axq;>;"
        }
    .end annotation

    .line 121
    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 122
    if-eqz p0, :cond_2

    .line 127
    const/4 v3, 0x0

    .line 128
    const/4 v4, 0x0

    .line 129
    const/4 v5, 0x0

    :goto_0
    :try_start_0
    invoke-virtual {p0}, Lorg/json/JSONArray;->length()I

    move-result v0

    if-ge v5, v0, :cond_1

    .line 131
    invoke-virtual {p0, v5}, Lorg/json/JSONArray;->getJSONObject(I)Lorg/json/JSONObject;

    move-result-object v4

    .line 132
    if-eqz v4, :cond_0

    .line 134
    new-instance v3, Lo/axq;

    invoke-direct {v3}, Lo/axq;-><init>()V

    .line 135
    const-string v0, "type"

    invoke-virtual {v4, v0}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, v3, Lo/axq;->b:Ljava/lang/String;

    .line 136
    const-string v0, "content"

    invoke-virtual {v4, v0}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, v3, Lo/axq;->c:Ljava/lang/String;

    .line 137
    const-string v0, "url"

    invoke-virtual {v4, v0}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, v3, Lo/axq;->a:Ljava/lang/String;

    .line 138
    const-string v0, "image"

    invoke-virtual {v4, v0}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, v3, Lo/axq;->e:Ljava/lang/String;

    .line 139
    const-string v0, "abstract"

    invoke-virtual {v4, v0}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, v3, Lo/axq;->d:Ljava/lang/String;

    .line 140
    const-string v0, "button"

    invoke-virtual {v4, v0}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, v3, Lo/axq;->k:Ljava/lang/String;

    .line 141
    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_1

    .line 129
    :cond_0
    add-int/lit8 v5, v5, 0x1

    goto :goto_0

    .line 152
    :cond_1
    goto :goto_1

    .line 145
    :catch_0
    move-exception v3

    .line 147
    const-string v0, "AssistantMsg"

    const-string v1, "parseMessage error,RuntimeException"

    invoke-static {v0, v1}, Lo/bpf;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 152
    goto :goto_1

    .line 149
    :catch_1
    move-exception v3

    .line 151
    const-string v0, "AssistantMsg"

    const-string v1, "parseMessage error,JSONException"

    invoke-static {v0, v1}, Lo/bpf;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 154
    :cond_2
    :goto_1
    return-object v2
.end method


# virtual methods
.method public a()Ljava/lang/String;
    .locals 1

    .line 103
    iget-object v0, p0, Lo/axq;->d:Ljava/lang/String;

    .line 104
    return-object v0
.end method

.method public b()Ljava/lang/String;
    .locals 1

    .line 85
    iget-object v0, p0, Lo/axq;->e:Ljava/lang/String;

    .line 86
    return-object v0
.end method

.method public c()Ljava/lang/String;
    .locals 1

    .line 91
    iget-object v0, p0, Lo/axq;->c:Ljava/lang/String;

    .line 92
    return-object v0
.end method

.method public d()Ljava/lang/String;
    .locals 1

    .line 97
    iget-object v0, p0, Lo/axq;->a:Ljava/lang/String;

    .line 98
    return-object v0
.end method

.method public e()Ljava/lang/String;
    .locals 1

    .line 79
    iget-object v0, p0, Lo/axq;->b:Ljava/lang/String;

    .line 80
    return-object v0
.end method

.method public i()Ljava/lang/String;
    .locals 1

    .line 109
    iget-object v0, p0, Lo/axq;->k:Ljava/lang/String;

    .line 110
    return-object v0
.end method
