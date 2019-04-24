.class public abstract Lcom/shopkick/app/kicksActivity/KicksActivityViewHolderConfiguratorBase;
.super Lcom/shopkick/app/tileViewHolderConfigurators/ViewHolderConfigurator;
.source "KicksActivityViewHolderConfiguratorBase.java"


# static fields
.field protected static final LOGO_ROUNDED_CORNER_RADIUS_DIP:I = 0x5

.field private static final _DateFormatter:Ljava/text/SimpleDateFormat;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 30
    new-instance v0, Ljava/text/SimpleDateFormat;

    const-string v1, "MMM d"

    invoke-direct {v0, v1}, Ljava/text/SimpleDateFormat;-><init>(Ljava/lang/String;)V

    sput-object v0, Lcom/shopkick/app/kicksActivity/KicksActivityViewHolderConfiguratorBase;->_DateFormatter:Ljava/text/SimpleDateFormat;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 28
    invoke-direct {p0}, Lcom/shopkick/app/tileViewHolderConfigurators/ViewHolderConfigurator;-><init>()V

    return-void
.end method


# virtual methods
.method public cancelImageLoadingForViewHolder(Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;)V
    .locals 1

    const v0, 0x7f09036b

    .line 197
    invoke-virtual {p0, p1, v0}, Lcom/shopkick/app/kicksActivity/KicksActivityViewHolderConfiguratorBase;->cancelImageLoadingForImageView(Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;I)V

    return-void
.end method

