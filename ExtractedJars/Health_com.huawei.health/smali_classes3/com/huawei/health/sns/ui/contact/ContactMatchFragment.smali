.class public Lcom/huawei/health/sns/ui/contact/ContactMatchFragment;
.super Lcom/huawei/health/sns/ui/common/FunctionFragment;
.source "SourceFile"

# interfaces
.implements Landroid/widget/SearchView$OnCloseListener;
.implements Landroid/widget/SearchView$OnQueryTextListener;
.implements Lcom/huawei/health/sns/ui/contact/ContactMatchActivity$c;
.implements Lo/bni$d;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/huawei/health/sns/ui/contact/ContactMatchFragment$b;
    }
.end annotation


# instance fields
.field private a:Lo/bkj;

.field private l:Ljava/lang/String;

.field private m:Landroid/view/View;

.field private o:I

.field private p:Lo/bfu;

.field private q:Lo/bio;

.field private r:Landroid/widget/LinearLayout;

.field private s:Landroid/widget/SearchView;

.field private t:Landroid/view/View;

.field private u:Landroid/widget/RelativeLayout;

.field private v:Z

.field private z:Landroid/os/Handler;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 74
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/common/FunctionFragment;-><init>()V

    .line 125
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/health/sns/ui/contact/ContactMatchFragment;->l:Ljava/lang/String;

    .line 130
    const/4 v0, 0x0

    iput v0, p0, Lcom/huawei/health/sns/ui/contact/ContactMatchFragment;->o:I

    .line 160
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/health/sns/ui/contact/ContactMatchFragment;->v:Z

    .line 162
    new-instance v0, Lcom/huawei/health/sns/ui/contact/ContactMatchFragment$b;

    invoke-direct {v0, p0}, Lcom/huawei/health/sns/ui/contact/ContactMatchFragment$b;-><init>(Lcom/huawei/health/sns/ui/contact/ContactMatchFragment;)V

    iput-object v0, p0, Lcom/huawei/health/sns/ui/contact/ContactMatchFragment;->z:Landroid/os/Handler;

    return-void
.end method

.method public static a(Ljava/lang/String;I)Lcom/huawei/health/sns/ui/contact/ContactMatchFragment;
    .locals 1

    .line 166
    new-instance v0, Lcom/huawei/health/sns/ui/contact/ContactMatchFragment;

    invoke-direct {v0}, Lcom/huawei/health/sns/ui/contact/ContactMatchFragment;-><init>()V

    .line 167
    invoke-virtual {v0, p0, p1}, Lcom/huawei/health/sns/ui/contact/ContactMatchFragment;->e(Ljava/lang/String;I)V

    .line 168
    return-object v0
.end method

.method private a(I)V
    .locals 4

    .line 739
    iget-object v0, p0, Lcom/huawei/health/sns/ui/contact/ContactMatchFragment;->p:Lo/bfu;

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/huawei/health/sns/ui/contact/ContactMatchFragment;->p:Lo/bfu;

    invoke-virtual {v0}, Lo/bfu;->c()I

    move-result v0

    if-nez v0, :cond_1

    .line 742
    const/4 v0, 0x4

    if-eq p1, v0, :cond_3

    .line 745
    invoke-static {}, Lo/bci;->d()Lo/bci;

    move-result-object v0

    invoke-virtual {v0}, Lo/bci;->b()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lo/bpl;->d(Landroid/content/Context;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 747
    iget-object v0, p0, Lcom/huawei/health/sns/ui/contact/ContactMatchFragment;->i:Lo/bni;

    invoke-virtual {p0}, Lcom/huawei/health/sns/ui/contact/ContactMatchFragment;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/android/sns/R$string;->sns_network_error_retry:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/bni;->setTip(Ljava/lang/String;)V

    .line 748
    iget-object v0, p0, Lcom/huawei/health/sns/ui/contact/ContactMatchFragment;->i:Lo/bni;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lo/bni;->setShowNetWorkButton(Z)V

    goto :goto_0

    .line 753
    :cond_0
    iget-object v0, p0, Lcom/huawei/health/sns/ui/contact/ContactMatchFragment;->i:Lo/bni;

    invoke-virtual {p0}, Lcom/huawei/health/sns/ui/contact/ContactMatchFragment;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/android/sns/R$string;->sns_server_busy:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/bni;->setTip(Ljava/lang/String;)V

    .line 754
    iget-object v0, p0, Lcom/huawei/health/sns/ui/contact/ContactMatchFragment;->i:Lo/bni;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lo/bni;->setShowNetWorkButton(Z)V

    .line 756
    :goto_0
    iget-object v0, p0, Lcom/huawei/health/sns/ui/contact/ContactMatchFragment;->i:Lo/bni;

    invoke-virtual {v0, p0}, Lo/bni;->setCallBack(Lo/bni$d;)V

    goto :goto_2

    .line 761
    :cond_1
    iget-object v0, p0, Lcom/huawei/health/sns/ui/contact/ContactMatchFragment;->i:Lo/bni;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Lo/bni;->setVisibility(I)V

    .line 763
    const/4 v0, 0x4

    if-eq p1, v0, :cond_3

    .line 767
    invoke-static {}, Lo/bci;->d()Lo/bci;

    move-result-object v0

    invoke-virtual {v0}, Lo/bci;->b()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lo/bpl;->d(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 769
    sget v3, Lcom/huawei/android/sns/R$string;->sns_server_failed:I

    goto :goto_1

    .line 774
    :cond_2
    sget v3, Lcom/huawei/android/sns/R$string;->sns_no_network:I

    .line 776
    :goto_1
    invoke-virtual {p0}, Lcom/huawei/health/sns/ui/contact/ContactMatchFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    invoke-static {v0, v3}, Lo/brh;->c(Landroid/app/Activity;I)V

    .line 779
    :cond_3
    :goto_2
    return-void
.end method

.method static synthetic a(Lcom/huawei/health/sns/ui/contact/ContactMatchFragment;Ljava/util/ArrayList;I)V
    .locals 0

    .line 74
    invoke-direct {p0, p1, p2}, Lcom/huawei/health/sns/ui/contact/ContactMatchFragment;->a(Ljava/util/ArrayList;I)V

    return-void
.end method

.method private a(Ljava/util/ArrayList;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/ArrayList<Lcom/huawei/health/sns/model/user/User;>;)V"
        }
    .end annotation

    .line 232
    const-string v0, "openContactMatchFromFirstOpen"

    iget-object v1, p0, Lcom/huawei/health/sns/ui/contact/ContactMatchFragment;->l:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 235
    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Lcom/huawei/health/sns/ui/contact/ContactMatchFragment;->setHasOptionsMenu(Z)V

    .line 238
    :cond_0
    if-eqz p1, :cond_1

    invoke-virtual {p1}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_1

    .line 240
    invoke-direct {p0, p1}, Lcom/huawei/health/sns/ui/contact/ContactMatchFragment;->b(Ljava/util/ArrayList;)V

    .line 241
    iget-object v0, p0, Lcom/huawei/health/sns/ui/contact/ContactMatchFragment;->h:Landroid/widget/FrameLayout;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/FrameLayout;->setVisibility(I)V

    goto :goto_0

    .line 246
    :cond_1
    iget-object v0, p0, Lcom/huawei/health/sns/ui/contact/ContactMatchFragment;->m:Landroid/view/View;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 247
    iget-object v0, p0, Lcom/huawei/health/sns/ui/contact/ContactMatchFragment;->e:Landroid/widget/ListView;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/ListView;->setVisibility(I)V

    .line 248
    iget-object v0, p0, Lcom/huawei/health/sns/ui/contact/ContactMatchFragment;->h:Landroid/widget/FrameLayout;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/FrameLayout;->setVisibility(I)V

    .line 250
    :goto_0
    return-void
.end method

.method private a(Ljava/util/ArrayList;I)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/ArrayList<Lcom/huawei/health/sns/model/user/User;>;I)V"
        }
    .end annotation

    .line 184
    iget-object v0, p0, Lcom/huawei/health/sns/ui/contact/ContactMatchFragment;->p:Lo/bfu;

    if-eqz v0, :cond_2

    invoke-virtual {p0}, Lcom/huawei/health/sns/ui/contact/ContactMatchFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    if-eqz v0, :cond_2

    invoke-virtual {p0}, Lcom/huawei/health/sns/ui/contact/ContactMatchFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    invoke-virtual {v0}, Landroid/support/v4/app/FragmentActivity;->isFinishing()Z

    move-result v0

    if-nez v0, :cond_2

    .line 186
    iget-object v0, p0, Lcom/huawei/health/sns/ui/contact/ContactMatchFragment;->k:Landroid/widget/FrameLayout;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/FrameLayout;->setVisibility(I)V

    .line 187
    const/4 v0, 0x1

    if-ne p2, v0, :cond_0

    .line 189
    invoke-direct {p0, p1}, Lcom/huawei/health/sns/ui/contact/ContactMatchFragment;->c(Ljava/util/ArrayList;)V

    goto :goto_0

    .line 191
    :cond_0
    const/4 v0, 0x2

    if-ne p2, v0, :cond_1

    .line 193
    invoke-direct {p0, p1}, Lcom/huawei/health/sns/ui/contact/ContactMatchFragment;->a(Ljava/util/ArrayList;)V

    goto :goto_0

    .line 195
    :cond_1
    const/4 v0, 0x3

    if-ne p2, v0, :cond_2

    .line 198
    if-eqz p1, :cond_2

    invoke-virtual {p1}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_2

    .line 200
    invoke-direct {p0, p1}, Lcom/huawei/health/sns/ui/contact/ContactMatchFragment;->b(Ljava/util/ArrayList;)V

    .line 204
    :cond_2
    :goto_0
    return-void
