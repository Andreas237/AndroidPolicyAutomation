.class Lcom/huawei/sim/esim/view/EsimPPRActivity$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/sim/esim/view/EsimPPRActivity;->onCreate(Landroid/os/Bundle;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic e:Lcom/huawei/sim/esim/view/EsimPPRActivity;


# direct methods
.method constructor <init>(Lcom/huawei/sim/esim/view/EsimPPRActivity;)V
    .locals 0

    .line 88
    iput-object p1, p0, Lcom/huawei/sim/esim/view/EsimPPRActivity$1;->e:Lcom/huawei/sim/esim/view/EsimPPRActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 1

    .line 91
    iget-object v0, p0, Lcom/huawei/sim/esim/view/EsimPPRActivity$1;->e:Lcom/huawei/sim/esim/view/EsimPPRActivity;

    invoke-virtual {v0}, Lcom/huawei/sim/esim/view/EsimPPRActivity;->finish()V

    .line 92
    return-void
.end method
