.class public final synthetic Lcom/shopkick/app/debug/-$$Lambda$PresenceLocationsListAdapter$lDyucG88oTXLAkIudDKzNc4Gr9Q;
.super Ljava/lang/Object;
.source "lambda"

# interfaces
.implements Ljava/util/Comparator;


# instance fields
.field private final synthetic f$0:Lcom/shopkick/app/debug/PresenceLocationsListAdapter;


# direct methods
.method public synthetic constructor <init>(Lcom/shopkick/app/debug/PresenceLocationsListAdapter;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/shopkick/app/debug/-$$Lambda$PresenceLocationsListAdapter$lDyucG88oTXLAkIudDKzNc4Gr9Q;->f$0:Lcom/shopkick/app/debug/PresenceLocationsListAdapter;

    return-void
.end method


# virtual methods
.method public final compare(Ljava/lang/Object;Ljava/lang/Object;)I
    .locals 1

    iget-object v0, p0, Lcom/shopkick/app/debug/-$$Lambda$PresenceLocationsListAdapter$lDyucG88oTXLAkIudDKzNc4Gr9Q;->f$0:Lcom/shopkick/app/debug/PresenceLocationsListAdapter;

    check-cast p1, Lcom/shopkick/app/fetchers/api/skapi/UltrasonicTransmitter;

    check-cast p2, Lcom/shopkick/app/fetchers/api/skapi/UltrasonicTransmitter;

    invoke-static {v0, p1, p2}, Lcom/shopkick/app/debug/PresenceLocationsListAdapter;->lambda$new$70(Lcom/shopkick/app/debug/PresenceLocationsListAdapter;Lcom/shopkick/app/fetchers/api/skapi/UltrasonicTransmitter;Lcom/shopkick/app/fetchers/api/skapi/UltrasonicTransmitter;)I

    move-result p1

    return p1
.end method
