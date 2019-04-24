.class public Lcom/huawei/logupload/o;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Ljava/lang/String; = "res"

.field public static final b:Ljava/lang/String; = "policy"

.field public static final c:Ljava/lang/String; = "accessToken"

.field public static final d:Ljava/lang/String; = "secret"

.field public static final e:Ljava/lang/String; = "uploadPath"

.field public static final f:Ljava/lang/String; = "timeStamp"

.field public static final g:Ljava/lang/String; = "callbackAddress"

.field public static final h:Ljava/lang/String; = "uploadAddress"

.field public static final i:Ljava/lang/String; = "returnCode"

.field private static final j:Ljava/lang/String; = "LogUpload Service"


# instance fields
.field private k:I

.field private l:Ljava/lang/String;

.field private m:Ljava/lang/String;

.field private n:Ljava/lang/String;

.field private o:Ljava/lang/String;

.field private p:Ljava/lang/String;

.field private q:Ljava/lang/String;

.field private r:Ljava/lang/String;

.field private s:I


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

    .line 231
    iget v0, p0, Lcom/huawei/logupload/o;->k:I

    return v0
.end method

.method public a(Ljava/lang/String;)I
    .locals 5

    .line 90
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 92
    const/4 v0, 0x4

    invoke-static {v0}, Lcom/huawei/logupload/c/g;->a(I)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 94
    const-string v0, "LogUpload Service"

    const-string v1, "Input param invalid."

    invoke-static {v0, v1}, Lcom/huawei/logupload/c/g;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 96
    :cond_0
    const/16 v0, 0x3e9

    return v0

    .line 99
    :cond_1
    const/4 v3, 0x0

    .line 102
    :try_start_0
    new-instance v3, Lorg/json/JSONObject;

    invoke-direct {v3, p1}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    .line 103
    goto :goto_0

    .line 104
    :catch_0
    move-exception v4

    .line 106
    const/4 v0, 0x4

    invoke-static {v0}, Lcom/huawei/logupload/c/g;->a(I)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 108
    const-string v0, "LogUpload Service"

    invoke-virtual {v4}, Lorg/json/JSONException;->getMessage()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/huawei/logupload/c/g;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 110
    :cond_2
    const/16 v0, 0x3f0

    return v0

    .line 116
    :goto_0
    const-string v0, "res"

    :try_start_1
    invoke-virtual {v3, v0}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v0

    iput v0, p0, Lcom/huawei/logupload/o;->k:I

    .line 117
    iget v0, p0, Lcom/huawei/logupload/o;->k:I

    const/4 v1, 0x1

    if-eq v0, v1, :cond_3

    iget v0, p0, Lcom/huawei/logupload/o;->k:I

    const/4 v1, 0x2

    if-ne v0, v1, :cond_4

    .line 118
    :cond_3
    iget v0, p0, Lcom/huawei/logupload/o;->k:I

    invoke-virtual {p0, v0}, Lcom/huawei/logupload/o;->a(I)V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    .line 119
    const/16 v0, 0x3e9

    return v0

    .line 121
    :cond_4
    const-string v0, "accessToken"

    :try_start_2
    invoke-virtual {v3, v0}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/logupload/o;->m:Ljava/lang/String;

    .line 122
    const-string v0, "timeStamp"

    invoke-virtual {v3, v0}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/logupload/o;->p:Ljava/lang/String;

    .line 123
    const-string v0, "callbackAddress"

    invoke-virtual {v3, v0}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/logupload/o;->q:Ljava/lang/String;
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_1

    .line 124
    goto :goto_1

    .line 125
    :catch_1
    move-exception v4

    .line 127
    const/4 v0, 0x4

    invoke-static {v0}, Lcom/huawei/logupload/c/g;->a(I)Z

    move-result v0

    if-eqz v0, :cond_5

    .line 129
    const-string v0, "LogUpload Service"

    invoke-virtual {v4}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/huawei/logupload/c/g;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 131
    :cond_5
    const/16 v0, 0x3ef

    return v0

    .line 134
    :goto_1
    const-string v0, "LogUpload Service"

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "res"

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget v2, p0, Lcom/huawei/logupload/o;->k:I

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/huawei/logupload/c/g;->b(Ljava/lang/String;Ljava/lang/String;)I

    .line 135
    iget v0, p0, Lcom/huawei/logupload/o;->k:I

    invoke-virtual {p0, v0}, Lcom/huawei/logupload/o;->a(I)V

    .line 137
    iget-object v0, p0, Lcom/huawei/logupload/o;->m:Ljava/lang/String;

    invoke-virtual {p0, v0}, Lcom/huawei/logupload/o;->d(Ljava/lang/String;)V

    .line 138
    const-string v0, "LogUpload Service"

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "timeStamp"

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v2, p0, Lcom/huawei/logupload/o;->p:Ljava/lang/String;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/huawei/logupload/c/g;->b(Ljava/lang/String;Ljava/lang/String;)I

    .line 139
    iget-object v0, p0, Lcom/huawei/logupload/o;->p:Ljava/lang/String;

    if-eqz v0, :cond_6

    .line 140
    iget-object v0, p0, Lcom/huawei/logupload/o;->p:Ljava/lang/String;

    invoke-virtual {p0, v0}, Lcom/huawei/logupload/o;->g(Ljava/lang/String;)V

    .line 143
    :cond_6
    iget-object v0, p0, Lcom/huawei/logupload/o;->q:Ljava/lang/String;

    if-eqz v0, :cond_7

    .line 144
    iget-object v0, p0, Lcom/huawei/logupload/o;->q:Ljava/lang/String;

    invoke-virtual {p0, v0}, Lcom/huawei/logupload/o;->h(Ljava/lang/String;)V

    .line 148
    :cond_7
    const-string v0, "policy"

    invoke-virtual {v3, v0}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/logupload/o;->l:Ljava/lang/String;

    .line 149
    const-string v0, "LogUpload Service"

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "policy"

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v2, p0, Lcom/huawei/logupload/o;->l:Ljava/lang/String;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/huawei/logupload/c/g;->b(Ljava/lang/String;Ljava/lang/String;)I

    .line 150
    iget-object v0, p0, Lcom/huawei/logupload/o;->l:Ljava/lang/String;

    invoke-virtual {p0, v0}, Lcom/huawei/logupload/o;->c(Ljava/lang/String;)V

    .line 153
    const-string v0, "secret"

    invoke-virtual {v3, v0}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/logupload/o;->n:Ljava/lang/String;

    .line 155
    iget-object v0, p0, Lcom/huawei/logupload/o;->n:Ljava/lang/String;

    invoke-virtual {p0, v0}, Lcom/huawei/logupload/o;->e(Ljava/lang/String;)V

    .line 158
    const-string v0, "uploadPath"

    invoke-virtual {v3, v0}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/logupload/o;->o:Ljava/lang/String;

    .line 161
    iget-object v0, p0, Lcom/huawei/logupload/o;->o:Ljava/lang/String;

    if-eqz v0, :cond_8

    iget-object v0, p0, Lcom/huawei/logupload/o;->o:Ljava/lang/String;

    const-string v1, ""

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_8

    .line 162
    iget-object v0, p0, Lcom/huawei/logupload/o;->o:Ljava/lang/String;

    invoke-virtual {p0, v0}, Lcom/huawei/logupload/o;->f(Ljava/lang/String;)V

    .line 166
    :cond_8
    const-string v0, "uploadAddress"

    invoke-virtual {v3, v0}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/logupload/o;->r:Ljava/lang/String;

    .line 169
    iget-object v0, p0, Lcom/huawei/logupload/o;->r:Ljava/lang/String;

    if-eqz v0, :cond_9

    iget-object v0, p0, Lcom/huawei/logupload/o;->r:Ljava/lang/String;

    const-string v1, ""

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_9

    .line 170
    iget-object v0, p0, Lcom/huawei/logupload/o;->r:Ljava/lang/String;

    invoke-virtual {p0, v0}, Lcom/huawei/logupload/o;->i(Ljava/lang/String;)V

    .line 173
    :cond_9
    const/4 v0, 0x0

    return v0
