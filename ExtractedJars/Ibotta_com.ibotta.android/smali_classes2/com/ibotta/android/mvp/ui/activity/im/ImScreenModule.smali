.class public Lcom/ibotta/android/mvp/ui/activity/im/ImScreenModule;
.super Ljava/lang/Object;
.source "ImScreenModule.java"


# annotations
.annotation runtime Ldagger/Module;
.end annotation


# instance fields
.field private final activity:Landroid/app/Activity;


# direct methods
.method public constructor <init>(Landroid/app/Activity;)V
    .locals 0

    .line 18
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 19
    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/im/ImScreenModule;->activity:Landroid/app/Activity;

    return-void
.end method


# virtual methods
.method public provideImRedemptionActionCollaborators()Lcom/ibotta/android/mvp/ui/activity/im/ImRedemptionActionCollaborators;
    .locals 1
    .annotation runtime Lcom/ibotta/android/mvp/base/PerActivity;
    .end annotation

    .annotation runtime Ldagger/Provides;
    .end annotation

    .line 36
    new-instance v0, Lcom/ibotta/android/mvp/ui/activity/im/ImRedemptionActionCollaborators;

    invoke-direct {v0}, Lcom/ibotta/android/mvp/ui/activity/im/ImRedemptionActionCollaborators;-><init>()V

    return-object v0
.end method

.method public provideImRedemptionDispatcher(Lcom/ibotta/android/mvp/ui/activity/im/ImUtil;Lcom/ibotta/android/state/app/config/AppConfig;Lcom/ibotta/android/mvp/ui/activity/im/ImRedemptionActionCollaborators;Lcom/ibotta/android/fragment/dialog/RedeemPreFlightHelper;Lcom/ibotta/android/fragment/retailer/RetailerParcelHelper;Lcom/ibotta/android/util/AppHelper;)Lcom/ibotta/android/mvp/ui/activity/im/ImRedemptionAction;
    .locals 9
    .annotation runtime Lcom/ibotta/android/mvp/base/PerActivity;
    .end annotation

    .annotation runtime Ldagger/Provides;
    .end annotation

    .line 30
    new-instance v8, Lcom/ibotta/android/mvp/ui/activity/im/ImRedemptionActionImpl;

    iget-object v3, p0, Lcom/ibotta/android/mvp/ui/activity/im/ImScreenModule;->activity:Landroid/app/Activity;

    move-object v0, v8

    move-object v1, p1

    move-object v2, p2

    move-object v4, p3

    move-object v5, p4

    move-object v6, p5

    move-object v7, p6

    invoke-direct/range {v0 .. v7}, Lcom/ibotta/android/mvp/ui/activity/im/ImRedemptionActionImpl;-><init>(Lcom/ibotta/android/mvp/ui/activity/im/ImUtil;Lcom/ibotta/android/state/app/config/AppConfig;Landroid/app/Activity;Lcom/ibotta/android/mvp/ui/activity/im/ImRedemptionActionCollaborators;Lcom/ibotta/android/fragment/dialog/RedeemPreFlightHelper;Lcom/ibotta/android/fragment/retailer/RetailerParcelHelper;Lcom/ibotta/android/util/AppHelper;)V

    return-object v8
.end method
