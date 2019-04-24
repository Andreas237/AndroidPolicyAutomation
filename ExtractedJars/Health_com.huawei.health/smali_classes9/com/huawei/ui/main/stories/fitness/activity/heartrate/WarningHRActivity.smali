.class public Lcom/huawei/ui/main/stories/fitness/activity/heartrate/WarningHRActivity;
.super Lcom/huawei/ui/commonui/base/BaseActivity;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 15
    invoke-direct {p0}, Lcom/huawei/ui/commonui/base/BaseActivity;-><init>()V

    return-void
.end method

.method private a()V
    .locals 3

    .line 25
    sget v0, Lcom/huawei/ui/main/R$id;->expand_listview:I

    invoke-virtual {p0, v0}, Lcom/huawei/ui/main/stories/fitness/activity/heartrate/WarningHRActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    move-object v1, v0

    check-cast v1, Lo/fbi;

    .line 26
    new-instance v0, Lcom/huawei/ui/main/stories/fitness/activity/heartrate/WarningHRActivity$2;

    invoke-direct {v0, p0}, Lcom/huawei/ui/main/stories/fitness/activity/heartrate/WarningHRActivity$2;-><init>(Lcom/huawei/ui/main/stories/fitness/activity/heartrate/WarningHRActivity;)V

    invoke-virtual {v1, v0}, Lo/fbi;->c(Lo/fbi$d;)V

    .line 39
    new-instance v2, Lo/fay;

    invoke-direct {v2, p0}, Lo/fay;-><init>(Landroid/content/Context;)V

    .line 40
    new-instance v0, Lcom/huawei/ui/main/stories/fitness/activity/heartrate/WarningHRActivity$3;

    invoke-direct {v0, p0, v1, v2}, Lcom/huawei/ui/main/stories/fitness/activity/heartrate/WarningHRActivity$3;-><init>(Lcom/huawei/ui/main/stories/fitness/activity/heartrate/WarningHRActivity;Lo/fbi;Lo/fbd;)V

    invoke-virtual {v2, v0}, Lo/fbd;->a(Lo/fbd$c;)V

    .line 52
    return-void
.end method


# virtual methods
.method public onCreate(Landroid/os/Bundle;)V
    .locals 1

    .line 19
    invoke-super {p0, p1}, Lcom/huawei/ui/commonui/base/BaseActivity;->onCreate(Landroid/os/Bundle;)V

    .line 20
    sget v0, Lcom/huawei/ui/main/R$layout;->activity_warning_heart_rate:I

    invoke-virtual {p0, v0}, Lcom/huawei/ui/main/stories/fitness/activity/heartrate/WarningHRActivity;->setContentView(I)V

    .line 21
    invoke-direct {p0}, Lcom/huawei/ui/main/stories/fitness/activity/heartrate/WarningHRActivity;->a()V

    .line 22
    return-void
.end method
