.class public Lcom/shopkick/app/util/FrameConfigurator$MultilineEllipsisPreDrawListener;
.super Ljava/lang/Object;
.source "FrameConfigurator.java"

# interfaces
.implements Landroid/view/ViewTreeObserver$OnPreDrawListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/shopkick/app/util/FrameConfigurator;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "MultilineEllipsisPreDrawListener"
.end annotation


# static fields
.field public static final DELIMITER_STRING:Ljava/lang/String; = "  "

.field public static final ELLIPSIS_STRING:Ljava/lang/String; = "..."


# instance fields
.field protected delimiterString:Ljava/lang/String;

.field private ellipsisString:Ljava/lang/String;

.field private quantityString:Ljava/lang/String;

.field private textViewRef:Ljava/lang/ref/WeakReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ref/WeakReference<",
            "Landroid/widget/TextView;",
            ">;"
        }
    .end annotation
.end field

.field private title:Ljava/lang/String;


# direct methods
.method public constructor <init>(Landroid/widget/TextView;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    .line 293
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 294
    new-instance v0, Ljava/lang/ref/WeakReference;

    invoke-direct {v0, p1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object v0, p0, Lcom/shopkick/app/util/FrameConfigurator$MultilineEllipsisPreDrawListener;->textViewRef:Ljava/lang/ref/WeakReference;

    .line 295
    iput-object p2, p0, Lcom/shopkick/app/util/FrameConfigurator$MultilineEllipsisPreDrawListener;->title:Ljava/lang/String;

    .line 296
    iput-object p3, p0, Lcom/shopkick/app/util/FrameConfigurator$MultilineEllipsisPreDrawListener;->quantityString:Ljava/lang/String;

    .line 297
    iput-object p4, p0, Lcom/shopkick/app/util/FrameConfigurator$MultilineEllipsisPreDrawListener;->ellipsisString:Ljava/lang/String;

    .line 298
    iput-object p5, p0, Lcom/shopkick/app/util/FrameConfigurator$MultilineEllipsisPreDrawListener;->delimiterString:Ljava/lang/String;

    .line 300
    invoke-virtual {p0, p3}, Lcom/shopkick/app/util/FrameConfigurator$MultilineEllipsisPreDrawListener;->generateNoWrapString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p3

    invoke-virtual {p0, p1, p2, p2, p3}, Lcom/shopkick/app/util/FrameConfigurator$MultilineEllipsisPreDrawListener;->getSpannableStringBuilder(Landroid/widget/TextView;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/text/SpannableStringBuilder;

    move-result-object p2

    invoke-virtual {p1, p2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    return-void
.end method


# virtual methods
.method protected generateNoWrapString(Ljava/lang/String;)Ljava/lang/String;
    .locals 2

    const-string v0, " "

    const-string/jumbo v1, "\u00a0"

    .line 338
    invoke-virtual {p1, v0, v1}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method protected getSpannableStringBuilder(Landroid/widget/TextView;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/text/SpannableStringBuilder;
    .locals 2

    .line 345
    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v0, p0, Lcom/shopkick/app/util/FrameConfigurator$MultilineEllipsisPreDrawListener;->delimiterString:Ljava/lang/String;

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2, p4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    .line 346
    new-instance p4, Landroid/text/SpannableStringBuilder;

    invoke-direct {p4, p2}, Landroid/text/SpannableStringBuilder;-><init>(Ljava/lang/CharSequence;)V

    .line 347
    new-instance v0, Landroid/text/style/ForegroundColorSpan;

    invoke-virtual {p1}, Landroid/widget/TextView;->getContext()Landroid/content/Context;

    move-result-object p1

    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object p1

    const v1, 0x7f0600c7

    invoke-virtual {p1, v1}, Landroid/content/res/Resources;->getColor(I)I

    move-result p1

    invoke-direct {v0, p1}, Landroid/text/style/ForegroundColorSpan;-><init>(I)V

    .line 348
    invoke-virtual {p3}, Ljava/lang/String;->length()I

    move-result p1

    .line 349
    invoke-virtual {p2}, Ljava/lang/String;->length()I

    move-result p2

    const/4 p3, 0x0

    .line 347
    invoke-virtual {p4, v0, p1, p2, p3}, Landroid/text/SpannableStringBuilder;->setSpan(Ljava/lang/Object;III)V

    return-object p4
.end method

.method public onPreDraw()Z
    .locals 8

    .line 305
    iget-object v0, p0, Lcom/shopkick/app/util/FrameConfigurator$MultilineEllipsisPreDrawListener;->textViewRef:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    const/4 v1, 0x1

    if-eqz v0, :cond_4

    .line 306
    iget-object v2, p0, Lcom/shopkick/app/util/FrameConfigurator$MultilineEllipsisPreDrawListener;->title:Ljava/lang/String;

    if-eqz v2, :cond_4

    iget-object v2, p0, Lcom/shopkick/app/util/FrameConfigurator$MultilineEllipsisPreDrawListener;->quantityString:Ljava/lang/String;

    if-nez v2, :cond_0

    goto/16 :goto_1

    .line 309
    :cond_0
    invoke-virtual {v0}, Landroid/widget/TextView;->getViewTreeObserver()Landroid/view/ViewTreeObserver;

    move-result-object v2

    invoke-virtual {v2, p0}, Landroid/view/ViewTreeObserver;->removeOnPreDrawListener(Landroid/view/ViewTreeObserver$OnPreDrawListener;)V

    .line 312
    invoke-virtual {v0}, Landroid/widget/TextView;->getLayout()Landroid/text/Layout;

    move-result-object v2

    if-nez v2, :cond_1

    return v1

    .line 315
    :cond_1
    invoke-virtual {v0}, Landroid/widget/TextView;->getLineCount()I

    move-result v3

    sub-int/2addr v3, v1

    invoke-virtual {v2, v3}, Landroid/text/Layout;->getEllipsisCount(I)I

    move-result v3

    if-gtz v3, :cond_2

    return v1

    :cond_2
    const/4 v3, 0x0

    move v4, v3

    move v5, v4

    .line 320
    :goto_0
    invoke-virtual {v0}, Landroid/widget/TextView;->getLineCount()I

    move-result v6

    sub-int/2addr v6, v1

    if-ge v4, v6, :cond_3

    .line 321
    invoke-virtual {v2, v4}, Landroid/text/Layout;->getLineEnd(I)I

    move-result v6

    invoke-virtual {v2, v4}, Landroid/text/Layout;->getLineStart(I)I

    move-result v7

    sub-int/2addr v6, v7

    add-int/2addr v5, v6

    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    .line 323
    :cond_3
    invoke-virtual {v0}, Landroid/widget/TextView;->getLayout()Landroid/text/Layout;

    move-result-object v2

    invoke-virtual {v0}, Landroid/widget/TextView;->getLineCount()I

    move-result v4

    sub-int/2addr v4, v1

    invoke-virtual {v2, v4}, Landroid/text/Layout;->getEllipsisStart(I)I

    move-result v1

    add-int/2addr v5, v1

    .line 324
    iget-object v1, p0, Lcom/shopkick/app/util/FrameConfigurator$MultilineEllipsisPreDrawListener;->quantityString:Ljava/lang/String;

    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result v1

    sub-int/2addr v5, v1

    .line 325
    iget-object v1, p0, Lcom/shopkick/app/util/FrameConfigurator$MultilineEllipsisPreDrawListener;->title:Ljava/lang/String;

    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result v1

    invoke-static {v1, v5}, Ljava/lang/Math;->min(II)I

    move-result v1

    .line 328
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v4, p0, Lcom/shopkick/app/util/FrameConfigurator$MultilineEllipsisPreDrawListener;->title:Ljava/lang/String;

    invoke-virtual {v4, v3, v1}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/shopkick/app/util/FrameConfigurator$MultilineEllipsisPreDrawListener;->ellipsisString:Ljava/lang/String;

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    .line 331
    iget-object v2, p0, Lcom/shopkick/app/util/FrameConfigurator$MultilineEllipsisPreDrawListener;->quantityString:Ljava/lang/String;

    invoke-virtual {p0, v2}, Lcom/shopkick/app/util/FrameConfigurator$MultilineEllipsisPreDrawListener;->generateNoWrapString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    .line 332
    iget-object v4, p0, Lcom/shopkick/app/util/FrameConfigurator$MultilineEllipsisPreDrawListener;->title:Ljava/lang/String;

    invoke-virtual {p0, v0, v4, v1, v2}, Lcom/shopkick/app/util/FrameConfigurator$MultilineEllipsisPreDrawListener;->getSpannableStringBuilder(Landroid/widget/TextView;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/text/SpannableStringBuilder;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    return v3

    :cond_4
    :goto_1
    return v1
.end method
