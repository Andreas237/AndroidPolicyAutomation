.class public Lcom/huawei/pluginachievement/ui/AchieveMedalNewActivity;
.super Lcom/huawei/ui/commonui/base/BaseActivity;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;
.implements Lo/dyq;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/huawei/pluginachievement/ui/AchieveMedalNewActivity$d;
    }
.end annotation


# static fields
.field private static m:Ljava/util/concurrent/ExecutorService;


# instance fields
.field private B:Landroid/os/Handler;

.field private a:Landroid/support/v4/view/ViewPager;

.field private b:Lo/emm;

.field private c:Lo/emq;

.field private d:Lo/dwr;

.field private e:Landroid/content/Context;

.field private f:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<Ljava/lang/String;>;"
        }
    .end annotation
.end field

.field private g:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<Lo/dvv;>;"
        }
    .end annotation
.end field

.field private h:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<Ljava/lang/String;Ljava/util/ArrayList<Ljava/lang/String;>;>;"
        }
    .end annotation
.end field

.field private i:Z

.field private final j:[Ljava/lang/String;

.field private k:Lo/emr;

.field private l:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<Ljava/lang/String;Ljava/util/ArrayList<Lo/dvz;>;>;"
        }
    .end annotation
.end field

.field private n:Ljava/lang/String;

.field private o:Z

.field private p:Landroid/os/Handler;

.field private q:Landroid/widget/LinearLayout;

.field private r:Landroid/widget/LinearLayout;

.field private s:Landroid/support/v7/widget/RecyclerView;

.field private t:Landroid/widget/ScrollView;

.field private u:Lo/dxx;

.field private v:Lcom/huawei/hihealth/HiUserInfo;

.field private w:Landroid/widget/ImageView;

.field private x:Landroid/widget/TextView;

.field private y:Ljava/lang/String;

