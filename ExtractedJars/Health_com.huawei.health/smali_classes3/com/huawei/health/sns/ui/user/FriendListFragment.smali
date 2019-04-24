.class public Lcom/huawei/health/sns/ui/user/FriendListFragment;
.super Lcom/huawei/health/sns/ui/common/FunctionFragment;
.source "SourceFile"

# interfaces
.implements Lo/avk$d;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/huawei/health/sns/ui/user/FriendListFragment$e;
    }
.end annotation


# static fields
.field public static final a:Ljava/lang/String;


# instance fields
.field private l:Lo/bnd;

.field private m:Lo/bkf;

.field private o:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<Lcom/huawei/health/sns/model/user/User;>;"
        }
    .end annotation
.end field

.field private p:Lo/axd;

.field private q:Landroid/view/View;

.field private r:Z

.field private s:Lo/bkj;

.field private t:Lo/bgo;

.field private u:Lo/bkm;

.field private x:Lo/bkh;

.field private z:Landroid/os/Handler;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 68
    const-class v0, Lcom/huawei/health/sns/ui/user/FriendListFragment;

    invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lcom/huawei/health/sns/ui/user/FriendListFragment;->a:Ljava/lang/String;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    .line 66
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/common/FunctionFragment;-><init>()V

    .line 101
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/health/sns/ui/user/FriendListFragment;->o:Ljava/util/List;

    .line 106
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/health/sns/ui/user/FriendListFragment;->r:Z

    .line 111
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/health/sns/ui/user/FriendListFragment;->q:Landroid/view/View;

    .line 122
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/health/sns/ui/user/FriendListFragment;->x:Lo/bkh;

    .line 127
    new-instance v0, Lcom/huawei/health/sns/ui/user/FriendListFragment$e;

    invoke-direct {v0, p0}, Lcom/huawei/health/sns/ui/user/FriendListFragment$e;-><init>(Lcom/huawei/health/sns/ui/user/FriendListFragment;)V

    iput-object v0, p0, Lcom/huawei/health/sns/ui/user/FriendListFragment;->z:Landroid/os/Handler;

    return-void
.end method

.method private static a(Landroid/os/Handler;)Lo/brc;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Landroid/os/Handler;)Lo/brc<Ljava/lang/Integer;>;"
        }
    .end annotation

    .line 484
    new-instance v0, Lcom/huawei/health/sns/ui/user/FriendListFragment$3;

    invoke-direct {v0, p0}, Lcom/huawei/health/sns/ui/user/FriendListFragment$3;-><init>(Landroid/os/Handler;)V

    return-object v0
.end method

.method private a(I)V
    .locals 1

    .line 783
    iget-object v0, p0, Lcom/huawei/health/sns/ui/user/FriendListFragment;->m:Lo/bkf;

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Lcom/huawei/health/sns/ui/user/FriendListFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Lcom/huawei/health/sns/ui/user/FriendListFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    invoke-virtual {v0}, Landroid/support/v4/app/FragmentActivity;->isFinishing()Z

    move-result v0

    if-nez v0, :cond_0

    .line 785
    iget-object v0, p0, Lcom/huawei/health/sns/ui/user/FriendListFragment;->m:Lo/bkf;

    invoke-virtual {v0, p1}, Lo/bkf;->a(I)V

    .line 787
    :cond_0
    return-void
.end method

.method static synthetic a(Lcom/huawei/health/sns/ui/user/FriendListFragment;)V
    .locals 0

    .line 66
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/user/FriendListFragment;->m()V

    return-void
.end method

.method static synthetic a(Lcom/huawei/health/sns/ui/user/FriendListFragment;JLjava/lang/String;)V
    .locals 0

    .line 66
    invoke-direct {p0, p1, p2, p3}, Lcom/huawei/health/sns/ui/user/FriendListFragment;->e(JLjava/lang/String;)V

    return-void
.end method

.method private a(Ljava/util/List;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Lcom/huawei/health/sns/model/user/UserNotify;>;)V"
        }
    .end annotation

    .line 750
    iget-object v0, p0, Lcom/huawei/health/sns/ui/user/FriendListFragment;->m:Lo/bkf;

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Lcom/huawei/health/sns/ui/user/FriendListFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Lcom/huawei/health/sns/ui/user/FriendListFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    invoke-virtual {v0}, Landroid/support/v4/app/FragmentActivity;->isFinishing()Z

    move-result v0

    if-nez v0, :cond_0

    .line 752
    iget-object v0, p0, Lcom/huawei/health/sns/ui/user/FriendListFragment;->m:Lo/bkf;

    invoke-virtual {v0, p1}, Lo/bkf;->e(Ljava/util/List;)V

    .line 754
    :cond_0
    return-void
.end method

.method private static b(Landroid/os/Handler;)Lo/brc;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Landroid/os/Handler;)Lo/brc<Ljava/lang/Integer;>;"
        }
    .end annotation

    .line 671
    new-instance v0, Lcom/huawei/health/sns/ui/user/FriendListFragment$9;

    invoke-direct {v0, p0}, Lcom/huawei/health/sns/ui/user/FriendListFragment$9;-><init>(Landroid/os/Handler;)V

    return-object v0
.end method

