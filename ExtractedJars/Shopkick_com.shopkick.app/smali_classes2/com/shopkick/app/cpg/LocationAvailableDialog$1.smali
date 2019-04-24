.class Lcom/shopkick/app/cpg/LocationAvailableDialog$1;
.super Ljava/lang/Object;
.source "LocationAvailableDialog.java"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/shopkick/app/cpg/LocationAvailableDialog;-><init>(Landroid/content/Context;Lcom/shopkick/app/cpg/LocationAvailableDialog$IScanGoToScreen;Lcom/shopkick/app/logging/UserEventLogger;Lcom/shopkick/app/location/LocationNotifier;Lcom/shopkick/app/account/UserAccount;Lcom/shopkick/app/cpg/LocationDataSource;Lcom/shopkick/app/util/NotificationCenter;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IZ)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/shopkick/app/cpg/LocationAvailableDialog;


# direct methods
.method constructor <init>(Lcom/shopkick/app/cpg/LocationAvailableDialog;)V
    .locals 0

    .line 135
    iput-object p1, p0, Lcom/shopkick/app/cpg/LocationAvailableDialog$1;->this$0:Lcom/shopkick/app/cpg/LocationAvailableDialog;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 0

    .line 138
    iget-object p1, p0, Lcom/shopkick/app/cpg/LocationAvailableDialog$1;->this$0:Lcom/shopkick/app/cpg/LocationAvailableDialog;

    invoke-virtual {p1}, Lcom/shopkick/app/cpg/LocationAvailableDialog;->dismiss()V

    return-void
.end method
