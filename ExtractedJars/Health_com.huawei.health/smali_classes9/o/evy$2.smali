.class Lo/evy$2;
.super Landroid/content/BroadcastReceiver;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo/evy;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic d:Lo/evy;


# direct methods
.method constructor <init>(Lo/evy;)V
    .locals 0

    .line 648
    iput-object p1, p0, Lo/evy$2;->d:Lo/evy;

    invoke-direct {p0}, Landroid/content/BroadcastReceiver;-><init>()V

    return-void
.end method


# virtual methods
.method public onReceive(Landroid/content/Context;Landroid/content/Intent;)V
    .locals 13

    .line 652
    const-string v0, "refresh_type"

    const/4 v1, -0x1

    invoke-virtual {p2, v0, v1}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I

    move-result v11

    .line 653
    if-nez v11, :cond_0

    .line 654
    const-string v0, "SleepRefreshDataInteator"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "BroadcastReceiver: requestSuggestData "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 655
    invoke-static {}, Lo/czu;->b()Z

    move-result v0

    if-nez v0, :cond_0

    .line 656
    iget-object v0, p0, Lo/evy$2;->d:Lo/evy;

    invoke-virtual {v0}, Lo/evy;->c()V

    .line 657
    iget-object v0, p0, Lo/evy$2;->d:Lo/evy;

    invoke-static {v0}, Lo/evy;->c(Lo/evy;)Lo/fiz;

    move-result-object v0

    invoke-virtual {v0}, Lo/fiz;->d()Z

    move-result v12

    .line 658
    if-eqz v12, :cond_0

    .line 659
    iget-object v0, p0, Lo/evy$2;->d:Lo/evy;

    invoke-static {}, Lo/evy;->a()Landroid/content/Context;

    move-result-object v1

    sget v2, Lcom/huawei/ui/main/R$string;->IDS_fitness_core_sleep_sleep_questionnaire:I

    invoke-virtual {v1, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    const-string v2, ""

    const-string v3, "https://messagecenter.hicloud.com/messageH5/sleephtml/QuestionnaireFrontpage.html"

    const-string v4, "00002400"

    .line 662
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v7

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v9

    .line 659
    const v5, 0x13884

    const/4 v6, 0x5

    invoke-static/range {v0 .. v10}, Lo/evy;->b(Lo/evy;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IIJJ)V

    .line 667
    :cond_0
    return-void
.end method
