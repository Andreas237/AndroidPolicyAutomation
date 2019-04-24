.class Lcom/huawei/health/sns/ui/selector/ContactSelectorActivity$4;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/health/sns/ui/selector/ContactSelectorActivity;->t()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:Lcom/huawei/health/sns/ui/selector/ContactSelectorActivity;


# direct methods
.method constructor <init>(Lcom/huawei/health/sns/ui/selector/ContactSelectorActivity;)V
    .locals 0

    .line 443
    iput-object p1, p0, Lcom/huawei/health/sns/ui/selector/ContactSelectorActivity$4;->b:Lcom/huawei/health/sns/ui/selector/ContactSelectorActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 3

    .line 448
    invoke-static {}, Lo/bcb;->b()Lo/bcb;

    move-result-object v0

    const-string v1, "agree_upload_phone_digest_new"

    const/4 v2, 0x1

    invoke-virtual {v0, v1, v2}, Lo/bcb;->e(Ljava/lang/String;Z)Z

    .line 451
    invoke-static {}, Lo/awj;->b()Lo/awj;

    move-result-object v0

    invoke-virtual {v0}, Lo/awj;->f()V

    .line 454
    iget-object v0, p0, Lcom/huawei/health/sns/ui/selector/ContactSelectorActivity$4;->b:Lcom/huawei/health/sns/ui/selector/ContactSelectorActivity;

    invoke-static {v0}, Lcom/huawei/health/sns/ui/selector/ContactSelectorActivity;->d(Lcom/huawei/health/sns/ui/selector/ContactSelectorActivity;)Landroid/view/View;

    move-result-object v0

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 456
    iget-object v0, p0, Lcom/huawei/health/sns/ui/selector/ContactSelectorActivity$4;->b:Lcom/huawei/health/sns/ui/selector/ContactSelectorActivity;

    invoke-static {v0}, Lcom/huawei/health/sns/ui/selector/ContactSelectorActivity;->c(Lcom/huawei/health/sns/ui/selector/ContactSelectorActivity;)V

    .line 457
    return-void
.end method
