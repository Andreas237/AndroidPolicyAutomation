.class public Lcom/huawei/health/sns/ui/chat/photo/send/HealthAlbumPicBrowserActivity;
.super Lcom/huawei/ui/commonui/base/BaseActivity;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/huawei/health/sns/ui/chat/photo/send/HealthAlbumPicBrowserActivity$a;,
        Lcom/huawei/health/sns/ui/chat/photo/send/HealthAlbumPicBrowserActivity$d;,
        Lcom/huawei/health/sns/ui/chat/photo/send/HealthAlbumPicBrowserActivity$b;
    }
.end annotation


# instance fields
.field private B:Lo/bdw$a;

.field private C:Landroid/view/View$OnClickListener;

.field a:Landroid/widget/AdapterView$OnItemClickListener;

.field private b:Z

.field private c:Lo/bdz;

.field protected d:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<Ljava/lang/Integer;>;"
        }
    .end annotation
.end field

.field private e:I

.field private f:Landroid/view/View;

.field private g:I

.field private h:Lo/bdw;

.field private i:Lcom/huawei/health/sns/model/chat/Album;

.field private j:Landroid/widget/AdapterView$OnItemClickListener;

.field private k:Landroid/view/View;

.field private l:Lo/bdt;

.field private m:Lo/bdu;

.field private n:Landroid/view/View;

.field private o:Landroid/widget/TextView;

.field private p:Lhuawei/widget/HwProgressBar;

.field private q:Landroid/widget/LinearLayout;

.field private r:Landroid/view/View;

.field private s:Landroid/widget/TextView;

.field private t:Lo/bdx;

.field private u:Landroid/widget/LinearLayout;

.field private v:Z

.field private w:Z

.field private x:Landroid/view/View$OnClickListener;

.field private y:Landroid/os/Handler;

.field private z:J


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 54
    invoke-direct {p0}, Lcom/huawei/ui/commonui/base/BaseActivity;-><init>()V

    .line 64
    const/4 v0, 0x4

    iput v0, p0, Lcom/huawei/health/sns/ui/chat/photo/send/HealthAlbumPicBrowserActivity;->e:I

    .line 89
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/health/sns/ui/chat/photo/send/HealthAlbumPicBrowserActivity;->b:Z

    .line 94
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/huawei/health/sns/ui/chat/photo/send/HealthAlbumPicBrowserActivity;->d:Ljava/util/ArrayList;

    .line 109
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/health/sns/ui/chat/photo/send/HealthAlbumPicBrowserActivity;->i:Lcom/huawei/health/sns/model/chat/Album;

    .line 114
    const/4 v0, 0x0

    iput v0, p0, Lcom/huawei/health/sns/ui/chat/photo/send/HealthAlbumPicBrowserActivity;->g:I

    .line 190
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/health/sns/ui/chat/photo/send/HealthAlbumPicBrowserActivity;->w:Z

    .line 195
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/health/sns/ui/chat/photo/send/HealthAlbumPicBrowserActivity;->v:Z

    .line 200
    const-wide/16 v0, 0x0

    iput-wide v0, p0, Lcom/huawei/health/sns/ui/chat/photo/send/HealthAlbumPicBrowserActivity;->z:J

    .line 211
    new-instance v0, Lcom/huawei/health/sns/ui/chat/photo/send/HealthAlbumPicBrowserActivity$b;

    invoke-direct {v0, p0}, Lcom/huawei/health/sns/ui/chat/photo/send/HealthAlbumPicBrowserActivity$b;-><init>(Lcom/huawei/health/sns/ui/chat/photo/send/HealthAlbumPicBrowserActivity;)V

    iput-object v0, p0, Lcom/huawei/health/sns/ui/chat/photo/send/HealthAlbumPicBrowserActivity;->y:Landroid/os/Handler;

    .line 408
    new-instance v0, Lcom/huawei/health/sns/ui/chat/photo/send/HealthAlbumPicBrowserActivity$1;

    invoke-direct {v0, p0}, Lcom/huawei/health/sns/ui/chat/photo/send/HealthAlbumPicBrowserActivity$1;-><init>(Lcom/huawei/health/sns/ui/chat/photo/send/HealthAlbumPicBrowserActivity;)V

    iput-object v0, p0, Lcom/huawei/health/sns/ui/chat/photo/send/HealthAlbumPicBrowserActivity;->x:Landroid/view/View$OnClickListener;

    .line 417
    new-instance v0, Lcom/huawei/health/sns/ui/chat/photo/send/HealthAlbumPicBrowserActivity$4;

    invoke-direct {v0, p0}, Lcom/huawei/health/sns/ui/chat/photo/send/HealthAlbumPicBrowserActivity$4;-><init>(Lcom/huawei/health/sns/ui/chat/photo/send/HealthAlbumPicBrowserActivity;)V

    iput-object v0, p0, Lcom/huawei/health/sns/ui/chat/photo/send/HealthAlbumPicBrowserActivity;->C:Landroid/view/View$OnClickListener;

    .line 648
    new-instance v0, Lcom/huawei/health/sns/ui/chat/photo/send/HealthAlbumPicBrowserActivity$3;

    invoke-direct {v0, p0}, Lcom/huawei/health/sns/ui/chat/photo/send/HealthAlbumPicBrowserActivity$3;-><init>(Lcom/huawei/health/sns/ui/chat/photo/send/HealthAlbumPicBrowserActivity;)V

    iput-object v0, p0, Lcom/huawei/health/sns/ui/chat/photo/send/HealthAlbumPicBrowserActivity;->B:Lo/bdw$a;

    .line 729
    new-instance v0, Lcom/huawei/health/sns/ui/chat/photo/send/HealthAlbumPicBrowserActivity$5;

    invoke-direct {v0, p0}, Lcom/huawei/health/sns/ui/chat/photo/send/HealthAlbumPicBrowserActivity$5;-><init>(Lcom/huawei/health/sns/ui/chat/photo/send/HealthAlbumPicBrowserActivity;)V

    iput-object v0, p0, Lcom/huawei/health/sns/ui/chat/photo/send/HealthAlbumPicBrowserActivity;->a:Landroid/widget/AdapterView$OnItemClickListener;

    .line 744
    new-instance v0, Lcom/huawei/health/sns/ui/chat/photo/send/HealthAlbumPicBrowserActivity$2;

    invoke-direct {v0, p0}, Lcom/huawei/health/sns/ui/chat/photo/send/HealthAlbumPicBrowserActivity$2;-><init>(Lcom/huawei/health/sns/ui/chat/photo/send/HealthAlbumPicBrowserActivity;)V

    iput-object v0, p0, Lcom/huawei/health/sns/ui/chat/photo/send/HealthAlbumPicBrowserActivity;->j:Landroid/widget/AdapterView$OnItemClickListener;

    return-void
.end method

.method private a()V
    .locals 1

    .line 451
    iget-object v0, p0, Lcom/huawei/health/sns/ui/chat/photo/send/HealthAlbumPicBrowserActivity;->d:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-nez v0, :cond_1

    .line 452
    invoke-virtual {p0}, Lcom/huawei/health/sns/ui/chat/photo/send/HealthAlbumPicBrowserActivity;->c()Z

    move-result v0

    if-nez v0, :cond_0

    .line 453
    sget v0, Lcom/huawei/android/sns/R$string;->sns_please_select_pic:I

    invoke-static {p0, v0}, Lo/brh;->c(Landroid/app/Activity;I)V

    .line 455
    :cond_0
    return-void

    .line 457
    :cond_1
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/chat/photo/send/HealthAlbumPicBrowserActivity;->b()V

    .line 458
    return-void
.end method

