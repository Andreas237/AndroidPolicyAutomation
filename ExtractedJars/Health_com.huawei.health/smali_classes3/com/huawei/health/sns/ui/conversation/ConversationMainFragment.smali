.class public Lcom/huawei/health/sns/ui/conversation/ConversationMainFragment;
.super Landroid/support/v4/app/Fragment;
.source "SourceFile"

# interfaces
.implements Landroid/widget/SearchView$OnCloseListener;
.implements Landroid/widget/SearchView$OnQueryTextListener;
.implements Landroid/view/View$OnClickListener;
.implements Lo/bgb;
.implements Lo/bge;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/huawei/health/sns/ui/conversation/ConversationMainFragment$b;,
        Lcom/huawei/health/sns/ui/conversation/ConversationMainFragment$a;
    }
.end annotation


# instance fields
.field protected a:Landroid/os/Handler;

.field private b:Landroid/view/View;

.field protected c:Landroid/support/v4/app/Fragment;

.field public d:Lcom/huawei/health/sns/ui/conversation/ConversationFragment;

.field private e:Ljava/lang/String;

.field private f:Landroid/view/View;

.field private g:Landroid/widget/TextView;

.field private h:Landroid/widget/TextView;

.field private i:Landroid/view/View;

.field private k:Landroid/widget/ImageView;

.field private l:Z

.field private m:Z

.field private n:Landroid/widget/ImageView;

.field private o:Lcom/huawei/health/sns/ui/conversation/ConversationMainFragment$a;

.field private p:Z


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 77
    invoke-direct {p0}, Landroid/support/v4/app/Fragment;-><init>()V

    .line 114
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/health/sns/ui/conversation/ConversationMainFragment;->b:Landroid/view/View;

    .line 134
    const-string v0, ""

    iput-object v0, p0, Lcom/huawei/health/sns/ui/conversation/ConversationMainFragment;->e:Ljava/lang/String;

    .line 174
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/health/sns/ui/conversation/ConversationMainFragment;->d:Lcom/huawei/health/sns/ui/conversation/ConversationFragment;

    .line 199
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/health/sns/ui/conversation/ConversationMainFragment;->m:Z

    .line 204
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/health/sns/ui/conversation/ConversationMainFragment;->l:Z

    .line 214
    new-instance v0, Lcom/huawei/health/sns/ui/conversation/ConversationMainFragment$b;

    invoke-direct {v0, p0}, Lcom/huawei/health/sns/ui/conversation/ConversationMainFragment$b;-><init>(Lcom/huawei/health/sns/ui/conversation/ConversationMainFragment;)V

    iput-object v0, p0, Lcom/huawei/health/sns/ui/conversation/ConversationMainFragment;->a:Landroid/os/Handler;

    .line 219
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/health/sns/ui/conversation/ConversationMainFragment;->p:Z

    return-void
.end method

.method static synthetic a(Lcom/huawei/health/sns/ui/conversation/ConversationMainFragment;)V
    .locals 0

    .line 77
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/conversation/ConversationMainFragment;->l()V

    return-void
.end method

.method private static b(Landroid/os/Handler;)Lo/brc;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Landroid/os/Handler;)Lo/brc<Ljava/util/List<Lcom/huawei/health/sns/model/user/UserNotify;>;>;"
        }
    .end annotation

    .line 317
    new-instance v0, Lcom/huawei/health/sns/ui/conversation/ConversationMainFragment$1;

    invoke-direct {v0}, Lcom/huawei/health/sns/ui/conversation/ConversationMainFragment$1;-><init>()V

    return-object v0
.end method

.method private b(Landroid/os/Message;)V
    .locals 5

    .line 844
    iget-object v0, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    if-eqz v0, :cond_0

    iget-object v0, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    instance-of v0, v0, Landroid/os/Bundle;

    if-eqz v0, :cond_0

    .line 846
    iget-object v0, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    move-object v1, v0

    check-cast v1, Landroid/os/Bundle;

    .line 847
    const-string v0, "userId"

    invoke-virtual {v1, v0}, Landroid/os/Bundle;->getLong(Ljava/lang/String;)J

    move-result-wide v2

    .line 848
    const-string v0, "isDeleteConversation"

    invoke-virtual {v1, v0}, Landroid/os/Bundle;->getBoolean(Ljava/lang/String;)Z

    move-result v4

    .line 849
    if-eqz v4, :cond_0

    .line 851
    iget-object v0, p0, Lcom/huawei/health/sns/ui/conversation/ConversationMainFragment;->d:Lcom/huawei/health/sns/ui/conversation/ConversationFragment;

    invoke-virtual {v0, v2, v3}, Lcom/huawei/health/sns/ui/conversation/ConversationFragment;->a(J)V

    .line 854
    :cond_0
    return-void
.end method

