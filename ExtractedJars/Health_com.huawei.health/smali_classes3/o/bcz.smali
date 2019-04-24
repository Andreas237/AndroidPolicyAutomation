.class public Lo/bcz;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private a:Lo/bdd;

.field private b:Lo/bms;

.field protected c:Ljava/lang/String;

.field protected d:Lo/bfb;

.field private e:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<Lcom/huawei/health/sns/model/chat/AssistantMenu;>;"
        }
    .end annotation
.end field

.field private f:Landroid/view/View$OnClickListener;

.field private g:J

.field private h:Landroid/app/Activity;

.field private i:I

.field private k:Landroid/graphics/Paint;


# direct methods
.method public constructor <init>(Landroid/app/Activity;)V
    .locals 1

    .line 91
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 43
    const/4 v0, 0x0

    iput-object v0, p0, Lo/bcz;->a:Lo/bdd;

    .line 83
    const/4 v0, 0x0

    iput-object v0, p0, Lo/bcz;->c:Ljava/lang/String;

    .line 137
    new-instance v0, Lo/bcz$1;

    invoke-direct {v0, p0}, Lo/bcz$1;-><init>(Lo/bcz;)V

    iput-object v0, p0, Lo/bcz;->f:Landroid/view/View$OnClickListener;

    .line 92
    iput-object p1, p0, Lo/bcz;->h:Landroid/app/Activity;

    .line 93
    new-instance v0, Lo/bdd;

    invoke-direct {v0, p1}, Lo/bdd;-><init>(Landroid/app/Activity;)V

    iput-object v0, p0, Lo/bcz;->a:Lo/bdd;

    .line 94
    return-void
.end method

.method private b(IZ)V
    .locals 0

    .line 412
    if-lez p1, :cond_0

    .line 414
    if-eqz p2, :cond_1

    .line 416
    invoke-direct {p0}, Lo/bcz;->f()V

    goto :goto_0

    .line 421
    :cond_0
    invoke-direct {p0}, Lo/bcz;->h()V

    .line 423
    :cond_1
    :goto_0
    return-void
.end method

.method private b(Lcom/huawei/health/sns/model/chat/AssistantMenu;)V
    .locals 3

    .line 187
    if-nez p1, :cond_0

    .line 189
    return-void

    .line 191
    :cond_0
    invoke-virtual {p1}, Lcom/huawei/health/sns/model/chat/AssistantMenu;->getType()Ljava/lang/String;

    move-result-object v2

    .line 192
    const-string v0, "click"

    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 194
    new-instance v0, Lo/bda;

    invoke-direct {v0}, Lo/bda;-><init>()V

    invoke-virtual {p1}, Lcom/huawei/health/sns/model/chat/AssistantMenu;->getKey()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/bda;->e(Ljava/lang/String;)Lcom/huawei/health/sns/model/chat/MessageItem;

    move-result-object v0

    invoke-direct {p0, v0}, Lo/bcz;->d(Lcom/huawei/health/sns/model/chat/MessageItem;)V

    goto :goto_0

    .line 196
    :cond_1
    const-string v0, "view"

    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 198
    invoke-virtual {p1}, Lcom/huawei/health/sns/model/chat/AssistantMenu;->getUrl()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Lo/bcz;->d(Ljava/lang/String;)V

    .line 200
    :cond_2
    :goto_0
    invoke-direct {p0, p1}, Lo/bcz;->e(Lcom/huawei/health/sns/model/chat/AssistantMenu;)V

    .line 201
    return-void
.end method