.end method

.method public a(I)V
    .locals 0

    .line 238
    iput p1, p0, Lcom/huawei/logupload/o;->k:I

    .line 239
    return-void
.end method

.method public b(Ljava/lang/String;)I
    .locals 5

    .line 185
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 187
    const/4 v0, 0x4

    invoke-static {v0}, Lcom/huawei/logupload/c/g;->a(I)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 189
    const-string v0, "LogUpload Service"

    const-string v1, "Input param invalid."

    invoke-static {v0, v1}, Lcom/huawei/logupload/c/g;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 191
    :cond_0
    const/16 v0, 0x3e9

    return v0

    .line 194
    :cond_1
    const/4 v3, 0x0

    .line 197
    :try_start_0
    new-instance v3, Lorg/json/JSONObject;

    invoke-direct {v3, p1}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    .line 198
    goto :goto_0

    .line 199
    :catch_0
    move-exception v4

    .line 201
    const/4 v0, 0x4

    invoke-static {v0}, Lcom/huawei/logupload/c/g;->a(I)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 203
    const-string v0, "LogUpload Service"

    invoke-virtual {v4}, Lorg/json/JSONException;->getMessage()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/huawei/logupload/c/g;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 205
    :cond_2
    const/16 v0, 0x3f0

    return v0

    .line 211
    :goto_0
    const-string v0, "returnCode"

    :try_start_1
    invoke-virtual {v3, v0}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v0

    iput v0, p0, Lcom/huawei/logupload/o;->s:I
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    .line 212
    goto :goto_1

    .line 213
    :catch_1
    move-exception v4

    .line 215
    const/4 v0, 0x4

    invoke-static {v0}, Lcom/huawei/logupload/c/g;->a(I)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 217
    const-string v0, "LogUpload Service"

    invoke-virtual {v4}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/huawei/logupload/c/g;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 219
    :cond_3
    const/16 v0, 0x3ef

    return v0

    .line 222
    :goto_1
    const-string v0, "LogUpload Service"

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "returnCode"

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget v2, p0, Lcom/huawei/logupload/o;->s:I

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/huawei/logupload/c/g;->b(Ljava/lang/String;Ljava/lang/String;)I

    .line 223
    iget v0, p0, Lcom/huawei/logupload/o;->s:I

    invoke-virtual {p0, v0}, Lcom/huawei/logupload/o;->b(I)V

    .line 224
    const/4 v0, 0x0

    return v0
