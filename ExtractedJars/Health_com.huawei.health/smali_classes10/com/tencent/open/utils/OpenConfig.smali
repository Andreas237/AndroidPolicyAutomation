.class public Lcom/tencent/open/utils/OpenConfig;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static a:Ljava/util/HashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/HashMap<Ljava/lang/String;Lcom/tencent/open/utils/OpenConfig;>;"
        }
    .end annotation
.end field

.field private static b:Ljava/lang/String;


# instance fields
.field private c:Landroid/content/Context;

.field private d:Ljava/lang/String;

.field private e:Lorg/json/JSONObject;

.field private f:J

.field private g:I

.field private h:Z


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 32
    const/4 v0, 0x0

    sput-object v0, Lcom/tencent/open/utils/OpenConfig;->a:Ljava/util/HashMap;

    .line 34
    const/4 v0, 0x0

    sput-object v0, Lcom/tencent/open/utils/OpenConfig;->b:Ljava/lang/String;

    return-void
.end method

.method private constructor <init>(Landroid/content/Context;Ljava/lang/String;)V
    .locals 2

    .line 73
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 36
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/tencent/open/utils/OpenConfig;->c:Landroid/content/Context;

    .line 38
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/tencent/open/utils/OpenConfig;->d:Ljava/lang/String;

    .line 40
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/tencent/open/utils/OpenConfig;->e:Lorg/json/JSONObject;

    .line 42
    const-wide/16 v0, 0x0

    iput-wide v0, p0, Lcom/tencent/open/utils/OpenConfig;->f:J

    .line 44
    const/4 v0, 0x0

    iput v0, p0, Lcom/tencent/open/utils/OpenConfig;->g:I

    .line 46
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/tencent/open/utils/OpenConfig;->h:Z

    .line 74
    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    iput-object v0, p0, Lcom/tencent/open/utils/OpenConfig;->c:Landroid/content/Context;

    .line 75
    iput-object p2, p0, Lcom/tencent/open/utils/OpenConfig;->d:Ljava/lang/String;

    .line 76
    invoke-direct {p0}, Lcom/tencent/open/utils/OpenConfig;->a()V

    .line 77
    invoke-direct {p0}, Lcom/tencent/open/utils/OpenConfig;->b()V

    .line 79
    return-void
.end method

.method static synthetic a(Lcom/tencent/open/utils/OpenConfig;I)I
    .locals 0

    .line 25
    iput p1, p0, Lcom/tencent/open/utils/OpenConfig;->g:I

    return p1
.end method

.method static synthetic a(Lcom/tencent/open/utils/OpenConfig;)Landroid/content/Context;
    .locals 1

    .line 25
    iget-object v0, p0, Lcom/tencent/open/utils/OpenConfig;->c:Landroid/content/Context;

    return-object v0
.end method

