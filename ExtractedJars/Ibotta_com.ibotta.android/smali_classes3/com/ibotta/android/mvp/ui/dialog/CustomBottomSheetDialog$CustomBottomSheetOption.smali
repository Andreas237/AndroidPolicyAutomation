.class public Lcom/ibotta/android/mvp/ui/dialog/CustomBottomSheetDialog$CustomBottomSheetOption;
.super Ljava/lang/Object;
.source "CustomBottomSheetDialog.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/ibotta/android/mvp/ui/dialog/CustomBottomSheetDialog;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "CustomBottomSheetOption"
.end annotation


# instance fields
.field private iconResId:I

.field private id:I

.field private optionText:Ljava/lang/String;

.field private optionTextResId:I


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 39
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method static synthetic access$000(Lcom/ibotta/android/mvp/ui/dialog/CustomBottomSheetDialog$CustomBottomSheetOption;)Ljava/lang/String;
    .locals 0

    .line 39
    iget-object p0, p0, Lcom/ibotta/android/mvp/ui/dialog/CustomBottomSheetDialog$CustomBottomSheetOption;->optionText:Ljava/lang/String;

    return-object p0
.end method


# virtual methods
.method public getIconResId()I
    .locals 1

    .line 54
    iget v0, p0, Lcom/ibotta/android/mvp/ui/dialog/CustomBottomSheetDialog$CustomBottomSheetOption;->iconResId:I

    return v0
.end method

.method public getId()I
    .locals 1

    .line 46
    iget v0, p0, Lcom/ibotta/android/mvp/ui/dialog/CustomBottomSheetDialog$CustomBottomSheetOption;->id:I

    return v0
.end method

.method public getOptionText()Ljava/lang/String;
    .locals 1

    .line 70
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/dialog/CustomBottomSheetDialog$CustomBottomSheetOption;->optionText:Ljava/lang/String;

    return-object v0
.end method

.method public getOptionTextResId()I
    .locals 1

    .line 62
    iget v0, p0, Lcom/ibotta/android/mvp/ui/dialog/CustomBottomSheetDialog$CustomBottomSheetOption;->optionTextResId:I

    return v0
.end method

.method public setIconResId(I)V
    .locals 0

    .line 58
    iput p1, p0, Lcom/ibotta/android/mvp/ui/dialog/CustomBottomSheetDialog$CustomBottomSheetOption;->iconResId:I

    return-void
.end method

.method public setId(I)V
    .locals 0

    .line 50
    iput p1, p0, Lcom/ibotta/android/mvp/ui/dialog/CustomBottomSheetDialog$CustomBottomSheetOption;->id:I

    return-void
.end method

.method public setOptionText(Ljava/lang/String;)V
    .locals 0

    .line 74
    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/dialog/CustomBottomSheetDialog$CustomBottomSheetOption;->optionText:Ljava/lang/String;

    return-void
.end method

.method public setOptionTextResId(I)V
    .locals 0

    .line 66
    iput p1, p0, Lcom/ibotta/android/mvp/ui/dialog/CustomBottomSheetDialog$CustomBottomSheetOption;->optionTextResId:I

    return-void
.end method
