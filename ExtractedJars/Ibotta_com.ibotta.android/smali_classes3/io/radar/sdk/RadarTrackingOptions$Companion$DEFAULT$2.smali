.class final Lio/radar/sdk/RadarTrackingOptions$Companion$DEFAULT$2;
.super Lkotlin/jvm/internal/Lambda;
.source "RadarTrackingOptions.kt"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lio/radar/sdk/RadarTrackingOptions;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function0<",
        "Lio/radar/sdk/RadarTrackingOptions;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    bv = {
        0x1,
        0x0,
        0x2
    }
    d1 = {
        "\u0000\u0008\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n\u00a2\u0006\u0002\u0008\u0002"
    }
    d2 = {
        "<anonymous>",
        "Lio/radar/sdk/RadarTrackingOptions;",
        "invoke"
    }
    k = 0x3
    mv = {
        0x1,
        0x1,
        0xb
    }
.end annotation


# static fields
.field public static final INSTANCE:Lio/radar/sdk/RadarTrackingOptions$Companion$DEFAULT$2;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lio/radar/sdk/RadarTrackingOptions$Companion$DEFAULT$2;

    invoke-direct {v0}, Lio/radar/sdk/RadarTrackingOptions$Companion$DEFAULT$2;-><init>()V

    sput-object v0, Lio/radar/sdk/RadarTrackingOptions$Companion$DEFAULT$2;->INSTANCE:Lio/radar/sdk/RadarTrackingOptions$Companion$DEFAULT$2;

    return-void
.end method

.method constructor <init>()V
    .locals 1

    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final invoke()Lio/radar/sdk/RadarTrackingOptions;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 25
    new-instance v0, Lio/radar/sdk/RadarTrackingOptions$Builder;

    invoke-direct {v0}, Lio/radar/sdk/RadarTrackingOptions$Builder;-><init>()V

    invoke-virtual {v0}, Lio/radar/sdk/RadarTrackingOptions$Builder;->build()Lio/radar/sdk/RadarTrackingOptions;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic invoke()Ljava/lang/Object;
    .locals 1

    .line 24
    invoke-virtual {p0}, Lio/radar/sdk/RadarTrackingOptions$Companion$DEFAULT$2;->invoke()Lio/radar/sdk/RadarTrackingOptions;

    move-result-object v0

    return-object v0
.end method
