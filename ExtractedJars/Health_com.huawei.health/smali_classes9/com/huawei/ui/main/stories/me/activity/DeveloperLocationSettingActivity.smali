.class public Lcom/huawei/ui/main/stories/me/activity/DeveloperLocationSettingActivity;
.super Lcom/huawei/ui/commonui/base/BaseActivity;
.source "SourceFile"

# interfaces
.implements Landroid/widget/RadioGroup$OnCheckedChangeListener;


# static fields
.field private static final b:Ljava/lang/String;


# instance fields
.field private A:Landroid/widget/RadioButton;

.field private B:Landroid/widget/RadioButton;

.field private C:Landroid/widget/RadioButton;

.field private D:Landroid/widget/RadioButton;

.field private E:Landroid/widget/RadioButton;

.field private F:Landroid/widget/RadioButton;

.field private G:Landroid/widget/RadioButton;

.field private H:Landroid/widget/RadioButton;

.field private I:Landroid/widget/RadioButton;

.field private J:Landroid/widget/RadioButton;

.field private K:Landroid/widget/RadioButton;

.field private L:Landroid/widget/RadioButton;

.field private M:Landroid/widget/RadioButton;

.field private N:Landroid/widget/RadioButton;

.field private O:Landroid/widget/RadioButton;

.field private P:Landroid/widget/RadioButton;

.field private Q:Landroid/widget/RadioButton;

.field private R:Landroid/widget/RadioButton;

.field private S:Landroid/widget/RadioButton;

.field private T:Landroid/widget/RadioButton;

.field private final U:I

.field private V:Landroid/widget/RadioButton;

.field private W:Landroid/widget/RadioButton;

.field private X:Landroid/widget/RadioButton;

.field private Y:Z

.field private Z:Landroid/widget/TextView;

.field private a:Landroid/widget/RadioGroup;

.field private final aa:I

.field private ab:Landroid/widget/TextView;

.field private ac:Lo/cce;

.field private ad:Landroid/widget/Button;

.field private ae:Landroid/widget/EditText;

.field private af:Landroid/widget/RadioGroup;

.field private ag:Landroid/widget/EditText;

.field private ah:Landroid/widget/Button;

.field private ai:Landroid/widget/RadioGroup;

.field private aj:Landroid/widget/RadioButton;

.field private ak:Landroid/widget/RadioButton;

.field private al:Landroid/widget/RadioButton;

.field private am:Landroid/widget/RadioButton;

.field private an:Landroid/widget/EditText;

.field private ao:Landroid/widget/EditText;

.field private ap:Landroid/widget/EditText;

.field private aq:Landroid/widget/Button;

.field private ar:Landroid/widget/Button;

.field private as:Landroid/widget/EditText;

.field private at:Landroid/widget/Button;

.field private au:Landroid/widget/Button;

.field private av:Landroid/widget/EditText;

.field private aw:Landroid/widget/Button;

.field private c:Landroid/content/Context;

.field private d:Landroid/widget/RadioGroup;

.field private e:Landroid/widget/RadioGroup;

.field private f:Landroid/widget/RadioGroup;

.field private g:Landroid/widget/RadioGroup;

.field private h:Landroid/widget/RadioGroup;

.field private i:Landroid/widget/RadioGroup;

.field private j:Landroid/widget/RadioButton;

.field private k:Landroid/widget/RadioGroup;

.field private l:Landroid/widget/RadioGroup;

.field private m:Landroid/widget/RadioButton;

.field private n:Landroid/widget/RadioButton;

.field private o:Landroid/widget/RadioGroup;

.field private p:Landroid/widget/RadioButton;

.field private q:Landroid/widget/RadioButton;

.field private r:Landroid/widget/RadioButton;

.field private s:Landroid/widget/RadioButton;

.field private t:Landroid/widget/RadioButton;

.field private u:Landroid/widget/RadioButton;

.field private v:Landroid/widget/RadioButton;

.field private w:Landroid/widget/RadioButton;

.field private x:Landroid/widget/RadioButton;

.field private y:Landroid/widget/RadioButton;

.field private z:Landroid/widget/RadioButton;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 25
    const-class v0, Lcom/huawei/ui/main/stories/me/activity/DeveloperLocationSettingActivity;

    invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lcom/huawei/ui/main/stories/me/activity/DeveloperLocationSettingActivity;->b:Ljava/lang/String;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    .line 24
    invoke-direct {p0}, Lcom/huawei/ui/commonui/base/BaseActivity;-><init>()V

    .line 48
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/DeveloperLocationSettingActivity;->n:Landroid/widget/RadioButton;

    .line 50
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/DeveloperLocationSettingActivity;->p:Landroid/widget/RadioButton;

    .line 52
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/DeveloperLocationSettingActivity;->m:Landroid/widget/RadioButton;

    .line 54
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/DeveloperLocationSettingActivity;->t:Landroid/widget/RadioButton;

    .line 56
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/DeveloperLocationSettingActivity;->q:Landroid/widget/RadioButton;

    .line 58
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/DeveloperLocationSettingActivity;->u:Landroid/widget/RadioButton;

    .line 60
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/DeveloperLocationSettingActivity;->s:Landroid/widget/RadioButton;

    .line 62
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/DeveloperLocationSettingActivity;->r:Landroid/widget/RadioButton;

    .line 64
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/DeveloperLocationSettingActivity;->y:Landroid/widget/RadioButton;

    .line 66
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/DeveloperLocationSettingActivity;->v:Landroid/widget/RadioButton;

    .line 68
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/DeveloperLocationSettingActivity;->z:Landroid/widget/RadioButton;

    .line 70
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/DeveloperLocationSettingActivity;->w:Landroid/widget/RadioButton;

    .line 72
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/DeveloperLocationSettingActivity;->x:Landroid/widget/RadioButton;

    .line 74
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/DeveloperLocationSettingActivity;->A:Landroid/widget/RadioButton;

    .line 76
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/DeveloperLocationSettingActivity;->C:Landroid/widget/RadioButton;

    .line 78
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/DeveloperLocationSettingActivity;->j:Landroid/widget/RadioButton;

    .line 112
    const/4 v0, -0x1

    iput v0, p0, Lcom/huawei/ui/main/stories/me/activity/DeveloperLocationSettingActivity;->U:I

    .line 113
    const/4 v0, 0x2

    iput v0, p0, Lcom/huawei/ui/main/stories/me/activity/DeveloperLocationSettingActivity;->aa:I

    return-void
.end method

.method private a()V
    .locals 4

    .line 326
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/DeveloperLocationSettingActivity;->ap:Landroid/widget/EditText;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/me/activity/DeveloperLocationSettingActivity;->ac:Lo/cce;

    const-string v2, "min_dis_acc"

    const-string v3, "100"

    invoke-virtual {v1, v2, v3}, Lo/cce;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/EditText;->setText(Ljava/lang/CharSequence;)V

    .line 328
    return-void
.end method

.method private a(F)V
    .locals 4

    .line 766
    sget-object v0, Lcom/huawei/ui/main/stories/me/activity/DeveloperLocationSettingActivity;->b:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "saveLocationRequestMinDistance:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 767
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/DeveloperLocationSettingActivity;->ac:Lo/cce;

    invoke-static {p1}, Ljava/lang/Float;->toString(F)Ljava/lang/String;

    move-result-object v1

    const-string v2, "min_location_request_interval_distance"

    invoke-virtual {v0, v1, v2}, Lo/cce;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 768
    return-void
.end method

.method static synthetic a(Lcom/huawei/ui/main/stories/me/activity/DeveloperLocationSettingActivity;)V
    .locals 0

    .line 24
    invoke-direct {p0}, Lcom/huawei/ui/main/stories/me/activity/DeveloperLocationSettingActivity;->l()V

    return-void
.end method

.method static synthetic a(Lcom/huawei/ui/main/stories/me/activity/DeveloperLocationSettingActivity;J)V
    .locals 0

    .line 24
    invoke-direct {p0, p1, p2}, Lcom/huawei/ui/main/stories/me/activity/DeveloperLocationSettingActivity;->d(J)V

    return-void
.end method

.method private b()V
    .locals 4

    .line 331
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/DeveloperLocationSettingActivity;->ae:Landroid/widget/EditText;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/me/activity/DeveloperLocationSettingActivity;->ac:Lo/cce;

    const-string v2, "max_satellite_speed_multiple"

    const-string v3, "2.8"

    invoke-virtual {v1, v2, v3}, Lo/cce;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/EditText;->setText(Ljava/lang/CharSequence;)V

    .line 333
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/DeveloperLocationSettingActivity;->ag:Landroid/widget/EditText;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/me/activity/DeveloperLocationSettingActivity;->ac:Lo/cce;

    const-string v2, "min_satellite_threshold_speed"

    const-string v3, "0.3"

    invoke-virtual {v1, v2, v3}, Lo/cce;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/EditText;->setText(Ljava/lang/CharSequence;)V

    .line 335
    return-void
.end method

.method static synthetic b(Lcom/huawei/ui/main/stories/me/activity/DeveloperLocationSettingActivity;)V
    .locals 0

    .line 24
    invoke-direct {p0}, Lcom/huawei/ui/main/stories/me/activity/DeveloperLocationSettingActivity;->f()V

    return-void
.end method

.method static synthetic b(Lcom/huawei/ui/main/stories/me/activity/DeveloperLocationSettingActivity;F)V
    .locals 0

    .line 24
    invoke-direct {p0, p1}, Lcom/huawei/ui/main/stories/me/activity/DeveloperLocationSettingActivity;->a(F)V

    return-void
.end method

