.class Lcom/huawei/health/sns/ui/group/HealthEventRankFragment$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/huawei/hwbasemgr/IBaseResponseCallback;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/health/sns/ui/group/HealthEventRankFragment;->b()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:Lcom/huawei/health/sns/ui/group/HealthEventRankFragment;


# direct methods
.method constructor <init>(Lcom/huawei/health/sns/ui/group/HealthEventRankFragment;)V
    .locals 0

    .line 315
    iput-object p1, p0, Lcom/huawei/health/sns/ui/group/HealthEventRankFragment$1;->b:Lcom/huawei/health/sns/ui/group/HealthEventRankFragment;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onResponse(ILjava/lang/Object;)V
    .locals 3

    .line 318
    const/4 v0, 0x0

    if-ne v0, p1, :cond_0

    .line 319
    move-object v1, p2

    check-cast v1, Ljava/util/List;

    .line 320
    new-instance v2, Landroid/os/Message;

    invoke-direct {v2}, Landroid/os/Message;-><init>()V

    .line 321
    const/16 v0, 0x59

    iput v0, v2, Landroid/os/Message;->what:I

    .line 322
    iput-object v1, v2, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 323
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthEventRankFragment$1;->b:Lcom/huawei/health/sns/ui/group/HealthEventRankFragment;

    invoke-static {v0}, Lcom/huawei/health/sns/ui/group/HealthEventRankFragment;->k(Lcom/huawei/health/sns/ui/group/HealthEventRankFragment;)Landroid/os/Handler;

    move-result-object v0

    invoke-virtual {v0, v2}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    .line 325
    :cond_0
    return-void
.end method
