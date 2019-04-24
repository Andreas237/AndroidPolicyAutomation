.class public Lio/branch/referral/Branch$ShareLinkBuilder;
.super Ljava/lang/Object;
.source "Branch.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lio/branch/referral/Branch;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "ShareLinkBuilder"
.end annotation


# instance fields
.field private final activity_:Landroid/app/Activity;

.field private final branch_:Lio/branch/referral/Branch;

.field private callback_:Lio/branch/referral/Branch$BranchLinkShareListener;

.field private channelPropertiesCallback_:Lio/branch/referral/Branch$IChannelProperties;

.field private copyURlText_:Ljava/lang/String;

.field private copyUrlIcon_:Landroid/graphics/drawable/Drawable;

.field private defaultURL_:Ljava/lang/String;

.field private dialogThemeResourceID_:I

.field private dividerHeight:I

.field private excludeFromShareSheet:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private iconSize_:I

.field private includeInShareSheet:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private moreOptionIcon_:Landroid/graphics/drawable/Drawable;

.field private moreOptionText_:Ljava/lang/String;

.field private preferredOptions_:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Lio/branch/referral/SharingHelper$SHARE_WITH;",
            ">;"
        }
    .end annotation
.end field

.field private setFullWidthStyle_:Z

.field private shareMsg_:Ljava/lang/String;

.field private shareSub_:Ljava/lang/String;

.field private sharingTitle:Ljava/lang/String;

.field private sharingTitleView:Landroid/view/View;

.field shortLinkBuilder_:Lio/branch/referral/BranchShortLinkBuilder;

.field private styleResourceID_:I

.field private urlCopiedMessage_:Ljava/lang/String;


# direct methods
.method public constructor <init>(Landroid/app/Activity;Lio/branch/referral/BranchShortLinkBuilder;)V
    .locals 1

    .line 3256
    new-instance v0, Lorg/json/JSONObject;

    invoke-direct {v0}, Lorg/json/JSONObject;-><init>()V

    invoke-direct {p0, p1, v0}, Lio/branch/referral/Branch$ShareLinkBuilder;-><init>(Landroid/app/Activity;Lorg/json/JSONObject;)V

    .line 3257
    iput-object p2, p0, Lio/branch/referral/Branch$ShareLinkBuilder;->shortLinkBuilder_:Lio/branch/referral/BranchShortLinkBuilder;

    return-void
.end method

