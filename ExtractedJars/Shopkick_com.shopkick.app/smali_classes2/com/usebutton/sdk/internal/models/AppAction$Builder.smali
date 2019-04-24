.class public Lcom/usebutton/sdk/internal/models/AppAction$Builder;
.super Ljava/lang/Object;
.source "AppAction.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/usebutton/sdk/internal/models/AppAction;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "Builder"
.end annotation


# instance fields
.field private mAppIcon:Lcom/usebutton/sdk/internal/models/Asset;

.field private mAppName:Ljava/lang/String;

.field private mAuthChallenge:Lcom/usebutton/sdk/internal/models/AuthChallenge;

.field private mBrowser:Lcom/usebutton/sdk/internal/models/Browser;

.field private mFooter:Lcom/usebutton/sdk/internal/models/Footer;

.field private mHeader:Lcom/usebutton/sdk/internal/models/Header;

.field private mId:Ljava/lang/String;

.field private mLinks:Lcom/usebutton/sdk/models/Link;

.field private mListBody:Lcom/usebutton/sdk/models/ListBody;

.field private mMaxAgeSeconds:I

.field private mPreview:Lcom/usebutton/sdk/internal/models/Preview;

.field private mProduct:Lcom/usebutton/sdk/internal/models/Product;

.field private mRequestTime:Ljava/lang/String;

.field private mSourceToken:Ljava/lang/String;

.field private mStoreId:Ljava/lang/String;

.field private mTapSignal:Ljava/lang/String;

