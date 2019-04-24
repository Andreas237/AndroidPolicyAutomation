.class public Lo/bfb;
.super Lo/bez;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnTouchListener;
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lo/bfb$d;,
        Lo/bfb$b;,
        Lo/bfb$e;
    }
.end annotation


# static fields
.field public static final e:Ljava/lang/String;


# instance fields
.field private A:Lo/apb;

.field private B:Lo/bey;

.field private C:Landroid/widget/LinearLayout;

.field private D:Landroid/widget/ImageView;

.field private F:Landroid/widget/TextView;

.field private final b:[Ljava/lang/Integer;

.field public c:Lo/bnv$d;

.field public d:Lo/bnv;

.field private final f:[Ljava/lang/Integer;

.field private g:Landroid/os/Handler;

.field private h:I

.field private i:Landroid/content/Context;

.field private j:Landroid/widget/LinearLayout;

.field private k:I

.field private l:I

.field private m:Landroid/view/View;

.field private n:Lo/bex;

.field private o:Z

.field private p:Lo/bfb$e;

.field private q:Lo/bgj;

.field private r:Landroid/widget/GridView;

.field private s:Lo/bez;

.field private t:Landroid/widget/SimpleAdapter;

.field private u:Landroid/view/View;

.field private v:Landroid/widget/TextView;

.field private w:Lo/bng;

.field private x:Landroid/widget/ImageView;

.field private y:Landroid/view/View;

.field private z:Landroid/widget/LinearLayout;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 53
    const-class v0, Lo/bfb;

    invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lo/bfb;->e:Ljava/lang/String;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 3

    .line 336
    invoke-direct {p0, p1, p2}, Lo/bez;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 99
    const/4 v0, 0x2

    new-array v0, v0, [Ljava/lang/Integer;

    sget v1, Lcom/huawei/android/sns/R$drawable;->sns_ic_pic_selector:I

    .line 102
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const/4 v2, 0x0

    aput-object v1, v0, v2

    sget v1, Lcom/huawei/android/sns/R$drawable;->sns_ic_attach_camera_selector:I

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const/4 v2, 0x1

    aput-object v1, v0, v2

    iput-object v0, p0, Lo/bfb;->b:[Ljava/lang/Integer;

    .line 107
    const/4 v0, 0x2

    new-array v0, v0, [Ljava/lang/Integer;

    sget v1, Lcom/huawei/android/sns/R$string;->sns_local_picture:I

    .line 109
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const/4 v2, 0x0

    aput-object v1, v0, v2

    sget v1, Lcom/huawei/android/sns/R$string;->sns_take_photo:I

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const/4 v2, 0x1

    aput-object v1, v0, v2

    iput-object v0, p0, Lo/bfb;->f:[Ljava/lang/Integer;

    .line 134
    const/4 v0, 0x4

    iput v0, p0, Lo/bfb;->k:I

    .line 159
    const/4 v0, 0x1

    iput v0, p0, Lo/bfb;->h:I

    .line 179
    const/4 v0, 0x0

    iput-object v0, p0, Lo/bfb;->p:Lo/bfb$e;

    .line 184
    const/4 v0, 0x0

    iput-boolean v0, p0, Lo/bfb;->o:Z

    .line 337
    invoke-virtual {p0}, Lo/bfb;->getContext()Landroid/content/Context;

    move-result-object v0

    iput-object v0, p0, Lo/bfb;->i:Landroid/content/Context;

    .line 338
    new-instance v0, Lo/bfb$d;

    invoke-direct {v0, p0}, Lo/bfb$d;-><init>(Lo/bfb;)V

    iput-object v0, p0, Lo/bfb;->g:Landroid/os/Handler;

    .line 339
    invoke-static {p1}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v0

    sget v1, Lcom/huawei/android/sns/R$layout;->sns_input_mod_view:I

    invoke-virtual {v0, v1, p0}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    .line 340
    invoke-direct {p0}, Lo/bfb;->m()V

    .line 341
    return-void
.end method

.method private a(Lo/bfb$e;)V
    .locals 2

    .line 426
    sget-object v0, Lo/bfb$e;->a:Lo/bfb$e;

    if-ne p1, v0, :cond_0

    .line 428
    iget-object v0, p0, Lo/bfb;->s:Lo/bez;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lo/bez;->setVisibility(I)V

    .line 429
    iget-object v0, p0, Lo/bfb;->m:Landroid/view/View;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 430
    iget-object v0, p0, Lo/bfb;->y:Landroid/view/View;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    goto :goto_0

    .line 432
    :cond_0
    sget-object v0, Lo/bfb$e;->c:Lo/bfb$e;

    if-ne p1, v0, :cond_1

    .line 434
    iget-object v0, p0, Lo/bfb;->s:Lo/bez;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lo/bez;->setVisibility(I)V

    .line 435
    iget-object v0, p0, Lo/bfb;->m:Landroid/view/View;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 436
    iget-object v0, p0, Lo/bfb;->y:Landroid/view/View;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    goto :goto_0

    .line 438
    :cond_1
    sget-object v0, Lo/bfb$e;->e:Lo/bfb$e;

    if-ne p1, v0, :cond_2

    .line 440
    invoke-virtual {p0}, Lo/bfb;->d()V

    .line 441
    invoke-virtual {p0}, Lo/bfb;->k()V

    .line 442
    iget-object v0, p0, Lo/bfb;->s:Lo/bez;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Lo/bez;->setVisibility(I)V

    .line 443
    iget-object v0, p0, Lo/bfb;->y:Landroid/view/View;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    goto :goto_0

    .line 445
    :cond_2
    sget-object v0, Lo/bfb$e;->b:Lo/bfb$e;

    if-ne p1, v0, :cond_3

    .line 447
    invoke-virtual {p0}, Lo/bfb;->d()V

    .line 448
    invoke-virtual {p0}, Lo/bfb;->k()V

    .line 449
    iget-object v0, p0, Lo/bfb;->s:Lo/bez;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Lo/bez;->setVisibility(I)V

    .line 450
    iget-object v0, p0, Lo/bfb;->y:Landroid/view/View;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 452
    :cond_3
    :goto_0
    return-void
.end method

.method static synthetic a(Lo/bfb;)V
    .locals 0

    .line 51
    invoke-direct {p0}, Lo/bfb;->t()V

    return-void
.end method

.method private b(I)I
    .locals 2

    .line 651
    iget-object v0, p0, Lo/bfb;->A:Lo/apb;

    invoke-virtual {v0}, Lo/apb;->c()I

    move-result v1

    .line 652
    if-le p1, v1, :cond_0

    move v0, v1

    goto :goto_0

    :cond_0
    move v0, p1

    :goto_0
    return v0
.end method

.method static synthetic b(Lo/bfb;)Lo/bfb$e;
    .locals 1

    .line 51
    iget-object v0, p0, Lo/bfb;->p:Lo/bfb$e;

    return-object v0
.end method

.method static synthetic d(Lo/bfb;)Lo/bey;
    .locals 1

    .line 51
    iget-object v0, p0, Lo/bfb;->B:Lo/bey;

    return-object v0
.end method

.method private d(Ljava/lang/String;)V
    .locals 8

    .line 578
    iget-object v0, p0, Lo/bfb;->w:Lo/bng;

    invoke-virtual {v0}, Lo/bng;->getSelectionStart()I

    move-result v2

    .line 579
    iget-object v0, p0, Lo/bfb;->w:Lo/bng;

    invoke-virtual {v0}, Lo/bng;->getText()Landroid/text/Editable;

    move-result-object v3

    .line 580
    invoke-static {}, Landroid/text/Editable$Factory;->getInstance()Landroid/text/Editable$Factory;

    move-result-object v0

    invoke-virtual {v0, v3}, Landroid/text/Editable$Factory;->newEditable(Ljava/lang/CharSequence;)Landroid/text/Editable;

    move-result-object v4

    .line 582
    invoke-static {}, Lo/bgh;->a()Lo/bgh;

    move-result-object v0

    sget-object v1, Lo/bgh$c;->e:Lo/bgh$c;

    invoke-virtual {v0, p1, v1}, Lo/bgh;->a(Ljava/lang/CharSequence;Lo/bgh$c;)Ljava/lang/CharSequence;

    move-result-object v5

    .line 583
    iget-object v0, p0, Lo/bfb;->A:Lo/apb;

    invoke-virtual {v0}, Lo/apb;->c()I

    move-result v6

    .line 584
    invoke-interface {v4}, Landroid/text/Editable;->length()I

    move-result v0

    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v1

    add-int/2addr v0, v1

    if-gt v0, v6, :cond_0

    .line 586
    invoke-interface {v4, v2, v5}, Landroid/text/Editable;->insert(ILjava/lang/CharSequence;)Landroid/text/Editable;

    .line 587
    iget-object v0, p0, Lo/bfb;->w:Lo/bng;

    invoke-virtual {v0, v4}, Lo/bng;->setText(Ljava/lang/CharSequence;)V

    .line 588
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v0

    add-int v7, v2, v0

    .line 589
    iget-object v0, p0, Lo/bfb;->w:Lo/bng;

    invoke-direct {p0, v7}, Lo/bfb;->b(I)I

    move-result v1

    invoke-virtual {v0, v1}, Lo/bng;->setSelection(I)V

    .line 590
    iget-object v0, p0, Lo/bfb;->w:Lo/bng;

    invoke-virtual {v0}, Lo/bng;->requestFocus()Z

    .line 591
    goto :goto_0

    .line 595
    :cond_0
    iget-object v0, p0, Lo/bfb;->A:Lo/apb;

    invoke-virtual {v0}, Lo/apb;->d()V

    .line 596
    const/16 v0, 0xa

    const/16 v1, 0x7ea

    invoke-static {v0, v1}, Lo/apf;->d(II)V

    .line 599
    :goto_0
    return-void
.end method

.method static synthetic e(Lo/bfb;)V
    .locals 0

    .line 51
    invoke-direct {p0}, Lo/bfb;->y()V

    return-void
.end method

.method static synthetic e(Lo/bfb;Ljava/lang/String;)V
    .locals 0

    .line 51
    invoke-direct {p0, p1}, Lo/bfb;->d(Ljava/lang/String;)V

    return-void
.end method

.method private m()V
    .locals 1

    .line 345
    invoke-direct {p0}, Lo/bfb;->n()V

    .line 346
    invoke-direct {p0}, Lo/bfb;->q()V

    .line 347
    invoke-direct {p0}, Lo/bfb;->r()V

    .line 349
    sget-object v0, Lo/bfb$e;->a:Lo/bfb$e;

    invoke-virtual {p0, v0}, Lo/bfb;->c(Lo/bfb$e;)V

    .line 350
    return-void
.end method

.method private n()V
    .locals 9

    .line 355
    invoke-direct {p0}, Lo/bfb;->u()V

    .line 356
    iget-object v0, p0, Lo/bfb;->s:Lo/bez;

    sget v1, Lcom/huawei/android/sns/R$id;->face_enter_button_container:I

    invoke-virtual {v0, v1}, Lo/bez;->findViewById(I)Landroid/view/View;

    move-result-object v0

    move-object v5, v0

    check-cast v5, Landroid/widget/RelativeLayout;

    .line 357
    iget-object v0, p0, Lo/bfb;->s:Lo/bez;

    sget v1, Lcom/huawei/android/sns/R$id;->chat_send_button_container:I

    invoke-virtual {v0, v1}, Lo/bez;->findViewById(I)Landroid/view/View;

    move-result-object v0

    move-object v6, v0

    check-cast v6, Landroid/widget/RelativeLayout;

    .line 358
    iget-object v0, p0, Lo/bfb;->s:Lo/bez;

    sget v1, Lcom/huawei/android/sns/R$id;->chat_send_button:I

    invoke-virtual {v0, v1}, Lo/bez;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lo/bfb;->x:Landroid/widget/ImageView;

    .line 361
    iget-object v0, p0, Lo/bfb;->s:Lo/bez;

    sget v1, Lcom/huawei/android/sns/R$id;->keyboard_down_layout:I

    invoke-virtual {v0, v1}, Lo/bez;->findViewById(I)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lo/bfb;->m:Landroid/view/View;

    .line 363
    iget-object v0, p0, Lo/bfb;->s:Lo/bez;

    sget v1, Lcom/huawei/android/sns/R$id;->text_input:I

    invoke-virtual {v0, v1}, Lo/bez;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lo/bng;

    iput-object v0, p0, Lo/bfb;->w:Lo/bng;

    .line 364
    iget-object v0, p0, Lo/bfb;->s:Lo/bez;

    sget v1, Lcom/huawei/android/sns/R$id;->text_num:I

    invoke-virtual {v0, v1}, Lo/bez;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lo/bfb;->v:Landroid/widget/TextView;

    .line 366
    iget-object v0, p0, Lo/bfb;->s:Lo/bez;

    sget v1, Lcom/huawei/android/sns/R$id;->keyboard_down:I

    invoke-virtual {v0, v1}, Lo/bez;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lo/bfb;->D:Landroid/widget/ImageView;

    .line 367
    iget-object v0, p0, Lo/bfb;->s:Lo/bez;

    sget v1, Lcom/huawei/android/sns/R$id;->text_keyboard_layout:I

    invoke-virtual {v0, v1}, Lo/bez;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    iput-object v0, p0, Lo/bfb;->C:Landroid/widget/LinearLayout;

    .line 368
    iget-object v0, p0, Lo/bfb;->s:Lo/bez;

    sget v1, Lcom/huawei/android/sns/R$id;->voice_input_layout:I

    invoke-virtual {v0, v1}, Lo/bez;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    iput-object v0, p0, Lo/bfb;->j:Landroid/widget/LinearLayout;

    .line 369
    iget-object v0, p0, Lo/bfb;->j:Landroid/widget/LinearLayout;

    invoke-virtual {v0, p0}, Landroid/widget/LinearLayout;->setOnTouchListener(Landroid/view/View$OnTouchListener;)V

    .line 370
    iget-object v0, p0, Lo/bfb;->s:Lo/bez;

    sget v1, Lcom/huawei/android/sns/R$id;->voice_input_notice:I

    invoke-virtual {v0, v1}, Lo/bez;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lo/bfb;->F:Landroid/widget/TextView;

    .line 372
    invoke-virtual {v5, p0}, Landroid/widget/RelativeLayout;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 373
    invoke-virtual {v6, p0}, Landroid/widget/RelativeLayout;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 374
    iget-object v0, p0, Lo/bfb;->w:Lo/bng;

    invoke-virtual {v0, p0}, Lo/bng;->setOnTouchListener(Landroid/view/View$OnTouchListener;)V

    .line 377
    invoke-static {}, Lo/bcm;->e()Lo/bcm;

    move-result-object v0

    invoke-virtual {v0}, Lo/bcm;->k()I

    move-result v7

    .line 378
    const-string v0, "InputModView"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "maxLength = "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v7}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/bpf;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 379
    if-gtz v7, :cond_0

    .line 381
    const/16 v7, 0x258

    .line 384
    :cond_0
    iget-object v0, p0, Lo/bfb;->w:Lo/bng;

    invoke-virtual {p0}, Lo/bfb;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/android/sns/R$color;->sns_black_20_percent:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getColor(I)I

    move-result v1

    invoke-virtual {v0, v1}, Lo/bng;->setHintTextColor(I)V

    .line 385
    iget-object v0, p0, Lo/bfb;->w:Lo/bng;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lo/bng;->setBackgroundColor(I)V

    .line 386
    iget-object v0, p0, Lo/bfb;->w:Lo/bng;

    iget-object v1, p0, Lo/bfb;->i:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/android/sns/R$string;->sns_chat_edittext_hint:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    invoke-static {v1, v2}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/bng;->setHint(Ljava/lang/CharSequence;)V

    .line 389
    new-instance v0, Lo/apb;

    invoke-direct {v0, v7}, Lo/apb;-><init>(I)V

    iput-object v0, p0, Lo/bfb;->A:Lo/apb;

    .line 390
    const/4 v0, 0x1

    new-array v8, v0, [Landroid/text/InputFilter;

    iget-object v0, p0, Lo/bfb;->A:Lo/apb;

    const/4 v1, 0x0

    aput-object v0, v8, v1

    .line 392
    iget-object v0, p0, Lo/bfb;->w:Lo/bng;

    invoke-virtual {v0, v8}, Lo/bng;->setFilters([Landroid/text/InputFilter;)V

    .line 393
    return-void
.end method

.method private q()V
    .locals 1

    .line 400
    sget v0, Lcom/huawei/android/sns/R$id;->chat_panel:I

    invoke-virtual {p0, v0}, Lo/bfb;->findViewById(I)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lo/bfb;->u:Landroid/view/View;

    .line 402
    sget v0, Lcom/huawei/android/sns/R$id;->faces_linerlayout:I

    invoke-virtual {p0, v0}, Lo/bfb;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lo/bgj;

    iput-object v0, p0, Lo/bfb;->q:Lo/bgj;

    .line 404
    sget v0, Lcom/huawei/android/sns/R$id;->attachment_grid_view:I

    invoke-virtual {p0, v0}, Lo/bfb;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/GridView;

    iput-object v0, p0, Lo/bfb;->r:Landroid/widget/GridView;

    .line 405
    return-void
.end method

.method private r()V
    .locals 2

    .line 412
    sget v0, Lcom/huawei/android/sns/R$id;->layout_menu_container:I

    invoke-virtual {p0, v0}, Lo/bfb;->findViewById(I)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lo/bfb;->y:Landroid/view/View;

    .line 413
    iget-object v0, p0, Lo/bfb;->y:Landroid/view/View;

    sget v1, Lcom/huawei/android/sns/R$id;->chat_menu_layout:I

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    iput-object v0, p0, Lo/bfb;->z:Landroid/widget/LinearLayout;

    .line 415
    iget-object v0, p0, Lo/bfb;->y:Landroid/view/View;

    sget v1, Lcom/huawei/android/sns/R$id;->keyboard_up:I

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    invoke-virtual {v0, p0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 416
    iget-object v0, p0, Lo/bfb;->m:Landroid/view/View;

    invoke-virtual {v0, p0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 417
    return-void
.end method

.method private s()V
    .locals 4

    .line 709
    iget v0, p0, Lo/bfb;->k:I

    const/4 v1, 0x1

    if-ne v1, v0, :cond_0

    .line 711
    const/4 v0, 0x4

    iput v0, p0, Lo/bfb;->k:I

    .line 712
    invoke-virtual {p0}, Lo/bfb;->k()V

    goto :goto_0

    .line 714
    :cond_0
    iget v0, p0, Lo/bfb;->k:I

    const/4 v1, 0x2

    if-ne v1, v0, :cond_1

    .line 716
    const/4 v0, 0x1

    iput v0, p0, Lo/bfb;->k:I

    .line 717
    invoke-direct {p0}, Lo/bfb;->y()V

    goto :goto_0

    .line 721
    :cond_1
    const/4 v0, 0x1

    iput v0, p0, Lo/bfb;->k:I

    .line 722
    invoke-virtual {p0}, Lo/bfb;->d()V

    .line 725
    iget-object v0, p0, Lo/bfb;->g:Landroid/os/Handler;

    new-instance v1, Lo/bfb$2;

    invoke-direct {v1, p0}, Lo/bfb$2;-><init>(Lo/bfb;)V

    const-wide/16 v2, 0x64

    invoke-virtual {v0, v1, v2, v3}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 734
    :goto_0
    return-void
.end method

.method private t()V
    .locals 3

    .line 606
    new-instance v2, Landroid/view/KeyEvent;

    const/4 v0, 0x0

    const/16 v1, 0x43

    invoke-direct {v2, v0, v1}, Landroid/view/KeyEvent;-><init>(II)V

    .line 607
    iget-object v0, p0, Lo/bfb;->w:Lo/bng;

    const/16 v1, 0x43

    invoke-virtual {v0, v1, v2}, Lo/bng;->onKeyDown(ILandroid/view/KeyEvent;)Z

    .line 608
    return-void
.end method

.method private u()V
    .locals 1

    .line 459
    sget v0, Lcom/huawei/android/sns/R$id;->chat_bottom_input_layout:I

    invoke-virtual {p0, v0}, Lo/bfb;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lo/bez;

    iput-object v0, p0, Lo/bfb;->s:Lo/bez;

    .line 460
    return-void
.end method

.method private x()V
    .locals 3

    .line 1008
    iget-object v0, p0, Lo/bfb;->w:Lo/bng;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 1011
    iget-object v0, p0, Lo/bfb;->i:Landroid/content/Context;

    const-string v1, "input_method"

    invoke-virtual {v0, v1}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/inputmethod/InputMethodManager;

    iget-object v1, p0, Lo/bfb;->w:Lo/bng;

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Landroid/view/inputmethod/InputMethodManager;->showSoftInput(Landroid/view/View;I)Z

    .line 1012
    const/4 v0, 0x1

    iput-boolean v0, p0, Lo/bfb;->o:Z

    .line 1014
    :cond_0
    return-void
.end method

.method private y()V
    .locals 10

    .line 753
    new-instance v7, Ljava/util/ArrayList;

    invoke-direct {v7}, Ljava/util/ArrayList;-><init>()V

    .line 754
    const/4 v8, 0x0

    :goto_0
    iget-object v0, p0, Lo/bfb;->b:[Ljava/lang/Integer;

    array-length v0, v0

    if-ge v8, v0, :cond_0

    .line 756
    new-instance v9, Ljava/util/HashMap;

    invoke-direct {v9}, Ljava/util/HashMap;-><init>()V

    .line 757
    const-string v0, "image"

    iget-object v1, p0, Lo/bfb;->b:[Ljava/lang/Integer;

    aget-object v1, v1, v8

    invoke-virtual {v9, v0, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 758
    const-string v0, "text"

    iget-object v1, p0, Lo/bfb;->i:Landroid/content/Context;

    iget-object v2, p0, Lo/bfb;->f:[Ljava/lang/Integer;

    aget-object v2, v2, v8

    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    move-result v2

    invoke-virtual {v1, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v9, v0, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 759
    const-string v0, "item"

    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v9, v0, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 760
    invoke-interface {v7, v9}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 754
    add-int/lit8 v8, v8, 0x1

    goto :goto_0

    .line 763
    :cond_0
    iget-object v0, p0, Lo/bfb;->p:Lo/bfb$e;

    sget-object v1, Lo/bfb$e;->c:Lo/bfb$e;

    if-eq v0, v1, :cond_1

    iget-object v0, p0, Lo/bfb;->p:Lo/bfb$e;

    sget-object v1, Lo/bfb$e;->b:Lo/bfb$e;

    if-eq v0, v1, :cond_1

    iget-object v0, p0, Lo/bfb;->p:Lo/bfb$e;

    sget-object v1, Lo/bfb$e;->e:Lo/bfb$e;

    if-ne v0, v1, :cond_2

    .line 766
    :cond_1
    invoke-interface {v7}, Ljava/util/List;->size()I

    move-result v0

    add-int/lit8 v0, v0, -0x1

    invoke-interface {v7, v0}, Ljava/util/List;->remove(I)Ljava/lang/Object;

    .line 767
    iget-object v0, p0, Lo/bfb;->r:Landroid/widget/GridView;

    invoke-interface {v7}, Ljava/util/List;->size()I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/widget/GridView;->setNumColumns(I)V

    .line 770
    :cond_2
    iget-object v0, p0, Lo/bfb;->t:Landroid/widget/SimpleAdapter;

    if-nez v0, :cond_3

    .line 772
    new-instance v0, Landroid/widget/SimpleAdapter;

    iget-object v1, p0, Lo/bfb;->i:Landroid/content/Context;

    sget v3, Lcom/huawei/android/sns/R$layout;->sns_more_item:I

    const/4 v2, 0x2

    new-array v4, v2, [Ljava/lang/String;

    const-string v2, "image"

    const/4 v5, 0x0

    aput-object v2, v4, v5

    const-string v2, "text"

    const/4 v5, 0x1

    aput-object v2, v4, v5

    const/4 v2, 0x2

    new-array v5, v2, [I

    sget v2, Lcom/huawei/android/sns/R$id;->more_icon:I

    const/4 v6, 0x0

    aput v2, v5, v6

    sget v2, Lcom/huawei/android/sns/R$id;->more_text:I

    const/4 v6, 0x1

    aput v2, v5, v6

    move-object v2, v7

    invoke-direct/range {v0 .. v5}, Landroid/widget/SimpleAdapter;-><init>(Landroid/content/Context;Ljava/util/List;I[Ljava/lang/String;[I)V

    iput-object v0, p0, Lo/bfb;->t:Landroid/widget/SimpleAdapter;

    .line 777
    :cond_3
    iget-object v0, p0, Lo/bfb;->q:Lo/bgj;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Lo/bgj;->setVisibility(I)V

    .line 778
    iget-object v0, p0, Lo/bfb;->u:Landroid/view/View;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 779
    iget-object v0, p0, Lo/bfb;->r:Landroid/widget/GridView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/GridView;->setVisibility(I)V

    .line 781
    iget-object v0, p0, Lo/bfb;->r:Landroid/widget/GridView;

    iget-object v1, p0, Lo/bfb;->t:Landroid/widget/SimpleAdapter;

    invoke-virtual {v0, v1}, Landroid/widget/GridView;->setAdapter(Landroid/widget/ListAdapter;)V

    .line 784
    const/4 v0, 0x3

    const/16 v1, 0x64

    invoke-static {v0, v1}, Lo/apf;->d(II)V

    .line 786
    const/4 v0, 0x3

    const/16 v1, 0x7ed

    invoke-static {v0, v1}, Lo/apf;->d(II)V

    .line 787
    return-void
.end method


# virtual methods
.method protected a(Landroid/view/View;Landroid/view/View;)V
    .locals 6

    .line 512
    iget-object v0, p0, Lo/bfb;->i:Landroid/content/Context;

    const/high16 v1, 0x42480000    # 50.0f

    invoke-static {v0, v1}, Lo/boi;->c(Landroid/content/Context;F)I

    move-result v4

    .line 513
    new-instance v5, Landroid/view/animation/TranslateAnimation;

    int-to-float v0, v4

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-direct {v5, v1, v2, v0, v3}, Landroid/view/animation/TranslateAnimation;-><init>(FFFF)V

    .line 514
    const-wide/16 v0, 0x12c

    invoke-virtual {v5, v0, v1}, Landroid/view/animation/Animation;->setDuration(J)V

    .line 515
    const-wide/16 v0, 0x64

    invoke-virtual {v5, v0, v1}, Landroid/view/animation/Animation;->setStartOffset(J)V

    .line 516
    const/16 v0, 0x8

    invoke-virtual {p2, v0}, Landroid/view/View;->setVisibility(I)V

    .line 517
    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Landroid/view/View;->setVisibility(I)V

    .line 518
    new-instance v0, Lo/bfb$1;

    invoke-direct {v0, p0}, Lo/bfb$1;-><init>(Lo/bfb;)V

    invoke-virtual {v5, v0}, Landroid/view/animation/Animation;->setAnimationListener(Landroid/view/animation/Animation$AnimationListener;)V

    .line 549
    invoke-virtual {p1, v5}, Landroid/view/View;->startAnimation(Landroid/view/animation/Animation;)V

    .line 550
    return-void
.end method

.method public a(Z)V
    .locals 3

    .line 560
    iget-object v0, p0, Lo/bfb;->v:Landroid/widget/TextView;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_2

    iget-object v0, p0, Lo/bfb;->C:Landroid/widget/LinearLayout;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_2

    .line 562
    iget-object v0, p0, Lo/bfb;->v:Landroid/widget/TextView;

    if-eqz p1, :cond_0

    iget-object v1, p0, Lo/bfb;->v:Landroid/widget/TextView;

    invoke-virtual {v1}, Landroid/widget/TextView;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/android/sns/R$color;->sns_input_num_red:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getColor(I)I

    move-result v1

    goto :goto_0

    :cond_0
    iget-object v1, p0, Lo/bfb;->v:Landroid/widget/TextView;

    .line 563
    invoke-virtual {v1}, Landroid/widget/TextView;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/android/sns/R$color;->sns_black_100_percent:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getColor(I)I

    move-result v1

    .line 562
    :goto_0
    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setTextColor(I)V

    .line 565
    iget-object v0, p0, Lo/bfb;->C:Landroid/widget/LinearLayout;

    if-eqz p1, :cond_1

    iget-object v1, p0, Lo/bfb;->C:Landroid/widget/LinearLayout;

    invoke-virtual {v1}, Landroid/widget/LinearLayout;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/android/sns/R$drawable;->sns_chat_input_text_error_bg:I

    .line 566
    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v1

    goto :goto_1

    :cond_1
    iget-object v1, p0, Lo/bfb;->C:Landroid/widget/LinearLayout;

    invoke-virtual {v1}, Landroid/widget/LinearLayout;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/android/sns/R$drawable;->sns_chat_input_text_background:I

    .line 567
    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v1

    .line 565
    :goto_1
    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setBackgroundDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 569
    :cond_2
    return-void
.end method

.method public a()Z
    .locals 1

    .line 617
    iget-boolean v0, p0, Lo/bfb;->o:Z

    return v0
.end method

.method protected b()V
    .locals 4

    .line 660
    iget v0, p0, Lo/bfb;->k:I

    const/4 v1, 0x2

    if-ne v1, v0, :cond_0

    .line 662
    const/4 v0, 0x3

    iput v0, p0, Lo/bfb;->k:I

    .line 663
    invoke-virtual {p0}, Lo/bfb;->k()V

    goto :goto_0

    .line 665
    :cond_0
    iget v0, p0, Lo/bfb;->k:I

    const/4 v1, 0x1

    if-ne v1, v0, :cond_1

    .line 667
    const/4 v0, 0x2

    iput v0, p0, Lo/bfb;->k:I

    .line 668
    invoke-virtual {p0}, Lo/bfb;->e()V

    goto :goto_0

    .line 672
    :cond_1
    const/4 v0, 0x2

    iput v0, p0, Lo/bfb;->k:I

    .line 673
    invoke-virtual {p0}, Lo/bfb;->d()V

    .line 676
    iget-object v0, p0, Lo/bfb;->g:Landroid/os/Handler;

    new-instance v1, Lo/bfb$3;

    invoke-direct {v1, p0}, Lo/bfb$3;-><init>(Lo/bfb;)V

    const-wide/16 v2, 0x64

    invoke-virtual {v0, v1, v2, v3}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 685
    :goto_0
    return-void
.end method

.method public b(Lo/bfb$e;)V
    .locals 2

    .line 486
    iget-object v0, p0, Lo/bfb;->p:Lo/bfb$e;

    if-ne v0, p1, :cond_0

    .line 488
    sget-object v0, Lo/bfb;->e:Ljava/lang/String;

    const-string v1, "changeModWithAnimation, no need to change"

    invoke-static {v0, v1}, Lo/bpf;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 490
    :cond_0
    iput-object p1, p0, Lo/bfb;->p:Lo/bfb$e;

    .line 492
    sget-object v0, Lo/bfb$e;->c:Lo/bfb$e;

    if-ne p1, v0, :cond_1

    .line 494
    iget-object v0, p0, Lo/bfb;->s:Lo/bez;

    iget-object v1, p0, Lo/bfb;->y:Landroid/view/View;

    invoke-virtual {p0, v0, v1}, Lo/bfb;->a(Landroid/view/View;Landroid/view/View;)V

    goto :goto_0

    .line 496
    :cond_1
    sget-object v0, Lo/bfb$e;->b:Lo/bfb$e;

    if-ne p1, v0, :cond_2

    .line 498
    invoke-virtual {p0}, Lo/bfb;->k()V

    .line 499
    invoke-virtual {p0}, Lo/bfb;->d()V

    .line 500
    iget-object v0, p0, Lo/bfb;->y:Landroid/view/View;

    iget-object v1, p0, Lo/bfb;->s:Lo/bez;

    invoke-virtual {p0, v0, v1}, Lo/bfb;->a(Landroid/view/View;Landroid/view/View;)V

    .line 502
    :cond_2
    :goto_0
    return-void
.end method

.method public c()V
    .locals 2

    .line 635
    const/4 v0, 0x3

    iput v0, p0, Lo/bfb;->k:I

    .line 637
    invoke-virtual {p0}, Lo/bfb;->p()V

    .line 638
    invoke-direct {p0}, Lo/bfb;->x()V

    .line 641
    const/4 v0, 0x3

    const/16 v1, 0x64

    invoke-static {v0, v1}, Lo/apf;->d(II)V

    .line 642
    return-void
.end method

.method public c(Lo/bfb$e;)V
    .locals 2

    .line 467
    iget-object v0, p0, Lo/bfb;->p:Lo/bfb$e;

    if-ne v0, p1, :cond_0

    .line 469
    sget-object v0, Lo/bfb;->e:Ljava/lang/String;

    const-string v1, "changeMod, no need to change"

    invoke-static {v0, v1}, Lo/bpf;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 472
    :cond_0
    iput-object p1, p0, Lo/bfb;->p:Lo/bfb$e;

    .line 473
    invoke-direct {p0, p1}, Lo/bfb;->a(Lo/bfb$e;)V

    .line 475
    iget-object v0, p0, Lo/bfb;->B:Lo/bey;

    if-eqz v0, :cond_1

    .line 477
    iget-object v0, p0, Lo/bfb;->B:Lo/bey;

    invoke-interface {v0, p1}, Lo/bey;->e(Lo/bfb$e;)V

    .line 479
    :cond_1
    return-void
.end method

.method protected c(Landroid/view/View;Landroid/view/MotionEvent;)Z
    .locals 6

    .line 1127
    invoke-virtual {p1}, Landroid/view/View;->getId()I

    move-result v3

    .line 1128
    invoke-virtual {p2}, Landroid/view/MotionEvent;->getAction()I

    move-result v4

    .line 1130
    sget v0, Lcom/huawei/android/sns/R$id;->chat_send_button:I

    if-ne v3, v0, :cond_2

    .line 1132
    iget-object v0, p0, Lo/bfb;->w:Lo/bng;

    invoke-virtual {v0}, Lo/bng;->getText()Landroid/text/Editable;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v5

    .line 1133
    const/4 v0, 0x0

    invoke-static {v5, v0}, Lo/bqz;->a(Ljava/lang/String;Z)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 1135
    iget-object v0, p0, Lo/bfb;->u:Landroid/view/View;

    invoke-virtual {v0}, Landroid/view/View;->getVisibility()I

    move-result v0

    if-nez v0, :cond_0

    .line 1137
    invoke-virtual {p0}, Lo/bfb;->k()V

    .line 1138
    const/4 v0, 0x1

    return v0

    .line 1140
    :cond_0
    iget-boolean v0, p0, Lo/bfb;->o:Z

    if-eqz v0, :cond_1

    .line 1142
    invoke-virtual {p0}, Lo/bfb;->d()V

    .line 1143
    const/4 v0, 0x1

    return v0

    .line 1147
    :cond_1
    goto/16 :goto_1

    .line 1148
    :cond_2
    sget v0, Lcom/huawei/android/sns/R$id;->text_input:I

    if-ne v3, v0, :cond_4

    .line 1150
    if-nez v4, :cond_3

    .line 1152
    invoke-virtual {p0}, Lo/bfb;->k()V

    goto/16 :goto_1

    .line 1154
    :cond_3
    const/4 v0, 0x1

    if-ne v4, v0, :cond_7

    .line 1156
    invoke-virtual {p0}, Lo/bfb;->c()V

    goto :goto_1

    .line 1159
    :cond_4
    sget v0, Lcom/huawei/android/sns/R$id;->voice_input_layout:I

    if-ne v3, v0, :cond_7

    .line 1161
    sget-object v0, Lo/bfb;->e:Ljava/lang/String;

    const-string v1, "on press voice_input_layout"

    invoke-static {v0, v1}, Lo/bpf;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 1162
    invoke-virtual {p2}, Landroid/view/MotionEvent;->getAction()I

    move-result v0

    if-nez v0, :cond_5

    .line 1163
    iget-object v0, p0, Lo/bfb;->F:Landroid/widget/TextView;

    iget-object v1, p0, Lo/bfb;->i:Landroid/content/Context;

    sget v2, Lcom/huawei/android/sns/R$string;->sns_voice_char_release_end:I

    invoke-virtual {v1, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 1164
    iget-object v0, p0, Lo/bfb;->j:Landroid/widget/LinearLayout;

    .line 1165
    invoke-virtual {p0}, Lo/bfb;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/android/sns/R$drawable;->sns_chat_voice_input_button_press_bg:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v1

    .line 1164
    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setBackground(Landroid/graphics/drawable/Drawable;)V

    goto :goto_0

    .line 1166
    :cond_5
    invoke-virtual {p2}, Landroid/view/MotionEvent;->getAction()I

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_6

    .line 1167
    iget-object v0, p0, Lo/bfb;->F:Landroid/widget/TextView;

    iget-object v1, p0, Lo/bfb;->i:Landroid/content/Context;

    sget v2, Lcom/huawei/android/sns/R$string;->sns_voice_char_press_speak:I

    invoke-virtual {v1, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 1168
    iget-object v0, p0, Lo/bfb;->j:Landroid/widget/LinearLayout;

    .line 1169
    invoke-virtual {p0}, Lo/bfb;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/android/sns/R$drawable;->sns_chat_input_text_background:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v1

    .line 1168
    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 1171
    :cond_6
    :goto_0
    iget-object v0, p0, Lo/bfb;->d:Lo/bnv;

    iget-object v1, p0, Lo/bfb;->c:Lo/bnv$d;

    invoke-virtual {v0, p1, p2, v1}, Lo/bnv;->d(Landroid/view/View;Landroid/view/MotionEvent;Lo/bnv$d;)Z

    move-result v0

    return v0

    .line 1173
    :cond_7
    :goto_1
    const/4 v0, 0x0

    return v0
.end method

.method public d()V
    .locals 3

    .line 625
    iget-object v0, p0, Lo/bfb;->i:Landroid/content/Context;

    const-string v1, "input_method"

    invoke-virtual {v0, v1}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Landroid/view/inputmethod/InputMethodManager;

    .line 626
    invoke-virtual {p0}, Lo/bfb;->getWindowToken()Landroid/os/IBinder;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v2, v0, v1}, Landroid/view/inputmethod/InputMethodManager;->hideSoftInputFromWindow(Landroid/os/IBinder;I)Z

    .line 627
    const/4 v0, 0x0

    iput-boolean v0, p0, Lo/bfb;->o:Z

    .line 628
    return-void
.end method

.method public d(Lo/bmt;Landroid/widget/LinearLayout$LayoutParams;)V
    .locals 2

    .line 831
    iget-object v0, p0, Lo/bfb;->z:Landroid/widget/LinearLayout;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 833
    iget-object v0, p0, Lo/bfb;->z:Landroid/widget/LinearLayout;

    invoke-virtual {v0, p1, p2}, Landroid/widget/LinearLayout;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 835
    :cond_0
    return-void
.end method

.method protected e()V
    .locals 2

    .line 692
    iget-object v0, p0, Lo/bfb;->q:Lo/bgj;

    iget-object v0, v0, Lo/bgj;->e:Landroid/widget/GridView;

    if-eqz v0, :cond_0

    .line 694
    iget-object v0, p0, Lo/bfb;->r:Landroid/widget/GridView;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/GridView;->setVisibility(I)V

    .line 695
    iget-object v0, p0, Lo/bfb;->u:Landroid/view/View;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 696
    iget-object v0, p0, Lo/bfb;->q:Lo/bgj;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lo/bgj;->setVisibility(I)V

    .line 699
    const/4 v0, 0x3

    const/16 v1, 0x64

    invoke-static {v0, v1}, Lo/apf;->d(II)V

    .line 701
    :cond_0
    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lo/bfb;->setSendButton(Z)V

    .line 702
    return-void
.end method

.method public f()V
    .locals 2

    .line 820
    iget-object v0, p0, Lo/bfb;->z:Landroid/widget/LinearLayout;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 822
    iget-object v0, p0, Lo/bfb;->z:Landroid/widget/LinearLayout;

    invoke-virtual {v0}, Landroid/widget/LinearLayout;->removeAllViews()V

    .line 824
    :cond_0
    return-void
.end method

.method public g()Z
    .locals 2

    .line 911
    iget-object v0, p0, Lo/bfb;->u:Landroid/view/View;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    iget-object v0, p0, Lo/bfb;->u:Landroid/view/View;

    invoke-virtual {v0}, Landroid/view/View;->getVisibility()I

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public getInputEdit()Landroid/text/Editable;
    .locals 2

    .line 935
    iget-object v0, p0, Lo/bfb;->w:Lo/bng;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 937
    iget-object v0, p0, Lo/bfb;->w:Lo/bng;

    invoke-virtual {v0}, Lo/bng;->getText()Landroid/text/Editable;

    move-result-object v0

    return-object v0

    .line 939
    :cond_0
    invoke-static {}, Landroid/text/Editable$Factory;->getInstance()Landroid/text/Editable$Factory;

    move-result-object v0

    const-string v1, ""

    invoke-virtual {v0, v1}, Landroid/text/Editable$Factory;->newEditable(Ljava/lang/CharSequence;)Landroid/text/Editable;

    move-result-object v0

    return-object v0
.end method

.method public getInputIndex()I
    .locals 2

    .line 921
    iget-object v0, p0, Lo/bfb;->w:Lo/bng;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 923
    iget-object v0, p0, Lo/bfb;->w:Lo/bng;

    invoke-virtual {v0}, Lo/bng;->getSelectionStart()I

    move-result v0

    return v0

    .line 925
    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public getMenuLocation()[I
    .locals 3

    .line 807
    const/4 v0, 0x2

    new-array v2, v0, [I

    .line 808
    iget-object v0, p0, Lo/bfb;->z:Landroid/widget/LinearLayout;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 810
    iget-object v0, p0, Lo/bfb;->z:Landroid/widget/LinearLayout;

    invoke-virtual {v0, v2}, Landroid/widget/LinearLayout;->getLocationInWindow([I)V

    .line 812
    :cond_0
    return-object v2
.end method

.method public h()V
    .locals 2

    .line 855
    iget-object v0, p0, Lo/bfb;->g:Landroid/os/Handler;

    if-eqz v0, :cond_0

    .line 857
    iget-object v0, p0, Lo/bfb;->g:Landroid/os/Handler;

    const/16 v1, 0xa

    invoke-static {v1, v0}, Lo/apf;->c(ILandroid/os/Handler;)V

    .line 859
    :cond_0
    return-void
.end method

.method public i()V
    .locals 2

    .line 866
    iget-object v0, p0, Lo/bfb;->g:Landroid/os/Handler;

    if-eqz v0, :cond_0

    .line 868
    iget-object v0, p0, Lo/bfb;->g:Landroid/os/Handler;

    const/16 v1, 0xa

    invoke-static {v1, v0}, Lo/apf;->a(ILandroid/os/Handler;)V

    .line 870
    :cond_0
    return-void
.end method

.method public k()V
    .locals 2

    .line 741
    iget-object v0, p0, Lo/bfb;->u:Landroid/view/View;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 743
    const/4 v0, 0x4

    iput v0, p0, Lo/bfb;->k:I

    .line 745
    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lo/bfb;->setSendButton(Z)V

    .line 746
    return-void
.end method

.method protected l()Z
    .locals 2

    .line 1023
    iget v0, p0, Lo/bfb;->l:I

    sget v1, Lcom/huawei/android/sns/R$drawable;->sns_msg_send_selector:I

    if-ne v0, v1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public o()Z
    .locals 2

    .line 989
    iget-object v0, p0, Lo/bfb;->w:Lo/bng;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    iget-object v0, p0, Lo/bfb;->w:Lo/bng;

    invoke-virtual {v0}, Lo/bng;->isFocused()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public onClick(Landroid/view/View;)V
    .locals 6

    .line 1052
    invoke-virtual {p1}, Landroid/view/View;->getId()I

    move-result v4

    .line 1053
    sget v0, Lcom/huawei/android/sns/R$id;->face_enter_button_container:I

    if-eq v0, v4, :cond_0

    sget v0, Lcom/huawei/android/sns/R$id;->face_enter_button:I

    if-ne v0, v4, :cond_1

    .line 1055
    :cond_0
    invoke-virtual {p0}, Lo/bfb;->b()V

    goto/16 :goto_1

    .line 1057
    :cond_1
    sget v0, Lcom/huawei/android/sns/R$id;->chat_send_button:I

    if-eq v4, v0, :cond_2

    sget v0, Lcom/huawei/android/sns/R$id;->chat_send_button_container:I

    if-ne v4, v0, :cond_6

    .line 1059
    :cond_2
    iget-object v0, p0, Lo/bfb;->w:Lo/bng;

    invoke-virtual {v0}, Lo/bng;->getText()Landroid/text/Editable;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v5

    .line 1060
    invoke-virtual {p0}, Lo/bfb;->l()Z

    move-result v0

    if-eqz v0, :cond_3

    const/4 v0, 0x0

    invoke-static {v5, v0}, Lo/bqz;->a(Ljava/lang/String;Z)Z

    move-result v0

    if-nez v0, :cond_3

    .line 1062
    iget-object v0, p0, Lo/bfb;->n:Lo/bex;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_5

    .line 1064
    iget-object v0, p0, Lo/bfb;->n:Lo/bex;

    invoke-interface {v0}, Lo/bex;->d()V

    goto :goto_0

    .line 1069
    :cond_3
    iget-boolean v0, p0, Lo/bfb;->o:Z

    if-eqz v0, :cond_4

    .line 1071
    invoke-virtual {p0}, Lo/bfb;->d()V

    .line 1073
    iget-object v0, p0, Lo/bfb;->g:Landroid/os/Handler;

    new-instance v1, Lo/bfb$5;

    invoke-direct {v1, p0}, Lo/bfb$5;-><init>(Lo/bfb;)V

    const-wide/16 v2, 0xc8

    invoke-virtual {v0, v1, v2, v3}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    goto :goto_0

    .line 1085
    :cond_4
    invoke-direct {p0}, Lo/bfb;->s()V

    .line 1088
    :cond_5
    :goto_0
    goto :goto_1

    .line 1089
    :cond_6
    sget v0, Lcom/huawei/android/sns/R$id;->keyboard_up:I

    if-ne v4, v0, :cond_7

    .line 1091
    sget-object v0, Lo/bfb$e;->c:Lo/bfb$e;

    invoke-virtual {p0, v0}, Lo/bfb;->b(Lo/bfb$e;)V

    goto :goto_1

    .line 1093
    :cond_7
    sget v0, Lcom/huawei/android/sns/R$id;->keyboard_down_layout:I

    if-ne v4, v0, :cond_9

    .line 1095
    iget v0, p0, Lo/bfb;->h:I

    if-nez v0, :cond_8

    .line 1096
    iget-object v0, p0, Lo/bfb;->D:Landroid/widget/ImageView;

    invoke-virtual {p0}, Lo/bfb;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/android/sns/R$drawable;->sns_chat_keyboard_down_selector:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 1097
    const/4 v0, 0x1

    iput v0, p0, Lo/bfb;->h:I

    .line 1098
    iget-object v0, p0, Lo/bfb;->C:Landroid/widget/LinearLayout;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 1099
    iget-object v0, p0, Lo/bfb;->j:Landroid/widget/LinearLayout;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 1100
    invoke-virtual {p0}, Lo/bfb;->d()V

    goto :goto_1

    .line 1102
    :cond_8
    iget-object v0, p0, Lo/bfb;->D:Landroid/widget/ImageView;

    invoke-virtual {p0}, Lo/bfb;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/android/sns/R$drawable;->sns_chat_voice_switch_selector:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 1103
    const/4 v0, 0x0

    iput v0, p0, Lo/bfb;->h:I

    .line 1104
    iget-object v0, p0, Lo/bfb;->C:Landroid/widget/LinearLayout;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 1105
    iget-object v0, p0, Lo/bfb;->j:Landroid/widget/LinearLayout;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 1106
    invoke-virtual {p0}, Lo/bfb;->c()V

    .line 1109
    :cond_9
    :goto_1
    return-void
.end method

.method public onTouch(Landroid/view/View;Landroid/view/MotionEvent;)Z
    .locals 1
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "ClickableViewAccessibility"
        }
    .end annotation

    .line 1115
    invoke-virtual {p0, p1, p2}, Lo/bfb;->c(Landroid/view/View;Landroid/view/MotionEvent;)Z

    move-result v0

    return v0
.end method

.method public p()V
    .locals 2

    .line 997
    iget-object v0, p0, Lo/bfb;->w:Lo/bng;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 999
    iget-object v0, p0, Lo/bfb;->w:Lo/bng;

    invoke-virtual {v0}, Lo/bng;->requestFocus()Z

    .line 1001
    :cond_0
    return-void
.end method

.method public setCListener(Lo/bex;)V
    .locals 0

    .line 879
    iput-object p1, p0, Lo/bfb;->n:Lo/bex;

    .line 880
    return-void
.end method

.method public setChatVoiceRecorderView(Lo/bnv;Lo/bnv$d;)V
    .locals 0

    .line 1184
    iput-object p2, p0, Lo/bfb;->c:Lo/bnv$d;

    .line 1185
    iput-object p1, p0, Lo/bfb;->d:Lo/bnv;

    .line 1186
    return-void
.end method

.method public setCustTextInputListener(Landroid/text/TextWatcher;)V
    .locals 2

    .line 889
    iget-object v0, p0, Lo/bfb;->w:Lo/bng;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 891
    iget-object v0, p0, Lo/bfb;->w:Lo/bng;

    invoke-virtual {v0, p1}, Lo/bng;->addTextChangedListener(Landroid/text/TextWatcher;)V

    .line 893
    :cond_0
    return-void
.end method

.method public setHeightChangeListener(Lo/bew;)V
    .locals 0

    .line 1179
    invoke-super {p0, p1}, Lo/bez;->setHeightChangeListener(Lo/bew;)V

    .line 1180
    return-void
.end method

.method public setInputSelection(I)V
    .locals 2

    .line 976
    iget-object v0, p0, Lo/bfb;->w:Lo/bng;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 978
    iget-object v0, p0, Lo/bfb;->w:Lo/bng;

    invoke-virtual {v0, p1}, Lo/bng;->setSelection(I)V

    .line 980
    :cond_0
    return-void
.end method

.method public setInputText(Ljava/lang/CharSequence;)V
    .locals 2

    .line 959
    iget-object v0, p0, Lo/bfb;->w:Lo/bng;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 961
    iget-object v0, p0, Lo/bfb;->w:Lo/bng;

    invoke-virtual {v0, p1}, Lo/bng;->setText(Ljava/lang/CharSequence;)V

    goto :goto_0

    .line 965
    :cond_0
    sget-object v0, Lo/bfb;->e:Ljava/lang/String;

    const-string v1, "setDraftText error, textInput is null"

    invoke-static {v0, v1}, Lo/bpf;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 967
    :goto_0
    return-void
.end method

.method public setKeyboardDownVisible(I)V
    .locals 2

    .line 844
    iget-object v0, p0, Lo/bfb;->m:Landroid/view/View;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 846
    iget-object v0, p0, Lo/bfb;->m:Landroid/view/View;

    invoke-virtual {v0, p1}, Landroid/view/View;->setVisibility(I)V

    .line 848
    :cond_0
    return-void
.end method

.method public setMoreItemListener(Landroid/widget/AdapterView$OnItemClickListener;)V
    .locals 2

    .line 794
    iget-object v0, p0, Lo/bfb;->r:Landroid/widget/GridView;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 796
    iget-object v0, p0, Lo/bfb;->r:Landroid/widget/GridView;

    invoke-virtual {v0, p1}, Landroid/widget/GridView;->setOnItemClickListener(Landroid/widget/AdapterView$OnItemClickListener;)V

    .line 798
    :cond_0
    return-void
.end method

.method public setOnInputModStatueChangeListener(Lo/bey;)V
    .locals 0

    .line 901
    iput-object p1, p0, Lo/bfb;->B:Lo/bey;

    .line 902
    return-void
.end method

.method public setSendButton(Z)V
    .locals 3

    .line 1037
    iget-object v0, p0, Lo/bfb;->w:Lo/bng;

    invoke-virtual {v0}, Lo/bng;->getText()Landroid/text/Editable;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v2

    .line 1038
    invoke-static {v2, p1}, Lo/bqz;->a(Ljava/lang/String;Z)Z

    move-result v0

    if-nez v0, :cond_0

    .line 1040
    sget v0, Lcom/huawei/android/sns/R$drawable;->sns_msg_send_selector:I

    iput v0, p0, Lo/bfb;->l:I

    goto :goto_0

    .line 1044
    :cond_0
    sget v0, Lcom/huawei/android/sns/R$drawable;->sns_add_selector:I

    iput v0, p0, Lo/bfb;->l:I

    .line 1046
    :goto_0
    iget-object v0, p0, Lo/bfb;->x:Landroid/widget/ImageView;

    iget v1, p0, Lo/bfb;->l:I

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 1047
    return-void
.end method
