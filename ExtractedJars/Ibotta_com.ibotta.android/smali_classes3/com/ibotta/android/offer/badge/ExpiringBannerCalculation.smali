.class public final Lcom/ibotta/android/offer/badge/ExpiringBannerCalculation;
.super Ljava/lang/Object;
.source "ExpiringBannerCalculation.kt"


# annotations
.annotation runtime Lkotlin/Metadata;
    bv = {
        0x1,
        0x0,
        0x3
    }
    d1 = {
        "\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\t\n\u0002\u0008\u0003\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0002\u0008\u0007\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u000e\u0010\u000b\u001a\u00020\u000c2\u0006\u0010\r\u001a\u00020\u0008J\u0018\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00082\u0006\u0010\u0011\u001a\u00020\u0008H\u0002J\"\u0010\u0012\u001a\u00020\u000c2\u0006\u0010\u0010\u001a\u00020\u00082\u0006\u0010\u0011\u001a\u00020\u00082\u0008\u0008\u0001\u0010\u0013\u001a\u00020\u000fH\u0002J\"\u0010\u0014\u001a\u00020\u000c2\u0006\u0010\u0010\u001a\u00020\u00082\u0006\u0010\u0011\u001a\u00020\u00082\u0008\u0008\u0001\u0010\u0015\u001a\u00020\u000fH\u0002R\u000e\u0010\u0007\u001a\u00020\u0008X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0008X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0008X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0016"
    }
    d2 = {
        "Lcom/ibotta/android/offer/badge/ExpiringBannerCalculation;",
        "",
        "appHelper",
        "Lcom/ibotta/android/util/AppHelper;",
        "resources",
        "Landroid/content/res/Resources;",
        "(Lcom/ibotta/android/util/AppHelper;Landroid/content/res/Resources;)V",
        "ONE_DAY",
        "",
        "ONE_HOUR",
        "ONE_MINUTE",
        "getExpiringBanner",
        "",
        "offerTime",
        "getTimeLeft",
        "",
        "difference",
        "timeDeterminer",
        "getTimeLeftForPluralsRes",
        "pluralRes",
        "getTimeLeftForStringRes",
        "stringRes",
        "ibotta-reducers_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x1,
        0xd
    }
.end annotation


# instance fields
.field private final ONE_DAY:J

.field private final ONE_HOUR:J

.field private final ONE_MINUTE:J

.field private final appHelper:Lcom/ibotta/android/util/AppHelper;

.field private final resources:Landroid/content/res/Resources;


# direct methods
.method public constructor <init>(Lcom/ibotta/android/util/AppHelper;Landroid/content/res/Resources;)V
    .locals 2
    .param p1    # Lcom/ibotta/android/util/AppHelper;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Landroid/content/res/Resources;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "appHelper"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "resources"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 11
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/ibotta/android/offer/badge/ExpiringBannerCalculation;->appHelper:Lcom/ibotta/android/util/AppHelper;

    iput-object p2, p0, Lcom/ibotta/android/offer/badge/ExpiringBannerCalculation;->resources:Landroid/content/res/Resources;

    .line 15
    sget-object p1, Ljava/util/concurrent/TimeUnit;->DAYS:Ljava/util/concurrent/TimeUnit;

    const-wide/16 v0, 0x1

    invoke-virtual {p1, v0, v1}, Ljava/util/concurrent/TimeUnit;->toMillis(J)J

    move-result-wide p1

    iput-wide p1, p0, Lcom/ibotta/android/offer/badge/ExpiringBannerCalculation;->ONE_DAY:J

    .line 16
    sget-object p1, Ljava/util/concurrent/TimeUnit;->HOURS:Ljava/util/concurrent/TimeUnit;

    invoke-virtual {p1, v0, v1}, Ljava/util/concurrent/TimeUnit;->toMillis(J)J

    move-result-wide p1

    iput-wide p1, p0, Lcom/ibotta/android/offer/badge/ExpiringBannerCalculation;->ONE_HOUR:J

    .line 17
    sget-object p1, Ljava/util/concurrent/TimeUnit;->MINUTES:Ljava/util/concurrent/TimeUnit;

    invoke-virtual {p1, v0, v1}, Ljava/util/concurrent/TimeUnit;->toMillis(J)J

    move-result-wide p1

    iput-wide p1, p0, Lcom/ibotta/android/offer/badge/ExpiringBannerCalculation;->ONE_MINUTE:J

    return-void
