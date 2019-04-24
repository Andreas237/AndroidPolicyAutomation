.class public Lcom/huawei/health/sns/ui/conversation/ConversationFragment;
.super Landroid/support/v4/app/Fragment;
.source "SourceFile"

# interfaces
.implements Landroid/widget/AdapterView$OnItemClickListener;
.implements Landroid/widget/AdapterView$OnItemLongClickListener;
.implements Landroid/widget/AbsListView$OnScrollListener;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/huawei/health/sns/ui/conversation/ConversationFragment$b;,
        Lcom/huawei/health/sns/ui/conversation/ConversationFragment$d;,
        Lcom/huawei/health/sns/ui/conversation/ConversationFragment$e;,
        Lcom/huawei/health/sns/ui/conversation/ConversationFragment$ThreadListQueryHandler;
    }
.end annotation


# instance fields
.field protected a:Lo/bga;

.field protected final b:Lo/bga$d;

.field private c:Landroid/widget/LinearLayout;

.field protected d:Lcom/huawei/health/sns/ui/conversation/ConversationFragment$ThreadListQueryHandler;

.field protected e:Landroid/widget/ListView;

.field private f:Lo/bio;

.field private g:Lcom/huawei/health/sns/ui/conversation/ConversationFragment$e;

.field private h:Lcom/huawei/health/sns/ui/HomeActivity;

.field private i:Lo/axc;

.field private k:Lo/atv;

.field private l:J

.field private m:Z

.field private n:Landroid/view/View;

.field private o:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<Ljava/lang/Integer;>;"
        }
    .end annotation
.end field

.field private p:Landroid/database/Cursor;

.field private q:I

.field private r:Z

.field private s:I

.field private t:Lo/bgd;

.field private u:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<Ljava/lang/Integer;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 66
    invoke-direct {p0}, Landroid/support/v4/app/Fragment;-><init>()V

    .line 94
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/health/sns/ui/conversation/ConversationFragment;->d:Lcom/huawei/health/sns/ui/conversation/ConversationFragment$ThreadListQueryHandler;

    .line 129
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/health/sns/ui/conversation/ConversationFragment;->h:Lcom/huawei/health/sns/ui/HomeActivity;

    .line 154
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/health/sns/ui/conversation/ConversationFragment;->p:Landroid/database/Cursor;

    .line 159
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/health/sns/ui/conversation/ConversationFragment;->m:Z

    .line 164
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/health/sns/ui/conversation/ConversationFragment;->n:Landroid/view/View;

    .line 179
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/huawei/health/sns/ui/conversation/ConversationFragment;->o:Ljava/util/List;

    .line 184
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/huawei/health/sns/ui/conversation/ConversationFragment;->u:Ljava/util/List;

    .line 189
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/health/sns/ui/conversation/ConversationFragment;->t:Lo/bgd;

    .line 550
    new-instance v0, Lcom/huawei/health/sns/ui/conversation/ConversationFragment$5;

    invoke-direct {v0, p0}, Lcom/huawei/health/sns/ui/conversation/ConversationFragment$5;-><init>(Lcom/huawei/health/sns/ui/conversation/ConversationFragment;)V

    iput-object v0, p0, Lcom/huawei/health/sns/ui/conversation/ConversationFragment;->b:Lo/bga$d;

    return-void
.end method

.method static synthetic a(Lcom/huawei/health/sns/ui/conversation/ConversationFragment;)I
    .locals 1

    .line 66
    iget v0, p0, Lcom/huawei/health/sns/ui/conversation/ConversationFragment;->s:I

    return v0
.end method

.method private a(Lo/axv;)I
    .locals 1

    .line 598
    new-instance v0, Lo/bgc;

    invoke-direct {v0}, Lo/bgc;-><init>()V

    invoke-virtual {v0, p1}, Lo/bgc;->a(Lo/axv;)I

    move-result v0

    return v0
.end method

.method static synthetic a(Lcom/huawei/health/sns/ui/conversation/ConversationFragment;Lo/axv;)V
    .locals 0

    .line 66
    invoke-direct {p0, p1}, Lcom/huawei/health/sns/ui/conversation/ConversationFragment;->l(Lo/axv;)V

    return-void
.end method

.method private a(Lo/axv;I)V
    .locals 1

    .line 847
    invoke-direct {p0, p1}, Lcom/huawei/health/sns/ui/conversation/ConversationFragment;->d(Lo/axv;)I

    move-result v0

    if-nez v0, :cond_1

    .line 849
    const/4 v0, 0x0

    if-ne v0, p2, :cond_0

    .line 851
    invoke-direct {p0, p1}, Lcom/huawei/health/sns/ui/conversation/ConversationFragment;->k(Lo/axv;)V

    goto :goto_0

    .line 853
    :cond_0
    const/4 v0, 0x1

    if-ne v0, p2, :cond_4

    .line 855
    invoke-direct {p0, p1}, Lcom/huawei/health/sns/ui/conversation/ConversationFragment;->e(Lo/axv;)V

    goto :goto_0

    .line 861
    :cond_1
    const/4 v0, 0x0

    if-ne v0, p2, :cond_2

    .line 863
    invoke-direct {p0, p1}, Lcom/huawei/health/sns/ui/conversation/ConversationFragment;->i(Lo/axv;)V

    goto :goto_0

    .line 865
    :cond_2
    const/4 v0, 0x1

    if-ne v0, p2, :cond_3

    .line 867
    invoke-direct {p0, p1}, Lcom/huawei/health/sns/ui/conversation/ConversationFragment;->k(Lo/axv;)V

    goto :goto_0

    .line 869
    :cond_3
    const/4 v0, 0x2

    if-ne v0, p2, :cond_4

    .line 871
    invoke-direct {p0, p1}, Lcom/huawei/health/sns/ui/conversation/ConversationFragment;->e(Lo/axv;)V

    .line 874
    :cond_4
    :goto_0
    return-void
.end method

.method static synthetic b(Lcom/huawei/health/sns/ui/conversation/ConversationFragment;I)I
    .locals 0

    .line 66
    iput p1, p0, Lcom/huawei/health/sns/ui/conversation/ConversationFragment;->s:I

    return p1
.end method

.method static synthetic b(Lcom/huawei/health/sns/ui/conversation/ConversationFragment;Lo/axv;)I
    .locals 1

    .line 66
    invoke-direct {p0, p1}, Lcom/huawei/health/sns/ui/conversation/ConversationFragment;->d(Lo/axv;)I

    move-result v0

    return v0
.end method

.method private b(Lo/axv;)I
    .locals 1

    .line 753
    new-instance v0, Lo/bgc;

    invoke-direct {v0}, Lo/bgc;-><init>()V

    invoke-virtual {v0, p1}, Lo/bgc;->e(Lo/axv;)I

    move-result v0

    return v0
.end method

.method static synthetic b(Lcom/huawei/health/sns/ui/conversation/ConversationFragment;Landroid/database/Cursor;)Landroid/database/Cursor;
    .locals 0

    .line 66
    iput-object p1, p0, Lcom/huawei/health/sns/ui/conversation/ConversationFragment;->p:Landroid/database/Cursor;

    return-object p1
.end method

.method private static b(Lo/bgd;)Ljava/lang/Runnable;
    .locals 1

    .line 517
    new-instance v0, Lcom/huawei/health/sns/ui/conversation/ConversationFragment$2;

    invoke-direct {v0, p0}, Lcom/huawei/health/sns/ui/conversation/ConversationFragment$2;-><init>(Lo/bgd;)V

    return-object v0
.end method

.method static synthetic b(Lcom/huawei/health/sns/ui/conversation/ConversationFragment;)Ljava/util/List;
    .locals 1

    .line 66
    iget-object v0, p0, Lcom/huawei/health/sns/ui/conversation/ConversationFragment;->u:Ljava/util/List;

    return-object v0
.end method

