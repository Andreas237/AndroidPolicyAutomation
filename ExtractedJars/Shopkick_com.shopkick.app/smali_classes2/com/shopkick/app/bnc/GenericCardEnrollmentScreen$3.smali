.class Lcom/shopkick/app/bnc/GenericCardEnrollmentScreen$3;
.super Ljava/lang/Object;
.source "GenericCardEnrollmentScreen.java"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/shopkick/app/bnc/GenericCardEnrollmentScreen;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/shopkick/app/bnc/GenericCardEnrollmentScreen;


# direct methods
.method constructor <init>(Lcom/shopkick/app/bnc/GenericCardEnrollmentScreen;)V
    .locals 0

    .line 444
    iput-object p1, p0, Lcom/shopkick/app/bnc/GenericCardEnrollmentScreen$3;->this$0:Lcom/shopkick/app/bnc/GenericCardEnrollmentScreen;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    .line 448
    iget-object v0, p0, Lcom/shopkick/app/bnc/GenericCardEnrollmentScreen$3;->this$0:Lcom/shopkick/app/bnc/GenericCardEnrollmentScreen;

    iget-object v0, v0, Lcom/shopkick/app/bnc/GenericCardEnrollmentScreen;->cardNum:Landroid/widget/EditText;

    iget-object v1, p0, Lcom/shopkick/app/bnc/GenericCardEnrollmentScreen$3;->this$0:Lcom/shopkick/app/bnc/GenericCardEnrollmentScreen;

    iget-object v1, v1, Lcom/shopkick/app/bnc/GenericCardEnrollmentScreen;->inFromLeft:Landroid/view/animation/TranslateAnimation;

    invoke-virtual {v0, v1}, Landroid/widget/EditText;->startAnimation(Landroid/view/animation/Animation;)V

    .line 449
    iget-object v0, p0, Lcom/shopkick/app/bnc/GenericCardEnrollmentScreen$3;->this$0:Lcom/shopkick/app/bnc/GenericCardEnrollmentScreen;

    iget-object v0, v0, Lcom/shopkick/app/bnc/GenericCardEnrollmentScreen;->dateZipSection:Landroid/widget/RelativeLayout;

    iget-object v1, p0, Lcom/shopkick/app/bnc/GenericCardEnrollmentScreen$3;->this$0:Lcom/shopkick/app/bnc/GenericCardEnrollmentScreen;

    iget-object v1, v1, Lcom/shopkick/app/bnc/GenericCardEnrollmentScreen;->outOnRight:Landroid/view/animation/TranslateAnimation;

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->startAnimation(Landroid/view/animation/Animation;)V

    .line 450
    iget-object v0, p0, Lcom/shopkick/app/bnc/GenericCardEnrollmentScreen$3;->this$0:Lcom/shopkick/app/bnc/GenericCardEnrollmentScreen;

    iget-object v0, v0, Lcom/shopkick/app/bnc/GenericCardEnrollmentScreen;->cardDescWithLock:Landroid/widget/RelativeLayout;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    .line 451
    iget-object v0, p0, Lcom/shopkick/app/bnc/GenericCardEnrollmentScreen$3;->this$0:Lcom/shopkick/app/bnc/GenericCardEnrollmentScreen;

    iget-object v0, v0, Lcom/shopkick/app/bnc/GenericCardEnrollmentScreen;->linkDescView:Landroid/widget/ScrollView;

    iget-object v1, p0, Lcom/shopkick/app/bnc/GenericCardEnrollmentScreen$3;->this$0:Lcom/shopkick/app/bnc/GenericCardEnrollmentScreen;

    iget-object v1, v1, Lcom/shopkick/app/bnc/GenericCardEnrollmentScreen;->outOnRightText:Landroid/view/animation/TranslateAnimation;

    invoke-virtual {v0, v1}, Landroid/widget/ScrollView;->startAnimation(Landroid/view/animation/Animation;)V

    .line 452
    iget-object v0, p0, Lcom/shopkick/app/bnc/GenericCardEnrollmentScreen$3;->this$0:Lcom/shopkick/app/bnc/GenericCardEnrollmentScreen;

    iget-object v0, v0, Lcom/shopkick/app/bnc/GenericCardEnrollmentScreen;->cardDescWithLock:Landroid/widget/RelativeLayout;

    iget-object v1, p0, Lcom/shopkick/app/bnc/GenericCardEnrollmentScreen$3;->this$0:Lcom/shopkick/app/bnc/GenericCardEnrollmentScreen;

    iget-object v1, v1, Lcom/shopkick/app/bnc/GenericCardEnrollmentScreen;->inFromLeftText:Landroid/view/animation/TranslateAnimation;

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->startAnimation(Landroid/view/animation/Animation;)V

    return-void
.end method
