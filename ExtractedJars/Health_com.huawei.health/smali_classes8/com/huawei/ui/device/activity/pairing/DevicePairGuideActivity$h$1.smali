.class Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity$h$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity$h;->onResponse(ILjava/lang/Object;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:Ljava/lang/Object;

.field final synthetic c:Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity$h;

.field final synthetic d:Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity;

.field final synthetic e:I


# direct methods
.method constructor <init>(Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity$h;ILjava/lang/Object;Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity;)V
    .locals 0

    .line 588
    iput-object p1, p0, Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity$h$1;->c:Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity$h;

    iput p2, p0, Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity$h$1;->e:I

    iput-object p3, p0, Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity$h$1;->b:Ljava/lang/Object;

    iput-object p4, p0, Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity$h$1;->d:Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 5

    .line 591
    iget v0, p0, Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity$h$1;->e:I

    const/4 v1, 0x0

    if-ne v1, v0, :cond_1

    .line 592
    iget-object v0, p0, Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity$h$1;->b:Ljava/lang/Object;

    move-object v4, v0

    check-cast v4, Lo/enw$b;

    .line 593
    const-string v0, "DevicePairGuideActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "state:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 594
    sget-object v0, Lo/enw$b;->a:Lo/enw$b;

    if-ne v0, v4, :cond_0

    .line 595
    iget-object v0, p0, Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity$h$1;->d:Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity;->c(Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity;Z)V

    goto :goto_0

    .line 597
    :cond_0
    const-string v0, "DevicePairGuideActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "isHuaweiWearBinded Enter else"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 598
    iget-object v0, p0, Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity$h$1;->d:Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity;

    invoke-static {v0}, Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity;->m(Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity;)V

    .line 600
    :goto_0
    goto :goto_1

    .line 601
    :cond_1
    iget-object v0, p0, Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity$h$1;->d:Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity;->c(Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity;Z)V

    .line 603
    :goto_1
    return-void
.end method
