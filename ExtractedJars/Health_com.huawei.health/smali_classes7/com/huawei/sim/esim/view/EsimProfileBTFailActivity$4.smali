.class Lcom/huawei/sim/esim/view/EsimProfileBTFailActivity$4;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/sim/esim/view/EsimProfileBTFailActivity;->onCreate(Landroid/os/Bundle;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:Lcom/huawei/sim/esim/view/EsimProfileBTFailActivity;


# direct methods
.method constructor <init>(Lcom/huawei/sim/esim/view/EsimProfileBTFailActivity;)V
    .locals 0

    .line 67
    iput-object p1, p0, Lcom/huawei/sim/esim/view/EsimProfileBTFailActivity$4;->b:Lcom/huawei/sim/esim/view/EsimProfileBTFailActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 2

    .line 70
    new-instance v0, Landroid/os/Handler;

    invoke-direct {v0}, Landroid/os/Handler;-><init>()V

    new-instance v1, Lcom/huawei/sim/esim/view/EsimProfileBTFailActivity$4$1;

    invoke-direct {v1, p0}, Lcom/huawei/sim/esim/view/EsimProfileBTFailActivity$4$1;-><init>(Lcom/huawei/sim/esim/view/EsimProfileBTFailActivity$4;)V

    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 77
    return-void
.end method