.method private b(Landroid/view/View;)V
    .locals 2
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "NewApi"
        }
    .end annotation

    .line 464
    sget v0, Lcom/huawei/android/sns/R$id;->sns_check_network_layout:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/health/sns/ui/conversation/ConversationMainFragment;->i:Landroid/view/View;

    .line 466
    sget v0, Lcom/huawei/android/sns/R$id;->conversation_list_container:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/health/sns/ui/conversation/ConversationMainFragment;->f:Landroid/view/View;

    .line 468
    sget v0, Lcom/huawei/android/sns/R$id;->sns_icon_no_intent:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lcom/huawei/health/sns/ui/conversation/ConversationMainFragment;->k:Landroid/widget/ImageView;

    .line 469
    iget-object v0, p0, Lcom/huawei/health/sns/ui/conversation/ConversationMainFragment;->k:Landroid/widget/ImageView;

    invoke-virtual {v0, p0}, Landroid/widget/ImageView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 470
    sget v0, Lcom/huawei/android/sns/R$id;->sns_text_reconnect:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/huawei/health/sns/ui/conversation/ConversationMainFragment;->h:Landroid/widget/TextView;

    .line 471
    iget-object v0, p0, Lcom/huawei/health/sns/ui/conversation/ConversationMainFragment;->h:Landroid/widget/TextView;

    invoke-virtual {v0, p0}, Landroid/widget/TextView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 474
    sget v0, Lcom/huawei/android/sns/R$id;->btn_reconnect:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    invoke-virtual {v0, p0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 476
    sget v0, Lcom/huawei/android/sns/R$id;->sns_text_set_intent:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/huawei/health/sns/ui/conversation/ConversationMainFragment;->g:Landroid/widget/TextView;

    .line 477
    iget-object v0, p0, Lcom/huawei/health/sns/ui/conversation/ConversationMainFragment;->g:Landroid/widget/TextView;

    invoke-virtual {v0, p0}, Landroid/widget/TextView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 478
    sget v0, Lcom/huawei/android/sns/R$id;->sns_icon_set_net:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lcom/huawei/health/sns/ui/conversation/ConversationMainFragment;->n:Landroid/widget/ImageView;

    .line 479
    iget-object v0, p0, Lcom/huawei/health/sns/ui/conversation/ConversationMainFragment;->n:Landroid/widget/ImageView;

    invoke-virtual {v0, p0}, Landroid/widget/ImageView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 512
    sget v0, Lcom/huawei/android/sns/R$id;->scroll_view:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v1

    .line 513
    if-eqz v1, :cond_0

    .line 515
    const/4 v0, 0x2

    invoke-virtual {v1, v0}, Landroid/view/View;->setOverScrollMode(I)V

    .line 518
    :cond_0
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/conversation/ConversationMainFragment;->g()V

    .line 520
    invoke-virtual {p0}, Lcom/huawei/health/sns/ui/conversation/ConversationMainFragment;->b()V

    .line 521
    return-void
.end method

.method static synthetic b(Lcom/huawei/health/sns/ui/conversation/ConversationMainFragment;)V
    .locals 0

    .line 77
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/conversation/ConversationMainFragment;->n()V

    return-void
.end method

.method private static c(Landroid/os/Handler;)Lo/brc;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Landroid/os/Handler;)Lo/brc<Ljava/lang/Integer;>;"
        }
    .end annotation

    .line 420
    new-instance v0, Lcom/huawei/health/sns/ui/conversation/ConversationMainFragment$5;

    invoke-direct {v0}, Lcom/huawei/health/sns/ui/conversation/ConversationMainFragment$5;-><init>()V

    return-object v0
.end method

.method private c()V
    .locals 3

    .line 305
    invoke-static {}, Lo/brb;->d()Lo/brb;

    move-result-object v0

    invoke-static {}, Lcom/huawei/health/sns/ui/conversation/ConversationMainFragment;->h()Lo/brd;

    move-result-object v1

    .line 306
    const/4 v2, 0x0

    invoke-static {v2}, Lcom/huawei/health/sns/ui/conversation/ConversationMainFragment;->b(Landroid/os/Handler;)Lo/brc;

    move-result-object v2

    .line 305
    invoke-virtual {v0, v1, v2}, Lo/brb;->b(Lo/brd;Lo/brc;)Lo/bqy;

    .line 307
    return-void
.end method

.method static synthetic c(Lcom/huawei/health/sns/ui/conversation/ConversationMainFragment;)V
    .locals 0

    .line 77
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/conversation/ConversationMainFragment;->c()V

    return-void
.end method

.method static synthetic c(Lcom/huawei/health/sns/ui/conversation/ConversationMainFragment;Landroid/os/Message;)V
    .locals 0

    .line 77
    invoke-direct {p0, p1}, Lcom/huawei/health/sns/ui/conversation/ConversationMainFragment;->b(Landroid/os/Message;)V

    return-void
.end method

.method private c(Z)V
    .locals 0

    .line 431
    iput-boolean p1, p0, Lcom/huawei/health/sns/ui/conversation/ConversationMainFragment;->m:Z

    .line 432
    return-void
.end method

.method static synthetic d(Lcom/huawei/health/sns/ui/conversation/ConversationMainFragment;)V
    .locals 0

    .line 77
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/conversation/ConversationMainFragment;->f()V

    return-void
.end method

.method static synthetic d(Lcom/huawei/health/sns/ui/conversation/ConversationMainFragment;Z)V
    .locals 0

    .line 77
    invoke-direct {p0, p1}, Lcom/huawei/health/sns/ui/conversation/ConversationMainFragment;->c(Z)V

    return-void
.end method

.method static synthetic e(Lcom/huawei/health/sns/ui/conversation/ConversationMainFragment;)V
    .locals 0

    .line 77
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/conversation/ConversationMainFragment;->i()V

    return-void
.end method

.method private e(Ljava/lang/String;)V
    .locals 0

    .line 987
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/conversation/ConversationMainFragment;->k()V

    .line 989
    return-void
.end method

.method private f()V
    .locals 1

    .line 377
    new-instance v0, Lcom/huawei/health/sns/ui/conversation/ConversationMainFragment$2;

    invoke-direct {v0, p0}, Lcom/huawei/health/sns/ui/conversation/ConversationMainFragment$2;-><init>(Lcom/huawei/health/sns/ui/conversation/ConversationMainFragment;)V

    invoke-static {v0}, Lo/aty;->a(Lo/aud;)V

    .line 402
    return-void
