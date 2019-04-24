.class Lcom/shopkick/app/widget/DataOptOutDialog$1;
.super Ljava/lang/Object;
.source "DataOptOutDialog.java"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/shopkick/app/widget/DataOptOutDialog;->onResume()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/shopkick/app/widget/DataOptOutDialog;


# direct methods
.method constructor <init>(Lcom/shopkick/app/widget/DataOptOutDialog;)V
    .locals 0

    .line 76
    iput-object p1, p0, Lcom/shopkick/app/widget/DataOptOutDialog$1;->this$0:Lcom/shopkick/app/widget/DataOptOutDialog;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 2

    .line 80
    iget-object p1, p0, Lcom/shopkick/app/widget/DataOptOutDialog$1;->this$0:Lcom/shopkick/app/widget/DataOptOutDialog;

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Lcom/shopkick/app/widget/DataOptOutDialog;->setCancelable(Z)V

    .line 81
    iget-object p1, p0, Lcom/shopkick/app/widget/DataOptOutDialog$1;->this$0:Lcom/shopkick/app/widget/DataOptOutDialog;

    new-instance v0, Landroid/app/ProgressDialog;

    invoke-virtual {p1}, Lcom/shopkick/app/widget/DataOptOutDialog;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v1

    invoke-direct {v0, v1}, Landroid/app/ProgressDialog;-><init>(Landroid/content/Context;)V

    invoke-static {p1, v0}, Lcom/shopkick/app/widget/DataOptOutDialog;->access$002(Lcom/shopkick/app/widget/DataOptOutDialog;Landroid/app/ProgressDialog;)Landroid/app/ProgressDialog;

    .line 82
    iget-object p1, p0, Lcom/shopkick/app/widget/DataOptOutDialog$1;->this$0:Lcom/shopkick/app/widget/DataOptOutDialog;

    invoke-static {p1}, Lcom/shopkick/app/widget/DataOptOutDialog;->access$000(Lcom/shopkick/app/widget/DataOptOutDialog;)Landroid/app/ProgressDialog;

    move-result-object p1

    invoke-virtual {p1}, Landroid/app/ProgressDialog;->show()V

    .line 84
    iget-object p1, p0, Lcom/shopkick/app/widget/DataOptOutDialog$1;->this$0:Lcom/shopkick/app/widget/DataOptOutDialog;

    new-instance v0, Lcom/shopkick/app/fetchers/api/skapi/UpdateDataOptOutStateRequest;

    invoke-direct {v0}, Lcom/shopkick/app/fetchers/api/skapi/UpdateDataOptOutStateRequest;-><init>()V

    iput-object v0, p1, Lcom/shopkick/app/widget/DataOptOutDialog;->updateDataOptOutStateRequest:Lcom/shopkick/app/fetchers/api/skapi/UpdateDataOptOutStateRequest;

    .line 85
    iget-object p1, p0, Lcom/shopkick/app/widget/DataOptOutDialog$1;->this$0:Lcom/shopkick/app/widget/DataOptOutDialog;

    iget-object p1, p1, Lcom/shopkick/app/widget/DataOptOutDialog;->updateDataOptOutStateRequest:Lcom/shopkick/app/fetchers/api/skapi/UpdateDataOptOutStateRequest;

    const/4 v0, 0x1

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    iput-object v0, p1, Lcom/shopkick/app/fetchers/api/skapi/UpdateDataOptOutStateRequest;->optOutState:Ljava/lang/Boolean;

    .line 86
    iget-object p1, p0, Lcom/shopkick/app/widget/DataOptOutDialog$1;->this$0:Lcom/shopkick/app/widget/DataOptOutDialog;

    invoke-static {p1}, Lcom/shopkick/app/widget/DataOptOutDialog;->access$100(Lcom/shopkick/app/widget/DataOptOutDialog;)Lcom/shopkick/fetchers/api/APIManager;

    move-result-object p1

    iget-object v0, p0, Lcom/shopkick/app/widget/DataOptOutDialog$1;->this$0:Lcom/shopkick/app/widget/DataOptOutDialog;

    iget-object v0, v0, Lcom/shopkick/app/widget/DataOptOutDialog;->updateDataOptOutStateRequest:Lcom/shopkick/app/fetchers/api/skapi/UpdateDataOptOutStateRequest;

    iget-object v1, p0, Lcom/shopkick/app/widget/DataOptOutDialog$1;->this$0:Lcom/shopkick/app/widget/DataOptOutDialog;

    invoke-virtual {p1, v0, v1}, Lcom/shopkick/fetchers/api/APIManager;->appFetch(Lcom/shopkick/app/fetchers/api/IAPIObject;Lcom/shopkick/fetchers/api/IAPICallback;)Lcom/shopkick/fetchers/RequestDetails;

    return-void
.end method
