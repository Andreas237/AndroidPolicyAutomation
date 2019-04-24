.class public Lcom/huawei/ui/main/stories/me/activity/DeveloperTimeSettingActivity;
.super Lcom/huawei/ui/commonui/base/BaseActivity;
.source "SourceFile"


# static fields
.field private static final b:Ljava/lang/String;


# instance fields
.field private a:Landroid/widget/RadioGroup;

.field private c:Landroid/widget/RadioButton;

.field private d:Landroid/widget/RadioButton;

.field private e:Landroid/widget/RadioButton;

.field private f:Landroid/widget/RadioButton;

.field private g:Landroid/widget/RadioButton;

.field private final h:I

.field private final i:I

.field private final k:I

.field private l:Landroid/widget/TextView;

.field private m:Lo/cce;

.field private final n:I

.field private o:Ljava/util/concurrent/ExecutorService;

.field private final p:I


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 22
    const-class v0, Lcom/huawei/ui/main/stories/me/activity/DeveloperTimeSettingActivity;

    invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lcom/huawei/ui/main/stories/me/activity/DeveloperTimeSettingActivity;->b:Ljava/lang/String;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    .line 21
    invoke-direct {p0}, Lcom/huawei/ui/commonui/base/BaseActivity;-><init>()V

    .line 24
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/DeveloperTimeSettingActivity;->a:Landroid/widget/RadioGroup;

    .line 26
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/DeveloperTimeSettingActivity;->e:Landroid/widget/RadioButton;

    .line 28
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/DeveloperTimeSettingActivity;->c:Landroid/widget/RadioButton;

    .line 30
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/DeveloperTimeSettingActivity;->d:Landroid/widget/RadioButton;

    .line 32
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/DeveloperTimeSettingActivity;->g:Landroid/widget/RadioButton;

    .line 34
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/DeveloperTimeSettingActivity;->f:Landroid/widget/RadioButton;

    .line 36
    const/4 v0, 0x0

    iput v0, p0, Lcom/huawei/ui/main/stories/me/activity/DeveloperTimeSettingActivity;->h:I

    .line 38
    const/4 v0, 0x2

    iput v0, p0, Lcom/huawei/ui/main/stories/me/activity/DeveloperTimeSettingActivity;->i:I

    .line 40
    const/16 v0, 0x1e

    iput v0, p0, Lcom/huawei/ui/main/stories/me/activity/DeveloperTimeSettingActivity;->k:I

    .line 42
    const/16 v0, 0x3c

    iput v0, p0, Lcom/huawei/ui/main/stories/me/activity/DeveloperTimeSettingActivity;->p:I

    .line 44
    const/16 v0, 0x78

    iput v0, p0, Lcom/huawei/ui/main/stories/me/activity/DeveloperTimeSettingActivity;->n:I

    .line 46
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/DeveloperTimeSettingActivity;->l:Landroid/widget/TextView;

    return-void
.end method