.method private b(ILjava/util/List;Z)V
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(ILjava/util/List<Ljava/lang/Integer;>;Z)V"
        }
    .end annotation

    .line 693
    const/4 v3, 0x1

    .line 694
    invoke-interface {p2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :goto_0
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v5

    .line 697
    if-ge p1, v5, :cond_1

    .line 699
    const/4 v3, 0x0

    .line 701
    iget v0, p0, Lcom/huawei/health/sns/ui/conversation/ConversationFragment;->q:I

    add-int/2addr v0, v5

    iget v1, p0, Lcom/huawei/health/sns/ui/conversation/ConversationFragment;->s:I

    if-ge v0, v1, :cond_0

    .line 703
    iget-object v0, p0, Lcom/huawei/health/sns/ui/conversation/ConversationFragment;->e:Landroid/widget/ListView;

    invoke-direct {p0, v0, v5}, Lcom/huawei/health/sns/ui/conversation/ConversationFragment;->b(Landroid/widget/AbsListView;I)V

    goto :goto_1

    .line 708
    :cond_0
    iget-object v0, p0, Lcom/huawei/health/sns/ui/conversation/ConversationFragment;->e:Landroid/widget/ListView;

    iget v1, p0, Lcom/huawei/health/sns/ui/conversation/ConversationFragment;->s:I

    iget v2, p0, Lcom/huawei/health/sns/ui/conversation/ConversationFragment;->q:I

    sub-int/2addr v1, v2

    invoke-direct {p0, v0, v1}, Lcom/huawei/health/sns/ui/conversation/ConversationFragment;->b(Landroid/widget/AbsListView;I)V

    .line 710
    goto :goto_1

    .line 712
    :cond_1
    goto :goto_0

    .line 714
    :cond_2
    :goto_1
    if-nez v3, :cond_3

    if-eqz p3, :cond_6

    .line 716
    :cond_3
    invoke-interface {p2}, Ljava/util/List;->size()I

    move-result v0

    const/4 v1, 0x1

    if-le v0, v1, :cond_5

    .line 718
    const/4 v0, 0x0

    invoke-interface {p2, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v4

    .line 720
    iget v0, p0, Lcom/huawei/health/sns/ui/conversation/ConversationFragment;->q:I

    add-int/2addr v0, v4

    iget v1, p0, Lcom/huawei/health/sns/ui/conversation/ConversationFragment;->s:I

    if-ge v0, v1, :cond_4

    .line 722
    iget-object v0, p0, Lcom/huawei/health/sns/ui/conversation/ConversationFragment;->e:Landroid/widget/ListView;

    invoke-direct {p0, v0, v4}, Lcom/huawei/health/sns/ui/conversation/ConversationFragment;->b(Landroid/widget/AbsListView;I)V

    goto :goto_2

    .line 727
    :cond_4
    iget-object v0, p0, Lcom/huawei/health/sns/ui/conversation/ConversationFragment;->e:Landroid/widget/ListView;

    iget v1, p0, Lcom/huawei/health/sns/ui/conversation/ConversationFragment;->s:I

    iget v2, p0, Lcom/huawei/health/sns/ui/conversation/ConversationFragment;->q:I

    sub-int/2addr v1, v2

    invoke-direct {p0, v0, v1}, Lcom/huawei/health/sns/ui/conversation/ConversationFragment;->b(Landroid/widget/AbsListView;I)V

    .line 729
    :goto_2
    goto :goto_3

    .line 732
    :cond_5
    iget-object v0, p0, Lcom/huawei/health/sns/ui/conversation/ConversationFragment;->e:Landroid/widget/ListView;

    const/4 v1, 0x0

    invoke-direct {p0, v0, v1}, Lcom/huawei/health/sns/ui/conversation/ConversationFragment;->b(Landroid/widget/AbsListView;I)V

    .line 736
    :cond_6
    :goto_3
    return-void
.end method

.method private b(Landroid/view/View;)V
    .locals 2

    .line 306
    sget v0, Lcom/huawei/android/sns/R$id;->hwmessagegroup_alllistview:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ListView;

    iput-object v0, p0, Lcom/huawei/health/sns/ui/conversation/ConversationFragment;->e:Landroid/widget/ListView;

    .line 307
    sget v0, Lcom/huawei/android/sns/R$id;->no_data_layout:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    iput-object v0, p0, Lcom/huawei/health/sns/ui/conversation/ConversationFragment;->c:Landroid/widget/LinearLayout;

    .line 308
    iget-object v0, p0, Lcom/huawei/health/sns/ui/conversation/ConversationFragment;->c:Landroid/widget/LinearLayout;

    invoke-virtual {p0}, Lcom/huawei/health/sns/ui/conversation/ConversationFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v1

    invoke-static {v0, v1}, Lo/bph;->b(Landroid/widget/LinearLayout;Landroid/app/Activity;)V

    .line 309
    return-void
.end method

.method private b(Landroid/widget/AbsListView;I)V
    .locals 2

    .line 1163
    invoke-direct {p0, p1, p2}, Lcom/huawei/health/sns/ui/conversation/ConversationFragment;->e(Landroid/widget/AdapterView;I)Landroid/view/View;

    move-result-object v1

    .line 1164
    if-eqz v1, :cond_1

    invoke-virtual {v1}, Landroid/view/View;->getTop()I

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {v1}, Landroid/view/View;->getTop()I

    move-result v0

    if-lez v0, :cond_1

    const/4 v0, 0x1

    invoke-virtual {p1, v0}, Landroid/widget/AbsListView;->canScrollVertically(I)Z

    move-result v0

    if-nez v0, :cond_1

    .line 1166
    :cond_0
    return-void

    .line 1169
    :cond_1
    new-instance v0, Lcom/huawei/health/sns/ui/conversation/ConversationFragment$6;

    invoke-direct {v0, p0, p2}, Lcom/huawei/health/sns/ui/conversation/ConversationFragment$6;-><init>(Lcom/huawei/health/sns/ui/conversation/ConversationFragment;I)V

    invoke-virtual {p1, v0}, Landroid/widget/AbsListView;->setOnScrollListener(Landroid/widget/AbsListView$OnScrollListener;)V

    .line 1201
    new-instance v0, Lcom/huawei/health/sns/ui/conversation/ConversationFragment$b;

    invoke-direct {v0, p0, p1, p2}, Lcom/huawei/health/sns/ui/conversation/ConversationFragment$b;-><init>(Lcom/huawei/health/sns/ui/conversation/ConversationFragment;Landroid/widget/AbsListView;I)V

    invoke-virtual {p1, v0}, Landroid/widget/AbsListView;->post(Ljava/lang/Runnable;)Z

    .line 1202
    return-void
.end method

.method static synthetic b(Lcom/huawei/health/sns/ui/conversation/ConversationFragment;Lo/axv;I)V
    .locals 0

    .line 66
    invoke-direct {p0, p1, p2}, Lcom/huawei/health/sns/ui/conversation/ConversationFragment;->b(Lo/axv;I)V

    return-void
.end method

.method private b(Lo/axv;I)V
    .locals 1

    .line 795
    invoke-direct {p0, p1}, Lcom/huawei/health/sns/ui/conversation/ConversationFragment;->d(Lo/axv;)I

    move-result v0

    if-eqz v0, :cond_0

    .line 798
    packed-switch p2, :pswitch_data_0

    goto :goto_0

    .line 802
    :pswitch_0
    invoke-direct {p0, p1}, Lcom/huawei/health/sns/ui/conversation/ConversationFragment;->i(Lo/axv;)V

    .line 803
    goto :goto_1

    .line 806
    :pswitch_1
    invoke-direct {p0, p1}, Lcom/huawei/health/sns/ui/conversation/ConversationFragment;->k(Lo/axv;)V

    .line 807
    goto :goto_1

    .line 810
    :pswitch_2
    invoke-direct {p0, p1}, Lcom/huawei/health/sns/ui/conversation/ConversationFragment;->e(Lo/axv;)V

    .line 811
    goto :goto_1

    .line 813
    :goto_0
    goto :goto_1

    .line 821
    :cond_0
    sparse-switch p2, :sswitch_data_0

    goto :goto_1

    .line 825
    :sswitch_0
    invoke-direct {p0, p1}, Lcom/huawei/health/sns/ui/conversation/ConversationFragment;->k(Lo/axv;)V

    .line 826
    goto :goto_1

    .line 829
    :sswitch_1
    invoke-direct {p0, p1}, Lcom/huawei/health/sns/ui/conversation/ConversationFragment;->e(Lo/axv;)V

    .line 830
    .line 836
    :goto_1
    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
        :pswitch_1
        :pswitch_2
    .end packed-switch

    :sswitch_data_0
    .sparse-switch
        0x0 -> :sswitch_0
        0x1 -> :sswitch_1
    .end sparse-switch
.end method

.method static synthetic c(Lcom/huawei/health/sns/ui/conversation/ConversationFragment;Lo/axv;)I
    .locals 1

    .line 66
    invoke-direct {p0, p1}, Lcom/huawei/health/sns/ui/conversation/ConversationFragment;->a(Lo/axv;)I

    move-result v0

    return v0
.end method

.method private c(Lo/axv;)J
    .locals 2

    .line 908
    invoke-virtual {p1}, Lo/axv;->b()J

    move-result-wide v0

    return-wide v0
.end method

.method private c()V
    .locals 4

    .line 245
    iget-boolean v0, p0, Lcom/huawei/health/sns/ui/conversation/ConversationFragment;->m:Z

    if-nez v0, :cond_0

    invoke-virtual {p0}, Lcom/huawei/health/sns/ui/conversation/ConversationFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    invoke-static {v0}, Lo/bph;->b(Landroid/content/Context;)Z

    move-result v0

    if-nez v0, :cond_0

    invoke-static {}, Lo/bom;->i()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 247
    invoke-virtual {p0}, Lcom/huawei/health/sns/ui/conversation/ConversationFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    invoke-static {v0}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v0

    sget v1, Lcom/huawei/android/sns/R$layout;->sns_null_bottom_view:I

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/health/sns/ui/conversation/ConversationFragment;->n:Landroid/view/View;

    .line 248
    iget-object v0, p0, Lcom/huawei/health/sns/ui/conversation/ConversationFragment;->e:Landroid/widget/ListView;

    iget-object v1, p0, Lcom/huawei/health/sns/ui/conversation/ConversationFragment;->n:Landroid/view/View;

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-virtual {v0, v1, v2, v3}, Landroid/widget/ListView;->addFooterView(Landroid/view/View;Ljava/lang/Object;Z)V

    .line 249
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/huawei/health/sns/ui/conversation/ConversationFragment;->m:Z

    .line 251
    :cond_0
    return-void
.end method

.method static synthetic c(Lcom/huawei/health/sns/ui/conversation/ConversationFragment;)V
    .locals 0

    .line 66
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/conversation/ConversationFragment;->g()V

    return-void
.end method

.method static synthetic d(Lcom/huawei/health/sns/ui/conversation/ConversationFragment;Lo/axv;)I
    .locals 1

    .line 66
    invoke-direct {p0, p1}, Lcom/huawei/health/sns/ui/conversation/ConversationFragment;->b(Lo/axv;)I

    move-result v0

    return v0
.end method

.method private d(Lo/axv;)I
    .locals 1

    .line 878
    new-instance v0, Lo/bgc;

    invoke-direct {v0}, Lo/bgc;-><init>()V

    invoke-virtual {v0, p1}, Lo/bgc;->c(Lo/axv;)I

    move-result v0

    return v0
.end method

.method static synthetic d(Lcom/huawei/health/sns/ui/conversation/ConversationFragment;J)J
    .locals 0

    .line 66
    iput-wide p1, p0, Lcom/huawei/health/sns/ui/conversation/ConversationFragment;->l:J

    return-wide p1
.end method

.method static synthetic d(Lcom/huawei/health/sns/ui/conversation/ConversationFragment;)Landroid/widget/LinearLayout;
    .locals 1

    .line 66
    iget-object v0, p0, Lcom/huawei/health/sns/ui/conversation/ConversationFragment;->c:Landroid/widget/LinearLayout;

    return-object v0
.end method

.method private static d(J)Lo/brd;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(J)Lo/brd<Ljava/lang/Boolean;>;"
        }
    .end annotation

    .line 930
    new-instance v0, Lcom/huawei/health/sns/ui/conversation/ConversationFragment$1;

    invoke-direct {v0, p0, p1}, Lcom/huawei/health/sns/ui/conversation/ConversationFragment$1;-><init>(J)V

    return-object v0
.end method

.method static synthetic d(Lcom/huawei/health/sns/ui/conversation/ConversationFragment;Lo/axv;I)V
    .locals 0

    .line 66
    invoke-direct {p0, p1, p2}, Lcom/huawei/health/sns/ui/conversation/ConversationFragment;->a(Lo/axv;I)V

    return-void
.end method

.method private e(Landroid/widget/AdapterView;I)Landroid/view/View;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Landroid/widget/AdapterView<*>;I)Landroid/view/View;"
        }
    .end annotation

    .line 1262
    invoke-virtual {p1}, Landroid/widget/AdapterView;->getFirstVisiblePosition()I

    move-result v0

    sub-int v1, p2, v0

    .line 1263
    if-ltz v1, :cond_0

    invoke-virtual {p1}, Landroid/widget/AdapterView;->getChildCount()I

    move-result v0

    if-ge v1, v0, :cond_0

    .line 1265
    invoke-virtual {p1, v1}, Landroid/widget/AdapterView;->getChildAt(I)Landroid/view/View;

    move-result-object v0

    return-object v0

    .line 1269
    :cond_0
    const/4 v0, 0x0

    return-object v0
