.class Lcom/ibotta/android/mvp/ui/view/account/AccountProfileView_ViewBinding$2;
.super Lbutterknife/internal/DebouncingOnClickListener;
.source "AccountProfileView_ViewBinding.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/ibotta/android/mvp/ui/view/account/AccountProfileView_ViewBinding;-><init>(Lcom/ibotta/android/mvp/ui/view/account/AccountProfileView;Landroid/view/View;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/ibotta/android/mvp/ui/view/account/AccountProfileView_ViewBinding;

.field final synthetic val$target:Lcom/ibotta/android/mvp/ui/view/account/AccountProfileView;


# direct methods
.method constructor <init>(Lcom/ibotta/android/mvp/ui/view/account/AccountProfileView_ViewBinding;Lcom/ibotta/android/mvp/ui/view/account/AccountProfileView;)V
    .locals 0

    .line 54
    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/view/account/AccountProfileView_ViewBinding$2;->this$0:Lcom/ibotta/android/mvp/ui/view/account/AccountProfileView_ViewBinding;

    iput-object p2, p0, Lcom/ibotta/android/mvp/ui/view/account/AccountProfileView_ViewBinding$2;->val$target:Lcom/ibotta/android/mvp/ui/view/account/AccountProfileView;

    invoke-direct {p0}, Lbutterknife/internal/DebouncingOnClickListener;-><init>()V

    return-void
.end method


# virtual methods
.method public doClick(Landroid/view/View;)V
    .locals 0

    .line 57
    iget-object p1, p0, Lcom/ibotta/android/mvp/ui/view/account/AccountProfileView_ViewBinding$2;->val$target:Lcom/ibotta/android/mvp/ui/view/account/AccountProfileView;

    invoke-virtual {p1}, Lcom/ibotta/android/mvp/ui/view/account/AccountProfileView;->onWithdrawUnavailableClicked()V

    return-void
.end method
