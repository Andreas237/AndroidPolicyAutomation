.class public final synthetic Lcom/ibotta/android/di/-$$Lambda$TrackingModule$nIg9CmWfMzhbt0byg7U_Ub1h-dE;
.super Ljava/lang/Object;
.source "lambda"

# interfaces
.implements Lcom/ibotta/android/abstractions/UserLastLocationSupplier;


# instance fields
.field private final synthetic f$0:Lcom/ibotta/android/state/user/UserState;


# direct methods
.method public synthetic constructor <init>(Lcom/ibotta/android/state/user/UserState;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/ibotta/android/di/-$$Lambda$TrackingModule$nIg9CmWfMzhbt0byg7U_Ub1h-dE;->f$0:Lcom/ibotta/android/state/user/UserState;

    return-void
.end method


# virtual methods
.method public final get()Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lcom/ibotta/android/di/-$$Lambda$TrackingModule$nIg9CmWfMzhbt0byg7U_Ub1h-dE;->f$0:Lcom/ibotta/android/state/user/UserState;

    invoke-static {v0}, Lcom/ibotta/android/di/TrackingModule;->lambda$provideEventBodyFactory$1(Lcom/ibotta/android/state/user/UserState;)Ljava/util/Map$Entry;

    move-result-object v0

    return-object v0
.end method
