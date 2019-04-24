.class Lcom/ibotta/android/view/ImConnectedAccountDialog_ViewBinding$2;
.super Lbutterknife/internal/DebouncingOnClickListener;
.source "ImConnectedAccountDialog_ViewBinding.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/ibotta/android/view/ImConnectedAccountDialog_ViewBinding;-><init>(Lcom/ibotta/android/view/ImConnectedAccountDialog;Landroid/view/View;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/ibotta/android/view/ImConnectedAccountDialog_ViewBinding;

.field final synthetic val$target:Lcom/ibotta/android/view/ImConnectedAccountDialog;


# direct methods
.method constructor <init>(Lcom/ibotta/android/view/ImConnectedAccountDialog_ViewBinding;Lcom/ibotta/android/view/ImConnectedAccountDialog;)V
    .locals 0

    .line 49
    iput-object p1, p0, Lcom/ibotta/android/view/ImConnectedAccountDialog_ViewBinding$2;->this$0:Lcom/ibotta/android/view/ImConnectedAccountDialog_ViewBinding;

    iput-object p2, p0, Lcom/ibotta/android/view/ImConnectedAccountDialog_ViewBinding$2;->val$target:Lcom/ibotta/android/view/ImConnectedAccountDialog;

    invoke-direct {p0}, Lbutterknife/internal/DebouncingOnClickListener;-><init>()V

    return-void
.end method


# virtual methods
.method public doClick(Landroid/view/View;)V
    .locals 0

    .line 52
    iget-object p1, p0, Lcom/ibotta/android/view/ImConnectedAccountDialog_ViewBinding$2;->val$target:Lcom/ibotta/android/view/ImConnectedAccountDialog;

    invoke-virtual {p1}, Lcom/ibotta/android/view/ImConnectedAccountDialog;->onCloseButtonClick()V

    return-void
.end method
