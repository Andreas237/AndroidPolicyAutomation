.class Lcom/huawei/ui/device/activity/selectcontact/ContactMainActivity$3;
.super Lo/dbs;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/ui/device/activity/selectcontact/ContactMainActivity;->l()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic d:Lcom/huawei/ui/device/activity/selectcontact/ContactMainActivity;


# direct methods
.method constructor <init>(Lcom/huawei/ui/device/activity/selectcontact/ContactMainActivity;)V
    .locals 0

    .line 440
    iput-object p1, p0, Lcom/huawei/ui/device/activity/selectcontact/ContactMainActivity$3;->d:Lcom/huawei/ui/device/activity/selectcontact/ContactMainActivity;

    invoke-direct {p0}, Lo/dbs;-><init>()V

    return-void
.end method


# virtual methods
.method public onDenied(Ljava/lang/String;)V
    .locals 4

    .line 449
    const-string v0, "ContactMainActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "onDenied()"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 450
    iget-object v0, p0, Lcom/huawei/ui/device/activity/selectcontact/ContactMainActivity$3;->d:Lcom/huawei/ui/device/activity/selectcontact/ContactMainActivity;

    invoke-static {v0}, Lcom/huawei/ui/device/activity/selectcontact/ContactMainActivity;->d(Lcom/huawei/ui/device/activity/selectcontact/ContactMainActivity;)Landroid/content/Context;

    move-result-object v0

    sget v1, Lcom/huawei/ui/device/R$string;->IDS_contact_have_no_permission_to_read_health:I

    invoke-static {v0, v1}, Lo/emv;->e(Landroid/content/Context;I)V

    .line 451
    return-void
.end method

.method public onGranted()V
    .locals 4

    .line 443
    const-string v0, "ContactMainActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "onGranted()"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 444
    iget-object v0, p0, Lcom/huawei/ui/device/activity/selectcontact/ContactMainActivity$3;->d:Lcom/huawei/ui/device/activity/selectcontact/ContactMainActivity;

    invoke-static {v0}, Lcom/huawei/ui/device/activity/selectcontact/ContactMainActivity;->h(Lcom/huawei/ui/device/activity/selectcontact/ContactMainActivity;)V

    .line 445
    return-void
.end method