.field private mTarget:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 247
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public build()Lcom/usebutton/sdk/internal/models/AppAction;
    .locals 12

    .line 352
    new-instance v11, Lcom/usebutton/sdk/internal/models/MetaInfo;

    iget v1, p0, Lcom/usebutton/sdk/internal/models/AppAction$Builder;->mMaxAgeSeconds:I

    iget-object v2, p0, Lcom/usebutton/sdk/internal/models/AppAction$Builder;->mId:Ljava/lang/String;

    iget-object v3, p0, Lcom/usebutton/sdk/internal/models/AppAction$Builder;->mStoreId:Ljava/lang/String;

    iget-object v4, p0, Lcom/usebutton/sdk/internal/models/AppAction$Builder;->mSourceToken:Ljava/lang/String;

    iget-object v5, p0, Lcom/usebutton/sdk/internal/models/AppAction$Builder;->mBrowser:Lcom/usebutton/sdk/internal/models/Browser;

    iget-object v6, p0, Lcom/usebutton/sdk/internal/models/AppAction$Builder;->mAppName:Ljava/lang/String;

    iget-object v7, p0, Lcom/usebutton/sdk/internal/models/AppAction$Builder;->mTarget:Ljava/lang/String;

    iget-object v8, p0, Lcom/usebutton/sdk/internal/models/AppAction$Builder;->mAppIcon:Lcom/usebutton/sdk/internal/models/Asset;

    iget-object v9, p0, Lcom/usebutton/sdk/internal/models/AppAction$Builder;->mRequestTime:Ljava/lang/String;

    iget-object v10, p0, Lcom/usebutton/sdk/internal/models/AppAction$Builder;->mTapSignal:Ljava/lang/String;

    move-object v0, v11

    invoke-direct/range {v0 .. v10}, Lcom/usebutton/sdk/internal/models/MetaInfo;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/usebutton/sdk/internal/models/Browser;Ljava/lang/String;Ljava/lang/String;Lcom/usebutton/sdk/internal/models/Asset;Ljava/lang/String;Ljava/lang/String;)V

    .line 355
    iget-object v0, p0, Lcom/usebutton/sdk/internal/models/AppAction$Builder;->mAuthChallenge:Lcom/usebutton/sdk/internal/models/AuthChallenge;

    if-eqz v0, :cond_0

    .line 356
    new-instance v1, Lcom/usebutton/sdk/internal/models/AppAction;

    iget-object v2, p0, Lcom/usebutton/sdk/internal/models/AppAction$Builder;->mPreview:Lcom/usebutton/sdk/internal/models/Preview;

    iget-object v3, p0, Lcom/usebutton/sdk/internal/models/AppAction$Builder;->mLinks:Lcom/usebutton/sdk/models/Link;

    invoke-direct {v1, v11, v2, v0, v3}, Lcom/usebutton/sdk/internal/models/AppAction;-><init>(Lcom/usebutton/sdk/internal/models/MetaInfo;Lcom/usebutton/sdk/internal/models/Preview;Lcom/usebutton/sdk/internal/models/AuthChallenge;Lcom/usebutton/sdk/models/Link;)V

    return-object v1

    .line 357
    :cond_0
    iget-object v4, p0, Lcom/usebutton/sdk/internal/models/AppAction$Builder;->mListBody:Lcom/usebutton/sdk/models/ListBody;

    if-eqz v4, :cond_1

    .line 358
    new-instance v6, Lcom/usebutton/sdk/internal/models/AppAction;

    iget-object v2, p0, Lcom/usebutton/sdk/internal/models/AppAction$Builder;->mPreview:Lcom/usebutton/sdk/internal/models/Preview;

    iget-object v3, p0, Lcom/usebutton/sdk/internal/models/AppAction$Builder;->mHeader:Lcom/usebutton/sdk/internal/models/Header;

    iget-object v5, p0, Lcom/usebutton/sdk/internal/models/AppAction$Builder;->mFooter:Lcom/usebutton/sdk/internal/models/Footer;

    move-object v0, v6

    move-object v1, v11

    invoke-direct/range {v0 .. v5}, Lcom/usebutton/sdk/internal/models/AppAction;-><init>(Lcom/usebutton/sdk/internal/models/MetaInfo;Lcom/usebutton/sdk/internal/models/Preview;Lcom/usebutton/sdk/internal/models/Header;Lcom/usebutton/sdk/models/ListBody;Lcom/usebutton/sdk/internal/models/Footer;)V

    return-object v6

    .line 359
    :cond_1
    iget-object v4, p0, Lcom/usebutton/sdk/internal/models/AppAction$Builder;->mProduct:Lcom/usebutton/sdk/internal/models/Product;

    if-eqz v4, :cond_2

    .line 360
    new-instance v6, Lcom/usebutton/sdk/internal/models/AppAction;

    iget-object v2, p0, Lcom/usebutton/sdk/internal/models/AppAction$Builder;->mPreview:Lcom/usebutton/sdk/internal/models/Preview;

    iget-object v3, p0, Lcom/usebutton/sdk/internal/models/AppAction$Builder;->mHeader:Lcom/usebutton/sdk/internal/models/Header;

    iget-object v5, p0, Lcom/usebutton/sdk/internal/models/AppAction$Builder;->mFooter:Lcom/usebutton/sdk/internal/models/Footer;

    move-object v0, v6

    move-object v1, v11

    invoke-direct/range {v0 .. v5}, Lcom/usebutton/sdk/internal/models/AppAction;-><init>(Lcom/usebutton/sdk/internal/models/MetaInfo;Lcom/usebutton/sdk/internal/models/Preview;Lcom/usebutton/sdk/internal/models/Header;Lcom/usebutton/sdk/internal/models/Product;Lcom/usebutton/sdk/internal/models/Footer;)V

    return-object v6

    .line 361
    :cond_2
    iget-object v0, p0, Lcom/usebutton/sdk/internal/models/AppAction$Builder;->mLinks:Lcom/usebutton/sdk/models/Link;

    if-eqz v0, :cond_3

    .line 362
    new-instance v1, Lcom/usebutton/sdk/internal/models/AppAction;

    invoke-direct {v1, v11, v0}, Lcom/usebutton/sdk/internal/models/AppAction;-><init>(Lcom/usebutton/sdk/internal/models/MetaInfo;Lcom/usebutton/sdk/models/Link;)V

    return-object v1

    .line 364
    :cond_3
    new-instance v0, Lcom/usebutton/sdk/internal/models/AppAction;

    iget-object v1, p0, Lcom/usebutton/sdk/internal/models/AppAction$Builder;->mPreview:Lcom/usebutton/sdk/internal/models/Preview;

    iget-object v2, p0, Lcom/usebutton/sdk/internal/models/AppAction$Builder;->mHeader:Lcom/usebutton/sdk/internal/models/Header;

    iget-object v3, p0, Lcom/usebutton/sdk/internal/models/AppAction$Builder;->mFooter:Lcom/usebutton/sdk/internal/models/Footer;

    invoke-direct {v0, v11, v1, v2, v3}, Lcom/usebutton/sdk/internal/models/AppAction;-><init>(Lcom/usebutton/sdk/internal/models/MetaInfo;Lcom/usebutton/sdk/internal/models/Preview;Lcom/usebutton/sdk/internal/models/Header;Lcom/usebutton/sdk/internal/models/Footer;)V

    return-object v0
.end method

.method public withAffiliatedLink(Lcom/usebutton/sdk/models/Link;)Lcom/usebutton/sdk/internal/models/AppAction$Builder;
    .locals 0

    .line 342
    iput-object p1, p0, Lcom/usebutton/sdk/internal/models/AppAction$Builder;->mLinks:Lcom/usebutton/sdk/models/Link;

    return-object p0
.end method

.method public withAppIcon(Lcom/usebutton/sdk/internal/models/Asset;)Lcom/usebutton/sdk/internal/models/AppAction$Builder;
    .locals 0

    .line 302
    iput-object p1, p0, Lcom/usebutton/sdk/internal/models/AppAction$Builder;->mAppIcon:Lcom/usebutton/sdk/internal/models/Asset;

    return-object p0
.end method

.method public withAppName(Ljava/lang/String;)Lcom/usebutton/sdk/internal/models/AppAction$Builder;
    .locals 0

    .line 287
    iput-object p1, p0, Lcom/usebutton/sdk/internal/models/AppAction$Builder;->mAppName:Ljava/lang/String;

    return-object p0
