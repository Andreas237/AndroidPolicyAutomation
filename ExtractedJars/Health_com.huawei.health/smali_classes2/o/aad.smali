.class public Lo/aad;
.super Lo/aab;
.source "SourceFile"


# instance fields
.field private a:Lo/zs;

.field private c:Lo/aaj;

.field private d:Lo/zo;


# direct methods
.method public constructor <init>(Lo/zs;Lo/zo;)V
    .locals 4

    .line 68
    invoke-direct {p0}, Lo/aab;-><init>()V

    .line 62
    const/4 v0, 0x0

    iput-object v0, p0, Lo/aad;->c:Lo/aaj;

    .line 70
    iput-object p1, p0, Lo/aad;->a:Lo/zs;

    .line 71
    iput-object p2, p0, Lo/aad;->d:Lo/zo;

    .line 72
    new-instance v3, Ljava/util/HashMap;

    invoke-direct {v3}, Ljava/util/HashMap;-><init>()V

    .line 73
    iget-object v0, p0, Lo/aad;->a:Lo/zs;

    invoke-virtual {v0}, Lo/zs;->i()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 75
    const-string v0, "user-agent"

    new-instance v1, Ljava/lang/StringBuilder;

    iget-object v2, p0, Lo/aad;->a:Lo/zs;

    invoke-virtual {v2}, Lo/zs;->e()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    const-string v2, "/"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget-object v2, p0, Lo/aad;->a:Lo/zs;

    invoke-virtual {v2}, Lo/zs;->i()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v3, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 76
    goto :goto_0

    .line 79
    :cond_0
    const-string v0, "user-agent"

    iget-object v1, p0, Lo/aad;->a:Lo/zs;

    invoke-virtual {v1}, Lo/zs;->e()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v3, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 81
    :goto_0
    new-instance v0, Lo/aae;

    invoke-direct {v0, v3}, Lo/aae;-><init>(Ljava/util/Map;)V

    iput-object v0, p0, Lo/aad;->c:Lo/aaj;

    .line 82
    return-void
.end method

