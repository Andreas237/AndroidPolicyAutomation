.class public Lcom/ibotta/android/state/app/config/personalization/StoreSelectorReqsAppConfig;
.super Ljava/lang/Object;
.source "StoreSelectorReqsAppConfig.java"


# instance fields
.field private storeSelectorCategories:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/ibotta/android/state/app/config/personalization/StoreSelectorCategory;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 11
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public getStoreSelectorCategories()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/ibotta/android/state/app/config/personalization/StoreSelectorCategory;",
            ">;"
        }
    .end annotation

    .line 15
    iget-object v0, p0, Lcom/ibotta/android/state/app/config/personalization/StoreSelectorReqsAppConfig;->storeSelectorCategories:Ljava/util/List;

    return-object v0
.end method

.method public setStoreSelectorCategories(Ljava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/ibotta/android/state/app/config/personalization/StoreSelectorCategory;",
            ">;)V"
        }
    .end annotation

    .line 19
    iput-object p1, p0, Lcom/ibotta/android/state/app/config/personalization/StoreSelectorReqsAppConfig;->storeSelectorCategories:Ljava/util/List;

    return-void
.end method
