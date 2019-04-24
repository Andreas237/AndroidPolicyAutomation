.class Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackScreenFrag$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/cco;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackScreenFrag;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "b"
.end annotation


# instance fields
.field private a:Landroid/view/View;

.field private b:Lo/egb;

.field private c:Lo/egb;

.field private d:Lo/egb;

.field private e:Lo/egb;

.field private f:Lo/egb;

.field private g:Lo/egb;

.field private h:Lo/egb;

.field private i:Lo/egb;

.field private k:Lo/egb;

.field private l:Lo/egb;

.field private n:Lo/egb;

.field private o:Lo/egb;


# direct methods
.method private constructor <init>(Landroid/view/View;)V
    .locals 1

    .line 1011
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 995
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackScreenFrag$b;->a:Landroid/view/View;

    .line 997
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackScreenFrag$b;->e:Lo/egb;

    .line 998
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackScreenFrag$b;->c:Lo/egb;

    .line 999
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackScreenFrag$b;->b:Lo/egb;

    .line 1000
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackScreenFrag$b;->d:Lo/egb;

    .line 1001
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackScreenFrag$b;->k:Lo/egb;

    .line 1002
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackScreenFrag$b;->h:Lo/egb;

    .line 1003
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackScreenFrag$b;->f:Lo/egb;

    .line 1004
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackScreenFrag$b;->i:Lo/egb;

    .line 1005
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackScreenFrag$b;->g:Lo/egb;

    .line 1006
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackScreenFrag$b;->o:Lo/egb;

    .line 1007
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackScreenFrag$b;->n:Lo/egb;

    .line 1009
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackScreenFrag$b;->l:Lo/egb;

    .line 1012
    iput-object p1, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackScreenFrag$b;->a:Landroid/view/View;

    .line 1013
    invoke-direct {p0}, Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackScreenFrag$b;->a()V

    .line 1014
    return-void
.end method

.method synthetic constructor <init>(Landroid/view/View;Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackScreenFrag$1;)V
    .locals 0

    .line 992
    invoke-direct {p0, p1}, Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackScreenFrag$b;-><init>(Landroid/view/View;)V

    return-void
.end method

.method static synthetic a(Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackScreenFrag$b;)Lo/egb;
    .locals 1

    .line 992
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackScreenFrag$b;->e:Lo/egb;

    return-object v0
.end method

