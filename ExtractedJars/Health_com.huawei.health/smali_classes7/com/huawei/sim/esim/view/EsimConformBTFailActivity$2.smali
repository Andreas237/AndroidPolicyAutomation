.class Lcom/huawei/sim/esim/view/EsimConformBTFailActivity$2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/sim/esim/view/EsimConformBTFailActivity;->onCreate(Landroid/os/Bundle;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/huawei/sim/esim/view/EsimConformBTFailActivity;


# direct methods
.method constructor <init>(Lcom/huawei/sim/esim/view/EsimConformBTFailActivity;)V
    .locals 0

    .line 80
    iput-object p1, p0, Lcom/huawei/sim/esim/view/EsimConformBTFailActivity$2;->a:Lcom/huawei/sim/esim/view/EsimConformBTFailActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 2

    .line 83
    new-instance v0, Landroid/os/Handler;

    invoke-direct {v0}, Landroid/os/Handler;-><init>()V

    new-instance v1, Lcom/huawei/sim/esim/view/EsimConformBTFailActivity$2$3;

    invoke-direct {v1, p0}, Lcom/huawei/sim/esim/view/EsimConformBTFailActivity$2$3;-><init>(Lcom/huawei/sim/esim/view/EsimConformBTFailActivity$2;)V

    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 90
    return-void
.end method
