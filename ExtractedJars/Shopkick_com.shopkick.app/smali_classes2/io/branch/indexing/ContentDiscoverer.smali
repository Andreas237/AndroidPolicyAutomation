.class public Lio/branch/indexing/ContentDiscoverer;
.super Ljava/lang/Object;
.source "ContentDiscoverer.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lio/branch/indexing/ContentDiscoverer$HashHelper;
    }
.end annotation


# static fields
.field private static final COLLECTION_VIEW_KEY_PREFIX:Ljava/lang/String; = "$"

.field private static final CONTENT_DATA_KEY:Ljava/lang/String; = "cd"

.field private static final CONTENT_KEYS_KEY:Ljava/lang/String; = "ck"

.field private static final CONTENT_LINK_KEY:Ljava/lang/String; = "cl"

.field private static final CONTENT_META_DATA_KEY:Ljava/lang/String; = "cm"

.field private static final ENABLE_SCROLL_WATCH:Ljava/lang/String; = "bnc_esw"

.field private static final ENTITIES_KEY:Ljava/lang/String; = "e"

.field private static final NAV_PATH_KEY:Ljava/lang/String; = "n"

.field private static final PACKAGE_NAME_KEY:Ljava/lang/String; = "p"

.field private static final RECYCLER_VIEW:Ljava/lang/String; = "RecyclerView"

.field private static final REFERRAL_LINK_KEY:Ljava/lang/String; = "rl"

.field private static final SCROLL_SETTLE_TIME:I = 0x5dc

.field private static final TIME_STAMP_CLOSE_KEY:Ljava/lang/String; = "tc"

.field private static final TIME_STAMP_KEY:Ljava/lang/String; = "ts"

.field private static final VIEW_KEY:Ljava/lang/String; = "v"

.field private static final VIEW_SETTLE_TIME:I = 0x3e8

.field private static thisInstance_:Lio/branch/indexing/ContentDiscoverer;


# instance fields
.field private cdManifest_:Lio/branch/indexing/ContentDiscoveryManifest;

.field private contentEvent_:Lorg/json/JSONObject;

.field private discoveredViewList_:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private discoveryRepeatCnt_:I

.field private handler_:Landroid/os/Handler;

.field private final hashHelper_:Lio/branch/indexing/ContentDiscoverer$HashHelper;

.field private lastActivityReference_:Ljava/lang/ref/WeakReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ref/WeakReference<",
            "Landroid/app/Activity;",
            ">;"
        }
    .end annotation
.end field

.field private maxDiscoveryRepeatCnt:I

.field private readContentRunnable:Ljava/lang/Runnable;

.field private readListRunnable:Ljava/lang/Runnable;

.field private referredUrl_:Ljava/lang/String;

.field private scrollChangedListener:Landroid/view/ViewTreeObserver$OnScrollChangedListener;

.field private final viewTreeObserverMap:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/ref/WeakReference<",
            "Landroid/view/ViewTreeObserver;",
            ">;>;"
        }
    .end annotation
.end field


# direct methods
.method private constructor <init>()V
    .locals 1

    .line 76
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/16 v0, 0xf

    .line 45
    iput v0, p0, Lio/branch/indexing/ContentDiscoverer;->maxDiscoveryRepeatCnt:I

    .line 67
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lio/branch/indexing/ContentDiscoverer;->discoveredViewList_:Ljava/util/ArrayList;

    .line 141
    new-instance v0, Lio/branch/indexing/ContentDiscoverer$1;

    invoke-direct {v0, p0}, Lio/branch/indexing/ContentDiscoverer$1;-><init>(Lio/branch/indexing/ContentDiscoverer;)V

    iput-object v0, p0, Lio/branch/indexing/ContentDiscoverer;->readContentRunnable:Ljava/lang/Runnable;

    .line 306
    new-instance v0, Lio/branch/indexing/ContentDiscoverer$2;

    invoke-direct {v0, p0}, Lio/branch/indexing/ContentDiscoverer$2;-><init>(Lio/branch/indexing/ContentDiscoverer;)V

    iput-object v0, p0, Lio/branch/indexing/ContentDiscoverer;->scrollChangedListener:Landroid/view/ViewTreeObserver$OnScrollChangedListener;

    .line 315
    new-instance v0, Lio/branch/indexing/ContentDiscoverer$3;

    invoke-direct {v0, p0}, Lio/branch/indexing/ContentDiscoverer$3;-><init>(Lio/branch/indexing/ContentDiscoverer;)V

    iput-object v0, p0, Lio/branch/indexing/ContentDiscoverer;->readListRunnable:Ljava/lang/Runnable;

    .line 77
    new-instance v0, Landroid/os/Handler;

    invoke-direct {v0}, Landroid/os/Handler;-><init>()V

    iput-object v0, p0, Lio/branch/indexing/ContentDiscoverer;->handler_:Landroid/os/Handler;

    .line 78
    new-instance v0, Lio/branch/indexing/ContentDiscoverer$HashHelper;

    invoke-direct {v0, p0}, Lio/branch/indexing/ContentDiscoverer$HashHelper;-><init>(Lio/branch/indexing/ContentDiscoverer;)V

    iput-object v0, p0, Lio/branch/indexing/ContentDiscoverer;->hashHelper_:Lio/branch/indexing/ContentDiscoverer$HashHelper;

    .line 79
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lio/branch/indexing/ContentDiscoverer;->viewTreeObserverMap:Ljava/util/Map;

    return-void
