.class Lcom/huawei/ui/device/activity/goldmember/HuaweiMemberActivity$4;
.super Landroid/text/style/ClickableSpan;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/ui/device/activity/goldmember/HuaweiMemberActivity;->a()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic d:Lcom/huawei/ui/device/activity/goldmember/HuaweiMemberActivity;


# direct methods
.method constructor <init>(Lcom/huawei/ui/device/activity/goldmember/HuaweiMemberActivity;)V
    .locals 0

    .line 96
    iput-object p1, p0, Lcom/huawei/ui/device/activity/goldmember/HuaweiMemberActivity$4;->d:Lcom/huawei/ui/device/activity/goldmember/HuaweiMemberActivity;

    invoke-direct {p0}, Landroid/text/style/ClickableSpan;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 5

    .line 100
    iget-object v0, p0, Lcom/huawei/ui/device/activity/goldmember/HuaweiMemberActivity$4;->d:Lcom/huawei/ui/device/activity/goldmember/HuaweiMemberActivity;

    iget-object v1, p0, Lcom/huawei/ui/device/activity/goldmember/HuaweiMemberActivity$4;->d:Lcom/huawei/ui/device/activity/goldmember/HuaweiMemberActivity;

    invoke-static {v1}, Lcom/huawei/ui/device/activity/goldmember/HuaweiMemberActivity;->c(Lcom/huawei/ui/device/activity/goldmember/HuaweiMemberActivity;)Landroid/content/Context;

    move-result-object v1

    const-string v2, "userPermission"

    iget-object v3, p0, Lcom/huawei/ui/device/activity/goldmember/HuaweiMemberActivity$4;->d:Lcom/huawei/ui/device/activity/goldmember/HuaweiMemberActivity;

    .line 101
    invoke-static {v3}, Lcom/huawei/ui/device/activity/goldmember/HuaweiMemberActivity;->c(Lcom/huawei/ui/device/activity/goldmember/HuaweiMemberActivity;)Landroid/content/Context;

    move-result-object v3

    invoke-virtual {v3}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v3

    sget v4, Lcom/huawei/ui/device/R$string;->IDS_main_sns_golden_member_user_agreement:I

    invoke-virtual {v3, v4}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v3

    .line 100
    invoke-static {v0, v1, v2, v3}, Lcom/huawei/ui/device/activity/goldmember/HuaweiMemberActivity;->d(Lcom/huawei/ui/device/activity/goldmember/HuaweiMemberActivity;Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)V

    .line 102
    return-void
.end method

.method public updateDrawState(Landroid/text/TextPaint;)V
    .locals 1

    .line 106
    invoke-super {p0, p1}, Landroid/text/style/ClickableSpan;->updateDrawState(Landroid/text/TextPaint;)V

    .line 107
    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Landroid/text/TextPaint;->setUnderlineText(Z)V

    .line 108
    const-string v0, "#0D9FFB"

    invoke-static {v0}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v0

    invoke-virtual {p1, v0}, Landroid/text/TextPaint;->setColor(I)V

    .line 109
    return-void
.end method
