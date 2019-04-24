.class Lo/dly$c;
.super Lo/dmd;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo/dly;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = "c"
.end annotation


# instance fields
.field final synthetic d:Lo/dly;


# direct methods
.method private constructor <init>(Lo/dly;)V
    .locals 0

    .line 226
    iput-object p1, p0, Lo/dly$c;->d:Lo/dly;

    invoke-direct {p0}, Lo/dmd;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lo/dly;Lo/dly$2;)V
    .locals 0

    .line 226
    invoke-direct {p0, p1}, Lo/dly$c;-><init>(Lo/dly;)V

    return-void
.end method


# virtual methods
.method protected d(ILjava/lang/Object;)Z
    .locals 6

    .line 230
    const-string v0, "SMART_WeightSmarterHelper"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "upLoadWeightGoalToCloud err_code = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 231
    const/4 v0, 0x0

    if-ne v0, p1, :cond_0

    const/4 v5, 0x1

    goto :goto_0

    :cond_0
    const/4 v5, 0x0

    .line 232
    :goto_0
    if-eqz v5, :cond_1

    .line 234
    iget-object v0, p0, Lo/dly$c;->d:Lo/dly;

    iget-object v0, v0, Lo/dly;->e:Landroid/content/Context;

    const/16 v1, 0x2716

    invoke-static {v1}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v1

    const-string v2, "health_last_up_cloud_weight_goal_time"

    .line 235
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v3

    invoke-static {v3, v4}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object v3

    new-instance v4, Lo/dcy;

    invoke-direct {v4}, Lo/dcy;-><init>()V

    .line 234
    invoke-static {v0, v1, v2, v3, v4}, Lo/dct;->e(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lo/dcy;)I

    .line 237
    :cond_1
    return v5
.end method

.method protected d(Ljava/lang/Object;)Z
    .locals 1

    .line 242
    if-eqz p1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method protected e(Ljava/lang/Object;)V
    .locals 0

    .line 248
    return-void
.end method
