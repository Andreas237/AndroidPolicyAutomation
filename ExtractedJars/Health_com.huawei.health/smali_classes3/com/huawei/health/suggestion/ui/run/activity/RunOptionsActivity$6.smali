.class Lcom/huawei/health/suggestion/ui/run/activity/RunOptionsActivity$6;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/bxe$b;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/health/suggestion/ui/run/activity/RunOptionsActivity;->p()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/huawei/health/suggestion/ui/run/activity/RunOptionsActivity;


# direct methods
.method constructor <init>(Lcom/huawei/health/suggestion/ui/run/activity/RunOptionsActivity;)V
    .locals 0

    .line 442
    iput-object p1, p0, Lcom/huawei/health/suggestion/ui/run/activity/RunOptionsActivity$6;->a:Lcom/huawei/health/suggestion/ui/run/activity/RunOptionsActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public d(I)V
    .locals 2

    .line 445
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/run/activity/RunOptionsActivity$6;->a:Lcom/huawei/health/suggestion/ui/run/activity/RunOptionsActivity;

    invoke-static {v0}, Lcom/huawei/health/suggestion/ui/run/activity/RunOptionsActivity;->b(Lcom/huawei/health/suggestion/ui/run/activity/RunOptionsActivity;)Lo/efy;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/health/suggestion/ui/run/activity/RunOptionsActivity$6;->a:Lcom/huawei/health/suggestion/ui/run/activity/RunOptionsActivity;

    invoke-static {v1, p1}, Lcom/huawei/health/suggestion/ui/run/activity/RunOptionsActivity;->e(Lcom/huawei/health/suggestion/ui/run/activity/RunOptionsActivity;I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/efy;->setText(Ljava/lang/CharSequence;)V

    .line 446
    return-void
.end method
