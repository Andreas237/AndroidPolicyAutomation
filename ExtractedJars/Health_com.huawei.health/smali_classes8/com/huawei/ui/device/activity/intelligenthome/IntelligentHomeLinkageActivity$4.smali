.class Lcom/huawei/ui/device/activity/intelligenthome/IntelligentHomeLinkageActivity$4;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/ui/device/activity/intelligenthome/IntelligentHomeLinkageActivity;->k()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic e:Lcom/huawei/ui/device/activity/intelligenthome/IntelligentHomeLinkageActivity;


# direct methods
.method constructor <init>(Lcom/huawei/ui/device/activity/intelligenthome/IntelligentHomeLinkageActivity;)V
    .locals 0

    .line 753
    iput-object p1, p0, Lcom/huawei/ui/device/activity/intelligenthome/IntelligentHomeLinkageActivity$4;->e:Lcom/huawei/ui/device/activity/intelligenthome/IntelligentHomeLinkageActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 4

    .line 756
    const-string v0, "IntelligentHomeLinkageActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "showDownloadNewAppDialog cancel click"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 757
    iget-object v0, p0, Lcom/huawei/ui/device/activity/intelligenthome/IntelligentHomeLinkageActivity$4;->e:Lcom/huawei/ui/device/activity/intelligenthome/IntelligentHomeLinkageActivity;

    invoke-static {v0}, Lcom/huawei/ui/device/activity/intelligenthome/IntelligentHomeLinkageActivity;->B(Lcom/huawei/ui/device/activity/intelligenthome/IntelligentHomeLinkageActivity;)Lo/egy;

    move-result-object v0

    invoke-virtual {v0}, Lo/egy;->dismiss()V

    .line 758
    iget-object v0, p0, Lcom/huawei/ui/device/activity/intelligenthome/IntelligentHomeLinkageActivity$4;->e:Lcom/huawei/ui/device/activity/intelligenthome/IntelligentHomeLinkageActivity;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/huawei/ui/device/activity/intelligenthome/IntelligentHomeLinkageActivity;->a(Lcom/huawei/ui/device/activity/intelligenthome/IntelligentHomeLinkageActivity;Lo/egy;)Lo/egy;

    .line 759
    iget-object v0, p0, Lcom/huawei/ui/device/activity/intelligenthome/IntelligentHomeLinkageActivity$4;->e:Lcom/huawei/ui/device/activity/intelligenthome/IntelligentHomeLinkageActivity;

    invoke-virtual {v0}, Lcom/huawei/ui/device/activity/intelligenthome/IntelligentHomeLinkageActivity;->finish()V

    .line 760
    return-void
.end method
