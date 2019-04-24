.class public Lcom/huawei/health/sns/ui/chat/photo/send/AlbumPicBrowserActivity;
.super Lcom/huawei/health/sns/ui/base/SNSBaseActivity;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/huawei/health/sns/ui/chat/photo/send/AlbumPicBrowserActivity$c;,
        Lcom/huawei/health/sns/ui/chat/photo/send/AlbumPicBrowserActivity$e;,
        Lcom/huawei/health/sns/ui/chat/photo/send/AlbumPicBrowserActivity$d;
    }
.end annotation


# instance fields
.field private A:Z

.field private B:Landroid/view/View;

.field private C:Landroid/widget/TextView;

.field private D:Landroid/widget/TextView;

.field private E:Landroid/view/View$OnClickListener;

.field private F:J

.field private G:Lo/bdw$a;

.field private H:Landroid/os/Handler;

.field private I:Landroid/view/View$OnClickListener;

.field private L:Landroid/widget/AdapterView$OnItemClickListener;

.field f:Landroid/widget/AdapterView$OnItemClickListener;

.field private g:Z

.field protected h:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<Ljava/lang/Integer;>;"
        }
    .end annotation
.end field

.field private j:Z

.field private k:I

.field private l:Landroid/view/View;

.field private m:Lo/bdw;

.field private n:I

.field private o:Lcom/huawei/health/sns/model/chat/Album;

.field private p:Lo/bdz;

.field private q:Lo/bdu;

.field private r:Landroid/view/View;

.field private s:Landroid/widget/TextView;

.field private t:Lo/bdt;

.field private u:Landroid/view/View;

.field private v:Lo/bdx;

.field private w:Landroid/widget/TextView;

.field private x:Landroid/widget/LinearLayout;

.field private y:Landroid/view/View;

.field private z:Landroid/widget/LinearLayout;


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 63
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/base/SNSBaseActivity;-><init>()V

    .line 72
    const/4 v0, 0x4

    iput v0, p0, Lcom/huawei/health/sns/ui/chat/photo/send/AlbumPicBrowserActivity;->k:I

    .line 97
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/health/sns/ui/chat/photo/send/AlbumPicBrowserActivity;->g:Z

    .line 102
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/huawei/health/sns/ui/chat/photo/send/AlbumPicBrowserActivity;->h:Ljava/util/ArrayList;

    .line 117
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/health/sns/ui/chat/photo/send/AlbumPicBrowserActivity;->o:Lcom/huawei/health/sns/model/chat/Album;

    .line 122
    const/4 v0, 0x0

    iput v0, p0, Lcom/huawei/health/sns/ui/chat/photo/send/AlbumPicBrowserActivity;->n:I

    .line 197
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/health/sns/ui/chat/photo/send/AlbumPicBrowserActivity;->A:Z

    .line 202
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/health/sns/ui/chat/photo/send/AlbumPicBrowserActivity;->j:Z

    .line 207
    const-wide/16 v0, 0x0

    iput-wide v0, p0, Lcom/huawei/health/sns/ui/chat/photo/send/AlbumPicBrowserActivity;->F:J

    .line 218
    new-instance v0, Lcom/huawei/health/sns/ui/chat/photo/send/AlbumPicBrowserActivity$d;

    invoke-direct {v0, p0}, Lcom/huawei/health/sns/ui/chat/photo/send/AlbumPicBrowserActivity$d;-><init>(Lcom/huawei/health/sns/ui/chat/photo/send/AlbumPicBrowserActivity;)V

    iput-object v0, p0, Lcom/huawei/health/sns/ui/chat/photo/send/AlbumPicBrowserActivity;->H:Landroid/os/Handler;

    .line 447
    new-instance v0, Lcom/huawei/health/sns/ui/chat/photo/send/AlbumPicBrowserActivity$4;

    invoke-direct {v0, p0}, Lcom/huawei/health/sns/ui/chat/photo/send/AlbumPicBrowserActivity$4;-><init>(Lcom/huawei/health/sns/ui/chat/photo/send/AlbumPicBrowserActivity;)V

    iput-object v0, p0, Lcom/huawei/health/sns/ui/chat/photo/send/AlbumPicBrowserActivity;->E:Landroid/view/View$OnClickListener;

    .line 456
    new-instance v0, Lcom/huawei/health/sns/ui/chat/photo/send/AlbumPicBrowserActivity$2;

    invoke-direct {v0, p0}, Lcom/huawei/health/sns/ui/chat/photo/send/AlbumPicBrowserActivity$2;-><init>(Lcom/huawei/health/sns/ui/chat/photo/send/AlbumPicBrowserActivity;)V

    iput-object v0, p0, Lcom/huawei/health/sns/ui/chat/photo/send/AlbumPicBrowserActivity;->I:Landroid/view/View$OnClickListener;

    .line 687
    new-instance v0, Lcom/huawei/health/sns/ui/chat/photo/send/AlbumPicBrowserActivity$5;

    invoke-direct {v0, p0}, Lcom/huawei/health/sns/ui/chat/photo/send/AlbumPicBrowserActivity$5;-><init>(Lcom/huawei/health/sns/ui/chat/photo/send/AlbumPicBrowserActivity;)V

    iput-object v0, p0, Lcom/huawei/health/sns/ui/chat/photo/send/AlbumPicBrowserActivity;->G:Lo/bdw$a;

    .line 768
    new-instance v0, Lcom/huawei/health/sns/ui/chat/photo/send/AlbumPicBrowserActivity$1;

    invoke-direct {v0, p0}, Lcom/huawei/health/sns/ui/chat/photo/send/AlbumPicBrowserActivity$1;-><init>(Lcom/huawei/health/sns/ui/chat/photo/send/AlbumPicBrowserActivity;)V

    iput-object v0, p0, Lcom/huawei/health/sns/ui/chat/photo/send/AlbumPicBrowserActivity;->f:Landroid/widget/AdapterView$OnItemClickListener;

    .line 783
    new-instance v0, Lcom/huawei/health/sns/ui/chat/photo/send/AlbumPicBrowserActivity$3;

    invoke-direct {v0, p0}, Lcom/huawei/health/sns/ui/chat/photo/send/AlbumPicBrowserActivity$3;-><init>(Lcom/huawei/health/sns/ui/chat/photo/send/AlbumPicBrowserActivity;)V

    iput-object v0, p0, Lcom/huawei/health/sns/ui/chat/photo/send/AlbumPicBrowserActivity;->L:Landroid/widget/AdapterView$OnItemClickListener;

    return-void
.end method

.method static synthetic a(Lcom/huawei/health/sns/ui/chat/photo/send/AlbumPicBrowserActivity;)Lo/bdt;
    .locals 1

    .line 63
    iget-object v0, p0, Lcom/huawei/health/sns/ui/chat/photo/send/AlbumPicBrowserActivity;->t:Lo/bdt;

    return-object v0
.end method

.method static synthetic a(Lcom/huawei/health/sns/ui/chat/photo/send/AlbumPicBrowserActivity;I)V
    .locals 0

    .line 63
    invoke-direct {p0, p1}, Lcom/huawei/health/sns/ui/chat/photo/send/AlbumPicBrowserActivity;->b(I)V

    return-void
.end method

.method static synthetic a(Lcom/huawei/health/sns/ui/chat/photo/send/AlbumPicBrowserActivity;Z)V
    .locals 0

    .line 63
    invoke-direct {p0, p1}, Lcom/huawei/health/sns/ui/chat/photo/send/AlbumPicBrowserActivity;->b(Z)V

    return-void
.end method

.method private a(Z)V
    .locals 2

    .line 618
    if-eqz p1, :cond_0

    .line 619
    iget-object v0, p0, Lcom/huawei/health/sns/ui/chat/photo/send/AlbumPicBrowserActivity;->y:Landroid/view/View;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 620
    iget-object v0, p0, Lcom/huawei/health/sns/ui/chat/photo/send/AlbumPicBrowserActivity;->z:Landroid/widget/LinearLayout;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    goto :goto_0

    .line 622
    :cond_0
    iget-object v0, p0, Lcom/huawei/health/sns/ui/chat/photo/send/AlbumPicBrowserActivity;->y:Landroid/view/View;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 623
    iget-object v0, p0, Lcom/huawei/health/sns/ui/chat/photo/send/AlbumPicBrowserActivity;->z:Landroid/widget/LinearLayout;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 625
    :goto_0
    return-void
.end method

.method static synthetic b(Lcom/huawei/health/sns/ui/chat/photo/send/AlbumPicBrowserActivity;I)I
    .locals 0

    .line 63
    iput p1, p0, Lcom/huawei/health/sns/ui/chat/photo/send/AlbumPicBrowserActivity;->n:I

    return p1
.end method

.method private b()V
    .locals 0
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "InflateParams"
        }
    .end annotation

    .line 341
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/chat/photo/send/AlbumPicBrowserActivity;->e()V

    .line 344
    invoke-virtual {p0}, Lcom/huawei/health/sns/ui/chat/photo/send/AlbumPicBrowserActivity;->a()V

    .line 345
    return-void
