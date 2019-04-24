.class public Lcom/shopkick/app/util/CommonClickUtils$SurveyTileClickListener;
.super Ljava/lang/Object;
.source "CommonClickUtils.java"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/shopkick/app/util/CommonClickUtils;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "SurveyTileClickListener"
.end annotation


# instance fields
.field private surveyTile:Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;

.field private urlDispatcher:Lcom/shopkick/app/url/URLDispatcher;


# direct methods
.method public constructor <init>(Lcom/shopkick/app/url/URLDispatcher;Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;)V
    .locals 0

    .line 555
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 556
    iput-object p1, p0, Lcom/shopkick/app/util/CommonClickUtils$SurveyTileClickListener;->urlDispatcher:Lcom/shopkick/app/url/URLDispatcher;

    .line 557
    iput-object p2, p0, Lcom/shopkick/app/util/CommonClickUtils$SurveyTileClickListener;->surveyTile:Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 3

    .line 562
    iget-object v0, p0, Lcom/shopkick/app/util/CommonClickUtils$SurveyTileClickListener;->surveyTile:Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;

    iget-object v0, v0, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->surveyTileStatus:Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    sget-object v1, Lcom/shopkick/app/tileViewHolderConfigurators/HorizontalSurveyTileViewHolderConfigurator$SurveyState;->READY:Lcom/shopkick/app/tileViewHolderConfigurators/HorizontalSurveyTileViewHolderConfigurator$SurveyState;

    invoke-virtual {v1}, Lcom/shopkick/app/tileViewHolderConfigurators/HorizontalSurveyTileViewHolderConfigurator$SurveyState;->ordinal()I

    move-result v1

    if-eq v0, v1, :cond_0

    return-void

    .line 568
    :cond_0
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    const-string/jumbo v1, "tile_info"

    .line 569
    iget-object v2, p0, Lcom/shopkick/app/util/CommonClickUtils$SurveyTileClickListener;->surveyTile:Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;

    invoke-virtual {v2}, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 571
    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object p1

    check-cast p1, Lcom/shopkick/app/activities/BaseActivity;

    .line 572
    new-instance v1, Lcom/shopkick/app/activities/PageIdentifierV2;

    .line 573
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object p1

    const-class v2, Lcom/shopkick/app/surveys/PreSurveyScreen;

    invoke-direct {v1, p1, v2, v0}, Lcom/shopkick/app/activities/PageIdentifierV2;-><init>(Ljava/lang/Class;Ljava/lang/Class;Ljava/util/Map;)V

    .line 578
    iget-object p1, p0, Lcom/shopkick/app/util/CommonClickUtils$SurveyTileClickListener;->urlDispatcher:Lcom/shopkick/app/url/URLDispatcher;

    invoke-virtual {v1}, Lcom/shopkick/app/activities/PageIdentifierV2;->skUrl()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/shopkick/app/url/URLDispatcher;->dispatchURL(Ljava/lang/String;)Z

    return-void
.end method
