.class public Lcom/huawei/ui/main/stories/me/activity/autotrack/DeveloperAutoTrackDistanceSaveSettingActivity;
.super Lcom/huawei/ui/commonui/base/BaseActivity;
.source "SourceFile"


# instance fields
.field private a:Landroid/os/Handler;

.field private b:Ljava/lang/Runnable;

.field private c:Lo/cbz;

.field private d:Landroid/widget/EditText;

.field private e:Landroid/content/Context;

.field private f:Landroid/widget/EditText;

.field private g:Landroid/widget/TextView;

.field private h:Landroid/widget/TextView;

.field private i:Landroid/widget/TextView;

.field private k:Landroid/widget/EditText;

.field private l:Landroid/widget/TextView;

.field private m:Landroid/widget/TextView;

.field private n:Z

.field private o:Ljava/lang/String;

.field private p:Landroid/widget/Button;

.field private r:Ljava/util/concurrent/ExecutorService;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 32
    invoke-direct {p0}, Lcom/huawei/ui/commonui/base/BaseActivity;-><init>()V

    .line 42
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/autotrack/DeveloperAutoTrackDistanceSaveSettingActivity;->e:Landroid/content/Context;

    .line 46
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/autotrack/DeveloperAutoTrackDistanceSaveSettingActivity;->a:Landroid/os/Handler;

    .line 47
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/autotrack/DeveloperAutoTrackDistanceSaveSettingActivity;->b:Ljava/lang/Runnable;

    .line 55
    const-string v0, "false"

    iput-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/autotrack/DeveloperAutoTrackDistanceSaveSettingActivity;->o:Ljava/lang/String;

    .line 56
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/ui/main/stories/me/activity/autotrack/DeveloperAutoTrackDistanceSaveSettingActivity;->n:Z

    return-void
.end method

.method static synthetic a(Lcom/huawei/ui/main/stories/me/activity/autotrack/DeveloperAutoTrackDistanceSaveSettingActivity;)Ljava/lang/String;
    .locals 1

    .line 32
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/autotrack/DeveloperAutoTrackDistanceSaveSettingActivity;->o:Ljava/lang/String;

    return-object v0
.end method

.method private a()V
    .locals 1

    .line 126
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/autotrack/DeveloperAutoTrackDistanceSaveSettingActivity;->c:Lo/cbz;

    if-nez v0, :cond_0

    .line 127
    new-instance v0, Lo/cbz;

    invoke-direct {v0}, Lo/cbz;-><init>()V

    iput-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/autotrack/DeveloperAutoTrackDistanceSaveSettingActivity;->c:Lo/cbz;

    .line 130
    :cond_0
    invoke-direct {p0}, Lcom/huawei/ui/main/stories/me/activity/autotrack/DeveloperAutoTrackDistanceSaveSettingActivity;->k()V

    .line 131
    invoke-direct {p0}, Lcom/huawei/ui/main/stories/me/activity/autotrack/DeveloperAutoTrackDistanceSaveSettingActivity;->g()V

    .line 132
    invoke-direct {p0}, Lcom/huawei/ui/main/stories/me/activity/autotrack/DeveloperAutoTrackDistanceSaveSettingActivity;->h()V

    .line 133
    invoke-direct {p0}, Lcom/huawei/ui/main/stories/me/activity/autotrack/DeveloperAutoTrackDistanceSaveSettingActivity;->f()V

    .line 134
    invoke-direct {p0}, Lcom/huawei/ui/main/stories/me/activity/autotrack/DeveloperAutoTrackDistanceSaveSettingActivity;->o()V

    .line 135
    invoke-direct {p0}, Lcom/huawei/ui/main/stories/me/activity/autotrack/DeveloperAutoTrackDistanceSaveSettingActivity;->m()V

    .line 136
    invoke-direct {p0}, Lcom/huawei/ui/main/stories/me/activity/autotrack/DeveloperAutoTrackDistanceSaveSettingActivity;->n()V

    .line 137
    invoke-direct {p0}, Lcom/huawei/ui/main/stories/me/activity/autotrack/DeveloperAutoTrackDistanceSaveSettingActivity;->i()V

    .line 138
    invoke-direct {p0}, Lcom/huawei/ui/main/stories/me/activity/autotrack/DeveloperAutoTrackDistanceSaveSettingActivity;->d()V

    .line 139
    invoke-direct {p0}, Lcom/huawei/ui/main/stories/me/activity/autotrack/DeveloperAutoTrackDistanceSaveSettingActivity;->e()V

    .line 141
    return-void