.end method

.method private b(I)V
    .locals 5

    .line 801
    if-gez p1, :cond_0

    .line 802
    return-void

    .line 804
    :cond_0
    iget-object v0, p0, Lcom/huawei/health/sns/ui/chat/photo/send/AlbumPicBrowserActivity;->o:Lcom/huawei/health/sns/model/chat/Album;

    invoke-virtual {v0}, Lcom/huawei/health/sns/model/chat/Album;->getPhotoIdList()Ljava/util/ArrayList;

    move-result-object v2

    .line 805
    if-eqz v2, :cond_2

    .line 806
    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    move-result v0

    add-int/lit8 v0, v0, -0x1

    if-le p1, v0, :cond_1

    .line 807
    return-void

    .line 809
    :cond_1
    invoke-virtual {v2, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v3

    .line 810
    new-instance v4, Landroid/content/Intent;

    invoke-direct {v4}, Landroid/content/Intent;-><init>()V

    .line 811
    const-string v0, "selectedId"

    invoke-virtual {v4, v0, v3}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    .line 812
    const/4 v0, -0x1

    invoke-virtual {p0, v0, v4}, Lcom/huawei/health/sns/ui/chat/photo/send/AlbumPicBrowserActivity;->setResult(ILandroid/content/Intent;)V

    .line 813
    invoke-virtual {p0}, Lcom/huawei/health/sns/ui/chat/photo/send/AlbumPicBrowserActivity;->finish()V

    .line 815
    :cond_2
    return-void
.end method

.method private b(Landroid/content/Intent;)V
    .locals 1

    .line 889
    const/4 v0, -0x1

    invoke-virtual {p0, v0, p1}, Lcom/huawei/health/sns/ui/chat/photo/send/AlbumPicBrowserActivity;->setResult(ILandroid/content/Intent;)V

    .line 890
    invoke-virtual {p0}, Lcom/huawei/health/sns/ui/chat/photo/send/AlbumPicBrowserActivity;->finish()V

    .line 891
    return-void
.end method

.method static synthetic b(Lcom/huawei/health/sns/ui/chat/photo/send/AlbumPicBrowserActivity;)V
    .locals 0

    .line 63
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/chat/photo/send/AlbumPicBrowserActivity;->g()V

    return-void
.end method

.method static synthetic b(Lcom/huawei/health/sns/ui/chat/photo/send/AlbumPicBrowserActivity;Ljava/util/ArrayList;)V
    .locals 0

    .line 63
    invoke-direct {p0, p1}, Lcom/huawei/health/sns/ui/chat/photo/send/AlbumPicBrowserActivity;->b(Ljava/util/ArrayList;)V

    return-void
.end method

.method static synthetic b(Lcom/huawei/health/sns/ui/chat/photo/send/AlbumPicBrowserActivity;Z)V
    .locals 0

    .line 63
    invoke-direct {p0, p1}, Lcom/huawei/health/sns/ui/chat/photo/send/AlbumPicBrowserActivity;->a(Z)V

    return-void
.end method

.method private b(Ljava/lang/String;)V
    .locals 1

    .line 705
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 706
    iget-object v0, p0, Lcom/huawei/health/sns/ui/chat/photo/send/AlbumPicBrowserActivity;->s:Landroid/widget/TextView;

    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 708
    :cond_0
    return-void
.end method

.method private b(Ljava/util/ArrayList;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/ArrayList<Lcom/huawei/health/sns/model/chat/Album;>;)V"
        }
    .end annotation

    .line 633
    iget-object v0, p0, Lcom/huawei/health/sns/ui/chat/photo/send/AlbumPicBrowserActivity;->t:Lo/bdt;

    invoke-virtual {v0, p1}, Lo/bdt;->c(Ljava/util/List;)V

    .line 634
    iget-object v0, p0, Lcom/huawei/health/sns/ui/chat/photo/send/AlbumPicBrowserActivity;->v:Lo/bdx;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lo/bdx;->c(I)V

    .line 635
    return-void
.end method

.method private b(Z)V
    .locals 2

    .line 758
    if-eqz p1, :cond_0

    .line 759
    iget-object v0, p0, Lcom/huawei/health/sns/ui/chat/photo/send/AlbumPicBrowserActivity;->r:Landroid/view/View;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    goto :goto_0

    .line 761
    :cond_0
    iget-object v0, p0, Lcom/huawei/health/sns/ui/chat/photo/send/AlbumPicBrowserActivity;->r:Landroid/view/View;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 763
    :goto_0
    return-void
.end method

.method private c(I)V
    .locals 3

    .line 1043
    iget-object v0, p0, Lcom/huawei/health/sns/ui/chat/photo/send/AlbumPicBrowserActivity;->h:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v1

    .line 1044
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 1045
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Ljava/lang/Integer;

    .line 1046
    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    move-result v0

    if-ne v0, p1, :cond_0

    .line 1047
    invoke-interface {v1}, Ljava/util/Iterator;->remove()V

    .line 1048
    goto :goto_1

    .line 1050
    :cond_0
    goto :goto_0

    .line 1051
    :cond_1
    :goto_1
    return-void
.end method

