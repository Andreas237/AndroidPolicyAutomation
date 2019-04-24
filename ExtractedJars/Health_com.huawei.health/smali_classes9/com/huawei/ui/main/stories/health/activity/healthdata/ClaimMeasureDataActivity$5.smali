.class Lcom/huawei/ui/main/stories/health/activity/healthdata/ClaimMeasureDataActivity$5;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/ui/main/stories/health/activity/healthdata/ClaimMeasureDataActivity;->d(Lo/acu;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:Lcom/huawei/ui/main/stories/health/activity/healthdata/ClaimMeasureDataActivity;


# direct methods
.method constructor <init>(Lcom/huawei/ui/main/stories/health/activity/healthdata/ClaimMeasureDataActivity;)V
    .locals 0

    .line 423
    iput-object p1, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/ClaimMeasureDataActivity$5;->b:Lcom/huawei/ui/main/stories/health/activity/healthdata/ClaimMeasureDataActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 5

    .line 426
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/ClaimMeasureDataActivity$5;->b:Lcom/huawei/ui/main/stories/health/activity/healthdata/ClaimMeasureDataActivity;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/health/activity/healthdata/ClaimMeasureDataActivity;->l(Lcom/huawei/ui/main/stories/health/activity/healthdata/ClaimMeasureDataActivity;)Lo/egv;

    move-result-object v0

    invoke-virtual {v0}, Lo/egv;->dismiss()V

    .line 427
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/ClaimMeasureDataActivity$5;->b:Lcom/huawei/ui/main/stories/health/activity/healthdata/ClaimMeasureDataActivity;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/health/activity/healthdata/ClaimMeasureDataActivity;->p(Lcom/huawei/ui/main/stories/health/activity/healthdata/ClaimMeasureDataActivity;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 428
    new-instance v3, Landroid/os/Message;

    invoke-direct {v3}, Landroid/os/Message;-><init>()V

    .line 429
    const/4 v0, 0x5

    iput v0, v3, Landroid/os/Message;->what:I

    .line 430
    const/4 v0, 0x0

    iput v0, v3, Landroid/os/Message;->arg1:I

    .line 431
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/ClaimMeasureDataActivity$5;->b:Lcom/huawei/ui/main/stories/health/activity/healthdata/ClaimMeasureDataActivity;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/health/activity/healthdata/ClaimMeasureDataActivity;->k(Lcom/huawei/ui/main/stories/health/activity/healthdata/ClaimMeasureDataActivity;)Lcom/huawei/ui/main/stories/health/activity/healthdata/ClaimMeasureDataActivity$b;

    move-result-object v0

    invoke-virtual {v0, v3}, Lcom/huawei/ui/main/stories/health/activity/healthdata/ClaimMeasureDataActivity$b;->sendMessage(Landroid/os/Message;)Z

    .line 432
    new-instance v4, Landroid/os/Message;

    invoke-direct {v4}, Landroid/os/Message;-><init>()V

    .line 433
    const/4 v0, 0x4

    iput v0, v4, Landroid/os/Message;->what:I

    .line 434
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/ClaimMeasureDataActivity$5;->b:Lcom/huawei/ui/main/stories/health/activity/healthdata/ClaimMeasureDataActivity;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/health/activity/healthdata/ClaimMeasureDataActivity;->o(Lcom/huawei/ui/main/stories/health/activity/healthdata/ClaimMeasureDataActivity;)Ljava/util/List;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/ClaimMeasureDataActivity$5;->b:Lcom/huawei/ui/main/stories/health/activity/healthdata/ClaimMeasureDataActivity;

    invoke-static {v1}, Lcom/huawei/ui/main/stories/health/activity/healthdata/ClaimMeasureDataActivity;->g(Lcom/huawei/ui/main/stories/health/activity/healthdata/ClaimMeasureDataActivity;)Lo/fcr;

    move-result-object v1

    invoke-virtual {v1}, Lo/fcr;->c()I

    move-result v1

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    iput-object v0, v4, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 435
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/ClaimMeasureDataActivity$5;->b:Lcom/huawei/ui/main/stories/health/activity/healthdata/ClaimMeasureDataActivity;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/health/activity/healthdata/ClaimMeasureDataActivity;->k(Lcom/huawei/ui/main/stories/health/activity/healthdata/ClaimMeasureDataActivity;)Lcom/huawei/ui/main/stories/health/activity/healthdata/ClaimMeasureDataActivity$b;

    move-result-object v0

    const-wide/16 v1, 0xc8

    invoke-virtual {v0, v4, v1, v2}, Lcom/huawei/ui/main/stories/health/activity/healthdata/ClaimMeasureDataActivity$b;->sendMessageDelayed(Landroid/os/Message;J)Z

    .line 437
    :cond_0
    return-void
.end method
