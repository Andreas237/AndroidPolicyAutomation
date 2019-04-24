.class Lio/branch/referral/AnimatedDialog$2;
.super Ljava/lang/Object;
.source "AnimatedDialog.java"

# interfaces
.implements Landroid/view/animation/Animation$AnimationListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lio/branch/referral/AnimatedDialog;->slideClose()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lio/branch/referral/AnimatedDialog;


# direct methods
.method constructor <init>(Lio/branch/referral/AnimatedDialog;)V
    .locals 0

    .line 130
    iput-object p1, p0, Lio/branch/referral/AnimatedDialog$2;->this$0:Lio/branch/referral/AnimatedDialog;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onAnimationEnd(Landroid/view/animation/Animation;)V
    .locals 0

    .line 137
    iget-object p1, p0, Lio/branch/referral/AnimatedDialog$2;->this$0:Lio/branch/referral/AnimatedDialog;

    invoke-virtual {p1}, Lio/branch/referral/AnimatedDialog;->dismiss()V

    return-void
.end method

.method public onAnimationRepeat(Landroid/view/animation/Animation;)V
    .locals 0

    return-void
.end method

.method public onAnimationStart(Landroid/view/animation/Animation;)V
    .locals 0

    return-void
.end method