.end method

.method private final getTimeLeft(JJ)I
    .locals 0

    .line 48
    div-long/2addr p1, p3

    long-to-double p1, p1

    invoke-static {p1, p2}, Ljava/lang/Math;->floor(D)D

    move-result-wide p1

    double-to-int p1, p1

    return p1
.end method

.method private final getTimeLeftForPluralsRes(JJI)Ljava/lang/String;
    .locals 1
    .param p5    # I
        .annotation build Landroid/support/annotation/PluralsRes;
        .end annotation
    .end param

    .line 38
    invoke-direct {p0, p1, p2, p3, p4}, Lcom/ibotta/android/offer/badge/ExpiringBannerCalculation;->getTimeLeft(JJ)I

    move-result p1

    .line 39
    iget-object p2, p0, Lcom/ibotta/android/offer/badge/ExpiringBannerCalculation;->resources:Landroid/content/res/Resources;

    const/4 p3, 0x1

    new-array p3, p3, [Ljava/lang/Object;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p4

    const/4 v0, 0x0

    aput-object p4, p3, v0

    invoke-virtual {p2, p5, p1, p3}, Landroid/content/res/Resources;->getQuantityString(II[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    const-string p2, "resources.getQuantityStr\u2026lRes, timeLeft, timeLeft)"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method

.method private final getTimeLeftForStringRes(JJI)Ljava/lang/String;
    .locals 0
    .param p5    # I
        .annotation build Landroid/support/annotation/StringRes;
        .end annotation
    .end param

    .line 43
    invoke-direct {p0, p1, p2, p3, p4}, Lcom/ibotta/android/offer/badge/ExpiringBannerCalculation;->getTimeLeft(JJ)I

    move-result p1

    .line 44
    iget-object p2, p0, Lcom/ibotta/android/offer/badge/ExpiringBannerCalculation;->resources:Landroid/content/res/Resources;

    const/4 p3, 0x1

    new-array p3, p3, [Ljava/lang/Object;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    const/4 p4, 0x0

    aput-object p1, p3, p4

    invoke-virtual {p2, p5, p3}, Landroid/content/res/Resources;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    const-string p2, "resources.getString(stringRes, timeLeft)"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method


# virtual methods
.method public final getExpiringBanner(J)Ljava/lang/String;
    .locals 8
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 20
    iget-object v0, p0, Lcom/ibotta/android/offer/badge/ExpiringBannerCalculation;->appHelper:Lcom/ibotta/android/util/AppHelper;

    invoke-interface {v0}, Lcom/ibotta/android/util/AppHelper;->getCurrentTime()J

    move-result-wide v0

    sub-long v3, p1, v0

    const-wide/16 p1, 0x0

    cmp-long v0, v3, p1

    if-gtz v0, :cond_0

    .line 23
    iget-object p1, p0, Lcom/ibotta/android/offer/badge/ExpiringBannerCalculation;->resources:Landroid/content/res/Resources;

    sget p2, Lcom/ibotta/android/reducers/R$string;->expiring_banner_now:I

    invoke-virtual {p1, p2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object p1

    const-string p2, "resources.getString(R.string.expiring_banner_now)"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    goto/16 :goto_0

    .line 24
    :cond_0
    iget-wide p1, p0, Lcom/ibotta/android/offer/badge/ExpiringBannerCalculation;->ONE_MINUTE:J

    cmp-long v0, v3, p1

    if-gez v0, :cond_1

    iget-object p1, p0, Lcom/ibotta/android/offer/badge/ExpiringBannerCalculation;->resources:Landroid/content/res/Resources;

    sget p2, Lcom/ibotta/android/reducers/R$string;->expiring_banner_under_one_minute:I

    invoke-virtual {p1, p2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object p1

    const-string p2, "resources.getString(R.st\u2026_banner_under_one_minute)"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    goto :goto_0

    .line 25
    :cond_1
    iget-wide p1, p0, Lcom/ibotta/android/offer/badge/ExpiringBannerCalculation;->ONE_HOUR:J

    const/4 v0, 0x0

    const/4 v1, 0x1

    cmp-long v2, v3, p1

    if-gez v2, :cond_2

    iget-object p1, p0, Lcom/ibotta/android/offer/badge/ExpiringBannerCalculation;->resources:Landroid/content/res/Resources;

    .line 26
    sget p2, Lcom/ibotta/android/reducers/R$string;->expiring_banner_description:I

    new-array v1, v1, [Ljava/lang/Object;

    .line 27
    iget-wide v5, p0, Lcom/ibotta/android/offer/badge/ExpiringBannerCalculation;->ONE_MINUTE:J

    sget v7, Lcom/ibotta/android/reducers/R$string;->count_minute:I

    move-object v2, p0

    invoke-direct/range {v2 .. v7}, Lcom/ibotta/android/offer/badge/ExpiringBannerCalculation;->getTimeLeftForStringRes(JJI)Ljava/lang/String;

    move-result-object v2

    aput-object v2, v1, v0

    .line 25
    invoke-virtual {p1, p2, v1}, Landroid/content/res/Resources;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    const-string p2, "resources.getString(\n   \u2026, R.string.count_minute))"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    goto :goto_0

    .line 28
    :cond_2
    iget-wide p1, p0, Lcom/ibotta/android/offer/badge/ExpiringBannerCalculation;->ONE_DAY:J

    cmp-long v2, v3, p1

    if-gez v2, :cond_3

    iget-object p1, p0, Lcom/ibotta/android/offer/badge/ExpiringBannerCalculation;->resources:Landroid/content/res/Resources;

    .line 29
    sget p2, Lcom/ibotta/android/reducers/R$string;->expiring_banner_description:I

    new-array v1, v1, [Ljava/lang/Object;

    .line 30
    iget-wide v5, p0, Lcom/ibotta/android/offer/badge/ExpiringBannerCalculation;->ONE_HOUR:J

    sget v7, Lcom/ibotta/android/reducers/R$string;->count_hour:I

    move-object v2, p0

    invoke-direct/range {v2 .. v7}, Lcom/ibotta/android/offer/badge/ExpiringBannerCalculation;->getTimeLeftForStringRes(JJI)Ljava/lang/String;

    move-result-object v2

    aput-object v2, v1, v0

    .line 28
    invoke-virtual {p1, p2, v1}, Landroid/content/res/Resources;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    const-string p2, "resources.getString(\n   \u2026UR, R.string.count_hour))"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    goto :goto_0

    .line 31
    :cond_3
    iget-object p1, p0, Lcom/ibotta/android/offer/badge/ExpiringBannerCalculation;->resources:Landroid/content/res/Resources;

    .line 32
    sget p2, Lcom/ibotta/android/reducers/R$string;->expiring_banner_description:I

    new-array v1, v1, [Ljava/lang/Object;

    .line 33
    iget-wide v5, p0, Lcom/ibotta/android/offer/badge/ExpiringBannerCalculation;->ONE_DAY:J

    sget v7, Lcom/ibotta/android/reducers/R$plurals;->plural_count_days:I

    move-object v2, p0

    invoke-direct/range {v2 .. v7}, Lcom/ibotta/android/offer/badge/ExpiringBannerCalculation;->getTimeLeftForPluralsRes(JJI)Ljava/lang/String;

    move-result-object v2

    aput-object v2, v1, v0

    .line 31
    invoke-virtual {p1, p2, v1}, Landroid/content/res/Resources;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    const-string p2, "resources.getString(\n   \u2026urals.plural_count_days))"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    :goto_0
    return-object p1
.end method
