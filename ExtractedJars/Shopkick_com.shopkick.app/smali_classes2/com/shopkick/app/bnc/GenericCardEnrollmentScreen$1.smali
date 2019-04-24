.class Lcom/shopkick/app/bnc/GenericCardEnrollmentScreen$1;
.super Ljava/lang/Object;
.source "GenericCardEnrollmentScreen.java"

# interfaces
.implements Landroid/view/View$OnTouchListener;


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

    .line 286
    iput-object p1, p0, Lcom/shopkick/app/bnc/GenericCardEnrollmentScreen$1;->this$0:Lcom/shopkick/app/bnc/GenericCardEnrollmentScreen;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onTouch(Landroid/view/View;Landroid/view/MotionEvent;)Z
    .locals 2

    .line 290
    iget-object p2, p0, Lcom/shopkick/app/bnc/GenericCardEnrollmentScreen$1;->this$0:Lcom/shopkick/app/bnc/GenericCardEnrollmentScreen;

    iget-object p2, p2, Lcom/shopkick/app/bnc/GenericCardEnrollmentScreen;->descTextSection:Landroid/widget/RelativeLayout;

    const/4 v0, 0x0

    if-eq p1, p2, :cond_0

    iget-object p2, p0, Lcom/shopkick/app/bnc/GenericCardEnrollmentScreen$1;->this$0:Lcom/shopkick/app/bnc/GenericCardEnrollmentScreen;

    iget-object p2, p2, Lcom/shopkick/app/bnc/GenericCardEnrollmentScreen;->linkDescView:Landroid/widget/ScrollView;

    if-ne p1, p2, :cond_1

    .line 291
    :cond_0
    iget-object p2, p0, Lcom/shopkick/app/bnc/GenericCardEnrollmentScreen$1;->this$0:Lcom/shopkick/app/bnc/GenericCardEnrollmentScreen;

    .line 292
    invoke-virtual {p2}, Lcom/shopkick/app/bnc/GenericCardEnrollmentScreen;->getContext()Landroid/content/Context;

    move-result-object p2

    const-string v1, "input_method"

    invoke-virtual {p2, v1}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Landroid/view/inputmethod/InputMethodManager;

    .line 293
    invoke-virtual {p1}, Landroid/view/View;->getWindowToken()Landroid/os/IBinder;

    move-result-object p1

    invoke-virtual {p2, p1, v0}, Landroid/view/inputmethod/InputMethodManager;->hideSoftInputFromWindow(Landroid/os/IBinder;I)Z

    :cond_1
    return v0
.end method
