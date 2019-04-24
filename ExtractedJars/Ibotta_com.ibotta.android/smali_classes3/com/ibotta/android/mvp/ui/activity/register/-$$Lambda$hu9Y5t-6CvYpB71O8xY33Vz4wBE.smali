.class public final synthetic Lcom/ibotta/android/mvp/ui/activity/register/-$$Lambda$hu9Y5t-6CvYpB71O8xY33Vz4wBE;
.super Ljava/lang/Object;
.source "lambda"

# interfaces
.implements Lcom/ibotta/android/tracking/proprietary/pat/PartnerAppNameAndIdMap;


# instance fields
.field private final synthetic f$0:Lcom/ibotta/android/state/app/config/pat/PartnerAppTrackingConfig;


# direct methods
.method public synthetic constructor <init>(Lcom/ibotta/android/state/app/config/pat/PartnerAppTrackingConfig;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/register/-$$Lambda$hu9Y5t-6CvYpB71O8xY33Vz4wBE;->f$0:Lcom/ibotta/android/state/app/config/pat/PartnerAppTrackingConfig;

    return-void
.end method


# virtual methods
.method public final get()Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/register/-$$Lambda$hu9Y5t-6CvYpB71O8xY33Vz4wBE;->f$0:Lcom/ibotta/android/state/app/config/pat/PartnerAppTrackingConfig;

    invoke-virtual {v0}, Lcom/ibotta/android/state/app/config/pat/PartnerAppTrackingConfig;->getAppNameAndIdMap()Ljava/util/Map;

    move-result-object v0

    return-object v0
.end method
