.class Lcom/huawei/ui/main/stories/health/fragment/TrendFragment$4;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/eih$m;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;->f()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic c:Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;


# direct methods
.method constructor <init>(Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;)V
    .locals 0

    .line 1125
    iput-object p1, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragment$4;->c:Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public b(II)V
    .locals 7

    .line 1127
    const-string v0, "WeightActivity_TrendFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "onRangeShow:STARTX:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "    ENDX:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1128
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragment$4;->c:Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;->g(Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;)Lo/fet;

    move-result-object v0

    invoke-virtual {v0, p1, p2}, Lo/fet;->c(II)Ljava/lang/String;

    move-result-object v6

    .line 1129
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragment$4;->c:Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;

    new-instance v1, Ljava/util/Date;

    add-int/lit8 v2, p2, -0x1

    int-to-long v2, v2

    const-wide/16 v4, 0x3c

    mul-long/2addr v2, v4

    const-wide/16 v4, 0x3e8

    mul-long/2addr v2, v4

    invoke-direct {v1, v2, v3}, Ljava/util/Date;-><init>(J)V

    invoke-static {v0, v1}, Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;->d(Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;Ljava/util/Date;)Ljava/util/Date;

    .line 1130
    const-string v0, "WeightActivity_TrendFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "onRangeShow:mEndDaForWeek"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragment$4;->c:Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;

    invoke-static {v3}, Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;->Q(Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;)Ljava/util/Date;

    move-result-object v3

    invoke-virtual {v3}, Ljava/util/Date;->getTime()J

    move-result-wide v3

    invoke-virtual {v2, v3, v4}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1131
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragment$4;->c:Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;->S(Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;)Landroid/widget/TextView;

    move-result-object v0

    invoke-virtual {v0, v6}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 1132
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragment$4;->c:Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;->W(Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;)Landroid/os/Handler;

    move-result-object v0

    const/16 v1, 0xc

    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeMessages(I)V

    .line 1133
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragment$4;->c:Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;->W(Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;)Landroid/os/Handler;

    move-result-object v0

    const/16 v1, 0xc

    const-wide/16 v2, 0x1f4

    invoke-virtual {v0, v1, v2, v3}, Landroid/os/Handler;->sendEmptyMessageDelayed(IJ)Z

    .line 1134
    return-void
.end method