.method private a(Ljava/lang/String;)Ljava/lang/String;
    .locals 10

    .line 101
    const/4 v2, 0x0

    .line 102
    const/4 v3, 0x0

    .line 103
    const-string v4, ""

    .line 106
    :try_start_0
    iget-object v0, p0, Lcom/tencent/open/utils/OpenConfig;->d:Ljava/lang/String;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 107
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "."

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/tencent/open/utils/OpenConfig;->d:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    goto :goto_0

    .line 109
    :cond_0
    move-object v5, p1

    .line 112
    :goto_0
    iget-object v0, p0, Lcom/tencent/open/utils/OpenConfig;->c:Landroid/content/Context;

    invoke-virtual {v0, v5}, Landroid/content/Context;->openFileInput(Ljava/lang/String;)Ljava/io/FileInputStream;
    :try_end_0
    .catch Ljava/io/FileNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v2

    .line 120
    goto :goto_1

    .line 113
    :catch_0
    move-exception v5

    .line 115
    :try_start_1
    iget-object v0, p0, Lcom/tencent/open/utils/OpenConfig;->c:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getAssets()Landroid/content/res/AssetManager;

    move-result-object v0

    invoke-virtual {v0, p1}, Landroid/content/res/AssetManager;->open(Ljava/lang/String;)Ljava/io/InputStream;
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_1

    move-result-object v2

    .line 119
    goto :goto_1

    .line 116
    :catch_1
    move-exception v6

    .line 117
    invoke-virtual {v6}, Ljava/io/IOException;->printStackTrace()V

    .line 118
    return-object v4

    .line 121
    :goto_1
    new-instance v3, Ljava/io/BufferedReader;

    new-instance v0, Ljava/io/InputStreamReader;

    const-string v1, "UTF-8"

    invoke-static {v1}, Ljava/nio/charset/Charset;->forName(Ljava/lang/String;)Ljava/nio/charset/Charset;

    move-result-object v1

    invoke-direct {v0, v2, v1}, Ljava/io/InputStreamReader;-><init>(Ljava/io/InputStream;Ljava/nio/charset/Charset;)V

    invoke-direct {v3, v0}, Ljava/io/BufferedReader;-><init>(Ljava/io/Reader;)V

    .line 122
    new-instance v5, Ljava/lang/StringBuffer;

    invoke-direct {v5}, Ljava/lang/StringBuffer;-><init>()V

    .line 123
    const/4 v6, 0x0

    .line 125
    :goto_2
    :try_start_2
    invoke-virtual {v3}, Ljava/io/BufferedReader;->readLine()Ljava/lang/String;

    move-result-object v6

    const/4 v0, 0x0

    if-eq v0, v6, :cond_1

    .line 126
    invoke-virtual {v5, v6}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    goto :goto_2

    .line 128
    :cond_1
    invoke-virtual {v5}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_3
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    move-result-object v0

    move-object v4, v0

    .line 133
    :try_start_3
    invoke-virtual {v2}, Ljava/io/InputStream;->close()V

    .line 134
    invoke-virtual {v3}, Ljava/io/BufferedReader;->close()V
    :try_end_3
    .catch Ljava/io/IOException; {:try_start_3 .. :try_end_3} :catch_2

    .line 137
    goto :goto_4

    .line 135
    :catch_2
    move-exception v7

    .line 136
    invoke-virtual {v7}, Ljava/io/IOException;->printStackTrace()V

    .line 138
    goto :goto_4

    .line 129
    :catch_3
    move-exception v7

    .line 130
    :try_start_4
    invoke-virtual {v7}, Ljava/io/IOException;->printStackTrace()V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 133
    :try_start_5
    invoke-virtual {v2}, Ljava/io/InputStream;->close()V

    .line 134
    invoke-virtual {v3}, Ljava/io/BufferedReader;->close()V
    :try_end_5
    .catch Ljava/io/IOException; {:try_start_5 .. :try_end_5} :catch_4

    .line 137
    goto :goto_4

    .line 135
    :catch_4
    move-exception v7

    .line 136
    invoke-virtual {v7}, Ljava/io/IOException;->printStackTrace()V

    .line 138
    goto :goto_4

    .line 132
    :catchall_0
    move-exception v8

    .line 133
    :try_start_6
    invoke-virtual {v2}, Ljava/io/InputStream;->close()V

    .line 134
    invoke-virtual {v3}, Ljava/io/BufferedReader;->close()V
    :try_end_6
    .catch Ljava/io/IOException; {:try_start_6 .. :try_end_6} :catch_5

    .line 137
    goto :goto_3

    .line 135
    :catch_5
    move-exception v9

    .line 136
    invoke-virtual {v9}, Ljava/io/IOException;->printStackTrace()V

    .line 137
    :goto_3
    throw v8

    .line 139
    :goto_4
    return-object v4
.end method

