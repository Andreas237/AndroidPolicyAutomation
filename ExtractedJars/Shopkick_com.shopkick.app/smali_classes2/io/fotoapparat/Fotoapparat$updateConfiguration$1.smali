.class final Lio/fotoapparat/Fotoapparat$updateConfiguration$1;
.super Lkotlin/jvm/internal/Lambda;
.source "Fotoapparat.kt"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lio/fotoapparat/Fotoapparat;->updateConfiguration(Lio/fotoapparat/configuration/Configuration;)Ljava/util/concurrent/Future;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function0<",
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
        "\u0000\u0008\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n\u00a2\u0006\u0002\u0008\u0002"
    }
    d2 = {
        "<anonymous>",
        "",
        "invoke"
    }
    k = 0x3
    mv = {
        0x1,
        0x1,
        0xd
    }
.end annotation


# instance fields
.field final synthetic $newConfiguration:Lio/fotoapparat/configuration/Configuration;

.field final synthetic this$0:Lio/fotoapparat/Fotoapparat;


# direct methods
.method constructor <init>(Lio/fotoapparat/Fotoapparat;Lio/fotoapparat/configuration/Configuration;)V
    .locals 0

    iput-object p1, p0, Lio/fotoapparat/Fotoapparat$updateConfiguration$1;->this$0:Lio/fotoapparat/Fotoapparat;

    iput-object p2, p0, Lio/fotoapparat/Fotoapparat$updateConfiguration$1;->$newConfiguration:Lio/fotoapparat/configuration/Configuration;

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke()Ljava/lang/Object;
    .locals 1

    .line 34
    invoke-virtual {p0}, Lio/fotoapparat/Fotoapparat$updateConfiguration$1;->invoke()V

    sget-object v0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object v0
.end method

.method public final invoke()V
    .locals 2

    .line 164
    iget-object v0, p0, Lio/fotoapparat/Fotoapparat$updateConfiguration$1;->this$0:Lio/fotoapparat/Fotoapparat;

    invoke-static {v0}, Lio/fotoapparat/Fotoapparat;->access$getLogger$p(Lio/fotoapparat/Fotoapparat;)Lio/fotoapparat/log/Logger;

    move-result-object v0

    invoke-interface {v0}, Lio/fotoapparat/log/Logger;->recordMethod()V

    .line 166
    iget-object v0, p0, Lio/fotoapparat/Fotoapparat$updateConfiguration$1;->this$0:Lio/fotoapparat/Fotoapparat;

    invoke-static {v0}, Lio/fotoapparat/Fotoapparat;->access$getDevice$p(Lio/fotoapparat/Fotoapparat;)Lio/fotoapparat/hardware/Device;

    move-result-object v0

    iget-object v1, p0, Lio/fotoapparat/Fotoapparat$updateConfiguration$1;->$newConfiguration:Lio/fotoapparat/configuration/Configuration;

    invoke-static {v0, v1}, Lio/fotoapparat/routine/camera/UpdateConfigurationRoutineKt;->updateDeviceConfiguration(Lio/fotoapparat/hardware/Device;Lio/fotoapparat/configuration/Configuration;)V

    return-void
.end method