.method public constructor <init>(Landroid/app/Activity;Lorg/json/JSONObject;)V
    .locals 5

    .line 3222
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    .line 3191
    iput-object v0, p0, Lio/branch/referral/Branch$ShareLinkBuilder;->callback_:Lio/branch/referral/Branch$BranchLinkShareListener;

    .line 3192
    iput-object v0, p0, Lio/branch/referral/Branch$ShareLinkBuilder;->channelPropertiesCallback_:Lio/branch/referral/Branch$IChannelProperties;

    const/4 v1, -0x1

    .line 3206
    iput v1, p0, Lio/branch/referral/Branch$ShareLinkBuilder;->dividerHeight:I

    .line 3207
    iput-object v0, p0, Lio/branch/referral/Branch$ShareLinkBuilder;->sharingTitle:Ljava/lang/String;

    .line 3208
    iput-object v0, p0, Lio/branch/referral/Branch$ShareLinkBuilder;->sharingTitleView:Landroid/view/View;

    const/16 v1, 0x32

    .line 3209
    iput v1, p0, Lio/branch/referral/Branch$ShareLinkBuilder;->iconSize_:I

    .line 3212
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    iput-object v1, p0, Lio/branch/referral/Branch$ShareLinkBuilder;->includeInShareSheet:Ljava/util/List;

    .line 3213
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    iput-object v1, p0, Lio/branch/referral/Branch$ShareLinkBuilder;->excludeFromShareSheet:Ljava/util/List;

    .line 3223
    iput-object p1, p0, Lio/branch/referral/Branch$ShareLinkBuilder;->activity_:Landroid/app/Activity;

    .line 3224
    invoke-static {}, Lio/branch/referral/Branch;->access$2100()Lio/branch/referral/Branch;

    move-result-object v1

    iput-object v1, p0, Lio/branch/referral/Branch$ShareLinkBuilder;->branch_:Lio/branch/referral/Branch;

    .line 3225
    new-instance v1, Lio/branch/referral/BranchShortLinkBuilder;

    invoke-direct {v1, p1}, Lio/branch/referral/BranchShortLinkBuilder;-><init>(Landroid/content/Context;)V

    iput-object v1, p0, Lio/branch/referral/Branch$ShareLinkBuilder;->shortLinkBuilder_:Lio/branch/referral/BranchShortLinkBuilder;

    .line 3227
    :try_start_0
    invoke-virtual {p2}, Lorg/json/JSONObject;->keys()Ljava/util/Iterator;

    move-result-object v1

    .line 3228
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_0

    .line 3229
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    .line 3230
    iget-object v3, p0, Lio/branch/referral/Branch$ShareLinkBuilder;->shortLinkBuilder_:Lio/branch/referral/BranchShortLinkBuilder;

    invoke-virtual {p2, v2}, Lorg/json/JSONObject;->get(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/String;

    invoke-virtual {v3, v2, v4}, Lio/branch/referral/BranchShortLinkBuilder;->addParameters(Ljava/lang/String;Ljava/lang/Object;)Lio/branch/referral/BranchUrlBuilder;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    :cond_0
    const-string p2, ""

    .line 3234
    iput-object p2, p0, Lio/branch/referral/Branch$ShareLinkBuilder;->shareMsg_:Ljava/lang/String;

    .line 3235
    iput-object v0, p0, Lio/branch/referral/Branch$ShareLinkBuilder;->callback_:Lio/branch/referral/Branch$BranchLinkShareListener;

    .line 3236
    iput-object v0, p0, Lio/branch/referral/Branch$ShareLinkBuilder;->channelPropertiesCallback_:Lio/branch/referral/Branch$IChannelProperties;

    .line 3237
    new-instance p2, Ljava/util/ArrayList;

    invoke-direct {p2}, Ljava/util/ArrayList;-><init>()V

    iput-object p2, p0, Lio/branch/referral/Branch$ShareLinkBuilder;->preferredOptions_:Ljava/util/ArrayList;

    .line 3238
    iput-object v0, p0, Lio/branch/referral/Branch$ShareLinkBuilder;->defaultURL_:Ljava/lang/String;

    .line 3240
    invoke-virtual {p1}, Landroid/app/Activity;->getApplicationContext()Landroid/content/Context;

    move-result-object p2

    const v0, 0x1080045

    invoke-static {p2, v0}, Lio/branch/referral/BranchUtil;->getDrawable(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    move-result-object p2

    iput-object p2, p0, Lio/branch/referral/Branch$ShareLinkBuilder;->moreOptionIcon_:Landroid/graphics/drawable/Drawable;

    const-string p2, "More..."

    .line 3241
    iput-object p2, p0, Lio/branch/referral/Branch$ShareLinkBuilder;->moreOptionText_:Ljava/lang/String;

    .line 3243
    invoke-virtual {p1}, Landroid/app/Activity;->getApplicationContext()Landroid/content/Context;

    move-result-object p1

    const p2, 0x108004e

    invoke-static {p1, p2}, Lio/branch/referral/BranchUtil;->getDrawable(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    move-result-object p1

    iput-object p1, p0, Lio/branch/referral/Branch$ShareLinkBuilder;->copyUrlIcon_:Landroid/graphics/drawable/Drawable;

    const-string p1, "Copy link"

    .line 3244
    iput-object p1, p0, Lio/branch/referral/Branch$ShareLinkBuilder;->copyURlText_:Ljava/lang/String;

    const-string p1, "Copied link to clipboard!"

    .line 3245
    iput-object p1, p0, Lio/branch/referral/Branch$ShareLinkBuilder;->urlCopiedMessage_:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public addParam(Ljava/lang/String;Ljava/lang/String;)Lio/branch/referral/Branch$ShareLinkBuilder;
    .locals 1

    .line 3389
    :try_start_0
    iget-object v0, p0, Lio/branch/referral/Branch$ShareLinkBuilder;->shortLinkBuilder_:Lio/branch/referral/BranchShortLinkBuilder;

    invoke-virtual {v0, p1, p2}, Lio/branch/referral/BranchShortLinkBuilder;->addParameters(Ljava/lang/String;Ljava/lang/Object;)Lio/branch/referral/BranchUrlBuilder;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    return-object p0
.end method

.method public addPreferredSharingOption(Lio/branch/referral/SharingHelper$SHARE_WITH;)Lio/branch/referral/Branch$ShareLinkBuilder;
    .locals 1

    .line 3362
    iget-object v0, p0, Lio/branch/referral/Branch$ShareLinkBuilder;->preferredOptions_:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    return-object p0
.end method

.method public addPreferredSharingOptions(Ljava/util/ArrayList;)Lio/branch/referral/Branch$ShareLinkBuilder;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/ArrayList<",
            "Lio/branch/referral/SharingHelper$SHARE_WITH;",
            ">;)",
            "Lio/branch/referral/Branch$ShareLinkBuilder;"
        }
    .end annotation

    .line 3376
    iget-object v0, p0, Lio/branch/referral/Branch$ShareLinkBuilder;->preferredOptions_:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    return-object p0
.end method

.method public addTag(Ljava/lang/String;)Lio/branch/referral/Branch$ShareLinkBuilder;
    .locals 1

    .line 3291
    iget-object v0, p0, Lio/branch/referral/Branch$ShareLinkBuilder;->shortLinkBuilder_:Lio/branch/referral/BranchShortLinkBuilder;

    invoke-virtual {v0, p1}, Lio/branch/referral/BranchShortLinkBuilder;->addTag(Ljava/lang/String;)Lio/branch/referral/BranchUrlBuilder;

    return-object p0
.end method

.method public addTags(Ljava/util/ArrayList;)Lio/branch/referral/Branch$ShareLinkBuilder;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/ArrayList<",
            "Ljava/lang/String;",
            ">;)",
            "Lio/branch/referral/Branch$ShareLinkBuilder;"
        }
    .end annotation

    .line 3304
    iget-object v0, p0, Lio/branch/referral/Branch$ShareLinkBuilder;->shortLinkBuilder_:Lio/branch/referral/BranchShortLinkBuilder;

    invoke-virtual {v0, p1}, Lio/branch/referral/BranchShortLinkBuilder;->addTags(Ljava/util/List;)Lio/branch/referral/BranchUrlBuilder;

    return-object p0
.end method

.method public excludeFromShareSheet(Ljava/lang/String;)Lio/branch/referral/Branch$ShareLinkBuilder;
    .locals 1
    .param p1    # Ljava/lang/String;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    .line 3571
    iget-object v0, p0, Lio/branch/referral/Branch$ShareLinkBuilder;->excludeFromShareSheet:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    return-object p0
.end method

.method public excludeFromShareSheet(Ljava/util/List;)Lio/branch/referral/Branch$ShareLinkBuilder;
    .locals 1
    .param p1    # Ljava/util/List;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;)",
            "Lio/branch/referral/Branch$ShareLinkBuilder;"
        }
    .end annotation

    .line 3593
    iget-object v0, p0, Lio/branch/referral/Branch$ShareLinkBuilder;->excludeFromShareSheet:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    return-object p0
