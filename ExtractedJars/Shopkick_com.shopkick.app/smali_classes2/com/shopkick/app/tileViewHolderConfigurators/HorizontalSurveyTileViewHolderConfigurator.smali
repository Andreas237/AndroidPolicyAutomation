.class public Lcom/shopkick/app/tileViewHolderConfigurators/HorizontalSurveyTileViewHolderConfigurator;
.super Lcom/shopkick/app/tileViewHolderConfigurators/ViewHolderConfigurator;
.source "HorizontalSurveyTileViewHolderConfigurator.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/shopkick/app/tileViewHolderConfigurators/HorizontalSurveyTileViewHolderConfigurator$SurveyState;
    }
.end annotation


# instance fields
.field private clientFlagsManager:Lcom/shopkick/app/application/ClientFlagsManager;

.field private state:Lcom/shopkick/app/tileViewHolderConfigurators/HorizontalSurveyTileViewHolderConfigurator$SurveyState;

.field private urlDispatcher:Lcom/shopkick/app/url/URLDispatcher;

.field private weakRefContext:Ljava/lang/ref/WeakReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ref/WeakReference<",
            "Landroid/content/Context;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Landroid/content/Context;Lcom/shopkick/app/application/ClientFlagsManager;Lcom/shopkick/app/url/URLDispatcher;)V
    .locals 1

    .line 62
    invoke-direct {p0}, Lcom/shopkick/app/tileViewHolderConfigurators/ViewHolderConfigurator;-><init>()V

    .line 63
    new-instance v0, Ljava/lang/ref/WeakReference;

    invoke-direct {v0, p1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object v0, p0, Lcom/shopkick/app/tileViewHolderConfigurators/HorizontalSurveyTileViewHolderConfigurator;->weakRefContext:Ljava/lang/ref/WeakReference;

    .line 64
    sget-object p1, Lcom/shopkick/app/tileViewHolderConfigurators/HorizontalSurveyTileViewHolderConfigurator$SurveyState;->ERROR:Lcom/shopkick/app/tileViewHolderConfigurators/HorizontalSurveyTileViewHolderConfigurator$SurveyState;

    iput-object p1, p0, Lcom/shopkick/app/tileViewHolderConfigurators/HorizontalSurveyTileViewHolderConfigurator;->state:Lcom/shopkick/app/tileViewHolderConfigurators/HorizontalSurveyTileViewHolderConfigurator$SurveyState;

    .line 66
    iput-object p2, p0, Lcom/shopkick/app/tileViewHolderConfigurators/HorizontalSurveyTileViewHolderConfigurator;->clientFlagsManager:Lcom/shopkick/app/application/ClientFlagsManager;

    .line 67
    iput-object p3, p0, Lcom/shopkick/app/tileViewHolderConfigurators/HorizontalSurveyTileViewHolderConfigurator;->urlDispatcher:Lcom/shopkick/app/url/URLDispatcher;

    return-void
.end method

.method public static synthetic lambda$setOnClick$43(Lcom/shopkick/app/tileViewHolderConfigurators/HorizontalSurveyTileViewHolderConfigurator;Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;Landroid/view/View;)V
    .locals 3

    .line 239
    iget-object p2, p1, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->surveyTileStatus:Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    sget-object v0, Lcom/shopkick/app/tileViewHolderConfigurators/HorizontalSurveyTileViewHolderConfigurator$SurveyState;->READY:Lcom/shopkick/app/tileViewHolderConfigurators/HorizontalSurveyTileViewHolderConfigurator$SurveyState;

    invoke-virtual {v0}, Lcom/shopkick/app/tileViewHolderConfigurators/HorizontalSurveyTileViewHolderConfigurator$SurveyState;->ordinal()I

    move-result v0

    if-eq p2, v0, :cond_0

    return-void

    .line 245
    :cond_0
    iget-object p2, p0, Lcom/shopkick/app/tileViewHolderConfigurators/HorizontalSurveyTileViewHolderConfigurator;->weakRefContext:Ljava/lang/ref/WeakReference;

    invoke-static {p2}, Lcom/shopkick/app/util/NullUtils;->isNull(Ljava/lang/ref/WeakReference;)Z

    move-result p2

    if-nez p2, :cond_1

    return-void

    .line 248
    :cond_1
    iget-object p2, p0, Lcom/shopkick/app/tileViewHolderConfigurators/HorizontalSurveyTileViewHolderConfigurator;->weakRefContext:Ljava/lang/ref/WeakReference;

    invoke-virtual {p2}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lcom/shopkick/app/activities/BaseActivity;

    .line 251
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    :try_start_0
    const-string/jumbo v1, "tile_info"

    .line 253
    invoke-virtual {p1}, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, v1, p1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 254
    new-instance p1, Lcom/shopkick/app/activities/PageIdentifierV2;

    .line 256
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    const-class v2, Lcom/shopkick/app/surveys/PreSurveyScreen;

    invoke-direct {p1, v1, v2, v0}, Lcom/shopkick/app/activities/PageIdentifierV2;-><init>(Ljava/lang/Class;Ljava/lang/Class;Ljava/util/Map;)V

    .line 254
    invoke-virtual {p2, p1}, Lcom/shopkick/app/activities/BaseActivity;->goToScreenForPageIdentifierV2(Lcom/shopkick/app/activities/PageIdentifierV2;)Z
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    return-void
.end method

.method private varargs setAllGone([Landroid/view/View;)V
    .locals 4

    .line 268
    array-length v0, p1

    const/4 v1, 0x0

    :goto_0
    if-ge v1, v0, :cond_0

    aget-object v2, p1, v1

    const/16 v3, 0x8

    .line 269
    invoke-virtual {v2, v3}, Landroid/view/View;->setVisibility(I)V

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_0
    return-void
.end method

.method private setCompletedInfo(Landroid/content/Context;ILandroid/widget/ImageView;Lcom/shopkick/app/widget/SKTextView;)V
    .locals 2

    const/4 v0, 0x0

    .line 160
    invoke-virtual {p3, v0}, Landroid/widget/ImageView;->setVisibility(I)V

    const v1, 0x7f08018d

    .line 161
    invoke-virtual {p1, v1}, Landroid/content/Context;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v1

    invoke-virtual {p3, v1}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 162
    invoke-virtual {p4, v0}, Lcom/shopkick/app/widget/SKTextView;->setVisibility(I)V

    .line 163
    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object p1

    const/4 p3, 0x1

    new-array p3, p3, [Ljava/lang/Object;

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    aput-object v1, p3, v0

    const v0, 0x7f0f0012

    invoke-virtual {p1, v0, p2, p3}, Landroid/content/res/Resources;->getQuantityString(II[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p4, p1}, Lcom/shopkick/app/widget/SKTextView;->setText(Ljava/lang/String;)V

    return-void
.end method

.method private setErrorInfo(Landroid/content/Context;Landroid/widget/ImageView;Lcom/shopkick/app/widget/SKTextView;)V
    .locals 2

    const/4 v0, 0x0

    .line 167
    invoke-virtual {p2, v0}, Landroid/widget/ImageView;->setVisibility(I)V

    const v1, 0x7f0802e5

    .line 168
    invoke-virtual {p1, v1}, Landroid/content/Context;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v1

    invoke-virtual {p2, v1}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 169
    invoke-virtual {p3, v0}, Lcom/shopkick/app/widget/SKTextView;->setVisibility(I)V

    const p2, 0x7f1106f6

    .line 170
    invoke-virtual {p1, p2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p3, p1}, Lcom/shopkick/app/widget/SKTextView;->setText(Ljava/lang/String;)V

    return-void
.end method

.method private setKickAmount(Landroid/content/Context;ILcom/shopkick/app/widget/SKTextView;)V
    .locals 3

    const/4 v0, 0x0

    .line 138
    invoke-virtual {p3, v0}, Lcom/shopkick/app/widget/SKTextView;->setVisibility(I)V

    .line 139
    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object p1

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    aput-object v2, v1, v0

    const v0, 0x7f0f0012

    invoke-virtual {p1, v0, p2, v1}, Landroid/content/res/Resources;->getQuantityString(II[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p3, p1}, Lcom/shopkick/app/widget/SKTextView;->setText(Ljava/lang/String;)V

    return-void
.end method

.method private setMainImgBackgroundColors(Landroid/content/Context;Lcom/shopkick/app/logging/UserEventImageView;)V
    .locals 5

    const/4 v0, 0x0

    .line 174
    invoke-virtual {p2, v0}, Lcom/shopkick/app/logging/UserEventImageView;->setVisibility(I)V

    .line 181
    sget-object v1, Lcom/shopkick/app/tileViewHolderConfigurators/HorizontalSurveyTileViewHolderConfigurator$1;->$SwitchMap$com$shopkick$app$tileViewHolderConfigurators$HorizontalSurveyTileViewHolderConfigurator$SurveyState:[I

    iget-object v2, p0, Lcom/shopkick/app/tileViewHolderConfigurators/HorizontalSurveyTileViewHolderConfigurator;->state:Lcom/shopkick/app/tileViewHolderConfigurators/HorizontalSurveyTileViewHolderConfigurator$SurveyState;

    invoke-virtual {v2}, Lcom/shopkick/app/tileViewHolderConfigurators/HorizontalSurveyTileViewHolderConfigurator$SurveyState;->ordinal()I

    move-result v2

    aget v1, v1, v2

    const v2, 0x7f0802eb

    packed-switch v1, :pswitch_data_0

    const v1, 0x7f060121

    .line 199
    invoke-virtual {p1, v1}, Landroid/content/Context;->getColor(I)I

    move-result v2

    .line 200
    invoke-virtual {p1, v1}, Landroid/content/Context;->getColor(I)I

    move-result v1

    const v3, 0x7f0802ea

    .line 201
    invoke-virtual {p1, v3}, Landroid/content/Context;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object p1

    move v3, v1

    move v1, v2

    goto :goto_0

    :pswitch_0
    const v1, 0x7f060128

    .line 193
    invoke-virtual {p1, v1}, Landroid/content/Context;->getColor(I)I

    move-result v1

    const v2, 0x7f060127

    .line 194
    invoke-virtual {p1, v2}, Landroid/content/Context;->getColor(I)I

    move-result v2

    const v3, 0x7f0802e8

    .line 195
    invoke-virtual {p1, v3}, Landroid/content/Context;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object p1

    move v3, v2

    goto :goto_0

    :pswitch_1
    const v1, 0x7f06012a

    .line 188
    invoke-virtual {p1, v1}, Landroid/content/Context;->getColor(I)I

    move-result v1

    const v3, 0x7f060129

    .line 189
    invoke-virtual {p1, v3}, Landroid/content/Context;->getColor(I)I

    move-result v3

    .line 190
    invoke-virtual {p1, v2}, Landroid/content/Context;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object p1

    goto :goto_0

    :pswitch_2
    const v1, 0x7f06012c

    .line 183
    invoke-virtual {p1, v1}, Landroid/content/Context;->getColor(I)I

    move-result v1

    const v3, 0x7f06012b

    .line 184
    invoke-virtual {p1, v3}, Landroid/content/Context;->getColor(I)I

    move-result v3

    .line 185
    invoke-virtual {p1, v2}, Landroid/content/Context;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object p1

    .line 208
    :goto_0
    invoke-virtual {p2}, Lcom/shopkick/app/logging/UserEventImageView;->getBackground()Landroid/graphics/drawable/Drawable;

    move-result-object v2

    check-cast v2, Landroid/graphics/drawable/RippleDrawable;

    invoke-virtual {v2, v0}, Landroid/graphics/drawable/RippleDrawable;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v0

    check-cast v0, Landroid/graphics/drawable/LayerDrawable;

    const v2, 0x7f09079b

    .line 210
    invoke-virtual {v0, v2}, Landroid/graphics/drawable/LayerDrawable;->findDrawableByLayerId(I)Landroid/graphics/drawable/Drawable;

    move-result-object v2

    check-cast v2, Landroid/graphics/drawable/GradientDrawable;

    const v4, 0x7f090099

    .line 211
    invoke-virtual {v0, v4}, Landroid/graphics/drawable/LayerDrawable;->findDrawableByLayerId(I)Landroid/graphics/drawable/Drawable;

    move-result-object v0

    check-cast v0, Landroid/graphics/drawable/GradientDrawable;

    .line 213
    invoke-virtual {p2, p1}, Lcom/shopkick/app/logging/UserEventImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 214
    invoke-virtual {v2, v1}, Landroid/graphics/drawable/GradientDrawable;->setColor(I)V

    .line 215
    invoke-virtual {v0, v3}, Landroid/graphics/drawable/GradientDrawable;->setColor(I)V

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method private setOnClick(Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;)V
    .locals 3

    .line 220
    iget-object v0, p0, Lcom/shopkick/app/tileViewHolderConfigurators/HorizontalSurveyTileViewHolderConfigurator;->clientFlagsManager:Lcom/shopkick/app/application/ClientFlagsManager;

    invoke-static {v0}, Lcom/shopkick/app/util/FeatureFlagHelper;->areProgrammaticSurveysEnabled(Lcom/shopkick/app/application/ClientFlagsManager;)Z

    move-result v0

    const/4 v1, 0x0

    if-nez v0, :cond_0

    .line 221
    iget-object p2, p1, Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;->itemView:Landroid/view/View;

    const/4 v0, 0x0

    invoke-virtual {p2, v0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 222
    iget-object p1, p1, Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;->itemView:Landroid/view/View;

    invoke-virtual {p1, v1}, Landroid/view/View;->setClickable(Z)V

    return-void

    .line 226
    :cond_0
    iget-object v0, p0, Lcom/shopkick/app/tileViewHolderConfigurators/HorizontalSurveyTileViewHolderConfigurator;->weakRefContext:Ljava/lang/ref/WeakReference;

    if-eqz v0, :cond_2

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    if-nez v0, :cond_1

    goto :goto_0

    .line 231
    :cond_1
    iget-object v0, p1, Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;->itemView:Landroid/view/View;

    new-instance v1, Lcom/shopkick/app/util/CommonClickUtils$SurveyTileClickListener;

    iget-object v2, p0, Lcom/shopkick/app/tileViewHolderConfigurators/HorizontalSurveyTileViewHolderConfigurator;->urlDispatcher:Lcom/shopkick/app/url/URLDispatcher;

    invoke-direct {v1, v2, p2}, Lcom/shopkick/app/util/CommonClickUtils$SurveyTileClickListener;-><init>(Lcom/shopkick/app/url/URLDispatcher;Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;)V

    invoke-virtual {v0, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 238
    iget-object p1, p1, Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;->itemView:Landroid/view/View;

    new-instance v0, Lcom/shopkick/app/tileViewHolderConfigurators/-$$Lambda$HorizontalSurveyTileViewHolderConfigurator$b88R0loJNJh5IdH-IanOXe-7XVc;

    invoke-direct {v0, p0, p2}, Lcom/shopkick/app/tileViewHolderConfigurators/-$$Lambda$HorizontalSurveyTileViewHolderConfigurator$b88R0loJNJh5IdH-IanOXe-7XVc;-><init>(Lcom/shopkick/app/tileViewHolderConfigurators/HorizontalSurveyTileViewHolderConfigurator;Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;)V

    invoke-virtual {p1, v0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    return-void

    .line 227
    :cond_2
    :goto_0
    iget-object p1, p1, Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;->itemView:Landroid/view/View;

    invoke-virtual {p1, v1}, Landroid/view/View;->setClickable(Z)V

    return-void
.end method

.method private setPendingInfo(Landroid/content/Context;ILcom/shopkick/app/widget/SKTextView;)V
    .locals 5

    const/4 v0, 0x0

    .line 148
    invoke-virtual {p3, v0}, Lcom/shopkick/app/widget/SKTextView;->setVisibility(I)V

    .line 151
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 152
    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    const/4 v3, 0x1

    new-array v3, v3, [Ljava/lang/Object;

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    aput-object v4, v3, v0

    const v0, 0x7f0f0012

    invoke-virtual {v2, v0, p2, v3}, Landroid/content/res/Resources;->getQuantityString(II[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p2

    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p2, " "

    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const p2, 0x7f1101a7

    .line 154
    invoke-virtual {p1, p2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    .line 156
    invoke-virtual {p3, p1}, Lcom/shopkick/app/widget/SKTextView;->setText(Ljava/lang/String;)V

    return-void
.end method

.method private setTimeValue(Lcom/shopkick/app/widget/SKTextView;Ljava/lang/String;Lcom/shopkick/app/widget/SKTextView;)V
    .locals 1

    const/4 v0, 0x0

    .line 143
    invoke-virtual {p3, v0}, Lcom/shopkick/app/widget/SKTextView;->setVisibility(I)V

    .line 144
    invoke-virtual {p1, p2}, Lcom/shopkick/app/widget/SKTextView;->setText(Ljava/lang/String;)V

    return-void
.end method

.method private setupInfoAtBottom(Landroid/content/Context;Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;Landroid/widget/ImageView;Lcom/shopkick/app/widget/SKTextView;Landroid/view/View;Lcom/shopkick/app/widget/SKTextView;)V
    .locals 2

    .line 118
    sget-object v0, Lcom/shopkick/app/tileViewHolderConfigurators/HorizontalSurveyTileViewHolderConfigurator$1;->$SwitchMap$com$shopkick$app$tileViewHolderConfigurators$HorizontalSurveyTileViewHolderConfigurator$SurveyState:[I

    iget-object v1, p0, Lcom/shopkick/app/tileViewHolderConfigurators/HorizontalSurveyTileViewHolderConfigurator;->state:Lcom/shopkick/app/tileViewHolderConfigurators/HorizontalSurveyTileViewHolderConfigurator$SurveyState;

    invoke-virtual {v1}, Lcom/shopkick/app/tileViewHolderConfigurators/HorizontalSurveyTileViewHolderConfigurator$SurveyState;->ordinal()I

    move-result v1

    aget v0, v0, v1

    packed-switch v0, :pswitch_data_0

    .line 132
    invoke-direct {p0, p1, p3, p4}, Lcom/shopkick/app/tileViewHolderConfigurators/HorizontalSurveyTileViewHolderConfigurator;->setErrorInfo(Landroid/content/Context;Landroid/widget/ImageView;Lcom/shopkick/app/widget/SKTextView;)V

    goto :goto_0

    .line 128
    :pswitch_0
    iget-object p2, p2, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->kickAmount:Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    invoke-direct {p0, p1, p2, p3, p4}, Lcom/shopkick/app/tileViewHolderConfigurators/HorizontalSurveyTileViewHolderConfigurator;->setCompletedInfo(Landroid/content/Context;ILandroid/widget/ImageView;Lcom/shopkick/app/widget/SKTextView;)V

    goto :goto_0

    .line 125
    :pswitch_1
    iget-object p2, p2, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->kickAmount:Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    invoke-direct {p0, p1, p2, p4}, Lcom/shopkick/app/tileViewHolderConfigurators/HorizontalSurveyTileViewHolderConfigurator;->setPendingInfo(Landroid/content/Context;ILcom/shopkick/app/widget/SKTextView;)V

    goto :goto_0

    .line 120
    :pswitch_2
    iget-object p3, p2, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->kickAmount:Ljava/lang/Integer;

    invoke-virtual {p3}, Ljava/lang/Integer;->intValue()I

    move-result p3

    invoke-direct {p0, p1, p3, p4}, Lcom/shopkick/app/tileViewHolderConfigurators/HorizontalSurveyTileViewHolderConfigurator;->setKickAmount(Landroid/content/Context;ILcom/shopkick/app/widget/SKTextView;)V

    const/4 p1, 0x0

    .line 121
    invoke-virtual {p5, p1}, Landroid/view/View;->setVisibility(I)V

    .line 122
    iget-object p1, p2, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->subtitle:Ljava/lang/String;

    invoke-direct {p0, p6, p1, p6}, Lcom/shopkick/app/tileViewHolderConfigurators/HorizontalSurveyTileViewHolderConfigurator;->setTimeValue(Lcom/shopkick/app/widget/SKTextView;Ljava/lang/String;Lcom/shopkick/app/widget/SKTextView;)V

    :goto_0
    return-void

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method private setupInnerPrompt(Landroid/view/View;Landroid/view/View;)V
    .locals 2

    .line 102
    sget-object v0, Lcom/shopkick/app/tileViewHolderConfigurators/HorizontalSurveyTileViewHolderConfigurator$1;->$SwitchMap$com$shopkick$app$tileViewHolderConfigurators$HorizontalSurveyTileViewHolderConfigurator$SurveyState:[I

    iget-object v1, p0, Lcom/shopkick/app/tileViewHolderConfigurators/HorizontalSurveyTileViewHolderConfigurator;->state:Lcom/shopkick/app/tileViewHolderConfigurators/HorizontalSurveyTileViewHolderConfigurator$SurveyState;

    invoke-virtual {v1}, Lcom/shopkick/app/tileViewHolderConfigurators/HorizontalSurveyTileViewHolderConfigurator$SurveyState;->ordinal()I

    move-result v1

    aget v0, v0, v1

    const/4 v1, 0x0

    packed-switch v0, :pswitch_data_0

    goto :goto_0

    .line 107
    :pswitch_0
    invoke-virtual {p2, v1}, Landroid/view/View;->setVisibility(I)V

    goto :goto_0

    .line 104
    :pswitch_1
    invoke-virtual {p1, v1}, Landroid/view/View;->setVisibility(I)V

    :goto_0
    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method private setupLogOnClick(Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;Lcom/shopkick/app/logging/UserEventImageView;)V
    .locals 3

    .line 274
    new-instance v0, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;

    const v1, 0xdbb9f

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;-><init>(Ljava/lang/Integer;)V

    const/16 v1, 0x181

    .line 280
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;->setElement(Ljava/lang/Integer;)V

    .line 282
    new-instance v1, Lcom/shopkick/app/logging/IUserEventView$OptionalSetupParams;

    invoke-direct {v1}, Lcom/shopkick/app/logging/IUserEventView$OptionalSetupParams;-><init>()V

    .line 283
    invoke-virtual {p0, v1}, Lcom/shopkick/app/tileViewHolderConfigurators/HorizontalSurveyTileViewHolderConfigurator;->setOptionalSetupParamsCoordinators(Lcom/shopkick/app/logging/IUserEventView$OptionalSetupParams;)V

    .line 284
    iget-object v2, p1, Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;->itemView:Landroid/view/View;

    iput-object v2, v1, Lcom/shopkick/app/logging/IUserEventView$OptionalSetupParams;->cellView:Landroid/view/View;

    .line 285
    invoke-virtual {p1}, Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;->getLayoutPosition()I

    move-result p1

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    iput-object p1, v1, Lcom/shopkick/app/logging/IUserEventView$OptionalSetupParams;->displayPos:Ljava/lang/Integer;

    .line 287
    iget-object p1, p0, Lcom/shopkick/app/tileViewHolderConfigurators/HorizontalSurveyTileViewHolderConfigurator;->eventLogger:Lcom/shopkick/app/logging/UserEventLogger;

    invoke-virtual {p2, v0, p1, v1}, Lcom/shopkick/app/logging/UserEventImageView;->setupEventLog(Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;Lcom/shopkick/app/logging/UserEventLogger;Lcom/shopkick/app/logging/IUserEventView$OptionalSetupParams;)V

    return-void
.end method

.method private setupOverallLayoutOpacity(Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;)V
    .locals 2

    .line 296
    sget-object v0, Lcom/shopkick/app/tileViewHolderConfigurators/HorizontalSurveyTileViewHolderConfigurator$1;->$SwitchMap$com$shopkick$app$tileViewHolderConfigurators$HorizontalSurveyTileViewHolderConfigurator$SurveyState:[I

    iget-object v1, p0, Lcom/shopkick/app/tileViewHolderConfigurators/HorizontalSurveyTileViewHolderConfigurator;->state:Lcom/shopkick/app/tileViewHolderConfigurators/HorizontalSurveyTileViewHolderConfigurator$SurveyState;

    invoke-virtual {v1}, Lcom/shopkick/app/tileViewHolderConfigurators/HorizontalSurveyTileViewHolderConfigurator$SurveyState;->ordinal()I

    move-result v1

    aget v0, v0, v1

    packed-switch v0, :pswitch_data_0

    const v0, 0x3f333333    # 0.7f

    goto :goto_0

    :pswitch_0
    const v0, 0x3e99999a    # 0.3f

    goto :goto_0

    :pswitch_1
    const/4 v0, 0x0

    .line 309
    :goto_0
    iget-object p1, p1, Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;->itemView:Landroid/view/View;

    const/high16 v1, 0x3f800000    # 1.0f

    sub-float/2addr v1, v0

    invoke-virtual {p1, v1}, Landroid/view/View;->setAlpha(F)V

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method


# virtual methods
.method public getLayout()I
    .locals 1

    const v0, 0x7f0c00df

    return v0
.end method

.method public onBindViewHolder(Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;)V
    .locals 10

    .line 75
    iget-object v0, p0, Lcom/shopkick/app/tileViewHolderConfigurators/HorizontalSurveyTileViewHolderConfigurator;->weakRefContext:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Landroid/content/Context;

    if-nez v2, :cond_0

    return-void

    :cond_0
    const v0, 0x7f0902e3

    .line 79
    invoke-virtual {p1, v0}, Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;->getView(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/shopkick/app/logging/UserEventImageView;

    const v1, 0x7f0902e9

    .line 80
    invoke-virtual {p1, v1}, Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;->getView(I)Landroid/view/View;

    move-result-object v1

    const v3, 0x7f0902e8

    .line 81
    invoke-virtual {p1, v3}, Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;->getView(I)Landroid/view/View;

    move-result-object v3

    const v4, 0x7f0902e5

    .line 82
    invoke-virtual {p1, v4}, Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;->getView(I)Landroid/view/View;

    move-result-object v4

    move-object v5, v4

    check-cast v5, Lcom/shopkick/app/widget/SKTextView;

    const v4, 0x7f0902e7

    .line 83
    invoke-virtual {p1, v4}, Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;->getImageView(I)Landroid/widget/ImageView;

    move-result-object v4

    const v6, 0x7f0902e4

    .line 84
    invoke-virtual {p1, v6}, Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;->getView(I)Landroid/view/View;

    move-result-object v6

    const v7, 0x7f0902e6

    .line 85
    invoke-virtual {p1, v7}, Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;->getView(I)Landroid/view/View;

    move-result-object v7

    check-cast v7, Lcom/shopkick/app/widget/SKTextView;

    const/4 v8, 0x7

    .line 88
    new-array v8, v8, [Landroid/view/View;

    const/4 v9, 0x0

    aput-object v0, v8, v9

    const/4 v9, 0x1

    aput-object v1, v8, v9

    const/4 v9, 0x2

    aput-object v3, v8, v9

    const/4 v9, 0x3

    aput-object v5, v8, v9

    const/4 v9, 0x4

    aput-object v4, v8, v9

    const/4 v9, 0x5

    aput-object v6, v8, v9

    const/4 v9, 0x6

    aput-object v7, v8, v9

    invoke-direct {p0, v8}, Lcom/shopkick/app/tileViewHolderConfigurators/HorizontalSurveyTileViewHolderConfigurator;->setAllGone([Landroid/view/View;)V

    .line 90
    invoke-static {}, Lcom/shopkick/app/tileViewHolderConfigurators/HorizontalSurveyTileViewHolderConfigurator$SurveyState;->values()[Lcom/shopkick/app/tileViewHolderConfigurators/HorizontalSurveyTileViewHolderConfigurator$SurveyState;

    move-result-object v8

    iget-object v9, p2, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->surveyTileStatus:Ljava/lang/Integer;

    invoke-virtual {v9}, Ljava/lang/Integer;->intValue()I

    move-result v9

    aget-object v8, v8, v9

    iput-object v8, p0, Lcom/shopkick/app/tileViewHolderConfigurators/HorizontalSurveyTileViewHolderConfigurator;->state:Lcom/shopkick/app/tileViewHolderConfigurators/HorizontalSurveyTileViewHolderConfigurator$SurveyState;

    .line 93
    invoke-direct {p0, v2, v0}, Lcom/shopkick/app/tileViewHolderConfigurators/HorizontalSurveyTileViewHolderConfigurator;->setMainImgBackgroundColors(Landroid/content/Context;Lcom/shopkick/app/logging/UserEventImageView;)V

    .line 94
    invoke-direct {p0, v1, v3}, Lcom/shopkick/app/tileViewHolderConfigurators/HorizontalSurveyTileViewHolderConfigurator;->setupInnerPrompt(Landroid/view/View;Landroid/view/View;)V

    move-object v1, p0

    move-object v3, p2

    .line 95
    invoke-direct/range {v1 .. v7}, Lcom/shopkick/app/tileViewHolderConfigurators/HorizontalSurveyTileViewHolderConfigurator;->setupInfoAtBottom(Landroid/content/Context;Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;Landroid/widget/ImageView;Lcom/shopkick/app/widget/SKTextView;Landroid/view/View;Lcom/shopkick/app/widget/SKTextView;)V

    .line 96
    invoke-direct {p0, p1, p2}, Lcom/shopkick/app/tileViewHolderConfigurators/HorizontalSurveyTileViewHolderConfigurator;->setOnClick(Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;)V

    .line 97
    invoke-direct {p0, p1, v0}, Lcom/shopkick/app/tileViewHolderConfigurators/HorizontalSurveyTileViewHolderConfigurator;->setupLogOnClick(Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;Lcom/shopkick/app/logging/UserEventImageView;)V

    .line 98
    invoke-direct {p0, p1}, Lcom/shopkick/app/tileViewHolderConfigurators/HorizontalSurveyTileViewHolderConfigurator;->setupOverallLayoutOpacity(Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;)V

    return-void
.end method
