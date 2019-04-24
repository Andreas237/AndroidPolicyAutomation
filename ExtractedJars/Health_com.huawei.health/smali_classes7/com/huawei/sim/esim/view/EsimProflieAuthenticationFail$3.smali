.class Lcom/huawei/sim/esim/view/EsimProflieAuthenticationFail$3;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/sim/esim/view/EsimProflieAuthenticationFail;->d()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic c:Lcom/huawei/sim/esim/view/EsimProflieAuthenticationFail;


# direct methods
.method constructor <init>(Lcom/huawei/sim/esim/view/EsimProflieAuthenticationFail;)V
    .locals 0

    .line 49
    iput-object p1, p0, Lcom/huawei/sim/esim/view/EsimProflieAuthenticationFail$3;->c:Lcom/huawei/sim/esim/view/EsimProflieAuthenticationFail;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 3

    .line 52
    new-instance v2, Landroid/content/Intent;

    iget-object v0, p0, Lcom/huawei/sim/esim/view/EsimProflieAuthenticationFail$3;->c:Lcom/huawei/sim/esim/view/EsimProflieAuthenticationFail;

    const-class v1, Lcom/huawei/sim/esim/qrcode/QrCodeActivity;

    invoke-direct {v2, v0, v1}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 53
    iget-object v0, p0, Lcom/huawei/sim/esim/view/EsimProflieAuthenticationFail$3;->c:Lcom/huawei/sim/esim/view/EsimProflieAuthenticationFail;

    invoke-virtual {v0, v2}, Lcom/huawei/sim/esim/view/EsimProflieAuthenticationFail;->startActivity(Landroid/content/Intent;)V

    .line 54
    iget-object v0, p0, Lcom/huawei/sim/esim/view/EsimProflieAuthenticationFail$3;->c:Lcom/huawei/sim/esim/view/EsimProflieAuthenticationFail;

    invoke-virtual {v0}, Lcom/huawei/sim/esim/view/EsimProflieAuthenticationFail;->finish()V

    .line 55
    return-void
.end method
