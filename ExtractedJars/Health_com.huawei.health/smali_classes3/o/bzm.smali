.class public Lo/bzm;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 16
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private static a(Ljava/lang/String;)Ljava/lang/String;
    .locals 5

    .line 235
    :try_start_0
    invoke-static {p0}, Ljava/lang/Float;->parseFloat(Ljava/lang/String;)F

    move-result v4

    .line 236
    invoke-static {v4}, Lo/bzm;->e(F)Ljava/lang/String;
    :try_end_0
    .catch Ljava/lang/NumberFormatException; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v0

    return-object v0

    .line 237
    :catch_0
    move-exception v4

    .line 238
    const-string v0, "BIUtil"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "NumberFormatException"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 239
    const-string v0, "0"

    return-object v0
.end method

.method public static a(IILjava/lang/String;)V
    .locals 6

    .line 174
    :try_start_0
    new-instance v4, Ljava/util/HashMap;

    invoke-direct {v4}, Ljava/util/HashMap;-><init>()V

    .line 175
    new-instance v5, Lorg/json/JSONObject;

    invoke-direct {v5}, Lorg/json/JSONObject;-><init>()V

    .line 176
    invoke-static {}, Lo/bzm;->c()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 177
    const-string v0, "create_time"

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v1

    invoke-static {v1, v2}, Lo/bzm;->e(J)J

    move-result-wide v1

    invoke-virtual {v5, v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;J)Lorg/json/JSONObject;

    .line 178
    const-string v0, "movementTimes"

    invoke-virtual {v5, v0, p1}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    .line 180
    :cond_0
    const-string v0, "difficulty"

    add-int/lit8 v1, p0, 0x0

    invoke-virtual {v5, v0, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    .line 181
    const-string v0, "excludedDate"

    invoke-static {p2}, Lo/bsu;->b(Ljava/lang/String;)Ljava/util/TreeSet;

    move-result-object v1

    invoke-virtual {v5, v0, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 182
    const-string v0, "data"

    invoke-virtual {v5}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v4, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 183
    const-string v0, "1130002"

    invoke-static {v0, v4}, Lo/bzm;->c(Ljava/lang/String;Ljava/util/Map;)V
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    .line 186
    goto :goto_0

    .line 184
    :catch_0
    move-exception v4

    .line 185
    const-string v0, "BIUtil"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "JSONException"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 187
    :goto_0
    return-void
.end method

.method public static b(IILjava/lang/String;)V
    .locals 6

    .line 191
    :try_start_0
    new-instance v4, Ljava/util/HashMap;

    invoke-direct {v4}, Ljava/util/HashMap;-><init>()V

    .line 192
    new-instance v5, Lorg/json/JSONObject;

    invoke-direct {v5}, Lorg/json/JSONObject;-><init>()V

    .line 193
    invoke-static {}, Lo/bzm;->c()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 194
    const-string v0, "create_time"

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v1

    invoke-static {v1, v2}, Lo/bzm;->e(J)J

    move-result-wide v1

    invoke-virtual {v5, v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;J)Lorg/json/JSONObject;

    .line 195
    const-string v0, "movementTimes"

    invoke-virtual {v5, v0, p1}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    .line 197
    :cond_0
    const-string v0, "difficulty"

    add-int/lit8 v1, p0, 0x0

    invoke-virtual {v5, v0, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    .line 198
    const-string v0, "excludedDate"

    invoke-static {p2}, Lo/bsu;->b(Ljava/lang/String;)Ljava/util/TreeSet;

    move-result-object v1

    invoke-virtual {v5, v0, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 199
    const-string v0, "data"

    invoke-virtual {v5}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v4, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 200
    const-string v0, "1130003"

    invoke-static {v0, v4}, Lo/bzm;->c(Ljava/lang/String;Ljava/util/Map;)V
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    .line 203
    goto :goto_0

    .line 201
    :catch_0
    move-exception v4

    .line 202
    const-string v0, "BIUtil"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "JSONException"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 204
    :goto_0
    return-void
.end method

.method public static c(Ljava/lang/String;)V
    .locals 2

    .line 146
    new-instance v1, Ljava/util/HashMap;

    invoke-direct {v1}, Ljava/util/HashMap;-><init>()V

    .line 147
    const/4 v0, 0x0

    if-eq v0, p0, :cond_0

    .line 148
    const-string v0, "planName"

    invoke-interface {v1, v0, p0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 151
    :cond_0
    const-string v0, "1120013"

    invoke-static {v0, v1}, Lo/bzm;->c(Ljava/lang/String;Ljava/util/Map;)V

    .line 152
    return-void
.end method

.method public static c(Ljava/lang/String;Ljava/util/Map;)V
    .locals 3

    .line 141
    invoke-static {}, Lo/cxf;->e()Lo/cxf;

    move-result-object v0

    invoke-static {}, Lo/brx;->b()Landroid/content/Context;

    move-result-object v1

    const/4 v2, 0x0

    invoke-virtual {v0, v1, p0, p1, v2}, Lo/cxf;->a(Landroid/content/Context;Ljava/lang/String;Ljava/util/Map;I)I

    .line 142
    invoke-static {}, Lo/cxf;->e()Lo/cxf;

    move-result-object v0

    invoke-static {}, Lo/brx;->b()Landroid/content/Context;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/cxf;->d(Landroid/content/Context;)V

    .line 143
    return-void
.end method

.method public static c()Z
    .locals 2

    .line 256
    invoke-static {}, Lo/brp;->e()Lo/brr;

    move-result-object v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    invoke-static {}, Lo/brp;->e()Lo/brr;

    move-result-object v0

    invoke-interface {v0}, Lo/brr;->c()Z

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public static e(J)J
    .locals 4

    .line 247
    const-wide/32 v0, 0x36ee80

    div-long v0, p0, v0

    const-wide/32 v2, 0x36ee80

    mul-long/2addr v0, v2

    return-wide v0
.end method

.method public static e(F)Ljava/lang/String;
    .locals 1

    .line 208
    const v0, 0x3dcccccd    # 0.1f

    cmpg-float v0, p0, v0

    if-gez v0, :cond_0

    .line 209
    const-string v0, "0"

    return-object v0

    .line 210
    :cond_0
    const/high16 v0, 0x41200000    # 10.0f

    cmpg-float v0, p0, v0

    if-gez v0, :cond_1

    .line 211
    const-string v0, "5"

    return-object v0

    .line 212
    :cond_1
    const/high16 v0, 0x41a00000    # 20.0f

    cmpg-float v0, p0, v0

    if-gez v0, :cond_2

    .line 213
    const-string v0, "15"

    return-object v0

    .line 214
    :cond_2
    const/high16 v0, 0x41f00000    # 30.0f

    cmpg-float v0, p0, v0

    if-gez v0, :cond_3

    .line 215
    const-string v0, "25"

    return-object v0

    .line 216
    :cond_3
    const/high16 v0, 0x42200000    # 40.0f

    cmpg-float v0, p0, v0

    if-gez v0, :cond_4

    .line 217
    const-string v0, "35"

    return-object v0

    .line 218
    :cond_4
    const/high16 v0, 0x42480000    # 50.0f

    cmpg-float v0, p0, v0

    if-gez v0, :cond_5

    .line 219
    const-string v0, "45"

    return-object v0

    .line 220
    :cond_5
    const/high16 v0, 0x42700000    # 60.0f

    cmpg-float v0, p0, v0

    if-gez v0, :cond_6

    .line 221
    const-string v0, "55"

    return-object v0

    .line 222
    :cond_6
    const/high16 v0, 0x428c0000    # 70.0f

    cmpg-float v0, p0, v0

    if-gez v0, :cond_7

    .line 223
    const-string v0, "65"

    return-object v0

    .line 224
    :cond_7
    const/high16 v0, 0x42a00000    # 80.0f

    cmpg-float v0, p0, v0

    if-gez v0, :cond_8

    .line 225
    const-string v0, "75"

    return-object v0

    .line 226
    :cond_8
    const/high16 v0, 0x42b40000    # 90.0f

    cmpg-float v0, p0, v0

    if-gez v0, :cond_9

    .line 227
    const-string v0, "85"

    return-object v0

    .line 229
    :cond_9
    const-string v0, "95"

    return-object v0
.end method

.method public static e(Ljava/lang/String;)V
    .locals 4

    .line 108
    new-instance v3, Ljava/util/HashMap;

    invoke-direct {v3}, Ljava/util/HashMap;-><init>()V

    .line 109
    const-string v0, "click"

    const-string v1, "1"

    invoke-interface {v3, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 110
    invoke-static {}, Lo/cxf;->e()Lo/cxf;

    move-result-object v0

    invoke-static {}, Lo/brx;->b()Landroid/content/Context;

    move-result-object v1

    const/4 v2, 0x0

    invoke-virtual {v0, v1, p0, v3, v2}, Lo/cxf;->a(Landroid/content/Context;Ljava/lang/String;Ljava/util/Map;I)I

    .line 111
    invoke-static {}, Lo/cxf;->e()Lo/cxf;

    move-result-object v0

    invoke-static {}, Lo/brx;->b()Landroid/content/Context;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/cxf;->d(Landroid/content/Context;)V

    .line 112
    return-void
.end method

.method public static e(Ljava/lang/String;I)V
    .locals 3

    .line 126
    new-instance v2, Ljava/util/HashMap;

    invoke-direct {v2}, Ljava/util/HashMap;-><init>()V

    .line 127
    const-string v0, "click"

    const-string v1, "1"

    invoke-interface {v2, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 128
    const-string v0, "entrance"

    invoke-interface {v2, v0, p0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 129
    const-string v0, "position"

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v2, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 130
    const-string v0, "1130015"

    invoke-static {v0, v2}, Lo/bzm;->c(Ljava/lang/String;Ljava/util/Map;)V

    .line 132
    return-void
.end method

.method public static e(Ljava/lang/String;ILjava/lang/String;)V
    .locals 3

    .line 115
    new-instance v2, Ljava/util/HashMap;

    invoke-direct {v2}, Ljava/util/HashMap;-><init>()V

    .line 116
    const-string v0, "click"

    const-string v1, "1"

    invoke-interface {v2, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 117
    const-string v0, "type"

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v2, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 118
    const-string v0, "content"

    invoke-interface {v2, v0, p2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 119
    invoke-static {p0, v2}, Lo/bzm;->c(Ljava/lang/String;Ljava/util/Map;)V

    .line 120
    return-void
.end method

.method public static e(Ljava/lang/String;Ljava/lang/String;)V
    .locals 7

    .line 155
    new-instance v4, Ljava/util/HashMap;

    invoke-direct {v4}, Ljava/util/HashMap;-><init>()V

    .line 156
    new-instance v5, Lorg/json/JSONObject;

    invoke-direct {v5}, Lorg/json/JSONObject;-><init>()V

    .line 158
    const-string v0, "plan_name"

    :try_start_0
    invoke-virtual {v5, v0, p0}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 159
    invoke-static {}, Lo/bzm;->c()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 160
    const-string v0, "end_time"

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v1

    invoke-static {v1, v2}, Lo/bzm;->e(J)J

    move-result-wide v1

    invoke-virtual {v5, v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;J)Lorg/json/JSONObject;

    .line 161
    const/4 v0, 0x0

    if-eq v0, p1, :cond_0

    .line 162
    const-string v0, "finishRate"

    invoke-static {p1}, Lo/bzm;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v5, v0, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 165
    :cond_0
    const-string v0, "data"

    invoke-virtual {v5}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v4, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 166
    const-string v0, "1120004"

    invoke-static {v0, v4}, Lo/bzm;->c(Ljava/lang/String;Ljava/util/Map;)V
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    .line 169
    goto :goto_0

    .line 167
    :catch_0
    move-exception v6

    .line 168
    const-string v0, "BIUtil"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "JSONException = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {v6}, Lorg/json/JSONException;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 170
    :goto_0
    return-void
.end method