.method private c()V
    .locals 2

    .line 162
    sget v0, Lcom/huawei/ui/main/R$id;->min_time_radiogroup:I

    invoke-virtual {p0, v0}, Lcom/huawei/ui/main/stories/me/activity/DeveloperLocationSettingActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/RadioGroup;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/DeveloperLocationSettingActivity;->d:Landroid/widget/RadioGroup;

    .line 163
    sget v0, Lcom/huawei/ui/main/R$id;->half_second_radio_button:I

    invoke-virtual {p0, v0}, Lcom/huawei/ui/main/stories/me/activity/DeveloperLocationSettingActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/RadioButton;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/DeveloperLocationSettingActivity;->n:Landroid/widget/RadioButton;

    .line 164
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/DeveloperLocationSettingActivity;->n:Landroid/widget/RadioButton;

    sget v1, Lcom/huawei/ui/main/R$string;->IDS_hw_show_dev_location_num_zero_five:I

    invoke-virtual {v0, v1}, Landroid/widget/RadioButton;->setText(I)V

    .line 165
    sget v0, Lcom/huawei/ui/main/R$id;->one_second_radio_button:I

    invoke-virtual {p0, v0}, Lcom/huawei/ui/main/stories/me/activity/DeveloperLocationSettingActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/RadioButton;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/DeveloperLocationSettingActivity;->p:Landroid/widget/RadioButton;

    .line 166
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/DeveloperLocationSettingActivity;->p:Landroid/widget/RadioButton;

    sget v1, Lcom/huawei/ui/main/R$string;->IDS_hw_show_dev_location_num_one:I

    invoke-virtual {v0, v1}, Landroid/widget/RadioButton;->setText(I)V

    .line 167
    sget v0, Lcom/huawei/ui/main/R$id;->one_and_half_second_radio_button:I

    invoke-virtual {p0, v0}, Lcom/huawei/ui/main/stories/me/activity/DeveloperLocationSettingActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/RadioButton;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/DeveloperLocationSettingActivity;->m:Landroid/widget/RadioButton;

    .line 168
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/DeveloperLocationSettingActivity;->m:Landroid/widget/RadioButton;

    sget v1, Lcom/huawei/ui/main/R$string;->IDS_hw_show_dev_location_num_one_five:I

    invoke-virtual {v0, v1}, Landroid/widget/RadioButton;->setText(I)V

    .line 169
    sget v0, Lcom/huawei/ui/main/R$id;->two_second_radio_button:I

    invoke-virtual {p0, v0}, Lcom/huawei/ui/main/stories/me/activity/DeveloperLocationSettingActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/RadioButton;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/DeveloperLocationSettingActivity;->t:Landroid/widget/RadioButton;

    .line 170
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/DeveloperLocationSettingActivity;->t:Landroid/widget/RadioButton;

    sget v1, Lcom/huawei/ui/main/R$string;->IDS_hw_show_dev_location_num_two:I

    invoke-virtual {v0, v1}, Landroid/widget/RadioButton;->setText(I)V

    .line 171
    sget v0, Lcom/huawei/ui/main/R$id;->two_and_half_second_radio_button:I

    invoke-virtual {p0, v0}, Lcom/huawei/ui/main/stories/me/activity/DeveloperLocationSettingActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/RadioButton;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/DeveloperLocationSettingActivity;->q:Landroid/widget/RadioButton;

    .line 172
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/DeveloperLocationSettingActivity;->q:Landroid/widget/RadioButton;

    sget v1, Lcom/huawei/ui/main/R$string;->IDS_hw_show_dev_location_num_two_five:I

    invoke-virtual {v0, v1}, Landroid/widget/RadioButton;->setText(I)V

    .line 173
    invoke-direct {p0}, Lcom/huawei/ui/main/stories/me/activity/DeveloperLocationSettingActivity;->r()V

    .line 174
    invoke-direct {p0}, Lcom/huawei/ui/main/stories/me/activity/DeveloperLocationSettingActivity;->q()V

    .line 176
    sget v0, Lcom/huawei/ui/main/R$id;->min_distance_radiogroup:I

    invoke-virtual {p0, v0}, Lcom/huawei/ui/main/stories/me/activity/DeveloperLocationSettingActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/RadioGroup;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/DeveloperLocationSettingActivity;->a:Landroid/widget/RadioGroup;

    .line 177
    sget v0, Lcom/huawei/ui/main/R$id;->zero_meter_radio_button:I

    invoke-virtual {p0, v0}, Lcom/huawei/ui/main/stories/me/activity/DeveloperLocationSettingActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/RadioButton;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/DeveloperLocationSettingActivity;->u:Landroid/widget/RadioButton;

    .line 178
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/DeveloperLocationSettingActivity;->u:Landroid/widget/RadioButton;

    sget v1, Lcom/huawei/ui/main/R$string;->IDS_hw_show_dev_location_request_distance_no:I

    invoke-virtual {v0, v1}, Landroid/widget/RadioButton;->setText(I)V

    .line 179
    sget v0, Lcom/huawei/ui/main/R$id;->zero_one_meter_radio_button:I

    invoke-virtual {p0, v0}, Lcom/huawei/ui/main/stories/me/activity/DeveloperLocationSettingActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/RadioButton;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/DeveloperLocationSettingActivity;->s:Landroid/widget/RadioButton;

    .line 180
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/DeveloperLocationSettingActivity;->s:Landroid/widget/RadioButton;

    sget v1, Lcom/huawei/ui/main/R$string;->IDS_hw_show_dev_location_num_zero_one:I

    invoke-virtual {v0, v1}, Landroid/widget/RadioButton;->setText(I)V

    .line 181
    sget v0, Lcom/huawei/ui/main/R$id;->zero_five_meter_radio_button:I

    invoke-virtual {p0, v0}, Lcom/huawei/ui/main/stories/me/activity/DeveloperLocationSettingActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/RadioButton;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/DeveloperLocationSettingActivity;->r:Landroid/widget/RadioButton;

    .line 182
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/DeveloperLocationSettingActivity;->r:Landroid/widget/RadioButton;

    sget v1, Lcom/huawei/ui/main/R$string;->IDS_hw_show_dev_location_num_zero_five:I

    invoke-virtual {v0, v1}, Landroid/widget/RadioButton;->setText(I)V

    .line 183
    sget v0, Lcom/huawei/ui/main/R$id;->one_meter_radio_button:I

    invoke-virtual {p0, v0}, Lcom/huawei/ui/main/stories/me/activity/DeveloperLocationSettingActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/RadioButton;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/DeveloperLocationSettingActivity;->y:Landroid/widget/RadioButton;

    .line 184
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/DeveloperLocationSettingActivity;->y:Landroid/widget/RadioButton;

    sget v1, Lcom/huawei/ui/main/R$string;->IDS_hw_show_dev_location_num_one:I

    invoke-virtual {v0, v1}, Landroid/widget/RadioButton;->setText(I)V

    .line 185
    sget v0, Lcom/huawei/ui/main/R$id;->two_meter_radio_button:I

    invoke-virtual {p0, v0}, Lcom/huawei/ui/main/stories/me/activity/DeveloperLocationSettingActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/RadioButton;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/DeveloperLocationSettingActivity;->v:Landroid/widget/RadioButton;

    .line 186
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/DeveloperLocationSettingActivity;->v:Landroid/widget/RadioButton;

    sget v1, Lcom/huawei/ui/main/R$string;->IDS_hw_show_dev_location_num_two:I

    invoke-virtual {v0, v1}, Landroid/widget/RadioButton;->setText(I)V

    .line 187
    sget v0, Lcom/huawei/ui/main/R$id;->three_meter_radio_button:I

    invoke-virtual {p0, v0}, Lcom/huawei/ui/main/stories/me/activity/DeveloperLocationSettingActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/RadioButton;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/DeveloperLocationSettingActivity;->z:Landroid/widget/RadioButton;

    .line 188
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/DeveloperLocationSettingActivity;->z:Landroid/widget/RadioButton;

    sget v1, Lcom/huawei/ui/main/R$string;->IDS_hw_show_dev_location_num_three:I

    invoke-virtual {v0, v1}, Landroid/widget/RadioButton;->setText(I)V

    .line 189
    invoke-direct {p0}, Lcom/huawei/ui/main/stories/me/activity/DeveloperLocationSettingActivity;->t()V

    .line 190
    invoke-direct {p0}, Lcom/huawei/ui/main/stories/me/activity/DeveloperLocationSettingActivity;->s()V

    .line 192
    sget v0, Lcom/huawei/ui/main/R$id;->track_smooth_radiogroup:I

    invoke-virtual {p0, v0}, Lcom/huawei/ui/main/stories/me/activity/DeveloperLocationSettingActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/RadioGroup;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/DeveloperLocationSettingActivity;->af:Landroid/widget/RadioGroup;

    .line 193
    sget v0, Lcom/huawei/ui/main/R$id;->track_smooth_open_radio_button:I

    invoke-virtual {p0, v0}, Lcom/huawei/ui/main/stories/me/activity/DeveloperLocationSettingActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/RadioButton;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/DeveloperLocationSettingActivity;->ak:Landroid/widget/RadioButton;

    .line 194
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/DeveloperLocationSettingActivity;->ak:Landroid/widget/RadioButton;

    sget v1, Lcom/huawei/ui/main/R$string;->IDS_hw_show_dev_location_convert_open:I

    invoke-virtual {v0, v1}, Landroid/widget/RadioButton;->setText(I)V

    .line 195
    sget v0, Lcom/huawei/ui/main/R$id;->track_smooth_close_radio_button:I

    invoke-virtual {p0, v0}, Lcom/huawei/ui/main/stories/me/activity/DeveloperLocationSettingActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/RadioButton;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/DeveloperLocationSettingActivity;->am:Landroid/widget/RadioButton;

    .line 196
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/DeveloperLocationSettingActivity;->am:Landroid/widget/RadioButton;

    sget v1, Lcom/huawei/ui/main/R$string;->IDS_hw_show_dev_location_convert_close:I

    invoke-virtual {v0, v1}, Landroid/widget/RadioButton;->setText(I)V

    .line 197
    sget v0, Lcom/huawei/ui/main/R$id;->optimize_radiogroup:I

    invoke-virtual {p0, v0}, Lcom/huawei/ui/main/stories/me/activity/DeveloperLocationSettingActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/RadioGroup;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/DeveloperLocationSettingActivity;->e:Landroid/widget/RadioGroup;

    .line 198
    sget v0, Lcom/huawei/ui/main/R$id;->one_point_radio_button:I

    invoke-virtual {p0, v0}, Lcom/huawei/ui/main/stories/me/activity/DeveloperLocationSettingActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/RadioButton;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/DeveloperLocationSettingActivity;->w:Landroid/widget/RadioButton;

    .line 199
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/DeveloperLocationSettingActivity;->w:Landroid/widget/RadioButton;

    sget v1, Lcom/huawei/ui/main/R$string;->IDS_hw_show_dev_location_optimize_no:I

    invoke-virtual {v0, v1}, Landroid/widget/RadioButton;->setText(I)V

    .line 200
    sget v0, Lcom/huawei/ui/main/R$id;->two_point_radio_button:I

    invoke-virtual {p0, v0}, Lcom/huawei/ui/main/stories/me/activity/DeveloperLocationSettingActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/RadioButton;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/DeveloperLocationSettingActivity;->x:Landroid/widget/RadioButton;

    .line 201
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/DeveloperLocationSettingActivity;->x:Landroid/widget/RadioButton;

    sget v1, Lcom/huawei/ui/main/R$string;->IDS_hw_show_dev_location_num_two:I

    invoke-virtual {v0, v1}, Landroid/widget/RadioButton;->setText(I)V

    .line 202
    sget v0, Lcom/huawei/ui/main/R$id;->three_point_radio_button:I

    invoke-virtual {p0, v0}, Lcom/huawei/ui/main/stories/me/activity/DeveloperLocationSettingActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/RadioButton;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/DeveloperLocationSettingActivity;->A:Landroid/widget/RadioButton;

    .line 203
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/DeveloperLocationSettingActivity;->A:Landroid/widget/RadioButton;

    sget v1, Lcom/huawei/ui/main/R$string;->IDS_hw_show_dev_location_num_three:I

    invoke-virtual {v0, v1}, Landroid/widget/RadioButton;->setText(I)V

    .line 204
    sget v0, Lcom/huawei/ui/main/R$id;->four_point_radio_button:I

    invoke-virtual {p0, v0}, Lcom/huawei/ui/main/stories/me/activity/DeveloperLocationSettingActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/RadioButton;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/DeveloperLocationSettingActivity;->C:Landroid/widget/RadioButton;

    .line 205
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/DeveloperLocationSettingActivity;->C:Landroid/widget/RadioButton;

    sget v1, Lcom/huawei/ui/main/R$string;->IDS_hw_show_dev_location_num_four:I

    invoke-virtual {v0, v1}, Landroid/widget/RadioButton;->setText(I)V

    .line 206
    sget v0, Lcom/huawei/ui/main/R$id;->five_point_radio_button:I

    invoke-virtual {p0, v0}, Lcom/huawei/ui/main/stories/me/activity/DeveloperLocationSettingActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/RadioButton;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/DeveloperLocationSettingActivity;->j:Landroid/widget/RadioButton;

    .line 207
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/DeveloperLocationSettingActivity;->j:Landroid/widget/RadioButton;

    sget v1, Lcom/huawei/ui/main/R$string;->IDS_hw_show_dev_location_num_five:I

    invoke-virtual {v0, v1}, Landroid/widget/RadioButton;->setText(I)V

    .line 209
    invoke-direct {p0}, Lcom/huawei/ui/main/stories/me/activity/DeveloperLocationSettingActivity;->u()V

    .line 211
    sget v0, Lcom/huawei/ui/main/R$id;->convert_radiogroup:I

    invoke-virtual {p0, v0}, Lcom/huawei/ui/main/stories/me/activity/DeveloperLocationSettingActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/RadioGroup;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/DeveloperLocationSettingActivity;->g:Landroid/widget/RadioGroup;

    .line 212
    sget v0, Lcom/huawei/ui/main/R$id;->convert_open_radio_button:I

    invoke-virtual {p0, v0}, Lcom/huawei/ui/main/stories/me/activity/DeveloperLocationSettingActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/RadioButton;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/DeveloperLocationSettingActivity;->D:Landroid/widget/RadioButton;

    .line 213
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/DeveloperLocationSettingActivity;->D:Landroid/widget/RadioButton;

    sget v1, Lcom/huawei/ui/main/R$string;->IDS_hw_show_dev_location_convert_open:I

    invoke-virtual {v0, v1}, Landroid/widget/RadioButton;->setText(I)V

    .line 214
    sget v0, Lcom/huawei/ui/main/R$id;->convert_close_radio_button:I

    invoke-virtual {p0, v0}, Lcom/huawei/ui/main/stories/me/activity/DeveloperLocationSettingActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/RadioButton;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/DeveloperLocationSettingActivity;->B:Landroid/widget/RadioButton;

    .line 215
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/DeveloperLocationSettingActivity;->B:Landroid/widget/RadioButton;

    sget v1, Lcom/huawei/ui/main/R$string;->IDS_hw_show_dev_location_convert_close:I

    invoke-virtual {v0, v1}, Landroid/widget/RadioButton;->setText(I)V

    .line 216
    sget v0, Lcom/huawei/ui/main/R$id;->convert_auto_radio_button:I

    invoke-virtual {p0, v0}, Lcom/huawei/ui/main/stories/me/activity/DeveloperLocationSettingActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/RadioButton;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/DeveloperLocationSettingActivity;->H:Landroid/widget/RadioButton;

    .line 217
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/DeveloperLocationSettingActivity;->H:Landroid/widget/RadioButton;

    sget v1, Lcom/huawei/ui/main/R$string;->IDS_hw_show_data_tarck_map_type_setting_auto:I

    invoke-virtual {v0, v1}, Landroid/widget/RadioButton;->setText(I)V

    .line 218
    invoke-direct {p0}, Lcom/huawei/ui/main/stories/me/activity/DeveloperLocationSettingActivity;->w()V

    .line 219
    invoke-direct {p0}, Lcom/huawei/ui/main/stories/me/activity/DeveloperLocationSettingActivity;->x()V

    .line 221
    sget v0, Lcom/huawei/ui/main/R$id;->filter_distance_radiogroup1:I

    invoke-virtual {p0, v0}, Lcom/huawei/ui/main/stories/me/activity/DeveloperLocationSettingActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/RadioGroup;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/DeveloperLocationSettingActivity;->h:Landroid/widget/RadioGroup;

    .line 222
    sget v0, Lcom/huawei/ui/main/R$id;->filter_distance_radiogroup2:I

    invoke-virtual {p0, v0}, Lcom/huawei/ui/main/stories/me/activity/DeveloperLocationSettingActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/RadioGroup;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/DeveloperLocationSettingActivity;->f:Landroid/widget/RadioGroup;

    .line 223
    sget v0, Lcom/huawei/ui/main/R$id;->g5_one_meter_radio_button:I

    invoke-virtual {p0, v0}, Lcom/huawei/ui/main/stories/me/activity/DeveloperLocationSettingActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/RadioButton;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/DeveloperLocationSettingActivity;->F:Landroid/widget/RadioButton;

    .line 224
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/DeveloperLocationSettingActivity;->F:Landroid/widget/RadioButton;

    sget v1, Lcom/huawei/ui/main/R$string;->IDS_hw_show_dev_location_num_one:I

    invoke-virtual {v0, v1}, Landroid/widget/RadioButton;->setText(I)V

    .line 225
    sget v0, Lcom/huawei/ui/main/R$id;->g5_two_meter_radio_button:I

    invoke-virtual {p0, v0}, Lcom/huawei/ui/main/stories/me/activity/DeveloperLocationSettingActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/RadioButton;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/DeveloperLocationSettingActivity;->G:Landroid/widget/RadioButton;

    .line 226
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/DeveloperLocationSettingActivity;->G:Landroid/widget/RadioButton;

    sget v1, Lcom/huawei/ui/main/R$string;->IDS_hw_show_dev_location_num_two:I

    invoke-virtual {v0, v1}, Landroid/widget/RadioButton;->setText(I)V

    .line 227
    sget v0, Lcom/huawei/ui/main/R$id;->g5_three_meter_radio_button:I

    invoke-virtual {p0, v0}, Lcom/huawei/ui/main/stories/me/activity/DeveloperLocationSettingActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/RadioButton;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/DeveloperLocationSettingActivity;->E:Landroid/widget/RadioButton;

    .line 228
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/DeveloperLocationSettingActivity;->E:Landroid/widget/RadioButton;

    sget v1, Lcom/huawei/ui/main/R$string;->IDS_hw_show_dev_location_num_three:I

    invoke-virtual {v0, v1}, Landroid/widget/RadioButton;->setText(I)V

    .line 229
    sget v0, Lcom/huawei/ui/main/R$id;->g5_four_meter_radio_button:I

    invoke-virtual {p0, v0}, Lcom/huawei/ui/main/stories/me/activity/DeveloperLocationSettingActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/RadioButton;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/DeveloperLocationSettingActivity;->I:Landroid/widget/RadioButton;

    .line 230
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/DeveloperLocationSettingActivity;->I:Landroid/widget/RadioButton;

    sget v1, Lcom/huawei/ui/main/R$string;->IDS_hw_show_dev_location_num_four:I

    invoke-virtual {v0, v1}, Landroid/widget/RadioButton;->setText(I)V

    .line 231
    sget v0, Lcom/huawei/ui/main/R$id;->g5_five_meter_radio_button:I

    invoke-virtual {p0, v0}, Lcom/huawei/ui/main/stories/me/activity/DeveloperLocationSettingActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/RadioButton;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/DeveloperLocationSettingActivity;->L:Landroid/widget/RadioButton;

    .line 232
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/DeveloperLocationSettingActivity;->L:Landroid/widget/RadioButton;

    sget v1, Lcom/huawei/ui/main/R$string;->IDS_hw_show_dev_location_num_five:I

    invoke-virtual {v0, v1}, Landroid/widget/RadioButton;->setText(I)V

    .line 233
    sget v0, Lcom/huawei/ui/main/R$id;->g5_six_meter_radio_button:I

    invoke-virtual {p0, v0}, Lcom/huawei/ui/main/stories/me/activity/DeveloperLocationSettingActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/RadioButton;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/DeveloperLocationSettingActivity;->N:Landroid/widget/RadioButton;

    .line 234
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/DeveloperLocationSettingActivity;->N:Landroid/widget/RadioButton;

    sget v1, Lcom/huawei/ui/main/R$string;->IDS_hw_show_dev_location_num_six:I

    invoke-virtual {v0, v1}, Landroid/widget/RadioButton;->setText(I)V

    .line 235
    sget v0, Lcom/huawei/ui/main/R$id;->g5_seven_meter_radio_button:I

    invoke-virtual {p0, v0}, Lcom/huawei/ui/main/stories/me/activity/DeveloperLocationSettingActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/RadioButton;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/DeveloperLocationSettingActivity;->M:Landroid/widget/RadioButton;

    .line 236
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/DeveloperLocationSettingActivity;->M:Landroid/widget/RadioButton;

    sget v1, Lcom/huawei/ui/main/R$string;->IDS_hw_show_dev_location_num_seven:I

    invoke-virtual {v0, v1}, Landroid/widget/RadioButton;->setText(I)V

    .line 237
    sget v0, Lcom/huawei/ui/main/R$id;->g5_eight_meter_radio_button:I

    invoke-virtual {p0, v0}, Lcom/huawei/ui/main/stories/me/activity/DeveloperLocationSettingActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/RadioButton;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/DeveloperLocationSettingActivity;->J:Landroid/widget/RadioButton;

    .line 238
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/DeveloperLocationSettingActivity;->J:Landroid/widget/RadioButton;

    sget v1, Lcom/huawei/ui/main/R$string;->IDS_hw_show_dev_location_num_eight:I

    invoke-virtual {v0, v1}, Landroid/widget/RadioButton;->setText(I)V

    .line 239
    sget v0, Lcom/huawei/ui/main/R$id;->g5_nine_meter_radio_button:I

    invoke-virtual {p0, v0}, Lcom/huawei/ui/main/stories/me/activity/DeveloperLocationSettingActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/RadioButton;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/DeveloperLocationSettingActivity;->K:Landroid/widget/RadioButton;

    .line 240
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/DeveloperLocationSettingActivity;->K:Landroid/widget/RadioButton;

    sget v1, Lcom/huawei/ui/main/R$string;->IDS_hw_show_dev_location_num_nine:I

    invoke-virtual {v0, v1}, Landroid/widget/RadioButton;->setText(I)V

    .line 241
    sget v0, Lcom/huawei/ui/main/R$id;->g5_ten_meter_radio_button:I

    invoke-virtual {p0, v0}, Lcom/huawei/ui/main/stories/me/activity/DeveloperLocationSettingActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/RadioButton;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/DeveloperLocationSettingActivity;->P:Landroid/widget/RadioButton;

    .line 242
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/DeveloperLocationSettingActivity;->P:Landroid/widget/RadioButton;

    sget v1, Lcom/huawei/ui/main/R$string;->IDS_hw_show_dev_location_num_ten:I

    invoke-virtual {v0, v1}, Landroid/widget/RadioButton;->setText(I)V

    .line 243
    invoke-direct {p0}, Lcom/huawei/ui/main/stories/me/activity/DeveloperLocationSettingActivity;->z()V

    .line 244
    invoke-direct {p0}, Lcom/huawei/ui/main/stories/me/activity/DeveloperLocationSettingActivity;->v()V

    .line 246
    sget v0, Lcom/huawei/ui/main/R$id;->mock_filter_radiogroup:I

    invoke-virtual {p0, v0}, Lcom/huawei/ui/main/stories/me/activity/DeveloperLocationSettingActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/RadioGroup;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/DeveloperLocationSettingActivity;->i:Landroid/widget/RadioGroup;

    .line 247
    sget v0, Lcom/huawei/ui/main/R$id;->mock_filter_open_radio_button:I

    invoke-virtual {p0, v0}, Lcom/huawei/ui/main/stories/me/activity/DeveloperLocationSettingActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/RadioButton;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/DeveloperLocationSettingActivity;->S:Landroid/widget/RadioButton;

    .line 248
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/DeveloperLocationSettingActivity;->S:Landroid/widget/RadioButton;

    sget v1, Lcom/huawei/ui/main/R$string;->IDS_hw_show_dev_location_convert_open:I

    invoke-virtual {v0, v1}, Landroid/widget/RadioButton;->setText(I)V

    .line 249
    sget v0, Lcom/huawei/ui/main/R$id;->mock_filter_close_radio_button:I

    invoke-virtual {p0, v0}, Lcom/huawei/ui/main/stories/me/activity/DeveloperLocationSettingActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/RadioButton;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/DeveloperLocationSettingActivity;->Q:Landroid/widget/RadioButton;

    .line 250
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/DeveloperLocationSettingActivity;->Q:Landroid/widget/RadioButton;

    sget v1, Lcom/huawei/ui/main/R$string;->IDS_hw_show_dev_location_convert_close:I

    invoke-virtual {v0, v1}, Landroid/widget/RadioButton;->setText(I)V

    .line 254
    sget v0, Lcom/huawei/ui/main/R$id;->estimated_step_distance_radiogroup:I

    invoke-virtual {p0, v0}, Lcom/huawei/ui/main/stories/me/activity/DeveloperLocationSettingActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/RadioGroup;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/DeveloperLocationSettingActivity;->k:Landroid/widget/RadioGroup;

    .line 255
    sget v0, Lcom/huawei/ui/main/R$id;->estimated_step_distance_open_radio_button:I

    invoke-virtual {p0, v0}, Lcom/huawei/ui/main/stories/me/activity/DeveloperLocationSettingActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/RadioButton;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/DeveloperLocationSettingActivity;->O:Landroid/widget/RadioButton;

    .line 256
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/DeveloperLocationSettingActivity;->O:Landroid/widget/RadioButton;

    sget v1, Lcom/huawei/ui/main/R$string;->IDS_hw_show_dev_location_convert_open:I

    invoke-virtual {v0, v1}, Landroid/widget/RadioButton;->setText(I)V

    .line 257
    sget v0, Lcom/huawei/ui/main/R$id;->estimated_step_distance_close_radio_button:I

    invoke-virtual {p0, v0}, Lcom/huawei/ui/main/stories/me/activity/DeveloperLocationSettingActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/RadioButton;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/DeveloperLocationSettingActivity;->R:Landroid/widget/RadioButton;

    .line 258
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/DeveloperLocationSettingActivity;->R:Landroid/widget/RadioButton;

    sget v1, Lcom/huawei/ui/main/R$string;->IDS_hw_show_dev_location_convert_close:I

    invoke-virtual {v0, v1}, Landroid/widget/RadioButton;->setText(I)V

    .line 260
    sget v0, Lcom/huawei/ui/main/R$id;->static_drop_gps_radiogroup:I

    invoke-virtual {p0, v0}, Lcom/huawei/ui/main/stories/me/activity/DeveloperLocationSettingActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/RadioGroup;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/DeveloperLocationSettingActivity;->o:Landroid/widget/RadioGroup;

    .line 261
    sget v0, Lcom/huawei/ui/main/R$id;->static_drop_gps_open_radio_button:I

    invoke-virtual {p0, v0}, Lcom/huawei/ui/main/stories/me/activity/DeveloperLocationSettingActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/RadioButton;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/DeveloperLocationSettingActivity;->W:Landroid/widget/RadioButton;

    .line 262
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/DeveloperLocationSettingActivity;->W:Landroid/widget/RadioButton;

    sget v1, Lcom/huawei/ui/main/R$string;->IDS_hw_show_dev_location_convert_open:I

    invoke-virtual {v0, v1}, Landroid/widget/RadioButton;->setText(I)V

    .line 263
    sget v0, Lcom/huawei/ui/main/R$id;->static_drop_gps_close_radio_button:I

    invoke-virtual {p0, v0}, Lcom/huawei/ui/main/stories/me/activity/DeveloperLocationSettingActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/RadioButton;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/DeveloperLocationSettingActivity;->T:Landroid/widget/RadioButton;

    .line 264
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/DeveloperLocationSettingActivity;->T:Landroid/widget/RadioButton;

    sget v1, Lcom/huawei/ui/main/R$string;->IDS_hw_show_dev_location_convert_close:I

    invoke-virtual {v0, v1}, Landroid/widget/RadioButton;->setText(I)V

    .line 266
    sget v0, Lcom/huawei/ui/main/R$id;->log_convert_radiogroup:I

    invoke-virtual {p0, v0}, Lcom/huawei/ui/main/stories/me/activity/DeveloperLocationSettingActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/RadioGroup;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/DeveloperLocationSettingActivity;->l:Landroid/widget/RadioGroup;

    .line 267
    sget v0, Lcom/huawei/ui/main/R$id;->log_convert_open_radio_button:I

    invoke-virtual {p0, v0}, Lcom/huawei/ui/main/stories/me/activity/DeveloperLocationSettingActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/RadioButton;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/DeveloperLocationSettingActivity;->X:Landroid/widget/RadioButton;

    .line 268
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/DeveloperLocationSettingActivity;->X:Landroid/widget/RadioButton;

    sget v1, Lcom/huawei/ui/main/R$string;->IDS_hw_show_dev_location_convert_open:I

    invoke-virtual {v0, v1}, Landroid/widget/RadioButton;->setText(I)V

    .line 269
    sget v0, Lcom/huawei/ui/main/R$id;->log_convert_close_radio_button:I

    invoke-virtual {p0, v0}, Lcom/huawei/ui/main/stories/me/activity/DeveloperLocationSettingActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/RadioButton;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/DeveloperLocationSettingActivity;->V:Landroid/widget/RadioButton;

    .line 270
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/DeveloperLocationSettingActivity;->V:Landroid/widget/RadioButton;

    sget v1, Lcom/huawei/ui/main/R$string;->IDS_hw_show_dev_location_convert_close:I

    invoke-virtual {v0, v1}, Landroid/widget/RadioButton;->setText(I)V

    .line 272
    sget v0, Lcom/huawei/ui/main/R$id;->need_start_finding_radiogroup:I

    invoke-virtual {p0, v0}, Lcom/huawei/ui/main/stories/me/activity/DeveloperLocationSettingActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/RadioGroup;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/DeveloperLocationSettingActivity;->ai:Landroid/widget/RadioGroup;

    .line 273
    sget v0, Lcom/huawei/ui/main/R$id;->need_start_finding_open_radio_button:I

    invoke-virtual {p0, v0}, Lcom/huawei/ui/main/stories/me/activity/DeveloperLocationSettingActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/RadioButton;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/DeveloperLocationSettingActivity;->al:Landroid/widget/RadioButton;

    .line 274
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/DeveloperLocationSettingActivity;->al:Landroid/widget/RadioButton;

    sget v1, Lcom/huawei/ui/main/R$string;->IDS_hw_show_dev_location_convert_open:I

    invoke-virtual {v0, v1}, Landroid/widget/RadioButton;->setText(I)V

    .line 275
    sget v0, Lcom/huawei/ui/main/R$id;->need_start_finding_close_radio_button:I

    invoke-virtual {p0, v0}, Lcom/huawei/ui/main/stories/me/activity/DeveloperLocationSettingActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/RadioButton;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/DeveloperLocationSettingActivity;->aj:Landroid/widget/RadioButton;

    .line 276
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/DeveloperLocationSettingActivity;->aj:Landroid/widget/RadioButton;

    sget v1, Lcom/huawei/ui/main/R$string;->IDS_hw_show_dev_location_convert_close:I

    invoke-virtual {v0, v1}, Landroid/widget/RadioButton;->setText(I)V

    .line 278
    invoke-direct {p0}, Lcom/huawei/ui/main/stories/me/activity/DeveloperLocationSettingActivity;->m()V

    .line 280
    sget v0, Lcom/huawei/ui/main/R$id;->hw_show_developer_gps1:I

    invoke-virtual {p0, v0}, Lcom/huawei/ui/main/stories/me/activity/DeveloperLocationSettingActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/DeveloperLocationSettingActivity;->Z:Landroid/widget/TextView;

    .line 281
    sget v0, Lcom/huawei/ui/main/R$id;->hw_show_developer_gps2:I

    invoke-virtual {p0, v0}, Lcom/huawei/ui/main/stories/me/activity/DeveloperLocationSettingActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/DeveloperLocationSettingActivity;->ab:Landroid/widget/TextView;

    .line 282
    invoke-direct {p0}, Lcom/huawei/ui/main/stories/me/activity/DeveloperLocationSettingActivity;->y()V

    .line 284
    sget v0, Lcom/huawei/ui/main/R$id;->hw_show_developer_satellite_speed_min_threshold_value:I

    invoke-virtual {p0, v0}, Lcom/huawei/ui/main/stories/me/activity/DeveloperLocationSettingActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/EditText;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/DeveloperLocationSettingActivity;->ag:Landroid/widget/EditText;

    .line 285
    sget v0, Lcom/huawei/ui/main/R$id;->hw_show_developer_satellite_speed_min_threshold_confirm:I

    invoke-virtual {p0, v0}, Lcom/huawei/ui/main/stories/me/activity/DeveloperLocationSettingActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/Button;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/DeveloperLocationSettingActivity;->ad:Landroid/widget/Button;

    .line 286
    sget v0, Lcom/huawei/ui/main/R$id;->hw_show_developer_satellite_speed_max_multiple_value:I

    invoke-virtual {p0, v0}, Lcom/huawei/ui/main/stories/me/activity/DeveloperLocationSettingActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/EditText;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/DeveloperLocationSettingActivity;->ae:Landroid/widget/EditText;

    .line 287
    sget v0, Lcom/huawei/ui/main/R$id;->hw_show_developer_satellite_speed_max_multiple_confirm:I

    invoke-virtual {p0, v0}, Lcom/huawei/ui/main/stories/me/activity/DeveloperLocationSettingActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/Button;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/DeveloperLocationSettingActivity;->ah:Landroid/widget/Button;

    .line 289
    invoke-direct {p0}, Lcom/huawei/ui/main/stories/me/activity/DeveloperLocationSettingActivity;->b()V

    .line 291
    sget v0, Lcom/huawei/ui/main/R$id;->hw_show_developer_min_gps_acc_value:I

    invoke-virtual {p0, v0}, Lcom/huawei/ui/main/stories/me/activity/DeveloperLocationSettingActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/EditText;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/DeveloperLocationSettingActivity;->ap:Landroid/widget/EditText;

    .line 292
    sget v0, Lcom/huawei/ui/main/R$id;->hw_show_developer_min_gps_acc_confirm:I

    invoke-virtual {p0, v0}, Lcom/huawei/ui/main/stories/me/activity/DeveloperLocationSettingActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/Button;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/DeveloperLocationSettingActivity;->aq:Landroid/widget/Button;

    .line 293
    invoke-direct {p0}, Lcom/huawei/ui/main/stories/me/activity/DeveloperLocationSettingActivity;->a()V

    .line 295
    sget v0, Lcom/huawei/ui/main/R$id;->hw_show_developer_min_time_interval_value:I

    invoke-virtual {p0, v0}, Lcom/huawei/ui/main/stories/me/activity/DeveloperLocationSettingActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/EditText;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/DeveloperLocationSettingActivity;->ao:Landroid/widget/EditText;

    .line 296
    sget v0, Lcom/huawei/ui/main/R$id;->hw_show_developer_min_time_interval_confirm:I

    invoke-virtual {p0, v0}, Lcom/huawei/ui/main/stories/me/activity/DeveloperLocationSettingActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/Button;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/DeveloperLocationSettingActivity;->ar:Landroid/widget/Button;

    .line 297
    invoke-direct {p0}, Lcom/huawei/ui/main/stories/me/activity/DeveloperLocationSettingActivity;->d()V

    .line 299
    sget v0, Lcom/huawei/ui/main/R$id;->hw_show_developer_max_speed_dis_walk_value:I

    invoke-virtual {p0, v0}, Lcom/huawei/ui/main/stories/me/activity/DeveloperLocationSettingActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/EditText;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/DeveloperLocationSettingActivity;->an:Landroid/widget/EditText;

    .line 300
    sget v0, Lcom/huawei/ui/main/R$id;->hw_show_developer_max_speed_dis_walk_confirm:I

    invoke-virtual {p0, v0}, Lcom/huawei/ui/main/stories/me/activity/DeveloperLocationSettingActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/Button;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/DeveloperLocationSettingActivity;->au:Landroid/widget/Button;

    .line 301
    sget v0, Lcom/huawei/ui/main/R$id;->hw_show_developer_max_speed_dis_run_value:I

    invoke-virtual {p0, v0}, Lcom/huawei/ui/main/stories/me/activity/DeveloperLocationSettingActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/EditText;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/DeveloperLocationSettingActivity;->av:Landroid/widget/EditText;

    .line 302
    sget v0, Lcom/huawei/ui/main/R$id;->hw_show_developer_max_speed_dis_run_confirm:I

    invoke-virtual {p0, v0}, Lcom/huawei/ui/main/stories/me/activity/DeveloperLocationSettingActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/Button;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/DeveloperLocationSettingActivity;->at:Landroid/widget/Button;

    .line 303
    sget v0, Lcom/huawei/ui/main/R$id;->hw_show_developer_max_speed_dis_bike_value:I

    invoke-virtual {p0, v0}, Lcom/huawei/ui/main/stories/me/activity/DeveloperLocationSettingActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/EditText;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/DeveloperLocationSettingActivity;->as:Landroid/widget/EditText;

    .line 304
    sget v0, Lcom/huawei/ui/main/R$id;->hw_show_developer_max_speed_dis_bike_confirm:I

    invoke-virtual {p0, v0}, Lcom/huawei/ui/main/stories/me/activity/DeveloperLocationSettingActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/Button;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/DeveloperLocationSettingActivity;->aw:Landroid/widget/Button;

    .line 305
    invoke-direct {p0}, Lcom/huawei/ui/main/stories/me/activity/DeveloperLocationSettingActivity;->e()V

    .line 307
    invoke-direct {p0}, Lcom/huawei/ui/main/stories/me/activity/DeveloperLocationSettingActivity;->g()V

    .line 309
    return-void