.end method

.method private g()V
    .locals 9

    .line 528
    invoke-virtual {p0}, Lcom/huawei/health/sns/ui/conversation/ConversationMainFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v4

    .line 529
    invoke-static {v4}, Lo/bph;->e(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 531
    iget-object v0, p0, Lcom/huawei/health/sns/ui/conversation/ConversationMainFragment;->f:Landroid/view/View;

    invoke-static {v4, v0}, Lo/bph;->b(Landroid/app/Activity;Landroid/view/View;)V

    .line 532
    iget-object v0, p0, Lcom/huawei/health/sns/ui/conversation/ConversationMainFragment;->b:Landroid/view/View;

    sget v1, Lcom/huawei/android/sns/R$id;->search_layout:I

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    invoke-static {v4}, Lo/bph;->b(Landroid/content/Context;)Z

    move-result v1

    if-eqz v1, :cond_0

    const/16 v1, 0x8

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 535
    :cond_1
    iget-object v0, p0, Lcom/huawei/health/sns/ui/conversation/ConversationMainFragment;->b:Landroid/view/View;

    sget v1, Lcom/huawei/android/sns/R$id;->btn_reconnect:I

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    move-object v5, v0

    check-cast v5, Landroid/widget/TextView;

    .line 538
    invoke-static {}, Lo/bom;->i()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 540
    invoke-virtual {p0}, Lcom/huawei/health/sns/ui/conversation/ConversationMainFragment;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/android/sns/R$color;->sns_complain_notice_selector:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getColorStateList(I)Landroid/content/res/ColorStateList;

    move-result-object v0

    invoke-virtual {v5, v0}, Landroid/widget/TextView;->setTextColor(Landroid/content/res/ColorStateList;)V

    goto :goto_1

    .line 544
    :cond_2
    invoke-virtual {p0}, Lcom/huawei/health/sns/ui/conversation/ConversationMainFragment;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/android/sns/R$color;->sns_ya_lan:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getColor(I)I

    move-result v0

    invoke-virtual {v5, v0}, Landroid/widget/TextView;->setTextColor(I)V

    .line 547
    :goto_1
    iget-object v0, p0, Lcom/huawei/health/sns/ui/conversation/ConversationMainFragment;->b:Landroid/view/View;

    sget v1, Lcom/huawei/android/sns/R$id;->offline_imageView:I

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v6

    .line 548
    invoke-static {v4}, Lo/boi;->b(Landroid/app/Activity;)I

    move-result v7

    .line 549
    int-to-double v0, v7

    const-wide v2, 0x3fcd70a3d70a3d71L    # 0.23

    mul-double/2addr v0, v2

    double-to-int v0, v0

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-static {v6, v1, v0, v2, v3}, Lo/boi;->d(Landroid/view/View;IIII)V

    .line 551
    iget-object v0, p0, Lcom/huawei/health/sns/ui/conversation/ConversationMainFragment;->b:Landroid/view/View;

    sget v1, Lcom/huawei/android/sns/R$id;->scroll_view:I

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v8

    .line 552
    invoke-static {v4, v8}, Lo/bph;->b(Landroid/app/Activity;Landroid/view/View;)V

    .line 553
    return-void
.end method

.method static synthetic g(Lcom/huawei/health/sns/ui/conversation/ConversationMainFragment;)V
    .locals 0

    .line 77
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/conversation/ConversationMainFragment;->p()V

    return-void
.end method

.method private static h()Lo/brd;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()Lo/brd<Ljava/util/List<Lcom/huawei/health/sns/model/user/UserNotify;>;>;"
        }
    .end annotation

    .line 361
    new-instance v0, Lcom/huawei/health/sns/ui/conversation/ConversationMainFragment$3;

    invoke-direct {v0}, Lcom/huawei/health/sns/ui/conversation/ConversationMainFragment$3;-><init>()V

    return-object v0
.end method

.method private i()V
    .locals 3

    .line 410
    invoke-static {}, Lo/brb;->d()Lo/brb;

    move-result-object v0

    new-instance v1, Lo/awr;

    invoke-direct {v1}, Lo/awr;-><init>()V

    const/4 v2, 0x0

    invoke-static {v2}, Lcom/huawei/health/sns/ui/conversation/ConversationMainFragment;->c(Landroid/os/Handler;)Lo/brc;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lo/brb;->b(Lo/brd;Lo/brc;)Lo/bqy;

    .line 411
    return-void
.end method

.method private k()V
    .locals 4

    .line 735
    iget-object v0, p0, Lcom/huawei/health/sns/ui/conversation/ConversationMainFragment;->c:Landroid/support/v4/app/Fragment;

    iget-object v1, p0, Lcom/huawei/health/sns/ui/conversation/ConversationMainFragment;->d:Lcom/huawei/health/sns/ui/conversation/ConversationFragment;

    if-eq v0, v1, :cond_0

    .line 737
    invoke-virtual {p0}, Lcom/huawei/health/sns/ui/conversation/ConversationMainFragment;->getChildFragmentManager()Landroid/support/v4/app/FragmentManager;

    move-result-object v2

    .line 738
    invoke-virtual {v2}, Landroid/support/v4/app/FragmentManager;->beginTransaction()Landroid/support/v4/app/FragmentTransaction;

    move-result-object v3

    .line 740
    iget-object v0, p0, Lcom/huawei/health/sns/ui/conversation/ConversationMainFragment;->d:Lcom/huawei/health/sns/ui/conversation/ConversationFragment;

    invoke-virtual {v3, v0}, Landroid/support/v4/app/FragmentTransaction;->show(Landroid/support/v4/app/Fragment;)Landroid/support/v4/app/FragmentTransaction;

    move-result-object v0

    invoke-virtual {v0}, Landroid/support/v4/app/FragmentTransaction;->commitAllowingStateLoss()I

    .line 741
    iget-object v0, p0, Lcom/huawei/health/sns/ui/conversation/ConversationMainFragment;->d:Lcom/huawei/health/sns/ui/conversation/ConversationFragment;

    iput-object v0, p0, Lcom/huawei/health/sns/ui/conversation/ConversationMainFragment;->c:Landroid/support/v4/app/Fragment;

    .line 744
    :cond_0
    return-void