.method private c(Landroid/view/View;Ljava/util/ArrayList;)I
    .locals 9
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "InflateParams"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Landroid/view/View;Ljava/util/ArrayList<Lcom/huawei/health/sns/model/chat/AssistantMenu;>;)I"
        }
    .end annotation

    .line 291
    iget-object v0, p0, Lo/bcz;->d:Lo/bfb;

    invoke-virtual {v0}, Lo/bfb;->getMenuLocation()[I

    move-result-object v2

    .line 292
    const/4 v0, 0x0

    aget v3, v2, v0

    .line 293
    invoke-virtual {p1}, Landroid/view/View;->getX()F

    move-result v0

    float-to-int v0, v0

    add-int v4, v0, v3

    .line 294
    invoke-virtual {p1}, Landroid/view/View;->getWidth()I

    move-result v5

    .line 295
    iget-object v0, p0, Lo/bcz;->k:Landroid/graphics/Paint;

    if-nez v0, :cond_0

    .line 297
    iget-object v0, p0, Lo/bcz;->h:Landroid/app/Activity;

    invoke-static {v0}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v6

    .line 298
    sget v0, Lcom/huawei/android/sns/R$layout;->sns_assist_pop_menu_listitem:I

    const/4 v1, 0x0

    invoke-virtual {v6, v0, v1}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v7

    .line 299
    sget v0, Lcom/huawei/android/sns/R$id;->menu_item_tv:I

    invoke-virtual {v7, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    move-object v8, v0

    check-cast v8, Landroid/widget/TextView;

    .line 300
    invoke-virtual {v8}, Landroid/widget/TextView;->getPaint()Landroid/text/TextPaint;

    move-result-object v0

    iput-object v0, p0, Lo/bcz;->k:Landroid/graphics/Paint;

    .line 301
    invoke-virtual {v8}, Landroid/widget/TextView;->getPaddingLeft()I

    move-result v0

    iput v0, p0, Lo/bcz;->i:I

    .line 305
    :cond_0
    const/4 v6, 0x0

    .line 306
    const/4 v7, 0x0

    :goto_0
    invoke-virtual {p2}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-ge v7, v0, :cond_2

    .line 308
    iget-object v0, p0, Lo/bcz;->k:Landroid/graphics/Paint;

    invoke-virtual {p2, v7}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/huawei/health/sns/model/chat/AssistantMenu;

    invoke-virtual {v1}, Lcom/huawei/health/sns/model/chat/AssistantMenu;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->measureText(Ljava/lang/String;)F

    move-result v0

    float-to-int v8, v0

    .line 309
    if-le v8, v6, :cond_1

    .line 311
    move v6, v8

    .line 306
    :cond_1
    add-int/lit8 v7, v7, 0x1

    goto :goto_0

    .line 316
    :cond_2
    iget v0, p0, Lo/bcz;->i:I

    mul-int/lit8 v0, v0, 0x2

    add-int/2addr v6, v0

    .line 318
    sub-int v0, v5, v6

    div-int/lit8 v0, v0, 0x2

    add-int v7, v4, v0

    .line 321
    const/16 v0, 0x14

    if-ge v7, v0, :cond_3

    .line 323
    const/16 v7, 0x14

    .line 326
    :cond_3
    iget-object v0, p0, Lo/bcz;->h:Landroid/app/Activity;

    invoke-static {v0}, Lo/boi;->c(Landroid/app/Activity;)I

    move-result v8

    .line 328
    add-int v0, v7, v6

    if-le v0, v8, :cond_4

    .line 330
    sub-int v0, v8, v6

    add-int/lit8 v7, v0, -0x14

    .line 332
    :cond_4
    return v7
.end method

.method private c(Lcom/huawei/health/sns/model/chat/AssistantMenu;)Ljava/lang/String;
    .locals 4

    .line 358
    const-string v3, ""

    .line 359
    if-eqz p1, :cond_0

    .line 361
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p1}, Lcom/huawei/health/sns/model/chat/AssistantMenu;->getxPosition()I

    move-result v1

    invoke-static {v1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {p1}, Lcom/huawei/health/sns/model/chat/AssistantMenu;->getyPosition()I

    move-result v1

    invoke-static {v1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    .line 363
    :cond_0
    const-string v0, "AssistantChatMenu"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "getMenuId id is "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/bpf;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 364
    return-object v3
.end method

.method private c(Landroid/view/View;Lcom/huawei/health/sns/model/chat/AssistantMenu;)V
    .locals 8

    .line 243
    invoke-virtual {p2}, Lcom/huawei/health/sns/model/chat/AssistantMenu;->getSub_button()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 245
    const-string v0, "AssistantChatMenu"

    const-string v1, "showPopWindow error , subMenuStr is null"

    invoke-static {v0, v1}, Lo/bpf;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 246
    return-void

    .line 248
    :cond_0
    invoke-virtual {p2}, Lcom/huawei/health/sns/model/chat/AssistantMenu;->getSub_button()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p2}, Lcom/huawei/health/sns/model/chat/AssistantMenu;->getxPosition()I

    move-result v1

    invoke-static {v0, v1}, Lcom/huawei/health/sns/model/chat/AssistantMenu;->parseAssistSubMenu(Ljava/lang/String;I)Ljava/util/ArrayList;

    move-result-object v4

    .line 249
    invoke-virtual {v4}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 251
    return-void

    .line 253
    :cond_1
    iget-object v0, p0, Lo/bcz;->b:Lo/bms;

    if-nez v0, :cond_2

    .line 255
    new-instance v0, Lo/bms;

    iget-object v1, p0, Lo/bcz;->h:Landroid/app/Activity;

    invoke-static {}, Lo/bom;->i()Z

    move-result v2

    new-instance v3, Lo/bcz$4;

    invoke-direct {v3, p0}, Lo/bcz$4;-><init>(Lo/bcz;)V

    invoke-direct {v0, v1, v2, v3}, Lo/bms;-><init>(Landroid/content/Context;ZLo/bms$b;)V

    .line 263
    invoke-virtual {v0, v4}, Lo/bms;->b(Ljava/util/ArrayList;)Lo/bms;

    move-result-object v0

    invoke-virtual {v0}, Lo/bms;->b()Lo/bms;

    move-result-object v0

    iput-object v0, p0, Lo/bcz;->b:Lo/bms;

    goto :goto_0

    .line 267
    :cond_2
    iget-object v0, p0, Lo/bcz;->b:Lo/bms;

    invoke-virtual {v0, v4}, Lo/bms;->b(Ljava/util/ArrayList;)Lo/bms;

    .line 270
    :goto_0
    invoke-direct {p0, p1, v4}, Lo/bcz;->c(Landroid/view/View;Ljava/util/ArrayList;)I

    move-result v5

    .line 271
    iget-object v0, p0, Lo/bcz;->d:Lo/bfb;

    invoke-virtual {v0}, Lo/bfb;->getHeight()I

    move-result v6

    .line 273
    iget-object v0, p0, Lo/bcz;->h:Landroid/app/Activity;

    invoke-virtual {v0}, Landroid/app/Activity;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/android/sns/R$dimen;->sns_assist_submenu_height:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    move-result v7

    .line 274
    invoke-virtual {v4}, Ljava/util/ArrayList;->size()I

    move-result v0

    mul-int/2addr v0, v7

    add-int/2addr v6, v0

    .line 275
    iget-object v0, p0, Lo/bcz;->h:Landroid/app/Activity;

    invoke-virtual {v0}, Landroid/app/Activity;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/android/sns/R$dimen;->sns_toolbar_list_margin:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    move-result v0

    add-int/2addr v6, v0

    .line 276
    iget-object v0, p0, Lo/bcz;->b:Lo/bms;

    invoke-virtual {v0, v5, v6}, Lo/bms;->d(II)Lo/bms;

    .line 277
    iget-object v0, p0, Lo/bcz;->b:Lo/bms;

    iget-object v1, p0, Lo/bcz;->d:Lo/bfb;

    invoke-virtual {v0, v1}, Lo/bms;->b(Landroid/view/View;)V

    .line 278
    return-void
.end method

.method private d(Lcom/huawei/health/sns/model/chat/MessageItem;)V
    .locals 3

    .line 228
    const/4 v0, 0x0

    if-ne v0, p1, :cond_0

    .line 230
    const-string v0, "AssistantChatMenu"

    const-string v1, "the param for sendMessage is null. there may be something wrong."

    invoke-static {v0, v1}, Lo/bpf;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 231
    return-void

    .line 233
    :cond_0
    new-instance v0, Lo/bda;

    invoke-direct {v0}, Lo/bda;-><init>()V

    iget-wide v1, p0, Lo/bcz;->g:J

    invoke-virtual {v0, p1, v1, v2}, Lo/bda;->c(Lcom/huawei/health/sns/model/chat/MessageItem;J)V

    .line 234
    return-void
.end method

.method static synthetic e(Lo/bcz;)Ljava/util/ArrayList;
    .locals 1

    .line 32
    iget-object v0, p0, Lo/bcz;->e:Ljava/util/ArrayList;

    return-object v0
.end method

.method private e(Lcom/huawei/health/sns/model/chat/AssistantMenu;)V
    .locals 9

    .line 342
    if-nez p1, :cond_0

    .line 344
    return-void

    .line 346
    :cond_0
    invoke-static {}, Lo/aow;->e()Lo/aow;

    move-result-object v0

    iget-object v1, p0, Lo/bcz;->h:Landroid/app/Activity;

    iget-wide v2, p0, Lo/bcz;->g:J

    .line 347
    invoke-static {}, Lo/aoq;->e()Lo/aoq;

    move-result-object v4

    invoke-virtual {v4}, Lo/aoq;->a()J

    move-result-wide v4

    invoke-direct {p0, p1}, Lo/bcz;->c(Lcom/huawei/health/sns/model/chat/AssistantMenu;)Ljava/lang/String;

    move-result-object v6

    invoke-virtual {p1}, Lcom/huawei/health/sns/model/chat/AssistantMenu;->getName()Ljava/lang/String;

    move-result-object v7

    iget-object v8, p0, Lo/bcz;->c:Ljava/lang/String;

    .line 346
    invoke-virtual/range {v0 .. v8}, Lo/aow;->e(Landroid/content/Context;JJLjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 348
    return-void
.end method

.method static synthetic e(Lo/bcz;Lcom/huawei/health/sns/model/chat/AssistantMenu;)V
    .locals 0

    .line 32
    invoke-direct {p0, p1}, Lo/bcz;->b(Lcom/huawei/health/sns/model/chat/AssistantMenu;)V

    return-void
.end method

.method private f()V
    .locals 1

    .line 431
    invoke-virtual {p0}, Lo/bcz;->c()Z

    move-result v0

    if-nez v0, :cond_0

    .line 433
    invoke-direct {p0}, Lo/bcz;->h()V

    .line 434
    return-void

    .line 437
    :cond_0
    invoke-direct {p0}, Lo/bcz;->g()V

    .line 438
    return-void
.end method

.method private g()V
    .locals 2

    .line 445
    iget-object v0, p0, Lo/bcz;->d:Lo/bfb;

    sget-object v1, Lo/bfb$e;->b:Lo/bfb$e;

    invoke-virtual {v0, v1}, Lo/bfb;->c(Lo/bfb$e;)V

    .line 446
    return-void
.end method

.method private h()V
    .locals 2

    .line 464
    iget-object v0, p0, Lo/bcz;->d:Lo/bfb;

    sget-object v1, Lo/bfb$e;->c:Lo/bfb$e;

    invoke-virtual {v0, v1}, Lo/bfb;->c(Lo/bfb$e;)V

    .line 466
    return-void
.end method


# virtual methods
.method public a()V
    .locals 1

    .line 218
    iget-object v0, p0, Lo/bcz;->a:Lo/bdd;

    invoke-virtual {v0}, Lo/bdd;->b()V

    .line 219
    return-void
.end method

.method public a(Lo/bfb;)V
    .locals 1

    .line 114
    sget-object v0, Lo/bfb$e;->e:Lo/bfb$e;

    invoke-virtual {p1, v0}, Lo/bfb;->c(Lo/bfb$e;)V

    .line 115
    iput-object p1, p0, Lo/bcz;->d:Lo/bfb;

    .line 116
    return-void
.end method

.method public b()V
    .locals 1

    .line 453
    invoke-virtual {p0}, Lo/bcz;->c()Z

    move-result v0

    if-nez v0, :cond_0

    .line 455
    invoke-direct {p0}, Lo/bcz;->h()V

    .line 457
    :cond_0
    return-void
.end method

.method protected b(Landroid/view/View;Lcom/huawei/health/sns/model/chat/AssistantMenu;)V
    .locals 2

    .line 164
    invoke-virtual {p2}, Lcom/huawei/health/sns/model/chat/AssistantMenu;->getSub_button()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 165
    invoke-virtual {p2}, Lcom/huawei/health/sns/model/chat/AssistantMenu;->getSub_button()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p2}, Lcom/huawei/health/sns/model/chat/AssistantMenu;->getxPosition()I

    move-result v1

    .line 164
    invoke-static {v0, v1}, Lcom/huawei/health/sns/model/chat/AssistantMenu;->parseAssistSubMenu(Ljava/lang/String;I)Ljava/util/ArrayList;

    move-result-object v0

    .line 165
    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_0

    .line 167
    invoke-direct {p0, p1, p2}, Lo/bcz;->c(Landroid/view/View;Lcom/huawei/health/sns/model/chat/AssistantMenu;)V

    .line 168
    invoke-direct {p0, p2}, Lo/bcz;->e(Lcom/huawei/health/sns/model/chat/AssistantMenu;)V

    goto :goto_0

    .line 172
    :cond_0
    invoke-virtual {p2}, Lcom/huawei/health/sns/model/chat/AssistantMenu;->getType()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 174
    invoke-direct {p0, p2}, Lo/bcz;->b(Lcom/huawei/health/sns/model/chat/AssistantMenu;)V

    .line 177
    :cond_1
    :goto_0
    return-void
.end method

.method public b(Lcom/huawei/health/sns/model/chat/Assistant;Z)V
    .locals 8

    .line 376
    invoke-virtual {p1}, Lcom/huawei/health/sns/model/chat/Assistant;->getMenu()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_2

    .line 378
    new-instance v3, Landroid/widget/LinearLayout$LayoutParams;

    const/4 v0, 0x0

    const/4 v1, -0x2

    const/high16 v2, 0x3f800000    # 1.0f

    invoke-direct {v3, v0, v1, v2}, Landroid/widget/LinearLayout$LayoutParams;-><init>(IIF)V

    .line 379
    invoke-virtual {p1}, Lcom/huawei/health/sns/model/chat/Assistant;->getMenu()Ljava/lang/String;

    move-result-object v4

    .line 380
    invoke-static {v4}, Lcom/huawei/health/sns/model/chat/AssistantMenu;->parseAssistMenu(Ljava/lang/String;)Ljava/util/ArrayList;

    move-result-object v0

    iput-object v0, p0, Lo/bcz;->e:Ljava/util/ArrayList;

    .line 383
    iget-object v0, p0, Lo/bcz;->e:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_0

    .line 385
    iget-object v0, p0, Lo/bcz;->d:Lo/bfb;

    invoke-virtual {v0}, Lo/bfb;->f()V

    .line 387
    :cond_0
    iget-object v0, p0, Lo/bcz;->e:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v5

    .line 388
    const/4 v6, 0x0

    :goto_0
    if-ge v6, v5, :cond_1

    .line 390
    new-instance v7, Lo/bmt;

    iget-object v0, p0, Lo/bcz;->h:Landroid/app/Activity;

    invoke-direct {v7, v0}, Lo/bmt;-><init>(Landroid/content/Context;)V

    .line 391
    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {v7, v0}, Lo/bmt;->setTag(Ljava/lang/Object;)V

    .line 392
    iget-object v0, p0, Lo/bcz;->e:Ljava/util/ArrayList;

    invoke-virtual {v0, v6}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/health/sns/model/chat/AssistantMenu;

    invoke-virtual {v7, v0}, Lo/bmt;->setMenuData(Lcom/huawei/health/sns/model/chat/AssistantMenu;)V

    .line 393
    iget-object v0, p0, Lo/bcz;->f:Landroid/view/View$OnClickListener;

    invoke-virtual {v7, v0}, Lo/bmt;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 394
    iget-object v0, p0, Lo/bcz;->d:Lo/bfb;

    invoke-virtual {v0, v7, v3}, Lo/bfb;->d(Lo/bmt;Landroid/widget/LinearLayout$LayoutParams;)V

    .line 388
    add-int/lit8 v6, v6, 0x1

    goto :goto_0

    .line 396
    :cond_1
    invoke-direct {p0, v5, p2}, Lo/bcz;->b(IZ)V

    .line 397
    goto :goto_1

    .line 400
    :cond_2
    invoke-direct {p0}, Lo/bcz;->h()V

    .line 402
    :goto_1
    return-void
.end method

.method public c(Lcom/huawei/health/sns/model/chat/Assistant;)V
    .locals 1

    .line 125
    iget-object v0, p0, Lo/bcz;->a:Lo/bdd;

    invoke-virtual {v0, p1}, Lo/bdd;->e(Lcom/huawei/health/sns/model/chat/Assistant;)V

    .line 126
    return-void
.end method

.method public c()Z
    .locals 2

    .line 510
    iget-object v0, p0, Lo/bcz;->d:Lo/bfb;

    invoke-virtual {v0}, Lo/bfb;->getInputEdit()Landroid/text/Editable;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    .line 511
    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    return v0
.end method

.method public d()V
    .locals 2

    .line 484
    iget-object v0, p0, Lo/bcz;->d:Lo/bfb;

    sget-object v1, Lo/bfb$e;->e:Lo/bfb$e;

    invoke-virtual {v0, v1}, Lo/bfb;->c(Lo/bfb$e;)V

    .line 485
    iget-object v0, p0, Lo/bcz;->d:Lo/bfb;

    invoke-virtual {v0}, Lo/bfb;->f()V

    .line 486
    return-void
.end method

.method public d(Ljava/lang/String;)V
    .locals 1

    .line 210
    iget-object v0, p0, Lo/bcz;->a:Lo/bdd;

    invoke-virtual {v0, p1}, Lo/bdd;->a(Ljava/lang/String;)V

    .line 211
    return-void
.end method

.method public d(ZLjava/lang/String;)V
    .locals 1

    .line 130
    iput-object p2, p0, Lo/bcz;->c:Ljava/lang/String;

    .line 131
    iget-object v0, p0, Lo/bcz;->a:Lo/bdd;

    invoke-virtual {v0, p1}, Lo/bdd;->e(Z)V

    .line 132
    return-void
.end method

.method public e()V
    .locals 1

    .line 473
    iget-object v0, p0, Lo/bcz;->b:Lo/bms;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lo/bcz;->b:Lo/bms;

    invoke-virtual {v0}, Lo/bms;->a()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 475
    iget-object v0, p0, Lo/bcz;->b:Lo/bms;

    invoke-virtual {v0}, Lo/bms;->c()V

    .line 477
    :cond_0
    return-void
.end method

.method public e(J)V
    .locals 1

    .line 103
    iput-wide p1, p0, Lo/bcz;->g:J

    .line 104
    iget-object v0, p0, Lo/bcz;->a:Lo/bdd;

    invoke-virtual {v0, p1, p2}, Lo/bdd;->e(J)V

    .line 105
    return-void
.end method