.end method

.method private static b(ILandroid/os/Handler;)Lo/brc;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(ILandroid/os/Handler;)Lo/brc<Ljava/util/ArrayList<Lcom/huawei/health/sns/model/user/User;>;>;"
        }
    .end annotation

    .line 477
    new-instance v0, Lcom/huawei/health/sns/ui/contact/ContactMatchFragment$5;

    invoke-direct {v0, p1, p0}, Lcom/huawei/health/sns/ui/contact/ContactMatchFragment$5;-><init>(Landroid/os/Handler;I)V

    return-object v0
.end method

.method private b(Ljava/lang/String;)V
    .locals 2

    .line 449
    new-instance v0, Lo/avs;

    iget-object v1, p0, Lcom/huawei/health/sns/ui/contact/ContactMatchFragment;->z:Landroid/os/Handler;

    invoke-direct {v0, v1}, Lo/avs;-><init>(Landroid/os/Handler;)V

    invoke-virtual {v0, p1}, Lo/avs;->e(Ljava/lang/String;)V

    .line 450
    return-void
.end method

.method private b(Ljava/util/ArrayList;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/ArrayList<Lcom/huawei/health/sns/model/user/User;>;)V"
        }
    .end annotation

    .line 260
    iget-object v0, p0, Lcom/huawei/health/sns/ui/contact/ContactMatchFragment;->m:Landroid/view/View;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 261
    iget-object v0, p0, Lcom/huawei/health/sns/ui/contact/ContactMatchFragment;->e:Landroid/widget/ListView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/ListView;->setVisibility(I)V

    .line 262
    iget-object v0, p0, Lcom/huawei/health/sns/ui/contact/ContactMatchFragment;->p:Lo/bfu;

    if-eqz v0, :cond_0

    .line 264
    iget-object v0, p0, Lcom/huawei/health/sns/ui/contact/ContactMatchFragment;->p:Lo/bfu;

    invoke-virtual {v0, p1}, Lo/bfu;->b(Ljava/util/ArrayList;)V

    .line 266
    :cond_0
    return-void
.end method

.method private c(I)V
    .locals 3

    .line 457
    invoke-static {}, Lo/brb;->d()Lo/brb;

    move-result-object v0

    invoke-static {}, Lcom/huawei/health/sns/ui/contact/ContactMatchFragment;->h()Lo/brd;

    move-result-object v1

    iget-object v2, p0, Lcom/huawei/health/sns/ui/contact/ContactMatchFragment;->z:Landroid/os/Handler;

    .line 458
    invoke-static {p1, v2}, Lcom/huawei/health/sns/ui/contact/ContactMatchFragment;->b(ILandroid/os/Handler;)Lo/brc;

    move-result-object v2

    .line 457
    invoke-virtual {v0, v1, v2}, Lo/brb;->b(Lo/brd;Lo/brc;)Lo/bqy;

    .line 459
    return-void
.end method

.method private c(Landroid/os/Message;)V
    .locals 5

    .line 884
    invoke-virtual {p1}, Landroid/os/Message;->getData()Landroid/os/Bundle;

    move-result-object v3

    .line 885
    if-eqz v3, :cond_1

    .line 887
    const-string v0, "keyContactMatchResult"

    invoke-virtual {v3, v0}, Landroid/os/Bundle;->getInt(Ljava/lang/String;)I

    move-result v4

    .line 888
    if-nez v4, :cond_0

    .line 890
    const/4 v0, 0x2

    invoke-direct {p0, v0}, Lcom/huawei/health/sns/ui/contact/ContactMatchFragment;->c(I)V

    goto :goto_0

    .line 894
    :cond_0
    invoke-direct {p0, v4}, Lcom/huawei/health/sns/ui/contact/ContactMatchFragment;->a(I)V

    .line 895
    const-string v0, "ContactMatchFragment"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Contact match result is:"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/bpf;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 898
    :goto_0
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/contact/ContactMatchFragment;->o()V

    .line 900
    :cond_1
    return-void
.end method