.method private a()V
    .locals 4

    .line 1018
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackScreenFrag$b;->a:Landroid/view/View;

    if-nez v0, :cond_0

    .line 1019
    const-string v0, "Track_TrackDetailFragViewHold"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "initView mView is null!"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1020
    return-void

    .line 1022
    :cond_0
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackScreenFrag$b;->a:Landroid/view/View;

    sget v1, Lcom/huawei/healthcloud/plugintrack/R$id;->track_detail_map_sport_time:I

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lo/egb;

    iput-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackScreenFrag$b;->e:Lo/egb;

    .line 1023
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackScreenFrag$b;->a:Landroid/view/View;

    sget v1, Lcom/huawei/healthcloud/plugintrack/R$id;->track_detail_map_sport_distance_value:I

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lo/egb;

    iput-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackScreenFrag$b;->c:Lo/egb;

    .line 1025
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackScreenFrag$b;->a:Landroid/view/View;

    sget v1, Lcom/huawei/healthcloud/plugintrack/R$id;->text_targetUnit:I

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lo/egb;

    iput-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackScreenFrag$b;->l:Lo/egb;

    .line 1026
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackScreenFrag$b;->a:Landroid/view/View;

    sget v1, Lcom/huawei/healthcloud/plugintrack/R$id;->track_detail_map_sport_during_time:I

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lo/egb;

    iput-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackScreenFrag$b;->b:Lo/egb;

    .line 1027
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackScreenFrag$b;->a:Landroid/view/View;

    sget v1, Lcom/huawei/healthcloud/plugintrack/R$id;->track_main_page_mid_datatype:I

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lo/egb;

    iput-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackScreenFrag$b;->d:Lo/egb;

    .line 1028
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackScreenFrag$b;->a:Landroid/view/View;

    sget v1, Lcom/huawei/healthcloud/plugintrack/R$id;->track_detail_map_speed_value:I

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lo/egb;

    iput-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackScreenFrag$b;->k:Lo/egb;

    .line 1029
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackScreenFrag$b;->a:Landroid/view/View;

    sget v1, Lcom/huawei/healthcloud/plugintrack/R$id;->track_main_page_mid_unit:I

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lo/egb;

    iput-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackScreenFrag$b;->h:Lo/egb;

    .line 1030
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackScreenFrag$b;->a:Landroid/view/View;

    sget v1, Lcom/huawei/healthcloud/plugintrack/R$id;->track_detail_map_calorie_value:I

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lo/egb;

    iput-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackScreenFrag$b;->f:Lo/egb;

    .line 1031
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackScreenFrag$b;->a:Landroid/view/View;

    sget v1, Lcom/huawei/healthcloud/plugintrack/R$id;->track_detail_map_min_pace:I

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lo/egb;

    iput-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackScreenFrag$b;->o:Lo/egb;

    .line 1032
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackScreenFrag$b;->a:Landroid/view/View;

    sget v1, Lcom/huawei/healthcloud/plugintrack/R$id;->track_detail_map_max_pace:I

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lo/egb;

    iput-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackScreenFrag$b;->n:Lo/egb;

    .line 1033
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackScreenFrag$b;->a:Landroid/view/View;

    sget v1, Lcom/huawei/healthcloud/plugintrack/R$id;->track_detail_map_min_pace_value:I

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lo/egb;

    iput-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackScreenFrag$b;->i:Lo/egb;

    .line 1034
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackScreenFrag$b;->a:Landroid/view/View;

    sget v1, Lcom/huawei/healthcloud/plugintrack/R$id;->track_detail_map_max_pace_value:I

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lo/egb;

    iput-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackScreenFrag$b;->g:Lo/egb;

    .line 1035
    return-void
.end method

.method static synthetic b(Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackScreenFrag$b;)Lo/egb;
    .locals 1

    .line 992
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackScreenFrag$b;->b:Lo/egb;

    return-object v0
.end method

.method static synthetic b(Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackScreenFrag$b;ZLjava/lang/String;Ljava/lang/String;ILandroid/content/Context;)V
    .locals 0

    .line 992
    invoke-direct/range {p0 .. p5}, Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackScreenFrag$b;->b(ZLjava/lang/String;Ljava/lang/String;ILandroid/content/Context;)V

    return-void
.end method