.end method

.method private b()V
    .locals 4

    .line 164
    iget-boolean v0, p0, Lcom/huawei/ui/main/stories/me/activity/autotrack/DeveloperAutoTrackDistanceSaveSettingActivity;->n:Z

    if-eqz v0, :cond_0

    .line 165
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/autotrack/DeveloperAutoTrackDistanceSaveSettingActivity;->e:Landroid/content/Context;

    invoke-static {v0}, Lo/cbu;->c(Landroid/content/Context;)Lo/cbu;

    move-result-object v0

    invoke-virtual {v0}, Lo/cbu;->aq()F

    move-result v3

    .line 166
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/autotrack/DeveloperAutoTrackDistanceSaveSettingActivity;->m:Landroid/widget/TextView;

    invoke-static {v3}, Ljava/lang/Float;->toString(F)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 167
    goto :goto_0

    .line 169
    :cond_0
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/autotrack/DeveloperAutoTrackDistanceSaveSettingActivity;->m:Landroid/widget/TextView;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/me/activity/autotrack/DeveloperAutoTrackDistanceSaveSettingActivity;->e:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/ui/main/R$string;->IDS_hw_autotrack__developer_autotrack_distance_number:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 171
    :goto_0
    return-void
.end method

.method static synthetic b(Lcom/huawei/ui/main/stories/me/activity/autotrack/DeveloperAutoTrackDistanceSaveSettingActivity;)V
    .locals 0

    .line 32
    invoke-direct {p0}, Lcom/huawei/ui/main/stories/me/activity/autotrack/DeveloperAutoTrackDistanceSaveSettingActivity;->b()V

    return-void
.end method

.method static synthetic b(Lcom/huawei/ui/main/stories/me/activity/autotrack/DeveloperAutoTrackDistanceSaveSettingActivity;Ljava/lang/String;)V
    .locals 0

    .line 32
    invoke-direct {p0, p1}, Lcom/huawei/ui/main/stories/me/activity/autotrack/DeveloperAutoTrackDistanceSaveSettingActivity;->c(Ljava/lang/String;)V

    return-void
.end method

.method static synthetic c(Lcom/huawei/ui/main/stories/me/activity/autotrack/DeveloperAutoTrackDistanceSaveSettingActivity;)Landroid/os/Handler;
    .locals 1

    .line 32
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/autotrack/DeveloperAutoTrackDistanceSaveSettingActivity;->a:Landroid/os/Handler;

    return-object v0
.end method

.method private c()V
    .locals 4

    .line 154
    iget-boolean v0, p0, Lcom/huawei/ui/main/stories/me/activity/autotrack/DeveloperAutoTrackDistanceSaveSettingActivity;->n:Z

    if-eqz v0, :cond_0

    .line 155
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/autotrack/DeveloperAutoTrackDistanceSaveSettingActivity;->e:Landroid/content/Context;

    invoke-static {v0}, Lo/cbu;->c(Landroid/content/Context;)Lo/cbu;

    move-result-object v0

    invoke-virtual {v0}, Lo/cbu;->g()F

    move-result v3

    .line 156
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/autotrack/DeveloperAutoTrackDistanceSaveSettingActivity;->l:Landroid/widget/TextView;

    invoke-static {v3}, Ljava/lang/Float;->toString(F)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 157
    goto :goto_0

    .line 159
    :cond_0
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/autotrack/DeveloperAutoTrackDistanceSaveSettingActivity;->l:Landroid/widget/TextView;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/me/activity/autotrack/DeveloperAutoTrackDistanceSaveSettingActivity;->e:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/ui/main/R$string;->IDS_hw_autotrack__developer_autotrack_distance_number:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 161
    :goto_0
    return-void
.end method

.method private c(Ljava/lang/String;)V
    .locals 3

    .line 209
    const-string v0, "false"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 210
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/autotrack/DeveloperAutoTrackDistanceSaveSettingActivity;->i:Landroid/widget/TextView;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/me/activity/autotrack/DeveloperAutoTrackDistanceSaveSettingActivity;->e:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/ui/main/R$string;->IDS_hw_autotrack__developer_false:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    goto :goto_0

    .line 213
    :cond_0
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/autotrack/DeveloperAutoTrackDistanceSaveSettingActivity;->i:Landroid/widget/TextView;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/me/activity/autotrack/DeveloperAutoTrackDistanceSaveSettingActivity;->e:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/ui/main/R$string;->IDS_hw_autotrack__developer_true:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 215
    :goto_0
    return-void
.end method

