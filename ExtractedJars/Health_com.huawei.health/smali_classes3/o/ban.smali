.class final Lo/ban;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private b:I

.field private c:[Ljava/lang/String;

.field private d:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<Lo/baq;>;"
        }
    .end annotation
.end field

.field private e:I


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 54
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 56
    return-void
.end method

.method private static a([Ljava/lang/String;)I
    .locals 6

    .line 241
    if-eqz p0, :cond_0

    array-length v0, p0

    if-gtz v0, :cond_1

    .line 243
    :cond_0
    const/4 v0, 0x0

    return v0

    .line 245
    :cond_1
    new-instance v1, Ljava/lang/StringBuffer;

    invoke-direct {v1}, Ljava/lang/StringBuffer;-><init>()V

    .line 246
    move-object v2, p0

    array-length v3, v2

    const/4 v4, 0x0

    :goto_0
    if-ge v4, v3, :cond_2

    aget-object v5, v2, v4

    .line 248
    invoke-virtual {v1, v5}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 246
    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    .line 250
    :cond_2
    invoke-virtual {v1}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    return v0
.end method

.method private static a(Lorg/json/JSONObject;)Lo/ban;
    .locals 9

    .line 189
    if-nez p0, :cond_0

    .line 191
    const/4 v0, 0x0

    return-object v0

    .line 193
    :cond_0
    new-instance v1, Lo/ban;

    invoke-direct {v1}, Lo/ban;-><init>()V

    .line 195
    const-string v0, "action"

    invoke-virtual {p0, v0}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;)I

    move-result v0

    invoke-virtual {v1, v0}, Lo/ban;->e(I)V

    .line 197
    const-string v0, "word"

    invoke-virtual {p0, v0}, Lorg/json/JSONObject;->optJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    move-result-object v2

    .line 198
    if-eqz v2, :cond_2

    invoke-virtual {v2}, Lorg/json/JSONArray;->length()I

    move-result v0

    if-lez v0, :cond_2

    .line 200
    invoke-virtual {v2}, Lorg/json/JSONArray;->length()I

    move-result v3

    .line 201
    new-array v4, v3, [Ljava/lang/String;

    .line 202
    const/4 v5, 0x0

    :goto_0
    if-ge v5, v3, :cond_1

    .line 204
    invoke-virtual {v2, v5}, Lorg/json/JSONArray;->optString(I)Ljava/lang/String;

    move-result-object v0

    aput-object v0, v4, v5

    .line 202
    add-int/lit8 v5, v5, 0x1

    goto :goto_0

    .line 206
    :cond_1
    invoke-virtual {v1, v4}, Lo/ban;->e([Ljava/lang/String;)V

    .line 207
    invoke-static {v4}, Lo/ban;->a([Ljava/lang/String;)I

    move-result v0

    invoke-virtual {v1, v0}, Lo/ban;->d(I)V

    .line 210
    :cond_2
    const-string v0, "notice"

    invoke-virtual {p0, v0}, Lorg/json/JSONObject;->optJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    move-result-object v3

    .line 211
    if-eqz v3, :cond_5

    invoke-virtual {v3}, Lorg/json/JSONArray;->length()I

    move-result v0

    if-lez v0, :cond_5

    .line 213
    new-instance v4, Ljava/util/ArrayList;

    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    .line 214
    invoke-virtual {v3}, Lorg/json/JSONArray;->length()I

    move-result v5

    .line 215
    const/4 v6, 0x0

    .line 216
    const/4 v7, 0x0

    .line 217
    const/4 v8, 0x0

    :goto_1
    if-ge v8, v5, :cond_4

    .line 219
    new-instance v7, Lo/baq;

    invoke-direct {v7}, Lo/baq;-><init>()V

    .line 220
    invoke-virtual {v3, v8}, Lorg/json/JSONArray;->optJSONObject(I)Lorg/json/JSONObject;

    move-result-object v6

    .line 221
    if-eqz v6, :cond_3

    .line 223
    const-string v0, "language"

    invoke-virtual {v6, v0}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;)I

    move-result v0

    invoke-virtual {v7, v0}, Lo/baq;->e(I)V

    .line 224
    const-string v0, "content"

    invoke-virtual {v6, v0}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v7, v0}, Lo/baq;->a(Ljava/lang/String;)V

    .line 226
    :cond_3
    invoke-interface {v4, v7}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 217
    add-int/lit8 v8, v8, 0x1

    goto :goto_1

    .line 228
    :cond_4
    invoke-virtual {v1, v4}, Lo/ban;->c(Ljava/util/List;)V

    .line 230
    :cond_5
    return-object v1
.end method

.method public static c(Ljava/lang/String;)Ljava/util/List;
    .locals 13
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/lang/String;)Ljava/util/List<Lo/ban;>;"
        }
    .end annotation

    .line 131
    const/4 v3, 0x0

    .line 134
    :try_start_0
    new-instance v4, Lorg/json/JSONObject;

    invoke-direct {v4, p0}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    .line 135
    const-string v0, "sensitive_word"

    invoke-virtual {v4, v0}, Lorg/json/JSONObject;->optJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    move-result-object v5

    .line 136
    if-eqz v5, :cond_3

    invoke-virtual {v5}, Lorg/json/JSONArray;->length()I

    move-result v0

    if-lez v0, :cond_3

    .line 138
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    move-object v3, v0

    .line 139
    invoke-virtual {v5}, Lorg/json/JSONArray;->length()I

    move-result v6

    .line 140
    const/4 v7, 0x0

    .line 141
    const/4 v8, 0x0

    .line 142
    const/4 v9, 0x0

    :goto_0
    if-ge v9, v6, :cond_3

    .line 144
    invoke-virtual {v5, v9}, Lorg/json/JSONArray;->optJSONObject(I)Lorg/json/JSONObject;

    move-result-object v0

    invoke-static {v0}, Lo/ban;->a(Lorg/json/JSONObject;)Lo/ban;

    move-result-object v7

    .line 145
    if-eqz v7, :cond_2

    invoke-virtual {v7}, Lo/ban;->e()[Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_2

    .line 147
    invoke-virtual {v7}, Lo/ban;->e()[Ljava/lang/String;

    move-result-object v0

    array-length v0, v0

    add-int/2addr v8, v0

    .line 148
    const/16 v0, 0xc8

    if-le v8, v0, :cond_1

    .line 151
    add-int/lit16 v10, v8, -0xc8

    .line 152
    invoke-virtual {v7}, Lo/ban;->e()[Ljava/lang/String;

    move-result-object v0

    array-length v0, v0

    sub-int v11, v0, v10

    .line 153
    if-lez v11, :cond_0

    .line 155
    new-array v12, v11, [Ljava/lang/String;

    .line 156
    invoke-virtual {v7}, Lo/ban;->e()[Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    const/4 v2, 0x0

    invoke-static {v0, v1, v12, v2, v11}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 157
    invoke-virtual {v7, v12}, Lo/ban;->e([Ljava/lang/String;)V

    .line 158
    invoke-interface {v3, v7}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 161
    :cond_0
    const-string v0, "Sensitive"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "parse sensitive words reach:"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v8}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, ",cut diff:"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v10}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/bpf;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 162
    const-string v0, "Sensitive words more than 200"

    const/4 v1, -0x1

    invoke-static {v1, v0}, Lo/bpj;->i(ILjava/lang/String;)V

    .line 164
    goto :goto_1

    .line 168
    :cond_1
    invoke-interface {v3, v7}, Ljava/util/List;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0

    .line 142
    :cond_2
    add-int/lit8 v9, v9, 0x1

    goto/16 :goto_0

    .line 177
    :cond_3
    :goto_1
    goto :goto_2

    .line 174
    :catch_0
    move-exception v4

    .line 176
    const-string v0, "Sensitive"

    const-string v1, "Parse sensitive json meet exception!"

    invoke-static {v0, v1}, Lo/bpf;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 178
    :goto_2
    return-object v3
.end method


# virtual methods
.method public a(Ljava/lang/String;)Z
    .locals 6

    .line 261
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 263
    const/4 v0, 0x0

    return v0

    .line 266
    :cond_0
    const/4 v1, 0x0

    .line 267
    iget-object v0, p0, Lo/ban;->c:[Ljava/lang/String;

    if-eqz v0, :cond_2

    iget-object v0, p0, Lo/ban;->c:[Ljava/lang/String;

    array-length v0, v0

    if-lez v0, :cond_2

    .line 269
    iget-object v2, p0, Lo/ban;->c:[Ljava/lang/String;

    array-length v3, v2

    const/4 v4, 0x0

    :goto_0
    if-ge v4, v3, :cond_2

    aget-object v5, v2, v4

    .line 271
    if-eqz v5, :cond_1

    invoke-virtual {p1, v5}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 273
    const/4 v1, 0x1

    .line 269
    :cond_1
    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    .line 277
    :cond_2
    return v1
.end method

.method public c()I
    .locals 1

    .line 91
    iget v0, p0, Lo/ban;->b:I

    .line 92
    return v0
.end method

.method public c(I)Ljava/lang/String;
    .locals 4

    .line 108
    const/4 v1, 0x0

    .line 109
    iget-object v0, p0, Lo/ban;->d:Ljava/util/List;

    if-eqz v0, :cond_1

    .line 111
    iget-object v0, p0, Lo/ban;->d:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v3, v0

    check-cast v3, Lo/baq;

    .line 113
    if-eqz v3, :cond_0

    invoke-virtual {v3}, Lo/baq;->a()I

    move-result v0

    if-ne v0, p1, :cond_0

    .line 115
    invoke-virtual {v3}, Lo/baq;->b()Ljava/lang/String;

    move-result-object v1

    .line 116
    goto :goto_1

    .line 118
    :cond_0
    goto :goto_0

    .line 120
    :cond_1
    :goto_1
    return-object v1
.end method

.method public c(Ljava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Lo/baq;>;)V"
        }
    .end annotation

    .line 86
    iput-object p1, p0, Lo/ban;->d:Ljava/util/List;

    .line 87
    return-void
.end method

.method public d()I
    .locals 1

    .line 60
    iget v0, p0, Lo/ban;->e:I

    .line 61
    return v0
.end method

.method public d(I)V
    .locals 0

    .line 97
    iput p1, p0, Lo/ban;->b:I

    .line 98
    return-void
.end method

.method public e(I)V
    .locals 0

    .line 66
    iput p1, p0, Lo/ban;->e:I

    .line 67
    return-void
.end method

.method public e([Ljava/lang/String;)V
    .locals 0

    .line 76
    iput-object p1, p0, Lo/ban;->c:[Ljava/lang/String;

    .line 77
    return-void
.end method

.method public e()[Ljava/lang/String;
    .locals 1

    .line 71
    iget-object v0, p0, Lo/ban;->c:[Ljava/lang/String;

    return-object v0
.end method
