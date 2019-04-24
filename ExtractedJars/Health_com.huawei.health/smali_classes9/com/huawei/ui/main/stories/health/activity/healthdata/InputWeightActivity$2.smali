.class Lcom/huawei/ui/main/stories/health/activity/healthdata/InputWeightActivity$2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/ui/main/stories/health/activity/healthdata/InputWeightActivity;->b()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:Lcom/huawei/ui/main/stories/health/activity/healthdata/InputWeightActivity;

.field final synthetic d:Lo/fgi;

.field final synthetic e:Ljava/util/Calendar;


# direct methods
.method constructor <init>(Lcom/huawei/ui/main/stories/health/activity/healthdata/InputWeightActivity;Lo/fgi;Ljava/util/Calendar;)V
    .locals 0

    .line 449
    iput-object p1, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputWeightActivity$2;->b:Lcom/huawei/ui/main/stories/health/activity/healthdata/InputWeightActivity;

    iput-object p2, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputWeightActivity$2;->d:Lo/fgi;

    iput-object p3, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputWeightActivity$2;->e:Ljava/util/Calendar;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 5

    .line 452
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputWeightActivity$2;->b:Lcom/huawei/ui/main/stories/health/activity/healthdata/InputWeightActivity;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputWeightActivity$2;->d:Lo/fgi;

    invoke-virtual {v1}, Lo/fgi;->getSelectedYear()I

    move-result v1

    invoke-static {v0, v1}, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputWeightActivity;->c(Lcom/huawei/ui/main/stories/health/activity/healthdata/InputWeightActivity;I)I

    .line 453
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputWeightActivity$2;->b:Lcom/huawei/ui/main/stories/health/activity/healthdata/InputWeightActivity;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputWeightActivity$2;->d:Lo/fgi;

    invoke-virtual {v1}, Lo/fgi;->getSelectedMonth()I

    move-result v1

    invoke-static {v0, v1}, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputWeightActivity;->d(Lcom/huawei/ui/main/stories/health/activity/healthdata/InputWeightActivity;I)I

    .line 454
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputWeightActivity$2;->b:Lcom/huawei/ui/main/stories/health/activity/healthdata/InputWeightActivity;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputWeightActivity$2;->d:Lo/fgi;

    invoke-virtual {v1}, Lo/fgi;->getSelectedDay()I

    move-result v1

    invoke-static {v0, v1}, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputWeightActivity;->a(Lcom/huawei/ui/main/stories/health/activity/healthdata/InputWeightActivity;I)I

    .line 455
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputWeightActivity$2;->e:Ljava/util/Calendar;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputWeightActivity$2;->b:Lcom/huawei/ui/main/stories/health/activity/healthdata/InputWeightActivity;

    invoke-static {v1}, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputWeightActivity;->b(Lcom/huawei/ui/main/stories/health/activity/healthdata/InputWeightActivity;)I

    move-result v1

    iget-object v2, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputWeightActivity$2;->b:Lcom/huawei/ui/main/stories/health/activity/healthdata/InputWeightActivity;

    invoke-static {v2}, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputWeightActivity;->c(Lcom/huawei/ui/main/stories/health/activity/healthdata/InputWeightActivity;)I

    move-result v2

    add-int/lit8 v2, v2, -0x1

    iget-object v3, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputWeightActivity$2;->b:Lcom/huawei/ui/main/stories/health/activity/healthdata/InputWeightActivity;

    invoke-static {v3}, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputWeightActivity;->a(Lcom/huawei/ui/main/stories/health/activity/healthdata/InputWeightActivity;)I

    move-result v3

    invoke-virtual {v0, v1, v2, v3}, Ljava/util/Calendar;->set(III)V

    .line 456
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputWeightActivity$2;->e:Ljava/util/Calendar;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputWeightActivity$2;->b:Lcom/huawei/ui/main/stories/health/activity/healthdata/InputWeightActivity;

    invoke-static {v1}, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputWeightActivity;->d(Lcom/huawei/ui/main/stories/health/activity/healthdata/InputWeightActivity;)I

    move-result v1

    const/16 v2, 0xb

    invoke-virtual {v0, v2, v1}, Ljava/util/Calendar;->set(II)V

    .line 457
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputWeightActivity$2;->e:Ljava/util/Calendar;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputWeightActivity$2;->b:Lcom/huawei/ui/main/stories/health/activity/healthdata/InputWeightActivity;

    invoke-static {v1}, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputWeightActivity;->e(Lcom/huawei/ui/main/stories/health/activity/healthdata/InputWeightActivity;)I

    move-result v1

    const/16 v2, 0xc

    invoke-virtual {v0, v2, v1}, Ljava/util/Calendar;->set(II)V

    .line 458
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputWeightActivity$2;->b:Lcom/huawei/ui/main/stories/health/activity/healthdata/InputWeightActivity;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputWeightActivity$2;->e:Ljava/util/Calendar;

    invoke-virtual {v1}, Ljava/util/Calendar;->getTimeInMillis()J

    move-result-wide v1

    invoke-static {v0, v1, v2}, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputWeightActivity;->b(Lcom/huawei/ui/main/stories/health/activity/healthdata/InputWeightActivity;J)J

    .line 459
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputWeightActivity$2;->b:Lcom/huawei/ui/main/stories/health/activity/healthdata/InputWeightActivity;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputWeightActivity$2;->e:Ljava/util/Calendar;

    invoke-virtual {v1}, Ljava/util/Calendar;->getTime()Ljava/util/Date;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputWeightActivity;->b(Lcom/huawei/ui/main/stories/health/activity/healthdata/InputWeightActivity;Ljava/util/Date;)Ljava/util/Date;

    .line 460
    new-instance v4, Ljava/text/SimpleDateFormat;

    invoke-static {}, Ljava/util/Locale;->getDefault()Ljava/util/Locale;

    move-result-object v0

    const-string v1, "yyyyMd"

    invoke-static {v0, v1}, Landroid/text/format/DateFormat;->getBestDateTimePattern(Ljava/util/Locale;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-direct {v4, v0}, Ljava/text/SimpleDateFormat;-><init>(Ljava/lang/String;)V

    .line 461
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputWeightActivity$2;->b:Lcom/huawei/ui/main/stories/health/activity/healthdata/InputWeightActivity;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputWeightActivity;->h(Lcom/huawei/ui/main/stories/health/activity/healthdata/InputWeightActivity;)Landroid/widget/TextView;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputWeightActivity$2;->b:Lcom/huawei/ui/main/stories/health/activity/healthdata/InputWeightActivity;

    invoke-static {v1}, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputWeightActivity;->g(Lcom/huawei/ui/main/stories/health/activity/healthdata/InputWeightActivity;)Ljava/util/Date;

    move-result-object v1

    invoke-virtual {v4, v1}, Ljava/text/SimpleDateFormat;->format(Ljava/util/Date;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 462
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputWeightActivity$2;->e:Ljava/util/Calendar;

    invoke-virtual {v0}, Ljava/util/Calendar;->clear()V

    .line 463
    return-void
.end method