.end method

.method static synthetic e(Lcom/huawei/health/sns/ui/conversation/ConversationFragment;)Ljava/util/List;
    .locals 1

    .line 66
    iget-object v0, p0, Lcom/huawei/health/sns/ui/conversation/ConversationFragment;->o:Ljava/util/List;

    return-object v0
.end method

.method private e(Lo/axv;)V
    .locals 4

    .line 887
    invoke-direct {p0, p1}, Lcom/huawei/health/sns/ui/conversation/ConversationFragment;->a(Lo/axv;)I

    move-result v0

    const/4 v1, 0x1

    if-ne v1, v0, :cond_1

    .line 889
    invoke-direct {p0, p1}, Lcom/huawei/health/sns/ui/conversation/ConversationFragment;->h(Lo/axv;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 891
    invoke-virtual {p0}, Lcom/huawei/health/sns/ui/conversation/ConversationFragment;->b()Lo/bio;

    move-result-object v0

    invoke-virtual {v0}, Lo/bio;->a()V

    .line 893
    invoke-direct {p0, p1}, Lcom/huawei/health/sns/ui/conversation/ConversationFragment;->c(Lo/axv;)J

    move-result-wide v0

    const/4 v2, 0x0

    const/4 v3, 0x1

    invoke-virtual {p0, v0, v1, v2, v3}, Lcom/huawei/health/sns/ui/conversation/ConversationFragment;->e(JIZ)V

    goto :goto_0

    .line 897
    :cond_0
    invoke-direct {p0, p1}, Lcom/huawei/health/sns/ui/conversation/ConversationFragment;->c(Lo/axv;)J

    move-result-wide v0

    invoke-virtual {p0, v0, v1}, Lcom/huawei/health/sns/ui/conversation/ConversationFragment;->a(J)V

    goto :goto_0

    .line 902
    :cond_1
    invoke-direct {p0, p1}, Lcom/huawei/health/sns/ui/conversation/ConversationFragment;->c(Lo/axv;)J

    move-result-wide v0

    invoke-virtual {p0, v0, v1}, Lcom/huawei/health/sns/ui/conversation/ConversationFragment;->a(J)V

    .line 904
    :goto_0
    return-void
.end method

.method static synthetic e(Lcom/huawei/health/sns/ui/conversation/ConversationFragment;Lo/axv;)Z
    .locals 1

    .line 66
    invoke-direct {p0, p1}, Lcom/huawei/health/sns/ui/conversation/ConversationFragment;->h(Lo/axv;)Z

    move-result v0

    return v0
.end method

.method static synthetic e(Lcom/huawei/health/sns/ui/conversation/ConversationFragment;Z)Z
    .locals 0

    .line 66
    iput-boolean p1, p0, Lcom/huawei/health/sns/ui/conversation/ConversationFragment;->r:Z

    return p1
.end method

.method private f(Lo/axv;)Lo/brd;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Lo/axv;)Lo/brd<Ljava/lang/Boolean;>;"
        }
    .end annotation

    .line 956
    new-instance v0, Lcom/huawei/health/sns/ui/conversation/ConversationFragment$10;

    invoke-direct {v0, p0, p1}, Lcom/huawei/health/sns/ui/conversation/ConversationFragment$10;-><init>(Lcom/huawei/health/sns/ui/conversation/ConversationFragment;Lo/axv;)V

    return-object v0
