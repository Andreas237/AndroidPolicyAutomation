.class public final Lcom/shopkick/app/store/CountdownTimerController;
.super Ljava/lang/Object;
.source "CountdownTimerController.kt"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/shopkick/app/store/CountdownTimerController$BonusCountdownTimer;
    }
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nCountdownTimerController.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CountdownTimerController.kt\ncom/shopkick/app/store/CountdownTimerController\n*L\n1#1,88:1\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    bv = {
        0x1,
        0x0,
        0x3
    }
    d1 = {
        "\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0010\t\n\u0002\u0008\u0008\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0010\u0002\n\u0002\u0008\u000c\u0018\u00002\u00020\u0001:\u0001)B/\u0008\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\u0008\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\tJ\u0006\u0010\u001d\u001a\u00020\u001eJ\u0008\u0010\u001f\u001a\u00020\u001eH\u0002J\u0010\u0010 \u001a\u00020\u001e2\u0006\u0010!\u001a\u00020\u000fH\u0002J(\u0010\"\u001a\u00020\u001e2\u0006\u0010#\u001a\u00020\u000f2\u0006\u0010$\u001a\u00020\u000f2\u0006\u0010%\u001a\u00020\u000f2\u0006\u0010&\u001a\u00020\u000fH\u0002J\u000e\u0010\'\u001a\u00020\u001e2\u0006\u0010\u000e\u001a\u00020\u000fJ\u0006\u0010(\u001a\u00020\u001eR\u0017\u0010\u0002\u001a\u0008\u0012\u0004\u0012\u00020\u00030\n\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000b\u0010\u000cR\u0017\u0010\u0004\u001a\u0008\u0012\u0004\u0012\u00020\u00050\n\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\r\u0010\u000cR\u001a\u0010\u000e\u001a\u00020\u000fX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008\u0010\u0010\u0011\"\u0004\u0008\u0012\u0010\u0013R\u0017\u0010\u0006\u001a\u0008\u0012\u0004\u0012\u00020\u00050\n\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0014\u0010\u000cR\u0017\u0010\u0007\u001a\u0008\u0012\u0004\u0012\u00020\u00050\n\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0015\u0010\u000cR\u0017\u0010\u0008\u001a\u0008\u0012\u0004\u0012\u00020\u00050\n\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0016\u0010\u000cR\u001c\u0010\u0017\u001a\u0004\u0018\u00010\u0018X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008\u0019\u0010\u001a\"\u0004\u0008\u001b\u0010\u001c\u00a8\u0006*"
    }
    d2 = {
        "Lcom/shopkick/app/store/CountdownTimerController;",
        "",
        "coundownTimerCallback",
        "Lcom/shopkick/app/store/ICountdownTimerFinished;",
        "daysCounter",
        "Landroid/widget/TextView;",
        "hoursCounter",
        "minsCounter",
        "secsCounter",
        "(Lcom/shopkick/app/store/ICountdownTimerFinished;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/TextView;)V",
        "Ljava/lang/ref/WeakReference;",
        "getCoundownTimerCallback",
        "()Ljava/lang/ref/WeakReference;",
        "getDaysCounter",
        "expiryTs",
        "",
        "getExpiryTs",
        "()J",
        "setExpiryTs",
        "(J)V",
        "getHoursCounter",
        "getMinsCounter",
        "getSecsCounter",
        "timer",
        "Lcom/shopkick/app/store/CountdownTimerController$BonusCountdownTimer;",
        "getTimer",
        "()Lcom/shopkick/app/store/CountdownTimerController$BonusCountdownTimer;",
        "setTimer",
        "(Lcom/shopkick/app/store/CountdownTimerController$BonusCountdownTimer;)V",
        "clear",
        "",
        "onFinish",
        "onTick",
        "millisUntilFinished",
        "setCounterValues",
        "days",
        "hours",
        "mins",
        "secs",
        "start",
        "stop",
        "BonusCountdownTimer",
        "Shopkick_defaultFlavorRelease"
    }
    k = 0x1
    mv = {
        0x1,
        0x1,
        0xd
    }
.end annotation


# instance fields
.field private final coundownTimerCallback:Ljava/lang/ref/WeakReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ref/WeakReference<",
            "Lcom/shopkick/app/store/ICountdownTimerFinished;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private final daysCounter:Ljava/lang/ref/WeakReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ref/WeakReference<",
            "Landroid/widget/TextView;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private expiryTs:J

