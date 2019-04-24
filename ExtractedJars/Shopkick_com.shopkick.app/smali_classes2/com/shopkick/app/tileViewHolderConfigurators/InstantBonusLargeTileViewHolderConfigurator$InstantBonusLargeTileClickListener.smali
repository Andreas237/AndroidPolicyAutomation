.class Lcom/shopkick/app/tileViewHolderConfigurators/InstantBonusLargeTileViewHolderConfigurator$InstantBonusLargeTileClickListener;
.super Ljava/lang/Object;
.source "InstantBonusLargeTileViewHolderConfigurator.java"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/shopkick/app/tileViewHolderConfigurators/InstantBonusLargeTileViewHolderConfigurator;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0xa
    name = "InstantBonusLargeTileClickListener"
.end annotation


# instance fields
.field private awarder:Lcom/shopkick/app/lookbooks/InstantBonusAwarder;

.field private eventLogger:Lcom/shopkick/app/logging/UserEventLogger;

.field private progressBar:Landroid/widget/ProgressBar;

.field private storyId:Ljava/lang/String;

.field private tileInfo:Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;


# direct methods
.method public constructor <init>(Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;Lcom/shopkick/app/lookbooks/InstantBonusAwarder;Ljava/lang/String;Landroid/widget/ProgressBar;Lcom/shopkick/app/logging/UserEventLogger;)V
    .locals 0

    .line 152
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 153
    iput-object p2, p0, Lcom/shopkick/app/tileViewHolderConfigurators/InstantBonusLargeTileViewHolderConfigurator$InstantBonusLargeTileClickListener;->awarder:Lcom/shopkick/app/lookbooks/InstantBonusAwarder;

    .line 154
    iput-object p1, p0, Lcom/shopkick/app/tileViewHolderConfigurators/InstantBonusLargeTileViewHolderConfigurator$InstantBonusLargeTileClickListener;->tileInfo:Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;

    .line 155
    iput-object p3, p0, Lcom/shopkick/app/tileViewHolderConfigurators/InstantBonusLargeTileViewHolderConfigurator$InstantBonusLargeTileClickListener;->storyId:Ljava/lang/String;

    .line 156
    iput-object p4, p0, Lcom/shopkick/app/tileViewHolderConfigurators/InstantBonusLargeTileViewHolderConfigurator$InstantBonusLargeTileClickListener;->progressBar:Landroid/widget/ProgressBar;

    .line 157
    iput-object p5, p0, Lcom/shopkick/app/tileViewHolderConfigurators/InstantBonusLargeTileViewHolderConfigurator$InstantBonusLargeTileClickListener;->eventLogger:Lcom/shopkick/app/logging/UserEventLogger;

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 2

    .line 162
    iget-object p1, p0, Lcom/shopkick/app/tileViewHolderConfigurators/InstantBonusLargeTileViewHolderConfigurator$InstantBonusLargeTileClickListener;->eventLogger:Lcom/shopkick/app/logging/UserEventLogger;

    const/4 v0, 0x6

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/shopkick/app/logging/UserEventLogger;->detectedUIEventStart(Ljava/lang/Integer;)V

    .line 163
    iget-object p1, p0, Lcom/shopkick/app/tileViewHolderConfigurators/InstantBonusLargeTileViewHolderConfigurator$InstantBonusLargeTileClickListener;->progressBar:Landroid/widget/ProgressBar;

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Landroid/widget/ProgressBar;->setVisibility(I)V

    .line 164
    iget-object p1, p0, Lcom/shopkick/app/tileViewHolderConfigurators/InstantBonusLargeTileViewHolderConfigurator$InstantBonusLargeTileClickListener;->awarder:Lcom/shopkick/app/lookbooks/InstantBonusAwarder;

    iget-object v0, p0, Lcom/shopkick/app/tileViewHolderConfigurators/InstantBonusLargeTileViewHolderConfigurator$InstantBonusLargeTileClickListener;->tileInfo:Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;

    iget-object v1, p0, Lcom/shopkick/app/tileViewHolderConfigurators/InstantBonusLargeTileViewHolderConfigurator$InstantBonusLargeTileClickListener;->storyId:Ljava/lang/String;

    invoke-virtual {p1, v0, v1}, Lcom/shopkick/app/lookbooks/InstantBonusAwarder;->awardBonus(Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;Ljava/lang/String;)V

    return-void
.end method