.end method

.method private c(I)V
    .locals 4

    .line 777
    sget-object v0, Lcom/huawei/ui/main/stories/me/activity/DeveloperLocationSettingActivity;->b:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "saveLocationConvert:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 778
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/DeveloperLocationSettingActivity;->ac:Lo/cce;

    invoke-static {p1}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v1

    const-string v2, "correct_location_shifting_enable"

    invoke-virtual {v0, v1, v2}, Lo/cce;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 779
    return-void
.end method

.method static synthetic c(Lcom/huawei/ui/main/stories/me/activity/DeveloperLocationSettingActivity;)V
    .locals 0

    .line 24
    invoke-direct {p0}, Lcom/huawei/ui/main/stories/me/activity/DeveloperLocationSettingActivity;->p()V

    return-void
.end method

.method private d()V
    .locals 4

    .line 321
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/DeveloperLocationSettingActivity;->ao:Landroid/widget/EditText;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/me/activity/DeveloperLocationSettingActivity;->ac:Lo/cce;

    const-string v2, "min_time_interval"

    const-string v3, "1.5"

    invoke-virtual {v1, v2, v3}, Lo/cce;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/EditText;->setText(Ljava/lang/CharSequence;)V

    .line 323
    return-void
.end method

.method private d(F)V
    .locals 4

    .line 787
    sget-object v0, Lcom/huawei/ui/main/stories/me/activity/DeveloperLocationSettingActivity;->b:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "saveFilterDistance:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 788
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/DeveloperLocationSettingActivity;->ac:Lo/cce;

    invoke-static {p1}, Ljava/lang/Float;->toString(F)Ljava/lang/String;

    move-result-object v1

    const-string v2, "filter_distance"

    invoke-virtual {v0, v1, v2}, Lo/cce;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 789
    return-void
