.class Lcom/ibotta/android/mvp/ui/view/dialog/NotificationDialog$2;
.super Landroid/os/CountDownTimer;
.source "NotificationDialog.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/ibotta/android/mvp/ui/view/dialog/NotificationDialog;->startHideTimer()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/ibotta/android/mvp/ui/view/dialog/NotificationDialog;


# direct methods
.method constructor <init>(Lcom/ibotta/android/mvp/ui/view/dialog/NotificationDialog;JJ)V
    .locals 0

    .line 131
    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/view/dialog/NotificationDialog$2;->this$0:Lcom/ibotta/android/mvp/ui/view/dialog/NotificationDialog;

    invoke-direct {p0, p2, p3, p4, p5}, Landroid/os/CountDownTimer;-><init>(JJ)V

    return-void
.end method


# virtual methods
.method public onFinish()V
    .locals 2

    .line 138
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/dialog/NotificationDialog$2;->this$0:Lcom/ibotta/android/mvp/ui/view/dialog/NotificationDialog;

    invoke-static {v0}, Lcom/ibotta/android/mvp/ui/view/dialog/NotificationDialog;->access$000(Lcom/ibotta/android/mvp/ui/view/dialog/NotificationDialog;)V

    .line 139
    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/view/dialog/NotificationDialog$2;->cancel()V

    .line 140
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/dialog/NotificationDialog$2;->this$0:Lcom/ibotta/android/mvp/ui/view/dialog/NotificationDialog;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/ibotta/android/mvp/ui/view/dialog/NotificationDialog;->access$102(Lcom/ibotta/android/mvp/ui/view/dialog/NotificationDialog;Landroid/os/CountDownTimer;)Landroid/os/CountDownTimer;

    return-void
.end method

.method public onTick(J)V
    .locals 0

    return-void
.end method