.end method

.method private f()V
    .locals 4

    .line 743
    new-instance v0, Lcom/huawei/health/sns/ui/conversation/ConversationFragment$e;

    new-instance v1, Landroid/os/Handler;

    invoke-direct {v1}, Landroid/os/Handler;-><init>()V

    invoke-direct {v0, p0, v1}, Lcom/huawei/health/sns/ui/conversation/ConversationFragment$e;-><init>(Lcom/huawei/health/sns/ui/conversation/ConversationFragment;Landroid/os/Handler;)V

    iput-object v0, p0, Lcom/huawei/health/sns/ui/conversation/ConversationFragment;->g:Lcom/huawei/health/sns/ui/conversation/ConversationFragment$e;

    .line 744
    iget-object v0, p0, Lcom/huawei/health/sns/ui/conversation/ConversationFragment;->h:Lcom/huawei/health/sns/ui/HomeActivity;

    invoke-virtual {v0}, Lcom/huawei/health/sns/ui/HomeActivity;->getContentResolver()Landroid/content/ContentResolver;

    move-result-object v0

    sget-object v1, Lo/bbz$h;->d:Landroid/net/Uri;

    iget-object v2, p0, Lcom/huawei/health/sns/ui/conversation/ConversationFragment;->g:Lcom/huawei/health/sns/ui/conversation/ConversationFragment$e;

    const/4 v3, 0x1

    invoke-virtual {v0, v1, v3, v2}, Landroid/content/ContentResolver;->registerContentObserver(Landroid/net/Uri;ZLandroid/database/ContentObserver;)V

    .line 745
    iget-object v0, p0, Lcom/huawei/health/sns/ui/conversation/ConversationFragment;->h:Lcom/huawei/health/sns/ui/HomeActivity;

    invoke-virtual {v0}, Lcom/huawei/health/sns/ui/HomeActivity;->getContentResolver()Landroid/content/ContentResolver;

    move-result-object v0

    sget-object v1, Lo/bbz$p;->c:Landroid/net/Uri;

    iget-object v2, p0, Lcom/huawei/health/sns/ui/conversation/ConversationFragment;->g:Lcom/huawei/health/sns/ui/conversation/ConversationFragment$e;

    const/4 v3, 0x1

    invoke-virtual {v0, v1, v3, v2}, Landroid/content/ContentResolver;->registerContentObserver(Landroid/net/Uri;ZLandroid/database/ContentObserver;)V

    .line 747
    iget-object v0, p0, Lcom/huawei/health/sns/ui/conversation/ConversationFragment;->h:Lcom/huawei/health/sns/ui/HomeActivity;

    invoke-virtual {v0}, Lcom/huawei/health/sns/ui/HomeActivity;->getContentResolver()Landroid/content/ContentResolver;

    move-result-object v0

    sget-object v1, Lo/bbz$a;->b:Landroid/net/Uri;

    iget-object v2, p0, Lcom/huawei/health/sns/ui/conversation/ConversationFragment;->g:Lcom/huawei/health/sns/ui/conversation/ConversationFragment$e;

    const/4 v3, 0x1

    invoke-virtual {v0, v1, v3, v2}, Landroid/content/ContentResolver;->registerContentObserver(Landroid/net/Uri;ZLandroid/database/ContentObserver;)V

    .line 748
    iget-object v0, p0, Lcom/huawei/health/sns/ui/conversation/ConversationFragment;->h:Lcom/huawei/health/sns/ui/HomeActivity;

    invoke-virtual {v0}, Lcom/huawei/health/sns/ui/HomeActivity;->getContentResolver()Landroid/content/ContentResolver;

    move-result-object v0

    sget-object v1, Lo/bbz$e;->b:Landroid/net/Uri;

    iget-object v2, p0, Lcom/huawei/health/sns/ui/conversation/ConversationFragment;->g:Lcom/huawei/health/sns/ui/conversation/ConversationFragment$e;

    const/4 v3, 0x1

    invoke-virtual {v0, v1, v3, v2}, Landroid/content/ContentResolver;->registerContentObserver(Landroid/net/Uri;ZLandroid/database/ContentObserver;)V

    .line 749
    return-void
.end method

.method static synthetic g(Lcom/huawei/health/sns/ui/conversation/ConversationFragment;)I
    .locals 1

    .line 66
    iget v0, p0, Lcom/huawei/health/sns/ui/conversation/ConversationFragment;->q:I

    return v0
.end method

.method private g(Lo/axv;)Lo/brd;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Lo/axv;)Lo/brd<Ljava/lang/Boolean;>;"
        }
    .end annotation

    .line 1037
    new-instance v0, Lcom/huawei/health/sns/ui/conversation/ConversationFragment$8;

    invoke-direct {v0, p0, p1}, Lcom/huawei/health/sns/ui/conversation/ConversationFragment$8;-><init>(Lcom/huawei/health/sns/ui/conversation/ConversationFragment;Lo/axv;)V

    .line 1057
    return-object v0
.end method

.method private g()V
    .locals 2

    .line 506
    invoke-static {}, Lo/brb;->d()Lo/brb;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/health/sns/ui/conversation/ConversationFragment;->t:Lo/bgd;

    invoke-static {v1}, Lcom/huawei/health/sns/ui/conversation/ConversationFragment;->b(Lo/bgd;)Ljava/lang/Runnable;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/brb;->d(Ljava/lang/Runnable;)V

    .line 507
    return-void
.end method

.method static synthetic h(Lcom/huawei/health/sns/ui/conversation/ConversationFragment;Lo/axv;)J
    .locals 2

    .line 66
    invoke-direct {p0, p1}, Lcom/huawei/health/sns/ui/conversation/ConversationFragment;->c(Lo/axv;)J

    move-result-wide v0

    return-wide v0
.end method

.method private h()V
    .locals 1

    .line 632
    iget-object v0, p0, Lcom/huawei/health/sns/ui/conversation/ConversationFragment;->h:Lcom/huawei/health/sns/ui/HomeActivity;

    invoke-static {v0}, Lo/bmn;->a(Landroid/app/Activity;)V

    .line 633
    return-void
.end method

.method private h(Lo/axv;)Z
    .locals 1

    .line 916
    new-instance v0, Lo/bgc;

    invoke-direct {v0}, Lo/bgc;-><init>()V

    invoke-virtual {v0, p1}, Lo/bgc;->b(Lo/axv;)Z

    move-result v0

    return v0
.end method

.method private i()V
    .locals 1

    .line 268
    iget-object v0, p0, Lcom/huawei/health/sns/ui/conversation/ConversationFragment;->e:Landroid/widget/ListView;

    invoke-virtual {v0, p0}, Landroid/widget/ListView;->setOnScrollListener(Landroid/widget/AbsListView$OnScrollListener;)V

    .line 269
    iget-object v0, p0, Lcom/huawei/health/sns/ui/conversation/ConversationFragment;->e:Landroid/widget/ListView;

    invoke-virtual {v0, p0}, Landroid/widget/ListView;->setOnItemClickListener(Landroid/widget/AdapterView$OnItemClickListener;)V

    .line 270
    iget-object v0, p0, Lcom/huawei/health/sns/ui/conversation/ConversationFragment;->e:Landroid/widget/ListView;

    invoke-virtual {v0, p0}, Landroid/widget/ListView;->setOnItemLongClickListener(Landroid/widget/AdapterView$OnItemLongClickListener;)V

    .line 271
    return-void