.method private b(I)V
    .locals 1

    .line 739
    iget-object v0, p0, Lcom/huawei/health/sns/ui/user/FriendListFragment;->m:Lo/bkf;

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Lcom/huawei/health/sns/ui/user/FriendListFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Lcom/huawei/health/sns/ui/user/FriendListFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    invoke-virtual {v0}, Landroid/support/v4/app/FragmentActivity;->isFinishing()Z

    move-result v0

    if-nez v0, :cond_0

    .line 741
    iget-object v0, p0, Lcom/huawei/health/sns/ui/user/FriendListFragment;->m:Lo/bkf;

    invoke-virtual {v0, p1}, Lo/bkf;->d(I)V

    .line 743
    :cond_0
    return-void
.end method

.method private b(Landroid/os/Message;)V
    .locals 5

    .line 295
    invoke-virtual {p1}, Landroid/os/Message;->getData()Landroid/os/Bundle;

    move-result-object v2

    .line 297
    if-eqz v2, :cond_0

    .line 299
    const-string v0, "bundleKeyFriendList"

    invoke-virtual {v2, v0}, Landroid/os/Bundle;->getParcelableArrayList(Ljava/lang/String;)Ljava/util/ArrayList;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/health/sns/ui/user/FriendListFragment;->o:Ljava/util/List;

    .line 300
    iget-object v0, p0, Lcom/huawei/health/sns/ui/user/FriendListFragment;->o:Ljava/util/List;

    if-eqz v0, :cond_0

    .line 302
    iget-object v0, p0, Lcom/huawei/health/sns/ui/user/FriendListFragment;->o:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :goto_0
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Lcom/huawei/health/sns/model/user/User;

    .line 304
    sget-object v0, Lo/bfp$c;->d:Lo/bfp$c;

    const/16 v1, 0x16

    invoke-virtual {v4, v1, v0}, Lcom/huawei/health/sns/model/user/User;->setCardEvnetType(ILo/bfp$c;)V

    .line 305
    goto :goto_0

    .line 308
    :cond_0
    iget-object v0, p0, Lcom/huawei/health/sns/ui/user/FriendListFragment;->o:Ljava/util/List;

    invoke-direct {p0, v0}, Lcom/huawei/health/sns/ui/user/FriendListFragment;->e(Ljava/util/List;)V

    .line 309
    return-void
.end method

.method static synthetic b(Lcom/huawei/health/sns/ui/user/FriendListFragment;)V
    .locals 0

    .line 66
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/user/FriendListFragment;->i()V

    return-void
.end method

.method static synthetic b(Lcom/huawei/health/sns/ui/user/FriendListFragment;I)V
    .locals 0

    .line 66
    invoke-direct {p0, p1}, Lcom/huawei/health/sns/ui/user/FriendListFragment;->b(I)V

    return-void
.end method

.method private b(Lo/auu$b;)V
    .locals 5

    .line 403
    sget-object v0, Lo/auu$b;->b:Lo/auu$b;

    if-ne p1, v0, :cond_0

    .line 406
    invoke-virtual {p0}, Lcom/huawei/health/sns/ui/user/FriendListFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/health/sns/ui/user/FriendListFragment;->z:Landroid/os/Handler;

    const/4 v2, 0x1

    const/4 v3, 0x0

    invoke-static {v0, v2, v3, v1}, Lo/axj;->c(Landroid/app/Activity;IZLandroid/os/Handler;)V

    goto :goto_0

    .line 409
    :cond_0
    sget-object v0, Lo/auu$b;->c:Lo/auu$b;

    if-ne p1, v0, :cond_1

    .line 411
    new-instance v4, Lo/asz;

    const/4 v0, 0x0

    invoke-direct {v4, v0}, Lo/asz;-><init>(Landroid/os/Handler;)V

    .line 413
    iget-object v0, p0, Lcom/huawei/health/sns/ui/user/FriendListFragment;->z:Landroid/os/Handler;

    const/4 v1, 0x0

    invoke-virtual {v4, v1, v0}, Lo/asz;->b(ZLandroid/os/Handler;)V

    .line 415
    :cond_1
    :goto_0
    return-void
.end method

.method private static c(Landroid/os/Handler;)Lo/brc;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Landroid/os/Handler;)Lo/brc<Ljava/util/List<Lcom/huawei/health/sns/model/user/UserNotify;>;>;"
        }
    .end annotation

    .line 592
    new-instance v0, Lcom/huawei/health/sns/ui/user/FriendListFragment$8;

    invoke-direct {v0, p0}, Lcom/huawei/health/sns/ui/user/FriendListFragment$8;-><init>(Landroid/os/Handler;)V

    return-object v0
.end method

.method private c(I)V
    .locals 2

    .line 276
    const v0, 0xdac1

    if-ne p1, v0, :cond_0

    .line 278
    invoke-virtual {p0}, Lcom/huawei/health/sns/ui/user/FriendListFragment;->b()V

    goto :goto_0

    .line 280
    :cond_0
    const v0, 0xdac2

    if-eq p1, v0, :cond_1

    .line 283
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/user/FriendListFragment;->h()Z

    move-result v0

    if-nez v0, :cond_1

    .line 285
    invoke-virtual {p0}, Lcom/huawei/health/sns/ui/user/FriendListFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    const/4 v1, 0x0

    invoke-static {p1, v1}, Lcom/huawei/health/sns/util/protocol/snsKit/bean/SNSHttpCode;->getErrResId(II)I

    move-result v1

    invoke-static {v0, v1}, Lo/brh;->c(Landroid/app/Activity;I)V

    .line 288
    :cond_1
    :goto_0
    return-void
.end method

