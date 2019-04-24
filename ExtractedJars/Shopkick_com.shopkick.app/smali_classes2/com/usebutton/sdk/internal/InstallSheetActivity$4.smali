.class Lcom/usebutton/sdk/internal/InstallSheetActivity$4;
.super Ljava/lang/Object;
.source "InstallSheetActivity.java"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/usebutton/sdk/internal/InstallSheetActivity;->initAppButton()V
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

    .line 146
    iput-object p1, p0, Lcom/usebutton/sdk/internal/InstallSheetActivity$4;->this$0:Lcom/usebutton/sdk/internal/InstallSheetActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 0

    .line 149
    iget-object p1, p0, Lcom/usebutton/sdk/internal/InstallSheetActivity$4;->this$0:Lcom/usebutton/sdk/internal/InstallSheetActivity;

    invoke-static {p1}, Lcom/usebutton/sdk/internal/InstallSheetActivity;->access$000(Lcom/usebutton/sdk/internal/InstallSheetActivity;)Lcom/usebutton/sdk/internal/InstallSheetPresenter;

    move-result-object p1

    invoke-virtual {p1}, Lcom/usebutton/sdk/internal/InstallSheetPresenter;->onClickAppButton()V

    return-void
.end method
