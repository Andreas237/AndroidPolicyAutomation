.class public Lnet/hockeyapp/android/tasks/LoginTask;
.super Lnet/hockeyapp/android/tasks/ConnectionTask;
.source "LoginTask.java"


# annotations
.annotation build Lcom/newrelic/agent/android/instrumentation/Instrumented;
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lnet/hockeyapp/android/tasks/ConnectionTask<",
        "Ljava/lang/Void;",
        "Ljava/lang/Void;",
        "Ljava/lang/Boolean;",
        ">;"
    }
.end annotation


# instance fields
.field private mContext:Landroid/content/Context;

.field private mHandler:Landroid/os/Handler;

.field private final mMode:I

.field private final mParams:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private mProgressDialog:Landroid/app/ProgressDialog;

.field private mShowProgressDialog:Z

.field private final mUrlString:Ljava/lang/String;


# direct methods
.method public constructor <init>(Landroid/content/Context;Landroid/os/Handler;Ljava/lang/String;ILjava/util/Map;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "Landroid/os/Handler;",
            "Ljava/lang/String;",
            "I",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    .line 54
    invoke-direct {p0}, Lnet/hockeyapp/android/tasks/ConnectionTask;-><init>()V

    .line 55
    iput-object p1, p0, Lnet/hockeyapp/android/tasks/LoginTask;->mContext:Landroid/content/Context;

    .line 56
    iput-object p2, p0, Lnet/hockeyapp/android/tasks/LoginTask;->mHandler:Landroid/os/Handler;

    .line 57
    iput-object p3, p0, Lnet/hockeyapp/android/tasks/LoginTask;->mUrlString:Ljava/lang/String;

    .line 58
    iput p4, p0, Lnet/hockeyapp/android/tasks/LoginTask;->mMode:I

    .line 59
    iput-object p5, p0, Lnet/hockeyapp/android/tasks/LoginTask;->mParams:Ljava/util/Map;

    const/4 p2, 0x1

    .line 60
    iput-boolean p2, p0, Lnet/hockeyapp/android/tasks/LoginTask;->mShowProgressDialog:Z

    if-eqz p1, :cond_0

    .line 63
    invoke-static {p1}, Lnet/hockeyapp/android/Constants;->loadFromContext(Landroid/content/Context;)V

    :cond_0
    return-void
.end method

.method private handleResponse(Ljava/lang/String;)Z
    .locals 6

    .line 165
    iget-object v0, p0, Lnet/hockeyapp/android/tasks/LoginTask;->mContext:Landroid/content/Context;

    const-string v1, "net.hockeyapp.android.login"

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    move-result-object v0

    .line 168
    :try_start_0
    new-instance v1, Lorg/json/JSONObject;

    invoke-static {p1}, Lcom/newrelic/agent/android/instrumentation/JSONObjectInstrumentation;->init(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object p1

    const-string v1, "status"

    .line 169
    invoke-virtual {p1, v1}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    .line 171
    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v3

    if-eqz v3, :cond_0

    return v2

    .line 175
    :cond_0
    iget v3, p0, Lnet/hockeyapp/android/tasks/LoginTask;->mMode:I

    const/4 v4, 0x1

    if-ne v3, v4, :cond_1

    const-string v3, "identified"

    .line 176
    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_4

    const-string v1, "iuid"

    .line 177
    invoke-virtual {p1, v1}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    .line 178
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    if-nez v1, :cond_4

    .line 180
    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    const-string v1, "iuid"

    .line 181
    invoke-interface {v0, v1, p1}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    move-result-object p1

    .line 182
    invoke-interface {p1}, Landroid/content/SharedPreferences$Editor;->apply()V

    return v4

    .line 186
    :cond_1
    iget v3, p0, Lnet/hockeyapp/android/tasks/LoginTask;->mMode:I

    const/4 v5, 0x2

    if-ne v3, v5, :cond_2

    const-string v3, "authorized"

    .line 187
    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_4

    const-string v1, "auid"

    .line 188
    invoke-virtual {p1, v1}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    .line 190
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    if-nez v1, :cond_4

    .line 191
    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    const-string v1, "auid"

    .line 192
    invoke-interface {v0, v1, p1}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    move-result-object p1

    .line 193
    invoke-interface {p1}, Landroid/content/SharedPreferences$Editor;->apply()V

    return v4

    .line 197
    :cond_2
    iget p1, p0, Lnet/hockeyapp/android/tasks/LoginTask;->mMode:I

    const/4 v3, 0x3

    if-ne p1, v3, :cond_5

    const-string p1, "validated"

    .line 198
    invoke-virtual {v1, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_3

    return v4

    .line 201
    :cond_3
    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object p1

    const-string v0, "iuid"

    .line 202
    invoke-interface {p1, v0}, Landroid/content/SharedPreferences$Editor;->remove(Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    move-result-object p1

    const-string v0, "auid"

    .line 203
    invoke-interface {p1, v0}, Landroid/content/SharedPreferences$Editor;->remove(Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    move-result-object p1

    .line 204
    invoke-interface {p1}, Landroid/content/SharedPreferences$Editor;->apply()V

    :cond_4
    return v2

    .line 207
    :cond_5
    new-instance p1, Ljava/lang/IllegalArgumentException;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Login mode "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lnet/hockeyapp/android/tasks/LoginTask;->mMode:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, " not supported."

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    move-exception p1

    .line 212
    invoke-virtual {p1}, Lorg/json/JSONException;->printStackTrace()V

    return v2
.end method

.method private makeRequest(ILjava/util/Map;)Ljava/net/HttpURLConnection;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;)",
            "Ljava/net/HttpURLConnection;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    const/4 v0, 0x1

    if-ne p1, v0, :cond_0

    .line 141
    new-instance p1, Lnet/hockeyapp/android/utils/HttpURLConnectionBuilder;

    iget-object v0, p0, Lnet/hockeyapp/android/tasks/LoginTask;->mUrlString:Ljava/lang/String;

    invoke-direct {p1, v0}, Lnet/hockeyapp/android/utils/HttpURLConnectionBuilder;-><init>(Ljava/lang/String;)V

    const-string v0, "POST"

    .line 142
    invoke-virtual {p1, v0}, Lnet/hockeyapp/android/utils/HttpURLConnectionBuilder;->setRequestMethod(Ljava/lang/String;)Lnet/hockeyapp/android/utils/HttpURLConnectionBuilder;

    move-result-object p1

    .line 143
    invoke-virtual {p1, p2}, Lnet/hockeyapp/android/utils/HttpURLConnectionBuilder;->writeFormFields(Ljava/util/Map;)Lnet/hockeyapp/android/utils/HttpURLConnectionBuilder;

    move-result-object p1

    .line 144
    invoke-virtual {p1}, Lnet/hockeyapp/android/utils/HttpURLConnectionBuilder;->build()Ljava/net/HttpURLConnection;

    move-result-object p1

    return-object p1

    :cond_0
    const/4 v0, 0x2

    if-ne p1, v0, :cond_1

    .line 147
    new-instance p1, Lnet/hockeyapp/android/utils/HttpURLConnectionBuilder;

    iget-object v0, p0, Lnet/hockeyapp/android/tasks/LoginTask;->mUrlString:Ljava/lang/String;

    invoke-direct {p1, v0}, Lnet/hockeyapp/android/utils/HttpURLConnectionBuilder;-><init>(Ljava/lang/String;)V

    const-string v0, "POST"

    .line 148
    invoke-virtual {p1, v0}, Lnet/hockeyapp/android/utils/HttpURLConnectionBuilder;->setRequestMethod(Ljava/lang/String;)Lnet/hockeyapp/android/utils/HttpURLConnectionBuilder;

    move-result-object p1

    const-string v0, "email"

    .line 149
    invoke-interface {p2, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    const-string v1, "password"

    invoke-interface {p2, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/lang/String;

    invoke-virtual {p1, v0, p2}, Lnet/hockeyapp/android/utils/HttpURLConnectionBuilder;->setBasicAuthorization(Ljava/lang/String;Ljava/lang/String;)Lnet/hockeyapp/android/utils/HttpURLConnectionBuilder;

    move-result-object p1

    .line 150
    invoke-virtual {p1}, Lnet/hockeyapp/android/utils/HttpURLConnectionBuilder;->build()Ljava/net/HttpURLConnection;

    move-result-object p1

    return-object p1

    :cond_1
    const/4 v0, 0x3

    if-ne p1, v0, :cond_2

    const-string p1, "type"

    .line 153
    invoke-interface {p2, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/String;

    const-string v0, "id"

    .line 154
    invoke-interface {p2, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/lang/String;

    .line 155
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v1, p0, Lnet/hockeyapp/android/tasks/LoginTask;->mUrlString:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "?"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, "="

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    .line 157
    new-instance p2, Lnet/hockeyapp/android/utils/HttpURLConnectionBuilder;

    invoke-direct {p2, p1}, Lnet/hockeyapp/android/utils/HttpURLConnectionBuilder;-><init>(Ljava/lang/String;)V

    .line 158
    invoke-virtual {p2}, Lnet/hockeyapp/android/utils/HttpURLConnectionBuilder;->build()Ljava/net/HttpURLConnection;

    move-result-object p1

    return-object p1

    .line 160
    :cond_2
    new-instance p2, Ljava/lang/IllegalArgumentException;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Login mode "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p1, " not supported."

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p2
.end method


# virtual methods
.method public attach(Landroid/content/Context;Landroid/os/Handler;)V
    .locals 0

    .line 72
    iput-object p1, p0, Lnet/hockeyapp/android/tasks/LoginTask;->mContext:Landroid/content/Context;

    .line 73
    iput-object p2, p0, Lnet/hockeyapp/android/tasks/LoginTask;->mHandler:Landroid/os/Handler;

    return-void
.end method

.method public detach()V
    .locals 1

    const/4 v0, 0x0

    .line 77
    iput-object v0, p0, Lnet/hockeyapp/android/tasks/LoginTask;->mContext:Landroid/content/Context;

    .line 78
    iput-object v0, p0, Lnet/hockeyapp/android/tasks/LoginTask;->mHandler:Landroid/os/Handler;

    .line 79
    iput-object v0, p0, Lnet/hockeyapp/android/tasks/LoginTask;->mProgressDialog:Landroid/app/ProgressDialog;

    return-void
.end method

.method protected varargs doInBackground([Ljava/lang/Void;)Ljava/lang/Boolean;
    .locals 2

    const/4 p1, 0x0

    .line 94
    :try_start_0
    iget v0, p0, Lnet/hockeyapp/android/tasks/LoginTask;->mMode:I

    iget-object v1, p0, Lnet/hockeyapp/android/tasks/LoginTask;->mParams:Ljava/util/Map;

    invoke-direct {p0, v0, v1}, Lnet/hockeyapp/android/tasks/LoginTask;->makeRequest(ILjava/util/Map;)Ljava/net/HttpURLConnection;

    move-result-object p1

    .line 95
    invoke-virtual {p1}, Ljava/net/HttpURLConnection;->connect()V

    .line 97
    invoke-virtual {p1}, Ljava/net/HttpURLConnection;->getResponseCode()I

    move-result v0

    const/16 v1, 0xc8

    if-ne v0, v1, :cond_1

    .line 98
    invoke-static {p1}, Lnet/hockeyapp/android/tasks/LoginTask;->getStringFromConnection(Ljava/net/HttpURLConnection;)Ljava/lang/String;

    move-result-object v0

    .line 100
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    if-nez v1, :cond_1

    .line 101
    invoke-direct {p0, v0}, Lnet/hockeyapp/android/tasks/LoginTask;->handleResponse(Ljava/lang/String;)Z

    move-result v0

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0
    :try_end_0
    .catch Ljava/io/UnsupportedEncodingException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz p1, :cond_0

    .line 110
    invoke-virtual {p1}, Ljava/net/HttpURLConnection;->disconnect()V

    :cond_0
    return-object v0

    :cond_1
    if-eqz p1, :cond_2

    goto :goto_0

    :catchall_0
    move-exception v0

    goto :goto_1

    :catch_0
    move-exception v0

    .line 107
    :try_start_1
    invoke-virtual {v0}, Ljava/io/IOException;->printStackTrace()V

    if-eqz p1, :cond_2

    goto :goto_0

    :catch_1
    move-exception v0

    .line 105
    invoke-virtual {v0}, Ljava/io/UnsupportedEncodingException;->printStackTrace()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    if-eqz p1, :cond_2

    .line 110
    :goto_0
    invoke-virtual {p1}, Ljava/net/HttpURLConnection;->disconnect()V

    :cond_2
    const/4 p1, 0x0

    .line 114
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    return-object p1

    :goto_1
    if-eqz p1, :cond_3

    .line 110
    invoke-virtual {p1}, Ljava/net/HttpURLConnection;->disconnect()V

    :cond_3
    throw v0
.end method

.method protected bridge synthetic doInBackground([Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 28
    check-cast p1, [Ljava/lang/Void;

    invoke-virtual {p0, p1}, Lnet/hockeyapp/android/tasks/LoginTask;->doInBackground([Ljava/lang/Void;)Ljava/lang/Boolean;

    move-result-object p1

    return-object p1
.end method

.method protected onPostExecute(Ljava/lang/Boolean;)V
    .locals 3

    .line 119
    iget-object v0, p0, Lnet/hockeyapp/android/tasks/LoginTask;->mProgressDialog:Landroid/app/ProgressDialog;

    if-eqz v0, :cond_0

    .line 121
    :try_start_0
    invoke-virtual {v0}, Landroid/app/ProgressDialog;->dismiss()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v0

    .line 123
    invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V

    .line 128
    :cond_0
    :goto_0
    iget-object v0, p0, Lnet/hockeyapp/android/tasks/LoginTask;->mHandler:Landroid/os/Handler;

    if-eqz v0, :cond_1

    .line 129
    new-instance v0, Landroid/os/Message;

    invoke-direct {v0}, Landroid/os/Message;-><init>()V

    .line 130
    new-instance v1, Landroid/os/Bundle;

    invoke-direct {v1}, Landroid/os/Bundle;-><init>()V

    const-string v2, "success"

    .line 131
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    invoke-virtual {v1, v2, p1}, Landroid/os/Bundle;->putBoolean(Ljava/lang/String;Z)V

    .line 133
    invoke-virtual {v0, v1}, Landroid/os/Message;->setData(Landroid/os/Bundle;)V

    .line 134
    iget-object p1, p0, Lnet/hockeyapp/android/tasks/LoginTask;->mHandler:Landroid/os/Handler;

    invoke-virtual {p1, v0}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    :cond_1
    return-void
.end method

.method protected bridge synthetic onPostExecute(Ljava/lang/Object;)V
    .locals 0

    .line 28
    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p0, p1}, Lnet/hockeyapp/android/tasks/LoginTask;->onPostExecute(Ljava/lang/Boolean;)V

    return-void
.end method

.method protected onPreExecute()V
    .locals 5

    .line 84
    iget-object v0, p0, Lnet/hockeyapp/android/tasks/LoginTask;->mProgressDialog:Landroid/app/ProgressDialog;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Landroid/app/ProgressDialog;->isShowing()Z

    move-result v0

    if-nez v0, :cond_1

    :cond_0
    iget-boolean v0, p0, Lnet/hockeyapp/android/tasks/LoginTask;->mShowProgressDialog:Z

    if-eqz v0, :cond_1

    .line 85
    iget-object v0, p0, Lnet/hockeyapp/android/tasks/LoginTask;->mContext:Landroid/content/Context;

    const-string v1, ""

    const-string v2, "Please wait..."

    const/4 v3, 0x1

    const/4 v4, 0x0

    invoke-static {v0, v1, v2, v3, v4}, Landroid/app/ProgressDialog;->show(Landroid/content/Context;Ljava/lang/CharSequence;Ljava/lang/CharSequence;ZZ)Landroid/app/ProgressDialog;

    move-result-object v0

    iput-object v0, p0, Lnet/hockeyapp/android/tasks/LoginTask;->mProgressDialog:Landroid/app/ProgressDialog;

    :cond_1
    return-void
.end method
