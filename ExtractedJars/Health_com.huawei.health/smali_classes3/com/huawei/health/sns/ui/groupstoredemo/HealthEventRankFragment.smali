.class public Lcom/huawei/health/sns/ui/groupstoredemo/HealthEventRankFragment;
.super Landroid/support/v4/app/Fragment;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/huawei/health/sns/ui/groupstoredemo/HealthEventRankFragment$d;
    }
.end annotation


# instance fields
.field private A:Landroid/widget/TextView;

.field private B:Z

.field private C:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<Lcom/huawei/health/sns/model/group/GroupMember;>;"
        }
    .end annotation
.end field

.field private D:Ljava/lang/String;

.field private a:Landroid/widget/ImageView;

.field private b:Lo/egb;

.field private c:Lo/egb;

.field private d:Lo/egb;

.field private e:Lo/egb;

.field private f:Landroid/app/Activity;

.field private g:Landroid/view/View;

.field private h:Landroid/support/v7/widget/RecyclerView;

.field private i:Landroid/widget/ImageView;

.field private j:Landroid/os/Handler;

.field private k:Landroid/view/View;

.field private l:Lo/bii;

.field private m:Ljava/lang/String;

.field private n:I

.field private o:D

.field private p:I

.field private q:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<Lcom/huawei/health/sns/ui/group/healthbeans/GroupUserRank;>;"
        }
    .end annotation
.end field

.field private r:Lo/egn;

.field private s:Lo/egb;

.field private t:Lcom/huawei/health/sns/ui/group/healthbeans/GroupUserRank;

.field private u:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<Lcom/huawei/health/sns/ui/group/healthbeans/GroupUserRank;>;"
        }
    .end annotation
.end field

.field private v:Landroid/widget/TextView;

.field private w:Landroid/widget/TextView;

.field private x:Landroid/view/View;

.field private y:Landroid/widget/TextView;

.field private z:Landroid/widget/ImageView;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 61
    invoke-direct {p0}, Landroid/support/v4/app/Fragment;-><init>()V

    .line 91
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthEventRankFragment;->r:Lo/egn;

    .line 119
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthEventRankFragment;->B:Z

    .line 125
    new-instance v0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthEventRankFragment$d;

    invoke-direct {v0, p0}, Lcom/huawei/health/sns/ui/groupstoredemo/HealthEventRankFragment$d;-><init>(Lcom/huawei/health/sns/ui/groupstoredemo/HealthEventRankFragment;)V

    iput-object v0, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthEventRankFragment;->j:Landroid/os/Handler;

    return-void
.end method

.method private a()V
    .locals 2

    .line 862
    iget-object v0, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthEventRankFragment;->D:Ljava/lang/String;

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 863
    invoke-static {p0}, Lcom/bumptech/glide/Glide;->with(Landroid/support/v4/app/Fragment;)Lcom/bumptech/glide/RequestManager;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthEventRankFragment;->D:Ljava/lang/String;

    .line 864
    invoke-virtual {v0, v1}, Lcom/bumptech/glide/RequestManager;->load(Ljava/lang/Object;)Lcom/bumptech/glide/RequestBuilder;

    move-result-object v0

    new-instance v1, Lcom/huawei/health/sns/ui/groupstoredemo/HealthEventRankFragment$3;

    invoke-direct {v1, p0}, Lcom/huawei/health/sns/ui/groupstoredemo/HealthEventRankFragment$3;-><init>(Lcom/huawei/health/sns/ui/groupstoredemo/HealthEventRankFragment;)V

    .line 865
    invoke-virtual {v0, v1}, Lcom/bumptech/glide/RequestBuilder;->into(Lcom/bumptech/glide/request/target/Target;)Lcom/bumptech/glide/request/target/Target;

    .line 888
    :cond_0
    return-void
.end method

