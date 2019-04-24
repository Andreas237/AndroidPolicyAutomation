.class public Lo/esv$b;
.super Lo/dbb;
.source "SourceFile"

# interfaces
.implements Lo/epr;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo/esv;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "b"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lo/dbb<Lo/esv;>;Lo/epr;"
    }
.end annotation


# instance fields
.field private a:Lo/eph;

.field private b:I

.field private c:I

.field private d:Z

.field private e:Z


# direct methods
.method public constructor <init>(Landroid/os/Looper;Lo/esv;)V
    .locals 1

    .line 1020
    invoke-direct {p0, p1, p2}, Lo/dbb;-><init>(Landroid/os/Looper;Ljava/lang/Object;)V

    .line 1010
    new-instance v0, Lo/eph;

    invoke-direct {v0}, Lo/eph;-><init>()V

    iput-object v0, p0, Lo/esv$b;->a:Lo/eph;

    .line 1011
    const/4 v0, 0x1

    iput-boolean v0, p0, Lo/esv$b;->d:Z

    .line 1012
    const/4 v0, 0x1

    iput-boolean v0, p0, Lo/esv$b;->e:Z

    .line 1021
    return-void
.end method

.method private b(FLo/esv;)V
    .locals 6

    .line 1263
    iget v0, p0, Lo/esv$b;->c:I

    int-to-float v0, v0

    const/high16 v1, 0x3f800000    # 1.0f

    mul-float/2addr v0, v1

    mul-float/2addr v0, p1

    iget v1, p0, Lo/esv$b;->b:I

    int-to-float v1, v1

    const/high16 v2, 0x3f800000    # 1.0f

    mul-float/2addr v1, v2

    div-float v4, v0, v1

    .line 1264
    iget v0, p0, Lo/esv$b;->c:I

    int-to-float v0, v0

    mul-float/2addr v0, p1

    const/high16 v1, 0x3f000000    # 0.5f

    add-float/2addr v0, v1

    invoke-direct {p0, v0}, Lo/esv$b;->c(F)I

    move-result v5

    .line 1265
    invoke-static {p2}, Lo/esv;->a(Lo/esv;)Lo/esx;

    move-result-object v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_2

    invoke-static {p2}, Lo/esv;->a(Lo/esv;)Lo/esx;

    move-result-object v0

    iget-object v0, v0, Lo/esx;->c:Lo/epu;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_2

    .line 1266
    invoke-static {p2}, Lo/esv;->a(Lo/esv;)Lo/esx;

    move-result-object v0

    iget-object v0, v0, Lo/esx;->c:Lo/epu;

    invoke-virtual {v0, v4}, Lo/epu;->setLeftProgress(F)V

    .line 1267
    const v0, 0x186a0

    if-lt v5, v0, :cond_0

    .line 1268
    invoke-static {p2}, Lo/esv;->a(Lo/esv;)Lo/esx;

    move-result-object v0

    iget-object v0, v0, Lo/esx;->d:Lo/egb;

    const/4 v1, 0x1

    const/high16 v2, 0x41c00000    # 24.0f

    invoke-virtual {v0, v1, v2}, Lo/egb;->setTextSize(IF)V

    goto :goto_0

    .line 1269
    :cond_0
    const/16 v0, 0x2710

    if-lt v5, v0, :cond_1

    invoke-static {p2}, Lo/esv;->t(Lo/esv;)Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lo/cxa;->e(Landroid/content/Context;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 1270
    invoke-static {p2}, Lo/esv;->a(Lo/esv;)Lo/esx;

    move-result-object v0

    iget-object v0, v0, Lo/esx;->d:Lo/egb;

    const/4 v1, 0x1

    const/high16 v2, 0x41c00000    # 24.0f

    invoke-virtual {v0, v1, v2}, Lo/egb;->setTextSize(IF)V

    .line 1272
    :cond_1
    :goto_0
    invoke-static {p2}, Lo/esv;->a(Lo/esv;)Lo/esx;

    move-result-object v0

    iget-object v0, v0, Lo/esx;->d:Lo/egb;

    iget-object v1, p2, Lo/esv;->a:Landroid/content/Context;

    const/4 v2, 0x1

    const/4 v3, 0x0

    invoke-static {v1, v5, v2, v3}, Lo/esv;->b(Landroid/content/Context;III)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/egb;->setText(Ljava/lang/CharSequence;)V

    .line 1274
    :cond_2
    return-void
.end method

.method private c(F)I
    .locals 3

    .line 1278
    new-instance v2, Ljava/math/BigDecimal;

    float-to-double v0, p1

    invoke-direct {v2, v0, v1}, Ljava/math/BigDecimal;-><init>(D)V

    .line 1279
    sget-object v0, Ljava/math/RoundingMode;->HALF_UP:Ljava/math/RoundingMode;

    const/4 v1, 0x2

    invoke-virtual {v2, v1, v0}, Ljava/math/BigDecimal;->setScale(ILjava/math/RoundingMode;)Ljava/math/BigDecimal;

    move-result-object v0

    invoke-virtual {v0}, Ljava/math/BigDecimal;->intValue()I

    move-result v0

    return v0
.end method

.method private c(Lo/esv;ILandroid/os/Bundle;)V
    .locals 8

    .line 1330
    invoke-static {p1}, Lo/esv;->z(Lo/esv;)V

    .line 1334
    iput p2, p0, Lo/esv$b;->c:I

    .line 1336
    iget-object v0, p1, Lo/esv;->a:Landroid/content/Context;

    invoke-static {v0}, Lo/dct;->a(Landroid/content/Context;)I

    move-result v6

    .line 1337
    if-eqz v6, :cond_0

    .line 1338
    iput v6, p0, Lo/esv$b;->b:I

    goto :goto_0

    .line 1340
    :cond_0
    invoke-static {p1}, Lo/esv;->n(Lo/esv;)I

    move-result v0

    iput v0, p0, Lo/esv$b;->b:I

    .line 1343
    :goto_0
    iget-object v0, p0, Lo/esv$b;->a:Lo/eph;

    invoke-virtual {v0}, Lo/eph;->e()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 1344
    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Lo/esv$b;->obtainMessage(I)Landroid/os/Message;

    move-result-object v7

    .line 1345
    invoke-virtual {v7, p3}, Landroid/os/Message;->setData(Landroid/os/Bundle;)V

    .line 1346
    iget-object v0, p0, Lo/esv$b;->a:Lo/eph;

    invoke-virtual {v0}, Lo/eph;->c()J

    move-result-wide v0

    invoke-virtual {p0, v7, v0, v1}, Lo/esv$b;->sendMessageDelayed(Landroid/os/Message;J)Z

    .line 1347
    const-string v0, "SCUI_StepsCardData"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "UpdateStepDats antimation play delay"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1348
    return-void

    .line 1352
    :cond_1
    invoke-static {p1}, Lo/esv;->a(Lo/esv;)Lo/esx;

    move-result-object v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_5

    .line 1354
    iget-boolean v0, p0, Lo/esv$b;->d:Z

    if-eqz v0, :cond_2

    .line 1355
    const-string v0, "SCUI_StepsCardData"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, " step first Anitimation"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1356
    iget-object v0, p0, Lo/esv$b;->a:Lo/eph;

    const-wide/16 v1, 0x1f4

    const/16 v3, 0xb

    invoke-virtual {v0, v1, v2, p0, v3}, Lo/eph;->b(JLo/epr;I)V

    goto/16 :goto_2

    .line 1359
    :cond_2
    int-to-double v0, p2

    const-wide/high16 v2, 0x3ff0000000000000L    # 1.0

    mul-double/2addr v0, v2

    int-to-double v2, v6

    const-wide/high16 v4, 0x3ff0000000000000L    # 1.0

    mul-double/2addr v2, v4

    div-double/2addr v0, v2

    double-to-float v7, v0

    .line 1360
    const-string v0, "SCUI_StepsCardData"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, " UpdateStepDats progress"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v7}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, " currentStep"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1361
    invoke-static {p1}, Lo/esv;->a(Lo/esv;)Lo/esx;

    move-result-object v0

    iget-object v0, v0, Lo/esx;->c:Lo/epu;

    invoke-virtual {v0, v7}, Lo/epu;->setLeftProgress(F)V

    .line 1362
    const v0, 0x186a0

    if-lt p2, v0, :cond_3

    .line 1363
    invoke-static {p1}, Lo/esv;->a(Lo/esv;)Lo/esx;

    move-result-object v0

    iget-object v0, v0, Lo/esx;->d:Lo/egb;

    const/4 v1, 0x1

    const/high16 v2, 0x41c00000    # 24.0f

    invoke-virtual {v0, v1, v2}, Lo/egb;->setTextSize(IF)V

    goto :goto_1

    .line 1364
    :cond_3
    const/16 v0, 0x2710

    if-lt p2, v0, :cond_4

    invoke-static {p1}, Lo/esv;->t(Lo/esv;)Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lo/cxa;->e(Landroid/content/Context;)Z

    move-result v0

    if-nez v0, :cond_4

    .line 1365
    invoke-static {p1}, Lo/esv;->a(Lo/esv;)Lo/esx;

    move-result-object v0

    iget-object v0, v0, Lo/esx;->d:Lo/egb;

    const/4 v1, 0x1

    const/high16 v2, 0x41c00000    # 24.0f

    invoke-virtual {v0, v1, v2}, Lo/egb;->setTextSize(IF)V

    .line 1367
    :cond_4
    :goto_1
    invoke-static {p1}, Lo/esv;->a(Lo/esv;)Lo/esx;

    move-result-object v0

    iget-object v0, v0, Lo/esx;->d:Lo/egb;

    iget-object v1, p1, Lo/esv;->a:Landroid/content/Context;

    const/4 v2, 0x1

    const/4 v3, 0x0

    invoke-static {v1, p2, v2, v3}, Lo/esv;->b(Landroid/content/Context;III)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/egb;->setText(Ljava/lang/CharSequence;)V

    .line 1374
    :cond_5
    :goto_2
    const/4 v0, 0x0

    iput-boolean v0, p0, Lo/esv$b;->d:Z

    .line 1375
    return-void
