.class Lo/cbu$c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo/cbu;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = "c"
.end annotation


# instance fields
.field final synthetic e:Lo/cbu;


# direct methods
.method private constructor <init>(Lo/cbu;)V
    .locals 0

    .line 4022
    iput-object p1, p0, Lo/cbu$c;->e:Lo/cbu;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lo/cbu;Lo/cbu$1;)V
    .locals 0

    .line 4022
    invoke-direct {p0, p1}, Lo/cbu$c;-><init>(Lo/cbu;)V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 7

    .line 4027
    :try_start_0
    invoke-static {}, Lo/cbu;->as()Lo/cbu;
    :try_end_0
    .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v0

    const/4 v1, 0x0

    if-ne v1, v0, :cond_0

    .line 4028
    return-void

    .line 4031
    :cond_0
    :try_start_1
    invoke-static {}, Lo/cbu;->as()Lo/cbu;

    move-result-object v0

    invoke-static {v0}, Lo/cbu;->k(Lo/cbu;)I

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_2

    .line 4032
    iget-object v0, p0, Lo/cbu$c;->e:Lo/cbu;

    invoke-static {v0}, Lo/cbu;->I(Lo/cbu;)V

    .line 4034
    iget-object v0, p0, Lo/cbu$c;->e:Lo/cbu;

    invoke-static {v0}, Lo/cbu;->H(Lo/cbu;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 4036
    iget-object v0, p0, Lo/cbu$c;->e:Lo/cbu;

    iget-object v1, p0, Lo/cbu$c;->e:Lo/cbu;

    invoke-static {v1}, Lo/cbu;->E(Lo/cbu;)F

    move-result v1

    invoke-static {v0, v1}, Lo/cbu;->e(Lo/cbu;F)V

    .line 4039
    :cond_1
    invoke-static {}, Lo/cbu;->as()Lo/cbu;

    move-result-object v0

    invoke-virtual {v0}, Lo/cbu;->O()V

    .line 4042
    invoke-static {}, Lo/cbu;->as()Lo/cbu;

    move-result-object v0

    iget-object v1, p0, Lo/cbu$c;->e:Lo/cbu;

    invoke-virtual {v1}, Lo/cbu;->am()Landroid/os/Bundle;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/cbu;->b(Landroid/os/Bundle;)V

    .line 4044
    :cond_2
    iget-object v0, p0, Lo/cbu$c;->e:Lo/cbu;

    invoke-static {v0}, Lo/cbu;->F(Lo/cbu;)I

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_3

    iget-object v0, p0, Lo/cbu$c;->e:Lo/cbu;

    invoke-static {v0}, Lo/cbu;->A(Lo/cbu;)Lo/cbs;

    move-result-object v0

    if-eqz v0, :cond_3

    .line 4045
    iget-object v0, p0, Lo/cbu$c;->e:Lo/cbu;

    invoke-static {v0}, Lo/cbu;->A(Lo/cbu;)Lo/cbs;

    move-result-object v0

    iget-object v1, p0, Lo/cbu$c;->e:Lo/cbu;

    invoke-static {v1}, Lo/cbu;->M(Lo/cbu;)F

    move-result v1

    iget-object v2, p0, Lo/cbu$c;->e:Lo/cbu;

    invoke-static {v2}, Lo/cbu;->e(Lo/cbu;)I

    move-result v2

    invoke-virtual {v0, v1, v2}, Lo/cbs;->d(FI)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 4046
    iget-object v0, p0, Lo/cbu$c;->e:Lo/cbu;

    invoke-virtual {v0}, Lo/cbu;->w()V

    .line 4051
    :cond_3
    iget-object v0, p0, Lo/cbu$c;->e:Lo/cbu;

    invoke-static {v0}, Lo/cbu;->N(Lo/cbu;)Z
    :try_end_1
    .catch Ljava/lang/Throwable; {:try_start_1 .. :try_end_1} :catch_0

    move-result v0

    if-nez v0, :cond_4

    .line 4052
    return-void

    .line 4055
    :cond_4
    :try_start_2
    invoke-static {}, Lo/cbu;->as()Lo/cbu;

    move-result-object v0

    invoke-static {v0}, Lo/cbu;->k(Lo/cbu;)I

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_6

    .line 4056
    iget-object v0, p0, Lo/cbu$c;->e:Lo/cbu;

    invoke-static {v0}, Lo/cbu;->K(Lo/cbu;)Lo/cey;

    move-result-object v0

    if-eqz v0, :cond_5

    iget-object v0, p0, Lo/cbu$c;->e:Lo/cbu;

    invoke-static {v0}, Lo/cbu;->K(Lo/cbu;)Lo/cey;

    move-result-object v0

    invoke-virtual {v0}, Lo/cey;->c()I

    move-result v0

    if-nez v0, :cond_5

    .line 4058
    invoke-static {}, Lo/cbu;->as()Lo/cbu;

    move-result-object v0

    invoke-virtual {v0}, Lo/cbu;->N()V

    .line 4061
    :cond_5
    invoke-static {}, Lo/cbu;->as()Lo/cbu;

    move-result-object v0

    invoke-virtual {v0}, Lo/cbu;->A()V

    .line 4062
    iget-object v0, p0, Lo/cbu$c;->e:Lo/cbu;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lo/cbu;->c(F)V

    .line 4064
    iget-object v0, p0, Lo/cbu$c;->e:Lo/cbu;

    invoke-virtual {v0}, Lo/cbu;->L()V

    .line 4065
    const-string v0, "Track_SportManager"

    const/16 v1, 0xa

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "time = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v2

    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    const-string v2, " mTotalDistance = "

    const/4 v3, 0x2

    aput-object v2, v1, v3

    iget-object v2, p0, Lo/cbu$c;->e:Lo/cbu;

    invoke-static {v2}, Lo/cbu;->E(Lo/cbu;)F

    move-result v2

    invoke-static {v2}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v2

    const/4 v3, 0x3

    aput-object v2, v1, v3

    const-string v2, " duration = "

    const/4 v3, 0x4

    aput-object v2, v1, v3

    iget-object v2, p0, Lo/cbu$c;->e:Lo/cbu;

    .line 4066
    invoke-virtual {v2}, Lo/cbu;->n()J

    move-result-wide v2

    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    const/4 v3, 0x5

    aput-object v2, v1, v3

    const-string v2, " GpsSpeed = "

    const/4 v3, 0x6

    aput-object v2, v1, v3

    iget-object v2, p0, Lo/cbu$c;->e:Lo/cbu;

    invoke-static {v2}, Lo/cbu;->L(Lo/cbu;)F

    move-result v2

    invoke-static {v2}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v2

    const/4 v3, 0x7

    aput-object v2, v1, v3

    const-string v2, " mCurrentSpeed 20s= "

    const/16 v3, 0x8

    aput-object v2, v1, v3

    iget-object v2, p0, Lo/cbu$c;->e:Lo/cbu;

    invoke-static {v2}, Lo/cbu;->v(Lo/cbu;)Lo/cbw;

    move-result-object v2

    invoke-virtual {v2}, Lo/cbw;->i()F

    move-result v2

    float-to-double v2, v2

    const-wide v4, 0x400ccccccccccccdL    # 3.6

    div-double/2addr v2, v4

    invoke-static {v2, v3}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v2

    const/16 v3, 0x9

    aput-object v2, v1, v3

    .line 4065
    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    goto :goto_0

    .line 4068
    :cond_6
    invoke-static {}, Lo/cbu;->as()Lo/cbu;

    move-result-object v0

    invoke-static {v0}, Lo/cbu;->k(Lo/cbu;)I

    move-result v0

    const/4 v1, 0x2

    if-ne v0, v1, :cond_7

    .line 4070
    invoke-static {}, Lo/cbu;->as()Lo/cbu;

    move-result-object v0

    invoke-static {v0}, Lo/cbu;->J(Lo/cbu;)V
    :try_end_2
    .catch Ljava/lang/Throwable; {:try_start_2 .. :try_end_2} :catch_0

    .line 4075
    :cond_7
    :goto_0
    goto :goto_1

    .line 4073
    :catch_0
    move-exception v6

    .line 4074
    const-string v0, "Track_SportManager"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "Time Error:"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {v6}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 4077
    :goto_1
    return-void
.end method
