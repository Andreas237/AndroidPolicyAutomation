.class abstract Lio/branch/referral/BranchUrlBuilder;
.super Ljava/lang/Object;
.source "BranchUrlBuilder.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Lio/branch/referral/BranchUrlBuilder;",
        ">",
        "Ljava/lang/Object;"
    }
.end annotation


# instance fields
.field protected alias_:Ljava/lang/String;

.field protected branchReferral_:Lio/branch/referral/Branch;

.field protected campaign_:Ljava/lang/String;

.field protected channel_:Ljava/lang/String;

.field private final context_:Landroid/content/Context;

.field private defaultToLongUrl_:Z

.field protected duration_:I

.field protected feature_:Ljava/lang/String;

.field protected params_:Lorg/json/JSONObject;

.field protected stage_:Ljava/lang/String;

.field protected tags_:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field protected type_:I


# direct methods
.method protected constructor <init>(Landroid/content/Context;)V
    .locals 1

    .line 56
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    .line 35
    iput v0, p0, Lio/branch/referral/BranchUrlBuilder;->type_:I

    .line 37
    iput v0, p0, Lio/branch/referral/BranchUrlBuilder;->duration_:I

    .line 57
    invoke-static {}, Lio/branch/referral/Branch;->getInstance()Lio/branch/referral/Branch;

    move-result-object v0

    iput-object v0, p0, Lio/branch/referral/BranchUrlBuilder;->branchReferral_:Lio/branch/referral/Branch;

    .line 58
    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object p1

    iput-object p1, p0, Lio/branch/referral/BranchUrlBuilder;->context_:Landroid/content/Context;

    const/4 p1, 0x1

    .line 59
    iput-boolean p1, p0, Lio/branch/referral/BranchUrlBuilder;->defaultToLongUrl_:Z

    return-void
.end method


# virtual methods
.method public addParameters(Ljava/lang/String;Ljava/lang/Object;)Lio/branch/referral/BranchUrlBuilder;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ")TT;"
        }
    .end annotation

    .line 102
    :try_start_0
    iget-object v0, p0, Lio/branch/referral/BranchUrlBuilder;->params_:Lorg/json/JSONObject;

    if-nez v0, :cond_0

    .line 103
    new-instance v0, Lorg/json/JSONObject;

    invoke-direct {v0}, Lorg/json/JSONObject;-><init>()V

    iput-object v0, p0, Lio/branch/referral/BranchUrlBuilder;->params_:Lorg/json/JSONObject;

    .line 105
    :cond_0
    iget-object v0, p0, Lio/branch/referral/BranchUrlBuilder;->params_:Lorg/json/JSONObject;

    invoke-virtual {v0, p1, p2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    return-object p0
.end method

.method public addTag(Ljava/lang/String;)Lio/branch/referral/BranchUrlBuilder;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")TT;"
        }
    .end annotation

    .line 70
    iget-object v0, p0, Lio/branch/referral/BranchUrlBuilder;->tags_:Ljava/util/ArrayList;

    if-nez v0, :cond_0

    .line 71
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lio/branch/referral/BranchUrlBuilder;->tags_:Ljava/util/ArrayList;

    .line 73
    :cond_0
    iget-object v0, p0, Lio/branch/referral/BranchUrlBuilder;->tags_:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    return-object p0
.end method

.method public addTags(Ljava/util/List;)Lio/branch/referral/BranchUrlBuilder;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;)TT;"
        }
    .end annotation

    .line 85
    iget-object v0, p0, Lio/branch/referral/BranchUrlBuilder;->tags_:Ljava/util/ArrayList;

    if-nez v0, :cond_0

    .line 86
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lio/branch/referral/BranchUrlBuilder;->tags_:Ljava/util/ArrayList;

    .line 88
    :cond_0
    iget-object v0, p0, Lio/branch/referral/BranchUrlBuilder;->tags_:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    return-object p0
.end method

.method protected generateUrl(Lio/branch/referral/Branch$BranchLinkCreateListener;)V
    .locals 1

    const/4 v0, 0x0

    .line 131
    invoke-virtual {p0, p1, v0}, Lio/branch/referral/BranchUrlBuilder;->generateUrlInternal(Lio/branch/referral/Branch$BranchLinkCreateListener;Z)V

    return-void
.end method

