.class public Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackDetailActivity;
.super Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackBaseActivity;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackDetailActivity$e;,
        Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackDetailActivity$c;
    }
.end annotation


# instance fields
.field private A:Lo/egb;

.field private B:Landroid/widget/RelativeLayout;

.field private C:I

.field private D:Z

.field private E:Lo/emq;

.field private F:Lo/cgq;

.field private G:Landroid/view/View;

.field private H:Z

.field private I:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<Ljava/lang/String;Ljava/lang/Integer;>;"
        }
    .end annotation
.end field

.field private J:Landroid/graphics/Bitmap;

.field private K:Landroid/os/Handler;

.field private L:Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackDetailActivity$e;

.field private N:Landroid/app/ProgressDialog;

.field private b:Lcom/huawei/healthcloud/plugintrack/ui/fragment/PaceFrag;

.field private c:Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackScreenFrag;

.field private f:Lcom/huawei/healthcloud/plugintrack/ui/fragment/HeartRateFrag;

.field private g:Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackSwimSegmentFrag;

.field private h:Landroid/widget/ImageButton;

.field private i:Lcom/huawei/healthcloud/plugintrack/ui/fragment/DetailFrag;

.field private j:J

.field private k:Landroid/widget/ImageButton;

.field private l:Landroid/os/Bundle;

.field private m:Landroid/widget/ImageButton;

.field private n:Lo/chi;

.field private o:Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackDetailActivity$c;

.field private p:Landroid/content/res/Resources;

.field private q:Landroid/content/Context;

.field private r:Lo/cgt;

.field private s:Lo/cex;

.field private t:Lcom/huawei/healthcloud/plugintrack/model/MotionPathSimplify;

.field private u:Ljava/lang/String;

.field private v:Z

.field private w:J

.field private x:Z

.field private y:Z