.method private c(Landroid/os/Message;)V
    .locals 5

    .line 257
    invoke-virtual {p1}, Landroid/os/Message;->getData()Landroid/os/Bundle;

    move-result-object v3

    .line 258
    if-eqz v3, :cond_0

    .line 260
    const-string v0, "bundleKeyUserNotifyList"

    invoke-virtual {v3, v0}, Landroid/os/Bundle;->getParcelableArrayList(Ljava/lang/String;)Ljava/util/ArrayList;

    move-result-object v4

    .line 261
    if-eqz v4, :cond_0

    .line 263
    sget-object v0, Lcom/huawei/health/sns/ui/user/FriendListFragment;->a:Ljava/lang/String;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "BUNDLE_KEY_USER_NOTIFY_LIST recommendUpdate:"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-interface {v4}, Ljava/util/List;->size()I

    move-result v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/bpf;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 264
    invoke-direct {p0, v4}, Lcom/huawei/health/sns/ui/user/FriendListFragment;->a(Ljava/util/List;)V

    .line 267
    :cond_0
    return-void
.end method

.method static synthetic c(Lcom/huawei/health/sns/ui/user/FriendListFragment;)V
    .locals 0

    .line 66
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/user/FriendListFragment;->f()V

    return-void
.end method

.method static synthetic c(Lcom/huawei/health/sns/ui/user/FriendListFragment;I)V
    .locals 0

    .line 66
    invoke-direct {p0, p1}, Lcom/huawei/health/sns/ui/user/FriendListFragment;->a(I)V

    return-void
.end method

.method static synthetic c(Lcom/huawei/health/sns/ui/user/FriendListFragment;Landroid/os/Message;)V
    .locals 0

    .line 66
    invoke-direct {p0, p1}, Lcom/huawei/health/sns/ui/user/FriendListFragment;->c(Landroid/os/Message;)V

    return-void
.end method

.method private static d(Landroid/os/Handler;)Lo/brc;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Landroid/os/Handler;)Lo/brc<Ljava/util/ArrayList<Lcom/huawei/health/sns/model/user/User;>;>;"
        }
    .end annotation

    .line 536
    new-instance v0, Lcom/huawei/health/sns/ui/user/FriendListFragment$2;

    invoke-direct {v0, p0}, Lcom/huawei/health/sns/ui/user/FriendListFragment$2;-><init>(Landroid/os/Handler;)V

    return-object v0
.end method

.method static synthetic d(Lcom/huawei/health/sns/ui/user/FriendListFragment;)V
    .locals 0

    .line 66
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/user/FriendListFragment;->o()V

    return-void
.end method

.method private e(JLjava/lang/String;)V
    .locals 1

    .line 764
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/user/FriendListFragment;->l()Lo/axd;

    move-result-object v0

    invoke-virtual {v0, p1, p2, p3}, Lo/axd;->b(JLjava/lang/String;)V

    .line 765
    return-void
.end method

.method static synthetic e(Lcom/huawei/health/sns/ui/user/FriendListFragment;I)V
    .locals 0

    .line 66
    invoke-direct {p0, p1}, Lcom/huawei/health/sns/ui/user/FriendListFragment;->c(I)V

    return-void
.end method

.method static synthetic e(Lcom/huawei/health/sns/ui/user/FriendListFragment;Landroid/os/Message;)V
    .locals 0

    .line 66
    invoke-direct {p0, p1}, Lcom/huawei/health/sns/ui/user/FriendListFragment;->b(Landroid/os/Message;)V

    return-void
.end method

.method private e(Ljava/util/List;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Lcom/huawei/health/sns/model/user/User;>;)V"
        }
    .end annotation

    .line 695
    iget-object v0, p0, Lcom/huawei/health/sns/ui/user/FriendListFragment;->m:Lo/bkf;

    if-eqz v0, :cond_3

    invoke-virtual {p0}, Lcom/huawei/health/sns/ui/user/FriendListFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    if-eqz v0, :cond_3

    invoke-virtual {p0}, Lcom/huawei/health/sns/ui/user/FriendListFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    invoke-virtual {v0}, Landroid/support/v4/app/FragmentActivity;->isFinishing()Z

    move-result v0

    if-nez v0, :cond_3

    .line 697
    iget-object v0, p0, Lcom/huawei/health/sns/ui/user/FriendListFragment;->l:Lo/bnd;

    invoke-virtual {v0}, Lo/bnd;->getAdapter()Landroid/widget/ListAdapter;

    move-result-object v0

    if-nez v0, :cond_0

    .line 700
    iget-object v0, p0, Lcom/huawei/health/sns/ui/user/FriendListFragment;->l:Lo/bnd;

    iget-object v1, p0, Lcom/huawei/health/sns/ui/user/FriendListFragment;->d:Lo/bfm;

    invoke-virtual {v0, v1}, Lo/bnd;->setAdapter(Lo/bfm;)V

    .line 703
    :cond_0
    iget-object v0, p0, Lcom/huawei/health/sns/ui/user/FriendListFragment;->l:Lo/bnd;

    iget-object v1, p0, Lcom/huawei/health/sns/ui/user/FriendListFragment;->d:Lo/bfm;

    invoke-virtual {v0, p1, v1}, Lo/bnd;->a(Ljava/util/List;Lo/bfm;)V

    .line 705
    if-eqz p1, :cond_1

    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v0

    if-gtz v0, :cond_2

    .line 708
    :cond_1
    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lcom/huawei/health/sns/ui/user/FriendListFragment;->e(Z)V

    goto :goto_0

    .line 713
    :cond_2
    const/4 v0, 0x1

    invoke-direct {p0, v0}, Lcom/huawei/health/sns/ui/user/FriendListFragment;->e(Z)V

    .line 716
    :goto_0
    iget-object v0, p0, Lcom/huawei/health/sns/ui/user/FriendListFragment;->m:Lo/bkf;

    invoke-virtual {v0, p1}, Lo/bkf;->c(Ljava/util/List;)V

    .line 719
    :cond_3
    return-void