.end method

.method private d(FLo/esv;)V
    .locals 6

    .line 1250
    invoke-static {p2}, Lo/esv;->m(Lo/esv;)I

    move-result v0

    int-to-float v0, v0

    const/high16 v1, 0x3f800000    # 1.0f

    mul-float/2addr v0, v1

    mul-float/2addr v0, p1

    invoke-static {p2}, Lo/esv;->v(Lo/esv;)I

    move-result v1

    int-to-float v1, v1

    const/high16 v2, 0x3f800000    # 1.0f

    mul-float/2addr v1, v2

    div-float v4, v0, v1

    .line 1251
    invoke-static {p2}, Lo/esv;->m(Lo/esv;)I

    move-result v0

    int-to-float v0, v0

    mul-float/2addr v0, p1

    const/high16 v1, 0x3f000000    # 0.5f

    add-float/2addr v0, v1

    invoke-direct {p0, v0}, Lo/esv$b;->c(F)I

    move-result v5

    .line 1252
    invoke-static {p2}, Lo/esv;->a(Lo/esv;)Lo/esx;

    move-result-object v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    invoke-static {p2}, Lo/esv;->a(Lo/esv;)Lo/esx;

    move-result-object v0

    iget-object v0, v0, Lo/esx;->c:Lo/epu;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 1253
    invoke-static {p2}, Lo/esv;->a(Lo/esv;)Lo/esx;

    move-result-object v0

    iget-object v0, v0, Lo/esx;->c:Lo/epu;

    invoke-virtual {v0, v4}, Lo/epu;->setRightProgress(F)V

    .line 1254
    invoke-static {p2}, Lo/esv;->a(Lo/esv;)Lo/esx;

    move-result-object v0

    iget-object v0, v0, Lo/esx;->h:Lo/egb;

    invoke-static {p2}, Lo/esv;->t(Lo/esv;)Landroid/content/Context;

    move-result-object v1

    const/4 v2, 0x1

    const/4 v3, 0x0

    invoke-static {v1, v5, v2, v3}, Lo/esv;->b(Landroid/content/Context;III)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/egb;->setText(Ljava/lang/CharSequence;)V

    .line 1257
    :cond_0
    return-void
