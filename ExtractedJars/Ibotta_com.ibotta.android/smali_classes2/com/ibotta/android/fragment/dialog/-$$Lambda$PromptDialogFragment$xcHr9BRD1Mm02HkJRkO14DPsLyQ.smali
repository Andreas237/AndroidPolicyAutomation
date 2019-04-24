.class public final synthetic Lcom/ibotta/android/fragment/dialog/-$$Lambda$PromptDialogFragment$xcHr9BRD1Mm02HkJRkO14DPsLyQ;
.super Ljava/lang/Object;
.source "lambda"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field private final synthetic f$0:Lcom/ibotta/android/fragment/dialog/PromptDialogFragment;

.field private final synthetic f$1:I

.field private final synthetic f$2:Lcom/ibotta/android/view/PromptView;


# direct methods
.method public synthetic constructor <init>(Lcom/ibotta/android/fragment/dialog/PromptDialogFragment;ILcom/ibotta/android/view/PromptView;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/ibotta/android/fragment/dialog/-$$Lambda$PromptDialogFragment$xcHr9BRD1Mm02HkJRkO14DPsLyQ;->f$0:Lcom/ibotta/android/fragment/dialog/PromptDialogFragment;

    iput p2, p0, Lcom/ibotta/android/fragment/dialog/-$$Lambda$PromptDialogFragment$xcHr9BRD1Mm02HkJRkO14DPsLyQ;->f$1:I

    iput-object p3, p0, Lcom/ibotta/android/fragment/dialog/-$$Lambda$PromptDialogFragment$xcHr9BRD1Mm02HkJRkO14DPsLyQ;->f$2:Lcom/ibotta/android/view/PromptView;

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 3

    iget-object v0, p0, Lcom/ibotta/android/fragment/dialog/-$$Lambda$PromptDialogFragment$xcHr9BRD1Mm02HkJRkO14DPsLyQ;->f$0:Lcom/ibotta/android/fragment/dialog/PromptDialogFragment;

    iget v1, p0, Lcom/ibotta/android/fragment/dialog/-$$Lambda$PromptDialogFragment$xcHr9BRD1Mm02HkJRkO14DPsLyQ;->f$1:I

    iget-object v2, p0, Lcom/ibotta/android/fragment/dialog/-$$Lambda$PromptDialogFragment$xcHr9BRD1Mm02HkJRkO14DPsLyQ;->f$2:Lcom/ibotta/android/view/PromptView;

    invoke-static {v0, v1, v2, p1}, Lcom/ibotta/android/fragment/dialog/PromptDialogFragment;->lambda$onCreateView$0(Lcom/ibotta/android/fragment/dialog/PromptDialogFragment;ILcom/ibotta/android/view/PromptView;Landroid/view/View;)V

    return-void
.end method