.method protected formatDateForUI(J)Ljava/lang/String;
    .locals 1

    .line 239
    invoke-static {}, Ljava/util/Calendar;->getInstance()Ljava/util/Calendar;

    move-result-object v0

    .line 240
    invoke-virtual {v0, p1, p2}, Ljava/util/Calendar;->setTimeInMillis(J)V

    .line 241
    sget-object p1, Lcom/shopkick/app/kicksActivity/KicksActivityViewHolderConfiguratorBase;->_DateFormatter:Ljava/text/SimpleDateFormat;

    invoke-virtual {v0}, Ljava/util/Calendar;->getTime()Ljava/util/Date;

    move-result-object p2

    invoke-virtual {p1, p2}, Ljava/text/SimpleDateFormat;->format(Ljava/util/Date;)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public loadImagesForViewHolder(Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;Z)V
    .locals 3

    if-eqz p2, :cond_1

    .line 186
    iget-object v0, p2, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->mainImageUrl:Ljava/lang/String;

    invoke-static {v0}, Lcom/shopkick/app/util/StringUtils;->isEmpty(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    const v0, 0x7f09036b

    .line 190
    invoke-virtual {p1, v0}, Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;->getImageView(I)Landroid/widget/ImageView;

    move-result-object v0

    const/4 v1, 0x5

    .line 191
    invoke-static {v1, v0}, Lcom/shopkick/app/util/FrameConfigurator;->pixelDimension(ILandroid/view/View;)I

    move-result v1

    .line 192
    iget-object p1, p1, Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;->itemView:Landroid/view/View;

    invoke-static {p1}, Lcom/shopkick/app/util/GlideApp;->with(Landroid/view/View;)Lcom/shopkick/app/util/GlideRequests;

    move-result-object p1

    iget-object p2, p2, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->mainImageUrl:Ljava/lang/String;

    invoke-virtual {p1, p2}, Lcom/shopkick/app/util/GlideRequests;->load(Ljava/lang/String;)Lcom/shopkick/app/util/GlideRequest;

    move-result-object p1

    invoke-virtual {p1, p3}, Lcom/shopkick/app/util/GlideRequest;->onlyRetrieveFromCache(Z)Lcom/shopkick/app/util/GlideRequest;

    move-result-object p1

    const/4 p2, 0x2

    new-array p2, p2, [Lcom/bumptech/glide/load/Transformation;

    const/4 p3, 0x0

    new-instance v2, Lcom/bumptech/glide/load/resource/bitmap/CenterCrop;

    invoke-direct {v2}, Lcom/bumptech/glide/load/resource/bitmap/CenterCrop;-><init>()V

    aput-object v2, p2, p3

    const/4 p3, 0x1

    new-instance v2, Lcom/bumptech/glide/load/resource/bitmap/RoundedCorners;

    invoke-direct {v2, v1}, Lcom/bumptech/glide/load/resource/bitmap/RoundedCorners;-><init>(I)V

    aput-object v2, p2, p3

    invoke-virtual {p1, p2}, Lcom/shopkick/app/util/GlideRequest;->transforms([Lcom/bumptech/glide/load/Transformation;)Lcom/shopkick/app/util/GlideRequest;

    move-result-object p1

    invoke-virtual {p1, v0}, Lcom/shopkick/app/util/GlideRequest;->into(Landroid/widget/ImageView;)Lcom/bumptech/glide/request/target/ViewTarget;

    return-void

    :cond_1
    :goto_0
    return-void
.end method

.method public onBindViewHolder(Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;)V
    .locals 7

    .line 37
    iget-object v0, p1, Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;->itemView:Landroid/view/View;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    const v0, 0x7f090372

    .line 40
    invoke-virtual {p1, v0}, Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;->getTextView(I)Landroid/widget/TextView;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 42
    iget-object v2, p2, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->title:Ljava/lang/String;

    invoke-virtual {v0, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    :cond_0
    const v0, 0x7f0902fb

    .line 46
    invoke-virtual {p1, v0}, Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;->getView(I)Landroid/view/View;

    move-result-object v0

    if-eqz v0, :cond_2

    .line 48
    iget-object v2, p2, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->layoutVersion:Ljava/lang/Integer;

    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    move-result v2

    const/16 v3, -0x28

    if-ne v2, v3, :cond_1

    const/4 v1, 0x4

    .line 49
    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    goto :goto_0

    .line 51
    :cond_1
    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    :cond_2
    :goto_0
    const v0, 0x7f0801cb

    .line 59
    iget-object v1, p2, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->kicksActivityType:Ljava/lang/Integer;

    const/16 v2, 0x8

    if-eqz v1, :cond_5

    .line 60
    iget-object v1, p2, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->kicksActivityType:Ljava/lang/Integer;

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    const v3, 0x7f080295

    const v4, 0x7f080125

    const v5, 0x7f080310

    const v6, 0x7f110389

    packed-switch v1, :pswitch_data_0

    .line 148
    iget-object p1, p1, Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;->itemView:Landroid/view/View;

    invoke-virtual {p1, v2}, Landroid/view/View;->setVisibility(I)V

    return-void

    :pswitch_0
    const v6, 0x7f1101af

    const v0, 0x7f0801cd

    const v3, 0x7f0801ce

    goto/16 :goto_1

    :pswitch_1
    const v6, 0x7f110386

    const v3, 0x7f0800a5

    goto/16 :goto_1

    :pswitch_2
    const v0, 0x7f0801ca

    move v3, v5

    goto/16 :goto_1

    :pswitch_3
    const v0, 0x7f0801cc

    move v3, v5

    goto :goto_1

    :pswitch_4
    const v6, 0x7f11037a

    const v3, 0x7f0801b6

    goto :goto_1

    :pswitch_5
    const v6, 0x7f11037b

    const v3, 0x7f0801b8

    goto :goto_1

    :pswitch_6
    const v6, 0x7f110379

    const v3, 0x7f0801b7

    goto :goto_1

    :pswitch_7
    const v6, 0x7f110373

    const v3, 0x7f0801b1

    goto :goto_1

    :pswitch_8
    const v6, 0x7f110378

    move v3, v4

    goto :goto_1

    :pswitch_9
    const v6, 0x7f110387

    goto :goto_1

    :pswitch_a
    move v3, v5

    goto :goto_1

    :pswitch_b
    const v6, 0x7f110372

    const v3, 0x7f08008f

    goto :goto_1

    :pswitch_c
    const v6, 0x7f110382

    const v3, 0x7f08025e

    goto :goto_1

    :pswitch_d
    const v6, 0x7f110384

    const v3, 0x7f08026f

    goto :goto_1

    :pswitch_e
    const v6, 0x7f110374

    const v3, 0x7f0802c4

    goto :goto_1

    :pswitch_f
    const v6, 0x7f110377

    const v3, 0x7f0801c3

    goto :goto_1

    :pswitch_10
    const v6, 0x7f110385

    goto :goto_1

    :pswitch_11
    const v6, 0x7f11037f

    move v3, v4

    goto :goto_1

    :pswitch_12
    const v6, 0x7f11038a

    const v3, 0x7f08031e

    :goto_1
    const v1, 0x7f090367

    .line 159
    invoke-virtual {p1, v1}, Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;->getImageView(I)Landroid/widget/ImageView;

    move-result-object v1

    invoke-virtual {v1, v3}, Landroid/widget/ImageView;->setImageResource(I)V

    const v1, 0x7f090368

    .line 160
    invoke-virtual {p1, v1}, Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;->getTextView(I)Landroid/widget/TextView;

    move-result-object v1

    invoke-virtual {v1, v6}, Landroid/widget/TextView;->setText(I)V

    .line 162
    iget-object v1, p2, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->challengeType:Ljava/lang/Integer;

    if-eqz v1, :cond_3

    .line 163
    iget-object v1, p2, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->challengeType:Ljava/lang/Integer;

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    packed-switch v1, :pswitch_data_1

    goto :goto_2

    :pswitch_13
    const v0, 0x7f0801b2

    goto :goto_2

    :pswitch_14
    const v0, 0x7f0801b3

    goto :goto_2

    :pswitch_15
    const v0, 0x7f0801b4

    :cond_3
    :goto_2
    const v1, 0x7f09036b

    .line 176
    invoke-virtual {p1, v1}, Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;->getImageView(I)Landroid/widget/ImageView;

    move-result-object v1

    invoke-virtual {v1, v0}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 179
    iget-object v0, p2, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->occurrenceTimestampMs:Ljava/lang/Long;

    if-eqz v0, :cond_4

    const v0, 0x7f090369

    .line 180
    invoke-virtual {p1, v0}, Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;->getTextView(I)Landroid/widget/TextView;

    move-result-object p1

    iget-object p2, p2, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->occurrenceTimestampMs:Ljava/lang/Long;

    invoke-virtual {p2}, Ljava/lang/Long;->longValue()J

    move-result-wide v0

    invoke-virtual {p0, v0, v1}, Lcom/shopkick/app/kicksActivity/KicksActivityViewHolderConfiguratorBase;->formatDateForUI(J)Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    :cond_4
    return-void

    .line 156
    :cond_5
    iget-object p1, p1, Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;->itemView:Landroid/view/View;

    invoke-virtual {p1, v2}, Landroid/view/View;->setVisibility(I)V

    return-void

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_12
        :pswitch_11
        :pswitch_10
        :pswitch_f
        :pswitch_e
        :pswitch_d
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch

    :pswitch_data_1
    .packed-switch 0x1
        :pswitch_15
        :pswitch_14
        :pswitch_13
    .end packed-switch
.end method

.method protected updateKicksCountUi(Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;)V
    .locals 6

    const v0, 0x7f09036c

    .line 204
    invoke-virtual {p1, v0}, Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;->getTextView(I)Landroid/widget/TextView;

    move-result-object v0

    const v1, 0x7f09036d

    .line 205
    invoke-virtual {p1, v1}, Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;->getTextView(I)Landroid/widget/TextView;

    move-result-object v1

    const v2, 0x7f09036e

    .line 206
    invoke-virtual {p1, v2}, Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;->getView(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Lcom/shopkick/app/widget/SKTextView;

    .line 207
    iget-object v2, p2, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->kickAmount:Ljava/lang/Integer;

    const/4 v3, 0x0

    const/16 v4, 0x8

    if-eqz v2, :cond_0

    .line 208
    iget-object v2, p2, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->kickAmount:Ljava/lang/Integer;

    invoke-static {v2}, Lcom/shopkick/app/util/NumberFormatter;->formatKicks(Ljava/lang/Number;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 209
    invoke-virtual {v1}, Landroid/widget/TextView;->getContext()Landroid/content/Context;

    move-result-object v2

    .line 210
    invoke-virtual {v2}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    const v5, 0x7f0f000e

    iget-object p2, p2, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->kickAmount:Ljava/lang/Integer;

    .line 212
    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    .line 211
    invoke-virtual {v2, v5, p2}, Landroid/content/res/Resources;->getQuantityString(II)Ljava/lang/String;

    move-result-object p2

    .line 209
    invoke-virtual {v1, p2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 213
    invoke-virtual {v0, v3}, Landroid/widget/TextView;->setVisibility(I)V

    .line 214
    invoke-virtual {v1, v3}, Landroid/widget/TextView;->setVisibility(I)V

    if-eqz p1, :cond_2

    .line 216
    invoke-virtual {p1, v4}, Lcom/shopkick/app/widget/SKTextView;->setVisibility(I)V

    goto :goto_0

    .line 218
    :cond_0
    iget-object v2, p2, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->kickAmountText:Ljava/lang/String;

    if-eqz v2, :cond_1

    .line 219
    invoke-virtual {v0, v4}, Landroid/widget/TextView;->setVisibility(I)V

    .line 220
    invoke-virtual {v1, v4}, Landroid/widget/TextView;->setVisibility(I)V

    if-eqz p1, :cond_2

    .line 222
    iget-object p2, p2, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->kickAmountText:Ljava/lang/String;

    invoke-virtual {p1, p2}, Lcom/shopkick/app/widget/SKTextView;->setText(Ljava/lang/String;)V

    .line 223
    invoke-virtual {p1, v3}, Lcom/shopkick/app/widget/SKTextView;->setVisibility(I)V

    goto :goto_0

    :cond_1
    const/4 p2, 0x4

    .line 226
    invoke-virtual {v0, p2}, Landroid/widget/TextView;->setVisibility(I)V

    .line 227
    invoke-virtual {v1, p2}, Landroid/widget/TextView;->setVisibility(I)V

    if-eqz p1, :cond_2

    .line 229
    invoke-virtual {p1, v4}, Lcom/shopkick/app/widget/SKTextView;->setVisibility(I)V

    :cond_2
    :goto_0
    return-void
.end method