.end method

.method static synthetic access$000(Lio/branch/indexing/ContentDiscoverer;)I
    .locals 0

    .line 35
    iget p0, p0, Lio/branch/indexing/ContentDiscoverer;->discoveryRepeatCnt_:I

    return p0
.end method

.method static synthetic access$008(Lio/branch/indexing/ContentDiscoverer;)I
    .locals 2

    .line 35
    iget v0, p0, Lio/branch/indexing/ContentDiscoverer;->discoveryRepeatCnt_:I

    add-int/lit8 v1, v0, 0x1

    iput v1, p0, Lio/branch/indexing/ContentDiscoverer;->discoveryRepeatCnt_:I

    return v0
.end method

.method static synthetic access$100(Lio/branch/indexing/ContentDiscoverer;)Lio/branch/indexing/ContentDiscoveryManifest;
    .locals 0

    .line 35
    iget-object p0, p0, Lio/branch/indexing/ContentDiscoverer;->cdManifest_:Lio/branch/indexing/ContentDiscoveryManifest;

    return-object p0
.end method

.method static synthetic access$1000(Lio/branch/indexing/ContentDiscoverer;)Landroid/os/Handler;
    .locals 0

    .line 35
    iget-object p0, p0, Lio/branch/indexing/ContentDiscoverer;->handler_:Landroid/os/Handler;

    return-object p0
.end method

.method static synthetic access$1100(Lio/branch/indexing/ContentDiscoverer;)Ljava/lang/Runnable;
    .locals 0

    .line 35
    iget-object p0, p0, Lio/branch/indexing/ContentDiscoverer;->readListRunnable:Ljava/lang/Runnable;

    return-object p0
.end method

.method static synthetic access$200(Lio/branch/indexing/ContentDiscoverer;)Ljava/lang/ref/WeakReference;
    .locals 0

    .line 35
    iget-object p0, p0, Lio/branch/indexing/ContentDiscoverer;->lastActivityReference_:Ljava/lang/ref/WeakReference;

    return-object p0
.end method

.method static synthetic access$300(Lio/branch/indexing/ContentDiscoverer;)Lorg/json/JSONObject;
    .locals 0

    .line 35
    iget-object p0, p0, Lio/branch/indexing/ContentDiscoverer;->contentEvent_:Lorg/json/JSONObject;

    return-object p0
.end method

.method static synthetic access$302(Lio/branch/indexing/ContentDiscoverer;Lorg/json/JSONObject;)Lorg/json/JSONObject;
    .locals 0

    .line 35
    iput-object p1, p0, Lio/branch/indexing/ContentDiscoverer;->contentEvent_:Lorg/json/JSONObject;

    return-object p1
.end method

.method static synthetic access$400(Lio/branch/indexing/ContentDiscoverer;)Ljava/lang/String;
    .locals 0

    .line 35
    iget-object p0, p0, Lio/branch/indexing/ContentDiscoverer;->referredUrl_:Ljava/lang/String;

    return-object p0
.end method

.method static synthetic access$500(Lio/branch/indexing/ContentDiscoverer;Lorg/json/JSONArray;Lorg/json/JSONArray;Lorg/json/JSONArray;Landroid/app/Activity;Z)V
    .locals 0

    .line 35
    invoke-direct/range {p0 .. p5}, Lio/branch/indexing/ContentDiscoverer;->discoverContentData(Lorg/json/JSONArray;Lorg/json/JSONArray;Lorg/json/JSONArray;Landroid/app/Activity;Z)V

    return-void
.end method

.method static synthetic access$600(Lio/branch/indexing/ContentDiscoverer;)Ljava/util/ArrayList;
    .locals 0

    .line 35
    iget-object p0, p0, Lio/branch/indexing/ContentDiscoverer;->discoveredViewList_:Ljava/util/ArrayList;

    return-object p0
.end method

.method static synthetic access$700(Lio/branch/indexing/ContentDiscoverer;Landroid/view/ViewGroup;Lorg/json/JSONArray;Landroid/content/res/Resources;)V
    .locals 0

    .line 35
    invoke-direct {p0, p1, p2, p3}, Lio/branch/indexing/ContentDiscoverer;->discoverContentKeys(Landroid/view/ViewGroup;Lorg/json/JSONArray;Landroid/content/res/Resources;)V

    return-void