.end method

.method private l()V
    .locals 3

    .line 931
    iget-object v0, p0, Lcom/huawei/health/sns/ui/conversation/ConversationMainFragment;->h:Landroid/widget/TextView;

    if-eqz v0, :cond_0

    .line 933
    iget-object v0, p0, Lcom/huawei/health/sns/ui/conversation/ConversationMainFragment;->h:Landroid/widget/TextView;

    invoke-virtual {p0}, Lcom/huawei/health/sns/ui/conversation/ConversationMainFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v1

    invoke-virtual {v1}, Landroid/support/v4/app/FragmentActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/android/sns/R$string;->sns_connect_im_server_failed:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 934
    iget-object v0, p0, Lcom/huawei/health/sns/ui/conversation/ConversationMainFragment;->h:Landroid/widget/TextView;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setClickable(Z)V

    .line 936
    :cond_0
    iget-object v0, p0, Lcom/huawei/health/sns/ui/conversation/ConversationMainFragment;->k:Landroid/widget/ImageView;

    if-eqz v0, :cond_1

    .line 938
    iget-object v0, p0, Lcom/huawei/health/sns/ui/conversation/ConversationMainFragment;->k:Landroid/widget/ImageView;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setClickable(Z)V

    .line 940
    :cond_1
    iget-object v0, p0, Lcom/huawei/health/sns/ui/conversation/ConversationMainFragment;->g:Landroid/widget/TextView;

    if-eqz v0, :cond_2

    .line 942
    iget-object v0, p0, Lcom/huawei/health/sns/ui/conversation/ConversationMainFragment;->g:Landroid/widget/TextView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 944
    :cond_2
    iget-object v0, p0, Lcom/huawei/health/sns/ui/conversation/ConversationMainFragment;->n:Landroid/widget/ImageView;

    if-eqz v0, :cond_3

    .line 946
    iget-object v0, p0, Lcom/huawei/health/sns/ui/conversation/ConversationMainFragment;->n:Landroid/widget/ImageView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 948
    :cond_3
    iget-object v0, p0, Lcom/huawei/health/sns/ui/conversation/ConversationMainFragment;->i:Landroid/view/View;

    if-eqz v0, :cond_4

    .line 950
    iget-object v0, p0, Lcom/huawei/health/sns/ui/conversation/ConversationMainFragment;->i:Landroid/view/View;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 952
    :cond_4
    return-void
.end method

.method private n()V
    .locals 1

    .line 901
    iget-boolean v0, p0, Lcom/huawei/health/sns/ui/conversation/ConversationMainFragment;->p:Z

    if-eqz v0, :cond_0

    .line 903
    invoke-static {}, Lo/axj;->e()V

    .line 904
    invoke-static {}, Lo/auv;->b()V

    .line 906
    :cond_0
    return-void
.end method

.method private o()V
    .locals 4

    .line 913
    iget-object v0, p0, Lcom/huawei/health/sns/ui/conversation/ConversationMainFragment;->h:Landroid/widget/TextView;

    invoke-virtual {p0}, Lcom/huawei/health/sns/ui/conversation/ConversationMainFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v1

    invoke-virtual {v1}, Landroid/support/v4/app/FragmentActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/android/sns/R$string;->sns_network_connecting:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 914
    iget-object v0, p0, Lcom/huawei/health/sns/ui/conversation/ConversationMainFragment;->h:Landroid/widget/TextView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setClickable(Z)V

    .line 915
    iget-object v0, p0, Lcom/huawei/health/sns/ui/conversation/ConversationMainFragment;->k:Landroid/widget/ImageView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setClickable(Z)V

    .line 917
    iget-object v0, p0, Lcom/huawei/health/sns/ui/conversation/ConversationMainFragment;->g:Landroid/widget/TextView;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 918
    iget-object v0, p0, Lcom/huawei/health/sns/ui/conversation/ConversationMainFragment;->n:Landroid/widget/ImageView;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 920
    invoke-static {}, Lcom/huawei/health/sns/server/im/SNSIMCenter;->c()Lcom/huawei/health/sns/server/im/SNSIMCenter;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/health/sns/server/im/SNSIMCenter;->a()Z

    move-result v0

    if-nez v0, :cond_0

    .line 922
    iget-object v0, p0, Lcom/huawei/health/sns/ui/conversation/ConversationMainFragment;->a:Landroid/os/Handler;

    const/4 v1, 0x3

    const-wide/16 v2, 0x1f4

    invoke-virtual {v0, v1, v2, v3}, Landroid/os/Handler;->sendEmptyMessageDelayed(IJ)Z

    .line 924
    :cond_0
    return-void
.end method

