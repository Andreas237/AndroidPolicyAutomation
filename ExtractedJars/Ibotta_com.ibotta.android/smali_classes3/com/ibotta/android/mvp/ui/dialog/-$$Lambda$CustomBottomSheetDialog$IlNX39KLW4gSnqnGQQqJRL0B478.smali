.class public final synthetic Lcom/ibotta/android/mvp/ui/dialog/-$$Lambda$CustomBottomSheetDialog$IlNX39KLW4gSnqnGQQqJRL0B478;
.super Ljava/lang/Object;
.source "lambda"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field private final synthetic f$0:Lcom/ibotta/android/mvp/ui/dialog/CustomBottomSheetDialog;

.field private final synthetic f$1:Lcom/ibotta/android/mvp/ui/dialog/CustomBottomSheetDialog$CustomBottomSheetOption;


# direct methods
.method public synthetic constructor <init>(Lcom/ibotta/android/mvp/ui/dialog/CustomBottomSheetDialog;Lcom/ibotta/android/mvp/ui/dialog/CustomBottomSheetDialog$CustomBottomSheetOption;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/dialog/-$$Lambda$CustomBottomSheetDialog$IlNX39KLW4gSnqnGQQqJRL0B478;->f$0:Lcom/ibotta/android/mvp/ui/dialog/CustomBottomSheetDialog;

    iput-object p2, p0, Lcom/ibotta/android/mvp/ui/dialog/-$$Lambda$CustomBottomSheetDialog$IlNX39KLW4gSnqnGQQqJRL0B478;->f$1:Lcom/ibotta/android/mvp/ui/dialog/CustomBottomSheetDialog$CustomBottomSheetOption;

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 2

    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/dialog/-$$Lambda$CustomBottomSheetDialog$IlNX39KLW4gSnqnGQQqJRL0B478;->f$0:Lcom/ibotta/android/mvp/ui/dialog/CustomBottomSheetDialog;

    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/dialog/-$$Lambda$CustomBottomSheetDialog$IlNX39KLW4gSnqnGQQqJRL0B478;->f$1:Lcom/ibotta/android/mvp/ui/dialog/CustomBottomSheetDialog$CustomBottomSheetOption;

    invoke-static {v0, v1, p1}, Lcom/ibotta/android/mvp/ui/dialog/CustomBottomSheetDialog;->lambda$createOptionView$0(Lcom/ibotta/android/mvp/ui/dialog/CustomBottomSheetDialog;Lcom/ibotta/android/mvp/ui/dialog/CustomBottomSheetDialog$CustomBottomSheetOption;Landroid/view/View;)V

    return-void
.end method