.method private a()V
    .locals 3

    .line 85
    const-string v0, "com.tencent.open.config.json"

    invoke-direct {p0, v0}, Lcom/tencent/open/utils/OpenConfig;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    .line 87
    :try_start_0
    new-instance v0, Lorg/json/JSONObject;

    invoke-direct {v0, v1}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    iput-object v0, p0, Lcom/tencent/open/utils/OpenConfig;->e:Lorg/json/JSONObject;
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    .line 90
    goto :goto_0

    .line 88
    :catch_0
    move-exception v2

    .line 89
    new-instance v0, Lorg/json/JSONObject;

    invoke-direct {v0}, Lorg/json/JSONObject;-><init>()V

    iput-object v0, p0, Lcom/tencent/open/utils/OpenConfig;->e:Lorg/json/JSONObject;

    .line 91
    :goto_0
    return-void
.end method

.method static synthetic a(Lcom/tencent/open/utils/OpenConfig;Lorg/json/JSONObject;)V
    .locals 0

    .line 25
    invoke-direct {p0, p1}, Lcom/tencent/open/utils/OpenConfig;->a(Lorg/json/JSONObject;)V

    return-void
.end method

.method private a(Ljava/lang/String;Ljava/lang/String;)V
    .locals 5

    .line 151
    :try_start_0
    iget-object v0, p0, Lcom/tencent/open/utils/OpenConfig;->d:Ljava/lang/String;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 152
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "."

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/tencent/open/utils/OpenConfig;->d:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    goto :goto_0

    .line 154
    :cond_0
    move-object v2, p1

    .line 156
    :goto_0
    iget-object v0, p0, Lcom/tencent/open/utils/OpenConfig;->c:Landroid/content/Context;

    const/4 v1, 0x0

    invoke-virtual {v0, v2, v1}, Landroid/content/Context;->openFileOutput(Ljava/lang/String;I)Ljava/io/FileOutputStream;

    move-result-object v3

    .line 159
    new-instance v4, Ljava/io/OutputStreamWriter;

    const-string v0, "UTF-8"

    invoke-static {v0}, Ljava/nio/charset/Charset;->forName(Ljava/lang/String;)Ljava/nio/charset/Charset;

    move-result-object v0

    invoke-direct {v4, v3, v0}, Ljava/io/OutputStreamWriter;-><init>(Ljava/io/OutputStream;Ljava/nio/charset/Charset;)V

    .line 160
    invoke-virtual {v4, p2}, Ljava/io/OutputStreamWriter;->write(Ljava/lang/String;)V

    .line 161
    invoke-virtual {v4}, Ljava/io/OutputStreamWriter;->flush()V

    .line 162
    invoke-virtual {v4}, Ljava/io/OutputStreamWriter;->close()V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 165
    goto :goto_1

    .line 163
    :catch_0
    move-exception v2

    .line 164
    invoke-virtual {v2}, Ljava/io/IOException;->printStackTrace()V

    .line 166
    :goto_1
    return-void
.end method

.method private a(Lorg/json/JSONObject;)V
    .locals 2

    .line 217
    const-string v0, "cgi back, do update"

    invoke-direct {p0, v0}, Lcom/tencent/open/utils/OpenConfig;->b(Ljava/lang/String;)V

    .line 218
    iput-object p1, p0, Lcom/tencent/open/utils/OpenConfig;->e:Lorg/json/JSONObject;

    .line 219
    const-string v0, "com.tencent.open.config.json"

    invoke-virtual {p1}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {p0, v0, v1}, Lcom/tencent/open/utils/OpenConfig;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 220
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    move-result-wide v0

    iput-wide v0, p0, Lcom/tencent/open/utils/OpenConfig;->f:J

    .line 221
    return-void
.end method

