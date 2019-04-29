.class public Lcom/mopub/mobileads/factories/AdViewControllerFactory;
.super Ljava/lang/Object;
.source "AdViewControllerFactory.java"


# static fields
.field protected static instance:Lcom/mopub/mobileads/factories/AdViewControllerFactory;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 9
    new-instance v0, Lcom/mopub/mobileads/factories/AdViewControllerFactory;

    invoke-direct {v0}, Lcom/mopub/mobileads/factories/AdViewControllerFactory;-><init>()V

    sput-object v0, Lcom/mopub/mobileads/factories/AdViewControllerFactory;->instance:Lcom/mopub/mobileads/factories/AdViewControllerFactory;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 8
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static create(Landroid/content/Context;Lcom/mopub/mobileads/MoPubView;)Lcom/mopub/mobileads/AdViewController;
    .locals 1

    .line 17
    sget-object v0, Lcom/mopub/mobileads/factories/AdViewControllerFactory;->instance:Lcom/mopub/mobileads/factories/AdViewControllerFactory;

    invoke-virtual {v0, p0, p1}, Lcom/mopub/mobileads/factories/AdViewControllerFactory;->internalCreate(Landroid/content/Context;Lcom/mopub/mobileads/MoPubView;)Lcom/mopub/mobileads/AdViewController;

    move-result-object p0

    return-object p0
.end method

.method public static setInstance(Lcom/mopub/mobileads/factories/AdViewControllerFactory;)V
    .locals 0
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 13
    sput-object p0, Lcom/mopub/mobileads/factories/AdViewControllerFactory;->instance:Lcom/mopub/mobileads/factories/AdViewControllerFactory;

    return-void
.end method


# virtual methods
.method protected internalCreate(Landroid/content/Context;Lcom/mopub/mobileads/MoPubView;)Lcom/mopub/mobileads/AdViewController;
    .locals 1

    .line 21
    new-instance v0, Lcom/mopub/mobileads/AdViewController;

    invoke-direct {v0, p1, p2}, Lcom/mopub/mobileads/AdViewController;-><init>(Landroid/content/Context;Lcom/mopub/mobileads/MoPubView;)V

    return-object v0
.end method
