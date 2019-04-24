.class Lcom/huawei/health/device/ui/BaseFragment$5;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/health/device/ui/BaseFragment;->showCustomAlertDialog(I)Z
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:Lcom/huawei/health/device/ui/BaseFragment;


# direct methods
.method constructor <init>(Lcom/huawei/health/device/ui/BaseFragment;)V
    .locals 0

    .line 274
    iput-object p1, p0, Lcom/huawei/health/device/ui/BaseFragment$5;->b:Lcom/huawei/health/device/ui/BaseFragment;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 1

    .line 277
    iget-object v0, p0, Lcom/huawei/health/device/ui/BaseFragment$5;->b:Lcom/huawei/health/device/ui/BaseFragment;

    invoke-virtual {v0}, Lcom/huawei/health/device/ui/BaseFragment;->release()V

    .line 278
    return-void
.end method