.end method

.method static synthetic access$800(Lio/branch/indexing/ContentDiscoverer;)I
    .locals 0

    .line 35
    iget p0, p0, Lio/branch/indexing/ContentDiscoverer;->maxDiscoveryRepeatCnt:I

    return p0
.end method

.method static synthetic access$802(Lio/branch/indexing/ContentDiscoverer;I)I
    .locals 0

    .line 35
    iput p1, p0, Lio/branch/indexing/ContentDiscoverer;->maxDiscoveryRepeatCnt:I

    return p1
.end method

.method static synthetic access$900(Lio/branch/indexing/ContentDiscoverer;)Ljava/lang/Runnable;
    .locals 0

    .line 35
    iget-object p0, p0, Lio/branch/indexing/ContentDiscoverer;->readContentRunnable:Ljava/lang/Runnable;

    return-object p0
.end method

.method private discoverContent(Landroid/app/Activity;)V
    .locals 3

    const/4 v0, 0x0

    .line 124
    iput v0, p0, Lio/branch/indexing/ContentDiscoverer;->discoveryRepeatCnt_:I

    .line 125
    iget-object v0, p0, Lio/branch/indexing/ContentDiscoverer;->discoveredViewList_:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    iget-object v1, p0, Lio/branch/indexing/ContentDiscoverer;->cdManifest_:Lio/branch/indexing/ContentDiscoveryManifest;

    invoke-virtual {v1}, Lio/branch/indexing/ContentDiscoveryManifest;->getMaxViewHistorySize()I

    move-result v1

    if-ge v0, v1, :cond_0

    .line 126
    iget-object v0, p0, Lio/branch/indexing/ContentDiscoverer;->handler_:Landroid/os/Handler;

    iget-object v1, p0, Lio/branch/indexing/ContentDiscoverer;->readContentRunnable:Ljava/lang/Runnable;

    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    .line 127
    new-instance v0, Ljava/lang/ref/WeakReference;

    invoke-direct {v0, p1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object v0, p0, Lio/branch/indexing/ContentDiscoverer;->lastActivityReference_:Ljava/lang/ref/WeakReference;

    .line 128
    iget-object p1, p0, Lio/branch/indexing/ContentDiscoverer;->handler_:Landroid/os/Handler;

    iget-object v0, p0, Lio/branch/indexing/ContentDiscoverer;->readContentRunnable:Ljava/lang/Runnable;

    const-wide/16 v1, 0x3e8

    invoke-virtual {p1, v0, v1, v2}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    :cond_0
    return-void
.end method

.method private discoverContentData(Lorg/json/JSONArray;Lorg/json/JSONArray;Lorg/json/JSONArray;Landroid/app/Activity;Z)V
    .locals 8

    const/4 v0, 0x0

    .line 240
    :goto_0
    :try_start_0
    invoke-virtual {p1}, Lorg/json/JSONArray;->length()I

    move-result v1

    if-ge v0, v1, :cond_1

    .line 241
    invoke-virtual {p1, v0}, Lorg/json/JSONArray;->getString(I)Ljava/lang/String;

    move-result-object v3

    const-string v1, "$"

    .line 242
    invoke-virtual {v3, v1}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_0

    move-object v2, p0

    move-object v4, p4

    move v5, p5

    move-object v6, p2

    move-object v7, p3

    .line 243
    invoke-direct/range {v2 .. v7}, Lio/branch/indexing/ContentDiscoverer;->discoverListViewContentData(Ljava/lang/String;Landroid/app/Activity;ZLorg/json/JSONArray;Lorg/json/JSONArray;)V

    goto :goto_1

    .line 245
    :cond_0
    invoke-virtual {p4}, Landroid/app/Activity;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    invoke-virtual {p1, v0}, Lorg/json/JSONArray;->getString(I)Ljava/lang/String;

    move-result-object v2

    const-string v4, "id"

    invoke-virtual {p4}, Landroid/app/Activity;->getPackageName()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v1, v2, v4, v5}, Landroid/content/res/Resources;->getIdentifier(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)I

    move-result v1

    .line 246
    invoke-virtual {p4, v1}, Landroid/app/Activity;->findViewById(I)Landroid/view/View;

    move-result-object v4

    move-object v2, p0

    move v5, p5

    move-object v6, p2

    move-object v7, p3

    .line 247
    invoke-direct/range {v2 .. v7}, Lio/branch/indexing/ContentDiscoverer;->updateElementData(Ljava/lang/String;Landroid/view/View;ZLorg/json/JSONArray;Lorg/json/JSONArray;)V
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    :goto_1
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :catch_0
    :cond_1
    return-void
.end method

