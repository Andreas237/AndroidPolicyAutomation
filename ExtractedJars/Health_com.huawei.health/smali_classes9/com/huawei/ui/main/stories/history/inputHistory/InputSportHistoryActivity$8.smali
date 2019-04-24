.class Lcom/huawei/ui/main/stories/history/inputHistory/InputSportHistoryActivity$8;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/ui/main/stories/history/inputHistory/InputSportHistoryActivity;->n()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic d:Lo/ffq;

.field final synthetic e:Lcom/huawei/ui/main/stories/history/inputHistory/InputSportHistoryActivity;


# direct methods
.method constructor <init>(Lcom/huawei/ui/main/stories/history/inputHistory/InputSportHistoryActivity;Lo/ffq;)V
    .locals 0

    .line 814
    iput-object p1, p0, Lcom/huawei/ui/main/stories/history/inputHistory/InputSportHistoryActivity$8;->e:Lcom/huawei/ui/main/stories/history/inputHistory/InputSportHistoryActivity;

    iput-object p2, p0, Lcom/huawei/ui/main/stories/history/inputHistory/InputSportHistoryActivity$8;->d:Lo/ffq;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 8

    .line 818
    iget-object v0, p0, Lcom/huawei/ui/main/stories/history/inputHistory/InputSportHistoryActivity$8;->e:Lcom/huawei/ui/main/stories/history/inputHistory/InputSportHistoryActivity;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/history/inputHistory/InputSportHistoryActivity$8;->d:Lo/ffq;

    .line 819
    invoke-virtual {v1}, Lo/ffq;->getSelectedHour()I

    move-result v4

    iget-object v1, p0, Lcom/huawei/ui/main/stories/history/inputHistory/InputSportHistoryActivity$8;->d:Lo/ffq;

    invoke-virtual {v1}, Lo/ffq;->getSelectedMinute()I

    move-result v5

    .line 818
    const/4 v1, -0x1

    const/4 v2, -0x1

    const/4 v3, -0x1

    invoke-static/range {v0 .. v5}, Lcom/huawei/ui/main/stories/history/inputHistory/InputSportHistoryActivity;->d(Lcom/huawei/ui/main/stories/history/inputHistory/InputSportHistoryActivity;IIIII)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 820
    return-void

    .line 822
    :cond_0
    iget-object v0, p0, Lcom/huawei/ui/main/stories/history/inputHistory/InputSportHistoryActivity$8;->e:Lcom/huawei/ui/main/stories/history/inputHistory/InputSportHistoryActivity;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/history/inputHistory/InputSportHistoryActivity$8;->d:Lo/ffq;

    invoke-virtual {v1}, Lo/ffq;->getSelectedHour()I

    move-result v1

    invoke-static {v0, v1}, Lcom/huawei/ui/main/stories/history/inputHistory/InputSportHistoryActivity;->g(Lcom/huawei/ui/main/stories/history/inputHistory/InputSportHistoryActivity;I)I

    .line 823
    iget-object v0, p0, Lcom/huawei/ui/main/stories/history/inputHistory/InputSportHistoryActivity$8;->e:Lcom/huawei/ui/main/stories/history/inputHistory/InputSportHistoryActivity;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/history/inputHistory/InputSportHistoryActivity$8;->d:Lo/ffq;

    invoke-virtual {v1}, Lo/ffq;->getSelectedMinute()I

    move-result v1

    invoke-static {v0, v1}, Lcom/huawei/ui/main/stories/history/inputHistory/InputSportHistoryActivity;->f(Lcom/huawei/ui/main/stories/history/inputHistory/InputSportHistoryActivity;I)I

    .line 824
    invoke-static {}, Ljava/util/Calendar;->getInstance()Ljava/util/Calendar;

    move-result-object v6

    .line 825
    iget-object v0, p0, Lcom/huawei/ui/main/stories/history/inputHistory/InputSportHistoryActivity$8;->e:Lcom/huawei/ui/main/stories/history/inputHistory/InputSportHistoryActivity;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/history/inputHistory/InputSportHistoryActivity;->p(Lcom/huawei/ui/main/stories/history/inputHistory/InputSportHistoryActivity;)I

    move-result v0

    const/16 v1, 0xb

    invoke-virtual {v6, v1, v0}, Ljava/util/Calendar;->set(II)V

    .line 826
    iget-object v0, p0, Lcom/huawei/ui/main/stories/history/inputHistory/InputSportHistoryActivity$8;->e:Lcom/huawei/ui/main/stories/history/inputHistory/InputSportHistoryActivity;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/history/inputHistory/InputSportHistoryActivity;->r(Lcom/huawei/ui/main/stories/history/inputHistory/InputSportHistoryActivity;)I

    move-result v0

    const/16 v1, 0xc

    invoke-virtual {v6, v1, v0}, Ljava/util/Calendar;->set(II)V

    .line 827
    iget-object v0, p0, Lcom/huawei/ui/main/stories/history/inputHistory/InputSportHistoryActivity$8;->e:Lcom/huawei/ui/main/stories/history/inputHistory/InputSportHistoryActivity;

    const/16 v1, 0xa

    invoke-virtual {v6, v1}, Ljava/util/Calendar;->get(I)I

    move-result v1

    invoke-static {v0, v1}, Lcom/huawei/ui/main/stories/history/inputHistory/InputSportHistoryActivity;->h(Lcom/huawei/ui/main/stories/history/inputHistory/InputSportHistoryActivity;I)I

    .line 828
    invoke-virtual {v6}, Ljava/util/Calendar;->getTime()Ljava/util/Date;

    move-result-object v7

    .line 829
    iget-object v0, p0, Lcom/huawei/ui/main/stories/history/inputHistory/InputSportHistoryActivity$8;->e:Lcom/huawei/ui/main/stories/history/inputHistory/InputSportHistoryActivity;

    const/16 v1, 0x9

    invoke-virtual {v6, v1}, Ljava/util/Calendar;->get(I)I

    move-result v1

    invoke-static {v0, v1}, Lcom/huawei/ui/main/stories/history/inputHistory/InputSportHistoryActivity;->i(Lcom/huawei/ui/main/stories/history/inputHistory/InputSportHistoryActivity;I)I

    .line 830
    iget-object v0, p0, Lcom/huawei/ui/main/stories/history/inputHistory/InputSportHistoryActivity$8;->e:Lcom/huawei/ui/main/stories/history/inputHistory/InputSportHistoryActivity;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/history/inputHistory/InputSportHistoryActivity;->t(Lcom/huawei/ui/main/stories/history/inputHistory/InputSportHistoryActivity;)Lo/egb;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/ui/main/stories/history/inputHistory/InputSportHistoryActivity$8;->e:Lcom/huawei/ui/main/stories/history/inputHistory/InputSportHistoryActivity;

    invoke-static {v1, v7}, Lcom/huawei/ui/main/stories/history/inputHistory/InputSportHistoryActivity;->a(Lcom/huawei/ui/main/stories/history/inputHistory/InputSportHistoryActivity;Ljava/util/Date;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/egb;->setText(Ljava/lang/CharSequence;)V

    .line 831
    iget-object v0, p0, Lcom/huawei/ui/main/stories/history/inputHistory/InputSportHistoryActivity$8;->e:Lcom/huawei/ui/main/stories/history/inputHistory/InputSportHistoryActivity;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/huawei/ui/main/stories/history/inputHistory/InputSportHistoryActivity;->c(Lcom/huawei/ui/main/stories/history/inputHistory/InputSportHistoryActivity;Z)Z

    .line 832
    iget-object v0, p0, Lcom/huawei/ui/main/stories/history/inputHistory/InputSportHistoryActivity$8;->e:Lcom/huawei/ui/main/stories/history/inputHistory/InputSportHistoryActivity;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/history/inputHistory/InputSportHistoryActivity$8;->e:Lcom/huawei/ui/main/stories/history/inputHistory/InputSportHistoryActivity;

    invoke-static {v1}, Lcom/huawei/ui/main/stories/history/inputHistory/InputSportHistoryActivity;->n(Lcom/huawei/ui/main/stories/history/inputHistory/InputSportHistoryActivity;)J

    move-result-wide v1

    invoke-static {v0, v1, v2}, Lcom/huawei/ui/main/stories/history/inputHistory/InputSportHistoryActivity;->d(Lcom/huawei/ui/main/stories/history/inputHistory/InputSportHistoryActivity;J)V

    .line 833
    invoke-virtual {v6}, Ljava/util/Calendar;->clear()V

    .line 835
    return-void
.end method
