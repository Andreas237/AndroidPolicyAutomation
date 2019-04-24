.class Lcom/moat/analytics/mobile/spck/z;
.super Ljava/lang/Object;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/moat/analytics/mobile/spck/z$a;
    }
.end annotation


# instance fields
.field a:Ljava/lang/String;

.field private b:Lcom/moat/analytics/mobile/spck/z$a;

.field private c:Lorg/json/JSONObject;

.field private d:Landroid/graphics/Rect;

.field private e:Landroid/graphics/Rect;

.field private f:Lorg/json/JSONObject;

.field private g:Lorg/json/JSONObject;

.field private h:Landroid/location/Location;

.field private i:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lcom/moat/analytics/mobile/spck/z;->i:Ljava/util/Map;

    const-string/jumbo v0, "{}"

    iput-object v0, p0, Lcom/moat/analytics/mobile/spck/z;->a:Ljava/lang/String;

    new-instance v0, Lcom/moat/analytics/mobile/spck/z$a;

    invoke-direct {v0}, Lcom/moat/analytics/mobile/spck/z$a;-><init>()V

    iput-object v0, p0, Lcom/moat/analytics/mobile/spck/z;->b:Lcom/moat/analytics/mobile/spck/z$a;

    return-void
.end method

.method static a(Landroid/graphics/Rect;Ljava/util/Set;)I
    .locals 10
    .annotation build Landroid/support/annotation/VisibleForTesting;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/graphics/Rect;",
            "Ljava/util/Set<",
            "Landroid/graphics/Rect;",
            ">;)I"
        }
    .end annotation

    invoke-interface {p1}, Ljava/util/Set;->isEmpty()Z

    move-result v0

    const/4 v1, 0x0

    if-nez v0, :cond_6

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {v0, p1}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    new-instance p1, Lcom/moat/analytics/mobile/spck/z$1;

    invoke-direct {p1}, Lcom/moat/analytics/mobile/spck/z$1;-><init>()V

    invoke-static {v0, p1}, Ljava/util/Collections;->sort(Ljava/util/List;Ljava/util/Comparator;)V

    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_0

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Landroid/graphics/Rect;

    iget v4, v3, Landroid/graphics/Rect;->left:I

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-interface {p1, v4}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iget v3, v3, Landroid/graphics/Rect;->right:I

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-interface {p1, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_0
    invoke-static {p1}, Ljava/util/Collections;->sort(Ljava/util/List;)V

    move v2, v1

    :goto_1
    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v3

    add-int/lit8 v3, v3, -0x1

    if-ge v1, v3, :cond_5

    invoke-interface {p1, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/Integer;

    add-int/lit8 v4, v1, 0x1

    invoke-interface {p1, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v5

    invoke-virtual {v3, v5}, Ljava/lang/Integer;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_1

    goto :goto_2

    :cond_1
    new-instance v3, Landroid/graphics/Rect;

    invoke-interface {p1, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Integer;

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    iget v5, p0, Landroid/graphics/Rect;->top:I

    invoke-interface {p1, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ljava/lang/Integer;

    invoke-virtual {v6}, Ljava/lang/Integer;->intValue()I

    move-result v6

    iget v7, p0, Landroid/graphics/Rect;->bottom:I

    invoke-direct {v3, v1, v5, v6, v7}, Landroid/graphics/Rect;-><init>(IIII)V

    iget v1, p0, Landroid/graphics/Rect;->top:I

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v5

    :cond_2
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    if-eqz v6, :cond_4

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Landroid/graphics/Rect;

    invoke-static {v6, v3}, Landroid/graphics/Rect;->intersects(Landroid/graphics/Rect;Landroid/graphics/Rect;)Z

    move-result v7

    if-eqz v7, :cond_2

    iget v7, v6, Landroid/graphics/Rect;->bottom:I

    if-le v7, v1, :cond_3

    invoke-virtual {v3}, Landroid/graphics/Rect;->width()I

    move-result v7

    iget v8, v6, Landroid/graphics/Rect;->bottom:I

    iget v9, v6, Landroid/graphics/Rect;->top:I

    invoke-static {v1, v9}, Ljava/lang/Math;->max(II)I

    move-result v1

    sub-int/2addr v8, v1

    mul-int/2addr v7, v8

    add-int/2addr v2, v7

    iget v1, v6, Landroid/graphics/Rect;->bottom:I

    :cond_3
    iget v6, v6, Landroid/graphics/Rect;->bottom:I

    iget v7, v3, Landroid/graphics/Rect;->bottom:I

    if-ne v6, v7, :cond_2

    :cond_4
    :goto_2
    move v1, v4

    goto :goto_1

    :cond_5
    move v1, v2

    :cond_6
    return v1
.end method

.method private static a(Landroid/util/DisplayMetrics;)Landroid/graphics/Rect;
    .locals 3

    iget v0, p0, Landroid/util/DisplayMetrics;->widthPixels:I

    iget p0, p0, Landroid/util/DisplayMetrics;->heightPixels:I

    new-instance v1, Landroid/graphics/Rect;

    const/4 v2, 0x0

    invoke-direct {v1, v2, v2, v0, p0}, Landroid/graphics/Rect;-><init>(IIII)V

    return-object v1
.end method

.method static a(Landroid/view/View;)Landroid/graphics/Rect;
    .locals 1

    if-eqz p0, :cond_0

    invoke-static {p0}, Lcom/moat/analytics/mobile/spck/z;->h(Landroid/view/View;)Landroid/graphics/Rect;

    move-result-object p0

    return-object p0

    :cond_0
    new-instance p0, Landroid/graphics/Rect;

    const/4 v0, 0x0

    invoke-direct {p0, v0, v0, v0, v0}, Landroid/graphics/Rect;-><init>(IIII)V

    return-object p0
.end method

.method private static a(Landroid/view/View;Landroid/graphics/Rect;ZZZ)Lcom/moat/analytics/mobile/spck/z$a;
    .locals 7

    new-instance v0, Lcom/moat/analytics/mobile/spck/z$a;

    invoke-direct {v0}, Lcom/moat/analytics/mobile/spck/z$a;-><init>()V

    invoke-static {p1}, Lcom/moat/analytics/mobile/spck/z;->b(Landroid/graphics/Rect;)I

    move-result p1

    if-eqz p0, :cond_3

    if-eqz p2, :cond_3

    if-eqz p3, :cond_3

    if-nez p4, :cond_3

    if-lez p1, :cond_3

    new-instance p2, Landroid/graphics/Rect;

    const/4 p3, 0x0

    invoke-direct {p2, p3, p3, p3, p3}, Landroid/graphics/Rect;-><init>(IIII)V

    invoke-virtual {p0, p2}, Landroid/view/View;->getGlobalVisibleRect(Landroid/graphics/Rect;)Z

    move-result p3

    if-eqz p3, :cond_3

    invoke-static {p2}, Lcom/moat/analytics/mobile/spck/z;->b(Landroid/graphics/Rect;)I

    move-result p3

    if-ge p3, p1, :cond_0

    const/4 p4, 0x2

    const-string v1, "VisibilityInfo"

    const/4 v2, 0x0

    const-string v3, "Ad is clipped"

    invoke-static {p4, v1, v2, v3}, Lcom/moat/analytics/mobile/spck/q;->b(ILjava/lang/String;Ljava/lang/Object;Ljava/lang/String;)V

    :cond_0
    new-instance p4, Ljava/util/HashSet;

    invoke-direct {p4}, Ljava/util/HashSet;-><init>()V

    invoke-virtual {p0}, Landroid/view/View;->getRootView()Landroid/view/View;

    move-result-object v1

    instance-of v1, v1, Landroid/view/ViewGroup;

    if-eqz v1, :cond_3

    iput-object p2, v0, Lcom/moat/analytics/mobile/spck/z$a;->a:Landroid/graphics/Rect;

    invoke-static {p2, p0, p4}, Lcom/moat/analytics/mobile/spck/z;->a(Landroid/graphics/Rect;Landroid/view/View;Ljava/util/Set;)Z

    move-result p0

    const-wide/high16 v1, 0x3ff0000000000000L    # 1.0

    if-eqz p0, :cond_1

    iput-wide v1, v0, Lcom/moat/analytics/mobile/spck/z$a;->c:D

    :cond_1
    if-nez p0, :cond_3

    invoke-static {p2, p4}, Lcom/moat/analytics/mobile/spck/z;->a(Landroid/graphics/Rect;Ljava/util/Set;)I

    move-result p0

    if-lez p0, :cond_2

    int-to-double v3, p0

    int-to-double v5, p3

    mul-double/2addr v5, v1

    div-double/2addr v3, v5

    iput-wide v3, v0, Lcom/moat/analytics/mobile/spck/z$a;->c:D

    :cond_2
    sub-int/2addr p3, p0

    int-to-double p2, p3

    int-to-double p0, p1

    mul-double/2addr p0, v1

    div-double/2addr p2, p0

    iput-wide p2, v0, Lcom/moat/analytics/mobile/spck/z$a;->b:D

    :cond_3
    return-object v0
.end method

.method private static a(Landroid/graphics/Rect;)Ljava/util/Map;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/graphics/Rect;",
            ")",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    const-string/jumbo v1, "x"

    iget v2, p0, Landroid/graphics/Rect;->left:I

    invoke-static {v2}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string/jumbo v1, "y"

    iget v2, p0, Landroid/graphics/Rect;->top:I

    invoke-static {v2}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string/jumbo v1, "w"

    iget v2, p0, Landroid/graphics/Rect;->right:I

    iget v3, p0, Landroid/graphics/Rect;->left:I

    sub-int/2addr v2, v3

    invoke-static {v2}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v1, "h"

    iget v2, p0, Landroid/graphics/Rect;->bottom:I

    iget p0, p0, Landroid/graphics/Rect;->top:I

    sub-int/2addr v2, p0

    invoke-static {v2}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object p0

    invoke-interface {v0, v1, p0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-object v0
.end method

.method private static a(Landroid/graphics/Rect;Landroid/util/DisplayMetrics;)Ljava/util/Map;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/graphics/Rect;",
            "Landroid/util/DisplayMetrics;",
            ")",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    invoke-static {p0, p1}, Lcom/moat/analytics/mobile/spck/z;->b(Landroid/graphics/Rect;Landroid/util/DisplayMetrics;)Landroid/graphics/Rect;

    move-result-object p0

    invoke-static {p0}, Lcom/moat/analytics/mobile/spck/z;->a(Landroid/graphics/Rect;)Ljava/util/Map;

    move-result-object p0

    return-object p0
.end method

.method private static a(Landroid/location/Location;)Lorg/json/JSONObject;
    .locals 1

    invoke-static {p0}, Lcom/moat/analytics/mobile/spck/z;->b(Landroid/location/Location;)Ljava/util/Map;

    move-result-object p0

    if-nez p0, :cond_0

    const/4 p0, 0x0

    return-object p0

    :cond_0
    new-instance v0, Lorg/json/JSONObject;

    invoke-direct {v0, p0}, Lorg/json/JSONObject;-><init>(Ljava/util/Map;)V

    return-object v0
.end method

.method private static a(Landroid/graphics/Rect;Landroid/view/View;Ljava/util/Set;)Z
    .locals 11
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/graphics/Rect;",
            "Landroid/view/View;",
            "Ljava/util/Set<",
            "Landroid/graphics/Rect;",
            ">;)Z"
        }
    .end annotation

    invoke-virtual {p1}, Landroid/view/View;->getRootView()Landroid/view/View;

    move-result-object v0

    new-instance v1, Ljava/util/ArrayDeque;

    invoke-direct {v1}, Ljava/util/ArrayDeque;-><init>()V

    invoke-virtual {v1, v0}, Ljava/util/ArrayDeque;->add(Ljava/lang/Object;)Z

    const-string v0, "VisibilityInfo"

    const-string/jumbo v2, "starting covering rect search"

    const/4 v3, 0x2

    invoke-static {v3, v0, p1, v2}, Lcom/moat/analytics/mobile/spck/q;->b(ILjava/lang/String;Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    const/4 v2, 0x1

    move v4, v0

    move v5, v4

    :cond_0
    :goto_0
    invoke-virtual {v1}, Ljava/util/ArrayDeque;->isEmpty()Z

    move-result v6

    if-nez v6, :cond_8

    const/16 v6, 0xfa

    if-lt v4, v6, :cond_1

    goto/16 :goto_4

    :cond_1
    add-int/lit8 v4, v4, 0x1

    invoke-virtual {v1}, Ljava/util/ArrayDeque;->pollLast()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Landroid/view/View;

    invoke-virtual {v6, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_2

    const-string v5, "VisibilityInfo"

    const-string v6, "found target"

    invoke-static {v3, v5, p0, v6}, Lcom/moat/analytics/mobile/spck/q;->b(ILjava/lang/String;Ljava/lang/Object;Ljava/lang/String;)V

    move v5, v2

    goto :goto_0

    :cond_2
    invoke-static {v6}, Lcom/moat/analytics/mobile/spck/z;->g(Landroid/view/View;)Z

    move-result v7

    if-nez v7, :cond_3

    goto :goto_0

    :cond_3
    instance-of v7, v6, Landroid/view/ViewGroup;

    if-eqz v7, :cond_4

    instance-of v7, v6, Landroid/widget/ListView;

    if-nez v7, :cond_4

    move-object v7, v6

    check-cast v7, Landroid/view/ViewGroup;

    invoke-virtual {v7}, Landroid/view/ViewGroup;->getChildCount()I

    move-result v8

    sub-int/2addr v8, v2

    :goto_1
    if-ltz v8, :cond_4

    invoke-virtual {v7, v8}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v9

    invoke-virtual {v1, v9}, Ljava/util/ArrayDeque;->add(Ljava/lang/Object;)Z

    add-int/lit8 v8, v8, -0x1

    goto :goto_1

    :cond_4
    sget v7, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v8, 0x15

    if-lt v7, v8, :cond_6

    invoke-virtual {v6}, Landroid/view/View;->getElevation()F

    move-result v7

    invoke-virtual {p1}, Landroid/view/View;->getElevation()F

    move-result v8

    cmpl-float v7, v7, v8

    if-lez v7, :cond_5

    goto :goto_2

    :cond_5
    if-eqz v5, :cond_7

    invoke-virtual {v6}, Landroid/view/View;->getElevation()F

    move-result v7

    invoke-virtual {p1}, Landroid/view/View;->getElevation()F

    move-result v8

    cmpl-float v7, v7, v8

    if-nez v7, :cond_7

    goto :goto_2

    :cond_6
    if-eqz v5, :cond_7

    :goto_2
    move v7, v2

    goto :goto_3

    :cond_7
    move v7, v0

    :goto_3
    if-eqz v7, :cond_0

    invoke-static {v6}, Lcom/moat/analytics/mobile/spck/z;->h(Landroid/view/View;)Landroid/graphics/Rect;

    move-result-object v7

    invoke-virtual {v7, p0, v7}, Landroid/graphics/Rect;->setIntersect(Landroid/graphics/Rect;Landroid/graphics/Rect;)Z

    move-result v8

    if-eqz v8, :cond_0

    const-string v8, "VisibilityInfo"

    new-instance v9, Ljava/lang/StringBuilder;

    invoke-direct {v9}, Ljava/lang/StringBuilder;-><init>()V

    const-string v10, "Covered by "

    invoke-virtual {v9, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v10

    invoke-virtual {v10}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v10

    invoke-virtual {v9, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v10, "-"

    invoke-virtual {v9, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7}, Landroid/graphics/Rect;->toString()Ljava/lang/String;

    move-result-object v10

    invoke-virtual {v9, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v9}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v9

    invoke-static {v3, v8, v6, v9}, Lcom/moat/analytics/mobile/spck/q;->b(ILjava/lang/String;Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p2, v7}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    invoke-virtual {v7, p0}, Landroid/graphics/Rect;->contains(Landroid/graphics/Rect;)Z

    move-result v6

    if-eqz v6, :cond_0

    return v2

    :cond_8
    :goto_4
    return v0
.end method

.method private static b(Landroid/graphics/Rect;)I
    .locals 1

    invoke-virtual {p0}, Landroid/graphics/Rect;->width()I

    move-result v0

    invoke-virtual {p0}, Landroid/graphics/Rect;->height()I

    move-result p0

    mul-int/2addr v0, p0

    return v0
.end method

.method private static b(Landroid/graphics/Rect;Landroid/util/DisplayMetrics;)Landroid/graphics/Rect;
    .locals 3

    iget p1, p1, Landroid/util/DisplayMetrics;->density:F

    const/4 v0, 0x0

    cmpl-float v0, p1, v0

    if-nez v0, :cond_0

    return-object p0

    :cond_0
    iget v0, p0, Landroid/graphics/Rect;->left:I

    int-to-float v0, v0

    div-float/2addr v0, p1

    invoke-static {v0}, Ljava/lang/Math;->round(F)I

    move-result v0

    iget v1, p0, Landroid/graphics/Rect;->right:I

    int-to-float v1, v1

    div-float/2addr v1, p1

    invoke-static {v1}, Ljava/lang/Math;->round(F)I

    move-result v1

    iget v2, p0, Landroid/graphics/Rect;->top:I

    int-to-float v2, v2

    div-float/2addr v2, p1

    invoke-static {v2}, Ljava/lang/Math;->round(F)I

    move-result v2

    iget p0, p0, Landroid/graphics/Rect;->bottom:I

    int-to-float p0, p0

    div-float/2addr p0, p1

    invoke-static {p0}, Ljava/lang/Math;->round(F)I

    move-result p0

    new-instance p1, Landroid/graphics/Rect;

    invoke-direct {p1, v0, v2, v1, p0}, Landroid/graphics/Rect;-><init>(IIII)V

    return-object p1
.end method

.method private static b(Landroid/location/Location;)Ljava/util/Map;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/location/Location;",
            ")",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    if-nez p0, :cond_0

    const/4 p0, 0x0

    return-object p0

    :cond_0
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    const-string v1, "latitude"

    invoke-virtual {p0}, Landroid/location/Location;->getLatitude()D

    move-result-wide v2

    invoke-static {v2, v3}, Ljava/lang/Double;->toString(D)Ljava/lang/String;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v1, "longitude"

    invoke-virtual {p0}, Landroid/location/Location;->getLongitude()D

    move-result-wide v2

    invoke-static {v2, v3}, Ljava/lang/Double;->toString(D)Ljava/lang/String;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string/jumbo v1, "timestamp"

    invoke-virtual {p0}, Landroid/location/Location;->getTime()J

    move-result-wide v2

    invoke-static {v2, v3}, Ljava/lang/Long;->toString(J)Ljava/lang/String;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v1, "horizontalAccuracy"

    invoke-virtual {p0}, Landroid/location/Location;->getAccuracy()F

    move-result p0

    invoke-static {p0}, Ljava/lang/Float;->toString(F)Ljava/lang/String;

    move-result-object p0

    invoke-interface {v0, v1, p0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-object v0
.end method

.method private static b(Landroid/view/View;)Z
    .locals 4

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/4 v1, 0x1

    const/4 v2, 0x0

    const/16 v3, 0x13

    if-lt v0, v3, :cond_1

    if-eqz p0, :cond_0

    invoke-virtual {p0}, Landroid/view/View;->isAttachedToWindow()Z

    move-result p0

    if-eqz p0, :cond_0

    goto :goto_0

    :cond_0
    move v1, v2

    :goto_0
    return v1

    :cond_1
    if-eqz p0, :cond_2

    invoke-virtual {p0}, Landroid/view/View;->getWindowToken()Landroid/os/IBinder;

    move-result-object p0

    if-eqz p0, :cond_2

    goto :goto_1

    :cond_2
    move v1, v2

    :goto_1
    return v1
.end method

.method private static c(Landroid/view/View;)Z
    .locals 0

    if-eqz p0, :cond_0

    invoke-virtual {p0}, Landroid/view/View;->hasWindowFocus()Z

    move-result p0

    if-eqz p0, :cond_0

    const/4 p0, 0x1

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    return p0
.end method

.method private static d(Landroid/view/View;)Z
    .locals 0

    if-eqz p0, :cond_1

    invoke-virtual {p0}, Landroid/view/View;->isShown()Z

    move-result p0

    if-nez p0, :cond_0

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 p0, 0x1

    :goto_1
    return p0
.end method

.method private static e(Landroid/view/View;)F
    .locals 0

    if-nez p0, :cond_0

    const/4 p0, 0x0

    goto :goto_0

    :cond_0
    invoke-static {p0}, Lcom/moat/analytics/mobile/spck/z;->f(Landroid/view/View;)F

    move-result p0

    :goto_0
    return p0
.end method

.method private static f(Landroid/view/View;)F
    .locals 5

    invoke-virtual {p0}, Landroid/view/View;->getAlpha()F

    move-result v0

    :goto_0
    if-eqz p0, :cond_1

    invoke-virtual {p0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object v1

    if-eqz v1, :cond_1

    float-to-double v1, v0

    const-wide/16 v3, 0x0

    cmpl-double v1, v1, v3

    if-nez v1, :cond_0

    goto :goto_1

    :cond_0
    invoke-virtual {p0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object v1

    instance-of v1, v1, Landroid/view/View;

    if-eqz v1, :cond_1

    invoke-virtual {p0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object v1

    check-cast v1, Landroid/view/View;

    invoke-virtual {v1}, Landroid/view/View;->getAlpha()F

    move-result v1

    mul-float/2addr v0, v1

    invoke-virtual {p0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object p0

    check-cast p0, Landroid/view/View;

    goto :goto_0

    :cond_1
    :goto_1
    return v0
.end method

.method private static g(Landroid/view/View;)Z
    .locals 4

    invoke-virtual {p0}, Landroid/view/View;->isShown()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Landroid/view/View;->getAlpha()F

    move-result p0

    float-to-double v0, p0

    const-wide/16 v2, 0x0

    cmpl-double p0, v0, v2

    if-lez p0, :cond_0

    const/4 p0, 0x1

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    return p0
.end method

.method private static h(Landroid/view/View;)Landroid/graphics/Rect;
    .locals 4

    const/4 v0, 0x2

    new-array v0, v0, [I

    fill-array-data v0, :array_0

    invoke-virtual {p0, v0}, Landroid/view/View;->getLocationInWindow([I)V

    const/4 v1, 0x0

    aget v1, v0, v1

    const/4 v2, 0x1

    aget v0, v0, v2

    new-instance v2, Landroid/graphics/Rect;

    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    move-result v3

    add-int/2addr v3, v1

    invoke-virtual {p0}, Landroid/view/View;->getHeight()I

    move-result p0

    add-int/2addr p0, v0

    invoke-direct {v2, v1, v0, v3, p0}, Landroid/graphics/Rect;-><init>(IIII)V

    return-object v2

    nop

    :array_0
    .array-data 4
        -0x80000000
        -0x80000000
    .end array-data
.end method

.method private static i(Landroid/view/View;)Landroid/util/DisplayMetrics;
    .locals 2

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x11

    if-lt v0, v1, :cond_0

    sget-object v0, Lcom/moat/analytics/mobile/spck/a;->a:Ljava/lang/ref/WeakReference;

    if-eqz v0, :cond_0

    sget-object v0, Lcom/moat/analytics/mobile/spck/a;->a:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/app/Activity;

    if-eqz v0, :cond_0

    new-instance p0, Landroid/util/DisplayMetrics;

    invoke-direct {p0}, Landroid/util/DisplayMetrics;-><init>()V

    invoke-virtual {v0}, Landroid/app/Activity;->getWindowManager()Landroid/view/WindowManager;

    move-result-object v0

    invoke-interface {v0}, Landroid/view/WindowManager;->getDefaultDisplay()Landroid/view/Display;

    move-result-object v0

    invoke-virtual {v0, p0}, Landroid/view/Display;->getRealMetrics(Landroid/util/DisplayMetrics;)V

    return-object p0

    :cond_0
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object p0

    invoke-virtual {p0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object p0

    invoke-virtual {p0}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method a(Ljava/lang/String;Landroid/view/View;)V
    .locals 11

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    const-string/jumbo v1, "{}"

    if-eqz p2, :cond_e

    :try_start_0
    invoke-static {p2}, Lcom/moat/analytics/mobile/spck/z;->i(Landroid/view/View;)Landroid/util/DisplayMetrics;

    move-result-object v2

    invoke-static {p2}, Lcom/moat/analytics/mobile/spck/z;->b(Landroid/view/View;)Z

    move-result v3

    invoke-static {p2}, Lcom/moat/analytics/mobile/spck/z;->c(Landroid/view/View;)Z

    move-result v4

    invoke-static {p2}, Lcom/moat/analytics/mobile/spck/z;->d(Landroid/view/View;)Z

    move-result v5

    invoke-static {p2}, Lcom/moat/analytics/mobile/spck/z;->e(Landroid/view/View;)F

    move-result v6

    const-string v7, "dr"

    iget v8, v2, Landroid/util/DisplayMetrics;->density:F

    invoke-static {v8}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v8

    invoke-interface {v0, v7, v8}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v7, "dv"

    invoke-static {}, Lcom/moat/analytics/mobile/spck/t;->a()D

    move-result-wide v8

    invoke-static {v8, v9}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v8

    invoke-interface {v0, v7, v8}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v7, "adKey"

    invoke-interface {v0, v7, p1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string p1, "isAttached"

    const/4 v7, 0x0

    const/4 v8, 0x1

    if-eqz v3, :cond_0

    move v9, v8

    goto :goto_0

    :cond_0
    move v9, v7

    :goto_0
    invoke-static {v9}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v9

    invoke-interface {v0, p1, v9}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string p1, "inFocus"

    if-eqz v4, :cond_1

    move v9, v8

    goto :goto_1

    :cond_1
    move v9, v7

    :goto_1
    invoke-static {v9}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v9

    invoke-interface {v0, p1, v9}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string p1, "isHidden"

    if-eqz v5, :cond_2

    move v9, v8

    goto :goto_2

    :cond_2
    move v9, v7

    :goto_2
    invoke-static {v9}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v9

    invoke-interface {v0, p1, v9}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string p1, "opacity"

    invoke-static {v6}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v6

    invoke-interface {v0, p1, v6}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {v2}, Lcom/moat/analytics/mobile/spck/z;->a(Landroid/util/DisplayMetrics;)Landroid/graphics/Rect;

    move-result-object p1

    invoke-static {p2}, Lcom/moat/analytics/mobile/spck/z;->a(Landroid/view/View;)Landroid/graphics/Rect;

    move-result-object v6

    invoke-static {p2, v6, v3, v4, v5}, Lcom/moat/analytics/mobile/spck/z;->a(Landroid/view/View;Landroid/graphics/Rect;ZZZ)Lcom/moat/analytics/mobile/spck/z$a;

    move-result-object p2

    iget-object v3, p0, Lcom/moat/analytics/mobile/spck/z;->c:Lorg/json/JSONObject;

    if-eqz v3, :cond_3

    iget-wide v3, p2, Lcom/moat/analytics/mobile/spck/z$a;->b:D

    iget-object v5, p0, Lcom/moat/analytics/mobile/spck/z;->b:Lcom/moat/analytics/mobile/spck/z$a;

    iget-wide v9, v5, Lcom/moat/analytics/mobile/spck/z$a;->b:D

    cmpl-double v3, v3, v9

    if-nez v3, :cond_3

    iget-object v3, p2, Lcom/moat/analytics/mobile/spck/z$a;->a:Landroid/graphics/Rect;

    iget-object v4, p0, Lcom/moat/analytics/mobile/spck/z;->b:Lcom/moat/analytics/mobile/spck/z$a;

    iget-object v4, v4, Lcom/moat/analytics/mobile/spck/z$a;->a:Landroid/graphics/Rect;

    invoke-virtual {v3, v4}, Landroid/graphics/Rect;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_3

    iget-wide v3, p2, Lcom/moat/analytics/mobile/spck/z$a;->c:D

    iget-object v5, p0, Lcom/moat/analytics/mobile/spck/z;->b:Lcom/moat/analytics/mobile/spck/z$a;

    iget-wide v9, v5, Lcom/moat/analytics/mobile/spck/z$a;->c:D

    cmpl-double v3, v3, v9

    if-eqz v3, :cond_4

    :cond_3
    iput-object p2, p0, Lcom/moat/analytics/mobile/spck/z;->b:Lcom/moat/analytics/mobile/spck/z$a;

    new-instance v3, Lorg/json/JSONObject;

    iget-object v4, p0, Lcom/moat/analytics/mobile/spck/z;->b:Lcom/moat/analytics/mobile/spck/z$a;

    iget-object v4, v4, Lcom/moat/analytics/mobile/spck/z$a;->a:Landroid/graphics/Rect;

    invoke-static {v4, v2}, Lcom/moat/analytics/mobile/spck/z;->a(Landroid/graphics/Rect;Landroid/util/DisplayMetrics;)Ljava/util/Map;

    move-result-object v4

    invoke-direct {v3, v4}, Lorg/json/JSONObject;-><init>(Ljava/util/Map;)V

    iput-object v3, p0, Lcom/moat/analytics/mobile/spck/z;->c:Lorg/json/JSONObject;

    move v7, v8

    :cond_4
    const-string v3, "coveredPercent"

    iget-wide v4, p2, Lcom/moat/analytics/mobile/spck/z$a;->c:D

    invoke-static {v4, v5}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object p2

    invoke-interface {v0, v3, p2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget-object p2, p0, Lcom/moat/analytics/mobile/spck/z;->g:Lorg/json/JSONObject;

    if-eqz p2, :cond_5

    iget-object p2, p0, Lcom/moat/analytics/mobile/spck/z;->e:Landroid/graphics/Rect;

    invoke-virtual {p1, p2}, Landroid/graphics/Rect;->equals(Ljava/lang/Object;)Z

    move-result p2

    if-nez p2, :cond_6

    :cond_5
    iput-object p1, p0, Lcom/moat/analytics/mobile/spck/z;->e:Landroid/graphics/Rect;

    new-instance p2, Lorg/json/JSONObject;

    invoke-static {p1, v2}, Lcom/moat/analytics/mobile/spck/z;->a(Landroid/graphics/Rect;Landroid/util/DisplayMetrics;)Ljava/util/Map;

    move-result-object p1

    invoke-direct {p2, p1}, Lorg/json/JSONObject;-><init>(Ljava/util/Map;)V

    iput-object p2, p0, Lcom/moat/analytics/mobile/spck/z;->g:Lorg/json/JSONObject;

    move v7, v8

    :cond_6
    iget-object p1, p0, Lcom/moat/analytics/mobile/spck/z;->f:Lorg/json/JSONObject;

    if-eqz p1, :cond_7

    iget-object p1, p0, Lcom/moat/analytics/mobile/spck/z;->d:Landroid/graphics/Rect;

    invoke-virtual {v6, p1}, Landroid/graphics/Rect;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_8

    :cond_7
    iput-object v6, p0, Lcom/moat/analytics/mobile/spck/z;->d:Landroid/graphics/Rect;

    new-instance p1, Lorg/json/JSONObject;

    invoke-static {v6, v2}, Lcom/moat/analytics/mobile/spck/z;->a(Landroid/graphics/Rect;Landroid/util/DisplayMetrics;)Ljava/util/Map;

    move-result-object p2

    invoke-direct {p1, p2}, Lorg/json/JSONObject;-><init>(Ljava/util/Map;)V

    iput-object p1, p0, Lcom/moat/analytics/mobile/spck/z;->f:Lorg/json/JSONObject;

    move v7, v8

    :cond_8
    iget-object p1, p0, Lcom/moat/analytics/mobile/spck/z;->i:Ljava/util/Map;

    if-eqz p1, :cond_9

    iget-object p1, p0, Lcom/moat/analytics/mobile/spck/z;->i:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_a

    :cond_9
    iput-object v0, p0, Lcom/moat/analytics/mobile/spck/z;->i:Ljava/util/Map;

    move v7, v8

    :cond_a
    invoke-static {}, Lcom/moat/analytics/mobile/spck/p;->a()Lcom/moat/analytics/mobile/spck/p;

    move-result-object p1

    invoke-virtual {p1}, Lcom/moat/analytics/mobile/spck/p;->b()Landroid/location/Location;

    move-result-object p1

    iget-object p2, p0, Lcom/moat/analytics/mobile/spck/z;->h:Landroid/location/Location;

    invoke-static {p1, p2}, Lcom/moat/analytics/mobile/spck/p;->a(Landroid/location/Location;Landroid/location/Location;)Z

    move-result p2

    if-nez p2, :cond_b

    iput-object p1, p0, Lcom/moat/analytics/mobile/spck/z;->h:Landroid/location/Location;

    move v7, v8

    :cond_b
    if-eqz v7, :cond_d

    new-instance p2, Lorg/json/JSONObject;

    iget-object v0, p0, Lcom/moat/analytics/mobile/spck/z;->i:Ljava/util/Map;

    invoke-direct {p2, v0}, Lorg/json/JSONObject;-><init>(Ljava/util/Map;)V

    const-string v0, "screen"

    iget-object v2, p0, Lcom/moat/analytics/mobile/spck/z;->g:Lorg/json/JSONObject;

    invoke-virtual {p2, v0, v2}, Lorg/json/JSONObject;->accumulate(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    const-string/jumbo v0, "view"

    iget-object v2, p0, Lcom/moat/analytics/mobile/spck/z;->f:Lorg/json/JSONObject;

    invoke-virtual {p2, v0, v2}, Lorg/json/JSONObject;->accumulate(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    const-string/jumbo v0, "visible"

    iget-object v2, p0, Lcom/moat/analytics/mobile/spck/z;->c:Lorg/json/JSONObject;

    invoke-virtual {p2, v0, v2}, Lorg/json/JSONObject;->accumulate(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    const-string v0, "maybe"

    iget-object v2, p0, Lcom/moat/analytics/mobile/spck/z;->c:Lorg/json/JSONObject;

    invoke-virtual {p2, v0, v2}, Lorg/json/JSONObject;->accumulate(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    const-string/jumbo v0, "visiblePercent"

    iget-object v2, p0, Lcom/moat/analytics/mobile/spck/z;->b:Lcom/moat/analytics/mobile/spck/z$a;

    iget-wide v2, v2, Lcom/moat/analytics/mobile/spck/z$a;->b:D

    invoke-static {v2, v3}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v2

    invoke-virtual {p2, v0, v2}, Lorg/json/JSONObject;->accumulate(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    if-eqz p1, :cond_c

    const-string v0, "location"

    invoke-static {p1}, Lcom/moat/analytics/mobile/spck/z;->a(Landroid/location/Location;)Lorg/json/JSONObject;

    move-result-object p1

    invoke-virtual {p2, v0, p1}, Lorg/json/JSONObject;->accumulate(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    :cond_c
    invoke-virtual {p2}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    move-result-object v1

    iput-object v1, p0, Lcom/moat/analytics/mobile/spck/z;->a:Ljava/lang/String;

    goto :goto_3

    :cond_d
    iget-object p1, p0, Lcom/moat/analytics/mobile/spck/z;->a:Ljava/lang/String;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_3

    :catch_0
    move-exception p1

    invoke-static {p1}, Lcom/moat/analytics/mobile/spck/n;->a(Ljava/lang/Exception;)V

    iput-object v1, p0, Lcom/moat/analytics/mobile/spck/z;->a:Ljava/lang/String;

    :cond_e
    :goto_3
    return-void
.end method
