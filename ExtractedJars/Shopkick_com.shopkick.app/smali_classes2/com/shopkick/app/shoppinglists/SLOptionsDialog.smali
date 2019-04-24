.class public Lcom/shopkick/app/shoppinglists/SLOptionsDialog;
.super Landroid/app/Dialog;
.source "SLOptionsDialog.java"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/shopkick/app/shoppinglists/SLOptionsDialog$RowData;,
        Lcom/shopkick/app/shoppinglists/SLOptionsDialog$RowType;
    }
.end annotation


# static fields
.field public static final ROW_STATUS_TEXT_DISABLED:D = 0.0

.field public static final ROW_STATUS_TEXT_ENABLED:D = 1.0


# instance fields
.field private DIALOG_ARROW_HEIGHT:I

.field private ITEM_HEIGHT_DP:I

.field private contentView:Landroid/view/View;

.field private optionParams:Ljava/util/HashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/HashMap<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Landroid/view/View;Ljava/util/ArrayList;Ljava/util/HashMap;)V
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/view/View;",
            "Ljava/util/ArrayList<",
            "Lcom/shopkick/app/shoppinglists/SLOptionsDialog$RowData;",
            ">;",
            "Ljava/util/HashMap<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;)V"
        }
    .end annotation

    .line 66
    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    const v1, 0x7f120216

    invoke-direct {p0, v0, v1}, Landroid/app/Dialog;-><init>(Landroid/content/Context;I)V

    const/16 v0, 0x32

    .line 24
    iput v0, p0, Lcom/shopkick/app/shoppinglists/SLOptionsDialog;->ITEM_HEIGHT_DP:I

    const/16 v0, 0x8

    .line 25
    iput v0, p0, Lcom/shopkick/app/shoppinglists/SLOptionsDialog;->DIALOG_ARROW_HEIGHT:I

    const/4 v1, 0x1

    .line 68
    invoke-virtual {p0, v1}, Lcom/shopkick/app/shoppinglists/SLOptionsDialog;->setCanceledOnTouchOutside(Z)V

    .line 70
    iput-object p3, p0, Lcom/shopkick/app/shoppinglists/SLOptionsDialog;->optionParams:Ljava/util/HashMap;

    const/4 p3, 0x0

    if-eqz p2, :cond_0

    .line 72
    invoke-virtual {p2}, Ljava/util/ArrayList;->size()I

    move-result v2

    goto :goto_0

    :cond_0
    move v2, p3

    :goto_0
    const/4 v3, 0x2

    .line 75
    new-array v3, v3, [I

    .line 76
    invoke-virtual {p0}, Lcom/shopkick/app/shoppinglists/SLOptionsDialog;->getContext()Landroid/content/Context;

    move-result-object v4

    invoke-static {v4}, Lcom/shopkick/app/util/FrameConfigurator;->maxScreenHeight(Landroid/content/Context;)I

    move-result v4

    .line 77
    iget v5, p0, Lcom/shopkick/app/shoppinglists/SLOptionsDialog;->ITEM_HEIGHT_DP:I

    mul-int/2addr v5, v2

    iget v2, p0, Lcom/shopkick/app/shoppinglists/SLOptionsDialog;->DIALOG_ARROW_HEIGHT:I

    add-int/2addr v5, v2

    invoke-static {v5, p1}, Lcom/shopkick/app/util/FrameConfigurator;->pixelDimension(ILandroid/view/View;)I

    move-result v2

    .line 78
    iget v5, p0, Lcom/shopkick/app/shoppinglists/SLOptionsDialog;->DIALOG_ARROW_HEIGHT:I

    invoke-static {v5, p1}, Lcom/shopkick/app/util/FrameConfigurator;->pixelDimension(ILandroid/view/View;)I

    move-result v5

    .line 79
    invoke-virtual {p1}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    move-result-object v6

    invoke-static {v6}, Lcom/shopkick/app/util/FrameConfigurator;->getStatusBarHeight(Landroid/content/res/Resources;)I

    move-result v6

    .line 80
    invoke-virtual {p1, v3}, Landroid/view/View;->getLocationInWindow([I)V

    .line 83
    aget v7, v3, v1

    sub-int v7, v4, v7

    invoke-virtual {p1}, Landroid/view/View;->getHeight()I

    move-result v8

    sub-int/2addr v7, v8

    if-le v7, v2, :cond_1

    move v2, v1

    goto :goto_1

    :cond_1
    move v2, p3

    :goto_1
    if-eqz v2, :cond_2

    .line 86
    aget v3, v3, v1

    invoke-virtual {p1}, Landroid/view/View;->getHeight()I

    move-result v4

    add-int/2addr v3, v4

    sub-int/2addr v3, v6

    sub-int/2addr v3, v5

    goto :goto_2

    .line 88
    :cond_2
    aget v3, v3, v1

    sub-int/2addr v4, v3

    sub-int v3, v4, v5

    .line 92
    :goto_2
    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object p1

    invoke-static {p1}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object p1

    const v4, 0x7f0c01bf

    const/4 v5, 0x0

    .line 93
    invoke-virtual {p1, v4, v5}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v4

    iput-object v4, p0, Lcom/shopkick/app/shoppinglists/SLOptionsDialog;->contentView:Landroid/view/View;

    .line 95
    iget-object v4, p0, Lcom/shopkick/app/shoppinglists/SLOptionsDialog;->contentView:Landroid/view/View;

    move-object v6, v4

    check-cast v6, Landroid/view/ViewGroup;

    const v7, 0x7f090046

    .line 98
    invoke-virtual {v4, v7}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v4

    .line 99
    iget-object v7, p0, Lcom/shopkick/app/shoppinglists/SLOptionsDialog;->contentView:Landroid/view/View;

    const v8, 0x7f090047

    invoke-virtual {v7, v8}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v7

    if-eqz v2, :cond_3

    .line 101
    invoke-virtual {v4, p3}, Landroid/view/View;->setVisibility(I)V

    .line 102
    invoke-virtual {v7, v0}, Landroid/view/View;->setVisibility(I)V

    .line 103
    invoke-virtual {v4, p0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    goto :goto_3

    .line 105
    :cond_3
    invoke-virtual {v4, v0}, Landroid/view/View;->setVisibility(I)V

    .line 106
    invoke-virtual {v7, p3}, Landroid/view/View;->setVisibility(I)V

    .line 107
    invoke-virtual {v7, p0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    :goto_3
    if-nez p2, :cond_4

    return-void

    .line 115
    :cond_4
    invoke-virtual {p2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object p2

    :cond_5
    :goto_4
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result p3

    if-eqz p3, :cond_6

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p3

    check-cast p3, Lcom/shopkick/app/shoppinglists/SLOptionsDialog$RowData;

    .line 118
    sget-object v0, Lcom/shopkick/app/shoppinglists/SLOptionsDialog$1;->$SwitchMap$com$shopkick$app$shoppinglists$SLOptionsDialog$RowType:[I

    iget-object v4, p3, Lcom/shopkick/app/shoppinglists/SLOptionsDialog$RowData;->rowType:Lcom/shopkick/app/shoppinglists/SLOptionsDialog$RowType;

    invoke-virtual {v4}, Lcom/shopkick/app/shoppinglists/SLOptionsDialog$RowType;->ordinal()I

    move-result v4

    aget v0, v0, v4

    packed-switch v0, :pswitch_data_0

    move-object p3, v5

    goto :goto_5

    .line 124
    :pswitch_0
    invoke-direct {p0, p1, v6, p3}, Lcom/shopkick/app/shoppinglists/SLOptionsDialog;->inflateQuantityPicker(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Lcom/shopkick/app/shoppinglists/SLOptionsDialog$RowData;)Landroid/view/View;

    move-result-object p3

    goto :goto_5

    .line 120
    :pswitch_1
    invoke-direct {p0, p1, v6, p3}, Lcom/shopkick/app/shoppinglists/SLOptionsDialog;->inflateText(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Lcom/shopkick/app/shoppinglists/SLOptionsDialog$RowData;)Landroid/view/View;

    move-result-object p3

    :goto_5
    if-eqz p3, :cond_5

    .line 131
    invoke-virtual {v6}, Landroid/view/ViewGroup;->getChildCount()I

    move-result v0

    sub-int/2addr v0, v1

    invoke-virtual {v6, p3, v0}, Landroid/view/ViewGroup;->addView(Landroid/view/View;I)V

    goto :goto_4

    .line 136
    :cond_6
    invoke-virtual {p0}, Lcom/shopkick/app/shoppinglists/SLOptionsDialog;->getWindow()Landroid/view/Window;

    move-result-object p1

    invoke-virtual {p1}, Landroid/view/Window;->getAttributes()Landroid/view/WindowManager$LayoutParams;

    move-result-object p1

    if-eqz v2, :cond_7

    const/16 p2, 0x30

    goto :goto_6

    :cond_7
    const/16 p2, 0x50

    :goto_6
    or-int/lit8 p2, p2, 0x3

    .line 137
    iput p2, p1, Landroid/view/WindowManager$LayoutParams;->gravity:I

    .line 138
    iput v3, p1, Landroid/view/WindowManager$LayoutParams;->y:I

    return-void

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method private inflateQuantityPicker(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Lcom/shopkick/app/shoppinglists/SLOptionsDialog$RowData;)Landroid/view/View;
    .locals 2

    const v0, 0x7f0c01c0

    const/4 v1, 0x0

    .line 160
    invoke-virtual {p1, v0, p2, v1}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/view/ViewGroup;

    const p2, 0x7f090583

    .line 166
    invoke-virtual {p1, p2}, Landroid/view/ViewGroup;->findViewById(I)Landroid/view/View;

    move-result-object p2

    check-cast p2, Landroid/widget/TextView;

    iget v0, p3, Lcom/shopkick/app/shoppinglists/SLOptionsDialog$RowData;->resId:I

    invoke-virtual {p2, v0}, Landroid/widget/TextView;->setText(I)V

    const p2, 0x7f090582

    .line 167
    invoke-virtual {p1, p2}, Landroid/view/ViewGroup;->findViewById(I)Landroid/view/View;

    move-result-object p2

    check-cast p2, Landroid/widget/TextView;

    iget-object v0, p3, Lcom/shopkick/app/shoppinglists/SLOptionsDialog$RowData;->rowStatus:Ljava/lang/Double;

    invoke-virtual {v0}, Ljava/lang/Double;->intValue()I

    move-result v0

    invoke-static {v0}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p2, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    const p2, 0x7f090581

    .line 170
    invoke-virtual {p1, p2}, Landroid/view/ViewGroup;->findViewById(I)Landroid/view/View;

    move-result-object p2

    .line 171
    invoke-virtual {p2, p3}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    .line 172
    invoke-virtual {p2, p0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    const p2, 0x7f090580

    .line 174
    invoke-virtual {p1, p2}, Landroid/view/ViewGroup;->findViewById(I)Landroid/view/View;

    move-result-object p2

    .line 175
    invoke-virtual {p2, p3}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    .line 176
    invoke-virtual {p2, p0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    return-object p1
.end method

.method private inflateText(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Lcom/shopkick/app/shoppinglists/SLOptionsDialog$RowData;)Landroid/view/View;
    .locals 3

    const/4 v0, 0x0

    const v1, 0x7f0c01c1

    .line 142
    invoke-virtual {p1, v1, p2, v0}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/TextView;

    .line 146
    iget p2, p3, Lcom/shopkick/app/shoppinglists/SLOptionsDialog$RowData;->resId:I

    invoke-virtual {p1, p2}, Landroid/widget/TextView;->setText(I)V

    .line 147
    invoke-virtual {p1, p3}, Landroid/widget/TextView;->setTag(Ljava/lang/Object;)V

    .line 150
    iget-object p2, p3, Lcom/shopkick/app/shoppinglists/SLOptionsDialog$RowData;->rowStatus:Ljava/lang/Double;

    invoke-virtual {p2}, Ljava/lang/Double;->doubleValue()D

    move-result-wide p2

    const-wide/16 v1, 0x0

    cmpl-double p2, p2, v1

    if-nez p2, :cond_0

    .line 151
    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setEnabled(Z)V

    goto :goto_0

    .line 153
    :cond_0
    invoke-virtual {p1, p0}, Landroid/widget/TextView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    :goto_0
    return-object p1
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 6

    .line 189
    invoke-virtual {p1}, Landroid/view/View;->getTag()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/shopkick/app/shoppinglists/SLOptionsDialog$RowData;

    .line 190
    invoke-virtual {p1}, Landroid/view/View;->getId()I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    if-nez v0, :cond_0

    .line 193
    invoke-virtual {p0}, Lcom/shopkick/app/shoppinglists/SLOptionsDialog;->dismiss()V

    return-void

    .line 198
    :cond_0
    iget-object v2, v0, Lcom/shopkick/app/shoppinglists/SLOptionsDialog$RowData;->rowType:Lcom/shopkick/app/shoppinglists/SLOptionsDialog$RowType;

    sget-object v3, Lcom/shopkick/app/shoppinglists/SLOptionsDialog$RowType;->QUANTITY_PICKER:Lcom/shopkick/app/shoppinglists/SLOptionsDialog$RowType;

    if-ne v2, v3, :cond_2

    .line 199
    iget-object v2, v0, Lcom/shopkick/app/shoppinglists/SLOptionsDialog$RowData;->rowStatus:Ljava/lang/Double;

    invoke-virtual {v2}, Ljava/lang/Double;->doubleValue()D

    move-result-wide v2

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    const v4, 0x7f090581

    if-ne v1, v4, :cond_1

    const/4 v1, 0x1

    goto :goto_0

    :cond_1
    const/4 v1, -0x1

    :goto_0
    int-to-double v4, v1

    add-double/2addr v2, v4

    invoke-static {v2, v3}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v1

    iput-object v1, v0, Lcom/shopkick/app/shoppinglists/SLOptionsDialog$RowData;->rowStatus:Ljava/lang/Double;

    .line 200
    iget-object v1, v0, Lcom/shopkick/app/shoppinglists/SLOptionsDialog$RowData;->rowStatus:Ljava/lang/Double;

    invoke-virtual {v1}, Ljava/lang/Double;->doubleValue()D

    move-result-wide v1

    const-wide/high16 v3, 0x3ff0000000000000L    # 1.0

    invoke-static {v1, v2, v3, v4}, Ljava/lang/Math;->max(DD)D

    move-result-wide v1

    invoke-static {v1, v2}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v1

    iput-object v1, v0, Lcom/shopkick/app/shoppinglists/SLOptionsDialog$RowData;->rowStatus:Ljava/lang/Double;

    .line 202
    invoke-virtual {p1}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object v1

    check-cast v1, Landroid/view/View;

    const v2, 0x7f090582

    .line 203
    invoke-virtual {v1, v2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/widget/TextView;

    .line 204
    iget-object v2, v0, Lcom/shopkick/app/shoppinglists/SLOptionsDialog$RowData;->rowStatus:Ljava/lang/Double;

    invoke-virtual {v2}, Ljava/lang/Double;->intValue()I

    move-result v2

    invoke-static {v2}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 207
    :cond_2
    iget-object v1, p0, Lcom/shopkick/app/shoppinglists/SLOptionsDialog;->optionParams:Ljava/util/HashMap;

    invoke-virtual {p0, p1, v0, v1}, Lcom/shopkick/app/shoppinglists/SLOptionsDialog;->onClick(Landroid/view/View;Lcom/shopkick/app/shoppinglists/SLOptionsDialog$RowData;Ljava/util/HashMap;)V

    .line 210
    iget-object p1, v0, Lcom/shopkick/app/shoppinglists/SLOptionsDialog$RowData;->rowType:Lcom/shopkick/app/shoppinglists/SLOptionsDialog$RowType;

    sget-object v0, Lcom/shopkick/app/shoppinglists/SLOptionsDialog$RowType;->QUANTITY_PICKER:Lcom/shopkick/app/shoppinglists/SLOptionsDialog$RowType;

    if-eq p1, v0, :cond_3

    .line 211
    invoke-virtual {p0}, Lcom/shopkick/app/shoppinglists/SLOptionsDialog;->dismiss()V

    :cond_3
    return-void
.end method

.method public onClick(Landroid/view/View;Lcom/shopkick/app/shoppinglists/SLOptionsDialog$RowData;Ljava/util/HashMap;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/view/View;",
            "Lcom/shopkick/app/shoppinglists/SLOptionsDialog$RowData;",
            "Ljava/util/HashMap<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;)V"
        }
    .end annotation

    return-void
.end method

.method protected onCreate(Landroid/os/Bundle;)V
    .locals 0

    .line 183
    invoke-super {p0, p1}, Landroid/app/Dialog;->onCreate(Landroid/os/Bundle;)V

    .line 184
    iget-object p1, p0, Lcom/shopkick/app/shoppinglists/SLOptionsDialog;->contentView:Landroid/view/View;

    invoke-virtual {p0, p1}, Lcom/shopkick/app/shoppinglists/SLOptionsDialog;->setContentView(Landroid/view/View;)V

    return-void
.end method
