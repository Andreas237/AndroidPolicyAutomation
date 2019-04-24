.class Lcom/shopkick/app/more/MoreScreen$3;
.super Ljava/lang/Object;
.source "MoreScreen.java"

# interfaces
.implements Landroid/content/DialogInterface$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/shopkick/app/more/MoreScreen;->showLaunchSKLinkDialog()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/shopkick/app/more/MoreScreen;

.field final synthetic val$text:Landroid/widget/EditText;


# direct methods
.method constructor <init>(Lcom/shopkick/app/more/MoreScreen;Landroid/widget/EditText;)V
    .locals 0

    .line 748
    iput-object p1, p0, Lcom/shopkick/app/more/MoreScreen$3;->this$0:Lcom/shopkick/app/more/MoreScreen;

    iput-object p2, p0, Lcom/shopkick/app/more/MoreScreen$3;->val$text:Landroid/widget/EditText;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/content/DialogInterface;I)V
    .locals 0

    .line 751
    iget-object p1, p0, Lcom/shopkick/app/more/MoreScreen$3;->this$0:Lcom/shopkick/app/more/MoreScreen;

    invoke-static {p1}, Lcom/shopkick/app/more/MoreScreen;->access$100(Lcom/shopkick/app/more/MoreScreen;)Lcom/shopkick/app/url/URLDispatcher;

    move-result-object p1

    iget-object p2, p0, Lcom/shopkick/app/more/MoreScreen$3;->val$text:Landroid/widget/EditText;

    invoke-virtual {p2}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    move-result-object p2

    invoke-virtual {p2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Lcom/shopkick/app/url/URLDispatcher;->dispatchURL(Ljava/lang/String;)Z

    return-void
.end method