.end method

.method private d(J)V
    .locals 4

    .line 756
    sget-object v0, Lcom/huawei/ui/main/stories/me/activity/DeveloperLocationSettingActivity;->b:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "saveLocationRequestMinTime:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p1, p2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 757
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/DeveloperLocationSettingActivity;->ac:Lo/cce;

    invoke-static {p1, p2}, Ljava/lang/Long;->toString(J)Ljava/lang/String;

    move-result-object v1

    const-string v2, "min_location_request_interval_time"

    invoke-virtual {v0, v1, v2}, Lo/cce;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 758
    return-void
.end method

.method static synthetic d(Lcom/huawei/ui/main/stories/me/activity/DeveloperLocationSettingActivity;)V
    .locals 0

    .line 24
    invoke-direct {p0}, Lcom/huawei/ui/main/stories/me/activity/DeveloperLocationSettingActivity;->o()V

    return-void
.end method

.method private e()V
    .locals 4

    .line 312
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/DeveloperLocationSettingActivity;->an:Landroid/widget/EditText;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/me/activity/DeveloperLocationSettingActivity;->ac:Lo/cce;

    const-string v2, "max_speed_dis_walk"

    const-string v3, "12"

    invoke-virtual {v1, v2, v3}, Lo/cce;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/EditText;->setText(Ljava/lang/CharSequence;)V

    .line 314
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/DeveloperLocationSettingActivity;->av:Landroid/widget/EditText;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/me/activity/DeveloperLocationSettingActivity;->ac:Lo/cce;

    const-string v2, "max_speed_dis_run"

    const-string v3, "12"

    invoke-virtual {v1, v2, v3}, Lo/cce;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/EditText;->setText(Ljava/lang/CharSequence;)V

    .line 316
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/DeveloperLocationSettingActivity;->as:Landroid/widget/EditText;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/me/activity/DeveloperLocationSettingActivity;->ac:Lo/cce;

    const-string v2, "max_speed_dis_bike"

    const-string v3, "33.3"

    invoke-virtual {v1, v2, v3}, Lo/cce;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/EditText;->setText(Ljava/lang/CharSequence;)V

    .line 318
    return-void