.end method

.method private e(Z)V
    .locals 3

    .line 796
    if-eqz p1, :cond_1

    .line 798
    iget-object v0, p0, Lcom/huawei/health/sns/ui/user/FriendListFragment;->l:Lo/bnd;

    invoke-virtual {v0}, Lo/bnd;->c()V

    .line 800
    iget-object v0, p0, Lcom/huawei/health/sns/ui/user/FriendListFragment;->l:Lo/bnd;

    invoke-virtual {v0}, Lo/bnd;->getSearchBar()Lo/bnb;

    move-result-object v0

    invoke-virtual {v0}, Lo/bnb;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Landroid/widget/RelativeLayout$LayoutParams;

    .line 801
    invoke-virtual {p0}, Lcom/huawei/health/sns/ui/user/FriendListFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    invoke-static {v0}, Lo/bny;->b(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 803
    invoke-virtual {p0}, Lcom/huawei/health/sns/ui/user/FriendListFragment;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/android/sns/R$dimen;->sns_listview_divider_margin_Right_size:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    move-result v0

    neg-int v0, v0

    iput v0, v2, Landroid/widget/RelativeLayout$LayoutParams;->rightMargin:I

    goto :goto_0

    .line 808
    :cond_0
    invoke-virtual {p0}, Lcom/huawei/health/sns/ui/user/FriendListFragment;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/android/sns/R$dimen;->sns_listview_divider_margin_Right_size:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    move-result v0

    neg-int v0, v0

    iput v0, v2, Landroid/widget/RelativeLayout$LayoutParams;->leftMargin:I

    .line 811
    :goto_0
    iget-object v0, p0, Lcom/huawei/health/sns/ui/user/FriendListFragment;->l:Lo/bnd;

    invoke-virtual {v0}, Lo/bnd;->getSearchBar()Lo/bnb;

    move-result-object v0

    invoke-virtual {v0, v2}, Lo/bnb;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 812
    goto :goto_1

    .line 815
    :cond_1
    iget-object v0, p0, Lcom/huawei/health/sns/ui/user/FriendListFragment;->l:Lo/bnd;

    invoke-virtual {v0}, Lo/bnd;->d()V

    .line 817
    :goto_1
    return-void
.end method

.method static synthetic e(Lcom/huawei/health/sns/ui/user/FriendListFragment;)Z
    .locals 1

    .line 66
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/user/FriendListFragment;->h()Z

    move-result v0

    return v0
.end method

.method private f()V
    .locals 1

    .line 316
    new-instance v0, Lcom/huawei/health/sns/ui/user/FriendListFragment$1;

    invoke-direct {v0, p0}, Lcom/huawei/health/sns/ui/user/FriendListFragment$1;-><init>(Lcom/huawei/health/sns/ui/user/FriendListFragment;)V

    invoke-static {v0}, Lo/aty;->a(Lo/aud;)V

    .line 350
    return-void
.end method

.method private g()V
    .locals 4
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "InflateParams"
        }
    .end annotation

    .line 240
    iget-boolean v0, p0, Lcom/huawei/health/sns/ui/user/FriendListFragment;->r:Z

    if-nez v0, :cond_1

    invoke-virtual {p0}, Lcom/huawei/health/sns/ui/user/FriendListFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    invoke-static {v0}, Lo/bph;->b(Landroid/content/Context;)Z

    move-result v0

    if-nez v0, :cond_1

    invoke-static {}, Lo/bom;->i()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 242
    invoke-virtual {p0}, Lcom/huawei/health/sns/ui/user/FriendListFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    invoke-static {v0}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v0

    sget v1, Lcom/huawei/android/sns/R$layout;->sns_null_bottom_view:I

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/health/sns/ui/user/FriendListFragment;->q:Landroid/view/View;

    .line 243
    iget-object v0, p0, Lcom/huawei/health/sns/ui/user/FriendListFragment;->l:Lo/bnd;

    if-nez v0, :cond_0

    .line 245
    iget-object v0, p0, Lcom/huawei/health/sns/ui/user/FriendListFragment;->b:Landroid/view/View;

    sget v1, Lcom/huawei/android/sns/R$id;->sns_fast_search_list:I

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lo/bnd;

    iput-object v0, p0, Lcom/huawei/health/sns/ui/user/FriendListFragment;->l:Lo/bnd;

    .line 247
    :cond_0
    iget-object v0, p0, Lcom/huawei/health/sns/ui/user/FriendListFragment;->l:Lo/bnd;

    invoke-virtual {v0}, Lo/bnd;->getListView()Landroid/widget/ListView;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/health/sns/ui/user/FriendListFragment;->q:Landroid/view/View;

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-virtual {v0, v1, v2, v3}, Landroid/widget/ListView;->addFooterView(Landroid/view/View;Ljava/lang/Object;Z)V

    .line 248
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/huawei/health/sns/ui/user/FriendListFragment;->r:Z

    .line 250
    :cond_1
    return-void
.end method

