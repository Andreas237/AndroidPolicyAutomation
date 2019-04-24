.class public Lo/dtv;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static volatile c:Lo/dtv;


# instance fields
.field private d:Landroid/content/Context;

.field private e:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 58
    const/4 v0, 0x0

    sput-object v0, Lo/dtv;->c:Lo/dtv;

    return-void
.end method

.method private constructor <init>(Landroid/content/Context;)V
    .locals 1

    .line 75
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 62
    const-string v0, ""

    iput-object v0, p0, Lo/dtv;->e:Ljava/lang/String;

    .line 76
    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    iput-object v0, p0, Lo/dtv;->d:Landroid/content/Context;

    .line 77
    return-void
.end method

.method private a(IJJ)V
    .locals 6

    .line 137
    const-string v2, "0"

    .line 138
    const/16 v0, 0xc8

    if-ne v0, p1, :cond_0

    .line 139
    const-string v2, "0"

    goto :goto_0

    .line 141
    :cond_0
    const-string v2, "1"

    .line 143
    :goto_0
    sub-long v3, p4, p2

    .line 144
    const-string v0, "0"

    invoke-virtual {v2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    const-wide/16 v0, 0x1388

    cmp-long v0, v3, v0

    if-ltz v0, :cond_2

    .line 145
    :cond_1
    new-instance v5, Ljava/util/LinkedHashMap;

    invoke-direct {v5}, Ljava/util/LinkedHashMap;-><init>()V

    .line 146
    const-string v0, "module"

    const-string v1, "2"

    invoke-virtual {v5, v0, v1}, Ljava/util/LinkedHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 147
    const-string v0, "status"

    invoke-virtual {v5, v0, v2}, Ljava/util/LinkedHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 148
    const-string v0, "delay"

    invoke-static {v3, v4}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v5, v0, v1}, Ljava/util/LinkedHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 149
    const-string v0, "errorcode"

    invoke-static {p1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v5, v0, v1}, Ljava/util/LinkedHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 150
    invoke-static {}, Lcom/huawei/operation/OpAnalyticsUtil;->getInstance()Lcom/huawei/operation/OpAnalyticsUtil;

    move-result-object v0

    sget-object v1, Lcom/huawei/operation/OperationKey;->HEALTH_APP_REQUEST_MODULE_85030001:Lcom/huawei/operation/OperationKey;

    invoke-virtual {v1}, Lcom/huawei/operation/OperationKey;->value()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1, v5}, Lcom/huawei/operation/OpAnalyticsUtil;->setEvent2nd(Ljava/lang/String;Ljava/util/LinkedHashMap;)I

    .line 152
    :cond_2
    return-void
.end method

