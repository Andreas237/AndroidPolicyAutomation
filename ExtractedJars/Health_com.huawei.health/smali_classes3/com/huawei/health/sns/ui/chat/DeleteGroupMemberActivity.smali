.class public Lcom/huawei/health/sns/ui/chat/DeleteGroupMemberActivity;
.super Lcom/huawei/health/sns/ui/base/SNSBaseActivity;
.source "SourceFile"

# interfaces
.implements Landroid/widget/SearchView$OnCloseListener;
.implements Landroid/widget/SearchView$OnQueryTextListener;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/huawei/health/sns/ui/chat/DeleteGroupMemberActivity$a;,
        Lcom/huawei/health/sns/ui/chat/DeleteGroupMemberActivity$b;
    }
.end annotation


# instance fields
.field private f:Lcom/huawei/health/sns/model/group/Group;

.field private g:Landroid/widget/TextView;

.field protected h:Landroid/widget/SearchView;

.field private k:J

.field private l:Landroid/widget/ListView;

.field private m:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<Lcom/huawei/health/sns/model/group/GroupMember;>;"
        }
    .end annotation
.end field

.field private n:Lo/bdf;

.field private o:Landroid/view/View;

.field private p:Lo/bgn;

.field private q:Lo/bio;

.field private r:Landroid/os/Handler;

.field private s:Landroid/view/View$OnClickListener;

.field private t:Z

.field private u:Landroid/view/View$OnClickListener;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 65
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/base/SNSBaseActivity;-><init>()V

    .line 138
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/health/sns/ui/chat/DeleteGroupMemberActivity;->m:Ljava/util/ArrayList;

    .line 148
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/health/sns/ui/chat/DeleteGroupMemberActivity;->t:Z

    .line 158
    new-instance v0, Lcom/huawei/health/sns/ui/chat/DeleteGroupMemberActivity$b;

    invoke-direct {v0, p0}, Lcom/huawei/health/sns/ui/chat/DeleteGroupMemberActivity$b;-><init>(Lcom/huawei/health/sns/ui/chat/DeleteGroupMemberActivity;)V

    iput-object v0, p0, Lcom/huawei/health/sns/ui/chat/DeleteGroupMemberActivity;->r:Landroid/os/Handler;

    .line 460
    new-instance v0, Lcom/huawei/health/sns/ui/chat/DeleteGroupMemberActivity$4;

    invoke-direct {v0, p0}, Lcom/huawei/health/sns/ui/chat/DeleteGroupMemberActivity$4;-><init>(Lcom/huawei/health/sns/ui/chat/DeleteGroupMemberActivity;)V

    iput-object v0, p0, Lcom/huawei/health/sns/ui/chat/DeleteGroupMemberActivity;->s:Landroid/view/View$OnClickListener;

    .line 471
    new-instance v0, Lcom/huawei/health/sns/ui/chat/DeleteGroupMemberActivity$1;

    invoke-direct {v0, p0}, Lcom/huawei/health/sns/ui/chat/DeleteGroupMemberActivity$1;-><init>(Lcom/huawei/health/sns/ui/chat/DeleteGroupMemberActivity;)V

    iput-object v0, p0, Lcom/huawei/health/sns/ui/chat/DeleteGroupMemberActivity;->u:Landroid/view/View$OnClickListener;

    return-void
.end method

.method private a()V
    .locals 2

    .line 276
    sget v0, Lcom/huawei/android/sns/R$id;->search_view:I

    invoke-virtual {p0, v0}, Lcom/huawei/health/sns/ui/chat/DeleteGroupMemberActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/SearchView;

    iput-object v0, p0, Lcom/huawei/health/sns/ui/chat/DeleteGroupMemberActivity;->h:Landroid/widget/SearchView;

    .line 277
    iget-object v0, p0, Lcom/huawei/health/sns/ui/chat/DeleteGroupMemberActivity;->h:Landroid/widget/SearchView;

    invoke-virtual {v0}, Landroid/widget/SearchView;->onActionViewExpanded()V

    .line 278
    iget-object v0, p0, Lcom/huawei/health/sns/ui/chat/DeleteGroupMemberActivity;->h:Landroid/widget/SearchView;

    sget v1, Lcom/huawei/android/sns/R$string;->sns_local_search:I

    invoke-virtual {p0, v1}, Lcom/huawei/health/sns/ui/chat/DeleteGroupMemberActivity;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/SearchView;->setQueryHint(Ljava/lang/CharSequence;)V

    .line 279
    iget-object v0, p0, Lcom/huawei/health/sns/ui/chat/DeleteGroupMemberActivity;->h:Landroid/widget/SearchView;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/widget/SearchView;->setIconifiedByDefault(Z)V

    .line 280
    iget-object v0, p0, Lcom/huawei/health/sns/ui/chat/DeleteGroupMemberActivity;->h:Landroid/widget/SearchView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/SearchView;->setSubmitButtonEnabled(Z)V

    .line 281
    iget-object v0, p0, Lcom/huawei/health/sns/ui/chat/DeleteGroupMemberActivity;->h:Landroid/widget/SearchView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/SearchView;->setIconified(Z)V

    .line 282
    iget-object v0, p0, Lcom/huawei/health/sns/ui/chat/DeleteGroupMemberActivity;->h:Landroid/widget/SearchView;

    invoke-virtual {v0, p0}, Landroid/widget/SearchView;->setOnQueryTextListener(Landroid/widget/SearchView$OnQueryTextListener;)V

    .line 283
    iget-object v0, p0, Lcom/huawei/health/sns/ui/chat/DeleteGroupMemberActivity;->h:Landroid/widget/SearchView;

    invoke-virtual {v0, p0}, Landroid/widget/SearchView;->setOnCloseListener(Landroid/widget/SearchView$OnCloseListener;)V

    .line 284
    iget-object v0, p0, Lcom/huawei/health/sns/ui/chat/DeleteGroupMemberActivity;->h:Landroid/widget/SearchView;

    new-instance v1, Lcom/huawei/health/sns/ui/chat/DeleteGroupMemberActivity$2;

    invoke-direct {v1, p0}, Lcom/huawei/health/sns/ui/chat/DeleteGroupMemberActivity$2;-><init>(Lcom/huawei/health/sns/ui/chat/DeleteGroupMemberActivity;)V

    invoke-virtual {v0, v1}, Landroid/widget/SearchView;->setOnQueryTextFocusChangeListener(Landroid/view/View$OnFocusChangeListener;)V

    .line 304
    iget-object v0, p0, Lcom/huawei/health/sns/ui/chat/DeleteGroupMemberActivity;->h:Landroid/widget/SearchView;

    invoke-virtual {v0}, Landroid/widget/SearchView;->clearFocus()V

    .line 306
    iget-object v0, p0, Lcom/huawei/health/sns/ui/chat/DeleteGroupMemberActivity;->h:Landroid/widget/SearchView;

    invoke-static {v0}, Lo/bmo;->b(Landroid/widget/SearchView;)V

    .line 307
    return-void