.method private discoverContentKeys(Landroid/view/ViewGroup;Lorg/json/JSONArray;Landroid/content/res/Resources;)V
    .locals 4

    const/4 v0, 0x0

    .line 198
    :goto_0
    invoke-virtual {p1}, Landroid/view/ViewGroup;->getChildCount()I

    move-result v1

    if-ge v0, v1, :cond_4

    .line 199
    invoke-virtual {p1, v0}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v1

    .line 200
    invoke-virtual {v1}, Landroid/view/View;->getVisibility()I

    move-result v2

    if-nez v2, :cond_3

    .line 201
    instance-of v2, v1, Landroid/widget/AbsListView;

    if-nez v2, :cond_2

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v2

    const-string v3, "RecyclerView"

    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    goto :goto_1

    .line 203
    :cond_0
    instance-of v2, v1, Landroid/view/ViewGroup;

    if-eqz v2, :cond_1

    .line 204
    check-cast v1, Landroid/view/ViewGroup;

    invoke-direct {p0, v1, p2, p3}, Lio/branch/indexing/ContentDiscoverer;->discoverContentKeys(Landroid/view/ViewGroup;Lorg/json/JSONArray;Landroid/content/res/Resources;)V

    goto :goto_2

    .line 205
    :cond_1
    instance-of v2, v1, Landroid/widget/TextView;

    if-eqz v2, :cond_3

    .line 206
    invoke-direct {p0, v1, p3}, Lio/branch/indexing/ContentDiscoverer;->getViewName(Landroid/view/View;Landroid/content/res/Resources;)Ljava/lang/String;

    move-result-object v1

    .line 207
    invoke-virtual {p2, v1}, Lorg/json/JSONArray;->put(Ljava/lang/Object;)Lorg/json/JSONArray;

    goto :goto_2

    .line 202
    :cond_2
    :goto_1
    check-cast v1, Landroid/view/ViewGroup;

    invoke-direct {p0, v1, p3, p2}, Lio/branch/indexing/ContentDiscoverer;->discoverListViewContentKeys(Landroid/view/ViewGroup;Landroid/content/res/Resources;Lorg/json/JSONArray;)V

    :cond_3
    :goto_2
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_4
    return-void
.end method

