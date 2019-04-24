.class public interface abstract Lcom/ibotta/android/fragment/dialog/PromptDialogFragment$PromptDialogListener;
.super Ljava/lang/Object;
.source "PromptDialogFragment.java"

# interfaces
.implements Lcom/ibotta/android/fragment/dialog/IbottaDialogFragment$IbottaDialogFragmentListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/ibotta/android/fragment/dialog/PromptDialogFragment;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x609
    name = "PromptDialogListener"
.end annotation


# virtual methods
.method public abstract onChoice(Ljava/lang/String;ILjava/lang/String;)V
    .param p2    # I
        .annotation build Landroid/support/annotation/StringRes;
        .end annotation
    .end param
.end method
