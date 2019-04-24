.class public interface abstract Lcom/shopkick/sdk/zone/Zone;
.super Ljava/lang/Object;
.source "Zone.java"


# virtual methods
.method public abstract getActions()Ljava/util/List;
    .annotation build Landroid/support/annotation/NonNull;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/shopkick/sdk/zone/ZoneParcelable$ActionParcelable;",
            ">;"
        }
    .end annotation
.end method

.method public abstract getAttribute(Ljava/lang/String;)Ljava/lang/Object;
    .annotation build Landroid/support/annotation/Nullable;
    .end annotation
.end method

.method public abstract getAttributeNames()Ljava/util/Set;
    .annotation build Landroid/support/annotation/NonNull;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Set<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end method

.method public abstract getParentZoneId()Ljava/lang/String;
    .annotation build Landroid/support/annotation/NonNull;
    .end annotation
.end method

.method public abstract getTriggers()Ljava/util/List;
    .annotation build Landroid/support/annotation/NonNull;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/shopkick/sdk/zone/ZoneParcelable$TriggerParcelable;",
            ">;"
        }
    .end annotation
.end method

.method public abstract getZoneId()Ljava/lang/String;
    .annotation build Landroid/support/annotation/NonNull;
    .end annotation
.end method

.method public abstract getZoneType()Ljava/lang/String;
    .annotation build Landroid/support/annotation/NonNull;
    .end annotation
.end method
