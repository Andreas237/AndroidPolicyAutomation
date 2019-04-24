.class public Lcom/huawei/health/sns/ui/chat/photo/send/PhotoBasePagerActivity;
.super Lcom/huawei/health/sns/ui/base/SNSBaseActivity;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/huawei/health/sns/ui/chat/photo/send/PhotoBasePagerActivity$d;,
        Lcom/huawei/health/sns/ui/chat/photo/send/PhotoBasePagerActivity$e;
    }
.end annotation


# instance fields
.field protected g:Landroid/widget/RelativeLayout;

.field public l:Lo/bns;

.field public m:Landroid/view/View;

.field protected n:Landroid/view/View;

.field protected o:Lcom/huawei/health/sns/ui/chat/photo/send/PhotoBasePagerActivity$d;

.field protected p:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<Ljava/lang/Integer;>;"
        }
    .end annotation
.end field

.field public s:I


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 32
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/base/SNSBaseActivity;-><init>()V

    return-void
.end method


# virtual methods
.method protected b()V
    .locals 2

    .line 82
    const-string v0, "PhotoBasePagerActivity"

    const-string v1, "show head and bottom controls"

    invoke-static {v0, v1}, Lo/bpf;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 84
    iget-object v0, p0, Lcom/huawei/health/sns/ui/chat/photo/send/PhotoBasePagerActivity;->g:Landroid/widget/RelativeLayout;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    .line 85
    iget-object v0, p0, Lcom/huawei/health/sns/ui/chat/photo/send/PhotoBasePagerActivity;->n:Landroid/view/View;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    invoke-static {}, Lo/bom;->i()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 87
    iget-object v0, p0, Lcom/huawei/health/sns/ui/chat/photo/send/PhotoBasePagerActivity;->n:Landroid/view/View;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 89
    :cond_0
    return-void
.end method

.method protected c()V
    .locals 2

    .line 96
    const-string v0, "PhotoBasePagerActivity"

    const-string v1, "hidehead and bottom controls"

    invoke-static {v0, v1}, Lo/bpf;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 98
    iget-object v0, p0, Lcom/huawei/health/sns/ui/chat/photo/send/PhotoBasePagerActivity;->g:Landroid/widget/RelativeLayout;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    .line 99
    iget-object v0, p0, Lcom/huawei/health/sns/ui/chat/photo/send/PhotoBasePagerActivity;->n:Landroid/view/View;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    invoke-static {}, Lo/bom;->i()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 101
    iget-object v0, p0, Lcom/huawei/health/sns/ui/chat/photo/send/PhotoBasePagerActivity;->n:Landroid/view/View;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 103
    :cond_0
    return-void
.end method

.method protected e()V
    .locals 5

    .line 110
    invoke-static {}, Lo/bom;->i()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 112
    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Lcom/huawei/health/sns/ui/chat/photo/send/PhotoBasePagerActivity;->setRequestedOrientation(I)V

    .line 114
    invoke-virtual {p0}, Lcom/huawei/health/sns/ui/chat/photo/send/PhotoBasePagerActivity;->getWindow()Landroid/view/Window;

    move-result-object v0

    const/high16 v1, 0x8000000

    invoke-virtual {v0, v1}, Landroid/view/Window;->addFlags(I)V

    .line 116
    sget v0, Lcom/huawei/android/sns/R$style;->sns_primaryColorTheme:I

    invoke-virtual {p0, v0}, Lcom/huawei/health/sns/ui/chat/photo/send/PhotoBasePagerActivity;->setTheme(I)V

    .line 118
    invoke-virtual {p0}, Lcom/huawei/health/sns/ui/chat/photo/send/PhotoBasePagerActivity;->getWindow()Landroid/view/Window;

    move-result-object v0

    sget v1, Lcom/huawei/android/sns/R$color;->sns_black_60_percent_fordark:I

    invoke-virtual {p0, v1}, Lcom/huawei/health/sns/ui/chat/photo/send/PhotoBasePagerActivity;->getColor(I)I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/view/Window;->setStatusBarColor(I)V

    goto :goto_0

    .line 135
    :cond_0
    const-string v0, "PhotoBasePagerActivity"

    const-string v1, "BuildEx class not exist or EMUI_SDK_INT less than 9"

    invoke-static {v0, v1}, Lo/bpf;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 136
    invoke-virtual {p0}, Lcom/huawei/health/sns/ui/chat/photo/send/PhotoBasePagerActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    const-string v1, "androidhwext:style/Theme.Emui"

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-virtual {v0, v1, v2, v3}, Landroid/content/res/Resources;->getIdentifier(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)I

    move-result v4

    .line 137
    if-eqz v4, :cond_1

    .line 139
    invoke-virtual {p0, v4}, Lcom/huawei/health/sns/ui/chat/photo/send/PhotoBasePagerActivity;->setTheme(I)V

    goto :goto_0

    .line 143
    :cond_1
    const v0, 0x103006e

    invoke-virtual {p0, v0}, Lcom/huawei/health/sns/ui/chat/photo/send/PhotoBasePagerActivity;->setTheme(I)V

    .line 146
    :goto_0
    return-void
.end method

.method public onCreate(Landroid/os/Bundle;)V
    .locals 0

    .line 74
    invoke-super {p0, p1}, Lcom/huawei/health/sns/ui/base/SNSBaseActivity;->onCreate(Landroid/os/Bundle;)V

    .line 75
    return-void
.end method
