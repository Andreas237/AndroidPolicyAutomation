.class Lcom/huawei/health/device/ui/BaseFragment$4;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/health/device/ui/BaseFragment;->onCreateView(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/huawei/health/device/ui/BaseFragment;


# direct methods
.method constructor <init>(Lcom/huawei/health/device/ui/BaseFragment;)V
    .locals 0

    .line 102
    iput-object p1, p0, Lcom/huawei/health/device/ui/BaseFragment$4;->a:Lcom/huawei/health/device/ui/BaseFragment;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 1

    .line 105
    iget-object v0, p0, Lcom/huawei/health/device/ui/BaseFragment$4;->a:Lcom/huawei/health/device/ui/BaseFragment;

    iget-object v0, v0, Lcom/huawei/health/device/ui/BaseFragment;->mainActivity:Landroid/app/Activity;

    invoke-virtual {v0}, Landroid/app/Activity;->onBackPressed()V

    .line 106
    return-void
.end method
