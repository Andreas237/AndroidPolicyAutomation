.class Lcom/huawei/ui/homehealth/HomeFragment$14;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/ui/homehealth/HomeFragment;->g()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/huawei/ui/homehealth/HomeFragment;


# direct methods
.method constructor <init>(Lcom/huawei/ui/homehealth/HomeFragment;)V
    .locals 0

    .line 641
    iput-object p1, p0, Lcom/huawei/ui/homehealth/HomeFragment$14;->a:Lcom/huawei/ui/homehealth/HomeFragment;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 4

    .line 644
    invoke-static {}, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->k()Z

    move-result v0

    if-nez v0, :cond_0

    .line 645
    const-string v0, "UIHLH_HomeFragment"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "scrollToSmartDeviceCard return WearHomeActivity.isFromWearDetail():"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {}, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->k()Z

    move-result v2

    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 646
    return-void

    .line 648
    :cond_0
    const/4 v0, 0x0

    invoke-static {v0}, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->b(Z)V

    .line 649
    return-void
.end method
