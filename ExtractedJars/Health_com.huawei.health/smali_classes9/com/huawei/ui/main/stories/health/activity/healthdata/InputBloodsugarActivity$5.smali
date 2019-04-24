.class Lcom/huawei/ui/main/stories/health/activity/healthdata/InputBloodsugarActivity$5;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/ui/main/stories/health/activity/healthdata/InputBloodsugarActivity;->c()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Ljava/util/Calendar;

.field final synthetic c:Lo/fgi;

.field final synthetic e:Lcom/huawei/ui/main/stories/health/activity/healthdata/InputBloodsugarActivity;


# direct methods
.method constructor <init>(Lcom/huawei/ui/main/stories/health/activity/healthdata/InputBloodsugarActivity;Lo/fgi;Ljava/util/Calendar;)V
    .locals 0

    .line 250
    iput-object p1, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputBloodsugarActivity$5;->e:Lcom/huawei/ui/main/stories/health/activity/healthdata/InputBloodsugarActivity;

    iput-object p2, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputBloodsugarActivity$5;->c:Lo/fgi;

    iput-object p3, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputBloodsugarActivity$5;->a:Ljava/util/Calendar;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 5

    .line 253
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputBloodsugarActivity$5;->e:Lcom/huawei/ui/main/stories/health/activity/healthdata/InputBloodsugarActivity;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputBloodsugarActivity$5;->c:Lo/fgi;

    invoke-virtual {v1}, Lo/fgi;->getSelectedYear()I

    move-result v1

    invoke-static {v0, v1}, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputBloodsugarActivity;->d(Lcom/huawei/ui/main/stories/health/activity/healthdata/InputBloodsugarActivity;I)I

    .line 254
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputBloodsugarActivity$5;->e:Lcom/huawei/ui/main/stories/health/activity/healthdata/InputBloodsugarActivity;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputBloodsugarActivity$5;->c:Lo/fgi;

    invoke-virtual {v1}, Lo/fgi;->getSelectedMonth()I

    move-result v1

    invoke-static {v0, v1}, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputBloodsugarActivity;->c(Lcom/huawei/ui/main/stories/health/activity/healthdata/InputBloodsugarActivity;I)I

    .line 255
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputBloodsugarActivity$5;->e:Lcom/huawei/ui/main/stories/health/activity/healthdata/InputBloodsugarActivity;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputBloodsugarActivity$5;->c:Lo/fgi;

    invoke-virtual {v1}, Lo/fgi;->getSelectedDay()I

    move-result v1

    invoke-static {v0, v1}, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputBloodsugarActivity;->e(Lcom/huawei/ui/main/stories/health/activity/healthdata/InputBloodsugarActivity;I)I

    .line 256
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputBloodsugarActivity$5;->a:Ljava/util/Calendar;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputBloodsugarActivity$5;->e:Lcom/huawei/ui/main/stories/health/activity/healthdata/InputBloodsugarActivity;

    invoke-static {v1}, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputBloodsugarActivity;->i(Lcom/huawei/ui/main/stories/health/activity/healthdata/InputBloodsugarActivity;)I

    move-result v1

    iget-object v2, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputBloodsugarActivity$5;->e:Lcom/huawei/ui/main/stories/health/activity/healthdata/InputBloodsugarActivity;

    invoke-static {v2}, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputBloodsugarActivity;->k(Lcom/huawei/ui/main/stories/health/activity/healthdata/InputBloodsugarActivity;)I

    move-result v2

    add-int/lit8 v2, v2, -0x1

    iget-object v3, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputBloodsugarActivity$5;->e:Lcom/huawei/ui/main/stories/health/activity/healthdata/InputBloodsugarActivity;

    invoke-static {v3}, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputBloodsugarActivity;->f(Lcom/huawei/ui/main/stories/health/activity/healthdata/InputBloodsugarActivity;)I

    move-result v3

    invoke-virtual {v0, v1, v2, v3}, Ljava/util/Calendar;->set(III)V

    .line 257
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputBloodsugarActivity$5;->a:Ljava/util/Calendar;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputBloodsugarActivity$5;->e:Lcom/huawei/ui/main/stories/health/activity/healthdata/InputBloodsugarActivity;

    invoke-static {v1}, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputBloodsugarActivity;->g(Lcom/huawei/ui/main/stories/health/activity/healthdata/InputBloodsugarActivity;)I

    move-result v1

    const/16 v2, 0xb

    invoke-virtual {v0, v2, v1}, Ljava/util/Calendar;->set(II)V

    .line 258
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputBloodsugarActivity$5;->a:Ljava/util/Calendar;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputBloodsugarActivity$5;->e:Lcom/huawei/ui/main/stories/health/activity/healthdata/InputBloodsugarActivity;

    invoke-static {v1}, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputBloodsugarActivity;->h(Lcom/huawei/ui/main/stories/health/activity/healthdata/InputBloodsugarActivity;)I

    move-result v1

    const/16 v2, 0xc

    invoke-virtual {v0, v2, v1}, Ljava/util/Calendar;->set(II)V

    .line 259
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputBloodsugarActivity$5;->e:Lcom/huawei/ui/main/stories/health/activity/healthdata/InputBloodsugarActivity;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputBloodsugarActivity$5;->a:Ljava/util/Calendar;

    invoke-virtual {v1}, Ljava/util/Calendar;->getTimeInMillis()J

    move-result-wide v1

    invoke-static {v0, v1, v2}, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputBloodsugarActivity;->e(Lcom/huawei/ui/main/stories/health/activity/healthdata/InputBloodsugarActivity;J)J

    .line 260
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputBloodsugarActivity$5;->e:Lcom/huawei/ui/main/stories/health/activity/healthdata/InputBloodsugarActivity;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputBloodsugarActivity$5;->a:Ljava/util/Calendar;

    invoke-virtual {v1}, Ljava/util/Calendar;->getTime()Ljava/util/Date;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputBloodsugarActivity;->e(Lcom/huawei/ui/main/stories/health/activity/healthdata/InputBloodsugarActivity;Ljava/util/Date;)Ljava/util/Date;

    .line 261
    new-instance v4, Ljava/text/SimpleDateFormat;

    invoke-static {}, Ljava/util/Locale;->getDefault()Ljava/util/Locale;

    move-result-object v0

    const-string v1, "yyyyMd"

    invoke-static {v0, v1}, Landroid/text/format/DateFormat;->getBestDateTimePattern(Ljava/util/Locale;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-direct {v4, v0}, Ljava/text/SimpleDateFormat;-><init>(Ljava/lang/String;)V

    .line 262
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputBloodsugarActivity$5;->e:Lcom/huawei/ui/main/stories/health/activity/healthdata/InputBloodsugarActivity;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputBloodsugarActivity;->l(Lcom/huawei/ui/main/stories/health/activity/healthdata/InputBloodsugarActivity;)Lo/egb;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputBloodsugarActivity$5;->e:Lcom/huawei/ui/main/stories/health/activity/healthdata/InputBloodsugarActivity;

    invoke-static {v1}, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputBloodsugarActivity;->p(Lcom/huawei/ui/main/stories/health/activity/healthdata/InputBloodsugarActivity;)Ljava/util/Date;

    move-result-object v1

    invoke-virtual {v4, v1}, Ljava/text/SimpleDateFormat;->format(Ljava/util/Date;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/egb;->setText(Ljava/lang/CharSequence;)V

    .line 263
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputBloodsugarActivity$5;->a:Ljava/util/Calendar;

    invoke-virtual {v0}, Ljava/util/Calendar;->clear()V

    .line 264
    return-void
.end method