.end method

.method private a(Landroid/os/Message;)V
    .locals 3

    .line 624
    invoke-virtual {p1}, Landroid/os/Message;->getData()Landroid/os/Bundle;

    move-result-object v1

    .line 625
    const/4 v2, 0x0

    .line 626
    if-eqz v1, :cond_1

    .line 628
    const-string v0, "keySearchGroupMemberMatchList"

    invoke-virtual {v1, v0}, Landroid/os/Bundle;->getParcelableArrayList(Ljava/lang/String;)Ljava/util/ArrayList;

    move-result-object v2

    .line 629
    if-eqz v2, :cond_0

    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-lez v0, :cond_0

    .line 631
    invoke-direct {p0, v2}, Lcom/huawei/health/sns/ui/chat/DeleteGroupMemberActivity;->c(Ljava/util/ArrayList;)V

    goto :goto_0

    .line 635
    :cond_0
    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lcom/huawei/health/sns/ui/chat/DeleteGroupMemberActivity;->c(Z)V

    .line 638
    :cond_1
    :goto_0
    return-void
.end method

.method static synthetic a(Lcom/huawei/health/sns/ui/chat/DeleteGroupMemberActivity;)V
    .locals 0

    .line 65
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/chat/DeleteGroupMemberActivity;->l()V

    return-void
.end method

.method static synthetic a(Lcom/huawei/health/sns/ui/chat/DeleteGroupMemberActivity;Landroid/widget/CheckBox;I)V
    .locals 0

    .line 65
    invoke-direct {p0, p1, p2}, Lcom/huawei/health/sns/ui/chat/DeleteGroupMemberActivity;->e(Landroid/widget/CheckBox;I)V

    return-void
.end method

.method static synthetic a(Lcom/huawei/health/sns/ui/chat/DeleteGroupMemberActivity;Ljava/lang/Object;)V
    .locals 0

    .line 65
    invoke-direct {p0, p1}, Lcom/huawei/health/sns/ui/chat/DeleteGroupMemberActivity;->e(Ljava/lang/Object;)V

    return-void
.end method

.method private a(Ljava/lang/String;)V
    .locals 2

    .line 658
    if-eqz p1, :cond_0

    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 660
    invoke-direct {p0, p1}, Lcom/huawei/health/sns/ui/chat/DeleteGroupMemberActivity;->c(Ljava/lang/String;)V

    .line 661
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/huawei/health/sns/ui/chat/DeleteGroupMemberActivity;->t:Z

    goto :goto_0

    .line 665
    :cond_0
    iget-object v0, p0, Lcom/huawei/health/sns/ui/chat/DeleteGroupMemberActivity;->n:Lo/bdf;

    iget-object v1, p0, Lcom/huawei/health/sns/ui/chat/DeleteGroupMemberActivity;->m:Ljava/util/ArrayList;

    invoke-virtual {v0, v1}, Lo/bdf;->b(Ljava/util/ArrayList;)V

    .line 666
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/health/sns/ui/chat/DeleteGroupMemberActivity;->t:Z

    .line 668
    :goto_0
    return-void
.end method

.method static synthetic b(Lcom/huawei/health/sns/ui/chat/DeleteGroupMemberActivity;)J
    .locals 2

    .line 65
    iget-wide v0, p0, Lcom/huawei/health/sns/ui/chat/DeleteGroupMemberActivity;->k:J

    return-wide v0
.end method

