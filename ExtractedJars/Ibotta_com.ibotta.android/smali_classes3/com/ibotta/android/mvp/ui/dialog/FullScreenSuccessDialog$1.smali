.class Lcom/ibotta/android/mvp/ui/dialog/FullScreenSuccessDialog$1;
.super Ljava/lang/Object;
.source "FullScreenSuccessDialog.java"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/ibotta/android/mvp/ui/dialog/FullScreenSuccessDialog;->show()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/ibotta/android/mvp/ui/dialog/FullScreenSuccessDialog;


# direct methods
.method constructor <init>(Lcom/ibotta/android/mvp/ui/dialog/FullScreenSuccessDialog;)V
    .locals 0

    .line 65
    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/dialog/FullScreenSuccessDialog$1;->this$0:Lcom/ibotta/android/mvp/ui/dialog/FullScreenSuccessDialog;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    .line 68
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/dialog/FullScreenSuccessDialog$1;->this$0:Lcom/ibotta/android/mvp/ui/dialog/FullScreenSuccessDialog;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/ibotta/android/mvp/ui/dialog/FullScreenSuccessDialog;->access$002(Lcom/ibotta/android/mvp/ui/dialog/FullScreenSuccessDialog;Ljava/lang/Runnable;)Ljava/lang/Runnable;

    .line 69
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/dialog/FullScreenSuccessDialog$1;->this$0:Lcom/ibotta/android/mvp/ui/dialog/FullScreenSuccessDialog;

    invoke-virtual {v0}, Lcom/ibotta/android/mvp/ui/dialog/FullScreenSuccessDialog;->dismiss()V

    return-void
.end method