.method private c(Landroid/view/LayoutInflater;)V
    .locals 6
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "NewApi"
        }
    .end annotation

    .line 682
    sget v0, Lcom/huawei/android/sns/R$layout;->sns_local_search_layout:I

    iget-object v1, p0, Lcom/huawei/health/sns/ui/contact/ContactMatchFragment;->b:Landroid/view/View;

    check-cast v1, Landroid/widget/LinearLayout;

    const/4 v2, 0x0

    invoke-virtual {p1, v0, v1, v2}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/health/sns/ui/contact/ContactMatchFragment;->m:Landroid/view/View;

    .line 683
    iget-object v0, p0, Lcom/huawei/health/sns/ui/contact/ContactMatchFragment;->m:Landroid/view/View;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 684
    iget-object v0, p0, Lcom/huawei/health/sns/ui/contact/ContactMatchFragment;->m:Landroid/view/View;

    sget v1, Lcom/huawei/android/sns/R$id;->search_view:I

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/SearchView;

    iput-object v0, p0, Lcom/huawei/health/sns/ui/contact/ContactMatchFragment;->s:Landroid/widget/SearchView;

    .line 685
    iget-object v0, p0, Lcom/huawei/health/sns/ui/contact/ContactMatchFragment;->s:Landroid/widget/SearchView;

    invoke-virtual {v0}, Landroid/widget/SearchView;->onActionViewExpanded()V

    .line 686
    iget-object v0, p0, Lcom/huawei/health/sns/ui/contact/ContactMatchFragment;->s:Landroid/widget/SearchView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/SearchView;->setSubmitButtonEnabled(Z)V

    .line 687
    iget-object v0, p0, Lcom/huawei/health/sns/ui/contact/ContactMatchFragment;->s:Landroid/widget/SearchView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/SearchView;->setIconified(Z)V

    .line 688
    iget-object v0, p0, Lcom/huawei/health/sns/ui/contact/ContactMatchFragment;->s:Landroid/widget/SearchView;

    invoke-virtual {v0, p0}, Landroid/widget/SearchView;->setOnCloseListener(Landroid/widget/SearchView$OnCloseListener;)V

    .line 689
    iget-object v0, p0, Lcom/huawei/health/sns/ui/contact/ContactMatchFragment;->s:Landroid/widget/SearchView;

    invoke-virtual {v0, p0}, Landroid/widget/SearchView;->setOnQueryTextListener(Landroid/widget/SearchView$OnQueryTextListener;)V

    .line 690
    iget-object v0, p0, Lcom/huawei/health/sns/ui/contact/ContactMatchFragment;->s:Landroid/widget/SearchView;

    sget v1, Lcom/huawei/android/sns/R$string;->sns_local_search:I

    invoke-virtual {p0, v1}, Lcom/huawei/health/sns/ui/contact/ContactMatchFragment;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/SearchView;->setQueryHint(Ljava/lang/CharSequence;)V

    .line 691
    iget-object v0, p0, Lcom/huawei/health/sns/ui/contact/ContactMatchFragment;->b:Landroid/view/View;

    check-cast v0, Landroid/widget/LinearLayout;

    iget-object v1, p0, Lcom/huawei/health/sns/ui/contact/ContactMatchFragment;->m:Landroid/view/View;

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Landroid/widget/LinearLayout;->addView(Landroid/view/View;I)V

    .line 692
    sget v0, Lcom/huawei/android/sns/R$layout;->sns_search_no_result_layout:I

    iget-object v1, p0, Lcom/huawei/health/sns/ui/contact/ContactMatchFragment;->b:Landroid/view/View;

    check-cast v1, Landroid/widget/LinearLayout;

    const/4 v2, 0x0

    invoke-virtual {p1, v0, v1, v2}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Landroid/widget/LinearLayout;

    .line 694
    sget v0, Lcom/huawei/android/sns/R$id;->no_data_layout:I

    invoke-virtual {v4, v0}, Landroid/widget/LinearLayout;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    iput-object v0, p0, Lcom/huawei/health/sns/ui/contact/ContactMatchFragment;->r:Landroid/widget/LinearLayout;

    .line 695
    sget v0, Lcom/huawei/android/sns/R$id;->no_data_icon:I

    invoke-virtual {v4, v0}, Landroid/widget/LinearLayout;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lcom/huawei/health/sns/ui/contact/ContactMatchFragment;->f:Landroid/widget/ImageView;

    .line 696
    iget-object v0, p0, Lcom/huawei/health/sns/ui/contact/ContactMatchFragment;->r:Landroid/widget/LinearLayout;

    iget-object v1, p0, Lcom/huawei/health/sns/ui/contact/ContactMatchFragment;->f:Landroid/widget/ImageView;

    invoke-virtual {p0}, Lcom/huawei/health/sns/ui/contact/ContactMatchFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v2

    const/4 v3, 0x1

    invoke-static {v0, v1, v2, v3}, Lo/bph;->c(Landroid/widget/LinearLayout;Landroid/widget/ImageView;Landroid/app/Activity;Z)V

    .line 697
    iget-object v0, p0, Lcom/huawei/health/sns/ui/contact/ContactMatchFragment;->k:Landroid/widget/FrameLayout;

    invoke-virtual {v0, v4}, Landroid/widget/FrameLayout;->addView(Landroid/view/View;)V

    .line 699
    sget v0, Lcom/huawei/android/sns/R$layout;->sns_no_match_contact:I

    iget-object v1, p0, Lcom/huawei/health/sns/ui/contact/ContactMatchFragment;->b:Landroid/view/View;

    check-cast v1, Landroid/widget/LinearLayout;

    const/4 v2, 0x0

    invoke-virtual {p1, v0, v1, v2}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/RelativeLayout;

    iput-object v0, p0, Lcom/huawei/health/sns/ui/contact/ContactMatchFragment;->u:Landroid/widget/RelativeLayout;

    .line 701
    iget-object v0, p0, Lcom/huawei/health/sns/ui/contact/ContactMatchFragment;->u:Landroid/widget/RelativeLayout;

    sget v1, Lcom/huawei/android/sns/R$id;->no_data_layout:I

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    iput-object v0, p0, Lcom/huawei/health/sns/ui/contact/ContactMatchFragment;->g:Landroid/widget/LinearLayout;

    .line 702
    iget-object v0, p0, Lcom/huawei/health/sns/ui/contact/ContactMatchFragment;->h:Landroid/widget/FrameLayout;

    iget-object v1, p0, Lcom/huawei/health/sns/ui/contact/ContactMatchFragment;->u:Landroid/widget/RelativeLayout;

    invoke-virtual {v0, v1}, Landroid/widget/FrameLayout;->addView(Landroid/view/View;)V

    .line 704
    iget-object v0, p0, Lcom/huawei/health/sns/ui/contact/ContactMatchFragment;->s:Landroid/widget/SearchView;

    invoke-virtual {v0}, Landroid/widget/SearchView;->clearFocus()V

    .line 706
    iget-object v0, p0, Lcom/huawei/health/sns/ui/contact/ContactMatchFragment;->s:Landroid/widget/SearchView;

    invoke-static {v0}, Lo/bmo;->b(Landroid/widget/SearchView;)V

    .line 709
    invoke-virtual {p0}, Lcom/huawei/health/sns/ui/contact/ContactMatchFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    const-string v1, "input_method"

    invoke-virtual {v0, v1}, Landroid/support/v4/app/FragmentActivity;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    move-object v5, v0

    check-cast v5, Landroid/view/inputmethod/InputMethodManager;

    .line 711
    iget-object v0, p0, Lcom/huawei/health/sns/ui/contact/ContactMatchFragment;->b:Landroid/view/View;

    invoke-virtual {v0}, Landroid/view/View;->getWindowToken()Landroid/os/IBinder;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v5, v0, v1}, Landroid/view/inputmethod/InputMethodManager;->hideSoftInputFromWindow(Landroid/os/IBinder;I)Z

    .line 712
    iget-object v0, p0, Lcom/huawei/health/sns/ui/contact/ContactMatchFragment;->g:Landroid/widget/LinearLayout;

    invoke-virtual {p0}, Lcom/huawei/health/sns/ui/contact/ContactMatchFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v1

    invoke-static {v0, v1}, Lo/bph;->b(Landroid/widget/LinearLayout;Landroid/app/Activity;)V

    .line 713
    return-void
