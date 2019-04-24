.class public final synthetic Lcom/ibotta/android/di/-$$Lambda$PartnerAppTrackingModule$kgaCrTEh5M8_EHl3uG11xzkjxqI;
.super Ljava/lang/Object;
.source "lambda"

# interfaces
.implements Lcom/ibotta/android/state/app/config/AppConfigListener;


# instance fields
.field private final synthetic f$0:Lcom/ibotta/android/tracking/proprietary/pat/PartnerAppChecker;

.field private final synthetic f$1:Lcom/ibotta/android/state/app/config/AppConfig;


# direct methods
.method public synthetic constructor <init>(Lcom/ibotta/android/tracking/proprietary/pat/PartnerAppChecker;Lcom/ibotta/android/state/app/config/AppConfig;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/ibotta/android/di/-$$Lambda$PartnerAppTrackingModule$kgaCrTEh5M8_EHl3uG11xzkjxqI;->f$0:Lcom/ibotta/android/tracking/proprietary/pat/PartnerAppChecker;

    iput-object p2, p0, Lcom/ibotta/android/di/-$$Lambda$PartnerAppTrackingModule$kgaCrTEh5M8_EHl3uG11xzkjxqI;->f$1:Lcom/ibotta/android/state/app/config/AppConfig;

    return-void
.end method


# virtual methods
.method public final onAppConfigChanged()V
    .locals 2

    iget-object v0, p0, Lcom/ibotta/android/di/-$$Lambda$PartnerAppTrackingModule$kgaCrTEh5M8_EHl3uG11xzkjxqI;->f$0:Lcom/ibotta/android/tracking/proprietary/pat/PartnerAppChecker;

    iget-object v1, p0, Lcom/ibotta/android/di/-$$Lambda$PartnerAppTrackingModule$kgaCrTEh5M8_EHl3uG11xzkjxqI;->f$1:Lcom/ibotta/android/state/app/config/AppConfig;

    invoke-static {v0, v1}, Lcom/ibotta/android/di/PartnerAppTrackingModule;->lambda$providePartnerAppChecker$0(Lcom/ibotta/android/tracking/proprietary/pat/PartnerAppChecker;Lcom/ibotta/android/state/app/config/AppConfig;)V

    return-void
.end method
