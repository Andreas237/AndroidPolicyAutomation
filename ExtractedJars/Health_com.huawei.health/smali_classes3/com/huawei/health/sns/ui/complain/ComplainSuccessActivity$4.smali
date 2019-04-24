.class Lcom/huawei/health/sns/ui/complain/ComplainSuccessActivity$4;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/health/sns/ui/complain/ComplainSuccessActivity;->onCreate(Landroid/os/Bundle;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic c:Lcom/huawei/health/sns/ui/complain/ComplainSuccessActivity;


# direct methods
.method constructor <init>(Lcom/huawei/health/sns/ui/complain/ComplainSuccessActivity;)V
    .locals 0

    .line 47
    iput-object p1, p0, Lcom/huawei/health/sns/ui/complain/ComplainSuccessActivity$4;->c:Lcom/huawei/health/sns/ui/complain/ComplainSuccessActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 1

    .line 51
    iget-object v0, p0, Lcom/huawei/health/sns/ui/complain/ComplainSuccessActivity$4;->c:Lcom/huawei/health/sns/ui/complain/ComplainSuccessActivity;

    invoke-virtual {v0}, Lcom/huawei/health/sns/ui/complain/ComplainSuccessActivity;->finish()V

    .line 52
    return-void
.end method