.method private b(Lorg/json/JSONObject;Ljava/util/Map;)V
    .locals 11
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Lorg/json/JSONObject;Ljava/util/Map<Ljava/lang/String;Ljava/lang/String;>;)V"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/json/JSONException;
        }
    .end annotation

    .line 171
    if-eqz p2, :cond_0

    invoke-interface {p2}, Ljava/util/Map;->size()I

    move-result v0

    if-gtz v0, :cond_1

    .line 173
    :cond_0
    return-void

    .line 176
    :cond_1
    const-wide/16 v4, 0x0

    .line 177
    const-string v0, "Cache-Control"

    invoke-interface {p2, v0}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 179
    const-string v0, "Cache-Control"

    invoke-interface {p2, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    move-object v6, v0

    check-cast v6, Ljava/lang/String;

    .line 180
    const-string v0, "max-age="

    invoke-virtual {v6, v0}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_5

    .line 185
    const-string v0, "max-age="

    :try_start_0
    invoke-virtual {v6, v0}, Ljava/lang/String;->indexOf(Ljava/lang/String;)I

    move-result v0

    .line 186
    const-string v1, "max-age="

    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result v1

    add-int/2addr v0, v1

    .line 185
    invoke-virtual {v6, v0}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    move-result-wide v0

    .line 184
    move-wide v4, v0

    .line 188
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "Cache-Control value-->"

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, v4, v5}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lo/aap;->e(Ljava/lang/String;Z)V
    :try_end_0
    .catch Ljava/lang/NumberFormatException; {:try_start_0 .. :try_end_0} :catch_0

    .line 189
    goto/16 :goto_1

    .line 190
    :catch_0
    move-exception v7

    .line 192
    const-string v0, "addHeadersToResult NumberFormatException,"

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lo/aap;->b(Ljava/lang/String;Z)V

    .line 195
    goto/16 :goto_1

    .line 196
    :cond_2
    const-string v0, "Expires"

    invoke-interface {p2, v0}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_5

    .line 198
    const-string v0, "Expires"

    invoke-interface {p2, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    move-object v6, v0

    check-cast v6, Ljava/lang/String;

    .line 200
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "expires-->"

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lo/aap;->e(Ljava/lang/String;Z)V

    .line 202
    new-instance v7, Ljava/text/SimpleDateFormat;

    const-string v0, "EEE, d MMM yyyy HH:mm:ss \'GMT\'"

    sget-object v1, Ljava/util/Locale;->US:Ljava/util/Locale;

    invoke-direct {v7, v0, v1}, Ljava/text/SimpleDateFormat;-><init>(Ljava/lang/String;Ljava/util/Locale;)V

    .line 203
    const/4 v8, 0x0

    .line 204
    const-string v0, "Date"

    invoke-interface {p2, v0}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 206
    const-string v0, "Date"

    invoke-interface {p2, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    move-object v8, v0

    check-cast v8, Ljava/lang/String;

    .line 208
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "dateStr-->"

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lo/aap;->e(Ljava/lang/String;Z)V

    .line 214
    :cond_3
    :try_start_1
    invoke-virtual {v7, v6}, Ljava/text/DateFormat;->parse(Ljava/lang/String;)Ljava/util/Date;

    move-result-object v9

    .line 215
    const/4 v10, 0x0

    .line 216
    invoke-static {v8}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_4

    .line 218
    new-instance v10, Ljava/util/Date;

    invoke-direct {v10}, Ljava/util/Date;-><init>()V

    .line 219
    goto :goto_0

    .line 222
    :cond_4
    invoke-virtual {v7, v8}, Ljava/text/DateFormat;->parse(Ljava/lang/String;)Ljava/util/Date;

    move-result-object v10

    .line 224
    :goto_0
    invoke-virtual {v9}, Ljava/util/Date;->getTime()J

    move-result-wide v0

    invoke-virtual {v10}, Ljava/util/Date;->getTime()J

    move-result-wide v2

    sub-long/2addr v0, v2

    const-wide/16 v2, 0x3e8

    div-long/2addr v0, v2
    :try_end_1
    .catch Ljava/text/ParseException; {:try_start_1 .. :try_end_1} :catch_1

    move-wide v4, v0

    .line 225
    goto :goto_1

    .line 226
    :catch_1
    move-exception v9

    .line 228
    const-string v0, "addHeadersToResult ParseException."

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lo/aap;->b(Ljava/lang/String;Z)V

    .line 232
    :cond_5
    :goto_1
    const-wide/16 v0, 0x3e8

    mul-long/2addr v4, v0

    .line 234
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "convert expireTime--->"

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, v4, v5}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lo/aap;->e(Ljava/lang/String;Z)V

    .line 236
    const-string v0, "expireTime"

    invoke-virtual {p1, v0, v4, v5}, Lorg/json/JSONObject;->put(Ljava/lang/String;J)Lorg/json/JSONObject;

    .line 237
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v6

    .line 238
    const-string v0, "lastReqTime"

    invoke-virtual {p1, v0, v6, v7}, Lorg/json/JSONObject;->put(Ljava/lang/String;J)Lorg/json/JSONObject;

    .line 239
    return-void
.end method


# virtual methods
.method public c()Ljava/lang/String;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/json/JSONException;,
            Ljava/io/IOException;,
            Ljava/util/concurrent/TimeoutException;
        }
    .end annotation

    .line 88
    invoke-virtual {p0}, Lo/aad;->d()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public d()Ljava/lang/String;
    .locals 13

    .line 99
    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    .line 100
    iget-object v0, p0, Lo/aad;->d:Lo/zo;

    invoke-virtual {v0}, Lo/zo;->c()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 101
    iget-object v0, p0, Lo/aad;->d:Lo/zo;

    invoke-virtual {v0}, Lo/zo;->b()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    iget-object v2, p0, Lo/aad;->a:Lo/zs;

    invoke-virtual {v2}, Lo/zs;->e()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 103
    iget-object v0, p0, Lo/aad;->a:Lo/zs;

    const/4 v1, 0x0

    const/4 v2, 0x0

    invoke-static {v0, v1, v2}, Lo/aar;->e(Lo/zs;ZZ)Ljava/lang/String;

    move-result-object v5

    .line 105
    invoke-static {v5}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 107
    const-string v0, "?"

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 108
    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 111
    :cond_0
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "req str--->"

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    invoke-static {v0, v1}, Lo/aap;->e(Ljava/lang/String;Z)V

    .line 113
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v6

    .line 114
    const/4 v7, 0x0

    .line 115
    const/4 v8, 0x0

    .line 116
    new-instance v9, Ljava/util/HashMap;

    invoke-direct {v9}, Ljava/util/HashMap;-><init>()V

    .line 120
    :try_start_0
    new-instance v0, Ljava/io/ByteArrayOutputStream;

    invoke-direct {v0}, Ljava/io/ByteArrayOutputStream;-><init>()V

    move-object v7, v0

    .line 121
    iget-object v0, p0, Lo/aad;->c:Lo/aaj;

    invoke-interface {v0, v6, v7, v9}, Lo/aaj;->d(Ljava/lang/String;Ljava/io/OutputStream;Ljava/util/Map;)I

    move-result v10

    .line 123
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "obtainGrsRooter statusCode---->"

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, v10}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lo/aap;->e(Ljava/lang/String;Z)V

    .line 125
    const/16 v0, 0xc8

    if-ne v10, v0, :cond_1

    .line 127
    new-instance v0, Ljava/lang/String;

    invoke-virtual {v7}, Ljava/io/ByteArrayOutputStream;->toByteArray()[B

    move-result-object v1

    const-string v2, "UTF-8"

    invoke-direct {v0, v1, v2}, Ljava/lang/String;-><init>([BLjava/lang/String;)V

    move-object v8, v0

    .line 129
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "server  result--->"

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    invoke-static {v0, v1}, Lo/aap;->e(Ljava/lang/String;Z)V

    .line 131
    new-instance v11, Lorg/json/JSONObject;

    invoke-direct {v11, v8}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    .line 132
    invoke-direct {p0, v11, v9}, Lo/aad;->b(Lorg/json/JSONObject;Ljava/util/Map;)V

    .line 133
    invoke-virtual {v11}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    move-result-object v0

    move-object v8, v0

    .line 134
    goto/16 :goto_0

    .line 137
    :cond_1
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "obtainGrsRooter resp fail statusCode---->"

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, v10}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lo/aap;->b(Ljava/lang/String;Z)V
    :try_end_0
    .catch Ljava/io/UnsupportedEncodingException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/IllegalStateException; {:try_start_0 .. :try_end_0} :catch_2
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_3
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_4
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 139
    goto/16 :goto_0

    .line 140
    :catch_0
    move-exception v10

    .line 142
    const-string v0, "obtainGrsRooter UnsupportedEncodingException: "

    const/4 v1, 0x0

    :try_start_1
    invoke-static {v0, v10, v1}, Lo/aap;->b(Ljava/lang/String;Ljava/lang/Throwable;Z)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 162
    invoke-static {v7}, Lo/aaw;->c(Ljava/io/OutputStream;)V

    .line 163
    iget-object v0, p0, Lo/aad;->c:Lo/aaj;

    invoke-interface {v0}, Lo/aaj;->c()V

    goto/16 :goto_1

    .line 144
    :catch_1
    move-exception v10

    .line 146
    const-string v0, "obtainGrsRooter IllegalArgumentException: "

    const/4 v1, 0x0

    :try_start_2
    invoke-static {v0, v10, v1}, Lo/aap;->b(Ljava/lang/String;Ljava/lang/Throwable;Z)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 162
    invoke-static {v7}, Lo/aaw;->c(Ljava/io/OutputStream;)V

    .line 163
    iget-object v0, p0, Lo/aad;->c:Lo/aaj;

    invoke-interface {v0}, Lo/aaj;->c()V

    goto :goto_1

    .line 148
    :catch_2
    move-exception v10

    .line 150
    const-string v0, "obtainGrsRooter IllegalStateException: "

    const/4 v1, 0x0

    :try_start_3
    invoke-static {v0, v10, v1}, Lo/aap;->b(Ljava/lang/String;Ljava/lang/Throwable;Z)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 162
    invoke-static {v7}, Lo/aaw;->c(Ljava/io/OutputStream;)V

    .line 163
    iget-object v0, p0, Lo/aad;->c:Lo/aaj;

    invoke-interface {v0}, Lo/aaj;->c()V

    goto :goto_1

    .line 152
    :catch_3
    move-exception v10

    .line 154
    const-string v0, "obtainGrsRooter IOException: "

    const/4 v1, 0x0

    :try_start_4
    invoke-static {v0, v10, v1}, Lo/aap;->b(Ljava/lang/String;Ljava/lang/Throwable;Z)V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 162
    invoke-static {v7}, Lo/aaw;->c(Ljava/io/OutputStream;)V

    .line 163
    iget-object v0, p0, Lo/aad;->c:Lo/aaj;

    invoke-interface {v0}, Lo/aaj;->c()V

    goto :goto_1

    .line 156
    :catch_4
    move-exception v10

    .line 158
    const-string v0, "obtainGrsRooter JSONException: "

    const/4 v1, 0x0

    :try_start_5
    invoke-static {v0, v10, v1}, Lo/aap;->b(Ljava/lang/String;Ljava/lang/Throwable;Z)V
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    .line 162
    invoke-static {v7}, Lo/aaw;->c(Ljava/io/OutputStream;)V

    .line 163
    iget-object v0, p0, Lo/aad;->c:Lo/aaj;

    invoke-interface {v0}, Lo/aaj;->c()V

    goto :goto_1

    .line 161
    :catchall_0
    move-exception v12

    .line 162
    invoke-static {v7}, Lo/aaw;->c(Ljava/io/OutputStream;)V

    .line 163
    iget-object v0, p0, Lo/aad;->c:Lo/aaj;

    invoke-interface {v0}, Lo/aaj;->c()V

    .line 164
    throw v12

    .line 162
    :goto_0
    invoke-static {v7}, Lo/aaw;->c(Ljava/io/OutputStream;)V

    .line 163
    iget-object v0, p0, Lo/aad;->c:Lo/aaj;

    invoke-interface {v0}, Lo/aaj;->c()V

    .line 165
    :goto_1
    return-object v8
.end method
