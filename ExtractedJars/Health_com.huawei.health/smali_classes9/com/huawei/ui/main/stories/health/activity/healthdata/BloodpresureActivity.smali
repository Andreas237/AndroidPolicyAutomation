.class public Lcom/huawei/ui/main/stories/health/activity/healthdata/BloodpresureActivity;
.super Lcom/huawei/ui/commonui/base/BaseActivity;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/huawei/ui/main/stories/health/activity/healthdata/BloodpresureActivity$f;,
        Lcom/huawei/ui/main/stories/health/activity/healthdata/BloodpresureActivity$h;,
        Lcom/huawei/ui/main/stories/health/activity/healthdata/BloodpresureActivity$e;,
        Lcom/huawei/ui/main/stories/health/activity/healthdata/BloodpresureActivity$a;,
        Lcom/huawei/ui/main/stories/health/activity/healthdata/BloodpresureActivity$k;,
        Lcom/huawei/ui/main/stories/health/activity/healthdata/BloodpresureActivity$d;,
        Lcom/huawei/ui/main/stories/health/activity/healthdata/BloodpresureActivity$g;,
        Lcom/huawei/ui/main/stories/health/activity/healthdata/BloodpresureActivity$c;,
        Lcom/huawei/ui/main/stories/health/activity/healthdata/BloodpresureActivity$b;
    }
.end annotation


# instance fields
.field private A:Landroid/widget/RelativeLayout;

.field private B:Landroid/widget/ImageView;

.field private C:Lo/fdj;

.field private D:Landroid/view/View;

.field private E:Landroid/graphics/drawable/AnimationDrawable;

.field private F:Landroid/widget/LinearLayout;

.field private G:Landroid/widget/ImageView;

.field private H:Landroid/widget/LinearLayout;

.field private I:Lo/egb;

.field private J:Lo/ego$a;

.field private K:Landroid/view/View;

.field private L:I

.field private M:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<Lcom/huawei/hihealth/HiTimeInterval;>;"
        }
    .end annotation
.end field

.field private N:Lo/ego;

.field private O:I

.field private P:Landroid/graphics/drawable/Drawable;

.field private Q:Landroid/graphics/drawable/Drawable;

.field private R:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<Lo/fdf;>;"
        }
    .end annotation
.end field

.field private S:Lo/ems;

.field private T:D

.field private U:Lo/emr;

.field private V:D

.field private W:D

.field private X:Z

.field private Y:Lo/dlu;

.field private Z:Z

.field private a:Landroid/widget/LinearLayout;

.field private aa:Ljava/lang/String;

.field private ab:Ljava/util/concurrent/ExecutorService;

.field private ac:Z

.field private ag:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<Landroid/view/View;Lcom/huawei/ui/main/stories/health/activity/healthdata/BloodpresureActivity$b;>;"
        }
    .end annotation
.end field

.field public b:Landroid/widget/CheckBox;

.field private c:Landroid/widget/LinearLayout;

.field private final d:J

.field private e:Landroid/content/Context;

.field private f:Landroid/widget/LinearLayout;

.field private g:Landroid/widget/LinearLayout;

.field private h:Landroid/widget/LinearLayout;

.field private i:Landroid/widget/LinearLayout;

.field private j:I

.field private k:Landroid/widget/LinearLayout;

.field private l:Lo/egb;

.field private m:Lo/egb;

.field private n:Lo/egb;

.field private o:Lo/egb;

.field private p:Landroid/widget/SeekBar;

.field private q:Landroid/widget/ListView;

.field private r:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<Ljava/lang/String;>;"
        }
    .end annotation
.end field

.field private s:Landroid/widget/ImageView;

.field private t:Lcom/huawei/ui/main/stories/health/activity/healthdata/BloodpresureActivity$h;

.field private u:Lo/fdj;

.field private v:Lcom/huawei/ui/main/stories/health/activity/healthdata/BloodpresureActivity$f;

.field private w:Lo/fer;

.field private x:Lo/fcm;

.field private y:Lo/fcd;

.field private z:Landroid/os/Handler;


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 96
    invoke-direct {p0}, Lcom/huawei/ui/commonui/base/BaseActivity;-><init>()V

    .line 105
    const-wide/32 v0, 0x5265c00

    iput-wide v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/BloodpresureActivity;->d:J

    .line 126
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/BloodpresureActivity;->r:Ljava/util/ArrayList;

    .line 133
    new-instance v0, Lcom/huawei/ui/main/stories/health/activity/healthdata/BloodpresureActivity$e;

    invoke-direct {v0, p0}, Lcom/huawei/ui/main/stories/health/activity/healthdata/BloodpresureActivity$e;-><init>(Lcom/huawei/ui/main/stories/health/activity/healthdata/BloodpresureActivity;)V

    iput-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/BloodpresureActivity;->z:Landroid/os/Handler;

    .line 139
    const/4 v0, 0x0

    iput v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/BloodpresureActivity;->j:I

    .line 154
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/BloodpresureActivity;->R:Ljava/util/ArrayList;

    .line 158
    const-wide/high16 v0, 0x405e000000000000L    # 120.0

    iput-wide v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/BloodpresureActivity;->V:D

    const-wide/high16 v0, 0x4054000000000000L    # 80.0

    iput-wide v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/BloodpresureActivity;->W:D

    const-wide/16 v0, 0x0

    iput-wide v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/BloodpresureActivity;->T:D

    .line 165
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/BloodpresureActivity;->ac:Z

    .line 166
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/BloodpresureActivity;->aa:Ljava/lang/String;

    return-void
.end method

.method static synthetic a(Lcom/huawei/ui/main/stories/health/activity/healthdata/BloodpresureActivity;Ljava/lang/String;)I
    .locals 1

    .line 96
    invoke-direct {p0, p1}, Lcom/huawei/ui/main/stories/health/activity/healthdata/BloodpresureActivity;->a(Ljava/lang/String;)I

    move-result v0

    return v0
.end method

.method private a(Ljava/lang/String;)I
    .locals 13

    .line 581
    const/4 v8, 0x0

    .line 582
    const/4 v9, 0x0

    .line 583
    const/4 v10, 0x0

    .line 585
    const-string v0, "device.db"

    const/4 v1, 0x0

    const/4 v2, 0x0

    :try_start_0
    invoke-virtual {p0, v0, v1, v2}, Lcom/huawei/ui/main/stories/health/activity/healthdata/BloodpresureActivity;->openOrCreateDatabase(Ljava/lang/String;ILandroid/database/sqlite/SQLiteDatabase$CursorFactory;)Landroid/database/sqlite/SQLiteDatabase;

    move-result-object v0

    move-object v9, v0

    .line 587
    move-object v0, v9

    const-string v1, "device"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/String;

    const-string v3, "productId"

    const/4 v4, 0x0

    aput-object v3, v2, v4

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "kind = \'"

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    const-string v4, "\'"

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    invoke-virtual/range {v0 .. v7}, Landroid/database/sqlite/SQLiteDatabase;->query(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object v0

    move-object v10, v0

    .line 590
    :goto_0
    invoke-interface {v10}, Landroid/database/Cursor;->moveToNext()Z
    :try_end_0
    .catch Landroid/database/SQLException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_1
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result v0

    if-eqz v0, :cond_0

    .line 591
    add-int/lit8 v8, v8, 0x1

    goto :goto_0

    .line 598
    :cond_0
    if-eqz v10, :cond_1

    .line 600
    invoke-interface {v10}, Landroid/database/Cursor;->close()V

    .line 602
    :cond_1
    if-eqz v9, :cond_6

    .line 603
    invoke-virtual {v9}, Landroid/database/sqlite/SQLiteDatabase;->close()V

    goto/16 :goto_1

    .line 593
    :catch_0
    move-exception v11

    .line 594
    const-string v0, "UIHLH_BloodpresureActivity"

    const/4 v1, 0x1

    :try_start_1
    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "SQLException = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v11}, Landroid/database/SQLException;->getMessage()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 598
    if-eqz v10, :cond_2

    .line 600
    invoke-interface {v10}, Landroid/database/Cursor;->close()V

    .line 602
    :cond_2
    if-eqz v9, :cond_6

    .line 603
    invoke-virtual {v9}, Landroid/database/sqlite/SQLiteDatabase;->close()V

    goto :goto_1

    .line 595
    :catch_1
    move-exception v11

    .line 596
    const-string v0, "UIHLH_BloodpresureActivity"

    const/4 v1, 0x1

    :try_start_2
    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Exception = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v11}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 598
    if-eqz v10, :cond_3

    .line 600
    invoke-interface {v10}, Landroid/database/Cursor;->close()V

    .line 602
    :cond_3
    if-eqz v9, :cond_6

    .line 603
    invoke-virtual {v9}, Landroid/database/sqlite/SQLiteDatabase;->close()V

    goto :goto_1

    .line 598
    :catchall_0
    move-exception v12

    if-eqz v10, :cond_4

    .line 600
    invoke-interface {v10}, Landroid/database/Cursor;->close()V

    .line 602
    :cond_4
    if-eqz v9, :cond_5

    .line 603
    invoke-virtual {v9}, Landroid/database/sqlite/SQLiteDatabase;->close()V

    .line 605
    :cond_5
    throw v12

    .line 607
    :cond_6
    :goto_1
    return v8
.end method

.method static synthetic a(Lcom/huawei/ui/main/stories/health/activity/healthdata/BloodpresureActivity;)Landroid/os/Handler;
    .locals 1

    .line 96
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/BloodpresureActivity;->z:Landroid/os/Handler;

    return-object v0
.end method

.method private a(I)V
    .locals 9

    .line 518
    const-string v0, "deleteData"

    invoke-direct {p0, v0}, Lcom/huawei/ui/main/stories/health/activity/healthdata/BloodpresureActivity;->d(Ljava/lang/String;)V

    .line 519
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/BloodpresureActivity;->R:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lo/fdf;

    invoke-virtual {v0}, Lo/fdf;->b()J

    move-result-wide v7

    .line 520
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/BloodpresureActivity;->C:Lo/fdj;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/BloodpresureActivity;->e:Landroid/content/Context;

    move-wide v2, v7

    move-wide v4, v7

    iget-object v6, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/BloodpresureActivity;->v:Lcom/huawei/ui/main/stories/health/activity/healthdata/BloodpresureActivity$f;

    invoke-virtual/range {v0 .. v6}, Lo/fdj;->a(Landroid/content/Context;JJLcom/huawei/hwbasemgr/IBaseResponseCallback;)V

    .line 521
    const-string v0, "UIHLH_BloodpresureActivity"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "deleteData "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const-string v2, "end"

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 522
    return-void
