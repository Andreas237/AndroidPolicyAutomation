.class public Lcom/huawei/wallet/ui/cardholder/CardHolderFragment;
.super Landroid/app/Fragment;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;
.implements Lcom/huawei/wallet/ui/carddisplay/CardListInfoListener;


# annotations
.annotation build Landroid/annotation/SuppressLint;
    value = {
        "NewApi"
    }
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/huawei/wallet/ui/cardholder/CardHolderFragment$CardHandler;,
        Lcom/huawei/wallet/ui/cardholder/CardHolderFragment$CardListener;,
        Lcom/huawei/wallet/ui/cardholder/CardHolderFragment$DisplayRunnbale;
    }
.end annotation


# static fields
.field private static G:Ljava/util/concurrent/ExecutorService;

.field private static d:[Ljava/lang/String;


# instance fields
.field private A:I

.field private B:Lcom/huawei/wallet/ui/cardholder/CardHolderFragment$CardListener;

.field private C:Z

.field private D:Lcom/huawei/nfc/carrera/logic/NFCOpenApi;

.field private E:Lcom/huawei/wallet/ui/cardholder/CardHolderFragment$DisplayRunnbale;

.field private F:Lcom/huawei/wallet/ui/cardholder/ScrollViewTouchListener;

.field private H:Lcom/huawei/wallet/ui/cardholder/CardHolderFragment$CardHandler;

.field private I:Ljava/lang/String;

.field private a:Lo/egn;

.field private b:Landroid/view/View;

.field private c:Landroid/widget/TextView;

.field private e:I

.field private f:Lcom/huawei/wallet/ui/carddisplay/HwScrollView;

.field private g:Landroid/view/ViewGroup;

.field private h:Landroid/view/View;

.field private i:Landroid/view/View;

.field private j:Landroid/graphics/drawable/Drawable;

.field private k:Landroid/widget/TextView;

.field private l:Lo/egd;

.field private m:Lo/ems;

.field private n:Lcom/huawei/wallet/ui/carddisplay/CardHolderLayout;

.field private o:Landroid/widget/LinearLayout;

.field private p:Landroid/view/View;

.field private q:Landroid/view/View;

.field private r:Lcom/huawei/wallet/ui/carddisplay/CardHolderDisplayManager;

.field private s:F

.field private t:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<Lcom/huawei/wallet/model/unicard/UniCardInfo;>;"
        }
    .end annotation
.end field

.field private u:Landroid/view/View;

.field private v:I

.field private w:I

.field private x:F

.field private y:I