.end method

.method private e(Landroid/widget/RadioGroup;I)V
    .locals 2

    .line 826
    invoke-virtual {p1}, Landroid/widget/RadioGroup;->getId()I

    move-result v0

    sget v1, Lcom/huawei/ui/main/R$id;->estimated_step_distance_radiogroup:I

    if-ne v0, v1, :cond_1

    .line 827
    sget v0, Lcom/huawei/ui/main/R$id;->estimated_step_distance_open_radio_button:I

    if-ne p2, v0, :cond_0

    .line 828
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/DeveloperLocationSettingActivity;->ac:Lo/cce;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lo/cce;->e(Z)V

    goto/16 :goto_0

    .line 829
    :cond_0
    sget v0, Lcom/huawei/ui/main/R$id;->estimated_step_distance_close_radio_button:I

    if-ne p2, v0, :cond_7

    .line 830
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/DeveloperLocationSettingActivity;->ac:Lo/cce;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lo/cce;->e(Z)V

    goto/16 :goto_0

    .line 832
    :cond_1
    invoke-virtual {p1}, Landroid/widget/RadioGroup;->getId()I

    move-result v0

    sget v1, Lcom/huawei/ui/main/R$id;->static_drop_gps_radiogroup:I

    if-ne v0, v1, :cond_3

    .line 833
    sget v0, Lcom/huawei/ui/main/R$id;->static_drop_gps_open_radio_button:I

    if-ne p2, v0, :cond_2

    .line 834
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/DeveloperLocationSettingActivity;->ac:Lo/cce;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lo/cce;->a(Z)V

    goto :goto_0

    .line 835
    :cond_2
    sget v0, Lcom/huawei/ui/main/R$id;->static_drop_gps_close_radio_button:I

    if-ne p2, v0, :cond_7

    .line 836
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/DeveloperLocationSettingActivity;->ac:Lo/cce;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lo/cce;->a(Z)V

    goto :goto_0

    .line 838
    :cond_3
    invoke-virtual {p1}, Landroid/widget/RadioGroup;->getId()I

    move-result v0

    sget v1, Lcom/huawei/ui/main/R$id;->log_convert_radiogroup:I

    if-ne v0, v1, :cond_5

    .line 839
    sget v0, Lcom/huawei/ui/main/R$id;->log_convert_open_radio_button:I

    if-ne p2, v0, :cond_4

    .line 840
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/DeveloperLocationSettingActivity;->ac:Lo/cce;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lo/cce;->c(Z)V

    goto :goto_0

    .line 841
    :cond_4
    sget v0, Lcom/huawei/ui/main/R$id;->log_convert_close_radio_button:I

    if-ne p2, v0, :cond_7

    .line 842
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/DeveloperLocationSettingActivity;->ac:Lo/cce;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lo/cce;->c(Z)V

    goto :goto_0

    .line 844
    :cond_5
    invoke-virtual {p1}, Landroid/widget/RadioGroup;->getId()I

    move-result v0

    sget v1, Lcom/huawei/ui/main/R$id;->track_smooth_radiogroup:I

    if-ne v0, v1, :cond_7

    .line 845
    sget v0, Lcom/huawei/ui/main/R$id;->track_smooth_open_radio_button:I

    if-ne p2, v0, :cond_6

    .line 846
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/DeveloperLocationSettingActivity;->ac:Lo/cce;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lo/cce;->b(Z)V

    .line 847
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/DeveloperLocationSettingActivity;->e:Landroid/widget/RadioGroup;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/RadioGroup;->setVisibility(I)V

    goto :goto_0

    .line 848
    :cond_6
    sget v0, Lcom/huawei/ui/main/R$id;->track_smooth_close_radio_button:I

    if-ne p2, v0, :cond_7

    .line 849
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/DeveloperLocationSettingActivity;->ac:Lo/cce;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lo/cce;->b(Z)V

    .line 850
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/DeveloperLocationSettingActivity;->e:Landroid/widget/RadioGroup;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/RadioGroup;->setVisibility(I)V

    .line 853
    :cond_7
    :goto_0
    return-void
.end method

.method static synthetic e(Lcom/huawei/ui/main/stories/me/activity/DeveloperLocationSettingActivity;)V
    .locals 0

    .line 24
    invoke-direct {p0}, Lcom/huawei/ui/main/stories/me/activity/DeveloperLocationSettingActivity;->h()V

    return-void
.end method

.method static synthetic e(Lcom/huawei/ui/main/stories/me/activity/DeveloperLocationSettingActivity;F)V
    .locals 0

    .line 24
    invoke-direct {p0, p1}, Lcom/huawei/ui/main/stories/me/activity/DeveloperLocationSettingActivity;->d(F)V

    return-void
.end method

.method static synthetic e(Lcom/huawei/ui/main/stories/me/activity/DeveloperLocationSettingActivity;I)V
    .locals 0

    .line 24
    invoke-direct {p0, p1}, Lcom/huawei/ui/main/stories/me/activity/DeveloperLocationSettingActivity;->c(I)V

    return-void
