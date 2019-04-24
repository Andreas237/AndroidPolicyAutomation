.class Lcom/huawei/health/sns/ui/selector/TransmitActivity$5;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/content/DialogInterface$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/health/sns/ui/selector/TransmitActivity;->g()Landroid/app/AlertDialog;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic c:Lcom/huawei/health/sns/ui/selector/TransmitActivity;


# direct methods
.method constructor <init>(Lcom/huawei/health/sns/ui/selector/TransmitActivity;)V
    .locals 0

    .line 279
    iput-object p1, p0, Lcom/huawei/health/sns/ui/selector/TransmitActivity$5;->c:Lcom/huawei/health/sns/ui/selector/TransmitActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/content/DialogInterface;I)V
    .locals 2

    .line 285
    iget-object v0, p0, Lcom/huawei/health/sns/ui/selector/TransmitActivity$5;->c:Lcom/huawei/health/sns/ui/selector/TransmitActivity;

    iget-object v0, v0, Lcom/huawei/health/sns/ui/selector/TransmitActivity;->f:Lcom/huawei/health/sns/ui/selector/TransmitListFragment;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/huawei/health/sns/ui/selector/TransmitListFragment;->b(I)V

    .line 286
    iget-object v0, p0, Lcom/huawei/health/sns/ui/selector/TransmitActivity$5;->c:Lcom/huawei/health/sns/ui/selector/TransmitActivity;

    invoke-static {v0}, Lcom/huawei/health/sns/ui/selector/TransmitActivity;->a(Lcom/huawei/health/sns/ui/selector/TransmitActivity;)V

    .line 288
    iget-object v0, p0, Lcom/huawei/health/sns/ui/selector/TransmitActivity$5;->c:Lcom/huawei/health/sns/ui/selector/TransmitActivity;

    invoke-virtual {v0}, Lcom/huawei/health/sns/ui/selector/TransmitActivity;->finish()V

    .line 289
    return-void
.end method