.end method

.method private i(Lo/axv;)V
    .locals 2

    .line 1031
    invoke-static {}, Lo/brb;->d()Lo/brb;

    move-result-object v0

    invoke-direct {p0, p1}, Lcom/huawei/health/sns/ui/conversation/ConversationFragment;->g(Lo/axv;)Lo/brd;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/brb;->c(Lo/brd;)Lo/bqy;

    .line 1033
    return-void
.end method

.method private k()V
    .locals 4

    .line 258
    new-instance v0, Lo/bga;

    iget-object v1, p0, Lcom/huawei/health/sns/ui/conversation/ConversationFragment;->h:Lcom/huawei/health/sns/ui/HomeActivity;

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-direct {v0, v1, v2, v3}, Lo/bga;-><init>(Landroid/content/Context;Landroid/database/Cursor;Z)V

    iput-object v0, p0, Lcom/huawei/health/sns/ui/conversation/ConversationFragment;->a:Lo/bga;

    .line 259
    iget-object v0, p0, Lcom/huawei/health/sns/ui/conversation/ConversationFragment;->a:Lo/bga;

    iget-object v1, p0, Lcom/huawei/health/sns/ui/conversation/ConversationFragment;->b:Lo/bga$d;

    invoke-virtual {v0, v1}, Lo/bga;->e(Lo/bga$d;)V

    .line 260
    iget-object v0, p0, Lcom/huawei/health/sns/ui/conversation/ConversationFragment;->e:Landroid/widget/ListView;

    iget-object v1, p0, Lcom/huawei/health/sns/ui/conversation/ConversationFragment;->a:Lo/bga;

    invoke-virtual {v0, v1}, Landroid/widget/ListView;->setAdapter(Landroid/widget/ListAdapter;)V

    .line 261
    return-void
.end method

.method static synthetic k(Lcom/huawei/health/sns/ui/conversation/ConversationFragment;)V
    .locals 0

    .line 66
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/conversation/ConversationFragment;->h()V

    return-void
.end method

.method private k(Lo/axv;)V
    .locals 2

    .line 950
    invoke-virtual {p0}, Lcom/huawei/health/sns/ui/conversation/ConversationFragment;->b()Lo/bio;

    move-result-object v0

    invoke-virtual {v0}, Lo/bio;->a()V

    .line 951
    invoke-static {}, Lo/brb;->d()Lo/brb;

    move-result-object v0

    invoke-direct {p0, p1}, Lcom/huawei/health/sns/ui/conversation/ConversationFragment;->f(Lo/axv;)Lo/brd;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/brb;->c(Lo/brd;)Lo/bqy;

    .line 952
    return-void
.end method

.method private l(Lo/axv;)V
    .locals 1

    .line 1067
    new-instance v0, Lo/bgc;

    invoke-direct {v0}, Lo/bgc;-><init>()V

    invoke-virtual {v0, p1}, Lo/bgc;->d(Lo/axv;)V

    .line 1068
    return-void
.end method

.method private n(Lo/axv;)I
    .locals 4

    .line 1075
    const/4 v1, 0x0

    .line 1077
    invoke-direct {p0, p1}, Lcom/huawei/health/sns/ui/conversation/ConversationFragment;->b(Lo/axv;)I

    move-result v2

    .line 1078
    invoke-direct {p0, p1}, Lcom/huawei/health/sns/ui/conversation/ConversationFragment;->h(Lo/axv;)Z

    move-result v3

    .line 1080
    const/4 v0, 0x1

    if-eq v2, v0, :cond_3

    .line 1083
    invoke-direct {p0, p1}, Lcom/huawei/health/sns/ui/conversation/ConversationFragment;->d(Lo/axv;)I

    move-result v0

    if-nez v0, :cond_1

    .line 1086
    if-nez v3, :cond_0

    .line 1088
    sget v1, Lcom/huawei/android/sns/R$array;->set_conversation_0_0_item:I

    goto :goto_0

    .line 1092
    :cond_0
    sget v1, Lcom/huawei/android/sns/R$array;->set_conversation_0_1_item:I

    goto :goto_0

    .line 1099
    :cond_1
    if-nez v3, :cond_2

    .line 1101
    sget v1, Lcom/huawei/android/sns/R$array;->set_conversation_1_0_item:I

    goto :goto_0

    .line 1105
    :cond_2
    sget v1, Lcom/huawei/android/sns/R$array;->set_conversation_1_1_item:I

    goto :goto_0

    .line 1113
    :cond_3
    invoke-direct {p0, p1}, Lcom/huawei/health/sns/ui/conversation/ConversationFragment;->d(Lo/axv;)I

    move-result v0

    if-nez v0, :cond_5

    .line 1115
    if-nez v3, :cond_4

    .line 1117
    sget v1, Lcom/huawei/android/sns/R$array;->set_conversation_2_0_item:I

    goto :goto_0

    .line 1121
    :cond_4
    sget v1, Lcom/huawei/android/sns/R$array;->set_conversation_2_1_item:I

    goto :goto_0

    .line 1127
    :cond_5
    if-nez v3, :cond_6

    .line 1129
    sget v1, Lcom/huawei/android/sns/R$array;->set_conversation_3_0_item:I

    goto :goto_0

    .line 1133
    :cond_6
    sget v1, Lcom/huawei/android/sns/R$array;->set_conversation_3_1_item:I

    .line 1137
    :goto_0
    return v1
.end method

.method private p()V
    .locals 2

    .line 1152
    iget-object v0, p0, Lcom/huawei/health/sns/ui/conversation/ConversationFragment;->g:Lcom/huawei/health/sns/ui/conversation/ConversationFragment$e;

    if-eqz v0, :cond_0

    .line 1154
    invoke-virtual {p0}, Lcom/huawei/health/sns/ui/conversation/ConversationFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    invoke-virtual {v0}, Landroid/support/v4/app/FragmentActivity;->getContentResolver()Landroid/content/ContentResolver;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/health/sns/ui/conversation/ConversationFragment;->g:Lcom/huawei/health/sns/ui/conversation/ConversationFragment$e;

    invoke-virtual {v0, v1}, Landroid/content/ContentResolver;->unregisterContentObserver(Landroid/database/ContentObserver;)V

    .line 1156
    :cond_0
    return-void
.end method


