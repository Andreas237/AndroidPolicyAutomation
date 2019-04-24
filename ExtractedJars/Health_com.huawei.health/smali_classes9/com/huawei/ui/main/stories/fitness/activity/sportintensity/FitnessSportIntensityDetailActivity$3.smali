.class Lcom/huawei/ui/main/stories/fitness/activity/sportintensity/FitnessSportIntensityDetailActivity$3;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/ezv;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/ui/main/stories/fitness/activity/sportintensity/FitnessSportIntensityDetailActivity;->u()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic e:Lcom/huawei/ui/main/stories/fitness/activity/sportintensity/FitnessSportIntensityDetailActivity;


# direct methods
.method constructor <init>(Lcom/huawei/ui/main/stories/fitness/activity/sportintensity/FitnessSportIntensityDetailActivity;)V
    .locals 0

    .line 128
    iput-object p1, p0, Lcom/huawei/ui/main/stories/fitness/activity/sportintensity/FitnessSportIntensityDetailActivity$3;->e:Lcom/huawei/ui/main/stories/fitness/activity/sportintensity/FitnessSportIntensityDetailActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public d(Lo/eic;IILo/eie;)V
    .locals 11

    .line 136
    mul-int/lit8 v0, p2, 0x3c

    int-to-long v0, v0

    const-wide/16 v2, 0x3e8

    mul-long v6, v0, v2

    .line 137
    mul-int/lit8 v0, p3, 0x3c

    int-to-long v0, v0

    const-wide/16 v2, 0x3e8

    mul-long/2addr v0, v2

    const-wide/16 v2, 0x1

    sub-long v8, v0, v2

    .line 138
    const-string v0, "Strength_FitnessTimeStrengthDetailActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "startTime  "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v6, v7}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "endTime   "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v8, v9}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 141
    invoke-virtual {p1}, Lo/eic;->c()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 142
    const/4 v10, 0x5

    goto :goto_0

    .line 143
    :cond_0
    invoke-virtual {p1}, Lo/eic;->b()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 144
    const/4 v10, 0x6

    goto :goto_0

    .line 145
    :cond_1
    invoke-virtual {p1}, Lo/eic;->d()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 146
    const/4 v10, 0x3

    goto :goto_0

    .line 148
    :cond_2
    const/4 v10, 0x4

    .line 151
    :goto_0
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/sportintensity/FitnessSportIntensityDetailActivity$3;->e:Lcom/huawei/ui/main/stories/fitness/activity/sportintensity/FitnessSportIntensityDetailActivity;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/fitness/activity/sportintensity/FitnessSportIntensityDetailActivity;->b(Lcom/huawei/ui/main/stories/fitness/activity/sportintensity/FitnessSportIntensityDetailActivity;)Lo/ewr;

    move-result-object v0

    move-wide v1, v6

    move-wide v3, v8

    move v5, v10

    invoke-virtual/range {v0 .. v5}, Lo/ewr;->c(JJI)V

    .line 152
    return-void
.end method