.method private d()V
    .locals 1

    .line 144
    sget v0, Lcom/huawei/ui/main/R$id;->auto_track_distance:I

    invoke-virtual {p0, v0}, Lcom/huawei/ui/main/stories/me/activity/autotrack/DeveloperAutoTrackDistanceSaveSettingActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/autotrack/DeveloperAutoTrackDistanceSaveSettingActivity;->l:Landroid/widget/TextView;

    .line 145
    invoke-direct {p0}, Lcom/huawei/ui/main/stories/me/activity/autotrack/DeveloperAutoTrackDistanceSaveSettingActivity;->c()V

    .line 146
    return-void
.end method

.method static synthetic d(Lcom/huawei/ui/main/stories/me/activity/autotrack/DeveloperAutoTrackDistanceSaveSettingActivity;)V
    .locals 0

    .line 32
    invoke-direct {p0}, Lcom/huawei/ui/main/stories/me/activity/autotrack/DeveloperAutoTrackDistanceSaveSettingActivity;->c()V

    return-void
.end method

.method static synthetic d(Lcom/huawei/ui/main/stories/me/activity/autotrack/DeveloperAutoTrackDistanceSaveSettingActivity;Z)Z
    .locals 0

    .line 32
    iput-boolean p1, p0, Lcom/huawei/ui/main/stories/me/activity/autotrack/DeveloperAutoTrackDistanceSaveSettingActivity;->n:Z

    return p1
.end method

.method static synthetic e(Lcom/huawei/ui/main/stories/me/activity/autotrack/DeveloperAutoTrackDistanceSaveSettingActivity;)Landroid/content/Context;
    .locals 1

    .line 32
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/autotrack/DeveloperAutoTrackDistanceSaveSettingActivity;->e:Landroid/content/Context;

    return-object v0
.end method

.method static synthetic e(Lcom/huawei/ui/main/stories/me/activity/autotrack/DeveloperAutoTrackDistanceSaveSettingActivity;Ljava/lang/String;)Ljava/lang/String;
    .locals 0

    .line 32
    iput-object p1, p0, Lcom/huawei/ui/main/stories/me/activity/autotrack/DeveloperAutoTrackDistanceSaveSettingActivity;->o:Ljava/lang/String;

    return-object p1
.end method