.method protected generateUrlInternal(Lio/branch/referral/Branch$BranchLinkCreateListener;Z)V
    .locals 16

    move-object/from16 v0, p0

    move-object/from16 v12, p1

    .line 135
    iget-object v1, v0, Lio/branch/referral/BranchUrlBuilder;->branchReferral_:Lio/branch/referral/Branch;

    if-eqz v1, :cond_0

    .line 136
    new-instance v15, Lio/branch/referral/ServerRequestCreateUrl;

    iget-object v2, v0, Lio/branch/referral/BranchUrlBuilder;->context_:Landroid/content/Context;

    iget-object v3, v0, Lio/branch/referral/BranchUrlBuilder;->alias_:Ljava/lang/String;

    iget v4, v0, Lio/branch/referral/BranchUrlBuilder;->type_:I

    iget v5, v0, Lio/branch/referral/BranchUrlBuilder;->duration_:I

    iget-object v6, v0, Lio/branch/referral/BranchUrlBuilder;->tags_:Ljava/util/ArrayList;

    iget-object v7, v0, Lio/branch/referral/BranchUrlBuilder;->channel_:Ljava/lang/String;

    iget-object v8, v0, Lio/branch/referral/BranchUrlBuilder;->feature_:Ljava/lang/String;

    iget-object v9, v0, Lio/branch/referral/BranchUrlBuilder;->stage_:Ljava/lang/String;

    iget-object v10, v0, Lio/branch/referral/BranchUrlBuilder;->campaign_:Ljava/lang/String;

    iget-object v1, v0, Lio/branch/referral/BranchUrlBuilder;->params_:Lorg/json/JSONObject;

    .line 138
    invoke-static {v1}, Lio/branch/referral/BranchUtil;->formatLinkParam(Lorg/json/JSONObject;)Lorg/json/JSONObject;

    move-result-object v11

    const/4 v13, 0x1

    iget-boolean v14, v0, Lio/branch/referral/BranchUrlBuilder;->defaultToLongUrl_:Z

    move-object v1, v15

    move-object/from16 v12, p1

    invoke-direct/range {v1 .. v14}, Lio/branch/referral/ServerRequestCreateUrl;-><init>(Landroid/content/Context;Ljava/lang/String;IILjava/util/Collection;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/json/JSONObject;Lio/branch/referral/Branch$BranchLinkCreateListener;ZZ)V

    move/from16 v1, p2

    .line 139
    invoke-virtual {v15, v1}, Lio/branch/referral/ServerRequestCreateUrl;->setIsReqStartedFromBranchShareSheet(Z)V

    .line 140
    iget-object v1, v0, Lio/branch/referral/BranchUrlBuilder;->branchReferral_:Lio/branch/referral/Branch;

    invoke-virtual {v1, v15}, Lio/branch/referral/Branch;->generateShortLinkInternal(Lio/branch/referral/ServerRequestCreateUrl;)Ljava/lang/String;

    goto :goto_0

    :cond_0
    if-eqz v12, :cond_1

    const/4 v1, 0x0

    .line 143
    new-instance v2, Lio/branch/referral/BranchError;

    const-string v3, "session has not been initialized"

    const/16 v4, -0x65

    invoke-direct {v2, v3, v4}, Lio/branch/referral/BranchError;-><init>(Ljava/lang/String;I)V

    invoke-interface {v12, v1, v2}, Lio/branch/referral/Branch$BranchLinkCreateListener;->onLinkCreate(Ljava/lang/String;Lio/branch/referral/BranchError;)V

    :cond_1
    const-string v1, "BranchSDK"

    const-string v2, "Branch Warning: User session has not been initialized"

    .line 145
    invoke-static {v1, v2}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    :goto_0
    return-void
.end method

.method protected getUrl()Ljava/lang/String;
    .locals 15

    .line 121
    iget-object v0, p0, Lio/branch/referral/BranchUrlBuilder;->branchReferral_:Lio/branch/referral/Branch;

    if-eqz v0, :cond_0

    .line 122
    new-instance v0, Lio/branch/referral/ServerRequestCreateUrl;

    iget-object v2, p0, Lio/branch/referral/BranchUrlBuilder;->context_:Landroid/content/Context;

    iget-object v3, p0, Lio/branch/referral/BranchUrlBuilder;->alias_:Ljava/lang/String;

    iget v4, p0, Lio/branch/referral/BranchUrlBuilder;->type_:I

    iget v5, p0, Lio/branch/referral/BranchUrlBuilder;->duration_:I

    iget-object v6, p0, Lio/branch/referral/BranchUrlBuilder;->tags_:Ljava/util/ArrayList;

    iget-object v7, p0, Lio/branch/referral/BranchUrlBuilder;->channel_:Ljava/lang/String;

    iget-object v8, p0, Lio/branch/referral/BranchUrlBuilder;->feature_:Ljava/lang/String;

    iget-object v9, p0, Lio/branch/referral/BranchUrlBuilder;->stage_:Ljava/lang/String;

    iget-object v10, p0, Lio/branch/referral/BranchUrlBuilder;->campaign_:Ljava/lang/String;

    iget-object v1, p0, Lio/branch/referral/BranchUrlBuilder;->params_:Lorg/json/JSONObject;

    .line 124
    invoke-static {v1}, Lio/branch/referral/BranchUtil;->formatLinkParam(Lorg/json/JSONObject;)Lorg/json/JSONObject;

    move-result-object v11

    const/4 v12, 0x0

    const/4 v13, 0x0

    iget-boolean v14, p0, Lio/branch/referral/BranchUrlBuilder;->defaultToLongUrl_:Z

    move-object v1, v0

    invoke-direct/range {v1 .. v14}, Lio/branch/referral/ServerRequestCreateUrl;-><init>(Landroid/content/Context;Ljava/lang/String;IILjava/util/Collection;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/json/JSONObject;Lio/branch/referral/Branch$BranchLinkCreateListener;ZZ)V

    .line 125
    iget-object v1, p0, Lio/branch/referral/BranchUrlBuilder;->branchReferral_:Lio/branch/referral/Branch;

    invoke-virtual {v1, v0}, Lio/branch/referral/Branch;->generateShortLinkInternal(Lio/branch/referral/ServerRequestCreateUrl;)Ljava/lang/String;

    move-result-object v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return-object v0
.end method

.method public setDefaultToLongUrl(Z)Lio/branch/referral/BranchUrlBuilder;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Z)TT;"
        }
    .end annotation

    .line 113
    iput-boolean p1, p0, Lio/branch/referral/BranchUrlBuilder;->defaultToLongUrl_:Z

    return-object p0
.end method
