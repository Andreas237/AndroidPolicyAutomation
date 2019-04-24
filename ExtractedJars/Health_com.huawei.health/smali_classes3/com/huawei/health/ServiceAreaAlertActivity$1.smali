.class Lcom/huawei/health/ServiceAreaAlertActivity$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/health/ServiceAreaAlertActivity;->d()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic c:Lcom/huawei/health/ServiceAreaAlertActivity;


# direct methods
.method constructor <init>(Lcom/huawei/health/ServiceAreaAlertActivity;)V
    .locals 0

    .line 116
    iput-object p1, p0, Lcom/huawei/health/ServiceAreaAlertActivity$1;->c:Lcom/huawei/health/ServiceAreaAlertActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 3

    .line 119
    new-instance v2, Landroid/content/Intent;

    invoke-direct {v2}, Landroid/content/Intent;-><init>()V

    .line 120
    iget-object v0, p0, Lcom/huawei/health/ServiceAreaAlertActivity$1;->c:Lcom/huawei/health/ServiceAreaAlertActivity;

    const/4 v1, -0x1

    invoke-virtual {v0, v1, v2}, Lcom/huawei/health/ServiceAreaAlertActivity;->setResult(ILandroid/content/Intent;)V

    .line 121
    iget-object v0, p0, Lcom/huawei/health/ServiceAreaAlertActivity$1;->c:Lcom/huawei/health/ServiceAreaAlertActivity;

    invoke-virtual {v0}, Lcom/huawei/health/ServiceAreaAlertActivity;->finish()V

    .line 122
    return-void
.end method