.method private a(Landroid/os/Message;)V
    .locals 5

    .line 603
    const-string v0, "Group_HealthEventRankFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "refreshEventRank start"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 604
    iget-object v0, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    move-object v4, v0

    check-cast v4, Ljava/util/List;

    .line 605
    if-eqz v4, :cond_0

    invoke-interface {v4}, Ljava/util/List;->size()I

    move-result v0

    if-gtz v0, :cond_1

    .line 606
    :cond_0
    const-string v0, "Group_HealthEventRankFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "refreshEventRank is Empty"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 607
    return-void

    .line 609
    :cond_1
    iget-object v0, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthEventRankFragment;->g:Landroid/view/View;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 610
    iget-object v0, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthEventRankFragment;->k:Landroid/view/View;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 611
    iget-object v0, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthEventRankFragment;->q:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->clear()V

    .line 612
    iget-object v0, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthEventRankFragment;->q:Ljava/util/List;

    invoke-interface {v0, v4}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    .line 613
    const-string v0, "Group_HealthEventRankFragment"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "refreshEventRank listGroupUserRank size is : "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    iget-object v2, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthEventRankFragment;->q:Ljava/util/List;

    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 614
    const-string v0, "Group_HealthEventRankFragment"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "refreshEventRank listGroupUserRank = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    iget-object v2, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthEventRankFragment;->q:Ljava/util/List;

    invoke-virtual {v2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 616
    iget-object v0, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthEventRankFragment;->l:Lo/bii;

    if-eqz v0, :cond_2

    .line 618
    iget-object v0, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthEventRankFragment;->l:Lo/bii;

    invoke-virtual {v0}, Lo/bii;->notifyDataSetChanged()V

    .line 620
    :cond_2
    return-void
.end method

.method private a(Landroid/view/View;)V
    .locals 1

    .line 208
    sget v0, Lcom/huawei/android/sns/R$id;->event_rank_recycler_view:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/support/v7/widget/RecyclerView;

    iput-object v0, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthEventRankFragment;->h:Landroid/support/v7/widget/RecyclerView;

    .line 211
    sget v0, Lcom/huawei/android/sns/R$id;->tv_title_speed_unit:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lo/egb;

    iput-object v0, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthEventRankFragment;->s:Lo/egb;

    .line 214
    sget v0, Lcom/huawei/android/sns/R$id;->layout_self_container:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthEventRankFragment;->x:Landroid/view/View;

    .line 215
    sget v0, Lcom/huawei/android/sns/R$id;->user_head_img_self:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthEventRankFragment;->z:Landroid/widget/ImageView;

    .line 216
    sget v0, Lcom/huawei/android/sns/R$id;->tv_rank_self:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthEventRankFragment;->w:Landroid/widget/TextView;

    .line 217
    sget v0, Lcom/huawei/android/sns/R$id;->tv_username_self:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthEventRankFragment;->y:Landroid/widget/TextView;

    .line 218
    sget v0, Lcom/huawei/android/sns/R$id;->tv_speed_self:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthEventRankFragment;->v:Landroid/widget/TextView;

    .line 219
    sget v0, Lcom/huawei/android/sns/R$id;->tv_finish_time_self:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthEventRankFragment;->A:Landroid/widget/TextView;

    .line 221
    sget v0, Lcom/huawei/android/sns/R$id;->net_work_layout:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthEventRankFragment;->g:Landroid/view/View;

    .line 222
    sget v0, Lcom/huawei/android/sns/R$id;->rly_act_rank_detail:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthEventRankFragment;->k:Landroid/view/View;

    .line 225
    sget v0, Lcom/huawei/android/sns/R$id;->iv_event_rank_poster:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthEventRankFragment;->a:Landroid/widget/ImageView;

    .line 226
    sget v0, Lcom/huawei/android/sns/R$id;->tv_event_type_desc:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lo/egb;

    iput-object v0, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthEventRankFragment;->e:Lo/egb;

    .line 227
    sget v0, Lcom/huawei/android/sns/R$id;->tv_event_member_number:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lo/egb;

    iput-object v0, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthEventRankFragment;->d:Lo/egb;

    .line 228
    sget v0, Lcom/huawei/android/sns/R$id;->event_detail_block_bg:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthEventRankFragment;->i:Landroid/widget/ImageView;

    .line 231
    sget v0, Lcom/huawei/android/sns/R$id;->tv_title_speed:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lo/egb;

    iput-object v0, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthEventRankFragment;->b:Lo/egb;

    .line 232
    sget v0, Lcom/huawei/android/sns/R$id;->tv_title_finish_time:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lo/egb;

    iput-object v0, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthEventRankFragment;->c:Lo/egb;

    .line 234
    return-void
.end method

.method static synthetic a(Lcom/huawei/health/sns/ui/groupstoredemo/HealthEventRankFragment;)V
    .locals 0

    .line 61
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/groupstoredemo/HealthEventRankFragment;->d()V

    return-void
.end method

.method static synthetic b(Lcom/huawei/health/sns/ui/groupstoredemo/HealthEventRankFragment;)Landroid/widget/ImageView;
    .locals 1

    .line 61
    iget-object v0, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthEventRankFragment;->i:Landroid/widget/ImageView;

    return-object v0
.end method

.method static synthetic b(Lcom/huawei/health/sns/ui/groupstoredemo/HealthEventRankFragment;Lcom/huawei/health/sns/ui/group/healthbeans/GroupUserRank;)Lcom/huawei/health/sns/ui/group/healthbeans/GroupUserRank;
    .locals 0

    .line 61
    iput-object p1, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthEventRankFragment;->t:Lcom/huawei/health/sns/ui/group/healthbeans/GroupUserRank;

    return-object p1
.end method

.method private b()V
    .locals 29

    .line 270
    new-instance v9, Ljava/util/ArrayList;

    invoke-direct {v9}, Ljava/util/ArrayList;-><init>()V

    .line 271
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthEventRankFragment;->m:Ljava/lang/String;

    const-string v1, "1000"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 272
    new-instance v10, Lcom/huawei/health/sns/ui/group/healthbeans/GroupUserRank;

    invoke-direct {v10}, Lcom/huawei/health/sns/ui/group/healthbeans/GroupUserRank;-><init>()V

    .line 273
    const-string v0, "10000000000000001"

    invoke-virtual {v10, v0}, Lcom/huawei/health/sns/ui/group/healthbeans/GroupUserRank;->setHuid(Ljava/lang/String;)V

    .line 274
    const-string v0, "\u9017\u6bd4\u6709\u7406"

    invoke-virtual {v10, v0}, Lcom/huawei/health/sns/ui/group/healthbeans/GroupUserRank;->setNickName(Ljava/lang/String;)V

    .line 275
    const-string v0, "pic_8"

    invoke-virtual {v10, v0}, Lcom/huawei/health/sns/ui/group/healthbeans/GroupUserRank;->setPhotoUrl(Ljava/lang/String;)V

    .line 276
    const/4 v0, 0x1

    invoke-virtual {v10, v0}, Lcom/huawei/health/sns/ui/group/healthbeans/GroupUserRank;->setGroupRank(I)V

    .line 277
    const-wide v0, 0x4067200000000000L    # 185.0

    invoke-virtual {v10, v0, v1}, Lcom/huawei/health/sns/ui/group/healthbeans/GroupUserRank;->setBestValue(D)V

    .line 279
    new-instance v11, Lcom/huawei/health/sns/ui/group/healthbeans/GroupUserRank;

    invoke-direct {v11}, Lcom/huawei/health/sns/ui/group/healthbeans/GroupUserRank;-><init>()V

    .line 280
    const-string v0, "10000000000000002"

    invoke-virtual {v11, v0}, Lcom/huawei/health/sns/ui/group/healthbeans/GroupUserRank;->setHuid(Ljava/lang/String;)V

    .line 281
    const-string v0, "\u7c73\u5c0f\u8bfa"

    invoke-virtual {v11, v0}, Lcom/huawei/health/sns/ui/group/healthbeans/GroupUserRank;->setNickName(Ljava/lang/String;)V

    .line 282
    const-string v0, "pic_7"

    invoke-virtual {v11, v0}, Lcom/huawei/health/sns/ui/group/healthbeans/GroupUserRank;->setPhotoUrl(Ljava/lang/String;)V

    .line 283
    const/4 v0, 0x2

    invoke-virtual {v11, v0}, Lcom/huawei/health/sns/ui/group/healthbeans/GroupUserRank;->setGroupRank(I)V

    .line 284
    const-wide v0, 0x4067c00000000000L    # 190.0

    invoke-virtual {v11, v0, v1}, Lcom/huawei/health/sns/ui/group/healthbeans/GroupUserRank;->setBestValue(D)V

    .line 286
    new-instance v12, Lcom/huawei/health/sns/ui/group/healthbeans/GroupUserRank;

    invoke-direct {v12}, Lcom/huawei/health/sns/ui/group/healthbeans/GroupUserRank;-><init>()V

    .line 287
    const-string v0, "10000000000000003"

    invoke-virtual {v12, v0}, Lcom/huawei/health/sns/ui/group/healthbeans/GroupUserRank;->setHuid(Ljava/lang/String;)V

    .line 288
    const-string v0, "\u840c\u91cf\u5341\u8db3"

    invoke-virtual {v12, v0}, Lcom/huawei/health/sns/ui/group/healthbeans/GroupUserRank;->setNickName(Ljava/lang/String;)V

    .line 289
    const-string v0, "pic_14"

    invoke-virtual {v12, v0}, Lcom/huawei/health/sns/ui/group/healthbeans/GroupUserRank;->setPhotoUrl(Ljava/lang/String;)V

    .line 290
    const/4 v0, 0x3

    invoke-virtual {v12, v0}, Lcom/huawei/health/sns/ui/group/healthbeans/GroupUserRank;->setGroupRank(I)V

    .line 291
    const-wide/high16 v0, 0x4069000000000000L    # 200.0

    invoke-virtual {v12, v0, v1}, Lcom/huawei/health/sns/ui/group/healthbeans/GroupUserRank;->setBestValue(D)V

    .line 293
    new-instance v13, Lcom/huawei/health/sns/ui/group/healthbeans/GroupUserRank;

    invoke-direct {v13}, Lcom/huawei/health/sns/ui/group/healthbeans/GroupUserRank;-><init>()V

    .line 294
    const-string v0, "10000000000000004"

    invoke-virtual {v13, v0}, Lcom/huawei/health/sns/ui/group/healthbeans/GroupUserRank;->setHuid(Ljava/lang/String;)V

    .line 295
    const-string v0, "\u89e6\u6478\u9633\u5149"

    invoke-virtual {v13, v0}, Lcom/huawei/health/sns/ui/group/healthbeans/GroupUserRank;->setNickName(Ljava/lang/String;)V

    .line 296
    const-string v0, "pic_2"

    invoke-virtual {v13, v0}, Lcom/huawei/health/sns/ui/group/healthbeans/GroupUserRank;->setPhotoUrl(Ljava/lang/String;)V

    .line 297
    const/4 v0, 0x4

    invoke-virtual {v13, v0}, Lcom/huawei/health/sns/ui/group/healthbeans/GroupUserRank;->setGroupRank(I)V

    .line 298
    const-wide v0, 0x4069a00000000000L    # 205.0

    invoke-virtual {v13, v0, v1}, Lcom/huawei/health/sns/ui/group/healthbeans/GroupUserRank;->setBestValue(D)V

    .line 300
    new-instance v14, Lcom/huawei/health/sns/ui/group/healthbeans/GroupUserRank;

    invoke-direct {v14}, Lcom/huawei/health/sns/ui/group/healthbeans/GroupUserRank;-><init>()V

    .line 301
    const-string v0, "10000000000000005"

    invoke-virtual {v14, v0}, Lcom/huawei/health/sns/ui/group/healthbeans/GroupUserRank;->setHuid(Ljava/lang/String;)V

    .line 302
    const-string v0, "\u5c0f\u767d"

    invoke-virtual {v14, v0}, Lcom/huawei/health/sns/ui/group/healthbeans/GroupUserRank;->setNickName(Ljava/lang/String;)V

    .line 303
    const-string v0, "pic_13"

    invoke-virtual {v14, v0}, Lcom/huawei/health/sns/ui/group/healthbeans/GroupUserRank;->setPhotoUrl(Ljava/lang/String;)V

    .line 304
    const/4 v0, 0x5

    invoke-virtual {v14, v0}, Lcom/huawei/health/sns/ui/group/healthbeans/GroupUserRank;->setGroupRank(I)V

    .line 305
    const-wide v0, 0x4069e00000000000L    # 207.0

    invoke-virtual {v14, v0, v1}, Lcom/huawei/health/sns/ui/group/healthbeans/GroupUserRank;->setBestValue(D)V

    .line 307
    new-instance v15, Lcom/huawei/health/sns/ui/group/healthbeans/GroupUserRank;

    invoke-direct {v15}, Lcom/huawei/health/sns/ui/group/healthbeans/GroupUserRank;-><init>()V

    .line 308
    const-string v0, "10000000000000006"

    invoke-virtual {v15, v0}, Lcom/huawei/health/sns/ui/group/healthbeans/GroupUserRank;->setHuid(Ljava/lang/String;)V

    .line 309
    const-string v0, "Victory"

    invoke-virtual {v15, v0}, Lcom/huawei/health/sns/ui/group/healthbeans/GroupUserRank;->setNickName(Ljava/lang/String;)V

    .line 310
    const-string v0, "pic_15"

    invoke-virtual {v15, v0}, Lcom/huawei/health/sns/ui/group/healthbeans/GroupUserRank;->setPhotoUrl(Ljava/lang/String;)V

    .line 311
    const/4 v0, 0x6

    invoke-virtual {v15, v0}, Lcom/huawei/health/sns/ui/group/healthbeans/GroupUserRank;->setGroupRank(I)V

    .line 312
    const-wide v0, 0x406ae00000000000L    # 215.0

    invoke-virtual {v15, v0, v1}, Lcom/huawei/health/sns/ui/group/healthbeans/GroupUserRank;->setBestValue(D)V

    .line 314
    new-instance v16, Lcom/huawei/health/sns/ui/group/healthbeans/GroupUserRank;

    invoke-direct/range {v16 .. v16}, Lcom/huawei/health/sns/ui/group/healthbeans/GroupUserRank;-><init>()V

    .line 315
    const-string v0, "10000000000000007"

    move-object/from16 v1, v16

    invoke-virtual {v1, v0}, Lcom/huawei/health/sns/ui/group/healthbeans/GroupUserRank;->setHuid(Ljava/lang/String;)V

    .line 316
    const-string v0, "\u65f6\u5149\u5728\u8d70"

    move-object/from16 v1, v16

    invoke-virtual {v1, v0}, Lcom/huawei/health/sns/ui/group/healthbeans/GroupUserRank;->setNickName(Ljava/lang/String;)V

    .line 317
    const-string v0, "pic_1"

    move-object/from16 v1, v16

    invoke-virtual {v1, v0}, Lcom/huawei/health/sns/ui/group/healthbeans/GroupUserRank;->setPhotoUrl(Ljava/lang/String;)V

    .line 318
    move-object/from16 v0, v16

    const/4 v1, 0x7

    invoke-virtual {v0, v1}, Lcom/huawei/health/sns/ui/group/healthbeans/GroupUserRank;->setGroupRank(I)V

    .line 319
    move-object/from16 v0, v16

    const-wide/high16 v1, 0x406e000000000000L    # 240.0

    invoke-virtual {v0, v1, v2}, Lcom/huawei/health/sns/ui/group/healthbeans/GroupUserRank;->setBestValue(D)V

    .line 321
    new-instance v17, Lcom/huawei/health/sns/ui/group/healthbeans/GroupUserRank;

    invoke-direct/range {v17 .. v17}, Lcom/huawei/health/sns/ui/group/healthbeans/GroupUserRank;-><init>()V

    .line 322
    const-string v0, "10000000000000008"

    move-object/from16 v1, v17

    invoke-virtual {v1, v0}, Lcom/huawei/health/sns/ui/group/healthbeans/GroupUserRank;->setHuid(Ljava/lang/String;)V

    .line 323
    const-string v0, "\u5b87\u5b991\u53f7\u5927\u53ef\u7231"

    move-object/from16 v1, v17

    invoke-virtual {v1, v0}, Lcom/huawei/health/sns/ui/group/healthbeans/GroupUserRank;->setNickName(Ljava/lang/String;)V

    .line 324
    const-string v0, "pic_12"

    move-object/from16 v1, v17

    invoke-virtual {v1, v0}, Lcom/huawei/health/sns/ui/group/healthbeans/GroupUserRank;->setPhotoUrl(Ljava/lang/String;)V

    .line 325
    move-object/from16 v0, v17

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Lcom/huawei/health/sns/ui/group/healthbeans/GroupUserRank;->setGroupRank(I)V

    .line 326
    move-object/from16 v0, v17

    const-wide v1, 0x4071800000000000L    # 280.0

    invoke-virtual {v0, v1, v2}, Lcom/huawei/health/sns/ui/group/healthbeans/GroupUserRank;->setBestValue(D)V

    .line 328
    new-instance v18, Lcom/huawei/health/sns/ui/group/healthbeans/GroupUserRank;

    invoke-direct/range {v18 .. v18}, Lcom/huawei/health/sns/ui/group/healthbeans/GroupUserRank;-><init>()V

    .line 329
    const-string v0, "10000000000000009"

    move-object/from16 v1, v18

    invoke-virtual {v1, v0}, Lcom/huawei/health/sns/ui/group/healthbeans/GroupUserRank;->setHuid(Ljava/lang/String;)V

    .line 330
    const-string v0, "\u5c0f\u660e"

    move-object/from16 v1, v18

    invoke-virtual {v1, v0}, Lcom/huawei/health/sns/ui/group/healthbeans/GroupUserRank;->setNickName(Ljava/lang/String;)V

    .line 331
    const-string v0, "pic_6"

    move-object/from16 v1, v18

    invoke-virtual {v1, v0}, Lcom/huawei/health/sns/ui/group/healthbeans/GroupUserRank;->setPhotoUrl(Ljava/lang/String;)V

    .line 332
    move-object/from16 v0, v18

    const/16 v1, 0x9

    invoke-virtual {v0, v1}, Lcom/huawei/health/sns/ui/group/healthbeans/GroupUserRank;->setGroupRank(I)V

    .line 333
    move-object/from16 v0, v18

    const-wide v1, 0x4071d00000000000L    # 285.0

    invoke-virtual {v0, v1, v2}, Lcom/huawei/health/sns/ui/group/healthbeans/GroupUserRank;->setBestValue(D)V

    .line 335
    new-instance v19, Lcom/huawei/health/sns/ui/group/healthbeans/GroupUserRank;

    invoke-direct/range {v19 .. v19}, Lcom/huawei/health/sns/ui/group/healthbeans/GroupUserRank;-><init>()V

    .line 336
    const-string v0, "10000000000000010"

    move-object/from16 v1, v19

    invoke-virtual {v1, v0}, Lcom/huawei/health/sns/ui/group/healthbeans/GroupUserRank;->setHuid(Ljava/lang/String;)V

    .line 337
    const-string v0, "\u4e00\u53ea\u80a5\u80d6\u7684\u732b"

    move-object/from16 v1, v19

    invoke-virtual {v1, v0}, Lcom/huawei/health/sns/ui/group/healthbeans/GroupUserRank;->setNickName(Ljava/lang/String;)V

    .line 338
    const-string v0, "pic_11"

    move-object/from16 v1, v19

    invoke-virtual {v1, v0}, Lcom/huawei/health/sns/ui/group/healthbeans/GroupUserRank;->setPhotoUrl(Ljava/lang/String;)V

    .line 339
    move-object/from16 v0, v19

    const/16 v1, 0xa

    invoke-virtual {v0, v1}, Lcom/huawei/health/sns/ui/group/healthbeans/GroupUserRank;->setGroupRank(I)V

    .line 340
    move-object/from16 v0, v19

    const-wide v1, 0x4072c00000000000L    # 300.0

    invoke-virtual {v0, v1, v2}, Lcom/huawei/health/sns/ui/group/healthbeans/GroupUserRank;->setBestValue(D)V

    .line 342
    new-instance v20, Lcom/huawei/health/sns/ui/group/healthbeans/GroupUserRank;

    invoke-direct/range {v20 .. v20}, Lcom/huawei/health/sns/ui/group/healthbeans/GroupUserRank;-><init>()V

    .line 343
    const-string v0, "10000000000000011"

    move-object/from16 v1, v20

    invoke-virtual {v1, v0}, Lcom/huawei/health/sns/ui/group/healthbeans/GroupUserRank;->setHuid(Ljava/lang/String;)V

    .line 344
    const-string v0, "\u5c81\u6708\u5982\u521d"

    move-object/from16 v1, v20

    invoke-virtual {v1, v0}, Lcom/huawei/health/sns/ui/group/healthbeans/GroupUserRank;->setNickName(Ljava/lang/String;)V

    .line 345
    const-string v0, "pic_10"

    move-object/from16 v1, v20

    invoke-virtual {v1, v0}, Lcom/huawei/health/sns/ui/group/healthbeans/GroupUserRank;->setPhotoUrl(Ljava/lang/String;)V

    .line 346
    move-object/from16 v0, v20

    const/16 v1, 0xb

    invoke-virtual {v0, v1}, Lcom/huawei/health/sns/ui/group/healthbeans/GroupUserRank;->setGroupRank(I)V

    .line 347
    move-object/from16 v0, v20

    const-wide v1, 0x4072f00000000000L    # 303.0

    invoke-virtual {v0, v1, v2}, Lcom/huawei/health/sns/ui/group/healthbeans/GroupUserRank;->setBestValue(D)V

    .line 349
    new-instance v21, Lcom/huawei/health/sns/ui/group/healthbeans/GroupUserRank;

    invoke-direct/range {v21 .. v21}, Lcom/huawei/health/sns/ui/group/healthbeans/GroupUserRank;-><init>()V

    .line 350
    const-string v0, "10000000000000012"

    move-object/from16 v1, v21

    invoke-virtual {v1, v0}, Lcom/huawei/health/sns/ui/group/healthbeans/GroupUserRank;->setHuid(Ljava/lang/String;)V

    .line 351
    const-string v0, "\u6de1\u84dd\u8272\u7684\u7ecf\u5178"

    move-object/from16 v1, v21

    invoke-virtual {v1, v0}, Lcom/huawei/health/sns/ui/group/healthbeans/GroupUserRank;->setNickName(Ljava/lang/String;)V

    .line 352
    const-string v0, "pic_4"

    move-object/from16 v1, v21

    invoke-virtual {v1, v0}, Lcom/huawei/health/sns/ui/group/healthbeans/GroupUserRank;->setPhotoUrl(Ljava/lang/String;)V

    .line 353
    move-object/from16 v0, v21

    const/16 v1, 0xc

    invoke-virtual {v0, v1}, Lcom/huawei/health/sns/ui/group/healthbeans/GroupUserRank;->setGroupRank(I)V

    .line 354
    move-object/from16 v0, v21

    const-wide v1, 0x4073b00000000000L    # 315.0

    invoke-virtual {v0, v1, v2}, Lcom/huawei/health/sns/ui/group/healthbeans/GroupUserRank;->setBestValue(D)V

    .line 356
    new-instance v22, Lcom/huawei/health/sns/ui/group/healthbeans/GroupUserRank;

    invoke-direct/range {v22 .. v22}, Lcom/huawei/health/sns/ui/group/healthbeans/GroupUserRank;-><init>()V

    .line 357
    const-string v0, "10000000000000013"

    move-object/from16 v1, v22

    invoke-virtual {v1, v0}, Lcom/huawei/health/sns/ui/group/healthbeans/GroupUserRank;->setHuid(Ljava/lang/String;)V

    .line 358
    const-string v0, "\u84dd\u8272\u6fc0\u6d6a"

    move-object/from16 v1, v22

    invoke-virtual {v1, v0}, Lcom/huawei/health/sns/ui/group/healthbeans/GroupUserRank;->setNickName(Ljava/lang/String;)V

    .line 359
    const-string v0, "pic_9"

    move-object/from16 v1, v22

    invoke-virtual {v1, v0}, Lcom/huawei/health/sns/ui/group/healthbeans/GroupUserRank;->setPhotoUrl(Ljava/lang/String;)V

    .line 360
    move-object/from16 v0, v22

    const/16 v1, 0xd

    invoke-virtual {v0, v1}, Lcom/huawei/health/sns/ui/group/healthbeans/GroupUserRank;->setGroupRank(I)V

    .line 361
    move-object/from16 v0, v22

    const-wide v1, 0x4073f00000000000L    # 319.0

    invoke-virtual {v0, v1, v2}, Lcom/huawei/health/sns/ui/group/healthbeans/GroupUserRank;->setBestValue(D)V

    .line 363
    new-instance v23, Lcom/huawei/health/sns/ui/group/healthbeans/GroupUserRank;

    invoke-direct/range {v23 .. v23}, Lcom/huawei/health/sns/ui/group/healthbeans/GroupUserRank;-><init>()V

    .line 364
    const-string v0, "10000000000000014"

    move-object/from16 v1, v23

    invoke-virtual {v1, v0}, Lcom/huawei/health/sns/ui/group/healthbeans/GroupUserRank;->setHuid(Ljava/lang/String;)V

    .line 365
    const-string v0, "\u9ece\u660e\u661f\u6668"

    move-object/from16 v1, v23

    invoke-virtual {v1, v0}, Lcom/huawei/health/sns/ui/group/healthbeans/GroupUserRank;->setNickName(Ljava/lang/String;)V

    .line 366
    const-string v0, "pic_3"

    move-object/from16 v1, v23

    invoke-virtual {v1, v0}, Lcom/huawei/health/sns/ui/group/healthbeans/GroupUserRank;->setPhotoUrl(Ljava/lang/String;)V

    .line 367
    move-object/from16 v0, v23

    const/16 v1, 0xe

    invoke-virtual {v0, v1}, Lcom/huawei/health/sns/ui/group/healthbeans/GroupUserRank;->setGroupRank(I)V

    .line 368
    move-object/from16 v0, v23

    const-wide v1, 0x4074200000000000L    # 322.0

    invoke-virtual {v0, v1, v2}, Lcom/huawei/health/sns/ui/group/healthbeans/GroupUserRank;->setBestValue(D)V

    .line 370
    new-instance v24, Lcom/huawei/health/sns/ui/group/healthbeans/GroupUserRank;

    invoke-direct/range {v24 .. v24}, Lcom/huawei/health/sns/ui/group/healthbeans/GroupUserRank;-><init>()V

    .line 371
    const-string v0, "10000000000000015"

    move-object/from16 v1, v24

    invoke-virtual {v1, v0}, Lcom/huawei/health/sns/ui/group/healthbeans/GroupUserRank;->setHuid(Ljava/lang/String;)V

    .line 372
    const-string v0, "\u6211\u8981\u966a\u4f60\u6570\u592a\u9633"

    move-object/from16 v1, v24

    invoke-virtual {v1, v0}, Lcom/huawei/health/sns/ui/group/healthbeans/GroupUserRank;->setNickName(Ljava/lang/String;)V

    .line 373
    const-string v0, "pic_5"

    move-object/from16 v1, v24

    invoke-virtual {v1, v0}, Lcom/huawei/health/sns/ui/group/healthbeans/GroupUserRank;->setPhotoUrl(Ljava/lang/String;)V

    .line 374
    move-object/from16 v0, v24

    const/16 v1, 0xf

    invoke-virtual {v0, v1}, Lcom/huawei/health/sns/ui/group/healthbeans/GroupUserRank;->setGroupRank(I)V

    .line 375
    move-object/from16 v0, v24

    const-wide v1, 0x4074a00000000000L    # 330.0

    invoke-virtual {v0, v1, v2}, Lcom/huawei/health/sns/ui/group/healthbeans/GroupUserRank;->setBestValue(D)V

    .line 377
    invoke-interface {v9, v10}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 378
    invoke-interface {v9, v11}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 379
    invoke-interface {v9, v12}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 380
    invoke-interface {v9, v13}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 381
    invoke-interface {v9, v14}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 382
    invoke-interface {v9, v15}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 383
    move-object/from16 v0, v16

    invoke-interface {v9, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 384
    move-object/from16 v0, v17

    invoke-interface {v9, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 385
    move-object/from16 v0, v18

    invoke-interface {v9, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 386
    move-object/from16 v0, v19

    invoke-interface {v9, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 387
    move-object/from16 v0, v20

    invoke-interface {v9, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 388
    move-object/from16 v0, v21

    invoke-interface {v9, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 389
    move-object/from16 v0, v22

    invoke-interface {v9, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 390
    move-object/from16 v0, v23

    invoke-interface {v9, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 391
    move-object/from16 v0, v24

    invoke-interface {v9, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 392
    move-object/from16 v0, v18

    move-object/from16 v1, p0

    iput-object v0, v1, Lcom/huawei/health/sns/ui/groupstoredemo/HealthEventRankFragment;->t:Lcom/huawei/health/sns/ui/group/healthbeans/GroupUserRank;

    .line 393
    goto/16 :goto_1

    .line 394
    :cond_0
    new-instance v10, Lcom/huawei/health/sns/ui/group/healthbeans/GroupUserRank;

    invoke-direct {v10}, Lcom/huawei/health/sns/ui/group/healthbeans/GroupUserRank;-><init>()V

    .line 395
    const-string v0, "10000000000000008"

    invoke-virtual {v10, v0}, Lcom/huawei/health/sns/ui/group/healthbeans/GroupUserRank;->setHuid(Ljava/lang/String;)V

    .line 396
    const-string v0, "\u5c0f\u660e"

    invoke-virtual {v10, v0}, Lcom/huawei/health/sns/ui/group/healthbeans/GroupUserRank;->setNickName(Ljava/lang/String;)V

    .line 397
    const-string v0, "pic_6"

    invoke-virtual {v10, v0}, Lcom/huawei/health/sns/ui/group/healthbeans/GroupUserRank;->setPhotoUrl(Ljava/lang/String;)V

    .line 398
    const/16 v0, 0x9

    invoke-virtual {v10, v0}, Lcom/huawei/health/sns/ui/group/healthbeans/GroupUserRank;->setGroupRank(I)V

    .line 399
    const-wide v0, 0x4094500000000000L    # 1300.0

    invoke-virtual {v10, v0, v1}, Lcom/huawei/health/sns/ui/group/healthbeans/GroupUserRank;->setBestValue(D)V

    .line 401
    new-instance v11, Lcom/huawei/health/sns/ui/group/healthbeans/GroupUserRank;

    invoke-direct {v11}, Lcom/huawei/health/sns/ui/group/healthbeans/GroupUserRank;-><init>()V

    .line 402
    const-string v0, "10000000000000001"

    invoke-virtual {v11, v0}, Lcom/huawei/health/sns/ui/group/healthbeans/GroupUserRank;->setHuid(Ljava/lang/String;)V

    .line 403
    const-string v0, "\u9017\u6bd4\u6709\u7406"

    invoke-virtual {v11, v0}, Lcom/huawei/health/sns/ui/group/healthbeans/GroupUserRank;->setNickName(Ljava/lang/String;)V

    .line 404
    const-string v0, "pic_8"

    invoke-virtual {v11, v0}, Lcom/huawei/health/sns/ui/group/healthbeans/GroupUserRank;->setPhotoUrl(Ljava/lang/String;)V

    .line 405
    const/4 v0, 0x1

    invoke-virtual {v11, v0}, Lcom/huawei/health/sns/ui/group/healthbeans/GroupUserRank;->setGroupRank(I)V

    .line 406
    const-wide v0, 0x40c19e0000000000L    # 9020.0

    invoke-virtual {v11, v0, v1}, Lcom/huawei/health/sns/ui/group/healthbeans/GroupUserRank;->setBestValue(D)V

    .line 408
    new-instance v12, Lcom/huawei/health/sns/ui/group/healthbeans/GroupUserRank;

    invoke-direct {v12}, Lcom/huawei/health/sns/ui/group/healthbeans/GroupUserRank;-><init>()V

    .line 409
    const-string v0, "10000000000000002"

    invoke-virtual {v12, v0}, Lcom/huawei/health/sns/ui/group/healthbeans/GroupUserRank;->setHuid(Ljava/lang/String;)V

    .line 410
    const-string v0, "\u7c73\u5c0f\u8bfa"

    invoke-virtual {v12, v0}, Lcom/huawei/health/sns/ui/group/healthbeans/GroupUserRank;->setNickName(Ljava/lang/String;)V

    .line 411
    const-string v0, "pic_7"

    invoke-virtual {v12, v0}, Lcom/huawei/health/sns/ui/group/healthbeans/GroupUserRank;->setPhotoUrl(Ljava/lang/String;)V

    .line 412
    const/4 v0, 0x2

    invoke-virtual {v12, v0}, Lcom/huawei/health/sns/ui/group/healthbeans/GroupUserRank;->setGroupRank(I)V

    .line 413
    const-wide v0, 0x40bfb80000000000L    # 8120.0

    invoke-virtual {v12, v0, v1}, Lcom/huawei/health/sns/ui/group/healthbeans/GroupUserRank;->setBestValue(D)V

    .line 415
    new-instance v13, Lcom/huawei/health/sns/ui/group/healthbeans/GroupUserRank;

    invoke-direct {v13}, Lcom/huawei/health/sns/ui/group/healthbeans/GroupUserRank;-><init>()V

    .line 416
    const-string v0, "10000000000000003"

    invoke-virtual {v13, v0}, Lcom/huawei/health/sns/ui/group/healthbeans/GroupUserRank;->setHuid(Ljava/lang/String;)V

    .line 417
    const-string v0, "\u840c\u91cf\u5341\u8db3"

    invoke-virtual {v13, v0}, Lcom/huawei/health/sns/ui/group/healthbeans/GroupUserRank;->setNickName(Ljava/lang/String;)V

    .line 418
    const-string v0, "pic_14"

    invoke-virtual {v13, v0}, Lcom/huawei/health/sns/ui/group/healthbeans/GroupUserRank;->setPhotoUrl(Ljava/lang/String;)V

    .line 419
    const/4 v0, 0x3

    invoke-virtual {v13, v0}, Lcom/huawei/health/sns/ui/group/healthbeans/GroupUserRank;->setGroupRank(I)V

    .line 420
    const-wide v0, 0x40bf540000000000L    # 8020.0

    invoke-virtual {v13, v0, v1}, Lcom/huawei/health/sns/ui/group/healthbeans/GroupUserRank;->setBestValue(D)V

    .line 422
    new-instance v14, Lcom/huawei/health/sns/ui/group/healthbeans/GroupUserRank;

    invoke-direct {v14}, Lcom/huawei/health/sns/ui/group/healthbeans/GroupUserRank;-><init>()V

    .line 423
    const-string v0, "10000000000000004"

    invoke-virtual {v14, v0}, Lcom/huawei/health/sns/ui/group/healthbeans/GroupUserRank;->setHuid(Ljava/lang/String;)V

    .line 424
    const-string v0, "\u89e6\u6478\u9633\u5149"

    invoke-virtual {v14, v0}, Lcom/huawei/health/sns/ui/group/healthbeans/GroupUserRank;->setNickName(Ljava/lang/String;)V

    .line 425
    const-string v0, "pic_2"

    invoke-virtual {v14, v0}, Lcom/huawei/health/sns/ui/group/healthbeans/GroupUserRank;->setPhotoUrl(Ljava/lang/String;)V

    .line 426
    const/4 v0, 0x4

    invoke-virtual {v14, v0}, Lcom/huawei/health/sns/ui/group/healthbeans/GroupUserRank;->setGroupRank(I)V

    .line 427
    const-wide v0, 0x40bf400000000000L    # 8000.0

    invoke-virtual {v14, v0, v1}, Lcom/huawei/health/sns/ui/group/healthbeans/GroupUserRank;->setBestValue(D)V

    .line 429
    new-instance v15, Lcom/huawei/health/sns/ui/group/healthbeans/GroupUserRank;

    invoke-direct {v15}, Lcom/huawei/health/sns/ui/group/healthbeans/GroupUserRank;-><init>()V

    .line 430
    const-string v0, "10000000000000005"

    invoke-virtual {v15, v0}, Lcom/huawei/health/sns/ui/group/healthbeans/GroupUserRank;->setHuid(Ljava/lang/String;)V

    .line 431
    const-string v0, "\u5c0f\u767d"

    invoke-virtual {v15, v0}, Lcom/huawei/health/sns/ui/group/healthbeans/GroupUserRank;->setNickName(Ljava/lang/String;)V

    .line 432
    const-string v0, "pic_13"

    invoke-virtual {v15, v0}, Lcom/huawei/health/sns/ui/group/healthbeans/GroupUserRank;->setPhotoUrl(Ljava/lang/String;)V

    .line 433
    const/4 v0, 0x5

    invoke-virtual {v15, v0}, Lcom/huawei/health/sns/ui/group/healthbeans/GroupUserRank;->setGroupRank(I)V

    .line 434
    const-wide v0, 0x40b7ac0000000000L    # 6060.0

    invoke-virtual {v15, v0, v1}, Lcom/huawei/health/sns/ui/group/healthbeans/GroupUserRank;->setBestValue(D)V

    .line 436
    new-instance v16, Lcom/huawei/health/sns/ui/group/healthbeans/GroupUserRank;

    invoke-direct/range {v16 .. v16}, Lcom/huawei/health/sns/ui/group/healthbeans/GroupUserRank;-><init>()V

    .line 437
    const-string v0, "10000000000000006"

    move-object/from16 v1, v16

    invoke-virtual {v1, v0}, Lcom/huawei/health/sns/ui/group/healthbeans/GroupUserRank;->setHuid(Ljava/lang/String;)V

    .line 438
    const-string v0, "Victory"

    move-object/from16 v1, v16

    invoke-virtual {v1, v0}, Lcom/huawei/health/sns/ui/group/healthbeans/GroupUserRank;->setNickName(Ljava/lang/String;)V

    .line 439
    const-string v0, "pic_15"

    move-object/from16 v1, v16

    invoke-virtual {v1, v0}, Lcom/huawei/health/sns/ui/group/healthbeans/GroupUserRank;->setPhotoUrl(Ljava/lang/String;)V

    .line 440
    move-object/from16 v0, v16

    const/4 v1, 0x6

    invoke-virtual {v0, v1}, Lcom/huawei/health/sns/ui/group/healthbeans/GroupUserRank;->setGroupRank(I)V

    .line 441
    move-object/from16 v0, v16

    const-wide/high16 v1, 0x4099000000000000L    # 1600.0

    invoke-virtual {v0, v1, v2}, Lcom/huawei/health/sns/ui/group/healthbeans/GroupUserRank;->setBestValue(D)V

    .line 443
    new-instance v17, Lcom/huawei/health/sns/ui/group/healthbeans/GroupUserRank;

    invoke-direct/range {v17 .. v17}, Lcom/huawei/health/sns/ui/group/healthbeans/GroupUserRank;-><init>()V

    .line 444
    const-string v0, "10000000000000007"

    move-object/from16 v1, v17

    invoke-virtual {v1, v0}, Lcom/huawei/health/sns/ui/group/healthbeans/GroupUserRank;->setHuid(Ljava/lang/String;)V

    .line 445
    const-string v0, "\u65f6\u5149\u5728\u8d70"

    move-object/from16 v1, v17

    invoke-virtual {v1, v0}, Lcom/huawei/health/sns/ui/group/healthbeans/GroupUserRank;->setNickName(Ljava/lang/String;)V

    .line 446
    const-string v0, "pic_1"

    move-object/from16 v1, v17

    invoke-virtual {v1, v0}, Lcom/huawei/health/sns/ui/group/healthbeans/GroupUserRank;->setPhotoUrl(Ljava/lang/String;)V

    .line 447
    move-object/from16 v0, v17

    const/4 v1, 0x7

    invoke-virtual {v0, v1}, Lcom/huawei/health/sns/ui/group/healthbeans/GroupUserRank;->setGroupRank(I)V

    .line 448
    move-object/from16 v0, v17

    const-wide v1, 0x4097980000000000L    # 1510.0

    invoke-virtual {v0, v1, v2}, Lcom/huawei/health/sns/ui/group/healthbeans/GroupUserRank;->setBestValue(D)V

    .line 450
    new-instance v18, Lcom/huawei/health/sns/ui/group/healthbeans/GroupUserRank;

    invoke-direct/range {v18 .. v18}, Lcom/huawei/health/sns/ui/group/healthbeans/GroupUserRank;-><init>()V

    .line 451
    const-string v0, "10000000000000009"

    move-object/from16 v1, v18

    invoke-virtual {v1, v0}, Lcom/huawei/health/sns/ui/group/healthbeans/GroupUserRank;->setHuid(Ljava/lang/String;)V

    .line 452
    const-string v0, "\u5b87\u5b991\u53f7\u5927\u53ef\u7231"

    move-object/from16 v1, v18

    invoke-virtual {v1, v0}, Lcom/huawei/health/sns/ui/group/healthbeans/GroupUserRank;->setNickName(Ljava/lang/String;)V

    .line 453
    const-string v0, "pic_12"

    move-object/from16 v1, v18

    invoke-virtual {v1, v0}, Lcom/huawei/health/sns/ui/group/healthbeans/GroupUserRank;->setPhotoUrl(Ljava/lang/String;)V

    .line 454
    move-object/from16 v0, v18

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Lcom/huawei/health/sns/ui/group/healthbeans/GroupUserRank;->setGroupRank(I)V

    .line 455
    move-object/from16 v0, v18

    const-wide v1, 0x4097700000000000L    # 1500.0

    invoke-virtual {v0, v1, v2}, Lcom/huawei/health/sns/ui/group/healthbeans/GroupUserRank;->setBestValue(D)V

    .line 457
    new-instance v19, Lcom/huawei/health/sns/ui/group/healthbeans/GroupUserRank;

    invoke-direct/range {v19 .. v19}, Lcom/huawei/health/sns/ui/group/healthbeans/GroupUserRank;-><init>()V

    .line 458
    const-string v0, "10000000000000010"

    move-object/from16 v1, v19

    invoke-virtual {v1, v0}, Lcom/huawei/health/sns/ui/group/healthbeans/GroupUserRank;->setHuid(Ljava/lang/String;)V

    .line 459
    const-string v0, "\u4e00\u53ea\u80a5\u80d6\u7684\u732b"

    move-object/from16 v1, v19

    invoke-virtual {v1, v0}, Lcom/huawei/health/sns/ui/group/healthbeans/GroupUserRank;->setNickName(Ljava/lang/String;)V

    .line 460
    const-string v0, "pic_11"

    move-object/from16 v1, v19

    invoke-virtual {v1, v0}, Lcom/huawei/health/sns/ui/group/healthbeans/GroupUserRank;->setPhotoUrl(Ljava/lang/String;)V

    .line 461
    move-object/from16 v0, v19

    const/16 v1, 0xa

    invoke-virtual {v0, v1}, Lcom/huawei/health/sns/ui/group/healthbeans/GroupUserRank;->setGroupRank(I)V

    .line 462
    move-object/from16 v0, v19

    const-wide v1, 0x4094500000000000L    # 1300.0

    invoke-virtual {v0, v1, v2}, Lcom/huawei/health/sns/ui/group/healthbeans/GroupUserRank;->setBestValue(D)V

    .line 464
    new-instance v20, Lcom/huawei/health/sns/ui/group/healthbeans/GroupUserRank;

    invoke-direct/range {v20 .. v20}, Lcom/huawei/health/sns/ui/group/healthbeans/GroupUserRank;-><init>()V

    .line 465
    const-string v0, "10000000000000011"

    move-object/from16 v1, v20

    invoke-virtual {v1, v0}, Lcom/huawei/health/sns/ui/group/healthbeans/GroupUserRank;->setHuid(Ljava/lang/String;)V

    .line 466
    const-string v0, "\u5c81\u6708\u5982\u521d"

    move-object/from16 v1, v20

    invoke-virtual {v1, v0}, Lcom/huawei/health/sns/ui/group/healthbeans/GroupUserRank;->setNickName(Ljava/lang/String;)V

    .line 467
    const-string v0, "pic_10"

    move-object/from16 v1, v20

    invoke-virtual {v1, v0}, Lcom/huawei/health/sns/ui/group/healthbeans/GroupUserRank;->setPhotoUrl(Ljava/lang/String;)V

    .line 468
    move-object/from16 v0, v20

    const/16 v1, 0xb

    invoke-virtual {v0, v1}, Lcom/huawei/health/sns/ui/group/healthbeans/GroupUserRank;->setGroupRank(I)V

    .line 469
    move-object/from16 v0, v20

    const-wide v1, 0x4092c00000000000L    # 1200.0

    invoke-virtual {v0, v1, v2}, Lcom/huawei/health/sns/ui/group/healthbeans/GroupUserRank;->setBestValue(D)V

    .line 471
    new-instance v21, Lcom/huawei/health/sns/ui/group/healthbeans/GroupUserRank;

    invoke-direct/range {v21 .. v21}, Lcom/huawei/health/sns/ui/group/healthbeans/GroupUserRank;-><init>()V

    .line 472
    const-string v0, "10000000000000012"

    move-object/from16 v1, v21

    invoke-virtual {v1, v0}, Lcom/huawei/health/sns/ui/group/healthbeans/GroupUserRank;->setHuid(Ljava/lang/String;)V

    .line 473
    const-string v0, "\u6de1\u84dd\u8272\u7684\u7ecf\u5178"

    move-object/from16 v1, v21

    invoke-virtual {v1, v0}, Lcom/huawei/health/sns/ui/group/healthbeans/GroupUserRank;->setNickName(Ljava/lang/String;)V

    .line 474
    const-string v0, "pic_4"

    move-object/from16 v1, v21

    invoke-virtual {v1, v0}, Lcom/huawei/health/sns/ui/group/healthbeans/GroupUserRank;->setPhotoUrl(Ljava/lang/String;)V

    .line 475
    move-object/from16 v0, v21

    const/16 v1, 0xc

    invoke-virtual {v0, v1}, Lcom/huawei/health/sns/ui/group/healthbeans/GroupUserRank;->setGroupRank(I)V

    .line 476
    move-object/from16 v0, v21

    const-wide v1, 0x408f400000000000L    # 1000.0

    invoke-virtual {v0, v1, v2}, Lcom/huawei/health/sns/ui/group/healthbeans/GroupUserRank;->setBestValue(D)V

    .line 478
    new-instance v22, Lcom/huawei/health/sns/ui/group/healthbeans/GroupUserRank;

    invoke-direct/range {v22 .. v22}, Lcom/huawei/health/sns/ui/group/healthbeans/GroupUserRank;-><init>()V

    .line 479
    const-string v0, "10000000000000013"

    move-object/from16 v1, v22

    invoke-virtual {v1, v0}, Lcom/huawei/health/sns/ui/group/healthbeans/GroupUserRank;->setHuid(Ljava/lang/String;)V

    .line 480
    const-string v0, "\u84dd\u8272\u6fc0\u6d6a"

    move-object/from16 v1, v22

    invoke-virtual {v1, v0}, Lcom/huawei/health/sns/ui/group/healthbeans/GroupUserRank;->setNickName(Ljava/lang/String;)V

    .line 481
    const-string v0, "pic_9"

    move-object/from16 v1, v22

    invoke-virtual {v1, v0}, Lcom/huawei/health/sns/ui/group/healthbeans/GroupUserRank;->setPhotoUrl(Ljava/lang/String;)V

    .line 482
    move-object/from16 v0, v22

    const/16 v1, 0xd

    invoke-virtual {v0, v1}, Lcom/huawei/health/sns/ui/group/healthbeans/GroupUserRank;->setGroupRank(I)V

    .line 483
    move-object/from16 v0, v22

    const-wide v1, 0x408f400000000000L    # 1000.0

    invoke-virtual {v0, v1, v2}, Lcom/huawei/health/sns/ui/group/healthbeans/GroupUserRank;->setBestValue(D)V

    .line 485
    new-instance v23, Lcom/huawei/health/sns/ui/group/healthbeans/GroupUserRank;

    invoke-direct/range {v23 .. v23}, Lcom/huawei/health/sns/ui/group/healthbeans/GroupUserRank;-><init>()V

    .line 486
    const-string v0, "10000000000000014"

    move-object/from16 v1, v23

    invoke-virtual {v1, v0}, Lcom/huawei/health/sns/ui/group/healthbeans/GroupUserRank;->setHuid(Ljava/lang/String;)V

    .line 487
    const-string v0, "\u9ece\u660e\u661f\u6668"

    move-object/from16 v1, v23

    invoke-virtual {v1, v0}, Lcom/huawei/health/sns/ui/group/healthbeans/GroupUserRank;->setNickName(Ljava/lang/String;)V

    .line 488
    const-string v0, "pic_3"

    move-object/from16 v1, v23

    invoke-virtual {v1, v0}, Lcom/huawei/health/sns/ui/group/healthbeans/GroupUserRank;->setPhotoUrl(Ljava/lang/String;)V

    .line 489
    move-object/from16 v0, v23

    const/16 v1, 0xe

    invoke-virtual {v0, v1}, Lcom/huawei/health/sns/ui/group/healthbeans/GroupUserRank;->setGroupRank(I)V

    .line 490
    move-object/from16 v0, v23

    const-wide v1, 0x408c200000000000L    # 900.0

    invoke-virtual {v0, v1, v2}, Lcom/huawei/health/sns/ui/group/healthbeans/GroupUserRank;->setBestValue(D)V

    .line 492
    new-instance v24, Lcom/huawei/health/sns/ui/group/healthbeans/GroupUserRank;

    invoke-direct/range {v24 .. v24}, Lcom/huawei/health/sns/ui/group/healthbeans/GroupUserRank;-><init>()V

    .line 493
    const-string v0, "10000000000000015"

    move-object/from16 v1, v24

    invoke-virtual {v1, v0}, Lcom/huawei/health/sns/ui/group/healthbeans/GroupUserRank;->setHuid(Ljava/lang/String;)V

    .line 494
    const-string v0, "\u6211\u8981\u966a\u4f60\u6570\u592a\u9633"

    move-object/from16 v1, v24

    invoke-virtual {v1, v0}, Lcom/huawei/health/sns/ui/group/healthbeans/GroupUserRank;->setNickName(Ljava/lang/String;)V

    .line 495
    const-string v0, "pic_5"

    move-object/from16 v1, v24

    invoke-virtual {v1, v0}, Lcom/huawei/health/sns/ui/group/healthbeans/GroupUserRank;->setPhotoUrl(Ljava/lang/String;)V

    .line 496
    move-object/from16 v0, v24

    const/16 v1, 0xf

    invoke-virtual {v0, v1}, Lcom/huawei/health/sns/ui/group/healthbeans/GroupUserRank;->setGroupRank(I)V

    .line 497
    move-object/from16 v0, v24

    const-wide v1, 0x4084500000000000L    # 650.0

    invoke-virtual {v0, v1, v2}, Lcom/huawei/health/sns/ui/group/healthbeans/GroupUserRank;->setBestValue(D)V

    .line 499
    new-instance v25, Ljava/util/ArrayList;

    invoke-direct/range {v25 .. v25}, Ljava/util/ArrayList;-><init>()V

    .line 500
    move-object/from16 v0, v25

    invoke-interface {v0, v11}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 501
    move-object/from16 v0, v25

    invoke-interface {v0, v12}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 502
    move-object/from16 v0, v25

    invoke-interface {v0, v13}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 503
    move-object/from16 v0, v25

    invoke-interface {v0, v14}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 504
    move-object/from16 v0, v25

    invoke-interface {v0, v15}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 505
    move-object/from16 v0, v25

    move-object/from16 v1, v16

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 506
    move-object/from16 v0, v25

    move-object/from16 v1, v17

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 508
    move-object/from16 v0, v25

    move-object/from16 v1, v18

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 509
    move-object/from16 v0, v25

    move-object/from16 v1, v19

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 510
    move-object/from16 v0, v25

    move-object/from16 v1, v20

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 511
    move-object/from16 v0, v25

    move-object/from16 v1, v21

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 512
    move-object/from16 v0, v25

    move-object/from16 v1, v22

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 513
    move-object/from16 v0, v25

    move-object/from16 v1, v23

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 514
    move-object/from16 v0, v25

    move-object/from16 v1, v24

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 516
    const/16 v26, 0x1

    .line 517
    const/16 v27, 0x0

    .line 518
    const/16 v28, 0x0

    :goto_0
    invoke-interface/range {v25 .. v25}, Ljava/util/List;->size()I

    move-result v0

    move/from16 v1, v28

    if-ge v1, v0, :cond_2

    .line 519
    invoke-virtual {v10}, Lcom/huawei/health/sns/ui/group/healthbeans/GroupUserRank;->getBestValue()D

    move-result-wide v0

    move-object/from16 v2, v25

    move/from16 v3, v28

    invoke-interface {v2, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/huawei/health/sns/ui/group/healthbeans/GroupUserRank;

    invoke-virtual {v2}, Lcom/huawei/health/sns/ui/group/healthbeans/GroupUserRank;->getBestValue()D

    move-result-wide v2

    cmpl-double v0, v0, v2

    if-ltz v0, :cond_1

    if-nez v27, :cond_1

    .line 520
    move/from16 v0, v26

    invoke-virtual {v10, v0}, Lcom/huawei/health/sns/ui/group/healthbeans/GroupUserRank;->setGroupRank(I)V

    .line 521
    invoke-interface {v9, v10}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 522
    add-int/lit8 v26, v26, 0x1

    .line 523
    const/16 v27, 0x1

    .line 525
    :cond_1
    move-object/from16 v0, v25

    move/from16 v1, v28

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/health/sns/ui/group/healthbeans/GroupUserRank;

    move/from16 v1, v26

    invoke-virtual {v0, v1}, Lcom/huawei/health/sns/ui/group/healthbeans/GroupUserRank;->setGroupRank(I)V

    .line 526
    move-object/from16 v0, v25

    move/from16 v1, v28

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    invoke-interface {v9, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 527
    add-int/lit8 v26, v26, 0x1

    .line 518
    add-int/lit8 v28, v28, 0x1

    goto :goto_0

    .line 529
    :cond_2
    if-nez v27, :cond_3

    .line 530
    move/from16 v0, v26

    invoke-virtual {v10, v0}, Lcom/huawei/health/sns/ui/group/healthbeans/GroupUserRank;->setGroupRank(I)V

    .line 531
    invoke-interface {v9, v10}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 533
    :cond_3
    move-object/from16 v0, p0

    iput-object v10, v0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthEventRankFragment;->t:Lcom/huawei/health/sns/ui/group/healthbeans/GroupUserRank;

    .line 537
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthEventRankFragment;->f:Landroid/app/Activity;

    invoke-static {v0}, Lo/bht;->b(Landroid/content/Context;)Lo/bht;

    move-result-object v0

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v1

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v3

    const-wide v5, 0x9a7ec800L

    add-long/2addr v3, v5

    const-string v5, "run"

    new-instance v6, Lcom/huawei/health/sns/ui/groupstoredemo/HealthEventRankFragment$5;

    move-object/from16 v7, p0

    move-object/from16 v8, v25

    invoke-direct {v6, v7, v10, v9, v8}, Lcom/huawei/health/sns/ui/groupstoredemo/HealthEventRankFragment$5;-><init>(Lcom/huawei/health/sns/ui/groupstoredemo/HealthEventRankFragment;Lcom/huawei/health/sns/ui/group/healthbeans/GroupUserRank;Ljava/util/List;Ljava/util/List;)V

    invoke-virtual/range {v0 .. v6}, Lo/bht;->b(JJLjava/lang/String;Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V

    .line 579
    :goto_1
    new-instance v10, Landroid/os/Message;

    invoke-direct {v10}, Landroid/os/Message;-><init>()V

    .line 580
    const/16 v0, 0x59

    iput v0, v10, Landroid/os/Message;->what:I

    .line 581
    iput-object v9, v10, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 582
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthEventRankFragment;->j:Landroid/os/Handler;

    invoke-virtual {v0, v10}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    .line 597
    return-void
.end method

.method static synthetic b(Lcom/huawei/health/sns/ui/groupstoredemo/HealthEventRankFragment;Landroid/os/Message;)V
    .locals 0

    .line 61
    invoke-direct {p0, p1}, Lcom/huawei/health/sns/ui/groupstoredemo/HealthEventRankFragment;->a(Landroid/os/Message;)V

    return-void
.end method

.method static synthetic c(Lcom/huawei/health/sns/ui/groupstoredemo/HealthEventRankFragment;)Landroid/app/Activity;
    .locals 1

    .line 61
    iget-object v0, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthEventRankFragment;->f:Landroid/app/Activity;

    return-object v0
.end method

.method private c()V
    .locals 6

    .line 188
    iget-object v0, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthEventRankFragment;->f:Landroid/app/Activity;

    invoke-virtual {v0}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    move-result-object v4

    .line 189
    if-eqz v4, :cond_1

    .line 190
    invoke-virtual {v4}, Landroid/content/Intent;->getExtras()Landroid/os/Bundle;

    move-result-object v5

    .line 191
    if-eqz v5, :cond_0

    const-string v0, "group"

    invoke-virtual {v5, v0}, Landroid/os/Bundle;->containsKey(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    const-string v0, "activityId"

    invoke-virtual {v5, v0}, Landroid/os/Bundle;->containsKey(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 192
    const-string v0, "activityId"

    invoke-virtual {v5, v0}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthEventRankFragment;->m:Ljava/lang/String;

    .line 194
    :cond_0
    goto :goto_0

    .line 195
    :cond_1
    const-string v0, "Group_HealthEventRankFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "intent is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 196
    iget-object v0, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthEventRankFragment;->f:Landroid/app/Activity;

    invoke-virtual {v0}, Landroid/app/Activity;->finish()V

    .line 197
    return-void

    .line 199
    :goto_0
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthEventRankFragment;->C:Ljava/util/ArrayList;

    .line 200
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthEventRankFragment;->q:Ljava/util/List;

    .line 201
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthEventRankFragment;->u:Ljava/util/List;

    .line 203
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/groupstoredemo/HealthEventRankFragment;->b()V

    .line 205
    return-void
.end method

.method static synthetic d(Lcom/huawei/health/sns/ui/groupstoredemo/HealthEventRankFragment;)Landroid/os/Handler;
    .locals 1

    .line 61
    iget-object v0, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthEventRankFragment;->j:Landroid/os/Handler;

    return-object v0
.end method

.method private d()V
    .locals 8

    .line 793
    const-string v0, "Group_HealthEventRankFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "refreshEventDetail()"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 795
    iget-object v0, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthEventRankFragment;->D:Ljava/lang/String;

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 796
    iget-object v0, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthEventRankFragment;->f:Landroid/app/Activity;

    invoke-static {v0}, Lo/bht;->b(Landroid/content/Context;)Lo/bht;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthEventRankFragment;->f:Landroid/app/Activity;

    iget-object v2, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthEventRankFragment;->D:Ljava/lang/String;

    iget-object v3, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthEventRankFragment;->a:Landroid/widget/ImageView;

    const/4 v4, 0x4

    invoke-virtual {v0, v1, v2, v3, v4}, Lo/bht;->e(Landroid/content/Context;Ljava/lang/String;Landroid/widget/ImageView;I)V

    .line 800
    :cond_0
    iget v0, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthEventRankFragment;->p:I

    sparse-switch v0, :sswitch_data_0

    goto/16 :goto_3

    .line 802
    :sswitch_0
    iget-object v0, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthEventRankFragment;->e:Lo/egb;

    iget-object v1, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthEventRankFragment;->f:Landroid/app/Activity;

    sget v2, Lcom/huawei/android/sns/R$string;->IDS_hwh_home_rank_type_detail_single_walk:I

    invoke-virtual {v1, v2}, Landroid/app/Activity;->getString(I)Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    iget-wide v4, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthEventRankFragment;->o:D

    invoke-static {v4, v5}, Ljava/lang/Double;->toString(D)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    iget-object v4, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthEventRankFragment;->f:Landroid/app/Activity;

    sget v5, Lcom/huawei/android/sns/R$string;->IDS_band_data_sport_distance_unit:I

    invoke-virtual {v4, v5}, Landroid/app/Activity;->getString(I)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    invoke-static {v1, v2}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/egb;->setText(Ljava/lang/CharSequence;)V

    .line 803
    iget-object v0, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthEventRankFragment;->b:Lo/egb;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lo/egb;->setVisibility(I)V

    .line 804
    iget-object v0, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthEventRankFragment;->c:Lo/egb;

    iget-object v1, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthEventRankFragment;->f:Landroid/app/Activity;

    sget v2, Lcom/huawei/android/sns/R$string;->IDS_hwh_home_group_event_finish_time:I

    invoke-virtual {v1, v2}, Landroid/app/Activity;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/egb;->setText(Ljava/lang/CharSequence;)V

    .line 805
    goto/16 :goto_3

    .line 807
    :sswitch_1
    iget-object v0, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthEventRankFragment;->e:Lo/egb;

    iget-object v1, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthEventRankFragment;->f:Landroid/app/Activity;

    sget v2, Lcom/huawei/android/sns/R$string;->IDS_hwh_home_rank_type_detail_single_run:I

    invoke-virtual {v1, v2}, Landroid/app/Activity;->getString(I)Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    iget-wide v4, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthEventRankFragment;->o:D

    invoke-static {v4, v5}, Ljava/lang/Double;->toString(D)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    iget-object v4, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthEventRankFragment;->f:Landroid/app/Activity;

    sget v5, Lcom/huawei/android/sns/R$string;->IDS_band_data_sport_distance_unit:I

    invoke-virtual {v4, v5}, Landroid/app/Activity;->getString(I)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    invoke-static {v1, v2}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/egb;->setText(Ljava/lang/CharSequence;)V

    .line 808
    iget-object v0, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthEventRankFragment;->b:Lo/egb;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lo/egb;->setVisibility(I)V

    .line 809
    iget-object v0, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthEventRankFragment;->c:Lo/egb;

    iget-object v1, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthEventRankFragment;->f:Landroid/app/Activity;

    sget v2, Lcom/huawei/android/sns/R$string;->IDS_hwh_home_group_event_finish_time:I

    invoke-virtual {v1, v2}, Landroid/app/Activity;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/egb;->setText(Ljava/lang/CharSequence;)V

    .line 810
    goto/16 :goto_3

    .line 812
    :sswitch_2
    iget-object v0, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthEventRankFragment;->e:Lo/egb;

    iget-object v1, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthEventRankFragment;->f:Landroid/app/Activity;

    sget v2, Lcom/huawei/android/sns/R$string;->IDS_hwh_home_rank_type_detail_single_ride:I

    invoke-virtual {v1, v2}, Landroid/app/Activity;->getString(I)Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    iget-wide v4, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthEventRankFragment;->o:D

    invoke-static {v4, v5}, Ljava/lang/Double;->toString(D)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    iget-object v4, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthEventRankFragment;->f:Landroid/app/Activity;

    sget v5, Lcom/huawei/android/sns/R$string;->IDS_band_data_sport_distance_unit:I

    invoke-virtual {v4, v5}, Landroid/app/Activity;->getString(I)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    invoke-static {v1, v2}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/egb;->setText(Ljava/lang/CharSequence;)V

    .line 813
    iget-object v0, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthEventRankFragment;->b:Lo/egb;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lo/egb;->setVisibility(I)V

    .line 814
    iget-object v0, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthEventRankFragment;->b:Lo/egb;

    iget-object v1, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthEventRankFragment;->f:Landroid/app/Activity;

    sget v2, Lcom/huawei/android/sns/R$string;->IDS_motiontrack_show_detail_averagespeed:I

    invoke-virtual {v1, v2}, Landroid/app/Activity;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/egb;->setText(Ljava/lang/CharSequence;)V

    .line 815
    iget-object v0, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthEventRankFragment;->c:Lo/egb;

    iget-object v1, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthEventRankFragment;->f:Landroid/app/Activity;

    sget v2, Lcom/huawei/android/sns/R$string;->IDS_hwh_home_group_event_finish_time:I

    invoke-virtual {v1, v2}, Landroid/app/Activity;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/egb;->setText(Ljava/lang/CharSequence;)V

    .line 816
    goto/16 :goto_3

    .line 820
    :sswitch_3
    iget-wide v0, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthEventRankFragment;->o:D

    const-wide/16 v2, 0x0

    cmpl-double v0, v0, v2

    if-lez v0, :cond_1

    .line 821
    iget-object v0, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthEventRankFragment;->e:Lo/egb;

    iget-object v1, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthEventRankFragment;->f:Landroid/app/Activity;

    sget v2, Lcom/huawei/android/sns/R$string;->IDS_hwh_home_rank_type_detail_cumulative_need_target:I

    invoke-virtual {v1, v2}, Landroid/app/Activity;->getString(I)Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    iget-wide v4, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthEventRankFragment;->o:D

    invoke-static {v4, v5}, Ljava/lang/Double;->toString(D)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    iget-object v4, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthEventRankFragment;->f:Landroid/app/Activity;

    sget v5, Lcom/huawei/android/sns/R$string;->IDS_band_data_sport_distance_unit:I

    invoke-virtual {v4, v5}, Landroid/app/Activity;->getString(I)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    invoke-static {v1, v2}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/egb;->setText(Ljava/lang/CharSequence;)V

    goto :goto_0

    .line 823
    :cond_1
    iget-object v0, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthEventRankFragment;->e:Lo/egb;

    iget-object v1, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthEventRankFragment;->f:Landroid/app/Activity;

    sget v2, Lcom/huawei/android/sns/R$string;->IDS_hwh_home_rank_type_detail_cumulative:I

    invoke-virtual {v1, v2}, Landroid/app/Activity;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/egb;->setText(Ljava/lang/CharSequence;)V

    .line 825
    :goto_0
    iget-object v0, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthEventRankFragment;->b:Lo/egb;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Lo/egb;->setVisibility(I)V

    .line 826
    iget-object v0, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthEventRankFragment;->c:Lo/egb;

    iget-object v1, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthEventRankFragment;->f:Landroid/app/Activity;

    sget v2, Lcom/huawei/android/sns/R$string;->IDS_hwh_home_rank_type_detail_result_distance:I

    invoke-virtual {v1, v2}, Landroid/app/Activity;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/egb;->setText(Ljava/lang/CharSequence;)V

    .line 827
    goto/16 :goto_3

    .line 829
    :sswitch_4
    iget-wide v0, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthEventRankFragment;->o:D

    const-wide/16 v2, 0x0

    cmpl-double v0, v0, v2

    if-lez v0, :cond_2

    .line 830
    iget-object v0, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthEventRankFragment;->e:Lo/egb;

    iget-object v1, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthEventRankFragment;->f:Landroid/app/Activity;

    sget v2, Lcom/huawei/android/sns/R$string;->IDS_hwh_home_rank_type_detail_cumulative_need_target:I

    invoke-virtual {v1, v2}, Landroid/app/Activity;->getString(I)Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    iget-wide v4, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthEventRankFragment;->o:D

    const/4 v6, 0x1

    const/4 v7, 0x0

    invoke-static {v4, v5, v6, v7}, Lo/cxh;->a(DII)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    iget-object v4, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthEventRankFragment;->f:Landroid/app/Activity;

    sget v5, Lcom/huawei/android/sns/R$string;->IDS_fitness_data_list_activity_meter_unit:I

    invoke-virtual {v4, v5}, Landroid/app/Activity;->getString(I)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    invoke-static {v1, v2}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/egb;->setText(Ljava/lang/CharSequence;)V

    goto :goto_1

    .line 832
    :cond_2
    iget-object v0, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthEventRankFragment;->e:Lo/egb;

    iget-object v1, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthEventRankFragment;->f:Landroid/app/Activity;

    sget v2, Lcom/huawei/android/sns/R$string;->IDS_hwh_home_rank_type_detail_cumulative:I

    invoke-virtual {v1, v2}, Landroid/app/Activity;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/egb;->setText(Ljava/lang/CharSequence;)V

    .line 834
    :goto_1
    iget-object v0, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthEventRankFragment;->b:Lo/egb;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Lo/egb;->setVisibility(I)V

    .line 835
    iget-object v0, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthEventRankFragment;->c:Lo/egb;

    iget-object v1, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthEventRankFragment;->f:Landroid/app/Activity;

    sget v2, Lcom/huawei/android/sns/R$string;->IDS_hwh_home_rank_type_detail_result_distance:I

    invoke-virtual {v1, v2}, Landroid/app/Activity;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/egb;->setText(Ljava/lang/CharSequence;)V

    .line 836
    goto :goto_3

    .line 838
    :sswitch_5
    iget-wide v0, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthEventRankFragment;->o:D

    const-wide/16 v2, 0x0

    cmpl-double v0, v0, v2

    if-lez v0, :cond_3

    .line 839
    iget-object v0, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthEventRankFragment;->e:Lo/egb;

    iget-object v1, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthEventRankFragment;->f:Landroid/app/Activity;

    sget v2, Lcom/huawei/android/sns/R$string;->IDS_hwh_home_rank_type_detail_cumulative_time_need_target:I

    invoke-virtual {v1, v2}, Landroid/app/Activity;->getString(I)Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    iget-wide v4, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthEventRankFragment;->o:D

    const/4 v6, 0x1

    const/4 v7, 0x0

    invoke-static {v4, v5, v6, v7}, Lo/cxh;->a(DII)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    iget-object v4, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthEventRankFragment;->f:Landroid/app/Activity;

    sget v5, Lcom/huawei/android/sns/R$string;->IDS_messagecenter_time_minute_value:I

    invoke-virtual {v4, v5}, Landroid/app/Activity;->getString(I)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    invoke-static {v1, v2}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/egb;->setText(Ljava/lang/CharSequence;)V

    goto :goto_2

    .line 841
    :cond_3
    iget-object v0, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthEventRankFragment;->e:Lo/egb;

    iget-object v1, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthEventRankFragment;->f:Landroid/app/Activity;

    sget v2, Lcom/huawei/android/sns/R$string;->IDS_hwh_home_rank_type_detail_cumulative_time:I

    invoke-virtual {v1, v2}, Landroid/app/Activity;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/egb;->setText(Ljava/lang/CharSequence;)V

    .line 843
    :goto_2
    iget-object v0, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthEventRankFragment;->b:Lo/egb;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Lo/egb;->setVisibility(I)V

    .line 844
    iget-object v0, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthEventRankFragment;->c:Lo/egb;

    iget-object v1, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthEventRankFragment;->f:Landroid/app/Activity;

    sget v2, Lcom/huawei/android/sns/R$string;->IDS_hwh_home_rank_type_detail_result_time:I

    invoke-virtual {v1, v2}, Landroid/app/Activity;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/egb;->setText(Ljava/lang/CharSequence;)V

    .line 845
    .line 851
    :goto_3
    iget-object v0, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthEventRankFragment;->d:Lo/egb;

    iget-object v1, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthEventRankFragment;->f:Landroid/app/Activity;

    invoke-virtual {v1}, Landroid/app/Activity;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/android/sns/R$plurals;->sns_group_member_counts:I

    iget v3, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthEventRankFragment;->n:I

    const/4 v4, 0x1

    new-array v4, v4, [Ljava/lang/Object;

    iget v5, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthEventRankFragment;->n:I

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    const/4 v6, 0x0

    aput-object v5, v4, v6

    invoke-virtual {v1, v2, v3, v4}, Landroid/content/res/Resources;->getQuantityString(II[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/egb;->setText(Ljava/lang/CharSequence;)V

    .line 854
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/groupstoredemo/HealthEventRankFragment;->a()V

    .line 856
    return-void

    :sswitch_data_0
    .sparse-switch
        0x65 -> :sswitch_0
        0x66 -> :sswitch_1
        0x67 -> :sswitch_2
        0xc9 -> :sswitch_3
        0xca -> :sswitch_3
        0xcb -> :sswitch_3
        0xcc -> :sswitch_5
        0xcd -> :sswitch_4
    .end sparse-switch
.end method

.method private e()V
    .locals 13

    .line 627
    const-string v0, "Group_HealthEventRankFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "refreshSelfEventRank start"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 629
    iget-object v6, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthEventRankFragment;->t:Lcom/huawei/health/sns/ui/group/healthbeans/GroupUserRank;

    .line 631
    if-nez v6, :cond_0

    .line 632
    const-string v0, "Group_HealthEventRankFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "refreshSelfEventRank groupUserRank == null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 633
    return-void

    .line 635
    :cond_0
    iget-object v0, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthEventRankFragment;->x:Landroid/view/View;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 637
    invoke-virtual {v6}, Lcom/huawei/health/sns/ui/group/healthbeans/GroupUserRank;->getGroupRank()I

    move-result v0

    if-lez v0, :cond_1

    .line 638
    invoke-virtual {v6}, Lcom/huawei/health/sns/ui/group/healthbeans/GroupUserRank;->getGroupRank()I

    move-result v0

    packed-switch v0, :pswitch_data_0

    goto :goto_0

    .line 640
    :pswitch_0
    iget-object v0, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthEventRankFragment;->w:Landroid/widget/TextView;

    const-string v1, ""

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 641
    iget-object v0, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthEventRankFragment;->w:Landroid/widget/TextView;

    iget-object v1, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthEventRankFragment;->f:Landroid/app/Activity;

    invoke-virtual {v1}, Landroid/app/Activity;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/android/sns/R$drawable;->icon_order_1:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 642
    goto :goto_1

    .line 644
    :pswitch_1
    iget-object v0, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthEventRankFragment;->w:Landroid/widget/TextView;

    const-string v1, ""

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 645
    iget-object v0, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthEventRankFragment;->w:Landroid/widget/TextView;

    iget-object v1, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthEventRankFragment;->f:Landroid/app/Activity;

    invoke-virtual {v1}, Landroid/app/Activity;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/android/sns/R$drawable;->icon_order_2:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 646
    goto :goto_1

    .line 648
    :pswitch_2
    iget-object v0, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthEventRankFragment;->w:Landroid/widget/TextView;

    const-string v1, ""

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 649
    iget-object v0, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthEventRankFragment;->w:Landroid/widget/TextView;

    iget-object v1, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthEventRankFragment;->f:Landroid/app/Activity;

    invoke-virtual {v1}, Landroid/app/Activity;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/android/sns/R$drawable;->icon_order_3:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 650
    goto :goto_1

    .line 652
    :goto_0
    iget-object v0, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthEventRankFragment;->w:Landroid/widget/TextView;

    invoke-virtual {v6}, Lcom/huawei/health/sns/ui/group/healthbeans/GroupUserRank;->getGroupRank()I

    move-result v1

    invoke-static {v1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 653
    iget-object v0, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthEventRankFragment;->w:Landroid/widget/TextView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setBackgroundColor(I)V

    .line 654
    goto :goto_1

    .line 657
    :cond_1
    iget-object v0, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthEventRankFragment;->w:Landroid/widget/TextView;

    const-string v1, ""

    invoke-static {v1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 660
    :goto_1
    iget-object v0, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthEventRankFragment;->y:Landroid/widget/TextView;

    iget-object v1, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthEventRankFragment;->f:Landroid/app/Activity;

    sget v2, Lcom/huawei/android/sns/R$string;->IDS_hwh_home_create_group_me:I

    invoke-virtual {v1, v2}, Landroid/app/Activity;->getString(I)Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    invoke-virtual {v6}, Lcom/huawei/health/sns/ui/group/healthbeans/GroupUserRank;->getNickName()Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    invoke-static {v1, v2}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 662
    const-string v7, ""

    .line 663
    iget-object v0, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthEventRankFragment;->m:Ljava/lang/String;

    const-string v1, "1000"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 664
    const/16 v0, 0x66

    iput v0, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthEventRankFragment;->p:I

    goto :goto_2

    .line 666
    :cond_2
    const/16 v0, 0xca

    iput v0, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthEventRankFragment;->p:I

    .line 668
    :goto_2
    iget v0, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthEventRankFragment;->p:I

    sparse-switch v0, :sswitch_data_0

    goto/16 :goto_3

    .line 671
    :sswitch_0
    iget-object v0, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthEventRankFragment;->f:Landroid/app/Activity;

    invoke-static {v0}, Lo/bht;->b(Landroid/content/Context;)Lo/bht;

    move-result-object v0

    invoke-virtual {v6}, Lcom/huawei/health/sns/ui/group/healthbeans/GroupUserRank;->getBestValue()D

    move-result-wide v1

    double-to-int v1, v1

    invoke-virtual {v0, v1}, Lo/bht;->b(I)Ljava/lang/String;

    move-result-object v8

    .line 672
    iget-object v0, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthEventRankFragment;->A:Landroid/widget/TextView;

    invoke-virtual {v0, v8}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 673
    iget-wide v0, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthEventRankFragment;->o:D

    const-wide/16 v2, 0x0

    cmpl-double v0, v0, v2

    if-eqz v0, :cond_3

    .line 674
    invoke-virtual {v6}, Lcom/huawei/health/sns/ui/group/healthbeans/GroupUserRank;->getBestValue()D

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Math;->round(D)J

    move-result-wide v0

    long-to-double v0, v0

    iget-wide v2, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthEventRankFragment;->o:D

    div-double/2addr v0, v2

    double-to-int v9, v0

    .line 675
    const-string v0, "%02d\'%02d\""

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    div-int/lit8 v2, v9, 0x3c

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    rem-int/lit8 v2, v9, 0x3c

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v7

    .line 676
    iget-object v0, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthEventRankFragment;->v:Landroid/widget/TextView;

    invoke-virtual {v0, v7}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 677
    goto/16 :goto_4

    .line 678
    :cond_3
    const-string v0, "Group_HealthEventRankFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "refreshSelfEventRank goalValue == 0 "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 679
    const-string v0, "%02d\'%02d\""

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const/4 v2, 0x0

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x0

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v7

    .line 680
    iget-object v0, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthEventRankFragment;->v:Landroid/widget/TextView;

    invoke-virtual {v0, v7}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 682
    goto/16 :goto_4

    .line 685
    :sswitch_1
    iget-object v0, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthEventRankFragment;->s:Lo/egb;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "("

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget-object v2, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthEventRankFragment;->f:Landroid/app/Activity;

    sget v3, Lcom/huawei/android/sns/R$string;->IDS_motiontrack_show_detail_average_speed:I

    invoke-virtual {v2, v3}, Landroid/app/Activity;->getString(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, ")"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/egb;->setText(Ljava/lang/CharSequence;)V

    .line 686
    iget-object v0, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthEventRankFragment;->f:Landroid/app/Activity;

    invoke-static {v0}, Lo/bht;->b(Landroid/content/Context;)Lo/bht;

    move-result-object v0

    invoke-virtual {v6}, Lcom/huawei/health/sns/ui/group/healthbeans/GroupUserRank;->getBestValue()D

    move-result-wide v1

    double-to-int v1, v1

    invoke-virtual {v0, v1}, Lo/bht;->b(I)Ljava/lang/String;

    move-result-object v9

    .line 687
    iget-object v0, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthEventRankFragment;->A:Landroid/widget/TextView;

    invoke-virtual {v0, v9}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 688
    iget-wide v0, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthEventRankFragment;->o:D

    const-wide/16 v2, 0x0

    cmpl-double v0, v0, v2

    if-eqz v0, :cond_4

    .line 689
    iget-wide v0, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthEventRankFragment;->o:D

    invoke-virtual {v6}, Lcom/huawei/health/sns/ui/group/healthbeans/GroupUserRank;->getBestValue()D

    move-result-wide v2

    const-wide v4, 0x40ac200000000000L    # 3600.0

    div-double/2addr v2, v4

    div-double/2addr v0, v2

    const/4 v2, 0x1

    const/4 v3, 0x2

    invoke-static {v0, v1, v2, v3}, Lo/cxh;->a(DII)Ljava/lang/String;

    move-result-object v7

    .line 690
    iget-object v0, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthEventRankFragment;->v:Landroid/widget/TextView;

    invoke-virtual {v0, v7}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    goto/16 :goto_4

    .line 692
    :cond_4
    const-string v0, "Group_HealthEventRankFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "refreshSelfEventRank goalValue == 0 "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 693
    const-string v7, "0"

    .line 694
    iget-object v0, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthEventRankFragment;->v:Landroid/widget/TextView;

    invoke-virtual {v0, v7}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 696
    goto/16 :goto_4

    .line 698
    :sswitch_2
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v6}, Lcom/huawei/health/sns/ui/group/healthbeans/GroupUserRank;->getBestValue()D

    move-result-wide v1

    const-wide/high16 v3, 0x404e000000000000L    # 60.0

    div-double/2addr v1, v3

    invoke-static {v1, v2}, Ljava/lang/Math;->round(D)J

    move-result-wide v1

    long-to-int v1, v1

    invoke-static {v1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthEventRankFragment;->f:Landroid/app/Activity;

    sget v2, Lcom/huawei/android/sns/R$string;->IDS_messagecenter_time_minute_value:I

    invoke-virtual {v1, v2}, Landroid/app/Activity;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v10

    .line 699
    iget-object v0, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthEventRankFragment;->A:Landroid/widget/TextView;

    invoke-virtual {v0, v10}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 700
    iget-object v0, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthEventRankFragment;->v:Landroid/widget/TextView;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 701
    goto :goto_4

    .line 703
    :sswitch_3
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v6}, Lcom/huawei/health/sns/ui/group/healthbeans/GroupUserRank;->getBestValue()D

    move-result-wide v1

    invoke-static {v1, v2}, Ljava/lang/Math;->round(D)J

    move-result-wide v1

    long-to-int v1, v1

    invoke-static {v1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthEventRankFragment;->f:Landroid/app/Activity;

    sget v2, Lcom/huawei/android/sns/R$string;->IDS_fitness_data_list_activity_meter_unit:I

    invoke-virtual {v1, v2}, Landroid/app/Activity;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v11

    .line 704
    iget-object v0, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthEventRankFragment;->A:Landroid/widget/TextView;

    invoke-virtual {v0, v11}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 705
    iget-object v0, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthEventRankFragment;->v:Landroid/widget/TextView;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 706
    goto :goto_4

    .line 708
    :goto_3
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v6}, Lcom/huawei/health/sns/ui/group/healthbeans/GroupUserRank;->getBestValue()D

    move-result-wide v1

    const-wide v3, 0x408f400000000000L    # 1000.0

    div-double/2addr v1, v3

    const/4 v3, 0x1

    const/4 v4, 0x2

    invoke-static {v1, v2, v3, v4}, Lo/cxh;->a(DII)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthEventRankFragment;->f:Landroid/app/Activity;

    sget v2, Lcom/huawei/android/sns/R$string;->IDS_band_data_sport_distance_unit:I

    invoke-virtual {v1, v2}, Landroid/app/Activity;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v12

    .line 709
    iget-object v0, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthEventRankFragment;->A:Landroid/widget/TextView;

    invoke-virtual {v0, v12}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 710
    iget-object v0, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthEventRankFragment;->v:Landroid/widget/TextView;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 714
    :goto_4
    iget-object v0, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthEventRankFragment;->z:Landroid/widget/ImageView;

    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v1

    invoke-static {v1}, Lo/bht;->b(Landroid/content/Context;)Lo/bht;

    move-result-object v1

    invoke-virtual {v6}, Lcom/huawei/health/sns/ui/group/healthbeans/GroupUserRank;->getPhotoUrl()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Lo/bht;->c(Ljava/lang/String;)Landroid/graphics/Bitmap;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageBitmap(Landroid/graphics/Bitmap;)V

    .line 715
    return-void

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
        :pswitch_1
        :pswitch_2
    .end packed-switch

    :sswitch_data_0
    .sparse-switch
        0x65 -> :sswitch_0
        0x66 -> :sswitch_0
        0x67 -> :sswitch_1
        0xcc -> :sswitch_2
        0xcd -> :sswitch_3
    .end sparse-switch
.end method

.method static synthetic e(Lcom/huawei/health/sns/ui/groupstoredemo/HealthEventRankFragment;)V
    .locals 0

    .line 61
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/groupstoredemo/HealthEventRankFragment;->e()V

    return-void
.end method


# virtual methods
.method public c(Z)V
    .locals 0

    .line 738
    iput-boolean p1, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthEventRankFragment;->B:Z

    .line 739
    return-void
.end method

.method public d(IDILjava/lang/String;)V
    .locals 8

    .line 239
    iput-wide p2, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthEventRankFragment;->o:D

    .line 240
    iput p4, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthEventRankFragment;->n:I

    .line 241
    iput p1, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthEventRankFragment;->p:I

    .line 242
    iput-object p5, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthEventRankFragment;->D:Ljava/lang/String;

    .line 243
    iget-object v0, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthEventRankFragment;->j:Landroid/os/Handler;

    const/16 v1, 0x5d

    invoke-virtual {v0, v1}, Landroid/os/Handler;->sendEmptyMessage(I)Z

    .line 245
    const-string v0, "Group_HealthEventRankFragment"

    const/16 v1, 0x8

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "setChallengeGoalValue"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    const-string v2, " "

    const/4 v3, 0x2

    aput-object v2, v1, v3

    invoke-static {p2, p3}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v2

    const/4 v3, 0x3

    aput-object v2, v1, v3

    const-string v2, " "

    const/4 v3, 0x4

    aput-object v2, v1, v3

    invoke-static {p4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x5

    aput-object v2, v1, v3

    const-string v2, " "

    const/4 v3, 0x6

    aput-object v2, v1, v3

    const/4 v2, 0x7

    aput-object p5, v1, v2

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 247
    new-instance v0, Lo/bii;

    iget-object v1, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthEventRankFragment;->f:Landroid/app/Activity;

    iget-object v2, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthEventRankFragment;->q:Ljava/util/List;

    iget-wide v3, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthEventRankFragment;->o:D

    iget v5, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthEventRankFragment;->p:I

    invoke-direct/range {v0 .. v5}, Lo/bii;-><init>(Landroid/content/Context;Ljava/util/List;DI)V

    iput-object v0, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthEventRankFragment;->l:Lo/bii;

    .line 248
    new-instance v6, Landroid/support/v7/widget/LinearLayoutManager;

    iget-object v0, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthEventRankFragment;->f:Landroid/app/Activity;

    invoke-direct {v6, v0}, Landroid/support/v7/widget/LinearLayoutManager;-><init>(Landroid/content/Context;)V

    .line 249
    const/4 v0, 0x1

    invoke-virtual {v6, v0}, Landroid/support/v7/widget/LinearLayoutManager;->setOrientation(I)V

    .line 250
    iget-object v0, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthEventRankFragment;->h:Landroid/support/v7/widget/RecyclerView;

    invoke-virtual {v0, v6}, Landroid/support/v7/widget/RecyclerView;->setLayoutManager(Landroid/support/v7/widget/RecyclerView$LayoutManager;)V

    .line 251
    iget-object v0, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthEventRankFragment;->h:Landroid/support/v7/widget/RecyclerView;

    iget-object v1, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthEventRankFragment;->l:Lo/bii;

    invoke-virtual {v0, v1}, Landroid/support/v7/widget/RecyclerView;->setAdapter(Landroid/support/v7/widget/RecyclerView$Adapter;)V

    .line 253
    iget-object v0, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthEventRankFragment;->l:Lo/bii;

    iget-wide v1, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthEventRankFragment;->o:D

    invoke-virtual {v0, v1, v2}, Lo/bii;->e(D)V

    .line 254
    iget-object v0, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthEventRankFragment;->l:Lo/bii;

    invoke-virtual {v0}, Lo/bii;->notifyDataSetChanged()V

    .line 256
    iget-object v0, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthEventRankFragment;->t:Lcom/huawei/health/sns/ui/group/healthbeans/GroupUserRank;

    if-eqz v0, :cond_0

    .line 257
    new-instance v7, Landroid/os/Message;

    invoke-direct {v7}, Landroid/os/Message;-><init>()V

    .line 258
    const/16 v0, 0x5b

    iput v0, v7, Landroid/os/Message;->what:I

    .line 259
    iget-object v0, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthEventRankFragment;->t:Lcom/huawei/health/sns/ui/group/healthbeans/GroupUserRank;

    iput-object v0, v7, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 260
    iget-object v0, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthEventRankFragment;->j:Landroid/os/Handler;

    invoke-virtual {v0, v7}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    .line 263
    :cond_0
    return-void
.end method

.method public e(Ljava/util/ArrayList;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/ArrayList<Lcom/huawei/health/sns/model/group/GroupMember;>;)V"
        }
    .end annotation

    .line 782
    iget-object v0, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthEventRankFragment;->C:Ljava/util/ArrayList;

    if-eqz v0, :cond_0

    if-eqz p1, :cond_0

    .line 783
    iget-object v0, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthEventRankFragment;->C:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    .line 784
    iget-object v0, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthEventRankFragment;->C:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 786
    :cond_0
    return-void
.end method

.method public onCreateView(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;
    .locals 3
    .param p2    # Landroid/view/ViewGroup;
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param
    .param p3    # Landroid/os/Bundle;
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param
    .annotation build Landroid/support/annotation/Nullable;
    .end annotation

    .line 179
    sget v0, Lcom/huawei/android/sns/R$layout;->fragment_health_event_rank:I

    const/4 v1, 0x0

    invoke-virtual {p1, v0, p2, v1}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object v2

    .line 180
    invoke-virtual {p0}, Lcom/huawei/health/sns/ui/groupstoredemo/HealthEventRankFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthEventRankFragment;->f:Landroid/app/Activity;

    .line 181
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/groupstoredemo/HealthEventRankFragment;->c()V

    .line 182
    invoke-direct {p0, v2}, Lcom/huawei/health/sns/ui/groupstoredemo/HealthEventRankFragment;->a(Landroid/view/View;)V

    .line 184
    return-object v2
.end method

.method public onResume()V
    .locals 2

    .line 728
    invoke-super {p0}, Landroid/support/v4/app/Fragment;->onResume()V

    .line 729
    iget-boolean v0, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthEventRankFragment;->B:Z

    if-eqz v0, :cond_0

    .line 730
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthEventRankFragment;->B:Z

    .line 731
    iget-object v0, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthEventRankFragment;->q:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->clear()V

    .line 732
    iget-object v0, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthEventRankFragment;->u:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->clear()V

    .line 733
    iget-object v0, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthEventRankFragment;->j:Landroid/os/Handler;

    const/16 v1, 0x5a

    invoke-virtual {v0, v1}, Landroid/os/Handler;->sendEmptyMessage(I)Z

    .line 735
    :cond_0
    return-void
.end method
