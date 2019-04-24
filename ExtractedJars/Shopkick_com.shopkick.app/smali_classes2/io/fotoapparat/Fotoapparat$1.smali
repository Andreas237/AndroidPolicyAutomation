.class final Lio/fotoapparat/Fotoapparat$1;
.super Lkotlin/jvm/internal/Lambda;
.source "Fotoapparat.kt"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lio/fotoapparat/Fotoapparat;-><init>(Landroid/content/Context;Lio/fotoapparat/view/CameraRenderer;Lio/fotoapparat/view/FocalPointSelector;Lkotlin/jvm/functions/Function1;Lio/fotoapparat/parameter/ScaleType;Lio/fotoapparat/configuration/CameraConfiguration;Lkotlin/jvm/functions/Function1;Lio/fotoapparat/concurrent/CameraExecutor;Lio/fotoapparat/log/Logger;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function1<",
        "Lio/fotoapparat/exception/camera/CameraException;",
        "Lkotlin/Unit;",
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
        "\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n\u00a2\u0006\u0002\u0008\u0004"
    }
    d2 = {
        "<anonymous>",
        "",
        "it",
        "Lio/fotoapparat/exception/camera/CameraException;",
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
.field public static final INSTANCE:Lio/fotoapparat/Fotoapparat$1;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lio/fotoapparat/Fotoapparat$1;

    invoke-direct {v0}, Lio/fotoapparat/Fotoapparat$1;-><init>()V

    sput-object v0, Lio/fotoapparat/Fotoapparat$1;->INSTANCE:Lio/fotoapparat/Fotoapparat$1;

    return-void
.end method

.method constructor <init>()V
    .locals 1

    const/4 v0, 0x1

    invoke-direct {p0, v0}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 34
    check-cast p1, Lio/fotoapparat/exception/camera/CameraException;

    invoke-virtual {p0, p1}, Lio/fotoapparat/Fotoapparat$1;->invoke(Lio/fotoapparat/exception/camera/CameraException;)V

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method

.method public final invoke(Lio/fotoapparat/exception/camera/CameraException;)V
    .locals 1
    .param p1    # Lio/fotoapparat/exception/camera/CameraException;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    return-void
.end method