.end method

.method public withAuthChallenge(Lcom/usebutton/sdk/internal/models/AuthChallenge;)Lcom/usebutton/sdk/internal/models/AppAction$Builder;
    .locals 0

    .line 347
    iput-object p1, p0, Lcom/usebutton/sdk/internal/models/AppAction$Builder;->mAuthChallenge:Lcom/usebutton/sdk/internal/models/AuthChallenge;

    return-object p0
.end method

.method public withBrowser(Lcom/usebutton/sdk/internal/models/Browser;)Lcom/usebutton/sdk/internal/models/AppAction$Builder;
    .locals 0

    .line 337
    iput-object p1, p0, Lcom/usebutton/sdk/internal/models/AppAction$Builder;->mBrowser:Lcom/usebutton/sdk/internal/models/Browser;

    return-object p0
.end method

.method public withFooter(Lcom/usebutton/sdk/internal/models/Footer;)Lcom/usebutton/sdk/internal/models/AppAction$Builder;
    .locals 0

    .line 332
    iput-object p1, p0, Lcom/usebutton/sdk/internal/models/AppAction$Builder;->mFooter:Lcom/usebutton/sdk/internal/models/Footer;

    return-object p0
.end method

.method public withHeader(Lcom/usebutton/sdk/internal/models/Header;)Lcom/usebutton/sdk/internal/models/AppAction$Builder;
    .locals 0

    .line 317
    iput-object p1, p0, Lcom/usebutton/sdk/internal/models/AppAction$Builder;->mHeader:Lcom/usebutton/sdk/internal/models/Header;

    return-object p0
.end method

.method public withId(Ljava/lang/String;)Lcom/usebutton/sdk/internal/models/AppAction$Builder;
    .locals 0

    .line 272
    iput-object p1, p0, Lcom/usebutton/sdk/internal/models/AppAction$Builder;->mId:Ljava/lang/String;

    return-object p0
.end method

.method public withListBody(Lcom/usebutton/sdk/models/ListBody;)Lcom/usebutton/sdk/internal/models/AppAction$Builder;
    .locals 0

    .line 322
    iput-object p1, p0, Lcom/usebutton/sdk/internal/models/AppAction$Builder;->mListBody:Lcom/usebutton/sdk/models/ListBody;

    return-object p0
.end method

.method public withMaxAgeSeconds(I)Lcom/usebutton/sdk/internal/models/AppAction$Builder;
    .locals 0

    .line 267
    iput p1, p0, Lcom/usebutton/sdk/internal/models/AppAction$Builder;->mMaxAgeSeconds:I

    return-object p0
.end method

.method public withPreview(Lcom/usebutton/sdk/internal/models/Preview;)Lcom/usebutton/sdk/internal/models/AppAction$Builder;
    .locals 0

    .line 312
    iput-object p1, p0, Lcom/usebutton/sdk/internal/models/AppAction$Builder;->mPreview:Lcom/usebutton/sdk/internal/models/Preview;

    return-object p0
.end method

.method public withProduct(Lcom/usebutton/sdk/internal/models/Product;)Lcom/usebutton/sdk/internal/models/AppAction$Builder;
    .locals 0

    .line 327
    iput-object p1, p0, Lcom/usebutton/sdk/internal/models/AppAction$Builder;->mProduct:Lcom/usebutton/sdk/internal/models/Product;

    return-object p0
.end method

.method public withRequestTime(Ljava/lang/String;)Lcom/usebutton/sdk/internal/models/AppAction$Builder;
    .locals 0

    .line 307
    iput-object p1, p0, Lcom/usebutton/sdk/internal/models/AppAction$Builder;->mRequestTime:Ljava/lang/String;

    return-object p0
.end method

.method public withSourceToken(Ljava/lang/String;)Lcom/usebutton/sdk/internal/models/AppAction$Builder;
    .locals 0

    .line 282
    iput-object p1, p0, Lcom/usebutton/sdk/internal/models/AppAction$Builder;->mSourceToken:Ljava/lang/String;

    return-object p0
.end method

.method public withStoreId(Ljava/lang/String;)Lcom/usebutton/sdk/internal/models/AppAction$Builder;
    .locals 0

    .line 277
    iput-object p1, p0, Lcom/usebutton/sdk/internal/models/AppAction$Builder;->mStoreId:Ljava/lang/String;

    return-object p0
.end method

.method public withTapSignal(Ljava/lang/String;)Lcom/usebutton/sdk/internal/models/AppAction$Builder;
    .locals 0

    .line 297
    iput-object p1, p0, Lcom/usebutton/sdk/internal/models/AppAction$Builder;->mTapSignal:Ljava/lang/String;

    return-object p0
.end method

.method public withTarget(Ljava/lang/String;)Lcom/usebutton/sdk/internal/models/AppAction$Builder;
    .locals 0

    .line 292
    iput-object p1, p0, Lcom/usebutton/sdk/internal/models/AppAction$Builder;->mTarget:Ljava/lang/String;

    return-object p0
.end method
