.class public final Lcom/shopkick/app/tileViewHolderConfigurators/SearchResultInfoTileViewConfigurator;
.super Lcom/shopkick/app/tileViewHolderConfigurators/ViewHolderConfigurator;
.source "SearchResultInfoTileViewConfigurator.kt"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/shopkick/app/tileViewHolderConfigurators/SearchResultInfoTileViewConfigurator$SearchResultType;,
        Lcom/shopkick/app/tileViewHolderConfigurators/SearchResultInfoTileViewConfigurator$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    bv = {
        0x1,
        0x0,
        0x3
    }
    d1 = {
        "\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0018\u0000 \u000b2\u00020\u0001:\u0002\u000b\u000cB\u0005\u00a2\u0006\u0002\u0010\u0002J\u0008\u0010\u0003\u001a\u00020\u0004H\u0016J\u001c\u0010\u0005\u001a\u00020\u00062\u0008\u0010\u0007\u001a\u0004\u0018\u00010\u00082\u0008\u0010\t\u001a\u0004\u0018\u00010\nH\u0016\u00a8\u0006\r"
    }
    d2 = {
        "Lcom/shopkick/app/tileViewHolderConfigurators/SearchResultInfoTileViewConfigurator;",
        "Lcom/shopkick/app/tileViewHolderConfigurators/ViewHolderConfigurator;",
        "()V",
        "getLayout",
        "",
        "onBindViewHolder",
        "",
        "viewHolder",
        "Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;",
        "tileInfo",
        "Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;",
        "Companion",
        "SearchResultType",
        "Shopkick_defaultFlavorRelease"
    }
    k = 0x1
    mv = {
        0x1,
        0x1,
        0xd
    }
.end annotation


# static fields
.field public static final Companion:Lcom/shopkick/app/tileViewHolderConfigurators/SearchResultInfoTileViewConfigurator$Companion;

.field public static final PARAM_SEARCH_KEYWORD:Ljava/lang/String; = "ParamSearchKeyword"
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public static final PARAM_SEARCH_RESULT_TYPE:Ljava/lang/String; = "ParamSearchResultType"
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/shopkick/app/tileViewHolderConfigurators/SearchResultInfoTileViewConfigurator$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/shopkick/app/tileViewHolderConfigurators/SearchResultInfoTileViewConfigurator$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/shopkick/app/tileViewHolderConfigurators/SearchResultInfoTileViewConfigurator;->Companion:Lcom/shopkick/app/tileViewHolderConfigurators/SearchResultInfoTileViewConfigurator$Companion;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 12
    invoke-direct {p0}, Lcom/shopkick/app/tileViewHolderConfigurators/ViewHolderConfigurator;-><init>()V

    return-void
.end method


# virtual methods
.method public getLayout()I
    .locals 1

    const v0, 0x7f0c01a1

    return v0
.end method

