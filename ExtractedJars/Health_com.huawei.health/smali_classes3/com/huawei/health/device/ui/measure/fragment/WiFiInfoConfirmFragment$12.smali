.class Lcom/huawei/health/device/ui/measure/fragment/WiFiInfoConfirmFragment$12;
.super Landroid/text/style/ClickableSpan;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/health/device/ui/measure/fragment/WiFiInfoConfirmFragment;->setConnectFailClick()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/huawei/health/device/ui/measure/fragment/WiFiInfoConfirmFragment;


# direct methods
.method constructor <init>(Lcom/huawei/health/device/ui/measure/fragment/WiFiInfoConfirmFragment;)V
    .locals 0

    .line 999
    iput-object p1, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiInfoConfirmFragment$12;->this$0:Lcom/huawei/health/device/ui/measure/fragment/WiFiInfoConfirmFragment;

    invoke-direct {p0}, Landroid/text/style/ClickableSpan;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 1

    .line 1002
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiInfoConfirmFragment$12;->this$0:Lcom/huawei/health/device/ui/measure/fragment/WiFiInfoConfirmFragment;

    invoke-static {v0}, Lcom/huawei/health/device/ui/measure/fragment/WiFiInfoConfirmFragment;->access$3100(Lcom/huawei/health/device/ui/measure/fragment/WiFiInfoConfirmFragment;)Landroid/app/Activity;

    move-result-object v0

    invoke-static {v0}, Lo/akf;->g(Landroid/content/Context;)V

    .line 1003
    return-void
.end method

.method public updateDrawState(Landroid/text/TextPaint;)V
    .locals 1

    .line 1007
    invoke-super {p0, p1}, Landroid/text/style/ClickableSpan;->updateDrawState(Landroid/text/TextPaint;)V

    .line 1008
    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Landroid/text/TextPaint;->setUnderlineText(Z)V

    .line 1009
    return-void
.end method