# virtual methods
.method public a()V
    .locals 5

    .line 659
    iget-boolean v0, p0, Lcom/huawei/health/sns/ui/conversation/ConversationFragment;->r:Z

    if-eqz v0, :cond_0

    .line 661
    const-string v0, "ConversationFragment"

    const-string v1, "moveToUnreadConversation,isSmoothScroll is true"

    invoke-static {v0, v1}, Lo/bpf;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 662
    return-void

    .line 664
    :cond_0
    iget-object v0, p0, Lcom/huawei/health/sns/ui/conversation/ConversationFragment;->e:Landroid/widget/ListView;

    invoke-virtual {v0}, Landroid/widget/ListView;->getFirstVisiblePosition()I

    move-result v2

    .line 665
    iget-object v0, p0, Lcom/huawei/health/sns/ui/conversation/ConversationFragment;->e:Landroid/widget/ListView;

    invoke-virtual {v0}, Landroid/widget/ListView;->getLastVisiblePosition()I

    move-result v3

    .line 666
    sub-int v0, v3, v2

    iput v0, p0, Lcom/huawei/health/sns/ui/conversation/ConversationFragment;->q:I

    .line 667
    const/4 v4, 0x0

    .line 669
    iget v0, p0, Lcom/huawei/health/sns/ui/conversation/ConversationFragment;->s:I

    add-int/lit8 v0, v0, -0x1

    if-ne v3, v0, :cond_1

    .line 671
    const/4 v4, 0x1

    .line 673
    :cond_1
    iget-object v0, p0, Lcom/huawei/health/sns/ui/conversation/ConversationFragment;->o:Ljava/util/List;

    if-eqz v0, :cond_2

    iget-object v0, p0, Lcom/huawei/health/sns/ui/conversation/ConversationFragment;->o:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-lez v0, :cond_2

    .line 675
    iget-object v0, p0, Lcom/huawei/health/sns/ui/conversation/ConversationFragment;->o:Ljava/util/List;

    invoke-direct {p0, v2, v0, v4}, Lcom/huawei/health/sns/ui/conversation/ConversationFragment;->b(ILjava/util/List;Z)V

    goto :goto_0

    .line 677
    :cond_2
    iget-object v0, p0, Lcom/huawei/health/sns/ui/conversation/ConversationFragment;->u:Ljava/util/List;

    if-eqz v0, :cond_3

    iget-object v0, p0, Lcom/huawei/health/sns/ui/conversation/ConversationFragment;->u:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-lez v0, :cond_3

    .line 679
    iget-object v0, p0, Lcom/huawei/health/sns/ui/conversation/ConversationFragment;->u:Ljava/util/List;

    invoke-direct {p0, v2, v0, v4}, Lcom/huawei/health/sns/ui/conversation/ConversationFragment;->b(ILjava/util/List;Z)V

    goto :goto_0

    .line 684
    :cond_3
    iget-object v0, p0, Lcom/huawei/health/sns/ui/conversation/ConversationFragment;->e:Landroid/widget/ListView;

    const/4 v1, 0x0

    invoke-direct {p0, v0, v1}, Lcom/huawei/health/sns/ui/conversation/ConversationFragment;->b(Landroid/widget/AbsListView;I)V

    .line 686
    :goto_0
    return-void
.end method

.method public a(J)V
    .locals 2

    .line 924
    invoke-static {}, Lo/brb;->d()Lo/brb;

    move-result-object v0

    invoke-static {p1, p2}, Lcom/huawei/health/sns/ui/conversation/ConversationFragment;->d(J)Lo/brd;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/brb;->c(Lo/brd;)Lo/bqy;

    .line 926
    return-void
.end method

.method public a(Lo/bgb;)V
    .locals 0

    .line 211
    return-void
.end method

.method protected b()Lo/bio;
    .locals 5

    .line 280
    iget-object v0, p0, Lcom/huawei/health/sns/ui/conversation/ConversationFragment;->f:Lo/bio;

    if-nez v0, :cond_0

    .line 283
    new-instance v0, Lo/bio;

    invoke-virtual {p0}, Lcom/huawei/health/sns/ui/conversation/ConversationFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v1

    const-string v2, ""

    sget v3, Lcom/huawei/android/sns/R$string;->sns_waiting:I

    invoke-virtual {p0, v3}, Lcom/huawei/health/sns/ui/conversation/ConversationFragment;->getString(I)Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x1

    invoke-direct {v0, v1, v2, v3, v4}, Lo/bio;-><init>(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Z)V

    iput-object v0, p0, Lcom/huawei/health/sns/ui/conversation/ConversationFragment;->f:Lo/bio;

    .line 285
    :cond_0
    iget-object v0, p0, Lcom/huawei/health/sns/ui/conversation/ConversationFragment;->f:Lo/bio;

    return-object v0
.end method

.method protected d()V
    .locals 1

    .line 293
    iget-object v0, p0, Lcom/huawei/health/sns/ui/conversation/ConversationFragment;->f:Lo/bio;

    if-eqz v0, :cond_0

    .line 295
    iget-object v0, p0, Lcom/huawei/health/sns/ui/conversation/ConversationFragment;->f:Lo/bio;

    invoke-virtual {v0}, Lo/bio;->c()V

    .line 296
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/health/sns/ui/conversation/ConversationFragment;->f:Lo/bio;

    .line 298
    :cond_0
    return-void
.end method

.method protected d(Lcom/huawei/health/sns/model/group/Group;)V
    .locals 2

    .line 1005
    iget-object v0, p0, Lcom/huawei/health/sns/ui/conversation/ConversationFragment;->k:Lo/atv;

    if-nez v0, :cond_0

    .line 1007
    new-instance v0, Lo/atv;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lo/atv;-><init>(Landroid/os/Handler;)V

    iput-object v0, p0, Lcom/huawei/health/sns/ui/conversation/ConversationFragment;->k:Lo/atv;

    .line 1009
    :cond_0
    iget-object v0, p0, Lcom/huawei/health/sns/ui/conversation/ConversationFragment;->k:Lo/atv;

    invoke-virtual {v0, p1}, Lo/atv;->a(Lcom/huawei/health/sns/model/group/Group;)V

    .line 1010
    return-void
.end method

.method public d(Ljava/lang/Class;Landroid/os/Bundle;ZIZ)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/lang/Class<*>;Landroid/os/Bundle;ZIZ)V"
        }
    .end annotation

    .line 350
    if-nez p1, :cond_0

    .line 352
    return-void

    .line 355
    :cond_0
    new-instance v2, Landroid/content/Intent;

    invoke-direct {v2}, Landroid/content/Intent;-><init>()V

    .line 356
    iget-object v0, p0, Lcom/huawei/health/sns/ui/conversation/ConversationFragment;->h:Lcom/huawei/health/sns/ui/HomeActivity;

    invoke-virtual {v2, v0, p1}, Landroid/content/Intent;->setClass(Landroid/content/Context;Ljava/lang/Class;)Landroid/content/Intent;

    .line 358
    if-eqz p2, :cond_1

    .line 360
    invoke-virtual {v2, p2}, Landroid/content/Intent;->putExtras(Landroid/os/Bundle;)Landroid/content/Intent;

    .line 363
    :cond_1
    if-eqz p3, :cond_2

    .line 365
    invoke-virtual {p0, v2, p4}, Lcom/huawei/health/sns/ui/conversation/ConversationFragment;->startActivityForResult(Landroid/content/Intent;I)V

    goto :goto_0

    .line 371
    :cond_2
    :try_start_0
    invoke-virtual {p0, v2}, Lcom/huawei/health/sns/ui/conversation/ConversationFragment;->startActivity(Landroid/content/Intent;)V
    :try_end_0
    .catch Ljava/lang/IllegalStateException; {:try_start_0 .. :try_end_0} :catch_0

    .line 376
    goto :goto_0

    .line 373
    :catch_0
    move-exception v3

    .line 375
    const-string v0, "ConversationFragment"

    const-string v1, "jumpToPage IllegalStateException"

    invoke-static {v0, v1}, Lo/bpf;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 378
    :goto_0
    return-void
.end method

