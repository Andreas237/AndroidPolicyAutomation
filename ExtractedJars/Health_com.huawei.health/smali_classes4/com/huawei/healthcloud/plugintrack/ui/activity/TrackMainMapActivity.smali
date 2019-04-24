.class public Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackMainMapActivity;
.super Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackBaseActivity;
.source "SourceFile"

# interfaces
.implements Lo/cbu$e;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackMainMapActivity$c;,
        Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackMainMapActivity$a;
    }
.end annotation


# static fields
.field private static w:I


# instance fields
.field private A:Lo/egv;

.field private B:J

.field private C:Lo/egy;

.field private final b:Ljava/lang/String;

.field private c:Lo/cbu;

.field private f:Landroid/os/Bundle;

.field private g:Ljava/io/File;

.field private h:Landroid/os/Handler;

.field private i:Lo/cir;

.field private j:Lo/egw;

.field private k:Ljava/io/File;

.field private l:F

.field private m:I

.field private n:I

.field private o:J

.field private p:I

.field private q:Landroid/content/Context;

.field private r:Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackMainMapActivity$c;

.field private s:Lo/cgg;

.field private t:Ljava/lang/String;

.field private u:Landroid/content/Intent;

.field private v:Z

.field private x:Lo/cee;

.field private y:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<Ljava/lang/Double;>;"
        }
    .end annotation
.end field

.field private z:Z


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 76
    invoke-direct {p0}, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackBaseActivity;-><init>()V

    .line 78
    const-string v0, "Track_TrackMainMapActivity"

    iput-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackMainMapActivity;->b:Ljava/lang/String;

    .line 79
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackMainMapActivity;->c:Lo/cbu;

    .line 80
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackMainMapActivity;->i:Lo/cir;

    .line 82
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackMainMapActivity;->f:Landroid/os/Bundle;

    .line 84
    new-instance v0, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackMainMapActivity$a;

    invoke-direct {v0, p0}, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackMainMapActivity$a;-><init>(Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackMainMapActivity;)V

    iput-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackMainMapActivity;->h:Landroid/os/Handler;

    .line 87
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackMainMapActivity;->k:Ljava/io/File;

    .line 88
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackMainMapActivity;->g:Ljava/io/File;

    .line 91
    const-wide/16 v0, 0x0

    iput-wide v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackMainMapActivity;->o:J

    .line 102
    const/4 v0, 0x0

    iput v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackMainMapActivity;->m:I

    .line 103
    const/4 v0, -0x1

    iput v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackMainMapActivity;->p:I

    .line 104
    const/high16 v0, -0x40800000    # -1.0f

    iput v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackMainMapActivity;->l:F

    .line 106
    const/4 v0, -0x1

    iput v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackMainMapActivity;->n:I

    .line 121
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackMainMapActivity;->q:Landroid/content/Context;

    .line 123
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackMainMapActivity;->s:Lo/cgg;

    .line 125
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackMainMapActivity;->r:Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackMainMapActivity$c;

    .line 127
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackMainMapActivity;->u:Landroid/content/Intent;

    .line 137
    const-string v0, ""

    iput-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackMainMapActivity;->t:Ljava/lang/String;

    .line 139
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackMainMapActivity;->v:Z

    .line 142
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackMainMapActivity;->z:Z

    .line 145
    const-wide/16 v0, 0x0

    iput-wide v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackMainMapActivity;->B:J

    .line 648
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackMainMapActivity;->C:Lo/egy;

    .line 684
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackMainMapActivity;->A:Lo/egv;

    return-void
.end method

.method private A()Z
    .locals 1

    .line 980
    const-string v0, "power"

    invoke-virtual {p0, v0}, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackMainMapActivity;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/os/PowerManager;

    invoke-virtual {v0}, Landroid/os/PowerManager;->isScreenOn()Z

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method private B()V
    .locals 2

    .line 845
    invoke-direct {p0}, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackMainMapActivity;->j()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 846
    new-instance v0, Landroid/content/Intent;

    const-class v1, Lcom/huawei/healthcloud/plugintrack/ui/activity/LauncherActivity;

    invoke-direct {v0, p0, v1}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    invoke-virtual {p0, v0}, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackMainMapActivity;->startActivity(Landroid/content/Intent;)V

    .line 848
    :cond_0
    return-void
.end method

.method private C()V
    .locals 8

    .line 1082
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackMainMapActivity;->c:Lo/cbu;

    invoke-virtual {v0}, Lo/cbu;->p()F

    move-result v0

    invoke-static {v0}, Lo/cdu;->b(F)Ljava/util/ArrayList;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackMainMapActivity;->y:Ljava/util/ArrayList;

    .line 1083
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackMainMapActivity;->y:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    invoke-static {v0}, Lo/cdu;->c(I)I

    move-result v4

    .line 1084
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackMainMapActivity;->y:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    add-int/lit8 v5, v0, -0x1

    .line 1085
    const-string v0, "Track_TrackMainMapActivity"

    const/4 v1, 0x6

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "calibrationDistance() noCalibrationPosition = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    const-string v2, "  maxPosition is "

    const/4 v3, 0x2

    aput-object v2, v1, v3

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x3

    aput-object v2, v1, v3

    const-string v2, " ,before calibration distance is "

    const/4 v3, 0x4

    aput-object v2, v1, v3

    iget-object v2, p0, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackMainMapActivity;->c:Lo/cbu;

    .line 1086
    invoke-virtual {v2}, Lo/cbu;->p()F

    move-result v2

    invoke-static {v2}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v2

    const/4 v3, 0x5

    aput-object v2, v1, v3

    .line 1085
    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1087
    new-instance v0, Lo/cid$a;

    iget-object v1, p0, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackMainMapActivity;->q:Landroid/content/Context;

    invoke-direct {v0, v1}, Lo/cid$a;-><init>(Landroid/content/Context;)V

    iget-object v1, p0, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackMainMapActivity;->y:Ljava/util/ArrayList;

    .line 1088
    invoke-virtual {v0, v1}, Lo/cid$a;->a(Ljava/util/ArrayList;)Lo/cid$a;

    move-result-object v0

    .line 1089
    invoke-virtual {v0, v4}, Lo/cid$a;->b(I)Lo/cid$a;

    move-result-object v0

    new-instance v1, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackMainMapActivity$7;

    invoke-direct {v1, p0, v4}, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackMainMapActivity$7;-><init>(Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackMainMapActivity;I)V

    .line 1090
    invoke-virtual {v0, v1}, Lo/cid$a;->b(Lo/cid$d;)Lo/cid$a;

    move-result-object v0

    new-instance v1, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackMainMapActivity$4;

    invoke-direct {v1, p0}, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackMainMapActivity$4;-><init>(Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackMainMapActivity;)V

    .line 1138
    invoke-virtual {v0, v1}, Lo/cid$a;->e(Lo/cid$d;)Lo/cid$a;

    move-result-object v6

    .line 1146
    invoke-virtual {v6}, Lo/cid$a;->c()Lo/cid;

    move-result-object v7

    .line 1147
    invoke-virtual {v7}, Lo/cid;->show()V

    .line 1148
    return-void
.end method