.method private e(Ljava/util/ArrayList;I)Ljava/lang/String;
    .locals 5

    .line 321
    new-instance v3, Ljava/lang/StringBuffer;

    invoke-direct {v3}, Ljava/lang/StringBuffer;-><init>()V

    .line 322
    const/4 v0, 0x5

    if-ge p2, v0, :cond_1

    .line 323
    add-int/lit8 v4, p2, -0x1

    :goto_0
    const/4 v0, -0x1

    if-le v4, v0, :cond_0

    .line 324
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, " start "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, " times  "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {p1, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    move-result-wide v1

    invoke-virtual {p0, v1, v2}, Lcom/huawei/ui/main/stories/me/activity/autotrack/DeveloperAutoTrackDistanceSaveSettingActivity;->b(J)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "\n"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v3, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 323
    add-int/lit8 v4, v4, -0x1

    goto :goto_0

    :cond_0
    goto :goto_2

    .line 328
    :cond_1
    add-int/lit8 v4, p2, -0x1

    :goto_1
    add-int/lit8 v0, p2, -0x1

    add-int/lit8 v0, v0, -0x5

    if-le v4, v0, :cond_2

    .line 329
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, " start "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, " times  "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {p1, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    move-result-wide v1

    invoke-virtual {p0, v1, v2}, Lcom/huawei/ui/main/stories/me/activity/autotrack/DeveloperAutoTrackDistanceSaveSettingActivity;->b(J)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "\n"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v3, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 328
    add-int/lit8 v4, v4, -0x1

    goto :goto_1

    .line 332
    :cond_2
    :goto_2
    invoke-virtual {v3}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;

    move-result-object v4

    .line 333
    return-object v4
.end method

.method private e()V
    .locals 1

    .line 149
    sget v0, Lcom/huawei/ui/main/R$id;->auto_track_snapshot_distance:I

    invoke-virtual {p0, v0}, Lcom/huawei/ui/main/stories/me/activity/autotrack/DeveloperAutoTrackDistanceSaveSettingActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/autotrack/DeveloperAutoTrackDistanceSaveSettingActivity;->m:Landroid/widget/TextView;

    .line 150
    invoke-direct {p0}, Lcom/huawei/ui/main/stories/me/activity/autotrack/DeveloperAutoTrackDistanceSaveSettingActivity;->b()V

    .line 151
    return-void
.end method

.method static synthetic e(Lcom/huawei/ui/main/stories/me/activity/autotrack/DeveloperAutoTrackDistanceSaveSettingActivity;Z)V
    .locals 0

    .line 32
    invoke-direct {p0, p1}, Lcom/huawei/ui/main/stories/me/activity/autotrack/DeveloperAutoTrackDistanceSaveSettingActivity;->e(Z)V

    return-void
.end method

.method private e(Z)V
    .locals 3

    .line 338
    new-instance v2, Landroid/content/Intent;

    const-string v0, "com.huawei.health.track.config"

    invoke-direct {v2, v0}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    .line 339
    const-string v0, "com.huawei.health"

    invoke-virtual {v2, v0}, Landroid/content/Intent;->setPackage(Ljava/lang/String;)Landroid/content/Intent;

    .line 340
    const-string v0, "com.huawei.health"

    const-string v1, "com.huawei.health.manager.DaemonService"

    invoke-virtual {v2, v0, v1}, Landroid/content/Intent;->setClassName(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 341
    const-string v0, "autotrack_enable"

    invoke-virtual {v2, v0, p1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Z)Landroid/content/Intent;

    .line 342
    const-string v0, "start_delay"

    iget-object v1, p0, Lcom/huawei/ui/main/stories/me/activity/autotrack/DeveloperAutoTrackDistanceSaveSettingActivity;->c:Lo/cbz;

    invoke-virtual {v1}, Lo/cbz;->d()I

    move-result v1

    invoke-virtual {v2, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    .line 343
    const-string v0, "stop_delay"

    iget-object v1, p0, Lcom/huawei/ui/main/stories/me/activity/autotrack/DeveloperAutoTrackDistanceSaveSettingActivity;->c:Lo/cbz;

    invoke-virtual {v1}, Lo/cbz;->e()I

    move-result v1

    invoke-virtual {v2, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    .line 345
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/autotrack/DeveloperAutoTrackDistanceSaveSettingActivity;->e:Landroid/content/Context;

    if-eqz v0, :cond_0

    .line 346
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/autotrack/DeveloperAutoTrackDistanceSaveSettingActivity;->e:Landroid/content/Context;

    invoke-virtual {v0, v2}, Landroid/content/Context;->startService(Landroid/content/Intent;)Landroid/content/ComponentName;

    .line 348
    :cond_0
    return-void
.end method

.method private f()V
    .locals 3

    .line 194
    sget v0, Lcom/huawei/ui/main/R$id;->support_ability_text:I

    invoke-virtual {p0, v0}, Lcom/huawei/ui/main/stories/me/activity/autotrack/DeveloperAutoTrackDistanceSaveSettingActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/autotrack/DeveloperAutoTrackDistanceSaveSettingActivity;->h:Landroid/widget/TextView;

    .line 195
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/autotrack/DeveloperAutoTrackDistanceSaveSettingActivity;->c:Lo/cbz;

    invoke-virtual {v0}, Lo/cbz;->c()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 196
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/autotrack/DeveloperAutoTrackDistanceSaveSettingActivity;->h:Landroid/widget/TextView;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/me/activity/autotrack/DeveloperAutoTrackDistanceSaveSettingActivity;->e:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/ui/main/R$string;->IDS_hw_autotrack__developer_true:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    goto :goto_0

    .line 199
    :cond_0
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/autotrack/DeveloperAutoTrackDistanceSaveSettingActivity;->h:Landroid/widget/TextView;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/me/activity/autotrack/DeveloperAutoTrackDistanceSaveSettingActivity;->e:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/ui/main/R$string;->IDS_hw_autotrack__developer_false:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 201
    :goto_0
    return-void
.end method

.method static synthetic f(Lcom/huawei/ui/main/stories/me/activity/autotrack/DeveloperAutoTrackDistanceSaveSettingActivity;)Z
    .locals 1

    .line 32
    invoke-direct {p0}, Lcom/huawei/ui/main/stories/me/activity/autotrack/DeveloperAutoTrackDistanceSaveSettingActivity;->l()Z

    move-result v0

    return v0
.end method

.method private g()V
    .locals 2

    .line 184
    sget v0, Lcom/huawei/ui/main/R$id;->stop_delay_text:I

    invoke-virtual {p0, v0}, Lcom/huawei/ui/main/stories/me/activity/autotrack/DeveloperAutoTrackDistanceSaveSettingActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/EditText;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/autotrack/DeveloperAutoTrackDistanceSaveSettingActivity;->f:Landroid/widget/EditText;

    .line 185
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/autotrack/DeveloperAutoTrackDistanceSaveSettingActivity;->f:Landroid/widget/EditText;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/me/activity/autotrack/DeveloperAutoTrackDistanceSaveSettingActivity;->c:Lo/cbz;

    invoke-virtual {v1}, Lo/cbz;->e()I

    move-result v1

    invoke-static {v1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/EditText;->setText(Ljava/lang/CharSequence;)V

    .line 186
    return-void
.end method

.method static synthetic g(Lcom/huawei/ui/main/stories/me/activity/autotrack/DeveloperAutoTrackDistanceSaveSettingActivity;)V
    .locals 0

    .line 32
    invoke-direct {p0}, Lcom/huawei/ui/main/stories/me/activity/autotrack/DeveloperAutoTrackDistanceSaveSettingActivity;->h()V

    return-void
.end method

.method private h()V
    .locals 2

    .line 189
    sget v0, Lcom/huawei/ui/main/R$id;->min_save_distance_text:I

    invoke-virtual {p0, v0}, Lcom/huawei/ui/main/stories/me/activity/autotrack/DeveloperAutoTrackDistanceSaveSettingActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/EditText;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/autotrack/DeveloperAutoTrackDistanceSaveSettingActivity;->k:Landroid/widget/EditText;

    .line 190
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/autotrack/DeveloperAutoTrackDistanceSaveSettingActivity;->k:Landroid/widget/EditText;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/me/activity/autotrack/DeveloperAutoTrackDistanceSaveSettingActivity;->c:Lo/cbz;

    invoke-virtual {v1}, Lo/cbz;->h()F

    move-result v1

    invoke-static {v1}, Ljava/lang/String;->valueOf(F)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/EditText;->setText(Ljava/lang/CharSequence;)V

    .line 191
    return-void
.end method

.method static synthetic h(Lcom/huawei/ui/main/stories/me/activity/autotrack/DeveloperAutoTrackDistanceSaveSettingActivity;)V
    .locals 0

    .line 32
    invoke-direct {p0}, Lcom/huawei/ui/main/stories/me/activity/autotrack/DeveloperAutoTrackDistanceSaveSettingActivity;->k()V

    return-void
.end method

.method private i()V
    .locals 1

    .line 174
    sget v0, Lcom/huawei/ui/main/R$id;->atuo_track_start_time_list:I

    invoke-virtual {p0, v0}, Lcom/huawei/ui/main/stories/me/activity/autotrack/DeveloperAutoTrackDistanceSaveSettingActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/autotrack/DeveloperAutoTrackDistanceSaveSettingActivity;->g:Landroid/widget/TextView;

    .line 175
    invoke-direct {p0}, Lcom/huawei/ui/main/stories/me/activity/autotrack/DeveloperAutoTrackDistanceSaveSettingActivity;->p()V

    .line 176
    return-void
.end method

.method static synthetic i(Lcom/huawei/ui/main/stories/me/activity/autotrack/DeveloperAutoTrackDistanceSaveSettingActivity;)V
    .locals 0

    .line 32
    invoke-direct {p0}, Lcom/huawei/ui/main/stories/me/activity/autotrack/DeveloperAutoTrackDistanceSaveSettingActivity;->g()V

    return-void
.end method

.method static synthetic k(Lcom/huawei/ui/main/stories/me/activity/autotrack/DeveloperAutoTrackDistanceSaveSettingActivity;)Lo/cbz;
    .locals 1

    .line 32
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/autotrack/DeveloperAutoTrackDistanceSaveSettingActivity;->c:Lo/cbz;

    return-object v0
.end method

.method private k()V
    .locals 2

    .line 179
    sget v0, Lcom/huawei/ui/main/R$id;->start_delay_text:I

    invoke-virtual {p0, v0}, Lcom/huawei/ui/main/stories/me/activity/autotrack/DeveloperAutoTrackDistanceSaveSettingActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/EditText;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/autotrack/DeveloperAutoTrackDistanceSaveSettingActivity;->d:Landroid/widget/EditText;

    .line 180
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/autotrack/DeveloperAutoTrackDistanceSaveSettingActivity;->d:Landroid/widget/EditText;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/me/activity/autotrack/DeveloperAutoTrackDistanceSaveSettingActivity;->c:Lo/cbz;

    invoke-virtual {v1}, Lo/cbz;->d()I

    move-result v1

    invoke-static {v1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/EditText;->setText(Ljava/lang/CharSequence;)V

    .line 181
    return-void
.end method

.method static synthetic l(Lcom/huawei/ui/main/stories/me/activity/autotrack/DeveloperAutoTrackDistanceSaveSettingActivity;)Landroid/widget/EditText;
    .locals 1

    .line 32
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/autotrack/DeveloperAutoTrackDistanceSaveSettingActivity;->k:Landroid/widget/EditText;

    return-object v0
.end method

.method private l()Z
    .locals 10

    .line 283
    :try_start_0
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/autotrack/DeveloperAutoTrackDistanceSaveSettingActivity;->d:Landroid/widget/EditText;

    invoke-virtual {v0}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v4

    .line 284
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/autotrack/DeveloperAutoTrackDistanceSaveSettingActivity;->f:Landroid/widget/EditText;

    invoke-virtual {v0}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v5

    .line 285
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/autotrack/DeveloperAutoTrackDistanceSaveSettingActivity;->k:Landroid/widget/EditText;

    invoke-virtual {v0}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v6

    .line 286
    const-string v0, ""

    invoke-virtual {v4, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    const-string v0, ""

    invoke-virtual {v5, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    const-string v0, ""

    invoke-virtual {v6, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
    :try_end_0
    .catch Ljava/lang/NumberFormatException; {:try_start_0 .. :try_end_0} :catch_0

    move-result v0

    if-eqz v0, :cond_1

    .line 287
    :cond_0
    const/4 v0, 0x0

    return v0

    .line 290
    :cond_1
    :try_start_1
    invoke-static {v4}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v7

    .line 291
    invoke-static {v5}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v8

    .line 292
    invoke-static {v6}, Ljava/lang/Float;->valueOf(Ljava/lang/String;)Ljava/lang/Float;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Float;->floatValue()F
    :try_end_1
    .catch Ljava/lang/NumberFormatException; {:try_start_1 .. :try_end_1} :catch_0

    move-result v9

    .line 293
    if-eqz v7, :cond_2

    if-eqz v8, :cond_2

    const/4 v0, 0x0

    cmpl-float v0, v9, v0

    if-nez v0, :cond_3

    .line 294
    :cond_2
    const/4 v0, 0x0

    return v0

    .line 296
    :cond_3
    const/4 v0, 0x1

    return v0

    .line 297
    :catch_0
    move-exception v4

    .line 298
    const-string v0, "Track_DeveloperAutoTrackDistanceSaveSettingActivity"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "checkNumberCorrect() NumberFormatException"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object v4, v1, v2

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 299
    const/4 v0, 0x0

    return v0
.end method

.method static synthetic m(Lcom/huawei/ui/main/stories/me/activity/autotrack/DeveloperAutoTrackDistanceSaveSettingActivity;)Landroid/widget/EditText;
    .locals 1

    .line 32
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/autotrack/DeveloperAutoTrackDistanceSaveSettingActivity;->d:Landroid/widget/EditText;

    return-object v0
.end method

.method private m()V
    .locals 2

    .line 244
    sget v0, Lcom/huawei/ui/main/R$id;->atuo_track_setting_button:I

    invoke-virtual {p0, v0}, Lcom/huawei/ui/main/stories/me/activity/autotrack/DeveloperAutoTrackDistanceSaveSettingActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/Button;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/autotrack/DeveloperAutoTrackDistanceSaveSettingActivity;->p:Landroid/widget/Button;

    .line 245
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/autotrack/DeveloperAutoTrackDistanceSaveSettingActivity;->p:Landroid/widget/Button;

    new-instance v1, Lcom/huawei/ui/main/stories/me/activity/autotrack/DeveloperAutoTrackDistanceSaveSettingActivity$2;

    invoke-direct {v1, p0}, Lcom/huawei/ui/main/stories/me/activity/autotrack/DeveloperAutoTrackDistanceSaveSettingActivity$2;-><init>(Lcom/huawei/ui/main/stories/me/activity/autotrack/DeveloperAutoTrackDistanceSaveSettingActivity;)V

    invoke-virtual {v0, v1}, Landroid/widget/Button;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 277
    return-void
.end method

.method private n()V
    .locals 2

    .line 218
    sget v0, Lcom/huawei/ui/main/R$id;->atuo_track_recovery_button:I

    invoke-virtual {p0, v0}, Lcom/huawei/ui/main/stories/me/activity/autotrack/DeveloperAutoTrackDistanceSaveSettingActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/Button;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/autotrack/DeveloperAutoTrackDistanceSaveSettingActivity;->p:Landroid/widget/Button;

    .line 219
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/autotrack/DeveloperAutoTrackDistanceSaveSettingActivity;->p:Landroid/widget/Button;

    new-instance v1, Lcom/huawei/ui/main/stories/me/activity/autotrack/DeveloperAutoTrackDistanceSaveSettingActivity$4;

    invoke-direct {v1, p0}, Lcom/huawei/ui/main/stories/me/activity/autotrack/DeveloperAutoTrackDistanceSaveSettingActivity$4;-><init>(Lcom/huawei/ui/main/stories/me/activity/autotrack/DeveloperAutoTrackDistanceSaveSettingActivity;)V

    invoke-virtual {v0, v1}, Landroid/widget/Button;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 241
    return-void
.end method

.method static synthetic o(Lcom/huawei/ui/main/stories/me/activity/autotrack/DeveloperAutoTrackDistanceSaveSettingActivity;)Landroid/widget/EditText;
    .locals 1

    .line 32
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/autotrack/DeveloperAutoTrackDistanceSaveSettingActivity;->f:Landroid/widget/EditText;

    return-object v0
.end method

.method private o()V
    .locals 3

    .line 204
    sget v0, Lcom/huawei/ui/main/R$id;->auto_track_status_text:I

    invoke-virtual {p0, v0}, Lcom/huawei/ui/main/stories/me/activity/autotrack/DeveloperAutoTrackDistanceSaveSettingActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/autotrack/DeveloperAutoTrackDistanceSaveSettingActivity;->i:Landroid/widget/TextView;

    .line 205
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/autotrack/DeveloperAutoTrackDistanceSaveSettingActivity;->i:Landroid/widget/TextView;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/me/activity/autotrack/DeveloperAutoTrackDistanceSaveSettingActivity;->e:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/ui/main/R$string;->IDS_hw_autotrack__developer_false:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 206
    return-void
.end method

.method static synthetic p(Lcom/huawei/ui/main/stories/me/activity/autotrack/DeveloperAutoTrackDistanceSaveSettingActivity;)Ljava/util/concurrent/ExecutorService;
    .locals 1

    .line 32
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/autotrack/DeveloperAutoTrackDistanceSaveSettingActivity;->r:Ljava/util/concurrent/ExecutorService;

    return-object v0
.end method

.method private p()V
    .locals 6

    .line 304
    invoke-static {}, Lo/cbl;->b()Lo/cbl;

    move-result-object v0

    invoke-virtual {v0}, Lo/cbl;->p()Ljava/util/ArrayList;

    move-result-object v4

    .line 305
    if-nez v4, :cond_0

    .line 306
    const-string v0, "Track_DeveloperAutoTrackDistanceSaveSettingActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "showAutoTrakStartTime() list is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 307
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/autotrack/DeveloperAutoTrackDistanceSaveSettingActivity;->g:Landroid/widget/TextView;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/me/activity/autotrack/DeveloperAutoTrackDistanceSaveSettingActivity;->e:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/ui/main/R$string;->IDS_hw_autotrack__developer_empty:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 308
    return-void

    .line 310
    :cond_0
    invoke-virtual {v4}, Ljava/util/ArrayList;->size()I

    move-result v0

    invoke-direct {p0, v4, v0}, Lcom/huawei/ui/main/stories/me/activity/autotrack/DeveloperAutoTrackDistanceSaveSettingActivity;->e(Ljava/util/ArrayList;I)Ljava/lang/String;

    move-result-object v5

    .line 311
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/autotrack/DeveloperAutoTrackDistanceSaveSettingActivity;->g:Landroid/widget/TextView;

    invoke-virtual {v0, v5}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 313
    return-void
.end method


# virtual methods
.method public b(J)Ljava/lang/String;
    .locals 2

    .line 316
    new-instance v1, Ljava/text/SimpleDateFormat;

    const-string v0, "yyyy-MM-dd HH:mm:ss"

    invoke-direct {v1, v0}, Ljava/text/SimpleDateFormat;-><init>(Ljava/lang/String;)V

    .line 317
    new-instance v0, Ljava/util/Date;

    invoke-direct {v0, p1, p2}, Ljava/util/Date;-><init>(J)V

    invoke-virtual {v1, v0}, Ljava/text/SimpleDateFormat;->format(Ljava/util/Date;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public onCreate(Landroid/os/Bundle;)V
    .locals 4

    .line 78
    invoke-super {p0, p1}, Lcom/huawei/ui/commonui/base/BaseActivity;->onCreate(Landroid/os/Bundle;)V

    .line 80
    sget v0, Lcom/huawei/ui/main/R$layout;->autotrack_setting_layout:I

    invoke-virtual {p0, v0}, Lcom/huawei/ui/main/stories/me/activity/autotrack/DeveloperAutoTrackDistanceSaveSettingActivity;->setContentView(I)V

    .line 81
    iput-object p0, p0, Lcom/huawei/ui/main/stories/me/activity/autotrack/DeveloperAutoTrackDistanceSaveSettingActivity;->e:Landroid/content/Context;

    .line 82
    new-instance v0, Lo/cbz;

    invoke-direct {v0}, Lo/cbz;-><init>()V

    iput-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/autotrack/DeveloperAutoTrackDistanceSaveSettingActivity;->c:Lo/cbz;

    .line 83
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/autotrack/DeveloperAutoTrackDistanceSaveSettingActivity;->c:Lo/cbz;

    invoke-virtual {p0}, Lcom/huawei/ui/main/stories/me/activity/autotrack/DeveloperAutoTrackDistanceSaveSettingActivity;->getApplicationContext()Landroid/content/Context;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/cbz;->c(Landroid/content/Context;)V

    .line 84
    invoke-direct {p0}, Lcom/huawei/ui/main/stories/me/activity/autotrack/DeveloperAutoTrackDistanceSaveSettingActivity;->a()V

    .line 85
    const/4 v0, 0x3

    invoke-static {v0}, Ljava/util/concurrent/Executors;->newFixedThreadPool(I)Ljava/util/concurrent/ExecutorService;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/autotrack/DeveloperAutoTrackDistanceSaveSettingActivity;->r:Ljava/util/concurrent/ExecutorService;

    .line 100
    new-instance v0, Landroid/os/Handler;

    invoke-direct {v0}, Landroid/os/Handler;-><init>()V

    iput-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/autotrack/DeveloperAutoTrackDistanceSaveSettingActivity;->a:Landroid/os/Handler;

    .line 101
    new-instance v0, Lcom/huawei/ui/main/stories/me/activity/autotrack/DeveloperAutoTrackDistanceSaveSettingActivity$5;

    invoke-direct {v0, p0}, Lcom/huawei/ui/main/stories/me/activity/autotrack/DeveloperAutoTrackDistanceSaveSettingActivity$5;-><init>(Lcom/huawei/ui/main/stories/me/activity/autotrack/DeveloperAutoTrackDistanceSaveSettingActivity;)V

    iput-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/autotrack/DeveloperAutoTrackDistanceSaveSettingActivity;->b:Ljava/lang/Runnable;

    .line 121
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/autotrack/DeveloperAutoTrackDistanceSaveSettingActivity;->a:Landroid/os/Handler;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/me/activity/autotrack/DeveloperAutoTrackDistanceSaveSettingActivity;->b:Ljava/lang/Runnable;

    const-wide/16 v2, 0x7d0

    invoke-virtual {v0, v1, v2, v3}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 122
    return-void
.end method

.method public onDestroy()V
    .locals 2

    .line 374
    invoke-super {p0}, Lcom/huawei/ui/commonui/base/BaseActivity;->onDestroy()V

    .line 375
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/autotrack/DeveloperAutoTrackDistanceSaveSettingActivity;->a:Landroid/os/Handler;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/me/activity/autotrack/DeveloperAutoTrackDistanceSaveSettingActivity;->b:Ljava/lang/Runnable;

    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    .line 376
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/autotrack/DeveloperAutoTrackDistanceSaveSettingActivity;->r:Ljava/util/concurrent/ExecutorService;

    if-eqz v0, :cond_0

    .line 377
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/autotrack/DeveloperAutoTrackDistanceSaveSettingActivity;->r:Ljava/util/concurrent/ExecutorService;

    invoke-interface {v0}, Ljava/util/concurrent/ExecutorService;->shutdown()V

    .line 380
    :cond_0
    return-void
.end method

.method public onPause()V
    .locals 2

    .line 364
    invoke-super {p0}, Lcom/huawei/ui/commonui/base/BaseActivity;->onPause()V

    .line 365
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/autotrack/DeveloperAutoTrackDistanceSaveSettingActivity;->a:Landroid/os/Handler;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/me/activity/autotrack/DeveloperAutoTrackDistanceSaveSettingActivity;->b:Ljava/lang/Runnable;

    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    .line 371
    return-void
.end method

.method public onResume()V
    .locals 0

    .line 352
    invoke-super {p0}, Lcom/huawei/ui/commonui/base/BaseActivity;->onResume()V

    .line 360
    return-void
.end method
