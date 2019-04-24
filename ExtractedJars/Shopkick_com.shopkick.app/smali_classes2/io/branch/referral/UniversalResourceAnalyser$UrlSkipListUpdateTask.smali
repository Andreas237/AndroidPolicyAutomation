.class Lio/branch/referral/UniversalResourceAnalyser$UrlSkipListUpdateTask;
.super Lio/branch/referral/BranchAsyncTask;
.source "UniversalResourceAnalyser.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lio/branch/referral/UniversalResourceAnalyser;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0xa
    name = "UrlSkipListUpdateTask"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lio/branch/referral/BranchAsyncTask<",
        "Ljava/lang/Void;",
        "Ljava/lang/Void;",
        "Lorg/json/JSONObject;",
        ">;"
    }
.end annotation


# instance fields
.field private final TIME_OUT:I

.field private final prefHelper:Lio/branch/referral/PrefHelper;


# direct methods
.method private constructor <init>(Landroid/content/Context;)V
    .locals 1

    .line 152
    invoke-direct {p0}, Lio/branch/referral/BranchAsyncTask;-><init>()V

    const/16 v0, 0x5dc

    .line 150
    iput v0, p0, Lio/branch/referral/UniversalResourceAnalyser$UrlSkipListUpdateTask;->TIME_OUT:I

    .line 153
    invoke-static {p1}, Lio/branch/referral/PrefHelper;->getInstance(Landroid/content/Context;)Lio/branch/referral/PrefHelper;

    move-result-object p1

    iput-object p1, p0, Lio/branch/referral/UniversalResourceAnalyser$UrlSkipListUpdateTask;->prefHelper:Lio/branch/referral/PrefHelper;

    return-void
.end method

.method synthetic constructor <init>(Landroid/content/Context;Lio/branch/referral/UniversalResourceAnalyser$1;)V
    .locals 0

    .line 148
    invoke-direct {p0, p1}, Lio/branch/referral/UniversalResourceAnalyser$UrlSkipListUpdateTask;-><init>(Landroid/content/Context;)V

    return-void
.end method


