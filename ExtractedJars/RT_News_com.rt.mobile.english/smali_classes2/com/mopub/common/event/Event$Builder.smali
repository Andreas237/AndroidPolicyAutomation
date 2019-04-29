.class public Lcom/mopub/common/event/Event$Builder;
.super Lcom/mopub/common/event/BaseEvent$Builder;
.source "Event.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/mopub/common/event/Event;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "Builder"
.end annotation


# direct methods
.method public constructor <init>(Lcom/mopub/common/event/BaseEvent$Name;Lcom/mopub/common/event/BaseEvent$Category;D)V
    .locals 6
    .param p1    # Lcom/mopub/common/event/BaseEvent$Name;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .param p2    # Lcom/mopub/common/event/BaseEvent$Category;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    .line 19
    sget-object v1, Lcom/mopub/common/event/BaseEvent$ScribeCategory;->EXCHANGE_CLIENT_EVENT:Lcom/mopub/common/event/BaseEvent$ScribeCategory;

    move-object v0, p0

    move-object v2, p1

    move-object v3, p2

    move-wide v4, p3

    invoke-direct/range {v0 .. v5}, Lcom/mopub/common/event/BaseEvent$Builder;-><init>(Lcom/mopub/common/event/BaseEvent$ScribeCategory;Lcom/mopub/common/event/BaseEvent$Name;Lcom/mopub/common/event/BaseEvent$Category;D)V

    return-void
.end method


# virtual methods
.method public bridge synthetic build()Lcom/mopub/common/event/BaseEvent;
    .locals 1

    .line 17
    invoke-virtual {p0}, Lcom/mopub/common/event/Event$Builder;->build()Lcom/mopub/common/event/Event;

    move-result-object v0

    return-object v0
.end method

.method public build()Lcom/mopub/common/event/Event;
    .locals 2
    .annotation build Landroid/support/annotation/NonNull;
    .end annotation

    .line 25
    new-instance v0, Lcom/mopub/common/event/Event;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Lcom/mopub/common/event/Event;-><init>(Lcom/mopub/common/event/Event$Builder;Lcom/mopub/common/event/Event$1;)V

    return-object v0
.end method
