.class Lcom/huawei/health/sns/ui/complain/ComplainUrlActivity$4;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/health/sns/ui/complain/ComplainUrlActivity;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic d:Lcom/huawei/health/sns/ui/complain/ComplainUrlActivity;


# direct methods
.method constructor <init>(Lcom/huawei/health/sns/ui/complain/ComplainUrlActivity;)V
    .locals 0

    .line 198
    iput-object p1, p0, Lcom/huawei/health/sns/ui/complain/ComplainUrlActivity$4;->d:Lcom/huawei/health/sns/ui/complain/ComplainUrlActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 6

    .line 204
    new-instance v5, Lo/ars;

    invoke-direct {v5}, Lo/ars;-><init>()V

    .line 205
    iget-object v0, p0, Lcom/huawei/health/sns/ui/complain/ComplainUrlActivity$4;->d:Lcom/huawei/health/sns/ui/complain/ComplainUrlActivity;

    invoke-static {v0}, Lcom/huawei/health/sns/ui/complain/ComplainUrlActivity;->c(Lcom/huawei/health/sns/ui/complain/ComplainUrlActivity;)I

    move-result v0

    iget-object v1, p0, Lcom/huawei/health/sns/ui/complain/ComplainUrlActivity$4;->d:Lcom/huawei/health/sns/ui/complain/ComplainUrlActivity;

    invoke-static {v1}, Lcom/huawei/health/sns/ui/complain/ComplainUrlActivity;->a(Lcom/huawei/health/sns/ui/complain/ComplainUrlActivity;)I

    move-result v1

    invoke-virtual {v5, v0, v1}, Lo/ars;->b(II)V

    .line 206
    iget-object v0, p0, Lcom/huawei/health/sns/ui/complain/ComplainUrlActivity$4;->d:Lcom/huawei/health/sns/ui/complain/ComplainUrlActivity;

    invoke-static {v0}, Lcom/huawei/health/sns/ui/complain/ComplainUrlActivity;->b(Lcom/huawei/health/sns/ui/complain/ComplainUrlActivity;)J

    move-result-wide v0

    iget-object v2, p0, Lcom/huawei/health/sns/ui/complain/ComplainUrlActivity$4;->d:Lcom/huawei/health/sns/ui/complain/ComplainUrlActivity;

    invoke-static {v2}, Lcom/huawei/health/sns/ui/complain/ComplainUrlActivity;->e(Lcom/huawei/health/sns/ui/complain/ComplainUrlActivity;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v5, v0, v1, v2}, Lo/ars;->c(JLjava/lang/String;)V

    .line 207
    iget-object v0, p0, Lcom/huawei/health/sns/ui/complain/ComplainUrlActivity$4;->d:Lcom/huawei/health/sns/ui/complain/ComplainUrlActivity;

    invoke-static {v0}, Lcom/huawei/health/sns/ui/complain/ComplainUrlActivity;->d(Lcom/huawei/health/sns/ui/complain/ComplainUrlActivity;)Ljava/lang/String;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/health/sns/ui/complain/ComplainUrlActivity$4;->d:Lcom/huawei/health/sns/ui/complain/ComplainUrlActivity;

    invoke-static {v1}, Lcom/huawei/health/sns/ui/complain/ComplainUrlActivity;->g(Lcom/huawei/health/sns/ui/complain/ComplainUrlActivity;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v5, v0, v1}, Lo/ars;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 208
    new-instance v0, Lo/arz;

    iget-object v1, p0, Lcom/huawei/health/sns/ui/complain/ComplainUrlActivity$4;->d:Lcom/huawei/health/sns/ui/complain/ComplainUrlActivity;

    new-instance v2, Lo/bfv;

    iget-object v3, p0, Lcom/huawei/health/sns/ui/complain/ComplainUrlActivity$4;->d:Lcom/huawei/health/sns/ui/complain/ComplainUrlActivity;

    new-instance v4, Lcom/huawei/health/sns/ui/complain/ComplainUrlActivity$4$5;

    invoke-direct {v4, p0}, Lcom/huawei/health/sns/ui/complain/ComplainUrlActivity$4$5;-><init>(Lcom/huawei/health/sns/ui/complain/ComplainUrlActivity$4;)V

    invoke-direct {v2, v3, v4}, Lo/bfv;-><init>(Landroid/app/Activity;Lo/bft;)V

    invoke-direct {v0, v1, v2, v5}, Lo/arz;-><init>(Landroid/content/Context;Lo/bqu;Lo/ars;)V

    .line 218
    invoke-virtual {v0}, Lo/arz;->e()V

    .line 220
    return-void
.end method
