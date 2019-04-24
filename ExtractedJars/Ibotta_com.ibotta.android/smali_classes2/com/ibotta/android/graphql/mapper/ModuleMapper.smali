.class public Lcom/ibotta/android/graphql/mapper/ModuleMapper;
.super Lcom/ibotta/android/graphql/mapper/BaseMapper;
.source "ModuleMapper.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/ibotta/android/graphql/mapper/BaseMapper<",
        "Lcom/ibotta/android/graphql/fragment/ModuleFragment;",
        "Lcom/ibotta/api/model/base/Module;",
        ">;"
    }
.end annotation


# instance fields
.field private final bonusMapper:Lcom/ibotta/android/graphql/mapper/BonusMapper;

.field private final featureMapper:Lcom/ibotta/android/graphql/mapper/FeatureMapper;

.field private final featuredRetailerMapper:Lcom/ibotta/android/graphql/mapper/FeaturedRetailerMapper;

.field private final offerMapper:Lcom/ibotta/android/graphql/mapper/OfferMapper;

.field private final productMapper:Lcom/ibotta/android/graphql/mapper/ProductMapper;

.field private final retailerCategoryMapper:Lcom/ibotta/android/graphql/mapper/RetailerCategoryMapper;

.field private final retailerMapper:Lcom/ibotta/android/graphql/mapper/RetailerMapper;


# direct methods
.method public constructor <init>(Lcom/ibotta/android/util/Formatting;Lcom/ibotta/android/graphql/mapper/RetailerMapper;Lcom/ibotta/android/graphql/mapper/OfferMapper;Lcom/ibotta/android/graphql/mapper/BonusMapper;Lcom/ibotta/android/graphql/mapper/FeaturedRetailerMapper;Lcom/ibotta/android/graphql/mapper/FeatureMapper;Lcom/ibotta/android/graphql/mapper/ProductMapper;Lcom/ibotta/android/graphql/mapper/RetailerCategoryMapper;)V
    .locals 0

    .line 41
    invoke-direct {p0, p1}, Lcom/ibotta/android/graphql/mapper/BaseMapper;-><init>(Lcom/ibotta/android/util/Formatting;)V

    .line 42
    iput-object p2, p0, Lcom/ibotta/android/graphql/mapper/ModuleMapper;->retailerMapper:Lcom/ibotta/android/graphql/mapper/RetailerMapper;

    .line 43
    iput-object p3, p0, Lcom/ibotta/android/graphql/mapper/ModuleMapper;->offerMapper:Lcom/ibotta/android/graphql/mapper/OfferMapper;

    .line 44
    iput-object p4, p0, Lcom/ibotta/android/graphql/mapper/ModuleMapper;->bonusMapper:Lcom/ibotta/android/graphql/mapper/BonusMapper;

    .line 45
    iput-object p5, p0, Lcom/ibotta/android/graphql/mapper/ModuleMapper;->featuredRetailerMapper:Lcom/ibotta/android/graphql/mapper/FeaturedRetailerMapper;

    .line 46
    iput-object p6, p0, Lcom/ibotta/android/graphql/mapper/ModuleMapper;->featureMapper:Lcom/ibotta/android/graphql/mapper/FeatureMapper;

    .line 47
    iput-object p7, p0, Lcom/ibotta/android/graphql/mapper/ModuleMapper;->productMapper:Lcom/ibotta/android/graphql/mapper/ProductMapper;

    .line 48
    iput-object p8, p0, Lcom/ibotta/android/graphql/mapper/ModuleMapper;->retailerCategoryMapper:Lcom/ibotta/android/graphql/mapper/RetailerCategoryMapper;

    return-void
.end method

