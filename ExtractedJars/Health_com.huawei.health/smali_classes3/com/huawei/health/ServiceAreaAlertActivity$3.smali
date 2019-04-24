.class Lcom/huawei/health/ServiceAreaAlertActivity$3;
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

    .line 98
    iput-object p1, p0, Lcom/huawei/health/ServiceAreaAlertActivity$3;->c:Lcom/huawei/health/ServiceAreaAlertActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 3

    .line 101
    new-instance v2, Landroid/content/Intent;

    iget-object v0, p0, Lcom/huawei/health/ServiceAreaAlertActivity$3;->c:Lcom/huawei/health/ServiceAreaAlertActivity;

    invoke-static {v0}, Lcom/huawei/health/ServiceAreaAlertActivity;->a(Lcom/huawei/health/ServiceAreaAlertActivity;)Landroid/content/Context;

    move-result-object v0

    const-class v1, Lcom/huawei/health/SelectCountryListActivity;

    invoke-direct {v2, v0, v1}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 102
    iget-object v0, p0, Lcom/huawei/health/ServiceAreaAlertActivity$3;->c:Lcom/huawei/health/ServiceAreaAlertActivity;

    const/16 v1, 0x1775

    invoke-virtual {v0, v2, v1}, Lcom/huawei/health/ServiceAreaAlertActivity;->startActivityForResult(Landroid/content/Intent;I)V

    .line 103
    return-void
.end method
