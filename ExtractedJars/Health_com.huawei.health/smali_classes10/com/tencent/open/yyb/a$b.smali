.class Lcom/tencent/open/yyb/a$b;
.super Landroid/os/AsyncTask;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/tencent/open/yyb/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "b"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Landroid/os/AsyncTask<Landroid/os/Bundle;Ljava/lang/Void;Ljava/lang/Void;>;"
    }
.end annotation


# direct methods
.method private constructor <init>()V
    .locals 0

    .line 156
    invoke-direct {p0}, Landroid/os/AsyncTask;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/tencent/open/yyb/a$1;)V
    .locals 0

    .line 156
    invoke-direct {p0}, Lcom/tencent/open/yyb/a$b;-><init>()V

    return-void
.end method


# virtual methods
.method protected varargs a([Landroid/os/Bundle;)Ljava/lang/Void;
    .locals 7

    .line 160
    if-nez p1, :cond_0

    .line 161
    const/4 v0, 0x0

    return-object v0

    .line 163
    :cond_0
    const-string v3, "http://analy.qq.com/cgi-bin/mapp_apptrace"

    .line 164
    array-length v0, p1

    const/4 v1, 0x2

    if-ne v0, v1, :cond_1

    .line 165
    const/4 v0, 0x1

    aget-object v0, p1, v0

    const-string v1, "uri"

    invoke-virtual {v0, v1}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    .line 166
    invoke-static {v4}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 167
    move-object v3, v4

    .line 172
    :cond_1
    const-string v0, "GET"

    const/4 v1, 0x0

    :try_start_0
    aget-object v1, p1, v1

    const/4 v2, 0x0

    invoke-static {v2, v3, v0, v1}, Lcom/tencent/open/utils/HttpUtils;->openUrl2(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Landroid/os/Bundle;)Lcom/tencent/open/utils/Util$Statistic;

    move-result-object v4

    .line 173
    iget-object v0, v4, Lcom/tencent/open/utils/Util$Statistic;->response:Ljava/lang/String;

    invoke-static {v0}, Lcom/tencent/open/utils/Util;->parseJson(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v5

    .line 174
    const-string v0, "ret"

    invoke-virtual {v5, v0}, Lorg/json/JSONObject;->getInt(Ljava/lang/String;)I

    move-result v6

    .line 175
    const-string v0, "openSDK_LOG"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "-->(ViaAsyncTask)doInBackground : ret = "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v6}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/tencent/open/a/f;->b(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 179
    goto :goto_0

    .line 176
    :catch_0
    move-exception v4

    .line 177
    const-string v0, "openSDK_LOG"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "-->(ViaAsyncTask)doInBackground : Exception = "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v4}, Ljava/lang/Exception;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/tencent/open/a/f;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 178
    invoke-virtual {v4}, Ljava/lang/Exception;->printStackTrace()V

    .line 180
    :goto_0
    const/4 v0, 0x0

    return-object v0
.end method

.method protected synthetic doInBackground([Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 156
    move-object v0, p1

    check-cast v0, [Landroid/os/Bundle;

    invoke-virtual {p0, v0}, Lcom/tencent/open/yyb/a$b;->a([Landroid/os/Bundle;)Ljava/lang/Void;

    move-result-object v0

    return-object v0
.end method
