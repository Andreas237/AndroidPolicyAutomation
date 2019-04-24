.class Lcom/huawei/ui/main/stories/health/activity/healthdata/InputBloodpressureActivity$9;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/ui/main/stories/health/activity/healthdata/InputBloodpressureActivity;->l()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:Lcom/huawei/ui/main/stories/health/activity/healthdata/InputBloodpressureActivity;

.field final synthetic d:Ljava/util/Calendar;

.field final synthetic e:Lo/fgi;


# direct methods
.method constructor <init>(Lcom/huawei/ui/main/stories/health/activity/healthdata/InputBloodpressureActivity;Lo/fgi;Ljava/util/Calendar;)V
    .locals 0

    .line 563
    iput-object p1, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputBloodpressureActivity$9;->b:Lcom/huawei/ui/main/stories/health/activity/healthdata/InputBloodpressureActivity;

    iput-object p2, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputBloodpressureActivity$9;->e:Lo/fgi;

    iput-object p3, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputBloodpressureActivity$9;->d:Ljava/util/Calendar;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 5

    .line 566
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputBloodpressureActivity$9;->b:Lcom/huawei/ui/main/stories/health/activity/healthdata/InputBloodpressureActivity;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputBloodpressureActivity$9;->e:Lo/fgi;

    invoke-virtual {v1}, Lo/fgi;->getSelectedYear()I

    move-result v1

    invoke-static {v0, v1}, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputBloodpressureActivity;->e(Lcom/huawei/ui/main/stories/health/activity/healthdata/InputBloodpressureActivity;I)I

    .line 567
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputBloodpressureActivity$9;->b:Lcom/huawei/ui/main/stories/health/activity/healthdata/InputBloodpressureActivity;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputBloodpressureActivity$9;->e:Lo/fgi;

    invoke-virtual {v1}, Lo/fgi;->getSelectedMonth()I

    move-result v1

    invoke-static {v0, v1}, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputBloodpressureActivity;->c(Lcom/huawei/ui/main/stories/health/activity/healthdata/InputBloodpressureActivity;I)I

    .line 568
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputBloodpressureActivity$9;->b:Lcom/huawei/ui/main/stories/health/activity/healthdata/InputBloodpressureActivity;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputBloodpressureActivity$9;->e:Lo/fgi;

    invoke-virtual {v1}, Lo/fgi;->getSelectedDay()I

    move-result v1

    invoke-static {v0, v1}, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputBloodpressureActivity;->d(Lcom/huawei/ui/main/stories/health/activity/healthdata/InputBloodpressureActivity;I)I

    .line 569
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputBloodpressureActivity$9;->d:Ljava/util/Calendar;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputBloodpressureActivity$9;->b:Lcom/huawei/ui/main/stories/health/activity/healthdata/InputBloodpressureActivity;

    invoke-static {v1}, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputBloodpressureActivity;->r(Lcom/huawei/ui/main/stories/health/activity/healthdata/InputBloodpressureActivity;)I

    move-result v1

    iget-object v2, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputBloodpressureActivity$9;->b:Lcom/huawei/ui/main/stories/health/activity/healthdata/InputBloodpressureActivity;

    invoke-static {v2}, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputBloodpressureActivity;->s(Lcom/huawei/ui/main/stories/health/activity/healthdata/InputBloodpressureActivity;)I

    move-result v2

    add-int/lit8 v2, v2, -0x1

    iget-object v3, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputBloodpressureActivity$9;->b:Lcom/huawei/ui/main/stories/health/activity/healthdata/InputBloodpressureActivity;

    invoke-static {v3}, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputBloodpressureActivity;->t(Lcom/huawei/ui/main/stories/health/activity/healthdata/InputBloodpressureActivity;)I

    move-result v3

    invoke-virtual {v0, v1, v2, v3}, Ljava/util/Calendar;->set(III)V

    .line 570
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputBloodpressureActivity$9;->d:Ljava/util/Calendar;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputBloodpressureActivity$9;->b:Lcom/huawei/ui/main/stories/health/activity/healthdata/InputBloodpressureActivity;

    invoke-static {v1}, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputBloodpressureActivity;->q(Lcom/huawei/ui/main/stories/health/activity/healthdata/InputBloodpressureActivity;)I

    move-result v1

    const/16 v2, 0xb

    invoke-virtual {v0, v2, v1}, Ljava/util/Calendar;->set(II)V

    .line 571
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputBloodpressureActivity$9;->d:Ljava/util/Calendar;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputBloodpressureActivity$9;->b:Lcom/huawei/ui/main/stories/health/activity/healthdata/InputBloodpressureActivity;

    invoke-static {v1}, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputBloodpressureActivity;->y(Lcom/huawei/ui/main/stories/health/activity/healthdata/InputBloodpressureActivity;)I

    move-result v1

    const/16 v2, 0xc

    invoke-virtual {v0, v2, v1}, Ljava/util/Calendar;->set(II)V

    .line 572
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputBloodpressureActivity$9;->b:Lcom/huawei/ui/main/stories/health/activity/healthdata/InputBloodpressureActivity;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputBloodpressureActivity$9;->d:Ljava/util/Calendar;

    invoke-virtual {v1}, Ljava/util/Calendar;->getTimeInMillis()J

    move-result-wide v1

    invoke-static {v0, v1, v2}, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputBloodpressureActivity;->c(Lcom/huawei/ui/main/stories/health/activity/healthdata/InputBloodpressureActivity;J)J

    .line 573
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputBloodpressureActivity$9;->b:Lcom/huawei/ui/main/stories/health/activity/healthdata/InputBloodpressureActivity;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputBloodpressureActivity$9;->d:Ljava/util/Calendar;

    invoke-virtual {v1}, Ljava/util/Calendar;->getTime()Ljava/util/Date;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputBloodpressureActivity;->a(Lcom/huawei/ui/main/stories/health/activity/healthdata/InputBloodpressureActivity;Ljava/util/Date;)Ljava/util/Date;

    .line 574
    new-instance v4, Ljava/text/SimpleDateFormat;

    invoke-static {}, Ljava/util/Locale;->getDefault()Ljava/util/Locale;

    move-result-object v0

    const-string v1, "yyyyMd"

    invoke-static {v0, v1}, Landroid/text/format/DateFormat;->getBestDateTimePattern(Ljava/util/Locale;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-direct {v4, v0}, Ljava/text/SimpleDateFormat;-><init>(Ljava/lang/String;)V

    .line 575
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputBloodpressureActivity$9;->b:Lcom/huawei/ui/main/stories/health/activity/healthdata/InputBloodpressureActivity;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputBloodpressureActivity;->x(Lcom/huawei/ui/main/stories/health/activity/healthdata/InputBloodpressureActivity;)Lo/egb;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputBloodpressureActivity$9;->b:Lcom/huawei/ui/main/stories/health/activity/healthdata/InputBloodpressureActivity;

    invoke-static {v1}, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputBloodpressureActivity;->z(Lcom/huawei/ui/main/stories/health/activity/healthdata/InputBloodpressureActivity;)Ljava/util/Date;

    move-result-object v1

    invoke-virtual {v4, v1}, Ljava/text/SimpleDateFormat;->format(Ljava/util/Date;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/egb;->setText(Ljava/lang/CharSequence;)V

    .line 576
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputBloodpressureActivity$9;->d:Ljava/util/Calendar;

    invoke-virtual {v0}, Ljava/util/Calendar;->clear()V

    .line 577
    return-void
.end method
