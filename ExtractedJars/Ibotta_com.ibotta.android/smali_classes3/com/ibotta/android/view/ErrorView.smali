.class public Lcom/ibotta/android/view/ErrorView;
.super Landroid/widget/RelativeLayout;
.source "ErrorView.java"


# annotations
.annotation build Lcom/newrelic/agent/android/instrumentation/Instrumented;
.end annotation


# instance fields
.field private bClose:Landroid/widget/Button;

.field private tvError:Landroid/widget/TextView;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 0

    .line 27
    invoke-direct {p0, p1}, Landroid/widget/RelativeLayout;-><init>(Landroid/content/Context;)V

    .line 28
    invoke-direct {p0, p1}, Lcom/ibotta/android/view/ErrorView;->inflateContent(Landroid/content/Context;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 0

    .line 22
    invoke-direct {p0, p1, p2}, Landroid/widget/RelativeLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 23
    invoke-direct {p0, p1}, Lcom/ibotta/android/view/ErrorView;->inflateContent(Landroid/content/Context;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 0

    .line 17
    invoke-direct {p0, p1, p2, p3}, Landroid/widget/RelativeLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 18
    invoke-direct {p0, p1}, Lcom/ibotta/android/view/ErrorView;->inflateContent(Landroid/content/Context;)V

    return-void
.end method

.method private inflateContent(Landroid/content/Context;)V
    .locals 1

    const-string v0, "layout_inflater"

    .line 41
    invoke-virtual {p1, v0}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroid/view/LayoutInflater;

    const v0, 0x7f0c0155

    .line 42
    invoke-virtual {p1, v0, p0}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    const p1, 0x7f09051f

    .line 43
    invoke-virtual {p0, p1}, Lcom/ibotta/android/view/ErrorView;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/TextView;

    iput-object p1, p0, Lcom/ibotta/android/view/ErrorView;->tvError:Landroid/widget/TextView;

    const p1, 0x7f090081

    .line 44
    invoke-virtual {p0, p1}, Lcom/ibotta/android/view/ErrorView;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/Button;

    iput-object p1, p0, Lcom/ibotta/android/view/ErrorView;->bClose:Landroid/widget/Button;

    return-void
.end method


# virtual methods
.method public getError()Landroid/widget/TextView;
    .locals 1

    .line 32
    iget-object v0, p0, Lcom/ibotta/android/view/ErrorView;->tvError:Landroid/widget/TextView;

    return-object v0
.end method

.method public setOnClickListener(Landroid/view/View$OnClickListener;)V
    .locals 2

    .line 37
    iget-object v0, p0, Lcom/ibotta/android/view/ErrorView;->bClose:Landroid/widget/Button;

    instance-of v1, v0, Landroid/view/View;

    if-nez v1, :cond_0

    invoke-virtual {v0, p1}, Landroid/widget/Button;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    goto :goto_0

    :cond_0
    check-cast v0, Landroid/view/View;

    invoke-static {v0, p1}, Lcom/newrelic/agent/android/instrumentation/ViewInstrumentation;->setOnClickListener(Landroid/view/View;Landroid/view/View$OnClickListener;)V

    :goto_0
    return-void
.end method
