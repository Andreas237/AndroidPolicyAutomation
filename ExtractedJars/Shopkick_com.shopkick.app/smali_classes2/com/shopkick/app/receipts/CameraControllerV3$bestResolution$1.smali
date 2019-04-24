.class final Lcom/shopkick/app/receipts/CameraControllerV3$bestResolution$1;
.super Lkotlin/jvm/internal/Lambda;
.source "CameraControllerV3.kt"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/shopkick/app/receipts/CameraControllerV3;->bestResolution(Ljava/lang/Iterable;)Lio/fotoapparat/parameter/Resolution;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function1<",
        "Lio/fotoapparat/parameter/Resolution;",
        "Ljava/lang/Float;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    bv = {
        0x1,
        0x0,
        0x3
    }
    d1 = {
        "\u0000\u000c\n\u0000\n\u0002\u0010\u0007\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n\u00a2\u0006\u0002\u0008\u0003"
    }
    d2 = {
        "roundedRatio",
        "",
        "Lio/fotoapparat/parameter/Resolution;",
        "invoke"
    }
    k = 0x3
    mv = {
        0x1,
        0x1,
        0xd
    }
.end annotation


# static fields
.field public static final INSTANCE:Lcom/shopkick/app/receipts/CameraControllerV3$bestResolution$1;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/shopkick/app/receipts/CameraControllerV3$bestResolution$1;

    invoke-direct {v0}, Lcom/shopkick/app/receipts/CameraControllerV3$bestResolution$1;-><init>()V

    sput-object v0, Lcom/shopkick/app/receipts/CameraControllerV3$bestResolution$1;->INSTANCE:Lcom/shopkick/app/receipts/CameraControllerV3$bestResolution$1;

    return-void
.end method

.method constructor <init>()V
    .locals 1

    const/4 v0, 0x1

    invoke-direct {p0, v0}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final invoke(Lio/fotoapparat/parameter/Resolution;)F
    .locals 1
    .param p1    # Lio/fotoapparat/parameter/Resolution;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "receiver$0"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 247
    invoke-virtual {p1}, Lio/fotoapparat/parameter/Resolution;->getAspectRatio()F

    move-result p1

    const/16 v0, 0x64

    int-to-float v0, v0

    mul-float/2addr p1, v0

    invoke-static {p1}, Ljava/lang/Math;->round(F)I

    move-result p1

    int-to-float p1, p1

    const/high16 v0, 0x42c80000    # 100.0f

    div-float/2addr p1, v0

    return p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 21
    check-cast p1, Lio/fotoapparat/parameter/Resolution;

    invoke-virtual {p0, p1}, Lcom/shopkick/app/receipts/CameraControllerV3$bestResolution$1;->invoke(Lio/fotoapparat/parameter/Resolution;)F

    move-result p1

    invoke-static {p1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object p1

    return-object p1
.end method
