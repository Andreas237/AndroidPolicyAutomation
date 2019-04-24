.class Lcom/huawei/wallet/ui/idencard/camera/base/BaseCaptureActivity$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/content/DialogInterface$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/wallet/ui/idencard/camera/base/BaseCaptureActivity;->d(Ljava/lang/String;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:Lcom/huawei/wallet/ui/idencard/camera/base/BaseCaptureActivity;


# direct methods
.method constructor <init>(Lcom/huawei/wallet/ui/idencard/camera/base/BaseCaptureActivity;)V
    .locals 0

    .line 524
    iput-object p1, p0, Lcom/huawei/wallet/ui/idencard/camera/base/BaseCaptureActivity$1;->b:Lcom/huawei/wallet/ui/idencard/camera/base/BaseCaptureActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/content/DialogInterface;I)V
    .locals 1

    .line 528
    iget-object v0, p0, Lcom/huawei/wallet/ui/idencard/camera/base/BaseCaptureActivity$1;->b:Lcom/huawei/wallet/ui/idencard/camera/base/BaseCaptureActivity;

    invoke-virtual {v0}, Lcom/huawei/wallet/ui/idencard/camera/base/BaseCaptureActivity;->finish()V

    .line 529
    invoke-interface {p1}, Landroid/content/DialogInterface;->dismiss()V

    .line 530
    return-void
.end method