.end method

.method static synthetic a(Lcom/huawei/ui/main/stories/health/activity/healthdata/BloodpresureActivity;I)V
    .locals 0

    .line 96
    invoke-direct {p0, p1}, Lcom/huawei/ui/main/stories/health/activity/healthdata/BloodpresureActivity;->a(I)V

    return-void
.end method

.method static synthetic a(Lcom/huawei/ui/main/stories/health/activity/healthdata/BloodpresureActivity;Z)V
    .locals 0

    .line 96
    invoke-direct {p0, p1}, Lcom/huawei/ui/main/stories/health/activity/healthdata/BloodpresureActivity;->d(Z)V

    return-void
.end method

.method static synthetic a(Lcom/huawei/ui/main/stories/health/activity/healthdata/BloodpresureActivity;ZI)V
    .locals 0

    .line 96
    invoke-direct {p0, p1, p2}, Lcom/huawei/ui/main/stories/health/activity/healthdata/BloodpresureActivity;->c(ZI)V

    return-void
.end method

.method private a(Z)V
    .locals 2

    .line 787
    if-nez p1, :cond_0

    .line 788
    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lcom/huawei/ui/main/stories/health/activity/healthdata/BloodpresureActivity;->e(Z)V

    .line 789
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/BloodpresureActivity;->U:Lo/emr;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/BloodpresureActivity;->Q:Landroid/graphics/drawable/Drawable;

    invoke-virtual {v0, v1}, Lo/emr;->setLeftButtonDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 790
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/BloodpresureActivity;->U:Lo/emr;

    sget v1, Lcom/huawei/ui/main/R$string;->IDS_hw_show_main_home_page_bloodpressure:I

    invoke-virtual {p0, v1}, Lcom/huawei/ui/main/stories/health/activity/healthdata/BloodpresureActivity;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/emr;->setTitleText(Ljava/lang/String;)V

    goto :goto_0

    .line 792
    :cond_0
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/BloodpresureActivity;->U:Lo/emr;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/BloodpresureActivity;->P:Landroid/graphics/drawable/Drawable;

    invoke-virtual {v0, v1}, Lo/emr;->setLeftButtonDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 793
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/BloodpresureActivity;->U:Lo/emr;

    sget v1, Lcom/huawei/ui/main/R$string;->IDS_hw_show_main_health_page_healthdata_selectNone:I

    invoke-virtual {p0, v1}, Lcom/huawei/ui/main/stories/health/activity/healthdata/BloodpresureActivity;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/emr;->setTitleText(Ljava/lang/String;)V

    .line 795
    :goto_0
    return-void
.end method

.method static synthetic b(Lcom/huawei/ui/main/stories/health/activity/healthdata/BloodpresureActivity;D)D
    .locals 0

    .line 96
    iput-wide p1, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/BloodpresureActivity;->T:D

    return-wide p1
.end method

.method static synthetic b(Lcom/huawei/ui/main/stories/health/activity/healthdata/BloodpresureActivity;)Lo/dlu;
    .locals 1

    .line 96
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/BloodpresureActivity;->Y:Lo/dlu;

    return-object v0
.end method

