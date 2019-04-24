.class Lcom/huawei/openalliance/ad/views/FullScreenVideoControlPanel$2;
.super Ljava/lang/Object;

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/openalliance/ad/views/FullScreenVideoControlPanel;->a()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/huawei/openalliance/ad/views/FullScreenVideoControlPanel;


# direct methods
.method constructor <init>(Lcom/huawei/openalliance/ad/views/FullScreenVideoControlPanel;)V
    .locals 0

    iput-object p1, p0, Lcom/huawei/openalliance/ad/views/FullScreenVideoControlPanel$2;->a:Lcom/huawei/openalliance/ad/views/FullScreenVideoControlPanel;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 1

    iget-object v0, p0, Lcom/huawei/openalliance/ad/views/FullScreenVideoControlPanel$2;->a:Lcom/huawei/openalliance/ad/views/FullScreenVideoControlPanel;

    invoke-static {v0}, Lcom/huawei/openalliance/ad/views/FullScreenVideoControlPanel;->a(Lcom/huawei/openalliance/ad/views/FullScreenVideoControlPanel;)Lcom/huawei/openalliance/ad/views/FullScreenVideoControlPanel$a;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/huawei/openalliance/ad/views/FullScreenVideoControlPanel$2;->a:Lcom/huawei/openalliance/ad/views/FullScreenVideoControlPanel;

    invoke-static {v0}, Lcom/huawei/openalliance/ad/views/FullScreenVideoControlPanel;->a(Lcom/huawei/openalliance/ad/views/FullScreenVideoControlPanel;)Lcom/huawei/openalliance/ad/views/FullScreenVideoControlPanel$a;

    move-result-object v0

    invoke-interface {v0}, Lcom/huawei/openalliance/ad/views/FullScreenVideoControlPanel$a;->b()V

    :cond_0
    return-void
.end method
