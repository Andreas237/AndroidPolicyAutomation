.class public Lcom/shopkick/app/kicksActivity/KicksActivityPendingViewHolderConfigurator;
.super Lcom/shopkick/app/kicksActivity/KicksActivityViewHolderConfiguratorBase;
.source "KicksActivityPendingViewHolderConfigurator.java"


# static fields
.field private static final LOGO_ROUNDED_CORNER_RADIUS:I = 0x5


# instance fields
.field private final uiTextForAvailable:Ljava/lang/String;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    .line 30
    invoke-direct {p0}, Lcom/shopkick/app/kicksActivity/KicksActivityViewHolderConfiguratorBase;-><init>()V

    const v0, 0x7f110371

    .line 31
    invoke-virtual {p1, v0}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lcom/shopkick/app/kicksActivity/KicksActivityPendingViewHolderConfigurator;->uiTextForAvailable:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public getLayout()I
    .locals 1

    const v0, 0x7f0c00fd

    return v0
.end method

.method public onBindViewHolder(Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;)V
    .locals 7

    .line 45
    invoke-super {p0, p1, p2}, Lcom/shopkick/app/kicksActivity/KicksActivityViewHolderConfiguratorBase;->onBindViewHolder(Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;)V

    const v0, 0x7f09036a

    .line 48
    invoke-virtual {p1, v0}, Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;->getTextView(I)Landroid/widget/TextView;

    move-result-object v0

    .line 49
    iget-object v1, p2, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->availabilityTimestampMs:Ljava/lang/Long;

    if-eqz v1, :cond_0

    const-string v1, "%1$s %2$s"

    const/4 v2, 0x2

    .line 50
    new-array v2, v2, [Ljava/lang/Object;

    iget-object v3, p0, Lcom/shopkick/app/kicksActivity/KicksActivityPendingViewHolderConfigurator;->uiTextForAvailable:Ljava/lang/String;

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x1

    iget-object v5, p2, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->availabilityTimestampMs:Ljava/lang/Long;

    .line 52
    invoke-virtual {v5}, Ljava/lang/Long;->longValue()J

    move-result-wide v5

    invoke-virtual {p0, v5, v6}, Lcom/shopkick/app/kicksActivity/KicksActivityPendingViewHolderConfigurator;->formatDateForUI(J)Ljava/lang/String;

    move-result-object v5

    aput-object v5, v2, v3

    .line 50
    invoke-static {v1, v2}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    .line 52
    invoke-static {}, Ljava/util/Locale;->getDefault()Ljava/util/Locale;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/String;->toUpperCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v1

    .line 53
    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 54
    invoke-virtual {v0, v4}, Landroid/widget/TextView;->setVisibility(I)V

    goto :goto_0

    :cond_0
    const/4 v1, 0x4

    .line 56
    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 59
    :goto_0
    invoke-super {p0, p1, p2}, Lcom/shopkick/app/kicksActivity/KicksActivityViewHolderConfiguratorBase;->updateKicksCountUi(Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;)V

    return-void
.end method
