.class public Lhuawei/widget/HwButton;
.super Lhuawei/widget/HwTextView;
.source "SourceFile"


# static fields
.field private static final TAG:Ljava/lang/String; = "HwButton"


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    .line 34
    const/4 v0, 0x0

    invoke-direct {p0, p1, v0}, Lhuawei/widget/HwButton;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 35
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 1

    .line 38
    const/4 v0, 0x0

    invoke-direct {p0, p1, p2, v0}, Lhuawei/widget/HwButton;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 39
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 0

    .line 42
    invoke-direct {p0, p1, p2, p3}, Lhuawei/widget/HwTextView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 43
    return-void
.end method


# virtual methods
.method public setText(Ljava/lang/CharSequence;Landroid/widget/TextView$BufferType;)V
    .locals 0

    .line 47
    invoke-super {p0, p1, p2}, Lhuawei/widget/HwTextView;->setText(Ljava/lang/CharSequence;Landroid/widget/TextView$BufferType;)V

    .line 48
    invoke-virtual {p0}, Lhuawei/widget/HwButton;->requestLayout()V

    .line 49
    invoke-virtual {p0}, Lhuawei/widget/HwButton;->invalidate()V

    .line 50
    return-void
.end method
