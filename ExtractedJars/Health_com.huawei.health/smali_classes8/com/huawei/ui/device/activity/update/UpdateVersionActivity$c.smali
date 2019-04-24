.class Lcom/huawei/ui/device/activity/update/UpdateVersionActivity$c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/huawei/hwbasemgr/IBaseResponseCallback;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/ui/device/activity/update/UpdateVersionActivity;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "c"
.end annotation


# instance fields
.field a:Ljava/lang/ref/WeakReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ref/WeakReference<Lcom/huawei/ui/device/activity/update/UpdateVersionActivity;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lcom/huawei/ui/device/activity/update/UpdateVersionActivity;)V
    .locals 1

    .line 658
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 659
    new-instance v0, Ljava/lang/ref/WeakReference;

    invoke-direct {v0, p1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object v0, p0, Lcom/huawei/ui/device/activity/update/UpdateVersionActivity$c;->a:Ljava/lang/ref/WeakReference;

    .line 660
    return-void
.end method


# virtual methods
.method public onResponse(ILjava/lang/Object;)V
    .locals 7

    .line 664
    iget-object v0, p0, Lcom/huawei/ui/device/activity/update/UpdateVersionActivity$c;->a:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Lcom/huawei/ui/device/activity/update/UpdateVersionActivity;

    .line 665
    const/4 v0, 0x0

    if-ne v0, v4, :cond_0

    .line 666
    const-string v0, "UpdateVersionActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "fragment is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 667
    return-void

    .line 670
    :cond_0
    move-object v0, p2

    check-cast v0, [B

    check-cast v0, [B

    invoke-static {v0}, Lo/czx;->e([B)Ljava/lang/String;

    move-result-object v5

    .line 671
    const-string v0, "UpdateVersionActivity"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getSwitch berfore onResponse objData = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object v5, v1, v2

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 672
    invoke-virtual {v5}, Ljava/lang/String;->length()I

    move-result v0

    add-int/lit8 v0, v0, -0x2

    invoke-virtual {v5}, Ljava/lang/String;->length()I

    move-result v1

    invoke-virtual {v5, v0, v1}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v6

    .line 673
    const-string v0, "UpdateVersionActivity"

    const/4 v1, 0x4

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "onResponse errorcode = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    const-string v2, ", and value ="

    const/4 v3, 0x2

    aput-object v2, v1, v3

    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x3

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 675
    const/4 v0, 0x1

    if-ne v0, v6, :cond_1

    .line 676
    invoke-static {v4}, Lcom/huawei/ui/device/activity/update/UpdateVersionActivity;->c(Lcom/huawei/ui/device/activity/update/UpdateVersionActivity;)V

    goto :goto_0

    .line 678
    :cond_1
    invoke-static {v4}, Lcom/huawei/ui/device/activity/update/UpdateVersionActivity;->e(Lcom/huawei/ui/device/activity/update/UpdateVersionActivity;)V

    .line 680
    :goto_0
    return-void
.end method