.end method

.method public excludeFromShareSheet([Ljava/lang/String;)Lio/branch/referral/Branch$ShareLinkBuilder;
    .locals 1
    .param p1    # [Ljava/lang/String;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    .line 3582
    iget-object v0, p0, Lio/branch/referral/Branch$ShareLinkBuilder;->excludeFromShareSheet:Ljava/util/List;

    invoke-static {p1}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object p1

    invoke-interface {v0, p1}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    return-object p0
.end method

.method public getActivity()Landroid/app/Activity;
    .locals 1

    .line 3658
    iget-object v0, p0, Lio/branch/referral/Branch$ShareLinkBuilder;->activity_:Landroid/app/Activity;

    return-object v0
.end method

.method public getBranch()Lio/branch/referral/Branch;
    .locals 1

    .line 3674
    iget-object v0, p0, Lio/branch/referral/Branch$ShareLinkBuilder;->branch_:Lio/branch/referral/Branch;

    return-object v0
.end method

.method public getCallback()Lio/branch/referral/Branch$BranchLinkShareListener;
    .locals 1

    .line 3686
    iget-object v0, p0, Lio/branch/referral/Branch$ShareLinkBuilder;->callback_:Lio/branch/referral/Branch$BranchLinkShareListener;

    return-object v0
.end method

.method public getChannelPropertiesCallback()Lio/branch/referral/Branch$IChannelProperties;
    .locals 1

    .line 3690
    iget-object v0, p0, Lio/branch/referral/Branch$ShareLinkBuilder;->channelPropertiesCallback_:Lio/branch/referral/Branch$IChannelProperties;

    return-object v0
.end method

.method public getCopyURlText()Ljava/lang/String;
    .locals 1

    .line 3710
    iget-object v0, p0, Lio/branch/referral/Branch$ShareLinkBuilder;->copyURlText_:Ljava/lang/String;

    return-object v0
.end method

.method public getCopyUrlIcon()Landroid/graphics/drawable/Drawable;
    .locals 1

    .line 3706
    iget-object v0, p0, Lio/branch/referral/Branch$ShareLinkBuilder;->copyUrlIcon_:Landroid/graphics/drawable/Drawable;

    return-object v0
.end method

.method public getDefaultURL()Ljava/lang/String;
    .locals 1

    .line 3694
    iget-object v0, p0, Lio/branch/referral/Branch$ShareLinkBuilder;->defaultURL_:Ljava/lang/String;

    return-object v0
.end method

.method public getDialogThemeResourceID()I
    .locals 1

    .line 3726
    iget v0, p0, Lio/branch/referral/Branch$ShareLinkBuilder;->dialogThemeResourceID_:I

    return v0
.end method

.method public getDividerHeight()I
    .locals 1

    .line 3730
    iget v0, p0, Lio/branch/referral/Branch$ShareLinkBuilder;->dividerHeight:I

    return v0
.end method

.method getExcludedFromShareSheet()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .line 3666
    iget-object v0, p0, Lio/branch/referral/Branch$ShareLinkBuilder;->excludeFromShareSheet:Ljava/util/List;

    return-object v0
.end method

.method public getIconSize()I
    .locals 1

    .line 3746
    iget v0, p0, Lio/branch/referral/Branch$ShareLinkBuilder;->iconSize_:I

    return v0
.end method

.method getIncludedInShareSheet()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .line 3670
    iget-object v0, p0, Lio/branch/referral/Branch$ShareLinkBuilder;->includeInShareSheet:Ljava/util/List;

    return-object v0
.end method

.method public getIsFullWidthStyle()Z
    .locals 1

    .line 3722
    iget-boolean v0, p0, Lio/branch/referral/Branch$ShareLinkBuilder;->setFullWidthStyle_:Z

    return v0
.end method

.method public getMoreOptionIcon()Landroid/graphics/drawable/Drawable;
    .locals 1

    .line 3698
    iget-object v0, p0, Lio/branch/referral/Branch$ShareLinkBuilder;->moreOptionIcon_:Landroid/graphics/drawable/Drawable;

    return-object v0
.end method

.method public getMoreOptionText()Ljava/lang/String;
    .locals 1

    .line 3702
    iget-object v0, p0, Lio/branch/referral/Branch$ShareLinkBuilder;->moreOptionText_:Ljava/lang/String;

    return-object v0
.end method

.method public getPreferredOptions()Ljava/util/ArrayList;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/ArrayList<",
            "Lio/branch/referral/SharingHelper$SHARE_WITH;",
            ">;"
        }
    .end annotation

    .line 3662
    iget-object v0, p0, Lio/branch/referral/Branch$ShareLinkBuilder;->preferredOptions_:Ljava/util/ArrayList;

    return-object v0