.end method

.method static synthetic c(Lcom/huawei/health/sns/ui/contact/ContactMatchFragment;I)V
    .locals 0

    .line 74
    invoke-direct {p0, p1}, Lcom/huawei/health/sns/ui/contact/ContactMatchFragment;->c(I)V

    return-void
.end method

.method private c(Ljava/util/ArrayList;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/ArrayList<Lcom/huawei/health/sns/model/user/User;>;)V"
        }
    .end annotation

    .line 214
    if-eqz p1, :cond_0

    invoke-virtual {p1}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_0

    .line 216
    invoke-direct {p0, p1}, Lcom/huawei/health/sns/ui/contact/ContactMatchFragment;->b(Ljava/util/ArrayList;)V

    goto :goto_0

    .line 220
    :cond_0
    iget-object v0, p0, Lcom/huawei/health/sns/ui/contact/ContactMatchFragment;->e:Landroid/widget/ListView;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/ListView;->setVisibility(I)V

    .line 221
    iget-object v0, p0, Lcom/huawei/health/sns/ui/contact/ContactMatchFragment;->m:Landroid/view/View;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 223
    :goto_0
    return-void
.end method

.method private d(Landroid/os/Message;)V
    .locals 3

    .line 909
    invoke-virtual {p1}, Landroid/os/Message;->getData()Landroid/os/Bundle;

    move-result-object v1

    .line 910
    const/4 v2, 0x0

    .line 911
    if-eqz v1, :cond_0

    .line 913
    const-string v0, "keySearchContactMatchList"

    invoke-virtual {v1, v0}, Landroid/os/Bundle;->getParcelableArrayList(Ljava/lang/String;)Ljava/util/ArrayList;

    move-result-object v2

    .line 914
    if-eqz v2, :cond_0

    .line 916
    invoke-direct {p0, v2}, Lcom/huawei/health/sns/ui/contact/ContactMatchFragment;->d(Ljava/util/ArrayList;)V

    .line 919
    :cond_0
    return-void
.end method

.method static synthetic d(Lcom/huawei/health/sns/ui/contact/ContactMatchFragment;Landroid/os/Message;)V
    .locals 0

    .line 74
    invoke-direct {p0, p1}, Lcom/huawei/health/sns/ui/contact/ContactMatchFragment;->c(Landroid/os/Message;)V

    return-void
.end method

.method private d(Ljava/util/ArrayList;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/ArrayList<Lcom/huawei/health/sns/model/search/SNSSearchBean;>;)V"
        }
    .end annotation

    .line 270
    if-eqz p1, :cond_0

    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-nez v0, :cond_1

    .line 272
    :cond_0
    iget-object v0, p0, Lcom/huawei/health/sns/ui/contact/ContactMatchFragment;->k:Landroid/widget/FrameLayout;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/FrameLayout;->setVisibility(I)V

    .line 273
    iget-object v0, p0, Lcom/huawei/health/sns/ui/contact/ContactMatchFragment;->e:Landroid/widget/ListView;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/ListView;->setVisibility(I)V

    goto :goto_0

    .line 277
    :cond_1
    iget-object v0, p0, Lcom/huawei/health/sns/ui/contact/ContactMatchFragment;->p:Lo/bfu;

    if-eqz v0, :cond_2

    invoke-virtual {p0}, Lcom/huawei/health/sns/ui/contact/ContactMatchFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    if-eqz v0, :cond_2

    invoke-virtual {p0}, Lcom/huawei/health/sns/ui/contact/ContactMatchFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    invoke-virtual {v0}, Landroid/support/v4/app/FragmentActivity;->isFinishing()Z

    move-result v0

    if-nez v0, :cond_2

    .line 279
    iget-object v0, p0, Lcom/huawei/health/sns/ui/contact/ContactMatchFragment;->k:Landroid/widget/FrameLayout;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/FrameLayout;->setVisibility(I)V

    .line 280
    iget-object v0, p0, Lcom/huawei/health/sns/ui/contact/ContactMatchFragment;->e:Landroid/widget/ListView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/ListView;->setVisibility(I)V

    .line 281
    iget-object v0, p0, Lcom/huawei/health/sns/ui/contact/ContactMatchFragment;->p:Lo/bfu;

    invoke-virtual {v0, p1}, Lo/bfu;->e(Ljava/util/ArrayList;)V

    .line 284
    :cond_2
    :goto_0
    return-void
.end method

.method static synthetic e(Lcom/huawei/health/sns/ui/contact/ContactMatchFragment;)V
    .locals 0

    .line 74
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/contact/ContactMatchFragment;->o()V

    return-void
.end method

.method static synthetic e(Lcom/huawei/health/sns/ui/contact/ContactMatchFragment;I)V
    .locals 0

    .line 74
    invoke-direct {p0, p1}, Lcom/huawei/health/sns/ui/contact/ContactMatchFragment;->a(I)V

    return-void
.end method

.method static synthetic e(Lcom/huawei/health/sns/ui/contact/ContactMatchFragment;Landroid/os/Message;)V
    .locals 0

    .line 74
    invoke-direct {p0, p1}, Lcom/huawei/health/sns/ui/contact/ContactMatchFragment;->d(Landroid/os/Message;)V

    return-void
.end method

.method private e(Lo/bfl;)V
    .locals 2

    .line 731
    new-instance v0, Lo/bfs;

    invoke-direct {v0}, Lo/bfs;-><init>()V

    invoke-virtual {p0}, Lcom/huawei/health/sns/ui/contact/ContactMatchFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v1

    invoke-virtual {v0, v1, p1}, Lo/bfs;->a(Landroid/app/Activity;Lo/bfl;)V

    .line 732
    return-void
