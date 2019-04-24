.class public final synthetic Lcom/ibotta/android/di/-$$Lambda$4jx5iYA1o0GSiPPxwbmuIvYzxqs;
.super Ljava/lang/Object;
.source "lambda"

# interfaces
.implements Lcom/ibotta/android/tracking/proprietary/pixel/PixelTrackingService;


# static fields
.field public static final synthetic INSTANCE:Lcom/ibotta/android/di/-$$Lambda$4jx5iYA1o0GSiPPxwbmuIvYzxqs;


# direct methods
.method static synthetic constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/ibotta/android/di/-$$Lambda$4jx5iYA1o0GSiPPxwbmuIvYzxqs;

    invoke-direct {v0}, Lcom/ibotta/android/di/-$$Lambda$4jx5iYA1o0GSiPPxwbmuIvYzxqs;-><init>()V

    sput-object v0, Lcom/ibotta/android/di/-$$Lambda$4jx5iYA1o0GSiPPxwbmuIvYzxqs;->INSTANCE:Lcom/ibotta/android/di/-$$Lambda$4jx5iYA1o0GSiPPxwbmuIvYzxqs;

    return-void
.end method

.method private synthetic constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final enqueueWork(Landroid/content/Context;)V
    .locals 0

    invoke-static {p1}, Lcom/ibotta/android/service/pixel/PixelTrackingService;->enqueueWork(Landroid/content/Context;)V

    return-void
.end method