.method private a()V
    .locals 6

    .line 72
    sget v0, Lcom/huawei/ui/main/R$id;->hw_show_developer_options_setting_timefornopointtosave:I

    invoke-virtual {p0, v0}, Lcom/huawei/ui/main/stories/me/activity/DeveloperTimeSettingActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/DeveloperTimeSettingActivity;->l:Landroid/widget/TextView;

    .line 73
    invoke-virtual {p0}, Lcom/huawei/ui/main/stories/me/activity/DeveloperTimeSettingActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/ui/main/R$plurals;->IDS_hw_map_time_unit_no_value:I

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Landroid/content/res/Resources;->getQuantityString(II)Ljava/lang/String;

    move-result-object v4

    .line 74
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/DeveloperTimeSettingActivity;->l:Landroid/widget/TextView;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    sget v2, Lcom/huawei/ui/main/R$string;->IDS_hw_show_data_tarck_no_vaildpoint_close_time_setting:I

    invoke-virtual {p0, v2}, Lcom/huawei/ui/main/stories/me/activity/DeveloperTimeSettingActivity;->getString(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, "("

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, ")"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 75
    sget v0, Lcom/huawei/ui/main/R$id;->radiogroup:I

    invoke-virtual {p0, v0}, Lcom/huawei/ui/main/stories/me/activity/DeveloperTimeSettingActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/RadioGroup;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/DeveloperTimeSettingActivity;->a:Landroid/widget/RadioGroup;

    .line 77
    sget v0, Lcom/huawei/ui/main/R$id;->close_radio_button:I

    invoke-virtual {p0, v0}, Lcom/huawei/ui/main/stories/me/activity/DeveloperTimeSettingActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/RadioButton;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/DeveloperTimeSettingActivity;->f:Landroid/widget/RadioButton;

    .line 79
    sget v0, Lcom/huawei/ui/main/R$id;->two:I

    invoke-virtual {p0, v0}, Lcom/huawei/ui/main/stories/me/activity/DeveloperTimeSettingActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/RadioButton;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/DeveloperTimeSettingActivity;->e:Landroid/widget/RadioButton;

    .line 80
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/DeveloperTimeSettingActivity;->e:Landroid/widget/RadioButton;

    const-string v1, "2"

    invoke-virtual {v0, v1}, Landroid/widget/RadioButton;->setText(Ljava/lang/CharSequence;)V

    .line 82
    sget v0, Lcom/huawei/ui/main/R$id;->thirty:I

    invoke-virtual {p0, v0}, Lcom/huawei/ui/main/stories/me/activity/DeveloperTimeSettingActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/RadioButton;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/DeveloperTimeSettingActivity;->c:Landroid/widget/RadioButton;

    .line 83
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/DeveloperTimeSettingActivity;->c:Landroid/widget/RadioButton;

    const-string v1, "30"

    invoke-virtual {v0, v1}, Landroid/widget/RadioButton;->setText(Ljava/lang/CharSequence;)V

    .line 85
    sget v0, Lcom/huawei/ui/main/R$id;->sixty:I

    invoke-virtual {p0, v0}, Lcom/huawei/ui/main/stories/me/activity/DeveloperTimeSettingActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/RadioButton;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/DeveloperTimeSettingActivity;->d:Landroid/widget/RadioButton;

    .line 86
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/DeveloperTimeSettingActivity;->d:Landroid/widget/RadioButton;

    const-string v1, "60"

    invoke-virtual {v0, v1}, Landroid/widget/RadioButton;->setText(Ljava/lang/CharSequence;)V

    .line 88
    sget v0, Lcom/huawei/ui/main/R$id;->onehundredtwenty:I

    invoke-virtual {p0, v0}, Lcom/huawei/ui/main/stories/me/activity/DeveloperTimeSettingActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/RadioButton;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/DeveloperTimeSettingActivity;->g:Landroid/widget/RadioButton;

    .line 89
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/DeveloperTimeSettingActivity;->g:Landroid/widget/RadioButton;

    const-string v1, "120"

    invoke-virtual {v0, v1}, Landroid/widget/RadioButton;->setText(Ljava/lang/CharSequence;)V

    .line 91
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/DeveloperTimeSettingActivity;->a:Landroid/widget/RadioGroup;

    new-instance v1, Lcom/huawei/ui/main/stories/me/activity/DeveloperTimeSettingActivity$3;

    invoke-direct {v1, p0}, Lcom/huawei/ui/main/stories/me/activity/DeveloperTimeSettingActivity$3;-><init>(Lcom/huawei/ui/main/stories/me/activity/DeveloperTimeSettingActivity;)V

    invoke-virtual {v0, v1}, Landroid/widget/RadioGroup;->setOnCheckedChangeListener(Landroid/widget/RadioGroup$OnCheckedChangeListener;)V

    .line 109
    invoke-direct {p0}, Lcom/huawei/ui/main/stories/me/activity/DeveloperTimeSettingActivity;->d()I

    move-result v5

    .line 111
    const-string v0, "DeveloperTimeSettingActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "startSport:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 113
    sparse-switch v5, :sswitch_data_0

    goto :goto_0

    .line 115
    :sswitch_0
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/DeveloperTimeSettingActivity;->f:Landroid/widget/RadioButton;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/widget/RadioButton;->setChecked(Z)V

    .line 116
    goto :goto_0

    .line 118
    :sswitch_1
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/DeveloperTimeSettingActivity;->e:Landroid/widget/RadioButton;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/widget/RadioButton;->setChecked(Z)V

    .line 119
    goto :goto_0

    .line 121
    :sswitch_2
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/DeveloperTimeSettingActivity;->c:Landroid/widget/RadioButton;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/widget/RadioButton;->setChecked(Z)V

    .line 122
    goto :goto_0

    .line 124
    :sswitch_3
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/DeveloperTimeSettingActivity;->d:Landroid/widget/RadioButton;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/widget/RadioButton;->setChecked(Z)V

    .line 125
    goto :goto_0

    .line 127
    :sswitch_4
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/DeveloperTimeSettingActivity;->g:Landroid/widget/RadioButton;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/widget/RadioButton;->setChecked(Z)V

    .line 128
    .line 133
    :goto_0
    return-void

    :sswitch_data_0
    .sparse-switch
        0x0 -> :sswitch_0
        0x2 -> :sswitch_1
        0x1e -> :sswitch_2
        0x3c -> :sswitch_3
        0x78 -> :sswitch_4
    .end sparse-switch
.end method

.method static synthetic b(Lcom/huawei/ui/main/stories/me/activity/DeveloperTimeSettingActivity;)Lo/cce;
    .locals 1

    .line 21
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/DeveloperTimeSettingActivity;->m:Lo/cce;

    return-object v0
.end method

.method static synthetic b(Lcom/huawei/ui/main/stories/me/activity/DeveloperTimeSettingActivity;I)V
    .locals 0

    .line 21
    invoke-direct {p0, p1}, Lcom/huawei/ui/main/stories/me/activity/DeveloperTimeSettingActivity;->c(I)V

    return-void
.end method

.method private c(I)V
    .locals 4

    .line 143
    sget-object v0, Lcom/huawei/ui/main/stories/me/activity/DeveloperTimeSettingActivity;->b:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "saveTime:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 144
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/DeveloperTimeSettingActivity;->o:Ljava/util/concurrent/ExecutorService;

    new-instance v1, Lcom/huawei/ui/main/stories/me/activity/DeveloperTimeSettingActivity$2;

    invoke-direct {v1, p0, p1}, Lcom/huawei/ui/main/stories/me/activity/DeveloperTimeSettingActivity$2;-><init>(Lcom/huawei/ui/main/stories/me/activity/DeveloperTimeSettingActivity;I)V

    invoke-interface {v0, v1}, Ljava/util/concurrent/ExecutorService;->execute(Ljava/lang/Runnable;)V

    .line 151
    return-void
.end method

.method private d()I
    .locals 3

    .line 154
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/DeveloperTimeSettingActivity;->m:Lo/cce;

    const-string v1, "auto_close_track_time"

    const/16 v2, 0x3c

    invoke-virtual {v0, v1, v2}, Lo/cce;->a(Ljava/lang/String;I)I

    move-result v0

    return v0
.end method


# virtual methods
.method public onCreate(Landroid/os/Bundle;)V
    .locals 4

    .line 53
    invoke-super {p0, p1}, Lcom/huawei/ui/commonui/base/BaseActivity;->onCreate(Landroid/os/Bundle;)V

    .line 54
    sget-object v0, Lcom/huawei/ui/main/stories/me/activity/DeveloperTimeSettingActivity;->b:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "onCreate()"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 55
    sget v0, Lcom/huawei/ui/main/R$layout;->hw_show_developer_time_setting:I

    invoke-virtual {p0, v0}, Lcom/huawei/ui/main/stories/me/activity/DeveloperTimeSettingActivity;->setContentView(I)V

    .line 57
    new-instance v0, Lo/cce;

    invoke-direct {v0, p0}, Lo/cce;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/DeveloperTimeSettingActivity;->m:Lo/cce;

    .line 58
    const/4 v0, 0x3

    invoke-static {v0}, Ljava/util/concurrent/Executors;->newFixedThreadPool(I)Ljava/util/concurrent/ExecutorService;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/DeveloperTimeSettingActivity;->o:Ljava/util/concurrent/ExecutorService;

    .line 59
    invoke-direct {p0}, Lcom/huawei/ui/main/stories/me/activity/DeveloperTimeSettingActivity;->a()V

    .line 60
    return-void
.end method

.method public onDestroy()V
    .locals 1

    .line 64
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/DeveloperTimeSettingActivity;->o:Ljava/util/concurrent/ExecutorService;

    if-eqz v0, :cond_0

    .line 65
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/DeveloperTimeSettingActivity;->o:Ljava/util/concurrent/ExecutorService;

    invoke-interface {v0}, Ljava/util/concurrent/ExecutorService;->shutdown()V

    .line 66
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/DeveloperTimeSettingActivity;->o:Ljava/util/concurrent/ExecutorService;

    .line 68
    :cond_0
    invoke-super {p0}, Lcom/huawei/ui/commonui/base/BaseActivity;->onDestroy()V

    .line 69
    return-void
.end method