.method private b(ZLjava/lang/String;Ljava/lang/String;ILandroid/content/Context;)V
    .locals 4

    .line 1047
    if-eqz p1, :cond_2

    .line 1048
    invoke-static {p4}, Lo/cgl;->c(I)Z

    move-result v0

    if-eqz v0, :cond_1

    if-eqz p5, :cond_1

    if-eqz p2, :cond_1

    if-eqz p3, :cond_1

    .line 1049
    new-instance v2, Ljava/lang/StringBuffer;

    invoke-direct {v2, p2}, Ljava/lang/StringBuffer;-><init>(Ljava/lang/String;)V

    .line 1050
    new-instance v3, Ljava/lang/StringBuffer;

    invoke-direct {v3, p3}, Ljava/lang/StringBuffer;-><init>(Ljava/lang/String;)V

    .line 1051
    const-string v0, " "

    invoke-virtual {v2, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 1052
    const-string v0, " "

    invoke-virtual {v3, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 1053
    invoke-static {}, Lo/cxh;->a()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 1054
    invoke-virtual {p5}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/healthcloud/plugintrack/R$string;->IDS_motiontrack_show_detail_average_speed_imp:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 1055
    invoke-virtual {p5}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/healthcloud/plugintrack/R$string;->IDS_motiontrack_show_detail_average_speed_imp:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v3, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    goto :goto_0

    .line 1057
    :cond_0
    invoke-virtual {p5}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/healthcloud/plugintrack/R$string;->IDS_motiontrack_show_detail_average_speed:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 1058
    invoke-virtual {p5}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/healthcloud/plugintrack/R$string;->IDS_motiontrack_show_detail_average_speed:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v3, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 1061
    :goto_0
    invoke-virtual {v2}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;

    move-result-object p2

    .line 1062
    invoke-virtual {v3}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;

    move-result-object p3

    .line 1064
    :cond_1
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackScreenFrag$b;->g:Lo/egb;

    invoke-virtual {v0, p2}, Lo/egb;->setText(Ljava/lang/CharSequence;)V

    .line 1065
    if-eqz p3, :cond_3

    .line 1066
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackScreenFrag$b;->i:Lo/egb;

    invoke-virtual {v0, p3}, Lo/egb;->setText(Ljava/lang/CharSequence;)V

    goto :goto_1

    .line 1069
    :cond_2
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackScreenFrag$b;->n:Lo/egb;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Lo/egb;->setVisibility(I)V

    .line 1070
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackScreenFrag$b;->o:Lo/egb;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Lo/egb;->setVisibility(I)V

    .line 1071
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackScreenFrag$b;->g:Lo/egb;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Lo/egb;->setVisibility(I)V

    .line 1072
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackScreenFrag$b;->i:Lo/egb;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Lo/egb;->setVisibility(I)V

    .line 1074
    :cond_3
    :goto_1
    return-void
.end method

.method static synthetic c(Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackScreenFrag$b;)Lo/egb;
    .locals 1

    .line 992
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackScreenFrag$b;->l:Lo/egb;

    return-object v0
.end method

.method static synthetic d(Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackScreenFrag$b;)Lo/egb;
    .locals 1

    .line 992
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackScreenFrag$b;->d:Lo/egb;

    return-object v0
.end method

.method static synthetic e(Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackScreenFrag$b;)Lo/egb;
    .locals 1

    .line 992
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackScreenFrag$b;->k:Lo/egb;

    return-object v0
.end method

.method static synthetic f(Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackScreenFrag$b;)Lo/egb;
    .locals 1

    .line 992
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackScreenFrag$b;->h:Lo/egb;

    return-object v0
.end method

.method static synthetic g(Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackScreenFrag$b;)Lo/egb;
    .locals 1

    .line 992
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackScreenFrag$b;->f:Lo/egb;

    return-object v0
.end method

.method static synthetic h(Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackScreenFrag$b;)Lo/egb;
    .locals 1

    .line 992
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackScreenFrag$b;->o:Lo/egb;

    return-object v0
.end method

.method static synthetic i(Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackScreenFrag$b;)Lo/egb;
    .locals 1

    .line 992
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackScreenFrag$b;->g:Lo/egb;

    return-object v0
.end method

.method static synthetic k(Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackScreenFrag$b;)Lo/egb;
    .locals 1

    .line 992
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackScreenFrag$b;->n:Lo/egb;

    return-object v0
.end method

.method static synthetic l(Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackScreenFrag$b;)Lo/egb;
    .locals 1

    .line 992
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackScreenFrag$b;->c:Lo/egb;

    return-object v0
.end method

.method static synthetic m(Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackScreenFrag$b;)Lo/egb;
    .locals 1

    .line 992
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackScreenFrag$b;->i:Lo/egb;

    return-object v0
.end method


# virtual methods
.method public c()Lo/ciw;
    .locals 1

    .line 1043
    const/4 v0, 0x0

    return-object v0
.end method

.method public d()V
    .locals 0

    .line 1039
    return-void
.end method