.method private c(Landroid/content/Intent;)V
    .locals 3

    .line 280
    if-eqz p1, :cond_1

    .line 281
    invoke-virtual {p1}, Landroid/content/Intent;->getExtras()Landroid/os/Bundle;

    move-result-object v2

    .line 282
    if-nez v2, :cond_0

    .line 283
    return-void

    .line 285
    :cond_0
    const-string v0, "isSingle"

    invoke-virtual {v2, v0}, Landroid/os/Bundle;->containsKey(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 286
    const-string v0, "isSingle"

    const/4 v1, 0x0

    invoke-virtual {v2, v0, v1}, Landroid/os/Bundle;->getBoolean(Ljava/lang/String;Z)Z

    move-result v0

    iput-boolean v0, p0, Lcom/huawei/health/sns/ui/chat/photo/send/AlbumPicBrowserActivity;->A:Z

    .line 289
    :cond_1
    return-void
.end method

.method private c(Lcom/huawei/health/sns/model/chat/Album;)V
    .locals 1

    .line 659
    if-eqz p1, :cond_0

    iget-object v0, p0, Lcom/huawei/health/sns/ui/chat/photo/send/AlbumPicBrowserActivity;->o:Lcom/huawei/health/sns/model/chat/Album;

    if-eq v0, p1, :cond_0

    .line 660
    iput-object p1, p0, Lcom/huawei/health/sns/ui/chat/photo/send/AlbumPicBrowserActivity;->o:Lcom/huawei/health/sns/model/chat/Album;

    .line 661
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/chat/photo/send/AlbumPicBrowserActivity;->l()V

    .line 663
    :cond_0
    return-void
.end method

.method static synthetic c(Lcom/huawei/health/sns/ui/chat/photo/send/AlbumPicBrowserActivity;)V
    .locals 0

    .line 63
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/chat/photo/send/AlbumPicBrowserActivity;->b()V

    return-void
.end method

.method static synthetic c(Lcom/huawei/health/sns/ui/chat/photo/send/AlbumPicBrowserActivity;Lcom/huawei/health/sns/model/chat/Album;)V
    .locals 0

    .line 63
    invoke-direct {p0, p1}, Lcom/huawei/health/sns/ui/chat/photo/send/AlbumPicBrowserActivity;->c(Lcom/huawei/health/sns/model/chat/Album;)V

    return-void
.end method

.method static synthetic c(Lcom/huawei/health/sns/ui/chat/photo/send/AlbumPicBrowserActivity;Lo/bdw$d;I)V
    .locals 0

    .line 63
    invoke-direct {p0, p1, p2}, Lcom/huawei/health/sns/ui/chat/photo/send/AlbumPicBrowserActivity;->d(Lo/bdw$d;I)V

    return-void
.end method

.method private c(Lo/bdw$d;I)V
    .locals 5

    .line 985
    invoke-virtual {p1}, Lo/bdw$d;->getCover()Landroid/view/View;

    move-result-object v2

    .line 986
    invoke-virtual {p1}, Lo/bdw$d;->getPhotoCheckBox()Landroid/widget/CheckBox;

    move-result-object v3

    .line 987
    iget-object v0, p0, Lcom/huawei/health/sns/ui/chat/photo/send/AlbumPicBrowserActivity;->h:Ljava/util/ArrayList;

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    move-result v4

    .line 988
    if-eqz v2, :cond_1

    .line 989
    if-eqz v4, :cond_0

    const/4 v0, 0x0

    goto :goto_0

    :cond_0
    const/4 v0, 0x4

    :goto_0
    invoke-virtual {v2, v0}, Landroid/view/View;->setVisibility(I)V

    .line 991
    :cond_1
    if-eqz v3, :cond_2

    .line 992
    invoke-virtual {v3, v4}, Landroid/widget/CheckBox;->setChecked(Z)V

    .line 994
    :cond_2
    return-void
.end method

.method static synthetic d(Lcom/huawei/health/sns/ui/chat/photo/send/AlbumPicBrowserActivity;)V
    .locals 0

    .line 63
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/chat/photo/send/AlbumPicBrowserActivity;->k()V

    return-void
.end method

.method static synthetic d(Lcom/huawei/health/sns/ui/chat/photo/send/AlbumPicBrowserActivity;Lo/bdw$d;I)V
    .locals 0

    .line 63
    invoke-direct {p0, p1, p2}, Lcom/huawei/health/sns/ui/chat/photo/send/AlbumPicBrowserActivity;->c(Lo/bdw$d;I)V

    return-void
.end method

.method private d(Ljava/util/ArrayList;I)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/ArrayList<Ljava/lang/Integer;>;I)V"
        }
    .end annotation

    .line 824
    new-instance v2, Landroid/content/Intent;

    const-class v0, Lcom/huawei/health/sns/ui/chat/photo/send/PhotoPagerActivity;

    invoke-direct {v2, p0, v0}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 825
    const-string v0, "totalList"

    invoke-virtual {v2, v0, p1}, Landroid/content/Intent;->putIntegerArrayListExtra(Ljava/lang/String;Ljava/util/ArrayList;)Landroid/content/Intent;

    .line 827
    const-string v0, "selectedList"

    iget-object v1, p0, Lcom/huawei/health/sns/ui/chat/photo/send/AlbumPicBrowserActivity;->h:Ljava/util/ArrayList;

    invoke-virtual {v2, v0, v1}, Landroid/content/Intent;->putIntegerArrayListExtra(Ljava/lang/String;Ljava/util/ArrayList;)Landroid/content/Intent;

    .line 829
    const-string v0, "position"

    invoke-virtual {v2, v0, p2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    .line 831
    const-string v0, "isDisplaySelect"

    const/4 v1, 0x1

    invoke-virtual {v2, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Z)Landroid/content/Intent;

    .line 832
    const/16 v0, 0x32

    invoke-virtual {p0, v2, v0}, Lcom/huawei/health/sns/ui/chat/photo/send/AlbumPicBrowserActivity;->startActivityForResult(Landroid/content/Intent;I)V

    .line 833
    return-void
.end method

.method private d(Lo/bdw$d;I)V
    .locals 2

    .line 1003
    invoke-virtual {p1}, Lo/bdw$d;->getPhotoCheckBox()Landroid/widget/CheckBox;

    move-result-object v1

    .line 1005
    new-instance v0, Lcom/huawei/health/sns/ui/chat/photo/send/AlbumPicBrowserActivity$8;

    invoke-direct {v0, p0, v1, p1, p2}, Lcom/huawei/health/sns/ui/chat/photo/send/AlbumPicBrowserActivity$8;-><init>(Lcom/huawei/health/sns/ui/chat/photo/send/AlbumPicBrowserActivity;Landroid/widget/CheckBox;Lo/bdw$d;I)V

    invoke-virtual {v1, v0}, Landroid/widget/CheckBox;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 1035
    return-void
.end method

.method static synthetic d(Lcom/huawei/health/sns/ui/chat/photo/send/AlbumPicBrowserActivity;Z)Z
    .locals 0

    .line 63
    iput-boolean p1, p0, Lcom/huawei/health/sns/ui/chat/photo/send/AlbumPicBrowserActivity;->g:Z

    return p1
.end method

.method private e()V
    .locals 9
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "ResourceAsColor"
        }
    .end annotation

    .line 352
    invoke-virtual {p0}, Lcom/huawei/health/sns/ui/chat/photo/send/AlbumPicBrowserActivity;->getActionBar()Landroid/app/ActionBar;

    move-result-object v3

    .line 353
    invoke-static {p0}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v4

    .line 354
    const/4 v5, 0x0

    .line 363
    sget v0, Lcom/huawei/android/sns/R$layout;->sns_photo_choose_actionbar_title:I

    const/4 v1, 0x0

    const/4 v2, 0x0

    invoke-virtual {v4, v0, v1, v2}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object v0

    move-object v5, v0

    check-cast v5, Landroid/widget/RelativeLayout;

    .line 365
    if-eqz v3, :cond_0

    .line 366
    invoke-virtual {v3, v5}, Landroid/app/ActionBar;->setCustomView(Landroid/view/View;)V

    .line 367
    invoke-virtual {p0}, Lcom/huawei/health/sns/ui/chat/photo/send/AlbumPicBrowserActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/android/sns/R$drawable;->toolbar_bg:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v0

    invoke-virtual {v3, v0}, Landroid/app/ActionBar;->setBackgroundDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 370
    :cond_0
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x15

    if-lt v0, v1, :cond_1

    .line 372
    invoke-virtual {p0}, Lcom/huawei/health/sns/ui/chat/photo/send/AlbumPicBrowserActivity;->getWindow()Landroid/view/Window;

    move-result-object v6

    .line 373
    const/high16 v0, -0x80000000

    invoke-virtual {v6, v0}, Landroid/view/Window;->addFlags(I)V

    .line 374
    invoke-virtual {p0}, Lcom/huawei/health/sns/ui/chat/photo/send/AlbumPicBrowserActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/android/sns/R$color;->sns_toolbar_bg_end_color:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getColor(I)I

    move-result v0

    invoke-virtual {v6, v0}, Landroid/view/Window;->setStatusBarColor(I)V

    .line 376
    :cond_1
    sget v0, Lcom/huawei/android/sns/R$id;->sns_photo_chosed_num:I

    invoke-virtual {v5, v0}, Landroid/widget/RelativeLayout;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/huawei/health/sns/ui/chat/photo/send/AlbumPicBrowserActivity;->D:Landroid/widget/TextView;

    .line 377
    sget v0, Lcom/huawei/android/sns/R$id;->sns_photo_chosed_text:I

    invoke-virtual {v5, v0}, Landroid/widget/RelativeLayout;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/huawei/health/sns/ui/chat/photo/send/AlbumPicBrowserActivity;->C:Landroid/widget/TextView;

    .line 378
    sget v0, Lcom/huawei/android/sns/R$id;->btn_cancel:I

    invoke-virtual {v5, v0}, Landroid/widget/RelativeLayout;->findViewById(I)Landroid/view/View;

    move-result-object v0

    move-object v6, v0

    check-cast v6, Landroid/widget/ImageView;

    .line 379
    sget v0, Lcom/huawei/android/sns/R$id;->btn_ok:I

    invoke-virtual {v5, v0}, Landroid/widget/RelativeLayout;->findViewById(I)Landroid/view/View;

    move-result-object v0

    move-object v7, v0

    check-cast v7, Landroid/widget/ImageView;

    .line 380
    iget-object v0, p0, Lcom/huawei/health/sns/ui/chat/photo/send/AlbumPicBrowserActivity;->I:Landroid/view/View$OnClickListener;

    invoke-virtual {v7, v0}, Landroid/widget/ImageView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 381
    iget-object v0, p0, Lcom/huawei/health/sns/ui/chat/photo/send/AlbumPicBrowserActivity;->E:Landroid/view/View$OnClickListener;

    invoke-virtual {v6, v0}, Landroid/widget/ImageView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 382
    sget v0, Lcom/huawei/android/sns/R$id;->sns_photo_chosed_bg:I

    invoke-virtual {v5, v0}, Landroid/widget/RelativeLayout;->findViewById(I)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/health/sns/ui/chat/photo/send/AlbumPicBrowserActivity;->B:Landroid/view/View;

    .line 383
    iget-object v0, p0, Lcom/huawei/health/sns/ui/chat/photo/send/AlbumPicBrowserActivity;->B:Landroid/view/View;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 385
    iget-boolean v0, p0, Lcom/huawei/health/sns/ui/chat/photo/send/AlbumPicBrowserActivity;->A:Z

    if-nez v0, :cond_3

    .line 387
    if-eqz v3, :cond_2

    .line 388
    iget-object v0, p0, Lcom/huawei/health/sns/ui/chat/photo/send/AlbumPicBrowserActivity;->E:Landroid/view/View$OnClickListener;

    const/4 v1, 0x1

    const/4 v2, 0x0

    invoke-static {v3, v1, v2, v0}, Lo/bmm;->a(Landroid/app/ActionBar;ZLandroid/graphics/drawable/Drawable;Landroid/view/View$OnClickListener;)V

    .line 389
    iget-object v0, p0, Lcom/huawei/health/sns/ui/chat/photo/send/AlbumPicBrowserActivity;->I:Landroid/view/View$OnClickListener;

    const/4 v1, 0x1

    const/4 v2, 0x0

    invoke-static {v3, v1, v2, v0}, Lo/bmm;->b(Landroid/app/ActionBar;ZLandroid/graphics/drawable/Drawable;Landroid/view/View$OnClickListener;)V

    .line 391
    :cond_2
    iget-object v0, p0, Lcom/huawei/health/sns/ui/chat/photo/send/AlbumPicBrowserActivity;->C:Landroid/widget/TextView;

    sget v1, Lcom/huawei/android/sns/R$string;->sns_photo_chosed:I

    invoke-virtual {p0, v1}, Lcom/huawei/health/sns/ui/chat/photo/send/AlbumPicBrowserActivity;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    goto :goto_0

    .line 393
    :cond_3
    if-eqz v3, :cond_4

    invoke-static {}, Lo/brg;->b()Z

    move-result v0

    if-eqz v0, :cond_4

    .line 394
    const/4 v0, 0x1

    invoke-virtual {v3, v0}, Landroid/app/ActionBar;->setDisplayHomeAsUpEnabled(Z)V

    .line 396
    :cond_4
    iget-object v0, p0, Lcom/huawei/health/sns/ui/chat/photo/send/AlbumPicBrowserActivity;->C:Landroid/widget/TextView;

    sget v1, Lcom/huawei/android/sns/R$string;->sns_album_pic_browser_sigle_title:I

    invoke-virtual {p0, v1}, Lcom/huawei/health/sns/ui/chat/photo/send/AlbumPicBrowserActivity;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 397
    iget-object v0, p0, Lcom/huawei/health/sns/ui/chat/photo/send/AlbumPicBrowserActivity;->C:Landroid/widget/TextView;

    invoke-virtual {v0}, Landroid/widget/TextView;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    move-object v8, v0

    check-cast v8, Landroid/widget/RelativeLayout$LayoutParams;

    .line 398
    invoke-static {}, Lo/bom;->i()Z

    move-result v0

    if-eqz v0, :cond_5

    .line 399
    const/16 v0, 0xd

    const/4 v1, 0x0

    invoke-virtual {v8, v0, v1}, Landroid/widget/RelativeLayout$LayoutParams;->addRule(II)V

    .line 400
    const/16 v0, 0x9

    invoke-virtual {v8, v0}, Landroid/widget/RelativeLayout$LayoutParams;->addRule(I)V

    .line 401
    iget-object v0, p0, Lcom/huawei/health/sns/ui/chat/photo/send/AlbumPicBrowserActivity;->C:Landroid/widget/TextView;

    invoke-virtual {v0, v8}, Landroid/widget/TextView;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 405
    :cond_5
    :goto_0
    invoke-static {v3, v5}, Lo/bmm;->b(Landroid/app/ActionBar;Landroid/view/View;)V

    .line 432
    return-void
