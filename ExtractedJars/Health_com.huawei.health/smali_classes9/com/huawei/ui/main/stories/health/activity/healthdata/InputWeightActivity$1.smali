.class Lcom/huawei/ui/main/stories/health/activity/healthdata/InputWeightActivity$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/fey$b;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/ui/main/stories/health/activity/healthdata/InputWeightActivity;->f()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:Lcom/huawei/ui/main/stories/health/activity/healthdata/InputWeightActivity;


# direct methods
.method constructor <init>(Lcom/huawei/ui/main/stories/health/activity/healthdata/InputWeightActivity;)V
    .locals 0

    .line 481
    iput-object p1, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputWeightActivity$1;->b:Lcom/huawei/ui/main/stories/health/activity/healthdata/InputWeightActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public b(Landroid/app/Dialog;III)V
    .locals 6

    .line 485
    const-string v0, "UIHLH_InputWeightActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "hour="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, ", minute="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 486
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputWeightActivity$1;->b:Lcom/huawei/ui/main/stories/health/activity/healthdata/InputWeightActivity;

    invoke-static {v0, p3}, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputWeightActivity;->b(Lcom/huawei/ui/main/stories/health/activity/healthdata/InputWeightActivity;I)I

    .line 487
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputWeightActivity$1;->b:Lcom/huawei/ui/main/stories/health/activity/healthdata/InputWeightActivity;

    invoke-static {v0, p4}, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputWeightActivity;->e(Lcom/huawei/ui/main/stories/health/activity/healthdata/InputWeightActivity;I)I

    .line 489
    invoke-static {}, Ljava/util/Calendar;->getInstance()Ljava/util/Calendar;

    move-result-object v4

    .line 490
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputWeightActivity$1;->b:Lcom/huawei/ui/main/stories/health/activity/healthdata/InputWeightActivity;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputWeightActivity;->b(Lcom/huawei/ui/main/stories/health/activity/healthdata/InputWeightActivity;)I

    move-result v0

    const/4 v1, 0x1

    invoke-virtual {v4, v1, v0}, Ljava/util/Calendar;->set(II)V

    .line 491
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputWeightActivity$1;->b:Lcom/huawei/ui/main/stories/health/activity/healthdata/InputWeightActivity;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputWeightActivity;->c(Lcom/huawei/ui/main/stories/health/activity/healthdata/InputWeightActivity;)I

    move-result v0

    add-int/lit8 v0, v0, -0x1

    const/4 v1, 0x2

    invoke-virtual {v4, v1, v0}, Ljava/util/Calendar;->set(II)V

    .line 492
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputWeightActivity$1;->b:Lcom/huawei/ui/main/stories/health/activity/healthdata/InputWeightActivity;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputWeightActivity;->a(Lcom/huawei/ui/main/stories/health/activity/healthdata/InputWeightActivity;)I

    move-result v0

    const/4 v1, 0x5

    invoke-virtual {v4, v1, v0}, Ljava/util/Calendar;->set(II)V

    .line 493
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputWeightActivity$1;->b:Lcom/huawei/ui/main/stories/health/activity/healthdata/InputWeightActivity;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputWeightActivity;->d(Lcom/huawei/ui/main/stories/health/activity/healthdata/InputWeightActivity;)I

    move-result v0

    const/16 v1, 0xb

    invoke-virtual {v4, v1, v0}, Ljava/util/Calendar;->set(II)V

    .line 494
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputWeightActivity$1;->b:Lcom/huawei/ui/main/stories/health/activity/healthdata/InputWeightActivity;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputWeightActivity;->e(Lcom/huawei/ui/main/stories/health/activity/healthdata/InputWeightActivity;)I

    move-result v0

    const/16 v1, 0xc

    invoke-virtual {v4, v1, v0}, Ljava/util/Calendar;->set(II)V

    .line 495
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputWeightActivity$1;->b:Lcom/huawei/ui/main/stories/health/activity/healthdata/InputWeightActivity;

    invoke-virtual {v4}, Ljava/util/Calendar;->getTimeInMillis()J

    move-result-wide v1

    invoke-static {v0, v1, v2}, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputWeightActivity;->b(Lcom/huawei/ui/main/stories/health/activity/healthdata/InputWeightActivity;J)J

    .line 497
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputWeightActivity$1;->b:Lcom/huawei/ui/main/stories/health/activity/healthdata/InputWeightActivity;

    invoke-virtual {v4}, Ljava/util/Calendar;->getTime()Ljava/util/Date;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputWeightActivity;->b(Lcom/huawei/ui/main/stories/health/activity/healthdata/InputWeightActivity;Ljava/util/Date;)Ljava/util/Date;

    .line 499
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputWeightActivity$1;->b:Lcom/huawei/ui/main/stories/health/activity/healthdata/InputWeightActivity;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputWeightActivity;->f(Lcom/huawei/ui/main/stories/health/activity/healthdata/InputWeightActivity;)Landroid/content/Context;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Landroid/text/format/DateFormat;->getTimeFormat(Landroid/content/Context;)Ljava/text/DateFormat;

    move-result-object v5

    .line 500
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputWeightActivity$1;->b:Lcom/huawei/ui/main/stories/health/activity/healthdata/InputWeightActivity;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputWeightActivity;->i(Lcom/huawei/ui/main/stories/health/activity/healthdata/InputWeightActivity;)Landroid/widget/TextView;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputWeightActivity$1;->b:Lcom/huawei/ui/main/stories/health/activity/healthdata/InputWeightActivity;

    invoke-static {v1}, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputWeightActivity;->g(Lcom/huawei/ui/main/stories/health/activity/healthdata/InputWeightActivity;)Ljava/util/Date;

    move-result-object v1

    invoke-virtual {v5, v1}, Ljava/text/DateFormat;->format(Ljava/util/Date;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 502
    invoke-virtual {v4}, Ljava/util/Calendar;->clear()V

    .line 503
    invoke-virtual {p1}, Landroid/app/Dialog;->dismiss()V

    .line 504
    return-void
.end method
