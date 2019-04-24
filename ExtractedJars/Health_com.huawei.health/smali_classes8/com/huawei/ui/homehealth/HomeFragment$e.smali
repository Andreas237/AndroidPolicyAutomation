.class Lcom/huawei/ui/homehealth/HomeFragment$e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/ahi$e;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/ui/homehealth/HomeFragment;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "e"
.end annotation


# instance fields
.field private e:Ljava/lang/ref/WeakReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ref/WeakReference<Landroid/content/Context;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    .line 1847
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 1848
    new-instance v0, Ljava/lang/ref/WeakReference;

    invoke-direct {v0, p1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object v0, p0, Lcom/huawei/ui/homehealth/HomeFragment$e;->e:Ljava/lang/ref/WeakReference;

    .line 1849
    return-void
.end method


# virtual methods
.method public onEvent(Lo/ahi$a;)V
    .locals 7

    .line 1854
    iget-object v0, p0, Lcom/huawei/ui/homehealth/HomeFragment$e;->e:Ljava/lang/ref/WeakReference;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    iget-object v0, p0, Lcom/huawei/ui/homehealth/HomeFragment$e;->e:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    const/4 v1, 0x0

    if-ne v1, v0, :cond_1

    .line 1855
    :cond_0
    const-string v0, "UIHLH_HomeFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "mContext is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1856
    return-void

    .line 1858
    :cond_1
    invoke-virtual {p1}, Lo/ahi$a;->e()Landroid/content/Intent;

    move-result-object v0

    if-eqz v0, :cond_4

    const-string v0, "evebus_weight_measure_notification"

    invoke-virtual {p1}, Lo/ahi$a;->a()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_4

    .line 1859
    invoke-virtual {p1}, Lo/ahi$a;->e()Landroid/content/Intent;

    move-result-object v0

    const-string v1, "isDelUser"

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Landroid/content/Intent;->getBooleanExtra(Ljava/lang/String;Z)Z

    move-result v4

    .line 1860
    const-string v0, "UIHLH_HomeFragment"

    const/4 v1, 0x6

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "EventBusCallback isDelUser:"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v4}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    const-string v2, " isConflict:"

    const/4 v3, 0x2

    aput-object v2, v1, v3

    invoke-static {}, Lcom/huawei/ui/homehealth/HomeFragment;->c()Z

    move-result v2

    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    const/4 v3, 0x3

    aput-object v2, v1, v3

    const-string v2, " Size:"

    const/4 v3, 0x4

    aput-object v2, v1, v3

    sget-object v2, Lo/ahw;->e:Lo/ahw;

    invoke-virtual {v2}, Lo/ahw;->d()Ljava/util/ArrayList;

    move-result-object v2

    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x5

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1861
    sget-object v0, Lo/ahw;->e:Lo/ahw;

    invoke-virtual {v0}, Lo/ahw;->d()Ljava/util/ArrayList;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-nez v0, :cond_2

    invoke-static {}, Lcom/huawei/ui/homehealth/HomeFragment;->c()Z

    move-result v0

    if-eqz v0, :cond_2

    if-eqz v4, :cond_3

    :cond_2
    if-eqz v4, :cond_4

    invoke-static {}, Lcom/huawei/ui/homehealth/HomeFragment;->c()Z

    move-result v0

    if-nez v0, :cond_4

    .line 1862
    :cond_3
    const-string v0, "UIHLH_HomeFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "EventBusCallback cancle Notification"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1863
    new-instance v5, Lo/fhd;

    iget-object v0, p0, Lcom/huawei/ui/homehealth/HomeFragment$e;->e:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/content/Context;

    invoke-direct {v5, v0}, Lo/fhd;-><init>(Landroid/content/Context;)V

    .line 1864
    const-string v0, "9111"

    const-string v1, "9111"

    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result v1

    const/4 v2, 0x1

    invoke-virtual {v0, v2, v1}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v6

    .line 1865
    iget-object v0, p0, Lcom/huawei/ui/homehealth/HomeFragment$e;->e:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/content/Context;

    invoke-static {v0, v6}, Lo/dbf;->e(Landroid/content/Context;Ljava/lang/String;)I

    move-result v0

    invoke-virtual {v5, v0}, Lo/fhd;->e(I)V

    .line 1868
    :cond_4
    return-void
.end method
