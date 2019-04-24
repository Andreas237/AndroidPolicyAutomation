.class Lcom/usebutton/sdk/internal/purchasepath/AppInstallCard$2;
.super Ljava/lang/Object;
.source "AppInstallCard.java"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/usebutton/sdk/internal/purchasepath/AppInstallCard;->onBindView(Landroid/view/View;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/usebutton/sdk/internal/purchasepath/AppInstallCard;


# direct methods
.method constructor <init>(Lcom/usebutton/sdk/internal/purchasepath/AppInstallCard;)V
    .locals 0

    .line 102
    iput-object p1, p0, Lcom/usebutton/sdk/internal/purchasepath/AppInstallCard$2;->this$0:Lcom/usebutton/sdk/internal/purchasepath/AppInstallCard;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 0

    .line 105
    iget-object p1, p0, Lcom/usebutton/sdk/internal/purchasepath/AppInstallCard$2;->this$0:Lcom/usebutton/sdk/internal/purchasepath/AppInstallCard;

    invoke-static {p1}, Lcom/usebutton/sdk/internal/purchasepath/AppInstallCard;->access$000(Lcom/usebutton/sdk/internal/purchasepath/AppInstallCard;)Lcom/usebutton/sdk/internal/purchasepath/AppInstallCard$Listener;

    move-result-object p1

    invoke-interface {p1}, Lcom/usebutton/sdk/internal/purchasepath/AppInstallCard$Listener;->onDeclineClicked()V

    return-void
.end method