.end method

.method private f()Z
    .locals 3

    .line 377
    invoke-static {}, Lo/bcb;->b()Lo/bcb;

    move-result-object v0

    const-string v1, "agree_upload_phone_digest"

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Lo/bcb;->b(Ljava/lang/String;Z)Z

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method private static h()Lo/brd;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()Lo/brd<Ljava/util/ArrayList<Lcom/huawei/health/sns/model/user/User;>;>;"
        }
    .end annotation

    .line 463
    new-instance v0, Lcom/huawei/health/sns/ui/contact/ContactMatchFragment$2;

    invoke-direct {v0}, Lcom/huawei/health/sns/ui/contact/ContactMatchFragment$2;-><init>()V

    return-object v0
.end method

.method private i()V
    .locals 4

    .line 427
    invoke-virtual {p0}, Lcom/huawei/health/sns/ui/contact/ContactMatchFragment;->getArguments()Landroid/os/Bundle;

    move-result-object v2

    .line 431
    const-string v0, "KeyFromWhere"

    const-string v1, ""

    :try_start_0
    invoke-virtual {v2, v0, v1}, Landroid/os/Bundle;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/health/sns/ui/contact/ContactMatchFragment;->l:Ljava/lang/String;

    .line 432
    const-string v0, "keyHomeTableType"

    const/4 v1, 0x0

    invoke-virtual {v2, v0, v1}, Landroid/os/Bundle;->getInt(Ljava/lang/String;I)I

    move-result v0

    iput v0, p0, Lcom/huawei/health/sns/ui/contact/ContactMatchFragment;->o:I
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 437
    goto :goto_0

    .line 434
    :catch_0
    move-exception v3

    .line 436
    const-string v0, "ContactMatchFragment"

    const-string v1, "setParams Exception"

    invoke-static {v0, v1}, Lo/bpf;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 440
    :goto_0
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/contact/ContactMatchFragment;->n()V

    .line 441
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/contact/ContactMatchFragment;->m()V

    .line 442
    return-void
.end method

.method private l()V
    .locals 2

    .line 801
    iget-object v0, p0, Lcom/huawei/health/sns/ui/contact/ContactMatchFragment;->a:Lo/bkj;

    if-eqz v0, :cond_0

    .line 803
    invoke-virtual {p0}, Lcom/huawei/health/sns/ui/contact/ContactMatchFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    invoke-virtual {v0}, Landroid/support/v4/app/FragmentActivity;->getContentResolver()Landroid/content/ContentResolver;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/health/sns/ui/contact/ContactMatchFragment;->a:Lo/bkj;

    invoke-virtual {v0, v1}, Landroid/content/ContentResolver;->unregisterContentObserver(Landroid/database/ContentObserver;)V

    .line 805
    :cond_0
    return-void
.end method

.method private m()V
    .locals 5

    .line 582
    iget-object v0, p0, Lcom/huawei/health/sns/ui/contact/ContactMatchFragment;->t:Landroid/view/View;

    if-eqz v0, :cond_1

    .line 584
    invoke-virtual {p0}, Lcom/huawei/health/sns/ui/contact/ContactMatchFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    invoke-static {v0}, Lo/bph;->e(Landroid/content/Context;)Z

    move-result v0

    if-nez v0, :cond_0

    invoke-virtual {p0}, Lcom/huawei/health/sns/ui/contact/ContactMatchFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    invoke-static {v0}, Lo/bph;->b(Landroid/content/Context;)Z

    move-result v0

    if-nez v0, :cond_0

    invoke-static {}, Lo/bom;->i()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 586
    iget-object v0, p0, Lcom/huawei/health/sns/ui/contact/ContactMatchFragment;->t:Landroid/view/View;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 587
    iget-object v0, p0, Lcom/huawei/health/sns/ui/contact/ContactMatchFragment;->t:Landroid/view/View;

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    invoke-virtual {v0, v1, v2, v3, v4}, Landroid/view/View;->setPadding(IIII)V

    goto :goto_0

    .line 591
    :cond_0
    iget-object v0, p0, Lcom/huawei/health/sns/ui/contact/ContactMatchFragment;->t:Landroid/view/View;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 592
    iget-object v0, p0, Lcom/huawei/health/sns/ui/contact/ContactMatchFragment;->t:Landroid/view/View;

    iget-object v1, p0, Lcom/huawei/health/sns/ui/contact/ContactMatchFragment;->t:Landroid/view/View;

    invoke-virtual {v1}, Landroid/view/View;->getHeight()I

    move-result v1

    neg-int v1, v1

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    invoke-virtual {v0, v2, v1, v3, v4}, Landroid/view/View;->setPadding(IIII)V

    .line 595
    :cond_1
    :goto_0
    return-void
.end method

.method private n()V
    .locals 4

    .line 570
    const-string v0, "openContactMatchFromFirstOpen"

    iget-object v1, p0, Lcom/huawei/health/sns/ui/contact/ContactMatchFragment;->l:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 572
    invoke-virtual {p0}, Lcom/huawei/health/sns/ui/contact/ContactMatchFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    invoke-static {v0}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v0

    sget v1, Lcom/huawei/android/sns/R$layout;->sns_null_bottom_view:I

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/health/sns/ui/contact/ContactMatchFragment;->t:Landroid/view/View;

    .line 573
    iget-object v0, p0, Lcom/huawei/health/sns/ui/contact/ContactMatchFragment;->e:Landroid/widget/ListView;

    iget-object v1, p0, Lcom/huawei/health/sns/ui/contact/ContactMatchFragment;->t:Landroid/view/View;

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-virtual {v0, v1, v2, v3}, Landroid/widget/ListView;->addFooterView(Landroid/view/View;Ljava/lang/Object;Z)V

    .line 575
    :cond_0
    return-void
.end method

.method private o()V
    .locals 1

    .line 540
    iget-object v0, p0, Lcom/huawei/health/sns/ui/contact/ContactMatchFragment;->q:Lo/bio;

    if-eqz v0, :cond_0

    .line 542
    iget-object v0, p0, Lcom/huawei/health/sns/ui/contact/ContactMatchFragment;->q:Lo/bio;

    invoke-virtual {v0}, Lo/bio;->c()V

    .line 544
    :cond_0
    return-void
.end method