.method private p()V
    .locals 3

    .line 861
    iget-object v0, p0, Lcom/huawei/health/sns/ui/conversation/ConversationMainFragment;->h:Landroid/widget/TextView;

    if-eqz v0, :cond_0

    .line 863
    iget-object v0, p0, Lcom/huawei/health/sns/ui/conversation/ConversationMainFragment;->h:Landroid/widget/TextView;

    invoke-virtual {p0}, Lcom/huawei/health/sns/ui/conversation/ConversationMainFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v1

    invoke-virtual {v1}, Landroid/support/v4/app/FragmentActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/android/sns/R$string;->sns_network_error_retry:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 864
    iget-object v0, p0, Lcom/huawei/health/sns/ui/conversation/ConversationMainFragment;->h:Landroid/widget/TextView;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setClickable(Z)V

    .line 867
    :cond_0
    iget-object v0, p0, Lcom/huawei/health/sns/ui/conversation/ConversationMainFragment;->k:Landroid/widget/ImageView;

    if-eqz v0, :cond_1

    .line 869
    iget-object v0, p0, Lcom/huawei/health/sns/ui/conversation/ConversationMainFragment;->k:Landroid/widget/ImageView;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setClickable(Z)V

    .line 871
    :cond_1
    iget-object v0, p0, Lcom/huawei/health/sns/ui/conversation/ConversationMainFragment;->g:Landroid/widget/TextView;

    if-eqz v0, :cond_2

    .line 873
    iget-object v0, p0, Lcom/huawei/health/sns/ui/conversation/ConversationMainFragment;->g:Landroid/widget/TextView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 875
    :cond_2
    iget-object v0, p0, Lcom/huawei/health/sns/ui/conversation/ConversationMainFragment;->n:Landroid/widget/ImageView;

    if-eqz v0, :cond_3

    .line 877
    iget-object v0, p0, Lcom/huawei/health/sns/ui/conversation/ConversationMainFragment;->n:Landroid/widget/ImageView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 879
    :cond_3
    iget-object v0, p0, Lcom/huawei/health/sns/ui/conversation/ConversationMainFragment;->i:Landroid/view/View;

    if-eqz v0, :cond_4

    .line 881
    iget-object v0, p0, Lcom/huawei/health/sns/ui/conversation/ConversationMainFragment;->i:Landroid/view/View;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 883
    :cond_4
    return-void
.end method


# virtual methods
.method public a(Z)V
    .locals 4

    .line 1079
    if-eqz p1, :cond_0

    .line 1082
    iget-object v0, p0, Lcom/huawei/health/sns/ui/conversation/ConversationMainFragment;->a:Landroid/os/Handler;

    const/4 v1, 0x3

    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeMessages(I)V

    .line 1083
    iget-object v0, p0, Lcom/huawei/health/sns/ui/conversation/ConversationMainFragment;->a:Landroid/os/Handler;

    const/4 v1, 0x2

    invoke-virtual {v0, v1}, Landroid/os/Handler;->sendEmptyMessage(I)Z

    goto :goto_0

    .line 1085
    :cond_0
    iget-boolean v0, p0, Lcom/huawei/health/sns/ui/conversation/ConversationMainFragment;->p:Z

    if-eqz v0, :cond_1

    .line 1089
    iget-object v0, p0, Lcom/huawei/health/sns/ui/conversation/ConversationMainFragment;->a:Landroid/os/Handler;

    const/4 v1, 0x3

    const-wide/16 v2, 0x7d0

    invoke-virtual {v0, v1, v2, v3}, Landroid/os/Handler;->sendEmptyMessageDelayed(IJ)Z

    .line 1091
    :cond_1
    :goto_0
    return-void
.end method

.method public a()Z
    .locals 1

    .line 1028
    iget-object v0, p0, Lcom/huawei/health/sns/ui/conversation/ConversationMainFragment;->e:Ljava/lang/String;

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 1030
    const/4 v0, 0x0

    return v0

    .line 1036
    :cond_0
    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lcom/huawei/health/sns/ui/conversation/ConversationMainFragment;->e(Ljava/lang/String;)V

    .line 1037
    const/4 v0, 0x1

    return v0
.end method

