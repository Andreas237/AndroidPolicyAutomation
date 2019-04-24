.class public Lo/dkr;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static a:Z

.field private static b:I

.field private static c:I

.field private static d:Z

.field private static e:I


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 47
    const/4 v0, 0x0

    sput-boolean v0, Lo/dkr;->d:Z

    .line 49
    const/4 v0, 0x0

    sput-boolean v0, Lo/dkr;->a:Z

    .line 51
    const/16 v0, 0x1e

    sput v0, Lo/dkr;->c:I

    .line 53
    const/16 v0, 0x1e

    sput v0, Lo/dkr;->e:I

    .line 55
    const/16 v0, 0xf0

    sput v0, Lo/dkr;->b:I

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 24
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static a(Lo/dag;Lcom/huawei/hwcommonmodel/datatypes/DataPromptData;)Ljava/lang/String;
    .locals 14

    .line 296
    const-string v6, ""

    .line 297
    const-string v7, ""

    .line 298
    const-string v8, ""

    .line 299
    const-string v9, ""

    .line 300
    invoke-virtual {p0}, Lo/dag;->i()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 301
    const-string v10, ""

    .line 302
    const-string v11, ""

    .line 303
    const-string v12, ""

    .line 304
    invoke-virtual {p0}, Lo/dag;->f()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 305
    const/4 v13, 0x1

    .line 307
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const/16 v1, 0xf

    invoke-static {v1}, Lo/czx;->d(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    .line 308
    invoke-static {v13}, Lo/czx;->d(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    .line 309
    invoke-virtual {p1}, Lcom/huawei/hwcommonmodel/datatypes/DataPromptData;->getText_format()I

    move-result v1

    invoke-static {v1}, Lo/czx;->d(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v7

    .line 311
    invoke-virtual {p0}, Lo/dag;->g()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 312
    invoke-virtual {p1}, Lcom/huawei/hwcommonmodel/datatypes/DataPromptData;->getText_format()I

    move-result v0

    invoke-virtual {p1}, Lcom/huawei/hwcommonmodel/datatypes/DataPromptData;->getText_content()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1, v10, v12}, Lo/dkr;->d(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v8

    .line 317
    :cond_0
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 318
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v0

    div-int/lit8 v0, v0, 0x2

    .line 317
    invoke-static {v0}, Lo/dkr;->c(I)Ljava/lang/String;

    move-result-object v11

    .line 319
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const/16 v1, 0x8d

    invoke-static {v1}, Lo/czx;->d(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v6

    .line 322
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const/16 v1, 0x8c

    invoke-static {v1}, Lo/czx;->d(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    .line 323
    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result v1

    div-int/lit8 v1, v1, 0x2

    add-int/lit8 v1, v1, 0x2

    .line 322
    invoke-static {v1}, Lo/dkr;->c(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v9

    .line 327
    :cond_1
    move-object v0, p0

    move-object v1, p1

    move-object v2, v6

    move-object v3, v7

    move-object v4, v8

    move-object v5, v9

    invoke-static/range {v0 .. v5}, Lo/dkr;->d(Lo/dag;Lcom/huawei/hwcommonmodel/datatypes/DataPromptData;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public static b(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/ArrayList;)Ljava/lang/String;
    .locals 18
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/ArrayList<Lo/dan;>;)Ljava/lang/String;"
        }
    .end annotation

    .line 176
    const/4 v0, 0x0

    move-object/from16 v1, p4

    if-eq v0, v1, :cond_8

    invoke-virtual/range {p4 .. p4}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-lez v0, :cond_8

    .line 177
    invoke-virtual/range {p4 .. p4}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v13

    :goto_0
    invoke-interface {v13}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_7

    invoke-interface {v13}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v14, v0

    check-cast v14, Lo/dan;

    .line 179
    invoke-virtual {v14}, Lo/dan;->c()I

    move-result v15

    .line 180
    const-string v0, "NotifySendUtil"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "notificationMsgToTLVS, textType = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v15}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 181
    const/4 v0, 0x5

    if-ne v15, v0, :cond_0

    sget-boolean v0, Lo/dkr;->d:Z

    if-nez v0, :cond_0

    .line 182
    goto :goto_0

    .line 185
    :cond_0
    const/4 v0, 0x6

    if-ne v15, v0, :cond_1

    sget-boolean v0, Lo/dkr;->a:Z

    if-nez v0, :cond_1

    .line 186
    goto :goto_0

    .line 191
    :cond_1
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const/16 v1, 0xe

    invoke-static {v1}, Lo/czx;->d(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const/4 v1, 0x1

    invoke-static {v1}, Lo/czx;->d(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v14}, Lo/dan;->c()I

    move-result v1

    invoke-static {v1}, Lo/czx;->d(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    .line 194
    invoke-virtual {v14}, Lo/dan;->d()I

    move-result v6

    .line 195
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const/16 v1, 0xf

    invoke-static {v1}, Lo/czx;->d(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const/4 v1, 0x1

    invoke-static {v1}, Lo/czx;->d(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-static {v6}, Lo/czx;->d(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v7

    .line 198
    const-string v16, "..."

    .line 200
    invoke-virtual {v14}, Lo/dan;->e()Ljava/lang/String;

    move-result-object v8

    .line 201
    const/4 v0, 0x0

    if-eq v0, v8, :cond_6

    .line 202
    const/4 v0, 0x2

    if-ne v0, v6, :cond_2

    .line 203
    invoke-virtual {v14}, Lo/dan;->e()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lo/czx;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p3

    .line 204
    invoke-static/range {v16 .. v16}, Lo/czx;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v16

    goto :goto_1

    .line 205
    :cond_2
    const/4 v0, 0x1

    if-ne v0, v6, :cond_3

    .line 206
    invoke-virtual {v14}, Lo/dan;->e()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lo/czx;->c(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p3

    .line 207
    invoke-static/range {v16 .. v16}, Lo/czx;->c(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v16

    goto :goto_1

    .line 208
    :cond_3
    const/4 v0, 0x3

    if-ne v0, v6, :cond_4

    .line 209
    invoke-virtual {v14}, Lo/dan;->e()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lo/czx;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p3

    .line 210
    invoke-static/range {v16 .. v16}, Lo/czx;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v16

    .line 213
    :cond_4
    :goto_1
    invoke-static/range {p3 .. p3}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_6

    .line 214
    const-string v0, "NotifySendUtil"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "notificationMsgToTLVS, text_contentL = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual/range {p3 .. p3}, Ljava/lang/String;->length()I

    move-result v3

    div-int/lit8 v3, v3, 0x2

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, ", mContentLength = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    sget v3, Lo/dkr;->b:I

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 215
    invoke-static {v14}, Lo/dkr;->e(Lo/dan;)I

    move-result v17

    .line 217
    invoke-virtual/range {p3 .. p3}, Ljava/lang/String;->length()I

    move-result v0

    div-int/lit8 v0, v0, 0x2

    move/from16 v1, v17

    if-le v0, v1, :cond_5

    .line 219
    add-int/lit8 v17, v17, -0x6

    .line 220
    mul-int/lit8 v0, v17, 0x2

    move-object/from16 v1, p3

    const/4 v2, 0x0

    invoke-virtual {v1, v2, v0}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object p3

    .line 221
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    move-object/from16 v1, p3

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    move-object/from16 v1, v16

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p3

    .line 222
    const-string v0, "NotifySendUtil"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "notificationMsgToTLVS, text_contentHex---------"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    move-object/from16 v3, p3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 224
    :cond_5
    invoke-virtual/range {p3 .. p3}, Ljava/lang/String;->length()I

    move-result v0

    div-int/lit8 v0, v0, 0x2

    invoke-static {v0}, Lo/dkr;->c(I)Ljava/lang/String;

    move-result-object v9

    .line 225
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const/16 v1, 0x10

    invoke-static {v1}, Lo/czx;->d(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    move-object/from16 v1, p3

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    .line 228
    :cond_6
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    move-object/from16 v1, p1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v0

    div-int/lit8 v0, v0, 0x2

    invoke-static {v0}, Lo/dkr;->c(I)Ljava/lang/String;

    move-result-object v10

    .line 229
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const/16 v1, 0x8d

    invoke-static {v1}, Lo/czx;->d(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v11

    .line 230
    move-object/from16 v0, p0

    invoke-virtual {v0, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    move-object/from16 v1, p1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 231
    goto/16 :goto_0

    .line 233
    :cond_7
    invoke-virtual/range {p0 .. p0}, Ljava/lang/StringBuilder;->length()I

    move-result v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_8

    .line 234
    invoke-virtual/range {p0 .. p0}, Ljava/lang/StringBuilder;->length()I

    move-result v0

    div-int/lit8 v0, v0, 0x2

    invoke-static {v0}, Lo/dkr;->c(I)Ljava/lang/String;

    move-result-object v12

    .line 236
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const/16 v1, 0x8c

    invoke-static {v1}, Lo/czx;->d(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    .line 239
    :cond_8
    const-string v0, "NotifySendUtil"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "notificationMsgToTLVS, text_listTlHex---------"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    move-object/from16 v3, p2

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 240
    return-object p2
.end method

.method private static c(I)Ljava/lang/String;
    .locals 4

    .line 256
    const/16 v0, 0x7f

    if-le p0, v0, :cond_0

    .line 257
    shr-int/lit8 v0, p0, 0x7

    add-int/lit16 v2, v0, 0x80

    .line 258
    and-int/lit8 v3, p0, 0x7f

    .line 259
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-static {v2}, Lo/czx;->d(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-static {v3}, Lo/czx;->d(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0

    .line 261
    :cond_0
    invoke-static {p0}, Lo/czx;->d(I)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public static d(Landroid/graphics/Bitmap;II)Landroid/graphics/Bitmap;
    .locals 18

    .line 65
    invoke-virtual/range {p0 .. p0}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v8

    .line 66
    invoke-virtual/range {p0 .. p0}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v9

    .line 67
    mul-int v0, v8, v9

    new-array v10, v0, [I

    .line 69
    move-object/from16 v0, p0

    move-object v1, v10

    move v3, v8

    move v6, v8

    move v7, v9

    const/4 v2, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    invoke-virtual/range {v0 .. v7}, Landroid/graphics/Bitmap;->getPixels([IIIIIII)V

    .line 70
    const/high16 v11, -0x1000000

    .line 71
    const/4 v12, 0x0

    :goto_0
    if-ge v12, v9, :cond_1

    .line 72
    const/4 v13, 0x0

    :goto_1
    if-ge v13, v8, :cond_0

    .line 73
    mul-int v0, v8, v12

    add-int/2addr v0, v13

    aget v14, v10, v0

    .line 76
    const/high16 v0, 0xff0000

    and-int/2addr v0, v14

    shr-int/lit8 v15, v0, 0x10

    .line 77
    const v0, 0xff00

    and-int/2addr v0, v14

    shr-int/lit8 v16, v0, 0x8

    .line 78
    and-int/lit16 v0, v14, 0xff

    move/from16 v17, v0

    .line 81
    int-to-double v0, v15

    const-wide v2, 0x3fd3333333333333L    # 0.3

    mul-double/2addr v0, v2

    move/from16 v2, v16

    int-to-double v2, v2

    const-wide v4, 0x3fe2e147ae147ae1L    # 0.59

    mul-double/2addr v2, v4

    add-double/2addr v0, v2

    move/from16 v2, v17

    int-to-double v2, v2

    const-wide v4, 0x3fbc28f5c28f5c29L    # 0.11

    mul-double/2addr v2, v4

    add-double/2addr v0, v2

    double-to-int v14, v0

    .line 82
    shl-int/lit8 v0, v14, 0x10

    or-int/2addr v0, v11

    shl-int/lit8 v1, v14, 0x8

    or-int/2addr v0, v1

    or-int/2addr v14, v0

    .line 83
    mul-int v0, v8, v12

    add-int/2addr v0, v13

    aput v14, v10, v0

    .line 72
    add-int/lit8 v13, v13, 0x1

    goto :goto_1

    .line 71
    :cond_0
    add-int/lit8 v12, v12, 0x1

    goto :goto_0

    .line 87
    :cond_1
    sget-object v0, Landroid/graphics/Bitmap$Config;->RGB_565:Landroid/graphics/Bitmap$Config;

    invoke-static {v8, v9, v0}, Landroid/graphics/Bitmap;->createBitmap(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;

    move-result-object v12

    .line 89
    move-object v0, v12

    move-object v1, v10

    move v3, v8

    move v6, v8

    move v7, v9

    const/4 v2, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    invoke-virtual/range {v0 .. v7}, Landroid/graphics/Bitmap;->setPixels([IIIIIII)V

    .line 90
    move/from16 v0, p1

    move/from16 v1, p2

    invoke-static {v12, v0, v1}, Landroid/media/ThumbnailUtils;->extractThumbnail(Landroid/graphics/Bitmap;II)Landroid/graphics/Bitmap;

    move-result-object v13

    .line 91
    return-object v13
.end method

.method public static d(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    .locals 3

    .line 272
    const/4 v0, 0x0

    if-eq v0, p1, :cond_3

    .line 273
    const/4 v0, 0x2

    if-ne v0, p0, :cond_0

    .line 274
    invoke-static {p1}, Lo/czx;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p3

    goto :goto_0

    .line 275
    :cond_0
    const/4 v0, 0x1

    if-ne v0, p0, :cond_1

    .line 276
    .line 277
    invoke-static {p1}, Lo/czx;->c(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p3

    .line 280
    :cond_1
    :goto_0
    const-string v0, ""

    invoke-virtual {p3, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_2

    .line 281
    .line 282
    invoke-virtual {p3}, Ljava/lang/String;->length()I

    move-result v0

    div-int/lit8 v0, v0, 0x2

    .line 281
    invoke-static {v0}, Lo/czx;->d(I)Ljava/lang/String;

    move-result-object p2

    goto :goto_1

    .line 284
    :cond_2
    const/4 v0, 0x0

    invoke-static {v0}, Lo/czx;->d(I)Ljava/lang/String;

    move-result-object p2

    .line 288
    :cond_3
    :goto_1
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 289
    const/16 v1, 0x10

    invoke-static {v1}, Lo/czx;->d(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    .line 292
    return-object v2
.end method

.method public static d(Lo/dag;Lcom/huawei/hwcommonmodel/datatypes/DataPromptData;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    .locals 15

    .line 332
    const-string v6, ""

    .line 333
    const-string v7, ""

    .line 334
    const-string v8, ""

    .line 335
    const-string v9, ""

    .line 336
    const-string v10, ""

    .line 337
    invoke-virtual {p0}, Lo/dag;->b()Z

    move-result v0

    if-eqz v0, :cond_4

    .line 339
    invoke-virtual {p0}, Lo/dag;->a()Z

    move-result v0

    if-eqz v0, :cond_3

    .line 341
    invoke-virtual {p0}, Lo/dag;->c()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 342
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 343
    const/16 v1, 0x8

    invoke-static {v1}, Lo/czx;->d(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    .line 344
    const/4 v1, 0x2

    invoke-static {v1}, Lo/czx;->d(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual/range {p1 .. p1}, Lcom/huawei/hwcommonmodel/datatypes/DataPromptData;->getDot_metrix_height()I

    move-result v1

    invoke-static {v1}, Lo/czx;->a(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v7

    .line 347
    :cond_0
    invoke-virtual {p0}, Lo/dag;->e()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 348
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 349
    const/16 v1, 0x9

    invoke-static {v1}, Lo/czx;->d(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    .line 350
    const/4 v1, 0x2

    invoke-static {v1}, Lo/czx;->d(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual/range {p1 .. p1}, Lcom/huawei/hwcommonmodel/datatypes/DataPromptData;->getDot_metrix_width()I

    move-result v1

    invoke-static {v1}, Lo/czx;->a(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v8

    .line 353
    :cond_1
    invoke-virtual {p0}, Lo/dag;->d()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 354
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 355
    const/16 v1, 0xa

    invoke-static {v1}, Lo/czx;->d(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    .line 356
    const/4 v1, 0x1

    invoke-static {v1}, Lo/czx;->d(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    .line 357
    invoke-virtual/range {p1 .. p1}, Lcom/huawei/hwcommonmodel/datatypes/DataPromptData;->getDot_metrix_color()I

    move-result v1

    invoke-static {v1}, Lo/czx;->d(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v9

    .line 359
    :cond_2
    invoke-virtual {p0}, Lo/dag;->a()Z

    move-result v0

    if-eqz v0, :cond_3

    .line 360
    invoke-virtual/range {p1 .. p1}, Lcom/huawei/hwcommonmodel/datatypes/DataPromptData;->getDot_metrix_data()[B

    move-result-object v0

    if-eqz v0, :cond_3

    .line 361
    .line 362
    invoke-virtual/range {p1 .. p1}, Lcom/huawei/hwcommonmodel/datatypes/DataPromptData;->getDot_metrix_data()[B

    move-result-object v0

    invoke-static {v0}, Lo/czx;->e([B)Ljava/lang/String;

    move-result-object v11

    .line 363
    .line 364
    invoke-virtual {v11}, Ljava/lang/String;->length()I

    move-result v0

    div-int/lit8 v0, v0, 0x2

    .line 363
    invoke-static {v0}, Lo/dkr;->c(I)Ljava/lang/String;

    move-result-object v12

    .line 365
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 366
    const/16 v1, 0xb

    invoke-static {v1}, Lo/czx;->d(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v10

    .line 371
    :cond_3
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 373
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v0

    div-int/lit8 v0, v0, 0x2

    .line 371
    invoke-static {v0}, Lo/dkr;->c(I)Ljava/lang/String;

    move-result-object v4

    .line 374
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 375
    const/16 v1, 0x86

    invoke-static {v1}, Lo/czx;->d(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v6

    .line 379
    :cond_4
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    move-object/from16 v1, p5

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    move-object/from16 v1, p2

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    move-object/from16 v1, p3

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    move-object/from16 v1, p4

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 386
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v0

    div-int/lit8 v0, v0, 0x2

    .line 379
    invoke-static {v0}, Lo/dkr;->c(I)Ljava/lang/String;

    move-result-object v11

    .line 387
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 388
    const/16 v1, 0x84

    invoke-static {v1}, Lo/czx;->d(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    .line 392
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const/4 v1, 0x2

    invoke-static {v1}, Lo/czx;->d(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    .line 393
    const/4 v1, 0x1

    invoke-static {v1}, Lo/czx;->d(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual/range {p1 .. p1}, Lcom/huawei/hwcommonmodel/datatypes/DataPromptData;->getPrompt_type()I

    move-result v1

    invoke-static {v1}, Lo/czx;->d(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v12

    .line 394
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const/4 v1, 0x3

    invoke-static {v1}, Lo/czx;->d(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    .line 395
    const/4 v1, 0x1

    invoke-static {v1}, Lo/czx;->d(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual/range {p1 .. p1}, Lcom/huawei/hwcommonmodel/datatypes/DataPromptData;->getMotor_enable()I

    move-result v1

    invoke-static {v1}, Lo/czx;->d(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v13

    .line 396
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    move-object/from16 v1, p5

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    move-object/from16 v1, p2

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    move-object/from16 v1, p3

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    move-object/from16 v1, p4

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v14

    .line 401
    const-string v0, "NotifySendUtil"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "promptMsgToTLVS sCmd---------------"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 402
    return-object v14
.end method

.method public static d(ZZIII)V
    .locals 0

    .line 264
    sput-boolean p0, Lo/dkr;->d:Z

    .line 265
    sput-boolean p1, Lo/dkr;->a:Z

    .line 266
    sput p2, Lo/dkr;->b:I

    .line 267
    sput p3, Lo/dkr;->c:I

    .line 268
    sput p4, Lo/dkr;->e:I

    .line 269
    return-void
.end method

.method private static e(Lo/dan;)I
    .locals 3

    .line 245
    invoke-virtual {p0}, Lo/dan;->c()I

    move-result v0

    const/4 v1, 0x5

    if-ne v0, v1, :cond_0

    .line 246
    sget v2, Lo/dkr;->c:I

    goto :goto_0

    .line 247
    :cond_0
    invoke-virtual {p0}, Lo/dan;->c()I

    move-result v0

    const/4 v1, 0x6

    if-ne v0, v1, :cond_1

    .line 248
    sget v2, Lo/dkr;->e:I

    goto :goto_0

    .line 250
    :cond_1
    sget v2, Lo/dkr;->b:I

    .line 252
    :goto_0
    return v2
.end method

.method public static e(IZLjava/util/List;Ljava/util/List;IILjava/lang/String;)Lo/daf;
    .locals 14
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(IZLjava/util/List<Lcom/huawei/hwcommonmodel/datatypes/MsgImage;>;Ljava/util/List<Lcom/huawei/hwcommonmodel/datatypes/MsgText;>;IILjava/lang/String;)Lo/daf;"
        }
    .end annotation

    .line 97
    const-string v0, "NotifySendUtil"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "getDataPromptContent, mYellowPagesFomat :"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    move/from16 v3, p4

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "mContentSignFomat:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    move/from16 v3, p5

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 98
    new-instance v4, Lo/daf;

    invoke-direct {v4}, Lo/daf;-><init>()V

    .line 100
    new-instance v5, Ljava/util/ArrayList;

    invoke-direct {v5}, Ljava/util/ArrayList;-><init>()V

    .line 101
    new-instance v6, Ljava/util/ArrayList;

    invoke-direct {v6}, Ljava/util/ArrayList;-><init>()V

    .line 104
    invoke-virtual {v4, p0}, Lo/daf;->a(I)V

    .line 106
    if-eqz p1, :cond_0

    .line 107
    const/4 v0, 0x1

    invoke-virtual {v4, v0}, Lo/daf;->c(I)V

    goto :goto_0

    .line 110
    :cond_0
    const/4 v0, 0x0

    invoke-virtual {v4, v0}, Lo/daf;->c(I)V

    .line 113
    :goto_0
    new-instance v7, Lo/das;

    invoke-direct {v7}, Lo/das;-><init>()V

    .line 114
    const/4 v8, 0x0

    .line 116
    const/4 v0, 0x0

    move-object/from16 v1, p2

    if-eq v0, v1, :cond_3

    invoke-interface/range {p2 .. p2}, Ljava/util/List;->size()I

    move-result v0

    if-lez v0, :cond_3

    .line 117
    invoke-interface/range {p2 .. p2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v9

    :goto_1
    invoke-interface {v9}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-interface {v9}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v10, v0

    check-cast v10, Lcom/huawei/hwcommonmodel/datatypes/MsgImage;

    .line 118
    new-instance v11, Lo/dah;

    invoke-direct {v11}, Lo/dah;-><init>()V

    .line 119
    const/4 v0, 0x0

    if-eq v0, v10, :cond_2

    .line 120
    invoke-virtual {v10}, Lcom/huawei/hwcommonmodel/datatypes/MsgImage;->getImageBitmap()Landroid/graphics/Bitmap;

    move-result-object v12

    .line 121
    const/4 v0, 0x0

    if-eq v0, v12, :cond_1

    .line 123
    const/16 v0, 0x21

    const/16 v1, 0x18

    invoke-static {v12, v0, v1}, Lo/dkr;->d(Landroid/graphics/Bitmap;II)Landroid/graphics/Bitmap;

    move-result-object v12

    .line 124
    invoke-virtual {v7, v12}, Lo/das;->b(Landroid/graphics/Bitmap;)[B

    move-result-object v8

    .line 126
    .line 127
    :cond_1
    invoke-virtual {v10}, Lcom/huawei/hwcommonmodel/datatypes/MsgImage;->getImageType()I

    move-result v0

    .line 126
    invoke-virtual {v11, v0}, Lo/dah;->a(I)V

    .line 128
    invoke-virtual {v11, v8}, Lo/dah;->e([B)V

    .line 129
    invoke-virtual {v10}, Lcom/huawei/hwcommonmodel/datatypes/MsgImage;->getImageType()I

    move-result v13

    .line 130
    invoke-virtual {v11, v13}, Lo/dah;->a(I)V

    .line 131
    const/4 v0, 0x1

    invoke-virtual {v11, v0}, Lo/dah;->b(I)V

    .line 132
    const/16 v0, 0x21

    invoke-virtual {v11, v0}, Lo/dah;->d(I)V

    .line 133
    const/16 v0, 0x18

    invoke-virtual {v11, v0}, Lo/dah;->c(I)V

    .line 134
    invoke-virtual {v5, v11}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 137
    :cond_2
    goto/16 :goto_1

    .line 140
    :cond_3
    const/4 v0, 0x0

    move-object/from16 v1, p3

    if-eq v0, v1, :cond_7

    invoke-interface/range {p3 .. p3}, Ljava/util/List;->size()I

    move-result v0

    if-lez v0, :cond_7

    .line 141
    invoke-interface/range {p3 .. p3}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v9

    :goto_2
    invoke-interface {v9}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_7

    invoke-interface {v9}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v10, v0

    check-cast v10, Lcom/huawei/hwcommonmodel/datatypes/MsgText;

    .line 142
    const/4 v0, 0x0

    if-eq v0, v10, :cond_6

    .line 143
    new-instance v11, Lo/dan;

    invoke-direct {v11}, Lo/dan;-><init>()V

    .line 144
    invoke-virtual {v10}, Lcom/huawei/hwcommonmodel/datatypes/MsgText;->getTextType()I

    move-result v0

    invoke-virtual {v11, v0}, Lo/dan;->c(I)V

    .line 145
    invoke-virtual {v10}, Lcom/huawei/hwcommonmodel/datatypes/MsgText;->getTextType()I

    move-result v0

    const/4 v1, 0x5

    if-ne v0, v1, :cond_4

    .line 146
    move/from16 v0, p4

    invoke-virtual {v11, v0}, Lo/dan;->b(I)V

    goto :goto_3

    .line 147
    :cond_4
    invoke-virtual {v10}, Lcom/huawei/hwcommonmodel/datatypes/MsgText;->getTextType()I

    move-result v0

    const/4 v1, 0x6

    if-ne v0, v1, :cond_5

    .line 148
    move/from16 v0, p5

    invoke-virtual {v11, v0}, Lo/dan;->b(I)V

    goto :goto_3

    .line 150
    :cond_5
    const/4 v0, 0x2

    invoke-virtual {v11, v0}, Lo/dan;->b(I)V

    .line 153
    :goto_3
    invoke-virtual {v10}, Lcom/huawei/hwcommonmodel/datatypes/MsgText;->getTextContent()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v11, v0}, Lo/dan;->b(Ljava/lang/String;)V

    .line 154
    invoke-virtual {v6, v11}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 156
    :cond_6
    goto :goto_2

    .line 160
    :cond_7
    invoke-virtual {v4, v5}, Lo/daf;->d(Ljava/util/ArrayList;)V

    .line 161
    invoke-virtual {v4, v6}, Lo/daf;->b(Ljava/util/ArrayList;)V

    .line 163
    move-object/from16 v0, p6

    invoke-virtual {v4, v0}, Lo/daf;->d(Ljava/lang/String;)V

    .line 165
    return-object v4
.end method
