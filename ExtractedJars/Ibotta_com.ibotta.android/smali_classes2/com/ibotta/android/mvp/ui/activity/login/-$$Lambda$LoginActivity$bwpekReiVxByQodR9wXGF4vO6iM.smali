.class public final synthetic Lcom/ibotta/android/mvp/ui/activity/login/-$$Lambda$LoginActivity$bwpekReiVxByQodR9wXGF4vO6iM;
.super Ljava/lang/Object;
.source "lambda"

# interfaces
.implements Landroid/widget/TextView$OnEditorActionListener;


# instance fields
.field private final synthetic f$0:Lcom/ibotta/android/mvp/ui/activity/login/LoginActivity;


# direct methods
.method public synthetic constructor <init>(Lcom/ibotta/android/mvp/ui/activity/login/LoginActivity;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/login/-$$Lambda$LoginActivity$bwpekReiVxByQodR9wXGF4vO6iM;->f$0:Lcom/ibotta/android/mvp/ui/activity/login/LoginActivity;

    return-void
.end method


# virtual methods
.method public final onEditorAction(Landroid/widget/TextView;ILandroid/view/KeyEvent;)Z
    .locals 1

    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/login/-$$Lambda$LoginActivity$bwpekReiVxByQodR9wXGF4vO6iM;->f$0:Lcom/ibotta/android/mvp/ui/activity/login/LoginActivity;

    invoke-static {v0, p1, p2, p3}, Lcom/ibotta/android/mvp/ui/activity/login/LoginActivity;->lambda$initPassword$0(Lcom/ibotta/android/mvp/ui/activity/login/LoginActivity;Landroid/widget/TextView;ILandroid/view/KeyEvent;)Z

    move-result p1

    return p1
.end method