.method protected b()V
    .locals 6

    .line 664
    invoke-virtual {p0}, Lcom/huawei/health/sns/ui/conversation/ConversationMainFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    invoke-virtual {v0}, Landroid/support/v4/app/FragmentActivity;->getActionBar()Landroid/app/ActionBar;

    move-result-object v0

    sget v1, Lcom/huawei/android/sns/R$string;->sns_tab_message:I

    invoke-virtual {v0, v1}, Landroid/app/ActionBar;->setTitle(I)V

    .line 665
    invoke-virtual {p0}, Lcom/huawei/health/sns/ui/conversation/ConversationMainFragment;->getChildFragmentManager()Landroid/support/v4/app/FragmentManager;

    move-result-object v3

    .line 666
    invoke-virtual {v3}, Landroid/support/v4/app/FragmentManager;->beginTransaction()Landroid/support/v4/app/FragmentTransaction;

    move-result-object v4

    .line 668
    const-string v0, "conversationListFragmentTag"

    invoke-virtual {v3, v0}, Landroid/support/v4/app/FragmentManager;->findFragmentByTag(Ljava/lang/String;)Landroid/support/v4/app/Fragment;

    move-result-object v5

    .line 670
    if-eqz v5, :cond_0

    instance-of v0, v5, Lcom/huawei/health/sns/ui/conversation/ConversationFragment;

    if-eqz v0, :cond_0

    .line 672
    move-object v0, v5

    check-cast v0, Lcom/huawei/health/sns/ui/conversation/ConversationFragment;

    iput-object v0, p0, Lcom/huawei/health/sns/ui/conversation/ConversationMainFragment;->d:Lcom/huawei/health/sns/ui/conversation/ConversationFragment;

    goto :goto_0

    .line 676
    :cond_0
    new-instance v0, Lcom/huawei/health/sns/ui/conversation/ConversationFragment;

    invoke-direct {v0}, Lcom/huawei/health/sns/ui/conversation/ConversationFragment;-><init>()V

    iput-object v0, p0, Lcom/huawei/health/sns/ui/conversation/ConversationMainFragment;->d:Lcom/huawei/health/sns/ui/conversation/ConversationFragment;

    .line 677
    iget-object v0, p0, Lcom/huawei/health/sns/ui/conversation/ConversationMainFragment;->d:Lcom/huawei/health/sns/ui/conversation/ConversationFragment;

    invoke-virtual {v0, p0}, Lcom/huawei/health/sns/ui/conversation/ConversationFragment;->a(Lo/bgb;)V

    .line 680
    :goto_0
    iget-object v0, p0, Lcom/huawei/health/sns/ui/conversation/ConversationMainFragment;->d:Lcom/huawei/health/sns/ui/conversation/ConversationFragment;

    invoke-virtual {v0}, Lcom/huawei/health/sns/ui/conversation/ConversationFragment;->isAdded()Z

    move-result v0

    if-nez v0, :cond_1

    .line 682
    sget v0, Lcom/huawei/android/sns/R$id;->conversation_list_container:I

    iget-object v1, p0, Lcom/huawei/health/sns/ui/conversation/ConversationMainFragment;->d:Lcom/huawei/health/sns/ui/conversation/ConversationFragment;

    const-string v2, "conversationListFragmentTag"

    .line 683
    invoke-virtual {v4, v0, v1, v2}, Landroid/support/v4/app/FragmentTransaction;->add(ILandroid/support/v4/app/Fragment;Ljava/lang/String;)Landroid/support/v4/app/FragmentTransaction;

    .line 702
    :cond_1
    iget-object v0, p0, Lcom/huawei/health/sns/ui/conversation/ConversationMainFragment;->d:Lcom/huawei/health/sns/ui/conversation/ConversationFragment;

    invoke-virtual {v4, v0}, Landroid/support/v4/app/FragmentTransaction;->show(Landroid/support/v4/app/Fragment;)Landroid/support/v4/app/FragmentTransaction;

    move-result-object v0

    invoke-virtual {v0}, Landroid/support/v4/app/FragmentTransaction;->commitAllowingStateLoss()I

    .line 703
    iget-object v0, p0, Lcom/huawei/health/sns/ui/conversation/ConversationMainFragment;->d:Lcom/huawei/health/sns/ui/conversation/ConversationFragment;

    iput-object v0, p0, Lcom/huawei/health/sns/ui/conversation/ConversationMainFragment;->c:Landroid/support/v4/app/Fragment;

    .line 710
    return-void
.end method

