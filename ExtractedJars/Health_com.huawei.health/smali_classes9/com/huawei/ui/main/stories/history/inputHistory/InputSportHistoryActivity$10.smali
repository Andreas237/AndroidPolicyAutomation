.class Lcom/huawei/ui/main/stories/history/inputHistory/InputSportHistoryActivity$10;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/ui/main/stories/history/inputHistory/InputSportHistoryActivity;->k()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic c:Lcom/huawei/ui/main/stories/history/inputHistory/InputSportHistoryActivity;

.field final synthetic e:Lo/ffn;


# direct methods
.method constructor <init>(Lcom/huawei/ui/main/stories/history/inputHistory/InputSportHistoryActivity;Lo/ffn;)V
    .locals 0

    .line 685
    iput-object p1, p0, Lcom/huawei/ui/main/stories/history/inputHistory/InputSportHistoryActivity$10;->c:Lcom/huawei/ui/main/stories/history/inputHistory/InputSportHistoryActivity;

    iput-object p2, p0, Lcom/huawei/ui/main/stories/history/inputHistory/InputSportHistoryActivity$10;->e:Lo/ffn;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 11

    .line 689
    iget-object v0, p0, Lcom/huawei/ui/main/stories/history/inputHistory/InputSportHistoryActivity$10;->c:Lcom/huawei/ui/main/stories/history/inputHistory/InputSportHistoryActivity;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/history/inputHistory/InputSportHistoryActivity$10;->e:Lo/ffn;

    invoke-virtual {v1}, Lo/ffn;->getSelectedHour()I

    move-result v1

    invoke-static {v0, v1}, Lcom/huawei/ui/main/stories/history/inputHistory/InputSportHistoryActivity;->d(Lcom/huawei/ui/main/stories/history/inputHistory/InputSportHistoryActivity;I)I

    .line 690
    iget-object v0, p0, Lcom/huawei/ui/main/stories/history/inputHistory/InputSportHistoryActivity$10;->c:Lcom/huawei/ui/main/stories/history/inputHistory/InputSportHistoryActivity;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/history/inputHistory/InputSportHistoryActivity$10;->e:Lo/ffn;

    invoke-virtual {v1}, Lo/ffn;->getSelectedMinute()I

    move-result v1

    invoke-static {v0, v1}, Lcom/huawei/ui/main/stories/history/inputHistory/InputSportHistoryActivity;->a(Lcom/huawei/ui/main/stories/history/inputHistory/InputSportHistoryActivity;I)I

    .line 691
    iget-object v0, p0, Lcom/huawei/ui/main/stories/history/inputHistory/InputSportHistoryActivity$10;->c:Lcom/huawei/ui/main/stories/history/inputHistory/InputSportHistoryActivity;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/history/inputHistory/InputSportHistoryActivity$10;->e:Lo/ffn;

    invoke-virtual {v1}, Lo/ffn;->getSelectedSecond()I

    move-result v1

    invoke-static {v0, v1}, Lcom/huawei/ui/main/stories/history/inputHistory/InputSportHistoryActivity;->c(Lcom/huawei/ui/main/stories/history/inputHistory/InputSportHistoryActivity;I)I

    .line 692
    const-string v0, "Track_InputSportHistoryActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "creatorSportDurationDialog() hour="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lcom/huawei/ui/main/stories/history/inputHistory/InputSportHistoryActivity$10;->c:Lcom/huawei/ui/main/stories/history/inputHistory/InputSportHistoryActivity;

    invoke-static {v3}, Lcom/huawei/ui/main/stories/history/inputHistory/InputSportHistoryActivity;->d(Lcom/huawei/ui/main/stories/history/inputHistory/InputSportHistoryActivity;)I

    move-result v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, ", minute="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lcom/huawei/ui/main/stories/history/inputHistory/InputSportHistoryActivity$10;->c:Lcom/huawei/ui/main/stories/history/inputHistory/InputSportHistoryActivity;

    invoke-static {v3}, Lcom/huawei/ui/main/stories/history/inputHistory/InputSportHistoryActivity;->b(Lcom/huawei/ui/main/stories/history/inputHistory/InputSportHistoryActivity;)I

    move-result v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, ", second="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lcom/huawei/ui/main/stories/history/inputHistory/InputSportHistoryActivity$10;->c:Lcom/huawei/ui/main/stories/history/inputHistory/InputSportHistoryActivity;

    invoke-static {v3}, Lcom/huawei/ui/main/stories/history/inputHistory/InputSportHistoryActivity;->f(Lcom/huawei/ui/main/stories/history/inputHistory/InputSportHistoryActivity;)I

    move-result v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 693
    invoke-static {}, Ljava/util/Calendar;->getInstance()Ljava/util/Calendar;

    move-result-object v6

    .line 694
    iget-object v0, p0, Lcom/huawei/ui/main/stories/history/inputHistory/InputSportHistoryActivity$10;->c:Lcom/huawei/ui/main/stories/history/inputHistory/InputSportHistoryActivity;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/history/inputHistory/InputSportHistoryActivity;->d(Lcom/huawei/ui/main/stories/history/inputHistory/InputSportHistoryActivity;)I

    move-result v0

    const/16 v1, 0xb

    invoke-virtual {v6, v1, v0}, Ljava/util/Calendar;->set(II)V

    .line 695
    iget-object v0, p0, Lcom/huawei/ui/main/stories/history/inputHistory/InputSportHistoryActivity$10;->c:Lcom/huawei/ui/main/stories/history/inputHistory/InputSportHistoryActivity;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/history/inputHistory/InputSportHistoryActivity;->b(Lcom/huawei/ui/main/stories/history/inputHistory/InputSportHistoryActivity;)I

    move-result v0

    const/16 v1, 0xc

    invoke-virtual {v6, v1, v0}, Ljava/util/Calendar;->set(II)V

    .line 696
    iget-object v0, p0, Lcom/huawei/ui/main/stories/history/inputHistory/InputSportHistoryActivity$10;->c:Lcom/huawei/ui/main/stories/history/inputHistory/InputSportHistoryActivity;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/history/inputHistory/InputSportHistoryActivity;->f(Lcom/huawei/ui/main/stories/history/inputHistory/InputSportHistoryActivity;)I

    move-result v0

    const/16 v1, 0xd

    invoke-virtual {v6, v1, v0}, Ljava/util/Calendar;->set(II)V

    .line 697
    invoke-virtual {v6}, Ljava/util/Calendar;->getTime()Ljava/util/Date;

    move-result-object v7

    .line 698
    iget-object v0, p0, Lcom/huawei/ui/main/stories/history/inputHistory/InputSportHistoryActivity$10;->c:Lcom/huawei/ui/main/stories/history/inputHistory/InputSportHistoryActivity;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/history/inputHistory/InputSportHistoryActivity;->d(Lcom/huawei/ui/main/stories/history/inputHistory/InputSportHistoryActivity;)I

    move-result v0

    if-gtz v0, :cond_0

    iget-object v0, p0, Lcom/huawei/ui/main/stories/history/inputHistory/InputSportHistoryActivity$10;->c:Lcom/huawei/ui/main/stories/history/inputHistory/InputSportHistoryActivity;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/history/inputHistory/InputSportHistoryActivity;->b(Lcom/huawei/ui/main/stories/history/inputHistory/InputSportHistoryActivity;)I

    move-result v0

    if-gtz v0, :cond_0

    iget-object v0, p0, Lcom/huawei/ui/main/stories/history/inputHistory/InputSportHistoryActivity$10;->c:Lcom/huawei/ui/main/stories/history/inputHistory/InputSportHistoryActivity;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/history/inputHistory/InputSportHistoryActivity;->f(Lcom/huawei/ui/main/stories/history/inputHistory/InputSportHistoryActivity;)I

    move-result v0

    if-lez v0, :cond_1

    .line 699
    :cond_0
    iget-object v0, p0, Lcom/huawei/ui/main/stories/history/inputHistory/InputSportHistoryActivity$10;->c:Lcom/huawei/ui/main/stories/history/inputHistory/InputSportHistoryActivity;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/history/inputHistory/InputSportHistoryActivity;->f(Lcom/huawei/ui/main/stories/history/inputHistory/InputSportHistoryActivity;)I

    move-result v0

    int-to-long v0, v0

    const-wide/16 v2, 0x3e8

    mul-long/2addr v0, v2

    iget-object v2, p0, Lcom/huawei/ui/main/stories/history/inputHistory/InputSportHistoryActivity$10;->c:Lcom/huawei/ui/main/stories/history/inputHistory/InputSportHistoryActivity;

    invoke-static {v2}, Lcom/huawei/ui/main/stories/history/inputHistory/InputSportHistoryActivity;->b(Lcom/huawei/ui/main/stories/history/inputHistory/InputSportHistoryActivity;)I

    move-result v2

    int-to-long v2, v2

    const-wide/16 v4, 0x3c

    mul-long/2addr v2, v4

    const-wide/16 v4, 0x3e8

    mul-long/2addr v2, v4

    add-long/2addr v0, v2

    iget-object v2, p0, Lcom/huawei/ui/main/stories/history/inputHistory/InputSportHistoryActivity$10;->c:Lcom/huawei/ui/main/stories/history/inputHistory/InputSportHistoryActivity;

    invoke-static {v2}, Lcom/huawei/ui/main/stories/history/inputHistory/InputSportHistoryActivity;->d(Lcom/huawei/ui/main/stories/history/inputHistory/InputSportHistoryActivity;)I

    move-result v2

    int-to-long v2, v2

    const-wide/16 v4, 0x3c

    mul-long/2addr v2, v4

    const-wide/16 v4, 0x3c

    mul-long/2addr v2, v4

    const-wide/16 v4, 0x3e8

    mul-long/2addr v2, v4

    add-long v8, v0, v2

    .line 700
    const-string v0, "Track_InputSportHistoryActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "creatorSportDurationDialog() TotalTime="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v8, v9}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 701
    iget-object v0, p0, Lcom/huawei/ui/main/stories/history/inputHistory/InputSportHistoryActivity$10;->c:Lcom/huawei/ui/main/stories/history/inputHistory/InputSportHistoryActivity;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/history/inputHistory/InputSportHistoryActivity;->g(Lcom/huawei/ui/main/stories/history/inputHistory/InputSportHistoryActivity;)Lcom/huawei/healthcloud/plugintrack/model/MotionPathSimplify;

    move-result-object v0

    invoke-virtual {v0, v8, v9}, Lcom/huawei/healthcloud/plugintrack/model/MotionPathSimplify;->saveTotalTime(J)V

    .line 702
    new-instance v10, Ljava/text/SimpleDateFormat;

    const-string v0, "HH:mm:ss"

    invoke-direct {v10, v0}, Ljava/text/SimpleDateFormat;-><init>(Ljava/lang/String;)V

    .line 703
    iget-object v0, p0, Lcom/huawei/ui/main/stories/history/inputHistory/InputSportHistoryActivity$10;->c:Lcom/huawei/ui/main/stories/history/inputHistory/InputSportHistoryActivity;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/history/inputHistory/InputSportHistoryActivity;->i(Lcom/huawei/ui/main/stories/history/inputHistory/InputSportHistoryActivity;)Lo/egb;

    move-result-object v0

    invoke-virtual {v10, v7}, Ljava/text/SimpleDateFormat;->format(Ljava/util/Date;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/egb;->setText(Ljava/lang/CharSequence;)V

    .line 704
    goto :goto_0

    .line 705
    :cond_1
    iget-object v0, p0, Lcom/huawei/ui/main/stories/history/inputHistory/InputSportHistoryActivity$10;->c:Lcom/huawei/ui/main/stories/history/inputHistory/InputSportHistoryActivity;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/history/inputHistory/InputSportHistoryActivity;->g(Lcom/huawei/ui/main/stories/history/inputHistory/InputSportHistoryActivity;)Lcom/huawei/healthcloud/plugintrack/model/MotionPathSimplify;

    move-result-object v0

    const-wide/16 v1, 0x0

    invoke-virtual {v0, v1, v2}, Lcom/huawei/healthcloud/plugintrack/model/MotionPathSimplify;->saveTotalTime(J)V

    .line 706
    iget-object v0, p0, Lcom/huawei/ui/main/stories/history/inputHistory/InputSportHistoryActivity$10;->c:Lcom/huawei/ui/main/stories/history/inputHistory/InputSportHistoryActivity;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/history/inputHistory/InputSportHistoryActivity;->i(Lcom/huawei/ui/main/stories/history/inputHistory/InputSportHistoryActivity;)Lo/egb;

    move-result-object v0

    const-string v1, ""

    invoke-virtual {v0, v1}, Lo/egb;->setText(Ljava/lang/CharSequence;)V

    .line 708
    :goto_0
    iget-object v0, p0, Lcom/huawei/ui/main/stories/history/inputHistory/InputSportHistoryActivity$10;->c:Lcom/huawei/ui/main/stories/history/inputHistory/InputSportHistoryActivity;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/history/inputHistory/InputSportHistoryActivity;->k(Lcom/huawei/ui/main/stories/history/inputHistory/InputSportHistoryActivity;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 709
    iget-object v0, p0, Lcom/huawei/ui/main/stories/history/inputHistory/InputSportHistoryActivity$10;->c:Lcom/huawei/ui/main/stories/history/inputHistory/InputSportHistoryActivity;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/history/inputHistory/InputSportHistoryActivity$10;->c:Lcom/huawei/ui/main/stories/history/inputHistory/InputSportHistoryActivity;

    invoke-static {v1}, Lcom/huawei/ui/main/stories/history/inputHistory/InputSportHistoryActivity;->d(Lcom/huawei/ui/main/stories/history/inputHistory/InputSportHistoryActivity;)I

    move-result v1

    iget-object v2, p0, Lcom/huawei/ui/main/stories/history/inputHistory/InputSportHistoryActivity$10;->c:Lcom/huawei/ui/main/stories/history/inputHistory/InputSportHistoryActivity;

    invoke-static {v2}, Lcom/huawei/ui/main/stories/history/inputHistory/InputSportHistoryActivity;->b(Lcom/huawei/ui/main/stories/history/inputHistory/InputSportHistoryActivity;)I

    move-result v2

    invoke-static {v0, v1, v2}, Lcom/huawei/ui/main/stories/history/inputHistory/InputSportHistoryActivity;->b(Lcom/huawei/ui/main/stories/history/inputHistory/InputSportHistoryActivity;II)V

    .line 711
    :cond_2
    invoke-virtual {v6}, Ljava/util/Calendar;->clear()V

    .line 713
    return-void
.end method
