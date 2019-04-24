.class public Lcom/huawei/ui/main/stories/fitness/activity/stressgame/services/StressGameBindService;
.super Landroid/app/Service;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/huawei/ui/main/stories/fitness/activity/stressgame/services/StressGameBindService$c;,
        Lcom/huawei/ui/main/stories/fitness/activity/stressgame/services/StressGameBindService$d;,
        Lcom/huawei/ui/main/stories/fitness/activity/stressgame/services/StressGameBindService$a;,
        Lcom/huawei/ui/main/stories/fitness/activity/stressgame/services/StressGameBindService$b;,
        Lcom/huawei/ui/main/stories/fitness/activity/stressgame/services/StressGameBindService$e;
    }
.end annotation


# static fields
.field private static a:I

.field private static b:Ljava/lang/String;

.field private static h:I


# instance fields
.field private c:I

.field private d:I

.field private e:I

.field private f:[F

.field private g:I

.field private i:Ljava/util/Timer;

.field private k:Ljava/util/TimerTask;

.field private l:Ljava/lang/String;

.field private m:I

.field private n:I

.field private o:[S

.field private p:[B

.field private q:Z

.field private r:J

.field private s:Lcom/huawei/ui/main/stories/fitness/activity/stressgame/services/StressGameBindService$d;

.field private t:J

.field private u:Lcom/huawei/ui/main/stories/fitness/activity/stressgame/services/StressGameBindService$e;

.field private w:Lo/exb;

.field private x:Lcom/huawei/ui/main/stories/fitness/activity/stressgame/services/StressGameBindService$b;

.field private y:Lo/eww;

.field private z:Lcom/huawei/ui/main/stories/fitness/activity/stressgame/services/StressGameBindService$a;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 44
    const-string v0, "StressGameBindService"

    sput-object v0, Lcom/huawei/ui/main/stories/fitness/activity/stressgame/services/StressGameBindService;->b:Ljava/lang/String;

    .line 48
    const/4 v0, 0x4

    sput v0, Lcom/huawei/ui/main/stories/fitness/activity/stressgame/services/StressGameBindService;->a:I

    .line 64
    const/16 v0, 0x190

    sput v0, Lcom/huawei/ui/main/stories/fitness/activity/stressgame/services/StressGameBindService;->h:I

    return-void
.end method

.method public constructor <init>()V
    .locals 2

    .line 249
    invoke-direct {p0}, Landroid/app/Service;-><init>()V

    .line 50
    sget v0, Lcom/huawei/ui/main/stories/fitness/activity/stressgame/services/StressGameBindService;->a:I

    mul-int/lit16 v0, v0, 0x3e8

    iput v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/stressgame/services/StressGameBindService;->d:I

    .line 62
    const/16 v0, 0xc8

    iput v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/stressgame/services/StressGameBindService;->c:I

    .line 63
    const/16 v0, 0x12c

    iput v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/stressgame/services/StressGameBindService;->e:I

    .line 70
    const/4 v0, 0x0

    iput v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/stressgame/services/StressGameBindService;->g:I

    .line 73
    const/16 v0, 0x2b

    new-array v0, v0, [F

    iput-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/stressgame/services/StressGameBindService;->f:[F

    .line 75
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/stressgame/services/StressGameBindService;->l:Ljava/lang/String;

    .line 76
    const/4 v0, 0x0

    iput v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/stressgame/services/StressGameBindService;->m:I

    .line 77
    const/16 v0, 0xe

    new-array v0, v0, [S

    iput-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/stressgame/services/StressGameBindService;->o:[S

    .line 78
    const/16 v0, 0xe

    new-array v0, v0, [B

    iput-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/stressgame/services/StressGameBindService;->p:[B

    .line 81
    const/4 v0, 0x0

    iput v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/stressgame/services/StressGameBindService;->n:I

    .line 84
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/stressgame/services/StressGameBindService;->q:Z

    .line 87
    new-instance v0, Lcom/huawei/ui/main/stories/fitness/activity/stressgame/services/StressGameBindService$e;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Lcom/huawei/ui/main/stories/fitness/activity/stressgame/services/StressGameBindService$e;-><init>(Lcom/huawei/ui/main/stories/fitness/activity/stressgame/services/StressGameBindService;Lcom/huawei/ui/main/stories/fitness/activity/stressgame/services/StressGameBindService$4;)V

    iput-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/stressgame/services/StressGameBindService;->u:Lcom/huawei/ui/main/stories/fitness/activity/stressgame/services/StressGameBindService$e;

    .line 135
    new-instance v0, Lcom/huawei/ui/main/stories/fitness/activity/stressgame/services/StressGameBindService$b;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Lcom/huawei/ui/main/stories/fitness/activity/stressgame/services/StressGameBindService$b;-><init>(Lcom/huawei/ui/main/stories/fitness/activity/stressgame/services/StressGameBindService;Lcom/huawei/ui/main/stories/fitness/activity/stressgame/services/StressGameBindService$4;)V

    iput-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/stressgame/services/StressGameBindService;->x:Lcom/huawei/ui/main/stories/fitness/activity/stressgame/services/StressGameBindService$b;

    .line 173
    new-instance v0, Lcom/huawei/ui/main/stories/fitness/activity/stressgame/services/StressGameBindService$a;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Lcom/huawei/ui/main/stories/fitness/activity/stressgame/services/StressGameBindService$a;-><init>(Lcom/huawei/ui/main/stories/fitness/activity/stressgame/services/StressGameBindService;Lcom/huawei/ui/main/stories/fitness/activity/stressgame/services/StressGameBindService$4;)V

    iput-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/stressgame/services/StressGameBindService;->z:Lcom/huawei/ui/main/stories/fitness/activity/stressgame/services/StressGameBindService$a;

    .line 251
    return-void
.end method

.method static synthetic a(Lcom/huawei/ui/main/stories/fitness/activity/stressgame/services/StressGameBindService;)V
    .locals 0

    .line 43
    invoke-direct {p0}, Lcom/huawei/ui/main/stories/fitness/activity/stressgame/services/StressGameBindService;->g()V

    return-void
.end method

.method static synthetic b()I
    .locals 1

    .line 43
    sget v0, Lcom/huawei/ui/main/stories/fitness/activity/stressgame/services/StressGameBindService;->a:I

    return v0
.end method

.method static synthetic b(Lcom/huawei/ui/main/stories/fitness/activity/stressgame/services/StressGameBindService;)I
    .locals 2

    .line 43
    iget v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/stressgame/services/StressGameBindService;->n:I

    add-int/lit8 v1, v0, 0x1

    iput v1, p0, Lcom/huawei/ui/main/stories/fitness/activity/stressgame/services/StressGameBindService;->n:I

    return v0
.end method

.method static synthetic b(Lcom/huawei/ui/main/stories/fitness/activity/stressgame/services/StressGameBindService;JJ)Z
    .locals 1

    .line 43
    invoke-direct {p0, p1, p2, p3, p4}, Lcom/huawei/ui/main/stories/fitness/activity/stressgame/services/StressGameBindService;->e(JJ)Z

    move-result v0

    return v0
.end method

.method static synthetic c()I
    .locals 1

    .line 43
    sget v0, Lcom/huawei/ui/main/stories/fitness/activity/stressgame/services/StressGameBindService;->h:I

    return v0
.end method

.method static synthetic c(Lcom/huawei/ui/main/stories/fitness/activity/stressgame/services/StressGameBindService;)I
    .locals 1

    .line 43
    iget v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/stressgame/services/StressGameBindService;->n:I

    return v0
.end method

.method static synthetic c(Lcom/huawei/ui/main/stories/fitness/activity/stressgame/services/StressGameBindService;J)J
    .locals 0

    .line 43
    iput-wide p1, p0, Lcom/huawei/ui/main/stories/fitness/activity/stressgame/services/StressGameBindService;->t:J

    return-wide p1
.end method

.method private c(Ljava/lang/String;[S[B)V
    .locals 7

    .line 703
    const/4 v0, 0x0

    iput v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/stressgame/services/StressGameBindService;->m:I

    .line 704
    const/4 v0, 0x0

    if-eq v0, p1, :cond_2

    .line 707
    :try_start_0
    new-instance v4, Lorg/json/JSONObject;

    invoke-direct {v4, p1}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    .line 708
    const-string v0, "rri_list"

    invoke-virtual {v4, v0}, Lorg/json/JSONObject;->getJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    move-result-object v5

    .line 709
    const/4 v6, 0x0

    :goto_0
    invoke-virtual {v5}, Lorg/json/JSONArray;->length()I

    move-result v0

    if-ge v6, v0, :cond_1

    .line 711
    invoke-virtual {v5, v6}, Lorg/json/JSONArray;->getJSONObject(I)Lorg/json/JSONObject;

    move-result-object v0

    const-string v1, "rri_value"

    invoke-virtual {v0, v1}, Lorg/json/JSONObject;->get(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 713
    iget v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/stressgame/services/StressGameBindService;->m:I

    invoke-virtual {v5, v6}, Lorg/json/JSONArray;->getJSONObject(I)Lorg/json/JSONObject;

    move-result-object v1

    const-string v2, "rri_value"

    invoke-virtual {v1, v2}, Lorg/json/JSONObject;->get(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v1

    invoke-static {v1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Ljava/lang/Short;->valueOf(Ljava/lang/String;)Ljava/lang/Short;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Short;->shortValue()S

    move-result v1

    aput-short v1, p2, v0

    .line 714
    iget v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/stressgame/services/StressGameBindService;->m:I

    invoke-virtual {v5, v6}, Lorg/json/JSONArray;->getJSONObject(I)Lorg/json/JSONObject;

    move-result-object v1

    const-string v2, "rri_sqi"

    invoke-virtual {v1, v2}, Lorg/json/JSONObject;->get(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v1

    invoke-static {v1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Ljava/lang/Byte;->valueOf(Ljava/lang/String;)Ljava/lang/Byte;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Byte;->byteValue()B

    move-result v1

    aput-byte v1, p3, v0

    .line 715
    iget v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/stressgame/services/StressGameBindService;->m:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/stressgame/services/StressGameBindService;->m:I

    .line 716
    sget-object v0, Lcom/huawei/ui/main/stories/fitness/activity/stressgame/services/StressGameBindService;->b:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "getRriAndSqi rriData"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-static {p2}, Ljava/util/Arrays;->toString([S)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 717
    sget-object v0, Lcom/huawei/ui/main/stories/fitness/activity/stressgame/services/StressGameBindService;->b:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "getRriAndSqi dataSize"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget v3, p0, Lcom/huawei/ui/main/stories/fitness/activity/stressgame/services/StressGameBindService;->m:I

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 709
    :cond_0
    add-int/lit8 v6, v6, 0x1

    goto/16 :goto_0

    .line 720
    :cond_1
    sget-object v0, Lcom/huawei/ui/main/stories/fitness/activity/stressgame/services/StressGameBindService;->b:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "rriData"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-static {p2}, Ljava/util/Arrays;->toString([S)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 721
    sget-object v0, Lcom/huawei/ui/main/stories/fitness/activity/stressgame/services/StressGameBindService;->b:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "sqiData"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-static {p3}, Ljava/util/Arrays;->toString([B)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    .line 725
    goto :goto_1

    .line 722
    :catch_0
    move-exception v4

    .line 723
    invoke-virtual {v4}, Lorg/json/JSONException;->printStackTrace()V

    .line 724
    sget-object v0, Lcom/huawei/ui/main/stories/fitness/activity/stressgame/services/StressGameBindService;->b:Ljava/lang/String;

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getRriAndSqi () JSONException = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {v4}, Lorg/json/JSONException;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 725
    goto :goto_1

    .line 727
    :cond_2
    sget-object v0, Lcom/huawei/ui/main/stories/fitness/activity/stressgame/services/StressGameBindService;->b:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "null == heartRateInfos"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 729
    :goto_1
    return-void
.end method

.method static synthetic d()Ljava/lang/String;
    .locals 1

    .line 43
    sget-object v0, Lcom/huawei/ui/main/stories/fitness/activity/stressgame/services/StressGameBindService;->b:Ljava/lang/String;

    return-object v0
.end method

.method static synthetic d(Lcom/huawei/ui/main/stories/fitness/activity/stressgame/services/StressGameBindService;)[B
    .locals 1

    .line 43
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/stressgame/services/StressGameBindService;->p:[B

    return-object v0
.end method

.method static synthetic e(Lcom/huawei/ui/main/stories/fitness/activity/stressgame/services/StressGameBindService;J)J
    .locals 0

    .line 43
    iput-wide p1, p0, Lcom/huawei/ui/main/stories/fitness/activity/stressgame/services/StressGameBindService;->r:J

    return-wide p1
.end method

.method static synthetic e(Lcom/huawei/ui/main/stories/fitness/activity/stressgame/services/StressGameBindService;Ljava/lang/String;[S[B)V
    .locals 0

    .line 43
    invoke-direct {p0, p1, p2, p3}, Lcom/huawei/ui/main/stories/fitness/activity/stressgame/services/StressGameBindService;->c(Ljava/lang/String;[S[B)V

    return-void
.end method

.method private e(JJ)Z
    .locals 7

    .line 533
    sget-object v0, Lcom/huawei/ui/main/stories/fitness/activity/stressgame/services/StressGameBindService;->b:Ljava/lang/String;

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "callBackTime == "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p1, p2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "fourSecondCycleTime =="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p3, p4}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 534
    sget-object v0, Lcom/huawei/ui/main/stories/fitness/activity/stressgame/services/StressGameBindService;->b:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "fourSecondCycleTime - callBackTime "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    sub-long v3, p3, p1

    const-wide/16 v5, 0x3e8

    div-long/2addr v3, v5

    invoke-virtual {v2, v3, v4}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 535
    sget-object v0, Lcom/huawei/ui/main/stories/fitness/activity/stressgame/services/StressGameBindService;->b:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, " enter is12SecondWithoutData"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 536
    sub-long v0, p3, p1

    const-wide/16 v2, 0x3e8

    div-long/2addr v0, v2

    const-wide/16 v2, 0xc

    cmp-long v0, v0, v2

    if-ltz v0, :cond_0

    .line 537
    sget-object v0, Lcom/huawei/ui/main/stories/fitness/activity/stressgame/services/StressGameBindService;->b:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, " enter is12SecondWithoutData return true"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 538
    const/4 v0, 0x1

    return v0

    .line 540
    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method static synthetic e(Lcom/huawei/ui/main/stories/fitness/activity/stressgame/services/StressGameBindService;)[S
    .locals 1

    .line 43
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/stressgame/services/StressGameBindService;->o:[S

    return-object v0
.end method

.method static synthetic f(Lcom/huawei/ui/main/stories/fitness/activity/stressgame/services/StressGameBindService;)Lo/exb;
    .locals 1

    .line 43
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/stressgame/services/StressGameBindService;->w:Lo/exb;

    return-object v0
.end method

.method private f()V
    .locals 4

    .line 568
    sget-object v0, Lcom/huawei/ui/main/stories/fitness/activity/stressgame/services/StressGameBindService;->b:Ljava/lang/String;

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "start emptyArraysAndDatas  callbackCounter == "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget v3, p0, Lcom/huawei/ui/main/stories/fitness/activity/stressgame/services/StressGameBindService;->n:I

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "mHeartRateMeasureTimerCounter"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget v3, p0, Lcom/huawei/ui/main/stories/fitness/activity/stressgame/services/StressGameBindService;->g:I

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 569
    const/4 v0, 0x0

    iput v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/stressgame/services/StressGameBindService;->n:I

    .line 570
    const/4 v0, 0x0

    iput v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/stressgame/services/StressGameBindService;->g:I

    .line 571
    const-wide/16 v0, 0x0

    iput-wide v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/stressgame/services/StressGameBindService;->r:J

    .line 572
    const-wide/16 v0, 0x0

    iput-wide v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/stressgame/services/StressGameBindService;->t:J

    .line 573
    sget-object v0, Lcom/huawei/ui/main/stories/fitness/activity/stressgame/services/StressGameBindService;->b:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, " end emptyArraysAndDatas end mHeartRateMeasureTimerCounter"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget v3, p0, Lcom/huawei/ui/main/stories/fitness/activity/stressgame/services/StressGameBindService;->g:I

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 574
    return-void
.end method

.method static synthetic g(Lcom/huawei/ui/main/stories/fitness/activity/stressgame/services/StressGameBindService;)I
    .locals 2

    .line 43
    iget v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/stressgame/services/StressGameBindService;->g:I

    add-int/lit8 v1, v0, 0x1

    iput v1, p0, Lcom/huawei/ui/main/stories/fitness/activity/stressgame/services/StressGameBindService;->g:I

    return v0
.end method

.method private g()V
    .locals 7

    .line 454
    sget-object v0, Lcom/huawei/ui/main/stories/fitness/activity/stressgame/services/StressGameBindService;->b:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "\u7ed9\u7b97\u6cd5\u4e4b\u524d\u7684 rriData  == "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lcom/huawei/ui/main/stories/fitness/activity/stressgame/services/StressGameBindService;->o:[S

    invoke-static {v3}, Ljava/util/Arrays;->toString([S)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 455
    sget-object v0, Lcom/huawei/ui/main/stories/fitness/activity/stressgame/services/StressGameBindService;->b:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "\u7ed9\u7b97\u6cd5\u4e4b\u524d\u7684 sqiData  == "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lcom/huawei/ui/main/stories/fitness/activity/stressgame/services/StressGameBindService;->p:[B

    invoke-static {v3}, Ljava/util/Arrays;->toString([B)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 456
    iget v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/stressgame/services/StressGameBindService;->m:I

    new-array v4, v0, [S

    .line 457
    iget v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/stressgame/services/StressGameBindService;->m:I

    new-array v5, v0, [B

    .line 458
    const/4 v6, 0x0

    :goto_0
    iget v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/stressgame/services/StressGameBindService;->m:I

    if-ge v6, v0, :cond_0

    .line 459
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/stressgame/services/StressGameBindService;->o:[S

    aget-short v0, v0, v6

    aput-short v0, v4, v6

    .line 460
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/stressgame/services/StressGameBindService;->p:[B

    aget-byte v0, v0, v6

    aput-byte v0, v5, v6

    .line 458
    add-int/lit8 v6, v6, 0x1

    goto :goto_0

    .line 462
    :cond_0
    sget-object v0, Lcom/huawei/ui/main/stories/fitness/activity/stressgame/services/StressGameBindService;->b:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "sendDatatoBIOAndCallbackHtml() callbackCounter  == "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget v3, p0, Lcom/huawei/ui/main/stories/fitness/activity/stressgame/services/StressGameBindService;->n:I

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 464
    sget-object v0, Lcom/huawei/ui/main/stories/fitness/activity/stressgame/services/StressGameBindService;->b:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "rriForAlg_test[]  == "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-static {v4}, Ljava/util/Arrays;->toString([S)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 465
    sget-object v0, Lcom/huawei/ui/main/stories/fitness/activity/stressgame/services/StressGameBindService;->b:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "sqiForAlg_test[]  == "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-static {v5}, Ljava/util/Arrays;->toString([B)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 468
    sget-object v0, Lcom/huawei/ui/main/stories/fitness/activity/stressgame/services/StressGameBindService;->b:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "dataSize  == "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget v3, p0, Lcom/huawei/ui/main/stories/fitness/activity/stressgame/services/StressGameBindService;->m:I

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 469
    sget-object v0, Lcom/huawei/ui/main/stories/fitness/activity/stressgame/services/StressGameBindService;->b:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "BIO mHeartRateMeasureTimerCounter == "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget v3, p0, Lcom/huawei/ui/main/stories/fitness/activity/stressgame/services/StressGameBindService;->g:I

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 475
    invoke-static {}, Lcom/huawei/ui/main/stories/fitness/activity/stressgame/algorithm/BIO;->c()Lcom/huawei/ui/main/stories/fitness/activity/stressgame/algorithm/BIO;

    iget v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/stressgame/services/StressGameBindService;->m:I

    iget v1, p0, Lcom/huawei/ui/main/stories/fitness/activity/stressgame/services/StressGameBindService;->n:I

    const/16 v2, 0xb4

    invoke-static {v4, v5, v0, v2, v1}, Lcom/huawei/ui/main/stories/fitness/activity/stressgame/algorithm/BIO;->bioFeedbackAlgorithm([S[BIII)[F

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/stressgame/services/StressGameBindService;->f:[F

    .line 477
    sget-object v0, Lcom/huawei/ui/main/stories/fitness/activity/stressgame/services/StressGameBindService;->b:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "mHeartRateCameraAlgResults"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lcom/huawei/ui/main/stories/fitness/activity/stressgame/services/StressGameBindService;->f:[F

    invoke-static {v3}, Ljava/util/Arrays;->toString([F)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 481
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/stressgame/services/StressGameBindService;->w:Lo/exb;

    if-eqz v0, :cond_2

    .line 483
    :try_start_0
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/stressgame/services/StressGameBindService;->f:[F

    array-length v0, v0

    const/16 v1, 0x1c

    if-lt v0, v1, :cond_1

    .line 484
    sget-object v0, Lcom/huawei/ui/main/stories/fitness/activity/stressgame/services/StressGameBindService;->b:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "stressGameBindCallback!=null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 485
    new-instance v6, Lorg/json/JSONObject;

    invoke-direct {v6}, Lorg/json/JSONObject;-><init>()V

    .line 486
    const-string v0, "BreathTrainReturnFlag"

    iget-object v1, p0, Lcom/huawei/ui/main/stories/fitness/activity/stressgame/services/StressGameBindService;->f:[F

    const/4 v2, 0x0

    aget v1, v1, v2

    float-to-double v1, v1

    invoke-virtual {v6, v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;D)Lorg/json/JSONObject;

    .line 487
    const-string v0, "Balance"

    iget-object v1, p0, Lcom/huawei/ui/main/stories/fitness/activity/stressgame/services/StressGameBindService;->f:[F

    const/4 v2, 0x1

    aget v1, v1, v2

    float-to-double v1, v1

    invoke-virtual {v6, v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;D)Lorg/json/JSONObject;

    .line 488
    const-string v0, "BreGrade"

    iget-object v1, p0, Lcom/huawei/ui/main/stories/fitness/activity/stressgame/services/StressGameBindService;->f:[F

    const/4 v2, 0x2

    aget v1, v1, v2

    float-to-double v1, v1

    invoke-virtual {v6, v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;D)Lorg/json/JSONObject;

    .line 489
    const-string v0, "Score"

    iget-object v1, p0, Lcom/huawei/ui/main/stories/fitness/activity/stressgame/services/StressGameBindService;->f:[F

    const/4 v2, 0x3

    aget v1, v1, v2

    float-to-double v1, v1

    invoke-virtual {v6, v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;D)Lorg/json/JSONObject;

    .line 490
    const-string v0, "SuccessRetFlag"

    iget-object v1, p0, Lcom/huawei/ui/main/stories/fitness/activity/stressgame/services/StressGameBindService;->f:[F

    const/4 v2, 0x4

    aget v1, v1, v2

    float-to-double v1, v1

    invoke-virtual {v6, v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;D)Lorg/json/JSONObject;

    .line 491
    const-string v0, "mForwardState"

    iget-object v1, p0, Lcom/huawei/ui/main/stories/fitness/activity/stressgame/services/StressGameBindService;->f:[F

    const/4 v2, 0x5

    aget v1, v1, v2

    float-to-double v1, v1

    invoke-virtual {v6, v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;D)Lorg/json/JSONObject;

    .line 492
    const-string v0, "mEnergyValue"

    iget-object v1, p0, Lcom/huawei/ui/main/stories/fitness/activity/stressgame/services/StressGameBindService;->f:[F

    const/4 v2, 0x6

    aget v1, v1, v2

    float-to-double v1, v1

    invoke-virtual {v6, v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;D)Lorg/json/JSONObject;

    .line 493
    const-string v0, "BubbleChartRetFlag"

    iget-object v1, p0, Lcom/huawei/ui/main/stories/fitness/activity/stressgame/services/StressGameBindService;->f:[F

    const/4 v2, 0x7

    aget v1, v1, v2

    float-to-double v1, v1

    invoke-virtual {v6, v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;D)Lorg/json/JSONObject;

    .line 494
    const-string v0, "SubZoneColor"

    iget-object v1, p0, Lcom/huawei/ui/main/stories/fitness/activity/stressgame/services/StressGameBindService;->f:[F

    const/16 v2, 0x8

    aget v1, v1, v2

    float-to-double v1, v1

    invoke-virtual {v6, v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;D)Lorg/json/JSONObject;

    .line 495
    const-string v0, "Height"

    iget-object v1, p0, Lcom/huawei/ui/main/stories/fitness/activity/stressgame/services/StressGameBindService;->f:[F

    const/16 v2, 0x9

    aget v1, v1, v2

    float-to-double v1, v1

    invoke-virtual {v6, v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;D)Lorg/json/JSONObject;

    .line 496
    const-string v0, "Radius"

    iget-object v1, p0, Lcom/huawei/ui/main/stories/fitness/activity/stressgame/services/StressGameBindService;->f:[F

    const/16 v2, 0xa

    aget v1, v1, v2

    float-to-double v1, v1

    invoke-virtual {v6, v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;D)Lorg/json/JSONObject;

    .line 497
    const-string v0, "DisplayResultFlag"

    iget-object v1, p0, Lcom/huawei/ui/main/stories/fitness/activity/stressgame/services/StressGameBindService;->f:[F

    const/16 v2, 0xb

    aget v1, v1, v2

    float-to-double v1, v1

    invoke-virtual {v6, v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;D)Lorg/json/JSONObject;

    .line 498
    const-string v0, "calm"

    iget-object v1, p0, Lcom/huawei/ui/main/stories/fitness/activity/stressgame/services/StressGameBindService;->f:[F

    const/16 v2, 0xc

    aget v1, v1, v2

    float-to-double v1, v1

    invoke-virtual {v6, v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;D)Lorg/json/JSONObject;

    .line 499
    const-string v0, "control"

    iget-object v1, p0, Lcom/huawei/ui/main/stories/fitness/activity/stressgame/services/StressGameBindService;->f:[F

    const/16 v2, 0xd

    aget v1, v1, v2

    float-to-double v1, v1

    invoke-virtual {v6, v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;D)Lorg/json/JSONObject;

    .line 500
    const-string v0, "fluency"

    iget-object v1, p0, Lcom/huawei/ui/main/stories/fitness/activity/stressgame/services/StressGameBindService;->f:[F

    const/16 v2, 0xe

    aget v1, v1, v2

    float-to-double v1, v1

    invoke-virtual {v6, v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;D)Lorg/json/JSONObject;

    .line 501
    const-string v0, "stabilization"

    iget-object v1, p0, Lcom/huawei/ui/main/stories/fitness/activity/stressgame/services/StressGameBindService;->f:[F

    const/16 v2, 0xf

    aget v1, v1, v2

    float-to-double v1, v1

    invoke-virtual {v6, v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;D)Lorg/json/JSONObject;

    .line 502
    const-string v0, "resist"

    iget-object v1, p0, Lcom/huawei/ui/main/stories/fitness/activity/stressgame/services/StressGameBindService;->f:[F

    const/16 v2, 0x10

    aget v1, v1, v2

    float-to-double v1, v1

    invoke-virtual {v6, v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;D)Lorg/json/JSONObject;

    .line 503
    const-string v0, "GoodPercent"

    iget-object v1, p0, Lcom/huawei/ui/main/stories/fitness/activity/stressgame/services/StressGameBindService;->f:[F

    const/16 v2, 0x11

    aget v1, v1, v2

    float-to-double v1, v1

    invoke-virtual {v6, v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;D)Lorg/json/JSONObject;

    .line 504
    const-string v0, "CommonPercent"

    iget-object v1, p0, Lcom/huawei/ui/main/stories/fitness/activity/stressgame/services/StressGameBindService;->f:[F

    const/16 v2, 0x12

    aget v1, v1, v2

    float-to-double v1, v1

    invoke-virtual {v6, v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;D)Lorg/json/JSONObject;

    .line 505
    const-string v0, "BadPercent"

    iget-object v1, p0, Lcom/huawei/ui/main/stories/fitness/activity/stressgame/services/StressGameBindService;->f:[F

    const/16 v2, 0x13

    aget v1, v1, v2

    float-to-double v1, v1

    invoke-virtual {v6, v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;D)Lorg/json/JSONObject;

    .line 506
    const-string v0, "mScore"

    iget-object v1, p0, Lcom/huawei/ui/main/stories/fitness/activity/stressgame/services/StressGameBindService;->f:[F

    const/16 v2, 0x14

    aget v1, v1, v2

    float-to-double v1, v1

    invoke-virtual {v6, v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;D)Lorg/json/JSONObject;

    .line 507
    const-string v0, "mGrade"

    iget-object v1, p0, Lcom/huawei/ui/main/stories/fitness/activity/stressgame/services/StressGameBindService;->f:[F

    const/16 v2, 0x15

    aget v1, v1, v2

    float-to-double v1, v1

    invoke-virtual {v6, v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;D)Lorg/json/JSONObject;

    .line 508
    const-string v0, "MaxHeartRate"

    iget-object v1, p0, Lcom/huawei/ui/main/stories/fitness/activity/stressgame/services/StressGameBindService;->f:[F

    const/16 v2, 0x16

    aget v1, v1, v2

    float-to-double v1, v1

    invoke-virtual {v6, v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;D)Lorg/json/JSONObject;

    .line 509
    const-string v0, "MeanHeartRate"

    iget-object v1, p0, Lcom/huawei/ui/main/stories/fitness/activity/stressgame/services/StressGameBindService;->f:[F

    const/16 v2, 0x17

    aget v1, v1, v2

    float-to-double v1, v1

    invoke-virtual {v6, v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;D)Lorg/json/JSONObject;

    .line 510
    const-string v0, "MinHeartRate"

    iget-object v1, p0, Lcom/huawei/ui/main/stories/fitness/activity/stressgame/services/StressGameBindService;->f:[F

    const/16 v2, 0x18

    aget v1, v1, v2

    float-to-double v1, v1

    invoke-virtual {v6, v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;D)Lorg/json/JSONObject;

    .line 511
    const-string v0, "RealTimeRemind"

    iget-object v1, p0, Lcom/huawei/ui/main/stories/fitness/activity/stressgame/services/StressGameBindService;->f:[F

    const/16 v2, 0x19

    aget v1, v1, v2

    float-to-double v1, v1

    invoke-virtual {v6, v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;D)Lorg/json/JSONObject;

    .line 512
    const-string v0, "Algorithm_version"

    iget-object v1, p0, Lcom/huawei/ui/main/stories/fitness/activity/stressgame/services/StressGameBindService;->f:[F

    const/16 v2, 0x1a

    aget v1, v1, v2

    float-to-double v1, v1

    invoke-virtual {v6, v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;D)Lorg/json/JSONObject;

    .line 513
    const-string v0, "variableC"

    iget-object v1, p0, Lcom/huawei/ui/main/stories/fitness/activity/stressgame/services/StressGameBindService;->f:[F

    const/16 v2, 0x1b

    aget v1, v1, v2

    float-to-double v1, v1

    invoke-virtual {v6, v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;D)Lorg/json/JSONObject;

    .line 514
    sget-object v0, Lcom/huawei/ui/main/stories/fitness/activity/stressgame/services/StressGameBindService;->b:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "callback_jsonResult_string  "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v6}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 515
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/stressgame/services/StressGameBindService;->w:Lo/exb;

    invoke-virtual {v6}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v1}, Lo/exb;->a(Ljava/lang/String;)V

    .line 516
    goto :goto_1

    .line 517
    :cond_1
    sget-object v0, Lcom/huawei/ui/main/stories/fitness/activity/stressgame/services/StressGameBindService;->b:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "\u7b97\u6cd5\u5e93\u8fd4\u56de\u6570\u636e\u9519\u8bef"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    .line 521
    :goto_1
    goto :goto_2

    .line 519
    :catch_0
    move-exception v6

    .line 520
    invoke-virtual {v6}, Lorg/json/JSONException;->printStackTrace()V

    .line 524
    :cond_2
    :goto_2
    return-void
.end method

.method private h()V
    .locals 1

    .line 427
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/stressgame/services/StressGameBindService;->i:Ljava/util/Timer;

    if-eqz v0, :cond_0

    .line 428
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/stressgame/services/StressGameBindService;->i:Ljava/util/Timer;

    invoke-virtual {v0}, Ljava/util/Timer;->cancel()V

    .line 429
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/stressgame/services/StressGameBindService;->i:Ljava/util/Timer;

    .line 431
    :cond_0
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/stressgame/services/StressGameBindService;->k:Ljava/util/TimerTask;

    if-eqz v0, :cond_1

    .line 432
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/stressgame/services/StressGameBindService;->k:Ljava/util/TimerTask;

    invoke-virtual {v0}, Ljava/util/TimerTask;->cancel()Z

    .line 433
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/stressgame/services/StressGameBindService;->k:Ljava/util/TimerTask;

    .line 436
    :cond_1
    return-void
.end method

.method static synthetic h(Lcom/huawei/ui/main/stories/fitness/activity/stressgame/services/StressGameBindService;)V
    .locals 0

    .line 43
    invoke-direct {p0}, Lcom/huawei/ui/main/stories/fitness/activity/stressgame/services/StressGameBindService;->k()V

    return-void
.end method

.method private i()V
    .locals 4

    .line 325
    new-instance v3, Landroid/content/IntentFilter;

    const-string v0, "com.huawei.bone.action.CONNECTION_STATE_CHANGED"

    invoke-direct {v3, v0}, Landroid/content/IntentFilter;-><init>(Ljava/lang/String;)V

    .line 326
    const-string v0, "com.huawei.bone.action.CONNECTION_STATE_CHANGED"

    invoke-virtual {v3, v0}, Landroid/content/IntentFilter;->addAction(Ljava/lang/String;)V

    .line 327
    const-string v0, "com.huawei.bone.action.REQUEST_BIND_DEVICE"

    invoke-virtual {v3, v0}, Landroid/content/IntentFilter;->addAction(Ljava/lang/String;)V

    .line 328
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/stressgame/services/StressGameBindService;->x:Lcom/huawei/ui/main/stories/fitness/activity/stressgame/services/StressGameBindService$b;

    sget-object v1, Lo/dac;->a:Ljava/lang/String;

    const/4 v2, 0x0

    invoke-virtual {p0, v0, v3, v1, v2}, Lcom/huawei/ui/main/stories/fitness/activity/stressgame/services/StressGameBindService;->registerReceiver(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;Ljava/lang/String;Landroid/os/Handler;)Landroid/content/Intent;

    .line 329
    return-void
.end method

.method static synthetic i(Lcom/huawei/ui/main/stories/fitness/activity/stressgame/services/StressGameBindService;)Z
    .locals 1

    .line 43
    iget-boolean v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/stressgame/services/StressGameBindService;->q:Z

    return v0
.end method

.method static synthetic k(Lcom/huawei/ui/main/stories/fitness/activity/stressgame/services/StressGameBindService;)Lcom/huawei/ui/main/stories/fitness/activity/stressgame/services/StressGameBindService$e;
    .locals 1

    .line 43
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/stressgame/services/StressGameBindService;->u:Lcom/huawei/ui/main/stories/fitness/activity/stressgame/services/StressGameBindService$e;

    return-object v0
.end method

.method private k()V
    .locals 5

    .line 548
    const/4 v4, 0x0

    :goto_0
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/stressgame/services/StressGameBindService;->o:[S

    array-length v0, v0

    if-ge v4, v0, :cond_0

    .line 549
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/stressgame/services/StressGameBindService;->o:[S

    const/4 v1, 0x0

    aput-short v1, v0, v4

    .line 550
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/stressgame/services/StressGameBindService;->p:[B

    const/4 v1, 0x0

    aput-byte v1, v0, v4

    .line 548
    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    .line 552
    :cond_0
    const/4 v4, 0x0

    :goto_1
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/stressgame/services/StressGameBindService;->f:[F

    array-length v0, v0

    if-ge v4, v0, :cond_1

    .line 553
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/stressgame/services/StressGameBindService;->f:[F

    const/4 v1, 0x0

    aput v1, v0, v4

    .line 552
    add-int/lit8 v4, v4, 0x1

    goto :goto_1

    .line 555
    :cond_1
    const/4 v0, 0x0

    iput v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/stressgame/services/StressGameBindService;->m:I

    .line 557
    sget-object v0, Lcom/huawei/ui/main/stories/fitness/activity/stressgame/services/StressGameBindService;->b:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "resetArrayData dataSize"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget v3, p0, Lcom/huawei/ui/main/stories/fitness/activity/stressgame/services/StressGameBindService;->m:I

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 558
    sget-object v0, Lcom/huawei/ui/main/stories/fitness/activity/stressgame/services/StressGameBindService;->b:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "resetArrayData dataSize"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lcom/huawei/ui/main/stories/fitness/activity/stressgame/services/StressGameBindService;->o:[S

    invoke-static {v3}, Ljava/util/Arrays;->toString([S)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 559
    sget-object v0, Lcom/huawei/ui/main/stories/fitness/activity/stressgame/services/StressGameBindService;->b:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "resetArrayData sqiData"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lcom/huawei/ui/main/stories/fitness/activity/stressgame/services/StressGameBindService;->p:[B

    invoke-static {v3}, Ljava/util/Arrays;->toString([B)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 560
    sget-object v0, Lcom/huawei/ui/main/stories/fitness/activity/stressgame/services/StressGameBindService;->b:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "resetArrayData mHeartRateCameraAlgResults"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lcom/huawei/ui/main/stories/fitness/activity/stressgame/services/StressGameBindService;->f:[F

    invoke-static {v3}, Ljava/util/Arrays;->toString([F)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 561
    return-void
.end method

.method static synthetic l(Lcom/huawei/ui/main/stories/fitness/activity/stressgame/services/StressGameBindService;)I
    .locals 1

    .line 43
    iget v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/stressgame/services/StressGameBindService;->g:I

    return v0
.end method

.method static synthetic m(Lcom/huawei/ui/main/stories/fitness/activity/stressgame/services/StressGameBindService;)Lo/eww;
    .locals 1

    .line 43
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/stressgame/services/StressGameBindService;->y:Lo/eww;

    return-object v0
.end method

.method private m()V
    .locals 4

    .line 733
    new-instance v2, Ljava/text/SimpleDateFormat;

    const-string v0, "yyyyMMdd_HHmmss"

    sget-object v1, Ljava/util/Locale;->ENGLISH:Ljava/util/Locale;

    invoke-direct {v2, v0, v1}, Ljava/text/SimpleDateFormat;-><init>(Ljava/lang/String;Ljava/util/Locale;)V

    .line 734
    new-instance v0, Ljava/util/Date;

    invoke-direct {v0}, Ljava/util/Date;-><init>()V

    invoke-virtual {v2, v0}, Ljava/text/SimpleDateFormat;->format(Ljava/util/Date;)Ljava/lang/String;

    move-result-object v3

    .line 735
    iput-object v3, p0, Lcom/huawei/ui/main/stories/fitness/activity/stressgame/services/StressGameBindService;->l:Ljava/lang/String;

    .line 736
    return-void
.end method

.method static synthetic n(Lcom/huawei/ui/main/stories/fitness/activity/stressgame/services/StressGameBindService;)J
    .locals 2

    .line 43
    iget-wide v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/stressgame/services/StressGameBindService;->r:J

    return-wide v0
.end method

.method static synthetic o(Lcom/huawei/ui/main/stories/fitness/activity/stressgame/services/StressGameBindService;)I
    .locals 1

    .line 43
    iget v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/stressgame/services/StressGameBindService;->m:I

    return v0
.end method

.method static synthetic p(Lcom/huawei/ui/main/stories/fitness/activity/stressgame/services/StressGameBindService;)J
    .locals 2

    .line 43
    iget-wide v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/stressgame/services/StressGameBindService;->t:J

    return-wide v0
.end method

.method static synthetic t(Lcom/huawei/ui/main/stories/fitness/activity/stressgame/services/StressGameBindService;)Lcom/huawei/ui/main/stories/fitness/activity/stressgame/services/StressGameBindService$a;
    .locals 1

    .line 43
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/stressgame/services/StressGameBindService;->z:Lcom/huawei/ui/main/stories/fitness/activity/stressgame/services/StressGameBindService$a;

    return-object v0
.end method


# virtual methods
.method public a()V
    .locals 6

    .line 337
    sget-object v0, Lcom/huawei/ui/main/stories/fitness/activity/stressgame/services/StressGameBindService;->b:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "begin startTimer"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 338
    new-instance v0, Ljava/util/Timer;

    invoke-direct {v0}, Ljava/util/Timer;-><init>()V

    iput-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/stressgame/services/StressGameBindService;->i:Ljava/util/Timer;

    .line 339
    new-instance v0, Lcom/huawei/ui/main/stories/fitness/activity/stressgame/services/StressGameBindService$4;

    invoke-direct {v0, p0}, Lcom/huawei/ui/main/stories/fitness/activity/stressgame/services/StressGameBindService$4;-><init>(Lcom/huawei/ui/main/stories/fitness/activity/stressgame/services/StressGameBindService;)V

    iput-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/stressgame/services/StressGameBindService;->k:Ljava/util/TimerTask;

    .line 408
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/stressgame/services/StressGameBindService;->i:Ljava/util/Timer;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/fitness/activity/stressgame/services/StressGameBindService;->k:Ljava/util/TimerTask;

    const-wide/16 v2, 0x1838

    const-wide/16 v4, 0xfa0

    invoke-virtual/range {v0 .. v5}, Ljava/util/Timer;->schedule(Ljava/util/TimerTask;JJ)V

    .line 409
    return-void
.end method

.method public b(I)V
    .locals 6

    .line 581
    sget-object v0, Lcom/huawei/ui/main/stories/fitness/activity/stressgame/services/StressGameBindService;->b:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "begin openMeasure = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 582
    new-instance v4, Lorg/json/JSONObject;

    invoke-direct {v4}, Lorg/json/JSONObject;-><init>()V

    .line 584
    const-string v0, "status"

    :try_start_0
    invoke-virtual {v4, v0, p1}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    .line 588
    goto :goto_0

    .line 586
    :catch_0
    move-exception v5

    .line 587
    sget-object v0, Lcom/huawei/ui/main/stories/fitness/activity/stressgame/services/StressGameBindService;->b:Ljava/lang/String;

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "openMeasure () JSONException = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {v5}, Lorg/json/JSONException;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 589
    :goto_0
    new-instance v5, Lcom/huawei/ui/main/stories/fitness/activity/stressgame/services/StressGameBindService$c;

    const/4 v0, 0x1

    const/4 v1, 0x0

    invoke-direct {v5, p0, v0, v1}, Lcom/huawei/ui/main/stories/fitness/activity/stressgame/services/StressGameBindService$c;-><init>(Lcom/huawei/ui/main/stories/fitness/activity/stressgame/services/StressGameBindService;ILcom/huawei/ui/main/stories/fitness/activity/stressgame/services/StressGameBindService$4;)V

    .line 590
    invoke-static {}, Lo/aks;->e()Lo/aks;

    move-result-object v0

    invoke-virtual {v0, v4, v5}, Lo/aks;->d(Lorg/json/JSONObject;Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V

    .line 591
    sget-object v0, Lcom/huawei/ui/main/stories/fitness/activity/stressgame/services/StressGameBindService;->b:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "end openMeasure ="

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 592
    return-void
.end method

.method public d(I)V
    .locals 6

    .line 600
    sget-object v0, Lcom/huawei/ui/main/stories/fitness/activity/stressgame/services/StressGameBindService;->b:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "closeMeasure \u5173\u95ed\u6d4b\u91cf"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 601
    new-instance v4, Lorg/json/JSONObject;

    invoke-direct {v4}, Lorg/json/JSONObject;-><init>()V

    .line 603
    const-string v0, "status"

    :try_start_0
    invoke-virtual {v4, v0, p1}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    .line 606
    goto :goto_0

    .line 604
    :catch_0
    move-exception v5

    .line 605
    sget-object v0, Lcom/huawei/ui/main/stories/fitness/activity/stressgame/services/StressGameBindService;->b:Ljava/lang/String;

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "closeMeasure () JSONException = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {v5}, Lorg/json/JSONException;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 607
    :goto_0
    new-instance v5, Lcom/huawei/ui/main/stories/fitness/activity/stressgame/services/StressGameBindService$c;

    const/4 v0, 0x2

    const/4 v1, 0x0

    invoke-direct {v5, p0, v0, v1}, Lcom/huawei/ui/main/stories/fitness/activity/stressgame/services/StressGameBindService$c;-><init>(Lcom/huawei/ui/main/stories/fitness/activity/stressgame/services/StressGameBindService;ILcom/huawei/ui/main/stories/fitness/activity/stressgame/services/StressGameBindService$4;)V

    .line 609
    invoke-static {}, Lo/aks;->e()Lo/aks;

    move-result-object v0

    invoke-virtual {v0, v4, v5}, Lo/aks;->d(Lorg/json/JSONObject;Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V

    .line 610
    return-void
.end method

.method public d(Lo/eww;)V
    .locals 0

    .line 94
    if-eqz p1, :cond_0

    .line 95
    iput-object p1, p0, Lcom/huawei/ui/main/stories/fitness/activity/stressgame/services/StressGameBindService;->y:Lo/eww;

    .line 97
    :cond_0
    return-void
.end method

.method public d(Lo/exb;)V
    .locals 2

    .line 241
    sget-object v0, Lcom/huawei/ui/main/stories/fitness/activity/stressgame/services/StressGameBindService;->b:Ljava/lang/String;

    const-string v1, "this.stressGameBindCallback = callback;"

    invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 242
    iput-object p1, p0, Lcom/huawei/ui/main/stories/fitness/activity/stressgame/services/StressGameBindService;->w:Lo/exb;

    .line 243
    return-void
.end method

.method public e()V
    .locals 4

    .line 416
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/stressgame/services/StressGameBindService;->q:Z

    .line 417
    sget-object v0, Lcom/huawei/ui/main/stories/fitness/activity/stressgame/services/StressGameBindService;->b:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "stopTimer"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 418
    invoke-direct {p0}, Lcom/huawei/ui/main/stories/fitness/activity/stressgame/services/StressGameBindService;->f()V

    .line 419
    invoke-direct {p0}, Lcom/huawei/ui/main/stories/fitness/activity/stressgame/services/StressGameBindService;->k()V

    .line 420
    invoke-direct {p0}, Lcom/huawei/ui/main/stories/fitness/activity/stressgame/services/StressGameBindService;->h()V

    .line 421
    return-void
.end method

.method public onBind(Landroid/content/Intent;)Landroid/os/IBinder;
    .locals 4

    .line 279
    sget-object v0, Lcom/huawei/ui/main/stories/fitness/activity/stressgame/services/StressGameBindService;->b:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "onBind"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 280
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/stressgame/services/StressGameBindService;->s:Lcom/huawei/ui/main/stories/fitness/activity/stressgame/services/StressGameBindService$d;

    return-object v0
.end method

.method public onCreate()V
    .locals 4

    .line 254
    invoke-super {p0}, Landroid/app/Service;->onCreate()V

    .line 255
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/stressgame/services/StressGameBindService;->q:Z

    .line 257
    invoke-direct {p0}, Lcom/huawei/ui/main/stories/fitness/activity/stressgame/services/StressGameBindService;->m()V

    .line 258
    sget-object v0, Lcom/huawei/ui/main/stories/fitness/activity/stressgame/services/StressGameBindService;->b:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "service onCreate"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 259
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/stressgame/services/StressGameBindService;->y:Lo/eww;

    if-eqz v0, :cond_0

    .line 260
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/stressgame/services/StressGameBindService;->y:Lo/eww;

    const/4 v1, 0x0

    invoke-interface {v0, v1}, Lo/eww;->b(Z)V

    .line 261
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/stressgame/services/StressGameBindService;->y:Lo/eww;

    const/4 v1, 0x0

    invoke-interface {v0, v1}, Lo/eww;->d(Z)V

    .line 264
    :cond_0
    sget-object v0, Lcom/huawei/ui/main/stories/fitness/activity/stressgame/services/StressGameBindService;->b:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "service start resetArrayData();"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 265
    invoke-direct {p0}, Lcom/huawei/ui/main/stories/fitness/activity/stressgame/services/StressGameBindService;->k()V

    .line 266
    sget-object v0, Lcom/huawei/ui/main/stories/fitness/activity/stressgame/services/StressGameBindService;->b:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "service start emptyArraysAndDatas();"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 267
    invoke-direct {p0}, Lcom/huawei/ui/main/stories/fitness/activity/stressgame/services/StressGameBindService;->f()V

    .line 268
    sget-object v0, Lcom/huawei/ui/main/stories/fitness/activity/stressgame/services/StressGameBindService;->b:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "service startTimer();"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 269
    invoke-virtual {p0}, Lcom/huawei/ui/main/stories/fitness/activity/stressgame/services/StressGameBindService;->a()V

    .line 270
    invoke-direct {p0}, Lcom/huawei/ui/main/stories/fitness/activity/stressgame/services/StressGameBindService;->i()V

    .line 271
    sget-object v0, Lcom/huawei/ui/main/stories/fitness/activity/stressgame/services/StressGameBindService;->b:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "\u6ce8\u518c\u84dd\u7259\u8fde\u63a5\u76d1\u542c\u5e7f\u64ad;"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 272
    new-instance v0, Lcom/huawei/ui/main/stories/fitness/activity/stressgame/services/StressGameBindService$d;

    invoke-direct {v0, p0}, Lcom/huawei/ui/main/stories/fitness/activity/stressgame/services/StressGameBindService$d;-><init>(Lcom/huawei/ui/main/stories/fitness/activity/stressgame/services/StressGameBindService;)V

    iput-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/stressgame/services/StressGameBindService;->s:Lcom/huawei/ui/main/stories/fitness/activity/stressgame/services/StressGameBindService$d;

    .line 273
    const/4 v0, 0x3

    invoke-virtual {p0, v0}, Lcom/huawei/ui/main/stories/fitness/activity/stressgame/services/StressGameBindService;->b(I)V

    .line 275
    return-void
.end method

.method public onDestroy()V
    .locals 4

    .line 298
    invoke-super {p0}, Landroid/app/Service;->onDestroy()V

    .line 299
    sget-object v0, Lcom/huawei/ui/main/stories/fitness/activity/stressgame/services/StressGameBindService;->b:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "onDestroy"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 300
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/stressgame/services/StressGameBindService;->i:Ljava/util/Timer;

    if-eqz v0, :cond_0

    .line 301
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/stressgame/services/StressGameBindService;->i:Ljava/util/Timer;

    invoke-virtual {v0}, Ljava/util/Timer;->cancel()V

    .line 302
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/stressgame/services/StressGameBindService;->i:Ljava/util/Timer;

    .line 304
    :cond_0
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/stressgame/services/StressGameBindService;->k:Ljava/util/TimerTask;

    if-eqz v0, :cond_1

    .line 305
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/stressgame/services/StressGameBindService;->k:Ljava/util/TimerTask;

    invoke-virtual {v0}, Ljava/util/TimerTask;->cancel()Z

    .line 306
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/stressgame/services/StressGameBindService;->k:Ljava/util/TimerTask;

    .line 308
    :cond_1
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/stressgame/services/StressGameBindService;->y:Lo/eww;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_2

    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/stressgame/services/StressGameBindService;->y:Lo/eww;

    invoke-interface {v0}, Lo/eww;->b()Z

    move-result v0

    if-nez v0, :cond_2

    .line 309
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/stressgame/services/StressGameBindService;->y:Lo/eww;

    const/4 v1, 0x1

    invoke-interface {v0, v1}, Lo/eww;->b(Z)V

    .line 310
    sget-object v0, Lcom/huawei/ui/main/stories/fitness/activity/stressgame/services/StressGameBindService;->b:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "bindService \u9500\u6bc1, closeMeasure(4)"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 312
    const/4 v0, 0x4

    invoke-virtual {p0, v0}, Lcom/huawei/ui/main/stories/fitness/activity/stressgame/services/StressGameBindService;->d(I)V

    .line 316
    :cond_2
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/stressgame/services/StressGameBindService;->x:Lcom/huawei/ui/main/stories/fitness/activity/stressgame/services/StressGameBindService$b;

    invoke-virtual {p0, v0}, Lcom/huawei/ui/main/stories/fitness/activity/stressgame/services/StressGameBindService;->unregisterReceiver(Landroid/content/BroadcastReceiver;)V

    .line 317
    return-void
.end method

.method public onStartCommand(Landroid/content/Intent;II)I
    .locals 4

    .line 291
    invoke-super {p0, p1, p2, p3}, Landroid/app/Service;->onStartCommand(Landroid/content/Intent;II)I

    .line 292
    sget-object v0, Lcom/huawei/ui/main/stories/fitness/activity/stressgame/services/StressGameBindService;->b:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "onStartCommand"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 293
    const/4 v0, 0x2

    return v0
.end method

.method public onUnbind(Landroid/content/Intent;)Z
    .locals 4

    .line 285
    sget-object v0, Lcom/huawei/ui/main/stories/fitness/activity/stressgame/services/StressGameBindService;->b:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "onUnbind"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 286
    invoke-super {p0, p1}, Landroid/app/Service;->onUnbind(Landroid/content/Intent;)Z

    move-result v0

    return v0
.end method