.method private p()V
    .locals 4

    .line 791
    new-instance v0, Lo/bkj;

    iget-object v1, p0, Lcom/huawei/health/sns/ui/contact/ContactMatchFragment;->z:Landroid/os/Handler;

    invoke-direct {v0, v1}, Lo/bkj;-><init>(Landroid/os/Handler;)V

    iput-object v0, p0, Lcom/huawei/health/sns/ui/contact/ContactMatchFragment;->a:Lo/bkj;

    .line 792
    invoke-virtual {p0}, Lcom/huawei/health/sns/ui/contact/ContactMatchFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    invoke-virtual {v0}, Landroid/support/v4/app/FragmentActivity;->getContentResolver()Landroid/content/ContentResolver;

    move-result-object v0

    sget-object v1, Lo/bbz$p;->c:Landroid/net/Uri;

    iget-object v2, p0, Lcom/huawei/health/sns/ui/contact/ContactMatchFragment;->a:Lo/bkj;

    const/4 v3, 0x1

    invoke-virtual {v0, v1, v3, v2}, Landroid/content/ContentResolver;->registerContentObserver(Landroid/net/Uri;ZLandroid/database/ContentObserver;)V

    .line 794
    return-void
.end method


# virtual methods
.method protected b()V
    .locals 2

    .line 503
    const-string v0, "ContactMatchFragment"

    const-string v1, "start uploadMatchContact"

    invoke-static {v0, v1}, Lo/bpf;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 505
    invoke-virtual {p0}, Lcom/huawei/health/sns/ui/contact/ContactMatchFragment;->d()V

    .line 507
    invoke-static {}, Lo/arw;->c()Lo/asb;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/health/sns/ui/contact/ContactMatchFragment;->z:Landroid/os/Handler;

    invoke-virtual {v0, v1}, Lo/asb;->b(Landroid/os/Handler;)V

    .line 508
    return-void
.end method

.method public c()V
    .locals 2

    .line 289
    new-instance v0, Lo/bfu;

    invoke-virtual {p0}, Lcom/huawei/health/sns/ui/contact/ContactMatchFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v1

    invoke-direct {v0, v1}, Lo/bfu;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Lcom/huawei/health/sns/ui/contact/ContactMatchFragment;->p:Lo/bfu;

    .line 290
    iget-object v0, p0, Lcom/huawei/health/sns/ui/contact/ContactMatchFragment;->p:Lo/bfu;

    new-instance v1, Lo/bfw;

    invoke-direct {v1}, Lo/bfw;-><init>()V

    invoke-virtual {v0, v1}, Lo/bfu;->b(Lo/bfn;)V

    .line 291
    iget-object v0, p0, Lcom/huawei/health/sns/ui/contact/ContactMatchFragment;->p:Lo/bfu;

    iput-object v0, p0, Lcom/huawei/health/sns/ui/contact/ContactMatchFragment;->c:Lo/bfq;

    .line 292
    return-void
.end method

.method public c(Lo/bfl;)V
    .locals 0

    .line 617
    invoke-direct {p0, p1}, Lcom/huawei/health/sns/ui/contact/ContactMatchFragment;->e(Lo/bfl;)V

    .line 618
    return-void
.end method

.method protected d()V
    .locals 5

    .line 515
    invoke-virtual {p0}, Lcom/huawei/health/sns/ui/contact/ContactMatchFragment;->isAdded()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 517
    invoke-virtual {p0}, Lcom/huawei/health/sns/ui/contact/ContactMatchFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v4

    .line 518
    iget-object v0, p0, Lcom/huawei/health/sns/ui/contact/ContactMatchFragment;->q:Lo/bio;

    if-nez v0, :cond_0

    .line 521
    if-eqz v4, :cond_0

    invoke-virtual {v4}, Landroid/app/Activity;->isFinishing()Z

    move-result v0

    if-nez v0, :cond_0

    .line 523
    new-instance v0, Lo/bio;

    sget v1, Lcom/huawei/android/sns/R$string;->sns_match_contact_dialog_title:I

    .line 524
    invoke-virtual {p0, v1}, Lcom/huawei/health/sns/ui/contact/ContactMatchFragment;->getString(I)Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x0

    const/4 v3, 0x1

    invoke-direct {v0, v4, v2, v1, v3}, Lo/bio;-><init>(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Z)V

    iput-object v0, p0, Lcom/huawei/health/sns/ui/contact/ContactMatchFragment;->q:Lo/bio;

    .line 527
    :cond_0
    iget-object v0, p0, Lcom/huawei/health/sns/ui/contact/ContactMatchFragment;->q:Lo/bio;

    if-eqz v0, :cond_1

    .line 529
    iget-object v0, p0, Lcom/huawei/health/sns/ui/contact/ContactMatchFragment;->q:Lo/bio;

    invoke-virtual {v0}, Lo/bio;->a()V

    .line 532
    :cond_1
    return-void
.end method

.method public d(Lo/bfl;)V
    .locals 0

    .line 611
    invoke-direct {p0, p1}, Lcom/huawei/health/sns/ui/contact/ContactMatchFragment;->e(Lo/bfl;)V

    .line 612
    return-void
.end method

.method public e()V
    .locals 0

    .line 784
    return-void
.end method

.method protected e(Ljava/lang/String;I)V
    .locals 2

    .line 173
    new-instance v1, Landroid/os/Bundle;

    invoke-direct {v1}, Landroid/os/Bundle;-><init>()V

    .line 174
    const-string v0, "KeyFromWhere"

    invoke-virtual {v1, v0, p1}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 175
    const-string v0, "keyHomeTableType"

    invoke-virtual {v1, v0, p2}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    .line 176
    invoke-virtual {p0, v1}, Lcom/huawei/health/sns/ui/contact/ContactMatchFragment;->setArguments(Landroid/os/Bundle;)V

    .line 177
    return-void
.end method

.method protected g()V
    .locals 2

    .line 548
    iget-object v0, p0, Lcom/huawei/health/sns/ui/contact/ContactMatchFragment;->d:Lo/bfm;

    if-eqz v0, :cond_0

    .line 550
    iget-object v0, p0, Lcom/huawei/health/sns/ui/contact/ContactMatchFragment;->d:Lo/bfm;

    new-instance v1, Lo/bfw;

    invoke-direct {v1}, Lo/bfw;-><init>()V

    invoke-virtual {v0, v1}, Lo/bfm;->a(Lo/bfn;)V

    .line 552
    :cond_0
    return-void
.end method

.method public k()V
    .locals 2

    .line 924
    invoke-virtual {p0}, Lcom/huawei/health/sns/ui/contact/ContactMatchFragment;->b()V

    .line 925
    iget-object v0, p0, Lcom/huawei/health/sns/ui/contact/ContactMatchFragment;->i:Lo/bni;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Lo/bni;->setVisibility(I)V

    .line 926
    return-void
.end method

.method public onClose()Z
    .locals 2

    .line 659
    iget-object v0, p0, Lcom/huawei/health/sns/ui/contact/ContactMatchFragment;->k:Landroid/widget/FrameLayout;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/FrameLayout;->setVisibility(I)V

    .line 660
    iget-object v0, p0, Lcom/huawei/health/sns/ui/contact/ContactMatchFragment;->e:Landroid/widget/ListView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/ListView;->setVisibility(I)V

    .line 661
    iget-object v0, p0, Lcom/huawei/health/sns/ui/contact/ContactMatchFragment;->p:Lo/bfu;

    if-eqz v0, :cond_0

    .line 663
    iget-object v0, p0, Lcom/huawei/health/sns/ui/contact/ContactMatchFragment;->p:Lo/bfu;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lo/bfu;->e(Ljava/util/ArrayList;)V

    .line 665
    :cond_0
    const/4 v0, 0x1

    return v0
