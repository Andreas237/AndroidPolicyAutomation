.class public Lo/bfj;
.super Lo/bfd;
.source "SourceFile"


# static fields
.field private static final e:Ljava/lang/String;


# instance fields
.field private f:Ljava/lang/String;

.field private g:Ljava/lang/String;

.field private h:Ljava/lang/String;

.field private i:Ljava/lang/String;

.field private k:Ljava/lang/String;

.field private l:Ljava/lang/String;

.field private m:Z

.field private n:Z

.field private o:Ljava/lang/String;

.field private p:Z

.field private r:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<Lo/bff;>;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 31
    const-class v0, Lo/bfj;

    invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lo/bfj;->e:Ljava/lang/String;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    .line 29
    invoke-direct {p0}, Lo/bfd;-><init>()V

    .line 151
    const/4 v0, 0x0

    iput-boolean v0, p0, Lo/bfj;->m:Z

    .line 156
    const/4 v0, 0x0

    iput-boolean v0, p0, Lo/bfj;->n:Z

    .line 161
    const/4 v0, 0x0

    iput-boolean v0, p0, Lo/bfj;->p:Z

    return-void
.end method

.method private a(Lo/bmy;)V
    .locals 4

    .line 414
    iget-object v0, p0, Lo/bfj;->r:Ljava/util/List;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lo/bfj;->r:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-nez v0, :cond_1

    .line 416
    :cond_0
    iget-object v0, p0, Lo/bfj;->k:Ljava/lang/String;

    invoke-virtual {p1, v0}, Lo/bmy;->setText(Ljava/lang/CharSequence;)V

    goto :goto_1

    .line 420
    :cond_1
    new-instance v1, Landroid/text/SpannableStringBuilder;

    iget-object v0, p0, Lo/bfj;->k:Ljava/lang/String;

    invoke-direct {v1, v0}, Landroid/text/SpannableStringBuilder;-><init>(Ljava/lang/CharSequence;)V

    .line 421
    iget-object v0, p0, Lo/bfj;->r:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v3, v0

    check-cast v3, Lo/bff;

    .line 423
    iget-object v0, p0, Lo/bfj;->k:Ljava/lang/String;

    invoke-virtual {v3, p1, v1, v0}, Lo/bff;->d(Landroid/widget/TextView;Landroid/text/SpannableStringBuilder;Ljava/lang/String;)Landroid/text/SpannableStringBuilder;

    move-result-object v1

    .line 424
    goto :goto_0

    .line 425
    :cond_2
    invoke-virtual {p1, v1}, Lo/bmy;->setText(Ljava/lang/CharSequence;)V

    .line 427
    :goto_1
    return-void
.end method

.method private b(Lo/bmy;)V
    .locals 2

    .line 390
    invoke-virtual {p1}, Lo/bmy;->getPaint()Landroid/text/TextPaint;

    move-result-object v1

    .line 391
    iget-boolean v0, p0, Lo/bfj;->m:Z

    if-eqz v0, :cond_0

    .line 393
    const/4 v0, 0x1

    invoke-virtual {v1, v0}, Landroid/text/TextPaint;->setFakeBoldText(Z)V

    .line 395
    :cond_0
    iget-boolean v0, p0, Lo/bfj;->n:Z

    if-eqz v0, :cond_1

    .line 399
    const/high16 v0, -0x41800000    # -0.25f

    invoke-virtual {v1, v0}, Landroid/text/TextPaint;->setTextSkewX(F)V

    .line 401
    :cond_1
    iget-boolean v0, p0, Lo/bfj;->p:Z

    if-eqz v0, :cond_2

    .line 403
    const/4 v0, 0x1

    invoke-virtual {v1, v0}, Landroid/text/TextPaint;->setUnderlineText(Z)V

    .line 405
    :cond_2
    return-void
.end method