.method private b()V
    .locals 8

    .line 243
    sget v0, Lcom/huawei/ui/main/R$id;->health_healthdata_bloodpresure_title_layout:I

    invoke-virtual {p0, v0}, Lcom/huawei/ui/main/stories/health/activity/healthdata/BloodpresureActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lo/emr;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/BloodpresureActivity;->U:Lo/emr;

    .line 244
    sget v0, Lcom/huawei/ui/main/R$id;->hw_show_health_data_bloodpressure_bottom_layout:I

    invoke-virtual {p0, v0}, Lcom/huawei/ui/main/stories/health/activity/healthdata/BloodpresureActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lo/ems;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/BloodpresureActivity;->S:Lo/ems;

    .line 245
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/BloodpresureActivity;->e:Landroid/content/Context;

    sget v1, Lcom/huawei/ui/main/R$layout;->health_data_bloodpresure_bottomview:I

    const/4 v2, 0x0

    invoke-static {v0, v1, v2}, Landroid/view/View;->inflate(Landroid/content/Context;ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v4

    .line 246
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/BloodpresureActivity;->S:Lo/ems;

    invoke-virtual {v0, v4}, Lo/ems;->e(Landroid/view/View;)V

    .line 247
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/BloodpresureActivity;->S:Lo/ems;

    invoke-virtual {v0, p0}, Lo/ems;->a(Landroid/app/Activity;)V

    .line 248
    sget v0, Lcom/huawei/ui/main/R$id;->hw_show_health_data_bloodpresure_bottom_normal:I

    invoke-virtual {v4, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/BloodpresureActivity;->F:Landroid/widget/LinearLayout;

    .line 249
    sget v0, Lcom/huawei/ui/main/R$id;->hw_show_health_data_bloodpresure_bottom_select:I

    invoke-virtual {v4, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/BloodpresureActivity;->H:Landroid/widget/LinearLayout;

    .line 250
    sget v0, Lcom/huawei/ui/main/R$id;->hw_blood_loading:I

    invoke-virtual {p0, v0}, Lcom/huawei/ui/main/stories/health/activity/healthdata/BloodpresureActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/RelativeLayout;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/BloodpresureActivity;->A:Landroid/widget/RelativeLayout;

    .line 251
    sget v0, Lcom/huawei/ui/main/R$id;->hw_show_health_data_bloodpressure_noempty_layout:I

    invoke-virtual {p0, v0}, Lcom/huawei/ui/main/stories/health/activity/healthdata/BloodpresureActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/BloodpresureActivity;->c:Landroid/widget/LinearLayout;

    .line 252
    sget v0, Lcom/huawei/ui/main/R$id;->hw_show_health_data_bloodpressure_empty_layout:I

    invoke-virtual {p0, v0}, Lcom/huawei/ui/main/stories/health/activity/healthdata/BloodpresureActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/BloodpresureActivity;->a:Landroid/widget/LinearLayout;

    .line 253
    sget v0, Lcom/huawei/ui/main/R$id;->statusbar_panel:I

    invoke-virtual {p0, v0}, Lcom/huawei/ui/main/stories/health/activity/healthdata/BloodpresureActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/BloodpresureActivity;->K:Landroid/view/View;

    .line 254
    sget v0, Lcom/huawei/ui/main/R$id;->hw_show_health_data_bloodpresure_text_seleteall:I

    invoke-virtual {p0, v0}, Lcom/huawei/ui/main/stories/health/activity/healthdata/BloodpresureActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lo/egb;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/BloodpresureActivity;->I:Lo/egb;

    .line 255
    sget v0, Lcom/huawei/ui/main/R$id;->titlebar_panel:I

    invoke-virtual {p0, v0}, Lcom/huawei/ui/main/stories/health/activity/healthdata/BloodpresureActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    move-object v5, v0

    check-cast v5, Landroid/widget/RelativeLayout;

    .line 256
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/BloodpresureActivity;->S:Lo/ems;

    invoke-virtual {v0}, Lo/ems;->getBackground()Landroid/graphics/drawable/Drawable;

    move-result-object v0

    invoke-virtual {v5, v0}, Landroid/widget/RelativeLayout;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 258
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/BloodpresureActivity;->e:Landroid/content/Context;

    invoke-static {v0}, Lo/ene;->b(Landroid/content/Context;)I

    move-result v6

    .line 259
    new-instance v7, Landroid/widget/RelativeLayout$LayoutParams;

    const/4 v0, -0x1

    invoke-direct {v7, v0, v6}, Landroid/widget/RelativeLayout$LayoutParams;-><init>(II)V

    .line 260
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/BloodpresureActivity;->K:Landroid/view/View;

    invoke-virtual {v0, v7}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 261
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/BloodpresureActivity;->K:Landroid/view/View;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/BloodpresureActivity;->S:Lo/ems;

    invoke-virtual {v1}, Lo/ems;->getBackground()Landroid/graphics/drawable/Drawable;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 264
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/BloodpresureActivity;->c:Landroid/widget/LinearLayout;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 265
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/BloodpresureActivity;->A:Landroid/widget/RelativeLayout;

    sget v1, Lcom/huawei/ui/main/R$id;->hw_device_blood_loading_img:I

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/BloodpresureActivity;->G:Landroid/widget/ImageView;

    .line 266
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/BloodpresureActivity;->G:Landroid/widget/ImageView;

    invoke-virtual {v0}, Landroid/widget/ImageView;->getDrawable()Landroid/graphics/drawable/Drawable;

    move-result-object v0

    check-cast v0, Landroid/graphics/drawable/AnimationDrawable;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/BloodpresureActivity;->E:Landroid/graphics/drawable/AnimationDrawable;

    .line 268
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/BloodpresureActivity;->F:Landroid/widget/LinearLayout;

    sget v1, Lcom/huawei/ui/main/R$id;->hw_show_health_data_bloodpresure_input:I

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/BloodpresureActivity;->f:Landroid/widget/LinearLayout;

    .line 269
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/BloodpresureActivity;->F:Landroid/widget/LinearLayout;

    sget v1, Lcom/huawei/ui/main/R$id;->hw_show_health_data_bloodpresure_mesure:I

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/BloodpresureActivity;->g:Landroid/widget/LinearLayout;

    .line 270
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/BloodpresureActivity;->F:Landroid/widget/LinearLayout;

    sget v1, Lcom/huawei/ui/main/R$id;->hw_show_health_data_bloodpresure_delete:I

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/BloodpresureActivity;->k:Landroid/widget/LinearLayout;

    .line 271
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/BloodpresureActivity;->H:Landroid/widget/LinearLayout;

    sget v1, Lcom/huawei/ui/main/R$id;->hw_show_health_data_bloodpresure_delete_confirm:I

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/BloodpresureActivity;->i:Landroid/widget/LinearLayout;

    .line 272
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/BloodpresureActivity;->H:Landroid/widget/LinearLayout;

    sget v1, Lcom/huawei/ui/main/R$id;->lin_checkbox:I

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/BloodpresureActivity;->h:Landroid/widget/LinearLayout;

    .line 273
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/BloodpresureActivity;->H:Landroid/widget/LinearLayout;

    sget v1, Lcom/huawei/ui/main/R$id;->hw_show_health_data_bloodpresure_seleteall:I

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/CheckBox;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/BloodpresureActivity;->b:Landroid/widget/CheckBox;

    .line 275
    sget v0, Lcom/huawei/ui/main/R$id;->hw_show_health_data_bloodpresure_mid_adduser:I

    invoke-virtual {p0, v0}, Lcom/huawei/ui/main/stories/health/activity/healthdata/BloodpresureActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/BloodpresureActivity;->s:Landroid/widget/ImageView;

    .line 276
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/BloodpresureActivity;->D:Landroid/view/View;

    sget v1, Lcom/huawei/ui/main/R$id;->hw_show_health_data_bloodpressure_mid_time:I

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lo/egb;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/BloodpresureActivity;->o:Lo/egb;

    .line 277
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/BloodpresureActivity;->D:Landroid/view/View;

    sget v1, Lcom/huawei/ui/main/R$id;->hw_show_health_data_bloodpressure_mid_weight:I

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lo/egb;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/BloodpresureActivity;->l:Lo/egb;

    .line 278
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/BloodpresureActivity;->D:Landroid/view/View;

    sget v1, Lcom/huawei/ui/main/R$id;->hw_show_bloodpressure_unit:I

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lo/egb;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/BloodpresureActivity;->m:Lo/egb;

    .line 279
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/BloodpresureActivity;->D:Landroid/view/View;

    sget v1, Lcom/huawei/ui/main/R$id;->hw_show_health_data_bloodpressure_progressbar_image:I

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/BloodpresureActivity;->B:Landroid/widget/ImageView;

    .line 281
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/BloodpresureActivity;->D:Landroid/view/View;

    sget v1, Lcom/huawei/ui/main/R$id;->hw_show_health_data_bloodpressure_mid_progressbar:I

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/SeekBar;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/BloodpresureActivity;->p:Landroid/widget/SeekBar;

    .line 282
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/BloodpresureActivity;->D:Landroid/view/View;

    sget v1, Lcom/huawei/ui/main/R$id;->hw_show_health_data_bloodpressure_mid_desc:I

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lo/egb;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/BloodpresureActivity;->n:Lo/egb;

    .line 283
    sget v0, Lcom/huawei/ui/main/R$id;->hw_show_health_data_bloodpresure_history_listview:I

    invoke-virtual {p0, v0}, Lcom/huawei/ui/main/stories/health/activity/healthdata/BloodpresureActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ListView;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/BloodpresureActivity;->q:Landroid/widget/ListView;

    .line 284
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/BloodpresureActivity;->q:Landroid/widget/ListView;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/BloodpresureActivity;->D:Landroid/view/View;

    invoke-virtual {v0, v1}, Landroid/widget/ListView;->addHeaderView(Landroid/view/View;)V

    .line 287
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/BloodpresureActivity;->e:Landroid/content/Context;

    invoke-static {v0}, Lo/cxa;->d(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 288
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/BloodpresureActivity;->e:Landroid/content/Context;

    sget v1, Lcom/huawei/ui/main/R$drawable;->health_navbar_rtl_back_selector:I

    invoke-static {v0, v1}, Landroid/support/v4/content/ContextCompat;->getDrawable(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/BloodpresureActivity;->Q:Landroid/graphics/drawable/Drawable;

    .line 289
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/BloodpresureActivity;->B:Landroid/widget/ImageView;

    sget v1, Lcom/huawei/ui/main/R$drawable;->ic_health_equipment_progressbar_reversal:I

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageResource(I)V

    goto :goto_0

    .line 291
    :cond_0
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/BloodpresureActivity;->e:Landroid/content/Context;

    sget v1, Lcom/huawei/ui/main/R$drawable;->health_navbar_back_selector:I

    invoke-static {v0, v1}, Landroid/support/v4/content/ContextCompat;->getDrawable(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/BloodpresureActivity;->Q:Landroid/graphics/drawable/Drawable;

    .line 292
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/BloodpresureActivity;->B:Landroid/widget/ImageView;

    sget v1, Lcom/huawei/ui/main/R$drawable;->ic_health_equipment_progressbar:I

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 294
    :goto_0
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/BloodpresureActivity;->e:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/ui/main/R$drawable;->ic_public_select_cancel:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/BloodpresureActivity;->P:Landroid/graphics/drawable/Drawable;

    .line 295
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/BloodpresureActivity;->U:Lo/emr;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/BloodpresureActivity;->Q:Landroid/graphics/drawable/Drawable;

    invoke-virtual {v0, v1}, Lo/emr;->setLeftButtonDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 297
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/BloodpresureActivity;->o:Lo/egb;

    const-string v1, ""

    invoke-virtual {v0, v1}, Lo/egb;->setText(Ljava/lang/CharSequence;)V

    .line 298
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/BloodpresureActivity;->l:Lo/egb;

    const-string v1, "--"

    invoke-virtual {v0, v1}, Lo/egb;->setText(Ljava/lang/CharSequence;)V

    .line 300
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/BloodpresureActivity;->n:Lo/egb;

    const-string v1, ""

    invoke-virtual {v0, v1}, Lo/egb;->setText(Ljava/lang/CharSequence;)V

    .line 302
    new-instance v0, Lo/fcd;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/BloodpresureActivity;->R:Ljava/util/ArrayList;

    invoke-direct {v0, v1, p0}, Lo/fcd;-><init>(Ljava/util/List;Lcom/huawei/ui/main/stories/health/activity/healthdata/BloodpresureActivity;)V

    iput-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/BloodpresureActivity;->y:Lo/fcd;

    .line 303
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/BloodpresureActivity;->q:Landroid/widget/ListView;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/BloodpresureActivity;->y:Lo/fcd;

    invoke-virtual {v0, v1}, Landroid/widget/ListView;->setAdapter(Landroid/widget/ListAdapter;)V

    .line 305
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/BloodpresureActivity;->q:Landroid/widget/ListView;

    new-instance v1, Lcom/huawei/ui/main/stories/health/activity/healthdata/BloodpresureActivity$3;

    invoke-direct {v1, p0}, Lcom/huawei/ui/main/stories/health/activity/healthdata/BloodpresureActivity$3;-><init>(Lcom/huawei/ui/main/stories/health/activity/healthdata/BloodpresureActivity;)V

    invoke-virtual {v0, v1}, Landroid/widget/ListView;->setOnItemLongClickListener(Landroid/widget/AdapterView$OnItemLongClickListener;)V

    .line 314
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/BloodpresureActivity;->q:Landroid/widget/ListView;

    new-instance v1, Lcom/huawei/ui/main/stories/health/activity/healthdata/BloodpresureActivity$9;

    invoke-direct {v1, p0}, Lcom/huawei/ui/main/stories/health/activity/healthdata/BloodpresureActivity$9;-><init>(Lcom/huawei/ui/main/stories/health/activity/healthdata/BloodpresureActivity;)V

    invoke-virtual {v0, v1}, Landroid/widget/ListView;->setOnItemClickListener(Landroid/widget/AdapterView$OnItemClickListener;)V

    .line 330
    sget v0, Lcom/huawei/ui/main/R$id;->hw_show_health_data_bloodpresure_userlistview:I

    invoke-virtual {p0, v0}, Lcom/huawei/ui/main/stories/health/activity/healthdata/BloodpresureActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lo/fer;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/BloodpresureActivity;->w:Lo/fer;

    .line 331
    new-instance v0, Lo/fcm;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/BloodpresureActivity;->e:Landroid/content/Context;

    iget-object v2, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/BloodpresureActivity;->r:Ljava/util/ArrayList;

    const/4 v3, 0x0

    invoke-direct {v0, v1, v2, v3}, Lo/fcm;-><init>(Landroid/content/Context;Ljava/util/ArrayList;I)V

    iput-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/BloodpresureActivity;->x:Lo/fcm;

    .line 332
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/BloodpresureActivity;->w:Lo/fer;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/BloodpresureActivity;->x:Lo/fcm;

    invoke-virtual {v0, v1}, Lo/fer;->setAdapter(Landroid/widget/ListAdapter;)V

    .line 333
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/BloodpresureActivity;->w:Lo/fer;

    new-instance v1, Lcom/huawei/ui/main/stories/health/activity/healthdata/BloodpresureActivity$6;

    invoke-direct {v1, p0}, Lcom/huawei/ui/main/stories/health/activity/healthdata/BloodpresureActivity$6;-><init>(Lcom/huawei/ui/main/stories/health/activity/healthdata/BloodpresureActivity;)V

    invoke-virtual {v0, v1}, Lo/fer;->setOnItemClickListener(Landroid/widget/AdapterView$OnItemClickListener;)V

    .line 341
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/BloodpresureActivity;->f:Landroid/widget/LinearLayout;

    invoke-virtual {v0, p0}, Landroid/widget/LinearLayout;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 342
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/BloodpresureActivity;->g:Landroid/widget/LinearLayout;

    invoke-virtual {v0, p0}, Landroid/widget/LinearLayout;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 343
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/BloodpresureActivity;->k:Landroid/widget/LinearLayout;

    invoke-virtual {v0, p0}, Landroid/widget/LinearLayout;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 344
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/BloodpresureActivity;->s:Landroid/widget/ImageView;

    invoke-virtual {v0, p0}, Landroid/widget/ImageView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 345
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/BloodpresureActivity;->i:Landroid/widget/LinearLayout;

    invoke-virtual {v0, p0}, Landroid/widget/LinearLayout;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 346
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/BloodpresureActivity;->U:Lo/emr;

    new-instance v1, Lcom/huawei/ui/main/stories/health/activity/healthdata/BloodpresureActivity$8;

    invoke-direct {v1, p0}, Lcom/huawei/ui/main/stories/health/activity/healthdata/BloodpresureActivity$8;-><init>(Lcom/huawei/ui/main/stories/health/activity/healthdata/BloodpresureActivity;)V

    invoke-virtual {v0, v1}, Lo/emr;->setLeftButtonOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 352
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/BloodpresureActivity;->h:Landroid/widget/LinearLayout;

    new-instance v1, Lcom/huawei/ui/main/stories/health/activity/healthdata/BloodpresureActivity$7;

    invoke-direct {v1, p0}, Lcom/huawei/ui/main/stories/health/activity/healthdata/BloodpresureActivity$7;-><init>(Lcom/huawei/ui/main/stories/health/activity/healthdata/BloodpresureActivity;)V

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 359
    invoke-static {}, Lo/fdj;->e()Lo/fdj;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/BloodpresureActivity;->u:Lo/fdj;

    .line 360
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/BloodpresureActivity;->u:Lo/fdj;

    invoke-virtual {v0}, Lo/fdj;->c()V

    .line 361
    new-instance v0, Lcom/huawei/ui/main/stories/health/activity/healthdata/BloodpresureActivity$h;

    invoke-direct {v0, p0}, Lcom/huawei/ui/main/stories/health/activity/healthdata/BloodpresureActivity$h;-><init>(Lcom/huawei/ui/main/stories/health/activity/healthdata/BloodpresureActivity;)V

    iput-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/BloodpresureActivity;->t:Lcom/huawei/ui/main/stories/health/activity/healthdata/BloodpresureActivity$h;

    .line 362
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/BloodpresureActivity;->p:Landroid/widget/SeekBar;

    const/16 v1, 0x32

    invoke-virtual {v0, v1}, Landroid/widget/SeekBar;->setProgress(I)V

    .line 364
    invoke-direct {p0}, Lcom/huawei/ui/main/stories/health/activity/healthdata/BloodpresureActivity;->k()V

    .line 366
    return-void
.end method

.method static synthetic b(Lcom/huawei/ui/main/stories/health/activity/healthdata/BloodpresureActivity;Z)V
    .locals 0

    .line 96
    invoke-direct {p0, p1}, Lcom/huawei/ui/main/stories/health/activity/healthdata/BloodpresureActivity;->a(Z)V

    return-void
.end method

.method private b(Z)V
    .locals 3

    .line 411
    const/4 v2, 0x0

    :goto_0
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/BloodpresureActivity;->R:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-ge v2, v0, :cond_0

    .line 412
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/BloodpresureActivity;->y:Lo/fcd;

    invoke-virtual {v0}, Lo/fcd;->d()Ljava/util/ArrayList;

    move-result-object v0

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    invoke-virtual {v0, v2, v1}, Ljava/util/ArrayList;->set(ILjava/lang/Object;)Ljava/lang/Object;

    .line 411
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    .line 414
    :cond_0
    return-void
.end method

.method static synthetic c(Lcom/huawei/ui/main/stories/health/activity/healthdata/BloodpresureActivity;D)D
    .locals 0

    .line 96
    iput-wide p1, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/BloodpresureActivity;->V:D

    return-wide p1
.end method

.method static synthetic c(Lcom/huawei/ui/main/stories/health/activity/healthdata/BloodpresureActivity;)Landroid/content/Context;
    .locals 1

    .line 96
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/BloodpresureActivity;->e:Landroid/content/Context;

    return-object v0
.end method

.method private c(Ljava/text/NumberFormat;Ljava/lang/String;Ljava/lang/String;)V
    .locals 6

    .line 865
    :try_start_0
    invoke-virtual {p1, p2}, Ljava/text/NumberFormat;->parse(Ljava/lang/String;)Ljava/lang/Number;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Number;->intValue()I

    move-result v4

    .line 866
    invoke-virtual {p1, p3}, Ljava/text/NumberFormat;->parse(Ljava/lang/String;)Ljava/lang/Number;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Number;->intValue()I

    move-result v5

    .line 868
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/BloodpresureActivity;->n:Lo/egb;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/BloodpresureActivity;->e:Landroid/content/Context;

    invoke-static {v1, v4, v5}, Lo/fdy;->a(Landroid/content/Context;II)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/egb;->setText(Ljava/lang/CharSequence;)V

    .line 869
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/BloodpresureActivity;->p:Landroid/widget/SeekBar;

    int-to-short v1, v4

    int-to-short v2, v5

    invoke-static {v1, v2}, Lo/fdy;->a(SS)I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/widget/SeekBar;->setProgress(I)V
    :try_end_0
    .catch Ljava/text/ParseException; {:try_start_0 .. :try_end_0} :catch_0

    .line 872
    goto :goto_0

    .line 870
    :catch_0
    move-exception v4

    .line 871
    const-string v0, "UIHLH_BloodpresureActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "setDetialData, ParseException = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v4}, Ljava/text/ParseException;->getMessage()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 873
    :goto_0
    return-void
.end method

.method private c(Z)V
    .locals 2

    .line 798
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/BloodpresureActivity;->y:Lo/fcd;

    invoke-virtual {v0, p1}, Lo/fcd;->d(Z)V

    .line 799
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/BloodpresureActivity;->b:Landroid/widget/CheckBox;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/CheckBox;->setChecked(Z)V

    .line 800
    if-nez p1, :cond_0

    .line 801
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/BloodpresureActivity;->H:Landroid/widget/LinearLayout;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 802
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/BloodpresureActivity;->F:Landroid/widget/LinearLayout;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 803
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/BloodpresureActivity;->y:Lo/fcd;

    invoke-virtual {v0}, Lo/fcd;->notifyDataSetChanged()V

    goto :goto_0

    .line 805
    :cond_0
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/BloodpresureActivity;->H:Landroid/widget/LinearLayout;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 806
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/BloodpresureActivity;->F:Landroid/widget/LinearLayout;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 807
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/BloodpresureActivity;->y:Lo/fcd;

    invoke-virtual {v0}, Lo/fcd;->notifyDataSetChanged()V

    .line 809
    :goto_0
    return-void
.end method

.method private c(ZI)V
    .locals 5

    .line 434
    new-instance v4, Lo/egy$b;

    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/BloodpresureActivity;->e:Landroid/content/Context;

    invoke-direct {v4, v0}, Lo/egy$b;-><init>(Landroid/content/Context;)V

    .line 435
    sget v0, Lcom/huawei/ui/main/R$string;->IDS_hw_health_show_healthdata_delete:I

    invoke-virtual {p0, v0}, Lcom/huawei/ui/main/stories/health/activity/healthdata/BloodpresureActivity;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v4, v0}, Lo/egy$b;->a(Ljava/lang/String;)Lo/egy$b;

    move-result-object v0

    sget v1, Lcom/huawei/ui/main/R$string;->IDS_hw_common_ui_dialog_confirm:I

    .line 436
    invoke-virtual {p0, v1}, Lcom/huawei/ui/main/stories/health/activity/healthdata/BloodpresureActivity;->getString(I)Ljava/lang/String;

    move-result-object v1

    new-instance v2, Lcom/huawei/ui/main/stories/health/activity/healthdata/BloodpresureActivity$14;

    invoke-direct {v2, p0, p1, p2}, Lcom/huawei/ui/main/stories/health/activity/healthdata/BloodpresureActivity$14;-><init>(Lcom/huawei/ui/main/stories/health/activity/healthdata/BloodpresureActivity;ZI)V

    invoke-virtual {v0, v1, v2}, Lo/egy$b;->c(Ljava/lang/String;Landroid/view/View$OnClickListener;)Lo/egy$b;

    move-result-object v0

    sget v1, Lcom/huawei/ui/main/R$string;->IDS_hw_show_cancel:I

    .line 452
    invoke-virtual {p0, v1}, Lcom/huawei/ui/main/stories/health/activity/healthdata/BloodpresureActivity;->getString(I)Ljava/lang/String;

    move-result-object v1

    new-instance v2, Lcom/huawei/ui/main/stories/health/activity/healthdata/BloodpresureActivity$10;

    invoke-direct {v2, p0}, Lcom/huawei/ui/main/stories/health/activity/healthdata/BloodpresureActivity$10;-><init>(Lcom/huawei/ui/main/stories/health/activity/healthdata/BloodpresureActivity;)V

    invoke-virtual {v0, v1, v2}, Lo/egy$b;->a(Ljava/lang/String;Landroid/view/View$OnClickListener;)Lo/egy$b;

    .line 458
    invoke-virtual {v4}, Lo/egy$b;->a()Lo/egy;

    move-result-object v3

    .line 459
    invoke-virtual {v3}, Lo/egy;->show()V

    .line 460
    return-void
.end method

.method static synthetic d(Lcom/huawei/ui/main/stories/health/activity/healthdata/BloodpresureActivity;D)D
    .locals 0

    .line 96
    iput-wide p1, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/BloodpresureActivity;->W:D

    return-wide p1
.end method

.method static synthetic d(Lcom/huawei/ui/main/stories/health/activity/healthdata/BloodpresureActivity;)Ljava/util/ArrayList;
    .locals 1

    .line 96
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/BloodpresureActivity;->R:Ljava/util/ArrayList;

    return-object v0
.end method

.method private d()V
    .locals 3

    .line 496
    invoke-virtual {p0}, Lcom/huawei/ui/main/stories/health/activity/healthdata/BloodpresureActivity;->isFinishing()Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/BloodpresureActivity;->N:Lo/ego;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/BloodpresureActivity;->N:Lo/ego;

    invoke-virtual {v0}, Lo/ego;->isShowing()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 497
    iget v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/BloodpresureActivity;->O:I

    mul-int/lit8 v0, v0, 0x64

    iget v1, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/BloodpresureActivity;->L:I

    div-int v2, v0, v1

    .line 498
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/BloodpresureActivity;->J:Lo/ego$a;

    invoke-virtual {v0, v2}, Lo/ego$a;->a(I)Lo/ego$a;

    .line 499
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/BloodpresureActivity;->J:Lo/ego$a;

    invoke-virtual {v0, v2}, Lo/ego$a;->b(I)Lo/ego$a;

    .line 501
    :cond_0
    return-void
.end method

.method private d(I)V
    .locals 10

    .line 816
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/BloodpresureActivity;->R:Ljava/util/ArrayList;

    if-nez v0, :cond_0

    .line 817
    const-string v0, "UIHLH_BloodpresureActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "mBloodPressureList = null!"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 818
    return-void

    .line 820
    :cond_0
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/BloodpresureActivity;->R:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-nez v0, :cond_1

    .line 821
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/BloodpresureActivity;->o:Lo/egb;

    const-string v1, ""

    invoke-virtual {v0, v1}, Lo/egb;->setText(Ljava/lang/CharSequence;)V

    .line 822
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/BloodpresureActivity;->l:Lo/egb;

    const-string v1, "--"

    invoke-virtual {v0, v1}, Lo/egb;->setText(Ljava/lang/CharSequence;)V

    .line 823
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/BloodpresureActivity;->n:Lo/egb;

    const-string v1, ""

    invoke-virtual {v0, v1}, Lo/egb;->setText(Ljava/lang/CharSequence;)V

    .line 824
    return-void

    .line 826
    :cond_1
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/BloodpresureActivity;->R:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-le p1, v0, :cond_2

    .line 827
    const-string v0, "UIHLH_BloodpresureActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "index set error!"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 828
    return-void

    .line 830
    :cond_2
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/BloodpresureActivity;->e:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Landroid/text/format/DateFormat;->getTimeFormat(Landroid/content/Context;)Ljava/text/DateFormat;

    move-result-object v4

    .line 831
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/BloodpresureActivity;->u:Lo/fdj;

    if-nez v0, :cond_3

    .line 832
    const-string v0, "UIHLH_BloodpresureActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "myHealthDataInteractors == null!"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 833
    return-void

    .line 835
    :cond_3
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/BloodpresureActivity;->u:Lo/fdj;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/BloodpresureActivity;->R:Ljava/util/ArrayList;

    invoke-virtual {v1, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lo/fdf;

    invoke-virtual {v1}, Lo/fdf;->b()J

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, Lo/fdj;->d(J)Ljava/lang/String;

    move-result-object v5

    .line 836
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/BloodpresureActivity;->o:Lo/egb;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, " "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget-object v2, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/BloodpresureActivity;->R:Ljava/util/ArrayList;

    invoke-virtual {v2, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lo/fdf;

    invoke-virtual {v2}, Lo/fdf;->b()J

    move-result-wide v2

    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    invoke-virtual {v4, v2}, Ljava/text/DateFormat;->format(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/egb;->setText(Ljava/lang/CharSequence;)V

    .line 837
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/BloodpresureActivity;->R:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lo/fdf;

    invoke-virtual {v0}, Lo/fdf;->c()D

    move-result-wide v0

    const/4 v2, 0x1

    const/4 v3, 0x0

    invoke-static {v0, v1, v2, v3}, Lo/cxh;->a(DII)Ljava/lang/String;

    move-result-object v6

    .line 838
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/BloodpresureActivity;->R:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lo/fdf;

    invoke-virtual {v0}, Lo/fdf;->d()D

    move-result-wide v0

    const/4 v2, 0x1

    const/4 v3, 0x0

    invoke-static {v0, v1, v2, v3}, Lo/cxh;->a(DII)Ljava/lang/String;

    move-result-object v7

    .line 839
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/BloodpresureActivity;->l:Lo/egb;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, "/"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/egb;->setText(Ljava/lang/CharSequence;)V

    .line 841
    invoke-static {}, Ljava/util/Locale;->getDefault()Ljava/util/Locale;

    move-result-object v0

    invoke-static {v0}, Ljava/text/NumberFormat;->getInstance(Ljava/util/Locale;)Ljava/text/NumberFormat;

    move-result-object v8

    .line 842
    if-nez p1, :cond_4

    .line 844
    :try_start_0
    invoke-virtual {v8, v6}, Ljava/text/NumberFormat;->parse(Ljava/lang/String;)Ljava/lang/Number;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Number;->doubleValue()D

    move-result-wide v0

    iput-wide v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/BloodpresureActivity;->V:D

    .line 845
    invoke-virtual {v8, v7}, Ljava/text/NumberFormat;->parse(Ljava/lang/String;)Ljava/lang/Number;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Number;->doubleValue()D

    move-result-wide v0

    iput-wide v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/BloodpresureActivity;->W:D
    :try_end_0
    .catch Ljava/text/ParseException; {:try_start_0 .. :try_end_0} :catch_0

    .line 848
    goto :goto_0

    .line 846
    :catch_0
    move-exception v9

    .line 847
    const-string v0, "UIHLH_BloodpresureActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    invoke-virtual {v9}, Ljava/text/ParseException;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 850
    :cond_4
    :goto_0
    invoke-direct {p0, v8, v6, v7}, Lcom/huawei/ui/main/stories/health/activity/healthdata/BloodpresureActivity;->c(Ljava/text/NumberFormat;Ljava/lang/String;Ljava/lang/String;)V

    .line 852
    return-void
.end method

.method private d(Ljava/lang/String;)V
    .locals 4

    .line 463
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/BloodpresureActivity;->C:Lo/fdj;

    if-nez v0, :cond_0

    .line 464
    const-string v0, "UIHLH_BloodpresureActivity"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const/4 v2, 0x0

    aput-object p1, v1, v2

    const-string v2, "healthDataManager == null"

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 465
    invoke-static {}, Lo/fdj;->e()Lo/fdj;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/BloodpresureActivity;->C:Lo/fdj;

    .line 467
    :cond_0
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/BloodpresureActivity;->v:Lcom/huawei/ui/main/stories/health/activity/healthdata/BloodpresureActivity$f;

    if-nez v0, :cond_1

    .line 468
    const-string v0, "UIHLH_BloodpresureActivity"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const/4 v2, 0x0

    aput-object p1, v1, v2

    const-string v2, "deleteDataResponseCallback == null"

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 469
    new-instance v0, Lcom/huawei/ui/main/stories/health/activity/healthdata/BloodpresureActivity$f;

    invoke-direct {v0, p0}, Lcom/huawei/ui/main/stories/health/activity/healthdata/BloodpresureActivity$f;-><init>(Lcom/huawei/ui/main/stories/health/activity/healthdata/BloodpresureActivity;)V

    iput-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/BloodpresureActivity;->v:Lcom/huawei/ui/main/stories/health/activity/healthdata/BloodpresureActivity$f;

    .line 471
    :cond_1
    return-void
.end method

.method private d(Z)V
    .locals 2

    .line 392
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/BloodpresureActivity;->b:Landroid/widget/CheckBox;

    invoke-virtual {v0, p1}, Landroid/widget/CheckBox;->setChecked(Z)V

    .line 393
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/BloodpresureActivity;->I:Lo/egb;

    if-eqz p1, :cond_0

    sget v1, Lcom/huawei/ui/main/R$string;->IDS_hw_show_main_health_page_healthdata_bloodpresure_cancel_select:I

    goto :goto_0

    :cond_0
    sget v1, Lcom/huawei/ui/main/R$string;->IDS_hw_show_main_health_page_healthdata_bloodpresure_select:I

    :goto_0
    invoke-virtual {v0, v1}, Lo/egb;->setText(I)V

    .line 395
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/BloodpresureActivity;->y:Lo/fcd;

    invoke-virtual {v0}, Lo/fcd;->c()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 396
    if-eqz p1, :cond_1

    .line 397
    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Lcom/huawei/ui/main/stories/health/activity/healthdata/BloodpresureActivity;->e(Z)V

    .line 398
    invoke-virtual {p0}, Lcom/huawei/ui/main/stories/health/activity/healthdata/BloodpresureActivity;->c()V

    .line 399
    const/4 v0, 0x1

    invoke-direct {p0, v0}, Lcom/huawei/ui/main/stories/health/activity/healthdata/BloodpresureActivity;->b(Z)V

    .line 400
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/BloodpresureActivity;->y:Lo/fcd;

    invoke-virtual {v0}, Lo/fcd;->notifyDataSetChanged()V

    goto :goto_1

    .line 402
    :cond_1
    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lcom/huawei/ui/main/stories/health/activity/healthdata/BloodpresureActivity;->e(Z)V

    .line 403
    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lcom/huawei/ui/main/stories/health/activity/healthdata/BloodpresureActivity;->b(Z)V

    .line 404
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/BloodpresureActivity;->y:Lo/fcd;

    invoke-virtual {v0}, Lo/fcd;->notifyDataSetChanged()V

    .line 407
    :cond_2
    :goto_1
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/BloodpresureActivity;->y:Lo/fcd;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lo/fcd;->b(Z)V

    .line 408
    return-void
.end method

.method static synthetic e(Lcom/huawei/ui/main/stories/health/activity/healthdata/BloodpresureActivity;)D
    .locals 2

    .line 96
    iget-wide v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/BloodpresureActivity;->V:D

    return-wide v0
.end method

.method static synthetic e(Lcom/huawei/ui/main/stories/health/activity/healthdata/BloodpresureActivity;Ljava/util/ArrayList;)Ljava/util/ArrayList;
    .locals 0

    .line 96
    iput-object p1, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/BloodpresureActivity;->R:Ljava/util/ArrayList;

    return-object p1
.end method

.method private e()V
    .locals 6

    .line 474
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/BloodpresureActivity;->M:Ljava/util/List;

    .line 476
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/BloodpresureActivity;->R:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    add-int/lit8 v5, v0, -0x1

    :goto_0
    if-ltz v5, :cond_1

    .line 477
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/BloodpresureActivity;->y:Lo/fcd;

    invoke-virtual {v0}, Lo/fcd;->d()Ljava/util/ArrayList;

    move-result-object v0

    invoke-virtual {v0, v5}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 478
    new-instance v4, Lcom/huawei/hihealth/HiTimeInterval;

    invoke-direct {v4}, Lcom/huawei/hihealth/HiTimeInterval;-><init>()V

    .line 479
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/BloodpresureActivity;->R:Ljava/util/ArrayList;

    invoke-virtual {v0, v5}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lo/fdf;

    invoke-virtual {v0}, Lo/fdf;->b()J

    move-result-wide v0

    invoke-virtual {v4, v0, v1}, Lcom/huawei/hihealth/HiTimeInterval;->setStartTime(J)V

    .line 480
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/BloodpresureActivity;->R:Ljava/util/ArrayList;

    invoke-virtual {v0, v5}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lo/fdf;

    invoke-virtual {v0}, Lo/fdf;->b()J

    move-result-wide v0

    invoke-virtual {v4, v0, v1}, Lcom/huawei/hihealth/HiTimeInterval;->setEndTime(J)V

    .line 481
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/BloodpresureActivity;->M:Ljava/util/List;

    invoke-interface {v0, v4}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 476
    :cond_0
    add-int/lit8 v5, v5, -0x1

    goto :goto_0

    .line 484
    :cond_1
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/BloodpresureActivity;->M:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    iput v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/BloodpresureActivity;->L:I

    .line 485
    const/4 v0, 0x0

    iput v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/BloodpresureActivity;->O:I

    .line 487
    const-string v0, "deleteDatas"

    invoke-direct {p0, v0}, Lcom/huawei/ui/main/stories/health/activity/healthdata/BloodpresureActivity;->d(Ljava/lang/String;)V

    .line 488
    iget v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/BloodpresureActivity;->L:I

    const/16 v1, 0x64

    if-le v0, v1, :cond_2

    .line 489
    invoke-direct {p0}, Lcom/huawei/ui/main/stories/health/activity/healthdata/BloodpresureActivity;->m()V

    .line 491
    :cond_2
    invoke-direct {p0}, Lcom/huawei/ui/main/stories/health/activity/healthdata/BloodpresureActivity;->i()V

    .line 492
    const-string v0, "UIHLH_BloodpresureActivity"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "deleteDatas "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const-string v2, "end"

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 493
    return-void
.end method

.method static synthetic e(Lcom/huawei/ui/main/stories/health/activity/healthdata/BloodpresureActivity;Z)V
    .locals 0

    .line 96
    invoke-direct {p0, p1}, Lcom/huawei/ui/main/stories/health/activity/healthdata/BloodpresureActivity;->c(Z)V

    return-void
.end method

.method private f()V
    .locals 12

    .line 526
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/BloodpresureActivity;->Z:Z

    .line 527
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/BloodpresureActivity;->z:Landroid/os/Handler;

    invoke-virtual {v0}, Landroid/os/Handler;->obtainMessage()Landroid/os/Message;

    move-result-object v9

    .line 528
    const/4 v0, 0x5

    iput v0, v9, Landroid/os/Message;->what:I

    .line 529
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/BloodpresureActivity;->z:Landroid/os/Handler;

    const-wide/16 v1, 0x12c

    invoke-virtual {v0, v9, v1, v2}, Landroid/os/Handler;->sendMessageDelayed(Landroid/os/Message;J)Z

    .line 535
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/BloodpresureActivity;->r:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    .line 540
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/BloodpresureActivity;->r:Ljava/util/ArrayList;

    const-string v1, "me"

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 541
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/BloodpresureActivity;->x:Lo/fcm;

    invoke-virtual {v0}, Lo/fcm;->notifyDataSetChanged()V

    .line 545
    :try_start_0
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/BloodpresureActivity;->u:Lo/fdj;

    if-eqz v0, :cond_0

    .line 546
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/BloodpresureActivity;->u:Lo/fdj;

    invoke-virtual {v0}, Lo/fdj;->c()V

    .line 547
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v10

    .line 548
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/BloodpresureActivity;->u:Lo/fdj;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/BloodpresureActivity;->e:Landroid/content/Context;

    move-wide v4, v10

    iget-object v8, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/BloodpresureActivity;->t:Lcom/huawei/ui/main/stories/health/activity/healthdata/BloodpresureActivity$h;

    const-wide/16 v2, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x7

    invoke-virtual/range {v0 .. v8}, Lo/fdj;->a(Landroid/content/Context;JJIILo/egg;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 553
    :cond_0
    goto :goto_0

    .line 551
    :catch_0
    move-exception v10

    .line 552
    const-string v0, "UIHLH_BloodpresureActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Exception = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v10}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 554
    :goto_0
    return-void
.end method

.method static synthetic f(Lcom/huawei/ui/main/stories/health/activity/healthdata/BloodpresureActivity;)V
    .locals 0

    .line 96
    invoke-direct {p0}, Lcom/huawei/ui/main/stories/health/activity/healthdata/BloodpresureActivity;->n()V

    return-void
.end method

.method static synthetic g(Lcom/huawei/ui/main/stories/health/activity/healthdata/BloodpresureActivity;)D
    .locals 2

    .line 96
    iget-wide v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/BloodpresureActivity;->W:D

    return-wide v0
.end method

.method private g()V
    .locals 1

    .line 575
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/BloodpresureActivity;->E:Landroid/graphics/drawable/AnimationDrawable;

    if-eqz v0, :cond_0

    .line 576
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/BloodpresureActivity;->E:Landroid/graphics/drawable/AnimationDrawable;

    invoke-virtual {v0}, Landroid/graphics/drawable/AnimationDrawable;->stop()V

    .line 578
    :cond_0
    return-void
.end method

.method static synthetic h(Lcom/huawei/ui/main/stories/health/activity/healthdata/BloodpresureActivity;)D
    .locals 2

    .line 96
    iget-wide v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/BloodpresureActivity;->T:D

    return-wide v0
.end method

.method private h()V
    .locals 2

    .line 566
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/BloodpresureActivity;->E:Landroid/graphics/drawable/AnimationDrawable;

    if-eqz v0, :cond_0

    .line 567
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/BloodpresureActivity;->c:Landroid/widget/LinearLayout;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 568
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/BloodpresureActivity;->A:Landroid/widget/RelativeLayout;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    .line 569
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/BloodpresureActivity;->a:Landroid/widget/LinearLayout;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 570
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/BloodpresureActivity;->E:Landroid/graphics/drawable/AnimationDrawable;

    invoke-virtual {v0}, Landroid/graphics/drawable/AnimationDrawable;->start()V

    .line 572
    :cond_0
    return-void
.end method

.method static synthetic i(Lcom/huawei/ui/main/stories/health/activity/healthdata/BloodpresureActivity;)Lo/emr;
    .locals 1

    .line 96
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/BloodpresureActivity;->U:Lo/emr;

    return-object v0
.end method

.method private i()V
    .locals 6

    .line 503
    iget v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/BloodpresureActivity;->O:I

    iget v1, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/BloodpresureActivity;->L:I

    if-ge v0, v1, :cond_1

    .line 504
    iget v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/BloodpresureActivity;->O:I

    add-int/lit8 v0, v0, 0x64

    iget v1, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/BloodpresureActivity;->L:I

    if-gt v0, v1, :cond_0

    .line 505
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/BloodpresureActivity;->C:Lo/fdj;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/BloodpresureActivity;->e:Landroid/content/Context;

    iget-object v2, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/BloodpresureActivity;->M:Ljava/util/List;

    iget v3, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/BloodpresureActivity;->O:I

    iget v4, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/BloodpresureActivity;->O:I

    add-int/lit8 v4, v4, 0x64

    invoke-interface {v2, v3, v4}, Ljava/util/List;->subList(II)Ljava/util/List;

    move-result-object v2

    iget-object v3, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/BloodpresureActivity;->v:Lcom/huawei/ui/main/stories/health/activity/healthdata/BloodpresureActivity$f;

    invoke-virtual {v0, v1, v2, v3}, Lo/fdj;->b(Landroid/content/Context;Ljava/util/List;Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V

    .line 506
    iget v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/BloodpresureActivity;->O:I

    add-int/lit8 v0, v0, 0x64

    iput v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/BloodpresureActivity;->O:I

    goto :goto_0

    .line 508
    :cond_0
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/BloodpresureActivity;->C:Lo/fdj;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/BloodpresureActivity;->e:Landroid/content/Context;

    iget-object v2, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/BloodpresureActivity;->M:Ljava/util/List;

    iget v3, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/BloodpresureActivity;->O:I

    iget v4, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/BloodpresureActivity;->L:I

    invoke-interface {v2, v3, v4}, Ljava/util/List;->subList(II)Ljava/util/List;

    move-result-object v2

    iget-object v3, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/BloodpresureActivity;->v:Lcom/huawei/ui/main/stories/health/activity/healthdata/BloodpresureActivity$f;

    invoke-virtual {v0, v1, v2, v3}, Lo/fdj;->b(Landroid/content/Context;Ljava/util/List;Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V

    .line 509
    iget v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/BloodpresureActivity;->L:I

    iput v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/BloodpresureActivity;->O:I

    .line 511
    :goto_0
    invoke-direct {p0}, Lcom/huawei/ui/main/stories/health/activity/healthdata/BloodpresureActivity;->d()V

    .line 513
    :cond_1
    return-void
.end method

.method private k()V
    .locals 1

    .line 722
    new-instance v0, Lcom/huawei/ui/main/stories/health/activity/healthdata/BloodpresureActivity$2;

    invoke-direct {v0, p0}, Lcom/huawei/ui/main/stories/health/activity/healthdata/BloodpresureActivity$2;-><init>(Lcom/huawei/ui/main/stories/health/activity/healthdata/BloodpresureActivity;)V

    iput-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/BloodpresureActivity;->ag:Ljava/util/Map;

    .line 730
    return-void
.end method

.method static synthetic k(Lcom/huawei/ui/main/stories/health/activity/healthdata/BloodpresureActivity;)V
    .locals 0

    .line 96
    invoke-direct {p0}, Lcom/huawei/ui/main/stories/health/activity/healthdata/BloodpresureActivity;->e()V

    return-void
.end method

.method static synthetic l(Lcom/huawei/ui/main/stories/health/activity/healthdata/BloodpresureActivity;)Landroid/widget/LinearLayout;
    .locals 1

    .line 96
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/BloodpresureActivity;->g:Landroid/widget/LinearLayout;

    return-object v0
.end method

.method private l()V
    .locals 4

    .line 903
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/BloodpresureActivity;->u:Lo/fdj;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/BloodpresureActivity;->R:Ljava/util/ArrayList;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/BloodpresureActivity;->R:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-eqz v0, :cond_0

    .line 904
    const-string v0, "UIHLH_BloodpresureActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "refreshListview: myHealthDataInteractors != null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 905
    const-string v0, "UIHLH_BloodpresureActivity"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "refreshListview: mBloodPressureList = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    iget-object v2, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/BloodpresureActivity;->R:Ljava/util/ArrayList;

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 906
    const-string v0, "UIHLH_BloodpresureActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "refreshListview: mBloodPressureList != null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 907
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/BloodpresureActivity;->Z:Z

    .line 908
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/BloodpresureActivity;->A:Landroid/widget/RelativeLayout;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    .line 909
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/BloodpresureActivity;->c:Landroid/widget/LinearLayout;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 910
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/BloodpresureActivity;->a:Landroid/widget/LinearLayout;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 911
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/BloodpresureActivity;->k:Landroid/widget/LinearLayout;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    goto :goto_0

    .line 913
    :cond_0
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/BloodpresureActivity;->Z:Z

    .line 914
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/BloodpresureActivity;->A:Landroid/widget/RelativeLayout;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    .line 915
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/BloodpresureActivity;->a:Landroid/widget/LinearLayout;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 916
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/BloodpresureActivity;->k:Landroid/widget/LinearLayout;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 917
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/BloodpresureActivity;->c:Landroid/widget/LinearLayout;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 919
    :goto_0
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/BloodpresureActivity;->y:Lo/fcd;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/BloodpresureActivity;->R:Ljava/util/ArrayList;

    invoke-virtual {v0, v1}, Lo/fcd;->c(Ljava/util/List;)V

    .line 920
    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lcom/huawei/ui/main/stories/health/activity/healthdata/BloodpresureActivity;->d(I)V

    .line 921
    return-void
.end method

.method static synthetic m(Lcom/huawei/ui/main/stories/health/activity/healthdata/BloodpresureActivity;)Landroid/widget/LinearLayout;
    .locals 1

    .line 96
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/BloodpresureActivity;->k:Landroid/widget/LinearLayout;

    return-object v0
.end method

.method private m()V
    .locals 3

    .line 1021
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/BloodpresureActivity;->N:Lo/ego;

    const/4 v1, 0x0

    if-ne v1, v0, :cond_0

    .line 1022
    new-instance v0, Lo/ego;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/BloodpresureActivity;->e:Landroid/content/Context;

    invoke-direct {v0, v1}, Lo/ego;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/BloodpresureActivity;->N:Lo/ego;

    .line 1023
    new-instance v0, Lo/ego$a;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/BloodpresureActivity;->e:Landroid/content/Context;

    invoke-direct {v0, v1}, Lo/ego$a;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/BloodpresureActivity;->J:Lo/ego$a;

    .line 1024
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/BloodpresureActivity;->J:Lo/ego$a;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/BloodpresureActivity;->e:Landroid/content/Context;

    sget v2, Lcom/huawei/ui/main/R$string;->IDS_hw_health_show_healthdata_deleteing:I

    invoke-virtual {v1, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/ego$a;->d(Ljava/lang/String;)Lo/ego$a;

    .line 1025
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/BloodpresureActivity;->J:Lo/ego$a;

    invoke-virtual {v0}, Lo/ego$a;->d()Lo/ego;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/BloodpresureActivity;->N:Lo/ego;

    .line 1026
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/BloodpresureActivity;->N:Lo/ego;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lo/ego;->setCanceledOnTouchOutside(Z)V

    .line 1027
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/BloodpresureActivity;->N:Lo/ego;

    new-instance v1, Lcom/huawei/ui/main/stories/health/activity/healthdata/BloodpresureActivity$1;

    invoke-direct {v1, p0}, Lcom/huawei/ui/main/stories/health/activity/healthdata/BloodpresureActivity$1;-><init>(Lcom/huawei/ui/main/stories/health/activity/healthdata/BloodpresureActivity;)V

    invoke-virtual {v0, v1}, Lo/ego;->setOnKeyListener(Landroid/content/DialogInterface$OnKeyListener;)V

    .line 1037
    :cond_0
    invoke-virtual {p0}, Lcom/huawei/ui/main/stories/health/activity/healthdata/BloodpresureActivity;->isFinishing()Z

    move-result v0

    if-nez v0, :cond_1

    .line 1038
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/BloodpresureActivity;->N:Lo/ego;

    invoke-virtual {v0}, Lo/ego;->show()V

    .line 1040
    :cond_1
    return-void
.end method

.method static synthetic n(Lcom/huawei/ui/main/stories/health/activity/healthdata/BloodpresureActivity;)Lo/fcd;
    .locals 1

    .line 96
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/BloodpresureActivity;->y:Lo/fcd;

    return-object v0
.end method

.method private n()V
    .locals 5

    .line 773
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/BloodpresureActivity;->y:Lo/fcd;

    invoke-virtual {v0}, Lo/fcd;->e()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 774
    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lcom/huawei/ui/main/stories/health/activity/healthdata/BloodpresureActivity;->e(Z)V

    .line 775
    const/4 v4, 0x0

    :goto_0
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/BloodpresureActivity;->R:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-ge v4, v0, :cond_0

    .line 776
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/BloodpresureActivity;->y:Lo/fcd;

    invoke-virtual {v0}, Lo/fcd;->d()Ljava/util/ArrayList;

    move-result-object v0

    const/4 v1, 0x0

    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    invoke-virtual {v0, v4, v1}, Ljava/util/ArrayList;->set(ILjava/lang/Object;)Ljava/lang/Object;

    .line 775
    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    .line 778
    :cond_0
    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lcom/huawei/ui/main/stories/health/activity/healthdata/BloodpresureActivity;->a(Z)V

    .line 779
    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lcom/huawei/ui/main/stories/health/activity/healthdata/BloodpresureActivity;->c(Z)V

    goto :goto_1

    .line 781
    :cond_1
    const-string v0, "UIHLH_BloodpresureActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "onBackPressed"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 782
    invoke-direct {p0}, Lcom/huawei/ui/main/stories/health/activity/healthdata/BloodpresureActivity;->o()V

    .line 784
    :goto_1
    return-void
.end method

.method static synthetic o(Lcom/huawei/ui/main/stories/health/activity/healthdata/BloodpresureActivity;)Landroid/widget/ImageView;
    .locals 1

    .line 96
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/BloodpresureActivity;->s:Landroid/widget/ImageView;

    return-object v0
.end method

.method private o()V
    .locals 5

    .line 757
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/BloodpresureActivity;->aa:Ljava/lang/String;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/BloodpresureActivity;->aa:Ljava/lang/String;

    const-string v1, "MyHealthData"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 758
    const-string v0, "UIHLH_BloodpresureActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "onBackPressed jumpToDeviceActivity is Success"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 759
    new-instance v4, Landroid/content/Intent;

    invoke-direct {v4}, Landroid/content/Intent;-><init>()V

    .line 760
    const-string v0, "com.huawei.health"

    invoke-virtual {v4, v0}, Landroid/content/Intent;->setPackage(Ljava/lang/String;)Landroid/content/Intent;

    .line 761
    const-string v0, "com.huawei.health"

    const-string v1, "com.huawei.health.device.ui.DeviceMainActivity"

    invoke-virtual {v4, v0, v1}, Landroid/content/Intent;->setClassName(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 763
    const-string v0, "kind"

    const-string v1, "HDK_UNKNOWN"

    invoke-virtual {v4, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 764
    const-string v0, "view"

    const-string v1, "ListDevice"

    invoke-virtual {v4, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 765
    invoke-virtual {p0, v4}, Lcom/huawei/ui/main/stories/health/activity/healthdata/BloodpresureActivity;->startActivity(Landroid/content/Intent;)V

    .line 766
    goto :goto_0

    .line 767
    :cond_0
    const-string v0, "UIHLH_BloodpresureActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "onBackPressed jumpToDeviceActivity is Fail"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 769
    :goto_0
    invoke-virtual {p0}, Lcom/huawei/ui/main/stories/health/activity/healthdata/BloodpresureActivity;->finish()V

    .line 770
    return-void
.end method

.method static synthetic p(Lcom/huawei/ui/main/stories/health/activity/healthdata/BloodpresureActivity;)Landroid/widget/LinearLayout;
    .locals 1

    .line 96
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/BloodpresureActivity;->f:Landroid/widget/LinearLayout;

    return-object v0
.end method

.method static synthetic q(Lcom/huawei/ui/main/stories/health/activity/healthdata/BloodpresureActivity;)V
    .locals 0

    .line 96
    invoke-direct {p0}, Lcom/huawei/ui/main/stories/health/activity/healthdata/BloodpresureActivity;->f()V

    return-void
.end method

.method static synthetic r(Lcom/huawei/ui/main/stories/health/activity/healthdata/BloodpresureActivity;)Landroid/widget/LinearLayout;
    .locals 1

    .line 96
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/BloodpresureActivity;->i:Landroid/widget/LinearLayout;

    return-object v0
.end method

.method static synthetic s(Lcom/huawei/ui/main/stories/health/activity/healthdata/BloodpresureActivity;)V
    .locals 0

    .line 96
    invoke-direct {p0}, Lcom/huawei/ui/main/stories/health/activity/healthdata/BloodpresureActivity;->l()V

    return-void
.end method

.method static synthetic t(Lcom/huawei/ui/main/stories/health/activity/healthdata/BloodpresureActivity;)I
    .locals 1

    .line 96
    iget v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/BloodpresureActivity;->L:I

    return v0
.end method

.method static synthetic u(Lcom/huawei/ui/main/stories/health/activity/healthdata/BloodpresureActivity;)I
    .locals 1

    .line 96
    iget v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/BloodpresureActivity;->O:I

    return v0
.end method

.method static synthetic v(Lcom/huawei/ui/main/stories/health/activity/healthdata/BloodpresureActivity;)Z
    .locals 1

    .line 96
    iget-boolean v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/BloodpresureActivity;->Z:Z

    return v0
.end method

.method static synthetic w(Lcom/huawei/ui/main/stories/health/activity/healthdata/BloodpresureActivity;)V
    .locals 0

    .line 96
    invoke-direct {p0}, Lcom/huawei/ui/main/stories/health/activity/healthdata/BloodpresureActivity;->h()V

    return-void
.end method

.method static synthetic x(Lcom/huawei/ui/main/stories/health/activity/healthdata/BloodpresureActivity;)V
    .locals 0

    .line 96
    invoke-direct {p0}, Lcom/huawei/ui/main/stories/health/activity/healthdata/BloodpresureActivity;->g()V

    return-void
.end method

.method static synthetic y(Lcom/huawei/ui/main/stories/health/activity/healthdata/BloodpresureActivity;)V
    .locals 0

    .line 96
    invoke-direct {p0}, Lcom/huawei/ui/main/stories/health/activity/healthdata/BloodpresureActivity;->i()V

    return-void
.end method


# virtual methods
.method public a()V
    .locals 2

    .line 1043
    invoke-virtual {p0}, Lcom/huawei/ui/main/stories/health/activity/healthdata/BloodpresureActivity;->isFinishing()Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/BloodpresureActivity;->N:Lo/ego;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 1044
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/BloodpresureActivity;->N:Lo/ego;

    invoke-virtual {v0}, Lo/ego;->cancel()V

    .line 1045
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/BloodpresureActivity;->N:Lo/ego;

    .line 1047
    :cond_0
    return-void
.end method

.method public c()V
    .locals 6

    .line 417
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/BloodpresureActivity;->y:Lo/fcd;

    invoke-virtual {v0}, Lo/fcd;->b()I

    move-result v0

    if-nez v0, :cond_0

    .line 418
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/BloodpresureActivity;->U:Lo/emr;

    sget v1, Lcom/huawei/ui/main/R$string;->IDS_hw_show_main_health_page_healthdata_selectNone:I

    invoke-virtual {p0, v1}, Lcom/huawei/ui/main/stories/health/activity/healthdata/BloodpresureActivity;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/emr;->setTitleText(Ljava/lang/String;)V

    goto :goto_0

    .line 420
    :cond_0
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/BloodpresureActivity;->U:Lo/emr;

    invoke-virtual {p0}, Lcom/huawei/ui/main/stories/health/activity/healthdata/BloodpresureActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/ui/main/R$plurals;->IDS_hw_weight_delete_check_measure_data:I

    const/4 v3, 0x1

    new-array v3, v3, [Ljava/lang/Object;

    iget-object v4, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/BloodpresureActivity;->y:Lo/fcd;

    invoke-virtual {v4}, Lo/fcd;->b()I

    move-result v4

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    const/4 v5, 0x0

    aput-object v4, v3, v5

    const/4 v4, 0x1

    invoke-virtual {v1, v2, v4, v3}, Landroid/content/res/Resources;->getQuantityString(II[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/emr;->setTitleText(Ljava/lang/String;)V

    .line 421
    :goto_0
    return-void
.end method

.method public e(Z)V
    .locals 6

    .line 424
    if-eqz p1, :cond_0

    .line 425
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/BloodpresureActivity;->U:Lo/emr;

    invoke-virtual {p0}, Lcom/huawei/ui/main/stories/health/activity/healthdata/BloodpresureActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/ui/main/R$plurals;->IDS_hw_weight_delete_check_measure_data:I

    const/4 v3, 0x1

    new-array v3, v3, [Ljava/lang/Object;

    iget-object v4, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/BloodpresureActivity;->y:Lo/fcd;

    invoke-virtual {v4}, Lo/fcd;->b()I

    move-result v4

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    const/4 v5, 0x0

    aput-object v4, v3, v5

    const/4 v4, 0x1

    invoke-virtual {v1, v2, v4, v3}, Landroid/content/res/Resources;->getQuantityString(II[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/emr;->setTitleText(Ljava/lang/String;)V

    goto :goto_0

    .line 427
    :cond_0
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/BloodpresureActivity;->U:Lo/emr;

    sget v1, Lcom/huawei/ui/main/R$string;->IDS_hw_show_main_health_page_healthdata_selectNone:I

    invoke-virtual {p0, v1}, Lcom/huawei/ui/main/stories/health/activity/healthdata/BloodpresureActivity;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/emr;->setTitleText(Ljava/lang/String;)V

    .line 429
    :goto_0
    return-void
.end method

.method public onClick(Landroid/view/View;)V
    .locals 4

    .line 734
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/BloodpresureActivity;->ag:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 735
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/BloodpresureActivity;->ag:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/ui/main/stories/health/activity/healthdata/BloodpresureActivity$b;

    invoke-interface {v0}, Lcom/huawei/ui/main/stories/health/activity/healthdata/BloodpresureActivity$b;->b()V

    goto :goto_0

    .line 738
    :cond_0
    const-string v0, "UIHLH_BloodpresureActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "mMapClickCallback.get(view) is NULL"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 740
    :goto_0
    return-void
.end method

.method public onCreate(Landroid/os/Bundle;)V
    .locals 5

    .line 171
    invoke-super {p0, p1}, Lcom/huawei/ui/commonui/base/BaseActivity;->onCreate(Landroid/os/Bundle;)V

    .line 172
    sget v0, Lcom/huawei/ui/main/R$layout;->health_data_bloodpresure:I

    invoke-virtual {p0, v0}, Lcom/huawei/ui/main/stories/health/activity/healthdata/BloodpresureActivity;->setContentView(I)V

    .line 173
    invoke-virtual {p0}, Lcom/huawei/ui/main/stories/health/activity/healthdata/BloodpresureActivity;->getIntent()Landroid/content/Intent;

    move-result-object v4

    .line 174
    if-eqz v4, :cond_0

    .line 175
    const-string v0, "healthdata"

    invoke-virtual {v4, v0}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 176
    const-string v0, "healthdata"

    invoke-virtual {v4, v0}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/BloodpresureActivity;->aa:Ljava/lang/String;

    .line 179
    :cond_0
    iput-object p0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/BloodpresureActivity;->e:Landroid/content/Context;

    .line 180
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/BloodpresureActivity;->ac:Z

    .line 181
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/BloodpresureActivity;->e:Landroid/content/Context;

    sget v1, Lcom/huawei/ui/main/R$layout;->health_data_bloodpresure_header:I

    const/4 v2, 0x0

    invoke-static {v0, v1, v2}, Landroid/view/View;->inflate(Landroid/content/Context;ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/BloodpresureActivity;->D:Landroid/view/View;

    .line 182
    new-instance v0, Lo/dlu;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/BloodpresureActivity;->e:Landroid/content/Context;

    invoke-direct {v0, v1}, Lo/dlu;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/BloodpresureActivity;->Y:Lo/dlu;

    .line 183
    invoke-static {}, Ljava/util/concurrent/Executors;->newSingleThreadExecutor()Ljava/util/concurrent/ExecutorService;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/BloodpresureActivity;->ab:Ljava/util/concurrent/ExecutorService;

    .line 184
    invoke-direct {p0}, Lcom/huawei/ui/main/stories/health/activity/healthdata/BloodpresureActivity;->b()V

    .line 185
    invoke-direct {p0}, Lcom/huawei/ui/main/stories/health/activity/healthdata/BloodpresureActivity;->f()V

    .line 186
    if-eqz v4, :cond_1

    .line 187
    const-string v0, "refreshCard"

    invoke-virtual {v4, v0}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_1

    .line 188
    const-string v0, "refreshCard"

    const/4 v1, 0x0

    invoke-virtual {v4, v0, v1}, Landroid/content/Intent;->getBooleanExtra(Ljava/lang/String;Z)Z

    move-result v0

    iput-boolean v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/BloodpresureActivity;->X:Z

    .line 191
    :cond_1
    const-string v0, "UIHLH_BloodpresureActivity"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "refreshCard = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    iget-boolean v2, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/BloodpresureActivity;->X:Z

    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 192
    iget-boolean v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/BloodpresureActivity;->X:Z

    if-eqz v0, :cond_2

    .line 193
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/BloodpresureActivity;->e:Landroid/content/Context;

    const/16 v1, 0x8

    invoke-static {v0, v1}, Lo/fdx;->e(Landroid/content/Context;I)V

    .line 195
    :cond_2
    invoke-static {}, Lo/czu;->e()Z

    move-result v0

    if-nez v0, :cond_3

    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/BloodpresureActivity;->e:Landroid/content/Context;

    invoke-static {v0}, Lo/dmn;->b(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 196
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/BloodpresureActivity;->ab:Ljava/util/concurrent/ExecutorService;

    new-instance v1, Lcom/huawei/ui/main/stories/health/activity/healthdata/BloodpresureActivity$5;

    invoke-direct {v1, p0}, Lcom/huawei/ui/main/stories/health/activity/healthdata/BloodpresureActivity$5;-><init>(Lcom/huawei/ui/main/stories/health/activity/healthdata/BloodpresureActivity;)V

    invoke-interface {v0, v1}, Ljava/util/concurrent/ExecutorService;->execute(Ljava/lang/Runnable;)V

    .line 215
    :cond_3
    return-void
.end method

.method public onDestroy()V
    .locals 2

    .line 1085
    invoke-super {p0}, Lcom/huawei/ui/commonui/base/BaseActivity;->onDestroy()V

    .line 1086
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/BloodpresureActivity;->ab:Ljava/util/concurrent/ExecutorService;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 1087
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/BloodpresureActivity;->ab:Ljava/util/concurrent/ExecutorService;

    invoke-interface {v0}, Ljava/util/concurrent/ExecutorService;->shutdown()V

    .line 1089
    :cond_0
    return-void
.end method

.method public onKeyDown(ILandroid/view/KeyEvent;)Z
    .locals 1

    .line 748
    const/4 v0, 0x4

    if-ne p1, v0, :cond_0

    .line 749
    invoke-direct {p0}, Lcom/huawei/ui/main/stories/health/activity/healthdata/BloodpresureActivity;->n()V

    .line 750
    const/4 v0, 0x1

    return v0

    .line 752
    :cond_0
    invoke-super {p0, p1, p2}, Lcom/huawei/ui/commonui/base/BaseActivity;->onKeyDown(ILandroid/view/KeyEvent;)Z

    move-result v0

    return v0
.end method

.method protected onRestart()V
    .locals 2

    .line 558
    invoke-super {p0}, Lcom/huawei/ui/commonui/base/BaseActivity;->onRestart()V

    .line 559
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/BloodpresureActivity;->ac:Z

    .line 560
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/BloodpresureActivity;->H:Landroid/widget/LinearLayout;

    invoke-virtual {v0}, Landroid/widget/LinearLayout;->getVisibility()I

    move-result v0

    const/16 v1, 0x8

    if-ne v0, v1, :cond_0

    .line 561
    invoke-direct {p0}, Lcom/huawei/ui/main/stories/health/activity/healthdata/BloodpresureActivity;->f()V

    .line 563
    :cond_0
    return-void
.end method

.method public onResume()V
    .locals 2

    .line 231
    invoke-super {p0}, Lcom/huawei/ui/commonui/base/BaseActivity;->onResume()V

    .line 232
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/BloodpresureActivity;->e:Landroid/content/Context;

    new-instance v1, Lcom/huawei/ui/main/stories/health/activity/healthdata/BloodpresureActivity$4;

    invoke-direct {v1, p0}, Lcom/huawei/ui/main/stories/health/activity/healthdata/BloodpresureActivity$4;-><init>(Lcom/huawei/ui/main/stories/health/activity/healthdata/BloodpresureActivity;)V

    invoke-static {v0, v1}, Lo/fjb;->a(Landroid/content/Context;Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V

    .line 239
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/BloodpresureActivity;->m:Lo/egb;

    invoke-static {v0}, Lo/fiu;->d(Landroid/widget/TextView;)V

    .line 240
    return-void
.end method

.method public onStart()V
    .locals 0

    .line 220
    invoke-super {p0}, Lcom/huawei/ui/commonui/base/BaseActivity;->onStart()V

    .line 221
    return-void
.end method

.method public onStop()V
    .locals 0

    .line 225
    invoke-super {p0}, Lcom/huawei/ui/commonui/base/BaseActivity;->onStop()V

    .line 226
    return-void
.end method