.method private a(Lcom/huawei/health/sns/model/chat/Album;)V
    .locals 1

    .line 620
    if-eqz p1, :cond_0

    iget-object v0, p0, Lcom/huawei/health/sns/ui/chat/photo/send/HealthAlbumPicBrowserActivity;->i:Lcom/huawei/health/sns/model/chat/Album;

    if-eq v0, p1, :cond_0

    .line 621
    iput-object p1, p0, Lcom/huawei/health/sns/ui/chat/photo/send/HealthAlbumPicBrowserActivity;->i:Lcom/huawei/health/sns/model/chat/Album;

    .line 622
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/chat/photo/send/HealthAlbumPicBrowserActivity;->i()V

    .line 624
    :cond_0
    return-void
.end method

.method static synthetic a(Lcom/huawei/health/sns/ui/chat/photo/send/HealthAlbumPicBrowserActivity;)V
    .locals 0

    .line 54
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/chat/photo/send/HealthAlbumPicBrowserActivity;->g()V

    return-void
.end method

.method static synthetic a(Lcom/huawei/health/sns/ui/chat/photo/send/HealthAlbumPicBrowserActivity;Lcom/huawei/health/sns/model/chat/Album;)V
    .locals 0

    .line 54
    invoke-direct {p0, p1}, Lcom/huawei/health/sns/ui/chat/photo/send/HealthAlbumPicBrowserActivity;->a(Lcom/huawei/health/sns/model/chat/Album;)V

    return-void
.end method

.method static synthetic a(Lcom/huawei/health/sns/ui/chat/photo/send/HealthAlbumPicBrowserActivity;Ljava/util/ArrayList;)V
    .locals 0

    .line 54
    invoke-direct {p0, p1}, Lcom/huawei/health/sns/ui/chat/photo/send/HealthAlbumPicBrowserActivity;->e(Ljava/util/ArrayList;)V

    return-void
.end method

.method static synthetic a(Lcom/huawei/health/sns/ui/chat/photo/send/HealthAlbumPicBrowserActivity;Z)V
    .locals 0

    .line 54
    invoke-direct {p0, p1}, Lcom/huawei/health/sns/ui/chat/photo/send/HealthAlbumPicBrowserActivity;->b(Z)V

    return-void
.end method

.method private a(Ljava/lang/String;)V
    .locals 1

    .line 666
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 667
    iget-object v0, p0, Lcom/huawei/health/sns/ui/chat/photo/send/HealthAlbumPicBrowserActivity;->o:Landroid/widget/TextView;

    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 669
    :cond_0
    return-void
.end method

.method private a(Z)V
    .locals 2

    .line 870
    if-eqz p1, :cond_1

    .line 871
    sget v0, Lcom/huawei/android/sns/R$anim;->sns_enter_animation:I

    invoke-static {p0, v0}, Landroid/view/animation/AnimationUtils;->loadAnimation(Landroid/content/Context;I)Landroid/view/animation/Animation;

    move-result-object v1

    .line 872
    if-eqz v1, :cond_0

    .line 873
    new-instance v0, Lcom/huawei/health/sns/ui/chat/photo/send/HealthAlbumPicBrowserActivity$7;

    invoke-direct {v0, p0}, Lcom/huawei/health/sns/ui/chat/photo/send/HealthAlbumPicBrowserActivity$7;-><init>(Lcom/huawei/health/sns/ui/chat/photo/send/HealthAlbumPicBrowserActivity;)V

    invoke-virtual {v1, v0}, Landroid/view/animation/Animation;->setAnimationListener(Landroid/view/animation/Animation$AnimationListener;)V

    .line 895
    iget-object v0, p0, Lcom/huawei/health/sns/ui/chat/photo/send/HealthAlbumPicBrowserActivity;->m:Lo/bdu;

    invoke-virtual {v0, v1}, Lo/bdu;->startAnimation(Landroid/view/animation/Animation;)V

    .line 897
    :cond_0
    goto :goto_0

    .line 898
    :cond_1
    sget v0, Lcom/huawei/android/sns/R$anim;->sns_exit_animation:I

    invoke-static {p0, v0}, Landroid/view/animation/AnimationUtils;->loadAnimation(Landroid/content/Context;I)Landroid/view/animation/Animation;

    move-result-object v1

    .line 899
    if-eqz v1, :cond_2

    .line 900
    new-instance v0, Lcom/huawei/health/sns/ui/chat/photo/send/HealthAlbumPicBrowserActivity$10;

    invoke-direct {v0, p0}, Lcom/huawei/health/sns/ui/chat/photo/send/HealthAlbumPicBrowserActivity$10;-><init>(Lcom/huawei/health/sns/ui/chat/photo/send/HealthAlbumPicBrowserActivity;)V

    invoke-virtual {v1, v0}, Landroid/view/animation/Animation;->setAnimationListener(Landroid/view/animation/Animation$AnimationListener;)V

    .line 922
    iget-object v0, p0, Lcom/huawei/health/sns/ui/chat/photo/send/HealthAlbumPicBrowserActivity;->m:Lo/bdu;

    invoke-virtual {v0, v1}, Lo/bdu;->startAnimation(Landroid/view/animation/Animation;)V

    .line 925
    :cond_2
    :goto_0
    return-void
.end method

.method private b()V
    .locals 3

    .line 464
    new-instance v2, Landroid/content/Intent;

    invoke-direct {v2}, Landroid/content/Intent;-><init>()V

    .line 466
    const-string v0, "isSendOriginal"

    const/4 v1, 0x0

    invoke-virtual {v2, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Z)Landroid/content/Intent;

    .line 468
    const-string v0, "selectedList"

    iget-object v1, p0, Lcom/huawei/health/sns/ui/chat/photo/send/HealthAlbumPicBrowserActivity;->d:Ljava/util/ArrayList;

    invoke-virtual {v2, v0, v1}, Landroid/content/Intent;->putIntegerArrayListExtra(Ljava/lang/String;Ljava/util/ArrayList;)Landroid/content/Intent;

    .line 470
    const-string v0, "isSend"

    const/4 v1, 0x1

    invoke-virtual {v2, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Z)Landroid/content/Intent;

    .line 471
    const/4 v0, -0x1

    invoke-virtual {p0, v0, v2}, Lcom/huawei/health/sns/ui/chat/photo/send/HealthAlbumPicBrowserActivity;->setResult(ILandroid/content/Intent;)V

    .line 472
    invoke-virtual {p0}, Lcom/huawei/health/sns/ui/chat/photo/send/HealthAlbumPicBrowserActivity;->finish()V

    .line 473
    return-void
.end method