.field private final hoursCounter:Ljava/lang/ref/WeakReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ref/WeakReference<",
            "Landroid/widget/TextView;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private final minsCounter:Ljava/lang/ref/WeakReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ref/WeakReference<",
            "Landroid/widget/TextView;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private final secsCounter:Ljava/lang/ref/WeakReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ref/WeakReference<",
            "Landroid/widget/TextView;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private timer:Lcom/shopkick/app/store/CountdownTimerController$BonusCountdownTimer;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lcom/shopkick/app/store/ICountdownTimerFinished;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/TextView;)V
    .locals 2
    .param p1    # Lcom/shopkick/app/store/ICountdownTimerFinished;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Landroid/widget/TextView;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p3    # Landroid/widget/TextView;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p4    # Landroid/widget/TextView;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p5    # Landroid/widget/TextView;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "coundownTimerCallback"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "daysCounter"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "hoursCounter"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "minsCounter"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "secsCounter"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 19
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-wide/16 v0, -0x1

    .line 16
    iput-wide v0, p0, Lcom/shopkick/app/store/CountdownTimerController;->expiryTs:J

    .line 19
    new-instance v0, Ljava/lang/ref/WeakReference;

    invoke-direct {v0, p2}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object v0, p0, Lcom/shopkick/app/store/CountdownTimerController;->daysCounter:Ljava/lang/ref/WeakReference;

    .line 20
    new-instance p2, Ljava/lang/ref/WeakReference;

    invoke-direct {p2, p3}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object p2, p0, Lcom/shopkick/app/store/CountdownTimerController;->hoursCounter:Ljava/lang/ref/WeakReference;

    .line 21
    new-instance p2, Ljava/lang/ref/WeakReference;

    invoke-direct {p2, p4}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object p2, p0, Lcom/shopkick/app/store/CountdownTimerController;->minsCounter:Ljava/lang/ref/WeakReference;

    .line 22
    new-instance p2, Ljava/lang/ref/WeakReference;

    invoke-direct {p2, p5}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object p2, p0, Lcom/shopkick/app/store/CountdownTimerController;->secsCounter:Ljava/lang/ref/WeakReference;

    .line 23
    new-instance p2, Ljava/lang/ref/WeakReference;

    invoke-direct {p2, p1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object p2, p0, Lcom/shopkick/app/store/CountdownTimerController;->coundownTimerCallback:Ljava/lang/ref/WeakReference;

    return-void
.end method

.method public static final synthetic access$onFinish(Lcom/shopkick/app/store/CountdownTimerController;)V
    .locals 0

    .line 9
    invoke-direct {p0}, Lcom/shopkick/app/store/CountdownTimerController;->onFinish()V

    return-void
.end method

.method public static final synthetic access$onTick(Lcom/shopkick/app/store/CountdownTimerController;J)V
    .locals 0

    .line 9
    invoke-direct {p0, p1, p2}, Lcom/shopkick/app/store/CountdownTimerController;->onTick(J)V

    return-void
.end method

.method private final onFinish()V
    .locals 9

    const-wide/16 v1, 0x0

    const-wide/16 v3, 0x0

    const-wide/16 v5, 0x0

    const-wide/16 v7, 0x0

    move-object v0, p0

    .line 59
    invoke-direct/range {v0 .. v8}, Lcom/shopkick/app/store/CountdownTimerController;->setCounterValues(JJJJ)V

    .line 60
    iget-object v0, p0, Lcom/shopkick/app/store/CountdownTimerController;->coundownTimerCallback:Ljava/lang/ref/WeakReference;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/shopkick/app/store/ICountdownTimerFinished;

    if-eqz v0, :cond_0

    invoke-interface {v0}, Lcom/shopkick/app/store/ICountdownTimerFinished;->onCountdownTimerFinished()V

    .line 61
    :cond_0
    invoke-virtual {p0}, Lcom/shopkick/app/store/CountdownTimerController;->clear()V

    return-void
.end method

.method private final onTick(J)V
    .locals 10

    .line 48
    sget-object v0, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    invoke-virtual {v0, p1, p2}, Ljava/util/concurrent/TimeUnit;->toDays(J)J

    move-result-wide v2

    .line 49
    sget-object v0, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    invoke-virtual {v0, p1, p2}, Ljava/util/concurrent/TimeUnit;->toHours(J)J

    move-result-wide v0

    sget-object v4, Ljava/util/concurrent/TimeUnit;->DAYS:Ljava/util/concurrent/TimeUnit;

    invoke-virtual {v4, v2, v3}, Ljava/util/concurrent/TimeUnit;->toHours(J)J

    move-result-wide v4

    sub-long v4, v0, v4

    .line 50
    sget-object v0, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    invoke-virtual {v0, p1, p2}, Ljava/util/concurrent/TimeUnit;->toMinutes(J)J

    move-result-wide v0

    sget-object v6, Ljava/util/concurrent/TimeUnit;->DAYS:Ljava/util/concurrent/TimeUnit;

    invoke-virtual {v6, v2, v3}, Ljava/util/concurrent/TimeUnit;->toMinutes(J)J

    move-result-wide v6

    sub-long/2addr v0, v6

    .line 51
    sget-object v6, Ljava/util/concurrent/TimeUnit;->HOURS:Ljava/util/concurrent/TimeUnit;

    invoke-virtual {v6, v4, v5}, Ljava/util/concurrent/TimeUnit;->toMinutes(J)J

    move-result-wide v6

    sub-long v6, v0, v6

    .line 52
    sget-object v0, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    invoke-virtual {v0, p1, p2}, Ljava/util/concurrent/TimeUnit;->toSeconds(J)J

    move-result-wide p1

    sget-object v0, Ljava/util/concurrent/TimeUnit;->DAYS:Ljava/util/concurrent/TimeUnit;

    invoke-virtual {v0, v2, v3}, Ljava/util/concurrent/TimeUnit;->toSeconds(J)J

    move-result-wide v0

    sub-long/2addr p1, v0

    .line 53
    sget-object v0, Ljava/util/concurrent/TimeUnit;->HOURS:Ljava/util/concurrent/TimeUnit;

    invoke-virtual {v0, v4, v5}, Ljava/util/concurrent/TimeUnit;->toSeconds(J)J

    move-result-wide v0

    sub-long/2addr p1, v0

    sget-object v0, Ljava/util/concurrent/TimeUnit;->MINUTES:Ljava/util/concurrent/TimeUnit;

    invoke-virtual {v0, v6, v7}, Ljava/util/concurrent/TimeUnit;->toSeconds(J)J

    move-result-wide v0

    sub-long v8, p1, v0

    move-object v1, p0

    .line 54
    invoke-direct/range {v1 .. v9}, Lcom/shopkick/app/store/CountdownTimerController;->setCounterValues(JJJJ)V

    return-void
.end method

.method private final setCounterValues(JJJJ)V
    .locals 6

    .line 65
    iget-object v0, p0, Lcom/shopkick/app/store/CountdownTimerController;->daysCounter:Ljava/lang/ref/WeakReference;

    const/4 v1, 0x0

    const/4 v2, 0x1

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    if-eqz v0, :cond_0

    sget-object v3, Lkotlin/jvm/internal/StringCompanionObject;->INSTANCE:Lkotlin/jvm/internal/StringCompanionObject;

    invoke-static {}, Ljava/util/Locale;->getDefault()Ljava/util/Locale;

    move-result-object v3

    const-string v4, "Locale.getDefault()"

    invoke-static {v3, v4}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v4, "%02d"

    new-array v5, v2, [Ljava/lang/Object;

    invoke-static {p1, p2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p1

    aput-object p1, v5, v1

    array-length p1, v5

    invoke-static {v5, p1}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object p1

    invoke-static {v3, v4, p1}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    const-string p2, "java.lang.String.format(locale, format, *args)"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, Ljava/lang/CharSequence;

    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 66
    :cond_0
    iget-object p1, p0, Lcom/shopkick/app/store/CountdownTimerController;->hoursCounter:Ljava/lang/ref/WeakReference;

    if-eqz p1, :cond_1

    invoke-virtual {p1}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroid/widget/TextView;

    if-eqz p1, :cond_1

    sget-object p2, Lkotlin/jvm/internal/StringCompanionObject;->INSTANCE:Lkotlin/jvm/internal/StringCompanionObject;

    invoke-static {}, Ljava/util/Locale;->getDefault()Ljava/util/Locale;

    move-result-object p2

    const-string v0, "Locale.getDefault()"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "%02d"

    new-array v3, v2, [Ljava/lang/Object;

    invoke-static {p3, p4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p3

    aput-object p3, v3, v1

    array-length p3, v3

    invoke-static {v3, p3}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object p3

    invoke-static {p2, v0, p3}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p2

    const-string p3, "java.lang.String.format(locale, format, *args)"

    invoke-static {p2, p3}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p2, Ljava/lang/CharSequence;

    invoke-virtual {p1, p2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 67
    :cond_1
    iget-object p1, p0, Lcom/shopkick/app/store/CountdownTimerController;->minsCounter:Ljava/lang/ref/WeakReference;

    if-eqz p1, :cond_2

    invoke-virtual {p1}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroid/widget/TextView;

    if-eqz p1, :cond_2

    sget-object p2, Lkotlin/jvm/internal/StringCompanionObject;->INSTANCE:Lkotlin/jvm/internal/StringCompanionObject;

    invoke-static {}, Ljava/util/Locale;->getDefault()Ljava/util/Locale;

    move-result-object p2

    const-string p3, "Locale.getDefault()"

    invoke-static {p2, p3}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p3, "%02d"

    new-array p4, v2, [Ljava/lang/Object;

    invoke-static {p5, p6}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p5

    aput-object p5, p4, v1

    array-length p5, p4

    invoke-static {p4, p5}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object p4

    invoke-static {p2, p3, p4}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p2

    const-string p3, "java.lang.String.format(locale, format, *args)"

    invoke-static {p2, p3}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p2, Ljava/lang/CharSequence;

    invoke-virtual {p1, p2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 68
    :cond_2
    iget-object p1, p0, Lcom/shopkick/app/store/CountdownTimerController;->secsCounter:Ljava/lang/ref/WeakReference;

    if-eqz p1, :cond_3

    invoke-virtual {p1}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroid/widget/TextView;

    if-eqz p1, :cond_3

    sget-object p2, Lkotlin/jvm/internal/StringCompanionObject;->INSTANCE:Lkotlin/jvm/internal/StringCompanionObject;

    invoke-static {}, Ljava/util/Locale;->getDefault()Ljava/util/Locale;

    move-result-object p2

    const-string p3, "Locale.getDefault()"

    invoke-static {p2, p3}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p3, "%02d"

    new-array p4, v2, [Ljava/lang/Object;

    invoke-static {p7, p8}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p5

    aput-object p5, p4, v1

    array-length p5, p4

    invoke-static {p4, p5}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object p4

    invoke-static {p2, p3, p4}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p2

    const-string p3, "java.lang.String.format(locale, format, *args)"

    invoke-static {p2, p3}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p2, Ljava/lang/CharSequence;

    invoke-virtual {p1, p2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    :cond_3
    return-void
.end method


# virtual methods
.method public final clear()V
    .locals 2

    .line 43
    invoke-virtual {p0}, Lcom/shopkick/app/store/CountdownTimerController;->stop()V

    const-wide/high16 v0, -0x8000000000000000L

    .line 44
    iput-wide v0, p0, Lcom/shopkick/app/store/CountdownTimerController;->expiryTs:J

    return-void
.end method

.method public final getCoundownTimerCallback()Ljava/lang/ref/WeakReference;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/lang/ref/WeakReference<",
            "Lcom/shopkick/app/store/ICountdownTimerFinished;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 15
    iget-object v0, p0, Lcom/shopkick/app/store/CountdownTimerController;->coundownTimerCallback:Ljava/lang/ref/WeakReference;

    return-object v0
.end method

.method public final getDaysCounter()Ljava/lang/ref/WeakReference;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/lang/ref/WeakReference<",
            "Landroid/widget/TextView;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 11
    iget-object v0, p0, Lcom/shopkick/app/store/CountdownTimerController;->daysCounter:Ljava/lang/ref/WeakReference;

    return-object v0
.end method

.method public final getExpiryTs()J
    .locals 2

    .line 16
    iget-wide v0, p0, Lcom/shopkick/app/store/CountdownTimerController;->expiryTs:J

    return-wide v0
.end method

.method public final getHoursCounter()Ljava/lang/ref/WeakReference;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/lang/ref/WeakReference<",
            "Landroid/widget/TextView;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 12
    iget-object v0, p0, Lcom/shopkick/app/store/CountdownTimerController;->hoursCounter:Ljava/lang/ref/WeakReference;

    return-object v0
.end method

.method public final getMinsCounter()Ljava/lang/ref/WeakReference;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/lang/ref/WeakReference<",
            "Landroid/widget/TextView;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 13
    iget-object v0, p0, Lcom/shopkick/app/store/CountdownTimerController;->minsCounter:Ljava/lang/ref/WeakReference;

    return-object v0
.end method

.method public final getSecsCounter()Ljava/lang/ref/WeakReference;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/lang/ref/WeakReference<",
            "Landroid/widget/TextView;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 14
    iget-object v0, p0, Lcom/shopkick/app/store/CountdownTimerController;->secsCounter:Ljava/lang/ref/WeakReference;

    return-object v0
.end method

.method public final getTimer()Lcom/shopkick/app/store/CountdownTimerController$BonusCountdownTimer;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 10
    iget-object v0, p0, Lcom/shopkick/app/store/CountdownTimerController;->timer:Lcom/shopkick/app/store/CountdownTimerController$BonusCountdownTimer;

    return-object v0
.end method

.method public final setExpiryTs(J)V
    .locals 0

    .line 16
    iput-wide p1, p0, Lcom/shopkick/app/store/CountdownTimerController;->expiryTs:J

    return-void
.end method

.method public final setTimer(Lcom/shopkick/app/store/CountdownTimerController$BonusCountdownTimer;)V
    .locals 0
    .param p1    # Lcom/shopkick/app/store/CountdownTimerController$BonusCountdownTimer;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    .line 10
    iput-object p1, p0, Lcom/shopkick/app/store/CountdownTimerController;->timer:Lcom/shopkick/app/store/CountdownTimerController$BonusCountdownTimer;

    return-void
.end method

.method public final start(J)V
    .locals 9

    .line 27
    iput-wide p1, p0, Lcom/shopkick/app/store/CountdownTimerController;->expiryTs:J

    .line 29
    iget-object v0, p0, Lcom/shopkick/app/store/CountdownTimerController;->timer:Lcom/shopkick/app/store/CountdownTimerController$BonusCountdownTimer;

    if-nez v0, :cond_1

    .line 30
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    sub-long/2addr p1, v0

    const-wide/16 v0, 0x0

    cmp-long v2, p1, v0

    if-gez v2, :cond_0

    move-wide v4, v0

    goto :goto_0

    :cond_0
    move-wide v4, p1

    .line 32
    :goto_0
    new-instance p1, Lcom/shopkick/app/store/CountdownTimerController$BonusCountdownTimer;

    const-wide/16 v6, 0x3e8

    move-object v3, p1

    move-object v8, p0

    invoke-direct/range {v3 .. v8}, Lcom/shopkick/app/store/CountdownTimerController$BonusCountdownTimer;-><init>(JJLcom/shopkick/app/store/CountdownTimerController;)V

    iput-object p1, p0, Lcom/shopkick/app/store/CountdownTimerController;->timer:Lcom/shopkick/app/store/CountdownTimerController$BonusCountdownTimer;

    .line 33
    iget-object p1, p0, Lcom/shopkick/app/store/CountdownTimerController;->timer:Lcom/shopkick/app/store/CountdownTimerController$BonusCountdownTimer;

    if-eqz p1, :cond_1

    invoke-virtual {p1}, Lcom/shopkick/app/store/CountdownTimerController$BonusCountdownTimer;->start()Landroid/os/CountDownTimer;

    :cond_1
    return-void
.end method

.method public final stop()V
    .locals 1

    .line 38
    iget-object v0, p0, Lcom/shopkick/app/store/CountdownTimerController;->timer:Lcom/shopkick/app/store/CountdownTimerController$BonusCountdownTimer;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lcom/shopkick/app/store/CountdownTimerController$BonusCountdownTimer;->cancel()V

    :cond_0
    const/4 v0, 0x0

    .line 39
    check-cast v0, Lcom/shopkick/app/store/CountdownTimerController$BonusCountdownTimer;

    iput-object v0, p0, Lcom/shopkick/app/store/CountdownTimerController;->timer:Lcom/shopkick/app/store/CountdownTimerController$BonusCountdownTimer;

    return-void
.end method
