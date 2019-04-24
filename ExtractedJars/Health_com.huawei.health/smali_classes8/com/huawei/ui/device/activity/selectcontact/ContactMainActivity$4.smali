.class Lcom/huawei/ui/device/activity/selectcontact/ContactMainActivity$4;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/ui/device/activity/selectcontact/ContactMainActivity;->b(Landroid/content/Intent;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic e:Lcom/huawei/ui/device/activity/selectcontact/ContactMainActivity;


# direct methods
.method constructor <init>(Lcom/huawei/ui/device/activity/selectcontact/ContactMainActivity;)V
    .locals 0

    .line 588
    iput-object p1, p0, Lcom/huawei/ui/device/activity/selectcontact/ContactMainActivity$4;->e:Lcom/huawei/ui/device/activity/selectcontact/ContactMainActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 2

    .line 591
    iget-object v0, p0, Lcom/huawei/ui/device/activity/selectcontact/ContactMainActivity$4;->e:Lcom/huawei/ui/device/activity/selectcontact/ContactMainActivity;

    invoke-static {v0}, Lcom/huawei/ui/device/activity/selectcontact/ContactMainActivity;->f(Lcom/huawei/ui/device/activity/selectcontact/ContactMainActivity;)Lo/egv;

    move-result-object v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 592
    iget-object v0, p0, Lcom/huawei/ui/device/activity/selectcontact/ContactMainActivity$4;->e:Lcom/huawei/ui/device/activity/selectcontact/ContactMainActivity;

    invoke-static {v0}, Lcom/huawei/ui/device/activity/selectcontact/ContactMainActivity;->f(Lcom/huawei/ui/device/activity/selectcontact/ContactMainActivity;)Lo/egv;

    move-result-object v0

    invoke-virtual {v0}, Lo/egv;->dismiss()V

    .line 593
    iget-object v0, p0, Lcom/huawei/ui/device/activity/selectcontact/ContactMainActivity$4;->e:Lcom/huawei/ui/device/activity/selectcontact/ContactMainActivity;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/huawei/ui/device/activity/selectcontact/ContactMainActivity;->e(Lcom/huawei/ui/device/activity/selectcontact/ContactMainActivity;Lo/egv;)Lo/egv;

    .line 595
    :cond_0
    return-void
.end method
