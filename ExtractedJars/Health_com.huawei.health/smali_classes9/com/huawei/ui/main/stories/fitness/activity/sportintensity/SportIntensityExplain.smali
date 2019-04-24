.class public Lcom/huawei/ui/main/stories/fitness/activity/sportintensity/SportIntensityExplain;
.super Lcom/huawei/ui/commonui/base/BaseActivity;
.source "SourceFile"


# instance fields
.field private a:Lo/emr;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 12
    invoke-direct {p0}, Lcom/huawei/ui/commonui/base/BaseActivity;-><init>()V

    return-void
.end method

.method private d()V
    .locals 2

    .line 24
    sget v0, Lcom/huawei/ui/main/R$id;->fitness_detail_titlebar:I

    invoke-static {p0, v0}, Lo/enc;->c(Landroid/app/Activity;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lo/emr;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/sportintensity/SportIntensityExplain;->a:Lo/emr;

    .line 25
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/sportintensity/SportIntensityExplain;->a:Lo/emr;

    sget v1, Lcom/huawei/ui/main/R$string;->IDS_hw_pressure_explain:I

    invoke-virtual {p0, v1}, Lcom/huawei/ui/main/stories/fitness/activity/sportintensity/SportIntensityExplain;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/emr;->setTitleText(Ljava/lang/String;)V

    .line 26
    return-void
.end method


# virtual methods
.method public onCreate(Landroid/os/Bundle;)V
    .locals 1

    .line 18
    invoke-super {p0, p1}, Lcom/huawei/ui/commonui/base/BaseActivity;->onCreate(Landroid/os/Bundle;)V

    .line 19
    sget v0, Lcom/huawei/ui/main/R$layout;->sport_intensity_explain:I

    invoke-virtual {p0, v0}, Lcom/huawei/ui/main/stories/fitness/activity/sportintensity/SportIntensityExplain;->setContentView(I)V

    .line 20
    invoke-direct {p0}, Lcom/huawei/ui/main/stories/fitness/activity/sportintensity/SportIntensityExplain;->d()V

    .line 21
    return-void
.end method
