.class Lcom/ibotta/android/view/ImNoActivatedOffersDialog_ViewBinding$1;
.super Lbutterknife/internal/DebouncingOnClickListener;
.source "ImNoActivatedOffersDialog_ViewBinding.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/ibotta/android/view/ImNoActivatedOffersDialog_ViewBinding;-><init>(Lcom/ibotta/android/view/ImNoActivatedOffersDialog;Landroid/view/View;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/ibotta/android/view/ImNoActivatedOffersDialog_ViewBinding;

.field final synthetic val$target:Lcom/ibotta/android/view/ImNoActivatedOffersDialog;


# direct methods
.method constructor <init>(Lcom/ibotta/android/view/ImNoActivatedOffersDialog_ViewBinding;Lcom/ibotta/android/view/ImNoActivatedOffersDialog;)V
    .locals 0

    .line 38
    iput-object p1, p0, Lcom/ibotta/android/view/ImNoActivatedOffersDialog_ViewBinding$1;->this$0:Lcom/ibotta/android/view/ImNoActivatedOffersDialog_ViewBinding;

    iput-object p2, p0, Lcom/ibotta/android/view/ImNoActivatedOffersDialog_ViewBinding$1;->val$target:Lcom/ibotta/android/view/ImNoActivatedOffersDialog;

    invoke-direct {p0}, Lbutterknife/internal/DebouncingOnClickListener;-><init>()V

    return-void
.end method


# virtual methods
.method public doClick(Landroid/view/View;)V
    .locals 0

    .line 41
    iget-object p1, p0, Lcom/ibotta/android/view/ImNoActivatedOffersDialog_ViewBinding$1;->val$target:Lcom/ibotta/android/view/ImNoActivatedOffersDialog;

    invoke-virtual {p1}, Lcom/ibotta/android/view/ImNoActivatedOffersDialog;->onClick()V

    return-void
.end method