.method public onBindViewHolder(Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;)V
    .locals 6
    .param p1    # Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p2    # Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    if-eqz p1, :cond_f

    const v0, 0x7f0906cf

    .line 35
    invoke-virtual {p1, v0}, Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;->getTextView(I)Landroid/widget/TextView;

    move-result-object v1

    if-eqz v1, :cond_f

    if-eqz p2, :cond_e

    .line 36
    invoke-virtual {p2}, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->clientData()Ljava/util/HashMap;

    move-result-object p2

    if-eqz p2, :cond_e

    const-string v2, "ParamSearchResultType"

    .line 37
    invoke-virtual {p2, v2}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    if-eqz v2, :cond_d

    check-cast v2, Lcom/shopkick/app/tileViewHolderConfigurators/SearchResultInfoTileViewConfigurator$SearchResultType;

    if-eqz v2, :cond_c

    .line 39
    invoke-virtual {v1}, Landroid/widget/TextView;->getContext()Landroid/content/Context;

    move-result-object v1

    if-eqz v1, :cond_b

    if-nez v2, :cond_0

    goto/16 :goto_1

    .line 41
    :cond_0
    sget-object v3, Lcom/shopkick/app/tileViewHolderConfigurators/SearchResultInfoTileViewConfigurator$WhenMappings;->$EnumSwitchMapping$0:[I

    invoke-virtual {v2}, Lcom/shopkick/app/tileViewHolderConfigurators/SearchResultInfoTileViewConfigurator$SearchResultType;->ordinal()I

    move-result v2

    aget v2, v3, v2

    const v3, 0x7f0906ce

    const v4, 0x7f0905b9

    packed-switch v2, :pswitch_data_0

    goto/16 :goto_1

    .line 48
    :pswitch_0
    invoke-virtual {p1, v4}, Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;->getImageView(I)Landroid/widget/ImageView;

    move-result-object v2

    if-eqz v2, :cond_1

    const v5, 0x7f080210

    invoke-virtual {v1, v5}, Landroid/content/Context;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v5

    invoke-virtual {v2, v5}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 49
    :cond_1
    invoke-virtual {p1, v4}, Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;->getImageView(I)Landroid/widget/ImageView;

    move-result-object v2

    const/4 v4, 0x0

    if-eqz v2, :cond_2

    invoke-virtual {v2, v4}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 50
    :cond_2
    invoke-virtual {p1, v0}, Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;->getTextView(I)Landroid/widget/TextView;

    move-result-object v2

    if-eqz v2, :cond_3

    invoke-virtual {v2, v4}, Landroid/widget/TextView;->setVisibility(I)V

    .line 51
    :cond_3
    invoke-virtual {p1, v0}, Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;->getTextView(I)Landroid/widget/TextView;

    move-result-object v0

    if-eqz v0, :cond_4

    const v2, 0x7f110269

    invoke-virtual {v1, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v2

    check-cast v2, Ljava/lang/CharSequence;

    invoke-virtual {v0, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 52
    :cond_4
    invoke-virtual {p1, v3}, Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;->getTextView(I)Landroid/widget/TextView;

    move-result-object v0

    if-eqz v0, :cond_5

    invoke-virtual {v0, v4}, Landroid/widget/TextView;->setVisibility(I)V

    :cond_5
    const-string v0, "ParamSearchKeyword"

    .line 53
    invoke-virtual {p2, v0}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p2

    if-eqz p2, :cond_7

    check-cast p2, Ljava/lang/String;

    if-eqz p2, :cond_6

    goto :goto_0

    :cond_6
    const-string p2, ""

    .line 54
    :goto_0
    invoke-virtual {p1, v3}, Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;->getTextView(I)Landroid/widget/TextView;

    move-result-object p1

    if-eqz p1, :cond_a

    const v0, 0x7f110268

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    aput-object p2, v2, v4

    invoke-virtual {v1, v0, v2}, Landroid/content/Context;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p2

    check-cast p2, Ljava/lang/CharSequence;

    invoke-virtual {p1, p2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    goto :goto_1

    .line 53
    :cond_7
    new-instance p1, Lkotlin/TypeCastException;

    const-string p2, "null cannot be cast to non-null type kotlin.String"

    invoke-direct {p1, p2}, Lkotlin/TypeCastException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 43
    :pswitch_1
    invoke-virtual {p1, v4}, Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;->getImageView(I)Landroid/widget/ImageView;

    move-result-object p2

    const/16 v2, 0x8

    if-eqz p2, :cond_8

    invoke-virtual {p2, v2}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 44
    :cond_8
    invoke-virtual {p1, v0}, Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;->getTextView(I)Landroid/widget/TextView;

    move-result-object p2

    if-eqz p2, :cond_9

    invoke-virtual {p2, v2}, Landroid/widget/TextView;->setVisibility(I)V

    .line 45
    :cond_9
    invoke-virtual {p1, v3}, Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;->getTextView(I)Landroid/widget/TextView;

    move-result-object p1

    const-string/jumbo p2, "viewHolder.getTextView(R.id.status_sub_title)"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    const p2, 0x7f110266

    invoke-virtual {v1, p2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object p2

    check-cast p2, Ljava/lang/CharSequence;

    invoke-virtual {p1, p2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    :cond_a
    :goto_1
    return-void

    :cond_b
    return-void

    :cond_c
    return-void

    .line 37
    :cond_d
    new-instance p1, Lkotlin/TypeCastException;

    const-string p2, "null cannot be cast to non-null type com.shopkick.app.tileViewHolderConfigurators.SearchResultInfoTileViewConfigurator.SearchResultType"

    invoke-direct {p1, p2}, Lkotlin/TypeCastException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_e
    return-void

    :cond_f
    return-void

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