.method protected e()V
    .locals 10

    .line 385
    iget-object v0, p0, Lcom/huawei/health/sns/ui/conversation/ConversationFragment;->d:Lcom/huawei/health/sns/ui/conversation/ConversationFragment$ThreadListQueryHandler;

    const/16 v1, 0x6a5

    invoke-virtual {v0, v1}, Lcom/huawei/health/sns/ui/conversation/ConversationFragment$ThreadListQueryHandler;->cancelOperation(I)V

    .line 388
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    iget-wide v2, p0, Lcom/huawei/health/sns/ui/conversation/ConversationFragment;->l:J

    sub-long v8, v0, v2

    .line 390
    const-wide/16 v0, 0x0

    cmp-long v0, v8, v0

    if-lez v0, :cond_0

    const-wide/16 v0, 0x2bc

    cmp-long v0, v8, v0

    if-gez v0, :cond_0

    .line 392
    iget-object v0, p0, Lcom/huawei/health/sns/ui/conversation/ConversationFragment;->d:Lcom/huawei/health/sns/ui/conversation/ConversationFragment$ThreadListQueryHandler;

    new-instance v1, Lcom/huawei/health/sns/ui/conversation/ConversationFragment$4;

    invoke-direct {v1, p0}, Lcom/huawei/health/sns/ui/conversation/ConversationFragment$4;-><init>(Lcom/huawei/health/sns/ui/conversation/ConversationFragment;)V

    const-wide/16 v2, 0x2bc

    sub-long/2addr v2, v8

    invoke-virtual {v0, v1, v2, v3}, Lcom/huawei/health/sns/ui/conversation/ConversationFragment$ThreadListQueryHandler;->postDelayed(Ljava/lang/Runnable;J)Z

    goto :goto_0

    .line 415
    :cond_0
    iget-object v0, p0, Lcom/huawei/health/sns/ui/conversation/ConversationFragment;->d:Lcom/huawei/health/sns/ui/conversation/ConversationFragment$ThreadListQueryHandler;

    sget-object v3, Lo/bbz$e;->c:Landroid/net/Uri;

    new-instance v1, Lo/axv;

    invoke-direct {v1}, Lo/axv;-><init>()V

    .line 416
    invoke-virtual {v1}, Lo/axv;->d()[Ljava/lang/String;

    move-result-object v4

    const-string v7, "top_time desc,last_message_date desc"

    .line 415
    const/16 v1, 0x6a5

    const/4 v2, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    invoke-virtual/range {v0 .. v7}, Lcom/huawei/health/sns/ui/conversation/ConversationFragment$ThreadListQueryHandler;->startQuery(ILjava/lang/Object;Landroid/net/Uri;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)V

    .line 418
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    iput-wide v0, p0, Lcom/huawei/health/sns/ui/conversation/ConversationFragment;->l:J

    .line 420
    :goto_0
    return-void
.end method

.method protected e(JIZ)V
    .locals 7

    .line 1019
    iget-object v0, p0, Lcom/huawei/health/sns/ui/conversation/ConversationFragment;->i:Lo/axc;

    if-nez v0, :cond_0

    .line 1021
    new-instance v0, Lo/axc;

    invoke-direct {v0}, Lo/axc;-><init>()V

    iput-object v0, p0, Lcom/huawei/health/sns/ui/conversation/ConversationFragment;->i:Lo/axc;

    .line 1023
    :cond_0
    iget-object v0, p0, Lcom/huawei/health/sns/ui/conversation/ConversationFragment;->i:Lo/axc;

    iget-object v1, p0, Lcom/huawei/health/sns/ui/conversation/ConversationFragment;->h:Lcom/huawei/health/sns/ui/HomeActivity;

    move-wide v3, p1

    move v5, p3

    move v6, p4

    const/4 v2, 0x0

    invoke-virtual/range {v0 .. v6}, Lo/axc;->d(Landroid/content/Context;IJIZ)V

    .line 1024
    return-void
.end method

.method public onAttach(Landroid/app/Activity;)V
    .locals 3

    .line 536
    invoke-super {p0, p1}, Landroid/support/v4/app/Fragment;->onAttach(Landroid/app/Activity;)V

    .line 539
    move-object v0, p1

    :try_start_0
    check-cast v0, Lcom/huawei/health/sns/ui/HomeActivity;

    iput-object v0, p0, Lcom/huawei/health/sns/ui/conversation/ConversationFragment;->t:Lo/bgd;
    :try_end_0
    .catch Ljava/lang/ClassCastException; {:try_start_0 .. :try_end_0} :catch_0

    .line 544
    goto :goto_0

    .line 541
    :catch_0
    move-exception v2

    .line 543
    const-string v0, "ConversationFragment"

    const-string v1, "ConversationFragment onAttach ClassCastException"

    invoke-static {v0, v1}, Lo/bpf;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 545
    :goto_0
    return-void
.end method

.method public onConfigurationChanged(Landroid/content/res/Configuration;)V
    .locals 2

    .line 314
    invoke-super {p0, p1}, Landroid/support/v4/app/Fragment;->onConfigurationChanged(Landroid/content/res/Configuration;)V

    .line 315
    iget-object v0, p0, Lcom/huawei/health/sns/ui/conversation/ConversationFragment;->c:Landroid/widget/LinearLayout;

    invoke-virtual {p0}, Lcom/huawei/health/sns/ui/conversation/ConversationFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v1

    invoke-static {v0, v1}, Lo/bph;->b(Landroid/widget/LinearLayout;Landroid/app/Activity;)V

    .line 318
    iget-object v0, p0, Lcom/huawei/health/sns/ui/conversation/ConversationFragment;->p:Landroid/database/Cursor;

    if-eqz v0, :cond_0

    .line 320
    iget-object v0, p0, Lcom/huawei/health/sns/ui/conversation/ConversationFragment;->a:Lo/bga;

    iget-object v1, p0, Lcom/huawei/health/sns/ui/conversation/ConversationFragment;->p:Landroid/database/Cursor;

    invoke-virtual {v0, v1}, Lo/bga;->changeCursor(Landroid/database/Cursor;)V

    .line 321
    iget-object v0, p0, Lcom/huawei/health/sns/ui/conversation/ConversationFragment;->a:Lo/bga;

    invoke-virtual {v0}, Lo/bga;->notifyDataSetChanged()V

    .line 324
    :cond_0
    invoke-virtual {p0}, Lcom/huawei/health/sns/ui/conversation/ConversationFragment;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    move-result-object v0

    iget v0, v0, Landroid/content/res/Configuration;->orientation:I

    const/4 v1, 0x2

    if-ne v0, v1, :cond_1

    .line 327
    iget-boolean v0, p0, Lcom/huawei/health/sns/ui/conversation/ConversationFragment;->m:Z

    if-eqz v0, :cond_2

    iget-object v0, p0, Lcom/huawei/health/sns/ui/conversation/ConversationFragment;->n:Landroid/view/View;

    if-eqz v0, :cond_2

    .line 329
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/health/sns/ui/conversation/ConversationFragment;->m:Z

    .line 330
    iget-object v0, p0, Lcom/huawei/health/sns/ui/conversation/ConversationFragment;->e:Landroid/widget/ListView;

    iget-object v1, p0, Lcom/huawei/health/sns/ui/conversation/ConversationFragment;->n:Landroid/view/View;

    invoke-virtual {v0, v1}, Landroid/widget/ListView;->removeFooterView(Landroid/view/View;)Z

    goto :goto_0

    .line 335
    :cond_1
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/conversation/ConversationFragment;->c()V

    .line 337
    :cond_2
    :goto_0
    return-void
.end method

.method public onCreate(Landroid/os/Bundle;)V
    .locals 2

    .line 216
    invoke-super {p0, p1}, Landroid/support/v4/app/Fragment;->onCreate(Landroid/os/Bundle;)V

    .line 217
    invoke-virtual {p0}, Lcom/huawei/health/sns/ui/conversation/ConversationFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    check-cast v0, Lcom/huawei/health/sns/ui/HomeActivity;

    iput-object v0, p0, Lcom/huawei/health/sns/ui/conversation/ConversationFragment;->h:Lcom/huawei/health/sns/ui/HomeActivity;

    .line 218
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/conversation/ConversationFragment;->f()V

    .line 219
    new-instance v0, Lcom/huawei/health/sns/ui/conversation/ConversationFragment$ThreadListQueryHandler;

    iget-object v1, p0, Lcom/huawei/health/sns/ui/conversation/ConversationFragment;->h:Lcom/huawei/health/sns/ui/HomeActivity;

    invoke-virtual {v1}, Lcom/huawei/health/sns/ui/HomeActivity;->getContentResolver()Landroid/content/ContentResolver;

    move-result-object v1

    invoke-direct {v0, p0, v1}, Lcom/huawei/health/sns/ui/conversation/ConversationFragment$ThreadListQueryHandler;-><init>(Lcom/huawei/health/sns/ui/conversation/ConversationFragment;Landroid/content/ContentResolver;)V

    iput-object v0, p0, Lcom/huawei/health/sns/ui/conversation/ConversationFragment;->d:Lcom/huawei/health/sns/ui/conversation/ConversationFragment$ThreadListQueryHandler;

    .line 220
    return-void
.end method

.method public onCreateView(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;
    .locals 3

    .line 232
    sget v0, Lcom/huawei/android/sns/R$layout;->sns_conversation:I

    const/4 v1, 0x0

    invoke-virtual {p1, v0, p2, v1}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object v2

    .line 233
    invoke-direct {p0, v2}, Lcom/huawei/health/sns/ui/conversation/ConversationFragment;->b(Landroid/view/View;)V

    .line 234
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/conversation/ConversationFragment;->k()V

    .line 235
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/conversation/ConversationFragment;->c()V

    .line 236
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/conversation/ConversationFragment;->i()V

    .line 237
    return-object v2
.end method

.method public onDestroy()V
    .locals 0

    .line 1143
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/conversation/ConversationFragment;->p()V

    .line 1144
    invoke-super {p0}, Landroid/support/v4/app/Fragment;->onDestroy()V

    .line 1145
    return-void
.end method

.method public onItemClick(Landroid/widget/AdapterView;Landroid/view/View;IJ)V
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Landroid/widget/AdapterView<*>;Landroid/view/View;IJ)V"
        }
    .end annotation

    .line 561
    invoke-virtual {p0}, Lcom/huawei/health/sns/ui/conversation/ConversationFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    invoke-static {v0}, Lo/bmn;->a(Landroid/app/Activity;)V

    .line 563
    invoke-virtual {p2}, Landroid/view/View;->getTag()Ljava/lang/Object;

    move-result-object v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    invoke-virtual {p2}, Landroid/view/View;->getTag()Ljava/lang/Object;

    move-result-object v0

    instance-of v0, v0, Lo/axv;

    if-nez v0, :cond_1

    .line 565
    :cond_0
    return-void

    .line 567
    :cond_1
    invoke-virtual {p2}, Landroid/view/View;->getTag()Ljava/lang/Object;

    move-result-object v0

    move-object v6, v0

    check-cast v6, Lo/axv;

    .line 568
    new-instance v7, Landroid/os/Bundle;

    invoke-direct {v7}, Landroid/os/Bundle;-><init>()V

    .line 569
    const-string v0, "unreadMsgNumber"

    invoke-virtual {v6}, Lo/axv;->m()I

    move-result v1

    invoke-virtual {v7, v0, v1}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    .line 571
    invoke-direct {p0, v6}, Lcom/huawei/health/sns/ui/conversation/ConversationFragment;->a(Lo/axv;)I

    move-result v0

    const/4 v1, 0x1

    if-ne v1, v0, :cond_3

    .line 572
    invoke-direct {p0, v6}, Lcom/huawei/health/sns/ui/conversation/ConversationFragment;->b(Lo/axv;)I

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_2

    .line 573
    invoke-static {}, Lo/anx;->g()Z

    move-result v0

    if-eqz v0, :cond_5

    .line 574
    const-string v0, "userId"

    invoke-direct {p0, v6}, Lcom/huawei/health/sns/ui/conversation/ConversationFragment;->c(Lo/axv;)J

    move-result-wide v1

    invoke-virtual {v7, v0, v1, v2}, Landroid/os/Bundle;->putLong(Ljava/lang/String;J)V

    .line 575
    move-object v0, p0

    const-class v1, Lcom/huawei/health/sns/ui/chat/AssistantChatActivity;

    move-object v2, v7

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    invoke-virtual/range {v0 .. v5}, Lcom/huawei/health/sns/ui/conversation/ConversationFragment;->d(Ljava/lang/Class;Landroid/os/Bundle;ZIZ)V

    goto :goto_0

    .line 579
    :cond_2
    const-string v0, "userId"

    invoke-direct {p0, v6}, Lcom/huawei/health/sns/ui/conversation/ConversationFragment;->c(Lo/axv;)J

    move-result-wide v1

    invoke-virtual {v7, v0, v1, v2}, Landroid/os/Bundle;->putLong(Ljava/lang/String;J)V

    .line 580
    move-object v0, p0

    const-class v1, Lcom/huawei/health/sns/ui/chat/SingleChatActivity;

    move-object v2, v7

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    invoke-virtual/range {v0 .. v5}, Lcom/huawei/health/sns/ui/conversation/ConversationFragment;->d(Ljava/lang/Class;Landroid/os/Bundle;ZIZ)V

    goto :goto_0

    .line 585
    :cond_3
    invoke-direct {p0, v6}, Lcom/huawei/health/sns/ui/conversation/ConversationFragment;->a(Lo/axv;)I

    move-result v0

    const/4 v1, 0x2

    if-ne v1, v0, :cond_4

    .line 587
    const-string v0, "groupId"

    invoke-direct {p0, v6}, Lcom/huawei/health/sns/ui/conversation/ConversationFragment;->c(Lo/axv;)J

    move-result-wide v1

    invoke-virtual {v7, v0, v1, v2}, Landroid/os/Bundle;->putLong(Ljava/lang/String;J)V

    .line 588
    move-object v0, p0

    const-class v1, Lcom/huawei/health/sns/ui/chat/GroupChatActivity;

    move-object v2, v7

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    invoke-virtual/range {v0 .. v5}, Lcom/huawei/health/sns/ui/conversation/ConversationFragment;->d(Ljava/lang/Class;Landroid/os/Bundle;ZIZ)V

    goto :goto_0

    .line 592
    :cond_4
    const-string v0, "ConversationFragment"

    const-string v1, "jumpToPage:chatType is null"

    invoke-static {v0, v1}, Lo/bpf;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 594
    :cond_5
    :goto_0
    return-void
