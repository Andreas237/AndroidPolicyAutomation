.class public Lcom/ibotta/android/features/variant/account/TeamworkEnabled;
.super Ljava/lang/Object;
.source "TeamworkEnabled.java"

# interfaces
.implements Lcom/ibotta/android/features/ControlVariant;
.implements Lcom/ibotta/android/features/variant/account/TeamworkVariant;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 10
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method static synthetic lambda$filterPredicate$0(Lcom/ibotta/android/mvp/ui/activity/account/row/AbstractAccountRow;)Z
    .locals 0

    const/4 p0, 0x1

    return p0
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

    .line 13
    sget-object v0, Lcom/ibotta/android/features/variant/account/-$$Lambda$TeamworkEnabled$9tzn2EI4a1UlcCIC0TGVSxejQDw;->INSTANCE:Lcom/ibotta/android/features/variant/account/-$$Lambda$TeamworkEnabled$9tzn2EI4a1UlcCIC0TGVSxejQDw;

    return-object v0
.end method
