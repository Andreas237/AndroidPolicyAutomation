.class public Lcom/shopkick/app/widget/AuthV3EditText;
.super Lcom/shopkick/app/widget/SKEditText;
.source "AuthV3EditText.java"


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 0

    .line 11
    invoke-direct {p0, p1}, Lcom/shopkick/app/widget/SKEditText;-><init>(Landroid/content/Context;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 0

    .line 15
    invoke-direct {p0, p1, p2}, Lcom/shopkick/app/widget/SKEditText;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 0

    .line 19
    invoke-direct {p0, p1, p2, p3}, Lcom/shopkick/app/widget/SKEditText;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    return-void
.end method


# virtual methods
.method public markError()V
    .locals 1

    const v0, 0x7f080069

    .line 23
    invoke-virtual {p0, v0}, Lcom/shopkick/app/widget/AuthV3EditText;->setBackgroundResource(I)V

    return-void
.end method

.method public markNoError()V
    .locals 1

    const v0, 0x7f08006a

    .line 27
    invoke-virtual {p0, v0}, Lcom/shopkick/app/widget/AuthV3EditText;->setBackgroundResource(I)V

    return-void
.end method