.method private D()V
    .locals 4

    .line 1035
    iget-boolean v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackMainMapActivity;->z:Z

    if-eqz v0, :cond_0

    .line 1036
    return-void

    .line 1039
    :cond_0
    const-string v0, "Track_TrackMainMapActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "destroy sInstanceCount = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    sget v3, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackMainMapActivity;->w:I

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1045
    sget v0, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackMainMapActivity;->w:I

    const/4 v1, 0x1

    if-ne v0, v1, :cond_4

    .line 1046
    invoke-direct {p0}, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackMainMapActivity;->r()V

    .line 1048
    const-string v0, "com.huawei.healthcloud.plugintrack.NOTIFY_SPORT_DATA"

    const-string v1, "com.android.keyguard.permission.SEND_STEP_INFO_COUNTER"

    const-string v2, "com.android.systemui"

    const/4 v3, 0x0

    invoke-direct {p0, v0, v1, v2, v3}, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackMainMapActivity;->b(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V

    .line 1049
    invoke-direct {p0, p0}, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackMainMapActivity;->c(Landroid/content/Context;)V

    .line 1050
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackMainMapActivity;->i:Lo/cir;

    if-eqz v0, :cond_1

    .line 1051
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackMainMapActivity;->i:Lo/cir;

    invoke-virtual {v0}, Lo/cir;->k()V

    .line 1054
    :cond_1
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackMainMapActivity;->c:Lo/cbu;

    if-eqz v0, :cond_3

    .line 1056
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackMainMapActivity;->c:Lo/cbu;

    invoke-virtual {v0}, Lo/cbu;->F()Z

    move-result v0

    if-nez v0, :cond_2

    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackMainMapActivity;->c:Lo/cbu;

    invoke-virtual {v0}, Lo/cbu;->ah()Z

    move-result v0

    if-nez v0, :cond_2

    .line 1057
    invoke-static {}, Lo/cdy;->a()V

    .line 1060
    :cond_2
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackMainMapActivity;->c:Lo/cbu;

    invoke-virtual {v0}, Lo/cbu;->Y()V

    .line 1061
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackMainMapActivity;->c:Lo/cbu;

    invoke-virtual {v0}, Lo/cbu;->G()V

    .line 1062
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackMainMapActivity;->c:Lo/cbu;

    .line 1065
    :cond_3
    invoke-static {}, Lo/cbl;->b()Lo/cbl;

    move-result-object v0

    invoke-virtual {v0}, Lo/cbl;->n()V

    .line 1072
    :cond_4
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackMainMapActivity;->s:Lo/cgg;

    if-eqz v0, :cond_5

    .line 1073
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackMainMapActivity;->s:Lo/cgg;

    invoke-virtual {v0}, Lo/cgg;->c()V

    .line 1076
    :cond_5
    sget v0, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackMainMapActivity;->w:I

    add-int/lit8 v0, v0, -0x1

    sput v0, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackMainMapActivity;->w:I

    .line 1077
    const-string v0, "Track_TrackMainMapActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "destroy sInstanceCount = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    sget v3, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackMainMapActivity;->w:I

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1078
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackMainMapActivity;->z:Z

    .line 1079
    return-void
.end method

.method private G()V
    .locals 4

    .line 1161
    new-instance v2, Lo/dcy;

    const/4 v0, 0x1

    invoke-direct {v2, v0}, Lo/dcy;-><init>(I)V

    .line 1162
    const/16 v0, 0x4e22

    invoke-static {v0}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v3

    .line 1163
    new-instance v0, Lo/cee;

    iget-object v1, p0, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackMainMapActivity;->q:Landroid/content/Context;

    invoke-direct {v0, v1, v2, v3}, Lo/cee;-><init>(Landroid/content/Context;Lo/dcy;Ljava/lang/String;)V

    iput-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackMainMapActivity;->x:Lo/cee;

    .line 1164
    return-void
.end method

.method private H()V
    .locals 6

    .line 1169
    invoke-static {}, Lo/cbl;->b()Lo/cbl;

    move-result-object v0

    invoke-virtual {v0}, Lo/cbl;->c()Lo/cbp;

    move-result-object v3

    .line 1170
    if-nez v3, :cond_0

    .line 1171
    return-void

    .line 1173
    :cond_0
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackMainMapActivity;->x:Lo/cee;

    if-nez v0, :cond_1

    .line 1174
    invoke-direct {p0}, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackMainMapActivity;->G()V

    .line 1176
    :cond_1
    invoke-static {}, Lo/czu;->i()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 1177
    invoke-static {}, Lo/cds;->c()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 1178
    invoke-interface {v3}, Lo/cbp;->h()Z

    move-result v0

    if-nez v0, :cond_2

    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackMainMapActivity;->x:Lo/cee;

    .line 1179
    invoke-virtual {v0}, Lo/cee;->l()Z

    move-result v0

    if-eqz v0, :cond_3

    .line 1180
    :cond_2
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackMainMapActivity;->c:Lo/cbu;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lo/cbu;->d(Z)V

    .line 1181
    return-void

    .line 1183
    :cond_3
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackMainMapActivity;->q:Landroid/content/Context;

    invoke-static {v0}, Lo/dom;->a(Landroid/content/Context;)Lo/dom;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackMainMapActivity;->q:Landroid/content/Context;

    const-string v2, "privacy_sport_data_num"

    invoke-virtual {v0, v1, v2}, Lo/dom;->a(Landroid/content/Context;Ljava/lang/String;)I

    move-result v4

    .line 1184
    const/4 v0, 0x3

    if-lt v4, v0, :cond_4

    .line 1185
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackMainMapActivity;->c:Lo/cbu;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lo/cbu;->d(Z)V

    .line 1186
    return-void

    .line 1188
    :cond_4
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackMainMapActivity;->q:Landroid/content/Context;

    invoke-static {v0}, Lo/dom;->a(Landroid/content/Context;)Lo/dom;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackMainMapActivity;->q:Landroid/content/Context;

    const-string v2, "privacy_sport_data_num"

    invoke-virtual {v0, v1, v2}, Lo/dom;->e(Landroid/content/Context;Ljava/lang/String;)V

    .line 1189
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackMainMapActivity;->q:Landroid/content/Context;

    sget v1, Lcom/huawei/healthcloud/plugintrack/R$layout;->track_privacy_comfirm_dialog:I

    const/4 v2, 0x0

    invoke-static {v0, v1, v2}, Landroid/view/View;->inflate(Landroid/content/Context;ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v5

    .line 1190
    new-instance v0, Lo/egw$c;

    iget-object v1, p0, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackMainMapActivity;->q:Landroid/content/Context;

    invoke-direct {v0, v1}, Lo/egw$c;-><init>(Landroid/content/Context;)V

    iget-object v1, p0, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackMainMapActivity;->q:Landroid/content/Context;

    sget v2, Lcom/huawei/healthcloud/plugintrack/R$string;->IDS_service_area_notice_title:I

    .line 1191
    invoke-virtual {v1, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/egw$c;->a(Ljava/lang/String;)Lo/egw$c;

    move-result-object v0

    .line 1192
    invoke-virtual {v0, v5}, Lo/egw$c;->e(Landroid/view/View;)Lo/egw$c;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackMainMapActivity;->q:Landroid/content/Context;

    sget v2, Lcom/huawei/healthcloud/plugintrack/R$string;->IDS_common_disagree:I

    .line 1193
    invoke-virtual {v1, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/String;->toUpperCase()Ljava/lang/String;

    move-result-object v1

    new-instance v2, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackMainMapActivity$10;

    invoke-direct {v2, p0, v3}, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackMainMapActivity$10;-><init>(Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackMainMapActivity;Lo/cbp;)V

    invoke-virtual {v0, v1, v2}, Lo/egw$c;->c(Ljava/lang/String;Landroid/view/View$OnClickListener;)Lo/egw$c;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackMainMapActivity;->q:Landroid/content/Context;

    sget v2, Lcom/huawei/healthcloud/plugintrack/R$string;->IDS_user_permission_ok:I

    .line 1200
    invoke-virtual {v1, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/String;->toUpperCase()Ljava/lang/String;

    move-result-object v1

    new-instance v2, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackMainMapActivity$6;

    invoke-direct {v2, p0, v3}, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackMainMapActivity$6;-><init>(Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackMainMapActivity;Lo/cbp;)V

    invoke-virtual {v0, v1, v2}, Lo/egw$c;->a(Ljava/lang/String;Landroid/view/View$OnClickListener;)Lo/egw$c;

    move-result-object v0

    .line 1208
    invoke-virtual {v0}, Lo/egw$c;->e()Lo/egw;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackMainMapActivity;->j:Lo/egw;

    .line 1209
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackMainMapActivity;->j:Lo/egw;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lo/egw;->setCancelable(Z)V

    .line 1210
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackMainMapActivity;->j:Lo/egw;

    invoke-virtual {v0}, Lo/egw;->show()V

    .line 1211
    return-void
.end method

.method static synthetic a(Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackMainMapActivity;Landroid/content/Intent;)Landroid/content/Intent;
    .locals 0

    .line 76
    iput-object p1, p0, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackMainMapActivity;->u:Landroid/content/Intent;

    return-object p1
.end method

.method static synthetic a(Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackMainMapActivity;)V
    .locals 0

    .line 76
    invoke-direct {p0}, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackMainMapActivity;->B()V

    return-void
.end method

.method static synthetic b(Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackMainMapActivity;)Lo/cbu;
    .locals 1

    .line 76
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackMainMapActivity;->c:Lo/cbu;

    return-object v0
.end method

.method private b(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V
    .locals 6

    .line 767
    new-instance v4, Landroid/content/Intent;

    invoke-direct {v4, p1}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    .line 768
    invoke-virtual {v4, p3}, Landroid/content/Intent;->setPackage(Ljava/lang/String;)Landroid/content/Intent;

    .line 769
    new-instance v5, Landroid/os/Bundle;

    invoke-direct {v5}, Landroid/os/Bundle;-><init>()V

    .line 770
    const-string v0, "state"

    invoke-virtual {v5, v0, p4}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    .line 771
    invoke-virtual {v4, v5}, Landroid/content/Intent;->putExtras(Landroid/os/Bundle;)Landroid/content/Intent;

    .line 772
    invoke-virtual {p0, v4, p2}, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackMainMapActivity;->sendBroadcast(Landroid/content/Intent;Ljava/lang/String;)V

    .line 773
    const-string v0, "Track_TrackMainMapActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Send permission broadcast to com.android.systemui, state:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 774
    return-void
.end method

.method static synthetic b(Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackMainMapActivity;II)Z
    .locals 1

    .line 76
    invoke-direct {p0, p1, p2}, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackMainMapActivity;->d(II)Z

    move-result v0

    return v0
.end method

.method static synthetic c(Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackMainMapActivity;)I
    .locals 1

    .line 76
    iget v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackMainMapActivity;->m:I

    return v0
.end method

.method private c(Landroid/content/Context;)V
    .locals 2

    .line 222
    new-instance v1, Landroid/content/Intent;

    invoke-direct {v1}, Landroid/content/Intent;-><init>()V

    .line 223
    const-string v0, "com.huawei.healthcloud.plugintrack.trackSdk.TrackService"

    invoke-virtual {v1, v0}, Landroid/content/Intent;->setAction(Ljava/lang/String;)Landroid/content/Intent;

    .line 224
    invoke-virtual {p1}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Landroid/content/Intent;->setPackage(Ljava/lang/String;)Landroid/content/Intent;

    .line 225
    invoke-virtual {p0, v1}, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackMainMapActivity;->stopService(Landroid/content/Intent;)Z

    .line 226
    return-void
.end method

.method static synthetic d(Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackMainMapActivity;)Lo/cir;
    .locals 1

    .line 76
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackMainMapActivity;->i:Lo/cir;

    return-object v0
.end method

.method private d(Landroid/content/Context;)V
    .locals 2

    .line 216
    new-instance v1, Landroid/content/Intent;

    invoke-direct {v1}, Landroid/content/Intent;-><init>()V

    .line 217
    const-string v0, "com.huawei.healthcloud.plugintrack.trackSdk.TrackService"

    invoke-virtual {v1, v0}, Landroid/content/Intent;->setAction(Ljava/lang/String;)Landroid/content/Intent;

    .line 218
    invoke-virtual {p1}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Landroid/content/Intent;->setPackage(Ljava/lang/String;)Landroid/content/Intent;

    .line 219
    invoke-virtual {p0, v1}, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackMainMapActivity;->startService(Landroid/content/Intent;)Landroid/content/ComponentName;

    .line 220
    return-void
.end method

.method private d(II)Z
    .locals 5

    .line 1152
    int-to-float v0, p2

    int-to-float v1, p1

    const/high16 v2, 0x42700000    # 60.0f

    div-float/2addr v1, v2

    div-float v4, v0, v1

    .line 1153
    const-string v0, "Track_TrackMainMapActivity"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "calibrationDistanceValidData stride is "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v4}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1154
    const/high16 v0, 0x435c0000    # 220.0f

    cmpl-float v0, v4, v0

    if-gtz v0, :cond_0

    const/high16 v0, 0x42a00000    # 80.0f

    cmpg-float v0, v4, v0

    if-gez v0, :cond_1

    .line 1155
    :cond_0
    const/4 v0, 0x0

    return v0

    .line 1157
    :cond_1
    const/4 v0, 0x1

    return v0
.end method

.method static synthetic e(Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackMainMapActivity;)Landroid/content/Intent;
    .locals 1

    .line 76
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackMainMapActivity;->u:Landroid/content/Intent;

    return-object v0
.end method

.method static synthetic f(Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackMainMapActivity;)Lo/cee;
    .locals 1

    .line 76
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackMainMapActivity;->x:Lo/cee;

    return-object v0
.end method

.method static synthetic g(Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackMainMapActivity;)Landroid/content/Context;
    .locals 1

    .line 76
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackMainMapActivity;->q:Landroid/content/Context;

    return-object v0
.end method

.method static synthetic h(Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackMainMapActivity;)V
    .locals 0

    .line 76
    invoke-direct {p0}, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackMainMapActivity;->G()V

    return-void
.end method

.method static synthetic i(Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackMainMapActivity;)V
    .locals 0

    .line 76
    invoke-direct {p0}, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackMainMapActivity;->H()V

    return-void
.end method

.method private j()Z
    .locals 5

    .line 851
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackMainMapActivity;->q:Landroid/content/Context;

    invoke-static {v0}, Lo/cds;->c(Landroid/content/Context;)I

    move-result v4

    .line 852
    const/4 v0, 0x2

    if-ne v4, v0, :cond_0

    .line 853
    const-string v0, "Track_TrackMainMapActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, " PHONE_STATE_CALL_STATE_RINGING"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 854
    const/4 v0, 0x0

    return v0

    .line 856
    :cond_0
    const/4 v0, 0x1

    if-ne v4, v0, :cond_1

    .line 857
    const-string v0, "Track_TrackMainMapActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, " PHONE_STATE_CALL_STATE_OFFHOOK"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 858
    const/4 v0, 0x0

    return v0

    .line 860
    :cond_1
    const/4 v0, 0x1

    return v0
.end method

.method static synthetic k(Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackMainMapActivity;)Ljava/util/ArrayList;
    .locals 1

    .line 76
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackMainMapActivity;->y:Ljava/util/ArrayList;

    return-object v0
.end method

.method static synthetic m(Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackMainMapActivity;)Lo/egw;
    .locals 1

    .line 76
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackMainMapActivity;->j:Lo/egw;

    return-object v0
.end method

.method private q()V
    .locals 6

    .line 507
    invoke-static {}, Lo/cbl;->b()Lo/cbl;

    move-result-object v0

    invoke-virtual {v0}, Lo/cbl;->c()Lo/cbp;

    move-result-object v4

    .line 508
    if-nez v4, :cond_0

    .line 509
    const-string v0, "Track_TrackMainMapActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "adapter is null ,showTrackMap"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 510
    invoke-direct {p0}, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackMainMapActivity;->z()V

    .line 511
    return-void

    .line 514
    :cond_0
    invoke-interface {v4}, Lo/cbp;->n()Z

    move-result v0

    if-eqz v0, :cond_4

    .line 515
    iget v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackMainMapActivity;->m:I

    const/16 v1, 0x102

    if-eq v0, v1, :cond_1

    iget v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackMainMapActivity;->m:I

    const/16 v1, 0x108

    if-ne v0, v1, :cond_3

    .line 517
    :cond_1
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackMainMapActivity;->q:Landroid/content/Context;

    .line 518
    const/16 v1, 0x4e22

    invoke-static {v1}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v1

    const-string v2, "show_sketch_after_track"

    .line 519
    invoke-static {v2}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    .line 517
    invoke-static {v0, v1, v2}, Lo/dct;->c(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    .line 520
    const-string v0, "Track_TrackMainMapActivity"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "runnning sp is"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object v5, v1, v2

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 521
    if-eqz v5, :cond_2

    const-string v0, "false"

    invoke-virtual {v5, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 522
    const-string v0, "Track_TrackMainMapActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "showTrackMap"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 523
    invoke-direct {p0}, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackMainMapActivity;->z()V

    goto :goto_0

    .line 525
    :cond_2
    const-string v0, "Track_TrackMainMapActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "startMainProcessForSuggestion"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 526
    invoke-direct {p0}, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackMainMapActivity;->t()V

    .line 528
    :goto_0
    goto :goto_1

    .line 529
    :cond_3
    const-string v0, "Track_TrackMainMapActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "showTrackMap not running"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 530
    invoke-direct {p0}, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackMainMapActivity;->z()V

    goto :goto_1

    .line 533
    :cond_4
    const-string v0, "Track_TrackMainMapActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "showTrackMap"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 534
    invoke-direct {p0}, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackMainMapActivity;->z()V

    .line 536
    :goto_1
    return-void
.end method

.method private r()V
    .locals 2

    .line 348
    new-instance v1, Landroid/content/Intent;

    const-string v0, "action_stop_service"

    invoke-direct {v1, v0}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    .line 349
    invoke-virtual {p0}, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackMainMapActivity;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0, v1}, Lo/ccd;->b(Landroid/content/Context;Landroid/content/Intent;)V

    .line 350
    return-void
.end method

.method private s()V
    .locals 3

    .line 189
    invoke-virtual {p0}, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackMainMapActivity;->getIntent()Landroid/content/Intent;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackMainMapActivity;->getIntent()Landroid/content/Intent;

    move-result-object v0

    const-string v1, "sportdataparams"

    invoke-virtual {v0, v1}, Landroid/content/Intent;->getBundleExtra(Ljava/lang/String;)Landroid/os/Bundle;

    move-result-object v0

    if-nez v0, :cond_1

    .line 190
    :cond_0
    const/4 v0, 0x0

    iput v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackMainMapActivity;->m:I

    .line 191
    const/4 v0, -0x1

    iput v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackMainMapActivity;->p:I

    .line 192
    const/high16 v0, -0x40800000    # -1.0f

    iput v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackMainMapActivity;->l:F

    .line 193
    const/4 v0, -0x1

    iput v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackMainMapActivity;->n:I

    .line 194
    return-void

    .line 197
    :cond_1
    invoke-virtual {p0}, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackMainMapActivity;->getIntent()Landroid/content/Intent;

    move-result-object v0

    const-string v1, "sportdataparams"

    invoke-virtual {v0, v1}, Landroid/content/Intent;->getBundleExtra(Ljava/lang/String;)Landroid/os/Bundle;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackMainMapActivity;->f:Landroid/os/Bundle;

    .line 200
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackMainMapActivity;->f:Landroid/os/Bundle;

    const-string v1, "map_tracking_sport_type_sportting"

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Landroid/os/Bundle;->getInt(Ljava/lang/String;I)I

    move-result v0

    iput v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackMainMapActivity;->m:I

    .line 201
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackMainMapActivity;->f:Landroid/os/Bundle;

    const-string v1, "sport_target_type_sportting"

    const/4 v2, -0x1

    invoke-virtual {v0, v1, v2}, Landroid/os/Bundle;->getInt(Ljava/lang/String;I)I

    move-result v0

    iput v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackMainMapActivity;->p:I

    .line 202
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackMainMapActivity;->f:Landroid/os/Bundle;

    const-string v1, "sport_target_value_sportting"

    const/high16 v2, -0x40800000    # -1.0f

    invoke-virtual {v0, v1, v2}, Landroid/os/Bundle;->getFloat(Ljava/lang/String;F)F

    move-result v0

    iput v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackMainMapActivity;->l:F

    .line 203
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackMainMapActivity;->f:Landroid/os/Bundle;

    const-string v1, "origintarget"

    const/4 v2, -0x1

    invoke-virtual {v0, v1, v2}, Landroid/os/Bundle;->getInt(Ljava/lang/String;I)I

    move-result v0

    iput v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackMainMapActivity;->n:I

    .line 205
    return-void
.end method

.method private t()V
    .locals 8

    .line 539
    new-instance v4, Landroid/content/Intent;

    invoke-direct {v4}, Landroid/content/Intent;-><init>()V

    .line 540
    const-string v0, "com.huawei.health"

    invoke-virtual {v4, v0}, Landroid/content/Intent;->setPackage(Ljava/lang/String;)Landroid/content/Intent;

    .line 541
    const-string v0, "com.huawei.health"

    const-string v1, "com.huawei.health.receiver.MainProcessHelperService"

    invoke-virtual {v4, v0, v1}, Landroid/content/Intent;->setClassName(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 543
    const-string v0, "start_main_process_for_pluginsuggestion_running_stretch"

    invoke-virtual {v4, v0}, Landroid/content/Intent;->setAction(Ljava/lang/String;)Landroid/content/Intent;

    .line 544
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v5

    .line 545
    const-string v0, "Track_TrackMainMapActivity"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "startMainProcess "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object v5, v1, v2

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 546
    if-eqz v5, :cond_0

    .line 547
    invoke-virtual {v5, v4}, Landroid/content/Context;->startService(Landroid/content/Intent;)Landroid/content/ComponentName;

    .line 549
    :cond_0
    new-instance v6, Ljava/util/HashMap;

    invoke-direct {v6}, Ljava/util/HashMap;-><init>()V

    .line 550
    sget-object v0, Lo/dae;->hQ:Lo/dae;

    invoke-virtual {v0}, Lo/dae;->b()Ljava/lang/String;

    move-result-object v7

    .line 551
    const-string v0, "click"

    const-string v1, "1"

    invoke-interface {v6, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 552
    invoke-static {}, Lo/cxf;->e()Lo/cxf;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackMainMapActivity;->q:Landroid/content/Context;

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v7, v6, v2}, Lo/cxf;->a(Landroid/content/Context;Ljava/lang/String;Ljava/util/Map;I)I

    .line 553
    invoke-virtual {p0}, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackMainMapActivity;->finish()V

    .line 554
    return-void
.end method

.method private u()V
    .locals 2

    .line 342
    new-instance v1, Landroid/content/Intent;

    const-class v0, Lcom/huawei/healthcloud/plugintrack/manager/service/VoiceEngService;

    invoke-direct {v1, p0, v0}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 343
    const-string v0, "action_voice_soundpool_enge"

    invoke-virtual {v1, v0}, Landroid/content/Intent;->setAction(Ljava/lang/String;)Landroid/content/Intent;

    .line 344
    invoke-virtual {p0, v1}, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackMainMapActivity;->startService(Landroid/content/Intent;)Landroid/content/ComponentName;

    .line 345
    return-void
.end method

.method private v()V
    .locals 5

    .line 686
    const-string v0, "Track_TrackMainMapActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "====enter showSystemTimeErrorTipDialog()====="

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 687
    new-instance v0, Lo/egv$b;

    iget-object v1, p0, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackMainMapActivity;->q:Landroid/content/Context;

    invoke-direct {v0, v1}, Lo/egv$b;-><init>(Landroid/content/Context;)V

    sget v1, Lcom/huawei/healthcloud/plugintrack/R$string;->IDS_plugin_motion_track_systemtime_error_tip:I

    .line 688
    invoke-virtual {v0, v1}, Lo/egv$b;->e(I)Lo/egv$b;

    move-result-object v0

    sget v1, Lcom/huawei/healthcloud/plugintrack/R$string;->IDS_motiontrack_show_remind:I

    .line 689
    invoke-virtual {v0, v1}, Lo/egv$b;->b(I)Lo/egv$b;

    move-result-object v0

    sget v1, Lcom/huawei/healthcloud/plugintrack/R$string;->IDS_settings_button_ok:I

    new-instance v2, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackMainMapActivity$3;

    invoke-direct {v2, p0}, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackMainMapActivity$3;-><init>(Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackMainMapActivity;)V

    .line 690
    invoke-virtual {v0, v1, v2}, Lo/egv$b;->e(ILandroid/view/View$OnClickListener;)Lo/egv$b;

    move-result-object v4

    .line 704
    invoke-virtual {v4}, Lo/egv$b;->b()Lo/egv;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackMainMapActivity;->A:Lo/egv;

    .line 705
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackMainMapActivity;->A:Lo/egv;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lo/egv;->setCancelable(Z)V

    .line 706
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackMainMapActivity;->A:Lo/egv;

    invoke-virtual {v0}, Lo/egv;->show()V

    .line 707
    return-void
.end method

.method private w()V
    .locals 5

    .line 650
    const-string v0, "Track_TrackMainMapActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "====enter showLittleDataDialog()====="

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 651
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackMainMapActivity;->C:Lo/egy;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackMainMapActivity;->C:Lo/egy;

    invoke-virtual {v0}, Lo/egy;->isShowing()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 652
    const-string v0, "Track_TrackMainMapActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "LittleDataDialog is showing"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 653
    return-void

    .line 655
    :cond_0
    new-instance v0, Lo/egy$b;

    iget-object v1, p0, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackMainMapActivity;->q:Landroid/content/Context;

    invoke-direct {v0, v1}, Lo/egy$b;-><init>(Landroid/content/Context;)V

    sget v1, Lcom/huawei/healthcloud/plugintrack/R$string;->IDS_plugin_motiontrack_little_data:I

    .line 656
    invoke-virtual {v0, v1}, Lo/egy$b;->b(I)Lo/egy$b;

    move-result-object v0

    sget v1, Lcom/huawei/healthcloud/plugintrack/R$string;->IDS_motiontrack_show_sport_dialog_finish:I

    new-instance v2, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackMainMapActivity$1;

    invoke-direct {v2, p0}, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackMainMapActivity$1;-><init>(Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackMainMapActivity;)V

    .line 657
    invoke-virtual {v0, v1, v2}, Lo/egy$b;->d(ILandroid/view/View$OnClickListener;)Lo/egy$b;

    move-result-object v0

    sget v1, Lcom/huawei/healthcloud/plugintrack/R$string;->IDS_motiontrack_show_sport_dialog_continue:I

    new-instance v2, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackMainMapActivity$5;

    invoke-direct {v2, p0}, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackMainMapActivity$5;-><init>(Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackMainMapActivity;)V

    .line 670
    invoke-virtual {v0, v1, v2}, Lo/egy$b;->e(ILandroid/view/View$OnClickListener;)Lo/egy$b;

    move-result-object v4

    .line 677
    invoke-virtual {v4}, Lo/egy$b;->a()Lo/egy;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackMainMapActivity;->C:Lo/egy;

    .line 678
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackMainMapActivity;->C:Lo/egy;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lo/egy;->setCancelable(Z)V

    .line 679
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackMainMapActivity;->C:Lo/egy;

    invoke-virtual {v0}, Lo/egy;->show()V

    .line 681
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackMainMapActivity;->c:Lo/cbu;

    const/4 v1, 0x4

    invoke-virtual {v0, v1}, Lo/cbu;->h(I)V

    .line 682
    return-void
.end method

.method private x()V
    .locals 1

    .line 753
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackMainMapActivity;->i:Lo/cir;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackMainMapActivity;->i:Lo/cir;

    invoke-virtual {v0}, Lo/cir;->g()Z

    move-result v0

    if-nez v0, :cond_0

    .line 754
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackMainMapActivity;->i:Lo/cir;

    invoke-virtual {v0}, Lo/cir;->a()V

    .line 756
    :cond_0
    return-void
.end method

.method private y()V
    .locals 5

    .line 760
    new-instance v4, Landroid/content/Intent;

    const-string v0, "ACTION_ACTIVITY_PAUSE_CITY_AS"

    invoke-direct {v4, v0}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    .line 761
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackMainMapActivity;->q:Landroid/content/Context;

    invoke-static {v0, v4}, Lo/ccd;->b(Landroid/content/Context;Landroid/content/Intent;)V

    .line 762
    const-string v0, "Track_TrackMainMapActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "Stop OfflineMap Download service"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 763
    return-void
.end method

.method private z()V
    .locals 5

    .line 710
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackMainMapActivity;->c:Lo/cbu;

    invoke-virtual {v0}, Lo/cbu;->B()Lo/cex;

    move-result-object v3

    .line 711
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackMainMapActivity;->c:Lo/cbu;

    invoke-virtual {v0}, Lo/cbu;->E()Lcom/huawei/healthcloud/plugintrack/model/MotionPathSimplify;

    move-result-object v4

    .line 712
    const/4 v0, 0x0

    if-eq v0, v3, :cond_2

    const/4 v0, 0x0

    if-eq v0, v4, :cond_2

    .line 714
    iget v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackMainMapActivity;->m:I

    if-eqz v0, :cond_0

    iget v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackMainMapActivity;->m:I

    const/16 v1, 0x102

    if-eq v0, v1, :cond_0

    iget v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackMainMapActivity;->m:I

    const/16 v1, 0x108

    if-ne v0, v1, :cond_1

    .line 715
    :cond_0
    invoke-static {}, Lo/cbl;->b()Lo/cbl;

    move-result-object v0

    const-string v1, "motion_path2.txt"

    const/4 v2, 0x1

    invoke-virtual {v0, v1, v4, v2}, Lo/cbl;->a(Ljava/lang/String;Lcom/huawei/healthcloud/plugintrack/model/MotionPathSimplify;Z)V

    goto :goto_0

    .line 717
    :cond_1
    invoke-static {}, Lo/cbl;->b()Lo/cbl;

    move-result-object v0

    const-string v1, "motion_path2.txt"

    invoke-virtual {v0, v1, v4}, Lo/cbl;->d(Ljava/lang/String;Lcom/huawei/healthcloud/plugintrack/model/MotionPathSimplify;)V

    .line 720
    :cond_2
    :goto_0
    invoke-virtual {p0}, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackMainMapActivity;->finish()V

    .line 721
    return-void
.end method


# virtual methods
.method protected a()V
    .locals 6

    .line 264
    const-string v0, "Track_TrackMainMapActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "initSport"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 265
    invoke-virtual {p0}, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackMainMapActivity;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lo/cbu;->c(Landroid/content/Context;)Lo/cbu;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackMainMapActivity;->c:Lo/cbu;

    .line 266
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackMainMapActivity;->c:Lo/cbu;

    invoke-virtual {v0}, Lo/cbu;->d()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 267
    const-string v0, "Track_TrackMainMapActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "initSport() mPluginTrackAdapter is null can\'t start sport!"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 268
    invoke-virtual {p0}, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackMainMapActivity;->finish()V

    .line 269
    return-void

    .line 271
    :cond_0
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackMainMapActivity;->c:Lo/cbu;

    invoke-virtual {v0}, Lo/cbu;->v()V

    .line 272
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackMainMapActivity;->a:Lo/cco;

    invoke-interface {v0}, Lo/cco;->c()Lo/ciw;

    move-result-object v4

    .line 273
    if-nez v4, :cond_1

    .line 274
    return-void

    .line 276
    :cond_1
    invoke-virtual {v4}, Lo/ciw;->e()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lo/cir;

    iput-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackMainMapActivity;->i:Lo/cir;

    .line 277
    iget v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackMainMapActivity;->m:I

    const/16 v1, 0x108

    if-eq v0, v1, :cond_3

    .line 278
    invoke-static {}, Lo/cds;->a()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 279
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackMainMapActivity;->c:Lo/cbu;

    iget-object v1, p0, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackMainMapActivity;->i:Lo/cir;

    invoke-virtual {v1}, Lo/cir;->e()Lo/chc;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/cbu;->c(Lo/chc;)V

    .line 280
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackMainMapActivity;->i:Lo/cir;

    invoke-virtual {v0}, Lo/cir;->e()Lo/chc;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackMainMapActivity;->h:Landroid/os/Handler;

    invoke-interface {v0, v1}, Lo/chc;->a(Landroid/os/Handler;)V

    goto :goto_0

    .line 282
    :cond_2
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackMainMapActivity;->c:Lo/cbu;

    iget-object v1, p0, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackMainMapActivity;->i:Lo/cir;

    invoke-virtual {v1}, Lo/cir;->f()Lo/cha;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/cbu;->e(Lo/cha;)V

    .line 289
    :cond_3
    :goto_0
    new-instance v0, Ljava/io/File;

    invoke-virtual {p0}, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackMainMapActivity;->getApplicationContext()Landroid/content/Context;

    move-result-object v1

    invoke-virtual {v1}, Landroid/content/Context;->getFilesDir()Ljava/io/File;

    move-result-object v1

    const-string v2, "simplemotion.txt"

    invoke-direct {v0, v1, v2}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    iput-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackMainMapActivity;->k:Ljava/io/File;

    .line 291
    new-instance v0, Ljava/io/File;

    invoke-virtual {p0}, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackMainMapActivity;->getApplicationContext()Landroid/content/Context;

    move-result-object v1

    invoke-virtual {v1}, Landroid/content/Context;->getFilesDir()Ljava/io/File;

    move-result-object v1

    const-string v2, "motion_path2.txt"

    invoke-direct {v0, v1, v2}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    iput-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackMainMapActivity;->g:Ljava/io/File;

    .line 293
    invoke-static {}, Lo/cxh;->a()Z

    move-result v0

    if-nez v0, :cond_4

    .line 294
    invoke-direct {p0}, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackMainMapActivity;->u()V

    .line 297
    :cond_4
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackMainMapActivity;->c:Lo/cbu;

    invoke-virtual {v0}, Lo/cbu;->ab()V

    .line 299
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackMainMapActivity;->c:Lo/cbu;

    invoke-virtual {v0, p0}, Lo/cbu;->a(Lo/cbu$e;)V

    .line 302
    invoke-direct {p0, p0}, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackMainMapActivity;->d(Landroid/content/Context;)V

    .line 304
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackMainMapActivity;->c:Lo/cbu;

    invoke-virtual {v0}, Lo/cbu;->ah()Z

    move-result v5

    .line 305
    if-eqz v5, :cond_5

    .line 306
    new-instance v0, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackMainMapActivity$2;

    invoke-direct {v0, p0}, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackMainMapActivity$2;-><init>(Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackMainMapActivity;)V

    invoke-virtual {p0, v0}, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackMainMapActivity;->runOnUiThread(Ljava/lang/Runnable;)V

    goto :goto_1

    .line 329
    :cond_5
    invoke-static {}, Lo/cdy;->a()V

    .line 333
    :goto_1
    const-string v0, "com.huawei.healthcloud.plugintrack.NOTIFY_SPORT_DATA"

    const-string v1, "com.android.keyguard.permission.SEND_STEP_INFO_COUNTER"

    const-string v2, "com.android.systemui"

    const/4 v3, 0x1

    invoke-direct {p0, v0, v1, v2, v3}, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackMainMapActivity;->b(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V

    .line 335
    invoke-virtual {p0}, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackMainMapActivity;->getWindow()Landroid/view/Window;

    move-result-object v0

    const/high16 v1, 0x80000

    invoke-virtual {v0, v1}, Landroid/view/Window;->clearFlags(I)V

    .line 337
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackMainMapActivity;->c:Lo/cbu;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lo/cbu;->e(Z)V

    .line 339
    return-void
.end method

.method public a(I)V
    .locals 5

    .line 452
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackMainMapActivity;->c:Lo/cbu;

    invoke-virtual {v0}, Lo/cbu;->s()V

    .line 454
    new-instance v3, Ljava/util/HashMap;

    invoke-direct {v3}, Ljava/util/HashMap;-><init>()V

    .line 455
    sget-object v0, Lo/dae;->hu:Lo/dae;

    invoke-virtual {v0}, Lo/dae;->b()Ljava/lang/String;

    move-result-object v4

    .line 456
    const-string v0, "click"

    const/4 v1, 0x1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v3, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 457
    const-string v0, "sportId"

    iget-object v1, p0, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackMainMapActivity;->c:Lo/cbu;

    invoke-virtual {v1}, Lo/cbu;->H()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v3, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 458
    invoke-static {}, Lo/czu;->e()Z

    move-result v0

    if-nez v0, :cond_0

    .line 459
    const-string v0, "startTime"

    iget-object v1, p0, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackMainMapActivity;->c:Lo/cbu;

    invoke-virtual {v1}, Lo/cbu;->ae()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-interface {v3, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 460
    const-string v0, "pauseTime"

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v1

    invoke-static {v1, v2}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object v1

    invoke-interface {v3, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 461
    const-string v0, "sportTime"

    iget-object v1, p0, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackMainMapActivity;->c:Lo/cbu;

    invoke-virtual {v1}, Lo/cbu;->m()J

    move-result-wide v1

    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    invoke-interface {v3, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 462
    const-string v0, "distances"

    iget-object v1, p0, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackMainMapActivity;->c:Lo/cbu;

    invoke-virtual {v1}, Lo/cbu;->g()F

    move-result v1

    float-to-int v1, v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v3, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 463
    const-string v0, "avgPace"

    iget-object v1, p0, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackMainMapActivity;->c:Lo/cbu;

    invoke-virtual {v1}, Lo/cbu;->I()F

    move-result v1

    invoke-static {v1}, Lo/cdl;->e(F)Ljava/lang/String;

    move-result-object v1

    invoke-interface {v3, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 465
    :cond_0
    invoke-static {}, Lo/cxf;->e()Lo/cxf;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackMainMapActivity;->q:Landroid/content/Context;

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v4, v3, v2}, Lo/cxf;->a(Landroid/content/Context;Ljava/lang/String;Ljava/util/Map;I)I

    .line 466
    return-void
.end method

.method protected b()V
    .locals 5

    .line 231
    iget v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackMainMapActivity;->m:I

    const/16 v1, 0x108

    if-ne v0, v1, :cond_1

    .line 232
    sget v0, Lcom/huawei/healthcloud/plugintrack/R$layout;->track_activity_indoor_tracking_main:I

    invoke-virtual {p0, v0}, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackMainMapActivity;->setContentView(I)V

    .line 234
    :try_start_0
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x17

    if-lt v0, v1, :cond_0

    invoke-static {}, Lo/dbf;->d()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 235
    invoke-virtual {p0}, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackMainMapActivity;->getWindow()Landroid/view/Window;

    move-result-object v0

    const/high16 v1, -0x80000000

    invoke-virtual {v0, v1}, Landroid/view/Window;->addFlags(I)V

    .line 236
    invoke-virtual {p0}, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackMainMapActivity;->getWindow()Landroid/view/Window;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/view/Window;->setStatusBarColor(I)V

    .line 237
    invoke-virtual {p0}, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackMainMapActivity;->getWindow()Landroid/view/Window;

    move-result-object v0

    invoke-virtual {v0}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    move-result-object v0

    const/16 v1, 0x2400

    invoke-virtual {v0, v1}, Landroid/view/View;->setSystemUiVisibility(I)V

    .line 239
    invoke-virtual {p0}, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackMainMapActivity;->getWindow()Landroid/view/Window;

    move-result-object v0

    invoke-virtual {p0}, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackMainMapActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/healthcloud/plugintrack/R$color;->track_activity_navigate_bg:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getColor(I)I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/view/Window;->setNavigationBarColor(I)V
    :try_end_0
    .catch Ljava/lang/NoSuchMethodError; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 243
    :cond_0
    goto :goto_0

    .line 241
    :catch_0
    move-exception v4

    .line 242
    const-string v0, "Track_TrackMainMapActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "setStatusBarColor error"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 243
    goto :goto_0

    .line 245
    :cond_1
    invoke-static {}, Lo/cds;->a()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 246
    sget v0, Lcom/huawei/healthcloud/plugintrack/R$layout;->track_activity_map_tracking_main:I

    invoke-virtual {p0, v0}, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackMainMapActivity;->setContentView(I)V

    goto :goto_0

    .line 248
    :cond_2
    sget v0, Lcom/huawei/healthcloud/plugintrack/R$layout;->track_activity_google_map_tracking_main:I

    invoke-virtual {p0, v0}, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackMainMapActivity;->setContentView(I)V

    .line 251
    :goto_0
    return-void
.end method

.method public b(I)V
    .locals 2

    .line 365
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackMainMapActivity;->c:Lo/cbu;

    invoke-virtual {v0}, Lo/cbu;->ag()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 366
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackMainMapActivity;->i:Lo/cir;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lo/cir;->e(Z)V

    goto :goto_0

    .line 368
    :cond_0
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackMainMapActivity;->i:Lo/cir;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lo/cir;->e(Z)V

    .line 370
    :goto_0
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackMainMapActivity;->i:Lo/cir;

    invoke-virtual {v0, p1}, Lo/cir;->a(I)V

    .line 373
    return-void
.end method

.method public c()V
    .locals 1

    .line 579
    invoke-virtual {p0}, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackMainMapActivity;->isFinishing()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 580
    return-void

    .line 582
    :cond_0
    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackMainMapActivity;->c(I)V

    .line 585
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackMainMapActivity;->C:Lo/egy;

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackMainMapActivity;->C:Lo/egy;

    invoke-virtual {v0}, Lo/egy;->isShowing()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 586
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackMainMapActivity;->C:Lo/egy;

    invoke-virtual {v0}, Lo/egy;->dismiss()V

    .line 587
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackMainMapActivity;->C:Lo/egy;

    .line 589
    :cond_1
    return-void
.end method

.method public c(I)V
    .locals 5

    .line 558
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackMainMapActivity;->c:Lo/cbu;

    invoke-virtual {v0}, Lo/cbu;->y()V

    .line 560
    new-instance v3, Ljava/util/HashMap;

    invoke-direct {v3}, Ljava/util/HashMap;-><init>()V

    .line 561
    sget-object v0, Lo/dae;->hv:Lo/dae;

    invoke-virtual {v0}, Lo/dae;->b()Ljava/lang/String;

    move-result-object v4

    .line 562
    const-string v0, "click"

    const/4 v1, 0x1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v3, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 563
    const-string v0, "sportId"

    iget-object v1, p0, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackMainMapActivity;->c:Lo/cbu;

    invoke-virtual {v1}, Lo/cbu;->H()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v3, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 564
    invoke-static {}, Lo/czu;->e()Z

    move-result v0

    if-nez v0, :cond_0

    .line 565
    const-string v0, "startTime"

    iget-object v1, p0, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackMainMapActivity;->c:Lo/cbu;

    invoke-virtual {v1}, Lo/cbu;->ae()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-interface {v3, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 566
    const-string v0, "resumeTime"

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v1

    invoke-static {v1, v2}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object v1

    invoke-interface {v3, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 567
    const-string v0, "sportTime"

    iget-object v1, p0, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackMainMapActivity;->c:Lo/cbu;

    invoke-virtual {v1}, Lo/cbu;->m()J

    move-result-wide v1

    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    invoke-interface {v3, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 568
    const-string v0, "distances"

    iget-object v1, p0, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackMainMapActivity;->c:Lo/cbu;

    invoke-virtual {v1}, Lo/cbu;->g()F

    move-result v1

    float-to-int v1, v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v3, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 571
    :cond_0
    invoke-static {}, Lo/cxf;->e()Lo/cxf;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackMainMapActivity;->q:Landroid/content/Context;

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v4, v3, v2}, Lo/cxf;->a(Landroid/content/Context;Ljava/lang/String;Ljava/util/Map;I)I

    .line 572
    return-void
.end method

.method public d()V
    .locals 6

    .line 397
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackMainMapActivity;->c:Lo/cbu;

    if-nez v0, :cond_0

    .line 398
    invoke-virtual {p0}, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackMainMapActivity;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lo/cbu;->c(Landroid/content/Context;)Lo/cbu;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackMainMapActivity;->c:Lo/cbu;

    .line 402
    :cond_0
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackMainMapActivity;->c:Lo/cbu;

    invoke-virtual {v0}, Lo/cbu;->v()V

    .line 403
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackMainMapActivity;->c:Lo/cbu;

    iget v1, p0, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackMainMapActivity;->m:I

    invoke-virtual {v0, v1}, Lo/cbu;->d(I)V

    .line 405
    iget v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackMainMapActivity;->n:I

    const/4 v1, 0x3

    if-eq v0, v1, :cond_1

    .line 406
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackMainMapActivity;->c:Lo/cbu;

    iget v1, p0, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackMainMapActivity;->p:I

    iget v2, p0, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackMainMapActivity;->l:F

    invoke-virtual {v0, v1, v2}, Lo/cbu;->c(IF)V

    .line 409
    :cond_1
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackMainMapActivity;->c:Lo/cbu;

    iget v1, p0, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackMainMapActivity;->n:I

    invoke-virtual {v0, v1}, Lo/cbu;->c(I)V

    .line 411
    const-string v0, "Track_TrackMainMapActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, ""

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget v3, p0, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackMainMapActivity;->m:I

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, ":"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget v3, p0, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackMainMapActivity;->p:I

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, ":"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget v3, p0, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackMainMapActivity;->n:I

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, ":"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget v3, p0, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackMainMapActivity;->l:F

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 414
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackMainMapActivity;->c:Lo/cbu;

    invoke-virtual {v0}, Lo/cbu;->q()V

    .line 415
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackMainMapActivity;->c:Lo/cbu;

    invoke-virtual {v0}, Lo/cbu;->k()Lo/cgk;

    move-result-object v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_4

    iget v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackMainMapActivity;->m:I

    const/16 v1, 0x108

    if-eq v0, v1, :cond_4

    .line 416
    const-string v0, "Track_TrackMainMapActivity"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "TrackMainMapActivitygetCurrentLocation() = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    iget-object v2, p0, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackMainMapActivity;->c:Lo/cbu;

    invoke-virtual {v2}, Lo/cbu;->k()Lo/cgk;

    move-result-object v2

    invoke-virtual {v2}, Lo/cgk;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 417
    invoke-static {}, Lo/cds;->a()Z

    move-result v0

    if-eqz v0, :cond_3

    .line 418
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackMainMapActivity;->i:Lo/cir;

    invoke-virtual {v0}, Lo/cir;->e()Lo/chc;

    move-result-object v4

    .line 419
    if-eqz v4, :cond_2

    .line 420
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackMainMapActivity;->c:Lo/cbu;

    invoke-virtual {v0}, Lo/cbu;->k()Lo/cgk;

    move-result-object v0

    invoke-static {v0}, Lo/cdr;->b(Lo/cgk;)Lcom/amap/api/maps/model/LatLng;

    move-result-object v0

    const-wide/16 v1, 0x0

    const/4 v3, 0x0

    invoke-interface {v4, v0, v1, v2, v3}, Lo/chc;->d(Lcom/amap/api/maps/model/LatLng;JLcom/amap/api/maps/AMap$CancelableCallback;)V

    .line 422
    :cond_2
    goto :goto_0

    .line 423
    :cond_3
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackMainMapActivity;->i:Lo/cir;

    invoke-virtual {v0}, Lo/cir;->f()Lo/cha;

    move-result-object v4

    .line 424
    if-eqz v4, :cond_4

    .line 425
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackMainMapActivity;->c:Lo/cbu;

    invoke-virtual {v0}, Lo/cbu;->k()Lo/cgk;

    move-result-object v0

    invoke-static {v0}, Lo/cdr;->c(Lo/cgk;)Lcom/google/android/gms/maps/model/LatLng;

    move-result-object v0

    const-wide/16 v1, 0x0

    const/4 v3, 0x0

    invoke-interface {v4, v0, v1, v2, v3}, Lo/cha;->b(Lcom/google/android/gms/maps/model/LatLng;JLcom/google/android/gms/maps/GoogleMap$CancelableCallback;)V

    .line 431
    :cond_4
    :goto_0
    const-string v0, "Track_TrackMainMapActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "To show app lock screen"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 432
    new-instance v0, Lo/cgg;

    invoke-direct {v0, p0}, Lo/cgg;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackMainMapActivity;->s:Lo/cgg;

    .line 433
    new-instance v0, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackMainMapActivity$c;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackMainMapActivity$c;-><init>(Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackMainMapActivity;Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackMainMapActivity$2;)V

    iput-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackMainMapActivity;->r:Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackMainMapActivity$c;

    .line 434
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackMainMapActivity;->s:Lo/cgg;

    iget-object v1, p0, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackMainMapActivity;->r:Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackMainMapActivity$c;

    invoke-virtual {v0, v1}, Lo/cgg;->c(Lo/cgg$d;)V

    .line 436
    new-instance v4, Ljava/util/HashMap;

    invoke-direct {v4}, Ljava/util/HashMap;-><init>()V

    .line 437
    sget-object v0, Lo/dae;->hw:Lo/dae;

    invoke-virtual {v0}, Lo/dae;->b()Ljava/lang/String;

    move-result-object v5

    .line 438
    const-string v0, "sportId"

    iget-object v1, p0, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackMainMapActivity;->c:Lo/cbu;

    invoke-virtual {v1}, Lo/cbu;->H()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v4, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 439
    invoke-static {}, Lo/czu;->e()Z

    move-result v0

    if-nez v0, :cond_5

    .line 440
    const-string v0, "startTime"

    iget-object v1, p0, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackMainMapActivity;->c:Lo/cbu;

    invoke-virtual {v1}, Lo/cbu;->ae()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v4, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 441
    const-string v0, "goalValue"

    iget v1, p0, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackMainMapActivity;->l:F

    float-to-int v1, v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v4, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 443
    :cond_5
    const-string v0, "goalType"

    iget v1, p0, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackMainMapActivity;->p:I

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v4, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 444
    const-string v0, "sportType"

    iget v1, p0, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackMainMapActivity;->m:I

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v4, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 445
    const-string v0, "trackType"

    iget-object v1, p0, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackMainMapActivity;->c:Lo/cbu;

    invoke-virtual {v1}, Lo/cbu;->a()I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v4, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 447
    invoke-static {}, Lo/cxf;->e()Lo/cxf;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackMainMapActivity;->q:Landroid/content/Context;

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v5, v4, v2}, Lo/cxf;->a(Landroid/content/Context;Ljava/lang/String;Ljava/util/Map;I)I

    .line 448
    return-void
.end method

.method public d(I)V
    .locals 1

    .line 783
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackMainMapActivity;->i:Lo/cir;

    invoke-virtual {v0, p1}, Lo/cir;->d(I)V

    .line 784
    return-void
.end method

.method public d(Z)V
    .locals 0

    .line 957
    iput-boolean p1, p0, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackMainMapActivity;->v:Z

    .line 958
    return-void
.end method

.method protected e()Lo/cco;
    .locals 8

    .line 256
    invoke-virtual {p0}, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackMainMapActivity;->getWindow()Landroid/view/Window;

    move-result-object v0

    invoke-virtual {v0}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    move-result-object v0

    invoke-virtual {v0}, Landroid/view/View;->getRootView()Landroid/view/View;

    move-result-object v6

    .line 257
    new-instance v0, Lo/cir;

    move-object v1, v6

    move-object v2, p0

    iget-object v3, p0, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackMainMapActivity;->e:Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackBaseActivity;

    move-object v4, p0

    iget-object v5, p0, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackMainMapActivity;->f:Landroid/os/Bundle;

    invoke-direct/range {v0 .. v5}, Lo/cir;-><init>(Landroid/view/View;Landroid/content/Context;Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackBaseActivity;Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackMainMapActivity;Landroid/os/Bundle;)V

    move-object v7, v0

    .line 258
    return-object v7
.end method

.method public e(Landroid/content/Intent;)V
    .locals 6

    .line 865
    if-nez p1, :cond_0

    .line 866
    return-void

    .line 869
    :cond_0
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackMainMapActivity;->q:Landroid/content/Context;

    iget-object v1, p0, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackMainMapActivity;->q:Landroid/content/Context;

    const-string v1, "keyguard"

    invoke-virtual {v0, v1}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Landroid/app/KeyguardManager;

    .line 870
    invoke-virtual {v4}, Landroid/app/KeyguardManager;->inKeyguardRestrictedInputMode()Z

    move-result v5

    .line 871
    const-string v0, "Track_TrackMainMapActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, " lock screen "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 872
    if-nez v5, :cond_1

    .line 874
    return-void

    .line 876
    :cond_1
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackMainMapActivity;->q:Landroid/content/Context;

    const-class v1, Lcom/huawei/healthcloud/plugintrack/ui/activity/LockScreenCoverActivity;

    invoke-virtual {p1, v0, v1}, Landroid/content/Intent;->setClass(Landroid/content/Context;Ljava/lang/Class;)Landroid/content/Intent;

    .line 877
    const/high16 v0, 0x10000000

    invoke-virtual {p1, v0}, Landroid/content/Intent;->addFlags(I)Landroid/content/Intent;

    .line 878
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackMainMapActivity;->q:Landroid/content/Context;

    invoke-virtual {v0, p1}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V

    .line 879
    return-void
.end method

.method public e(Landroid/content/Intent;I)V
    .locals 0

    .line 953
    invoke-virtual {p0, p1, p2}, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackMainMapActivity;->startActivityForResult(Landroid/content/Intent;I)V

    .line 954
    return-void
.end method

.method public e(Z)V
    .locals 6

    .line 470
    const-string v0, "Track_TrackMainMapActivity"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "stopSport toSaveData is "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 472
    new-instance v4, Ljava/util/HashMap;

    invoke-direct {v4}, Ljava/util/HashMap;-><init>()V

    .line 473
    sget-object v0, Lo/dae;->hx:Lo/dae;

    invoke-virtual {v0}, Lo/dae;->b()Ljava/lang/String;

    move-result-object v5

    .line 474
    const-string v0, "click"

    const/4 v1, 0x1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v4, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 475
    const-string v0, "sportId"

    iget-object v1, p0, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackMainMapActivity;->c:Lo/cbu;

    invoke-virtual {v1}, Lo/cbu;->H()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v4, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 476
    const-string v0, "sportType"

    iget v1, p0, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackMainMapActivity;->m:I

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v4, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 477
    const-string v0, "trackType"

    iget-object v1, p0, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackMainMapActivity;->c:Lo/cbu;

    invoke-virtual {v1}, Lo/cbu;->a()I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v4, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 478
    invoke-static {}, Lo/czu;->e()Z

    move-result v0

    if-nez v0, :cond_0

    .line 479
    const-string v0, "startTime"

    iget-object v1, p0, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackMainMapActivity;->c:Lo/cbu;

    invoke-virtual {v1}, Lo/cbu;->ae()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-interface {v4, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 480
    const-string v0, "endTime"

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v1

    invoke-static {v1, v2}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object v1

    invoke-interface {v4, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 481
    const-string v0, "sportTime"

    iget-object v1, p0, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackMainMapActivity;->c:Lo/cbu;

    invoke-virtual {v1}, Lo/cbu;->m()J

    move-result-wide v1

    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    invoke-interface {v4, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 482
    const-string v0, "distances"

    iget-object v1, p0, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackMainMapActivity;->c:Lo/cbu;

    invoke-virtual {v1}, Lo/cbu;->g()F

    move-result v1

    float-to-int v1, v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v4, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 483
    const-string v0, "calories"

    iget-object v1, p0, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackMainMapActivity;->c:Lo/cbu;

    invoke-virtual {v1}, Lo/cbu;->f()F

    move-result v1

    float-to-int v1, v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v4, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 484
    const-string v0, "avgPace"

    iget-object v1, p0, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackMainMapActivity;->c:Lo/cbu;

    invoke-virtual {v1}, Lo/cbu;->I()F

    move-result v1

    invoke-static {v1}, Lo/cdl;->e(F)Ljava/lang/String;

    move-result-object v1

    invoke-interface {v4, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 486
    :cond_0
    invoke-static {}, Lo/cxf;->e()Lo/cxf;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackMainMapActivity;->q:Landroid/content/Context;

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v5, v4, v2}, Lo/cxf;->a(Landroid/content/Context;Ljava/lang/String;Ljava/util/Map;I)I

    .line 489
    if-eqz p1, :cond_1

    .line 490
    invoke-direct {p0}, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackMainMapActivity;->q()V

    goto :goto_0

    .line 492
    :cond_1
    invoke-virtual {p0}, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackMainMapActivity;->finish()V

    .line 495
    :goto_0
    invoke-static {}, Lo/cds;->a()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 496
    const/4 v0, 0x1

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    invoke-static {v0}, Lo/cgy;->d(Ljava/lang/Boolean;)V

    goto :goto_1

    .line 498
    :cond_2
    const/4 v0, 0x1

    invoke-static {v0}, Lo/chb;->c(Z)V

    .line 502
    :goto_1
    return-void
.end method

.method public f()V
    .locals 1

    .line 596
    invoke-virtual {p0}, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackMainMapActivity;->isFinishing()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 597
    return-void

    .line 599
    :cond_0
    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackMainMapActivity;->a(I)V

    .line 600
    return-void
.end method

.method public finish()V
    .locals 1

    .line 1228
    invoke-super {p0}, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackBaseActivity;->finish()V

    .line 1229
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackMainMapActivity;->i:Lo/cir;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackMainMapActivity;->i:Lo/cir;

    iget-object v0, v0, Lo/cir;->c:Lo/egv;

    if-eqz v0, :cond_0

    .line 1230
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackMainMapActivity;->i:Lo/cir;

    iget-object v0, v0, Lo/cir;->c:Lo/egv;

    invoke-virtual {v0}, Lo/egv;->dismiss()V

    .line 1232
    :cond_0
    return-void
.end method

.method protected g()Z
    .locals 2

    .line 1218
    iget v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackMainMapActivity;->m:I

    const/16 v1, 0x108

    if-ne v0, v1, :cond_0

    .line 1220
    const/4 v0, 0x0

    return v0

    .line 1223
    :cond_0
    const/4 v0, 0x1

    return v0
.end method

.method protected k()Z
    .locals 1

    .line 1214
    const/4 v0, 0x1

    return v0
.end method

.method public l()V
    .locals 1

    .line 637
    invoke-static {}, Lo/cds;->a()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackMainMapActivity;->i:Lo/cir;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackMainMapActivity;->i:Lo/cir;

    .line 639
    invoke-virtual {v0}, Lo/cir;->e()Lo/chc;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 640
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackMainMapActivity;->i:Lo/cir;

    invoke-virtual {v0}, Lo/cir;->e()Lo/chc;

    move-result-object v0

    invoke-interface {v0}, Lo/chc;->h()V

    .line 642
    :cond_0
    return-void
.end method

.method public m()Z
    .locals 4

    .line 1018
    const-string v0, "sensor"

    invoke-virtual {p0, v0}, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackMainMapActivity;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Landroid/hardware/SensorManager;

    .line 1019
    const/16 v0, 0x13

    invoke-virtual {v2, v0}, Landroid/hardware/SensorManager;->getDefaultSensor(I)Landroid/hardware/Sensor;

    move-result-object v3

    .line 1022
    if-nez v3, :cond_0

    .line 1023
    const/4 v0, 0x0

    return v0

    .line 1026
    :cond_0
    iget v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackMainMapActivity;->m:I

    const/16 v1, 0x101

    if-eq v0, v1, :cond_1

    iget v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackMainMapActivity;->m:I

    const/16 v1, 0x102

    if-ne v0, v1, :cond_2

    .line 1027
    :cond_1
    const/4 v0, 0x1

    return v0

    .line 1029
    :cond_2
    const/4 v0, 0x0

    return v0
.end method

.method public n()V
    .locals 5

    .line 607
    invoke-virtual {p0}, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackMainMapActivity;->isFinishing()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 608
    return-void

    .line 610
    :cond_0
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackMainMapActivity;->c:Lo/cbu;

    invoke-virtual {v0}, Lo/cbu;->F()Z

    move-result v4

    .line 612
    if-eqz v4, :cond_3

    .line 613
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    iget-object v2, p0, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackMainMapActivity;->c:Lo/cbu;

    invoke-virtual {v2}, Lo/cbu;->ae()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    move-result-wide v2

    sub-long/2addr v0, v2

    const-wide/16 v2, 0x0

    cmp-long v0, v0, v2

    if-gtz v0, :cond_1

    .line 614
    const-string v0, "Track_TrackMainMapActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "The endTime is earlier than startTime,this track would not be saved"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 615
    invoke-direct {p0}, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackMainMapActivity;->v()V

    goto :goto_0

    .line 617
    :cond_1
    iget v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackMainMapActivity;->m:I

    const/16 v1, 0x108

    if-ne v0, v1, :cond_2

    .line 618
    invoke-direct {p0}, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackMainMapActivity;->C()V

    goto :goto_0

    .line 620
    :cond_2
    invoke-direct {p0}, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackMainMapActivity;->H()V

    goto :goto_0

    .line 625
    :cond_3
    iget-boolean v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackMainMapActivity;->v:Z

    if-eqz v0, :cond_4

    .line 626
    invoke-direct {p0}, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackMainMapActivity;->w()V

    goto :goto_0

    .line 628
    :cond_4
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackMainMapActivity;->c:Lo/cbu;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lo/cbu;->d(Z)V

    .line 630
    invoke-virtual {p0}, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackMainMapActivity;->finish()V

    .line 634
    :goto_0
    return-void
.end method

.method public o()Landroid/os/Bundle;
    .locals 5

    .line 884
    new-instance v2, Landroid/os/Bundle;

    invoke-direct {v2}, Landroid/os/Bundle;-><init>()V

    .line 886
    const-string v0, "SPORT_TIME_FORMAT"

    iget-object v1, p0, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackMainMapActivity;->c:Lo/cbu;

    invoke-virtual {v1}, Lo/cbu;->o()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v2, v0, v1}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 888
    const-string v0, "SPORT_DISTANCE_FORMAT"

    iget-object v1, p0, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackMainMapActivity;->c:Lo/cbu;

    invoke-virtual {v1}, Lo/cbu;->p()F

    move-result v1

    invoke-static {v1}, Ljava/lang/String;->valueOf(F)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v2, v0, v1}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 891
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackMainMapActivity;->c:Lo/cbu;

    invoke-virtual {v0}, Lo/cbu;->x()F

    move-result v3

    .line 892
    const/4 v0, 0x0

    cmpl-float v0, v3, v0

    if-eqz v0, :cond_0

    .line 893
    const-string v0, "SPORT_PACE_FORMAT"

    const/high16 v1, 0x45610000    # 3600.0f

    div-float/2addr v1, v3

    float-to-int v1, v1

    invoke-static {v1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v2, v0, v1}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0

    .line 895
    :cond_0
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackMainMapActivity;->q:Landroid/content/Context;

    sget v1, Lcom/huawei/healthcloud/plugintrack/R$string;->IDS_motiontrack_show_invalid_data:I

    invoke-virtual {v0, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v4

    .line 896
    const-string v0, "SPORT_PACE_FORMAT"

    invoke-virtual {v2, v0, v4}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 899
    :goto_0
    const/4 v0, 0x0

    cmpl-float v0, v3, v0

    if-lez v0, :cond_2

    const/high16 v0, 0x43480000    # 200.0f

    cmpg-float v0, v3, v0

    if-gez v0, :cond_2

    .line 900
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackMainMapActivity;->c:Lo/cbu;

    invoke-virtual {v0}, Lo/cbu;->g()F

    move-result v0

    const/high16 v1, 0x41200000    # 10.0f

    cmpg-float v0, v0, v1

    if-gez v0, :cond_1

    .line 901
    const-string v0, "speed"

    const-string v1, "--"

    invoke-virtual {v2, v0, v1}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_1

    .line 903
    :cond_1
    const-string v0, "speed"

    invoke-static {v3}, Lo/cds;->a(F)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v2, v0, v1}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_1

    .line 906
    :cond_2
    const-string v0, "speed"

    const-string v1, "--"

    invoke-virtual {v2, v0, v1}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 911
    :goto_1
    const-string v0, "SPORT_GPS_SIGN"

    iget-object v1, p0, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackMainMapActivity;->c:Lo/cbu;

    invoke-virtual {v1}, Lo/cbu;->J()I

    move-result v1

    invoke-static {v1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v2, v0, v1}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 913
    const-string v0, "SPORT_HEART_RATE_FORMAT"

    iget-object v1, p0, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackMainMapActivity;->c:Lo/cbu;

    invoke-virtual {v1}, Lo/cbu;->c()I

    move-result v1

    invoke-static {v1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v2, v0, v1}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 915
    const-string v0, "SPORT_CALORIE"

    iget-object v1, p0, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackMainMapActivity;->c:Lo/cbu;

    invoke-virtual {v1}, Lo/cbu;->f()F

    move-result v1

    invoke-virtual {v2, v0, v1}, Landroid/os/Bundle;->putFloat(Ljava/lang/String;F)V

    .line 916
    return-object v2
.end method

.method public onActivityResult(IILandroid/content/Intent;)V
    .locals 1

    .line 941
    const/16 v0, 0x3e8

    if-ne p1, v0, :cond_1

    .line 942
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackMainMapActivity;->i:Lo/cir;

    if-eqz v0, :cond_0

    .line 943
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackMainMapActivity;->i:Lo/cir;

    invoke-virtual {v0, p1}, Lo/cir;->c(I)V

    goto :goto_0

    .line 945
    :cond_0
    invoke-virtual {p0}, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackMainMapActivity;->finish()V

    .line 949
    :cond_1
    :goto_0
    return-void
.end method

.method public onCreate(Landroid/os/Bundle;)V
    .locals 4

    .line 153
    sget v0, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackMainMapActivity;->w:I

    add-int/lit8 v0, v0, 0x1

    sput v0, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackMainMapActivity;->w:I

    .line 154
    invoke-direct {p0}, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackMainMapActivity;->s()V

    .line 155
    invoke-super {p0, p1}, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackBaseActivity;->onCreate(Landroid/os/Bundle;)V

    .line 156
    const-string v0, "Track_TrackMainMapActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "onCreate"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 157
    const/4 v0, 0x0

    if-eq v0, p1, :cond_0

    .line 161
    invoke-virtual {p0}, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackMainMapActivity;->finish()V

    .line 162
    return-void

    .line 164
    :cond_0
    iput-object p0, p0, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackMainMapActivity;->q:Landroid/content/Context;

    .line 168
    invoke-virtual {p0}, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackMainMapActivity;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lo/cbu;->c(Landroid/content/Context;)Lo/cbu;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackMainMapActivity;->c:Lo/cbu;

    .line 171
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackMainMapActivity;->q:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lo/cds;->a(Landroid/content/Context;)V

    .line 174
    invoke-virtual {p0}, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackMainMapActivity;->getWindow()Landroid/view/Window;

    move-result-object v0

    const v1, 0x106000d

    invoke-virtual {v0, v1}, Landroid/view/Window;->setBackgroundDrawableResource(I)V

    .line 176
    const/4 v0, 0x3

    invoke-virtual {p0, v0}, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackMainMapActivity;->setVolumeControlStream(I)V

    .line 177
    invoke-static {}, Lo/cds;->a()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 178
    const/4 v0, 0x0

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    invoke-static {v0}, Lo/cgy;->d(Ljava/lang/Boolean;)V

    goto :goto_0

    .line 180
    :cond_1
    const/4 v0, 0x0

    invoke-static {v0}, Lo/chb;->c(Z)V

    .line 183
    :goto_0
    invoke-direct {p0}, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackMainMapActivity;->y()V

    .line 185
    return-void
.end method

.method public onDestroy()V
    .locals 4

    .line 1005
    const-string v0, "Track_TrackMainMapActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "onDestroy"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1006
    invoke-super {p0}, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackBaseActivity;->onDestroy()V

    .line 1007
    invoke-virtual {p0}, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackMainMapActivity;->l()V

    .line 1008
    invoke-direct {p0}, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackMainMapActivity;->D()V

    .line 1009
    const-string v0, "Track_TrackMainMapActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "onDestroy sInstanceCount = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    sget v3, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackMainMapActivity;->w:I

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1010
    return-void
.end method

.method public onKeyDown(ILandroid/view/KeyEvent;)Z
    .locals 5

    .line 725
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackMainMapActivity;->c:Lo/cbu;

    if-nez v0, :cond_0

    .line 726
    const/4 v0, 0x1

    return v0

    .line 728
    :cond_0
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackMainMapActivity;->c:Lo/cbu;

    invoke-virtual {v0}, Lo/cbu;->i()I

    move-result v4

    .line 729
    const-string v0, "Track_TrackMainMapActivity"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "onKeyDown curStatus = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 730
    const/4 v0, 0x4

    if-ne p1, v0, :cond_2

    .line 731
    invoke-direct {p0}, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackMainMapActivity;->x()V

    .line 732
    iget-wide v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackMainMapActivity;->B:J

    const-wide/16 v2, 0x0

    cmp-long v0, v0, v2

    if-lez v0, :cond_1

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    iget-wide v2, p0, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackMainMapActivity;->B:J

    sub-long/2addr v0, v2

    const-wide/16 v2, 0x7d0

    cmp-long v0, v0, v2

    if-gez v0, :cond_1

    .line 733
    const/4 v0, 0x1

    return v0

    .line 735
    :cond_1
    sparse-switch v4, :sswitch_data_0

    goto :goto_0

    .line 737
    :sswitch_0
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackMainMapActivity;->q:Landroid/content/Context;

    sget v1, Lcom/huawei/healthcloud/plugintrack/R$string;->IDS_motiontrack_show_sport_sporting_key_down_back:I

    invoke-static {v0, v1}, Lo/emv;->e(Landroid/content/Context;I)V

    .line 738
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    iput-wide v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackMainMapActivity;->B:J

    .line 739
    goto :goto_0

    .line 741
    :sswitch_1
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackMainMapActivity;->q:Landroid/content/Context;

    sget v1, Lcom/huawei/healthcloud/plugintrack/R$string;->IDS_motiontrack_show_sport_pause_key_down_back_long_click:I

    invoke-static {v0, v1}, Lo/emv;->e(Landroid/content/Context;I)V

    .line 742
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    iput-wide v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackMainMapActivity;->B:J

    .line 743
    .line 747
    :goto_0
    const/4 v0, 0x1

    return v0

    .line 749
    :cond_2
    invoke-super {p0, p1, p2}, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackBaseActivity;->onKeyDown(ILandroid/view/KeyEvent;)Z

    move-result v0

    return v0

    nop

    :sswitch_data_0
    .sparse-switch
        0x1 -> :sswitch_0
        0x2 -> :sswitch_1
    .end sparse-switch
.end method

.method public onNewIntent(Landroid/content/Intent;)V
    .locals 3

    .line 378
    invoke-super {p0, p1}, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackBaseActivity;->onNewIntent(Landroid/content/Intent;)V

    .line 379
    if-nez p1, :cond_0

    .line 381
    return-void

    .line 383
    :cond_0
    const-string v0, "isScreenLockClick"

    invoke-virtual {p1, v0}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    .line 384
    if-eqz v2, :cond_1

    const-string v0, "isScreenLockClick"

    invoke-virtual {v2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 385
    invoke-virtual {p0}, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackMainMapActivity;->getWindow()Landroid/view/Window;

    move-result-object v0

    const/high16 v1, 0x80000

    invoke-virtual {v0, v1}, Landroid/view/Window;->addFlags(I)V

    goto :goto_0

    .line 387
    :cond_1
    invoke-virtual {p0}, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackMainMapActivity;->getWindow()Landroid/view/Window;

    move-result-object v0

    const/high16 v1, 0x80000

    invoke-virtual {v0, v1}, Landroid/view/Window;->clearFlags(I)V

    .line 390
    :goto_0
    return-void
.end method

.method public onPause()V
    .locals 4

    .line 985
    invoke-super {p0}, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackBaseActivity;->onPause()V

    .line 986
    const-string v0, "Track_TrackMainMapActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "onPause"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 987
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackMainMapActivity;->i:Lo/cir;

    if-nez v0, :cond_0

    .line 988
    return-void

    .line 991
    :cond_0
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackMainMapActivity;->i:Lo/cir;

    invoke-virtual {v0}, Lo/cir;->e()Lo/chc;

    move-result-object v0

    if-eqz v0, :cond_1

    .line 992
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackMainMapActivity;->i:Lo/cir;

    invoke-virtual {v0}, Lo/cir;->e()Lo/chc;

    move-result-object v0

    const/4 v1, 0x0

    invoke-interface {v0, v1}, Lo/chc;->d(Z)V

    goto :goto_0

    .line 993
    :cond_1
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackMainMapActivity;->i:Lo/cir;

    invoke-virtual {v0}, Lo/cir;->f()Lo/cha;

    move-result-object v0

    if-eqz v0, :cond_2

    .line 994
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackMainMapActivity;->i:Lo/cir;

    invoke-virtual {v0}, Lo/cir;->f()Lo/cha;

    move-result-object v0

    const/4 v1, 0x0

    invoke-interface {v0, v1}, Lo/cha;->a(Z)V

    .line 997
    :cond_2
    :goto_0
    invoke-virtual {p0}, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackMainMapActivity;->isFinishing()Z

    move-result v0

    if-eqz v0, :cond_3

    .line 998
    invoke-direct {p0}, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackMainMapActivity;->D()V

    .line 1001
    :cond_3
    return-void
.end method

.method public onResume()V
    .locals 2

    .line 962
    invoke-super {p0}, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackBaseActivity;->onResume()V

    .line 963
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackMainMapActivity;->i:Lo/cir;

    if-eqz v0, :cond_0

    invoke-direct {p0}, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackMainMapActivity;->A()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 964
    :cond_0
    return-void

    .line 967
    :cond_1
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackMainMapActivity;->r:Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackMainMapActivity$c;

    if-eqz v0, :cond_2

    .line 968
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackMainMapActivity;->r:Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackMainMapActivity$c;

    invoke-virtual {v0}, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackMainMapActivity$c;->e()V

    .line 971
    :cond_2
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackMainMapActivity;->i:Lo/cir;

    invoke-virtual {v0}, Lo/cir;->e()Lo/chc;

    move-result-object v0

    if-eqz v0, :cond_3

    .line 972
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackMainMapActivity;->i:Lo/cir;

    invoke-virtual {v0}, Lo/cir;->e()Lo/chc;

    move-result-object v0

    const/4 v1, 0x1

    invoke-interface {v0, v1}, Lo/chc;->d(Z)V

    goto :goto_0

    .line 973
    :cond_3
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackMainMapActivity;->i:Lo/cir;

    invoke-virtual {v0}, Lo/cir;->f()Lo/cha;

    move-result-object v0

    if-eqz v0, :cond_4

    .line 974
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackMainMapActivity;->i:Lo/cir;

    invoke-virtual {v0}, Lo/cir;->f()Lo/cha;

    move-result-object v0

    const/4 v1, 0x1

    invoke-interface {v0, v1}, Lo/cha;->a(Z)V

    .line 977
    :cond_4
    :goto_0
    return-void
.end method

.method public p()Z
    .locals 5

    .line 923
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackMainMapActivity;->q:Landroid/content/Context;

    invoke-static {v0}, Lo/cds;->c(Landroid/content/Context;)I

    move-result v4

    .line 924
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackMainMapActivity;->q:Landroid/content/Context;

    const-string v1, "LockScreenCoverActivity"

    invoke-static {v0, v1}, Lo/cfv;->a(Landroid/content/Context;Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 925
    const/4 v0, 0x0

    return v0

    .line 926
    :cond_0
    const/4 v0, 0x2

    if-ne v4, v0, :cond_1

    .line 927
    const-string v0, "Track_TrackMainMapActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, " PHONE_STATE_CALL_STATE_RINGING"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 928
    const/4 v0, 0x0

    return v0

    .line 929
    :cond_1
    const/4 v0, 0x1

    if-ne v4, v0, :cond_2

    .line 930
    const-string v0, "Track_TrackMainMapActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, " PHONE_STATE_CALL_STATE_OFFHOOK"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 931
    const/4 v0, 0x0

    return v0

    .line 933
    :cond_2
    const/4 v0, 0x1

    return v0
.end method