.method private h()Z
    .locals 2

    .line 379
    iget-object v0, p0, Lcom/huawei/health/sns/ui/user/FriendListFragment;->x:Lo/bkh;

    if-eqz v0, :cond_0

    .line 381
    iget-object v0, p0, Lcom/huawei/health/sns/ui/user/FriendListFragment;->x:Lo/bkh;

    invoke-interface {v0}, Lo/bkh;->e()I

    move-result v1

    .line 382
    if-nez v1, :cond_0

    .line 384
    const/4 v0, 0x1

    return v0

    .line 387
    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method private i()V
    .locals 3

    .line 473
    invoke-static {}, Lo/brb;->d()Lo/brb;

    move-result-object v0

    new-instance v1, Lo/awr;

    invoke-direct {v1}, Lo/awr;-><init>()V

    iget-object v2, p0, Lcom/huawei/health/sns/ui/user/FriendListFragment;->z:Landroid/os/Handler;

    invoke-static {v2}, Lcom/huawei/health/sns/ui/user/FriendListFragment;->a(Landroid/os/Handler;)Lo/brc;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lo/brb;->b(Lo/brd;Lo/brc;)Lo/bqy;

    .line 474
    return-void
.end method

.method private static k()Lo/brd;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()Lo/brd<Ljava/util/ArrayList<Lcom/huawei/health/sns/model/user/User;>;>;"
        }
    .end annotation

    .line 517
    new-instance v0, Lcom/huawei/health/sns/ui/user/FriendListFragment$4;

    invoke-direct {v0}, Lcom/huawei/health/sns/ui/user/FriendListFragment$4;-><init>()V

    return-object v0
.end method

.method private l()Lo/axd;
    .locals 2

    .line 769
    iget-object v0, p0, Lcom/huawei/health/sns/ui/user/FriendListFragment;->p:Lo/axd;

    if-nez v0, :cond_0

    .line 771
    new-instance v0, Lo/axd;

    iget-object v1, p0, Lcom/huawei/health/sns/ui/user/FriendListFragment;->z:Landroid/os/Handler;

    invoke-direct {v0, v1}, Lo/axd;-><init>(Landroid/os/Handler;)V

    iput-object v0, p0, Lcom/huawei/health/sns/ui/user/FriendListFragment;->p:Lo/axd;

    .line 773
    :cond_0
    iget-object v0, p0, Lcom/huawei/health/sns/ui/user/FriendListFragment;->p:Lo/axd;

    return-object v0
.end method

.method private m()V
    .locals 3

    .line 642
    invoke-static {}, Lo/brb;->d()Lo/brb;

    move-result-object v0

    invoke-static {}, Lcom/huawei/health/sns/ui/user/FriendListFragment;->n()Lo/brd;

    move-result-object v1

    iget-object v2, p0, Lcom/huawei/health/sns/ui/user/FriendListFragment;->z:Landroid/os/Handler;

    invoke-static {v2}, Lcom/huawei/health/sns/ui/user/FriendListFragment;->b(Landroid/os/Handler;)Lo/brc;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lo/brb;->b(Lo/brd;Lo/brc;)Lo/bqy;

    .line 643
    return-void
.end method

.method private static n()Lo/brd;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()Lo/brd<Ljava/lang/Integer;>;"
        }
    .end annotation

    .line 652
    new-instance v0, Lcom/huawei/health/sns/ui/user/FriendListFragment$6;

    invoke-direct {v0}, Lcom/huawei/health/sns/ui/user/FriendListFragment$6;-><init>()V

    return-object v0
.end method

.method private o()V
    .locals 3

    .line 561
    invoke-static {}, Lo/brb;->d()Lo/brb;

    move-result-object v0

    invoke-static {}, Lcom/huawei/health/sns/ui/user/FriendListFragment;->p()Lo/brd;

    move-result-object v1

    iget-object v2, p0, Lcom/huawei/health/sns/ui/user/FriendListFragment;->z:Landroid/os/Handler;

    .line 562
    invoke-static {v2}, Lcom/huawei/health/sns/ui/user/FriendListFragment;->c(Landroid/os/Handler;)Lo/brc;

    move-result-object v2

    .line 561
    invoke-virtual {v0, v1, v2}, Lo/brb;->b(Lo/brd;Lo/brc;)Lo/bqy;

    .line 563
    return-void
.end method

.method private static p()Lo/brd;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()Lo/brd<Ljava/util/List<Lcom/huawei/health/sns/model/user/UserNotify;>;>;"
        }
    .end annotation

    .line 572
    new-instance v0, Lcom/huawei/health/sns/ui/user/FriendListFragment$7;

    invoke-direct {v0}, Lcom/huawei/health/sns/ui/user/FriendListFragment$7;-><init>()V

    return-object v0
.end method

.method private s()V
    .locals 2

    .line 841
    iget-object v0, p0, Lcom/huawei/health/sns/ui/user/FriendListFragment;->s:Lo/bkj;

    if-eqz v0, :cond_0

    .line 843
    invoke-virtual {p0}, Lcom/huawei/health/sns/ui/user/FriendListFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    invoke-virtual {v0}, Landroid/support/v4/app/FragmentActivity;->getContentResolver()Landroid/content/ContentResolver;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/health/sns/ui/user/FriendListFragment;->s:Lo/bkj;

    invoke-virtual {v0, v1}, Landroid/content/ContentResolver;->unregisterContentObserver(Landroid/database/ContentObserver;)V

    .line 845
    :cond_0
    iget-object v0, p0, Lcom/huawei/health/sns/ui/user/FriendListFragment;->u:Lo/bkm;

    if-eqz v0, :cond_1

    .line 847
    invoke-virtual {p0}, Lcom/huawei/health/sns/ui/user/FriendListFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    invoke-virtual {v0}, Landroid/support/v4/app/FragmentActivity;->getContentResolver()Landroid/content/ContentResolver;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/health/sns/ui/user/FriendListFragment;->u:Lo/bkm;

    invoke-virtual {v0, v1}, Landroid/content/ContentResolver;->unregisterContentObserver(Landroid/database/ContentObserver;)V

    .line 849
    :cond_1
    iget-object v0, p0, Lcom/huawei/health/sns/ui/user/FriendListFragment;->t:Lo/bgo;

    if-eqz v0, :cond_2

    .line 851
    invoke-virtual {p0}, Lcom/huawei/health/sns/ui/user/FriendListFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    invoke-virtual {v0}, Landroid/support/v4/app/FragmentActivity;->getContentResolver()Landroid/content/ContentResolver;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/health/sns/ui/user/FriendListFragment;->t:Lo/bgo;

    invoke-virtual {v0, v1}, Landroid/content/ContentResolver;->unregisterContentObserver(Landroid/database/ContentObserver;)V

    .line 853
    :cond_2
    return-void
