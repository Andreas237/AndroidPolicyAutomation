.class Lcom/usebutton/sdk/internal/InstallSheetActivity$6;
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

.field final synthetic val$install:Landroid/widget/Button;


# direct methods
.method constructor <init>(Lcom/usebutton/sdk/internal/InstallSheetActivity;Landroid/widget/Button;)V
    .locals 0

    .line 198
    iput-object p1, p0, Lcom/usebutton/sdk/internal/InstallSheetActivity$6;->this$0:Lcom/usebutton/sdk/internal/InstallSheetActivity;

    iput-object p2, p0, Lcom/usebutton/sdk/internal/InstallSheetActivity$6;->val$install:Landroid/widget/Button;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onAnimationUpdate(Landroid/animation/ValueAnimator;)V
    .locals 1

    .line 201
    iget-object v0, p0, Lcom/usebutton/sdk/internal/InstallSheetActivity$6;->val$install:Landroid/widget/Button;

    invoke-virtual {p1}, Landroid/animation/ValueAnimator;->getAnimatedValue()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Integer;

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    invoke-virtual {v0, p1}, Landroid/widget/Button;->setBackgroundColor(I)V

    return-void
.end method