.end method

.method static synthetic e(Lcom/huawei/health/sns/ui/chat/photo/send/AlbumPicBrowserActivity;)V
    .locals 0

    .line 63
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/chat/photo/send/AlbumPicBrowserActivity;->h()V

    return-void
.end method

.method static synthetic e(Lcom/huawei/health/sns/ui/chat/photo/send/AlbumPicBrowserActivity;I)V
    .locals 0

    .line 63
    invoke-direct {p0, p1}, Lcom/huawei/health/sns/ui/chat/photo/send/AlbumPicBrowserActivity;->c(I)V

    return-void
.end method

.method static synthetic e(Lcom/huawei/health/sns/ui/chat/photo/send/AlbumPicBrowserActivity;Ljava/util/ArrayList;I)V
    .locals 0

    .line 63
    invoke-direct {p0, p1, p2}, Lcom/huawei/health/sns/ui/chat/photo/send/AlbumPicBrowserActivity;->d(Ljava/util/ArrayList;I)V

    return-void
.end method

.method private e(Z)V
    .locals 2

    .line 909
    if-eqz p1, :cond_1

    .line 910
    sget v0, Lcom/huawei/android/sns/R$anim;->sns_enter_animation:I

    invoke-static {p0, v0}, Landroid/view/animation/AnimationUtils;->loadAnimation(Landroid/content/Context;I)Landroid/view/animation/Animation;

    move-result-object v1

    .line 911
    if-eqz v1, :cond_0

    .line 912
    new-instance v0, Lcom/huawei/health/sns/ui/chat/photo/send/AlbumPicBrowserActivity$10;

    invoke-direct {v0, p0}, Lcom/huawei/health/sns/ui/chat/photo/send/AlbumPicBrowserActivity$10;-><init>(Lcom/huawei/health/sns/ui/chat/photo/send/AlbumPicBrowserActivity;)V

    invoke-virtual {v1, v0}, Landroid/view/animation/Animation;->setAnimationListener(Landroid/view/animation/Animation$AnimationListener;)V

    .line 934
    iget-object v0, p0, Lcom/huawei/health/sns/ui/chat/photo/send/AlbumPicBrowserActivity;->q:Lo/bdu;

    invoke-virtual {v0, v1}, Lo/bdu;->startAnimation(Landroid/view/animation/Animation;)V

    .line 936
    :cond_0
    goto :goto_0

    .line 937
    :cond_1
    sget v0, Lcom/huawei/android/sns/R$anim;->sns_exit_animation:I

    invoke-static {p0, v0}, Landroid/view/animation/AnimationUtils;->loadAnimation(Landroid/content/Context;I)Landroid/view/animation/Animation;

    move-result-object v1

    .line 938
    if-eqz v1, :cond_2

    .line 939
    new-instance v0, Lcom/huawei/health/sns/ui/chat/photo/send/AlbumPicBrowserActivity$7;

    invoke-direct {v0, p0}, Lcom/huawei/health/sns/ui/chat/photo/send/AlbumPicBrowserActivity$7;-><init>(Lcom/huawei/health/sns/ui/chat/photo/send/AlbumPicBrowserActivity;)V

    invoke-virtual {v1, v0}, Landroid/view/animation/Animation;->setAnimationListener(Landroid/view/animation/Animation$AnimationListener;)V

    .line 961
    iget-object v0, p0, Lcom/huawei/health/sns/ui/chat/photo/send/AlbumPicBrowserActivity;->q:Lo/bdu;

    invoke-virtual {v0, v1}, Lo/bdu;->startAnimation(Landroid/view/animation/Animation;)V

    .line 964
    :cond_2
    :goto_0
    return-void
.end method

.method static synthetic f(Lcom/huawei/health/sns/ui/chat/photo/send/AlbumPicBrowserActivity;)Z
    .locals 1

    .line 63
    iget-boolean v0, p0, Lcom/huawei/health/sns/ui/chat/photo/send/AlbumPicBrowserActivity;->A:Z

    return v0
.end method

.method private g()V
    .locals 2

    .line 438
    invoke-virtual {p0}, Lcom/huawei/health/sns/ui/chat/photo/send/AlbumPicBrowserActivity;->getActionBar()Landroid/app/ActionBar;

    move-result-object v1

    .line 439
    if-eqz v1, :cond_0

    .line 440
    const/4 v0, 0x1

    invoke-virtual {v1, v0}, Landroid/app/ActionBar;->setDisplayHomeAsUpEnabled(Z)V

    .line 442
    :cond_0
    return-void
.end method

.method static synthetic g(Lcom/huawei/health/sns/ui/chat/photo/send/AlbumPicBrowserActivity;)V
    .locals 0

    .line 63
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/chat/photo/send/AlbumPicBrowserActivity;->r()V

    return-void
.end method

.method static synthetic h(Lcom/huawei/health/sns/ui/chat/photo/send/AlbumPicBrowserActivity;)Lcom/huawei/health/sns/model/chat/Album;
    .locals 1

    .line 63
    iget-object v0, p0, Lcom/huawei/health/sns/ui/chat/photo/send/AlbumPicBrowserActivity;->o:Lcom/huawei/health/sns/model/chat/Album;

    return-object v0
.end method

.method private h()V
    .locals 1

    .line 490
    iget-object v0, p0, Lcom/huawei/health/sns/ui/chat/photo/send/AlbumPicBrowserActivity;->h:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-nez v0, :cond_1

    .line 491
    invoke-virtual {p0}, Lcom/huawei/health/sns/ui/chat/photo/send/AlbumPicBrowserActivity;->c()Z

    move-result v0

    if-nez v0, :cond_0

    .line 492
    sget v0, Lcom/huawei/android/sns/R$string;->sns_please_select_pic:I

    invoke-static {p0, v0}, Lo/brh;->c(Landroid/app/Activity;I)V

    .line 494
    :cond_0
    return-void

    .line 496
    :cond_1
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/chat/photo/send/AlbumPicBrowserActivity;->n()V

    .line 497
    return-void
.end method

.method static synthetic i(Lcom/huawei/health/sns/ui/chat/photo/send/AlbumPicBrowserActivity;)Lo/bdz;
    .locals 1

    .line 63
    iget-object v0, p0, Lcom/huawei/health/sns/ui/chat/photo/send/AlbumPicBrowserActivity;->p:Lo/bdz;

    return-object v0
.end method

.method private k()V
    .locals 1

    .line 466
    iget-object v0, p0, Lcom/huawei/health/sns/ui/chat/photo/send/AlbumPicBrowserActivity;->q:Lo/bdu;

    invoke-virtual {v0}, Lo/bdu;->getVisibility()I

    move-result v0

    if-nez v0, :cond_0

    .line 467
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/chat/photo/send/AlbumPicBrowserActivity;->s()V

    goto :goto_0

    .line 469
    :cond_0
    invoke-virtual {p0}, Lcom/huawei/health/sns/ui/chat/photo/send/AlbumPicBrowserActivity;->finish()V

    .line 471
    :goto_0
    return-void