.end method

.method private d(Lo/esv;)V
    .locals 5

    .line 1379
    if-nez p1, :cond_0

    .line 1380
    return-void

    .line 1383
    :cond_0
    invoke-static {p1}, Lo/esv;->a(Lo/esv;)Lo/esx;

    move-result-object v0

    if-eqz v0, :cond_1

    .line 1384
    invoke-static {p1}, Lo/esv;->c(Lo/esv;)Lo/cmj;

    move-result-object v0

    if-eqz v0, :cond_1

    .line 1385
    invoke-static {p1}, Lo/esv;->a(Lo/esv;)Lo/esx;

    move-result-object v0

    iget-object v0, v0, Lo/esx;->d:Lo/egb;

    if-nez v0, :cond_2

    .line 1386
    :cond_1
    return-void

    .line 1389
    :cond_2
    invoke-static {p1}, Lo/esv;->c(Lo/esv;)Lo/cmj;

    move-result-object v0

    invoke-virtual {v0}, Lo/cmj;->a()I

    move-result v0

    const/4 v1, 0x3

    if-ne v0, v1, :cond_3

    .line 1390
    invoke-static {p1}, Lo/esv;->a(Lo/esv;)Lo/esx;

    move-result-object v0

    iget-object v0, v0, Lo/esx;->d:Lo/egb;

    iget-object v1, p1, Lo/esv;->a:Landroid/content/Context;

    sget v2, Lcom/huawei/ui/homehealth/R$string;->IDS_hw_health_show_healthdata_nodata_symbol:I

    invoke-virtual {v1, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/egb;->setText(Ljava/lang/CharSequence;)V

    goto :goto_0

    .line 1392
    :cond_3
    invoke-static {p1}, Lo/esv;->a(Lo/esv;)Lo/esx;

    move-result-object v0

    iget-object v0, v0, Lo/esx;->d:Lo/egb;

    iget-object v1, p1, Lo/esv;->a:Landroid/content/Context;

    const/4 v2, 0x0

    const/4 v3, 0x1

    const/4 v4, 0x0

    invoke-static {v1, v2, v3, v4}, Lo/esv;->b(Landroid/content/Context;III)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/egb;->setText(Ljava/lang/CharSequence;)V

    .line 1397
    :goto_0
    invoke-static {p1}, Lo/esv;->a(Lo/esv;)Lo/esx;

    move-result-object v0

    iget-object v0, v0, Lo/esx;->c:Lo/epu;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_4

    .line 1400
    invoke-static {p1}, Lo/esv;->a(Lo/esv;)Lo/esx;

    move-result-object v0

    iget-object v0, v0, Lo/esx;->c:Lo/epu;

    const/4 v1, 0x0

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Lo/epu;->setProgress(FF)V

    .line 1401
    invoke-static {p1}, Lo/esv;->a(Lo/esv;)Lo/esx;

    move-result-object v0

    iget-object v0, v0, Lo/esx;->h:Lo/egb;

    invoke-static {p1}, Lo/esv;->t(Lo/esv;)Landroid/content/Context;

    move-result-object v1

    const/4 v2, 0x0

    const/4 v3, 0x1

    const/4 v4, 0x0

    invoke-static {v1, v2, v3, v4}, Lo/esv;->b(Landroid/content/Context;III)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/egb;->setText(Ljava/lang/CharSequence;)V

    .line 1405
    :cond_4
    invoke-static {p1}, Lo/esv;->a(Lo/esv;)Lo/esx;

    move-result-object v0

    iget-object v0, v0, Lo/esx;->j:Landroid/widget/ImageView;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_5

    .line 1406
    invoke-static {p1}, Lo/esv;->a(Lo/esv;)Lo/esx;

    move-result-object v0

    iget-object v0, v0, Lo/esx;->j:Landroid/widget/ImageView;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 1409
    :cond_5
    invoke-static {p1}, Lo/esv;->x(Lo/esv;)V

    .line 1410
    return-void
.end method

.method private e(ILo/esv;)V
    .locals 8

    .line 1283
    if-gez p1, :cond_0

    .line 1284
    const/4 p1, 0x0

    .line 1286
    :cond_0
    if-nez p1, :cond_2

    invoke-static {p2}, Lo/esv;->c(Lo/esv;)Lo/cmj;

    move-result-object v0

    invoke-virtual {v0}, Lo/cmj;->a()I

    move-result v0

    const/4 v1, 0x1

    if-eq v0, v1, :cond_2

    invoke-static {p2}, Lo/esv;->a(Lo/esv;)Lo/esx;

    move-result-object v0

    if-eqz v0, :cond_2

    .line 1287
    invoke-static {p2}, Lo/esv;->v(Lo/esv;)I

    move-result v0

    if-lez v0, :cond_1

    invoke-static {p2}, Lo/esv;->a(Lo/esv;)Lo/esx;

    move-result-object v0

    iget-object v0, v0, Lo/esx;->c:Lo/epu;

    if-eqz v0, :cond_1

    .line 1288
    invoke-static {p2}, Lo/esv;->a(Lo/esv;)Lo/esx;

    move-result-object v0

    iget-object v0, v0, Lo/esx;->c:Lo/epu;

    int-to-double v1, p1

    const-wide/high16 v3, 0x3ff0000000000000L    # 1.0

    mul-double/2addr v1, v3

    invoke-static {p2}, Lo/esv;->v(Lo/esv;)I

    move-result v3

    int-to-double v3, v3

    const-wide/high16 v5, 0x3ff0000000000000L    # 1.0

    mul-double/2addr v3, v5

    div-double/2addr v1, v3

    double-to-float v1, v1

    invoke-virtual {v0, v1}, Lo/epu;->setRightProgress(F)V

    .line 1290
    :cond_1
    invoke-static {p2}, Lo/esv;->a(Lo/esv;)Lo/esx;

    move-result-object v0

    iget-object v0, v0, Lo/esx;->h:Lo/egb;

    invoke-static {p2}, Lo/esv;->t(Lo/esv;)Landroid/content/Context;

    move-result-object v1

    const/4 v2, 0x0

    const/4 v3, 0x1

    const/4 v4, 0x0

    invoke-static {v1, v2, v3, v4}, Lo/esv;->b(Landroid/content/Context;III)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/egb;->setText(Ljava/lang/CharSequence;)V

    .line 1291
    return-void

    .line 1294
    :cond_2
    invoke-static {p2}, Lo/esv;->a(Lo/esv;)Lo/esx;

    move-result-object v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_6

    .line 1296
    iget-object v0, p0, Lo/esv$b;->a:Lo/eph;

    invoke-virtual {v0}, Lo/eph;->e()Z

    move-result v0

    if-eqz v0, :cond_3

    .line 1297
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    const/4 v1, 0x3

    invoke-virtual {p0, v1, v0}, Lo/esv$b;->obtainMessage(ILjava/lang/Object;)Landroid/os/Message;

    move-result-object v7

    .line 1298
    iget-object v0, p0, Lo/esv$b;->a:Lo/eph;

    invoke-virtual {v0}, Lo/eph;->c()J

    move-result-wide v0

    invoke-virtual {p0, v7, v0, v1}, Lo/esv$b;->sendMessageDelayed(Landroid/os/Message;J)Z

    .line 1299
    const-string v0, "SCUI_StepsCardData"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "UpdateStepDats time antimation play delay"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1300
    return-void

    .line 1303
    :cond_3
    invoke-static {p2}, Lo/esv;->a(Lo/esv;)Lo/esx;

    move-result-object v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_5

    .line 1305
    iget-boolean v0, p0, Lo/esv$b;->e:Z

    if-eqz v0, :cond_4

    .line 1306
    const-string v0, "SCUI_StepsCardData"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, " time first Anitimation"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1307
    iget-object v0, p0, Lo/esv$b;->a:Lo/eph;

    const-wide/16 v1, 0x1f4

    const/16 v3, 0xa

    invoke-virtual {v0, v1, v2, p0, v3}, Lo/eph;->b(JLo/epr;I)V

    goto :goto_0

    .line 1309
    :cond_4
    invoke-static {p2}, Lo/esv;->v(Lo/esv;)I

    move-result v0

    if-lez v0, :cond_5

    .line 1310
    int-to-double v0, p1

    const-wide/high16 v2, 0x3ff0000000000000L    # 1.0

    mul-double/2addr v0, v2

    invoke-static {p2}, Lo/esv;->v(Lo/esv;)I

    move-result v2

    int-to-double v2, v2

    const-wide/high16 v4, 0x3ff0000000000000L    # 1.0

    mul-double/2addr v2, v4

    div-double/2addr v0, v2

    double-to-float v7, v0

    .line 1311
    const-string v0, "SCUI_StepsCardData"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, " updateTimeText"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v7}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, " time"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1312
    invoke-static {p2}, Lo/esv;->a(Lo/esv;)Lo/esx;

    move-result-object v0

    iget-object v0, v0, Lo/esx;->c:Lo/epu;

    invoke-virtual {v0, v7}, Lo/epu;->setRightProgress(F)V

    .line 1313
    invoke-static {p2}, Lo/esv;->a(Lo/esv;)Lo/esx;

    move-result-object v0

    iget-object v0, v0, Lo/esx;->h:Lo/egb;

    invoke-static {p2}, Lo/esv;->t(Lo/esv;)Landroid/content/Context;

    move-result-object v1

    const/4 v2, 0x1

    const/4 v3, 0x0

    invoke-static {v1, p1, v2, v3}, Lo/esv;->b(Landroid/content/Context;III)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/egb;->setText(Ljava/lang/CharSequence;)V

    .line 1321
    :cond_5
    :goto_0
    const/4 v0, 0x0

    iput-boolean v0, p0, Lo/esv$b;->e:Z

    .line 1323
    :cond_6
    return-void
