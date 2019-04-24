.class Lcom/usebutton/sdk/internal/views/OneLineInventoryView$2;
.super Ljava/lang/Object;
.source "OneLineInventoryView.java"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/usebutton/sdk/internal/views/OneLineInventoryView;->setFooter(Lcom/usebutton/sdk/internal/models/Footer;Lcom/usebutton/sdk/internal/util/Receiver;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/usebutton/sdk/internal/views/OneLineInventoryView;

.field final synthetic val$footer:Lcom/usebutton/sdk/internal/models/Footer;

.field final synthetic val$onInventorySelected:Lcom/usebutton/sdk/internal/util/Receiver;


# direct methods
.method constructor <init>(Lcom/usebutton/sdk/internal/views/OneLineInventoryView;Lcom/usebutton/sdk/internal/util/Receiver;Lcom/usebutton/sdk/internal/models/Footer;)V
    .locals 0

    .line 132
    iput-object p1, p0, Lcom/usebutton/sdk/internal/views/OneLineInventoryView$2;->this$0:Lcom/usebutton/sdk/internal/views/OneLineInventoryView;

    iput-object p2, p0, Lcom/usebutton/sdk/internal/views/OneLineInventoryView$2;->val$onInventorySelected:Lcom/usebutton/sdk/internal/util/Receiver;

    iput-object p3, p0, Lcom/usebutton/sdk/internal/views/OneLineInventoryView$2;->val$footer:Lcom/usebutton/sdk/internal/models/Footer;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 1

    .line 135
    iget-object p1, p0, Lcom/usebutton/sdk/internal/views/OneLineInventoryView$2;->val$onInventorySelected:Lcom/usebutton/sdk/internal/util/Receiver;

    if-eqz p1, :cond_0

    .line 136
    iget-object v0, p0, Lcom/usebutton/sdk/internal/views/OneLineInventoryView$2;->val$footer:Lcom/usebutton/sdk/internal/models/Footer;

    invoke-virtual {v0}, Lcom/usebutton/sdk/internal/models/Footer;->getAction()Lcom/usebutton/sdk/models/Link;

    move-result-object v0

    invoke-interface {p1, v0}, Lcom/usebutton/sdk/internal/util/Receiver;->receive(Ljava/lang/Object;)V

    :cond_0
    return-void
.end method
