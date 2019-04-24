.class Lcom/huawei/health/sns/ui/complain/ComplainCategoryActivity$3;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/health/sns/ui/complain/ComplainCategoryActivity;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic e:Lcom/huawei/health/sns/ui/complain/ComplainCategoryActivity;


# direct methods
.method constructor <init>(Lcom/huawei/health/sns/ui/complain/ComplainCategoryActivity;)V
    .locals 0

    .line 484
    iput-object p1, p0, Lcom/huawei/health/sns/ui/complain/ComplainCategoryActivity$3;->e:Lcom/huawei/health/sns/ui/complain/ComplainCategoryActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 3

    .line 490
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    sget-object v1, Lo/ayw;->e:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "/complain_"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    new-instance v1, Lo/bax;

    invoke-direct {v1}, Lo/bax;-><init>()V

    .line 491
    invoke-virtual {v1}, Lo/bax;->a()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ".html"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    .line 493
    iget-object v0, p0, Lcom/huawei/health/sns/ui/complain/ComplainCategoryActivity$3;->e:Lcom/huawei/health/sns/ui/complain/ComplainCategoryActivity;

    invoke-static {v0, v2}, Lcom/huawei/health/sns/ui/browser/WebViewSimpleActivity;->b(Landroid/app/Activity;Ljava/lang/String;)V

    .line 494
    return-void
.end method