.method private asAction(Lcom/ibotta/android/graphql/fragment/ModuleFragment$More_action;)Lcom/ibotta/api/model/content/Action;
    .locals 2
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation

    if-nez p1, :cond_0

    const/4 p1, 0x0

    return-object p1

    .line 135
    :cond_0
    new-instance v0, Lcom/ibotta/api/model/content/Action;

    invoke-direct {v0}, Lcom/ibotta/api/model/content/Action;-><init>()V

    .line 136
    invoke-virtual {p1}, Lcom/ibotta/android/graphql/fragment/ModuleFragment$More_action;->text()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/ibotta/api/model/content/Action;->setText(Ljava/lang/String;)V

    .line 137
    invoke-virtual {p1}, Lcom/ibotta/android/graphql/fragment/ModuleFragment$More_action;->link()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Lcom/ibotta/api/model/content/Action;->setLink(Ljava/lang/String;)V

    return-object v0
.end method

.method private asActions(Ljava/util/List;)Ljava/util/List;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/ibotta/android/graphql/fragment/ModuleFragment$Menu_action;",
            ">;)",
            "Ljava/util/List<",
            "Lcom/ibotta/api/model/content/Action;",
            ">;"
        }
    .end annotation

    .line 143
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    if-nez p1, :cond_0

    return-object v0

    .line 149
    :cond_0
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/ibotta/android/graphql/fragment/ModuleFragment$Menu_action;

    .line 150
    new-instance v2, Lcom/ibotta/api/model/content/Action;

    invoke-direct {v2}, Lcom/ibotta/api/model/content/Action;-><init>()V

    .line 151
    invoke-virtual {v1}, Lcom/ibotta/android/graphql/fragment/ModuleFragment$Menu_action;->text()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Lcom/ibotta/api/model/content/Action;->setText(Ljava/lang/String;)V

    .line 152
    invoke-virtual {v1}, Lcom/ibotta/android/graphql/fragment/ModuleFragment$Menu_action;->link()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v2, v1}, Lcom/ibotta/api/model/content/Action;->setLink(Ljava/lang/String;)V

    .line 154
    invoke-interface {v0, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_1
    return-object v0
.end method

.method private isGridModule(Lcom/ibotta/api/model/base/Module;Lcom/ibotta/android/graphql/fragment/ModuleFragment;)Z
    .locals 0

    .line 110
    invoke-virtual {p2}, Lcom/ibotta/android/graphql/fragment/ModuleFragment;->categories()Ljava/util/List;

    move-result-object p2

    if-eqz p2, :cond_0

    instance-of p1, p1, Lcom/ibotta/api/model/module/GridModule;

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method

.method private parseCategories(Lcom/ibotta/android/graphql/fragment/ModuleFragment;)Ljava/util/List;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/ibotta/android/graphql/fragment/ModuleFragment;",
            ")",
            "Ljava/util/List<",
            "Lcom/ibotta/api/model/retailer/Category;",
            ">;"
        }
    .end annotation

    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation

    .line 115
    invoke-virtual {p1}, Lcom/ibotta/android/graphql/fragment/ModuleFragment;->categories()Ljava/util/List;

    move-result-object p1

    .line 116
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    if-eqz p1, :cond_1

    .line 119
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_0
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/ibotta/android/graphql/fragment/ModuleFragment$Category;

    .line 120
    invoke-virtual {v1}, Lcom/ibotta/android/graphql/fragment/ModuleFragment$Category;->__typename()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Lcom/ibotta/android/graphql/mapper/Mappers;->isCategory(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_0

    .line 121
    iget-object v2, p0, Lcom/ibotta/android/graphql/mapper/ModuleMapper;->retailerCategoryMapper:Lcom/ibotta/android/graphql/mapper/RetailerCategoryMapper;

    invoke-virtual {v1}, Lcom/ibotta/android/graphql/fragment/ModuleFragment$Category;->fragments()Lcom/ibotta/android/graphql/fragment/ModuleFragment$Category$Fragments;

    move-result-object v1

    invoke-virtual {v1}, Lcom/ibotta/android/graphql/fragment/ModuleFragment$Category$Fragments;->categoryFragment()Lcom/ibotta/android/graphql/fragment/CategoryFragment;

    move-result-object v1

    invoke-virtual {v2, v1}, Lcom/ibotta/android/graphql/mapper/RetailerCategoryMapper;->map(Lcom/ibotta/android/graphql/fragment/CategoryFragment;)Lcom/ibotta/api/model/retailer/Category;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_1
    return-object v0
.end method


# virtual methods
.method public map(Lcom/ibotta/android/graphql/fragment/ModuleFragment;)Lcom/ibotta/api/model/base/Module;
    .locals 5
    .param p1    # Lcom/ibotta/android/graphql/fragment/ModuleFragment;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation

    if-nez p1, :cond_0

    const/4 p1, 0x0

    return-object p1

    .line 58
    :cond_0
    invoke-virtual {p1}, Lcom/ibotta/android/graphql/fragment/ModuleFragment;->display_type()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/ibotta/android/graphql/mapper/Mappers;->isRetailerModuleDisplayType(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 59
    new-instance v0, Lcom/ibotta/api/model/module/RetailerModule;

    invoke-direct {v0}, Lcom/ibotta/api/model/module/RetailerModule;-><init>()V

    goto :goto_0

    .line 60
    :cond_1
    invoke-virtual {p1}, Lcom/ibotta/android/graphql/fragment/ModuleFragment;->display_type()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/ibotta/android/graphql/mapper/Mappers;->isGridModuleDisplayType(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 61
    new-instance v0, Lcom/ibotta/api/model/module/GridModule;

    invoke-direct {v0}, Lcom/ibotta/api/model/module/GridModule;-><init>()V

    goto :goto_0

    .line 63
    :cond_2
    new-instance v0, Lcom/ibotta/api/model/base/Module;

    invoke-direct {v0}, Lcom/ibotta/api/model/base/Module;-><init>()V

    .line 66
    :goto_0
    invoke-virtual {p1}, Lcom/ibotta/android/graphql/fragment/ModuleFragment;->id()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0, v1}, Lcom/ibotta/android/graphql/mapper/ModuleMapper;->asInt(Ljava/lang/String;)I

    move-result v1

    invoke-virtual {v0, v1}, Lcom/ibotta/api/model/base/Module;->setId(I)V

    .line 67
    invoke-virtual {p1}, Lcom/ibotta/android/graphql/fragment/ModuleFragment;->id()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0, v1}, Lcom/ibotta/android/graphql/mapper/ModuleMapper;->asInt(Ljava/lang/String;)I

    move-result v1

    invoke-virtual {v0, v1}, Lcom/ibotta/api/model/base/Module;->setModuleId(I)V

    .line 68
    invoke-virtual {p1}, Lcom/ibotta/android/graphql/fragment/ModuleFragment;->dynamic_content_id()Ljava/lang/Long;

    move-result-object v1

    invoke-virtual {p0, v1}, Lcom/ibotta/android/graphql/mapper/ModuleMapper;->asInt(Ljava/lang/Number;)I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/ibotta/api/model/base/Module;->setDynamicContentId(Ljava/lang/Integer;)V

    .line 69
    invoke-virtual {p1}, Lcom/ibotta/android/graphql/fragment/ModuleFragment;->retailer_id()Ljava/lang/Long;

    move-result-object v1

    invoke-virtual {p0, v1}, Lcom/ibotta/android/graphql/mapper/ModuleMapper;->asInt(Ljava/lang/Number;)I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/ibotta/api/model/base/Module;->setRetailerId(Ljava/lang/Integer;)V

    .line 70
    invoke-virtual {p1}, Lcom/ibotta/android/graphql/fragment/ModuleFragment;->sponsored()Ljava/lang/Boolean;

    move-result-object v1

    invoke-virtual {p0, v1}, Lcom/ibotta/android/graphql/mapper/ModuleMapper;->asBoolean(Ljava/lang/Boolean;)Z

    move-result v1

    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/ibotta/api/model/base/Module;->setSponsored(Ljava/lang/Boolean;)V

    .line 71
    invoke-virtual {p1}, Lcom/ibotta/android/graphql/fragment/ModuleFragment;->display_type()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/ibotta/api/model/base/Module;->setDisplayType(Ljava/lang/String;)V

    .line 72
    invoke-virtual {p1}, Lcom/ibotta/android/graphql/fragment/ModuleFragment;->name()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/ibotta/api/model/base/Module;->setName(Ljava/lang/String;)V

    .line 73
    invoke-virtual {p1}, Lcom/ibotta/android/graphql/fragment/ModuleFragment;->type()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/ibotta/api/model/base/Module;->setType(Ljava/lang/String;)V

    .line 74
    invoke-virtual {p1}, Lcom/ibotta/android/graphql/fragment/ModuleFragment;->url()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/ibotta/api/model/base/Module;->setUrl(Ljava/lang/String;)V

    .line 75
    invoke-virtual {p1}, Lcom/ibotta/android/graphql/fragment/ModuleFragment;->more_action()Lcom/ibotta/android/graphql/fragment/ModuleFragment$More_action;

    move-result-object v1

    invoke-direct {p0, v1}, Lcom/ibotta/android/graphql/mapper/ModuleMapper;->asAction(Lcom/ibotta/android/graphql/fragment/ModuleFragment$More_action;)Lcom/ibotta/api/model/content/Action;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/ibotta/api/model/base/Module;->setMoreAction(Lcom/ibotta/api/model/content/Action;)V

    .line 76
    invoke-virtual {p1}, Lcom/ibotta/android/graphql/fragment/ModuleFragment;->menu_actions()Ljava/util/List;

    move-result-object v1

    invoke-direct {p0, v1}, Lcom/ibotta/android/graphql/mapper/ModuleMapper;->asActions(Ljava/util/List;)Ljava/util/List;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/ibotta/api/model/base/Module;->setMenuActions(Ljava/util/List;)V

    .line 78
    invoke-virtual {p1}, Lcom/ibotta/android/graphql/fragment/ModuleFragment;->content()Ljava/util/List;

    move-result-object v1

    if-eqz v1, :cond_a

    .line 80
    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 82
    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_3
    :goto_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_9

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/ibotta/android/graphql/fragment/ModuleFragment$Content;

    .line 83
    invoke-virtual {v3}, Lcom/ibotta/android/graphql/fragment/ModuleFragment$Content;->__typename()Ljava/lang/String;

    move-result-object v4

    invoke-static {v4}, Lcom/ibotta/android/graphql/mapper/Mappers;->isFeaturedRetailer(Ljava/lang/String;)Z

    move-result v4

    if-eqz v4, :cond_4

    .line 84
    iget-object v4, p0, Lcom/ibotta/android/graphql/mapper/ModuleMapper;->featuredRetailerMapper:Lcom/ibotta/android/graphql/mapper/FeaturedRetailerMapper;

    invoke-virtual {v3}, Lcom/ibotta/android/graphql/fragment/ModuleFragment$Content;->fragments()Lcom/ibotta/android/graphql/fragment/ModuleFragment$Content$Fragments;

    move-result-object v3

    invoke-virtual {v3}, Lcom/ibotta/android/graphql/fragment/ModuleFragment$Content$Fragments;->featuredRetailerFragment()Lcom/ibotta/android/graphql/fragment/FeaturedRetailerFragment;

    move-result-object v3

    invoke-virtual {v4, v3}, Lcom/ibotta/android/graphql/mapper/FeaturedRetailerMapper;->map(Lcom/ibotta/android/graphql/fragment/FeaturedRetailerFragment;)Lcom/ibotta/api/model/content/RetailerContent;

    move-result-object v3

    invoke-interface {v2, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_1

    .line 85
    :cond_4
    invoke-virtual {v3}, Lcom/ibotta/android/graphql/fragment/ModuleFragment$Content;->__typename()Ljava/lang/String;

    move-result-object v4

    invoke-static {v4}, Lcom/ibotta/android/graphql/mapper/Mappers;->isRetailerType(Ljava/lang/String;)Z

    move-result v4

    if-eqz v4, :cond_5

    .line 86
    iget-object v4, p0, Lcom/ibotta/android/graphql/mapper/ModuleMapper;->retailerMapper:Lcom/ibotta/android/graphql/mapper/RetailerMapper;

    invoke-virtual {v3}, Lcom/ibotta/android/graphql/fragment/ModuleFragment$Content;->fragments()Lcom/ibotta/android/graphql/fragment/ModuleFragment$Content$Fragments;

    move-result-object v3

    invoke-virtual {v3}, Lcom/ibotta/android/graphql/fragment/ModuleFragment$Content$Fragments;->retailerFragment()Lcom/ibotta/android/graphql/fragment/RetailerFragment;

    move-result-object v3

    invoke-virtual {v4, v3}, Lcom/ibotta/android/graphql/mapper/RetailerMapper;->map(Lcom/ibotta/android/graphql/fragment/RetailerFragment;)Lcom/ibotta/api/model/content/RetailerContent;

    move-result-object v3

    invoke-interface {v2, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_1

    .line 87
    :cond_5
    invoke-virtual {v3}, Lcom/ibotta/android/graphql/fragment/ModuleFragment$Content;->__typename()Ljava/lang/String;

    move-result-object v4

    invoke-static {v4}, Lcom/ibotta/android/graphql/mapper/Mappers;->isOfferType(Ljava/lang/String;)Z

    move-result v4

    if-eqz v4, :cond_6

    .line 88
    iget-object v4, p0, Lcom/ibotta/android/graphql/mapper/ModuleMapper;->offerMapper:Lcom/ibotta/android/graphql/mapper/OfferMapper;

    invoke-virtual {v3}, Lcom/ibotta/android/graphql/fragment/ModuleFragment$Content;->fragments()Lcom/ibotta/android/graphql/fragment/ModuleFragment$Content$Fragments;

    move-result-object v3

    invoke-virtual {v3}, Lcom/ibotta/android/graphql/fragment/ModuleFragment$Content$Fragments;->offerFragment()Lcom/ibotta/android/graphql/fragment/OfferFragment;

    move-result-object v3

    invoke-virtual {v4, v3}, Lcom/ibotta/android/graphql/mapper/OfferMapper;->map(Lcom/ibotta/android/graphql/fragment/OfferFragment;)Lcom/ibotta/api/model/content/OfferContent;

    move-result-object v3

    invoke-interface {v2, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_1

    .line 89
    :cond_6
    invoke-virtual {v3}, Lcom/ibotta/android/graphql/fragment/ModuleFragment$Content;->__typename()Ljava/lang/String;

    move-result-object v4

    invoke-static {v4}, Lcom/ibotta/android/graphql/mapper/Mappers;->isBonusType(Ljava/lang/String;)Z

    move-result v4

    if-eqz v4, :cond_7

    .line 90
    iget-object v4, p0, Lcom/ibotta/android/graphql/mapper/ModuleMapper;->bonusMapper:Lcom/ibotta/android/graphql/mapper/BonusMapper;

    invoke-virtual {v3}, Lcom/ibotta/android/graphql/fragment/ModuleFragment$Content;->fragments()Lcom/ibotta/android/graphql/fragment/ModuleFragment$Content$Fragments;

    move-result-object v3

    invoke-virtual {v3}, Lcom/ibotta/android/graphql/fragment/ModuleFragment$Content$Fragments;->bonusFragment()Lcom/ibotta/android/graphql/fragment/BonusFragment;

    move-result-object v3

    invoke-virtual {v4, v3}, Lcom/ibotta/android/graphql/mapper/BonusMapper;->map(Lcom/ibotta/android/graphql/fragment/BonusFragment;)Lcom/ibotta/api/model/content/BonusContent;

    move-result-object v3

    invoke-interface {v2, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_1

    .line 91
    :cond_7
    invoke-virtual {v3}, Lcom/ibotta/android/graphql/fragment/ModuleFragment$Content;->__typename()Ljava/lang/String;

    move-result-object v4

    invoke-static {v4}, Lcom/ibotta/android/graphql/mapper/Mappers;->isFeature(Ljava/lang/String;)Z

    move-result v4

    if-eqz v4, :cond_8

    .line 92
    iget-object v4, p0, Lcom/ibotta/android/graphql/mapper/ModuleMapper;->featureMapper:Lcom/ibotta/android/graphql/mapper/FeatureMapper;

    invoke-virtual {v3}, Lcom/ibotta/android/graphql/fragment/ModuleFragment$Content;->fragments()Lcom/ibotta/android/graphql/fragment/ModuleFragment$Content$Fragments;

    move-result-object v3

    invoke-virtual {v3}, Lcom/ibotta/android/graphql/fragment/ModuleFragment$Content$Fragments;->featureFragment()Lcom/ibotta/android/graphql/fragment/FeatureFragment;

    move-result-object v3

    invoke-virtual {v4, v3}, Lcom/ibotta/android/graphql/mapper/FeatureMapper;->map(Lcom/ibotta/android/graphql/fragment/FeatureFragment;)Lcom/ibotta/api/model/content/FeatureContent;

    move-result-object v3

    invoke-interface {v2, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto/16 :goto_1

    .line 93
    :cond_8
    invoke-virtual {v3}, Lcom/ibotta/android/graphql/fragment/ModuleFragment$Content;->__typename()Ljava/lang/String;

    move-result-object v4

    invoke-static {v4}, Lcom/ibotta/android/graphql/mapper/Mappers;->isProduct(Ljava/lang/String;)Z

    move-result v4

    if-eqz v4, :cond_3

    .line 94
    iget-object v4, p0, Lcom/ibotta/android/graphql/mapper/ModuleMapper;->productMapper:Lcom/ibotta/android/graphql/mapper/ProductMapper;

    invoke-virtual {v3}, Lcom/ibotta/android/graphql/fragment/ModuleFragment$Content;->fragments()Lcom/ibotta/android/graphql/fragment/ModuleFragment$Content$Fragments;

    move-result-object v3

    invoke-virtual {v3}, Lcom/ibotta/android/graphql/fragment/ModuleFragment$Content$Fragments;->productFragment()Lcom/ibotta/android/graphql/fragment/ProductFragment;

    move-result-object v3

    invoke-virtual {v4, v3}, Lcom/ibotta/android/graphql/mapper/ProductMapper;->map(Lcom/ibotta/android/graphql/fragment/ProductFragment;)Lcom/ibotta/api/model/content/ProductContent;

    move-result-object v3

    invoke-interface {v2, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto/16 :goto_1

    .line 98
    :cond_9
    invoke-virtual {v0, v2}, Lcom/ibotta/api/model/base/Module;->setContent(Ljava/util/List;)V

    .line 101
    :cond_a
    invoke-direct {p0, v0, p1}, Lcom/ibotta/android/graphql/mapper/ModuleMapper;->isGridModule(Lcom/ibotta/api/model/base/Module;Lcom/ibotta/android/graphql/fragment/ModuleFragment;)Z

    move-result v1

    if-eqz v1, :cond_b

    .line 102
    move-object v1, v0

    check-cast v1, Lcom/ibotta/api/model/module/GridModule;

    .line 103
    invoke-direct {p0, p1}, Lcom/ibotta/android/graphql/mapper/ModuleMapper;->parseCategories(Lcom/ibotta/android/graphql/fragment/ModuleFragment;)Ljava/util/List;

    move-result-object p1

    invoke-virtual {v1, p1}, Lcom/ibotta/api/model/module/GridModule;->setCategories(Ljava/util/List;)V

    :cond_b
    return-object v0
.end method

.method public bridge synthetic map(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0
    .param p1    # Ljava/lang/Object;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation

    .line 23
    check-cast p1, Lcom/ibotta/android/graphql/fragment/ModuleFragment;

    invoke-virtual {p0, p1}, Lcom/ibotta/android/graphql/mapper/ModuleMapper;->map(Lcom/ibotta/android/graphql/fragment/ModuleFragment;)Lcom/ibotta/api/model/base/Module;

    move-result-object p1

    return-object p1
.end method
