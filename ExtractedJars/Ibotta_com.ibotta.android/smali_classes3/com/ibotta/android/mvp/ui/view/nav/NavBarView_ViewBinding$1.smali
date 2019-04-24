.class Lcom/ibotta/android/mvp/ui/view/nav/NavBarView_ViewBinding$1;
.super Lbutterknife/internal/DebouncingOnClickListener;
.source "NavBarView_ViewBinding.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/ibotta/android/mvp/ui/view/nav/NavBarView_ViewBinding;-><init>(Lcom/ibotta/android/mvp/ui/view/nav/NavBarView;Landroid/view/View;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/ibotta/android/mvp/ui/view/nav/NavBarView_ViewBinding;

.field final synthetic val$target:Lcom/ibotta/android/mvp/ui/view/nav/NavBarView;


# direct methods
.method constructor <init>(Lcom/ibotta/android/mvp/ui/view/nav/NavBarView_ViewBinding;Lcom/ibotta/android/mvp/ui/view/nav/NavBarView;)V
    .locals 0

    .line 47
    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/view/nav/NavBarView_ViewBinding$1;->this$0:Lcom/ibotta/android/mvp/ui/view/nav/NavBarView_ViewBinding;

    iput-object p2, p0, Lcom/ibotta/android/mvp/ui/view/nav/NavBarView_ViewBinding$1;->val$target:Lcom/ibotta/android/mvp/ui/view/nav/NavBarView;

    invoke-direct {p0}, Lbutterknife/internal/DebouncingOnClickListener;-><init>()V

    return-void
.end method


# virtual methods
.method public doClick(Landroid/view/View;)V
    .locals 7

    .line 50
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/nav/NavBarView_ViewBinding$1;->val$target:Lcom/ibotta/android/mvp/ui/view/nav/NavBarView;

    const-string v2, "doClick"

    const-string v4, "onNbvOneClicked"

    const-class v6, Lcom/ibotta/android/mvp/ui/view/nav/NavButtonView;

    const/4 v3, 0x0

    const/4 v5, 0x0

    move-object v1, p1

    invoke-static/range {v1 .. v6}, Lbutterknife/internal/Utils;->castParam(Ljava/lang/Object;Ljava/lang/String;ILjava/lang/String;ILjava/lang/Class;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/ibotta/android/mvp/ui/view/nav/NavButtonView;

    invoke-virtual {v0, p1}, Lcom/ibotta/android/mvp/ui/view/nav/NavBarView;->onNbvOneClicked(Lcom/ibotta/android/mvp/ui/view/nav/NavButtonView;)V

    return-void
.end method
