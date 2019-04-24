.class Lio/branch/referral/ShareLinkManager$ShareItemView;
.super Landroid/widget/TextView;
.source "ShareLinkManager.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lio/branch/referral/ShareLinkManager;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x2
    name = "ShareItemView"
.end annotation


# instance fields
.field context_:Landroid/content/Context;

.field iconSizeDP_:I

.field final synthetic this$0:Lio/branch/referral/ShareLinkManager;


# direct methods
.method public constructor <init>(Lio/branch/referral/ShareLinkManager;Landroid/content/Context;)V
    .locals 2

    .line 409
    iput-object p1, p0, Lio/branch/referral/ShareLinkManager$ShareItemView;->this$0:Lio/branch/referral/ShareLinkManager;

    .line 410
    invoke-direct {p0, p2}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    .line 411
    iput-object p2, p0, Lio/branch/referral/ShareLinkManager$ShareItemView;->context_:Landroid/content/Context;

    const/4 v0, 0x5

    const/16 v1, 0x64

    .line 412
    invoke-virtual {p0, v1, v0, v0, v0}, Lio/branch/referral/ShareLinkManager$ShareItemView;->setPadding(IIII)V

    const v0, 0x800013

    .line 413
    invoke-virtual {p0, v0}, Lio/branch/referral/ShareLinkManager$ShareItemView;->setGravity(I)V

    .line 414
    iget-object v0, p0, Lio/branch/referral/ShareLinkManager$ShareItemView;->context_:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v0

    iget v0, v0, Landroid/util/DisplayMetrics;->widthPixels:I

    invoke-virtual {p0, v0}, Lio/branch/referral/ShareLinkManager$ShareItemView;->setMinWidth(I)V

    .line 415
    invoke-static {p1}, Lio/branch/referral/ShareLinkManager;->access$800(Lio/branch/referral/ShareLinkManager;)I

    move-result v0

    if-eqz v0, :cond_0

    invoke-static {p1}, Lio/branch/referral/ShareLinkManager;->access$800(Lio/branch/referral/ShareLinkManager;)I

    move-result p1

    invoke-static {p2, p1}, Lio/branch/referral/BranchUtil;->dpToPx(Landroid/content/Context;I)I

    move-result p1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    iput p1, p0, Lio/branch/referral/ShareLinkManager$ShareItemView;->iconSizeDP_:I

    return-void
.end method


# virtual methods
.method public setLabel(Ljava/lang/String;Landroid/graphics/drawable/Drawable;Z)V
    .locals 2

    .line 419
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "\t"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Lio/branch/referral/ShareLinkManager$ShareItemView;->setText(Ljava/lang/CharSequence;)V

    .line 420
    invoke-virtual {p0, p1}, Lio/branch/referral/ShareLinkManager$ShareItemView;->setTag(Ljava/lang/Object;)V

    const/4 p1, 0x0

    if-nez p2, :cond_0

    .line 422
    iget-object p2, p0, Lio/branch/referral/ShareLinkManager$ShareItemView;->context_:Landroid/content/Context;

    const v0, 0x1030042

    invoke-virtual {p0, p2, v0}, Lio/branch/referral/ShareLinkManager$ShareItemView;->setTextAppearance(Landroid/content/Context;I)V

    .line 423
    invoke-virtual {p0, p1, p1, p1, p1}, Lio/branch/referral/ShareLinkManager$ShareItemView;->setCompoundDrawablesWithIntrinsicBounds(Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;)V

    goto :goto_1

    .line 425
    :cond_0
    iget v0, p0, Lio/branch/referral/ShareLinkManager$ShareItemView;->iconSizeDP_:I

    if-eqz v0, :cond_1

    const/4 v1, 0x0

    .line 426
    invoke-virtual {p2, v1, v1, v0, v0}, Landroid/graphics/drawable/Drawable;->setBounds(IIII)V

    .line 427
    invoke-virtual {p0, p2, p1, p1, p1}, Lio/branch/referral/ShareLinkManager$ShareItemView;->setCompoundDrawables(Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;)V

    goto :goto_0

    .line 429
    :cond_1
    invoke-virtual {p0, p2, p1, p1, p1}, Lio/branch/referral/ShareLinkManager$ShareItemView;->setCompoundDrawablesWithIntrinsicBounds(Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;)V

    .line 431
    :goto_0
    iget-object p1, p0, Lio/branch/referral/ShareLinkManager$ShareItemView;->context_:Landroid/content/Context;

    const v0, 0x1030044

    invoke-virtual {p0, p1, v0}, Lio/branch/referral/ShareLinkManager$ShareItemView;->setTextAppearance(Landroid/content/Context;I)V

    .line 432
    invoke-static {}, Lio/branch/referral/ShareLinkManager;->access$900()I

    move-result p1

    invoke-virtual {p2}, Landroid/graphics/drawable/Drawable;->getIntrinsicHeight()I

    move-result p2

    add-int/lit8 p2, p2, 0x5

    invoke-static {p1, p2}, Ljava/lang/Math;->max(II)I

    move-result p1

    invoke-static {p1}, Lio/branch/referral/ShareLinkManager;->access$902(I)I

    .line 434
    :goto_1
    invoke-static {}, Lio/branch/referral/ShareLinkManager;->access$900()I

    move-result p1

    invoke-virtual {p0, p1}, Lio/branch/referral/ShareLinkManager$ShareItemView;->setMinHeight(I)V

    .line 435
    iget-object p1, p0, Lio/branch/referral/ShareLinkManager$ShareItemView;->context_:Landroid/content/Context;

    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object p1

    const p2, 0x106000c

    invoke-virtual {p1, p2}, Landroid/content/res/Resources;->getColor(I)I

    move-result p1

    invoke-virtual {p0, p1}, Lio/branch/referral/ShareLinkManager$ShareItemView;->setTextColor(I)V

    if-eqz p3, :cond_2

    .line 437
    iget-object p1, p0, Lio/branch/referral/ShareLinkManager$ShareItemView;->this$0:Lio/branch/referral/ShareLinkManager;

    invoke-static {p1}, Lio/branch/referral/ShareLinkManager;->access$1000(Lio/branch/referral/ShareLinkManager;)I

    move-result p1

    invoke-virtual {p0, p1}, Lio/branch/referral/ShareLinkManager$ShareItemView;->setBackgroundColor(I)V

    goto :goto_2

    .line 439
    :cond_2
    iget-object p1, p0, Lio/branch/referral/ShareLinkManager$ShareItemView;->this$0:Lio/branch/referral/ShareLinkManager;

    invoke-static {p1}, Lio/branch/referral/ShareLinkManager;->access$1100(Lio/branch/referral/ShareLinkManager;)I

    move-result p1

    invoke-virtual {p0, p1}, Lio/branch/referral/ShareLinkManager$ShareItemView;->setBackgroundColor(I)V

    :goto_2
    return-void
.end method