.end method

.method public getShareMsg()Ljava/lang/String;
    .locals 1

    .line 3678
    iget-object v0, p0, Lio/branch/referral/Branch$ShareLinkBuilder;->shareMsg_:Ljava/lang/String;

    return-object v0
.end method

.method public getShareSub()Ljava/lang/String;
    .locals 1

    .line 3682
    iget-object v0, p0, Lio/branch/referral/Branch$ShareLinkBuilder;->shareSub_:Ljava/lang/String;

    return-object v0
.end method

.method public getSharingTitle()Ljava/lang/String;
    .locals 1

    .line 3734
    iget-object v0, p0, Lio/branch/referral/Branch$ShareLinkBuilder;->sharingTitle:Ljava/lang/String;

    return-object v0
.end method

.method public getSharingTitleView()Landroid/view/View;
    .locals 1

    .line 3738
    iget-object v0, p0, Lio/branch/referral/Branch$ShareLinkBuilder;->sharingTitleView:Landroid/view/View;

    return-object v0
.end method

.method public getShortLinkBuilder()Lio/branch/referral/BranchShortLinkBuilder;
    .locals 1

    .line 3718
    iget-object v0, p0, Lio/branch/referral/Branch$ShareLinkBuilder;->shortLinkBuilder_:Lio/branch/referral/BranchShortLinkBuilder;

    return-object v0