.end method

.method public onConfigurationChanged(Landroid/content/res/Configuration;)V
    .locals 4

    .line 718
    invoke-super {p0, p1}, Lcom/huawei/health/sns/ui/common/FunctionFragment;->onConfigurationChanged(Landroid/content/res/Configuration;)V

    .line 719
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/contact/ContactMatchFragment;->m()V

    .line 720
    iget-object v0, p0, Lcom/huawei/health/sns/ui/contact/ContactMatchFragment;->g:Landroid/widget/LinearLayout;

    invoke-virtual {p0}, Lcom/huawei/health/sns/ui/contact/ContactMatchFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v1

    invoke-static {v0, v1}, Lo/bph;->b(Landroid/widget/LinearLayout;Landroid/app/Activity;)V

    .line 721
    iget-object v0, p0, Lcom/huawei/health/sns/ui/contact/ContactMatchFragment;->r:Landroid/widget/LinearLayout;

    iget-object v1, p0, Lcom/huawei/health/sns/ui/contact/ContactMatchFragment;->f:Landroid/widget/ImageView;

    invoke-virtual {p0}, Lcom/huawei/health/sns/ui/contact/ContactMatchFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v2

    const/4 v3, 0x1

    invoke-static {v0, v1, v2, v3}, Lo/bph;->c(Landroid/widget/LinearLayout;Landroid/widget/ImageView;Landroid/app/Activity;Z)V

    .line 722
    return-void
.end method

.method public onContextItemSelected(Landroid/view/MenuItem;)Z
    .locals 1

    .line 623
    invoke-super {p0, p1}, Lcom/huawei/health/sns/ui/common/FunctionFragment;->onContextItemSelected(Landroid/view/MenuItem;)Z

    move-result v0

    return v0
.end method

.method public onCreateOptionsMenu(Landroid/view/Menu;Landroid/view/MenuInflater;)V
    .locals 2

    .line 557
    const-string v0, "openContactMatchFromFirstOpen"

    iget-object v1, p0, Lcom/huawei/health/sns/ui/contact/ContactMatchFragment;->l:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 560
    sget v0, Lcom/huawei/android/sns/R$menu;->sns_action_bar_finish_menu_emui50:I

    invoke-virtual {p2, v0, p1}, Landroid/view/MenuInflater;->inflate(ILandroid/view/Menu;)V

    .line 562
    :cond_0
    invoke-super {p0, p1, p2}, Lcom/huawei/health/sns/ui/common/FunctionFragment;->onCreateOptionsMenu(Landroid/view/Menu;Landroid/view/MenuInflater;)V

    .line 563
    return-void
.end method