.field private z:F


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 92
    const/4 v0, 0x2

    new-array v0, v0, [Ljava/lang/String;

    const-string v1, "android.permission.READ_EXTERNAL_STORAGE"

    const/4 v2, 0x0

    aput-object v1, v0, v2

    const-string v1, "android.permission.WRITE_EXTERNAL_STORAGE"

    const/4 v2, 0x1

    aput-object v1, v0, v2

    sput-object v0, Lcom/huawei/wallet/ui/cardholder/CardHolderFragment;->d:[Ljava/lang/String;

    .line 209
    const/4 v0, 0x2

    invoke-static {v0}, Ljava/util/concurrent/Executors;->newFixedThreadPool(I)Ljava/util/concurrent/ExecutorService;

    move-result-object v0

    sput-object v0, Lcom/huawei/wallet/ui/cardholder/CardHolderFragment;->G:Ljava/util/concurrent/ExecutorService;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    .line 213
    invoke-direct {p0}, Landroid/app/Fragment;-><init>()V

    .line 211
    const-string v0, ""

    iput-object v0, p0, Lcom/huawei/wallet/ui/cardholder/CardHolderFragment;->I:Ljava/lang/String;

    .line 215
    return-void
.end method

.method static synthetic a(Lcom/huawei/wallet/ui/cardholder/CardHolderFragment;)Lcom/huawei/wallet/ui/carddisplay/CardHolderDisplayManager;
    .locals 1

    .line 81
    iget-object v0, p0, Lcom/huawei/wallet/ui/cardholder/CardHolderFragment;->r:Lcom/huawei/wallet/ui/carddisplay/CardHolderDisplayManager;

    return-object v0
.end method

.method static synthetic a(Lcom/huawei/wallet/ui/cardholder/CardHolderFragment;Ljava/lang/String;)Ljava/lang/String;
    .locals 0

    .line 81
    iput-object p1, p0, Lcom/huawei/wallet/ui/cardholder/CardHolderFragment;->I:Ljava/lang/String;

    return-object p1
.end method

.method private a(Landroid/view/View;)V
    .locals 4

    .line 263
    sget v0, Lcom/huawei/wallet/R$id;->card_holder_error:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/wallet/ui/cardholder/CardHolderFragment;->b:Landroid/view/View;

    .line 264
    sget v0, Lcom/huawei/wallet/R$id;->error_alert:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/huawei/wallet/ui/cardholder/CardHolderFragment;->c:Landroid/widget/TextView;

    .line 265
    sget v0, Lcom/huawei/wallet/R$id;->setting_net:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/huawei/wallet/ui/cardholder/CardHolderFragment;->k:Landroid/widget/TextView;

    .line 266
    iget-object v0, p0, Lcom/huawei/wallet/ui/cardholder/CardHolderFragment;->k:Landroid/widget/TextView;

    invoke-virtual {v0, p0}, Landroid/widget/TextView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 267
    iget-object v0, p0, Lcom/huawei/wallet/ui/cardholder/CardHolderFragment;->c:Landroid/widget/TextView;

    invoke-virtual {v0, p0}, Landroid/widget/TextView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 269
    sget v0, Lcom/huawei/wallet/R$id;->scroll:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/huawei/wallet/ui/carddisplay/HwScrollView;

    iput-object v0, p0, Lcom/huawei/wallet/ui/cardholder/CardHolderFragment;->f:Lcom/huawei/wallet/ui/carddisplay/HwScrollView;

    .line 270
    iget-object v0, p0, Lcom/huawei/wallet/ui/cardholder/CardHolderFragment;->f:Lcom/huawei/wallet/ui/carddisplay/HwScrollView;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lcom/huawei/wallet/ui/carddisplay/HwScrollView;->setCanRebound(Z)V

    .line 271
    new-instance v0, Lcom/huawei/wallet/ui/cardholder/ScrollViewTouchListener;

    const/4 v1, 0x1

    invoke-direct {v0, v1}, Lcom/huawei/wallet/ui/cardholder/ScrollViewTouchListener;-><init>(Z)V

    iput-object v0, p0, Lcom/huawei/wallet/ui/cardholder/CardHolderFragment;->F:Lcom/huawei/wallet/ui/cardholder/ScrollViewTouchListener;

    .line 272
    iget-object v0, p0, Lcom/huawei/wallet/ui/cardholder/CardHolderFragment;->f:Lcom/huawei/wallet/ui/carddisplay/HwScrollView;

    iget-object v1, p0, Lcom/huawei/wallet/ui/cardholder/CardHolderFragment;->F:Lcom/huawei/wallet/ui/cardholder/ScrollViewTouchListener;

    invoke-virtual {v0, v1}, Lcom/huawei/wallet/ui/carddisplay/HwScrollView;->setOnTouchListener(Landroid/view/View$OnTouchListener;)V

    .line 273
    sget v0, Lcom/huawei/wallet/R$id;->control_scroll:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/wallet/ui/cardholder/CardHolderFragment;->q:Landroid/view/View;

    .line 275
    sget v0, Lcom/huawei/wallet/R$id;->card_container:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/huawei/wallet/ui/carddisplay/CardHolderLayout;

    iput-object v0, p0, Lcom/huawei/wallet/ui/cardholder/CardHolderFragment;->n:Lcom/huawei/wallet/ui/carddisplay/CardHolderLayout;

    .line 276
    iget-object v0, p0, Lcom/huawei/wallet/ui/cardholder/CardHolderFragment;->n:Lcom/huawei/wallet/ui/carddisplay/CardHolderLayout;

    iget-object v1, p0, Lcom/huawei/wallet/ui/cardholder/CardHolderFragment;->f:Lcom/huawei/wallet/ui/carddisplay/HwScrollView;

    invoke-virtual {v0, v1}, Lcom/huawei/wallet/ui/carddisplay/CardHolderLayout;->setParentScrollView(Lcom/huawei/wallet/ui/carddisplay/HwScrollView;)V

    .line 277
    iget-object v0, p0, Lcom/huawei/wallet/ui/cardholder/CardHolderFragment;->n:Lcom/huawei/wallet/ui/carddisplay/CardHolderLayout;

    iget-object v1, p0, Lcom/huawei/wallet/ui/cardholder/CardHolderFragment;->B:Lcom/huawei/wallet/ui/cardholder/CardHolderFragment$CardListener;

    invoke-virtual {v0, v1}, Lcom/huawei/wallet/ui/carddisplay/CardHolderLayout;->setItemClickListener(Lcom/huawei/wallet/ui/carddisplay/CardLayout$OnItemClickListener;)V

    .line 278
    iget-object v0, p0, Lcom/huawei/wallet/ui/cardholder/CardHolderFragment;->n:Lcom/huawei/wallet/ui/carddisplay/CardHolderLayout;

    iget-object v1, p0, Lcom/huawei/wallet/ui/cardholder/CardHolderFragment;->B:Lcom/huawei/wallet/ui/cardholder/CardHolderFragment$CardListener;

    invoke-virtual {v0, v1}, Lcom/huawei/wallet/ui/carddisplay/CardHolderLayout;->setOnChangeListener(Lcom/huawei/wallet/ui/carddisplay/CardLayout$OnDragPosChanageListener;)V

    .line 279
    iget-object v0, p0, Lcom/huawei/wallet/ui/cardholder/CardHolderFragment;->n:Lcom/huawei/wallet/ui/carddisplay/CardHolderLayout;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/huawei/wallet/ui/carddisplay/CardHolderLayout;->setDragEnable(Z)V

    .line 281
    sget v0, Lcom/huawei/wallet/R$id;->offline_section:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/wallet/ui/cardholder/CardHolderFragment;->p:Landroid/view/View;

    .line 283
    iget-object v0, p0, Lcom/huawei/wallet/ui/cardholder/CardHolderFragment;->p:Landroid/view/View;

    sget v1, Lcom/huawei/wallet/R$id;->buttomview:I

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lo/ems;

    iput-object v0, p0, Lcom/huawei/wallet/ui/cardholder/CardHolderFragment;->m:Lo/ems;

    .line 284
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    sget v1, Lcom/huawei/wallet/R$layout;->card_holder_section_bottomview:I

    const/4 v2, 0x0

    invoke-static {v0, v1, v2}, Landroid/view/View;->inflate(Landroid/content/Context;ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v3

    .line 285
    iget-object v0, p0, Lcom/huawei/wallet/ui/cardholder/CardHolderFragment;->m:Lo/ems;

    invoke-virtual {v0, v3}, Lo/ems;->e(Landroid/view/View;)V

    .line 286
    iget-object v0, p0, Lcom/huawei/wallet/ui/cardholder/CardHolderFragment;->m:Lo/ems;

    invoke-virtual {p0}, Lcom/huawei/wallet/ui/cardholder/CardHolderFragment;->getActivity()Landroid/app/Activity;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/ems;->a(Landroid/app/Activity;)V

    .line 287
    sget v0, Lcom/huawei/wallet/R$id;->add_card:I

    invoke-virtual {v3, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    iput-object v0, p0, Lcom/huawei/wallet/ui/cardholder/CardHolderFragment;->o:Landroid/widget/LinearLayout;

    .line 289
    iget-object v0, p0, Lcom/huawei/wallet/ui/cardholder/CardHolderFragment;->o:Landroid/widget/LinearLayout;

    invoke-virtual {v0, p0}, Landroid/widget/LinearLayout;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 291
    iget-object v0, p0, Lcom/huawei/wallet/ui/cardholder/CardHolderFragment;->p:Landroid/view/View;

    sget v1, Lcom/huawei/wallet/R$id;->add_card_empty:I

    .line 292
    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lo/egd;

    iput-object v0, p0, Lcom/huawei/wallet/ui/cardholder/CardHolderFragment;->l:Lo/egd;

    .line 293
    iget-object v0, p0, Lcom/huawei/wallet/ui/cardholder/CardHolderFragment;->l:Lo/egd;

    invoke-virtual {v0, p0}, Lo/egd;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 295
    iget-object v0, p0, Lcom/huawei/wallet/ui/cardholder/CardHolderFragment;->p:Landroid/view/View;

    iput-object v0, p0, Lcom/huawei/wallet/ui/cardholder/CardHolderFragment;->u:Landroid/view/View;

    .line 296
    sget-object v0, Lcom/huawei/wallet/ui/cardholder/CardHolderFragment;->G:Ljava/util/concurrent/ExecutorService;

    new-instance v1, Lcom/huawei/wallet/ui/cardholder/CardHolderFragment$1;

    invoke-direct {v1, p0}, Lcom/huawei/wallet/ui/cardholder/CardHolderFragment$1;-><init>(Lcom/huawei/wallet/ui/cardholder/CardHolderFragment;)V

    invoke-interface {v0, v1}, Ljava/util/concurrent/ExecutorService;->execute(Ljava/lang/Runnable;)V

    .line 313
    return-void
.end method

.method static synthetic b(Lcom/huawei/wallet/ui/cardholder/CardHolderFragment;)Lcom/huawei/wallet/ui/carddisplay/CardHolderLayout;
    .locals 1

    .line 81
    iget-object v0, p0, Lcom/huawei/wallet/ui/cardholder/CardHolderFragment;->n:Lcom/huawei/wallet/ui/carddisplay/CardHolderLayout;

    return-object v0
.end method

.method private b(Landroid/view/View;I)V
    .locals 7

    .line 594
    iget-object v0, p0, Lcom/huawei/wallet/ui/cardholder/CardHolderFragment;->r:Lcom/huawei/wallet/ui/carddisplay/CardHolderDisplayManager;

    invoke-virtual {v0}, Lcom/huawei/wallet/ui/carddisplay/CardHolderDisplayManager;->g()I

    move-result v5

    .line 595
    const-string v0, "PluginPay CardHolderFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "procCardItemClick(),topCardSize"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, ",position="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 596
    const/4 v6, 0x0

    .line 597
    if-ge p2, v5, :cond_1

    .line 598
    iget-object v0, p0, Lcom/huawei/wallet/ui/cardholder/CardHolderFragment;->D:Lcom/huawei/nfc/carrera/logic/NFCOpenApi;

    if-eqz v0, :cond_0

    .line 610
    iget-object v0, p0, Lcom/huawei/wallet/ui/cardholder/CardHolderFragment;->D:Lcom/huawei/nfc/carrera/logic/NFCOpenApi;

    iget-object v1, p0, Lcom/huawei/wallet/ui/cardholder/CardHolderFragment;->t:Ljava/util/List;

    .line 612
    invoke-interface {v1, p2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/huawei/wallet/model/unicard/UniCardInfo;

    .line 613
    invoke-virtual {p0}, Lcom/huawei/wallet/ui/cardholder/CardHolderFragment;->getActivity()Landroid/app/Activity;

    move-result-object v2

    iget-object v3, p0, Lcom/huawei/wallet/ui/cardholder/CardHolderFragment;->r:Lcom/huawei/wallet/ui/carddisplay/CardHolderDisplayManager;

    .line 615
    const/4 v4, 0x1

    invoke-virtual {v3, v4}, Lcom/huawei/wallet/ui/carddisplay/CardHolderDisplayManager;->a(I)I

    move-result v3

    .line 611
    invoke-interface {v0, v1, v2, v3}, Lcom/huawei/nfc/carrera/logic/NFCOpenApi;->getCardDetailView(Lcom/huawei/wallet/model/unicard/UniCardInfo;Landroid/app/Activity;I)Landroid/view/View;

    move-result-object v6

    goto :goto_0

    .line 618
    :cond_0
    const-string v0, "PluginPay CardHolderFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "nfcapi is  null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 621
    :cond_1
    :goto_0
    invoke-direct {p0}, Lcom/huawei/wallet/ui/cardholder/CardHolderFragment;->n()V

    .line 622
    iget-object v0, p0, Lcom/huawei/wallet/ui/cardholder/CardHolderFragment;->r:Lcom/huawei/wallet/ui/carddisplay/CardHolderDisplayManager;

    invoke-virtual {v0, p1, p2, v6}, Lcom/huawei/wallet/ui/carddisplay/CardHolderDisplayManager;->b(Landroid/view/View;ILandroid/view/View;)V

    .line 623
    return-void
.end method

.method private b(Z)V
    .locals 5

    .line 518
    const/4 v3, 0x0

    .line 519
    if-eqz p1, :cond_0

    .line 520
    iget v0, p0, Lcom/huawei/wallet/ui/cardholder/CardHolderFragment;->x:F

    iget-object v1, p0, Lcom/huawei/wallet/ui/cardholder/CardHolderFragment;->r:Lcom/huawei/wallet/ui/carddisplay/CardHolderDisplayManager;

    .line 521
    invoke-virtual {v1}, Lcom/huawei/wallet/ui/carddisplay/CardHolderDisplayManager;->d()I

    move-result v1

    int-to-float v1, v1

    add-float/2addr v0, v1

    iget v1, p0, Lcom/huawei/wallet/ui/cardholder/CardHolderFragment;->s:F

    add-float/2addr v0, v1

    float-to-int v0, v0

    iput v0, p0, Lcom/huawei/wallet/ui/cardholder/CardHolderFragment;->v:I

    .line 522
    iget v3, p0, Lcom/huawei/wallet/ui/cardholder/CardHolderFragment;->v:I

    goto :goto_0

    .line 525
    :cond_0
    iget-object v0, p0, Lcom/huawei/wallet/ui/cardholder/CardHolderFragment;->f:Lcom/huawei/wallet/ui/carddisplay/HwScrollView;

    invoke-virtual {v0}, Lcom/huawei/wallet/ui/carddisplay/HwScrollView;->getScrollY()I

    move-result v0

    iput v0, p0, Lcom/huawei/wallet/ui/cardholder/CardHolderFragment;->A:I

    .line 526
    iget-object v0, p0, Lcom/huawei/wallet/ui/cardholder/CardHolderFragment;->f:Lcom/huawei/wallet/ui/carddisplay/HwScrollView;

    invoke-virtual {v0}, Lcom/huawei/wallet/ui/carddisplay/HwScrollView;->getHeight()I

    move-result v3

    .line 528
    :goto_0
    iget-object v0, p0, Lcom/huawei/wallet/ui/cardholder/CardHolderFragment;->q:Landroid/view/View;

    .line 529
    invoke-virtual {v0}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Landroid/view/ViewGroup$MarginLayoutParams;

    .line 530
    if-eqz v4, :cond_1

    .line 531
    iput v3, v4, Landroid/view/ViewGroup$MarginLayoutParams;->topMargin:I

    .line 532
    iget-object v0, p0, Lcom/huawei/wallet/ui/cardholder/CardHolderFragment;->q:Landroid/view/View;

    invoke-virtual {v0, v4}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 533
    if-nez p1, :cond_1

    .line 534
    iget-object v0, p0, Lcom/huawei/wallet/ui/cardholder/CardHolderFragment;->f:Lcom/huawei/wallet/ui/carddisplay/HwScrollView;

    const/4 v1, 0x0

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Lcom/huawei/wallet/ui/carddisplay/HwScrollView;->scrollTo(II)V

    .line 537
    :cond_1
    return-void
.end method

.method static synthetic c(Lcom/huawei/wallet/ui/cardholder/CardHolderFragment;)Lcom/huawei/nfc/carrera/logic/NFCOpenApi;
    .locals 1

    .line 81
    iget-object v0, p0, Lcom/huawei/wallet/ui/cardholder/CardHolderFragment;->D:Lcom/huawei/nfc/carrera/logic/NFCOpenApi;

    return-object v0
.end method

.method private c(I)V
    .locals 2

    .line 316
    iget-object v0, p0, Lcom/huawei/wallet/ui/cardholder/CardHolderFragment;->t:Ljava/util/List;

    if-nez v0, :cond_0

    .line 317
    new-instance v0, Ljava/util/LinkedList;

    invoke-direct {v0}, Ljava/util/LinkedList;-><init>()V

    iput-object v0, p0, Lcom/huawei/wallet/ui/cardholder/CardHolderFragment;->t:Ljava/util/List;

    .line 319
    :cond_0
    iget-object v0, p0, Lcom/huawei/wallet/ui/cardholder/CardHolderFragment;->t:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 320
    new-instance v1, Lcom/huawei/wallet/model/unicard/UniCardInfo;

    invoke-direct {v1}, Lcom/huawei/wallet/model/unicard/UniCardInfo;-><init>()V

    .line 321
    invoke-virtual {v1, p1}, Lcom/huawei/wallet/model/unicard/UniCardInfo;->b(I)V

    .line 322
    iget-object v0, p0, Lcom/huawei/wallet/ui/cardholder/CardHolderFragment;->t:Ljava/util/List;

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 324
    :cond_1
    iget-object v0, p0, Lcom/huawei/wallet/ui/cardholder/CardHolderFragment;->t:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    iput v0, p0, Lcom/huawei/wallet/ui/cardholder/CardHolderFragment;->y:I

    .line 326
    return-void
.end method

.method private c(Landroid/app/Activity;)V
    .locals 4

    .line 384
    iget-object v0, p0, Lcom/huawei/wallet/ui/cardholder/CardHolderFragment;->i:Landroid/view/View;

    if-eqz v0, :cond_0

    .line 385
    iget-object v0, p0, Lcom/huawei/wallet/ui/cardholder/CardHolderFragment;->i:Landroid/view/View;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 387
    :cond_0
    iget-object v0, p0, Lcom/huawei/wallet/ui/cardholder/CardHolderFragment;->b:Landroid/view/View;

    if-eqz v0, :cond_1

    .line 388
    iget-object v0, p0, Lcom/huawei/wallet/ui/cardholder/CardHolderFragment;->b:Landroid/view/View;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 391
    :cond_1
    iget-object v0, p0, Lcom/huawei/wallet/ui/cardholder/CardHolderFragment;->u:Landroid/view/View;

    if-eqz v0, :cond_2

    .line 393
    iget-object v0, p0, Lcom/huawei/wallet/ui/cardholder/CardHolderFragment;->u:Landroid/view/View;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 394
    iget-object v0, p0, Lcom/huawei/wallet/ui/cardholder/CardHolderFragment;->o:Landroid/widget/LinearLayout;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setClickable(Z)V

    .line 395
    iget-object v0, p0, Lcom/huawei/wallet/ui/cardholder/CardHolderFragment;->l:Lo/egd;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lo/egd;->setClickable(Z)V

    .line 396
    iget-object v0, p0, Lcom/huawei/wallet/ui/cardholder/CardHolderFragment;->u:Landroid/view/View;

    const/high16 v1, 0x3f800000    # 1.0f

    invoke-virtual {v0, v1}, Landroid/view/View;->setAlpha(F)V

    .line 399
    :cond_2
    iget-object v0, p0, Lcom/huawei/wallet/ui/cardholder/CardHolderFragment;->n:Lcom/huawei/wallet/ui/carddisplay/CardHolderLayout;

    if-nez v0, :cond_3

    .line 400
    invoke-static {p1}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v2

    .line 401
    sget v0, Lcom/huawei/wallet/R$layout;->card_holder_list:I

    const/4 v1, 0x0

    invoke-virtual {v2, v0, v1}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v3

    .line 402
    iget-object v0, p0, Lcom/huawei/wallet/ui/cardholder/CardHolderFragment;->g:Landroid/view/ViewGroup;

    if-eqz v0, :cond_3

    .line 403
    iget-object v0, p0, Lcom/huawei/wallet/ui/cardholder/CardHolderFragment;->g:Landroid/view/ViewGroup;

    invoke-virtual {v0, v3}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 404
    invoke-direct {p0, v3}, Lcom/huawei/wallet/ui/cardholder/CardHolderFragment;->a(Landroid/view/View;)V

    .line 405
    invoke-direct {p0}, Lcom/huawei/wallet/ui/cardholder/CardHolderFragment;->l()V

    .line 406
    invoke-direct {p0}, Lcom/huawei/wallet/ui/cardholder/CardHolderFragment;->d()V

    .line 409
    :cond_3
    return-void
.end method

.method static synthetic c(Lcom/huawei/wallet/ui/cardholder/CardHolderFragment;Landroid/view/View;I)V
    .locals 0

    .line 81
    invoke-direct {p0, p1, p2}, Lcom/huawei/wallet/ui/cardholder/CardHolderFragment;->b(Landroid/view/View;I)V

    return-void
.end method

.method static synthetic d(Lcom/huawei/wallet/ui/cardholder/CardHolderFragment;)Ljava/util/List;
    .locals 1

    .line 81
    iget-object v0, p0, Lcom/huawei/wallet/ui/cardholder/CardHolderFragment;->t:Ljava/util/List;

    return-object v0
.end method

.method private d()V
    .locals 2

    .line 251
    iget v0, p0, Lcom/huawei/wallet/ui/cardholder/CardHolderFragment;->y:I

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    iget-object v0, p0, Lcom/huawei/wallet/ui/cardholder/CardHolderFragment;->t:Ljava/util/List;

    const/4 v1, 0x0

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/wallet/model/unicard/UniCardInfo;

    invoke-virtual {v0}, Lcom/huawei/wallet/model/unicard/UniCardInfo;->f()I

    move-result v0

    const/16 v1, -0x456

    if-eq v1, v0, :cond_0

    .line 252
    iget-object v0, p0, Lcom/huawei/wallet/ui/cardholder/CardHolderFragment;->o:Landroid/widget/LinearLayout;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 253
    iget-object v0, p0, Lcom/huawei/wallet/ui/cardholder/CardHolderFragment;->m:Lo/ems;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lo/ems;->setVisibility(I)V

    goto :goto_0

    .line 255
    :cond_0
    iget-object v0, p0, Lcom/huawei/wallet/ui/cardholder/CardHolderFragment;->m:Lo/ems;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Lo/ems;->setVisibility(I)V

    .line 256
    iget-object v0, p0, Lcom/huawei/wallet/ui/cardholder/CardHolderFragment;->o:Landroid/widget/LinearLayout;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 257
    iget-object v0, p0, Lcom/huawei/wallet/ui/cardholder/CardHolderFragment;->l:Lo/egd;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lo/egd;->setVisibility(I)V

    .line 260
    :goto_0
    return-void
.end method

.method private d(I)V
    .locals 3

    .line 626
    iget-object v0, p0, Lcom/huawei/wallet/ui/cardholder/CardHolderFragment;->r:Lcom/huawei/wallet/ui/carddisplay/CardHolderDisplayManager;

    invoke-virtual {v0}, Lcom/huawei/wallet/ui/carddisplay/CardHolderDisplayManager;->g()I

    move-result v2

    .line 627
    if-ge p1, v2, :cond_0

    .line 628
    iget-object v0, p0, Lcom/huawei/wallet/ui/cardholder/CardHolderFragment;->D:Lcom/huawei/nfc/carrera/logic/NFCOpenApi;

    invoke-virtual {p0}, Lcom/huawei/wallet/ui/cardholder/CardHolderFragment;->getActivity()Landroid/app/Activity;

    move-result-object v1

    invoke-interface {v0, v1}, Lcom/huawei/nfc/carrera/logic/NFCOpenApi;->jumpToAddCardActivity(Landroid/app/Activity;)V

    .line 630
    :cond_0
    return-void
.end method

.method private d(Landroid/view/View;)V
    .locals 5

    .line 791
    iget-object v0, p0, Lcom/huawei/wallet/ui/cardholder/CardHolderFragment;->o:Landroid/widget/LinearLayout;

    if-eq p1, v0, :cond_0

    iget-object v0, p0, Lcom/huawei/wallet/ui/cardholder/CardHolderFragment;->l:Lo/egd;

    if-ne p1, v0, :cond_5

    .line 792
    :cond_0
    invoke-virtual {p0}, Lcom/huawei/wallet/ui/cardholder/CardHolderFragment;->getActivity()Landroid/app/Activity;

    move-result-object v0

    sget-object v1, Lcom/huawei/wallet/ui/cardholder/CardHolderFragment;->d:[Ljava/lang/String;

    invoke-static {v0, v1}, Lo/dbe;->c(Landroid/content/Context;[Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_3

    .line 793
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x17

    if-lt v0, v1, :cond_3

    .line 794
    invoke-virtual {p0}, Lcom/huawei/wallet/ui/cardholder/CardHolderFragment;->getActivity()Landroid/app/Activity;

    move-result-object v0

    const-string v1, "android.permission.WRITE_EXTERNAL_STORAGE"

    invoke-static {v0, v1}, Lo/dbf;->l(Landroid/content/Context;Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 795
    invoke-virtual {p0}, Lcom/huawei/wallet/ui/cardholder/CardHolderFragment;->getActivity()Landroid/app/Activity;

    move-result-object v0

    const-string v1, "android.permission.WRITE_EXTERNAL_STORAGE"

    invoke-virtual {v0, v1}, Landroid/app/Activity;->shouldShowRequestPermissionRationale(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_2

    :cond_1
    const/4 v4, 0x1

    goto :goto_0

    :cond_2
    const/4 v4, 0x0

    .line 796
    :goto_0
    if-nez v4, :cond_3

    .line 797
    invoke-virtual {p0}, Lcom/huawei/wallet/ui/cardholder/CardHolderFragment;->getActivity()Landroid/app/Activity;

    move-result-object v0

    invoke-virtual {p0}, Lcom/huawei/wallet/ui/cardholder/CardHolderFragment;->getActivity()Landroid/app/Activity;

    move-result-object v1

    invoke-virtual {v1}, Landroid/app/Activity;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/wallet/R$string;->nfc_card_holder_no_permission:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/ene;->c(Landroid/content/Context;Ljava/lang/String;)V

    .line 798
    return-void

    .line 802
    :cond_3
    invoke-virtual {p0}, Lcom/huawei/wallet/ui/cardholder/CardHolderFragment;->getActivity()Landroid/app/Activity;

    move-result-object v0

    const-string v1, "android.permission.WRITE_EXTERNAL_STORAGE"

    invoke-static {v0, v1}, Landroid/support/v4/content/ContextCompat;->checkSelfPermission(Landroid/content/Context;Ljava/lang/String;)I

    move-result v0

    if-eqz v0, :cond_4

    .line 804
    const-string v0, "PluginPay CardHolderFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "have not permission"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 806
    invoke-virtual {p0}, Lcom/huawei/wallet/ui/cardholder/CardHolderFragment;->getActivity()Landroid/app/Activity;

    move-result-object v0

    const-string v1, "android.permission.WRITE_EXTERNAL_STORAGE"

    invoke-static {v0, v1}, Lo/dbf;->m(Landroid/content/Context;Ljava/lang/String;)V

    .line 807
    invoke-virtual {p0}, Lcom/huawei/wallet/ui/cardholder/CardHolderFragment;->getActivity()Landroid/app/Activity;

    move-result-object v0

    sget-object v1, Lcom/huawei/wallet/ui/cardholder/CardHolderFragment;->d:[Ljava/lang/String;

    const/16 v2, 0xa

    invoke-static {v0, v1, v2}, Landroid/support/v4/app/ActivityCompat;->requestPermissions(Landroid/app/Activity;[Ljava/lang/String;I)V

    goto :goto_1

    .line 809
    :cond_4
    invoke-virtual {p0}, Lcom/huawei/wallet/ui/cardholder/CardHolderFragment;->b()V

    .line 812
    :cond_5
    :goto_1
    return-void
.end method

.method static synthetic d(Lcom/huawei/wallet/ui/cardholder/CardHolderFragment;Landroid/view/View;I)V
    .locals 0

    .line 81
    invoke-direct {p0, p1, p2}, Lcom/huawei/wallet/ui/cardholder/CardHolderFragment;->e(Landroid/view/View;I)V

    return-void
.end method

.method private e(Landroid/view/View;I)V
    .locals 3

    .line 744
    instance-of v2, p1, Lcom/huawei/wallet/ui/carddisplay/CardAnimImageView;

    .line 746
    if-eqz v2, :cond_1

    invoke-virtual {p1}, Landroid/view/View;->getId()I

    move-result v0

    sget v1, Lcom/huawei/wallet/R$id;->card_virtual:I

    if-eq v0, v1, :cond_1

    .line 747
    iget-object v0, p0, Lcom/huawei/wallet/ui/cardholder/CardHolderFragment;->r:Lcom/huawei/wallet/ui/carddisplay/CardHolderDisplayManager;

    invoke-virtual {v0}, Lcom/huawei/wallet/ui/carddisplay/CardHolderDisplayManager;->f()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 748
    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lcom/huawei/wallet/ui/cardholder/CardHolderFragment;->b(Z)V

    .line 749
    invoke-direct {p0, p1, p2}, Lcom/huawei/wallet/ui/cardholder/CardHolderFragment;->b(Landroid/view/View;I)V

    goto :goto_0

    .line 751
    :cond_0
    const/4 v0, 0x1

    invoke-direct {p0, v0}, Lcom/huawei/wallet/ui/cardholder/CardHolderFragment;->b(Z)V

    .line 752
    iget-object v0, p0, Lcom/huawei/wallet/ui/cardholder/CardHolderFragment;->q:Landroid/view/View;

    new-instance v1, Lcom/huawei/wallet/ui/cardholder/CardHolderFragment$2;

    invoke-direct {v1, p0, p1, p2}, Lcom/huawei/wallet/ui/cardholder/CardHolderFragment$2;-><init>(Lcom/huawei/wallet/ui/cardholder/CardHolderFragment;Landroid/view/View;I)V

    invoke-virtual {v0, v1}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z

    goto :goto_0

    .line 761
    :cond_1
    invoke-virtual {p1}, Landroid/view/View;->getId()I

    move-result v0

    sget v1, Lcom/huawei/wallet/R$id;->card_virtual:I

    if-ne v0, v1, :cond_2

    if-nez v2, :cond_2

    .line 763
    invoke-direct {p0, p2}, Lcom/huawei/wallet/ui/cardholder/CardHolderFragment;->d(I)V

    .line 766
    :cond_2
    :goto_0
    return-void
.end method

.method static synthetic e(Lcom/huawei/wallet/ui/cardholder/CardHolderFragment;)V
    .locals 0

    .line 81
    invoke-direct {p0}, Lcom/huawei/wallet/ui/cardholder/CardHolderFragment;->k()V

    return-void
.end method

.method static synthetic f(Lcom/huawei/wallet/ui/cardholder/CardHolderFragment;)I
    .locals 1

    .line 81
    iget v0, p0, Lcom/huawei/wallet/ui/cardholder/CardHolderFragment;->A:I

    return v0
.end method

.method private f()V
    .locals 6

    .line 430
    invoke-virtual {p0}, Lcom/huawei/wallet/ui/cardholder/CardHolderFragment;->getActivity()Landroid/app/Activity;

    move-result-object v5

    .line 431
    if-eqz v5, :cond_1

    .line 432
    const/16 v0, -0x456

    invoke-direct {p0, v0}, Lcom/huawei/wallet/ui/cardholder/CardHolderFragment;->c(I)V

    .line 433
    invoke-direct {p0}, Lcom/huawei/wallet/ui/cardholder/CardHolderFragment;->g()V

    .line 434
    iget-object v0, p0, Lcom/huawei/wallet/ui/cardholder/CardHolderFragment;->j:Landroid/graphics/drawable/Drawable;

    if-nez v0, :cond_0

    .line 435
    invoke-virtual {v5}, Landroid/app/Activity;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/wallet/R$drawable;->ic_hint_red:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/wallet/ui/cardholder/CardHolderFragment;->j:Landroid/graphics/drawable/Drawable;

    .line 438
    :cond_0
    iget-object v0, p0, Lcom/huawei/wallet/ui/cardholder/CardHolderFragment;->j:Landroid/graphics/drawable/Drawable;

    iget-object v1, p0, Lcom/huawei/wallet/ui/cardholder/CardHolderFragment;->j:Landroid/graphics/drawable/Drawable;

    invoke-virtual {v1}, Landroid/graphics/drawable/Drawable;->getMinimumWidth()I

    move-result v1

    iget-object v2, p0, Lcom/huawei/wallet/ui/cardholder/CardHolderFragment;->j:Landroid/graphics/drawable/Drawable;

    .line 439
    invoke-virtual {v2}, Landroid/graphics/drawable/Drawable;->getMinimumHeight()I

    move-result v2

    .line 438
    const/4 v3, 0x0

    const/4 v4, 0x0

    invoke-virtual {v0, v3, v4, v1, v2}, Landroid/graphics/drawable/Drawable;->setBounds(IIII)V

    .line 440
    iget-object v0, p0, Lcom/huawei/wallet/ui/cardholder/CardHolderFragment;->c:Landroid/widget/TextView;

    iget-object v1, p0, Lcom/huawei/wallet/ui/cardholder/CardHolderFragment;->j:Landroid/graphics/drawable/Drawable;

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    invoke-virtual {v0, v1, v2, v3, v4}, Landroid/widget/TextView;->setCompoundDrawables(Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;)V

    .line 441
    iget-object v0, p0, Lcom/huawei/wallet/ui/cardholder/CardHolderFragment;->b:Landroid/view/View;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 442
    iget-object v0, p0, Lcom/huawei/wallet/ui/cardholder/CardHolderFragment;->c:Landroid/widget/TextView;

    invoke-virtual {v5}, Landroid/app/Activity;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/wallet/R$string;->huaweipay_net_error_click_refresh:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 445
    :cond_1
    return-void
.end method

.method static synthetic g(Lcom/huawei/wallet/ui/cardholder/CardHolderFragment;)Landroid/view/View;
    .locals 1

    .line 81
    iget-object v0, p0, Lcom/huawei/wallet/ui/cardholder/CardHolderFragment;->u:Landroid/view/View;

    return-object v0
.end method

.method private g()V
    .locals 6

    .line 362
    invoke-virtual {p0}, Lcom/huawei/wallet/ui/cardholder/CardHolderFragment;->getActivity()Landroid/app/Activity;

    move-result-object v4

    .line 363
    if-eqz v4, :cond_1

    .line 364
    invoke-direct {p0, v4}, Lcom/huawei/wallet/ui/cardholder/CardHolderFragment;->c(Landroid/app/Activity;)V

    .line 366
    iget-object v0, p0, Lcom/huawei/wallet/ui/cardholder/CardHolderFragment;->n:Lcom/huawei/wallet/ui/carddisplay/CardHolderLayout;

    if-eqz v0, :cond_1

    .line 367
    iget-object v0, p0, Lcom/huawei/wallet/ui/cardholder/CardHolderFragment;->E:Lcom/huawei/wallet/ui/cardholder/CardHolderFragment$DisplayRunnbale;

    if-nez v0, :cond_0

    .line 368
    new-instance v0, Lcom/huawei/wallet/ui/cardholder/CardHolderFragment$DisplayRunnbale;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Lcom/huawei/wallet/ui/cardholder/CardHolderFragment$DisplayRunnbale;-><init>(Lcom/huawei/wallet/ui/cardholder/CardHolderFragment;Lcom/huawei/wallet/ui/cardholder/CardHolderFragment$1;)V

    iput-object v0, p0, Lcom/huawei/wallet/ui/cardholder/CardHolderFragment;->E:Lcom/huawei/wallet/ui/cardholder/CardHolderFragment$DisplayRunnbale;

    .line 371
    :cond_0
    iget-object v0, p0, Lcom/huawei/wallet/ui/cardholder/CardHolderFragment;->n:Lcom/huawei/wallet/ui/carddisplay/CardHolderLayout;

    iget-object v1, p0, Lcom/huawei/wallet/ui/cardholder/CardHolderFragment;->E:Lcom/huawei/wallet/ui/cardholder/CardHolderFragment$DisplayRunnbale;

    invoke-virtual {v0, v1}, Lcom/huawei/wallet/ui/carddisplay/CardHolderLayout;->post(Ljava/lang/Runnable;)Z

    move-result v5

    .line 373
    if-nez v5, :cond_1

    .line 374
    const-string v0, "CardHolderFragment show cards view fail,and post runnbale again"

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/huawei/wallet/utils/log/LogC;->a(Ljava/lang/String;Z)V

    .line 376
    iget-object v0, p0, Lcom/huawei/wallet/ui/cardholder/CardHolderFragment;->n:Lcom/huawei/wallet/ui/carddisplay/CardHolderLayout;

    iget-object v1, p0, Lcom/huawei/wallet/ui/cardholder/CardHolderFragment;->E:Lcom/huawei/wallet/ui/cardholder/CardHolderFragment$DisplayRunnbale;

    const-wide/16 v2, 0xfa

    invoke-virtual {v0, v1, v2, v3}, Lcom/huawei/wallet/ui/carddisplay/CardHolderLayout;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 381
    :cond_1
    return-void
.end method

.method static synthetic h(Lcom/huawei/wallet/ui/cardholder/CardHolderFragment;)Lcom/huawei/wallet/ui/cardholder/ScrollViewTouchListener;
    .locals 1

    .line 81
    iget-object v0, p0, Lcom/huawei/wallet/ui/cardholder/CardHolderFragment;->F:Lcom/huawei/wallet/ui/cardholder/ScrollViewTouchListener;

    return-object v0
.end method

.method private h()V
    .locals 4

    .line 334
    const-string v0, "PluginPay CardHolderFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "disPlayCardsView(),topCardSize"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 335
    iget v0, p0, Lcom/huawei/wallet/ui/cardholder/CardHolderFragment;->y:I

    if-lez v0, :cond_0

    .line 336
    iget-object v0, p0, Lcom/huawei/wallet/ui/cardholder/CardHolderFragment;->r:Lcom/huawei/wallet/ui/carddisplay/CardHolderDisplayManager;

    iget-object v1, p0, Lcom/huawei/wallet/ui/cardholder/CardHolderFragment;->t:Ljava/util/List;

    invoke-virtual {v0, v1}, Lcom/huawei/wallet/ui/carddisplay/CardHolderDisplayManager;->a(Ljava/util/List;)V

    .line 337
    invoke-direct {p0}, Lcom/huawei/wallet/ui/cardholder/CardHolderFragment;->m()V

    .line 340
    :cond_0
    const/4 v0, 0x1

    invoke-direct {p0, v0}, Lcom/huawei/wallet/ui/cardholder/CardHolderFragment;->b(Z)V

    .line 342
    iget-object v0, p0, Lcom/huawei/wallet/ui/cardholder/CardHolderFragment;->r:Lcom/huawei/wallet/ui/carddisplay/CardHolderDisplayManager;

    invoke-virtual {v0}, Lcom/huawei/wallet/ui/carddisplay/CardHolderDisplayManager;->b()V

    .line 344
    return-void
.end method

.method static synthetic i(Lcom/huawei/wallet/ui/cardholder/CardHolderFragment;)Lcom/huawei/wallet/ui/carddisplay/HwScrollView;
    .locals 1

    .line 81
    iget-object v0, p0, Lcom/huawei/wallet/ui/cardholder/CardHolderFragment;->f:Lcom/huawei/wallet/ui/carddisplay/HwScrollView;

    return-object v0
.end method

.method private i()V
    .locals 3

    .line 451
    invoke-virtual {p0}, Lcom/huawei/wallet/ui/cardholder/CardHolderFragment;->getActivity()Landroid/app/Activity;

    move-result-object v2

    .line 452
    if-eqz v2, :cond_0

    .line 453
    const/16 v0, -0x456

    invoke-direct {p0, v0}, Lcom/huawei/wallet/ui/cardholder/CardHolderFragment;->c(I)V

    .line 454
    invoke-direct {p0}, Lcom/huawei/wallet/ui/cardholder/CardHolderFragment;->g()V

    .line 455
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lcom/huawei/nfc/carrera/logic/lifecycle/push/NFCPushServiceManager;->getInstance(Landroid/content/Context;)Lcom/huawei/nfc/carrera/logic/lifecycle/push/NFCPushServiceManager;

    move-result-object v0

    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v1

    invoke-static {v1}, Lcom/huawei/nfc/carrera/logic/lifecycle/push/NFCPushServiceManager;->getInstance(Landroid/content/Context;)Lcom/huawei/nfc/carrera/logic/lifecycle/push/NFCPushServiceManager;

    move-result-object v1

    invoke-virtual {v1}, Lcom/huawei/nfc/carrera/logic/lifecycle/push/NFCPushServiceManager;->getUploadedPushToken()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/huawei/nfc/carrera/logic/lifecycle/push/NFCPushServiceManager;->receivePushToken(Ljava/lang/String;)V

    .line 457
    :cond_0
    return-void
.end method

.method private k()V
    .locals 3

    .line 347
    iget-object v0, p0, Lcom/huawei/wallet/ui/cardholder/CardHolderFragment;->u:Landroid/view/View;

    invoke-virtual {v0}, Landroid/view/View;->getMeasuredHeight()I

    move-result v0

    iput v0, p0, Lcom/huawei/wallet/ui/cardholder/CardHolderFragment;->w:I

    .line 348
    iget-object v0, p0, Lcom/huawei/wallet/ui/cardholder/CardHolderFragment;->n:Lcom/huawei/wallet/ui/carddisplay/CardHolderLayout;

    iget v1, p0, Lcom/huawei/wallet/ui/cardholder/CardHolderFragment;->w:I

    invoke-virtual {v0, v1}, Lcom/huawei/wallet/ui/carddisplay/CardHolderLayout;->setInitTopCardY(I)V

    .line 350
    const/4 v0, 0x2

    new-array v2, v0, [I

    .line 351
    iget-object v0, p0, Lcom/huawei/wallet/ui/cardholder/CardHolderFragment;->n:Lcom/huawei/wallet/ui/carddisplay/CardHolderLayout;

    invoke-virtual {v0, v2}, Lcom/huawei/wallet/ui/carddisplay/CardHolderLayout;->getLocationOnScreen([I)V

    .line 352
    invoke-direct {p0}, Lcom/huawei/wallet/ui/cardholder/CardHolderFragment;->h()V

    .line 353
    iget-object v0, p0, Lcom/huawei/wallet/ui/cardholder/CardHolderFragment;->F:Lcom/huawei/wallet/ui/cardholder/ScrollViewTouchListener;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lcom/huawei/wallet/ui/cardholder/ScrollViewTouchListener;->b(Z)V

    .line 354
    iget-object v0, p0, Lcom/huawei/wallet/ui/cardholder/CardHolderFragment;->f:Lcom/huawei/wallet/ui/carddisplay/HwScrollView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/huawei/wallet/ui/carddisplay/HwScrollView;->setVisibility(I)V

    .line 356
    return-void
.end method

.method static synthetic k(Lcom/huawei/wallet/ui/cardholder/CardHolderFragment;)Z
    .locals 1

    .line 81
    iget-boolean v0, p0, Lcom/huawei/wallet/ui/cardholder/CardHolderFragment;->C:Z

    return v0
.end method

.method static synthetic l(Lcom/huawei/wallet/ui/cardholder/CardHolderFragment;)Lcom/huawei/wallet/ui/cardholder/CardHolderFragment$CardHandler;
    .locals 1

    .line 81
    iget-object v0, p0, Lcom/huawei/wallet/ui/cardholder/CardHolderFragment;->H:Lcom/huawei/wallet/ui/cardholder/CardHolderFragment$CardHandler;

    return-object v0
.end method

.method private l()V
    .locals 11

    .line 489
    invoke-virtual {p0}, Lcom/huawei/wallet/ui/cardholder/CardHolderFragment;->getActivity()Landroid/app/Activity;

    move-result-object v6

    .line 490
    if-eqz v6, :cond_2

    .line 491
    invoke-virtual {p0}, Lcom/huawei/wallet/ui/cardholder/CardHolderFragment;->getActivity()Landroid/app/Activity;

    move-result-object v0

    invoke-static {v0}, Lcom/huawei/pay/ui/util/UiUtil;->getScreenWith(Landroid/app/Activity;)I

    move-result v7

    .line 492
    invoke-virtual {p0}, Lcom/huawei/wallet/ui/cardholder/CardHolderFragment;->getActivity()Landroid/app/Activity;

    move-result-object v0

    invoke-static {v0}, Lcom/huawei/pay/ui/util/UiUtil;->getScreenHeight(Landroid/app/Activity;)I

    move-result v8

    .line 493
    if-ge v7, v8, :cond_0

    goto :goto_0

    :cond_0
    move v7, v8

    .line 495
    :goto_0
    int-to-float v0, v7

    iget v1, p0, Lcom/huawei/wallet/ui/cardholder/CardHolderFragment;->z:F

    const/high16 v2, 0x40000000    # 2.0f

    mul-float/2addr v1, v2

    sub-float/2addr v0, v1

    float-to-int v9, v0

    .line 496
    int-to-float v0, v9

    const/high16 v1, 0x44180000    # 608.0f

    mul-float/2addr v0, v1

    const/high16 v1, 0x44760000    # 984.0f

    div-float/2addr v0, v1

    float-to-int v10, v0

    .line 498
    iget-object v0, p0, Lcom/huawei/wallet/ui/cardholder/CardHolderFragment;->n:Lcom/huawei/wallet/ui/carddisplay/CardHolderLayout;

    const/4 v1, 0x0

    if-ne v1, v0, :cond_1

    .line 499
    return-void

    .line 502
    :cond_1
    new-instance v0, Lcom/huawei/wallet/ui/carddisplay/CardHolderDisplayManager;

    iget-object v2, p0, Lcom/huawei/wallet/ui/cardholder/CardHolderFragment;->n:Lcom/huawei/wallet/ui/carddisplay/CardHolderLayout;

    iget-object v5, p0, Lcom/huawei/wallet/ui/cardholder/CardHolderFragment;->I:Ljava/lang/String;

    move-object v1, v6

    move v3, v9

    move v4, v10

    invoke-direct/range {v0 .. v5}, Lcom/huawei/wallet/ui/carddisplay/CardHolderDisplayManager;-><init>(Landroid/app/Activity;Lcom/huawei/wallet/ui/carddisplay/CardLayout;IILjava/lang/String;)V

    iput-object v0, p0, Lcom/huawei/wallet/ui/cardholder/CardHolderFragment;->r:Lcom/huawei/wallet/ui/carddisplay/CardHolderDisplayManager;

    .line 504
    iget-object v0, p0, Lcom/huawei/wallet/ui/cardholder/CardHolderFragment;->r:Lcom/huawei/wallet/ui/carddisplay/CardHolderDisplayManager;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lcom/huawei/wallet/ui/carddisplay/CardHolderDisplayManager;->c(I)V

    .line 505
    iget-object v0, p0, Lcom/huawei/wallet/ui/cardholder/CardHolderFragment;->r:Lcom/huawei/wallet/ui/carddisplay/CardHolderDisplayManager;

    iget-object v1, p0, Lcom/huawei/wallet/ui/cardholder/CardHolderFragment;->B:Lcom/huawei/wallet/ui/cardholder/CardHolderFragment$CardListener;

    invoke-virtual {v0, v1}, Lcom/huawei/wallet/ui/carddisplay/CardHolderDisplayManager;->b(Lcom/huawei/wallet/ui/carddisplay/CardDisplayManager$OnAnimateListener;)V

    .line 507
    :cond_2
    return-void
.end method

.method private m()V
    .locals 2

    .line 513
    iget-object v0, p0, Lcom/huawei/wallet/ui/cardholder/CardHolderFragment;->n:Lcom/huawei/wallet/ui/carddisplay/CardHolderLayout;

    iget v1, p0, Lcom/huawei/wallet/ui/cardholder/CardHolderFragment;->y:I

    invoke-virtual {v0, v1}, Lcom/huawei/wallet/ui/carddisplay/CardHolderLayout;->setTopCardsCount(I)V

    .line 515
    return-void
.end method

.method private n()V
    .locals 4

    .line 575
    iget-object v0, p0, Lcom/huawei/wallet/ui/cardholder/CardHolderFragment;->r:Lcom/huawei/wallet/ui/carddisplay/CardHolderDisplayManager;

    invoke-virtual {v0}, Lcom/huawei/wallet/ui/carddisplay/CardHolderDisplayManager;->f()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 578
    iget-object v0, p0, Lcom/huawei/wallet/ui/cardholder/CardHolderFragment;->o:Landroid/widget/LinearLayout;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setClickable(Z)V

    .line 579
    iget-object v0, p0, Lcom/huawei/wallet/ui/cardholder/CardHolderFragment;->l:Lo/egd;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lo/egd;->setClickable(Z)V

    .line 580
    iget-object v0, p0, Lcom/huawei/wallet/ui/cardholder/CardHolderFragment;->u:Landroid/view/View;

    const/4 v1, 0x0

    const/16 v2, 0xa

    invoke-static {v0, v1, v2}, Lcom/huawei/wallet/ui/carddisplay/AnimUtil;->a(Landroid/view/View;FI)Landroid/animation/ObjectAnimator;

    move-result-object v3

    .line 582
    invoke-virtual {v3}, Landroid/animation/ObjectAnimator;->start()V

    .line 583
    goto :goto_0

    .line 585
    :cond_0
    iget-object v0, p0, Lcom/huawei/wallet/ui/cardholder/CardHolderFragment;->o:Landroid/widget/LinearLayout;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setClickable(Z)V

    .line 586
    iget-object v0, p0, Lcom/huawei/wallet/ui/cardholder/CardHolderFragment;->l:Lo/egd;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lo/egd;->setClickable(Z)V

    .line 587
    iget-object v0, p0, Lcom/huawei/wallet/ui/cardholder/CardHolderFragment;->u:Landroid/view/View;

    const/high16 v1, 0x3f800000    # 1.0f

    const/16 v2, 0x1f4

    invoke-static {v0, v1, v2}, Lcom/huawei/wallet/ui/carddisplay/AnimUtil;->a(Landroid/view/View;FI)Landroid/animation/ObjectAnimator;

    move-result-object v3

    .line 589
    invoke-virtual {v3}, Landroid/animation/ObjectAnimator;->start()V

    .line 591
    :goto_0
    return-void
.end method

.method private o()V
    .locals 3

    .line 477
    invoke-virtual {p0}, Lcom/huawei/wallet/ui/cardholder/CardHolderFragment;->getActivity()Landroid/app/Activity;

    move-result-object v1

    .line 478
    if-eqz v1, :cond_0

    .line 479
    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    .line 480
    sget v0, Lcom/huawei/wallet/R$dimen;->card_list_magin_bottom:I

    .line 481
    invoke-virtual {v2, v0}, Landroid/content/res/Resources;->getDimension(I)F

    move-result v0

    iput v0, p0, Lcom/huawei/wallet/ui/cardholder/CardHolderFragment;->s:F

    .line 482
    sget v0, Lcom/huawei/wallet/R$dimen;->card_list_magin_top:I

    invoke-virtual {v2, v0}, Landroid/content/res/Resources;->getDimension(I)F

    move-result v0

    iput v0, p0, Lcom/huawei/wallet/ui/cardholder/CardHolderFragment;->x:F

    .line 483
    sget v0, Lcom/huawei/wallet/R$dimen;->card_list_magin_left_right:I

    .line 484
    invoke-virtual {v2, v0}, Landroid/content/res/Resources;->getDimension(I)F

    move-result v0

    iput v0, p0, Lcom/huawei/wallet/ui/cardholder/CardHolderFragment;->z:F

    .line 486
    :cond_0
    return-void
.end method

.method static synthetic o(Lcom/huawei/wallet/ui/cardholder/CardHolderFragment;)V
    .locals 0

    .line 81
    invoke-direct {p0}, Lcom/huawei/wallet/ui/cardholder/CardHolderFragment;->u()V

    return-void
.end method

.method private p()V
    .locals 6

    .line 464
    invoke-virtual {p0}, Lcom/huawei/wallet/ui/cardholder/CardHolderFragment;->getActivity()Landroid/app/Activity;

    move-result-object v5

    .line 465
    if-eqz v5, :cond_0

    .line 466
    const/16 v0, -0x456

    invoke-direct {p0, v0}, Lcom/huawei/wallet/ui/cardholder/CardHolderFragment;->c(I)V

    .line 467
    invoke-direct {p0}, Lcom/huawei/wallet/ui/cardholder/CardHolderFragment;->g()V

    .line 468
    iget-object v0, p0, Lcom/huawei/wallet/ui/cardholder/CardHolderFragment;->b:Landroid/view/View;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 469
    iget-object v0, p0, Lcom/huawei/wallet/ui/cardholder/CardHolderFragment;->c:Landroid/widget/TextView;

    invoke-virtual {v5}, Landroid/app/Activity;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/wallet/R$string;->unconnect_server:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 471
    iget-object v0, p0, Lcom/huawei/wallet/ui/cardholder/CardHolderFragment;->c:Landroid/widget/TextView;

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    invoke-virtual {v0, v1, v2, v3, v4}, Landroid/widget/TextView;->setCompoundDrawables(Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;)V

    .line 472
    iget-object v0, p0, Lcom/huawei/wallet/ui/cardholder/CardHolderFragment;->k:Landroid/widget/TextView;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 474
    :cond_0
    return-void
.end method

.method private q()V
    .locals 2

    .line 842
    sget-object v0, Lcom/huawei/wallet/ui/cardholder/CardHolderFragment;->G:Ljava/util/concurrent/ExecutorService;

    new-instance v1, Lcom/huawei/wallet/ui/cardholder/CardHolderFragment$3;

    invoke-direct {v1, p0}, Lcom/huawei/wallet/ui/cardholder/CardHolderFragment$3;-><init>(Lcom/huawei/wallet/ui/cardholder/CardHolderFragment;)V

    invoke-interface {v0, v1}, Ljava/util/concurrent/ExecutorService;->execute(Ljava/lang/Runnable;)V

    .line 864
    return-void
.end method

.method private t()V
    .locals 5

    .line 933
    invoke-virtual {p0}, Lcom/huawei/wallet/ui/cardholder/CardHolderFragment;->getActivity()Landroid/app/Activity;

    move-result-object v0

    sget-object v1, Lcom/huawei/wallet/ui/cardholder/CardHolderFragment;->d:[Ljava/lang/String;

    invoke-static {v0, v1}, Lo/dbe;->c(Landroid/content/Context;[Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_2

    .line 934
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x17

    if-lt v0, v1, :cond_2

    .line 935
    invoke-virtual {p0}, Lcom/huawei/wallet/ui/cardholder/CardHolderFragment;->getActivity()Landroid/app/Activity;

    move-result-object v0

    const-string v1, "android.permission.WRITE_EXTERNAL_STORAGE"

    invoke-static {v0, v1}, Lo/dbf;->l(Landroid/content/Context;Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 936
    invoke-virtual {p0}, Lcom/huawei/wallet/ui/cardholder/CardHolderFragment;->getActivity()Landroid/app/Activity;

    move-result-object v0

    const-string v1, "android.permission.WRITE_EXTERNAL_STORAGE"

    invoke-virtual {v0, v1}, Landroid/app/Activity;->shouldShowRequestPermissionRationale(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_1

    :cond_0
    const/4 v4, 0x1

    goto :goto_0

    :cond_1
    const/4 v4, 0x0

    .line 937
    :goto_0
    if-nez v4, :cond_2

    .line 938
    invoke-virtual {p0}, Lcom/huawei/wallet/ui/cardholder/CardHolderFragment;->getActivity()Landroid/app/Activity;

    move-result-object v0

    invoke-virtual {p0}, Lcom/huawei/wallet/ui/cardholder/CardHolderFragment;->getActivity()Landroid/app/Activity;

    move-result-object v1

    invoke-virtual {v1}, Landroid/app/Activity;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/wallet/R$string;->nfc_card_holder_no_permission:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/ene;->c(Landroid/content/Context;Ljava/lang/String;)V

    .line 939
    return-void

    .line 943
    :cond_2
    invoke-virtual {p0}, Lcom/huawei/wallet/ui/cardholder/CardHolderFragment;->getActivity()Landroid/app/Activity;

    move-result-object v0

    const-string v1, "android.permission.WRITE_EXTERNAL_STORAGE"

    invoke-static {v0, v1}, Landroid/support/v4/content/ContextCompat;->checkSelfPermission(Landroid/content/Context;Ljava/lang/String;)I

    move-result v0

    if-eqz v0, :cond_3

    .line 945
    const-string v0, "PluginPay CardHolderFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "have not permission"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 947
    invoke-virtual {p0}, Lcom/huawei/wallet/ui/cardholder/CardHolderFragment;->getActivity()Landroid/app/Activity;

    move-result-object v0

    const-string v1, "android.permission.WRITE_EXTERNAL_STORAGE"

    invoke-static {v0, v1}, Lo/dbf;->m(Landroid/content/Context;Ljava/lang/String;)V

    .line 948
    invoke-virtual {p0}, Lcom/huawei/wallet/ui/cardholder/CardHolderFragment;->getActivity()Landroid/app/Activity;

    move-result-object v0

    sget-object v1, Lcom/huawei/wallet/ui/cardholder/CardHolderFragment;->d:[Ljava/lang/String;

    const/16 v2, 0xb

    invoke-static {v0, v1, v2}, Landroid/support/v4/app/ActivityCompat;->requestPermissions(Landroid/app/Activity;[Ljava/lang/String;I)V

    .line 950
    :cond_3
    return-void
.end method

.method private u()V
    .locals 2

    .line 867
    iget v0, p0, Lcom/huawei/wallet/ui/cardholder/CardHolderFragment;->e:I

    const/4 v1, -0x4

    if-ne v0, v1, :cond_0

    .line 868
    invoke-direct {p0}, Lcom/huawei/wallet/ui/cardholder/CardHolderFragment;->f()V

    goto :goto_0

    .line 869
    :cond_0
    iget v0, p0, Lcom/huawei/wallet/ui/cardholder/CardHolderFragment;->e:I

    const/4 v1, -0x3

    if-ne v0, v1, :cond_1

    .line 870
    invoke-direct {p0}, Lcom/huawei/wallet/ui/cardholder/CardHolderFragment;->p()V

    goto :goto_0

    .line 872
    :cond_1
    invoke-direct {p0}, Lcom/huawei/wallet/ui/cardholder/CardHolderFragment;->i()V

    .line 875
    :goto_0
    iget-object v0, p0, Lcom/huawei/wallet/ui/cardholder/CardHolderFragment;->a:Lo/egn;

    if-eqz v0, :cond_2

    .line 876
    iget-object v0, p0, Lcom/huawei/wallet/ui/cardholder/CardHolderFragment;->a:Lo/egn;

    invoke-virtual {v0}, Lo/egn;->dismiss()V

    .line 878
    :cond_2
    return-void
.end method


# virtual methods
.method public a()I
    .locals 1

    .line 887
    iget v0, p0, Lcom/huawei/wallet/ui/cardholder/CardHolderFragment;->e:I

    return v0
.end method

.method public b()V
    .locals 2

    .line 815
    iget-object v0, p0, Lcom/huawei/wallet/ui/cardholder/CardHolderFragment;->D:Lcom/huawei/nfc/carrera/logic/NFCOpenApi;

    invoke-virtual {p0}, Lcom/huawei/wallet/ui/cardholder/CardHolderFragment;->getActivity()Landroid/app/Activity;

    move-result-object v1

    invoke-interface {v0, v1}, Lcom/huawei/nfc/carrera/logic/NFCOpenApi;->jumpToAddCardActivity(Landroid/app/Activity;)V

    .line 816
    return-void
.end method

.method public b(I)V
    .locals 2

    .line 820
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "CardHolderFragment refreshError errorCode= "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/huawei/wallet/utils/log/LogC;->a(Ljava/lang/String;Z)V

    .line 821
    iput p1, p0, Lcom/huawei/wallet/ui/cardholder/CardHolderFragment;->e:I

    .line 823
    return-void
.end method

.method public c()V
    .locals 3

    .line 563
    invoke-virtual {p0}, Lcom/huawei/wallet/ui/cardholder/CardHolderFragment;->getActivity()Landroid/app/Activity;

    move-result-object v2

    .line 564
    if-eqz v2, :cond_0

    .line 566
    invoke-static {v2}, Lcom/huawei/nfc/NFCOpenApiImpl;->getInstance(Landroid/content/Context;)Lcom/huawei/nfc/carrera/logic/NFCOpenApi;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/wallet/ui/cardholder/CardHolderFragment;->D:Lcom/huawei/nfc/carrera/logic/NFCOpenApi;

    .line 567
    iget-object v0, p0, Lcom/huawei/wallet/ui/cardholder/CardHolderFragment;->D:Lcom/huawei/nfc/carrera/logic/NFCOpenApi;

    invoke-interface {v0, v2}, Lcom/huawei/nfc/carrera/logic/NFCOpenApi;->initNFC(Landroid/app/Activity;)V

    .line 568
    iget-object v0, p0, Lcom/huawei/wallet/ui/cardholder/CardHolderFragment;->D:Lcom/huawei/nfc/carrera/logic/NFCOpenApi;

    invoke-interface {v0, p0}, Lcom/huawei/nfc/carrera/logic/NFCOpenApi;->registerCardListInfoListener(Lcom/huawei/wallet/ui/carddisplay/CardListInfoListener;)V

    .line 569
    iget-object v0, p0, Lcom/huawei/wallet/ui/cardholder/CardHolderFragment;->D:Lcom/huawei/nfc/carrera/logic/NFCOpenApi;

    const/4 v1, 0x0

    invoke-interface {v0, v1}, Lcom/huawei/nfc/carrera/logic/NFCOpenApi;->setRefreshRF(Z)V

    .line 570
    iget-object v0, p0, Lcom/huawei/wallet/ui/cardholder/CardHolderFragment;->D:Lcom/huawei/nfc/carrera/logic/NFCOpenApi;

    invoke-interface {v0}, Lcom/huawei/nfc/carrera/logic/NFCOpenApi;->refreshCardList()V

    .line 572
    :cond_0
    return-void
.end method

.method public d(ILjava/util/List;)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(ILjava/util/List<Lcom/huawei/wallet/model/unicard/UniCardInfo;>;)V"
        }
    .end annotation

    .line 827
    const-string v0, "PluginPay CardHolderFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "CardHolderFragment refreshCardListInfo type= "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, ",list= "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, ",current thread name="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    .line 829
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/Thread;->getName()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    .line 827
    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 830
    if-eqz p2, :cond_0

    .line 831
    const-string v0, "PluginPay CardHolderFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "CardHolderFragment refreshCardListInfo list size= "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    .line 832
    invoke-interface {p2}, Ljava/util/List;->size()I

    move-result v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    .line 831
    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 834
    :cond_0
    const/4 v0, 0x1

    if-ne p1, v0, :cond_1

    .line 835
    iput-object p2, p0, Lcom/huawei/wallet/ui/cardholder/CardHolderFragment;->t:Ljava/util/List;

    .line 836
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/huawei/wallet/ui/cardholder/CardHolderFragment;->C:Z

    .line 838
    :cond_1
    invoke-direct {p0}, Lcom/huawei/wallet/ui/cardholder/CardHolderFragment;->q()V

    .line 839
    return-void
.end method

.method public e()V
    .locals 3

    .line 769
    invoke-virtual {p0}, Lcom/huawei/wallet/ui/cardholder/CardHolderFragment;->getActivity()Landroid/app/Activity;

    move-result-object v0

    invoke-static {v0}, Lo/dtc;->c(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 771
    invoke-virtual {p0}, Lcom/huawei/wallet/ui/cardholder/CardHolderFragment;->getActivity()Landroid/app/Activity;

    move-result-object v2

    .line 772
    if-eqz v2, :cond_1

    .line 773
    const/4 v0, 0x0

    iput v0, p0, Lcom/huawei/wallet/ui/cardholder/CardHolderFragment;->v:I

    .line 774
    const/4 v0, 0x0

    iput v0, p0, Lcom/huawei/wallet/ui/cardholder/CardHolderFragment;->e:I

    .line 776
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/wallet/ui/cardholder/CardHolderFragment;->C:Z

    .line 777
    iget-object v0, p0, Lcom/huawei/wallet/ui/cardholder/CardHolderFragment;->D:Lcom/huawei/nfc/carrera/logic/NFCOpenApi;

    invoke-interface {v0}, Lcom/huawei/nfc/carrera/logic/NFCOpenApi;->refreshCardList()V

    .line 778
    iget-object v0, p0, Lcom/huawei/wallet/ui/cardholder/CardHolderFragment;->a:Lo/egn;

    if-nez v0, :cond_0

    .line 779
    invoke-virtual {p0}, Lcom/huawei/wallet/ui/cardholder/CardHolderFragment;->getActivity()Landroid/app/Activity;

    move-result-object v0

    invoke-static {v0}, Lo/egn;->a(Landroid/content/Context;)Lo/egn;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/wallet/ui/cardholder/CardHolderFragment;->a:Lo/egn;

    .line 781
    :cond_0
    iget-object v0, p0, Lcom/huawei/wallet/ui/cardholder/CardHolderFragment;->a:Lo/egn;

    sget v1, Lcom/huawei/wallet/R$string;->huaweipay_isloading:I

    .line 782
    invoke-virtual {v2, v1}, Landroid/app/Activity;->getString(I)Ljava/lang/String;

    move-result-object v1

    .line 781
    invoke-virtual {v0, v1}, Lo/egn;->e(Ljava/lang/String;)V

    .line 783
    iget-object v0, p0, Lcom/huawei/wallet/ui/cardholder/CardHolderFragment;->a:Lo/egn;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lo/egn;->setCancelable(Z)V

    .line 784
    iget-object v0, p0, Lcom/huawei/wallet/ui/cardholder/CardHolderFragment;->a:Lo/egn;

    invoke-virtual {v0}, Lo/egn;->show()V

    .line 788
    :cond_1
    return-void
.end method

.method public onActivityCreated(Landroid/os/Bundle;)V
    .locals 0

    .line 541
    invoke-super {p0, p1}, Landroid/app/Fragment;->onActivityCreated(Landroid/os/Bundle;)V

    .line 542
    invoke-direct {p0}, Lcom/huawei/wallet/ui/cardholder/CardHolderFragment;->o()V

    .line 544
    return-void
.end method

.method public onClick(Landroid/view/View;)V
    .locals 2

    .line 733
    invoke-virtual {p1}, Landroid/view/View;->getId()I

    move-result v1

    .line 734
    sget v0, Lcom/huawei/wallet/R$id;->add_card:I

    if-eq v1, v0, :cond_0

    sget v0, Lcom/huawei/wallet/R$id;->add_card_empty:I

    if-ne v1, v0, :cond_1

    .line 735
    :cond_0
    invoke-direct {p0, p1}, Lcom/huawei/wallet/ui/cardholder/CardHolderFragment;->d(Landroid/view/View;)V

    goto :goto_0

    .line 736
    :cond_1
    sget v0, Lcom/huawei/wallet/R$id;->setting_net:I

    if-ne v1, v0, :cond_2

    .line 737
    invoke-virtual {p0}, Lcom/huawei/wallet/ui/cardholder/CardHolderFragment;->getActivity()Landroid/app/Activity;

    move-result-object v0

    invoke-static {v0}, Lcom/huawei/wallet/utils/BaseLibUtil;->c(Landroid/content/Context;)V

    goto :goto_0

    .line 738
    :cond_2
    sget v0, Lcom/huawei/wallet/R$id;->error_alert:I

    if-ne v1, v0, :cond_3

    .line 739
    invoke-virtual {p0}, Lcom/huawei/wallet/ui/cardholder/CardHolderFragment;->e()V

    .line 741
    :cond_3
    :goto_0
    return-void
.end method

.method public onConfigurationChanged(Landroid/content/res/Configuration;)V
    .locals 0

    .line 882
    invoke-super {p0, p1}, Landroid/app/Fragment;->onConfigurationChanged(Landroid/content/res/Configuration;)V

    .line 883
    invoke-direct {p0}, Lcom/huawei/wallet/ui/cardholder/CardHolderFragment;->i()V

    .line 884
    return-void
.end method

.method public onCreate(Landroid/os/Bundle;)V
    .locals 2

    .line 219
    new-instance v0, Lcom/huawei/wallet/ui/cardholder/CardHolderFragment$CardHandler;

    invoke-direct {v0, p0}, Lcom/huawei/wallet/ui/cardholder/CardHolderFragment$CardHandler;-><init>(Lcom/huawei/wallet/ui/cardholder/CardHolderFragment;)V

    iput-object v0, p0, Lcom/huawei/wallet/ui/cardholder/CardHolderFragment;->H:Lcom/huawei/wallet/ui/cardholder/CardHolderFragment$CardHandler;

    .line 220
    new-instance v0, Lcom/huawei/wallet/ui/cardholder/CardHolderFragment$CardListener;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Lcom/huawei/wallet/ui/cardholder/CardHolderFragment$CardListener;-><init>(Lcom/huawei/wallet/ui/cardholder/CardHolderFragment;Lcom/huawei/wallet/ui/cardholder/CardHolderFragment$1;)V

    iput-object v0, p0, Lcom/huawei/wallet/ui/cardholder/CardHolderFragment;->B:Lcom/huawei/wallet/ui/cardholder/CardHolderFragment$CardListener;

    .line 221
    invoke-direct {p0}, Lcom/huawei/wallet/ui/cardholder/CardHolderFragment;->t()V

    .line 222
    invoke-super {p0, p1}, Landroid/app/Fragment;->onCreate(Landroid/os/Bundle;)V

    .line 223
    return-void
.end method

.method public onCreateView(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;
    .locals 3

    .line 229
    sget v0, Lcom/huawei/wallet/R$layout;->frag_card_holder:I

    const/4 v1, 0x0

    invoke-virtual {p1, v0, p2, v1}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/wallet/ui/cardholder/CardHolderFragment;->h:Landroid/view/View;

    .line 231
    iget-object v0, p0, Lcom/huawei/wallet/ui/cardholder/CardHolderFragment;->h:Landroid/view/View;

    sget v1, Lcom/huawei/wallet/R$id;->root:I

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/view/ViewGroup;

    iput-object v0, p0, Lcom/huawei/wallet/ui/cardholder/CardHolderFragment;->g:Landroid/view/ViewGroup;

    .line 232
    iget-object v0, p0, Lcom/huawei/wallet/ui/cardholder/CardHolderFragment;->h:Landroid/view/View;

    sget v1, Lcom/huawei/wallet/R$id;->loading:I

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/wallet/ui/cardholder/CardHolderFragment;->i:Landroid/view/View;

    .line 234
    iget-object v0, p0, Lcom/huawei/wallet/ui/cardholder/CardHolderFragment;->i:Landroid/view/View;

    sget v1, Lcom/huawei/wallet/R$id;->listview_center_progress:I

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Lhuawei/widget/HwProgressBar;

    .line 235
    const/4 v0, 0x1

    const/4 v1, 0x0

    invoke-virtual {v2, v0, v1}, Lhuawei/widget/HwProgressBar;->setLayerType(ILandroid/graphics/Paint;)V

    .line 245
    iget-object v0, p0, Lcom/huawei/wallet/ui/cardholder/CardHolderFragment;->h:Landroid/view/View;

    return-object v0
.end method

.method public onDestroy()V
    .locals 2

    .line 548
    invoke-super {p0}, Landroid/app/Fragment;->onDestroy()V

    .line 549
    iget-object v0, p0, Lcom/huawei/wallet/ui/cardholder/CardHolderFragment;->D:Lcom/huawei/nfc/carrera/logic/NFCOpenApi;

    if-eqz v0, :cond_0

    .line 550
    iget-object v0, p0, Lcom/huawei/wallet/ui/cardholder/CardHolderFragment;->D:Lcom/huawei/nfc/carrera/logic/NFCOpenApi;

    invoke-interface {v0, p0}, Lcom/huawei/nfc/carrera/logic/NFCOpenApi;->unregisterCardListListener(Lcom/huawei/wallet/ui/carddisplay/CardListInfoListener;)V

    .line 553
    :cond_0
    iget-object v0, p0, Lcom/huawei/wallet/ui/cardholder/CardHolderFragment;->n:Lcom/huawei/wallet/ui/carddisplay/CardHolderLayout;

    if-eqz v0, :cond_1

    .line 554
    iget-object v0, p0, Lcom/huawei/wallet/ui/cardholder/CardHolderFragment;->n:Lcom/huawei/wallet/ui/carddisplay/CardHolderLayout;

    iget-object v1, p0, Lcom/huawei/wallet/ui/cardholder/CardHolderFragment;->E:Lcom/huawei/wallet/ui/cardholder/CardHolderFragment$DisplayRunnbale;

    invoke-virtual {v0, v1}, Lcom/huawei/wallet/ui/carddisplay/CardHolderLayout;->removeCallbacks(Ljava/lang/Runnable;)Z

    .line 555
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/wallet/ui/cardholder/CardHolderFragment;->E:Lcom/huawei/wallet/ui/cardholder/CardHolderFragment$DisplayRunnbale;

    .line 557
    :cond_1
    iget-object v0, p0, Lcom/huawei/wallet/ui/cardholder/CardHolderFragment;->H:Lcom/huawei/wallet/ui/cardholder/CardHolderFragment$CardHandler;

    if-eqz v0, :cond_2

    .line 558
    iget-object v0, p0, Lcom/huawei/wallet/ui/cardholder/CardHolderFragment;->H:Lcom/huawei/wallet/ui/cardholder/CardHolderFragment$CardHandler;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/huawei/wallet/ui/cardholder/CardHolderFragment$CardHandler;->removeCallbacksAndMessages(Ljava/lang/Object;)V

    .line 560
    :cond_2
    return-void
.end method

.method public onStop()V
    .locals 1

    .line 892
    invoke-super {p0}, Landroid/app/Fragment;->onStop()V

    .line 893
    iget-object v0, p0, Lcom/huawei/wallet/ui/cardholder/CardHolderFragment;->n:Lcom/huawei/wallet/ui/carddisplay/CardHolderLayout;

    if-eqz v0, :cond_0

    .line 894
    iget-object v0, p0, Lcom/huawei/wallet/ui/cardholder/CardHolderFragment;->n:Lcom/huawei/wallet/ui/carddisplay/CardHolderLayout;

    invoke-virtual {v0}, Lcom/huawei/wallet/ui/carddisplay/CardHolderLayout;->d()V

    .line 896
    :cond_0
    return-void
.end method