.method private b()V
    .locals 3

    .line 172
    iget v0, p0, Lcom/tencent/open/utils/OpenConfig;->g:I

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 174
    const-string v0, "update thread is running, return"

    invoke-direct {p0, v0}, Lcom/tencent/open/utils/OpenConfig;->b(Ljava/lang/String;)V

    .line 175
    return-void

    .line 177
    :cond_0
    const/4 v0, 0x1

    iput v0, p0, Lcom/tencent/open/utils/OpenConfig;->g:I

    .line 178
    new-instance v2, Landroid/os/Bundle;

    invoke-direct {v2}, Landroid/os/Bundle;-><init>()V

    .line 179
    const-string v0, "appid"

    iget-object v1, p0, Lcom/tencent/open/utils/OpenConfig;->d:Ljava/lang/String;

    invoke-virtual {v2, v0, v1}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 180
    const-string v0, "appid_for_getting_config"

    iget-object v1, p0, Lcom/tencent/open/utils/OpenConfig;->d:Ljava/lang/String;

    invoke-virtual {v2, v0, v1}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 181
    const-string v0, "status_os"

    sget-object v1, Landroid/os/Build$VERSION;->RELEASE:Ljava/lang/String;

    invoke-virtual {v2, v0, v1}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 182
    const-string v0, "status_machine"

    sget-object v1, Landroid/os/Build;->MODEL:Ljava/lang/String;

    invoke-virtual {v2, v0, v1}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 183
    const-string v0, "status_version"

    sget-object v1, Landroid/os/Build$VERSION;->SDK:Ljava/lang/String;

    invoke-virtual {v2, v0, v1}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 184
    const-string v0, "sdkv"

    const-string v1, "2.9.1"

    invoke-virtual {v2, v0, v1}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 185
    const-string v0, "sdkp"

    const-string v1, "a"

    invoke-virtual {v2, v0, v1}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 187
    new-instance v0, Lcom/tencent/open/utils/OpenConfig$1;

    invoke-direct {v0, p0, v2}, Lcom/tencent/open/utils/OpenConfig$1;-><init>(Lcom/tencent/open/utils/OpenConfig;Landroid/os/Bundle;)V

    invoke-virtual {v0}, Lcom/tencent/open/utils/OpenConfig$1;->start()V

    .line 209
    return-void
.end method

.method private b(Ljava/lang/String;)V
    .locals 3

    .line 287
    iget-boolean v0, p0, Lcom/tencent/open/utils/OpenConfig;->h:Z

    if-eqz v0, :cond_0

    .line 288
    const-string v0, "OpenConfig"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, "; appid: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget-object v2, p0, Lcom/tencent/open/utils/OpenConfig;->d:Ljava/lang/String;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/tencent/open/a/f;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 290
    :cond_0
    return-void
.end method

.method private c()V
    .locals 7

    .line 227
    iget-object v0, p0, Lcom/tencent/open/utils/OpenConfig;->e:Lorg/json/JSONObject;

    const-string v1, "Common_frequency"

    invoke-virtual {v0, v1}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;)I

    move-result v2

    .line 228
    const/4 v0, 0x0

    if-ne v0, v2, :cond_0

    .line 229
    const/4 v2, 0x1

    .line 231
    :cond_0
    const v0, 0x36ee80

    mul-int/2addr v0, v2

    int-to-long v3, v0

    .line 232
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    move-result-wide v5

    .line 234
    iget-wide v0, p0, Lcom/tencent/open/utils/OpenConfig;->f:J

    sub-long v0, v5, v0

    cmp-long v0, v0, v3

    if-ltz v0, :cond_1

    .line 236
    invoke-direct {p0}, Lcom/tencent/open/utils/OpenConfig;->b()V

    .line 238
    :cond_1
    return-void
.end method