.method private a(ILjava/lang/String;I)V
    .locals 14

    .line 238
    invoke-static/range {p3 .. p3}, Lo/dtz;->b(I)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 239
    return-void

    .line 241
    :cond_0
    const-string v0, "PLGACHIEVE_AchievePuller"

    const-string v1, "enter processMedalBasicData "

    invoke-static {v0, v1}, Lo/dzu;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 242
    new-instance v3, Ljava/util/ArrayList;

    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    .line 245
    invoke-static {}, Lo/dbf;->b()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 246
    move/from16 v0, p3

    move-object/from16 v1, p2

    invoke-static {v0, v1}, Lo/dxe;->b(ILjava/lang/String;)Ljava/lang/String;

    move-result-object p2

    .line 250
    :cond_1
    invoke-static {}, Lo/dbf;->b()Z

    move-result v0

    if-nez v0, :cond_2

    const/16 v0, 0xc8

    if-ne p1, v0, :cond_3

    .line 251
    :cond_2
    iget-object v0, p0, Lo/dtv;->d:Landroid/content/Context;

    move/from16 v1, p3

    move-object/from16 v2, p2

    invoke-static {v1, v2, v0}, Lo/dts;->d(ILjava/lang/String;Landroid/content/Context;)Ljava/util/ArrayList;

    move-result-object v3

    .line 254
    :cond_3
    if-nez p3, :cond_4

    .line 255
    iget-object v0, p0, Lo/dtv;->d:Landroid/content/Context;

    const-string v1, "medal"

    invoke-static {v0, v1}, Lo/dtn;->a(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    .line 256
    invoke-static {v4}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_4

    .line 257
    iget-object v0, p0, Lo/dtv;->d:Landroid/content/Context;

    const-string v1, "personal"

    const-string v2, "1"

    invoke-static {v0, v1, v2}, Lo/dtn;->e(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)V

    .line 260
    :cond_4
    iget-object v0, p0, Lo/dtv;->d:Landroid/content/Context;

    invoke-static {}, Lo/dtz;->e()Ljava/lang/Integer;

    move-result-object v1

    invoke-static {v1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/dcl;->e(Landroid/content/Context;Ljava/lang/String;)Lo/dcl;

    move-result-object v0

    invoke-virtual {v0}, Lo/dcl;->b()Lnet/sqlcipher/database/SQLiteDatabase;

    move-result-object v4

    .line 261
    new-instance v5, Lo/dwk;

    const/16 v0, 0x8

    invoke-direct {v5, v0}, Lo/dwk;-><init>(I)V

    .line 262
    new-instance v6, Lo/dwk;

    const/16 v0, 0xb

    invoke-direct {v6, v0}, Lo/dwk;-><init>(I)V

    .line 263
    new-instance v7, Lo/dwk;

    const/16 v0, 0xd

    invoke-direct {v7, v0}, Lo/dwk;-><init>(I)V

    .line 264
    const/4 v0, 0x0

    if-eq v0, v4, :cond_b

    .line 266
    :try_start_0
    invoke-virtual {v4}, Lnet/sqlcipher/database/SQLiteDatabase;->beginTransaction()V

    .line 267
    const/4 v8, 0x0

    :goto_0
    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-ge v8, v0, :cond_a

    .line 268
    invoke-virtual {v3, v8}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v9, v0

    check-cast v9, Lo/dwk;

    .line 269
    const/4 v0, 0x0

    if-ne v0, v9, :cond_5

    .line 270
    goto/16 :goto_3

    .line 272
    :cond_5
    invoke-virtual {v9}, Lo/dwk;->e()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v10

    :goto_1
    invoke-interface {v10}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_9

    invoke-interface {v10}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v11, v0

    check-cast v11, Lo/dvf;

    .line 273
    const-string v0, "PLGACHIEVE_AchievePuller"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "processMedalBasicData data:data:"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    if-nez v11, :cond_6

    const-string v2, "null"

    goto :goto_2

    :cond_6
    invoke-virtual {v11}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v2

    :goto_2
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/dzu;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 274
    if-eqz v11, :cond_8

    .line 275
    iget-object v0, p0, Lo/dtv;->e:Ljava/lang/String;

    invoke-virtual {v11, v0}, Lo/dvf;->setHuid(Ljava/lang/String;)V

    .line 276
    iget-object v0, p0, Lo/dtv;->d:Landroid/content/Context;

    invoke-static {v0}, Lo/dwn;->c(Landroid/content/Context;)Lo/dwn;

    move-result-object v0

    invoke-virtual {v0, v11}, Lo/dwn;->c(Lo/dvf;)Z

    .line 277
    instance-of v0, v11, Lo/dvu;

    if-eqz v0, :cond_7

    .line 278
    move-object v12, v11

    check-cast v12, Lo/dvu;

    .line 279
    invoke-virtual {v12}, Lo/dvu;->D()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_7

    invoke-virtual {v12}, Lo/dvu;->D()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lo/dzs;->i(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_7

    .line 280
    move-object v0, v11

    check-cast v0, Lo/dvu;

    invoke-virtual {v5, v0}, Lo/dwk;->c(Lo/dvu;)V

    .line 283
    :cond_7
    instance-of v0, v11, Lo/dvj;

    if-eqz v0, :cond_8

    .line 284
    move-object v12, v11

    check-cast v12, Lo/dvj;

    .line 285
    invoke-virtual {v7, v12}, Lo/dwk;->e(Lo/dvj;)V

    .line 288
    :cond_8
    goto/16 :goto_1

    .line 267
    :cond_9
    :goto_3
    add-int/lit8 v8, v8, 0x1

    goto/16 :goto_0

    .line 290
    :cond_a
    invoke-virtual {v4}, Lnet/sqlcipher/database/SQLiteDatabase;->setTransactionSuccessful()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 294
    invoke-virtual {v4}, Lnet/sqlcipher/database/SQLiteDatabase;->endTransaction()V

    .line 295
    goto :goto_4

    .line 291
    :catch_0
    move-exception v8

    .line 292
    const-string v0, "PLGACHIEVE_AchievePuller"

    :try_start_1
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "exception="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v8}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/dzu;->a(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 294
    invoke-virtual {v4}, Lnet/sqlcipher/database/SQLiteDatabase;->endTransaction()V

    .line 295
    goto :goto_4

    .line 294
    :catchall_0
    move-exception v13

    invoke-virtual {v4}, Lnet/sqlcipher/database/SQLiteDatabase;->endTransaction()V

    .line 295
    throw v13

    .line 297
    :cond_b
    :goto_4
    const/16 v0, 0x8

    move/from16 v1, p3

    if-ne v0, v1, :cond_c

    .line 298
    iget-object v0, p0, Lo/dtv;->d:Landroid/content/Context;

    const-string v1, "medal"

    const-string v2, "1"

    invoke-static {v0, v1, v2}, Lo/dtn;->e(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)V

    .line 299
    iget-object v0, p0, Lo/dtv;->d:Landroid/content/Context;

    invoke-static {v0}, Lo/dwn;->c(Landroid/content/Context;)Lo/dwn;

    move-result-object v0

    invoke-virtual {v0, p1, v5}, Lo/dwn;->e(ILo/dwk;)V

    goto :goto_5

    .line 300
    :cond_c
    const/16 v0, 0xb

    move/from16 v1, p3

    if-ne v0, v1, :cond_d

    .line 301
    iget-object v0, p0, Lo/dtv;->d:Landroid/content/Context;

    invoke-static {v0}, Lo/dwn;->c(Landroid/content/Context;)Lo/dwn;

    move-result-object v0

    invoke-virtual {v0, p1, v6}, Lo/dwn;->e(ILo/dwk;)V

    goto :goto_5

    .line 302
    :cond_d
    const/16 v0, 0xd

    move/from16 v1, p3

    if-ne v0, v1, :cond_e

    .line 303
    iget-object v0, p0, Lo/dtv;->d:Landroid/content/Context;

    invoke-static {v0}, Lo/dwn;->c(Landroid/content/Context;)Lo/dwn;

    move-result-object v0

    invoke-virtual {v0, p1, v7}, Lo/dwn;->e(ILo/dwk;)V

    .line 306
    :cond_e
    :goto_5
    return-void
.end method

.method static synthetic a(Lo/dtv;IJJ)V
    .locals 0

    .line 53
    invoke-direct/range {p0 .. p5}, Lo/dtv;->a(IJJ)V

    return-void
.end method

.method private b(I)V
    .locals 3

    .line 216
    const/16 v0, 0xc8

    if-ne p1, v0, :cond_0

    .line 217
    iget-object v0, p0, Lo/dtv;->d:Landroid/content/Context;

    const-string v1, "_uploadMedal"

    const-string v2, ""

    invoke-static {v0, v1, v2}, Lo/dtn;->e(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)V

    .line 220
    :cond_0
    return-void
.end method

.method static synthetic b(Lo/dtv;ILjava/lang/String;I)V
    .locals 0

    .line 53
    invoke-direct {p0, p1, p2, p3}, Lo/dtv;->c(ILjava/lang/String;I)V

    return-void
.end method

.method private c(ILjava/lang/String;)V
    .locals 2

    .line 224
    const/16 v0, 0xc8

    if-ne p1, v0, :cond_0

    .line 225
    new-instance v1, Lo/dvs;

    invoke-direct {v1}, Lo/dvs;-><init>()V

    .line 226
    invoke-virtual {v1, p2}, Lo/dvs;->d(Ljava/lang/String;)V

    .line 227
    iget-object v0, p0, Lo/dtv;->d:Landroid/content/Context;

    invoke-static {v0}, Lo/dwn;->c(Landroid/content/Context;)Lo/dwn;

    move-result-object v0

    invoke-virtual {v0, v1}, Lo/dwn;->e(Lo/dvf;)Z

    .line 229
    :cond_0
    return-void
.end method

.method private c(ILjava/lang/String;I)V
    .locals 9

    .line 162
    const/16 v0, 0x8

    if-ne v0, p3, :cond_0

    .line 163
    return-void

    .line 165
    :cond_0
    const/4 v3, 0x0

    .line 166
    const/16 v0, 0xc8

    if-ne p1, v0, :cond_1

    .line 167
    invoke-static {p3, p2}, Lo/dts;->a(ILjava/lang/String;)Lo/dwk;

    move-result-object v3

    .line 169
    :cond_1
    if-eqz v3, :cond_b

    .line 170
    invoke-virtual {v3}, Lo/dwk;->o()Ljava/lang/String;

    move-result-object v4

    .line 171
    const-string v0, "PLGACHIEVE_AchievePuller"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "processData resultCode:"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/dzu;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 173
    const/16 v0, 0xe

    if-ne v0, p3, :cond_2

    .line 174
    iget-object v0, p0, Lo/dtv;->d:Landroid/content/Context;

    invoke-static {v3, v4, v0}, Lo/dtz;->e(Lo/dwk;Ljava/lang/String;Landroid/content/Context;)V

    .line 176
    :cond_2
    if-nez p3, :cond_3

    const-string v0, "50004"

    invoke-virtual {v0, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 177
    const-string v0, "PLGACHIEVE_AchievePuller"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "processData GET_ACTIVITY_INFO:"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, " set the new user"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/dzu;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 178
    iget-object v0, p0, Lo/dtv;->d:Landroid/content/Context;

    invoke-static {v0}, Lcom/huawei/login/ui/login/LoginInit;->getInstance(Landroid/content/Context;)Lcom/huawei/login/ui/login/LoginInit;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/login/ui/login/LoginInit;->getUsetId()Ljava/lang/String;

    move-result-object v5

    .line 179
    invoke-static {v5}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_3

    .line 180
    iget-object v0, p0, Lo/dtv;->d:Landroid/content/Context;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "NEWBIE"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    const-string v2, "done"

    invoke-static {v0, v1, v2}, Lo/dwv;->c(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)V

    .line 182
    :cond_3
    const/16 v0, 0xa

    if-ne v0, p3, :cond_4

    const-string v0, "0"

    invoke-virtual {v0, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_4

    .line 183
    const-string v0, "PLGACHIEVE_AchievePuller"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "processData GET_ACTIVITY_INFO:"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/dzu;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 184
    iget-object v0, p0, Lo/dtv;->d:Landroid/content/Context;

    invoke-static {v0}, Lo/dwn;->c(Landroid/content/Context;)Lo/dwn;

    move-result-object v0

    invoke-virtual {v0, p1, v3}, Lo/dwn;->e(ILo/dwk;)V

    .line 185
    return-void

    .line 187
    :cond_4
    invoke-static {v3, v4}, Lo/dtz;->a(Lo/dwk;Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_5

    .line 188
    iget-object v0, p0, Lo/dtv;->d:Landroid/content/Context;

    invoke-static {v0}, Lo/dwn;->c(Landroid/content/Context;)Lo/dwn;

    move-result-object v0

    invoke-virtual {v0, p1, v3}, Lo/dwn;->e(ILo/dwk;)V

    .line 189
    return-void

    .line 191
    :cond_5
    invoke-virtual {v3}, Lo/dwk;->e()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v5

    :goto_0
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_a

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v6, v0

    check-cast v6, Lo/dvf;

    .line 192
    const-string v0, "PLGACHIEVE_AchievePuller"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "processData data:data:"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    if-nez v6, :cond_6

    const-string v2, "null"

    goto :goto_1

    :cond_6
    invoke-virtual {v6}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v2

    :goto_1
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/dzu;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 193
    if-eqz v6, :cond_9

    .line 194
    iget-object v0, p0, Lo/dtv;->e:Ljava/lang/String;

    invoke-virtual {v6, v0}, Lo/dvf;->setHuid(Ljava/lang/String;)V

    .line 195
    iget-object v0, p0, Lo/dtv;->d:Landroid/content/Context;

    invoke-static {v0}, Lo/dwn;->c(Landroid/content/Context;)Lo/dwn;

    move-result-object v0

    invoke-virtual {v0, v6}, Lo/dwn;->c(Lo/dvf;)Z

    .line 196
    instance-of v0, v6, Lo/dwj;

    if-eqz v0, :cond_9

    .line 197
    move-object v0, v6

    check-cast v0, Lo/dwj;

    invoke-virtual {v0}, Lo/dwj;->c()I

    move-result v7

    .line 198
    iget-object v0, p0, Lo/dtv;->d:Landroid/content/Context;

    invoke-static {v0}, Lcom/huawei/login/ui/login/LoginInit;->getInstance(Landroid/content/Context;)Lcom/huawei/login/ui/login/LoginInit;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/login/ui/login/LoginInit;->getUsetId()Ljava/lang/String;

    move-result-object v8

    .line 199
    invoke-static {v8}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_7

    goto :goto_0

    .line 200
    :cond_7
    const/16 v0, 0xa

    if-gt v7, v0, :cond_8

    .line 201
    const-string v0, "PLGACHIEVE_AchievePuller"

    const-string v1, " processData set the new user"

    invoke-static {v0, v1}, Lo/dzu;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 202
    iget-object v0, p0, Lo/dtv;->d:Landroid/content/Context;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "NEWBIE"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    const-string v2, "done"

    invoke-static {v0, v1, v2}, Lo/dwv;->c(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_2

    .line 204
    :cond_8
    const-string v0, "PLGACHIEVE_AchievePuller"

    const-string v1, " processData set the old user"

    invoke-static {v0, v1}, Lo/dzu;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 205
    iget-object v0, p0, Lo/dtv;->d:Landroid/content/Context;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "NEWBIE"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    const-string v2, "doing"

    invoke-static {v0, v1, v2}, Lo/dwv;->c(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)V

    .line 209
    :cond_9
    :goto_2
    goto/16 :goto_0

    .line 210
    :cond_a
    iget-object v0, p0, Lo/dtv;->d:Landroid/content/Context;

    invoke-static {v0}, Lo/dwn;->c(Landroid/content/Context;)Lo/dwn;

    move-result-object v0

    invoke-virtual {v0, p1, v3}, Lo/dwn;->e(ILo/dwk;)V

    .line 211
    return-void

    .line 213
    :cond_b
    return-void
.end method

.method static synthetic c(Lo/dtv;ILjava/lang/String;)V
    .locals 0

    .line 53
    invoke-direct {p0, p1, p2}, Lo/dtv;->c(ILjava/lang/String;)V

    return-void
.end method

.method public static d(Landroid/content/Context;)Lo/dtv;
    .locals 3

    .line 65
    sget-object v0, Lo/dtv;->c:Lo/dtv;

    if-nez v0, :cond_1

    .line 66
    const-class v1, Lo/dtv;

    monitor-enter v1

    .line 67
    :try_start_0
    sget-object v0, Lo/dtv;->c:Lo/dtv;

    if-nez v0, :cond_0

    .line 68
    new-instance v0, Lo/dtv;

    invoke-direct {v0, p0}, Lo/dtv;-><init>(Landroid/content/Context;)V

    sput-object v0, Lo/dtv;->c:Lo/dtv;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 70
    :cond_0
    monitor-exit v1

    goto :goto_0

    :catchall_0
    move-exception v2

    monitor-exit v1

    throw v2

    .line 72
    :cond_1
    :goto_0
    sget-object v0, Lo/dtv;->c:Lo/dtv;

    return-object v0
.end method

.method static synthetic d(Lo/dtv;I)V
    .locals 0

    .line 53
    invoke-direct {p0, p1}, Lo/dtv;->b(I)V

    return-void
.end method

.method static synthetic e(Lo/dtv;ILjava/lang/String;I)V
    .locals 0

    .line 53
    invoke-direct {p0, p1, p2, p3}, Lo/dtv;->a(ILjava/lang/String;I)V

    return-void
.end method


# virtual methods
.method public c(ILcom/huawei/pluginachievement/connectivity/config/AUserProfile;Ljava/util/Map;)V
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(ILcom/huawei/pluginachievement/connectivity/config/AUserProfile;Ljava/util/Map<Ljava/lang/String;Ljava/lang/String;>;)V"
        }
    .end annotation

    .line 89
    const-string v0, "PLGACHIEVE_AchievePuller"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "enter pullData():contentType =  "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/dzu;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 90
    if-nez p2, :cond_0

    .line 91
    return-void

    .line 93
    :cond_0
    const-string v0, "medalId"

    invoke-interface {p3, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    move-object v7, v0

    check-cast v7, Ljava/lang/String;

    .line 94
    invoke-virtual {p2}, Lcom/huawei/pluginachievement/connectivity/config/AUserProfile;->getHuid()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lo/dtv;->e:Ljava/lang/String;

    .line 96
    const-string v8, "achievementUrl"

    .line 97
    const/16 v0, 0xa

    if-ne v0, p1, :cond_1

    .line 98
    const-string v8, "activityUrl"

    .line 100
    :cond_1
    iget-object v0, p0, Lo/dtv;->d:Landroid/content/Context;

    invoke-static {v0}, Lo/cze;->c(Landroid/content/Context;)Lo/cze;

    move-result-object v0

    new-instance v1, Lo/dtv$3;

    move-object v2, p0

    move v3, p1

    move-object v4, p2

    move-object v5, p3

    move-object v6, v7

    invoke-direct/range {v1 .. v6}, Lo/dtv$3;-><init>(Lo/dtv;ILcom/huawei/pluginachievement/connectivity/config/AUserProfile;Ljava/util/Map;Ljava/lang/String;)V

    invoke-virtual {v0, v8, v1}, Lo/cze;->d(Ljava/lang/String;Lo/cza;)V

    .line 134
    return-void
.end method
