.class Lcom/ibotta/android/mvp/ui/dialog/NetworkConnectionDialog_ViewBinding$1;
.super Lbutterknife/internal/DebouncingOnClickListener;
.source "NetworkConnectionDialog_ViewBinding.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/ibotta/android/mvp/ui/dialog/NetworkConnectionDialog_ViewBinding;-><init>(Lcom/ibotta/android/mvp/ui/dialog/NetworkConnectionDialog;Landroid/view/View;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/ibotta/android/mvp/ui/dialog/NetworkConnectionDialog_ViewBinding;

.field final synthetic val$target:Lcom/ibotta/android/mvp/ui/dialog/NetworkConnectionDialog;


# direct methods
.method constructor <init>(Lcom/ibotta/android/mvp/ui/dialog/NetworkConnectionDialog_ViewBinding;Lcom/ibotta/android/mvp/ui/dialog/NetworkConnectionDialog;)V
    .locals 0

    .line 34
    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/dialog/NetworkConnectionDialog_ViewBinding$1;->this$0:Lcom/ibotta/android/mvp/ui/dialog/NetworkConnectionDialog_ViewBinding;

    iput-object p2, p0, Lcom/ibotta/android/mvp/ui/dialog/NetworkConnectionDialog_ViewBinding$1;->val$target:Lcom/ibotta/android/mvp/ui/dialog/NetworkConnectionDialog;

    invoke-direct {p0}, Lbutterknife/internal/DebouncingOnClickListener;-><init>()V

    return-void
.end method


# virtual methods
.method public doClick(Landroid/view/View;)V
    .locals 0

    .line 37
    iget-object p1, p0, Lcom/ibotta/android/mvp/ui/dialog/NetworkConnectionDialog_ViewBinding$1;->val$target:Lcom/ibotta/android/mvp/ui/dialog/NetworkConnectionDialog;

    invoke-virtual {p1}, Lcom/ibotta/android/mvp/ui/dialog/NetworkConnectionDialog;->onCtaButtonClicked()V

    return-void
.end method