.field private z:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 3

    .line 95
    invoke-direct {p0}, Lcom/huawei/ui/commonui/base/BaseActivity;-><init>()V

    .line 107
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/huawei/pluginachievement/ui/AchieveMedalNewActivity;->i:Z

    .line 108
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/huawei/pluginachievement/ui/AchieveMedalNewActivity;->g:Ljava/util/ArrayList;

    .line 117
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/huawei/pluginachievement/ui/AchieveMedalNewActivity;->o:Z

    .line 182
    new-instance v0, Lcom/huawei/pluginachievement/ui/AchieveMedalNewActivity$4;

    invoke-direct {v0, p0}, Lcom/huawei/pluginachievement/ui/AchieveMedalNewActivity$4;-><init>(Lcom/huawei/pluginachievement/ui/AchieveMedalNewActivity;)V

    iput-object v0, p0, Lcom/huawei/pluginachievement/ui/AchieveMedalNewActivity;->p:Landroid/os/Handler;

    .line 603
    const-string v0, ""

    iput-object v0, p0, Lcom/huawei/pluginachievement/ui/AchieveMedalNewActivity;->z:Ljava/lang/String;

    .line 604
    const-string v0, ""

    iput-object v0, p0, Lcom/huawei/pluginachievement/ui/AchieveMedalNewActivity;->y:Ljava/lang/String;

    .line 611
    new-instance v0, Lcom/huawei/pluginachievement/ui/AchieveMedalNewActivity$d;

    invoke-direct {v0, p0}, Lcom/huawei/pluginachievement/ui/AchieveMedalNewActivity$d;-><init>(Lcom/huawei/pluginachievement/ui/AchieveMedalNewActivity;)V

    iput-object v0, p0, Lcom/huawei/pluginachievement/ui/AchieveMedalNewActivity;->B:Landroid/os/Handler;

    .line 612
    const/4 v0, 0x2

    new-array v0, v0, [Ljava/lang/String;

    const-string v1, "android.permission.READ_EXTERNAL_STORAGE"

    const/4 v2, 0x0

    aput-object v1, v0, v2

    const-string v1, "android.permission.WRITE_EXTERNAL_STORAGE"

    const/4 v2, 0x1

    aput-object v1, v0, v2

    iput-object v0, p0, Lcom/huawei/pluginachievement/ui/AchieveMedalNewActivity;->j:[Ljava/lang/String;

    return-void
.end method

.method static synthetic a(Lcom/huawei/pluginachievement/ui/AchieveMedalNewActivity;Ljava/util/List;Ljava/util/ArrayList;Ljava/util/List;)Ljava/util/ArrayList;
    .locals 1

    .line 95
    invoke-direct {p0, p1, p2, p3}, Lcom/huawei/pluginachievement/ui/AchieveMedalNewActivity;->a(Ljava/util/List;Ljava/util/ArrayList;Ljava/util/List;)Ljava/util/ArrayList;

    move-result-object v0

    return-object v0
.end method

.method private a(Ljava/util/List;Ljava/util/ArrayList;Ljava/util/List;)Ljava/util/ArrayList;
    .locals 27
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Lo/dvy;>;Ljava/util/ArrayList<Ljava/lang/String;>;Ljava/util/List<Lo/dvu;>;)Ljava/util/ArrayList<Lo/dvz;>;"
        }
    .end annotation

    .line 389
    const-string v0, "PLGACHIEVE_AchieveMedalNewActivity"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "enter getMedalInfoByConfig  list= "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const/4 v2, 0x0

    move-object/from16 v3, p2

    if-ne v2, v3, :cond_0

    const-string v2, "null"

    goto :goto_0

    :cond_0
    invoke-virtual/range {p2 .. p2}, Ljava/util/ArrayList;->toString()Ljava/lang/String;

    move-result-object v2

    :goto_0
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/dzu;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 390
    new-instance v4, Ljava/util/ArrayList;

    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    .line 391
    invoke-static {}, Lo/dzl;->b()Lo/dzl;

    move-result-object v0

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lo/dzl;->a(Z)Ljava/util/Map;

    move-result-object v5

    .line 392
    const/4 v0, 0x0

    move-object/from16 v1, p2

    if-ne v0, v1, :cond_1

    .line 393
    const-string v0, "PLGACHIEVE_AchieveMedalNewActivity"

    const-string v1, "the list is null"

    invoke-static {v0, v1}, Lo/dzu;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 394
    const/4 v0, 0x0

    return-object v0

    .line 396
    :cond_1
    invoke-virtual/range {p2 .. p2}, Ljava/util/ArrayList;->size()I

    move-result v6

    .line 397
    const/4 v7, 0x0

    .line 398
    const/4 v8, 0x0

    :goto_1
    if-ge v8, v6, :cond_b

    .line 399
    move-object/from16 v0, p2

    invoke-virtual {v0, v8}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v9, v0

    check-cast v9, Ljava/lang/String;

    .line 400
    new-instance v10, Lo/dvz;

    invoke-direct {v10, v9}, Lo/dvz;-><init>(Ljava/lang/String;)V

    .line 401
    const/4 v11, 0x0

    :goto_2
    invoke-interface/range {p1 .. p1}, Ljava/util/List;->size()I

    move-result v0

    if-ge v11, v0, :cond_3

    .line 402
    move-object/from16 v0, p1

    invoke-interface {v0, v11}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v12, v0

    check-cast v12, Lo/dvy;

    .line 403
    invoke-virtual {v12}, Lo/dvy;->b()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v9, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 404
    invoke-virtual {v12}, Lo/dvy;->h()Ljava/lang/String;

    move-result-object v13

    .line 405
    invoke-virtual {v12}, Lo/dvy;->g()I

    move-result v7

    .line 406
    invoke-virtual {v10, v7}, Lo/dvz;->e(I)V

    .line 407
    invoke-virtual {v10, v13}, Lo/dvz;->d(Ljava/lang/String;)V

    .line 408
    goto :goto_3

    .line 401
    :cond_2
    add-int/lit8 v11, v11, 0x1

    goto :goto_2

    .line 412
    :cond_3
    :goto_3
    const/4 v11, 0x0

    .line 413
    const/4 v12, 0x0

    .line 416
    const/4 v15, 0x0

    .line 417
    const/16 v16, 0x0

    :goto_4
    invoke-interface/range {p3 .. p3}, Ljava/util/List;->size()I

    move-result v0

    move/from16 v1, v16

    if-ge v1, v0, :cond_8

    .line 418
    move-object/from16 v0, p3

    move/from16 v1, v16

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object/from16 v17, v0

    check-cast v17, Lo/dvu;

    .line 419
    invoke-virtual/range {v17 .. v17}, Lo/dvu;->a()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v9, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_7

    .line 420
    invoke-virtual/range {v17 .. v17}, Lo/dvu;->b()Ljava/lang/String;

    move-result-object v18

    .line 421
    invoke-virtual/range {v17 .. v17}, Lo/dvu;->d()Ljava/lang/String;

    move-result-object v19

    .line 422
    invoke-virtual/range {v17 .. v17}, Lo/dvu;->c()Ljava/lang/String;

    move-result-object v20

    .line 423
    invoke-virtual/range {v17 .. v17}, Lo/dvu;->e()Ljava/lang/String;

    move-result-object v21

    .line 424
    invoke-virtual/range {v17 .. v17}, Lo/dvu;->D()Ljava/lang/String;

    move-result-object v12

    .line 425
    invoke-virtual/range {v17 .. v17}, Lo/dvu;->C()I

    move-result v0

    invoke-static {v0}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v22

    .line 426
    move-object/from16 v0, v22

    invoke-static {v12, v0}, Lo/dty;->d(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v23

    .line 428
    if-lez v7, :cond_4

    .line 429
    invoke-virtual/range {v17 .. v17}, Lo/dvu;->f()Ljava/lang/String;

    move-result-object v13

    .line 430
    invoke-virtual/range {v17 .. v17}, Lo/dvu;->i()Ljava/lang/String;

    move-result-object v14

    goto :goto_5

    .line 432
    :cond_4
    invoke-virtual/range {v17 .. v17}, Lo/dvu;->k()Ljava/lang/String;

    move-result-object v13

    .line 433
    invoke-virtual/range {v17 .. v17}, Lo/dvu;->g()Ljava/lang/String;

    move-result-object v14

    .line 436
    :goto_5
    invoke-virtual/range {v17 .. v17}, Lo/dvu;->w()I

    move-result v24

    .line 437
    invoke-virtual/range {v17 .. v17}, Lo/dvu;->x()I

    move-result v25

    .line 438
    invoke-virtual/range {v17 .. v17}, Lo/dvu;->v()I

    move-result v15

    .line 439
    invoke-virtual/range {v17 .. v17}, Lo/dvu;->u()Ljava/lang/String;

    move-result-object v11

    .line 440
    move-object/from16 v0, p0

    iget-boolean v0, v0, Lcom/huawei/pluginachievement/ui/AchieveMedalNewActivity;->o:Z

    if-eqz v0, :cond_6

    .line 441
    move-object/from16 v0, v23

    invoke-interface {v5, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    move-object/from16 v26, v0

    check-cast v26, Lo/dvx;

    .line 442
    move-object/from16 v0, p0

    move-object/from16 v1, v26

    invoke-direct {v0, v10, v1}, Lcom/huawei/pluginachievement/ui/AchieveMedalNewActivity;->d(Lo/dvz;Lo/dvx;)Z

    move-result v0

    if-nez v0, :cond_5

    .line 443
    move-object/from16 v0, v18

    invoke-virtual {v10, v0}, Lo/dvz;->b(Ljava/lang/String;)V

    .line 444
    move-object/from16 v0, v19

    invoke-virtual {v10, v0}, Lo/dvz;->e(Ljava/lang/String;)V

    .line 445
    move-object/from16 v0, v20

    invoke-virtual {v10, v0}, Lo/dvz;->c(Ljava/lang/String;)V

    .line 446
    move-object/from16 v0, v21

    invoke-virtual {v10, v0}, Lo/dvz;->a(Ljava/lang/String;)V

    .line 448
    :cond_5
    goto :goto_6

    .line 449
    :cond_6
    move-object/from16 v0, v18

    invoke-virtual {v10, v0}, Lo/dvz;->b(Ljava/lang/String;)V

    .line 450
    move-object/from16 v0, v19

    invoke-virtual {v10, v0}, Lo/dvz;->e(Ljava/lang/String;)V

    .line 451
    move-object/from16 v0, v20

    invoke-virtual {v10, v0}, Lo/dvz;->c(Ljava/lang/String;)V

    .line 452
    move-object/from16 v0, v21

    invoke-virtual {v10, v0}, Lo/dvz;->a(Ljava/lang/String;)V

    .line 454
    :goto_6
    move/from16 v0, v25

    invoke-virtual {v10, v0}, Lo/dvz;->d(I)V

    .line 455
    move/from16 v0, v24

    invoke-virtual {v10, v0}, Lo/dvz;->c(I)V

    .line 456
    move-object/from16 v0, v23

    invoke-virtual {v10, v0}, Lo/dvz;->h(Ljava/lang/String;)V

    .line 457
    invoke-virtual {v10, v13}, Lo/dvz;->f(Ljava/lang/String;)V

    .line 458
    invoke-virtual {v10, v14}, Lo/dvz;->i(Ljava/lang/String;)V

    .line 459
    invoke-virtual {v10, v12}, Lo/dvz;->g(Ljava/lang/String;)V

    .line 460
    invoke-virtual/range {v17 .. v17}, Lo/dvu;->A()I

    move-result v0

    invoke-virtual {v10, v0}, Lo/dvz;->b(I)V

    .line 461
    goto :goto_7

    .line 417
    :cond_7
    add-int/lit8 v16, v16, 0x1

    goto/16 :goto_4

    .line 464
    :cond_8
    :goto_7
    invoke-static {v12}, Lo/dzs;->i(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_9

    invoke-static {v11}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_9

    move-object/from16 v0, p0

    iget-boolean v0, v0, Lcom/huawei/pluginachievement/ui/AchieveMedalNewActivity;->i:Z

    if-eqz v0, :cond_9

    .line 465
    const-string v0, "PLGACHIEVE_AchieveMedalNewActivity"

    const-string v1, "enter dealActivityMedal"

    invoke-static {v0, v1}, Lo/dzu;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 466
    const/4 v0, 0x0

    move-object/from16 v1, p0

    iput-boolean v0, v1, Lcom/huawei/pluginachievement/ui/AchieveMedalNewActivity;->i:Z

    .line 467
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/pluginachievement/ui/AchieveMedalNewActivity;->d:Lo/dwr;

    invoke-virtual {v0}, Lo/dwr;->u()V

    .line 469
    :cond_9
    invoke-static {v11, v7}, Lo/dzs;->b(Ljava/lang/String;I)Z

    move-result v0

    if-eqz v0, :cond_a

    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/pluginachievement/ui/AchieveMedalNewActivity;->e:Landroid/content/Context;

    move-object/from16 v1, p0

    iget-object v1, v1, Lcom/huawei/pluginachievement/ui/AchieveMedalNewActivity;->n:Ljava/lang/String;

    invoke-static {v12, v9, v0, v1}, Lo/dxc;->e(Ljava/lang/String;Ljava/lang/String;Landroid/content/Context;Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_a

    move-object/from16 v0, p0

    invoke-direct {v0, v15, v9}, Lcom/huawei/pluginachievement/ui/AchieveMedalNewActivity;->d(ILjava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_a

    .line 470
    invoke-virtual {v4, v10}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 398
    :cond_a
    add-int/lit8 v8, v8, 0x1

    goto/16 :goto_1

    .line 473
    :cond_b
    const-string v0, "PLGACHIEVE_AchieveMedalNewActivity"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "medalInfoDesc size = "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v4}, Ljava/util/ArrayList;->size()I

    move-result v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/dzu;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 474
    return-object v4
.end method

.method static synthetic a(Lcom/huawei/pluginachievement/ui/AchieveMedalNewActivity;)Lo/emq;
    .locals 1

    .line 95
    iget-object v0, p0, Lcom/huawei/pluginachievement/ui/AchieveMedalNewActivity;->c:Lo/emq;

    return-object v0
.end method

.method static synthetic a(Lcom/huawei/pluginachievement/ui/AchieveMedalNewActivity;Lcom/huawei/up/model/UserInfomation;)V
    .locals 0

    .line 95
    invoke-direct {p0, p1}, Lcom/huawei/pluginachievement/ui/AchieveMedalNewActivity;->a(Lcom/huawei/up/model/UserInfomation;)V

    return-void
.end method

.method private a(Lcom/huawei/up/model/UserInfomation;)V
    .locals 7

    .line 826
    const/4 v0, 0x0

    if-eq v0, p1, :cond_5

    .line 827
    const-string v0, "PLGACHIEVE_AchieveMedalNewActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "userinfo = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {p1}, Lcom/huawei/up/model/UserInfomation;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 828
    invoke-virtual {p1}, Lcom/huawei/up/model/UserInfomation;->getName()Ljava/lang/String;

    move-result-object v4

    .line 829
    if-eqz v4, :cond_0

    const-string v0, ""

    invoke-virtual {v4, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 830
    :cond_0
    new-instance v5, Lcom/huawei/up/api/UpApi;

    iget-object v0, p0, Lcom/huawei/pluginachievement/ui/AchieveMedalNewActivity;->e:Landroid/content/Context;

    invoke-direct {v5, v0}, Lcom/huawei/up/api/UpApi;-><init>(Landroid/content/Context;)V

    .line 831
    invoke-virtual {v5}, Lcom/huawei/up/api/UpApi;->getAccountName()Ljava/lang/String;

    move-result-object v6

    .line 832
    const/4 v0, 0x0

    if-eq v0, v6, :cond_1

    .line 833
    iget-object v0, p0, Lcom/huawei/pluginachievement/ui/AchieveMedalNewActivity;->x:Landroid/widget/TextView;

    invoke-virtual {v0, v6}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 835
    :cond_1
    goto :goto_0

    .line 836
    :cond_2
    iget-object v0, p0, Lcom/huawei/pluginachievement/ui/AchieveMedalNewActivity;->x:Landroid/widget/TextView;

    invoke-virtual {v0, v4}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 840
    :goto_0
    invoke-virtual {p1}, Lcom/huawei/up/model/UserInfomation;->getPicPath()Ljava/lang/String;

    move-result-object v5

    .line 841
    invoke-static {v5}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_4

    .line 842
    iget-object v0, p0, Lcom/huawei/pluginachievement/ui/AchieveMedalNewActivity;->e:Landroid/content/Context;

    invoke-static {v0, v5}, Lo/dbk;->d(Landroid/content/Context;Ljava/lang/String;)Landroid/graphics/Bitmap;

    move-result-object v6

    .line 843
    if-eqz v6, :cond_3

    .line 845
    iget-object v0, p0, Lcom/huawei/pluginachievement/ui/AchieveMedalNewActivity;->w:Landroid/widget/ImageView;

    invoke-virtual {v0, v6}, Landroid/widget/ImageView;->setImageBitmap(Landroid/graphics/Bitmap;)V

    .line 846
    return-void

    .line 849
    :cond_3
    invoke-direct {p0, p1}, Lcom/huawei/pluginachievement/ui/AchieveMedalNewActivity;->e(Lcom/huawei/up/model/UserInfomation;)V

    .line 852
    const-string v0, "PLGACHIEVE_AchieveMedalNewActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "handleWhenGetUserInfoSuccess() btimap is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 853
    goto :goto_1

    .line 855
    :cond_4
    const-string v0, "PLGACHIEVE_AchieveMedalNewActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "handleWhenGetUserInfoSuccess()! headImgPath is null! "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 857
    iget-object v0, p0, Lcom/huawei/pluginachievement/ui/AchieveMedalNewActivity;->w:Landroid/widget/ImageView;

    sget v1, Lcom/huawei/pluginachievement/R$mipmap;->ic_personal_head:I

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 859
    :goto_1
    goto :goto_2

    .line 860
    :cond_5
    const-string v0, "PLGACHIEVE_AchieveMedalNewActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "handleWhenGetUserInfoSuccess()! userinfo is null! "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 862
    :goto_2
    return-void
.end method

.method private a(Ljava/lang/String;)V
    .locals 6

    .line 201
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/huawei/pluginachievement/ui/AchieveMedalNewActivity;->l:Ljava/util/Map;

    if-nez v0, :cond_1

    .line 202
    :cond_0
    return-void

    .line 204
    :cond_1
    iget-object v0, p0, Lcom/huawei/pluginachievement/ui/AchieveMedalNewActivity;->e:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/pluginachievement/R$string;->IDS_plugin_achievement_tab_medal_all:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_5

    .line 205
    iget-object v0, p0, Lcom/huawei/pluginachievement/ui/AchieveMedalNewActivity;->l:Ljava/util/Map;

    iget-object v1, p0, Lcom/huawei/pluginachievement/ui/AchieveMedalNewActivity;->e:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/pluginachievement/R$string;->IDS_plugin_achievement_tab_have_gained_medals:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    move-object v3, v0

    check-cast v3, Ljava/util/ArrayList;

    .line 206
    if-eqz v3, :cond_4

    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    move-result v0

    const/4 v1, 0x4

    if-lt v0, v1, :cond_4

    .line 207
    invoke-static {}, Lo/czu;->e()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 208
    iget-object v0, p0, Lcom/huawei/pluginachievement/ui/AchieveMedalNewActivity;->k:Lo/emr;

    const/4 v1, 0x4

    invoke-virtual {v0, v1}, Lo/emr;->setRightButtonVisibility(I)V

    goto :goto_0

    .line 210
    :cond_2
    iget-object v0, p0, Lcom/huawei/pluginachievement/ui/AchieveMedalNewActivity;->k:Lo/emr;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lo/emr;->setRightButtonVisibility(I)V

    .line 212
    :goto_0
    iget-object v0, p0, Lcom/huawei/pluginachievement/ui/AchieveMedalNewActivity;->g:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    .line 213
    const/4 v4, 0x0

    :goto_1
    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-ge v4, v0, :cond_3

    .line 214
    new-instance v5, Lo/dvv;

    invoke-virtual {v3, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lo/dvz;

    invoke-virtual {v0}, Lo/dvz;->a()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v3, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lo/dvz;

    invoke-virtual {v1}, Lo/dvz;->b()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v3, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lo/dvz;

    invoke-virtual {v2}, Lo/dvz;->i()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v5, v0, v1, v2}, Lo/dvv;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 215
    iget-object v0, p0, Lcom/huawei/pluginachievement/ui/AchieveMedalNewActivity;->g:Ljava/util/ArrayList;

    invoke-virtual {v0, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 213
    add-int/lit8 v4, v4, 0x1

    goto :goto_1

    :cond_3
    goto :goto_2

    .line 218
    :cond_4
    iget-object v0, p0, Lcom/huawei/pluginachievement/ui/AchieveMedalNewActivity;->k:Lo/emr;

    const/4 v1, 0x4

    invoke-virtual {v0, v1}, Lo/emr;->setRightButtonVisibility(I)V

    .line 220
    :goto_2
    goto :goto_3

    .line 221
    :cond_5
    iget-object v0, p0, Lcom/huawei/pluginachievement/ui/AchieveMedalNewActivity;->k:Lo/emr;

    const/4 v1, 0x4

    invoke-virtual {v0, v1}, Lo/emr;->setRightButtonVisibility(I)V

    .line 223
    :goto_3
    return-void
.end method

.method private b(I)Lcom/huawei/pluginachievement/ui/MyMedalFragment;
    .locals 6

    .line 168
    new-instance v2, Lcom/huawei/pluginachievement/ui/MyMedalFragment;

    invoke-direct {v2}, Lcom/huawei/pluginachievement/ui/MyMedalFragment;-><init>()V

    .line 169
    new-instance v3, Landroid/os/Bundle;

    invoke-direct {v3}, Landroid/os/Bundle;-><init>()V

    .line 170
    const-string v0, "position"

    invoke-virtual {v3, v0, p1}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    .line 171
    const-string v4, ""

    .line 173
    :try_start_0
    iget-object v0, p0, Lcom/huawei/pluginachievement/ui/AchieveMedalNewActivity;->f:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;
    :try_end_0
    .catch Ljava/lang/IndexOutOfBoundsException; {:try_start_0 .. :try_end_0} :catch_0

    move-object v4, v0

    .line 176
    goto :goto_0

    .line 174
    :catch_0
    move-exception v5

    .line 175
    const-string v0, "PLGACHIEVE_AchieveMedalNewActivity"

    const-string v1, "IndexOutOfBoundsException"

    invoke-static {v0, v1}, Lo/dzu;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 177
    :goto_0
    const-string v0, "kind"

    invoke-virtual {v3, v0, v4}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 178
    invoke-virtual {v2, v3}, Lcom/huawei/pluginachievement/ui/MyMedalFragment;->setArguments(Landroid/os/Bundle;)V

    .line 179
    return-object v2
.end method

.method static synthetic b(Lcom/huawei/pluginachievement/ui/AchieveMedalNewActivity;)Lo/dwr;
    .locals 1

    .line 95
    iget-object v0, p0, Lcom/huawei/pluginachievement/ui/AchieveMedalNewActivity;->d:Lo/dwr;

    return-object v0
.end method

.method private b()V
    .locals 5

    .line 235
    const-string v0, "PLGACHIEVE_AchieveMedalNewActivity"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "initView "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget-object v2, p0, Lcom/huawei/pluginachievement/ui/AchieveMedalNewActivity;->f:Ljava/util/List;

    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/dzu;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 236
    sget v0, Lcom/huawei/pluginachievement/R$id;->achieve_medal_scrollable_tablayout:I

    invoke-virtual {p0, v0}, Lcom/huawei/pluginachievement/ui/AchieveMedalNewActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lo/emq;

    iput-object v0, p0, Lcom/huawei/pluginachievement/ui/AchieveMedalNewActivity;->c:Lo/emq;

    .line 237
    sget v0, Lcom/huawei/pluginachievement/R$id;->my_medeal_viewpager:I

    invoke-virtual {p0, v0}, Lcom/huawei/pluginachievement/ui/AchieveMedalNewActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/support/v4/view/ViewPager;

    iput-object v0, p0, Lcom/huawei/pluginachievement/ui/AchieveMedalNewActivity;->a:Landroid/support/v4/view/ViewPager;

    .line 238
    new-instance v0, Lo/emm;

    iget-object v1, p0, Lcom/huawei/pluginachievement/ui/AchieveMedalNewActivity;->a:Landroid/support/v4/view/ViewPager;

    iget-object v2, p0, Lcom/huawei/pluginachievement/ui/AchieveMedalNewActivity;->c:Lo/emq;

    invoke-direct {v0, p0, v1, v2}, Lo/emm;-><init>(Landroid/support/v4/app/FragmentActivity;Landroid/support/v4/view/ViewPager;Lo/emq;)V

    iput-object v0, p0, Lcom/huawei/pluginachievement/ui/AchieveMedalNewActivity;->b:Lo/emm;

    .line 239
    iget-object v0, p0, Lcom/huawei/pluginachievement/ui/AchieveMedalNewActivity;->f:Ljava/util/List;

    const/4 v1, 0x0

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    invoke-direct {p0, v0}, Lcom/huawei/pluginachievement/ui/AchieveMedalNewActivity;->c(Ljava/lang/String;)V

    .line 241
    const/4 v3, 0x0

    :goto_0
    iget-object v0, p0, Lcom/huawei/pluginachievement/ui/AchieveMedalNewActivity;->f:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-ge v3, v0, :cond_1

    .line 242
    iget-object v0, p0, Lcom/huawei/pluginachievement/ui/AchieveMedalNewActivity;->c:Lo/emq;

    iget-object v1, p0, Lcom/huawei/pluginachievement/ui/AchieveMedalNewActivity;->f:Ljava/util/List;

    invoke-interface {v1, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/CharSequence;

    invoke-virtual {v0, v1}, Lo/emq;->newSubTab(Ljava/lang/CharSequence;)Lhuawei/widget/HwSubTabWidget$SubTab;

    move-result-object v4

    .line 243
    const/4 v0, 0x0

    if-ne v0, v3, :cond_0

    .line 244
    iget-object v0, p0, Lcom/huawei/pluginachievement/ui/AchieveMedalNewActivity;->b:Lo/emm;

    invoke-direct {p0, v3}, Lcom/huawei/pluginachievement/ui/AchieveMedalNewActivity;->b(I)Lcom/huawei/pluginachievement/ui/MyMedalFragment;

    move-result-object v1

    const/4 v2, 0x1

    invoke-virtual {v0, v4, v1, v2}, Lo/emm;->b(Lhuawei/widget/HwSubTabWidget$SubTab;Landroid/support/v4/app/Fragment;Z)V

    goto :goto_1

    .line 246
    :cond_0
    iget-object v0, p0, Lcom/huawei/pluginachievement/ui/AchieveMedalNewActivity;->b:Lo/emm;

    invoke-direct {p0, v3}, Lcom/huawei/pluginachievement/ui/AchieveMedalNewActivity;->b(I)Lcom/huawei/pluginachievement/ui/MyMedalFragment;

    move-result-object v1

    const/4 v2, 0x0

    invoke-virtual {v0, v4, v1, v2}, Lo/emm;->b(Lhuawei/widget/HwSubTabWidget$SubTab;Landroid/support/v4/app/Fragment;Z)V

    .line 241
    :goto_1
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    .line 250
    :cond_1
    iget-object v0, p0, Lcom/huawei/pluginachievement/ui/AchieveMedalNewActivity;->a:Landroid/support/v4/view/ViewPager;

    new-instance v1, Lcom/huawei/pluginachievement/ui/AchieveMedalNewActivity$1;

    invoke-direct {v1, p0}, Lcom/huawei/pluginachievement/ui/AchieveMedalNewActivity$1;-><init>(Lcom/huawei/pluginachievement/ui/AchieveMedalNewActivity;)V

    invoke-virtual {v0, v1}, Landroid/support/v4/view/ViewPager;->setOnPageChangeListener(Landroid/support/v4/view/ViewPager$OnPageChangeListener;)V

    .line 270
    return-void
.end method

.method static synthetic b(Lcom/huawei/pluginachievement/ui/AchieveMedalNewActivity;Ljava/lang/String;)V
    .locals 0

    .line 95
    invoke-direct {p0, p1}, Lcom/huawei/pluginachievement/ui/AchieveMedalNewActivity;->a(Ljava/lang/String;)V

    return-void
.end method

.method private b(Ljava/lang/String;)V
    .locals 10

    .line 562
    const-string v0, "PLGACHIEVE_AchieveMedalNewActivity"

    const-string v1, "changeOneData enter"

    invoke-static {v0, v1}, Lo/dzu;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 563
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/huawei/pluginachievement/ui/AchieveMedalNewActivity;->l:Ljava/util/Map;

    if-nez v0, :cond_0

    .line 564
    return-void

    .line 566
    :cond_0
    const-string v0, "PLGACHIEVE_AchieveMedalNewActivity"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "changeOneData medalId ="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/dzu;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 567
    const/4 v3, 0x0

    .line 568
    iget-object v0, p0, Lcom/huawei/pluginachievement/ui/AchieveMedalNewActivity;->l:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v4

    .line 569
    :goto_0
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_4

    .line 570
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v5, v0

    check-cast v5, Ljava/util/Map$Entry;

    .line 571
    invoke-interface {v5}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v0

    move-object v6, v0

    check-cast v6, Ljava/lang/String;

    .line 572
    invoke-interface {v5}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v0

    move-object v7, v0

    check-cast v7, Ljava/util/ArrayList;

    .line 573
    const/4 v8, 0x0

    :goto_1
    invoke-virtual {v7}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-ge v8, v0, :cond_2

    .line 574
    invoke-virtual {v7, v8}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v9, v0

    check-cast v9, Lo/dvz;

    .line 575
    invoke-virtual {v9}, Lo/dvz;->a()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 576
    const-string v0, "PLGACHIEVE_AchieveMedalNewActivity"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "changeOneData second_tab ="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, " medalId="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/dzu;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 577
    const/4 v0, 0x0

    invoke-virtual {v9, v0}, Lo/dvz;->d(I)V

    .line 578
    invoke-virtual {v7, v8, v9}, Ljava/util/ArrayList;->set(ILjava/lang/Object;)Ljava/lang/Object;

    .line 579
    iget-object v0, p0, Lcom/huawei/pluginachievement/ui/AchieveMedalNewActivity;->l:Ljava/util/Map;

    invoke-interface {v0, v6, v7}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 580
    add-int/lit8 v3, v3, 0x1

    .line 581
    goto :goto_2

    .line 573
    :cond_1
    add-int/lit8 v8, v8, 0x1

    goto :goto_1

    .line 584
    :cond_2
    :goto_2
    const/4 v0, 0x2

    if-lt v3, v0, :cond_3

    .line 585
    goto :goto_3

    .line 587
    :cond_3
    goto/16 :goto_0

    .line 588
    :cond_4
    :goto_3
    return-void
.end method

.method static synthetic c(Lcom/huawei/pluginachievement/ui/AchieveMedalNewActivity;)V
    .locals 0

    .line 95
    invoke-direct {p0}, Lcom/huawei/pluginachievement/ui/AchieveMedalNewActivity;->k()V

    return-void
.end method

.method static synthetic c(Lcom/huawei/pluginachievement/ui/AchieveMedalNewActivity;Lo/dza;Ljava/util/List;Ljava/util/List;)V
    .locals 0

    .line 95
    invoke-direct {p0, p1, p2, p3}, Lcom/huawei/pluginachievement/ui/AchieveMedalNewActivity;->e(Lo/dza;Ljava/util/List;Ljava/util/List;)V

    return-void
.end method

.method private c(Ljava/lang/String;)V
    .locals 0

    .line 230
    invoke-direct {p0, p1}, Lcom/huawei/pluginachievement/ui/AchieveMedalNewActivity;->a(Ljava/lang/String;)V

    .line 231
    invoke-direct {p0}, Lcom/huawei/pluginachievement/ui/AchieveMedalNewActivity;->h()V

    .line 232
    return-void
.end method

.method static synthetic d(Lcom/huawei/pluginachievement/ui/AchieveMedalNewActivity;Lcom/huawei/hihealth/HiUserInfo;)Lcom/huawei/hihealth/HiUserInfo;
    .locals 0

    .line 95
    iput-object p1, p0, Lcom/huawei/pluginachievement/ui/AchieveMedalNewActivity;->v:Lcom/huawei/hihealth/HiUserInfo;

    return-object p1
.end method

.method private d(Ljava/lang/String;)Ljava/lang/String;
    .locals 9

    .line 896
    if-eqz p1, :cond_0

    invoke-virtual {p1}, Ljava/lang/String;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 897
    :cond_0
    const-string v0, ""

    return-object v0

    .line 899
    :cond_1
    const-string v0, "/"

    invoke-virtual {p1, v0}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v4

    .line 900
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v1, p0, Lcom/huawei/pluginachievement/ui/AchieveMedalNewActivity;->e:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getFilesDir()Ljava/io/File;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "/photos/headimage/"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    array-length v1, v4

    add-int/lit8 v1, v1, -0x1

    aget-object v1, v4, v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    .line 901
    new-instance v6, Ljava/io/File;

    invoke-direct {v6, v5}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 902
    invoke-virtual {v6}, Ljava/io/File;->exists()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 903
    const-string v0, "PLGACHIEVE_AchieveMedalNewActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "accountmigrate: getHeadImageFromLocal file.exists() yes"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    goto/16 :goto_1

    .line 905
    :cond_2
    const-string v0, "PLGACHIEVE_AchieveMedalNewActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "accountmigrate: getHeadImageFromLocal file.exists() no"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 906
    new-instance v0, Ljava/io/File;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v2, p0, Lcom/huawei/pluginachievement/ui/AchieveMedalNewActivity;->e:Landroid/content/Context;

    invoke-virtual {v2}, Landroid/content/Context;->getFilesDir()Ljava/io/File;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, "/photos/headimage"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0}, Ljava/io/File;->listFiles()[Ljava/io/File;

    move-result-object v7

    .line 907
    if-eqz v7, :cond_4

    array-length v0, v7

    if-lez v0, :cond_4

    .line 908
    const/4 v8, 0x0

    :goto_0
    array-length v0, v7

    if-ge v8, v0, :cond_3

    .line 909
    const-string v0, "PLGACHIEVE_AchieveMedalNewActivity"

    const/4 v1, 0x4

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "accountmigrate: getHeadImageFromLocal files: "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    const-string v2, " = "

    const/4 v3, 0x2

    aput-object v2, v1, v3

    aget-object v2, v7, v8

    invoke-virtual {v2}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x3

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 908
    add-int/lit8 v8, v8, 0x1

    goto :goto_0

    .line 911
    :cond_3
    array-length v0, v7

    add-int/lit8 v0, v0, -0x1

    aget-object v0, v7, v0

    invoke-virtual {v0}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v5

    .line 912
    if-nez v5, :cond_4

    .line 913
    const-string v0, ""

    return-object v0

    .line 918
    :cond_4
    :goto_1
    const-string v0, "PLGACHIEVE_AchieveMedalNewActivity"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "accountmigrate: getHeadImageFromLocal localpath = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object v5, v1, v2

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 919
    return-object v5
.end method

.method static synthetic d(Lcom/huawei/pluginachievement/ui/AchieveMedalNewActivity;)V
    .locals 0

    .line 95
    invoke-direct {p0}, Lcom/huawei/pluginachievement/ui/AchieveMedalNewActivity;->b()V

    return-void
.end method

.method private d(ILjava/lang/String;)Z
    .locals 3

    .line 489
    const/4 v0, 0x3

    if-lt p1, v0, :cond_1

    .line 490
    const-string v0, "PLGACHIEVE_AchieveMedalNewActivity"

    const-string v1, "Medal Is ExceptionStatus"

    invoke-static {v0, v1}, Lo/dzu;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 491
    new-instance v2, Lo/dvu;

    invoke-direct {v2}, Lo/dvu;-><init>()V

    .line 492
    invoke-virtual {v2, p2}, Lo/dvu;->b(Ljava/lang/String;)V

    .line 493
    const/4 v0, 0x0

    invoke-virtual {v2, v0}, Lo/dvu;->c(I)V

    .line 494
    const/4 v0, 0x0

    invoke-virtual {v2, v0}, Lo/dvu;->h(I)V

    .line 495
    iget-object v0, p0, Lcom/huawei/pluginachievement/ui/AchieveMedalNewActivity;->d:Lo/dwr;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 496
    iget-object v0, p0, Lcom/huawei/pluginachievement/ui/AchieveMedalNewActivity;->d:Lo/dwr;

    invoke-virtual {v0, v2}, Lo/dwr;->d(Lo/dvf;)Z

    goto :goto_0

    .line 498
    :cond_0
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lo/dwr;->b(Landroid/content/Context;)Lo/dwr;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/pluginachievement/ui/AchieveMedalNewActivity;->d:Lo/dwr;

    .line 499
    iget-object v0, p0, Lcom/huawei/pluginachievement/ui/AchieveMedalNewActivity;->d:Lo/dwr;

    invoke-virtual {v0, v2}, Lo/dwr;->d(Lo/dvf;)Z

    .line 501
    :goto_0
    iget-object v0, p0, Lcom/huawei/pluginachievement/ui/AchieveMedalNewActivity;->e:Landroid/content/Context;

    invoke-static {p2, v0}, Lo/dxc;->b(Ljava/lang/String;Landroid/content/Context;)V

    .line 502
    const/4 v0, 0x0

    return v0

    .line 504
    :cond_1
    const/4 v0, 0x1

    return v0
.end method

.method private d(Lo/dvz;Lo/dvx;)Z
    .locals 1

    .line 479
    const/4 v0, 0x0

    if-eq v0, p2, :cond_0

    .line 480
    invoke-virtual {p2}, Lo/dvx;->c()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Lo/dvz;->b(Ljava/lang/String;)V

    .line 481
    invoke-virtual {p2}, Lo/dvx;->a()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Lo/dvz;->e(Ljava/lang/String;)V

    .line 482
    invoke-virtual {p2}, Lo/dvx;->a()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Lo/dvz;->c(Ljava/lang/String;)V

    .line 483
    const/4 v0, 0x1

    return v0

    .line 485
    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method static synthetic e(Lcom/huawei/pluginachievement/ui/AchieveMedalNewActivity;)Ljava/util/List;
    .locals 1

    .line 95
    iget-object v0, p0, Lcom/huawei/pluginachievement/ui/AchieveMedalNewActivity;->f:Ljava/util/List;

    return-object v0
.end method

.method private e(ILjava/lang/Object;)V
    .locals 2

    .line 283
    invoke-static {}, Landroid/os/Message;->obtain()Landroid/os/Message;

    move-result-object v1

    .line 284
    iput p1, v1, Landroid/os/Message;->what:I

    .line 285
    iput-object p2, v1, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 286
    iget-object v0, p0, Lcom/huawei/pluginachievement/ui/AchieveMedalNewActivity;->p:Landroid/os/Handler;

    invoke-virtual {v0, v1}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    .line 287
    return-void
.end method

.method private e(Lcom/huawei/up/model/UserInfomation;)V
    .locals 5

    .line 888
    invoke-virtual {p1}, Lcom/huawei/up/model/UserInfomation;->getPortraitUrl()Ljava/lang/String;

    move-result-object v4

    .line 889
    const/4 v0, 0x0

    if-ne v0, v4, :cond_0

    .line 890
    const-string v0, "PLGACHIEVE_AchieveMedalNewActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "it\'s so terrible, as missing the headImage url, we can do nothing!"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 891
    return-void

    .line 893
    :cond_0
    return-void
.end method

.method private e(Lo/dza;Ljava/util/List;Ljava/util/List;)V
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Lo/dza;Ljava/util/List<Lo/dvy;>;Ljava/util/List<Lo/dvu;>;)V"
        }
    .end annotation

    .line 358
    invoke-virtual {p1}, Lo/dza;->b()Ljava/util/List;

    move-result-object v3

    .line 359
    invoke-virtual {p1}, Lo/dza;->c()Ljava/util/Map;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/pluginachievement/ui/AchieveMedalNewActivity;->h:Ljava/util/Map;

    .line 360
    new-instance v4, Ljava/util/ArrayList;

    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    .line 361
    iget-object v0, p0, Lcom/huawei/pluginachievement/ui/AchieveMedalNewActivity;->e:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/pluginachievement/R$string;->IDS_plugin_achievement_tab_have_gained_medals:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v4, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 362
    iget-object v0, p0, Lcom/huawei/pluginachievement/ui/AchieveMedalNewActivity;->e:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/pluginachievement/R$string;->IDS_plugin_achievement_tab_not_gained_medals:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v4, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 363
    iget-object v0, p0, Lcom/huawei/pluginachievement/ui/AchieveMedalNewActivity;->h:Ljava/util/Map;

    iget-object v1, p0, Lcom/huawei/pluginachievement/ui/AchieveMedalNewActivity;->e:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/pluginachievement/R$string;->IDS_plugin_achievement_tab_medal_all:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v1, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 364
    const-string v0, "PLGACHIEVE_AchieveMedalNewActivity"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "getData() firstTabRelationShip="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget-object v2, p0, Lcom/huawei/pluginachievement/ui/AchieveMedalNewActivity;->h:Ljava/util/Map;

    invoke-virtual {v2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/dzu;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 365
    invoke-virtual {p1}, Lo/dza;->e()Ljava/util/Map;

    move-result-object v5

    .line 366
    const/4 v0, 0x0

    if-eq v0, v5, :cond_0

    .line 367
    invoke-interface {v5}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v6

    .line 368
    :goto_0
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 369
    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v7, v0

    check-cast v7, Ljava/util/Map$Entry;

    .line 370
    invoke-interface {v7}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v0

    move-object v8, v0

    check-cast v8, Ljava/util/ArrayList;

    .line 371
    iget-object v0, p0, Lcom/huawei/pluginachievement/ui/AchieveMedalNewActivity;->l:Ljava/util/Map;

    invoke-interface {v7}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v1

    invoke-direct {p0, p2, v8, p3}, Lcom/huawei/pluginachievement/ui/AchieveMedalNewActivity;->a(Ljava/util/List;Ljava/util/ArrayList;Ljava/util/List;)Ljava/util/ArrayList;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 372
    goto :goto_0

    .line 375
    :cond_0
    const/4 v0, 0x0

    if-eq v0, v3, :cond_2

    .line 376
    invoke-static {}, Lo/czu;->e()Z

    move-result v0

    if-nez v0, :cond_1

    .line 377
    const/4 v6, 0x0

    :goto_1
    invoke-interface {v3}, Ljava/util/List;->size()I

    move-result v0

    if-ge v6, v0, :cond_1

    .line 378
    iget-object v0, p0, Lcom/huawei/pluginachievement/ui/AchieveMedalNewActivity;->f:Ljava/util/List;

    invoke-interface {v3, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 379
    const-string v0, "PLGACHIEVE_AchieveMedalNewActivity"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "getData() tab_new_list="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget-object v2, p0, Lcom/huawei/pluginachievement/ui/AchieveMedalNewActivity;->f:Ljava/util/List;

    invoke-virtual {v2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/dzu;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 377
    add-int/lit8 v6, v6, 0x1

    goto :goto_1

    .line 382
    :cond_1
    const/4 v0, 0x1

    invoke-direct {p0, v0, p1}, Lcom/huawei/pluginachievement/ui/AchieveMedalNewActivity;->e(ILjava/lang/Object;)V

    .line 385
    :cond_2
    return-void
.end method

.method static synthetic f(Lcom/huawei/pluginachievement/ui/AchieveMedalNewActivity;)Ljava/util/Map;
    .locals 1

    .line 95
    iget-object v0, p0, Lcom/huawei/pluginachievement/ui/AchieveMedalNewActivity;->l:Ljava/util/Map;

    return-object v0
.end method

.method private f()V
    .locals 3

    .line 275
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/huawei/pluginachievement/ui/AchieveMedalNewActivity;->f:Ljava/util/List;

    .line 276
    iget-object v0, p0, Lcom/huawei/pluginachievement/ui/AchieveMedalNewActivity;->f:Ljava/util/List;

    iget-object v1, p0, Lcom/huawei/pluginachievement/ui/AchieveMedalNewActivity;->e:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/pluginachievement/R$string;->IDS_plugin_achievement_tab_medal_all:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 277
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lcom/huawei/pluginachievement/ui/AchieveMedalNewActivity;->h:Ljava/util/Map;

    .line 278
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lcom/huawei/pluginachievement/ui/AchieveMedalNewActivity;->l:Ljava/util/Map;

    .line 280
    return-void
.end method

.method static synthetic g(Lcom/huawei/pluginachievement/ui/AchieveMedalNewActivity;)Landroid/content/Context;
    .locals 1

    .line 95
    iget-object v0, p0, Lcom/huawei/pluginachievement/ui/AchieveMedalNewActivity;->e:Landroid/content/Context;

    return-object v0
.end method

.method private g()V
    .locals 17

    .line 671
    const-string v0, "PLGACHIEVE_AchieveMedalNewActivity"

    const-string v1, "enter share"

    invoke-static {v0, v1}, Lo/dzu;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 672
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/pluginachievement/ui/AchieveMedalNewActivity;->e:Landroid/content/Context;

    invoke-static {v0}, Lo/dtm;->e(Landroid/content/Context;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 673
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/pluginachievement/ui/AchieveMedalNewActivity;->e:Landroid/content/Context;

    invoke-static {v0}, Lo/dzr;->b(Landroid/content/Context;)V

    .line 674
    return-void

    .line 676
    :cond_0
    invoke-static/range {p0 .. p0}, Lo/dth;->b(Landroid/content/Context;)Lo/dth;

    move-result-object v11

    .line 677
    invoke-virtual {v11}, Lo/dth;->d()Lo/dti;

    move-result-object v12

    .line 678
    const/4 v0, 0x0

    if-eq v0, v12, :cond_5

    .line 679
    new-instance v13, Ljava/util/HashMap;

    invoke-direct {v13}, Ljava/util/HashMap;-><init>()V

    .line 680
    invoke-static {}, Lo/czu;->e()Z

    move-result v0

    if-nez v0, :cond_1

    .line 681
    const-string v0, "name"

    move-object/from16 v1, p0

    iget-object v1, v1, Lcom/huawei/pluginachievement/ui/AchieveMedalNewActivity;->z:Ljava/lang/String;

    invoke-interface {v13, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 682
    const-string v0, "className"

    move-object/from16 v1, p0

    iget-object v1, v1, Lcom/huawei/pluginachievement/ui/AchieveMedalNewActivity;->y:Ljava/lang/String;

    invoke-interface {v13, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 684
    :cond_1
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/pluginachievement/ui/AchieveMedalNewActivity;->q:Landroid/widget/LinearLayout;

    move-object/from16 v1, p0

    iget-object v1, v1, Lcom/huawei/pluginachievement/ui/AchieveMedalNewActivity;->t:Landroid/widget/ScrollView;

    move-object/from16 v2, p0

    iget-object v2, v2, Lcom/huawei/pluginachievement/ui/AchieveMedalNewActivity;->r:Landroid/widget/LinearLayout;

    invoke-static {v0, v1, v2}, Lo/dxh;->b(Landroid/view/View;Landroid/widget/ScrollView;Landroid/view/View;)Landroid/graphics/Bitmap;

    move-result-object v14

    .line 685
    const/4 v0, 0x0

    if-eq v0, v14, :cond_3

    .line 686
    invoke-static {v14}, Lo/dxh;->a(Landroid/graphics/Bitmap;)I

    move-result v15

    .line 687
    const-string v0, "PLGACHIEVE_AchieveMedalNewActivity"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "initview all medal share bitmap size ="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v15}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/dzu;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 688
    div-int/lit16 v0, v15, 0x400

    div-int/lit16 v0, v0, 0x400

    const/4 v1, 0x1

    if-lt v0, v1, :cond_2

    .line 689
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/pluginachievement/ui/AchieveMedalNewActivity;->e:Landroid/content/Context;

    invoke-static {v0, v14}, Lo/dxh;->c(Landroid/content/Context;Landroid/graphics/Bitmap;)Ljava/lang/String;

    move-result-object v16

    .line 690
    move-object v0, v12

    move-object/from16 v1, p0

    move-object/from16 v5, v16

    sget-object v2, Lo/dae;->W:Lo/dae;

    invoke-virtual {v2}, Lo/dae;->b()Ljava/lang/String;

    move-result-object v9

    move-object v10, v13

    const/4 v2, 0x4

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    invoke-interface/range {v0 .. v10}, Lo/dti;->e(Landroid/content/Context;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLcom/huawei/hwbasemgr/IBaseResponseCallback;Ljava/lang/String;Ljava/util/Map;)V

    .line 691
    goto :goto_0

    .line 692
    :cond_2
    move-object v0, v12

    move-object/from16 v1, p0

    move-object v5, v14

    sget-object v2, Lo/dae;->W:Lo/dae;

    invoke-virtual {v2}, Lo/dae;->b()Ljava/lang/String;

    move-result-object v9

    move-object v10, v13

    const/4 v2, 0x1

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    invoke-interface/range {v0 .. v10}, Lo/dti;->a(Landroid/content/Context;ILjava/lang/String;Ljava/lang/String;Landroid/graphics/Bitmap;Ljava/lang/String;ZLcom/huawei/hwbasemgr/IBaseResponseCallback;Ljava/lang/String;Ljava/util/Map;)V

    .line 694
    :goto_0
    goto :goto_1

    .line 695
    :cond_3
    const-string v0, "PLGACHIEVE_AchieveMedalNewActivity"

    const-string v1, "screenCut is null"

    invoke-static {v0, v1}, Lo/dzu;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 697
    :goto_1
    invoke-static {}, Lo/dth;->l()Z

    move-result v0

    if-eqz v0, :cond_4

    .line 698
    invoke-static {}, Lo/cxf;->e()Lo/cxf;

    move-result-object v15

    .line 699
    new-instance v16, Ljava/util/HashMap;

    invoke-direct/range {v16 .. v16}, Ljava/util/HashMap;-><init>()V

    .line 700
    const-string v0, "type"

    const/16 v1, 0xb

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    move-object/from16 v2, v16

    invoke-interface {v2, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 701
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/pluginachievement/ui/AchieveMedalNewActivity;->e:Landroid/content/Context;

    sget-object v1, Lo/dae;->W:Lo/dae;

    invoke-virtual {v1}, Lo/dae;->b()Ljava/lang/String;

    move-result-object v1

    move-object/from16 v2, v16

    const/4 v3, 0x0

    invoke-virtual {v15, v0, v1, v2, v3}, Lo/cxf;->a(Landroid/content/Context;Ljava/lang/String;Ljava/util/Map;I)I

    .line 703
    :cond_4
    goto :goto_2

    .line 704
    :cond_5
    const-string v0, "PLGACHIEVE_AchieveMedalNewActivity"

    const-string v1, "adapter is null"

    invoke-static {v0, v1}, Lo/dzu;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 706
    :goto_2
    return-void
.end method

.method static synthetic h(Lcom/huawei/pluginachievement/ui/AchieveMedalNewActivity;)Landroid/os/Handler;
    .locals 1

    .line 95
    iget-object v0, p0, Lcom/huawei/pluginachievement/ui/AchieveMedalNewActivity;->B:Landroid/os/Handler;

    return-object v0
.end method

.method private h()V
    .locals 6

    .line 636
    const-string v0, "PLGACHIEVE_AchieveMedalNewActivity"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "medalAllShareInfoDescs size ="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget-object v2, p0, Lcom/huawei/pluginachievement/ui/AchieveMedalNewActivity;->g:Ljava/util/ArrayList;

    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    move-result v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/dzu;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 637
    new-instance v3, Lo/dxz;

    iget-object v0, p0, Lcom/huawei/pluginachievement/ui/AchieveMedalNewActivity;->e:Landroid/content/Context;

    iget-object v1, p0, Lcom/huawei/pluginachievement/ui/AchieveMedalNewActivity;->g:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v1

    invoke-direct {v3, v0, v1}, Lo/dxz;-><init>(Landroid/content/Context;I)V

    .line 638
    invoke-virtual {v3}, Lo/dxz;->a()I

    move-result v4

    .line 639
    new-instance v5, Landroid/support/v7/widget/GridLayoutManager;

    const/4 v0, 0x1

    const/4 v1, 0x0

    invoke-direct {v5, p0, v4, v0, v1}, Landroid/support/v7/widget/GridLayoutManager;-><init>(Landroid/content/Context;IIZ)V

    .line 640
    new-instance v0, Lo/dxx;

    iget-object v1, p0, Lcom/huawei/pluginachievement/ui/AchieveMedalNewActivity;->g:Ljava/util/ArrayList;

    invoke-direct {v0, p0, v1}, Lo/dxx;-><init>(Landroid/content/Context;Ljava/util/ArrayList;)V

    iput-object v0, p0, Lcom/huawei/pluginachievement/ui/AchieveMedalNewActivity;->u:Lo/dxx;

    .line 642
    sget v0, Lcom/huawei/pluginachievement/R$id;->medal_all_rv:I

    invoke-virtual {p0, v0}, Lcom/huawei/pluginachievement/ui/AchieveMedalNewActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/support/v7/widget/RecyclerView;

    iput-object v0, p0, Lcom/huawei/pluginachievement/ui/AchieveMedalNewActivity;->s:Landroid/support/v7/widget/RecyclerView;

    .line 643
    iget-object v0, p0, Lcom/huawei/pluginachievement/ui/AchieveMedalNewActivity;->s:Landroid/support/v7/widget/RecyclerView;

    invoke-virtual {v0, v5}, Landroid/support/v7/widget/RecyclerView;->setLayoutManager(Landroid/support/v7/widget/RecyclerView$LayoutManager;)V

    .line 644
    iget-object v0, p0, Lcom/huawei/pluginachievement/ui/AchieveMedalNewActivity;->s:Landroid/support/v7/widget/RecyclerView;

    invoke-virtual {v0, v3}, Landroid/support/v7/widget/RecyclerView;->addItemDecoration(Landroid/support/v7/widget/RecyclerView$ItemDecoration;)V

    .line 645
    iget-object v0, p0, Lcom/huawei/pluginachievement/ui/AchieveMedalNewActivity;->s:Landroid/support/v7/widget/RecyclerView;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/support/v7/widget/RecyclerView;->setHasFixedSize(Z)V

    .line 646
    iget-object v0, p0, Lcom/huawei/pluginachievement/ui/AchieveMedalNewActivity;->s:Landroid/support/v7/widget/RecyclerView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/support/v7/widget/RecyclerView;->setNestedScrollingEnabled(Z)V

    .line 647
    iget-object v0, p0, Lcom/huawei/pluginachievement/ui/AchieveMedalNewActivity;->s:Landroid/support/v7/widget/RecyclerView;

    iget-object v1, p0, Lcom/huawei/pluginachievement/ui/AchieveMedalNewActivity;->u:Lo/dxx;

    invoke-virtual {v0, v1}, Landroid/support/v7/widget/RecyclerView;->setAdapter(Landroid/support/v7/widget/RecyclerView$Adapter;)V

    .line 648
    return-void
.end method

.method static synthetic i(Lcom/huawei/pluginachievement/ui/AchieveMedalNewActivity;)Lcom/huawei/hihealth/HiUserInfo;
    .locals 1

    .line 95
    iget-object v0, p0, Lcom/huawei/pluginachievement/ui/AchieveMedalNewActivity;->v:Lcom/huawei/hihealth/HiUserInfo;

    return-object v0
.end method

.method private i()V
    .locals 2

    .line 292
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lo/dwr;->b(Landroid/content/Context;)Lo/dwr;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/pluginachievement/ui/AchieveMedalNewActivity;->d:Lo/dwr;

    .line 293
    const-string v0, "PLGACHIEVE_AchieveMedalNewActivity"

    const-string v1, "getData()"

    invoke-static {v0, v1}, Lo/dzu;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 294
    sget-object v0, Lcom/huawei/pluginachievement/ui/AchieveMedalNewActivity;->m:Ljava/util/concurrent/ExecutorService;

    new-instance v1, Lcom/huawei/pluginachievement/ui/AchieveMedalNewActivity$2;

    invoke-direct {v1, p0}, Lcom/huawei/pluginachievement/ui/AchieveMedalNewActivity$2;-><init>(Lcom/huawei/pluginachievement/ui/AchieveMedalNewActivity;)V

    invoke-interface {v0, v1}, Ljava/util/concurrent/ExecutorService;->execute(Ljava/lang/Runnable;)V

    .line 355
    return-void
.end method

.method private k()V
    .locals 3

    .line 615
    iget-object v0, p0, Lcom/huawei/pluginachievement/ui/AchieveMedalNewActivity;->e:Landroid/content/Context;

    sget-object v1, Lo/dbr$b;->c:Lo/dbr$b;

    new-instance v2, Lcom/huawei/pluginachievement/ui/AchieveMedalNewActivity$8;

    invoke-direct {v2, p0}, Lcom/huawei/pluginachievement/ui/AchieveMedalNewActivity$8;-><init>(Lcom/huawei/pluginachievement/ui/AchieveMedalNewActivity;)V

    invoke-static {v0, v1, v2}, Lo/dbr;->e(Landroid/content/Context;Lo/dbr$b;Lo/dbs;)V

    .line 632
    return-void
.end method

.method static synthetic k(Lcom/huawei/pluginachievement/ui/AchieveMedalNewActivity;)V
    .locals 0

    .line 95
    invoke-direct {p0}, Lcom/huawei/pluginachievement/ui/AchieveMedalNewActivity;->g()V

    return-void
.end method

.method private m()V
    .locals 7

    .line 865
    iget-object v0, p0, Lcom/huawei/pluginachievement/ui/AchieveMedalNewActivity;->v:Lcom/huawei/hihealth/HiUserInfo;

    if-nez v0, :cond_0

    .line 866
    const-string v0, "PLGACHIEVE_AchieveMedalNewActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "accountmigrate: setUserNameFromLocal mHiUserInfo == null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 867
    return-void

    .line 869
    :cond_0
    iget-object v0, p0, Lcom/huawei/pluginachievement/ui/AchieveMedalNewActivity;->x:Landroid/widget/TextView;

    iget-object v1, p0, Lcom/huawei/pluginachievement/ui/AchieveMedalNewActivity;->v:Lcom/huawei/hihealth/HiUserInfo;

    invoke-virtual {v1}, Lcom/huawei/hihealth/HiUserInfo;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 871
    iget-object v0, p0, Lcom/huawei/pluginachievement/ui/AchieveMedalNewActivity;->v:Lcom/huawei/hihealth/HiUserInfo;

    invoke-virtual {v0}, Lcom/huawei/hihealth/HiUserInfo;->getHeadImgUrl()Ljava/lang/String;

    move-result-object v4

    .line 872
    const-string v0, "PLGACHIEVE_AchieveMedalNewActivity"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "accountmigrate: headImgPath = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object v4, v1, v2

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 873
    const-string v0, "PLGACHIEVE_AchieveMedalNewActivity"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "accountfilepath = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v3, p0, Lcom/huawei/pluginachievement/ui/AchieveMedalNewActivity;->e:Landroid/content/Context;

    invoke-virtual {v3}, Landroid/content/Context;->getFilesDir()Ljava/io/File;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "/photos/headimage"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 874
    invoke-direct {p0, v4}, Lcom/huawei/pluginachievement/ui/AchieveMedalNewActivity;->d(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    .line 875
    invoke-static {v5}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_2

    .line 876
    iget-object v0, p0, Lcom/huawei/pluginachievement/ui/AchieveMedalNewActivity;->e:Landroid/content/Context;

    invoke-static {v0, v5}, Lo/dbk;->d(Landroid/content/Context;Ljava/lang/String;)Landroid/graphics/Bitmap;

    move-result-object v6

    .line 877
    const-string v0, "PLGACHIEVE_AchieveMedalNewActivity"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "accountmigrate: setUserNameFromLocal headImgPath = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object v5, v1, v2

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 878
    if-eqz v6, :cond_1

    .line 879
    iget-object v0, p0, Lcom/huawei/pluginachievement/ui/AchieveMedalNewActivity;->w:Landroid/widget/ImageView;

    invoke-virtual {v0, v6}, Landroid/widget/ImageView;->setImageBitmap(Landroid/graphics/Bitmap;)V

    .line 881
    :cond_1
    goto :goto_0

    .line 882
    :cond_2
    iget-object v0, p0, Lcom/huawei/pluginachievement/ui/AchieveMedalNewActivity;->w:Landroid/widget/ImageView;

    sget v1, Lcom/huawei/pluginachievement/R$mipmap;->ic_personal_head:I

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 883
    const-string v0, "PLGACHIEVE_AchieveMedalNewActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "accountmigrate: setUserNameFromLocal() headImgPath is null! "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 885
    :goto_0
    return-void
.end method

.method static synthetic m(Lcom/huawei/pluginachievement/ui/AchieveMedalNewActivity;)V
    .locals 0

    .line 95
    invoke-direct {p0}, Lcom/huawei/pluginachievement/ui/AchieveMedalNewActivity;->m()V

    return-void
.end method

.method private n()V
    .locals 6

    .line 722
    iget-object v0, p0, Lcom/huawei/pluginachievement/ui/AchieveMedalNewActivity;->e:Landroid/content/Context;

    const/16 v1, 0x2710

    invoke-static {v1}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v1

    const-string v2, "health_app_third_login"

    invoke-static {v0, v1, v2}, Lo/dct;->c(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    .line 723
    const-string v0, "1"

    invoke-virtual {v4, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 724
    const-string v0, "PLGACHIEVE_AchieveMedalNewActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "accountmigrate: isthirdlogin == 1 and return!"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 725
    invoke-direct {p0}, Lcom/huawei/pluginachievement/ui/AchieveMedalNewActivity;->o()V

    .line 726
    return-void

    .line 728
    :cond_0
    new-instance v5, Lcom/huawei/pluginachievement/ui/AchieveMedalNewActivity$10;

    invoke-direct {v5, p0}, Lcom/huawei/pluginachievement/ui/AchieveMedalNewActivity$10;-><init>(Lcom/huawei/pluginachievement/ui/AchieveMedalNewActivity;)V

    .line 748
    iget-object v0, p0, Lcom/huawei/pluginachievement/ui/AchieveMedalNewActivity;->e:Landroid/content/Context;

    invoke-static {v0}, Lo/dnm;->a(Landroid/content/Context;)Lo/dnm;

    move-result-object v0

    invoke-virtual {v0, v5}, Lo/dnm;->d(Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V

    .line 749
    return-void
.end method

.method private o()V
    .locals 2

    .line 753
    iget-object v0, p0, Lcom/huawei/pluginachievement/ui/AchieveMedalNewActivity;->e:Landroid/content/Context;

    invoke-static {v0}, Lo/clp;->b(Landroid/content/Context;)Lo/clt;

    move-result-object v0

    new-instance v1, Lcom/huawei/pluginachievement/ui/AchieveMedalNewActivity$6;

    invoke-direct {v1, p0}, Lcom/huawei/pluginachievement/ui/AchieveMedalNewActivity$6;-><init>(Lcom/huawei/pluginachievement/ui/AchieveMedalNewActivity;)V

    invoke-interface {v0, v1}, Lo/clt;->a(Lo/clz;)V

    .line 790
    return-void
.end method


# virtual methods
.method public a()Ljava/util/Map;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()Ljava/util/Map<Ljava/lang/String;Ljava/util/ArrayList<Lo/dvz;>;>;"
        }
    .end annotation

    .line 513
    iget-object v0, p0, Lcom/huawei/pluginachievement/ui/AchieveMedalNewActivity;->l:Ljava/util/Map;

    return-object v0
.end method

.method public c()V
    .locals 1

    .line 711
    invoke-static {}, Lo/czu;->e()Z

    move-result v0

    if-nez v0, :cond_0

    .line 712
    invoke-direct {p0}, Lcom/huawei/pluginachievement/ui/AchieveMedalNewActivity;->n()V

    .line 714
    :cond_0
    return-void
.end method

.method public d()V
    .locals 2

    .line 653
    sget v0, Lcom/huawei/pluginachievement/R$id;->medal_information:I

    invoke-virtual {p0, v0}, Lcom/huawei/pluginachievement/ui/AchieveMedalNewActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    iput-object v0, p0, Lcom/huawei/pluginachievement/ui/AchieveMedalNewActivity;->r:Landroid/widget/LinearLayout;

    .line 654
    invoke-static {}, Lo/czu;->e()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 655
    iget-object v0, p0, Lcom/huawei/pluginachievement/ui/AchieveMedalNewActivity;->r:Landroid/widget/LinearLayout;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 658
    :cond_0
    sget v0, Lcom/huawei/pluginachievement/R$id;->head_imageview:I

    invoke-virtual {p0, v0}, Lcom/huawei/pluginachievement/ui/AchieveMedalNewActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lcom/huawei/pluginachievement/ui/AchieveMedalNewActivity;->w:Landroid/widget/ImageView;

    .line 660
    sget v0, Lcom/huawei/pluginachievement/R$id;->name_textview:I

    invoke-virtual {p0, v0}, Lcom/huawei/pluginachievement/ui/AchieveMedalNewActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/huawei/pluginachievement/ui/AchieveMedalNewActivity;->x:Landroid/widget/TextView;

    .line 662
    sget v0, Lcom/huawei/pluginachievement/R$id;->medal_all_ll_one:I

    invoke-virtual {p0, v0}, Lcom/huawei/pluginachievement/ui/AchieveMedalNewActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    iput-object v0, p0, Lcom/huawei/pluginachievement/ui/AchieveMedalNewActivity;->q:Landroid/widget/LinearLayout;

    .line 663
    sget v0, Lcom/huawei/pluginachievement/R$id;->medal_all_scrollview:I

    invoke-virtual {p0, v0}, Lcom/huawei/pluginachievement/ui/AchieveMedalNewActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ScrollView;

    iput-object v0, p0, Lcom/huawei/pluginachievement/ui/AchieveMedalNewActivity;->t:Landroid/widget/ScrollView;

    .line 664
    iget-object v0, p0, Lcom/huawei/pluginachievement/ui/AchieveMedalNewActivity;->e:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/pluginachievement/R$string;->IDS_plugin_achievement_tab_have_gained_medals:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/pluginachievement/ui/AchieveMedalNewActivity;->y:Ljava/lang/String;

    .line 666
    invoke-virtual {p0}, Lcom/huawei/pluginachievement/ui/AchieveMedalNewActivity;->c()V

    .line 668
    return-void
.end method

.method public e()Ljava/util/Map;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()Ljava/util/Map<Ljava/lang/String;Ljava/util/ArrayList<Ljava/lang/String;>;>;"
        }
    .end annotation

    .line 509
    iget-object v0, p0, Lcom/huawei/pluginachievement/ui/AchieveMedalNewActivity;->h:Ljava/util/Map;

    return-object v0
.end method

.method public e(Ljava/lang/String;)V
    .locals 0

    .line 592
    invoke-direct {p0, p1}, Lcom/huawei/pluginachievement/ui/AchieveMedalNewActivity;->b(Ljava/lang/String;)V

    .line 593
    return-void
.end method

.method public onBackPressed()V
    .locals 0

    .line 525
    invoke-super {p0}, Lcom/huawei/ui/commonui/base/BaseActivity;->onBackPressed()V

    .line 526
    return-void
.end method

.method public onClick(Landroid/view/View;)V
    .locals 0

    .line 531
    return-void
.end method

.method public onCreate(Landroid/os/Bundle;)V
    .locals 4

    .line 121
    invoke-super {p0, p1}, Lcom/huawei/ui/commonui/base/BaseActivity;->onCreate(Landroid/os/Bundle;)V

    .line 122
    const-string v0, "PLGACHIEVE_AchieveMedalNewActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "oncreate"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 123
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x15

    if-lt v0, v1, :cond_0

    invoke-static {}, Lo/dbf;->d()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 124
    invoke-virtual {p0}, Lcom/huawei/pluginachievement/ui/AchieveMedalNewActivity;->getWindow()Landroid/view/Window;

    move-result-object v0

    invoke-virtual {p0}, Lcom/huawei/pluginachievement/ui/AchieveMedalNewActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/pluginachievement/R$color;->hw_achieve_medal_black_background:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getColor(I)I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/view/Window;->setNavigationBarColor(I)V

    .line 126
    :cond_0
    sget v0, Lcom/huawei/pluginachievement/R$layout;->achieve_medal_new_layout:I

    invoke-virtual {p0, v0}, Lcom/huawei/pluginachievement/ui/AchieveMedalNewActivity;->setContentView(I)V

    .line 127
    iput-object p0, p0, Lcom/huawei/pluginachievement/ui/AchieveMedalNewActivity;->e:Landroid/content/Context;

    .line 128
    sget v0, Lcom/huawei/pluginachievement/R$id;->medal_titlebar:I

    invoke-virtual {p0, v0}, Lcom/huawei/pluginachievement/ui/AchieveMedalNewActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lo/emr;

    iput-object v0, p0, Lcom/huawei/pluginachievement/ui/AchieveMedalNewActivity;->k:Lo/emr;

    .line 129
    iget-object v0, p0, Lcom/huawei/pluginachievement/ui/AchieveMedalNewActivity;->k:Lo/emr;

    const/4 v1, 0x4

    invoke-virtual {v0, v1}, Lo/emr;->setRightButtonVisibility(I)V

    .line 130
    iget-object v0, p0, Lcom/huawei/pluginachievement/ui/AchieveMedalNewActivity;->k:Lo/emr;

    const/4 v1, 0x4

    invoke-virtual {v0, v1}, Lo/emr;->setRightTextButtonVisibility(I)V

    .line 131
    iget-object v0, p0, Lcom/huawei/pluginachievement/ui/AchieveMedalNewActivity;->k:Lo/emr;

    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v1

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/pluginachievement/R$drawable;->sug_ic_share:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/emr;->setRightButtonDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 132
    iget-object v0, p0, Lcom/huawei/pluginachievement/ui/AchieveMedalNewActivity;->k:Lo/emr;

    new-instance v1, Lcom/huawei/pluginachievement/ui/AchieveMedalNewActivity$5;

    invoke-direct {v1, p0}, Lcom/huawei/pluginachievement/ui/AchieveMedalNewActivity$5;-><init>(Lcom/huawei/pluginachievement/ui/AchieveMedalNewActivity;)V

    invoke-virtual {v0, v1}, Lo/emr;->setRightButtonOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 140
    iget-object v0, p0, Lcom/huawei/pluginachievement/ui/AchieveMedalNewActivity;->k:Lo/emr;

    new-instance v1, Lcom/huawei/pluginachievement/ui/AchieveMedalNewActivity$3;

    invoke-direct {v1, p0}, Lcom/huawei/pluginachievement/ui/AchieveMedalNewActivity$3;-><init>(Lcom/huawei/pluginachievement/ui/AchieveMedalNewActivity;)V

    invoke-virtual {v0, v1}, Lo/emr;->setLeftButtonOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 146
    iget-object v0, p0, Lcom/huawei/pluginachievement/ui/AchieveMedalNewActivity;->k:Lo/emr;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lo/emr;->setLeftButtonVisibility(I)V

    .line 148
    iget-object v0, p0, Lcom/huawei/pluginachievement/ui/AchieveMedalNewActivity;->e:Landroid/content/Context;

    invoke-static {v0}, Lo/cxa;->d(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 149
    iget-object v0, p0, Lcom/huawei/pluginachievement/ui/AchieveMedalNewActivity;->k:Lo/emr;

    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v1

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/pluginachievement/R$drawable;->ic_back_white_reverse:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/emr;->setLeftButtonDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 150
    iget-object v0, p0, Lcom/huawei/pluginachievement/ui/AchieveMedalNewActivity;->k:Lo/emr;

    iget-object v1, p0, Lcom/huawei/pluginachievement/ui/AchieveMedalNewActivity;->e:Landroid/content/Context;

    sget v2, Lcom/huawei/pluginachievement/R$drawable;->sug_ic_share:I

    invoke-static {v1, v2}, Lo/enf;->b(Landroid/content/Context;I)Landroid/graphics/drawable/BitmapDrawable;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/emr;->setRightButtonDrawable(Landroid/graphics/drawable/Drawable;)V

    goto :goto_0

    .line 152
    :cond_1
    iget-object v0, p0, Lcom/huawei/pluginachievement/ui/AchieveMedalNewActivity;->k:Lo/emr;

    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v1

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/pluginachievement/R$drawable;->ic_back_white:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/emr;->setLeftButtonDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 153
    iget-object v0, p0, Lcom/huawei/pluginachievement/ui/AchieveMedalNewActivity;->k:Lo/emr;

    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v1

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/pluginachievement/R$drawable;->sug_ic_share:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/emr;->setRightButtonDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 155
    :goto_0
    iget-object v0, p0, Lcom/huawei/pluginachievement/ui/AchieveMedalNewActivity;->k:Lo/emr;

    invoke-virtual {p0}, Lcom/huawei/pluginachievement/ui/AchieveMedalNewActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/pluginachievement/R$color;->white:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getColor(I)I

    move-result v1

    invoke-virtual {v0, v1}, Lo/emr;->setTitleTextColor(I)V

    .line 156
    iget-object v0, p0, Lcom/huawei/pluginachievement/ui/AchieveMedalNewActivity;->k:Lo/emr;

    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v1

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/pluginachievement/R$string;->IDS_plugin_achievement_medal_layout:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/emr;->setTitleText(Ljava/lang/String;)V

    .line 158
    invoke-static {}, Ljava/util/concurrent/Executors;->newSingleThreadExecutor()Ljava/util/concurrent/ExecutorService;

    move-result-object v0

    sput-object v0, Lcom/huawei/pluginachievement/ui/AchieveMedalNewActivity;->m:Ljava/util/concurrent/ExecutorService;

    .line 159
    invoke-direct {p0}, Lcom/huawei/pluginachievement/ui/AchieveMedalNewActivity;->f()V

    .line 160
    invoke-static {}, Lo/dth;->l()Z

    move-result v0

    iput-boolean v0, p0, Lcom/huawei/pluginachievement/ui/AchieveMedalNewActivity;->o:Z

    .line 161
    iget-object v0, p0, Lcom/huawei/pluginachievement/ui/AchieveMedalNewActivity;->e:Landroid/content/Context;

    const-string v1, "_medalPngStatusDownload"

    invoke-static {v0, v1}, Lo/dtn;->a(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/pluginachievement/ui/AchieveMedalNewActivity;->n:Ljava/lang/String;

    .line 162
    invoke-direct {p0}, Lcom/huawei/pluginachievement/ui/AchieveMedalNewActivity;->i()V

    .line 163
    iget-object v0, p0, Lcom/huawei/pluginachievement/ui/AchieveMedalNewActivity;->e:Landroid/content/Context;

    invoke-static {v0}, Lo/elx;->d(Landroid/content/Context;)V

    .line 164
    invoke-virtual {p0}, Lcom/huawei/pluginachievement/ui/AchieveMedalNewActivity;->d()V

    .line 165
    return-void
.end method

.method public onDestroy()V
    .locals 1

    .line 518
    invoke-super {p0}, Lcom/huawei/ui/commonui/base/BaseActivity;->onDestroy()V

    .line 519
    sget-object v0, Lcom/huawei/pluginachievement/ui/AchieveMedalNewActivity;->m:Ljava/util/concurrent/ExecutorService;

    invoke-static {v0}, Lo/dzw;->c(Ljava/util/concurrent/ExecutorService;)V

    .line 520
    return-void
.end method