.method private b(I)V
    .locals 5

    .line 762
    if-gez p1, :cond_0

    .line 763
    return-void

    .line 765
    :cond_0
    iget-object v0, p0, Lcom/huawei/health/sns/ui/chat/photo/send/HealthAlbumPicBrowserActivity;->i:Lcom/huawei/health/sns/model/chat/Album;

    invoke-virtual {v0}, Lcom/huawei/health/sns/model/chat/Album;->getPhotoIdList()Ljava/util/ArrayList;

    move-result-object v2

    .line 766
    if-eqz v2, :cond_2

    .line 767
    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    move-result v0

    add-int/lit8 v0, v0, -0x1

    if-le p1, v0, :cond_1

    .line 768
    return-void

    .line 770
    :cond_1
    invoke-virtual {v2, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v3

    .line 771
    new-instance v4, Landroid/content/Intent;

    invoke-direct {v4}, Landroid/content/Intent;-><init>()V

    .line 772
    const-string v0, "selectedId"

    invoke-virtual {v4, v0, v3}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    .line 773
    const/4 v0, -0x1

    invoke-virtual {p0, v0, v4}, Lcom/huawei/health/sns/ui/chat/photo/send/HealthAlbumPicBrowserActivity;->setResult(ILandroid/content/Intent;)V

    .line 774
    invoke-virtual {p0}, Lcom/huawei/health/sns/ui/chat/photo/send/HealthAlbumPicBrowserActivity;->finish()V

    .line 776
    :cond_2
    return-void
.end method

.method static synthetic b(Lcom/huawei/health/sns/ui/chat/photo/send/HealthAlbumPicBrowserActivity;)V
    .locals 0

    .line 54
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/chat/photo/send/HealthAlbumPicBrowserActivity;->e()V

    return-void
.end method

.method static synthetic b(Lcom/huawei/health/sns/ui/chat/photo/send/HealthAlbumPicBrowserActivity;I)V
    .locals 0

    .line 54
    invoke-direct {p0, p1}, Lcom/huawei/health/sns/ui/chat/photo/send/HealthAlbumPicBrowserActivity;->e(I)V

    return-void
.end method

.method static synthetic b(Lcom/huawei/health/sns/ui/chat/photo/send/HealthAlbumPicBrowserActivity;Lo/bdw$d;I)V
    .locals 0

    .line 54
    invoke-direct {p0, p1, p2}, Lcom/huawei/health/sns/ui/chat/photo/send/HealthAlbumPicBrowserActivity;->d(Lo/bdw$d;I)V

    return-void
.end method

.method static synthetic b(Lcom/huawei/health/sns/ui/chat/photo/send/HealthAlbumPicBrowserActivity;Z)V
    .locals 0

    .line 54
    invoke-direct {p0, p1}, Lcom/huawei/health/sns/ui/chat/photo/send/HealthAlbumPicBrowserActivity;->e(Z)V

    return-void
.end method

.method private b(Z)V
    .locals 2

    .line 719
    if-eqz p1, :cond_0

    .line 720
    iget-object v0, p0, Lcom/huawei/health/sns/ui/chat/photo/send/HealthAlbumPicBrowserActivity;->n:Landroid/view/View;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    goto :goto_0

    .line 722
    :cond_0
    iget-object v0, p0, Lcom/huawei/health/sns/ui/chat/photo/send/HealthAlbumPicBrowserActivity;->n:Landroid/view/View;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 724
    :goto_0
    return-void
.end method

.method static synthetic c(Lcom/huawei/health/sns/ui/chat/photo/send/HealthAlbumPicBrowserActivity;I)I
    .locals 0

    .line 54
    iput p1, p0, Lcom/huawei/health/sns/ui/chat/photo/send/HealthAlbumPicBrowserActivity;->g:I

    return p1
.end method

.method private c(Landroid/content/Intent;)V
    .locals 1

    .line 850
    const/4 v0, -0x1

    invoke-virtual {p0, v0, p1}, Lcom/huawei/health/sns/ui/chat/photo/send/HealthAlbumPicBrowserActivity;->setResult(ILandroid/content/Intent;)V

    .line 851
    invoke-virtual {p0}, Lcom/huawei/health/sns/ui/chat/photo/send/HealthAlbumPicBrowserActivity;->finish()V

    .line 852
    return-void
.end method

.method static synthetic c(Lcom/huawei/health/sns/ui/chat/photo/send/HealthAlbumPicBrowserActivity;)V
    .locals 0

    .line 54
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/chat/photo/send/HealthAlbumPicBrowserActivity;->a()V

    return-void
.end method

.method static synthetic c(Lcom/huawei/health/sns/ui/chat/photo/send/HealthAlbumPicBrowserActivity;Ljava/util/ArrayList;I)V
    .locals 0

    .line 54
    invoke-direct {p0, p1, p2}, Lcom/huawei/health/sns/ui/chat/photo/send/HealthAlbumPicBrowserActivity;->e(Ljava/util/ArrayList;I)V

    return-void
.end method

.method static synthetic c(Lcom/huawei/health/sns/ui/chat/photo/send/HealthAlbumPicBrowserActivity;Lo/bdw$d;I)V
    .locals 0

    .line 54
    invoke-direct {p0, p1, p2}, Lcom/huawei/health/sns/ui/chat/photo/send/HealthAlbumPicBrowserActivity;->c(Lo/bdw$d;I)V

    return-void
.end method

.method private c(Lo/bdw$d;I)V
    .locals 5

    .line 946
    invoke-virtual {p1}, Lo/bdw$d;->getCover()Landroid/view/View;

    move-result-object v2

    .line 947
    invoke-virtual {p1}, Lo/bdw$d;->getPhotoCheckBox()Landroid/widget/CheckBox;

    move-result-object v3

    .line 948
    iget-object v0, p0, Lcom/huawei/health/sns/ui/chat/photo/send/HealthAlbumPicBrowserActivity;->d:Ljava/util/ArrayList;

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    move-result v4

    .line 949
    if-eqz v2, :cond_1

    .line 950
    if-eqz v4, :cond_0

    const/4 v0, 0x0

    goto :goto_0

    :cond_0
    const/4 v0, 0x4

    :goto_0
    invoke-virtual {v2, v0}, Landroid/view/View;->setVisibility(I)V

    .line 952
    :cond_1
    if-eqz v3, :cond_2

    .line 953
    invoke-virtual {v3, v4}, Landroid/widget/CheckBox;->setChecked(Z)V

    .line 955
    :cond_2
    return-void
.end method

.method static synthetic d(Lcom/huawei/health/sns/ui/chat/photo/send/HealthAlbumPicBrowserActivity;)Lo/bdt;
    .locals 1

    .line 54
    iget-object v0, p0, Lcom/huawei/health/sns/ui/chat/photo/send/HealthAlbumPicBrowserActivity;->l:Lo/bdt;

    return-object v0
.end method

.method private d()V
    .locals 6

    .line 479
    sget v0, Lcom/huawei/android/sns/R$id;->data_view:I

    invoke-virtual {p0, v0}, Lcom/huawei/health/sns/ui/chat/photo/send/HealthAlbumPicBrowserActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/health/sns/ui/chat/photo/send/HealthAlbumPicBrowserActivity;->r:Landroid/view/View;

    .line 480
    sget v0, Lcom/huawei/android/sns/R$id;->no_data_view:I

    invoke-virtual {p0, v0}, Lcom/huawei/health/sns/ui/chat/photo/send/HealthAlbumPicBrowserActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    iput-object v0, p0, Lcom/huawei/health/sns/ui/chat/photo/send/HealthAlbumPicBrowserActivity;->u:Landroid/widget/LinearLayout;

    .line 482
    sget v0, Lcom/huawei/android/sns/R$id;->blur_view:I

    invoke-virtual {p0, v0}, Lcom/huawei/health/sns/ui/chat/photo/send/HealthAlbumPicBrowserActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lo/bdx;

    iput-object v0, p0, Lcom/huawei/health/sns/ui/chat/photo/send/HealthAlbumPicBrowserActivity;->t:Lo/bdx;

    .line 483
    invoke-static {p0}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v3

    .line 484
    sget v0, Lcom/huawei/android/sns/R$layout;->sns_album_pic_browser_footer:I

    const/4 v1, 0x0

    invoke-virtual {v3, v0, v1}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v4

    .line 485
    sget v0, Lcom/huawei/android/sns/R$id;->sns_album_listview:I

    invoke-virtual {p0, v0}, Lcom/huawei/health/sns/ui/chat/photo/send/HealthAlbumPicBrowserActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lo/bdu;

    iput-object v0, p0, Lcom/huawei/health/sns/ui/chat/photo/send/HealthAlbumPicBrowserActivity;->m:Lo/bdu;

    .line 486
    new-instance v0, Lo/bdt;

    const/4 v1, 0x0

    invoke-direct {v0, v1, p0}, Lo/bdt;-><init>(Ljava/util/List;Landroid/content/Context;)V

    iput-object v0, p0, Lcom/huawei/health/sns/ui/chat/photo/send/HealthAlbumPicBrowserActivity;->l:Lo/bdt;

    .line 487
    iget-object v0, p0, Lcom/huawei/health/sns/ui/chat/photo/send/HealthAlbumPicBrowserActivity;->m:Lo/bdu;

    iget-object v1, p0, Lcom/huawei/health/sns/ui/chat/photo/send/HealthAlbumPicBrowserActivity;->l:Lo/bdt;

    invoke-virtual {v0, v1}, Lo/bdu;->setAdapter(Landroid/widget/ListAdapter;)V

    .line 488
    iget-object v0, p0, Lcom/huawei/health/sns/ui/chat/photo/send/HealthAlbumPicBrowserActivity;->m:Lo/bdu;

    sget v1, Lcom/huawei/android/sns/R$color;->sns_background:I

    invoke-virtual {v0, v1}, Lo/bdu;->setBackgroundResource(I)V

    .line 489
    iget-object v0, p0, Lcom/huawei/health/sns/ui/chat/photo/send/HealthAlbumPicBrowserActivity;->m:Lo/bdu;

    iget-object v1, p0, Lcom/huawei/health/sns/ui/chat/photo/send/HealthAlbumPicBrowserActivity;->a:Landroid/widget/AdapterView$OnItemClickListener;

    invoke-virtual {v0, v1}, Lo/bdu;->setOnItemClickListener(Landroid/widget/AdapterView$OnItemClickListener;)V

    .line 490
    iget-object v0, p0, Lcom/huawei/health/sns/ui/chat/photo/send/HealthAlbumPicBrowserActivity;->m:Lo/bdu;

    new-instance v1, Lcom/huawei/health/sns/ui/chat/photo/send/HealthAlbumPicBrowserActivity$d;

    const/4 v2, 0x0

    invoke-direct {v1, p0, v2}, Lcom/huawei/health/sns/ui/chat/photo/send/HealthAlbumPicBrowserActivity$d;-><init>(Lcom/huawei/health/sns/ui/chat/photo/send/HealthAlbumPicBrowserActivity;Lcom/huawei/health/sns/ui/chat/photo/send/HealthAlbumPicBrowserActivity$1;)V

    invoke-virtual {v0, v1}, Lo/bdu;->setOnScrollListener(Landroid/widget/AbsListView$OnScrollListener;)V

    .line 491
    iget-object v0, p0, Lcom/huawei/health/sns/ui/chat/photo/send/HealthAlbumPicBrowserActivity;->m:Lo/bdu;

    new-instance v1, Lcom/huawei/health/sns/ui/chat/photo/send/HealthAlbumPicBrowserActivity$a;

    const/4 v2, 0x0

    invoke-direct {v1, p0, v2}, Lcom/huawei/health/sns/ui/chat/photo/send/HealthAlbumPicBrowserActivity$a;-><init>(Lcom/huawei/health/sns/ui/chat/photo/send/HealthAlbumPicBrowserActivity;Lcom/huawei/health/sns/ui/chat/photo/send/HealthAlbumPicBrowserActivity$1;)V

    invoke-virtual {v0, v1}, Lo/bdu;->setOnOverScrollListener(Lo/bec;)V

    .line 492
    iget-object v0, p0, Lcom/huawei/health/sns/ui/chat/photo/send/HealthAlbumPicBrowserActivity;->m:Lo/bdu;

    invoke-virtual {v0, v4}, Lo/bdu;->addFooterView(Landroid/view/View;)V

    .line 494
    sget v0, Lcom/huawei/android/sns/R$layout;->sns_album_pic_browser_footer:I

    const/4 v1, 0x0

    invoke-virtual {v3, v0, v1}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v5

    .line 495
    sget v0, Lcom/huawei/android/sns/R$id;->sns_picture_gridview:I

    invoke-virtual {p0, v0}, Lcom/huawei/health/sns/ui/chat/photo/send/HealthAlbumPicBrowserActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lo/bdz;

    iput-object v0, p0, Lcom/huawei/health/sns/ui/chat/photo/send/HealthAlbumPicBrowserActivity;->c:Lo/bdz;

    .line 496
    iget-object v0, p0, Lcom/huawei/health/sns/ui/chat/photo/send/HealthAlbumPicBrowserActivity;->c:Lo/bdz;

    invoke-virtual {v0, v5}, Lo/bdz;->b(Landroid/view/View;)V

    .line 497
    iget-object v0, p0, Lcom/huawei/health/sns/ui/chat/photo/send/HealthAlbumPicBrowserActivity;->c:Lo/bdz;

    invoke-virtual {v0}, Lo/bdz;->getNumColumns()I

    move-result v0

    iput v0, p0, Lcom/huawei/health/sns/ui/chat/photo/send/HealthAlbumPicBrowserActivity;->e:I

    .line 499
    sget v0, Lcom/huawei/android/sns/R$id;->rl_album_name:I

    invoke-virtual {p0, v0}, Lcom/huawei/health/sns/ui/chat/photo/send/HealthAlbumPicBrowserActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/health/sns/ui/chat/photo/send/HealthAlbumPicBrowserActivity;->k:Landroid/view/View;

    .line 500
    iget-object v0, p0, Lcom/huawei/health/sns/ui/chat/photo/send/HealthAlbumPicBrowserActivity;->k:Landroid/view/View;

    invoke-virtual {v0, p0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 501
    sget v0, Lcom/huawei/android/sns/R$id;->rl_album_preview:I

    invoke-virtual {p0, v0}, Lcom/huawei/health/sns/ui/chat/photo/send/HealthAlbumPicBrowserActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/health/sns/ui/chat/photo/send/HealthAlbumPicBrowserActivity;->f:Landroid/view/View;

    .line 502
    iget-boolean v0, p0, Lcom/huawei/health/sns/ui/chat/photo/send/HealthAlbumPicBrowserActivity;->w:Z

    if-eqz v0, :cond_0

    .line 503
    iget-object v0, p0, Lcom/huawei/health/sns/ui/chat/photo/send/HealthAlbumPicBrowserActivity;->f:Landroid/view/View;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    goto :goto_0

    .line 505
    :cond_0
    iget-object v0, p0, Lcom/huawei/health/sns/ui/chat/photo/send/HealthAlbumPicBrowserActivity;->f:Landroid/view/View;

    invoke-virtual {v0, p0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 507
    :goto_0
    sget v0, Lcom/huawei/android/sns/R$id;->rl_bottom_status_bar:I

    invoke-virtual {p0, v0}, Lcom/huawei/health/sns/ui/chat/photo/send/HealthAlbumPicBrowserActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    iput-object v0, p0, Lcom/huawei/health/sns/ui/chat/photo/send/HealthAlbumPicBrowserActivity;->q:Landroid/widget/LinearLayout;

    .line 508
    iget-object v0, p0, Lcom/huawei/health/sns/ui/chat/photo/send/HealthAlbumPicBrowserActivity;->q:Landroid/widget/LinearLayout;

    invoke-virtual {v0, p0}, Landroid/widget/LinearLayout;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 509
    sget v0, Lcom/huawei/android/sns/R$id;->ll_loading_progress_layout:I

    invoke-virtual {p0, v0}, Lcom/huawei/health/sns/ui/chat/photo/send/HealthAlbumPicBrowserActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/health/sns/ui/chat/photo/send/HealthAlbumPicBrowserActivity;->n:Landroid/view/View;

    .line 510
    sget v0, Lcom/huawei/android/sns/R$id;->loading_img:I

    invoke-virtual {p0, v0}, Lcom/huawei/health/sns/ui/chat/photo/send/HealthAlbumPicBrowserActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lhuawei/widget/HwProgressBar;

    iput-object v0, p0, Lcom/huawei/health/sns/ui/chat/photo/send/HealthAlbumPicBrowserActivity;->p:Lhuawei/widget/HwProgressBar;

    .line 511
    iget-object v0, p0, Lcom/huawei/health/sns/ui/chat/photo/send/HealthAlbumPicBrowserActivity;->p:Lhuawei/widget/HwProgressBar;

    const/4 v1, 0x1

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Lhuawei/widget/HwProgressBar;->setLayerType(ILandroid/graphics/Paint;)V

    .line 513
    sget v0, Lcom/huawei/android/sns/R$id;->tv_current_album_name:I

    invoke-virtual {p0, v0}, Lcom/huawei/health/sns/ui/chat/photo/send/HealthAlbumPicBrowserActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/huawei/health/sns/ui/chat/photo/send/HealthAlbumPicBrowserActivity;->o:Landroid/widget/TextView;

    .line 514
    sget v0, Lcom/huawei/android/sns/R$id;->tv_preview:I

    invoke-virtual {p0, v0}, Lcom/huawei/health/sns/ui/chat/photo/send/HealthAlbumPicBrowserActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/huawei/health/sns/ui/chat/photo/send/HealthAlbumPicBrowserActivity;->s:Landroid/widget/TextView;

    .line 515
    iget-object v0, p0, Lcom/huawei/health/sns/ui/chat/photo/send/HealthAlbumPicBrowserActivity;->s:Landroid/widget/TextView;

    invoke-virtual {v0, p0}, Landroid/widget/TextView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 516
    return-void
.end method

.method private d(Landroid/content/Intent;)V
    .locals 3

    .line 270
    if-eqz p1, :cond_1

    .line 271
    invoke-virtual {p1}, Landroid/content/Intent;->getExtras()Landroid/os/Bundle;

    move-result-object v2

    .line 272
    if-nez v2, :cond_0

    .line 273
    return-void

    .line 275
    :cond_0
    const-string v0, "isSingle"

    invoke-virtual {v2, v0}, Landroid/os/Bundle;->containsKey(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 276
    const-string v0, "isSingle"

    const/4 v1, 0x0

    invoke-virtual {v2, v0, v1}, Landroid/os/Bundle;->getBoolean(Ljava/lang/String;Z)Z

    move-result v0

    iput-boolean v0, p0, Lcom/huawei/health/sns/ui/chat/photo/send/HealthAlbumPicBrowserActivity;->w:Z

    .line 279
    :cond_1
    return-void
.end method

.method static synthetic d(Lcom/huawei/health/sns/ui/chat/photo/send/HealthAlbumPicBrowserActivity;I)V
    .locals 0

    .line 54
    invoke-direct {p0, p1}, Lcom/huawei/health/sns/ui/chat/photo/send/HealthAlbumPicBrowserActivity;->b(I)V

    return-void
.end method

.method private d(Lo/bdw$d;I)V
    .locals 2

    .line 964
    invoke-virtual {p1}, Lo/bdw$d;->getPhotoCheckBox()Landroid/widget/CheckBox;

    move-result-object v1

    .line 966
    new-instance v0, Lcom/huawei/health/sns/ui/chat/photo/send/HealthAlbumPicBrowserActivity$6;

    invoke-direct {v0, p0, v1, p1, p2}, Lcom/huawei/health/sns/ui/chat/photo/send/HealthAlbumPicBrowserActivity$6;-><init>(Lcom/huawei/health/sns/ui/chat/photo/send/HealthAlbumPicBrowserActivity;Landroid/widget/CheckBox;Lo/bdw$d;I)V

    invoke-virtual {v1, v0}, Landroid/widget/CheckBox;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 996
    return-void
.end method

.method static synthetic d(Lcom/huawei/health/sns/ui/chat/photo/send/HealthAlbumPicBrowserActivity;Z)Z
    .locals 0

    .line 54
    iput-boolean p1, p0, Lcom/huawei/health/sns/ui/chat/photo/send/HealthAlbumPicBrowserActivity;->b:Z

    return p1
.end method

.method private e()V
    .locals 1

    .line 427
    iget-object v0, p0, Lcom/huawei/health/sns/ui/chat/photo/send/HealthAlbumPicBrowserActivity;->m:Lo/bdu;

    invoke-virtual {v0}, Lo/bdu;->getVisibility()I

    move-result v0

    if-nez v0, :cond_0

    .line 428
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/chat/photo/send/HealthAlbumPicBrowserActivity;->g()V

    goto :goto_0

    .line 430
    :cond_0
    invoke-virtual {p0}, Lcom/huawei/health/sns/ui/chat/photo/send/HealthAlbumPicBrowserActivity;->finish()V

    .line 432
    :goto_0
    return-void
.end method

.method private e(I)V
    .locals 3

    .line 1004
    iget-object v0, p0, Lcom/huawei/health/sns/ui/chat/photo/send/HealthAlbumPicBrowserActivity;->d:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v1

    .line 1005
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 1006
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Ljava/lang/Integer;

    .line 1007
    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    move-result v0

    if-ne v0, p1, :cond_0

    .line 1008
    invoke-interface {v1}, Ljava/util/Iterator;->remove()V

    .line 1009
    goto :goto_1

    .line 1011
    :cond_0
    goto :goto_0

    .line 1012
    :cond_1
    :goto_1
    return-void
.end method

.method static synthetic e(Lcom/huawei/health/sns/ui/chat/photo/send/HealthAlbumPicBrowserActivity;)V
    .locals 0

    .line 54
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/chat/photo/send/HealthAlbumPicBrowserActivity;->f()V

    return-void
.end method

.method private e(Ljava/util/ArrayList;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/ArrayList<Lcom/huawei/health/sns/model/chat/Album;>;)V"
        }
    .end annotation

    .line 594
    iget-object v0, p0, Lcom/huawei/health/sns/ui/chat/photo/send/HealthAlbumPicBrowserActivity;->l:Lo/bdt;

    invoke-virtual {v0, p1}, Lo/bdt;->c(Ljava/util/List;)V

    .line 595
    iget-object v0, p0, Lcom/huawei/health/sns/ui/chat/photo/send/HealthAlbumPicBrowserActivity;->t:Lo/bdx;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lo/bdx;->c(I)V

    .line 596
    return-void
.end method

.method private e(Ljava/util/ArrayList;I)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/ArrayList<Ljava/lang/Integer;>;I)V"
        }
    .end annotation

    .line 785
    new-instance v2, Landroid/content/Intent;

    const-class v0, Lcom/huawei/health/sns/ui/chat/photo/send/PhotoPagerActivity;

    invoke-direct {v2, p0, v0}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 786
    const-string v0, "totalList"

    invoke-virtual {v2, v0, p1}, Landroid/content/Intent;->putIntegerArrayListExtra(Ljava/lang/String;Ljava/util/ArrayList;)Landroid/content/Intent;

    .line 788
    const-string v0, "selectedList"

    iget-object v1, p0, Lcom/huawei/health/sns/ui/chat/photo/send/HealthAlbumPicBrowserActivity;->d:Ljava/util/ArrayList;

    invoke-virtual {v2, v0, v1}, Landroid/content/Intent;->putIntegerArrayListExtra(Ljava/lang/String;Ljava/util/ArrayList;)Landroid/content/Intent;

    .line 790
    const-string v0, "position"

    invoke-virtual {v2, v0, p2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    .line 792
    const-string v0, "isDisplaySelect"

    const/4 v1, 0x1

    invoke-virtual {v2, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Z)Landroid/content/Intent;

    .line 793
    const/16 v0, 0x32

    invoke-virtual {p0, v2, v0}, Lcom/huawei/health/sns/ui/chat/photo/send/HealthAlbumPicBrowserActivity;->startActivityForResult(Landroid/content/Intent;I)V

    .line 794
    return-void
.end method

.method private e(Z)V
    .locals 2

    .line 579
    if-eqz p1, :cond_0

    .line 580
    iget-object v0, p0, Lcom/huawei/health/sns/ui/chat/photo/send/HealthAlbumPicBrowserActivity;->r:Landroid/view/View;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 581
    iget-object v0, p0, Lcom/huawei/health/sns/ui/chat/photo/send/HealthAlbumPicBrowserActivity;->u:Landroid/widget/LinearLayout;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    goto :goto_0

    .line 583
    :cond_0
    iget-object v0, p0, Lcom/huawei/health/sns/ui/chat/photo/send/HealthAlbumPicBrowserActivity;->r:Landroid/view/View;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 584
    iget-object v0, p0, Lcom/huawei/health/sns/ui/chat/photo/send/HealthAlbumPicBrowserActivity;->u:Landroid/widget/LinearLayout;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 586
    :goto_0
    return-void
.end method

.method static synthetic f(Lcom/huawei/health/sns/ui/chat/photo/send/HealthAlbumPicBrowserActivity;)Lo/bdu;
    .locals 1

    .line 54
    iget-object v0, p0, Lcom/huawei/health/sns/ui/chat/photo/send/HealthAlbumPicBrowserActivity;->m:Lo/bdu;

    return-object v0
.end method

.method private f()V
    .locals 2

    .line 709
    iget-object v0, p0, Lcom/huawei/health/sns/ui/chat/photo/send/HealthAlbumPicBrowserActivity;->m:Lo/bdu;

    iget v1, p0, Lcom/huawei/health/sns/ui/chat/photo/send/HealthAlbumPicBrowserActivity;->g:I

    invoke-virtual {v0, v1}, Lo/bdu;->setSelection(I)V

    .line 710
    iget-object v0, p0, Lcom/huawei/health/sns/ui/chat/photo/send/HealthAlbumPicBrowserActivity;->l:Lo/bdt;

    iget v1, p0, Lcom/huawei/health/sns/ui/chat/photo/send/HealthAlbumPicBrowserActivity;->g:I

    invoke-virtual {v0, v1}, Lo/bdt;->a(I)V

    .line 711
    return-void
.end method

.method private g()V
    .locals 2

    .line 858
    iget-boolean v0, p0, Lcom/huawei/health/sns/ui/chat/photo/send/HealthAlbumPicBrowserActivity;->b:Z

    if-nez v0, :cond_1

    .line 859
    iget-object v0, p0, Lcom/huawei/health/sns/ui/chat/photo/send/HealthAlbumPicBrowserActivity;->m:Lo/bdu;

    invoke-virtual {v0}, Lo/bdu;->getVisibility()I

    move-result v0

    if-eqz v0, :cond_0

    const/4 v1, 0x1

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    .line 860
    :goto_0
    invoke-direct {p0, v1}, Lcom/huawei/health/sns/ui/chat/photo/send/HealthAlbumPicBrowserActivity;->a(Z)V

    .line 862
    :cond_1
    return-void
.end method

.method static synthetic g(Lcom/huawei/health/sns/ui/chat/photo/send/HealthAlbumPicBrowserActivity;)Z
    .locals 1

    .line 54
    iget-boolean v0, p0, Lcom/huawei/health/sns/ui/chat/photo/send/HealthAlbumPicBrowserActivity;->w:Z

    return v0
.end method

.method static synthetic h(Lcom/huawei/health/sns/ui/chat/photo/send/HealthAlbumPicBrowserActivity;)Lo/bdz;
    .locals 1

    .line 54
    iget-object v0, p0, Lcom/huawei/health/sns/ui/chat/photo/send/HealthAlbumPicBrowserActivity;->c:Lo/bdz;

    return-object v0
.end method

.method private h()V
    .locals 4

    .line 675
    const/4 v0, 0x1

    invoke-direct {p0, v0}, Lcom/huawei/health/sns/ui/chat/photo/send/HealthAlbumPicBrowserActivity;->b(Z)V

    .line 676
    const/4 v0, 0x1

    new-array v2, v0, [Ljava/lang/String;

    const-string v0, "android.permission.READ_EXTERNAL_STORAGE"

    const/4 v1, 0x0

    aput-object v0, v2, v1

    .line 677
    const/4 v3, 0x0

    .line 678
    invoke-static {}, Lo/brg;->c()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 679
    invoke-static {p0, v2}, Lo/biq;->a(Landroid/content/Context;[Ljava/lang/String;)Ljava/util/List;

    move-result-object v3

    .line 681
    :cond_0
    if-eqz v3, :cond_1

    invoke-interface {v3}, Ljava/util/List;->size()I

    move-result v0

    if-nez v0, :cond_2

    .line 682
    :cond_1
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/chat/photo/send/HealthAlbumPicBrowserActivity;->k()V

    goto :goto_0

    .line 684
    .line 685
    :cond_2
    invoke-interface {v3}, Ljava/util/List;->size()I

    move-result v0

    new-array v0, v0, [Ljava/lang/String;

    invoke-interface {v3, v0}, Ljava/util/List;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Ljava/lang/String;

    .line 684
    const/4 v1, 0x1

    invoke-static {p0, v1, v0}, Lo/biq;->c(Landroid/app/Activity;I[Ljava/lang/String;)V

    .line 687
    :goto_0
    return-void
.end method

.method static synthetic i(Lcom/huawei/health/sns/ui/chat/photo/send/HealthAlbumPicBrowserActivity;)Lcom/huawei/health/sns/model/chat/Album;
    .locals 1

    .line 54
    iget-object v0, p0, Lcom/huawei/health/sns/ui/chat/photo/send/HealthAlbumPicBrowserActivity;->i:Lcom/huawei/health/sns/model/chat/Album;

    return-object v0
.end method

.method private i()V
    .locals 6

    .line 630
    iget-object v0, p0, Lcom/huawei/health/sns/ui/chat/photo/send/HealthAlbumPicBrowserActivity;->h:Lo/bdw;

    if-nez v0, :cond_0

    .line 631
    new-instance v0, Lo/bdw;

    iget-object v2, p0, Lcom/huawei/health/sns/ui/chat/photo/send/HealthAlbumPicBrowserActivity;->i:Lcom/huawei/health/sns/model/chat/Album;

    iget-boolean v3, p0, Lcom/huawei/health/sns/ui/chat/photo/send/HealthAlbumPicBrowserActivity;->w:Z

    iget-object v4, p0, Lcom/huawei/health/sns/ui/chat/photo/send/HealthAlbumPicBrowserActivity;->B:Lo/bdw$a;

    iget v5, p0, Lcom/huawei/health/sns/ui/chat/photo/send/HealthAlbumPicBrowserActivity;->e:I

    move-object v1, p0

    invoke-direct/range {v0 .. v5}, Lo/bdw;-><init>(Landroid/content/Context;Lcom/huawei/health/sns/model/chat/Album;ZLo/bdw$a;I)V

    iput-object v0, p0, Lcom/huawei/health/sns/ui/chat/photo/send/HealthAlbumPicBrowserActivity;->h:Lo/bdw;

    goto :goto_0

    .line 633
    :cond_0
    iget-object v0, p0, Lcom/huawei/health/sns/ui/chat/photo/send/HealthAlbumPicBrowserActivity;->h:Lo/bdw;

    iget-object v1, p0, Lcom/huawei/health/sns/ui/chat/photo/send/HealthAlbumPicBrowserActivity;->i:Lcom/huawei/health/sns/model/chat/Album;

    invoke-virtual {v0, v1}, Lo/bdw;->e(Lcom/huawei/health/sns/model/chat/Album;)V

    .line 635
    :goto_0
    iget-object v0, p0, Lcom/huawei/health/sns/ui/chat/photo/send/HealthAlbumPicBrowserActivity;->c:Lo/bdz;

    iget-object v1, p0, Lcom/huawei/health/sns/ui/chat/photo/send/HealthAlbumPicBrowserActivity;->h:Lo/bdw;

    invoke-virtual {v0, v1}, Lo/bdz;->setAdapter(Landroid/widget/ListAdapter;)V

    .line 636
    iget-object v0, p0, Lcom/huawei/health/sns/ui/chat/photo/send/HealthAlbumPicBrowserActivity;->c:Lo/bdz;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lo/bdz;->smoothScrollToPosition(I)V

    .line 637
    iget-object v0, p0, Lcom/huawei/health/sns/ui/chat/photo/send/HealthAlbumPicBrowserActivity;->c:Lo/bdz;

    iget-object v1, p0, Lcom/huawei/health/sns/ui/chat/photo/send/HealthAlbumPicBrowserActivity;->j:Landroid/widget/AdapterView$OnItemClickListener;

    invoke-virtual {v0, v1}, Lo/bdz;->setOnItemClickListener(Landroid/widget/AdapterView$OnItemClickListener;)V

    .line 638
    iget-object v0, p0, Lcom/huawei/health/sns/ui/chat/photo/send/HealthAlbumPicBrowserActivity;->i:Lcom/huawei/health/sns/model/chat/Album;

    invoke-virtual {v0}, Lcom/huawei/health/sns/model/chat/Album;->getName()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/huawei/health/sns/ui/chat/photo/send/HealthAlbumPicBrowserActivity;->a(Ljava/lang/String;)V

    .line 640
    iget-object v0, p0, Lcom/huawei/health/sns/ui/chat/photo/send/HealthAlbumPicBrowserActivity;->t:Lo/bdx;

    iget-object v1, p0, Lcom/huawei/health/sns/ui/chat/photo/send/HealthAlbumPicBrowserActivity;->c:Lo/bdz;

    invoke-virtual {v0, v1}, Lo/bdx;->setBlurredView(Landroid/view/View;)V

    .line 641
    iget-object v0, p0, Lcom/huawei/health/sns/ui/chat/photo/send/HealthAlbumPicBrowserActivity;->t:Lo/bdx;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lo/bdx;->c(I)V

    .line 642
    iget-object v0, p0, Lcom/huawei/health/sns/ui/chat/photo/send/HealthAlbumPicBrowserActivity;->c:Lo/bdz;

    new-instance v1, Lcom/huawei/health/sns/ui/chat/photo/send/HealthAlbumPicBrowserActivity$d;

    const/4 v2, 0x0

    invoke-direct {v1, p0, v2}, Lcom/huawei/health/sns/ui/chat/photo/send/HealthAlbumPicBrowserActivity$d;-><init>(Lcom/huawei/health/sns/ui/chat/photo/send/HealthAlbumPicBrowserActivity;Lcom/huawei/health/sns/ui/chat/photo/send/HealthAlbumPicBrowserActivity$1;)V

    invoke-virtual {v0, v1}, Lo/bdz;->setOnScrollListener(Landroid/widget/AbsListView$OnScrollListener;)V

    .line 643
    return-void
.end method

.method static synthetic k(Lcom/huawei/health/sns/ui/chat/photo/send/HealthAlbumPicBrowserActivity;)Lo/bdx;
    .locals 1

    .line 54
    iget-object v0, p0, Lcom/huawei/health/sns/ui/chat/photo/send/HealthAlbumPicBrowserActivity;->t:Lo/bdx;

    return-object v0
.end method

.method private k()V
    .locals 2

    .line 690
    new-instance v0, Lo/arl;

    iget-object v1, p0, Lcom/huawei/health/sns/ui/chat/photo/send/HealthAlbumPicBrowserActivity;->y:Landroid/os/Handler;

    invoke-direct {v0, p0, v1}, Lo/arl;-><init>(Landroid/content/Context;Landroid/os/Handler;)V

    const/16 v1, 0x35

    invoke-virtual {v0, v1}, Lo/arl;->b(I)V

    .line 691
    return-void
.end method


# virtual methods
.method public c(Lcom/huawei/health/sns/model/chat/Album;)V
    .locals 1

    .line 604
    iget-boolean v0, p0, Lcom/huawei/health/sns/ui/chat/photo/send/HealthAlbumPicBrowserActivity;->v:Z

    if-eqz v0, :cond_0

    .line 605
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/health/sns/ui/chat/photo/send/HealthAlbumPicBrowserActivity;->v:Z

    .line 606
    iget-object v0, p0, Lcom/huawei/health/sns/ui/chat/photo/send/HealthAlbumPicBrowserActivity;->i:Lcom/huawei/health/sns/model/chat/Album;

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/huawei/health/sns/ui/chat/photo/send/HealthAlbumPicBrowserActivity;->i:Lcom/huawei/health/sns/model/chat/Album;

    if-eq v0, p1, :cond_1

    .line 607
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/chat/photo/send/HealthAlbumPicBrowserActivity;->i()V

    goto :goto_0

    .line 610
    :cond_0
    invoke-direct {p0, p1}, Lcom/huawei/health/sns/ui/chat/photo/send/HealthAlbumPicBrowserActivity;->a(Lcom/huawei/health/sns/model/chat/Album;)V

    .line 612
    :cond_1
    :goto_0
    return-void
.end method

.method protected c()Z
    .locals 6

    .line 438
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v4

    .line 439
    iget-wide v0, p0, Lcom/huawei/health/sns/ui/chat/photo/send/HealthAlbumPicBrowserActivity;->z:J

    sub-long v0, v4, v0

    invoke-static {v0, v1}, Ljava/lang/Math;->abs(J)J

    move-result-wide v0

    const-wide/16 v2, 0x7d0

    cmp-long v0, v0, v2

    if-gez v0, :cond_0

    .line 441
    const/4 v0, 0x1

    return v0

    .line 443
    :cond_0
    iput-wide v4, p0, Lcom/huawei/health/sns/ui/chat/photo/send/HealthAlbumPicBrowserActivity;->z:J

    .line 444
    const/4 v0, 0x0

    return v0
.end method

.method public onActivityResult(IILandroid/content/Intent;)V
    .locals 4

    .line 818
    const-string v0, "HealthAlbumPicBrowserActivity"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "onActivityResult, and requestCode = "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/bpf;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 820
    const/16 v0, 0x32

    if-ne p1, v0, :cond_3

    .line 821
    const/4 v0, -0x1

    if-ne p2, v0, :cond_2

    .line 822
    const-string v0, "selectedList"

    invoke-virtual {p3, v0}, Landroid/content/Intent;->getIntegerArrayListExtra(Ljava/lang/String;)Ljava/util/ArrayList;

    move-result-object v3

    .line 823
    if-eqz v3, :cond_0

    .line 824
    iget-object v0, p0, Lcom/huawei/health/sns/ui/chat/photo/send/HealthAlbumPicBrowserActivity;->d:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    .line 825
    iget-object v0, p0, Lcom/huawei/health/sns/ui/chat/photo/send/HealthAlbumPicBrowserActivity;->d:Ljava/util/ArrayList;

    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 826
    iget-object v0, p0, Lcom/huawei/health/sns/ui/chat/photo/send/HealthAlbumPicBrowserActivity;->h:Lo/bdw;

    if-eqz v0, :cond_1

    .line 827
    iget-object v0, p0, Lcom/huawei/health/sns/ui/chat/photo/send/HealthAlbumPicBrowserActivity;->h:Lo/bdw;

    invoke-virtual {v0}, Lo/bdw;->notifyDataSetChanged()V

    goto :goto_0

    .line 831
    :cond_0
    const-string v0, "HealthAlbumPicBrowserActivity"

    const-string v1, "onActivityResult, and selectedList = null!!"

    invoke-static {v0, v1}, Lo/bpf;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 833
    :cond_1
    :goto_0
    goto :goto_1

    :cond_2
    const/16 v0, 0x39

    if-ne p2, v0, :cond_3

    .line 834
    invoke-direct {p0, p3}, Lcom/huawei/health/sns/ui/chat/photo/send/HealthAlbumPicBrowserActivity;->c(Landroid/content/Intent;)V

    .line 837
    :cond_3
    :goto_1
    invoke-super {p0, p1, p2, p3}, Lcom/huawei/ui/commonui/base/BaseActivity;->onActivityResult(IILandroid/content/Intent;)V

    .line 838
    return-void
.end method

.method public onClick(Landroid/view/View;)V
    .locals 3

    .line 929
    invoke-virtual {p1}, Landroid/view/View;->getId()I

    move-result v2

    .line 930
    sget v0, Lcom/huawei/android/sns/R$id;->rl_album_name:I

    if-ne v2, v0, :cond_0

    .line 931
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/chat/photo/send/HealthAlbumPicBrowserActivity;->g()V

    goto :goto_0

    .line 932
    :cond_0
    sget v0, Lcom/huawei/android/sns/R$id;->rl_album_preview:I

    if-eq v2, v0, :cond_1

    sget v0, Lcom/huawei/android/sns/R$id;->tv_preview:I

    if-ne v2, v0, :cond_2

    .line 933
    :cond_1
    iget-object v0, p0, Lcom/huawei/health/sns/ui/chat/photo/send/HealthAlbumPicBrowserActivity;->d:Ljava/util/ArrayList;

    if-eqz v0, :cond_2

    iget-object v0, p0, Lcom/huawei/health/sns/ui/chat/photo/send/HealthAlbumPicBrowserActivity;->d:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-lez v0, :cond_2

    .line 934
    iget-object v0, p0, Lcom/huawei/health/sns/ui/chat/photo/send/HealthAlbumPicBrowserActivity;->d:Ljava/util/ArrayList;

    const/4 v1, 0x0

    invoke-direct {p0, v0, v1}, Lcom/huawei/health/sns/ui/chat/photo/send/HealthAlbumPicBrowserActivity;->e(Ljava/util/ArrayList;I)V

    .line 937
    :cond_2
    :goto_0
    return-void
.end method

.method public onConfigurationChanged(Landroid/content/res/Configuration;)V
    .locals 1

    .line 1016
    invoke-super {p0, p1}, Lcom/huawei/ui/commonui/base/BaseActivity;->onConfigurationChanged(Landroid/content/res/Configuration;)V

    .line 1017
    sget v0, Lcom/huawei/android/sns/R$layout;->sns_input_picture_browser_layout:I

    invoke-virtual {p0, v0}, Lcom/huawei/health/sns/ui/chat/photo/send/HealthAlbumPicBrowserActivity;->setContentView(I)V

    .line 1018
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/huawei/health/sns/ui/chat/photo/send/HealthAlbumPicBrowserActivity;->v:Z

    .line 1019
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/chat/photo/send/HealthAlbumPicBrowserActivity;->d()V

    .line 1020
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/chat/photo/send/HealthAlbumPicBrowserActivity;->h()V

    .line 1021
    return-void
.end method

.method public onCreate(Landroid/os/Bundle;)V
    .locals 1

    .line 258
    invoke-super {p0, p1}, Lcom/huawei/ui/commonui/base/BaseActivity;->onCreate(Landroid/os/Bundle;)V

    .line 259
    sget v0, Lcom/huawei/android/sns/R$layout;->activity_health_album_pic_browser:I

    invoke-virtual {p0, v0}, Lcom/huawei/health/sns/ui/chat/photo/send/HealthAlbumPicBrowserActivity;->setContentView(I)V

    .line 261
    invoke-virtual {p0}, Lcom/huawei/health/sns/ui/chat/photo/send/HealthAlbumPicBrowserActivity;->getIntent()Landroid/content/Intent;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/huawei/health/sns/ui/chat/photo/send/HealthAlbumPicBrowserActivity;->d(Landroid/content/Intent;)V

    .line 262
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/chat/photo/send/HealthAlbumPicBrowserActivity;->d()V

    .line 263
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/chat/photo/send/HealthAlbumPicBrowserActivity;->h()V

    .line 264
    return-void
.end method

.method public onDestroy()V
    .locals 1

    .line 842
    invoke-super {p0}, Lcom/huawei/ui/commonui/base/BaseActivity;->onDestroy()V

    .line 843
    iget-object v0, p0, Lcom/huawei/health/sns/ui/chat/photo/send/HealthAlbumPicBrowserActivity;->d:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    .line 844
    return-void
.end method

.method public onKeyDown(ILandroid/view/KeyEvent;)Z
    .locals 2

    .line 798
    invoke-super {p0, p1, p2}, Lcom/huawei/ui/commonui/base/BaseActivity;->onKeyDown(ILandroid/view/KeyEvent;)Z

    .line 799
    invoke-virtual {p2}, Landroid/view/KeyEvent;->getKeyCode()I

    move-result v0

    const/4 v1, 0x4

    if-ne v0, v1, :cond_1

    .line 800
    iget-object v0, p0, Lcom/huawei/health/sns/ui/chat/photo/send/HealthAlbumPicBrowserActivity;->m:Lo/bdu;

    invoke-virtual {v0}, Lo/bdu;->getVisibility()I

    move-result v0

    if-nez v0, :cond_0

    .line 801
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/chat/photo/send/HealthAlbumPicBrowserActivity;->g()V

    .line 802
    const/4 v0, 0x0

    return v0

    .line 804
    :cond_0
    invoke-virtual {p0}, Lcom/huawei/health/sns/ui/chat/photo/send/HealthAlbumPicBrowserActivity;->finish()V

    .line 807
    :cond_1
    const/4 v0, 0x0

    return v0
.end method

.method public onRequestPermissionsResult(I[Ljava/lang/String;[I)V
    .locals 1

    .line 695
    const/4 v0, 0x1

    if-ne p1, v0, :cond_1

    .line 696
    if-eqz p3, :cond_0

    invoke-static {p3}, Lo/biq;->d([I)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 697
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/chat/photo/send/HealthAlbumPicBrowserActivity;->k()V

    .line 698
    invoke-static {}, Lo/bpk;->b()Lo/bpk;

    move-result-object v0

    invoke-virtual {v0}, Lo/bpk;->c()V

    goto :goto_0

    .line 700
    :cond_0
    invoke-virtual {p0}, Lcom/huawei/health/sns/ui/chat/photo/send/HealthAlbumPicBrowserActivity;->finish()V

    .line 703
    :cond_1
    :goto_0
    return-void
.end method