.end method

.method private t()V
    .locals 4

    .line 824
    new-instance v0, Lo/bkj;

    iget-object v1, p0, Lcom/huawei/health/sns/ui/user/FriendListFragment;->z:Landroid/os/Handler;

    invoke-direct {v0, v1}, Lo/bkj;-><init>(Landroid/os/Handler;)V

    iput-object v0, p0, Lcom/huawei/health/sns/ui/user/FriendListFragment;->s:Lo/bkj;

    .line 825
    new-instance v0, Lo/bkm;

    iget-object v1, p0, Lcom/huawei/health/sns/ui/user/FriendListFragment;->z:Landroid/os/Handler;

    invoke-direct {v0, v1}, Lo/bkm;-><init>(Landroid/os/Handler;)V

    iput-object v0, p0, Lcom/huawei/health/sns/ui/user/FriendListFragment;->u:Lo/bkm;

    .line 826
    new-instance v0, Lo/bgo;

    iget-object v1, p0, Lcom/huawei/health/sns/ui/user/FriendListFragment;->z:Landroid/os/Handler;

    invoke-direct {v0, v1}, Lo/bgo;-><init>(Landroid/os/Handler;)V

    iput-object v0, p0, Lcom/huawei/health/sns/ui/user/FriendListFragment;->t:Lo/bgo;

    .line 828
    invoke-virtual {p0}, Lcom/huawei/health/sns/ui/user/FriendListFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    invoke-virtual {v0}, Landroid/support/v4/app/FragmentActivity;->getContentResolver()Landroid/content/ContentResolver;

    move-result-object v0

    sget-object v1, Lo/bbz$p;->c:Landroid/net/Uri;

    iget-object v2, p0, Lcom/huawei/health/sns/ui/user/FriendListFragment;->s:Lo/bkj;

    const/4 v3, 0x1

    invoke-virtual {v0, v1, v3, v2}, Landroid/content/ContentResolver;->registerContentObserver(Landroid/net/Uri;ZLandroid/database/ContentObserver;)V

    .line 830
    invoke-virtual {p0}, Lcom/huawei/health/sns/ui/user/FriendListFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    invoke-virtual {v0}, Landroid/support/v4/app/FragmentActivity;->getContentResolver()Landroid/content/ContentResolver;

    move-result-object v0

    sget-object v1, Lo/bbz$o;->e:Landroid/net/Uri;

    iget-object v2, p0, Lcom/huawei/health/sns/ui/user/FriendListFragment;->u:Lo/bkm;

    const/4 v3, 0x1

    invoke-virtual {v0, v1, v3, v2}, Landroid/content/ContentResolver;->registerContentObserver(Landroid/net/Uri;ZLandroid/database/ContentObserver;)V

    .line 832
    invoke-virtual {p0}, Lcom/huawei/health/sns/ui/user/FriendListFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    invoke-virtual {v0}, Landroid/support/v4/app/FragmentActivity;->getContentResolver()Landroid/content/ContentResolver;

    move-result-object v0

    sget-object v1, Lo/bbz$i;->a:Landroid/net/Uri;

    iget-object v2, p0, Lcom/huawei/health/sns/ui/user/FriendListFragment;->t:Lo/bgo;

    const/4 v3, 0x1

    invoke-virtual {v0, v1, v3, v2}, Landroid/content/ContentResolver;->registerContentObserver(Landroid/net/Uri;ZLandroid/database/ContentObserver;)V

    .line 834
    return-void
.end method


# virtual methods
.method public a()V
    .locals 3

    .line 420
    new-instance v0, Lo/bfm;

    iget-object v1, p0, Lcom/huawei/health/sns/ui/user/FriendListFragment;->b:Landroid/view/View;

    invoke-virtual {v1}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v1

    iget-object v2, p0, Lcom/huawei/health/sns/ui/user/FriendListFragment;->c:Lo/bfq;

    invoke-direct {v0, v1, v2}, Lo/bfm;-><init>(Landroid/content/Context;Lo/bfq;)V

    iput-object v0, p0, Lcom/huawei/health/sns/ui/user/FriendListFragment;->d:Lo/bfm;

    .line 421
    iget-object v0, p0, Lcom/huawei/health/sns/ui/user/FriendListFragment;->d:Lo/bfm;

    invoke-virtual {v0, p0}, Lo/bfm;->b(Lo/bfp;)V

    .line 422
    iget-object v0, p0, Lcom/huawei/health/sns/ui/user/FriendListFragment;->d:Lo/bfm;

    new-instance v1, Lo/bmi;

    invoke-direct {v1}, Lo/bmi;-><init>()V

    invoke-virtual {v0, v1}, Lo/bfm;->a(Lo/bfn;)V

    .line 423
    return-void
