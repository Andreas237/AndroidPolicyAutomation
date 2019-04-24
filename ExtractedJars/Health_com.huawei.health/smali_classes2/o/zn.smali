.class public Lo/zn;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private a:Ljava/lang/String;

.field private b:Ljava/lang/String;

.field private c:Ljava/lang/String;

.field private d:Ljava/lang/String;


# direct methods
.method private constructor <init>()V
    .locals 0

    .line 64
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 67
    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    .line 69
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 71
    iput-object p1, p0, Lo/zn;->b:Ljava/lang/String;

    .line 72
    iput-object p2, p0, Lo/zn;->c:Ljava/lang/String;

    .line 73
    iput-object p3, p0, Lo/zn;->a:Ljava/lang/String;

    .line 74
    iput-object p4, p0, Lo/zn;->d:Ljava/lang/String;

    .line 75
    return-void
.end method

.method private c(Lo/zj;)V
    .locals 17

    .line 113
    if-nez p1, :cond_0

    .line 115
    const-string v0, "queryLocalGrs iLocalQueryGrsCallBack is null."

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lo/aap;->b(Ljava/lang/String;Z)V

    .line 116
    return-void

    .line 119
    :cond_0
    new-instance v4, Lo/ze;

    invoke-direct {v4}, Lo/ze;-><init>()V

    .line 121
    invoke-virtual {v4}, Lo/ze;->d()Z

    move-result v5

    .line 123
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "isLoadDataSuccess "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lo/aap;->e(Ljava/lang/String;Z)V

    .line 126
    if-eqz v5, :cond_1

    .line 128
    const-string v0, "queryLocalGrs  LoadData success."

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lo/aap;->e(Ljava/lang/String;Z)V

    .line 129
    goto :goto_0

    .line 132
    :cond_1
    move-object/from16 v0, p1

    const/16 v1, -0x259

    invoke-interface {v0, v1}, Lo/zj;->b(I)V

    .line 133
    return-void

    .line 136
    :goto_0
    new-instance v6, Lo/zt;

    move-object/from16 v0, p0

    iget-object v0, v0, Lo/zn;->b:Ljava/lang/String;

    move-object/from16 v1, p0

    iget-object v1, v1, Lo/zn;->c:Ljava/lang/String;

    move-object/from16 v2, p0

    iget-object v2, v2, Lo/zn;->a:Ljava/lang/String;

    move-object/from16 v3, p0

    iget-object v3, v3, Lo/zn;->d:Ljava/lang/String;

    invoke-direct {v6, v0, v1, v2, v3}, Lo/zt;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 138
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/zn;->b:Ljava/lang/String;

    invoke-virtual {v4, v0}, Lo/ze;->a(Ljava/lang/String;)Ljava/util/List;

    move-result-object v7

    .line 140
    if-eqz v7, :cond_2

    invoke-interface {v7}, Ljava/util/List;->size()I

    move-result v0

    if-nez v0, :cond_3

    .line 142
    :cond_2
    const-string v0, "serviceNames is null."

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lo/aap;->b(Ljava/lang/String;Z)V

    .line 143
    move-object/from16 v0, p1

    const/16 v1, -0x25a

    invoke-interface {v0, v1}, Lo/zj;->b(I)V

    .line 144
    return-void

    .line 147
    :cond_3
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "serviceNames size "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-interface {v7}, Ljava/util/List;->size()I

    move-result v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lo/aap;->e(Ljava/lang/String;Z)V

    .line 150
    new-instance v8, Lorg/json/JSONObject;

    invoke-direct {v8}, Lorg/json/JSONObject;-><init>()V

    .line 152
    invoke-interface {v7}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v10

    goto/16 :goto_2

    :cond_4
    invoke-interface {v10}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v9, v0

    check-cast v9, Ljava/lang/String;

    .line 156
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/zn;->b:Ljava/lang/String;

    invoke-virtual {v4, v0, v9}, Lo/ze;->c(Ljava/lang/String;Ljava/lang/String;)Lo/zd;

    move-result-object v11

    .line 158
    new-instance v12, Lo/zx;

    invoke-direct {v12, v11}, Lo/zx;-><init>(Lo/zd;)V

    .line 160
    invoke-virtual {v6}, Lo/zt;->e()Ljava/util/Map;

    move-result-object v0

    invoke-virtual {v12, v0}, Lo/zx;->d(Ljava/util/Map;)Ljava/util/Map;

    move-result-object v13

    .line 162
    if-eqz v13, :cond_6

    invoke-interface {v13}, Ljava/util/Map;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_6

    .line 165
    new-instance v14, Lorg/json/JSONObject;

    invoke-direct {v14}, Lorg/json/JSONObject;-><init>()V

    .line 169
    :try_start_0
    invoke-interface {v13}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v15

    .line 170
    goto :goto_1

    .line 172
    :cond_5
    invoke-interface {v15}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object/from16 v16, v0

    check-cast v16, Ljava/util/Map$Entry;

    .line 173
    invoke-interface/range {v16 .. v16}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    invoke-interface/range {v16 .. v16}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v1

    invoke-virtual {v14, v0, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 170
    :goto_1
    invoke-interface {v15}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-nez v0, :cond_5

    .line 176
    invoke-virtual {v8, v9, v14}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    .line 177
    goto :goto_2

    .line 178
    :catch_0
    move-exception v15

    .line 180
    const-string v0, "queryLocalGrs JSONException: "

    const/4 v1, 0x0

    invoke-static {v0, v15, v1}, Lo/aap;->b(Ljava/lang/String;Ljava/lang/Throwable;Z)V

    .line 182
    goto :goto_2

    .line 185
    :cond_6
    const-string v0, "xMap is null."

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lo/aap;->b(Ljava/lang/String;Z)V

    .line 152
    :goto_2
    invoke-interface {v10}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-nez v0, :cond_4

    .line 190
    invoke-virtual {v8}, Lorg/json/JSONObject;->length()I

    move-result v0

    if-nez v0, :cond_7

    .line 192
    const-string v0, "queryLocalGrs jObjectService is null."

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lo/aap;->b(Ljava/lang/String;Z)V

    .line 193
    move-object/from16 v0, p1

    const/16 v1, -0x25b

    invoke-interface {v0, v1}, Lo/zj;->b(I)V

    .line 194
    return-void

    .line 197
    :cond_7
    invoke-virtual {v8}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    move-result-object v9

    .line 199
    invoke-static {v9}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_8

    .line 201
    const-string v0, "queryLocalGrs serviceResult is null."

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lo/aap;->b(Ljava/lang/String;Z)V

    .line 202
    move-object/from16 v0, p1

    const/16 v1, -0x25b

    invoke-interface {v0, v1}, Lo/zj;->b(I)V

    .line 203
    goto :goto_3

    .line 206
    :cond_8
    const-string v0, "queryLocalGrs serviceResult is not null."

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lo/aap;->b(Ljava/lang/String;Z)V

    .line 208
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "queryLocalGrs serviceResult  "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    invoke-static {v0, v1}, Lo/aap;->e(Ljava/lang/String;Z)V

    .line 210
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v10

    .line 211
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/zn;->b:Ljava/lang/String;

    invoke-virtual {v4, v0}, Lo/ze;->d(Ljava/lang/String;)Ljava/lang/Long;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    move-result-wide v12

    .line 213
    new-instance v14, Ljava/lang/StringBuffer;

    invoke-direct {v14}, Ljava/lang/StringBuffer;-><init>()V

    .line 214
    invoke-virtual {v14, v9}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 215
    const-string v0, "_"

    invoke-virtual {v14, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 216
    const-wide/16 v0, 0x3e8

    mul-long/2addr v0, v12

    add-long/2addr v0, v10

    invoke-static {v0, v1}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v14, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 218
    invoke-virtual {v14}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;

    move-result-object v0

    move-object/from16 v1, p1

    invoke-interface {v1, v0}, Lo/zj;->c(Ljava/lang/String;)V

    .line 220
    :goto_3
    return-void
.end method


# virtual methods
.method public b(Landroid/content/Context;Lo/zj;)V
    .locals 2

    .line 87
    if-nez p2, :cond_0

    .line 89
    const-string v0, "GrsLoacalQueryMgr startLoacalQuery iLocalQueryGrsCallBack is null."

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lo/aap;->b(Ljava/lang/String;Z)V

    .line 90
    return-void

    .line 92
    :cond_0
    if-nez p1, :cond_1

    .line 94
    const-string v0, "GrsLoacalQueryMgr startLoacalQuery context is null."

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lo/aap;->b(Ljava/lang/String;Z)V

    .line 95
    return-void

    .line 99
    :cond_1
    invoke-static {}, Lo/zm;->d()Lo/zm;

    move-result-object v0

    invoke-virtual {v0, p1}, Lo/zm;->b(Landroid/content/Context;)V

    .line 101
    invoke-direct {p0, p2}, Lo/zn;->c(Lo/zj;)V

    .line 102
    return-void
.end method