# virtual methods
.method protected bridge synthetic doInBackground([Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 148
    check-cast p1, [Ljava/lang/Void;

    invoke-virtual {p0, p1}, Lio/branch/referral/UniversalResourceAnalyser$UrlSkipListUpdateTask;->doInBackground([Ljava/lang/Void;)Lorg/json/JSONObject;

    move-result-object p1

    return-object p1
.end method

.method protected varargs doInBackground([Ljava/lang/Void;)Lorg/json/JSONObject;
    .locals 6

    .line 159
    new-instance p1, Lorg/json/JSONObject;

    invoke-direct {p1}, Lorg/json/JSONObject;-><init>()V

    const/4 v0, 0x0

    .line 162
    :try_start_0
    new-instance v1, Ljava/net/URL;

    const-string v2, "https://cdn.branch.io/sdk/uriskiplist_v#.json"

    const-string v3, "#"

    invoke-static {}, Lio/branch/referral/UniversalResourceAnalyser;->access$100()Lorg/json/JSONObject;

    move-result-object v4

    const-string/jumbo v5, "version"

    invoke-virtual {v4, v5}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;)I

    move-result v4

    add-int/lit8 v4, v4, 0x1

    invoke-static {v4}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v2, v3, v4}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, v2}, Ljava/net/URL;-><init>(Ljava/lang/String;)V

    .line 163
    invoke-virtual {v1}, Ljava/net/URL;->openConnection()Ljava/net/URLConnection;

    move-result-object v1

    check-cast v1, Ljavax/net/ssl/HttpsURLConnection;
    :try_end_0
    .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    const/16 v0, 0x5dc

    .line 164
    :try_start_1
    invoke-virtual {v1, v0}, Ljavax/net/ssl/HttpsURLConnection;->setConnectTimeout(I)V

    .line 165
    invoke-virtual {v1, v0}, Ljavax/net/ssl/HttpsURLConnection;->setReadTimeout(I)V

    .line 166
    invoke-virtual {v1}, Ljavax/net/ssl/HttpsURLConnection;->getResponseCode()I

    move-result v0

    const/16 v2, 0xc8

    if-ne v0, v2, :cond_0

    .line 168
    invoke-virtual {v1}, Ljavax/net/ssl/HttpsURLConnection;->getInputStream()Ljava/io/InputStream;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 169
    new-instance v0, Ljava/io/BufferedReader;

    new-instance v2, Ljava/io/InputStreamReader;

    invoke-virtual {v1}, Ljavax/net/ssl/HttpsURLConnection;->getInputStream()Ljava/io/InputStream;

    move-result-object v3

    invoke-direct {v2, v3}, Ljava/io/InputStreamReader;-><init>(Ljava/io/InputStream;)V

    invoke-direct {v0, v2}, Ljava/io/BufferedReader;-><init>(Ljava/io/Reader;)V

    .line 170
    new-instance v2, Lorg/json/JSONObject;

    invoke-virtual {v0}, Ljava/io/BufferedReader;->readLine()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v2, v0}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V
    :try_end_1
    .catch Ljava/lang/Throwable; {:try_start_1 .. :try_end_1} :catch_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    move-object p1, v2

    :cond_0
    if-eqz v1, :cond_2

    .line 176
    :goto_0
    invoke-virtual {v1}, Ljavax/net/ssl/HttpsURLConnection;->disconnect()V

    goto :goto_2

    :catchall_0
    move-exception p1

    goto :goto_1

    :catchall_1
    move-exception p1

    move-object v1, v0

    :goto_1
    if-eqz v1, :cond_1

    invoke-virtual {v1}, Ljavax/net/ssl/HttpsURLConnection;->disconnect()V

    :cond_1
    throw p1

    :catch_0
    move-object v1, v0

    :catch_1
    if-eqz v1, :cond_2

    goto :goto_0

    :cond_2
    :goto_2
    return-object p1
.end method

.method protected bridge synthetic onPostExecute(Ljava/lang/Object;)V
    .locals 0

    .line 148
    check-cast p1, Lorg/json/JSONObject;

    invoke-virtual {p0, p1}, Lio/branch/referral/UniversalResourceAnalyser$UrlSkipListUpdateTask;->onPostExecute(Lorg/json/JSONObject;)V

    return-void
.end method

.method protected onPostExecute(Lorg/json/JSONObject;)V
    .locals 3

    .line 184
    invoke-super {p0, p1}, Lio/branch/referral/BranchAsyncTask;->onPostExecute(Ljava/lang/Object;)V

    const-string/jumbo v0, "version"

    .line 185
    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;)I

    move-result v0

    invoke-static {}, Lio/branch/referral/UniversalResourceAnalyser;->access$100()Lorg/json/JSONObject;

    move-result-object v1

    const-string/jumbo v2, "version"

    invoke-virtual {v1, v2}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;)I

    move-result v1

    if-le v0, v1, :cond_0

    .line 186
    invoke-static {p1}, Lio/branch/referral/UniversalResourceAnalyser;->access$102(Lorg/json/JSONObject;)Lorg/json/JSONObject;

    .line 187
    iget-object p1, p0, Lio/branch/referral/UniversalResourceAnalyser$UrlSkipListUpdateTask;->prefHelper:Lio/branch/referral/PrefHelper;

    const-string/jumbo v0, "skip_url_format_key"

    invoke-static {}, Lio/branch/referral/UniversalResourceAnalyser;->access$100()Lorg/json/JSONObject;

    move-result-object v1

    invoke-virtual {v1}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1, v0, v1}, Lio/branch/referral/PrefHelper;->setString(Ljava/lang/String;Ljava/lang/String;)V

    :cond_0
    return-void
.end method
