.class Lcom/shopkick/app/more/MoreScreen$1;
.super Ljava/lang/Object;
.source "MoreScreen.java"

# interfaces
.implements Landroid/content/DialogInterface$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/shopkick/app/more/MoreScreen;->showSwitchEnvironmentDialog(Ljava/lang/String;Ljava/lang/String;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/shopkick/app/more/MoreScreen;

.field final synthetic val$env:Ljava/lang/String;

.field final synthetic val$text:Landroid/widget/EditText;


# direct methods
.method constructor <init>(Lcom/shopkick/app/more/MoreScreen;Ljava/lang/String;Landroid/widget/EditText;)V
    .locals 0

    .line 717
    iput-object p1, p0, Lcom/shopkick/app/more/MoreScreen$1;->this$0:Lcom/shopkick/app/more/MoreScreen;

    iput-object p2, p0, Lcom/shopkick/app/more/MoreScreen$1;->val$env:Ljava/lang/String;

    iput-object p3, p0, Lcom/shopkick/app/more/MoreScreen$1;->val$text:Landroid/widget/EditText;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/content/DialogInterface;I)V
    .locals 2

    .line 720
    new-instance p2, Ljava/util/HashMap;

    invoke-direct {p2}, Ljava/util/HashMap;-><init>()V

    const-string v0, "change_environment"

    .line 721
    iget-object v1, p0, Lcom/shopkick/app/more/MoreScreen$1;->val$env:Ljava/lang/String;

    invoke-virtual {p2, v0, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v0, "env_authority"

    .line 722
    iget-object v1, p0, Lcom/shopkick/app/more/MoreScreen$1;->val$text:Landroid/widget/EditText;

    invoke-virtual {v1}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p2, v0, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 723
    iget-object v0, p0, Lcom/shopkick/app/more/MoreScreen$1;->this$0:Lcom/shopkick/app/more/MoreScreen;

    invoke-static {v0}, Lcom/shopkick/app/more/MoreScreen;->access$000(Lcom/shopkick/app/more/MoreScreen;)Lcom/shopkick/app/util/NotificationCenter;

    move-result-object v0

    const-string v1, "reset_environment"

    invoke-virtual {v0, v1, p2}, Lcom/shopkick/app/util/NotificationCenter;->notifyEvent(Ljava/lang/String;Ljava/util/HashMap;)Ljava/util/List;

    .line 724
    invoke-interface {p1}, Landroid/content/DialogInterface;->dismiss()V

    .line 725
    iget-object p1, p0, Lcom/shopkick/app/more/MoreScreen$1;->this$0:Lcom/shopkick/app/more/MoreScreen;

    invoke-virtual {p1}, Lcom/shopkick/app/more/MoreScreen;->getBaseActivity()Lcom/shopkick/app/activities/BaseActivity;

    move-result-object p1

    invoke-virtual {p1}, Lcom/shopkick/app/activities/BaseActivity;->finish()V

    return-void
.end method
