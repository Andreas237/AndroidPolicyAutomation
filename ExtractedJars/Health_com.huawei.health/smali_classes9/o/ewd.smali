.class public Lo/ewd;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final l:[B

.field private static n:Lo/ewd;

.field private static q:I

.field private static u:I


# instance fields
.field private A:Z

.field private B:Z

.field private C:Z

.field private D:Z

.field private E:Landroid/content/Intent;

.field private F:Z

.field private G:Z

.field private H:Z

.field private I:Z

.field private J:Lcom/huawei/hihealth/data/model/HiStressMetaData;

.field private K:Lorg/json/JSONObject;

.field private L:Lo/ewh;

.field private M:Lcom/huawei/datatype/PeriodRRIEntity;

.field private N:Lo/ewq;

.field private O:J

.field private P:Lcom/huawei/hihealth/data/model/HiStressMetaData;

.field private Q:J

.field private R:J

.field private S:J

.field private T:Lcom/huawei/hwbasemgr/IBaseResponseCallback;

.field private U:[F

.field private V:[F

.field private W:Lcom/huawei/hwbasemgr/IBaseResponseCallback;

.field private X:[F

.field private Y:Lo/egg;

.field private Z:Lo/egg;

.field public a:Z

.field private aa:Lcom/huawei/hwbasemgr/IBaseResponseCallback;

.field private ab:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<Lcom/huawei/hihealth/data/model/HiStressMetaData;>;"
        }
    .end annotation
.end field

.field private ac:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<Ljava/lang/Long;>;"
        }
    .end annotation
.end field

.field private ad:Lcom/huawei/hwbasemgr/IBaseResponseCallback;

.field private af:Z

.field private ah:Lcom/huawei/ui/main/stories/fitness/activity/pressurecalibrate/fragment/PressureCalibrateQuestionActivity;

.field public b:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<Lorg/json/JSONObject;>;"
        }
    .end annotation
.end field

.field public c:Z

.field public d:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<Ljava/lang/Integer;>;"
        }
    .end annotation
.end field

.field public e:I

.field public f:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<Ljava/lang/Integer;>;"
        }
    .end annotation
.end field

.field public g:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<Ljava/lang/Integer;>;"
        }
    .end annotation
.end field

.field public h:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<Ljava/lang/Integer;>;"
        }
    .end annotation
.end field

.field private i:Ljava/util/concurrent/Semaphore;

.field private j:Z

.field private k:Ljava/util/concurrent/Semaphore;

.field private m:Landroid/content/Context;

.field private o:I

.field private p:Ljava/util/concurrent/Semaphore;

.field private r:I

.field private s:Z

.field private t:I

.field private v:Z

.field private w:Z

.field private x:Z

.field private y:Z

