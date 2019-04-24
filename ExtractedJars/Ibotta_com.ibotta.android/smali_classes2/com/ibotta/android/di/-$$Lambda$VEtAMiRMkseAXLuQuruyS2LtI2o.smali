.class public final synthetic Lcom/ibotta/android/di/-$$Lambda$VEtAMiRMkseAXLuQuruyS2LtI2o;
.super Ljava/lang/Object;
.source "lambda"

# interfaces
.implements Lcom/ibotta/android/tracking/DebugTrackingSupplier;


# instance fields
.field private final synthetic f$0:Lcom/ibotta/android/profile/BuildProfile;


# direct methods
.method public synthetic constructor <init>(Lcom/ibotta/android/profile/BuildProfile;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/ibotta/android/di/-$$Lambda$VEtAMiRMkseAXLuQuruyS2LtI2o;->f$0:Lcom/ibotta/android/profile/BuildProfile;

    return-void
.end method


# virtual methods
.method public final get()Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lcom/ibotta/android/di/-$$Lambda$VEtAMiRMkseAXLuQuruyS2LtI2o;->f$0:Lcom/ibotta/android/profile/BuildProfile;

    invoke-interface {v0}, Lcom/ibotta/android/profile/BuildProfile;->isDebugTrackingQueue()Z

    move-result v0

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    return-object v0
.end method