.end method

.method public b()V
    .locals 3

    .line 506
    invoke-static {}, Lo/brb;->d()Lo/brb;

    move-result-object v0

    invoke-static {}, Lcom/huawei/health/sns/ui/user/FriendListFragment;->k()Lo/brd;

    move-result-object v1

    iget-object v2, p0, Lcom/huawei/health/sns/ui/user/FriendListFragment;->z:Landroid/os/Handler;

    .line 507
    invoke-static {v2}, Lcom/huawei/health/sns/ui/user/FriendListFragment;->d(Landroid/os/Handler;)Lo/brc;

    move-result-object v2

    .line 506
    invoke-virtual {v0, v1, v2}, Lo/brb;->b(Lo/brd;Lo/brc;)Lo/bqy;

    .line 508
    return-void
.end method

.method public c()V
    .locals 2

    .line 437
    new-instance v0, Lo/bkf;

    invoke-virtual {p0}, Lcom/huawei/health/sns/ui/user/FriendListFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v1

    invoke-direct {v0, v1}, Lo/bkf;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Lcom/huawei/health/sns/ui/user/FriendListFragment;->m:Lo/bkf;

    .line 438
    iget-object v0, p0, Lcom/huawei/health/sns/ui/user/FriendListFragment;->m:Lo/bkf;

    iput-object v0, p0, Lcom/huawei/health/sns/ui/user/FriendListFragment;->c:Lo/bfq;

    .line 439
    iget-object v0, p0, Lcom/huawei/health/sns/ui/user/FriendListFragment;->m:Lo/bkf;

    new-instance v1, Lo/bmi;

    invoke-direct {v1}, Lo/bmi;-><init>()V

    invoke-virtual {v0, v1}, Lo/bkf;->b(Lo/bfn;)V

    .line 440
    iget-object v0, p0, Lcom/huawei/health/sns/ui/user/FriendListFragment;->m:Lo/bkf;

    invoke-virtual {v0}, Lo/bkf;->d()V

    .line 441
    return-void
.end method

.method public c(Lo/bfl;)V
    .locals 3

    .line 464
    new-instance v0, Lo/bkl;

    invoke-direct {v0}, Lo/bkl;-><init>()V

    invoke-virtual {p0}, Lcom/huawei/health/sns/ui/user/FriendListFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v1

    invoke-direct {p0}, Lcom/huawei/health/sns/ui/user/FriendListFragment;->l()Lo/axd;

    move-result-object v2

    invoke-virtual {v0, p1, v1, v2}, Lo/bkl;->d(Lo/bfl;Landroid/app/Activity;Lo/axd;)V

    .line 465
    return-void
.end method

.method public d()V
    .locals 1

    .line 726
    iget-object v0, p0, Lcom/huawei/health/sns/ui/user/FriendListFragment;->m:Lo/bkf;

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Lcom/huawei/health/sns/ui/user/FriendListFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Lcom/huawei/health/sns/ui/user/FriendListFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    invoke-virtual {v0}, Landroid/support/v4/app/FragmentActivity;->isFinishing()Z

    move-result v0

    if-nez v0, :cond_0

    .line 728
    iget-object v0, p0, Lcom/huawei/health/sns/ui/user/FriendListFragment;->m:Lo/bkf;

    invoke-virtual {v0}, Lo/bkf;->d()V

    .line 730
    :cond_0
    return-void
.end method

.method public d(Lo/bfl;)V
    .locals 2

    .line 458
    new-instance v0, Lo/bkl;

    invoke-direct {v0}, Lo/bkl;-><init>()V

    invoke-virtual {p0}, Lcom/huawei/health/sns/ui/user/FriendListFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v1

    invoke-virtual {v0, p1, v1}, Lo/bkl;->d(Lo/bfl;Landroid/app/Activity;)V

    .line 459
    return-void
.end method

.method public e()V
    .locals 0

    .line 369
    return-void
.end method

.method public e(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)V
    .locals 2

    .line 428
    sget v0, Lcom/huawei/android/sns/R$layout;->sns_all_user_fragment:I

    const/4 v1, 0x0

    invoke-virtual {p1, v0, p2, v1}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/health/sns/ui/user/FriendListFragment;->b:Landroid/view/View;

    .line 429
    iget-object v0, p0, Lcom/huawei/health/sns/ui/user/FriendListFragment;->b:Landroid/view/View;

    sget v1, Lcom/huawei/android/sns/R$id;->sns_fast_search_list:I

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lo/bnd;

    iput-object v0, p0, Lcom/huawei/health/sns/ui/user/FriendListFragment;->l:Lo/bnd;

    .line 430
    iget-object v0, p0, Lcom/huawei/health/sns/ui/user/FriendListFragment;->l:Lo/bnd;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lo/bnd;->setHasBottomBlank(Z)V

    .line 431
    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lcom/huawei/health/sns/ui/user/FriendListFragment;->e(Z)V

    .line 432
    return-void
.end method

.method public e(Lo/auu$b;Landroid/os/Bundle;)V
    .locals 0

    .line 393
    invoke-direct {p0, p1}, Lcom/huawei/health/sns/ui/user/FriendListFragment;->b(Lo/auu$b;)V

    .line 394
    return-void
.end method

