.class Lcom/huawei/health/sns/ui/complain/ComplainDeletePicActivity$3;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/health/sns/ui/complain/ComplainDeletePicActivity;->f()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/huawei/health/sns/ui/complain/ComplainDeletePicActivity;


# direct methods
.method constructor <init>(Lcom/huawei/health/sns/ui/complain/ComplainDeletePicActivity;)V
    .locals 0

    .line 177
    iput-object p1, p0, Lcom/huawei/health/sns/ui/complain/ComplainDeletePicActivity$3;->a:Lcom/huawei/health/sns/ui/complain/ComplainDeletePicActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    .line 183
    iget-object v0, p0, Lcom/huawei/health/sns/ui/complain/ComplainDeletePicActivity$3;->a:Lcom/huawei/health/sns/ui/complain/ComplainDeletePicActivity;

    invoke-static {v0}, Lcom/huawei/health/sns/ui/complain/ComplainDeletePicActivity;->b(Lcom/huawei/health/sns/ui/complain/ComplainDeletePicActivity;)Landroid/view/View;

    move-result-object v0

    invoke-virtual {v0}, Landroid/view/View;->getWidth()I

    move-result v0

    iget-object v1, p0, Lcom/huawei/health/sns/ui/complain/ComplainDeletePicActivity$3;->a:Lcom/huawei/health/sns/ui/complain/ComplainDeletePicActivity;

    invoke-static {v1}, Lo/boi;->c(Landroid/app/Activity;)I

    move-result v1

    if-eq v0, v1, :cond_0

    .line 185
    iget-object v0, p0, Lcom/huawei/health/sns/ui/complain/ComplainDeletePicActivity$3;->a:Lcom/huawei/health/sns/ui/complain/ComplainDeletePicActivity;

    invoke-static {v0}, Lcom/huawei/health/sns/ui/complain/ComplainDeletePicActivity;->e(Lcom/huawei/health/sns/ui/complain/ComplainDeletePicActivity;)Landroid/view/View;

    move-result-object v0

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 187
    :cond_0
    return-void
.end method
