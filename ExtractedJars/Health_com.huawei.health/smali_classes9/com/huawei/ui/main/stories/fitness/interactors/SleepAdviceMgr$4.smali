.class Lcom/huawei/ui/main/stories/fitness/interactors/SleepAdviceMgr$4;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/clz;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/ui/main/stories/fitness/interactors/SleepAdviceMgr;->a()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:Lcom/huawei/ui/main/stories/fitness/interactors/SleepAdviceMgr;


# direct methods
.method constructor <init>(Lcom/huawei/ui/main/stories/fitness/interactors/SleepAdviceMgr;)V
    .locals 0

    .line 456
    iput-object p1, p0, Lcom/huawei/ui/main/stories/fitness/interactors/SleepAdviceMgr$4;->b:Lcom/huawei/ui/main/stories/fitness/interactors/SleepAdviceMgr;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onFailure(ILjava/lang/Object;)V
    .locals 4

    .line 474
    const-string v0, "SleepAdviceMgr"

    const/4 v1, 0x4

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "get user info errCode = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    const-string v2, ",errMsg = "

    const/4 v3, 0x2

    aput-object v2, v1, v3

    const/4 v2, 0x3

    aput-object p2, v1, v2

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 475
    return-void
.end method

.method public onSuccess(ILjava/lang/Object;)V
    .locals 4

    .line 460
    move-object v2, p2

    check-cast v2, Ljava/util/List;

    .line 461
    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v0

    if-lez v0, :cond_1

    .line 462
    const/4 v0, 0x0

    invoke-interface {v2, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v3, v0

    check-cast v3, Lcom/huawei/hihealth/HiUserInfo;

    .line 463
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/interactors/SleepAdviceMgr$4;->b:Lcom/huawei/ui/main/stories/fitness/interactors/SleepAdviceMgr;

    invoke-virtual {v3}, Lcom/huawei/hihealth/HiUserInfo;->getGender()I

    move-result v1

    invoke-static {v0, v1}, Lcom/huawei/ui/main/stories/fitness/interactors/SleepAdviceMgr;->b(Lcom/huawei/ui/main/stories/fitness/interactors/SleepAdviceMgr;I)I

    .line 464
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/interactors/SleepAdviceMgr$4;->b:Lcom/huawei/ui/main/stories/fitness/interactors/SleepAdviceMgr;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/fitness/interactors/SleepAdviceMgr;->a(Lcom/huawei/ui/main/stories/fitness/interactors/SleepAdviceMgr;)I

    move-result v0

    const/4 v1, 0x1

    if-ne v1, v0, :cond_0

    .line 465
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/interactors/SleepAdviceMgr$4;->b:Lcom/huawei/ui/main/stories/fitness/interactors/SleepAdviceMgr;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/huawei/ui/main/stories/fitness/interactors/SleepAdviceMgr;->b(Lcom/huawei/ui/main/stories/fitness/interactors/SleepAdviceMgr;I)I

    goto :goto_0

    .line 467
    :cond_0
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/interactors/SleepAdviceMgr$4;->b:Lcom/huawei/ui/main/stories/fitness/interactors/SleepAdviceMgr;

    const/4 v1, 0x1

    invoke-static {v0, v1}, Lcom/huawei/ui/main/stories/fitness/interactors/SleepAdviceMgr;->b(Lcom/huawei/ui/main/stories/fitness/interactors/SleepAdviceMgr;I)I

    .line 470
    :cond_1
    :goto_0
    return-void
.end method
