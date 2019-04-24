.class public Lcom/huawei/phoneserviceuni/common/widget/EditTextInputFilter;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/text/InputFilter;


# instance fields
.field private maxLength:I


# direct methods
.method public constructor <init>(I)V
    .locals 0

    .line 15
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 16
    iput p1, p0, Lcom/huawei/phoneserviceuni/common/widget/EditTextInputFilter;->maxLength:I

    .line 17
    return-void
.end method


# virtual methods
.method public filter(Ljava/lang/CharSequence;IILandroid/text/Spanned;II)Ljava/lang/CharSequence;
    .locals 4

    .line 22
    iget v0, p0, Lcom/huawei/phoneserviceuni/common/widget/EditTextInputFilter;->maxLength:I

    invoke-interface {p4}, Landroid/text/Spanned;->length()I

    move-result v1

    sub-int v2, p6, p5

    sub-int/2addr v1, v2

    sub-int v3, v0, v1

    .line 23
    if-gtz v3, :cond_0

    .line 26
    const-string v0, ""

    return-object v0

    .line 28
    :cond_0
    sub-int v0, p3, p2

    if-lt v3, v0, :cond_1

    .line 30
    const/4 v0, 0x0

    return-object v0

    .line 37
    :cond_1
    add-int v0, p2, v3

    invoke-interface {p1, p2, v0}, Ljava/lang/CharSequence;->subSequence(II)Ljava/lang/CharSequence;

    move-result-object v0

    return-object v0
.end method