.end method

.method public onItemLongClick(Landroid/widget/AdapterView;Landroid/view/View;IJ)Z
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Landroid/widget/AdapterView<*>;Landroid/view/View;IJ)Z"
        }
    .end annotation

    .line 760
    invoke-virtual {p2}, Landroid/view/View;->getTag()Ljava/lang/Object;

    move-result-object v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    invoke-virtual {p2}, Landroid/view/View;->getTag()Ljava/lang/Object;

    move-result-object v0

    instance-of v0, v0, Lo/axv;

    if-nez v0, :cond_1

    .line 762
    :cond_0
    const/4 v0, 0x0

    return v0

    .line 764
    :cond_1
    invoke-virtual {p2}, Landroid/view/View;->getTag()Ljava/lang/Object;

    move-result-object v0

    move-object v3, v0

    check-cast v3, Lo/axv;

    .line 766
    iget-object v0, p0, Lcom/huawei/health/sns/ui/conversation/ConversationFragment;->h:Lcom/huawei/health/sns/ui/HomeActivity;

    invoke-direct {p0, v3}, Lcom/huawei/health/sns/ui/conversation/ConversationFragment;->n(Lo/axv;)I

    move-result v1

    new-instance v2, Lcom/huawei/health/sns/ui/conversation/ConversationFragment$3;

    invoke-direct {v2, p0, v3}, Lcom/huawei/health/sns/ui/conversation/ConversationFragment$3;-><init>(Lcom/huawei/health/sns/ui/conversation/ConversationFragment;Lo/axv;)V

    invoke-static {v0, v1, v2}, Lo/boj;->e(Landroid/app/Activity;ILo/boj$a;)V

    .line 783
    const/4 v0, 0x1

    return v0
.end method

.method public onScroll(Landroid/widget/AbsListView;III)V
    .locals 0

    .line 604
    return-void
.end method

.method public onScrollStateChanged(Landroid/widget/AbsListView;I)V
    .locals 1

    .line 609
    packed-switch p2, :pswitch_data_0

    goto :goto_0

    .line 613
    :pswitch_0
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/health/sns/ui/conversation/ConversationFragment;->r:Z

    .line 614
    goto :goto_0

    .line 616
    :pswitch_1
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/conversation/ConversationFragment;->h()V

    .line 617
    goto :goto_0

    .line 619
    :pswitch_2
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/huawei/health/sns/ui/conversation/ConversationFragment;->r:Z

    .line 620
    .line 625
    :goto_0
    return-void

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
        :pswitch_2
        :pswitch_1
    .end packed-switch
.end method

.method public onStart()V
    .locals 0

    .line 225
    invoke-super {p0}, Landroid/support/v4/app/Fragment;->onStart()V

    .line 226
    invoke-virtual {p0}, Lcom/huawei/health/sns/ui/conversation/ConversationFragment;->e()V

    .line 227
    return-void
.end method