.field private z:[J


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 69
    invoke-direct {p0}, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackBaseActivity;-><init>()V

    .line 80
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackDetailActivity;->k:Landroid/widget/ImageButton;

    .line 81
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackDetailActivity;->h:Landroid/widget/ImageButton;

    .line 82
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackDetailActivity;->m:Landroid/widget/ImageButton;

    .line 83
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackDetailActivity;->l:Landroid/os/Bundle;

    .line 84
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackDetailActivity;->o:Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackDetailActivity$c;

    .line 87
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackDetailActivity;->p:Landroid/content/res/Resources;

    .line 90
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackDetailActivity;->s:Lo/cex;

    .line 91
    new-instance v0, Lcom/huawei/healthcloud/plugintrack/model/MotionPathSimplify;

    invoke-direct {v0}, Lcom/huawei/healthcloud/plugintrack/model/MotionPathSimplify;-><init>()V

    iput-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackDetailActivity;->t:Lcom/huawei/healthcloud/plugintrack/model/MotionPathSimplify;

    .line 96
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackDetailActivity;->r:Lo/cgt;

    .line 97
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackDetailActivity;->q:Landroid/content/Context;

    .line 101
    const-wide/16 v0, 0x0

    iput-wide v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackDetailActivity;->w:J

    .line 104
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackDetailActivity;->x:Z

    .line 106
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackDetailActivity;->v:Z

    .line 107
    const/4 v0, 0x4

    new-array v0, v0, [J

    iput-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackDetailActivity;->z:[J

    .line 108
    const/4 v0, 0x0

    iput v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackDetailActivity;->C:I

    .line 112
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackDetailActivity;->D:Z

    .line 115
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackDetailActivity;->H:Z

    .line 130
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackDetailActivity;->I:Ljava/util/Map;

    .line 803
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackDetailActivity;->J:Landroid/graphics/Bitmap;

    .line 805
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackDetailActivity;->N:Landroid/app/ProgressDialog;

    .line 845
    new-instance v0, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackDetailActivity$2;

    invoke-direct {v0, p0}, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackDetailActivity$2;-><init>(Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackDetailActivity;)V

    iput-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackDetailActivity;->K:Landroid/os/Handler;

    .line 924
    new-instance v0, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackDetailActivity$1;

    invoke-direct {v0, p0}, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackDetailActivity$1;-><init>(Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackDetailActivity;)V

    iput-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackDetailActivity;->L:Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackDetailActivity$e;

    return-void
.end method

.method private A()V
    .locals 5

    .line 780
    new-instance v2, Landroid/content/Intent;

    invoke-direct {v2}, Landroid/content/Intent;-><init>()V

    .line 781
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackDetailActivity;->q:Landroid/content/Context;

    const-class v1, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackCustomShareActivity;

    invoke-virtual {v2, v0, v1}, Landroid/content/Intent;->setClass(Landroid/content/Context;Ljava/lang/Class;)Landroid/content/Intent;

    .line 782
    invoke-static {}, Lo/cfa;->b()Lo/cfa;

    move-result-object v3

    .line 783
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackDetailActivity;->r:Lo/cgt;

    invoke-virtual {v3, v0}, Lo/cfa;->b(Lo/cgt;)V

    .line 784
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackDetailActivity;->J:Landroid/graphics/Bitmap;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackDetailActivity;->c:Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackScreenFrag;

    if-eqz v0, :cond_0

    .line 785
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackDetailActivity;->c:Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackScreenFrag;

    invoke-virtual {v0}, Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackScreenFrag;->c()Z

    move-result v0

    invoke-virtual {v3, v0}, Lo/cfa;->e(Z)V

    .line 786
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackDetailActivity;->J:Landroid/graphics/Bitmap;

    const/16 v1, 0xc8

    invoke-static {v0, v1}, Lo/cds;->e(Landroid/graphics/Bitmap;I)[B

    move-result-object v0

    invoke-virtual {v3, v0}, Lo/cfa;->c([B)V

    goto :goto_0

    .line 788
    :cond_0
    const/4 v0, 0x0

    invoke-virtual {v3, v0}, Lo/cfa;->c([B)V

    .line 790
    :goto_0
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackDetailActivity;->c:Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackScreenFrag;

    if-nez v0, :cond_1

    .line 791
    const/4 v0, 0x0

    invoke-virtual {v3, v0}, Lo/cfa;->a(Ljava/util/List;)V

    goto :goto_1

    .line 793
    :cond_1
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackDetailActivity;->c:Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackScreenFrag;

    invoke-virtual {v0}, Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackScreenFrag;->b()Ljava/util/List;

    move-result-object v4

    .line 794
    if-eqz v4, :cond_2

    invoke-interface {v4}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_3

    .line 795
    :cond_2
    const/4 v0, 0x0

    invoke-virtual {v3, v0}, Lo/cfa;->a(Ljava/util/List;)V

    goto :goto_1

    .line 797
    :cond_3
    invoke-virtual {v3, v4}, Lo/cfa;->a(Ljava/util/List;)V

    .line 800
    :goto_1
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackDetailActivity;->q:Landroid/content/Context;

    invoke-virtual {v0, v2}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V

    .line 801
    return-void
.end method

.method private B()V
    .locals 7

    .line 889
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackDetailActivity;->q:Landroid/content/Context;

    if-nez v0, :cond_0

    .line 890
    const-string v0, "Track_TrackDetailActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "showDuplicatedDialog mContext is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 891
    return-void

    .line 893
    :cond_0
    const-string v0, "Track_TrackDetailActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "showDuplicatedDialog"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 894
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackDetailActivity;->q:Landroid/content/Context;

    sget v1, Lcom/huawei/healthcloud/plugintrack/R$string;->IDS_hwh_motiontrack_duplicated_track_tips2:I

    invoke-virtual {v0, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v4

    .line 895
    invoke-static {}, Lo/czu;->i()Z

    move-result v0

    if-nez v0, :cond_1

    .line 896
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackDetailActivity;->q:Landroid/content/Context;

    sget v1, Lcom/huawei/healthcloud/plugintrack/R$string;->IDS_hwh_motiontrack_duplicated_track_tips:I

    invoke-virtual {v0, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v4

    .line 898
    :cond_1
    new-instance v0, Lo/egv$b;

    iget-object v1, p0, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackDetailActivity;->q:Landroid/content/Context;

    invoke-direct {v0, v1}, Lo/egv$b;-><init>(Landroid/content/Context;)V

    sget v1, Lcom/huawei/healthcloud/plugintrack/R$string;->IDS_service_area_notice_title:I

    .line 899
    invoke-virtual {v0, v1}, Lo/egv$b;->b(I)Lo/egv$b;

    move-result-object v0

    .line 900
    invoke-virtual {v0, v4}, Lo/egv$b;->b(Ljava/lang/String;)Lo/egv$b;

    move-result-object v0

    sget v1, Lcom/huawei/healthcloud/plugintrack/R$string;->IDS_common_notification_know_tips:I

    new-instance v2, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackDetailActivity$5;

    invoke-direct {v2, p0}, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackDetailActivity$5;-><init>(Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackDetailActivity;)V

    .line 901
    invoke-virtual {v0, v1, v2}, Lo/egv$b;->b(ILandroid/view/View$OnClickListener;)Lo/egv$b;

    move-result-object v5

    .line 907
    invoke-virtual {v5}, Lo/egv$b;->b()Lo/egv;

    move-result-object v6

    .line 908
    invoke-virtual {v6}, Lo/egv;->show()V

    .line 909
    return-void
.end method

.method private C()V
    .locals 6

    .line 717
    new-instance v4, Landroid/content/Intent;

    invoke-direct {v4}, Landroid/content/Intent;-><init>()V

    .line 718
    const-string v0, "com.huawei.health"

    invoke-virtual {v4, v0}, Landroid/content/Intent;->setPackage(Ljava/lang/String;)Landroid/content/Intent;

    .line 719
    const-string v0, "com.huawei.health"

    const-string v1, "com.huawei.health.receiver.MainProcessHelperService"

    invoke-virtual {v4, v0, v1}, Landroid/content/Intent;->setClassName(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 721
    const-string v0, "start_main_process_for_pluginsuggestion"

    invoke-virtual {v4, v0}, Landroid/content/Intent;->setAction(Ljava/lang/String;)Landroid/content/Intent;

    .line 722
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v5

    .line 723
    const-string v0, "Track_TrackDetailActivity"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "startMainProcess "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object v5, v1, v2

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 724
    if-eqz v5, :cond_0

    .line 725
    invoke-virtual {v5, v4}, Landroid/content/Context;->startService(Landroid/content/Intent;)Landroid/content/ComponentName;

    .line 727
    :cond_0
    return-void
.end method

.method private D()V
    .locals 6

    .line 870
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackDetailActivity;->q:Landroid/content/Context;

    if-nez v0, :cond_0

    .line 871
    const-string v0, "Track_TrackDetailActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "showAbnormalTrackDialog mContext is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 872
    return-void

    .line 874
    :cond_0
    const-string v0, "Track_TrackDetailActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "showAbnormalTrackDialog"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 875
    new-instance v0, Lo/egv$b;

    iget-object v1, p0, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackDetailActivity;->q:Landroid/content/Context;

    invoke-direct {v0, v1}, Lo/egv$b;-><init>(Landroid/content/Context;)V

    sget v1, Lcom/huawei/healthcloud/plugintrack/R$string;->IDS_service_area_notice_title:I

    .line 876
    invoke-virtual {v0, v1}, Lo/egv$b;->b(I)Lo/egv$b;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackDetailActivity;->q:Landroid/content/Context;

    sget v2, Lcom/huawei/healthcloud/plugintrack/R$string;->IDS_hwh_motiontrack_abnormal_track_tips:I

    .line 877
    invoke-virtual {v1, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/egv$b;->b(Ljava/lang/String;)Lo/egv$b;

    move-result-object v0

    sget v1, Lcom/huawei/healthcloud/plugintrack/R$string;->IDS_common_notification_know_tips:I

    new-instance v2, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackDetailActivity$3;

    invoke-direct {v2, p0}, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackDetailActivity$3;-><init>(Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackDetailActivity;)V

    .line 878
    invoke-virtual {v0, v1, v2}, Lo/egv$b;->b(ILandroid/view/View$OnClickListener;)Lo/egv$b;

    move-result-object v4

    .line 884
    invoke-virtual {v4}, Lo/egv$b;->b()Lo/egv;

    move-result-object v5

    .line 885
    invoke-virtual {v5}, Lo/egv;->show()V

    .line 886
    return-void
.end method

.method private H()Z
    .locals 6

    .line 952
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackDetailActivity;->q:Landroid/content/Context;

    iget-object v1, p0, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackDetailActivity;->q:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/dbf;->n(Landroid/content/Context;Ljava/lang/String;)Z

    move-result v3

    .line 953
    const/4 v0, 0x2

    new-array v4, v0, [Ljava/lang/String;

    const-string v0, "android.permission.WRITE_EXTERNAL_STORAGE"

    const/4 v1, 0x0

    aput-object v0, v4, v1

    const-string v0, "android.permission.READ_EXTERNAL_STORAGE"

    const/4 v1, 0x1

    aput-object v0, v4, v1

    .line 956
    if-eqz v3, :cond_0

    .line 957
    const/4 v0, 0x1

    return v0

    .line 960
    :cond_0
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackDetailActivity;->q:Landroid/content/Context;

    invoke-static {v0, v4}, Lo/dbe;->c(Landroid/content/Context;[Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_3

    .line 961
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x17

    if-lt v0, v1, :cond_3

    .line 962
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackDetailActivity;->q:Landroid/content/Context;

    const-string v1, "android.permission.WRITE_EXTERNAL_STORAGE"

    invoke-static {v0, v1}, Lo/dbf;->l(Landroid/content/Context;Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_1

    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackDetailActivity;->q:Landroid/content/Context;

    check-cast v0, Landroid/app/Activity;

    const-string v1, "android.permission.WRITE_EXTERNAL_STORAGE"

    .line 963
    invoke-virtual {v0, v1}, Landroid/app/Activity;->shouldShowRequestPermissionRationale(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_2

    :cond_1
    const/4 v5, 0x1

    goto :goto_0

    :cond_2
    const/4 v5, 0x0

    .line 964
    :goto_0
    if-nez v5, :cond_3

    .line 965
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackDetailActivity;->q:Landroid/content/Context;

    iget-object v1, p0, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackDetailActivity;->q:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/healthcloud/plugintrack/R$string;->IDS_hw_feedback_permission_guide_torage:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/ene;->c(Landroid/content/Context;Ljava/lang/String;)V

    .line 967
    const/4 v0, 0x0

    return v0

    .line 972
    :cond_3
    const/4 v0, 0x1

    return v0
.end method

.method static synthetic a(Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackDetailActivity;)Lo/cgq;
    .locals 1

    .line 69
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackDetailActivity;->F:Lo/cgq;

    return-object v0
.end method

.method private a(I)V
    .locals 2

    .line 326
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackDetailActivity;->c:Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackScreenFrag;

    if-eqz v0, :cond_0

    .line 327
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackDetailActivity;->c:Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackScreenFrag;

    invoke-virtual {v0, p1}, Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackScreenFrag;->e(I)V

    .line 329
    :cond_0
    invoke-direct {p0, p1}, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackDetailActivity;->e(I)V

    .line 330
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackDetailActivity;->I:Ljava/util/Map;

    const-string v1, "paceFrag"

    invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    if-ne p1, v0, :cond_1

    .line 331
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackDetailActivity;->y:Z

    goto :goto_0

    .line 333
    :cond_1
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackDetailActivity;->y:Z

    .line 336
    :goto_0
    return-void
.end method

.method private a(Landroid/content/Context;)V
    .locals 6

    .line 733
    const-string v0, "Track_TrackDetailActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "startRecommendActivity"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 734
    const-string v4, "com.huawei.health"

    .line 735
    const-string v5, "com.huawei.ui.main.stories.smartcenter.activity.WeightRecommendActivity"

    .line 736
    new-instance v0, Landroid/os/Handler;

    invoke-direct {v0}, Landroid/os/Handler;-><init>()V

    new-instance v1, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackDetailActivity$4;

    invoke-direct {v1, p0, p1}, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackDetailActivity$4;-><init>(Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackDetailActivity;Landroid/content/Context;)V

    const-wide/16 v2, 0x3e8

    invoke-virtual {v0, v1, v2, v3}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 753
    return-void
.end method

.method private a(Z)V
    .locals 2

    .line 933
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackDetailActivity;->h:Landroid/widget/ImageButton;

    if-eqz p1, :cond_0

    const/4 v1, 0x0

    goto :goto_0

    :cond_0
    const/16 v1, 0x8

    :goto_0
    invoke-virtual {v0, v1}, Landroid/widget/ImageButton;->setVisibility(I)V

    .line 936
    return-void
.end method

.method static synthetic b(Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackDetailActivity;Landroid/graphics/Bitmap;)Landroid/graphics/Bitmap;
    .locals 0

    .line 69
    iput-object p1, p0, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackDetailActivity;->J:Landroid/graphics/Bitmap;

    return-object p1
.end method

.method static synthetic b(Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackDetailActivity;)Ljava/util/Map;
    .locals 1

    .line 69
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackDetailActivity;->I:Ljava/util/Map;

    return-object v0
.end method

.method static synthetic c(Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackDetailActivity;Z)V
    .locals 0

    .line 69
    invoke-direct {p0, p1}, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackDetailActivity;->a(Z)V

    return-void
.end method

.method private c(Z)V
    .locals 2

    .line 943
    if-eqz p1, :cond_0

    .line 944
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackDetailActivity;->m:Landroid/widget/ImageButton;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/ImageButton;->setVisibility(I)V

    goto :goto_0

    .line 946
    :cond_0
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackDetailActivity;->m:Landroid/widget/ImageButton;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/ImageButton;->setVisibility(I)V

    .line 949
    :goto_0
    return-void
.end method

.method static synthetic c(Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackDetailActivity;)Z
    .locals 1

    .line 69
    iget-boolean v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackDetailActivity;->x:Z

    return v0
.end method

.method static synthetic d(Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackDetailActivity;)Landroid/widget/RelativeLayout;
    .locals 1

    .line 69
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackDetailActivity;->B:Landroid/widget/RelativeLayout;

    return-object v0
.end method

.method static synthetic d(Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackDetailActivity;I)V
    .locals 0

    .line 69
    invoke-direct {p0, p1}, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackDetailActivity;->a(I)V

    return-void
.end method

.method static synthetic d(Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackDetailActivity;Z)Z
    .locals 0

    .line 69
    iput-boolean p1, p0, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackDetailActivity;->D:Z

    return p1
.end method

.method private e(I)V
    .locals 8

    .line 339
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v6

    .line 340
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackDetailActivity;->z:[J

    iget v1, p0, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackDetailActivity;->C:I

    aget-wide v2, v0, v1

    iget-wide v4, p0, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackDetailActivity;->j:J

    sub-long v4, v6, v4

    add-long/2addr v2, v4

    aput-wide v2, v0, v1

    .line 341
    iput p1, p0, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackDetailActivity;->C:I

    .line 342
    iput-wide v6, p0, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackDetailActivity;->j:J

    .line 343
    return-void
.end method

.method static synthetic e(Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackDetailActivity;Z)V
    .locals 0

    .line 69
    invoke-direct {p0, p1}, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackDetailActivity;->c(Z)V

    return-void
.end method

.method static synthetic e(Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackDetailActivity;)Z
    .locals 1

    .line 69
    iget-boolean v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackDetailActivity;->D:Z

    return v0
.end method

.method static synthetic f(Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackDetailActivity;)V
    .locals 0

    .line 69
    invoke-direct {p0}, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackDetailActivity;->A()V

    return-void
.end method

.method static synthetic g(Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackDetailActivity;)Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackScreenFrag;
    .locals 1

    .line 69
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackDetailActivity;->c:Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackScreenFrag;

    return-object v0
.end method

.method static synthetic i(Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackDetailActivity;)Lo/cgt;
    .locals 1

    .line 69
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackDetailActivity;->r:Lo/cgt;

    return-object v0
.end method

.method private j()V
    .locals 4

    .line 758
    sget v0, Lcom/huawei/healthcloud/plugintrack/R$string;->IDS_motiontrack_common_ui_waiting:I

    invoke-virtual {p0, v0}, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackDetailActivity;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackDetailActivity;->e(Ljava/lang/String;)V

    .line 762
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackDetailActivity;->r:Lo/cgt;

    if-nez v0, :cond_0

    .line 763
    const-string v0, "Track_TrackDetailActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "mTrackDetailDataManager is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 764
    invoke-virtual {p0}, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackDetailActivity;->c()V

    .line 765
    return-void

    .line 768
    :cond_0
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackDetailActivity;->r:Lo/cgt;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lo/cgt;->b(I)Z

    move-result v0

    if-nez v0, :cond_1

    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackDetailActivity;->c:Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackScreenFrag;

    if-nez v0, :cond_2

    .line 769
    :cond_1
    const-string v0, "Track_TrackDetailActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "trackFrag is hided or null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 770
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackDetailActivity;->K:Landroid/os/Handler;

    const/4 v1, 0x1

    const-wide/16 v2, 0xc8

    invoke-virtual {v0, v1, v2, v3}, Landroid/os/Handler;->sendEmptyMessageDelayed(IJ)Z

    .line 771
    return-void

    .line 775
    :cond_2
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackDetailActivity;->c:Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackScreenFrag;

    iget-object v1, p0, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackDetailActivity;->K:Landroid/os/Handler;

    invoke-virtual {v0, v1}, Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackScreenFrag;->c(Landroid/os/Handler;)V

    .line 777
    return-void
.end method

.method private l()V
    .locals 5

    .line 176
    sget v0, Lcom/huawei/healthcloud/plugintrack/R$id;->pager:I

    invoke-virtual {p0, v0}, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackDetailActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lo/chi;

    iput-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackDetailActivity;->n:Lo/chi;

    .line 178
    new-instance v0, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackDetailActivity$c;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackDetailActivity$c;-><init>(Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackDetailActivity;Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackDetailActivity$4;)V

    iput-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackDetailActivity;->o:Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackDetailActivity$c;

    .line 179
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackDetailActivity;->n:Lo/chi;

    iget-object v1, p0, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackDetailActivity;->o:Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackDetailActivity$c;

    invoke-virtual {v0, v1}, Lo/chi;->addOnPageChangeListener(Landroid/support/v4/view/ViewPager$OnPageChangeListener;)V

    .line 181
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackDetailActivity;->n:Lo/chi;

    const/4 v1, 0x4

    invoke-virtual {v0, v1}, Lo/chi;->setOffscreenPageLimit(I)V

    .line 183
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackDetailActivity;->n:Lo/chi;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lo/chi;->setScanScroll(Z)V

    .line 186
    new-instance v0, Lo/cgq;

    iget-object v1, p0, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackDetailActivity;->n:Lo/chi;

    iget-object v2, p0, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackDetailActivity;->E:Lo/emq;

    invoke-direct {v0, p0, v1, v2}, Lo/cgq;-><init>(Landroid/support/v4/app/FragmentActivity;Landroid/support/v4/view/ViewPager;Lo/emq;)V

    iput-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackDetailActivity;->F:Lo/cgq;

    .line 189
    invoke-direct {p0}, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackDetailActivity;->m()Ljava/lang/String;

    move-result-object v3

    .line 190
    invoke-direct {p0}, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackDetailActivity;->v()V

    .line 193
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackDetailActivity;->c:Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackScreenFrag;

    if-eqz v0, :cond_0

    .line 194
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackDetailActivity;->E:Lo/emq;

    iget-object v1, p0, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackDetailActivity;->q:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/healthcloud/plugintrack/R$string;->IDS_motiontrack_show_detail_locus:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/emq;->newSubTab(Ljava/lang/CharSequence;)Lhuawei/widget/HwSubTabWidget$SubTab;

    move-result-object v4

    .line 195
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackDetailActivity;->F:Lo/cgq;

    iget-object v1, p0, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackDetailActivity;->c:Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackScreenFrag;

    const/4 v2, 0x1

    invoke-virtual {v0, v4, v1, v2}, Lo/cgq;->c(Lhuawei/widget/HwSubTabWidget$SubTab;Landroid/support/v4/app/Fragment;Z)V

    .line 198
    :cond_0
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackDetailActivity;->b:Lcom/huawei/healthcloud/plugintrack/ui/fragment/PaceFrag;

    if-nez v0, :cond_1

    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackDetailActivity;->g:Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackSwimSegmentFrag;

    if-eqz v0, :cond_3

    .line 199
    :cond_1
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackDetailActivity;->E:Lo/emq;

    invoke-virtual {v0, v3}, Lo/emq;->newSubTab(Ljava/lang/CharSequence;)Lhuawei/widget/HwSubTabWidget$SubTab;

    move-result-object v4

    .line 200
    iget-boolean v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackDetailActivity;->H:Z

    if-eqz v0, :cond_2

    .line 201
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackDetailActivity;->F:Lo/cgq;

    iget-object v1, p0, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackDetailActivity;->g:Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackSwimSegmentFrag;

    const/4 v2, 0x0

    invoke-virtual {v0, v4, v1, v2}, Lo/cgq;->c(Lhuawei/widget/HwSubTabWidget$SubTab;Landroid/support/v4/app/Fragment;Z)V

    goto :goto_0

    .line 203
    :cond_2
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackDetailActivity;->F:Lo/cgq;

    iget-object v1, p0, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackDetailActivity;->b:Lcom/huawei/healthcloud/plugintrack/ui/fragment/PaceFrag;

    const/4 v2, 0x0

    invoke-virtual {v0, v4, v1, v2}, Lo/cgq;->c(Lhuawei/widget/HwSubTabWidget$SubTab;Landroid/support/v4/app/Fragment;Z)V

    .line 207
    :cond_3
    :goto_0
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackDetailActivity;->f:Lcom/huawei/healthcloud/plugintrack/ui/fragment/HeartRateFrag;

    if-eqz v0, :cond_4

    .line 208
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackDetailActivity;->E:Lo/emq;

    iget-object v1, p0, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackDetailActivity;->q:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/healthcloud/plugintrack/R$string;->IDS_motiontrack_show_detail_chart:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/emq;->newSubTab(Ljava/lang/CharSequence;)Lhuawei/widget/HwSubTabWidget$SubTab;

    move-result-object v4

    .line 209
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackDetailActivity;->F:Lo/cgq;

    iget-object v1, p0, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackDetailActivity;->f:Lcom/huawei/healthcloud/plugintrack/ui/fragment/HeartRateFrag;

    const/4 v2, 0x0

    invoke-virtual {v0, v4, v1, v2}, Lo/cgq;->c(Lhuawei/widget/HwSubTabWidget$SubTab;Landroid/support/v4/app/Fragment;Z)V

    .line 212
    :cond_4
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackDetailActivity;->i:Lcom/huawei/healthcloud/plugintrack/ui/fragment/DetailFrag;

    if-eqz v0, :cond_6

    .line 213
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackDetailActivity;->E:Lo/emq;

    iget-object v1, p0, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackDetailActivity;->q:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/healthcloud/plugintrack/R$string;->IDS_motiontrack_show_detail_detail:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/emq;->newSubTab(Ljava/lang/CharSequence;)Lhuawei/widget/HwSubTabWidget$SubTab;

    move-result-object v4

    .line 214
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackDetailActivity;->r:Lo/cgt;

    if-eqz v0, :cond_5

    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackDetailActivity;->r:Lo/cgt;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lo/cgt;->b(I)Z

    move-result v0

    if-eqz v0, :cond_5

    .line 215
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackDetailActivity;->F:Lo/cgq;

    iget-object v1, p0, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackDetailActivity;->i:Lcom/huawei/healthcloud/plugintrack/ui/fragment/DetailFrag;

    const/4 v2, 0x1

    invoke-virtual {v0, v4, v1, v2}, Lo/cgq;->c(Lhuawei/widget/HwSubTabWidget$SubTab;Landroid/support/v4/app/Fragment;Z)V

    goto :goto_1

    .line 217
    :cond_5
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackDetailActivity;->F:Lo/cgq;

    iget-object v1, p0, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackDetailActivity;->i:Lcom/huawei/healthcloud/plugintrack/ui/fragment/DetailFrag;

    const/4 v2, 0x0

    invoke-virtual {v0, v4, v1, v2}, Lo/cgq;->c(Lhuawei/widget/HwSubTabWidget$SubTab;Landroid/support/v4/app/Fragment;Z)V

    .line 228
    :cond_6
    :goto_1
    return-void
.end method

.method private m()Ljava/lang/String;
    .locals 3

    .line 230
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackDetailActivity;->r:Lo/cgt;

    if-eqz v0, :cond_2

    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackDetailActivity;->r:Lo/cgt;

    invoke-virtual {v0}, Lo/cgt;->c()Lcom/huawei/healthcloud/plugintrack/model/MotionPathSimplify;

    move-result-object v0

    if-eqz v0, :cond_2

    .line 231
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackDetailActivity;->r:Lo/cgt;

    invoke-virtual {v0}, Lo/cgt;->c()Lcom/huawei/healthcloud/plugintrack/model/MotionPathSimplify;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/healthcloud/plugintrack/model/MotionPathSimplify;->requestSportType()I

    move-result v2

    .line 232
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackDetailActivity;->r:Lo/cgt;

    invoke-virtual {v0}, Lo/cgt;->s()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 233
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackDetailActivity;->p:Landroid/content/res/Resources;

    sget v1, Lcom/huawei/healthcloud/plugintrack/R$string;->IDS_motiontrack_show_sport_tip_icon_text_pace:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v0

    return-object v0

    .line 234
    :cond_0
    const/16 v0, 0x106

    if-eq v2, v0, :cond_1

    const/16 v0, 0x10a

    if-ne v2, v0, :cond_2

    .line 235
    :cond_1
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackDetailActivity;->H:Z

    .line 236
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackDetailActivity;->p:Landroid/content/res/Resources;

    sget v1, Lcom/huawei/healthcloud/plugintrack/R$string;->IDS_hwh_motiontrack_swim_segment:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v0

    return-object v0

    .line 240
    :cond_2
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackDetailActivity;->p:Landroid/content/res/Resources;

    sget v1, Lcom/huawei/healthcloud/plugintrack/R$string;->IDS_motiontrack_show_map_sport_peisu_1:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method private n()V
    .locals 2

    .line 251
    new-instance v0, Lo/cgt;

    invoke-direct {v0}, Lo/cgt;-><init>()V

    iput-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackDetailActivity;->r:Lo/cgt;

    .line 252
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackDetailActivity;->r:Lo/cgt;

    iget-object v1, p0, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackDetailActivity;->t:Lcom/huawei/healthcloud/plugintrack/model/MotionPathSimplify;

    invoke-virtual {v0, v1}, Lo/cgt;->d(Lcom/huawei/healthcloud/plugintrack/model/MotionPathSimplify;)V

    .line 253
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackDetailActivity;->r:Lo/cgt;

    iget-object v1, p0, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackDetailActivity;->s:Lo/cex;

    invoke-virtual {v0, v1}, Lo/cgt;->b(Lo/cex;)V

    .line 254
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackDetailActivity;->r:Lo/cgt;

    invoke-virtual {v0}, Lo/cgt;->d()V

    .line 256
    return-void
.end method

.method private o()V
    .locals 5

    .line 134
    sget v0, Lcom/huawei/healthcloud/plugintrack/R$layout;->track_detail_page:I

    invoke-virtual {p0, v0}, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackDetailActivity;->setContentView(I)V

    .line 135
    sget v0, Lcom/huawei/healthcloud/plugintrack/R$id;->navigation_right_iconbtn1:I

    invoke-virtual {p0, v0}, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackDetailActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageButton;

    iput-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackDetailActivity;->h:Landroid/widget/ImageButton;

    .line 136
    sget v0, Lcom/huawei/healthcloud/plugintrack/R$id;->navigation_right_iconbtn2:I

    invoke-virtual {p0, v0}, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackDetailActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageButton;

    iput-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackDetailActivity;->m:Landroid/widget/ImageButton;

    .line 137
    sget v0, Lcom/huawei/healthcloud/plugintrack/R$id;->navigation_left_iconbtn1:I

    invoke-virtual {p0, v0}, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackDetailActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageButton;

    iput-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackDetailActivity;->k:Landroid/widget/ImageButton;

    .line 138
    sget v0, Lcom/huawei/healthcloud/plugintrack/R$id;->navigation_left_my_health_data:I

    invoke-virtual {p0, v0}, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackDetailActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lo/egb;

    iput-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackDetailActivity;->A:Lo/egb;

    .line 139
    invoke-static {p0}, Lo/cxa;->d(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 140
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackDetailActivity;->k:Landroid/widget/ImageButton;

    sget v1, Lcom/huawei/healthcloud/plugintrack/R$drawable;->ic_public_back_rtl:I

    invoke-virtual {v0, v1}, Landroid/widget/ImageButton;->setImageResource(I)V

    goto :goto_0

    .line 142
    :cond_0
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackDetailActivity;->k:Landroid/widget/ImageButton;

    sget v1, Lcom/huawei/healthcloud/plugintrack/R$drawable;->ic_public_black_lift_back:I

    invoke-virtual {v0, v1}, Landroid/widget/ImageButton;->setImageResource(I)V

    .line 145
    :goto_0
    sget v0, Lcom/huawei/healthcloud/plugintrack/R$id;->statusbar_panel:I

    invoke-virtual {p0, v0}, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackDetailActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackDetailActivity;->G:Landroid/view/View;

    .line 146
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackDetailActivity;->q:Landroid/content/Context;

    invoke-static {v0}, Lo/ene;->b(Landroid/content/Context;)I

    move-result v3

    .line 147
    new-instance v4, Landroid/widget/LinearLayout$LayoutParams;

    const/4 v0, -0x1

    invoke-direct {v4, v0, v3}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    .line 148
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackDetailActivity;->G:Landroid/view/View;

    invoke-virtual {v0, v4}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 149
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackDetailActivity;->G:Landroid/view/View;

    invoke-virtual {p0}, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackDetailActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/healthcloud/plugintrack/R$color;->emui_color_gray_1:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getColor(I)I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/view/View;->setBackgroundColor(I)V

    .line 151
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackDetailActivity;->h:Landroid/widget/ImageButton;

    invoke-virtual {v0, p0}, Landroid/widget/ImageButton;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 152
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackDetailActivity;->m:Landroid/widget/ImageButton;

    invoke-virtual {v0, p0}, Landroid/widget/ImageButton;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 153
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackDetailActivity;->k:Landroid/widget/ImageButton;

    invoke-virtual {v0, p0}, Landroid/widget/ImageButton;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 156
    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackDetailActivity;->a(Z)V

    .line 158
    sget v0, Lcom/huawei/healthcloud/plugintrack/R$id;->track_detail_sub_tab_layout:I

    invoke-virtual {p0, v0}, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackDetailActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lo/emq;

    iput-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackDetailActivity;->E:Lo/emq;

    .line 160
    invoke-direct {p0}, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackDetailActivity;->l()V

    .line 163
    iget-boolean v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackDetailActivity;->x:Z

    if-eqz v0, :cond_1

    .line 164
    const/4 v0, 0x1

    invoke-direct {p0, v0}, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackDetailActivity;->c(Z)V

    goto :goto_1

    .line 166
    :cond_1
    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackDetailActivity;->c(Z)V

    .line 170
    :goto_1
    sget v0, Lcom/huawei/healthcloud/plugintrack/R$id;->layout_operation_tip:I

    invoke-virtual {p0, v0}, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackDetailActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/RelativeLayout;

    iput-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackDetailActivity;->B:Landroid/widget/RelativeLayout;

    .line 171
    return-void
.end method

.method private p()V
    .locals 5

    .line 276
    invoke-direct {p0}, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackDetailActivity;->t()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 277
    const-string v0, "Track_TrackDetailActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "onClick() if (isClickFast())"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 278
    return-void

    .line 281
    :cond_0
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackDetailActivity;->f:Lcom/huawei/healthcloud/plugintrack/ui/fragment/HeartRateFrag;

    if-eqz v0, :cond_2

    .line 282
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackDetailActivity;->f:Lcom/huawei/healthcloud/plugintrack/ui/fragment/HeartRateFrag;

    invoke-virtual {v0}, Lcom/huawei/healthcloud/plugintrack/ui/fragment/HeartRateFrag;->b()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 283
    const-string v0, "Track_TrackDetailActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "dont click share and chart sametime"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 284
    return-void

    .line 286
    :cond_1
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackDetailActivity;->f:Lcom/huawei/healthcloud/plugintrack/ui/fragment/HeartRateFrag;

    invoke-virtual {v0}, Lcom/huawei/healthcloud/plugintrack/ui/fragment/HeartRateFrag;->d()V

    .line 290
    :cond_2
    invoke-direct {p0}, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackDetailActivity;->C()V

    .line 291
    new-instance v4, Ljava/util/HashMap;

    invoke-direct {v4}, Ljava/util/HashMap;-><init>()V

    .line 292
    const-string v0, "click"

    const/4 v1, 0x1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v4, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 293
    const-string v0, "type"

    const/4 v1, 0x2

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v4, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 294
    invoke-static {}, Lo/cxf;->e()Lo/cxf;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackDetailActivity;->q:Landroid/content/Context;

    sget-object v2, Lo/dae;->hL:Lo/dae;

    invoke-virtual {v2}, Lo/dae;->b()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    invoke-virtual {v0, v1, v2, v4, v3}, Lo/cxf;->a(Landroid/content/Context;Ljava/lang/String;Ljava/util/Map;I)I

    .line 295
    return-void
.end method

.method private q()Z
    .locals 4

    .line 403
    new-instance v3, Lo/cee;

    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    new-instance v1, Lo/dcy;

    invoke-direct {v1}, Lo/dcy;-><init>()V

    .line 405
    const/16 v2, 0x4e22

    invoke-static {v2}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v2

    invoke-direct {v3, v0, v1, v2}, Lo/cee;-><init>(Landroid/content/Context;Lo/dcy;Ljava/lang/String;)V

    .line 406
    invoke-virtual {v3}, Lo/cee;->p()Z

    move-result v0

    return v0
.end method

.method private r()V
    .locals 5

    .line 299
    invoke-direct {p0}, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackDetailActivity;->t()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 300
    const-string v0, "Track_TrackDetailActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "onClick() if (isClickFast())"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 301
    return-void

    .line 303
    :cond_0
    invoke-direct {p0}, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackDetailActivity;->H()Z

    move-result v0

    if-nez v0, :cond_1

    .line 304
    const-string v0, "Track_TrackDetailActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "checkStoragePermission  is  false"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 305
    return-void

    .line 308
    :cond_1
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackDetailActivity;->f:Lcom/huawei/healthcloud/plugintrack/ui/fragment/HeartRateFrag;

    if-eqz v0, :cond_3

    .line 309
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackDetailActivity;->f:Lcom/huawei/healthcloud/plugintrack/ui/fragment/HeartRateFrag;

    invoke-virtual {v0}, Lcom/huawei/healthcloud/plugintrack/ui/fragment/HeartRateFrag;->b()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 310
    const-string v0, "Track_TrackDetailActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "dont click share and chart sametime"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 311
    return-void

    .line 313
    :cond_2
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackDetailActivity;->f:Lcom/huawei/healthcloud/plugintrack/ui/fragment/HeartRateFrag;

    invoke-virtual {v0}, Lcom/huawei/healthcloud/plugintrack/ui/fragment/HeartRateFrag;->d()V

    .line 317
    :cond_3
    invoke-direct {p0}, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackDetailActivity;->j()V

    .line 318
    new-instance v4, Ljava/util/HashMap;

    invoke-direct {v4}, Ljava/util/HashMap;-><init>()V

    .line 319
    const-string v0, "click"

    const/4 v1, 0x1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v4, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 320
    const-string v0, "type"

    const/4 v1, 0x4

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v4, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 321
    invoke-static {}, Lo/cxf;->e()Lo/cxf;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackDetailActivity;->q:Landroid/content/Context;

    sget-object v2, Lo/dae;->hL:Lo/dae;

    invoke-virtual {v2}, Lo/dae;->b()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    invoke-virtual {v0, v1, v2, v4, v3}, Lo/cxf;->a(Landroid/content/Context;Ljava/lang/String;Ljava/util/Map;I)I

    .line 322
    return-void
.end method

.method private s()V
    .locals 1

    .line 410
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackDetailActivity;->c:Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackScreenFrag;

    .line 411
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackDetailActivity;->b:Lcom/huawei/healthcloud/plugintrack/ui/fragment/PaceFrag;

    .line 412
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackDetailActivity;->f:Lcom/huawei/healthcloud/plugintrack/ui/fragment/HeartRateFrag;

    .line 413
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackDetailActivity;->i:Lcom/huawei/healthcloud/plugintrack/ui/fragment/DetailFrag;

    .line 414
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackDetailActivity;->g:Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackSwimSegmentFrag;

    .line 415
    return-void
.end method

.method private t()Z
    .locals 6

    .line 349
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v4

    .line 351
    iget-wide v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackDetailActivity;->w:J

    sub-long v0, v4, v0

    const-wide/16 v2, 0x3e8

    cmp-long v0, v2, v0

    if-lez v0, :cond_0

    .line 352
    const-string v0, "Track_TrackDetailActivity"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "onClick"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const-string v2, ">_< >_< click too much"

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 353
    iput-wide v4, p0, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackDetailActivity;->w:J

    .line 354
    const/4 v0, 0x1

    return v0

    .line 356
    :cond_0
    iput-wide v4, p0, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackDetailActivity;->w:J

    .line 357
    const/4 v0, 0x0

    return v0
.end method

.method private u()V
    .locals 3

    .line 396
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackDetailActivity;->r:Lo/cgt;

    invoke-virtual {v0}, Lo/cgt;->c()Lcom/huawei/healthcloud/plugintrack/model/MotionPathSimplify;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 397
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackDetailActivity;->r:Lo/cgt;

    invoke-virtual {v0}, Lo/cgt;->c()Lcom/huawei/healthcloud/plugintrack/model/MotionPathSimplify;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/healthcloud/plugintrack/model/MotionPathSimplify;->requestSportType()I

    move-result v2

    .line 398
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackDetailActivity;->A:Lo/egb;

    iget-object v1, p0, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackDetailActivity;->q:Landroid/content/Context;

    invoke-static {v1, v2}, Lo/cds;->c(Landroid/content/Context;I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/egb;->setText(Ljava/lang/CharSequence;)V

    .line 400
    :cond_0
    return-void
.end method

.method private v()V
    .locals 5

    .line 650
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackDetailActivity;->r:Lo/cgt;

    if-nez v0, :cond_0

    .line 651
    const-string v0, "Track_TrackDetailActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, " initHideAndShowView() mTrackDetailDataManager is null, do not hide tab"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 652
    return-void

    .line 656
    :cond_0
    const/4 v4, 0x1

    .line 657
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackDetailActivity;->r:Lo/cgt;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lo/cgt;->b(I)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 658
    const/4 v0, 0x1

    invoke-direct {p0, v0}, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackDetailActivity;->a(Z)V

    .line 659
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackDetailActivity;->c:Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackScreenFrag;

    .line 660
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackDetailActivity;->z:[J

    const-wide/16 v1, -0x1

    const/4 v3, 0x0

    aput-wide v1, v0, v3

    goto :goto_0

    .line 662
    :cond_1
    new-instance v0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackScreenFrag;

    invoke-direct {v0}, Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackScreenFrag;-><init>()V

    iput-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackDetailActivity;->c:Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackScreenFrag;

    .line 663
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackDetailActivity;->c:Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackScreenFrag;

    iget-object v1, p0, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackDetailActivity;->L:Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackDetailActivity$e;

    invoke-virtual {v0, v1}, Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackScreenFrag;->e(Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackDetailActivity$e;)V

    .line 664
    const/4 v4, 0x0

    .line 666
    :goto_0
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackDetailActivity;->r:Lo/cgt;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lo/cgt;->b(I)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 668
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackDetailActivity;->b:Lcom/huawei/healthcloud/plugintrack/ui/fragment/PaceFrag;

    .line 669
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackDetailActivity;->z:[J

    const-wide/16 v1, -0x1

    const/4 v3, 0x1

    aput-wide v1, v0, v3

    goto :goto_2

    .line 671
    :cond_2
    iget-boolean v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackDetailActivity;->H:Z

    if-eqz v0, :cond_3

    .line 672
    new-instance v0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackSwimSegmentFrag;

    invoke-direct {v0}, Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackSwimSegmentFrag;-><init>()V

    iput-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackDetailActivity;->g:Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackSwimSegmentFrag;

    goto :goto_1

    .line 674
    :cond_3
    new-instance v0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/PaceFrag;

    invoke-direct {v0}, Lcom/huawei/healthcloud/plugintrack/ui/fragment/PaceFrag;-><init>()V

    iput-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackDetailActivity;->b:Lcom/huawei/healthcloud/plugintrack/ui/fragment/PaceFrag;

    .line 676
    :goto_1
    const/4 v4, 0x0

    .line 678
    :goto_2
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackDetailActivity;->r:Lo/cgt;

    const/4 v1, 0x2

    invoke-virtual {v0, v1}, Lo/cgt;->b(I)Z

    move-result v0

    if-eqz v0, :cond_4

    .line 680
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackDetailActivity;->f:Lcom/huawei/healthcloud/plugintrack/ui/fragment/HeartRateFrag;

    .line 681
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackDetailActivity;->z:[J

    const-wide/16 v1, -0x1

    const/4 v3, 0x2

    aput-wide v1, v0, v3

    goto :goto_3

    .line 683
    :cond_4
    new-instance v0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/HeartRateFrag;

    invoke-direct {v0}, Lcom/huawei/healthcloud/plugintrack/ui/fragment/HeartRateFrag;-><init>()V

    iput-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackDetailActivity;->f:Lcom/huawei/healthcloud/plugintrack/ui/fragment/HeartRateFrag;

    .line 684
    const/4 v4, 0x0

    .line 687
    :goto_3
    new-instance v0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/DetailFrag;

    invoke-direct {v0}, Lcom/huawei/healthcloud/plugintrack/ui/fragment/DetailFrag;-><init>()V

    iput-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackDetailActivity;->i:Lcom/huawei/healthcloud/plugintrack/ui/fragment/DetailFrag;

    .line 689
    if-eqz v4, :cond_5

    .line 690
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackDetailActivity;->E:Lo/emq;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Lo/emq;->setVisibility(I)V

    .line 694
    :cond_5
    invoke-direct {p0}, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackDetailActivity;->w()V

    .line 695
    return-void
.end method

.method private w()V
    .locals 4

    .line 698
    const/4 v3, 0x0

    .line 699
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackDetailActivity;->r:Lo/cgt;

    if-eqz v0, :cond_0

    .line 700
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackDetailActivity;->r:Lo/cgt;

    invoke-virtual {v0}, Lo/cgt;->e()I

    move-result v3

    .line 704
    :cond_0
    if-nez v3, :cond_1

    .line 705
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackDetailActivity;->n:Lo/chi;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lo/chi;->setCurrentItem(I)V

    goto :goto_0

    .line 707
    :cond_1
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackDetailActivity;->n:Lo/chi;

    iget-object v1, p0, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackDetailActivity;->F:Lo/cgq;

    invoke-virtual {v1}, Lo/cgq;->getCount()I

    move-result v1

    add-int/lit8 v1, v1, -0x1

    invoke-virtual {v0, v1}, Lo/chi;->setCurrentItem(I)V

    .line 709
    :goto_0
    return-void
.end method

.method private x()V
    .locals 3

    .line 544
    invoke-virtual {p0}, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackDetailActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    .line 545
    invoke-virtual {v1}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    move-result-object v2

    .line 546
    const/high16 v0, 0x3f800000    # 1.0f

    iput v0, v2, Landroid/content/res/Configuration;->fontScale:F

    .line 547
    invoke-virtual {v1}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v0

    invoke-virtual {v1, v2, v0}, Landroid/content/res/Resources;->updateConfiguration(Landroid/content/res/Configuration;Landroid/util/DisplayMetrics;)V

    .line 548
    return-void
.end method

.method private y()V
    .locals 4

    .line 469
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackDetailActivity;->s:Lo/cex;

    if-nez v0, :cond_0

    .line 470
    const-string v0, "Track_TrackDetailActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getData() mMotionPath is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    goto/16 :goto_3

    .line 472
    :cond_0
    iget-boolean v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackDetailActivity;->v:Z

    if-eqz v0, :cond_4

    .line 473
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackDetailActivity;->s:Lo/cex;

    invoke-virtual {v0}, Lo/cex;->l()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 474
    const-string v0, "Track_TrackDetailActivity"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "HeartRateList size = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    iget-object v2, p0, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackDetailActivity;->s:Lo/cex;

    invoke-virtual {v2}, Lo/cex;->a()Ljava/util/ArrayList;

    move-result-object v2

    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    goto :goto_0

    .line 476
    :cond_1
    const-string v0, "Track_TrackDetailActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "HeartRateList is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 478
    :goto_0
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackDetailActivity;->s:Lo/cex;

    invoke-virtual {v0}, Lo/cex;->n()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 479
    const-string v0, "Track_TrackDetailActivity"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "StepRateList size = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    iget-object v2, p0, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackDetailActivity;->s:Lo/cex;

    invoke-virtual {v2}, Lo/cex;->f()Ljava/util/ArrayList;

    move-result-object v2

    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    goto :goto_1

    .line 481
    :cond_2
    const-string v0, "Track_TrackDetailActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "StepRateList is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 483
    :goto_1
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackDetailActivity;->s:Lo/cex;

    invoke-virtual {v0}, Lo/cex;->o()Z

    move-result v0

    if-eqz v0, :cond_3

    .line 484
    const-string v0, "Track_TrackDetailActivity"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "InvalidHRate size = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    iget-object v2, p0, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackDetailActivity;->s:Lo/cex;

    invoke-virtual {v2}, Lo/cex;->c()Ljava/util/ArrayList;

    move-result-object v2

    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    goto :goto_2

    .line 486
    :cond_3
    const-string v0, "Track_TrackDetailActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "InvalidHRate is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 488
    :goto_2
    const-string v0, "Track_TrackDetailActivity"

    const/4 v1, 0x4

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, " PaceMap "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    iget-object v2, p0, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackDetailActivity;->s:Lo/cex;

    invoke-virtual {v2}, Lo/cex;->e()Ljava/util/Map;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    const-string v2, " BritishPaceMap "

    const/4 v3, 0x2

    aput-object v2, v1, v3

    iget-object v2, p0, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackDetailActivity;->s:Lo/cex;

    .line 489
    invoke-virtual {v2}, Lo/cex;->d()Ljava/util/Map;

    move-result-object v2

    const/4 v3, 0x3

    aput-object v2, v1, v3

    .line 488
    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    goto/16 :goto_3

    .line 491
    :cond_4
    const-string v0, "Track_TrackDetailActivity"

    const/16 v1, 0x8

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, " StepRate "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    iget-object v2, p0, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackDetailActivity;->s:Lo/cex;

    invoke-virtual {v2}, Lo/cex;->f()Ljava/util/ArrayList;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    const-string v2, " PaceMap "

    const/4 v3, 0x2

    aput-object v2, v1, v3

    iget-object v2, p0, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackDetailActivity;->s:Lo/cex;

    .line 492
    invoke-virtual {v2}, Lo/cex;->e()Ljava/util/Map;

    move-result-object v2

    const/4 v3, 0x3

    aput-object v2, v1, v3

    const-string v2, " BritishPaceMap "

    const/4 v3, 0x4

    aput-object v2, v1, v3

    iget-object v2, p0, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackDetailActivity;->s:Lo/cex;

    .line 493
    invoke-virtual {v2}, Lo/cex;->d()Ljava/util/Map;

    move-result-object v2

    const/4 v3, 0x5

    aput-object v2, v1, v3

    const-string v2, " HeartRate "

    const/4 v3, 0x6

    aput-object v2, v1, v3

    iget-object v2, p0, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackDetailActivity;->s:Lo/cex;

    .line 494
    invoke-virtual {v2}, Lo/cex;->a()Ljava/util/ArrayList;

    move-result-object v2

    const/4 v3, 0x7

    aput-object v2, v1, v3

    .line 491
    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 495
    const-string v0, "Track_TrackDetailActivity"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "InvalidHeartRate  = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    iget-object v2, p0, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackDetailActivity;->s:Lo/cex;

    invoke-virtual {v2}, Lo/cex;->c()Ljava/util/ArrayList;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 496
    const-string v0, "Track_TrackDetailActivity"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "RunningPosture  = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    iget-object v2, p0, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackDetailActivity;->s:Lo/cex;

    invoke-virtual {v2}, Lo/cex;->h()Ljava/util/ArrayList;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 497
    const-string v0, "Track_TrackDetailActivity"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "mSpeedList  = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    iget-object v2, p0, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackDetailActivity;->s:Lo/cex;

    invoke-virtual {v2}, Lo/cex;->x()Ljava/util/List;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 498
    const-string v0, "Track_TrackDetailActivity"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "swolfList  = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    iget-object v2, p0, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackDetailActivity;->s:Lo/cex;

    invoke-virtual {v2}, Lo/cex;->t()Ljava/util/List;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 499
    const-string v0, "Track_TrackDetailActivity"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "requestRTPaceList  = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    iget-object v2, p0, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackDetailActivity;->s:Lo/cex;

    invoke-virtual {v2}, Lo/cex;->q()Ljava/util/List;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 500
    const-string v0, "Track_TrackDetailActivity"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "requestAltitudeList  = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    iget-object v2, p0, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackDetailActivity;->s:Lo/cex;

    invoke-virtual {v2}, Lo/cex;->i()Ljava/util/ArrayList;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 505
    :goto_3
    return-void
.end method

.method private z()V
    .locals 6

    .line 418
    invoke-virtual {p0}, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackDetailActivity;->getIntent()Landroid/content/Intent;

    move-result-object v0

    if-nez v0, :cond_0

    .line 419
    const-string v0, "Track_TrackDetailActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "intent is null!"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 420
    invoke-virtual {p0}, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackDetailActivity;->finish()V

    .line 421
    return-void

    .line 423
    :cond_0
    invoke-virtual {p0}, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackDetailActivity;->getIntent()Landroid/content/Intent;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/Intent;->getExtras()Landroid/os/Bundle;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackDetailActivity;->l:Landroid/os/Bundle;

    .line 425
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackDetailActivity;->l:Landroid/os/Bundle;

    if-nez v0, :cond_1

    .line 426
    const-string v0, "Track_TrackDetailActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "bundle is null!"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 427
    invoke-virtual {p0}, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackDetailActivity;->finish()V

    .line 428
    return-void

    .line 431
    :cond_1
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackDetailActivity;->l:Landroid/os/Bundle;

    const-string v1, "contentpath"

    invoke-virtual {v0, v1}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackDetailActivity;->u:Ljava/lang/String;

    .line 432
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackDetailActivity;->u:Ljava/lang/String;

    if-nez v0, :cond_2

    .line 433
    const-string v0, "Track_TrackDetailActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "gmConntentPath is null,get mMotionPath"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 434
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackDetailActivity;->l:Landroid/os/Bundle;

    const-string v1, "motionPath"

    invoke-virtual {v0, v1}, Landroid/os/Bundle;->getSerializable(Ljava/lang/String;)Ljava/io/Serializable;

    move-result-object v0

    check-cast v0, Lo/cex;

    iput-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackDetailActivity;->s:Lo/cex;

    .line 437
    :cond_2
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackDetailActivity;->s:Lo/cex;

    if-nez v0, :cond_7

    .line 439
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackDetailActivity;->u:Ljava/lang/String;

    if-eqz v0, :cond_3

    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackDetailActivity;->u:Ljava/lang/String;

    const-string v1, "contentpath"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_3

    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackDetailActivity;->u:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v0

    if-nez v0, :cond_4

    .line 440
    :cond_3
    const-string v0, "Track_TrackDetailActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getData mConntentPath is invalid!"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 441
    invoke-virtual {p0}, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackDetailActivity;->finish()V

    .line 444
    :cond_4
    new-instance v4, Ljava/io/File;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p0}, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackDetailActivity;->getFilesDir()Ljava/io/File;

    move-result-object v1

    invoke-virtual {v1}, Ljava/io/File;->getPath()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "/"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackDetailActivity;->u:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v4, v0}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 445
    invoke-virtual {v4}, Ljava/io/File;->exists()Z

    move-result v0

    if-nez v0, :cond_5

    .line 446
    const-string v0, "Track_TrackDetailActivity"

    const/4 v1, 0x3

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getData mConntentPath:"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    iget-object v2, p0, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackDetailActivity;->u:Ljava/lang/String;

    const/4 v3, 0x1

    aput-object v2, v1, v3

    const-string v2, " is not exists!"

    const/4 v3, 0x2

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 447
    invoke-virtual {p0}, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackDetailActivity;->finish()V

    .line 451
    :cond_5
    invoke-static {}, Lo/cbl;->b()Lo/cbl;

    move-result-object v0

    invoke-virtual {v0}, Lo/cbl;->c()Lo/cbp;

    move-result-object v5

    .line 452
    if-eqz v5, :cond_6

    invoke-interface {v5}, Lo/cbp;->n()Z

    move-result v0

    if-eqz v0, :cond_6

    .line 453
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackDetailActivity;->l:Landroid/os/Bundle;

    const-string v1, "isAfterSport"

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Landroid/os/Bundle;->getBoolean(Ljava/lang/String;Z)Z

    move-result v0

    iput-boolean v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackDetailActivity;->x:Z

    .line 456
    :cond_6
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackDetailActivity;->u:Ljava/lang/String;

    invoke-static {p0, v0}, Lo/cea;->d(Landroid/content/Context;Ljava/lang/String;)Lo/cex;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackDetailActivity;->s:Lo/cex;

    .line 459
    :cond_7
    invoke-direct {p0}, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackDetailActivity;->y()V

    .line 460
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackDetailActivity;->l:Landroid/os/Bundle;

    const-string v1, "simplifyDatakey"

    invoke-virtual {v0, v1}, Landroid/os/Bundle;->getSerializable(Ljava/lang/String;)Ljava/io/Serializable;

    move-result-object v0

    check-cast v0, Lcom/huawei/healthcloud/plugintrack/model/MotionPathSimplify;

    iput-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackDetailActivity;->t:Lcom/huawei/healthcloud/plugintrack/model/MotionPathSimplify;

    .line 461
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackDetailActivity;->t:Lcom/huawei/healthcloud/plugintrack/model/MotionPathSimplify;

    if-nez v0, :cond_8

    .line 462
    const-string v0, "Track_TrackDetailActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getData() mMotionPathSimplify is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 463
    invoke-virtual {p0}, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackDetailActivity;->finish()V

    goto :goto_0

    .line 465
    :cond_8
    const-string v0, "Track_TrackDetailActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    iget-object v2, p0, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackDetailActivity;->t:Lcom/huawei/healthcloud/plugintrack/model/MotionPathSimplify;

    invoke-virtual {v2}, Lcom/huawei/healthcloud/plugintrack/model/MotionPathSimplify;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 467
    :goto_0
    return-void
.end method


# virtual methods
.method protected a()V
    .locals 4

    .line 521
    const-string v0, "Track_TrackDetailActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "initSport"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 523
    return-void
.end method

.method protected b()V
    .locals 0

    .line 510
    return-void
.end method

.method public c()V
    .locals 1

    .line 836
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackDetailActivity;->N:Landroid/app/ProgressDialog;

    if-eqz v0, :cond_1

    .line 837
    invoke-virtual {p0}, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackDetailActivity;->isDestroyed()Z

    move-result v0

    if-nez v0, :cond_0

    invoke-virtual {p0}, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackDetailActivity;->isFinishing()Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackDetailActivity;->N:Landroid/app/ProgressDialog;

    invoke-virtual {v0}, Landroid/app/ProgressDialog;->isShowing()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 839
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackDetailActivity;->N:Landroid/app/ProgressDialog;

    invoke-virtual {v0}, Landroid/app/ProgressDialog;->dismiss()V

    .line 841
    :cond_0
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackDetailActivity;->N:Landroid/app/ProgressDialog;

    .line 843
    :cond_1
    return-void
.end method

.method public d()Lo/cgt;
    .locals 1

    .line 865
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackDetailActivity;->r:Lo/cgt;

    return-object v0
.end method

.method protected e()Lo/cco;
    .locals 1

    .line 515
    const/4 v0, 0x0

    return-object v0
.end method

.method public e(Ljava/lang/String;)V
    .locals 5

    .line 810
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackDetailActivity;->N:Landroid/app/ProgressDialog;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    invoke-virtual {p0}, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackDetailActivity;->isDestroyed()Z

    move-result v0

    if-nez v0, :cond_0

    invoke-virtual {p0}, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackDetailActivity;->isFinishing()Z

    move-result v0

    if-nez v0, :cond_0

    .line 811
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackDetailActivity;->N:Landroid/app/ProgressDialog;

    invoke-virtual {v0}, Landroid/app/ProgressDialog;->dismiss()V

    .line 812
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackDetailActivity;->N:Landroid/app/ProgressDialog;

    .line 814
    :cond_0
    new-instance v0, Landroid/app/ProgressDialog;

    iget-object v1, p0, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackDetailActivity;->q:Landroid/content/Context;

    invoke-direct {v0, v1}, Landroid/app/ProgressDialog;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackDetailActivity;->N:Landroid/app/ProgressDialog;

    .line 815
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackDetailActivity;->N:Landroid/app/ProgressDialog;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/app/ProgressDialog;->setCanceledOnTouchOutside(Z)V

    .line 816
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackDetailActivity;->N:Landroid/app/ProgressDialog;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/app/ProgressDialog;->setCancelable(Z)V

    .line 817
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackDetailActivity;->N:Landroid/app/ProgressDialog;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/app/ProgressDialog;->setIndeterminate(Z)V

    .line 818
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackDetailActivity;->N:Landroid/app/ProgressDialog;

    invoke-virtual {v0}, Landroid/app/ProgressDialog;->show()V

    .line 819
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackDetailActivity;->N:Landroid/app/ProgressDialog;

    sget v1, Lcom/huawei/healthcloud/plugintrack/R$layout;->track_offlinemap_common_ui_loading_layout:I

    invoke-virtual {v0, v1}, Landroid/app/ProgressDialog;->setContentView(I)V

    .line 820
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackDetailActivity;->N:Landroid/app/ProgressDialog;

    invoke-virtual {v0}, Landroid/app/ProgressDialog;->getWindow()Landroid/view/Window;

    move-result-object v2

    .line 821
    if-nez v2, :cond_1

    .line 822
    return-void

    .line 824
    :cond_1
    sget v0, Lcom/huawei/healthcloud/plugintrack/R$id;->waiting_layout:I

    invoke-virtual {v2, v0}, Landroid/view/Window;->findViewById(I)Landroid/view/View;

    move-result-object v3

    .line 825
    if-nez v3, :cond_2

    .line 826
    return-void

    .line 828
    :cond_2
    sget v0, Lcom/huawei/healthcloud/plugintrack/R$id;->tv_progress:I

    invoke-virtual {v3, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Lo/egb;

    .line 829
    if-eqz v4, :cond_3

    .line 830
    invoke-virtual {v4, p1}, Lo/egb;->setText(Ljava/lang/CharSequence;)V

    .line 833
    :cond_3
    return-void
.end method

.method public f()Landroid/view/View;
    .locals 1

    .line 938
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackDetailActivity;->h:Landroid/widget/ImageButton;

    return-object v0
.end method

.method protected g()Z
    .locals 1

    .line 913
    const/4 v0, 0x0

    return v0
.end method

.method protected h()Z
    .locals 1

    .line 918
    const/4 v0, 0x0

    return v0
.end method

.method public onBackPressed()V
    .locals 1

    .line 244
    iget-boolean v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackDetailActivity;->y:Z

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackDetailActivity;->c:Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackScreenFrag;

    if-eqz v0, :cond_0

    .line 245
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackDetailActivity;->c:Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackScreenFrag;

    invoke-virtual {v0}, Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackScreenFrag;->a()V

    .line 247
    :cond_0
    invoke-super {p0}, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackBaseActivity;->onBackPressed()V

    .line 248
    return-void
.end method

.method public onClick(Landroid/view/View;)V
    .locals 2

    .line 263
    invoke-virtual {p1}, Landroid/view/View;->getId()I

    move-result v0

    sget v1, Lcom/huawei/healthcloud/plugintrack/R$id;->navigation_right_iconbtn1:I

    if-ne v0, v1, :cond_0

    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackDetailActivity;->h:Landroid/widget/ImageButton;

    invoke-virtual {v0}, Landroid/widget/ImageButton;->getVisibility()I

    move-result v0

    if-nez v0, :cond_0

    .line 264
    invoke-direct {p0}, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackDetailActivity;->r()V

    goto :goto_0

    .line 265
    :cond_0
    invoke-virtual {p1}, Landroid/view/View;->getId()I

    move-result v0

    sget v1, Lcom/huawei/healthcloud/plugintrack/R$id;->navigation_right_iconbtn2:I

    if-ne v0, v1, :cond_1

    .line 266
    invoke-direct {p0}, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackDetailActivity;->p()V

    goto :goto_0

    .line 267
    :cond_1
    invoke-virtual {p1}, Landroid/view/View;->getId()I

    move-result v0

    sget v1, Lcom/huawei/healthcloud/plugintrack/R$id;->navigation_left_iconbtn1:I

    if-ne v0, v1, :cond_3

    .line 268
    iget-boolean v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackDetailActivity;->y:Z

    if-eqz v0, :cond_2

    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackDetailActivity;->c:Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackScreenFrag;

    if-eqz v0, :cond_2

    .line 269
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackDetailActivity;->c:Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackScreenFrag;

    invoke-virtual {v0}, Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackScreenFrag;->a()V

    .line 271
    :cond_2
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackDetailActivity;->e:Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackBaseActivity;

    invoke-virtual {v0}, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackBaseActivity;->finish()V

    .line 273
    :cond_3
    :goto_0
    return-void
.end method

.method public onCreate(Landroid/os/Bundle;)V
    .locals 4

    .line 363
    invoke-static {p0}, Lo/dbf;->v(Landroid/content/Context;)Z

    move-result v0

    iput-boolean v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackDetailActivity;->v:Z

    .line 364
    if-eqz p1, :cond_0

    .line 365
    const-string v0, "android:support:fragments"

    const/4 v1, 0x0

    invoke-virtual {p1, v0, v1}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V

    .line 367
    :cond_0
    invoke-super {p0, p1}, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackBaseActivity;->onCreate(Landroid/os/Bundle;)V

    .line 368
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    iput-wide v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackDetailActivity;->j:J

    .line 369
    invoke-direct {p0}, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackDetailActivity;->s()V

    .line 370
    iput-object p0, p0, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackDetailActivity;->q:Landroid/content/Context;

    .line 371
    invoke-direct {p0}, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackDetailActivity;->z()V

    .line 372
    invoke-virtual {p0}, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackDetailActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackDetailActivity;->p:Landroid/content/res/Resources;

    .line 373
    invoke-direct {p0}, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackDetailActivity;->n()V

    .line 374
    invoke-direct {p0}, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackDetailActivity;->q()Z

    move-result v0

    iput-boolean v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackDetailActivity;->D:Z

    .line 377
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackDetailActivity;->I:Ljava/util/Map;

    const-string v1, "trackScreen"

    const/4 v2, 0x0

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 378
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackDetailActivity;->I:Ljava/util/Map;

    const-string v1, "paceFrag"

    const/4 v2, 0x1

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 379
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackDetailActivity;->I:Ljava/util/Map;

    const-string v1, "heartrateFrag"

    const/4 v2, 0x2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 380
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackDetailActivity;->I:Ljava/util/Map;

    const-string v1, "detailFrag"

    const/4 v2, 0x3

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 382
    invoke-direct {p0}, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackDetailActivity;->o()V

    .line 383
    invoke-direct {p0}, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackDetailActivity;->u()V

    .line 385
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackDetailActivity;->r:Lo/cgt;

    invoke-virtual {v0}, Lo/cgt;->n()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 386
    const-string v0, "Track_TrackDetailActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "isTrakAbnormal"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 387
    invoke-direct {p0}, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackDetailActivity;->D()V

    goto :goto_0

    .line 388
    :cond_1
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackDetailActivity;->r:Lo/cgt;

    invoke-virtual {v0}, Lo/cgt;->m()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 389
    const-string v0, "Track_TrackDetailActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "isDuplicated"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 390
    invoke-direct {p0}, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackDetailActivity;->B()V

    goto :goto_0

    .line 391
    :cond_2
    iget-boolean v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackDetailActivity;->x:Z

    if-eqz v0, :cond_3

    .line 392
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackDetailActivity;->q:Landroid/content/Context;

    invoke-direct {p0, v0}, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackDetailActivity;->a(Landroid/content/Context;)V

    .line 394
    :cond_3
    :goto_0
    return-void
.end method

.method public onDestroy()V
    .locals 7

    .line 552
    invoke-super {p0}, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackBaseActivity;->onDestroy()V

    .line 553
    const-string v0, "Track_TrackDetailActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "onDestroy"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 555
    new-instance v4, Ljava/util/HashMap;

    invoke-direct {v4}, Ljava/util/HashMap;-><init>()V

    .line 556
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackDetailActivity;->z:[J

    const/4 v1, 0x0

    aget-wide v0, v0, v1

    const-wide/16 v2, -0x1

    cmp-long v0, v0, v2

    if-nez v0, :cond_0

    .line 557
    const-string v0, "mapHide"

    const/4 v1, 0x1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v4, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    .line 559
    :cond_0
    const-string v0, "mapTime"

    iget-object v1, p0, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackDetailActivity;->z:[J

    const/4 v2, 0x0

    aget-wide v1, v1, v2

    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    invoke-interface {v4, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 561
    :goto_0
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackDetailActivity;->z:[J

    const/4 v1, 0x1

    aget-wide v0, v0, v1

    const-wide/16 v2, -0x1

    cmp-long v0, v0, v2

    if-nez v0, :cond_1

    .line 562
    const-string v0, "paceHide"

    const/4 v1, 0x1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v4, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_1

    .line 564
    :cond_1
    const-string v0, "paceTime"

    iget-object v1, p0, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackDetailActivity;->z:[J

    const/4 v2, 0x1

    aget-wide v1, v1, v2

    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    invoke-interface {v4, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 566
    :goto_1
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackDetailActivity;->z:[J

    const/4 v1, 0x2

    aget-wide v0, v0, v1

    const-wide/16 v2, -0x1

    cmp-long v0, v0, v2

    if-nez v0, :cond_2

    .line 567
    const-string v0, "chartHide"

    const/4 v1, 0x1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v4, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_2

    .line 569
    :cond_2
    const-string v0, "chartTime"

    iget-object v1, p0, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackDetailActivity;->z:[J

    const/4 v2, 0x2

    aget-wide v1, v1, v2

    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    invoke-interface {v4, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 571
    :goto_2
    const-string v0, "detailTime"

    iget-object v1, p0, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackDetailActivity;->z:[J

    const/4 v2, 0x3

    aget-wide v1, v1, v2

    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    invoke-interface {v4, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 572
    invoke-static {}, Lo/cxf;->e()Lo/cxf;

    move-result-object v0

    sget-object v1, Lo/dae;->hO:Lo/dae;

    invoke-virtual {v1}, Lo/dae;->b()Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x0

    invoke-virtual {v0, p0, v1, v4, v2}, Lo/cxf;->a(Landroid/content/Context;Ljava/lang/String;Ljava/util/Map;I)I

    .line 575
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackDetailActivity;->u:Ljava/lang/String;

    if-eqz v0, :cond_6

    .line 576
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackDetailActivity;->u:Ljava/lang/String;

    const-string v1, "motion_path2.txt"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_5

    .line 579
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    .line 580
    const/16 v1, 0x4e22

    invoke-static {v1}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v1

    const-string v2, "save_DB_End"

    .line 578
    invoke-static {v0, v1, v2}, Lo/dct;->c(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    .line 583
    const/4 v6, 0x0

    .line 584
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackDetailActivity;->t:Lcom/huawei/healthcloud/plugintrack/model/MotionPathSimplify;

    if-eqz v0, :cond_3

    .line 585
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackDetailActivity;->t:Lcom/huawei/healthcloud/plugintrack/model/MotionPathSimplify;

    invoke-virtual {v0}, Lcom/huawei/healthcloud/plugintrack/model/MotionPathSimplify;->requestStartTime()J

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object v6

    .line 587
    :cond_3
    const-string v0, "Track_TrackDetailActivity"

    const/4 v1, 0x3

    new-array v1, v1, [Ljava/lang/Object;

    const/4 v2, 0x0

    aput-object v6, v1, v2

    const-string v2, " "

    const/4 v3, 0x1

    aput-object v2, v1, v3

    const/4 v2, 0x2

    aput-object v5, v1, v2

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 588
    if-eqz v6, :cond_4

    invoke-virtual {v6, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_4

    .line 589
    invoke-static {}, Lo/cdy;->a()V

    .line 590
    const-string v0, "Track_TrackDetailActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "deleteTempFileOfBreakPoint"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 592
    :cond_4
    goto :goto_3

    .line 594
    :cond_5
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackDetailActivity;->u:Ljava/lang/String;

    invoke-static {v0, v1}, Lo/cdy;->d(Landroid/content/Context;Ljava/lang/String;)Z

    .line 598
    :cond_6
    :goto_3
    return-void
.end method

.method public onPause()V
    .locals 8

    .line 539
    invoke-super {p0}, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackBaseActivity;->onPause()V

    .line 540
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackDetailActivity;->z:[J

    iget v1, p0, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackDetailActivity;->C:I

    aget-wide v2, v0, v1

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v4

    iget-wide v6, p0, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackDetailActivity;->j:J

    sub-long/2addr v4, v6

    add-long/2addr v2, v4

    aput-wide v2, v0, v1

    .line 541
    return-void
.end method

.method public onResume()V
    .locals 2

    .line 528
    invoke-super {p0}, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackBaseActivity;->onResume()V

    .line 529
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackDetailActivity;->c:Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackScreenFrag;

    if-eqz v0, :cond_0

    .line 530
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackDetailActivity;->c:Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackScreenFrag;

    const/4 v1, 0x0

    iput-boolean v1, v0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackScreenFrag;->c:Z

    .line 532
    :cond_0
    invoke-direct {p0}, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackDetailActivity;->x()V

    .line 534
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    iput-wide v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackDetailActivity;->j:J

    .line 535
    return-void
.end method
