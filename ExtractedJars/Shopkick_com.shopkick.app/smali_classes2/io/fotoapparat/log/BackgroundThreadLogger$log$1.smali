.class final Lio/fotoapparat/log/BackgroundThreadLogger$log$1;
.super Lkotlin/jvm/internal/Lambda;
.source "BackgroundThreadLogger.kt"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lio/fotoapparat/log/BackgroundThreadLogger;->log(Ljava/lang/String;)V
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
.field final synthetic $message:Ljava/lang/String;

.field final synthetic this$0:Lio/fotoapparat/log/BackgroundThreadLogger;


# direct methods
.method constructor <init>(Lio/fotoapparat/log/BackgroundThreadLogger;Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lio/fotoapparat/log/BackgroundThreadLogger$log$1;->this$0:Lio/fotoapparat/log/BackgroundThreadLogger;

    iput-object p2, p0, Lio/fotoapparat/log/BackgroundThreadLogger$log$1;->$message:Ljava/lang/String;

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke()Ljava/lang/Object;
    .locals 1

    .line 8
    invoke-virtual {p0}, Lio/fotoapparat/log/BackgroundThreadLogger$log$1;->invoke()V

    sget-object v0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object v0
.end method

.method public final invoke()V
    .locals 2

    .line 11
    iget-object v0, p0, Lio/fotoapparat/log/BackgroundThreadLogger$log$1;->this$0:Lio/fotoapparat/log/BackgroundThreadLogger;

    invoke-static {v0}, Lio/fotoapparat/log/BackgroundThreadLogger;->access$getLogger$p(Lio/fotoapparat/log/BackgroundThreadLogger;)Lio/fotoapparat/log/Logger;

    move-result-object v0

    iget-object v1, p0, Lio/fotoapparat/log/BackgroundThreadLogger$log$1;->$message:Ljava/lang/String;

    invoke-interface {v0, v1}, Lio/fotoapparat/log/Logger;->log(Ljava/lang/String;)V

    return-void
.end method