.method private b()V
    .locals 6

    .line 315
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/chat/DeleteGroupMemberActivity;->a()V

    .line 317
    sget v0, Lcom/huawei/android/sns/R$id;->no_data_layout:I

    invoke-virtual {p0, v0}, Lcom/huawei/health/sns/ui/chat/DeleteGroupMemberActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    iput-object v0, p0, Lcom/huawei/health/sns/ui/chat/DeleteGroupMemberActivity;->c:Landroid/widget/LinearLayout;

    .line 318
    sget v0, Lcom/huawei/android/sns/R$id;->no_data_icon:I

    invoke-virtual {p0, v0}, Lcom/huawei/health/sns/ui/chat/DeleteGroupMemberActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lcom/huawei/health/sns/ui/chat/DeleteGroupMemberActivity;->e:Landroid/widget/ImageView;

    .line 319
    iget-object v0, p0, Lcom/huawei/health/sns/ui/chat/DeleteGroupMemberActivity;->c:Landroid/widget/LinearLayout;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 320
    iget-object v0, p0, Lcom/huawei/health/sns/ui/chat/DeleteGroupMemberActivity;->c:Landroid/widget/LinearLayout;

    iget-object v1, p0, Lcom/huawei/health/sns/ui/chat/DeleteGroupMemberActivity;->e:Landroid/widget/ImageView;

    const/4 v2, 0x1

    invoke-static {v0, v1, p0, v2}, Lo/bph;->c(Landroid/widget/LinearLayout;Landroid/widget/ImageView;Landroid/app/Activity;Z)V

    .line 322
    sget v0, Lcom/huawei/android/sns/R$id;->list_groupMenber:I

    invoke-virtual {p0, v0}, Lcom/huawei/health/sns/ui/chat/DeleteGroupMemberActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ListView;

    iput-object v0, p0, Lcom/huawei/health/sns/ui/chat/DeleteGroupMemberActivity;->l:Landroid/widget/ListView;

    .line 323
    invoke-static {}, Lo/aoq;->e()Lo/aoq;

    move-result-object v0

    invoke-virtual {v0}, Lo/aoq;->a()J

    move-result-wide v3

    .line 324
    const/4 v0, 0x1

    new-array v5, v0, [J

    .line 325
    const/4 v0, 0x0

    aput-wide v3, v5, v0

    .line 326
    new-instance v0, Lo/bdf;

    iget-object v1, p0, Lcom/huawei/health/sns/ui/chat/DeleteGroupMemberActivity;->m:Ljava/util/ArrayList;

    invoke-direct {v0, p0, v1}, Lo/bdf;-><init>(Landroid/content/Context;Ljava/util/ArrayList;)V

    iput-object v0, p0, Lcom/huawei/health/sns/ui/chat/DeleteGroupMemberActivity;->n:Lo/bdf;

    .line 327
    iget-object v0, p0, Lcom/huawei/health/sns/ui/chat/DeleteGroupMemberActivity;->n:Lo/bdf;

    invoke-virtual {v0, v5}, Lo/bdf;->e([J)V

    .line 329
    iget-object v0, p0, Lcom/huawei/health/sns/ui/chat/DeleteGroupMemberActivity;->l:Landroid/widget/ListView;

    iget-object v1, p0, Lcom/huawei/health/sns/ui/chat/DeleteGroupMemberActivity;->n:Lo/bdf;

    invoke-virtual {v0, v1}, Landroid/widget/ListView;->setAdapter(Landroid/widget/ListAdapter;)V

    .line 330
    iget-object v0, p0, Lcom/huawei/health/sns/ui/chat/DeleteGroupMemberActivity;->l:Landroid/widget/ListView;

    new-instance v1, Lcom/huawei/health/sns/ui/chat/DeleteGroupMemberActivity$3;

    invoke-direct {v1, p0}, Lcom/huawei/health/sns/ui/chat/DeleteGroupMemberActivity$3;-><init>(Lcom/huawei/health/sns/ui/chat/DeleteGroupMemberActivity;)V

    invoke-virtual {v0, v1}, Landroid/widget/ListView;->setOnItemClickListener(Landroid/widget/AdapterView$OnItemClickListener;)V

    .line 345
    return-void
.end method

.method private b(Landroid/os/Message;)V
    .locals 3

    .line 752
    invoke-virtual {p1}, Landroid/os/Message;->getData()Landroid/os/Bundle;

    move-result-object v1

    .line 753
    if-eqz v1, :cond_0

    .line 755
    const-string v0, "bundle_key_group"

    invoke-virtual {v1, v0}, Landroid/os/Bundle;->getParcelable(Ljava/lang/String;)Landroid/os/Parcelable;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Lcom/huawei/health/sns/model/group/Group;

    .line 756
    if-eqz v2, :cond_0

    .line 758
    invoke-direct {p0, v2}, Lcom/huawei/health/sns/ui/chat/DeleteGroupMemberActivity;->b(Lcom/huawei/health/sns/model/group/Group;)V

    .line 759
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/chat/DeleteGroupMemberActivity;->m()V

    .line 762
    :cond_0
    return-void
.end method

.method private b(Lcom/huawei/health/sns/model/group/Group;)V
    .locals 0

    .line 771
    iput-object p1, p0, Lcom/huawei/health/sns/ui/chat/DeleteGroupMemberActivity;->f:Lcom/huawei/health/sns/model/group/Group;

    .line 772
    return-void
.end method

.method static synthetic b(Lcom/huawei/health/sns/ui/chat/DeleteGroupMemberActivity;Landroid/os/Message;)V
    .locals 0

    .line 65
    invoke-direct {p0, p1}, Lcom/huawei/health/sns/ui/chat/DeleteGroupMemberActivity;->a(Landroid/os/Message;)V

    return-void
.end method

.method static synthetic b(Lcom/huawei/health/sns/ui/chat/DeleteGroupMemberActivity;Lcom/huawei/health/sns/model/group/Group;)V
    .locals 0

    .line 65
    invoke-direct {p0, p1}, Lcom/huawei/health/sns/ui/chat/DeleteGroupMemberActivity;->d(Lcom/huawei/health/sns/model/group/Group;)V

    return-void
.end method

.method private c()V
    .locals 7
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "ResourceAsColor",
            "InflateParams"
        }
    .end annotation

    .line 376
    invoke-virtual {p0}, Lcom/huawei/health/sns/ui/chat/DeleteGroupMemberActivity;->getActionBar()Landroid/app/ActionBar;

    move-result-object v3

    .line 377
    invoke-static {p0}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v4

    .line 379
    invoke-static {}, Lo/bom;->i()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 381
    sget v0, Lcom/huawei/android/sns/R$layout;->sns_friendselector_actionbar_customtitle_for_emuifive:I

    const/4 v1, 0x0

    const/4 v2, 0x0

    invoke-virtual {v4, v0, v1, v2}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object v0

    move-object v5, v0

    check-cast v5, Landroid/widget/RelativeLayout;

    .line 382
    sget v0, Lcom/huawei/android/sns/R$id;->sns_friend_selector_bg:I

    invoke-virtual {v5, v0}, Landroid/widget/RelativeLayout;->findViewById(I)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/health/sns/ui/chat/DeleteGroupMemberActivity;->o:Landroid/view/View;

    goto :goto_0

    .line 386
    :cond_0
    sget v0, Lcom/huawei/android/sns/R$layout;->sns_friendselector_actionbar_customtitle:I

    const/4 v1, 0x0

    const/4 v2, 0x0

    invoke-virtual {v4, v0, v1, v2}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object v0

    move-object v5, v0

    check-cast v5, Landroid/widget/RelativeLayout;

    .line 389
    :goto_0
    sget v0, Lcom/huawei/android/sns/R$id;->sns_friend_selector_num:I

    invoke-virtual {v5, v0}, Landroid/widget/RelativeLayout;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/huawei/health/sns/ui/chat/DeleteGroupMemberActivity;->g:Landroid/widget/TextView;

    .line 390
    sget v0, Lcom/huawei/android/sns/R$id;->sns_friend_selector_text:I

    invoke-virtual {v5, v0}, Landroid/widget/RelativeLayout;->findViewById(I)Landroid/view/View;

    move-result-object v0

    move-object v6, v0

    check-cast v6, Landroid/widget/TextView;

    .line 391
    sget v0, Lcom/huawei/android/sns/R$string;->sns_group_delete_member:I

    invoke-virtual {v6, v0}, Landroid/widget/TextView;->setText(I)V

    .line 392
    invoke-static {v3, v5}, Lo/bmm;->b(Landroid/app/ActionBar;Landroid/view/View;)V

    .line 393
    iget-object v0, p0, Lcom/huawei/health/sns/ui/chat/DeleteGroupMemberActivity;->s:Landroid/view/View$OnClickListener;

    const/4 v1, 0x1

    const/4 v2, 0x0

    invoke-static {v3, v1, v2, v0}, Lo/bmm;->a(Landroid/app/ActionBar;ZLandroid/graphics/drawable/Drawable;Landroid/view/View$OnClickListener;)V

    .line 394
    iget-object v0, p0, Lcom/huawei/health/sns/ui/chat/DeleteGroupMemberActivity;->u:Landroid/view/View$OnClickListener;

    const/4 v1, 0x1

    const/4 v2, 0x0

    invoke-static {v3, v1, v2, v0}, Lo/bmm;->b(Landroid/app/ActionBar;ZLandroid/graphics/drawable/Drawable;Landroid/view/View$OnClickListener;)V

    .line 396
    iget-object v0, p0, Lcom/huawei/health/sns/ui/chat/DeleteGroupMemberActivity;->g:Landroid/widget/TextView;

    sget v1, Lcom/huawei/android/sns/R$color;->sns_huaweipay_black_a_D8:I

    sget v2, Lcom/huawei/android/sns/R$color;->sns_chat_action_bar_title_for_emuifive:I

    invoke-static {v0, v1, v2, p0}, Lo/bom;->e(Landroid/widget/TextView;IILandroid/content/Context;)V

    .line 397
    sget v0, Lcom/huawei/android/sns/R$color;->sns_huaweipay_black_a_D8:I

    sget v1, Lcom/huawei/android/sns/R$color;->sns_chat_action_bar_title_for_emuifive:I

    invoke-static {v6, v0, v1, p0}, Lo/bom;->e(Landroid/widget/TextView;IILandroid/content/Context;)V

    .line 399
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/chat/DeleteGroupMemberActivity;->k()V

    .line 400
    return-void
.end method

.method static synthetic c(Lcom/huawei/health/sns/ui/chat/DeleteGroupMemberActivity;)V
    .locals 0

    .line 65
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/chat/DeleteGroupMemberActivity;->h()V

    return-void
.end method

.method static synthetic c(Lcom/huawei/health/sns/ui/chat/DeleteGroupMemberActivity;Landroid/os/Message;)V
    .locals 0

    .line 65
    invoke-direct {p0, p1}, Lcom/huawei/health/sns/ui/chat/DeleteGroupMemberActivity;->b(Landroid/os/Message;)V

    return-void
.end method

.method private c(Ljava/lang/String;)V
    .locals 3

    .line 677
    iget-object v0, p0, Lcom/huawei/health/sns/ui/chat/DeleteGroupMemberActivity;->m:Ljava/util/ArrayList;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/huawei/health/sns/ui/chat/DeleteGroupMemberActivity;->m:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 679
    :cond_0
    return-void

    .line 681
    :cond_1
    new-instance v0, Lo/bjc;

    iget-object v1, p0, Lcom/huawei/health/sns/ui/chat/DeleteGroupMemberActivity;->r:Landroid/os/Handler;

    invoke-direct {v0, v1}, Lo/bjc;-><init>(Landroid/os/Handler;)V

    iget-wide v1, p0, Lcom/huawei/health/sns/ui/chat/DeleteGroupMemberActivity;->k:J

    invoke-virtual {v0, p1, v1, v2}, Lo/bjc;->d(Ljava/lang/String;J)V

    .line 682
    return-void
.end method

.method private c(Ljava/util/ArrayList;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/ArrayList<Lcom/huawei/health/sns/model/search/SNSSearchBean;>;)V"
        }
    .end annotation

    .line 647
    const/4 v0, 0x1

    invoke-direct {p0, v0}, Lcom/huawei/health/sns/ui/chat/DeleteGroupMemberActivity;->c(Z)V

    .line 648
    iget-object v0, p0, Lcom/huawei/health/sns/ui/chat/DeleteGroupMemberActivity;->n:Lo/bdf;

    invoke-virtual {v0, p1}, Lo/bdf;->c(Ljava/util/ArrayList;)V

    .line 649
    return-void
