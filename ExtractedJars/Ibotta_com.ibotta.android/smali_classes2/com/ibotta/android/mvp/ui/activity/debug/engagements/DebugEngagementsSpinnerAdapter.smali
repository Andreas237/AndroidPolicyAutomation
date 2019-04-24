.class public Lcom/ibotta/android/mvp/ui/activity/debug/engagements/DebugEngagementsSpinnerAdapter;
.super Landroid/widget/ArrayAdapter;
.source "DebugEngagementsSpinnerAdapter.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Landroid/widget/ArrayAdapter<",
        "Ljava/lang/String;",
        ">;"
    }
.end annotation


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 2

    const v0, 0x7f0c0149

    const v1, 0x7f090539

    .line 20
    invoke-direct {p0, p1, v0, v1}, Landroid/widget/ArrayAdapter;-><init>(Landroid/content/Context;II)V

    .line 22
    new-instance p1, Ljava/util/ArrayList;

    invoke-static {}, Lcom/ibotta/api/model/TaskModel$Type;->values()[Lcom/ibotta/api/model/TaskModel$Type;

    move-result-object v0

    invoke-static {v0}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 23
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 24
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/ibotta/api/model/TaskModel$Type;

    .line 25
    invoke-virtual {v1}, Lcom/ibotta/api/model/TaskModel$Type;->getTrackingName()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 27
    :cond_0
    invoke-static {v0}, Ljava/util/Collections;->sort(Ljava/util/List;)V

    .line 29
    invoke-virtual {p0, v0}, Lcom/ibotta/android/mvp/ui/activity/debug/engagements/DebugEngagementsSpinnerAdapter;->addAll(Ljava/util/Collection;)V

    return-void
.end method