.method public onCreateView(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;
    .locals 1

    .line 297
    invoke-super {p0, p1, p2, p3}, Lcom/huawei/health/sns/ui/common/FunctionFragment;->onCreateView(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/health/sns/ui/contact/ContactMatchFragment;->b:Landroid/view/View;

    .line 300
    invoke-direct {p0, p1}, Lcom/huawei/health/sns/ui/contact/ContactMatchFragment;->c(Landroid/view/LayoutInflater;)V

    .line 303
    invoke-virtual {p0}, Lcom/huawei/health/sns/ui/contact/ContactMatchFragment;->g()V

    .line 306
    const/4 v0, 0x1

    invoke-direct {p0, v0}, Lcom/huawei/health/sns/ui/contact/ContactMatchFragment;->c(I)V

    .line 309
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/contact/ContactMatchFragment;->p()V

    .line 312
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/contact/ContactMatchFragment;->i()V

    .line 314
    iget-object v0, p0, Lcom/huawei/health/sns/ui/contact/ContactMatchFragment;->b:Landroid/view/View;

    return-object v0
.end method

.method public onDestroyView()V
    .locals 1

    .line 671
    invoke-static {}, Lo/arw;->c()Lo/asb;

    move-result-object v0

    invoke-virtual {v0}, Lo/asb;->c()V

    .line 672
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/contact/ContactMatchFragment;->l()V

    .line 674
    invoke-static {}, Lo/arw;->a()Lo/arw;

    move-result-object v0

    invoke-virtual {v0}, Lo/arw;->b()V

    .line 675
    invoke-super {p0}, Lcom/huawei/health/sns/ui/common/FunctionFragment;->onDestroyView()V

    .line 676
    return-void
.end method

.method public onOptionsItemSelected(Landroid/view/MenuItem;)Z
    .locals 3

    .line 600
    new-instance v2, Landroid/content/Intent;

    invoke-virtual {p0}, Lcom/huawei/health/sns/ui/contact/ContactMatchFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    const-class v1, Lcom/huawei/health/sns/ui/HomeActivity;

    invoke-direct {v2, v0, v1}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 601
    const-string v0, "keyHomeTableType"

    iget v1, p0, Lcom/huawei/health/sns/ui/contact/ContactMatchFragment;->o:I

    invoke-virtual {v2, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    .line 603
    invoke-virtual {p0}, Lcom/huawei/health/sns/ui/contact/ContactMatchFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    invoke-virtual {v0, v2}, Landroid/support/v4/app/FragmentActivity;->startActivity(Landroid/content/Intent;)V

    .line 604
    invoke-virtual {p0}, Lcom/huawei/health/sns/ui/contact/ContactMatchFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    invoke-virtual {v0}, Landroid/support/v4/app/FragmentActivity;->finish()V

    .line 605
    invoke-super {p0, p1}, Lcom/huawei/health/sns/ui/common/FunctionFragment;->onOptionsItemSelected(Landroid/view/MenuItem;)Z

    move-result v0

    return v0
.end method

.method public onQueryTextChange(Ljava/lang/String;)Z
    .locals 2

    .line 644
    invoke-virtual {p1}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v1

    .line 645
    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 647
    invoke-virtual {p0}, Lcom/huawei/health/sns/ui/contact/ContactMatchFragment;->onClose()Z

    goto :goto_0

    .line 651
    :cond_0
    invoke-direct {p0, p1}, Lcom/huawei/health/sns/ui/contact/ContactMatchFragment;->b(Ljava/lang/String;)V

    .line 653
    :goto_0
    const/4 v0, 0x1

    return v0
.end method

.method public onQueryTextSubmit(Ljava/lang/String;)Z
    .locals 2

    .line 629
    invoke-virtual {p1}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v1

    .line 630
    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 632
    invoke-virtual {p0}, Lcom/huawei/health/sns/ui/contact/ContactMatchFragment;->onClose()Z

    goto :goto_0

    .line 636
    :cond_0
    invoke-direct {p0, p1}, Lcom/huawei/health/sns/ui/contact/ContactMatchFragment;->b(Ljava/lang/String;)V

    .line 638
    :goto_0
    const/4 v0, 0x1

    return v0
.end method

.method public onRequestPermissionsResult(I[Ljava/lang/String;[I)V
    .locals 5

    .line 383
    const/16 v0, 0x2711

    if-ne p1, v0, :cond_5

    .line 385
    iget-boolean v0, p0, Lcom/huawei/health/sns/ui/contact/ContactMatchFragment;->v:Z

    if-eqz v0, :cond_0

    .line 388
    invoke-virtual {p0}, Lcom/huawei/health/sns/ui/contact/ContactMatchFragment;->b()V

    goto/16 :goto_2

    .line 390
    :cond_0
    if-eqz p2, :cond_5

    if-eqz p3, :cond_5

    .line 392
    const/4 v3, 0x0

    .line 393
    const/4 v4, 0x0

    :goto_0
    array-length v0, p2

    if-ge v4, v0, :cond_3

    .line 395
    const-string v0, "android.permission.READ_EXTERNAL_STORAGE"

    aget-object v1, p2, v4

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    array-length v0, p3

    if-ge v4, v0, :cond_1

    aget v0, p3, v4

    if-nez v0, :cond_1

    .line 398
    invoke-static {}, Lo/bpk;->b()Lo/bpk;

    move-result-object v0

    invoke-virtual {v0}, Lo/bpk;->c()V

    goto :goto_1

    .line 400
    :cond_1
    const-string v0, "android.permission.READ_CONTACTS"

    aget-object v1, p2, v4

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    array-length v0, p3

    if-ge v4, v0, :cond_2

    aget v0, p3, v4

    if-nez v0, :cond_2

    .line 403
    const/4 v3, 0x1

    .line 393
    :cond_2
    :goto_1
    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    .line 407
    :cond_3
    const-string v0, "ContactMatchFragment"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "permission check can read contacts is "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/bpf;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 408
    if-eqz v3, :cond_4

    .line 411
    invoke-virtual {p0}, Lcom/huawei/health/sns/ui/contact/ContactMatchFragment;->b()V

    goto :goto_2

    .line 416
    :cond_4
    const/4 v0, 0x2

    invoke-direct {p0, v0}, Lcom/huawei/health/sns/ui/contact/ContactMatchFragment;->c(I)V

    .line 420
    :cond_5
    :goto_2
    return-void
.end method

.method public onViewCreated(Landroid/view/View;Landroid/os/Bundle;)V
    .locals 7
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "NewApi"
        }
    .end annotation

    .line 321
    invoke-super {p0, p1, p2}, Lcom/huawei/health/sns/ui/common/FunctionFragment;->onViewCreated(Landroid/view/View;Landroid/os/Bundle;)V

    .line 322
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/contact/ContactMatchFragment;->f()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 324
    invoke-static {}, Lo/bcb;->b()Lo/bcb;

    move-result-object v0

    const-string v1, "agree_upload_phone_digest"

    const/4 v2, 0x1

    invoke-virtual {v0, v1, v2}, Lo/bcb;->e(Ljava/lang/String;Z)Z

    .line 327
    :cond_0
    invoke-static {}, Lo/brg;->c()Z

    move-result v0

    if-eqz v0, :cond_3

    .line 329
    const/4 v0, 0x3

    new-array v4, v0, [Ljava/lang/String;

    const-string v0, "android.permission.READ_CONTACTS"

    const/4 v1, 0x0

    aput-object v0, v4, v1

    const-string v0, "android.permission.READ_EXTERNAL_STORAGE"

    const/4 v1, 0x1

    aput-object v0, v4, v1

    const-string v0, "android.permission.WRITE_EXTERNAL_STORAGE"

    const/4 v1, 0x2

    aput-object v0, v4, v1

    .line 332
    invoke-virtual {p0}, Lcom/huawei/health/sns/ui/contact/ContactMatchFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    invoke-static {v0, v4}, Lo/biq;->a(Landroid/content/Context;[Ljava/lang/String;)Ljava/util/List;

    move-result-object v5

    .line 334
    invoke-virtual {p0}, Lcom/huawei/health/sns/ui/contact/ContactMatchFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/String;

    const-string v2, "android.permission.READ_CONTACTS"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/biq;->d(Landroid/content/Context;[Ljava/lang/String;)Z

    move-result v0

    iput-boolean v0, p0, Lcom/huawei/health/sns/ui/contact/ContactMatchFragment;->v:Z

    .line 337
    invoke-interface {v5}, Ljava/util/List;->size()I

    move-result v0

    if-lez v0, :cond_2

    .line 339
    const-string v0, "ContactMatchFragment"

    const-string v1, "should request permission"

    invoke-static {v0, v1}, Lo/bpf;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 340
    invoke-virtual {p0}, Lcom/huawei/health/sns/ui/contact/ContactMatchFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    instance-of v0, v0, Lcom/huawei/health/sns/ui/contact/ContactMatchActivity;

    if-eqz v0, :cond_1

    .line 342
    invoke-virtual {p0}, Lcom/huawei/health/sns/ui/contact/ContactMatchFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    move-object v6, v0

    check-cast v6, Lcom/huawei/health/sns/ui/contact/ContactMatchActivity;

    .line 343
    invoke-virtual {v6, p0}, Lcom/huawei/health/sns/ui/contact/ContactMatchActivity;->c(Lcom/huawei/health/sns/ui/contact/ContactMatchActivity$c;)V

    .line 346
    :cond_1
    invoke-virtual {p0}, Lcom/huawei/health/sns/ui/contact/ContactMatchFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    invoke-interface {v5}, Ljava/util/List;->size()I

    move-result v1

    new-array v1, v1, [Ljava/lang/String;

    invoke-interface {v5, v1}, Ljava/util/List;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object v1

    check-cast v1, [Ljava/lang/String;

    const/16 v2, 0x2711

    invoke-virtual {v0, v1, v2}, Landroid/support/v4/app/FragmentActivity;->requestPermissions([Ljava/lang/String;I)V

    goto :goto_0

    .line 352
    :cond_2
    invoke-virtual {p0}, Lcom/huawei/health/sns/ui/contact/ContactMatchFragment;->b()V

    .line 354
    :goto_0
    goto :goto_1

    .line 358
    :cond_3
    invoke-virtual {p0}, Lcom/huawei/health/sns/ui/contact/ContactMatchFragment;->b()V

    .line 361
    :goto_1
    invoke-static {}, Lo/bcb;->b()Lo/bcb;

    move-result-object v0

    const-string v1, "agree_upload_phone_digest_new"

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Lo/bcb;->b(Ljava/lang/String;Z)Z

    move-result v4

    .line 363
    if-eqz v4, :cond_4

    .line 366
    invoke-static {}, Lo/awj;->b()Lo/awj;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lo/awj;->e(Lo/awj$a;)V

    .line 368
    :cond_4
    return-void
.end method