.end method

.method private c(Z)V
    .locals 2

    .line 577
    if-eqz p1, :cond_0

    .line 579
    iget-object v0, p0, Lcom/huawei/health/sns/ui/chat/DeleteGroupMemberActivity;->l:Landroid/widget/ListView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/ListView;->setVisibility(I)V

    .line 580
    iget-object v0, p0, Lcom/huawei/health/sns/ui/chat/DeleteGroupMemberActivity;->c:Landroid/widget/LinearLayout;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    goto :goto_0

    .line 584
    :cond_0
    iget-object v0, p0, Lcom/huawei/health/sns/ui/chat/DeleteGroupMemberActivity;->l:Landroid/widget/ListView;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/ListView;->setVisibility(I)V

    .line 585
    iget-object v0, p0, Lcom/huawei/health/sns/ui/chat/DeleteGroupMemberActivity;->c:Landroid/widget/LinearLayout;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 587
    :goto_0
    return-void
.end method

.method private d(Lcom/huawei/health/sns/model/group/Group;)V
    .locals 4

    .line 558
    iget-object v0, p0, Lcom/huawei/health/sns/ui/chat/DeleteGroupMemberActivity;->r:Landroid/os/Handler;

    if-eqz v0, :cond_0

    .line 560
    const/16 v1, 0x145

    .line 561
    iget-object v0, p0, Lcom/huawei/health/sns/ui/chat/DeleteGroupMemberActivity;->r:Landroid/os/Handler;

    invoke-virtual {v0}, Landroid/os/Handler;->obtainMessage()Landroid/os/Message;

    move-result-object v2

    .line 562
    iput v1, v2, Landroid/os/Message;->what:I

    .line 563
    new-instance v3, Landroid/os/Bundle;

    invoke-direct {v3}, Landroid/os/Bundle;-><init>()V

    .line 564
    const-string v0, "bundle_key_group"

    invoke-virtual {v3, v0, p1}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V

    .line 565
    invoke-virtual {v2, v3}, Landroid/os/Message;->setData(Landroid/os/Bundle;)V

    .line 566
    iget-object v0, p0, Lcom/huawei/health/sns/ui/chat/DeleteGroupMemberActivity;->r:Landroid/os/Handler;

    invoke-virtual {v0, v2}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    .line 568
    :cond_0
    return-void