.end method

.method public getStyleResourceID()I
    .locals 1

    .line 3742
    iget v0, p0, Lio/branch/referral/Branch$ShareLinkBuilder;->styleResourceID_:I

    return v0
.end method

.method public getUrlCopiedMessage()Ljava/lang/String;
    .locals 1

    .line 3714
    iget-object v0, p0, Lio/branch/referral/Branch$ShareLinkBuilder;->urlCopiedMessage_:Ljava/lang/String;

    return-object v0
.end method

.method public includeInShareSheet(Ljava/lang/String;)Lio/branch/referral/Branch$ShareLinkBuilder;
    .locals 1
    .param p1    # Ljava/lang/String;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    .line 3606
    iget-object v0, p0, Lio/branch/referral/Branch$ShareLinkBuilder;->includeInShareSheet:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    return-object p0
.end method

.method public includeInShareSheet(Ljava/util/List;)Lio/branch/referral/Branch$ShareLinkBuilder;
    .locals 1
    .param p1    # Ljava/util/List;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;)",
            "Lio/branch/referral/Branch$ShareLinkBuilder;"
        }
    .end annotation

    .line 3632
    iget-object v0, p0, Lio/branch/referral/Branch$ShareLinkBuilder;->includeInShareSheet:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    return-object p0
.end method

