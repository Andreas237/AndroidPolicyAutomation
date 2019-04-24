.class Lcom/shopkick/app/launch/FirstUseGenderAndBirthdayScreen$GenderAnimationListener;
.super Ljava/lang/Object;
.source "FirstUseGenderAndBirthdayScreen.java"

# interfaces
.implements Landroid/animation/Animator$AnimatorListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/shopkick/app/launch/FirstUseGenderAndBirthdayScreen;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = "GenderAnimationListener"
.end annotation


# instance fields
.field private mustShow:Z

.field final synthetic this$0:Lcom/shopkick/app/launch/FirstUseGenderAndBirthdayScreen;


# direct methods
.method public constructor <init>(Lcom/shopkick/app/launch/FirstUseGenderAndBirthdayScreen;Z)V
    .locals 0

    .line 176
    iput-object p1, p0, Lcom/shopkick/app/launch/FirstUseGenderAndBirthdayScreen$GenderAnimationListener;->this$0:Lcom/shopkick/app/launch/FirstUseGenderAndBirthdayScreen;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 177
    iput-boolean p2, p0, Lcom/shopkick/app/launch/FirstUseGenderAndBirthdayScreen$GenderAnimationListener;->mustShow:Z

    return-void
.end method


# virtual methods
.method public onAnimationCancel(Landroid/animation/Animator;)V
    .locals 0

    return-void
.end method

.method public onAnimationEnd(Landroid/animation/Animator;)V
    .locals 1

    .line 186
    iget-object p1, p0, Lcom/shopkick/app/launch/FirstUseGenderAndBirthdayScreen$GenderAnimationListener;->this$0:Lcom/shopkick/app/launch/FirstUseGenderAndBirthdayScreen;

    iget-boolean v0, p0, Lcom/shopkick/app/launch/FirstUseGenderAndBirthdayScreen$GenderAnimationListener;->mustShow:Z

    invoke-static {p1, v0}, Lcom/shopkick/app/launch/FirstUseGenderAndBirthdayScreen;->access$000(Lcom/shopkick/app/launch/FirstUseGenderAndBirthdayScreen;Z)V

    return-void
.end method

.method public onAnimationRepeat(Landroid/animation/Animator;)V
    .locals 0

    return-void
.end method

.method public onAnimationStart(Landroid/animation/Animator;)V
    .locals 0

    return-void
.end method
