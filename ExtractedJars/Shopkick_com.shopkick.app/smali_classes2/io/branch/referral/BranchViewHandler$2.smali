.class Lio/branch/referral/BranchViewHandler$2;
.super Ljava/lang/Object;
.source "BranchViewHandler.java"

# interfaces
.implements Landroid/content/DialogInterface$OnDismissListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lio/branch/referral/BranchViewHandler;->openBranchViewDialog(Lio/branch/referral/BranchViewHandler$BranchView;Lio/branch/referral/BranchViewHandler$IBranchViewEvents;Landroid/webkit/WebView;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lio/branch/referral/BranchViewHandler;

.field final synthetic val$branchView:Lio/branch/referral/BranchViewHandler$BranchView;

.field final synthetic val$callback:Lio/branch/referral/BranchViewHandler$IBranchViewEvents;


# direct methods
.method constructor <init>(Lio/branch/referral/BranchViewHandler;Lio/branch/referral/BranchViewHandler$IBranchViewEvents;Lio/branch/referral/BranchViewHandler$BranchView;)V
    .locals 0

    .line 201
    iput-object p1, p0, Lio/branch/referral/BranchViewHandler$2;->this$0:Lio/branch/referral/BranchViewHandler;

    iput-object p2, p0, Lio/branch/referral/BranchViewHandler$2;->val$callback:Lio/branch/referral/BranchViewHandler$IBranchViewEvents;

    iput-object p3, p0, Lio/branch/referral/BranchViewHandler$2;->val$branchView:Lio/branch/referral/BranchViewHandler$BranchView;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onDismiss(Landroid/content/DialogInterface;)V
    .locals 2

    .line 204
    iget-object p1, p0, Lio/branch/referral/BranchViewHandler$2;->this$0:Lio/branch/referral/BranchViewHandler;

    const/4 v0, 0x0

    invoke-static {p1, v0}, Lio/branch/referral/BranchViewHandler;->access$902(Lio/branch/referral/BranchViewHandler;Z)Z

    .line 205
    iget-object p1, p0, Lio/branch/referral/BranchViewHandler$2;->this$0:Lio/branch/referral/BranchViewHandler;

    const/4 v0, 0x0

    invoke-static {p1, v0}, Lio/branch/referral/BranchViewHandler;->access$502(Lio/branch/referral/BranchViewHandler;Landroid/app/Dialog;)Landroid/app/Dialog;

    .line 207
    iget-object p1, p0, Lio/branch/referral/BranchViewHandler$2;->val$callback:Lio/branch/referral/BranchViewHandler$IBranchViewEvents;

    if-eqz p1, :cond_1

    .line 208
    iget-object p1, p0, Lio/branch/referral/BranchViewHandler$2;->this$0:Lio/branch/referral/BranchViewHandler;

    invoke-static {p1}, Lio/branch/referral/BranchViewHandler;->access$1000(Lio/branch/referral/BranchViewHandler;)Z

    move-result p1

    if-eqz p1, :cond_0

    .line 209
    iget-object p1, p0, Lio/branch/referral/BranchViewHandler$2;->val$callback:Lio/branch/referral/BranchViewHandler$IBranchViewEvents;

    iget-object v0, p0, Lio/branch/referral/BranchViewHandler$2;->val$branchView:Lio/branch/referral/BranchViewHandler$BranchView;

    invoke-static {v0}, Lio/branch/referral/BranchViewHandler$BranchView;->access$100(Lio/branch/referral/BranchViewHandler$BranchView;)Ljava/lang/String;

    move-result-object v0

    iget-object v1, p0, Lio/branch/referral/BranchViewHandler$2;->val$branchView:Lio/branch/referral/BranchViewHandler$BranchView;

    invoke-static {v1}, Lio/branch/referral/BranchViewHandler$BranchView;->access$800(Lio/branch/referral/BranchViewHandler$BranchView;)Ljava/lang/String;

    move-result-object v1

    invoke-interface {p1, v0, v1}, Lio/branch/referral/BranchViewHandler$IBranchViewEvents;->onBranchViewAccepted(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0

    .line 211
    :cond_0
    iget-object p1, p0, Lio/branch/referral/BranchViewHandler$2;->val$callback:Lio/branch/referral/BranchViewHandler$IBranchViewEvents;

    iget-object v0, p0, Lio/branch/referral/BranchViewHandler$2;->val$branchView:Lio/branch/referral/BranchViewHandler$BranchView;

    invoke-static {v0}, Lio/branch/referral/BranchViewHandler$BranchView;->access$100(Lio/branch/referral/BranchViewHandler$BranchView;)Ljava/lang/String;

    move-result-object v0

    iget-object v1, p0, Lio/branch/referral/BranchViewHandler$2;->val$branchView:Lio/branch/referral/BranchViewHandler$BranchView;

    invoke-static {v1}, Lio/branch/referral/BranchViewHandler$BranchView;->access$800(Lio/branch/referral/BranchViewHandler$BranchView;)Ljava/lang/String;

    move-result-object v1

    invoke-interface {p1, v0, v1}, Lio/branch/referral/BranchViewHandler$IBranchViewEvents;->onBranchViewCancelled(Ljava/lang/String;Ljava/lang/String;)V

    :cond_1
    :goto_0
    return-void
.end method
