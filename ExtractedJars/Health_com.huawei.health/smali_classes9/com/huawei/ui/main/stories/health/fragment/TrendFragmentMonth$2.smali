.class Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth$2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/eih$m;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;->h()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic c:Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;


# direct methods
.method constructor <init>(Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;)V
    .locals 0

    .line 1103
    iput-object p1, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth$2;->c:Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public b(II)V
    .locals 7

    .line 1105
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

    .line 1106
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth$2;->c:Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;

    iget-object v0, v0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;->i:Lo/fet;

    invoke-virtual {v0, p1, p2}, Lo/fet;->c(II)Ljava/lang/String;

    move-result-object v6

    .line 1107
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth$2;->c:Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;

    new-instance v1, Ljava/util/Date;

    add-int/lit8 v2, p2, -0x1

    int-to-long v2, v2

    const-wide/16 v4, 0x3c

    mul-long/2addr v2, v4

    const-wide/16 v4, 0x3e8

    mul-long/2addr v2, v4

    invoke-direct {v1, v2, v3}, Ljava/util/Date;-><init>(J)V

    invoke-static {v0, v1}, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;->a(Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;Ljava/util/Date;)Ljava/util/Date;

    .line 1108
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth$2;->c:Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;->O(Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;)Landroid/widget/TextView;

    move-result-object v0

    invoke-virtual {v0, v6}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 1109
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth$2;->c:Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;->P(Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;)Landroid/os/Handler;

    move-result-object v0

    const/16 v1, 0xc

    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeMessages(I)V

    .line 1110
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth$2;->c:Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;->P(Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;)Landroid/os/Handler;

    move-result-object v0

    const/16 v1, 0xc

    const-wide/16 v2, 0x1f4

    invoke-virtual {v0, v1, v2, v3}, Landroid/os/Handler;->sendEmptyMessageDelayed(IJ)Z

    .line 1111
    return-void
.end method
