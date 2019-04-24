.class Lcom/huawei/wallet/ui/carddisplay/CardDisplayManager$1;
.super Landroid/os/Handler;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/wallet/ui/carddisplay/CardDisplayManager;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic c:Lcom/huawei/wallet/ui/carddisplay/CardDisplayManager;


# direct methods
.method constructor <init>(Lcom/huawei/wallet/ui/carddisplay/CardDisplayManager;)V
    .locals 0

    .line 138
    iput-object p1, p0, Lcom/huawei/wallet/ui/carddisplay/CardDisplayManager$1;->c:Lcom/huawei/wallet/ui/carddisplay/CardDisplayManager;

    invoke-direct {p0}, Landroid/os/Handler;-><init>()V

    return-void
.end method


# virtual methods
.method public handleMessage(Landroid/os/Message;)V
    .locals 1

    .line 142
    invoke-super {p0, p1}, Landroid/os/Handler;->handleMessage(Landroid/os/Message;)V

    .line 143
    iget-object v0, p0, Lcom/huawei/wallet/ui/carddisplay/CardDisplayManager$1;->c:Lcom/huawei/wallet/ui/carddisplay/CardDisplayManager;

    invoke-static {v0}, Lcom/huawei/wallet/ui/carddisplay/CardDisplayManager;->b(Lcom/huawei/wallet/ui/carddisplay/CardDisplayManager;)V

    .line 144
    return-void
.end method
