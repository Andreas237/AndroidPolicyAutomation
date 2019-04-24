.class public Lcom/ibotta/android/state/app/config/personalization/StoreSelectorCategory;
.super Ljava/lang/Object;
.source "StoreSelectorCategory.java"


# instance fields
.field private excludedRetailers:Ljava/util/LinkedHashSet;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/LinkedHashSet<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field

.field private ids:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field

.field private name:Ljava/lang/String;

.field private numRetailers:Ljava/lang/Integer;

.field private requiredRetailers:Ljava/util/LinkedHashSet;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/LinkedHashSet<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 12
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public getExcludedRetailers()Ljava/util/LinkedHashSet;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/LinkedHashSet<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation

    .line 52
    iget-object v0, p0, Lcom/ibotta/android/state/app/config/personalization/StoreSelectorCategory;->excludedRetailers:Ljava/util/LinkedHashSet;

    return-object v0
.end method

.method public getIds()Ljava/util/Set;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Set<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation

    .line 28
    iget-object v0, p0, Lcom/ibotta/android/state/app/config/personalization/StoreSelectorCategory;->ids:Ljava/util/Set;

    return-object v0
.end method

.method public getName()Ljava/lang/String;
    .locals 1

    .line 20
    iget-object v0, p0, Lcom/ibotta/android/state/app/config/personalization/StoreSelectorCategory;->name:Ljava/lang/String;

    return-object v0
.end method

.method public getNumRetailers()Ljava/lang/Integer;
    .locals 1

    .line 36
    iget-object v0, p0, Lcom/ibotta/android/state/app/config/personalization/StoreSelectorCategory;->numRetailers:Ljava/lang/Integer;

    return-object v0
.end method

.method public getRequiredRetailers()Ljava/util/LinkedHashSet;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/LinkedHashSet<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation

    .line 44
    iget-object v0, p0, Lcom/ibotta/android/state/app/config/personalization/StoreSelectorCategory;->requiredRetailers:Ljava/util/LinkedHashSet;

    return-object v0
.end method

.method public setExcludedRetailers(Ljava/util/LinkedHashSet;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/LinkedHashSet<",
            "Ljava/lang/Integer;",
            ">;)V"
        }
    .end annotation

    .line 56
    iput-object p1, p0, Lcom/ibotta/android/state/app/config/personalization/StoreSelectorCategory;->excludedRetailers:Ljava/util/LinkedHashSet;

    return-void
.end method

.method public setIds(Ljava/util/Set;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Set<",
            "Ljava/lang/Integer;",
            ">;)V"
        }
    .end annotation

    .line 32
    iput-object p1, p0, Lcom/ibotta/android/state/app/config/personalization/StoreSelectorCategory;->ids:Ljava/util/Set;

    return-void
.end method

.method public setName(Ljava/lang/String;)V
    .locals 0

    .line 24
    iput-object p1, p0, Lcom/ibotta/android/state/app/config/personalization/StoreSelectorCategory;->name:Ljava/lang/String;

    return-void
.end method

.method public setNumRetailers(Ljava/lang/Integer;)V
    .locals 0

    .line 40
    iput-object p1, p0, Lcom/ibotta/android/state/app/config/personalization/StoreSelectorCategory;->numRetailers:Ljava/lang/Integer;

    return-void
.end method

.method public setRequiredRetailers(Ljava/util/LinkedHashSet;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/LinkedHashSet<",
            "Ljava/lang/Integer;",
            ">;)V"
        }
    .end annotation

    .line 48
    iput-object p1, p0, Lcom/ibotta/android/state/app/config/personalization/StoreSelectorCategory;->requiredRetailers:Ljava/util/LinkedHashSet;

    return-void
.end method