.method public includeInShareSheet([Ljava/lang/String;)Lio/branch/referral/Branch$ShareLinkBuilder;
    .locals 1
    .param p1    # [Ljava/lang/String;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    .line 3619
    iget-object v0, p0, Lio/branch/referral/Branch$ShareLinkBuilder;->includeInShareSheet:Ljava/util/List;

    invoke-static {p1}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object p1

    invoke-interface {v0, p1}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    return-object p0
.end method

.method public setAlias(Ljava/lang/String;)Lio/branch/referral/Branch$ShareLinkBuilder;
    .locals 1

    .line 3478
    iget-object v0, p0, Lio/branch/referral/Branch$ShareLinkBuilder;->shortLinkBuilder_:Lio/branch/referral/BranchShortLinkBuilder;

    invoke-virtual {v0, p1}, Lio/branch/referral/BranchShortLinkBuilder;->setAlias(Ljava/lang/String;)Lio/branch/referral/BranchShortLinkBuilder;

    return-object p0
.end method

.method public setAsFullWidthStyle(Z)Lio/branch/referral/Branch$ShareLinkBuilder;
    .locals 0

    .line 3503
    iput-boolean p1, p0, Lio/branch/referral/Branch$ShareLinkBuilder;->setFullWidthStyle_:Z

    return-object p0
.end method

.method public setCallback(Lio/branch/referral/Branch$BranchLinkShareListener;)Lio/branch/referral/Branch$ShareLinkBuilder;
    .locals 0

    .line 3339
    iput-object p1, p0, Lio/branch/referral/Branch$ShareLinkBuilder;->callback_:Lio/branch/referral/Branch$BranchLinkShareListener;

    return-object p0
.end method

.method public setChannelProperties(Lio/branch/referral/Branch$IChannelProperties;)Lio/branch/referral/Branch$ShareLinkBuilder;
    .locals 0

    .line 3348
    iput-object p1, p0, Lio/branch/referral/Branch$ShareLinkBuilder;->channelPropertiesCallback_:Lio/branch/referral/Branch$IChannelProperties;

    return-object p0
.end method

.method public setCopyUrlStyle(III)Lio/branch/referral/Branch$ShareLinkBuilder;
    .locals 1

    .line 3459
    iget-object v0, p0, Lio/branch/referral/Branch$ShareLinkBuilder;->activity_:Landroid/app/Activity;

    invoke-virtual {v0}, Landroid/app/Activity;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0, p1}, Lio/branch/referral/BranchUtil;->getDrawable(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    move-result-object p1

    iput-object p1, p0, Lio/branch/referral/Branch$ShareLinkBuilder;->copyUrlIcon_:Landroid/graphics/drawable/Drawable;

    .line 3460
    iget-object p1, p0, Lio/branch/referral/Branch$ShareLinkBuilder;->activity_:Landroid/app/Activity;

    invoke-virtual {p1}, Landroid/app/Activity;->getResources()Landroid/content/res/Resources;

    move-result-object p1

    invoke-virtual {p1, p2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lio/branch/referral/Branch$ShareLinkBuilder;->copyURlText_:Ljava/lang/String;

    .line 3461
    iget-object p1, p0, Lio/branch/referral/Branch$ShareLinkBuilder;->activity_:Landroid/app/Activity;

    invoke-virtual {p1}, Landroid/app/Activity;->getResources()Landroid/content/res/Resources;

    move-result-object p1

    invoke-virtual {p1, p3}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lio/branch/referral/Branch$ShareLinkBuilder;->urlCopiedMessage_:Ljava/lang/String;

    return-object p0
.end method

.method public setCopyUrlStyle(Landroid/graphics/drawable/Drawable;Ljava/lang/String;Ljava/lang/String;)Lio/branch/referral/Branch$ShareLinkBuilder;
    .locals 0

    .line 3444
    iput-object p1, p0, Lio/branch/referral/Branch$ShareLinkBuilder;->copyUrlIcon_:Landroid/graphics/drawable/Drawable;

    .line 3445
    iput-object p2, p0, Lio/branch/referral/Branch$ShareLinkBuilder;->copyURlText_:Ljava/lang/String;

    .line 3446
    iput-object p3, p0, Lio/branch/referral/Branch$ShareLinkBuilder;->urlCopiedMessage_:Ljava/lang/String;

    return-object p0
.end method

.method public setDefaultURL(Ljava/lang/String;)Lio/branch/referral/Branch$ShareLinkBuilder;
    .locals 0

    .line 3402
    iput-object p1, p0, Lio/branch/referral/Branch$ShareLinkBuilder;->defaultURL_:Ljava/lang/String;

    return-object p0
.end method

.method public setDialogThemeResourceID(I)Lio/branch/referral/Branch$ShareLinkBuilder;
    .locals 0
    .param p1    # I
        .annotation build Landroid/support/annotation/StyleRes;
        .end annotation
    .end param

    .line 3516
    iput p1, p0, Lio/branch/referral/Branch$ShareLinkBuilder;->dialogThemeResourceID_:I

    return-object p0
.end method

.method public setDividerHeight(I)Lio/branch/referral/Branch$ShareLinkBuilder;
    .locals 0

    .line 3527
    iput p1, p0, Lio/branch/referral/Branch$ShareLinkBuilder;->dividerHeight:I

    return-object p0
.end method

.method public setFeature(Ljava/lang/String;)Lio/branch/referral/Branch$ShareLinkBuilder;
    .locals 1

    .line 3316
    iget-object v0, p0, Lio/branch/referral/Branch$ShareLinkBuilder;->shortLinkBuilder_:Lio/branch/referral/BranchShortLinkBuilder;

    invoke-virtual {v0, p1}, Lio/branch/referral/BranchShortLinkBuilder;->setFeature(Ljava/lang/String;)Lio/branch/referral/BranchShortLinkBuilder;

    return-object p0
.end method

.method public setIconSize(I)Lio/branch/referral/Branch$ShareLinkBuilder;
    .locals 0

    .line 3560
    iput p1, p0, Lio/branch/referral/Branch$ShareLinkBuilder;->iconSize_:I

    return-object p0
.end method

.method public setMatchDuration(I)Lio/branch/referral/Branch$ShareLinkBuilder;
    .locals 1

    .line 3490
    iget-object v0, p0, Lio/branch/referral/Branch$ShareLinkBuilder;->shortLinkBuilder_:Lio/branch/referral/BranchShortLinkBuilder;

    invoke-virtual {v0, p1}, Lio/branch/referral/BranchShortLinkBuilder;->setDuration(I)Lio/branch/referral/BranchShortLinkBuilder;

    return-object p0
.end method

.method public setMessage(Ljava/lang/String;)Lio/branch/referral/Branch$ShareLinkBuilder;
    .locals 0

    .line 3267
    iput-object p1, p0, Lio/branch/referral/Branch$ShareLinkBuilder;->shareMsg_:Ljava/lang/String;

    return-object p0
.end method

.method public setMoreOptionStyle(II)Lio/branch/referral/Branch$ShareLinkBuilder;
    .locals 1

    .line 3429
    iget-object v0, p0, Lio/branch/referral/Branch$ShareLinkBuilder;->activity_:Landroid/app/Activity;

    invoke-virtual {v0}, Landroid/app/Activity;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0, p1}, Lio/branch/referral/BranchUtil;->getDrawable(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    move-result-object p1

    iput-object p1, p0, Lio/branch/referral/Branch$ShareLinkBuilder;->moreOptionIcon_:Landroid/graphics/drawable/Drawable;

    .line 3430
    iget-object p1, p0, Lio/branch/referral/Branch$ShareLinkBuilder;->activity_:Landroid/app/Activity;

    invoke-virtual {p1}, Landroid/app/Activity;->getResources()Landroid/content/res/Resources;

    move-result-object p1

    invoke-virtual {p1, p2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lio/branch/referral/Branch$ShareLinkBuilder;->moreOptionText_:Ljava/lang/String;

    return-object p0
.end method

.method public setMoreOptionStyle(Landroid/graphics/drawable/Drawable;Ljava/lang/String;)Lio/branch/referral/Branch$ShareLinkBuilder;
    .locals 0

    .line 3415
    iput-object p1, p0, Lio/branch/referral/Branch$ShareLinkBuilder;->moreOptionIcon_:Landroid/graphics/drawable/Drawable;

    .line 3416
    iput-object p2, p0, Lio/branch/referral/Branch$ShareLinkBuilder;->moreOptionText_:Ljava/lang/String;

    return-object p0
.end method

.method public setSharingTitle(Landroid/view/View;)Lio/branch/referral/Branch$ShareLinkBuilder;
    .locals 0

    .line 3549
    iput-object p1, p0, Lio/branch/referral/Branch$ShareLinkBuilder;->sharingTitleView:Landroid/view/View;

    return-object p0
.end method

.method public setSharingTitle(Ljava/lang/String;)Lio/branch/referral/Branch$ShareLinkBuilder;
    .locals 0

    .line 3538
    iput-object p1, p0, Lio/branch/referral/Branch$ShareLinkBuilder;->sharingTitle:Ljava/lang/String;

    return-object p0
.end method

.method public setShortLinkBuilderInternal(Lio/branch/referral/BranchShortLinkBuilder;)V
    .locals 0

    .line 3646
    iput-object p1, p0, Lio/branch/referral/Branch$ShareLinkBuilder;->shortLinkBuilder_:Lio/branch/referral/BranchShortLinkBuilder;

    return-void
.end method

.method public setStage(Ljava/lang/String;)Lio/branch/referral/Branch$ShareLinkBuilder;
    .locals 1

    .line 3328
    iget-object v0, p0, Lio/branch/referral/Branch$ShareLinkBuilder;->shortLinkBuilder_:Lio/branch/referral/BranchShortLinkBuilder;

    invoke-virtual {v0, p1}, Lio/branch/referral/BranchShortLinkBuilder;->setStage(Ljava/lang/String;)Lio/branch/referral/BranchShortLinkBuilder;

    return-object p0
.end method

.method public setStyleResourceID(I)V
    .locals 0
    .param p1    # I
        .annotation build Landroid/support/annotation/StyleRes;
        .end annotation
    .end param

    .line 3642
    iput p1, p0, Lio/branch/referral/Branch$ShareLinkBuilder;->styleResourceID_:I

    return-void
.end method

.method public setSubject(Ljava/lang/String;)Lio/branch/referral/Branch$ShareLinkBuilder;
    .locals 0

    .line 3278
    iput-object p1, p0, Lio/branch/referral/Branch$ShareLinkBuilder;->shareSub_:Ljava/lang/String;

    return-object p0
.end method

.method public shareLink()V
    .locals 1

    .line 3654
    invoke-static {}, Lio/branch/referral/Branch;->access$2100()Lio/branch/referral/Branch;

    move-result-object v0

    invoke-static {v0, p0}, Lio/branch/referral/Branch;->access$2500(Lio/branch/referral/Branch;Lio/branch/referral/Branch$ShareLinkBuilder;)V

    return-void
.end method