.end method

.method static synthetic k(Lcom/huawei/health/sns/ui/chat/photo/send/AlbumPicBrowserActivity;)V
    .locals 0

    .line 63
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/chat/photo/send/AlbumPicBrowserActivity;->s()V

    return-void
.end method

.method private l()V
    .locals 6

    .line 669
    iget-object v0, p0, Lcom/huawei/health/sns/ui/chat/photo/send/AlbumPicBrowserActivity;->m:Lo/bdw;

    if-nez v0, :cond_0

    .line 670
    new-instance v0, Lo/bdw;

    iget-object v2, p0, Lcom/huawei/health/sns/ui/chat/photo/send/AlbumPicBrowserActivity;->o:Lcom/huawei/health/sns/model/chat/Album;

    iget-boolean v3, p0, Lcom/huawei/health/sns/ui/chat/photo/send/AlbumPicBrowserActivity;->A:Z

    iget-object v4, p0, Lcom/huawei/health/sns/ui/chat/photo/send/AlbumPicBrowserActivity;->G:Lo/bdw$a;

    iget v5, p0, Lcom/huawei/health/sns/ui/chat/photo/send/AlbumPicBrowserActivity;->k:I

    move-object v1, p0

    invoke-direct/range {v0 .. v5}, Lo/bdw;-><init>(Landroid/content/Context;Lcom/huawei/health/sns/model/chat/Album;ZLo/bdw$a;I)V

    iput-object v0, p0, Lcom/huawei/health/sns/ui/chat/photo/send/AlbumPicBrowserActivity;->m:Lo/bdw;

    goto :goto_0

    .line 672
    :cond_0
    iget-object v0, p0, Lcom/huawei/health/sns/ui/chat/photo/send/AlbumPicBrowserActivity;->m:Lo/bdw;

    iget-object v1, p0, Lcom/huawei/health/sns/ui/chat/photo/send/AlbumPicBrowserActivity;->o:Lcom/huawei/health/sns/model/chat/Album;

    invoke-virtual {v0, v1}, Lo/bdw;->e(Lcom/huawei/health/sns/model/chat/Album;)V

    .line 674
    :goto_0
    iget-object v0, p0, Lcom/huawei/health/sns/ui/chat/photo/send/AlbumPicBrowserActivity;->p:Lo/bdz;

    iget-object v1, p0, Lcom/huawei/health/sns/ui/chat/photo/send/AlbumPicBrowserActivity;->m:Lo/bdw;

    invoke-virtual {v0, v1}, Lo/bdz;->setAdapter(Landroid/widget/ListAdapter;)V

    .line 675
    iget-object v0, p0, Lcom/huawei/health/sns/ui/chat/photo/send/AlbumPicBrowserActivity;->p:Lo/bdz;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lo/bdz;->smoothScrollToPosition(I)V

    .line 676
    iget-object v0, p0, Lcom/huawei/health/sns/ui/chat/photo/send/AlbumPicBrowserActivity;->p:Lo/bdz;

    iget-object v1, p0, Lcom/huawei/health/sns/ui/chat/photo/send/AlbumPicBrowserActivity;->L:Landroid/widget/AdapterView$OnItemClickListener;

    invoke-virtual {v0, v1}, Lo/bdz;->setOnItemClickListener(Landroid/widget/AdapterView$OnItemClickListener;)V

    .line 677
    iget-object v0, p0, Lcom/huawei/health/sns/ui/chat/photo/send/AlbumPicBrowserActivity;->o:Lcom/huawei/health/sns/model/chat/Album;

    invoke-virtual {v0}, Lcom/huawei/health/sns/model/chat/Album;->getName()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/huawei/health/sns/ui/chat/photo/send/AlbumPicBrowserActivity;->b(Ljava/lang/String;)V

    .line 679
    iget-object v0, p0, Lcom/huawei/health/sns/ui/chat/photo/send/AlbumPicBrowserActivity;->v:Lo/bdx;

    iget-object v1, p0, Lcom/huawei/health/sns/ui/chat/photo/send/AlbumPicBrowserActivity;->p:Lo/bdz;

    invoke-virtual {v0, v1}, Lo/bdx;->setBlurredView(Landroid/view/View;)V

    .line 680
    iget-object v0, p0, Lcom/huawei/health/sns/ui/chat/photo/send/AlbumPicBrowserActivity;->v:Lo/bdx;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lo/bdx;->c(I)V

    .line 681
    iget-object v0, p0, Lcom/huawei/health/sns/ui/chat/photo/send/AlbumPicBrowserActivity;->p:Lo/bdz;

    new-instance v1, Lcom/huawei/health/sns/ui/chat/photo/send/AlbumPicBrowserActivity$e;

    const/4 v2, 0x0

    invoke-direct {v1, p0, v2}, Lcom/huawei/health/sns/ui/chat/photo/send/AlbumPicBrowserActivity$e;-><init>(Lcom/huawei/health/sns/ui/chat/photo/send/AlbumPicBrowserActivity;Lcom/huawei/health/sns/ui/chat/photo/send/AlbumPicBrowserActivity$4;)V

    invoke-virtual {v0, v1}, Lo/bdz;->setOnScrollListener(Landroid/widget/AbsListView$OnScrollListener;)V

    .line 682
    return-void
.end method

.method static synthetic m(Lcom/huawei/health/sns/ui/chat/photo/send/AlbumPicBrowserActivity;)Lo/bdx;
    .locals 1

    .line 63
    iget-object v0, p0, Lcom/huawei/health/sns/ui/chat/photo/send/AlbumPicBrowserActivity;->v:Lo/bdx;

    return-object v0
.end method

