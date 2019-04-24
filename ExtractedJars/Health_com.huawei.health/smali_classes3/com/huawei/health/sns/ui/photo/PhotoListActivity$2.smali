.class Lcom/huawei/health/sns/ui/photo/PhotoListActivity$2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/health/sns/ui/photo/PhotoListActivity;->f()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic e:Lcom/huawei/health/sns/ui/photo/PhotoListActivity;


# direct methods
.method constructor <init>(Lcom/huawei/health/sns/ui/photo/PhotoListActivity;)V
    .locals 0

    .line 257
    iput-object p1, p0, Lcom/huawei/health/sns/ui/photo/PhotoListActivity$2;->e:Lcom/huawei/health/sns/ui/photo/PhotoListActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    .line 263
    iget-object v0, p0, Lcom/huawei/health/sns/ui/photo/PhotoListActivity$2;->e:Lcom/huawei/health/sns/ui/photo/PhotoListActivity;

    invoke-static {v0}, Lcom/huawei/health/sns/ui/photo/PhotoListActivity;->d(Lcom/huawei/health/sns/ui/photo/PhotoListActivity;)Landroid/view/View;

    move-result-object v0

    invoke-virtual {v0}, Landroid/view/View;->getWidth()I

    move-result v0

    iget-object v1, p0, Lcom/huawei/health/sns/ui/photo/PhotoListActivity$2;->e:Lcom/huawei/health/sns/ui/photo/PhotoListActivity;

    invoke-static {v1}, Lo/boi;->c(Landroid/app/Activity;)I

    move-result v1

    if-eq v0, v1, :cond_0

    .line 265
    iget-object v0, p0, Lcom/huawei/health/sns/ui/photo/PhotoListActivity$2;->e:Lcom/huawei/health/sns/ui/photo/PhotoListActivity;

    invoke-static {v0}, Lcom/huawei/health/sns/ui/photo/PhotoListActivity;->b(Lcom/huawei/health/sns/ui/photo/PhotoListActivity;)Landroid/view/View;

    move-result-object v0

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 267
    :cond_0
    return-void
.end method
