.class Lcom/usebutton/sdk/internal/InstallCardActivity$1;
.super Ljava/lang/Object;
.source "InstallCardActivity.java"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/usebutton/sdk/internal/InstallCardActivity;->onStop()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/usebutton/sdk/internal/InstallCardActivity;


# direct methods
.method constructor <init>(Lcom/usebutton/sdk/internal/InstallCardActivity;)V
    .locals 0

    .line 52
    iput-object p1, p0, Lcom/usebutton/sdk/internal/InstallCardActivity$1;->this$0:Lcom/usebutton/sdk/internal/InstallCardActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 1

    .line 55
    iget-object v0, p0, Lcom/usebutton/sdk/internal/InstallCardActivity$1;->this$0:Lcom/usebutton/sdk/internal/InstallCardActivity;

    invoke-static {v0}, Lcom/usebutton/sdk/internal/InstallCardActivity;->access$000(Lcom/usebutton/sdk/internal/InstallCardActivity;)Landroid/app/AlertDialog;

    move-result-object v0

    invoke-virtual {v0}, Landroid/app/AlertDialog;->dismiss()V

    return-void
.end method