.end method

.method static synthetic d(Lcom/huawei/health/sns/ui/chat/DeleteGroupMemberActivity;)V
    .locals 0

    .line 65
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/chat/DeleteGroupMemberActivity;->g()V

    return-void
.end method

.method private e()V
    .locals 4

    .line 256
    invoke-virtual {p0}, Lcom/huawei/health/sns/ui/chat/DeleteGroupMemberActivity;->getIntent()Landroid/content/Intent;

    move-result-object v2

    .line 257
    if-eqz v2, :cond_1

    .line 259
    invoke-virtual {v2}, Landroid/content/Intent;->getExtras()Landroid/os/Bundle;

    move-result-object v3

    .line 260
    if-nez v3, :cond_0

    .line 262
    return-void

    .line 264
    :cond_0
    const-string v0, "groupId"

    invoke-virtual {v3, v0}, Landroid/os/Bundle;->containsKey(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 266
    const-string v0, "groupId"

    invoke-virtual {v3, v0}, Landroid/os/Bundle;->getLong(Ljava/lang/String;)J

    move-result-wide v0

    iput-wide v0, p0, Lcom/huawei/health/sns/ui/chat/DeleteGroupMemberActivity;->k:J

    .line 269
    :cond_1
    return-void
.end method

.method private e(Landroid/widget/CheckBox;I)V
    .locals 7

    .line 356
    invoke-virtual {p1}, Landroid/widget/CheckBox;->isEnabled()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 358
    invoke-virtual {p1}, Landroid/widget/CheckBox;->isChecked()Z

    move-result v4

    .line 359
    if-nez v4, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    invoke-virtual {p1, v0}, Landroid/widget/CheckBox;->setChecked(Z)V

    .line 361
    iget-object v0, p0, Lcom/huawei/health/sns/ui/chat/DeleteGroupMemberActivity;->n:Lo/bdf;

    invoke-virtual {v0, p2}, Lo/bdf;->d(I)J

    move-result-wide v5

    .line 362
    const-wide/16 v0, 0x0

    cmp-long v0, v5, v0

    if-eqz v0, :cond_2

    .line 364
    iget-object v0, p0, Lcom/huawei/health/sns/ui/chat/DeleteGroupMemberActivity;->n:Lo/bdf;

    if-nez v4, :cond_1

    const/4 v1, 0x1

    goto :goto_1

    :cond_1
    const/4 v1, 0x0

    :goto_1
    invoke-virtual {v0, v5, v6, v1}, Lo/bdf;->a(JZ)V

    .line 367
    :cond_2
    iget-object v0, p0, Lcom/huawei/health/sns/ui/chat/DeleteGroupMemberActivity;->n:Lo/bdf;

    invoke-virtual {v0}, Lo/bdf;->b()I

    move-result v4

    .line 369
    iget-object v0, p0, Lcom/huawei/health/sns/ui/chat/DeleteGroupMemberActivity;->r:Landroid/os/Handler;

    iget-object v1, p0, Lcom/huawei/health/sns/ui/chat/DeleteGroupMemberActivity;->r:Landroid/os/Handler;

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/16 v3, 0x142

    invoke-virtual {v1, v3, v2}, Landroid/os/Handler;->obtainMessage(ILjava/lang/Object;)Landroid/os/Message;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    .line 370
    return-void
.end method

.method static synthetic e(Lcom/huawei/health/sns/ui/chat/DeleteGroupMemberActivity;)V
    .locals 0

    .line 65
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/chat/DeleteGroupMemberActivity;->m()V

    return-void
.end method

.method private e(Ljava/lang/Object;)V
    .locals 3

    .line 487
    if-nez p1, :cond_0

    .line 489
    return-void

    .line 491
    :cond_0
    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v2

    .line 492
    iget-object v0, p0, Lcom/huawei/health/sns/ui/chat/DeleteGroupMemberActivity;->g:Landroid/widget/TextView;

    if-eqz v0, :cond_2

    .line 494
    const-string v0, "0"

    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 496
    iget-object v0, p0, Lcom/huawei/health/sns/ui/chat/DeleteGroupMemberActivity;->g:Landroid/widget/TextView;

    const/4 v1, 0x4

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    goto :goto_0

    .line 500
    :cond_1
    iget-object v0, p0, Lcom/huawei/health/sns/ui/chat/DeleteGroupMemberActivity;->g:Landroid/widget/TextView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 501
    iget-object v0, p0, Lcom/huawei/health/sns/ui/chat/DeleteGroupMemberActivity;->g:Landroid/widget/TextView;

    invoke-virtual {v0, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 503
    :goto_0
    iget-object v0, p0, Lcom/huawei/health/sns/ui/chat/DeleteGroupMemberActivity;->o:Landroid/view/View;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_2

    .line 505
    iget-object v0, p0, Lcom/huawei/health/sns/ui/chat/DeleteGroupMemberActivity;->o:Landroid/view/View;

    iget-object v1, p0, Lcom/huawei/health/sns/ui/chat/DeleteGroupMemberActivity;->g:Landroid/widget/TextView;

    invoke-virtual {v1}, Landroid/widget/TextView;->getVisibility()I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 508
    :cond_2
    return-void
.end method

.method private g()V
    .locals 3

    .line 447
    iget-object v0, p0, Lcom/huawei/health/sns/ui/chat/DeleteGroupMemberActivity;->n:Lo/bdf;

    invoke-virtual {v0}, Lo/bdf;->d()Ljava/util/ArrayList;

    move-result-object v1

    .line 448
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-lez v0, :cond_0

    .line 450
    new-instance v2, Landroid/content/Intent;

    invoke-direct {v2}, Landroid/content/Intent;-><init>()V

    .line 451
    const-string v0, "memberList"

    invoke-virtual {v2, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/io/Serializable;)Landroid/content/Intent;

    .line 452
    const/4 v0, -0x1

    invoke-virtual {p0, v0, v2}, Lcom/huawei/health/sns/ui/chat/DeleteGroupMemberActivity;->setResult(ILandroid/content/Intent;)V

    .line 453
    invoke-virtual {p0}, Lcom/huawei/health/sns/ui/chat/DeleteGroupMemberActivity;->finish()V

    .line 455
    :cond_0
    return-void
.end method

.method private h()V
    .locals 2

    .line 437
    new-instance v1, Landroid/content/Intent;

    invoke-direct {v1}, Landroid/content/Intent;-><init>()V

    .line 438
    const/4 v0, 0x0

    invoke-virtual {p0, v0, v1}, Lcom/huawei/health/sns/ui/chat/DeleteGroupMemberActivity;->setResult(ILandroid/content/Intent;)V

    .line 439
    invoke-virtual {p0}, Lcom/huawei/health/sns/ui/chat/DeleteGroupMemberActivity;->finish()V

    .line 440
    return-void
.end method

.method private k()V
    .locals 3

    .line 407
    invoke-static {}, Lo/bom;->i()Z

    move-result v0

    if-nez v0, :cond_1

    .line 409
    iget-object v0, p0, Lcom/huawei/health/sns/ui/chat/DeleteGroupMemberActivity;->g:Landroid/widget/TextView;

    sget v1, Lcom/huawei/android/sns/R$drawable;->sns_friendselector_actionbar_bg_gray:I

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setBackgroundResource(I)V

    .line 410
    invoke-static {}, Lo/bom;->a()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 412
    iget-object v0, p0, Lcom/huawei/health/sns/ui/chat/DeleteGroupMemberActivity;->g:Landroid/widget/TextView;

    sget v1, Lcom/huawei/android/sns/R$drawable;->sns_friendselector_actionbar_bg_gray:I

    sget v2, Lcom/huawei/android/sns/R$drawable;->sns_friendselector_actionbar_bg:I

    invoke-static {v0, v1, v2, p0}, Lo/bom;->c(Landroid/view/View;IILandroid/content/Context;)V

    goto :goto_0

    .line 416
    :cond_0
    iget-object v0, p0, Lcom/huawei/health/sns/ui/chat/DeleteGroupMemberActivity;->g:Landroid/widget/TextView;

    sget v1, Lcom/huawei/android/sns/R$drawable;->sns_friendselector_actionbar_bg:I

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setBackgroundResource(I)V

    goto :goto_0

    .line 421
    :cond_1
    iget-object v0, p0, Lcom/huawei/health/sns/ui/chat/DeleteGroupMemberActivity;->g:Landroid/widget/TextView;

    invoke-virtual {p0}, Lcom/huawei/health/sns/ui/chat/DeleteGroupMemberActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/android/sns/R$color;->sns_select_num_color:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getColor(I)I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setTextColor(I)V

    .line 423
    :goto_0
    return-void
.end method

.method private l()V
    .locals 1

    .line 739
    iget-object v0, p0, Lcom/huawei/health/sns/ui/chat/DeleteGroupMemberActivity;->q:Lo/bio;

    if-eqz v0, :cond_0

    .line 741
    iget-object v0, p0, Lcom/huawei/health/sns/ui/chat/DeleteGroupMemberActivity;->q:Lo/bio;

    invoke-virtual {v0}, Lo/bio;->c()V

    .line 743
    :cond_0
    return-void
.end method

.method private m()V
    .locals 4

    .line 525
    iget-object v2, p0, Lcom/huawei/health/sns/ui/chat/DeleteGroupMemberActivity;->f:Lcom/huawei/health/sns/model/group/Group;

    .line 526
    const/16 v3, 0x143

    .line 527
    if-eqz v2, :cond_0

    .line 529
    new-instance v0, Lo/ate;

    iget-object v1, p0, Lcom/huawei/health/sns/ui/chat/DeleteGroupMemberActivity;->r:Landroid/os/Handler;

    invoke-direct {v0, v1}, Lo/ate;-><init>(Landroid/os/Handler;)V

    invoke-virtual {v0, v3, v2}, Lo/ate;->d(ILcom/huawei/health/sns/model/group/Group;)V

    .line 531
    :cond_0
    return-void
.end method

.method private n()V
    .locals 2

    .line 538
    invoke-static {}, Lo/brb;->d()Lo/brb;

    move-result-object v0

    new-instance v1, Lcom/huawei/health/sns/ui/chat/DeleteGroupMemberActivity$5;

    invoke-direct {v1, p0}, Lcom/huawei/health/sns/ui/chat/DeleteGroupMemberActivity$5;-><init>(Lcom/huawei/health/sns/ui/chat/DeleteGroupMemberActivity;)V

    invoke-virtual {v0, v1}, Lo/brb;->c(Lo/brd;)Lo/bqy;

    .line 549
    return-void
.end method

.method private o()V
    .locals 3

    .line 515
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/chat/DeleteGroupMemberActivity;->n()V

    .line 516
    new-instance v0, Lo/atg;

    iget-object v1, p0, Lcom/huawei/health/sns/ui/chat/DeleteGroupMemberActivity;->r:Landroid/os/Handler;

    invoke-direct {v0, v1}, Lo/atg;-><init>(Landroid/os/Handler;)V

    iget-wide v1, p0, Lcom/huawei/health/sns/ui/chat/DeleteGroupMemberActivity;->k:J

    invoke-virtual {v0, v1, v2}, Lo/atg;->e(J)V

    .line 517
    return-void
.end method

.method private p()V
    .locals 4

    .line 690
    new-instance v0, Lo/bgn;

    iget-object v1, p0, Lcom/huawei/health/sns/ui/chat/DeleteGroupMemberActivity;->r:Landroid/os/Handler;

    invoke-direct {v0, v1}, Lo/bgn;-><init>(Landroid/os/Handler;)V

    iput-object v0, p0, Lcom/huawei/health/sns/ui/chat/DeleteGroupMemberActivity;->p:Lo/bgn;

    .line 691
    invoke-virtual {p0}, Lcom/huawei/health/sns/ui/chat/DeleteGroupMemberActivity;->getContentResolver()Landroid/content/ContentResolver;

    move-result-object v0

    sget-object v1, Lo/bbz$g;->a:Landroid/net/Uri;

    iget-object v2, p0, Lcom/huawei/health/sns/ui/chat/DeleteGroupMemberActivity;->p:Lo/bgn;

    const/4 v3, 0x1

    invoke-virtual {v0, v1, v3, v2}, Landroid/content/ContentResolver;->registerContentObserver(Landroid/net/Uri;ZLandroid/database/ContentObserver;)V

    .line 692
    return-void
.end method


# virtual methods
.method public d()V
    .locals 1

    .line 428
    sget v0, Lcom/huawei/android/sns/R$id;->content_layout:I

    invoke-virtual {p0, v0}, Lcom/huawei/health/sns/ui/chat/DeleteGroupMemberActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    iput-object v0, p0, Lcom/huawei/health/sns/ui/chat/DeleteGroupMemberActivity;->d:Landroid/view/View;

    .line 429
    return-void
.end method

.method public d(Ljava/util/ArrayList;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/ArrayList<Lcom/huawei/health/sns/model/group/GroupMember;>;)V"
        }
    .end annotation

    .line 244
    iput-object p1, p0, Lcom/huawei/health/sns/ui/chat/DeleteGroupMemberActivity;->m:Ljava/util/ArrayList;

    .line 245
    iget-boolean v0, p0, Lcom/huawei/health/sns/ui/chat/DeleteGroupMemberActivity;->t:Z

    if-nez v0, :cond_0

    .line 247
    iget-object v0, p0, Lcom/huawei/health/sns/ui/chat/DeleteGroupMemberActivity;->n:Lo/bdf;

    iget-object v1, p0, Lcom/huawei/health/sns/ui/chat/DeleteGroupMemberActivity;->m:Ljava/util/ArrayList;

    invoke-virtual {v0, v1}, Lo/bdf;->b(Ljava/util/ArrayList;)V

    .line 249
    :cond_0
    return-void
.end method

.method public onClose()Z
    .locals 1

    .line 612
    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lcom/huawei/health/sns/ui/chat/DeleteGroupMemberActivity;->a(Ljava/lang/String;)V

    .line 613
    const/4 v0, 0x1

    invoke-direct {p0, v0}, Lcom/huawei/health/sns/ui/chat/DeleteGroupMemberActivity;->c(Z)V

    .line 614
    const/4 v0, 0x1

    return v0
.end method

.method public onConfigurationChanged(Landroid/content/res/Configuration;)V
    .locals 3

    .line 777
    invoke-super {p0, p1}, Lcom/huawei/health/sns/ui/base/SNSBaseActivity;->onConfigurationChanged(Landroid/content/res/Configuration;)V

    .line 778
    iget-object v0, p0, Lcom/huawei/health/sns/ui/chat/DeleteGroupMemberActivity;->c:Landroid/widget/LinearLayout;

    iget-object v1, p0, Lcom/huawei/health/sns/ui/chat/DeleteGroupMemberActivity;->e:Landroid/widget/ImageView;

    const/4 v2, 0x1

    invoke-static {v0, v1, p0, v2}, Lo/bph;->c(Landroid/widget/LinearLayout;Landroid/widget/ImageView;Landroid/app/Activity;Z)V

    .line 779
    return-void
.end method

.method public onCreate(Landroid/os/Bundle;)V
    .locals 1

    .line 228
    invoke-super {p0, p1}, Lcom/huawei/health/sns/ui/base/SNSBaseActivity;->onCreate(Landroid/os/Bundle;)V

    .line 229
    sget v0, Lcom/huawei/android/sns/R$layout;->sns_delete_group_member_activity:I

    invoke-virtual {p0, v0}, Lcom/huawei/health/sns/ui/chat/DeleteGroupMemberActivity;->setContentView(I)V

    .line 230
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/chat/DeleteGroupMemberActivity;->e()V

    .line 231
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/chat/DeleteGroupMemberActivity;->c()V

    .line 232
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/chat/DeleteGroupMemberActivity;->p()V

    .line 233
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/chat/DeleteGroupMemberActivity;->b()V

    .line 234
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/chat/DeleteGroupMemberActivity;->o()V

    .line 235
    return-void
.end method

.method public onCreateOptionsMenu(Landroid/view/Menu;)Z
    .locals 2

    .line 709
    invoke-static {}, Lo/bom;->c()Z

    move-result v0

    if-nez v0, :cond_0

    .line 712
    invoke-virtual {p0}, Lcom/huawei/health/sns/ui/chat/DeleteGroupMemberActivity;->getMenuInflater()Landroid/view/MenuInflater;

    move-result-object v0

    sget v1, Lcom/huawei/android/sns/R$menu;->sns_action_bar_confirm_menu:I

    invoke-virtual {v0, v1, p1}, Landroid/view/MenuInflater;->inflate(ILandroid/view/Menu;)V

    .line 715
    :cond_0
    invoke-super {p0, p1}, Lcom/huawei/health/sns/ui/base/SNSBaseActivity;->onCreateOptionsMenu(Landroid/view/Menu;)Z

    move-result v0

    return v0
.end method

.method public onDestroy()V
    .locals 2

    .line 697
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/chat/DeleteGroupMemberActivity;->l()V

    .line 699
    iget-object v0, p0, Lcom/huawei/health/sns/ui/chat/DeleteGroupMemberActivity;->p:Lo/bgn;

    if-eqz v0, :cond_0

    .line 701
    invoke-virtual {p0}, Lcom/huawei/health/sns/ui/chat/DeleteGroupMemberActivity;->getContentResolver()Landroid/content/ContentResolver;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/health/sns/ui/chat/DeleteGroupMemberActivity;->p:Lo/bgn;

    invoke-virtual {v0, v1}, Landroid/content/ContentResolver;->unregisterContentObserver(Landroid/database/ContentObserver;)V

    .line 703
    :cond_0
    invoke-super {p0}, Lcom/huawei/health/sns/ui/base/SNSBaseActivity;->onDestroy()V

    .line 704
    return-void
.end method

.method public onOptionsItemSelected(Landroid/view/MenuItem;)Z
    .locals 2

    .line 721
    invoke-interface {p1}, Landroid/view/MenuItem;->getItemId()I

    move-result v1

    .line 722
    const v0, 0x102002c

    if-ne v1, v0, :cond_0

    .line 724
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/chat/DeleteGroupMemberActivity;->h()V

    goto :goto_0

    .line 726
    :cond_0
    sget v0, Lcom/huawei/android/sns/R$id;->sns_menu_ab_confirm:I

    if-ne v1, v0, :cond_1

    .line 728
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/chat/DeleteGroupMemberActivity;->g()V

    .line 731
    :cond_1
    :goto_0
    invoke-super {p0, p1}, Lcom/huawei/health/sns/ui/base/SNSBaseActivity;->onOptionsItemSelected(Landroid/view/MenuItem;)Z

    move-result v0

    return v0
.end method

.method public onQueryTextChange(Ljava/lang/String;)Z
    .locals 1

    .line 592
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 594
    invoke-virtual {p0}, Lcom/huawei/health/sns/ui/chat/DeleteGroupMemberActivity;->onClose()Z

    goto :goto_0

    .line 598
    :cond_0
    invoke-direct {p0, p1}, Lcom/huawei/health/sns/ui/chat/DeleteGroupMemberActivity;->a(Ljava/lang/String;)V

    .line 600
    :goto_0
    const/4 v0, 0x1

    return v0
.end method

.method public onQueryTextSubmit(Ljava/lang/String;)Z
    .locals 1

    .line 606
    const/4 v0, 0x0

    return v0
.end method
