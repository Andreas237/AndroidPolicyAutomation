.class final Luk/co/chrisjenx/calligraphy/CalligraphyUtils$1;
.super Ljava/lang/Object;
.source "CalligraphyUtils.java"

# interfaces
.implements Landroid/text/TextWatcher;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Luk/co/chrisjenx/calligraphy/CalligraphyUtils;->applyFontToTextView(Landroid/widget/TextView;Landroid/graphics/Typeface;Z)Z
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = null
.end annotation


# instance fields
.field final synthetic val$typeface:Landroid/graphics/Typeface;


# direct methods
.method constructor <init>(Landroid/graphics/Typeface;)V
    .locals 0

    .prologue
    .line 80
    iput-object p1, p0, Luk/co/chrisjenx/calligraphy/CalligraphyUtils$1;->val$typeface:Landroid/graphics/Typeface;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public afterTextChanged(Landroid/text/Editable;)V
    .locals 1
    .param p1, "s"    # Landroid/text/Editable;

    .prologue
    .line 91
    iget-object v0, p0, Luk/co/chrisjenx/calligraphy/CalligraphyUtils$1;->val$typeface:Landroid/graphics/Typeface;

    invoke-static {p1, v0}, Luk/co/chrisjenx/calligraphy/CalligraphyUtils;->applyTypefaceSpan(Ljava/lang/CharSequence;Landroid/graphics/Typeface;)Ljava/lang/CharSequence;

    .line 92
    return-void
.end method

.method public beforeTextChanged(Ljava/lang/CharSequence;III)V
    .locals 0
    .param p1, "s"    # Ljava/lang/CharSequence;
    .param p2, "start"    # I
    .param p3, "count"    # I
    .param p4, "after"    # I

    .prologue
    .line 83
    return-void
.end method

.method public onTextChanged(Ljava/lang/CharSequence;III)V
    .locals 0
    .param p1, "s"    # Ljava/lang/CharSequence;
    .param p2, "start"    # I
    .param p3, "before"    # I
    .param p4, "count"    # I

    .prologue
    .line 87
    return-void
.end method