.end method

.method public b()Ljava/lang/String;
    .locals 1

    .line 245
    iget-object v0, p0, Lcom/huawei/logupload/o;->l:Ljava/lang/String;

    return-object v0
.end method

.method public b(I)V
    .locals 0

    .line 350
    iput p1, p0, Lcom/huawei/logupload/o;->s:I

    .line 351
    return-void
.end method

.method public c()Ljava/lang/String;
    .locals 1

    .line 259
    iget-object v0, p0, Lcom/huawei/logupload/o;->m:Ljava/lang/String;

    return-object v0
.end method

.method public c(Ljava/lang/String;)V
    .locals 0

    .line 252
    iput-object p1, p0, Lcom/huawei/logupload/o;->l:Ljava/lang/String;

    .line 253
    return-void
.end method

.method public d()Ljava/lang/String;
    .locals 1

    .line 273
    iget-object v0, p0, Lcom/huawei/logupload/o;->n:Ljava/lang/String;

    return-object v0
.end method

.method public d(Ljava/lang/String;)V
    .locals 0

    .line 266
    iput-object p1, p0, Lcom/huawei/logupload/o;->m:Ljava/lang/String;

    .line 267
    return-void
.end method

.method public e()Ljava/lang/String;
    .locals 1

    .line 287
    iget-object v0, p0, Lcom/huawei/logupload/o;->o:Ljava/lang/String;

    return-object v0
.end method

.method public e(Ljava/lang/String;)V
    .locals 0

    .line 280
    iput-object p1, p0, Lcom/huawei/logupload/o;->n:Ljava/lang/String;

    .line 281
    return-void
.end method

.method public f()Ljava/lang/String;
    .locals 1

    .line 301
    iget-object v0, p0, Lcom/huawei/logupload/o;->p:Ljava/lang/String;

    return-object v0
.end method

.method public f(Ljava/lang/String;)V
    .locals 0

    .line 294
    iput-object p1, p0, Lcom/huawei/logupload/o;->o:Ljava/lang/String;

    .line 295
    return-void
.end method

.method public g()Ljava/lang/String;
    .locals 1

    .line 315
    iget-object v0, p0, Lcom/huawei/logupload/o;->q:Ljava/lang/String;

    return-object v0
.end method

.method public g(Ljava/lang/String;)V
    .locals 0

    .line 308
    iput-object p1, p0, Lcom/huawei/logupload/o;->p:Ljava/lang/String;

    .line 309
    return-void
.end method

.method public h()Ljava/lang/String;
    .locals 1

    .line 329
    iget-object v0, p0, Lcom/huawei/logupload/o;->r:Ljava/lang/String;

    return-object v0
.end method

.method public h(Ljava/lang/String;)V
    .locals 0

    .line 322
    iput-object p1, p0, Lcom/huawei/logupload/o;->q:Ljava/lang/String;

    .line 323
    return-void
.end method

.method public i()I
    .locals 1

    .line 343
    iget v0, p0, Lcom/huawei/logupload/o;->s:I

    return v0
.end method

.method public i(Ljava/lang/String;)V
    .locals 0

    .line 336
    iput-object p1, p0, Lcom/huawei/logupload/o;->r:Ljava/lang/String;

    .line 337
    return-void
.end method
