.class Lcom/huawei/health/sns/ui/selector/TransmitActivity$3;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnFocusChangeListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/health/sns/ui/selector/TransmitActivity;->o()V
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

    .line 455
    iput-object p1, p0, Lcom/huawei/health/sns/ui/selector/TransmitActivity$3;->c:Lcom/huawei/health/sns/ui/selector/TransmitActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onFocusChange(Landroid/view/View;Z)V
    .locals 2

    .line 459
    if-eqz p2, :cond_0

    .line 461
    iget-object v0, p0, Lcom/huawei/health/sns/ui/selector/TransmitActivity$3;->c:Lcom/huawei/health/sns/ui/selector/TransmitActivity;

    invoke-virtual {p1}, Landroid/view/View;->findFocus()Landroid/view/View;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/huawei/health/sns/ui/selector/TransmitActivity;->d(Lcom/huawei/health/sns/ui/selector/TransmitActivity;Landroid/view/View;)V

    .line 463
    :cond_0
    return-void
.end method
