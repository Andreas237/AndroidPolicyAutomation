.class public final synthetic Lcom/ibotta/android/mvp/ui/activity/featured/row/-$$Lambda$BannersRow$zqrvD2315kmhuf_RMw3BjCfp2Eo;
.super Ljava/lang/Object;
.source "lambda"

# interfaces
.implements Ljava/util/Comparator;


# static fields
.field public static final synthetic INSTANCE:Lcom/ibotta/android/mvp/ui/activity/featured/row/-$$Lambda$BannersRow$zqrvD2315kmhuf_RMw3BjCfp2Eo;


# direct methods
.method static synthetic constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/ibotta/android/mvp/ui/activity/featured/row/-$$Lambda$BannersRow$zqrvD2315kmhuf_RMw3BjCfp2Eo;

    invoke-direct {v0}, Lcom/ibotta/android/mvp/ui/activity/featured/row/-$$Lambda$BannersRow$zqrvD2315kmhuf_RMw3BjCfp2Eo;-><init>()V

    sput-object v0, Lcom/ibotta/android/mvp/ui/activity/featured/row/-$$Lambda$BannersRow$zqrvD2315kmhuf_RMw3BjCfp2Eo;->INSTANCE:Lcom/ibotta/android/mvp/ui/activity/featured/row/-$$Lambda$BannersRow$zqrvD2315kmhuf_RMw3BjCfp2Eo;

    return-void
.end method

.method private synthetic constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final compare(Ljava/lang/Object;Ljava/lang/Object;)I
    .locals 0

    check-cast p1, Lcom/ibotta/api/model/FeatureModel;

    check-cast p2, Lcom/ibotta/api/model/FeatureModel;

    invoke-static {p1, p2}, Lcom/ibotta/android/mvp/ui/activity/featured/row/BannersRow;->lambda$getModels$0(Lcom/ibotta/api/model/FeatureModel;Lcom/ibotta/api/model/FeatureModel;)I

    move-result p1

    return p1
.end method
