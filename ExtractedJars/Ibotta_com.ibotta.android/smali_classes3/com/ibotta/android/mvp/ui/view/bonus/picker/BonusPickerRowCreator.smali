.class public interface abstract Lcom/ibotta/android/mvp/ui/view/bonus/picker/BonusPickerRowCreator;
.super Ljava/lang/Object;
.source "BonusPickerRowCreator.java"


# virtual methods
.method public abstract buildDataMap()Ljava/util/LinkedHashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/LinkedHashMap<",
            "Lcom/ibotta/android/mvp/ui/activity/bonus/BonusPickerTab;",
            "Ljava/util/List<",
            "+",
            "Lcom/ibotta/android/mvp/ui/view/bonus/picker/row/AbstractBonusPickerRow;",
            ">;>;"
        }
    .end annotation
.end method

.method public abstract getFetchJobs()Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Set<",
            "Lcom/ibotta/android/service/api/job/ApiJob;",
            ">;"
        }
    .end annotation
.end method

.method public abstract onAbandonFetchJobs()V
.end method
