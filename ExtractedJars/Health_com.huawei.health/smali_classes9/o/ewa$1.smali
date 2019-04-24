.class Lo/ewa$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/ewa;->d(Lcom/huawei/ui/main/stories/recommendcloud/data/SleepRecommendData;IZZ)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:Lo/ewa;

.field final synthetic c:I

.field final synthetic e:Lcom/huawei/ui/main/stories/recommendcloud/data/SleepRecommendData;


# direct methods
.method constructor <init>(Lo/ewa;Lcom/huawei/ui/main/stories/recommendcloud/data/SleepRecommendData;I)V
    .locals 0

    .line 104
    iput-object p1, p0, Lo/ewa$1;->b:Lo/ewa;

    iput-object p2, p0, Lo/ewa$1;->e:Lcom/huawei/ui/main/stories/recommendcloud/data/SleepRecommendData;

    iput p3, p0, Lo/ewa$1;->c:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 9

    .line 107
    iget-object v0, p0, Lo/ewa$1;->e:Lcom/huawei/ui/main/stories/recommendcloud/data/SleepRecommendData;

    invoke-virtual {v0}, Lcom/huawei/ui/main/stories/recommendcloud/data/SleepRecommendData;->getCategory()Ljava/lang/String;

    move-result-object v4

    .line 108
    new-instance v5, Ljava/util/HashMap;

    invoke-direct {v5}, Ljava/util/HashMap;-><init>()V

    .line 109
    const-string v0, "serviceID"

    iget-object v1, p0, Lo/ewa$1;->e:Lcom/huawei/ui/main/stories/recommendcloud/data/SleepRecommendData;

    invoke-virtual {v1}, Lcom/huawei/ui/main/stories/recommendcloud/data/SleepRecommendData;->getTitle()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v5, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 110
    const-string v0, "serviceName"

    iget-object v1, p0, Lo/ewa$1;->e:Lcom/huawei/ui/main/stories/recommendcloud/data/SleepRecommendData;

    invoke-virtual {v1}, Lcom/huawei/ui/main/stories/recommendcloud/data/SleepRecommendData;->getTitle()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v5, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 111
    const-string v0, "clickTime"

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v1

    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    invoke-interface {v5, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 112
    sget-object v0, Lo/dae;->eL:Lo/dae;

    invoke-virtual {v0}, Lo/dae;->b()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0, v5}, Lo/bzm;->c(Ljava/lang/String;Ljava/util/Map;)V

    .line 113
    iget-object v0, p0, Lo/ewa$1;->b:Lo/ewa;

    invoke-static {v0}, Lo/ewa;->a(Lo/ewa;)Lo/dch;

    move-result-object v0

    if-nez v0, :cond_0

    .line 114
    iget-object v0, p0, Lo/ewa$1;->b:Lo/ewa;

    invoke-static {}, Lo/dch;->b()Lo/dch;

    move-result-object v1

    invoke-static {v0, v1}, Lo/ewa;->c(Lo/ewa;Lo/dch;)Lo/dch;

    .line 116
    :cond_0
    new-instance v6, Lo/dcm;

    invoke-direct {v6}, Lo/dcm;-><init>()V

    .line 118
    iget-object v0, p0, Lo/ewa$1;->b:Lo/ewa;

    invoke-static {v0}, Lo/ewa;->e(Lo/ewa;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v6, v0}, Lo/dcm;->c(Ljava/lang/String;)V

    .line 119
    iget-object v0, p0, Lo/ewa$1;->e:Lcom/huawei/ui/main/stories/recommendcloud/data/SleepRecommendData;

    invoke-virtual {v0}, Lcom/huawei/ui/main/stories/recommendcloud/data/SleepRecommendData;->getTitle()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v6, v0}, Lo/dcm;->d(Ljava/lang/String;)V

    .line 120
    iget-object v0, p0, Lo/ewa$1;->e:Lcom/huawei/ui/main/stories/recommendcloud/data/SleepRecommendData;

    invoke-virtual {v0}, Lcom/huawei/ui/main/stories/recommendcloud/data/SleepRecommendData;->getDescription()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v6, v0}, Lo/dcm;->a(Ljava/lang/String;)V

    .line 121
    const-string v0, "2"

    invoke-virtual {v0, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 122
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "huaweischeme://healthapp/fitnesspage?id="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lo/ewa$1;->e:Lcom/huawei/ui/main/stories/recommendcloud/data/SleepRecommendData;

    invoke-virtual {v1}, Lcom/huawei/ui/main/stories/recommendcloud/data/SleepRecommendData;->getUrl()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v6, v0}, Lo/dcm;->e(Ljava/lang/String;)V

    goto :goto_0

    .line 124
    :cond_1
    iget-object v0, p0, Lo/ewa$1;->e:Lcom/huawei/ui/main/stories/recommendcloud/data/SleepRecommendData;

    invoke-virtual {v0}, Lcom/huawei/ui/main/stories/recommendcloud/data/SleepRecommendData;->getUrl()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v6, v0}, Lo/dcm;->e(Ljava/lang/String;)V

    .line 127
    :goto_0
    iget-object v0, p0, Lo/ewa$1;->b:Lo/ewa;

    invoke-static {v0}, Lo/ewa;->a(Lo/ewa;)Lo/dch;

    move-result-object v0

    invoke-virtual {v0, v6}, Lo/dch;->d(Lo/dcm;)J

    .line 128
    new-instance v7, Ljava/util/HashMap;

    invoke-direct {v7}, Ljava/util/HashMap;-><init>()V

    .line 129
    const-string v0, "serviceTitle"

    iget-object v1, p0, Lo/ewa$1;->e:Lcom/huawei/ui/main/stories/recommendcloud/data/SleepRecommendData;

    invoke-virtual {v1}, Lcom/huawei/ui/main/stories/recommendcloud/data/SleepRecommendData;->getTitle()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v7, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 130
    const-string v0, "sleepLabel"

    iget-object v1, p0, Lo/ewa$1;->e:Lcom/huawei/ui/main/stories/recommendcloud/data/SleepRecommendData;

    invoke-virtual {v1}, Lcom/huawei/ui/main/stories/recommendcloud/data/SleepRecommendData;->getCategory()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v7, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 131
    sget-object v0, Lo/dae;->eQ:Lo/dae;

    invoke-virtual {v0}, Lo/dae;->b()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0, v7}, Lo/bzm;->c(Ljava/lang/String;Ljava/util/Map;)V

    .line 139
    const-string v0, "1"

    invoke-virtual {v0, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 140
    sget-object v0, Lo/dae;->eI:Lo/dae;

    invoke-virtual {v0}, Lo/dae;->b()Ljava/lang/String;

    move-result-object v0

    iget-object v1, p0, Lo/ewa$1;->e:Lcom/huawei/ui/main/stories/recommendcloud/data/SleepRecommendData;

    iget-object v2, p0, Lo/ewa$1;->b:Lo/ewa;

    invoke-static {v2}, Lo/ewa;->d(Lo/ewa;)Landroid/content/Context;

    move-result-object v2

    invoke-static {v0, v1, v2}, Lo/fiu;->a(Ljava/lang/String;Lcom/huawei/ui/main/stories/recommendcloud/data/SleepRecommendData;Landroid/content/Context;)V

    goto :goto_1

    .line 141
    :cond_2
    const-string v0, "2"

    invoke-virtual {v0, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 142
    iget-object v0, p0, Lo/ewa$1;->e:Lcom/huawei/ui/main/stories/recommendcloud/data/SleepRecommendData;

    invoke-virtual {v0}, Lcom/huawei/ui/main/stories/recommendcloud/data/SleepRecommendData;->getUrl()Ljava/lang/String;

    move-result-object v8

    .line 143
    invoke-static {}, Lo/brt;->c()Lo/brt;

    move-result-object v0

    new-instance v1, Lo/ewa$1$3;

    invoke-direct {v1, p0}, Lo/ewa$1$3;-><init>(Lo/ewa$1;)V

    const/4 v2, 0x0

    invoke-virtual {v0, v8, v2, v1}, Lo/brt;->e(Ljava/lang/String;Ljava/lang/String;Lo/bui;)V

    .line 157
    :cond_3
    :goto_1
    const-string v0, "SleepServiceCardViewHolder"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "recycle view position:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget v3, p0, Lo/ewa$1;->c:I

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, " fitWorkout:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lo/ewa$1;->e:Lcom/huawei/ui/main/stories/recommendcloud/data/SleepRecommendData;

    invoke-virtual {v3}, Lcom/huawei/ui/main/stories/recommendcloud/data/SleepRecommendData;->getUrl()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 162
    return-void
.end method