.method private discoverListViewContentData(Ljava/lang/String;Landroid/app/Activity;ZLorg/json/JSONArray;Lorg/json/JSONArray;)V
    .locals 9

    .line 256
    new-instance v0, Lorg/json/JSONObject;

    invoke-direct {v0}, Lorg/json/JSONObject;-><init>()V

    .line 257
    invoke-virtual {p5, p1}, Lorg/json/JSONArray;->put(Ljava/lang/Object;)Lorg/json/JSONArray;

    .line 258
    invoke-virtual {p4, v0}, Lorg/json/JSONArray;->put(Ljava/lang/Object;)Lorg/json/JSONArray;

    const-string p4, "$"

    const-string p5, ""

    .line 259
    invoke-virtual {p1, p4, p5}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;

    move-result-object p1

    .line 261
    :try_start_0
    new-instance p4, Lorg/json/JSONObject;

    invoke-direct {p4, p1}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    .line 262
    invoke-virtual {p4}, Lorg/json/JSONObject;->length()I

    move-result p5

    if-lez p5, :cond_8

    .line 263
    invoke-virtual {p4}, Lorg/json/JSONObject;->keys()Ljava/util/Iterator;

    move-result-object p5

    invoke-interface {p5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p5

    check-cast p5, Ljava/lang/String;

    .line 264
    invoke-virtual {p2}, Landroid/app/Activity;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    const-string v2, "id"

    invoke-virtual {p2}, Landroid/app/Activity;->getPackageName()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, p5, v2, v3}, Landroid/content/res/Resources;->getIdentifier(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)I

    move-result v1

    .line 267
    invoke-virtual {p2}, Landroid/app/Activity;->getCurrentFocus()Landroid/view/View;

    move-result-object v2

    if-eqz v2, :cond_0

    invoke-virtual {p2}, Landroid/app/Activity;->getCurrentFocus()Landroid/view/View;

    move-result-object v2

    invoke-virtual {v2, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v2

    goto :goto_0

    :cond_0
    const/4 v2, 0x0

    :goto_0
    if-nez v2, :cond_1

    .line 269
    invoke-virtual {p2, v1}, Landroid/app/Activity;->findViewById(I)Landroid/view/View;

    move-result-object v2

    :cond_1
    if-eqz v2, :cond_8

    .line 271
    instance-of v1, v2, Landroid/view/ViewGroup;

    if-eqz v1, :cond_8

    .line 272
    check-cast v2, Landroid/view/ViewGroup;

    .line 273
    invoke-virtual {p4, p5}, Lorg/json/JSONObject;->getJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    move-result-object p5

    .line 274
    invoke-virtual {p5}, Lorg/json/JSONArray;->length()I

    move-result v1

    new-array v1, v1, [I

    const/4 v3, 0x0

    move v4, v3

    .line 275
    :goto_1
    invoke-virtual {p5}, Lorg/json/JSONArray;->length()I

    move-result v5

    if-ge v4, v5, :cond_2

    .line 276
    invoke-virtual {p2}, Landroid/app/Activity;->getResources()Landroid/content/res/Resources;

    move-result-object v5

    invoke-virtual {p5, v4}, Lorg/json/JSONArray;->getString(I)Ljava/lang/String;

    move-result-object v6

    const-string v7, "id"

    invoke-virtual {p2}, Landroid/app/Activity;->getPackageName()Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v5, v6, v7, v8}, Landroid/content/res/Resources;->getIdentifier(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)I

    move-result v5

    aput v5, v1, v4

    add-int/lit8 v4, v4, 0x1

    goto :goto_1

    .line 278
    :cond_2
    instance-of p2, v2, Landroid/widget/AbsListView;

    if-eqz p2, :cond_3

    move-object p2, v2

    check-cast p2, Landroid/widget/AbsListView;

    invoke-virtual {p2}, Landroid/widget/AbsListView;->getFirstVisiblePosition()I

    move-result p2

    goto :goto_2

    :cond_3
    move p2, v3

    :goto_2
    move v4, v3

    .line 279
    :goto_3
    invoke-virtual {v2}, Landroid/view/ViewGroup;->getChildCount()I

    move-result v5

    if-ge v4, v5, :cond_6

    .line 280
    invoke-virtual {v2, v4}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v5

    if-eqz v5, :cond_5

    .line 281
    new-instance v5, Lorg/json/JSONObject;

    invoke-direct {v5}, Lorg/json/JSONObject;-><init>()V

    .line 282
    new-instance v6, Ljava/lang/StringBuilder;

    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    const-string v7, ""

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    add-int v7, v4, p2

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v0, v6, v5}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    move v6, v3

    .line 283
    :goto_4
    array-length v7, v1

    if-ge v6, v7, :cond_5

    .line 284
    invoke-virtual {v2, v4}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v7

    if-eqz v7, :cond_4

    .line 285
    invoke-virtual {v2, v4}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v7

    aget v8, v1, v6

    invoke-virtual {v7, v8}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v7

    .line 286
    instance-of v8, v7, Landroid/widget/TextView;

    if-eqz v8, :cond_4

    .line 287
    invoke-virtual {p5, v6}, Lorg/json/JSONArray;->getString(I)Ljava/lang/String;

    move-result-object v8

    invoke-direct {p0, v7, p3}, Lio/branch/indexing/ContentDiscoverer;->getTextViewValue(Landroid/view/View;Z)Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v5, v8, v7}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    :cond_4
    add-int/lit8 v6, v6, 0x1

    goto :goto_4

    :cond_5
    add-int/lit8 v4, v4, 0x1

    goto :goto_3

    :cond_6
    const-string p2, "bnc_esw"

    .line 293
    invoke-virtual {p4, p2}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result p2

    if-eqz p2, :cond_7

    const-string p2, "bnc_esw"

    invoke-virtual {p4, p2}, Lorg/json/JSONObject;->getBoolean(Ljava/lang/String;)Z

    move-result p2

    if-eqz p2, :cond_7

    const/4 v3, 0x1

    :cond_7
    if-eqz v3, :cond_8

    .line 294
    iget-object p2, p0, Lio/branch/indexing/ContentDiscoverer;->viewTreeObserverMap:Ljava/util/Map;

    invoke-interface {p2, p1}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result p2

    if-nez p2, :cond_8

    .line 295
    invoke-virtual {v2}, Landroid/view/ViewGroup;->getViewTreeObserver()Landroid/view/ViewTreeObserver;

    move-result-object p2

    iget-object p3, p0, Lio/branch/indexing/ContentDiscoverer;->scrollChangedListener:Landroid/view/ViewTreeObserver$OnScrollChangedListener;

    invoke-virtual {p2, p3}, Landroid/view/ViewTreeObserver;->addOnScrollChangedListener(Landroid/view/ViewTreeObserver$OnScrollChangedListener;)V

    .line 296
    iget-object p2, p0, Lio/branch/indexing/ContentDiscoverer;->viewTreeObserverMap:Ljava/util/Map;

    new-instance p3, Ljava/lang/ref/WeakReference;

    invoke-virtual {v2}, Landroid/view/ViewGroup;->getViewTreeObserver()Landroid/view/ViewTreeObserver;

    move-result-object p4

    invoke-direct {p3, p4}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    invoke-interface {p2, p1, p3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_5

    :catch_0
    move-exception p1

    .line 302
    invoke-virtual {p1}, Lorg/json/JSONException;->printStackTrace()V

    :cond_8
    :goto_5
    return-void
.end method

.method private discoverListViewContentKeys(Landroid/view/ViewGroup;Landroid/content/res/Resources;Lorg/json/JSONArray;)V
    .locals 3

    .line 214
    new-instance v0, Lorg/json/JSONObject;

    invoke-direct {v0}, Lorg/json/JSONObject;-><init>()V

    if-eqz p1, :cond_3

    .line 215
    invoke-virtual {p1}, Landroid/view/ViewGroup;->getChildCount()I

    move-result v1

    const/4 v2, -0x1

    if-le v1, v2, :cond_3

    .line 218
    invoke-virtual {p1}, Landroid/view/ViewGroup;->getChildCount()I

    move-result v1

    const/4 v2, 0x1

    if-le v1, v2, :cond_0

    goto :goto_0

    :cond_0
    const/4 v2, 0x0

    :goto_0
    invoke-virtual {p1, v2}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v1

    if-eqz v1, :cond_3

    .line 220
    new-instance v2, Lorg/json/JSONArray;

    invoke-direct {v2}, Lorg/json/JSONArray;-><init>()V

    .line 222
    :try_start_0
    invoke-direct {p0, p1, p2}, Lio/branch/indexing/ContentDiscoverer;->getViewName(Landroid/view/View;Landroid/content/res/Resources;)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_1

    :catch_0
    move-exception p1

    .line 224
    invoke-virtual {p1}, Lorg/json/JSONException;->printStackTrace()V

    .line 226
    :goto_1
    instance-of p1, v1, Landroid/view/ViewGroup;

    if-eqz p1, :cond_1

    .line 227
    check-cast v1, Landroid/view/ViewGroup;

    invoke-direct {p0, v1, v2, p2}, Lio/branch/indexing/ContentDiscoverer;->discoverContentKeys(Landroid/view/ViewGroup;Lorg/json/JSONArray;Landroid/content/res/Resources;)V

    goto :goto_2

    .line 228
    :cond_1
    instance-of p1, v1, Landroid/widget/TextView;

    if-eqz p1, :cond_2

    .line 229
    invoke-direct {p0, v1, p2}, Lio/branch/indexing/ContentDiscoverer;->getViewName(Landroid/view/View;Landroid/content/res/Resources;)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v2, p1}, Lorg/json/JSONArray;->put(Ljava/lang/Object;)Lorg/json/JSONArray;

    .line 231
    :cond_2
    :goto_2
    invoke-virtual {v0}, Lorg/json/JSONObject;->length()I

    move-result p1

    if-lez p1, :cond_3

    .line 232
    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    const-string p2, "$"

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p3, p1}, Lorg/json/JSONArray;->put(Ljava/lang/Object;)Lorg/json/JSONArray;

    :cond_3
    return-void
