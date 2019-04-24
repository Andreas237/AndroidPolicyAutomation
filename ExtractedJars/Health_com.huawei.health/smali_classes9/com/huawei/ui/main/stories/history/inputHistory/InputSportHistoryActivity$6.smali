.class Lcom/huawei/ui/main/stories/history/inputHistory/InputSportHistoryActivity$6;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/ui/main/stories/history/inputHistory/InputSportHistoryActivity;->h()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:Lo/ffo;

.field final synthetic c:Lcom/huawei/ui/main/stories/history/inputHistory/InputSportHistoryActivity;


# direct methods
.method constructor <init>(Lcom/huawei/ui/main/stories/history/inputHistory/InputSportHistoryActivity;Lo/ffo;)V
    .locals 0

    .line 749
    iput-object p1, p0, Lcom/huawei/ui/main/stories/history/inputHistory/InputSportHistoryActivity$6;->c:Lcom/huawei/ui/main/stories/history/inputHistory/InputSportHistoryActivity;

    iput-object p2, p0, Lcom/huawei/ui/main/stories/history/inputHistory/InputSportHistoryActivity$6;->b:Lo/ffo;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 8

    .line 752
    iget-object v0, p0, Lcom/huawei/ui/main/stories/history/inputHistory/InputSportHistoryActivity$6;->c:Lcom/huawei/ui/main/stories/history/inputHistory/InputSportHistoryActivity;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/history/inputHistory/InputSportHistoryActivity$6;->b:Lo/ffo;

    invoke-virtual {v1}, Lo/ffo;->getSelectedYear()I

    move-result v1

    iget-object v2, p0, Lcom/huawei/ui/main/stories/history/inputHistory/InputSportHistoryActivity$6;->b:Lo/ffo;

    invoke-virtual {v2}, Lo/ffo;->getSelectedMonth()I

    move-result v2

    iget-object v3, p0, Lcom/huawei/ui/main/stories/history/inputHistory/InputSportHistoryActivity$6;->b:Lo/ffo;

    .line 753
    invoke-virtual {v3}, Lo/ffo;->getSelectedDay()I

    move-result v3

    .line 752
    const/4 v4, -0x1

    const/4 v5, -0x1

    invoke-static/range {v0 .. v5}, Lcom/huawei/ui/main/stories/history/inputHistory/InputSportHistoryActivity;->d(Lcom/huawei/ui/main/stories/history/inputHistory/InputSportHistoryActivity;IIIII)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 754
    return-void

    .line 756
    :cond_0
    const-string v0, "Track_InputSportHistoryActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "showInputSportDateChooseDialog year="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lcom/huawei/ui/main/stories/history/inputHistory/InputSportHistoryActivity$6;->b:Lo/ffo;

    invoke-virtual {v3}, Lo/ffo;->getSelectedYear()I

    move-result v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, ", month="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lcom/huawei/ui/main/stories/history/inputHistory/InputSportHistoryActivity$6;->b:Lo/ffo;

    .line 757
    invoke-virtual {v3}, Lo/ffo;->getSelectedMonth()I

    move-result v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, ", day="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lcom/huawei/ui/main/stories/history/inputHistory/InputSportHistoryActivity$6;->b:Lo/ffo;

    invoke-virtual {v3}, Lo/ffo;->getSelectedDay()I

    move-result v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    .line 756
    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 759
    iget-object v0, p0, Lcom/huawei/ui/main/stories/history/inputHistory/InputSportHistoryActivity$6;->c:Lcom/huawei/ui/main/stories/history/inputHistory/InputSportHistoryActivity;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/history/inputHistory/InputSportHistoryActivity$6;->b:Lo/ffo;

    invoke-virtual {v1}, Lo/ffo;->getSelectedYear()I

    move-result v1

    invoke-static {v0, v1}, Lcom/huawei/ui/main/stories/history/inputHistory/InputSportHistoryActivity;->e(Lcom/huawei/ui/main/stories/history/inputHistory/InputSportHistoryActivity;I)I

    .line 760
    iget-object v0, p0, Lcom/huawei/ui/main/stories/history/inputHistory/InputSportHistoryActivity$6;->c:Lcom/huawei/ui/main/stories/history/inputHistory/InputSportHistoryActivity;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/history/inputHistory/InputSportHistoryActivity$6;->b:Lo/ffo;

    invoke-virtual {v1}, Lo/ffo;->getSelectedMonth()I

    move-result v1

    invoke-static {v0, v1}, Lcom/huawei/ui/main/stories/history/inputHistory/InputSportHistoryActivity;->b(Lcom/huawei/ui/main/stories/history/inputHistory/InputSportHistoryActivity;I)I

    .line 761
    iget-object v0, p0, Lcom/huawei/ui/main/stories/history/inputHistory/InputSportHistoryActivity$6;->c:Lcom/huawei/ui/main/stories/history/inputHistory/InputSportHistoryActivity;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/history/inputHistory/InputSportHistoryActivity$6;->b:Lo/ffo;

    invoke-virtual {v1}, Lo/ffo;->getSelectedDay()I

    move-result v1

    invoke-static {v0, v1}, Lcom/huawei/ui/main/stories/history/inputHistory/InputSportHistoryActivity;->k(Lcom/huawei/ui/main/stories/history/inputHistory/InputSportHistoryActivity;I)I

    .line 762
    invoke-static {}, Ljava/util/Calendar;->getInstance()Ljava/util/Calendar;

    move-result-object v6

    .line 763
    iget-object v0, p0, Lcom/huawei/ui/main/stories/history/inputHistory/InputSportHistoryActivity$6;->c:Lcom/huawei/ui/main/stories/history/inputHistory/InputSportHistoryActivity;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/history/inputHistory/InputSportHistoryActivity;->h(Lcom/huawei/ui/main/stories/history/inputHistory/InputSportHistoryActivity;)I

    move-result v0

    const/4 v1, 0x1

    invoke-virtual {v6, v1, v0}, Ljava/util/Calendar;->set(II)V

    .line 764
    iget-object v0, p0, Lcom/huawei/ui/main/stories/history/inputHistory/InputSportHistoryActivity$6;->c:Lcom/huawei/ui/main/stories/history/inputHistory/InputSportHistoryActivity;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/history/inputHistory/InputSportHistoryActivity;->o(Lcom/huawei/ui/main/stories/history/inputHistory/InputSportHistoryActivity;)I

    move-result v0

    add-int/lit8 v0, v0, -0x1

    const/4 v1, 0x2

    invoke-virtual {v6, v1, v0}, Ljava/util/Calendar;->set(II)V

    .line 765
    iget-object v0, p0, Lcom/huawei/ui/main/stories/history/inputHistory/InputSportHistoryActivity$6;->c:Lcom/huawei/ui/main/stories/history/inputHistory/InputSportHistoryActivity;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/history/inputHistory/InputSportHistoryActivity;->m(Lcom/huawei/ui/main/stories/history/inputHistory/InputSportHistoryActivity;)I

    move-result v0

    const/4 v1, 0x5

    invoke-virtual {v6, v1, v0}, Ljava/util/Calendar;->set(II)V

    .line 766
    invoke-virtual {v6}, Ljava/util/Calendar;->getTime()Ljava/util/Date;

    move-result-object v7

    .line 767
    iget-object v0, p0, Lcom/huawei/ui/main/stories/history/inputHistory/InputSportHistoryActivity$6;->c:Lcom/huawei/ui/main/stories/history/inputHistory/InputSportHistoryActivity;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/history/inputHistory/InputSportHistoryActivity;->l(Lcom/huawei/ui/main/stories/history/inputHistory/InputSportHistoryActivity;)Lo/egb;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/ui/main/stories/history/inputHistory/InputSportHistoryActivity$6;->c:Lcom/huawei/ui/main/stories/history/inputHistory/InputSportHistoryActivity;

    invoke-static {v1, v7}, Lcom/huawei/ui/main/stories/history/inputHistory/InputSportHistoryActivity;->c(Lcom/huawei/ui/main/stories/history/inputHistory/InputSportHistoryActivity;Ljava/util/Date;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/egb;->setText(Ljava/lang/CharSequence;)V

    .line 768
    iget-object v0, p0, Lcom/huawei/ui/main/stories/history/inputHistory/InputSportHistoryActivity$6;->c:Lcom/huawei/ui/main/stories/history/inputHistory/InputSportHistoryActivity;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/history/inputHistory/InputSportHistoryActivity$6;->c:Lcom/huawei/ui/main/stories/history/inputHistory/InputSportHistoryActivity;

    invoke-static {v1}, Lcom/huawei/ui/main/stories/history/inputHistory/InputSportHistoryActivity;->n(Lcom/huawei/ui/main/stories/history/inputHistory/InputSportHistoryActivity;)J

    move-result-wide v1

    invoke-static {v0, v1, v2}, Lcom/huawei/ui/main/stories/history/inputHistory/InputSportHistoryActivity;->d(Lcom/huawei/ui/main/stories/history/inputHistory/InputSportHistoryActivity;J)V

    .line 769
    iget-object v0, p0, Lcom/huawei/ui/main/stories/history/inputHistory/InputSportHistoryActivity$6;->c:Lcom/huawei/ui/main/stories/history/inputHistory/InputSportHistoryActivity;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/history/inputHistory/InputSportHistoryActivity;->g(Lcom/huawei/ui/main/stories/history/inputHistory/InputSportHistoryActivity;)Lcom/huawei/healthcloud/plugintrack/model/MotionPathSimplify;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/ui/main/stories/history/inputHistory/InputSportHistoryActivity$6;->c:Lcom/huawei/ui/main/stories/history/inputHistory/InputSportHistoryActivity;

    invoke-static {v1}, Lcom/huawei/ui/main/stories/history/inputHistory/InputSportHistoryActivity;->n(Lcom/huawei/ui/main/stories/history/inputHistory/InputSportHistoryActivity;)J

    move-result-wide v1

    iget-object v3, p0, Lcom/huawei/ui/main/stories/history/inputHistory/InputSportHistoryActivity$6;->c:Lcom/huawei/ui/main/stories/history/inputHistory/InputSportHistoryActivity;

    invoke-static {v3}, Lcom/huawei/ui/main/stories/history/inputHistory/InputSportHistoryActivity;->g(Lcom/huawei/ui/main/stories/history/inputHistory/InputSportHistoryActivity;)Lcom/huawei/healthcloud/plugintrack/model/MotionPathSimplify;

    move-result-object v3

    invoke-virtual {v3}, Lcom/huawei/healthcloud/plugintrack/model/MotionPathSimplify;->requestTotalTime()J

    move-result-wide v3

    add-long/2addr v1, v3

    invoke-virtual {v0, v1, v2}, Lcom/huawei/healthcloud/plugintrack/model/MotionPathSimplify;->saveEndTime(J)V

    .line 770
    iget-object v0, p0, Lcom/huawei/ui/main/stories/history/inputHistory/InputSportHistoryActivity$6;->c:Lcom/huawei/ui/main/stories/history/inputHistory/InputSportHistoryActivity;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/huawei/ui/main/stories/history/inputHistory/InputSportHistoryActivity;->c(Lcom/huawei/ui/main/stories/history/inputHistory/InputSportHistoryActivity;Z)Z

    .line 771
    invoke-virtual {v6}, Ljava/util/Calendar;->clear()V

    .line 773
    return-void
.end method
