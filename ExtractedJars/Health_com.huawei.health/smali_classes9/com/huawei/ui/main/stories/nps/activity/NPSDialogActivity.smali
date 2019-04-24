.class public Lcom/huawei/ui/main/stories/nps/activity/NPSDialogActivity;
.super Landroid/app/Activity;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/huawei/ui/main/stories/nps/activity/NPSDialogActivity$MyNegativeOnclickListenner;,
        Lcom/huawei/ui/main/stories/nps/activity/NPSDialogActivity$MyPositiveOnclickListenner;
    }
.end annotation


# static fields
.field private static final TAG:Ljava/lang/String;


# instance fields
.field private utils:Lcom/huawei/ui/main/stories/nps/activity/DialogActivityUtils;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 22
    const-class v0, Lcom/huawei/ui/main/stories/nps/activity/NPSDialogActivity;

    invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lcom/huawei/ui/main/stories/nps/activity/NPSDialogActivity;->TAG:Ljava/lang/String;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 20
    invoke-direct {p0}, Landroid/app/Activity;-><init>()V

    return-void
.end method

.method static synthetic access$000(Lcom/huawei/ui/main/stories/nps/activity/NPSDialogActivity;)Lcom/huawei/ui/main/stories/nps/activity/DialogActivityUtils;
    .locals 1

    .line 20
    iget-object v0, p0, Lcom/huawei/ui/main/stories/nps/activity/NPSDialogActivity;->utils:Lcom/huawei/ui/main/stories/nps/activity/DialogActivityUtils;

    return-object v0
.end method

.method private initView()V
    .locals 8

    .line 46
    sget v0, Lcom/huawei/ui/main/R$id;->nps_tv_dialog_title:I

    invoke-static {p0, v0}, Lo/enc;->c(Landroid/app/Activity;I)Landroid/view/View;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Landroid/widget/TextView;

    .line 47
    iget-object v0, p0, Lcom/huawei/ui/main/stories/nps/activity/NPSDialogActivity;->utils:Lcom/huawei/ui/main/stories/nps/activity/DialogActivityUtils;

    invoke-virtual {v0}, Lcom/huawei/ui/main/stories/nps/activity/DialogActivityUtils;->getTitle()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v4, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 49
    sget-object v0, Lcom/huawei/ui/main/stories/nps/activity/NPSDialogActivity;->TAG:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "content = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lcom/huawei/ui/main/stories/nps/activity/NPSDialogActivity;->utils:Lcom/huawei/ui/main/stories/nps/activity/DialogActivityUtils;

    invoke-virtual {v3}, Lcom/huawei/ui/main/stories/nps/activity/DialogActivityUtils;->getMessage()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 52
    sget v0, Lcom/huawei/ui/main/R$id;->nps_tv_dialog_message:I

    invoke-static {p0, v0}, Lo/enc;->c(Landroid/app/Activity;I)Landroid/view/View;

    move-result-object v0

    move-object v5, v0

    check-cast v5, Landroid/widget/TextView;

    .line 53
    iget-object v0, p0, Lcom/huawei/ui/main/stories/nps/activity/NPSDialogActivity;->utils:Lcom/huawei/ui/main/stories/nps/activity/DialogActivityUtils;

    invoke-virtual {v0}, Lcom/huawei/ui/main/stories/nps/activity/DialogActivityUtils;->getMessage()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v5, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 55
    sget v0, Lcom/huawei/ui/main/R$id;->nps_btn_dialog_positive:I

    invoke-static {p0, v0}, Lo/enc;->c(Landroid/app/Activity;I)Landroid/view/View;

    move-result-object v0

    move-object v6, v0

    check-cast v6, Landroid/widget/Button;

    .line 56
    iget-object v0, p0, Lcom/huawei/ui/main/stories/nps/activity/NPSDialogActivity;->utils:Lcom/huawei/ui/main/stories/nps/activity/DialogActivityUtils;

    invoke-virtual {v0}, Lcom/huawei/ui/main/stories/nps/activity/DialogActivityUtils;->getPositionText()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v6, v0}, Landroid/widget/Button;->setText(Ljava/lang/CharSequence;)V

    .line 57
    new-instance v0, Lcom/huawei/ui/main/stories/nps/activity/NPSDialogActivity$MyPositiveOnclickListenner;

    invoke-direct {v0, p0}, Lcom/huawei/ui/main/stories/nps/activity/NPSDialogActivity$MyPositiveOnclickListenner;-><init>(Lcom/huawei/ui/main/stories/nps/activity/NPSDialogActivity;)V

    invoke-virtual {v6, v0}, Landroid/widget/Button;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 59
    sget v0, Lcom/huawei/ui/main/R$id;->nps_btn_dialog_negative:I

    invoke-static {p0, v0}, Lo/enc;->c(Landroid/app/Activity;I)Landroid/view/View;

    move-result-object v0

    move-object v7, v0

    check-cast v7, Landroid/widget/Button;

    .line 60
    iget-object v0, p0, Lcom/huawei/ui/main/stories/nps/activity/NPSDialogActivity;->utils:Lcom/huawei/ui/main/stories/nps/activity/DialogActivityUtils;

    invoke-virtual {v0}, Lcom/huawei/ui/main/stories/nps/activity/DialogActivityUtils;->getNegativeText()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v7, v0}, Landroid/widget/Button;->setText(Ljava/lang/CharSequence;)V

    .line 61
    new-instance v0, Lcom/huawei/ui/main/stories/nps/activity/NPSDialogActivity$MyNegativeOnclickListenner;

    invoke-direct {v0, p0}, Lcom/huawei/ui/main/stories/nps/activity/NPSDialogActivity$MyNegativeOnclickListenner;-><init>(Lcom/huawei/ui/main/stories/nps/activity/NPSDialogActivity;)V

    invoke-virtual {v7, v0}, Landroid/widget/Button;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 62
    return-void