.method public b(Landroid/view/View;Ljava/lang/String;)V
    .locals 4

    .line 749
    if-eqz p1, :cond_0

    invoke-static {p2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 751
    :cond_0
    return-void

    .line 753
    :cond_1
    invoke-static {p2}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v2

    .line 755
    const-string v0, "com.huawei.hwid"

    invoke-virtual {v2}, Landroid/net/Uri;->getHost()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 759
    :try_start_0
    new-instance v3, Landroid/content/Intent;

    const-string v0, "android.intent.action.VIEW"

    invoke-direct {v3, v0, v2}, Landroid/content/Intent;-><init>(Ljava/lang/String;Landroid/net/Uri;)V

    .line 760
    const-string v0, "android.intent.category.BROWSABLE"

    invoke-virtual {v3, v0}, Landroid/content/Intent;->addCategory(Ljava/lang/String;)Landroid/content/Intent;

    .line 761
    const-string v0, "android.intent.category.DEFAULT"

    invoke-virtual {v3, v0}, Landroid/content/Intent;->addCategory(Ljava/lang/String;)Landroid/content/Intent;

    .line 762
    invoke-virtual {p0, v3}, Lcom/huawei/health/sns/ui/conversation/ConversationMainFragment;->startActivity(Landroid/content/Intent;)V
    :try_end_0
    .catch Landroid/content/ActivityNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    .line 767
    goto :goto_0

    .line 764
    :catch_0
    move-exception v3

    .line 766
    const-string v0, "ConversationMainFragment"

    const-string v1, "ActivityNotFoundException, call modify password."

    invoke-static {v0, v1}, Lo/bpf;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 769
    :cond_2
    :goto_0
    return-void
.end method

.method public d()V
    .locals 11

    .line 601
    invoke-virtual {p0}, Lcom/huawei/health/sns/ui/conversation/ConversationMainFragment;->getView()Landroid/view/View;

    move-result-object v4

    .line 602
    if-nez v4, :cond_0

    .line 604
    return-void

    .line 607
    :cond_0
    new-instance v0, Lo/bca;

    invoke-direct {v0}, Lo/bca;-><init>()V

    invoke-virtual {v0}, Lo/bca;->e()[Ljava/lang/String;

    move-result-object v5

    .line 608
    new-instance v0, Lo/bca;

    invoke-direct {v0}, Lo/bca;-><init>()V

    invoke-virtual {v0}, Lo/bca;->d()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 610
    const-string v0, "ConversationMainFragment"

    const-string v1, "offline info not exist."

    invoke-static {v0, v1}, Lo/bpf;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 612
    sget v0, Lcom/huawei/android/sns/R$id;->scroll_view:I

    invoke-virtual {v4, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 613
    sget v0, Lcom/huawei/android/sns/R$id;->common_fragment_layout_id:I

    invoke-virtual {v4, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    goto/16 :goto_1

    .line 618
    :cond_1
    sget v0, Lcom/huawei/android/sns/R$id;->scroll_view:I

    invoke-virtual {v4, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 619
    sget v0, Lcom/huawei/android/sns/R$id;->common_fragment_layout_id:I

    invoke-virtual {v4, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 621
    sget v0, Lcom/huawei/android/sns/R$id;->offline_time_textView:I

    invoke-virtual {v4, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    move-object v6, v0

    check-cast v6, Landroid/widget/TextView;

    .line 622
    const/4 v0, 0x0

    aget-object v0, v5, v0

    invoke-static {v0}, Lo/bog;->b(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v6, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 628
    const/4 v0, 0x1

    aget-object v0, v5, v0

    sget-object v1, Ljava/util/Locale;->ENGLISH:Ljava/util/Locale;

    invoke-virtual {v0, v1}, Ljava/lang/String;->toUpperCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v7

    .line 629
    const-string v0, "LON-AL00-PD"

    invoke-virtual {v0, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 631
    const-string v7, "LON-AL00"

    goto :goto_0

    .line 633
    :cond_2
    const-string v0, "LON-L29-PD"

    invoke-virtual {v0, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 635
    const-string v7, "LON-L29"

    .line 639
    :cond_3
    :goto_0
    sget v0, Lcom/huawei/android/sns/R$id;->text_offline_layout:I

    invoke-virtual {v4, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    move-object v8, v0

    check-cast v8, Landroid/widget/TextView;

    .line 640
    const-string v9, "<a href=\"hwid://com.huawei.hwid/ModifyPassword\">"

    .line 641
    const-string v10, "</a>"

    .line 642
    sget v0, Lcom/huawei/android/sns/R$string;->sns_offline_message:I

    const/4 v1, 0x3

    new-array v1, v1, [Ljava/lang/Object;

    invoke-static {v7}, Lo/bny;->b(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object v9, v1, v2

    const/4 v2, 0x2

    aput-object v10, v1, v2

    invoke-virtual {p0, v0, v1}, Lcom/huawei/health/sns/ui/conversation/ConversationMainFragment;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v8, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 643
    invoke-static {v8, p0}, Lo/bnr;->d(Landroid/widget/TextView;Lo/bge;)V

    .line 645
    :goto_1
    return-void
.end method

.method public d(Z)V
    .locals 0

    .line 1070
    return-void
.end method

.method public e()V
    .locals 2

    .line 890
    iget-object v0, p0, Lcom/huawei/health/sns/ui/conversation/ConversationMainFragment;->i:Landroid/view/View;

    if-eqz v0, :cond_0

    .line 892
    iget-object v0, p0, Lcom/huawei/health/sns/ui/conversation/ConversationMainFragment;->i:Landroid/view/View;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 894
    :cond_0
    return-void
.end method

.method public e(Lcom/huawei/health/sns/ui/conversation/ConversationMainFragment$a;)V
    .locals 0

    .line 236
    iput-object p1, p0, Lcom/huawei/health/sns/ui/conversation/ConversationMainFragment;->o:Lcom/huawei/health/sns/ui/conversation/ConversationMainFragment$a;

    .line 237
    return-void
.end method

.method public onClick(Landroid/view/View;)V
    .locals 2

    .line 994
    invoke-virtual {p1}, Landroid/view/View;->getId()I

    move-result v1

    .line 995
    sget v0, Lcom/huawei/android/sns/R$id;->sns_text_reconnect:I

    if-eq v1, v0, :cond_0

    sget v0, Lcom/huawei/android/sns/R$id;->sns_icon_no_intent:I

    if-ne v1, v0, :cond_1

    .line 998
    :cond_0
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/conversation/ConversationMainFragment;->o()V

    goto :goto_0

    .line 1000
    :cond_1
    sget v0, Lcom/huawei/android/sns/R$id;->sns_text_set_intent:I

    if-eq v1, v0, :cond_2

    sget v0, Lcom/huawei/android/sns/R$id;->sns_icon_set_net:I

    if-ne v1, v0, :cond_3

    .line 1002
    :cond_2
    invoke-virtual {p0}, Lcom/huawei/health/sns/ui/conversation/ConversationMainFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    invoke-static {v0}, Lo/boc;->a(Landroid/content/Context;)V

    goto :goto_0

    .line 1004
    :cond_3
    sget v0, Lcom/huawei/android/sns/R$id;->btn_reconnect:I

    if-ne v1, v0, :cond_4

    .line 1007
    iget-object v0, p0, Lcom/huawei/health/sns/ui/conversation/ConversationMainFragment;->o:Lcom/huawei/health/sns/ui/conversation/ConversationMainFragment$a;

    if-eqz v0, :cond_4

    .line 1009
    iget-object v0, p0, Lcom/huawei/health/sns/ui/conversation/ConversationMainFragment;->o:Lcom/huawei/health/sns/ui/conversation/ConversationMainFragment$a;

    invoke-interface {v0}, Lcom/huawei/health/sns/ui/conversation/ConversationMainFragment$a;->b()V

    .line 1012
    :cond_4
    :goto_0
    return-void
.end method

.method public onClose()Z
    .locals 1

    .line 964
    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lcom/huawei/health/sns/ui/conversation/ConversationMainFragment;->e(Ljava/lang/String;)V

    .line 965
    const/4 v0, 0x1

    return v0
.end method

.method public onConfigurationChanged(Landroid/content/res/Configuration;)V
    .locals 1

    .line 1059
    invoke-super {p0, p1}, Landroid/support/v4/app/Fragment;->onConfigurationChanged(Landroid/content/res/Configuration;)V

    .line 1060
    iget-boolean v0, p0, Lcom/huawei/health/sns/ui/conversation/ConversationMainFragment;->m:Z

    if-eqz v0, :cond_0

    .line 1062
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/conversation/ConversationMainFragment;->p()V

    .line 1064
    :cond_0
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/conversation/ConversationMainFragment;->g()V

    .line 1065
    return-void
.end method

.method public onCreateView(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;
    .locals 4

    .line 270
    sget v0, Lcom/huawei/android/sns/R$layout;->sns_conversation_main_fragment:I

    const/4 v1, 0x0

    invoke-virtual {p1, v0, p2, v1}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/health/sns/ui/conversation/ConversationMainFragment;->b:Landroid/view/View;

    .line 271
    iget-object v0, p0, Lcom/huawei/health/sns/ui/conversation/ConversationMainFragment;->b:Landroid/view/View;

    invoke-direct {p0, v0}, Lcom/huawei/health/sns/ui/conversation/ConversationMainFragment;->b(Landroid/view/View;)V

    .line 272
    iget-object v0, p0, Lcom/huawei/health/sns/ui/conversation/ConversationMainFragment;->a:Landroid/os/Handler;

    const/4 v1, 0x5

    invoke-static {v1, v0}, Lo/apf;->a(ILandroid/os/Handler;)V

    .line 273
    invoke-virtual {p0}, Lcom/huawei/health/sns/ui/conversation/ConversationMainFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    invoke-static {v0}, Lo/bpl;->d(Landroid/content/Context;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 275
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/huawei/health/sns/ui/conversation/ConversationMainFragment;->m:Z

    .line 276
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/conversation/ConversationMainFragment;->p()V

    .line 279
    :cond_0
    iget-object v0, p0, Lcom/huawei/health/sns/ui/conversation/ConversationMainFragment;->a:Landroid/os/Handler;

    new-instance v1, Lcom/huawei/health/sns/ui/conversation/ConversationMainFragment$4;

    invoke-direct {v1, p0}, Lcom/huawei/health/sns/ui/conversation/ConversationMainFragment$4;-><init>(Lcom/huawei/health/sns/ui/conversation/ConversationMainFragment;)V

    const-wide/16 v2, 0xc8

    invoke-virtual {v0, v1, v2, v3}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 296
    iget-object v0, p0, Lcom/huawei/health/sns/ui/conversation/ConversationMainFragment;->b:Landroid/view/View;

    return-object v0
.end method

.method public onDestroy()V
    .locals 2

    .line 1017
    iget-object v0, p0, Lcom/huawei/health/sns/ui/conversation/ConversationMainFragment;->a:Landroid/os/Handler;

    const/4 v1, 0x5

    invoke-static {v1, v0}, Lo/apf;->c(ILandroid/os/Handler;)V

    .line 1018
    invoke-super {p0}, Landroid/support/v4/app/Fragment;->onDestroy()V

    .line 1019
    return-void
.end method

.method public onPause()V
    .locals 1

    .line 580
    invoke-super {p0}, Landroid/support/v4/app/Fragment;->onPause()V

    .line 581
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/health/sns/ui/conversation/ConversationMainFragment;->p:Z

    .line 582
    return-void
.end method

.method public onQueryTextChange(Ljava/lang/String;)Z
    .locals 1

    .line 971
    iput-object p1, p0, Lcom/huawei/health/sns/ui/conversation/ConversationMainFragment;->e:Ljava/lang/String;

    .line 972
    invoke-direct {p0, p1}, Lcom/huawei/health/sns/ui/conversation/ConversationMainFragment;->e(Ljava/lang/String;)V

    .line 973
    const/4 v0, 0x1

    return v0
.end method

.method public onQueryTextSubmit(Ljava/lang/String;)Z
    .locals 1

    .line 957
    invoke-direct {p0, p1}, Lcom/huawei/health/sns/ui/conversation/ConversationMainFragment;->e(Ljava/lang/String;)V

    .line 958
    const/4 v0, 0x1

    return v0
.end method

.method public onResume()V
    .locals 1

    .line 558
    invoke-super {p0}, Landroid/support/v4/app/Fragment;->onResume()V

    .line 559
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/huawei/health/sns/ui/conversation/ConversationMainFragment;->p:Z

    .line 566
    iget-boolean v0, p0, Lcom/huawei/health/sns/ui/conversation/ConversationMainFragment;->l:Z

    if-eqz v0, :cond_0

    .line 568
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/health/sns/ui/conversation/ConversationMainFragment;->l:Z

    goto :goto_0

    .line 573
    :cond_0
    invoke-virtual {p0}, Lcom/huawei/health/sns/ui/conversation/ConversationMainFragment;->d()V

    .line 575
    :goto_0
    return-void
.end method

.method public onViewCreated(Landroid/view/View;Landroid/os/Bundle;)V
    .locals 1

    .line 437
    invoke-super {p0, p1, p2}, Landroid/support/v4/app/Fragment;->onViewCreated(Landroid/view/View;Landroid/os/Bundle;)V

    .line 439
    invoke-virtual {p0}, Lcom/huawei/health/sns/ui/conversation/ConversationMainFragment;->d()V

    .line 440
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/huawei/health/sns/ui/conversation/ConversationMainFragment;->l:Z

    .line 442
    invoke-virtual {p0}, Lcom/huawei/health/sns/ui/conversation/ConversationMainFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    invoke-static {v0}, Lo/bny;->b(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-static {}, Lo/bom;->a()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 444
    const/high16 v0, 0x43340000    # 180.0f

    invoke-virtual {p1, v0}, Landroid/view/View;->setRotation(F)V

    .line 446
    :cond_0
    return-void
.end method