.field private z:Z


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 50
    const/4 v0, 0x0

    sput-object v0, Lo/ewd;->n:Lo/ewd;

    .line 52
    const/4 v0, 0x1

    new-array v0, v0, [B

    sput-object v0, Lo/ewd;->l:[B

    .line 81
    const/16 v0, 0x3e8

    sput v0, Lo/ewd;->u:I

    .line 82
    const/16 v0, 0x3e9

    sput v0, Lo/ewd;->q:I

    return-void
.end method

.method public constructor <init>()V
    .locals 2

    .line 129
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 47
    new-instance v0, Ljava/util/concurrent/Semaphore;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Ljava/util/concurrent/Semaphore;-><init>(I)V

    iput-object v0, p0, Lo/ewd;->k:Ljava/util/concurrent/Semaphore;

    .line 48
    new-instance v0, Ljava/util/concurrent/Semaphore;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Ljava/util/concurrent/Semaphore;-><init>(I)V

    iput-object v0, p0, Lo/ewd;->i:Ljava/util/concurrent/Semaphore;

    .line 49
    new-instance v0, Ljava/util/concurrent/Semaphore;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Ljava/util/concurrent/Semaphore;-><init>(I)V

    iput-object v0, p0, Lo/ewd;->p:Ljava/util/concurrent/Semaphore;

    .line 53
    const/4 v0, 0x1

    iput v0, p0, Lo/ewd;->o:I

    .line 68
    const/4 v0, 0x1

    iput v0, p0, Lo/ewd;->r:I

    .line 69
    const/4 v0, 0x0

    iput v0, p0, Lo/ewd;->t:I

    .line 85
    const/4 v0, 0x0

    iput-boolean v0, p0, Lo/ewd;->s:Z

    .line 86
    const/4 v0, 0x0

    iput-boolean v0, p0, Lo/ewd;->z:Z

    .line 87
    const/4 v0, 0x0

    iput-boolean v0, p0, Lo/ewd;->x:Z

    .line 88
    const/4 v0, 0x0

    iput-boolean v0, p0, Lo/ewd;->c:Z

    .line 89
    const/4 v0, 0x0

    iput-boolean v0, p0, Lo/ewd;->v:Z

    .line 90
    const/4 v0, 0x0

    iput-boolean v0, p0, Lo/ewd;->w:Z

    .line 91
    const/4 v0, 0x0

    iput-boolean v0, p0, Lo/ewd;->y:Z

    .line 92
    const/4 v0, 0x0

    iput-boolean v0, p0, Lo/ewd;->A:Z

    .line 93
    const/4 v0, 0x0

    iput-boolean v0, p0, Lo/ewd;->C:Z

    .line 94
    const/4 v0, 0x0

    iput-boolean v0, p0, Lo/ewd;->D:Z

    .line 95
    const/4 v0, 0x0

    iput-boolean v0, p0, Lo/ewd;->j:Z

    .line 96
    const/4 v0, 0x0

    iput-boolean v0, p0, Lo/ewd;->B:Z

    .line 97
    const/4 v0, 0x0

    iput-boolean v0, p0, Lo/ewd;->I:Z

    .line 98
    const/4 v0, 0x0

    iput-boolean v0, p0, Lo/ewd;->G:Z

    .line 99
    const/4 v0, 0x0

    iput-boolean v0, p0, Lo/ewd;->H:Z

    .line 100
    const/4 v0, 0x0

    iput-boolean v0, p0, Lo/ewd;->F:Z

    .line 103
    const/4 v0, 0x0

    iput-object v0, p0, Lo/ewd;->N:Lo/ewq;

    .line 104
    const/4 v0, 0x0

    iput-object v0, p0, Lo/ewd;->L:Lo/ewh;

    .line 105
    const/4 v0, 0x0

    iput-boolean v0, p0, Lo/ewd;->a:Z

    .line 109
    const/4 v0, 0x0

    iput-object v0, p0, Lo/ewd;->P:Lcom/huawei/hihealth/data/model/HiStressMetaData;

    .line 112
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lo/ewd;->b:Ljava/util/List;

    .line 113
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lo/ewd;->d:Ljava/util/List;

    .line 114
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lo/ewd;->g:Ljava/util/List;

    .line 115
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lo/ewd;->f:Ljava/util/List;

    .line 116
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lo/ewd;->h:Ljava/util/List;

    .line 117
    const/4 v0, 0x0

    iput-object v0, p0, Lo/ewd;->X:[F

    .line 118
    const/4 v0, 0x0

    iput-object v0, p0, Lo/ewd;->V:[F

    .line 119
    const/4 v0, 0x0

    iput-object v0, p0, Lo/ewd;->U:[F

    .line 296
    new-instance v0, Lo/ewd$1;

    invoke-direct {v0, p0}, Lo/ewd$1;-><init>(Lo/ewd;)V

    iput-object v0, p0, Lo/ewd;->T:Lcom/huawei/hwbasemgr/IBaseResponseCallback;

    .line 311
    new-instance v0, Lo/ewd$2;

    invoke-direct {v0, p0}, Lo/ewd$2;-><init>(Lo/ewd;)V

    iput-object v0, p0, Lo/ewd;->W:Lcom/huawei/hwbasemgr/IBaseResponseCallback;

    .line 325
    new-instance v0, Lo/ewd$5;

    invoke-direct {v0, p0}, Lo/ewd$5;-><init>(Lo/ewd;)V

    iput-object v0, p0, Lo/ewd;->aa:Lcom/huawei/hwbasemgr/IBaseResponseCallback;

    .line 360
    new-instance v0, Lo/ewd$4;

    invoke-direct {v0, p0}, Lo/ewd$4;-><init>(Lo/ewd;)V

    iput-object v0, p0, Lo/ewd;->Y:Lo/egg;

    .line 379
    new-instance v0, Lo/ewd$8;

    invoke-direct {v0, p0}, Lo/ewd$8;-><init>(Lo/ewd;)V

    iput-object v0, p0, Lo/ewd;->Z:Lo/egg;

    .line 1129
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lo/ewd;->ab:Ljava/util/List;

    .line 1130
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lo/ewd;->ac:Ljava/util/List;

    .line 1131
    new-instance v0, Lo/ewd$3;

    invoke-direct {v0, p0}, Lo/ewd$3;-><init>(Lo/ewd;)V

    iput-object v0, p0, Lo/ewd;->ad:Lcom/huawei/hwbasemgr/IBaseResponseCallback;

    .line 1250
    const/4 v0, 0x0

    iput-boolean v0, p0, Lo/ewd;->af:Z

    .line 130
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    iput-object v0, p0, Lo/ewd;->m:Landroid/content/Context;

    .line 131
    return-void
.end method

.method static synthetic A()I
    .locals 1

    .line 45
    sget v0, Lo/ewd;->q:I

    return v0
.end method

.method private B()Z
    .locals 1

    .line 194
    iget-boolean v0, p0, Lo/ewd;->j:Z

    return v0
.end method

.method private C()Z
    .locals 1

    .line 200
    iget-boolean v0, p0, Lo/ewd;->s:Z

    return v0
.end method

.method private D()Z
    .locals 1

    .line 230
    iget-boolean v0, p0, Lo/ewd;->y:Z

    return v0
.end method

.method private E()Z
    .locals 1

    .line 266
    iget-boolean v0, p0, Lo/ewd;->G:Z

    return v0
.end method

.method private F()Ljava/util/List;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()Ljava/util/List<Ljava/lang/String;>;"
        }
    .end annotation

    .line 856
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 857
    const-string v0, "0"

    invoke-interface {v1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 858
    const-string v0, "0"

    invoke-interface {v1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 859
    const-string v0, "0"

    invoke-interface {v1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 860
    const-string v0, "0"

    invoke-interface {v1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 861
    const-string v0, "0"

    invoke-interface {v1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 862
    const-string v0, "0"

    invoke-interface {v1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 863
    const-string v0, "0"

    invoke-interface {v1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 864
    const-string v0, "0"

    invoke-interface {v1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 865
    const-string v0, "0"

    invoke-interface {v1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 866
    const-string v0, "0"

    invoke-interface {v1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 867
    const-string v0, "0"

    invoke-interface {v1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 868
    const-string v0, "0"

    invoke-interface {v1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 869
    return-object v1
.end method

.method private G()Z
    .locals 1

    .line 276
    iget-boolean v0, p0, Lo/ewd;->H:Z

    return v0
.end method

.method private H()Z
    .locals 1

    .line 288
    iget-boolean v0, p0, Lo/ewd;->a:Z

    return v0
.end method

.method private I()Z
    .locals 1

    .line 294
    iget-boolean v0, p0, Lo/ewd;->w:Z

    return v0
.end method

.method private J()I
    .locals 1

    .line 878
    const/4 v0, 0x1

    return v0
.end method

.method private K()I
    .locals 5

    .line 900
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lo/dde;->d(Landroid/content/Context;)Lo/dde;

    move-result-object v0

    invoke-virtual {v0}, Lo/dde;->e()Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;

    move-result-object v4

    .line 901
    if-nez v4, :cond_0

    .line 902
    const-string v0, "PressureMeasureMessage"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getStress_dev_no fail"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    goto :goto_0

    .line 905
    :cond_0
    invoke-virtual {v4}, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->getProductType()I

    move-result v0

    iput v0, p0, Lo/ewd;->e:I

    .line 907
    :goto_0
    iget v0, p0, Lo/ewd;->e:I

    return v0
.end method

.method private L()I
    .locals 1

    .line 874
    const/4 v0, 0x1

    return v0
.end method

.method private N()V
    .locals 4

    .line 1043
    iget-object v0, p0, Lo/ewd;->L:Lo/ewh;

    invoke-direct {p0, v0}, Lo/ewd;->e(Lo/ewh;)V

    .line 1044
    const-string v0, "PressureMeasureMessage"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "closeGameOver"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1046
    return-void
.end method

.method static synthetic a(Lo/ewd;Lcom/huawei/hihealth/data/model/HiStressMetaData;)Lcom/huawei/hihealth/data/model/HiStressMetaData;
    .locals 0

    .line 45
    iput-object p1, p0, Lo/ewd;->P:Lcom/huawei/hihealth/data/model/HiStressMetaData;

    return-object p1
.end method

.method static synthetic a(Lo/ewd;)Ljava/util/concurrent/Semaphore;
    .locals 1

    .line 45
    iget-object v0, p0, Lo/ewd;->i:Ljava/util/concurrent/Semaphore;

    return-object v0
.end method

.method static synthetic a(Lo/ewd;Lorg/json/JSONObject;)Lorg/json/JSONObject;
    .locals 0

    .line 45
    iput-object p1, p0, Lo/ewd;->K:Lorg/json/JSONObject;

    return-object p1
.end method

.method private a(Lcom/huawei/datatype/PeriodRRIEntity;)V
    .locals 9

    .line 1187
    invoke-virtual {p1}, Lcom/huawei/datatype/PeriodRRIEntity;->fetchPressDataList()Ljava/util/List;

    move-result-object v5

    .line 1188
    new-instance v6, Ljava/util/ArrayList;

    invoke-direct {v6}, Ljava/util/ArrayList;-><init>()V

    .line 1189
    const/4 v0, 0x0

    if-eq v0, v5, :cond_1

    invoke-interface {v5}, Ljava/util/List;->size()I

    move-result v0

    if-lez v0, :cond_1

    .line 1190
    invoke-interface {v5}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v7

    :goto_0
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v8, v0

    check-cast v8, Lcom/huawei/hihealth/data/model/HiStressMetaData;

    .line 1191
    iget-object v0, p0, Lo/ewd;->ac:Ljava/util/List;

    invoke-virtual {v8}, Lcom/huawei/hihealth/data/model/HiStressMetaData;->fetchStress_start_time()J

    move-result-wide v1

    const-wide/16 v3, 0x3e8

    mul-long/2addr v1, v3

    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 1192
    invoke-virtual {v8}, Lcom/huawei/hihealth/data/model/HiStressMetaData;->fetchStress_start_time()J

    move-result-wide v0

    const-wide/16 v2, 0x3e8

    mul-long/2addr v0, v2

    invoke-virtual {v8, v0, v1}, Lcom/huawei/hihealth/data/model/HiStressMetaData;->configStress_start_time(J)V

    .line 1193
    invoke-virtual {v8}, Lcom/huawei/hihealth/data/model/HiStressMetaData;->fetchStress_end_time()J

    move-result-wide v0

    const-wide/16 v2, 0x3e8

    mul-long/2addr v0, v2

    invoke-virtual {v8, v0, v1}, Lcom/huawei/hihealth/data/model/HiStressMetaData;->configStress_end_time(J)V

    .line 1194
    invoke-direct {p0}, Lo/ewd;->K()I

    move-result v0

    invoke-virtual {v8, v0}, Lcom/huawei/hihealth/data/model/HiStressMetaData;->configStress_dev_no(I)V

    .line 1195
    invoke-direct {p0}, Lo/ewd;->F()Ljava/util/List;

    move-result-object v0

    invoke-virtual {v8, v0}, Lcom/huawei/hihealth/data/model/HiStressMetaData;->configStress_feature_atts(Ljava/util/List;)V

    .line 1196
    invoke-interface {v6, v8}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 1197
    goto :goto_0

    :cond_0
    goto :goto_1

    .line 1199
    :cond_1
    const-string v0, "PressureMeasureMessage"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "periodRRIEntity.fetchPressDataList() = NULL"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1201
    :goto_1
    invoke-interface {v6}, Ljava/util/List;->size()I

    move-result v0

    if-lez v0, :cond_2

    .line 1202
    invoke-direct {p0, v6}, Lo/ewd;->b(Ljava/util/List;)V

    .line 1204
    :cond_2
    return-void
.end method

.method private a(Ljava/lang/Class;)V
    .locals 1

    .line 1093
    const/4 v0, 0x0

    if-eq v0, p1, :cond_0

    .line 1094
    const/4 p1, 0x0

    .line 1096
    :cond_0
    return-void
.end method

.method static synthetic a(Lo/ewd;Lcom/huawei/datatype/PeriodRRIEntity;)V
    .locals 0

    .line 45
    invoke-direct {p0, p1}, Lo/ewd;->a(Lcom/huawei/datatype/PeriodRRIEntity;)V

    return-void
.end method

.method static synthetic b(Lo/ewd;J)J
    .locals 0

    .line 45
    iput-wide p1, p0, Lo/ewd;->O:J

    return-wide p1
.end method

.method private b(Lcom/huawei/datatype/PeriodRRIEntity;)Lcom/huawei/datatype/PeriodRRIEntity;
    .locals 13

    .line 1212
    new-instance v4, Ljava/util/ArrayList;

    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    .line 1213
    const-wide/16 v5, 0x0

    .line 1214
    const/4 v7, 0x0

    .line 1215
    const/16 v8, 0xf

    .line 1216
    invoke-virtual {p1}, Lcom/huawei/datatype/PeriodRRIEntity;->fetchRriDataList()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v9

    :goto_0
    invoke-interface {v9}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-interface {v9}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v10, v0

    check-cast v10, Lcom/huawei/datatype/PeriodRRIEntity$RRIDataEntity;

    .line 1217
    invoke-virtual {v10}, Lcom/huawei/datatype/PeriodRRIEntity$RRIDataEntity;->fetchStartTime()J

    move-result-wide v11

    .line 1218
    sub-long v0, v11, v5

    const-wide/16 v2, 0x3c

    cmp-long v0, v0, v2

    if-gtz v0, :cond_0

    const/4 v0, 0x0

    if-ne v0, v7, :cond_1

    .line 1219
    :cond_0
    new-instance v7, Lcom/huawei/datatype/PeriodRRIEntity$RRIDataEntity;

    invoke-direct {v7}, Lcom/huawei/datatype/PeriodRRIEntity$RRIDataEntity;-><init>()V

    .line 1220
    invoke-virtual {v7, v11, v12}, Lcom/huawei/datatype/PeriodRRIEntity$RRIDataEntity;->configStartTime(J)V

    .line 1221
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0, v8}, Ljava/util/ArrayList;-><init>(I)V

    invoke-virtual {v7, v0}, Lcom/huawei/datatype/PeriodRRIEntity$RRIDataEntity;->configRriList(Ljava/util/List;)V

    .line 1222
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0, v8}, Ljava/util/ArrayList;-><init>(I)V

    invoke-virtual {v7, v0}, Lcom/huawei/datatype/PeriodRRIEntity$RRIDataEntity;->configSqiList(Ljava/util/List;)V

    .line 1223
    invoke-interface {v4, v7}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 1225
    :cond_1
    move-wide v5, v11

    .line 1226
    invoke-virtual {v7}, Lcom/huawei/datatype/PeriodRRIEntity$RRIDataEntity;->fetchSqiList()Ljava/util/List;

    move-result-object v0

    invoke-virtual {v10}, Lcom/huawei/datatype/PeriodRRIEntity$RRIDataEntity;->fetchSqiList()Ljava/util/List;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    .line 1227
    invoke-virtual {v7}, Lcom/huawei/datatype/PeriodRRIEntity$RRIDataEntity;->fetchRriList()Ljava/util/List;

    move-result-object v0

    invoke-virtual {v10}, Lcom/huawei/datatype/PeriodRRIEntity$RRIDataEntity;->fetchRriList()Ljava/util/List;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    .line 1228
    goto/16 :goto_0

    .line 1229
    :cond_2
    invoke-virtual {p1, v4}, Lcom/huawei/datatype/PeriodRRIEntity;->configRriDataList(Ljava/util/List;)V

    .line 1230
    const-string v0, "PressureMeasureMessage"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "datas.size = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-interface {v4}, Ljava/util/List;->size()I

    move-result v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1231
    return-object p1
.end method

.method static synthetic b(Lo/ewd;[FJJ)Lcom/huawei/hihealth/data/model/HiStressMetaData;
    .locals 1

    .line 45
    invoke-direct/range {p0 .. p5}, Lo/ewd;->d([FJJ)Lcom/huawei/hihealth/data/model/HiStressMetaData;

    move-result-object v0

    return-object v0
.end method

.method static synthetic b(Lo/ewd;)Ljava/util/concurrent/Semaphore;
    .locals 1

    .line 45
    iget-object v0, p0, Lo/ewd;->p:Ljava/util/concurrent/Semaphore;

    return-object v0
.end method

.method private b(J)V
    .locals 0

    .line 159
    iput-wide p1, p0, Lo/ewd;->Q:J

    .line 160
    return-void
.end method

.method private b(Ljava/util/List;)V
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Lcom/huawei/hihealth/data/model/HiStressMetaData;>;)V"
        }
    .end annotation

    .line 675
    const-string v0, "PressureMeasureMessage"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, " PressureUtil  setAllCycleDataToDatas !!!"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 676
    new-instance v5, Lo/exv;

    iget-object v0, p0, Lo/ewd;->m:Landroid/content/Context;

    invoke-direct {v5, v0}, Lo/exv;-><init>(Landroid/content/Context;)V

    .line 677
    iget-object v0, p0, Lo/ewd;->Z:Lo/egg;

    invoke-virtual {v5, p1, v0}, Lo/exv;->c(Ljava/util/List;Lo/egg;)V

    .line 679
    :try_start_0
    iget-object v0, p0, Lo/ewd;->i:Ljava/util/concurrent/Semaphore;

    sget-object v1, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    const-wide/16 v2, 0x2

    invoke-virtual {v0, v2, v3, v1}, Ljava/util/concurrent/Semaphore;->tryAcquire(JLjava/util/concurrent/TimeUnit;)Z

    move-result v6

    .line 680
    if-eqz v6, :cond_0

    .line 681
    const-string v0, "PressureMeasureMessage"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "cyclesemaphore.tryAcquire()"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    goto :goto_0

    .line 683
    :cond_0
    const-string v0, "PressureMeasureMessage"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "cyclesemaphore.tryAcquire() fail"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_0

    .line 687
    :goto_0
    goto :goto_1

    .line 685
    :catch_0
    move-exception v6

    .line 686
    const-string v0, "PressureMeasureMessage"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "cyclesemaphore InterruptedException"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 688
    :goto_1
    invoke-direct {p0}, Lo/ewd;->G()Z

    move-result v0

    if-nez v0, :cond_2

    .line 689
    const-string v0, "PressureMeasureMessage"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getIsStoredSuccessed() = false"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 690
    iget-object v0, p0, Lo/ewd;->Z:Lo/egg;

    invoke-virtual {v5, p1, v0}, Lo/exv;->c(Ljava/util/List;Lo/egg;)V

    .line 692
    :try_start_1
    iget-object v0, p0, Lo/ewd;->i:Ljava/util/concurrent/Semaphore;

    sget-object v1, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    const-wide/16 v2, 0x2

    invoke-virtual {v0, v2, v3, v1}, Ljava/util/concurrent/Semaphore;->tryAcquire(JLjava/util/concurrent/TimeUnit;)Z

    move-result v6

    .line 693
    if-eqz v6, :cond_1

    .line 694
    const-string v0, "PressureMeasureMessage"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "cyclesemaphore.tryAcquire2()"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    goto :goto_2

    .line 696
    :cond_1
    const-string v0, "PressureMeasureMessage"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "cyclesemaphore.tryAcquire2() fail"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_1
    .catch Ljava/lang/InterruptedException; {:try_start_1 .. :try_end_1} :catch_1

    .line 700
    :goto_2
    goto :goto_3

    .line 698
    :catch_1
    move-exception v6

    .line 699
    const-string v0, "PressureMeasureMessage"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "cyclesemaphore2 InterruptedException"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 701
    :goto_3
    invoke-direct {p0}, Lo/ewd;->G()Z

    move-result v0

    if-nez v0, :cond_2

    .line 703
    iget-object v0, p0, Lo/ewd;->ac:Ljava/util/List;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_2

    iget-object v0, p0, Lo/ewd;->ac:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-lez v0, :cond_2

    .line 704
    iget-object v0, p0, Lo/ewd;->M:Lcom/huawei/datatype/PeriodRRIEntity;

    iget-object v1, p0, Lo/ewd;->ac:Ljava/util/List;

    const/4 v2, 0x0

    invoke-interface {v1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Long;

    invoke-virtual {v1}, Ljava/lang/Long;->longValue()J

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, Lcom/huawei/datatype/PeriodRRIEntity;->configFailTime(J)V

    .line 705
    const-string v0, "PressureMeasureMessage"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "setAllCycleDataToDatasconfigFailTime ="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lo/ewd;->ac:Ljava/util/List;

    const/4 v4, 0x0

    invoke-interface {v3, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 709
    :cond_2
    return-void
.end method

.method static synthetic b(Lo/ewd;I)V
    .locals 0

    .line 45
    invoke-direct {p0, p1}, Lo/ewd;->k(I)V

    return-void
.end method

.method static synthetic b(Lo/ewd;Ljava/util/List;)V
    .locals 0

    .line 45
    invoke-direct {p0, p1}, Lo/ewd;->b(Ljava/util/List;)V

    return-void
.end method

.method static synthetic b(Lo/ewd;Z)V
    .locals 0

    .line 45
    invoke-direct {p0, p1}, Lo/ewd;->p(Z)V

    return-void
.end method

.method private b(Lorg/json/JSONObject;)V
    .locals 8

    .line 587
    const-string v0, "rri_list"

    :try_start_0
    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->get(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Lorg/json/JSONArray;

    .line 588
    const/4 v5, 0x0

    :goto_0
    invoke-virtual {v4}, Lorg/json/JSONArray;->length()I

    move-result v0

    if-ge v5, v0, :cond_0

    .line 589
    invoke-virtual {v4, v5}, Lorg/json/JSONArray;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object p1, v0

    check-cast p1, Lorg/json/JSONObject;

    .line 590
    const-string v0, "rri_value"

    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->getInt(Ljava/lang/String;)I

    move-result v6

    .line 591
    const-string v0, "rri_sqi"

    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->getInt(Ljava/lang/String;)I

    move-result v7

    .line 592
    invoke-direct {p0, v6, v7}, Lo/ewd;->c(II)V

    .line 588
    add-int/lit8 v5, v5, 0x1

    goto :goto_0

    .line 594
    :cond_0
    const-string v0, "PressureMeasureMessage"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "JSON parser Success!"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    .line 597
    goto :goto_1

    .line 595
    :catch_0
    move-exception v5

    .line 596
    const-string v0, "PressureMeasureMessage"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "JSON parser Fail!"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 598
    :goto_1
    return-void
.end method

.method static synthetic c(Lo/ewd;J)J
    .locals 0

    .line 45
    iput-wide p1, p0, Lo/ewd;->R:J

    return-wide p1
.end method

.method static synthetic c(Lo/ewd;Lcom/huawei/datatype/PeriodRRIEntity;)Lcom/huawei/datatype/PeriodRRIEntity;
    .locals 0

    .line 45
    iput-object p1, p0, Lo/ewd;->M:Lcom/huawei/datatype/PeriodRRIEntity;

    return-object p1
.end method

.method static synthetic c(Lo/ewd;)Lorg/json/JSONObject;
    .locals 1

    .line 45
    iget-object v0, p0, Lo/ewd;->K:Lorg/json/JSONObject;

    return-object v0
.end method

.method private c(II)V
    .locals 2

    .line 600
    const/4 v0, 0x0

    if-eq v0, p1, :cond_0

    .line 601
    iget-object v0, p0, Lo/ewd;->f:Ljava/util/List;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 602
    iget-object v0, p0, Lo/ewd;->h:Ljava/util/List;

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 604
    :cond_0
    return-void
.end method

.method private c(Ljava/util/List;)V
    .locals 4

    .line 1022
    const-string v0, "PressureMeasureMessage"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "gameOver()"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1023
    new-instance v0, Lo/ewh;

    const/16 v1, 0x3c

    const/16 v2, 0xc

    const/4 v3, 0x0

    invoke-direct {v0, v1, v2, v3}, Lo/ewh;-><init>(IILjava/util/List;)V

    iput-object v0, p0, Lo/ewd;->L:Lo/ewh;

    .line 1024
    iget-object v0, p0, Lo/ewd;->L:Lo/ewh;

    new-instance v1, Lo/ewd$6;

    invoke-direct {v1, p0, p1}, Lo/ewd$6;-><init>(Lo/ewd;Ljava/util/List;)V

    invoke-virtual {v0, v1}, Lo/ewh;->d(Lo/ewh$a;)V

    .line 1040
    iget-object v0, p0, Lo/ewd;->L:Lo/ewh;

    invoke-virtual {v0}, Lo/ewh;->e()V

    .line 1041
    return-void
.end method

.method private c(Ljava/util/List;IZ)V
    .locals 6

    .line 504
    const-string v0, "PressureMeasureMessage"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "JsonObject is Parser start !!!"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 505
    const/4 v4, 0x0

    .line 506
    const/4 v0, 0x1

    invoke-direct {p0, v0}, Lo/ewd;->u(Z)V

    .line 507
    const-string v0, "PressureMeasureMessage"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "startParser() isParsered == "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-boolean v3, p0, Lo/ewd;->a:Z

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 508
    const/4 v5, 0x0

    :goto_0
    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v0

    if-ge v5, v0, :cond_1

    .line 509
    invoke-interface {p1, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lorg/json/JSONObject;

    iput-object v0, p0, Lo/ewd;->K:Lorg/json/JSONObject;

    .line 510
    iget-object v0, p0, Lo/ewd;->K:Lorg/json/JSONObject;

    invoke-direct {p0, v0}, Lo/ewd;->b(Lorg/json/JSONObject;)V

    .line 511
    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v0

    add-int/lit8 v0, v0, -0x1

    if-ne v5, v0, :cond_0

    .line 512
    const/4 v4, 0x1

    .line 508
    :cond_0
    add-int/lit8 v5, v5, 0x1

    goto :goto_0

    .line 515
    :cond_1
    const-string v0, "PressureMeasureMessage"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "JsonObject is Parser end !!!"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 516
    invoke-direct {p0}, Lo/ewd;->D()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 517
    const v0, -0x18a92

    invoke-direct {p0, v0}, Lo/ewd;->k(I)V

    .line 518
    const-string v0, "PressureMeasureMessage"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "MEASSURE_STOP_FLAG"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 519
    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lo/ewd;->h(Z)V

    goto/16 :goto_2

    .line 520
    :cond_2
    invoke-direct {p0}, Lo/ewd;->j()Z

    move-result v0

    if-eqz v0, :cond_3

    .line 521
    const v0, -0x18a93

    invoke-direct {p0, v0}, Lo/ewd;->k(I)V

    .line 522
    const-string v0, "PressureMeasureMessage"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "CALIBRATE_STOP_FLAG"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 523
    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lo/ewd;->i(Z)V

    goto :goto_2

    .line 525
    :cond_3
    if-eqz v4, :cond_6

    .line 526
    const-string v0, "PressureMeasureMessage"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "openSOMeasure,json over!!!"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 527
    const/4 v0, 0x0

    if-ne v0, p2, :cond_4

    .line 528
    invoke-virtual {p0, p2}, Lo/ewd;->e(I)[F

    move-result-object v0

    invoke-direct {p0, v0}, Lo/ewd;->g([F)V

    .line 529
    const-string v0, "PressureMeasureMessage"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "openSOMeasure,MeassureSOBack!!!"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    goto :goto_1

    .line 530
    :cond_4
    const/4 v0, 0x2

    if-ne v0, p2, :cond_5

    .line 531
    invoke-static {}, Lo/ewn;->i()Lo/ewn;

    move-result-object v0

    iget-boolean v0, v0, Lo/ewn;->d:Z

    if-eqz v0, :cond_5

    .line 532
    invoke-virtual {p0, p2}, Lo/ewd;->f(I)[F

    move-result-object v0

    invoke-virtual {p0, v0}, Lo/ewd;->c([F)V

    .line 533
    const-string v0, "PressureMeasureMessage"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "openSOMeasure,CalibrateSOBack!!!"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 536
    :cond_5
    :goto_1
    if-eqz p3, :cond_6

    .line 537
    invoke-direct {p0, p2}, Lo/ewd;->k(I)V

    .line 541
    :cond_6
    :goto_2
    return-void
.end method

.method private c(Ljava/util/List;Ljava/util/List;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Ljava/lang/Integer;>;Ljava/util/List<Ljava/lang/Integer;>;)V"
        }
    .end annotation

    .line 1234
    const/4 v2, 0x0

    :goto_0
    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v0

    if-ge v2, v0, :cond_1

    .line 1235
    invoke-interface {p1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 1237
    iget-object v0, p0, Lo/ewd;->d:Ljava/util/List;

    invoke-interface {p1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 1238
    iget-object v0, p0, Lo/ewd;->g:Ljava/util/List;

    invoke-interface {p2, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 1234
    :cond_0
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    .line 1241
    :cond_1
    return-void
.end method

.method static synthetic c(Lo/ewd;Ljava/util/List;)V
    .locals 0

    .line 45
    invoke-direct {p0, p1}, Lo/ewd;->e(Ljava/util/List;)V

    return-void
.end method

.method private c(IJJ)[F
    .locals 6

    .line 612
    invoke-static {}, Lo/ewm;->c()Lo/ewm;

    move-result-object v0

    move v1, p1

    move-wide v2, p2

    move-wide v4, p4

    invoke-virtual/range {v0 .. v5}, Lo/ewm;->e(IJJ)[F

    move-result-object v0

    return-object v0
.end method

.method static synthetic c(Lo/ewd;IJJ)[F
    .locals 1

    .line 45
    invoke-direct/range {p0 .. p5}, Lo/ewd;->c(IJJ)[F

    move-result-object v0

    return-object v0
.end method

.method static synthetic d(Lo/ewd;Lcom/huawei/datatype/PeriodRRIEntity;)Lcom/huawei/datatype/PeriodRRIEntity;
    .locals 1

    .line 45
    invoke-direct {p0, p1}, Lo/ewd;->b(Lcom/huawei/datatype/PeriodRRIEntity;)Lcom/huawei/datatype/PeriodRRIEntity;

    move-result-object v0

    return-object v0
.end method

.method private d([FJJ)Lcom/huawei/hihealth/data/model/HiStressMetaData;
    .locals 4

    .line 750
    const-string v0, "PressureMeasureMessage"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getCycleMeasureHiStressMetaData start "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 751
    new-instance v0, Lcom/huawei/hihealth/data/model/HiStressMetaData;

    invoke-direct {v0}, Lcom/huawei/hihealth/data/model/HiStressMetaData;-><init>()V

    iput-object v0, p0, Lo/ewd;->J:Lcom/huawei/hihealth/data/model/HiStressMetaData;

    .line 753
    iget-object v0, p0, Lo/ewd;->J:Lcom/huawei/hihealth/data/model/HiStressMetaData;

    invoke-virtual {v0, p2, p3}, Lcom/huawei/hihealth/data/model/HiStressMetaData;->configStress_start_time(J)V

    .line 755
    iget-object v0, p0, Lo/ewd;->J:Lcom/huawei/hihealth/data/model/HiStressMetaData;

    invoke-virtual {v0, p4, p5}, Lcom/huawei/hihealth/data/model/HiStressMetaData;->configStress_end_time(J)V

    .line 757
    iget-object v0, p0, Lo/ewd;->J:Lcom/huawei/hihealth/data/model/HiStressMetaData;

    invoke-direct {p0, p1}, Lo/ewd;->o([F)I

    move-result v1

    invoke-virtual {v0, v1}, Lcom/huawei/hihealth/data/model/HiStressMetaData;->configStress_algorithm_ver(I)V

    .line 759
    iget-object v0, p0, Lo/ewd;->J:Lcom/huawei/hihealth/data/model/HiStressMetaData;

    invoke-direct {p0}, Lo/ewd;->K()I

    move-result v1

    invoke-virtual {v0, v1}, Lcom/huawei/hihealth/data/model/HiStressMetaData;->configStress_dev_no(I)V

    .line 761
    iget-object v0, p0, Lo/ewd;->J:Lcom/huawei/hihealth/data/model/HiStressMetaData;

    invoke-direct {p0, p1}, Lo/ewd;->l([F)I

    move-result v1

    invoke-virtual {v0, v1}, Lcom/huawei/hihealth/data/model/HiStressMetaData;->configStress_score(I)V

    .line 762
    iget-object v0, p0, Lo/ewd;->J:Lcom/huawei/hihealth/data/model/HiStressMetaData;

    invoke-direct {p0, p1}, Lo/ewd;->p([F)I

    move-result v1

    invoke-virtual {v0, v1}, Lcom/huawei/hihealth/data/model/HiStressMetaData;->configStress_grade(I)V

    .line 763
    iget-object v0, p0, Lo/ewd;->J:Lcom/huawei/hihealth/data/model/HiStressMetaData;

    invoke-direct {p0, p1}, Lo/ewd;->m([F)I

    move-result v1

    invoke-virtual {v0, v1}, Lcom/huawei/hihealth/data/model/HiStressMetaData;->configStress_calib_flag(I)V

    .line 765
    iget-object v0, p0, Lo/ewd;->J:Lcom/huawei/hihealth/data/model/HiStressMetaData;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lcom/huawei/hihealth/data/model/HiStressMetaData;->configStress_measure_type(I)V

    .line 767
    iget-object v0, p0, Lo/ewd;->J:Lcom/huawei/hihealth/data/model/HiStressMetaData;

    invoke-direct {p0}, Lo/ewd;->J()I

    move-result v1

    invoke-virtual {v0, v1}, Lcom/huawei/hihealth/data/model/HiStressMetaData;->configStress_acc_flag(I)V

    .line 769
    iget-object v0, p0, Lo/ewd;->J:Lcom/huawei/hihealth/data/model/HiStressMetaData;

    invoke-direct {p0}, Lo/ewd;->L()I

    move-result v1

    invoke-virtual {v0, v1}, Lcom/huawei/hihealth/data/model/HiStressMetaData;->configStress_ppg_flag(I)V

    .line 771
    iget-object v0, p0, Lo/ewd;->J:Lcom/huawei/hihealth/data/model/HiStressMetaData;

    invoke-direct {p0, p1}, Lo/ewd;->n([F)Ljava/util/List;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/huawei/hihealth/data/model/HiStressMetaData;->configStress_feature(Ljava/util/List;)V

    .line 773
    iget-object v0, p0, Lo/ewd;->J:Lcom/huawei/hihealth/data/model/HiStressMetaData;

    invoke-direct {p0}, Lo/ewd;->F()Ljava/util/List;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/huawei/hihealth/data/model/HiStressMetaData;->configStress_feature_atts(Ljava/util/List;)V

    .line 774
    const-string v0, "PressureMeasureMessage"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getCycleMeasureHiStressMetaData end "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 775
    iget-object v0, p0, Lo/ewd;->J:Lcom/huawei/hihealth/data/model/HiStressMetaData;

    return-object v0
.end method

.method static synthetic d(Lo/ewd;)Lcom/huawei/hwbasemgr/IBaseResponseCallback;
    .locals 1

    .line 45
    iget-object v0, p0, Lo/ewd;->aa:Lcom/huawei/hwbasemgr/IBaseResponseCallback;

    return-object v0
.end method

.method public static d()Lo/ewd;
    .locals 4

    .line 122
    sget-object v2, Lo/ewd;->l:[B

    monitor-enter v2

    .line 123
    :try_start_0
    sget-object v0, Lo/ewd;->n:Lo/ewd;

    const/4 v1, 0x0

    if-ne v1, v0, :cond_0

    .line 124
    new-instance v0, Lo/ewd;

    invoke-direct {v0}, Lo/ewd;-><init>()V

    sput-object v0, Lo/ewd;->n:Lo/ewd;

    .line 126
    :cond_0
    sget-object v0, Lo/ewd;->n:Lo/ewd;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v2

    return-object v0

    .line 127
    :catchall_0
    move-exception v3

    monitor-exit v2

    throw v3
.end method

.method private d(J)V
    .locals 0

    .line 165
    iput-wide p1, p0, Lo/ewd;->S:J

    .line 166
    return-void
.end method

.method static synthetic d(Lo/ewd;Ljava/util/List;Ljava/util/List;)V
    .locals 0

    .line 45
    invoke-direct {p0, p1, p2}, Lo/ewd;->c(Ljava/util/List;Ljava/util/List;)V

    return-void
.end method

.method static synthetic d(Lo/ewd;Z)V
    .locals 0

    .line 45
    invoke-direct {p0, p1}, Lo/ewd;->r(Z)V

    return-void
.end method

.method static synthetic d(Lo/ewd;[F)[F
    .locals 0

    .line 45
    iput-object p1, p0, Lo/ewd;->V:[F

    return-object p1
.end method

.method static synthetic e(Lo/ewd;)Lcom/huawei/hihealth/data/model/HiStressMetaData;
    .locals 1

    .line 45
    iget-object v0, p0, Lo/ewd;->P:Lcom/huawei/hihealth/data/model/HiStressMetaData;

    return-object v0
.end method

.method private e(Ljava/util/List;)V
    .locals 4

    .line 946
    if-eqz p1, :cond_0

    .line 947
    invoke-interface {p1}, Ljava/util/List;->clear()V

    .line 948
    const-string v0, "PressureMeasureMessage"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "clearList"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 950
    :cond_0
    return-void
.end method

.method static synthetic e(Lo/ewd;Z)V
    .locals 0

    .line 45
    invoke-direct {p0, p1}, Lo/ewd;->m(Z)V

    return-void
.end method

.method private e(Lo/ewh;)V
    .locals 4

    .line 1119
    if-eqz p1, :cond_1

    .line 1120
    iget-object v0, p1, Lo/ewh;->c:Landroid/os/CountDownTimer;

    if-eqz v0, :cond_0

    .line 1121
    iget-object v0, p1, Lo/ewh;->c:Landroid/os/CountDownTimer;

    invoke-virtual {v0}, Landroid/os/CountDownTimer;->cancel()V

    .line 1122
    const/4 v0, 0x0

    iput-object v0, p1, Lo/ewh;->c:Landroid/os/CountDownTimer;

    .line 1124
    :cond_0
    const/4 p1, 0x0

    .line 1125
    const-string v0, "PressureMeasureMessage"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "helper = null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1127
    :cond_1
    return-void
.end method

.method private e(Lo/ewq;)V
    .locals 1

    .line 1110
    if-eqz p1, :cond_0

    .line 1111
    iget-object v0, p1, Lo/ewq;->d:Landroid/os/CountDownTimer;

    if-eqz v0, :cond_0

    .line 1112
    iget-object v0, p1, Lo/ewq;->d:Landroid/os/CountDownTimer;

    invoke-virtual {v0}, Landroid/os/CountDownTimer;->cancel()V

    .line 1113
    const/4 v0, 0x0

    iput-object v0, p1, Lo/ewq;->d:Landroid/os/CountDownTimer;

    .line 1116
    :cond_0
    return-void
.end method

.method private f([F)Lcom/huawei/hihealth/data/model/HiStressMetaData;
    .locals 4

    .line 779
    const-string v0, "PressureMeasureMessage"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getMeasureHiStressMetaData start "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 780
    new-instance v0, Lcom/huawei/hihealth/data/model/HiStressMetaData;

    invoke-direct {v0}, Lcom/huawei/hihealth/data/model/HiStressMetaData;-><init>()V

    iput-object v0, p0, Lo/ewd;->J:Lcom/huawei/hihealth/data/model/HiStressMetaData;

    .line 782
    iget-object v0, p0, Lo/ewd;->J:Lcom/huawei/hihealth/data/model/HiStressMetaData;

    invoke-virtual {p0}, Lo/ewd;->b()J

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, Lcom/huawei/hihealth/data/model/HiStressMetaData;->configStress_start_time(J)V

    .line 784
    iget-object v0, p0, Lo/ewd;->J:Lcom/huawei/hihealth/data/model/HiStressMetaData;

    invoke-virtual {p0}, Lo/ewd;->c()J

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, Lcom/huawei/hihealth/data/model/HiStressMetaData;->configStress_end_time(J)V

    .line 786
    iget-object v0, p0, Lo/ewd;->J:Lcom/huawei/hihealth/data/model/HiStressMetaData;

    invoke-direct {p0, p1}, Lo/ewd;->o([F)I

    move-result v1

    invoke-virtual {v0, v1}, Lcom/huawei/hihealth/data/model/HiStressMetaData;->configStress_algorithm_ver(I)V

    .line 788
    iget-object v0, p0, Lo/ewd;->J:Lcom/huawei/hihealth/data/model/HiStressMetaData;

    invoke-direct {p0}, Lo/ewd;->K()I

    move-result v1

    invoke-virtual {v0, v1}, Lcom/huawei/hihealth/data/model/HiStressMetaData;->configStress_dev_no(I)V

    .line 790
    iget-object v0, p0, Lo/ewd;->J:Lcom/huawei/hihealth/data/model/HiStressMetaData;

    invoke-direct {p0, p1}, Lo/ewd;->l([F)I

    move-result v1

    invoke-virtual {v0, v1}, Lcom/huawei/hihealth/data/model/HiStressMetaData;->configStress_score(I)V

    .line 791
    iget-object v0, p0, Lo/ewd;->J:Lcom/huawei/hihealth/data/model/HiStressMetaData;

    invoke-direct {p0, p1}, Lo/ewd;->p([F)I

    move-result v1

    invoke-virtual {v0, v1}, Lcom/huawei/hihealth/data/model/HiStressMetaData;->configStress_grade(I)V

    .line 792
    iget-object v0, p0, Lo/ewd;->J:Lcom/huawei/hihealth/data/model/HiStressMetaData;

    invoke-direct {p0, p1}, Lo/ewd;->m([F)I

    move-result v1

    invoke-virtual {v0, v1}, Lcom/huawei/hihealth/data/model/HiStressMetaData;->configStress_calib_flag(I)V

    .line 794
    iget-object v0, p0, Lo/ewd;->J:Lcom/huawei/hihealth/data/model/HiStressMetaData;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/huawei/hihealth/data/model/HiStressMetaData;->configStress_measure_type(I)V

    .line 796
    iget-object v0, p0, Lo/ewd;->J:Lcom/huawei/hihealth/data/model/HiStressMetaData;

    invoke-direct {p0}, Lo/ewd;->J()I

    move-result v1

    invoke-virtual {v0, v1}, Lcom/huawei/hihealth/data/model/HiStressMetaData;->configStress_acc_flag(I)V

    .line 798
    iget-object v0, p0, Lo/ewd;->J:Lcom/huawei/hihealth/data/model/HiStressMetaData;

    invoke-direct {p0}, Lo/ewd;->L()I

    move-result v1

    invoke-virtual {v0, v1}, Lcom/huawei/hihealth/data/model/HiStressMetaData;->configStress_ppg_flag(I)V

    .line 800
    iget-object v0, p0, Lo/ewd;->J:Lcom/huawei/hihealth/data/model/HiStressMetaData;

    invoke-direct {p0, p1}, Lo/ewd;->n([F)Ljava/util/List;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/huawei/hihealth/data/model/HiStressMetaData;->configStress_feature(Ljava/util/List;)V

    .line 802
    iget-object v0, p0, Lo/ewd;->J:Lcom/huawei/hihealth/data/model/HiStressMetaData;

    invoke-direct {p0}, Lo/ewd;->F()Ljava/util/List;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/huawei/hihealth/data/model/HiStressMetaData;->configStress_feature_atts(Ljava/util/List;)V

    .line 803
    const-string v0, "PressureMeasureMessage"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getMeasureHiStressMetaData end "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 804
    iget-object v0, p0, Lo/ewd;->J:Lcom/huawei/hihealth/data/model/HiStressMetaData;

    return-object v0
.end method

.method static synthetic f(Lo/ewd;)V
    .locals 0

    .line 45
    invoke-direct {p0}, Lo/ewd;->N()V

    return-void
.end method

.method static synthetic g(Lo/ewd;)Ljava/util/concurrent/Semaphore;
    .locals 1

    .line 45
    iget-object v0, p0, Lo/ewd;->k:Ljava/util/concurrent/Semaphore;

    return-object v0
.end method

.method private g([F)V
    .locals 1

    .line 133
    const/4 v0, 0x0

    if-eq v0, p1, :cond_0

    .line 134
    invoke-virtual {p1}, [F->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [F

    iput-object v0, p0, Lo/ewd;->X:[F

    goto :goto_0

    .line 136
    :cond_0
    const/4 v0, 0x0

    iput-object v0, p0, Lo/ewd;->X:[F

    .line 138
    :goto_0
    return-void
.end method

.method static synthetic h(Lo/ewd;)Lcom/huawei/datatype/PeriodRRIEntity;
    .locals 1

    .line 45
    iget-object v0, p0, Lo/ewd;->M:Lcom/huawei/datatype/PeriodRRIEntity;

    return-object v0
.end method

.method static synthetic i(Lo/ewd;)J
    .locals 2

    .line 45
    iget-wide v0, p0, Lo/ewd;->O:J

    return-wide v0
.end method

.method private i([F)Lcom/huawei/hihealth/data/model/HiStressMetaData;
    .locals 4

    .line 808
    const-string v0, "PressureMeasureMessage"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getCalibrateHiStressMetaData"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 809
    new-instance v0, Lcom/huawei/hihealth/data/model/HiStressMetaData;

    invoke-direct {v0}, Lcom/huawei/hihealth/data/model/HiStressMetaData;-><init>()V

    iput-object v0, p0, Lo/ewd;->J:Lcom/huawei/hihealth/data/model/HiStressMetaData;

    .line 811
    iget-object v0, p0, Lo/ewd;->J:Lcom/huawei/hihealth/data/model/HiStressMetaData;

    invoke-virtual {p0}, Lo/ewd;->b()J

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, Lcom/huawei/hihealth/data/model/HiStressMetaData;->configStress_start_time(J)V

    .line 813
    iget-object v0, p0, Lo/ewd;->J:Lcom/huawei/hihealth/data/model/HiStressMetaData;

    invoke-virtual {p0}, Lo/ewd;->c()J

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, Lcom/huawei/hihealth/data/model/HiStressMetaData;->configStress_end_time(J)V

    .line 815
    iget-object v0, p0, Lo/ewd;->J:Lcom/huawei/hihealth/data/model/HiStressMetaData;

    invoke-direct {p0, p1}, Lo/ewd;->o([F)I

    move-result v1

    invoke-virtual {v0, v1}, Lcom/huawei/hihealth/data/model/HiStressMetaData;->configStress_algorithm_ver(I)V

    .line 817
    iget-object v0, p0, Lo/ewd;->J:Lcom/huawei/hihealth/data/model/HiStressMetaData;

    invoke-direct {p0}, Lo/ewd;->K()I

    move-result v1

    invoke-virtual {v0, v1}, Lcom/huawei/hihealth/data/model/HiStressMetaData;->configStress_dev_no(I)V

    .line 819
    iget-object v0, p0, Lo/ewd;->J:Lcom/huawei/hihealth/data/model/HiStressMetaData;

    invoke-direct {p0, p1}, Lo/ewd;->l([F)I

    move-result v1

    invoke-virtual {v0, v1}, Lcom/huawei/hihealth/data/model/HiStressMetaData;->configStress_score(I)V

    .line 820
    iget-object v0, p0, Lo/ewd;->J:Lcom/huawei/hihealth/data/model/HiStressMetaData;

    invoke-direct {p0, p1}, Lo/ewd;->p([F)I

    move-result v1

    invoke-virtual {v0, v1}, Lcom/huawei/hihealth/data/model/HiStressMetaData;->configStress_grade(I)V

    .line 821
    iget-object v0, p0, Lo/ewd;->J:Lcom/huawei/hihealth/data/model/HiStressMetaData;

    invoke-direct {p0, p1}, Lo/ewd;->m([F)I

    move-result v1

    invoke-virtual {v0, v1}, Lcom/huawei/hihealth/data/model/HiStressMetaData;->configStress_calib_flag(I)V

    .line 823
    iget-object v0, p0, Lo/ewd;->J:Lcom/huawei/hihealth/data/model/HiStressMetaData;

    const/4 v1, 0x2

    invoke-virtual {v0, v1}, Lcom/huawei/hihealth/data/model/HiStressMetaData;->configStress_measure_type(I)V

    .line 825
    iget-object v0, p0, Lo/ewd;->J:Lcom/huawei/hihealth/data/model/HiStressMetaData;

    invoke-direct {p0}, Lo/ewd;->J()I

    move-result v1

    invoke-virtual {v0, v1}, Lcom/huawei/hihealth/data/model/HiStressMetaData;->configStress_acc_flag(I)V

    .line 827
    iget-object v0, p0, Lo/ewd;->J:Lcom/huawei/hihealth/data/model/HiStressMetaData;

    invoke-direct {p0}, Lo/ewd;->L()I

    move-result v1

    invoke-virtual {v0, v1}, Lcom/huawei/hihealth/data/model/HiStressMetaData;->configStress_ppg_flag(I)V

    .line 829
    iget-object v0, p0, Lo/ewd;->J:Lcom/huawei/hihealth/data/model/HiStressMetaData;

    invoke-direct {p0, p1}, Lo/ewd;->n([F)Ljava/util/List;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/huawei/hihealth/data/model/HiStressMetaData;->configStress_feature(Ljava/util/List;)V

    .line 831
    iget-object v0, p0, Lo/ewd;->J:Lcom/huawei/hihealth/data/model/HiStressMetaData;

    invoke-direct {p0}, Lo/ewd;->F()Ljava/util/List;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/huawei/hihealth/data/model/HiStressMetaData;->configStress_feature_atts(Ljava/util/List;)V

    .line 832
    iget-object v0, p0, Lo/ewd;->J:Lcom/huawei/hihealth/data/model/HiStressMetaData;

    return-object v0
.end method

.method private j()Z
    .locals 1

    .line 237
    iget-boolean v0, p0, Lo/ewd;->A:Z

    return v0
.end method

.method private k(I)V
    .locals 5

    .line 543
    const-string v0, "PressureMeasureMessage"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "startBroadcast soType = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 544
    const/4 v0, 0x0

    if-ne v0, p1, :cond_0

    .line 545
    new-instance v0, Landroid/content/Intent;

    const-string v1, "com.huawei.ui.pressure.measure"

    invoke-direct {v0, v1}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    iput-object v0, p0, Lo/ewd;->E:Landroid/content/Intent;

    .line 546
    iget-object v0, p0, Lo/ewd;->m:Landroid/content/Context;

    iget-object v1, p0, Lo/ewd;->E:Landroid/content/Intent;

    sget-object v2, Lo/dac;->a:Ljava/lang/String;

    invoke-virtual {v0, v1, v2}, Landroid/content/Context;->sendOrderedBroadcast(Landroid/content/Intent;Ljava/lang/String;)V

    goto/16 :goto_0

    .line 547
    :cond_0
    const/4 v0, 0x2

    if-ne v0, p1, :cond_1

    .line 548
    new-instance v0, Landroid/content/Intent;

    const-string v1, "com.huawei.ui.pressure.calibrate"

    invoke-direct {v0, v1}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    iput-object v0, p0, Lo/ewd;->E:Landroid/content/Intent;

    .line 549
    iget-object v0, p0, Lo/ewd;->m:Landroid/content/Context;

    iget-object v1, p0, Lo/ewd;->E:Landroid/content/Intent;

    sget-object v2, Lo/dac;->a:Ljava/lang/String;

    invoke-virtual {v0, v1, v2}, Landroid/content/Context;->sendOrderedBroadcast(Landroid/content/Intent;Ljava/lang/String;)V

    goto/16 :goto_0

    .line 550
    :cond_1
    const v0, -0x18a92

    if-ne v0, p1, :cond_2

    .line 551
    new-instance v0, Landroid/content/Intent;

    const-string v1, "com.huawei.ui.pressure.measure.suddenness"

    invoke-direct {v0, v1}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    iput-object v0, p0, Lo/ewd;->E:Landroid/content/Intent;

    .line 552
    iget-object v0, p0, Lo/ewd;->m:Landroid/content/Context;

    iget-object v1, p0, Lo/ewd;->E:Landroid/content/Intent;

    sget-object v2, Lo/dac;->a:Ljava/lang/String;

    invoke-virtual {v0, v1, v2}, Landroid/content/Context;->sendOrderedBroadcast(Landroid/content/Intent;Ljava/lang/String;)V

    goto/16 :goto_0

    .line 553
    :cond_2
    const v0, -0x18a93

    if-ne v0, p1, :cond_3

    .line 554
    new-instance v0, Landroid/content/Intent;

    const-string v1, "com.huawei.ui.pressure.measure.calibrate.stop"

    invoke-direct {v0, v1}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    iput-object v0, p0, Lo/ewd;->E:Landroid/content/Intent;

    .line 555
    iget-object v0, p0, Lo/ewd;->m:Landroid/content/Context;

    iget-object v1, p0, Lo/ewd;->E:Landroid/content/Intent;

    sget-object v2, Lo/dac;->a:Ljava/lang/String;

    invoke-virtual {v0, v1, v2}, Landroid/content/Context;->sendOrderedBroadcast(Landroid/content/Intent;Ljava/lang/String;)V

    goto/16 :goto_0

    .line 556
    :cond_3
    sget v0, Lo/ewd;->u:I

    if-ne v0, p1, :cond_4

    .line 557
    const-string v0, "PressureMeasureMessage"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "measure err!"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 558
    new-instance v0, Landroid/content/Intent;

    const-string v1, "com.huawei.ui.pressure.measure.err"

    invoke-direct {v0, v1}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    iput-object v0, p0, Lo/ewd;->E:Landroid/content/Intent;

    .line 559
    iget-object v0, p0, Lo/ewd;->E:Landroid/content/Intent;

    const-string v1, "isFromNoData"

    iget-boolean v2, p0, Lo/ewd;->c:Z

    invoke-virtual {v0, v1, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Z)Landroid/content/Intent;

    .line 560
    iget-object v0, p0, Lo/ewd;->m:Landroid/content/Context;

    iget-object v1, p0, Lo/ewd;->E:Landroid/content/Intent;

    sget-object v2, Lo/dac;->a:Ljava/lang/String;

    invoke-virtual {v0, v1, v2}, Landroid/content/Context;->sendOrderedBroadcast(Landroid/content/Intent;Ljava/lang/String;)V

    goto/16 :goto_0

    .line 561
    :cond_4
    sget v0, Lo/ewd;->q:I

    if-ne v0, p1, :cond_6

    .line 562
    const-string v0, "PressureMeasureMessage"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "calibrate err!"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 563
    iget-boolean v0, p0, Lo/ewd;->x:Z

    if-eqz v0, :cond_5

    .line 564
    const-string v0, "PressureMeasureMessage"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "calibrate question err!"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 566
    new-instance v4, Landroid/content/Intent;

    invoke-direct {v4}, Landroid/content/Intent;-><init>()V

    .line 567
    const/high16 v0, 0x10000000

    invoke-virtual {v4, v0}, Landroid/content/Intent;->setFlags(I)Landroid/content/Intent;

    .line 568
    const-string v0, "com.huawei.health"

    invoke-virtual {v4, v0}, Landroid/content/Intent;->setPackage(Ljava/lang/String;)Landroid/content/Intent;

    .line 569
    const-string v0, "com.huawei.health"

    const-string v1, "com.huawei.ui.main.stories.fitness.activity.pressurecalibrate.activity.PressureCalibrateResultActivity"

    invoke-virtual {v4, v0, v1}, Landroid/content/Intent;->setClassName(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 571
    const-string v0, "stopTimer"

    const/4 v1, 0x1

    invoke-virtual {v4, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Z)Landroid/content/Intent;

    .line 572
    const-string v0, "isFromNoData"

    iget-boolean v1, p0, Lo/ewd;->c:Z

    invoke-virtual {v4, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Z)Landroid/content/Intent;

    .line 573
    const-string v0, "press_auto_monitor"

    invoke-direct {p0}, Lo/ewd;->E()Z

    move-result v1

    invoke-virtual {v4, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Z)Landroid/content/Intent;

    .line 574
    iget-object v0, p0, Lo/ewd;->m:Landroid/content/Context;

    invoke-virtual {v0, v4}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V

    .line 575
    goto :goto_0

    .line 576
    :cond_5
    const-string v0, "PressureMeasureMessage"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "calibrate activity err!"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 577
    new-instance v0, Landroid/content/Intent;

    const-string v1, "com.huawei.ui.pressure.calibrate.err"

    invoke-direct {v0, v1}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    iput-object v0, p0, Lo/ewd;->E:Landroid/content/Intent;

    .line 578
    iget-object v0, p0, Lo/ewd;->E:Landroid/content/Intent;

    const-string v1, "isFromNoData"

    iget-boolean v2, p0, Lo/ewd;->c:Z

    invoke-virtual {v0, v1, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Z)Landroid/content/Intent;

    .line 579
    iget-object v0, p0, Lo/ewd;->m:Landroid/content/Context;

    iget-object v1, p0, Lo/ewd;->E:Landroid/content/Intent;

    sget-object v2, Lo/dac;->a:Ljava/lang/String;

    invoke-virtual {v0, v1, v2}, Landroid/content/Context;->sendOrderedBroadcast(Landroid/content/Intent;Ljava/lang/String;)V

    .line 582
    :cond_6
    :goto_0
    return-void
.end method

.method static synthetic k(Lo/ewd;)Z
    .locals 1

    .line 45
    invoke-direct {p0}, Lo/ewd;->I()Z

    move-result v0

    return v0
.end method

.method private l([F)I
    .locals 1

    .line 881
    const/16 v0, 0xf

    aget v0, p1, v0

    float-to-int v0, v0

    return v0
.end method

.method static synthetic l(Lo/ewd;)Ljava/util/List;
    .locals 1

    .line 45
    iget-object v0, p0, Lo/ewd;->ac:Ljava/util/List;

    return-object v0
.end method

.method private m([F)I
    .locals 2

    .line 887
    const/16 v0, 0x11

    aget v0, p1, v0

    float-to-int v0, v0

    const/4 v1, 0x0

    if-ne v1, v0, :cond_0

    .line 888
    const/4 v0, 0x0

    return v0

    .line 889
    :cond_0
    const/16 v0, 0x11

    aget v0, p1, v0

    float-to-int v0, v0

    const/4 v1, 0x2

    if-ne v1, v0, :cond_1

    .line 890
    const/4 v0, 0x1

    return v0

    .line 892
    :cond_1
    const/16 v0, 0x11

    aget v0, p1, v0

    float-to-int v0, v0

    return v0
.end method

.method static synthetic m(Lo/ewd;)J
    .locals 2

    .line 45
    iget-wide v0, p0, Lo/ewd;->R:J

    return-wide v0
.end method

.method private m(Z)V
    .locals 0

    .line 273
    iput-boolean p1, p0, Lo/ewd;->H:Z

    .line 274
    return-void
.end method

.method private m(I)[F
    .locals 6

    .line 972
    const/16 v0, 0x12

    new-array v4, v0, [F

    .line 973
    invoke-static {}, Lo/dgx;->e()Lo/dgx;

    move-result-object v0

    new-instance v1, Lo/ewd$9;

    invoke-direct {v1, p0, v4, p1}, Lo/ewd$9;-><init>(Lo/ewd;[FI)V

    invoke-virtual {v0, v1}, Lo/dgx;->d(Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V

    .line 1009
    :try_start_0
    iget-object v0, p0, Lo/ewd;->k:Ljava/util/concurrent/Semaphore;

    sget-object v1, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    const-wide/16 v2, 0x2

    invoke-virtual {v0, v2, v3, v1}, Ljava/util/concurrent/Semaphore;->tryAcquire(JLjava/util/concurrent/TimeUnit;)Z

    move-result v5

    .line 1010
    if-eqz v5, :cond_0

    .line 1011
    const-string v0, "PressureMeasureMessage"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "semaphore tryAcquire()"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    goto :goto_0

    .line 1013
    :cond_0
    const-string v0, "PressureMeasureMessage"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "semaphore tryAcquire() fail"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1015
    :goto_0
    const-string v0, "PressureMeasureMessage"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "semaphore continue"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_0

    .line 1018
    goto :goto_1

    .line 1016
    :catch_0
    move-exception v5

    .line 1017
    const-string v0, "PressureMeasureMessage"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "semaphore fail"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1019
    :goto_1
    return-object v4
.end method

.method private n([F)Ljava/util/List;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "([F)Ljava/util/List<Ljava/lang/Float;>;"
        }
    .end annotation

    .line 838
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 839
    const/4 v0, 0x0

    aget v0, p1, v0

    invoke-static {v0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v0

    invoke-interface {v1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 840
    const/4 v0, 0x1

    aget v0, p1, v0

    invoke-static {v0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v0

    invoke-interface {v1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 841
    const/4 v0, 0x2

    aget v0, p1, v0

    invoke-static {v0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v0

    invoke-interface {v1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 842
    const/4 v0, 0x3

    aget v0, p1, v0

    invoke-static {v0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v0

    invoke-interface {v1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 843
    const/4 v0, 0x4

    aget v0, p1, v0

    invoke-static {v0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v0

    invoke-interface {v1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 844
    const/4 v0, 0x5

    aget v0, p1, v0

    invoke-static {v0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v0

    invoke-interface {v1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 845
    const/4 v0, 0x6

    aget v0, p1, v0

    invoke-static {v0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v0

    invoke-interface {v1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 846
    const/4 v0, 0x7

    aget v0, p1, v0

    invoke-static {v0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v0

    invoke-interface {v1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 847
    const/16 v0, 0x8

    aget v0, p1, v0

    invoke-static {v0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v0

    invoke-interface {v1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 848
    const/16 v0, 0x9

    aget v0, p1, v0

    invoke-static {v0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v0

    invoke-interface {v1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 850
    const/4 v0, 0x0

    invoke-static {v0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v0

    invoke-interface {v1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 851
    const/4 v0, 0x0

    invoke-static {v0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v0

    invoke-interface {v1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 852
    return-object v1
.end method

.method private o([F)I
    .locals 1

    .line 835
    const/16 v0, 0xa

    aget v0, p1, v0

    float-to-int v0, v0

    return v0
.end method

.method static synthetic o(Lo/ewd;)[F
    .locals 1

    .line 45
    iget-object v0, p0, Lo/ewd;->V:[F

    return-object v0
.end method

.method private p([F)I
    .locals 1

    .line 884
    const/16 v0, 0x10

    aget v0, p1, v0

    float-to-int v0, v0

    return v0
.end method

.method static synthetic p(Lo/ewd;)Ljava/util/List;
    .locals 1

    .line 45
    iget-object v0, p0, Lo/ewd;->ab:Ljava/util/List;

    return-object v0
.end method

.method private p(Z)V
    .locals 0

    .line 191
    iput-boolean p1, p0, Lo/ewd;->j:Z

    .line 192
    return-void
.end method

.method private r(Z)V
    .locals 4

    .line 1252
    const-string v0, "PressureMeasureMessage"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "setIsDataStoredSuccessed = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1253
    iput-boolean p1, p0, Lo/ewd;->af:Z

    .line 1254
    return-void
.end method

.method private t(Z)V
    .locals 0

    .line 291
    iput-boolean p1, p0, Lo/ewd;->w:Z

    .line 292
    return-void
.end method

.method public static u()J
    .locals 2

    .line 649
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    return-wide v0
.end method

.method private u(Z)V
    .locals 0

    .line 285
    iput-boolean p1, p0, Lo/ewd;->a:Z

    .line 286
    return-void
.end method

.method static synthetic y()I
    .locals 1

    .line 45
    sget v0, Lo/ewd;->u:I

    return v0
.end method


# virtual methods
.method public a([F)I
    .locals 1

    .line 921
    const/16 v0, 0xf

    aget v0, p1, v0

    float-to-int v0, v0

    return v0
.end method

.method public a(I)V
    .locals 0

    .line 172
    iput p1, p0, Lo/ewd;->o:I

    .line 173
    return-void
.end method

.method public a(ILandroid/content/Context;[F)V
    .locals 6

    .line 713
    const-string v0, "PressureMeasureMessage"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, " PressureUtil  setDataToDatas !!!"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 714
    new-instance v4, Lo/exv;

    invoke-direct {v4, p2}, Lo/exv;-><init>(Landroid/content/Context;)V

    .line 715
    const/4 v0, 0x0

    if-ne v0, p1, :cond_0

    .line 716
    const-string v0, "PressureMeasureMessage"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, " setDataToDatas  getMeasureHiStressMetaData ()!!!"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 717
    invoke-direct {p0, p3}, Lo/ewd;->f([F)Lcom/huawei/hihealth/data/model/HiStressMetaData;

    move-result-object v0

    iput-object v0, p0, Lo/ewd;->J:Lcom/huawei/hihealth/data/model/HiStressMetaData;

    goto :goto_0

    .line 718
    :cond_0
    const/4 v0, 0x2

    if-ne v0, p1, :cond_1

    .line 719
    invoke-direct {p0, p3}, Lo/ewd;->i([F)Lcom/huawei/hihealth/data/model/HiStressMetaData;

    move-result-object v0

    iput-object v0, p0, Lo/ewd;->J:Lcom/huawei/hihealth/data/model/HiStressMetaData;

    .line 720
    invoke-static {}, Lo/dgx;->e()Lo/dgx;

    move-result-object v0

    iget-object v1, p0, Lo/ewd;->J:Lcom/huawei/hihealth/data/model/HiStressMetaData;

    invoke-virtual {v0, p2, v1}, Lo/dgx;->e(Landroid/content/Context;Lcom/huawei/hihealth/data/model/HiStressMetaData;)V

    .line 722
    :cond_1
    :goto_0
    iget-object v0, p0, Lo/ewd;->J:Lcom/huawei/hihealth/data/model/HiStressMetaData;

    iget-object v1, p0, Lo/ewd;->Y:Lo/egg;

    invoke-virtual {v4, v0, v1}, Lo/exv;->e(Lcom/huawei/hihealth/data/model/HiStressMetaData;Lo/egg;)V

    .line 724
    :try_start_0
    iget-object v0, p0, Lo/ewd;->p:Ljava/util/concurrent/Semaphore;

    sget-object v1, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    const-wide/16 v2, 0x2

    invoke-virtual {v0, v2, v3, v1}, Ljava/util/concurrent/Semaphore;->tryAcquire(JLjava/util/concurrent/TimeUnit;)Z

    move-result v5

    .line 725
    if-eqz v5, :cond_2

    .line 726
    const-string v0, "PressureMeasureMessage"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "measureSemaphore tryAcquire()"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    goto :goto_1

    .line 728
    :cond_2
    const-string v0, "PressureMeasureMessage"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "measureSemaphore tryAcquire() fail"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_0

    .line 732
    :goto_1
    goto :goto_2

    .line 730
    :catch_0
    move-exception v5

    .line 731
    const-string v0, "PressureMeasureMessage"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "measureSemaphore.tryAcquire InterruptedException"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 733
    :goto_2
    invoke-virtual {p0}, Lo/ewd;->w()Z

    move-result v0

    if-nez v0, :cond_4

    .line 734
    iget-object v0, p0, Lo/ewd;->J:Lcom/huawei/hihealth/data/model/HiStressMetaData;

    iget-object v1, p0, Lo/ewd;->Y:Lo/egg;

    invoke-virtual {v4, v0, v1}, Lo/exv;->e(Lcom/huawei/hihealth/data/model/HiStressMetaData;Lo/egg;)V

    .line 736
    :try_start_1
    iget-object v0, p0, Lo/ewd;->p:Ljava/util/concurrent/Semaphore;

    sget-object v1, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    const-wide/16 v2, 0x2

    invoke-virtual {v0, v2, v3, v1}, Ljava/util/concurrent/Semaphore;->tryAcquire(JLjava/util/concurrent/TimeUnit;)Z

    move-result v5

    .line 737
    if-eqz v5, :cond_3

    .line 738
    const-string v0, "PressureMeasureMessage"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "measureSemaphore tryAcquire2()"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    goto :goto_3

    .line 740
    :cond_3
    const-string v0, "PressureMeasureMessage"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "measureSemaphore tryAcquire2() fail"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 742
    :goto_3
    const-string v0, "PressureMeasureMessage"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "measureSemaphore continue"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_1
    .catch Ljava/lang/InterruptedException; {:try_start_1 .. :try_end_1} :catch_1

    .line 745
    goto :goto_4

    .line 743
    :catch_1
    move-exception v5

    .line 744
    const-string v0, "PressureMeasureMessage"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "measureSemaphore.tryAcquire2 InterruptedException"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 747
    :cond_4
    :goto_4
    return-void
.end method

.method public a(Lcom/huawei/ui/main/stories/fitness/activity/pressurecalibrate/fragment/PressureCalibrateQuestionActivity;)V
    .locals 0

    .line 1245
    iput-object p1, p0, Lo/ewd;->ah:Lcom/huawei/ui/main/stories/fitness/activity/pressurecalibrate/fragment/PressureCalibrateQuestionActivity;

    .line 1246
    return-void
.end method

.method public a(Z)V
    .locals 0

    .line 215
    iput-boolean p1, p0, Lo/ewd;->c:Z

    .line 216
    return-void
.end method

.method public a()[F
    .locals 2

    .line 140
    iget-object v0, p0, Lo/ewd;->X:[F

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 141
    iget-object v0, p0, Lo/ewd;->X:[F

    invoke-virtual {v0}, [F->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [F

    return-object v0

    .line 143
    :cond_0
    const/4 v0, 0x0

    return-object v0
.end method

.method public a(Ljava/util/List;)[I
    .locals 3

    .line 653
    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v0

    new-array v1, v0, [I

    .line 654
    const/4 v2, 0x0

    :goto_0
    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v0

    if-ge v2, v0, :cond_0

    .line 655
    invoke-interface {p1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    aput v0, v1, v2

    .line 654
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    .line 657
    :cond_0
    return-object v1
.end method

.method public b()J
    .locals 2

    .line 162
    iget-wide v0, p0, Lo/ewd;->Q:J

    return-wide v0
.end method

.method public b(I)V
    .locals 6

    .line 441
    invoke-static {}, Lo/ewd;->u()J

    move-result-wide v0

    invoke-direct {p0, v0, v1}, Lo/ewd;->b(J)V

    .line 442
    const-string v0, "PressureMeasureMessage"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "openMeasureOrCalibrate  mStartMeasureTime = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {p0}, Lo/ewd;->b()J

    move-result-wide v3

    invoke-virtual {v2, v3, v4}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 443
    const-string v0, "PressureMeasureMessage"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "openMeasureOrCalibrate = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 444
    new-instance v0, Lorg/json/JSONObject;

    invoke-direct {v0}, Lorg/json/JSONObject;-><init>()V

    iput-object v0, p0, Lo/ewd;->K:Lorg/json/JSONObject;

    .line 446
    :try_start_0
    iget-object v0, p0, Lo/ewd;->K:Lorg/json/JSONObject;

    const-string v1, "status"

    invoke-virtual {v0, v1, p1}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    .line 447
    const-string v0, "PressureMeasureMessage"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "jsonObject success ="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    .line 450
    goto :goto_0

    .line 448
    :catch_0
    move-exception v5

    .line 449
    const-string v0, "PressureMeasureMessage"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "jsonObject fail"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 451
    :goto_0
    const-string v0, "PressureMeasureMessage"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "openMeasureOrCalibrate  jsonObject = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lo/ewd;->K:Lorg/json/JSONObject;

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 452
    invoke-static {}, Lo/aks;->e()Lo/aks;

    move-result-object v0

    iget-object v1, p0, Lo/ewd;->K:Lorg/json/JSONObject;

    iget-object v2, p0, Lo/ewd;->T:Lcom/huawei/hwbasemgr/IBaseResponseCallback;

    invoke-virtual {v0, v1, v2}, Lo/aks;->d(Lorg/json/JSONObject;Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V

    .line 453
    const-string v0, "PressureMeasureMessage"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "gameOver---"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 454
    iget-object v0, p0, Lo/ewd;->b:Ljava/util/List;

    invoke-direct {p0, v0}, Lo/ewd;->c(Ljava/util/List;)V

    .line 455
    return-void
.end method

.method public b(Z)V
    .locals 0

    .line 221
    iput-boolean p1, p0, Lo/ewd;->v:Z

    .line 222
    return-void
.end method

.method public b([F)Z
    .locals 5

    .line 928
    const/4 v4, 0x0

    .line 929
    if-eqz p1, :cond_1

    array-length v0, p1

    const/4 v1, 0x1

    if-le v0, v1, :cond_1

    const/16 v0, 0x12

    aget v0, p1, v0

    const/high16 v1, 0x3f800000    # 1.0f

    cmpl-float v0, v1, v0

    if-nez v0, :cond_1

    .line 930
    const/16 v0, 0xf

    aget v0, p1, v0

    const/high16 v1, 0x3f800000    # 1.0f

    cmpl-float v0, v0, v1

    if-ltz v0, :cond_0

    const/16 v0, 0xf

    aget v0, p1, v0

    const/high16 v1, 0x42c60000    # 99.0f

    cmpg-float v0, v0, v1

    if-gtz v0, :cond_0

    .line 931
    const/4 v4, 0x1

    .line 933
    :cond_0
    const-string v0, "PressureMeasureMessage"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "isCalibrateSuccessed =="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 935
    :cond_1
    return v4
.end method

.method public c()J
    .locals 2

    .line 168
    iget-wide v0, p0, Lo/ewd;->S:J

    return-wide v0
.end method

.method public c(I)V
    .locals 0

    .line 184
    iput p1, p0, Lo/ewd;->t:I

    .line 185
    return-void
.end method

.method public c(Z)V
    .locals 0

    .line 203
    iput-boolean p1, p0, Lo/ewd;->z:Z

    .line 204
    return-void
.end method

.method public c([F)V
    .locals 1

    .line 146
    const/4 v0, 0x0

    if-eq v0, p1, :cond_0

    .line 147
    invoke-virtual {p1}, [F->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [F

    iput-object v0, p0, Lo/ewd;->U:[F

    goto :goto_0

    .line 149
    :cond_0
    const/4 v0, 0x0

    iput-object v0, p0, Lo/ewd;->U:[F

    .line 151
    :goto_0
    return-void
.end method

.method public c(IZ)Z
    .locals 2

    .line 495
    invoke-direct {p0}, Lo/ewd;->H()Z

    move-result v0

    if-nez v0, :cond_0

    .line 496
    iget-object v0, p0, Lo/ewd;->b:Ljava/util/List;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lo/ewd;->b:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    const/4 v1, 0x1

    if-lt v0, v1, :cond_0

    .line 497
    iget-object v0, p0, Lo/ewd;->b:Ljava/util/List;

    invoke-direct {p0, v0, p1, p2}, Lo/ewd;->c(Ljava/util/List;IZ)V

    .line 498
    const/4 v0, 0x1

    return v0

    .line 501
    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public d([F)I
    .locals 1

    .line 924
    const/16 v0, 0x10

    aget v0, p1, v0

    float-to-int v0, v0

    return v0
.end method

.method public d(I)V
    .locals 0

    .line 178
    iput p1, p0, Lo/ewd;->r:I

    .line 179
    return-void
.end method

.method public d(II)V
    .locals 6

    .line 457
    invoke-direct {p0}, Lo/ewd;->C()Z

    move-result v0

    if-nez v0, :cond_0

    .line 458
    invoke-static {}, Lo/ewn;->i()Lo/ewn;

    move-result-object v0

    invoke-virtual {v0}, Lo/ewn;->a()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 459
    invoke-static {}, Lo/ewn;->i()Lo/ewn;

    move-result-object v0

    invoke-virtual {v0}, Lo/ewn;->g()Z

    move-result v0

    if-nez v0, :cond_0

    .line 460
    invoke-static {}, Lo/ewn;->i()Lo/ewn;

    move-result-object v0

    invoke-virtual {v0}, Lo/ewn;->h()Z

    move-result v0

    if-nez v0, :cond_0

    .line 461
    iget-object v0, p0, Lo/ewd;->m:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/ui/main/R$string;->IDS_hw_show_card_pressure_calibrate_answer_question_out_time_notify:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v5

    .line 462
    iget-object v0, p0, Lo/ewd;->m:Landroid/content/Context;

    invoke-static {v0, v5}, Lo/emv;->d(Landroid/content/Context;Ljava/lang/String;)V

    .line 467
    :cond_0
    const/4 v0, 0x1

    invoke-direct {p0, v0}, Lo/ewd;->t(Z)V

    .line 468
    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Lo/ewd;->f(Z)V

    .line 469
    invoke-direct {p0}, Lo/ewd;->N()V

    .line 470
    invoke-static {}, Lo/ewd;->u()J

    move-result-wide v0

    invoke-direct {p0, v0, v1}, Lo/ewd;->d(J)V

    .line 471
    const-string v0, "PressureMeasureMessage"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "closeMeasureOrCalibrate mEndMeasureTime = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {p0}, Lo/ewd;->c()J

    move-result-wide v3

    invoke-virtual {v2, v3, v4}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 472
    const-string v0, "PressureMeasureMessage"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "closeMeasureOrCalibrate = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 473
    new-instance v0, Lorg/json/JSONObject;

    invoke-direct {v0}, Lorg/json/JSONObject;-><init>()V

    iput-object v0, p0, Lo/ewd;->K:Lorg/json/JSONObject;

    .line 475
    :try_start_0
    iget-object v0, p0, Lo/ewd;->K:Lorg/json/JSONObject;

    const-string v1, "status"

    invoke-virtual {v0, v1, p1}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    .line 476
    const-string v0, "PressureMeasureMessage"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "closeMeasureOrCalibrate  jsonObject = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lo/ewd;->K:Lorg/json/JSONObject;

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    .line 479
    goto :goto_0

    .line 477
    :catch_0
    move-exception v5

    .line 478
    const-string v0, "PressureMeasureMessage"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "closeMeasureOrCalibrate  jsonObject fail "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 480
    :goto_0
    invoke-static {}, Lo/aks;->e()Lo/aks;

    move-result-object v0

    iget-object v1, p0, Lo/ewd;->K:Lorg/json/JSONObject;

    iget-object v2, p0, Lo/ewd;->W:Lcom/huawei/hwbasemgr/IBaseResponseCallback;

    invoke-virtual {v0, v1, v2}, Lo/aks;->d(Lorg/json/JSONObject;Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V

    .line 481
    const-string v0, "PressureMeasureMessage"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "closeMeasureOrCalibrate()==mEndMeasureTime=="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {p0}, Lo/ewd;->c()J

    move-result-wide v3

    invoke-virtual {v2, v3, v4}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 482
    new-instance v0, Lo/ewd$7;

    invoke-direct {v0, p0, p2}, Lo/ewd$7;-><init>(Lo/ewd;I)V

    invoke-static {v0}, Lo/dbw;->e(Ljava/lang/Runnable;)I

    .line 489
    invoke-direct {p0}, Lo/ewd;->B()Z

    move-result v0

    if-nez v0, :cond_1

    .line 490
    invoke-static {}, Lo/aks;->e()Lo/aks;

    move-result-object v0

    iget-object v1, p0, Lo/ewd;->aa:Lcom/huawei/hwbasemgr/IBaseResponseCallback;

    invoke-virtual {v0, v1}, Lo/aks;->s(Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V

    .line 492
    :cond_1
    return-void
.end method

.method public d(Z)V
    .locals 0

    .line 209
    iput-boolean p1, p0, Lo/ewd;->x:Z

    .line 210
    return-void
.end method

.method public e(III)V
    .locals 4

    .line 661
    const-string v0, "PressureMeasureMessage"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Current Timer start!!! time === "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "S"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 662
    new-instance v0, Lo/ewq;

    const/4 v1, 0x1

    invoke-direct {v0, p2, v1, p3}, Lo/ewq;-><init>(III)V

    iput-object v0, p0, Lo/ewd;->N:Lo/ewq;

    .line 663
    iget-object v0, p0, Lo/ewd;->N:Lo/ewq;

    new-instance v1, Lo/ewd$10;

    invoke-direct {v1, p0, p1, p3}, Lo/ewd$10;-><init>(Lo/ewd;II)V

    invoke-virtual {v0, v1}, Lo/ewq;->a(Lo/ewq$c;)V

    .line 671
    iget-object v0, p0, Lo/ewd;->N:Lo/ewq;

    invoke-virtual {v0}, Lo/ewq;->a()V

    .line 672
    return-void
.end method

.method public e(Z)V
    .locals 0

    .line 197
    iput-boolean p1, p0, Lo/ewd;->s:Z

    .line 198
    return-void
.end method

.method public e([F)Z
    .locals 5

    .line 911
    const/4 v4, 0x0

    .line 912
    if-eqz p1, :cond_0

    .line 913
    const/16 v0, 0x12

    aget v0, p1, v0

    const/high16 v1, 0x3f800000    # 1.0f

    cmpl-float v0, v1, v0

    if-nez v0, :cond_0

    .line 914
    const-string v0, "PressureMeasureMessage"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "MeassureSOBack[18] = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const/16 v3, 0x12

    aget v3, p1, v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 915
    const/4 v4, 0x1

    .line 918
    :cond_0
    return v4
.end method

.method public e()[F
    .locals 2

    .line 153
    iget-object v0, p0, Lo/ewd;->X:[F

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 154
    iget-object v0, p0, Lo/ewd;->U:[F

    invoke-virtual {v0}, [F->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [F

    return-object v0

    .line 156
    :cond_0
    const/4 v0, 0x0

    return-object v0
.end method

.method public e(I)[F
    .locals 4

    .line 607
    const-string v0, "PressureMeasureMessage"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "SO start openSOMeasure  flag = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 608
    invoke-static {}, Lo/ewm;->c()Lo/ewm;

    move-result-object v0

    invoke-virtual {v0, p1}, Lo/ewm;->e(I)[F

    move-result-object v0

    return-object v0
.end method

.method public f()I
    .locals 1

    .line 187
    iget v0, p0, Lo/ewd;->t:I

    return v0
.end method

.method public f(Z)V
    .locals 0

    .line 240
    iput-boolean p1, p0, Lo/ewd;->C:Z

    .line 241
    return-void
.end method

.method public f(I)[F
    .locals 4

    .line 615
    const-string v0, "PressureMeasureMessage"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "SO start openSOCalibrate  flag = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 616
    invoke-static {}, Lo/ewm;->c()Lo/ewm;

    move-result-object v0

    invoke-virtual {v0, p1}, Lo/ewm;->e(I)[F

    move-result-object v0

    return-object v0
.end method

.method public g(I)V
    .locals 5

    .line 953
    const-string v0, "PressureMeasureMessage"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "closeMeasureOrCalibrateAll"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 954
    new-instance v0, Lorg/json/JSONObject;

    invoke-direct {v0}, Lorg/json/JSONObject;-><init>()V

    iput-object v0, p0, Lo/ewd;->K:Lorg/json/JSONObject;

    .line 956
    :try_start_0
    iget-object v0, p0, Lo/ewd;->K:Lorg/json/JSONObject;

    const-string v1, "status"

    invoke-virtual {v0, v1, p1}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    .line 957
    const-string v0, "PressureMeasureMessage"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    iget-object v2, p0, Lo/ewd;->K:Lorg/json/JSONObject;

    invoke-virtual {v2}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    .line 960
    goto :goto_0

    .line 958
    :catch_0
    move-exception v4

    .line 959
    const-string v0, "PressureMeasureMessage"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "jsonObject fail"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 961
    :goto_0
    invoke-static {}, Lo/aks;->e()Lo/aks;

    move-result-object v0

    iget-object v1, p0, Lo/ewd;->K:Lorg/json/JSONObject;

    iget-object v2, p0, Lo/ewd;->W:Lcom/huawei/hwbasemgr/IBaseResponseCallback;

    invoke-virtual {v0, v1, v2}, Lo/aks;->d(Lorg/json/JSONObject;Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V

    .line 962
    return-void
.end method

.method public g(Z)V
    .locals 0

    .line 254
    iput-boolean p1, p0, Lo/ewd;->B:Z

    .line 255
    return-void
.end method

.method public g()Z
    .locals 1

    .line 218
    iget-boolean v0, p0, Lo/ewd;->c:Z

    return v0
.end method

.method public h()I
    .locals 1

    .line 181
    iget v0, p0, Lo/ewd;->r:I

    return v0
.end method

.method public h([F)I
    .locals 1

    .line 942
    const/16 v0, 0x10

    aget v0, p1, v0

    float-to-int v0, v0

    return v0
.end method

.method public h(Z)V
    .locals 0

    .line 227
    iput-boolean p1, p0, Lo/ewd;->y:Z

    .line 228
    return-void
.end method

.method public declared-synchronized h(I)[F
    .locals 5

    monitor-enter p0

    .line 964
    :try_start_0
    invoke-direct {p0, p1}, Lo/ewd;->m(I)[F

    move-result-object v4

    .line 965
    invoke-static {}, Lo/ewm;->c()Lo/ewm;

    move-result-object v0

    invoke-virtual {v0, v4}, Lo/ewm;->c([F)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 966
    const-string v0, "PressureMeasureMessage"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "newCalibData first is all 0 "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 967
    invoke-direct {p0, p1}, Lo/ewd;->m(I)[F
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result-object v4

    .line 969
    :cond_0
    monitor-exit p0

    return-object v4

    :catchall_0
    move-exception p1

    monitor-exit p0

    throw p1
.end method

.method public i()I
    .locals 1

    .line 175
    iget v0, p0, Lo/ewd;->o:I

    return v0
.end method

.method public i(I)Ljava/lang/String;
    .locals 3

    .line 620
    const-string v2, ""

    .line 621
    const/4 v0, 0x1

    if-ne v0, p1, :cond_0

    .line 622
    iget-object v0, p0, Lo/ewd;->m:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/ui/main/R$string;->IDS_hw_show_card_pressure_measure_calibrate_grade_item_1:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v2

    goto :goto_0

    .line 623
    :cond_0
    const/4 v0, 0x2

    if-ne v0, p1, :cond_1

    .line 624
    iget-object v0, p0, Lo/ewd;->m:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/ui/main/R$string;->IDS_press_auto_monitor_normal:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v2

    goto :goto_0

    .line 625
    :cond_1
    const/4 v0, 0x3

    if-ne v0, p1, :cond_2

    .line 626
    iget-object v0, p0, Lo/ewd;->m:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/ui/main/R$string;->IDS_hw_show_card_pressure_measure_calibrate_grade_item_3:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v2

    goto :goto_0

    .line 627
    :cond_2
    const/4 v0, 0x4

    if-ne v0, p1, :cond_3

    .line 628
    iget-object v0, p0, Lo/ewd;->m:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/ui/main/R$string;->IDS_hw_pressure_highly:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v2

    .line 630
    :cond_3
    :goto_0
    return-object v2
.end method

.method public i(Z)V
    .locals 0

    .line 234
    iput-boolean p1, p0, Lo/ewd;->A:Z

    .line 235
    return-void
.end method

.method public k([F)I
    .locals 1

    .line 938
    const/16 v0, 0xf

    aget v0, p1, v0

    float-to-int v0, v0

    return v0
.end method

.method public k(Z)V
    .locals 0

    .line 247
    iput-boolean p1, p0, Lo/ewd;->D:Z

    .line 248
    return-void
.end method

.method public k()Z
    .locals 1

    .line 224
    iget-boolean v0, p0, Lo/ewd;->v:Z

    return v0
.end method

.method public l(Z)V
    .locals 0

    .line 279
    iput-boolean p1, p0, Lo/ewd;->F:Z

    .line 280
    return-void
.end method

.method public l()Z
    .locals 1

    .line 282
    iget-boolean v0, p0, Lo/ewd;->F:Z

    return v0
.end method

.method public m()Z
    .locals 1

    .line 243
    iget-boolean v0, p0, Lo/ewd;->C:Z

    return v0
.end method

.method public n(Z)V
    .locals 0

    .line 260
    iput-boolean p1, p0, Lo/ewd;->I:Z

    .line 261
    return-void
.end method

.method public n()Z
    .locals 1

    .line 257
    iget-boolean v0, p0, Lo/ewd;->B:Z

    return v0
.end method

.method public o(Z)V
    .locals 0

    .line 270
    iput-boolean p1, p0, Lo/ewd;->G:Z

    .line 271
    return-void
.end method

.method public o()Z
    .locals 1

    .line 263
    iget-boolean v0, p0, Lo/ewd;->I:Z

    return v0
.end method

.method public p()Z
    .locals 1

    .line 250
    iget-boolean v0, p0, Lo/ewd;->D:Z

    return v0
.end method

.method public q()V
    .locals 5

    .line 418
    invoke-static {}, Lo/ewd;->u()J

    move-result-wide v0

    invoke-direct {p0, v0, v1}, Lo/ewd;->d(J)V

    .line 419
    const-string v0, "PressureMeasureMessage"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "stopTimer mEndMeasureTime = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {p0}, Lo/ewd;->c()J

    move-result-wide v3

    invoke-virtual {v2, v3, v4}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 420
    iget-object v0, p0, Lo/ewd;->aa:Lcom/huawei/hwbasemgr/IBaseResponseCallback;

    if-eqz v0, :cond_0

    .line 421
    invoke-static {}, Lo/aks;->e()Lo/aks;

    move-result-object v0

    iget-object v1, p0, Lo/ewd;->aa:Lcom/huawei/hwbasemgr/IBaseResponseCallback;

    invoke-virtual {v0, v1}, Lo/aks;->s(Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V

    .line 423
    :cond_0
    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Lo/ewd;->h(Z)V

    .line 424
    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Lo/ewd;->i(Z)V

    .line 425
    const-string v0, "PressureMeasureMessage"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, " stop timer!!"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 426
    iget-object v0, p0, Lo/ewd;->N:Lo/ewq;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_1

    .line 427
    iget-object v0, p0, Lo/ewd;->N:Lo/ewq;

    iget-object v0, v0, Lo/ewq;->d:Landroid/os/CountDownTimer;

    if-eqz v0, :cond_1

    .line 428
    iget-object v0, p0, Lo/ewd;->N:Lo/ewq;

    iget-object v0, v0, Lo/ewq;->d:Landroid/os/CountDownTimer;

    invoke-virtual {v0}, Landroid/os/CountDownTimer;->cancel()V

    .line 429
    const/4 v0, 0x0

    iput-object v0, p0, Lo/ewd;->N:Lo/ewq;

    .line 432
    :cond_1
    iget-object v0, p0, Lo/ewd;->L:Lo/ewh;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_2

    .line 433
    iget-object v0, p0, Lo/ewd;->L:Lo/ewh;

    iget-object v0, v0, Lo/ewh;->c:Landroid/os/CountDownTimer;

    if-eqz v0, :cond_2

    .line 434
    iget-object v0, p0, Lo/ewd;->L:Lo/ewh;

    iget-object v0, v0, Lo/ewh;->c:Landroid/os/CountDownTimer;

    invoke-virtual {v0}, Landroid/os/CountDownTimer;->cancel()V

    .line 435
    const/4 v0, 0x0

    iput-object v0, p0, Lo/ewd;->L:Lo/ewh;

    .line 438
    :cond_2
    return-void
.end method

.method public r()V
    .locals 4

    .line 409
    const-string v0, "PressureMeasureMessage"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "removeHelperTimer"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 410
    iget-object v0, p0, Lo/ewd;->N:Lo/ewq;

    if-eqz v0, :cond_0

    .line 411
    iget-object v0, p0, Lo/ewd;->N:Lo/ewq;

    iget-object v0, v0, Lo/ewq;->d:Landroid/os/CountDownTimer;

    if-eqz v0, :cond_0

    .line 412
    iget-object v0, p0, Lo/ewd;->N:Lo/ewq;

    iget-object v0, v0, Lo/ewq;->d:Landroid/os/CountDownTimer;

    invoke-virtual {v0}, Landroid/os/CountDownTimer;->cancel()V

    .line 413
    const/4 v0, 0x0

    iput-object v0, p0, Lo/ewd;->N:Lo/ewq;

    .line 416
    :cond_0
    return-void
.end method

.method public s()Z
    .locals 2

    .line 896
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lo/dde;->d(Landroid/content/Context;)Lo/dde;

    move-result-object v0

    invoke-virtual {v0}, Lo/dde;->d()Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;

    move-result-object v1

    .line 897
    const/4 v0, 0x0

    if-eq v0, v1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public t()V
    .locals 4

    .line 1049
    iget-object v0, p0, Lo/ewd;->L:Lo/ewh;

    if-eqz v0, :cond_1

    .line 1050
    iget-object v0, p0, Lo/ewd;->L:Lo/ewh;

    iget-object v0, v0, Lo/ewh;->c:Landroid/os/CountDownTimer;

    if-eqz v0, :cond_0

    .line 1051
    iget-object v0, p0, Lo/ewd;->L:Lo/ewh;

    iget-object v0, v0, Lo/ewh;->c:Landroid/os/CountDownTimer;

    invoke-virtual {v0}, Landroid/os/CountDownTimer;->cancel()V

    .line 1052
    :cond_0
    const-string v0, "PressureMeasureMessage"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "helperGameOver == null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1053
    const/4 v0, 0x0

    iput-object v0, p0, Lo/ewd;->L:Lo/ewh;

    .line 1055
    :cond_1
    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lo/ewd;->c(I)V

    .line 1056
    const-string v0, "PressureMeasureMessage"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "Anything is reset!!"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1057
    iget-object v0, p0, Lo/ewd;->N:Lo/ewq;

    invoke-direct {p0, v0}, Lo/ewd;->e(Lo/ewq;)V

    .line 1058
    iget-object v0, p0, Lo/ewd;->L:Lo/ewh;

    invoke-direct {p0, v0}, Lo/ewd;->e(Lo/ewh;)V

    .line 1059
    invoke-direct {p0}, Lo/ewd;->B()Z

    move-result v0

    if-nez v0, :cond_2

    .line 1060
    invoke-static {}, Lo/aks;->e()Lo/aks;

    move-result-object v0

    iget-object v1, p0, Lo/ewd;->aa:Lcom/huawei/hwbasemgr/IBaseResponseCallback;

    invoke-virtual {v0, v1}, Lo/aks;->s(Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V

    .line 1062
    :cond_2
    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Lo/ewd;->d(I)V

    .line 1063
    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lo/ewd;->l(Z)V

    .line 1064
    const-wide/16 v0, 0x0

    invoke-direct {p0, v0, v1}, Lo/ewd;->d(J)V

    .line 1065
    const-wide/16 v0, 0x0

    invoke-direct {p0, v0, v1}, Lo/ewd;->b(J)V

    .line 1066
    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lo/ewd;->e(Z)V

    .line 1067
    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Lo/ewd;->a(I)V

    .line 1068
    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lo/ewd;->t(Z)V

    .line 1069
    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lo/ewd;->g(Z)V

    .line 1070
    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lo/ewd;->n(Z)V

    .line 1071
    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lo/ewd;->f(Z)V

    .line 1072
    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lo/ewd;->h(Z)V

    .line 1073
    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lo/ewd;->i(Z)V

    .line 1074
    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lo/ewd;->k(Z)V

    .line 1075
    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lo/ewd;->c(Z)V

    .line 1076
    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lo/ewd;->d(Z)V

    .line 1077
    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lo/ewd;->a(Z)V

    .line 1078
    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lo/ewd;->b(Z)V

    .line 1079
    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lo/ewd;->u(Z)V

    .line 1080
    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lo/ewd;->p(Z)V

    .line 1081
    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lo/ewd;->r(Z)V

    .line 1082
    iget-object v0, p0, Lo/ewd;->b:Ljava/util/List;

    invoke-direct {p0, v0}, Lo/ewd;->e(Ljava/util/List;)V

    .line 1083
    iget-object v0, p0, Lo/ewd;->f:Ljava/util/List;

    invoke-direct {p0, v0}, Lo/ewd;->e(Ljava/util/List;)V

    .line 1084
    iget-object v0, p0, Lo/ewd;->h:Ljava/util/List;

    invoke-direct {p0, v0}, Lo/ewd;->e(Ljava/util/List;)V

    .line 1085
    const/4 v0, 0x0

    iput-object v0, p0, Lo/ewd;->E:Landroid/content/Intent;

    .line 1086
    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lo/ewd;->g([F)V

    .line 1087
    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lo/ewd;->c([F)V

    .line 1088
    const-class v0, Lo/ewh;

    invoke-direct {p0, v0}, Lo/ewd;->a(Ljava/lang/Class;)V

    .line 1089
    const-class v0, Lo/ewq;

    invoke-direct {p0, v0}, Lo/ewd;->a(Ljava/lang/Class;)V

    .line 1090
    invoke-static {}, Lo/ewn;->i()Lo/ewn;

    move-result-object v0

    invoke-virtual {v0}, Lo/ewn;->q()V

    .line 1091
    return-void
.end method

.method public v()Lcom/huawei/ui/main/stories/fitness/activity/pressurecalibrate/fragment/PressureCalibrateQuestionActivity;
    .locals 1

    .line 1248
    iget-object v0, p0, Lo/ewd;->ah:Lcom/huawei/ui/main/stories/fitness/activity/pressurecalibrate/fragment/PressureCalibrateQuestionActivity;

    return-object v0
.end method

.method public w()Z
    .locals 4

    .line 1256
    const-string v0, "PressureMeasureMessage"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "getIsDataStoredSuccessed="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-boolean v3, p0, Lo/ewd;->af:Z

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1257
    iget-boolean v0, p0, Lo/ewd;->af:Z

    return v0
.end method

.method public x()V
    .locals 4

    .line 1098
    const/4 v0, 0x4

    invoke-virtual {p0, v0}, Lo/ewd;->g(I)V

    .line 1099
    invoke-direct {p0}, Lo/ewd;->B()Z

    move-result v0

    if-nez v0, :cond_0

    .line 1100
    invoke-static {}, Lo/aks;->e()Lo/aks;

    move-result-object v0

    iget-object v1, p0, Lo/ewd;->aa:Lcom/huawei/hwbasemgr/IBaseResponseCallback;

    invoke-virtual {v0, v1}, Lo/aks;->s(Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V

    .line 1102
    :cond_0
    iget-object v0, p0, Lo/ewd;->N:Lo/ewq;

    invoke-direct {p0, v0}, Lo/ewd;->e(Lo/ewq;)V

    .line 1103
    iget-object v0, p0, Lo/ewd;->L:Lo/ewh;

    invoke-direct {p0, v0}, Lo/ewd;->e(Lo/ewh;)V

    .line 1104
    const-class v0, Lo/ewh;

    invoke-direct {p0, v0}, Lo/ewd;->a(Ljava/lang/Class;)V

    .line 1105
    const-class v0, Lo/ewq;

    invoke-direct {p0, v0}, Lo/ewd;->a(Ljava/lang/Class;)V

    .line 1106
    const-string v0, "PressureMeasureMessage"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "stopAllTimer"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1107
    return-void
.end method

.method public z()V
    .locals 4

    .line 1207
    const-string v0, "PressureMeasureMessage"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "registerPeriodRRIEntityCallBack()"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1208
    invoke-static {}, Lcom/huawei/hwservicesmgr/remote/HWDevicePeriodRRIFileManager;->getmInstance()Lcom/huawei/hwservicesmgr/remote/HWDevicePeriodRRIFileManager;

    move-result-object v0

    iget-object v1, p0, Lo/ewd;->ad:Lcom/huawei/hwbasemgr/IBaseResponseCallback;

    invoke-virtual {v0, v1}, Lcom/huawei/hwservicesmgr/remote/HWDevicePeriodRRIFileManager;->registerCallback(Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V

    .line 1209
    return-void
.end method
