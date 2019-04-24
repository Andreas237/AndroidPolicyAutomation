.class final Lo/etp$5;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/huawei/hwbasemgr/IBaseResponseCallback;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/etp;->a(JJLandroid/content/Context;Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = null
.end annotation


# instance fields
.field final synthetic d:Lcom/huawei/hwbasemgr/IBaseResponseCallback;

.field final synthetic e:Landroid/content/Context;


# direct methods
.method constructor <init>(Landroid/content/Context;Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V
    .locals 0

    .line 157
    iput-object p1, p0, Lo/etp$5;->e:Landroid/content/Context;

    iput-object p2, p0, Lo/etp$5;->d:Lcom/huawei/hwbasemgr/IBaseResponseCallback;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onResponse(ILjava/lang/Object;)V
    .locals 18

    .line 160
    if-nez p1, :cond_c

    if-eqz p2, :cond_c

    .line 161
    move-object/from16 v4, p2

    check-cast v4, Lo/dgu$e;

    .line 165
    new-instance v5, Ljava/io/File;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    move-object/from16 v1, p0

    iget-object v1, v1, Lo/etp$5;->e:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getFilesDir()Ljava/io/File;

    move-result-object v1

    invoke-virtual {v1}, Ljava/io/File;->getPath()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    sget-object v1, Ljava/io/File;->separator:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, v4, Lo/dgu$e;->d:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v5, v0}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 166
    new-instance v6, Ljava/util/ArrayList;

    invoke-direct {v6}, Ljava/util/ArrayList;-><init>()V

    .line 168
    invoke-virtual {v5}, Ljava/io/File;->exists()Z

    move-result v0

    if-nez v0, :cond_0

    .line 169
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/etp$5;->d:Lcom/huawei/hwbasemgr/IBaseResponseCallback;

    const/4 v1, -0x1

    const/4 v2, 0x0

    invoke-interface {v0, v1, v2}, Lcom/huawei/hwbasemgr/IBaseResponseCallback;->onResponse(ILjava/lang/Object;)V

    .line 170
    return-void

    .line 173
    :cond_0
    const/high16 v7, -0x3d4c0000    # -90.0f

    .line 174
    const/high16 v8, -0x3ccc0000    # -180.0f

    .line 175
    const/high16 v9, 0x42b40000    # 90.0f

    .line 176
    const/high16 v10, 0x43340000    # 180.0f

    .line 177
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/etp$5;->e:Landroid/content/Context;

    iget-object v1, v4, Lo/dgu$e;->d:Ljava/lang/String;

    invoke-static {v0, v1}, Lo/cea;->d(Landroid/content/Context;Ljava/lang/String;)Lo/cex;

    move-result-object v11

    .line 178
    const/4 v12, 0x0

    .line 179
    const/4 v0, 0x0

    if-eq v0, v11, :cond_1

    .line 180
    invoke-virtual {v11}, Lo/cex;->b()Ljava/util/Map;

    move-result-object v12

    .line 183
    :cond_1
    if-eqz v12, :cond_2

    invoke-interface {v12}, Ljava/util/Map;->size()I

    move-result v0

    if-nez v0, :cond_3

    .line 184
    :cond_2
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/etp$5;->d:Lcom/huawei/hwbasemgr/IBaseResponseCallback;

    const/4 v1, -0x1

    const/4 v2, 0x0

    invoke-interface {v0, v1, v2}, Lcom/huawei/hwbasemgr/IBaseResponseCallback;->onResponse(ILjava/lang/Object;)V

    .line 185
    return-void

    .line 188
    :cond_3
    invoke-interface {v12}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v13

    :cond_4
    :goto_0
    invoke-interface {v13}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_a

    invoke-interface {v13}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v14, v0

    check-cast v14, Ljava/util/Map$Entry;

    .line 189
    invoke-interface {v14}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [D

    const/4 v1, 0x0

    aget-wide v0, v0, v1

    double-to-float v15, v0

    .line 190
    invoke-interface {v14}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [D

    const/4 v1, 0x1

    aget-wide v0, v0, v1

    double-to-float v2, v0

    move/from16 v16, v2

    .line 192
    move/from16 v0, v16

    invoke-static {v0, v15}, Lo/etp;->e(FF)Z

    move-result v0

    if-eqz v0, :cond_5

    .line 194
    goto :goto_0

    .line 197
    :cond_5
    const/high16 v0, 0x43340000    # 180.0f

    cmpg-float v0, v16, v0

    if-gtz v0, :cond_4

    const/high16 v0, -0x3ccc0000    # -180.0f

    cmpl-float v0, v16, v0

    if-lez v0, :cond_4

    const/high16 v0, -0x3d4c0000    # -90.0f

    cmpl-float v0, v15, v0

    if-lez v0, :cond_4

    const/high16 v0, 0x42b40000    # 90.0f

    cmpg-float v0, v15, v0

    if-gez v0, :cond_4

    .line 199
    cmpl-float v0, v16, v8

    if-lez v0, :cond_6

    .line 200
    move/from16 v8, v16

    .line 202
    :cond_6
    cmpg-float v0, v16, v10

    if-gez v0, :cond_7

    .line 203
    move/from16 v10, v16

    .line 205
    :cond_7
    cmpl-float v0, v15, v7

    if-lez v0, :cond_8

    .line 206
    move v7, v15

    .line 208
    :cond_8
    cmpg-float v0, v15, v9

    if-gez v0, :cond_9

    .line 209
    move v9, v15

    .line 211
    :cond_9
    new-instance v0, Lo/fbu;

    move/from16 v1, v16

    invoke-direct {v0, v1, v15}, Lo/fbu;-><init>(FF)V

    invoke-virtual {v6, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 215
    goto/16 :goto_0

    .line 218
    :cond_a
    sget-object v0, Landroid/graphics/Bitmap$Config;->ARGB_8888:Landroid/graphics/Bitmap$Config;

    const/16 v1, 0x35c

    const/16 v2, 0x280

    invoke-static {v1, v2, v0}, Landroid/graphics/Bitmap;->createBitmap(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;

    move-result-object v13

    .line 219
    new-instance v14, Landroid/graphics/Canvas;

    invoke-direct {v14, v13}, Landroid/graphics/Canvas;-><init>(Landroid/graphics/Bitmap;)V

    .line 221
    new-instance v15, Landroid/graphics/Matrix;

    invoke-direct {v15}, Landroid/graphics/Matrix;-><init>()V

    .line 222
    new-instance v16, Landroid/graphics/Paint;

    invoke-direct/range {v16 .. v16}, Landroid/graphics/Paint;-><init>()V

    .line 223
    move-object/from16 v0, v16

    invoke-virtual {v14, v13, v15, v0}, Landroid/graphics/Canvas;->drawBitmap(Landroid/graphics/Bitmap;Landroid/graphics/Matrix;Landroid/graphics/Paint;)V

    .line 224
    move-object/from16 v0, v16

    const/high16 v1, 0x41a00000    # 20.0f

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    .line 226
    const-string v0, "#FFF9AC89"

    invoke-static {v0}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v0

    move-object/from16 v1, v16

    invoke-virtual {v1, v0}, Landroid/graphics/Paint;->setColor(I)V

    .line 228
    move-object/from16 v0, v16

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setAntiAlias(Z)V

    .line 230
    sget-object v0, Landroid/graphics/Paint$Join;->ROUND:Landroid/graphics/Paint$Join;

    move-object/from16 v1, v16

    invoke-virtual {v1, v0}, Landroid/graphics/Paint;->setStrokeJoin(Landroid/graphics/Paint$Join;)V

    .line 231
    sget-object v0, Landroid/graphics/Paint$Style;->STROKE:Landroid/graphics/Paint$Style;

    move-object/from16 v1, v16

    invoke-virtual {v1, v0}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    .line 234
    invoke-virtual {v6}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-nez v0, :cond_b

    .line 235
    const-string v0, "Track_TrackDrawUtil"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "pointListFormat is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 237
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/etp$5;->d:Lcom/huawei/hwbasemgr/IBaseResponseCallback;

    const/4 v1, -0x1

    const/4 v2, 0x0

    invoke-interface {v0, v1, v2}, Lcom/huawei/hwbasemgr/IBaseResponseCallback;->onResponse(ILjava/lang/Object;)V

    goto :goto_1

    .line 239
    :cond_b
    invoke-static {v6, v10, v8, v9, v7}, Lo/etp;->a(Ljava/util/ArrayList;FFFF)Ljava/util/ArrayList;

    move-result-object v17

    .line 242
    move-object/from16 v0, v17

    move-object/from16 v1, v16

    invoke-static {v0, v14, v1}, Lo/etp;->b(Ljava/util/ArrayList;Landroid/graphics/Canvas;Landroid/graphics/Paint;)V

    .line 244
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/etp$5;->d:Lcom/huawei/hwbasemgr/IBaseResponseCallback;

    const/4 v1, 0x0

    invoke-interface {v0, v1, v13}, Lcom/huawei/hwbasemgr/IBaseResponseCallback;->onResponse(ILjava/lang/Object;)V

    .line 246
    :goto_1
    goto :goto_2

    .line 247
    :cond_c
    const-string v0, "Track_TrackDrawUtil"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "MSG_TYPE_TRACK_RECOVER_TIME_RECOMMEND Not return valid data"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 249
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/etp$5;->d:Lcom/huawei/hwbasemgr/IBaseResponseCallback;

    const/4 v1, -0x1

    const/4 v2, 0x0

    invoke-interface {v0, v1, v2}, Lcom/huawei/hwbasemgr/IBaseResponseCallback;->onResponse(ILjava/lang/Object;)V

    .line 252
    :goto_2
    return-void
.end method