.end method

.method public static getInstance()Lio/branch/indexing/ContentDiscoverer;
    .locals 1

    .line 70
    sget-object v0, Lio/branch/indexing/ContentDiscoverer;->thisInstance_:Lio/branch/indexing/ContentDiscoverer;

    if-nez v0, :cond_0

    .line 71
    new-instance v0, Lio/branch/indexing/ContentDiscoverer;

    invoke-direct {v0}, Lio/branch/indexing/ContentDiscoverer;-><init>()V

    sput-object v0, Lio/branch/indexing/ContentDiscoverer;->thisInstance_:Lio/branch/indexing/ContentDiscoverer;

    .line 73
    :cond_0
    sget-object v0, Lio/branch/indexing/ContentDiscoverer;->thisInstance_:Lio/branch/indexing/ContentDiscoverer;

    return-object v0
.end method

.method private getTextViewValue(Landroid/view/View;Z)Ljava/lang/String;
    .locals 3

    .line 333
    check-cast p1, Landroid/widget/TextView;

    .line 334
    invoke-virtual {p1}, Landroid/widget/TextView;->getText()Ljava/lang/CharSequence;

    move-result-object v0

    if-eqz v0, :cond_1

    .line 335
    invoke-virtual {p1}, Landroid/widget/TextView;->getText()Ljava/lang/CharSequence;

    move-result-object v0

    invoke-interface {v0}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {p1}, Landroid/widget/TextView;->getText()Ljava/lang/CharSequence;

    move-result-object p1

    invoke-interface {p1}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result p1

    iget-object v2, p0, Lio/branch/indexing/ContentDiscoverer;->cdManifest_:Lio/branch/indexing/ContentDiscoveryManifest;

    invoke-virtual {v2}, Lio/branch/indexing/ContentDiscoveryManifest;->getMaxTextLen()I

    move-result v2

    invoke-static {p1, v2}, Ljava/lang/Math;->min(II)I

    move-result p1

    invoke-virtual {v0, v1, p1}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object p1

    if-eqz p2, :cond_0

    goto :goto_0

    .line 336
    :cond_0
    iget-object p2, p0, Lio/branch/indexing/ContentDiscoverer;->hashHelper_:Lio/branch/indexing/ContentDiscoverer$HashHelper;

    invoke-virtual {p2, p1}, Lio/branch/indexing/ContentDiscoverer$HashHelper;->hashContent(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    goto :goto_0

    :cond_1
    const/4 p1, 0x0

    :goto_0
    return-object p1
.end method

.method private getViewName(Landroid/view/View;Landroid/content/res/Resources;)Ljava/lang/String;
    .locals 1

    .line 323
    invoke-virtual {p1}, Landroid/view/View;->getId()I

    move-result v0

    invoke-static {v0}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v0

    .line 325
    :try_start_0
    invoke-virtual {p1}, Landroid/view/View;->getId()I

    move-result p1

    invoke-virtual {p2, p1}, Landroid/content/res/Resources;->getResourceEntryName(I)Ljava/lang/String;

    move-result-object v0
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    return-object v0
.end method

.method private updateElementData(Ljava/lang/String;Landroid/view/View;ZLorg/json/JSONArray;Lorg/json/JSONArray;)V
    .locals 1

    .line 343
    instance-of v0, p2, Landroid/widget/TextView;

    if-eqz v0, :cond_0

    .line 344
    invoke-direct {p0, p2, p3}, Lio/branch/indexing/ContentDiscoverer;->getTextViewValue(Landroid/view/View;Z)Ljava/lang/String;

    move-result-object p2

    .line 345
    invoke-virtual {p4, p2}, Lorg/json/JSONArray;->put(Ljava/lang/Object;)Lorg/json/JSONArray;

    .line 346
    invoke-virtual {p5, p1}, Lorg/json/JSONArray;->put(Ljava/lang/Object;)Lorg/json/JSONArray;

    :cond_0
    return-void
.end method

.method private updateLastViewTimeStampIfNeeded()V
    .locals 4

    .line 134
    :try_start_0
    iget-object v0, p0, Lio/branch/indexing/ContentDiscoverer;->contentEvent_:Lorg/json/JSONObject;

    if-eqz v0, :cond_0

    .line 135
    iget-object v0, p0, Lio/branch/indexing/ContentDiscoverer;->contentEvent_:Lorg/json/JSONObject;

    const-string/jumbo v1, "tc"

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v2

    invoke-virtual {v0, v1, v2, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;J)Lorg/json/JSONObject;
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    :cond_0
    return-void
.end method


# virtual methods
.method public discoverContent(Landroid/app/Activity;Ljava/lang/String;)V
    .locals 1

    .line 85
    invoke-static {p1}, Lio/branch/indexing/ContentDiscoveryManifest;->getInstance(Landroid/content/Context;)Lio/branch/indexing/ContentDiscoveryManifest;

    move-result-object v0

    iput-object v0, p0, Lio/branch/indexing/ContentDiscoverer;->cdManifest_:Lio/branch/indexing/ContentDiscoveryManifest;

    .line 86
    iput-object p2, p0, Lio/branch/indexing/ContentDiscoverer;->referredUrl_:Ljava/lang/String;

    .line 88
    iget-object p2, p0, Lio/branch/indexing/ContentDiscoverer;->cdManifest_:Lio/branch/indexing/ContentDiscoveryManifest;

    invoke-virtual {p2, p1}, Lio/branch/indexing/ContentDiscoveryManifest;->getCDPathProperties(Landroid/app/Activity;)Lio/branch/indexing/ContentDiscoveryManifest$CDPathProperties;

    move-result-object p2

    if-eqz p2, :cond_0

    .line 92
    invoke-virtual {p2}, Lio/branch/indexing/ContentDiscoveryManifest$CDPathProperties;->isSkipContentDiscovery()Z

    move-result p2

    if-nez p2, :cond_1

    .line 93
    invoke-direct {p0, p1}, Lio/branch/indexing/ContentDiscoverer;->discoverContent(Landroid/app/Activity;)V

    goto :goto_0

    .line 95
    :cond_0
    iget-object p2, p0, Lio/branch/indexing/ContentDiscoverer;->referredUrl_:Ljava/lang/String;

    invoke-static {p2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result p2

    if-nez p2, :cond_1

    .line 96
    invoke-direct {p0, p1}, Lio/branch/indexing/ContentDiscoverer;->discoverContent(Landroid/app/Activity;)V

    :cond_1
    :goto_0
    return-void
.end method

.method public getContentDiscoverDataForCloseRequest(Landroid/content/Context;)Lorg/json/JSONObject;
    .locals 4

    .line 352
    invoke-static {p1}, Lio/branch/referral/PrefHelper;->getInstance(Landroid/content/Context;)Lio/branch/referral/PrefHelper;

    move-result-object v0

    invoke-virtual {v0}, Lio/branch/referral/PrefHelper;->getBranchAnalyticsData()Lorg/json/JSONObject;

    move-result-object v0

    .line 353
    invoke-virtual {v0}, Lorg/json/JSONObject;->length()I

    move-result v1

    if-lez v1, :cond_0

    invoke-virtual {v0}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result v1

    iget-object v2, p0, Lio/branch/indexing/ContentDiscoverer;->cdManifest_:Lio/branch/indexing/ContentDiscoveryManifest;

    invoke-virtual {v2}, Lio/branch/indexing/ContentDiscoveryManifest;->getMaxPacketSize()I

    move-result v2

    if-ge v1, v2, :cond_0

    .line 354
    new-instance v1, Lorg/json/JSONObject;

    invoke-direct {v1}, Lorg/json/JSONObject;-><init>()V

    .line 356
    :try_start_0
    invoke-static {p1}, Lio/branch/indexing/ContentDiscoveryManifest;->getInstance(Landroid/content/Context;)Lio/branch/indexing/ContentDiscoveryManifest;

    move-result-object v2

    const-string v3, "mv"

    .line 357
    invoke-virtual {v2}, Lio/branch/indexing/ContentDiscoveryManifest;->getManifestVersion()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v3, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    move-result-object v2

    const-string v3, "e"

    .line 358
    invoke-virtual {v2, v3, v0}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    if-eqz p1, :cond_1

    const-string v0, "p"

    .line 360
    invoke-virtual {p1}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v0, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    const-string v0, "p"

    .line 361
    invoke-virtual {p1}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v0, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v0

    .line 365
    invoke-virtual {v0}, Lorg/json/JSONException;->printStackTrace()V

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    .line 368
    :cond_1
    :goto_0
    invoke-static {p1}, Lio/branch/referral/PrefHelper;->getInstance(Landroid/content/Context;)Lio/branch/referral/PrefHelper;

    move-result-object p1

    invoke-virtual {p1}, Lio/branch/referral/PrefHelper;->clearBranchAnalyticsData()V

    return-object v1
.end method

.method public onActivityStopped(Landroid/app/Activity;)V
    .locals 2

    .line 101
    iget-object v0, p0, Lio/branch/indexing/ContentDiscoverer;->lastActivityReference_:Ljava/lang/ref/WeakReference;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lio/branch/indexing/ContentDiscoverer;->lastActivityReference_:Ljava/lang/ref/WeakReference;

    .line 102
    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/app/Activity;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    .line 103
    iget-object p1, p0, Lio/branch/indexing/ContentDiscoverer;->handler_:Landroid/os/Handler;

    iget-object v0, p0, Lio/branch/indexing/ContentDiscoverer;->readContentRunnable:Ljava/lang/Runnable;

    invoke-virtual {p1, v0}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    const/4 p1, 0x0

    .line 104
    iput-object p1, p0, Lio/branch/indexing/ContentDiscoverer;->lastActivityReference_:Ljava/lang/ref/WeakReference;

    .line 106
    :cond_0
    invoke-direct {p0}, Lio/branch/indexing/ContentDiscoverer;->updateLastViewTimeStampIfNeeded()V

    .line 107
    iget-object p1, p0, Lio/branch/indexing/ContentDiscoverer;->viewTreeObserverMap:Ljava/util/Map;

    invoke-interface {p1}, Ljava/util/Map;->values()Ljava/util/Collection;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_1
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/ref/WeakReference;

    .line 108
    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/ViewTreeObserver;

    if-eqz v0, :cond_1

    .line 110
    iget-object v1, p0, Lio/branch/indexing/ContentDiscoverer;->scrollChangedListener:Landroid/view/ViewTreeObserver$OnScrollChangedListener;

    invoke-virtual {v0, v1}, Landroid/view/ViewTreeObserver;->removeOnScrollChangedListener(Landroid/view/ViewTreeObserver$OnScrollChangedListener;)V

    goto :goto_0

    .line 113
    :cond_2
    iget-object p1, p0, Lio/branch/indexing/ContentDiscoverer;->viewTreeObserverMap:Ljava/util/Map;

    invoke-interface {p1}, Ljava/util/Map;->clear()V

    return-void
.end method

.method public onSessionStarted(Landroid/app/Activity;Ljava/lang/String;)V
    .locals 1

    .line 117
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lio/branch/indexing/ContentDiscoverer;->discoveredViewList_:Ljava/util/ArrayList;

    .line 118
    invoke-virtual {p0, p1, p2}, Lio/branch/indexing/ContentDiscoverer;->discoverContent(Landroid/app/Activity;Ljava/lang/String;)V

    return-void
.end method
