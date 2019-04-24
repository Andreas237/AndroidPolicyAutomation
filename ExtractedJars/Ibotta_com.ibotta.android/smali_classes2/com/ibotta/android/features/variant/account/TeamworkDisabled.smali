.class public Lcom/ibotta/android/features/variant/account/TeamworkDisabled;
.super Ljava/lang/Object;
.source "TeamworkDisabled.java"

# interfaces
.implements Lcom/ibotta/android/features/ExperimentalVariant;
.implements Lcom/ibotta/android/features/variant/account/TeamworkVariant;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 12
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method static synthetic lambda$filterPredicate$0(Lcom/ibotta/android/mvp/ui/activity/account/row/AbstractAccountRow;)Z
    .locals 2

    .line 17
    instance-of v0, p0, Lcom/ibotta/android/mvp/ui/activity/account/row/AccountMenuRow;

    const/4 v1, 0x1

    if-eqz v0, :cond_1

    .line 18
    check-cast p0, Lcom/ibotta/android/mvp/ui/activity/account/row/AccountMenuRow;

    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/activity/account/row/AccountMenuRow;->getAccountMenu()Lcom/ibotta/android/mvp/ui/activity/account/AccountMenu;

    move-result-object p0

    sget-object v0, Lcom/ibotta/android/mvp/ui/activity/account/AccountMenu;->TEAMWORK:Lcom/ibotta/android/mvp/ui/activity/account/AccountMenu;

    if-eq p0, v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    return v1

    :cond_1
    return v1
.end method


# virtual methods
.method public filterPredicate()Ljava9/util/function/Predicate;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava9/util/function/Predicate<",
            "Lcom/ibotta/android/mvp/ui/activity/account/row/AbstractAccountRow;",
            ">;"
        }
    .end annotation

    .line 16
    sget-object v0, Lcom/ibotta/android/features/variant/account/-$$Lambda$TeamworkDisabled$6zrqcoazfZYcxaSzjLQi5jrS29k;->INSTANCE:Lcom/ibotta/android/features/variant/account/-$$Lambda$TeamworkDisabled$6zrqcoazfZYcxaSzjLQi5jrS29k;

    return-object v0
.end method