.method private b(Lorg/xmlpull/v1/XmlPullParser;I)V
    .locals 3

    .line 224
    const-string v2, ""

    .line 225
    const-string v0, "font_size"

    invoke-interface {p1, p2}, Lorg/xmlpull/v1/XmlPullParser;->getAttributeName(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 227
    invoke-interface {p1, p2}, Lorg/xmlpull/v1/XmlPullParser;->getAttributeValue(I)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lo/bfj;->o:Ljava/lang/String;

    goto/16 :goto_0

    .line 229
    :cond_0
    const-string v0, "color"

    invoke-interface {p1, p2}, Lorg/xmlpull/v1/XmlPullParser;->getAttributeName(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 231
    invoke-interface {p1, p2}, Lorg/xmlpull/v1/XmlPullParser;->getAttributeValue(I)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lo/bfj;->l:Ljava/lang/String;

    goto :goto_0

    .line 233
    :cond_1
    const-string v0, "italic"

    invoke-interface {p1, p2}, Lorg/xmlpull/v1/XmlPullParser;->getAttributeName(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 235
    invoke-interface {p1, p2}, Lorg/xmlpull/v1/XmlPullParser;->getAttributeValue(I)Ljava/lang/String;

    move-result-object v2

    .line 236
    const-string v0, "true"

    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_4

    .line 238
    const/4 v0, 0x1

    iput-boolean v0, p0, Lo/bfj;->n:Z

    goto :goto_0

    .line 241
    :cond_2
    const-string v0, "strong"

    invoke-interface {p1, p2}, Lorg/xmlpull/v1/XmlPullParser;->getAttributeName(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 243
    invoke-interface {p1, p2}, Lorg/xmlpull/v1/XmlPullParser;->getAttributeValue(I)Ljava/lang/String;

    move-result-object v2

    .line 244
    const-string v0, "true"

    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_4

    .line 246
    const/4 v0, 0x1

    iput-boolean v0, p0, Lo/bfj;->m:Z

    goto :goto_0

    .line 249
    :cond_3
    const-string v0, "underline"

    invoke-interface {p1, p2}, Lorg/xmlpull/v1/XmlPullParser;->getAttributeName(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_4

    .line 251
    invoke-interface {p1, p2}, Lorg/xmlpull/v1/XmlPullParser;->getAttributeValue(I)Ljava/lang/String;

    move-result-object v2

    .line 252
    const-string v0, "true"

    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_4

    .line 254
    const/4 v0, 0x1

    iput-boolean v0, p0, Lo/bfj;->p:Z

    .line 257
    :cond_4
    :goto_0
    return-void
.end method

.method private b(Ljava/lang/String;)Z
    .locals 2

    .line 336
    const/4 v1, 0x1

    .line 337
    const-string v0, "text_item"

    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    const-string v0, "text_key"

    .line 338
    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    const-string v0, "text_value"

    .line 339
    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 341
    :cond_0
    const/4 v1, 0x0

    .line 343
    :cond_1
    return v1
.end method

.method private c(Landroid/content/Context;Lo/bmy;)V
    .locals 4

    .line 535
    iget-object v0, p0, Lo/bfj;->i:Ljava/lang/String;

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 539
    :try_start_0
    iget-object v0, p0, Lo/bfj;->i:Ljava/lang/String;

    const-string v1, "dp"

    invoke-virtual {v0, v1}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    aget-object v0, v0, v1

    invoke-static {v0}, Ljava/lang/Float;->valueOf(Ljava/lang/String;)Ljava/lang/Float;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Float;->floatValue()F

    move-result v0

    invoke-virtual {p0, p1, v0}, Lo/bfj;->e(Landroid/content/Context;F)I

    move-result v0

    invoke-virtual {p2, v0}, Lo/bmy;->setWidth(I)V
    :try_end_0
    .catch Ljava/lang/NumberFormatException; {:try_start_0 .. :try_end_0} :catch_0

    .line 544
    goto :goto_0

    .line 541
    :catch_0
    move-exception v3

    .line 543
    sget-object v0, Lo/bfj;->e:Ljava/lang/String;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "setWidth:NumberFormatException.width:"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget-object v2, p0, Lo/bfj;->i:Ljava/lang/String;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/bpf;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 546
    :cond_0
    :goto_0
    return-void
.end method

.method private c(Lo/bmy;)V
    .locals 6

    .line 436
    const/4 v3, 0x0

    .line 437
    const/high16 v4, 0x3f800000    # 1.0f

    .line 440
    :try_start_0
    iget-object v0, p0, Lo/bfj;->f:Ljava/lang/String;

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lo/bfj;->f:Ljava/lang/String;

    const-string v1, "dp"

    invoke-virtual {v0, v1}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 442
    invoke-virtual {p1}, Lo/bmy;->getContext()Landroid/content/Context;

    move-result-object v0

    iget-object v1, p0, Lo/bfj;->f:Ljava/lang/String;

    const-string v2, "dp"

    invoke-virtual {v1, v2}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x0

    aget-object v1, v1, v2

    invoke-static {v1}, Ljava/lang/Float;->valueOf(Ljava/lang/String;)Ljava/lang/Float;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Float;->floatValue()F

    move-result v1

    invoke-virtual {p0, v0, v1}, Lo/bfj;->e(Landroid/content/Context;F)I

    move-result v0

    int-to-float v3, v0

    .line 444
    :cond_0
    iget-object v0, p0, Lo/bfj;->g:Ljava/lang/String;

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 446
    iget-object v0, p0, Lo/bfj;->g:Ljava/lang/String;

    invoke-static {v0}, Ljava/lang/Float;->valueOf(Ljava/lang/String;)Ljava/lang/Float;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Float;->floatValue()F

    move-result v4

    .line 449
    :cond_1
    invoke-virtual {p1, v3, v4}, Lo/bmy;->setLineSpacing(FF)V
    :try_end_0
    .catch Ljava/lang/NumberFormatException; {:try_start_0 .. :try_end_0} :catch_0

    .line 454
    goto :goto_0

    .line 451
    :catch_0
    move-exception v5

    .line 453
    sget-object v0, Lo/bfj;->e:Ljava/lang/String;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "setTextLineSpace:NumberFormatException, lineSpaceExtra:"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget-object v2, p0, Lo/bfj;->f:Ljava/lang/String;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, ",lineSpaceMultiple:"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget-object v2, p0, Lo/bfj;->g:Ljava/lang/String;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/bpf;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 455
    :goto_0
    return-void
.end method

.method private d(Lo/bmy;)V
    .locals 4

    .line 491
    iget-object v0, p0, Lo/bfj;->l:Ljava/lang/String;

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 495
    :try_start_0
    iget-object v0, p0, Lo/bfj;->l:Ljava/lang/String;

    invoke-static {v0}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v0

    invoke-virtual {p1, v0}, Lo/bmy;->setTextColor(I)V
    :try_end_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_0

    .line 500
    goto :goto_0

    .line 497
    :catch_0
    move-exception v3

    .line 499
    sget-object v0, Lo/bfj;->e:Ljava/lang/String;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "setTextColor:IllegalArgumentException, color:"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget-object v2, p0, Lo/bfj;->l:Ljava/lang/String;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/bpf;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 502
    :cond_0
    :goto_0
    return-void
.end method

.method private e(Lo/bmy;)V
    .locals 4

    .line 464
    iget-object v0, p0, Lo/bfj;->o:Ljava/lang/String;

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_2

    .line 468
    :try_start_0
    iget-object v0, p0, Lo/bfj;->o:Ljava/lang/String;

    const-string v1, "sp"

    invoke-virtual {v0, v1}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 470
    iget-object v0, p0, Lo/bfj;->o:Ljava/lang/String;

    const-string v1, "sp"

    invoke-virtual {v0, v1}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    aget-object v0, v0, v1

    invoke-static {v0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v0

    int-to-float v0, v0

    const/4 v1, 0x2

    invoke-virtual {p1, v1, v0}, Lo/bmy;->setTextSize(IF)V

    goto :goto_0

    .line 472
    :cond_0
    iget-object v0, p0, Lo/bfj;->o:Ljava/lang/String;

    const-string v1, "dp"

    invoke-virtual {v0, v1}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 474
    iget-object v0, p0, Lo/bfj;->o:Ljava/lang/String;

    const-string v1, "dp"

    invoke-virtual {v0, v1}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    aget-object v0, v0, v1

    invoke-static {v0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v0

    int-to-float v0, v0

    const/4 v1, 0x1

    invoke-virtual {p1, v1, v0}, Lo/bmy;->setTextSize(IF)V
    :try_end_0
    .catch Ljava/lang/NumberFormatException; {:try_start_0 .. :try_end_0} :catch_0

    .line 480
    :cond_1
    :goto_0
    goto :goto_1

    .line 477
    :catch_0
    move-exception v3

    .line 479
    sget-object v0, Lo/bfj;->e:Ljava/lang/String;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "setTextFontSize:NumberFormatException, fontSize:"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget-object v2, p0, Lo/bfj;->o:Ljava/lang/String;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/bpf;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 482
    :cond_2
    :goto_1
    return-void
.end method

.method private h(Lo/bmy;)V
    .locals 3
    .annotation build Landroid/annotation/TargetApi;
        value = 0x11
    .end annotation

    .line 513
    const/4 v2, 0x2

    .line 514
    const-string v0, "center"

    iget-object v1, p0, Lo/bfj;->h:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 516
    const/4 v2, 0x4

    goto :goto_0

    .line 518
    :cond_0
    const-string v0, "right"

    iget-object v1, p0, Lo/bfj;->h:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 520
    const/4 v2, 0x3

    .line 523
    :cond_1
    :goto_0
    invoke-virtual {p1, v2}, Lo/bmy;->setTextAlignment(I)V

    .line 524
    return-void
.end method


# virtual methods
.method protected a(Lorg/xmlpull/v1/XmlPullParser;)V
    .locals 3

    .line 176
    const/4 v2, 0x0

    :goto_0
    invoke-interface {p1}, Lorg/xmlpull/v1/XmlPullParser;->getAttributeCount()I

    move-result v0

    if-ge v2, v0, :cond_8

    .line 178
    const-string v0, "width"

    invoke-interface {p1, v2}, Lorg/xmlpull/v1/XmlPullParser;->getAttributeName(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 180
    invoke-interface {p1, v2}, Lorg/xmlpull/v1/XmlPullParser;->getAttributeValue(I)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lo/bfj;->i:Ljava/lang/String;

    goto/16 :goto_1

    .line 182
    :cond_0
    const-string v0, "margin_left"

    invoke-interface {p1, v2}, Lorg/xmlpull/v1/XmlPullParser;->getAttributeName(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 184
    invoke-interface {p1, v2}, Lorg/xmlpull/v1/XmlPullParser;->getAttributeValue(I)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lo/bfj;->d:Ljava/lang/String;

    goto/16 :goto_1

    .line 186
    :cond_1
    const-string v0, "margin_top"

    invoke-interface {p1, v2}, Lorg/xmlpull/v1/XmlPullParser;->getAttributeName(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 188
    invoke-interface {p1, v2}, Lorg/xmlpull/v1/XmlPullParser;->getAttributeValue(I)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lo/bfj;->c:Ljava/lang/String;

    goto/16 :goto_1

    .line 190
    :cond_2
    const-string v0, "margin_right"

    invoke-interface {p1, v2}, Lorg/xmlpull/v1/XmlPullParser;->getAttributeName(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 192
    invoke-interface {p1, v2}, Lorg/xmlpull/v1/XmlPullParser;->getAttributeValue(I)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lo/bfj;->a:Ljava/lang/String;

    goto :goto_1

    .line 194
    :cond_3
    const-string v0, "margin_bottom"

    invoke-interface {p1, v2}, Lorg/xmlpull/v1/XmlPullParser;->getAttributeName(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_4

    .line 196
    invoke-interface {p1, v2}, Lorg/xmlpull/v1/XmlPullParser;->getAttributeValue(I)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lo/bfj;->b:Ljava/lang/String;

    goto :goto_1

    .line 198
    :cond_4
    const-string v0, "align"

    invoke-interface {p1, v2}, Lorg/xmlpull/v1/XmlPullParser;->getAttributeName(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_5

    .line 200
    invoke-interface {p1, v2}, Lorg/xmlpull/v1/XmlPullParser;->getAttributeValue(I)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lo/bfj;->h:Ljava/lang/String;

    goto :goto_1

    .line 202
    :cond_5
    const-string v0, "line_space_dp"

    invoke-interface {p1, v2}, Lorg/xmlpull/v1/XmlPullParser;->getAttributeName(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_6

    .line 204
    invoke-interface {p1, v2}, Lorg/xmlpull/v1/XmlPullParser;->getAttributeValue(I)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lo/bfj;->f:Ljava/lang/String;

    goto :goto_1

    .line 206
    :cond_6
    const-string v0, "line_space_multiple"

    invoke-interface {p1, v2}, Lorg/xmlpull/v1/XmlPullParser;->getAttributeName(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_7

    .line 208
    invoke-interface {p1, v2}, Lorg/xmlpull/v1/XmlPullParser;->getAttributeValue(I)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lo/bfj;->g:Ljava/lang/String;

    goto :goto_1

    .line 212
    :cond_7
    invoke-direct {p0, p1, v2}, Lo/bfj;->b(Lorg/xmlpull/v1/XmlPullParser;I)V

    .line 176
    :goto_1
    add-int/lit8 v2, v2, 0x1

    goto/16 :goto_0

    .line 215
    :cond_8
    return-void
.end method

.method public c(Landroid/content/Context;Landroid/view/ViewGroup;)Landroid/view/View;
    .locals 4

    .line 355
    iget-object v0, p0, Lo/bfj;->k:Ljava/lang/String;

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 357
    const/4 v0, 0x0

    return-object v0

    .line 359
    :cond_0
    new-instance v2, Lo/bmy;

    invoke-direct {v2, p1}, Lo/bmy;-><init>(Landroid/content/Context;)V

    .line 361
    const/4 v0, 0x0

    invoke-virtual {v2, v0}, Lo/bmy;->setSingleLine(Z)V

    .line 363
    invoke-direct {p0, p1, v2}, Lo/bfj;->c(Landroid/content/Context;Lo/bmy;)V

    .line 365
    invoke-direct {p0, v2}, Lo/bfj;->h(Lo/bmy;)V

    .line 367
    invoke-direct {p0, v2}, Lo/bfj;->c(Lo/bmy;)V

    .line 369
    invoke-direct {p0, v2}, Lo/bfj;->d(Lo/bmy;)V

    .line 371
    invoke-direct {p0, v2}, Lo/bfj;->e(Lo/bmy;)V

    .line 373
    invoke-direct {p0, v2}, Lo/bfj;->b(Lo/bmy;)V

    .line 375
    invoke-direct {p0, v2}, Lo/bfj;->a(Lo/bmy;)V

    .line 377
    new-instance v3, Landroid/widget/LinearLayout$LayoutParams;

    const/4 v0, -0x2

    const/4 v1, -0x2

    invoke-direct {v3, v0, v1}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    .line 378
    invoke-virtual {p0, p1, v3}, Lo/bfj;->a(Landroid/content/Context;Landroid/widget/LinearLayout$LayoutParams;)V

    .line 379
    invoke-virtual {p2, v2, v3}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 381
    return-object v2
.end method

.method public d(Lorg/xmlpull/v1/XmlPullParser;)V
    .locals 6
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/xmlpull/v1/XmlPullParserException;,
            Ljava/io/IOException;
        }
    .end annotation

    .line 268
    const/4 v0, 0x0

    if-eq v0, p1, :cond_4

    .line 270
    invoke-virtual {p0, p1}, Lo/bfj;->a(Lorg/xmlpull/v1/XmlPullParser;)V

    .line 271
    const/4 v1, 0x1

    .line 272
    invoke-interface {p1}, Lorg/xmlpull/v1/XmlPullParser;->next()I

    .line 273
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 274
    const/4 v3, 0x0

    .line 275
    invoke-interface {p1}, Lorg/xmlpull/v1/XmlPullParser;->getEventType()I

    move-result v4

    :goto_0
    if-eqz v1, :cond_3

    .line 277
    invoke-interface {p1}, Lorg/xmlpull/v1/XmlPullParser;->getName()Ljava/lang/String;

    move-result-object v5

    .line 278
    packed-switch v4, :pswitch_data_0

    goto/16 :goto_1

    .line 282
    :pswitch_0
    const-string v0, "text_format"

    invoke-virtual {v0, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 284
    new-instance v3, Lo/bff;

    invoke-direct {v3}, Lo/bff;-><init>()V

    .line 285
    invoke-virtual {v3, p1}, Lo/bff;->c(Lorg/xmlpull/v1/XmlPullParser;)V

    .line 286
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v0

    invoke-virtual {v3, v0}, Lo/bff;->b(I)V

    .line 287
    invoke-virtual {v3}, Lo/bff;->c()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 288
    iget-object v0, p0, Lo/bfj;->r:Ljava/util/List;

    if-nez v0, :cond_0

    .line 290
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lo/bfj;->r:Ljava/util/List;

    .line 292
    :cond_0
    iget-object v0, p0, Lo/bfj;->r:Ljava/util/List;

    invoke-interface {v0, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_1

    .line 298
    :pswitch_1
    invoke-interface {p1}, Lorg/xmlpull/v1/XmlPullParser;->getText()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 299
    goto :goto_1

    .line 303
    :pswitch_2
    invoke-static {v5}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 306
    invoke-direct {p0, v5}, Lo/bfj;->b(Ljava/lang/String;)Z

    move-result v1

    goto :goto_1

    .line 312
    :pswitch_3
    const/4 v1, 0x0

    .line 313
    .line 320
    :cond_1
    :goto_1
    if-eqz v1, :cond_2

    .line 322
    invoke-interface {p1}, Lorg/xmlpull/v1/XmlPullParser;->next()I

    move-result v4

    .line 324
    :cond_2
    goto/16 :goto_0

    .line 325
    :cond_3
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lo/bfj;->k:Ljava/lang/String;

    .line 327
    :cond_4
    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_3
        :pswitch_0
        :pswitch_2
        :pswitch_1
    .end packed-switch
.end method
