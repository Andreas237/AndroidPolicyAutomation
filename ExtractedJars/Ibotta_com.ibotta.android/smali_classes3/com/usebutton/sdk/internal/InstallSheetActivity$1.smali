.class Lcom/usebutton/sdk/internal/InstallSheetActivity$1;
.super Ljava/lang/Object;
.source "InstallSheetActivity.java"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/usebutton/sdk/internal/InstallSheetActivity;->initLoadingTimer(J)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/usebutton/sdk/internal/InstallSheetActivity;


# direct methods
.method constructor <init>(Lcom/usebutton/sdk/internal/InstallSheetActivity;)V
    .locals 0

    .line 92
    iput-object p1, p0, Lcom/usebutton/sdk/internal/InstallSheetActivity$1;->this$0:Lcom/usebutton/sdk/internal/InstallSheetActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 1

    .line 95
    iget-object v0, p0, Lcom/usebutton/sdk/internal/InstallSheetActivity$1;->this$0:Lcom/usebutton/sdk/internal/InstallSheetActivity;

    invoke-static {v0}, Lcom/usebutton/sdk/internal/InstallSheetActivity;->access$000(Lcom/usebutton/sdk/internal/InstallSheetActivity;)Lcom/usebutton/sdk/internal/InstallSheetPresenter;

    move-result-object v0

    invoke-virtual {v0}, Lcom/usebutton/sdk/internal/InstallSheetPresenter;->onLoadingTimerComplete()V

    return-void
.end method