.end method


# virtual methods
.method public b(FI)V
    .locals 2

    .line 1416
    const/4 v1, 0x0

    .line 1417
    sparse-switch p2, :sswitch_data_0

    goto :goto_0

    .line 1419
    :sswitch_0
    const/16 v0, 0x16

    invoke-virtual {p0, v0}, Lo/esv$b;->obtainMessage(I)Landroid/os/Message;

    move-result-object v1

    .line 1420
    invoke-static {p1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v0

    iput-object v0, v1, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 1421
    invoke-virtual {p0, v1}, Lo/esv$b;->sendMessage(Landroid/os/Message;)Z

    .line 1422
    goto :goto_0

    .line 1424
    :sswitch_1
    const/16 v0, 0x17

    invoke-virtual {p0, v0}, Lo/esv$b;->obtainMessage(I)Landroid/os/Message;

    move-result-object v1

    .line 1425
    invoke-static {p1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v0

    iput-object v0, v1, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 1426
    invoke-virtual {p0, v1}, Lo/esv$b;->sendMessage(Landroid/os/Message;)Z

    .line 1427
    .line 1432
    :goto_0
    return-void

    nop

    :sswitch_data_0
    .sparse-switch
        0xa -> :sswitch_1
        0xb -> :sswitch_0
    .end sparse-switch
.end method

.method protected e(Lo/esv;Landroid/os/Message;)V
    .locals 10

    .line 1030
    iget v0, p2, Landroid/os/Message;->what:I

    sparse-switch v0, :sswitch_data_0

    goto/16 :goto_3

    .line 1032
    :sswitch_0
    invoke-virtual {p2}, Landroid/os/Message;->getData()Landroid/os/Bundle;

    move-result-object v5

    .line 1033
    const/4 v0, 0x0

    if-eq v0, v5, :cond_c

    invoke-static {p1}, Lo/esv;->a(Lo/esv;)Lo/esx;

    move-result-object v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_c

    .line 1035
    const-string v0, "step"

    const/4 v1, -0x1

    invoke-virtual {v5, v0, v1}, Landroid/os/Bundle;->getInt(Ljava/lang/String;I)I

    move-result v6

    .line 1036
    const-string v0, "floor"

    const/4 v1, -0x1

    invoke-virtual {v5, v0, v1}, Landroid/os/Bundle;->getInt(Ljava/lang/String;I)I

    move-result v7

    .line 1037
    const-string v0, "carior"

    const/4 v1, -0x1

    invoke-virtual {v5, v0, v1}, Landroid/os/Bundle;->getInt(Ljava/lang/String;I)I

    move-result v8

    .line 1038
    const-string v0, "distance"

    const/4 v1, -0x1

    invoke-virtual {v5, v0, v1}, Landroid/os/Bundle;->getInt(Ljava/lang/String;I)I

    move-result v9

    .line 1039
    const-string v0, "SCUI_StepsCardData"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "handleMessageWhenReferenceNotNull steps = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v6}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, " floor = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v7}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, " calories = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v8}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "stepsDistance = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v9}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1041
    invoke-static {p1}, Lo/esv;->f(Lo/esv;)I

    move-result v0

    if-ne v6, v0, :cond_0

    invoke-static {p1}, Lo/esv;->g(Lo/esv;)I

    move-result v0

    if-ne v7, v0, :cond_0

    invoke-static {p1}, Lo/esv;->h(Lo/esv;)I

    move-result v0

    if-ne v8, v0, :cond_0

    invoke-static {p1}, Lo/esv;->i(Lo/esv;)I

    move-result v0

    if-eq v9, v0, :cond_1

    .line 1042
    :cond_0
    const-string v0, "SCUI_StepsCardData"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "In MSG_DETAILS steps = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-static {p1}, Lo/esv;->f(Lo/esv;)I

    move-result v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, " floor = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-static {p1}, Lo/esv;->g(Lo/esv;)I

    move-result v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, " calories = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-static {p1}, Lo/esv;->h(Lo/esv;)I

    move-result v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "stepsDistance = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-static {p1}, Lo/esv;->i(Lo/esv;)I

    move-result v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1045
    :cond_1
    if-gtz v6, :cond_2

    .line 1046
    const-string v0, "SCUI_StepsCardData"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "clearStepData tmpStep"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v6}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1047
    invoke-direct {p0, p1}, Lo/esv$b;->d(Lo/esv;)V

    goto :goto_0

    .line 1049
    :cond_2
    invoke-direct {p0, p1, v6, v5}, Lo/esv$b;->c(Lo/esv;ILandroid/os/Bundle;)V

    .line 1051
    :goto_0
    if-ltz v8, :cond_3

    .line 1052
    invoke-static {p1}, Lo/esv;->a(Lo/esv;)Lo/esx;

    move-result-object v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_3

    .line 1053
    invoke-static {p1}, Lo/esv;->a(Lo/esv;)Lo/esx;

    move-result-object v0

    iget-object v0, v0, Lo/esx;->e:Lo/egb;

    iget-object v1, p1, Lo/esv;->a:Landroid/content/Context;

    int-to-float v2, v8

    const/high16 v3, 0x447a0000    # 1000.0f

    div-float/2addr v2, v3

    invoke-static {v2}, Ljava/lang/Math;->round(F)I

    move-result v2

    const/4 v3, 0x1

    const/4 v4, 0x0

    invoke-static {v1, v2, v3, v4}, Lo/esv;->b(Landroid/content/Context;III)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/egb;->setText(Ljava/lang/CharSequence;)V

    .line 1056
    :cond_3
    if-ltz v9, :cond_4

    .line 1057
    invoke-static {p1}, Lo/esv;->a(Lo/esv;)Lo/esx;

    move-result-object v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_4

    .line 1058
    int-to-double v0, v9

    const-wide v2, 0x3f50624dd2f1a9fcL    # 0.001

    mul-double/2addr v0, v2

    invoke-static {p1, v0, v1}, Lo/esv;->d(Lo/esv;D)V

    .line 1061
    :cond_4
    if-ltz v7, :cond_5

    .line 1062
    invoke-static {p1}, Lo/esv;->a(Lo/esv;)Lo/esx;

    move-result-object v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_5

    .line 1063
    invoke-static {p1, v7}, Lo/esv;->a(Lo/esv;I)V

    .line 1068
    :cond_5
    invoke-static {v6}, Lo/cwg;->d(I)V

    .line 1069
    invoke-static {v6}, Lo/cvz;->d(I)V

    .line 1070
    invoke-static {v6}, Lo/esl;->a(I)V

    .line 1072
    goto/16 :goto_3

    .line 1075
    :sswitch_1
    const-string v0, "SCUI_StepsCardData-Handler MSG_GOAL enter"

    invoke-static {v0}, Lo/dbf;->d(Ljava/lang/String;)V

    .line 1076
    iget-object v0, p2, Landroid/os/Message;->obj:Ljava/lang/Object;

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v6

    .line 1077
    const-string v0, "SCUI_StepsCardData"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "In MSG_GOAL goalSteps = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v6}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1078
    iget-object v0, p1, Lo/esv;->a:Landroid/content/Context;

    invoke-static {v0, v6}, Lo/dct;->e(Landroid/content/Context;I)V

    .line 1079
    if-lez v6, :cond_7

    .line 1080
    invoke-static {p1, v6}, Lo/esv;->b(Lo/esv;I)I

    .line 1081
    invoke-static {p1}, Lo/esv;->n(Lo/esv;)I

    move-result v0

    if-lez v0, :cond_7

    invoke-static {p1}, Lo/esv;->f(Lo/esv;)I

    move-result v0

    if-lez v0, :cond_7

    .line 1082
    invoke-static {p1}, Lo/esv;->a(Lo/esv;)Lo/esx;

    move-result-object v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_7

    invoke-static {p1}, Lo/esv;->a(Lo/esv;)Lo/esx;

    move-result-object v0

    iget-object v0, v0, Lo/esx;->c:Lo/epu;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_7

    .line 1085
    iget-object v0, p0, Lo/esv$b;->a:Lo/eph;

    invoke-virtual {v0}, Lo/eph;->e()Z

    move-result v0

    if-eqz v0, :cond_6

    .line 1087
    const-string v0, "SCUI_StepsCardData"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "MSG_GOAL antimation play : "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1089
    const/4 v0, 0x2

    invoke-virtual {p0, v0}, Lo/esv$b;->obtainMessage(I)Landroid/os/Message;

    move-result-object v7

    .line 1090
    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    iput-object v0, v7, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 1091
    iget-object v0, p0, Lo/esv$b;->a:Lo/eph;

    invoke-virtual {v0}, Lo/eph;->c()J

    move-result-wide v0

    invoke-virtual {p0, v7, v0, v1}, Lo/esv$b;->sendMessageDelayed(Landroid/os/Message;J)Z

    .line 1092
    goto :goto_1

    .line 1097
    :cond_6
    iget v0, p0, Lo/esv$b;->c:I

    int-to-float v0, v0

    const/high16 v1, 0x3f800000    # 1.0f

    mul-float/2addr v0, v1

    int-to-float v1, v6

    const/high16 v2, 0x3f800000    # 1.0f

    mul-float/2addr v1, v2

    div-float v7, v0, v1

    .line 1098
    invoke-static {p1}, Lo/esv;->a(Lo/esv;)Lo/esx;

    move-result-object v0

    iget-object v0, v0, Lo/esx;->c:Lo/epu;

    invoke-virtual {v0, v7}, Lo/epu;->setLeftProgress(F)V

    .line 1113
    :cond_7
    :goto_1
    const-string v0, "SCUI_StepsCardData-Handler MSG_GOAL end"

    invoke-static {v0}, Lo/dbf;->d(Ljava/lang/String;)V

    .line 1114
    goto/16 :goto_3

    .line 1116
    :sswitch_2
    const-string v0, "SCUI_StepsCardData-Handler MSG_TIME enter"

    invoke-static {v0}, Lo/dbf;->d(Ljava/lang/String;)V

    .line 1117
    iget-object v0, p2, Landroid/os/Message;->obj:Ljava/lang/Object;

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    invoke-static {p1, v0}, Lo/esv;->d(Lo/esv;I)I

    .line 1118
    const-string v0, "SCUI_StepsCardData"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "In MSG_TIME time = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-static {p1}, Lo/esv;->m(Lo/esv;)I

    move-result v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1119
    invoke-static {p1}, Lo/esv;->a(Lo/esv;)Lo/esx;

    move-result-object v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_8

    .line 1120
    invoke-static {p1}, Lo/esv;->m(Lo/esv;)I

    move-result v0

    invoke-direct {p0, v0, p1}, Lo/esv$b;->e(ILo/esv;)V

    .line 1123
    :cond_8
    const-string v0, "SCUI_StepsCardData-Handler MSG_TIME end"

    invoke-static {v0}, Lo/dbf;->d(Ljava/lang/String;)V

    .line 1124
    goto/16 :goto_3

    .line 1126
    :sswitch_3
    invoke-static {p1}, Lo/esv;->l(Lo/esv;)Z

    move-result v0

    if-eqz v0, :cond_9

    invoke-static {p1}, Lo/esv;->c(Lo/esv;)Lo/cmj;

    move-result-object v0

    invoke-virtual {v0}, Lo/cmj;->a()I

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_9

    .line 1127
    return-void

    .line 1129
    :cond_9
    iget-object v0, p1, Lo/esv;->a:Landroid/content/Context;

    if-eqz v0, :cond_c

    invoke-static {p1}, Lo/esv;->a(Lo/esv;)Lo/esx;

    move-result-object v0

    if-eqz v0, :cond_c

    invoke-static {p1}, Lo/esv;->a(Lo/esv;)Lo/esx;

    move-result-object v0

    iget-object v0, v0, Lo/esx;->v:Landroid/widget/LinearLayout;

    if-eqz v0, :cond_c

    .line 1131
    invoke-static {p1}, Lo/esv;->a(Lo/esv;)Lo/esx;

    move-result-object v0

    iget-object v0, v0, Lo/esx;->v:Landroid/widget/LinearLayout;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 1132
    invoke-static {p1}, Lo/esv;->a(Lo/esv;)Lo/esx;

    move-result-object v0

    iget-object v0, v0, Lo/esx;->F:Landroid/view/View;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 1133
    invoke-static {p1}, Lo/esv;->a(Lo/esv;)Lo/esx;

    move-result-object v0

    iget-object v0, v0, Lo/esx;->I:Landroid/view/View;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 1134
    invoke-static {p1}, Lo/esv;->a(Lo/esv;)Lo/esx;

    move-result-object v0

    iget-object v0, v0, Lo/esx;->C:Landroid/view/View;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    goto/16 :goto_3

    .line 1144
    :sswitch_4
    iget-object v0, p1, Lo/esv;->a:Landroid/content/Context;

    if-eqz v0, :cond_c

    invoke-static {p1}, Lo/esv;->a(Lo/esv;)Lo/esx;

    move-result-object v0

    if-eqz v0, :cond_c

    invoke-static {p1}, Lo/esv;->a(Lo/esv;)Lo/esx;

    move-result-object v0

    iget-object v0, v0, Lo/esx;->v:Landroid/widget/LinearLayout;

    if-eqz v0, :cond_c

    .line 1153
    invoke-static {p1}, Lo/esv;->a(Lo/esv;)Lo/esx;

    move-result-object v0

    iget-object v0, v0, Lo/esx;->C:Landroid/view/View;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 1154
    invoke-static {p1}, Lo/esv;->a(Lo/esv;)Lo/esx;

    move-result-object v0

    iget-object v0, v0, Lo/esx;->F:Landroid/view/View;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 1155
    invoke-static {p1}, Lo/esv;->a(Lo/esv;)Lo/esx;

    move-result-object v0

    iget-object v0, v0, Lo/esx;->I:Landroid/view/View;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 1156
    invoke-static {p1}, Lo/esv;->a(Lo/esv;)Lo/esx;

    move-result-object v0

    iget-object v0, v0, Lo/esx;->v:Landroid/widget/LinearLayout;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    goto/16 :goto_3

    .line 1160
    :sswitch_5
    invoke-static {p1}, Lo/esv;->a(Lo/esv;)Lo/esx;

    move-result-object v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_c

    goto/16 :goto_3

    .line 1165
    :sswitch_6
    invoke-static {p1}, Lo/esv;->a(Lo/esv;)Lo/esx;

    move-result-object v0

    if-eqz v0, :cond_c

    .line 1167
    const-string v0, "SCUI_StepsCardData"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "In MSG_GET_RANKING rank = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget v3, p2, Landroid/os/Message;->arg1:I

    invoke-static {v3}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    goto/16 :goto_3

    .line 1171
    :sswitch_7
    invoke-static {p1}, Lo/esv;->a(Lo/esv;)Lo/esx;

    move-result-object v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_c

    .line 1172
    invoke-static {p1}, Lo/esv;->g(Lo/esv;)I

    move-result v0

    invoke-static {p1, v0}, Lo/esv;->a(Lo/esv;I)V

    goto/16 :goto_3

    .line 1176
    :sswitch_8
    invoke-static {p1}, Lo/esv;->a(Lo/esv;)Lo/esx;

    move-result-object v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_c

    .line 1177
    invoke-static {p1}, Lo/esv;->i(Lo/esv;)I

    move-result v0

    int-to-double v0, v0

    const-wide v2, 0x3f50624dd2f1a9fcL    # 0.001

    mul-double/2addr v0, v2

    invoke-static {p1, v0, v1}, Lo/esv;->d(Lo/esv;D)V

    goto/16 :goto_3

    .line 1181
    :sswitch_9
    invoke-static {p1}, Lo/esv;->o(Lo/esv;)V

    .line 1182
    goto/16 :goto_3

    .line 1185
    :sswitch_a
    iget-object v0, p2, Landroid/os/Message;->obj:Ljava/lang/Object;

    check-cast v0, Ljava/util/List;

    invoke-static {p1, v0}, Lo/esv;->b(Lo/esv;Ljava/util/List;)Ljava/util/List;

    .line 1186
    invoke-static {p1}, Lo/esv;->a(Lo/esv;)Lo/esx;

    move-result-object v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_c

    .line 1187
    invoke-static {p1}, Lo/esv;->p(Lo/esv;)Ljava/util/List;

    move-result-object v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_b

    invoke-static {p1}, Lo/esv;->p(Lo/esv;)Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-lez v0, :cond_b

    .line 1189
    invoke-static {p1}, Lo/esv;->e(Lo/esv;)V

    .line 1191
    iget-object v0, p1, Lo/esv;->a:Landroid/content/Context;

    const/16 v1, 0x2710

    invoke-static {v1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v1

    const-string v2, "data_origin_icon_red_dot"

    invoke-static {v0, v1, v2}, Lo/dct;->c(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    .line 1193
    const-string v0, ""

    invoke-virtual {v0, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_a

    .line 1194
    invoke-static {p1}, Lo/esv;->a(Lo/esv;)Lo/esx;

    move-result-object v0

    iget-object v0, v0, Lo/esx;->j:Landroid/widget/ImageView;

    sget v1, Lcom/huawei/ui/homehealth/R$drawable;->ic_data_new_normal:I

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setBackgroundResource(I)V

    .line 1196
    :cond_a
    invoke-static {p1}, Lo/esv;->a(Lo/esv;)Lo/esx;

    move-result-object v0

    iget-object v0, v0, Lo/esx;->j:Landroid/widget/ImageView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 1197
    goto/16 :goto_3

    .line 1198
    :cond_b
    invoke-static {p1}, Lo/esv;->a(Lo/esv;)Lo/esx;

    move-result-object v0

    iget-object v0, v0, Lo/esx;->j:Landroid/widget/ImageView;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    goto/16 :goto_3

    .line 1203
    :sswitch_b
    invoke-static {p1}, Lo/esv;->a(Lo/esv;)Lo/esx;

    move-result-object v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_c

    .line 1204
    invoke-static {p1}, Lo/esv;->a(Lo/esv;)Lo/esx;

    move-result-object v0

    iget-object v0, v0, Lo/esx;->q:Landroid/widget/RelativeLayout;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    .line 1205
    invoke-static {p1}, Lo/esv;->a(Lo/esv;)Lo/esx;

    move-result-object v0

    iget-object v0, v0, Lo/esx;->y:Landroid/widget/RelativeLayout;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    goto/16 :goto_3

    .line 1209
    :sswitch_c
    new-instance v7, Landroid/content/Intent;

    iget-object v0, p1, Lo/esv;->a:Landroid/content/Context;

    const-class v1, Lcom/huawei/health/manager/DaemonService;

    invoke-direct {v7, v0, v1}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 1211
    :try_start_0
    invoke-static {p1}, Lo/esv;->t(Lo/esv;)Landroid/content/Context;

    move-result-object v0

    invoke-virtual {v0, v7}, Landroid/content/Context;->startService(Landroid/content/Intent;)Landroid/content/ComponentName;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 1214
    goto :goto_2

    .line 1212
    :catch_0
    move-exception v8

    .line 1213
    const-string v0, "SCUI_StepsCardData"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "MSG_REBIND_OPENSDK"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {v8}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1215
    :goto_2
    invoke-static {p1}, Lo/esv;->c(Lo/esv;)Lo/cmj;

    move-result-object v0

    invoke-static {p1}, Lo/esv;->s(Lo/esv;)Lo/esv$a;

    move-result-object v1

    invoke-static {p1}, Lo/esv;->u(Lo/esv;)Lo/cmo;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lo/cmj;->e(Lo/cmq;Lo/cmo;)Z

    .line 1216
    goto/16 :goto_3

    .line 1218
    :sswitch_d
    invoke-static {p1}, Lo/esv;->q(Lo/esv;)V

    .line 1219
    goto/16 :goto_3

    .line 1221
    :sswitch_e
    invoke-static {p1}, Lo/esv;->r(Lo/esv;)V

    .line 1222
    goto/16 :goto_3

    .line 1224
    :sswitch_f
    iget-object v0, p2, Landroid/os/Message;->obj:Ljava/lang/Object;

    check-cast v0, Ljava/lang/Float;

    invoke-virtual {v0}, Ljava/lang/Float;->floatValue()F

    move-result v0

    invoke-direct {p0, v0, p1}, Lo/esv$b;->b(FLo/esv;)V

    .line 1225
    goto/16 :goto_3

    .line 1227
    :sswitch_10
    iget-object v0, p2, Landroid/os/Message;->obj:Ljava/lang/Object;

    check-cast v0, Ljava/lang/Float;

    invoke-virtual {v0}, Ljava/lang/Float;->floatValue()F

    move-result v0

    invoke-direct {p0, v0, p1}, Lo/esv$b;->d(FLo/esv;)V

    .line 1228
    goto :goto_3

    .line 1230
    :sswitch_11
    const-string v0, "SCUI_StepsCardData"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "show opera msg"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1231
    invoke-static {p1}, Lo/esv;->a(Lo/esv;)Lo/esx;

    move-result-object v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_c

    .line 1232
    invoke-static {p1}, Lo/esv;->y(Lo/esv;)Lo/esw;

    move-result-object v0

    iget-object v1, p2, Landroid/os/Message;->obj:Ljava/lang/Object;

    check-cast v1, Lcom/huawei/hwsmartinteractmgr/data/SmartMsgDBObject;

    invoke-static {p1}, Lo/esv;->a(Lo/esv;)Lo/esx;

    move-result-object v2

    iget-object v2, v2, Lo/esx;->D:Lo/egb;

    .line 1233
    invoke-static {p1}, Lo/esv;->a(Lo/esv;)Lo/esx;

    move-result-object v3

    iget-object v3, v3, Lo/esx;->E:Landroid/widget/LinearLayout;

    invoke-static {p1}, Lo/esv;->a(Lo/esv;)Lo/esx;

    move-result-object v4

    iget-object v4, v4, Lo/esx;->H:Landroid/widget/RelativeLayout;

    .line 1232
    invoke-virtual {v0, v1, v2, v3, v4}, Lo/esw;->d(Lcom/huawei/hwsmartinteractmgr/data/SmartMsgDBObject;Landroid/widget/TextView;Landroid/widget/LinearLayout;Landroid/widget/RelativeLayout;)V

    goto :goto_3

    .line 1237
    :sswitch_12
    const-string v0, "SCUI_StepsCardData"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "hide opera msg"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1238
    invoke-static {p1}, Lo/esv;->a(Lo/esv;)Lo/esx;

    move-result-object v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_c

    .line 1239
    invoke-static {p1}, Lo/esv;->a(Lo/esv;)Lo/esx;

    move-result-object v0

    iget-object v0, v0, Lo/esx;->E:Landroid/widget/LinearLayout;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 1240
    invoke-static {p1}, Lo/esv;->a(Lo/esv;)Lo/esx;

    move-result-object v0

    iget-object v0, v0, Lo/esx;->H:Landroid/widget/RelativeLayout;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    .line 1247
    :cond_c
    :goto_3
    return-void

    nop

    :sswitch_data_0
    .sparse-switch
        0x1 -> :sswitch_0
        0x2 -> :sswitch_1
        0x3 -> :sswitch_2
        0x5 -> :sswitch_5
        0x6 -> :sswitch_6
        0x7 -> :sswitch_7
        0x8 -> :sswitch_8
        0x9 -> :sswitch_9
        0xa -> :sswitch_a
        0xb -> :sswitch_b
        0xd -> :sswitch_c
        0x10 -> :sswitch_d
        0x11 -> :sswitch_3
        0x12 -> :sswitch_4
        0x15 -> :sswitch_e
        0x16 -> :sswitch_f
        0x17 -> :sswitch_10
        0x2710 -> :sswitch_11
        0x2711 -> :sswitch_12
    .end sparse-switch
.end method

.method public handleMessage(Landroid/os/Message;)V
    .locals 0

    .line 1025
    invoke-super {p0, p1}, Lo/dbb;->handleMessage(Landroid/os/Message;)V

    .line 1026
    return-void
.end method

.method protected synthetic handleMessageWhenReferenceNotNull(Ljava/lang/Object;Landroid/os/Message;)V
    .locals 1

    .line 1003
    move-object v0, p1

    check-cast v0, Lo/esv;

    invoke-virtual {p0, v0, p2}, Lo/esv$b;->e(Lo/esv;Landroid/os/Message;)V

    return-void
.end method