.end method


# virtual methods
.method protected onCreate(Landroid/os/Bundle;)V
    .locals 3

    .line 28
    invoke-super {p0, p1}, Landroid/app/Activity;->onCreate(Landroid/os/Bundle;)V

    .line 29
    sget v0, Lcom/huawei/ui/main/R$layout;->activity_nps_dialog:I

    invoke-virtual {p0, v0}, Lcom/huawei/ui/main/stories/nps/activity/NPSDialogActivity;->setContentView(I)V

    .line 31
    invoke-static {}, Lcom/huawei/ui/main/stories/nps/activity/DialogActivityUtils;->getInstance()Lcom/huawei/ui/main/stories/nps/activity/DialogActivityUtils;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/ui/main/stories/nps/activity/NPSDialogActivity;->utils:Lcom/huawei/ui/main/stories/nps/activity/DialogActivityUtils;

    .line 33
    invoke-virtual {p0}, Lcom/huawei/ui/main/stories/nps/activity/NPSDialogActivity;->getWindow()Landroid/view/Window;

    move-result-object v1

    .line 34
    const/16 v0, 0x50

    invoke-virtual {v1, v0}, Landroid/view/Window;->setGravity(I)V

    .line 35
    invoke-virtual {v1}, Landroid/view/Window;->getAttributes()Landroid/view/WindowManager$LayoutParams;

    move-result-object v2

    .line 36
    const/4 v0, -0x1

    iput v0, v2, Landroid/view/WindowManager$LayoutParams;->width:I

    .line 37
    const/4 v0, -0x2

    iput v0, v2, Landroid/view/WindowManager$LayoutParams;->height:I

    .line 38
    invoke-virtual {p0, v2}, Lcom/huawei/ui/main/stories/nps/activity/NPSDialogActivity;->onWindowAttributesChanged(Landroid/view/WindowManager$LayoutParams;)V

    .line 39
    sget v0, Lcom/huawei/ui/main/R$style;->track_dialog_anim:I

    invoke-virtual {v1, v0}, Landroid/view/Window;->setWindowAnimations(I)V

    .line 41
    invoke-direct {p0}, Lcom/huawei/ui/main/stories/nps/activity/NPSDialogActivity;->initView()V

    .line 42
    return-void
.end method
