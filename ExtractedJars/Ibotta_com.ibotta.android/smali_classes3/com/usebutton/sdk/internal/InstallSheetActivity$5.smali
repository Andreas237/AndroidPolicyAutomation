.class Lcom/usebutton/sdk/internal/InstallSheetActivity$5;
.super Ljava/lang/Object;
.source "InstallSheetActivity.java"

# interfaces
.implements Landroid/animation/ValueAnimator$AnimatorUpdateListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/usebutton/sdk/internal/InstallSheetActivity;->setWebAction(ILjava/lang/String;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/usebutton/sdk/internal/InstallSheetActivity;

.field final synthetic val$copy:Ljava/lang/String;


# direct methods
.method constructor <init>(Lcom/usebutton/sdk/internal/InstallSheetActivity;Ljava/lang/String;)V
    .locals 0

    .line 183
    iput-object p1, p0, Lcom/usebutton/sdk/internal/InstallSheetActivity$5;->this$0:Lcom/usebutton/sdk/internal/InstallSheetActivity;

    iput-object p2, p0, Lcom/usebutton/sdk/internal/InstallSheetActivity$5;->val$copy:Ljava/lang/String;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onAnimationUpdate(Landroid/animation/ValueAnimator;)V
    .locals 3

    .line 186
    iget-object v0, p0, Lcom/usebutton/sdk/internal/InstallSheetActivity$5;->this$0:Lcom/usebutton/sdk/internal/InstallSheetActivity;

    sget v1, Lcom/usebutton/sdk/R$id;->install_sheet_button_web:I

    invoke-virtual {p1}, Landroid/animation/ValueAnimator;->getAnimatedValue()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Integer;

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    iget-object v2, p0, Lcom/usebutton/sdk/internal/InstallSheetActivity$5;->val$copy:Ljava/lang/String;

    invoke-static {v0, v1, p1, v2}, Lcom/usebutton/sdk/internal/InstallSheetActivity;->access$100(Lcom/usebutton/sdk/internal/InstallSheetActivity;IILjava/lang/String;)V

    return-void
.end method
