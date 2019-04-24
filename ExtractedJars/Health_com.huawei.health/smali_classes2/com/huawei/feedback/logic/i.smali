.class public Lcom/huawei/feedback/logic/i;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# static fields
.field private static final c:Ljava/lang/String; = "FeedbackSubmitTask"


# instance fields
.field a:Lcom/huawei/lcagent/client/LogCollectManager;

.field b:Lcom/huawei/lcagent/client/LogMetricInfo;

.field private d:Lcom/huawei/feedback/bean/d;

.field private e:Z

.field private f:Lcom/huawei/feedback/bean/f;

.field private g:I

.field private h:Landroid/content/Context;

.field private i:I

.field private j:Landroid/os/Handler;

.field private k:Z

.field private l:Ljava/lang/String;

.field private m:Ljava/lang/String;

.field private n:Ljava/lang/String;

.field private o:Ljava/lang/String;

.field private p:Ljava/lang/String;

.field private q:Landroid/os/Handler;


# direct methods
.method public constructor <init>(Lcom/huawei/feedback/bean/d;ILandroid/content/Context;Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    .line 130
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 38
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/feedback/logic/i;->d:Lcom/huawei/feedback/bean/d;

    .line 43
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/feedback/logic/i;->e:Z

    .line 48
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/feedback/logic/i;->f:Lcom/huawei/feedback/bean/f;

    .line 53
    const/4 v0, 0x0

    iput v0, p0, Lcom/huawei/feedback/logic/i;->g:I

    .line 58
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/feedback/logic/i;->a:Lcom/huawei/lcagent/client/LogCollectManager;

    .line 60
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/feedback/logic/i;->b:Lcom/huawei/lcagent/client/LogMetricInfo;

    .line 66
    const/4 v0, 0x1

    iput v0, p0, Lcom/huawei/feedback/logic/i;->i:I

    .line 73
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/feedback/logic/i;->k:Z

    .line 84
    new-instance v0, Lcom/huawei/feedback/logic/j;

    invoke-direct {v0, p0}, Lcom/huawei/feedback/logic/j;-><init>(Lcom/huawei/feedback/logic/i;)V

    iput-object v0, p0, Lcom/huawei/feedback/logic/i;->q:Landroid/os/Handler;

    .line 131
    iput-object p1, p0, Lcom/huawei/feedback/logic/i;->d:Lcom/huawei/feedback/bean/d;

    .line 132
    iput p2, p0, Lcom/huawei/feedback/logic/i;->g:I

    .line 133
    iput-object p3, p0, Lcom/huawei/feedback/logic/i;->h:Landroid/content/Context;

    .line 134
    iput-object p4, p0, Lcom/huawei/feedback/logic/i;->l:Ljava/lang/String;

    .line 135
    iput-object p5, p0, Lcom/huawei/feedback/logic/i;->m:Ljava/lang/String;

    .line 136
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/feedback/logic/i;->k:Z

    .line 137
    return-void
.end method

.method public constructor <init>(Lcom/huawei/feedback/bean/d;ILcom/huawei/lcagent/client/LogCollectManager;Lcom/huawei/lcagent/client/LogMetricInfo;Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Landroid/os/Handler;)V
    .locals 1

    .line 150
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 38
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/feedback/logic/i;->d:Lcom/huawei/feedback/bean/d;

    .line 43
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/feedback/logic/i;->e:Z

    .line 48
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/feedback/logic/i;->f:Lcom/huawei/feedback/bean/f;

    .line 53
    const/4 v0, 0x0

    iput v0, p0, Lcom/huawei/feedback/logic/i;->g:I

    .line 58
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/feedback/logic/i;->a:Lcom/huawei/lcagent/client/LogCollectManager;

    .line 60
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/feedback/logic/i;->b:Lcom/huawei/lcagent/client/LogMetricInfo;

    .line 66
    const/4 v0, 0x1

    iput v0, p0, Lcom/huawei/feedback/logic/i;->i:I

    .line 73
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/feedback/logic/i;->k:Z

    .line 84
    new-instance v0, Lcom/huawei/feedback/logic/j;

    invoke-direct {v0, p0}, Lcom/huawei/feedback/logic/j;-><init>(Lcom/huawei/feedback/logic/i;)V

    iput-object v0, p0, Lcom/huawei/feedback/logic/i;->q:Landroid/os/Handler;

    .line 151
    iput-object p1, p0, Lcom/huawei/feedback/logic/i;->d:Lcom/huawei/feedback/bean/d;

    .line 152
    iput p2, p0, Lcom/huawei/feedback/logic/i;->g:I

    .line 153
    iput-object p3, p0, Lcom/huawei/feedback/logic/i;->a:Lcom/huawei/lcagent/client/LogCollectManager;

    .line 154
    iput-object p4, p0, Lcom/huawei/feedback/logic/i;->b:Lcom/huawei/lcagent/client/LogMetricInfo;

    .line 155
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/huawei/feedback/logic/i;->k:Z

    .line 156
    iput-object p5, p0, Lcom/huawei/feedback/logic/i;->h:Landroid/content/Context;

    .line 157
    iput-object p6, p0, Lcom/huawei/feedback/logic/i;->l:Ljava/lang/String;

    .line 158
    iput-object p7, p0, Lcom/huawei/feedback/logic/i;->m:Ljava/lang/String;

    .line 159
    iput-object p8, p0, Lcom/huawei/feedback/logic/i;->n:Ljava/lang/String;

    .line 160
    iput-object p9, p0, Lcom/huawei/feedback/logic/i;->o:Ljava/lang/String;

    .line 161
    iput-object p10, p0, Lcom/huawei/feedback/logic/i;->j:Landroid/os/Handler;

    .line 162
    return-void
.end method

.method public constructor <init>(Lcom/huawei/feedback/bean/d;ILcom/huawei/lcagent/client/LogCollectManager;Lcom/huawei/lcagent/client/LogMetricInfo;Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Landroid/os/Handler;Ljava/lang/String;)V
    .locals 1

    .line 170
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 38
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/feedback/logic/i;->d:Lcom/huawei/feedback/bean/d;

    .line 43
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/feedback/logic/i;->e:Z

    .line 48
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/feedback/logic/i;->f:Lcom/huawei/feedback/bean/f;

    .line 53
    const/4 v0, 0x0

    iput v0, p0, Lcom/huawei/feedback/logic/i;->g:I

    .line 58
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/feedback/logic/i;->a:Lcom/huawei/lcagent/client/LogCollectManager;

    .line 60
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/feedback/logic/i;->b:Lcom/huawei/lcagent/client/LogMetricInfo;

    .line 66
    const/4 v0, 0x1

    iput v0, p0, Lcom/huawei/feedback/logic/i;->i:I

    .line 73
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/feedback/logic/i;->k:Z

    .line 84
    new-instance v0, Lcom/huawei/feedback/logic/j;

    invoke-direct {v0, p0}, Lcom/huawei/feedback/logic/j;-><init>(Lcom/huawei/feedback/logic/i;)V

    iput-object v0, p0, Lcom/huawei/feedback/logic/i;->q:Landroid/os/Handler;

    .line 171
    iput-object p1, p0, Lcom/huawei/feedback/logic/i;->d:Lcom/huawei/feedback/bean/d;

    .line 172
    iput p2, p0, Lcom/huawei/feedback/logic/i;->g:I

    .line 173
    iput-object p3, p0, Lcom/huawei/feedback/logic/i;->a:Lcom/huawei/lcagent/client/LogCollectManager;

    .line 174
    iput-object p4, p0, Lcom/huawei/feedback/logic/i;->b:Lcom/huawei/lcagent/client/LogMetricInfo;

    .line 175
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/huawei/feedback/logic/i;->k:Z

    .line 176
    iput-object p5, p0, Lcom/huawei/feedback/logic/i;->h:Landroid/content/Context;

    .line 177
    iput-object p6, p0, Lcom/huawei/feedback/logic/i;->l:Ljava/lang/String;

    .line 178
    iput-object p7, p0, Lcom/huawei/feedback/logic/i;->m:Ljava/lang/String;

    .line 179
    iput-object p8, p0, Lcom/huawei/feedback/logic/i;->n:Ljava/lang/String;

    .line 180
    iput-object p9, p0, Lcom/huawei/feedback/logic/i;->o:Ljava/lang/String;

    .line 181
    iput-object p10, p0, Lcom/huawei/feedback/logic/i;->j:Landroid/os/Handler;

    .line 182
    iput-object p11, p0, Lcom/huawei/feedback/logic/i;->p:Ljava/lang/String;

    .line 183
    return-void
.end method

.method public constructor <init>(Lcom/huawei/feedback/bean/f;)V
    .locals 1

    .line 141
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 38
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/feedback/logic/i;->d:Lcom/huawei/feedback/bean/d;

    .line 43
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/feedback/logic/i;->e:Z

    .line 48
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/feedback/logic/i;->f:Lcom/huawei/feedback/bean/f;

    .line 53
    const/4 v0, 0x0

    iput v0, p0, Lcom/huawei/feedback/logic/i;->g:I

    .line 58
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/feedback/logic/i;->a:Lcom/huawei/lcagent/client/LogCollectManager;

    .line 60
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/feedback/logic/i;->b:Lcom/huawei/lcagent/client/LogMetricInfo;

    .line 66
    const/4 v0, 0x1

    iput v0, p0, Lcom/huawei/feedback/logic/i;->i:I

    .line 73
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/feedback/logic/i;->k:Z

    .line 84
    new-instance v0, Lcom/huawei/feedback/logic/j;

    invoke-direct {v0, p0}, Lcom/huawei/feedback/logic/j;-><init>(Lcom/huawei/feedback/logic/i;)V

    iput-object v0, p0, Lcom/huawei/feedback/logic/i;->q:Landroid/os/Handler;

    .line 142
    iput-object p1, p0, Lcom/huawei/feedback/logic/i;->f:Lcom/huawei/feedback/bean/f;

    .line 143
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/huawei/feedback/logic/i;->e:Z

    .line 144
    return-void
.end method

.method static synthetic a(Lcom/huawei/feedback/logic/i;)Landroid/content/Context;
    .locals 1

    .line 29
    iget-object v0, p0, Lcom/huawei/feedback/logic/i;->h:Landroid/content/Context;

    return-object v0
.end method

.method private a()V
    .locals 36

    .line 216
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/feedback/logic/i;->d:Lcom/huawei/feedback/bean/d;

    invoke-virtual {v0}, Lcom/huawei/feedback/bean/d;->b()Ljava/util/List;

    move-result-object v14

    .line 218
    new-instance v15, Ljava/lang/StringBuilder;

    invoke-direct {v15}, Ljava/lang/StringBuilder;-><init>()V

    .line 219
    new-instance v16, Ljava/lang/StringBuilder;

    invoke-direct/range {v16 .. v16}, Ljava/lang/StringBuilder;-><init>()V

    .line 221
    new-instance v17, Ljava/lang/StringBuilder;

    invoke-direct/range {v17 .. v17}, Ljava/lang/StringBuilder;-><init>()V

    .line 222
    invoke-interface {v14}, Ljava/util/List;->size()I

    move-result v18

    .line 223
    if-lez v18, :cond_4

    .line 224
    const/16 v19, 0x0

    :goto_0
    move/from16 v0, v19

    move/from16 v1, v18

    if-ge v0, v1, :cond_1

    .line 225
    move/from16 v0, v19

    invoke-interface {v14, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object/from16 v20, v0

    check-cast v20, Lcom/huawei/feedback/logic/c;

    .line 226
    const/4 v0, 0x0

    move-object/from16 v1, v20

    if-eq v0, v1, :cond_0

    .line 227
    invoke-virtual/range {v20 .. v20}, Lcom/huawei/feedback/logic/c;->a()Ljava/lang/String;

    move-result-object v21

    .line 228
    invoke-virtual/range {v20 .. v20}, Lcom/huawei/feedback/logic/c;->b()Ljava/lang/String;

    move-result-object v22

    .line 229
    invoke-static/range {v21 .. v21}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 230
    move-object/from16 v0, v17

    move-object/from16 v1, v21

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 231
    const-string v0, "|"

    move-object/from16 v1, v17

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 233
    move-object/from16 v0, v21

    move/from16 v1, v19

    invoke-static {v0, v1}, Lcom/huawei/feedback/logic/d;->a(Ljava/lang/String;I)Ljava/lang/String;

    move-result-object v23

    .line 234
    move-object/from16 v0, v23

    invoke-virtual {v15, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 235
    const-string v0, "|"

    invoke-virtual {v15, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 236
    move-object/from16 v0, v16

    move-object/from16 v1, v22

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 237
    const-string v0, "|"

    move-object/from16 v1, v16

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 224
    :cond_0
    add-int/lit8 v19, v19, 0x1

    goto :goto_0

    .line 241
    :cond_1
    invoke-virtual {v15}, Ljava/lang/StringBuilder;->length()I

    move-result v0

    add-int/lit8 v19, v0, -0x1

    .line 242
    invoke-virtual/range {v16 .. v16}, Ljava/lang/StringBuilder;->length()I

    move-result v0

    add-int/lit8 v20, v0, -0x1

    .line 243
    invoke-virtual {v15}, Ljava/lang/StringBuilder;->length()I

    move-result v0

    add-int/lit8 v21, v0, -0x1

    .line 244
    if-ltz v19, :cond_2

    .line 245
    invoke-virtual {v15}, Ljava/lang/StringBuilder;->length()I

    move-result v0

    add-int/lit8 v0, v0, -0x1

    invoke-virtual {v15, v0}, Ljava/lang/StringBuilder;->deleteCharAt(I)Ljava/lang/StringBuilder;

    .line 247
    :cond_2
    if-ltz v20, :cond_3

    .line 248
    invoke-virtual/range {v16 .. v16}, Ljava/lang/StringBuilder;->length()I

    move-result v0

    add-int/lit8 v0, v0, -0x1

    move-object/from16 v1, v16

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->deleteCharAt(I)Ljava/lang/StringBuilder;

    .line 250
    :cond_3
    if-ltz v21, :cond_4

    .line 251
    invoke-virtual/range {v17 .. v17}, Ljava/lang/StringBuilder;->length()I

    move-result v0

    add-int/lit8 v0, v0, -0x1

    move-object/from16 v1, v17

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->deleteCharAt(I)Ljava/lang/StringBuilder;

    .line 259
    :cond_4
    new-instance v19, Ljava/util/Date;

    invoke-direct/range {v19 .. v19}, Ljava/util/Date;-><init>()V

    .line 263
    new-instance v0, Ljava/text/SimpleDateFormat;

    const-string v1, "MMddHHmmssSSS"

    invoke-direct {v0, v1}, Ljava/text/SimpleDateFormat;-><init>(Ljava/lang/String;)V

    move-object/from16 v20, v0

    .line 264
    move-object/from16 v0, v20

    move-object/from16 v1, v19

    invoke-virtual {v0, v1}, Ljava/text/SimpleDateFormat;->format(Ljava/util/Date;)Ljava/lang/String;

    move-result-object v21

    .line 265
    invoke-static/range {v21 .. v21}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    move-result-wide v22

    .line 269
    const/16 v24, 0x0

    .line 270
    new-instance v25, Lcom/huawei/feedback/bean/f;

    invoke-direct/range {v25 .. v25}, Lcom/huawei/feedback/bean/f;-><init>()V

    .line 275
    invoke-static {}, Lcom/huawei/feedback/d;->a()Z

    move-result v0

    if-nez v0, :cond_5

    .line 277
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/feedback/logic/i;->h:Landroid/content/Context;

    const/4 v1, 0x0

    const/4 v2, 0x0

    invoke-static {v0, v1, v2}, Lcom/huawei/feedback/logic/g;->a(Landroid/content/Context;ILandroid/content/ContentValues;)V

    .line 286
    :cond_5
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/feedback/logic/i;->d:Lcom/huawei/feedback/bean/d;

    invoke-virtual {v0}, Lcom/huawei/feedback/bean/d;->o()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_6

    .line 287
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/feedback/logic/i;->d:Lcom/huawei/feedback/bean/d;

    invoke-virtual {v0}, Lcom/huawei/feedback/bean/d;->o()Ljava/lang/String;

    move-result-object v0

    move-object/from16 v1, v25

    invoke-virtual {v1, v0}, Lcom/huawei/feedback/bean/f;->j(Ljava/lang/String;)V

    goto :goto_1

    .line 289
    :cond_6
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/feedback/logic/i;->h:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    move-object/from16 v1, p0

    iget-object v1, v1, Lcom/huawei/feedback/logic/i;->h:Landroid/content/Context;

    const-string v2, "feedback_cloud_service"

    .line 290
    invoke-static {v1, v2}, Lcom/huawei/feedback/f;->b(Landroid/content/Context;Ljava/lang/String;)I

    move-result v1

    .line 289
    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v0

    move-object/from16 v1, v25

    invoke-virtual {v1, v0}, Lcom/huawei/feedback/bean/f;->j(Ljava/lang/String;)V

    .line 294
    :goto_1
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/feedback/logic/i;->d:Lcom/huawei/feedback/bean/d;

    invoke-virtual {v0}, Lcom/huawei/feedback/bean/d;->h()Ljava/lang/String;

    move-result-object v0

    move-object/from16 v1, v25

    invoke-virtual {v1, v0}, Lcom/huawei/feedback/bean/f;->l(Ljava/lang/String;)V

    .line 305
    invoke-virtual/range {v17 .. v17}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    move-object/from16 v1, v25

    invoke-virtual {v1, v0}, Lcom/huawei/feedback/bean/f;->m(Ljava/lang/String;)V

    .line 306
    invoke-virtual/range {v16 .. v16}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    move-object/from16 v1, v25

    invoke-virtual {v1, v0}, Lcom/huawei/feedback/bean/f;->o(Ljava/lang/String;)V

    .line 308
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/feedback/logic/i;->d:Lcom/huawei/feedback/bean/d;

    invoke-virtual {v0}, Lcom/huawei/feedback/bean/d;->n()I

    move-result v0

    invoke-static {v0}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v0

    move-object/from16 v1, v25

    invoke-virtual {v1, v0}, Lcom/huawei/feedback/bean/f;->p(Ljava/lang/String;)V

    .line 309
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/feedback/logic/i;->d:Lcom/huawei/feedback/bean/d;

    invoke-virtual {v0}, Lcom/huawei/feedback/bean/d;->p()Ljava/lang/String;

    move-result-object v0

    move-object/from16 v1, v25

    invoke-virtual {v1, v0}, Lcom/huawei/feedback/bean/f;->g(Ljava/lang/String;)V

    .line 310
    move-object/from16 v0, v25

    const/4 v1, 0x4

    invoke-virtual {v0, v1}, Lcom/huawei/feedback/bean/f;->b(I)V

    .line 312
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/feedback/logic/i;->d:Lcom/huawei/feedback/bean/d;

    invoke-virtual {v0}, Lcom/huawei/feedback/bean/d;->o()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_7

    .line 313
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/feedback/logic/i;->d:Lcom/huawei/feedback/bean/d;

    invoke-virtual {v0}, Lcom/huawei/feedback/bean/d;->o()Ljava/lang/String;

    move-result-object v0

    move-object/from16 v1, v25

    invoke-virtual {v1, v0}, Lcom/huawei/feedback/bean/f;->q(Ljava/lang/String;)V

    .line 315
    :cond_7
    invoke-static/range {v22 .. v23}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object v0

    move-object/from16 v1, v25

    invoke-virtual {v1, v0}, Lcom/huawei/feedback/bean/f;->f(Ljava/lang/String;)V

    .line 316
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/feedback/logic/i;->o:Ljava/lang/String;

    move-object/from16 v1, v25

    invoke-virtual {v1, v0}, Lcom/huawei/feedback/bean/f;->e(Ljava/lang/String;)V

    .line 317
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/feedback/logic/i;->d:Lcom/huawei/feedback/bean/d;

    invoke-virtual {v0}, Lcom/huawei/feedback/bean/d;->k()Z

    move-result v0

    move-object/from16 v1, v25

    invoke-virtual {v1, v0}, Lcom/huawei/feedback/bean/f;->a(Z)V

    .line 318
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/feedback/logic/i;->d:Lcom/huawei/feedback/bean/d;

    invoke-virtual {v0}, Lcom/huawei/feedback/bean/d;->l()Z

    move-result v0

    move-object/from16 v1, v25

    invoke-virtual {v1, v0}, Lcom/huawei/feedback/bean/f;->b(Z)V

    .line 319
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/feedback/logic/i;->d:Lcom/huawei/feedback/bean/d;

    invoke-virtual {v0}, Lcom/huawei/feedback/bean/d;->m()Ljava/lang/String;

    move-result-object v0

    move-object/from16 v1, v25

    invoke-virtual {v1, v0}, Lcom/huawei/feedback/bean/f;->b(Ljava/lang/String;)V

    .line 320
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/feedback/logic/i;->d:Lcom/huawei/feedback/bean/d;

    invoke-virtual {v0}, Lcom/huawei/feedback/bean/d;->c()I

    move-result v0

    move-object/from16 v1, v25

    invoke-virtual {v1, v0}, Lcom/huawei/feedback/bean/f;->e(I)V

    .line 321
    new-instance v0, Ljava/text/SimpleDateFormat;

    const-string v1, "yyyyMMddHHmmss"

    invoke-direct {v0, v1}, Ljava/text/SimpleDateFormat;-><init>(Ljava/lang/String;)V

    move-object/from16 v26, v0

    .line 322
    new-instance v0, Ljava/util/Date;

    invoke-direct {v0}, Ljava/util/Date;-><init>()V

    move-object/from16 v1, v26

    invoke-virtual {v1, v0}, Ljava/text/SimpleDateFormat;->format(Ljava/util/Date;)Ljava/lang/String;

    move-result-object v27

    .line 323
    move-object/from16 v0, v25

    move-object/from16 v1, v27

    invoke-virtual {v0, v1}, Lcom/huawei/feedback/bean/f;->n(Ljava/lang/String;)V

    .line 324
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/feedback/logic/i;->p:Ljava/lang/String;

    move-object/from16 v1, v25

    invoke-virtual {v1, v0}, Lcom/huawei/feedback/bean/f;->a(Ljava/lang/String;)V

    .line 325
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/feedback/logic/i;->d:Lcom/huawei/feedback/bean/d;

    invoke-virtual {v0}, Lcom/huawei/feedback/bean/d;->c()I

    move-result v0

    if-nez v0, :cond_9

    .line 328
    invoke-static {}, Lcom/huawei/feedback/logic/f;->a()Ljava/util/List;

    move-result-object v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_8

    invoke-static {}, Lcom/huawei/feedback/logic/f;->a()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    const/16 v1, 0x1f4

    if-ge v0, v1, :cond_8

    .line 329
    invoke-static/range {v25 .. v25}, Lcom/huawei/feedback/logic/f;->a(Lcom/huawei/feedback/bean/f;)J

    move-result-wide v28

    .line 330
    move-wide/from16 v0, v28

    long-to-int v0, v0

    move-object/from16 v1, v25

    invoke-virtual {v1, v0}, Lcom/huawei/feedback/bean/f;->e(I)V

    .line 331
    goto :goto_2

    .line 332
    :cond_8
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/feedback/logic/i;->q:Landroid/os/Handler;

    const/4 v1, 0x3

    invoke-virtual {v0, v1}, Landroid/os/Handler;->sendEmptyMessage(I)Z

    goto :goto_2

    .line 336
    :cond_9
    invoke-static/range {v25 .. v25}, Lcom/huawei/feedback/logic/f;->c(Lcom/huawei/feedback/bean/f;)V

    .line 339
    :goto_2
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/feedback/logic/i;->d:Lcom/huawei/feedback/bean/d;

    move-object/from16 v1, p0

    iget v1, v1, Lcom/huawei/feedback/logic/i;->g:I

    invoke-virtual/range {v17 .. v17}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v15}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual/range {v16 .. v16}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    move-object/from16 v5, p0

    iget-object v5, v5, Lcom/huawei/feedback/logic/i;->b:Lcom/huawei/lcagent/client/LogMetricInfo;

    move-object/from16 v6, p0

    iget-object v6, v6, Lcom/huawei/feedback/logic/i;->a:Lcom/huawei/lcagent/client/LogCollectManager;

    move-object/from16 v7, p0

    iget-boolean v7, v7, Lcom/huawei/feedback/logic/i;->k:Z

    move-object/from16 v8, p0

    iget-object v8, v8, Lcom/huawei/feedback/logic/i;->q:Landroid/os/Handler;

    move-object/from16 v9, p0

    iget-object v9, v9, Lcom/huawei/feedback/logic/i;->m:Ljava/lang/String;

    move-object/from16 v10, p0

    iget-object v10, v10, Lcom/huawei/feedback/logic/i;->l:Ljava/lang/String;

    move-object/from16 v11, p0

    iget-object v11, v11, Lcom/huawei/feedback/logic/i;->n:Ljava/lang/String;

    move-object/from16 v12, v25

    move-object/from16 v13, p0

    iget v13, v13, Lcom/huawei/feedback/logic/i;->i:I

    invoke-static/range {v0 .. v13}, Lcom/huawei/feedback/logic/b;->a(Lcom/huawei/feedback/bean/d;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/huawei/lcagent/client/LogMetricInfo;Lcom/huawei/lcagent/client/LogCollectManager;ZLandroid/os/Handler;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/huawei/feedback/bean/f;I)Z

    move-result v24

    .line 342
    const-string v0, "FeedbackSubmitTask"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    move/from16 v2, v24

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, ""

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/huawei/phoneserviceuni/common/e/c;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 344
    invoke-virtual {v15}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "\\|"

    invoke-virtual {v0, v1}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v28

    .line 345
    move-object/from16 v0, v28

    array-length v0, v0

    move/from16 v29, v0

    .line 346
    if-lez v29, :cond_b

    .line 347
    const/16 v30, 0x0

    :goto_3
    move/from16 v0, v30

    move/from16 v1, v29

    if-ge v0, v1, :cond_b

    .line 348
    aget-object v31, v28, v30

    .line 350
    const/4 v0, 0x0

    move-object/from16 v1, v31

    if-eq v0, v1, :cond_a

    const-string v0, "/phoneservice/image"

    move-object/from16 v1, v31

    invoke-virtual {v1, v0}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_a

    .line 351
    invoke-static/range {v31 .. v31}, Lcom/huawei/phoneserviceuni/common/e/b;->a(Ljava/lang/String;)Z

    .line 347
    :cond_a
    add-int/lit8 v30, v30, 0x1

    goto :goto_3

    .line 356
    :cond_b
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/feedback/logic/i;->l:Ljava/lang/String;

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_e

    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/feedback/logic/i;->l:Ljava/lang/String;

    const-string v1, "1"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_e

    move-object/from16 v0, p0

    iget-boolean v0, v0, Lcom/huawei/feedback/logic/i;->k:Z

    if-eqz v0, :cond_e

    if-eqz v24, :cond_e

    .line 361
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/feedback/logic/i;->h:Landroid/content/Context;

    invoke-static {v0}, Lcom/huawei/feedback/e;->i(Landroid/content/Context;)Z

    move-result v0

    if-nez v0, :cond_c

    .line 362
    new-instance v0, Landroid/content/Intent;

    move-object/from16 v1, p0

    iget-object v1, v1, Lcom/huawei/feedback/logic/i;->h:Landroid/content/Context;

    const-class v2, Lcom/huawei/feedback/component/ProgressService;

    invoke-direct {v0, v1, v2}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    move-object/from16 v30, v0

    .line 363
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/feedback/logic/i;->h:Landroid/content/Context;

    const-string v1, "com.huawei.feedback.component.ProgressService"

    move-object/from16 v2, v30

    invoke-virtual {v2, v0, v1}, Landroid/content/Intent;->setClassName(Landroid/content/Context;Ljava/lang/String;)Landroid/content/Intent;

    .line 364
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/feedback/logic/i;->h:Landroid/content/Context;

    move-object/from16 v1, v30

    invoke-virtual {v0, v1}, Landroid/content/Context;->startService(Landroid/content/Intent;)Landroid/content/ComponentName;

    .line 369
    :cond_c
    const-string v0, "FeedbackSubmitTask"

    const-string v1, "\u5f00\u59cb\u65e5\u5fd7\u4e0a\u4f20"

    invoke-static {v0, v1}, Lcom/huawei/phoneserviceuni/common/e/c;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 371
    new-instance v0, Landroid/content/Intent;

    const-string v1, "com.huawei.lcagent.UPLOAD_REQUEST"

    invoke-direct {v0, v1}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    move-object/from16 v30, v0

    .line 373
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/feedback/logic/i;->h:Landroid/content/Context;

    const-string v1, "com.huawei.logupload.LogUploadService"

    move-object/from16 v2, v30

    invoke-virtual {v2, v0, v1}, Landroid/content/Intent;->setClassName(Landroid/content/Context;Ljava/lang/String;)Landroid/content/Intent;

    .line 374
    const-string v0, "alert_visible"

    move-object/from16 v1, v30

    const/4 v2, 0x0

    invoke-virtual {v1, v0, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Z)Landroid/content/Intent;

    .line 375
    const-string v0, "filepath"

    move-object/from16 v1, p0

    iget-object v1, v1, Lcom/huawei/feedback/logic/i;->o:Ljava/lang/String;

    move-object/from16 v2, v30

    invoke-virtual {v2, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 376
    const-string v0, "id"

    move-object/from16 v1, v30

    move-wide/from16 v2, v22

    invoke-virtual {v1, v0, v2, v3}, Landroid/content/Intent;->putExtra(Ljava/lang/String;J)Landroid/content/Intent;

    .line 378
    const-string v0, "usertype"

    move-object/from16 v1, v30

    const/4 v2, 0x5

    invoke-virtual {v1, v0, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    .line 386
    const/16 v34, 0x7

    .line 387
    const/16 v31, 0x1

    .line 388
    const/16 v32, 0x0

    .line 395
    const-string v0, "encrypt"

    move-object/from16 v1, v30

    move/from16 v2, v31

    invoke-virtual {v1, v0, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Z)Landroid/content/Intent;

    .line 396
    const-string v0, "privacy"

    move-object/from16 v1, v30

    move/from16 v2, v32

    invoke-virtual {v1, v0, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Z)Landroid/content/Intent;

    .line 397
    const-string v0, "channelId"

    move-object/from16 v1, v30

    move/from16 v2, v34

    invoke-virtual {v1, v0, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    .line 398
    new-instance v0, Ljava/io/File;

    move-object/from16 v1, p0

    iget-object v1, v1, Lcom/huawei/feedback/logic/i;->o:Ljava/lang/String;

    invoke-direct {v0, v1}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    move-object/from16 v35, v0

    .line 399
    const-string v0, "size"

    invoke-virtual/range {v35 .. v35}, Ljava/io/File;->length()J

    move-result-wide v1

    move-object/from16 v3, v30

    invoke-virtual {v3, v0, v1, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;J)Landroid/content/Intent;

    .line 400
    const-string v0, "feedBackPackageName"

    move-object/from16 v1, p0

    iget-object v1, v1, Lcom/huawei/feedback/logic/i;->h:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v1

    move-object/from16 v2, v30

    invoke-virtual {v2, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 401
    const-string v0, "feedBackClassName"

    const-class v1, Lcom/huawei/feedback/logic/i;

    invoke-virtual {v1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v1

    move-object/from16 v2, v30

    invoke-virtual {v2, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 403
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/feedback/logic/i;->h:Landroid/content/Context;

    invoke-static {v0}, Lcom/huawei/feedback/e;->g(Landroid/content/Context;)I

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_d

    .line 404
    const/16 v33, 0x1

    goto :goto_4

    .line 407
    :cond_d
    const/16 v33, 0x7

    .line 409
    :goto_4
    const-string v0, "flags"

    move-object/from16 v1, v30

    move/from16 v2, v33

    invoke-virtual {v1, v0, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    .line 410
    const-string v0, "encryptKey"

    move-object/from16 v1, p0

    iget-object v1, v1, Lcom/huawei/feedback/logic/i;->p:Ljava/lang/String;

    move-object/from16 v2, v30

    invoke-virtual {v2, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 412
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/feedback/logic/i;->h:Landroid/content/Context;

    move-object/from16 v1, v30

    invoke-virtual {v0, v1}, Landroid/content/Context;->startService(Landroid/content/Intent;)Landroid/content/ComponentName;

    .line 414
    goto :goto_5

    .line 420
    :cond_e
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/feedback/logic/i;->l:Ljava/lang/String;

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_f

    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/feedback/logic/i;->l:Ljava/lang/String;

    const-string v1, "0"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_10

    .line 421
    :cond_f
    invoke-static {}, Lcom/huawei/feedback/d;->a()Z

    move-result v0

    if-eqz v0, :cond_13

    .line 422
    :cond_10
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/feedback/logic/i;->d:Lcom/huawei/feedback/bean/d;

    invoke-virtual {v0}, Lcom/huawei/feedback/bean/d;->g()I

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_13

    .line 423
    new-instance v0, Ljava/io/File;

    move-object/from16 v1, p0

    iget-object v1, v1, Lcom/huawei/feedback/logic/i;->d:Lcom/huawei/feedback/bean/d;

    invoke-virtual {v1}, Lcom/huawei/feedback/bean/d;->q()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    move-object/from16 v30, v0

    .line 424
    invoke-virtual/range {v30 .. v30}, Ljava/io/File;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_12

    .line 425
    invoke-virtual/range {v30 .. v30}, Ljava/io/File;->exists()Z

    move-result v0

    if-eqz v0, :cond_11

    invoke-virtual/range {v30 .. v30}, Ljava/io/File;->delete()Z

    move-result v0

    if-eqz v0, :cond_11

    .line 427
    const-string v0, "FeedbackSubmitTask"

    const-string v1, "package file delete sccess!"

    invoke-static {v0, v1}, Lcom/huawei/phoneserviceuni/common/e/c;->b(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_5

    .line 430
    :cond_11
    const-string v0, "FeedbackSubmitTask"

    const-string v1, "file not exist or error! file delete fail!"

    invoke-static {v0, v1}, Lcom/huawei/phoneserviceuni/common/e/c;->b(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_5

    .line 434
    :cond_12
    const-string v0, "FeedbackSubmitTask"

    const-string v1, "file path is empty or null"

    invoke-static {v0, v1}, Lcom/huawei/phoneserviceuni/common/e/c;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 444
    :cond_13
    :goto_5
    return-void
.end method

.method private b()V
    .locals 3

    .line 450
    iget-object v0, p0, Lcom/huawei/feedback/logic/i;->f:Lcom/huawei/feedback/bean/f;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 451
    iget-object v0, p0, Lcom/huawei/feedback/logic/i;->f:Lcom/huawei/feedback/bean/f;

    invoke-virtual {v0}, Lcom/huawei/feedback/bean/f;->s()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/huawei/feedback/logic/d;->a(Ljava/lang/String;I)Ljava/lang/String;

    move-result-object v2

    .line 452
    iget-object v0, p0, Lcom/huawei/feedback/logic/i;->f:Lcom/huawei/feedback/bean/f;

    invoke-static {v0, v2}, Lcom/huawei/feedback/logic/b;->a(Lcom/huawei/feedback/bean/f;Ljava/lang/String;)V

    .line 453
    const/4 v0, 0x0

    if-eq v0, v2, :cond_0

    iget-object v0, p0, Lcom/huawei/feedback/logic/i;->f:Lcom/huawei/feedback/bean/f;

    invoke-virtual {v0}, Lcom/huawei/feedback/bean/f;->s()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 455
    invoke-static {v2}, Lcom/huawei/phoneserviceuni/common/e/b;->a(Ljava/lang/String;)Z

    .line 458
    :cond_0
    return-void
.end method


# virtual methods
.method public run()V
    .locals 1

    .line 190
    iget-boolean v0, p0, Lcom/huawei/feedback/logic/i;->e:Z

    if-eqz v0, :cond_0

    .line 191
    invoke-direct {p0}, Lcom/huawei/feedback/logic/i;->b()V

    goto :goto_0

    .line 193
    :cond_0
    invoke-direct {p0}, Lcom/huawei/feedback/logic/i;->a()V

    .line 196
    :goto_0
    return-void
.end method
