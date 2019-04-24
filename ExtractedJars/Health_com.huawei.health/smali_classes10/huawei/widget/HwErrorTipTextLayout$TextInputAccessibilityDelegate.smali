.class Lhuawei/widget/HwErrorTipTextLayout$TextInputAccessibilityDelegate;
.super Landroid/view/View$AccessibilityDelegate;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lhuawei/widget/HwErrorTipTextLayout;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = "TextInputAccessibilityDelegate"
.end annotation


# instance fields
.field final synthetic this$0:Lhuawei/widget/HwErrorTipTextLayout;


# direct methods
.method private constructor <init>(Lhuawei/widget/HwErrorTipTextLayout;)V
    .locals 0

    .line 337
    iput-object p1, p0, Lhuawei/widget/HwErrorTipTextLayout$TextInputAccessibilityDelegate;->this$0:Lhuawei/widget/HwErrorTipTextLayout;

    invoke-direct {p0}, Landroid/view/View$AccessibilityDelegate;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lhuawei/widget/HwErrorTipTextLayout;Lhuawei/widget/HwErrorTipTextLayout$1;)V
    .locals 0

    .line 337
    invoke-direct {p0, p1}, Lhuawei/widget/HwErrorTipTextLayout$TextInputAccessibilityDelegate;-><init>(Lhuawei/widget/HwErrorTipTextLayout;)V

    return-void
.end method


# virtual methods
.method public onInitializeAccessibilityEvent(Landroid/view/View;Landroid/view/accessibility/AccessibilityEvent;)V
    .locals 1

    .line 341
    invoke-super {p0, p1, p2}, Landroid/view/View$AccessibilityDelegate;->onInitializeAccessibilityEvent(Landroid/view/View;Landroid/view/accessibility/AccessibilityEvent;)V

    .line 342
    const-class v0, Lhuawei/widget/HwErrorTipTextLayout;

    invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p2, v0}, Landroid/view/accessibility/AccessibilityEvent;->setClassName(Ljava/lang/CharSequence;)V

    .line 343
    return-void
.end method

.method public onPopulateAccessibilityEvent(Landroid/view/View;Landroid/view/accessibility/AccessibilityEvent;)V
    .locals 0

    .line 348
    invoke-super {p0, p1, p2}, Landroid/view/View$AccessibilityDelegate;->onPopulateAccessibilityEvent(Landroid/view/View;Landroid/view/accessibility/AccessibilityEvent;)V

    .line 349
    return-void
.end method
