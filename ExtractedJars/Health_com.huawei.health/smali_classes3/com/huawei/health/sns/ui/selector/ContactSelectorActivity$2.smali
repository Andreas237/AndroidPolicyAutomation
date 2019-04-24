.class Lcom/huawei/health/sns/ui/selector/ContactSelectorActivity$2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/widget/AdapterView$OnItemClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/health/sns/ui/selector/ContactSelectorActivity;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic d:Lcom/huawei/health/sns/ui/selector/ContactSelectorActivity;


# direct methods
.method constructor <init>(Lcom/huawei/health/sns/ui/selector/ContactSelectorActivity;)V
    .locals 0

    .line 379
    iput-object p1, p0, Lcom/huawei/health/sns/ui/selector/ContactSelectorActivity$2;->d:Lcom/huawei/health/sns/ui/selector/ContactSelectorActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onItemClick(Landroid/widget/AdapterView;Landroid/view/View;IJ)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Landroid/widget/AdapterView<*>;Landroid/view/View;IJ)V"
        }
    .end annotation

    .line 383
    iget-object v0, p0, Lcom/huawei/health/sns/ui/selector/ContactSelectorActivity$2;->d:Lcom/huawei/health/sns/ui/selector/ContactSelectorActivity;

    iget-object v1, p0, Lcom/huawei/health/sns/ui/selector/ContactSelectorActivity$2;->d:Lcom/huawei/health/sns/ui/selector/ContactSelectorActivity;

    invoke-static {v1}, Lcom/huawei/health/sns/ui/selector/ContactSelectorActivity;->e(Lcom/huawei/health/sns/ui/selector/ContactSelectorActivity;)Landroid/os/Handler;

    move-result-object v1

    invoke-virtual {v0, v1, p2, p3}, Lcom/huawei/health/sns/ui/selector/ContactSelectorActivity;->c(Landroid/os/Handler;Landroid/view/View;I)V

    .line 384
    return-void
.end method