.method private m()V
    .locals 6

    .line 518
    sget v0, Lcom/huawei/android/sns/R$id;->data_view:I

    invoke-virtual {p0, v0}, Lcom/huawei/health/sns/ui/chat/photo/send/AlbumPicBrowserActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/health/sns/ui/chat/photo/send/AlbumPicBrowserActivity;->y:Landroid/view/View;

    .line 519
    sget v0, Lcom/huawei/android/sns/R$id;->no_data_view:I

    invoke-virtual {p0, v0}, Lcom/huawei/health/sns/ui/chat/photo/send/AlbumPicBrowserActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    iput-object v0, p0, Lcom/huawei/health/sns/ui/chat/photo/send/AlbumPicBrowserActivity;->z:Landroid/widget/LinearLayout;

    .line 520
    sget v0, Lcom/huawei/android/sns/R$id;->no_data_layout:I

    invoke-virtual {p0, v0}, Lcom/huawei/health/sns/ui/chat/photo/send/AlbumPicBrowserActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    iput-object v0, p0, Lcom/huawei/health/sns/ui/chat/photo/send/AlbumPicBrowserActivity;->c:Landroid/widget/LinearLayout;

    .line 522
    sget v0, Lcom/huawei/android/sns/R$id;->blur_view:I

    invoke-virtual {p0, v0}, Lcom/huawei/health/sns/ui/chat/photo/send/AlbumPicBrowserActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lo/bdx;

    iput-object v0, p0, Lcom/huawei/health/sns/ui/chat/photo/send/AlbumPicBrowserActivity;->v:Lo/bdx;

    .line 523
    invoke-static {p0}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v3

    .line 524
    sget v0, Lcom/huawei/android/sns/R$layout;->sns_album_pic_browser_footer:I

    const/4 v1, 0x0

    invoke-virtual {v3, v0, v1}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v4

    .line 525
    sget v0, Lcom/huawei/android/sns/R$id;->sns_album_listview:I

    invoke-virtual {p0, v0}, Lcom/huawei/health/sns/ui/chat/photo/send/AlbumPicBrowserActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lo/bdu;

    iput-object v0, p0, Lcom/huawei/health/sns/ui/chat/photo/send/AlbumPicBrowserActivity;->q:Lo/bdu;

    .line 526
    new-instance v0, Lo/bdt;

    const/4 v1, 0x0

    invoke-direct {v0, v1, p0}, Lo/bdt;-><init>(Ljava/util/List;Landroid/content/Context;)V

    iput-object v0, p0, Lcom/huawei/health/sns/ui/chat/photo/send/AlbumPicBrowserActivity;->t:Lo/bdt;

    .line 527
    iget-object v0, p0, Lcom/huawei/health/sns/ui/chat/photo/send/AlbumPicBrowserActivity;->q:Lo/bdu;

    iget-object v1, p0, Lcom/huawei/health/sns/ui/chat/photo/send/AlbumPicBrowserActivity;->t:Lo/bdt;

    invoke-virtual {v0, v1}, Lo/bdu;->setAdapter(Landroid/widget/ListAdapter;)V

    .line 528
    iget-object v0, p0, Lcom/huawei/health/sns/ui/chat/photo/send/AlbumPicBrowserActivity;->q:Lo/bdu;

    sget v1, Lcom/huawei/android/sns/R$color;->sns_background:I

    invoke-virtual {v0, v1}, Lo/bdu;->setBackgroundResource(I)V

    .line 529
    iget-object v0, p0, Lcom/huawei/health/sns/ui/chat/photo/send/AlbumPicBrowserActivity;->q:Lo/bdu;

    iget-object v1, p0, Lcom/huawei/health/sns/ui/chat/photo/send/AlbumPicBrowserActivity;->f:Landroid/widget/AdapterView$OnItemClickListener;

    invoke-virtual {v0, v1}, Lo/bdu;->setOnItemClickListener(Landroid/widget/AdapterView$OnItemClickListener;)V

    .line 530
    iget-object v0, p0, Lcom/huawei/health/sns/ui/chat/photo/send/AlbumPicBrowserActivity;->q:Lo/bdu;

    new-instance v1, Lcom/huawei/health/sns/ui/chat/photo/send/AlbumPicBrowserActivity$e;

    const/4 v2, 0x0

    invoke-direct {v1, p0, v2}, Lcom/huawei/health/sns/ui/chat/photo/send/AlbumPicBrowserActivity$e;-><init>(Lcom/huawei/health/sns/ui/chat/photo/send/AlbumPicBrowserActivity;Lcom/huawei/health/sns/ui/chat/photo/send/AlbumPicBrowserActivity$4;)V

    invoke-virtual {v0, v1}, Lo/bdu;->setOnScrollListener(Landroid/widget/AbsListView$OnScrollListener;)V

    .line 531
    iget-object v0, p0, Lcom/huawei/health/sns/ui/chat/photo/send/AlbumPicBrowserActivity;->q:Lo/bdu;

    new-instance v1, Lcom/huawei/health/sns/ui/chat/photo/send/AlbumPicBrowserActivity$c;

    const/4 v2, 0x0

    invoke-direct {v1, p0, v2}, Lcom/huawei/health/sns/ui/chat/photo/send/AlbumPicBrowserActivity$c;-><init>(Lcom/huawei/health/sns/ui/chat/photo/send/AlbumPicBrowserActivity;Lcom/huawei/health/sns/ui/chat/photo/send/AlbumPicBrowserActivity$4;)V

    invoke-virtual {v0, v1}, Lo/bdu;->setOnOverScrollListener(Lo/bec;)V

    .line 532
    iget-object v0, p0, Lcom/huawei/health/sns/ui/chat/photo/send/AlbumPicBrowserActivity;->q:Lo/bdu;

    invoke-virtual {v0, v4}, Lo/bdu;->addFooterView(Landroid/view/View;)V

    .line 534
    sget v0, Lcom/huawei/android/sns/R$layout;->sns_album_pic_browser_footer:I

    const/4 v1, 0x0

    invoke-virtual {v3, v0, v1}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v5

    .line 535
    sget v0, Lcom/huawei/android/sns/R$id;->sns_picture_gridview:I

    invoke-virtual {p0, v0}, Lcom/huawei/health/sns/ui/chat/photo/send/AlbumPicBrowserActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lo/bdz;

    iput-object v0, p0, Lcom/huawei/health/sns/ui/chat/photo/send/AlbumPicBrowserActivity;->p:Lo/bdz;

    .line 536
    iget-object v0, p0, Lcom/huawei/health/sns/ui/chat/photo/send/AlbumPicBrowserActivity;->p:Lo/bdz;

    invoke-virtual {v0, v5}, Lo/bdz;->b(Landroid/view/View;)V

    .line 537
    iget-object v0, p0, Lcom/huawei/health/sns/ui/chat/photo/send/AlbumPicBrowserActivity;->p:Lo/bdz;

    invoke-virtual {v0}, Lo/bdz;->getNumColumns()I

    move-result v0

    iput v0, p0, Lcom/huawei/health/sns/ui/chat/photo/send/AlbumPicBrowserActivity;->k:I

    .line 539
    sget v0, Lcom/huawei/android/sns/R$id;->rl_album_name:I

    invoke-virtual {p0, v0}, Lcom/huawei/health/sns/ui/chat/photo/send/AlbumPicBrowserActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/health/sns/ui/chat/photo/send/AlbumPicBrowserActivity;->l:Landroid/view/View;

    .line 540
    iget-object v0, p0, Lcom/huawei/health/sns/ui/chat/photo/send/AlbumPicBrowserActivity;->l:Landroid/view/View;

    invoke-virtual {v0, p0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 541
    sget v0, Lcom/huawei/android/sns/R$id;->rl_album_preview:I

    invoke-virtual {p0, v0}, Lcom/huawei/health/sns/ui/chat/photo/send/AlbumPicBrowserActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/health/sns/ui/chat/photo/send/AlbumPicBrowserActivity;->u:Landroid/view/View;

    .line 542
    iget-boolean v0, p0, Lcom/huawei/health/sns/ui/chat/photo/send/AlbumPicBrowserActivity;->A:Z

    if-eqz v0, :cond_0

    .line 543
    iget-object v0, p0, Lcom/huawei/health/sns/ui/chat/photo/send/AlbumPicBrowserActivity;->u:Landroid/view/View;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    goto :goto_0

    .line 545
    :cond_0
    iget-object v0, p0, Lcom/huawei/health/sns/ui/chat/photo/send/AlbumPicBrowserActivity;->u:Landroid/view/View;

    invoke-virtual {v0, p0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 547
    :goto_0
    sget v0, Lcom/huawei/android/sns/R$id;->rl_bottom_status_bar:I

    invoke-virtual {p0, v0}, Lcom/huawei/health/sns/ui/chat/photo/send/AlbumPicBrowserActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    iput-object v0, p0, Lcom/huawei/health/sns/ui/chat/photo/send/AlbumPicBrowserActivity;->x:Landroid/widget/LinearLayout;

    .line 548
    iget-object v0, p0, Lcom/huawei/health/sns/ui/chat/photo/send/AlbumPicBrowserActivity;->x:Landroid/widget/LinearLayout;

    invoke-virtual {v0, p0}, Landroid/widget/LinearLayout;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 549
    sget v0, Lcom/huawei/android/sns/R$id;->ll_loading_progress_layout:I

    invoke-virtual {p0, v0}, Lcom/huawei/health/sns/ui/chat/photo/send/AlbumPicBrowserActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/health/sns/ui/chat/photo/send/AlbumPicBrowserActivity;->r:Landroid/view/View;

    .line 551
    sget v0, Lcom/huawei/android/sns/R$id;->tv_current_album_name:I

    invoke-virtual {p0, v0}, Lcom/huawei/health/sns/ui/chat/photo/send/AlbumPicBrowserActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/huawei/health/sns/ui/chat/photo/send/AlbumPicBrowserActivity;->s:Landroid/widget/TextView;

    .line 552
    sget v0, Lcom/huawei/android/sns/R$id;->tv_preview:I

    invoke-virtual {p0, v0}, Lcom/huawei/health/sns/ui/chat/photo/send/AlbumPicBrowserActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/huawei/health/sns/ui/chat/photo/send/AlbumPicBrowserActivity;->w:Landroid/widget/TextView;

    .line 553
    iget-object v0, p0, Lcom/huawei/health/sns/ui/chat/photo/send/AlbumPicBrowserActivity;->w:Landroid/widget/TextView;

    invoke-virtual {v0, p0}, Landroid/widget/TextView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 554
    iget-object v0, p0, Lcom/huawei/health/sns/ui/chat/photo/send/AlbumPicBrowserActivity;->c:Landroid/widget/LinearLayout;

    invoke-static {v0, p0}, Lo/bph;->b(Landroid/widget/LinearLayout;Landroid/app/Activity;)V

    .line 555
    return-void
.end method

.method private n()V
    .locals 3

    .line 503
    new-instance v2, Landroid/content/Intent;

    invoke-direct {v2}, Landroid/content/Intent;-><init>()V

    .line 505
    const-string v0, "isSendOriginal"

    const/4 v1, 0x0

    invoke-virtual {v2, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Z)Landroid/content/Intent;

    .line 507
    const-string v0, "selectedList"

    iget-object v1, p0, Lcom/huawei/health/sns/ui/chat/photo/send/AlbumPicBrowserActivity;->h:Ljava/util/ArrayList;

    invoke-virtual {v2, v0, v1}, Landroid/content/Intent;->putIntegerArrayListExtra(Ljava/lang/String;Ljava/util/ArrayList;)Landroid/content/Intent;

    .line 509
    const-string v0, "isSend"

    const/4 v1, 0x1

    invoke-virtual {v2, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Z)Landroid/content/Intent;

    .line 510
    const/4 v0, -0x1

    invoke-virtual {p0, v0, v2}, Lcom/huawei/health/sns/ui/chat/photo/send/AlbumPicBrowserActivity;->setResult(ILandroid/content/Intent;)V

    .line 511
    invoke-virtual {p0}, Lcom/huawei/health/sns/ui/chat/photo/send/AlbumPicBrowserActivity;->finish()V

    .line 512
    return-void
.end method

.method static synthetic o(Lcom/huawei/health/sns/ui/chat/photo/send/AlbumPicBrowserActivity;)Lo/bdu;
    .locals 1

    .line 63
    iget-object v0, p0, Lcom/huawei/health/sns/ui/chat/photo/send/AlbumPicBrowserActivity;->q:Lo/bdu;

    return-object v0
.end method

.method private o()V
    .locals 4

    .line 714
    const/4 v0, 0x1

    invoke-direct {p0, v0}, Lcom/huawei/health/sns/ui/chat/photo/send/AlbumPicBrowserActivity;->b(Z)V

    .line 715
    const/4 v0, 0x1

    new-array v2, v0, [Ljava/lang/String;

    const-string v0, "android.permission.READ_EXTERNAL_STORAGE"

    const/4 v1, 0x0

    aput-object v0, v2, v1

    .line 716
    const/4 v3, 0x0

    .line 717
    invoke-static {}, Lo/brg;->c()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 718
    invoke-static {p0, v2}, Lo/biq;->a(Landroid/content/Context;[Ljava/lang/String;)Ljava/util/List;

    move-result-object v3

    .line 720
    :cond_0
    if-eqz v3, :cond_1

    invoke-interface {v3}, Ljava/util/List;->size()I

    move-result v0

    if-nez v0, :cond_2

    .line 721
    :cond_1
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/chat/photo/send/AlbumPicBrowserActivity;->q()V

    goto :goto_0

    .line 723
    .line 724
    :cond_2
    invoke-interface {v3}, Ljava/util/List;->size()I

    move-result v0

    new-array v0, v0, [Ljava/lang/String;

    invoke-interface {v3, v0}, Ljava/util/List;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Ljava/lang/String;

    .line 723
    const/4 v1, 0x1

    invoke-static {p0, v1, v0}, Lo/biq;->c(Landroid/app/Activity;I[Ljava/lang/String;)V

    .line 726
    :goto_0
    return-void
.end method

.method private p()V
    .locals 3

    .line 561
    iget-object v0, p0, Lcom/huawei/health/sns/ui/chat/photo/send/AlbumPicBrowserActivity;->h:Ljava/util/ArrayList;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    iget-object v0, p0, Lcom/huawei/health/sns/ui/chat/photo/send/AlbumPicBrowserActivity;->D:Landroid/widget/TextView;

    const/4 v1, 0x0

    if-ne v1, v0, :cond_1

    .line 562
    :cond_0
    const-string v0, "AlbumPicBrowserActivity"

    const-string v1, "updateSelectedNum got invalid value"

    invoke-static {v0, v1}, Lo/bpf;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 563
    return-void

    .line 565
    :cond_1
    iget-boolean v0, p0, Lcom/huawei/health/sns/ui/chat/photo/send/AlbumPicBrowserActivity;->A:Z

    if-eqz v0, :cond_2

    .line 566
    const-string v0, "AlbumPicBrowserActivity"

    const-string v1, "got invalid mod"

    invoke-static {v0, v1}, Lo/bpf;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 567
    return-void

    .line 569
    :cond_2
    iget-object v0, p0, Lcom/huawei/health/sns/ui/chat/photo/send/AlbumPicBrowserActivity;->h:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-lez v0, :cond_3

    .line 570
    iget-object v0, p0, Lcom/huawei/health/sns/ui/chat/photo/send/AlbumPicBrowserActivity;->C:Landroid/widget/TextView;

    sget v1, Lcom/huawei/android/sns/R$string;->sns_photo_chosed:I

    invoke-virtual {p0, v1}, Lcom/huawei/health/sns/ui/chat/photo/send/AlbumPicBrowserActivity;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 571
    iget-object v0, p0, Lcom/huawei/health/sns/ui/chat/photo/send/AlbumPicBrowserActivity;->D:Landroid/widget/TextView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 575
    iget-object v0, p0, Lcom/huawei/health/sns/ui/chat/photo/send/AlbumPicBrowserActivity;->D:Landroid/widget/TextView;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v2, p0, Lcom/huawei/health/sns/ui/chat/photo/send/AlbumPicBrowserActivity;->h:Ljava/util/ArrayList;

    .line 576
    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    move-result v2

    invoke-static {v2}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, "/"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const/16 v2, 0x9

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    goto :goto_0

    .line 578
    :cond_3
    iget-object v0, p0, Lcom/huawei/health/sns/ui/chat/photo/send/AlbumPicBrowserActivity;->C:Landroid/widget/TextView;

    sget v1, Lcom/huawei/android/sns/R$string;->sns_photo_unchosed:I

    invoke-virtual {p0, v1}, Lcom/huawei/health/sns/ui/chat/photo/send/AlbumPicBrowserActivity;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 579
    iget-object v0, p0, Lcom/huawei/health/sns/ui/chat/photo/send/AlbumPicBrowserActivity;->D:Landroid/widget/TextView;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 581
    :goto_0
    iget-object v0, p0, Lcom/huawei/health/sns/ui/chat/photo/send/AlbumPicBrowserActivity;->B:Landroid/view/View;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_4

    .line 582
    iget-object v0, p0, Lcom/huawei/health/sns/ui/chat/photo/send/AlbumPicBrowserActivity;->B:Landroid/view/View;

    iget-object v1, p0, Lcom/huawei/health/sns/ui/chat/photo/send/AlbumPicBrowserActivity;->D:Landroid/widget/TextView;

    invoke-virtual {v1}, Landroid/widget/TextView;->getVisibility()I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 584
    :cond_4
    return-void
.end method

.method private q()V
    .locals 2

    .line 729
    new-instance v0, Lo/arl;

    iget-object v1, p0, Lcom/huawei/health/sns/ui/chat/photo/send/AlbumPicBrowserActivity;->H:Landroid/os/Handler;

    invoke-direct {v0, p0, v1}, Lo/arl;-><init>(Landroid/content/Context;Landroid/os/Handler;)V

    const/16 v1, 0x35

    invoke-virtual {v0, v1}, Lo/arl;->b(I)V

    .line 730
    return-void
.end method

.method private r()V
    .locals 2

    .line 748
    iget-object v0, p0, Lcom/huawei/health/sns/ui/chat/photo/send/AlbumPicBrowserActivity;->q:Lo/bdu;

    iget v1, p0, Lcom/huawei/health/sns/ui/chat/photo/send/AlbumPicBrowserActivity;->n:I

    invoke-virtual {v0, v1}, Lo/bdu;->setSelection(I)V

    .line 749
    iget-object v0, p0, Lcom/huawei/health/sns/ui/chat/photo/send/AlbumPicBrowserActivity;->t:Lo/bdt;

    iget v1, p0, Lcom/huawei/health/sns/ui/chat/photo/send/AlbumPicBrowserActivity;->n:I

    invoke-virtual {v0, v1}, Lo/bdt;->a(I)V

    .line 750
    return-void
.end method

.method private s()V
    .locals 2

    .line 897
    iget-boolean v0, p0, Lcom/huawei/health/sns/ui/chat/photo/send/AlbumPicBrowserActivity;->g:Z

    if-nez v0, :cond_1

    .line 898
    iget-object v0, p0, Lcom/huawei/health/sns/ui/chat/photo/send/AlbumPicBrowserActivity;->q:Lo/bdu;

    invoke-virtual {v0}, Lo/bdu;->getVisibility()I

    move-result v0

    if-eqz v0, :cond_0

    const/4 v1, 0x1

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    .line 899
    :goto_0
    invoke-direct {p0, v1}, Lcom/huawei/health/sns/ui/chat/photo/send/AlbumPicBrowserActivity;->e(Z)V

    .line 901
    :cond_1
    return-void
.end method


# virtual methods
.method public a()V
    .locals 0

    .line 591
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/chat/photo/send/AlbumPicBrowserActivity;->p()V

    .line 610
    return-void
.end method

.method protected c()Z
    .locals 6

    .line 477
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v4

    .line 478
    iget-wide v0, p0, Lcom/huawei/health/sns/ui/chat/photo/send/AlbumPicBrowserActivity;->F:J

    sub-long v0, v4, v0

    invoke-static {v0, v1}, Ljava/lang/Math;->abs(J)J

    move-result-wide v0

    const-wide/16 v2, 0x7d0

    cmp-long v0, v0, v2

    if-gez v0, :cond_0

    .line 480
    const/4 v0, 0x1

    return v0

    .line 482
    :cond_0
    iput-wide v4, p0, Lcom/huawei/health/sns/ui/chat/photo/send/AlbumPicBrowserActivity;->F:J

    .line 483
    const/4 v0, 0x0

    return v0
.end method

.method public e(Lcom/huawei/health/sns/model/chat/Album;)V
    .locals 1

    .line 643
    iget-boolean v0, p0, Lcom/huawei/health/sns/ui/chat/photo/send/AlbumPicBrowserActivity;->j:Z

    if-eqz v0, :cond_0

    .line 644
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/health/sns/ui/chat/photo/send/AlbumPicBrowserActivity;->j:Z

    .line 645
    iget-object v0, p0, Lcom/huawei/health/sns/ui/chat/photo/send/AlbumPicBrowserActivity;->o:Lcom/huawei/health/sns/model/chat/Album;

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/huawei/health/sns/ui/chat/photo/send/AlbumPicBrowserActivity;->o:Lcom/huawei/health/sns/model/chat/Album;

    if-eq v0, p1, :cond_1

    .line 646
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/chat/photo/send/AlbumPicBrowserActivity;->l()V

    goto :goto_0

    .line 649
    :cond_0
    invoke-direct {p0, p1}, Lcom/huawei/health/sns/ui/chat/photo/send/AlbumPicBrowserActivity;->c(Lcom/huawei/health/sns/model/chat/Album;)V

    .line 651
    :cond_1
    :goto_0
    return-void
.end method

.method public onActivityResult(IILandroid/content/Intent;)V
    .locals 4

    .line 857
    const-string v0, "AlbumPicBrowserActivity"

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

    .line 859
    const/16 v0, 0x32

    if-ne p1, v0, :cond_3

    .line 860
    const/4 v0, -0x1

    if-ne p2, v0, :cond_2

    .line 861
    const-string v0, "selectedList"

    invoke-virtual {p3, v0}, Landroid/content/Intent;->getIntegerArrayListExtra(Ljava/lang/String;)Ljava/util/ArrayList;

    move-result-object v3

    .line 862
    if-eqz v3, :cond_1

    .line 863
    iget-object v0, p0, Lcom/huawei/health/sns/ui/chat/photo/send/AlbumPicBrowserActivity;->h:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    .line 864
    iget-object v0, p0, Lcom/huawei/health/sns/ui/chat/photo/send/AlbumPicBrowserActivity;->h:Ljava/util/ArrayList;

    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 865
    iget-object v0, p0, Lcom/huawei/health/sns/ui/chat/photo/send/AlbumPicBrowserActivity;->m:Lo/bdw;

    if-eqz v0, :cond_0

    .line 866
    iget-object v0, p0, Lcom/huawei/health/sns/ui/chat/photo/send/AlbumPicBrowserActivity;->m:Lo/bdw;

    invoke-virtual {v0}, Lo/bdw;->notifyDataSetChanged()V

    .line 868
    :cond_0
    invoke-virtual {p0}, Lcom/huawei/health/sns/ui/chat/photo/send/AlbumPicBrowserActivity;->a()V

    goto :goto_0

    .line 870
    :cond_1
    const-string v0, "AlbumPicBrowserActivity"

    const-string v1, "onActivityResult, and selectedList = null!!"

    invoke-static {v0, v1}, Lo/bpf;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 872
    :goto_0
    goto :goto_1

    :cond_2
    const/16 v0, 0x39

    if-ne p2, v0, :cond_3

    .line 873
    invoke-direct {p0, p3}, Lcom/huawei/health/sns/ui/chat/photo/send/AlbumPicBrowserActivity;->b(Landroid/content/Intent;)V

    .line 876
    :cond_3
    :goto_1
    invoke-super {p0, p1, p2, p3}, Lcom/huawei/health/sns/ui/base/SNSBaseActivity;->onActivityResult(IILandroid/content/Intent;)V

    .line 877
    return-void
.end method

.method public onClick(Landroid/view/View;)V
    .locals 3

    .line 968
    invoke-virtual {p1}, Landroid/view/View;->getId()I

    move-result v2

    .line 969
    sget v0, Lcom/huawei/android/sns/R$id;->rl_album_name:I

    if-ne v2, v0, :cond_0

    .line 970
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/chat/photo/send/AlbumPicBrowserActivity;->s()V

    goto :goto_0

    .line 971
    :cond_0
    sget v0, Lcom/huawei/android/sns/R$id;->rl_album_preview:I

    if-eq v2, v0, :cond_1

    sget v0, Lcom/huawei/android/sns/R$id;->tv_preview:I

    if-ne v2, v0, :cond_2

    .line 972
    :cond_1
    iget-object v0, p0, Lcom/huawei/health/sns/ui/chat/photo/send/AlbumPicBrowserActivity;->h:Ljava/util/ArrayList;

    if-eqz v0, :cond_2

    iget-object v0, p0, Lcom/huawei/health/sns/ui/chat/photo/send/AlbumPicBrowserActivity;->h:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-lez v0, :cond_2

    .line 973
    iget-object v0, p0, Lcom/huawei/health/sns/ui/chat/photo/send/AlbumPicBrowserActivity;->h:Ljava/util/ArrayList;

    const/4 v1, 0x0

    invoke-direct {p0, v0, v1}, Lcom/huawei/health/sns/ui/chat/photo/send/AlbumPicBrowserActivity;->d(Ljava/util/ArrayList;I)V

    .line 976
    :cond_2
    :goto_0
    return-void
.end method

.method public onConfigurationChanged(Landroid/content/res/Configuration;)V
    .locals 1

    .line 1055
    invoke-super {p0, p1}, Lcom/huawei/health/sns/ui/base/SNSBaseActivity;->onConfigurationChanged(Landroid/content/res/Configuration;)V

    .line 1056
    sget v0, Lcom/huawei/android/sns/R$layout;->sns_input_picture_browser_layout:I

    invoke-virtual {p0, v0}, Lcom/huawei/health/sns/ui/chat/photo/send/AlbumPicBrowserActivity;->setContentView(I)V

    .line 1057
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/huawei/health/sns/ui/chat/photo/send/AlbumPicBrowserActivity;->j:Z

    .line 1058
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/chat/photo/send/AlbumPicBrowserActivity;->m()V

    .line 1059
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/chat/photo/send/AlbumPicBrowserActivity;->o()V

    .line 1060
    return-void
.end method

.method public onCreate(Landroid/os/Bundle;)V
    .locals 1

    .line 268
    invoke-super {p0, p1}, Lcom/huawei/health/sns/ui/base/SNSBaseActivity;->onCreate(Landroid/os/Bundle;)V

    .line 269
    sget v0, Lcom/huawei/android/sns/R$layout;->sns_input_picture_browser_layout:I

    invoke-virtual {p0, v0}, Lcom/huawei/health/sns/ui/chat/photo/send/AlbumPicBrowserActivity;->setContentView(I)V

    .line 271
    invoke-virtual {p0}, Lcom/huawei/health/sns/ui/chat/photo/send/AlbumPicBrowserActivity;->getIntent()Landroid/content/Intent;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/huawei/health/sns/ui/chat/photo/send/AlbumPicBrowserActivity;->c(Landroid/content/Intent;)V

    .line 272
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/chat/photo/send/AlbumPicBrowserActivity;->m()V

    .line 273
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/chat/photo/send/AlbumPicBrowserActivity;->o()V

    .line 274
    return-void
.end method

.method public onDestroy()V
    .locals 1

    .line 881
    invoke-super {p0}, Lcom/huawei/health/sns/ui/base/SNSBaseActivity;->onDestroy()V

    .line 882
    iget-object v0, p0, Lcom/huawei/health/sns/ui/chat/photo/send/AlbumPicBrowserActivity;->h:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    .line 883
    return-void
.end method

.method public onKeyDown(ILandroid/view/KeyEvent;)Z
    .locals 2

    .line 837
    invoke-super {p0, p1, p2}, Lcom/huawei/health/sns/ui/base/SNSBaseActivity;->onKeyDown(ILandroid/view/KeyEvent;)Z

    .line 838
    invoke-virtual {p2}, Landroid/view/KeyEvent;->getKeyCode()I

    move-result v0

    const/4 v1, 0x4

    if-ne v0, v1, :cond_1

    .line 839
    iget-object v0, p0, Lcom/huawei/health/sns/ui/chat/photo/send/AlbumPicBrowserActivity;->q:Lo/bdu;

    invoke-virtual {v0}, Lo/bdu;->getVisibility()I

    move-result v0

    if-nez v0, :cond_0

    .line 840
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/chat/photo/send/AlbumPicBrowserActivity;->s()V

    .line 841
    const/4 v0, 0x0

    return v0

    .line 843
    :cond_0
    invoke-virtual {p0}, Lcom/huawei/health/sns/ui/chat/photo/send/AlbumPicBrowserActivity;->finish()V

    .line 846
    :cond_1
    const/4 v0, 0x0

    return v0
.end method

.method public onRequestPermissionsResult(I[Ljava/lang/String;[I)V
    .locals 1

    .line 734
    const/4 v0, 0x1

    if-ne p1, v0, :cond_1

    .line 735
    if-eqz p3, :cond_0

    invoke-static {p3}, Lo/biq;->d([I)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 736
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/chat/photo/send/AlbumPicBrowserActivity;->q()V

    .line 737
    invoke-static {}, Lo/bpk;->b()Lo/bpk;

    move-result-object v0

    invoke-virtual {v0}, Lo/bpk;->c()V

    goto :goto_0

    .line 739
    :cond_0
    invoke-virtual {p0}, Lcom/huawei/health/sns/ui/chat/photo/send/AlbumPicBrowserActivity;->finish()V

    .line 742
    :cond_1
    :goto_0
    return-void
.end method