.method public onAttach(Landroid/app/Activity;)V
    .locals 3

    .line 355
    invoke-super {p0, p1}, Lcom/huawei/health/sns/ui/common/FunctionFragment;->onAttach(Landroid/app/Activity;)V

    .line 358
    move-object v0, p1

    :try_start_0
    check-cast v0, Lcom/huawei/health/sns/ui/HomeActivity;

    iput-object v0, p0, Lcom/huawei/health/sns/ui/user/FriendListFragment;->x:Lo/bkh;
    :try_end_0
    .catch Ljava/lang/ClassCastException; {:try_start_0 .. :try_end_0} :catch_0

    .line 363
    goto :goto_0

    .line 360
    :catch_0
    move-exception v2

    .line 362
    sget-object v0, Lcom/huawei/health/sns/ui/user/FriendListFragment;->a:Ljava/lang/String;

    const-string v1, "ConversationFragment onAttach ClassCastException"

    invoke-static {v0, v1}, Lo/bpf;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 364
    :goto_0
    return-void
.end method

.method public onConfigurationChanged(Landroid/content/res/Configuration;)V
    .locals 2

    .line 858
    invoke-super {p0, p1}, Lcom/huawei/health/sns/ui/common/FunctionFragment;->onConfigurationChanged(Landroid/content/res/Configuration;)V

    .line 859
    invoke-virtual {p0}, Lcom/huawei/health/sns/ui/user/FriendListFragment;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    move-result-object v0

    iget v0, v0, Landroid/content/res/Configuration;->orientation:I

    const/4 v1, 0x2

    if-ne v0, v1, :cond_0

    .line 861
    iget-object v0, p0, Lcom/huawei/health/sns/ui/user/FriendListFragment;->l:Lo/bnd;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lo/bnd;->setHasBottomBlank(Z)V

    .line 864
    iget-boolean v0, p0, Lcom/huawei/health/sns/ui/user/FriendListFragment;->r:Z

    if-eqz v0, :cond_2

    iget-object v0, p0, Lcom/huawei/health/sns/ui/user/FriendListFragment;->q:Landroid/view/View;

    if-eqz v0, :cond_2

    .line 866
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/health/sns/ui/user/FriendListFragment;->r:Z

    .line 867
    iget-object v0, p0, Lcom/huawei/health/sns/ui/user/FriendListFragment;->l:Lo/bnd;

    invoke-virtual {v0}, Lo/bnd;->getListView()Landroid/widget/ListView;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/health/sns/ui/user/FriendListFragment;->q:Landroid/view/View;

    invoke-virtual {v0, v1}, Landroid/widget/ListView;->removeFooterView(Landroid/view/View;)Z

    goto :goto_1

    .line 872
    :cond_0
    iget-object v0, p0, Lcom/huawei/health/sns/ui/user/FriendListFragment;->l:Lo/bnd;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lo/bnd;->setHasBottomBlank(Z)V

    .line 874
    iget-object v0, p0, Lcom/huawei/health/sns/ui/user/FriendListFragment;->o:Ljava/util/List;

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/huawei/health/sns/ui/user/FriendListFragment;->o:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-lez v0, :cond_1

    const/4 v0, 0x1

    goto :goto_0

    :cond_1
    const/4 v0, 0x0

    :goto_0
    invoke-direct {p0, v0}, Lcom/huawei/health/sns/ui/user/FriendListFragment;->e(Z)V

    .line 875
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/user/FriendListFragment;->g()V

    .line 877
    :cond_2
    :goto_1
    return-void
.end method

.method public onCreateView(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;
    .locals 4

    .line 210
    invoke-super {p0, p1, p2, p3}, Lcom/huawei/health/sns/ui/common/FunctionFragment;->onCreateView(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;

    .line 212
    iget-object v0, p0, Lcom/huawei/health/sns/ui/user/FriendListFragment;->z:Landroid/os/Handler;

    new-instance v1, Lcom/huawei/health/sns/ui/user/FriendListFragment$5;

    invoke-direct {v1, p0}, Lcom/huawei/health/sns/ui/user/FriendListFragment$5;-><init>(Lcom/huawei/health/sns/ui/user/FriendListFragment;)V

    const-wide/16 v2, 0xc8

    invoke-virtual {v0, v1, v2, v3}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 228
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/user/FriendListFragment;->t()V

    .line 229
    invoke-static {}, Lo/avk;->e()Lo/avk;

    move-result-object v0

    sget-object v1, Lo/avk$b;->b:Lo/avk$b;

    invoke-virtual {v0, v1, p0}, Lo/avk;->c(Lo/avk$b;Lo/avk$d;)V

    .line 230
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/user/FriendListFragment;->g()V

    .line 231
    iget-object v0, p0, Lcom/huawei/health/sns/ui/user/FriendListFragment;->b:Landroid/view/View;

    return-object v0
.end method

.method public onDestroy()V
    .locals 2

    .line 446
    iget-object v0, p0, Lcom/huawei/health/sns/ui/user/FriendListFragment;->l:Lo/bnd;

    if-eqz v0, :cond_0

    .line 448
    iget-object v0, p0, Lcom/huawei/health/sns/ui/user/FriendListFragment;->l:Lo/bnd;

    invoke-virtual {v0}, Lo/bnd;->e()V

    .line 450
    :cond_0
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/user/FriendListFragment;->s()V

    .line 451
    invoke-static {}, Lo/avk;->e()Lo/avk;

    move-result-object v0

    sget-object v1, Lo/avk$b;->b:Lo/avk$b;

    invoke-virtual {v0, v1}, Lo/avk;->c(Lo/avk$b;)V

    .line 452
    invoke-super {p0}, Lcom/huawei/health/sns/ui/common/FunctionFragment;->onDestroy()V

    .line 453
    return-void
.end method