.method public static getInstance(Landroid/content/Context;Ljava/lang/String;)Lcom/tencent/open/utils/OpenConfig;
    .locals 3

    .line 52
    sget-object v0, Lcom/tencent/open/utils/OpenConfig;->a:Ljava/util/HashMap;

    const/4 v1, 0x0

    if-ne v1, v0, :cond_0

    .line 53
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    sput-object v0, Lcom/tencent/open/utils/OpenConfig;->a:Ljava/util/HashMap;

    .line 55
    :cond_0
    const/4 v0, 0x0

    if-eq v0, p1, :cond_1

    .line 56
    sput-object p1, Lcom/tencent/open/utils/OpenConfig;->b:Ljava/lang/String;

    .line 58
    :cond_1
    const/4 v0, 0x0

    if-ne v0, p1, :cond_3

    .line 59
    sget-object v0, Lcom/tencent/open/utils/OpenConfig;->b:Ljava/lang/String;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_2

    .line 60
    sget-object p1, Lcom/tencent/open/utils/OpenConfig;->b:Ljava/lang/String;

    goto :goto_0

    .line 62
    :cond_2
    const-string p1, "0"

    .line 65
    :cond_3
    :goto_0
    sget-object v0, Lcom/tencent/open/utils/OpenConfig;->a:Ljava/util/HashMap;

    invoke-virtual {v0, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Lcom/tencent/open/utils/OpenConfig;

    .line 66
    const/4 v0, 0x0

    if-ne v0, v2, :cond_4

    .line 67
    new-instance v2, Lcom/tencent/open/utils/OpenConfig;

    invoke-direct {v2, p0, p1}, Lcom/tencent/open/utils/OpenConfig;-><init>(Landroid/content/Context;Ljava/lang/String;)V

    .line 68
    sget-object v0, Lcom/tencent/open/utils/OpenConfig;->a:Ljava/util/HashMap;

    invoke-virtual {v0, p1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 70
    :cond_4
    return-object v2
.end method


# virtual methods
.method public getBoolean(Ljava/lang/String;)Z
    .locals 3

    .line 272
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "get "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/tencent/open/utils/OpenConfig;->b(Ljava/lang/String;)V

    .line 273
    invoke-direct {p0}, Lcom/tencent/open/utils/OpenConfig;->c()V

    .line 274
    iget-object v0, p0, Lcom/tencent/open/utils/OpenConfig;->e:Lorg/json/JSONObject;

    invoke-virtual {v0, p1}, Lorg/json/JSONObject;->opt(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v2

    .line 275
    const/4 v0, 0x0

    if-ne v0, v2, :cond_0

    .line 276
    const/4 v0, 0x0

    return v0

    .line 277
    :cond_0
    instance-of v0, v2, Ljava/lang/Integer;

    if-eqz v0, :cond_2

    .line 278
    const/4 v0, 0x0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {v2, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    const/4 v0, 0x1

    goto :goto_0

    :cond_1
    const/4 v0, 0x0

    :goto_0
    return v0

    .line 279
    :cond_2
    instance-of v0, v2, Ljava/lang/Boolean;

    if-eqz v0, :cond_3

    .line 280
    move-object v0, v2

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    return v0

    .line 282
    :cond_3
    const/4 v0, 0x0

    return v0
.end method

.method public getInt(Ljava/lang/String;)I
    .locals 2

    .line 247
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "get "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/tencent/open/utils/OpenConfig;->b(Ljava/lang/String;)V

    .line 248
    invoke-direct {p0}, Lcom/tencent/open/utils/OpenConfig;->c()V

    .line 249
    iget-object v0, p0, Lcom/tencent/open/utils/OpenConfig;->e:Lorg/json/JSONObject;

    invoke-virtual {v0, p1}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;)I

    move-result v0

    return v0
.end method

.method public getLong(Ljava/lang/String;)J
    .locals 2

    .line 259
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "get "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/tencent/open/utils/OpenConfig;->b(Ljava/lang/String;)V

    .line 260
    invoke-direct {p0}, Lcom/tencent/open/utils/OpenConfig;->c()V

    .line 261
    iget-object v0, p0, Lcom/tencent/open/utils/OpenConfig;->e:Lorg/json/JSONObject;

    invoke-virtual {v0, p1}, Lorg/json/JSONObject;->optLong(Ljava/lang/String;)J

    move-result-wide v0

    return-wide v0
.end method