.end method

.method static synthetic e(Lcom/huawei/ui/main/stories/me/activity/DeveloperLocationSettingActivity;Z)Z
    .locals 0

    .line 24
    iput-boolean p1, p0, Lcom/huawei/ui/main/stories/me/activity/DeveloperLocationSettingActivity;->Y:Z

    return p1
.end method

.method private f()V
    .locals 4

    .line 422
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/DeveloperLocationSettingActivity;->ac:Lo/cce;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/me/activity/DeveloperLocationSettingActivity;->an:Landroid/widget/EditText;

    invoke-virtual {v1}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    const-string v2, "max_speed_dis_walk"

    const-string v3, "12"

    invoke-virtual {v0, v1, v2, v3}, Lo/cce;->b(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 424
    return-void
.end method

.method static synthetic f(Lcom/huawei/ui/main/stories/me/activity/DeveloperLocationSettingActivity;)V
    .locals 0

    .line 24
    invoke-direct {p0}, Lcom/huawei/ui/main/stories/me/activity/DeveloperLocationSettingActivity;->i()V

    return-void
.end method

.method private g()V
    .locals 4

    .line 338
    new-instance v2, Lcom/huawei/ui/main/stories/me/activity/DeveloperLocationSettingActivity$2;

    invoke-direct {v2, p0}, Lcom/huawei/ui/main/stories/me/activity/DeveloperLocationSettingActivity$2;-><init>(Lcom/huawei/ui/main/stories/me/activity/DeveloperLocationSettingActivity;)V

    .line 360
    const/4 v0, 0x1

    new-array v3, v0, [Landroid/text/InputFilter;

    const/4 v0, 0x0

    aput-object v2, v3, v0

    .line 361
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/DeveloperLocationSettingActivity;->ag:Landroid/widget/EditText;

    invoke-virtual {v0, v3}, Landroid/widget/EditText;->setFilters([Landroid/text/InputFilter;)V

    .line 362
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/DeveloperLocationSettingActivity;->ae:Landroid/widget/EditText;

    invoke-virtual {v0, v3}, Landroid/widget/EditText;->setFilters([Landroid/text/InputFilter;)V

    .line 363
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/DeveloperLocationSettingActivity;->ar:Landroid/widget/Button;

    invoke-virtual {v0, v3}, Landroid/widget/Button;->setFilters([Landroid/text/InputFilter;)V

    .line 364
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/DeveloperLocationSettingActivity;->an:Landroid/widget/EditText;

    invoke-virtual {v0, v3}, Landroid/widget/EditText;->setFilters([Landroid/text/InputFilter;)V

    .line 365
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/DeveloperLocationSettingActivity;->av:Landroid/widget/EditText;

    invoke-virtual {v0, v3}, Landroid/widget/EditText;->setFilters([Landroid/text/InputFilter;)V

    .line 366
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/DeveloperLocationSettingActivity;->as:Landroid/widget/EditText;

    invoke-virtual {v0, v3}, Landroid/widget/EditText;->setFilters([Landroid/text/InputFilter;)V

    .line 367
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/DeveloperLocationSettingActivity;->ad:Landroid/widget/Button;

    new-instance v1, Lcom/huawei/ui/main/stories/me/activity/DeveloperLocationSettingActivity$3;

    invoke-direct {v1, p0}, Lcom/huawei/ui/main/stories/me/activity/DeveloperLocationSettingActivity$3;-><init>(Lcom/huawei/ui/main/stories/me/activity/DeveloperLocationSettingActivity;)V

    invoke-virtual {v0, v1}, Landroid/widget/Button;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 373
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/DeveloperLocationSettingActivity;->ah:Landroid/widget/Button;

    new-instance v1, Lcom/huawei/ui/main/stories/me/activity/DeveloperLocationSettingActivity$10;

    invoke-direct {v1, p0}, Lcom/huawei/ui/main/stories/me/activity/DeveloperLocationSettingActivity$10;-><init>(Lcom/huawei/ui/main/stories/me/activity/DeveloperLocationSettingActivity;)V

    invoke-virtual {v0, v1}, Landroid/widget/Button;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 379
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/DeveloperLocationSettingActivity;->aq:Landroid/widget/Button;

    new-instance v1, Lcom/huawei/ui/main/stories/me/activity/DeveloperLocationSettingActivity$8;

    invoke-direct {v1, p0}, Lcom/huawei/ui/main/stories/me/activity/DeveloperLocationSettingActivity$8;-><init>(Lcom/huawei/ui/main/stories/me/activity/DeveloperLocationSettingActivity;)V

    invoke-virtual {v0, v1}, Landroid/widget/Button;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 385
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/DeveloperLocationSettingActivity;->ar:Landroid/widget/Button;

    new-instance v1, Lcom/huawei/ui/main/stories/me/activity/DeveloperLocationSettingActivity$7;

    invoke-direct {v1, p0}, Lcom/huawei/ui/main/stories/me/activity/DeveloperLocationSettingActivity$7;-><init>(Lcom/huawei/ui/main/stories/me/activity/DeveloperLocationSettingActivity;)V

    invoke-virtual {v0, v1}, Landroid/widget/Button;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 391
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/DeveloperLocationSettingActivity;->au:Landroid/widget/Button;

    new-instance v1, Lcom/huawei/ui/main/stories/me/activity/DeveloperLocationSettingActivity$9;

    invoke-direct {v1, p0}, Lcom/huawei/ui/main/stories/me/activity/DeveloperLocationSettingActivity$9;-><init>(Lcom/huawei/ui/main/stories/me/activity/DeveloperLocationSettingActivity;)V

    invoke-virtual {v0, v1}, Landroid/widget/Button;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 397
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/DeveloperLocationSettingActivity;->at:Landroid/widget/Button;

    new-instance v1, Lcom/huawei/ui/main/stories/me/activity/DeveloperLocationSettingActivity$6;

    invoke-direct {v1, p0}, Lcom/huawei/ui/main/stories/me/activity/DeveloperLocationSettingActivity$6;-><init>(Lcom/huawei/ui/main/stories/me/activity/DeveloperLocationSettingActivity;)V

    invoke-virtual {v0, v1}, Landroid/widget/Button;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 403
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/DeveloperLocationSettingActivity;->aw:Landroid/widget/Button;

    new-instance v1, Lcom/huawei/ui/main/stories/me/activity/DeveloperLocationSettingActivity$14;

    invoke-direct {v1, p0}, Lcom/huawei/ui/main/stories/me/activity/DeveloperLocationSettingActivity$14;-><init>(Lcom/huawei/ui/main/stories/me/activity/DeveloperLocationSettingActivity;)V

    invoke-virtual {v0, v1}, Landroid/widget/Button;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 409
    return-void
.end method

.method static synthetic g(Lcom/huawei/ui/main/stories/me/activity/DeveloperLocationSettingActivity;)V
    .locals 0

    .line 24
    invoke-direct {p0}, Lcom/huawei/ui/main/stories/me/activity/DeveloperLocationSettingActivity;->k()V

    return-void
.end method

.method static synthetic h(Lcom/huawei/ui/main/stories/me/activity/DeveloperLocationSettingActivity;)Landroid/widget/RadioGroup;
    .locals 1

    .line 24
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/DeveloperLocationSettingActivity;->f:Landroid/widget/RadioGroup;

    return-object v0
.end method

.method private h()V
    .locals 4

    .line 427
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/DeveloperLocationSettingActivity;->ac:Lo/cce;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/me/activity/DeveloperLocationSettingActivity;->ao:Landroid/widget/EditText;

    invoke-virtual {v1}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    const-string v2, "min_time_interval"

    const-string v3, "1.5"

    invoke-virtual {v0, v1, v2, v3}, Lo/cce;->b(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 429
    return-void
.end method

.method static synthetic i(Lcom/huawei/ui/main/stories/me/activity/DeveloperLocationSettingActivity;)Landroid/widget/RadioGroup;
    .locals 1

    .line 24
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/DeveloperLocationSettingActivity;->h:Landroid/widget/RadioGroup;

    return-object v0
.end method

.method private i()V
    .locals 4

    .line 412
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/DeveloperLocationSettingActivity;->ac:Lo/cce;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/me/activity/DeveloperLocationSettingActivity;->as:Landroid/widget/EditText;

    invoke-virtual {v1}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    const-string v2, "max_speed_dis_bike"

    const-string v3, "33.3"

    invoke-virtual {v0, v1, v2, v3}, Lo/cce;->b(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 414
    return-void
.end method

.method private k()V
    .locals 4

    .line 417
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/DeveloperLocationSettingActivity;->ac:Lo/cce;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/me/activity/DeveloperLocationSettingActivity;->av:Landroid/widget/EditText;

    invoke-virtual {v1}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    const-string v2, "max_speed_dis_run"

    const-string v3, "12"

    invoke-virtual {v0, v1, v2, v3}, Lo/cce;->b(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 419
    return-void
.end method

.method static synthetic k(Lcom/huawei/ui/main/stories/me/activity/DeveloperLocationSettingActivity;)Z
    .locals 1

    .line 24
    iget-boolean v0, p0, Lcom/huawei/ui/main/stories/me/activity/DeveloperLocationSettingActivity;->Y:Z

    return v0
.end method

.method private l()V
    .locals 4

    .line 437
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/DeveloperLocationSettingActivity;->ac:Lo/cce;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/me/activity/DeveloperLocationSettingActivity;->ae:Landroid/widget/EditText;

    invoke-virtual {v1}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    const-string v2, "max_satellite_speed_multiple"

    const-string v3, "2.8"

    invoke-virtual {v0, v1, v2, v3}, Lo/cce;->b(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 439
    return-void
.end method

.method private m()V
    .locals 1

    .line 484
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/DeveloperLocationSettingActivity;->k:Landroid/widget/RadioGroup;

    invoke-virtual {v0, p0}, Landroid/widget/RadioGroup;->setOnCheckedChangeListener(Landroid/widget/RadioGroup$OnCheckedChangeListener;)V

    .line 485
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/DeveloperLocationSettingActivity;->o:Landroid/widget/RadioGroup;

    invoke-virtual {v0, p0}, Landroid/widget/RadioGroup;->setOnCheckedChangeListener(Landroid/widget/RadioGroup$OnCheckedChangeListener;)V

    .line 486
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/DeveloperLocationSettingActivity;->l:Landroid/widget/RadioGroup;

    invoke-virtual {v0, p0}, Landroid/widget/RadioGroup;->setOnCheckedChangeListener(Landroid/widget/RadioGroup$OnCheckedChangeListener;)V

    .line 487
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/DeveloperLocationSettingActivity;->af:Landroid/widget/RadioGroup;

    invoke-virtual {v0, p0}, Landroid/widget/RadioGroup;->setOnCheckedChangeListener(Landroid/widget/RadioGroup$OnCheckedChangeListener;)V

    .line 488
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/DeveloperLocationSettingActivity;->ai:Landroid/widget/RadioGroup;

    invoke-virtual {v0, p0}, Landroid/widget/RadioGroup;->setOnCheckedChangeListener(Landroid/widget/RadioGroup$OnCheckedChangeListener;)V

    .line 489
    return-void
.end method

.method private n()V
    .locals 2

    .line 447
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/DeveloperLocationSettingActivity;->ac:Lo/cce;

    invoke-virtual {v0}, Lo/cce;->c()V

    .line 448
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/DeveloperLocationSettingActivity;->ac:Lo/cce;

    invoke-virtual {v0}, Lo/cce;->d()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 449
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/DeveloperLocationSettingActivity;->O:Landroid/widget/RadioButton;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/widget/RadioButton;->setChecked(Z)V

    goto :goto_0

    .line 451
    :cond_0
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/DeveloperLocationSettingActivity;->R:Landroid/widget/RadioButton;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/widget/RadioButton;->setChecked(Z)V

    .line 454
    :goto_0
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/DeveloperLocationSettingActivity;->ac:Lo/cce;

    invoke-virtual {v0}, Lo/cce;->b()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 455
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/DeveloperLocationSettingActivity;->W:Landroid/widget/RadioButton;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/widget/RadioButton;->setChecked(Z)V

    goto :goto_1

    .line 457
    :cond_1
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/DeveloperLocationSettingActivity;->T:Landroid/widget/RadioButton;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/widget/RadioButton;->setChecked(Z)V

    .line 460
    :goto_1
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/DeveloperLocationSettingActivity;->ac:Lo/cce;

    invoke-virtual {v0}, Lo/cce;->e()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 461
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/DeveloperLocationSettingActivity;->X:Landroid/widget/RadioButton;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/widget/RadioButton;->setChecked(Z)V

    goto :goto_2

    .line 463
    :cond_2
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/DeveloperLocationSettingActivity;->V:Landroid/widget/RadioButton;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/widget/RadioButton;->setChecked(Z)V

    .line 466
    :goto_2
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/DeveloperLocationSettingActivity;->ac:Lo/cce;

    invoke-virtual {v0}, Lo/cce;->g()Z

    move-result v0

    if-eqz v0, :cond_3

    .line 467
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/DeveloperLocationSettingActivity;->ak:Landroid/widget/RadioButton;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/widget/RadioButton;->setChecked(Z)V

    .line 468
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/DeveloperLocationSettingActivity;->e:Landroid/widget/RadioGroup;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/RadioGroup;->setVisibility(I)V

    .line 469
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/DeveloperLocationSettingActivity;->A:Landroid/widget/RadioButton;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/widget/RadioButton;->setChecked(Z)V

    goto :goto_3

    .line 471
    :cond_3
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/DeveloperLocationSettingActivity;->am:Landroid/widget/RadioButton;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/widget/RadioButton;->setChecked(Z)V

    .line 472
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/DeveloperLocationSettingActivity;->e:Landroid/widget/RadioGroup;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/RadioGroup;->setVisibility(I)V

    .line 473
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/DeveloperLocationSettingActivity;->A:Landroid/widget/RadioButton;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/widget/RadioButton;->setChecked(Z)V

    .line 476
    :goto_3
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/DeveloperLocationSettingActivity;->ac:Lo/cce;

    invoke-virtual {v0}, Lo/cce;->f()Z

    move-result v0

    if-eqz v0, :cond_4

    .line 477
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/DeveloperLocationSettingActivity;->al:Landroid/widget/RadioButton;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/widget/RadioButton;->setChecked(Z)V

    goto :goto_4

    .line 479
    :cond_4
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/DeveloperLocationSettingActivity;->aj:Landroid/widget/RadioButton;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/widget/RadioButton;->setChecked(Z)V

    .line 481
    :goto_4
    return-void
.end method

.method private o()V
    .locals 4

    .line 432
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/DeveloperLocationSettingActivity;->ac:Lo/cce;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/me/activity/DeveloperLocationSettingActivity;->ap:Landroid/widget/EditText;

    invoke-virtual {v1}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    const-string v2, "min_dis_acc"

    const-string v3, "100"

    invoke-virtual {v0, v1, v2, v3}, Lo/cce;->c(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 434
    return-void
.end method

.method private p()V
    .locals 4

    .line 442
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/DeveloperLocationSettingActivity;->ac:Lo/cce;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/me/activity/DeveloperLocationSettingActivity;->ag:Landroid/widget/EditText;

    invoke-virtual {v1}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    const-string v2, "min_satellite_threshold_speed"

    const-string v3, "0.3"

    invoke-virtual {v0, v1, v2, v3}, Lo/cce;->b(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 444
    return-void
.end method

.method private q()V
    .locals 7

    .line 511
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/DeveloperLocationSettingActivity;->ac:Lo/cce;

    const-string v1, "min_location_request_interval_time"

    const-wide/16 v2, 0x7d0

    invoke-static {v2, v3}, Ljava/lang/Long;->toString(J)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lo/cce;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    .line 512
    invoke-static {v4}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    move-result-wide v5

    .line 514
    const-string v0, "DeveloperLocationSettingActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, " startSport:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v5, v6}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 516
    const-wide/16 v0, -0x1

    cmp-long v0, v5, v0

    if-lez v0, :cond_4

    .line 517
    const-wide/16 v0, 0x1f4

    cmp-long v0, v5, v0

    if-nez v0, :cond_0

    .line 518
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/DeveloperLocationSettingActivity;->n:Landroid/widget/RadioButton;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/widget/RadioButton;->setChecked(Z)V

    goto :goto_0

    .line 519
    :cond_0
    const-wide/16 v0, 0x3e8

    cmp-long v0, v5, v0

    if-nez v0, :cond_1

    .line 520
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/DeveloperLocationSettingActivity;->p:Landroid/widget/RadioButton;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/widget/RadioButton;->setChecked(Z)V

    goto :goto_0

    .line 521
    :cond_1
    const-wide/16 v0, 0x5dc

    cmp-long v0, v5, v0

    if-nez v0, :cond_2

    .line 522
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/DeveloperLocationSettingActivity;->m:Landroid/widget/RadioButton;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/widget/RadioButton;->setChecked(Z)V

    goto :goto_0

    .line 523
    :cond_2
    const-wide/16 v0, 0x7d0

    cmp-long v0, v5, v0

    if-nez v0, :cond_3

    .line 524
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/DeveloperLocationSettingActivity;->t:Landroid/widget/RadioButton;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/widget/RadioButton;->setChecked(Z)V

    goto :goto_0

    .line 525
    :cond_3
    const-wide/16 v0, 0x9c4

    cmp-long v0, v5, v0

    if-nez v0, :cond_4

    .line 526
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/DeveloperLocationSettingActivity;->q:Landroid/widget/RadioButton;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/widget/RadioButton;->setChecked(Z)V

    .line 530
    :cond_4
    :goto_0
    return-void
.end method

.method private r()V
    .locals 2

    .line 492
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/DeveloperLocationSettingActivity;->d:Landroid/widget/RadioGroup;

    new-instance v1, Lcom/huawei/ui/main/stories/me/activity/DeveloperLocationSettingActivity$13;

    invoke-direct {v1, p0}, Lcom/huawei/ui/main/stories/me/activity/DeveloperLocationSettingActivity$13;-><init>(Lcom/huawei/ui/main/stories/me/activity/DeveloperLocationSettingActivity;)V

    invoke-virtual {v0, v1}, Landroid/widget/RadioGroup;->setOnCheckedChangeListener(Landroid/widget/RadioGroup$OnCheckedChangeListener;)V

    .line 508
    return-void
.end method

.method private s()V
    .locals 6

    .line 554
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/DeveloperLocationSettingActivity;->ac:Lo/cce;

    const-string v1, "min_location_request_interval_distance"

    const/4 v2, 0x0

    invoke-static {v2}, Ljava/lang/Float;->toString(F)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lo/cce;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    .line 555
    invoke-static {v4}, Ljava/lang/Float;->parseFloat(Ljava/lang/String;)F

    move-result v5

    .line 557
    const-string v0, "DeveloperLocationSettingActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, " startSport:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 559
    const/high16 v0, -0x40800000    # -1.0f

    cmpl-float v0, v5, v0

    if-lez v0, :cond_5

    .line 560
    const/4 v0, 0x0

    cmpl-float v0, v5, v0

    if-nez v0, :cond_0

    .line 561
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/DeveloperLocationSettingActivity;->u:Landroid/widget/RadioButton;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/widget/RadioButton;->setChecked(Z)V

    goto :goto_0

    .line 562
    :cond_0
    const v0, 0x3dcccccd    # 0.1f

    sub-float v0, v5, v0

    invoke-static {v0}, Ljava/lang/Math;->abs(F)F

    move-result v0

    float-to-double v0, v0

    const-wide v2, 0x3e7ad7f29abcaf48L    # 1.0E-7

    cmpg-double v0, v0, v2

    if-gez v0, :cond_1

    .line 563
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/DeveloperLocationSettingActivity;->s:Landroid/widget/RadioButton;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/widget/RadioButton;->setChecked(Z)V

    goto :goto_0

    .line 564
    :cond_1
    const/high16 v0, 0x3f000000    # 0.5f

    sub-float v0, v5, v0

    invoke-static {v0}, Ljava/lang/Math;->abs(F)F

    move-result v0

    float-to-double v0, v0

    const-wide v2, 0x3e7ad7f29abcaf48L    # 1.0E-7

    cmpg-double v0, v0, v2

    if-gez v0, :cond_2

    .line 565
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/DeveloperLocationSettingActivity;->r:Landroid/widget/RadioButton;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/widget/RadioButton;->setChecked(Z)V

    goto :goto_0

    .line 566
    :cond_2
    const/high16 v0, 0x3f800000    # 1.0f

    cmpl-float v0, v5, v0

    if-nez v0, :cond_3

    .line 567
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/DeveloperLocationSettingActivity;->y:Landroid/widget/RadioButton;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/widget/RadioButton;->setChecked(Z)V

    goto :goto_0

    .line 568
    :cond_3
    const/high16 v0, 0x40000000    # 2.0f

    cmpl-float v0, v5, v0

    if-nez v0, :cond_4

    .line 569
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/DeveloperLocationSettingActivity;->v:Landroid/widget/RadioButton;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/widget/RadioButton;->setChecked(Z)V

    goto :goto_0

    .line 570
    :cond_4
    const/high16 v0, 0x40400000    # 3.0f

    cmpl-float v0, v5, v0

    if-nez v0, :cond_5

    .line 571
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/DeveloperLocationSettingActivity;->z:Landroid/widget/RadioButton;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/widget/RadioButton;->setChecked(Z)V

    .line 575
    :cond_5
    :goto_0
    return-void
.end method

.method private t()V
    .locals 2

    .line 533
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/DeveloperLocationSettingActivity;->a:Landroid/widget/RadioGroup;

    new-instance v1, Lcom/huawei/ui/main/stories/me/activity/DeveloperLocationSettingActivity$1;

    invoke-direct {v1, p0}, Lcom/huawei/ui/main/stories/me/activity/DeveloperLocationSettingActivity$1;-><init>(Lcom/huawei/ui/main/stories/me/activity/DeveloperLocationSettingActivity;)V

    invoke-virtual {v0, v1}, Landroid/widget/RadioGroup;->setOnCheckedChangeListener(Landroid/widget/RadioGroup$OnCheckedChangeListener;)V

    .line 551
    return-void
.end method

.method private u()V
    .locals 2

    .line 598
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/DeveloperLocationSettingActivity;->A:Landroid/widget/RadioButton;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/widget/RadioButton;->setChecked(Z)V

    .line 619
    return-void
.end method

.method private v()V
    .locals 6

    .line 691
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/DeveloperLocationSettingActivity;->ac:Lo/cce;

    const-string v1, "filter_distance"

    const/high16 v2, 0x40400000    # 3.0f

    invoke-static {v2}, Ljava/lang/Float;->toString(F)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lo/cce;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    .line 692
    invoke-static {v4}, Ljava/lang/Float;->parseFloat(Ljava/lang/String;)F

    move-result v5

    .line 694
    const-string v0, "DeveloperLocationSettingActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, " updateFilterDistanceButton:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 696
    const/high16 v0, 0x3f800000    # 1.0f

    cmpl-float v0, v5, v0

    if-nez v0, :cond_0

    .line 697
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/DeveloperLocationSettingActivity;->F:Landroid/widget/RadioButton;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/widget/RadioButton;->setChecked(Z)V

    goto/16 :goto_0

    .line 698
    :cond_0
    const/high16 v0, 0x40000000    # 2.0f

    cmpl-float v0, v5, v0

    if-nez v0, :cond_1

    .line 699
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/DeveloperLocationSettingActivity;->G:Landroid/widget/RadioButton;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/widget/RadioButton;->setChecked(Z)V

    goto/16 :goto_0

    .line 700
    :cond_1
    const/high16 v0, 0x40400000    # 3.0f

    cmpl-float v0, v5, v0

    if-nez v0, :cond_2

    .line 701
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/DeveloperLocationSettingActivity;->E:Landroid/widget/RadioButton;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/widget/RadioButton;->setChecked(Z)V

    goto/16 :goto_0

    .line 702
    :cond_2
    const/high16 v0, 0x40800000    # 4.0f

    cmpl-float v0, v5, v0

    if-nez v0, :cond_3

    .line 703
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/DeveloperLocationSettingActivity;->I:Landroid/widget/RadioButton;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/widget/RadioButton;->setChecked(Z)V

    goto :goto_0

    .line 704
    :cond_3
    const/high16 v0, 0x40a00000    # 5.0f

    cmpl-float v0, v5, v0

    if-nez v0, :cond_4

    .line 705
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/DeveloperLocationSettingActivity;->L:Landroid/widget/RadioButton;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/widget/RadioButton;->setChecked(Z)V

    goto :goto_0

    .line 706
    :cond_4
    const/high16 v0, 0x40c00000    # 6.0f

    cmpl-float v0, v5, v0

    if-nez v0, :cond_5

    .line 707
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/DeveloperLocationSettingActivity;->N:Landroid/widget/RadioButton;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/widget/RadioButton;->setChecked(Z)V

    goto :goto_0

    .line 708
    :cond_5
    const/high16 v0, 0x40e00000    # 7.0f

    cmpl-float v0, v5, v0

    if-nez v0, :cond_6

    .line 709
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/DeveloperLocationSettingActivity;->M:Landroid/widget/RadioButton;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/widget/RadioButton;->setChecked(Z)V

    goto :goto_0

    .line 710
    :cond_6
    const/high16 v0, 0x41000000    # 8.0f

    cmpl-float v0, v5, v0

    if-nez v0, :cond_7

    .line 711
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/DeveloperLocationSettingActivity;->J:Landroid/widget/RadioButton;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/widget/RadioButton;->setChecked(Z)V

    goto :goto_0

    .line 712
    :cond_7
    const/high16 v0, 0x41100000    # 9.0f

    cmpl-float v0, v5, v0

    if-nez v0, :cond_8

    .line 713
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/DeveloperLocationSettingActivity;->K:Landroid/widget/RadioButton;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/widget/RadioButton;->setChecked(Z)V

    goto :goto_0

    .line 714
    :cond_8
    const/high16 v0, 0x41200000    # 10.0f

    cmpl-float v0, v5, v0

    if-nez v0, :cond_9

    .line 715
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/DeveloperLocationSettingActivity;->P:Landroid/widget/RadioButton;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/widget/RadioButton;->setChecked(Z)V

    .line 717
    :cond_9
    :goto_0
    return-void
.end method

.method private w()V
    .locals 2

    .line 622
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/DeveloperLocationSettingActivity;->g:Landroid/widget/RadioGroup;

    new-instance v1, Lcom/huawei/ui/main/stories/me/activity/DeveloperLocationSettingActivity$4;

    invoke-direct {v1, p0}, Lcom/huawei/ui/main/stories/me/activity/DeveloperLocationSettingActivity$4;-><init>(Lcom/huawei/ui/main/stories/me/activity/DeveloperLocationSettingActivity;)V

    invoke-virtual {v0, v1}, Landroid/widget/RadioGroup;->setOnCheckedChangeListener(Landroid/widget/RadioGroup$OnCheckedChangeListener;)V

    .line 634
    return-void
.end method

.method private x()V
    .locals 5

    .line 637
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/DeveloperLocationSettingActivity;->ac:Lo/cce;

    const-string v1, "correct_location_shifting_enable"

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Lo/cce;->a(Ljava/lang/String;I)I

    move-result v4

    .line 638
    const-string v0, "DeveloperLocationSettingActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, " updateConvertButton:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 639
    if-nez v4, :cond_0

    .line 640
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/DeveloperLocationSettingActivity;->H:Landroid/widget/RadioButton;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/widget/RadioButton;->setChecked(Z)V

    goto :goto_0

    .line 641
    :cond_0
    const/4 v0, 0x2

    if-ne v4, v0, :cond_1

    .line 642
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/DeveloperLocationSettingActivity;->B:Landroid/widget/RadioButton;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/widget/RadioButton;->setChecked(Z)V

    goto :goto_0

    .line 644
    :cond_1
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/DeveloperLocationSettingActivity;->D:Landroid/widget/RadioButton;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/widget/RadioButton;->setChecked(Z)V

    .line 646
    :goto_0
    return-void
.end method

.method private y()V
    .locals 5

    .line 805
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/DeveloperLocationSettingActivity;->ac:Lo/cce;

    const-string v1, "locationService"

    const-string v2, "off"

    invoke-virtual {v0, v1, v2}, Lo/cce;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    .line 806
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/DeveloperLocationSettingActivity;->ac:Lo/cce;

    const-string v1, "locationmgr_key"

    const-string v2, "off"

    invoke-virtual {v0, v1, v2}, Lo/cce;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    .line 807
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/DeveloperLocationSettingActivity;->Z:Landroid/widget/TextView;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    sget v2, Lcom/huawei/ui/main/R$string;->IDS_hw_show_developer_location_setting_gps_health:I

    invoke-virtual {p0, v2}, Lcom/huawei/ui/main/stories/me/activity/DeveloperLocationSettingActivity;->getString(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, " "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 808
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/DeveloperLocationSettingActivity;->ab:Landroid/widget/TextView;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    sget v2, Lcom/huawei/ui/main/R$string;->IDS_hw_show_developer_location_setting_gps_wear:I

    invoke-virtual {p0, v2}, Lcom/huawei/ui/main/stories/me/activity/DeveloperLocationSettingActivity;->getString(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, " "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 809
    return-void
.end method

.method private z()V
    .locals 2

    .line 649
    new-instance v1, Lcom/huawei/ui/main/stories/me/activity/DeveloperLocationSettingActivity$5;

    invoke-direct {v1, p0}, Lcom/huawei/ui/main/stories/me/activity/DeveloperLocationSettingActivity$5;-><init>(Lcom/huawei/ui/main/stories/me/activity/DeveloperLocationSettingActivity;)V

    .line 686
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/DeveloperLocationSettingActivity;->h:Landroid/widget/RadioGroup;

    invoke-virtual {v0, v1}, Landroid/widget/RadioGroup;->setOnCheckedChangeListener(Landroid/widget/RadioGroup$OnCheckedChangeListener;)V

    .line 687
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/DeveloperLocationSettingActivity;->f:Landroid/widget/RadioGroup;

    invoke-virtual {v0, v1}, Landroid/widget/RadioGroup;->setOnCheckedChangeListener(Landroid/widget/RadioGroup$OnCheckedChangeListener;)V

    .line 688
    return-void
.end method


# virtual methods
.method public onCheckedChanged(Landroid/widget/RadioGroup;I)V
    .locals 3

    .line 813
    invoke-virtual {p1}, Landroid/widget/RadioGroup;->getCheckedRadioButtonId()I

    move-result v2

    .line 814
    invoke-direct {p0, p1, v2}, Lcom/huawei/ui/main/stories/me/activity/DeveloperLocationSettingActivity;->e(Landroid/widget/RadioGroup;I)V

    .line 815
    invoke-virtual {p1}, Landroid/widget/RadioGroup;->getId()I

    move-result v0

    sget v1, Lcom/huawei/ui/main/R$id;->need_start_finding_radiogroup:I

    if-ne v0, v1, :cond_1

    .line 816
    sget v0, Lcom/huawei/ui/main/R$id;->need_start_finding_open_radio_button:I

    if-ne v2, v0, :cond_0

    .line 817
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/DeveloperLocationSettingActivity;->ac:Lo/cce;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lo/cce;->d(Z)V

    goto :goto_0

    .line 818
    :cond_0
    sget v0, Lcom/huawei/ui/main/R$id;->need_start_finding_close_radio_button:I

    if-ne v2, v0, :cond_1

    .line 819
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/DeveloperLocationSettingActivity;->ac:Lo/cce;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lo/cce;->d(Z)V

    .line 822
    :cond_1
    :goto_0
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/DeveloperLocationSettingActivity;->ac:Lo/cce;

    invoke-virtual {v0}, Lo/cce;->a()V

    .line 823
    return-void
.end method

.method public onCreate(Landroid/os/Bundle;)V
    .locals 4

    .line 150
    invoke-super {p0, p1}, Lcom/huawei/ui/commonui/base/BaseActivity;->onCreate(Landroid/os/Bundle;)V

    .line 151
    sget-object v0, Lcom/huawei/ui/main/stories/me/activity/DeveloperLocationSettingActivity;->b:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "onCreate()"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 152
    sget v0, Lcom/huawei/ui/main/R$layout;->hw_show_developer_location_setting:I

    invoke-virtual {p0, v0}, Lcom/huawei/ui/main/stories/me/activity/DeveloperLocationSettingActivity;->setContentView(I)V

    .line 153
    iput-object p0, p0, Lcom/huawei/ui/main/stories/me/activity/DeveloperLocationSettingActivity;->c:Landroid/content/Context;

    .line 154
    invoke-virtual {p0}, Lcom/huawei/ui/main/stories/me/activity/DeveloperLocationSettingActivity;->getWindow()Landroid/view/Window;

    move-result-object v0

    const/16 v1, 0x12

    invoke-virtual {v0, v1}, Landroid/view/Window;->setSoftInputMode(I)V

    .line 155
    new-instance v0, Lo/cce;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/me/activity/DeveloperLocationSettingActivity;->c:Landroid/content/Context;

    invoke-direct {v0, v1}, Lo/cce;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/DeveloperLocationSettingActivity;->ac:Lo/cce;

    .line 157
    invoke-direct {p0}, Lcom/huawei/ui/main/stories/me/activity/DeveloperLocationSettingActivity;->c()V

    .line 158
    invoke-direct {p0}, Lcom/huawei/ui/main/stories/me/activity/DeveloperLocationSettingActivity;->n()V

    .line 159
    return-void
.end method

.method public onDestroy()V
    .locals 1

    .line 142
    invoke-super {p0}, Lcom/huawei/ui/commonui/base/BaseActivity;->onDestroy()V

    .line 143
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/DeveloperLocationSettingActivity;->ac:Lo/cce;

    if-eqz v0, :cond_0

    .line 144
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/DeveloperLocationSettingActivity;->ac:Lo/cce;

    invoke-virtual {v0}, Lo/cce;->a()V

    .line 146
    :cond_0
    return-void
.end method
